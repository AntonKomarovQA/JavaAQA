package listener;

import lombok.SneakyThrows;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;

import java.io.File;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class RetryListener implements TestExecutionExceptionHandler, AfterTestExecutionCallback {
    private static final int MAX_RETRIES = 3;
    private static final Set<String> failedTest = new HashSet<>();
    @Override
    public void afterTestExecution(ExtensionContext context) throws Exception {
        Method method = context.getRequiredTestMethod();
        String testClass = context.getRequiredTestClass().getName();
        String testName = method.getName();
        String testToWrite = String.format("--tests %s.%s*",testClass,testName);
        context.getExecutionException().ifPresent(x->failedTest.add(testToWrite));
    }

    @Override
    public void handleTestExecutionException(ExtensionContext context, Throwable throwable) throws Throwable {
        for (int i = 0; i < MAX_RETRIES; i++) {
            try {
                context.getRequiredTestMethod().invoke(context.getRequiredTestInstance());
                return;
            } catch (Throwable ex){
                throwable = ex.getCause();
            }
        }
        throw  throwable;
    }

    @SneakyThrows
    public static void saveFailedTest(){
        String output = System.getProperty("user.dir")+ "/src/test/resources/FailedTest.txt";
        String result = String.join(" ", failedTest);
        FileUtils.writeStringToFile(new File(output),result);
    }
}
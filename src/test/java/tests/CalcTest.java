package tests;

import calc.CalcSteps;
import io.qameta.allure.Allure;
import io.qameta.allure.Issue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

public class CalcTest {

    @Test
    public void sumTest(){
        CalcSteps calcSteps = new CalcSteps();
        int res = calcSteps.sum(1,-4);
        boolean isOk = calcSteps.isPositive(res);
        Assertions.assertFalse(isOk);
    }

    @Test
    @Issue("Video-5241")
    public void sumStepsTest(){
        int a = 5;
        int b = 4;
        AtomicInteger res = new AtomicInteger();
        Allure.step("Прибавляем "+a+ " к переменной "+b ,step ->{
            res.set(a + b);
        });

        Allure.step("Проверяем что результат " + res.get()+" > 0 ", x->{
            Assertions.assertTrue(res.get()< 0);
        });
    }
}

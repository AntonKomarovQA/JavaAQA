package utilits;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.io.File;

// класс который помогает в работе с Json
public class JsonHelper {
    private static final ObjectMapper mapper = new ObjectMapper();

    //без SneakyThrows
    // преобразует обьектJson из ресурса в обьект JavaClass чтение из файла
    public static <T> T fromJsonFile(String jsonPath, Class<T> out) {
        try {
            return  mapper.readValue(new File(jsonPath), out);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @SneakyThrows
    // преобразует обьектJson из ресурса в обьект JavaClass путь на прямую из джейсона
    public static <T> T fromJson1(String json, Class<T> out) {
        try {
            return  mapper.readValue(json, out);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // преобразует обьект JavaClass в обьектJson
    @SneakyThrows // убирает исключения
    public static String toJson(Object object) {
        return mapper.writeValueAsString(object);
    }
}

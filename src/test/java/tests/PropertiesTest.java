package tests;

import lombok.SneakyThrows;
import models.Setting;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import utilits.Appconfig;
import utilits.JsonHelper;

import java.io.FileInputStream;
import java.util.Properties;

@Tag("Unit")
public class PropertiesTest {
    @Test
    @SneakyThrows
    public void simpleReader(){
        Properties properties = new Properties();
        FileInputStream fs = new FileInputStream("src\\test\\resources\\project.properties"); // указываем файл
        properties.load(fs);

        String url = properties.getProperty("url"); // получение ссылки
        boolean isProd = Boolean.parseBoolean(properties.getProperty("is_production")); // получение значение булин
        int threads = Integer.parseInt((properties.getProperty("tread"))); // получение числа
        System.out.println(url+" "+isProd+" "+threads);
    }

    @Test
    @SneakyThrows
    @Tag("Smoke")
    public void jacksonReaderTest(){
        Properties properties = new Properties();
        FileInputStream fs = new FileInputStream("src\\test\\resources\\project.properties");
        properties.load(fs);

        String json =  JsonHelper.toJson(properties); // создаем Дсон
        System.out.println(json);

        Setting set = JsonHelper.fromJson1(json,Setting.class); // преобразование Джоса
        System.out.println(set.getUrl());
        System.out.println(set.getIsProd());
        System.out.println(set.getTread());
    }

    @Test
    @SneakyThrows
    public void ownewrReadtTest(){
        Appconfig appconfig = ConfigFactory.create(Appconfig.class);
        System.out.println(appconfig.thread());
        System.out.println(appconfig.url());
        System.out.println(appconfig.isProd());

    }
}

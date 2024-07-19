package utilits;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:project.properties") //читаем файл с настройками
public interface Appconfig  extends  Config{
    @Config.Key("url")
    String url();
    @Config.Key("is_production")
    Boolean isProd();
    @Config.Key("tread")
    Integer thread();

}

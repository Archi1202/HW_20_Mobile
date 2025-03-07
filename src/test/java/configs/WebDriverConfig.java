package configs;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties",
        "classpath:android.properties"
})

public interface WebDriverConfig extends Config {
    @Key("browserstack.user")
    String getBrowserstackUser();

    @Key("browserstack.key")
    String getBrowserstackKey();

    @Key("app")
    @DefaultValue("bs://sample.app")
    String getApp();

    @Key("remoteUrl")
    @DefaultValue("https://hub.browserstack.com/wd/hub")
    String getRemoteUrl();

    @Key("device")
    String getDevice();

    @Key("os_version")
    String getOsVersion();
}

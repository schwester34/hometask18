package owner;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:properties/system.properties",
        "classpath:properties/remote.properties"
})

public interface RemoteConfigOwner extends Config {

    @Key("selenoidLogin")
    String selenoidLogin();

    @Key("selenoidPassword")
    String selenoidPassword();

    @Key("remoteUrl")
    String remoteUrl();

    @Key("remoteBrowser")
    String remoteBrowser();

    @Key("remoteBrowserVersion")
    String remoteBrowserVersion();

    @Key("remoteBrowserSize")
    String remoteBrowserSize();
}
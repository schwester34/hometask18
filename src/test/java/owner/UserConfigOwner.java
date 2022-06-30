package owner;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:properties/system.properties",
        "classpath:properties/user.properties"
})

public interface UserConfigOwner extends Config {

    @Key("userLogin")
    String userLogin();

    @Key("userPassword")
    String userPassword();

    @Key("authCookie")
    String authCookie();
}

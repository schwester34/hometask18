package owner;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:properties/system.properties",
        "classpath:properties/links.properties"
})

public interface LinksConfigOwner extends Config {

    @Key("baseUrl")
    String baseUrl();

    @Key("apiRequestUrl")
    String apiRequestUrl();
}

package util;

import org.aeonbits.owner.Config;

import java.util.List;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({ "file:resources/PathProperty.properties" })
public abstract interface PathProperty extends Config {

    @DefaultValue("\\files\\Apartaments")
    String filePathAportaments();
    @DefaultValue("\\files\\Apartaments_output")
    String filePathResult();
}





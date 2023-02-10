package com.myframework.utils;

import com.myframework.enums.BrowserTypes;
import org.aeonbits.owner.Config;


@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:src/main/resources/config.properties"
})
public interface FrameworkConfig extends Config {

    @DefaultValue("CHROME")
    @ConverterClass(BrowserTypeConverter.class)
    BrowserTypes browser();

    Long timeout();

    String screenshotLocation();

    Boolean runTestsInGrid();


}

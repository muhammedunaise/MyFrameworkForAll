package com.myframework.utils;

import com.myframework.enums.BrowserTypes;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

public class BrowserTypeConverter implements Converter<BrowserTypes> {

    @Override
    public BrowserTypes convert(Method method, String browserName) {
        Map<String, BrowserTypes> map = Map.of("CHROME", BrowserTypes.CHROME, "FIREFOX", BrowserTypes.FIREFOX);
        return map.getOrDefault(browserName.toUpperCase(), BrowserTypes.CHROME);
    }
}

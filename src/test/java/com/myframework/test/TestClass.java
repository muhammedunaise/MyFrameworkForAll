package com.myframework.test;

import com.myframework.utils.ConfigFactory;
import com.myframework.utils.FrameworkConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigCache;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {

    @Test
    public void demoTest() {
        System.out.println(ConfigFactory.getConfig().browser());
    }
}

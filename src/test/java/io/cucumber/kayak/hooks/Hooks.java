package io.cucumber.kayak.hooks;

import io.cucumber.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.kayak.utils.Utils;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    Utils utils;
    @BeforeAll
    public void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    @Before(value = "@SDET_Coding_Test")
    public void setup() {
        utils.setupDriver();
    }

    @After(value = "@SDET_Coding_Test")
    public void teardown() {
        utils.teardownDriver();
    }
}

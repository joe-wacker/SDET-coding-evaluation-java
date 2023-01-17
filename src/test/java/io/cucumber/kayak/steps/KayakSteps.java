package io.cucumber.kayak.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.kayak.utils.Utils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class KayakSteps {
    Utils utils;

    @Given("chrome browser has opened")
    public void chrome_browser_has_opened() {
        WebDriverManager.chromedriver().setup();
        utils.setupDriver();
    }

    // This is where your Step Definitions will go
}

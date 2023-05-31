package com.example.tipalti.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
    private static Driver _instance;
    private final ChromeDriver driver;

    private Driver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }

    public static Driver getInstance() {
        if (_instance == null) {
            _instance = new Driver();
        }
        return _instance;
    }

    public ChromeDriver getDriver() {
        return driver;
    }
}

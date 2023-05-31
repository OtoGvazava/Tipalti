package com.example.tipalti;

import com.example.tipalti.pages.KikaPage;
import com.example.tipalti.pages.MainPage;
import com.example.tipalti.utils.Driver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    private static ChromeDriver driver;

    // Declare pages
    protected static MainPage mainPage;
    protected static KikaPage kikaPage;

    @BeforeSuite
    public void beforeSuite() {
        // Setup browser
        driver = Driver.getInstance().getDriver();
        driver.manage().window().maximize();

        // Initialize pages
        mainPage = new MainPage(driver);
        kikaPage = new KikaPage(driver);
    }
}

package com.example.tipalti.pages;

import com.example.tipalti.data.ConfigData;
import io.qameta.allure.Step;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPage extends BasePage<MainPage> {
    public MainPage(ChromeDriver driver) {
        super(driver);
    }


    @Step("Open main page by url")
    public MainPage openByUrl() {
        driver.get(ConfigData.BASE_URL);
        return this;
    }
}

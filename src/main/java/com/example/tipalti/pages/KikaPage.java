package com.example.tipalti.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class KikaPage extends BasePage<KikaPage> {
    public KikaPage(ChromeDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement inputName;
    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement inputEmail;
    @FindBy(xpath = "//*[@id=\"message\"]")
    private WebElement inputMessage;
    @FindBy(xpath = "//*[@id=\"footer\"]/div/section[1]/form/ul/li/input")
    private WebElement buttonSend;

    @Step("Send message")
    public KikaPage sendMessage(String name, String email, String message) {

        scrollToElement(inputName);
        inputName.sendKeys(name);
        inputEmail.sendKeys(email);
        inputMessage.sendKeys(message);
        buttonSend.click();
        return this;
    }
}

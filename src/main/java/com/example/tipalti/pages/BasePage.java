package com.example.tipalti.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class BasePage<T> {
    protected final ChromeDriver driver;
    protected final Actions actions;

    @FindBy(xpath = "/html/body/div/header/div/nav/ul/li/a")
    private WebElement buttonMenu;
    @FindBy(xpath = "/html/body/nav/div/ul/li")
    private List<WebElement> listOfMenus;

    public BasePage(ChromeDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public T scrollToElement(WebElement element) {
        this.driver.executeScript("arguments[0].scrollIntoView(true);", element);
        return (T) this;
    }

    @Step("Click on main menu")
    public T clickMenu() {
        buttonMenu.click();
        return (T) this;
    }

    @Step("Check menu option")
    public T checkMenuOption(String menuName) {
        List<String> list = listOfMenus.stream().map(WebElement::getText).toList();
        Assert.assertTrue(list.contains(menuName), "Menu is not available!");
        return (T) this;
    }

    @Step("Click menu item")
    public T clickMenuItem(String menuName) {
        listOfMenus.stream().filter(item -> item.getText().equals(menuName)).toList().get(0).click();
        return (T) this;
    }
}

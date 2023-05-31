package com.example.tipalti;

import com.example.tipalti.data.MenuItems;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KikaTest extends BaseTest {

    @BeforeMethod
    public void navigateMainPage() {
        mainPage.openByUrl();
    }

    @Test
    public void navigateToKikaAndSendMessage() {
        String Kika = MenuItems.KIKA.getName();
        String name = "Oto";
        String email = "gvazava911@gmail.com";
        String message = "Kika is good dog!";
        mainPage.openByUrl()
                .clickMenu()
                .checkMenuOption(Kika)
                .clickMenuItem(Kika);
        kikaPage.sendMessage(name, email, message);
    }
}
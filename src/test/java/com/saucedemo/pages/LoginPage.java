package com.saucedemo.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    By username = By.id("user-name");
    By password = By.id("password");
    By loginButton = By.id("login-button");

    public void openPage() {
        openUrl("https://www.saucedemo.com/");
    }

    public void login(String user, String pass) {
        $(username).type(user);
        $(password).type(pass);
        $(loginButton).click();
    }
}

package com.saucedemo.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CheckoutPage extends PageObject {

    By checkoutBtn = By.id("checkout");
    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By postalCode = By.id("postal-code");
    By continueBtn = By.id("continue");
    By finishBtn = By.id("finish");
    By confirmationMessage = By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']");

    public void completeCheckoutForm() {
        $(checkoutBtn).click();
        $(firstName).type("Hallen");
        $(lastName).type("Lluglla");
        $(postalCode).type("17001");
        $(continueBtn).click();
        $(finishBtn).click();
    }

    public boolean isOrderConfirmed() {
        return $(confirmationMessage).isVisible();
    }
}

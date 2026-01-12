package com.saucedemo.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductsPage extends PageObject {

    By backpack = By.id("add-to-cart-sauce-labs-backpack");
    By bikeLight = By.id("add-to-cart-sauce-labs-bike-light");
    By cart = By.className("shopping_cart_link");

    public void addTwoProductsAndGoToCart() {
        $(backpack).click();
        $(bikeLight).click();
        $(cart).click();
    }
}

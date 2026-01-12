package com.saucedemo.tests;

import com.saucedemo.pages.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

@RunWith(SerenityRunner.class)
public class PurchaseE2ETest {

    LoginPage loginPage;
    ProductsPage productsPage;
    CheckoutPage checkoutPage;

    @Test
    public void user_should_complete_purchase_successfully() {

        loginPage.openPage();
        loginPage.login("standard_user", "secret_sauce");

        productsPage.addTwoProductsAndGoToCart();

        checkoutPage.completeCheckoutForm();

        assertTrue(checkoutPage.isOrderConfirmed());
    }
}

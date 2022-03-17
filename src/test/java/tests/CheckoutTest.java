package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;

public class CheckoutTest extends BaseOptionTest {

    @Test
    public void checkOutTwoItems() {
        loginPage.registration();
        productsPage.chooseThreeItemAndChangeOnTwo();
        checkOutPages.userInfo();
        checkOutPages.checkTotalSum();
    }
}




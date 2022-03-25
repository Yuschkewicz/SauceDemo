package tests;

import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {

    @Test(description = "Проверка функциональности покупки товара", retryAnalyzer = Retry.class)
    public void checkOutTwoItems() {
        loginPage.registration();
        productsPage.chooseThreeItemAndChangeOnTwo();
        checkOutPages.userInfo();
        checkOutPages.checkTotalSum();
    }


}




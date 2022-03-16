package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.CartPage;

import static org.testng.Assert.assertEquals;

public class CheckoutTest extends BaseOptionTest{

@Test
public void checkOutTwoItems(){
    loginPage.open();
    loginPage.login("standard_user","secret_sauce");
    productsPage.chooseThreeItemAndChangeOnTwo();
    productsPage.goToTheCart();
    loginPage.infoUser("Yan","Glebovich","223054");
    productsPage.checkTotalSum();


}



    }



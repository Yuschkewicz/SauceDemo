package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CartTest extends BaseTest {
    @Test(description = "Проверка на добавление/удаление товара в/из корзины")
    public void productShouldBeAddedIntoCart() {
        loginPage.registration();
        productsPage.chooseThreeItemAndChangeOnTwo();
        String valueSauce = driver.findElement(By.className("shopping_cart_badge")).getText();
        assertEquals(valueSauce,"2");


    }
}

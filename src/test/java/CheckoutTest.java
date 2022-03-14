import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CheckoutTest extends BaseOptionTest{

    @Test
    public void sauceTest(){
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).submit();
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
        driver.findElement(By.id("shopping_cart_container")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Aloha");
        driver.findElement(By.id("last-name")).sendKeys("Aloha");
        driver.findElement(By.id("postal-code")).sendKeys("223054");
        driver.findElement(By.id("continue")).click();
        String totalPrice = driver.findElement(By.cssSelector(".summary_total_label")).getText();
        assertEquals(totalPrice,"Total: $95.01");
        driver.findElement(By.id("finish")).click();


    }
}


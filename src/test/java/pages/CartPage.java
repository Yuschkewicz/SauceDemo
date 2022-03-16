package pages;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.BaseOptionTest;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;

public class CartPage extends BasePage {


    public CartPage(WebDriver driver) {
        super(driver);
    }
    public void open() {
        driver.get(baseUrl+"cart.html");
    }

    public void beginCheckout(){
        driver.findElement(By.id("checkout")).click();

    }
}


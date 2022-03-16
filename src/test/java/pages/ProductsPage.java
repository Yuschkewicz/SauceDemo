package pages;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.BaseOptionTest;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;

public class ProductsPage extends BasePage {

    String productLocator = "//div[text()='%s']/ancestor::div[@class='inventory_item']//button[text()='Add to cart']";
    String productLocatorDelete = "//div[text()='%s']/ancestor::div[@class='inventory_item']//button[text()='Remove']";

    By sort = By.cssSelector(".product_sort_container");

    public ProductsPage(WebDriver driver){
        super(driver);
    }
    public void open(){
        driver.get(baseUrl+"inventory.html");
    }

    public void addToCart(String product) {
        driver.findElement(By.xpath(String.format(productLocator, product))).click();
    }
    public void deleteToCart(String product){
        driver.findElement(By.xpath(String.format(productLocatorDelete, product))).click();
        String valueSauce = driver.findElement(By.className("shopping_cart_badge")).getText();
        assertEquals(valueSauce,"2");
    }

    public void chooseThreeItemAndChangeOnTwo(){
        addToCart("Sauce Labs Backpack");
        addToCart("Sauce Labs Bike Light");
        addToCart("Sauce Labs Bolt T-Shirt");
        deleteToCart("Sauce Labs Bolt T-Shirt");

    }
    public void goToTheCart() {
        driver.findElement(By.id("shopping_cart_container")).click();
        String name = driver.findElement(By.id("checkout")).getText();
        assertEquals(name,"CHECKOUT");
        driver.findElement(By.id("checkout")).click();

        }
    public void checkTotalSum(){
        String checkTotalSum = driver.findElement(By.cssSelector(".summary_total_label")).getText();
        assertEquals(checkTotalSum,"Total: $43.18");
        driver.findElement(By.id("finish")).click();
        String linktext2 = driver.findElement(By.className("complete-header")).getText();
        System.out.println(linktext2);
        assertEquals(linktext2,"THANK YOU FOR YOUR ORDER");
        driver.findElement(By.id("back-to-products")).click();
    }

    public void sort(String sorting) {
        WebElement sortingElement = driver.findElement(sort);
        new Select(sortingElement).selectByVisibleText(sorting);
    }
}

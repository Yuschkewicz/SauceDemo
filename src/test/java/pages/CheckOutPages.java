package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class CheckOutPages extends BasePage{

    public static final By USER_LASTNAME=By.id("last-name");
    public static final By USER_FIRSTNAME=By.id("first-name");
    public static final By USER_ZIPCODE = By.id("postal-code");
    public static final By ERROR_MESSAGE2=By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[1]/div[4]");


    public CheckOutPages(WebDriver driver) {
        super(driver);
    }

    public void openUserInfo(){
        driver.get(baseUrl+"checkout-step-one.html");

}

    public void infoUser(String firstName,String lastName,String zipCode){
        driver.findElement(USER_FIRSTNAME).sendKeys(firstName);
        driver.findElement(USER_LASTNAME).sendKeys(lastName);
        driver.findElement(USER_ZIPCODE).sendKeys(zipCode);
        driver.findElement(By.cssSelector("[value=Continue")).click();
    }

    public void userInfo(){
        infoUser("Yan","Glebovich","223054");
    }

    public String getError2(){
        return driver.findElement(ERROR_MESSAGE2).getText();
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
}

package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import java.io.File;

import static org.testng.Assert.assertEquals;

public class LoginPage extends BasePage {

    public static final By USER_INPUT = By.id("user-name");
    public static final By PASSWORD_INPUT = By.id("password");
    public static final By LOGIN_BUTTON = By.id("login-button");
    public static final By ERROR_MESSAGE = By.cssSelector("[data-test=error]");
    public static final By USER_LASTNAME=By.id("last-name");
    public static final By USER_FIRSTNAME=By.id("first-name");
    public static final By USER_ZIPCODE = By.id("postal-code");
    public static final By ERROR_MESSAGE2=By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[1]/div[4]");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(baseUrl);
    }
    public void openUserInfo(){
        driver.get(baseUrl+"checkout-step-one.html");
    }

    public void login(String user, String password) {
        driver.findElement(USER_INPUT).sendKeys(user);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).submit();
    }
    public void infoUser(String firstName,String lastName,String zipCode){
        driver.findElement(USER_FIRSTNAME).sendKeys(firstName);
        driver.findElement(USER_LASTNAME).sendKeys(lastName);
        driver.findElement(USER_ZIPCODE).sendKeys(zipCode);
        driver.findElement(By.cssSelector("[value=Continue")).click();
    }

    public String getError() {
        return driver.findElement(ERROR_MESSAGE).getText();
    }
    public String getError2(){
        return driver.findElement(ERROR_MESSAGE2).getText();
    }


}






package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class LoginPage extends BasePage {

    public static final By USER_INPUT = By.id("user-name");
    public static final By PASSWORD_INPUT = By.id("password");
    public static final By LOGIN_BUTTON = By.id("login-button");
    public static final By ERROR_MESSAGE = By.cssSelector("[data-test=error]");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step("Opening login page")
    public void open() {
        driver.get(baseUrl);
        wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_BUTTON));
    }


    @Step("Log in by {user} and {password}")
    public void login(String user, String password) {
        driver.findElement(USER_INPUT).sendKeys(user);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).submit();
    }

    @Step("Registration and stark working ")
    public void registration() {
        open();
        login("performance_glitch_user", "secret_sauce");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @Step("Get Error message")
    public String getError() {
        return driver.findElement(ERROR_MESSAGE).getText();
    }


    public void openMainPage(){

        driver.get(startUrl);
        PageFactory.initElements(driver, this);
    }
    public void login2(String user,String password){
        driver.findElement(By.id("IDToken1")).sendKeys(user);
        driver.findElement(By.id("IDToken2")).sendKeys(password);
        driver.findElement(By.cssSelector("[name='Login.Submit']")).click();
        waitForElement(By.id("agreebtn"));
        driver.findElement(By.id("agreebtn")).click();
        waitForElement(By.xpath("//div[@data-bind=\"template: { name: 'template-menuitem', foreach: visibleItems }\"]" +
                "//div[@class='menuitem-text active'][contains(text(),'Цвет')]"));
    }

    public void searchCar(){
        driver.findElement(By.cssSelector("span[id='select2-6psw-container'] span:nth-child(1)")).click();
        driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("AIXAM");
        driver.findElement(By.xpath("//button[@id='powerSearchKeys']")).click();
        driver.findElement(By.xpath("//body[1]/div[5]/div[2]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[19]/td[11]/div[1]/button[3]")).click();
        waitForElement(By.xpath("//h4[contains(text(),'AIXAM')]"));
        driver.findElement(By.xpath("//tr[@data-bind=\"click: setActive, css: { 'active': $parent.SelectedFormulaId() " +
                "== Id }\"]//td[@data-bind='visible: !$parent.HidePanelNumber(), text: PanelNo'][normalize-space()='J5158']")).click();
        driver.findElement(By.xpath("//input[@placeholder='1']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='1']")).sendKeys("0.5");
        driver.findElement(By.xpath("//button[@class='btn readyForUsebtn']")).click();
        driver.findElement(By.cssSelector("div[class='col-xs-12 col-md-2'] div:nth-child(3) button:nth-child(1)")).click();
        driver.findElement(By.cssSelector("div[class='col-xs-12 text-right'] button:nth-child(1)")).click();
    }




}






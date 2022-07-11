package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    String baseUrl ="https://www.saucedemo.com/";
    String startUrl = "http://auth.axaltacs.com/sso/SSORedirect/metaAlias/Axalta/idp?SAMLRequest=fZJBT%2bMwEIX%2fSuR76yS0tFhtJTdpRSVYoqZw4Da4A7WU2MHjQPffr5NCAWnFbTR%2bfv7mjWcEddUI2fqD2eJri%2bSjY10ZEv3BnLXOCAukSRiokYRXopS3NyIdxqJx1ltlKxZt8jmT2egqy%2fNVlk6yZTpexjIZTeUona7W4%2bVKjidJKtcyYdEDOtLWzFnwCFeJWtwY8mB8aMVpOogngyTZxVfiYipGl4%2bdpgAi%2fYZz9gwVIYvW1insqc%2btPLBrA763PnjfCM4hKIZwhMqDoqGytZjGnMjysrzb4l47VJ7X6EFWGojLXsn1vmFR8THcUpu9Ni%2b%2fJ%2fF0EpG43u2KQXFX7lgkidB1NJk11NboSnRvWuH99ubMpw7O1vCOT0PVFccOkXfJV%2fZFG7aYdbXoI3Lf9vI7DHw%2bzBb%2f85%2fxb6anFxrxJ7hs8sJWWv3twq0hLCPMEEDeM4fgv6Lni5PDz1%2bz%2bAc%3d&RelayState=http%3a%2f%2fchromaweb.cromax.com";
    public BasePage(WebDriver driver){
        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    boolean waitForElement(By locator) {

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (TimeoutException ex) {
            return false;
        }
        return true;
    }
}

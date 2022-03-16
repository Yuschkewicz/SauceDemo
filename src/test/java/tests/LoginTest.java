package tests;

import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseOptionTest {

    @Test
    public void passwordShouldBeRequired() {

        loginPage.open();
        loginPage.login("test","");
        assertEquals(loginPage.getError(), "Epic sadface: Password is required");
    }

    @Test
    public void userNameShouldBeRequired() {
        loginPage.open();
        loginPage.login("", "test");
        assertEquals(loginPage.getError(), "Epic sadface: Username is required");
    }
}

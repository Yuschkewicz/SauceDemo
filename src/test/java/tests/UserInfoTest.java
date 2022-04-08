package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class UserInfoTest extends BaseTest {


    @DataProvider(name = "Negative tests for filling in data at checkout")
    public Object[][] formData() {
        return new Object[][]{
                {"", "test", "11111", "Error: First Name is required"},
                {"test", "", "11111", "Error: Last Name is required"},
                {"test", "test", "", "Error: Postal Code is required"}
        };
    }

    @Test(dataProvider = "Negative tests for filling in data at checkout")

    public void allFieldShouldBeRequired(String firstName, String lastName, String postCode, String error) {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        checkOutPages.fillingUserDataForPayment();
        checkOutPages.infoUser(firstName, lastName, postCode);
        assertEquals(checkOutPages.getError2(), error);
    }

    @Test(description = "Last name should be required")
    public void lastNameShouldBeRequired() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        checkOutPages.fillingUserDataForPayment();
        checkOutPages.infoUser("test", "", "11111");
        assertEquals(checkOutPages.getError2(), "Error: Last Name is required");

    }

    @Test(description = "First name should be required")
    public void firstNameShouldBeRequired() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        checkOutPages.fillingUserDataForPayment();
        checkOutPages.infoUser("", "test", "11111");
        assertEquals(checkOutPages.getError2(), "Error: First Name is required");
    }

    @Test(description = "Zip code should be required")
    public void zipCodeShouldByRequired() {

        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        checkOutPages.fillingUserDataForPayment();
        checkOutPages.infoUser("test", "test", "");
        assertEquals(checkOutPages.getError2(), "Error: Postal Code is required");

    }
}

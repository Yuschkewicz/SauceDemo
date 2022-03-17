package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class UserInfoTest extends BaseOptionTest{

@Test
    public void firstNameShouldBeRequired() {
    loginPage.open();
    loginPage.login("standard_user", "secret_sauce");
    checkOutPages.openUserInfo();
    checkOutPages.infoUser("", "test", "11111");
    assertEquals(checkOutPages.getError2(), "Error: First Name is required");
}

@Test
    public void lastNameShouldByRequired(){
    loginPage.open();
    loginPage.login("standard_user", "secret_sauce");
    checkOutPages.openUserInfo();
    checkOutPages.infoUser("test", "", "11111");
    assertEquals(checkOutPages.getError2(),"Error: Last Name is required");

}
@Test
    public void zipCodeShouldByRequired(){

    loginPage.open();
    loginPage.login("standard_user", "secret_sauce");
    checkOutPages.openUserInfo();
    checkOutPages.infoUser("test", "test", "");
    assertEquals(checkOutPages.getError2(),"Error: Postal Code is required");

}
}

package tests;

import org.testng.annotations.Test;

public class SortTest extends BaseTest {
    @Test(description = "Sorting alphabetically / ascending and descending prices")
    public void sorting() {

        loginPage.registration();
        productsPage.sort();
    }


}

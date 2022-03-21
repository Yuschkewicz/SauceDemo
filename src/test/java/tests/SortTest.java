package tests;

import org.testng.annotations.Test;

public class SortTest extends BaseOptionTest{
    @Test
    public void sorting(){

        loginPage.registration();
        productsPage.sort();
    }
}

package tests;

import org.testng.annotations.Test;

public class SortTest extends BaseTest {
    @Test(description ="Проверка на сортировку по имени/цене" )
    public void sorting(){

        loginPage.registration();
        productsPage.sort();
    }
}

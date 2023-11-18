package com.demo.tests;

import com.demo.pages.HomePage;
import org.testng.annotations.*;

public class DemoTests extends TestBase {

    HomePage homePage = new HomePage();

    @Test(groups = {"smoke", "regression", "sanity", "web"}, priority = 2)
    public void test1() {
        homePage.launch();
        System.out.println("Test -1");
    }

    @Test(groups = {"smoke"}, priority = 1)
    public void test2() {
        System.out.println("Test -2");
    }

    @Test(enabled = false, groups = {"smoke"}, dependsOnMethods = {"test2"}, priority = 1)
    public void test3() {
        System.out.println("Test -3");
    }

    //skip a test
    @Test (enabled = false) //ignores this test
    public void testSkipped(){
        System.out.println("This test skipped");
    }

    //Parameterization
    @Parameters({"browser"})
    @Test
    public void parameterTest(String browser){
        System.out.println(browser);
    }

    //Data provider

    @Test (dataProvider = "data-provider")
    public void dpTest(String val){
        System.out.println(val);}

    @DataProvider(name = "data-provider")
    public Object[][] dataProvider(){
    return new Object[][] {{"hello"}, {"there"},{"this is a demo project"}};}


    //Exception handling
    @Test (expectedExceptions = {ArithmeticException.class})
    public void testException(){
        System.out.println("Test - Exception");
        System.out.println(2/0);
    }

//    junit: @DisplayName("Login_Test"), testng doesn't allow a custom method name

}

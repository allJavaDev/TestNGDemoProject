package com.demo.tests;

import org.testng.annotations.*;

public class TestBase {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before suite");
    }

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("Before groups");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("set up");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("tear down");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }

    @AfterGroups
    public void afterGroups() {
        System.out.println("After groups");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After test");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite");
    }
}

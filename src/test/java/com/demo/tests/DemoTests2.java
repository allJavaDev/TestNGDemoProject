package com.demo.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTests2 extends TestBase{

    @Test
    public void test4(){
        System.out.println("Test -4");
    }

    @Test
    public void test5(){
        System.out.println("Test -5");
    }

    @Test
    public void test6(){System.out.println("Test -6");}

}

package com.jbk.testng1;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class TestNgexample {
	@Test
    public void arithmaticTest_1() { 
        System.out.println("arithmaticTest_1 test case");
    }

    @Test
    public void arithmaticTest_2() { 
        System.out.println("arithmaticTest_2 test case");
    }

    @BeforeMethod
    public void beforeMethod() { 
        System.out.println("beforeMethod");
    }

    @AfterMethod
    public void afterMethod() { 
        System.out.println("afterMethod");
    }

    @BeforeClass
    public void beforeClass() { 
        System.out.println("beforeClass");
    }

    @AfterClass
    public void afterClass() { 
        System.out.println("afterClass");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("beforeTest");
    }

    @AfterTest
    public void afterTest() { 
        System.out.println("afterTest");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite");
    }

    @AfterSuite
    public void afterSuite() { 
        System.out.println("afterSuite");
    }
}

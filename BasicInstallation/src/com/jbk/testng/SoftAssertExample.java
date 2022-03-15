package com.jbk.testng;

import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
	    
	    @Test
	    public void jbkTestCase_One() { 
	    	SoftAssert softAssert1 = new SoftAssert();
	    	System.out.println(1); 
	        softAssert1.assertEquals(2,3); // fail 
	        System.out.println(2); 
	        softAssert1.assertEquals(4, 3); // fail 
	        System.out.println(3); 
	        softAssert1.assertEquals(5, 5); // pass 
	        System.out.println(4); 
	        softAssert1.assertAll();
	   }
	    @Test
	    public void jbkTestCase_Two() { 
	        SoftAssert softAssert2= new SoftAssert();
	    	System.out.println(11); 
	        softAssert2.assertEquals(22, 33); // fail 
	        System.out.println(22); 
	        softAssert2.assertEquals(33, 44); // fail 
	        System.out.println(33); 
	        softAssert2.assertEquals(22, 22); // fail 
	        System.out.println(44); 
	        softAssert2.assertAll();
	    }

}

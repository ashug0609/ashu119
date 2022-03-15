package com.jbk.DataProviderDemo;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class DPdemo {
  @Test(dataProvider = "dp")
  public void LoginInwithDP(String uname, String pwd,String exmsg) throws Exception {
	  FileInputStream fis = new FileInputStream("abcd.properties");
		 Properties properties = new Properties();
		 properties.load(fis);
		 String val=properties.getProperty("url");
		 System.out.println("val>>"+val);
		 System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		// driver.get("file:///D:/ASHUDLOADS/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.get(val);
		 Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@id='form']/div[3]/div/button")).click();
		WebElement ele=driver.findElement(By.id("email_error"));
		String amsg=ele.getText();
		Assert.assertEquals(amsg, exmsg);
		driver.close();
		
 
  
  }
  

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "", "","Please enter email." },
      new Object[] { "@34347@", "" ,"Please enter valid email."},
    };
  }
}

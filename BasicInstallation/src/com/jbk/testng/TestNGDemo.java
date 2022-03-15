package com.jbk.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class TestNGDemo {
	
	@Test
	public void Customerlogin() {
		
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///D:/ASHUDLOADS/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id='form']/div[3]/div/button")).click();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "hello");
		driver.close();
	}
	/*public void Customerlogout() {
		
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///D:/ASHUDLOADS/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id='form']/div[3]/div/button")).click();
		driver.findElement(By.linkText("LOGOUT")).click();
		WebElement str=driver.findElement(By.xpath("//div[@class='login-box']/div[2]/p[2]"));
		String Expected=str.getText();
		System.out.println(Expected);
		Assert.assertEquals(Expected, "Logout successfully");
		
	}*/
	@Test
	public void CustomerDashboard() {
		
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///D:/ASHUDLOADS/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id='form']/div[3]/div/button")).click();
		WebElement str =driver.findElement(By.xpath("//*[@class='content-header']/h1"));
		String exe=str.getText();
		
		System.out.println("expected is"+exe);
		Assert.assertEquals(exe,"Dashboard Courses Offered");

	}
	@Test
	public void LogoValidation() {
		
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///D:/ASHUDLOADS/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id='form']/div[3]/div/button")).click();
		WebElement str =driver.findElement(By.xpath("//*[@class='logo-lg']"));
		String exe=str.getText();
		
		System.out.println("expected is"+exe);
		Assert.assertEquals(exe,"Java By Kiran");

	}
	@Test
	public void Validation() {
		
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///D:/ASHUDLOADS/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id='form']/div[3]/div/button")).click();
		WebElement str =driver.findElement(By.xpath("//*[@class='header']"));
		String exe=str.getText();
		
		System.out.println("expected is"+exe);
		Assert.assertEquals(exe,"MAIN NAVIGATION");

	}
	
	
}
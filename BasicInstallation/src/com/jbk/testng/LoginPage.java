package com.jbk.testng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPage {
	
	WebDriver driver=null;
	@BeforeClass
	public void DriverIntialise() {
		
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("file:///D:/ASHUDLOADS/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		System.out.println("i am in beforeclass");
	}
	
	@Test
	public void Customerlogin() {
		System.out.println("i am n customerlogin");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id='form']/div[3]/div/button")).click();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "hello");
		driver.close();
	}
	
	
	@Test
	public void LogoDisplayed(){
		System.out.println("I am in logodisplayed");
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		//driver.get("file:///D:/ASHUDLOADS/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		WebElement element=driver.findElement(By.xpath("//*[@class='login-logo']/a/b"));
		String str=element.getText();
		Assert.assertEquals(str,"Java By Kiran");
		driver.close();
	}
	
	@Test
	public void EnterIncorrectEmail() throws InterruptedException {
		System.out.println("i am in incorrectemail");
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///D:/ASHUDLOADS/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmai");
		driver.findElement(By.id("password")).sendKeys("1236");
		driver.findElement(By.xpath("//*[@id='form']/div[3]/div/button")).click();
		Thread.sleep(5000);
		WebElement ele=driver.findElement(By.id("email_error"));
	 String str=ele.getText();
	 Assert.assertEquals(str,"Please enter email as kiran@gmail.com");
	 driver.close();	
	}
	
	@Test
	public void EnterIncorrectPassword(){
		System.out.println("i am in incorrect password");
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///D:/ASHUDLOADS/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmai");
		driver.findElement(By.id("password")).sendKeys("1236");
		driver.findElement(By.xpath("//*[@id='form']/div[3]/div/button")).click();
		WebElement element=driver.findElement(By.id("password_error"));
		String strtext=element.getText();
		Assert.assertEquals(strtext,"Please enter password 123456");
		driver.close();
		}
	
	@Test
	public void RegisterUser() {
		System.out.println("i am in register user");
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///D:/ASHUDLOADS/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.partialLinkText("Register")).click();
		Assert.assertEquals(driver.findElement(By.partialLinkText("I already")).isDisplayed(), true);
		driver.close();		
		
	}
	
	
}
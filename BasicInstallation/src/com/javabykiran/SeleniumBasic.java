package com.javabykiran;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumBasic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///D:/ASHUDLOADS/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id='form']/div[3]/div/button")).click();
		driver.findElement(By.linkText("Users")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("LOGOUT")).click();
		WebElement str=driver.findElement(By.xpath("//div[@class='login-box']/div[2]/p[2]"));
		String Expected=str.getText();
		String Str1="Logout successfully";
		if (Str1==Expected)
		{
			System.out.println("LOGOUT HAPPENED");
			
		}
		else
		{
			System.out.println("logout faield");
		}
	}
	
}

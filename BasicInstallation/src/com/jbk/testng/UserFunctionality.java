package com.jbk.testng;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserFunctionality {

	
	@Test
	public void AddUser() {
		
		System.out.println("i am n customerlogin");
		
		System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/ASHUDLOADS/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id='form']/div[3]/div/button")).click();
		driver.findElement(By.partialLinkText("Users")).click();
		driver.findElement(By.xpath("//a[@href='add_user.html']/button")).click();
		driver.findElement(By.id("username")).sendKeys("ashu gupta");
		driver.findElement(By.id("mobile")).sendKeys("7767");
		driver.findElement(By.id("email")).sendKeys("ashug@gmail.com");
		driver.findElement(By.id("course")).sendKeys("java");
		driver.findElement(By.id("Female")).click();
		Select sel=new Select(driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select")));
		sel.selectByIndex(1);
		driver.findElement(By.id("password")).sendKeys("12234");
		//driver.findElement(By.xpath("//*[@id='mobile'][2]")).sendKeys("7767");
		driver.findElement(By.xpath("//*[@id='mobile' and @placeholder='FriendMobile']")).sendKeys("12354");
		driver.findElement(By.id("submit")).click();
		
		String message=driver.switchTo().alert().getText();
		Assert.assertEquals(message, "User Added Successfully. You can not see added user.");
		driver.switchTo().alert().accept();
	
	}
	
	//@Test
	/*public void CheckDashboard() {
		
		System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/ASHUDLOADS/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id='form']/div[3]/div/button")).click();
		List<WebElement> al= driver.findElements(By.xpath("//li/a/span"));
		System.out.println("size of list"+al.size());
		ArrayList<String> l= new ArrayList<String>();
		for (WebElement i:al) {
			String s=i.getText();
			l.add(s);
		}
		
		ArrayList<String> li= new ArrayList<String>();
		li.add("Dashboard");
		li.add("Users");
		li.add("Operators");
		li.add("Useful Links");
		li.add("Downloads");
		li.add("Logout");
		
		for (int i=0;i<li.size();i++) {
			Assert.assertEquals(l.get(i), li.get(i));
			
		}
	}*/
	
	@Test
	public void CheckCourses(){
		
		System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/ASHUDLOADS/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id='form']/div[3]/div/button")).click();
		List<WebElement> al= driver.findElements(By.xpath("//*[@class='inner']/h3"));
		System.out.println("size of list"+al.size());
		ArrayList<String> l= new ArrayList<String>();
		for (WebElement i:al) {
			String s=i.getText();
			l.add(s);
		}
		
		ArrayList<String> li= new ArrayList<String>();
		li.add("Selenium");
		li.add("Java / J2EE");
		li.add("Python");
		li.add("Php");

		Assert.assertEquals(l,li);
	}
	@Test
	public void CheckCourseLink() {
		
		System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/ASHUDLOADS/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id='form']/div[3]/div/button")).click();
		List <WebElement> ele=driver.findElements(By.partialLinkText("More"));
		String parent = driver.getWindowHandle();
		for (WebElement i:ele) {
			
			i.click();
			Set <String> windowhan=driver.getWindowHandles();
			
			Assert.assertEquals(windowhan.size(),2);
			System.out.println("size of set is"+windowhan.size());
			Iterator<String> itr=windowhan.iterator();
			while(itr.hasNext()) {
				String child=itr.next();
				if(!parent.equals(child)) {
				driver.switchTo().window(child);
				driver.close();
				}
			}
			driver.switchTo().window(parent);
			
		}
	}
	
	
	
}

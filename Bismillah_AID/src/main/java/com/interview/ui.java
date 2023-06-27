package com.interview;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.*;

public class ui {
	
	public WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
		System.setProperty("webchrome.chrome.driver", "/Users/preetheldhose/driver/chrome/chromedriver_mac64/chromedrver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
//	@Test
//	public void actualTest() {
//		System.out.println("Test");
//		driver.get("https://accounts.google.com/signin");
//		WebElement l = driver.findElement(By.name("identifier"));
//		l.sendKeys("abc@gmail.com");
//		WebElement b = driver.findElement(By.className("VfPpkd-LgbsSe"));
//		b.click();
//		//identify password
//		WebElement p = driver.findElement(By.name("password"));
//		p.sendKeys("123456");
//		b.click();
//
//	}
	
//	@Test
//	public void actualTestA() throws AWTException {
//		driver.get("http;//www.google.com");
//		WebElement element1 = driver.findElement(By.name("q"));
//		element1.sendKeys("software testing help");
//        element1.sendKeys(Keys.ENTER);
//        String a = Keys.chord(Keys.CONTROL,Keys.RETURN);
//        driver.findElement(By.partialLinkText("Software Testing Help - A Must Visit Software Testing Portal")).sendKeys(a);
//        Robot robot = new Robot(); // instantiated robot class
//        robot.keyPress(KeyEvent.VK_CONTROL); // with robot class you can easily achieve anything if you know the shortcut keys
//        robot.keyPress(KeyEvent.VK_2); // here, we have just pressed ctrl+2
//        robot.keyRelease(KeyEvent.VK_CONTROL); // once we press and release ctrl+2, it will go to the second tab.
//        robot.keyRelease(KeyEvent.VK_2); //if you again want to go back to first tab press and release vk_1
//        }
	
	@Test
	public void actualTest() {
		driver.get("http://demo.guru99.com/test/ajax.html");
		List<WebElement> elements = driver.findElements(By.name("name"));
		System.out.println("No of elements :  " + elements.size());
		
		for(int i = 0; i < elements.size(); i++) {
			System.out.println("Radio button text : " + elements.get(i).getAttribute("value"));
		}
	}

	
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
		driver.close();
		driver.quit();
	}

}

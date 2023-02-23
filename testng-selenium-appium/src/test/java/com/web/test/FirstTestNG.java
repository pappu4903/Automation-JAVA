package com.web.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestNG {

	WebDriver driver;
	ChromeOptions chromeOptions;

	@BeforeTest
	public void setUp() {
		chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();

	}

//	@Test(priority = 1)
//
//	public void googleSearch() {
//		// Navigate to the demoqa website
//		driver.get("https://www.google.com");
//
//		WebElement div = driver.findElement(By.xpath("//*[@name='q']"));
//
//		div.sendKeys("Browserstack");
//		div.sendKeys(Keys.ENTER);
//	}

	@Test(priority = 1)
	public void checkBox() {
		//http://the-internet.herokuapp.com/"
		String url= System.getProperty("url");
		driver.get(url);

		driver.findElement(By.xpath("//a[text()='Checkboxes']")).click();

		driver.findElement(By.xpath("(//form[@id='checkboxes']//following::input)[1]")).click();

	}

	@AfterTest

	public void closeDriver() {
		driver.quit();
	}

}

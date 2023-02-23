package com.web.test;
import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);
		
		// Navigate to the demoqa website
		driver.get("https://www.google.com");
		
		WebElement div= driver.findElement(By.xpath("//*[@name='q']"));
		
		div.sendKeys("Browserstack");
		div.sendKeys(Keys.ENTER);
		
		
		driver.quit();
		
		
		
		
		

	}

}

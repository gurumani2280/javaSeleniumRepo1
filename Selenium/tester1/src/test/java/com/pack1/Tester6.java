package com.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester6 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.google.com/");
		Thread.sleep(4000);
		WebElement googleSearchBox= driver.findElement(By.name("q"));
		googleSearchBox.sendKeys("selenium", Keys.ENTER);
		Thread.sleep(4000);
		
		driver.quit();
	}

}

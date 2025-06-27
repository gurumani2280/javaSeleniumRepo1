package com.pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester4a {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///filePath/BasicHtmlElement.html");
		Thread.sleep(1000);
		WebElement firstName = driver.findElement(By.name("username"));
		firstName.sendKeys("anyName");
		Thread.sleep(1000);
		String valueFirstName = firstName.getAttribute("value");
		Thread.sleep(2000);
		System.out.println(valueFirstName);
		System.out.println(firstName.getCssValue("font-size"));
		System.out.println(firstName.getCssValue("color"));
		firstName.clear();
		driver.findElement(By.id("lastname")).sendKeys("someLAstNAme");
		Thread.sleep(1000);
		
		driver.quit();

	}

}

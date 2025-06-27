package com.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("file:///filePath/BasicHtmlElement.html");
		Thread.sleep(2000);
		
		WebElement userNameTextField= driver.findElement(By.name("username"));
		userNameTextField.sendKeys("anyUserName");
		Thread.sleep(4000);
		driver.quit();

	}

}

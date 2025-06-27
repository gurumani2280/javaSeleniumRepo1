package com.pack2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///filePath/BasicHtmlElement.html");
		Thread.sleep(1000);
		
		List<WebElement> list = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement checkbox : list)
		{
			checkbox.click();
			Thread.sleep(1000);
		} 
		
		for(int i = 0; i < list.size(); i ++)
		{
			WebElement checkbox = list.get(i);
			checkbox.click();
			Thread.sleep(1000);
			
		}
		
		Thread.sleep(1000);
		
		driver.quit();
		
		

	}

}

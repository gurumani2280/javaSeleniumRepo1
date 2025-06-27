package com.pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///filePath/BasicHtmlElement.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("anyName");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='testing']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='google']")).click();
		Thread.sleep(2000);
		
		
		driver.quit();


	}

}

package com.pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.google.com/");
		//driver.navigate().to("file:///filePath/BasicHtmlElement.html");
		Thread.sleep(4000);
		String url = driver.getCurrentUrl();
		System.out.println("Url "+ url);
		Thread.sleep(1000);
		String title = driver.getTitle();
		System.out.println("title " + title);
		Thread.sleep(1000);
		//System.out.println(driver.getPageSource());
		driver.quit();

	}

}

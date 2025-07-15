package com.driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager implements BrowserDriver{

	public WebDriver createDriver() {
		return new FirefoxDriver();
	}

	

}

package com.driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager implements BrowserDriver{

	public WebDriver createDriver() {
		return new EdgeDriver();
	}

}

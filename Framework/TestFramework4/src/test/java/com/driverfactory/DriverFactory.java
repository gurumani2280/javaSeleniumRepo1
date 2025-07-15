package com.driverfactory;

public class DriverFactory {

	public static BrowserDriver getDriver(String browserType) {
		switch (browserType.toLowerCase()) {
		case "chrome":
			return new ChromeDriverManager();
		case "firefox":
			return new FirefoxDriverManager();
		case "edge":
			return new EdgeDriverManager();
		default:
			throw new IllegalArgumentException("invalid browser input: "+browserType);

		}
	}

}

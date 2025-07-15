package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceCheckoutOverviewPage extends BasePage{
	WebDriver driver;
	
	public SauceCheckoutOverviewPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "finish")
	private WebElement finisButton;
	
	public void clickFinishButton() {
		finisButton.click();
	}

}

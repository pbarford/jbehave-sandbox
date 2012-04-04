package com.pjb.sandbox.jbehave.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;

public class YahooPage extends FluentWebDriverPage {

	public YahooPage(WebDriverProvider driverProvider) {
		super(driverProvider);
	}
	
	public void go() {
		get("http://www.yahoo.co.uk");
	}
	
	public void enterStuff(String stuff) {
		findElement(By.xpath("//input[@title='Search']")).sendKeys(stuff);
		findElement(By.xpath("//button[@value='Search']")).click();
	}

}

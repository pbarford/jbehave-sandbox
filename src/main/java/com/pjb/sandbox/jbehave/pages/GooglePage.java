package com.pjb.sandbox.jbehave.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GooglePage extends FluentWebDriverPage {

	private ScreenshotHelper screenshotHelper; 
	
	public GooglePage(WebDriverProvider driverProvider) {
		super(driverProvider);
		screenshotHelper = new ScreenshotHelper();
	}

	public void go() {
		get("http://www.google.com");
	}

	public void enterStuff(String stuff) {
		findElement(By.xpath("//input[@type!='hidden']")).sendKeys(stuff);
		findElement(By.xpath("//button[@aria-label='Google Search']")).click();
	}

	public void verify() {
		(new WebDriverWait(webDriver(), 10)).until(new ExpectedCondition<Boolean>() { 
			public Boolean apply(WebDriver d) { 
	            return d.getTitle().equalsIgnoreCase("soccer - Google Search"); 
	        } 
	    });
		
		try {
			screenshotHelper.saveScreenshot("google-results.png");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private class ScreenshotHelper {

		public void saveScreenshot(String screenshotFileName) throws IOException {
			File screenshot = ((TakesScreenshot) webDriver()).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot, new File(screenshotFileName));
		}
	}
}

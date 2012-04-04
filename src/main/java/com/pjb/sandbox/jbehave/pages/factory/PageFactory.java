package com.pjb.sandbox.jbehave.pages.factory;

import org.jbehave.web.selenium.WebDriverProvider;

import com.pjb.sandbox.jbehave.pages.GooglePage;
import com.pjb.sandbox.jbehave.pages.YahooPage;

public class PageFactory {

	private final WebDriverProvider webDriverProvider;
	
	public PageFactory(WebDriverProvider webDriverProvider) {
		this.webDriverProvider = webDriverProvider;
	}
	
	public GooglePage getGooglePage() {
		return new GooglePage(webDriverProvider);
	}
	
	public YahooPage getYahooPage() {
		return new YahooPage(webDriverProvider);
	}
}

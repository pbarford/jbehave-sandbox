package com.pjb.sandbox.jbehave.steps;

import com.pjb.sandbox.jbehave.pages.YahooPage;
import com.pjb.sandbox.jbehave.pages.factory.PageFactory;

public class YahooSteps extends AbstractSteps {

	private YahooPage yahooPage;
	
	public YahooSteps(PageFactory pageFactory) {
		yahooPage = pageFactory.getYahooPage();
	}	
	
	@Override
	protected void enterSearchCriteriaInternal(String criteria) {
		yahooPage.enterStuff(criteria);
		
	}

	@Override
	protected void goInternal() {
		yahooPage.go();
	}

	@Override
	protected void verifyInternal() {
	}
}

package com.pjb.sandbox.jbehave.steps;

import com.pjb.sandbox.jbehave.pages.GooglePage;
import com.pjb.sandbox.jbehave.pages.factory.PageFactory;

public class GoogleSteps extends AbstractSteps {

	private GooglePage googlePage;
	
	public GoogleSteps(PageFactory pageFactory) {
		googlePage = pageFactory.getGooglePage();
	}

	@Override
	protected void enterSearchCriteriaInternal(String criteria) {
		googlePage.enterStuff(criteria);
		
	}

	@Override
	protected void goInternal() {
		googlePage.go();
	}

	@Override
	protected void verifyInternal() {
		googlePage.verify();
	}
}

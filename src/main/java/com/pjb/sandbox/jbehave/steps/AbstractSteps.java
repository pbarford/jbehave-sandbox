package com.pjb.sandbox.jbehave.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public abstract class AbstractSteps {

	protected abstract void goInternal();
	protected abstract void enterSearchCriteriaInternal(String criteria);
	protected abstract void verifyInternal();
	
	@Given("the user is on the search site")
	public void open() {
		goInternal();
	}
	
	@When("the user searches for <criteria>")
	public void enterSearchCriteria(@Named("criteria") String criteria) {
		enterSearchCriteriaInternal(criteria);
	}
	
	@Then("the user should see the search results")
	public void verify() {
		verifyInternal();
	}
}

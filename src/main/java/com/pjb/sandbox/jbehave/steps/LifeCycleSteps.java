package com.pjb.sandbox.jbehave.steps;

import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.web.selenium.WebDriverProvider;

public class LifeCycleSteps {
	private final WebDriverProvider webDriverProvider;

    public LifeCycleSteps(WebDriverProvider webDriverProvider) {
        this.webDriverProvider = webDriverProvider;
    }

    @BeforeScenario
    public void beforeScenario() {        
    }
}

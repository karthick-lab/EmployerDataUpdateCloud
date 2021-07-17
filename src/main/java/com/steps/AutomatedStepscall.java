package com.steps;

import org.junit.Test;

import com.automatedsteps.AutomatedSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
// comment origin
public class AutomatedStepscall extends AutomatedSteps {
	
	@Given("^user is  on homepage and update the Employer details$")
	public void user_is_on_homepage_and_update_the_Employer_details() throws Throwable {
	   
		URLlaunch();
		
	    throw new PendingException();
	}
	
	
	@Test
	
	public void sample()
	{
		URLlaunch();
	}
	



}

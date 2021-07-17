package com.automatedsteps;

import com.driverfactory.DriverFactory;

public class AutomatedSteps extends com.driverfactory.DriverFactory{
	
	public static void URLlaunch()
	{
	    DriverFactory.getChromeDriver();
	    driver.get("https://employmentexchange.tn.gov.in/Empower/");
	    driver.manage().window().maximize();
	}

}

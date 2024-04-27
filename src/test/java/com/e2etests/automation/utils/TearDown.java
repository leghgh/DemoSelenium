package com.e2etests.automation.utils;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TearDown {

	/**
	 * 
	 * This method is used to close browser. This method is called after the
	 * 
	 * invocation of each test method in given class.
	 *
	 * 
	 * 
	 * @After Methods annotated with @After execute after every scenario.
	 * 
	 */

	@After

	public void quitDriver(Scenario scenario) {

		if (scenario.isFailed()) {

			final byte[] screenshot = ((TakesScreenshot) Setup.getDriver()).getScreenshotAs(OutputType.BYTES);

			scenario.attach(screenshot, "image/png", "screenshot");

		}
		Setup.getDriver().quit();

	}
}
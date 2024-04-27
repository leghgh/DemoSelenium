package com.e2etests.automation;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/spec/features"},//localisation des features
		plugin= {"pretty","html:target/cucumber-report.html"},//reporting
		tags=("@boulet-corp"),//taguer les cas de test
		monochrome=true,//organiser la console
		snippets=CAMELCASE
		)
public class RunWebSuiteTest {

}
package co.com.automationchronus.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@CucumberOptions(
		features="src/test/resources/features/chronuslogin.feature",
		glue="co.com.automationchronus.stepdefinitions",
		snippets=SnippetType.CAMELCASE		)
@RunWith(CucumberWithSerenity.class)

public class RunnerChronus {
	
}
package co.com.automationchronus.stepdefinitions;

import co.com.automationchronus.models.User;
import co.com.automationchronus.questions.TheScreen;
import co.com.automationchronus.tasks.ChronusLogin;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import co.com.automationchronus.tasks.EnterThePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

import java.util.List;

public class chronusStepDefinition {

	@Managed(driver = "chrome")
	private WebDriver hisbrowser;

	private Actor user = Actor.named("user");

	@Before
	public void configurationInicial() {
		user.can(BrowseTheWeb.with(hisbrowser));
	}

	@Given("^that user wants to  use Chronus$")
	public void thatUserWantsToUseChronus()  {
		user.wasAbleTo(EnterThePage.TheChronusPage());
	}

	@When("^he make the login in the page Chronus$")
	public void heMakeTheLoginInThePageChronus(List<User> data) {

		System.out.println(data);
		user.attemptsTo(ChronusLogin.withTheData(data));
	}

	@Then("^he must access the page$")
	public void heMustAccessThePage(List<User> data2) {
		
		user.should(GivenWhenThen.seeThat(TheScreen.theScreen(),Matchers.containsString(data2.get(0).getValidation_message())));
				
	}
}

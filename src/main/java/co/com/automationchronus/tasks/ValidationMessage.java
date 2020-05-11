package co.com.automationchronus.tasks;

import java.util.List;

import static co.com.automationchronus.userinterface.ChronusPage.VALIDATION_MESSAGE;
import org.openqa.selenium.WebDriver;

import co.com.automationchronus.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class ValidationMessage implements Task {
	
	private List<User> data2;
	WebDriver driver;
	
	public ValidationMessage(List<User> data2) {
		this.data2 = data2;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Enter.theValue(data2.get(0).getValidation_message()).into(VALIDATION_MESSAGE));
		
	}
	
	public static ValidationMessage withTheData(List<User> data2) {
		return Tasks.instrumented(ValidationMessage.class, data2);
	}

}

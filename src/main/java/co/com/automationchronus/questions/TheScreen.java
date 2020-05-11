package co.com.automationchronus.questions;

import static co.com.automationchronus.userinterface.ChronusPage.VALIDATION_MESSAGE;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class TheScreen implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {

		return Text.of((Target)VALIDATION_MESSAGE).viewedBy(actor).asString();
	}
	
	public static TheScreen theScreen() {
		return new TheScreen();
	}
	

}

package co.com.automationchronus.tasks;

import co.com.automationchronus.userinterface.ChronusPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class EnterThePage implements Task {
	
//	private ChronusPage chronusPage;

	@Override
	public <T extends Actor> void performAs(T actor) {
		
//		actor.attemptsTo(Open.browserOn(chronusPage));
		actor.attemptsTo(Open.browserOn(new ChronusPage()));
		
	}
	
	public static EnterThePage TheChronusPage() {
		return Tasks.instrumented(EnterThePage.class);
	}
	
	

}

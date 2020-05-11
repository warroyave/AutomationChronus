package co.com.automationchronus.tasks;

import static co.com.automationchronus.userinterface.ChronusPage.BUTTON_LOGIN;
import static co.com.automationchronus.userinterface.ChronusPage.PASSWORD;
import static co.com.automationchronus.userinterface.ChronusPage.USER;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.WebDriver;

import co.com.automationchronus.models.User;

import java.util.List;

public class ChronusLogin implements Task {

    private List<User> data;
    WebDriver driver;

    public ChronusLogin(List<User> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    	
        actor.attemptsTo(Enter.theValue(data.get(0).getUser()).into(USER));
        actor.attemptsTo(Enter.theValue(data.get(0).getPassword()).into(PASSWORD));
        actor.attemptsTo(Click.on(BUTTON_LOGIN));
        
    }

    public static ChronusLogin withTheData(List<User> data) {
        return Tasks.instrumented(ChronusLogin.class, data);
    }
}

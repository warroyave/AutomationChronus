package co.com.automationchronus.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


@DefaultUrl("https://services.sophossolutions.com/TimeTracker/TimeTracker/Login.aspx?ReturnUrl=%2fTimeTracker%2fdefault.aspx")

public class ChronusPage extends PageObject {

    //CHRONUS LOGIN

    public static final Target USER = Target.the("fiel to enter the user").located(By.xpath("/html//div[@id='adminedit2']/fieldset/table/tbody/tr/td/table//input[@name='ctl00$maincontent$Login1$UserName']"));
    public static final Target PASSWORD = Target.the("fiel to enter the password").located(By.xpath("/html//div[@id='adminedit2']/fieldset/table/tbody/tr/td/table//input[@name='ctl00$maincontent$Login1$Password']"));
    public static final Target BUTTON_LOGIN = Target.the("button of login").located(By.xpath("/html//div[@id='adminedit2']/fieldset/table/tbody/tr/td/table/tbody/tr[5]/td/input[@name='ctl00$maincontent$Login1$LoginButton']"));
    
    
    //VALIDATION QUESTION
    
    public static final Target VALIDATION_MESSAGE = Target.the("goal create").located(By.id("ctl00_LoginName1"));
}

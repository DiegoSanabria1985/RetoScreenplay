package co.com.tours.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class logInPage {
    public static final Target BUTTON_JOIN = Target.the("Press the button join")
            .located(By.className("unauthenticated-nav-bar__sign-up"));
    public static final Target INPUT_NAME = Target.the("register name in the page")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("register lastname in the page")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("register email in the page")
            .located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("press the months field")
            .located(By.id("birthMonth"));
    public static final Target SELECT_FEBRARY= Target.the("select the month of February")
            .located(By.xpath("//option[@label = 'February']"));
    public static final Target SELECT_BIRTHDAY = Target.the("press the day field")
            .located(By.id("birthDay"));
    public static final Target SELECT_DAY = Target.the("select the day of birth")
            .located(By.xpath("//option[@label = '4']"));
    public static final Target SELECT_YEAR = Target.the("press the year field")
            .located(By.id("birthYear"));
    public static final Target SELECT_ONEYEAR = Target.the("\n" +
            "select year of birth")
            .located(By.xpath("//option[@label = '2001']"));
    public static final Target NEXT_SECONDPAGE = Target.the("press next page button")
            .located(By.xpath("//I[@class = 'material-icons']"));
}

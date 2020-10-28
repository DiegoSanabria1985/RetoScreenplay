package co.com.tours.tasks;

import co.com.tours.userinterface.logInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class enterData implements Task {
    public static enterData onThePage(){
        return Tasks.instrumented(enterData.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(logInPage.BUTTON_JOIN),
                Enter.theValue("Diego").into(logInPage.INPUT_NAME),
                Enter.theValue("Sanabria").into(logInPage.INPUT_LASTNAME),
                Enter.theValue("diego-@hotmail.com").into(logInPage.INPUT_EMAIL),
                Click.on(logInPage.SELECT_MONTH),
                Click.on(logInPage.SELECT_FEBRARY),
                Click.on(logInPage.SELECT_BIRTHDAY),
                Click.on(logInPage.SELECT_DAY),
                Click.on(logInPage.SELECT_YEAR),
                Click.on(logInPage.SELECT_ONEYEAR),
                Click.on(logInPage.NEXT_SECONDPAGE));
    }
}

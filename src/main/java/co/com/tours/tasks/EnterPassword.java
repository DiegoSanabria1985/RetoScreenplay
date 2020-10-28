package co.com.tours.tasks;

import co.com.tours.userinterface.EnterDevicesPage;
import co.com.tours.userinterface.EnterPasswordPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterPassword implements Task {


    public static EnterPassword the(String password) {
        return Tasks.instrumented(EnterPassword.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue("DIEGOsanabria#1985").into(EnterPasswordPage.INPUT_PASSWORD),
                Enter.theValue("DIEGOsanabria#1985").into(EnterPasswordPage.CONFIRM_PASSWORD),
                Click.on(EnterPasswordPage.ACCEPT_TERMS),
                Click.on(EnterPasswordPage.ACCEPT_PRIVACY));
    }
}

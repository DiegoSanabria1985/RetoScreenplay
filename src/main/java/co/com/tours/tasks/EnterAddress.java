package co.com.tours.tasks;

import co.com.tours.userinterface.EnterAddressPage;
import co.com.tours.userinterface.logInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterAddress implements Task {


    public static EnterAddress the(String address) {
        return Tasks.instrumented(EnterAddress.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(EnterAddressPage.ENTER_CITY),
                Enter.theValue("Armenia").into(EnterAddressPage.ENTER_CITY),
                Enter.theValue("663").into(EnterAddressPage.INPUT_ZIP),
                Click.on(EnterAddressPage.ENTER_COUNTRY),
                Enter.theValue("Colombia").into(EnterAddressPage.SELECT_COUNTRY),
                Click.on(EnterAddressPage.SELECT_COLOMBIA),
                Click.on(EnterAddressPage.NEXT_DIVICES));
    }
}

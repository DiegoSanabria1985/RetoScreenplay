package co.com.tours.tasks;

import co.com.tours.userinterface.EnterAddressPage;
import co.com.tours.userinterface.EnterDevicesPage;
import co.com.tours.userinterface.logInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterDevices implements Task {


    public static EnterDevices the(String devices) {

        return Tasks.instrumented(EnterDevices.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(EnterDevicesPage.YOUR_COMPUTER),
                Enter.theValue("Windows").into(EnterDevicesPage.INPUT_WINDOWS),
                Click.on(EnterDevicesPage.SELECT_WINDOWS),
                Click.on(EnterDevicesPage.ENTER_VERSION),
                Enter.theValue("XP 64").into(EnterDevicesPage.INPUT_VERSION),
                Click.on(EnterDevicesPage.SELECT_XP),
                Click.on(EnterDevicesPage.ENTER_LANGUAGE),
                Enter.theValue("Arabic").into(EnterDevicesPage.INPUT_LANGUAGE),
                Click.on(EnterDevicesPage.SELECT_ARABIC),
                Click.on(EnterDevicesPage.LAST_STEP));
    }
}

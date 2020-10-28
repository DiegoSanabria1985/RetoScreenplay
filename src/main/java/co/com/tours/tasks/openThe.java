package co.com.tours.tasks;

import co.com.tours.userinterface.openPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class openThe implements Task {
    private openPage openPage;
    public static openThe Page() {
        return Tasks.instrumented(openThe.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(openPage));
    }
}

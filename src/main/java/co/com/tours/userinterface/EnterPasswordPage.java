package co.com.tours.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EnterPasswordPage extends PageObject {
    public static final Target INPUT_PASSWORD = Target.the("enter user password")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("confirm user password")
            .located(By.id("confirmPassword"));
    public static final Target ACCEPT_TERMS = Target.the("press check to accept terms")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target ACCEPT_PRIVACY = Target.the("press check to accept privacy terms")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_COMPLETE = Target.the("press the button to complete the account details")
            .located(By.xpath("//*[@id=\"laddaBtn\"]/span"));
    public static final Target WELCOME = Target.the("capture the message of the final page")
            .located(By.className("sub-title"));
}

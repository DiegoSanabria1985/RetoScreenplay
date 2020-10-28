package co.com.tours.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EnterAddressPage extends PageObject {
    public static final Target ENTER_CITY = Target.the("press the city field")
            .located(By.id("city"));
    public static final Target SELECT_CITY = Target.the("select city")
            .located(By.xpath("/html/body/div[7]/div[1]/span[2]/span"));
    public static final Target INPUT_ZIP = Target.the("enter zip code")
            .located(By.id("zip"));
    public static final Target ENTER_COUNTRY = Target.the("press the country field")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static final Target SELECT_COUNTRY = Target.the("enter the country")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target SELECT_COLOMBIA = Target.the("select the country Colombia")
            .located(By.xpath("// span[@class = 'ui-select-highlight']"));
    public static final Target NEXT_DIVICES = Target.the("press the next page button")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
}
//*[@id="city"]
package co.com.tours.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EnterDevicesPage {
    public static final Target YOUR_COMPUTER = Target.the("\n" +
            "press field your computer")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target INPUT_WINDOWS = Target.the("enter text windows")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target SELECT_WINDOWS = Target.the("select the windows option")
            .located(By.className("ui-select-highlight"));
    public static final Target ENTER_VERSION = Target.the("press the version field")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_VERSION = Target.the("\n" +
            "enter text XP")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target SELECT_XP = Target.the("select option xp")
            .located(By.xpath("//div[@ng-bind-html = 'version.name | highlight: $select.search']"));
    public static final Target ENTER_LANGUAGE = Target.the("press the language field")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_LANGUAGE = Target.the("enter language")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target SELECT_ARABIC = Target.the("select the arabic language")
            .located(By.xpath("//span[@class = 'ui-select-highlight']"));
    public static final Target LAST_STEP = Target.the("select next step button")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a/span"));
}

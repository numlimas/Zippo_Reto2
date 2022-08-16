package co.com.zippo.www.interactions;

import co.com.zippo.www.driver.SeleniumWebDriver;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

public class Scrolling implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        SeleniumWebDriver.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        JavascriptExecutor jse = (JavascriptExecutor) SeleniumWebDriver.driver;
        jse.executeScript("window.scrollBy(0,400)");
    }

    public static Performable APage(){
        return Instrumented.instanceOf(Scrolling.class).withProperties();
    }
}

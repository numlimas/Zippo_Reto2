package co.com.zippo.www.interactions;

import co.com.zippo.www.driver.SeleniumWebDriver;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.concurrent.TimeUnit;

public class Wait implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        SeleniumWebDriver.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public static Performable Time(){
        return Instrumented.instanceOf(Wait.class).withProperties();
    }
}

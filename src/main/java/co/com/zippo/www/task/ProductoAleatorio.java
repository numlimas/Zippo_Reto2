package co.com.zippo.www.task;

import co.com.zippo.www.interactions.ClickRandom;
import co.com.zippo.www.interactions.Wait;
import co.com.zippo.www.userInterface.HomePageUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ProductoAleatorio implements Task {
    HomePageUI homePageUI = new HomePageUI();
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(homePageUI.BTN_CATEGORIA_ENCENDEDORES, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(homePageUI.BTN_CATEGORIA_ENCENDEDORES),
                WaitUntil.the(homePageUI.BTN_SUBCATEGORIA, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(homePageUI.BTN_SUBCATEGORIA),
                Wait.Time(),
                ClickRandom.enSubcategoria()
        );
    }
    public static Performable enSubcategoria(){
        return Instrumented.instanceOf(ProductoAleatorio.class).withProperties();
    }
}

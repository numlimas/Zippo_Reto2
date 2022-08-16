package co.com.zippo.www.task;

import co.com.zippo.www.interactions.Scrolling;
import co.com.zippo.www.interactions.Wait;
import co.com.zippo.www.userInterface.HomePageUI;
import co.com.zippo.www.utils.VariableGlobal;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class BuscarProducto implements Task {
    HomePageUI homePageUI = new HomePageUI();

    private String producto;


    public BuscarProducto(String producto){this.producto=producto;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        VariableGlobal.productoExcel=producto;
        actor.attemptsTo(
                Wait.Time(),
                Enter.theValue(producto).into(homePageUI.TXT_BUSQUEDA),
                Enter.keyValues(Keys.ENTER).into(homePageUI.TXT_BUSQUEDA),
                Wait.Time(),
                Scrolling.APage(),
                Click.on(homePageUI.BTN_BUSQ_PRODUCTO)
        );


    }
    public static Performable enHome(String producto){
        return Instrumented.instanceOf(BuscarProducto.class).withProperties(producto);
    }
}

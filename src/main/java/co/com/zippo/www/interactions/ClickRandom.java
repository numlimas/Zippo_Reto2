package co.com.zippo.www.interactions;

import co.com.zippo.www.userInterface.HomePageUI;
import co.com.zippo.www.utils.VariableGlobal;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;

public class ClickRandom implements Interaction {
    HomePageUI homePageUI = new HomePageUI();
    @Override
    public <T extends Actor> void performAs(T actor) {
        Random random = new Random();
        List<WebElementFacade> listaBtnProductos = homePageUI.BTN_PRODUCTO_ALEAT.resolveAllFor(actor);
        List<WebElementFacade> listaLblProductos = homePageUI.LBL_PRODUCTO_ALEAT.resolveAllFor(actor);
        int numRandom = random.nextInt(listaBtnProductos.size());
        VariableGlobal.productoAleatorio = listaLblProductos.get(numRandom).getText();
        listaBtnProductos.get(numRandom).click();
    }
    public static Performable enSubcategoria(){
        return Instrumented.instanceOf(ClickRandom.class).withProperties();
    }
}

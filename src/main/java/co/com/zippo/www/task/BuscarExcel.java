package co.com.zippo.www.task;

import co.com.zippo.www.interactions.Wait;
import co.com.zippo.www.userInterface.HomePageUI;
import co.com.zippo.www.utils.Excel;
import co.com.zippo.www.utils.VariableGlobal;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class BuscarExcel implements Task {
    public static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();
    HomePageUI homePageUI = new HomePageUI();
    static int ind =0;
    @Override
    public <T extends Actor> void performAs(T actor) {

        String nombreArchivo = "Datos.xlsx";
        String hoja2 = "productos";
        String encHoja2 = "keyword";
        try {
            leerExcel = Excel.readExcel(nombreArchivo, hoja2);
            VariableGlobal.productoExcel =leerExcel.get(ind).get(encHoja2);
            ind++;
        } catch (IOException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(
                Wait.Time(),
                Enter.keyValues(VariableGlobal.productoExcel).into(homePageUI.TXT_BUSQUEDA),
                Enter.keyValues(Keys.ENTER).into(homePageUI.TXT_BUSQUEDA),
                Wait.Time(),
                Click.on(homePageUI.BTN_BUSQ_PRODUCTO)

        );
    }
    public static Performable producto(){
        return Instrumented.instanceOf(BuscarExcel.class).withProperties();
    }
}

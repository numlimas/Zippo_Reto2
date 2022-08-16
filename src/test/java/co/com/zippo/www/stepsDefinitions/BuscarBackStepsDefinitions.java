package co.com.zippo.www.stepsDefinitions;


import co.com.zippo.www.task.BuscarProducto;
import co.com.zippo.www.userInterface.HomePageUI;
import co.com.zippo.www.utils.Models;
import co.com.zippo.www.utils.VariableGlobal;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import java.io.IOException;
import java.util.List;

public class BuscarBackStepsDefinitions {
    HomePageUI homePageUI=new HomePageUI();
    @Before
    public void before()throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }
    @When("^busco un producto en la caja de texto$")
    public void buscoUnProductoEnLaCajaDeTexto(List<Models> arg1) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarProducto.enHome(arg1.get(0).getProductos()));
    }


    @Then("^valido que se cumpla la busqueda$")
    public void validoQueSeCumplaLaBusqueda() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(homePageUI.LBL_VAL_PRODUCTO.of()), WebElementStateMatchers.containsText(VariableGlobal.productoExcel)));
    }
}

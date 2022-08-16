package co.com.zippo.www.stepsDefinitions;

import co.com.zippo.www.task.BuscarProducto;
import co.com.zippo.www.userInterface.HomePageUI;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import java.io.IOException;

public class BuscarOutStepsDefinitions {
    HomePageUI homePageUI = new HomePageUI();
    @Before
    public void before()throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }
    @When("^escribo (.*) en la caja de texto de la pagina$")
    public void escriboProductoEnLaCajaDeTextoDeLaPagina(String producto) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarProducto.enHome(producto));
    }


    @Then("^valido que obtenga (.*) requerido$")
    public void validoQueObtengaProductoRequerido(String producto) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(homePageUI.LBL_VAL_PRODUCTO.of()), WebElementStateMatchers.containsText(producto)));
    }
}

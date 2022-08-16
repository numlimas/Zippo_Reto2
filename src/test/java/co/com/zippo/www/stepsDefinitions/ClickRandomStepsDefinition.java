package co.com.zippo.www.stepsDefinitions;

import co.com.zippo.www.task.ProductoAleatorio;
import co.com.zippo.www.userInterface.HomePageUI;
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

public class ClickRandomStepsDefinition {
    HomePageUI homePageUI = new HomePageUI();

    @Before
    public void before()throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }
    @When("^busco un producto aleatorio$")
    public void buscoUnProductoAleatorio() {
        OnStage.theActorInTheSpotlight().attemptsTo(ProductoAleatorio.enSubcategoria());
    }


    @Then("^valido que sea el producto elegido$")
    public void validoQueSeaElProductoElegido() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(homePageUI.LBL_VAL_PRODUCTO.of()), WebElementStateMatchers.containsText(VariableGlobal.productoAleatorio)));

    }
}

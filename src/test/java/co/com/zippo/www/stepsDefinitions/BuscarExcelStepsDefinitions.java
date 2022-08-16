package co.com.zippo.www.stepsDefinitions;

import co.com.zippo.www.driver.SeleniumWebDriver;
import co.com.zippo.www.task.BuscarExcel;
import co.com.zippo.www.userInterface.HomePageUI;
import co.com.zippo.www.utils.VariableGlobal;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import java.io.IOException;

public class BuscarExcelStepsDefinitions {
    HomePageUI homePageUI = new HomePageUI();


    @Before
    public void before()throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^estoy en la pagina Home de Zippo (.*)$")
    public void estoyEnLaPaginaHomeDeZippo(String Url) {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(SeleniumWebDriver.chromeDrive(Url)));
    }

    @When("^busco un producto en la pagina$")
    public void buscoUnProductoEnLaPagina() {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarExcel.producto());

    }


    @Then("^valido que se realice la busqueda$")
    public void validoQueSeRealiceLaBusqueda() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(homePageUI.LBL_VAL_PRODUCTO.of()), WebElementStateMatchers.containsText(VariableGlobal.productoExcel)));

    }
}

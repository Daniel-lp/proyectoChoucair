package co.com.choucair.certificacion.proyectobase.stepdefinitions;

import co.com.choucair.certificacion.proyectobase.model.Usuario;
import co.com.choucair.certificacion.proyectobase.questions.Answer;
import co.com.choucair.certificacion.proyectobase.task.OpenUp;
import co.com.choucair.certificacion.proyectobase.task.Login;
import co.com.choucair.certificacion.proyectobase.task.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^that (.*) wants to learn automation at the academy Choucair$")
    public void thatDanielWantsToLearnAutomationAtTheAcademyChoucair(String actor, List<Usuario> usuarios) {

        OnStage.theActorCalled(actor).wasAbleTo(OpenUp.thePage(),
                (Login.onThePage(usuarios.get(0).getUser(),usuarios.get(0).getPassword())));
    }




    @When("^he search for the course on the Choucair Academy platform$")
    public void heSearchForTheCourseOnTheChoucairAcademyPlatform(List<Usuario> usuarios) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(usuarios.get(0).getCourse()));
    }

    @Then("^he finds the course called$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(List<Usuario> usuarios){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(usuarios.get(0).getCourse())));

    }
}

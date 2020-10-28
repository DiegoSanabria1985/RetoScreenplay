package co.com.tours.stepdefinitions;

import co.com.tours.questions.Answer;
import co.com.tours.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class toursStespdefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }




    @Given("^Diego wants to create a new user$")
    public void Diegowantstocreateanewuser() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("usuario").wasAbleTo(openThe.Page(), (enterData.onThePage()));
    }


    @When("^Add user address data on the page (.*)$")
    public void changeTheLanguageOfThePageAndChangeTheTypeOfCurrency(String address) throws Exception {
        // Write code here that turns the phrase above into concrete actions

        OnStage.theActorInTheSpotlight().attemptsTo(EnterAddress.the(address));
    }

    @When("^Enter device information on the page (.*)$")
    public void EnterdeviceinformationonthepageTellusaboutyourdevices(String devices) throws Exception {
        // Write code here that turns the phrase above into concrete actions

        OnStage.theActorInTheSpotlight().attemptsTo(EnterDevices.the(devices));
    }

    @When("^Enter the password on the page (.*)$")
    public void EnterthepasswordonthepageThelaststep(String password) throws Exception {
        // Write code here that turns the phrase above into concrete actions

        OnStage.theActorInTheSpotlight().attemptsTo(EnterPassword.the(password));
    }

    @Then("^find the welcome page with the message (.*)$")
    public void findthewelcomepagewiththemessageThelaststep(String question) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}

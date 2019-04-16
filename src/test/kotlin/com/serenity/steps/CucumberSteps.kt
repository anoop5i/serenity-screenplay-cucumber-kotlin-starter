package com.serenity.steps

import com.serenity.questions.SearchResult
import com.serenity.tasks.OpenTheApplication
import com.serenity.tasks.SearchAction
import cucumber.api.java.Before
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import net.serenitybdd.screenplay.EventualConsequence
import net.serenitybdd.screenplay.EventualConsequence.eventually
import net.serenitybdd.screenplay.GivenWhenThen
import net.serenitybdd.screenplay.GivenWhenThen.seeThat
import net.serenitybdd.screenplay.actors.OnStage
import net.serenitybdd.screenplay.actors.OnStage.theActorCalled
import net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight
import net.serenitybdd.screenplay.actors.OnlineCast
import org.hamcrest.Matchers
import org.joni.SearchAlgorithm

class CucumberSteps {

    @Before
    fun setup() {
        OnStage.setTheStage(OnlineCast())
    }

    @Given("^User navigate to the url \"(.*)\"$")
    fun navigateTo(url: String) {
        theActorCalled("user").wasAbleTo(OpenTheApplication(url))
    }

    @When("^User perform a search with text \"(.*)\"$")
    fun searchFor(text: String) {
        theActorInTheSpotlight().attemptsTo(SearchAction(text))
    }

    @Then("^User can see the return values contains links with text \"(.*)\"$")
    fun canSeeLink(text: String) {
        theActorInTheSpotlight().can(
            eventually(
                seeThat(
                    SearchResult(text),
                    Matchers.`is`(true)
                )
            )
        )
    }
}

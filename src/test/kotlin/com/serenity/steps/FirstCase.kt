package com.serenity.steps

import com.serenity.questions.SearchResult
import com.serenity.tasks.SearchAction
import net.serenitybdd.junit.runners.SerenityRunner
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.EventualConsequence.eventually
import net.serenitybdd.screenplay.GivenWhenThen.seeThat
import net.serenitybdd.screenplay.abilities.BrowseTheWeb
import net.serenitybdd.screenplay.actions.Open
import net.thucydides.core.annotations.Managed
import org.hamcrest.Matchers
import org.junit.Test
import org.junit.runner.RunWith
import org.openqa.selenium.WebDriver

@RunWith(SerenityRunner::class)
class FirstCase {

    @Managed
    private val browser: WebDriver? = null

    private val actor: Actor = Actor.named("user")

    @Test
    fun runFirstTest() {
        actor.can(BrowseTheWeb.with(browser))
        actor.attemptsTo(Open.relativeUrl("http://www.google.com"))
        actor.attemptsTo(SearchAction("test"))
        actor.can(eventually(seeThat(SearchResult("Test"), Matchers.`is`(true))))
    }
}

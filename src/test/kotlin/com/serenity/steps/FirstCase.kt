package com.serenity.steps

import com.serenity.Logger
import com.serenity.questions.SearchQuestions
import com.serenity.tasks.SearchTasks
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
    companion object : Logger

    @Managed
    private val browser: WebDriver? = null

    private val actor: Actor = Actor.named("user")

    @Test
    fun runFirstTest() {
        actor.can(BrowseTheWeb.with(browser))
        logger().info(".........Logging starts here......")
        actor.attemptsTo(Open.relativeUrl("http://www.google.com"))
        actor.attemptsTo(SearchTasks.search("test"))
        actor.can(eventually(seeThat(SearchQuestions.containLink("Test"), Matchers.`is`(true))))
    }
}

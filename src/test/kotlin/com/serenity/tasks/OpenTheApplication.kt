package com.serenity.tasks

import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Task
import net.serenitybdd.screenplay.actions.Open

class OpenTheApplication(location: String) : Task {
    private val url: String? = location

    override fun <T : Actor?> performAs(actor: T) {
        actor?.attemptsTo(Open.relativeUrl(url))
    }

}

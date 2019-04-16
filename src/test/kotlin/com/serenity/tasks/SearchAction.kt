package com.serenity.tasks

import com.serenity.ui.GoogleUI
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Task
import net.serenitybdd.screenplay.actions.Click
import net.serenitybdd.screenplay.actions.Enter

class SearchAction(text: String) : Task {
    private var searchItem: String = text

    override fun <T : Actor?> performAs(actor: T) {
        actor?.attemptsTo(
            Enter.theValue(searchItem).into(GoogleUI.searchInput),
            Click.on(GoogleUI.searchButton))
    }

}

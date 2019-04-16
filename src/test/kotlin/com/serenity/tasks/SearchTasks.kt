package com.serenity.tasks

import com.serenity.ui.GoogleUI
import net.serenitybdd.screenplay.Task
import net.serenitybdd.screenplay.actions.Click
import net.serenitybdd.screenplay.actions.Enter

object SearchTasks {

    fun search(text: String): Task {
        return Task.where(
            "Searching",
            Enter.theValue(text).into(GoogleUI.searchInput),
            Click.on(GoogleUI.searchButton)
        )
    }
}

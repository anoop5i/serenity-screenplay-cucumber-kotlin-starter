package com.serenity.questions

import com.serenity.ui.GoogleUI
import net.serenitybdd.screenplay.Question

object SearchQuestions {

    fun containLink(text: String): Question<Boolean> {
        return Question { actor -> GoogleUI.searchResult.of(text).resolveFor(actor).isVisible }
    }
}

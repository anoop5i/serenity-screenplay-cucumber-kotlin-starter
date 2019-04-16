package com.serenity.questions

import com.serenity.ui.GoogleUI
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Question

class SearchResult(text: String) : Question<Boolean> {
    private var searchItem: String = text

    override fun answeredBy(actor: Actor?): Boolean {
        return GoogleUI.searchResult.of(searchItem).resolveFor(actor).isVisible
    }

}

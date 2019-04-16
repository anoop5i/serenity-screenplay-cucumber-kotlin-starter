package com.serenity.ui

import net.serenitybdd.screenplay.targets.Target
import org.openqa.selenium.By

object GoogleUI {
    val searchInput: Target = Target.the("search input").located(By.name("q"))
    val searchButton: Target = Target.the("search button").located(By.name("btnK"))

    val searchResult: Target = Target.the("result").locatedBy("//a[contains(.,{0})]")
}

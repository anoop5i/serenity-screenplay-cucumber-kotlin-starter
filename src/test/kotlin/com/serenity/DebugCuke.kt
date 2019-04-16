package com.serenity

import cucumber.api.CucumberOptions
import net.serenitybdd.cucumber.CucumberWithSerenity
import org.junit.runner.RunWith

@RunWith(CucumberWithSerenity::class)
@CucumberOptions(features = ["src/test/resources/features"], plugin = ["pretty", "json:target/cucumber.json"], glue = ["com.serenity"], tags = ["@Test"])
class DebugCuke

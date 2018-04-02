package com.helpers;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", plugin = { "pretty", "html:target/cucumber-html-report",
		"json:cucumber.json" }, tags = {}, glue = { "com.helpers", "com.step_definitions" })
public class TestRunner {

}
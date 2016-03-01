package ru.dolgiy;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;
import org.junit.runner.RunWith;

/**
 * Created by Anton on 29.02.2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resource"})
public class UlmartCucumberRunner {

}

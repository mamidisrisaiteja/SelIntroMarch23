package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\AN574BV\\eclipse-workspace\\TejaJasmiSeleniumIntro1\\src\\test\\java\\features",glue= {"stepDefinitions"},plugin= "json:reports/cucumber-reports/CucumberTestReport.html")
public class TestRunner {

}

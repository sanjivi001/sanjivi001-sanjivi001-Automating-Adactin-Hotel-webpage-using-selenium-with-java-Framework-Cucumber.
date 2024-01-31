package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.ReportingClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Loges\\eclipse-workspace\\NovemberrTestingCucumber2023\\src\\test\\resources\\Feature\\LoginPageF.Feature", 
glue = "org.step", 
monochrome = false,
dryRun = false,
snippets = SnippetType.CAMELCASE,
plugin = {"html:target\\Html", "junit:target\\xmlReport.xml", "json:target\\jsonReport.jason" })
public class TestRunnerClass {
	@AfterClass
	public static void tc01() {
		ReportingClass.reportGenertor("target\\jsonReport.jason");

	}
}

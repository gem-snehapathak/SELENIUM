package assignment7;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * This is the Test Runner for the .feature file.
 * Here we bind the .feature file with the step definition class
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\sneha.pathak\\IdeaProjects\\Maven1Project\\src\\main\\java\\assignment7\\lgin.feature",
        glue = {"def"},
        tags = "@defaultLoginWithExampleCredentials" )

public class TestRunner {
}

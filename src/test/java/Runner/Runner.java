package Runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@tag", 
features = "src\\test\\feature\\facebook1.feature",
glue = "sprint1", 
publish = true, 
plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber-reports.json" }

)
public class Runner {

}
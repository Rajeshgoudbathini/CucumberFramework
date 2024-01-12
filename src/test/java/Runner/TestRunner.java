package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resource/features",
plugin={"pretty","html:target/CucumberReports/Report.html"},
publish=true,
glue={"Implementation","Hooks"})

public class TestRunner {
    
	
}

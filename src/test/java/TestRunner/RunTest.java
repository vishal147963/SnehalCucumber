package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"AllFeatureFile/OHRM.feature"},
		glue= {"StepDef"},
		dryRun=true,
		monochrome=true
		
		)



public class RunTest {

}

package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepDefenitions.ProjectSpecificMethods;
@CucumberOptions(features="src/test/java/features", glue="stepDefenitions", monochrome=true,publish=true)
public class RunnerLogin extends ProjectSpecificMethods{



}

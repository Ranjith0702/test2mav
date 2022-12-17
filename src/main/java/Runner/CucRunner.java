package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

@io.cucumber.testng.CucumberOptions(features = {"src/main/resources/cuctestcase.feature"},
glue={"step"}
)
public class CucRunner extends AbstractTestNGCucumberTests {

}
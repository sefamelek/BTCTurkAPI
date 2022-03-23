package pro.btcturk;
import pro.btcturk.config.Logger;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "src/test/resources/features"
        },
        plugin = {
                "pretty",
                "html:target/cucumber/report-html.html",
                "json:target/jsonReports/report.json",
                "junit:target/cucumber/junit_report.xml",
                "timeline:target/cucumber/timeline"
        },
        monochrome = true,
        glue = {"pro.btcturk.steps"})
public class CucumberRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
    @Before
    public void setup(Scenario scenario) {
        Logger.info("Running scenario : " + scenario.getName());
    }
    @After
    public void tearDown(Scenario scenario) {
        Logger.info("Inside teardown(), now test will quit.....\n");
    }

}
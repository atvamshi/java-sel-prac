import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Project: java-selenium-practice-parent
 * Package: PACKAGE_NAME
 * <p>
 * User: vamshi
 * Date: 4/23/18
 * Time: 3:32 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        features = {"src/main/resources/ui/features"},
//        glue = {"src/main/org/mytests/step/definitions"},
        tags = "@PassTest",
        plugin = {"pretty", "html:target/test-report",
                "json:target/cucumber.json",
                "junit:target/test-report/cucumber-junit-report.xml"},
        monochrome = true
)
public class CucumberTestRunner {
}
//features = {"classpath:features"},
//        glue = {"classpath:hooks", "classpath:step/definitions"},

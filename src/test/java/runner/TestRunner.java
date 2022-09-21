package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/features",
        glue = "seleniumgluecode",
        plugin = {"json:test/report/cucumber_report.json"},
        snippets = SnippetType.CAMELCASE

        /* plugin= {"json:target/RunCuke/cucumber.json",
                "pretty","html:target/RunCuke/cucumber.html",
                "com.cucumber.listener.ExtentCucumberFormatter:resources/cucumbers-reports/report.html"}
        */
        // plugin = "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:resources/cucumber-reports/Run_<Current Time Stamp>/report.html",
)
public class TestRunner {

@AfterClass
    public static void showReport () {
    try {
        System.out.println("Generando reporte");
        String [] cmd = {"zsh","-c", "npm run report"};
        Runtime.getRuntime().exec(cmd);
        System.out.println("Report Generado");

    } catch (Exception e) {
        e.printStackTrace();
    }
}

}

package stepDefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.cucumber.java.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utility.TestContext;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hooks {
    static ExtentSparkReporter extentSparkReporter;
    static ExtentReports extentReports;
    static ExtentTest extentTest;
    WebDriver driver;
    static boolean screenshotExists = true;

    public Hooks(TestContext context) {
        driver = context.getWebDriverManager().getDriver();
    }

    @BeforeAll
    public static void setUp() throws IOException {
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss-SSS");
        String reportPath = "reports//TestReport_" + s.format(new Date()) + ".html";
        extentSparkReporter = new ExtentSparkReporter(reportPath);
        extentSparkReporter.config().setDocumentTitle("Automation Test");
        extentSparkReporter.config().setReportName("TEST RESULTS");
        extentSparkReporter.config().setTheme(Theme.DARK);
        extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);

        //create reports folder if doesn't exist
        if (new File("reports").exists()) {
            FileUtils.deleteDirectory(new File("reports"));
        }

        new File("reports").mkdir();

        if (new File("screenshots").exists() && screenshotExists == true) {
            FileUtils.deleteDirectory(new File("screenshots"));
        }
    }

    @AfterAll
    public static void tearDown() throws IOException {
        extentReports.flush();
    }

    @Before
    public void beforeTest(Scenario scenario) {
        extentTest = extentReports.createTest(scenario.getName());
    }

    @After
    public void afterTest(Scenario scenario) throws IOException {
        if (scenario.getStatus() == Status.PASSED) {
            Markup m = MarkupHelper.createLabel("Test Passed", ExtentColor.GREEN);
            extentTest.log(com.aventstack.extentreports.Status.PASS, m);
        }
        else if (scenario.getStatus() == Status.FAILED) {
            //create screenshots folder if doesn't exist
            if (new File("screenshots").exists() && screenshotExists == true) {
                FileUtils.deleteDirectory(new File("screenshots"));
                screenshotExists = false;
            }
            new File("screenshots").mkdir();

            //Capture screenshot for failed scenarios
            TakesScreenshot ts = (TakesScreenshot)driver;
            String screenshotPath = "screenshots/" + scenario.getName().replace(" ", "_") + ".png";
            String screenshotPathToAttach = "../screenshots/" + scenario.getName().replace(" ", "_") + ".png";
            File screenshotSource = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotSource, new File(screenshotPath));

            Markup m = MarkupHelper.createLabel("Test Failed", ExtentColor.RED);
            extentTest.log(com.aventstack.extentreports.Status.FAIL, m);
            extentTest.info("Screenshot attached", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPathToAttach).build());
        }
        else if(scenario.getStatus() == Status.SKIPPED) {
            Markup m = MarkupHelper.createLabel("Test Skipped", ExtentColor.AMBER);
            extentTest.log(com.aventstack.extentreports.Status.SKIP, m);
        }
        driver.quit();
    }
}

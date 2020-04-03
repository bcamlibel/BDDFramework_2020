package stepdefinition;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import runnerTest.webPages.ElementUtil;
import utils.BasePage;
import utils.ConfigReader;

public class SharedSD {

    ElementUtil elementUtil = new ElementUtil();
    private static Logger logger = Logger.getLogger(SharedSD.class);

    @Before
    public void setup() {
        logger.info("******************************");
        logger.info("Test setup!");
        ConfigReader.getProperty("browser");
        BasePage.get().get(ConfigReader.getProperty("url"));
        BasePage.get().manage().window().maximize();

    }


    @After
    public void teardown(Scenario scenario) {
        //if test failed - do this
        if (scenario.isFailed()) {
            logger.error("Test failed!");
            byte[] screenshot = ((TakesScreenshot) BasePage.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
            elementUtil.getScreenShot("pic");
        } else {
            logger.info("Cleanup!");
            logger.info("Test completed!");
        }
        logger.info("********************************");
        BasePage.close();
    }


}
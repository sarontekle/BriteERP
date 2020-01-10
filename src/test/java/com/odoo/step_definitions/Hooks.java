package com.odoo.step_definitions;

<<<<<<< HEAD
public class Hooks {
=======

import com.odoo.utilities.ConfigurationReader;
import com.odoo.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUp() throws InterruptedException {
        System.out.println("\nTest Setup");
        Driver.get().get(ConfigurationReader.get("url"));

    }

    @After
    public void tearDown(Scenario scenario) {
        // if scenario fails, take a screenshot
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } else{
            System.out.println("Test Ended");
        }
        Driver.closeDriver();
    }


<<<<<<< HEAD
    @After("@sales_manager")
    public void tearDownSalesManager(){
        System.out.println("This is coming from after scenario for sales managers\n");

    }



>>>>>>> 93779c8f5c4fad29d61e154ff9bc775db250e061
=======
>>>>>>> b47eaf3ca3c27b3ecf02f5e360ea0d792a3c05a8
}

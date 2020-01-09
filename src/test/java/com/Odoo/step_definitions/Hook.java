package com.Odoo.step_definitions;

import com.Odoo.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook {

    @Before
    public void setup(){
        System.out.println("################################");
        System.out.println("Test setup!");
        Driver.get().manage().window().maximize();
    }
    @After
    public void  teardown(Scenario scenario){
        // if test failed - do this
        if(scenario.isFailed()){
            System.out.println("Test failed!");
            byte[] screenshot = ((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot,"image/png");
        }else {
            System.out.println("Cleanup");
            System.out.println("Test completed!");
        }
        System.out.println("################################");
        // after every test, we are going to close the browser
        Driver.close();
    }
}

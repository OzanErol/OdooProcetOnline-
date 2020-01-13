package com.Odoo.step_definitions;

import com.Odoo.pages.LoginPage;
import com.Odoo.utilities.BrowserUtils;
import com.Odoo.utilities.ConfigurationReader;
import com.Odoo.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the log in page")
    public void user_is_on_the_log_in_page() {
        Driver.get().get(ConfigurationReader.getProperty("url"));
    }

    @Then("user logs in as {string}")
    public void user_logs_in_as(String role) {
        loginPage.login(role);

    }

    @Then("user verifies that {string}  page title is displayed")
    public void user_verifies_that_page_title_is_displayed(String pageTitle) {
        System.out.println(loginPage.getTitle());
        Assert.assertEquals(pageTitle,loginPage.getTitle());

    }

}

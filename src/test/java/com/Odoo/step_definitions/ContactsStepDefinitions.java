package com.Odoo.step_definitions;

import com.Odoo.pages.ContactsPage;
import com.Odoo.utilities.BrowserUtils;
import com.Odoo.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ContactsStepDefinitions {

    @Then("user navigates to Contacts module")
    public void user_navigates_to_Contacts_module() {
        ContactsPage contactsPage=new ContactsPage();
        contactsPage.ContactsElement.click();
        BrowserUtils.waitForPageToLoad(3);
        BrowserUtils.wait(2);
    }

    @Then("user sends {string} to search box")
    public void user_sends_to_search_box(String string) {
        ContactsPage contactsPage=new ContactsPage();
        contactsPage.SearchBoxElement.sendKeys(string);
        BrowserUtils.wait(2);
    }

    @Then("user verifies that contact {string} is displayed")
    public void user_verifies_that_contact_is_displayed(String string) {
        Driver.get().findElement(By.xpath("//a//em")).click();
        BrowserUtils.waitForPageToLoad(3);
        String actualResult = Driver.get().findElement(By.xpath("//div//strong//span")).getText();
        Assert.assertEquals(string,actualResult);
    }

    @Then("user clicks import button")
    public void user_clicks_import_button() {
        ContactsPage contactsPage=new ContactsPage();
        contactsPage.ImportButtonElement.click();
        BrowserUtils.wait(3);
    }

    @Then("user uploads a file")
    public void user_uploads_a_file() {
    ContactsPage contactsPage=new ContactsPage();
     contactsPage.ProvidePathImportElement.sendKeys("C:\\Users\\Aibek\\Desktop\\testDataExcel.xlsx");
     BrowserUtils.wait(2);
     contactsPage.ReloadFileElement.click();
     BrowserUtils.wait(2);
     contactsPage.DontImportElement.click();
     BrowserUtils.wait(2);
     contactsPage.ExternalIdElement.click();
     BrowserUtils.wait(3);
    }

}

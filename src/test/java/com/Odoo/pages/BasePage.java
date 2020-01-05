package com.Odoo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BasePage {

    public static void main(String[] args) {

        @FindBy(xpath="//div[@class='navbar-collapse collapse'] /ul[1]/li")
          public List<WebElement> moduleElement;
        public BasePage() {
            //this method requires to provide webdriver object for @FindBy
            //and page class
            //this means this page class
            PageFactory.initElements(Driver.get(), this);
        }
    }

}

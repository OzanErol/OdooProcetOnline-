package com.Odoo.pages;

public class BasePage {
    public static void main(String[] args) {
        System.out.println("Why it is not working");
        //dasdaadgit

        public BasePage() {
            //this method requires to provide webdriver object for @FindBy
            //and page class
            //this means this page class
            PageFactory.initElements(Driver.get(), this);
        }
    }
}

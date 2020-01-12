package com.Odoo.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends BasePage{

    @FindBy(xpath = "//a[@class='oe_menu_toggler']//span[contains(text(),'Contacts')]")
    public WebElement ContactsElement;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement SearchBoxElement;




}

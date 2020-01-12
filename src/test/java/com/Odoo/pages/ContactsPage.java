package com.Odoo.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends BasePage{

    @FindBy(xpath = "//a[@class='oe_menu_toggler']//span[contains(text(),'Contacts')]")
    public WebElement ContactsElement;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement SearchBoxElement;

    @FindBy(xpath = "//button[contains(@class,'button_import')]")
    public WebElement ImportButtonElement;

    @FindBy(xpath = "//input[@class=\"oe_import_file_show form-control\"]")
    public WebElement ProvidePathImportElement;

    @FindBy(xpath = "//label[@for='my-file-selector']")
    public WebElement LoadFileElement;

    @FindBy(xpath = "//button[contains(@class,'import_import')]")
    public WebElement ImportElement;

    @FindBy(xpath = "//a[starts-with(@class,'select2-choice ')]//span[@class='select2-arrow']")
    public WebElement DontImportElement;

    @FindBy(xpath = "//div[text()='External ID']")
    public WebElement ExternalIdElement;

    @FindBy(xpath = "//button[text()='Reload File']")
    public WebElement ReloadFileElement;







}

package com.Odoo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PointOfSalePage  extends  BasePage{

    @FindBy(xpath = "//button[@accesskey='k']")
    public WebElement squareViewButton;

    @FindBy(xpath = "//button[@accesskey='l']")
    public WebElement listViewButton;


    @FindBy(className = "o_searchview_input")
    public WebElement searchBox;

}

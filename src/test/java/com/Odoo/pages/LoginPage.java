package com.Odoo.pages;

import com.Odoo.utilities.BrowserUtils;
import com.Odoo.utilities.ConfigurationReader;
import com.Odoo.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    @FindBy(linkText = "Sign in")
    public WebElement signInButton;

    @FindBy(xpath = "//label[text()='Email']/following-sibling::input")
    public WebElement emailForLogin;

    @FindBy(xpath = "//label[text()='Password']/following-sibling::input")
    public WebElement passwordElement;

    @FindBy(xpath = "//button[text()='Log in']")
    public WebElement loginButton;

    public LoginPage(){
        //it's mandatory if you want to use @FindBy annotation
        //this means LoginPage class
        //Driver.get() return webDriver object
        PageFactory.initElements(Driver.get(),this);

    }

    public void login(String userName, String password){
        emailForLogin.sendKeys(userName);
        //Keys.ENTER to replace login click
        passwordElement.sendKeys(password, Keys.ENTER);
    }
    public  void login(){
        BrowserUtils.waitForVisibility(signInButton,3);
        BrowserUtils.waitForClickablility(signInButton,3);
        signInButton.click();
        emailForLogin.sendKeys(ConfigurationReader.getProperty("username5"));
        passwordElement.sendKeys(ConfigurationReader.getProperty("pospassword"));
        loginButton.click();
    }

}

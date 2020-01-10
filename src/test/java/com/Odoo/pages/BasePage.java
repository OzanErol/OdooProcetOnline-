package com.Odoo.pages;

import com.Odoo.utilities.BrowserUtils;
import com.Odoo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BasePage {
        @FindBy(xpath = "//a[text()='Log out']")
        public WebElement logOutElement;

        @FindBy(className = "oe_topbar_name")
        public WebElement userDropDownMenu;





        public BasePage() {
            //this method requires to provide webdriver object for @FindBy
            //and page class
            //this means this page class
            PageFactory.initElements(Driver.get(), this);
        }

        public void navigateToModule(String module){
                String moduleLocator = "//ul[contains(@class,'menu_placeholder')]//*[normalize-space()='"+ module + "']/a/span";
                WebDriverWait wait = new WebDriverWait(Driver.get(),20);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(moduleLocator)));
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath(moduleLocator)));

                WebElement moduleElement = Driver.get().findElement(By.xpath(moduleLocator));
                wait.until(ExpectedConditions.visibilityOf(moduleElement));
                wait.until(ExpectedConditions.elementToBeClickable(moduleElement));

                moduleElement.click();

        }

        public String getTitle(){
         BrowserUtils.wait(3);
         return Driver.get().getTitle();

        }
        public String getPageSubTitle(String subTitle){
           String subTitleLocator = "//li[text()='" + subTitle + "']";
           BrowserUtils.wait(3);
          return Driver.get().findElement(By.xpath(subTitle)).getText();

        }

        public void clickUserDropDownMenu(){
           BrowserUtils.waitForVisibility(userDropDownMenu,3);
           BrowserUtils.waitForClickablility(userDropDownMenu,3);
           userDropDownMenu.click();
        }


}

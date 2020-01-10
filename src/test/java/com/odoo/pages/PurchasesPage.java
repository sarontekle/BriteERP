package com.odoo.pages;


import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasesPage extends BasePage {
    public PurchasesPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a[@href='/web#menu_id=515&action=687']/span")
     public WebElement vendorbill;

    public void navigateToSubModule(String tab) {
        String tabLocator="//span[text()[contains(.,"+tab+")]]";
        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.get().findElement(By.xpath(tabLocator));
            new Actions(Driver.get()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }

    }
}

<<<<<<< HEAD
package com.odoo.Pages;

import com.odoo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasesPage extends BasePage{


    public PurchasesPage(){ PageFactory.initElements(Driver.get(),this); }

    @FindBy(xpath = "//button[normalize-space()='Create']")
    public WebElement createButton;

    @FindBy(xpath = "//button[normalize-space()='Import']")
    public WebElement importButton;

    @FindBy(xpath = "//span[normalize-space()='Requests for Quotation']")
    public WebElement requestsForQuotation;

    @FindBy(xpath = "//span[normalize-space()='Purchase Orders']")
    public WebElement purchaseOrders;

    @FindBy(xpath = "(//span[normalize-space()='Vendors'])[1]")
    public WebElement vendors;

    @FindBy(xpath = "(//span[normalize-space()='Products'])[5]")
    public WebElement products;

    @FindBy(xpath = "//span[normalize-space()='Incoming Products']")
    public WebElement incomingProducts;

    @FindBy(xpath = "//span[normalize-space()='Vendor Bills']")
    public WebElement vendorBills;

    @FindBy(xpath = "//button[@aria-label='list']")
    public WebElement listButton;

    @FindBy(xpath = "//button[@aria-label='kanban']")
    public WebElement kanbanButton;

    @FindBy(xpath = "//button[@aria-label='pivot']")
    public WebElement pivotButton;

    @FindBy(xpath = "//button[@aria-label='graph']")
    public WebElement graphButton;

    @FindBy(xpath = "//button[@aria-label='calendar']")
    public WebElement calendarButton;





}
=======
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
>>>>>>> b47eaf3ca3c27b3ecf02f5e360ea0d792a3c05a8

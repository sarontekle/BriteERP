package com.odoo.Pages;

import com.odoo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
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





}

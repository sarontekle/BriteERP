package com.odoo.pages;

import com.odoo.utilities.ConfigurationReader;
import com.odoo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class DashboardPage extends BasePage{

    public DashboardPage(){
        PageFactory.initElements(Driver.get(),this);
    }

//@FindBy(xpath = "//*[contains(text(),'Purchases')]")
//public WebElement purchase;
//
//
//    @FindBy(xpath = "//a[@href=\"/web#menu_id=515&action=687\"]/span")
//    public WebElement vendorbill;
//
//   @FindBy(xpath = "(//*[contains(text(),'Vendor Bills')])[3]")
//    public WebElement title;





}

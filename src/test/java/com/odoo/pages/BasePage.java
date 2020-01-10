<<<<<<< HEAD
package com.odoo.Pages;


import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;

public abstract class BasePage {

    @FindBy(xpath = "//li[@style='display: block;']")
    public List<WebElement> menuOptions;

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement userName;

    @FindBy(css = "div[class='loader-mask shown']")
    @CacheLookup
    protected WebElement loaderMask;

    @FindBy(xpath = "//span[@class='o_notification_counter badge']")
    public List<WebElement> notifications;

    @FindBy(linkText = "Log out")
    public WebElement logOutLink;

    @FindBy(linkText = "documentation")
    public WebElement documentation;

    @FindBy(linkText = "Support")
    public WebElement support;

    @FindBy(linkText = "Preferences")
    public WebElement preferences;

    @FindBy(linkText = "My Odoo.com account")
    public WebElement myAccount;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchInput;

    @FindBy(xpath = "//span[@class='o_channel_name']")
    public List<WebElement> channelNames;


    @FindBy(xpath = "//h4[@class='o_mail_open_channels']")
    public WebElement channels;

    @FindBy(xpath = "//div[@class='o_mail_sidebar_title']")
    public List<WebElement> mailSidebars;

    @FindBy(xpath = "//span[@title='Add']")
    public List<WebElement> addButtons;

    @FindBy(xpath = "//span[@title='Advanced Search...']")
    public WebElement advancedSearch;

    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }



    public void waitUntilLoaderScreenDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.get(), 5);
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
        public String getUserName () {

            waitUntilLoaderScreenDisappear();
            BrowserUtils.waitForVisibility(userName, 5);
            return userName.getText();
        }

        public void logOut () {
            BrowserUtils.waitFor(2);
            BrowserUtils.clickWithJS(userName);
            BrowserUtils.clickWithJS(logOutLink);
        }

        public void goToDocumentation () {
            waitUntilLoaderScreenDisappear();
            BrowserUtils.waitForClickablility(userName, 5).click();
            BrowserUtils.waitForClickablility(documentation, 5).click();
    }

    public void goToSupport () {
        waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForClickablility(userName, 5).click();
        BrowserUtils.waitForClickablility(support, 5).click();

    }

    public void goToPreferences () {
        waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForClickablility(userName, 5).click();
        BrowserUtils.waitForClickablility(preferences, 5).click();

    }

    public void goToMyAccount () {
        waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForClickablility(userName, 5).click();
        BrowserUtils.waitForClickablility(myAccount, 5).click();

    }


    public void navigateToModule(String tab) {
        String tabLocator = "//span[normalize-space()='" + tab + "' and contains(@class, 'oe_menu_text')]";
        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.get().findElement(By.xpath(tabLocator));
            new Actions(Driver.get()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }
    }


}
=======
package com.odoo.pages;

import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = ".oe_topbar_name")
    public WebElement myUser;

    @FindBy(xpath = "//a[@data-menu='logout']")
    public WebElement logOut;

    @FindBy(css = "ol[class='breadcrumb']")
    public WebElement pageSubTitle;

    @FindBy(css = "div[class='loader-mask shown']")
    @CacheLookup
    protected WebElement loaderMask;
    /**
     * @return page name, for example: Dashboard
     */
    public String getPageSubTitle() {
        //ant time we are verifying page name, or page subtitle, loader mask appears
        waitUntilLoaderScreenDisappear();
//        BrowserUtils.waitForStaleElement(pageSubTitle);
        return pageSubTitle.getText();
    }
    /**
     * Waits until loader screen present. If loader screen will not pop up at all,
     * NoSuchElementException will be handled  bu try/catch block
     * Thus, we can continue in any case.
     */
    public void waitUntilLoaderScreenDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.get(), 5);
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public String getUserName(){
        waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForVisibility(myUser, 5);
        return myUser.getText();
    }
    public void logOut(){
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(myUser);
        BrowserUtils.clickWithJS(logOut);
    }
    /**
     * This method will navigate user to the specific module in BriteERP application.
     * For example: if tab is equals to Activities, and module equals to Calls
     * @param module
     */
    public void navigateToModule(String module) {
        String moduleLocator = "//span[normalize-space()='"+ module + "' and contains(@class, 'oe_menu_text')]";
        try {
            BrowserUtils.waitForClickablility(By.xpath(moduleLocator), 5);
            WebElement tabElement = Driver.get().findElement(By.xpath(moduleLocator));
            new Actions(Driver.get()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(moduleLocator), 5);
        }
    }


}
>>>>>>> b47eaf3ca3c27b3ecf02f5e360ea0d792a3c05a8

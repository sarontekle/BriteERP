package com.odoo.Pages;


import com.odoo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

public abstract class BasePage {

    @FindBy(xpath = "//li[@style='display: block;']")
    public List<WebElement> menuOptions;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchInput;

    @FindBy(xpath = "(//span[@class='o_channel_name'])[1]")
    public WebElement inbox;

    @FindBy(xpath = "(//span[@class='o_channel_name'])[2]")
    public WebElement starred;

    @FindBy(xpath = "(//span[@class='o_channel_name'])[3]")
    public WebElement general;

    @FindBy(xpath = "(//span[@class='o_channel_name'])[4]")
    public WebElement projectAndTasks;

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










}
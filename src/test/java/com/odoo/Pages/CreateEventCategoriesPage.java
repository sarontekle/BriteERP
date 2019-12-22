package com.odoo.Pages;

import com.odoo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateEventCategoriesPage {

    public CreateEventCategoriesPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (xpath = "//span[contains(text(),'Event Categories')]")
    public WebElement eventCategories;

    @FindBy (xpath = "//input[@class='o_searchview_input']")
    public WebElement search;

    @FindBy (xpath = "//button[@accesskey='k']")
    public WebElement kanban;

    @FindBy (xpath = "//button[@aria-label='calendar']")
    public WebElement calendarButton;

    @FindBy (xpath = "//button[@accesskey='k']")
    public WebElement listButton;

    @FindBy (xpath = "//button[@aria-label='pivot']")
    public WebElement pivotList;

    @FindBy(xpath = "//span[@class='o_searchview_more fa fa-search-plus']")
    public WebElement advancedSearch;

    @FindBy (xpath = "//button/span[@class='fa fa-filter']")
    public WebElement filters;

    @FindBy (xpath = "//ul/li/a[contains(text(),'Unread Messages')]")
    public WebElement unreadMessage;

    @FindBy (xpath = "//div/button[@aria-expanded='true']")
    public WebElement groupBy;

    @FindBy(xpath = "//div/button/span[@class='fa fa-star']")
    public WebElement favorites;

}

package com.odoo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){ PageFactory.initElemnts(Driver.get(), this); }

    @FindBy(id = "login")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(className = "btn btn-primary")
    public WebElement submit;

    public void login(String userNameStr, String passwordStr){
        username.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
    }


}

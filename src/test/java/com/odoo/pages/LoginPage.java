package com.odoo.pages;

import com.odoo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){ PageFactory.initElements(Driver.get(), this); }

    @FindBy(id = "login")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

<<<<<<< HEAD
    @FindBy(xpath = "//*[@type='submit']")
=======
    @FindBy(css = "button[type='submit']")
>>>>>>> 9e50db7ac6fae382b07999a58cc827c7f6a4d768
    public WebElement submit;

    public void login(String userNameStr, String passwordStr){
        username.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
    }


}

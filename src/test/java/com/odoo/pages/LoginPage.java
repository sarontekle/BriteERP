package com.odoo.pages;

import com.odoo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

<<<<<<< HEAD

public class LoginPage {
=======
public class LoginPage{
>>>>>>> b47eaf3ca3c27b3ecf02f5e360ea0d792a3c05a8

    public LoginPage(){ PageFactory.initElements(Driver.get(), this); }

    @FindBy(id = "login")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

<<<<<<< HEAD
=======
    @FindBy(css = "button[type='submit']")
    public WebElement submit;
>>>>>>> b47eaf3ca3c27b3ecf02f5e360ea0d792a3c05a8

    public void login(String userNameStr, String passwordStr){
        username.sendKeys(userNameStr);
        password.sendKeys(passwordStr);

    }


}

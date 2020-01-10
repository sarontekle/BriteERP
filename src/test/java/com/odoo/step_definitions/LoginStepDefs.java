package com.odoo.step_definitions;

import com.odoo.pages.LoginPage;
import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.ConfigurationReader;
import com.odoo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("user on the login page");
    }

    @When("the user inputs valid credentials")
    public void the_user_inputs_valid_credentials() {
        System.out.println("entering user credentials");
        String username= ConfigurationReader.get("pos_manager_username");
        String password= ConfigurationReader.get("pos_manager_password");
        BrowserUtils.waitFor(2);
        LoginPage loginPage= new LoginPage();
        loginPage.login(username, password);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("verifying that user is logged in");
        BrowserUtils.waitFor(2);
        String actualTitle = Driver.get().getTitle();
        Assert.assertTrue(actualTitle.contains("Odoo"));
    }


}

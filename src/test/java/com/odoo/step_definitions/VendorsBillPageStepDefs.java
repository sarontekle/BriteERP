package com.odoo.step_definitions;

import com.odoo.pages.DashboardPage;
import com.odoo.pages.LoginPage;
import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.ConfigurationReader;
import com.odoo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VendorsBillPageStepDefs {

    @Given("The pos manager is on the log in page")
    public void the_pos_manager_is_on_the_log_in_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @When("The pos manager enters the pos manager creditials")
    public void the_pos_manager_enters_the_pos_manager_creditials() throws InterruptedException {

        String user = ConfigurationReader.get("pos_manager_username");
        String pass = ConfigurationReader.get("pos_manager_password");
        LoginPage login = new LoginPage();
        login.username.sendKeys(user);
        login.password.sendKeys(pass);
Thread.sleep(2000);
    }

    @Then("The pos manager should be able to log in")
    public void the_pos_manager_should_be_able_to_log_in() throws InterruptedException {
    LoginPage login = new LoginPage();
    login.submit.click();
Thread.sleep(4000);

    }

    @Given("The pos manager is on the dashboard page")
    public void the_pos_manager_is_on_the_dashboard_page() {


    }

    @When("the pos manager click on the purchase tab")
    public void the_pos_manager_click_on_the_purchase_tab() {
    DashboardPage dash = new DashboardPage();
    dash.purchase.click();


    }

    @Then("the pos manager should be able to navigate to purchase page")
    public void the_pos_manager_should_be_able_to_navigate_to_purchase_page() {

    }

    @Given("The pos manager is on the purchase page")
    public void the_pos_manager_is_on_the_purchase_page() {

    }

    @When("The pos manager clicks on the vendor bills tab on the left")
    public void the_pos_manager_clicks_on_the_vendor_bills_tab_on_the_left() {
        BrowserUtils.waitFor(3);
DashboardPage dash = new DashboardPage();
dash.vendorbill.click();
    }

    @Then("The pos manager should be able to naviagte to vendor bills page")
    public void the_pos_manager_should_be_able_to_naviagte_to_vendor_bills_page() {
//DashboardPage dash = new DashboardPage();
//        System.out.println(dash.title.getText());
    }



}

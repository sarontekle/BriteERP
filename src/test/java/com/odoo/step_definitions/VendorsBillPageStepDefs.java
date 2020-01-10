package com.odoo.step_definitions;

import com.odoo.pages.DashboardPage;
import com.odoo.pages.LoginPage;
import com.odoo.pages.PurchasesPage;
import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.ConfigurationReader;
import com.odoo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VendorsBillPageStepDefs {
    DashboardPage dashboard= new DashboardPage();
    PurchasesPage purchases= new PurchasesPage();

    @When("the pos manager click on the purchase tab")
    public void the_pos_manager_click_on_the_purchase_tab() {
       //BrowserUtils.waitFor(2);
       dashboard.navigateToModule("Purchases");


    }

    @When("The pos manager clicks on the vendor bills tab on the left")
    public void the_pos_manager_clicks_on_the_vendor_bills_tab_on_the_left() {
        BrowserUtils.waitFor(5);
        purchases.vendorbill.click();
    }

    @Then("verify that the page subtitle is {string}")
    public void verify_that_the_page_subtitle_is_Vendor_Bills(String subtitle) {
        Assert.assertEquals(dashboard.getPageSubTitle(),subtitle);
    }




}

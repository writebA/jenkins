package org.example.jenkins.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.jenkins.pages.AlertPage;
import org.testng.Assert;

import static io.qameta.allure.Allure.step;

public class AlertPageSteps {
    AlertPage alertPage = new AlertPage();

    @When("I generate JS alert")
    public void generateJSAlert() {
        alertPage.clickForJsAlertBtn();
    }

    @Then("Success message displayed")
    public void acceptAlert() {
        step("Check the success message displayed");
        Assert.assertTrue(alertPage.isSuccessLabelDisplayed(), "Success msg isn't displayed");
    }

    @When("I click to JS Confirm button")
    public void clickJSConfirmBtn() {
        step("I click on JS Confirm btn");
        alertPage.clickJSConfirm();
    }

    @Then("I see success message")
    public void successMsg() {
        step("Check success message OK displayed");
        Assert.assertTrue(alertPage.isSuccessMessageDisplayedOK(), "Success message is not displayed");
    }
}

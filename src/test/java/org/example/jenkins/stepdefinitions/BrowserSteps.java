package org.example.jenkins.stepdefinitions;

import aquality.selenium.browser.AlertActions;
import aquality.selenium.browser.AqualityServices;
import io.cucumber.java.en.When;

import static io.qameta.allure.Allure.step;


public class BrowserSteps {
    @When("I accept the Alert")
    public void acceptAlert(){
        step("I accept the alert");
        AqualityServices.getBrowser().handleAlert(AlertActions.ACCEPT);
    }
}

package org.example.jenkins.stepdefinitions;

import io.cucumber.java.en.Given;
import org.example.jenkins.pages.MainPage;

import static io.qameta.allure.Allure.step;


public class MainPageSteps {
    MainPage mainPage = new MainPage();

    @Given("I go to {string} link on the Main page")
    public void goTo(String page){
        step("I go to " + page + " on the Main page");
        mainPage.clickNavigationLink(page);
    }

}

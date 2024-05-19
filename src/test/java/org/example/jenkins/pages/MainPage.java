package org.example.jenkins.pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class MainPage extends Form {

    public MainPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, "Welcome to the-internet")), "Main Page");
    }

    private ILink getNavigationLink(String navigation) {
        return AqualityServices.getElementFactory().getLink(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH,
                navigation)), navigation);
    }

    public void clickNavigationLink(String navigation) {
        getNavigationLink(navigation).click();
    }
}
package org.example.jenkins.pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class AlertPage extends Form {
    private IElementFactory elementFactory = AqualityServices.getElementFactory();
    private static final String PAGE_NAME = "JavaScript Alerts";
    private final String successTextJSConfirm = "You clicked: Ok";
    private final By CLICK_FOR_JS_ALERT_BUTTON = By.xpath("//button[@onclick='jsAlert()']");
    private final By SUCCESS_MESSAGE = By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH,
            "You successfully clicked an alert"));
    private final By successJSConfirm = By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, successTextJSConfirm));
    private final By clickJSConfirm = By.xpath("//button[@onclick='jsConfirm()']");
    private IButton clickForJsAlertBtn = elementFactory.getButton(CLICK_FOR_JS_ALERT_BUTTON, "Click for JS alert");
    private ILabel successLbl = elementFactory.getLabel(SUCCESS_MESSAGE, "Success");
    private IButton clickJSConfirmBtn = elementFactory.getButton(clickJSConfirm, "Click on JS Confirm");
    private ILabel successJSConfirmLbl = elementFactory.getLabel(successJSConfirm, "Success JS confirm text");

    public AlertPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, PAGE_NAME)), PAGE_NAME);
    }

    public void clickForJsAlertBtn() {
        clickForJsAlertBtn.click();
    }

    public boolean isSuccessLabelDisplayed() {
        return successLbl.state().isDisplayed();
    }
    public void clickJSConfirm(){
        clickJSConfirmBtn.click();
    }
    public boolean isSuccessMessageDisplayedOK(){
        return successJSConfirmLbl.state().isDisplayed();
    }


}

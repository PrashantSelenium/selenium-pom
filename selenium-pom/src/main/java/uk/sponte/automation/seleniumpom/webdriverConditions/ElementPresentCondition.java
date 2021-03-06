package uk.sponte.automation.seleniumpom.webdriverConditions;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

import javax.annotation.Nullable;

/**
 * Created by n450777 on 04/03/2016.
 */
public class ElementPresentCondition implements ExpectedCondition<WebElement> {
    private WebElement element;

    public ElementPresentCondition(WebElement element) {
        this.element = element;
    }

    @Nullable
    @Override
    public WebElement apply(@Nullable WebDriver webDriver) {
        try {
            element.getTagName();
            return element;
        } catch (StaleElementReferenceException ex) {
            return null;
        }
    }
}

package com.odoo.utilities;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {

    /**
     * Switches to new window by the exact title. Returns to original window if target title not found
     *
     * @param targetTitle
     */
    public static void switchToWindow(String targetTitle) {
        String origin = Driver.get().getWindowHandle();
        for (String handle : Driver.get().getWindowHandles()) {
            Driver.get().switchTo().window(handle);
            if (Driver.get().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.get().switchTo().window(origin);
    }
}

/**
 * Moves the mouse to given element
 *
 * @param element on which to hover
 */
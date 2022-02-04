package com.ex.ui.pages;

import com.ex.ui.WebHelpers;
import org.openqa.selenium.WebDriver;

public abstract class BasePage extends WebHelpers {
    WebDriver webDriver;

    BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    BasePage(WebDriver webDriver, String url) {
        webDriver.get(url);
        this.webDriver = webDriver;
    }
}

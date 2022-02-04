package com.ex.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public LoginPage(WebDriver webDriver, String url) {
        super(webDriver, url);
    }

    private By emailField = By.xpath("//input[@id = 'name']");
    private By passwordField = By.xpath("//input[@id = 'password']");
    private By logInButton = By.xpath("//button[@id = 'button_primary']");

    public LoginPage inputEmail(String email) {
        findElement(webDriver, emailField).sendKeys(email);
        return this;
    }

    public LoginPage inputPassword(String password) {
        findElement(webDriver, passwordField).sendKeys(password);
        return this;
    }

    public LoginPage clickOnLoginButton(){
        findElement(webDriver, logInButton).click();
        return this;
    }
}

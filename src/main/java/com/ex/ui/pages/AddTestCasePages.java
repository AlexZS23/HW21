package com.ex.ui.pages;



import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;


public class AddTestCasePages extends BasePage {

    private By linkTestCases = By.xpath("//a[contains(text(), 'Test Cases')]");
    private By addTestCaseButton = By.xpath("//a[@id='sidebar-cases-add']");
    private By fillTitle = By.xpath("//input[@id='title']");
    private By tapTemplateList = By.xpath("//div[@id='template_id_chzn']");
    private By selectElementTestCaseText = By.xpath("//li[@id='template_id_chzn_o_2']");
    private By tapTypeList = By.xpath("//div[@id='type_id_chzn']");
    private By selectTypeRegression = By.xpath("//li[@id='type_id_chzn_o_8']");
    private By fillPreconditions = By.xpath("//div[@id='custom_preconds_display']");
    private By fillSteps = By.xpath("//div[@id='custom_steps_display']");
    private By fillExResult = By.xpath("//div[@id='custom_expected_display']");
    private By clickAddTestCaseButton = By.xpath("//button[@id='accept']");
    private By successfulCreationText  = By.xpath("//div[contains(text(), 'Successfully added the new test case.')]");


    public AddTestCasePages(WebDriver webDriver) {
        super(webDriver);
    }

    public AddTestCasePages tapLinkTestCases() {
        findElement(webDriver, linkTestCases).click();
        return this;
    }

    public AddTestCasePages tapAddTestCaseButton() {
        findElement(webDriver, addTestCaseButton).click();
        return this;
    }

    public AddTestCasePages fillTitleField(String titleName) {
        findElement(webDriver, fillTitle).sendKeys(titleName);
        return this;
    }

    public AddTestCasePages clickOnTemplate() {
        findElement(webDriver, tapTemplateList).click();
        return this;
    }

    public AddTestCasePages selectTemplate() {
        findElement(webDriver, selectElementTestCaseText).click();
        return this;
    }

    public AddTestCasePages clickOnType() {
        findElement(webDriver, tapTypeList).click();
        return this;
    }

    public AddTestCasePages selectType() {
        findElement(webDriver, selectTypeRegression).click();
        return this;
    }

    public AddTestCasePages fillPreconditions(String preconditionText) {
        findElement(webDriver, fillPreconditions).sendKeys(preconditionText);
        return this;
    }

    public AddTestCasePages fillSteps(String steps) {
        findElement(webDriver, fillSteps).sendKeys(steps);
        return this;
    }

    public AddTestCasePages fillExpectedResult (String expectedResult) {
        findElement(webDriver, fillExResult).sendKeys(expectedResult);
        return this;
    }

    public AddTestCasePages clickAddTestCase() {
        findElement(webDriver, clickAddTestCaseButton).click();
        return this;
    }

    public AddTestCasePages verifySuccessMessage() {
        boolean isTextDisplayed = findElement(webDriver, successfulCreationText).isDisplayed();
        Assert.assertTrue(isTextDisplayed, "Something is wrong :(");
        return this;
    }

}



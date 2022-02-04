package com.ex.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PagesForTestCasePassing extends BasePage {

    private By clickTestRunLink = By.xpath("//a[contains(text(), 'Test Runs')]");
    private By selectTestRun = By.xpath("//a[contains(text(), 'Test Run 2/4/2022')]");
    private By selectTesCase = By.xpath("//a[contains(text(), 'FirstCheck')]");
    private By clickOnAddResultButton = By.xpath("//a[@id='addResult']");
    private By openStatusList = By.xpath("//div[@id='addResultStatus_chzn']");
    private By selectBlockedStatus = By.xpath("//li[@id='addResultStatus_chzn_o_1']");
    private By addComment = By.xpath("//div[@id='addResultComment_display']");
    private By saveResult = By.xpath("//button[@id='addResultSubmit']");
    private By finalStatusBlocked = By.xpath("//div[@class='change-meta']/span[contains(text(), 'Blocked')]");


    public PagesForTestCasePassing(WebDriver webDriver) {
        super(webDriver);
    }

    public PagesForTestCasePassing tapLinkTestRuns() {
        findElement(webDriver, clickTestRunLink).click();
        return this;
    }

    public PagesForTestCasePassing selectTestRuns() {
        findElement(webDriver, selectTestRun).click();
        return this;
    }

    public PagesForTestCasePassing selectTestCase() {
        findElement(webDriver, selectTesCase).click();
        return this;
    }

    public PagesForTestCasePassing clickOnAddResult() {
        findElement(webDriver, clickOnAddResultButton).click();
        return this;
    }

    public PagesForTestCasePassing openStatusList() {
        findElement(webDriver, openStatusList).click();
        return this;
    }

    public PagesForTestCasePassing selectBlockedStatus() {
        findElement(webDriver, selectBlockedStatus).click();
        return this;
    }

    public PagesForTestCasePassing addComment(String someComment) {
        findElement(webDriver, addComment).sendKeys(someComment);
        return this;
    }

    public PagesForTestCasePassing saveResult() {
        findElement(webDriver, saveResult).click();
        return this;
    }

    public PagesForTestCasePassing reloadPage() {
        webDriver.navigate().refresh();
        return this;
    }

    public PagesForTestCasePassing verifyStatus(){
        String resultBlocked = webDriver.findElement(finalStatusBlocked).getText().trim();
        Assert.assertEquals(resultBlocked, "Blocked");
        return this;
    }
}

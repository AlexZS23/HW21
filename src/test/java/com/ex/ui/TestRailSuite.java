package com.ex.ui;

import com.ex.ui.pages.AddTestCasePages;
import com.ex.ui.pages.LoginPage;
import com.ex.ui.pages.PagesForTestCasePassing;
import org.testng.annotations.Test;

public class TestRailSuite extends BaseTest{

    @Test
    public void createTestCase() {

        new LoginPage(webDriver, "https://alex23galamaga.testrail.io/index.php?/auth/login")
                .inputEmail("alex23galamaga@mailforspam.com")
                .inputPassword("7eU2b5sNV9Hq8TC")
                .clickOnLoginButton();

        new AddTestCasePages(webDriver)
                .tapLinkTestCases()
                .tapAddTestCaseButton()
                .fillTitleField("My First TestCase")
                .clickOnTemplate()
                .selectTemplate()
                .clickOnType()
                .selectType()
                .fillPreconditions("Create your test.")
                .fillSteps("Launch your test.")
                .fillExpectedResult("Test was successfully created.")
                .clickAddTestCase()
                .verifySuccessMessage();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void passTestCase() {

        new LoginPage(webDriver, "https://alex23galamaga.testrail.io/index.php?/auth/login")
                .inputEmail("alex23galamaga@mailforspam.com")
                .inputPassword("7eU2b5sNV9Hq8TC")
                .clickOnLoginButton();

        new PagesForTestCasePassing(webDriver)
                .tapLinkTestRuns()
                .selectTestRuns()
                .selectTestCase()
                .clickOnAddResult()
                .openStatusList()
                .selectBlockedStatus()
                .addComment("HomeWork 21")
                .saveResult()
//                .reloadPage()
                .verifyStatus();

    }
}

package pageobjects.test;

import browserdriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.SignInPage;
import reporting.TestLogger;

import java.util.logging.Logger;

public class SignInPageTest extends BrowserDriver {
    HomePage homePage = null;
    SignInPage signInPage = null;

    @BeforeMethod
    public void initializeElement(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        signInPage =PageFactory.initElements(driver, SignInPage.class);
    }

    @Test
    public void typeInvalidEmailEInvalidPasswordToSignin(){
        homePage.clickSignIn();
        signInPage.typeInvalidEmailEmptyPasswordToSignIn();
        String actuealErrorMessege = signInPage.getErrorMessegeInvalidEmaiAndPassword();
        String expectedErrorMessege = "Invalid password";
        Assert.assertEquals(actuealErrorMessege, expectedErrorMessege);
        TestLogger.log("Test Passed");
    }
}

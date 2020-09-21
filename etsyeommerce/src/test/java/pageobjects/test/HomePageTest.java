package pageobjects.test;

import browserdriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;

public class HomePageTest extends BrowserDriver {
    HomePage homePage = null;
   @BeforeMethod
    public void initializeElements(){
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
    @Test
    public void seaerchTest(){
        homePage.search();
    }

}

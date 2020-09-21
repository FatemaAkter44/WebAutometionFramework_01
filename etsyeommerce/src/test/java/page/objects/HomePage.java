package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class HomePage {
    WebDriver driver =null;

    @FindBy(how = How.CLASS_NAME, using ="wt-input wt-input-btn-group__input global-enhancements-search-input-btn-group__input wt-pr-xs-7")
    WebElement searchBox;
    @FindBy(how = How.CLASS_NAME, using = "wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin")
    WebElement signIn;
    public void clickSignIn(){
        signIn.click();
        TestLogger.log("clicked on Sign In button");
    }
    public void getPageTittle(){
        String pageTittle = driver.getTitle();
        TestLogger.log("page tittle : " + pageTittle);
    }
    public void search(){
        searchBox.sendKeys("Indoor plants");
    }
}

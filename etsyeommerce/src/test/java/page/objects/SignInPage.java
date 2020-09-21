package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class SignInPage {
    @FindBy(how = How.ID, using = "join_neu_email_field")
    WebElement EmailFildToSignin;
    @FindBy(how = How.ID, using = "wt-btn wt-btn--primary width-full")
    WebElement signinButton;
    @FindBy(how = How.ID, using = "join_neu_password_field")
    WebElement passwordFildToSignIn;
    @FindBy(how = How.ID, using = "aria-join_neu_email_field-error")
    WebElement errorMessegeEmailFildEmpty;
    @FindBy(how = How.ID, using = "aria-join_neu_password_field-error")
    WebElement errorMessegePasswordEmpty;
    @FindBy(how = How.ID, using = "aria-join_neu_email_field-error")
    WebElement errorMessegeInvalidEmaiPassword;
    public void typeInvalidEmailEmptyPasswordToSignIn(){
        TestLogger.log("Inputing messege on Email fild");
        EmailFildToSignin.sendKeys("fatema@gmail.com");
        TestLogger.log("Typed an invalid emil on email ield");
        TestLogger.log("Keep password fild empty");

        //signinButton.click();
        clickSignInButton();
    }
    public void typeInvalidEmailEInvalidPasswordToSignin(){
        TestLogger.log("Inputing an invalidvalid email address");
        EmailFildToSignin.sendKeys("fatema@gmail.com");
        TestLogger.log("Typed a invalid Email address");
        TestLogger.log("Type an invalid email");
        passwordFildToSignIn.sendKeys("1234");
        TestLogger.log("typed an invalid password");
        //signinButton.click();
        clickSignInButton();
    }
    public void validEmailAndInvalidPasswordToSignin(){
        TestLogger.log("Inputing an validvalid email address");
        EmailFildToSignin.sendKeys("fatema@techrowfund.com");
        TestLogger.log("Typed a valid Email address");
        TestLogger.log("Enter a Invalid Password");
        passwordFildToSignIn.sendKeys("12345");
        TestLogger.log("Typed an invalid password");
        //signinButton.click();
        clickSignInButton();
    }
    public void emptyEmailFildAndInvalidPasswordToSignIN(){
        TestLogger.log("Keep signin fild empty");
        EmailFildToSignin.sendKeys("");
        TestLogger.log("The email field is empty");
        TestLogger.log("Enter a valid password to log in");
        passwordFildToSignIn.sendKeys("IloveMySeLf");
        TestLogger.log("Typed an valid Passowerd");
        //signinButton.click();
        clickSignInButton();
    }

    public void EmptyEmailAndvalidPasswordToSignin(){
        TestLogger.log("Enter a valid password to log in");
        passwordFildToSignIn.sendKeys("IloveMySeLf");
        TestLogger.log("Typed an valid Passowerd");
        //signinButton.click();
        clickSignInButton();
    }
    public void emptyEmailAndPasswordToSignIn(){
        TestLogger.log("keep invalid fild empty");
        TestLogger.log("keep password fild empty");

        //TestLogger.log("");
        clickSignInButton();
        signinButton.click();
    }
    public void ValidEmailValidPasswordToSignIn(){
        TestLogger.log("Inputing an validvalid email address");
        EmailFildToSignin.sendKeys("fatema@techrowfund.com");
        TestLogger.log("Typed a valid Email address");
        TestLogger.log("Enter a valid password to log in");
        passwordFildToSignIn.sendKeys("IloveMySeLf");
        TestLogger.log("Typed an valid Passowerd");
        //signinButton.click();
        clickSignInButton();
    }

    public void clickSignInButton(){
        TestLogger.log("Click on sign in button");
        signinButton.click();
        TestLogger.log("clicked on sign in button");
    }

    public String getErrorMessegeEmptyEmai(){
        String massege = errorMessegeEmailFildEmpty.getText();
        return massege;
    }
    public String getErrorMessegeEmptyPassword(){
        String massege = errorMessegePasswordEmpty.getText();
        return massege;
    }
    public String getErrorMessegeInvalidEmaiAndPassword(){
        String massege = errorMessegeInvalidEmaiPassword.getText();
        return massege;
    }
    public String getErrorMessegeValidEmaiAndInalidPassword(){
        String massege = "Invalid password";
        return massege;
    }

}

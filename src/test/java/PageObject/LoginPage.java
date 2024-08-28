package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	 public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements( rdriver,this);
	}
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement txtSign;
	
	@FindBy(name="email")
	WebElement txtEmail;
	
	@FindBy(id="continue")
	WebElement txtContinue;
	
	@FindBy(id="ap_password")
	WebElement txtPassword;
	
	@FindBy(id="signInSubmit")
	WebElement txtSignUp;
	
	
	public void clickSignIn()
	{
		txtSign.click();
	}

	
	public void setUserName(String uname)
	{
		txtEmail.sendKeys(uname);
	}
	public void clickContinue()
	{
		txtContinue.click();
	}
	public void setPassward(String passward)
	{
		txtPassword.sendKeys(passward);
	}
	public void clickSign()
	{
		txtSignUp.click();
	}
}

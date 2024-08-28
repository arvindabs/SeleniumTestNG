package TestCase;
import org.testng.annotations.Test;

import PageObject.LoginPage;
import PageObject.SearchProduct;
public class TC_LoginTest001 extends BaseClass {
	
	@Test
	public void loginTest()
	{
       driver.get(BaseURL);
		
		LoginPage lp= new LoginPage(driver);
		lp.clickSignIn();
		lp.setUserName(username);
		lp.clickContinue();
		lp.setPassward(passward);
		lp.clickSign();
		
		SearchProduct sp=new SearchProduct(driver);
		sp.entryField("LED TV");
		sp.ClickButton();
	}

}

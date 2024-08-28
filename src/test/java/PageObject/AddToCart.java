package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
		WebDriver ldriver;
		
		 public AddToCart(WebDriver rdriver)
		 {
			ldriver=rdriver;
			PageFactory.initElements( rdriver,this);
		
}
		 @FindBy(name="submit.add-to-cart")
			WebElement txtCart;

       public void clickAddToCart()
{
    	   txtCart.click();
}
}
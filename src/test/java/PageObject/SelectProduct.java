package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectProduct {
	
	WebDriver ldriver;
	
	 public SelectProduct(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements( rdriver,this);
	}
	
	 @FindBy(xpath="//span[normalize-space()='Samsung 138 cm (55 inches) 4K Ultra HD AI Smart Neo-QLED TV QA55QN85DBULXL (Graphite Black)']")
	 WebElement textclick;
	 
	 public void clickProduct()
		{
		 textclick.click();
		}
	 
}
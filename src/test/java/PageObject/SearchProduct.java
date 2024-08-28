package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct {
	WebDriver ldriver;
	
	 public SearchProduct(WebDriver rdriver)
	 {
		ldriver=rdriver;
		PageFactory.initElements( rdriver,this);
	}
	
	@FindBy(name="field-keywords")
	WebElement txtSearch;
	
	@FindBy(id="nav-search-submit-button")
	WebElement textclick;
	
	public void entryField(String Search)
	{
		txtSearch.sendKeys(Search);
	}
	public void ClickButton()
	{
		textclick.click();
	}
}

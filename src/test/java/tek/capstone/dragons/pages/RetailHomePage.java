package tek.capstone.dragons.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class RetailHomePage extends BaseSetup {

	public  RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id = "hamburgerBtn")
	public WebElement allOption;
	
	@FindBy(xpath = "//div[@data-id='1']")
	public WebElement electronics;
	
	@FindBy(xpath = "//div[@data-id='2']")
	public WebElement computers;
	
	
	@FindBy(xpath = "//div[@data-id='3']")
	public WebElement smartHome;
	
	@FindBy (xpath = "//div[@data-id='4']")
	public WebElement sports;
	

	@FindBy (xpath = "//div[@data-id='5']")
	public WebElement automative;
	
	
	
	
	
	
	
	
	
	
}

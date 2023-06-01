package tek.capstone.dragons.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.capstone.dragons.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {

	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "signinLink")
	public WebElement singInOption;

	@FindBy(id = "email")
	public WebElement emailInput;

	@FindBy(id = "password")
	public WebElement passwordInput;

	@FindBy(id = "loginBtn")
	public WebElement loginBttn;

	@FindBy(id = "accountLink")
	public WebElement accountOption;

	@FindBy(linkText = "Orders")
	public WebElement ordersOption;

	@FindBy(id = "logoutBtn")
	public WebElement logoutOPtion;

	@FindBy(id = "newAccountBtn")
	public WebElement newAccountBttn;

	@FindBy(id = "nameInput")
	public WebElement nameField;

	@FindBy(id = "emailInput")
	public WebElement emailField;

	@FindBy(id = "passwordInput")
	public WebElement passwordField;

	@FindBy(id = "confirmPasswordInput")
	public WebElement passConfirmField;

	@FindBy(id = "signupBtn")
	public WebElement signUPBttn;
}

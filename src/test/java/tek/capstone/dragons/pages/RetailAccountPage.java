package tek.capstone.dragons.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {

	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "accountLink")
	public WebElement accountOption;

	@FindBy(id = "nameInput")
	public WebElement nameInput;

	@FindBy(id = "personalPhoneInput")
	public WebElement phoneInput;

	@FindBy(id = "personalUpdateBtn")
	public WebElement updateBttn;

	@FindBy(xpath = "//html//body//div//div[2]")
	public WebElement successMessage;

	@FindBy(xpath = "//p[text()='Add a payment method']")
	public WebElement addAPaymentMethodLink;

	@FindBy(xpath = "//input[@id ='cardNumberInput']")
	public WebElement cardNumberInput;

	@FindBy(xpath = "//input[@id ='nameOnCardInput']")
	public WebElement nameOnCardInput;

	@FindBy(xpath = "//select[@id ='expirationMonthInput']")
	public WebElement expirationMonthInput;

	@FindBy(xpath = "//select[@id ='expirationYearInput']")
	public WebElement expirationYearInput;

	@FindBy(xpath = "//input[@id ='securityCodeInput']")
	public WebElement securityCodeInput;

	@FindBy(xpath = "//button[@id= 'paymentSubmitBtn']")
	public WebElement paymentSubmitBttn;

	@FindBy(xpath = "//p[@class='account__payment-sub-title']")
	public WebElement cardOption;

	@FindBy(xpath = "//div[@class='flex gap-2 py-2']//child::button[2]")
	public WebElement removeBttn;

	@FindBy(xpath = "//div[@class='account__address-new-wrapper']")
	public WebElement addAdressOption;

	@FindBy(xpath = "//select[@id='countryDropdown']")
	public WebElement countryDowpDown;

	@FindBy(xpath = "//input[@id='fullNameInput']")
	public WebElement fullNameInput;

	@FindBy(xpath = "//input[@id='phoneNumberInput']")
	public WebElement phoneNumberInput;

	@FindBy(xpath = "//input[@id='streetInput']")
	public WebElement streetInput;

	@FindBy(xpath = "//input[@id='apartmentInput']")
	public WebElement apartmentInput;

	@FindBy(xpath = "//input[@id='cityInput']")
	public WebElement cityInput;

	@FindBy(xpath = "//select[@name='state']")
	public WebElement stateInput;

	@FindBy(xpath = "//input[@id='zipCodeInput']")
	public WebElement zipCodeInput;

	@FindBy(xpath = "//button[@id='addressBtn']")
	public WebElement addressBttn;

	@FindBy(xpath = "//div[@class='flex gap-2 py-2']//child::button[1]")
	public WebElement editCardBttn;

	@FindBy(xpath = "//input[@id='cardNumberInput']")
	public WebElement editCardNumberInput;

	@FindBy(xpath = "//input[@id='nameOnCardInput']")
	public WebElement editNameOnCardInput;

	@FindBy(xpath = "//select[@id='expirationMonthInput']")
	public WebElement editExpirationMonthInput;

	@FindBy(xpath = "//select[@id='expirationYearInput']")
	public WebElement editExpirationYearInput;

	@FindBy(xpath = "//input[@id='securityCodeInput']")
	public WebElement editSecurityCodeInput;

	@FindBy(xpath = "//button[@id='paymentSubmitBtn']")
	public WebElement editpaymentSubmitBttn;

	@FindBy(xpath = "//div[@class='account__address-btn-wrapper']//child::button[1]")
	public WebElement editAddresOption;

	@FindBy(xpath = "//select[@name='country']")
	public WebElement editCountry;

	@FindBy(xpath = "//input[@id='fullNameInput']")
	public WebElement editFullNameInput;

	@FindBy(xpath = "//input[@id='phoneNumberInput']")
	public WebElement editPhoneNumberInput;

	@FindBy(xpath = "//input[@id='streetInput']")
	public WebElement editStreetInput;
	
	@FindBy(xpath = "//input[@id='apartmentInput']")
	public WebElement editApartmentInput;
	
    @FindBy(xpath = "//input[@id='cityInput']")
	public WebElement editCityInput;
	
    @FindBy(xpath = "//select[@name='state']")
	public WebElement editState;
	
    @FindBy(xpath = "//input[@id='zipCodeInput']")
  	public WebElement editZipCoseInput;
	
	@FindBy(xpath ="//button[@id='addressBtn']")
	public WebElement editAddressBttn;
	
	@FindBy(xpath ="//div[@class='account__address-btn-wrapper']//child::button[2]")
	public WebElement  removeAddressBttn;
	
	
	
	
}

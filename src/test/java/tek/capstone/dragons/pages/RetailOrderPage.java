package tek.capstone.dragons.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {

	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);

	}

	@FindBy(xpath = "//select[@id='search']")
	public WebElement allDepartmentSection;
	
	@FindBy(xpath ="//option[text()='Smart Home']")
	public WebElement smartHomeOption;
	
	@FindBy(xpath ="//input[@id='searchInput']")
	public WebElement searchInput;
	
	@FindBy(xpath = "//button[@id='searchBtn']")
	public WebElement searchBttn;
	
	//p[text()='Kasa Outdoor Smart Plug']
	@FindBy(xpath = "//div//p[text()='Kasa Outdoor Smart Plug']")
	public WebElement itemKasaOutdoor;
	
	@FindBy(xpath ="//button[@id='addToCartBtn']")
	public WebElement addToCartBttn;

	//select[@class='product__select']
	@FindBy(css ="#root > div.main-container > div:nth-child(1) > div.bg-gray-100 > div > div.product__layout > div.product__cart > div > div > select")
	public WebElement quantityOption;
	
	@FindBy(xpath ="//a[@id='orderLink']")
	public WebElement ordersOption;
	
	@FindBy(css = "p.order__item-name")
	public WebElement firstOrderLink;
	
	@FindBy(css ="button#cancelBtn")
	public WebElement cancelOrderBttn;
	
	@FindBy(xpath ="//div//p[text()='Apex Legends - 1,000 Apex Coins']")
	public WebElement itemKasaOutdoor2;
	
	@FindBy(xpath = "//div[@id='cartBtn']")
	public WebElement cartOption;
	
	@FindBy(xpath ="//button[@id='proceedBtn']")
	public WebElement proccedBttn;
	
	@FindBy(id="placeOrderBtn")
	public WebElement placeOrderBttn;
	
	@FindBy(xpath = "//div//p[text()='Order Placed, Thanks']")
	public WebElement orderPlacedMessage;
	
	@FindBy(id = "orderLink")
	public WebElement orderBttn;
	
	@FindBy(xpath ="//div//p[text()='May 11, 2023']")
	public WebElement firstOrderInList;
	
	@FindBy(xpath = "//*[@id=\"cancelBtn\"]")
	public WebElement cancelBttn;
	
	@FindBy(xpath = "//select[@id='reasonInput']")
	public WebElement dropDownForCancleOrder;
	
	@FindBy(xpath = "//div//button[@class='order__cancel-submit']")
	public WebElement cancelOrder;
	
	@FindBy(xpath ="//div//p[text()='Your Order Has Been Cancelled']")
	public WebElement orderCancleMessage;
	
	@FindBy(xpath ="//div//button[@id='returnBtn']")
	public WebElement retrunItemBttn;
	
	@FindBy(xpath ="//div//select[@id='reasonInput']")
	public WebElement dropDownForReturnOrder;
	
	@FindBy(xpath = "//div//select[@id='dropOffInput']")
	public WebElement dropDownForDropOffservice;
	
	@FindBy(xpath = "//div//button[@class='order__cancel-submit']")
	public WebElement orderRetrunbttn;
	
	@FindBy(xpath = "//div//p[text()='Return was successfull']")
	public WebElement orderReturnMessage;
	
	@FindBy(xpath = "//div//button[@id='reviewBtn']")
	public WebElement reviewBttn;
	
	@FindBy(xpath = "//div//input[@id='headlineInput']")
	public WebElement headlineInput;
	
	@FindBy(xpath = "//div//textarea[@id='descriptionInput']")
	public WebElement descriptionInput;
	
	@FindBy(xpath = "//div//button[@id='reviewSubmitBtn']")
	public WebElement addYourReview;
	
	//div[text()='Your review was added successfully']
	@FindBy(xpath = "//div//div[text()='Your review was added successfully']")
    public WebElement reviewAddedMessage;




	



}

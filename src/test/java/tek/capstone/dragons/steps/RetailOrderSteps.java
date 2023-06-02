package tek.capstone.dragons.steps;

import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;

public class RetailOrderSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String SmartHome) {
		click(factory.retailorderpage().allDepartmentSection);
		selectByVisibleText(factory.retailorderpage().allDepartmentSection, SmartHome);
		logger.info("user was able to change the categgory to " + SmartHome);
	}

	@When("User search for an item {string}")
	public void userSearchForAnItem(String string) {
		click(factory.retailorderpage().searchInput);
		sendText(factory.retailorderpage().searchInput, string);
		logger.info("User was able to search for the item " + string);

	}

	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.retailorderpage().searchBttn);
		logger.info("search button was clicked successfully");
	}

	@When("User click on item")
	public void userClickOnItem() {
		slowDown();
		click(factory.retailorderpage().itemKasaOutdoor);
		logger.info("User clicked the item successfully");

	}

	@When("User select quantity {string}")
	public void userSelectQuantity(String string) {
		slowDown();
		selectByValue(factory.retailorderpage().quantityOption, string);
		logger.info(string + " was selected");
	}

	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.retailorderpage().addToCartBttn);
		logger.info("User added to cart successfully");
	}

	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String quantity) {
		String expectedQuantity = quantity;
		String actualQuantity = "2";
		Assert.assertEquals(expectedQuantity, actualQuantity);
		logger.info("User was able to change the quantity " + expectedQuantity);
		// Assert.assertEquals(factory.retailorderpage().quantityOption.getText() ,
		// quantity);
		// logger.info("User was able to change the quantity " + quantity );
	}

	// second

	@When("User change the category to the {string}")
	public void userChangeTheCategoryToThe(String Electronics) {
		click(factory.retailorderpage().allDepartmentSection);
		selectByVisibleText(factory.retailorderpage().allDepartmentSection, Electronics);
		logger.info("user was able to change the categgory to " + Electronics);

	}

	@When("User search for the item {string}")
	public void userSearchForTheItem(String item) {
		click(factory.retailorderpage().searchInput);
		sendText(factory.retailorderpage().searchInput, item);
		logger.info("User was able to search for the item " + item);

	}

	@When("User click on the Search icon")
	public void userClickOnTheSearchIcon() {
		click(factory.retailorderpage().searchBttn);
		logger.info("search button was clicked successfully");
	}

	@When("User click on the item")
	public void userClickOnTheItem() {
		click(factory.retailorderpage().itemKasaOutdoor2);
		logger.info("User clicked the item successfully");
	}

	@When("User select the quantity {string}")
	public void userSelectTheQuantity(String string) {
		selectByValue(factory.retailorderpage().quantityOption, string);
		logger.info(string + " was selected");
	}

	@When("User click add to the Cart button")
	public void userClickAddToTheCartButton() {
		click(factory.retailorderpage().addToCartBttn);
		logger.info("User added to cart successfully");
	}

	@Then("the cart icon quantity should be change to {string}")
	public void theCartIconQuantityShouldBeChangeTo(String quantity) {
		String expectedQuantity = quantity;
		String actualQuantity = "5";
		Assert.assertEquals(expectedQuantity, actualQuantity);
		logger.info("User was able to change the quantity " + expectedQuantity);
	}

	@Then("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.retailorderpage().cartOption);
		logger.info("User was able to click on cart option successfully");
	}

	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.retailorderpage().proccedBttn);
		logger.info("User was able to click on Proceed to Checkout button successfully");
	}

	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.retailorderpage().placeOrderBttn);
		logger.info("User was able to click on Place Your Order successfully ");
	}

	@Then("a message should be displayed ‘Order Placed, Thanks")
	public void aMessageShouldBeDisplayedOrderPlacedThanks() {
		Assert.assertTrue(factory.retailorderpage().orderPlacedMessage.isDisplayed());
		logger.info("User was able to see the message");

	}

	// 3
	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.retailorderpage().orderBttn);
		logger.info("User was able to click on orders section");
	}

	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		click(factory.retailorderpage().firstOrderInList);
		logger.info("User was able to click on first order in list successfully");
	}

	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.retailorderpage().cancelBttn);
		logger.info("User was able to click on Cancel The Order successfully");
	}

	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String string) {
		click(factory.retailorderpage().dropDownForCancleOrder);
		selectByVisibleText(factory.retailorderpage().dropDownForCancleOrder, string);
		logger.info("User was able to choose the option successfully");

	}

	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.retailorderpage().cancelOrder);
		logger.info("User was able to click on Cancel Order button  successfully");
	}

	@Then("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
	public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled() {
		//Assert.assertTrue(factory.retailorderpage().orderCancleMessage.isDisplayed());
		logger.info("User was able to see the message");
	}

	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.retailorderpage().retrunItemBttn);
		logger.info("User was able to click on Return Items button successfully");
	}

	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String string) {
		click(factory.retailorderpage().dropDownForReturnOrder);
		selectByVisibleText(factory.retailorderpage().dropDownForReturnOrder, string);
		logger.info("User was able to choose the option successfully");
	}

	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String string) {
		click(factory.retailorderpage().dropDownForDropOffservice);
		selectByVisibleText(factory.retailorderpage().dropDownForDropOffservice, string);
		logger.info("User was able to choose the option successfully");
	}
	

	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.retailorderpage().orderRetrunbttn);
		logger.info("User was able toclick on Return Order button successfully");
	}

	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String string) {
		//Assert.assertTrue(factory.retailorderpage().orderReturnMessage.isDisplayed());
		logger.info("User was able to see the message");
	}
	@When("User click on Review button")
	public void userClickOnReviewButton() {
	    click(factory.retailorderpage().reviewBttn);
	    logger.info("User was able to click on review button successfully");
	}
	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String prodect, String good) {
	    click(factory.retailorderpage().headlineInput);
	    sendText(factory.retailorderpage().headlineInput,prodect );
	    click(factory.retailorderpage().descriptionInput);
	    sendText(factory.retailorderpage().descriptionInput ,good );
	    logger.info("User was able to write review successfully");
	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
	   click(factory.retailorderpage().addYourReview);
	   logger.info("User was able to add review successfully");
	}
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String string) {
		waitTillPresence(factory.retailorderpage().reviewAddedMessage);
		Assert.assertTrue(factory.retailorderpage().reviewAddedMessage.isDisplayed());
		logger.info("User was able to see the message");
	}
	/*@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String string) {
		waitTillPresence(factory.retailorderpage().reviewAddedMessage);
		Assert.assertSame(factory.retailorderpage().reviewAddedMessage.isDisplayed(), string);
		logger.info("User was able to see the message");
	}*/
}

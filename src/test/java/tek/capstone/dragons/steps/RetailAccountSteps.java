package tek.capstone.dragons.steps;

import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import io.cucumber.java.en.*;

public class RetailAccountSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.retailaccountpage().accountOption);
		logger.info("User was able to click on account option");

	}

	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phone) {
		clearTextUsingSendKeys(factory.retailaccountpage().nameInput);
		sendText(factory.retailaccountpage().nameInput, name);
		clearTextUsingSendKeys(factory.retailaccountpage().phoneInput);
		sendText(factory.retailaccountpage().phoneInput, phone);
		logger.info(name + phone + " user was able to enter the values");
	}

	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.retailaccountpage().updateBttn);
		logger.info("User was able to click on update button successfully");
	}

	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		Assert.assertTrue(factory.retailaccountpage().successMessage.isDisplayed());
		logger.info("User profile information has been upadted");

	}

	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.retailaccountpage().addAPaymentMethodLink);
		logger.info("User was able to click on add a payment link successfully");
	}

	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> row : data) {
			sendText(factory.retailaccountpage().cardNumberInput, row.get("cardNumber"));
			sendText(factory.retailaccountpage().nameOnCardInput, row.get("nameOnCard"));
			selectByValue(factory.retailaccountpage().expirationMonthInput, row.get("expirationMonth"));
			selectByValue(factory.retailaccountpage().expirationYearInput, row.get("expirationYear"));
			sendText(factory.retailaccountpage().securityCodeInput, row.get("securityCode"));
			logger.info("Card information has entered successfully");
			slowDown();
		}
	}

	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.retailaccountpage().paymentSubmitBttn);
		logger.info("user was able to click on payment submition button");
	}

	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String string) {
		Assert.assertTrue(factory.retailaccountpage().successMessage.isDisplayed());
		logger.info(" Payment Method added successfully");

	}
	/*@Then("a message should be displayed ‘Payment Method added successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() {
		Assert.assertTrue(factory.retailaccountpage().successMessage.isDisplayed());
		logger.info(" Payment Method added successfully");

	}*/

	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.retailaccountpage().cardOption);
		click(factory.retailaccountpage().editCardBttn);
		logger.info("edit button was clicked");
	}

	@When("user edit information with below data")
	public void userEditInformationWithBelowData(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> row : data) {
			clearTextUsingSendKeys(factory.retailaccountpage().editCardNumberInput);
			sendText(factory.retailaccountpage().editCardNumberInput, row.get("cardNumber"));
			clearTextUsingSendKeys(factory.retailaccountpage().editNameOnCardInput);
			sendText(factory.retailaccountpage().editNameOnCardInput, row.get("nameOnCard"));
			selectByValue(factory.retailaccountpage().editExpirationMonthInput, row.get("expirationMonth"));
			selectByValue(factory.retailaccountpage().editExpirationYearInput, row.get("expirationYear"));
			clearTextUsingSendKeys(factory.retailaccountpage().editSecurityCodeInput);
			sendText(factory.retailaccountpage().editSecurityCodeInput, row.get("securityCode"));
			logger.info("The information was updated successfully");
		}
	}

	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.retailaccountpage().editpaymentSubmitBttn);
		logger.info("button was clicked successfully");
	}

	@Then("a message should be displayed ‘Payment Method updated Successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
		Assert.assertTrue(factory.retailaccountpage().successMessage.isDisplayed());
		logger.info("Payment Method updated Successfully message was dispalyed");
	}

	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.retailaccountpage().cardOption);
		click(factory.retailaccountpage().removeBttn);
		logger.info("User was able to click on remove button successfully");
	}

	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		Assert.assertTrue(factory.retailaccountpage().successMessage.isDisplayed());
		logger.info("Card removed successfully");

	}

	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.retailaccountpage().addAdressOption);
		logger.info("add method option clicked successfully");
	}

	@When("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> row : data) {
			selectByVisibleText(factory.retailaccountpage().countryDowpDown, row.get("country"));
			sendText(factory.retailaccountpage().fullNameInput, row.get("fullName"));
			sendText(factory.retailaccountpage().phoneNumberInput, row.get("phoneNumber"));
			sendText(factory.retailaccountpage().streetInput, row.get("streetAddress"));
			sendText(factory.retailaccountpage().apartmentInput, row.get("apt"));
			sendText(factory.retailaccountpage().cityInput, row.get("city"));
			selectByVisibleText(factory.retailaccountpage().stateInput, row.get("state"));
			sendText(factory.retailaccountpage().zipCodeInput, row.get("zipCode"));
			logger.info("User was able to add address successfully");
		}
	}

	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.retailaccountpage().addressBttn);
		logger.info("the address button was cliked");
	}

	@Then("a message should be displayed ‘Address Added Successfully’")
	public void aMessageShouldBeDisplayedAddressAddedSuccessfully() {
		Assert.assertTrue(factory.retailaccountpage().successMessage.isDisplayed());
		logger.info("Address Added Successfully message displayed");
	}

	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.retailaccountpage().editAddresOption);
		logger.info("edit address button was clicked successfully");
	}

	@When("user eidt new address form with below information")
	public void userEidtNewAddressFormWithBelowInformation(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> rows : data) {
			selectByVisibleText(factory.retailaccountpage().editCountry, rows.get("country"));
			clearTextUsingSendKeys(factory.retailaccountpage().fullNameInput);
			sendText(factory.retailaccountpage().editFullNameInput, rows.get("fullName"));
			clearTextUsingSendKeys(factory.retailaccountpage().phoneNumberInput);
			sendText(factory.retailaccountpage().editPhoneNumberInput, rows.get("phoneNumber"));
			clearTextUsingSendKeys(factory.retailaccountpage().streetInput);
			sendText(factory.retailaccountpage().editStreetInput, rows.get("streetAddress"));
			clearTextUsingSendKeys(factory.retailaccountpage().apartmentInput);
			sendText(factory.retailaccountpage().editApartmentInput, rows.get("apt"));
			clearTextUsingSendKeys(factory.retailaccountpage().cityInput);
			sendText(factory.retailaccountpage().editCityInput, rows.get("city"));
			selectByVisibleText(factory.retailaccountpage().editState, rows.get("state"));
			clearTextUsingSendKeys(factory.retailaccountpage().zipCodeInput);
			sendText(factory.retailaccountpage().editZipCoseInput, rows.get("zipCode"));
			slowDown();
			logger.info("The information has been apdated");
		}
	}

	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.retailaccountpage().editAddressBttn);
		logger.info("The butto was clicked successfully");
	}

	@Then("a message should be displayed ‘Address Updated Successfully’")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
		Assert.assertTrue(factory.retailaccountpage().successMessage.isDisplayed());
		logger.info("Address Updated Successfully message was dispalyed");
	}

	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.retailaccountpage().removeAddressBttn);
		logger.info("Remove Address button clicked");
	}

	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		Assert.assertTrue(factory.retailaccountpage().addAdressOption.isDisplayed());
		logger.info("Address removed");

	}

}



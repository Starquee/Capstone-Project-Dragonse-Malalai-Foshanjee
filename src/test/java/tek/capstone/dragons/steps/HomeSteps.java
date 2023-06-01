package tek.capstone.dragons.steps;

import java.util.List;
import java.util.Map;
import org.junit.Assert;
//import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.retailhomepage().allOption);
		logger.info("user click on All section option successfully");

	}

	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		for (List<String> row : data) {
			data.equals(row.get(0));
			data.equals(row.get(1));
			data.equals(row.get(2));
			data.equals(row.get(3));
			data.equals(row.get(4));

		}
	}

	@When("User can see below options are present in department")
	public void userCanSeeBelowOptionsArePresentInDepartment(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> row : data) {
			Assert.assertEquals(factory.retailhomepage(), row.get("department"));
			Assert.assertEquals(factory.retailhomepage(), row.get("optionOne"));
			Assert.assertEquals(factory.retailhomepage(), row.get("optionTwo"));

		}
	}

}

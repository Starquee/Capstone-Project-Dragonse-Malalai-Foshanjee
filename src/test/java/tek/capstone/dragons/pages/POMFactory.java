package tek.capstone.dragons.pages;

import tek.capstone.dragons.base.BaseSetup;
import tek.capstone.dragons.steps.HomeSteps;

import tek.capstone.dragons.steps.SignInSteps;

public class POMFactory extends BaseSetup {

	private RetailSignInPage retailsigninpage;
	private RetailHomePage retailhomepage;
	private RetailAccountPage retailaccountpage;
	private RetailOrderPage retailorderpage;

	public POMFactory() {
		this.retailsigninpage = new RetailSignInPage();
		this.retailhomepage = new RetailHomePage();
		this.retailaccountpage = new RetailAccountPage();
		this.retailorderpage = new RetailOrderPage();
	}

	public RetailSignInPage retailsigninpage() {
		return this.retailsigninpage;
	}

	public RetailHomePage retailhomepage() {
		return this.retailhomepage;
	}

	public RetailAccountPage retailaccountpage() {
		return this.retailaccountpage;
	}

	public RetailOrderPage retailorderpage() {
		return this.retailorderpage;
	}
}

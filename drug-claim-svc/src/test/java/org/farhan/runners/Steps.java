package org.farhan.runners;

import io.cucumber.java.en.Given;

public class Steps {

	@Given("The pharmacy service, Claim request is sent")
	public void the_pharmacy_service_claim_request_is_sent() {
		System.out.print("The Cucumber test was run!\n");
	}

}

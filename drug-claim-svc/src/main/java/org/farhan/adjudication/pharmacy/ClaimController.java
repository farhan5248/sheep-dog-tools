package org.farhan.adjudication.pharmacy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClaimController {

	// TODO is there a better way to specify an object and have its attributes
	// converted to parameters rather than me specifying each one?
	@GetMapping("/claim")
	public ClaimResponse claim(@RequestParam(value = "drugCost", defaultValue = "10.00") String drugCost,
			@RequestParam(value = "family", defaultValue = "Sheikh") String family,
			@RequestParam(value = "coinsurance") String coInsurance,
			@RequestParam(value = "deductible") String deductible,
			@RequestParam(value = "copayment", defaultValue = "0.0") String coPayment,
			@RequestParam(value = "dispenseFee", defaultValue = "0.0") String dispenseFee,
			@RequestParam(value = "maximum", defaultValue = "1000.0") String maximum,
			@RequestParam(value = "din") String din,
			@RequestParam(value = "provider") String provider,
			@RequestParam(value = "certificate") String certificate) {
		ClaimRequest request = new ClaimRequest();
		request.setDrugCost(drugCost);
		request.setFamily(family);
		request.setCoInsurance(coInsurance);
		request.setDeductible(deductible);
		request.setCoPayment(coPayment);
		request.setDispenseFee(dispenseFee);
		request.setMaximum(maximum);
		request.setDIN(din);
		request.setProvider(provider);
		request.setCertificate(certificate);
		ClaimEngine engine = new ClaimEngine(request);
		ClaimResponse response = engine.process();
		return response;
	}
}
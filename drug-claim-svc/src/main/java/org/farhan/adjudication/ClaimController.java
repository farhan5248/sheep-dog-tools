package org.farhan.adjudication;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClaimController {

	// TODO rename to /adjudicate
	@GetMapping("/claim")
	public ClaimResponse claim(@RequestParam(value = "drugCost", defaultValue = "10.00") String drugCost,
			@RequestParam(value = "family", defaultValue = "Sheikh") String family) {
		// TODO the ClaimFactory maintains just one copy of ClaimRequest, remove that
		// constraint later after analysing how the tests are impacted
		ClaimRequest request = ClaimFactory.getClaim();
		request.setDrugCost(drugCost);
		request.setFamily(family);

		ClaimEngine engine = new ClaimEngine(request);
		ClaimResponse response = engine.process();
		return response;
	}
}
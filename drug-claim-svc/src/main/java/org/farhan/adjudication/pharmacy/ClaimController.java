package org.farhan.adjudication.pharmacy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClaimController {

	@GetMapping("/claimer")
	public ClaimResponse claimer(@RequestParam(value = "din", defaultValue = "9999") String din) {
		return new ClaimResponse("", "", "", "");
	}

	@PostMapping("/add")
	public ClaimResponse add(@RequestBody String person) {
		return new ClaimResponse("Added", person, "", "");
	}
}
package org.farhan.adjudication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

	@GetMapping("/provider")
	public ProviderResponse claim(@RequestParam(value = "provider") String provider) {
		ProviderFactory.create(provider);
		return new ProviderResponse("Data Added");
	}
}
package org.farhan.adjudication.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

	@GetMapping("/provider")
	public AdminResponse claim(@RequestParam(value = "provider") String provider) {
		ProviderFactory.create(provider);
		return new AdminResponse("Data Added");
	}
}
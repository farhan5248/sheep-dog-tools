package org.farhan.adjudication.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DrugController {

	@GetMapping("/drug")
	public AdminResponse claim(@RequestParam(value = "din") String din,
			@RequestParam(value = "drugCost", defaultValue = "0.0") String drugCost) {
		// TODO check if the din is blank?
		// TODO maybe create a drug request record like for claim?
		DrugFactory.create(din);
		DrugFactory.get(din).setDrugCost(drugCost);
		return new AdminResponse("Data Added");
	}
}
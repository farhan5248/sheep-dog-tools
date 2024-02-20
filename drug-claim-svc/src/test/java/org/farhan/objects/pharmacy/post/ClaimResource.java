package org.farhan.objects.pharmacy.post;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

public class ClaimResource extends Pharmacy {

	public void assertPayProvider(HashMap<String, String> keyMap) {
		// TODO use a json library to do this
		assertEquals("{\"payProvider\":\"" + keyMap.get("Pay Provider") + "\"}", responseBody);
	}
}

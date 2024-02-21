package org.farhan.objects.pharmacy.post;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.farhan.common.PharmacyPost;

public class ClaimResource extends PharmacyPost {

	public void assertPayProvider(HashMap<String, String> keyMap) {
		// TODO use a json library to do this
		assertEquals("{\"payProvider\":\"" + keyMap.get("Pay Provider") + "\"}", responseBody);
	}
}

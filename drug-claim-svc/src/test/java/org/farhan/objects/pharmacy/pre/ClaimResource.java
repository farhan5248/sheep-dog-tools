package org.farhan.objects.pharmacy.pre;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

public class ClaimResource extends Pharmacy {

	public void assertPayProvider(HashMap<String, String> keyMap) {
		assertEquals(keyMap.get("Pay Provider"), response.payProvider());
	}
}

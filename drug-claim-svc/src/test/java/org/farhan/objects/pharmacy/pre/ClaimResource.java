package org.farhan.objects.pharmacy.pre;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.farhan.common.PharmacyPre;

public class ClaimResource extends PharmacyPre {

	public void assertPayProvider(HashMap<String, String> keyMap) {
		assertEquals(keyMap.get("Pay Provider"), response.payProvider());
	}
}

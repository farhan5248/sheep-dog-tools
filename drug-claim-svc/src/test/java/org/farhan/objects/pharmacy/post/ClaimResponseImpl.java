package org.farhan.objects.pharmacy.post;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.farhan.common.PharmacyPost;
import org.farhan.objects.pharmacy.ClaimResponse;

public class ClaimResponseImpl extends PharmacyPost implements ClaimResponse {

	// TODO use a json library to do this
	public void assertPayProvider(HashMap<String, String> keyMap) {
		assertEquals("{\"payProvider\":\"" + keyMap.get("Pay Provider") + "\"}", responseBody);
	}

	@Override
	public void assertOutOfPocket(HashMap<String, String> keyMap) {
		assertEquals("{\"outOfPocket\":\"" + keyMap.get("Out Of Pocket") + "\"}", responseBody);
	}

	@Override
	public void assertPlanPays(HashMap<String, String> keyMap) {
		assertEquals("{\"planPays\":\"" + keyMap.get("Plan Pays") + "\"}", responseBody);
	}

	@Override
	public void assertRejectMessage(HashMap<String, String> keyMap) {
		assertEquals("{\"rejectMessage\":\"" + keyMap.get("Reject Message") + "\"}", responseBody);
	}
}

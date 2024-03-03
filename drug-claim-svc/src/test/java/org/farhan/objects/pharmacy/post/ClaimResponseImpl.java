package org.farhan.objects.pharmacy.post;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;

import org.farhan.common.PharmacyPost;
import org.farhan.objects.pharmacy.ClaimResponse;

public class ClaimResponseImpl extends PharmacyPost implements ClaimResponse {

	// TODO use a json library to do this
	public void assertPayProvider(HashMap<String, String> keyMap) {
		assertTrue(responseBody.contains("\"payProvider\":\"" + keyMap.get("Pay Provider") + "\""), responseBody);
	}

	@Override
	public void assertOutOfPocket(HashMap<String, String> keyMap) {
		assertTrue(responseBody.contains("\"outOfPocket\":\"" + keyMap.get("Out Of Pocket") + "\""), responseBody);
	}

	@Override
	public void assertPlanPays(HashMap<String, String> keyMap) {
		assertTrue(responseBody.contains("\"planPays\":\"" + keyMap.get("Plan Pays") + "\""), responseBody);
	}

	@Override
	public void assertRejectMessage(HashMap<String, String> keyMap) {
		assertTrue(responseBody.contains("\"rejectMessage\":\"" + keyMap.get("Reject Message") + "\""), responseBody);
	}
}

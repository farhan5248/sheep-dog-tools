package org.farhan.objects.pharmacy.pre;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.farhan.common.PharmacyPre;
import org.farhan.objects.pharmacy.ClaimResponse;

public class ClaimResponseImpl extends PharmacyPre implements ClaimResponse {

	@Override
	public void assertOutOfPocket(HashMap<String, String> keyMap) {
		assertEquals(keyMap.get("Out Of Pocket"), response.outOfPocket());
	}

	@Override
	public void assertPlanPays(HashMap<String, String> keyMap) {
		assertEquals(keyMap.get("Plan Pays"), response.planPays());
	}

	@Override
	public void assertRejectMessage(HashMap<String, String> keyMap) {
		assertEquals(keyMap.get("Reject Message"), response.rejectMessage());
	}
}

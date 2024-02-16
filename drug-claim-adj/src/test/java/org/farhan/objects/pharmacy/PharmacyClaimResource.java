package org.farhan.objects.pharmacy;

import java.util.HashMap;

import org.farhan.adjudication.ClaimFactory;
import org.farhan.common.Pharmacy;

public class PharmacyClaimResource extends Pharmacy {

	public void assertPayProvider(HashMap<String, String> keyMap) {
		ClaimFactory.getClaim().getPayProvider(keyMap.get("Pay Provider"));
	}
}

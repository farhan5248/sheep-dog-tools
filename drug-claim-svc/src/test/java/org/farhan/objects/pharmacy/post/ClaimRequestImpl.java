package org.farhan.objects.pharmacy.post;

import java.util.HashMap;
import org.farhan.common.PharmacyPost;
import org.farhan.objects.pharmacy.ClaimRequest;

public class ClaimRequestImpl extends PharmacyPost implements ClaimRequest {

	public void transition() {
		sendRequest("claim");
	}

	public void setDrugCost(HashMap<String, String> keyMap) {
		addParamter("drugCost", keyMap.get("Drug Cost"));
	}

	public void setFamily(HashMap<String, String> keyMap) {
		addParamter("family", keyMap.get("Family"));
	}

	@Override
	public void setCoInsurance(HashMap<String, String> keyMap) {
		addParamter("coinsurance", keyMap.get("Co-Insurance"));
	}

	@Override
	public void setDeductible(HashMap<String, String> keyMap) {
		addParamter("deductible", keyMap.get("Deductible"));
	}

	@Override
	public void setCoPayment(HashMap<String, String> keyMap) {
		addParamter("copayment", keyMap.get("Co-Payment"));
	}

	@Override
	public void setDispenseFee(HashMap<String, String> keyMap) {
		addParamter("dispenseFee", keyMap.get("Dispense Fee"));
	}

	@Override
	public void setMaximum(HashMap<String, String> keyMap) {
		addParamter("maximum", keyMap.get("Maximum"));
	}

	@Override
	public void setDIN(HashMap<String, String> keyMap) {
		addParamter("din", keyMap.get("DIN"));
	}

	@Override
	public void setProvider(HashMap<String, String> keyMap) {
		addParamter("provider", keyMap.get("Provider"));
	}

	@Override
	public void setCertificate(HashMap<String, String> keyMap) {
		addParamter("certificate", keyMap.get("Certificate"));
	}
}

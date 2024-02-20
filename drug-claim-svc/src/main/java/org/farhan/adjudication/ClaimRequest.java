package org.farhan.adjudication;

// TODO replace class with record
public class ClaimRequest {

	private double theDrugCost = 0.0;
	private Family theFamily = null;

	public void setDrugCost(String drugCost) {
		theDrugCost = Double.valueOf(drugCost);
	}

	public void setFamily(String family) {
		theFamily = FamilyFactory.get(family);
	}

	public double getDrugCost() {
		return theDrugCost;
	}
}

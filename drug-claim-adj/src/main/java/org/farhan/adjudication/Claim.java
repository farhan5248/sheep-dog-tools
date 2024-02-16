package org.farhan.adjudication;

public class Claim {

	private double theDrugCost = 0.0;
	private Family theFamily = null;
	private double thePayProvider = 0.0;

	public void setDrugCost(String drugCost) {
		theDrugCost = Double.valueOf(drugCost);
	}

	public void setFamily(String family) {
		theFamily = FamilyFactory.get(family);
		;
	}

	public void process() {
		thePayProvider = theDrugCost * 0.5;
	}

	public double getPayProvider(String string) {
		return thePayProvider;
	}
}

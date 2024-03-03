package org.farhan.adjudication.admin;

public class Drug {

	private String din;
	private double drugCost;

	public Drug(String din) {
		this.din = din;
	}

	public void setDrugCost(String drugCost) {
		this.drugCost = Double.valueOf(drugCost);
	}

	public double getDrugCost() {
		return drugCost;
	}

	public String getDIN() {
		return din;
	}
}

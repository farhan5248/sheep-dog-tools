package org.farhan.adjudication;

public class ClaimEngine {

	private ClaimRequest request;
	private ClaimResponse response;

	public ClaimEngine(ClaimRequest request) {
		this.request = request;
	}

	public ClaimResponse process() {
		response = new ClaimResponse(Double.toString(request.getDrugCost() * 0.5));
		return response;
	}
}

package org.farhan.adjudication;

public class ClaimFactory {

	private static ClaimRequest theClaim = null;

	public static ClaimRequest getClaim() {
		if (theClaim == null) {
			theClaim = new ClaimRequest();
		} else {
			// Do nothing for now
		}
		return theClaim;
	}
}

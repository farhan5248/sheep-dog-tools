package org.farhan.adjudication;

public class ClaimFactory {

	private static Claim theClaim = null;

	public static Claim getClaim() {
		if (theClaim == null) {
			theClaim = new Claim();
		} else {
			// Do nothing for now
		}
		return theClaim;
	}
}

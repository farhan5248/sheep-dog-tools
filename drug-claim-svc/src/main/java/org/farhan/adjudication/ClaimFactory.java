package org.farhan.adjudication;

public class ClaimFactory {

	private static ClaimRequest theClaim = null;

	public static ClaimRequest getClaim() {
		if (theClaim == null) {
			theClaim = new ClaimRequest();
		} else {
			// Do nothing for now
			// TODO this needs to be reset each time the step is called otherwise previous
			// request values are passed into the next scenario
		}
		return theClaim;
	}

	public static void reset() {
		theClaim = null;
	}
}

package org.farhan.adjudication;

public class FamilyFactory {

	private static Family theFamily = null;

	public static Family get(String family) {
		if (theFamily == null) {
			theFamily = new Family(family);
		} else {
			// Do nothing for now
		}
		return theFamily;
	}

}

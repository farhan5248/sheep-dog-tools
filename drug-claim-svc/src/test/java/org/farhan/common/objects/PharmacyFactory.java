package org.farhan.common.objects;

import org.farhan.common.Pharmacy;

public class PharmacyFactory {

	public static Pharmacy get(String string) {
		return new Pharmacy();
	}

}

package org.farhan.common;

import org.farhan.adjudication.FamilyFactory;
import org.farhan.common.GraphTestObject;

public class Admin extends GraphTestObject {

	protected void createFamily(String family) {
		FamilyFactory.get(family);
	}

}

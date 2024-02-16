package org.farhan.common;

import org.farhan.adjudication.FamilyFactory;

public class Admin extends GraphModelObject {

	protected void createFamily(String family) {
		FamilyFactory.get(family);
	}

}

package org.farhan.common;

import org.farhan.adjudication.FamilyFactory;
import org.farhan.common.GraphModelObject;

public class Admin extends GraphModelObject {

	protected void createFamily(String family) {
		FamilyFactory.get(family);
	}

}

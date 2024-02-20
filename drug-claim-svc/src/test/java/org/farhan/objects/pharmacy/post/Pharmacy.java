package org.farhan.objects.pharmacy.post;

import org.apache.commons.text.CaseUtils;
import org.farhan.adjudication.ClaimResponse;
import org.farhan.common.GraphModelObject;

public class Pharmacy extends GraphModelObject {

	protected static String url = "http://localhost:8887/claim?";
	protected static String responseBody = "";

	protected void addParamter(String key, String value) {
		if (!url.endsWith("?")) {
			url += "&";
		}
		url += convertNameToParam(key) + "=" + value;
	}

	private String convertNameToParam(String name) {
		return CaseUtils.toCamelCase(name, true, ' ');
	}

}

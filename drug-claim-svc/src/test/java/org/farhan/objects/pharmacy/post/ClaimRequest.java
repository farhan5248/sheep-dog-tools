package org.farhan.objects.pharmacy.post;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Scanner;

import org.junit.jupiter.api.Assertions;

public class ClaimRequest extends Pharmacy {

	public void setDrugCost(HashMap<String, String> keyMap) {
		addParamter("Drug Cost", keyMap.get("Drug Cost"));
	}

	public void setFamily(HashMap<String, String> keyMap) {
		addParamter("Family", keyMap.get("Family"));
	}

	public void transition() {
		try {
			URLConnection connection = new URL(url).openConnection();
			InputStream response = connection.getInputStream();
			Scanner scanner = new Scanner(response);
			responseBody = scanner.nextLine();
			scanner.close();
		} catch (Exception e) {
			Assertions.fail(getStackTraceAsString(e));
		}
	}
}

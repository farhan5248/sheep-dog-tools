package org.farhan.adjudication;

import java.util.TreeMap;

public class ProviderFactory {

	private static TreeMap<String, Provider> providerList = new TreeMap<String, Provider>();

	public static Provider create(String provider) {
		if (providerList.get(provider) != null) {
			return providerList.get(provider);
		} else {
			return providerList.put(provider, new Provider(provider));
		}
	}

	public static Provider get(String din) {
		return providerList.get(din);
	}

	public static void reset() {
		providerList = new TreeMap<String, Provider>();
	}

}

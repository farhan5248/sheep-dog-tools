package org.farhan.objects.claimproject;

import org.farhan.objects.common.TestObject;

public class ClaimProjectFactory {

	// TODO make this a map of all objects later
	private static PSTFile pstFile;
	private static ProcessFile processFile;

	public static TestObject get(String className) {
		if (className.contentEquals("PSTFile")) {
			if (pstFile == null) {
				pstFile = new PSTFile();
			}
			return pstFile;
		}
		if (className.contentEquals("ProcessFile")) {
			if (processFile == null) {
				processFile = new ProcessFile();
			}
			return processFile;
		}
		return null;
	}

}

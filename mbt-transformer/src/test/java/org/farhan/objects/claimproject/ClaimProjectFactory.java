package org.farhan.objects.claimproject;

import org.farhan.objects.common.TestObject;

public class ClaimProjectFactory {

	// TODO make this a map of all objects later
	private static PSTFile pstFile;
	private static ProcessFile processFile;
	private static BlahDataTablePageStepsFile blahDataTablePageStepsFile;
	private static BlahDocStringsPageStepsFile blahDocStringsPageStepsFile;
	private static BlahObjectPageStepsFile blahObjectPageStepsFile;
	private static Blah2JsonRequestStepsFile blah2JsonRequestStepsFile;
	private static Blah2JsonRequestFile blah2JsonRequestFile;
	private static BlahDataTablePageFile blahDataTablePageFile;
	private static BlahDocStringPageFile blahDocStringPageFile;
	private static BlahObjectPageFile blahObjectPageFile;

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
		if (className.contentEquals("BlahDataTablePageStepsFile")) {
			if (blahDataTablePageStepsFile == null) {
				blahDataTablePageStepsFile = new BlahDataTablePageStepsFile();
			}
			return blahDataTablePageStepsFile;
		}
		if (className.contentEquals("BlahDocStringsPageStepsFile")) {
			if (blahDocStringsPageStepsFile == null) {
				blahDocStringsPageStepsFile = new BlahDocStringsPageStepsFile();
			}
			return blahDocStringsPageStepsFile;
		}
		if (className.contentEquals("BlahObjectPageStepsFile")) {
			if (blahObjectPageStepsFile == null) {
				blahObjectPageStepsFile = new BlahObjectPageStepsFile();
			}
			return blahObjectPageStepsFile;
		}
		if (className.contentEquals("Blah2JsonRequestStepsFile")) {
			if (blah2JsonRequestStepsFile == null) {
				blah2JsonRequestStepsFile = new Blah2JsonRequestStepsFile();
			}
			return blah2JsonRequestStepsFile;
		}
		if (className.contentEquals("Blah2JsonRequestFile")) {
			if (blah2JsonRequestFile == null) {
				blah2JsonRequestFile = new Blah2JsonRequestFile();
			}
			return blah2JsonRequestFile;
		}
		if (className.contentEquals("BlahDataTablePageFile")) {
			if (blahDataTablePageFile == null) {
				blahDataTablePageFile = new BlahDataTablePageFile();
			}
			return blahDataTablePageFile;
		}
		if (className.contentEquals("BlahDocStringPageFile")) {
			if (blahDocStringPageFile == null) {
				blahDocStringPageFile = new BlahDocStringPageFile();
			}
			return blahDocStringPageFile;
		}
		if (className.contentEquals("BlahObjectPageFile")) {
			if (blahObjectPageFile == null) {
				blahObjectPageFile = new BlahObjectPageFile();
			}
			return blahObjectPageFile;
		}
		return null;
	}

}

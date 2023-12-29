package org.farhan.common.objects;

import org.farhan.objects.claim.Blah2JsonRequestFile;
import org.farhan.objects.claim.Blah2JsonRequestStepsFile;
import org.farhan.objects.claim.BlahDataTablePageFile;
import org.farhan.objects.claim.BlahDataTablePageStepsFile;
import org.farhan.objects.claim.BlahDocStringPageFile;
import org.farhan.objects.claim.BlahDocStringsPageStepsFile;
import org.farhan.objects.claim.BlahObjectPageFile;
import org.farhan.objects.claim.BlahObjectPageStepsFile;
import org.farhan.objects.claim.ClaimPstUmlFile;
import org.farhan.objects.claim.ClaimProcessFeatureFile;

public class ClaimFactory {

	// TODO make this a map of all objects later
	private static ClaimPstUmlFile pstFile;
	private static ClaimProcessFeatureFile processFile;
	private static BlahDataTablePageStepsFile blahDataTablePageStepsFile;
	private static BlahDocStringsPageStepsFile blahDocStringsPageStepsFile;
	private static BlahObjectPageStepsFile blahObjectPageStepsFile;
	private static Blah2JsonRequestStepsFile blah2JsonRequestStepsFile;
	private static Blah2JsonRequestFile blah2JsonRequestFile;
	private static BlahDataTablePageFile blahDataTablePageFile;
	private static BlahDocStringPageFile blahDocStringPageFile;
	private static BlahObjectPageFile blahObjectPageFile;

	public static FileObject get(String className) {
		if (className.contentEquals("ClaimPstUmlFile")) {
			if (pstFile == null) {
				pstFile = new ClaimPstUmlFile();
				// TODO generate setters for these. Rename BaseDir to container but leave
				// setPath as is
				pstFile.setBaseDir("claim").setPath("target/uml/pst.uml");
			}
			return pstFile;
		}
		if (className.contentEquals("ClaimProcessFeatureFile")) {
			if (processFile == null) {
				processFile = new ClaimProcessFeatureFile();
				processFile.setBaseDir("claim").setPath("src/test/cucumber/dept/process.feature");
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

package org.farhan.common.objects;

import org.farhan.objects.claim.ClaimPstUmlFile;
import org.farhan.objects.claim.ClaimBlah2JsonRequestJavaFile;
import org.farhan.objects.claim.ClaimBlah2JsonRequestStepsJavaFile;
import org.farhan.objects.claim.ClaimBlahDataTablePageJavaFile;
import org.farhan.objects.claim.ClaimBlahDataTablePageStepsJavaFile;
import org.farhan.objects.claim.ClaimBlahDocStringPageJavaFile;
import org.farhan.objects.claim.ClaimBlahDocStringsPageStepsJavaFile;
import org.farhan.objects.claim.ClaimBlahObjectPageJavaFile;
import org.farhan.objects.claim.ClaimBlahObjectPageStepsJavaFile;
import org.farhan.objects.claim.ClaimProcessFeatureFile;

public class ClaimFactory {

	// TODO make this a map of all objects later
	private static ClaimPstUmlFile pstFile;
	private static ClaimProcessFeatureFile processFile;
	private static ClaimBlahDataTablePageStepsJavaFile blahDataTablePageStepsFile;
	private static ClaimBlahDocStringsPageStepsJavaFile blahDocStringsPageStepsFile;
	private static ClaimBlahObjectPageStepsJavaFile blahObjectPageStepsFile;
	private static ClaimBlah2JsonRequestStepsJavaFile blah2JsonRequestStepsFile;
	private static ClaimBlah2JsonRequestJavaFile blah2JsonRequestFile;
	private static ClaimBlahDataTablePageJavaFile blahDataTablePageFile;
	private static ClaimBlahDocStringPageJavaFile blahDocStringPageFile;
	private static ClaimBlahObjectPageJavaFile blahObjectPageFile;

	public static FileObject get(String className) {
		if (className.contentEquals("ClaimPstUmlFile")) {
			if (pstFile == null) {
				pstFile = new ClaimPstUmlFile();
				// TODO generate setters for these. Rename BaseDir to container but leave
				// setPath as is
				pstFile.setBaseDir("claim");
				pstFile.setPath("target/uml/pst.uml");
			}
			return pstFile;
		}
		if (className.contentEquals("ClaimProcessFeatureFile")) {
			if (processFile == null) {
				processFile = new ClaimProcessFeatureFile();
				processFile.setBaseDir("claim");
				processFile.setPath("src/test/cucumber/dept/process.feature");
			}
			return processFile;
		}
		if (className.contentEquals("BlahDataTablePageStepsFile")) {
			if (blahDataTablePageStepsFile == null) {
				blahDataTablePageStepsFile = new ClaimBlahDataTablePageStepsJavaFile();
				blahDataTablePageStepsFile.setBaseDir("claim");
				blahDataTablePageStepsFile
						.setPath("src/test/java/org/farhan/stepdefs/blah/BlahDataTablePageSteps.java");
			}
			return blahDataTablePageStepsFile;
		}
		if (className.contentEquals("BlahDocStringsPageStepsFile")) {
			if (blahDocStringsPageStepsFile == null) {
				blahDocStringsPageStepsFile = new ClaimBlahDocStringsPageStepsJavaFile();
				blahDocStringsPageStepsFile.setBaseDir("claim");
				blahDocStringsPageStepsFile
						.setPath("src/test/java/org/farhan/stepdefs/blah/BlahDocStringPageSteps.java");
			}
			return blahDocStringsPageStepsFile;
		}
		if (className.contentEquals("BlahObjectPageStepsFile")) {
			if (blahObjectPageStepsFile == null) {
				blahObjectPageStepsFile = new ClaimBlahObjectPageStepsJavaFile();
				blahObjectPageStepsFile.setBaseDir("claim");
				blahObjectPageStepsFile.setPath("src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java");
			}
			return blahObjectPageStepsFile;
		}
		if (className.contentEquals("Blah2JsonRequestStepsFile")) {
			if (blah2JsonRequestStepsFile == null) {
				blah2JsonRequestStepsFile = new ClaimBlah2JsonRequestStepsJavaFile();
				blah2JsonRequestStepsFile.setBaseDir("claim");
				blah2JsonRequestStepsFile.setPath("src/test/java/org/farhan/stepdefs/blah2/Blah2JsonRequestSteps.java");
			}
			return blah2JsonRequestStepsFile;
		}
		if (className.contentEquals("Blah2JsonRequestFile")) {
			if (blah2JsonRequestFile == null) {
				blah2JsonRequestFile = new ClaimBlah2JsonRequestJavaFile();
				blah2JsonRequestFile.setBaseDir("claim");
				blah2JsonRequestFile.setPath("src/test/java/org/farhan/objects/blah2/Blah2JsonRequest.java");
			}
			return blah2JsonRequestFile;
		}
		if (className.contentEquals("BlahDataTablePageFile")) {
			if (blahDataTablePageFile == null) {
				blahDataTablePageFile = new ClaimBlahDataTablePageJavaFile();
				blahDataTablePageFile.setBaseDir("claim");
				blahDataTablePageFile.setPath("src/test/java/org/farhan/objects/blah/BlahDataTablePage.java");
			}
			return blahDataTablePageFile;
		}
		if (className.contentEquals("BlahDocStringPageFile")) {
			if (blahDocStringPageFile == null) {
				blahDocStringPageFile = new ClaimBlahDocStringPageJavaFile();
				blahDocStringPageFile.setBaseDir("claim");
				blahDocStringPageFile.setPath("src/test/java/org/farhan/objects/blah/BlahDocStringPage.java");
			}
			return blahDocStringPageFile;
		}
		if (className.contentEquals("BlahObjectPageFile")) {
			if (blahObjectPageFile == null) {
				blahObjectPageFile = new ClaimBlahObjectPageJavaFile();
				blahObjectPageFile.setBaseDir("claim");
				blahObjectPageFile.setPath("src/test/java/org/farhan/objects/blah/BlahObjectPage.java");
			}
			return blahObjectPageFile;
		}
		return null;
	}

}

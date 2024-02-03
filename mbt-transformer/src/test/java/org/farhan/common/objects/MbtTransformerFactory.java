package org.farhan.common.objects;

import org.farhan.objects.mbtTransformer.MbtTransformerAsciidoctorToGraphGoal;
import org.farhan.objects.mbtTransformer.MbtTransformerBlah2JsonRequestJavaFile;
import org.farhan.objects.mbtTransformer.MbtTransformerBlah2JsonRequestStepsJavaFile;
import org.farhan.objects.mbtTransformer.MbtTransformerBlahDataTablePageJavaFile;
import org.farhan.objects.mbtTransformer.MbtTransformerBlahDataTablePageStepsJavaFile;
import org.farhan.objects.mbtTransformer.MbtTransformerBlahDocStringPageJavaFile;
import org.farhan.objects.mbtTransformer.MbtTransformerBlahDocStringsPageStepsJavaFile;
import org.farhan.objects.mbtTransformer.MbtTransformerBlahObjectPageJavaFile;
import org.farhan.objects.mbtTransformer.MbtTransformerBlahObjectPageStepsJavaFile;
import org.farhan.objects.mbtTransformer.MbtTransformerCucumberToUmlGoal;
import org.farhan.objects.mbtTransformer.MbtTransformerGraphToUmlGoal;
import org.farhan.objects.mbtTransformer.MbtTransformerProcessAdocFile;
import org.farhan.objects.mbtTransformer.MbtTransformerProcessFeatureFile;
import org.farhan.objects.mbtTransformer.MbtTransformerProcessGraphFile;
import org.farhan.objects.mbtTransformer.MbtTransformerPstUmlFile;
import org.farhan.objects.mbtTransformer.MbtTransformerUmlToCucumberGoal;

public class MbtTransformerFactory {

	// TODO make this a map of all objects later and then use a DI framework
	private static MbtTransformerCucumberToUmlGoal cucumberToUMLGoal;
	private static MbtTransformerUmlToCucumberGoal UMLTocucumberGoal;
	private static MbtTransformerPstUmlFile pstFile;
	private static MbtTransformerProcessFeatureFile processFile;
	private static MbtTransformerBlahDataTablePageStepsJavaFile blahDataTablePageStepsFile;
	private static MbtTransformerBlahDocStringsPageStepsJavaFile blahDocStringsPageStepsFile;
	private static MbtTransformerBlahObjectPageStepsJavaFile blahObjectPageStepsFile;
	private static MbtTransformerBlah2JsonRequestStepsJavaFile blah2JsonRequestStepsFile;
	private static MbtTransformerBlah2JsonRequestJavaFile blah2JsonRequestFile;
	private static MbtTransformerBlahDataTablePageJavaFile blahDataTablePageFile;
	private static MbtTransformerBlahDocStringPageJavaFile blahDocStringPageFile;
	private static MbtTransformerBlahObjectPageJavaFile blahObjectPageFile;
	private static MbtTransformerProcessAdocFile mbtTransformerProcessAdocFile;
	private static MbtTransformerProcessGraphFile mbtTransformerProcessGraphFile;
	private static MbtTransformerAsciidoctorToGraphGoal mbtTransformerAsciidoctorToGraphGoal;
	private static MbtTransformerGraphToUmlGoal mbtTransformerGraphToUmlGoal;

	public static GraphModelObject get(String className) {
		if (className.contentEquals("MbtTransformerCucumberToUmlGoal")) {
			if (cucumberToUMLGoal == null) {
				cucumberToUMLGoal = new MbtTransformerCucumberToUmlGoal();
			}
			return cucumberToUMLGoal;
		} else if (className.contentEquals("UmlToCucumberGoal")) {
			if (UMLTocucumberGoal == null) {
				UMLTocucumberGoal = new MbtTransformerUmlToCucumberGoal();
			}
			return UMLTocucumberGoal;
		}
		if (className.contentEquals("ClaimPstUmlFile")) {
			if (pstFile == null) {
				pstFile = new MbtTransformerPstUmlFile();
				// TODO generate setters for these. Rename BaseDir to container but leave
				// setPath as is
				pstFile.setBaseDir("mbt-transformer");
				pstFile.setPath("target/uml/pst.uml");
			}
			return pstFile;
		}
		if (className.contentEquals("ClaimProcessFeatureFile")) {
			if (processFile == null) {
				processFile = new MbtTransformerProcessFeatureFile();
				processFile.setBaseDir("mbt-transformer");
				processFile.setPath("src/test/resources/Cucumber/dept/process.feature");
			}
			return processFile;
		}
		if (className.contentEquals("MbtTransformerProcessFeatureFile")) {
			if (processFile == null) {
				processFile = new MbtTransformerProcessFeatureFile();
				processFile.setBaseDir("mbt-transformer");
				processFile.setPath("src/test/resources/Cucumber/Process.feature");
			} else {
				processFile.setPath("src/test/resources/Cucumber/Process.feature");
			}
			return processFile;
		}
		if (className.contentEquals("BlahDataTablePageStepsFile")) {
			if (blahDataTablePageStepsFile == null) {
				blahDataTablePageStepsFile = new MbtTransformerBlahDataTablePageStepsJavaFile();
				blahDataTablePageStepsFile.setBaseDir("mbt-transformer");
				blahDataTablePageStepsFile
						.setPath("src/test/java/org/farhan/stepdefs/blah/BlahDataTablePageSteps.java");
			}
			return blahDataTablePageStepsFile;
		}
		if (className.contentEquals("BlahDocStringsPageStepsFile")) {
			if (blahDocStringsPageStepsFile == null) {
				blahDocStringsPageStepsFile = new MbtTransformerBlahDocStringsPageStepsJavaFile();
				blahDocStringsPageStepsFile.setBaseDir("mbt-transformer");
				blahDocStringsPageStepsFile
						.setPath("src/test/java/org/farhan/stepdefs/blah/BlahDocStringPageSteps.java");
			}
			return blahDocStringsPageStepsFile;
		}
		if (className.contentEquals("BlahObjectPageStepsFile")) {
			if (blahObjectPageStepsFile == null) {
				blahObjectPageStepsFile = new MbtTransformerBlahObjectPageStepsJavaFile();
				blahObjectPageStepsFile.setBaseDir("mbt-transformer");
				blahObjectPageStepsFile.setPath("src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java");
			}
			return blahObjectPageStepsFile;
		}
		if (className.contentEquals("Blah2JsonRequestStepsFile")) {
			if (blah2JsonRequestStepsFile == null) {
				blah2JsonRequestStepsFile = new MbtTransformerBlah2JsonRequestStepsJavaFile();
				blah2JsonRequestStepsFile.setBaseDir("mbt-transformer");
				blah2JsonRequestStepsFile.setPath("src/test/java/org/farhan/stepdefs/blah2/Blah2JsonRequestSteps.java");
			}
			return blah2JsonRequestStepsFile;
		}
		if (className.contentEquals("Blah2JsonRequestFile")) {
			if (blah2JsonRequestFile == null) {
				blah2JsonRequestFile = new MbtTransformerBlah2JsonRequestJavaFile();
				blah2JsonRequestFile.setBaseDir("mbt-transformer");
				blah2JsonRequestFile.setPath("src/test/java/org/farhan/objects/blah2/Blah2JsonRequest.java");
			}
			return blah2JsonRequestFile;
		}
		if (className.contentEquals("BlahDataTablePageFile")) {
			if (blahDataTablePageFile == null) {
				blahDataTablePageFile = new MbtTransformerBlahDataTablePageJavaFile();
				blahDataTablePageFile.setBaseDir("mbt-transformer");
				blahDataTablePageFile.setPath("src/test/java/org/farhan/objects/blah/BlahDataTablePage.java");
			}
			return blahDataTablePageFile;
		}
		if (className.contentEquals("BlahDocStringPageFile")) {
			if (blahDocStringPageFile == null) {
				blahDocStringPageFile = new MbtTransformerBlahDocStringPageJavaFile();
				blahDocStringPageFile.setBaseDir("mbt-transformer");
				blahDocStringPageFile.setPath("src/test/java/org/farhan/objects/blah/BlahDocStringPage.java");
			}
			return blahDocStringPageFile;
		}
		if (className.contentEquals("BlahObjectPageFile")) {
			if (blahObjectPageFile == null) {
				blahObjectPageFile = new MbtTransformerBlahObjectPageJavaFile();
				blahObjectPageFile.setBaseDir("mbt-transformer");
				blahObjectPageFile.setPath("src/test/java/org/farhan/objects/blah/BlahObjectPage.java");
			}
			return blahObjectPageFile;
		}
		if (className.contentEquals("MbtTransformerProcessAdocFile")) {
			if (mbtTransformerProcessAdocFile == null) {
				mbtTransformerProcessAdocFile = new MbtTransformerProcessAdocFile();
				mbtTransformerProcessAdocFile.setBaseDir("mbt-transformer");
				mbtTransformerProcessAdocFile.setPath("src/test/resources/AsciiDoc/Process.adoc");
			}
			return mbtTransformerProcessAdocFile;
		}
		if (className.contentEquals("MbtTransformerProcessGraphFile")) {
			if (mbtTransformerProcessGraphFile == null) {
				mbtTransformerProcessGraphFile = new MbtTransformerProcessGraphFile();
				mbtTransformerProcessGraphFile.setBaseDir("mbt-transformer");
				mbtTransformerProcessGraphFile.setPath("target/Graphs/Process.graph");
			}
			return mbtTransformerProcessGraphFile;
		}
		if (className.contentEquals("MbtTransformerAsciidoctorToGraphGoal")) {
			if (mbtTransformerAsciidoctorToGraphGoal == null) {
				mbtTransformerAsciidoctorToGraphGoal = new MbtTransformerAsciidoctorToGraphGoal();
			}
			return mbtTransformerAsciidoctorToGraphGoal;
		}
		if (className.contentEquals("MbtTransformerGraphToUmlGoal")) {
			if (mbtTransformerGraphToUmlGoal == null) {
				mbtTransformerGraphToUmlGoal = new MbtTransformerGraphToUmlGoal();
			}
			return mbtTransformerGraphToUmlGoal;
		}
		return null;
	}
}

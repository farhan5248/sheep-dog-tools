package org.farhan.validation.uml;

import java.io.File;
import java.util.ArrayList;

import org.eclipse.uml2.uml.Model;
import org.farhan.cucumber.Feature;
import org.farhan.validation.FirstLayerConverter;
import org.farhan.validation.FirstLayerLinker;
import org.farhan.validation.OtherLayerConverter;
import org.farhan.validation.OtherLayerLinker;
import org.farhan.validation.Utilities;

public class UMLStuffDoer {

	private Feature theFeature;

	public static File umlDir = new File("/target/uml/");
	public static File javaDir = new File("." + "src/test/java/");

	public static ArrayList<File> firstLayerFiles;
	public static ArrayList<File> secondLayerFiles;
	public static ArrayList<File> thirdLayerFiles;
	public static String firstLayerPackageName;
	public static String secondLayerPackageName;
	public static String thirdLayerPackageName;

	protected Model theSystem;

	public UMLStuffDoer(Feature feature) {
		firstLayerPackageName = "specs";
		// specs are sequences of keywords
		secondLayerPackageName = "keywords";
		// keywords reference objects like page objects or file objects
		thirdLayerPackageName = "objects";
		this.theFeature = feature;
	}

	public void makeUMLModel() throws Exception {

		theSystem = UMLProject.initProject("pst");
		FirstLayerConverter firstLayerConverter = new FirstLayerConverter(theSystem);
		OtherLayerConverter otherLayerConverter = new OtherLayerConverter(theSystem);
		FirstLayerLinker firstLayerLinker = new FirstLayerLinker(theSystem);
		OtherLayerLinker otherLayerLinker = new OtherLayerLinker(theSystem);
		// TODO trimFileExtension() for segment?
		firstLayerFiles = firstLayerConverter.selectLayerFiles(theFeature.eResource().getURI().lastSegment());
		//firstLayerConverter.transformLayerFiles(firstLayerFiles);
		//secondLayerFiles = otherLayerConverter.selectLayerFiles(firstLayerPackageName);
		//otherLayerConverter.transformLayerFiles(secondLayerFiles);
		//firstLayerLinker.linkLayerFiles(firstLayerPackageName);
		//thirdLayerFiles = otherLayerConverter.selectLayerFiles(secondLayerPackageName);
		//otherLayerConverter.transformLayerFiles(thirdLayerFiles);
		//otherLayerLinker.linkLayerFiles(secondLayerPackageName);
		//UMLProject.writeUMLFile(theSystem, umlDir);
	}

	// TODO should probably move to the JavaFile or Cucumber file etc
	public static String convertCucumberPathToQualifiedName(String filePath) {
		String qualifiedName = filePath.trim();
		qualifiedName = qualifiedName.replace(".feature", "");
		qualifiedName = qualifiedName.replace(File.separator, "::");
		qualifiedName = qualifiedName.replace("cucumber::", "Tests::");
		qualifiedName = qualifiedName.split("(Tests)")[1];
		qualifiedName = "pst::Logical" + qualifiedName;
		return qualifiedName;
	}

	// TODO should probably move to the JavaFile or Cucumber file etc. There should
	// toQualifiedName in the RobotFileConverter
	public static String convertJavaPathToQualifiedName(String pathName) {
		String qualifiedName = pathName.trim();
		qualifiedName = qualifiedName.replace(".java", "");
		qualifiedName = qualifiedName.replace(getSecondLayerDir().getAbsolutePath(), "subsystems");
		qualifiedName = qualifiedName.replace(getThirdLayerDir().getAbsolutePath(), "components");
		qualifiedName = qualifiedName.replace(File.separator, "::");
		qualifiedName = "pst::Logical::" + qualifiedName;
		return qualifiedName;
	}

	// TODO should probably move to the JavaFile or Cucumber file etc
	public static String convertQualifiedNameToCucumberPath(String qualifiedName) {
		String pathName = qualifiedName;
		pathName = pathName.replace("pst::Logical", "");
		pathName = pathName.replace("::", File.separator);
		pathName = pathName + ".feature";
		return pathName;
	}

	// TODO should probably move to the JavaFile or Cucumber file etc
	public static String convertQualifiedNameToJavaPath(String qualifiedName) {

		String pathName = qualifiedName;
		String className = getName(qualifiedName);
		pathName = pathName.replaceAll(className + "$", "").toLowerCase() + className;
		pathName = pathName.replace("pst::logical::subsystems", getSecondLayerDir().getAbsolutePath());
		pathName = pathName.replace("pst::logical::components", getThirdLayerDir().getAbsolutePath());
		pathName = pathName.replace("pst::logical::common", getFourthLayerDir().getAbsolutePath());
		// TODO this statement is temp hack to handle io and java package imports
		pathName = pathName.replace("pst::logical", javaDir.getAbsolutePath());
		pathName = pathName.replace("::", File.separator);
		pathName = pathName + ".java";
		return pathName;
	}

	// TODO probably rename this to getPackage from name?
	public static String convertJavaPathToJavaPackage(String path) {

		return convertJavaPathToJavaImport(
				path.replaceAll("\\" + File.separator + "[^\\" + File.separator + "]*$", ""));
	}

	public static String convertJavaPathToJavaImport(String path) {
		// get absolute path
		String packageName = path;
		// remove the file extension
		packageName = packageName.replace(".java", "");
		// convert file separator to .
		packageName = packageName.replace(File.separator, ".");
		// remove the java src dir
		String root = javaDir.getAbsolutePath().replace(File.separator, ".");
		packageName = packageName.split(root + ".")[1];
		return packageName;
	}

	public static File getSecondLayerDir() {
		File aFile = new File("." + "src/test/java/subsystems/");
		aFile.mkdirs();
		return aFile;
	}

	public static File getThirdLayerDir() {
		File aFile = new File("." + "src/test/java/components/");
		aFile.mkdirs();
		return aFile;
	}

	public static File getFourthLayerDir() {
		File aFile = new File("." + "src/test/java/common/");
		aFile.mkdirs();
		return aFile;
	}

	public static File getFirstLayerDir() {
		return new File("." + "src/test/cucumber/");
	}

	public static String getJavaClassName(String name) {
		// TODO Ideally the PST needs to be transformed into PIT
		// Then the PIT would be transformed into a proper Java PST.
		// Right now I'm going from a Robot PST to Java Language ugh...
		return name.replaceAll("_", "");
	}

	public static String getName(String qualifiedName) {
		return Utilities.regexFind("(.*::)?([^:]+)", qualifiedName, 2);
	}

}


package org.farhan.mbt.conv.cucumber;

import java.io.File;

import org.farhan.conv.core.Project;
import org.farhan.mbt.conv.uml.UMLNameTranslator;

public class CucumberProject extends Project {

	public static File javaDir = new File(baseDir + "src/test/java/");

	public CucumberProject() {
		super();
	}

	public static String convertCucumberPathToQualifiedName(String filePath) {
		String qualifiedName = filePath.trim();
		qualifiedName = qualifiedName.replace(".feature", "");
		qualifiedName = qualifiedName.replace(File.separator, "::");
		qualifiedName = qualifiedName.replace("cucumber::", "Tests::specs::");
		qualifiedName = qualifiedName.split("(Tests)")[1];
		qualifiedName = "pst" + qualifiedName;
		return qualifiedName;
	}

	public static String convertJavaPathToQualifiedName(String pathName) {
		String qualifiedName = pathName.trim();
		qualifiedName = qualifiedName.replace(".java", "");
		qualifiedName = qualifiedName.replace(getSecondLayerDir().getAbsolutePath(), "stepdefs");
		qualifiedName = qualifiedName.replace(getThirdLayerDir().getAbsolutePath(), "objects");
		qualifiedName = qualifiedName.replace(File.separator, "::");
		qualifiedName = "pst::" + qualifiedName;
		return qualifiedName;
	}

	public static String convertQualifiedNameToCucumberPath(String qualifiedName) {
		String pathName = qualifiedName;
		pathName = pathName.replace("pst::specs", "");
		pathName = pathName.replace("::", File.separator);
		pathName = pathName + ".feature";
		return pathName;
	}

	// TODO should probably move to the JavaFile or Cucumber file etc
	public static String convertQualifiedNameToJavaPath(String qualifiedName) {

		String pathName = qualifiedName;
		String className = UMLNameTranslator.getName(qualifiedName);
		pathName = pathName.replaceAll(className + "$", "").toLowerCase() + className;
		pathName = pathName.replace("pst::stepdefs", getSecondLayerDir().getAbsolutePath());
		pathName = pathName.replace("pst::objects", getThirdLayerDir().getAbsolutePath());
		pathName = pathName.replace("pst::common", getFourthLayerDir().getAbsolutePath());
		// TODO this statement is temp hack to handle io and java package imports
		pathName = pathName.replace("pst", javaDir.getAbsolutePath());
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
		File aFile = new File(baseDir + "src/test/java/org/farhan/stepdefs/");
		aFile.mkdirs();
		return aFile;
	}

	public static File getThirdLayerDir() {
		File aFile = new File(baseDir + "src/test/java/org/farhan/objects/");
		aFile.mkdirs();
		return aFile;
	}

	public static File getFourthLayerDir() {
		File aFile = new File(baseDir + "src/test/java/org/farhan/common/");
		aFile.mkdirs();
		return aFile;
	}

	public static File getFirstLayerDir() {
		return new File(baseDir + "src/test/cucumber/");
	}

	public static String getJavaClassName(String name) {
		// TODO Ideally the PST needs to be transformed into PIT
		// Then the PIT would be transformed into a proper Java PST.
		// Right now I'm going from a Robot PST to Java Language ugh...
		return name.replaceAll("_", "");
	}

}

package org.farhan.mbt.cucumber;

import java.io.File;

import org.farhan.mbt.core.Project;
import org.farhan.mbt.core.Utilities;

public class CucumberNameConverter {

	// TODO refactor this and think about name translations and mapping code
	// This should only be used when deriving layer 2 and 3 objects from layer 1
	public static String getMethodName(String name, boolean keepNumbers) {
		// remove arguments
		String newName = name;
		newName = Utilities.removeDelimiterAndCapitalize(newName, "\\.");
		newName = Utilities.removeDelimiterAndCapitalize(newName, "\\-");
		newName = Utilities.removeDelimiterAndCapitalize(newName, "/");
		newName = Utilities.removeDelimiterAndCapitalize(newName, " ");
		newName = newName.replaceAll("[^a-zA-Z0-9]", "");
		if (!keepNumbers) {
			newName = newName.replaceAll("[^a-zA-Z]", "");
		}
		// change first character to lower case
		newName = Utilities.toLowerCamelCase(newName);
		return newName;
	}

	public static String convertCucumberPathToQualifiedName(String filePath) {
		String qualifiedName = filePath.trim();
		qualifiedName = qualifiedName.replace(".feature", "");
		qualifiedName = qualifiedName.replace(File.separator, "::");
		qualifiedName = qualifiedName.replace("cucumber::", "specs::");
		qualifiedName = qualifiedName.split("(Tests)")[1];
		qualifiedName = "pst" + qualifiedName;
		return qualifiedName;
	}

	public static String convertJavaPathToQualifiedName(String pathName) {
		String qualifiedName = pathName.trim();
		qualifiedName = qualifiedName.replace(".java", "");
		qualifiedName = qualifiedName.replace(
				CucumberProject.getLayerDir(Project.secondLayerPackageName).getAbsolutePath(),
				Project.secondLayerPackageName);
		qualifiedName = qualifiedName.replace(
				CucumberProject.getLayerDir(Project.thirdLayerPackageName).getAbsolutePath(),
				Project.thirdLayerPackageName);
		qualifiedName = qualifiedName.replace(File.separator, "::");
		qualifiedName = "pst::" + qualifiedName;
		return qualifiedName;
	}

	public static String convertQualifiedNameToCucumberPath(String qualifiedName) {
		String pathName = qualifiedName;
		pathName = pathName.replace("pst::" + Project.firstLayerPackageName,
				CucumberProject.getLayerDir(Project.firstLayerPackageName).getAbsolutePath());
		pathName = pathName.replace("::", File.separator);
		// TODO isn't feature defined somewhere else as getFileType? Maybe there should
		// be get Layer 1 filetype, layer 2 filetype etc defined here
		pathName = pathName + ".feature";
		return pathName;
	}

	public static String convertQualifiedNameToJavaPath(String qualifiedName) {

		String pathName = qualifiedName;
		pathName = pathName.replace("pst::" + Project.secondLayerPackageName,
				CucumberProject.getLayerDir(Project.secondLayerPackageName).getAbsolutePath());
		pathName = pathName.replace("pst::" + Project.thirdLayerPackageName,
				CucumberProject.getLayerDir(Project.thirdLayerPackageName).getAbsolutePath());
		pathName = pathName.replace("::", File.separator);
		pathName = pathName + ".java";
		return pathName;
	}

}

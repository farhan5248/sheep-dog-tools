package org.farhan.mbt.core;

import java.util.ArrayList;

import org.farhan.mbt.uml.UMLClassWrapper;
import org.farhan.mbt.uml.UMLProject;

public abstract class ConverterNew {

	protected String tags = "";
	protected ConvertibleProject srcPrj;
	protected ConvertibleProject tgtPrj;
	protected ObjectRepository fa;

	public ConverterNew(String tags, ObjectRepository fa) {
		this.tags = tags;
		this.fa = fa;
	}

	public ArrayList<String> getObjectNames() {
		// TODO this is temp hack until I figure out how to manage the objects, the
		// project files and model better
		ArrayList<String> objects = new ArrayList<String>();
		if (srcPrj instanceof UMLProject) {
			for (ConvertibleObject co : srcPrj.getObjects(srcPrj.TEST_CASES)) {
				objects.add(getPath((UMLClassWrapper) co, srcPrj.TEST_CASES));
			}
			for (ConvertibleObject co : srcPrj.getObjects(srcPrj.TEST_OBJECTS)) {
				objects.add(getPath((UMLClassWrapper) co, srcPrj.TEST_STEPS));
				objects.add(getPath((UMLClassWrapper) co, srcPrj.TEST_OBJECTS));
			}
		}
		return objects;
	}

	private String getPath(UMLClassWrapper srcObj, String tgtLayer) {
		String path = srcObj.getQualifiedName();
		String[] pathParts = path.split("::");
		String componentName = pathParts[2];
		String objectName = pathParts[pathParts.length - 1];

		if (tgtLayer.contentEquals(tgtPrj.TEST_CASES)) {
			path = path.replace("pst::" + srcPrj.TEST_CASES, "");
		}
		if (tgtLayer.contentEquals(tgtPrj.TEST_STEPS)) {
			path = path.replace("pst::" + srcPrj.TEST_OBJECTS + "::" + componentName,
					"::" + componentName.toLowerCase());
			path = path.replace(objectName, Utilities.upperFirst(componentName) + objectName + "Steps");
		}
		if (tgtLayer.contentEquals(tgtPrj.TEST_OBJECTS)) {
			path = path.replace("pst::" + srcPrj.TEST_OBJECTS + "::" + componentName,
					"::" + componentName.toLowerCase());
		}

		path = path.replace("::", "/");
		path = tgtPrj.getDir(tgtLayer) + path + tgtPrj.getFileExt(tgtLayer);

		return path;
	}

	public abstract String convertObject(String tags, String path, String content) throws Exception;

	public abstract void initProjects() throws Exception;

	// TODO this is temp until I delete the second layer of feature files
	protected String convertSrcPath(String path, String layer) {
		return convertPath(path, srcPrj, tgtPrj, layer);
	}

	protected String convertSrcPath(String path) {
		return convertPath(path, srcPrj, tgtPrj);
	}

	protected String convertTgtPath(String path) {
		return convertPath(path, tgtPrj, srcPrj);
	}

	private String convertPath(String path, ConvertibleProject filesPrj, ConvertibleProject modelPrj) {
		String layer = filesPrj.TEST_CASES;
		if (path.startsWith(filesPrj.getDir(filesPrj.TEST_STEPS))) {
			layer = filesPrj.TEST_STEPS;
		}
		if (path.startsWith(filesPrj.getDir(filesPrj.TEST_OBJECTS))) {
			layer = filesPrj.TEST_OBJECTS;
		}
		return convertPath(path, filesPrj, modelPrj, layer);
	}

	private String convertPath(String path, ConvertibleProject filesPrj, ConvertibleProject modelPrj, String layer) {
		String qualifiedName = path.replace(",", "").trim();
		qualifiedName = qualifiedName.replace(filesPrj.getFileExt(layer), "");
		qualifiedName = qualifiedName.replace(filesPrj.getDir(layer), "");
		qualifiedName = qualifiedName.replace("/", "::");

		// TODO yet another temp hack. The uml model doesn't currently have a layer for
		// every file system layer so layers 2 and 3 have to be mapped to the objects
		// layer. I think I need 5 layers:
		// test cases - src
		// test objects - src
		// test object steps - tgt
		// test object interfaces - tgt
		// test object data - tgt

		if (layer.contentEquals(filesPrj.TEST_CASES)) {
			qualifiedName = "pst::" + modelPrj.TEST_CASES + qualifiedName;
		} else {
			qualifiedName = "pst::" + modelPrj.TEST_OBJECTS + qualifiedName;
		}

		return qualifiedName;
	}
}

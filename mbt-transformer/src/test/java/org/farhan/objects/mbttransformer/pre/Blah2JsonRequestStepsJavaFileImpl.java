package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.JavaFileObject;
import org.farhan.common.UMLFileObject;
import org.farhan.objects.mbttransformer.Blah2JsonRequestStepsJavaFile;

public class Blah2JsonRequestStepsJavaFileImpl extends JavaFileObject implements Blah2JsonRequestStepsJavaFile {

	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}

	@Override
	public void assertFieldsSectionAnnotation(HashMap<String, String> keyMap) {
		assertMethodAnnotationExists(keyMap.get("Method Name"), keyMap.get("Annotation"));
	}

	@Override
	public void assertFieldsSectionMethodName(HashMap<String, String> keyMap) {
		assertMethodExists(keyMap.get("Method Name"));
	}

	@Override
	public void assertFieldsSectionStatement(HashMap<String, String> keyMap) {
		assertMethodStatementExists(keyMap.get("Method Name"), keyMap.get("Statement"));
	}

	@Override
	public void assertPresent(HashMap<String, String> keyMap) {
		assertObjectExists();
	}

	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}
}

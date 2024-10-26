package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.UMLFileObject;
import org.farhan.objects.mbttransformer.PstUmlFile;

public class PstUmlFileImpl extends UMLFileObject implements PstUmlFile {

	@Override
	public void assertClassAnnotationsSectionAnnotationDetail(HashMap<String, String> keyMap) {
		assertClassAnnotationDetailExists(keyMap.get("Class Name"), keyMap.get("Annotation Name"),
				keyMap.get("Annotation Detail"));
	}

	@Override
	public void assertClassAnnotationsSectionAnnotationName(HashMap<String, String> keyMap) {
		assertClassAnnotationNameExists(keyMap.get("Class Name"), keyMap.get("Annotation Name"));
	}

	@Override
	public void assertClassAnnotationsSectionClassName(HashMap<String, String> keyMap) {
		assertClassExists(keyMap.get("Class Name"));
	}

	public void assertClassClassName(HashMap<String, String> keyMap) {
		assertClassExists(keyMap.get("Class Name"));
	}

	@Override
	public void assertClassCommentsSectionClassName(HashMap<String, String> keyMap) {
		assertClassExists(keyMap.get("Class Name"));
	}

	@Override
	public void assertClassCommentsSectionComment(HashMap<String, String> keyMap) {
		assertClassCommentValue(keyMap.get("Class Name"), keyMap.get("Comment"));
	}

	@Override
	public void assertClassSectionClassName(HashMap<String, String> keyMap) {
		assertClassExists(keyMap.get("Class Name"));
	}

	public void assertClassSectionClassNameNegative(HashMap<String, String> keyMap) {
		assertClassNotExists(keyMap.get("Class Name"));
	}

	@Override
	public void assertInteractionAnnotationsSectionAnnotationDetail(HashMap<String, String> keyMap) {
		assertInteractionAnnotationDetailExists(keyMap.get("Interaction Name"), keyMap.get("Annotation Name"),
				keyMap.get("Annotation Detail"));
	}

	@Override
	public void assertInteractionAnnotationsSectionAnnotationName(HashMap<String, String> keyMap) {
		assertInteractionAnnotationNameExists(keyMap.get("Interaction Name"), keyMap.get("Annotation Name"));
	}

	@Override
	public void assertInteractionAnnotationsSectionInteractionName(HashMap<String, String> keyMap) {
		assertInteractionExists(keyMap.get("Interaction Name"));
	}

	@Override
	public void assertInteractionCommentsSectionComment(HashMap<String, String> keyMap) {
		assertInteractionCommentValue(keyMap.get("Interaction Name"), keyMap.get("Comment"));
	}

	@Override
	public void assertInteractionCommentsSectionInteractionName(HashMap<String, String> keyMap) {
		assertInteractionExists(keyMap.get("Interaction Name"));
	}

	@Override
	public void assertInteractionMessagesSectionAnnotationDetail(HashMap<String, String> keyMap) {
		assertInteractionMessageAnnotationDetailExists(keyMap.get("Interaction Name"), keyMap.get("Message"),
				keyMap.get("Argument Name"), keyMap.get("Annotation Detail"));
	}

	@Override
	public void assertInteractionMessagesSectionArgumentName(HashMap<String, String> keyMap) {
		assertInteractionMessageArgumentNameExists(keyMap.get("Interaction Name"), keyMap.get("Message"),
				keyMap.get("Argument Name"));
	}

	@Override
	public void assertInteractionMessagesSectionInteractionName(HashMap<String, String> keyMap) {
		assertInteractionExists(keyMap.get("Interaction Name"));
	}

	@Override
	public void assertInteractionMessagesSectionMessage(HashMap<String, String> keyMap) {
		assertInteractionMessageValue(keyMap.get("Interaction Name"), keyMap.get("Message"));
	}

	@Override
	public void assertPresent(HashMap<String, String> keyMap) {
		assertObjectExists();
	}

	public void setPath(String path) {
		keyValue.put("path", path);
	}

	@Override
	public void assertInteractionSectionInteractionName(HashMap<String, String> keyMap) {
		assertInteractionExists(keyMap.get("Interaction Name"));
	}

	public void assertInteractionSectionInteractionNameNegative(HashMap<String, String> keyMap) {
		assertInteractionNotExists(keyMap.get("Interaction Name"));
	}

}

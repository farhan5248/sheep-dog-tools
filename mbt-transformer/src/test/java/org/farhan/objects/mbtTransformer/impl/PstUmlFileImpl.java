package org.farhan.objects.mbtTransformer.impl;

import java.util.HashMap;

import org.farhan.common.UMLFileObject;
import org.farhan.objects.mbtTransformer.PstUmlFile;

public class PstUmlFileImpl extends UMLFileObject implements PstUmlFile {

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
	public void assertClassElementImportsSectionClassName(HashMap<String, String> keyMap) {
		assertClassExists(keyMap.get("Class Name"));
	}

	@Override
	public void assertClassElementImportsSectionImportedElement(HashMap<String, String> keyMap) {
		assertClassImportedElementValue(keyMap.get("Class Name"), keyMap.get("Imported Element"));
	}

	@Override
	public void assertClassInteractionsSectionClassName(HashMap<String, String> keyMap) {
		assertClassExists(keyMap.get("Class Name"));
	}

	@Override
	public void assertClassInteractionsSectionInteractionName(HashMap<String, String> keyMap) {
		assertInteractionNameExists(keyMap.get("Class Name"), keyMap.get("Interaction Name"));
	}

	@Override
	public void assertClassPropertiesSectionClassName(HashMap<String, String> keyMap) {
		assertClassExists(keyMap.get("Class Name"));
	}

	@Override
	public void assertClassPropertiesSectionPropertyName(HashMap<String, String> keyMap) {
		assertClassPropertyNameExists(keyMap.get("Class Name"), keyMap.get("Property Name"));
	}

	@Override
	public void assertClassPropertiesSectionPropertyType(HashMap<String, String> keyMap) {
		assertClassPropertyTypeValue(keyMap.get("Class Name"), keyMap.get("Property Name"),
				keyMap.get("Property Type"));
	}

	@Override
	public void assertClassSectionClassName(HashMap<String, String> keyMap) {
		assertClassExists(keyMap.get("Class Name"));
	}

	@Override
	public void assertInteractionAnnotationsSectionAnnotationName(HashMap<String, String> keyMap) {
		assertInteractionAnnotationNameExists(keyMap.get("Interaction Name"), keyMap.get("Annotation Name"));
	}

	@Override
	public void assertInteractionAnnotationsSectionInteractionName(HashMap<String, String> keyMap) {
		assertInteractionNameExists(keyMap.get("Interaction Name"));
	}

	@Override
	public void assertInteractionCommentsSectionComment(HashMap<String, String> keyMap) {
		assertInteractionCommentValue(keyMap.get("Interaction Name"), keyMap.get("Comment"));
	}

	@Override
	public void assertInteractionCommentsSectionInteractionName(HashMap<String, String> keyMap) {
		assertInteractionNameExists(keyMap.get("Interaction Name"));
	}

	@Override
	public void assertInteractionLifelinesSectionInteractionName(HashMap<String, String> keyMap) {
		assertInteractionNameExists(keyMap.get("Interaction Name"));
	}

	@Override
	public void assertInteractionLifelinesSectionLifelineName(HashMap<String, String> keyMap) {
		assertInteractionLifelineExists(keyMap.get("Interaction Name"), keyMap.get("Lifeline Name"));
	}

	@Override
	public void assertInteractionLifelinesSectionLifelineRepresents(HashMap<String, String> keyMap) {
		assertInteractionLifelineRepresentsValue(keyMap.get("Interaction Name"), keyMap.get("Lifeline Name"),
				keyMap.get("Lifeline Represents"));
	}

	@Override
	public void assertInteractionMessageOccurencesSectionInteractionName(HashMap<String, String> keyMap) {
		assertInteractionNameExists(keyMap.get("Interaction Name"));
	}

	@Override
	public void assertInteractionMessageOccurencesSectionLifelineCovered(HashMap<String, String> keyMap) {
		assertInteractionLifelineCoveredValue(keyMap.get("Interaction Name"), keyMap.get("Message Occurence"),
				keyMap.get("Lifeline Covered"));
	}

	@Override
	public void assertInteractionMessageOccurencesSectionMessageOccurence(HashMap<String, String> keyMap) {
		assertInteractionMessageOccurenceExists(keyMap.get("Interaction Name"), keyMap.get("Message Occurence"));
	}

	@Override
	public void assertInteractionMessagesSectionInteractionName(HashMap<String, String> keyMap) {
		assertInteractionNameExists(keyMap.get("Interaction Name"));
	}

	@Override
	public void assertInteractionMessagesSectionMessage(HashMap<String, String> keyMap) {
		assertInteractionMessageValue(keyMap.get("Interaction Name"), keyMap.get("Message"));
	}

	@Override
	public void assertInteractionParametersSectionInteractionName(HashMap<String, String> keyMap) {
		assertInteractionNameExists(keyMap.get("Interaction Name"));
	}

	@Override
	public void assertInteractionParametersSectionParameterName(HashMap<String, String> keyMap) {
		assertInteractionParameterNameExists(keyMap.get("Interaction Name"), keyMap.get("Parameter Name"));
	}

	@Override
	public void assertPresent(HashMap<String, String> keyMap) {
		assertModelExists();
	}

	public void setPath(String path) {
		// TODO this should be an attribute like Present etc so don't store this here,
		// then update the MbtTranformerFactory
		keyValue.put("path", path);
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
	public void assertInteractionAnnotationsSectionAnnotationDetail(HashMap<String, String> keyMap) {
		assertInteractionAnnotationDetailExists(keyMap.get("Interaction Name"), keyMap.get("Annotation Name"),
				keyMap.get("Annotation Detail"));
	}

}

package org.farhan.objects.mbtTransformer;

import java.util.HashMap;

import org.farhan.common.objects.MbtTransformer;

public class MbtTransformerPstUmlFile extends MbtTransformer {

	public void setPath(String path) {
		// TODO this should be an attribute like Present etc so don't store this here
		keyValue.put("path", path);
	}

	public void assertPresent(HashMap<String, String> keyMap) {
		assertModelExists();
	}

	public void assertClassClassName(HashMap<String, String> keyMap) {
		assertClassExists(keyMap.get("Class Name"));
	}

	public void assertClassCommentsClassName(HashMap<String, String> keyMap) {
		assertClassExists(keyMap.get("Class Name"));
	}

	public void assertClassCommentsComment(HashMap<String, String> keyMap) {
		assertClassCommentValue(keyMap.get("Class Name"), keyMap.get("Comment"));
	}

	public void assertClassElementImportsClassName(HashMap<String, String> keyMap) {
		assertClassExists(keyMap.get("Class Name"));
	}

	public void assertClassElementImportsAlias(HashMap<String, String> keyMap) {
		assertClassAliasValue(keyMap.get("Class Name"), keyMap.get("Alias"));
	}

	public void assertClassElementImportsImportedElement(HashMap<String, String> keyMap) {
		assertClassImportedElementValue(keyMap.get("Class Name"), keyMap.get("Imported Element"));
	}

	public void assertClassPropertiesClassName(HashMap<String, String> keyMap) {
		assertClassExists(keyMap.get("Class Name"));
	}

	public void assertClassPropertiesPropertyName(HashMap<String, String> keyMap) {
		assertClassPropertyNameExists(keyMap.get("Class Name"), keyMap.get("Property Name"));
	}

	public void assertClassPropertiesPropertyType(HashMap<String, String> keyMap) {
		assertClassPropertyTypeValue(keyMap.get("Class Name"), keyMap.get("Property Name"),
				keyMap.get("Property Type"));
	}

	public void assertClassInteractionsClassName(HashMap<String, String> keyMap) {
		assertClassExists(keyMap.get("Class Name"));
	}

	public void assertClassInteractionsInteractionName(HashMap<String, String> keyMap) {
		assertInteractionNameExists(keyMap.get("Class Name"), keyMap.get("Interaction Name"));
	}

	public void assertInteractionParametersInteractionName(HashMap<String, String> keyMap) {
		assertInteractionNameExists(keyMap.get("Interaction Name"));
	}

	public void assertInteractionParametersParameterName(HashMap<String, String> keyMap) {
		assertInteractionParameterNameExists(keyMap.get("Interaction Name"), keyMap.get("Parameter Name"));
	}

	public void assertInteractionCommentsInteractionName(HashMap<String, String> keyMap) {
		assertInteractionNameExists(keyMap.get("Interaction Name"));
	}

	public void assertInteractionCommentsComment(HashMap<String, String> keyMap) {
		assertInteractionCommentValue(keyMap.get("Interaction Name"), keyMap.get("Comment"));
	}

	public void assertInteractionAnnotationsInteractionName(HashMap<String, String> keyMap) {
		assertInteractionNameExists(keyMap.get("Interaction Name"));
	}

	public void assertInteractionAnnotationsAnnotationName(HashMap<String, String> keyMap) {
		assertInteractionAnnotationNameExists(keyMap.get("Interaction Name"), keyMap.get("Annotation Name"));
	}

	public void assertInteractionAnnotationsAnnotationDetail(HashMap<String, String> keyMap) {
		assertInteractionAnnotationDetailExists(keyMap.get("Interaction Name"), keyMap.get("Annotation Name"),
				keyMap.get("Annotation Detail"));
	}

	public void assertInteractionLifelinesInteractionName(HashMap<String, String> keyMap) {
		assertInteractionNameExists(keyMap.get("Interaction Name"));
	}

	public void assertInteractionLifelinesLifelineName(HashMap<String, String> keyMap) {
		assertInteractionLifelineExists(keyMap.get("Interaction Name"), keyMap.get("Lifeline Name"));
	}

	public void assertInteractionLifelinesLifelineRepresents(HashMap<String, String> keyMap) {
		assertInteractionLifelineRepresentsValue(keyMap.get("Interaction Name"), keyMap.get("Lifeline Name"),
				keyMap.get("Lifeline Represents"));
	}

	public void assertInteractionMessagesInteractionName(HashMap<String, String> keyMap) {
		assertInteractionNameExists(keyMap.get("Interaction Name"));
	}

	public void assertInteractionMessagesMessage(HashMap<String, String> keyMap) {
		assertInteractionMessageValue(keyMap.get("Interaction Name"), keyMap.get("Message"));
	}

	public void assertInteractionMessagesArgumentName(HashMap<String, String> keyMap) {
		assertInteractionMessageArgumentNameExists(keyMap.get("Interaction Name"), keyMap.get("Message"),
				keyMap.get("Argument Name"));
	}

	public void assertInteractionMessagesAnnotationName(HashMap<String, String> keyMap) {
		assertInteractionMessageAnnotationNameExists(keyMap.get("Interaction Name"), keyMap.get("Message"),
				keyMap.get("Annotation Name"));
	}

	public void assertInteractionMessagesAnnotationDetail(HashMap<String, String> keyMap) {
		assertInteractionMessageAnnotationDetailExists(keyMap.get("Interaction Name"), keyMap.get("Message"),
				keyMap.get("Argument Name"), keyMap.get("Annotation Detail"));
	}

	public void assertInteractionMessageOccurencesInteractionName(HashMap<String, String> keyMap) {
		assertInteractionNameExists(keyMap.get("Interaction Name"));
	}

	public void assertInteractionMessageOccurencesMessageOccurence(HashMap<String, String> keyMap) {
		assertInteractionMessageOccurenceExists(keyMap.get("Interaction Name"), keyMap.get("Message Occurence"));
	}

	public void assertInteractionMessageOccurencesLifelineCovered(HashMap<String, String> keyMap) {
		assertInteractionLifelineCoveredValue(keyMap.get("Interaction Name"), keyMap.get("Message Occurence"),
				keyMap.get("Lifeline Covered"));
	}
}

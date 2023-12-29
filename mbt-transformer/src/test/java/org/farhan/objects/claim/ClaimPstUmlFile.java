package org.farhan.objects.claim;

import java.util.HashMap;

import org.farhan.common.objects.FileObject;
import org.farhan.common.objects.UMLFile;

public class ClaimPstUmlFile extends UMLFile {

	public FileObject setPath(String path) {
		keyValue.put("path", path);
		return this;
	}

	public FileObject assertIsPresent() {
		keyValue.put("model", "pst");
		super.assertIsPresent();
		return this;
	}

	public FileObject assertClassClassName(HashMap<String, String> keyMap) {
		assertClassExists(keyMap.get("Class Name"));
		return this;
	}

	public FileObject assertClassCommentsClassName(HashMap<String, String> keyMap) {
		assertClassExists(keyMap.get("Class Name"));
		return this;
	}

	public FileObject assertClassCommentsComment(HashMap<String, String> keyMap) {
		assertClassCommentValue(keyMap.get("Class Name"), keyMap.get("Comment"));
		return this;
	}

	public FileObject assertClassElementImportsClassName(HashMap<String, String> keyMap) {
		assertClassExists(keyMap.get("Class Name"));
		return this;
	}

	public FileObject assertClassElementImportsAlias(HashMap<String, String> keyMap) {
		assertClassAliasValue(keyMap.get("Class Name"), keyMap.get("Alias"));
		return this;
	}

	public FileObject assertClassElementImportsImportedElement(HashMap<String, String> keyMap) {
		assertClassImportedElementValue(keyMap.get("Class Name"), keyMap.get("Imported Element"));
		return this;
	}

	public FileObject assertClassPropertiesClassName(HashMap<String, String> keyMap) {
		assertClassExists(keyMap.get("Class Name"));
		return this;
	}

	public FileObject assertClassPropertiesPropertyName(HashMap<String, String> keyMap) {
		assertClassPropertyNameExists(keyMap.get("Class Name"), keyMap.get("Property Name"));
		return this;
	}

	public FileObject assertClassPropertiesPropertyType(HashMap<String, String> keyMap) {
		assertClassPropertyTypeValue(keyMap.get("Class Name"), keyMap.get("Property Name"),
				keyMap.get("Property Type"));
		return this;
	}

	public FileObject assertClassInteractionsClassName(HashMap<String, String> keyMap) {
		assertClassExists(keyMap.get("Class Name"));
		return this;
	}

	public FileObject assertClassInteractionsInteractionName(HashMap<String, String> keyMap) {
		assertInteractionNameExists(keyMap.get("Class Name"), keyMap.get("Interaction Name"));
		return this;
	}

	public FileObject assertInteractionParametersInteractionName(HashMap<String, String> keyMap) {
		assertInteractionNameExists(keyMap.get("Interaction Name"));
		return this;
	}

	public FileObject assertInteractionParametersParameterName(HashMap<String, String> keyMap) {
		assertInteractionParameterNameExists(keyMap.get("Interaction Name"), keyMap.get("Parameter Name"));
		return this;
	}

	public FileObject assertInteractionCommentsInteractionName(HashMap<String, String> keyMap) {
		assertInteractionNameExists(keyMap.get("Interaction Name"));
		return this;
	}

	public FileObject assertInteractionCommentsComment(HashMap<String, String> keyMap) {
		assertInteractionCommentValue(keyMap.get("Interaction Name"), keyMap.get("Comment"));
		return this;
	}

	public FileObject assertInteractionAnnotationsInteractionName(HashMap<String, String> keyMap) {
		assertInteractionNameExists(keyMap.get("Interaction Name"));
		return this;
	}

	public FileObject assertInteractionAnnotationsAnnotationName(HashMap<String, String> keyMap) {
		assertInteractionAnnotationNameExists(keyMap.get("Interaction Name"), keyMap.get("Annotation Name"));
		return this;
	}

	public FileObject assertInteractionAnnotationsAnnotationDetail(HashMap<String, String> keyMap) {
		assertInteractionAnnotationDetailExists(keyMap.get("Interaction Name"), keyMap.get("Annotation Name"),
				keyMap.get("Annotation Detail"));
		return this;
	}

	public FileObject assertInteractionLifelinesInteractionName(HashMap<String, String> keyMap) {
		assertInteractionNameExists(keyMap.get("Interaction Name"));
		return this;
	}

	public FileObject assertInteractionLifelinesLifelineName(HashMap<String, String> keyMap) {
		assertInteractionLifelineExists(keyMap.get("Interaction Name"), keyMap.get("Lifeline Name"));
		return this;
	}

	public FileObject assertInteractionLifelinesLifelineRepresents(HashMap<String, String> keyMap) {
		assertInteractionLifelineRepresentsValue(keyMap.get("Interaction Name"), keyMap.get("Lifeline Name"),
				keyMap.get("Lifeline Represents"));
		return this;
	}

	public FileObject assertInteractionMessagesInteractionName(HashMap<String, String> keyMap) {
		assertInteractionNameExists(keyMap.get("Interaction Name"));
		return this;
	}

	public FileObject assertInteractionMessagesMessage(HashMap<String, String> keyMap) {
		assertInteractionMessageValue(keyMap.get("Interaction Name"), keyMap.get("Message"));
		return this;
	}

	public FileObject assertInteractionMessagesArgumentName(HashMap<String, String> keyMap) {
		assertInteractionMessageArgumentNameExists(keyMap.get("Interaction Name"), keyMap.get("Message"),
				keyMap.get("Argument Name"));
		return this;
	}

	public FileObject assertInteractionMessagesAnnotationName(HashMap<String, String> keyMap) {
		assertInteractionMessageAnnotationNameExists(keyMap.get("Interaction Name"), keyMap.get("Message"),
				keyMap.get("Annotation Name"));
		return this;
	}

	public FileObject assertInteractionMessagesAnnotationDetail(HashMap<String, String> keyMap) {
		assertInteractionMessageAnnotationDetailExists(keyMap.get("Interaction Name"), keyMap.get("Message"),
				keyMap.get("Argument Name"), keyMap.get("Annotation Detail"));
		return this;
	}

	public FileObject assertInteractionMessageOccurencesInteractionName(HashMap<String, String> keyMap) {
		assertInteractionNameExists(keyMap.get("Interaction Name"));
		return this;
	}

	public FileObject assertInteractionMessageOccurencesMessageOccurence(HashMap<String, String> keyMap) {
		assertInteractionMessageOccurenceExists(keyMap.get("Interaction Name"), keyMap.get("Message Occurence"));
		return this;
	}

	public FileObject assertInteractionMessageOccurencesLifelineCovered(HashMap<String, String> keyMap) {
		assertInteractionLifelineCoveredValue(keyMap.get("Interaction Name"), keyMap.get("Message Occurence"),
				keyMap.get("Lifeline Covered"));
		return this;
	}

}

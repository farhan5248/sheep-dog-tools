package org.farhan.objects.claimproject;

import java.util.HashMap;
import org.farhan.objects.common.UMLFile;

public class PSTFile extends UMLFile {

	public PSTFile() {
		object = this;
	}

	public void setPath(String path) {
		keyValue.put("path", path);
	}

	public void assertExists() {
		keyValue.put("model", "pst");
		super.assertExists();
	}

	public void assertClassCommentsClassName(HashMap<String, String> row) {
		assertClassExists(row.get("Class Name"));
	}

	public void assertClassCommentsComment(HashMap<String, String> row) {
		assertClassCommentValue(row.get("Class Name"), row.get("Comment"));
	}

	public void assertClassElementImportsClassName(HashMap<String, String> row) {
		assertClassExists(row.get("Class Name"));
	}

	public void assertClassElementImportsAlias(HashMap<String, String> row) {
		assertClassAliasValue(row.get("Class Name"), row.get("Alias"));
	}

	public void assertClassElementImportsImportedElement(HashMap<String, String> row) {
		assertClassImportedElementValue(row.get("Class Name"), row.get("Imported Element"));
	}

	public void assertClassPropertiesClassName(HashMap<String, String> row) {
		assertClassExists(row.get("Class Name"));
	}

	public void assertClassPropertiesPropertyName(HashMap<String, String> row) {
		assertClassPropertyNameExists(row.get("Class Name"), row.get("Property Name"));
	}

	public void assertClassPropertiesPropertyType(HashMap<String, String> row) {
		assertClassPropertyTypeValue(row.get("Class Name"), row.get("Property Name"), row.get("Property Type"));
	}

	public void assertClassInteractionsClassName(HashMap<String, String> row) {
		assertClassExists(row.get("Class Name"));
	}

	public void assertClassInteractionsInteractionName(HashMap<String, String> row) {
		assertInteractionNameExists(row.get("Class Name"), row.get("Interaction Name"));
	}

	public void assertInteractionParametersInteractionName(HashMap<String, String> row) {
		assertInteractionNameExists(row.get("Interaction Name"));
	}

	public void assertInteractionParametersParameterName(HashMap<String, String> row) {
		assertInteractionParameterNameValue(row.get("Interaction Name"), row.get("Parameter Name"));
	}

	public void assertInteractionCommentsInteractionName(HashMap<String, String> row) {
		assertInteractionNameExists(row.get("Interaction Name"));
	}

	public void assertInteractionCommentsComment(HashMap<String, String> row) {
		assertInteractionCommentValue(row.get("Interaction Name"), row.get("Comment"));
	}

	public void assertInteractionAnnotationsInteractionName(HashMap<String, String> row) {
		assertInteractionNameExists(row.get("Interaction Name"));
	}

	public void assertInteractionAnnotationsAnnotationName(HashMap<String, String> row) {
		assertInteractionAnnotationNameExists(row.get("Interaction Name"), row.get("Annotation Name"));
	}

	public void assertInteractionAnnotationsAnnotationDetail(HashMap<String, String> row) {
		assertInteractionAnnotationDetailExists(row.get("Interaction Name"), row.get("Annotation Name"),
				row.get("Annotation Detail"));
	}

	public void assertInteractionLifelinesInteractionName(HashMap<String, String> row) {
		assertInteractionNameExists(row.get("Interaction Name"));
	}

	public void assertInteractionLifelinesLifelineName(HashMap<String, String> row) {
		assertInteractionLifelineExists(row.get("Interaction Name"), row.get("Lifeline Name"));
	}

	public void assertInteractionLifelinesLifelineRepresents(HashMap<String, String> row) {
		assertInteractionLifelineRepresentsValue(row.get("Interaction Name"), row.get("Lifeline Name"),
				row.get("Lifeline Represents"));
	}

	public void assertInteractionMessagesInteractionName(HashMap<String, String> row) {
		assertInteractionNameExists(row.get("Interaction Name"));
	}

	public void assertInteractionMessagesMessage(HashMap<String, String> row) {
		assertInteractionMessageValue(row.get("Interaction Name"), row.get("Message"));
	}

	public void assertInteractionMessagesArgumentName(HashMap<String, String> row) {
		assertInteractionMessageArgumentNameExists(row.get("Interaction Name"), row.get("Message"),
				row.get("Argument Name"));
	}

	public void assertInteractionMessagesAnnotationName(HashMap<String, String> row) {
		assertInteractionMessageAnnotationNameExists(row.get("Interaction Name"), row.get("Message"),
				row.get("Annotation Name"));
	}

	public void assertInteractionMessagesAnnotationDetail(HashMap<String, String> row) {
		assertInteractionMessageAnnotationDetailExists(row.get("Interaction Name"), row.get("Message"),
				row.get("Argument Name"), row.get("Annotation Detail"));
	}

	public void assertInteractionMessageOccurencesInteractionName(HashMap<String, String> row) {
		assertInteractionNameExists(row.get("Interaction Name"));
	}

	public void assertInteractionMessageOccurencesMessageOccurence(HashMap<String, String> row) {
		assertInteractionMessageOccurenceExists(row.get("Interaction Name"), row.get("Message Occurence"));
	}

	public void assertInteractionMessageOccurencesLifelineCovered(HashMap<String, String> row) {
		assertInteractionLifelineCoveredValue(row.get("Interaction Name"), row.get("Message Occurence"),
				row.get("Lifeline Covered"));
	}

}

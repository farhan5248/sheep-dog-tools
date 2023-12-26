package org.farhan.objects.claimproject;

import java.util.HashMap;

import org.farhan.common.objects.FileObject;
import org.farhan.common.objects.UMLFile;

public class PSTFile extends UMLFile {

	public PSTFile() {
		object = this;
	}

	public FileObject setPath(String path) {
		keyValue.put("path", path);
		return this;
	}

	public FileObject assertExists() {
		keyValue.put("model", "pst");
		super.assertExists();
		return this;
	}

	public FileObject assertClassClassName(HashMap<String, String> row) {
		assertClassExists(row.get("Class Name"));
		return this;
	}

	public FileObject assertClassCommentsClassName(HashMap<String, String> row) {
		assertClassExists(row.get("Class Name"));
		return this;
	}

	public FileObject assertClassCommentsComment(HashMap<String, String> row) {
		assertClassCommentValue(row.get("Class Name"), row.get("Comment"));
		return this;
	}

	public FileObject assertClassElementImportsClassName(HashMap<String, String> row) {
		assertClassExists(row.get("Class Name"));
		return this;
	}

	public FileObject assertClassElementImportsAlias(HashMap<String, String> row) {
		assertClassAliasValue(row.get("Class Name"), row.get("Alias"));
		return this;
	}

	public FileObject assertClassElementImportsImportedElement(HashMap<String, String> row) {
		assertClassImportedElementValue(row.get("Class Name"), row.get("Imported Element"));
		return this;
	}

	public FileObject assertClassPropertiesClassName(HashMap<String, String> row) {
		assertClassExists(row.get("Class Name"));
		return this;
	}

	public FileObject assertClassPropertiesPropertyName(HashMap<String, String> row) {
		assertClassPropertyNameExists(row.get("Class Name"), row.get("Property Name"));
		return this;
	}

	public FileObject assertClassPropertiesPropertyType(HashMap<String, String> row) {
		assertClassPropertyTypeValue(row.get("Class Name"), row.get("Property Name"), row.get("Property Type"));
		return this;
	}

	public FileObject assertClassInteractionsClassName(HashMap<String, String> row) {
		assertClassExists(row.get("Class Name"));
		return this;
	}

	public FileObject assertClassInteractionsInteractionName(HashMap<String, String> row) {
		assertInteractionNameExists(row.get("Class Name"), row.get("Interaction Name"));
		return this;
	}

	public FileObject assertInteractionParametersInteractionName(HashMap<String, String> row) {
		assertInteractionNameExists(row.get("Interaction Name"));
		return this;
	}

	public FileObject assertInteractionParametersParameterName(HashMap<String, String> row) {
		assertInteractionParameterNameExists(row.get("Interaction Name"), row.get("Parameter Name"));
		return this;
	}

	public FileObject assertInteractionCommentsInteractionName(HashMap<String, String> row) {
		assertInteractionNameExists(row.get("Interaction Name"));
		return this;
	}

	public FileObject assertInteractionCommentsComment(HashMap<String, String> row) {
		assertInteractionCommentValue(row.get("Interaction Name"), row.get("Comment"));
		return this;
	}

	public FileObject assertInteractionAnnotationsInteractionName(HashMap<String, String> row) {
		assertInteractionNameExists(row.get("Interaction Name"));
		return this;
	}

	public FileObject assertInteractionAnnotationsAnnotationName(HashMap<String, String> row) {
		assertInteractionAnnotationNameExists(row.get("Interaction Name"), row.get("Annotation Name"));
		return this;
	}

	public FileObject assertInteractionAnnotationsAnnotationDetail(HashMap<String, String> row) {
		assertInteractionAnnotationDetailExists(row.get("Interaction Name"), row.get("Annotation Name"),
				row.get("Annotation Detail"));
		return this;
	}

	public FileObject assertInteractionLifelinesInteractionName(HashMap<String, String> row) {
		assertInteractionNameExists(row.get("Interaction Name"));
		return this;
	}

	public FileObject assertInteractionLifelinesLifelineName(HashMap<String, String> row) {
		assertInteractionLifelineExists(row.get("Interaction Name"), row.get("Lifeline Name"));
		return this;
	}

	public FileObject assertInteractionLifelinesLifelineRepresents(HashMap<String, String> row) {
		assertInteractionLifelineRepresentsValue(row.get("Interaction Name"), row.get("Lifeline Name"),
				row.get("Lifeline Represents"));
		return this;
	}

	public FileObject assertInteractionMessagesInteractionName(HashMap<String, String> row) {
		assertInteractionNameExists(row.get("Interaction Name"));
		return this;
	}

	public FileObject assertInteractionMessagesMessage(HashMap<String, String> row) {
		assertInteractionMessageValue(row.get("Interaction Name"), row.get("Message"));
		return this;
	}

	public FileObject assertInteractionMessagesArgumentName(HashMap<String, String> row) {
		assertInteractionMessageArgumentNameExists(row.get("Interaction Name"), row.get("Message"),
				row.get("Argument Name"));
		return this;
	}

	public FileObject assertInteractionMessagesAnnotationName(HashMap<String, String> row) {
		assertInteractionMessageAnnotationNameExists(row.get("Interaction Name"), row.get("Message"),
				row.get("Annotation Name"));
		return this;
	}

	public FileObject assertInteractionMessagesAnnotationDetail(HashMap<String, String> row) {
		assertInteractionMessageAnnotationDetailExists(row.get("Interaction Name"), row.get("Message"),
				row.get("Argument Name"), row.get("Annotation Detail"));
		return this;
	}

	public FileObject assertInteractionMessageOccurencesInteractionName(HashMap<String, String> row) {
		assertInteractionNameExists(row.get("Interaction Name"));
		return this;
	}

	public FileObject assertInteractionMessageOccurencesMessageOccurence(HashMap<String, String> row) {
		assertInteractionMessageOccurenceExists(row.get("Interaction Name"), row.get("Message Occurence"));
		return this;
	}

	public FileObject assertInteractionMessageOccurencesLifelineCovered(HashMap<String, String> row) {
		assertInteractionLifelineCoveredValue(row.get("Interaction Name"), row.get("Message Occurence"),
				row.get("Lifeline Covered"));
		return this;
	}

}

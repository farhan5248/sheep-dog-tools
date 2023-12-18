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
}

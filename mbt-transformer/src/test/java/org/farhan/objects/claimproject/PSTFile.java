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
		assertCommentValue(row.get("Class Name"), row.get("Comment"));
	}

}

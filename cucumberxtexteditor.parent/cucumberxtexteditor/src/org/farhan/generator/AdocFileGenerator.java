package org.farhan.generator;

import org.asciidoctor.Options;
import org.asciidoctor.Asciidoctor.Factory;
import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.Row;
import org.asciidoctor.ast.Section;
import org.asciidoctor.ast.StructuralNode;
import org.asciidoctor.ast.Table;

public class AdocFileGenerator {

	public static CharSequence doGen(String fileName, String component, String object, String stepName,
			String stepTable) {

		// Search for the file
		// If it doesn't exist, create it.
		// Else read it in
		Document theDoc = Factory.create().load("= " + fileName, Options.builder().build());

		// Search for the step
		// If it doesn't exist, create it.

		// Check for a table
		// If it doesn't exist, create it.
		if (!stepTable.isEmpty()) {
		}
		return docToString(theDoc);
	}

	public static CharSequence doGen(String fileName, String component, String object, String stepName) {

		return doGen(fileName, component, object, stepName, "");
	}

	private static CharSequence docToString(Document theDoc) {

		String tempText = "";
		StringBuilder text = new StringBuilder();
		if (theDoc.getAttribute("tags") != null) {
			text.append(":tags: " + theDoc.getAttribute("tags") + "\n");
		}
		text.append("= " + theDoc.getTitle() + "\n");
		for (StructuralNode sn : theDoc.getBlocks()) {
			if (sn instanceof Block) {
				// feature description
				Block b = (Block) sn;
				if (!b.getSource().isEmpty()) {
					text.append("\n");
					text.append(b.getSource() + "\n");
				}
			} else if (sn instanceof Section) {
				// scenario
				Section section = (Section) sn;
				text.append("\n");
				if (section.getAttributes().size() > 0) {
					text.append("[");
					tempText = "";
					if (section.getAttribute("tags") != null) {
						tempText += "tags=\"" + section.getAttribute("tags") + "\",";
					}
					if (section.getAttribute("background") != null) {
						tempText += "background=\"" + section.getAttribute("background") + "\",";
					}
					text.append(tempText.replaceAll(",$", ""));
					text.append("]\n");
				}
				text.append("== " + section.getTitle() + "\n");
				for (StructuralNode ssn : section.getBlocks()) {
					if (ssn instanceof Block) {
						// scenario description
						Block b = (Block) ssn;
						if (!b.getSource().isEmpty()) {
							text.append("\n");
							text.append(b.getSource() + "\n");
						}
					} else if (ssn instanceof Section) {
						// scenario step or examples
						Section step = (Section) ssn;
						text.append("\n");
						if (step.getAttributes().size() > 0) {
							text.append("[");
							tempText = "";
							if (step.getAttribute("tags") != null) {
								tempText += "tags=\"" + step.getAttribute("tags") + "\",";
							}
							if (step.getAttribute("examples") != null) {
								tempText += "examples=\"" + step.getAttribute("examples") + "\",";
							}
							text.append(tempText.replaceAll(",$", ""));
							text.append("]\n");
						}
						text.append("=== " + step.getTitle() + "\n");
						for (StructuralNode tsn : step.getBlocks()) {
							if (tsn instanceof Table) {
								// step data table or examples data table
								Table t = (Table) tsn;
								text.append("\n");
								text.append("[options=\"header\"]\n");
								text.append("|===\n");
								for (Cell c : t.getHeader().getFirst().getCells()) {
									text.append("| " + c.getText());
								}
								text.append("\n");
								for (Row r : t.getBody()) {
									for (Cell c : r.getCells()) {
										text.append("| " + c.getText());
									}
									text.append("\n");
								}
								text.append("|===\n");
							} else if (tsn instanceof Block) {
								Block b = (Block) tsn;
								if (b.getContext().contentEquals("listing")) {
									// docstring
									text.append("\n");
									text.append("----\n");
									text.append(b.getSource() + "\n");
									text.append("----\n");
								}
							}
						}
					}
				}
			}
		}
		return text;
	}

}

package org.farhan.mbt.asciidoctor;

import java.io.File;

import org.asciidoctor.Options;
import org.asciidoctor.Asciidoctor.Factory;
import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.List;
import org.asciidoctor.ast.ListItem;
import org.asciidoctor.ast.Row;
import org.asciidoctor.ast.Section;
import org.asciidoctor.ast.StructuralNode;
import org.asciidoctor.ast.Table;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.Utilities;

public class AsciiDoctorAdocWrapper implements ConvertibleObject {

	private File theFile;
	private Document theDoc;

	public AsciiDoctorAdocWrapper(File theFile) {
		setFile(theFile);
		theDoc = Factory.create().load("= " + theFile.getName(), Options.builder().build());
	}

	@Override
	public void setFile(File theFile) {
		this.theFile = theFile;
	}

	@Override
	public File getFile() {
		return theFile;
	}

	@Override
	public void load() {
		if (theFile.exists()) {
			theDoc = Factory.create().loadFile(theFile, Options.builder().build());
		}
	}

	@Override
	public void save() throws Exception {
		String fileContents = docToString();
		Utilities.writeFile(theFile, fileContents);
	}

	private String docToString() {
		String text = "";
		if (theDoc.getAttribute("tags") != null) {
			text += ":tags: " + theDoc.getAttribute("tags") + "\n";
		}
		text += "= " + theDoc.getTitle() + "\n";
		for (StructuralNode sn : theDoc.getBlocks()) {
			if (sn instanceof Block) {
				// feature description
				Block b = (Block) sn;
				text += "\n";
				text += b.getSource() + "\n";
			} else if (sn instanceof Section) {
				// scenario
				Section section = (Section) sn;
				text += "\n";
				if (section.getAttribute("tags") != null) {
					text += "[tags=\"" + section.getAttribute("tags") + "\"]" + "\n";
				}
				text += "== " + section.getTitle() + "\n";
				for (StructuralNode ssn : section.getBlocks()) {
					if (ssn instanceof Block) {
						// scenario description
						Block b = (Block) ssn;
						text += "\n";
						text += b.getSource() + "\n";
					} else if (ssn instanceof Section) {
						// scenario step or examples
						Section step = (Section) ssn;
						text += "\n";
						if (step.getAttributes().size() > 0) {
							text += "[";
							if (step.getAttribute("tags") != null) {
								text += "tags=\"" + step.getAttribute("tags") + "\",";
							}
							if (step.getAttribute("examples") != null) {
								text += "examples=\"" + step.getAttribute("examples") + "\",";
							}
							text = text.replaceAll(",$", "");
							text += "]\n";
						}
						text += "=== " + step.getTitle() + "\n";
						for (StructuralNode tsn : step.getBlocks()) {
							// step data table or examples data table
							Table t = (Table) tsn;
							text += "\n";
							text += "[options=\"header\"]\n";
							text += "|===\n";
							for (Cell c : t.getHeader().getFirst().getCells()) {
								text += "| " + c.getText();
							}
							text += "\n";
							for (Row r : t.getBody()) {
								for (Cell c : r.getCells()) {
									text += "| " + c.getText();
								}
								text += "\n";
							}
							text += "|===\n";
						}
					}
				}
			}
		}
		return text;
	}

	@Override
	public Object get() {
		return theDoc;
	}

}

package org.farhan.mbt.asciidoctor;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

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
import org.farhan.mbt.graph.MBTVertex;

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
				if (!b.getSource().isEmpty()) {
					text += "\n";
					text += b.getSource() + "\n";
				}
			} else if (sn instanceof Section) {
				// scenario
				Section section = (Section) sn;
				text += "\n";
				if (section.getAttributes().size() > 0) {
					text += "[";
					if (section.getAttribute("tags") != null) {
						text += "tags=\"" + section.getAttribute("tags") + "\",";
					}
					if (section.getAttribute("background") != null) {
						text += "background=\"" + section.getAttribute("background") + "\",";
					}
					text = text.replaceAll(",$", "");
					text += "]\n";
				}
				text += "== " + section.getTitle() + "\n";
				for (StructuralNode ssn : section.getBlocks()) {
					if (ssn instanceof Block) {
						// scenario description
						Block b = (Block) ssn;
						if (!b.getSource().isEmpty()) {
							text += "\n";
							text += b.getSource() + "\n";
						}
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
							if (tsn instanceof Table) {
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
							} else if (tsn instanceof Block) {
								Block b = (Block) tsn;
								if (b.getContext().contentEquals("listing")) {
									// docstring
									text += "\n";
									text += "----\n";
									text += b.getSource() + "\n";
									text += "----\n";
								}
							}
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

	public String getFeatureName() {
		return theDoc.getTitle();
	}

	public String getFeatureDescription() {
		for (StructuralNode block : theDoc.getBlocks()) {
			if (!(block instanceof Section)) {
				return getDescription(block);
			}
		}
		return "";
	}

	public String getAbstractScenarioDescription(Section testCase) {
		return getDescription(testCase);
	}

	public String getDescription(StructuralNode testCaseOrTestSuite) {
		String text = "";
		for (StructuralNode sn : testCaseOrTestSuite.getBlocks()) {
			if (sn instanceof Block) {
				text += "\n\n" + ((Block) sn).getSource();
			} else {
				break;
			}
		}
		text = text.trim();
		return text;
	}

	public ArrayList<Section> getAbstractScenarios() {
		ArrayList<Section> testCases = new ArrayList<Section>();
		for (StructuralNode sn : theDoc.getBlocks()) {
			if (sn instanceof Section) {
				testCases.add((Section) sn);
			}
		}
		return testCases;
	}

	public ArrayList<Section> getSteps(Section testCase) {
		ArrayList<Section> testSteps = new ArrayList<Section>();
		for (StructuralNode sn : testCase.getBlocks()) {
			if (sn instanceof Section) {
				if (sn.getAttributes().get("examples") == null) {
					testSteps.add((Section) sn);
				}
			}
		}
		return testSteps;
	}

	public ArrayList<Section> getExamples(Section testCase) {
		ArrayList<Section> examples = new ArrayList<Section>();
		for (StructuralNode sn : testCase.getBlocks()) {
			if (sn instanceof Section) {
				if (sn.getAttributes().get("examples") != null) {
					examples.add((Section) sn);
				}
			}
		}
		return examples;
	}

	public String getFeatureTags() {
		return getTags(theDoc);
	}

	public String getAbstractScenarioTags(Section testCase) {
		return getTags(testCase);
	}

	public String getTags(StructuralNode testCaseOrTestSuite) {
		String tags = (String) testCaseOrTestSuite.getAttributes().get("tags");
		if (tags == null) {
			return "";
		} else {
			return tags;
		}
	}

	public boolean isScenarioOutline(Section abstractScenario) {
		for (StructuralNode sn : abstractScenario.getBlocks()) {
			if (sn instanceof Section) {
				if (sn.getAttributes().get("examples") != null) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean isBackground(Section abstractScenario) {
		return abstractScenario.getAttributes().get("background") != null;
	}

}

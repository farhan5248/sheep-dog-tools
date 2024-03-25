package org.farhan.mbt.asciidoctor;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import org.asciidoctor.Options;
import org.asciidoctor.Asciidoctor.Factory;
import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.Row;
import org.asciidoctor.ast.Section;
import org.asciidoctor.ast.StructuralNode;
import org.asciidoctor.ast.Table;
import org.asciidoctor.jruby.extension.internal.JRubyProcessor;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.Utilities;

public class AsciiDoctorAdocWrapper implements ConvertibleObject {

	private JRubyProcessor jrp;
	private Document theDoc;
	private File theFile;

	public AsciiDoctorAdocWrapper(File theFile) {
		setFile(theFile);
		theDoc = Factory.create().load("= " + theFile.getName(), Options.builder().build());
		jrp = new JRubyProcessor();
	}

	public void addBackground(Section background) {
		theDoc.getBlocks().add(background);
	}

	public Section createBackground() {
		Section background = jrp.createSection(theDoc);
		background.getAttributes().put("background", "true");
		return background;
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

	public ArrayList<Section> getAbstractScenarioList() {
		ArrayList<Section> testCases = new ArrayList<Section>();
		for (StructuralNode sn : theDoc.getBlocks()) {
			if (sn instanceof Section) {
				testCases.add((Section) sn);
			}
		}
		return testCases;
	}

	public String getBackgroundDescription(Section background) {
		return getDescription(background);
	}

	public String getBackgroundName(Section background) {
		return getName(background);
	}

	public ArrayList<ArrayList<String>> getDataTable(Section step, HashMap<String, String> replacements) {
		for (StructuralNode sn : step.getBlocks()) {
			if (sn instanceof Table) {
				Table table = (Table) sn;
				ArrayList<ArrayList<String>> cellList = new ArrayList<ArrayList<String>>();
				ArrayList<String> cell;
				for (int i = 0; i < table.getBody().size(); i++) {
					for (int j = 0; j < table.getBody().get(0).getCells().size(); j++) {
						cell = new ArrayList<String>();
						String header = i + " " + table.getHeader().getFirst().getCells().get(j).getText();
						String value = replaceParameters(replacements,
								table.getBody().get(i).getCells().get(j).getText());
						cell.add(header);
						cell.add(value);
						cellList.add(cell);
					}
				}
				return cellList;
			}
		}
		return null;
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

	public String getDocString(Section step) {
		for (StructuralNode sn : step.getBlocks()) {
			if (sn instanceof Block) {
				if (sn.getContext().contentEquals("listing")) {
					Block block = (Block) sn;
					return block.getSource();
				}
			}
		}
		return null;
	}

	public ArrayList<Section> getExamplesList(Section testCase) {
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

	public String getExamplesName(Section example) {
		return example.getTitle();
	}

	public String getExamplesRowName(int rowNum) {
		return String.valueOf(rowNum);
	}

	public ArrayList<HashMap<String, String>> getExamplesRows(Section examples) {
		ArrayList<HashMap<String, String>> rows = new ArrayList<HashMap<String, String>>();
		for (StructuralNode block : examples.getBlocks()) {
			if (block instanceof Table) {
				Table table = (Table) block;
				ArrayList<String> paramNames = new ArrayList<String>();
				for (Cell cell : table.getHeader().getFirst().getCells()) {
					paramNames.add(cell.getText());
				}
				int rowCnt = table.getBody().size();
				for (int i = 0; i < rowCnt; i++) {
					Row row = table.getBody().get(i);
					HashMap<String, String> map = new HashMap<String, String>();
					int cellCnt = row.getCells().size();
					for (int j = 0; j < cellCnt; j++) {
						map.put(paramNames.get(j), row.getCells().get(j).getText());
					}
					rows.add(map);
				}
			}
		}
		return rows;
	}

	public String getFeatureDescription() {
		for (StructuralNode block : theDoc.getBlocks()) {
			if (!(block instanceof Section)) {
				return getDescription(block);
			}
		}
		return "";
	}

	public String getFeatureName() {
		return theDoc.getTitle();
	}

	public String getFeatureTags() {
		return getTags(theDoc);
	}

	@Override
	public File getFile() {
		return theFile;
	}

	public String getName(Section abstractScenario) {
		return abstractScenario.getTitle();
	}

	public String getScenarioDescription(Section scenario) {
		return getDescription(scenario);
	}

	public String getScenarioName(Section scenario) {
		return getName(scenario);
	}

	public String getScenarioOutlineDescription(Section testCase) {
		return getDescription(testCase);
	}

	public String getScenarioOutlineName(Section scenarioOutline) {
		return getName(scenarioOutline);
	}

	public Set<String> getScenarioOutlineParameters(HashMap<String, String> exampleRow) {
		return exampleRow.keySet();
	}

	public String getScenarioOutlineTags(Section abstractScenario) {
		return getTags(abstractScenario);
	}

	public String getScenarioTags(Section scenario) {
		return getTags(scenario);
	}

	public String getStep(Section step) {
		return step.getTitle();
	}

	public ArrayList<Section> getStepList(Section testCase) {
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

	public String getTags(StructuralNode testCaseOrTestSuite) {
		String tags = (String) testCaseOrTestSuite.getAttributes().get("tags");
		if (tags == null) {
			return "";
		} else {
			return tags;
		}
	}

	public boolean hasDataTable(Section step) {
		for (StructuralNode sn : step.getBlocks()) {
			if (sn instanceof Table) {
				return true;
			}
		}
		return false;
	}

	public boolean hasDocString(Section step) {
		for (StructuralNode sn : step.getBlocks()) {
			if (sn instanceof Block) {
				if (sn.getContext().contentEquals("listing")) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean isBackground(Section abstractScenario) {
		return abstractScenario.getAttributes().get("background") != null;
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

	@Override
	public void load() {
		if (theFile.exists()) {
			theDoc = Factory.create().loadFile(theFile, Options.builder().build());
		}
	}

	private String replaceParameters(HashMap<String, String> replacements, String text) {
		if (text.startsWith("{")) {
			for (String key : replacements.keySet()) {
				if (text.contentEquals("{" + key + "}")) {
					return replacements.get(key);
				}
			}
		}
		return text;
	}

	@Override
	public void save() throws Exception {
		String fileContents = docToString();
		Utilities.writeFile(theFile, fileContents);
	}

	public void setBackgroundDescription(Section background, String backgroundDescription) {
		background.getBlocks().add(jrp.createBlock(background, "paragraph", backgroundDescription));
	}

	public void setBackgroundName(Section background, String name) {
		background.setTitle(name);
	}

	public void setFeatureDescription(String featureDescription) {
		Block block = jrp.createBlock(theDoc, "paragraph", featureDescription);
		theDoc.getBlocks().add(block);
	}

	public void setFeatureName(String featureName) {
		theDoc.setTitle(featureName);
	}

	public void setFeatureTags(String featureTags) {
		theDoc.getAttributes().put("tags", featureTags);
	}

	@Override
	public void setFile(File theFile) {
		this.theFile = theFile;
	}

	public void createStep(Section abstractScenario, String step) {
		abstractScenario = jrp.createSection(theDoc);
		abstractScenario.setTitle(step);
		abstractScenario.getBlocks().add(abstractScenario);
	}

	public void createDocString(Section step, String content) {
		Block docString = jrp.createBlock(step, "listing", "");
		step.getBlocks().add(docString);
		docString.setSource(content);
	}

	public void createDataTable(Section abstractScenario, ArrayList<ArrayList<String>> dataTableCellList) {
		// TODO Auto-generated method stub
		
	}

}

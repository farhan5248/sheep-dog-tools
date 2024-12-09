package org.farhan.mbt.asciidoctor;

import java.util.ArrayList;
import java.util.Arrays;

import org.asciidoctor.Options;
import org.asciidoctor.Asciidoctor.Factory;
import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Column;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.Row;
import org.asciidoctor.ast.Section;
import org.asciidoctor.ast.StructuralNode;
import org.asciidoctor.ast.Table;
import org.asciidoctor.jruby.extension.internal.JRubyProcessor;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.ObjectRepository;

public class AsciiDoctorAdocWrapper implements ConvertibleObject {

	private JRubyProcessor jrp;
	private Document theDoc;
	private String thePath;

	public AsciiDoctorAdocWrapper(String thePath) {
		this.thePath = thePath;
		String[] pathParts = thePath.split("/");
		theDoc = Factory.create().load("= " + pathParts[pathParts.length - 1], Options.builder().build());
		jrp = new JRubyProcessor();
	}

	public Section createBackground(String name) {
		Section background = jrp.createSection(theDoc);
		background.getAttributes().put("background", "true");
		background.setTitle(name);
		theDoc.getBlocks().add(background);
		return background;
	}

	public void createDocString(Section step, String content) {
		Block docString = jrp.createBlock(step, "listing", "");
		step.getBlocks().add(docString);
		docString.setSource(content);
	}

	public Section createExamples(Section scenarioOutline, String examplesName) {
		Section examples = jrp.createSection(scenarioOutline);
		examples.getAttributes().put("examples", "true");
		examples.setTitle(examplesName);
		scenarioOutline.getBlocks().add(examples);
		return examples;
	}

	public void createExamplesRow(Section examples, ArrayList<String> examplesRow) {
		Table table = null;
		for (StructuralNode block : examples.getBlocks()) {
			if (block instanceof Table) {
				table = (Table) block;
				break;
			}
		}
		Row row = jrp.createTableRow(table);
		table.getBody().add(row);
		int colCnt = 0;
		for (String e : examplesRow) {
			Cell cell = jrp.createTableCell(table.getColumns().get(colCnt), e);
			row.getCells().add(cell);
			colCnt++;
		}
	}

	public void createExamplesTable(Section examples, ArrayList<String> headers) {
		Table table = jrp.createTable(examples);
		examples.getBlocks().add(table);
		Row row = jrp.createTableRow(table);
		table.getHeader().add(row);
		int colCnt = 0;
		for (String e : headers) {
			Column column = jrp.createTableColumn(table, colCnt);
			table.getColumns().add(column);
			Cell cell = jrp.createTableCell(column, e.replaceFirst("[0-9]+ ", ""));
			row.getCells().add(cell);
			colCnt++;
		}
	}

	public Section createScenario(String scenarioName) {
		Section scenario = jrp.createSection(theDoc);
		scenario.setTitle(scenarioName);
		theDoc.getBlocks().add(scenario);
		return scenario;
	}

	public Section createScenarioOutline(String scenarioName) {
		Section scenarioOutline = jrp.createSection(theDoc);
		scenarioOutline.setTitle(scenarioName);
		theDoc.getBlocks().add(scenarioOutline);
		return scenarioOutline;
	}

	public Section createStep(Section abstractScenario, String stepName) {
		Section step = jrp.createSection(abstractScenario);
		step.setTitle(stepName);
		abstractScenario.getBlocks().add(step);
		return step;
	}

	public void createStepTable(Section step, ArrayList<ArrayList<String>> stepTableRowList) {
		Table table = jrp.createTable(step);
		step.getBlocks().add(table);

		// header
		Row row = jrp.createTableRow(table);
		table.getHeader().add(row);
		for (int i = 0; i < stepTableRowList.getFirst().size(); i++) {
			Column column = jrp.createTableColumn(table, i);
			table.getColumns().add(column);
			Cell cell = jrp.createTableCell(column, stepTableRowList.get(0).get(i));
			row.getCells().add(cell);
		}
		// body
		for (int i = 1; i < stepTableRowList.size(); i++) {
			ArrayList<String> bodyRow = stepTableRowList.get(i);
			row = jrp.createTableRow(table);
			table.getBody().add(row);
			for (int j = 0; j < bodyRow.size(); j++) {
				Column column = table.getColumns().get(j);
				String cellValue = bodyRow.get(j);
				cellValue = cellValue.replace("<", "{").replace(">", "}");
				cellValue = cellValue.replace("\\|", "|");
				Cell cell = jrp.createTableCell(column, cellValue);
				row.getCells().add(cell);
			}
		}
	}

	@Override
	public Object get() {
		return theDoc;
	}

	public String getAbstractScenarioDescription(StructuralNode testCaseOrTestSuite) {
		String text = "";
		for (StructuralNode sn : testCaseOrTestSuite.getBlocks()) {
			if (sn instanceof Block) {
				text += "\n\n" + ((Block) sn).getSource();
			} else {
				break;
			}
		}
		return text.trim();
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

	public String getAbstractScenarioName(Section abstractScenario) {
		return substitute(abstractScenario.getTitle());
	}

	public ArrayList<String> getAbstractScenarioTags(StructuralNode testCaseOrTestSuite) {
		ArrayList<String> tagList = new ArrayList<String>();
		String tags = (String) testCaseOrTestSuite.getAttributes().get("tags");
		if (tags != null) {
			tagList.addAll(Arrays.asList(tags.split(",")));
		}
		return tagList;
	}

	public String getBackgroundDescription(Section background) {
		return getAbstractScenarioDescription(background);
	}

	public String getBackgroundName(Section background) {
		return getAbstractScenarioName(background);
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
		return substitute(example.getTitle());
	}

	public ArrayList<ArrayList<String>> getExamplesRowList(Section examples) {
		ArrayList<ArrayList<String>> rows = new ArrayList<ArrayList<String>>();
		for (StructuralNode block : examples.getBlocks()) {
			if (block instanceof Table) {
				Table table = (Table) block;
				ArrayList<String> cellList;
				for (Row row : table.getBody()) {
					cellList = new ArrayList<String>();
					for (Cell cell : row.getCells()) {
						cellList.add(substitute(cell.getText()));
					}
					rows.add(cellList);
				}
			}
		}
		return rows;
	}

	public ArrayList<String> getExamplesTable(Section examples) {
		ArrayList<String> header = new ArrayList<String>();
		for (StructuralNode block : examples.getBlocks()) {
			if (block instanceof Table) {
				Table table = (Table) block;
				for (Cell cell : table.getHeader().getFirst().getCells()) {
					header.add(substitute(cell.getText()));
				}
			}
		}
		return header;
	}

	public String getFeatureName() {
		return substitute(theDoc.getTitle());
	}

	public ArrayList<String> getFeatureTags() {
		return getAbstractScenarioTags(theDoc);
	}

	@Override
	public String getPath() {
		return thePath;
	}

	public String getScenarioDescription(Section scenario) {
		return getAbstractScenarioDescription(scenario);
	}

	public String getScenarioName(Section scenario) {
		return getAbstractScenarioName(scenario);
	}

	public String getScenarioOutlineDescription(Section testCase) {
		return getAbstractScenarioDescription(testCase);
	}

	public String getScenarioOutlineName(Section scenarioOutline) {
		return getAbstractScenarioName(scenarioOutline);
	}

	public ArrayList<String> getScenarioOutlineTags(Section abstractScenario) {
		return getAbstractScenarioTags(abstractScenario);
	}

	public ArrayList<String> getScenarioTags(Section scenario) {
		return getAbstractScenarioTags(scenario);
	}

	public String getStep(Section step) {
		return substitute(step.getTitle());
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

	public ArrayList<ArrayList<String>> getStepTable(Section step) {
		ArrayList<ArrayList<String>> stepTableRowList = new ArrayList<ArrayList<String>>();
		for (StructuralNode sn : step.getBlocks()) {
			if (sn instanceof Table) {
				Table table = (Table) sn;
				ArrayList<String> cellList = new ArrayList<String>();
				stepTableRowList.add(cellList);
				for (Cell cell : table.getHeader().getFirst().getCells()) {
					cellList.add(substitute(cell.getText()));
				}
				for (int i = 0; i < table.getBody().size(); i++) {
					cellList = new ArrayList<String>();
					stepTableRowList.add(cellList);
					for (Cell cell : table.getBody().get(i).getCells()) {
						cellList.add(substitute(cell.getText()));
					}
				}
				return stepTableRowList;
			}
		}
		return stepTableRowList;
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

	public boolean hasStepTable(Section step) {
		for (StructuralNode sn : step.getBlocks()) {
			if (sn instanceof Table) {
				return true;
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

	public void setBackgroundDescription(Section background, String backgroundDescription) {
		background.getBlocks().add(jrp.createBlock(background, "paragraph", backgroundDescription));
	}

	public void setBackgroundName(Section background, String name) {
		background.setTitle(name);
	}

	public void setExamplesName(Section examples, String examplesName) {
		examples.setTitle(examplesName);
	}

	public String getFeatureDescription() {
		String text = "";
		if (theDoc.getBlocks().size() > 0) {
			if (theDoc.getBlocks().getFirst().getContext().contentEquals("preamble")) {
				StructuralNode preamble = theDoc.getBlocks().getFirst();
				if (preamble.getBlocks().size() > 0) {
					for (StructuralNode paragraph : preamble.getBlocks()) {
						text += ((Block) paragraph).getSource() + "\n";
					}
				}
			} else if (theDoc.getBlocks().getFirst().getContext().contentEquals("paragraph")) {
				// when an adoc has no sections, there's no preamble created when it's read from
				// the file
				StructuralNode paragraph = theDoc.getBlocks().getFirst();
				text += ((Block) paragraph).getSource() + "\n";
			}
		}
		return text.replaceFirst("\n$", "");
	}

	public void setFeatureDescription(String featureDescription) {
		StructuralNode preamble = jrp.createBlock(theDoc, "preamble", "");
		theDoc.getBlocks().add(preamble);
		Block paragraph = jrp.createBlock(preamble, "paragraph", featureDescription);
		preamble.getBlocks().add(paragraph);
	}

	@Override
	public void parse(String text) throws Exception {
		try {
			if (text.isEmpty()) {
				return;
			}
			theDoc = Factory.create().load(text, Options.builder().build());
		} catch (Exception e) {
			throw new Exception("There was a problem loading file: " + thePath);
		}
	}

	private String substitute(String text) {
		return text.replace("&#8217;", "'").replace("|", "\\|");
	}

	public String toString() {
		String text = "";
		if (theDoc.getAttribute("tags") != null) {
			text += ":tags: " + theDoc.getAttribute("tags") + "\n";
		}
		text += "= " + substitute(theDoc.getTitle()) + "\n";
		for (StructuralNode sn : theDoc.getBlocks()) {
			if (sn.getContext().contentEquals("preamble")) {
				// feature description
				if (sn.getBlocks().size() > 0) {
					text += "\n";
					text += getFeatureDescription() + "\n";
				}
			} else {
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
				text += "== " + substitute(section.getTitle()) + "\n";
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
						text += "=== " + substitute(step.getTitle()) + "\n";
						for (StructuralNode tsn : step.getBlocks()) {
							if (tsn instanceof Table) {
								// step data table or examples data table
								Table t = (Table) tsn;
								text += "\n";
								text += "[options=\"header\"]\n";
								text += "|===\n";
								for (Cell c : t.getHeader().getFirst().getCells()) {
									text += "| " + substitute(c.getText());
								}
								text += "\n";
								for (Row r : t.getBody()) {
									for (Cell c : r.getCells()) {
										text += "| " + substitute(c.getText());
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

	public void setFeatureName(String featureName) {
		theDoc.setTitle(featureName);
	}

	public void setFeatureTags(ArrayList<String> featureTags) {
		if (!featureTags.isEmpty()) {
			theDoc.getAttributes().put("tags", listAsCsv(featureTags));
		}
	}

	public void setScenarioDescription(Section scenario, String scenarioDescription) {
		scenario.getBlocks().add(jrp.createBlock(scenario, "paragraph", scenarioDescription));
	}

	public void setScenarioName(Section scenario, String scenarioName) {
		scenario.setTitle(scenarioName);
	}

	public void setScenarioOutlineDescription(Section scenarioOutline, String scenarioOutlineDescription) {
		scenarioOutline.getBlocks().add(jrp.createBlock(scenarioOutline, "paragraph", scenarioOutlineDescription));
	}

	public void setScenarioOutlineName(Section scenarioOutline, String scenarioOutlineName) {
		scenarioOutline.setTitle(scenarioOutlineName);
	}

	public void setScenarioOutlineTags(Section scenarioOutline, ArrayList<String> scenarioOutlineTags) {
		if (!scenarioOutlineTags.isEmpty()) {
			scenarioOutline.getAttributes().put("tags", listAsCsv(scenarioOutlineTags));
		}
	}

	public void setScenarioTags(Section scenario, ArrayList<String> scenarioTags) {
		if (!scenarioTags.isEmpty()) {
			scenario.getAttributes().put("tags", listAsCsv(scenarioTags));
		}
	}

	private String listAsCsv(ArrayList<String> list) {
		String csv = "";
		for (String listItem : list) {
			csv += "," + listItem;
		}
		return csv.replaceFirst(",", "");
	}
}

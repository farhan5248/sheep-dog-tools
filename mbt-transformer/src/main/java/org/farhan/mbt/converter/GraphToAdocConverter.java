package org.farhan.mbt.converter;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Column;
import org.asciidoctor.ast.Section;
import org.asciidoctor.ast.StructuralNode;
import org.asciidoctor.ast.Table;
import org.asciidoctor.jruby.extension.internal.JRubyProcessor;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.Row;
import org.farhan.mbt.asciidoctor.AsciiDoctorAdocWrapper;
import org.farhan.mbt.asciidoctor.AsciiDoctorProject;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ToDocumentConverter;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.graph.JGraphTProject;
import org.farhan.mbt.graph.JGraphTGraphWrapper;
import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.farhan.mbt.graph.MBTPathInfo;
import org.farhan.mbt.graph.MBTVertex;

public class GraphToAdocConverter extends ToDocumentConverter {

	private JRubyProcessor jrp;
	private JGraphTGraphWrapper srcObj;
	private JGraphTProject srcPrj;
	private AsciiDoctorAdocWrapper tgtObj;

	public GraphToAdocConverter(String layer, JGraphTProject source, AsciiDoctorProject target) {
		this.layer = layer;
		this.srcPrj = source;
		this.tgtPrj = target;
		this.jrp = new JRubyProcessor();
	}

	@Override
	protected void convertAbstractScenarios(ConvertibleObject object) throws Exception {
		for (MBTPathInfo abstractScenario : srcObj.getAbstractScenarioList()) {
			if (srcObj.isBackground(abstractScenario)) {
				convertBackground(abstractScenario);
			} else if (srcObj.isScenarioOutline(abstractScenario)) {
				convertScenarioOutline(abstractScenario);
			} else {
				convertScenario(abstractScenario);
			}
		}
	}

	@Override
	protected void convertObject(ConvertibleObject object) throws Exception {
		srcObj = (JGraphTGraphWrapper) object;
		tgtObj = (AsciiDoctorAdocWrapper) tgtPrj.createObject(convertObjectName(srcObj.getFile().getAbsolutePath()));
		tgtObj.setFeatureName(srcObj.getFeatureName());
		tgtObj.setFeatureTags(srcObj.getFeatureTags());
		tgtObj.setFeatureDescription(srcObj.getFeatureDescription());
	}

	@Override
	protected String convertObjectName(String documentTitle) {
		return convertObjectName(documentTitle, tgtPrj.FIRST_LAYER);
	}

	@Override
	protected ArrayList<ConvertibleObject> getObjects(String layer) {
		return srcPrj.getObjects(layer);
	}

	@Override
	protected void selectObjects() throws Exception {
		ArrayList<File> files = Utilities.recursivelyListFiles(srcPrj.getDir(srcPrj.FIRST_LAYER),
				srcPrj.getFileExt(srcPrj.FIRST_LAYER));
		srcPrj.getObjects(srcPrj.FIRST_LAYER).clear();
		for (File f : files) {
			srcPrj.createObject(f.getAbsolutePath()).load();
		}
		files = Utilities.recursivelyListFiles(srcPrj.getDir(srcPrj.SECOND_LAYER),
				srcPrj.getFileExt(srcPrj.SECOND_LAYER));
		srcPrj.getObjects(srcPrj.SECOND_LAYER).clear();
		for (File f : files) {
			srcPrj.createObject(f.getAbsolutePath()).load();
		}
	}

	private void convertBackground(MBTPathInfo abstractScenario) {
		Section background = tgtObj.createBackground();
		tgtObj.setBackgroundName(background, srcObj.getBackgroundName(abstractScenario));
		tgtObj.setBackgroundDescription(background, srcObj.getBackgroundDescription(abstractScenario));
		convertStepList(background, srcObj.getStepList(null, abstractScenario), abstractScenario);
		tgtObj.addBackground(background);
	}

	private void convertDataTable(Section abstractScenario, MBTEdge step, MBTPathInfo abstractScenarioSrc) {
		JGraphTGraphWrapper stepDefObj = srcPrj.getObject(srcObj.getStep(step), srcPrj.SECOND_LAYER);
		ArrayList<ArrayList<String>> dataTableCellList = stepDefObj.getDataTable(abstractScenarioSrc);
		tgtObj.createDataTable(abstractScenario, dataTableCellList);
	}

	private void convertDocString(Section abstractScenario, MBTEdge step) {
		JGraphTGraphWrapper stepDefObj = srcPrj.getObject(srcObj.getStep(step), srcPrj.SECOND_LAYER);
		String content = srcPrj.getResource(stepDefObj.getDocString());
		tgtObj.createDocString(abstractScenario, content);
	}

	private String convertObjectName(String fileName, String layer) {
		// TODO move to superclass
		String qualifiedName = fileName.replace(",", "");
		qualifiedName = qualifiedName.replace(srcPrj.getFileExt(layer), "");
		qualifiedName = qualifiedName.replace(srcPrj.getDir(layer).getAbsolutePath(), "");
		qualifiedName = tgtPrj.getDir(layer) + qualifiedName + tgtPrj.getFileExt(layer);
		return qualifiedName;
	}

	private void convertScenario(MBTPathInfo abstractScenario) {
		Section scenario = tgtObj.createScenario();
		tgtObj.setScenarioTags(scenario, srcObj.getScenarioTags(abstractScenario));
		tgtObj.setScenarioName(scenario, srcObj.getScenarioName(abstractScenario));
		tgtObj.setScenarioDescription(scenario, srcObj.getScenarioDescription(abstractScenario));
		convertStepList(scenario, srcObj.getStepList(null, abstractScenario), abstractScenario);
		tgtObj.addScenario(scenario);

	}

	private void convertScenarioOutline(MBTPathInfo abstractScenario) {

		Section scenarioOutline = tgtObj.createScenarioOutline();
		tgtObj.setScenarioOutlineName(scenarioOutline, srcObj.getScenarioOutlineName(abstractScenario));
		tgtObj.setScenarioOutlineTags(scenarioOutline, srcObj.getScenarioOutlineTags(abstractScenario));
		tgtObj.setScenarioOutlineDescription(scenarioOutline, srcObj.getScenarioOutlineDescription(abstractScenario));
		convertStepList(scenarioOutline, srcObj.getStepList(null, abstractScenario), abstractScenario);

		ArrayList<MBTPathInfo> examplesList = srcObj.getExamplesList(abstractScenario);
		for (MBTPathInfo examples : examplesList) {
			convertExamples(scenarioOutline, examples);
		}
		tgtObj.addScenarioOutline(scenarioOutline);
	}

	private void convertExamples(Section scenarioOutline, MBTPathInfo examplesSrc) {
		Section examples = tgtObj.createExamples(scenarioOutline);
		tgtObj.createExamplesTable(examples, srcObj.getExamplesTable(examplesSrc));
		tgtObj.setExamplesName(examples, srcObj.getExamplesName(examplesSrc));

		ArrayList<HashMap<String, String>> examplesRows = srcObj.getExamplesRows(examplesSrc);
		for (int rowNum = 0; rowNum < examplesRows.size(); rowNum++) {
			HashMap<String, String> examplesRow = examplesRows.get(rowNum);
			convertExamplesRow(scenarioOutline, examples, examplesRow);
		}
	}

	private void convertExamplesRow(Section scenarioOutline, Section examples, HashMap<String, String> examplesRow) {
		tgtObj.createExamplesRow(scenarioOutline, examples, examplesRow);
	}

	private void convertStep(Section abstractScenario, MBTEdge step) {
		tgtObj.createStep(abstractScenario, srcObj.getStep(step));
	}

	private void convertStepList(Section abstractScenario, ArrayList<MBTEdge> stepList,
			MBTPathInfo abstractScenarioSrc) {
		for (MBTEdge step : stepList) {
			convertStep(abstractScenario, step);
			// TODO remove this stepDefObj creation after putting the docstring/datatable
			// label on the edge. Then that way the srcObj alone can tell if there's a
			// docstring or data table
			JGraphTGraphWrapper stepDefObj = srcPrj.getObject(srcObj.getStep(step), srcPrj.SECOND_LAYER);
			if (stepDefObj != null) {
				if (stepDefObj.hasDocString(step)) {
					convertDocString(abstractScenario, step);
				} else if (stepDefObj.hasDataTable(step)) {
					// TODO pass in the path info instead of the examplesRow
					convertDataTable(abstractScenario, step, abstractScenarioSrc);
				}
			}
		}
	}
}

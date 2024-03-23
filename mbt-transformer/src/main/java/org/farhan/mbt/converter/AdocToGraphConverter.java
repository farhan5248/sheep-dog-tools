package org.farhan.mbt.converter;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import org.asciidoctor.ast.Section;
import org.farhan.mbt.asciidoctor.AsciiDoctorAdocWrapper;
import org.farhan.mbt.asciidoctor.AsciiDoctorProject;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ToGraphConverter;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.graph.JGraphTProject;
import org.farhan.mbt.graph.JGraphTGraphWrapper;
import org.farhan.mbt.graph.MBTPathInfo;

public class AdocToGraphConverter extends ToGraphConverter {

	// This is used to assign each testcase or testcase data
	// row with a unique ID which is then stored in the collection of path
	// information in the graph
	private int pathCnt;
	private AsciiDoctorAdocWrapper srcObj;

	private AsciiDoctorProject srcPrj;
	private JGraphTGraphWrapper tgtObj;

	public AdocToGraphConverter(String layer, AsciiDoctorProject source, JGraphTProject target) {
		this.layer = layer;
		this.srcPrj = source;
		this.tgtPrj = target;
		this.pathCnt = 0;
	}

	@Override
	protected void convertAbstractScenarios(ConvertibleObject object) throws Exception {
		AsciiDoctorAdocWrapper srcObj = (AsciiDoctorAdocWrapper) object;
		for (Section abstractScenario : srcObj.getAbstractScenarioList()) {
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
	protected void convertFeature(ConvertibleObject anObject) throws Exception {
		srcObj = (AsciiDoctorAdocWrapper) anObject;
		tgtObj = (JGraphTGraphWrapper) tgtPrj.createObject(convertObjectName(srcObj.getFile().getAbsolutePath()));
		tgtObj.setFeatureName(srcObj.getFeatureName());
		tgtObj.setFeatureTags(srcObj.getFeatureTags());
		tgtObj.setFeatureDescription(srcObj.getFeatureDescription());
	}

	@Override
	protected String convertObjectName(String fileName) {
		// TODO add the layer parameter to the super class method
		return convertFeatureName(fileName, tgtPrj.FIRST_LAYER);
	}

	@Override
	protected ArrayList<ConvertibleObject> getSourceObjects(String layer) {
		return srcPrj.getObjects(layer);
	}

	@Override
	protected void selectFeatures() throws Exception {
		ArrayList<File> files = Utilities.recursivelyListFiles(srcPrj.getDir(srcPrj.FIRST_LAYER),
				srcPrj.getFileExt(srcPrj.FIRST_LAYER));
		srcPrj.getObjects(srcPrj.FIRST_LAYER).clear();
		for (File f : files) {
			srcPrj.createObject(f.getAbsolutePath()).load();
		}
	}

	private void convertBackground(Section abstractScenario) {
		MBTPathInfo background = tgtObj.createBackground(pathCnt);
		tgtObj.setBackgroundName(background, srcObj.getBackgroundName(abstractScenario));
		tgtObj.setBackgroundDescription(background, srcObj.getBackgroundDescription(abstractScenario));
		convertStepList(background, srcObj.getStepList(abstractScenario), new HashMap<String, String>());
		tgtObj.addBackground(background);
	}

	private void convertDataTable(MBTPathInfo abstractScenario, Section step, HashMap<String, String> replacements) {
		String name = srcObj.getStep(step);
		JGraphTGraphWrapper stepDefObj = (JGraphTGraphWrapper) tgtPrj
				.createObject(convertFeatureName(name, tgtPrj.SECOND_LAYER));
		stepDefObj.setStepDefinitionName(name);
		ArrayList<ArrayList<String>> dataTableCellList = srcObj.getDataTable(step, replacements);
		// TODO this should just create a datatable like a scenario and then add the
		// attributes like steps. So add stepDefObj.createCell
		tgtObj.createDataTable(stepDefObj, abstractScenario, dataTableCellList);
	}

	private void convertDocString(MBTPathInfo abstractScenario, Section step) {
		String name = srcObj.getStep(step);
		JGraphTGraphWrapper stepDefObj = (JGraphTGraphWrapper) tgtPrj
				.createObject(convertFeatureName(name, tgtPrj.SECOND_LAYER));
		stepDefObj.setStepDefinitionName(name);
		String fileName = tgtPrj.createResource(name, srcObj.getDocString(step));
		// TODO this should just create a docstring like a scenario and then add the
		// attributes like steps. So add stepDefObj.createContent
		tgtObj.createDocString(stepDefObj, abstractScenario, fileName);
	}

	private void convertExamples(Section abstractScenario, Section examples) {
		ArrayList<HashMap<String, String>> examplesRows = srcObj.getExamplesRows(examples);
		for (int rowNum = 0; rowNum < examplesRows.size(); rowNum++) {
			HashMap<String, String> examplesRow = examplesRows.get(rowNum);
			convertExamplesRow(abstractScenario, examples, examplesRow, rowNum);
		}
	}

	private void convertExamplesRow(Section abstractScenario, Section example, HashMap<String, String> examplesRow,
			int rowNum) {
		// TODO have one named path (coverage) per example to save the name
		// have multiple indices for each row
		// TODO maybe pathCnt shouldn't be tracked here but in srcObj instead
		MBTPathInfo scenarioOutline = tgtObj.createScenarioOutline(pathCnt);
		tgtObj.setScenarioOutlineName(scenarioOutline, srcObj.getScenarioOutlineName(abstractScenario));
		tgtObj.setScenarioOutlineTags(scenarioOutline, srcObj.getScenarioOutlineTags(abstractScenario));
		tgtObj.setScenarioOutlineDescription(scenarioOutline, srcObj.getScenarioOutlineDescription(abstractScenario));
		tgtObj.setScenarioOutlineParameters(scenarioOutline, srcObj.getScenarioOutlineParameters(examplesRow));

		MBTPathInfo examples = tgtObj.createExamples(scenarioOutline);
		tgtObj.setExamplesName(examples, srcObj.getExamplesName(example));
		tgtObj.setExamplesRowName(tgtObj.createExamplesRow(examples), srcObj.getExamplesRowName(rowNum));

		convertStepList(scenarioOutline, srcObj.getStepList(abstractScenario), examplesRow);
		tgtObj.addScenarioOutline(scenarioOutline);
	}

	private String convertFeatureName(String fileName, String layer) {
		// TODO make this a supertype method but with the additional delimiter parameter
		// which can be :: or File.separator
		String qualifiedName = fileName.replace(",", "");
		qualifiedName = qualifiedName.replace(srcPrj.getFileExt(layer), "");
		qualifiedName = qualifiedName.replace(srcPrj.getDir(layer).getAbsolutePath() + File.separator, "");
		qualifiedName = tgtPrj.getDir(layer) + File.separator + qualifiedName + tgtPrj.getFileExt(layer);
		return qualifiedName;
	}

	private void convertScenario(Section abstractScenario) {
		MBTPathInfo scenario = tgtObj.createScenario(pathCnt);
		tgtObj.setScenarioTags(scenario, srcObj.getScenarioTags(abstractScenario));
		tgtObj.setScenarioName(scenario, srcObj.getScenarioName(abstractScenario));
		tgtObj.setScenarioDescription(scenario, srcObj.getScenarioDescription(abstractScenario));
		convertStepList(scenario, srcObj.getStepList(abstractScenario), new HashMap<String, String>());
		tgtObj.addScenario(scenario);
	}

	private void convertScenarioOutline(Section abstractScenario) {
		ArrayList<Section> examplesList = srcObj.getExamplesList(abstractScenario);
		for (Section examples : examplesList) {
			convertExamples(abstractScenario, examples);
		}
	}

	private void convertStep(MBTPathInfo abstractScenario, Section step) {
		tgtObj.createStep(abstractScenario, srcObj.getStep(step));
	}

	private void convertStepList(MBTPathInfo abstractScenario, ArrayList<Section> stepList,
			HashMap<String, String> examplesRow) {
		for (Section step : stepList) {
			convertStep(abstractScenario, step);
			if (srcObj.hasDataTable(step)) {
				convertDataTable(abstractScenario, step, examplesRow);
			} else if (srcObj.hasDocString(step)) {
				convertDocString(abstractScenario, step);
			}
		}
		pathCnt++;
	}

}

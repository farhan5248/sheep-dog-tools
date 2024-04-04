package org.farhan.mbt.convert;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import org.asciidoctor.ast.Section;
import org.farhan.mbt.asciidoctor.AsciiDoctorAdocWrapper;
import org.farhan.mbt.asciidoctor.AsciiDoctorProject;
import org.farhan.mbt.core.ConvertToDocument;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.graph.JGraphTGraphWrapper;
import org.farhan.mbt.graph.JGraphTProject;
import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTPathInfo;

public class ConvertGraphToAsciiDoctor extends ConvertToDocument {

	private JGraphTGraphWrapper srcObj;

	private JGraphTProject srcPrj;

	private AsciiDoctorAdocWrapper tgtObj;

	protected void convertAbstractScenarioList() throws Exception {
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

	private void convertBackground(MBTPathInfo abstractScenario) {
		Section background = tgtObj.createBackground();
		tgtObj.setBackgroundName(background, srcObj.getBackgroundName(abstractScenario));
		tgtObj.setBackgroundDescription(background, srcObj.getBackgroundDescription(abstractScenario));
		convertStepList(background, srcObj.getStepList(null, abstractScenario), abstractScenario);
		tgtObj.addBackground(background);
	}

	private void convertDataTable(Section step, MBTEdge stepSrc, MBTPathInfo abstractScenarioSrc) {
		JGraphTGraphWrapper stepDefObj = srcPrj.getObject(srcObj.getStep(stepSrc), srcPrj.SECOND_LAYER);
		ArrayList<ArrayList<String>> dataTableCellList = stepDefObj.getDataTable(abstractScenarioSrc, "{}");
		tgtObj.createDataTable(step, dataTableCellList);
	}

	private void convertDocString(Section step, MBTEdge stepSrc) {
		JGraphTGraphWrapper stepDefObj = srcPrj.getObject(srcObj.getStep(stepSrc), srcPrj.SECOND_LAYER);
		String content = srcPrj.getResource(stepDefObj.getDocString());
		tgtObj.createDocString(step, content);
	}

	private void convertExamples(Section scenarioOutline, MBTPathInfo examplesSrc) {
		Section examples = tgtObj.createExamples(scenarioOutline);
		tgtObj.setExamplesName(examples, srcObj.getExamplesName(examplesSrc));
		tgtObj.createExamplesTable(examples, srcObj.getExamplesTable(examplesSrc));

		HashMap<String, String> examplesRow = new HashMap<String, String>();
		for (MBTEdge e : srcObj.getStepList(null, examplesSrc)) {
			JGraphTGraphWrapper stepDefObj = srcPrj.getObject(srcObj.getStep(e), srcPrj.SECOND_LAYER);
			// TODO perhaps there needs to be a stereotype for the PathInfo (rename to
			// coverage) with values such as background, outline, examplesRow. Then when
			// getting the list of abstract scenarios, examplesRow is ignored
			if (stepDefObj != null) {
				examplesRow = stepDefObj.getExamplesRow(examplesSrc, examplesRow);
			}
		}
		convertExamplesRow(scenarioOutline, examples, examplesRow);
	}

	private void convertExamplesRow(Section scenarioOutline, Section examples, HashMap<String, String> examplesRow) {
		tgtObj.createExamplesRow(scenarioOutline, examples, examplesRow);
	}

	@Override
	protected void convertFeature(ConvertibleObject object) throws Exception {
		srcObj = (JGraphTGraphWrapper) object;
		tgtObj = (AsciiDoctorAdocWrapper) tgtPrj.createObject(convertObjectName(srcObj.getFile().getAbsolutePath()));
		tgtObj.setFeatureName(srcObj.getFeatureName());
		tgtObj.setFeatureTags(srcObj.getFeatureTags());
		tgtObj.setFeatureDescription(srcObj.getFeatureDescription());
		convertAbstractScenarioList();
	}

	protected String convertObjectName(String documentTitle) {
		return convertObjectName(documentTitle, tgtPrj.FIRST_LAYER);
	}

	private String convertObjectName(String fileName, String layer) {
		// TODO move to superclass
		String qualifiedName = fileName.replace(",", "").trim();
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

	private void convertStep(Section abstractScenario, MBTEdge stepSrc, MBTPathInfo abstractScenarioSrc) {
		Section step = tgtObj.createStep(abstractScenario, srcObj.getStep(stepSrc));
		// TODO remove this stepDefObj creation after putting the docstring/datatable
		// label on the edge. Then that way the srcObj alone can tell if there's a
		// docstring or data table
		JGraphTGraphWrapper stepDefObj = srcPrj.getObject(srcObj.getStep(stepSrc), srcPrj.SECOND_LAYER);
		if (stepDefObj != null) {
			if (stepDefObj.hasDocString(stepSrc)) {
				convertDocString(step, stepSrc);
			} else if (stepDefObj.hasDataTable(stepSrc)) {
				convertDataTable(step, stepSrc, abstractScenarioSrc);
			}
		}
	}

	private void convertStepList(Section abstractScenario, ArrayList<MBTEdge> stepList,
			MBTPathInfo abstractScenarioSrc) {
		for (MBTEdge step : stepList) {
			convertStep(abstractScenario, step, abstractScenarioSrc);
		}
	}

	@Override
	protected ArrayList<ConvertibleObject> getFeatures(String layer) {
		return srcPrj.getObjects(layer);
	}

	@Override
	protected void initProjects() throws Exception {
		srcPrj = new JGraphTProject();
		tgtPrj = new AsciiDoctorProject();
	}

	@Override
	protected void save() throws Exception {
		tgtPrj.save();
	}

	@Override
	protected void loadFeatures() throws Exception {
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
}

package org.farhan.mbt.converter;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.asciidoctor.ast.Section;
import org.farhan.mbt.asciidoctor.AsciiDoctorAdocWrapper;
import org.farhan.mbt.asciidoctor.AsciiDoctorProject;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ToDocumentConverter;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.graph.JGraphTProject;
import org.farhan.mbt.graph.JGraphTGraphWrapper;
import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTPathInfo;

public class GraphToAdocConverter extends ToDocumentConverter {

	private JGraphTGraphWrapper srcObj;
	private JGraphTProject srcPrj;
	private AsciiDoctorAdocWrapper tgtObj;

	public GraphToAdocConverter(String layer, JGraphTProject source, AsciiDoctorProject target) {
		this.layer = layer;
		this.srcPrj = source;
		this.tgtPrj = target;
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

	private void convertExamples(Section scenarioOutline, MBTPathInfo examplesSrc) {
		Section examples = tgtObj.createExamples(scenarioOutline);
		tgtObj.setExamplesName(examples, srcObj.getExamplesName(examplesSrc));
		tgtObj.createExamplesTable(examples, srcObj.getExamplesTable(examplesSrc));

		HashMap<String, String> examplesRow = new HashMap<String, String>();
		for (MBTEdge e : srcObj.getStepList(null, examplesSrc)) {
			JGraphTGraphWrapper stepDefObj = srcPrj.getObject(srcObj.getStep(e), srcPrj.SECOND_LAYER);
			// TODO as long as there are two separate graphs, this gets complicated.
			// it's not the same as with the .feature and .java files because everything for
			// the entire feature is in one file, same for UML class or .adoc file
			// If two graphs will be maintained, then the wrappers should manage
			// relationships with other layers so that in this case
			// srcObj.getExamplesRowList can get all the rows
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
}

package org.farhan.mbt.cucumberuml;

import java.io.File;
import java.util.ArrayList;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ValueSpecification;
import org.farhan.cucumber.Background;
import org.farhan.cucumber.Cell;
import org.farhan.cucumber.CucumberFactory;
import org.farhan.cucumber.Examples;
import org.farhan.cucumber.Feature;
import org.farhan.cucumber.Line;
import org.farhan.cucumber.Row;
import org.farhan.cucumber.Scenario;
import org.farhan.cucumber.ScenarioOutline;
import org.farhan.cucumber.Statement;
import org.farhan.cucumber.Step;
import org.farhan.cucumber.Tag;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ToCodeConverter;
import org.farhan.mbt.cucumber.CucumberFeatureWrapper;
import org.farhan.mbt.cucumber.CucumberProject;
import org.farhan.mbt.uml.UMLClassWrapper;
import org.farhan.mbt.uml.UMLProject;

public class UMLToFeatureConverter extends ToCodeConverter {

	private CucumberFeatureWrapper tgtWrp;
	private CucumberProject tgtPrj;

	public UMLToFeatureConverter(String layer, UMLProject source, CucumberProject target) {
		this.layer = layer;
		this.srcPrj = source;
		this.tgtPrj = target;
	}

	@Override
	protected void selectObjects() throws Exception {
		srcPrj.loadObjects(layer);
	}

	@Override
	protected ArrayList<ConvertibleObject> getObjects(String layer) {
		return srcPrj.getObjects(layer);
	}

	@Override
	protected void convertObject(ConvertibleObject layerClass) throws Exception {
		UMLClassWrapper ucw = (UMLClassWrapper) layerClass;
		Class c = (Class) ucw.get();
		String path = convertObjectName(c.getQualifiedName());
		tgtWrp = (CucumberFeatureWrapper) tgtPrj.createObject(path);
		convertClassAnnotations(c, (Feature) tgtWrp.get());
		convertComments(c, ((Feature) tgtWrp.get()).getStatements());
	}

	private void convertClassAnnotations(Class c, Feature feature) {
		// The first is the title
		feature.setName(c.getEAnnotations().getFirst().getDetails().get(0).getKey());

		// the last is the tags
		if (c.getEAnnotations().size() == 2) {
			for (Entry<String, String> t : c.getEAnnotations().getLast().getDetails()) {
				Tag tag = CucumberFactory.eINSTANCE.createTag();
				tag.setName(t.getKey());
				feature.getTags().add(tag);
			}
		}
	}

	private void convertComments(Class aClass, EList<Statement> statements) {
		if (aClass.getOwnedComments().size() > 0) {
			String comment = aClass.getOwnedComments().get(0).getBody();
			if (!comment.isEmpty()) {
				for (String line : comment.split("\n")) {
					Statement s = CucumberFactory.eINSTANCE.createStatement();
					s.setName(line);
					statements.add(s);
				}
			}
		}
	}

	private void convertComments(Interaction anInteraction, EList<Statement> statements) {
		if (anInteraction.getOwnedComments().size() > 0) {
			String comment = anInteraction.getOwnedComments().get(0).getBody();
			if (!comment.isEmpty()) {
				for (String line : comment.split("\n")) {
					Statement s = CucumberFactory.eINSTANCE.createStatement();
					s.setName(line);
					statements.add(s);
				}
			}
		}
	}

	@Override
	protected void convertImports(ConvertibleObject layerClass) throws Exception {
	}

	@Override
	protected void convertBehaviours(ConvertibleObject layerClass) throws Exception {
		// TODO there's no scenario outline, just scenario for now
		UMLClassWrapper ucw = (UMLClassWrapper) layerClass;
		for (Behavior aBehavior : ((Class) ucw.get()).getOwnedBehaviors()) {
			if (aBehavior instanceof Interaction) {
				Interaction anInteraction = (Interaction) aBehavior;
				if (anInteraction.getEAnnotation("background") != null) {
					Background as = CucumberFactory.eINSTANCE.createBackground();
					as.setName(anInteraction.getName());
					((Feature) tgtWrp.get()).getAbstractScenarios().add(as);
					convertComments(anInteraction, as.getStatements());
					convertInteractionMessages(anInteraction, as.getSteps());
				} else if (!anInteraction.getEAnnotations().isEmpty()) {
					ScenarioOutline as = CucumberFactory.eINSTANCE.createScenarioOutline();
					as.setName(anInteraction.getName());
					((Feature) tgtWrp.get()).getAbstractScenarios().add(as);
					convertComments(anInteraction, as.getStatements());
					convertInteractionMessages(anInteraction, as.getSteps());
					convertParameters(anInteraction, as.getTags());
					convertAnnotation(anInteraction, as.getExamples());
				} else {
					Scenario as = CucumberFactory.eINSTANCE.createScenario();
					as.setName(anInteraction.getName());
					((Feature) tgtWrp.get()).getAbstractScenarios().add(as);
					convertComments(anInteraction, as.getStatements());
					convertInteractionMessages(anInteraction, as.getSteps());
					convertParameters(anInteraction, as.getTags());
				}
			}
		}
	}

	private void convertAnnotation(Interaction anInteraction, EList<Examples> examples) {
		for (int i = 0; i < anInteraction.getEAnnotations().size(); i++) {
			EAnnotation exampleAnnotations = anInteraction.getEAnnotations().get(i);
			Examples examplesSection = CucumberFactory.eINSTANCE.createExamples();
			examplesSection.setName(exampleAnnotations.getSource());
			examples.add(examplesSection);
			examplesSection.setTheExamplesTable(CucumberFactory.eINSTANCE.createExamplesTable());
			// get the details
			for (int j = 0; j < exampleAnnotations.getDetails().size(); j++) {
				Entry<String, String> rowAnnotation = exampleAnnotations.getDetails().get(j);
				Row row = CucumberFactory.eINSTANCE.createRow();
				examplesSection.getTheExamplesTable().getRows().add(row);
				String[] cells = rowAnnotation.getValue().split("\\|");
				for (int k = 0; k < cells.length; k++) {
					Cell cell = CucumberFactory.eINSTANCE.createCell();
					cell.setName(cells[k]);
					row.getCells().add(cell);
				}
			}
		}
	}

	private void convertParameters(Interaction anInteraction, EList<Tag> tags) {
		for (Parameter p : anInteraction.getOwnedParameters()) {
			Tag tag = CucumberFactory.eINSTANCE.createTag();
			tag.setName(p.getName());
			tags.add(tag);
		}
	}

	@Override
	protected void convertInteractionMessages(Interaction anInteraction, Object stepList) throws Exception {
		for (Message m : anInteraction.getMessages()) {
			convertMessage(m, stepList);
		}
	}

	@Override
	protected void convertMessage(Message m, Object stepList) throws Exception {
		EList<Step> steps = (EList<Step>) stepList;
		String keyword = m.getEAnnotations().getFirst().getSource();
		Step step = null;
		switch (keyword) {
		case "Given":
			step = CucumberFactory.eINSTANCE.createGiven();
			break;
		case "When":
			step = CucumberFactory.eINSTANCE.createWhen();
			break;
		case "Then":
			step = CucumberFactory.eINSTANCE.createThen();
			break;
		case "But":
			step = CucumberFactory.eINSTANCE.createBut();
			break;
		case "And":
			step = CucumberFactory.eINSTANCE.createAnd();
			break;
		case "Asterisk":
			step = CucumberFactory.eINSTANCE.createAsterisk();
			break;
		}
		step.setName(m.getName());
		steps.add(step);
		convertDataTableFromArgument(m, step);
		convertDocStringFromArgument(m, step);
	}

	private void convertDocStringFromArgument(Message m, Step step) {
		ValueSpecification vs = (LiteralString) m.getArgument("docString", null);
		if (vs == null) {
			return;
		}
		EMap<String, String> lines = vs.getEAnnotation("docString").getDetails();
		if (!lines.isEmpty()) {
			step.setTheDocString(CucumberFactory.eINSTANCE.createDocString());
			for (int i = 0; i < lines.size(); i++) {
				Line line = CucumberFactory.eINSTANCE.createLine();
				// I'm not sure why only 9 leading spaces are needed instead of 10 and why a
				// trailing space gets added automatically
				line.setName("         " + lines.get(i).getValue());
				step.getTheDocString().getLines().add(line);
			}
		}
	}

	private void convertDataTableFromArgument(Message m, Step step) {

		ValueSpecification vs = (LiteralString) m.getArgument("dataTable", null);
		if (vs == null) {
			return;
		}
		EMap<String, String> rows = vs.getEAnnotation("dataTable").getDetails();
		if (!rows.isEmpty()) {
			step.setTheStepTable(CucumberFactory.eINSTANCE.createStepTable());
			for (int i=0; i< rows.keySet().size(); i++) {
				String rowString = rows.get(i).getValue();
				Row row = CucumberFactory.eINSTANCE.createRow();
				for (String rs : rowString.split(" \\|")) {
					Cell cell = CucumberFactory.eINSTANCE.createCell();
					cell.setName(rs);
					row.getCells().add(cell);
				}
				step.getTheStepTable().getRows().add(row);
			}
		}
	}

	@Override
	protected String convertObjectName(String fullName) {
		String pathName = fullName;
		pathName = pathName.replace("pst::" + tgtPrj.FIRST_LAYER, tgtPrj.getDir(tgtPrj.FIRST_LAYER).getAbsolutePath());
		pathName = pathName.replace("::", File.separator);
		pathName = pathName + tgtPrj.getFileExt(tgtPrj.FIRST_LAYER);
		return pathName;
	}

}

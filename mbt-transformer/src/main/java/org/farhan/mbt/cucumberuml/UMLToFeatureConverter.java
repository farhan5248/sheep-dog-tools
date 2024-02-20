package org.farhan.mbt.cucumberuml;

import java.io.File;
import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ValueSpecification;
import org.farhan.cucumber.Cell;
import org.farhan.cucumber.CucumberFactory;
import org.farhan.cucumber.Feature;
import org.farhan.cucumber.Row;
import org.farhan.cucumber.Scenario;
import org.farhan.cucumber.Statement;
import org.farhan.cucumber.Step;
import org.farhan.cucumber.Tag;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ToCodeConverter;
import org.farhan.mbt.core.Utilities;
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
		convertComments(c, (Feature) tgtWrp.get());
	}

	private void convertClassAnnotations(Class c, Feature feature) {
		feature.setName(c.getEAnnotations().getFirst().getSource());
	}

	private void convertComments(Class aClass, Feature aFeature) {
		if (aClass.getOwnedComments().size() > 0) {
			String comment = aClass.getOwnedComments().get(0).getBody();
			if (!comment.isEmpty()) {
				for (String line : comment.split("\n")) {
					Statement s = CucumberFactory.eINSTANCE.createStatement();
					s.setName(line);
					aFeature.getStatements().add(s);
				}
			}
		}
	}

	private void convertComments(Interaction anInteraction, Scenario aScenario) {
		if (anInteraction.getOwnedComments().size() > 0) {
			String comment = anInteraction.getOwnedComments().get(0).getBody();
			if (!comment.isEmpty()) {
				for (String line : comment.split("\n")) {
					Statement s = CucumberFactory.eINSTANCE.createStatement();
					s.setName(line);
					aScenario.getStatements().add(s);
				}
			}
		}
	}

	@Override
	protected void convertImports(ConvertibleObject layerClass) throws Exception {
	}

	@Override
	protected void convertBehaviours(ConvertibleObject layerClass) throws Exception {
		// TODO there's no background or scenario outline, just scenario for now
		UMLClassWrapper ucw = (UMLClassWrapper) layerClass;
		for (Behavior aBehavior : ((Class) ucw.get()).getOwnedBehaviors()) {
			if (aBehavior instanceof Interaction) {
				Interaction anInteraction = (Interaction) aBehavior;
				Scenario aScenario = CucumberFactory.eINSTANCE.createScenario();
				aScenario.setName(anInteraction.getName());
				((Feature) tgtWrp.get()).getAbstractScenarios().add(aScenario);
				// TODO this is for scenario outline data convertAnnotation(anInteraction,
				// aMethod);
				convertParameters(anInteraction, aScenario);
				convertComments(anInteraction, aScenario);
				convertInteractionMessages(anInteraction, aScenario.getSteps());
			}
		}
	}

	private void convertParameters(Interaction anInteraction, Scenario aScenario) {
		for (Parameter p : anInteraction.getOwnedParameters()) {
			Tag tag = CucumberFactory.eINSTANCE.createTag();
			tag.setName(p.getName());
			aScenario.getTags().add(tag);
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
	}

	private void convertDataTableFromArgument(Message m, Step step) {

		ValueSpecification vs = (LiteralString) m.getArgument("dataTable", null);
		if (vs == null) {
			return;
		}
		EMap<String, String> rows = vs.getEAnnotation("dataTable").getDetails();
		if (!rows.isEmpty()) {
			step.setTheStepTable(CucumberFactory.eINSTANCE.createStepTable());
			for (String rowId : rows.keySet()) {
				String rowString = rows.get(rowId);
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

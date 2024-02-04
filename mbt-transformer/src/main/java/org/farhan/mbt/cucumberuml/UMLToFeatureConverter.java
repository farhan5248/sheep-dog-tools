package org.farhan.mbt.cucumberuml;

import java.io.File;
import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.ValueSpecification;
import org.farhan.cucumber.Cell;
import org.farhan.cucumber.CucumberFactory;
import org.farhan.cucumber.Feature;
import org.farhan.cucumber.Row;
import org.farhan.cucumber.Scenario;
import org.farhan.cucumber.Statement;
import org.farhan.cucumber.Step;
import org.farhan.mbt.core.UMLToConverter;
import org.farhan.mbt.cucumber.CucumberFeatureFile;
import org.farhan.mbt.cucumber.CucumberProject;
import org.farhan.mbt.uml.AnnotationFactory;
import org.farhan.mbt.uml.ArgumentFactory;
import org.farhan.mbt.uml.PackageFactory;
import org.farhan.mbt.uml.UMLProject;

public class UMLToFeatureConverter extends UMLToConverter {

	private CucumberFeatureFile aFeatureFile;
	private String layer;

	CucumberProject targetProject;

	public UMLToFeatureConverter(String layer, UMLProject sourceProject, CucumberProject targetProject) {
		this.layer = layer;
		this.sourceProject = sourceProject;
		this.targetProject = targetProject;
	}

	@Override
	protected String getLayer() {
		return layer;
	}

	@Override
	protected ArrayList<?> selectLayerFiles() throws Exception {
		return PackageFactory.getPackagedClasses(sourceProject.theSystem.getNestedPackage(getLayer()));
	}

	@Override
	protected ArrayList<Class> getLayerObjects(String layer) {
		return sourceProject.getLayerClasses(layer);
	}

	@Override
	protected void convertObject(Class layerClass) throws Exception {
		String path = convertFullName(layerClass.getQualifiedName());
		aFeatureFile = targetProject.createCucumberFeatureFile(new File(path));
		convertComments(layerClass, aFeatureFile.theFeature);
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
	protected void convertImports(Class layerClass) throws Exception {
	}

	@Override
	protected void convertAttributes(Class layerClass) throws Exception {
	}

	@Override
	protected void convertBehaviours(Class layerClass) throws Exception {
		// TODO there's no background or scenario outline, just scenario
		for (Behavior aBehavior : layerClass.getOwnedBehaviors()) {
			if (aBehavior instanceof Interaction) {
				Interaction anInteraction = (Interaction) aBehavior;
				Scenario aScenario = CucumberFactory.eINSTANCE.createScenario();
				aScenario.setName(anInteraction.getName());
				aFeatureFile.theFeature.getAbstractScenarios().add(aScenario);
				// TODO this is for scenario outline data convertAnnotation(anInteraction,
				// aMethod);
				// TODO this is for scenario tags convertParameters(anInteraction, aMethod);
				convertComments(anInteraction, aScenario);
				convertInteractionMessages(anInteraction, aScenario.getSteps());
			}
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
		// TODO change to Given When Then in the future
		Step step = CucumberFactory.eINSTANCE.createAsterisk();
		step.setName(m.getName());
		steps.add(step);
		convertDataTableFromArgument(m, step);
	}

	private void convertDataTableFromArgument(Message m, Step step) {

		ValueSpecification vs = ArgumentFactory.getArgument(m, "dataTable", "", true);
		EMap<String, String> rows = AnnotationFactory.getAnnotation(vs, "dataTable").getDetails();
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
	protected String convertFullName(String fullName) {
		String pathName = fullName;
		pathName = pathName.replace("pst::" + targetProject.firstLayerName,
				targetProject.getLayerDir(targetProject.firstLayerName).getAbsolutePath());
		pathName = pathName.replace("::", File.separator);
		// TODO isn't feature defined somewhere else as getFileType? Maybe there should
		// be get Layer 1 filetype, layer 2 filetype etc defined here
		pathName = pathName + targetProject.getLayerFileType(targetProject.firstLayerName);
		return pathName;
	}

}

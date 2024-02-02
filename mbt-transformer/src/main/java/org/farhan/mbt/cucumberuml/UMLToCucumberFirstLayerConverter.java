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
import org.farhan.mbt.core.Project;
import org.farhan.mbt.core.UMLToFirstLayerConverter;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.cucumber.CucumberFeatureFile;
import org.farhan.mbt.cucumber.CucumberNameConverter;
import org.farhan.mbt.cucumber.CucumberProject;
import org.farhan.mbt.uml.AnnotationFactory;
import org.farhan.mbt.uml.ArgumentFactory;
import org.farhan.mbt.uml.PackageFactory;
import org.farhan.mbt.uml.UMLProject;

public class UMLToCucumberFirstLayerConverter extends UMLToFirstLayerConverter {

	private CucumberFeatureFile aFeatureFile;

	@Override
	protected ArrayList<?> selectLayerClasses(String layerSelectionCriteria) throws Exception {
		return PackageFactory.getPackagedClasses(UMLProject.theSystem.getNestedPackage(layerSelectionCriteria));
	}

	@Override
	protected ArrayList<Class> getLayerClasses(String layer) {
		return UMLProject.getLayerClasses(layer);
	}

	@Override
	protected void convertFromClass(Class layerClass) throws Exception {
		String path = convertClassQualifiedNameToPath(layerClass.getQualifiedName());
		aFeatureFile = CucumberProject.createCucumberFeatureFile(new File(path));
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
	protected void convertFromImports(Class layerClass) throws Exception {
	}

	@Override
	protected void convertFromAttributes(Class layerClass) throws Exception {
	}

	@Override
	protected void convertFromBehaviours(Class layerClass) throws Exception {
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
				convertFromInteractionMessages(anInteraction, aScenario.getSteps());
			}
		}
	}

	@Override
	protected void convertFromInteractionMessages(Interaction anInteraction, Object stepList) throws Exception {
		// TODO loop through messages and create statements with * for now
		for (Message m : anInteraction.getMessages()) {
			convertFromMessage(m, stepList);
		}
	}

	@Override
	protected void convertFromMessage(Message m, Object stepList) throws Exception {
		EList<Step> steps = (EList<Step>) stepList;
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
	protected String convertClassQualifiedNameToPath(String qualifiedName) {
		return CucumberNameConverter.convertQualifiedNameToCucumberPath(qualifiedName);
	}

	@Override
	protected String convertPathToClassQualifiedName(String pathName) {
		// TODO shouldn't be here
		return null;
	}

	@Override
	protected String convertClassQualifiedNameToImport(String qualifiedName) {
		// TODO shouldn't be here
		return null;
	}

	@Override
	protected String convertImportToClassQualifiedName(String importName) {
		// TODO shouldn't be here
		return null;
	}

}

package org.farhan.mbt.conv.cucumber;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.ValueSpecification;
import org.farhan.cucumber.AbstractScenario;
import org.farhan.cucumber.Background;
import org.farhan.cucumber.Examples;
import org.farhan.cucumber.Row;
import org.farhan.cucumber.Scenario;
import org.farhan.cucumber.ScenarioOutline;
import org.farhan.cucumber.Statement;
import org.farhan.cucumber.Step;
import org.farhan.cucumber.Tag;
import org.farhan.mbt.conv.core.ConvertibleFile;
import org.farhan.mbt.conv.core.Project;
import org.farhan.mbt.conv.core.ToUMLFirstLayerConverter;
import org.farhan.mbt.conv.core.Utilities;
import org.farhan.mbt.conv.core.Validator;
import org.farhan.mbt.conv.uml.AnnotationFactory;
import org.farhan.mbt.conv.uml.ArgumentFactory;
import org.farhan.mbt.conv.uml.ClassFactory;
import org.farhan.mbt.conv.uml.CommentFactory;
import org.farhan.mbt.conv.uml.ElementImportFactory;
import org.farhan.mbt.conv.uml.InteractionFactory;
import org.farhan.mbt.conv.uml.MessageFactory;
import org.farhan.mbt.conv.uml.ParameterFactory;
import org.farhan.mbt.conv.uml.UMLNameTranslator;
import org.farhan.mbt.conv.uml.UMLProject;

public class CucumberToUMLFirstLayerConverter extends ToUMLFirstLayerConverter {

	private CucumberFeatureFile aCucumberFile;

	@Override
	protected void selectLayerFiles(String layerSelectionCriteria) throws Exception {
		// TODO this line below should be CucumberProject.getFirstLayerFiles
		// that method will read the files, add it to its list and give a reference to
		// that list
		// The new CucumberFeatureFile(f) below will be taken care of in that method
		// because its return type is ConvertibleFile
		ArrayList<File> firstLayerFiles = Utilities.recursivelyListFiles(CucumberProject.getFirstLayerDir(),
				CucumberProject.getFirstLayerFileType());

		// All that's left then is to remove files not part of the criteria
		for (int i = firstLayerFiles.size() - 1; i >= 0; i--) {
			if (!isFileSelected(firstLayerFiles.get(i), layerSelectionCriteria)) {
				firstLayerFiles.remove(i);
			}
		}

		for (File f : firstLayerFiles) {
			CucumberProject.getFirstLayerFiles().add(new CucumberFeatureFile(f));
		}
	}

	private boolean isFileSelected(File theFile, String layerSelectionCriteria) throws Exception {

		// TODO this should also be in selectLayerFiles or
		// CucumberProject.getFirstLayerFiles
		CucumberFeatureFile aCucumberFile = new CucumberFeatureFile(theFile);
		aCucumberFile.read();

		// Make a tag search method and then move this into selectLayerFiles and delete
		// this method
		// if isTagged(aCucumberFile.theFeature.getTags())
		for (Tag t : aCucumberFile.theFeature.getTags()) {
			if (t.getName().trim().contentEquals(layerSelectionCriteria)) {
				return true;
			}
		}
		for (AbstractScenario a : aCucumberFile.theFeature.getAbstractScenarios()) {
			if (a instanceof Scenario) {
				// if isTagged(((Scenario) a).getTags())
				for (Tag t : ((Scenario) a).getTags()) {
					if (t.getName().trim().contentEquals(layerSelectionCriteria)) {
						return true;
					}
				}
			} else if (a instanceof ScenarioOutline) {
				// if isTagged(((ScenarioOutline) a).getTags())
				for (Tag t : ((ScenarioOutline) a).getTags()) {
					if (t.getName().trim().contentEquals(layerSelectionCriteria)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	protected Class convertToClass(ConvertibleFile theObject) throws Exception {

		aCucumberFile = (CucumberFeatureFile) theObject;
		aCucumberFile.read();
		// TODO rename stuff like this abspath to qualiname etc
		String qualifiedName = convertAbsolutePathToQualifiedName(aCucumberFile.getFile().getAbsolutePath());
		// TODO remove UMLProject.theSystem from all the UML Factory methods
		Class layerClass = ClassFactory.getClass(UMLProject.theSystem, qualifiedName);
		return layerClass;
	}

	@Override
	protected void convertToImports(Class layerClass) throws Exception {
	}

	@Override
	protected void convertToAttributes(Class layerClass) throws Exception {
		CommentFactory.getComment(layerClass, statementsToString(aCucumberFile.theFeature.getStatements()));
	}

	@Override
	protected void convertToBehaviours(Class layerClass) throws Exception {

		Background b = null;
		for (AbstractScenario as : aCucumberFile.theFeature.getAbstractScenarios()) {

			if (as instanceof Background) {
				b = (Background) as;
				continue;
			}

			resetCurrentContainerObject();
			Interaction anInteraction = InteractionFactory.getInteraction(layerClass, as.getName(), true);
			anInteraction.setName(anInteraction.getName());
			anInteraction.createOwnedComment().setBody(statementsToString(as.getStatements()));

			if (as instanceof Scenario) {
				Scenario aScenario = (Scenario) as;
				// TODO I need to make Cucumber Factory set of classes to make things like
				// getting data easier or just getting the tags
				for (Tag a : aScenario.getTags()) {
					ParameterFactory.getParameter(anInteraction, a.getName().replace("@", ""), "", "in");
				}
			}

			// TODO apply example data to step data table
			if (as instanceof ScenarioOutline) {
				ScenarioOutline so = (ScenarioOutline) as;
				for (Tag a : so.getTags()) {
					ParameterFactory.getParameter(anInteraction, a.getName().replace("@", ""), "", "in");
				}

				for (Examples e : so.getExamples()) {
					EAnnotation a = AnnotationFactory.getAnnotation(anInteraction, e.getName());
					EList<Row> rows = e.getTheExamplesTable().getRows();
					for (int i = 0; i < rows.size(); i++) {

						String key = String.valueOf(i);
						String value = "";
						for (int j = 0; j < rows.get(i).getCells().size(); j++) {
							value += rows.get(i).getCells().get(j).getName() + "|";
						}
						a.getDetails().put(key, value);
					}
				}
			}

			// If there is a background, add its steps first
			if (b != null) {
				convertToInteractionMessages(anInteraction, b.getSteps());
			}

			convertToInteractionMessages(anInteraction, as.getSteps());
		}
	}

	@Override
	protected void convertToInteractionMessages(Interaction anInteraction, Collection<?> steps) throws Exception {

		for (Object o : steps) {
			Step cs = (Step) o;
			String messageName = cs.getName();
			if (Validator.validateStepText(messageName)) {
				setCurrentMachineAndState(messageName);
				convertToMessage(anInteraction, cs);

			} else {
				throw new Exception("Step (" + cs.getName() + ") is not valid, use Xtext editor to correct it first. ");
			}
		}
	}

	@Override
	protected void convertToMessage(Interaction anInteraction, Object o) {
		Step cs = (Step) o;
		String messageName = cs.getName();
		Class owningClass = (Class) anInteraction.getOwner();

		String secondLayerClassName = "";
		secondLayerClassName = UMLNameTranslator.filterClassName(getFSMName() + getFSMState() + "Steps");
		secondLayerClassName = "pst::" + Project.secondLayerPackageName + "::" + getFSMName() + "::"
				+ secondLayerClassName;

		Class importedClass = ClassFactory.getClassByMessage(UMLProject.theSystem, messageName, secondLayerClassName);
		ElementImport classImport = ElementImportFactory.getElementImportByAlias(owningClass, importedClass.getName());
		if (classImport == null) {
			classImport = ElementImportFactory.getElementImport(owningClass, secondLayerClassName);
		}
		Message theMessage = MessageFactory.getMessage(anInteraction, importedClass, messageName);

		// Add the data as annotations for now until I can use a loop in UML. The data
		// is needed for round trip engineering to the Asciidoc files/graph model
		if (cs.getTheStepTable() != null) {
			ValueSpecification vs = ArgumentFactory.getArgument(theMessage, "dataTable", "", true);
			EAnnotation a = AnnotationFactory.getAnnotation(vs, "dataTable");
			EList<Row> rows = cs.getTheStepTable().getRows();
			for (int i = 0; i < rows.size(); i++) {

				String key = String.valueOf(i);
				String value = "";
				for (int j = 0; j < rows.get(i).getCells().size(); j++) {
					value += rows.get(i).getCells().get(j).getName() + " |";
				}
				a.getDetails().put(key, value);
			}
		}
		if (cs.getTheDocString() != null) {
			ValueSpecification vs = ArgumentFactory.getArgument(theMessage, "docString", "", true);
			EAnnotation a = AnnotationFactory.getAnnotation(vs, "docString");
			EList<Statement> lines = cs.getTheDocString().getStatements();

			for (int i = 0; i < lines.size(); i++) {
				String key = String.valueOf(i);
				String value = lines.get(i).getName();
				a.getDetails().put(key, value);
			}
		}
	}

	@Override
	protected String convertClassQualifiedNameToPath(String qualifiedName) {
		String pathName = qualifiedName;
		pathName = pathName.replace("pst::specs::", "");
		pathName = pathName.replace("::", File.separator);
		pathName = CucumberProject.getFirstLayerDir().getAbsolutePath() + pathName;
		pathName = pathName + ".feature";
		return pathName;
	}

	@Override
	protected String convertAbsolutePathToQualifiedName(String pathName) {
		String qualifiedName = pathName.trim();
		qualifiedName = qualifiedName.replace(".feature", "");
		qualifiedName = qualifiedName.replace(CucumberProject.getFirstLayerDir().getAbsolutePath(), "");
		qualifiedName = qualifiedName.replace(File.separator, "::");
		qualifiedName = "pst::specs" + qualifiedName;
		return qualifiedName;
	}

	@Override
	protected String convertClassQualifiedNameToImport(String qualifiedName) {
		// first layer files have no explicit imports
		return "";
	}

	@Override
	protected String convertImportToClassQualifiedName(String path) {
		// first layer files have no explicit imports
		return null;
	}

	private String statementsToString(EList<Statement> eList) {
		String contents = "";
		for (Statement s : eList) {
			contents += s.getName() + "\n";
		}
		return contents.trim();
	}
}

package org.farhan.mbt.conv.cucumber;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.Model;
import org.farhan.conv.core.FirstLayerConverter;
import org.farhan.conv.core.Project;
import org.farhan.conv.core.Utilities;
import org.farhan.conv.validation.Layer1Validator;
import org.farhan.conv.validation.OutputStepValidator;
import org.farhan.conv.validation.TransitionStepValidator;
import org.farhan.cucumber.AbstractScenario;
import org.farhan.cucumber.Background;
import org.farhan.cucumber.Row;
import org.farhan.cucumber.Scenario;
import org.farhan.cucumber.ScenarioOutline;
import org.farhan.cucumber.Statement;
import org.farhan.cucumber.Step;
import org.farhan.cucumber.Tag;
import org.farhan.mbt.conv.uml.ArgumentFactory;
import org.farhan.mbt.conv.uml.ClassFactory;
import org.farhan.mbt.conv.uml.CommentFactory;
import org.farhan.mbt.conv.uml.ElementImportFactory;
import org.farhan.mbt.conv.uml.InteractionFactory;
import org.farhan.mbt.conv.uml.MessageFactory;
import org.farhan.mbt.conv.uml.ParameterFactory;
import org.farhan.mbt.conv.uml.UMLNameTranslator;

public class CucumberFirstLayerConverter extends FirstLayerConverter {

	private CucumberFeatureFile aCucumberFile;

	public CucumberFirstLayerConverter(Model theSystem) {
		this.theSystem = theSystem;
	}

	@Override
	protected File getLayerDir() {
		return CucumberProject.getFirstLayerDir();
	}

	@Override
	protected String getLayerFileType() {
		return ".feature";
	}

	@Override
	protected boolean isFileSelected(File theFile) throws Exception {

		CucumberFeatureFile aCucumberFile = new CucumberFeatureFile(theFile);
		aCucumberFile.readFile();

		for (Tag t : aCucumberFile.theFeature.getTags()) {
			if (t.getName().trim().contentEquals(Project.tags)) {
				return true;
			}
		}
		for (AbstractScenario a : aCucumberFile.theFeature.getAbstractScenarios()) {
			if (a instanceof Scenario) {
				for (Tag t : ((Scenario) a).getTags()) {
					if (t.getName().trim().contentEquals(Project.tags)) {
						return true;
					}
				}
			} else if (a instanceof ScenarioOutline) {
				for (Tag t : ((ScenarioOutline) a).getTags()) {
					if (t.getName().trim().contentEquals(Project.tags)) {
						return true;
					}
				}
			}

		}
		return false;
	}

	@Override
	protected Class convertToClass(File theFile) throws Exception {

		// TODO create interface TPSFile and methods getFile and setFile so that this
		// can be abstracted
		aCucumberFile = new CucumberFeatureFile(theFile);
		aCucumberFile.readFile();
		// TODO use convertPathToQualifiedName
		String qualifiedName = convertPathToClassQualifiedName(theFile.getAbsolutePath());
		Class layerClass = ClassFactory.getClass(theSystem, qualifiedName);
		return layerClass;
	}

	@Override
	protected void convertToImports(Class layerClass) throws Exception {
		// There are no explicit imports, they're implied when creating the scenarios
	}

	@Override
	protected void convertToAttributes(Class layerClass) throws Exception {
		CommentFactory.getComment(layerClass, statementsToString(aCucumberFile.theFeature.getStatements()));
	}

	@Override
	protected void convertToBehaviours(Class layerClass) throws Exception {
		// Create a new list with examples applied.
		// TODO use interaction operand in the future instead of bloating the UML file
		// ArrayList<AbstractScenario> expandedScenarios = expandScenarios(
		// aCucumberFile.theFeature.getAbstractScenarios());

		for (AbstractScenario as : aCucumberFile.theFeature.getAbstractScenarios()) {

			// TODO this doesn't handle Background or Scenario Outline
			Scenario aScenario = (Scenario) as;
			resetCurrentApplicationObject();
			Interaction anInteraction = InteractionFactory.getInteraction(layerClass, aScenario.getName(), true);
			anInteraction.setName(anInteraction.getName());
			anInteraction.createOwnedComment().setBody(statementsToString(aScenario.getStatements()));
			if (!aScenario.getTags().isEmpty()) {
				for (Tag a : aScenario.getTags()) {
					ParameterFactory.getParameter(anInteraction, a.getName().replace("@", ""), "", "in");
				}
			}
			convertToInteractionMessages(anInteraction, aScenario.getSteps());
		}
	}

	@Override
	protected void convertToInteractionMessages(Interaction anInteraction, Collection<?> steps) throws Exception {

		for (Object o : steps) {

			Step cs = (Step) o;
			String messageName = cs.getName().replaceFirst("(Given|When|Then|And|But|\\*) ", "");
			if (Layer1Validator.validateStepText(messageName).isEmpty()) {

				if (Layer1Validator.isInputStart(messageName)) {
					convertToMessage(anInteraction, cs);
				} else if (Layer1Validator.isOutputStart(messageName)) {
					// TODO if this a verify comma, then get the object name and set
					// the current state
					String objectType = Utilities.regexFind(OutputStepValidator.getRegex(), messageName, 2).trim();
					if (objectType != null && (objectType.contains("screen") || objectType.contains("page"))) {
						setCurrentMachineAndState(messageName);
					}
					convertToMessage(anInteraction, cs);
				} else if (Layer1Validator.isTransitionStart(messageName)) {
					if (Utilities.regexFind(TransitionStepValidator.getRegex(), messageName, 1).startsWith("Submit")) {
						setCurrentMachineAndState(messageName);
					}
					convertToMessage(anInteraction, cs);
					setCurrentMachineAndState(messageName);
				} else if (Layer1Validator.isInitialStart(messageName)) {
					setCurrentMachineAndState(messageName);
					convertToMessage(anInteraction, cs);
				} else if (Layer1Validator.isFinalStart(messageName)) {
					setCurrentMachineAndState(messageName);
					convertToMessage(anInteraction, cs);
					setCurrentMachineAndState(messageName);
				}

			} else {
				throw new Exception("Step (" + cs.getName() + ") is not valid, use Xtext editor to correct it first. ");
			}
		}
	}

	@Override
	protected void convertToMessage(Interaction anInteraction, Object o) {
		Step cs = (Step) o;
		String messageName = cs.getName().replaceFirst("(Given|When|Then|And|But|\\*) ", "");
		Class owningClass = (Class) anInteraction.getOwner();

		// TODO search through all the files and remove the file name changing logic
		// from filterClassName
		String currentApplicationObjectName = "";
		currentApplicationObjectName = UMLNameTranslator.filterClassName(getMachineName() + getCurrentState() + "Steps",
				false);
		currentApplicationObjectName = "pst::" + Project.secondLayerPackageName + "::" + getMachineName()
				+ "::" + currentApplicationObjectName;

		Class importedClass = ClassFactory.getClassByMessage(theSystem, messageName, currentApplicationObjectName);
		ElementImport classImport = ElementImportFactory.getElementImportByAlias(owningClass, importedClass.getName());
		if (classImport == null) {
			classImport = ElementImportFactory.getElementImport(owningClass, currentApplicationObjectName);
		}
		Message theMessage = MessageFactory.getMessage(anInteraction, importedClass, messageName);

		if (cs.getTheStepTable() != null) {
			// Create where string to hijack the getMessageParameters method
			messageName = "where";
			// loop through header columns and create where clause
			String[][] dataTable = getDataTableData(cs.getTheStepTable().getRows());
			for (int i = 0; i < dataTable[0].length; i++) {
				messageName += ", " + dataTable[0][i] + " is " + String.valueOf(i);
			}
			messageName = messageName.replace("where, ", "where ");
		}

		for (String s : getMessageParameters(messageName)) {
			ArgumentFactory.getArgument(theMessage, s.split(" is ")[0], s.split(" is ")[1]);
		}
	}

	@Override
	protected String convertClassQualifiedNameToPath(String qualifiedName) {
		String pathName = qualifiedName;
		pathName = pathName.replace("pst::interactions::", "");
		pathName = pathName.replace("::", File.separator);
		pathName = CucumberProject.getFirstLayerDir().getAbsolutePath() + pathName;
		pathName = pathName + ".feature";
		return pathName;
	}

	@Override
	protected String convertPathToClassQualifiedName(String pathName) {
		String qualifiedName = pathName.trim();
		qualifiedName = qualifiedName.replace(".feature", "");
		qualifiedName = qualifiedName.replace(CucumberProject.getFirstLayerDir().getAbsolutePath(), "");
		qualifiedName = qualifiedName.replace(File.separator, "::");
		qualifiedName = "pst::interactions" + qualifiedName;
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

	private String[][] getDataTableData(EList<Row> eList) {
		int rowsCount = eList.size();
		int colsCount = eList.get(0).getCells().size();
		// First convert the ArrayList to an array
		String[][] dataTable = new String[rowsCount][colsCount];
		for (int i = 0; i < rowsCount; i++) {
			for (int j = 0; j < colsCount; j++) {
				dataTable[i][j] = eList.get(i).getCells().get(j + 1).getName().trim();
			}
		}
		return dataTable;
	}
}

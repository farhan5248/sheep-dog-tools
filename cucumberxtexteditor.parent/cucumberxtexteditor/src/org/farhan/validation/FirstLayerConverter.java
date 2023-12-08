package org.farhan.validation;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.Model;
import org.farhan.cucumber.AbstractScenario;
import org.farhan.cucumber.Background;
import org.farhan.cucumber.Examples;
import org.farhan.cucumber.Feature;
import org.farhan.cucumber.Row;
import org.farhan.cucumber.Scenario;
import org.farhan.cucumber.ScenarioOutline;
import org.farhan.cucumber.Statement;
import org.farhan.cucumber.Step;
import org.farhan.cucumber.Tag;
import org.farhan.cucumber.impl.ScenarioImpl;
import org.farhan.validation.uml.ArgumentFactory;
import org.farhan.validation.uml.ClassFactory;
import org.farhan.validation.uml.CommentFactory;
import org.farhan.validation.uml.ElementImportFactory;
import org.farhan.validation.uml.InteractionFactory;
import org.farhan.validation.uml.MessageFactory;
import org.farhan.validation.uml.ParameterFactory;
import org.farhan.validation.uml.UMLStuffDoer;

public class FirstLayerConverter extends LayerConverter {

	private FeatureFile aCucumberFile;

	private StateMachine theMachine;

	public FirstLayerConverter() {
		super();
		theMachine = new StateMachine();
	}

	public FirstLayerConverter(Model theSystem) {
		super();
		this.theSystem = theSystem;
	}

	private class StateMachine {
		String currentState;
		String machineName;
	}

	@Override
	protected File getLayerDir() {
		return UMLStuffDoer.getFirstLayerDir();
	}

	@Override
	protected String getLayerFileType() {
		return ".feature";
	}

	@Override
	public final ArrayList<File> selectLayerFiles(String fileOrTagName) {
		// I need to know the currently selected .feature file.
		// This is to identify it's fully qualified name to place it in the UML model.
		// Even if this is the only file right now, when Maven runs this code there will
		// be more files all having the same tags
		ArrayList<File> files = new ArrayList<File>();
		files.add(new File(fileOrTagName));
		return files;
	}

	@Override
	protected Class convertToClass(File theFile) throws Exception {

		aCucumberFile = new FeatureFile(theFile);
		aCucumberFile.readFile();
		String qualifiedName = convertPathToClassQualifiedName(theFile.getAbsolutePath());
		Class layerClass = ClassFactory.getClass(theSystem, qualifiedName);
		CommentFactory.getComment(layerClass, convertStatementsToString(aCucumberFile.theFeature.getStatements()));
		return layerClass;
	}

	@Override
	protected void convertToImports(Class layerClass) throws Exception {
	}

	@Override
	protected void convertToAttributes(Class layerClass) throws Exception {
	}

	@Override
	protected void convertToBehaviours(Class layerClass) throws Exception {
		ArrayList<Scenario> expandedScenarios = expandScenarios(aCucumberFile.theFeature.getAbstractScenarios());

		for (Scenario aScenario : expandedScenarios) {

			resetCurrentApplicationObject();
			Interaction anInteraction = InteractionFactory.getInteraction(layerClass, aScenario.getName(), true);
			anInteraction.setName(anInteraction.getName());
			anInteraction.createOwnedComment().setBody(convertStatementsToString(aScenario.getStatements()));
			for (Tag t : aScenario.getTags()) {
				ParameterFactory.getParameter(anInteraction, t.getName(), "", "in");
			}
			convertToInteractionMessages(anInteraction, aScenario.getSteps());
		}
	}

	@Override
	protected void convertToInteractionMessages(Interaction anInteraction, Collection<?> steps) throws Exception {

		for (Object o : steps) {

			Step cs = (Step) o;
			String messageName = cs.getName();
			if (Layer1Validator.validateStepText(messageName).isEmpty()) {

				if (Layer1Validator.isInputStart(messageName)) {
					convertToMessage(anInteraction, cs);
				} else if (Layer1Validator.isOutputStart(messageName)) {
					String objectType = Utilities.regexFind(Layer1Validator.getRegex(), messageName, 2).trim();
					if (objectType != null && (objectType.contains("screen") || objectType.contains("page"))) {
						setCurrentMachineAndState(messageName);
					}
					convertToMessage(anInteraction, cs);
				} else if (Layer1Validator.isTransitionStart(messageName)) {
					if (Utilities.regexFind(Layer1Validator.getRegex(), messageName, 1).startsWith("Submit")) {
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
		String messageName = cs.getName();
		Class owningClass = (Class) anInteraction.getOwner();

		String currentApplicationObjectName = "";
		currentApplicationObjectName = filterClassName(getMachineName() + getCurrentState() + "Steps", false);
		currentApplicationObjectName = "pst::Logical::" + UMLStuffDoer.secondLayerPackageName + "::" + getMachineName()
				+ "::" + currentApplicationObjectName;

		Class importedClass = ClassFactory.getClassByMessage(theSystem, messageName, currentApplicationObjectName);
		ElementImport classImport = ElementImportFactory.getElementImportByAlias(owningClass, importedClass.getName());
		if (classImport == null) {
			classImport = ElementImportFactory.getElementImport(owningClass, currentApplicationObjectName);
		}
		Message theMessage = MessageFactory.getMessage(anInteraction, importedClass, messageName);

		if (cs.getTheStepTable() != null) {
			messageName = "where";
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
	protected String convertClassQualifiedNameToImport(String qualifiedName) {
		return "";
	}

	@Override
	protected String convertClassQualifiedNameToPath(String qualifiedName) {
		String pathName = qualifiedName;
		pathName = pathName.replace("pst::Logical::", "");
		pathName = pathName.replace("::", File.separator);
		pathName = UMLStuffDoer.getFirstLayerDir().getAbsolutePath() + pathName;
		pathName = pathName + ".feature";
		return pathName;
	}

	@Override
	protected String convertImportToClassQualifiedName(String path) {
		return null;
	}

	@Override
	protected String convertPathToClassQualifiedName(String pathName) {
		String qualifiedName = pathName.trim();
		qualifiedName = qualifiedName.replace(".feature", "");
		qualifiedName = qualifiedName.replace(UMLStuffDoer.getFirstLayerDir().getAbsolutePath(), "");
		qualifiedName = qualifiedName.replace(File.separator, "::");
		qualifiedName = "pst::Logical" + qualifiedName;
		return qualifiedName;
	}

	private Scenario applyAllExamples(AbstractScenario s, Examples examples, Examples examples2) {
		// TODO figure out how to create a new object like a scenario or just expand it after converting to UML
		/*Scenario newScenario = new ScenarioImpl();
		newScenario.tags = s.tags;
		newScenario.title = applyOneExample(s.title, examples, examples2);
		newScenario.comments = applyOneExample(s.comments, examples, examples2);
		newScenario.description = applyOneExample(s.description, examples, examples2);
		for (Step cs : s.steps) {
			Step newCs = new Step();
			newCs.title = applyOneExample(cs.title, examples, examples2);
			for (String sd : cs.data) {
				newCs.data.add(applyOneExample(sd, examples, examples2));
			}
			newScenario.steps.add(newCs);
		}
		return newScenario;*/
		return null;
	}

	private static String applyOneExample(String currentText, String headers, String values) {

		if (headers == null || values == null) {
			return currentText;
		}
		String[] headerList = headers.split("\\|");
		String[] valuesList = values.split("\\|");
		String newText = currentText;
		for (int i = 1; i < headerList.length; i++) {
			newText = newText.replace("<" + headerList[i].trim() + ">", valuesList[i].trim());
		}
		return newText;
	}

	private void appendBackground(AbstractScenario s) {

		AbstractScenario b = aCucumberFile.theFeature.getAbstractScenarios().get(0);
		if (b instanceof Background) {
			s.getSteps().addAll(0, b.getSteps());
		}
	}

	private ArrayList<Scenario> expandScenarios(EList<AbstractScenario> eList) {
		ArrayList<Scenario> expandedScenarios = new ArrayList<Scenario>();
		for (AbstractScenario s : aCucumberFile.theFeature.getAbstractScenarios()) {

			if (isScenarioSelected(s)) {
				if (!(s instanceof Background)) {
					// TODO can't append to the scenarios since it might modify the file?
					// appendBackground(s);
					if (s instanceof ScenarioOutline) {
						// if it's an outline then loop through the examples
						EList<Examples> examples = ((ScenarioOutline) s).getExamples();
						for (int i = 1; i < examples.size(); i++) {
							Scenario newScenario = applyAllExamples(s, examples.get(0), examples.get(i));
							expandedScenarios.add(newScenario);
						}
					} else {
						expandedScenarios.add((Scenario) s);
					}
				}
			}
		}
		return expandedScenarios;
	}

	private String[][] getDataTableData(EList<Row> eList) {
		int rowsCount = eList.size();
		int colsCount = eList.get(0).getCells().size();
		String[][] dataTable = new String[rowsCount][colsCount];
		for (int i = 0; i < rowsCount; i++) {
			for (int j = 0; j < colsCount; j++) {
				dataTable[i][j] = eList.get(i).getCells().get(j + 1).getName();
			}
		}
		return dataTable;
	}

	private static String filterClassName(String currentClassName, boolean keepUnderscore) {
		if (currentClassName == null) {
			return "";
		}
		if (currentClassName.startsWith("Common")) {
			return currentClassName;
		}
		String newClassName = currentClassName;
		newClassName = newClassName.replaceAll("(?i) - As of ((?!page|pop-up).)*", "");
		newClassName = newClassName.replace("page", "Page");
		newClassName = newClassName.replace("-", "");
		if (!keepUnderscore) {
			newClassName = newClassName.replace("_", "");
		}
		newClassName = newClassName.replace(" ", "");
		newClassName = newClassName.replace("'", "");
		newClassName = newClassName.replace("#", "");

		return newClassName;
	}

	public String getMachineName() {
		return theMachine.machineName;
	}

	private String getCurrentState() {
		return theMachine.currentState;
	}

	private String[] getMessageParameters(String messageName) {
		String[] splitTestStepName = messageName.split("where", 2);
		String[] csvlistArray = {};
		if (splitTestStepName.length > 1) {
			csvlistArray = splitTestStepName[1].split(",");
			// This is to handle multiple variable names like two ${p}
			for (int i = 0; i < csvlistArray.length; i++) {
				// TODO this delimiter might break for the use of the word is between double
				// quotes
				String attributeName = csvlistArray[i].trim().split(" is ")[0];
				String valueName = csvlistArray[i].trim().split(" is ")[1];
				csvlistArray[i] = attributeName + " is " + valueName;
			}
			return csvlistArray;
		} else {
			return csvlistArray;
		}
	}

	private boolean isScenarioSelected(AbstractScenario s) {
		// TODO check if this is invoked by Eclipse or by Maven
		return true;
	}

	private void resetCurrentApplicationObject() {
		setMachineName("UnknownApplication");
		setCurrentState("Home Page");
	}

	private void setCurrentMachineAndState(String messageName) {
		String appType = "";
		String appName = getMachineName();
		String objectName = getCurrentState();

		if (Layer1Validator.isInputStart(messageName)) {
		} else if (Layer1Validator.isOutputStart(messageName)) {
			objectName = Utilities.regexFind(Layer1Validator.getRegex(), messageName, 4);
			if (objectName == null) {
				objectName = Utilities.regexFind(Layer1Validator.getRegex(), messageName, 9);
			}
			if (objectName != null) {
				setCurrentState(objectName.trim());
			}
		} else if (Layer1Validator.isTransitionStart(messageName)) {
			objectName = Layer1Validator.getStepObjectName(messageName) + " "
					+ Layer1Validator.getStepObjectType(messageName);
			setCurrentState(objectName);
		} else if (Layer1Validator.isInitialStart(messageName) || Layer1Validator.isFinalStart(messageName)) {
			if (Layer1Validator.isFinalStart(messageName)) {
				// TODO make a Layer1Validator or something api for this. These group numbers
				// should not be known outside the api
				appType = Utilities.regexFind(Layer1Validator.getRegex(), messageName, 3).trim();
				appName = Utilities.regexFind(Layer1Validator.getRegex(), messageName, 2).trim();
			} else {
				appType = Utilities.regexFind(Layer1Validator.getRegex(), messageName, 3).trim();
				appName = Utilities.regexFind(Layer1Validator.getRegex(), messageName, 2).trim();
			}
			setMachineName(appName);
			if (appType.contentEquals("service")) {
				setCurrentState("Authenticated State");
			} else {
				setCurrentState("Home Directory");
			}
		}

	}

	private void setCurrentState(String currentState) {
		theMachine.currentState = Utilities.toUpperCamelCase(currentState);
		if (theMachine.currentState.endsWith("Request")) {
			theMachine.currentState = theMachine.currentState.replace("Request", "Service");
		}
	}

	private void setMachineName(String machineName) {
		theMachine.machineName = Utilities.toUpperCamelCase(machineName);
	}

	private String convertStatementsToString(EList<Statement> eList) {
		String comment = "";
		for (Statement s : aCucumberFile.theFeature.getStatements()) {
			comment += s.getName();
		}
		return comment;
	}

}

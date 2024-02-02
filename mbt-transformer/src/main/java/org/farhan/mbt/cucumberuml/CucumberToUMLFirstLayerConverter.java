package org.farhan.mbt.cucumberuml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.ValueSpecification;
import org.farhan.cucumber.AbstractScenario;
import org.farhan.cucumber.Background;
import org.farhan.cucumber.Examples;
import org.farhan.cucumber.Line;
import org.farhan.cucumber.Row;
import org.farhan.cucumber.Scenario;
import org.farhan.cucumber.ScenarioOutline;
import org.farhan.cucumber.Statement;
import org.farhan.cucumber.Step;
import org.farhan.cucumber.Tag;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.Project;
import org.farhan.mbt.core.ToUMLFirstLayerConverter;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.core.Validator;
import org.farhan.mbt.cucumber.CucumberFeatureFile;
import org.farhan.mbt.cucumber.CucumberProject;
import org.farhan.mbt.uml.AnnotationFactory;
import org.farhan.mbt.uml.ArgumentFactory;
import org.farhan.mbt.uml.ClassFactory;
import org.farhan.mbt.uml.CommentFactory;
import org.farhan.mbt.uml.ElementImportFactory;
import org.farhan.mbt.uml.InteractionFactory;
import org.farhan.mbt.uml.MessageFactory;
import org.farhan.mbt.uml.ParameterFactory;
import org.farhan.mbt.uml.UMLNameConverter;
import org.farhan.mbt.uml.UMLProject;

public class CucumberToUMLFirstLayerConverter extends ToUMLFirstLayerConverter {

	private CucumberFeatureFile aCucumberFile;
	private String layer;
	
	public CucumberToUMLFirstLayerConverter(String layer) {
		this.layer = layer;
	}

	@Override
	protected String getLayer() {
		return layer;
	}
	
	
	@Override
	protected void convertObjects() throws Exception {
		super.convertObjects();
		linkLayerFiles(getLayer());
	}

	@Override
	protected void selectLayerFiles() throws Exception {

		ArrayList<ConvertibleObject> layerFiles = CucumberProject.getLayerFiles(getLayer());
		for (int i = layerFiles.size() - 1; i >= 0; i--) {
			if (!isFileSelected(layerFiles.get(i), Project.tags)) {
				// TODO replace this with a logger
				System.out.println("Removing from first layer:" + layerFiles.get(i).getFile().getAbsolutePath());
				layerFiles.remove(i);
			}
		}
	}

	@Override
	protected ArrayList<ConvertibleObject> getLayerFiles(String layer) {
		return CucumberProject.getLayerFiles(layer);
	}

	@Override
	protected Class convertObject(ConvertibleObject theObject) throws Exception {

		// TODO source and target files should be stored in this class, there's no need
		// to pass them around.
		aCucumberFile = (CucumberFeatureFile) theObject;
		String qualifiedName = convertAbsolutePathToQualifiedName(aCucumberFile.getFile().getAbsolutePath());
		Class layerClass = ClassFactory.getClass(UMLProject.theSystem, qualifiedName);
		CommentFactory.getComment(layerClass, convertStatementsToString(aCucumberFile.theFeature.getStatements()));
		return layerClass;
	}

	@Override
	protected void convertToImports(Class layerClass) throws Exception {
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
			Interaction anInteraction = createInteraction(layerClass, as);
			if (as instanceof Scenario) {
				Scenario s = (Scenario) as;
				convertTagsToParameters(anInteraction, s.getTags());
			}
			// TODO apply example data to step data table
			if (as instanceof ScenarioOutline) {
				ScenarioOutline so = (ScenarioOutline) as;
				convertTagsToParameters(anInteraction, so.getTags());
				convertExamplesToAnnotations(anInteraction, so);
			}
			// If there is a background, add its steps first
			if (b != null) {
				convertToInteractionMessages(anInteraction, b.getSteps());
			}
			convertToInteractionMessages(anInteraction, as.getSteps());
		}
	}

	@Override
	protected void convertToInteractionMessages(Interaction anInteraction, List<?> steps) throws Exception {
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
		Step s = (Step) o;
		Message theMessage = convertStepToMessage(anInteraction, s);
		convertDataTableToArgument(s, theMessage);
		convertDocStringToArgument(s, theMessage);
	}

	@Override
	protected String convertQualifiedNameToAbsolutePath(String qualifiedName) {
		String pathName = qualifiedName;
		pathName = pathName.replace("pst::specs::", "");
		pathName = pathName.replace("::", File.separator);
		pathName = CucumberProject.getLayerDir(CucumberProject.firstLayerPackageName).getAbsolutePath() + pathName;
		pathName = pathName + ".feature";
		return pathName;
	}

	@Override
	protected String convertAbsolutePathToQualifiedName(String pathName) {
		String qualifiedName = pathName.trim();
		qualifiedName = qualifiedName.replace(".feature", "");
		qualifiedName = qualifiedName
				.replace(CucumberProject.getLayerDir(CucumberProject.firstLayerPackageName).getAbsolutePath(), "");
		qualifiedName = qualifiedName.replace(File.separator, "::");
		qualifiedName = "pst::specs" + qualifiedName;
		return qualifiedName;
	}

	@Override
	protected String convertQualifiedNameToImportName(String qualifiedName) {
		// first layer files have no explicit imports
		return "";
	}

	@Override
	protected String convertImportNameToQualifiedName(String path) {
		// first layer files have no explicit imports
		return null;
	}

	private void convertDocStringToArgument(Step s, Message theMessage) {
		if (s.getTheDocString() != null) {
			ValueSpecification vs = ArgumentFactory.getArgument(theMessage, "docString", "", true);
			EList<Line> lines = s.getTheDocString().getLines();
			for (int i = 0; i < lines.size(); i++) {
				AnnotationFactory.getAnnotation(vs, "docString", String.valueOf(i), lines.get(i).getName());
			}
		}
	}

	private void convertDataTableToArgument(Step s, Message theMessage) {
		if (s.getTheStepTable() != null) {
			ValueSpecification vs = ArgumentFactory.getArgument(theMessage, "dataTable", "", true);
			EList<Row> rows = s.getTheStepTable().getRows();
			for (int i = 0; i < rows.size(); i++) {

				String value = "";
				for (int j = 0; j < rows.get(i).getCells().size(); j++) {
					value += rows.get(i).getCells().get(j).getName() + " |";
				}
				AnnotationFactory.getAnnotation(vs, "dataTable", String.valueOf(i), value);
			}
		}
	}

	private Message convertStepToMessage(Interaction anInteraction, Step cs) {
		String messageName = cs.getName();
		Class owningClass = (Class) anInteraction.getOwner();
		String secondLayerClassName = getSecondLayerClassName();
		Class importedClass = ClassFactory.getClassByMessage(UMLProject.theSystem, messageName, secondLayerClassName);
		ElementImport classImport = ElementImportFactory.getElementImportByAlias(owningClass, importedClass.getName());
		if (classImport == null) {
			classImport = ElementImportFactory.getElementImport(owningClass, secondLayerClassName);
		}
		Message theMessage = MessageFactory.getMessage(anInteraction, importedClass, messageName);
		return theMessage;
	}

	private String getSecondLayerClassName() {
		String secondLayerClassName = "";
		secondLayerClassName = UMLNameConverter.filterClassName(getFSMName() + getFSMState() + "Steps");
		secondLayerClassName = "pst::" + Project.secondLayerPackageName + "::"
				+ Utilities.toLowerCamelCase(getFSMName()) + "::" + secondLayerClassName;
		return secondLayerClassName;
	}

	private boolean isFileSelected(ConvertibleObject convertibleFile, String layerSelectionCriteria) throws Exception {

		aCucumberFile = (CucumberFeatureFile) convertibleFile;
		if (isTagged(aCucumberFile.theFeature.getTags(), layerSelectionCriteria)) {
			return true;
		}
		for (AbstractScenario a : aCucumberFile.theFeature.getAbstractScenarios()) {
			if (a instanceof Scenario) {
				if (isTagged(((Scenario) a).getTags(), layerSelectionCriteria)) {
					return true;
				}
			} else if (a instanceof ScenarioOutline) {
				if (isTagged(((ScenarioOutline) a).getTags(), layerSelectionCriteria)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean isTagged(EList<Tag> tags, String layerSelectionCriteria) {
		for (Tag t : tags) {
			if (t.getName().trim().contentEquals(layerSelectionCriteria)) {
				return true;
			}
		}
		return false;
	}

	private void convertExamplesToAnnotations(Interaction anInteraction, ScenarioOutline so) {
		for (Examples e : so.getExamples()) {
			EList<Row> rows = e.getTheExamplesTable().getRows();
			for (int i = 0; i < rows.size(); i++) {

				String value = "";
				for (int j = 0; j < rows.get(i).getCells().size(); j++) {
					value += rows.get(i).getCells().get(j).getName() + "|";
				}
				AnnotationFactory.getAnnotation(anInteraction, e.getName(), String.valueOf(i), value);
			}
		}
	}

	private void convertTagsToParameters(Interaction anInteraction, EList<Tag> tags) {
		for (Tag a : tags) {
			ParameterFactory.getParameter(anInteraction, a.getName().replace("@", ""), "", "in");
		}
	}

	private Interaction createInteraction(Class layerClass, AbstractScenario as) {
		Interaction anInteraction = InteractionFactory.getInteraction(layerClass, as.getName(), true);
		anInteraction.setName(anInteraction.getName());
		anInteraction.createOwnedComment().setBody(convertStatementsToString(as.getStatements()));
		return anInteraction;
	}

	private String convertStatementsToString(EList<Statement> eList) {
		String contents = "";
		for (Statement s : eList) {
			contents += s.getName() + "\n";
		}
		return contents.trim();
	}
}

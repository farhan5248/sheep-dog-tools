package org.farhan.mbt.conv.cucumber;

import java.io.File;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.Model;
import org.farhan.conv.core.FirstLayerConverter;
import org.farhan.conv.core.Project;
import org.farhan.conv.validation.Layer1Validator;
import org.farhan.cucumber.AbstractScenario;
import org.farhan.cucumber.Background;
import org.farhan.cucumber.Examples;
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

		aCucumberFile = new CucumberFeatureFile(theFile);
		aCucumberFile.readFile();
		// TODO use convertPathToQualifiedName
		String qualifiedName = convertPathToClassQualifiedName(theFile.getAbsolutePath());
		Class layerClass = ClassFactory.getClass(theSystem, qualifiedName);
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
					EAnnotation a = anInteraction.createEAnnotation(e.getName());
					EList<Row> rows = e.getTheExamplesTable().getRows();
					for (int i = 0; i < rows.size(); i++) {

						EMap<String, String> m = a.getDetails();
						String key = String.valueOf(i);
						String value = "";
						for (int j = 0; j < rows.get(i).getCells().size(); j++) {
							value += rows.get(i).getCells().get(j).getName() + "|";
						}
						m.put(key, value);
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
			if (Layer1Validator.validateStepText(messageName)) {
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

		Class importedClass = ClassFactory.getClassByMessage(theSystem, messageName, secondLayerClassName);
		ElementImport classImport = ElementImportFactory.getElementImportByAlias(owningClass, importedClass.getName());
		if (classImport == null) {
			classImport = ElementImportFactory.getElementImport(owningClass, secondLayerClassName);
		}
		Message theMessage = MessageFactory.getMessage(anInteraction, importedClass, messageName);

		// Add the data as annotations for now until I can use a loop in UML. The data
		// is needed for round trip engineering to the Asciidoc files/graph model
		if (cs.getTheStepTable() != null) {
			ArgumentFactory.getArgument(theMessage, "dataTable");
			EAnnotation a = theMessage.createEAnnotation("dataTable");
			EList<Row> rows = cs.getTheStepTable().getRows();
			for (int i = 0; i < rows.size(); i++) {

				EMap<String, String> m = a.getDetails();
				String key = String.valueOf(i);
				String value = "";
				for (int j = 0; j < rows.get(i).getCells().size(); j++) {
					value += rows.get(i).getCells().get(j).getName() + " |";
				}
				m.put(key, value);
			}
		}
		if (cs.getTheDocString() != null) {
			ArgumentFactory.getArgument(theMessage, "docString");
			EAnnotation a = theMessage.createEAnnotation("docString");
			EList<Statement> lines = cs.getTheDocString().getStatements();

			for (int i = 0; i < lines.size(); i++) {
				EMap<String, String> m = a.getDetails();
				String key = String.valueOf(i);
				String value = lines.get(i).getName();
				m.put(key, value);
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
	protected String convertPathToClassQualifiedName(String pathName) {
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

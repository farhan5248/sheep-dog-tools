package org.farhan.mbt.uml;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Column;
import org.asciidoctor.ast.Row;
import org.asciidoctor.ast.Section;
import org.asciidoctor.ast.Table;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.ValueSpecification;
import org.farhan.mbt.core.ConvertibleObject;

public class UMLClassWrapper implements ConvertibleObject {

	private static boolean isNotLoaded;
	// TODO these are probably needed until the System is moved in this class and
	// eventually removed when each class has its own file
	private UMLProject parentProject;

	private Class theClass;
	private File theFile;

	public UMLClassWrapper(UMLProject umlProject, Class theClass) {
		this.theClass = theClass;
		theFile = umlProject.getDir("");
		isNotLoaded = true;
	}

	public void addBackground(Interaction background) {
		// TODO maybe this isn't needed, review why it's needed for adoc and graph files
	}

	public void addScenario(Interaction scenario) {
		// TODO maybe this isn't needed, review why it's needed for adoc and graph files
	}

	public void addScenarioOutline(Interaction scenarioOutline) {
		// TODO maybe this isn't needed, review why it's needed for adoc and graph files

	}

	private EAnnotation createAnnotation(Class className, String name, String key) {
		EAnnotation a = className.getEAnnotation(name);
		if (a == null) {
			a = className.createEAnnotation(name);
		}
		if (!key.isEmpty()) {
			a.getDetails().put(key, "");
		}
		return a;
	}

	private EAnnotation createAnnotation(Interaction anInteraction, String name) {
		EAnnotation a = anInteraction.getEAnnotation(name);
		if (a == null) {
			a = anInteraction.createEAnnotation(name);
		}
		return a;
	}

	private EAnnotation createAnnotation(Message aMessage, String name, String key, String value) {
		EAnnotation a = aMessage.getEAnnotation(name);
		if (a == null) {
			a = aMessage.createEAnnotation(name);
		}
		a.getDetails().put(key, value);
		return a;
	}

	private EAnnotation createAnnotation(ValueSpecification vs, String name, String key, String value) {
		EAnnotation a = vs.getEAnnotation(name);
		if (a == null) {
			a = vs.createEAnnotation(name);
		}
		a.getDetails().put(key, value);
		return a;
	}

	private ValueSpecification createArgument(Message aMessage, String name, String value) {
		LiteralString ls = (LiteralString) aMessage.getArgument(name, null);
		if (ls == null) {
			ls = UMLFactory.eINSTANCE.createLiteralString();
			ls = (LiteralString) aMessage.createArgument(name, null, ls.eClass());
			ls.setName(name);
			ls.setValue(value);
		}
		return ls;
	}

	public Interaction createBackground() {
		Interaction scenario = createInteraction(theClass, "", "");
		createAnnotation(scenario, "background");
		return scenario;
	}

	public void createDataTable(Message step, ArrayList<ArrayList<String>> dataTableRowList) {
		ValueSpecification table = createArgument(step, "dataTable", "");
		// header
		String row = "";
		for (int i = 0; i < dataTableRowList.get(0).size(); i++) {
			row += dataTableRowList.get(0).get(i) + " |";
		}
		createAnnotation(table, "dataTable", String.valueOf(0), row);
		// body
		for (int i = 1; i < dataTableRowList.size(); i++) {
			row = "";
			ArrayList<String> bodyRow = dataTableRowList.get(i);
			for (int j = 0; j < bodyRow.size(); j++) {
				row += dataTableRowList.get(i).get(j) + " |";
			}
			createAnnotation(table, "dataTable", String.valueOf(i), row);
		}
	}

	public void createDocString(Message step, String content) {
		ValueSpecification vs = createArgument(step, "docString", "");
		String[] lines = content.split("\n");
		for (int i = 0; i < lines.length; i++) {
			createAnnotation(vs, "docString", String.valueOf(i), lines[i]);
		}
	}

	private Interaction createInteraction(Class theClass, String interactionName, String annotationName) {
		Interaction anInteraction = (Interaction) theClass.getOwnedBehavior(interactionName);
		if (anInteraction == null) {
			anInteraction = UMLFactory.eINSTANCE.createInteraction();
			anInteraction.setName(interactionName);
			theClass.setClassifierBehavior(anInteraction);
		}
		if (!annotationName.isEmpty()) {
			createAnnotation(anInteraction, annotationName);
		}
		return anInteraction;
	}

	private Parameter createParameter(Interaction anInteraction, String paramName, String defaultValue,
			String direction) {
		Parameter aParameter = anInteraction.getOwnedParameter(paramName, null);
		if (aParameter == null) {
			aParameter = anInteraction.createOwnedParameter(paramName, null);
			aParameter.setDefault(defaultValue);
			aParameter.setDirection(ParameterDirectionKind.getByName(direction));
		}
		return aParameter;
	}

	public Interaction createScenario() {
		Interaction scenario = createInteraction(theClass, "", "");
		return scenario;
	}

	public Interaction createScenarioOutline() {
		Interaction scenario = createInteraction(theClass, "", "");
		return scenario;
	}

	public Message createStep(Interaction abstractScenario, String stepName) {
		String keyword = stepName.split(" ")[0];
		Message step = abstractScenario.createMessage(stepName.replaceFirst(keyword + " ", ""));
		createAnnotation(step, "Step", "Keyword", keyword);
		return step;
	}

	@Override
	public Object get() {
		return theClass;
	}

	@Override
	public File getFile() {
		return theFile;
	}

	public String getStepName(Message step) {
		return step.getName();
	}

	@Override
	public void load() throws Exception {

		// Only read the model file if it hasn't been loaded before. This will change
		// when each class has its own model file
		if (isNotLoaded) {
			parentProject.load();
		}
	}

	@Override
	public void save() throws Exception {
		// TODO This will be implemented once I put each UML class in its own .uml file
	}

	public void setBackgroundDescription(Interaction background, String backgroundDescription) {
		background.createOwnedComment().setBody(backgroundDescription);
	}

	public void setBackgroundName(Interaction background, String backgroundName) {
		background.setName(backgroundName);
	}

	public void setFeatureDescription(String featureDescription) {
		theClass.createOwnedComment().setBody(featureDescription);

	}

	public void setFeatureName(String featureName) {
		createAnnotation(theClass, "title", featureName);
	}

	public void setFeatureTags(String featureTags) {
		for (String t : featureTags.split(",")) {
			createAnnotation(theClass, "tags", t);
		}
	}

	@Override
	public void setFile(File theFile) {
		this.theFile = theFile;
	}

	public void setScenarioDescription(Interaction scenario, String scenarioDescription) {
		scenario.createOwnedComment().setBody(scenarioDescription);
	}

	public void setScenarioName(Interaction scenario, String scenarioName) {
		scenario.setName(scenarioName);
	}

	public void setScenarioOutlineDescription(Interaction scenarioOutline, String scenarioOutlineDescription) {
		scenarioOutline.createOwnedComment().setBody(scenarioOutlineDescription);
	}

	public void setScenarioOutlineName(Interaction scenarioOutline, String scenarioOutlineName) {
		scenarioOutline.setName(scenarioOutlineName);
	}

	public void setScenarioOutlineTags(Interaction scenarioOutline, String scenarioOutlineTags) {
		for (String t : scenarioOutlineTags.split(",")) {
			createParameter(scenarioOutline, t, "", "in");
		}
	}

	public void setScenarioTags(Interaction scenario, String scenarioTags) {
		for (String t : scenarioTags.split(",")) {
			createParameter(scenario, t, "", "in");
		}
	}

	public EAnnotation createExamples(Interaction scenarioOutline) {
		return createAnnotation(scenarioOutline, "");
	}

	protected EAnnotation createAnnotation(Interaction anInteraction, String name, String key, String value) {
		EAnnotation a = createAnnotation(anInteraction, name);
		a.getDetails().put(key, value);
		return a;
	}

	public void setExamplesName(EAnnotation examples, String examplesName) {
		examples.setSource(examplesName);
	}

	public void createExamplesTable(EAnnotation examples, String examplesRow) {
		String value = "";
		for (String e : examplesRow.split(",")) {
			value += e + "|";
		}
		examples.getDetails().put("0", value);
	}

	public void createExamplesRow(EAnnotation examples, HashMap<String, String> examplesRow) {
		String value = "";
		for (String e : examplesRow.keySet()) {
			value += examplesRow.get(e) + "|";
		}
		examples.getDetails().put(String.valueOf(examples.getDetails().size()), value);

	}
}

package org.farhan.mbt.core;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.ValueSpecification;

public class TestSuite implements ConvertibleObject {

	private Class theClass;
	private TestProject parent;
	private TestSetup testSetup;

	public TestSuite(String name, TestProject parent) {
		this.parent = parent;
		this.theClass = addClass(name);
	}

	private Class addClass(String qualifiedName) {
		Class theClass = null;
		Package owningPackage = parent.theModel;
		String[] qualifiedNameParts = qualifiedName.replace(parent.theModel.getQualifiedName() + "::", "").split("::");
		for (int i = 0; i < qualifiedNameParts.length; i++) {
			if (i == qualifiedNameParts.length - 1) {
				theClass = owningPackage.createOwnedClass(qualifiedNameParts[i], false);
			} else {
				// TODO should this instead be parent.addPackage otherwise there's duplication
				// between this and StepObject
				owningPackage = addPackage(owningPackage, qualifiedNameParts[i]);
			}
		}
		return theClass;
	}

	private Package addPackage(Package nestingPackage, String name) {
		Package thePackage = nestingPackage.getNestedPackage(name);
		if (thePackage == null) {
			thePackage = nestingPackage.createNestedPackage(name);
		}
		return thePackage;
	}

	private Interaction addAbstractScenario(Class theClass, String interactionName, String annotationName) {
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

	public TestSetup addBackground(String name) {
		testSetup = new TestSetup(name, this);
		return testSetup;
	}

	public EAnnotation addExamples(Interaction scenarioOutline, String name) {
		return createAnnotation(scenarioOutline, name);
	}

	public void addExamplesRow(EAnnotation examples, ArrayList<String> examplesRow) {
		String value = "";
		for (String e : examplesRow) {
			value += e + "|";
		}
		examples.getDetails().put(String.valueOf(examples.getDetails().size()), value);
	}

	public TestCase addScenario(String name) {
		
		TestCase testCase = new TestCase(name, this);
		return testCase;

	}

	public Interaction addScenarioOutline(String name) {
		Interaction scenario = addAbstractScenario(theClass, name, "");
		return scenario;
	}

	public Message addStep(Interaction abstractScenario, String stepName) {

		String keyword = stepName.split(" ")[0];
		Message step = abstractScenario.createMessage(stepName.substring(keyword.length() + 1));
		return step;
	}

	public Interaction addStepDefinition(String stepName) {
		Interaction stepDefinition = addAbstractScenario(theClass, stepName, "");
		// TODO make tests for this by doing adoc(unsorted) uml adoc (sorted)
		TreeMap<String, Interaction> sorted = new TreeMap<String, Interaction>();
		EList<Behavior> behaviors = theClass.getOwnedBehaviors();
		for (int i = behaviors.size(); i > 0; i--) {
			sorted.put(behaviors.get(i - 1).getName(), (Interaction) behaviors.get(i - 1));
			behaviors.removeLast();
		}
		for (String name : sorted.keySet()) {
			behaviors.add(sorted.get(name));
		}
		return stepDefinition;
	}

	public EAnnotation addStepParameters(Interaction stepDefinition, String name) {
		return createAnnotation(stepDefinition, name);
	}

	public void addStepParametersRow(EAnnotation stepParameters, ArrayList<String> stepParametersRow) {
		String value = "";
		for (String e : stepParametersRow) {
			value += e + "|";
		}
		stepParameters.getDetails().put(String.valueOf(stepParameters.getDetails().size()), value);
	}

	public void addStepParametersTable(EAnnotation stepParameters, ArrayList<String> headers) {
		String value = "";
		for (String e : headers) {
			value += e + "|";
		}
		stepParameters.getDetails().put("0", value);
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

	private EAnnotation createAnnotation(Interaction anInteraction, String name, String key, String value) {
		EAnnotation a = createAnnotation(anInteraction, name);
		a.getDetails().put(key, value);
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

	@Override
	public Object get() {
		// TODO remove override and change type to Class
		return theClass;
	}

	public ArrayList<Interaction> getAbstractScenarioList() {
		ArrayList<Interaction> abstractScenarioList = new ArrayList<Interaction>();
		for (Behavior b : theClass.getOwnedBehaviors()) {
			abstractScenarioList.add((Interaction) b);
		}
		return abstractScenarioList;
	}

	public String getBackgroundDescription(Interaction abstractScenario) {
		if (abstractScenario.getOwnedComments().size() > 0) {
			return abstractScenario.getOwnedComments().get(0).getBody();
		}
		return "";
	}

	public String getBackgroundName(Interaction abstractScenario) {
		return abstractScenario.getName();
	}

	public ArrayList<String> getFeatureTags(Interaction abstractScenario) {
		return getTags(abstractScenario);
	}

	public String getDocString(Message step) {
		ValueSpecification vs = (LiteralString) step.getArgument("docString", null);
		EMap<String, String> docString = vs.getEAnnotation("docString").getDetails();
		String content = "";
		for (int i = 0; i < docString.keySet().size(); i++) {
			content += "\n" + docString.get(i).getValue();
		}
		content = content.replaceFirst("\n", "");
		return content;
	}

	public ArrayList<EAnnotation> getExamplesList(Interaction abstractScenario) {
		ArrayList<EAnnotation> exampleList = new ArrayList<EAnnotation>();
		for (EAnnotation a : abstractScenario.getEAnnotations()) {
			if (!a.getSource().contentEquals("tags")) {
				exampleList.add(a);
			}
		}
		return exampleList;
	}

	public String getExamplesName(EAnnotation examples) {
		return examples.getSource();
	}

	public ArrayList<ArrayList<String>> getExamplesRowList(EAnnotation examples) {
		ArrayList<ArrayList<String>> examplesRowList = new ArrayList<ArrayList<String>>();
		int rowCnt = examples.getDetails().size();
		for (int i = 1; i < rowCnt; i++) {
			String[] row = examples.getDetails().get(i).getValue().split("\\|");
			ArrayList<String> cellList = new ArrayList<String>();
			int cellCnt = row.length;
			for (int j = 0; j < cellCnt; j++) {
				cellList.add(row[j]);
			}
			examplesRowList.add(cellList);
		}
		return examplesRowList;
	}

	public ArrayList<String> getExamplesTable(EAnnotation examples) {
		ArrayList<String> paramNames = new ArrayList<String>();
		for (String cell : examples.getDetails().getFirst().getValue().split("\\|")) {
			paramNames.add(cell);
		}
		return paramNames;
	}

	public String getFeatureDescription() {
		if (theClass.getOwnedComments().size() > 0) {
			return theClass.getOwnedComments().get(0).getBody();
		}
		return "";
	}

	public String getFeatureName() {
		return theClass.getName();
	}

	@Override
	public String getPath() {
		return theClass.getQualifiedName();
	}

	public String getScenarioDescription(Interaction abstractScenario) {
		if (abstractScenario.getOwnedComments().size() > 0) {
			return abstractScenario.getOwnedComments().get(0).getBody();
		}
		return "";
	}

	public String getScenarioName(Interaction abstractScenario) {
		return abstractScenario.getName();
	}

	public String getScenarioOutlineDescription(Interaction abstractScenario) {
		return getScenarioDescription(abstractScenario);
	}

	public String getScenarioOutlineName(Interaction abstractScenario) {
		return abstractScenario.getName();
	}

	public ArrayList<String> getScenarioOutlineTags(Interaction abstractScenario) {
		return getTags(abstractScenario);
	}

	public ArrayList<String> getScenarioTags(Interaction abstractScenario) {
		return getTags(abstractScenario);
	}

	public String getStepName(Message step) {
		return getStepKeyword(step) + " " + step.getName();
	}

	public String getStepDefinitionDescription(Interaction stepDefinition) {
		if (stepDefinition.getOwnedComments().size() > 0) {
			return stepDefinition.getOwnedComments().get(0).getBody();
		}
		return "";
	}

	public ArrayList<Interaction> getStepDefinitionList() {
		ArrayList<Interaction> steps = new ArrayList<Interaction>();
		for (Behavior b : theClass.getOwnedBehaviors()) {
			steps.add((Interaction) b);
		}
		return steps;
	}

	public String getStepDefinitionName(Interaction stepDef) {
		return stepDef.getName();
	}

	public String getStepDefinitionNameLong(Interaction stepDefinitionSrc) {
		return stepDefinitionSrc.getEAnnotation("StepDefinition").getDetails().get("LongName");
	}

	public ArrayList<EAnnotation> getStepParametersList(Interaction stepDefinition) {

		ArrayList<EAnnotation> parametersList = new ArrayList<EAnnotation>();
		for (EAnnotation a : stepDefinition.getEAnnotations()) {
			if (!a.getSource().contentEquals("StepDefinition")) {
				parametersList.add(a);
			}
		}
		return parametersList;
	}

	public ArrayList<Message> getStepList(Interaction abstractScenario) {
		ArrayList<Message> stepList = new ArrayList<Message>();
		for (Message m : abstractScenario.getMessages()) {
			stepList.add(m);
		}
		return stepList;
	}

	public String getStepNameLong(Message srcStep) {
		return srcStep.getEAnnotation("Step").getDetails().get("LongName");
	}

	public String getStepObjectDescription() {
		if (theClass.getOwnedComments().size() > 0) {
			return theClass.getOwnedComments().get(0).getBody();
		}
		return "";
	}

	public String getStepObjectName() {
		return theClass.getName();
	}

	public String getStepParametersName(EAnnotation parametersSrc) {
		return parametersSrc.getSource();
	}

	public ArrayList<ArrayList<String>> getStepParametersRowList(EAnnotation parametersSrc) {
		ArrayList<ArrayList<String>> rowList = new ArrayList<ArrayList<String>>();
		int rowCnt = parametersSrc.getDetails().size();
		for (int i = 1; i < rowCnt; i++) {
			String[] row = parametersSrc.getDetails().get(i).getValue().split("\\|");
			ArrayList<String> cellList = new ArrayList<String>();
			int cellCnt = row.length;
			for (int j = 0; j < cellCnt; j++) {
				cellList.add(row[j]);
			}
			rowList.add(cellList);
		}
		return rowList;
	}

	public ArrayList<String> getStepParametersTable(EAnnotation parametersSrc) {
		ArrayList<String> paramNames = new ArrayList<String>();
		for (String cell : parametersSrc.getDetails().getFirst().getValue().split("\\|")) {
			paramNames.add(cell);
		}
		return paramNames;
	}

	public ArrayList<ArrayList<String>> getStepTable(Message stepSrc) {
		ArrayList<ArrayList<String>> table = new ArrayList<ArrayList<String>>();
		ArrayList<String> row;
		ValueSpecification vs = (LiteralString) stepSrc.getArgument("dataTable", null);
		for (Entry<String, String> r : vs.getEAnnotation("dataTable").getDetails()) {
			row = new ArrayList<String>();
			for (String cell : r.getValue().split(" \\|")) {
				row.add(cell);
			}
			table.add(row);
		}
		return table;
	}

	private ArrayList<String> getTags(Interaction abstractScenario) {
		ArrayList<String> tags = new ArrayList<String>();
		if (abstractScenario.getEAnnotation("tags") != null) {
			for (Entry<String, String> t : abstractScenario.getEAnnotation("tags").getDetails()) {
				tags.add(t.getKey());
			}
		}
		return tags;
	}

	public boolean hasDocString(Message step) {
		return step.getArgument("docString", null) != null;
	}

	public boolean hasStepTable(Message step) {
		return step.getArgument("dataTable", null) != null;
	}

	public boolean isBackground(Interaction abstractScenario) {
		return abstractScenario.getEAnnotation("background") != null;
	}

	public boolean isScenarioOutline(Interaction abstractScenario) {
		// if there's an annotation not called tags or background
		for (EAnnotation a : abstractScenario.getEAnnotations()) {
			if (!a.getSource().contentEquals("tags") && !a.getSource().contentEquals("background")) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void parse(String text) throws Exception {
		// Individual objects are not stored separately so this is not needed.
	}

	public void setDocString(Message step, String content) {
		ValueSpecification vs = createArgument(step, "docString", "");
		String[] lines = content.split("\n");
		for (int i = 0; i < lines.length; i++) {
			createAnnotation(vs, "docString", String.valueOf(i), lines[i]);
		}
	}

	public void setExamplesTable(EAnnotation examples, ArrayList<String> headers) {
		String value = "";
		for (String e : headers) {
			value += e + "|";
		}
		examples.getDetails().put("0", value);
	}

	public void setFeatureDescription(String description) {
		theClass.createOwnedComment().setBody(description);
	}

	public void setScenarioDescription(Interaction scenario, String scenarioDescription) {
		scenario.createOwnedComment().setBody(scenarioDescription);
	}

	public void setScenarioOutlineDescription(Interaction scenarioOutline, String scenarioOutlineDescription) {
		scenarioOutline.createOwnedComment().setBody(scenarioOutlineDescription);
	}

	public void setScenarioOutlineTags(Interaction abstractScenario, ArrayList<String> tags) {
		setTags(abstractScenario, tags);
	}

	public void setScenarioTags(Interaction abstractScenario, ArrayList<String> tags) {
		setTags(abstractScenario, tags);
	}

	public void setStepDefinitionDescription(Interaction stepDefinition, String description) {
		stepDefinition.createOwnedComment().setBody(description);
	}

	public void setStepDefinitionNameLong(Interaction stepDefinition, String stepDefinitionNameLong) {
		createAnnotation(stepDefinition, "StepDefinition", "LongName", stepDefinitionNameLong);
	}

	public void setStepKeyword(Message step, String keyword) {
		if (!keyword.endsWith(":")) {
			keyword += ":";
		}
		createAnnotation(step, "Step", "Keyword", keyword);
	}

	public void setStepNameLong(Message step, String stepNameLong) {
		String keyword = stepNameLong.split(" ")[0];
		if (!keyword.endsWith(":")) {
			stepNameLong = stepNameLong.replaceFirst("^" + keyword, keyword + ":");
		}
		createAnnotation(step, "Step", "LongName", stepNameLong);
	}

	public void setStepObjectDescription(String description) {
		theClass.createOwnedComment().setBody(description);
	}

	public void setStepObjectName(String StepObjectName) {
		createAnnotation(theClass, "title", StepObjectName);
	}

	public void setStepTable(Message step, ArrayList<ArrayList<String>> stepTableRowList) {
		ValueSpecification table = createArgument(step, "dataTable", "");
		// header
		String row = "";
		for (int i = 0; i < stepTableRowList.get(0).size(); i++) {
			row += stepTableRowList.get(0).get(i) + " |";
		}
		createAnnotation(table, "dataTable", String.valueOf(0), row);
		// body
		for (int i = 1; i < stepTableRowList.size(); i++) {
			row = "";
			ArrayList<String> bodyRow = stepTableRowList.get(i);
			for (int j = 0; j < bodyRow.size(); j++) {
				row += stepTableRowList.get(i).get(j).replace("{", "<").replace("}", ">") + " |";
			}
			createAnnotation(table, "dataTable", String.valueOf(i), row);
		}
	}

	private void setTags(Interaction abstractScenario, ArrayList<String> tags) {
		if (!tags.isEmpty()) {
			for (String t : tags) {
				createAnnotation(abstractScenario, "tags", t);
			}
		}
	}

	public String getStepKeyword(Message step) {
		return step.getEAnnotation("Step").getDetails().get("Keyword");
	}

	public void setParent(TestProject testProject) {
		this.parent = testProject;
	}
}

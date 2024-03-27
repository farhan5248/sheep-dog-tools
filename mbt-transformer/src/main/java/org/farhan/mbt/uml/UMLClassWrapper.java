package org.farhan.mbt.uml;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Column;
import org.asciidoctor.ast.Row;
import org.asciidoctor.ast.Section;
import org.asciidoctor.ast.StructuralNode;
import org.asciidoctor.ast.Table;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Behavior;
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
import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.farhan.mbt.graph.MBTVertex;

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

	protected EAnnotation createAnnotation(Interaction anInteraction, String name, String key, String value) {
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

	public Interaction createBackground(String name) {
		Interaction scenario = createInteraction(theClass, name, "");
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

	public EAnnotation createExamples(Interaction scenarioOutline, String name) {
		return createAnnotation(scenarioOutline, name);
	}

	public void createExamplesRow(EAnnotation examples, HashMap<String, String> examplesRow) {
		String value = "";
		for (String e : examplesRow.keySet()) {
			value += examplesRow.get(e) + "|";
		}
		examples.getDetails().put(String.valueOf(examples.getDetails().size()), value);

	}

	public void createExamplesTable(EAnnotation examples, String examplesRow) {
		String value = "";
		for (String e : examplesRow.split(",")) {
			value += e + "|";
		}
		examples.getDetails().put("0", value);
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

	public Interaction createScenario(String name) {
		Interaction scenario = createInteraction(theClass, name, "");
		return scenario;
	}

	public Interaction createScenarioOutline(String name) {
		Interaction scenario = createInteraction(theClass, name, "");
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

	public ArrayList<ArrayList<String>> getDataTable(Message step, HashMap<String, String> replacements) {
		// TODO this should return a proper table and not this list of vertex-edge
		// because details of vertices and edges should be in the Graph object wrapper
		ValueSpecification vs = (LiteralString) step.getArgument("dataTable", null);
		EMap<String, String> table = vs.getEAnnotation("dataTable").getDetails();
		ArrayList<ArrayList<String>> cellList = new ArrayList<ArrayList<String>>();
		String[] header = table.getFirst().getValue().split(" \\|");
		for (int i = 1; i < table.keySet().size(); i++) {
			String[] row = table.get(i).getValue().split(" \\|");
			for (int j = 0; j < row.length; j++) {
				ArrayList<String> cell = new ArrayList<String>();
				String vertex = i - 1 + " " + header[j];
				cell.add(vertex);
				cell.add(replaceParameters(replacements, row[j]));
				cellList.add(cell);
			}
		}
		return cellList;
	}

	private String replaceParameters(HashMap<String, String> replacements, String text) {
		if (text.startsWith("<")) {
			for (String key : replacements.keySet()) {
				if (text.contentEquals("<" + key + ">")) {
					return replacements.get(key);
				}
			}
		}
		return text;
	}

	public String getDocString(Message step) {
		ValueSpecification vs = (LiteralString) step.getArgument("docString", null);
		EMap<String, String> docString = vs.getEAnnotation("docString").getDetails();
		String content = "";
		for (String lineNo : docString.keySet()) {
			content += "\n" + docString.get(lineNo);
		}
		content = content.replaceFirst("\n", "");
		return content;
	}

	public ArrayList<EAnnotation> getExamplesList(Interaction abstractScenario) {
		ArrayList<EAnnotation> exampleList = new ArrayList<EAnnotation>();
		exampleList.addAll(abstractScenario.getEAnnotations());
		return exampleList;
	}

	public String getExamplesName(EAnnotation examples) {
		return examples.getSource();
	}

	public ArrayList<HashMap<String, String>> getExamplesRowList(EAnnotation examples) {
		ArrayList<HashMap<String, String>> examplesRowList = new ArrayList<HashMap<String, String>>();

		ArrayList<String> paramNames = new ArrayList<String>();
		for (String cell : examples.getDetails().getFirst().getValue().split("\\|")) {
			paramNames.add(cell);
		}
		int rowCnt = examples.getDetails().size();
		for (int i = 1; i < rowCnt; i++) {
			String[] row = examples.getDetails().get(i).getValue().split("\\|");
			HashMap<String, String> map = new HashMap<String, String>();
			int cellCnt = row.length;
			for (int j = 0; j < cellCnt; j++) {
				map.put(paramNames.get(j), row[j]);
			}
			examplesRowList.add(map);
		}
		return examplesRowList;
	}

	public Set<String> getExamplesTable(HashMap<String, String> examplesRow) {
		return examplesRow.keySet();
	}

	public String getFeatureDescription() {
		if (theClass.getOwnedComments().size() > 0) {
			return theClass.getOwnedComments().get(0).getBody();
		}
		return "";
	}

	public String getFeatureName() {
		return theClass.getEAnnotations().getFirst().getDetails().get(0).getKey();
	}

	public String getFeatureTags() {
		String tags = "";
		if (theClass.getEAnnotations().size() == 2) {
			for (Entry<String, String> t : theClass.getEAnnotations().getLast().getDetails()) {
				if (tags.isEmpty()) {
					tags = t.getKey();
				} else {
					tags += "," + t.getKey();
				}
			}
		}
		return tags;
	}

	@Override
	public File getFile() {
		return theFile;
	}

	public String getQualifiedName() {
		// TODO make sure all wrappers have this instead of the getFile approach to
		// getting the name. When returning a file name, remove the C:// whatever
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
		if (abstractScenario.getOwnedComments().size() > 0) {
			return abstractScenario.getOwnedComments().get(0).getBody();
		}
		return "";
	}

	public String getScenarioOutlineName(Interaction abstractScenario) {
		return abstractScenario.getName();
	}

	private String getTags(Interaction abstractScenario) {
		String tags = "";
		for (Parameter p : abstractScenario.getOwnedParameters()) {
			tags += "," + p.getName();
		}
		return tags.replaceFirst(",", "");
	}

	public String getScenarioOutlineTags(Interaction abstractScenario) {
		return getTags(abstractScenario);
	}

	public String getScenarioTags(Interaction abstractScenario) {
		return getTags(abstractScenario);
	}

	public String getStep(Message step) {
		String name = step.getName();
		String keyword = step.getEAnnotation("Step").getDetails().get("Keyword");
		return keyword + " " + name;
	}

	public ArrayList<Message> getStepList(Interaction abstractScenario) {

		ArrayList<Message> stepList = new ArrayList<Message>();
		for (Message m : abstractScenario.getMessages()) {
			stepList.add(m);
		}
		return stepList;
	}

	public String getStepName(Message step) {
		return step.getName();
	}

	public boolean hasDataTable(Message step) {
		return step.getArgument("dataTable", null) != null;
	}

	public boolean hasDocString(Message step) {
		return step.getArgument("docString", null) != null;
	}

	public boolean isBackground(Interaction abstractScenario) {
		return abstractScenario.getEAnnotation("background") != null;
	}

	public boolean isScenarioOutline(Interaction abstractScenario) {
		return !abstractScenario.getEAnnotations().isEmpty() && abstractScenario.getEAnnotation("background") == null;
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

	public void setScenarioOutlineDescription(Interaction scenarioOutline, String scenarioOutlineDescription) {
		scenarioOutline.createOwnedComment().setBody(scenarioOutlineDescription);
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
}

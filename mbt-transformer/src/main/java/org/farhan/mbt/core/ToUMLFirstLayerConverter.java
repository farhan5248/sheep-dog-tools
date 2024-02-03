package org.farhan.mbt.core;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.ValueSpecification;
import org.farhan.mbt.cucumber.CucumberNameConverter;
import org.farhan.mbt.uml.AnnotationFactory;
import org.farhan.mbt.uml.ArgumentFactory;
import org.farhan.mbt.uml.ClassFactory;
import org.farhan.mbt.uml.InteractionFactory;
import org.farhan.mbt.uml.MessageFactory;
import org.farhan.mbt.uml.ParameterFactory;
import org.farhan.mbt.uml.UMLProject;
import org.farhan.validation.MBTEdgeValidator;
import org.farhan.validation.MBTVertexValidator;

public abstract class ToUMLFirstLayerConverter extends ToUMLLayerConverter {

	private StateMachine theMachine;

	private class StateMachine {
		String machineName;
		String currentState;
	}

	void setFSMName(String machineName) {
		theMachine.machineName = Utilities.toUpperCamelCase(machineName);
		theMachine.machineName = Utilities.removeDelimiterAndCapitalize(theMachine.machineName, "\\.");
		theMachine.machineName = Utilities.removeDelimiterAndCapitalize(theMachine.machineName, "\\-");
	}

	protected void setFSMState(String currentState) {
		theMachine.currentState = Utilities.toUpperCamelCase(currentState);
		// If the object is a file with a period, remove it and make the first letter
		// upper case
		theMachine.currentState = Utilities.removeDelimiterAndCapitalize(theMachine.currentState, "\\.");
		theMachine.currentState = Utilities.removeDelimiterAndCapitalize(theMachine.currentState, "\\-");
	}

	public String getFSMName() {
		return theMachine.machineName;
	}

	public String getFSMState() {
		return theMachine.currentState;
	}

	public ToUMLFirstLayerConverter() {
		super();
		theMachine = new StateMachine();
	}

	protected void resetCurrentContainerObject() {
		setFSMName("UnknownContainer");
		setFSMState("InitialState");
	}

	protected void setCurrentMachineAndState(String messageName) throws Exception {
		// the actual object name might have delimiters indicating folder or menu
		// structure
		String[] objectParts = Validator.getObjectName(messageName).split("/");
		// Capitalize the first letter of the type
		String objectType = StringUtils.capitalize(Validator.getObjectType(messageName));
		setFSMState(objectParts[objectParts.length - 1] + objectType);

		if (Validator.isContainerStep(messageName)) {
			setFSMName(StringUtils.capitalize(Validator.getComponentName(messageName)));
		}
	}
	
	// TODO remove references to CucumberNameConverter

	@Override
	protected ArrayList<String> getNextLayerInteractionNamesfromMessage(Message m) {
		String newTitle = m.getName();
		ArrayList<String> newTitles = new ArrayList<String>();
		newTitles.add(CucumberNameConverter.getMethodName(newTitle, true));
		return newTitles;
	}

	@Override
	protected void addNextLayerInteractionMessages(Interaction targetInteraction, Message m) {
		if (Validator.validateStepText(m.getName())) {
			if (MBTVertexValidator.isVertex(m.getName())) {
				createNextLayerInteractionMessagesFromVerticeMessage(targetInteraction, m);
			} else if (MBTEdgeValidator.isEdge(m.getName())) {
				createNextLayerInteractionMessagesFromEdgeMessage(targetInteraction, m);
			}
		}
	}

	private void createNextLayerInteractionMessagesFromVerticeMessage(Interaction targetInteraction, Message m) {

		String text = MBTVertexValidator.getStateModality(m.getName());
		if (text.startsWith("will be") || text.startsWith("won't be")) {
			createInputOutputMessage(targetInteraction, m, "assert");
		} else if (text.startsWith("is") || text.startsWith("isn't")) {
			createInputOutputMessage(targetInteraction, m, "set");
		} else {
			// TODO throw an exception but generally the text should be valid by this point
		}
	}

	@Override
	protected String getNextLayerClassQualifiedName(Interaction targetInteraction) {

		Class interactionOwningClass = (Class) targetInteraction.getOwner();
		return interactionOwningClass.getQualifiedName()
				.replace(Project.secondLayerPackageName, Project.thirdLayerPackageName).replace("Steps", "");
	}

	@Override
	protected Interaction addNextLayerInteraction(String methodName, Message m) {
		// TODO this should be moved to the java code generation
		String annotation = "@Given(\"^" + m.getName() + "$\")";
		return InteractionFactory.getInteraction(getNextLayerClassFromMessage(m), methodName, true, annotation);
	}

	@Override
	protected void addNextLayerInteractionParameters(Interaction targetInteraction, Message m) {
		for (ValueSpecification vs : m.getArguments()) {
			LiteralString ls = (LiteralString) vs;
			ParameterFactory.getParameter(targetInteraction, ls.getName().replace(" ", ""), "", "in");
		}
	}

	protected void createNextLayerInteractionMessagesFromEdgeMessage(Interaction targetInteraction, Message m) {

		createInputOutputMessage(targetInteraction, m, "set");
		Class layer3Class = ClassFactory.getClass(UMLProject.theSystem,
				getNextLayerClassQualifiedName(targetInteraction));
		MessageFactory.getMessage(targetInteraction, layer3Class, "execute");
	}

	private void createInputOutputMessage(Interaction nextLayerInteraction, Message m, String prefix) {

		Class nextLayerClass = ClassFactory.getClass(UMLProject.theSystem,
				getNextLayerClassQualifiedName(nextLayerInteraction));
		if (getFirstArgument(m).contentEquals("docString") || getFirstArgument(m).contentEquals("dataTable")) {

			String methodName = prefix + "Attributes";
			Message nextLayerMessage = MessageFactory.getMessage(nextLayerInteraction, nextLayerClass, methodName);
			if (getFirstArgument(m).contentEquals("docString")) {
				ArgumentFactory.getArgument(nextLayerMessage, "contents", "docString", true);
			} else {
				ValueSpecification vs = ArgumentFactory.getArgument(nextLayerMessage, "keyMap", "dataTable", true);
				String annotationDetailValue = m.getArguments().get(0).getEAnnotation("dataTable").getDetails()
						.getFirst().getValue();
				AnnotationFactory.getAnnotation(vs, "keyMap", "0", annotationDetailValue);

				// TODO wrap up these chunks in private methods
				String detailsName = MBTVertexValidator.getDetailsName(m.getName());
				String detailsType = StringUtils.capitalize(MBTVertexValidator.getDetailsType(m.getName()));
				String section = detailsName + detailsType;
				if (section.contentEquals("nullnull")) {
					section = "";
				}
				ArgumentFactory.getArgument(nextLayerMessage, "section", "\"" + section + "\"", true);
			}
			if (Validator.isNegativeStep(m.getName())) {
				ArgumentFactory.getArgument(nextLayerMessage, "negativeTest", "true", true);
			}
		} else {

			String attributeName = "";
			if (MBTVertexValidator.isVertex(m.getName())) {
				attributeName = MBTVertexValidator.getState(m.getName());
			} else {
				attributeName = MBTEdgeValidator.getState(m.getName());
			}
			String methodName = CucumberNameConverter.getMethodName(prefix + StringUtils.capitalize(attributeName),
					true);
			MessageFactory.getMessage(nextLayerInteraction, nextLayerClass, methodName);
			// ArgumentFactory.getArgument(nextLayerMessage, variableName,
			// Utilities.toLowerCamelCase(variableName), true);
		}
	}

	private String getFirstArgument(Message m) {
		if (m.getArguments().size() == 0) {
			return "";
		} else {
			return m.getArguments().get(0).getName();
		}
	}

}

package org.farhan.validation;

import java.util.ArrayList;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.ValueSpecification;
import org.farhan.validation.uml.ArgumentFactory;
import org.farhan.validation.uml.ClassFactory;
import org.farhan.validation.uml.MessageFactory;
import org.farhan.validation.uml.ParameterFactory;
import org.farhan.validation.uml.UMLStuffDoer;

public class FirstLayerLinker extends LayerLinker {

	public FirstLayerLinker(Model theSystem) {
		this.theSystem = theSystem;
	}

	@Override
	protected void addNextLayerInteractionMessages(Interaction targetInteraction, Message m) {

		if (Layer1Validator.validateStepText(m.getName()).isEmpty()) {

			if (Layer1Validator.isInputStart(m.getName())) {
				createNextLayerInteractionMessagesFromInputMessage(targetInteraction, m);
			} else if (Layer1Validator.isOutputStart(m.getName())) {
				createNextLayerInteractionMessagesFromOutputMessage(targetInteraction, m);
			} else if (Layer1Validator.isTransitionStart(m.getName())) {
				createNextLayerInteractionMessagesFromTransitionMessage(targetInteraction, m);
			} else if (Layer1Validator.isInitialStart(m.getName())) {
				createNextLayerInteractionMessagesFromInitialMessage(targetInteraction, m);
			} else if (Layer1Validator.isFinalStart(m.getName())) {
				createNextLayerInteractionMessagesFromFinalMessage(targetInteraction, m);
			}
		} else {
			// If it's not the valid, don't create the body
		}
	}

	@Override
	protected void addNextLayerInteractionParameters(Interaction targetInteraction, Message m) {

		for (ValueSpecification vs : m.getArguments()) {
			LiteralString ls = (LiteralString) vs;
			ParameterFactory.getParameter(targetInteraction, getVariableName(ls.getName()), "", "in");
		}
	}

	private void createInputOutputMessage(Interaction targetInteraction, Message m, String prefix) {

		if (m.getName().endsWith(" as follows")) {
			Class layer3Class = ClassFactory.getClass(theSystem, getNextLayerClassQualifiedName(targetInteraction));
			Message nextLayerMessage = MessageFactory.getMessage(targetInteraction, layer3Class, prefix + "Attributes");
			ArgumentFactory.getArgument(nextLayerMessage, "keyMap", "dataTable");
			ArgumentFactory.getArgument(nextLayerMessage, "object", "new " + layer3Class.getName() + "()");
			ArgumentFactory.getArgument(nextLayerMessage, "section", getSectionName(m));

			String negativeTest = Utilities.regexFind(Layer1Validator.getRegex(), m.getName(), 10);
			if (negativeTest != null) {
				ArgumentFactory.getArgument(nextLayerMessage, "negativeTest", "true");
			}
		} else {
			for (ValueSpecification vs : m.getArguments()) {
				LiteralString ls = (LiteralString) vs;
				String attributeName = ls.getName();
				String variableName = getVariableName(attributeName);
				Message nextLayerMessage = MessageFactory.getMessage(targetInteraction,
						ClassFactory.getClass(theSystem, getNextLayerClassQualifiedName(targetInteraction)),
						ClassFactory.getMethodName(prefix + attributeName, true));
				ArgumentFactory.getArgument(nextLayerMessage, variableName, Utilities.toLowerCamelCase(variableName));
			}
		}
	}

	protected void createNextLayerInteractionMessagesFromFinalMessage(Interaction targetInteraction, Message m) {
	}

	protected void createNextLayerInteractionMessagesFromInitialMessage(Interaction targetInteraction, Message m) {
	}

	protected void createNextLayerInteractionMessagesFromInputMessage(Interaction targetInteraction, Message m) {
		createInputOutputMessage(targetInteraction, m, "set");
	}

	protected void createNextLayerInteractionMessagesFromOutputMessage(Interaction targetInteraction, Message m) {
		createInputOutputMessage(targetInteraction, m, "assert");
	}

	protected void createNextLayerInteractionMessagesFromTransitionMessage(Interaction targetInteraction, Message m) {
		String pageObject = Utilities.regexFind(Layer1Validator.getRegex(), m.getName(), 2);
		pageObject = pageObject.trim();
		pageObject = Utilities.toUpperCamelCase(pageObject);

		String methodName = "send" + pageObject;
		if (!methodName.endsWith("Request")) {
			methodName += "Request";
		}

		// TODO this is duplication of the input/output one
		Message nextLayerMessage;
		Class layer3Class = ClassFactory.getClass(theSystem, getNextLayerClassQualifiedName(targetInteraction));
		if (m.getName().endsWith(" as follows")) {
			nextLayerMessage = MessageFactory.getMessage(targetInteraction, layer3Class, methodName);
			ArgumentFactory.getArgument(nextLayerMessage, "keyMap", "dataTable");
			ArgumentFactory.getArgument(nextLayerMessage, "object", "new " + layer3Class.getName() + "()");
			// I don't know if transition steps need to point out a section, perhaps they
			// do, let's see
			ArgumentFactory.getArgument(nextLayerMessage, "section", "\"\"");
		} else {
			nextLayerMessage = MessageFactory.getMessage(targetInteraction, layer3Class, methodName);
			for (ValueSpecification vs : m.getArguments()) {
				LiteralString ls = (LiteralString) vs;
				String attributeName = ls.getName();
				String variableName = getVariableName(attributeName);
				ArgumentFactory.getArgument(nextLayerMessage, variableName, Utilities.toLowerCamelCase(variableName));
			}
		}
	}

	@Override
	protected String getNextLayerClassQualifiedName(Interaction targetInteraction) {

		Class interactionOwningClass = (Class) targetInteraction.getOwner();
		return interactionOwningClass.getQualifiedName()
				.replace(UMLStuffDoer.secondLayerPackageName, UMLStuffDoer.thirdLayerPackageName).replace("Steps", "");
	}

	@Override
	protected String getNextLayerInteractionAnnotationfromMessage(Message m) {
		String newTitle = m.getName();
		// check if there are parameters in the message
		if (m.getName().split("where", 2).length > 1) {
			newTitle = m.getName().split("where", 2)[0] + "where ";
			// TODO get the parameters from the message itself
			for (ValueSpecification vs : m.getArguments()) {
				newTitle += vs.getName() + " is {}, ";
			}
			newTitle = Utilities.removeLastComma(newTitle);
		}
		// TODO temp hack to put all naming conversions here
		newTitle = newTitle.replaceAll("(?i)Launch the (.+) application with (.+) and (.+) in (.+)",
				"Launch the $1 application with {} and {} in $4");
		newTitle = newTitle.replaceAll("(?i) - As of ((?!page|pop-up).)*", " - As of {}");

		return newTitle;
	}

	@Override
	protected ArrayList<String> getNextLayerInteractionNamesfromMessage(Message m) {
		String newTitle = m.getName();
		// check if there are parameters in the message
		if (m.getName().split("where", 2).length > 1) {
			newTitle = m.getName().split("where", 2)[0] + "where ";
			for (ValueSpecification vs : m.getArguments()) {
				newTitle += vs.getName();
			}
		}
		// TODO temp hack to put all naming conversions here
		newTitle = newTitle.replaceAll("(?i)Launch the (.+) application with (.+) and (.+) in (.+)",
				"Launch the $1 application with and in $4");
		newTitle = newTitle.replaceAll("(?i) - As of ((?!page|pop-up).)*", " - As of ");

		ArrayList<String> newTitles = new ArrayList<String>();
		newTitles.add(ClassFactory.getMethodName(newTitle, true));
		return newTitles;
	}

	private String getSectionName(Message m) {
		String sectionName = Utilities.regexFind(Layer1Validator.getRegex(), m.getName(), 5);
		if (sectionName == null) {
			sectionName = Utilities.regexFind(Layer1Validator.getRegex(), m.getName(), 2);
		}
		if (sectionName != null) {
			sectionName = "\"" + Utilities.toUpperCamelCase(sectionName) + "\"";
		} else {
			sectionName = "\"" + "\"";
		}
		return sectionName;
	}
}

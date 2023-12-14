package org.farhan.mbt.conv.cucumber;

import java.util.ArrayList;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.ValueSpecification;
import org.farhan.conv.core.FirstLayerLinker;
import org.farhan.conv.core.Utilities;
import org.farhan.conv.validation.InputStepValidator;
import org.farhan.conv.validation.OutputStepValidator;
import org.farhan.conv.validation.TransitionStepValidator;
import org.farhan.mbt.conv.uml.ArgumentFactory;
import org.farhan.mbt.conv.uml.ClassFactory;
import org.farhan.mbt.conv.uml.MessageFactory;
import org.farhan.mbt.conv.uml.ParameterFactory;



public class CucumberFirstLayerLinker extends FirstLayerLinker {

	public CucumberFirstLayerLinker(Model theSystem) {
		this.theSystem = theSystem;
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
		newTitles.add(CucumberJavaFile.getMethodName(newTitle, true));
		return newTitles;
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
	protected void addNextLayerInteractionParameters(Interaction targetInteraction, Message m) {

		for (ValueSpecification vs : m.getArguments()) {
			LiteralString ls = (LiteralString) vs;
			ParameterFactory.getParameter(targetInteraction, getVariableName(ls.getName()), "", "in");
		}
	}

	@Override
	protected void createNextLayerInteractionMessagesFromFinalMessage(Interaction targetInteraction, Message m) {
		// TODO needs something like sendNextPageRequest(String key1, String key2)
	}

	@Override
	protected void createNextLayerInteractionMessagesFromInitialMessage(Interaction targetInteraction, Message m) {
		// TODO needs something like sendNextPageRequest(String username, String
		// password)
	}

	private String getSectionName(Message m) {
		String sectionName = Utilities.regexFind(OutputStepValidator.getRegex(), m.getName(), 5);
		if (sectionName == null) {
			sectionName = Utilities.regexFind(InputStepValidator.getRegex(), m.getName(), 2);
		}
		if (sectionName != null) {
			sectionName = "\"" + Utilities.toUpperCamelCase(sectionName) + "\"";
		} else {
			sectionName = "\"" + "\"";
		}
		return sectionName;
	}

	@Override
	protected void createNextLayerInteractionMessagesFromInputMessage(Interaction targetInteraction, Message m) {
		createInputOutputMessage(targetInteraction, m, "set");
	}

	@Override
	protected void createNextLayerInteractionMessagesFromOutputMessage(Interaction targetInteraction, Message m) {
		createInputOutputMessage(targetInteraction, m, "assert");
	}

	private void createInputOutputMessage(Interaction targetInteraction, Message m, String prefix) {

		if (m.getName().endsWith(" as follows")) {
			Class layer3Class = ClassFactory.getClass(theSystem, getNextLayerClassQualifiedName(targetInteraction));
			Message nextLayerMessage = MessageFactory.getMessage(targetInteraction, layer3Class, prefix + "Attributes");
			ArgumentFactory.getArgument(nextLayerMessage, "keyMap", "dataTable");
			ArgumentFactory.getArgument(nextLayerMessage, "object", "new " + layer3Class.getName() + "()");
			ArgumentFactory.getArgument(nextLayerMessage, "section", getSectionName(m));

			String negativeTest = Utilities.regexFind(OutputStepValidator.getRegex(), m.getName(), 10);
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
						CucumberJavaFile.getMethodName(prefix + attributeName, true));
				ArgumentFactory.getArgument(nextLayerMessage, variableName,
						Utilities.toLowerCamelCase(variableName));
			}
		}
	}

	@Override
	protected void createNextLayerInteractionMessagesFromTransitionMessage(Interaction targetInteraction, Message m) {
		String pageObject = Utilities.regexFind(TransitionStepValidator.getRegex(), m.getName(), 2);
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
				ArgumentFactory.getArgument(nextLayerMessage, variableName,
						Utilities.toLowerCamelCase(variableName));
			}
		}
	}
}

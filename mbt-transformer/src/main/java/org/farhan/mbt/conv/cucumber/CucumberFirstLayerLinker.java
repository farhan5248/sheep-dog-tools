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
import org.farhan.conv.validation.Layer1Validator;
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
	protected void createNextLayerInteractionMessagesFromOutputMessage(Interaction targetInteraction, Message m) {
		createInputOutputMessage(targetInteraction, m, "assert");
	}

	private void createInputOutputMessage(Interaction targetInteraction, Message m, String prefix) {

		Class layer3Class = ClassFactory.getClass(theSystem, getNextLayerClassQualifiedName(targetInteraction));
		if (m.getName().endsWith(" as follows")) {
			String methodName = prefix + "Attributes";
			Message nextLayerMessage = MessageFactory.getMessage(targetInteraction, layer3Class, methodName);
			ArgumentFactory.getArgument(nextLayerMessage, "keyMap");// , "dataTable"
			// TODO remove the use of new, the ContainerFactory class should hide it
			ArgumentFactory.getArgument(nextLayerMessage, "object");// , "new " + layer3Class.getName() + "()"
			ArgumentFactory.getArgument(nextLayerMessage, "section");// , Layer1Validator.getSection(m.getName())

			if (Layer1Validator.isNegativeStep(m.getName())) {
				ArgumentFactory.getArgument(nextLayerMessage, "negativeTest");// , "true"
			}
		} else {
			// TODO test this, it's for things like the response is empty, the above is for
			// the response is as follows
			for (ValueSpecification vs : m.getArguments()) {
				LiteralString ls = (LiteralString) vs;
				String attributeName = ls.getName();
				String variableName = getVariableName(attributeName);
				String methodName = CucumberJavaFile.getMethodName(prefix + attributeName, true);
				Message nextLayerMessage = MessageFactory.getMessage(targetInteraction, layer3Class, methodName);
				ArgumentFactory.getArgument(nextLayerMessage, variableName);//, Utilities.toLowerCamelCase(variableName)
			}
		}
	}

	@Override
	protected void createNextLayerInteractionMessagesFromTransitionMessage(Interaction targetInteraction, Message m) {
		String pageObject = Layer1Validator.getObjectName(m.getName());
		pageObject = Utilities.toUpperCamelCase(pageObject);

		String methodName = "send" + pageObject;
		if (!methodName.endsWith("Request")) {
			methodName += "Request";
		}

		Class layer3Class = ClassFactory.getClass(theSystem, getNextLayerClassQualifiedName(targetInteraction));
		MessageFactory.getMessage(targetInteraction, layer3Class, methodName);

		createInputOutputMessage(targetInteraction, m, "set");

	}
}

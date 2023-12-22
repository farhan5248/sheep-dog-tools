package org.farhan.mbt.conv.cucumber;

import java.util.ArrayList;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.ValueSpecification;
import org.farhan.conv.core.ToUMLFirstLayerLinker;
import org.farhan.conv.core.Utilities;
import org.farhan.conv.validation.Layer1Validator;
import org.farhan.mbt.conv.uml.ArgumentFactory;
import org.farhan.mbt.conv.uml.ClassFactory;
import org.farhan.mbt.conv.uml.MessageFactory;
import org.farhan.mbt.conv.uml.ParameterFactory;
import org.farhan.mbt.conv.uml.UMLProject;
import org.farhan.mbt.graph.validation.EdgeValidator;
import org.farhan.mbt.graph.validation.VerticeValidator;

public class CucumberToUMLFirstLayerLinker extends ToUMLFirstLayerLinker {

	@Override
	protected ArrayList<String> getNextLayerInteractionNamesfromMessage(Message m) {
		String newTitle = m.getName();
		ArrayList<String> newTitles = new ArrayList<String>();
		newTitles.add(CucumberNameConverter.getMethodName(newTitle, true));
		return newTitles;
	}

	@Override
	protected void addNextLayerInteractionParameters(Interaction targetInteraction, Message m) {

		for (ValueSpecification vs : m.getArguments()) {
			LiteralString ls = (LiteralString) vs;
			ParameterFactory.getParameter(targetInteraction, getVariableName(ls.getName()), "", "in");
		}
	}

	@Override
	protected void createNextLayerInteractionMessagesFromVerticeMessage(Interaction targetInteraction, Message m) {
		createInputOutputMessage(targetInteraction, m, "assert");
	}

	private String getFirstArgument(Message m) {
		if (m.getArguments().size() == 0) {
			return "";
		} else {
			return m.getArguments().get(0).getName();
		}
	}

	private void createInputOutputMessage(Interaction targetInteraction, Message m, String prefix) {

		Class layer3Class = ClassFactory.getClass(UMLProject.theSystem,
				getNextLayerClassQualifiedName(targetInteraction));
		if (getFirstArgument(m).contentEquals("docString") || getFirstArgument(m).contentEquals("dataTable")) {

			String methodName = prefix + "Attributes";
			Message nextLayerMessage = MessageFactory.getMessage(targetInteraction, layer3Class, methodName);
			ArgumentFactory.getArgument(nextLayerMessage, "object", layer3Class.getName(), true);
			if (getFirstArgument(m).contentEquals("docString")) {
				ArgumentFactory.getArgument(nextLayerMessage, "contents", "docString", true);
			} else {
				ValueSpecification vs = ArgumentFactory.getArgument(nextLayerMessage, "keyMap", "dataTable", true);
				Entry<String, String> attributes = m.getArguments().get(0).getEAnnotation("dataTable").getDetails()
						.get(0);
				vs.createEAnnotation("keyMap").getDetails().put("0", attributes.getValue());

				// TODO wrap up these chunks in private methods
				String section = Layer1Validator.getSection(m.getName());
				if (section == null) {
					section = "";
				}
				ArgumentFactory.getArgument(nextLayerMessage, "section", "\"" + section + "\"", true);
			}
			if (Layer1Validator.isNegativeStep(m.getName())) {
				ArgumentFactory.getArgument(nextLayerMessage, "negativeTest", "true", true);
			}

		} else {

			String attributeName = "";
			// TODO maybe get the actual status like empty etc, so make getDetailStatus
			if (VerticeValidator.isVertice(m.getName())) {
				attributeName = VerticeValidator.getDetails(m.getName());
			} else {
				attributeName = EdgeValidator.getDetails(m.getName());
			}
			String variableName = getVariableName(attributeName);
			String methodName = CucumberNameConverter.getMethodName(prefix + StringUtils.capitalize(attributeName),
					true);
			Message nextLayerMessage = MessageFactory.getMessage(targetInteraction, layer3Class, methodName);
			ArgumentFactory.getArgument(nextLayerMessage, variableName, Utilities.toLowerCamelCase(variableName), true);
		}
	}

	@Override
	protected void createNextLayerInteractionMessagesFromEdgeMessage(Interaction targetInteraction, Message m) {
		String pageObject = Layer1Validator.getObjectName(m.getName());
		pageObject = Utilities.toUpperCamelCase(pageObject);

		String methodName = "send" + pageObject;
		if (!methodName.endsWith("Request")) {
			methodName += "Request";
		}

		Class layer3Class = ClassFactory.getClass(UMLProject.theSystem,
				getNextLayerClassQualifiedName(targetInteraction));
		MessageFactory.getMessage(targetInteraction, layer3Class, methodName);

		createInputOutputMessage(targetInteraction, m, "set");

	}
}

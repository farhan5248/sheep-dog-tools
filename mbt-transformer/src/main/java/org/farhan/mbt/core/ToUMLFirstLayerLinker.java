package org.farhan.mbt.core;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.ValueSpecification;
import org.farhan.mbt.cucumber.CucumberNameConverter;
import org.farhan.mbt.graph.validation.MBTEdgeValidator;
import org.farhan.mbt.graph.validation.MBTVertexValidator;
import org.farhan.mbt.uml.AnnotationFactory;
import org.farhan.mbt.uml.ArgumentFactory;
import org.farhan.mbt.uml.ClassFactory;
import org.farhan.mbt.uml.InteractionFactory;
import org.farhan.mbt.uml.MessageFactory;
import org.farhan.mbt.uml.ParameterFactory;
import org.farhan.mbt.uml.UMLProject;

public abstract class ToUMLFirstLayerLinker extends ToUMLLayerLinker {

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
			if (MBTVertexValidator.isVertice(m.getName())) {
				createNextLayerInteractionMessagesFromVerticeMessage(targetInteraction, m);
			} else if (MBTEdgeValidator.isEdge(m.getName())) {
				createNextLayerInteractionMessagesFromEdgeMessage(targetInteraction, m);
			}
		}
	}

	protected void createNextLayerInteractionMessagesFromVerticeMessage(Interaction targetInteraction, Message m) {

		String text = MBTVertexValidator.getDetails(m.getName());
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
				String section = Validator.getSection(m.getName());
				if (section == null) {
					section = "";
				}
				ArgumentFactory.getArgument(nextLayerMessage, "section", "\"" + section + "\"", true);
			}
			if (Validator.isNegativeStep(m.getName())) {
				ArgumentFactory.getArgument(nextLayerMessage, "negativeTest", "true", true);
			}

		} else {

			String attributeName = "";
			if (MBTVertexValidator.isVertice(m.getName())) {
				attributeName = MBTVertexValidator.getDetails(m.getName());
			} else {
				attributeName = MBTEdgeValidator.getDetails(m.getName());
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

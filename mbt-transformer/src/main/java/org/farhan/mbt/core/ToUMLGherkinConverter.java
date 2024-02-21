package org.farhan.mbt.core;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.ValueSpecification;
import org.farhan.validation.MBTEdgeValidator;
import org.farhan.validation.MBTVertexValidator;

public abstract class ToUMLGherkinConverter extends ToUMLConverter {

	public static String convertNextLayerClassName(String currentClassName) {
		if (currentClassName == null) {
			return "";
		}
		if (currentClassName.startsWith("Common")) {
			return currentClassName;
		}
		String newClassName = currentClassName;
		newClassName = newClassName.replace("-", "");
		newClassName = newClassName.replace("_", "");
		newClassName = newClassName.replace(" ", "");
		newClassName = newClassName.replace("'", "");
		newClassName = newClassName.replace("#", "");
		return newClassName;
	}

	@Override
	protected ArrayList<String> getNextLayerInteractionNamesfromMessage(Message m) {
		String newTitle = m.getName();
		ArrayList<String> newTitles = new ArrayList<String>();
		newTitles.add(getMethodName(newTitle, true));
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

	@Override
	protected String getNextLayerClassQualifiedName(Interaction targetInteraction) {

		Class interactionOwningClass = (Class) targetInteraction.getOwner();
		String newName = interactionOwningClass.getQualifiedName();
		newName = newName.replace(tgtPrj.SECOND_LAYER, tgtPrj.THIRD_LAYER);
		newName = newName.replaceAll("Steps$", "");
		newName = newName.replaceFirst(getFactoryName(newName), "");
		return newName;
	}

	private String getFactoryName(String qualifiedName) {
		String[] nameParts = qualifiedName.split("::");
		return StringUtils.capitalize(nameParts[nameParts.length - 2]);
	}

	@Override
	protected Interaction addNextLayerInteraction(String methodName, Message m) {
		// TODO this should be moved to the java code forward and reverse engineering
		String annotation = "@Given(\"^" + m.getName() + "$\")";
		return createInteraction(getNextLayerClassFromMessage(m), methodName, annotation);
	}

	@Override
	protected void addNextLayerInteractionParameters(Interaction targetInteraction, Message m) {
		for (ValueSpecification vs : m.getArguments()) {
			LiteralString ls = (LiteralString) vs;
			createParameter(targetInteraction, ls.getName().replace(" ", ""), "", "in");
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

	private void createNextLayerInteractionMessagesFromEdgeMessage(Interaction nextLayerInteraction, Message m) {

		createInputOutputMessage(nextLayerInteraction, m, "set");
		Class nextLayerClass = createClassImport(getNextLayerClassQualifiedName(nextLayerInteraction),
				nextLayerInteraction);
		getMessage(nextLayerInteraction, nextLayerClass, "transition");
	}

	private void createInputOutputMessage(Interaction nextLayerInteraction, Message m, String prefix) {

		Class nextLayerClass = createClassImport(getNextLayerClassQualifiedName(nextLayerInteraction),
				nextLayerInteraction);
		if (getFirstArgument(m).contentEquals("docString") || getFirstArgument(m).contentEquals("dataTable")) {

			String methodName = prefix + "InputOutputs";
			Message nextLayerMessage = getMessage(nextLayerInteraction, nextLayerClass, methodName);
			if (getFirstArgument(m).contentEquals("docString")) {
				createArgument(nextLayerMessage, "key", "\"Content\"");
				createArgument(nextLayerMessage, "value", "docString");
			} else {
				ValueSpecification vs = createArgument(nextLayerMessage, "keyMap", "dataTable");
				String annotationDetailValue = m.getArguments().get(0).getEAnnotation("dataTable").getDetails()
						.getFirst().getValue();
				createAnnotation(vs, "keyMap", "0", annotationDetailValue);

				String detailsName = MBTVertexValidator.getDetailsName(m.getName());
				String detailsType = StringUtils.capitalize(MBTVertexValidator.getDetailsType(m.getName()));
				String section = detailsName + detailsType;
				if (section.contentEquals("nullnull")) {
					section = "";
				}
				section = section.replace(" ", "");
				createArgument(nextLayerMessage, "section", "\"" + section + "\"");
			}
			if (Validator.isNegativeStep(m.getName())) {
				createArgument(nextLayerMessage, "negativeTest", "true");
			}
		} else {
			if (MBTVertexValidator.isVertex(m.getName())) {
				String attributeName = MBTVertexValidator.getState(m.getName());
				String methodName = getMethodName(prefix + StringUtils.capitalize(attributeName), true);
				getMessage(nextLayerInteraction, nextLayerClass, methodName);
			}
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

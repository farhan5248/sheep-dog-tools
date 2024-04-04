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

	@Override
	protected ArrayList<String> getNextLayerInteractionNamesfromMessage(Message m) {
		String newTitle = m.getName();
		ArrayList<String> newTitles = new ArrayList<String>();
		newTitles.add(getMethodName(newTitle, true));
		return newTitles;
	}

	@Override
	protected void addNextLayerInteractionMessages(Interaction nextLayerInteraction, Message m) {

		createSetComponentMessage(nextLayerInteraction, m);
		createSetPathMessage(nextLayerInteraction, m);
		if (StepWrapper.validateStepText(m.getName())) {
			if (MBTVertexValidator.isVertex(m.getName())) {
				createVerticeInputOutputMessage(nextLayerInteraction, m);
			} else if (MBTEdgeValidator.isEdge(m.getName())) {
				createEdgeInputOutputMessage(nextLayerInteraction, m);
				createEdgeTransitionMessage(nextLayerInteraction, m);
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

	private String getFactoryName(String qualifiedName) {
		String[] nameParts = qualifiedName.split("::");
		return StringUtils.capitalize(nameParts[nameParts.length - 2]);
	}

	private void createSetComponentMessage(Interaction nextLayerInteraction, Message m) {
		Class nextLayerClass = createClassImport(getNextLayerClassQualifiedName(nextLayerInteraction),
				nextLayerInteraction);
		if (nextLayerInteraction.getMessage("setComponent") == null) {
			Message nextLayerMessage = getMessage(nextLayerInteraction, nextLayerClass, "setComponent");
			createArgument(nextLayerMessage, "component",
					"\"" + m.getEAnnotation("Step").getDetails().get("Component") + "\"");
		}
	}

	private void createSetPathMessage(Interaction nextLayerInteraction, Message m) {
		Class nextLayerClass = createClassImport(getNextLayerClassQualifiedName(nextLayerInteraction),
				nextLayerInteraction);
		if (nextLayerInteraction.getMessage("setPath") == null) {
			Message nextLayerMessage = getMessage(nextLayerInteraction, nextLayerClass, "setPath");
			createArgument(nextLayerMessage, "path", "\"" + m.getEAnnotation("Step").getDetails().get("Path") + "\"");
		}
	}

	private void createVerticeInputOutputMessage(Interaction targetInteraction, Message m) {

		String text = MBTVertexValidator.getStateModality(m.getName());
		if (text.endsWith("be")) {
			if (text.startsWith("will")) {
				createInputOutputMessage(targetInteraction, m, "assert");
			} else {
				// TODO handle won't as a negative
				createInputOutputMessage(targetInteraction, m, "assert");
			}
		} else if (text.startsWith("is")) {
			if (text.endsWith("n't")) {
				// TODO handle won't as a negative
				createInputOutputMessage(targetInteraction, m, "set");
			} else {
				createInputOutputMessage(targetInteraction, m, "set");
			}
		} else {
			// TODO throw an exception but generally the text should be valid by this point
		}
	}

	private void createEdgeInputOutputMessage(Interaction nextLayerInteraction, Message m) {

		createInputOutputMessage(nextLayerInteraction, m, "set");
	}

	private void createInputOutputMessage(Interaction nextLayerInteraction, Message m, String prefix) {

		Class nextLayerClass = createClassImport(getNextLayerClassQualifiedName(nextLayerInteraction),
				nextLayerInteraction);
		String methodName = prefix + "InputOutputs";
		if (!getFirstArgument(m).contentEquals("docString") && !getFirstArgument(m).contentEquals("dataTable")
				&& !MBTVertexValidator.isVertex(m.getName())) {
			return;
		}
		Message nextLayerMessage = nextLayerInteraction.getMessage(methodName);
		if (nextLayerMessage == null) {
			nextLayerMessage = getMessage(nextLayerInteraction, nextLayerClass, methodName);
		}
		if (getFirstArgument(m).contentEquals("docString")) {
			createArgument(nextLayerMessage, "key", "\"Content\"");
			createArgument(nextLayerMessage, "value", "docString");
		} else if (getFirstArgument(m).contentEquals("dataTable")) {
			ValueSpecification vs = createArgument(nextLayerMessage, "keyMap", "dataTable");

			// I need the data table as an annotation so that I can derive the layer 3
			// method declarations
			String annotationDetailValue = m.getArguments().get(0).getEAnnotation("dataTable").getDetails().getFirst()
					.getValue();
			// This if statement is to handle merging annotations so that new fields are
			// added
			if (vs.getEAnnotation("keyMap") == null) {
				createAnnotation(vs, "keyMap", "0", annotationDetailValue);
			} else {
				// First split the existing value by |
				String fields = vs.getEAnnotation("keyMap").getDetails().getFirst().getValue();
				// and remove it from annotationDetailValue
				for (String f : fields.split("\\|")) {
					annotationDetailValue = annotationDetailValue.replace(f + "|", "");
				}
				// Then append annotationDetailValue to the existing annotation
				vs.getEAnnotation("keyMap").getDetails().getFirst().setValue(fields + annotationDetailValue);
			}
		} else if (MBTVertexValidator.isVertex(m.getName())) {
			// Add state argument
			String attributeName = StringUtils.capitalize(MBTVertexValidator.getStateType(m.getName()));
			createArgument(nextLayerMessage, "key", "\"" + attributeName + "\"");
		}
		// Add section argument
		String detailsName = MBTVertexValidator.getDetailsName(m.getName());
		String detailsType = StringUtils.capitalize(MBTVertexValidator.getDetailsType(m.getName()));
		String section = detailsName + detailsType;
		if (!section.isEmpty() && !section.contentEquals("nullnull")) {
			section = section.replace(" ", "");
			createArgument(nextLayerMessage, "section", "\"" + section + "\"");
		}
		// Add negative argument
		if (StepWrapper.isNegativeStep(m.getName())) {
			createArgument(nextLayerMessage, "negativeTest", "true");
		}
	}

	private void createEdgeTransitionMessage(Interaction nextLayerInteraction, Message m) {
		Class nextLayerClass = createClassImport(getNextLayerClassQualifiedName(nextLayerInteraction),
				nextLayerInteraction);
		if (nextLayerInteraction.getMessage("transition") == null) {
			// TODO handle negative like isn't sent
			getMessage(nextLayerInteraction, nextLayerClass, "transition");
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

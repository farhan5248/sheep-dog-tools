package org.farhan.validation;

import java.util.ArrayList;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ValueSpecification;
import org.farhan.validation.uml.ParameterFactory;
import org.farhan.validation.uml.UMLStuffDoer;

public class OtherLayerLinker extends LayerLinker {

	public OtherLayerLinker(Model theSystem) {
		this.theSystem = theSystem;
	}

	@Override
	protected void addNextLayerInteractionMessages(Interaction targetInteraction, Message m) {
	}

	@Override
	protected void addNextLayerInteractionParameters(Interaction targetInteraction, Message m) {

		if (m.getArguments().size() > 0 && m.getArguments().get(0).getName().contentEquals("keyMap")) {
			ParameterFactory.getParameter(targetInteraction, "keyMap", "", "in");
			ParameterFactory.getParameter(targetInteraction, "value", "", "in");
		} else {
			for (ValueSpecification vs : m.getArguments()) {
				LiteralString ls = (LiteralString) vs;
				ParameterFactory.getParameter(targetInteraction, ls.getName(), "", "in");
			}
		}
	}

	@Override
	protected String getNextLayerClassQualifiedName(Interaction targetInteraction) {

		Class interactionOwner = (Class) targetInteraction.getOwner();
		return interactionOwner.getQualifiedName()
				.replace(UMLStuffDoer.secondLayerPackageName, UMLStuffDoer.thirdLayerPackageName).replace("Steps", "");
	}

	@Override
	protected String getNextLayerInteractionAnnotationfromMessage(Message m) {
		return null;
	}

	@Override
	protected ArrayList<String> getNextLayerInteractionNamesfromMessage(Message m) {
		ArrayList<String> newTitles = new ArrayList<String>();
		String prefix = m.getName().replace("Attributes", "");
		if (prefix.contentEquals("set") || prefix.contentEquals("assert")) {
			for (Parameter p : m.getInteraction().getOwnedParameters()) {
				if (!p.getName().contentEquals("dataTable")) {
					// Existing Java code might not have this parameter
					String sectionName = "";
					if (m.getArguments().size() == 3) {
						sectionName = m.getArguments().get(2).stringValue();
					}
					newTitles.add(JavaFile.getMethodName(prefix + sectionName + p.getName(), true));
				}
			}
		}
		newTitles.add(m.getName());
		return newTitles;
	}

}

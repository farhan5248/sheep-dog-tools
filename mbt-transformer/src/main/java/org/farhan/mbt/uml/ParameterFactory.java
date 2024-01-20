package org.farhan.mbt.uml;

import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;

public class ParameterFactory {

	public static Parameter getParameter(Interaction anInteraction, String paramName, String defaultValue,
			String direction) {
		Parameter aParameter = anInteraction.getOwnedParameter(paramName, null);
		if (aParameter == null) {
			aParameter = anInteraction.createOwnedParameter(paramName, null);
			aParameter.setDefault(defaultValue);
			aParameter.setDirection(ParameterDirectionKind.getByName(direction));
		}
		return aParameter;
	}

	public static Parameter getParameter(Interaction interaction, String name) {
		return interaction.getOwnedParameter(name, null);
	}
}

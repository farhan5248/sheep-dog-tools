package org.farhan.mbt.conv.uml;

import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.ValueSpecification;

public class ArgumentFactory {

	public static ValueSpecification getArgument(Message aMessage, String name) {
		LiteralString ls = (LiteralString) aMessage.getArgument(name, null);
		if (ls == null) {
			ls = UMLFactory.eINSTANCE.createLiteralString();
			ls = (LiteralString) aMessage.createArgument(name, null, ls.eClass());
			ls.setName(name);
		}
		return ls;
	}

}

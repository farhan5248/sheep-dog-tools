package org.xtext.example.mydsl.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;

public class FeatureFormatter extends Formatter {

	// This is an example of how to access a keyword which is something between ''
	// in the xtext file
	public static void formatFeatureKeyword(ISemanticRegion iSR, IFormattableDocument doc) {
		doc.prepend(iSR, it -> it.noSpace());
		doc.append(iSR, it -> it.setSpace(" "));
	}

}

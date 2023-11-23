package org.xtext.example.mydsl.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;

public class ModelFormatter extends Formatter {

	// This is an example of how to access a keyword which is something between ''
	// in the xtext file
	public static void formatFeatureKeyword(ISemanticRegion iSR, IFormattableDocument doc) {
		doc.prepend(iSR, it -> it.noSpace());
		doc.append(iSR, it -> it.setSpace(" "));
	}

	public static void formatNameRuleCall(ISemanticRegion iSR, IFormattableDocument doc) {
		doc.append(iSR, it -> it.noSpace());
	}

	// This is an example of how to access a terminal.
	// It's also an example of how to replace the text in a ruleCall, in this case,
	// replace multiple \r\n with just 2
	public static void formatEOLRuleCall(ISemanticRegion iSR, IFormattableDocument doc) {
		replace(doc, iSR, "\r\n\r\n");
	}

}

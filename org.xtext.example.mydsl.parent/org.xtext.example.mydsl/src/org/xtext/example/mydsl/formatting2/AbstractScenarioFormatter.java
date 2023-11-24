package org.xtext.example.mydsl.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;

public class AbstractScenarioFormatter extends Formatter {

	public static void formatNameRuleCall(ISemanticRegion iSR, IFormattableDocument doc) {
		doc.append(iSR, it -> it.noSpace());
	}

	public static void formatEOL1RuleCall(ISemanticRegion iSR, IFormattableDocument doc) {
		replace(doc, iSR, "\r\n");
	}

	public static void formatEOL2RuleCall(ISemanticRegion iSR, IFormattableDocument doc) {
		replace(doc, iSR, "\r\n\r\n");
	}
}

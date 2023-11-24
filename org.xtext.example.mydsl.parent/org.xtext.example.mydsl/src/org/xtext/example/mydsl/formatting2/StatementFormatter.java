package org.xtext.example.mydsl.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;

public class StatementFormatter extends ListFormatter {

	public static void formatNameRuleCall(ISemanticRegion iSR, IFormattableDocument doc) {

		// TODO this double space is not taking effect, for now I'm using a text
		// replacer. Remove the whitespace so that it doesn't add 2 spaces each time the
		// formatter is called
		doc.prepend(iSR, it -> it.noSpace());
		doc.append(iSR, it -> it.noSpace());
		replace(doc, iSR, getIndent() + iSR.getText());
	}

	public static void formatEOLRuleCall(ISemanticRegion iSR, IFormattableDocument doc) {
		if (isLast) {
			replace(doc, iSR, "\r\n\r\n");
			isLast = false;
		} else {
			replace(doc, iSR, "\r\n");
		}
	}
}

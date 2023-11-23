package org.xtext.example.mydsl.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;

public class BackgroundFormatter extends Formatter {

	public static void formatBackgroundKeyword(ISemanticRegion iSR, IFormattableDocument doc) {
		doc.prepend(iSR, it -> it.noSpace());
		doc.append(iSR, it -> it.noSpace());
		replace(doc, iSR, "\r\n" + getIndent() + iSR.getText() + " ");
	}

	public static void formatNameRuleCall(ISemanticRegion iSR, IFormattableDocument doc) {
		doc.append(iSR, it -> it.noSpace());
	}

	public static void formatEOLRuleCall(ISemanticRegion iSR, IFormattableDocument doc) {
		replace(doc, iSR, "\r\n\r\n");
	}

}

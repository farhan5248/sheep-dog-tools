package org.xtext.example.mydsl.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;

public class StatementFormatter extends ListFormatter {

	protected static boolean isLast;
	protected static boolean isFirst;
	protected static boolean isLastEOLDouble = true;
	
	public static void isLast(boolean isLast) {
		StatementFormatter.isLast = isLast;
	}

	public static void isFirst(boolean isFirst) {
		StatementFormatter.isFirst = isFirst;
	}

	public static void isLastEOLDouble(boolean isEOLDouble) {
		StatementFormatter.isLastEOLDouble = isEOLDouble;
	}

	public static void formatEOL12RuleCall(ISemanticRegion iSR, IFormattableDocument doc) {

		if (isLast && isLastEOLDouble) {
			replace(doc, iSR, "\r\n\r\n");
		} else {
			replace(doc, iSR, "\r\n");
		}
	}

	public static void formatNameRuleCall(ISemanticRegion iSR, IFormattableDocument doc) {

		// This double space is not taking effect, for now I'm using a text
		// replacer. Remove the whitespace so that it doesn't add 2 spaces each time the
		// formatter is called
		doc.prepend(iSR, it -> it.noSpace());
		doc.append(iSR, it -> it.noSpace());
		replace(doc, iSR, getIndent() + iSR.getText());
	}

}

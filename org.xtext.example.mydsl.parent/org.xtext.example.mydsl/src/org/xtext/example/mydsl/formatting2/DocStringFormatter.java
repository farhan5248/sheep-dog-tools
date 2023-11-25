package org.xtext.example.mydsl.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;

public class DocStringFormatter extends Formatter {

	protected static boolean isLast;
	protected static boolean isLastEOLDouble = true;

	public static void isLast(boolean isLast) {
		RowFormatter.isLast = isLast;
	}

	public static void isLastEOLDouble(boolean isEOLDouble) {
		RowFormatter.isLastEOLDouble = isEOLDouble;
	}

	public static void formatEOL12RuleCall(ISemanticRegion iSR, IFormattableDocument doc) {

		if (isLast && isLastEOLDouble) {
			replace(doc, iSR, "\r\n\r\n");
		} else {
			replace(doc, iSR, "\r\n");
		}
	}
}

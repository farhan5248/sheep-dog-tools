package org.xtext.example.mydsl.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;

public class ListFormatter extends Formatter {

	protected static boolean isLast;
	protected static boolean isFirst;
	
	public static void isLast(boolean isLast) {
		ListFormatter.isLast = isLast;
	}

	public static void isFirst(boolean isFirst) {
		ListFormatter.isFirst = isFirst;
	}
	
	public static void formatEOL12RuleCall(ISemanticRegion iSR, IFormattableDocument doc) {

		if (isLast) {
			replace(doc, iSR, "\r\n\r\n");
		} else {
			replace(doc, iSR, "\r\n");
		}
	}
}

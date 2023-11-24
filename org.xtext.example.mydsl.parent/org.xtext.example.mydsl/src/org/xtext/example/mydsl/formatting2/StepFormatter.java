package org.xtext.example.mydsl.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;

public class StepFormatter extends ListFormatter {

	// Put this here to avoid mixing up nested lists like steps and rows
	// TODO this is duplicated code, maybe if it wasn't static, then there'd be no
	// reason for duplication?
	protected static boolean isLast;
	protected static boolean isFirst;
	protected static boolean isLastEOLDouble = true;

	public static void isLast(boolean isLast) {
		StepFormatter.isLast = isLast;
	}

	public static void isFirst(boolean isFirst) {
		StepFormatter.isFirst = isFirst;
	}

	public static void isLastEOLDouble(boolean isEOLDouble) {
		StepFormatter.isLastEOLDouble = isEOLDouble;
	}

	public static void formatEOL12RuleCall(ISemanticRegion iSR, IFormattableDocument doc) {

		if (isLast && isLastEOLDouble) {
			replace(doc, iSR, "\r\n\r\n");
		} else {
			replace(doc, iSR, "\r\n");
		}
	}

}

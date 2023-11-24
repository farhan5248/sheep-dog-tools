package org.xtext.example.mydsl.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;

public class CellFormatter extends ListFormatter {

	// Put this here to avoid mixing up nested lists like rows and cells
	protected static boolean isLast;
	protected static boolean isFirst;
	
	public static void isLast(boolean isLast) {
		CellFormatter.isLast = isLast;
	}

	public static void isFirst(boolean isFirst) {
		CellFormatter.isFirst = isFirst;
	}

	public static void formatVerticalLineKeyword(ISemanticRegion iSR, IFormattableDocument doc) {
		doc.prepend(iSR, it -> it.noSpace());
		doc.append(iSR, it -> it.noSpace());

		if (isFirst) {
			replace(doc, iSR, getIndent() + iSR.getText() + " ");
			isFirst = false;
		} else {
			replace(doc, iSR, " " + iSR.getText() + " ");
		}
	}
}

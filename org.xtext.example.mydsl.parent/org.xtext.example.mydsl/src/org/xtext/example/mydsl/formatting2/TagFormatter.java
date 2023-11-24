package org.xtext.example.mydsl.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;

public class TagFormatter extends ListFormatter {

	protected static boolean isLast;
	protected static boolean isFirst;

	public static void isLast(boolean isLast) {
		TagFormatter.isLast = isLast;
	}

	public static void isFirst(boolean isFirst) {
		TagFormatter.isFirst = isFirst;
	}

	public static void formatFeatureKeyword(ISemanticRegion iSR, IFormattableDocument doc) {
		doc.prepend(iSR, it -> it.noSpace());
		doc.append(iSR, it -> it.noSpace());
		if (isFirst) {
			replace(doc, iSR, getIndent() + iSR.getText());
		}
	}

	public static void formatNameRuleCall(ISemanticRegion iSR, IFormattableDocument doc) {

		doc.prepend(iSR, it -> it.noSpace());
		doc.append(iSR, it -> it.noSpace());

		if (isLast) {
			replace(doc, iSR, iSR.getText());
		} else {
			replace(doc, iSR, iSR.getText() + " ");
		}
	}
}

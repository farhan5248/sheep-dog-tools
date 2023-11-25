package org.xtext.example.mydsl.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;

public class StatementFormatter extends ListFormatter {

	protected static boolean isLast;
	protected static boolean isFirst;
	protected static boolean isLastEOLDouble = true;
	private static boolean isMinIndentCnt = false;

	public static void isLast(boolean isLast) {
		StatementFormatter.isLast = isLast;
	}

	public static void isFirst(boolean isFirst) {
		StatementFormatter.isFirst = isFirst;
	}

	public static void isLastEOLDouble(boolean isEOLDouble) {
		StatementFormatter.isLastEOLDouble = isEOLDouble;
	}

	public static void setIndent(int indentCnt, boolean isMinIndentCnt) {
		StatementFormatter.isMinIndentCnt = isMinIndentCnt;
		Formatter.setIndent(indentCnt);
	}

	public static void formatEOL12RuleCall(ISemanticRegion iSR, IFormattableDocument doc) {

		if (isLast && isLastEOLDouble) {
			replace(doc, iSR, "\r\n\r\n");
		} else {
			replace(doc, iSR, "\r\n");
		}
	}

	public static void formatNameRuleCall(ISemanticRegion iSR, IFormattableDocument doc) {

		int hiddenLength = iSR.getPreviousHiddenRegion().getText().length();
		doc.prepend(iSR, it -> it.noSpace());
		doc.append(iSR, it -> it.noSpace());
		if (isMinIndentCnt && hiddenLength > getIndent().length()) {
			replace(doc, iSR, indent.repeat(hiddenLength) + iSR.getText());
		} else {
			replace(doc, iSR, getIndent() + iSR.getText());
		}
		// This double space is not taking effect, for now I'm using a text
		// replacer. Remove the whitespace so that it doesn't add 2 spaces each time the
		// formatter is called
	}

}

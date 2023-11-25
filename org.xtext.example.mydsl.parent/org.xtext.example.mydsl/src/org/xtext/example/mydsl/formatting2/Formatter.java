package org.xtext.example.mydsl.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;

public class Formatter {

	protected static String indent = " ";
	protected static int indentCnt = 0;

	public static void setIndent(int indentCnt) {
		Formatter.indentCnt = indentCnt;
	}

	public static String getIndent() {
		return Formatter.indent.repeat(indentCnt);
	}

	protected static void replace(IFormattableDocument doc, ISemanticRegion iSR, String replacement) {
		doc.addReplacer(new TextReplacer(doc, iSR, replacement));
	}

	public static void formatNameRuleCall(ISemanticRegion iSR, IFormattableDocument doc) {
		doc.append(iSR, it -> it.noSpace());
	}

	public static void formatEOL1RuleCall(ISemanticRegion iSR, IFormattableDocument doc) {
		replace(doc, iSR, "\r\n");
	}

	// This is an example of how to access a terminal.
	// It's also an example of how to replace the text in a ruleCall, in this case,
	// replace multiple \r\n with just 2
	public static void formatEOL2RuleCall(ISemanticRegion iSR, IFormattableDocument doc) {
		replace(doc, iSR, "\r\n\r\n");
	}
}

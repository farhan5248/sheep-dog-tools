package org.xtext.example.mydsl.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;

public class Formatter {
	
	private static String indent = " ";
	private static int indentCnt = 0;
	
	public static void setIndent(int indentCnt) {
		Formatter.indentCnt = indentCnt;
	}
	
	public static String getIndent() {
		return Formatter.indent.repeat(indentCnt);
	}
	
	protected static void replace(IFormattableDocument doc, ISemanticRegion iSR, String replacement) {
		doc.addReplacer(new TextReplacer(doc, iSR, replacement));
	}
}

package org.xtext.example.mydsl.formatting2;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;

public class Formatter {

	protected String indent = " ";
	protected int indentCnt = 0;

	public void setIndent(int indentCnt) {
		this.indentCnt = indentCnt;
	}

	public String getIndent() {
		return indent.repeat(indentCnt);
	}

	protected void replace(IFormattableDocument doc, ISemanticRegion iSR, String replacement) {
		doc.addReplacer(new TextReplacer(doc, iSR, replacement));
	}

	public void formatNameRuleCall(ISemanticRegion iSR, IFormattableDocument doc) {
		doc.append(iSR, it -> it.noSpace());
	}

	public void formatEOL1RuleCall(ISemanticRegion iSR, IFormattableDocument doc) {
		replace(doc, iSR, "\r\n");
	}

	// This is an example of how to access a terminal.
	// It's also an example of how to replace the text in a ruleCall, in this case,
	// replace multiple \r\n with just 2
	public void formatEOL2RuleCall(ISemanticRegion iSR, IFormattableDocument doc) {
		replace(doc, iSR, "\r\n\r\n");
	}

	@SuppressWarnings("rawtypes")
	protected boolean isLastElement(EObject o, EList l) {
		int lastIndex = l.size() - 1;
		return o.equals(l.get(lastIndex));
	}

	@SuppressWarnings("rawtypes")
	protected boolean isFirstElement(EObject o, EList l) {
		int firstIndex = 0;
		return o.equals(l.get(firstIndex));
	}
}

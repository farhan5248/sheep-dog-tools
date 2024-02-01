package org.farhan.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.farhan.cucumber.Line;
import org.farhan.services.CucumberGrammarAccess;
import org.farhan.services.CucumberGrammarAccess.LineElements;

public class LineFormatter extends Formatter {

	private boolean isMinIndentCnt = false;

	private Line theLine;

	public LineFormatter(Line theLine) {
		this.theLine = theLine;
	}

	public void setIndent(int indentCnt, boolean isMinIndentCnt) {
		this.isMinIndentCnt = isMinIndentCnt;
		setIndent(indentCnt);
	}

	public void format(IFormattableDocument doc, CucumberGrammarAccess ga, CucumberFormatter df) {
		LineElements a = ga.getLineAccess();
		formatLineBitsRuleCall(df.getRegion(theLine, a.getNameLineBitsParserRuleCall_0_0()), doc);
		formatEOL12RuleCall(df.getRegion(theLine, a.getEOLTerminalRuleCall_1()), doc);
	}

	public void formatLineBitsRuleCall(ISemanticRegion iSR, IFormattableDocument doc) {

		int hiddenLength = iSR.getPreviousHiddenRegion().getText().length();
		doc.prepend(iSR, it -> it.noSpace());
		doc.append(iSR, it -> it.noSpace());
		if (isMinIndentCnt && hiddenLength > getIndent().length()) {
			replace(doc, iSR, indent.repeat(hiddenLength) + iSR.getText());
		} else {
			replace(doc, iSR, getIndent() + iSR.getText());
		}
	}
}

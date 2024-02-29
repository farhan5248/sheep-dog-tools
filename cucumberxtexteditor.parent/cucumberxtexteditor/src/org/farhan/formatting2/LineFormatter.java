package org.farhan.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.farhan.cucumber.Line;
import org.farhan.services.CucumberGrammarAccess;
import org.farhan.services.CucumberGrammarAccess.LineElements;

public class LineFormatter extends Formatter {

	private Line theLine;

	public LineFormatter(Line theLine) {
		this.theLine = theLine;
	}

	public void format(IFormattableDocument doc, CucumberGrammarAccess ga, CucumberFormatter df) {
		LineElements a = ga.getLineAccess();
		// formatLineBitsRuleCall(df.getRegion(theLine,
		// a.getNameLineBitsParserRuleCall_0_0()), doc);
		formatEOL1RuleCall(df.getRegion(theLine, a.getEOLTerminalRuleCall_1()), doc);
	}

	protected void formatEOL1RuleCall(ISemanticRegion iSR, IFormattableDocument doc) {
		doc.prepend(iSR, it -> it.noSpace());
	}

	public void formatLineBitsRuleCall(ISemanticRegion iSR, IFormattableDocument doc) {

		// System.out.println("Line: >>>" + iSR.getText() + "<<<");
		int hiddenLength = iSR.getPreviousHiddenRegion().getText().length();
		doc.prepend(iSR, it -> it.noSpace());
		doc.append(iSR, it -> it.noSpace());
		if (hiddenLength <= getIndent().length() && iSR.getText().length() > 0) {
			replace(doc, iSR, indent.repeat(indentCnt - hiddenLength) + iSR.getText());
		}
	}
}

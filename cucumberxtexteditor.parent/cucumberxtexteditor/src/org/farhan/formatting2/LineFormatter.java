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
		formatLineBitsRuleCall(df.getRegion(theLine, a.getNameLineBitsParserRuleCall_0_0()), doc);
		//formatEOL12RuleCall(df.getRegion(theLine, a.getEOLTerminalRuleCall_1()), doc);
	}

	public void formatLineBitsRuleCall(ISemanticRegion iSR, IFormattableDocument doc) {

		//System.out.println("Line: >>>" + iSR.getText() + "<<<");
		int hiddenLength = iSR.getPreviousHiddenRegion().getText().length();
		if (hiddenLength < getIndent().length() && iSR.getText().length() > 0) {
			replace(doc, iSR, indent.repeat(indentCnt - hiddenLength) + iSR.getText());
		}
	}
}

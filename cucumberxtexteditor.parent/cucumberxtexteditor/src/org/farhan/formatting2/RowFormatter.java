package org.farhan.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.farhan.cucumber.Cell;
import org.farhan.cucumber.Row;
import org.farhan.services.CucumberGrammarAccess;
import org.farhan.services.CucumberGrammarAccess.RowElements;

public class RowFormatter extends Formatter {

	private Row theRow;

	public RowFormatter(Row Row) {
		this.theRow = Row;
	}

	public void format(IFormattableDocument doc, CucumberGrammarAccess ga, CucumberFormatter df) {
		RowElements a = ga.getRowAccess();
		for (Cell c : theRow.getCells()) {
			CellFormatter formatter = new CellFormatter(c);
			formatter.setIndent(10);
			formatter.isLast(isLastElement(c, theRow.getCells()));
			formatter.isFirst(isFirstElement(c, theRow.getCells()));
			formatter.format(doc, ga, df);
		}
		formatKeyword(df.getRegion(theRow, a.getVerticalLineKeyword_1()), doc);
		formatEOL12RuleCall(df.getRegion(theRow, a.getEOLTerminalRuleCall_2()), doc);
	}

	protected void formatKeyword(ISemanticRegion iSR, IFormattableDocument doc) {
		doc.prepend(iSR, it -> it.noSpace());
		doc.append(iSR, it -> it.noSpace());
		replace(doc, iSR, " " + iSR.getText());
	}

}

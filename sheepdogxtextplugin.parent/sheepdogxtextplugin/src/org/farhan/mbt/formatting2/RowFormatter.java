package org.farhan.mbt.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.farhan.mbt.sheepDog.Cell;
import org.farhan.mbt.services.SheepDogGrammarAccess;
import org.farhan.mbt.services.SheepDogGrammarAccess.RowElements;
import org.farhan.mbt.sheepDog.Row;

public class RowFormatter extends Formatter {

	private Row theRow;

	public RowFormatter(Row Row) {
		this.theRow = Row;
	}

	public void format(IFormattableDocument doc, SheepDogGrammarAccess ga, SheepDogFormatter df) {
		RowElements a = ga.getRowAccess();
		for (Cell c : theRow.getCells()) {
			CellFormatter formatter = new CellFormatter(c);
			formatter.isLast(isLastElement(c, theRow.getCells()));
			formatter.isFirst(isFirstElement(c, theRow.getCells()));
			formatter.format(doc, ga, df);
		}
		formatEOL1RuleCall(df.getRegion(theRow, a.getEOLTerminalRuleCall_1()), doc);
	}

}

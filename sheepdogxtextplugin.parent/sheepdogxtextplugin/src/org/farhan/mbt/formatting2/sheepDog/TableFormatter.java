package org.farhan.mbt.formatting2.sheepDog;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.farhan.mbt.sheepDog.Row;
import org.farhan.mbt.formatting2.SheepDogFormatter;
import org.farhan.mbt.services.SheepDogGrammarAccess;
import org.farhan.mbt.services.SheepDogGrammarAccess.TableElements;
import org.farhan.mbt.sheepDog.Table;

public class TableFormatter extends Formatter {

	private Table theStepTable;

	public TableFormatter(Table theStepTable) {
		this.theStepTable = theStepTable;
	}

	public void format(IFormattableDocument doc, SheepDogGrammarAccess ga, SheepDogFormatter df) {
		TableElements a = ga.getTableAccess();
		formatKeywordNoSpace(df.getRegion(theStepTable, a.getVerticalLineEqualsSignEqualsSignEqualsSignKeyword_0()),
				doc);
		formatEOL1RuleCall(df.getRegion(theStepTable, a.getEOLTerminalRuleCall_1()), doc);

		for (Row r : theStepTable.getRows()) {
			RowFormatter formatter = new RowFormatter(r);
			formatter.isLast(isLastElement(r, theStepTable.getRows()));
			formatter.isFirst(isFirstElement(r, theStepTable.getRows()));
			formatter.format(doc, ga, df);
		}
		formatKeywordNoSpace(df.getRegion(theStepTable, a.getVerticalLineEqualsSignEqualsSignEqualsSignKeyword_3()),
				doc);
		formatEOL2RuleCall(df.getRegion(theStepTable, a.getEOLTerminalRuleCall_4()), doc);
	}

}

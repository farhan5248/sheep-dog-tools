package org.farhan.mbt.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.farhan.mbt.cucumber.Row;
import org.farhan.mbt.cucumber.StepTable;
import org.farhan.mbt.services.CucumberGrammarAccess;

public class StepTableFormatter extends Formatter {

	private StepTable theStepTable;

	public void isEOLDouble(boolean isEOLDouble) {
		this.isLastEOLDouble = isEOLDouble;
	}

	public StepTableFormatter(StepTable theStepTable) {
		this.theStepTable = theStepTable;
	}

	public void format(IFormattableDocument doc, CucumberGrammarAccess ga, CucumberFormatter df) {
		for (Row r : theStepTable.getRows()) {
			RowFormatter formatter = new RowFormatter(r);
			formatter.isLast(isLastElement(r, theStepTable.getRows()));
			formatter.isFirst(isFirstElement(r, theStepTable.getRows()));
			formatter.isLastEOLDouble(isLastEOLDouble);
			formatter.setIndent(10);
			formatter.format(doc, ga, df);
		}
	}

}
package org.farhan.mbt.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.farhan.mbt.cucumber.ParametersTable;
import org.farhan.mbt.cucumber.Row;
import org.farhan.mbt.services.CucumberGrammarAccess;

public class ParametersTableFormatter extends Formatter {

	private ParametersTable parametersTable;

	public ParametersTableFormatter(ParametersTable parametersTable) {
		this.parametersTable = parametersTable;
	}

	public void format(IFormattableDocument doc, CucumberGrammarAccess ga, CucumberFormatter df) {

		if (parametersTable != null) {
			for (Row r : parametersTable.getRows()) {
				RowFormatter formatter = new RowFormatter(r);
				formatter.isLast(isLastElement(r, parametersTable.getRows()));
				formatter.isFirst(isFirstElement(r, parametersTable.getRows()));
				formatter.isLastEOLDouble(true);
				formatter.setIndent(6);
				formatter.format(doc, ga, df);
			}
		}
	}

}

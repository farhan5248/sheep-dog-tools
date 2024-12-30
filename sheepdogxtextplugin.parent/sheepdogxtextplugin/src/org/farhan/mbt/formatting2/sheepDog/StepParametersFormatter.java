package org.farhan.mbt.formatting2.sheepDog;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.farhan.mbt.formatting2.SheepDogFormatter;
import org.farhan.mbt.services.SheepDogGrammarAccess;
import org.farhan.mbt.services.SheepDogGrammarAccess.StepParametersElements;
import org.farhan.mbt.sheepDog.Statement;
import org.farhan.mbt.sheepDog.StepParameters;

public class StepParametersFormatter extends Formatter {

	private StepParameters theStepParameters;

	public StepParametersFormatter(StepParameters theStepParameters) {
		this.theStepParameters = theStepParameters;
	}

	public void format(IFormattableDocument doc, SheepDogGrammarAccess ga, SheepDogFormatter df) {
		StepParametersElements a = ga.getStepParametersAccess();

		formatKeywordTrailingSpace(df.getRegion(theStepParameters, a.getEqualsSignEqualsSignEqualsSignKeyword_0()),
				doc);
		formatKeywordTrailingSpace(df.getRegion(theStepParameters, a.getParametersKeyword_1()), doc);
		formatTitle(df.getRegion(theStepParameters, a.getNameTitleParserRuleCall_2_0()), doc);
		formatEOL2RuleCall(df.getRegion(theStepParameters, a.getEOLTerminalRuleCall_3()), doc);

		for (Statement s : theStepParameters.getStatements()) {
			StatementFormatter formatter = new StatementFormatter(s);
			formatter.isLast(isLastElement(s, theStepParameters.getStatements()));
			formatter.format(doc, ga, df);
		}

		if (theStepParameters.getParametersTable() != null) {
			TableFormatter formatter = new TableFormatter(theStepParameters.getParametersTable());
			formatter.format(doc, ga, df);
		}
	}

}

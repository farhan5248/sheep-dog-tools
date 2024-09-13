package org.farhan.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.farhan.cucumber.Statement;
import org.farhan.cucumber.StepParameters;
import org.farhan.services.CucumberGrammarAccess;
import org.farhan.services.CucumberGrammarAccess.StepParametersElements;

public class StepParametersFormatter extends Formatter {

	private StepParameters stepParameters;

	public StepParametersFormatter(StepParameters stepParameters) {
		this.stepParameters = stepParameters;
	}

	public void format(IFormattableDocument doc, CucumberGrammarAccess ga, CucumberFormatter df) {
		StepParametersElements a = ga.getStepParametersAccess();

		formatKeyword(df.getRegion(stepParameters, a.getParametersKeyword_0()), doc);
		formatPhraseRuleCall(df.getRegion(stepParameters, a.getNamePhraseParserRuleCall_1_0()), doc);
		formatEOL2RuleCall(df.getRegion(stepParameters, a.getEOLTerminalRuleCall_2()), doc);
		for (Statement s : stepParameters.getStatements()) {

			StatementFormatter formatter = new StatementFormatter(s);
			formatter.isLast(isLastElement(s, stepParameters.getStatements()));
			formatter.setIndent(6);
			formatter.isLastEOLDouble(true);
			formatter.format(doc, ga, df);
		}
		ParametersTableFormatter formatter = new ParametersTableFormatter(stepParameters.getParametersTable());
		formatter.format(doc, ga, df);
	}
}

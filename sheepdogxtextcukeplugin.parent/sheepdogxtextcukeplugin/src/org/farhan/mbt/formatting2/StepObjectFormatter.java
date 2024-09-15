package org.farhan.mbt.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.farhan.mbt.cucumber.Statement;
import org.farhan.mbt.cucumber.StepDefinition;
import org.farhan.mbt.cucumber.StepObject;
import org.farhan.mbt.services.CucumberGrammarAccess;
import org.farhan.mbt.services.CucumberGrammarAccess.StepObjectElements;

public class StepObjectFormatter extends Formatter {

	private StepObject stepObject;

	public StepObjectFormatter(StepObject stepObject) {
		this.stepObject = stepObject;
	}

	public void format(IFormattableDocument doc, CucumberGrammarAccess ga, CucumberFormatter df) {
		StepObjectElements a = ga.getStepObjectAccess();
		formatKeyword(df.getRegion(stepObject, a.getObjectKeyword_0()), doc);
		formatPhraseRuleCall(df.getRegion(stepObject, a.getNamePhraseParserRuleCall_1_0()), doc);
		formatEOL2RuleCall(df.getRegion(stepObject, a.getEOLTerminalRuleCall_2()), doc);
		for (Statement s : stepObject.getStatements()) {

			StatementFormatter formatter = new StatementFormatter(s);
			formatter.isLast(isLastElement(s, stepObject.getStatements()));
			formatter.setIndent(2);
			formatter.isLastEOLDouble(true);
			formatter.format(doc, ga, df);
		}

		for (StepDefinition s : stepObject.getStepDefinitions()) {

			StepDefinitionFormatter formatter = new StepDefinitionFormatter(s);
			formatter.setIndent(2);
			formatter.format(doc, ga, df);
		}
	}
}

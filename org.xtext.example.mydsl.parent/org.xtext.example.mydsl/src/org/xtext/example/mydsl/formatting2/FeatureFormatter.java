package org.xtext.example.mydsl.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.xtext.example.mydsl.myDsl.AbstractScenario;
import org.xtext.example.mydsl.myDsl.Background;
import org.xtext.example.mydsl.myDsl.Feature;
import org.xtext.example.mydsl.myDsl.Scenario;
import org.xtext.example.mydsl.myDsl.ScenarioOutline;
import org.xtext.example.mydsl.myDsl.Statement;
import org.xtext.example.mydsl.myDsl.Tag;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;
import org.xtext.example.mydsl.services.MyDslGrammarAccess.FeatureElements;

public class FeatureFormatter extends Formatter {

	private Feature theFeature;

	public FeatureFormatter(Feature theFeature) {
		this.theFeature = theFeature;
	}

	// This is an example of how to access a keyword which is something between ''
	// in the xtext file
	public static void formatKeyword(ISemanticRegion iSR, IFormattableDocument doc) {
		doc.prepend(iSR, it -> it.noSpace());
		doc.append(iSR, it -> it.setSpace(" "));
	}

	private AbstractScenarioFormatter newAbstractScenarioFormatter(AbstractScenario s) {
		if (s instanceof Background) {
			return new BackgroundFormatter((Background) s);
		} else if (s instanceof Scenario) {
			return new ScenarioFormatter((Scenario) s);
		} else if (s instanceof ScenarioOutline) {
			return new ScenarioOutlineFormatter((ScenarioOutline) s);
		} else {
			return null;
		}
	}

	public void format(IFormattableDocument doc, MyDslGrammarAccess ga, MyDslFormatter df) {
		FeatureElements a = ga.getFeatureAccess();

		if (!theFeature.getTags().isEmpty()) {
			for (Tag t : theFeature.getTags()) {
				TagFormatter formatter = new TagFormatter(t);
				formatter.isLast(isLastElement(t, theFeature.getTags()));
				formatter.format(doc, ga, df);
			}
			formatEOL1RuleCall(df.getRegion(theFeature, a.getEOLTerminalRuleCall_0_1()), doc);
		}
		formatKeyword(df.getRegion(theFeature, a.getFeatureKeyword_1()), doc);
		// There's two types of assignments, = and += where the latter is a list
		// This is an example of how to access an assignment of just one item.
		// An assignment has 2 parts, the feature (name) and the ruleCall (Phrase)
		// Together they make up an assignment.
		// A ruleCall is anything that's in the xtext file with a :
		// So a ruleCall can be a structure like thing with attributes or a terminal
		formatNameRuleCall(df.getRegion(theFeature, a.getNamePhraseParserRuleCall_2_0()), doc);
		formatEOL2RuleCall(df.getRegion(theFeature, a.getEOLTerminalRuleCall_3()), doc);
		for (Statement s : theFeature.getStatements()) {

			StatementFormatter formatter = new StatementFormatter(s);
			formatter.isLast(isLastElement(s, theFeature.getStatements()));
			formatter.setIndent(2);
			formatter.isLastEOLDouble(true);
			formatter.format(doc, ga, df);
		}

		for (AbstractScenario s : theFeature.getAbstractScenarios()) {

			AbstractScenarioFormatter formatter = newAbstractScenarioFormatter(s);
			formatter.setIndent(2);
			formatter.format(doc, ga, df);
		}
	}
}

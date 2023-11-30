package org.xtext.example.mydsl.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.xtext.example.mydsl.myDsl.Examples;
import org.xtext.example.mydsl.myDsl.Statement;
import org.xtext.example.mydsl.myDsl.Tag;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;
import org.xtext.example.mydsl.services.MyDslGrammarAccess.ExamplesElements;

public class ExampleFormatter extends Formatter {

	private Examples e;

	public ExampleFormatter(Examples theExamples) {
		this.e = theExamples;
	}

	public void format(IFormattableDocument doc, MyDslGrammarAccess ga, MyDslFormatter df) {
		ExamplesElements a = ga.getExamplesAccess();

		if (!e.getTags().isEmpty()) {
			for (Tag t : e.getTags()) {
				TagFormatter formatter = new TagFormatter(t);
				formatter.isLast(isLastElement(t, e.getTags()));
				formatter.isFirst(isFirstElement(t, e.getTags()));
				formatter.setIndent(4);
				formatter.format(doc, ga, df);
			}
			formatEOL1RuleCall(df.getRegion(e, a.getEOLTerminalRuleCall_0_1()), doc);
		}
		formatKeyword(df.getRegion(e, a.getExamplesKeyword_1()), doc);
		formatPhraseRuleCall(df.getRegion(e, a.getNamePhraseParserRuleCall_2_0()), doc);
		formatEOL2RuleCall(df.getRegion(e, a.getEOLTerminalRuleCall_3()), doc);
		for (Statement s : e.getStatements()) {

			StatementFormatter formatter = new StatementFormatter(s);
			formatter.isLast(isLastElement(s, e.getStatements()));
			formatter.setIndent(6);
			formatter.isLastEOLDouble(true);
			formatter.format(doc, ga, df);
		}
		ExamplesTableFormatter formatter = new ExamplesTableFormatter(e.getTheExamplesTable());
		formatter.format(doc, ga, df);
	}
}

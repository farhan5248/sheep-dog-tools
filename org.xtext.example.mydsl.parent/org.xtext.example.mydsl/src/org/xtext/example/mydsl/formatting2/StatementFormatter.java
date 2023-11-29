package org.xtext.example.mydsl.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.xtext.example.mydsl.myDsl.Statement;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;
import org.xtext.example.mydsl.services.MyDslGrammarAccess.StatementElements;

public class StatementFormatter extends Formatter {

	protected boolean isLast;
	protected boolean isLastEOLDouble = true;
	private boolean isMinIndentCnt = false;

	private Statement theStatement;

	public StatementFormatter(Statement theStatement) {
		this.theStatement = theStatement;
	}

	public void isLast(boolean isLast) {
		this.isLast = isLast;
	}

	public void isLastEOLDouble(boolean isEOLDouble) {
		this.isLastEOLDouble = isEOLDouble;
	}

	public void setIndent(int indentCnt, boolean isMinIndentCnt) {
		this.isMinIndentCnt = isMinIndentCnt;
		setIndent(indentCnt);
	}

	public void format(IFormattableDocument doc, MyDslGrammarAccess ga, MyDslFormatter df) {
		StatementElements a = ga.getStatementAccess();
		formatPhraseRuleCall(df.getRegion(theStatement, a.getNamePhraseParserRuleCall_0_0()), doc);
		formatEOL12RuleCall(df.getRegion(theStatement, a.getEOLTerminalRuleCall_1()), doc);
	}

	// TODO move this to Markdown
	// These are examples on how to access something with += loop through the
	// elements and then get the name. The approach is the following, loop
	// through the elements. Then invoke a formatter on the rule call like for name
	// above. The 3 other approaches, feature, keyword and assignment throw
	// exceptions in the regionFor method
	// A note on the regionFor method. It works for statement works but not for
	// name. Like you can't do model.getName() and then pass that to regionFor. The
	// reason being that name has no attributes.
	// This method, like the one for Model is invoked by doc.format like on line 74.
	// What happens is that the doc.format method uses the reflection API to find
	// this method

	public void formatEOL12RuleCall(ISemanticRegion iSR, IFormattableDocument doc) {

		if (isLast && isLastEOLDouble) {
			replace(doc, iSR, "\r\n\r\n");
		} else {
			replace(doc, iSR, "\r\n");
		}
	}

	public void formatPhraseRuleCall(ISemanticRegion iSR, IFormattableDocument doc) {

		int hiddenLength = iSR.getPreviousHiddenRegion().getText().length();
		doc.prepend(iSR, it -> it.noSpace());
		doc.append(iSR, it -> it.noSpace());
		if (isMinIndentCnt && hiddenLength > getIndent().length()) {
			replace(doc, iSR, indent.repeat(hiddenLength) + iSR.getText());
		} else {
			replace(doc, iSR, getIndent() + iSR.getText());
		}
		// TODO move to Markdown
		// This double space is not taking effect, for now I'm using a text
		// replacer. Remove the whitespace so that it doesn't add 2 spaces each time the
		// formatter is called
	}

}

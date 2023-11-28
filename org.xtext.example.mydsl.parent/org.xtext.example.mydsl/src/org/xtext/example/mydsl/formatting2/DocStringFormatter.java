package org.xtext.example.mydsl.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.xtext.example.mydsl.myDsl.DocString;
import org.xtext.example.mydsl.myDsl.Statement;
import org.xtext.example.mydsl.myDsl.Step;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;
import org.xtext.example.mydsl.services.MyDslGrammarAccess.DocStringElements;

public class DocStringFormatter extends Formatter {

	private static boolean isEOLDouble = true;
	private DocString theDocString;

	public DocStringFormatter(DocString theDocString) {
		this.theDocString = theDocString;
	}

	public void format(IFormattableDocument doc, MyDslGrammarAccess ga, MyDslFormatter df) {
		if (theDocString != null) {
			DocStringElements a = ga.getDocStringAccess();
			formatEOL1RuleCall(df.getRegion(theDocString, a.getEOLTerminalRuleCall_1()), doc);
			formatEOL12RuleCall(df.getRegion(theDocString, a.getEOLTerminalRuleCall_4()), doc);
			for (Statement s : theDocString.getStatements()) {
				StatementFormatter formatter = new StatementFormatter(s);
				formatter.isLast(isLastElement(s, theDocString.getStatements()));
				formatter.setIndent(10, true);
				formatter.isLastEOLDouble(false);
				formatter.format(doc, ga, df);
			}
		}
	}

	private void formatEOL12RuleCall(ISemanticRegion iSR, IFormattableDocument doc) {

		if (isEOLDouble) {
			replace(doc, iSR, "\r\n\r\n");
		} else {
			replace(doc, iSR, "\r\n");
		}
	}

	public void isEOLDouble(boolean isEOLDouble) {
		this.isEOLDouble = isEOLDouble;
	}

}

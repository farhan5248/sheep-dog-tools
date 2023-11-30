package org.xtext.example.mydsl.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.xtext.example.mydsl.myDsl.Tag;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;
import org.xtext.example.mydsl.services.MyDslGrammarAccess.TagElements;

public class TagFormatter extends Formatter {

	private Tag theTag;

	public TagFormatter(Tag theTag) {
		this.theTag = theTag;
	}

	public void formatKeyword(ISemanticRegion iSR, IFormattableDocument doc) {
		doc.prepend(iSR, it -> it.noSpace());
		doc.append(iSR, it -> it.noSpace());
		if (isFirst) {
			replace(doc, iSR, getIndent() + iSR.getText());
		}
	}

	public void formatPhraseRuleCall(ISemanticRegion iSR, IFormattableDocument doc) {

		doc.prepend(iSR, it -> it.noSpace());
		doc.append(iSR, it -> it.noSpace());

		if (isLast) {
			replace(doc, iSR, iSR.getText());
		} else {
			replace(doc, iSR, iSR.getText() + " ");
		}
	}

	public void format(IFormattableDocument doc, MyDslGrammarAccess ga, MyDslFormatter df) {
		TagElements a = ga.getTagAccess();
		formatKeyword(df.getRegion(theTag, a.getCommercialAtKeyword_0()), doc);
		formatPhraseRuleCall(df.getRegion(theTag, a.getNameIDTerminalRuleCall_1_0()), doc);
	}

}

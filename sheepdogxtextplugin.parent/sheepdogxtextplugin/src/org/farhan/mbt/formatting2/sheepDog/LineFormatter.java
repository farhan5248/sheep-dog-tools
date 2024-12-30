package org.farhan.mbt.formatting2.sheepDog;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.farhan.mbt.formatting2.SheepDogFormatter;
import org.farhan.mbt.services.SheepDogGrammarAccess;
import org.farhan.mbt.services.SheepDogGrammarAccess.LineElements;
import org.farhan.mbt.sheepDog.Line;

public class LineFormatter extends Formatter {
	private Line theLine;

	public LineFormatter(Line theStatement) {
		this.theLine = theStatement;
	}

	public void format(IFormattableDocument doc, SheepDogGrammarAccess ga, SheepDogFormatter df) {
		LineElements a = ga.getLineAccess();
		formatTitle(df.getRegion(theLine, a.getNameTitleParserRuleCall_0_0()), doc);
		formatEOLnRuleCall(df.getRegion(theLine, a.getEOLTerminalRuleCall_1()), doc);
	}

	protected void formatTitle(ISemanticRegion iSR, IFormattableDocument doc) {
		doc.prepend(iSR, it -> it.noSpace());
		doc.append(iSR, it -> it.noSpace());
		replace(doc, iSR, iSR.getPreviousHiddenRegion().getText() + iSR.getText());
	}
}

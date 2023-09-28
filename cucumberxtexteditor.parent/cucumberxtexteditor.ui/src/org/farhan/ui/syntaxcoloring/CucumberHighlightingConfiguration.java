package org.farhan.ui.syntaxcoloring;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class CucumberHighlightingConfiguration implements IHighlightingConfiguration {

	// TODO there should be as many styles are there are color/font combinations
	// like feature/background/scenario vs given/when/then vs text vs comment vs descriptions
	public static final String KEYWORD_ID = "keyword";
	public static final String STRING_ID = "string";
	public static final String PARAMETER = "parameter";

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(KEYWORD_ID, "Keyword", defaultTextStyle());
		acceptor.acceptDefaultHighlighting(STRING_ID, "String", defaultTextStyle());
	}

	public static TextStyle defaultTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(255, 0, 0));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	public static TextStyle stringTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(42, 0, 255));
		return textStyle;
	}

}

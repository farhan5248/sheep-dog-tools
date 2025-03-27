package org.farhan.dsl.sheepdog.ui.syntaxcoloring;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class SheepDogHighlightingConfiguration implements IHighlightingConfiguration {

	public static final String DEFAULT_ID = "default";
	public static final String KEYWORD_FSE_ID = "keywordfse";
	public static final String KEYWORD_GWT_ID = "keywordgwt";
	public static final String KEYWORD_OBJ_ID = "keywordobj";
	public static final String SL_COMMENT_ID = "comment";
	public static final String STRING_ID = "string";
	public static final String TAG_ID = "tag";
	public static final String PARAMETER_ID = "parameter";
	public static final String DOC_ID = "document";
	public static final String STATEMENT_ID = "statement";

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(DEFAULT_ID, "Default", defaultTextStyle());
		acceptor.acceptDefaultHighlighting(KEYWORD_OBJ_ID, "Keyword OBJ", keywordObjectTextStyle());
		acceptor.acceptDefaultHighlighting(KEYWORD_FSE_ID, "Keyword FSE", keywordFeatureScenarioExamplesTextStyle());
		acceptor.acceptDefaultHighlighting(KEYWORD_GWT_ID, "Keyword GWT", keywordGivenWhenThenTextStyle());
		acceptor.acceptDefaultHighlighting(SL_COMMENT_ID, "Comment", commentTextStyle());
		acceptor.acceptDefaultHighlighting(STRING_ID, "String", stringTextStyle());
		acceptor.acceptDefaultHighlighting(PARAMETER_ID, "Parameter", parameterTextStyle());
		acceptor.acceptDefaultHighlighting(STATEMENT_ID, "Description", statementTextStyle());
		acceptor.acceptDefaultHighlighting(TAG_ID, "Tag", tagTextStyle());
		acceptor.acceptDefaultHighlighting(DOC_ID, "Document", documentTextStyle());
	}

	private TextStyle statementTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(64, 64, 64));
		return textStyle;
	}

	public static TextStyle defaultTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(0, 0, 0));
		return textStyle;
	}

	public static TextStyle documentTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(64, 128, 64));
		return textStyle;
	}

	public static TextStyle keywordObjectTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0, 128, 0));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	public static TextStyle keywordFeatureScenarioExamplesTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(128, 128, 0));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	public static TextStyle keywordGivenWhenThenTextStyle() {
		TextStyle textStyle = keywordFeatureScenarioExamplesTextStyle().copy();
		textStyle.setColor(new RGB(0, 128, 128));
		return textStyle;
	}

	public static TextStyle commentTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(128, 0, 0));
		return textStyle;
	}

	public static TextStyle tagTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0, 128, 255));
		return textStyle;
	}

	public static TextStyle stringTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0, 0, 0));
		return textStyle;
	}

	public static TextStyle parameterTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(255, 128, 0));
		return textStyle;
	}

}

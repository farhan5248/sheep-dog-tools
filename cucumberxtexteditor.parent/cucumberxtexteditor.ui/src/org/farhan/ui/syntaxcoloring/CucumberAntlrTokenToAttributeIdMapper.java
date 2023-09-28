package org.farhan.ui.syntaxcoloring;

import org.eclipse.xtext.ide.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;

public class CucumberAntlrTokenToAttributeIdMapper extends AbstractAntlrTokenToAttributeIdMapper {

	@Override
	protected String calculateId(final String tokenName, final int tokenType) {
		if (tokenName == null) {
			return CucumberHighlightingConfiguration.DEFAULT_ID;
		}

		switch (tokenName) {
		case "RULE_EOL":
			// nothing to do here
		case "RULE_TAG":
			return CucumberHighlightingConfiguration.TAG_ID;
		case "RULE_WORD":
			return CucumberHighlightingConfiguration.STRING_ID;
		case "RULE_WS":
			// nothing to do here
		case "RULE_COMMENT":
			return CucumberHighlightingConfiguration.COMMENT_ID;

		case "'Feature:'":
			return CucumberHighlightingConfiguration.KEYWORD_FSE_ID;
		case "'Background:'":
			return CucumberHighlightingConfiguration.KEYWORD_FSE_ID;
		case "'Scenario:'":
			return CucumberHighlightingConfiguration.KEYWORD_FSE_ID;
		case "'Scenario Outline:'":
			return CucumberHighlightingConfiguration.KEYWORD_FSE_ID;
		case "'Examples:'":
			return CucumberHighlightingConfiguration.KEYWORD_FSE_ID;

		case "'Given'":
			return CucumberHighlightingConfiguration.KEYWORD_GWT_ID;
		case "'When'":
			return CucumberHighlightingConfiguration.KEYWORD_GWT_ID;
		case "'Then'":
			return CucumberHighlightingConfiguration.KEYWORD_GWT_ID;
		case "'And'":
			return CucumberHighlightingConfiguration.KEYWORD_GWT_ID;
		case "'But'":
			return CucumberHighlightingConfiguration.KEYWORD_GWT_ID;
		case "'*'":
			return CucumberHighlightingConfiguration.KEYWORD_GWT_ID;

		case "'|'":
			return CucumberHighlightingConfiguration.DEFAULT_ID;
		case "'\"\"\"'":
			return CucumberHighlightingConfiguration.DOC_ID;

		default:
			return CucumberHighlightingConfiguration.DEFAULT_ID;
		}
	}
}

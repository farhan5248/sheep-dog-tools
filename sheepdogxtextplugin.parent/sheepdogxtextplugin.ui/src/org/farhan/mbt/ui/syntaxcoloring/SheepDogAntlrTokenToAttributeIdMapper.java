package org.farhan.mbt.ui.syntaxcoloring;

import org.eclipse.xtext.ide.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;

public class SheepDogAntlrTokenToAttributeIdMapper extends AbstractAntlrTokenToAttributeIdMapper {

	@Override
	protected String calculateId(final String tokenName, final int tokenType) {
		if (tokenName == null) {
			return SheepDogHighlightingConfiguration.DEFAULT_ID;
		}

		switch (tokenName) {
		case "RULE_EOL":
			// nothing to do here
		case "RULE_WORD":
			return SheepDogHighlightingConfiguration.STRING_ID;
		case "RULE_WS":
			// nothing to do here
		case "RULE_SL_COMMENT":
			return SheepDogHighlightingConfiguration.SL_COMMENT_ID;
		case "'='":
			return SheepDogHighlightingConfiguration.KEYWORD_OBJ_ID;
		case "'=='":
			return SheepDogHighlightingConfiguration.KEYWORD_OBJ_ID;
		case "'==='":
			return SheepDogHighlightingConfiguration.KEYWORD_OBJ_ID;
		case "'Object:'":
			return SheepDogHighlightingConfiguration.KEYWORD_OBJ_ID;
		case "'Definition:'":
			return SheepDogHighlightingConfiguration.KEYWORD_OBJ_ID;
		case "'Parameters:'":
			return SheepDogHighlightingConfiguration.KEYWORD_OBJ_ID;
		case "'Feature:'":
			return SheepDogHighlightingConfiguration.KEYWORD_FSE_ID;
		case "'Background:'":
			return SheepDogHighlightingConfiguration.KEYWORD_FSE_ID;
		case "'Scenario:'":
			return SheepDogHighlightingConfiguration.KEYWORD_FSE_ID;
		case "'Examples:'":
			return SheepDogHighlightingConfiguration.KEYWORD_FSE_ID;
		case "'Given'":
			return SheepDogHighlightingConfiguration.KEYWORD_GWT_ID;
		case "'When'":
			return SheepDogHighlightingConfiguration.KEYWORD_GWT_ID;
		case "'Then'":
			return SheepDogHighlightingConfiguration.KEYWORD_GWT_ID;
		case "'And'":
			return SheepDogHighlightingConfiguration.KEYWORD_GWT_ID;
		case "'[options=\"header\"]'":
			return SheepDogHighlightingConfiguration.DOC_ID;
		case "'|==='":
			return SheepDogHighlightingConfiguration.DOC_ID;
		case "'|'":
			return SheepDogHighlightingConfiguration.DOC_ID;
		case "'----'":
			return SheepDogHighlightingConfiguration.DOC_ID;
		case "'[tags=\"'":
			return SheepDogHighlightingConfiguration.TAG_ID;
		case "'\"]'":
			return SheepDogHighlightingConfiguration.TAG_ID;
		case "':tags:'":
			return SheepDogHighlightingConfiguration.TAG_ID;
		default:
			return SheepDogHighlightingConfiguration.DEFAULT_ID;
		}
	}
}

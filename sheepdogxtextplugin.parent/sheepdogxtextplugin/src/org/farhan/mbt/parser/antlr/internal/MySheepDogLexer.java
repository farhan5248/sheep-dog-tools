package org.farhan.mbt.parser.antlr.internal;

import org.eclipse.xtext.parser.antlr.Lexer;
import org.farhan.mbt.parser.antlr.internal.InternalSheepDogLexer;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MySheepDogLexer extends InternalSheepDogLexer {

	// TODO maybe these should all be one flag called escapeKeyword?
	private boolean isDocString = false;
	private boolean isCell = false;
	private boolean isTag = false;
	private boolean isTitle = false;

	public MySheepDogLexer() {
	}

	public MySheepDogLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}

	public MySheepDogLexer(CharStream input, RecognizerSharedState state) {
		super(input, state);
	}

	public boolean isKeyword(String s) throws MismatchedTokenException {
		int i = 0;
		while (i < s.length()) {
			input.LA(i + 1);
			if (input.LA(i + 1) != s.charAt(i)) {
				return false;
			}
			i++;
		}
		// System.out.println(">>>" + s + "<<<");
		return true;
	}

	@Override
	public void mTokens() throws RecognitionException {
		// TODO document how to update the lexer in markdown
		// get the position from input and find the next set of non-space characters
		// This is a hack, ideally the xtext grammar file needs to be defined better,
		// when I have more time I'll review the need to do this but for now I figured
		// it'd be a good example on how to hack the lexer for newbies

		if (isKeyword("----")) {
			mRULE_RAWTEXT();// ( '----' RULE_EOL ( . )+ '----' RULE_EOL )
		} else if (isKeyword("#")) {
			mRULE_SL_COMMENT();
		} else if (isKeyword("\n")) {
			mRULE_EOL();
			isTag = false;
			isCell = false;
			isTitle = false;
		} else if (isKeyword(" ") || isKeyword("\t") || isKeyword("\r")) {
			mRULE_WS();
		} else if (isKeyword("|===")) {
			mT__25();// '|==='
		} else if (isKeyword("|")) {
			mT__29();// '|'
			isCell = true;
		} else if (isKeyword("[options=\"header\"]")) {
			mT__24();// '[options=\"header\"]'
		} else if (isKeyword("[tags=\"")) {
			mT__27();// '[tags=\"'
			isTag = true;
		} else if (isKeyword("\"]")) {
			mT__28();// '\"]'
			isTag = false;
		} else if (isKeyword(":tags:")) {
			mT__26();// ( ':tags:' )
			isTag = true;
		} else if (isCell) {
			mRULE_WORD();
		} else if (isTag) {
			mRULE_TAGWORD();
		} else if (isKeyword("===")) {
			mT__14();// '==='
		} else if (isKeyword("==")) {
			mT__12();// '=='
		} else if (isKeyword("=")) {
			mT__10();// '='
		} else if (isKeyword("Object:")) {
			mT__11();// 'Object:'
		} else if (isKeyword("Definition:")) {
			mT__13();// 'Definition:'
		} else if (isKeyword("Parameters:")) {
			mT__15();// 'Parameters:'
		} else if (isKeyword("Feature:")) {
			mT__16();// 'Feature:'
		} else if (isKeyword("Background:")) {
			mT__17();// 'Background:'
		} else if (isKeyword("Scenario:")) {
			mT__18();// 'Scenario:'
		} else if (isKeyword("Examples:")) {
			mT__19();// 'Examples:'
		} else if (isTitle) {
			mRULE_WORD();
		} else if (isKeyword("Given")) {
			mT__20();// 'Given'
			isTitle = true;
		} else if (isKeyword("When")) {
			mT__21();// 'When'
			isTitle = true;
		} else if (isKeyword("Then")) {
			mT__22();// 'Then'
			isTitle = true;
		} else if (isKeyword("And")) {
			mT__23();// 'And'
			isTitle = true;
		} else {
			mRULE_WORD();
		}
	}
}
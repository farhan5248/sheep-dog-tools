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
			mT__23();// InternalSheepDog.g:25:9: '----'
			isDocString = !isDocString;
		} else if (isKeyword("#")) {
			mRULE_SL_COMMENT();
		} else if (isKeyword("\n")) {
			mRULE_EOL();
			isTag = false;
			isCell = false;
			isTitle = false;
		} else if (isKeyword(" ") || isKeyword("\t") || isKeyword("\r")) {
			mRULE_WS();
		} else if (isDocString) {
			mRULE_WORD();
		} else if (isKeyword("===")) {
			mT__13();// InternalSheepDog.g:15:9: '==='
		} else if (isKeyword("==")) {
			mT__11();// InternalSheepDog.g:13:9: '=='
		} else if (isKeyword("=")) {
			mT__9();// InternalSheepDog.g:11:9: '='
		} else if (isKeyword("|===")) {
			mT__25();// InternalSheepDog.g:27:9: '|==='
		} else if (isKeyword("|")) {
			mT__29();// InternalSheepDog.g:30:9: '|'
			isCell = true;
		} else if (isCell) {
			mRULE_WORD();
		} else if (isKeyword("[options=\"header\"]")) {
			mT__24();// InternalSheepDog.g:26:9: '[options=\"header\"]'
		} else if (isKeyword("[tags=\"")) {
			mT__27();// InternalSheepDog.g:28:9: '[tags=\"'
			isTag = true;
		} else if (isKeyword("\"]")) {
			mT__28();// InternalSheepDog.g:29:9: '\"]'
			isTag = false;
		} else if (isKeyword(":tags:")) {
			mT__26();// InternalSheepDog.g:28:7: ( ':tags:' )
			isTag = true;
		} else if (isTag) {
			// TODO remove tagword definition in xtext file
			mRULE_WORD();
		} else if (isKeyword("Object:")) {
			mT__10();// InternalSheepDog.g:12:9: 'Object:'
		} else if (isKeyword("Definition:")) {
			mT__12();// InternalSheepDog.g:14:9: 'Definition:'
		} else if (isKeyword("Parameters:")) {
			mT__14();// InternalSheepDog.g:16:9: 'Parameters:'
		} else if (isKeyword("Feature:")) {
			mT__15();// InternalSheepDog.g:17:9: 'Feature:'
		} else if (isKeyword("Background:")) {
			mT__16();// InternalSheepDog.g:18:9: 'Background:'
		} else if (isKeyword("Scenario:")) {
			mT__17();// InternalSheepDog.g:19:9: 'Scenario:'
		} else if (isKeyword("Examples:")) {
			mT__18();// InternalSheepDog.g:20:9: 'Examples:'
		} else if (isTitle) {
			mRULE_WORD();
		} else if (isKeyword("Given")) {
			mT__19();// InternalSheepDog.g:21:9: 'Given'
			isTitle = true;
		} else if (isKeyword("When")) {
			mT__20();// InternalSheepDog.g:22:9: 'When'
			isTitle = true;
		} else if (isKeyword("Then")) {
			mT__21();// InternalSheepDog.g:23:9: 'Then'
			isTitle = true;
		} else if (isKeyword("And")) {
			mT__22();// InternalSheepDog.g:24:9: 'And'
			isTitle = true;
		} else {
			mRULE_WORD();
		}
	}
}
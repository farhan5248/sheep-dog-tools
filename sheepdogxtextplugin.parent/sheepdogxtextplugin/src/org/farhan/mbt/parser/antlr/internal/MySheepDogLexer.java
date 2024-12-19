package org.farhan.mbt.parser.antlr.internal;

import org.eclipse.xtext.parser.antlr.Lexer;
import org.farhan.mbt.parser.antlr.internal.InternalSheepDogLexer;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MySheepDogLexer extends InternalSheepDogLexer {

	private boolean isDocString = false;
	private int docStringIndent = 0;
	private boolean lastTokenIsEOL = true;
	private boolean isTagLine = false;

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
		if (isKeyword("===")) {
			mT__12();// InternalSheepDog.g:15:9: '==='
		} else if (isKeyword("==")) {
			mT__10();// InternalSheepDog.g:13:9: '=='
		} else if (isKeyword("=")) {
			mT__8();// InternalSheepDog.g:11:9: '='
		} else if (isKeyword("----")) {
			mT__22();// InternalSheepDog.g:25:9: '----'
		} else if (isKeyword("|===")) {
			mT__24();// InternalSheepDog.g:27:9: '|==='
		} else if (isKeyword("|")) {
			mT__27();// InternalSheepDog.g:30:9: '|'
		} else if (isKeyword("[options=\"header\"]")) {
			mT__23();// InternalSheepDog.g:26:9: '[options=\"header\"]'
		} else if (isKeyword("[tags=\"")) {
			mT__25();// InternalSheepDog.g:28:9: '[tags=\"'
		} else if (isKeyword("\"]")) {
			mT__26();// InternalSheepDog.g:29:9: '\"]'
		} else if (isKeyword("And")) {
			mT__21();// InternalSheepDog.g:24:9: 'And'
		} else if (isKeyword("Background:")) {
			mT__15();// InternalSheepDog.g:18:9: 'Background:'
		} else if (isKeyword("Definition:")) {
			mT__11();// InternalSheepDog.g:14:9: 'Definition:'
		} else if (isKeyword("Examples:")) {
			mT__17();// InternalSheepDog.g:20:9: 'Examples:'
		} else if (isKeyword("Feature:")) {
			mT__14();// InternalSheepDog.g:17:9: 'Feature:'
		} else if (isKeyword("Given")) {
			mT__18();// InternalSheepDog.g:21:9: 'Given'
		} else if (isKeyword("Object:")) {
			mT__9();// InternalSheepDog.g:12:9: 'Object:'
		} else if (isKeyword("Parameters:")) {
			mT__13();// InternalSheepDog.g:16:9: 'Parameters:'
		} else if (isKeyword("Scenario:")) {
			mT__16();// InternalSheepDog.g:19:9: 'Scenario:'
		} else if (isKeyword("Then")) {
			mT__20();// InternalSheepDog.g:23:9: 'Then'
		} else if (isKeyword("When")) {
			mT__19();// InternalSheepDog.g:22:9: 'When'
		} else if (isKeyword(" ") || isKeyword("\t") || isKeyword("\r")) {
			mRULE_WS();
		} else if (isKeyword("#")) {
			mRULE_SL_COMMENT();
		} else if (isKeyword("\n")) {
			mRULE_EOL();
		} else {
			mRULE_WORD();
		}
	}
}
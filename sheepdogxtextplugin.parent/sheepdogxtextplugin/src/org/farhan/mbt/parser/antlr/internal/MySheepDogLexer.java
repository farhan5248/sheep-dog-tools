package org.farhan.mbt.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
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
			if (input.LA(i) != s.charAt(i)) {
				return false;
			}
			i++;
		}
		return true;
	}

	@Override
	public void mTokens() throws RecognitionException {
		// TODO document how to update the lexer in markdown
		// get the position from input and find the next set of non-space characters

		if (isKeyword("===")) {

		} else if (isKeyword("==")) {

		} else if (isKeyword("=")) {

		} else {

		}

		mT__10();// InternalSheepDog.g:11:9: '='
		mT__11();// InternalSheepDog.g:12:9: 'Object:'
		mT__16();// InternalSheepDog.g:17:9: 'Feature:'
		mT__12();// InternalSheepDog.g:13:9: '=='

		mT__13();// InternalSheepDog.g:14:9: 'Definition:'
		mT__17();// InternalSheepDog.g:18:9: 'Background:'
		mT__18();// InternalSheepDog.g:19:9: 'Scenario:'

		mT__14();// InternalSheepDog.g:15:9: '==='
		mT__15();// InternalSheepDog.g:16:9: 'Parameters:'
		mT__19();// InternalSheepDog.g:20:9: 'Examples:'
		mT__20();// InternalSheepDog.g:21:9: 'Given'
		mT__21();// InternalSheepDog.g:22:9: 'When'
		mT__22();// InternalSheepDog.g:23:9: 'Then'
		mT__23();// InternalSheepDog.g:24:9: 'And'

		mT__24();// InternalSheepDog.g:25:9: '----'

		mT__25();// InternalSheepDog.g:26:9: '[options=\"header\"]'
		mT__26();// InternalSheepDog.g:27:9: '|==='
		mT__29();// InternalSheepDog.g:30:9: '|'

		mT__27();// InternalSheepDog.g:28:9: '[tags=\"'
		mT__28();// InternalSheepDog.g:29:9: '\"]'

		mRULE_ID();
		mRULE_WORD();
		mRULE_WS();
		mRULE_SL_COMMENT();
		mRULE_EOL();

		mRULE_STRING();

	}

	// TODO maybe this isn't needed @Override
	public Token nextToken1() {
		Token t = super.nextToken();
		String tokenText = t.getText();
		if (tokenText == null) {
			return t;
		}
		System.out.println("nextToken >>>" + t.getText() + "<<< " + t.getType());
		docStringHandler(t);
		if (isKeyword(t.getType())) {
			keywordHandler(t);
		} else if (t.getType() == 0) {
			// TODO I'm not sure this is needed since there's no scenario outline in this
			// language
			// keywordErrorHandler(t);
		} else {
			textHandler(t);
		}
		return t;
	}

	private void textHandler(Token t) {
		if (t.getType() == RULE_EOL) {
			lastTokenIsEOL = true;
			// we're leaving the tag line
			isTagLine = false;
		} else {
			if (t.getType() == RULE_WS) {
				// if it's all whitespace (and not Scenario O) ignore the whitespace
			} else {
				lastTokenIsEOL = false;
			}
		}
	}

	private void keywordErrorHandler(Token t) {
		// if it begins with "Scenario " but isn't Scenario Outline: then change
		// it's type to RULE_STRING
		if (t.getText().startsWith("Scenario ") && !t.getText().contentEquals("Scenario Outline:")) {
			t.setType(RULE_STRING);
		}
		lastTokenIsEOL = false;
	}

	private void keywordHandler(Token t) {
		// This handles keywords not in a docstring
		// If it's a identified as a keyword but doesn't have a new line on its left,
		// then it should be a string
		if (t.getType() != 29) {
			// if it's a cell delimiter
			if (lastTokenIsEOL) {
				// this is an actual keyword
				if (t.getType() == 27) {
					// if it's an tag
					isTagLine = true;
				}
			} else {
				if (t.getType() != 27 || !isTagLine) {
					// if it's a tag and we're on a tag line, then treat it as a tag
				} else {
					t.setType(RULE_STRING);
				}
			}
		}
		lastTokenIsEOL = false;
	}

	private void docStringHandler(Token t) {
		if (!isDocString && t.getText().contentEquals("----")) {
			isDocString = true;
		} else if (!isDocString && !t.getText().contentEquals("----")) {
			// The last token before the docstring should be the whitespace so we'll use
			// that as the default white space for the entire docstring
			docStringIndent = t.getText().length();
			// System.out.println("Setting the indent to: " + docStringIndent);
		} else if (isDocString && t.getText().contentEquals("----")) {
			isDocString = false;
		} else if (isDocString && !t.getText().contentEquals("----")) {
			if (t.getType() != RULE_EOL && !isLeadingWhiteSpace(t)) {
				System.out.println("Converting Token >>>" + t.getText() + "<<< " + t.getType());
				// The length check is there so that the whitespace before the closing """ isn't
				// ignored. When it's ignored, it looks like there's a line bit without an EOL
				// before the closing """ which is a syntax error
				t.setType(RULE_STRING);
			} else {
				System.out.println("Ignoring Token >>>" + t.getText() + "<<< " + t.getType());
			}
		}
	}

	private boolean isLeadingWhiteSpace(Token t) {
		if (t.getType() != RULE_WS) {
			return false;
		} else if (!lastTokenIsEOL) {
			return false;
		} else if (t.getText().length() > docStringIndent) {
			return false;
		} else {
			return true;
		}
	}

	private boolean isKeyword(int type) {
		if (type == T__10) {
			// =
			return true;
		} else if (type == T__11) {
			// Object:
			return true;
		} else if (type == T__12) {
			// ==
			return true;
		} else if (type == T__13) {
			// Definition:
			return true;
		} else if (type == T__14) {
			// ===
			return true;
		} else if (type == T__15) {
			// Parameters:
			return true;
		} else if (type == T__16) {
			// Feature:
			return true;
		} else if (type == T__17) {
			// Background:
			return true;
		} else if (type == T__18) {
			// Scenario:
			return true;
		} else if (type == T__19) {
			// Examples:
			return true;
		} else if (type == T__20) {
			// Given
			return true;
		} else if (type == T__21) {
			// When
			return true;
		} else if (type == T__22) {
			// Then
			return true;
		} else if (type == T__23) {
			// And
			return true;
		} else if (type == T__24) {
			// ----
			return true;
		} else if (type == T__25) {
			// [options=\"header\"]
			return true;
		} else if (type == T__26) {
			// |===
			return true;
		} else if (type == T__27) {
			// [tags=\"
			return true;
		} else if (type == T__28) {
			// \"]
			return true;
		} else if (type == T__29) {
			// |
			return true;
		} else {
			return false;
		}
	}
}
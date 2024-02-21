package org.farhan.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
import org.farhan.parser.antlr.internal.InternalCucumberLexer;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MyCucumberLexer extends InternalCucumberLexer {

	private boolean isDocString = false;
	private boolean lastTokenHasNewLine = true;
	private boolean isTagLine = false;

	public MyCucumberLexer() {
	}

	public MyCucumberLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}

	public MyCucumberLexer(CharStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override
	public Token nextToken() {
		Token t = super.nextToken();
		String tokenText = t.getText();
		if (tokenText == null) {
			return t;
		}
		//System.out.println("Handling Token >>>" + tokenText + "<<< " + t.getType());

		// This handles keywords in a docstring
		if (!isDocString && tokenText.contentEquals("\"\"\"")) {
			isDocString = true;
		} else if (isDocString && tokenText.contentEquals("\"\"\"")) {
			isDocString = false;
		} else if (isDocString && !tokenText.contentEquals("\"\"\"")) {
			if (isKeyword(t.getType())) {
				t.setType(RULE_STRING);
			}
		}
		// This handles keywords not in a docstring
		// If it's a identified as a keyword but doesn't have a new line on its left,
		// then it should be a string
		if (isKeyword(t.getType())) {
			if (t.getType() == 15) {
				// the | can occur multiple times on one line. It's not always
				// preceded by new lines. This is escaped with \
			} else {
				if (lastTokenHasNewLine) {
					// this is an actual keyword
					if (t.getType() == 23) {
						// if it's an @
						isTagLine = true;
					}
				} else {
					if (t.getType() == 23 && isTagLine) {
						// if it's an @ and we're on a tag line, then treat it as a tag
					} else {
						t.setType(RULE_STRING);
					}
				}
			}
			lastTokenHasNewLine = false;
		} else if (t.getType() == 0) {
			// if it begins with "Scenario " but isn't Scenario Outline: then change
			// it's type to RULE_STRING
			if (tokenText.startsWith("Scenario ") && !tokenText.contentEquals("Scenario Outline:")) {
				t.setType(RULE_STRING);
			}
			lastTokenHasNewLine = false;
		} else {
			if (tokenText.contains("\n")) {
				lastTokenHasNewLine = true;
				// we're leaving the tag line
				isTagLine = false;
			} else {
				if (tokenText.replace(" ", "").length() == 0) {
					// if it's all whitespace (and not Scenario O) ignore the whitespace
				} else {
					lastTokenHasNewLine = false;
				}
			}
		}
		return t;
	}

	private boolean isKeyword(int type) {
		if (type == T__10) {
			// Feature:
			return true;
		} else if (type == T__11) {
			// Background:
			return true;
		} else if (type == T__12) {
			// Scenario:
			return true;
		} else if (type == T__13) {
			// Scenario Outline:
			return true;
		} else if (type == T__14) {
			// Examples:
			return true;
		} else if (type == T__15) {
			// |
			return true;
		} else if (type == T__16) {
			// """
			return true;
		} else if (type == T__17) {
			// Given
			return true;
		} else if (type == T__18) {
			// When
			return true;
		} else if (type == T__19) {
			// Then
			return true;
		} else if (type == T__20) {
			// And
			return true;
		} else if (type == T__21) {
			// But
			return true;
		} else if (type == T__22) {
			// *
			return true;
		} else if (type == T__23) {
			// @
			return true;
		} else {
			return false;
		}
	}
}
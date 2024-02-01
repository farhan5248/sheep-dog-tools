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
		if (!isDocString && tokenText.contentEquals("\"\"\"")) {
			isDocString = true;
		} else if (isDocString && tokenText.contentEquals("\"\"\"")) {
			isDocString = false;
		} else if (isDocString && !tokenText.contentEquals("\"\"\"")) {
			// TODO if the type is any of the keywords, change it to STRING
			if (isKeyword(t.getType())) {
				//System.out.println("Changing Type >>>" + tokenText + "<<<");
				t.setType(RULE_STRING);
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
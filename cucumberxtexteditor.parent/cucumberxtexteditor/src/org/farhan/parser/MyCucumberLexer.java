package org.farhan.parser;

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

		// TODO override this, start by debugging from this point.
		while (true) {
			state.token = null;
			state.channel = Token.DEFAULT_CHANNEL;
			state.tokenStartCharIndex = input.index();
			state.tokenStartCharPositionInLine = input.getCharPositionInLine();
			state.tokenStartLine = input.getLine();
			state.text = null;
			if (input.LA(1) == CharStream.EOF) {
				return Token.EOF_TOKEN;
			}
			try {
				mTokens();
				if (state.token == null) {
					emit();
				} else if (state.token == Token.SKIP_TOKEN) {
					continue;
				}
				// TODO this is temporary to figure out what the nextToken method returns
				System.out.println("Token >>>" + state.token.getText() + "<<<");
				return state.token;
			} catch (NoViableAltException nva) {
				reportError(nva);
				recover(nva); // throw out current char and try again
			} catch (RecognitionException re) {
				reportError(re);
				// match() routine has already called recover()
			}
		}
	}
}
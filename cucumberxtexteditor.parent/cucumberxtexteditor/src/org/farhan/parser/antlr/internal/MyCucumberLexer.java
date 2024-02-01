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

	private static boolean isDocString = false;

	public MyCucumberLexer() {
	}

	public MyCucumberLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}

	public MyCucumberLexer(CharStream input, RecognizerSharedState state) {
		super(input, state);
	}

	// TODO if this is not being updated, delete it
	public void mTokens1() throws RecognitionException {
		// InternalCucumber.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 |
		// T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | RULE_ID |
		// RULE_WORD | RULE_STRING | RULE_WS | RULE_SL_COMMENT | RULE_EOL )
		int alt9 = 20;
		alt9 = dfa9.predict(input);
		switch (alt9) {
		case 1:
		// InternalCucumber.g:1:10: T__10
		{
			mT__10();

		}
			break;
		case 2:
		// InternalCucumber.g:1:16: T__11
		{
			mT__11();

		}
			break;
		case 3:
		// InternalCucumber.g:1:22: T__12
		{
			mT__12();

		}
			break;
		case 4:
		// InternalCucumber.g:1:28: T__13
		{
			mT__13();

		}
			break;
		case 5:
		// InternalCucumber.g:1:34: T__14
		{
			mT__14();

		}
			break;
		case 6:
		// InternalCucumber.g:1:40: T__15
		{
			mT__15();

		}
			break;
		case 7:
		// InternalCucumber.g:1:46: T__16
		{
			mT__16();

		}
			break;
		case 8:
		// InternalCucumber.g:1:52: T__17
		{
			mT__17();

		}
			break;
		case 9:
		// InternalCucumber.g:1:58: T__18
		{
			mT__18();

		}
			break;
		case 10:
		// InternalCucumber.g:1:64: T__19
		{
			mT__19();

		}
			break;
		case 11:
		// InternalCucumber.g:1:70: T__20
		{
			mT__20();

		}
			break;
		case 12:
		// InternalCucumber.g:1:76: T__21
		{
			mT__21();

		}
			break;
		case 13:
		// InternalCucumber.g:1:82: T__22
		{
			mT__22();

		}
			break;
		case 14:
		// InternalCucumber.g:1:88: T__23
		{
			mT__23();

		}
			break;
		case 15:
		// InternalCucumber.g:1:94: RULE_ID
		{
			mRULE_ID();

		}
			break;
		case 16:
		// InternalCucumber.g:1:102: RULE_WORD
		{
			mRULE_WORD();

		}
			break;
		case 17:
		// InternalCucumber.g:1:112: RULE_STRING
		{
			mRULE_STRING();

		}
			break;
		case 18:
		// InternalCucumber.g:1:124: RULE_WS
		{
			mRULE_WS();

		}
			break;
		case 19:
		// InternalCucumber.g:1:132: RULE_SL_COMMENT
		{
			mRULE_SL_COMMENT();

		}
			break;
		case 20:
		// InternalCucumber.g:1:148: RULE_EOL
		{
			mRULE_EOL();

		}
			break;

		}
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
				// TODO wrap this all in a method so it's easy to update
				Token t = state.token;
				String tokenText = t.getText();
				if (!isDocString && tokenText.contentEquals("\"\"\"")) {
					isDocString = true;
				} else if (isDocString && tokenText.contentEquals("\"\"\"")) {
					isDocString = false;
				} else if (isDocString && !tokenText.contentEquals("\"\"\"")) {
					// TODO if the type is any of the keywords, change it to WORD which supports :,
					// though if it's a table vertical bar, then use STRING
					if (tokenText.contentEquals("\n")) {
						System.out.println("Changing Token >>>" + tokenText + "<<<");
						t.setType(RULE_STRING);
					}
				}
				System.out.println("Keeping Token >>>" + tokenText + "<<<");
				// end of wrapped code
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
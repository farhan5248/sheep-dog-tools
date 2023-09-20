package org.farhan.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCucumberLexer extends Lexer {
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int T__7=7;
    public static final int T__6=6;
    public static final int T__5=5;
    public static final int RULE_WORD=4;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int EOF=-1;
    public static final int T__10=10;

    // delegates
    // delegators

    public InternalCucumberLexer() {;} 
    public InternalCucumberLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCucumberLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCucumber.g"; }

    // $ANTLR start "T__5"
    public final void mT__5() throws RecognitionException {
        try {
            int _type = T__5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:11:6: ( 'Feature:' )
            // InternalCucumber.g:11:8: 'Feature:'
            {
            match("Feature:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__5"

    // $ANTLR start "T__6"
    public final void mT__6() throws RecognitionException {
        try {
            int _type = T__6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:12:6: ( 'Scenario:' )
            // InternalCucumber.g:12:8: 'Scenario:'
            {
            match("Scenario:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__6"

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:13:6: ( 'Given' )
            // InternalCucumber.g:13:8: 'Given'
            {
            match("Given"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:14:6: ( 'When' )
            // InternalCucumber.g:14:8: 'When'
            {
            match("When"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:15:6: ( 'Then' )
            // InternalCucumber.g:15:8: 'Then'
            {
            match("Then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:16:7: ( 'And' )
            // InternalCucumber.g:16:9: 'And'
            {
            match("And"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:17:7: ( 'But' )
            // InternalCucumber.g:17:9: 'But'
            {
            match("But"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:18:7: ( '*' )
            // InternalCucumber.g:18:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "RULE_WORD"
    public final void mRULE_WORD() throws RecognitionException {
        try {
            int _type = RULE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:329:11: ( ' ' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )
            // InternalCucumber.g:329:13: ' ' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            {
            match(' '); 
            // InternalCucumber.g:329:17: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCucumber.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WORD"

    public void mTokens() throws RecognitionException {
        // InternalCucumber.g:1:8: ( T__5 | T__6 | T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | RULE_WORD )
        int alt2=9;
        switch ( input.LA(1) ) {
        case 'F':
            {
            alt2=1;
            }
            break;
        case 'S':
            {
            alt2=2;
            }
            break;
        case 'G':
            {
            alt2=3;
            }
            break;
        case 'W':
            {
            alt2=4;
            }
            break;
        case 'T':
            {
            alt2=5;
            }
            break;
        case 'A':
            {
            alt2=6;
            }
            break;
        case 'B':
            {
            alt2=7;
            }
            break;
        case '*':
            {
            alt2=8;
            }
            break;
        case ' ':
            {
            alt2=9;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 2, 0, input);

            throw nvae;
        }

        switch (alt2) {
            case 1 :
                // InternalCucumber.g:1:10: T__5
                {
                mT__5(); 

                }
                break;
            case 2 :
                // InternalCucumber.g:1:15: T__6
                {
                mT__6(); 

                }
                break;
            case 3 :
                // InternalCucumber.g:1:20: T__7
                {
                mT__7(); 

                }
                break;
            case 4 :
                // InternalCucumber.g:1:25: T__8
                {
                mT__8(); 

                }
                break;
            case 5 :
                // InternalCucumber.g:1:30: T__9
                {
                mT__9(); 

                }
                break;
            case 6 :
                // InternalCucumber.g:1:35: T__10
                {
                mT__10(); 

                }
                break;
            case 7 :
                // InternalCucumber.g:1:41: T__11
                {
                mT__11(); 

                }
                break;
            case 8 :
                // InternalCucumber.g:1:47: T__12
                {
                mT__12(); 

                }
                break;
            case 9 :
                // InternalCucumber.g:1:53: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;

        }

    }


 

}
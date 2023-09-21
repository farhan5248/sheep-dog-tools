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
    public static final int RULE_EOL=5;
    public static final int RULE_WS=6;
    public static final int RULE_WORD=4;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
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
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
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
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
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
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:14:7: ( 'When' )
            // InternalCucumber.g:14:9: 'When'
            {
            match("When"); 


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
            // InternalCucumber.g:15:7: ( 'Then' )
            // InternalCucumber.g:15:9: 'Then'
            {
            match("Then"); 


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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "RULE_WORD"
    public final void mRULE_WORD() throws RecognitionException {
        try {
            int _type = RULE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:365:11: ( RULE_WS ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )
            // InternalCucumber.g:365:13: RULE_WS ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            {
            mRULE_WS(); 
            // InternalCucumber.g:365:21: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
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

    // $ANTLR start "RULE_EOL"
    public final void mRULE_EOL() throws RecognitionException {
        try {
            int _type = RULE_EOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:367:10: ( ( '\\r\\n' | '\\n' )+ )
            // InternalCucumber.g:367:12: ( '\\r\\n' | '\\n' )+
            {
            // InternalCucumber.g:367:12: ( '\\r\\n' | '\\n' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\r') ) {
                    alt2=1;
                }
                else if ( (LA2_0=='\n') ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCucumber.g:367:13: '\\r\\n'
            	    {
            	    match("\r\n"); 


            	    }
            	    break;
            	case 2 :
            	    // InternalCucumber.g:367:20: '\\n'
            	    {
            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EOL"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            // InternalCucumber.g:369:18: ( ( ' ' | '\\t' )+ )
            // InternalCucumber.g:369:20: ( ' ' | '\\t' )+
            {
            // InternalCucumber.g:369:20: ( ' ' | '\\t' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\t'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCucumber.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // InternalCucumber.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | RULE_WORD | RULE_EOL )
        int alt4=10;
        switch ( input.LA(1) ) {
        case 'F':
            {
            alt4=1;
            }
            break;
        case 'S':
            {
            alt4=2;
            }
            break;
        case 'G':
            {
            alt4=3;
            }
            break;
        case 'W':
            {
            alt4=4;
            }
            break;
        case 'T':
            {
            alt4=5;
            }
            break;
        case 'A':
            {
            alt4=6;
            }
            break;
        case 'B':
            {
            alt4=7;
            }
            break;
        case '*':
            {
            alt4=8;
            }
            break;
        case '\t':
        case ' ':
            {
            alt4=9;
            }
            break;
        case '\n':
        case '\r':
            {
            alt4=10;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 4, 0, input);

            throw nvae;
        }

        switch (alt4) {
            case 1 :
                // InternalCucumber.g:1:10: T__7
                {
                mT__7(); 

                }
                break;
            case 2 :
                // InternalCucumber.g:1:15: T__8
                {
                mT__8(); 

                }
                break;
            case 3 :
                // InternalCucumber.g:1:20: T__9
                {
                mT__9(); 

                }
                break;
            case 4 :
                // InternalCucumber.g:1:25: T__10
                {
                mT__10(); 

                }
                break;
            case 5 :
                // InternalCucumber.g:1:31: T__11
                {
                mT__11(); 

                }
                break;
            case 6 :
                // InternalCucumber.g:1:37: T__12
                {
                mT__12(); 

                }
                break;
            case 7 :
                // InternalCucumber.g:1:43: T__13
                {
                mT__13(); 

                }
                break;
            case 8 :
                // InternalCucumber.g:1:49: T__14
                {
                mT__14(); 

                }
                break;
            case 9 :
                // InternalCucumber.g:1:55: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;
            case 10 :
                // InternalCucumber.g:1:65: RULE_EOL
                {
                mRULE_EOL(); 

                }
                break;

        }

    }


 

}
package org.farhan.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCucumberLexer extends Lexer {
    public static final int RULE_WORD=6;
    public static final int RULE_TAG=5;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__9=9;
    public static final int RULE_EOL=4;
    public static final int RULE_WS=7;
    public static final int RULE_COMMENT=8;
    public static final int T__20=20;
    public static final int T__21=21;

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

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:11:6: ( 'Given' )
            // InternalCucumber.g:11:8: 'Given'
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
            // InternalCucumber.g:12:7: ( 'When' )
            // InternalCucumber.g:12:9: 'When'
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
            // InternalCucumber.g:13:7: ( 'Then' )
            // InternalCucumber.g:13:9: 'Then'
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
            // InternalCucumber.g:14:7: ( 'And' )
            // InternalCucumber.g:14:9: 'And'
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
            // InternalCucumber.g:15:7: ( 'But' )
            // InternalCucumber.g:15:9: 'But'
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
            // InternalCucumber.g:16:7: ( '*' )
            // InternalCucumber.g:16:9: '*'
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

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:17:7: ( 'Feature:' )
            // InternalCucumber.g:17:9: 'Feature:'
            {
            match("Feature:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:18:7: ( 'Background:' )
            // InternalCucumber.g:18:9: 'Background:'
            {
            match("Background:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:19:7: ( 'Scenario:' )
            // InternalCucumber.g:19:9: 'Scenario:'
            {
            match("Scenario:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:20:7: ( 'Scenario Outline:' )
            // InternalCucumber.g:20:9: 'Scenario Outline:'
            {
            match("Scenario Outline:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:21:7: ( 'Examples:' )
            // InternalCucumber.g:21:9: 'Examples:'
            {
            match("Examples:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:22:7: ( '|' )
            // InternalCucumber.g:22:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:23:7: ( '\"\"\"' )
            // InternalCucumber.g:23:9: '\"\"\"'
            {
            match("\"\"\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:2113:9: ( ( ' ' | '\\t' )+ )
            // InternalCucumber.g:2113:11: ( ' ' | '\\t' )+
            {
            // InternalCucumber.g:2113:11: ( ' ' | '\\t' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\t'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
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
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_EOL"
    public final void mRULE_EOL() throws RecognitionException {
        try {
            int _type = RULE_EOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:2115:10: ( ( '\\r' | '\\n' )+ )
            // InternalCucumber.g:2115:12: ( '\\r' | '\\n' )+
            {
            // InternalCucumber.g:2115:12: ( '\\r' | '\\n' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\n'||LA2_0=='\r') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCucumber.g:
            	    {
            	    if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

    // $ANTLR start "RULE_COMMENT"
    public final void mRULE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:2117:14: ( '#' (~ ( ( '\\r' | '\\n' ) ) )* RULE_EOL )
            // InternalCucumber.g:2117:16: '#' (~ ( ( '\\r' | '\\n' ) ) )* RULE_EOL
            {
            match('#'); 
            // InternalCucumber.g:2117:20: (~ ( ( '\\r' | '\\n' ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCucumber.g:2117:20: ~ ( ( '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            mRULE_EOL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT"

    // $ANTLR start "RULE_WORD"
    public final void mRULE_WORD() throws RecognitionException {
        try {
            int _type = RULE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:2119:11: ( (~ ( ( '@' | '|' | ' ' | '\\t' | '\\n' | '\\r' ) ) )+ )
            // InternalCucumber.g:2119:13: (~ ( ( '@' | '|' | ' ' | '\\t' | '\\n' | '\\r' ) ) )+
            {
            // InternalCucumber.g:2119:13: (~ ( ( '@' | '|' | ' ' | '\\t' | '\\n' | '\\r' ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\b')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\u001F')||(LA4_0>='!' && LA4_0<='?')||(LA4_0>='A' && LA4_0<='{')||(LA4_0>='}' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCucumber.g:2119:13: ~ ( ( '@' | '|' | ' ' | '\\t' | '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='{')||(input.LA(1)>='}' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WORD"

    // $ANTLR start "RULE_TAG"
    public final void mRULE_TAG() throws RecognitionException {
        try {
            int _type = RULE_TAG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:2121:10: ( '@' RULE_WORD )
            // InternalCucumber.g:2121:12: '@' RULE_WORD
            {
            match('@'); 
            mRULE_WORD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TAG"

    public void mTokens() throws RecognitionException {
        // InternalCucumber.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_WS | RULE_EOL | RULE_COMMENT | RULE_WORD | RULE_TAG )
        int alt5=18;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // InternalCucumber.g:1:10: T__9
                {
                mT__9(); 

                }
                break;
            case 2 :
                // InternalCucumber.g:1:15: T__10
                {
                mT__10(); 

                }
                break;
            case 3 :
                // InternalCucumber.g:1:21: T__11
                {
                mT__11(); 

                }
                break;
            case 4 :
                // InternalCucumber.g:1:27: T__12
                {
                mT__12(); 

                }
                break;
            case 5 :
                // InternalCucumber.g:1:33: T__13
                {
                mT__13(); 

                }
                break;
            case 6 :
                // InternalCucumber.g:1:39: T__14
                {
                mT__14(); 

                }
                break;
            case 7 :
                // InternalCucumber.g:1:45: T__15
                {
                mT__15(); 

                }
                break;
            case 8 :
                // InternalCucumber.g:1:51: T__16
                {
                mT__16(); 

                }
                break;
            case 9 :
                // InternalCucumber.g:1:57: T__17
                {
                mT__17(); 

                }
                break;
            case 10 :
                // InternalCucumber.g:1:63: T__18
                {
                mT__18(); 

                }
                break;
            case 11 :
                // InternalCucumber.g:1:69: T__19
                {
                mT__19(); 

                }
                break;
            case 12 :
                // InternalCucumber.g:1:75: T__20
                {
                mT__20(); 

                }
                break;
            case 13 :
                // InternalCucumber.g:1:81: T__21
                {
                mT__21(); 

                }
                break;
            case 14 :
                // InternalCucumber.g:1:87: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 15 :
                // InternalCucumber.g:1:95: RULE_EOL
                {
                mRULE_EOL(); 

                }
                break;
            case 16 :
                // InternalCucumber.g:1:104: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;
            case 17 :
                // InternalCucumber.g:1:117: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;
            case 18 :
                // InternalCucumber.g:1:127: RULE_TAG
                {
                mRULE_TAG(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\1\uffff\5\17\1\27\3\17\1\uffff\1\17\2\uffff\1\17\2\uffff\6\17\1\uffff\5\17\1\uffff\3\17\1\53\1\54\4\17\1\61\1\17\1\63\1\64\2\uffff\4\17\1\uffff\1\71\2\uffff\4\17\1\uffff\11\17\1\107\3\17\1\uffff\1\114\1\uffff\1\115\1\17\2\uffff\1\117\1\uffff";
    static final String DFA5_eofS =
        "\120\uffff";
    static final String DFA5_minS =
        "\1\0\1\151\2\150\1\156\1\141\1\0\1\145\1\143\1\170\1\uffff\1\42\2\uffff\1\0\2\uffff\1\166\2\145\1\144\1\164\1\143\1\uffff\1\141\1\145\1\141\1\42\1\0\1\uffff\1\145\2\156\2\0\1\153\1\164\1\156\1\155\1\0\1\156\2\0\2\uffff\1\147\1\165\1\141\1\160\1\uffff\1\0\2\uffff\3\162\1\154\1\uffff\1\157\1\145\1\151\1\145\1\165\1\72\1\157\1\163\1\156\1\0\1\40\1\72\1\144\1\uffff\1\0\1\uffff\1\0\1\72\2\uffff\1\0\1\uffff";
    static final String DFA5_maxS =
        "\1\uffff\1\151\2\150\1\156\1\165\1\uffff\1\145\1\143\1\170\1\uffff\1\42\2\uffff\1\uffff\2\uffff\1\166\2\145\1\144\1\164\1\143\1\uffff\1\141\1\145\1\141\1\42\1\uffff\1\uffff\1\145\2\156\2\uffff\1\153\1\164\1\156\1\155\1\uffff\1\156\2\uffff\2\uffff\1\147\1\165\1\141\1\160\1\uffff\1\uffff\2\uffff\3\162\1\154\1\uffff\1\157\1\145\1\151\1\145\1\165\1\72\1\157\1\163\1\156\1\uffff\2\72\1\144\1\uffff\1\uffff\1\uffff\1\uffff\1\72\2\uffff\1\uffff\1\uffff";
    static final String DFA5_acceptS =
        "\12\uffff\1\14\1\uffff\1\16\1\17\1\uffff\1\21\1\22\6\uffff\1\6\5\uffff\1\20\15\uffff\1\4\1\5\4\uffff\1\15\1\uffff\1\2\1\3\4\uffff\1\1\15\uffff\1\7\1\uffff\1\12\2\uffff\1\11\1\13\1\uffff\1\10";
    static final String DFA5_specialS =
        "\1\1\5\uffff\1\14\7\uffff\1\5\15\uffff\1\10\4\uffff\1\11\1\13\4\uffff\1\15\1\uffff\1\6\1\7\7\uffff\1\3\20\uffff\1\0\4\uffff\1\4\1\uffff\1\12\3\uffff\1\2\1\uffff}>";
    static final String[] DFA5_transitionS = {
            "\11\17\1\14\1\15\2\17\1\15\22\17\1\14\1\17\1\13\1\16\6\17\1\6\25\17\1\20\1\4\1\5\2\17\1\11\1\7\1\1\13\17\1\10\1\3\2\17\1\2\44\17\1\12\uff83\17",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\26\23\uffff\1\25",
            "\11\17\2\uffff\2\17\1\uffff\22\17\1\uffff\37\17\1\uffff\73\17\1\uffff\uff83\17",
            "\1\30",
            "\1\31",
            "\1\32",
            "",
            "\1\33",
            "",
            "",
            "\11\34\2\35\2\34\1\35\22\34\1\35\37\34\1\35\73\34\1\35\uff83\34",
            "",
            "",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\11\34\2\35\2\34\1\35\22\34\1\35\37\34\1\35\73\34\1\35\uff83\34",
            "",
            "\1\50",
            "\1\51",
            "\1\52",
            "\11\17\2\uffff\2\17\1\uffff\22\17\1\uffff\37\17\1\uffff\73\17\1\uffff\uff83\17",
            "\11\17\2\uffff\2\17\1\uffff\22\17\1\uffff\37\17\1\uffff\73\17\1\uffff\uff83\17",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\11\17\2\uffff\2\17\1\uffff\22\17\1\uffff\37\17\1\uffff\73\17\1\uffff\uff83\17",
            "\1\62",
            "\11\17\2\uffff\2\17\1\uffff\22\17\1\uffff\37\17\1\uffff\73\17\1\uffff\uff83\17",
            "\11\17\2\uffff\2\17\1\uffff\22\17\1\uffff\37\17\1\uffff\73\17\1\uffff\uff83\17",
            "",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "",
            "\11\17\2\uffff\2\17\1\uffff\22\17\1\uffff\37\17\1\uffff\73\17\1\uffff\uff83\17",
            "",
            "",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\11\17\2\uffff\2\17\1\uffff\22\17\1\uffff\37\17\1\uffff\73\17\1\uffff\uff83\17",
            "\1\111\31\uffff\1\110",
            "\1\112",
            "\1\113",
            "",
            "\11\17\2\uffff\2\17\1\uffff\22\17\1\uffff\37\17\1\uffff\73\17\1\uffff\uff83\17",
            "",
            "\11\17\2\uffff\2\17\1\uffff\22\17\1\uffff\37\17\1\uffff\73\17\1\uffff\uff83\17",
            "\1\116",
            "",
            "",
            "\11\17\2\uffff\2\17\1\uffff\22\17\1\uffff\37\17\1\uffff\73\17\1\uffff\uff83\17",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_WS | RULE_EOL | RULE_COMMENT | RULE_WORD | RULE_TAG );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_67 = input.LA(1);

                        s = -1;
                        if ( ((LA5_67>='\u0000' && LA5_67<='\b')||(LA5_67>='\u000B' && LA5_67<='\f')||(LA5_67>='\u000E' && LA5_67<='\u001F')||(LA5_67>='!' && LA5_67<='?')||(LA5_67>='A' && LA5_67<='{')||(LA5_67>='}' && LA5_67<='\uFFFF')) ) {s = 15;}

                        else s = 71;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_0 = input.LA(1);

                        s = -1;
                        if ( (LA5_0=='G') ) {s = 1;}

                        else if ( (LA5_0=='W') ) {s = 2;}

                        else if ( (LA5_0=='T') ) {s = 3;}

                        else if ( (LA5_0=='A') ) {s = 4;}

                        else if ( (LA5_0=='B') ) {s = 5;}

                        else if ( (LA5_0=='*') ) {s = 6;}

                        else if ( (LA5_0=='F') ) {s = 7;}

                        else if ( (LA5_0=='S') ) {s = 8;}

                        else if ( (LA5_0=='E') ) {s = 9;}

                        else if ( (LA5_0=='|') ) {s = 10;}

                        else if ( (LA5_0=='\"') ) {s = 11;}

                        else if ( (LA5_0=='\t'||LA5_0==' ') ) {s = 12;}

                        else if ( (LA5_0=='\n'||LA5_0=='\r') ) {s = 13;}

                        else if ( (LA5_0=='#') ) {s = 14;}

                        else if ( ((LA5_0>='\u0000' && LA5_0<='\b')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\u001F')||LA5_0=='!'||(LA5_0>='$' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='?')||(LA5_0>='C' && LA5_0<='D')||(LA5_0>='H' && LA5_0<='R')||(LA5_0>='U' && LA5_0<='V')||(LA5_0>='X' && LA5_0<='{')||(LA5_0>='}' && LA5_0<='\uFFFF')) ) {s = 15;}

                        else if ( (LA5_0=='@') ) {s = 16;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA5_78 = input.LA(1);

                        s = -1;
                        if ( ((LA5_78>='\u0000' && LA5_78<='\b')||(LA5_78>='\u000B' && LA5_78<='\f')||(LA5_78>='\u000E' && LA5_78<='\u001F')||(LA5_78>='!' && LA5_78<='?')||(LA5_78>='A' && LA5_78<='{')||(LA5_78>='}' && LA5_78<='\uFFFF')) ) {s = 15;}

                        else s = 79;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA5_50 = input.LA(1);

                        s = -1;
                        if ( ((LA5_50>='\u0000' && LA5_50<='\b')||(LA5_50>='\u000B' && LA5_50<='\f')||(LA5_50>='\u000E' && LA5_50<='\u001F')||(LA5_50>='!' && LA5_50<='?')||(LA5_50>='A' && LA5_50<='{')||(LA5_50>='}' && LA5_50<='\uFFFF')) ) {s = 15;}

                        else s = 57;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA5_72 = input.LA(1);

                        s = -1;
                        if ( ((LA5_72>='\u0000' && LA5_72<='\b')||(LA5_72>='\u000B' && LA5_72<='\f')||(LA5_72>='\u000E' && LA5_72<='\u001F')||(LA5_72>='!' && LA5_72<='?')||(LA5_72>='A' && LA5_72<='{')||(LA5_72>='}' && LA5_72<='\uFFFF')) ) {s = 15;}

                        else s = 76;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA5_14 = input.LA(1);

                        s = -1;
                        if ( ((LA5_14>='\u0000' && LA5_14<='\b')||(LA5_14>='\u000B' && LA5_14<='\f')||(LA5_14>='\u000E' && LA5_14<='\u001F')||(LA5_14>='!' && LA5_14<='?')||(LA5_14>='A' && LA5_14<='{')||(LA5_14>='}' && LA5_14<='\uFFFF')) ) {s = 28;}

                        else if ( ((LA5_14>='\t' && LA5_14<='\n')||LA5_14=='\r'||LA5_14==' '||LA5_14=='@'||LA5_14=='|') ) {s = 29;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA5_41 = input.LA(1);

                        s = -1;
                        if ( ((LA5_41>='\u0000' && LA5_41<='\b')||(LA5_41>='\u000B' && LA5_41<='\f')||(LA5_41>='\u000E' && LA5_41<='\u001F')||(LA5_41>='!' && LA5_41<='?')||(LA5_41>='A' && LA5_41<='{')||(LA5_41>='}' && LA5_41<='\uFFFF')) ) {s = 15;}

                        else s = 51;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA5_42 = input.LA(1);

                        s = -1;
                        if ( ((LA5_42>='\u0000' && LA5_42<='\b')||(LA5_42>='\u000B' && LA5_42<='\f')||(LA5_42>='\u000E' && LA5_42<='\u001F')||(LA5_42>='!' && LA5_42<='?')||(LA5_42>='A' && LA5_42<='{')||(LA5_42>='}' && LA5_42<='\uFFFF')) ) {s = 15;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA5_28 = input.LA(1);

                        s = -1;
                        if ( ((LA5_28>='\t' && LA5_28<='\n')||LA5_28=='\r'||LA5_28==' '||LA5_28=='@'||LA5_28=='|') ) {s = 29;}

                        else if ( ((LA5_28>='\u0000' && LA5_28<='\b')||(LA5_28>='\u000B' && LA5_28<='\f')||(LA5_28>='\u000E' && LA5_28<='\u001F')||(LA5_28>='!' && LA5_28<='?')||(LA5_28>='A' && LA5_28<='{')||(LA5_28>='}' && LA5_28<='\uFFFF')) ) {s = 28;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA5_33 = input.LA(1);

                        s = -1;
                        if ( ((LA5_33>='\u0000' && LA5_33<='\b')||(LA5_33>='\u000B' && LA5_33<='\f')||(LA5_33>='\u000E' && LA5_33<='\u001F')||(LA5_33>='!' && LA5_33<='?')||(LA5_33>='A' && LA5_33<='{')||(LA5_33>='}' && LA5_33<='\uFFFF')) ) {s = 15;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA5_74 = input.LA(1);

                        s = -1;
                        if ( ((LA5_74>='\u0000' && LA5_74<='\b')||(LA5_74>='\u000B' && LA5_74<='\f')||(LA5_74>='\u000E' && LA5_74<='\u001F')||(LA5_74>='!' && LA5_74<='?')||(LA5_74>='A' && LA5_74<='{')||(LA5_74>='}' && LA5_74<='\uFFFF')) ) {s = 15;}

                        else s = 77;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA5_34 = input.LA(1);

                        s = -1;
                        if ( ((LA5_34>='\u0000' && LA5_34<='\b')||(LA5_34>='\u000B' && LA5_34<='\f')||(LA5_34>='\u000E' && LA5_34<='\u001F')||(LA5_34>='!' && LA5_34<='?')||(LA5_34>='A' && LA5_34<='{')||(LA5_34>='}' && LA5_34<='\uFFFF')) ) {s = 15;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA5_6 = input.LA(1);

                        s = -1;
                        if ( ((LA5_6>='\u0000' && LA5_6<='\b')||(LA5_6>='\u000B' && LA5_6<='\f')||(LA5_6>='\u000E' && LA5_6<='\u001F')||(LA5_6>='!' && LA5_6<='?')||(LA5_6>='A' && LA5_6<='{')||(LA5_6>='}' && LA5_6<='\uFFFF')) ) {s = 15;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA5_39 = input.LA(1);

                        s = -1;
                        if ( ((LA5_39>='\u0000' && LA5_39<='\b')||(LA5_39>='\u000B' && LA5_39<='\f')||(LA5_39>='\u000E' && LA5_39<='\u001F')||(LA5_39>='!' && LA5_39<='?')||(LA5_39>='A' && LA5_39<='{')||(LA5_39>='}' && LA5_39<='\uFFFF')) ) {s = 15;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
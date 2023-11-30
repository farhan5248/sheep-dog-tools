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
    public static final int RULE_SL_COMMENT=7;
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
    public static final int T__8=8;
    public static final int RULE_ID=5;
    public static final int RULE_EOL=4;
    public static final int RULE_WS=6;
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

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
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
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:12:6: ( 'Background:' )
            // InternalCucumber.g:12:8: 'Background:'
            {
            match("Background:"); 


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
            // InternalCucumber.g:13:7: ( 'Scenario:' )
            // InternalCucumber.g:13:9: 'Scenario:'
            {
            match("Scenario:"); 


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
            // InternalCucumber.g:14:7: ( 'Scenario Outline:' )
            // InternalCucumber.g:14:9: 'Scenario Outline:'
            {
            match("Scenario Outline:"); 


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
            // InternalCucumber.g:15:7: ( 'Examples:' )
            // InternalCucumber.g:15:9: 'Examples:'
            {
            match("Examples:"); 


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
            // InternalCucumber.g:16:7: ( '|' )
            // InternalCucumber.g:16:9: '|'
            {
            match('|'); 

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
            // InternalCucumber.g:17:7: ( '\"\"\"' )
            // InternalCucumber.g:17:9: '\"\"\"'
            {
            match("\"\"\""); 


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
            // InternalCucumber.g:18:7: ( 'Given' )
            // InternalCucumber.g:18:9: 'Given'
            {
            match("Given"); 


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
            // InternalCucumber.g:19:7: ( 'When' )
            // InternalCucumber.g:19:9: 'When'
            {
            match("When"); 


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
            // InternalCucumber.g:20:7: ( 'Then' )
            // InternalCucumber.g:20:9: 'Then'
            {
            match("Then"); 


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
            // InternalCucumber.g:21:7: ( 'And' )
            // InternalCucumber.g:21:9: 'And'
            {
            match("And"); 


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
            // InternalCucumber.g:22:7: ( 'But' )
            // InternalCucumber.g:22:9: 'But'
            {
            match("But"); 


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
            // InternalCucumber.g:23:7: ( '*' )
            // InternalCucumber.g:23:9: '*'
            {
            match('*'); 

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
            // InternalCucumber.g:24:7: ( '@' )
            // InternalCucumber.g:24:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:1574:9: ( ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | ',' | '.' | '<' | '>' )* )
            // InternalCucumber.g:1574:11: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | ',' | '.' | '<' | '>' )*
            {
            // InternalCucumber.g:1574:11: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | ',' | '.' | '<' | '>' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==','||LA1_0=='.'||(LA1_0>='0' && LA1_0<='9')||LA1_0=='<'||LA1_0=='>'||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCucumber.g:
            	    {
            	    if ( input.LA(1)==','||input.LA(1)=='.'||(input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='<'||input.LA(1)=='>'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:1576:9: ( ( ' ' | '\\t' )+ )
            // InternalCucumber.g:1576:11: ( ' ' | '\\t' )+
            {
            // InternalCucumber.g:1576:11: ( ' ' | '\\t' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\t'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
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
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:1578:17: ( '#' (~ ( ( '\\r' | '\\n' ) ) )* RULE_EOL )
            // InternalCucumber.g:1578:19: '#' (~ ( ( '\\r' | '\\n' ) ) )* RULE_EOL
            {
            match('#'); 
            // InternalCucumber.g:1578:23: (~ ( ( '\\r' | '\\n' ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCucumber.g:1578:23: ~ ( ( '\\r' | '\\n' ) )
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
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_EOL"
    public final void mRULE_EOL() throws RecognitionException {
        try {
            int _type = RULE_EOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:1580:10: ( ( '\\r\\n' )+ )
            // InternalCucumber.g:1580:12: ( '\\r\\n' )+
            {
            // InternalCucumber.g:1580:12: ( '\\r\\n' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\r') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCucumber.g:1580:12: '\\r\\n'
            	    {
            	    match("\r\n"); 


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
    // $ANTLR end "RULE_EOL"

    public void mTokens() throws RecognitionException {
        // InternalCucumber.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_ID | RULE_WS | RULE_SL_COMMENT | RULE_EOL )
        int alt5=18;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // InternalCucumber.g:1:10: T__8
                {
                mT__8(); 

                }
                break;
            case 2 :
                // InternalCucumber.g:1:15: T__9
                {
                mT__9(); 

                }
                break;
            case 3 :
                // InternalCucumber.g:1:20: T__10
                {
                mT__10(); 

                }
                break;
            case 4 :
                // InternalCucumber.g:1:26: T__11
                {
                mT__11(); 

                }
                break;
            case 5 :
                // InternalCucumber.g:1:32: T__12
                {
                mT__12(); 

                }
                break;
            case 6 :
                // InternalCucumber.g:1:38: T__13
                {
                mT__13(); 

                }
                break;
            case 7 :
                // InternalCucumber.g:1:44: T__14
                {
                mT__14(); 

                }
                break;
            case 8 :
                // InternalCucumber.g:1:50: T__15
                {
                mT__15(); 

                }
                break;
            case 9 :
                // InternalCucumber.g:1:56: T__16
                {
                mT__16(); 

                }
                break;
            case 10 :
                // InternalCucumber.g:1:62: T__17
                {
                mT__17(); 

                }
                break;
            case 11 :
                // InternalCucumber.g:1:68: T__18
                {
                mT__18(); 

                }
                break;
            case 12 :
                // InternalCucumber.g:1:74: T__19
                {
                mT__19(); 

                }
                break;
            case 13 :
                // InternalCucumber.g:1:80: T__20
                {
                mT__20(); 

                }
                break;
            case 14 :
                // InternalCucumber.g:1:86: T__21
                {
                mT__21(); 

                }
                break;
            case 15 :
                // InternalCucumber.g:1:92: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 16 :
                // InternalCucumber.g:1:100: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 17 :
                // InternalCucumber.g:1:108: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 18 :
                // InternalCucumber.g:1:124: RULE_EOL
                {
                mRULE_EOL(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\5\15\2\uffff\4\15\6\uffff\13\15\1\45\5\15\1\53\2\15\1\uffff\3\15\1\61\1\62\1\uffff\4\15\1\67\2\uffff\4\15\1\uffff\4\15\1\uffff\4\15\3\uffff\1\15\1\uffff";
    static final String DFA5_eofS =
        "\106\uffff";
    static final String DFA5_minS =
        "\1\11\1\145\1\141\1\143\1\170\2\uffff\1\151\2\150\1\156\6\uffff\1\141\1\143\1\164\1\145\1\141\1\166\2\145\1\144\1\164\1\153\1\54\1\156\1\155\1\145\2\156\1\54\1\165\1\147\1\uffff\1\141\1\160\1\156\2\54\1\uffff\3\162\1\154\1\54\2\uffff\1\145\1\157\1\151\1\145\1\uffff\1\72\1\165\1\157\1\163\1\uffff\1\156\1\40\1\72\1\144\3\uffff\1\72\1\uffff";
    static final String DFA5_maxS =
        "\1\174\1\145\1\165\1\143\1\170\2\uffff\1\151\2\150\1\156\6\uffff\1\141\1\143\1\164\1\145\1\141\1\166\2\145\1\144\1\164\1\153\1\172\1\156\1\155\1\145\2\156\1\172\1\165\1\147\1\uffff\1\141\1\160\1\156\2\172\1\uffff\3\162\1\154\1\172\2\uffff\1\145\1\157\1\151\1\145\1\uffff\1\72\1\165\1\157\1\163\1\uffff\1\156\2\72\1\144\3\uffff\1\72\1\uffff";
    static final String DFA5_acceptS =
        "\5\uffff\1\6\1\7\4\uffff\1\15\1\16\1\17\1\20\1\21\1\22\24\uffff\1\14\5\uffff\1\13\5\uffff\1\11\1\12\4\uffff\1\10\4\uffff\1\1\4\uffff\1\3\1\4\1\5\1\uffff\1\2";
    static final String DFA5_specialS =
        "\106\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\16\3\uffff\1\20\22\uffff\1\16\1\uffff\1\6\1\17\6\uffff\1\13\25\uffff\1\14\1\12\1\2\2\uffff\1\4\1\1\1\7\13\uffff\1\3\1\11\2\uffff\1\10\44\uffff\1\5",
            "\1\21",
            "\1\22\23\uffff\1\23",
            "\1\24",
            "\1\25",
            "",
            "",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\15\1\uffff\1\15\1\uffff\12\15\2\uffff\1\15\1\uffff\1\15\2\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\15\1\uffff\1\15\1\uffff\12\15\2\uffff\1\15\1\uffff\1\15\2\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\54",
            "\1\55",
            "",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\15\1\uffff\1\15\1\uffff\12\15\2\uffff\1\15\1\uffff\1\15\2\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\15\1\uffff\1\15\1\uffff\12\15\2\uffff\1\15\1\uffff\1\15\2\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\15\1\uffff\1\15\1\uffff\12\15\2\uffff\1\15\1\uffff\1\15\2\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "",
            "",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "",
            "\1\100",
            "\1\102\31\uffff\1\101",
            "\1\103",
            "\1\104",
            "",
            "",
            "",
            "\1\105",
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
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_ID | RULE_WS | RULE_SL_COMMENT | RULE_EOL );";
        }
    }
 

}
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
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int RULE_ID=5;
    public static final int RULE_EOL=4;
    public static final int RULE_WS=6;
    public static final int RULE_WORD=7;
    public static final int T__15=15;
    public static final int T__16=16;
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

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
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
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:12:6: ( 'When' )
            // InternalCucumber.g:12:8: 'When'
            {
            match("When"); 


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
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
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
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:18:7: ( 'Scenario:' )
            // InternalCucumber.g:18:9: 'Scenario:'
            {
            match("Scenario:"); 


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
            // InternalCucumber.g:19:7: ( '@' )
            // InternalCucumber.g:19:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:1005:9: ( ( ' ' | '\\t' )+ )
            // InternalCucumber.g:1005:11: ( ' ' | '\\t' )+
            {
            // InternalCucumber.g:1005:11: ( ' ' | '\\t' )+
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
            // InternalCucumber.g:1007:10: ( ( '\\r\\n' | '\\n' )+ )
            // InternalCucumber.g:1007:12: ( '\\r\\n' | '\\n' )+
            {
            // InternalCucumber.g:1007:12: ( '\\r\\n' | '\\n' )+
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
            	    // InternalCucumber.g:1007:13: '\\r\\n'
            	    {
            	    match("\r\n"); 


            	    }
            	    break;
            	case 2 :
            	    // InternalCucumber.g:1007:20: '\\n'
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:1009:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )
            // InternalCucumber.g:1009:11: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            {
            // InternalCucumber.g:1009:11: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_WORD"
    public final void mRULE_WORD() throws RecognitionException {
        try {
            int _type = RULE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:1011:11: ( RULE_WS RULE_ID )
            // InternalCucumber.g:1011:13: RULE_WS RULE_ID
            {
            mRULE_WS(); 
            mRULE_ID(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WORD"

    public void mTokens() throws RecognitionException {
        // InternalCucumber.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | RULE_WS | RULE_EOL | RULE_ID | RULE_WORD )
        int alt4=13;
        alt4 = dfa4.predict(input);
        switch (alt4) {
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
                // InternalCucumber.g:1:62: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 11 :
                // InternalCucumber.g:1:70: RULE_EOL
                {
                mRULE_EOL(); 

                }
                break;
            case 12 :
                // InternalCucumber.g:1:79: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 13 :
                // InternalCucumber.g:1:87: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\1\uffff\5\14\1\uffff\2\14\1\uffff\1\24\2\uffff\7\14\2\uffff\3\14\1\40\1\41\3\14\1\45\1\46\2\uffff\2\14\1\51\2\uffff\2\14\1\uffff\4\14\1\uffff\1\14\1\uffff";
    static final String DFA4_eofS =
        "\61\uffff";
    static final String DFA4_minS =
        "\1\11\1\151\2\150\1\156\1\165\1\uffff\1\145\1\143\1\uffff\1\11\2\uffff\1\166\2\145\1\144\1\164\1\141\1\145\2\uffff\1\145\2\156\2\60\1\164\2\156\2\60\2\uffff\1\165\1\141\1\60\2\uffff\2\162\1\uffff\1\145\1\151\1\72\1\157\1\uffff\1\72\1\uffff";
    static final String DFA4_maxS =
        "\1\172\1\151\2\150\1\156\1\165\1\uffff\1\145\1\143\1\uffff\1\172\2\uffff\1\166\2\145\1\144\1\164\1\141\1\145\2\uffff\1\145\2\156\2\172\1\164\2\156\2\172\2\uffff\1\165\1\141\1\172\2\uffff\2\162\1\uffff\1\145\1\151\1\72\1\157\1\uffff\1\72\1\uffff";
    static final String DFA4_acceptS =
        "\6\uffff\1\6\2\uffff\1\11\1\uffff\1\13\1\14\7\uffff\1\12\1\15\12\uffff\1\4\1\5\3\uffff\1\2\1\3\2\uffff\1\1\4\uffff\1\7\1\uffff\1\10";
    static final String DFA4_specialS =
        "\61\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\12\1\13\2\uffff\1\13\22\uffff\1\12\11\uffff\1\6\5\uffff\12\14\6\uffff\1\11\1\4\1\5\3\14\1\7\1\1\13\14\1\10\1\3\2\14\1\2\3\14\6\uffff\32\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "",
            "\1\22",
            "\1\23",
            "",
            "\1\12\26\uffff\1\12\17\uffff\12\25\7\uffff\32\25\6\uffff\32\25",
            "",
            "",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "",
            "",
            "\1\35",
            "\1\36",
            "\1\37",
            "\12\14\7\uffff\32\14\6\uffff\32\14",
            "\12\14\7\uffff\32\14\6\uffff\32\14",
            "\1\42",
            "\1\43",
            "\1\44",
            "\12\14\7\uffff\32\14\6\uffff\32\14",
            "\12\14\7\uffff\32\14\6\uffff\32\14",
            "",
            "",
            "\1\47",
            "\1\50",
            "\12\14\7\uffff\32\14\6\uffff\32\14",
            "",
            "",
            "\1\52",
            "\1\53",
            "",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "",
            "\1\60",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | RULE_WS | RULE_EOL | RULE_ID | RULE_WORD );";
        }
    }
 

}
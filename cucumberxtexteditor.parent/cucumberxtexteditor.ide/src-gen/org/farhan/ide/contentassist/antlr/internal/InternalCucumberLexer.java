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
    public static final int RULE_ID=5;
    public static final int RULE_EOL=4;
    public static final int RULE_WS=6;
    public static final int RULE_WORD=7;
    public static final int RULE_COMMENT=8;
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
            // InternalCucumber.g:20:7: ( '@' )
            // InternalCucumber.g:20:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:1225:9: ( ( ' ' | '\\t' )+ )
            // InternalCucumber.g:1225:11: ( ' ' | '\\t' )+
            {
            // InternalCucumber.g:1225:11: ( ' ' | '\\t' )+
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
            // InternalCucumber.g:1227:10: ( ( '\\r\\n' | '\\n' )+ )
            // InternalCucumber.g:1227:12: ( '\\r\\n' | '\\n' )+
            {
            // InternalCucumber.g:1227:12: ( '\\r\\n' | '\\n' )+
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
            	    // InternalCucumber.g:1227:13: '\\r\\n'
            	    {
            	    match("\r\n"); 


            	    }
            	    break;
            	case 2 :
            	    // InternalCucumber.g:1227:20: '\\n'
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

    // $ANTLR start "RULE_COMMENT"
    public final void mRULE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:1229:14: ( ( RULE_WS )? '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalCucumber.g:1229:16: ( RULE_WS )? '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            // InternalCucumber.g:1229:16: ( RULE_WS )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\t'||LA3_0==' ') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCucumber.g:1229:16: RULE_WS
                    {
                    mRULE_WS(); 

                    }
                    break;

            }

            match('#'); 
            // InternalCucumber.g:1229:29: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCucumber.g:1229:29: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:1231:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '\\'' )+ )
            // InternalCucumber.g:1231:11: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '\\'' )+
            {
            // InternalCucumber.g:1231:11: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '\\'' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\''||(LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCucumber.g:
            	    {
            	    if ( input.LA(1)=='\''||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // InternalCucumber.g:1233:11: ( RULE_WS RULE_ID )
            // InternalCucumber.g:1233:13: RULE_WS RULE_ID
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
        // InternalCucumber.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | RULE_WS | RULE_EOL | RULE_COMMENT | RULE_ID | RULE_WORD )
        int alt6=15;
        alt6 = dfa6.predict(input);
        switch (alt6) {
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
                // InternalCucumber.g:1:69: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 12 :
                // InternalCucumber.g:1:77: RULE_EOL
                {
                mRULE_EOL(); 

                }
                break;
            case 13 :
                // InternalCucumber.g:1:86: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;
            case 14 :
                // InternalCucumber.g:1:99: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 15 :
                // InternalCucumber.g:1:107: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\5\15\1\uffff\2\15\1\uffff\1\26\3\uffff\10\15\2\uffff\3\15\1\43\1\44\4\15\1\51\1\52\2\uffff\3\15\1\56\2\uffff\3\15\1\uffff\7\15\1\uffff\2\15\1\uffff\1\15\1\uffff";
    static final String DFA6_eofS =
        "\74\uffff";
    static final String DFA6_minS =
        "\1\11\1\151\2\150\1\156\1\141\1\uffff\1\145\1\143\1\uffff\1\11\3\uffff\1\166\2\145\1\144\1\164\1\143\1\141\1\145\2\uffff\1\145\2\156\2\47\1\153\1\164\2\156\2\47\2\uffff\1\147\1\165\1\141\1\47\2\uffff\3\162\1\uffff\1\157\1\145\1\151\1\165\1\72\1\157\1\156\1\uffff\1\72\1\144\1\uffff\1\72\1\uffff";
    static final String DFA6_maxS =
        "\1\172\1\151\2\150\1\156\1\165\1\uffff\1\145\1\143\1\uffff\1\172\3\uffff\1\166\2\145\1\144\1\164\1\143\1\141\1\145\2\uffff\1\145\2\156\2\172\1\153\1\164\2\156\2\172\2\uffff\1\147\1\165\1\141\1\172\2\uffff\3\162\1\uffff\1\157\1\145\1\151\1\165\1\72\1\157\1\156\1\uffff\1\72\1\144\1\uffff\1\72\1\uffff";
    static final String DFA6_acceptS =
        "\6\uffff\1\6\2\uffff\1\12\1\uffff\1\14\1\15\1\16\10\uffff\1\13\1\17\13\uffff\1\4\1\5\4\uffff\1\2\1\3\3\uffff\1\1\7\uffff\1\7\2\uffff\1\11\1\uffff\1\10";
    static final String DFA6_specialS =
        "\74\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\12\1\13\2\uffff\1\13\22\uffff\1\12\2\uffff\1\14\3\uffff\1\15\2\uffff\1\6\5\uffff\12\15\6\uffff\1\11\1\4\1\5\3\15\1\7\1\1\13\15\1\10\1\3\2\15\1\2\3\15\6\uffff\32\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\23\23\uffff\1\22",
            "",
            "\1\24",
            "\1\25",
            "",
            "\1\12\26\uffff\1\12\2\uffff\1\14\3\uffff\1\27\10\uffff\12\27\7\uffff\32\27\6\uffff\32\27",
            "",
            "",
            "",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "",
            "",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\15\10\uffff\12\15\7\uffff\32\15\6\uffff\32\15",
            "\1\15\10\uffff\12\15\7\uffff\32\15\6\uffff\32\15",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\15\10\uffff\12\15\7\uffff\32\15\6\uffff\32\15",
            "\1\15\10\uffff\12\15\7\uffff\32\15\6\uffff\32\15",
            "",
            "",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\15\10\uffff\12\15\7\uffff\32\15\6\uffff\32\15",
            "",
            "",
            "\1\57",
            "\1\60",
            "\1\61",
            "",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "",
            "\1\71",
            "\1\72",
            "",
            "\1\73",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | RULE_WS | RULE_EOL | RULE_COMMENT | RULE_ID | RULE_WORD );";
        }
    }
 

}
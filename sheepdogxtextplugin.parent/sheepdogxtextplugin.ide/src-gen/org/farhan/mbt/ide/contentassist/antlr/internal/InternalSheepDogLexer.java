package org.farhan.mbt.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSheepDogLexer extends Lexer {
    public static final int RULE_WORD=5;
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
    public static final int RULE_EOL=4;
    public static final int RULE_WS=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalSheepDogLexer() {;} 
    public InternalSheepDogLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSheepDogLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSheepDog.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSheepDog.g:11:6: ( '=' )
            // InternalSheepDog.g:11:8: '='
            {
            match('='); 

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
            // InternalSheepDog.g:12:6: ( 'Object:' )
            // InternalSheepDog.g:12:8: 'Object:'
            {
            match("Object:"); 


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
            // InternalSheepDog.g:13:7: ( '==' )
            // InternalSheepDog.g:13:9: '=='
            {
            match("=="); 


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
            // InternalSheepDog.g:14:7: ( 'Definition:' )
            // InternalSheepDog.g:14:9: 'Definition:'
            {
            match("Definition:"); 


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
            // InternalSheepDog.g:15:7: ( '===' )
            // InternalSheepDog.g:15:9: '==='
            {
            match("==="); 


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
            // InternalSheepDog.g:16:7: ( 'Parameters:' )
            // InternalSheepDog.g:16:9: 'Parameters:'
            {
            match("Parameters:"); 


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
            // InternalSheepDog.g:17:7: ( 'Feature:' )
            // InternalSheepDog.g:17:9: 'Feature:'
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
            // InternalSheepDog.g:18:7: ( 'Background:' )
            // InternalSheepDog.g:18:9: 'Background:'
            {
            match("Background:"); 


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
            // InternalSheepDog.g:19:7: ( 'Scenario:' )
            // InternalSheepDog.g:19:9: 'Scenario:'
            {
            match("Scenario:"); 


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
            // InternalSheepDog.g:20:7: ( 'Examples:' )
            // InternalSheepDog.g:20:9: 'Examples:'
            {
            match("Examples:"); 


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
            // InternalSheepDog.g:21:7: ( 'Given' )
            // InternalSheepDog.g:21:9: 'Given'
            {
            match("Given"); 


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
            // InternalSheepDog.g:22:7: ( 'When' )
            // InternalSheepDog.g:22:9: 'When'
            {
            match("When"); 


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
            // InternalSheepDog.g:23:7: ( 'Then' )
            // InternalSheepDog.g:23:9: 'Then'
            {
            match("Then"); 


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
            // InternalSheepDog.g:24:7: ( 'And' )
            // InternalSheepDog.g:24:9: 'And'
            {
            match("And"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSheepDog.g:25:7: ( '----' )
            // InternalSheepDog.g:25:9: '----'
            {
            match("----"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSheepDog.g:26:7: ( '[options=\"header\"]' )
            // InternalSheepDog.g:26:9: '[options=\"header\"]'
            {
            match("[options=\"header\"]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSheepDog.g:27:7: ( '|===' )
            // InternalSheepDog.g:27:9: '|==='
            {
            match("|==="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSheepDog.g:28:7: ( '[tags=\"' )
            // InternalSheepDog.g:28:9: '[tags=\"'
            {
            match("[tags=\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSheepDog.g:29:7: ( '\"]' )
            // InternalSheepDog.g:29:9: '\"]'
            {
            match("\"]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSheepDog.g:30:7: ( '|' )
            // InternalSheepDog.g:30:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "RULE_WORD"
    public final void mRULE_WORD() throws RecognitionException {
        try {
            int _type = RULE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSheepDog.g:3590:11: (~ ( ( '\"' | ' ' | '\\t' | '\\r' | '\\n' | '#' | '|' ) ) )
            // InternalSheepDog.g:3590:13: ~ ( ( '\"' | ' ' | '\\t' | '\\r' | '\\n' | '#' | '|' ) )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||input.LA(1)=='!'||(input.LA(1)>='$' && input.LA(1)<='{')||(input.LA(1)>='}' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WORD"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSheepDog.g:3592:9: ( ( ' ' | '\\t' | '\\r' )+ )
            // InternalSheepDog.g:3592:11: ( ' ' | '\\t' | '\\r' )+
            {
            // InternalSheepDog.g:3592:11: ( ' ' | '\\t' | '\\r' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\t'||LA1_0=='\r'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSheepDog.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSheepDog.g:3594:17: ( '#' (~ ( '\\n' ) )* RULE_EOL )
            // InternalSheepDog.g:3594:19: '#' (~ ( '\\n' ) )* RULE_EOL
            {
            match('#'); 
            // InternalSheepDog.g:3594:23: (~ ( '\\n' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSheepDog.g:3594:23: ~ ( '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
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
            // InternalSheepDog.g:3596:10: ( ( '\\n' )+ )
            // InternalSheepDog.g:3596:12: ( '\\n' )+
            {
            // InternalSheepDog.g:3596:12: ( '\\n' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\n') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSheepDog.g:3596:12: '\\n'
            	    {
            	    match('\n'); 

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
    // $ANTLR end "RULE_EOL"

    public void mTokens() throws RecognitionException {
        // InternalSheepDog.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | RULE_WORD | RULE_WS | RULE_SL_COMMENT | RULE_EOL )
        int alt4=24;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // InternalSheepDog.g:1:10: T__8
                {
                mT__8(); 

                }
                break;
            case 2 :
                // InternalSheepDog.g:1:15: T__9
                {
                mT__9(); 

                }
                break;
            case 3 :
                // InternalSheepDog.g:1:20: T__10
                {
                mT__10(); 

                }
                break;
            case 4 :
                // InternalSheepDog.g:1:26: T__11
                {
                mT__11(); 

                }
                break;
            case 5 :
                // InternalSheepDog.g:1:32: T__12
                {
                mT__12(); 

                }
                break;
            case 6 :
                // InternalSheepDog.g:1:38: T__13
                {
                mT__13(); 

                }
                break;
            case 7 :
                // InternalSheepDog.g:1:44: T__14
                {
                mT__14(); 

                }
                break;
            case 8 :
                // InternalSheepDog.g:1:50: T__15
                {
                mT__15(); 

                }
                break;
            case 9 :
                // InternalSheepDog.g:1:56: T__16
                {
                mT__16(); 

                }
                break;
            case 10 :
                // InternalSheepDog.g:1:62: T__17
                {
                mT__17(); 

                }
                break;
            case 11 :
                // InternalSheepDog.g:1:68: T__18
                {
                mT__18(); 

                }
                break;
            case 12 :
                // InternalSheepDog.g:1:74: T__19
                {
                mT__19(); 

                }
                break;
            case 13 :
                // InternalSheepDog.g:1:80: T__20
                {
                mT__20(); 

                }
                break;
            case 14 :
                // InternalSheepDog.g:1:86: T__21
                {
                mT__21(); 

                }
                break;
            case 15 :
                // InternalSheepDog.g:1:92: T__22
                {
                mT__22(); 

                }
                break;
            case 16 :
                // InternalSheepDog.g:1:98: T__23
                {
                mT__23(); 

                }
                break;
            case 17 :
                // InternalSheepDog.g:1:104: T__24
                {
                mT__24(); 

                }
                break;
            case 18 :
                // InternalSheepDog.g:1:110: T__25
                {
                mT__25(); 

                }
                break;
            case 19 :
                // InternalSheepDog.g:1:116: T__26
                {
                mT__26(); 

                }
                break;
            case 20 :
                // InternalSheepDog.g:1:122: T__27
                {
                mT__27(); 

                }
                break;
            case 21 :
                // InternalSheepDog.g:1:128: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;
            case 22 :
                // InternalSheepDog.g:1:138: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 23 :
                // InternalSheepDog.g:1:146: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 24 :
                // InternalSheepDog.g:1:162: RULE_EOL
                {
                mRULE_EOL(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\1\uffff\1\26\15\21\1\46\5\uffff\1\50\23\uffff";
    static final String DFA4_eofS =
        "\51\uffff";
    static final String DFA4_minS =
        "\1\0\1\75\1\142\1\145\1\141\1\145\1\141\1\143\1\170\1\151\2\150\1\156\1\55\1\157\1\75\5\uffff\1\75\23\uffff";
    static final String DFA4_maxS =
        "\1\uffff\1\75\1\142\1\145\1\141\1\145\1\141\1\143\1\170\1\151\2\150\1\156\1\55\1\164\1\75\5\uffff\1\75\23\uffff";
    static final String DFA4_acceptS =
        "\20\uffff\1\23\1\25\1\26\1\27\1\30\1\uffff\1\1\1\2\1\4\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\22\1\21\1\24\1\5\1\3";
    static final String DFA4_specialS =
        "\1\0\50\uffff}>";
    static final String[] DFA4_transitionS = {
            "\11\21\1\22\1\24\2\21\1\22\22\21\1\22\1\21\1\20\1\23\11\21\1\15\17\21\1\1\3\21\1\14\1\6\1\21\1\3\1\10\1\5\1\11\7\21\1\2\1\4\2\21\1\7\1\13\2\21\1\12\3\21\1\16\40\21\1\17\uff83\21",
            "\1\25",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43\4\uffff\1\44",
            "\1\45",
            "",
            "",
            "",
            "",
            "",
            "\1\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | RULE_WORD | RULE_WS | RULE_SL_COMMENT | RULE_EOL );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_0 = input.LA(1);

                        s = -1;
                        if ( (LA4_0=='=') ) {s = 1;}

                        else if ( (LA4_0=='O') ) {s = 2;}

                        else if ( (LA4_0=='D') ) {s = 3;}

                        else if ( (LA4_0=='P') ) {s = 4;}

                        else if ( (LA4_0=='F') ) {s = 5;}

                        else if ( (LA4_0=='B') ) {s = 6;}

                        else if ( (LA4_0=='S') ) {s = 7;}

                        else if ( (LA4_0=='E') ) {s = 8;}

                        else if ( (LA4_0=='G') ) {s = 9;}

                        else if ( (LA4_0=='W') ) {s = 10;}

                        else if ( (LA4_0=='T') ) {s = 11;}

                        else if ( (LA4_0=='A') ) {s = 12;}

                        else if ( (LA4_0=='-') ) {s = 13;}

                        else if ( (LA4_0=='[') ) {s = 14;}

                        else if ( (LA4_0=='|') ) {s = 15;}

                        else if ( (LA4_0=='\"') ) {s = 16;}

                        else if ( ((LA4_0>='\u0000' && LA4_0<='\b')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\u001F')||LA4_0=='!'||(LA4_0>='$' && LA4_0<=',')||(LA4_0>='.' && LA4_0<='<')||(LA4_0>='>' && LA4_0<='@')||LA4_0=='C'||(LA4_0>='H' && LA4_0<='N')||(LA4_0>='Q' && LA4_0<='R')||(LA4_0>='U' && LA4_0<='V')||(LA4_0>='X' && LA4_0<='Z')||(LA4_0>='\\' && LA4_0<='{')||(LA4_0>='}' && LA4_0<='\uFFFF')) ) {s = 17;}

                        else if ( (LA4_0=='\t'||LA4_0=='\r'||LA4_0==' ') ) {s = 18;}

                        else if ( (LA4_0=='#') ) {s = 19;}

                        else if ( (LA4_0=='\n') ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
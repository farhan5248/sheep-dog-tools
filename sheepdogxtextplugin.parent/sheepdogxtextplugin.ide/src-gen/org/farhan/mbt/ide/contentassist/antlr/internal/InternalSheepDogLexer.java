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
    public static final int RULE_WORD=4;
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
    public static final int RULE_EOL=5;
    public static final int RULE_WS=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
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
            // InternalSheepDog.g:28:7: ( ':tags:' )
            // InternalSheepDog.g:28:9: ':tags:'
            {
            match(":tags:"); 


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
            // InternalSheepDog.g:29:7: ( '[tags=\"' )
            // InternalSheepDog.g:29:9: '[tags=\"'
            {
            match("[tags=\""); 


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
            // InternalSheepDog.g:30:7: ( '\"]' )
            // InternalSheepDog.g:30:9: '\"]'
            {
            match("\"]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSheepDog.g:31:7: ( '|' )
            // InternalSheepDog.g:31:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "RULE_WORD"
    public final void mRULE_WORD() throws RecognitionException {
        try {
            int _type = RULE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSheepDog.g:4042:11: ( (~ ( ( ' ' | '\\t' | '\\r' | '\\n' | '#' | '\"' | '|' ) ) )+ )
            // InternalSheepDog.g:4042:13: (~ ( ( ' ' | '\\t' | '\\r' | '\\n' | '#' | '\"' | '|' ) ) )+
            {
            // InternalSheepDog.g:4042:13: (~ ( ( ' ' | '\\t' | '\\r' | '\\n' | '#' | '\"' | '|' ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\b')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\u001F')||LA1_0=='!'||(LA1_0>='$' && LA1_0<='{')||(LA1_0>='}' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSheepDog.g:4042:13: ~ ( ( ' ' | '\\t' | '\\r' | '\\n' | '#' | '\"' | '|' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||input.LA(1)=='!'||(input.LA(1)>='$' && input.LA(1)<='{')||(input.LA(1)>='}' && input.LA(1)<='\uFFFF') ) {
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSheepDog.g:4044:9: ( ( ' ' | '\\t' | '\\r' )+ )
            // InternalSheepDog.g:4044:11: ( ' ' | '\\t' | '\\r' )+
            {
            // InternalSheepDog.g:4044:11: ( ' ' | '\\t' | '\\r' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\t'||LA2_0=='\r'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
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
            // InternalSheepDog.g:4046:17: ( '#' (~ ( '\\n' ) )* RULE_EOL )
            // InternalSheepDog.g:4046:19: '#' (~ ( '\\n' ) )* RULE_EOL
            {
            match('#'); 
            // InternalSheepDog.g:4046:23: (~ ( '\\n' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSheepDog.g:4046:23: ~ ( '\\n' )
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
            // InternalSheepDog.g:4048:10: ( ( '\\n' )+ )
            // InternalSheepDog.g:4048:12: ( '\\n' )+
            {
            // InternalSheepDog.g:4048:12: ( '\\n' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\n') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSheepDog.g:4048:12: '\\n'
            	    {
            	    match('\n'); 

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
        // InternalSheepDog.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | RULE_WORD | RULE_WS | RULE_SL_COMMENT | RULE_EOL )
        int alt5=25;
        alt5 = dfa5.predict(input);
        switch (alt5) {
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
                // InternalSheepDog.g:1:128: T__28
                {
                mT__28(); 

                }
                break;
            case 22 :
                // InternalSheepDog.g:1:134: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;
            case 23 :
                // InternalSheepDog.g:1:144: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 24 :
                // InternalSheepDog.g:1:152: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 25 :
                // InternalSheepDog.g:1:168: RULE_EOL
                {
                mRULE_EOL(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\1\uffff\1\27\15\22\1\47\1\22\5\uffff\1\52\1\uffff\16\22\2\uffff\1\22\1\72\1\uffff\12\22\1\105\4\22\1\uffff\10\22\1\122\1\123\1\uffff\1\124\12\22\1\137\3\uffff\12\22\1\uffff\2\22\1\154\1\155\7\22\3\uffff\2\22\1\167\6\22\1\uffff\1\22\1\177\1\u0080\4\22\3\uffff\1\u0085\1\u0086\1\u0087\3\uffff";
    static final String DFA5_eofS =
        "\u0088\uffff";
    static final String DFA5_minS =
        "\2\0\1\142\1\145\1\141\1\145\1\141\1\143\1\170\1\151\2\150\1\156\1\55\1\157\1\75\1\164\5\uffff\1\0\1\uffff\1\152\1\146\1\162\1\141\1\143\1\145\1\141\1\166\2\145\1\144\1\55\1\160\1\141\2\uffff\1\141\1\0\1\uffff\1\145\1\151\1\141\1\164\1\153\1\156\1\155\1\145\2\156\1\0\1\55\1\164\2\147\1\uffff\1\143\1\156\1\155\1\165\1\147\1\141\1\160\1\156\2\0\1\uffff\1\0\1\151\2\163\1\164\1\151\1\145\3\162\1\154\1\0\3\uffff\1\157\1\75\2\72\2\164\1\145\1\157\1\151\1\145\1\uffff\1\156\1\42\2\0\1\151\1\145\1\72\1\165\1\157\2\163\3\uffff\1\157\1\162\1\0\1\156\2\72\1\75\1\156\1\163\1\uffff\1\144\2\0\1\42\3\72\3\uffff\3\0\3\uffff";
    static final String DFA5_maxS =
        "\2\uffff\1\142\1\145\1\141\1\145\1\141\1\143\1\170\1\151\2\150\1\156\1\55\1\164\1\75\1\164\5\uffff\1\uffff\1\uffff\1\152\1\146\1\162\1\141\1\143\1\145\1\141\1\166\2\145\1\144\1\55\1\160\1\141\2\uffff\1\141\1\uffff\1\uffff\1\145\1\151\1\141\1\164\1\153\1\156\1\155\1\145\2\156\1\uffff\1\55\1\164\2\147\1\uffff\1\143\1\156\1\155\1\165\1\147\1\141\1\160\1\156\2\uffff\1\uffff\1\uffff\1\151\2\163\1\164\1\151\1\145\3\162\1\154\1\uffff\3\uffff\1\157\1\75\2\72\2\164\1\145\1\157\1\151\1\145\1\uffff\1\156\1\42\2\uffff\1\151\1\145\1\72\1\165\1\157\2\163\3\uffff\1\157\1\162\1\uffff\1\156\2\72\1\75\1\156\1\163\1\uffff\1\144\2\uffff\1\42\3\72\3\uffff\3\uffff\3\uffff";
    static final String DFA5_acceptS =
        "\21\uffff\1\24\1\26\1\27\1\30\1\31\1\uffff\1\1\16\uffff\1\21\1\25\2\uffff\1\3\17\uffff\1\5\12\uffff\1\16\14\uffff\1\14\1\15\1\17\12\uffff\1\13\13\uffff\1\23\1\22\1\2\11\uffff\1\7\7\uffff\1\11\1\12\1\20\3\uffff\1\4\1\6\1\10";
    static final String DFA5_specialS =
        "\1\15\1\5\24\uffff\1\2\22\uffff\1\20\13\uffff\1\12\15\uffff\1\10\1\11\1\uffff\1\13\12\uffff\1\7\20\uffff\1\16\1\14\14\uffff\1\1\10\uffff\1\4\1\6\7\uffff\1\17\1\0\1\3\3\uffff}>";
    static final String[] DFA5_transitionS = {
            "\11\22\1\23\1\25\2\22\1\23\22\22\1\23\1\22\1\21\1\24\11\22\1\15\14\22\1\20\2\22\1\1\3\22\1\14\1\6\1\22\1\3\1\10\1\5\1\11\7\22\1\2\1\4\2\22\1\7\1\13\2\22\1\12\3\22\1\16\40\22\1\17\uff83\22",
            "\11\22\2\uffff\2\22\1\uffff\22\22\1\uffff\1\22\2\uffff\31\22\1\26\76\22\1\uffff\uff83\22",
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
            "\1\43",
            "\1\44\4\uffff\1\45",
            "\1\46",
            "\1\50",
            "",
            "",
            "",
            "",
            "",
            "\11\22\2\uffff\2\22\1\uffff\22\22\1\uffff\1\22\2\uffff\31\22\1\51\76\22\1\uffff\uff83\22",
            "",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "",
            "",
            "\1\71",
            "\11\22\2\uffff\2\22\1\uffff\22\22\1\uffff\1\22\2\uffff\130\22\1\uffff\uff83\22",
            "",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\11\22\2\uffff\2\22\1\uffff\22\22\1\uffff\1\22\2\uffff\130\22\1\uffff\uff83\22",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\11\22\2\uffff\2\22\1\uffff\22\22\1\uffff\1\22\2\uffff\130\22\1\uffff\uff83\22",
            "\11\22\2\uffff\2\22\1\uffff\22\22\1\uffff\1\22\2\uffff\130\22\1\uffff\uff83\22",
            "",
            "\11\22\2\uffff\2\22\1\uffff\22\22\1\uffff\1\22\2\uffff\130\22\1\uffff\uff83\22",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\11\22\2\uffff\2\22\1\uffff\22\22\1\uffff\1\22\2\uffff\130\22\1\uffff\uff83\22",
            "",
            "",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "",
            "\1\152",
            "\1\153",
            "\11\22\2\uffff\2\22\1\uffff\22\22\1\uffff\1\22\2\uffff\130\22\1\uffff\uff83\22",
            "\11\22\2\uffff\2\22\1\uffff\22\22\1\uffff\1\22\2\uffff\130\22\1\uffff\uff83\22",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "",
            "",
            "",
            "\1\165",
            "\1\166",
            "\11\22\2\uffff\2\22\1\uffff\22\22\1\uffff\1\22\2\uffff\130\22\1\uffff\uff83\22",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "",
            "\1\176",
            "\11\22\2\uffff\2\22\1\uffff\22\22\1\uffff\1\22\2\uffff\130\22\1\uffff\uff83\22",
            "\11\22\2\uffff\2\22\1\uffff\22\22\1\uffff\1\22\2\uffff\130\22\1\uffff\uff83\22",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "",
            "",
            "",
            "\11\22\2\uffff\2\22\1\uffff\22\22\1\uffff\1\22\2\uffff\130\22\1\uffff\uff83\22",
            "\11\22\2\uffff\2\22\1\uffff\22\22\1\uffff\1\22\2\uffff\130\22\1\uffff\uff83\22",
            "\11\22\2\uffff\2\22\1\uffff\22\22\1\uffff\1\22\2\uffff\130\22\1\uffff\uff83\22",
            "",
            "",
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
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | RULE_WORD | RULE_WS | RULE_SL_COMMENT | RULE_EOL );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_131 = input.LA(1);

                        s = -1;
                        if ( ((LA5_131>='\u0000' && LA5_131<='\b')||(LA5_131>='\u000B' && LA5_131<='\f')||(LA5_131>='\u000E' && LA5_131<='\u001F')||LA5_131=='!'||(LA5_131>='$' && LA5_131<='{')||(LA5_131>='}' && LA5_131<='\uFFFF')) ) {s = 18;}

                        else s = 134;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_112 = input.LA(1);

                        s = -1;
                        if ( ((LA5_112>='\u0000' && LA5_112<='\b')||(LA5_112>='\u000B' && LA5_112<='\f')||(LA5_112>='\u000E' && LA5_112<='\u001F')||LA5_112=='!'||(LA5_112>='$' && LA5_112<='{')||(LA5_112>='}' && LA5_112<='\uFFFF')) ) {s = 18;}

                        else s = 119;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA5_22 = input.LA(1);

                        s = -1;
                        if ( (LA5_22=='=') ) {s = 41;}

                        else if ( ((LA5_22>='\u0000' && LA5_22<='\b')||(LA5_22>='\u000B' && LA5_22<='\f')||(LA5_22>='\u000E' && LA5_22<='\u001F')||LA5_22=='!'||(LA5_22>='$' && LA5_22<='<')||(LA5_22>='>' && LA5_22<='{')||(LA5_22>='}' && LA5_22<='\uFFFF')) ) {s = 18;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA5_132 = input.LA(1);

                        s = -1;
                        if ( ((LA5_132>='\u0000' && LA5_132<='\b')||(LA5_132>='\u000B' && LA5_132<='\f')||(LA5_132>='\u000E' && LA5_132<='\u001F')||LA5_132=='!'||(LA5_132>='$' && LA5_132<='{')||(LA5_132>='}' && LA5_132<='\uFFFF')) ) {s = 18;}

                        else s = 135;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA5_121 = input.LA(1);

                        s = -1;
                        if ( ((LA5_121>='\u0000' && LA5_121<='\b')||(LA5_121>='\u000B' && LA5_121<='\f')||(LA5_121>='\u000E' && LA5_121<='\u001F')||LA5_121=='!'||(LA5_121>='$' && LA5_121<='{')||(LA5_121>='}' && LA5_121<='\uFFFF')) ) {s = 18;}

                        else s = 127;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA5_1 = input.LA(1);

                        s = -1;
                        if ( (LA5_1=='=') ) {s = 22;}

                        else if ( ((LA5_1>='\u0000' && LA5_1<='\b')||(LA5_1>='\u000B' && LA5_1<='\f')||(LA5_1>='\u000E' && LA5_1<='\u001F')||LA5_1=='!'||(LA5_1>='$' && LA5_1<='<')||(LA5_1>='>' && LA5_1<='{')||(LA5_1>='}' && LA5_1<='\uFFFF')) ) {s = 18;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA5_122 = input.LA(1);

                        s = -1;
                        if ( ((LA5_122>='\u0000' && LA5_122<='\b')||(LA5_122>='\u000B' && LA5_122<='\f')||(LA5_122>='\u000E' && LA5_122<='\u001F')||LA5_122=='!'||(LA5_122>='$' && LA5_122<='{')||(LA5_122>='}' && LA5_122<='\uFFFF')) ) {s = 18;}

                        else s = 128;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA5_81 = input.LA(1);

                        s = -1;
                        if ( ((LA5_81>='\u0000' && LA5_81<='\b')||(LA5_81>='\u000B' && LA5_81<='\f')||(LA5_81>='\u000E' && LA5_81<='\u001F')||LA5_81=='!'||(LA5_81>='$' && LA5_81<='{')||(LA5_81>='}' && LA5_81<='\uFFFF')) ) {s = 18;}

                        else s = 95;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA5_67 = input.LA(1);

                        s = -1;
                        if ( ((LA5_67>='\u0000' && LA5_67<='\b')||(LA5_67>='\u000B' && LA5_67<='\f')||(LA5_67>='\u000E' && LA5_67<='\u001F')||LA5_67=='!'||(LA5_67>='$' && LA5_67<='{')||(LA5_67>='}' && LA5_67<='\uFFFF')) ) {s = 18;}

                        else s = 82;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA5_68 = input.LA(1);

                        s = -1;
                        if ( ((LA5_68>='\u0000' && LA5_68<='\b')||(LA5_68>='\u000B' && LA5_68<='\f')||(LA5_68>='\u000E' && LA5_68<='\u001F')||LA5_68=='!'||(LA5_68>='$' && LA5_68<='{')||(LA5_68>='}' && LA5_68<='\uFFFF')) ) {s = 18;}

                        else s = 83;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA5_53 = input.LA(1);

                        s = -1;
                        if ( ((LA5_53>='\u0000' && LA5_53<='\b')||(LA5_53>='\u000B' && LA5_53<='\f')||(LA5_53>='\u000E' && LA5_53<='\u001F')||LA5_53=='!'||(LA5_53>='$' && LA5_53<='{')||(LA5_53>='}' && LA5_53<='\uFFFF')) ) {s = 18;}

                        else s = 69;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA5_70 = input.LA(1);

                        s = -1;
                        if ( ((LA5_70>='\u0000' && LA5_70<='\b')||(LA5_70>='\u000B' && LA5_70<='\f')||(LA5_70>='\u000E' && LA5_70<='\u001F')||LA5_70=='!'||(LA5_70>='$' && LA5_70<='{')||(LA5_70>='}' && LA5_70<='\uFFFF')) ) {s = 18;}

                        else s = 84;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA5_99 = input.LA(1);

                        s = -1;
                        if ( ((LA5_99>='\u0000' && LA5_99<='\b')||(LA5_99>='\u000B' && LA5_99<='\f')||(LA5_99>='\u000E' && LA5_99<='\u001F')||LA5_99=='!'||(LA5_99>='$' && LA5_99<='{')||(LA5_99>='}' && LA5_99<='\uFFFF')) ) {s = 18;}

                        else s = 109;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA5_0 = input.LA(1);

                        s = -1;
                        if ( (LA5_0=='=') ) {s = 1;}

                        else if ( (LA5_0=='O') ) {s = 2;}

                        else if ( (LA5_0=='D') ) {s = 3;}

                        else if ( (LA5_0=='P') ) {s = 4;}

                        else if ( (LA5_0=='F') ) {s = 5;}

                        else if ( (LA5_0=='B') ) {s = 6;}

                        else if ( (LA5_0=='S') ) {s = 7;}

                        else if ( (LA5_0=='E') ) {s = 8;}

                        else if ( (LA5_0=='G') ) {s = 9;}

                        else if ( (LA5_0=='W') ) {s = 10;}

                        else if ( (LA5_0=='T') ) {s = 11;}

                        else if ( (LA5_0=='A') ) {s = 12;}

                        else if ( (LA5_0=='-') ) {s = 13;}

                        else if ( (LA5_0=='[') ) {s = 14;}

                        else if ( (LA5_0=='|') ) {s = 15;}

                        else if ( (LA5_0==':') ) {s = 16;}

                        else if ( (LA5_0=='\"') ) {s = 17;}

                        else if ( ((LA5_0>='\u0000' && LA5_0<='\b')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\u001F')||LA5_0=='!'||(LA5_0>='$' && LA5_0<=',')||(LA5_0>='.' && LA5_0<='9')||(LA5_0>=';' && LA5_0<='<')||(LA5_0>='>' && LA5_0<='@')||LA5_0=='C'||(LA5_0>='H' && LA5_0<='N')||(LA5_0>='Q' && LA5_0<='R')||(LA5_0>='U' && LA5_0<='V')||(LA5_0>='X' && LA5_0<='Z')||(LA5_0>='\\' && LA5_0<='{')||(LA5_0>='}' && LA5_0<='\uFFFF')) ) {s = 18;}

                        else if ( (LA5_0=='\t'||LA5_0=='\r'||LA5_0==' ') ) {s = 19;}

                        else if ( (LA5_0=='#') ) {s = 20;}

                        else if ( (LA5_0=='\n') ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA5_98 = input.LA(1);

                        s = -1;
                        if ( ((LA5_98>='\u0000' && LA5_98<='\b')||(LA5_98>='\u000B' && LA5_98<='\f')||(LA5_98>='\u000E' && LA5_98<='\u001F')||LA5_98=='!'||(LA5_98>='$' && LA5_98<='{')||(LA5_98>='}' && LA5_98<='\uFFFF')) ) {s = 18;}

                        else s = 108;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA5_130 = input.LA(1);

                        s = -1;
                        if ( ((LA5_130>='\u0000' && LA5_130<='\b')||(LA5_130>='\u000B' && LA5_130<='\f')||(LA5_130>='\u000E' && LA5_130<='\u001F')||LA5_130=='!'||(LA5_130>='$' && LA5_130<='{')||(LA5_130>='}' && LA5_130<='\uFFFF')) ) {s = 18;}

                        else s = 133;

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA5_41 = input.LA(1);

                        s = -1;
                        if ( ((LA5_41>='\u0000' && LA5_41<='\b')||(LA5_41>='\u000B' && LA5_41<='\f')||(LA5_41>='\u000E' && LA5_41<='\u001F')||LA5_41=='!'||(LA5_41>='$' && LA5_41<='{')||(LA5_41>='}' && LA5_41<='\uFFFF')) ) {s = 18;}

                        else s = 58;

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
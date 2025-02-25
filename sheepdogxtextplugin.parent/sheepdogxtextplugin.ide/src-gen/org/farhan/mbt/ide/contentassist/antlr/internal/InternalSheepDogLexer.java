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
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_EOL=5;
    public static final int RULE_WS=7;
    public static final int RULE_RAWTEXT=6;
    public static final int T__26=26;
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

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
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
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSheepDog.g:12:7: ( 'Object:' )
            // InternalSheepDog.g:12:9: 'Object:'
            {
            match("Object:"); 


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
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSheepDog.g:21:7: ( 'Given:' )
            // InternalSheepDog.g:21:9: 'Given:'
            {
            match("Given:"); 


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
            // InternalSheepDog.g:22:7: ( 'When:' )
            // InternalSheepDog.g:22:9: 'When:'
            {
            match("When:"); 


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
            // InternalSheepDog.g:23:7: ( 'Then:' )
            // InternalSheepDog.g:23:9: 'Then:'
            {
            match("Then:"); 


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
            // InternalSheepDog.g:24:7: ( 'And:' )
            // InternalSheepDog.g:24:9: 'And:'
            {
            match("And:"); 


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
            // InternalSheepDog.g:25:7: ( '|===' )
            // InternalSheepDog.g:25:9: '|==='
            {
            match("|==="); 


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
            // InternalSheepDog.g:26:7: ( '[tags=' )
            // InternalSheepDog.g:26:9: '[tags='
            {
            match("[tags="); 


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
            // InternalSheepDog.g:27:7: ( ']' )
            // InternalSheepDog.g:27:9: ']'
            {
            match(']'); 

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
            // InternalSheepDog.g:28:7: ( '|' )
            // InternalSheepDog.g:28:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "RULE_WORD"
    public final void mRULE_WORD() throws RecognitionException {
        try {
            int _type = RULE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSheepDog.g:3643:11: (~ ( ( ' ' | '\\t' | '\\r' | '\\n' | '[' | ']' | '|' | '#' ) ) (~ ( ( ' ' | '\\t' | '\\r' | '\\n' | '[' | ']' ) ) )* )
            // InternalSheepDog.g:3643:13: ~ ( ( ' ' | '\\t' | '\\r' | '\\n' | '[' | ']' | '|' | '#' ) ) (~ ( ( ' ' | '\\t' | '\\r' | '\\n' | '[' | ']' ) ) )*
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\"')||(input.LA(1)>='$' && input.LA(1)<='Z')||input.LA(1)=='\\'||(input.LA(1)>='^' && input.LA(1)<='{')||(input.LA(1)>='}' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSheepDog.g:3643:53: (~ ( ( ' ' | '\\t' | '\\r' | '\\n' | '[' | ']' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\b')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\u001F')||(LA1_0>='!' && LA1_0<='Z')||LA1_0=='\\'||(LA1_0>='^' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSheepDog.g:3643:53: ~ ( ( ' ' | '\\t' | '\\r' | '\\n' | '[' | ']' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='Z')||input.LA(1)=='\\'||(input.LA(1)>='^' && input.LA(1)<='\uFFFF') ) {
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
    // $ANTLR end "RULE_WORD"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSheepDog.g:3645:9: ( ( ' ' | '\\t' | '\\r' )+ )
            // InternalSheepDog.g:3645:11: ( ' ' | '\\t' | '\\r' )+
            {
            // InternalSheepDog.g:3645:11: ( ' ' | '\\t' | '\\r' )+
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
            // InternalSheepDog.g:3647:17: ( '#' (~ ( '\\n' ) )* RULE_EOL )
            // InternalSheepDog.g:3647:19: '#' (~ ( '\\n' ) )* RULE_EOL
            {
            match('#'); 
            // InternalSheepDog.g:3647:23: (~ ( '\\n' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSheepDog.g:3647:23: ~ ( '\\n' )
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
            // InternalSheepDog.g:3649:10: ( ( '\\n' )+ )
            // InternalSheepDog.g:3649:12: ( '\\n' )+
            {
            // InternalSheepDog.g:3649:12: ( '\\n' )+
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
            	    // InternalSheepDog.g:3649:12: '\\n'
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

    // $ANTLR start "RULE_RAWTEXT"
    public final void mRULE_RAWTEXT() throws RecognitionException {
        try {
            int _type = RULE_RAWTEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSheepDog.g:3651:14: ( '----' '\\n' ( . )+ '\\n' '----' )
            // InternalSheepDog.g:3651:16: '----' '\\n' ( . )+ '\\n' '----'
            {
            match("----"); 

            match('\n'); 
            // InternalSheepDog.g:3651:28: ( . )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\n') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='-') ) {
                        int LA5_3 = input.LA(3);

                        if ( (LA5_3=='-') ) {
                            int LA5_4 = input.LA(4);

                            if ( (LA5_4=='-') ) {
                                int LA5_5 = input.LA(5);

                                if ( (LA5_5=='-') ) {
                                    alt5=2;
                                }
                                else if ( ((LA5_5>='\u0000' && LA5_5<=',')||(LA5_5>='.' && LA5_5<='\uFFFF')) ) {
                                    alt5=1;
                                }


                            }
                            else if ( ((LA5_4>='\u0000' && LA5_4<=',')||(LA5_4>='.' && LA5_4<='\uFFFF')) ) {
                                alt5=1;
                            }


                        }
                        else if ( ((LA5_3>='\u0000' && LA5_3<=',')||(LA5_3>='.' && LA5_3<='\uFFFF')) ) {
                            alt5=1;
                        }


                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<=',')||(LA5_1>='.' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSheepDog.g:3651:28: .
            	    {
            	    matchAny(); 

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

            match('\n'); 
            match("----"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RAWTEXT"

    public void mTokens() throws RecognitionException {
        // InternalSheepDog.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_WORD | RULE_WS | RULE_SL_COMMENT | RULE_EOL | RULE_RAWTEXT )
        int alt6=23;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // InternalSheepDog.g:1:10: T__9
                {
                mT__9(); 

                }
                break;
            case 2 :
                // InternalSheepDog.g:1:15: T__10
                {
                mT__10(); 

                }
                break;
            case 3 :
                // InternalSheepDog.g:1:21: T__11
                {
                mT__11(); 

                }
                break;
            case 4 :
                // InternalSheepDog.g:1:27: T__12
                {
                mT__12(); 

                }
                break;
            case 5 :
                // InternalSheepDog.g:1:33: T__13
                {
                mT__13(); 

                }
                break;
            case 6 :
                // InternalSheepDog.g:1:39: T__14
                {
                mT__14(); 

                }
                break;
            case 7 :
                // InternalSheepDog.g:1:45: T__15
                {
                mT__15(); 

                }
                break;
            case 8 :
                // InternalSheepDog.g:1:51: T__16
                {
                mT__16(); 

                }
                break;
            case 9 :
                // InternalSheepDog.g:1:57: T__17
                {
                mT__17(); 

                }
                break;
            case 10 :
                // InternalSheepDog.g:1:63: T__18
                {
                mT__18(); 

                }
                break;
            case 11 :
                // InternalSheepDog.g:1:69: T__19
                {
                mT__19(); 

                }
                break;
            case 12 :
                // InternalSheepDog.g:1:75: T__20
                {
                mT__20(); 

                }
                break;
            case 13 :
                // InternalSheepDog.g:1:81: T__21
                {
                mT__21(); 

                }
                break;
            case 14 :
                // InternalSheepDog.g:1:87: T__22
                {
                mT__22(); 

                }
                break;
            case 15 :
                // InternalSheepDog.g:1:93: T__23
                {
                mT__23(); 

                }
                break;
            case 16 :
                // InternalSheepDog.g:1:99: T__24
                {
                mT__24(); 

                }
                break;
            case 17 :
                // InternalSheepDog.g:1:105: T__25
                {
                mT__25(); 

                }
                break;
            case 18 :
                // InternalSheepDog.g:1:111: T__26
                {
                mT__26(); 

                }
                break;
            case 19 :
                // InternalSheepDog.g:1:117: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;
            case 20 :
                // InternalSheepDog.g:1:127: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 21 :
                // InternalSheepDog.g:1:135: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 22 :
                // InternalSheepDog.g:1:151: RULE_EOL
                {
                mRULE_EOL(); 

                }
                break;
            case 23 :
                // InternalSheepDog.g:1:160: RULE_RAWTEXT
                {
                mRULE_RAWTEXT(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\1\26\13\24\1\43\2\uffff\1\24\4\uffff\1\46\1\uffff\13\24\2\uffff\1\24\1\63\1\uffff\14\24\1\uffff\12\24\1\112\11\24\1\124\1\125\2\uffff\7\24\1\135\2\uffff\1\136\6\24\2\uffff\2\24\1\147\5\24\1\uffff\1\24\1\156\1\157\3\24\2\uffff\1\163\1\164\1\165\3\uffff";
    static final String DFA6_eofS =
        "\166\uffff";
    static final String DFA6_minS =
        "\2\0\1\142\1\145\1\141\1\145\1\141\1\143\1\170\1\151\2\150\1\156\1\75\2\uffff\1\55\4\uffff\1\0\1\uffff\1\152\1\146\1\162\1\141\1\143\1\145\1\141\1\166\2\145\1\144\2\uffff\1\55\1\0\1\uffff\1\145\1\151\1\141\1\164\1\153\1\156\1\155\1\145\2\156\1\72\1\55\1\uffff\1\143\1\156\1\155\1\165\1\147\1\141\1\160\1\156\2\72\1\0\1\12\1\164\1\151\1\145\3\162\1\154\1\72\2\0\2\uffff\1\72\2\164\1\145\1\157\1\151\1\145\1\0\2\uffff\1\0\1\151\1\145\1\72\1\165\1\157\1\163\2\uffff\1\157\1\162\1\0\1\156\2\72\1\156\1\163\1\uffff\1\144\2\0\3\72\2\uffff\3\0\3\uffff";
    static final String DFA6_maxS =
        "\2\uffff\1\142\1\145\1\141\1\145\1\141\1\143\1\170\1\151\2\150\1\156\1\75\2\uffff\1\55\4\uffff\1\uffff\1\uffff\1\152\1\146\1\162\1\141\1\143\1\145\1\141\1\166\2\145\1\144\2\uffff\1\55\1\uffff\1\uffff\1\145\1\151\1\141\1\164\1\153\1\156\1\155\1\145\2\156\1\72\1\55\1\uffff\1\143\1\156\1\155\1\165\1\147\1\141\1\160\1\156\2\72\1\uffff\1\12\1\164\1\151\1\145\3\162\1\154\1\72\2\uffff\2\uffff\1\72\2\164\1\145\1\157\1\151\1\145\1\uffff\2\uffff\1\uffff\1\151\1\145\1\72\1\165\1\157\1\163\2\uffff\1\157\1\162\1\uffff\1\156\2\72\1\156\1\163\1\uffff\1\144\2\uffff\3\72\2\uffff\3\uffff\3\uffff";
    static final String DFA6_acceptS =
        "\16\uffff\1\20\1\21\1\uffff\1\24\1\25\1\26\1\23\1\uffff\1\1\13\uffff\1\17\1\22\2\uffff\1\3\14\uffff\1\5\26\uffff\1\16\1\27\10\uffff\1\14\1\15\7\uffff\1\13\1\2\10\uffff\1\7\6\uffff\1\11\1\12\3\uffff\1\4\1\6\1\10";
    static final String DFA6_specialS =
        "\1\3\1\2\23\uffff\1\6\17\uffff\1\1\30\uffff\1\15\11\uffff\1\13\1\14\11\uffff\1\12\2\uffff\1\16\12\uffff\1\5\7\uffff\1\10\1\11\5\uffff\1\0\1\4\1\7\3\uffff}>";
    static final String[] DFA6_transitionS = {
            "\11\24\1\21\1\23\2\24\1\21\22\24\1\21\2\24\1\22\11\24\1\20\17\24\1\1\3\24\1\14\1\6\1\24\1\3\1\10\1\5\1\11\7\24\1\2\1\4\2\24\1\7\1\13\2\24\1\12\3\24\1\16\1\24\1\17\36\24\1\15\uff83\24",
            "\11\24\2\uffff\2\24\1\uffff\22\24\1\uffff\34\24\1\25\35\24\1\uffff\1\24\1\uffff\uffa2\24",
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
            "",
            "",
            "\1\44",
            "",
            "",
            "",
            "",
            "\11\24\2\uffff\2\24\1\uffff\22\24\1\uffff\34\24\1\45\35\24\1\uffff\1\24\1\uffff\uffa2\24",
            "",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "",
            "",
            "\1\62",
            "\11\24\2\uffff\2\24\1\uffff\22\24\1\uffff\72\24\1\uffff\1\24\1\uffff\uffa2\24",
            "",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\11\24\2\uffff\2\24\1\uffff\22\24\1\uffff\72\24\1\uffff\1\24\1\uffff\uffa2\24",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\11\24\2\uffff\2\24\1\uffff\22\24\1\uffff\72\24\1\uffff\1\24\1\uffff\uffa2\24",
            "\11\24\2\uffff\2\24\1\uffff\22\24\1\uffff\72\24\1\uffff\1\24\1\uffff\uffa2\24",
            "",
            "",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\11\24\2\uffff\2\24\1\uffff\22\24\1\uffff\72\24\1\uffff\1\24\1\uffff\uffa2\24",
            "",
            "",
            "\11\24\2\uffff\2\24\1\uffff\22\24\1\uffff\72\24\1\uffff\1\24\1\uffff\uffa2\24",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "",
            "",
            "\1\145",
            "\1\146",
            "\11\24\2\uffff\2\24\1\uffff\22\24\1\uffff\72\24\1\uffff\1\24\1\uffff\uffa2\24",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "",
            "\1\155",
            "\11\24\2\uffff\2\24\1\uffff\22\24\1\uffff\72\24\1\uffff\1\24\1\uffff\uffa2\24",
            "\11\24\2\uffff\2\24\1\uffff\22\24\1\uffff\72\24\1\uffff\1\24\1\uffff\uffa2\24",
            "\1\160",
            "\1\161",
            "\1\162",
            "",
            "",
            "\11\24\2\uffff\2\24\1\uffff\22\24\1\uffff\72\24\1\uffff\1\24\1\uffff\uffa2\24",
            "\11\24\2\uffff\2\24\1\uffff\22\24\1\uffff\72\24\1\uffff\1\24\1\uffff\uffa2\24",
            "\11\24\2\uffff\2\24\1\uffff\22\24\1\uffff\72\24\1\uffff\1\24\1\uffff\uffa2\24",
            "",
            "",
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
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_WORD | RULE_WS | RULE_SL_COMMENT | RULE_EOL | RULE_RAWTEXT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_112 = input.LA(1);

                        s = -1;
                        if ( ((LA6_112>='\u0000' && LA6_112<='\b')||(LA6_112>='\u000B' && LA6_112<='\f')||(LA6_112>='\u000E' && LA6_112<='\u001F')||(LA6_112>='!' && LA6_112<='Z')||LA6_112=='\\'||(LA6_112>='^' && LA6_112<='\uFFFF')) ) {s = 20;}

                        else s = 115;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_37 = input.LA(1);

                        s = -1;
                        if ( ((LA6_37>='\u0000' && LA6_37<='\b')||(LA6_37>='\u000B' && LA6_37<='\f')||(LA6_37>='\u000E' && LA6_37<='\u001F')||(LA6_37>='!' && LA6_37<='Z')||LA6_37=='\\'||(LA6_37>='^' && LA6_37<='\uFFFF')) ) {s = 20;}

                        else s = 51;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA6_1 = input.LA(1);

                        s = -1;
                        if ( (LA6_1=='=') ) {s = 21;}

                        else if ( ((LA6_1>='\u0000' && LA6_1<='\b')||(LA6_1>='\u000B' && LA6_1<='\f')||(LA6_1>='\u000E' && LA6_1<='\u001F')||(LA6_1>='!' && LA6_1<='<')||(LA6_1>='>' && LA6_1<='Z')||LA6_1=='\\'||(LA6_1>='^' && LA6_1<='\uFFFF')) ) {s = 20;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA6_0 = input.LA(1);

                        s = -1;
                        if ( (LA6_0=='=') ) {s = 1;}

                        else if ( (LA6_0=='O') ) {s = 2;}

                        else if ( (LA6_0=='D') ) {s = 3;}

                        else if ( (LA6_0=='P') ) {s = 4;}

                        else if ( (LA6_0=='F') ) {s = 5;}

                        else if ( (LA6_0=='B') ) {s = 6;}

                        else if ( (LA6_0=='S') ) {s = 7;}

                        else if ( (LA6_0=='E') ) {s = 8;}

                        else if ( (LA6_0=='G') ) {s = 9;}

                        else if ( (LA6_0=='W') ) {s = 10;}

                        else if ( (LA6_0=='T') ) {s = 11;}

                        else if ( (LA6_0=='A') ) {s = 12;}

                        else if ( (LA6_0=='|') ) {s = 13;}

                        else if ( (LA6_0=='[') ) {s = 14;}

                        else if ( (LA6_0==']') ) {s = 15;}

                        else if ( (LA6_0=='-') ) {s = 16;}

                        else if ( (LA6_0=='\t'||LA6_0=='\r'||LA6_0==' ') ) {s = 17;}

                        else if ( (LA6_0=='#') ) {s = 18;}

                        else if ( (LA6_0=='\n') ) {s = 19;}

                        else if ( ((LA6_0>='\u0000' && LA6_0<='\b')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\u001F')||(LA6_0>='!' && LA6_0<='\"')||(LA6_0>='$' && LA6_0<=',')||(LA6_0>='.' && LA6_0<='<')||(LA6_0>='>' && LA6_0<='@')||LA6_0=='C'||(LA6_0>='H' && LA6_0<='N')||(LA6_0>='Q' && LA6_0<='R')||(LA6_0>='U' && LA6_0<='V')||(LA6_0>='X' && LA6_0<='Z')||LA6_0=='\\'||(LA6_0>='^' && LA6_0<='{')||(LA6_0>='}' && LA6_0<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA6_113 = input.LA(1);

                        s = -1;
                        if ( ((LA6_113>='\u0000' && LA6_113<='\b')||(LA6_113>='\u000B' && LA6_113<='\f')||(LA6_113>='\u000E' && LA6_113<='\u001F')||(LA6_113>='!' && LA6_113<='Z')||LA6_113=='\\'||(LA6_113>='^' && LA6_113<='\uFFFF')) ) {s = 20;}

                        else s = 116;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA6_97 = input.LA(1);

                        s = -1;
                        if ( ((LA6_97>='\u0000' && LA6_97<='\b')||(LA6_97>='\u000B' && LA6_97<='\f')||(LA6_97>='\u000E' && LA6_97<='\u001F')||(LA6_97>='!' && LA6_97<='Z')||LA6_97=='\\'||(LA6_97>='^' && LA6_97<='\uFFFF')) ) {s = 20;}

                        else s = 103;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA6_21 = input.LA(1);

                        s = -1;
                        if ( (LA6_21=='=') ) {s = 37;}

                        else if ( ((LA6_21>='\u0000' && LA6_21<='\b')||(LA6_21>='\u000B' && LA6_21<='\f')||(LA6_21>='\u000E' && LA6_21<='\u001F')||(LA6_21>='!' && LA6_21<='<')||(LA6_21>='>' && LA6_21<='Z')||LA6_21=='\\'||(LA6_21>='^' && LA6_21<='\uFFFF')) ) {s = 20;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA6_114 = input.LA(1);

                        s = -1;
                        if ( ((LA6_114>='\u0000' && LA6_114<='\b')||(LA6_114>='\u000B' && LA6_114<='\f')||(LA6_114>='\u000E' && LA6_114<='\u001F')||(LA6_114>='!' && LA6_114<='Z')||LA6_114=='\\'||(LA6_114>='^' && LA6_114<='\uFFFF')) ) {s = 20;}

                        else s = 117;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA6_105 = input.LA(1);

                        s = -1;
                        if ( ((LA6_105>='\u0000' && LA6_105<='\b')||(LA6_105>='\u000B' && LA6_105<='\f')||(LA6_105>='\u000E' && LA6_105<='\u001F')||(LA6_105>='!' && LA6_105<='Z')||LA6_105=='\\'||(LA6_105>='^' && LA6_105<='\uFFFF')) ) {s = 20;}

                        else s = 110;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA6_106 = input.LA(1);

                        s = -1;
                        if ( ((LA6_106>='\u0000' && LA6_106<='\b')||(LA6_106>='\u000B' && LA6_106<='\f')||(LA6_106>='\u000E' && LA6_106<='\u001F')||(LA6_106>='!' && LA6_106<='Z')||LA6_106=='\\'||(LA6_106>='^' && LA6_106<='\uFFFF')) ) {s = 20;}

                        else s = 111;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA6_83 = input.LA(1);

                        s = -1;
                        if ( ((LA6_83>='\u0000' && LA6_83<='\b')||(LA6_83>='\u000B' && LA6_83<='\f')||(LA6_83>='\u000E' && LA6_83<='\u001F')||(LA6_83>='!' && LA6_83<='Z')||LA6_83=='\\'||(LA6_83>='^' && LA6_83<='\uFFFF')) ) {s = 20;}

                        else s = 93;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA6_72 = input.LA(1);

                        s = -1;
                        if ( ((LA6_72>='\u0000' && LA6_72<='\b')||(LA6_72>='\u000B' && LA6_72<='\f')||(LA6_72>='\u000E' && LA6_72<='\u001F')||(LA6_72>='!' && LA6_72<='Z')||LA6_72=='\\'||(LA6_72>='^' && LA6_72<='\uFFFF')) ) {s = 20;}

                        else s = 84;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA6_73 = input.LA(1);

                        s = -1;
                        if ( ((LA6_73>='\u0000' && LA6_73<='\b')||(LA6_73>='\u000B' && LA6_73<='\f')||(LA6_73>='\u000E' && LA6_73<='\u001F')||(LA6_73>='!' && LA6_73<='Z')||LA6_73=='\\'||(LA6_73>='^' && LA6_73<='\uFFFF')) ) {s = 20;}

                        else s = 85;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA6_62 = input.LA(1);

                        s = -1;
                        if ( ((LA6_62>='\u0000' && LA6_62<='\b')||(LA6_62>='\u000B' && LA6_62<='\f')||(LA6_62>='\u000E' && LA6_62<='\u001F')||(LA6_62>='!' && LA6_62<='Z')||LA6_62=='\\'||(LA6_62>='^' && LA6_62<='\uFFFF')) ) {s = 20;}

                        else s = 74;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA6_86 = input.LA(1);

                        s = -1;
                        if ( ((LA6_86>='\u0000' && LA6_86<='\b')||(LA6_86>='\u000B' && LA6_86<='\f')||(LA6_86>='\u000E' && LA6_86<='\u001F')||(LA6_86>='!' && LA6_86<='Z')||LA6_86=='\\'||(LA6_86>='^' && LA6_86<='\uFFFF')) ) {s = 20;}

                        else s = 94;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
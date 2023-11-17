package org.farhan.cukefsm.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCucumberFSMLexer extends Lexer {
    public static final int T__9=9;
    public static final int RULE_WS=5;
    public static final int RULE_EOL=6;
    public static final int RULE_WORD=4;
    public static final int RULE_COMMENT=7;
    public static final int RULE_TAG=8;
    public static final int EOF=-1;
    public static final int T__10=10;

    // delegates
    // delegators

    public InternalCucumberFSMLexer() {;} 
    public InternalCucumberFSMLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCucumberFSMLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCucumberFSM.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumberFSM.g:11:6: ( 'Hello' )
            // InternalCucumberFSM.g:11:8: 'Hello'
            {
            match("Hello"); 


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
            // InternalCucumberFSM.g:12:7: ( '!' )
            // InternalCucumberFSM.g:12:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumberFSM.g:144:9: ( ( ' ' | '\\t' )+ )
            // InternalCucumberFSM.g:144:11: ( ' ' | '\\t' )+
            {
            // InternalCucumberFSM.g:144:11: ( ' ' | '\\t' )+
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
            	    // InternalCucumberFSM.g:
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
            // InternalCucumberFSM.g:146:19: ( ( '\\r' | '\\n' )+ )
            // InternalCucumberFSM.g:146:21: ( '\\r' | '\\n' )+
            {
            // InternalCucumberFSM.g:146:21: ( '\\r' | '\\n' )+
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
            	    // InternalCucumberFSM.g:
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
            // InternalCucumberFSM.g:148:14: ( '#' (~ ( ( '\\r' | '\\n' ) ) )* RULE_EOL )
            // InternalCucumberFSM.g:148:16: '#' (~ ( ( '\\r' | '\\n' ) ) )* RULE_EOL
            {
            match('#'); 
            // InternalCucumberFSM.g:148:20: (~ ( ( '\\r' | '\\n' ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCucumberFSM.g:148:20: ~ ( ( '\\r' | '\\n' ) )
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
            // InternalCucumberFSM.g:150:11: ( (~ ( ( '@' | '|' | ' ' | '\\t' | '\\n' | '\\r' ) ) )+ )
            // InternalCucumberFSM.g:150:13: (~ ( ( '@' | '|' | ' ' | '\\t' | '\\n' | '\\r' ) ) )+
            {
            // InternalCucumberFSM.g:150:13: (~ ( ( '@' | '|' | ' ' | '\\t' | '\\n' | '\\r' ) ) )+
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
            	    // InternalCucumberFSM.g:150:13: ~ ( ( '@' | '|' | ' ' | '\\t' | '\\n' | '\\r' ) )
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
            // InternalCucumberFSM.g:152:10: ( '@' RULE_WORD )
            // InternalCucumberFSM.g:152:12: '@' RULE_WORD
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
        // InternalCucumberFSM.g:1:8: ( T__9 | T__10 | RULE_WS | RULE_COMMENT | RULE_WORD | RULE_TAG )
        int alt5=6;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // InternalCucumberFSM.g:1:10: T__9
                {
                mT__9(); 

                }
                break;
            case 2 :
                // InternalCucumberFSM.g:1:15: T__10
                {
                mT__10(); 

                }
                break;
            case 3 :
                // InternalCucumberFSM.g:1:21: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 4 :
                // InternalCucumberFSM.g:1:29: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;
            case 5 :
                // InternalCucumberFSM.g:1:42: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;
            case 6 :
                // InternalCucumberFSM.g:1:52: RULE_TAG
                {
                mRULE_TAG(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\1\uffff\1\5\1\10\1\uffff\1\5\2\uffff\1\5\1\uffff\1\5\1\uffff\2\5\1\16\1\uffff";
    static final String DFA5_eofS =
        "\17\uffff";
    static final String DFA5_minS =
        "\1\0\1\145\1\0\1\uffff\1\0\2\uffff\1\154\1\uffff\1\0\1\uffff\1\154\1\157\1\0\1\uffff";
    static final String DFA5_maxS =
        "\1\uffff\1\145\1\uffff\1\uffff\1\uffff\2\uffff\1\154\1\uffff\1\uffff\1\uffff\1\154\1\157\1\uffff\1\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\3\1\uffff\1\5\1\6\1\uffff\1\2\1\uffff\1\4\3\uffff\1\1";
    static final String DFA5_specialS =
        "\1\1\1\uffff\1\2\1\uffff\1\4\4\uffff\1\3\3\uffff\1\0\1\uffff}>";
    static final String[] DFA5_transitionS = {
            "\11\5\1\3\1\uffff\2\5\1\uffff\22\5\1\3\1\2\1\5\1\4\34\5\1\6\7\5\1\1\63\5\1\uffff\uff83\5",
            "\1\7",
            "\11\5\2\uffff\2\5\1\uffff\22\5\1\uffff\37\5\1\uffff\73\5\1\uffff\uff83\5",
            "",
            "\11\11\2\12\2\11\1\12\22\11\1\12\37\11\1\12\73\11\1\12\uff83\11",
            "",
            "",
            "\1\13",
            "",
            "\11\11\2\12\2\11\1\12\22\11\1\12\37\11\1\12\73\11\1\12\uff83\11",
            "",
            "\1\14",
            "\1\15",
            "\11\5\2\uffff\2\5\1\uffff\22\5\1\uffff\37\5\1\uffff\73\5\1\uffff\uff83\5",
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
            return "1:1: Tokens : ( T__9 | T__10 | RULE_WS | RULE_COMMENT | RULE_WORD | RULE_TAG );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_13 = input.LA(1);

                        s = -1;
                        if ( ((LA5_13>='\u0000' && LA5_13<='\b')||(LA5_13>='\u000B' && LA5_13<='\f')||(LA5_13>='\u000E' && LA5_13<='\u001F')||(LA5_13>='!' && LA5_13<='?')||(LA5_13>='A' && LA5_13<='{')||(LA5_13>='}' && LA5_13<='\uFFFF')) ) {s = 5;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_0 = input.LA(1);

                        s = -1;
                        if ( (LA5_0=='H') ) {s = 1;}

                        else if ( (LA5_0=='!') ) {s = 2;}

                        else if ( (LA5_0=='\t'||LA5_0==' ') ) {s = 3;}

                        else if ( (LA5_0=='#') ) {s = 4;}

                        else if ( ((LA5_0>='\u0000' && LA5_0<='\b')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\u001F')||LA5_0=='\"'||(LA5_0>='$' && LA5_0<='?')||(LA5_0>='A' && LA5_0<='G')||(LA5_0>='I' && LA5_0<='{')||(LA5_0>='}' && LA5_0<='\uFFFF')) ) {s = 5;}

                        else if ( (LA5_0=='@') ) {s = 6;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA5_2 = input.LA(1);

                        s = -1;
                        if ( ((LA5_2>='\u0000' && LA5_2<='\b')||(LA5_2>='\u000B' && LA5_2<='\f')||(LA5_2>='\u000E' && LA5_2<='\u001F')||(LA5_2>='!' && LA5_2<='?')||(LA5_2>='A' && LA5_2<='{')||(LA5_2>='}' && LA5_2<='\uFFFF')) ) {s = 5;}

                        else s = 8;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA5_9 = input.LA(1);

                        s = -1;
                        if ( ((LA5_9>='\t' && LA5_9<='\n')||LA5_9=='\r'||LA5_9==' '||LA5_9=='@'||LA5_9=='|') ) {s = 10;}

                        else if ( ((LA5_9>='\u0000' && LA5_9<='\b')||(LA5_9>='\u000B' && LA5_9<='\f')||(LA5_9>='\u000E' && LA5_9<='\u001F')||(LA5_9>='!' && LA5_9<='?')||(LA5_9>='A' && LA5_9<='{')||(LA5_9>='}' && LA5_9<='\uFFFF')) ) {s = 9;}

                        else s = 5;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA5_4 = input.LA(1);

                        s = -1;
                        if ( ((LA5_4>='\u0000' && LA5_4<='\b')||(LA5_4>='\u000B' && LA5_4<='\f')||(LA5_4>='\u000E' && LA5_4<='\u001F')||(LA5_4>='!' && LA5_4<='?')||(LA5_4>='A' && LA5_4<='{')||(LA5_4>='}' && LA5_4<='\uFFFF')) ) {s = 9;}

                        else if ( ((LA5_4>='\t' && LA5_4<='\n')||LA5_4=='\r'||LA5_4==' '||LA5_4=='@'||LA5_4=='|') ) {s = 10;}

                        else s = 5;

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
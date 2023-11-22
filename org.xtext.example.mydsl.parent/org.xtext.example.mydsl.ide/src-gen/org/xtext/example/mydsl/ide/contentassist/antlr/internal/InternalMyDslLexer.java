package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int T__8=8;
    public static final int RULE_ID=4;
    public static final int RULE_EOL=5;
    public static final int RULE_WS=6;
    public static final int RULE_SL_COMMENT=7;
    public static final int EOF=-1;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:6: ( 'Feature:' )
            // InternalMyDsl.g:11:8: 'Feature:'
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:341:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '0' .. '9' )* )
            // InternalMyDsl.g:341:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '0' .. '9' )*
            {
            // InternalMyDsl.g:341:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:341:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='.'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:341:44: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='.'||(LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( input.LA(1)=='.'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
            // InternalMyDsl.g:343:9: ( ( ' ' | '\\t' )+ )
            // InternalMyDsl.g:343:11: ( ' ' | '\\t' )+
            {
            // InternalMyDsl.g:343:11: ( ' ' | '\\t' )+
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
            	    // InternalMyDsl.g:
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
            // InternalMyDsl.g:345:17: ( '#' (~ ( ( '\\r' | '\\n' ) ) )* RULE_EOL )
            // InternalMyDsl.g:345:19: '#' (~ ( ( '\\r' | '\\n' ) ) )* RULE_EOL
            {
            match('#'); 
            // InternalMyDsl.g:345:23: (~ ( ( '\\r' | '\\n' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:345:23: ~ ( ( '\\r' | '\\n' ) )
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
            // InternalMyDsl.g:347:10: ( ( '\\r\\n' )+ )
            // InternalMyDsl.g:347:12: ( '\\r\\n' )+
            {
            // InternalMyDsl.g:347:12: ( '\\r\\n' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\r') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:347:12: '\\r\\n'
            	    {
            	    match("\r\n"); 


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
    // $ANTLR end "RULE_EOL"

    public void mTokens() throws RecognitionException {
        // InternalMyDsl.g:1:8: ( T__8 | RULE_ID | RULE_WS | RULE_SL_COMMENT | RULE_EOL )
        int alt6=5;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // InternalMyDsl.g:1:10: T__8
                {
                mT__8(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:15: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:23: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:31: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:47: RULE_EOL
                {
                mRULE_EOL(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\1\2\4\uffff\6\2\1\uffff";
    static final String DFA6_eofS =
        "\15\uffff";
    static final String DFA6_minS =
        "\1\11\1\145\4\uffff\1\141\1\164\1\165\1\162\1\145\1\72\1\uffff";
    static final String DFA6_maxS =
        "\1\172\1\145\4\uffff\1\141\1\164\1\165\1\162\1\145\1\72\1\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\6\uffff\1\1";
    static final String DFA6_specialS =
        "\15\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\3\3\uffff\1\5\22\uffff\1\3\2\uffff\1\4\12\uffff\1\2\22\uffff\5\2\1\1\24\2\3\uffff\2\2\1\uffff\32\2",
            "\1\6",
            "",
            "",
            "",
            "",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
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
            return "1:1: Tokens : ( T__8 | RULE_ID | RULE_WS | RULE_SL_COMMENT | RULE_EOL );";
        }
    }
 

}
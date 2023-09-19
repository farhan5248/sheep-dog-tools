package mbt.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCucumberLexer extends Lexer {
    public static final int RULE_WORD=7;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_ASCII_SYMBOLS=21;
    public static final int EOF=-1;
    public static final int RULE_LATIN_ALPHABET=18;
    public static final int RULE_EOL=4;
    public static final int RULE_WS=15;
    public static final int RULE_DIGIT=17;
    public static final int RULE_TAGNAME=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_ASCII_DIGIT=16;
    public static final int RULE_LETTER=19;
    public static final int T__26=26;
    public static final int RULE_PLACEHOLDER=10;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int RULE_ASCII_SPACE=20;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int RULE_STEP_KEYWORD=5;
    public static final int T__25=25;
    public static final int RULE_NL=13;
    public static final int RULE_TABLE_CELL=6;

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

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:11:7: ( 'Feature:' )
            // InternalCucumber.g:11:9: 'Feature:'
            {
            match("Feature:"); 


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
            // InternalCucumber.g:12:7: ( 'Background:' )
            // InternalCucumber.g:12:9: 'Background:'
            {
            match("Background:"); 


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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:14:7: ( 'Scenario' )
            // InternalCucumber.g:14:9: 'Scenario'
            {
            match("Scenario"); 


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
            // InternalCucumber.g:15:7: ( 'Outline:' )
            // InternalCucumber.g:15:9: 'Outline:'
            {
            match("Outline:"); 


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
            // InternalCucumber.g:16:7: ( 'Examples:' )
            // InternalCucumber.g:16:9: 'Examples:'
            {
            match("Examples:"); 


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
            // InternalCucumber.g:17:7: ( '|' )
            // InternalCucumber.g:17:9: '|'
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

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:18:7: ( '\"\"\"' )
            // InternalCucumber.g:18:9: '\"\"\"'
            {
            match("\"\"\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:1499:10: ( ( '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // InternalCucumber.g:1499:12: ( '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            // InternalCucumber.g:1499:12: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCucumber.g:1499:12: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // InternalCucumber.g:1499:17: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCucumber.g:1499:18: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            // InternalCucumber.g:1499:29: ( '.' ( '0' .. '9' )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCucumber.g:1499:30: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // InternalCucumber.g:1499:34: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalCucumber.g:1499:35: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STEP_KEYWORD"
    public final void mRULE_STEP_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_STEP_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:1501:19: ( ( 'Given' | 'When' | 'Then' | 'And' | 'But' | '*' ) ( ' ' | '\\t' )+ )
            // InternalCucumber.g:1501:21: ( 'Given' | 'When' | 'Then' | 'And' | 'But' | '*' ) ( ' ' | '\\t' )+
            {
            // InternalCucumber.g:1501:21: ( 'Given' | 'When' | 'Then' | 'And' | 'But' | '*' )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 'G':
                {
                alt5=1;
                }
                break;
            case 'W':
                {
                alt5=2;
                }
                break;
            case 'T':
                {
                alt5=3;
                }
                break;
            case 'A':
                {
                alt5=4;
                }
                break;
            case 'B':
                {
                alt5=5;
                }
                break;
            case '*':
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalCucumber.g:1501:22: 'Given'
                    {
                    match("Given"); 


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:1501:30: 'When'
                    {
                    match("When"); 


                    }
                    break;
                case 3 :
                    // InternalCucumber.g:1501:37: 'Then'
                    {
                    match("Then"); 


                    }
                    break;
                case 4 :
                    // InternalCucumber.g:1501:44: 'And'
                    {
                    match("And"); 


                    }
                    break;
                case 5 :
                    // InternalCucumber.g:1501:50: 'But'
                    {
                    match("But"); 


                    }
                    break;
                case 6 :
                    // InternalCucumber.g:1501:56: '*'
                    {
                    match('*'); 

                    }
                    break;

            }

            // InternalCucumber.g:1501:61: ( ' ' | '\\t' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\t'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STEP_KEYWORD"

    // $ANTLR start "RULE_PLACEHOLDER"
    public final void mRULE_PLACEHOLDER() throws RecognitionException {
        try {
            int _type = RULE_PLACEHOLDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:1503:18: ( '<' (~ ( ( '>' | ' ' | '\\t' | '\\n' | '\\r' ) ) )+ '>' )
            // InternalCucumber.g:1503:20: '<' (~ ( ( '>' | ' ' | '\\t' | '\\n' | '\\r' ) ) )+ '>'
            {
            match('<'); 
            // InternalCucumber.g:1503:24: (~ ( ( '>' | ' ' | '\\t' | '\\n' | '\\r' ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\b')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\u001F')||(LA7_0>='!' && LA7_0<='=')||(LA7_0>='?' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCucumber.g:1503:24: ~ ( ( '>' | ' ' | '\\t' | '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='=')||(input.LA(1)>='?' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLACEHOLDER"

    // $ANTLR start "RULE_TABLE_CELL"
    public final void mRULE_TABLE_CELL() throws RecognitionException {
        try {
            int _type = RULE_TABLE_CELL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:1505:17: ( '|' (~ ( ( '|' | '\\n' | '\\r' ) ) )* )
            // InternalCucumber.g:1505:19: '|' (~ ( ( '|' | '\\n' | '\\r' ) ) )*
            {
            match('|'); 
            // InternalCucumber.g:1505:23: (~ ( ( '|' | '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='{')||(LA8_0>='}' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCucumber.g:1505:23: ~ ( ( '|' | '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='{')||(input.LA(1)>='}' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TABLE_CELL"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:1507:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )* '\\'' ) )
            // InternalCucumber.g:1507:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )* '\\'' )
            {
            // InternalCucumber.g:1507:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalCucumber.g:1507:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalCucumber.g:1507:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalCucumber.g:1507:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCucumber.g:1507:66: ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalCucumber.g:1507:96: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalCucumber.g:1507:101: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalCucumber.g:1507:102: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCucumber.g:1507:147: ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:1509:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* RULE_NL )
            // InternalCucumber.g:1509:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* RULE_NL
            {
            match('#'); 
            // InternalCucumber.g:1509:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCucumber.g:1509:23: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop12;
                }
            } while (true);

            mRULE_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_TAGNAME"
    public final void mRULE_TAGNAME() throws RecognitionException {
        try {
            int _type = RULE_TAGNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:1511:14: ( '@' (~ ( ( ' ' | '\\t' | '\\n' | '\\r' ) ) )+ )
            // InternalCucumber.g:1511:16: '@' (~ ( ( ' ' | '\\t' | '\\n' | '\\r' ) ) )+
            {
            match('@'); 
            // InternalCucumber.g:1511:20: (~ ( ( ' ' | '\\t' | '\\n' | '\\r' ) ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='!' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCucumber.g:1511:20: ~ ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TAGNAME"

    // $ANTLR start "RULE_WORD"
    public final void mRULE_WORD() throws RecognitionException {
        try {
            int _type = RULE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:1513:11: (~ ( ( '@' | '|' | ' ' | '\\t' | '\\n' | '\\r' ) ) (~ ( ( ' ' | '\\t' | '\\n' | '\\r' ) ) )* )
            // InternalCucumber.g:1513:13: ~ ( ( '@' | '|' | ' ' | '\\t' | '\\n' | '\\r' ) ) (~ ( ( ' ' | '\\t' | '\\n' | '\\r' ) ) )*
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='{')||(input.LA(1)>='}' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalCucumber.g:1513:45: (~ ( ( ' ' | '\\t' | '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||(LA14_0>='!' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCucumber.g:1513:45: ~ ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
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
            // InternalCucumber.g:1515:9: ( ( ' ' | '\\t' ) )
            // InternalCucumber.g:1515:11: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
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
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_EOL"
    public final void mRULE_EOL() throws RecognitionException {
        try {
            int _type = RULE_EOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:1517:10: ( RULE_NL )
            // InternalCucumber.g:1517:12: RULE_NL
            {
            mRULE_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EOL"

    // $ANTLR start "RULE_NL"
    public final void mRULE_NL() throws RecognitionException {
        try {
            // InternalCucumber.g:1519:18: ( ( '\\r' )? ( '\\n' )? )
            // InternalCucumber.g:1519:20: ( '\\r' )? ( '\\n' )?
            {
            // InternalCucumber.g:1519:20: ( '\\r' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCucumber.g:1519:20: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            // InternalCucumber.g:1519:26: ( '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCucumber.g:1519:26: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NL"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:1521:16: ( . )
            // InternalCucumber.g:1521:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalCucumber.g:1523:21: ( RULE_ASCII_DIGIT )
            // InternalCucumber.g:1523:23: RULE_ASCII_DIGIT
            {
            mRULE_ASCII_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            // InternalCucumber.g:1525:22: ( RULE_LATIN_ALPHABET )
            // InternalCucumber.g:1525:24: RULE_LATIN_ALPHABET
            {
            mRULE_LATIN_ALPHABET(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_ASCII_SPACE"
    public final void mRULE_ASCII_SPACE() throws RecognitionException {
        try {
            // InternalCucumber.g:1527:27: ( ' ' )
            // InternalCucumber.g:1527:29: ' '
            {
            match(' '); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ASCII_SPACE"

    // $ANTLR start "RULE_ASCII_DIGIT"
    public final void mRULE_ASCII_DIGIT() throws RecognitionException {
        try {
            // InternalCucumber.g:1529:27: ( '0' .. '9' )
            // InternalCucumber.g:1529:29: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ASCII_DIGIT"

    // $ANTLR start "RULE_ASCII_SYMBOLS"
    public final void mRULE_ASCII_SYMBOLS() throws RecognitionException {
        try {
            // InternalCucumber.g:1531:29: ( ( '!' .. '/' | ':' .. '@' | '[' .. '`' | '{' .. '~' ) )
            // InternalCucumber.g:1531:31: ( '!' .. '/' | ':' .. '@' | '[' .. '`' | '{' .. '~' )
            {
            if ( (input.LA(1)>='!' && input.LA(1)<='/')||(input.LA(1)>=':' && input.LA(1)<='@')||(input.LA(1)>='[' && input.LA(1)<='`')||(input.LA(1)>='{' && input.LA(1)<='~') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ASCII_SYMBOLS"

    // $ANTLR start "RULE_LATIN_ALPHABET"
    public final void mRULE_LATIN_ALPHABET() throws RecognitionException {
        try {
            // InternalCucumber.g:1533:30: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
            // InternalCucumber.g:1533:32: ( 'A' .. 'Z' | 'a' .. 'z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LATIN_ALPHABET"

    public void mTokens() throws RecognitionException {
        // InternalCucumber.g:1:8: ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | RULE_INT | RULE_STEP_KEYWORD | RULE_PLACEHOLDER | RULE_TABLE_CELL | RULE_STRING | RULE_SL_COMMENT | RULE_TAGNAME | RULE_WORD | RULE_WS | RULE_EOL | RULE_ANY_OTHER )
        int alt17=19;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalCucumber.g:1:10: T__22
                {
                mT__22(); 

                }
                break;
            case 2 :
                // InternalCucumber.g:1:16: T__23
                {
                mT__23(); 

                }
                break;
            case 3 :
                // InternalCucumber.g:1:22: T__24
                {
                mT__24(); 

                }
                break;
            case 4 :
                // InternalCucumber.g:1:28: T__25
                {
                mT__25(); 

                }
                break;
            case 5 :
                // InternalCucumber.g:1:34: T__26
                {
                mT__26(); 

                }
                break;
            case 6 :
                // InternalCucumber.g:1:40: T__27
                {
                mT__27(); 

                }
                break;
            case 7 :
                // InternalCucumber.g:1:46: T__28
                {
                mT__28(); 

                }
                break;
            case 8 :
                // InternalCucumber.g:1:52: T__29
                {
                mT__29(); 

                }
                break;
            case 9 :
                // InternalCucumber.g:1:58: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 10 :
                // InternalCucumber.g:1:67: RULE_STEP_KEYWORD
                {
                mRULE_STEP_KEYWORD(); 

                }
                break;
            case 11 :
                // InternalCucumber.g:1:85: RULE_PLACEHOLDER
                {
                mRULE_PLACEHOLDER(); 

                }
                break;
            case 12 :
                // InternalCucumber.g:1:102: RULE_TABLE_CELL
                {
                mRULE_TABLE_CELL(); 

                }
                break;
            case 13 :
                // InternalCucumber.g:1:118: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 14 :
                // InternalCucumber.g:1:130: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 15 :
                // InternalCucumber.g:1:146: RULE_TAGNAME
                {
                mRULE_TAGNAME(); 

                }
                break;
            case 16 :
                // InternalCucumber.g:1:159: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;
            case 17 :
                // InternalCucumber.g:1:169: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 18 :
                // InternalCucumber.g:1:177: RULE_EOL
                {
                mRULE_EOL(); 

                }
                break;
            case 19 :
                // InternalCucumber.g:1:186: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\27\5\31\1\40\2\31\1\47\7\31\1\62\1\64\5\uffff\1\31\1\uffff\5\31\2\uffff\1\44\2\31\1\uffff\1\47\1\31\1\uffff\4\31\1\uffff\3\31\1\44\1\62\4\uffff\6\31\1\113\1\31\1\44\1\47\4\31\1\117\6\31\1\uffff\3\31\1\uffff\20\31\1\145\1\31\1\150\1\151\1\31\1\uffff\1\31\1\154\2\uffff\1\155\1\31\2\uffff\1\157\1\uffff";
    static final String DFA17_eofS =
        "\160\uffff";
    static final String DFA17_minS =
        "\1\0\1\145\1\141\1\143\1\165\1\170\2\0\1\60\1\0\1\151\2\150\1\156\1\11\4\0\5\uffff\1\141\1\uffff\1\143\1\164\1\145\1\164\1\141\2\uffff\1\0\1\42\1\0\1\uffff\1\0\1\60\1\uffff\1\166\2\145\1\144\1\uffff\1\0\1\42\3\0\4\uffff\1\164\1\153\1\11\1\156\1\154\1\155\4\0\1\145\2\156\1\11\2\0\1\165\1\147\1\141\1\151\1\160\1\uffff\1\156\2\11\1\uffff\3\162\1\156\1\154\1\11\1\145\1\157\1\151\2\145\1\72\1\165\1\157\1\72\1\163\1\0\1\156\2\0\1\72\1\uffff\1\144\1\0\2\uffff\1\0\1\72\2\uffff\1\0\1\uffff";
    static final String DFA17_maxS =
        "\1\uffff\1\145\1\165\1\143\1\165\1\170\2\uffff\1\71\1\uffff\1\151\2\150\1\156\1\40\4\uffff\5\uffff\1\141\1\uffff\1\143\1\164\1\145\1\164\1\141\2\uffff\1\uffff\1\165\1\uffff\1\uffff\1\uffff\1\71\1\uffff\1\166\2\145\1\144\1\uffff\1\uffff\1\165\3\uffff\4\uffff\1\164\1\153\1\40\1\156\1\154\1\155\4\uffff\1\145\2\156\1\40\2\uffff\1\165\1\147\1\141\1\151\1\160\1\uffff\1\156\2\40\1\uffff\3\162\1\156\1\154\1\40\1\145\1\157\1\151\2\145\1\72\1\165\1\157\1\72\1\163\1\uffff\1\156\2\uffff\1\72\1\uffff\1\144\1\uffff\2\uffff\1\uffff\1\72\2\uffff\1\uffff\1\uffff";
    static final String DFA17_acceptS =
        "\23\uffff\1\20\1\21\3\22\1\uffff\1\20\5\uffff\1\14\1\7\3\uffff\1\15\2\uffff\1\11\4\uffff\1\12\5\uffff\1\16\1\17\1\23\1\21\25\uffff\1\10\3\uffff\1\13\25\uffff\1\1\2\uffff\1\4\1\5\2\uffff\1\3\1\6\1\uffff\1\2";
    static final String DFA17_specialS =
        "\1\13\5\uffff\1\3\1\21\1\uffff\1\17\5\uffff\1\1\1\25\1\23\1\10\16\uffff\1\7\1\uffff\1\31\1\uffff\1\6\7\uffff\1\15\1\uffff\1\12\1\27\1\4\12\uffff\1\2\1\30\1\24\1\16\4\uffff\1\14\1\11\32\uffff\1\20\1\uffff\1\5\1\32\3\uffff\1\26\2\uffff\1\0\3\uffff\1\22\1\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\23\1\24\1\26\2\23\1\25\22\23\1\24\1\23\1\7\1\21\3\23\1\20\2\23\1\16\2\23\1\10\2\23\12\11\2\23\1\17\3\23\1\22\1\15\1\2\2\23\1\5\1\1\1\12\7\23\1\4\3\23\1\3\1\14\2\23\1\13\44\23\1\6\uff83\23",
            "\1\30",
            "\1\32\23\uffff\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\12\37\1\uffff\2\37\1\uffff\156\37\1\uffff\uff83\37",
            "\11\43\1\44\1\uffff\2\43\1\uffff\22\43\1\44\1\43\1\41\71\43\1\42\uffa3\43",
            "\12\45",
            "\11\31\2\uffff\2\31\1\uffff\22\31\1\uffff\15\31\1\46\1\31\12\45\uffc6\31",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54\26\uffff\1\54",
            "\11\55\2\uffff\2\55\1\uffff\22\55\1\uffff\35\55\1\uffff\uffc1\55",
            "\11\57\1\44\1\uffff\2\57\1\uffff\22\57\1\44\6\57\1\60\64\57\1\56\uffa3\57",
            "\11\61\2\uffff\2\61\1\uffff\22\61\1\uffff\uffdf\61",
            "\11\63\2\uffff\2\63\1\uffff\22\63\1\uffff\uffdf\63",
            "",
            "",
            "",
            "",
            "",
            "\1\66",
            "",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "",
            "",
            "\11\31\2\uffff\2\31\1\uffff\22\31\1\uffff\1\31\1\74\uffdd\31",
            "\1\75\4\uffff\1\75\64\uffff\1\75\5\uffff\1\75\3\uffff\1\75\7\uffff\1\75\3\uffff\1\75\1\uffff\2\75",
            "\11\43\1\44\1\uffff\2\43\1\uffff\22\43\1\44\1\43\1\76\71\43\1\42\uffa3\43",
            "",
            "\11\31\2\uffff\2\31\1\uffff\22\31\1\uffff\15\31\1\46\1\31\12\45\uffc6\31",
            "\12\77",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "",
            "\11\55\2\uffff\2\55\1\uffff\22\55\1\uffff\35\55\1\104\uffc1\55",
            "\1\105\4\uffff\1\105\64\uffff\1\105\5\uffff\1\105\3\uffff\1\105\7\uffff\1\105\3\uffff\1\105\1\uffff\2\105",
            "\11\57\1\44\1\uffff\2\57\1\uffff\22\57\1\44\6\57\1\60\64\57\1\56\uffa3\57",
            "\11\31\2\uffff\2\31\1\uffff\22\31\1\uffff\uffdf\31",
            "\11\61\2\uffff\2\61\1\uffff\22\61\1\uffff\uffdf\61",
            "",
            "",
            "",
            "",
            "\1\106",
            "\1\107",
            "\1\54\26\uffff\1\54",
            "\1\110",
            "\1\111",
            "\1\112",
            "\11\31\2\uffff\2\31\1\uffff\22\31\1\uffff\uffdf\31",
            "\11\43\1\44\1\uffff\2\43\1\uffff\22\43\1\44\1\43\1\76\71\43\1\42\uffa3\43",
            "\11\31\2\uffff\2\31\1\uffff\22\31\1\uffff\uffdf\31",
            "\11\31\2\uffff\2\31\1\uffff\22\31\1\uffff\17\31\12\77\uffc6\31",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\54\26\uffff\1\54",
            "\11\31\2\uffff\2\31\1\uffff\22\31\1\uffff\uffdf\31",
            "\11\57\1\44\1\uffff\2\57\1\uffff\22\57\1\44\6\57\1\60\64\57\1\56\uffa3\57",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "",
            "\1\125",
            "\1\54\26\uffff\1\54",
            "\1\54\26\uffff\1\54",
            "",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\54\26\uffff\1\54",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\11\31\2\uffff\2\31\1\uffff\22\31\1\uffff\uffdf\31",
            "\1\146",
            "\11\31\2\uffff\2\31\1\uffff\22\31\1\uffff\31\31\1\147\uffc5\31",
            "\11\31\2\uffff\2\31\1\uffff\22\31\1\uffff\uffdf\31",
            "\1\152",
            "",
            "\1\153",
            "\11\31\2\uffff\2\31\1\uffff\22\31\1\uffff\uffdf\31",
            "",
            "",
            "\11\31\2\uffff\2\31\1\uffff\22\31\1\uffff\uffdf\31",
            "\1\156",
            "",
            "",
            "\11\31\2\uffff\2\31\1\uffff\22\31\1\uffff\uffdf\31",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | RULE_INT | RULE_STEP_KEYWORD | RULE_PLACEHOLDER | RULE_TABLE_CELL | RULE_STRING | RULE_SL_COMMENT | RULE_TAGNAME | RULE_WORD | RULE_WS | RULE_EOL | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_106 = input.LA(1);

                        s = -1;
                        if ( ((LA17_106>='\u0000' && LA17_106<='\b')||(LA17_106>='\u000B' && LA17_106<='\f')||(LA17_106>='\u000E' && LA17_106<='\u001F')||(LA17_106>='!' && LA17_106<='\uFFFF')) ) {s = 25;}

                        else s = 109;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_15 = input.LA(1);

                        s = -1;
                        if ( ((LA17_15>='\u0000' && LA17_15<='\b')||(LA17_15>='\u000B' && LA17_15<='\f')||(LA17_15>='\u000E' && LA17_15<='\u001F')||(LA17_15>='!' && LA17_15<='=')||(LA17_15>='?' && LA17_15<='\uFFFF')) ) {s = 45;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_60 = input.LA(1);

                        s = -1;
                        if ( ((LA17_60>='\u0000' && LA17_60<='\b')||(LA17_60>='\u000B' && LA17_60<='\f')||(LA17_60>='\u000E' && LA17_60<='\u001F')||(LA17_60>='!' && LA17_60<='\uFFFF')) ) {s = 25;}

                        else s = 75;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_6 = input.LA(1);

                        s = -1;
                        if ( ((LA17_6>='\u0000' && LA17_6<='\t')||(LA17_6>='\u000B' && LA17_6<='\f')||(LA17_6>='\u000E' && LA17_6<='{')||(LA17_6>='}' && LA17_6<='\uFFFF')) ) {s = 31;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_49 = input.LA(1);

                        s = -1;
                        if ( ((LA17_49>='\u0000' && LA17_49<='\b')||(LA17_49>='\u000B' && LA17_49<='\f')||(LA17_49>='\u000E' && LA17_49<='\u001F')||(LA17_49>='!' && LA17_49<='\uFFFF')) ) {s = 49;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_98 = input.LA(1);

                        s = -1;
                        if ( (LA17_98==':') ) {s = 103;}

                        else if ( ((LA17_98>='\u0000' && LA17_98<='\b')||(LA17_98>='\u000B' && LA17_98<='\f')||(LA17_98>='\u000E' && LA17_98<='\u001F')||(LA17_98>='!' && LA17_98<='9')||(LA17_98>=';' && LA17_98<='\uFFFF')) ) {s = 25;}

                        else s = 104;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_37 = input.LA(1);

                        s = -1;
                        if ( (LA17_37=='.') ) {s = 38;}

                        else if ( ((LA17_37>='0' && LA17_37<='9')) ) {s = 37;}

                        else if ( ((LA17_37>='\u0000' && LA17_37<='\b')||(LA17_37>='\u000B' && LA17_37<='\f')||(LA17_37>='\u000E' && LA17_37<='\u001F')||(LA17_37>='!' && LA17_37<='-')||LA17_37=='/'||(LA17_37>=':' && LA17_37<='\uFFFF')) ) {s = 25;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA17_33 = input.LA(1);

                        s = -1;
                        if ( (LA17_33=='\"') ) {s = 60;}

                        else if ( ((LA17_33>='\u0000' && LA17_33<='\b')||(LA17_33>='\u000B' && LA17_33<='\f')||(LA17_33>='\u000E' && LA17_33<='\u001F')||LA17_33=='!'||(LA17_33>='#' && LA17_33<='\uFFFF')) ) {s = 25;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA17_18 = input.LA(1);

                        s = -1;
                        if ( ((LA17_18>='\u0000' && LA17_18<='\b')||(LA17_18>='\u000B' && LA17_18<='\f')||(LA17_18>='\u000E' && LA17_18<='\u001F')||(LA17_18>='!' && LA17_18<='\uFFFF')) ) {s = 51;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA17_69 = input.LA(1);

                        s = -1;
                        if ( (LA17_69=='\'') ) {s = 48;}

                        else if ( (LA17_69=='\\') ) {s = 46;}

                        else if ( ((LA17_69>='\u0000' && LA17_69<='\b')||(LA17_69>='\u000B' && LA17_69<='\f')||(LA17_69>='\u000E' && LA17_69<='\u001F')||(LA17_69>='!' && LA17_69<='&')||(LA17_69>='(' && LA17_69<='[')||(LA17_69>=']' && LA17_69<='\uFFFF')) ) {s = 47;}

                        else if ( (LA17_69=='\t'||LA17_69==' ') ) {s = 36;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA17_47 = input.LA(1);

                        s = -1;
                        if ( (LA17_47=='\'') ) {s = 48;}

                        else if ( (LA17_47=='\\') ) {s = 46;}

                        else if ( ((LA17_47>='\u0000' && LA17_47<='\b')||(LA17_47>='\u000B' && LA17_47<='\f')||(LA17_47>='\u000E' && LA17_47<='\u001F')||(LA17_47>='!' && LA17_47<='&')||(LA17_47>='(' && LA17_47<='[')||(LA17_47>=']' && LA17_47<='\uFFFF')) ) {s = 47;}

                        else if ( (LA17_47=='\t'||LA17_47==' ') ) {s = 36;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='F') ) {s = 1;}

                        else if ( (LA17_0=='B') ) {s = 2;}

                        else if ( (LA17_0=='S') ) {s = 3;}

                        else if ( (LA17_0=='O') ) {s = 4;}

                        else if ( (LA17_0=='E') ) {s = 5;}

                        else if ( (LA17_0=='|') ) {s = 6;}

                        else if ( (LA17_0=='\"') ) {s = 7;}

                        else if ( (LA17_0=='-') ) {s = 8;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 9;}

                        else if ( (LA17_0=='G') ) {s = 10;}

                        else if ( (LA17_0=='W') ) {s = 11;}

                        else if ( (LA17_0=='T') ) {s = 12;}

                        else if ( (LA17_0=='A') ) {s = 13;}

                        else if ( (LA17_0=='*') ) {s = 14;}

                        else if ( (LA17_0=='<') ) {s = 15;}

                        else if ( (LA17_0=='\'') ) {s = 16;}

                        else if ( (LA17_0=='#') ) {s = 17;}

                        else if ( (LA17_0=='@') ) {s = 18;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='$' && LA17_0<='&')||(LA17_0>='(' && LA17_0<=')')||(LA17_0>='+' && LA17_0<=',')||(LA17_0>='.' && LA17_0<='/')||(LA17_0>=':' && LA17_0<=';')||(LA17_0>='=' && LA17_0<='?')||(LA17_0>='C' && LA17_0<='D')||(LA17_0>='H' && LA17_0<='N')||(LA17_0>='P' && LA17_0<='R')||(LA17_0>='U' && LA17_0<='V')||(LA17_0>='X' && LA17_0<='{')||(LA17_0>='}' && LA17_0<='\uFFFF')) ) {s = 19;}

                        else if ( (LA17_0=='\t'||LA17_0==' ') ) {s = 20;}

                        else if ( (LA17_0=='\r') ) {s = 21;}

                        else if ( (LA17_0=='\n') ) {s = 22;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA17_68 = input.LA(1);

                        s = -1;
                        if ( ((LA17_68>='\u0000' && LA17_68<='\b')||(LA17_68>='\u000B' && LA17_68<='\f')||(LA17_68>='\u000E' && LA17_68<='\u001F')||(LA17_68>='!' && LA17_68<='\uFFFF')) ) {s = 25;}

                        else s = 79;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA17_45 = input.LA(1);

                        s = -1;
                        if ( (LA17_45=='>') ) {s = 68;}

                        else if ( ((LA17_45>='\u0000' && LA17_45<='\b')||(LA17_45>='\u000B' && LA17_45<='\f')||(LA17_45>='\u000E' && LA17_45<='\u001F')||(LA17_45>='!' && LA17_45<='=')||(LA17_45>='?' && LA17_45<='\uFFFF')) ) {s = 45;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA17_63 = input.LA(1);

                        s = -1;
                        if ( ((LA17_63>='0' && LA17_63<='9')) ) {s = 63;}

                        else if ( ((LA17_63>='\u0000' && LA17_63<='\b')||(LA17_63>='\u000B' && LA17_63<='\f')||(LA17_63>='\u000E' && LA17_63<='\u001F')||(LA17_63>='!' && LA17_63<='/')||(LA17_63>=':' && LA17_63<='\uFFFF')) ) {s = 25;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA17_9 = input.LA(1);

                        s = -1;
                        if ( (LA17_9=='.') ) {s = 38;}

                        else if ( ((LA17_9>='0' && LA17_9<='9')) ) {s = 37;}

                        else if ( ((LA17_9>='\u0000' && LA17_9<='\b')||(LA17_9>='\u000B' && LA17_9<='\f')||(LA17_9>='\u000E' && LA17_9<='\u001F')||(LA17_9>='!' && LA17_9<='-')||LA17_9=='/'||(LA17_9>=':' && LA17_9<='\uFFFF')) ) {s = 25;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA17_96 = input.LA(1);

                        s = -1;
                        if ( ((LA17_96>='\u0000' && LA17_96<='\b')||(LA17_96>='\u000B' && LA17_96<='\f')||(LA17_96>='\u000E' && LA17_96<='\u001F')||(LA17_96>='!' && LA17_96<='\uFFFF')) ) {s = 25;}

                        else s = 101;

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA17_7 = input.LA(1);

                        s = -1;
                        if ( (LA17_7=='\"') ) {s = 33;}

                        else if ( (LA17_7=='\\') ) {s = 34;}

                        else if ( ((LA17_7>='\u0000' && LA17_7<='\b')||(LA17_7>='\u000B' && LA17_7<='\f')||(LA17_7>='\u000E' && LA17_7<='\u001F')||LA17_7=='!'||(LA17_7>='#' && LA17_7<='[')||(LA17_7>=']' && LA17_7<='\uFFFF')) ) {s = 35;}

                        else if ( (LA17_7=='\t'||LA17_7==' ') ) {s = 36;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA17_110 = input.LA(1);

                        s = -1;
                        if ( ((LA17_110>='\u0000' && LA17_110<='\b')||(LA17_110>='\u000B' && LA17_110<='\f')||(LA17_110>='\u000E' && LA17_110<='\u001F')||(LA17_110>='!' && LA17_110<='\uFFFF')) ) {s = 25;}

                        else s = 111;

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA17_17 = input.LA(1);

                        s = -1;
                        if ( ((LA17_17>='\u0000' && LA17_17<='\b')||(LA17_17>='\u000B' && LA17_17<='\f')||(LA17_17>='\u000E' && LA17_17<='\u001F')||(LA17_17>='!' && LA17_17<='\uFFFF')) ) {s = 49;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA17_62 = input.LA(1);

                        s = -1;
                        if ( ((LA17_62>='\u0000' && LA17_62<='\b')||(LA17_62>='\u000B' && LA17_62<='\f')||(LA17_62>='\u000E' && LA17_62<='\u001F')||(LA17_62>='!' && LA17_62<='\uFFFF')) ) {s = 25;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA17_16 = input.LA(1);

                        s = -1;
                        if ( (LA17_16=='\\') ) {s = 46;}

                        else if ( ((LA17_16>='\u0000' && LA17_16<='\b')||(LA17_16>='\u000B' && LA17_16<='\f')||(LA17_16>='\u000E' && LA17_16<='\u001F')||(LA17_16>='!' && LA17_16<='&')||(LA17_16>='(' && LA17_16<='[')||(LA17_16>=']' && LA17_16<='\uFFFF')) ) {s = 47;}

                        else if ( (LA17_16=='\'') ) {s = 48;}

                        else if ( (LA17_16=='\t'||LA17_16==' ') ) {s = 36;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA17_103 = input.LA(1);

                        s = -1;
                        if ( ((LA17_103>='\u0000' && LA17_103<='\b')||(LA17_103>='\u000B' && LA17_103<='\f')||(LA17_103>='\u000E' && LA17_103<='\u001F')||(LA17_103>='!' && LA17_103<='\uFFFF')) ) {s = 25;}

                        else s = 108;

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA17_48 = input.LA(1);

                        s = -1;
                        if ( ((LA17_48>='\u0000' && LA17_48<='\b')||(LA17_48>='\u000B' && LA17_48<='\f')||(LA17_48>='\u000E' && LA17_48<='\u001F')||(LA17_48>='!' && LA17_48<='\uFFFF')) ) {s = 25;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA17_61 = input.LA(1);

                        s = -1;
                        if ( (LA17_61=='\"') ) {s = 62;}

                        else if ( (LA17_61=='\\') ) {s = 34;}

                        else if ( ((LA17_61>='\u0000' && LA17_61<='\b')||(LA17_61>='\u000B' && LA17_61<='\f')||(LA17_61>='\u000E' && LA17_61<='\u001F')||LA17_61=='!'||(LA17_61>='#' && LA17_61<='[')||(LA17_61>=']' && LA17_61<='\uFFFF')) ) {s = 35;}

                        else if ( (LA17_61=='\t'||LA17_61==' ') ) {s = 36;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA17_35 = input.LA(1);

                        s = -1;
                        if ( (LA17_35=='\"') ) {s = 62;}

                        else if ( (LA17_35=='\\') ) {s = 34;}

                        else if ( ((LA17_35>='\u0000' && LA17_35<='\b')||(LA17_35>='\u000B' && LA17_35<='\f')||(LA17_35>='\u000E' && LA17_35<='\u001F')||LA17_35=='!'||(LA17_35>='#' && LA17_35<='[')||(LA17_35>=']' && LA17_35<='\uFFFF')) ) {s = 35;}

                        else if ( (LA17_35=='\t'||LA17_35==' ') ) {s = 36;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA17_99 = input.LA(1);

                        s = -1;
                        if ( ((LA17_99>='\u0000' && LA17_99<='\b')||(LA17_99>='\u000B' && LA17_99<='\f')||(LA17_99>='\u000E' && LA17_99<='\u001F')||(LA17_99>='!' && LA17_99<='\uFFFF')) ) {s = 25;}

                        else s = 105;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
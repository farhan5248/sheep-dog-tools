package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_EOL", "RULE_WS", "RULE_SL_COMMENT", "'Feature:'"
    };
    public static final int T__8=8;
    public static final int RULE_ID=4;
    public static final int RULE_EOL=5;
    public static final int RULE_WS=6;
    public static final int RULE_SL_COMMENT=7;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Model__Group__0 )
            // InternalMyDsl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStatement"
    // InternalMyDsl.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleStatement EOF )
            // InternalMyDsl.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMyDsl.g:87:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Statement__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Statement__Group__0 )
            // InternalMyDsl.g:94:4: rule__Statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRulePhrase"
    // InternalMyDsl.g:103:1: entryRulePhrase : rulePhrase EOF ;
    public final void entryRulePhrase() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( rulePhrase EOF )
            // InternalMyDsl.g:105:1: rulePhrase EOF
            {
             before(grammarAccess.getPhraseRule()); 
            pushFollow(FOLLOW_1);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getPhraseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePhrase"


    // $ANTLR start "rulePhrase"
    // InternalMyDsl.g:112:1: rulePhrase : ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) ) ;
    public final void rulePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) ) )
            // InternalMyDsl.g:117:2: ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) )
            {
            // InternalMyDsl.g:117:2: ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) )
            // InternalMyDsl.g:118:3: ( ( RULE_ID ) ) ( ( RULE_ID )* )
            {
            // InternalMyDsl.g:118:3: ( ( RULE_ID ) )
            // InternalMyDsl.g:119:4: ( RULE_ID )
            {
             before(grammarAccess.getPhraseAccess().getIDTerminalRuleCall()); 
            // InternalMyDsl.g:120:4: ( RULE_ID )
            // InternalMyDsl.g:120:5: RULE_ID
            {
            match(input,RULE_ID,FOLLOW_3); 

            }

             after(grammarAccess.getPhraseAccess().getIDTerminalRuleCall()); 

            }

            // InternalMyDsl.g:123:3: ( ( RULE_ID )* )
            // InternalMyDsl.g:124:4: ( RULE_ID )*
            {
             before(grammarAccess.getPhraseAccess().getIDTerminalRuleCall()); 
            // InternalMyDsl.g:125:4: ( RULE_ID )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:125:5: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_3); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getPhraseAccess().getIDTerminalRuleCall()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePhrase"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMyDsl.g:134:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:138:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMyDsl.g:139:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalMyDsl.g:146:1: rule__Model__Group__0__Impl : ( 'Feature:' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:150:1: ( ( 'Feature:' ) )
            // InternalMyDsl.g:151:1: ( 'Feature:' )
            {
            // InternalMyDsl.g:151:1: ( 'Feature:' )
            // InternalMyDsl.g:152:2: 'Feature:'
            {
             before(grammarAccess.getModelAccess().getFeatureKeyword_0()); 
            match(input,8,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFeatureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalMyDsl.g:161:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:165:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalMyDsl.g:166:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalMyDsl.g:173:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:177:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalMyDsl.g:178:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:178:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalMyDsl.g:179:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:180:2: ( rule__Model__NameAssignment_1 )
            // InternalMyDsl.g:180:3: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalMyDsl.g:188:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:192:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalMyDsl.g:193:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalMyDsl.g:200:1: rule__Model__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:204:1: ( ( RULE_EOL ) )
            // InternalMyDsl.g:205:1: ( RULE_EOL )
            {
            // InternalMyDsl.g:205:1: ( RULE_EOL )
            // InternalMyDsl.g:206:2: RULE_EOL
            {
             before(grammarAccess.getModelAccess().getEOLTerminalRuleCall_2()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getEOLTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalMyDsl.g:215:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:219:1: ( rule__Model__Group__3__Impl )
            // InternalMyDsl.g:220:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalMyDsl.g:226:1: rule__Model__Group__3__Impl : ( ( rule__Model__StatementsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:230:1: ( ( ( rule__Model__StatementsAssignment_3 )* ) )
            // InternalMyDsl.g:231:1: ( ( rule__Model__StatementsAssignment_3 )* )
            {
            // InternalMyDsl.g:231:1: ( ( rule__Model__StatementsAssignment_3 )* )
            // InternalMyDsl.g:232:2: ( rule__Model__StatementsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getStatementsAssignment_3()); 
            // InternalMyDsl.g:233:2: ( rule__Model__StatementsAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:233:3: rule__Model__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getStatementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Statement__Group__0"
    // InternalMyDsl.g:242:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:246:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalMyDsl.g:247:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0"


    // $ANTLR start "rule__Statement__Group__0__Impl"
    // InternalMyDsl.g:254:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__NameAssignment_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:258:1: ( ( ( rule__Statement__NameAssignment_0 ) ) )
            // InternalMyDsl.g:259:1: ( ( rule__Statement__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:259:1: ( ( rule__Statement__NameAssignment_0 ) )
            // InternalMyDsl.g:260:2: ( rule__Statement__NameAssignment_0 )
            {
             before(grammarAccess.getStatementAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:261:2: ( rule__Statement__NameAssignment_0 )
            // InternalMyDsl.g:261:3: rule__Statement__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0__Impl"


    // $ANTLR start "rule__Statement__Group__1"
    // InternalMyDsl.g:269:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:273:1: ( rule__Statement__Group__1__Impl )
            // InternalMyDsl.g:274:2: rule__Statement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1"


    // $ANTLR start "rule__Statement__Group__1__Impl"
    // InternalMyDsl.g:280:1: rule__Statement__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:284:1: ( ( RULE_EOL ) )
            // InternalMyDsl.g:285:1: ( RULE_EOL )
            {
            // InternalMyDsl.g:285:1: ( RULE_EOL )
            // InternalMyDsl.g:286:2: RULE_EOL
            {
             before(grammarAccess.getStatementAccess().getEOLTerminalRuleCall_1()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getEOLTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalMyDsl.g:296:1: rule__Model__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:300:1: ( ( rulePhrase ) )
            // InternalMyDsl.g:301:2: ( rulePhrase )
            {
            // InternalMyDsl.g:301:2: ( rulePhrase )
            // InternalMyDsl.g:302:3: rulePhrase
            {
             before(grammarAccess.getModelAccess().getNamePhraseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNamePhraseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__StatementsAssignment_3"
    // InternalMyDsl.g:311:1: rule__Model__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:315:1: ( ( ruleStatement ) )
            // InternalMyDsl.g:316:2: ( ruleStatement )
            {
            // InternalMyDsl.g:316:2: ( ruleStatement )
            // InternalMyDsl.g:317:3: ruleStatement
            {
             before(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StatementsAssignment_3"


    // $ANTLR start "rule__Statement__NameAssignment_0"
    // InternalMyDsl.g:326:1: rule__Statement__NameAssignment_0 : ( rulePhrase ) ;
    public final void rule__Statement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:330:1: ( ( rulePhrase ) )
            // InternalMyDsl.g:331:2: ( rulePhrase )
            {
            // InternalMyDsl.g:331:2: ( rulePhrase )
            // InternalMyDsl.g:332:3: rulePhrase
            {
             before(grammarAccess.getStatementAccess().getNamePhraseParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getNamePhraseParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__NameAssignment_0"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});

}
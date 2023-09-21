package org.farhan.ide.contentassist.antlr.internal;

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
import org.farhan.services.CucumberGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCucumberParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_ID", "RULE_WS", "RULE_WORD", "'Given'", "'When'", "'Then'", "'And'", "'But'", "'*'", "'Feature:'", "'Scenario:'", "'@'"
    };
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


        public InternalCucumberParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCucumberParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCucumberParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCucumber.g"; }


    	private CucumberGrammarAccess grammarAccess;

    	public void setGrammarAccess(CucumberGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleFeature"
    // InternalCucumber.g:53:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalCucumber.g:54:1: ( ruleFeature EOF )
            // InternalCucumber.g:55:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalCucumber.g:62:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:66:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalCucumber.g:67:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalCucumber.g:67:2: ( ( rule__Feature__Group__0 ) )
            // InternalCucumber.g:68:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalCucumber.g:69:3: ( rule__Feature__Group__0 )
            // InternalCucumber.g:69:4: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleScenario"
    // InternalCucumber.g:78:1: entryRuleScenario : ruleScenario EOF ;
    public final void entryRuleScenario() throws RecognitionException {
        try {
            // InternalCucumber.g:79:1: ( ruleScenario EOF )
            // InternalCucumber.g:80:1: ruleScenario EOF
            {
             before(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_1);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getScenarioRule()); 
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
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // InternalCucumber.g:87:1: ruleScenario : ( ( rule__Scenario__Group__0 ) ) ;
    public final void ruleScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:91:2: ( ( ( rule__Scenario__Group__0 ) ) )
            // InternalCucumber.g:92:2: ( ( rule__Scenario__Group__0 ) )
            {
            // InternalCucumber.g:92:2: ( ( rule__Scenario__Group__0 ) )
            // InternalCucumber.g:93:3: ( rule__Scenario__Group__0 )
            {
             before(grammarAccess.getScenarioAccess().getGroup()); 
            // InternalCucumber.g:94:3: ( rule__Scenario__Group__0 )
            // InternalCucumber.g:94:4: rule__Scenario__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getGroup()); 

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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleStep"
    // InternalCucumber.g:103:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalCucumber.g:104:1: ( ruleStep EOF )
            // InternalCucumber.g:105:1: ruleStep EOF
            {
             before(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getStepRule()); 
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
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalCucumber.g:112:1: ruleStep : ( ( rule__Step__Group__0 ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:116:2: ( ( ( rule__Step__Group__0 ) ) )
            // InternalCucumber.g:117:2: ( ( rule__Step__Group__0 ) )
            {
            // InternalCucumber.g:117:2: ( ( rule__Step__Group__0 ) )
            // InternalCucumber.g:118:3: ( rule__Step__Group__0 )
            {
             before(grammarAccess.getStepAccess().getGroup()); 
            // InternalCucumber.g:119:3: ( rule__Step__Group__0 )
            // InternalCucumber.g:119:4: rule__Step__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getGroup()); 

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
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleDescription"
    // InternalCucumber.g:128:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalCucumber.g:129:1: ( ruleDescription EOF )
            // InternalCucumber.g:130:1: ruleDescription EOF
            {
             before(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getDescriptionRule()); 
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
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalCucumber.g:137:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:141:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalCucumber.g:142:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalCucumber.g:142:2: ( ( rule__Description__Group__0 ) )
            // InternalCucumber.g:143:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalCucumber.g:144:3: ( rule__Description__Group__0 )
            // InternalCucumber.g:144:4: rule__Description__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getGroup()); 

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
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleTag"
    // InternalCucumber.g:153:1: entryRuleTag : ruleTag EOF ;
    public final void entryRuleTag() throws RecognitionException {
        try {
            // InternalCucumber.g:154:1: ( ruleTag EOF )
            // InternalCucumber.g:155:1: ruleTag EOF
            {
             before(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_1);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getTagRule()); 
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
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // InternalCucumber.g:162:1: ruleTag : ( ( rule__Tag__Group__0 ) ) ;
    public final void ruleTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:166:2: ( ( ( rule__Tag__Group__0 ) ) )
            // InternalCucumber.g:167:2: ( ( rule__Tag__Group__0 ) )
            {
            // InternalCucumber.g:167:2: ( ( rule__Tag__Group__0 ) )
            // InternalCucumber.g:168:3: ( rule__Tag__Group__0 )
            {
             before(grammarAccess.getTagAccess().getGroup()); 
            // InternalCucumber.g:169:3: ( rule__Tag__Group__0 )
            // InternalCucumber.g:169:4: rule__Tag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTagAccess().getGroup()); 

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
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleSentence"
    // InternalCucumber.g:178:1: entryRuleSentence : ruleSentence EOF ;
    public final void entryRuleSentence() throws RecognitionException {
        try {
            // InternalCucumber.g:179:1: ( ruleSentence EOF )
            // InternalCucumber.g:180:1: ruleSentence EOF
            {
             before(grammarAccess.getSentenceRule()); 
            pushFollow(FOLLOW_1);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getSentenceRule()); 
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
    // $ANTLR end "entryRuleSentence"


    // $ANTLR start "ruleSentence"
    // InternalCucumber.g:187:1: ruleSentence : ( ( rule__Sentence__Group__0 ) ) ;
    public final void ruleSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:191:2: ( ( ( rule__Sentence__Group__0 ) ) )
            // InternalCucumber.g:192:2: ( ( rule__Sentence__Group__0 ) )
            {
            // InternalCucumber.g:192:2: ( ( rule__Sentence__Group__0 ) )
            // InternalCucumber.g:193:3: ( rule__Sentence__Group__0 )
            {
             before(grammarAccess.getSentenceAccess().getGroup()); 
            // InternalCucumber.g:194:3: ( rule__Sentence__Group__0 )
            // InternalCucumber.g:194:4: rule__Sentence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sentence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getGroup()); 

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
    // $ANTLR end "ruleSentence"


    // $ANTLR start "rule__Step__KeywordAlternatives_0_0"
    // InternalCucumber.g:202:1: rule__Step__KeywordAlternatives_0_0 : ( ( 'Given' ) | ( 'When' ) | ( 'Then' ) | ( 'And' ) | ( 'But' ) | ( '*' ) );
    public final void rule__Step__KeywordAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:206:1: ( ( 'Given' ) | ( 'When' ) | ( 'Then' ) | ( 'And' ) | ( 'But' ) | ( '*' ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 8:
                {
                alt1=1;
                }
                break;
            case 9:
                {
                alt1=2;
                }
                break;
            case 10:
                {
                alt1=3;
                }
                break;
            case 11:
                {
                alt1=4;
                }
                break;
            case 12:
                {
                alt1=5;
                }
                break;
            case 13:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalCucumber.g:207:2: ( 'Given' )
                    {
                    // InternalCucumber.g:207:2: ( 'Given' )
                    // InternalCucumber.g:208:3: 'Given'
                    {
                     before(grammarAccess.getStepAccess().getKeywordGivenKeyword_0_0_0()); 
                    match(input,8,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getKeywordGivenKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:213:2: ( 'When' )
                    {
                    // InternalCucumber.g:213:2: ( 'When' )
                    // InternalCucumber.g:214:3: 'When'
                    {
                     before(grammarAccess.getStepAccess().getKeywordWhenKeyword_0_0_1()); 
                    match(input,9,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getKeywordWhenKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCucumber.g:219:2: ( 'Then' )
                    {
                    // InternalCucumber.g:219:2: ( 'Then' )
                    // InternalCucumber.g:220:3: 'Then'
                    {
                     before(grammarAccess.getStepAccess().getKeywordThenKeyword_0_0_2()); 
                    match(input,10,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getKeywordThenKeyword_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCucumber.g:225:2: ( 'And' )
                    {
                    // InternalCucumber.g:225:2: ( 'And' )
                    // InternalCucumber.g:226:3: 'And'
                    {
                     before(grammarAccess.getStepAccess().getKeywordAndKeyword_0_0_3()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getKeywordAndKeyword_0_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCucumber.g:231:2: ( 'But' )
                    {
                    // InternalCucumber.g:231:2: ( 'But' )
                    // InternalCucumber.g:232:3: 'But'
                    {
                     before(grammarAccess.getStepAccess().getKeywordButKeyword_0_0_4()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getKeywordButKeyword_0_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCucumber.g:237:2: ( '*' )
                    {
                    // InternalCucumber.g:237:2: ( '*' )
                    // InternalCucumber.g:238:3: '*'
                    {
                     before(grammarAccess.getStepAccess().getKeywordAsteriskKeyword_0_0_5()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getKeywordAsteriskKeyword_0_0_5()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Step__KeywordAlternatives_0_0"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalCucumber.g:247:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:251:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalCucumber.g:252:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__1();

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
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // InternalCucumber.g:259:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__TagsAssignment_0 )* ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:263:1: ( ( ( rule__Feature__TagsAssignment_0 )* ) )
            // InternalCucumber.g:264:1: ( ( rule__Feature__TagsAssignment_0 )* )
            {
            // InternalCucumber.g:264:1: ( ( rule__Feature__TagsAssignment_0 )* )
            // InternalCucumber.g:265:2: ( rule__Feature__TagsAssignment_0 )*
            {
             before(grammarAccess.getFeatureAccess().getTagsAssignment_0()); 
            // InternalCucumber.g:266:2: ( rule__Feature__TagsAssignment_0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCucumber.g:266:3: rule__Feature__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Feature__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getTagsAssignment_0()); 

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
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // InternalCucumber.g:274:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:278:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalCucumber.g:279:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__2();

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
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // InternalCucumber.g:286:1: rule__Feature__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:290:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:291:1: ( RULE_EOL )
            {
            // InternalCucumber.g:291:1: ( RULE_EOL )
            // InternalCucumber.g:292:2: RULE_EOL
            {
             before(grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_1()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // InternalCucumber.g:301:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:305:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalCucumber.g:306:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__3();

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
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // InternalCucumber.g:313:1: rule__Feature__Group__2__Impl : ( 'Feature:' ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:317:1: ( ( 'Feature:' ) )
            // InternalCucumber.g:318:1: ( 'Feature:' )
            {
            // InternalCucumber.g:318:1: ( 'Feature:' )
            // InternalCucumber.g:319:2: 'Feature:'
            {
             before(grammarAccess.getFeatureAccess().getFeatureKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getFeatureKeyword_2()); 

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
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group__3"
    // InternalCucumber.g:328:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:332:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalCucumber.g:333:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Feature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__4();

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
    // $ANTLR end "rule__Feature__Group__3"


    // $ANTLR start "rule__Feature__Group__3__Impl"
    // InternalCucumber.g:340:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__TitleAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:344:1: ( ( ( rule__Feature__TitleAssignment_3 ) ) )
            // InternalCucumber.g:345:1: ( ( rule__Feature__TitleAssignment_3 ) )
            {
            // InternalCucumber.g:345:1: ( ( rule__Feature__TitleAssignment_3 ) )
            // InternalCucumber.g:346:2: ( rule__Feature__TitleAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getTitleAssignment_3()); 
            // InternalCucumber.g:347:2: ( rule__Feature__TitleAssignment_3 )
            // InternalCucumber.g:347:3: rule__Feature__TitleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Feature__TitleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTitleAssignment_3()); 

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
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__Feature__Group__4"
    // InternalCucumber.g:355:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl rule__Feature__Group__5 ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:359:1: ( rule__Feature__Group__4__Impl rule__Feature__Group__5 )
            // InternalCucumber.g:360:2: rule__Feature__Group__4__Impl rule__Feature__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Feature__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__5();

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
    // $ANTLR end "rule__Feature__Group__4"


    // $ANTLR start "rule__Feature__Group__4__Impl"
    // InternalCucumber.g:367:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__DescriptionAssignment_4 ) ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:371:1: ( ( ( rule__Feature__DescriptionAssignment_4 ) ) )
            // InternalCucumber.g:372:1: ( ( rule__Feature__DescriptionAssignment_4 ) )
            {
            // InternalCucumber.g:372:1: ( ( rule__Feature__DescriptionAssignment_4 ) )
            // InternalCucumber.g:373:2: ( rule__Feature__DescriptionAssignment_4 )
            {
             before(grammarAccess.getFeatureAccess().getDescriptionAssignment_4()); 
            // InternalCucumber.g:374:2: ( rule__Feature__DescriptionAssignment_4 )
            // InternalCucumber.g:374:3: rule__Feature__DescriptionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Feature__DescriptionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getDescriptionAssignment_4()); 

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
    // $ANTLR end "rule__Feature__Group__4__Impl"


    // $ANTLR start "rule__Feature__Group__5"
    // InternalCucumber.g:382:1: rule__Feature__Group__5 : rule__Feature__Group__5__Impl ;
    public final void rule__Feature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:386:1: ( rule__Feature__Group__5__Impl )
            // InternalCucumber.g:387:2: rule__Feature__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__5__Impl();

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
    // $ANTLR end "rule__Feature__Group__5"


    // $ANTLR start "rule__Feature__Group__5__Impl"
    // InternalCucumber.g:393:1: rule__Feature__Group__5__Impl : ( ( rule__Feature__ScenariosAssignment_5 )* ) ;
    public final void rule__Feature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:397:1: ( ( ( rule__Feature__ScenariosAssignment_5 )* ) )
            // InternalCucumber.g:398:1: ( ( rule__Feature__ScenariosAssignment_5 )* )
            {
            // InternalCucumber.g:398:1: ( ( rule__Feature__ScenariosAssignment_5 )* )
            // InternalCucumber.g:399:2: ( rule__Feature__ScenariosAssignment_5 )*
            {
             before(grammarAccess.getFeatureAccess().getScenariosAssignment_5()); 
            // InternalCucumber.g:400:2: ( rule__Feature__ScenariosAssignment_5 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_EOL||LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCucumber.g:400:3: rule__Feature__ScenariosAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Feature__ScenariosAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getScenariosAssignment_5()); 

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
    // $ANTLR end "rule__Feature__Group__5__Impl"


    // $ANTLR start "rule__Scenario__Group__0"
    // InternalCucumber.g:409:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:413:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalCucumber.g:414:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Scenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__1();

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
    // $ANTLR end "rule__Scenario__Group__0"


    // $ANTLR start "rule__Scenario__Group__0__Impl"
    // InternalCucumber.g:421:1: rule__Scenario__Group__0__Impl : ( ( rule__Scenario__TagsAssignment_0 )* ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:425:1: ( ( ( rule__Scenario__TagsAssignment_0 )* ) )
            // InternalCucumber.g:426:1: ( ( rule__Scenario__TagsAssignment_0 )* )
            {
            // InternalCucumber.g:426:1: ( ( rule__Scenario__TagsAssignment_0 )* )
            // InternalCucumber.g:427:2: ( rule__Scenario__TagsAssignment_0 )*
            {
             before(grammarAccess.getScenarioAccess().getTagsAssignment_0()); 
            // InternalCucumber.g:428:2: ( rule__Scenario__TagsAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCucumber.g:428:3: rule__Scenario__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Scenario__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getTagsAssignment_0()); 

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
    // $ANTLR end "rule__Scenario__Group__0__Impl"


    // $ANTLR start "rule__Scenario__Group__1"
    // InternalCucumber.g:436:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:440:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalCucumber.g:441:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Scenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__2();

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
    // $ANTLR end "rule__Scenario__Group__1"


    // $ANTLR start "rule__Scenario__Group__1__Impl"
    // InternalCucumber.g:448:1: rule__Scenario__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:452:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:453:1: ( RULE_EOL )
            {
            // InternalCucumber.g:453:1: ( RULE_EOL )
            // InternalCucumber.g:454:2: RULE_EOL
            {
             before(grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_1()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Scenario__Group__1__Impl"


    // $ANTLR start "rule__Scenario__Group__2"
    // InternalCucumber.g:463:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:467:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // InternalCucumber.g:468:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Scenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__3();

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
    // $ANTLR end "rule__Scenario__Group__2"


    // $ANTLR start "rule__Scenario__Group__2__Impl"
    // InternalCucumber.g:475:1: rule__Scenario__Group__2__Impl : ( 'Scenario:' ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:479:1: ( ( 'Scenario:' ) )
            // InternalCucumber.g:480:1: ( 'Scenario:' )
            {
            // InternalCucumber.g:480:1: ( 'Scenario:' )
            // InternalCucumber.g:481:2: 'Scenario:'
            {
             before(grammarAccess.getScenarioAccess().getScenarioKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getScenarioKeyword_2()); 

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
    // $ANTLR end "rule__Scenario__Group__2__Impl"


    // $ANTLR start "rule__Scenario__Group__3"
    // InternalCucumber.g:490:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl rule__Scenario__Group__4 ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:494:1: ( rule__Scenario__Group__3__Impl rule__Scenario__Group__4 )
            // InternalCucumber.g:495:2: rule__Scenario__Group__3__Impl rule__Scenario__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Scenario__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__4();

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
    // $ANTLR end "rule__Scenario__Group__3"


    // $ANTLR start "rule__Scenario__Group__3__Impl"
    // InternalCucumber.g:502:1: rule__Scenario__Group__3__Impl : ( ( rule__Scenario__TitleAssignment_3 ) ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:506:1: ( ( ( rule__Scenario__TitleAssignment_3 ) ) )
            // InternalCucumber.g:507:1: ( ( rule__Scenario__TitleAssignment_3 ) )
            {
            // InternalCucumber.g:507:1: ( ( rule__Scenario__TitleAssignment_3 ) )
            // InternalCucumber.g:508:2: ( rule__Scenario__TitleAssignment_3 )
            {
             before(grammarAccess.getScenarioAccess().getTitleAssignment_3()); 
            // InternalCucumber.g:509:2: ( rule__Scenario__TitleAssignment_3 )
            // InternalCucumber.g:509:3: rule__Scenario__TitleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__TitleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getTitleAssignment_3()); 

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
    // $ANTLR end "rule__Scenario__Group__3__Impl"


    // $ANTLR start "rule__Scenario__Group__4"
    // InternalCucumber.g:517:1: rule__Scenario__Group__4 : rule__Scenario__Group__4__Impl rule__Scenario__Group__5 ;
    public final void rule__Scenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:521:1: ( rule__Scenario__Group__4__Impl rule__Scenario__Group__5 )
            // InternalCucumber.g:522:2: rule__Scenario__Group__4__Impl rule__Scenario__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Scenario__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__5();

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
    // $ANTLR end "rule__Scenario__Group__4"


    // $ANTLR start "rule__Scenario__Group__4__Impl"
    // InternalCucumber.g:529:1: rule__Scenario__Group__4__Impl : ( ( rule__Scenario__DescriptionAssignment_4 ) ) ;
    public final void rule__Scenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:533:1: ( ( ( rule__Scenario__DescriptionAssignment_4 ) ) )
            // InternalCucumber.g:534:1: ( ( rule__Scenario__DescriptionAssignment_4 ) )
            {
            // InternalCucumber.g:534:1: ( ( rule__Scenario__DescriptionAssignment_4 ) )
            // InternalCucumber.g:535:2: ( rule__Scenario__DescriptionAssignment_4 )
            {
             before(grammarAccess.getScenarioAccess().getDescriptionAssignment_4()); 
            // InternalCucumber.g:536:2: ( rule__Scenario__DescriptionAssignment_4 )
            // InternalCucumber.g:536:3: rule__Scenario__DescriptionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__DescriptionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getDescriptionAssignment_4()); 

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
    // $ANTLR end "rule__Scenario__Group__4__Impl"


    // $ANTLR start "rule__Scenario__Group__5"
    // InternalCucumber.g:544:1: rule__Scenario__Group__5 : rule__Scenario__Group__5__Impl ;
    public final void rule__Scenario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:548:1: ( rule__Scenario__Group__5__Impl )
            // InternalCucumber.g:549:2: rule__Scenario__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Group__5__Impl();

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
    // $ANTLR end "rule__Scenario__Group__5"


    // $ANTLR start "rule__Scenario__Group__5__Impl"
    // InternalCucumber.g:555:1: rule__Scenario__Group__5__Impl : ( ( rule__Scenario__StepsAssignment_5 )* ) ;
    public final void rule__Scenario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:559:1: ( ( ( rule__Scenario__StepsAssignment_5 )* ) )
            // InternalCucumber.g:560:1: ( ( rule__Scenario__StepsAssignment_5 )* )
            {
            // InternalCucumber.g:560:1: ( ( rule__Scenario__StepsAssignment_5 )* )
            // InternalCucumber.g:561:2: ( rule__Scenario__StepsAssignment_5 )*
            {
             before(grammarAccess.getScenarioAccess().getStepsAssignment_5()); 
            // InternalCucumber.g:562:2: ( rule__Scenario__StepsAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=8 && LA5_0<=13)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCucumber.g:562:3: rule__Scenario__StepsAssignment_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Scenario__StepsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getStepsAssignment_5()); 

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
    // $ANTLR end "rule__Scenario__Group__5__Impl"


    // $ANTLR start "rule__Step__Group__0"
    // InternalCucumber.g:571:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:575:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // InternalCucumber.g:576:2: rule__Step__Group__0__Impl rule__Step__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Step__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__1();

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
    // $ANTLR end "rule__Step__Group__0"


    // $ANTLR start "rule__Step__Group__0__Impl"
    // InternalCucumber.g:583:1: rule__Step__Group__0__Impl : ( ( rule__Step__KeywordAssignment_0 ) ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:587:1: ( ( ( rule__Step__KeywordAssignment_0 ) ) )
            // InternalCucumber.g:588:1: ( ( rule__Step__KeywordAssignment_0 ) )
            {
            // InternalCucumber.g:588:1: ( ( rule__Step__KeywordAssignment_0 ) )
            // InternalCucumber.g:589:2: ( rule__Step__KeywordAssignment_0 )
            {
             before(grammarAccess.getStepAccess().getKeywordAssignment_0()); 
            // InternalCucumber.g:590:2: ( rule__Step__KeywordAssignment_0 )
            // InternalCucumber.g:590:3: rule__Step__KeywordAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Step__KeywordAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getKeywordAssignment_0()); 

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
    // $ANTLR end "rule__Step__Group__0__Impl"


    // $ANTLR start "rule__Step__Group__1"
    // InternalCucumber.g:598:1: rule__Step__Group__1 : rule__Step__Group__1__Impl ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:602:1: ( rule__Step__Group__1__Impl )
            // InternalCucumber.g:603:2: rule__Step__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group__1__Impl();

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
    // $ANTLR end "rule__Step__Group__1"


    // $ANTLR start "rule__Step__Group__1__Impl"
    // InternalCucumber.g:609:1: rule__Step__Group__1__Impl : ( ( rule__Step__TitleAssignment_1 ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:613:1: ( ( ( rule__Step__TitleAssignment_1 ) ) )
            // InternalCucumber.g:614:1: ( ( rule__Step__TitleAssignment_1 ) )
            {
            // InternalCucumber.g:614:1: ( ( rule__Step__TitleAssignment_1 ) )
            // InternalCucumber.g:615:2: ( rule__Step__TitleAssignment_1 )
            {
             before(grammarAccess.getStepAccess().getTitleAssignment_1()); 
            // InternalCucumber.g:616:2: ( rule__Step__TitleAssignment_1 )
            // InternalCucumber.g:616:3: rule__Step__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Step__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getTitleAssignment_1()); 

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
    // $ANTLR end "rule__Step__Group__1__Impl"


    // $ANTLR start "rule__Description__Group__0"
    // InternalCucumber.g:625:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:629:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalCucumber.g:630:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Description__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__1();

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
    // $ANTLR end "rule__Description__Group__0"


    // $ANTLR start "rule__Description__Group__0__Impl"
    // InternalCucumber.g:637:1: rule__Description__Group__0__Impl : ( () ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:641:1: ( ( () ) )
            // InternalCucumber.g:642:1: ( () )
            {
            // InternalCucumber.g:642:1: ( () )
            // InternalCucumber.g:643:2: ()
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionAction_0()); 
            // InternalCucumber.g:644:2: ()
            // InternalCucumber.g:644:3: 
            {
            }

             after(grammarAccess.getDescriptionAccess().getDescriptionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__0__Impl"


    // $ANTLR start "rule__Description__Group__1"
    // InternalCucumber.g:652:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:656:1: ( rule__Description__Group__1__Impl )
            // InternalCucumber.g:657:2: rule__Description__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__1__Impl();

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
    // $ANTLR end "rule__Description__Group__1"


    // $ANTLR start "rule__Description__Group__1__Impl"
    // InternalCucumber.g:663:1: rule__Description__Group__1__Impl : ( ( rule__Description__SentencesAssignment_1 )* ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:667:1: ( ( ( rule__Description__SentencesAssignment_1 )* ) )
            // InternalCucumber.g:668:1: ( ( rule__Description__SentencesAssignment_1 )* )
            {
            // InternalCucumber.g:668:1: ( ( rule__Description__SentencesAssignment_1 )* )
            // InternalCucumber.g:669:2: ( rule__Description__SentencesAssignment_1 )*
            {
             before(grammarAccess.getDescriptionAccess().getSentencesAssignment_1()); 
            // InternalCucumber.g:670:2: ( rule__Description__SentencesAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_WORD) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCucumber.g:670:3: rule__Description__SentencesAssignment_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Description__SentencesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDescriptionAccess().getSentencesAssignment_1()); 

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
    // $ANTLR end "rule__Description__Group__1__Impl"


    // $ANTLR start "rule__Tag__Group__0"
    // InternalCucumber.g:679:1: rule__Tag__Group__0 : rule__Tag__Group__0__Impl rule__Tag__Group__1 ;
    public final void rule__Tag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:683:1: ( rule__Tag__Group__0__Impl rule__Tag__Group__1 )
            // InternalCucumber.g:684:2: rule__Tag__Group__0__Impl rule__Tag__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Tag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tag__Group__1();

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
    // $ANTLR end "rule__Tag__Group__0"


    // $ANTLR start "rule__Tag__Group__0__Impl"
    // InternalCucumber.g:691:1: rule__Tag__Group__0__Impl : ( ( rule__Tag__TitleAssignment_0 ) ) ;
    public final void rule__Tag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:695:1: ( ( ( rule__Tag__TitleAssignment_0 ) ) )
            // InternalCucumber.g:696:1: ( ( rule__Tag__TitleAssignment_0 ) )
            {
            // InternalCucumber.g:696:1: ( ( rule__Tag__TitleAssignment_0 ) )
            // InternalCucumber.g:697:2: ( rule__Tag__TitleAssignment_0 )
            {
             before(grammarAccess.getTagAccess().getTitleAssignment_0()); 
            // InternalCucumber.g:698:2: ( rule__Tag__TitleAssignment_0 )
            // InternalCucumber.g:698:3: rule__Tag__TitleAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Tag__TitleAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTagAccess().getTitleAssignment_0()); 

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
    // $ANTLR end "rule__Tag__Group__0__Impl"


    // $ANTLR start "rule__Tag__Group__1"
    // InternalCucumber.g:706:1: rule__Tag__Group__1 : rule__Tag__Group__1__Impl rule__Tag__Group__2 ;
    public final void rule__Tag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:710:1: ( rule__Tag__Group__1__Impl rule__Tag__Group__2 )
            // InternalCucumber.g:711:2: rule__Tag__Group__1__Impl rule__Tag__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Tag__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tag__Group__2();

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
    // $ANTLR end "rule__Tag__Group__1"


    // $ANTLR start "rule__Tag__Group__1__Impl"
    // InternalCucumber.g:718:1: rule__Tag__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__Tag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:722:1: ( ( RULE_ID ) )
            // InternalCucumber.g:723:1: ( RULE_ID )
            {
            // InternalCucumber.g:723:1: ( RULE_ID )
            // InternalCucumber.g:724:2: RULE_ID
            {
             before(grammarAccess.getTagAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTagAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Tag__Group__1__Impl"


    // $ANTLR start "rule__Tag__Group__2"
    // InternalCucumber.g:733:1: rule__Tag__Group__2 : rule__Tag__Group__2__Impl ;
    public final void rule__Tag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:737:1: ( rule__Tag__Group__2__Impl )
            // InternalCucumber.g:738:2: rule__Tag__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tag__Group__2__Impl();

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
    // $ANTLR end "rule__Tag__Group__2"


    // $ANTLR start "rule__Tag__Group__2__Impl"
    // InternalCucumber.g:744:1: rule__Tag__Group__2__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Tag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:748:1: ( ( ( RULE_WS )? ) )
            // InternalCucumber.g:749:1: ( ( RULE_WS )? )
            {
            // InternalCucumber.g:749:1: ( ( RULE_WS )? )
            // InternalCucumber.g:750:2: ( RULE_WS )?
            {
             before(grammarAccess.getTagAccess().getWSTerminalRuleCall_2()); 
            // InternalCucumber.g:751:2: ( RULE_WS )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_WS) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCucumber.g:751:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getTagAccess().getWSTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Tag__Group__2__Impl"


    // $ANTLR start "rule__Sentence__Group__0"
    // InternalCucumber.g:760:1: rule__Sentence__Group__0 : rule__Sentence__Group__0__Impl rule__Sentence__Group__1 ;
    public final void rule__Sentence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:764:1: ( rule__Sentence__Group__0__Impl rule__Sentence__Group__1 )
            // InternalCucumber.g:765:2: rule__Sentence__Group__0__Impl rule__Sentence__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Sentence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sentence__Group__1();

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
    // $ANTLR end "rule__Sentence__Group__0"


    // $ANTLR start "rule__Sentence__Group__0__Impl"
    // InternalCucumber.g:772:1: rule__Sentence__Group__0__Impl : ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) ) ;
    public final void rule__Sentence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:776:1: ( ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) ) )
            // InternalCucumber.g:777:1: ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) )
            {
            // InternalCucumber.g:777:1: ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) )
            // InternalCucumber.g:778:2: ( ( RULE_WORD ) ) ( ( RULE_WORD )* )
            {
            // InternalCucumber.g:778:2: ( ( RULE_WORD ) )
            // InternalCucumber.g:779:3: ( RULE_WORD )
            {
             before(grammarAccess.getSentenceAccess().getWORDTerminalRuleCall_0()); 
            // InternalCucumber.g:780:3: ( RULE_WORD )
            // InternalCucumber.g:780:4: RULE_WORD
            {
            match(input,RULE_WORD,FOLLOW_12); 

            }

             after(grammarAccess.getSentenceAccess().getWORDTerminalRuleCall_0()); 

            }

            // InternalCucumber.g:783:2: ( ( RULE_WORD )* )
            // InternalCucumber.g:784:3: ( RULE_WORD )*
            {
             before(grammarAccess.getSentenceAccess().getWORDTerminalRuleCall_0()); 
            // InternalCucumber.g:785:3: ( RULE_WORD )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_WORD) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCucumber.g:785:4: RULE_WORD
            	    {
            	    match(input,RULE_WORD,FOLLOW_12); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSentenceAccess().getWORDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Sentence__Group__0__Impl"


    // $ANTLR start "rule__Sentence__Group__1"
    // InternalCucumber.g:794:1: rule__Sentence__Group__1 : rule__Sentence__Group__1__Impl ;
    public final void rule__Sentence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:798:1: ( rule__Sentence__Group__1__Impl )
            // InternalCucumber.g:799:2: rule__Sentence__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sentence__Group__1__Impl();

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
    // $ANTLR end "rule__Sentence__Group__1"


    // $ANTLR start "rule__Sentence__Group__1__Impl"
    // InternalCucumber.g:805:1: rule__Sentence__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Sentence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:809:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:810:1: ( RULE_EOL )
            {
            // InternalCucumber.g:810:1: ( RULE_EOL )
            // InternalCucumber.g:811:2: RULE_EOL
            {
             before(grammarAccess.getSentenceAccess().getEOLTerminalRuleCall_1()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getSentenceAccess().getEOLTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Sentence__Group__1__Impl"


    // $ANTLR start "rule__Feature__TagsAssignment_0"
    // InternalCucumber.g:821:1: rule__Feature__TagsAssignment_0 : ( ruleTag ) ;
    public final void rule__Feature__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:825:1: ( ( ruleTag ) )
            // InternalCucumber.g:826:2: ( ruleTag )
            {
            // InternalCucumber.g:826:2: ( ruleTag )
            // InternalCucumber.g:827:3: ruleTag
            {
             before(grammarAccess.getFeatureAccess().getTagsTagParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getTagsTagParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Feature__TagsAssignment_0"


    // $ANTLR start "rule__Feature__TitleAssignment_3"
    // InternalCucumber.g:836:1: rule__Feature__TitleAssignment_3 : ( ruleSentence ) ;
    public final void rule__Feature__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:840:1: ( ( ruleSentence ) )
            // InternalCucumber.g:841:2: ( ruleSentence )
            {
            // InternalCucumber.g:841:2: ( ruleSentence )
            // InternalCucumber.g:842:3: ruleSentence
            {
             before(grammarAccess.getFeatureAccess().getTitleSentenceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getTitleSentenceParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Feature__TitleAssignment_3"


    // $ANTLR start "rule__Feature__DescriptionAssignment_4"
    // InternalCucumber.g:851:1: rule__Feature__DescriptionAssignment_4 : ( ruleDescription ) ;
    public final void rule__Feature__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:855:1: ( ( ruleDescription ) )
            // InternalCucumber.g:856:2: ( ruleDescription )
            {
            // InternalCucumber.g:856:2: ( ruleDescription )
            // InternalCucumber.g:857:3: ruleDescription
            {
             before(grammarAccess.getFeatureAccess().getDescriptionDescriptionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getDescriptionDescriptionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Feature__DescriptionAssignment_4"


    // $ANTLR start "rule__Feature__ScenariosAssignment_5"
    // InternalCucumber.g:866:1: rule__Feature__ScenariosAssignment_5 : ( ruleScenario ) ;
    public final void rule__Feature__ScenariosAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:870:1: ( ( ruleScenario ) )
            // InternalCucumber.g:871:2: ( ruleScenario )
            {
            // InternalCucumber.g:871:2: ( ruleScenario )
            // InternalCucumber.g:872:3: ruleScenario
            {
             before(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Feature__ScenariosAssignment_5"


    // $ANTLR start "rule__Scenario__TagsAssignment_0"
    // InternalCucumber.g:881:1: rule__Scenario__TagsAssignment_0 : ( ruleTag ) ;
    public final void rule__Scenario__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:885:1: ( ( ruleTag ) )
            // InternalCucumber.g:886:2: ( ruleTag )
            {
            // InternalCucumber.g:886:2: ( ruleTag )
            // InternalCucumber.g:887:3: ruleTag
            {
             before(grammarAccess.getScenarioAccess().getTagsTagParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getTagsTagParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Scenario__TagsAssignment_0"


    // $ANTLR start "rule__Scenario__TitleAssignment_3"
    // InternalCucumber.g:896:1: rule__Scenario__TitleAssignment_3 : ( ruleSentence ) ;
    public final void rule__Scenario__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:900:1: ( ( ruleSentence ) )
            // InternalCucumber.g:901:2: ( ruleSentence )
            {
            // InternalCucumber.g:901:2: ( ruleSentence )
            // InternalCucumber.g:902:3: ruleSentence
            {
             before(grammarAccess.getScenarioAccess().getTitleSentenceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getTitleSentenceParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Scenario__TitleAssignment_3"


    // $ANTLR start "rule__Scenario__DescriptionAssignment_4"
    // InternalCucumber.g:911:1: rule__Scenario__DescriptionAssignment_4 : ( ruleDescription ) ;
    public final void rule__Scenario__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:915:1: ( ( ruleDescription ) )
            // InternalCucumber.g:916:2: ( ruleDescription )
            {
            // InternalCucumber.g:916:2: ( ruleDescription )
            // InternalCucumber.g:917:3: ruleDescription
            {
             before(grammarAccess.getScenarioAccess().getDescriptionDescriptionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getDescriptionDescriptionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Scenario__DescriptionAssignment_4"


    // $ANTLR start "rule__Scenario__StepsAssignment_5"
    // InternalCucumber.g:926:1: rule__Scenario__StepsAssignment_5 : ( ruleStep ) ;
    public final void rule__Scenario__StepsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:930:1: ( ( ruleStep ) )
            // InternalCucumber.g:931:2: ( ruleStep )
            {
            // InternalCucumber.g:931:2: ( ruleStep )
            // InternalCucumber.g:932:3: ruleStep
            {
             before(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Scenario__StepsAssignment_5"


    // $ANTLR start "rule__Step__KeywordAssignment_0"
    // InternalCucumber.g:941:1: rule__Step__KeywordAssignment_0 : ( ( rule__Step__KeywordAlternatives_0_0 ) ) ;
    public final void rule__Step__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:945:1: ( ( ( rule__Step__KeywordAlternatives_0_0 ) ) )
            // InternalCucumber.g:946:2: ( ( rule__Step__KeywordAlternatives_0_0 ) )
            {
            // InternalCucumber.g:946:2: ( ( rule__Step__KeywordAlternatives_0_0 ) )
            // InternalCucumber.g:947:3: ( rule__Step__KeywordAlternatives_0_0 )
            {
             before(grammarAccess.getStepAccess().getKeywordAlternatives_0_0()); 
            // InternalCucumber.g:948:3: ( rule__Step__KeywordAlternatives_0_0 )
            // InternalCucumber.g:948:4: rule__Step__KeywordAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Step__KeywordAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getKeywordAlternatives_0_0()); 

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
    // $ANTLR end "rule__Step__KeywordAssignment_0"


    // $ANTLR start "rule__Step__TitleAssignment_1"
    // InternalCucumber.g:956:1: rule__Step__TitleAssignment_1 : ( ruleSentence ) ;
    public final void rule__Step__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:960:1: ( ( ruleSentence ) )
            // InternalCucumber.g:961:2: ( ruleSentence )
            {
            // InternalCucumber.g:961:2: ( ruleSentence )
            // InternalCucumber.g:962:3: ruleSentence
            {
             before(grammarAccess.getStepAccess().getTitleSentenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getStepAccess().getTitleSentenceParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Step__TitleAssignment_1"


    // $ANTLR start "rule__Description__SentencesAssignment_1"
    // InternalCucumber.g:971:1: rule__Description__SentencesAssignment_1 : ( ruleSentence ) ;
    public final void rule__Description__SentencesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:975:1: ( ( ruleSentence ) )
            // InternalCucumber.g:976:2: ( ruleSentence )
            {
            // InternalCucumber.g:976:2: ( ruleSentence )
            // InternalCucumber.g:977:3: ruleSentence
            {
             before(grammarAccess.getDescriptionAccess().getSentencesSentenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getDescriptionAccess().getSentencesSentenceParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Description__SentencesAssignment_1"


    // $ANTLR start "rule__Tag__TitleAssignment_0"
    // InternalCucumber.g:986:1: rule__Tag__TitleAssignment_0 : ( ( '@' ) ) ;
    public final void rule__Tag__TitleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:990:1: ( ( ( '@' ) ) )
            // InternalCucumber.g:991:2: ( ( '@' ) )
            {
            // InternalCucumber.g:991:2: ( ( '@' ) )
            // InternalCucumber.g:992:3: ( '@' )
            {
             before(grammarAccess.getTagAccess().getTitleCommercialAtKeyword_0_0()); 
            // InternalCucumber.g:993:3: ( '@' )
            // InternalCucumber.g:994:4: '@'
            {
             before(grammarAccess.getTagAccess().getTitleCommercialAtKeyword_0_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTagAccess().getTitleCommercialAtKeyword_0_0()); 

            }

             after(grammarAccess.getTagAccess().getTitleCommercialAtKeyword_0_0()); 

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
    // $ANTLR end "rule__Tag__TitleAssignment_0"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000003F00L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000003F02L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});

}
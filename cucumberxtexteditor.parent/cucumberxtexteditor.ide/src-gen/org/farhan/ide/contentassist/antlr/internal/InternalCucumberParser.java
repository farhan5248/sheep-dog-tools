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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TAG", "RULE_EOL", "RULE_WORD", "RULE_WS", "RULE_COMMENT", "'Given'", "'When'", "'Then'", "'And'", "'But'", "'*'", "'Feature:'", "'Background:'", "'Scenario:'"
    };
    public static final int T__9=9;
    public static final int RULE_EOL=5;
    public static final int RULE_WS=7;
    public static final int RULE_WORD=6;
    public static final int RULE_COMMENT=8;
    public static final int RULE_TAG=4;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
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


    // $ANTLR start "entryRuleBackground"
    // InternalCucumber.g:78:1: entryRuleBackground : ruleBackground EOF ;
    public final void entryRuleBackground() throws RecognitionException {
        try {
            // InternalCucumber.g:79:1: ( ruleBackground EOF )
            // InternalCucumber.g:80:1: ruleBackground EOF
            {
             before(grammarAccess.getBackgroundRule()); 
            pushFollow(FOLLOW_1);
            ruleBackground();

            state._fsp--;

             after(grammarAccess.getBackgroundRule()); 
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
    // $ANTLR end "entryRuleBackground"


    // $ANTLR start "ruleBackground"
    // InternalCucumber.g:87:1: ruleBackground : ( ( rule__Background__Group__0 ) ) ;
    public final void ruleBackground() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:91:2: ( ( ( rule__Background__Group__0 ) ) )
            // InternalCucumber.g:92:2: ( ( rule__Background__Group__0 ) )
            {
            // InternalCucumber.g:92:2: ( ( rule__Background__Group__0 ) )
            // InternalCucumber.g:93:3: ( rule__Background__Group__0 )
            {
             before(grammarAccess.getBackgroundAccess().getGroup()); 
            // InternalCucumber.g:94:3: ( rule__Background__Group__0 )
            // InternalCucumber.g:94:4: rule__Background__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Background__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBackgroundAccess().getGroup()); 

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
    // $ANTLR end "ruleBackground"


    // $ANTLR start "entryRuleScenario"
    // InternalCucumber.g:103:1: entryRuleScenario : ruleScenario EOF ;
    public final void entryRuleScenario() throws RecognitionException {
        try {
            // InternalCucumber.g:104:1: ( ruleScenario EOF )
            // InternalCucumber.g:105:1: ruleScenario EOF
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
    // InternalCucumber.g:112:1: ruleScenario : ( ( rule__Scenario__Group__0 ) ) ;
    public final void ruleScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:116:2: ( ( ( rule__Scenario__Group__0 ) ) )
            // InternalCucumber.g:117:2: ( ( rule__Scenario__Group__0 ) )
            {
            // InternalCucumber.g:117:2: ( ( rule__Scenario__Group__0 ) )
            // InternalCucumber.g:118:3: ( rule__Scenario__Group__0 )
            {
             before(grammarAccess.getScenarioAccess().getGroup()); 
            // InternalCucumber.g:119:3: ( rule__Scenario__Group__0 )
            // InternalCucumber.g:119:4: rule__Scenario__Group__0
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
    // InternalCucumber.g:128:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalCucumber.g:129:1: ( ruleStep EOF )
            // InternalCucumber.g:130:1: ruleStep EOF
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
    // InternalCucumber.g:137:1: ruleStep : ( ( rule__Step__Group__0 ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:141:2: ( ( ( rule__Step__Group__0 ) ) )
            // InternalCucumber.g:142:2: ( ( rule__Step__Group__0 ) )
            {
            // InternalCucumber.g:142:2: ( ( rule__Step__Group__0 ) )
            // InternalCucumber.g:143:3: ( rule__Step__Group__0 )
            {
             before(grammarAccess.getStepAccess().getGroup()); 
            // InternalCucumber.g:144:3: ( rule__Step__Group__0 )
            // InternalCucumber.g:144:4: rule__Step__Group__0
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
    // InternalCucumber.g:153:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalCucumber.g:154:1: ( ruleDescription EOF )
            // InternalCucumber.g:155:1: ruleDescription EOF
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
    // InternalCucumber.g:162:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:166:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalCucumber.g:167:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalCucumber.g:167:2: ( ( rule__Description__Group__0 ) )
            // InternalCucumber.g:168:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalCucumber.g:169:3: ( rule__Description__Group__0 )
            // InternalCucumber.g:169:4: rule__Description__Group__0
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


    // $ANTLR start "entryRuleTags"
    // InternalCucumber.g:178:1: entryRuleTags : ruleTags EOF ;
    public final void entryRuleTags() throws RecognitionException {
        try {
            // InternalCucumber.g:179:1: ( ruleTags EOF )
            // InternalCucumber.g:180:1: ruleTags EOF
            {
             before(grammarAccess.getTagsRule()); 
            pushFollow(FOLLOW_1);
            ruleTags();

            state._fsp--;

             after(grammarAccess.getTagsRule()); 
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
    // $ANTLR end "entryRuleTags"


    // $ANTLR start "ruleTags"
    // InternalCucumber.g:187:1: ruleTags : ( ( rule__Tags__Group__0 ) ) ;
    public final void ruleTags() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:191:2: ( ( ( rule__Tags__Group__0 ) ) )
            // InternalCucumber.g:192:2: ( ( rule__Tags__Group__0 ) )
            {
            // InternalCucumber.g:192:2: ( ( rule__Tags__Group__0 ) )
            // InternalCucumber.g:193:3: ( rule__Tags__Group__0 )
            {
             before(grammarAccess.getTagsAccess().getGroup()); 
            // InternalCucumber.g:194:3: ( rule__Tags__Group__0 )
            // InternalCucumber.g:194:4: rule__Tags__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tags__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTagsAccess().getGroup()); 

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
    // $ANTLR end "ruleTags"


    // $ANTLR start "entryRuleSentence"
    // InternalCucumber.g:203:1: entryRuleSentence : ruleSentence EOF ;
    public final void entryRuleSentence() throws RecognitionException {
        try {
            // InternalCucumber.g:204:1: ( ruleSentence EOF )
            // InternalCucumber.g:205:1: ruleSentence EOF
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
    // InternalCucumber.g:212:1: ruleSentence : ( ( rule__Sentence__Group__0 ) ) ;
    public final void ruleSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:216:2: ( ( ( rule__Sentence__Group__0 ) ) )
            // InternalCucumber.g:217:2: ( ( rule__Sentence__Group__0 ) )
            {
            // InternalCucumber.g:217:2: ( ( rule__Sentence__Group__0 ) )
            // InternalCucumber.g:218:3: ( rule__Sentence__Group__0 )
            {
             before(grammarAccess.getSentenceAccess().getGroup()); 
            // InternalCucumber.g:219:3: ( rule__Sentence__Group__0 )
            // InternalCucumber.g:219:4: rule__Sentence__Group__0
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
    // InternalCucumber.g:227:1: rule__Step__KeywordAlternatives_0_0 : ( ( 'Given' ) | ( 'When' ) | ( 'Then' ) | ( 'And' ) | ( 'But' ) | ( '*' ) );
    public final void rule__Step__KeywordAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:231:1: ( ( 'Given' ) | ( 'When' ) | ( 'Then' ) | ( 'And' ) | ( 'But' ) | ( '*' ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 9:
                {
                alt1=1;
                }
                break;
            case 10:
                {
                alt1=2;
                }
                break;
            case 11:
                {
                alt1=3;
                }
                break;
            case 12:
                {
                alt1=4;
                }
                break;
            case 13:
                {
                alt1=5;
                }
                break;
            case 14:
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
                    // InternalCucumber.g:232:2: ( 'Given' )
                    {
                    // InternalCucumber.g:232:2: ( 'Given' )
                    // InternalCucumber.g:233:3: 'Given'
                    {
                     before(grammarAccess.getStepAccess().getKeywordGivenKeyword_0_0_0()); 
                    match(input,9,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getKeywordGivenKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:238:2: ( 'When' )
                    {
                    // InternalCucumber.g:238:2: ( 'When' )
                    // InternalCucumber.g:239:3: 'When'
                    {
                     before(grammarAccess.getStepAccess().getKeywordWhenKeyword_0_0_1()); 
                    match(input,10,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getKeywordWhenKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCucumber.g:244:2: ( 'Then' )
                    {
                    // InternalCucumber.g:244:2: ( 'Then' )
                    // InternalCucumber.g:245:3: 'Then'
                    {
                     before(grammarAccess.getStepAccess().getKeywordThenKeyword_0_0_2()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getKeywordThenKeyword_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCucumber.g:250:2: ( 'And' )
                    {
                    // InternalCucumber.g:250:2: ( 'And' )
                    // InternalCucumber.g:251:3: 'And'
                    {
                     before(grammarAccess.getStepAccess().getKeywordAndKeyword_0_0_3()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getKeywordAndKeyword_0_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCucumber.g:256:2: ( 'But' )
                    {
                    // InternalCucumber.g:256:2: ( 'But' )
                    // InternalCucumber.g:257:3: 'But'
                    {
                     before(grammarAccess.getStepAccess().getKeywordButKeyword_0_0_4()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getKeywordButKeyword_0_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCucumber.g:262:2: ( '*' )
                    {
                    // InternalCucumber.g:262:2: ( '*' )
                    // InternalCucumber.g:263:3: '*'
                    {
                     before(grammarAccess.getStepAccess().getKeywordAsteriskKeyword_0_0_5()); 
                    match(input,14,FOLLOW_2); 
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
    // InternalCucumber.g:272:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:276:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalCucumber.g:277:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
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
    // InternalCucumber.g:284:1: rule__Feature__Group__0__Impl : ( ruleTags ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:288:1: ( ( ruleTags ) )
            // InternalCucumber.g:289:1: ( ruleTags )
            {
            // InternalCucumber.g:289:1: ( ruleTags )
            // InternalCucumber.g:290:2: ruleTags
            {
             before(grammarAccess.getFeatureAccess().getTagsParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTags();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getTagsParserRuleCall_0()); 

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
    // InternalCucumber.g:299:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:303:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalCucumber.g:304:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalCucumber.g:311:1: rule__Feature__Group__1__Impl : ( 'Feature:' ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:315:1: ( ( 'Feature:' ) )
            // InternalCucumber.g:316:1: ( 'Feature:' )
            {
            // InternalCucumber.g:316:1: ( 'Feature:' )
            // InternalCucumber.g:317:2: 'Feature:'
            {
             before(grammarAccess.getFeatureAccess().getFeatureKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getFeatureKeyword_1()); 

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
    // InternalCucumber.g:326:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:330:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalCucumber.g:331:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalCucumber.g:338:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__TitleAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:342:1: ( ( ( rule__Feature__TitleAssignment_2 ) ) )
            // InternalCucumber.g:343:1: ( ( rule__Feature__TitleAssignment_2 ) )
            {
            // InternalCucumber.g:343:1: ( ( rule__Feature__TitleAssignment_2 ) )
            // InternalCucumber.g:344:2: ( rule__Feature__TitleAssignment_2 )
            {
             before(grammarAccess.getFeatureAccess().getTitleAssignment_2()); 
            // InternalCucumber.g:345:2: ( rule__Feature__TitleAssignment_2 )
            // InternalCucumber.g:345:3: rule__Feature__TitleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Feature__TitleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTitleAssignment_2()); 

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
    // InternalCucumber.g:353:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:357:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalCucumber.g:358:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalCucumber.g:365:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__DescriptionAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:369:1: ( ( ( rule__Feature__DescriptionAssignment_3 ) ) )
            // InternalCucumber.g:370:1: ( ( rule__Feature__DescriptionAssignment_3 ) )
            {
            // InternalCucumber.g:370:1: ( ( rule__Feature__DescriptionAssignment_3 ) )
            // InternalCucumber.g:371:2: ( rule__Feature__DescriptionAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getDescriptionAssignment_3()); 
            // InternalCucumber.g:372:2: ( rule__Feature__DescriptionAssignment_3 )
            // InternalCucumber.g:372:3: rule__Feature__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Feature__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getDescriptionAssignment_3()); 

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
    // InternalCucumber.g:380:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl rule__Feature__Group__5 ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:384:1: ( rule__Feature__Group__4__Impl rule__Feature__Group__5 )
            // InternalCucumber.g:385:2: rule__Feature__Group__4__Impl rule__Feature__Group__5
            {
            pushFollow(FOLLOW_5);
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
    // InternalCucumber.g:392:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__BackgroundAssignment_4 )? ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:396:1: ( ( ( rule__Feature__BackgroundAssignment_4 )? ) )
            // InternalCucumber.g:397:1: ( ( rule__Feature__BackgroundAssignment_4 )? )
            {
            // InternalCucumber.g:397:1: ( ( rule__Feature__BackgroundAssignment_4 )? )
            // InternalCucumber.g:398:2: ( rule__Feature__BackgroundAssignment_4 )?
            {
             before(grammarAccess.getFeatureAccess().getBackgroundAssignment_4()); 
            // InternalCucumber.g:399:2: ( rule__Feature__BackgroundAssignment_4 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCucumber.g:399:3: rule__Feature__BackgroundAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__BackgroundAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getBackgroundAssignment_4()); 

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
    // InternalCucumber.g:407:1: rule__Feature__Group__5 : rule__Feature__Group__5__Impl ;
    public final void rule__Feature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:411:1: ( rule__Feature__Group__5__Impl )
            // InternalCucumber.g:412:2: rule__Feature__Group__5__Impl
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
    // InternalCucumber.g:418:1: rule__Feature__Group__5__Impl : ( ( rule__Feature__ScenariosAssignment_5 )* ) ;
    public final void rule__Feature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:422:1: ( ( ( rule__Feature__ScenariosAssignment_5 )* ) )
            // InternalCucumber.g:423:1: ( ( rule__Feature__ScenariosAssignment_5 )* )
            {
            // InternalCucumber.g:423:1: ( ( rule__Feature__ScenariosAssignment_5 )* )
            // InternalCucumber.g:424:2: ( rule__Feature__ScenariosAssignment_5 )*
            {
             before(grammarAccess.getFeatureAccess().getScenariosAssignment_5()); 
            // InternalCucumber.g:425:2: ( rule__Feature__ScenariosAssignment_5 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_TAG && LA3_0<=RULE_EOL)||LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCucumber.g:425:3: rule__Feature__ScenariosAssignment_5
            	    {
            	    pushFollow(FOLLOW_6);
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


    // $ANTLR start "rule__Background__Group__0"
    // InternalCucumber.g:434:1: rule__Background__Group__0 : rule__Background__Group__0__Impl rule__Background__Group__1 ;
    public final void rule__Background__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:438:1: ( rule__Background__Group__0__Impl rule__Background__Group__1 )
            // InternalCucumber.g:439:2: rule__Background__Group__0__Impl rule__Background__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Background__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Background__Group__1();

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
    // $ANTLR end "rule__Background__Group__0"


    // $ANTLR start "rule__Background__Group__0__Impl"
    // InternalCucumber.g:446:1: rule__Background__Group__0__Impl : ( 'Background:' ) ;
    public final void rule__Background__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:450:1: ( ( 'Background:' ) )
            // InternalCucumber.g:451:1: ( 'Background:' )
            {
            // InternalCucumber.g:451:1: ( 'Background:' )
            // InternalCucumber.g:452:2: 'Background:'
            {
             before(grammarAccess.getBackgroundAccess().getBackgroundKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBackgroundAccess().getBackgroundKeyword_0()); 

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
    // $ANTLR end "rule__Background__Group__0__Impl"


    // $ANTLR start "rule__Background__Group__1"
    // InternalCucumber.g:461:1: rule__Background__Group__1 : rule__Background__Group__1__Impl rule__Background__Group__2 ;
    public final void rule__Background__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:465:1: ( rule__Background__Group__1__Impl rule__Background__Group__2 )
            // InternalCucumber.g:466:2: rule__Background__Group__1__Impl rule__Background__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Background__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Background__Group__2();

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
    // $ANTLR end "rule__Background__Group__1"


    // $ANTLR start "rule__Background__Group__1__Impl"
    // InternalCucumber.g:473:1: rule__Background__Group__1__Impl : ( ( rule__Background__TitleAssignment_1 ) ) ;
    public final void rule__Background__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:477:1: ( ( ( rule__Background__TitleAssignment_1 ) ) )
            // InternalCucumber.g:478:1: ( ( rule__Background__TitleAssignment_1 ) )
            {
            // InternalCucumber.g:478:1: ( ( rule__Background__TitleAssignment_1 ) )
            // InternalCucumber.g:479:2: ( rule__Background__TitleAssignment_1 )
            {
             before(grammarAccess.getBackgroundAccess().getTitleAssignment_1()); 
            // InternalCucumber.g:480:2: ( rule__Background__TitleAssignment_1 )
            // InternalCucumber.g:480:3: rule__Background__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Background__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBackgroundAccess().getTitleAssignment_1()); 

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
    // $ANTLR end "rule__Background__Group__1__Impl"


    // $ANTLR start "rule__Background__Group__2"
    // InternalCucumber.g:488:1: rule__Background__Group__2 : rule__Background__Group__2__Impl rule__Background__Group__3 ;
    public final void rule__Background__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:492:1: ( rule__Background__Group__2__Impl rule__Background__Group__3 )
            // InternalCucumber.g:493:2: rule__Background__Group__2__Impl rule__Background__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Background__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Background__Group__3();

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
    // $ANTLR end "rule__Background__Group__2"


    // $ANTLR start "rule__Background__Group__2__Impl"
    // InternalCucumber.g:500:1: rule__Background__Group__2__Impl : ( ( rule__Background__DescriptionAssignment_2 ) ) ;
    public final void rule__Background__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:504:1: ( ( ( rule__Background__DescriptionAssignment_2 ) ) )
            // InternalCucumber.g:505:1: ( ( rule__Background__DescriptionAssignment_2 ) )
            {
            // InternalCucumber.g:505:1: ( ( rule__Background__DescriptionAssignment_2 ) )
            // InternalCucumber.g:506:2: ( rule__Background__DescriptionAssignment_2 )
            {
             before(grammarAccess.getBackgroundAccess().getDescriptionAssignment_2()); 
            // InternalCucumber.g:507:2: ( rule__Background__DescriptionAssignment_2 )
            // InternalCucumber.g:507:3: rule__Background__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Background__DescriptionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBackgroundAccess().getDescriptionAssignment_2()); 

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
    // $ANTLR end "rule__Background__Group__2__Impl"


    // $ANTLR start "rule__Background__Group__3"
    // InternalCucumber.g:515:1: rule__Background__Group__3 : rule__Background__Group__3__Impl ;
    public final void rule__Background__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:519:1: ( rule__Background__Group__3__Impl )
            // InternalCucumber.g:520:2: rule__Background__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Background__Group__3__Impl();

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
    // $ANTLR end "rule__Background__Group__3"


    // $ANTLR start "rule__Background__Group__3__Impl"
    // InternalCucumber.g:526:1: rule__Background__Group__3__Impl : ( ( rule__Background__StepsAssignment_3 )* ) ;
    public final void rule__Background__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:530:1: ( ( ( rule__Background__StepsAssignment_3 )* ) )
            // InternalCucumber.g:531:1: ( ( rule__Background__StepsAssignment_3 )* )
            {
            // InternalCucumber.g:531:1: ( ( rule__Background__StepsAssignment_3 )* )
            // InternalCucumber.g:532:2: ( rule__Background__StepsAssignment_3 )*
            {
             before(grammarAccess.getBackgroundAccess().getStepsAssignment_3()); 
            // InternalCucumber.g:533:2: ( rule__Background__StepsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=9 && LA4_0<=14)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCucumber.g:533:3: rule__Background__StepsAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Background__StepsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getBackgroundAccess().getStepsAssignment_3()); 

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
    // $ANTLR end "rule__Background__Group__3__Impl"


    // $ANTLR start "rule__Scenario__Group__0"
    // InternalCucumber.g:542:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:546:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalCucumber.g:547:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalCucumber.g:554:1: rule__Scenario__Group__0__Impl : ( ruleTags ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:558:1: ( ( ruleTags ) )
            // InternalCucumber.g:559:1: ( ruleTags )
            {
            // InternalCucumber.g:559:1: ( ruleTags )
            // InternalCucumber.g:560:2: ruleTags
            {
             before(grammarAccess.getScenarioAccess().getTagsParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTags();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getTagsParserRuleCall_0()); 

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
    // InternalCucumber.g:569:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:573:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalCucumber.g:574:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalCucumber.g:581:1: rule__Scenario__Group__1__Impl : ( 'Scenario:' ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:585:1: ( ( 'Scenario:' ) )
            // InternalCucumber.g:586:1: ( 'Scenario:' )
            {
            // InternalCucumber.g:586:1: ( 'Scenario:' )
            // InternalCucumber.g:587:2: 'Scenario:'
            {
             before(grammarAccess.getScenarioAccess().getScenarioKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getScenarioKeyword_1()); 

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
    // InternalCucumber.g:596:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:600:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // InternalCucumber.g:601:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalCucumber.g:608:1: rule__Scenario__Group__2__Impl : ( ( rule__Scenario__TitleAssignment_2 ) ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:612:1: ( ( ( rule__Scenario__TitleAssignment_2 ) ) )
            // InternalCucumber.g:613:1: ( ( rule__Scenario__TitleAssignment_2 ) )
            {
            // InternalCucumber.g:613:1: ( ( rule__Scenario__TitleAssignment_2 ) )
            // InternalCucumber.g:614:2: ( rule__Scenario__TitleAssignment_2 )
            {
             before(grammarAccess.getScenarioAccess().getTitleAssignment_2()); 
            // InternalCucumber.g:615:2: ( rule__Scenario__TitleAssignment_2 )
            // InternalCucumber.g:615:3: rule__Scenario__TitleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__TitleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getTitleAssignment_2()); 

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
    // InternalCucumber.g:623:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl rule__Scenario__Group__4 ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:627:1: ( rule__Scenario__Group__3__Impl rule__Scenario__Group__4 )
            // InternalCucumber.g:628:2: rule__Scenario__Group__3__Impl rule__Scenario__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalCucumber.g:635:1: rule__Scenario__Group__3__Impl : ( ( rule__Scenario__DescriptionAssignment_3 ) ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:639:1: ( ( ( rule__Scenario__DescriptionAssignment_3 ) ) )
            // InternalCucumber.g:640:1: ( ( rule__Scenario__DescriptionAssignment_3 ) )
            {
            // InternalCucumber.g:640:1: ( ( rule__Scenario__DescriptionAssignment_3 ) )
            // InternalCucumber.g:641:2: ( rule__Scenario__DescriptionAssignment_3 )
            {
             before(grammarAccess.getScenarioAccess().getDescriptionAssignment_3()); 
            // InternalCucumber.g:642:2: ( rule__Scenario__DescriptionAssignment_3 )
            // InternalCucumber.g:642:3: rule__Scenario__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getDescriptionAssignment_3()); 

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
    // InternalCucumber.g:650:1: rule__Scenario__Group__4 : rule__Scenario__Group__4__Impl ;
    public final void rule__Scenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:654:1: ( rule__Scenario__Group__4__Impl )
            // InternalCucumber.g:655:2: rule__Scenario__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Group__4__Impl();

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
    // InternalCucumber.g:661:1: rule__Scenario__Group__4__Impl : ( ( rule__Scenario__StepsAssignment_4 )* ) ;
    public final void rule__Scenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:665:1: ( ( ( rule__Scenario__StepsAssignment_4 )* ) )
            // InternalCucumber.g:666:1: ( ( rule__Scenario__StepsAssignment_4 )* )
            {
            // InternalCucumber.g:666:1: ( ( rule__Scenario__StepsAssignment_4 )* )
            // InternalCucumber.g:667:2: ( rule__Scenario__StepsAssignment_4 )*
            {
             before(grammarAccess.getScenarioAccess().getStepsAssignment_4()); 
            // InternalCucumber.g:668:2: ( rule__Scenario__StepsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=9 && LA5_0<=14)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCucumber.g:668:3: rule__Scenario__StepsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Scenario__StepsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getStepsAssignment_4()); 

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


    // $ANTLR start "rule__Step__Group__0"
    // InternalCucumber.g:677:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:681:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // InternalCucumber.g:682:2: rule__Step__Group__0__Impl rule__Step__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalCucumber.g:689:1: rule__Step__Group__0__Impl : ( ( rule__Step__KeywordAssignment_0 ) ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:693:1: ( ( ( rule__Step__KeywordAssignment_0 ) ) )
            // InternalCucumber.g:694:1: ( ( rule__Step__KeywordAssignment_0 ) )
            {
            // InternalCucumber.g:694:1: ( ( rule__Step__KeywordAssignment_0 ) )
            // InternalCucumber.g:695:2: ( rule__Step__KeywordAssignment_0 )
            {
             before(grammarAccess.getStepAccess().getKeywordAssignment_0()); 
            // InternalCucumber.g:696:2: ( rule__Step__KeywordAssignment_0 )
            // InternalCucumber.g:696:3: rule__Step__KeywordAssignment_0
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
    // InternalCucumber.g:704:1: rule__Step__Group__1 : rule__Step__Group__1__Impl ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:708:1: ( rule__Step__Group__1__Impl )
            // InternalCucumber.g:709:2: rule__Step__Group__1__Impl
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
    // InternalCucumber.g:715:1: rule__Step__Group__1__Impl : ( ( rule__Step__TitleAssignment_1 ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:719:1: ( ( ( rule__Step__TitleAssignment_1 ) ) )
            // InternalCucumber.g:720:1: ( ( rule__Step__TitleAssignment_1 ) )
            {
            // InternalCucumber.g:720:1: ( ( rule__Step__TitleAssignment_1 ) )
            // InternalCucumber.g:721:2: ( rule__Step__TitleAssignment_1 )
            {
             before(grammarAccess.getStepAccess().getTitleAssignment_1()); 
            // InternalCucumber.g:722:2: ( rule__Step__TitleAssignment_1 )
            // InternalCucumber.g:722:3: rule__Step__TitleAssignment_1
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
    // InternalCucumber.g:731:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:735:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalCucumber.g:736:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalCucumber.g:743:1: rule__Description__Group__0__Impl : ( () ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:747:1: ( ( () ) )
            // InternalCucumber.g:748:1: ( () )
            {
            // InternalCucumber.g:748:1: ( () )
            // InternalCucumber.g:749:2: ()
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionAction_0()); 
            // InternalCucumber.g:750:2: ()
            // InternalCucumber.g:750:3: 
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
    // InternalCucumber.g:758:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:762:1: ( rule__Description__Group__1__Impl )
            // InternalCucumber.g:763:2: rule__Description__Group__1__Impl
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
    // InternalCucumber.g:769:1: rule__Description__Group__1__Impl : ( ( rule__Description__SentencesAssignment_1 )* ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:773:1: ( ( ( rule__Description__SentencesAssignment_1 )* ) )
            // InternalCucumber.g:774:1: ( ( rule__Description__SentencesAssignment_1 )* )
            {
            // InternalCucumber.g:774:1: ( ( rule__Description__SentencesAssignment_1 )* )
            // InternalCucumber.g:775:2: ( rule__Description__SentencesAssignment_1 )*
            {
             before(grammarAccess.getDescriptionAccess().getSentencesAssignment_1()); 
            // InternalCucumber.g:776:2: ( rule__Description__SentencesAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_WORD) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCucumber.g:776:3: rule__Description__SentencesAssignment_1
            	    {
            	    pushFollow(FOLLOW_10);
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


    // $ANTLR start "rule__Tags__Group__0"
    // InternalCucumber.g:785:1: rule__Tags__Group__0 : rule__Tags__Group__0__Impl rule__Tags__Group__1 ;
    public final void rule__Tags__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:789:1: ( rule__Tags__Group__0__Impl rule__Tags__Group__1 )
            // InternalCucumber.g:790:2: rule__Tags__Group__0__Impl rule__Tags__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Tags__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tags__Group__1();

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
    // $ANTLR end "rule__Tags__Group__0"


    // $ANTLR start "rule__Tags__Group__0__Impl"
    // InternalCucumber.g:797:1: rule__Tags__Group__0__Impl : ( ( RULE_TAG )* ) ;
    public final void rule__Tags__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:801:1: ( ( ( RULE_TAG )* ) )
            // InternalCucumber.g:802:1: ( ( RULE_TAG )* )
            {
            // InternalCucumber.g:802:1: ( ( RULE_TAG )* )
            // InternalCucumber.g:803:2: ( RULE_TAG )*
            {
             before(grammarAccess.getTagsAccess().getTAGTerminalRuleCall_0()); 
            // InternalCucumber.g:804:2: ( RULE_TAG )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_TAG) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCucumber.g:804:3: RULE_TAG
            	    {
            	    match(input,RULE_TAG,FOLLOW_12); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getTagsAccess().getTAGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Tags__Group__0__Impl"


    // $ANTLR start "rule__Tags__Group__1"
    // InternalCucumber.g:812:1: rule__Tags__Group__1 : rule__Tags__Group__1__Impl ;
    public final void rule__Tags__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:816:1: ( rule__Tags__Group__1__Impl )
            // InternalCucumber.g:817:2: rule__Tags__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tags__Group__1__Impl();

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
    // $ANTLR end "rule__Tags__Group__1"


    // $ANTLR start "rule__Tags__Group__1__Impl"
    // InternalCucumber.g:823:1: rule__Tags__Group__1__Impl : ( ( RULE_EOL )? ) ;
    public final void rule__Tags__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:827:1: ( ( ( RULE_EOL )? ) )
            // InternalCucumber.g:828:1: ( ( RULE_EOL )? )
            {
            // InternalCucumber.g:828:1: ( ( RULE_EOL )? )
            // InternalCucumber.g:829:2: ( RULE_EOL )?
            {
             before(grammarAccess.getTagsAccess().getEOLTerminalRuleCall_1()); 
            // InternalCucumber.g:830:2: ( RULE_EOL )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_EOL) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCucumber.g:830:3: RULE_EOL
                    {
                    match(input,RULE_EOL,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getTagsAccess().getEOLTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Tags__Group__1__Impl"


    // $ANTLR start "rule__Sentence__Group__0"
    // InternalCucumber.g:839:1: rule__Sentence__Group__0 : rule__Sentence__Group__0__Impl rule__Sentence__Group__1 ;
    public final void rule__Sentence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:843:1: ( rule__Sentence__Group__0__Impl rule__Sentence__Group__1 )
            // InternalCucumber.g:844:2: rule__Sentence__Group__0__Impl rule__Sentence__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalCucumber.g:851:1: rule__Sentence__Group__0__Impl : ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) ) ;
    public final void rule__Sentence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:855:1: ( ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) ) )
            // InternalCucumber.g:856:1: ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) )
            {
            // InternalCucumber.g:856:1: ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) )
            // InternalCucumber.g:857:2: ( ( RULE_WORD ) ) ( ( RULE_WORD )* )
            {
            // InternalCucumber.g:857:2: ( ( RULE_WORD ) )
            // InternalCucumber.g:858:3: ( RULE_WORD )
            {
             before(grammarAccess.getSentenceAccess().getWORDTerminalRuleCall_0()); 
            // InternalCucumber.g:859:3: ( RULE_WORD )
            // InternalCucumber.g:859:4: RULE_WORD
            {
            match(input,RULE_WORD,FOLLOW_10); 

            }

             after(grammarAccess.getSentenceAccess().getWORDTerminalRuleCall_0()); 

            }

            // InternalCucumber.g:862:2: ( ( RULE_WORD )* )
            // InternalCucumber.g:863:3: ( RULE_WORD )*
            {
             before(grammarAccess.getSentenceAccess().getWORDTerminalRuleCall_0()); 
            // InternalCucumber.g:864:3: ( RULE_WORD )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_WORD) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCucumber.g:864:4: RULE_WORD
            	    {
            	    match(input,RULE_WORD,FOLLOW_10); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalCucumber.g:873:1: rule__Sentence__Group__1 : rule__Sentence__Group__1__Impl ;
    public final void rule__Sentence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:877:1: ( rule__Sentence__Group__1__Impl )
            // InternalCucumber.g:878:2: rule__Sentence__Group__1__Impl
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
    // InternalCucumber.g:884:1: rule__Sentence__Group__1__Impl : ( ( RULE_EOL )? ) ;
    public final void rule__Sentence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:888:1: ( ( ( RULE_EOL )? ) )
            // InternalCucumber.g:889:1: ( ( RULE_EOL )? )
            {
            // InternalCucumber.g:889:1: ( ( RULE_EOL )? )
            // InternalCucumber.g:890:2: ( RULE_EOL )?
            {
             before(grammarAccess.getSentenceAccess().getEOLTerminalRuleCall_1()); 
            // InternalCucumber.g:891:2: ( RULE_EOL )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_EOL) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCucumber.g:891:3: RULE_EOL
                    {
                    match(input,RULE_EOL,FOLLOW_2); 

                    }
                    break;

            }

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


    // $ANTLR start "rule__Feature__TitleAssignment_2"
    // InternalCucumber.g:900:1: rule__Feature__TitleAssignment_2 : ( ruleSentence ) ;
    public final void rule__Feature__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:904:1: ( ( ruleSentence ) )
            // InternalCucumber.g:905:2: ( ruleSentence )
            {
            // InternalCucumber.g:905:2: ( ruleSentence )
            // InternalCucumber.g:906:3: ruleSentence
            {
             before(grammarAccess.getFeatureAccess().getTitleSentenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getTitleSentenceParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Feature__TitleAssignment_2"


    // $ANTLR start "rule__Feature__DescriptionAssignment_3"
    // InternalCucumber.g:915:1: rule__Feature__DescriptionAssignment_3 : ( ruleDescription ) ;
    public final void rule__Feature__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:919:1: ( ( ruleDescription ) )
            // InternalCucumber.g:920:2: ( ruleDescription )
            {
            // InternalCucumber.g:920:2: ( ruleDescription )
            // InternalCucumber.g:921:3: ruleDescription
            {
             before(grammarAccess.getFeatureAccess().getDescriptionDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getDescriptionDescriptionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Feature__DescriptionAssignment_3"


    // $ANTLR start "rule__Feature__BackgroundAssignment_4"
    // InternalCucumber.g:930:1: rule__Feature__BackgroundAssignment_4 : ( ruleBackground ) ;
    public final void rule__Feature__BackgroundAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:934:1: ( ( ruleBackground ) )
            // InternalCucumber.g:935:2: ( ruleBackground )
            {
            // InternalCucumber.g:935:2: ( ruleBackground )
            // InternalCucumber.g:936:3: ruleBackground
            {
             before(grammarAccess.getFeatureAccess().getBackgroundBackgroundParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBackground();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getBackgroundBackgroundParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Feature__BackgroundAssignment_4"


    // $ANTLR start "rule__Feature__ScenariosAssignment_5"
    // InternalCucumber.g:945:1: rule__Feature__ScenariosAssignment_5 : ( ruleScenario ) ;
    public final void rule__Feature__ScenariosAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:949:1: ( ( ruleScenario ) )
            // InternalCucumber.g:950:2: ( ruleScenario )
            {
            // InternalCucumber.g:950:2: ( ruleScenario )
            // InternalCucumber.g:951:3: ruleScenario
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


    // $ANTLR start "rule__Background__TitleAssignment_1"
    // InternalCucumber.g:960:1: rule__Background__TitleAssignment_1 : ( ruleSentence ) ;
    public final void rule__Background__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:964:1: ( ( ruleSentence ) )
            // InternalCucumber.g:965:2: ( ruleSentence )
            {
            // InternalCucumber.g:965:2: ( ruleSentence )
            // InternalCucumber.g:966:3: ruleSentence
            {
             before(grammarAccess.getBackgroundAccess().getTitleSentenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getTitleSentenceParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Background__TitleAssignment_1"


    // $ANTLR start "rule__Background__DescriptionAssignment_2"
    // InternalCucumber.g:975:1: rule__Background__DescriptionAssignment_2 : ( ruleDescription ) ;
    public final void rule__Background__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:979:1: ( ( ruleDescription ) )
            // InternalCucumber.g:980:2: ( ruleDescription )
            {
            // InternalCucumber.g:980:2: ( ruleDescription )
            // InternalCucumber.g:981:3: ruleDescription
            {
             before(grammarAccess.getBackgroundAccess().getDescriptionDescriptionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getDescriptionDescriptionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Background__DescriptionAssignment_2"


    // $ANTLR start "rule__Background__StepsAssignment_3"
    // InternalCucumber.g:990:1: rule__Background__StepsAssignment_3 : ( ruleStep ) ;
    public final void rule__Background__StepsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:994:1: ( ( ruleStep ) )
            // InternalCucumber.g:995:2: ( ruleStep )
            {
            // InternalCucumber.g:995:2: ( ruleStep )
            // InternalCucumber.g:996:3: ruleStep
            {
             before(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Background__StepsAssignment_3"


    // $ANTLR start "rule__Scenario__TitleAssignment_2"
    // InternalCucumber.g:1005:1: rule__Scenario__TitleAssignment_2 : ( ruleSentence ) ;
    public final void rule__Scenario__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1009:1: ( ( ruleSentence ) )
            // InternalCucumber.g:1010:2: ( ruleSentence )
            {
            // InternalCucumber.g:1010:2: ( ruleSentence )
            // InternalCucumber.g:1011:3: ruleSentence
            {
             before(grammarAccess.getScenarioAccess().getTitleSentenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getTitleSentenceParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Scenario__TitleAssignment_2"


    // $ANTLR start "rule__Scenario__DescriptionAssignment_3"
    // InternalCucumber.g:1020:1: rule__Scenario__DescriptionAssignment_3 : ( ruleDescription ) ;
    public final void rule__Scenario__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1024:1: ( ( ruleDescription ) )
            // InternalCucumber.g:1025:2: ( ruleDescription )
            {
            // InternalCucumber.g:1025:2: ( ruleDescription )
            // InternalCucumber.g:1026:3: ruleDescription
            {
             before(grammarAccess.getScenarioAccess().getDescriptionDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getDescriptionDescriptionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Scenario__DescriptionAssignment_3"


    // $ANTLR start "rule__Scenario__StepsAssignment_4"
    // InternalCucumber.g:1035:1: rule__Scenario__StepsAssignment_4 : ( ruleStep ) ;
    public final void rule__Scenario__StepsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1039:1: ( ( ruleStep ) )
            // InternalCucumber.g:1040:2: ( ruleStep )
            {
            // InternalCucumber.g:1040:2: ( ruleStep )
            // InternalCucumber.g:1041:3: ruleStep
            {
             before(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Scenario__StepsAssignment_4"


    // $ANTLR start "rule__Step__KeywordAssignment_0"
    // InternalCucumber.g:1050:1: rule__Step__KeywordAssignment_0 : ( ( rule__Step__KeywordAlternatives_0_0 ) ) ;
    public final void rule__Step__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1054:1: ( ( ( rule__Step__KeywordAlternatives_0_0 ) ) )
            // InternalCucumber.g:1055:2: ( ( rule__Step__KeywordAlternatives_0_0 ) )
            {
            // InternalCucumber.g:1055:2: ( ( rule__Step__KeywordAlternatives_0_0 ) )
            // InternalCucumber.g:1056:3: ( rule__Step__KeywordAlternatives_0_0 )
            {
             before(grammarAccess.getStepAccess().getKeywordAlternatives_0_0()); 
            // InternalCucumber.g:1057:3: ( rule__Step__KeywordAlternatives_0_0 )
            // InternalCucumber.g:1057:4: rule__Step__KeywordAlternatives_0_0
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
    // InternalCucumber.g:1065:1: rule__Step__TitleAssignment_1 : ( ruleSentence ) ;
    public final void rule__Step__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1069:1: ( ( ruleSentence ) )
            // InternalCucumber.g:1070:2: ( ruleSentence )
            {
            // InternalCucumber.g:1070:2: ( ruleSentence )
            // InternalCucumber.g:1071:3: ruleSentence
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
    // InternalCucumber.g:1080:1: rule__Description__SentencesAssignment_1 : ( ruleSentence ) ;
    public final void rule__Description__SentencesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1084:1: ( ( ruleSentence ) )
            // InternalCucumber.g:1085:2: ( ruleSentence )
            {
            // InternalCucumber.g:1085:2: ( ruleSentence )
            // InternalCucumber.g:1086:3: ruleSentence
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000007E00L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000007E02L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});

}
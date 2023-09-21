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
    // InternalCucumber.g:137:1: ruleDescription : ( ( ( rule__Description__SentencesAssignment ) ) ( ( rule__Description__SentencesAssignment )* ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:141:2: ( ( ( ( rule__Description__SentencesAssignment ) ) ( ( rule__Description__SentencesAssignment )* ) ) )
            // InternalCucumber.g:142:2: ( ( ( rule__Description__SentencesAssignment ) ) ( ( rule__Description__SentencesAssignment )* ) )
            {
            // InternalCucumber.g:142:2: ( ( ( rule__Description__SentencesAssignment ) ) ( ( rule__Description__SentencesAssignment )* ) )
            // InternalCucumber.g:143:3: ( ( rule__Description__SentencesAssignment ) ) ( ( rule__Description__SentencesAssignment )* )
            {
            // InternalCucumber.g:143:3: ( ( rule__Description__SentencesAssignment ) )
            // InternalCucumber.g:144:4: ( rule__Description__SentencesAssignment )
            {
             before(grammarAccess.getDescriptionAccess().getSentencesAssignment()); 
            // InternalCucumber.g:145:4: ( rule__Description__SentencesAssignment )
            // InternalCucumber.g:145:5: rule__Description__SentencesAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Description__SentencesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getSentencesAssignment()); 

            }

            // InternalCucumber.g:148:3: ( ( rule__Description__SentencesAssignment )* )
            // InternalCucumber.g:149:4: ( rule__Description__SentencesAssignment )*
            {
             before(grammarAccess.getDescriptionAccess().getSentencesAssignment()); 
            // InternalCucumber.g:150:4: ( rule__Description__SentencesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_WORD) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCucumber.g:150:5: rule__Description__SentencesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Description__SentencesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDescriptionAccess().getSentencesAssignment()); 

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
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleTag"
    // InternalCucumber.g:160:1: entryRuleTag : ruleTag EOF ;
    public final void entryRuleTag() throws RecognitionException {
        try {
            // InternalCucumber.g:161:1: ( ruleTag EOF )
            // InternalCucumber.g:162:1: ruleTag EOF
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
    // InternalCucumber.g:169:1: ruleTag : ( ( rule__Tag__Group__0 ) ) ;
    public final void ruleTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:173:2: ( ( ( rule__Tag__Group__0 ) ) )
            // InternalCucumber.g:174:2: ( ( rule__Tag__Group__0 ) )
            {
            // InternalCucumber.g:174:2: ( ( rule__Tag__Group__0 ) )
            // InternalCucumber.g:175:3: ( rule__Tag__Group__0 )
            {
             before(grammarAccess.getTagAccess().getGroup()); 
            // InternalCucumber.g:176:3: ( rule__Tag__Group__0 )
            // InternalCucumber.g:176:4: rule__Tag__Group__0
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
    // InternalCucumber.g:185:1: entryRuleSentence : ruleSentence EOF ;
    public final void entryRuleSentence() throws RecognitionException {
        try {
            // InternalCucumber.g:186:1: ( ruleSentence EOF )
            // InternalCucumber.g:187:1: ruleSentence EOF
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
    // InternalCucumber.g:194:1: ruleSentence : ( ( rule__Sentence__Group__0 ) ) ;
    public final void ruleSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:198:2: ( ( ( rule__Sentence__Group__0 ) ) )
            // InternalCucumber.g:199:2: ( ( rule__Sentence__Group__0 ) )
            {
            // InternalCucumber.g:199:2: ( ( rule__Sentence__Group__0 ) )
            // InternalCucumber.g:200:3: ( rule__Sentence__Group__0 )
            {
             before(grammarAccess.getSentenceAccess().getGroup()); 
            // InternalCucumber.g:201:3: ( rule__Sentence__Group__0 )
            // InternalCucumber.g:201:4: rule__Sentence__Group__0
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
    // InternalCucumber.g:209:1: rule__Step__KeywordAlternatives_0_0 : ( ( 'Given' ) | ( 'When' ) | ( 'Then' ) | ( 'And' ) | ( 'But' ) | ( '*' ) );
    public final void rule__Step__KeywordAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:213:1: ( ( 'Given' ) | ( 'When' ) | ( 'Then' ) | ( 'And' ) | ( 'But' ) | ( '*' ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 8:
                {
                alt2=1;
                }
                break;
            case 9:
                {
                alt2=2;
                }
                break;
            case 10:
                {
                alt2=3;
                }
                break;
            case 11:
                {
                alt2=4;
                }
                break;
            case 12:
                {
                alt2=5;
                }
                break;
            case 13:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCucumber.g:214:2: ( 'Given' )
                    {
                    // InternalCucumber.g:214:2: ( 'Given' )
                    // InternalCucumber.g:215:3: 'Given'
                    {
                     before(grammarAccess.getStepAccess().getKeywordGivenKeyword_0_0_0()); 
                    match(input,8,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getKeywordGivenKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:220:2: ( 'When' )
                    {
                    // InternalCucumber.g:220:2: ( 'When' )
                    // InternalCucumber.g:221:3: 'When'
                    {
                     before(grammarAccess.getStepAccess().getKeywordWhenKeyword_0_0_1()); 
                    match(input,9,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getKeywordWhenKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCucumber.g:226:2: ( 'Then' )
                    {
                    // InternalCucumber.g:226:2: ( 'Then' )
                    // InternalCucumber.g:227:3: 'Then'
                    {
                     before(grammarAccess.getStepAccess().getKeywordThenKeyword_0_0_2()); 
                    match(input,10,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getKeywordThenKeyword_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCucumber.g:232:2: ( 'And' )
                    {
                    // InternalCucumber.g:232:2: ( 'And' )
                    // InternalCucumber.g:233:3: 'And'
                    {
                     before(grammarAccess.getStepAccess().getKeywordAndKeyword_0_0_3()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getKeywordAndKeyword_0_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCucumber.g:238:2: ( 'But' )
                    {
                    // InternalCucumber.g:238:2: ( 'But' )
                    // InternalCucumber.g:239:3: 'But'
                    {
                     before(grammarAccess.getStepAccess().getKeywordButKeyword_0_0_4()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getKeywordButKeyword_0_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCucumber.g:244:2: ( '*' )
                    {
                    // InternalCucumber.g:244:2: ( '*' )
                    // InternalCucumber.g:245:3: '*'
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
    // InternalCucumber.g:254:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:258:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalCucumber.g:259:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalCucumber.g:266:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__TagsAssignment_0 )* ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:270:1: ( ( ( rule__Feature__TagsAssignment_0 )* ) )
            // InternalCucumber.g:271:1: ( ( rule__Feature__TagsAssignment_0 )* )
            {
            // InternalCucumber.g:271:1: ( ( rule__Feature__TagsAssignment_0 )* )
            // InternalCucumber.g:272:2: ( rule__Feature__TagsAssignment_0 )*
            {
             before(grammarAccess.getFeatureAccess().getTagsAssignment_0()); 
            // InternalCucumber.g:273:2: ( rule__Feature__TagsAssignment_0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCucumber.g:273:3: rule__Feature__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Feature__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalCucumber.g:281:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:285:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalCucumber.g:286:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalCucumber.g:293:1: rule__Feature__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:297:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:298:1: ( RULE_EOL )
            {
            // InternalCucumber.g:298:1: ( RULE_EOL )
            // InternalCucumber.g:299:2: RULE_EOL
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
    // InternalCucumber.g:308:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:312:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalCucumber.g:313:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalCucumber.g:320:1: rule__Feature__Group__2__Impl : ( 'Feature:' ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:324:1: ( ( 'Feature:' ) )
            // InternalCucumber.g:325:1: ( 'Feature:' )
            {
            // InternalCucumber.g:325:1: ( 'Feature:' )
            // InternalCucumber.g:326:2: 'Feature:'
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
    // InternalCucumber.g:335:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:339:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalCucumber.g:340:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalCucumber.g:347:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__TitleAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:351:1: ( ( ( rule__Feature__TitleAssignment_3 ) ) )
            // InternalCucumber.g:352:1: ( ( rule__Feature__TitleAssignment_3 ) )
            {
            // InternalCucumber.g:352:1: ( ( rule__Feature__TitleAssignment_3 ) )
            // InternalCucumber.g:353:2: ( rule__Feature__TitleAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getTitleAssignment_3()); 
            // InternalCucumber.g:354:2: ( rule__Feature__TitleAssignment_3 )
            // InternalCucumber.g:354:3: rule__Feature__TitleAssignment_3
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
    // InternalCucumber.g:362:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:366:1: ( rule__Feature__Group__4__Impl )
            // InternalCucumber.g:367:2: rule__Feature__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__4__Impl();

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
    // InternalCucumber.g:373:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__ScenariosAssignment_4 )* ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:377:1: ( ( ( rule__Feature__ScenariosAssignment_4 )* ) )
            // InternalCucumber.g:378:1: ( ( rule__Feature__ScenariosAssignment_4 )* )
            {
            // InternalCucumber.g:378:1: ( ( rule__Feature__ScenariosAssignment_4 )* )
            // InternalCucumber.g:379:2: ( rule__Feature__ScenariosAssignment_4 )*
            {
             before(grammarAccess.getFeatureAccess().getScenariosAssignment_4()); 
            // InternalCucumber.g:380:2: ( rule__Feature__ScenariosAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCucumber.g:380:3: rule__Feature__ScenariosAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Feature__ScenariosAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getScenariosAssignment_4()); 

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


    // $ANTLR start "rule__Scenario__Group__0"
    // InternalCucumber.g:389:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:393:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalCucumber.g:394:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
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
    // InternalCucumber.g:401:1: rule__Scenario__Group__0__Impl : ( 'Scenario:' ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:405:1: ( ( 'Scenario:' ) )
            // InternalCucumber.g:406:1: ( 'Scenario:' )
            {
            // InternalCucumber.g:406:1: ( 'Scenario:' )
            // InternalCucumber.g:407:2: 'Scenario:'
            {
             before(grammarAccess.getScenarioAccess().getScenarioKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getScenarioKeyword_0()); 

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
    // InternalCucumber.g:416:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:420:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalCucumber.g:421:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalCucumber.g:428:1: rule__Scenario__Group__1__Impl : ( ( rule__Scenario__TitleAssignment_1 ) ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:432:1: ( ( ( rule__Scenario__TitleAssignment_1 ) ) )
            // InternalCucumber.g:433:1: ( ( rule__Scenario__TitleAssignment_1 ) )
            {
            // InternalCucumber.g:433:1: ( ( rule__Scenario__TitleAssignment_1 ) )
            // InternalCucumber.g:434:2: ( rule__Scenario__TitleAssignment_1 )
            {
             before(grammarAccess.getScenarioAccess().getTitleAssignment_1()); 
            // InternalCucumber.g:435:2: ( rule__Scenario__TitleAssignment_1 )
            // InternalCucumber.g:435:3: rule__Scenario__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getTitleAssignment_1()); 

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
    // InternalCucumber.g:443:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:447:1: ( rule__Scenario__Group__2__Impl )
            // InternalCucumber.g:448:2: rule__Scenario__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Group__2__Impl();

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
    // InternalCucumber.g:454:1: rule__Scenario__Group__2__Impl : ( ( rule__Scenario__StepsAssignment_2 )* ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:458:1: ( ( ( rule__Scenario__StepsAssignment_2 )* ) )
            // InternalCucumber.g:459:1: ( ( rule__Scenario__StepsAssignment_2 )* )
            {
            // InternalCucumber.g:459:1: ( ( rule__Scenario__StepsAssignment_2 )* )
            // InternalCucumber.g:460:2: ( rule__Scenario__StepsAssignment_2 )*
            {
             before(grammarAccess.getScenarioAccess().getStepsAssignment_2()); 
            // InternalCucumber.g:461:2: ( rule__Scenario__StepsAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=8 && LA5_0<=13)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCucumber.g:461:3: rule__Scenario__StepsAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Scenario__StepsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getStepsAssignment_2()); 

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


    // $ANTLR start "rule__Step__Group__0"
    // InternalCucumber.g:470:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:474:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // InternalCucumber.g:475:2: rule__Step__Group__0__Impl rule__Step__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCucumber.g:482:1: rule__Step__Group__0__Impl : ( ( rule__Step__KeywordAssignment_0 ) ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:486:1: ( ( ( rule__Step__KeywordAssignment_0 ) ) )
            // InternalCucumber.g:487:1: ( ( rule__Step__KeywordAssignment_0 ) )
            {
            // InternalCucumber.g:487:1: ( ( rule__Step__KeywordAssignment_0 ) )
            // InternalCucumber.g:488:2: ( rule__Step__KeywordAssignment_0 )
            {
             before(grammarAccess.getStepAccess().getKeywordAssignment_0()); 
            // InternalCucumber.g:489:2: ( rule__Step__KeywordAssignment_0 )
            // InternalCucumber.g:489:3: rule__Step__KeywordAssignment_0
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
    // InternalCucumber.g:497:1: rule__Step__Group__1 : rule__Step__Group__1__Impl ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:501:1: ( rule__Step__Group__1__Impl )
            // InternalCucumber.g:502:2: rule__Step__Group__1__Impl
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
    // InternalCucumber.g:508:1: rule__Step__Group__1__Impl : ( ( rule__Step__TitleAssignment_1 ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:512:1: ( ( ( rule__Step__TitleAssignment_1 ) ) )
            // InternalCucumber.g:513:1: ( ( rule__Step__TitleAssignment_1 ) )
            {
            // InternalCucumber.g:513:1: ( ( rule__Step__TitleAssignment_1 ) )
            // InternalCucumber.g:514:2: ( rule__Step__TitleAssignment_1 )
            {
             before(grammarAccess.getStepAccess().getTitleAssignment_1()); 
            // InternalCucumber.g:515:2: ( rule__Step__TitleAssignment_1 )
            // InternalCucumber.g:515:3: rule__Step__TitleAssignment_1
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


    // $ANTLR start "rule__Tag__Group__0"
    // InternalCucumber.g:524:1: rule__Tag__Group__0 : rule__Tag__Group__0__Impl rule__Tag__Group__1 ;
    public final void rule__Tag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:528:1: ( rule__Tag__Group__0__Impl rule__Tag__Group__1 )
            // InternalCucumber.g:529:2: rule__Tag__Group__0__Impl rule__Tag__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalCucumber.g:536:1: rule__Tag__Group__0__Impl : ( ( rule__Tag__TitleAssignment_0 ) ) ;
    public final void rule__Tag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:540:1: ( ( ( rule__Tag__TitleAssignment_0 ) ) )
            // InternalCucumber.g:541:1: ( ( rule__Tag__TitleAssignment_0 ) )
            {
            // InternalCucumber.g:541:1: ( ( rule__Tag__TitleAssignment_0 ) )
            // InternalCucumber.g:542:2: ( rule__Tag__TitleAssignment_0 )
            {
             before(grammarAccess.getTagAccess().getTitleAssignment_0()); 
            // InternalCucumber.g:543:2: ( rule__Tag__TitleAssignment_0 )
            // InternalCucumber.g:543:3: rule__Tag__TitleAssignment_0
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
    // InternalCucumber.g:551:1: rule__Tag__Group__1 : rule__Tag__Group__1__Impl rule__Tag__Group__2 ;
    public final void rule__Tag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:555:1: ( rule__Tag__Group__1__Impl rule__Tag__Group__2 )
            // InternalCucumber.g:556:2: rule__Tag__Group__1__Impl rule__Tag__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalCucumber.g:563:1: rule__Tag__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__Tag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:567:1: ( ( RULE_ID ) )
            // InternalCucumber.g:568:1: ( RULE_ID )
            {
            // InternalCucumber.g:568:1: ( RULE_ID )
            // InternalCucumber.g:569:2: RULE_ID
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
    // InternalCucumber.g:578:1: rule__Tag__Group__2 : rule__Tag__Group__2__Impl ;
    public final void rule__Tag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:582:1: ( rule__Tag__Group__2__Impl )
            // InternalCucumber.g:583:2: rule__Tag__Group__2__Impl
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
    // InternalCucumber.g:589:1: rule__Tag__Group__2__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Tag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:593:1: ( ( ( RULE_WS )? ) )
            // InternalCucumber.g:594:1: ( ( RULE_WS )? )
            {
            // InternalCucumber.g:594:1: ( ( RULE_WS )? )
            // InternalCucumber.g:595:2: ( RULE_WS )?
            {
             before(grammarAccess.getTagAccess().getWSTerminalRuleCall_2()); 
            // InternalCucumber.g:596:2: ( RULE_WS )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_WS) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCucumber.g:596:3: RULE_WS
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
    // InternalCucumber.g:605:1: rule__Sentence__Group__0 : rule__Sentence__Group__0__Impl rule__Sentence__Group__1 ;
    public final void rule__Sentence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:609:1: ( rule__Sentence__Group__0__Impl rule__Sentence__Group__1 )
            // InternalCucumber.g:610:2: rule__Sentence__Group__0__Impl rule__Sentence__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalCucumber.g:617:1: rule__Sentence__Group__0__Impl : ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) ) ;
    public final void rule__Sentence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:621:1: ( ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) ) )
            // InternalCucumber.g:622:1: ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) )
            {
            // InternalCucumber.g:622:1: ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) )
            // InternalCucumber.g:623:2: ( ( RULE_WORD ) ) ( ( RULE_WORD )* )
            {
            // InternalCucumber.g:623:2: ( ( RULE_WORD ) )
            // InternalCucumber.g:624:3: ( RULE_WORD )
            {
             before(grammarAccess.getSentenceAccess().getWORDTerminalRuleCall_0()); 
            // InternalCucumber.g:625:3: ( RULE_WORD )
            // InternalCucumber.g:625:4: RULE_WORD
            {
            match(input,RULE_WORD,FOLLOW_3); 

            }

             after(grammarAccess.getSentenceAccess().getWORDTerminalRuleCall_0()); 

            }

            // InternalCucumber.g:628:2: ( ( RULE_WORD )* )
            // InternalCucumber.g:629:3: ( RULE_WORD )*
            {
             before(grammarAccess.getSentenceAccess().getWORDTerminalRuleCall_0()); 
            // InternalCucumber.g:630:3: ( RULE_WORD )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_WORD) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCucumber.g:630:4: RULE_WORD
            	    {
            	    match(input,RULE_WORD,FOLLOW_3); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalCucumber.g:639:1: rule__Sentence__Group__1 : rule__Sentence__Group__1__Impl ;
    public final void rule__Sentence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:643:1: ( rule__Sentence__Group__1__Impl )
            // InternalCucumber.g:644:2: rule__Sentence__Group__1__Impl
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
    // InternalCucumber.g:650:1: rule__Sentence__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Sentence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:654:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:655:1: ( RULE_EOL )
            {
            // InternalCucumber.g:655:1: ( RULE_EOL )
            // InternalCucumber.g:656:2: RULE_EOL
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
    // InternalCucumber.g:666:1: rule__Feature__TagsAssignment_0 : ( ruleTag ) ;
    public final void rule__Feature__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:670:1: ( ( ruleTag ) )
            // InternalCucumber.g:671:2: ( ruleTag )
            {
            // InternalCucumber.g:671:2: ( ruleTag )
            // InternalCucumber.g:672:3: ruleTag
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
    // InternalCucumber.g:681:1: rule__Feature__TitleAssignment_3 : ( ruleDescription ) ;
    public final void rule__Feature__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:685:1: ( ( ruleDescription ) )
            // InternalCucumber.g:686:2: ( ruleDescription )
            {
            // InternalCucumber.g:686:2: ( ruleDescription )
            // InternalCucumber.g:687:3: ruleDescription
            {
             before(grammarAccess.getFeatureAccess().getTitleDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getTitleDescriptionParserRuleCall_3_0()); 

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


    // $ANTLR start "rule__Feature__ScenariosAssignment_4"
    // InternalCucumber.g:696:1: rule__Feature__ScenariosAssignment_4 : ( ruleScenario ) ;
    public final void rule__Feature__ScenariosAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:700:1: ( ( ruleScenario ) )
            // InternalCucumber.g:701:2: ( ruleScenario )
            {
            // InternalCucumber.g:701:2: ( ruleScenario )
            // InternalCucumber.g:702:3: ruleScenario
            {
             before(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Feature__ScenariosAssignment_4"


    // $ANTLR start "rule__Scenario__TitleAssignment_1"
    // InternalCucumber.g:711:1: rule__Scenario__TitleAssignment_1 : ( ruleDescription ) ;
    public final void rule__Scenario__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:715:1: ( ( ruleDescription ) )
            // InternalCucumber.g:716:2: ( ruleDescription )
            {
            // InternalCucumber.g:716:2: ( ruleDescription )
            // InternalCucumber.g:717:3: ruleDescription
            {
             before(grammarAccess.getScenarioAccess().getTitleDescriptionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getTitleDescriptionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Scenario__TitleAssignment_1"


    // $ANTLR start "rule__Scenario__StepsAssignment_2"
    // InternalCucumber.g:726:1: rule__Scenario__StepsAssignment_2 : ( ruleStep ) ;
    public final void rule__Scenario__StepsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:730:1: ( ( ruleStep ) )
            // InternalCucumber.g:731:2: ( ruleStep )
            {
            // InternalCucumber.g:731:2: ( ruleStep )
            // InternalCucumber.g:732:3: ruleStep
            {
             before(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Scenario__StepsAssignment_2"


    // $ANTLR start "rule__Step__KeywordAssignment_0"
    // InternalCucumber.g:741:1: rule__Step__KeywordAssignment_0 : ( ( rule__Step__KeywordAlternatives_0_0 ) ) ;
    public final void rule__Step__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:745:1: ( ( ( rule__Step__KeywordAlternatives_0_0 ) ) )
            // InternalCucumber.g:746:2: ( ( rule__Step__KeywordAlternatives_0_0 ) )
            {
            // InternalCucumber.g:746:2: ( ( rule__Step__KeywordAlternatives_0_0 ) )
            // InternalCucumber.g:747:3: ( rule__Step__KeywordAlternatives_0_0 )
            {
             before(grammarAccess.getStepAccess().getKeywordAlternatives_0_0()); 
            // InternalCucumber.g:748:3: ( rule__Step__KeywordAlternatives_0_0 )
            // InternalCucumber.g:748:4: rule__Step__KeywordAlternatives_0_0
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
    // InternalCucumber.g:756:1: rule__Step__TitleAssignment_1 : ( ruleSentence ) ;
    public final void rule__Step__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:760:1: ( ( ruleSentence ) )
            // InternalCucumber.g:761:2: ( ruleSentence )
            {
            // InternalCucumber.g:761:2: ( ruleSentence )
            // InternalCucumber.g:762:3: ruleSentence
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


    // $ANTLR start "rule__Description__SentencesAssignment"
    // InternalCucumber.g:771:1: rule__Description__SentencesAssignment : ( ruleSentence ) ;
    public final void rule__Description__SentencesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:775:1: ( ( ruleSentence ) )
            // InternalCucumber.g:776:2: ( ruleSentence )
            {
            // InternalCucumber.g:776:2: ( ruleSentence )
            // InternalCucumber.g:777:3: ruleSentence
            {
             before(grammarAccess.getDescriptionAccess().getSentencesSentenceParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getDescriptionAccess().getSentencesSentenceParserRuleCall_0()); 

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
    // $ANTLR end "rule__Description__SentencesAssignment"


    // $ANTLR start "rule__Tag__TitleAssignment_0"
    // InternalCucumber.g:786:1: rule__Tag__TitleAssignment_0 : ( ( '@' ) ) ;
    public final void rule__Tag__TitleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:790:1: ( ( ( '@' ) ) )
            // InternalCucumber.g:791:2: ( ( '@' ) )
            {
            // InternalCucumber.g:791:2: ( ( '@' ) )
            // InternalCucumber.g:792:3: ( '@' )
            {
             before(grammarAccess.getTagAccess().getTitleCommercialAtKeyword_0_0()); 
            // InternalCucumber.g:793:3: ( '@' )
            // InternalCucumber.g:794:4: '@'
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000003F00L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000003F02L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});

}
package org.farhan.mbt.ide.contentassist.antlr.internal;

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
import org.farhan.mbt.services.SheepDogGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSheepDogParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WORD", "RULE_ID", "RULE_STRING", "RULE_EOL", "RULE_WS", "RULE_SL_COMMENT", "'='", "'[background=\"true\"]'", "'=='", "'[examples=\"true\"]'", "'==='", "'[tags=\"'", "'\"]'", "':tags:'", "'Given'", "'When'", "'Then'", "'----'", "'[options=\"header\"]'", "'|==='", "'|'"
    };
    public static final int RULE_WORD=4;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_ID=5;
    public static final int RULE_EOL=7;
    public static final int RULE_WS=8;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSheepDogParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSheepDogParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSheepDogParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSheepDog.g"; }


    	private SheepDogGrammarAccess grammarAccess;

    	public void setGrammarAccess(SheepDogGrammarAccess grammarAccess) {
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
    // InternalSheepDog.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalSheepDog.g:54:1: ( ruleModel EOF )
            // InternalSheepDog.g:55:1: ruleModel EOF
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
    // InternalSheepDog.g:62:1: ruleModel : ( ( rule__Model__Alternatives ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:66:2: ( ( ( rule__Model__Alternatives ) ) )
            // InternalSheepDog.g:67:2: ( ( rule__Model__Alternatives ) )
            {
            // InternalSheepDog.g:67:2: ( ( rule__Model__Alternatives ) )
            // InternalSheepDog.g:68:3: ( rule__Model__Alternatives )
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // InternalSheepDog.g:69:3: ( rule__Model__Alternatives )
            // InternalSheepDog.g:69:4: rule__Model__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Model__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleFeature"
    // InternalSheepDog.g:78:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalSheepDog.g:79:1: ( ruleFeature EOF )
            // InternalSheepDog.g:80:1: ruleFeature EOF
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
    // InternalSheepDog.g:87:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:91:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalSheepDog.g:92:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalSheepDog.g:92:2: ( ( rule__Feature__Group__0 ) )
            // InternalSheepDog.g:93:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalSheepDog.g:94:3: ( rule__Feature__Group__0 )
            // InternalSheepDog.g:94:4: rule__Feature__Group__0
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
    // InternalSheepDog.g:103:1: entryRuleBackground : ruleBackground EOF ;
    public final void entryRuleBackground() throws RecognitionException {
        try {
            // InternalSheepDog.g:104:1: ( ruleBackground EOF )
            // InternalSheepDog.g:105:1: ruleBackground EOF
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
    // InternalSheepDog.g:112:1: ruleBackground : ( ( rule__Background__Group__0 ) ) ;
    public final void ruleBackground() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:116:2: ( ( ( rule__Background__Group__0 ) ) )
            // InternalSheepDog.g:117:2: ( ( rule__Background__Group__0 ) )
            {
            // InternalSheepDog.g:117:2: ( ( rule__Background__Group__0 ) )
            // InternalSheepDog.g:118:3: ( rule__Background__Group__0 )
            {
             before(grammarAccess.getBackgroundAccess().getGroup()); 
            // InternalSheepDog.g:119:3: ( rule__Background__Group__0 )
            // InternalSheepDog.g:119:4: rule__Background__Group__0
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
    // InternalSheepDog.g:128:1: entryRuleScenario : ruleScenario EOF ;
    public final void entryRuleScenario() throws RecognitionException {
        try {
            // InternalSheepDog.g:129:1: ( ruleScenario EOF )
            // InternalSheepDog.g:130:1: ruleScenario EOF
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
    // InternalSheepDog.g:137:1: ruleScenario : ( ( rule__Scenario__Group__0 ) ) ;
    public final void ruleScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:141:2: ( ( ( rule__Scenario__Group__0 ) ) )
            // InternalSheepDog.g:142:2: ( ( rule__Scenario__Group__0 ) )
            {
            // InternalSheepDog.g:142:2: ( ( rule__Scenario__Group__0 ) )
            // InternalSheepDog.g:143:3: ( rule__Scenario__Group__0 )
            {
             before(grammarAccess.getScenarioAccess().getGroup()); 
            // InternalSheepDog.g:144:3: ( rule__Scenario__Group__0 )
            // InternalSheepDog.g:144:4: rule__Scenario__Group__0
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


    // $ANTLR start "entryRuleExamples"
    // InternalSheepDog.g:153:1: entryRuleExamples : ruleExamples EOF ;
    public final void entryRuleExamples() throws RecognitionException {
        try {
            // InternalSheepDog.g:154:1: ( ruleExamples EOF )
            // InternalSheepDog.g:155:1: ruleExamples EOF
            {
             before(grammarAccess.getExamplesRule()); 
            pushFollow(FOLLOW_1);
            ruleExamples();

            state._fsp--;

             after(grammarAccess.getExamplesRule()); 
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
    // $ANTLR end "entryRuleExamples"


    // $ANTLR start "ruleExamples"
    // InternalSheepDog.g:162:1: ruleExamples : ( ( rule__Examples__Group__0 ) ) ;
    public final void ruleExamples() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:166:2: ( ( ( rule__Examples__Group__0 ) ) )
            // InternalSheepDog.g:167:2: ( ( rule__Examples__Group__0 ) )
            {
            // InternalSheepDog.g:167:2: ( ( rule__Examples__Group__0 ) )
            // InternalSheepDog.g:168:3: ( rule__Examples__Group__0 )
            {
             before(grammarAccess.getExamplesAccess().getGroup()); 
            // InternalSheepDog.g:169:3: ( rule__Examples__Group__0 )
            // InternalSheepDog.g:169:4: rule__Examples__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Examples__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExamplesAccess().getGroup()); 

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
    // $ANTLR end "ruleExamples"


    // $ANTLR start "entryRuleScenarioTags"
    // InternalSheepDog.g:178:1: entryRuleScenarioTags : ruleScenarioTags EOF ;
    public final void entryRuleScenarioTags() throws RecognitionException {
        try {
            // InternalSheepDog.g:179:1: ( ruleScenarioTags EOF )
            // InternalSheepDog.g:180:1: ruleScenarioTags EOF
            {
             before(grammarAccess.getScenarioTagsRule()); 
            pushFollow(FOLLOW_1);
            ruleScenarioTags();

            state._fsp--;

             after(grammarAccess.getScenarioTagsRule()); 
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
    // $ANTLR end "entryRuleScenarioTags"


    // $ANTLR start "ruleScenarioTags"
    // InternalSheepDog.g:187:1: ruleScenarioTags : ( ( rule__ScenarioTags__Group__0 ) ) ;
    public final void ruleScenarioTags() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:191:2: ( ( ( rule__ScenarioTags__Group__0 ) ) )
            // InternalSheepDog.g:192:2: ( ( rule__ScenarioTags__Group__0 ) )
            {
            // InternalSheepDog.g:192:2: ( ( rule__ScenarioTags__Group__0 ) )
            // InternalSheepDog.g:193:3: ( rule__ScenarioTags__Group__0 )
            {
             before(grammarAccess.getScenarioTagsAccess().getGroup()); 
            // InternalSheepDog.g:194:3: ( rule__ScenarioTags__Group__0 )
            // InternalSheepDog.g:194:4: rule__ScenarioTags__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTags__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioTagsAccess().getGroup()); 

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
    // $ANTLR end "ruleScenarioTags"


    // $ANTLR start "entryRuleFeatureTags"
    // InternalSheepDog.g:203:1: entryRuleFeatureTags : ruleFeatureTags EOF ;
    public final void entryRuleFeatureTags() throws RecognitionException {
        try {
            // InternalSheepDog.g:204:1: ( ruleFeatureTags EOF )
            // InternalSheepDog.g:205:1: ruleFeatureTags EOF
            {
             before(grammarAccess.getFeatureTagsRule()); 
            pushFollow(FOLLOW_1);
            ruleFeatureTags();

            state._fsp--;

             after(grammarAccess.getFeatureTagsRule()); 
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
    // $ANTLR end "entryRuleFeatureTags"


    // $ANTLR start "ruleFeatureTags"
    // InternalSheepDog.g:212:1: ruleFeatureTags : ( ( rule__FeatureTags__Group__0 ) ) ;
    public final void ruleFeatureTags() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:216:2: ( ( ( rule__FeatureTags__Group__0 ) ) )
            // InternalSheepDog.g:217:2: ( ( rule__FeatureTags__Group__0 ) )
            {
            // InternalSheepDog.g:217:2: ( ( rule__FeatureTags__Group__0 ) )
            // InternalSheepDog.g:218:3: ( rule__FeatureTags__Group__0 )
            {
             before(grammarAccess.getFeatureTagsAccess().getGroup()); 
            // InternalSheepDog.g:219:3: ( rule__FeatureTags__Group__0 )
            // InternalSheepDog.g:219:4: rule__FeatureTags__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureTags__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureTagsAccess().getGroup()); 

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
    // $ANTLR end "ruleFeatureTags"


    // $ANTLR start "entryRuleStep"
    // InternalSheepDog.g:228:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalSheepDog.g:229:1: ( ruleStep EOF )
            // InternalSheepDog.g:230:1: ruleStep EOF
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
    // InternalSheepDog.g:237:1: ruleStep : ( ( rule__Step__Alternatives ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:241:2: ( ( ( rule__Step__Alternatives ) ) )
            // InternalSheepDog.g:242:2: ( ( rule__Step__Alternatives ) )
            {
            // InternalSheepDog.g:242:2: ( ( rule__Step__Alternatives ) )
            // InternalSheepDog.g:243:3: ( rule__Step__Alternatives )
            {
             before(grammarAccess.getStepAccess().getAlternatives()); 
            // InternalSheepDog.g:244:3: ( rule__Step__Alternatives )
            // InternalSheepDog.g:244:4: rule__Step__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Step__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleGiven"
    // InternalSheepDog.g:253:1: entryRuleGiven : ruleGiven EOF ;
    public final void entryRuleGiven() throws RecognitionException {
        try {
            // InternalSheepDog.g:254:1: ( ruleGiven EOF )
            // InternalSheepDog.g:255:1: ruleGiven EOF
            {
             before(grammarAccess.getGivenRule()); 
            pushFollow(FOLLOW_1);
            ruleGiven();

            state._fsp--;

             after(grammarAccess.getGivenRule()); 
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
    // $ANTLR end "entryRuleGiven"


    // $ANTLR start "ruleGiven"
    // InternalSheepDog.g:262:1: ruleGiven : ( ( rule__Given__Group__0 ) ) ;
    public final void ruleGiven() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:266:2: ( ( ( rule__Given__Group__0 ) ) )
            // InternalSheepDog.g:267:2: ( ( rule__Given__Group__0 ) )
            {
            // InternalSheepDog.g:267:2: ( ( rule__Given__Group__0 ) )
            // InternalSheepDog.g:268:3: ( rule__Given__Group__0 )
            {
             before(grammarAccess.getGivenAccess().getGroup()); 
            // InternalSheepDog.g:269:3: ( rule__Given__Group__0 )
            // InternalSheepDog.g:269:4: rule__Given__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Given__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGivenAccess().getGroup()); 

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
    // $ANTLR end "ruleGiven"


    // $ANTLR start "entryRuleWhen"
    // InternalSheepDog.g:278:1: entryRuleWhen : ruleWhen EOF ;
    public final void entryRuleWhen() throws RecognitionException {
        try {
            // InternalSheepDog.g:279:1: ( ruleWhen EOF )
            // InternalSheepDog.g:280:1: ruleWhen EOF
            {
             before(grammarAccess.getWhenRule()); 
            pushFollow(FOLLOW_1);
            ruleWhen();

            state._fsp--;

             after(grammarAccess.getWhenRule()); 
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
    // $ANTLR end "entryRuleWhen"


    // $ANTLR start "ruleWhen"
    // InternalSheepDog.g:287:1: ruleWhen : ( ( rule__When__Group__0 ) ) ;
    public final void ruleWhen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:291:2: ( ( ( rule__When__Group__0 ) ) )
            // InternalSheepDog.g:292:2: ( ( rule__When__Group__0 ) )
            {
            // InternalSheepDog.g:292:2: ( ( rule__When__Group__0 ) )
            // InternalSheepDog.g:293:3: ( rule__When__Group__0 )
            {
             before(grammarAccess.getWhenAccess().getGroup()); 
            // InternalSheepDog.g:294:3: ( rule__When__Group__0 )
            // InternalSheepDog.g:294:4: rule__When__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__When__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhenAccess().getGroup()); 

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
    // $ANTLR end "ruleWhen"


    // $ANTLR start "entryRuleThen"
    // InternalSheepDog.g:303:1: entryRuleThen : ruleThen EOF ;
    public final void entryRuleThen() throws RecognitionException {
        try {
            // InternalSheepDog.g:304:1: ( ruleThen EOF )
            // InternalSheepDog.g:305:1: ruleThen EOF
            {
             before(grammarAccess.getThenRule()); 
            pushFollow(FOLLOW_1);
            ruleThen();

            state._fsp--;

             after(grammarAccess.getThenRule()); 
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
    // $ANTLR end "entryRuleThen"


    // $ANTLR start "ruleThen"
    // InternalSheepDog.g:312:1: ruleThen : ( ( rule__Then__Group__0 ) ) ;
    public final void ruleThen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:316:2: ( ( ( rule__Then__Group__0 ) ) )
            // InternalSheepDog.g:317:2: ( ( rule__Then__Group__0 ) )
            {
            // InternalSheepDog.g:317:2: ( ( rule__Then__Group__0 ) )
            // InternalSheepDog.g:318:3: ( rule__Then__Group__0 )
            {
             before(grammarAccess.getThenAccess().getGroup()); 
            // InternalSheepDog.g:319:3: ( rule__Then__Group__0 )
            // InternalSheepDog.g:319:4: rule__Then__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Then__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getThenAccess().getGroup()); 

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
    // $ANTLR end "ruleThen"


    // $ANTLR start "entryRuleDocString"
    // InternalSheepDog.g:328:1: entryRuleDocString : ruleDocString EOF ;
    public final void entryRuleDocString() throws RecognitionException {
        try {
            // InternalSheepDog.g:329:1: ( ruleDocString EOF )
            // InternalSheepDog.g:330:1: ruleDocString EOF
            {
             before(grammarAccess.getDocStringRule()); 
            pushFollow(FOLLOW_1);
            ruleDocString();

            state._fsp--;

             after(grammarAccess.getDocStringRule()); 
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
    // $ANTLR end "entryRuleDocString"


    // $ANTLR start "ruleDocString"
    // InternalSheepDog.g:337:1: ruleDocString : ( ( rule__DocString__Group__0 ) ) ;
    public final void ruleDocString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:341:2: ( ( ( rule__DocString__Group__0 ) ) )
            // InternalSheepDog.g:342:2: ( ( rule__DocString__Group__0 ) )
            {
            // InternalSheepDog.g:342:2: ( ( rule__DocString__Group__0 ) )
            // InternalSheepDog.g:343:3: ( rule__DocString__Group__0 )
            {
             before(grammarAccess.getDocStringAccess().getGroup()); 
            // InternalSheepDog.g:344:3: ( rule__DocString__Group__0 )
            // InternalSheepDog.g:344:4: rule__DocString__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DocString__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDocStringAccess().getGroup()); 

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
    // $ANTLR end "ruleDocString"


    // $ANTLR start "entryRuleLine"
    // InternalSheepDog.g:353:1: entryRuleLine : ruleLine EOF ;
    public final void entryRuleLine() throws RecognitionException {
        try {
            // InternalSheepDog.g:354:1: ( ruleLine EOF )
            // InternalSheepDog.g:355:1: ruleLine EOF
            {
             before(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_1);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getLineRule()); 
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
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // InternalSheepDog.g:362:1: ruleLine : ( ( rule__Line__Group__0 ) ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:366:2: ( ( ( rule__Line__Group__0 ) ) )
            // InternalSheepDog.g:367:2: ( ( rule__Line__Group__0 ) )
            {
            // InternalSheepDog.g:367:2: ( ( rule__Line__Group__0 ) )
            // InternalSheepDog.g:368:3: ( rule__Line__Group__0 )
            {
             before(grammarAccess.getLineAccess().getGroup()); 
            // InternalSheepDog.g:369:3: ( rule__Line__Group__0 )
            // InternalSheepDog.g:369:4: rule__Line__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Line__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getGroup()); 

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
    // $ANTLR end "ruleLine"


    // $ANTLR start "entryRuleLineBits"
    // InternalSheepDog.g:378:1: entryRuleLineBits : ruleLineBits EOF ;
    public final void entryRuleLineBits() throws RecognitionException {
        try {
            // InternalSheepDog.g:379:1: ( ruleLineBits EOF )
            // InternalSheepDog.g:380:1: ruleLineBits EOF
            {
             before(grammarAccess.getLineBitsRule()); 
            pushFollow(FOLLOW_1);
            ruleLineBits();

            state._fsp--;

             after(grammarAccess.getLineBitsRule()); 
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
    // $ANTLR end "entryRuleLineBits"


    // $ANTLR start "ruleLineBits"
    // InternalSheepDog.g:387:1: ruleLineBits : ( ( ruleTEXT_LITERAL )* ) ;
    public final void ruleLineBits() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:391:2: ( ( ( ruleTEXT_LITERAL )* ) )
            // InternalSheepDog.g:392:2: ( ( ruleTEXT_LITERAL )* )
            {
            // InternalSheepDog.g:392:2: ( ( ruleTEXT_LITERAL )* )
            // InternalSheepDog.g:393:3: ( ruleTEXT_LITERAL )*
            {
             before(grammarAccess.getLineBitsAccess().getTEXT_LITERALParserRuleCall()); 
            // InternalSheepDog.g:394:3: ( ruleTEXT_LITERAL )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_WORD && LA1_0<=RULE_STRING)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSheepDog.g:394:4: ruleTEXT_LITERAL
            	    {
            	    pushFollow(FOLLOW_3);
            	    ruleTEXT_LITERAL();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getLineBitsAccess().getTEXT_LITERALParserRuleCall()); 

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
    // $ANTLR end "ruleLineBits"


    // $ANTLR start "entryRuleTable"
    // InternalSheepDog.g:403:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalSheepDog.g:404:1: ( ruleTable EOF )
            // InternalSheepDog.g:405:1: ruleTable EOF
            {
             before(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getTableRule()); 
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
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalSheepDog.g:412:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:416:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalSheepDog.g:417:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalSheepDog.g:417:2: ( ( rule__Table__Group__0 ) )
            // InternalSheepDog.g:418:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalSheepDog.g:419:3: ( rule__Table__Group__0 )
            // InternalSheepDog.g:419:4: rule__Table__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getGroup()); 

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
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleRow"
    // InternalSheepDog.g:428:1: entryRuleRow : ruleRow EOF ;
    public final void entryRuleRow() throws RecognitionException {
        try {
            // InternalSheepDog.g:429:1: ( ruleRow EOF )
            // InternalSheepDog.g:430:1: ruleRow EOF
            {
             before(grammarAccess.getRowRule()); 
            pushFollow(FOLLOW_1);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getRowRule()); 
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
    // $ANTLR end "entryRuleRow"


    // $ANTLR start "ruleRow"
    // InternalSheepDog.g:437:1: ruleRow : ( ( rule__Row__Group__0 ) ) ;
    public final void ruleRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:441:2: ( ( ( rule__Row__Group__0 ) ) )
            // InternalSheepDog.g:442:2: ( ( rule__Row__Group__0 ) )
            {
            // InternalSheepDog.g:442:2: ( ( rule__Row__Group__0 ) )
            // InternalSheepDog.g:443:3: ( rule__Row__Group__0 )
            {
             before(grammarAccess.getRowAccess().getGroup()); 
            // InternalSheepDog.g:444:3: ( rule__Row__Group__0 )
            // InternalSheepDog.g:444:4: rule__Row__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getGroup()); 

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
    // $ANTLR end "ruleRow"


    // $ANTLR start "entryRuleCell"
    // InternalSheepDog.g:453:1: entryRuleCell : ruleCell EOF ;
    public final void entryRuleCell() throws RecognitionException {
        try {
            // InternalSheepDog.g:454:1: ( ruleCell EOF )
            // InternalSheepDog.g:455:1: ruleCell EOF
            {
             before(grammarAccess.getCellRule()); 
            pushFollow(FOLLOW_1);
            ruleCell();

            state._fsp--;

             after(grammarAccess.getCellRule()); 
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
    // $ANTLR end "entryRuleCell"


    // $ANTLR start "ruleCell"
    // InternalSheepDog.g:462:1: ruleCell : ( ( rule__Cell__Group__0 ) ) ;
    public final void ruleCell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:466:2: ( ( ( rule__Cell__Group__0 ) ) )
            // InternalSheepDog.g:467:2: ( ( rule__Cell__Group__0 ) )
            {
            // InternalSheepDog.g:467:2: ( ( rule__Cell__Group__0 ) )
            // InternalSheepDog.g:468:3: ( rule__Cell__Group__0 )
            {
             before(grammarAccess.getCellAccess().getGroup()); 
            // InternalSheepDog.g:469:3: ( rule__Cell__Group__0 )
            // InternalSheepDog.g:469:4: rule__Cell__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cell__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getGroup()); 

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
    // $ANTLR end "ruleCell"


    // $ANTLR start "entryRuleStatement"
    // InternalSheepDog.g:478:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalSheepDog.g:479:1: ( ruleStatement EOF )
            // InternalSheepDog.g:480:1: ruleStatement EOF
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
    // InternalSheepDog.g:487:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:491:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalSheepDog.g:492:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalSheepDog.g:492:2: ( ( rule__Statement__Group__0 ) )
            // InternalSheepDog.g:493:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalSheepDog.g:494:3: ( rule__Statement__Group__0 )
            // InternalSheepDog.g:494:4: rule__Statement__Group__0
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
    // InternalSheepDog.g:503:1: entryRulePhrase : rulePhrase EOF ;
    public final void entryRulePhrase() throws RecognitionException {
        try {
            // InternalSheepDog.g:504:1: ( rulePhrase EOF )
            // InternalSheepDog.g:505:1: rulePhrase EOF
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
    // InternalSheepDog.g:512:1: rulePhrase : ( ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* ) ) ;
    public final void rulePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:516:2: ( ( ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* ) ) )
            // InternalSheepDog.g:517:2: ( ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* ) )
            {
            // InternalSheepDog.g:517:2: ( ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* ) )
            // InternalSheepDog.g:518:3: ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* )
            {
            // InternalSheepDog.g:518:3: ( ( ruleTEXT_LITERAL ) )
            // InternalSheepDog.g:519:4: ( ruleTEXT_LITERAL )
            {
             before(grammarAccess.getPhraseAccess().getTEXT_LITERALParserRuleCall()); 
            // InternalSheepDog.g:520:4: ( ruleTEXT_LITERAL )
            // InternalSheepDog.g:520:5: ruleTEXT_LITERAL
            {
            pushFollow(FOLLOW_4);
            ruleTEXT_LITERAL();

            state._fsp--;


            }

             after(grammarAccess.getPhraseAccess().getTEXT_LITERALParserRuleCall()); 

            }

            // InternalSheepDog.g:523:3: ( ( ruleTEXT_LITERAL )* )
            // InternalSheepDog.g:524:4: ( ruleTEXT_LITERAL )*
            {
             before(grammarAccess.getPhraseAccess().getTEXT_LITERALParserRuleCall()); 
            // InternalSheepDog.g:525:4: ( ruleTEXT_LITERAL )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_WORD && LA2_0<=RULE_STRING)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSheepDog.g:525:5: ruleTEXT_LITERAL
            	    {
            	    pushFollow(FOLLOW_3);
            	    ruleTEXT_LITERAL();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getPhraseAccess().getTEXT_LITERALParserRuleCall()); 

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


    // $ANTLR start "entryRuleTEXT_LITERAL"
    // InternalSheepDog.g:535:1: entryRuleTEXT_LITERAL : ruleTEXT_LITERAL EOF ;
    public final void entryRuleTEXT_LITERAL() throws RecognitionException {
        try {
            // InternalSheepDog.g:536:1: ( ruleTEXT_LITERAL EOF )
            // InternalSheepDog.g:537:1: ruleTEXT_LITERAL EOF
            {
             before(grammarAccess.getTEXT_LITERALRule()); 
            pushFollow(FOLLOW_1);
            ruleTEXT_LITERAL();

            state._fsp--;

             after(grammarAccess.getTEXT_LITERALRule()); 
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
    // $ANTLR end "entryRuleTEXT_LITERAL"


    // $ANTLR start "ruleTEXT_LITERAL"
    // InternalSheepDog.g:544:1: ruleTEXT_LITERAL : ( ( rule__TEXT_LITERAL__Alternatives ) ) ;
    public final void ruleTEXT_LITERAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:548:2: ( ( ( rule__TEXT_LITERAL__Alternatives ) ) )
            // InternalSheepDog.g:549:2: ( ( rule__TEXT_LITERAL__Alternatives ) )
            {
            // InternalSheepDog.g:549:2: ( ( rule__TEXT_LITERAL__Alternatives ) )
            // InternalSheepDog.g:550:3: ( rule__TEXT_LITERAL__Alternatives )
            {
             before(grammarAccess.getTEXT_LITERALAccess().getAlternatives()); 
            // InternalSheepDog.g:551:3: ( rule__TEXT_LITERAL__Alternatives )
            // InternalSheepDog.g:551:4: rule__TEXT_LITERAL__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TEXT_LITERAL__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTEXT_LITERALAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTEXT_LITERAL"


    // $ANTLR start "entryRuleStepObject"
    // InternalSheepDog.g:560:1: entryRuleStepObject : ruleStepObject EOF ;
    public final void entryRuleStepObject() throws RecognitionException {
        try {
            // InternalSheepDog.g:561:1: ( ruleStepObject EOF )
            // InternalSheepDog.g:562:1: ruleStepObject EOF
            {
             before(grammarAccess.getStepObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleStepObject();

            state._fsp--;

             after(grammarAccess.getStepObjectRule()); 
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
    // $ANTLR end "entryRuleStepObject"


    // $ANTLR start "ruleStepObject"
    // InternalSheepDog.g:569:1: ruleStepObject : ( ( rule__StepObject__Group__0 ) ) ;
    public final void ruleStepObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:573:2: ( ( ( rule__StepObject__Group__0 ) ) )
            // InternalSheepDog.g:574:2: ( ( rule__StepObject__Group__0 ) )
            {
            // InternalSheepDog.g:574:2: ( ( rule__StepObject__Group__0 ) )
            // InternalSheepDog.g:575:3: ( rule__StepObject__Group__0 )
            {
             before(grammarAccess.getStepObjectAccess().getGroup()); 
            // InternalSheepDog.g:576:3: ( rule__StepObject__Group__0 )
            // InternalSheepDog.g:576:4: rule__StepObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StepObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStepObjectAccess().getGroup()); 

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
    // $ANTLR end "ruleStepObject"


    // $ANTLR start "entryRuleStepDefinition"
    // InternalSheepDog.g:585:1: entryRuleStepDefinition : ruleStepDefinition EOF ;
    public final void entryRuleStepDefinition() throws RecognitionException {
        try {
            // InternalSheepDog.g:586:1: ( ruleStepDefinition EOF )
            // InternalSheepDog.g:587:1: ruleStepDefinition EOF
            {
             before(grammarAccess.getStepDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleStepDefinition();

            state._fsp--;

             after(grammarAccess.getStepDefinitionRule()); 
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
    // $ANTLR end "entryRuleStepDefinition"


    // $ANTLR start "ruleStepDefinition"
    // InternalSheepDog.g:594:1: ruleStepDefinition : ( ( rule__StepDefinition__Group__0 ) ) ;
    public final void ruleStepDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:598:2: ( ( ( rule__StepDefinition__Group__0 ) ) )
            // InternalSheepDog.g:599:2: ( ( rule__StepDefinition__Group__0 ) )
            {
            // InternalSheepDog.g:599:2: ( ( rule__StepDefinition__Group__0 ) )
            // InternalSheepDog.g:600:3: ( rule__StepDefinition__Group__0 )
            {
             before(grammarAccess.getStepDefinitionAccess().getGroup()); 
            // InternalSheepDog.g:601:3: ( rule__StepDefinition__Group__0 )
            // InternalSheepDog.g:601:4: rule__StepDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StepDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStepDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleStepDefinition"


    // $ANTLR start "entryRuleStepParameters"
    // InternalSheepDog.g:610:1: entryRuleStepParameters : ruleStepParameters EOF ;
    public final void entryRuleStepParameters() throws RecognitionException {
        try {
            // InternalSheepDog.g:611:1: ( ruleStepParameters EOF )
            // InternalSheepDog.g:612:1: ruleStepParameters EOF
            {
             before(grammarAccess.getStepParametersRule()); 
            pushFollow(FOLLOW_1);
            ruleStepParameters();

            state._fsp--;

             after(grammarAccess.getStepParametersRule()); 
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
    // $ANTLR end "entryRuleStepParameters"


    // $ANTLR start "ruleStepParameters"
    // InternalSheepDog.g:619:1: ruleStepParameters : ( ( rule__StepParameters__Group__0 ) ) ;
    public final void ruleStepParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:623:2: ( ( ( rule__StepParameters__Group__0 ) ) )
            // InternalSheepDog.g:624:2: ( ( rule__StepParameters__Group__0 ) )
            {
            // InternalSheepDog.g:624:2: ( ( rule__StepParameters__Group__0 ) )
            // InternalSheepDog.g:625:3: ( rule__StepParameters__Group__0 )
            {
             before(grammarAccess.getStepParametersAccess().getGroup()); 
            // InternalSheepDog.g:626:3: ( rule__StepParameters__Group__0 )
            // InternalSheepDog.g:626:4: rule__StepParameters__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StepParameters__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStepParametersAccess().getGroup()); 

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
    // $ANTLR end "ruleStepParameters"


    // $ANTLR start "rule__Model__Alternatives"
    // InternalSheepDog.g:634:1: rule__Model__Alternatives : ( ( ruleStepObject ) | ( ruleFeature ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:638:1: ( ( ruleStepObject ) | ( ruleFeature ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalSheepDog.g:639:2: ( ruleStepObject )
                    {
                    // InternalSheepDog.g:639:2: ( ruleStepObject )
                    // InternalSheepDog.g:640:3: ruleStepObject
                    {
                     before(grammarAccess.getModelAccess().getStepObjectParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStepObject();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getStepObjectParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSheepDog.g:645:2: ( ruleFeature )
                    {
                    // InternalSheepDog.g:645:2: ( ruleFeature )
                    // InternalSheepDog.g:646:3: ruleFeature
                    {
                     before(grammarAccess.getModelAccess().getFeatureParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFeature();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getFeatureParserRuleCall_1()); 

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
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__Step__Alternatives"
    // InternalSheepDog.g:655:1: rule__Step__Alternatives : ( ( ruleGiven ) | ( ruleWhen ) | ( ruleThen ) );
    public final void rule__Step__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:659:1: ( ( ruleGiven ) | ( ruleWhen ) | ( ruleThen ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                switch ( input.LA(2) ) {
                case 18:
                    {
                    alt4=1;
                    }
                    break;
                case 19:
                    {
                    alt4=2;
                    }
                    break;
                case 20:
                    {
                    alt4=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSheepDog.g:660:2: ( ruleGiven )
                    {
                    // InternalSheepDog.g:660:2: ( ruleGiven )
                    // InternalSheepDog.g:661:3: ruleGiven
                    {
                     before(grammarAccess.getStepAccess().getGivenParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGiven();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getGivenParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSheepDog.g:666:2: ( ruleWhen )
                    {
                    // InternalSheepDog.g:666:2: ( ruleWhen )
                    // InternalSheepDog.g:667:3: ruleWhen
                    {
                     before(grammarAccess.getStepAccess().getWhenParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWhen();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getWhenParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSheepDog.g:672:2: ( ruleThen )
                    {
                    // InternalSheepDog.g:672:2: ( ruleThen )
                    // InternalSheepDog.g:673:3: ruleThen
                    {
                     before(grammarAccess.getStepAccess().getThenParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleThen();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getThenParserRuleCall_2()); 

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
    // $ANTLR end "rule__Step__Alternatives"


    // $ANTLR start "rule__Given__Alternatives_4"
    // InternalSheepDog.g:682:1: rule__Given__Alternatives_4 : ( ( ( rule__Given__TheStepTableAssignment_4_0 ) ) | ( ( rule__Given__TheDocStringAssignment_4_1 ) ) );
    public final void rule__Given__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:686:1: ( ( ( rule__Given__TheStepTableAssignment_4_0 ) ) | ( ( rule__Given__TheDocStringAssignment_4_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            else if ( (LA5_0==21) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSheepDog.g:687:2: ( ( rule__Given__TheStepTableAssignment_4_0 ) )
                    {
                    // InternalSheepDog.g:687:2: ( ( rule__Given__TheStepTableAssignment_4_0 ) )
                    // InternalSheepDog.g:688:3: ( rule__Given__TheStepTableAssignment_4_0 )
                    {
                     before(grammarAccess.getGivenAccess().getTheStepTableAssignment_4_0()); 
                    // InternalSheepDog.g:689:3: ( rule__Given__TheStepTableAssignment_4_0 )
                    // InternalSheepDog.g:689:4: rule__Given__TheStepTableAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Given__TheStepTableAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGivenAccess().getTheStepTableAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSheepDog.g:693:2: ( ( rule__Given__TheDocStringAssignment_4_1 ) )
                    {
                    // InternalSheepDog.g:693:2: ( ( rule__Given__TheDocStringAssignment_4_1 ) )
                    // InternalSheepDog.g:694:3: ( rule__Given__TheDocStringAssignment_4_1 )
                    {
                     before(grammarAccess.getGivenAccess().getTheDocStringAssignment_4_1()); 
                    // InternalSheepDog.g:695:3: ( rule__Given__TheDocStringAssignment_4_1 )
                    // InternalSheepDog.g:695:4: rule__Given__TheDocStringAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Given__TheDocStringAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGivenAccess().getTheDocStringAssignment_4_1()); 

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
    // $ANTLR end "rule__Given__Alternatives_4"


    // $ANTLR start "rule__When__Alternatives_4"
    // InternalSheepDog.g:703:1: rule__When__Alternatives_4 : ( ( ( rule__When__TheStepTableAssignment_4_0 ) ) | ( ( rule__When__TheDocStringAssignment_4_1 ) ) );
    public final void rule__When__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:707:1: ( ( ( rule__When__TheStepTableAssignment_4_0 ) ) | ( ( rule__When__TheDocStringAssignment_4_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSheepDog.g:708:2: ( ( rule__When__TheStepTableAssignment_4_0 ) )
                    {
                    // InternalSheepDog.g:708:2: ( ( rule__When__TheStepTableAssignment_4_0 ) )
                    // InternalSheepDog.g:709:3: ( rule__When__TheStepTableAssignment_4_0 )
                    {
                     before(grammarAccess.getWhenAccess().getTheStepTableAssignment_4_0()); 
                    // InternalSheepDog.g:710:3: ( rule__When__TheStepTableAssignment_4_0 )
                    // InternalSheepDog.g:710:4: rule__When__TheStepTableAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__When__TheStepTableAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWhenAccess().getTheStepTableAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSheepDog.g:714:2: ( ( rule__When__TheDocStringAssignment_4_1 ) )
                    {
                    // InternalSheepDog.g:714:2: ( ( rule__When__TheDocStringAssignment_4_1 ) )
                    // InternalSheepDog.g:715:3: ( rule__When__TheDocStringAssignment_4_1 )
                    {
                     before(grammarAccess.getWhenAccess().getTheDocStringAssignment_4_1()); 
                    // InternalSheepDog.g:716:3: ( rule__When__TheDocStringAssignment_4_1 )
                    // InternalSheepDog.g:716:4: rule__When__TheDocStringAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__When__TheDocStringAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getWhenAccess().getTheDocStringAssignment_4_1()); 

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
    // $ANTLR end "rule__When__Alternatives_4"


    // $ANTLR start "rule__Then__Alternatives_4"
    // InternalSheepDog.g:724:1: rule__Then__Alternatives_4 : ( ( ( rule__Then__TheStepTableAssignment_4_0 ) ) | ( ( rule__Then__TheDocStringAssignment_4_1 ) ) );
    public final void rule__Then__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:728:1: ( ( ( rule__Then__TheStepTableAssignment_4_0 ) ) | ( ( rule__Then__TheDocStringAssignment_4_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            else if ( (LA7_0==21) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSheepDog.g:729:2: ( ( rule__Then__TheStepTableAssignment_4_0 ) )
                    {
                    // InternalSheepDog.g:729:2: ( ( rule__Then__TheStepTableAssignment_4_0 ) )
                    // InternalSheepDog.g:730:3: ( rule__Then__TheStepTableAssignment_4_0 )
                    {
                     before(grammarAccess.getThenAccess().getTheStepTableAssignment_4_0()); 
                    // InternalSheepDog.g:731:3: ( rule__Then__TheStepTableAssignment_4_0 )
                    // InternalSheepDog.g:731:4: rule__Then__TheStepTableAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Then__TheStepTableAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getThenAccess().getTheStepTableAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSheepDog.g:735:2: ( ( rule__Then__TheDocStringAssignment_4_1 ) )
                    {
                    // InternalSheepDog.g:735:2: ( ( rule__Then__TheDocStringAssignment_4_1 ) )
                    // InternalSheepDog.g:736:3: ( rule__Then__TheDocStringAssignment_4_1 )
                    {
                     before(grammarAccess.getThenAccess().getTheDocStringAssignment_4_1()); 
                    // InternalSheepDog.g:737:3: ( rule__Then__TheDocStringAssignment_4_1 )
                    // InternalSheepDog.g:737:4: rule__Then__TheDocStringAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Then__TheDocStringAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getThenAccess().getTheDocStringAssignment_4_1()); 

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
    // $ANTLR end "rule__Then__Alternatives_4"


    // $ANTLR start "rule__TEXT_LITERAL__Alternatives"
    // InternalSheepDog.g:745:1: rule__TEXT_LITERAL__Alternatives : ( ( RULE_WORD ) | ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__TEXT_LITERAL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:749:1: ( ( RULE_WORD ) | ( RULE_ID ) | ( RULE_STRING ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                alt8=2;
                }
                break;
            case RULE_STRING:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSheepDog.g:750:2: ( RULE_WORD )
                    {
                    // InternalSheepDog.g:750:2: ( RULE_WORD )
                    // InternalSheepDog.g:751:3: RULE_WORD
                    {
                     before(grammarAccess.getTEXT_LITERALAccess().getWORDTerminalRuleCall_0()); 
                    match(input,RULE_WORD,FOLLOW_2); 
                     after(grammarAccess.getTEXT_LITERALAccess().getWORDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSheepDog.g:756:2: ( RULE_ID )
                    {
                    // InternalSheepDog.g:756:2: ( RULE_ID )
                    // InternalSheepDog.g:757:3: RULE_ID
                    {
                     before(grammarAccess.getTEXT_LITERALAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getTEXT_LITERALAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSheepDog.g:762:2: ( RULE_STRING )
                    {
                    // InternalSheepDog.g:762:2: ( RULE_STRING )
                    // InternalSheepDog.g:763:3: RULE_STRING
                    {
                     before(grammarAccess.getTEXT_LITERALAccess().getSTRINGTerminalRuleCall_2()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getTEXT_LITERALAccess().getSTRINGTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__TEXT_LITERAL__Alternatives"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalSheepDog.g:772:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:776:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalSheepDog.g:777:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSheepDog.g:784:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__TagsAssignment_0 )? ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:788:1: ( ( ( rule__Feature__TagsAssignment_0 )? ) )
            // InternalSheepDog.g:789:1: ( ( rule__Feature__TagsAssignment_0 )? )
            {
            // InternalSheepDog.g:789:1: ( ( rule__Feature__TagsAssignment_0 )? )
            // InternalSheepDog.g:790:2: ( rule__Feature__TagsAssignment_0 )?
            {
             before(grammarAccess.getFeatureAccess().getTagsAssignment_0()); 
            // InternalSheepDog.g:791:2: ( rule__Feature__TagsAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSheepDog.g:791:3: rule__Feature__TagsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__TagsAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

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
    // InternalSheepDog.g:799:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:803:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalSheepDog.g:804:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
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
    // InternalSheepDog.g:811:1: rule__Feature__Group__1__Impl : ( '=' ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:815:1: ( ( '=' ) )
            // InternalSheepDog.g:816:1: ( '=' )
            {
            // InternalSheepDog.g:816:1: ( '=' )
            // InternalSheepDog.g:817:2: '='
            {
             before(grammarAccess.getFeatureAccess().getEqualsSignKeyword_1()); 
            match(input,10,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getEqualsSignKeyword_1()); 

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
    // InternalSheepDog.g:826:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:830:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalSheepDog.g:831:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
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
    // InternalSheepDog.g:838:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__NameAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:842:1: ( ( ( rule__Feature__NameAssignment_2 ) ) )
            // InternalSheepDog.g:843:1: ( ( rule__Feature__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:843:1: ( ( rule__Feature__NameAssignment_2 ) )
            // InternalSheepDog.g:844:2: ( rule__Feature__NameAssignment_2 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:845:2: ( rule__Feature__NameAssignment_2 )
            // InternalSheepDog.g:845:3: rule__Feature__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Feature__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_2()); 

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
    // InternalSheepDog.g:853:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:857:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalSheepDog.g:858:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalSheepDog.g:865:1: rule__Feature__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:869:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:870:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:870:1: ( RULE_EOL )
            // InternalSheepDog.g:871:2: RULE_EOL
            {
             before(grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_3()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_3()); 

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
    // InternalSheepDog.g:880:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl rule__Feature__Group__5 ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:884:1: ( rule__Feature__Group__4__Impl rule__Feature__Group__5 )
            // InternalSheepDog.g:885:2: rule__Feature__Group__4__Impl rule__Feature__Group__5
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
    // InternalSheepDog.g:892:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__StatementsAssignment_4 )* ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:896:1: ( ( ( rule__Feature__StatementsAssignment_4 )* ) )
            // InternalSheepDog.g:897:1: ( ( rule__Feature__StatementsAssignment_4 )* )
            {
            // InternalSheepDog.g:897:1: ( ( rule__Feature__StatementsAssignment_4 )* )
            // InternalSheepDog.g:898:2: ( rule__Feature__StatementsAssignment_4 )*
            {
             before(grammarAccess.getFeatureAccess().getStatementsAssignment_4()); 
            // InternalSheepDog.g:899:2: ( rule__Feature__StatementsAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_WORD && LA10_0<=RULE_STRING)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSheepDog.g:899:3: rule__Feature__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Feature__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getStatementsAssignment_4()); 

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
    // InternalSheepDog.g:907:1: rule__Feature__Group__5 : rule__Feature__Group__5__Impl rule__Feature__Group__6 ;
    public final void rule__Feature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:911:1: ( rule__Feature__Group__5__Impl rule__Feature__Group__6 )
            // InternalSheepDog.g:912:2: rule__Feature__Group__5__Impl rule__Feature__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Feature__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__6();

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
    // InternalSheepDog.g:919:1: rule__Feature__Group__5__Impl : ( ( rule__Feature__BackgroundAssignment_5 )? ) ;
    public final void rule__Feature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:923:1: ( ( ( rule__Feature__BackgroundAssignment_5 )? ) )
            // InternalSheepDog.g:924:1: ( ( rule__Feature__BackgroundAssignment_5 )? )
            {
            // InternalSheepDog.g:924:1: ( ( rule__Feature__BackgroundAssignment_5 )? )
            // InternalSheepDog.g:925:2: ( rule__Feature__BackgroundAssignment_5 )?
            {
             before(grammarAccess.getFeatureAccess().getBackgroundAssignment_5()); 
            // InternalSheepDog.g:926:2: ( rule__Feature__BackgroundAssignment_5 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==11) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSheepDog.g:926:3: rule__Feature__BackgroundAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__BackgroundAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getBackgroundAssignment_5()); 

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


    // $ANTLR start "rule__Feature__Group__6"
    // InternalSheepDog.g:934:1: rule__Feature__Group__6 : rule__Feature__Group__6__Impl ;
    public final void rule__Feature__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:938:1: ( rule__Feature__Group__6__Impl )
            // InternalSheepDog.g:939:2: rule__Feature__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__6__Impl();

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
    // $ANTLR end "rule__Feature__Group__6"


    // $ANTLR start "rule__Feature__Group__6__Impl"
    // InternalSheepDog.g:945:1: rule__Feature__Group__6__Impl : ( ( rule__Feature__ScenariosAssignment_6 )* ) ;
    public final void rule__Feature__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:949:1: ( ( ( rule__Feature__ScenariosAssignment_6 )* ) )
            // InternalSheepDog.g:950:1: ( ( rule__Feature__ScenariosAssignment_6 )* )
            {
            // InternalSheepDog.g:950:1: ( ( rule__Feature__ScenariosAssignment_6 )* )
            // InternalSheepDog.g:951:2: ( rule__Feature__ScenariosAssignment_6 )*
            {
             before(grammarAccess.getFeatureAccess().getScenariosAssignment_6()); 
            // InternalSheepDog.g:952:2: ( rule__Feature__ScenariosAssignment_6 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==12||LA12_0==15) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSheepDog.g:952:3: rule__Feature__ScenariosAssignment_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Feature__ScenariosAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getScenariosAssignment_6()); 

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
    // $ANTLR end "rule__Feature__Group__6__Impl"


    // $ANTLR start "rule__Background__Group__0"
    // InternalSheepDog.g:961:1: rule__Background__Group__0 : rule__Background__Group__0__Impl rule__Background__Group__1 ;
    public final void rule__Background__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:965:1: ( rule__Background__Group__0__Impl rule__Background__Group__1 )
            // InternalSheepDog.g:966:2: rule__Background__Group__0__Impl rule__Background__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSheepDog.g:973:1: rule__Background__Group__0__Impl : ( '[background=\"true\"]' ) ;
    public final void rule__Background__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:977:1: ( ( '[background=\"true\"]' ) )
            // InternalSheepDog.g:978:1: ( '[background=\"true\"]' )
            {
            // InternalSheepDog.g:978:1: ( '[background=\"true\"]' )
            // InternalSheepDog.g:979:2: '[background=\"true\"]'
            {
             before(grammarAccess.getBackgroundAccess().getBackgroundTrueKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getBackgroundAccess().getBackgroundTrueKeyword_0()); 

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
    // InternalSheepDog.g:988:1: rule__Background__Group__1 : rule__Background__Group__1__Impl rule__Background__Group__2 ;
    public final void rule__Background__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:992:1: ( rule__Background__Group__1__Impl rule__Background__Group__2 )
            // InternalSheepDog.g:993:2: rule__Background__Group__1__Impl rule__Background__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalSheepDog.g:1000:1: rule__Background__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Background__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1004:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:1005:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:1005:1: ( RULE_EOL )
            // InternalSheepDog.g:1006:2: RULE_EOL
            {
             before(grammarAccess.getBackgroundAccess().getEOLTerminalRuleCall_1()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getBackgroundAccess().getEOLTerminalRuleCall_1()); 

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
    // InternalSheepDog.g:1015:1: rule__Background__Group__2 : rule__Background__Group__2__Impl rule__Background__Group__3 ;
    public final void rule__Background__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1019:1: ( rule__Background__Group__2__Impl rule__Background__Group__3 )
            // InternalSheepDog.g:1020:2: rule__Background__Group__2__Impl rule__Background__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalSheepDog.g:1027:1: rule__Background__Group__2__Impl : ( '==' ) ;
    public final void rule__Background__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1031:1: ( ( '==' ) )
            // InternalSheepDog.g:1032:1: ( '==' )
            {
            // InternalSheepDog.g:1032:1: ( '==' )
            // InternalSheepDog.g:1033:2: '=='
            {
             before(grammarAccess.getBackgroundAccess().getEqualsSignEqualsSignKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getBackgroundAccess().getEqualsSignEqualsSignKeyword_2()); 

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
    // InternalSheepDog.g:1042:1: rule__Background__Group__3 : rule__Background__Group__3__Impl rule__Background__Group__4 ;
    public final void rule__Background__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1046:1: ( rule__Background__Group__3__Impl rule__Background__Group__4 )
            // InternalSheepDog.g:1047:2: rule__Background__Group__3__Impl rule__Background__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Background__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Background__Group__4();

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
    // InternalSheepDog.g:1054:1: rule__Background__Group__3__Impl : ( ( rule__Background__NameAssignment_3 ) ) ;
    public final void rule__Background__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1058:1: ( ( ( rule__Background__NameAssignment_3 ) ) )
            // InternalSheepDog.g:1059:1: ( ( rule__Background__NameAssignment_3 ) )
            {
            // InternalSheepDog.g:1059:1: ( ( rule__Background__NameAssignment_3 ) )
            // InternalSheepDog.g:1060:2: ( rule__Background__NameAssignment_3 )
            {
             before(grammarAccess.getBackgroundAccess().getNameAssignment_3()); 
            // InternalSheepDog.g:1061:2: ( rule__Background__NameAssignment_3 )
            // InternalSheepDog.g:1061:3: rule__Background__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Background__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBackgroundAccess().getNameAssignment_3()); 

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


    // $ANTLR start "rule__Background__Group__4"
    // InternalSheepDog.g:1069:1: rule__Background__Group__4 : rule__Background__Group__4__Impl rule__Background__Group__5 ;
    public final void rule__Background__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1073:1: ( rule__Background__Group__4__Impl rule__Background__Group__5 )
            // InternalSheepDog.g:1074:2: rule__Background__Group__4__Impl rule__Background__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Background__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Background__Group__5();

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
    // $ANTLR end "rule__Background__Group__4"


    // $ANTLR start "rule__Background__Group__4__Impl"
    // InternalSheepDog.g:1081:1: rule__Background__Group__4__Impl : ( RULE_EOL ) ;
    public final void rule__Background__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1085:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:1086:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:1086:1: ( RULE_EOL )
            // InternalSheepDog.g:1087:2: RULE_EOL
            {
             before(grammarAccess.getBackgroundAccess().getEOLTerminalRuleCall_4()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getBackgroundAccess().getEOLTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__Background__Group__4__Impl"


    // $ANTLR start "rule__Background__Group__5"
    // InternalSheepDog.g:1096:1: rule__Background__Group__5 : rule__Background__Group__5__Impl rule__Background__Group__6 ;
    public final void rule__Background__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1100:1: ( rule__Background__Group__5__Impl rule__Background__Group__6 )
            // InternalSheepDog.g:1101:2: rule__Background__Group__5__Impl rule__Background__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Background__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Background__Group__6();

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
    // $ANTLR end "rule__Background__Group__5"


    // $ANTLR start "rule__Background__Group__5__Impl"
    // InternalSheepDog.g:1108:1: rule__Background__Group__5__Impl : ( ( rule__Background__StatementsAssignment_5 )* ) ;
    public final void rule__Background__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1112:1: ( ( ( rule__Background__StatementsAssignment_5 )* ) )
            // InternalSheepDog.g:1113:1: ( ( rule__Background__StatementsAssignment_5 )* )
            {
            // InternalSheepDog.g:1113:1: ( ( rule__Background__StatementsAssignment_5 )* )
            // InternalSheepDog.g:1114:2: ( rule__Background__StatementsAssignment_5 )*
            {
             before(grammarAccess.getBackgroundAccess().getStatementsAssignment_5()); 
            // InternalSheepDog.g:1115:2: ( rule__Background__StatementsAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_WORD && LA13_0<=RULE_STRING)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSheepDog.g:1115:3: rule__Background__StatementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Background__StatementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getBackgroundAccess().getStatementsAssignment_5()); 

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
    // $ANTLR end "rule__Background__Group__5__Impl"


    // $ANTLR start "rule__Background__Group__6"
    // InternalSheepDog.g:1123:1: rule__Background__Group__6 : rule__Background__Group__6__Impl ;
    public final void rule__Background__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1127:1: ( rule__Background__Group__6__Impl )
            // InternalSheepDog.g:1128:2: rule__Background__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Background__Group__6__Impl();

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
    // $ANTLR end "rule__Background__Group__6"


    // $ANTLR start "rule__Background__Group__6__Impl"
    // InternalSheepDog.g:1134:1: rule__Background__Group__6__Impl : ( ( rule__Background__StepsAssignment_6 )* ) ;
    public final void rule__Background__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1138:1: ( ( ( rule__Background__StepsAssignment_6 )* ) )
            // InternalSheepDog.g:1139:1: ( ( rule__Background__StepsAssignment_6 )* )
            {
            // InternalSheepDog.g:1139:1: ( ( rule__Background__StepsAssignment_6 )* )
            // InternalSheepDog.g:1140:2: ( rule__Background__StepsAssignment_6 )*
            {
             before(grammarAccess.getBackgroundAccess().getStepsAssignment_6()); 
            // InternalSheepDog.g:1141:2: ( rule__Background__StepsAssignment_6 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==14) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSheepDog.g:1141:3: rule__Background__StepsAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Background__StepsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getBackgroundAccess().getStepsAssignment_6()); 

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
    // $ANTLR end "rule__Background__Group__6__Impl"


    // $ANTLR start "rule__Scenario__Group__0"
    // InternalSheepDog.g:1150:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1154:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalSheepDog.g:1155:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalSheepDog.g:1162:1: rule__Scenario__Group__0__Impl : ( ( rule__Scenario__TagsAssignment_0 )? ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1166:1: ( ( ( rule__Scenario__TagsAssignment_0 )? ) )
            // InternalSheepDog.g:1167:1: ( ( rule__Scenario__TagsAssignment_0 )? )
            {
            // InternalSheepDog.g:1167:1: ( ( rule__Scenario__TagsAssignment_0 )? )
            // InternalSheepDog.g:1168:2: ( rule__Scenario__TagsAssignment_0 )?
            {
             before(grammarAccess.getScenarioAccess().getTagsAssignment_0()); 
            // InternalSheepDog.g:1169:2: ( rule__Scenario__TagsAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSheepDog.g:1169:3: rule__Scenario__TagsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scenario__TagsAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

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
    // InternalSheepDog.g:1177:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1181:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalSheepDog.g:1182:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
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
    // InternalSheepDog.g:1189:1: rule__Scenario__Group__1__Impl : ( '==' ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1193:1: ( ( '==' ) )
            // InternalSheepDog.g:1194:1: ( '==' )
            {
            // InternalSheepDog.g:1194:1: ( '==' )
            // InternalSheepDog.g:1195:2: '=='
            {
             before(grammarAccess.getScenarioAccess().getEqualsSignEqualsSignKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getEqualsSignEqualsSignKeyword_1()); 

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
    // InternalSheepDog.g:1204:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1208:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // InternalSheepDog.g:1209:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
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
    // InternalSheepDog.g:1216:1: rule__Scenario__Group__2__Impl : ( ( rule__Scenario__NameAssignment_2 ) ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1220:1: ( ( ( rule__Scenario__NameAssignment_2 ) ) )
            // InternalSheepDog.g:1221:1: ( ( rule__Scenario__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:1221:1: ( ( rule__Scenario__NameAssignment_2 ) )
            // InternalSheepDog.g:1222:2: ( rule__Scenario__NameAssignment_2 )
            {
             before(grammarAccess.getScenarioAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:1223:2: ( rule__Scenario__NameAssignment_2 )
            // InternalSheepDog.g:1223:3: rule__Scenario__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getNameAssignment_2()); 

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
    // InternalSheepDog.g:1231:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl rule__Scenario__Group__4 ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1235:1: ( rule__Scenario__Group__3__Impl rule__Scenario__Group__4 )
            // InternalSheepDog.g:1236:2: rule__Scenario__Group__3__Impl rule__Scenario__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalSheepDog.g:1243:1: rule__Scenario__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1247:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:1248:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:1248:1: ( RULE_EOL )
            // InternalSheepDog.g:1249:2: RULE_EOL
            {
             before(grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_3()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_3()); 

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
    // InternalSheepDog.g:1258:1: rule__Scenario__Group__4 : rule__Scenario__Group__4__Impl rule__Scenario__Group__5 ;
    public final void rule__Scenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1262:1: ( rule__Scenario__Group__4__Impl rule__Scenario__Group__5 )
            // InternalSheepDog.g:1263:2: rule__Scenario__Group__4__Impl rule__Scenario__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalSheepDog.g:1270:1: rule__Scenario__Group__4__Impl : ( ( rule__Scenario__StatementsAssignment_4 )* ) ;
    public final void rule__Scenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1274:1: ( ( ( rule__Scenario__StatementsAssignment_4 )* ) )
            // InternalSheepDog.g:1275:1: ( ( rule__Scenario__StatementsAssignment_4 )* )
            {
            // InternalSheepDog.g:1275:1: ( ( rule__Scenario__StatementsAssignment_4 )* )
            // InternalSheepDog.g:1276:2: ( rule__Scenario__StatementsAssignment_4 )*
            {
             before(grammarAccess.getScenarioAccess().getStatementsAssignment_4()); 
            // InternalSheepDog.g:1277:2: ( rule__Scenario__StatementsAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_WORD && LA16_0<=RULE_STRING)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSheepDog.g:1277:3: rule__Scenario__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Scenario__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getStatementsAssignment_4()); 

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
    // InternalSheepDog.g:1285:1: rule__Scenario__Group__5 : rule__Scenario__Group__5__Impl rule__Scenario__Group__6 ;
    public final void rule__Scenario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1289:1: ( rule__Scenario__Group__5__Impl rule__Scenario__Group__6 )
            // InternalSheepDog.g:1290:2: rule__Scenario__Group__5__Impl rule__Scenario__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Scenario__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__6();

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
    // InternalSheepDog.g:1297:1: rule__Scenario__Group__5__Impl : ( ( rule__Scenario__StepsAssignment_5 )* ) ;
    public final void rule__Scenario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1301:1: ( ( ( rule__Scenario__StepsAssignment_5 )* ) )
            // InternalSheepDog.g:1302:1: ( ( rule__Scenario__StepsAssignment_5 )* )
            {
            // InternalSheepDog.g:1302:1: ( ( rule__Scenario__StepsAssignment_5 )* )
            // InternalSheepDog.g:1303:2: ( rule__Scenario__StepsAssignment_5 )*
            {
             before(grammarAccess.getScenarioAccess().getStepsAssignment_5()); 
            // InternalSheepDog.g:1304:2: ( rule__Scenario__StepsAssignment_5 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==14) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSheepDog.g:1304:3: rule__Scenario__StepsAssignment_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Scenario__StepsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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


    // $ANTLR start "rule__Scenario__Group__6"
    // InternalSheepDog.g:1312:1: rule__Scenario__Group__6 : rule__Scenario__Group__6__Impl ;
    public final void rule__Scenario__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1316:1: ( rule__Scenario__Group__6__Impl )
            // InternalSheepDog.g:1317:2: rule__Scenario__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Group__6__Impl();

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
    // $ANTLR end "rule__Scenario__Group__6"


    // $ANTLR start "rule__Scenario__Group__6__Impl"
    // InternalSheepDog.g:1323:1: rule__Scenario__Group__6__Impl : ( ( ( rule__Scenario__ExamplesAssignment_6 ) ) ( ( rule__Scenario__ExamplesAssignment_6 )* ) ) ;
    public final void rule__Scenario__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1327:1: ( ( ( ( rule__Scenario__ExamplesAssignment_6 ) ) ( ( rule__Scenario__ExamplesAssignment_6 )* ) ) )
            // InternalSheepDog.g:1328:1: ( ( ( rule__Scenario__ExamplesAssignment_6 ) ) ( ( rule__Scenario__ExamplesAssignment_6 )* ) )
            {
            // InternalSheepDog.g:1328:1: ( ( ( rule__Scenario__ExamplesAssignment_6 ) ) ( ( rule__Scenario__ExamplesAssignment_6 )* ) )
            // InternalSheepDog.g:1329:2: ( ( rule__Scenario__ExamplesAssignment_6 ) ) ( ( rule__Scenario__ExamplesAssignment_6 )* )
            {
            // InternalSheepDog.g:1329:2: ( ( rule__Scenario__ExamplesAssignment_6 ) )
            // InternalSheepDog.g:1330:3: ( rule__Scenario__ExamplesAssignment_6 )
            {
             before(grammarAccess.getScenarioAccess().getExamplesAssignment_6()); 
            // InternalSheepDog.g:1331:3: ( rule__Scenario__ExamplesAssignment_6 )
            // InternalSheepDog.g:1331:4: rule__Scenario__ExamplesAssignment_6
            {
            pushFollow(FOLLOW_14);
            rule__Scenario__ExamplesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getExamplesAssignment_6()); 

            }

            // InternalSheepDog.g:1334:2: ( ( rule__Scenario__ExamplesAssignment_6 )* )
            // InternalSheepDog.g:1335:3: ( rule__Scenario__ExamplesAssignment_6 )*
            {
             before(grammarAccess.getScenarioAccess().getExamplesAssignment_6()); 
            // InternalSheepDog.g:1336:3: ( rule__Scenario__ExamplesAssignment_6 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==13) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSheepDog.g:1336:4: rule__Scenario__ExamplesAssignment_6
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Scenario__ExamplesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getExamplesAssignment_6()); 

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
    // $ANTLR end "rule__Scenario__Group__6__Impl"


    // $ANTLR start "rule__Examples__Group__0"
    // InternalSheepDog.g:1346:1: rule__Examples__Group__0 : rule__Examples__Group__0__Impl rule__Examples__Group__1 ;
    public final void rule__Examples__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1350:1: ( rule__Examples__Group__0__Impl rule__Examples__Group__1 )
            // InternalSheepDog.g:1351:2: rule__Examples__Group__0__Impl rule__Examples__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Examples__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Examples__Group__1();

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
    // $ANTLR end "rule__Examples__Group__0"


    // $ANTLR start "rule__Examples__Group__0__Impl"
    // InternalSheepDog.g:1358:1: rule__Examples__Group__0__Impl : ( '[examples=\"true\"]' ) ;
    public final void rule__Examples__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1362:1: ( ( '[examples=\"true\"]' ) )
            // InternalSheepDog.g:1363:1: ( '[examples=\"true\"]' )
            {
            // InternalSheepDog.g:1363:1: ( '[examples=\"true\"]' )
            // InternalSheepDog.g:1364:2: '[examples=\"true\"]'
            {
             before(grammarAccess.getExamplesAccess().getExamplesTrueKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getExamplesAccess().getExamplesTrueKeyword_0()); 

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
    // $ANTLR end "rule__Examples__Group__0__Impl"


    // $ANTLR start "rule__Examples__Group__1"
    // InternalSheepDog.g:1373:1: rule__Examples__Group__1 : rule__Examples__Group__1__Impl rule__Examples__Group__2 ;
    public final void rule__Examples__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1377:1: ( rule__Examples__Group__1__Impl rule__Examples__Group__2 )
            // InternalSheepDog.g:1378:2: rule__Examples__Group__1__Impl rule__Examples__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Examples__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Examples__Group__2();

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
    // $ANTLR end "rule__Examples__Group__1"


    // $ANTLR start "rule__Examples__Group__1__Impl"
    // InternalSheepDog.g:1385:1: rule__Examples__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Examples__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1389:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:1390:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:1390:1: ( RULE_EOL )
            // InternalSheepDog.g:1391:2: RULE_EOL
            {
             before(grammarAccess.getExamplesAccess().getEOLTerminalRuleCall_1()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getExamplesAccess().getEOLTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Examples__Group__1__Impl"


    // $ANTLR start "rule__Examples__Group__2"
    // InternalSheepDog.g:1400:1: rule__Examples__Group__2 : rule__Examples__Group__2__Impl rule__Examples__Group__3 ;
    public final void rule__Examples__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1404:1: ( rule__Examples__Group__2__Impl rule__Examples__Group__3 )
            // InternalSheepDog.g:1405:2: rule__Examples__Group__2__Impl rule__Examples__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Examples__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Examples__Group__3();

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
    // $ANTLR end "rule__Examples__Group__2"


    // $ANTLR start "rule__Examples__Group__2__Impl"
    // InternalSheepDog.g:1412:1: rule__Examples__Group__2__Impl : ( '===' ) ;
    public final void rule__Examples__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1416:1: ( ( '===' ) )
            // InternalSheepDog.g:1417:1: ( '===' )
            {
            // InternalSheepDog.g:1417:1: ( '===' )
            // InternalSheepDog.g:1418:2: '==='
            {
             before(grammarAccess.getExamplesAccess().getEqualsSignEqualsSignEqualsSignKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getExamplesAccess().getEqualsSignEqualsSignEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__Examples__Group__2__Impl"


    // $ANTLR start "rule__Examples__Group__3"
    // InternalSheepDog.g:1427:1: rule__Examples__Group__3 : rule__Examples__Group__3__Impl rule__Examples__Group__4 ;
    public final void rule__Examples__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1431:1: ( rule__Examples__Group__3__Impl rule__Examples__Group__4 )
            // InternalSheepDog.g:1432:2: rule__Examples__Group__3__Impl rule__Examples__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Examples__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Examples__Group__4();

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
    // $ANTLR end "rule__Examples__Group__3"


    // $ANTLR start "rule__Examples__Group__3__Impl"
    // InternalSheepDog.g:1439:1: rule__Examples__Group__3__Impl : ( ( rule__Examples__NameAssignment_3 ) ) ;
    public final void rule__Examples__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1443:1: ( ( ( rule__Examples__NameAssignment_3 ) ) )
            // InternalSheepDog.g:1444:1: ( ( rule__Examples__NameAssignment_3 ) )
            {
            // InternalSheepDog.g:1444:1: ( ( rule__Examples__NameAssignment_3 ) )
            // InternalSheepDog.g:1445:2: ( rule__Examples__NameAssignment_3 )
            {
             before(grammarAccess.getExamplesAccess().getNameAssignment_3()); 
            // InternalSheepDog.g:1446:2: ( rule__Examples__NameAssignment_3 )
            // InternalSheepDog.g:1446:3: rule__Examples__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Examples__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExamplesAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__Examples__Group__3__Impl"


    // $ANTLR start "rule__Examples__Group__4"
    // InternalSheepDog.g:1454:1: rule__Examples__Group__4 : rule__Examples__Group__4__Impl rule__Examples__Group__5 ;
    public final void rule__Examples__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1458:1: ( rule__Examples__Group__4__Impl rule__Examples__Group__5 )
            // InternalSheepDog.g:1459:2: rule__Examples__Group__4__Impl rule__Examples__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Examples__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Examples__Group__5();

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
    // $ANTLR end "rule__Examples__Group__4"


    // $ANTLR start "rule__Examples__Group__4__Impl"
    // InternalSheepDog.g:1466:1: rule__Examples__Group__4__Impl : ( RULE_EOL ) ;
    public final void rule__Examples__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1470:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:1471:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:1471:1: ( RULE_EOL )
            // InternalSheepDog.g:1472:2: RULE_EOL
            {
             before(grammarAccess.getExamplesAccess().getEOLTerminalRuleCall_4()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getExamplesAccess().getEOLTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__Examples__Group__4__Impl"


    // $ANTLR start "rule__Examples__Group__5"
    // InternalSheepDog.g:1481:1: rule__Examples__Group__5 : rule__Examples__Group__5__Impl rule__Examples__Group__6 ;
    public final void rule__Examples__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1485:1: ( rule__Examples__Group__5__Impl rule__Examples__Group__6 )
            // InternalSheepDog.g:1486:2: rule__Examples__Group__5__Impl rule__Examples__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Examples__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Examples__Group__6();

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
    // $ANTLR end "rule__Examples__Group__5"


    // $ANTLR start "rule__Examples__Group__5__Impl"
    // InternalSheepDog.g:1493:1: rule__Examples__Group__5__Impl : ( ( rule__Examples__StatementsAssignment_5 )* ) ;
    public final void rule__Examples__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1497:1: ( ( ( rule__Examples__StatementsAssignment_5 )* ) )
            // InternalSheepDog.g:1498:1: ( ( rule__Examples__StatementsAssignment_5 )* )
            {
            // InternalSheepDog.g:1498:1: ( ( rule__Examples__StatementsAssignment_5 )* )
            // InternalSheepDog.g:1499:2: ( rule__Examples__StatementsAssignment_5 )*
            {
             before(grammarAccess.getExamplesAccess().getStatementsAssignment_5()); 
            // InternalSheepDog.g:1500:2: ( rule__Examples__StatementsAssignment_5 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_WORD && LA19_0<=RULE_STRING)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSheepDog.g:1500:3: rule__Examples__StatementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Examples__StatementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getExamplesAccess().getStatementsAssignment_5()); 

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
    // $ANTLR end "rule__Examples__Group__5__Impl"


    // $ANTLR start "rule__Examples__Group__6"
    // InternalSheepDog.g:1508:1: rule__Examples__Group__6 : rule__Examples__Group__6__Impl ;
    public final void rule__Examples__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1512:1: ( rule__Examples__Group__6__Impl )
            // InternalSheepDog.g:1513:2: rule__Examples__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Examples__Group__6__Impl();

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
    // $ANTLR end "rule__Examples__Group__6"


    // $ANTLR start "rule__Examples__Group__6__Impl"
    // InternalSheepDog.g:1519:1: rule__Examples__Group__6__Impl : ( ( rule__Examples__TheExamplesTableAssignment_6 ) ) ;
    public final void rule__Examples__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1523:1: ( ( ( rule__Examples__TheExamplesTableAssignment_6 ) ) )
            // InternalSheepDog.g:1524:1: ( ( rule__Examples__TheExamplesTableAssignment_6 ) )
            {
            // InternalSheepDog.g:1524:1: ( ( rule__Examples__TheExamplesTableAssignment_6 ) )
            // InternalSheepDog.g:1525:2: ( rule__Examples__TheExamplesTableAssignment_6 )
            {
             before(grammarAccess.getExamplesAccess().getTheExamplesTableAssignment_6()); 
            // InternalSheepDog.g:1526:2: ( rule__Examples__TheExamplesTableAssignment_6 )
            // InternalSheepDog.g:1526:3: rule__Examples__TheExamplesTableAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Examples__TheExamplesTableAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getExamplesAccess().getTheExamplesTableAssignment_6()); 

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
    // $ANTLR end "rule__Examples__Group__6__Impl"


    // $ANTLR start "rule__ScenarioTags__Group__0"
    // InternalSheepDog.g:1535:1: rule__ScenarioTags__Group__0 : rule__ScenarioTags__Group__0__Impl rule__ScenarioTags__Group__1 ;
    public final void rule__ScenarioTags__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1539:1: ( rule__ScenarioTags__Group__0__Impl rule__ScenarioTags__Group__1 )
            // InternalSheepDog.g:1540:2: rule__ScenarioTags__Group__0__Impl rule__ScenarioTags__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ScenarioTags__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTags__Group__1();

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
    // $ANTLR end "rule__ScenarioTags__Group__0"


    // $ANTLR start "rule__ScenarioTags__Group__0__Impl"
    // InternalSheepDog.g:1547:1: rule__ScenarioTags__Group__0__Impl : ( '[tags=\"' ) ;
    public final void rule__ScenarioTags__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1551:1: ( ( '[tags=\"' ) )
            // InternalSheepDog.g:1552:1: ( '[tags=\"' )
            {
            // InternalSheepDog.g:1552:1: ( '[tags=\"' )
            // InternalSheepDog.g:1553:2: '[tags=\"'
            {
             before(grammarAccess.getScenarioTagsAccess().getTagsKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getScenarioTagsAccess().getTagsKeyword_0()); 

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
    // $ANTLR end "rule__ScenarioTags__Group__0__Impl"


    // $ANTLR start "rule__ScenarioTags__Group__1"
    // InternalSheepDog.g:1562:1: rule__ScenarioTags__Group__1 : rule__ScenarioTags__Group__1__Impl rule__ScenarioTags__Group__2 ;
    public final void rule__ScenarioTags__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1566:1: ( rule__ScenarioTags__Group__1__Impl rule__ScenarioTags__Group__2 )
            // InternalSheepDog.g:1567:2: rule__ScenarioTags__Group__1__Impl rule__ScenarioTags__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ScenarioTags__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTags__Group__2();

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
    // $ANTLR end "rule__ScenarioTags__Group__1"


    // $ANTLR start "rule__ScenarioTags__Group__1__Impl"
    // InternalSheepDog.g:1574:1: rule__ScenarioTags__Group__1__Impl : ( ( rule__ScenarioTags__NameAssignment_1 ) ) ;
    public final void rule__ScenarioTags__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1578:1: ( ( ( rule__ScenarioTags__NameAssignment_1 ) ) )
            // InternalSheepDog.g:1579:1: ( ( rule__ScenarioTags__NameAssignment_1 ) )
            {
            // InternalSheepDog.g:1579:1: ( ( rule__ScenarioTags__NameAssignment_1 ) )
            // InternalSheepDog.g:1580:2: ( rule__ScenarioTags__NameAssignment_1 )
            {
             before(grammarAccess.getScenarioTagsAccess().getNameAssignment_1()); 
            // InternalSheepDog.g:1581:2: ( rule__ScenarioTags__NameAssignment_1 )
            // InternalSheepDog.g:1581:3: rule__ScenarioTags__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTags__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioTagsAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ScenarioTags__Group__1__Impl"


    // $ANTLR start "rule__ScenarioTags__Group__2"
    // InternalSheepDog.g:1589:1: rule__ScenarioTags__Group__2 : rule__ScenarioTags__Group__2__Impl rule__ScenarioTags__Group__3 ;
    public final void rule__ScenarioTags__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1593:1: ( rule__ScenarioTags__Group__2__Impl rule__ScenarioTags__Group__3 )
            // InternalSheepDog.g:1594:2: rule__ScenarioTags__Group__2__Impl rule__ScenarioTags__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ScenarioTags__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTags__Group__3();

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
    // $ANTLR end "rule__ScenarioTags__Group__2"


    // $ANTLR start "rule__ScenarioTags__Group__2__Impl"
    // InternalSheepDog.g:1601:1: rule__ScenarioTags__Group__2__Impl : ( '\"]' ) ;
    public final void rule__ScenarioTags__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1605:1: ( ( '\"]' ) )
            // InternalSheepDog.g:1606:1: ( '\"]' )
            {
            // InternalSheepDog.g:1606:1: ( '\"]' )
            // InternalSheepDog.g:1607:2: '\"]'
            {
             before(grammarAccess.getScenarioTagsAccess().getQuotationMarkRightSquareBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getScenarioTagsAccess().getQuotationMarkRightSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__ScenarioTags__Group__2__Impl"


    // $ANTLR start "rule__ScenarioTags__Group__3"
    // InternalSheepDog.g:1616:1: rule__ScenarioTags__Group__3 : rule__ScenarioTags__Group__3__Impl ;
    public final void rule__ScenarioTags__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1620:1: ( rule__ScenarioTags__Group__3__Impl )
            // InternalSheepDog.g:1621:2: rule__ScenarioTags__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTags__Group__3__Impl();

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
    // $ANTLR end "rule__ScenarioTags__Group__3"


    // $ANTLR start "rule__ScenarioTags__Group__3__Impl"
    // InternalSheepDog.g:1627:1: rule__ScenarioTags__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__ScenarioTags__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1631:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:1632:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:1632:1: ( RULE_EOL )
            // InternalSheepDog.g:1633:2: RULE_EOL
            {
             before(grammarAccess.getScenarioTagsAccess().getEOLTerminalRuleCall_3()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getScenarioTagsAccess().getEOLTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__ScenarioTags__Group__3__Impl"


    // $ANTLR start "rule__FeatureTags__Group__0"
    // InternalSheepDog.g:1643:1: rule__FeatureTags__Group__0 : rule__FeatureTags__Group__0__Impl rule__FeatureTags__Group__1 ;
    public final void rule__FeatureTags__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1647:1: ( rule__FeatureTags__Group__0__Impl rule__FeatureTags__Group__1 )
            // InternalSheepDog.g:1648:2: rule__FeatureTags__Group__0__Impl rule__FeatureTags__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__FeatureTags__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureTags__Group__1();

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
    // $ANTLR end "rule__FeatureTags__Group__0"


    // $ANTLR start "rule__FeatureTags__Group__0__Impl"
    // InternalSheepDog.g:1655:1: rule__FeatureTags__Group__0__Impl : ( ':tags:' ) ;
    public final void rule__FeatureTags__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1659:1: ( ( ':tags:' ) )
            // InternalSheepDog.g:1660:1: ( ':tags:' )
            {
            // InternalSheepDog.g:1660:1: ( ':tags:' )
            // InternalSheepDog.g:1661:2: ':tags:'
            {
             before(grammarAccess.getFeatureTagsAccess().getTagsKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFeatureTagsAccess().getTagsKeyword_0()); 

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
    // $ANTLR end "rule__FeatureTags__Group__0__Impl"


    // $ANTLR start "rule__FeatureTags__Group__1"
    // InternalSheepDog.g:1670:1: rule__FeatureTags__Group__1 : rule__FeatureTags__Group__1__Impl rule__FeatureTags__Group__2 ;
    public final void rule__FeatureTags__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1674:1: ( rule__FeatureTags__Group__1__Impl rule__FeatureTags__Group__2 )
            // InternalSheepDog.g:1675:2: rule__FeatureTags__Group__1__Impl rule__FeatureTags__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__FeatureTags__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureTags__Group__2();

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
    // $ANTLR end "rule__FeatureTags__Group__1"


    // $ANTLR start "rule__FeatureTags__Group__1__Impl"
    // InternalSheepDog.g:1682:1: rule__FeatureTags__Group__1__Impl : ( ( rule__FeatureTags__NameAssignment_1 ) ) ;
    public final void rule__FeatureTags__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1686:1: ( ( ( rule__FeatureTags__NameAssignment_1 ) ) )
            // InternalSheepDog.g:1687:1: ( ( rule__FeatureTags__NameAssignment_1 ) )
            {
            // InternalSheepDog.g:1687:1: ( ( rule__FeatureTags__NameAssignment_1 ) )
            // InternalSheepDog.g:1688:2: ( rule__FeatureTags__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureTagsAccess().getNameAssignment_1()); 
            // InternalSheepDog.g:1689:2: ( rule__FeatureTags__NameAssignment_1 )
            // InternalSheepDog.g:1689:3: rule__FeatureTags__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureTags__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureTagsAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__FeatureTags__Group__1__Impl"


    // $ANTLR start "rule__FeatureTags__Group__2"
    // InternalSheepDog.g:1697:1: rule__FeatureTags__Group__2 : rule__FeatureTags__Group__2__Impl ;
    public final void rule__FeatureTags__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1701:1: ( rule__FeatureTags__Group__2__Impl )
            // InternalSheepDog.g:1702:2: rule__FeatureTags__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureTags__Group__2__Impl();

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
    // $ANTLR end "rule__FeatureTags__Group__2"


    // $ANTLR start "rule__FeatureTags__Group__2__Impl"
    // InternalSheepDog.g:1708:1: rule__FeatureTags__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__FeatureTags__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1712:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:1713:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:1713:1: ( RULE_EOL )
            // InternalSheepDog.g:1714:2: RULE_EOL
            {
             before(grammarAccess.getFeatureTagsAccess().getEOLTerminalRuleCall_2()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getFeatureTagsAccess().getEOLTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__FeatureTags__Group__2__Impl"


    // $ANTLR start "rule__Given__Group__0"
    // InternalSheepDog.g:1724:1: rule__Given__Group__0 : rule__Given__Group__0__Impl rule__Given__Group__1 ;
    public final void rule__Given__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1728:1: ( rule__Given__Group__0__Impl rule__Given__Group__1 )
            // InternalSheepDog.g:1729:2: rule__Given__Group__0__Impl rule__Given__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Given__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Given__Group__1();

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
    // $ANTLR end "rule__Given__Group__0"


    // $ANTLR start "rule__Given__Group__0__Impl"
    // InternalSheepDog.g:1736:1: rule__Given__Group__0__Impl : ( '===' ) ;
    public final void rule__Given__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1740:1: ( ( '===' ) )
            // InternalSheepDog.g:1741:1: ( '===' )
            {
            // InternalSheepDog.g:1741:1: ( '===' )
            // InternalSheepDog.g:1742:2: '==='
            {
             before(grammarAccess.getGivenAccess().getEqualsSignEqualsSignEqualsSignKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getGivenAccess().getEqualsSignEqualsSignEqualsSignKeyword_0()); 

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
    // $ANTLR end "rule__Given__Group__0__Impl"


    // $ANTLR start "rule__Given__Group__1"
    // InternalSheepDog.g:1751:1: rule__Given__Group__1 : rule__Given__Group__1__Impl rule__Given__Group__2 ;
    public final void rule__Given__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1755:1: ( rule__Given__Group__1__Impl rule__Given__Group__2 )
            // InternalSheepDog.g:1756:2: rule__Given__Group__1__Impl rule__Given__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Given__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Given__Group__2();

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
    // $ANTLR end "rule__Given__Group__1"


    // $ANTLR start "rule__Given__Group__1__Impl"
    // InternalSheepDog.g:1763:1: rule__Given__Group__1__Impl : ( 'Given' ) ;
    public final void rule__Given__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1767:1: ( ( 'Given' ) )
            // InternalSheepDog.g:1768:1: ( 'Given' )
            {
            // InternalSheepDog.g:1768:1: ( 'Given' )
            // InternalSheepDog.g:1769:2: 'Given'
            {
             before(grammarAccess.getGivenAccess().getGivenKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGivenAccess().getGivenKeyword_1()); 

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
    // $ANTLR end "rule__Given__Group__1__Impl"


    // $ANTLR start "rule__Given__Group__2"
    // InternalSheepDog.g:1778:1: rule__Given__Group__2 : rule__Given__Group__2__Impl rule__Given__Group__3 ;
    public final void rule__Given__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1782:1: ( rule__Given__Group__2__Impl rule__Given__Group__3 )
            // InternalSheepDog.g:1783:2: rule__Given__Group__2__Impl rule__Given__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Given__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Given__Group__3();

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
    // $ANTLR end "rule__Given__Group__2"


    // $ANTLR start "rule__Given__Group__2__Impl"
    // InternalSheepDog.g:1790:1: rule__Given__Group__2__Impl : ( ( rule__Given__NameAssignment_2 ) ) ;
    public final void rule__Given__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1794:1: ( ( ( rule__Given__NameAssignment_2 ) ) )
            // InternalSheepDog.g:1795:1: ( ( rule__Given__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:1795:1: ( ( rule__Given__NameAssignment_2 ) )
            // InternalSheepDog.g:1796:2: ( rule__Given__NameAssignment_2 )
            {
             before(grammarAccess.getGivenAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:1797:2: ( rule__Given__NameAssignment_2 )
            // InternalSheepDog.g:1797:3: rule__Given__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Given__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGivenAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Given__Group__2__Impl"


    // $ANTLR start "rule__Given__Group__3"
    // InternalSheepDog.g:1805:1: rule__Given__Group__3 : rule__Given__Group__3__Impl rule__Given__Group__4 ;
    public final void rule__Given__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1809:1: ( rule__Given__Group__3__Impl rule__Given__Group__4 )
            // InternalSheepDog.g:1810:2: rule__Given__Group__3__Impl rule__Given__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Given__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Given__Group__4();

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
    // $ANTLR end "rule__Given__Group__3"


    // $ANTLR start "rule__Given__Group__3__Impl"
    // InternalSheepDog.g:1817:1: rule__Given__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Given__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1821:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:1822:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:1822:1: ( RULE_EOL )
            // InternalSheepDog.g:1823:2: RULE_EOL
            {
             before(grammarAccess.getGivenAccess().getEOLTerminalRuleCall_3()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getGivenAccess().getEOLTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__Given__Group__3__Impl"


    // $ANTLR start "rule__Given__Group__4"
    // InternalSheepDog.g:1832:1: rule__Given__Group__4 : rule__Given__Group__4__Impl ;
    public final void rule__Given__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1836:1: ( rule__Given__Group__4__Impl )
            // InternalSheepDog.g:1837:2: rule__Given__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Given__Group__4__Impl();

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
    // $ANTLR end "rule__Given__Group__4"


    // $ANTLR start "rule__Given__Group__4__Impl"
    // InternalSheepDog.g:1843:1: rule__Given__Group__4__Impl : ( ( rule__Given__Alternatives_4 )? ) ;
    public final void rule__Given__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1847:1: ( ( ( rule__Given__Alternatives_4 )? ) )
            // InternalSheepDog.g:1848:1: ( ( rule__Given__Alternatives_4 )? )
            {
            // InternalSheepDog.g:1848:1: ( ( rule__Given__Alternatives_4 )? )
            // InternalSheepDog.g:1849:2: ( rule__Given__Alternatives_4 )?
            {
             before(grammarAccess.getGivenAccess().getAlternatives_4()); 
            // InternalSheepDog.g:1850:2: ( rule__Given__Alternatives_4 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=21 && LA20_0<=22)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSheepDog.g:1850:3: rule__Given__Alternatives_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Given__Alternatives_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGivenAccess().getAlternatives_4()); 

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
    // $ANTLR end "rule__Given__Group__4__Impl"


    // $ANTLR start "rule__When__Group__0"
    // InternalSheepDog.g:1859:1: rule__When__Group__0 : rule__When__Group__0__Impl rule__When__Group__1 ;
    public final void rule__When__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1863:1: ( rule__When__Group__0__Impl rule__When__Group__1 )
            // InternalSheepDog.g:1864:2: rule__When__Group__0__Impl rule__When__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__When__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__When__Group__1();

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
    // $ANTLR end "rule__When__Group__0"


    // $ANTLR start "rule__When__Group__0__Impl"
    // InternalSheepDog.g:1871:1: rule__When__Group__0__Impl : ( '===' ) ;
    public final void rule__When__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1875:1: ( ( '===' ) )
            // InternalSheepDog.g:1876:1: ( '===' )
            {
            // InternalSheepDog.g:1876:1: ( '===' )
            // InternalSheepDog.g:1877:2: '==='
            {
             before(grammarAccess.getWhenAccess().getEqualsSignEqualsSignEqualsSignKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getWhenAccess().getEqualsSignEqualsSignEqualsSignKeyword_0()); 

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
    // $ANTLR end "rule__When__Group__0__Impl"


    // $ANTLR start "rule__When__Group__1"
    // InternalSheepDog.g:1886:1: rule__When__Group__1 : rule__When__Group__1__Impl rule__When__Group__2 ;
    public final void rule__When__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1890:1: ( rule__When__Group__1__Impl rule__When__Group__2 )
            // InternalSheepDog.g:1891:2: rule__When__Group__1__Impl rule__When__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__When__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__When__Group__2();

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
    // $ANTLR end "rule__When__Group__1"


    // $ANTLR start "rule__When__Group__1__Impl"
    // InternalSheepDog.g:1898:1: rule__When__Group__1__Impl : ( 'When' ) ;
    public final void rule__When__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1902:1: ( ( 'When' ) )
            // InternalSheepDog.g:1903:1: ( 'When' )
            {
            // InternalSheepDog.g:1903:1: ( 'When' )
            // InternalSheepDog.g:1904:2: 'When'
            {
             before(grammarAccess.getWhenAccess().getWhenKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWhenAccess().getWhenKeyword_1()); 

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
    // $ANTLR end "rule__When__Group__1__Impl"


    // $ANTLR start "rule__When__Group__2"
    // InternalSheepDog.g:1913:1: rule__When__Group__2 : rule__When__Group__2__Impl rule__When__Group__3 ;
    public final void rule__When__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1917:1: ( rule__When__Group__2__Impl rule__When__Group__3 )
            // InternalSheepDog.g:1918:2: rule__When__Group__2__Impl rule__When__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__When__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__When__Group__3();

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
    // $ANTLR end "rule__When__Group__2"


    // $ANTLR start "rule__When__Group__2__Impl"
    // InternalSheepDog.g:1925:1: rule__When__Group__2__Impl : ( ( rule__When__NameAssignment_2 ) ) ;
    public final void rule__When__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1929:1: ( ( ( rule__When__NameAssignment_2 ) ) )
            // InternalSheepDog.g:1930:1: ( ( rule__When__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:1930:1: ( ( rule__When__NameAssignment_2 ) )
            // InternalSheepDog.g:1931:2: ( rule__When__NameAssignment_2 )
            {
             before(grammarAccess.getWhenAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:1932:2: ( rule__When__NameAssignment_2 )
            // InternalSheepDog.g:1932:3: rule__When__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__When__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWhenAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__When__Group__2__Impl"


    // $ANTLR start "rule__When__Group__3"
    // InternalSheepDog.g:1940:1: rule__When__Group__3 : rule__When__Group__3__Impl rule__When__Group__4 ;
    public final void rule__When__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1944:1: ( rule__When__Group__3__Impl rule__When__Group__4 )
            // InternalSheepDog.g:1945:2: rule__When__Group__3__Impl rule__When__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__When__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__When__Group__4();

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
    // $ANTLR end "rule__When__Group__3"


    // $ANTLR start "rule__When__Group__3__Impl"
    // InternalSheepDog.g:1952:1: rule__When__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__When__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1956:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:1957:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:1957:1: ( RULE_EOL )
            // InternalSheepDog.g:1958:2: RULE_EOL
            {
             before(grammarAccess.getWhenAccess().getEOLTerminalRuleCall_3()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getWhenAccess().getEOLTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__When__Group__3__Impl"


    // $ANTLR start "rule__When__Group__4"
    // InternalSheepDog.g:1967:1: rule__When__Group__4 : rule__When__Group__4__Impl ;
    public final void rule__When__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1971:1: ( rule__When__Group__4__Impl )
            // InternalSheepDog.g:1972:2: rule__When__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__When__Group__4__Impl();

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
    // $ANTLR end "rule__When__Group__4"


    // $ANTLR start "rule__When__Group__4__Impl"
    // InternalSheepDog.g:1978:1: rule__When__Group__4__Impl : ( ( rule__When__Alternatives_4 )? ) ;
    public final void rule__When__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1982:1: ( ( ( rule__When__Alternatives_4 )? ) )
            // InternalSheepDog.g:1983:1: ( ( rule__When__Alternatives_4 )? )
            {
            // InternalSheepDog.g:1983:1: ( ( rule__When__Alternatives_4 )? )
            // InternalSheepDog.g:1984:2: ( rule__When__Alternatives_4 )?
            {
             before(grammarAccess.getWhenAccess().getAlternatives_4()); 
            // InternalSheepDog.g:1985:2: ( rule__When__Alternatives_4 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=21 && LA21_0<=22)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSheepDog.g:1985:3: rule__When__Alternatives_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__When__Alternatives_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWhenAccess().getAlternatives_4()); 

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
    // $ANTLR end "rule__When__Group__4__Impl"


    // $ANTLR start "rule__Then__Group__0"
    // InternalSheepDog.g:1994:1: rule__Then__Group__0 : rule__Then__Group__0__Impl rule__Then__Group__1 ;
    public final void rule__Then__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1998:1: ( rule__Then__Group__0__Impl rule__Then__Group__1 )
            // InternalSheepDog.g:1999:2: rule__Then__Group__0__Impl rule__Then__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Then__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Then__Group__1();

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
    // $ANTLR end "rule__Then__Group__0"


    // $ANTLR start "rule__Then__Group__0__Impl"
    // InternalSheepDog.g:2006:1: rule__Then__Group__0__Impl : ( '===' ) ;
    public final void rule__Then__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2010:1: ( ( '===' ) )
            // InternalSheepDog.g:2011:1: ( '===' )
            {
            // InternalSheepDog.g:2011:1: ( '===' )
            // InternalSheepDog.g:2012:2: '==='
            {
             before(grammarAccess.getThenAccess().getEqualsSignEqualsSignEqualsSignKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getThenAccess().getEqualsSignEqualsSignEqualsSignKeyword_0()); 

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
    // $ANTLR end "rule__Then__Group__0__Impl"


    // $ANTLR start "rule__Then__Group__1"
    // InternalSheepDog.g:2021:1: rule__Then__Group__1 : rule__Then__Group__1__Impl rule__Then__Group__2 ;
    public final void rule__Then__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2025:1: ( rule__Then__Group__1__Impl rule__Then__Group__2 )
            // InternalSheepDog.g:2026:2: rule__Then__Group__1__Impl rule__Then__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Then__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Then__Group__2();

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
    // $ANTLR end "rule__Then__Group__1"


    // $ANTLR start "rule__Then__Group__1__Impl"
    // InternalSheepDog.g:2033:1: rule__Then__Group__1__Impl : ( 'Then' ) ;
    public final void rule__Then__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2037:1: ( ( 'Then' ) )
            // InternalSheepDog.g:2038:1: ( 'Then' )
            {
            // InternalSheepDog.g:2038:1: ( 'Then' )
            // InternalSheepDog.g:2039:2: 'Then'
            {
             before(grammarAccess.getThenAccess().getThenKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getThenAccess().getThenKeyword_1()); 

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
    // $ANTLR end "rule__Then__Group__1__Impl"


    // $ANTLR start "rule__Then__Group__2"
    // InternalSheepDog.g:2048:1: rule__Then__Group__2 : rule__Then__Group__2__Impl rule__Then__Group__3 ;
    public final void rule__Then__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2052:1: ( rule__Then__Group__2__Impl rule__Then__Group__3 )
            // InternalSheepDog.g:2053:2: rule__Then__Group__2__Impl rule__Then__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Then__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Then__Group__3();

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
    // $ANTLR end "rule__Then__Group__2"


    // $ANTLR start "rule__Then__Group__2__Impl"
    // InternalSheepDog.g:2060:1: rule__Then__Group__2__Impl : ( ( rule__Then__NameAssignment_2 ) ) ;
    public final void rule__Then__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2064:1: ( ( ( rule__Then__NameAssignment_2 ) ) )
            // InternalSheepDog.g:2065:1: ( ( rule__Then__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:2065:1: ( ( rule__Then__NameAssignment_2 ) )
            // InternalSheepDog.g:2066:2: ( rule__Then__NameAssignment_2 )
            {
             before(grammarAccess.getThenAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:2067:2: ( rule__Then__NameAssignment_2 )
            // InternalSheepDog.g:2067:3: rule__Then__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Then__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getThenAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Then__Group__2__Impl"


    // $ANTLR start "rule__Then__Group__3"
    // InternalSheepDog.g:2075:1: rule__Then__Group__3 : rule__Then__Group__3__Impl rule__Then__Group__4 ;
    public final void rule__Then__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2079:1: ( rule__Then__Group__3__Impl rule__Then__Group__4 )
            // InternalSheepDog.g:2080:2: rule__Then__Group__3__Impl rule__Then__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Then__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Then__Group__4();

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
    // $ANTLR end "rule__Then__Group__3"


    // $ANTLR start "rule__Then__Group__3__Impl"
    // InternalSheepDog.g:2087:1: rule__Then__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Then__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2091:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2092:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2092:1: ( RULE_EOL )
            // InternalSheepDog.g:2093:2: RULE_EOL
            {
             before(grammarAccess.getThenAccess().getEOLTerminalRuleCall_3()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getThenAccess().getEOLTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__Then__Group__3__Impl"


    // $ANTLR start "rule__Then__Group__4"
    // InternalSheepDog.g:2102:1: rule__Then__Group__4 : rule__Then__Group__4__Impl ;
    public final void rule__Then__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2106:1: ( rule__Then__Group__4__Impl )
            // InternalSheepDog.g:2107:2: rule__Then__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Then__Group__4__Impl();

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
    // $ANTLR end "rule__Then__Group__4"


    // $ANTLR start "rule__Then__Group__4__Impl"
    // InternalSheepDog.g:2113:1: rule__Then__Group__4__Impl : ( ( rule__Then__Alternatives_4 )? ) ;
    public final void rule__Then__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2117:1: ( ( ( rule__Then__Alternatives_4 )? ) )
            // InternalSheepDog.g:2118:1: ( ( rule__Then__Alternatives_4 )? )
            {
            // InternalSheepDog.g:2118:1: ( ( rule__Then__Alternatives_4 )? )
            // InternalSheepDog.g:2119:2: ( rule__Then__Alternatives_4 )?
            {
             before(grammarAccess.getThenAccess().getAlternatives_4()); 
            // InternalSheepDog.g:2120:2: ( rule__Then__Alternatives_4 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=21 && LA22_0<=22)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSheepDog.g:2120:3: rule__Then__Alternatives_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Then__Alternatives_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getThenAccess().getAlternatives_4()); 

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
    // $ANTLR end "rule__Then__Group__4__Impl"


    // $ANTLR start "rule__DocString__Group__0"
    // InternalSheepDog.g:2129:1: rule__DocString__Group__0 : rule__DocString__Group__0__Impl rule__DocString__Group__1 ;
    public final void rule__DocString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2133:1: ( rule__DocString__Group__0__Impl rule__DocString__Group__1 )
            // InternalSheepDog.g:2134:2: rule__DocString__Group__0__Impl rule__DocString__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__DocString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocString__Group__1();

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
    // $ANTLR end "rule__DocString__Group__0"


    // $ANTLR start "rule__DocString__Group__0__Impl"
    // InternalSheepDog.g:2141:1: rule__DocString__Group__0__Impl : ( '----' ) ;
    public final void rule__DocString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2145:1: ( ( '----' ) )
            // InternalSheepDog.g:2146:1: ( '----' )
            {
            // InternalSheepDog.g:2146:1: ( '----' )
            // InternalSheepDog.g:2147:2: '----'
            {
             before(grammarAccess.getDocStringAccess().getHyphenMinusHyphenMinusHyphenMinusHyphenMinusKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDocStringAccess().getHyphenMinusHyphenMinusHyphenMinusHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__DocString__Group__0__Impl"


    // $ANTLR start "rule__DocString__Group__1"
    // InternalSheepDog.g:2156:1: rule__DocString__Group__1 : rule__DocString__Group__1__Impl rule__DocString__Group__2 ;
    public final void rule__DocString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2160:1: ( rule__DocString__Group__1__Impl rule__DocString__Group__2 )
            // InternalSheepDog.g:2161:2: rule__DocString__Group__1__Impl rule__DocString__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DocString__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocString__Group__2();

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
    // $ANTLR end "rule__DocString__Group__1"


    // $ANTLR start "rule__DocString__Group__1__Impl"
    // InternalSheepDog.g:2168:1: rule__DocString__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__DocString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2172:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2173:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2173:1: ( RULE_EOL )
            // InternalSheepDog.g:2174:2: RULE_EOL
            {
             before(grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_1()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__DocString__Group__1__Impl"


    // $ANTLR start "rule__DocString__Group__2"
    // InternalSheepDog.g:2183:1: rule__DocString__Group__2 : rule__DocString__Group__2__Impl rule__DocString__Group__3 ;
    public final void rule__DocString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2187:1: ( rule__DocString__Group__2__Impl rule__DocString__Group__3 )
            // InternalSheepDog.g:2188:2: rule__DocString__Group__2__Impl rule__DocString__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__DocString__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocString__Group__3();

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
    // $ANTLR end "rule__DocString__Group__2"


    // $ANTLR start "rule__DocString__Group__2__Impl"
    // InternalSheepDog.g:2195:1: rule__DocString__Group__2__Impl : ( ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* ) ) ;
    public final void rule__DocString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2199:1: ( ( ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* ) ) )
            // InternalSheepDog.g:2200:1: ( ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* ) )
            {
            // InternalSheepDog.g:2200:1: ( ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* ) )
            // InternalSheepDog.g:2201:2: ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* )
            {
            // InternalSheepDog.g:2201:2: ( ( rule__DocString__LinesAssignment_2 ) )
            // InternalSheepDog.g:2202:3: ( rule__DocString__LinesAssignment_2 )
            {
             before(grammarAccess.getDocStringAccess().getLinesAssignment_2()); 
            // InternalSheepDog.g:2203:3: ( rule__DocString__LinesAssignment_2 )
            // InternalSheepDog.g:2203:4: rule__DocString__LinesAssignment_2
            {
            pushFollow(FOLLOW_3);
            rule__DocString__LinesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDocStringAccess().getLinesAssignment_2()); 

            }

            // InternalSheepDog.g:2206:2: ( ( rule__DocString__LinesAssignment_2 )* )
            // InternalSheepDog.g:2207:3: ( rule__DocString__LinesAssignment_2 )*
            {
             before(grammarAccess.getDocStringAccess().getLinesAssignment_2()); 
            // InternalSheepDog.g:2208:3: ( rule__DocString__LinesAssignment_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==EOF||(LA23_0>=RULE_WORD && LA23_0<=RULE_EOL)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSheepDog.g:2208:4: rule__DocString__LinesAssignment_2
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__DocString__LinesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getDocStringAccess().getLinesAssignment_2()); 

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
    // $ANTLR end "rule__DocString__Group__2__Impl"


    // $ANTLR start "rule__DocString__Group__3"
    // InternalSheepDog.g:2217:1: rule__DocString__Group__3 : rule__DocString__Group__3__Impl rule__DocString__Group__4 ;
    public final void rule__DocString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2221:1: ( rule__DocString__Group__3__Impl rule__DocString__Group__4 )
            // InternalSheepDog.g:2222:2: rule__DocString__Group__3__Impl rule__DocString__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__DocString__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocString__Group__4();

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
    // $ANTLR end "rule__DocString__Group__3"


    // $ANTLR start "rule__DocString__Group__3__Impl"
    // InternalSheepDog.g:2229:1: rule__DocString__Group__3__Impl : ( '----' ) ;
    public final void rule__DocString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2233:1: ( ( '----' ) )
            // InternalSheepDog.g:2234:1: ( '----' )
            {
            // InternalSheepDog.g:2234:1: ( '----' )
            // InternalSheepDog.g:2235:2: '----'
            {
             before(grammarAccess.getDocStringAccess().getHyphenMinusHyphenMinusHyphenMinusHyphenMinusKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDocStringAccess().getHyphenMinusHyphenMinusHyphenMinusHyphenMinusKeyword_3()); 

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
    // $ANTLR end "rule__DocString__Group__3__Impl"


    // $ANTLR start "rule__DocString__Group__4"
    // InternalSheepDog.g:2244:1: rule__DocString__Group__4 : rule__DocString__Group__4__Impl ;
    public final void rule__DocString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2248:1: ( rule__DocString__Group__4__Impl )
            // InternalSheepDog.g:2249:2: rule__DocString__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DocString__Group__4__Impl();

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
    // $ANTLR end "rule__DocString__Group__4"


    // $ANTLR start "rule__DocString__Group__4__Impl"
    // InternalSheepDog.g:2255:1: rule__DocString__Group__4__Impl : ( RULE_EOL ) ;
    public final void rule__DocString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2259:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2260:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2260:1: ( RULE_EOL )
            // InternalSheepDog.g:2261:2: RULE_EOL
            {
             before(grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_4()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__DocString__Group__4__Impl"


    // $ANTLR start "rule__Line__Group__0"
    // InternalSheepDog.g:2271:1: rule__Line__Group__0 : rule__Line__Group__0__Impl rule__Line__Group__1 ;
    public final void rule__Line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2275:1: ( rule__Line__Group__0__Impl rule__Line__Group__1 )
            // InternalSheepDog.g:2276:2: rule__Line__Group__0__Impl rule__Line__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Line__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group__1();

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
    // $ANTLR end "rule__Line__Group__0"


    // $ANTLR start "rule__Line__Group__0__Impl"
    // InternalSheepDog.g:2283:1: rule__Line__Group__0__Impl : ( ( rule__Line__NameAssignment_0 ) ) ;
    public final void rule__Line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2287:1: ( ( ( rule__Line__NameAssignment_0 ) ) )
            // InternalSheepDog.g:2288:1: ( ( rule__Line__NameAssignment_0 ) )
            {
            // InternalSheepDog.g:2288:1: ( ( rule__Line__NameAssignment_0 ) )
            // InternalSheepDog.g:2289:2: ( rule__Line__NameAssignment_0 )
            {
             before(grammarAccess.getLineAccess().getNameAssignment_0()); 
            // InternalSheepDog.g:2290:2: ( rule__Line__NameAssignment_0 )
            // InternalSheepDog.g:2290:3: rule__Line__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Line__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Line__Group__0__Impl"


    // $ANTLR start "rule__Line__Group__1"
    // InternalSheepDog.g:2298:1: rule__Line__Group__1 : rule__Line__Group__1__Impl ;
    public final void rule__Line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2302:1: ( rule__Line__Group__1__Impl )
            // InternalSheepDog.g:2303:2: rule__Line__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Line__Group__1__Impl();

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
    // $ANTLR end "rule__Line__Group__1"


    // $ANTLR start "rule__Line__Group__1__Impl"
    // InternalSheepDog.g:2309:1: rule__Line__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2313:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2314:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2314:1: ( RULE_EOL )
            // InternalSheepDog.g:2315:2: RULE_EOL
            {
             before(grammarAccess.getLineAccess().getEOLTerminalRuleCall_1()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getEOLTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Line__Group__1__Impl"


    // $ANTLR start "rule__Table__Group__0"
    // InternalSheepDog.g:2325:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2329:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalSheepDog.g:2330:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Table__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__1();

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
    // $ANTLR end "rule__Table__Group__0"


    // $ANTLR start "rule__Table__Group__0__Impl"
    // InternalSheepDog.g:2337:1: rule__Table__Group__0__Impl : ( '[options=\"header\"]' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2341:1: ( ( '[options=\"header\"]' ) )
            // InternalSheepDog.g:2342:1: ( '[options=\"header\"]' )
            {
            // InternalSheepDog.g:2342:1: ( '[options=\"header\"]' )
            // InternalSheepDog.g:2343:2: '[options=\"header\"]'
            {
             before(grammarAccess.getTableAccess().getOptionsHeaderKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getOptionsHeaderKeyword_0()); 

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
    // $ANTLR end "rule__Table__Group__0__Impl"


    // $ANTLR start "rule__Table__Group__1"
    // InternalSheepDog.g:2352:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2356:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalSheepDog.g:2357:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Table__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__2();

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
    // $ANTLR end "rule__Table__Group__1"


    // $ANTLR start "rule__Table__Group__1__Impl"
    // InternalSheepDog.g:2364:1: rule__Table__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2368:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2369:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2369:1: ( RULE_EOL )
            // InternalSheepDog.g:2370:2: RULE_EOL
            {
             before(grammarAccess.getTableAccess().getEOLTerminalRuleCall_1()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getEOLTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Table__Group__1__Impl"


    // $ANTLR start "rule__Table__Group__2"
    // InternalSheepDog.g:2379:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2383:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalSheepDog.g:2384:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Table__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__3();

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
    // $ANTLR end "rule__Table__Group__2"


    // $ANTLR start "rule__Table__Group__2__Impl"
    // InternalSheepDog.g:2391:1: rule__Table__Group__2__Impl : ( '|===' ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2395:1: ( ( '|===' ) )
            // InternalSheepDog.g:2396:1: ( '|===' )
            {
            // InternalSheepDog.g:2396:1: ( '|===' )
            // InternalSheepDog.g:2397:2: '|==='
            {
             before(grammarAccess.getTableAccess().getVerticalLineEqualsSignEqualsSignEqualsSignKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getVerticalLineEqualsSignEqualsSignEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__Table__Group__2__Impl"


    // $ANTLR start "rule__Table__Group__3"
    // InternalSheepDog.g:2406:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2410:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalSheepDog.g:2411:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Table__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__4();

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
    // $ANTLR end "rule__Table__Group__3"


    // $ANTLR start "rule__Table__Group__3__Impl"
    // InternalSheepDog.g:2418:1: rule__Table__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2422:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2423:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2423:1: ( RULE_EOL )
            // InternalSheepDog.g:2424:2: RULE_EOL
            {
             before(grammarAccess.getTableAccess().getEOLTerminalRuleCall_3()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getEOLTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__Table__Group__3__Impl"


    // $ANTLR start "rule__Table__Group__4"
    // InternalSheepDog.g:2433:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2437:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalSheepDog.g:2438:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Table__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__5();

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
    // $ANTLR end "rule__Table__Group__4"


    // $ANTLR start "rule__Table__Group__4__Impl"
    // InternalSheepDog.g:2445:1: rule__Table__Group__4__Impl : ( ( ( rule__Table__RowsAssignment_4 ) ) ( ( rule__Table__RowsAssignment_4 )* ) ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2449:1: ( ( ( ( rule__Table__RowsAssignment_4 ) ) ( ( rule__Table__RowsAssignment_4 )* ) ) )
            // InternalSheepDog.g:2450:1: ( ( ( rule__Table__RowsAssignment_4 ) ) ( ( rule__Table__RowsAssignment_4 )* ) )
            {
            // InternalSheepDog.g:2450:1: ( ( ( rule__Table__RowsAssignment_4 ) ) ( ( rule__Table__RowsAssignment_4 )* ) )
            // InternalSheepDog.g:2451:2: ( ( rule__Table__RowsAssignment_4 ) ) ( ( rule__Table__RowsAssignment_4 )* )
            {
            // InternalSheepDog.g:2451:2: ( ( rule__Table__RowsAssignment_4 ) )
            // InternalSheepDog.g:2452:3: ( rule__Table__RowsAssignment_4 )
            {
             before(grammarAccess.getTableAccess().getRowsAssignment_4()); 
            // InternalSheepDog.g:2453:3: ( rule__Table__RowsAssignment_4 )
            // InternalSheepDog.g:2453:4: rule__Table__RowsAssignment_4
            {
            pushFollow(FOLLOW_25);
            rule__Table__RowsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getRowsAssignment_4()); 

            }

            // InternalSheepDog.g:2456:2: ( ( rule__Table__RowsAssignment_4 )* )
            // InternalSheepDog.g:2457:3: ( rule__Table__RowsAssignment_4 )*
            {
             before(grammarAccess.getTableAccess().getRowsAssignment_4()); 
            // InternalSheepDog.g:2458:3: ( rule__Table__RowsAssignment_4 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==24) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSheepDog.g:2458:4: rule__Table__RowsAssignment_4
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Table__RowsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getRowsAssignment_4()); 

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
    // $ANTLR end "rule__Table__Group__4__Impl"


    // $ANTLR start "rule__Table__Group__5"
    // InternalSheepDog.g:2467:1: rule__Table__Group__5 : rule__Table__Group__5__Impl rule__Table__Group__6 ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2471:1: ( rule__Table__Group__5__Impl rule__Table__Group__6 )
            // InternalSheepDog.g:2472:2: rule__Table__Group__5__Impl rule__Table__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Table__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__6();

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
    // $ANTLR end "rule__Table__Group__5"


    // $ANTLR start "rule__Table__Group__5__Impl"
    // InternalSheepDog.g:2479:1: rule__Table__Group__5__Impl : ( '|===' ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2483:1: ( ( '|===' ) )
            // InternalSheepDog.g:2484:1: ( '|===' )
            {
            // InternalSheepDog.g:2484:1: ( '|===' )
            // InternalSheepDog.g:2485:2: '|==='
            {
             before(grammarAccess.getTableAccess().getVerticalLineEqualsSignEqualsSignEqualsSignKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getVerticalLineEqualsSignEqualsSignEqualsSignKeyword_5()); 

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
    // $ANTLR end "rule__Table__Group__5__Impl"


    // $ANTLR start "rule__Table__Group__6"
    // InternalSheepDog.g:2494:1: rule__Table__Group__6 : rule__Table__Group__6__Impl ;
    public final void rule__Table__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2498:1: ( rule__Table__Group__6__Impl )
            // InternalSheepDog.g:2499:2: rule__Table__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__6__Impl();

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
    // $ANTLR end "rule__Table__Group__6"


    // $ANTLR start "rule__Table__Group__6__Impl"
    // InternalSheepDog.g:2505:1: rule__Table__Group__6__Impl : ( RULE_EOL ) ;
    public final void rule__Table__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2509:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2510:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2510:1: ( RULE_EOL )
            // InternalSheepDog.g:2511:2: RULE_EOL
            {
             before(grammarAccess.getTableAccess().getEOLTerminalRuleCall_6()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getEOLTerminalRuleCall_6()); 

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
    // $ANTLR end "rule__Table__Group__6__Impl"


    // $ANTLR start "rule__Row__Group__0"
    // InternalSheepDog.g:2521:1: rule__Row__Group__0 : rule__Row__Group__0__Impl rule__Row__Group__1 ;
    public final void rule__Row__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2525:1: ( rule__Row__Group__0__Impl rule__Row__Group__1 )
            // InternalSheepDog.g:2526:2: rule__Row__Group__0__Impl rule__Row__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Row__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__1();

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
    // $ANTLR end "rule__Row__Group__0"


    // $ANTLR start "rule__Row__Group__0__Impl"
    // InternalSheepDog.g:2533:1: rule__Row__Group__0__Impl : ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) ) ;
    public final void rule__Row__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2537:1: ( ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) ) )
            // InternalSheepDog.g:2538:1: ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) )
            {
            // InternalSheepDog.g:2538:1: ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) )
            // InternalSheepDog.g:2539:2: ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* )
            {
            // InternalSheepDog.g:2539:2: ( ( rule__Row__CellsAssignment_0 ) )
            // InternalSheepDog.g:2540:3: ( rule__Row__CellsAssignment_0 )
            {
             before(grammarAccess.getRowAccess().getCellsAssignment_0()); 
            // InternalSheepDog.g:2541:3: ( rule__Row__CellsAssignment_0 )
            // InternalSheepDog.g:2541:4: rule__Row__CellsAssignment_0
            {
            pushFollow(FOLLOW_25);
            rule__Row__CellsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getCellsAssignment_0()); 

            }

            // InternalSheepDog.g:2544:2: ( ( rule__Row__CellsAssignment_0 )* )
            // InternalSheepDog.g:2545:3: ( rule__Row__CellsAssignment_0 )*
            {
             before(grammarAccess.getRowAccess().getCellsAssignment_0()); 
            // InternalSheepDog.g:2546:3: ( rule__Row__CellsAssignment_0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==24) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSheepDog.g:2546:4: rule__Row__CellsAssignment_0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Row__CellsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getRowAccess().getCellsAssignment_0()); 

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
    // $ANTLR end "rule__Row__Group__0__Impl"


    // $ANTLR start "rule__Row__Group__1"
    // InternalSheepDog.g:2555:1: rule__Row__Group__1 : rule__Row__Group__1__Impl ;
    public final void rule__Row__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2559:1: ( rule__Row__Group__1__Impl )
            // InternalSheepDog.g:2560:2: rule__Row__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group__1__Impl();

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
    // $ANTLR end "rule__Row__Group__1"


    // $ANTLR start "rule__Row__Group__1__Impl"
    // InternalSheepDog.g:2566:1: rule__Row__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Row__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2570:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2571:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2571:1: ( RULE_EOL )
            // InternalSheepDog.g:2572:2: RULE_EOL
            {
             before(grammarAccess.getRowAccess().getEOLTerminalRuleCall_1()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getEOLTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Row__Group__1__Impl"


    // $ANTLR start "rule__Cell__Group__0"
    // InternalSheepDog.g:2582:1: rule__Cell__Group__0 : rule__Cell__Group__0__Impl rule__Cell__Group__1 ;
    public final void rule__Cell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2586:1: ( rule__Cell__Group__0__Impl rule__Cell__Group__1 )
            // InternalSheepDog.g:2587:2: rule__Cell__Group__0__Impl rule__Cell__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Cell__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group__1();

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
    // $ANTLR end "rule__Cell__Group__0"


    // $ANTLR start "rule__Cell__Group__0__Impl"
    // InternalSheepDog.g:2594:1: rule__Cell__Group__0__Impl : ( '|' ) ;
    public final void rule__Cell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2598:1: ( ( '|' ) )
            // InternalSheepDog.g:2599:1: ( '|' )
            {
            // InternalSheepDog.g:2599:1: ( '|' )
            // InternalSheepDog.g:2600:2: '|'
            {
             before(grammarAccess.getCellAccess().getVerticalLineKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getVerticalLineKeyword_0()); 

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
    // $ANTLR end "rule__Cell__Group__0__Impl"


    // $ANTLR start "rule__Cell__Group__1"
    // InternalSheepDog.g:2609:1: rule__Cell__Group__1 : rule__Cell__Group__1__Impl ;
    public final void rule__Cell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2613:1: ( rule__Cell__Group__1__Impl )
            // InternalSheepDog.g:2614:2: rule__Cell__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cell__Group__1__Impl();

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
    // $ANTLR end "rule__Cell__Group__1"


    // $ANTLR start "rule__Cell__Group__1__Impl"
    // InternalSheepDog.g:2620:1: rule__Cell__Group__1__Impl : ( ( rule__Cell__NameAssignment_1 ) ) ;
    public final void rule__Cell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2624:1: ( ( ( rule__Cell__NameAssignment_1 ) ) )
            // InternalSheepDog.g:2625:1: ( ( rule__Cell__NameAssignment_1 ) )
            {
            // InternalSheepDog.g:2625:1: ( ( rule__Cell__NameAssignment_1 ) )
            // InternalSheepDog.g:2626:2: ( rule__Cell__NameAssignment_1 )
            {
             before(grammarAccess.getCellAccess().getNameAssignment_1()); 
            // InternalSheepDog.g:2627:2: ( rule__Cell__NameAssignment_1 )
            // InternalSheepDog.g:2627:3: rule__Cell__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Cell__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Cell__Group__1__Impl"


    // $ANTLR start "rule__Statement__Group__0"
    // InternalSheepDog.g:2636:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2640:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalSheepDog.g:2641:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSheepDog.g:2648:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__NameAssignment_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2652:1: ( ( ( rule__Statement__NameAssignment_0 ) ) )
            // InternalSheepDog.g:2653:1: ( ( rule__Statement__NameAssignment_0 ) )
            {
            // InternalSheepDog.g:2653:1: ( ( rule__Statement__NameAssignment_0 ) )
            // InternalSheepDog.g:2654:2: ( rule__Statement__NameAssignment_0 )
            {
             before(grammarAccess.getStatementAccess().getNameAssignment_0()); 
            // InternalSheepDog.g:2655:2: ( rule__Statement__NameAssignment_0 )
            // InternalSheepDog.g:2655:3: rule__Statement__NameAssignment_0
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
    // InternalSheepDog.g:2663:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2667:1: ( rule__Statement__Group__1__Impl )
            // InternalSheepDog.g:2668:2: rule__Statement__Group__1__Impl
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
    // InternalSheepDog.g:2674:1: rule__Statement__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2678:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2679:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2679:1: ( RULE_EOL )
            // InternalSheepDog.g:2680:2: RULE_EOL
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


    // $ANTLR start "rule__StepObject__Group__0"
    // InternalSheepDog.g:2690:1: rule__StepObject__Group__0 : rule__StepObject__Group__0__Impl rule__StepObject__Group__1 ;
    public final void rule__StepObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2694:1: ( rule__StepObject__Group__0__Impl rule__StepObject__Group__1 )
            // InternalSheepDog.g:2695:2: rule__StepObject__Group__0__Impl rule__StepObject__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__StepObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepObject__Group__1();

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
    // $ANTLR end "rule__StepObject__Group__0"


    // $ANTLR start "rule__StepObject__Group__0__Impl"
    // InternalSheepDog.g:2702:1: rule__StepObject__Group__0__Impl : ( '=' ) ;
    public final void rule__StepObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2706:1: ( ( '=' ) )
            // InternalSheepDog.g:2707:1: ( '=' )
            {
            // InternalSheepDog.g:2707:1: ( '=' )
            // InternalSheepDog.g:2708:2: '='
            {
             before(grammarAccess.getStepObjectAccess().getEqualsSignKeyword_0()); 
            match(input,10,FOLLOW_2); 
             after(grammarAccess.getStepObjectAccess().getEqualsSignKeyword_0()); 

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
    // $ANTLR end "rule__StepObject__Group__0__Impl"


    // $ANTLR start "rule__StepObject__Group__1"
    // InternalSheepDog.g:2717:1: rule__StepObject__Group__1 : rule__StepObject__Group__1__Impl rule__StepObject__Group__2 ;
    public final void rule__StepObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2721:1: ( rule__StepObject__Group__1__Impl rule__StepObject__Group__2 )
            // InternalSheepDog.g:2722:2: rule__StepObject__Group__1__Impl rule__StepObject__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__StepObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepObject__Group__2();

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
    // $ANTLR end "rule__StepObject__Group__1"


    // $ANTLR start "rule__StepObject__Group__1__Impl"
    // InternalSheepDog.g:2729:1: rule__StepObject__Group__1__Impl : ( ( rule__StepObject__NameAssignment_1 ) ) ;
    public final void rule__StepObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2733:1: ( ( ( rule__StepObject__NameAssignment_1 ) ) )
            // InternalSheepDog.g:2734:1: ( ( rule__StepObject__NameAssignment_1 ) )
            {
            // InternalSheepDog.g:2734:1: ( ( rule__StepObject__NameAssignment_1 ) )
            // InternalSheepDog.g:2735:2: ( rule__StepObject__NameAssignment_1 )
            {
             before(grammarAccess.getStepObjectAccess().getNameAssignment_1()); 
            // InternalSheepDog.g:2736:2: ( rule__StepObject__NameAssignment_1 )
            // InternalSheepDog.g:2736:3: rule__StepObject__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StepObject__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStepObjectAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__StepObject__Group__1__Impl"


    // $ANTLR start "rule__StepObject__Group__2"
    // InternalSheepDog.g:2744:1: rule__StepObject__Group__2 : rule__StepObject__Group__2__Impl rule__StepObject__Group__3 ;
    public final void rule__StepObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2748:1: ( rule__StepObject__Group__2__Impl rule__StepObject__Group__3 )
            // InternalSheepDog.g:2749:2: rule__StepObject__Group__2__Impl rule__StepObject__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__StepObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepObject__Group__3();

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
    // $ANTLR end "rule__StepObject__Group__2"


    // $ANTLR start "rule__StepObject__Group__2__Impl"
    // InternalSheepDog.g:2756:1: rule__StepObject__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__StepObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2760:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2761:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2761:1: ( RULE_EOL )
            // InternalSheepDog.g:2762:2: RULE_EOL
            {
             before(grammarAccess.getStepObjectAccess().getEOLTerminalRuleCall_2()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getStepObjectAccess().getEOLTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__StepObject__Group__2__Impl"


    // $ANTLR start "rule__StepObject__Group__3"
    // InternalSheepDog.g:2771:1: rule__StepObject__Group__3 : rule__StepObject__Group__3__Impl rule__StepObject__Group__4 ;
    public final void rule__StepObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2775:1: ( rule__StepObject__Group__3__Impl rule__StepObject__Group__4 )
            // InternalSheepDog.g:2776:2: rule__StepObject__Group__3__Impl rule__StepObject__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__StepObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepObject__Group__4();

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
    // $ANTLR end "rule__StepObject__Group__3"


    // $ANTLR start "rule__StepObject__Group__3__Impl"
    // InternalSheepDog.g:2783:1: rule__StepObject__Group__3__Impl : ( ( rule__StepObject__StatementsAssignment_3 )* ) ;
    public final void rule__StepObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2787:1: ( ( ( rule__StepObject__StatementsAssignment_3 )* ) )
            // InternalSheepDog.g:2788:1: ( ( rule__StepObject__StatementsAssignment_3 )* )
            {
            // InternalSheepDog.g:2788:1: ( ( rule__StepObject__StatementsAssignment_3 )* )
            // InternalSheepDog.g:2789:2: ( rule__StepObject__StatementsAssignment_3 )*
            {
             before(grammarAccess.getStepObjectAccess().getStatementsAssignment_3()); 
            // InternalSheepDog.g:2790:2: ( rule__StepObject__StatementsAssignment_3 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_WORD && LA26_0<=RULE_STRING)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSheepDog.g:2790:3: rule__StepObject__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__StepObject__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getStepObjectAccess().getStatementsAssignment_3()); 

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
    // $ANTLR end "rule__StepObject__Group__3__Impl"


    // $ANTLR start "rule__StepObject__Group__4"
    // InternalSheepDog.g:2798:1: rule__StepObject__Group__4 : rule__StepObject__Group__4__Impl ;
    public final void rule__StepObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2802:1: ( rule__StepObject__Group__4__Impl )
            // InternalSheepDog.g:2803:2: rule__StepObject__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StepObject__Group__4__Impl();

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
    // $ANTLR end "rule__StepObject__Group__4"


    // $ANTLR start "rule__StepObject__Group__4__Impl"
    // InternalSheepDog.g:2809:1: rule__StepObject__Group__4__Impl : ( ( rule__StepObject__StepDefinitionsAssignment_4 )* ) ;
    public final void rule__StepObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2813:1: ( ( ( rule__StepObject__StepDefinitionsAssignment_4 )* ) )
            // InternalSheepDog.g:2814:1: ( ( rule__StepObject__StepDefinitionsAssignment_4 )* )
            {
            // InternalSheepDog.g:2814:1: ( ( rule__StepObject__StepDefinitionsAssignment_4 )* )
            // InternalSheepDog.g:2815:2: ( rule__StepObject__StepDefinitionsAssignment_4 )*
            {
             before(grammarAccess.getStepObjectAccess().getStepDefinitionsAssignment_4()); 
            // InternalSheepDog.g:2816:2: ( rule__StepObject__StepDefinitionsAssignment_4 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==12) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSheepDog.g:2816:3: rule__StepObject__StepDefinitionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__StepObject__StepDefinitionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getStepObjectAccess().getStepDefinitionsAssignment_4()); 

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
    // $ANTLR end "rule__StepObject__Group__4__Impl"


    // $ANTLR start "rule__StepDefinition__Group__0"
    // InternalSheepDog.g:2825:1: rule__StepDefinition__Group__0 : rule__StepDefinition__Group__0__Impl rule__StepDefinition__Group__1 ;
    public final void rule__StepDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2829:1: ( rule__StepDefinition__Group__0__Impl rule__StepDefinition__Group__1 )
            // InternalSheepDog.g:2830:2: rule__StepDefinition__Group__0__Impl rule__StepDefinition__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__StepDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepDefinition__Group__1();

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
    // $ANTLR end "rule__StepDefinition__Group__0"


    // $ANTLR start "rule__StepDefinition__Group__0__Impl"
    // InternalSheepDog.g:2837:1: rule__StepDefinition__Group__0__Impl : ( '==' ) ;
    public final void rule__StepDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2841:1: ( ( '==' ) )
            // InternalSheepDog.g:2842:1: ( '==' )
            {
            // InternalSheepDog.g:2842:1: ( '==' )
            // InternalSheepDog.g:2843:2: '=='
            {
             before(grammarAccess.getStepDefinitionAccess().getEqualsSignEqualsSignKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getStepDefinitionAccess().getEqualsSignEqualsSignKeyword_0()); 

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
    // $ANTLR end "rule__StepDefinition__Group__0__Impl"


    // $ANTLR start "rule__StepDefinition__Group__1"
    // InternalSheepDog.g:2852:1: rule__StepDefinition__Group__1 : rule__StepDefinition__Group__1__Impl rule__StepDefinition__Group__2 ;
    public final void rule__StepDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2856:1: ( rule__StepDefinition__Group__1__Impl rule__StepDefinition__Group__2 )
            // InternalSheepDog.g:2857:2: rule__StepDefinition__Group__1__Impl rule__StepDefinition__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__StepDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepDefinition__Group__2();

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
    // $ANTLR end "rule__StepDefinition__Group__1"


    // $ANTLR start "rule__StepDefinition__Group__1__Impl"
    // InternalSheepDog.g:2864:1: rule__StepDefinition__Group__1__Impl : ( ( rule__StepDefinition__NameAssignment_1 ) ) ;
    public final void rule__StepDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2868:1: ( ( ( rule__StepDefinition__NameAssignment_1 ) ) )
            // InternalSheepDog.g:2869:1: ( ( rule__StepDefinition__NameAssignment_1 ) )
            {
            // InternalSheepDog.g:2869:1: ( ( rule__StepDefinition__NameAssignment_1 ) )
            // InternalSheepDog.g:2870:2: ( rule__StepDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getStepDefinitionAccess().getNameAssignment_1()); 
            // InternalSheepDog.g:2871:2: ( rule__StepDefinition__NameAssignment_1 )
            // InternalSheepDog.g:2871:3: rule__StepDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StepDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStepDefinitionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__StepDefinition__Group__1__Impl"


    // $ANTLR start "rule__StepDefinition__Group__2"
    // InternalSheepDog.g:2879:1: rule__StepDefinition__Group__2 : rule__StepDefinition__Group__2__Impl rule__StepDefinition__Group__3 ;
    public final void rule__StepDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2883:1: ( rule__StepDefinition__Group__2__Impl rule__StepDefinition__Group__3 )
            // InternalSheepDog.g:2884:2: rule__StepDefinition__Group__2__Impl rule__StepDefinition__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__StepDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepDefinition__Group__3();

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
    // $ANTLR end "rule__StepDefinition__Group__2"


    // $ANTLR start "rule__StepDefinition__Group__2__Impl"
    // InternalSheepDog.g:2891:1: rule__StepDefinition__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__StepDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2895:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2896:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2896:1: ( RULE_EOL )
            // InternalSheepDog.g:2897:2: RULE_EOL
            {
             before(grammarAccess.getStepDefinitionAccess().getEOLTerminalRuleCall_2()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getStepDefinitionAccess().getEOLTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__StepDefinition__Group__2__Impl"


    // $ANTLR start "rule__StepDefinition__Group__3"
    // InternalSheepDog.g:2906:1: rule__StepDefinition__Group__3 : rule__StepDefinition__Group__3__Impl rule__StepDefinition__Group__4 ;
    public final void rule__StepDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2910:1: ( rule__StepDefinition__Group__3__Impl rule__StepDefinition__Group__4 )
            // InternalSheepDog.g:2911:2: rule__StepDefinition__Group__3__Impl rule__StepDefinition__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__StepDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepDefinition__Group__4();

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
    // $ANTLR end "rule__StepDefinition__Group__3"


    // $ANTLR start "rule__StepDefinition__Group__3__Impl"
    // InternalSheepDog.g:2918:1: rule__StepDefinition__Group__3__Impl : ( ( rule__StepDefinition__StatementsAssignment_3 )* ) ;
    public final void rule__StepDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2922:1: ( ( ( rule__StepDefinition__StatementsAssignment_3 )* ) )
            // InternalSheepDog.g:2923:1: ( ( rule__StepDefinition__StatementsAssignment_3 )* )
            {
            // InternalSheepDog.g:2923:1: ( ( rule__StepDefinition__StatementsAssignment_3 )* )
            // InternalSheepDog.g:2924:2: ( rule__StepDefinition__StatementsAssignment_3 )*
            {
             before(grammarAccess.getStepDefinitionAccess().getStatementsAssignment_3()); 
            // InternalSheepDog.g:2925:2: ( rule__StepDefinition__StatementsAssignment_3 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_WORD && LA28_0<=RULE_STRING)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSheepDog.g:2925:3: rule__StepDefinition__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__StepDefinition__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getStepDefinitionAccess().getStatementsAssignment_3()); 

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
    // $ANTLR end "rule__StepDefinition__Group__3__Impl"


    // $ANTLR start "rule__StepDefinition__Group__4"
    // InternalSheepDog.g:2933:1: rule__StepDefinition__Group__4 : rule__StepDefinition__Group__4__Impl ;
    public final void rule__StepDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2937:1: ( rule__StepDefinition__Group__4__Impl )
            // InternalSheepDog.g:2938:2: rule__StepDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StepDefinition__Group__4__Impl();

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
    // $ANTLR end "rule__StepDefinition__Group__4"


    // $ANTLR start "rule__StepDefinition__Group__4__Impl"
    // InternalSheepDog.g:2944:1: rule__StepDefinition__Group__4__Impl : ( ( rule__StepDefinition__StepParametersAssignment_4 )* ) ;
    public final void rule__StepDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2948:1: ( ( ( rule__StepDefinition__StepParametersAssignment_4 )* ) )
            // InternalSheepDog.g:2949:1: ( ( rule__StepDefinition__StepParametersAssignment_4 )* )
            {
            // InternalSheepDog.g:2949:1: ( ( rule__StepDefinition__StepParametersAssignment_4 )* )
            // InternalSheepDog.g:2950:2: ( rule__StepDefinition__StepParametersAssignment_4 )*
            {
             before(grammarAccess.getStepDefinitionAccess().getStepParametersAssignment_4()); 
            // InternalSheepDog.g:2951:2: ( rule__StepDefinition__StepParametersAssignment_4 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==14) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSheepDog.g:2951:3: rule__StepDefinition__StepParametersAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__StepDefinition__StepParametersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getStepDefinitionAccess().getStepParametersAssignment_4()); 

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
    // $ANTLR end "rule__StepDefinition__Group__4__Impl"


    // $ANTLR start "rule__StepParameters__Group__0"
    // InternalSheepDog.g:2960:1: rule__StepParameters__Group__0 : rule__StepParameters__Group__0__Impl rule__StepParameters__Group__1 ;
    public final void rule__StepParameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2964:1: ( rule__StepParameters__Group__0__Impl rule__StepParameters__Group__1 )
            // InternalSheepDog.g:2965:2: rule__StepParameters__Group__0__Impl rule__StepParameters__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__StepParameters__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepParameters__Group__1();

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
    // $ANTLR end "rule__StepParameters__Group__0"


    // $ANTLR start "rule__StepParameters__Group__0__Impl"
    // InternalSheepDog.g:2972:1: rule__StepParameters__Group__0__Impl : ( '===' ) ;
    public final void rule__StepParameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2976:1: ( ( '===' ) )
            // InternalSheepDog.g:2977:1: ( '===' )
            {
            // InternalSheepDog.g:2977:1: ( '===' )
            // InternalSheepDog.g:2978:2: '==='
            {
             before(grammarAccess.getStepParametersAccess().getEqualsSignEqualsSignEqualsSignKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getStepParametersAccess().getEqualsSignEqualsSignEqualsSignKeyword_0()); 

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
    // $ANTLR end "rule__StepParameters__Group__0__Impl"


    // $ANTLR start "rule__StepParameters__Group__1"
    // InternalSheepDog.g:2987:1: rule__StepParameters__Group__1 : rule__StepParameters__Group__1__Impl rule__StepParameters__Group__2 ;
    public final void rule__StepParameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2991:1: ( rule__StepParameters__Group__1__Impl rule__StepParameters__Group__2 )
            // InternalSheepDog.g:2992:2: rule__StepParameters__Group__1__Impl rule__StepParameters__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__StepParameters__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepParameters__Group__2();

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
    // $ANTLR end "rule__StepParameters__Group__1"


    // $ANTLR start "rule__StepParameters__Group__1__Impl"
    // InternalSheepDog.g:2999:1: rule__StepParameters__Group__1__Impl : ( ( rule__StepParameters__NameAssignment_1 ) ) ;
    public final void rule__StepParameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3003:1: ( ( ( rule__StepParameters__NameAssignment_1 ) ) )
            // InternalSheepDog.g:3004:1: ( ( rule__StepParameters__NameAssignment_1 ) )
            {
            // InternalSheepDog.g:3004:1: ( ( rule__StepParameters__NameAssignment_1 ) )
            // InternalSheepDog.g:3005:2: ( rule__StepParameters__NameAssignment_1 )
            {
             before(grammarAccess.getStepParametersAccess().getNameAssignment_1()); 
            // InternalSheepDog.g:3006:2: ( rule__StepParameters__NameAssignment_1 )
            // InternalSheepDog.g:3006:3: rule__StepParameters__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StepParameters__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStepParametersAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__StepParameters__Group__1__Impl"


    // $ANTLR start "rule__StepParameters__Group__2"
    // InternalSheepDog.g:3014:1: rule__StepParameters__Group__2 : rule__StepParameters__Group__2__Impl rule__StepParameters__Group__3 ;
    public final void rule__StepParameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3018:1: ( rule__StepParameters__Group__2__Impl rule__StepParameters__Group__3 )
            // InternalSheepDog.g:3019:2: rule__StepParameters__Group__2__Impl rule__StepParameters__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__StepParameters__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepParameters__Group__3();

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
    // $ANTLR end "rule__StepParameters__Group__2"


    // $ANTLR start "rule__StepParameters__Group__2__Impl"
    // InternalSheepDog.g:3026:1: rule__StepParameters__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__StepParameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3030:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:3031:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:3031:1: ( RULE_EOL )
            // InternalSheepDog.g:3032:2: RULE_EOL
            {
             before(grammarAccess.getStepParametersAccess().getEOLTerminalRuleCall_2()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getStepParametersAccess().getEOLTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__StepParameters__Group__2__Impl"


    // $ANTLR start "rule__StepParameters__Group__3"
    // InternalSheepDog.g:3041:1: rule__StepParameters__Group__3 : rule__StepParameters__Group__3__Impl rule__StepParameters__Group__4 ;
    public final void rule__StepParameters__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3045:1: ( rule__StepParameters__Group__3__Impl rule__StepParameters__Group__4 )
            // InternalSheepDog.g:3046:2: rule__StepParameters__Group__3__Impl rule__StepParameters__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__StepParameters__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepParameters__Group__4();

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
    // $ANTLR end "rule__StepParameters__Group__3"


    // $ANTLR start "rule__StepParameters__Group__3__Impl"
    // InternalSheepDog.g:3053:1: rule__StepParameters__Group__3__Impl : ( ( rule__StepParameters__StatementsAssignment_3 )* ) ;
    public final void rule__StepParameters__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3057:1: ( ( ( rule__StepParameters__StatementsAssignment_3 )* ) )
            // InternalSheepDog.g:3058:1: ( ( rule__StepParameters__StatementsAssignment_3 )* )
            {
            // InternalSheepDog.g:3058:1: ( ( rule__StepParameters__StatementsAssignment_3 )* )
            // InternalSheepDog.g:3059:2: ( rule__StepParameters__StatementsAssignment_3 )*
            {
             before(grammarAccess.getStepParametersAccess().getStatementsAssignment_3()); 
            // InternalSheepDog.g:3060:2: ( rule__StepParameters__StatementsAssignment_3 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_WORD && LA30_0<=RULE_STRING)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSheepDog.g:3060:3: rule__StepParameters__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__StepParameters__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getStepParametersAccess().getStatementsAssignment_3()); 

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
    // $ANTLR end "rule__StepParameters__Group__3__Impl"


    // $ANTLR start "rule__StepParameters__Group__4"
    // InternalSheepDog.g:3068:1: rule__StepParameters__Group__4 : rule__StepParameters__Group__4__Impl ;
    public final void rule__StepParameters__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3072:1: ( rule__StepParameters__Group__4__Impl )
            // InternalSheepDog.g:3073:2: rule__StepParameters__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StepParameters__Group__4__Impl();

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
    // $ANTLR end "rule__StepParameters__Group__4"


    // $ANTLR start "rule__StepParameters__Group__4__Impl"
    // InternalSheepDog.g:3079:1: rule__StepParameters__Group__4__Impl : ( ( rule__StepParameters__ParametersTableAssignment_4 ) ) ;
    public final void rule__StepParameters__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3083:1: ( ( ( rule__StepParameters__ParametersTableAssignment_4 ) ) )
            // InternalSheepDog.g:3084:1: ( ( rule__StepParameters__ParametersTableAssignment_4 ) )
            {
            // InternalSheepDog.g:3084:1: ( ( rule__StepParameters__ParametersTableAssignment_4 ) )
            // InternalSheepDog.g:3085:2: ( rule__StepParameters__ParametersTableAssignment_4 )
            {
             before(grammarAccess.getStepParametersAccess().getParametersTableAssignment_4()); 
            // InternalSheepDog.g:3086:2: ( rule__StepParameters__ParametersTableAssignment_4 )
            // InternalSheepDog.g:3086:3: rule__StepParameters__ParametersTableAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__StepParameters__ParametersTableAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStepParametersAccess().getParametersTableAssignment_4()); 

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
    // $ANTLR end "rule__StepParameters__Group__4__Impl"


    // $ANTLR start "rule__Feature__TagsAssignment_0"
    // InternalSheepDog.g:3095:1: rule__Feature__TagsAssignment_0 : ( ruleFeatureTags ) ;
    public final void rule__Feature__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3099:1: ( ( ruleFeatureTags ) )
            // InternalSheepDog.g:3100:2: ( ruleFeatureTags )
            {
            // InternalSheepDog.g:3100:2: ( ruleFeatureTags )
            // InternalSheepDog.g:3101:3: ruleFeatureTags
            {
             before(grammarAccess.getFeatureAccess().getTagsFeatureTagsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureTags();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getTagsFeatureTagsParserRuleCall_0_0()); 

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


    // $ANTLR start "rule__Feature__NameAssignment_2"
    // InternalSheepDog.g:3110:1: rule__Feature__NameAssignment_2 : ( rulePhrase ) ;
    public final void rule__Feature__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3114:1: ( ( rulePhrase ) )
            // InternalSheepDog.g:3115:2: ( rulePhrase )
            {
            // InternalSheepDog.g:3115:2: ( rulePhrase )
            // InternalSheepDog.g:3116:3: rulePhrase
            {
             before(grammarAccess.getFeatureAccess().getNamePhraseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getNamePhraseParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Feature__NameAssignment_2"


    // $ANTLR start "rule__Feature__StatementsAssignment_4"
    // InternalSheepDog.g:3125:1: rule__Feature__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__Feature__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3129:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3130:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3130:2: ( ruleStatement )
            // InternalSheepDog.g:3131:3: ruleStatement
            {
             before(grammarAccess.getFeatureAccess().getStatementsStatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getStatementsStatementParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Feature__StatementsAssignment_4"


    // $ANTLR start "rule__Feature__BackgroundAssignment_5"
    // InternalSheepDog.g:3140:1: rule__Feature__BackgroundAssignment_5 : ( ruleBackground ) ;
    public final void rule__Feature__BackgroundAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3144:1: ( ( ruleBackground ) )
            // InternalSheepDog.g:3145:2: ( ruleBackground )
            {
            // InternalSheepDog.g:3145:2: ( ruleBackground )
            // InternalSheepDog.g:3146:3: ruleBackground
            {
             before(grammarAccess.getFeatureAccess().getBackgroundBackgroundParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleBackground();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getBackgroundBackgroundParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Feature__BackgroundAssignment_5"


    // $ANTLR start "rule__Feature__ScenariosAssignment_6"
    // InternalSheepDog.g:3155:1: rule__Feature__ScenariosAssignment_6 : ( ruleScenario ) ;
    public final void rule__Feature__ScenariosAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3159:1: ( ( ruleScenario ) )
            // InternalSheepDog.g:3160:2: ( ruleScenario )
            {
            // InternalSheepDog.g:3160:2: ( ruleScenario )
            // InternalSheepDog.g:3161:3: ruleScenario
            {
             before(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Feature__ScenariosAssignment_6"


    // $ANTLR start "rule__Background__NameAssignment_3"
    // InternalSheepDog.g:3170:1: rule__Background__NameAssignment_3 : ( rulePhrase ) ;
    public final void rule__Background__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3174:1: ( ( rulePhrase ) )
            // InternalSheepDog.g:3175:2: ( rulePhrase )
            {
            // InternalSheepDog.g:3175:2: ( rulePhrase )
            // InternalSheepDog.g:3176:3: rulePhrase
            {
             before(grammarAccess.getBackgroundAccess().getNamePhraseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getNamePhraseParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Background__NameAssignment_3"


    // $ANTLR start "rule__Background__StatementsAssignment_5"
    // InternalSheepDog.g:3185:1: rule__Background__StatementsAssignment_5 : ( ruleStatement ) ;
    public final void rule__Background__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3189:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3190:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3190:2: ( ruleStatement )
            // InternalSheepDog.g:3191:3: ruleStatement
            {
             before(grammarAccess.getBackgroundAccess().getStatementsStatementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getStatementsStatementParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Background__StatementsAssignment_5"


    // $ANTLR start "rule__Background__StepsAssignment_6"
    // InternalSheepDog.g:3200:1: rule__Background__StepsAssignment_6 : ( ruleStep ) ;
    public final void rule__Background__StepsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3204:1: ( ( ruleStep ) )
            // InternalSheepDog.g:3205:2: ( ruleStep )
            {
            // InternalSheepDog.g:3205:2: ( ruleStep )
            // InternalSheepDog.g:3206:3: ruleStep
            {
             before(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Background__StepsAssignment_6"


    // $ANTLR start "rule__Scenario__TagsAssignment_0"
    // InternalSheepDog.g:3215:1: rule__Scenario__TagsAssignment_0 : ( ruleScenarioTags ) ;
    public final void rule__Scenario__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3219:1: ( ( ruleScenarioTags ) )
            // InternalSheepDog.g:3220:2: ( ruleScenarioTags )
            {
            // InternalSheepDog.g:3220:2: ( ruleScenarioTags )
            // InternalSheepDog.g:3221:3: ruleScenarioTags
            {
             before(grammarAccess.getScenarioAccess().getTagsScenarioTagsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleScenarioTags();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getTagsScenarioTagsParserRuleCall_0_0()); 

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


    // $ANTLR start "rule__Scenario__NameAssignment_2"
    // InternalSheepDog.g:3230:1: rule__Scenario__NameAssignment_2 : ( rulePhrase ) ;
    public final void rule__Scenario__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3234:1: ( ( rulePhrase ) )
            // InternalSheepDog.g:3235:2: ( rulePhrase )
            {
            // InternalSheepDog.g:3235:2: ( rulePhrase )
            // InternalSheepDog.g:3236:3: rulePhrase
            {
             before(grammarAccess.getScenarioAccess().getNamePhraseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getNamePhraseParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Scenario__NameAssignment_2"


    // $ANTLR start "rule__Scenario__StatementsAssignment_4"
    // InternalSheepDog.g:3245:1: rule__Scenario__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__Scenario__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3249:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3250:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3250:2: ( ruleStatement )
            // InternalSheepDog.g:3251:3: ruleStatement
            {
             before(grammarAccess.getScenarioAccess().getStatementsStatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getStatementsStatementParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Scenario__StatementsAssignment_4"


    // $ANTLR start "rule__Scenario__StepsAssignment_5"
    // InternalSheepDog.g:3260:1: rule__Scenario__StepsAssignment_5 : ( ruleStep ) ;
    public final void rule__Scenario__StepsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3264:1: ( ( ruleStep ) )
            // InternalSheepDog.g:3265:2: ( ruleStep )
            {
            // InternalSheepDog.g:3265:2: ( ruleStep )
            // InternalSheepDog.g:3266:3: ruleStep
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


    // $ANTLR start "rule__Scenario__ExamplesAssignment_6"
    // InternalSheepDog.g:3275:1: rule__Scenario__ExamplesAssignment_6 : ( ruleExamples ) ;
    public final void rule__Scenario__ExamplesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3279:1: ( ( ruleExamples ) )
            // InternalSheepDog.g:3280:2: ( ruleExamples )
            {
            // InternalSheepDog.g:3280:2: ( ruleExamples )
            // InternalSheepDog.g:3281:3: ruleExamples
            {
             before(grammarAccess.getScenarioAccess().getExamplesExamplesParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExamples();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getExamplesExamplesParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Scenario__ExamplesAssignment_6"


    // $ANTLR start "rule__Examples__NameAssignment_3"
    // InternalSheepDog.g:3290:1: rule__Examples__NameAssignment_3 : ( rulePhrase ) ;
    public final void rule__Examples__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3294:1: ( ( rulePhrase ) )
            // InternalSheepDog.g:3295:2: ( rulePhrase )
            {
            // InternalSheepDog.g:3295:2: ( rulePhrase )
            // InternalSheepDog.g:3296:3: rulePhrase
            {
             before(grammarAccess.getExamplesAccess().getNamePhraseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getExamplesAccess().getNamePhraseParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Examples__NameAssignment_3"


    // $ANTLR start "rule__Examples__StatementsAssignment_5"
    // InternalSheepDog.g:3305:1: rule__Examples__StatementsAssignment_5 : ( ruleStatement ) ;
    public final void rule__Examples__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3309:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3310:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3310:2: ( ruleStatement )
            // InternalSheepDog.g:3311:3: ruleStatement
            {
             before(grammarAccess.getExamplesAccess().getStatementsStatementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getExamplesAccess().getStatementsStatementParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Examples__StatementsAssignment_5"


    // $ANTLR start "rule__Examples__TheExamplesTableAssignment_6"
    // InternalSheepDog.g:3320:1: rule__Examples__TheExamplesTableAssignment_6 : ( ruleTable ) ;
    public final void rule__Examples__TheExamplesTableAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3324:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3325:2: ( ruleTable )
            {
            // InternalSheepDog.g:3325:2: ( ruleTable )
            // InternalSheepDog.g:3326:3: ruleTable
            {
             before(grammarAccess.getExamplesAccess().getTheExamplesTableTableParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getExamplesAccess().getTheExamplesTableTableParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Examples__TheExamplesTableAssignment_6"


    // $ANTLR start "rule__ScenarioTags__NameAssignment_1"
    // InternalSheepDog.g:3335:1: rule__ScenarioTags__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__ScenarioTags__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3339:1: ( ( rulePhrase ) )
            // InternalSheepDog.g:3340:2: ( rulePhrase )
            {
            // InternalSheepDog.g:3340:2: ( rulePhrase )
            // InternalSheepDog.g:3341:3: rulePhrase
            {
             before(grammarAccess.getScenarioTagsAccess().getNamePhraseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getScenarioTagsAccess().getNamePhraseParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ScenarioTags__NameAssignment_1"


    // $ANTLR start "rule__FeatureTags__NameAssignment_1"
    // InternalSheepDog.g:3350:1: rule__FeatureTags__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__FeatureTags__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3354:1: ( ( rulePhrase ) )
            // InternalSheepDog.g:3355:2: ( rulePhrase )
            {
            // InternalSheepDog.g:3355:2: ( rulePhrase )
            // InternalSheepDog.g:3356:3: rulePhrase
            {
             before(grammarAccess.getFeatureTagsAccess().getNamePhraseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getFeatureTagsAccess().getNamePhraseParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__FeatureTags__NameAssignment_1"


    // $ANTLR start "rule__Given__NameAssignment_2"
    // InternalSheepDog.g:3365:1: rule__Given__NameAssignment_2 : ( rulePhrase ) ;
    public final void rule__Given__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3369:1: ( ( rulePhrase ) )
            // InternalSheepDog.g:3370:2: ( rulePhrase )
            {
            // InternalSheepDog.g:3370:2: ( rulePhrase )
            // InternalSheepDog.g:3371:3: rulePhrase
            {
             before(grammarAccess.getGivenAccess().getNamePhraseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getGivenAccess().getNamePhraseParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Given__NameAssignment_2"


    // $ANTLR start "rule__Given__TheStepTableAssignment_4_0"
    // InternalSheepDog.g:3380:1: rule__Given__TheStepTableAssignment_4_0 : ( ruleTable ) ;
    public final void rule__Given__TheStepTableAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3384:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3385:2: ( ruleTable )
            {
            // InternalSheepDog.g:3385:2: ( ruleTable )
            // InternalSheepDog.g:3386:3: ruleTable
            {
             before(grammarAccess.getGivenAccess().getTheStepTableTableParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getGivenAccess().getTheStepTableTableParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__Given__TheStepTableAssignment_4_0"


    // $ANTLR start "rule__Given__TheDocStringAssignment_4_1"
    // InternalSheepDog.g:3395:1: rule__Given__TheDocStringAssignment_4_1 : ( ruleDocString ) ;
    public final void rule__Given__TheDocStringAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3399:1: ( ( ruleDocString ) )
            // InternalSheepDog.g:3400:2: ( ruleDocString )
            {
            // InternalSheepDog.g:3400:2: ( ruleDocString )
            // InternalSheepDog.g:3401:3: ruleDocString
            {
             before(grammarAccess.getGivenAccess().getTheDocStringDocStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDocString();

            state._fsp--;

             after(grammarAccess.getGivenAccess().getTheDocStringDocStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Given__TheDocStringAssignment_4_1"


    // $ANTLR start "rule__When__NameAssignment_2"
    // InternalSheepDog.g:3410:1: rule__When__NameAssignment_2 : ( rulePhrase ) ;
    public final void rule__When__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3414:1: ( ( rulePhrase ) )
            // InternalSheepDog.g:3415:2: ( rulePhrase )
            {
            // InternalSheepDog.g:3415:2: ( rulePhrase )
            // InternalSheepDog.g:3416:3: rulePhrase
            {
             before(grammarAccess.getWhenAccess().getNamePhraseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getWhenAccess().getNamePhraseParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__When__NameAssignment_2"


    // $ANTLR start "rule__When__TheStepTableAssignment_4_0"
    // InternalSheepDog.g:3425:1: rule__When__TheStepTableAssignment_4_0 : ( ruleTable ) ;
    public final void rule__When__TheStepTableAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3429:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3430:2: ( ruleTable )
            {
            // InternalSheepDog.g:3430:2: ( ruleTable )
            // InternalSheepDog.g:3431:3: ruleTable
            {
             before(grammarAccess.getWhenAccess().getTheStepTableTableParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getWhenAccess().getTheStepTableTableParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__When__TheStepTableAssignment_4_0"


    // $ANTLR start "rule__When__TheDocStringAssignment_4_1"
    // InternalSheepDog.g:3440:1: rule__When__TheDocStringAssignment_4_1 : ( ruleDocString ) ;
    public final void rule__When__TheDocStringAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3444:1: ( ( ruleDocString ) )
            // InternalSheepDog.g:3445:2: ( ruleDocString )
            {
            // InternalSheepDog.g:3445:2: ( ruleDocString )
            // InternalSheepDog.g:3446:3: ruleDocString
            {
             before(grammarAccess.getWhenAccess().getTheDocStringDocStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDocString();

            state._fsp--;

             after(grammarAccess.getWhenAccess().getTheDocStringDocStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__When__TheDocStringAssignment_4_1"


    // $ANTLR start "rule__Then__NameAssignment_2"
    // InternalSheepDog.g:3455:1: rule__Then__NameAssignment_2 : ( rulePhrase ) ;
    public final void rule__Then__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3459:1: ( ( rulePhrase ) )
            // InternalSheepDog.g:3460:2: ( rulePhrase )
            {
            // InternalSheepDog.g:3460:2: ( rulePhrase )
            // InternalSheepDog.g:3461:3: rulePhrase
            {
             before(grammarAccess.getThenAccess().getNamePhraseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getThenAccess().getNamePhraseParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Then__NameAssignment_2"


    // $ANTLR start "rule__Then__TheStepTableAssignment_4_0"
    // InternalSheepDog.g:3470:1: rule__Then__TheStepTableAssignment_4_0 : ( ruleTable ) ;
    public final void rule__Then__TheStepTableAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3474:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3475:2: ( ruleTable )
            {
            // InternalSheepDog.g:3475:2: ( ruleTable )
            // InternalSheepDog.g:3476:3: ruleTable
            {
             before(grammarAccess.getThenAccess().getTheStepTableTableParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getThenAccess().getTheStepTableTableParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__Then__TheStepTableAssignment_4_0"


    // $ANTLR start "rule__Then__TheDocStringAssignment_4_1"
    // InternalSheepDog.g:3485:1: rule__Then__TheDocStringAssignment_4_1 : ( ruleDocString ) ;
    public final void rule__Then__TheDocStringAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3489:1: ( ( ruleDocString ) )
            // InternalSheepDog.g:3490:2: ( ruleDocString )
            {
            // InternalSheepDog.g:3490:2: ( ruleDocString )
            // InternalSheepDog.g:3491:3: ruleDocString
            {
             before(grammarAccess.getThenAccess().getTheDocStringDocStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDocString();

            state._fsp--;

             after(grammarAccess.getThenAccess().getTheDocStringDocStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Then__TheDocStringAssignment_4_1"


    // $ANTLR start "rule__DocString__LinesAssignment_2"
    // InternalSheepDog.g:3500:1: rule__DocString__LinesAssignment_2 : ( ruleLine ) ;
    public final void rule__DocString__LinesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3504:1: ( ( ruleLine ) )
            // InternalSheepDog.g:3505:2: ( ruleLine )
            {
            // InternalSheepDog.g:3505:2: ( ruleLine )
            // InternalSheepDog.g:3506:3: ruleLine
            {
             before(grammarAccess.getDocStringAccess().getLinesLineParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getDocStringAccess().getLinesLineParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__DocString__LinesAssignment_2"


    // $ANTLR start "rule__Line__NameAssignment_0"
    // InternalSheepDog.g:3515:1: rule__Line__NameAssignment_0 : ( ruleLineBits ) ;
    public final void rule__Line__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3519:1: ( ( ruleLineBits ) )
            // InternalSheepDog.g:3520:2: ( ruleLineBits )
            {
            // InternalSheepDog.g:3520:2: ( ruleLineBits )
            // InternalSheepDog.g:3521:3: ruleLineBits
            {
             before(grammarAccess.getLineAccess().getNameLineBitsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLineBits();

            state._fsp--;

             after(grammarAccess.getLineAccess().getNameLineBitsParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Line__NameAssignment_0"


    // $ANTLR start "rule__Table__RowsAssignment_4"
    // InternalSheepDog.g:3530:1: rule__Table__RowsAssignment_4 : ( ruleRow ) ;
    public final void rule__Table__RowsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3534:1: ( ( ruleRow ) )
            // InternalSheepDog.g:3535:2: ( ruleRow )
            {
            // InternalSheepDog.g:3535:2: ( ruleRow )
            // InternalSheepDog.g:3536:3: ruleRow
            {
             before(grammarAccess.getTableAccess().getRowsRowParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getTableAccess().getRowsRowParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Table__RowsAssignment_4"


    // $ANTLR start "rule__Row__CellsAssignment_0"
    // InternalSheepDog.g:3545:1: rule__Row__CellsAssignment_0 : ( ruleCell ) ;
    public final void rule__Row__CellsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3549:1: ( ( ruleCell ) )
            // InternalSheepDog.g:3550:2: ( ruleCell )
            {
            // InternalSheepDog.g:3550:2: ( ruleCell )
            // InternalSheepDog.g:3551:3: ruleCell
            {
             before(grammarAccess.getRowAccess().getCellsCellParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCell();

            state._fsp--;

             after(grammarAccess.getRowAccess().getCellsCellParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Row__CellsAssignment_0"


    // $ANTLR start "rule__Cell__NameAssignment_1"
    // InternalSheepDog.g:3560:1: rule__Cell__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__Cell__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3564:1: ( ( rulePhrase ) )
            // InternalSheepDog.g:3565:2: ( rulePhrase )
            {
            // InternalSheepDog.g:3565:2: ( rulePhrase )
            // InternalSheepDog.g:3566:3: rulePhrase
            {
             before(grammarAccess.getCellAccess().getNamePhraseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getCellAccess().getNamePhraseParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Cell__NameAssignment_1"


    // $ANTLR start "rule__Statement__NameAssignment_0"
    // InternalSheepDog.g:3575:1: rule__Statement__NameAssignment_0 : ( rulePhrase ) ;
    public final void rule__Statement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3579:1: ( ( rulePhrase ) )
            // InternalSheepDog.g:3580:2: ( rulePhrase )
            {
            // InternalSheepDog.g:3580:2: ( rulePhrase )
            // InternalSheepDog.g:3581:3: rulePhrase
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


    // $ANTLR start "rule__StepObject__NameAssignment_1"
    // InternalSheepDog.g:3590:1: rule__StepObject__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__StepObject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3594:1: ( ( rulePhrase ) )
            // InternalSheepDog.g:3595:2: ( rulePhrase )
            {
            // InternalSheepDog.g:3595:2: ( rulePhrase )
            // InternalSheepDog.g:3596:3: rulePhrase
            {
             before(grammarAccess.getStepObjectAccess().getNamePhraseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getStepObjectAccess().getNamePhraseParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__StepObject__NameAssignment_1"


    // $ANTLR start "rule__StepObject__StatementsAssignment_3"
    // InternalSheepDog.g:3605:1: rule__StepObject__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__StepObject__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3609:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3610:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3610:2: ( ruleStatement )
            // InternalSheepDog.g:3611:3: ruleStatement
            {
             before(grammarAccess.getStepObjectAccess().getStatementsStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStepObjectAccess().getStatementsStatementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__StepObject__StatementsAssignment_3"


    // $ANTLR start "rule__StepObject__StepDefinitionsAssignment_4"
    // InternalSheepDog.g:3620:1: rule__StepObject__StepDefinitionsAssignment_4 : ( ruleStepDefinition ) ;
    public final void rule__StepObject__StepDefinitionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3624:1: ( ( ruleStepDefinition ) )
            // InternalSheepDog.g:3625:2: ( ruleStepDefinition )
            {
            // InternalSheepDog.g:3625:2: ( ruleStepDefinition )
            // InternalSheepDog.g:3626:3: ruleStepDefinition
            {
             before(grammarAccess.getStepObjectAccess().getStepDefinitionsStepDefinitionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStepDefinition();

            state._fsp--;

             after(grammarAccess.getStepObjectAccess().getStepDefinitionsStepDefinitionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__StepObject__StepDefinitionsAssignment_4"


    // $ANTLR start "rule__StepDefinition__NameAssignment_1"
    // InternalSheepDog.g:3635:1: rule__StepDefinition__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__StepDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3639:1: ( ( rulePhrase ) )
            // InternalSheepDog.g:3640:2: ( rulePhrase )
            {
            // InternalSheepDog.g:3640:2: ( rulePhrase )
            // InternalSheepDog.g:3641:3: rulePhrase
            {
             before(grammarAccess.getStepDefinitionAccess().getNamePhraseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getStepDefinitionAccess().getNamePhraseParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__StepDefinition__NameAssignment_1"


    // $ANTLR start "rule__StepDefinition__StatementsAssignment_3"
    // InternalSheepDog.g:3650:1: rule__StepDefinition__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__StepDefinition__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3654:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3655:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3655:2: ( ruleStatement )
            // InternalSheepDog.g:3656:3: ruleStatement
            {
             before(grammarAccess.getStepDefinitionAccess().getStatementsStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStepDefinitionAccess().getStatementsStatementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__StepDefinition__StatementsAssignment_3"


    // $ANTLR start "rule__StepDefinition__StepParametersAssignment_4"
    // InternalSheepDog.g:3665:1: rule__StepDefinition__StepParametersAssignment_4 : ( ruleStepParameters ) ;
    public final void rule__StepDefinition__StepParametersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3669:1: ( ( ruleStepParameters ) )
            // InternalSheepDog.g:3670:2: ( ruleStepParameters )
            {
            // InternalSheepDog.g:3670:2: ( ruleStepParameters )
            // InternalSheepDog.g:3671:3: ruleStepParameters
            {
             before(grammarAccess.getStepDefinitionAccess().getStepParametersStepParametersParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStepParameters();

            state._fsp--;

             after(grammarAccess.getStepDefinitionAccess().getStepParametersStepParametersParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__StepDefinition__StepParametersAssignment_4"


    // $ANTLR start "rule__StepParameters__NameAssignment_1"
    // InternalSheepDog.g:3680:1: rule__StepParameters__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__StepParameters__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3684:1: ( ( rulePhrase ) )
            // InternalSheepDog.g:3685:2: ( rulePhrase )
            {
            // InternalSheepDog.g:3685:2: ( rulePhrase )
            // InternalSheepDog.g:3686:3: rulePhrase
            {
             before(grammarAccess.getStepParametersAccess().getNamePhraseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getStepParametersAccess().getNamePhraseParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__StepParameters__NameAssignment_1"


    // $ANTLR start "rule__StepParameters__StatementsAssignment_3"
    // InternalSheepDog.g:3695:1: rule__StepParameters__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__StepParameters__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3699:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3700:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3700:2: ( ruleStatement )
            // InternalSheepDog.g:3701:3: ruleStatement
            {
             before(grammarAccess.getStepParametersAccess().getStatementsStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStepParametersAccess().getStatementsStatementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__StepParameters__StatementsAssignment_3"


    // $ANTLR start "rule__StepParameters__ParametersTableAssignment_4"
    // InternalSheepDog.g:3710:1: rule__StepParameters__ParametersTableAssignment_4 : ( ruleTable ) ;
    public final void rule__StepParameters__ParametersTableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3714:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3715:2: ( ruleTable )
            {
            // InternalSheepDog.g:3715:2: ( ruleTable )
            // InternalSheepDog.g:3716:3: ruleTable
            {
             before(grammarAccess.getStepParametersAccess().getParametersTableTableParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getStepParametersAccess().getParametersTableTableParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__StepParameters__ParametersTableAssignment_4"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\12\1\4\1\uffff\6\4\1\uffff";
    static final String dfa_3s = "\1\21\1\6\1\uffff\6\7\1\uffff";
    static final String dfa_4s = "\2\uffff\1\2\6\uffff\1\1";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\6\uffff\1\2",
            "\1\3\1\4\1\5",
            "",
            "\1\6\1\7\1\10\1\11",
            "\1\6\1\7\1\10\1\11",
            "\1\6\1\7\1\10\1\11",
            "\1\6\1\7\1\10\1\11",
            "\1\6\1\7\1\10\1\11",
            "\1\6\1\7\1\10\1\11",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "634:1: rule__Model__Alternatives : ( ( ruleStepObject ) | ( ruleFeature ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000009870L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000009002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004070L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000006070L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000006072L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400070L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000600070L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000001002L});

}
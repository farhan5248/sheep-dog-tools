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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WORD", "RULE_EOL", "RULE_RAWTEXT", "RULE_WS", "RULE_SL_COMMENT", "'='", "'Object:'", "'=='", "'Definition:'", "'==='", "'Parameters:'", "'Feature:'", "'Background:'", "'Scenario:'", "'Examples:'", "'Given:'", "'When:'", "'Then:'", "'And:'", "'[options=\"header\"]'", "'|==='", "':tags:'", "'[tags='", "']'", "'|'"
    };
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


    // $ANTLR start "entryRuleStepObject"
    // InternalSheepDog.g:78:1: entryRuleStepObject : ruleStepObject EOF ;
    public final void entryRuleStepObject() throws RecognitionException {
        try {
            // InternalSheepDog.g:79:1: ( ruleStepObject EOF )
            // InternalSheepDog.g:80:1: ruleStepObject EOF
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
    // InternalSheepDog.g:87:1: ruleStepObject : ( ( rule__StepObject__Group__0 ) ) ;
    public final void ruleStepObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:91:2: ( ( ( rule__StepObject__Group__0 ) ) )
            // InternalSheepDog.g:92:2: ( ( rule__StepObject__Group__0 ) )
            {
            // InternalSheepDog.g:92:2: ( ( rule__StepObject__Group__0 ) )
            // InternalSheepDog.g:93:3: ( rule__StepObject__Group__0 )
            {
             before(grammarAccess.getStepObjectAccess().getGroup()); 
            // InternalSheepDog.g:94:3: ( rule__StepObject__Group__0 )
            // InternalSheepDog.g:94:4: rule__StepObject__Group__0
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
    // InternalSheepDog.g:103:1: entryRuleStepDefinition : ruleStepDefinition EOF ;
    public final void entryRuleStepDefinition() throws RecognitionException {
        try {
            // InternalSheepDog.g:104:1: ( ruleStepDefinition EOF )
            // InternalSheepDog.g:105:1: ruleStepDefinition EOF
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
    // InternalSheepDog.g:112:1: ruleStepDefinition : ( ( rule__StepDefinition__Group__0 ) ) ;
    public final void ruleStepDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:116:2: ( ( ( rule__StepDefinition__Group__0 ) ) )
            // InternalSheepDog.g:117:2: ( ( rule__StepDefinition__Group__0 ) )
            {
            // InternalSheepDog.g:117:2: ( ( rule__StepDefinition__Group__0 ) )
            // InternalSheepDog.g:118:3: ( rule__StepDefinition__Group__0 )
            {
             before(grammarAccess.getStepDefinitionAccess().getGroup()); 
            // InternalSheepDog.g:119:3: ( rule__StepDefinition__Group__0 )
            // InternalSheepDog.g:119:4: rule__StepDefinition__Group__0
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
    // InternalSheepDog.g:128:1: entryRuleStepParameters : ruleStepParameters EOF ;
    public final void entryRuleStepParameters() throws RecognitionException {
        try {
            // InternalSheepDog.g:129:1: ( ruleStepParameters EOF )
            // InternalSheepDog.g:130:1: ruleStepParameters EOF
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
    // InternalSheepDog.g:137:1: ruleStepParameters : ( ( rule__StepParameters__Group__0 ) ) ;
    public final void ruleStepParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:141:2: ( ( ( rule__StepParameters__Group__0 ) ) )
            // InternalSheepDog.g:142:2: ( ( rule__StepParameters__Group__0 ) )
            {
            // InternalSheepDog.g:142:2: ( ( rule__StepParameters__Group__0 ) )
            // InternalSheepDog.g:143:3: ( rule__StepParameters__Group__0 )
            {
             before(grammarAccess.getStepParametersAccess().getGroup()); 
            // InternalSheepDog.g:144:3: ( rule__StepParameters__Group__0 )
            // InternalSheepDog.g:144:4: rule__StepParameters__Group__0
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


    // $ANTLR start "entryRuleFeature"
    // InternalSheepDog.g:153:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalSheepDog.g:154:1: ( ruleFeature EOF )
            // InternalSheepDog.g:155:1: ruleFeature EOF
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
    // InternalSheepDog.g:162:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:166:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalSheepDog.g:167:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalSheepDog.g:167:2: ( ( rule__Feature__Group__0 ) )
            // InternalSheepDog.g:168:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalSheepDog.g:169:3: ( rule__Feature__Group__0 )
            // InternalSheepDog.g:169:4: rule__Feature__Group__0
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


    // $ANTLR start "entryRuleAbstractScenario"
    // InternalSheepDog.g:178:1: entryRuleAbstractScenario : ruleAbstractScenario EOF ;
    public final void entryRuleAbstractScenario() throws RecognitionException {
        try {
            // InternalSheepDog.g:179:1: ( ruleAbstractScenario EOF )
            // InternalSheepDog.g:180:1: ruleAbstractScenario EOF
            {
             before(grammarAccess.getAbstractScenarioRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractScenario();

            state._fsp--;

             after(grammarAccess.getAbstractScenarioRule()); 
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
    // $ANTLR end "entryRuleAbstractScenario"


    // $ANTLR start "ruleAbstractScenario"
    // InternalSheepDog.g:187:1: ruleAbstractScenario : ( ( rule__AbstractScenario__Alternatives ) ) ;
    public final void ruleAbstractScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:191:2: ( ( ( rule__AbstractScenario__Alternatives ) ) )
            // InternalSheepDog.g:192:2: ( ( rule__AbstractScenario__Alternatives ) )
            {
            // InternalSheepDog.g:192:2: ( ( rule__AbstractScenario__Alternatives ) )
            // InternalSheepDog.g:193:3: ( rule__AbstractScenario__Alternatives )
            {
             before(grammarAccess.getAbstractScenarioAccess().getAlternatives()); 
            // InternalSheepDog.g:194:3: ( rule__AbstractScenario__Alternatives )
            // InternalSheepDog.g:194:4: rule__AbstractScenario__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractScenario__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractScenarioAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractScenario"


    // $ANTLR start "entryRuleBackground"
    // InternalSheepDog.g:203:1: entryRuleBackground : ruleBackground EOF ;
    public final void entryRuleBackground() throws RecognitionException {
        try {
            // InternalSheepDog.g:204:1: ( ruleBackground EOF )
            // InternalSheepDog.g:205:1: ruleBackground EOF
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
    // InternalSheepDog.g:212:1: ruleBackground : ( ( rule__Background__Group__0 ) ) ;
    public final void ruleBackground() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:216:2: ( ( ( rule__Background__Group__0 ) ) )
            // InternalSheepDog.g:217:2: ( ( rule__Background__Group__0 ) )
            {
            // InternalSheepDog.g:217:2: ( ( rule__Background__Group__0 ) )
            // InternalSheepDog.g:218:3: ( rule__Background__Group__0 )
            {
             before(grammarAccess.getBackgroundAccess().getGroup()); 
            // InternalSheepDog.g:219:3: ( rule__Background__Group__0 )
            // InternalSheepDog.g:219:4: rule__Background__Group__0
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
    // InternalSheepDog.g:228:1: entryRuleScenario : ruleScenario EOF ;
    public final void entryRuleScenario() throws RecognitionException {
        try {
            // InternalSheepDog.g:229:1: ( ruleScenario EOF )
            // InternalSheepDog.g:230:1: ruleScenario EOF
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
    // InternalSheepDog.g:237:1: ruleScenario : ( ( rule__Scenario__Group__0 ) ) ;
    public final void ruleScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:241:2: ( ( ( rule__Scenario__Group__0 ) ) )
            // InternalSheepDog.g:242:2: ( ( rule__Scenario__Group__0 ) )
            {
            // InternalSheepDog.g:242:2: ( ( rule__Scenario__Group__0 ) )
            // InternalSheepDog.g:243:3: ( rule__Scenario__Group__0 )
            {
             before(grammarAccess.getScenarioAccess().getGroup()); 
            // InternalSheepDog.g:244:3: ( rule__Scenario__Group__0 )
            // InternalSheepDog.g:244:4: rule__Scenario__Group__0
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
    // InternalSheepDog.g:253:1: entryRuleExamples : ruleExamples EOF ;
    public final void entryRuleExamples() throws RecognitionException {
        try {
            // InternalSheepDog.g:254:1: ( ruleExamples EOF )
            // InternalSheepDog.g:255:1: ruleExamples EOF
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
    // InternalSheepDog.g:262:1: ruleExamples : ( ( rule__Examples__Group__0 ) ) ;
    public final void ruleExamples() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:266:2: ( ( ( rule__Examples__Group__0 ) ) )
            // InternalSheepDog.g:267:2: ( ( rule__Examples__Group__0 ) )
            {
            // InternalSheepDog.g:267:2: ( ( rule__Examples__Group__0 ) )
            // InternalSheepDog.g:268:3: ( rule__Examples__Group__0 )
            {
             before(grammarAccess.getExamplesAccess().getGroup()); 
            // InternalSheepDog.g:269:3: ( rule__Examples__Group__0 )
            // InternalSheepDog.g:269:4: rule__Examples__Group__0
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


    // $ANTLR start "entryRuleStep"
    // InternalSheepDog.g:278:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalSheepDog.g:279:1: ( ruleStep EOF )
            // InternalSheepDog.g:280:1: ruleStep EOF
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
    // InternalSheepDog.g:287:1: ruleStep : ( ( rule__Step__Alternatives ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:291:2: ( ( ( rule__Step__Alternatives ) ) )
            // InternalSheepDog.g:292:2: ( ( rule__Step__Alternatives ) )
            {
            // InternalSheepDog.g:292:2: ( ( rule__Step__Alternatives ) )
            // InternalSheepDog.g:293:3: ( rule__Step__Alternatives )
            {
             before(grammarAccess.getStepAccess().getAlternatives()); 
            // InternalSheepDog.g:294:3: ( rule__Step__Alternatives )
            // InternalSheepDog.g:294:4: rule__Step__Alternatives
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
    // InternalSheepDog.g:303:1: entryRuleGiven : ruleGiven EOF ;
    public final void entryRuleGiven() throws RecognitionException {
        try {
            // InternalSheepDog.g:304:1: ( ruleGiven EOF )
            // InternalSheepDog.g:305:1: ruleGiven EOF
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
    // InternalSheepDog.g:312:1: ruleGiven : ( ( rule__Given__Group__0 ) ) ;
    public final void ruleGiven() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:316:2: ( ( ( rule__Given__Group__0 ) ) )
            // InternalSheepDog.g:317:2: ( ( rule__Given__Group__0 ) )
            {
            // InternalSheepDog.g:317:2: ( ( rule__Given__Group__0 ) )
            // InternalSheepDog.g:318:3: ( rule__Given__Group__0 )
            {
             before(grammarAccess.getGivenAccess().getGroup()); 
            // InternalSheepDog.g:319:3: ( rule__Given__Group__0 )
            // InternalSheepDog.g:319:4: rule__Given__Group__0
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
    // InternalSheepDog.g:328:1: entryRuleWhen : ruleWhen EOF ;
    public final void entryRuleWhen() throws RecognitionException {
        try {
            // InternalSheepDog.g:329:1: ( ruleWhen EOF )
            // InternalSheepDog.g:330:1: ruleWhen EOF
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
    // InternalSheepDog.g:337:1: ruleWhen : ( ( rule__When__Group__0 ) ) ;
    public final void ruleWhen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:341:2: ( ( ( rule__When__Group__0 ) ) )
            // InternalSheepDog.g:342:2: ( ( rule__When__Group__0 ) )
            {
            // InternalSheepDog.g:342:2: ( ( rule__When__Group__0 ) )
            // InternalSheepDog.g:343:3: ( rule__When__Group__0 )
            {
             before(grammarAccess.getWhenAccess().getGroup()); 
            // InternalSheepDog.g:344:3: ( rule__When__Group__0 )
            // InternalSheepDog.g:344:4: rule__When__Group__0
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
    // InternalSheepDog.g:353:1: entryRuleThen : ruleThen EOF ;
    public final void entryRuleThen() throws RecognitionException {
        try {
            // InternalSheepDog.g:354:1: ( ruleThen EOF )
            // InternalSheepDog.g:355:1: ruleThen EOF
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
    // InternalSheepDog.g:362:1: ruleThen : ( ( rule__Then__Group__0 ) ) ;
    public final void ruleThen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:366:2: ( ( ( rule__Then__Group__0 ) ) )
            // InternalSheepDog.g:367:2: ( ( rule__Then__Group__0 ) )
            {
            // InternalSheepDog.g:367:2: ( ( rule__Then__Group__0 ) )
            // InternalSheepDog.g:368:3: ( rule__Then__Group__0 )
            {
             before(grammarAccess.getThenAccess().getGroup()); 
            // InternalSheepDog.g:369:3: ( rule__Then__Group__0 )
            // InternalSheepDog.g:369:4: rule__Then__Group__0
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


    // $ANTLR start "entryRuleAnd"
    // InternalSheepDog.g:378:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalSheepDog.g:379:1: ( ruleAnd EOF )
            // InternalSheepDog.g:380:1: ruleAnd EOF
            {
             before(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getAndRule()); 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalSheepDog.g:387:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:391:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalSheepDog.g:392:2: ( ( rule__And__Group__0 ) )
            {
            // InternalSheepDog.g:392:2: ( ( rule__And__Group__0 ) )
            // InternalSheepDog.g:393:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalSheepDog.g:394:3: ( rule__And__Group__0 )
            // InternalSheepDog.g:394:4: rule__And__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleDocString"
    // InternalSheepDog.g:403:1: entryRuleDocString : ruleDocString EOF ;
    public final void entryRuleDocString() throws RecognitionException {
        try {
            // InternalSheepDog.g:404:1: ( ruleDocString EOF )
            // InternalSheepDog.g:405:1: ruleDocString EOF
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
    // InternalSheepDog.g:412:1: ruleDocString : ( ( rule__DocString__Group__0 ) ) ;
    public final void ruleDocString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:416:2: ( ( ( rule__DocString__Group__0 ) ) )
            // InternalSheepDog.g:417:2: ( ( rule__DocString__Group__0 ) )
            {
            // InternalSheepDog.g:417:2: ( ( rule__DocString__Group__0 ) )
            // InternalSheepDog.g:418:3: ( rule__DocString__Group__0 )
            {
             before(grammarAccess.getDocStringAccess().getGroup()); 
            // InternalSheepDog.g:419:3: ( rule__DocString__Group__0 )
            // InternalSheepDog.g:419:4: rule__DocString__Group__0
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


    // $ANTLR start "entryRuleTable"
    // InternalSheepDog.g:428:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalSheepDog.g:429:1: ( ruleTable EOF )
            // InternalSheepDog.g:430:1: ruleTable EOF
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
    // InternalSheepDog.g:437:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:441:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalSheepDog.g:442:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalSheepDog.g:442:2: ( ( rule__Table__Group__0 ) )
            // InternalSheepDog.g:443:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalSheepDog.g:444:3: ( rule__Table__Group__0 )
            // InternalSheepDog.g:444:4: rule__Table__Group__0
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
    // InternalSheepDog.g:453:1: entryRuleRow : ruleRow EOF ;
    public final void entryRuleRow() throws RecognitionException {
        try {
            // InternalSheepDog.g:454:1: ( ruleRow EOF )
            // InternalSheepDog.g:455:1: ruleRow EOF
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
    // InternalSheepDog.g:462:1: ruleRow : ( ( rule__Row__Group__0 ) ) ;
    public final void ruleRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:466:2: ( ( ( rule__Row__Group__0 ) ) )
            // InternalSheepDog.g:467:2: ( ( rule__Row__Group__0 ) )
            {
            // InternalSheepDog.g:467:2: ( ( rule__Row__Group__0 ) )
            // InternalSheepDog.g:468:3: ( rule__Row__Group__0 )
            {
             before(grammarAccess.getRowAccess().getGroup()); 
            // InternalSheepDog.g:469:3: ( rule__Row__Group__0 )
            // InternalSheepDog.g:469:4: rule__Row__Group__0
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


    // $ANTLR start "entryRuleFeatureTags"
    // InternalSheepDog.g:478:1: entryRuleFeatureTags : ruleFeatureTags EOF ;
    public final void entryRuleFeatureTags() throws RecognitionException {
        try {
            // InternalSheepDog.g:479:1: ( ruleFeatureTags EOF )
            // InternalSheepDog.g:480:1: ruleFeatureTags EOF
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
    // InternalSheepDog.g:487:1: ruleFeatureTags : ( ( rule__FeatureTags__Group__0 ) ) ;
    public final void ruleFeatureTags() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:491:2: ( ( ( rule__FeatureTags__Group__0 ) ) )
            // InternalSheepDog.g:492:2: ( ( rule__FeatureTags__Group__0 ) )
            {
            // InternalSheepDog.g:492:2: ( ( rule__FeatureTags__Group__0 ) )
            // InternalSheepDog.g:493:3: ( rule__FeatureTags__Group__0 )
            {
             before(grammarAccess.getFeatureTagsAccess().getGroup()); 
            // InternalSheepDog.g:494:3: ( rule__FeatureTags__Group__0 )
            // InternalSheepDog.g:494:4: rule__FeatureTags__Group__0
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


    // $ANTLR start "entryRuleAbstractScenarioTags"
    // InternalSheepDog.g:503:1: entryRuleAbstractScenarioTags : ruleAbstractScenarioTags EOF ;
    public final void entryRuleAbstractScenarioTags() throws RecognitionException {
        try {
            // InternalSheepDog.g:504:1: ( ruleAbstractScenarioTags EOF )
            // InternalSheepDog.g:505:1: ruleAbstractScenarioTags EOF
            {
             before(grammarAccess.getAbstractScenarioTagsRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractScenarioTags();

            state._fsp--;

             after(grammarAccess.getAbstractScenarioTagsRule()); 
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
    // $ANTLR end "entryRuleAbstractScenarioTags"


    // $ANTLR start "ruleAbstractScenarioTags"
    // InternalSheepDog.g:512:1: ruleAbstractScenarioTags : ( ( rule__AbstractScenarioTags__Group__0 ) ) ;
    public final void ruleAbstractScenarioTags() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:516:2: ( ( ( rule__AbstractScenarioTags__Group__0 ) ) )
            // InternalSheepDog.g:517:2: ( ( rule__AbstractScenarioTags__Group__0 ) )
            {
            // InternalSheepDog.g:517:2: ( ( rule__AbstractScenarioTags__Group__0 ) )
            // InternalSheepDog.g:518:3: ( rule__AbstractScenarioTags__Group__0 )
            {
             before(grammarAccess.getAbstractScenarioTagsAccess().getGroup()); 
            // InternalSheepDog.g:519:3: ( rule__AbstractScenarioTags__Group__0 )
            // InternalSheepDog.g:519:4: rule__AbstractScenarioTags__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AbstractScenarioTags__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractScenarioTagsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractScenarioTags"


    // $ANTLR start "entryRuleCell"
    // InternalSheepDog.g:528:1: entryRuleCell : ruleCell EOF ;
    public final void entryRuleCell() throws RecognitionException {
        try {
            // InternalSheepDog.g:529:1: ( ruleCell EOF )
            // InternalSheepDog.g:530:1: ruleCell EOF
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
    // InternalSheepDog.g:537:1: ruleCell : ( ( rule__Cell__Group__0 ) ) ;
    public final void ruleCell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:541:2: ( ( ( rule__Cell__Group__0 ) ) )
            // InternalSheepDog.g:542:2: ( ( rule__Cell__Group__0 ) )
            {
            // InternalSheepDog.g:542:2: ( ( rule__Cell__Group__0 ) )
            // InternalSheepDog.g:543:3: ( rule__Cell__Group__0 )
            {
             before(grammarAccess.getCellAccess().getGroup()); 
            // InternalSheepDog.g:544:3: ( rule__Cell__Group__0 )
            // InternalSheepDog.g:544:4: rule__Cell__Group__0
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
    // InternalSheepDog.g:553:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalSheepDog.g:554:1: ( ruleStatement EOF )
            // InternalSheepDog.g:555:1: ruleStatement EOF
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
    // InternalSheepDog.g:562:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:566:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalSheepDog.g:567:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalSheepDog.g:567:2: ( ( rule__Statement__Group__0 ) )
            // InternalSheepDog.g:568:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalSheepDog.g:569:3: ( rule__Statement__Group__0 )
            // InternalSheepDog.g:569:4: rule__Statement__Group__0
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


    // $ANTLR start "entryRuleTitle"
    // InternalSheepDog.g:578:1: entryRuleTitle : ruleTitle EOF ;
    public final void entryRuleTitle() throws RecognitionException {
        try {
            // InternalSheepDog.g:579:1: ( ruleTitle EOF )
            // InternalSheepDog.g:580:1: ruleTitle EOF
            {
             before(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_1);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getTitleRule()); 
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
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalSheepDog.g:587:1: ruleTitle : ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) ) ;
    public final void ruleTitle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:591:2: ( ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) ) )
            // InternalSheepDog.g:592:2: ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) )
            {
            // InternalSheepDog.g:592:2: ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) )
            // InternalSheepDog.g:593:3: ( ( RULE_WORD ) ) ( ( RULE_WORD )* )
            {
            // InternalSheepDog.g:593:3: ( ( RULE_WORD ) )
            // InternalSheepDog.g:594:4: ( RULE_WORD )
            {
             before(grammarAccess.getTitleAccess().getWORDTerminalRuleCall()); 
            // InternalSheepDog.g:595:4: ( RULE_WORD )
            // InternalSheepDog.g:595:5: RULE_WORD
            {
            match(input,RULE_WORD,FOLLOW_3); 

            }

             after(grammarAccess.getTitleAccess().getWORDTerminalRuleCall()); 

            }

            // InternalSheepDog.g:598:3: ( ( RULE_WORD )* )
            // InternalSheepDog.g:599:4: ( RULE_WORD )*
            {
             before(grammarAccess.getTitleAccess().getWORDTerminalRuleCall()); 
            // InternalSheepDog.g:600:4: ( RULE_WORD )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_WORD) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSheepDog.g:600:5: RULE_WORD
            	    {
            	    match(input,RULE_WORD,FOLLOW_3); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTitleAccess().getWORDTerminalRuleCall()); 

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
    // $ANTLR end "ruleTitle"


    // $ANTLR start "rule__Model__Alternatives"
    // InternalSheepDog.g:609:1: rule__Model__Alternatives : ( ( ruleStepObject ) | ( ruleFeature ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:613:1: ( ( ruleStepObject ) | ( ruleFeature ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==9) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==15) ) {
                    alt2=2;
                }
                else if ( (LA2_1==10) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==25) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSheepDog.g:614:2: ( ruleStepObject )
                    {
                    // InternalSheepDog.g:614:2: ( ruleStepObject )
                    // InternalSheepDog.g:615:3: ruleStepObject
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
                    // InternalSheepDog.g:620:2: ( ruleFeature )
                    {
                    // InternalSheepDog.g:620:2: ( ruleFeature )
                    // InternalSheepDog.g:621:3: ruleFeature
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


    // $ANTLR start "rule__AbstractScenario__Alternatives"
    // InternalSheepDog.g:630:1: rule__AbstractScenario__Alternatives : ( ( ruleBackground ) | ( ruleScenario ) );
    public final void rule__AbstractScenario__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:634:1: ( ( ruleBackground ) | ( ruleScenario ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_WORD) ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==27) ) {
                        int LA3_6 = input.LA(4);

                        if ( (LA3_6==RULE_EOL) ) {
                            int LA3_7 = input.LA(5);

                            if ( (LA3_7==11) ) {
                                int LA3_2 = input.LA(6);

                                if ( (LA3_2==16) ) {
                                    alt3=1;
                                }
                                else if ( (LA3_2==17) ) {
                                    alt3=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 3, 2, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 7, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==11) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==16) ) {
                    alt3=1;
                }
                else if ( (LA3_2==17) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSheepDog.g:635:2: ( ruleBackground )
                    {
                    // InternalSheepDog.g:635:2: ( ruleBackground )
                    // InternalSheepDog.g:636:3: ruleBackground
                    {
                     before(grammarAccess.getAbstractScenarioAccess().getBackgroundParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBackground();

                    state._fsp--;

                     after(grammarAccess.getAbstractScenarioAccess().getBackgroundParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSheepDog.g:641:2: ( ruleScenario )
                    {
                    // InternalSheepDog.g:641:2: ( ruleScenario )
                    // InternalSheepDog.g:642:3: ruleScenario
                    {
                     before(grammarAccess.getAbstractScenarioAccess().getScenarioParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleScenario();

                    state._fsp--;

                     after(grammarAccess.getAbstractScenarioAccess().getScenarioParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractScenario__Alternatives"


    // $ANTLR start "rule__Step__Alternatives"
    // InternalSheepDog.g:651:1: rule__Step__Alternatives : ( ( ruleGiven ) | ( ruleWhen ) | ( ruleThen ) | ( ruleAnd ) );
    public final void rule__Step__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:655:1: ( ( ruleGiven ) | ( ruleWhen ) | ( ruleThen ) | ( ruleAnd ) )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                switch ( input.LA(2) ) {
                case 19:
                    {
                    alt4=1;
                    }
                    break;
                case 20:
                    {
                    alt4=2;
                    }
                    break;
                case 21:
                    {
                    alt4=3;
                    }
                    break;
                case 22:
                    {
                    alt4=4;
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
                    // InternalSheepDog.g:656:2: ( ruleGiven )
                    {
                    // InternalSheepDog.g:656:2: ( ruleGiven )
                    // InternalSheepDog.g:657:3: ruleGiven
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
                    // InternalSheepDog.g:662:2: ( ruleWhen )
                    {
                    // InternalSheepDog.g:662:2: ( ruleWhen )
                    // InternalSheepDog.g:663:3: ruleWhen
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
                    // InternalSheepDog.g:668:2: ( ruleThen )
                    {
                    // InternalSheepDog.g:668:2: ( ruleThen )
                    // InternalSheepDog.g:669:3: ruleThen
                    {
                     before(grammarAccess.getStepAccess().getThenParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleThen();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getThenParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSheepDog.g:674:2: ( ruleAnd )
                    {
                    // InternalSheepDog.g:674:2: ( ruleAnd )
                    // InternalSheepDog.g:675:3: ruleAnd
                    {
                     before(grammarAccess.getStepAccess().getAndParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleAnd();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getAndParserRuleCall_3()); 

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
    // InternalSheepDog.g:684:1: rule__Given__Alternatives_4 : ( ( ( rule__Given__TheStepTableAssignment_4_0 ) ) | ( ( rule__Given__TheDocStringAssignment_4_1 ) ) );
    public final void rule__Given__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:688:1: ( ( ( rule__Given__TheStepTableAssignment_4_0 ) ) | ( ( rule__Given__TheDocStringAssignment_4_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_RAWTEXT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSheepDog.g:689:2: ( ( rule__Given__TheStepTableAssignment_4_0 ) )
                    {
                    // InternalSheepDog.g:689:2: ( ( rule__Given__TheStepTableAssignment_4_0 ) )
                    // InternalSheepDog.g:690:3: ( rule__Given__TheStepTableAssignment_4_0 )
                    {
                     before(grammarAccess.getGivenAccess().getTheStepTableAssignment_4_0()); 
                    // InternalSheepDog.g:691:3: ( rule__Given__TheStepTableAssignment_4_0 )
                    // InternalSheepDog.g:691:4: rule__Given__TheStepTableAssignment_4_0
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
                    // InternalSheepDog.g:695:2: ( ( rule__Given__TheDocStringAssignment_4_1 ) )
                    {
                    // InternalSheepDog.g:695:2: ( ( rule__Given__TheDocStringAssignment_4_1 ) )
                    // InternalSheepDog.g:696:3: ( rule__Given__TheDocStringAssignment_4_1 )
                    {
                     before(grammarAccess.getGivenAccess().getTheDocStringAssignment_4_1()); 
                    // InternalSheepDog.g:697:3: ( rule__Given__TheDocStringAssignment_4_1 )
                    // InternalSheepDog.g:697:4: rule__Given__TheDocStringAssignment_4_1
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
    // InternalSheepDog.g:705:1: rule__When__Alternatives_4 : ( ( ( rule__When__TheStepTableAssignment_4_0 ) ) | ( ( rule__When__TheDocStringAssignment_4_1 ) ) );
    public final void rule__When__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:709:1: ( ( ( rule__When__TheStepTableAssignment_4_0 ) ) | ( ( rule__When__TheDocStringAssignment_4_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_RAWTEXT) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSheepDog.g:710:2: ( ( rule__When__TheStepTableAssignment_4_0 ) )
                    {
                    // InternalSheepDog.g:710:2: ( ( rule__When__TheStepTableAssignment_4_0 ) )
                    // InternalSheepDog.g:711:3: ( rule__When__TheStepTableAssignment_4_0 )
                    {
                     before(grammarAccess.getWhenAccess().getTheStepTableAssignment_4_0()); 
                    // InternalSheepDog.g:712:3: ( rule__When__TheStepTableAssignment_4_0 )
                    // InternalSheepDog.g:712:4: rule__When__TheStepTableAssignment_4_0
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
                    // InternalSheepDog.g:716:2: ( ( rule__When__TheDocStringAssignment_4_1 ) )
                    {
                    // InternalSheepDog.g:716:2: ( ( rule__When__TheDocStringAssignment_4_1 ) )
                    // InternalSheepDog.g:717:3: ( rule__When__TheDocStringAssignment_4_1 )
                    {
                     before(grammarAccess.getWhenAccess().getTheDocStringAssignment_4_1()); 
                    // InternalSheepDog.g:718:3: ( rule__When__TheDocStringAssignment_4_1 )
                    // InternalSheepDog.g:718:4: rule__When__TheDocStringAssignment_4_1
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
    // InternalSheepDog.g:726:1: rule__Then__Alternatives_4 : ( ( ( rule__Then__TheStepTableAssignment_4_0 ) ) | ( ( rule__Then__TheDocStringAssignment_4_1 ) ) );
    public final void rule__Then__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:730:1: ( ( ( rule__Then__TheStepTableAssignment_4_0 ) ) | ( ( rule__Then__TheDocStringAssignment_4_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_RAWTEXT) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSheepDog.g:731:2: ( ( rule__Then__TheStepTableAssignment_4_0 ) )
                    {
                    // InternalSheepDog.g:731:2: ( ( rule__Then__TheStepTableAssignment_4_0 ) )
                    // InternalSheepDog.g:732:3: ( rule__Then__TheStepTableAssignment_4_0 )
                    {
                     before(grammarAccess.getThenAccess().getTheStepTableAssignment_4_0()); 
                    // InternalSheepDog.g:733:3: ( rule__Then__TheStepTableAssignment_4_0 )
                    // InternalSheepDog.g:733:4: rule__Then__TheStepTableAssignment_4_0
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
                    // InternalSheepDog.g:737:2: ( ( rule__Then__TheDocStringAssignment_4_1 ) )
                    {
                    // InternalSheepDog.g:737:2: ( ( rule__Then__TheDocStringAssignment_4_1 ) )
                    // InternalSheepDog.g:738:3: ( rule__Then__TheDocStringAssignment_4_1 )
                    {
                     before(grammarAccess.getThenAccess().getTheDocStringAssignment_4_1()); 
                    // InternalSheepDog.g:739:3: ( rule__Then__TheDocStringAssignment_4_1 )
                    // InternalSheepDog.g:739:4: rule__Then__TheDocStringAssignment_4_1
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


    // $ANTLR start "rule__And__Alternatives_4"
    // InternalSheepDog.g:747:1: rule__And__Alternatives_4 : ( ( ( rule__And__TheStepTableAssignment_4_0 ) ) | ( ( rule__And__TheDocStringAssignment_4_1 ) ) );
    public final void rule__And__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:751:1: ( ( ( rule__And__TheStepTableAssignment_4_0 ) ) | ( ( rule__And__TheDocStringAssignment_4_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_RAWTEXT) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSheepDog.g:752:2: ( ( rule__And__TheStepTableAssignment_4_0 ) )
                    {
                    // InternalSheepDog.g:752:2: ( ( rule__And__TheStepTableAssignment_4_0 ) )
                    // InternalSheepDog.g:753:3: ( rule__And__TheStepTableAssignment_4_0 )
                    {
                     before(grammarAccess.getAndAccess().getTheStepTableAssignment_4_0()); 
                    // InternalSheepDog.g:754:3: ( rule__And__TheStepTableAssignment_4_0 )
                    // InternalSheepDog.g:754:4: rule__And__TheStepTableAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__And__TheStepTableAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAndAccess().getTheStepTableAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSheepDog.g:758:2: ( ( rule__And__TheDocStringAssignment_4_1 ) )
                    {
                    // InternalSheepDog.g:758:2: ( ( rule__And__TheDocStringAssignment_4_1 ) )
                    // InternalSheepDog.g:759:3: ( rule__And__TheDocStringAssignment_4_1 )
                    {
                     before(grammarAccess.getAndAccess().getTheDocStringAssignment_4_1()); 
                    // InternalSheepDog.g:760:3: ( rule__And__TheDocStringAssignment_4_1 )
                    // InternalSheepDog.g:760:4: rule__And__TheDocStringAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__And__TheDocStringAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAndAccess().getTheDocStringAssignment_4_1()); 

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
    // $ANTLR end "rule__And__Alternatives_4"


    // $ANTLR start "rule__StepObject__Group__0"
    // InternalSheepDog.g:768:1: rule__StepObject__Group__0 : rule__StepObject__Group__0__Impl rule__StepObject__Group__1 ;
    public final void rule__StepObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:772:1: ( rule__StepObject__Group__0__Impl rule__StepObject__Group__1 )
            // InternalSheepDog.g:773:2: rule__StepObject__Group__0__Impl rule__StepObject__Group__1
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
    // InternalSheepDog.g:780:1: rule__StepObject__Group__0__Impl : ( '=' ) ;
    public final void rule__StepObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:784:1: ( ( '=' ) )
            // InternalSheepDog.g:785:1: ( '=' )
            {
            // InternalSheepDog.g:785:1: ( '=' )
            // InternalSheepDog.g:786:2: '='
            {
             before(grammarAccess.getStepObjectAccess().getEqualsSignKeyword_0()); 
            match(input,9,FOLLOW_2); 
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
    // InternalSheepDog.g:795:1: rule__StepObject__Group__1 : rule__StepObject__Group__1__Impl rule__StepObject__Group__2 ;
    public final void rule__StepObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:799:1: ( rule__StepObject__Group__1__Impl rule__StepObject__Group__2 )
            // InternalSheepDog.g:800:2: rule__StepObject__Group__1__Impl rule__StepObject__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSheepDog.g:807:1: rule__StepObject__Group__1__Impl : ( 'Object:' ) ;
    public final void rule__StepObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:811:1: ( ( 'Object:' ) )
            // InternalSheepDog.g:812:1: ( 'Object:' )
            {
            // InternalSheepDog.g:812:1: ( 'Object:' )
            // InternalSheepDog.g:813:2: 'Object:'
            {
             before(grammarAccess.getStepObjectAccess().getObjectKeyword_1()); 
            match(input,10,FOLLOW_2); 
             after(grammarAccess.getStepObjectAccess().getObjectKeyword_1()); 

            }


            }

        }
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
    // InternalSheepDog.g:822:1: rule__StepObject__Group__2 : rule__StepObject__Group__2__Impl rule__StepObject__Group__3 ;
    public final void rule__StepObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:826:1: ( rule__StepObject__Group__2__Impl rule__StepObject__Group__3 )
            // InternalSheepDog.g:827:2: rule__StepObject__Group__2__Impl rule__StepObject__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSheepDog.g:834:1: rule__StepObject__Group__2__Impl : ( ( rule__StepObject__NameAssignment_2 ) ) ;
    public final void rule__StepObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:838:1: ( ( ( rule__StepObject__NameAssignment_2 ) ) )
            // InternalSheepDog.g:839:1: ( ( rule__StepObject__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:839:1: ( ( rule__StepObject__NameAssignment_2 ) )
            // InternalSheepDog.g:840:2: ( rule__StepObject__NameAssignment_2 )
            {
             before(grammarAccess.getStepObjectAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:841:2: ( rule__StepObject__NameAssignment_2 )
            // InternalSheepDog.g:841:3: rule__StepObject__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StepObject__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStepObjectAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalSheepDog.g:849:1: rule__StepObject__Group__3 : rule__StepObject__Group__3__Impl rule__StepObject__Group__4 ;
    public final void rule__StepObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:853:1: ( rule__StepObject__Group__3__Impl rule__StepObject__Group__4 )
            // InternalSheepDog.g:854:2: rule__StepObject__Group__3__Impl rule__StepObject__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalSheepDog.g:861:1: rule__StepObject__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__StepObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:865:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:866:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:866:1: ( RULE_EOL )
            // InternalSheepDog.g:867:2: RULE_EOL
            {
             before(grammarAccess.getStepObjectAccess().getEOLTerminalRuleCall_3()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getStepObjectAccess().getEOLTerminalRuleCall_3()); 

            }


            }

        }
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
    // InternalSheepDog.g:876:1: rule__StepObject__Group__4 : rule__StepObject__Group__4__Impl rule__StepObject__Group__5 ;
    public final void rule__StepObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:880:1: ( rule__StepObject__Group__4__Impl rule__StepObject__Group__5 )
            // InternalSheepDog.g:881:2: rule__StepObject__Group__4__Impl rule__StepObject__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__StepObject__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepObject__Group__5();

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
    // InternalSheepDog.g:888:1: rule__StepObject__Group__4__Impl : ( ( rule__StepObject__StatementsAssignment_4 )* ) ;
    public final void rule__StepObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:892:1: ( ( ( rule__StepObject__StatementsAssignment_4 )* ) )
            // InternalSheepDog.g:893:1: ( ( rule__StepObject__StatementsAssignment_4 )* )
            {
            // InternalSheepDog.g:893:1: ( ( rule__StepObject__StatementsAssignment_4 )* )
            // InternalSheepDog.g:894:2: ( rule__StepObject__StatementsAssignment_4 )*
            {
             before(grammarAccess.getStepObjectAccess().getStatementsAssignment_4()); 
            // InternalSheepDog.g:895:2: ( rule__StepObject__StatementsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_WORD) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSheepDog.g:895:3: rule__StepObject__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__StepObject__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getStepObjectAccess().getStatementsAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__StepObject__Group__5"
    // InternalSheepDog.g:903:1: rule__StepObject__Group__5 : rule__StepObject__Group__5__Impl ;
    public final void rule__StepObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:907:1: ( rule__StepObject__Group__5__Impl )
            // InternalSheepDog.g:908:2: rule__StepObject__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StepObject__Group__5__Impl();

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
    // $ANTLR end "rule__StepObject__Group__5"


    // $ANTLR start "rule__StepObject__Group__5__Impl"
    // InternalSheepDog.g:914:1: rule__StepObject__Group__5__Impl : ( ( rule__StepObject__StepDefinitionsAssignment_5 )* ) ;
    public final void rule__StepObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:918:1: ( ( ( rule__StepObject__StepDefinitionsAssignment_5 )* ) )
            // InternalSheepDog.g:919:1: ( ( rule__StepObject__StepDefinitionsAssignment_5 )* )
            {
            // InternalSheepDog.g:919:1: ( ( rule__StepObject__StepDefinitionsAssignment_5 )* )
            // InternalSheepDog.g:920:2: ( rule__StepObject__StepDefinitionsAssignment_5 )*
            {
             before(grammarAccess.getStepObjectAccess().getStepDefinitionsAssignment_5()); 
            // InternalSheepDog.g:921:2: ( rule__StepObject__StepDefinitionsAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==11) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSheepDog.g:921:3: rule__StepObject__StepDefinitionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__StepObject__StepDefinitionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getStepObjectAccess().getStepDefinitionsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepObject__Group__5__Impl"


    // $ANTLR start "rule__StepDefinition__Group__0"
    // InternalSheepDog.g:930:1: rule__StepDefinition__Group__0 : rule__StepDefinition__Group__0__Impl rule__StepDefinition__Group__1 ;
    public final void rule__StepDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:934:1: ( rule__StepDefinition__Group__0__Impl rule__StepDefinition__Group__1 )
            // InternalSheepDog.g:935:2: rule__StepDefinition__Group__0__Impl rule__StepDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalSheepDog.g:942:1: rule__StepDefinition__Group__0__Impl : ( '==' ) ;
    public final void rule__StepDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:946:1: ( ( '==' ) )
            // InternalSheepDog.g:947:1: ( '==' )
            {
            // InternalSheepDog.g:947:1: ( '==' )
            // InternalSheepDog.g:948:2: '=='
            {
             before(grammarAccess.getStepDefinitionAccess().getEqualsSignEqualsSignKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalSheepDog.g:957:1: rule__StepDefinition__Group__1 : rule__StepDefinition__Group__1__Impl rule__StepDefinition__Group__2 ;
    public final void rule__StepDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:961:1: ( rule__StepDefinition__Group__1__Impl rule__StepDefinition__Group__2 )
            // InternalSheepDog.g:962:2: rule__StepDefinition__Group__1__Impl rule__StepDefinition__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSheepDog.g:969:1: rule__StepDefinition__Group__1__Impl : ( 'Definition:' ) ;
    public final void rule__StepDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:973:1: ( ( 'Definition:' ) )
            // InternalSheepDog.g:974:1: ( 'Definition:' )
            {
            // InternalSheepDog.g:974:1: ( 'Definition:' )
            // InternalSheepDog.g:975:2: 'Definition:'
            {
             before(grammarAccess.getStepDefinitionAccess().getDefinitionKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getStepDefinitionAccess().getDefinitionKeyword_1()); 

            }


            }

        }
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
    // InternalSheepDog.g:984:1: rule__StepDefinition__Group__2 : rule__StepDefinition__Group__2__Impl rule__StepDefinition__Group__3 ;
    public final void rule__StepDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:988:1: ( rule__StepDefinition__Group__2__Impl rule__StepDefinition__Group__3 )
            // InternalSheepDog.g:989:2: rule__StepDefinition__Group__2__Impl rule__StepDefinition__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSheepDog.g:996:1: rule__StepDefinition__Group__2__Impl : ( ( rule__StepDefinition__NameAssignment_2 ) ) ;
    public final void rule__StepDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1000:1: ( ( ( rule__StepDefinition__NameAssignment_2 ) ) )
            // InternalSheepDog.g:1001:1: ( ( rule__StepDefinition__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:1001:1: ( ( rule__StepDefinition__NameAssignment_2 ) )
            // InternalSheepDog.g:1002:2: ( rule__StepDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getStepDefinitionAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:1003:2: ( rule__StepDefinition__NameAssignment_2 )
            // InternalSheepDog.g:1003:3: rule__StepDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StepDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStepDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalSheepDog.g:1011:1: rule__StepDefinition__Group__3 : rule__StepDefinition__Group__3__Impl rule__StepDefinition__Group__4 ;
    public final void rule__StepDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1015:1: ( rule__StepDefinition__Group__3__Impl rule__StepDefinition__Group__4 )
            // InternalSheepDog.g:1016:2: rule__StepDefinition__Group__3__Impl rule__StepDefinition__Group__4
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
    // InternalSheepDog.g:1023:1: rule__StepDefinition__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__StepDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1027:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:1028:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:1028:1: ( RULE_EOL )
            // InternalSheepDog.g:1029:2: RULE_EOL
            {
             before(grammarAccess.getStepDefinitionAccess().getEOLTerminalRuleCall_3()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getStepDefinitionAccess().getEOLTerminalRuleCall_3()); 

            }


            }

        }
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
    // InternalSheepDog.g:1038:1: rule__StepDefinition__Group__4 : rule__StepDefinition__Group__4__Impl rule__StepDefinition__Group__5 ;
    public final void rule__StepDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1042:1: ( rule__StepDefinition__Group__4__Impl rule__StepDefinition__Group__5 )
            // InternalSheepDog.g:1043:2: rule__StepDefinition__Group__4__Impl rule__StepDefinition__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__StepDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepDefinition__Group__5();

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
    // InternalSheepDog.g:1050:1: rule__StepDefinition__Group__4__Impl : ( ( rule__StepDefinition__StatementsAssignment_4 )* ) ;
    public final void rule__StepDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1054:1: ( ( ( rule__StepDefinition__StatementsAssignment_4 )* ) )
            // InternalSheepDog.g:1055:1: ( ( rule__StepDefinition__StatementsAssignment_4 )* )
            {
            // InternalSheepDog.g:1055:1: ( ( rule__StepDefinition__StatementsAssignment_4 )* )
            // InternalSheepDog.g:1056:2: ( rule__StepDefinition__StatementsAssignment_4 )*
            {
             before(grammarAccess.getStepDefinitionAccess().getStatementsAssignment_4()); 
            // InternalSheepDog.g:1057:2: ( rule__StepDefinition__StatementsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_WORD) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSheepDog.g:1057:3: rule__StepDefinition__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__StepDefinition__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getStepDefinitionAccess().getStatementsAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__StepDefinition__Group__5"
    // InternalSheepDog.g:1065:1: rule__StepDefinition__Group__5 : rule__StepDefinition__Group__5__Impl ;
    public final void rule__StepDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1069:1: ( rule__StepDefinition__Group__5__Impl )
            // InternalSheepDog.g:1070:2: rule__StepDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StepDefinition__Group__5__Impl();

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
    // $ANTLR end "rule__StepDefinition__Group__5"


    // $ANTLR start "rule__StepDefinition__Group__5__Impl"
    // InternalSheepDog.g:1076:1: rule__StepDefinition__Group__5__Impl : ( ( rule__StepDefinition__StepParametersAssignment_5 )* ) ;
    public final void rule__StepDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1080:1: ( ( ( rule__StepDefinition__StepParametersAssignment_5 )* ) )
            // InternalSheepDog.g:1081:1: ( ( rule__StepDefinition__StepParametersAssignment_5 )* )
            {
            // InternalSheepDog.g:1081:1: ( ( rule__StepDefinition__StepParametersAssignment_5 )* )
            // InternalSheepDog.g:1082:2: ( rule__StepDefinition__StepParametersAssignment_5 )*
            {
             before(grammarAccess.getStepDefinitionAccess().getStepParametersAssignment_5()); 
            // InternalSheepDog.g:1083:2: ( rule__StepDefinition__StepParametersAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==13) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSheepDog.g:1083:3: rule__StepDefinition__StepParametersAssignment_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__StepDefinition__StepParametersAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getStepDefinitionAccess().getStepParametersAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepDefinition__Group__5__Impl"


    // $ANTLR start "rule__StepParameters__Group__0"
    // InternalSheepDog.g:1092:1: rule__StepParameters__Group__0 : rule__StepParameters__Group__0__Impl rule__StepParameters__Group__1 ;
    public final void rule__StepParameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1096:1: ( rule__StepParameters__Group__0__Impl rule__StepParameters__Group__1 )
            // InternalSheepDog.g:1097:2: rule__StepParameters__Group__0__Impl rule__StepParameters__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalSheepDog.g:1104:1: rule__StepParameters__Group__0__Impl : ( '===' ) ;
    public final void rule__StepParameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1108:1: ( ( '===' ) )
            // InternalSheepDog.g:1109:1: ( '===' )
            {
            // InternalSheepDog.g:1109:1: ( '===' )
            // InternalSheepDog.g:1110:2: '==='
            {
             before(grammarAccess.getStepParametersAccess().getEqualsSignEqualsSignEqualsSignKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalSheepDog.g:1119:1: rule__StepParameters__Group__1 : rule__StepParameters__Group__1__Impl rule__StepParameters__Group__2 ;
    public final void rule__StepParameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1123:1: ( rule__StepParameters__Group__1__Impl rule__StepParameters__Group__2 )
            // InternalSheepDog.g:1124:2: rule__StepParameters__Group__1__Impl rule__StepParameters__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSheepDog.g:1131:1: rule__StepParameters__Group__1__Impl : ( 'Parameters:' ) ;
    public final void rule__StepParameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1135:1: ( ( 'Parameters:' ) )
            // InternalSheepDog.g:1136:1: ( 'Parameters:' )
            {
            // InternalSheepDog.g:1136:1: ( 'Parameters:' )
            // InternalSheepDog.g:1137:2: 'Parameters:'
            {
             before(grammarAccess.getStepParametersAccess().getParametersKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getStepParametersAccess().getParametersKeyword_1()); 

            }


            }

        }
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
    // InternalSheepDog.g:1146:1: rule__StepParameters__Group__2 : rule__StepParameters__Group__2__Impl rule__StepParameters__Group__3 ;
    public final void rule__StepParameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1150:1: ( rule__StepParameters__Group__2__Impl rule__StepParameters__Group__3 )
            // InternalSheepDog.g:1151:2: rule__StepParameters__Group__2__Impl rule__StepParameters__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSheepDog.g:1158:1: rule__StepParameters__Group__2__Impl : ( ( rule__StepParameters__NameAssignment_2 ) ) ;
    public final void rule__StepParameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1162:1: ( ( ( rule__StepParameters__NameAssignment_2 ) ) )
            // InternalSheepDog.g:1163:1: ( ( rule__StepParameters__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:1163:1: ( ( rule__StepParameters__NameAssignment_2 ) )
            // InternalSheepDog.g:1164:2: ( rule__StepParameters__NameAssignment_2 )
            {
             before(grammarAccess.getStepParametersAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:1165:2: ( rule__StepParameters__NameAssignment_2 )
            // InternalSheepDog.g:1165:3: rule__StepParameters__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StepParameters__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStepParametersAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalSheepDog.g:1173:1: rule__StepParameters__Group__3 : rule__StepParameters__Group__3__Impl rule__StepParameters__Group__4 ;
    public final void rule__StepParameters__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1177:1: ( rule__StepParameters__Group__3__Impl rule__StepParameters__Group__4 )
            // InternalSheepDog.g:1178:2: rule__StepParameters__Group__3__Impl rule__StepParameters__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalSheepDog.g:1185:1: rule__StepParameters__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__StepParameters__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1189:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:1190:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:1190:1: ( RULE_EOL )
            // InternalSheepDog.g:1191:2: RULE_EOL
            {
             before(grammarAccess.getStepParametersAccess().getEOLTerminalRuleCall_3()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getStepParametersAccess().getEOLTerminalRuleCall_3()); 

            }


            }

        }
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
    // InternalSheepDog.g:1200:1: rule__StepParameters__Group__4 : rule__StepParameters__Group__4__Impl rule__StepParameters__Group__5 ;
    public final void rule__StepParameters__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1204:1: ( rule__StepParameters__Group__4__Impl rule__StepParameters__Group__5 )
            // InternalSheepDog.g:1205:2: rule__StepParameters__Group__4__Impl rule__StepParameters__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__StepParameters__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepParameters__Group__5();

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
    // InternalSheepDog.g:1212:1: rule__StepParameters__Group__4__Impl : ( ( rule__StepParameters__StatementsAssignment_4 )* ) ;
    public final void rule__StepParameters__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1216:1: ( ( ( rule__StepParameters__StatementsAssignment_4 )* ) )
            // InternalSheepDog.g:1217:1: ( ( rule__StepParameters__StatementsAssignment_4 )* )
            {
            // InternalSheepDog.g:1217:1: ( ( rule__StepParameters__StatementsAssignment_4 )* )
            // InternalSheepDog.g:1218:2: ( rule__StepParameters__StatementsAssignment_4 )*
            {
             before(grammarAccess.getStepParametersAccess().getStatementsAssignment_4()); 
            // InternalSheepDog.g:1219:2: ( rule__StepParameters__StatementsAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_WORD) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSheepDog.g:1219:3: rule__StepParameters__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__StepParameters__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getStepParametersAccess().getStatementsAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__StepParameters__Group__5"
    // InternalSheepDog.g:1227:1: rule__StepParameters__Group__5 : rule__StepParameters__Group__5__Impl ;
    public final void rule__StepParameters__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1231:1: ( rule__StepParameters__Group__5__Impl )
            // InternalSheepDog.g:1232:2: rule__StepParameters__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StepParameters__Group__5__Impl();

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
    // $ANTLR end "rule__StepParameters__Group__5"


    // $ANTLR start "rule__StepParameters__Group__5__Impl"
    // InternalSheepDog.g:1238:1: rule__StepParameters__Group__5__Impl : ( ( rule__StepParameters__ParametersTableAssignment_5 ) ) ;
    public final void rule__StepParameters__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1242:1: ( ( ( rule__StepParameters__ParametersTableAssignment_5 ) ) )
            // InternalSheepDog.g:1243:1: ( ( rule__StepParameters__ParametersTableAssignment_5 ) )
            {
            // InternalSheepDog.g:1243:1: ( ( rule__StepParameters__ParametersTableAssignment_5 ) )
            // InternalSheepDog.g:1244:2: ( rule__StepParameters__ParametersTableAssignment_5 )
            {
             before(grammarAccess.getStepParametersAccess().getParametersTableAssignment_5()); 
            // InternalSheepDog.g:1245:2: ( rule__StepParameters__ParametersTableAssignment_5 )
            // InternalSheepDog.g:1245:3: rule__StepParameters__ParametersTableAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__StepParameters__ParametersTableAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getStepParametersAccess().getParametersTableAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepParameters__Group__5__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalSheepDog.g:1254:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1258:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalSheepDog.g:1259:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalSheepDog.g:1266:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__TagsAssignment_0 )? ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1270:1: ( ( ( rule__Feature__TagsAssignment_0 )? ) )
            // InternalSheepDog.g:1271:1: ( ( rule__Feature__TagsAssignment_0 )? )
            {
            // InternalSheepDog.g:1271:1: ( ( rule__Feature__TagsAssignment_0 )? )
            // InternalSheepDog.g:1272:2: ( rule__Feature__TagsAssignment_0 )?
            {
             before(grammarAccess.getFeatureAccess().getTagsAssignment_0()); 
            // InternalSheepDog.g:1273:2: ( rule__Feature__TagsAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSheepDog.g:1273:3: rule__Feature__TagsAssignment_0
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
    // InternalSheepDog.g:1281:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1285:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalSheepDog.g:1286:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalSheepDog.g:1293:1: rule__Feature__Group__1__Impl : ( '=' ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1297:1: ( ( '=' ) )
            // InternalSheepDog.g:1298:1: ( '=' )
            {
            // InternalSheepDog.g:1298:1: ( '=' )
            // InternalSheepDog.g:1299:2: '='
            {
             before(grammarAccess.getFeatureAccess().getEqualsSignKeyword_1()); 
            match(input,9,FOLLOW_2); 
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
    // InternalSheepDog.g:1308:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1312:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalSheepDog.g:1313:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalSheepDog.g:1320:1: rule__Feature__Group__2__Impl : ( 'Feature:' ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1324:1: ( ( 'Feature:' ) )
            // InternalSheepDog.g:1325:1: ( 'Feature:' )
            {
            // InternalSheepDog.g:1325:1: ( 'Feature:' )
            // InternalSheepDog.g:1326:2: 'Feature:'
            {
             before(grammarAccess.getFeatureAccess().getFeatureKeyword_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalSheepDog.g:1335:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1339:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalSheepDog.g:1340:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
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
    // InternalSheepDog.g:1347:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__NameAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1351:1: ( ( ( rule__Feature__NameAssignment_3 ) ) )
            // InternalSheepDog.g:1352:1: ( ( rule__Feature__NameAssignment_3 ) )
            {
            // InternalSheepDog.g:1352:1: ( ( rule__Feature__NameAssignment_3 ) )
            // InternalSheepDog.g:1353:2: ( rule__Feature__NameAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_3()); 
            // InternalSheepDog.g:1354:2: ( rule__Feature__NameAssignment_3 )
            // InternalSheepDog.g:1354:3: rule__Feature__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Feature__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalSheepDog.g:1362:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl rule__Feature__Group__5 ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1366:1: ( rule__Feature__Group__4__Impl rule__Feature__Group__5 )
            // InternalSheepDog.g:1367:2: rule__Feature__Group__4__Impl rule__Feature__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalSheepDog.g:1374:1: rule__Feature__Group__4__Impl : ( RULE_EOL ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1378:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:1379:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:1379:1: ( RULE_EOL )
            // InternalSheepDog.g:1380:2: RULE_EOL
            {
             before(grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_4()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_4()); 

            }


            }

        }
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
    // InternalSheepDog.g:1389:1: rule__Feature__Group__5 : rule__Feature__Group__5__Impl rule__Feature__Group__6 ;
    public final void rule__Feature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1393:1: ( rule__Feature__Group__5__Impl rule__Feature__Group__6 )
            // InternalSheepDog.g:1394:2: rule__Feature__Group__5__Impl rule__Feature__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalSheepDog.g:1401:1: rule__Feature__Group__5__Impl : ( ( rule__Feature__StatementsAssignment_5 )* ) ;
    public final void rule__Feature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1405:1: ( ( ( rule__Feature__StatementsAssignment_5 )* ) )
            // InternalSheepDog.g:1406:1: ( ( rule__Feature__StatementsAssignment_5 )* )
            {
            // InternalSheepDog.g:1406:1: ( ( rule__Feature__StatementsAssignment_5 )* )
            // InternalSheepDog.g:1407:2: ( rule__Feature__StatementsAssignment_5 )*
            {
             before(grammarAccess.getFeatureAccess().getStatementsAssignment_5()); 
            // InternalSheepDog.g:1408:2: ( rule__Feature__StatementsAssignment_5 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_WORD) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSheepDog.g:1408:3: rule__Feature__StatementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Feature__StatementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getStatementsAssignment_5()); 

            }


            }

        }
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
    // InternalSheepDog.g:1416:1: rule__Feature__Group__6 : rule__Feature__Group__6__Impl ;
    public final void rule__Feature__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1420:1: ( rule__Feature__Group__6__Impl )
            // InternalSheepDog.g:1421:2: rule__Feature__Group__6__Impl
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
    // InternalSheepDog.g:1427:1: rule__Feature__Group__6__Impl : ( ( rule__Feature__AbstractScenariosAssignment_6 )* ) ;
    public final void rule__Feature__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1431:1: ( ( ( rule__Feature__AbstractScenariosAssignment_6 )* ) )
            // InternalSheepDog.g:1432:1: ( ( rule__Feature__AbstractScenariosAssignment_6 )* )
            {
            // InternalSheepDog.g:1432:1: ( ( rule__Feature__AbstractScenariosAssignment_6 )* )
            // InternalSheepDog.g:1433:2: ( rule__Feature__AbstractScenariosAssignment_6 )*
            {
             before(grammarAccess.getFeatureAccess().getAbstractScenariosAssignment_6()); 
            // InternalSheepDog.g:1434:2: ( rule__Feature__AbstractScenariosAssignment_6 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==11||LA16_0==26) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSheepDog.g:1434:3: rule__Feature__AbstractScenariosAssignment_6
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Feature__AbstractScenariosAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getAbstractScenariosAssignment_6()); 

            }


            }

        }
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
    // InternalSheepDog.g:1443:1: rule__Background__Group__0 : rule__Background__Group__0__Impl rule__Background__Group__1 ;
    public final void rule__Background__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1447:1: ( rule__Background__Group__0__Impl rule__Background__Group__1 )
            // InternalSheepDog.g:1448:2: rule__Background__Group__0__Impl rule__Background__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalSheepDog.g:1455:1: rule__Background__Group__0__Impl : ( ( rule__Background__TagsAssignment_0 )? ) ;
    public final void rule__Background__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1459:1: ( ( ( rule__Background__TagsAssignment_0 )? ) )
            // InternalSheepDog.g:1460:1: ( ( rule__Background__TagsAssignment_0 )? )
            {
            // InternalSheepDog.g:1460:1: ( ( rule__Background__TagsAssignment_0 )? )
            // InternalSheepDog.g:1461:2: ( rule__Background__TagsAssignment_0 )?
            {
             before(grammarAccess.getBackgroundAccess().getTagsAssignment_0()); 
            // InternalSheepDog.g:1462:2: ( rule__Background__TagsAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSheepDog.g:1462:3: rule__Background__TagsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Background__TagsAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBackgroundAccess().getTagsAssignment_0()); 

            }


            }

        }
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
    // InternalSheepDog.g:1470:1: rule__Background__Group__1 : rule__Background__Group__1__Impl rule__Background__Group__2 ;
    public final void rule__Background__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1474:1: ( rule__Background__Group__1__Impl rule__Background__Group__2 )
            // InternalSheepDog.g:1475:2: rule__Background__Group__1__Impl rule__Background__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalSheepDog.g:1482:1: rule__Background__Group__1__Impl : ( '==' ) ;
    public final void rule__Background__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1486:1: ( ( '==' ) )
            // InternalSheepDog.g:1487:1: ( '==' )
            {
            // InternalSheepDog.g:1487:1: ( '==' )
            // InternalSheepDog.g:1488:2: '=='
            {
             before(grammarAccess.getBackgroundAccess().getEqualsSignEqualsSignKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getBackgroundAccess().getEqualsSignEqualsSignKeyword_1()); 

            }


            }

        }
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
    // InternalSheepDog.g:1497:1: rule__Background__Group__2 : rule__Background__Group__2__Impl rule__Background__Group__3 ;
    public final void rule__Background__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1501:1: ( rule__Background__Group__2__Impl rule__Background__Group__3 )
            // InternalSheepDog.g:1502:2: rule__Background__Group__2__Impl rule__Background__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalSheepDog.g:1509:1: rule__Background__Group__2__Impl : ( 'Background:' ) ;
    public final void rule__Background__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1513:1: ( ( 'Background:' ) )
            // InternalSheepDog.g:1514:1: ( 'Background:' )
            {
            // InternalSheepDog.g:1514:1: ( 'Background:' )
            // InternalSheepDog.g:1515:2: 'Background:'
            {
             before(grammarAccess.getBackgroundAccess().getBackgroundKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBackgroundAccess().getBackgroundKeyword_2()); 

            }


            }

        }
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
    // InternalSheepDog.g:1524:1: rule__Background__Group__3 : rule__Background__Group__3__Impl rule__Background__Group__4 ;
    public final void rule__Background__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1528:1: ( rule__Background__Group__3__Impl rule__Background__Group__4 )
            // InternalSheepDog.g:1529:2: rule__Background__Group__3__Impl rule__Background__Group__4
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
    // InternalSheepDog.g:1536:1: rule__Background__Group__3__Impl : ( ( rule__Background__NameAssignment_3 ) ) ;
    public final void rule__Background__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1540:1: ( ( ( rule__Background__NameAssignment_3 ) ) )
            // InternalSheepDog.g:1541:1: ( ( rule__Background__NameAssignment_3 ) )
            {
            // InternalSheepDog.g:1541:1: ( ( rule__Background__NameAssignment_3 ) )
            // InternalSheepDog.g:1542:2: ( rule__Background__NameAssignment_3 )
            {
             before(grammarAccess.getBackgroundAccess().getNameAssignment_3()); 
            // InternalSheepDog.g:1543:2: ( rule__Background__NameAssignment_3 )
            // InternalSheepDog.g:1543:3: rule__Background__NameAssignment_3
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
    // InternalSheepDog.g:1551:1: rule__Background__Group__4 : rule__Background__Group__4__Impl rule__Background__Group__5 ;
    public final void rule__Background__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1555:1: ( rule__Background__Group__4__Impl rule__Background__Group__5 )
            // InternalSheepDog.g:1556:2: rule__Background__Group__4__Impl rule__Background__Group__5
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
    // InternalSheepDog.g:1563:1: rule__Background__Group__4__Impl : ( RULE_EOL ) ;
    public final void rule__Background__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1567:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:1568:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:1568:1: ( RULE_EOL )
            // InternalSheepDog.g:1569:2: RULE_EOL
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
    // InternalSheepDog.g:1578:1: rule__Background__Group__5 : rule__Background__Group__5__Impl rule__Background__Group__6 ;
    public final void rule__Background__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1582:1: ( rule__Background__Group__5__Impl rule__Background__Group__6 )
            // InternalSheepDog.g:1583:2: rule__Background__Group__5__Impl rule__Background__Group__6
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
    // InternalSheepDog.g:1590:1: rule__Background__Group__5__Impl : ( ( rule__Background__StatementsAssignment_5 )* ) ;
    public final void rule__Background__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1594:1: ( ( ( rule__Background__StatementsAssignment_5 )* ) )
            // InternalSheepDog.g:1595:1: ( ( rule__Background__StatementsAssignment_5 )* )
            {
            // InternalSheepDog.g:1595:1: ( ( rule__Background__StatementsAssignment_5 )* )
            // InternalSheepDog.g:1596:2: ( rule__Background__StatementsAssignment_5 )*
            {
             before(grammarAccess.getBackgroundAccess().getStatementsAssignment_5()); 
            // InternalSheepDog.g:1597:2: ( rule__Background__StatementsAssignment_5 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_WORD) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSheepDog.g:1597:3: rule__Background__StatementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Background__StatementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalSheepDog.g:1605:1: rule__Background__Group__6 : rule__Background__Group__6__Impl ;
    public final void rule__Background__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1609:1: ( rule__Background__Group__6__Impl )
            // InternalSheepDog.g:1610:2: rule__Background__Group__6__Impl
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
    // InternalSheepDog.g:1616:1: rule__Background__Group__6__Impl : ( ( rule__Background__StepsAssignment_6 )* ) ;
    public final void rule__Background__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1620:1: ( ( ( rule__Background__StepsAssignment_6 )* ) )
            // InternalSheepDog.g:1621:1: ( ( rule__Background__StepsAssignment_6 )* )
            {
            // InternalSheepDog.g:1621:1: ( ( rule__Background__StepsAssignment_6 )* )
            // InternalSheepDog.g:1622:2: ( rule__Background__StepsAssignment_6 )*
            {
             before(grammarAccess.getBackgroundAccess().getStepsAssignment_6()); 
            // InternalSheepDog.g:1623:2: ( rule__Background__StepsAssignment_6 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==13) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSheepDog.g:1623:3: rule__Background__StepsAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Background__StepsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalSheepDog.g:1632:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1636:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalSheepDog.g:1637:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalSheepDog.g:1644:1: rule__Scenario__Group__0__Impl : ( ( rule__Scenario__TagsAssignment_0 )? ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1648:1: ( ( ( rule__Scenario__TagsAssignment_0 )? ) )
            // InternalSheepDog.g:1649:1: ( ( rule__Scenario__TagsAssignment_0 )? )
            {
            // InternalSheepDog.g:1649:1: ( ( rule__Scenario__TagsAssignment_0 )? )
            // InternalSheepDog.g:1650:2: ( rule__Scenario__TagsAssignment_0 )?
            {
             before(grammarAccess.getScenarioAccess().getTagsAssignment_0()); 
            // InternalSheepDog.g:1651:2: ( rule__Scenario__TagsAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSheepDog.g:1651:3: rule__Scenario__TagsAssignment_0
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
    // InternalSheepDog.g:1659:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1663:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalSheepDog.g:1664:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalSheepDog.g:1671:1: rule__Scenario__Group__1__Impl : ( '==' ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1675:1: ( ( '==' ) )
            // InternalSheepDog.g:1676:1: ( '==' )
            {
            // InternalSheepDog.g:1676:1: ( '==' )
            // InternalSheepDog.g:1677:2: '=='
            {
             before(grammarAccess.getScenarioAccess().getEqualsSignEqualsSignKeyword_1()); 
            match(input,11,FOLLOW_2); 
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
    // InternalSheepDog.g:1686:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1690:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // InternalSheepDog.g:1691:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalSheepDog.g:1698:1: rule__Scenario__Group__2__Impl : ( 'Scenario:' ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1702:1: ( ( 'Scenario:' ) )
            // InternalSheepDog.g:1703:1: ( 'Scenario:' )
            {
            // InternalSheepDog.g:1703:1: ( 'Scenario:' )
            // InternalSheepDog.g:1704:2: 'Scenario:'
            {
             before(grammarAccess.getScenarioAccess().getScenarioKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalSheepDog.g:1713:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl rule__Scenario__Group__4 ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1717:1: ( rule__Scenario__Group__3__Impl rule__Scenario__Group__4 )
            // InternalSheepDog.g:1718:2: rule__Scenario__Group__3__Impl rule__Scenario__Group__4
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
    // InternalSheepDog.g:1725:1: rule__Scenario__Group__3__Impl : ( ( rule__Scenario__NameAssignment_3 ) ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1729:1: ( ( ( rule__Scenario__NameAssignment_3 ) ) )
            // InternalSheepDog.g:1730:1: ( ( rule__Scenario__NameAssignment_3 ) )
            {
            // InternalSheepDog.g:1730:1: ( ( rule__Scenario__NameAssignment_3 ) )
            // InternalSheepDog.g:1731:2: ( rule__Scenario__NameAssignment_3 )
            {
             before(grammarAccess.getScenarioAccess().getNameAssignment_3()); 
            // InternalSheepDog.g:1732:2: ( rule__Scenario__NameAssignment_3 )
            // InternalSheepDog.g:1732:3: rule__Scenario__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalSheepDog.g:1740:1: rule__Scenario__Group__4 : rule__Scenario__Group__4__Impl rule__Scenario__Group__5 ;
    public final void rule__Scenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1744:1: ( rule__Scenario__Group__4__Impl rule__Scenario__Group__5 )
            // InternalSheepDog.g:1745:2: rule__Scenario__Group__4__Impl rule__Scenario__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalSheepDog.g:1752:1: rule__Scenario__Group__4__Impl : ( RULE_EOL ) ;
    public final void rule__Scenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1756:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:1757:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:1757:1: ( RULE_EOL )
            // InternalSheepDog.g:1758:2: RULE_EOL
            {
             before(grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_4()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_4()); 

            }


            }

        }
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
    // InternalSheepDog.g:1767:1: rule__Scenario__Group__5 : rule__Scenario__Group__5__Impl rule__Scenario__Group__6 ;
    public final void rule__Scenario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1771:1: ( rule__Scenario__Group__5__Impl rule__Scenario__Group__6 )
            // InternalSheepDog.g:1772:2: rule__Scenario__Group__5__Impl rule__Scenario__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalSheepDog.g:1779:1: rule__Scenario__Group__5__Impl : ( ( rule__Scenario__StatementsAssignment_5 )* ) ;
    public final void rule__Scenario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1783:1: ( ( ( rule__Scenario__StatementsAssignment_5 )* ) )
            // InternalSheepDog.g:1784:1: ( ( rule__Scenario__StatementsAssignment_5 )* )
            {
            // InternalSheepDog.g:1784:1: ( ( rule__Scenario__StatementsAssignment_5 )* )
            // InternalSheepDog.g:1785:2: ( rule__Scenario__StatementsAssignment_5 )*
            {
             before(grammarAccess.getScenarioAccess().getStatementsAssignment_5()); 
            // InternalSheepDog.g:1786:2: ( rule__Scenario__StatementsAssignment_5 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_WORD) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSheepDog.g:1786:3: rule__Scenario__StatementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Scenario__StatementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getStatementsAssignment_5()); 

            }


            }

        }
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
    // InternalSheepDog.g:1794:1: rule__Scenario__Group__6 : rule__Scenario__Group__6__Impl rule__Scenario__Group__7 ;
    public final void rule__Scenario__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1798:1: ( rule__Scenario__Group__6__Impl rule__Scenario__Group__7 )
            // InternalSheepDog.g:1799:2: rule__Scenario__Group__6__Impl rule__Scenario__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__Scenario__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__7();

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
    // InternalSheepDog.g:1806:1: rule__Scenario__Group__6__Impl : ( ( rule__Scenario__StepsAssignment_6 )* ) ;
    public final void rule__Scenario__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1810:1: ( ( ( rule__Scenario__StepsAssignment_6 )* ) )
            // InternalSheepDog.g:1811:1: ( ( rule__Scenario__StepsAssignment_6 )* )
            {
            // InternalSheepDog.g:1811:1: ( ( rule__Scenario__StepsAssignment_6 )* )
            // InternalSheepDog.g:1812:2: ( rule__Scenario__StepsAssignment_6 )*
            {
             before(grammarAccess.getScenarioAccess().getStepsAssignment_6()); 
            // InternalSheepDog.g:1813:2: ( rule__Scenario__StepsAssignment_6 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==13) ) {
                    int LA22_2 = input.LA(2);

                    if ( ((LA22_2>=19 && LA22_2<=22)) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // InternalSheepDog.g:1813:3: rule__Scenario__StepsAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Scenario__StepsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getStepsAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Scenario__Group__7"
    // InternalSheepDog.g:1821:1: rule__Scenario__Group__7 : rule__Scenario__Group__7__Impl ;
    public final void rule__Scenario__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1825:1: ( rule__Scenario__Group__7__Impl )
            // InternalSheepDog.g:1826:2: rule__Scenario__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Group__7__Impl();

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
    // $ANTLR end "rule__Scenario__Group__7"


    // $ANTLR start "rule__Scenario__Group__7__Impl"
    // InternalSheepDog.g:1832:1: rule__Scenario__Group__7__Impl : ( ( rule__Scenario__ExamplesAssignment_7 )* ) ;
    public final void rule__Scenario__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1836:1: ( ( ( rule__Scenario__ExamplesAssignment_7 )* ) )
            // InternalSheepDog.g:1837:1: ( ( rule__Scenario__ExamplesAssignment_7 )* )
            {
            // InternalSheepDog.g:1837:1: ( ( rule__Scenario__ExamplesAssignment_7 )* )
            // InternalSheepDog.g:1838:2: ( rule__Scenario__ExamplesAssignment_7 )*
            {
             before(grammarAccess.getScenarioAccess().getExamplesAssignment_7()); 
            // InternalSheepDog.g:1839:2: ( rule__Scenario__ExamplesAssignment_7 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==26) ) {
                    int LA23_2 = input.LA(2);

                    if ( (LA23_2==RULE_WORD) ) {
                        int LA23_4 = input.LA(3);

                        if ( (LA23_4==27) ) {
                            int LA23_5 = input.LA(4);

                            if ( (LA23_5==RULE_EOL) ) {
                                int LA23_6 = input.LA(5);

                                if ( (LA23_6==13) ) {
                                    alt23=1;
                                }


                            }


                        }


                    }


                }
                else if ( (LA23_0==13) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSheepDog.g:1839:3: rule__Scenario__ExamplesAssignment_7
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Scenario__ExamplesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getExamplesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__7__Impl"


    // $ANTLR start "rule__Examples__Group__0"
    // InternalSheepDog.g:1848:1: rule__Examples__Group__0 : rule__Examples__Group__0__Impl rule__Examples__Group__1 ;
    public final void rule__Examples__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1852:1: ( rule__Examples__Group__0__Impl rule__Examples__Group__1 )
            // InternalSheepDog.g:1853:2: rule__Examples__Group__0__Impl rule__Examples__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalSheepDog.g:1860:1: rule__Examples__Group__0__Impl : ( ( rule__Examples__TagsAssignment_0 )? ) ;
    public final void rule__Examples__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1864:1: ( ( ( rule__Examples__TagsAssignment_0 )? ) )
            // InternalSheepDog.g:1865:1: ( ( rule__Examples__TagsAssignment_0 )? )
            {
            // InternalSheepDog.g:1865:1: ( ( rule__Examples__TagsAssignment_0 )? )
            // InternalSheepDog.g:1866:2: ( rule__Examples__TagsAssignment_0 )?
            {
             before(grammarAccess.getExamplesAccess().getTagsAssignment_0()); 
            // InternalSheepDog.g:1867:2: ( rule__Examples__TagsAssignment_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSheepDog.g:1867:3: rule__Examples__TagsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Examples__TagsAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExamplesAccess().getTagsAssignment_0()); 

            }


            }

        }
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
    // InternalSheepDog.g:1875:1: rule__Examples__Group__1 : rule__Examples__Group__1__Impl rule__Examples__Group__2 ;
    public final void rule__Examples__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1879:1: ( rule__Examples__Group__1__Impl rule__Examples__Group__2 )
            // InternalSheepDog.g:1880:2: rule__Examples__Group__1__Impl rule__Examples__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalSheepDog.g:1887:1: rule__Examples__Group__1__Impl : ( '===' ) ;
    public final void rule__Examples__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1891:1: ( ( '===' ) )
            // InternalSheepDog.g:1892:1: ( '===' )
            {
            // InternalSheepDog.g:1892:1: ( '===' )
            // InternalSheepDog.g:1893:2: '==='
            {
             before(grammarAccess.getExamplesAccess().getEqualsSignEqualsSignEqualsSignKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getExamplesAccess().getEqualsSignEqualsSignEqualsSignKeyword_1()); 

            }


            }

        }
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
    // InternalSheepDog.g:1902:1: rule__Examples__Group__2 : rule__Examples__Group__2__Impl rule__Examples__Group__3 ;
    public final void rule__Examples__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1906:1: ( rule__Examples__Group__2__Impl rule__Examples__Group__3 )
            // InternalSheepDog.g:1907:2: rule__Examples__Group__2__Impl rule__Examples__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalSheepDog.g:1914:1: rule__Examples__Group__2__Impl : ( 'Examples:' ) ;
    public final void rule__Examples__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1918:1: ( ( 'Examples:' ) )
            // InternalSheepDog.g:1919:1: ( 'Examples:' )
            {
            // InternalSheepDog.g:1919:1: ( 'Examples:' )
            // InternalSheepDog.g:1920:2: 'Examples:'
            {
             before(grammarAccess.getExamplesAccess().getExamplesKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getExamplesAccess().getExamplesKeyword_2()); 

            }


            }

        }
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
    // InternalSheepDog.g:1929:1: rule__Examples__Group__3 : rule__Examples__Group__3__Impl rule__Examples__Group__4 ;
    public final void rule__Examples__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1933:1: ( rule__Examples__Group__3__Impl rule__Examples__Group__4 )
            // InternalSheepDog.g:1934:2: rule__Examples__Group__3__Impl rule__Examples__Group__4
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
    // InternalSheepDog.g:1941:1: rule__Examples__Group__3__Impl : ( ( rule__Examples__NameAssignment_3 ) ) ;
    public final void rule__Examples__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1945:1: ( ( ( rule__Examples__NameAssignment_3 ) ) )
            // InternalSheepDog.g:1946:1: ( ( rule__Examples__NameAssignment_3 ) )
            {
            // InternalSheepDog.g:1946:1: ( ( rule__Examples__NameAssignment_3 ) )
            // InternalSheepDog.g:1947:2: ( rule__Examples__NameAssignment_3 )
            {
             before(grammarAccess.getExamplesAccess().getNameAssignment_3()); 
            // InternalSheepDog.g:1948:2: ( rule__Examples__NameAssignment_3 )
            // InternalSheepDog.g:1948:3: rule__Examples__NameAssignment_3
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
    // InternalSheepDog.g:1956:1: rule__Examples__Group__4 : rule__Examples__Group__4__Impl rule__Examples__Group__5 ;
    public final void rule__Examples__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1960:1: ( rule__Examples__Group__4__Impl rule__Examples__Group__5 )
            // InternalSheepDog.g:1961:2: rule__Examples__Group__4__Impl rule__Examples__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalSheepDog.g:1968:1: rule__Examples__Group__4__Impl : ( RULE_EOL ) ;
    public final void rule__Examples__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1972:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:1973:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:1973:1: ( RULE_EOL )
            // InternalSheepDog.g:1974:2: RULE_EOL
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
    // InternalSheepDog.g:1983:1: rule__Examples__Group__5 : rule__Examples__Group__5__Impl rule__Examples__Group__6 ;
    public final void rule__Examples__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1987:1: ( rule__Examples__Group__5__Impl rule__Examples__Group__6 )
            // InternalSheepDog.g:1988:2: rule__Examples__Group__5__Impl rule__Examples__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalSheepDog.g:1995:1: rule__Examples__Group__5__Impl : ( ( rule__Examples__StatementsAssignment_5 )* ) ;
    public final void rule__Examples__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1999:1: ( ( ( rule__Examples__StatementsAssignment_5 )* ) )
            // InternalSheepDog.g:2000:1: ( ( rule__Examples__StatementsAssignment_5 )* )
            {
            // InternalSheepDog.g:2000:1: ( ( rule__Examples__StatementsAssignment_5 )* )
            // InternalSheepDog.g:2001:2: ( rule__Examples__StatementsAssignment_5 )*
            {
             before(grammarAccess.getExamplesAccess().getStatementsAssignment_5()); 
            // InternalSheepDog.g:2002:2: ( rule__Examples__StatementsAssignment_5 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_WORD) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSheepDog.g:2002:3: rule__Examples__StatementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Examples__StatementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalSheepDog.g:2010:1: rule__Examples__Group__6 : rule__Examples__Group__6__Impl ;
    public final void rule__Examples__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2014:1: ( rule__Examples__Group__6__Impl )
            // InternalSheepDog.g:2015:2: rule__Examples__Group__6__Impl
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
    // InternalSheepDog.g:2021:1: rule__Examples__Group__6__Impl : ( ( rule__Examples__TheExamplesTableAssignment_6 ) ) ;
    public final void rule__Examples__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2025:1: ( ( ( rule__Examples__TheExamplesTableAssignment_6 ) ) )
            // InternalSheepDog.g:2026:1: ( ( rule__Examples__TheExamplesTableAssignment_6 ) )
            {
            // InternalSheepDog.g:2026:1: ( ( rule__Examples__TheExamplesTableAssignment_6 ) )
            // InternalSheepDog.g:2027:2: ( rule__Examples__TheExamplesTableAssignment_6 )
            {
             before(grammarAccess.getExamplesAccess().getTheExamplesTableAssignment_6()); 
            // InternalSheepDog.g:2028:2: ( rule__Examples__TheExamplesTableAssignment_6 )
            // InternalSheepDog.g:2028:3: rule__Examples__TheExamplesTableAssignment_6
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


    // $ANTLR start "rule__Given__Group__0"
    // InternalSheepDog.g:2037:1: rule__Given__Group__0 : rule__Given__Group__0__Impl rule__Given__Group__1 ;
    public final void rule__Given__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2041:1: ( rule__Given__Group__0__Impl rule__Given__Group__1 )
            // InternalSheepDog.g:2042:2: rule__Given__Group__0__Impl rule__Given__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalSheepDog.g:2049:1: rule__Given__Group__0__Impl : ( '===' ) ;
    public final void rule__Given__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2053:1: ( ( '===' ) )
            // InternalSheepDog.g:2054:1: ( '===' )
            {
            // InternalSheepDog.g:2054:1: ( '===' )
            // InternalSheepDog.g:2055:2: '==='
            {
             before(grammarAccess.getGivenAccess().getEqualsSignEqualsSignEqualsSignKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalSheepDog.g:2064:1: rule__Given__Group__1 : rule__Given__Group__1__Impl rule__Given__Group__2 ;
    public final void rule__Given__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2068:1: ( rule__Given__Group__1__Impl rule__Given__Group__2 )
            // InternalSheepDog.g:2069:2: rule__Given__Group__1__Impl rule__Given__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSheepDog.g:2076:1: rule__Given__Group__1__Impl : ( 'Given:' ) ;
    public final void rule__Given__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2080:1: ( ( 'Given:' ) )
            // InternalSheepDog.g:2081:1: ( 'Given:' )
            {
            // InternalSheepDog.g:2081:1: ( 'Given:' )
            // InternalSheepDog.g:2082:2: 'Given:'
            {
             before(grammarAccess.getGivenAccess().getGivenKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSheepDog.g:2091:1: rule__Given__Group__2 : rule__Given__Group__2__Impl rule__Given__Group__3 ;
    public final void rule__Given__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2095:1: ( rule__Given__Group__2__Impl rule__Given__Group__3 )
            // InternalSheepDog.g:2096:2: rule__Given__Group__2__Impl rule__Given__Group__3
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
    // InternalSheepDog.g:2103:1: rule__Given__Group__2__Impl : ( ( rule__Given__NameAssignment_2 ) ) ;
    public final void rule__Given__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2107:1: ( ( ( rule__Given__NameAssignment_2 ) ) )
            // InternalSheepDog.g:2108:1: ( ( rule__Given__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:2108:1: ( ( rule__Given__NameAssignment_2 ) )
            // InternalSheepDog.g:2109:2: ( rule__Given__NameAssignment_2 )
            {
             before(grammarAccess.getGivenAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:2110:2: ( rule__Given__NameAssignment_2 )
            // InternalSheepDog.g:2110:3: rule__Given__NameAssignment_2
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
    // InternalSheepDog.g:2118:1: rule__Given__Group__3 : rule__Given__Group__3__Impl rule__Given__Group__4 ;
    public final void rule__Given__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2122:1: ( rule__Given__Group__3__Impl rule__Given__Group__4 )
            // InternalSheepDog.g:2123:2: rule__Given__Group__3__Impl rule__Given__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalSheepDog.g:2130:1: rule__Given__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Given__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2134:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2135:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2135:1: ( RULE_EOL )
            // InternalSheepDog.g:2136:2: RULE_EOL
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
    // InternalSheepDog.g:2145:1: rule__Given__Group__4 : rule__Given__Group__4__Impl ;
    public final void rule__Given__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2149:1: ( rule__Given__Group__4__Impl )
            // InternalSheepDog.g:2150:2: rule__Given__Group__4__Impl
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
    // InternalSheepDog.g:2156:1: rule__Given__Group__4__Impl : ( ( rule__Given__Alternatives_4 )? ) ;
    public final void rule__Given__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2160:1: ( ( ( rule__Given__Alternatives_4 )? ) )
            // InternalSheepDog.g:2161:1: ( ( rule__Given__Alternatives_4 )? )
            {
            // InternalSheepDog.g:2161:1: ( ( rule__Given__Alternatives_4 )? )
            // InternalSheepDog.g:2162:2: ( rule__Given__Alternatives_4 )?
            {
             before(grammarAccess.getGivenAccess().getAlternatives_4()); 
            // InternalSheepDog.g:2163:2: ( rule__Given__Alternatives_4 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_RAWTEXT||LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSheepDog.g:2163:3: rule__Given__Alternatives_4
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
    // InternalSheepDog.g:2172:1: rule__When__Group__0 : rule__When__Group__0__Impl rule__When__Group__1 ;
    public final void rule__When__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2176:1: ( rule__When__Group__0__Impl rule__When__Group__1 )
            // InternalSheepDog.g:2177:2: rule__When__Group__0__Impl rule__When__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSheepDog.g:2184:1: rule__When__Group__0__Impl : ( '===' ) ;
    public final void rule__When__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2188:1: ( ( '===' ) )
            // InternalSheepDog.g:2189:1: ( '===' )
            {
            // InternalSheepDog.g:2189:1: ( '===' )
            // InternalSheepDog.g:2190:2: '==='
            {
             before(grammarAccess.getWhenAccess().getEqualsSignEqualsSignEqualsSignKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalSheepDog.g:2199:1: rule__When__Group__1 : rule__When__Group__1__Impl rule__When__Group__2 ;
    public final void rule__When__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2203:1: ( rule__When__Group__1__Impl rule__When__Group__2 )
            // InternalSheepDog.g:2204:2: rule__When__Group__1__Impl rule__When__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSheepDog.g:2211:1: rule__When__Group__1__Impl : ( 'When:' ) ;
    public final void rule__When__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2215:1: ( ( 'When:' ) )
            // InternalSheepDog.g:2216:1: ( 'When:' )
            {
            // InternalSheepDog.g:2216:1: ( 'When:' )
            // InternalSheepDog.g:2217:2: 'When:'
            {
             before(grammarAccess.getWhenAccess().getWhenKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSheepDog.g:2226:1: rule__When__Group__2 : rule__When__Group__2__Impl rule__When__Group__3 ;
    public final void rule__When__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2230:1: ( rule__When__Group__2__Impl rule__When__Group__3 )
            // InternalSheepDog.g:2231:2: rule__When__Group__2__Impl rule__When__Group__3
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
    // InternalSheepDog.g:2238:1: rule__When__Group__2__Impl : ( ( rule__When__NameAssignment_2 ) ) ;
    public final void rule__When__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2242:1: ( ( ( rule__When__NameAssignment_2 ) ) )
            // InternalSheepDog.g:2243:1: ( ( rule__When__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:2243:1: ( ( rule__When__NameAssignment_2 ) )
            // InternalSheepDog.g:2244:2: ( rule__When__NameAssignment_2 )
            {
             before(grammarAccess.getWhenAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:2245:2: ( rule__When__NameAssignment_2 )
            // InternalSheepDog.g:2245:3: rule__When__NameAssignment_2
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
    // InternalSheepDog.g:2253:1: rule__When__Group__3 : rule__When__Group__3__Impl rule__When__Group__4 ;
    public final void rule__When__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2257:1: ( rule__When__Group__3__Impl rule__When__Group__4 )
            // InternalSheepDog.g:2258:2: rule__When__Group__3__Impl rule__When__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalSheepDog.g:2265:1: rule__When__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__When__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2269:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2270:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2270:1: ( RULE_EOL )
            // InternalSheepDog.g:2271:2: RULE_EOL
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
    // InternalSheepDog.g:2280:1: rule__When__Group__4 : rule__When__Group__4__Impl ;
    public final void rule__When__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2284:1: ( rule__When__Group__4__Impl )
            // InternalSheepDog.g:2285:2: rule__When__Group__4__Impl
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
    // InternalSheepDog.g:2291:1: rule__When__Group__4__Impl : ( ( rule__When__Alternatives_4 )? ) ;
    public final void rule__When__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2295:1: ( ( ( rule__When__Alternatives_4 )? ) )
            // InternalSheepDog.g:2296:1: ( ( rule__When__Alternatives_4 )? )
            {
            // InternalSheepDog.g:2296:1: ( ( rule__When__Alternatives_4 )? )
            // InternalSheepDog.g:2297:2: ( rule__When__Alternatives_4 )?
            {
             before(grammarAccess.getWhenAccess().getAlternatives_4()); 
            // InternalSheepDog.g:2298:2: ( rule__When__Alternatives_4 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_RAWTEXT||LA27_0==23) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSheepDog.g:2298:3: rule__When__Alternatives_4
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
    // InternalSheepDog.g:2307:1: rule__Then__Group__0 : rule__Then__Group__0__Impl rule__Then__Group__1 ;
    public final void rule__Then__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2311:1: ( rule__Then__Group__0__Impl rule__Then__Group__1 )
            // InternalSheepDog.g:2312:2: rule__Then__Group__0__Impl rule__Then__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalSheepDog.g:2319:1: rule__Then__Group__0__Impl : ( '===' ) ;
    public final void rule__Then__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2323:1: ( ( '===' ) )
            // InternalSheepDog.g:2324:1: ( '===' )
            {
            // InternalSheepDog.g:2324:1: ( '===' )
            // InternalSheepDog.g:2325:2: '==='
            {
             before(grammarAccess.getThenAccess().getEqualsSignEqualsSignEqualsSignKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalSheepDog.g:2334:1: rule__Then__Group__1 : rule__Then__Group__1__Impl rule__Then__Group__2 ;
    public final void rule__Then__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2338:1: ( rule__Then__Group__1__Impl rule__Then__Group__2 )
            // InternalSheepDog.g:2339:2: rule__Then__Group__1__Impl rule__Then__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSheepDog.g:2346:1: rule__Then__Group__1__Impl : ( 'Then:' ) ;
    public final void rule__Then__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2350:1: ( ( 'Then:' ) )
            // InternalSheepDog.g:2351:1: ( 'Then:' )
            {
            // InternalSheepDog.g:2351:1: ( 'Then:' )
            // InternalSheepDog.g:2352:2: 'Then:'
            {
             before(grammarAccess.getThenAccess().getThenKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSheepDog.g:2361:1: rule__Then__Group__2 : rule__Then__Group__2__Impl rule__Then__Group__3 ;
    public final void rule__Then__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2365:1: ( rule__Then__Group__2__Impl rule__Then__Group__3 )
            // InternalSheepDog.g:2366:2: rule__Then__Group__2__Impl rule__Then__Group__3
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
    // InternalSheepDog.g:2373:1: rule__Then__Group__2__Impl : ( ( rule__Then__NameAssignment_2 ) ) ;
    public final void rule__Then__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2377:1: ( ( ( rule__Then__NameAssignment_2 ) ) )
            // InternalSheepDog.g:2378:1: ( ( rule__Then__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:2378:1: ( ( rule__Then__NameAssignment_2 ) )
            // InternalSheepDog.g:2379:2: ( rule__Then__NameAssignment_2 )
            {
             before(grammarAccess.getThenAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:2380:2: ( rule__Then__NameAssignment_2 )
            // InternalSheepDog.g:2380:3: rule__Then__NameAssignment_2
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
    // InternalSheepDog.g:2388:1: rule__Then__Group__3 : rule__Then__Group__3__Impl rule__Then__Group__4 ;
    public final void rule__Then__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2392:1: ( rule__Then__Group__3__Impl rule__Then__Group__4 )
            // InternalSheepDog.g:2393:2: rule__Then__Group__3__Impl rule__Then__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalSheepDog.g:2400:1: rule__Then__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Then__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2404:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2405:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2405:1: ( RULE_EOL )
            // InternalSheepDog.g:2406:2: RULE_EOL
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
    // InternalSheepDog.g:2415:1: rule__Then__Group__4 : rule__Then__Group__4__Impl ;
    public final void rule__Then__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2419:1: ( rule__Then__Group__4__Impl )
            // InternalSheepDog.g:2420:2: rule__Then__Group__4__Impl
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
    // InternalSheepDog.g:2426:1: rule__Then__Group__4__Impl : ( ( rule__Then__Alternatives_4 )? ) ;
    public final void rule__Then__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2430:1: ( ( ( rule__Then__Alternatives_4 )? ) )
            // InternalSheepDog.g:2431:1: ( ( rule__Then__Alternatives_4 )? )
            {
            // InternalSheepDog.g:2431:1: ( ( rule__Then__Alternatives_4 )? )
            // InternalSheepDog.g:2432:2: ( rule__Then__Alternatives_4 )?
            {
             before(grammarAccess.getThenAccess().getAlternatives_4()); 
            // InternalSheepDog.g:2433:2: ( rule__Then__Alternatives_4 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_RAWTEXT||LA28_0==23) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSheepDog.g:2433:3: rule__Then__Alternatives_4
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


    // $ANTLR start "rule__And__Group__0"
    // InternalSheepDog.g:2442:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2446:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalSheepDog.g:2447:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group__1();

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
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // InternalSheepDog.g:2454:1: rule__And__Group__0__Impl : ( '===' ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2458:1: ( ( '===' ) )
            // InternalSheepDog.g:2459:1: ( '===' )
            {
            // InternalSheepDog.g:2459:1: ( '===' )
            // InternalSheepDog.g:2460:2: '==='
            {
             before(grammarAccess.getAndAccess().getEqualsSignEqualsSignEqualsSignKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAndAccess().getEqualsSignEqualsSignEqualsSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // InternalSheepDog.g:2469:1: rule__And__Group__1 : rule__And__Group__1__Impl rule__And__Group__2 ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2473:1: ( rule__And__Group__1__Impl rule__And__Group__2 )
            // InternalSheepDog.g:2474:2: rule__And__Group__1__Impl rule__And__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__And__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group__2();

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
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // InternalSheepDog.g:2481:1: rule__And__Group__1__Impl : ( 'And:' ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2485:1: ( ( 'And:' ) )
            // InternalSheepDog.g:2486:1: ( 'And:' )
            {
            // InternalSheepDog.g:2486:1: ( 'And:' )
            // InternalSheepDog.g:2487:2: 'And:'
            {
             before(grammarAccess.getAndAccess().getAndKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAndAccess().getAndKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group__2"
    // InternalSheepDog.g:2496:1: rule__And__Group__2 : rule__And__Group__2__Impl rule__And__Group__3 ;
    public final void rule__And__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2500:1: ( rule__And__Group__2__Impl rule__And__Group__3 )
            // InternalSheepDog.g:2501:2: rule__And__Group__2__Impl rule__And__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__And__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group__3();

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
    // $ANTLR end "rule__And__Group__2"


    // $ANTLR start "rule__And__Group__2__Impl"
    // InternalSheepDog.g:2508:1: rule__And__Group__2__Impl : ( ( rule__And__NameAssignment_2 ) ) ;
    public final void rule__And__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2512:1: ( ( ( rule__And__NameAssignment_2 ) ) )
            // InternalSheepDog.g:2513:1: ( ( rule__And__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:2513:1: ( ( rule__And__NameAssignment_2 ) )
            // InternalSheepDog.g:2514:2: ( rule__And__NameAssignment_2 )
            {
             before(grammarAccess.getAndAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:2515:2: ( rule__And__NameAssignment_2 )
            // InternalSheepDog.g:2515:3: rule__And__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__And__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__2__Impl"


    // $ANTLR start "rule__And__Group__3"
    // InternalSheepDog.g:2523:1: rule__And__Group__3 : rule__And__Group__3__Impl rule__And__Group__4 ;
    public final void rule__And__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2527:1: ( rule__And__Group__3__Impl rule__And__Group__4 )
            // InternalSheepDog.g:2528:2: rule__And__Group__3__Impl rule__And__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__And__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group__4();

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
    // $ANTLR end "rule__And__Group__3"


    // $ANTLR start "rule__And__Group__3__Impl"
    // InternalSheepDog.g:2535:1: rule__And__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__And__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2539:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2540:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2540:1: ( RULE_EOL )
            // InternalSheepDog.g:2541:2: RULE_EOL
            {
             before(grammarAccess.getAndAccess().getEOLTerminalRuleCall_3()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getAndAccess().getEOLTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__3__Impl"


    // $ANTLR start "rule__And__Group__4"
    // InternalSheepDog.g:2550:1: rule__And__Group__4 : rule__And__Group__4__Impl ;
    public final void rule__And__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2554:1: ( rule__And__Group__4__Impl )
            // InternalSheepDog.g:2555:2: rule__And__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__4__Impl();

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
    // $ANTLR end "rule__And__Group__4"


    // $ANTLR start "rule__And__Group__4__Impl"
    // InternalSheepDog.g:2561:1: rule__And__Group__4__Impl : ( ( rule__And__Alternatives_4 )? ) ;
    public final void rule__And__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2565:1: ( ( ( rule__And__Alternatives_4 )? ) )
            // InternalSheepDog.g:2566:1: ( ( rule__And__Alternatives_4 )? )
            {
            // InternalSheepDog.g:2566:1: ( ( rule__And__Alternatives_4 )? )
            // InternalSheepDog.g:2567:2: ( rule__And__Alternatives_4 )?
            {
             before(grammarAccess.getAndAccess().getAlternatives_4()); 
            // InternalSheepDog.g:2568:2: ( rule__And__Alternatives_4 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_RAWTEXT||LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSheepDog.g:2568:3: rule__And__Alternatives_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__And__Alternatives_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAndAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__4__Impl"


    // $ANTLR start "rule__DocString__Group__0"
    // InternalSheepDog.g:2577:1: rule__DocString__Group__0 : rule__DocString__Group__0__Impl rule__DocString__Group__1 ;
    public final void rule__DocString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2581:1: ( rule__DocString__Group__0__Impl rule__DocString__Group__1 )
            // InternalSheepDog.g:2582:2: rule__DocString__Group__0__Impl rule__DocString__Group__1
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
    // InternalSheepDog.g:2589:1: rule__DocString__Group__0__Impl : ( ( rule__DocString__NameAssignment_0 ) ) ;
    public final void rule__DocString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2593:1: ( ( ( rule__DocString__NameAssignment_0 ) ) )
            // InternalSheepDog.g:2594:1: ( ( rule__DocString__NameAssignment_0 ) )
            {
            // InternalSheepDog.g:2594:1: ( ( rule__DocString__NameAssignment_0 ) )
            // InternalSheepDog.g:2595:2: ( rule__DocString__NameAssignment_0 )
            {
             before(grammarAccess.getDocStringAccess().getNameAssignment_0()); 
            // InternalSheepDog.g:2596:2: ( rule__DocString__NameAssignment_0 )
            // InternalSheepDog.g:2596:3: rule__DocString__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DocString__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDocStringAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // InternalSheepDog.g:2604:1: rule__DocString__Group__1 : rule__DocString__Group__1__Impl ;
    public final void rule__DocString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2608:1: ( rule__DocString__Group__1__Impl )
            // InternalSheepDog.g:2609:2: rule__DocString__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DocString__Group__1__Impl();

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
    // InternalSheepDog.g:2615:1: rule__DocString__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__DocString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2619:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2620:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2620:1: ( RULE_EOL )
            // InternalSheepDog.g:2621:2: RULE_EOL
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


    // $ANTLR start "rule__Table__Group__0"
    // InternalSheepDog.g:2631:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2635:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalSheepDog.g:2636:2: rule__Table__Group__0__Impl rule__Table__Group__1
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
    // InternalSheepDog.g:2643:1: rule__Table__Group__0__Impl : ( '[options=\"header\"]' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2647:1: ( ( '[options=\"header\"]' ) )
            // InternalSheepDog.g:2648:1: ( '[options=\"header\"]' )
            {
            // InternalSheepDog.g:2648:1: ( '[options=\"header\"]' )
            // InternalSheepDog.g:2649:2: '[options=\"header\"]'
            {
             before(grammarAccess.getTableAccess().getOptionsHeaderKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSheepDog.g:2658:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2662:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalSheepDog.g:2663:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalSheepDog.g:2670:1: rule__Table__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2674:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2675:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2675:1: ( RULE_EOL )
            // InternalSheepDog.g:2676:2: RULE_EOL
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
    // InternalSheepDog.g:2685:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2689:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalSheepDog.g:2690:2: rule__Table__Group__2__Impl rule__Table__Group__3
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
    // InternalSheepDog.g:2697:1: rule__Table__Group__2__Impl : ( '|===' ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2701:1: ( ( '|===' ) )
            // InternalSheepDog.g:2702:1: ( '|===' )
            {
            // InternalSheepDog.g:2702:1: ( '|===' )
            // InternalSheepDog.g:2703:2: '|==='
            {
             before(grammarAccess.getTableAccess().getVerticalLineEqualsSignEqualsSignEqualsSignKeyword_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSheepDog.g:2712:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2716:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalSheepDog.g:2717:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalSheepDog.g:2724:1: rule__Table__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2728:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2729:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2729:1: ( RULE_EOL )
            // InternalSheepDog.g:2730:2: RULE_EOL
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
    // InternalSheepDog.g:2739:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2743:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalSheepDog.g:2744:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalSheepDog.g:2751:1: rule__Table__Group__4__Impl : ( ( ( rule__Table__RowsAssignment_4 ) ) ( ( rule__Table__RowsAssignment_4 )* ) ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2755:1: ( ( ( ( rule__Table__RowsAssignment_4 ) ) ( ( rule__Table__RowsAssignment_4 )* ) ) )
            // InternalSheepDog.g:2756:1: ( ( ( rule__Table__RowsAssignment_4 ) ) ( ( rule__Table__RowsAssignment_4 )* ) )
            {
            // InternalSheepDog.g:2756:1: ( ( ( rule__Table__RowsAssignment_4 ) ) ( ( rule__Table__RowsAssignment_4 )* ) )
            // InternalSheepDog.g:2757:2: ( ( rule__Table__RowsAssignment_4 ) ) ( ( rule__Table__RowsAssignment_4 )* )
            {
            // InternalSheepDog.g:2757:2: ( ( rule__Table__RowsAssignment_4 ) )
            // InternalSheepDog.g:2758:3: ( rule__Table__RowsAssignment_4 )
            {
             before(grammarAccess.getTableAccess().getRowsAssignment_4()); 
            // InternalSheepDog.g:2759:3: ( rule__Table__RowsAssignment_4 )
            // InternalSheepDog.g:2759:4: rule__Table__RowsAssignment_4
            {
            pushFollow(FOLLOW_32);
            rule__Table__RowsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getRowsAssignment_4()); 

            }

            // InternalSheepDog.g:2762:2: ( ( rule__Table__RowsAssignment_4 )* )
            // InternalSheepDog.g:2763:3: ( rule__Table__RowsAssignment_4 )*
            {
             before(grammarAccess.getTableAccess().getRowsAssignment_4()); 
            // InternalSheepDog.g:2764:3: ( rule__Table__RowsAssignment_4 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==28) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSheepDog.g:2764:4: rule__Table__RowsAssignment_4
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Table__RowsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalSheepDog.g:2773:1: rule__Table__Group__5 : rule__Table__Group__5__Impl rule__Table__Group__6 ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2777:1: ( rule__Table__Group__5__Impl rule__Table__Group__6 )
            // InternalSheepDog.g:2778:2: rule__Table__Group__5__Impl rule__Table__Group__6
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
    // InternalSheepDog.g:2785:1: rule__Table__Group__5__Impl : ( '|===' ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2789:1: ( ( '|===' ) )
            // InternalSheepDog.g:2790:1: ( '|===' )
            {
            // InternalSheepDog.g:2790:1: ( '|===' )
            // InternalSheepDog.g:2791:2: '|==='
            {
             before(grammarAccess.getTableAccess().getVerticalLineEqualsSignEqualsSignEqualsSignKeyword_5()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSheepDog.g:2800:1: rule__Table__Group__6 : rule__Table__Group__6__Impl ;
    public final void rule__Table__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2804:1: ( rule__Table__Group__6__Impl )
            // InternalSheepDog.g:2805:2: rule__Table__Group__6__Impl
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
    // InternalSheepDog.g:2811:1: rule__Table__Group__6__Impl : ( RULE_EOL ) ;
    public final void rule__Table__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2815:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2816:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2816:1: ( RULE_EOL )
            // InternalSheepDog.g:2817:2: RULE_EOL
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
    // InternalSheepDog.g:2827:1: rule__Row__Group__0 : rule__Row__Group__0__Impl rule__Row__Group__1 ;
    public final void rule__Row__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2831:1: ( rule__Row__Group__0__Impl rule__Row__Group__1 )
            // InternalSheepDog.g:2832:2: rule__Row__Group__0__Impl rule__Row__Group__1
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
    // InternalSheepDog.g:2839:1: rule__Row__Group__0__Impl : ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) ) ;
    public final void rule__Row__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2843:1: ( ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) ) )
            // InternalSheepDog.g:2844:1: ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) )
            {
            // InternalSheepDog.g:2844:1: ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) )
            // InternalSheepDog.g:2845:2: ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* )
            {
            // InternalSheepDog.g:2845:2: ( ( rule__Row__CellsAssignment_0 ) )
            // InternalSheepDog.g:2846:3: ( rule__Row__CellsAssignment_0 )
            {
             before(grammarAccess.getRowAccess().getCellsAssignment_0()); 
            // InternalSheepDog.g:2847:3: ( rule__Row__CellsAssignment_0 )
            // InternalSheepDog.g:2847:4: rule__Row__CellsAssignment_0
            {
            pushFollow(FOLLOW_32);
            rule__Row__CellsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getCellsAssignment_0()); 

            }

            // InternalSheepDog.g:2850:2: ( ( rule__Row__CellsAssignment_0 )* )
            // InternalSheepDog.g:2851:3: ( rule__Row__CellsAssignment_0 )*
            {
             before(grammarAccess.getRowAccess().getCellsAssignment_0()); 
            // InternalSheepDog.g:2852:3: ( rule__Row__CellsAssignment_0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==28) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalSheepDog.g:2852:4: rule__Row__CellsAssignment_0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Row__CellsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalSheepDog.g:2861:1: rule__Row__Group__1 : rule__Row__Group__1__Impl ;
    public final void rule__Row__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2865:1: ( rule__Row__Group__1__Impl )
            // InternalSheepDog.g:2866:2: rule__Row__Group__1__Impl
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
    // InternalSheepDog.g:2872:1: rule__Row__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Row__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2876:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2877:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2877:1: ( RULE_EOL )
            // InternalSheepDog.g:2878:2: RULE_EOL
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


    // $ANTLR start "rule__FeatureTags__Group__0"
    // InternalSheepDog.g:2888:1: rule__FeatureTags__Group__0 : rule__FeatureTags__Group__0__Impl rule__FeatureTags__Group__1 ;
    public final void rule__FeatureTags__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2892:1: ( rule__FeatureTags__Group__0__Impl rule__FeatureTags__Group__1 )
            // InternalSheepDog.g:2893:2: rule__FeatureTags__Group__0__Impl rule__FeatureTags__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSheepDog.g:2900:1: rule__FeatureTags__Group__0__Impl : ( ':tags:' ) ;
    public final void rule__FeatureTags__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2904:1: ( ( ':tags:' ) )
            // InternalSheepDog.g:2905:1: ( ':tags:' )
            {
            // InternalSheepDog.g:2905:1: ( ':tags:' )
            // InternalSheepDog.g:2906:2: ':tags:'
            {
             before(grammarAccess.getFeatureTagsAccess().getTagsKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSheepDog.g:2915:1: rule__FeatureTags__Group__1 : rule__FeatureTags__Group__1__Impl rule__FeatureTags__Group__2 ;
    public final void rule__FeatureTags__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2919:1: ( rule__FeatureTags__Group__1__Impl rule__FeatureTags__Group__2 )
            // InternalSheepDog.g:2920:2: rule__FeatureTags__Group__1__Impl rule__FeatureTags__Group__2
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
    // InternalSheepDog.g:2927:1: rule__FeatureTags__Group__1__Impl : ( ( rule__FeatureTags__NameAssignment_1 ) ) ;
    public final void rule__FeatureTags__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2931:1: ( ( ( rule__FeatureTags__NameAssignment_1 ) ) )
            // InternalSheepDog.g:2932:1: ( ( rule__FeatureTags__NameAssignment_1 ) )
            {
            // InternalSheepDog.g:2932:1: ( ( rule__FeatureTags__NameAssignment_1 ) )
            // InternalSheepDog.g:2933:2: ( rule__FeatureTags__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureTagsAccess().getNameAssignment_1()); 
            // InternalSheepDog.g:2934:2: ( rule__FeatureTags__NameAssignment_1 )
            // InternalSheepDog.g:2934:3: rule__FeatureTags__NameAssignment_1
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
    // InternalSheepDog.g:2942:1: rule__FeatureTags__Group__2 : rule__FeatureTags__Group__2__Impl ;
    public final void rule__FeatureTags__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2946:1: ( rule__FeatureTags__Group__2__Impl )
            // InternalSheepDog.g:2947:2: rule__FeatureTags__Group__2__Impl
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
    // InternalSheepDog.g:2953:1: rule__FeatureTags__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__FeatureTags__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2957:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2958:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2958:1: ( RULE_EOL )
            // InternalSheepDog.g:2959:2: RULE_EOL
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


    // $ANTLR start "rule__AbstractScenarioTags__Group__0"
    // InternalSheepDog.g:2969:1: rule__AbstractScenarioTags__Group__0 : rule__AbstractScenarioTags__Group__0__Impl rule__AbstractScenarioTags__Group__1 ;
    public final void rule__AbstractScenarioTags__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2973:1: ( rule__AbstractScenarioTags__Group__0__Impl rule__AbstractScenarioTags__Group__1 )
            // InternalSheepDog.g:2974:2: rule__AbstractScenarioTags__Group__0__Impl rule__AbstractScenarioTags__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__AbstractScenarioTags__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractScenarioTags__Group__1();

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
    // $ANTLR end "rule__AbstractScenarioTags__Group__0"


    // $ANTLR start "rule__AbstractScenarioTags__Group__0__Impl"
    // InternalSheepDog.g:2981:1: rule__AbstractScenarioTags__Group__0__Impl : ( '[tags=' ) ;
    public final void rule__AbstractScenarioTags__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2985:1: ( ( '[tags=' ) )
            // InternalSheepDog.g:2986:1: ( '[tags=' )
            {
            // InternalSheepDog.g:2986:1: ( '[tags=' )
            // InternalSheepDog.g:2987:2: '[tags='
            {
             before(grammarAccess.getAbstractScenarioTagsAccess().getTagsKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAbstractScenarioTagsAccess().getTagsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractScenarioTags__Group__0__Impl"


    // $ANTLR start "rule__AbstractScenarioTags__Group__1"
    // InternalSheepDog.g:2996:1: rule__AbstractScenarioTags__Group__1 : rule__AbstractScenarioTags__Group__1__Impl rule__AbstractScenarioTags__Group__2 ;
    public final void rule__AbstractScenarioTags__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3000:1: ( rule__AbstractScenarioTags__Group__1__Impl rule__AbstractScenarioTags__Group__2 )
            // InternalSheepDog.g:3001:2: rule__AbstractScenarioTags__Group__1__Impl rule__AbstractScenarioTags__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__AbstractScenarioTags__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractScenarioTags__Group__2();

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
    // $ANTLR end "rule__AbstractScenarioTags__Group__1"


    // $ANTLR start "rule__AbstractScenarioTags__Group__1__Impl"
    // InternalSheepDog.g:3008:1: rule__AbstractScenarioTags__Group__1__Impl : ( ( rule__AbstractScenarioTags__NameAssignment_1 ) ) ;
    public final void rule__AbstractScenarioTags__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3012:1: ( ( ( rule__AbstractScenarioTags__NameAssignment_1 ) ) )
            // InternalSheepDog.g:3013:1: ( ( rule__AbstractScenarioTags__NameAssignment_1 ) )
            {
            // InternalSheepDog.g:3013:1: ( ( rule__AbstractScenarioTags__NameAssignment_1 ) )
            // InternalSheepDog.g:3014:2: ( rule__AbstractScenarioTags__NameAssignment_1 )
            {
             before(grammarAccess.getAbstractScenarioTagsAccess().getNameAssignment_1()); 
            // InternalSheepDog.g:3015:2: ( rule__AbstractScenarioTags__NameAssignment_1 )
            // InternalSheepDog.g:3015:3: rule__AbstractScenarioTags__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AbstractScenarioTags__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAbstractScenarioTagsAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractScenarioTags__Group__1__Impl"


    // $ANTLR start "rule__AbstractScenarioTags__Group__2"
    // InternalSheepDog.g:3023:1: rule__AbstractScenarioTags__Group__2 : rule__AbstractScenarioTags__Group__2__Impl rule__AbstractScenarioTags__Group__3 ;
    public final void rule__AbstractScenarioTags__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3027:1: ( rule__AbstractScenarioTags__Group__2__Impl rule__AbstractScenarioTags__Group__3 )
            // InternalSheepDog.g:3028:2: rule__AbstractScenarioTags__Group__2__Impl rule__AbstractScenarioTags__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__AbstractScenarioTags__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractScenarioTags__Group__3();

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
    // $ANTLR end "rule__AbstractScenarioTags__Group__2"


    // $ANTLR start "rule__AbstractScenarioTags__Group__2__Impl"
    // InternalSheepDog.g:3035:1: rule__AbstractScenarioTags__Group__2__Impl : ( ']' ) ;
    public final void rule__AbstractScenarioTags__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3039:1: ( ( ']' ) )
            // InternalSheepDog.g:3040:1: ( ']' )
            {
            // InternalSheepDog.g:3040:1: ( ']' )
            // InternalSheepDog.g:3041:2: ']'
            {
             before(grammarAccess.getAbstractScenarioTagsAccess().getRightSquareBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAbstractScenarioTagsAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractScenarioTags__Group__2__Impl"


    // $ANTLR start "rule__AbstractScenarioTags__Group__3"
    // InternalSheepDog.g:3050:1: rule__AbstractScenarioTags__Group__3 : rule__AbstractScenarioTags__Group__3__Impl ;
    public final void rule__AbstractScenarioTags__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3054:1: ( rule__AbstractScenarioTags__Group__3__Impl )
            // InternalSheepDog.g:3055:2: rule__AbstractScenarioTags__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractScenarioTags__Group__3__Impl();

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
    // $ANTLR end "rule__AbstractScenarioTags__Group__3"


    // $ANTLR start "rule__AbstractScenarioTags__Group__3__Impl"
    // InternalSheepDog.g:3061:1: rule__AbstractScenarioTags__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__AbstractScenarioTags__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3065:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:3066:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:3066:1: ( RULE_EOL )
            // InternalSheepDog.g:3067:2: RULE_EOL
            {
             before(grammarAccess.getAbstractScenarioTagsAccess().getEOLTerminalRuleCall_3()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getAbstractScenarioTagsAccess().getEOLTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractScenarioTags__Group__3__Impl"


    // $ANTLR start "rule__Cell__Group__0"
    // InternalSheepDog.g:3077:1: rule__Cell__Group__0 : rule__Cell__Group__0__Impl rule__Cell__Group__1 ;
    public final void rule__Cell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3081:1: ( rule__Cell__Group__0__Impl rule__Cell__Group__1 )
            // InternalSheepDog.g:3082:2: rule__Cell__Group__0__Impl rule__Cell__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSheepDog.g:3089:1: rule__Cell__Group__0__Impl : ( '|' ) ;
    public final void rule__Cell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3093:1: ( ( '|' ) )
            // InternalSheepDog.g:3094:1: ( '|' )
            {
            // InternalSheepDog.g:3094:1: ( '|' )
            // InternalSheepDog.g:3095:2: '|'
            {
             before(grammarAccess.getCellAccess().getVerticalLineKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSheepDog.g:3104:1: rule__Cell__Group__1 : rule__Cell__Group__1__Impl ;
    public final void rule__Cell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3108:1: ( rule__Cell__Group__1__Impl )
            // InternalSheepDog.g:3109:2: rule__Cell__Group__1__Impl
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
    // InternalSheepDog.g:3115:1: rule__Cell__Group__1__Impl : ( ( rule__Cell__NameAssignment_1 ) ) ;
    public final void rule__Cell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3119:1: ( ( ( rule__Cell__NameAssignment_1 ) ) )
            // InternalSheepDog.g:3120:1: ( ( rule__Cell__NameAssignment_1 ) )
            {
            // InternalSheepDog.g:3120:1: ( ( rule__Cell__NameAssignment_1 ) )
            // InternalSheepDog.g:3121:2: ( rule__Cell__NameAssignment_1 )
            {
             before(grammarAccess.getCellAccess().getNameAssignment_1()); 
            // InternalSheepDog.g:3122:2: ( rule__Cell__NameAssignment_1 )
            // InternalSheepDog.g:3122:3: rule__Cell__NameAssignment_1
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
    // InternalSheepDog.g:3131:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3135:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalSheepDog.g:3136:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
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
    // InternalSheepDog.g:3143:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__NameAssignment_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3147:1: ( ( ( rule__Statement__NameAssignment_0 ) ) )
            // InternalSheepDog.g:3148:1: ( ( rule__Statement__NameAssignment_0 ) )
            {
            // InternalSheepDog.g:3148:1: ( ( rule__Statement__NameAssignment_0 ) )
            // InternalSheepDog.g:3149:2: ( rule__Statement__NameAssignment_0 )
            {
             before(grammarAccess.getStatementAccess().getNameAssignment_0()); 
            // InternalSheepDog.g:3150:2: ( rule__Statement__NameAssignment_0 )
            // InternalSheepDog.g:3150:3: rule__Statement__NameAssignment_0
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
    // InternalSheepDog.g:3158:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3162:1: ( rule__Statement__Group__1__Impl )
            // InternalSheepDog.g:3163:2: rule__Statement__Group__1__Impl
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
    // InternalSheepDog.g:3169:1: rule__Statement__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3173:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:3174:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:3174:1: ( RULE_EOL )
            // InternalSheepDog.g:3175:2: RULE_EOL
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


    // $ANTLR start "rule__StepObject__NameAssignment_2"
    // InternalSheepDog.g:3185:1: rule__StepObject__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__StepObject__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3189:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3190:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3190:2: ( ruleTitle )
            // InternalSheepDog.g:3191:3: ruleTitle
            {
             before(grammarAccess.getStepObjectAccess().getNameTitleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getStepObjectAccess().getNameTitleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepObject__NameAssignment_2"


    // $ANTLR start "rule__StepObject__StatementsAssignment_4"
    // InternalSheepDog.g:3200:1: rule__StepObject__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__StepObject__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3204:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3205:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3205:2: ( ruleStatement )
            // InternalSheepDog.g:3206:3: ruleStatement
            {
             before(grammarAccess.getStepObjectAccess().getStatementsStatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStepObjectAccess().getStatementsStatementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepObject__StatementsAssignment_4"


    // $ANTLR start "rule__StepObject__StepDefinitionsAssignment_5"
    // InternalSheepDog.g:3215:1: rule__StepObject__StepDefinitionsAssignment_5 : ( ruleStepDefinition ) ;
    public final void rule__StepObject__StepDefinitionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3219:1: ( ( ruleStepDefinition ) )
            // InternalSheepDog.g:3220:2: ( ruleStepDefinition )
            {
            // InternalSheepDog.g:3220:2: ( ruleStepDefinition )
            // InternalSheepDog.g:3221:3: ruleStepDefinition
            {
             before(grammarAccess.getStepObjectAccess().getStepDefinitionsStepDefinitionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleStepDefinition();

            state._fsp--;

             after(grammarAccess.getStepObjectAccess().getStepDefinitionsStepDefinitionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepObject__StepDefinitionsAssignment_5"


    // $ANTLR start "rule__StepDefinition__NameAssignment_2"
    // InternalSheepDog.g:3230:1: rule__StepDefinition__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__StepDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3234:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3235:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3235:2: ( ruleTitle )
            // InternalSheepDog.g:3236:3: ruleTitle
            {
             before(grammarAccess.getStepDefinitionAccess().getNameTitleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getStepDefinitionAccess().getNameTitleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepDefinition__NameAssignment_2"


    // $ANTLR start "rule__StepDefinition__StatementsAssignment_4"
    // InternalSheepDog.g:3245:1: rule__StepDefinition__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__StepDefinition__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3249:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3250:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3250:2: ( ruleStatement )
            // InternalSheepDog.g:3251:3: ruleStatement
            {
             before(grammarAccess.getStepDefinitionAccess().getStatementsStatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStepDefinitionAccess().getStatementsStatementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepDefinition__StatementsAssignment_4"


    // $ANTLR start "rule__StepDefinition__StepParametersAssignment_5"
    // InternalSheepDog.g:3260:1: rule__StepDefinition__StepParametersAssignment_5 : ( ruleStepParameters ) ;
    public final void rule__StepDefinition__StepParametersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3264:1: ( ( ruleStepParameters ) )
            // InternalSheepDog.g:3265:2: ( ruleStepParameters )
            {
            // InternalSheepDog.g:3265:2: ( ruleStepParameters )
            // InternalSheepDog.g:3266:3: ruleStepParameters
            {
             before(grammarAccess.getStepDefinitionAccess().getStepParametersStepParametersParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleStepParameters();

            state._fsp--;

             after(grammarAccess.getStepDefinitionAccess().getStepParametersStepParametersParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepDefinition__StepParametersAssignment_5"


    // $ANTLR start "rule__StepParameters__NameAssignment_2"
    // InternalSheepDog.g:3275:1: rule__StepParameters__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__StepParameters__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3279:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3280:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3280:2: ( ruleTitle )
            // InternalSheepDog.g:3281:3: ruleTitle
            {
             before(grammarAccess.getStepParametersAccess().getNameTitleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getStepParametersAccess().getNameTitleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepParameters__NameAssignment_2"


    // $ANTLR start "rule__StepParameters__StatementsAssignment_4"
    // InternalSheepDog.g:3290:1: rule__StepParameters__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__StepParameters__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3294:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3295:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3295:2: ( ruleStatement )
            // InternalSheepDog.g:3296:3: ruleStatement
            {
             before(grammarAccess.getStepParametersAccess().getStatementsStatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStepParametersAccess().getStatementsStatementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepParameters__StatementsAssignment_4"


    // $ANTLR start "rule__StepParameters__ParametersTableAssignment_5"
    // InternalSheepDog.g:3305:1: rule__StepParameters__ParametersTableAssignment_5 : ( ruleTable ) ;
    public final void rule__StepParameters__ParametersTableAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3309:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3310:2: ( ruleTable )
            {
            // InternalSheepDog.g:3310:2: ( ruleTable )
            // InternalSheepDog.g:3311:3: ruleTable
            {
             before(grammarAccess.getStepParametersAccess().getParametersTableTableParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getStepParametersAccess().getParametersTableTableParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepParameters__ParametersTableAssignment_5"


    // $ANTLR start "rule__Feature__TagsAssignment_0"
    // InternalSheepDog.g:3320:1: rule__Feature__TagsAssignment_0 : ( ruleFeatureTags ) ;
    public final void rule__Feature__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3324:1: ( ( ruleFeatureTags ) )
            // InternalSheepDog.g:3325:2: ( ruleFeatureTags )
            {
            // InternalSheepDog.g:3325:2: ( ruleFeatureTags )
            // InternalSheepDog.g:3326:3: ruleFeatureTags
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


    // $ANTLR start "rule__Feature__NameAssignment_3"
    // InternalSheepDog.g:3335:1: rule__Feature__NameAssignment_3 : ( ruleTitle ) ;
    public final void rule__Feature__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3339:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3340:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3340:2: ( ruleTitle )
            // InternalSheepDog.g:3341:3: ruleTitle
            {
             before(grammarAccess.getFeatureAccess().getNameTitleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getNameTitleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__NameAssignment_3"


    // $ANTLR start "rule__Feature__StatementsAssignment_5"
    // InternalSheepDog.g:3350:1: rule__Feature__StatementsAssignment_5 : ( ruleStatement ) ;
    public final void rule__Feature__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3354:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3355:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3355:2: ( ruleStatement )
            // InternalSheepDog.g:3356:3: ruleStatement
            {
             before(grammarAccess.getFeatureAccess().getStatementsStatementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getStatementsStatementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__StatementsAssignment_5"


    // $ANTLR start "rule__Feature__AbstractScenariosAssignment_6"
    // InternalSheepDog.g:3365:1: rule__Feature__AbstractScenariosAssignment_6 : ( ruleAbstractScenario ) ;
    public final void rule__Feature__AbstractScenariosAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3369:1: ( ( ruleAbstractScenario ) )
            // InternalSheepDog.g:3370:2: ( ruleAbstractScenario )
            {
            // InternalSheepDog.g:3370:2: ( ruleAbstractScenario )
            // InternalSheepDog.g:3371:3: ruleAbstractScenario
            {
             before(grammarAccess.getFeatureAccess().getAbstractScenariosAbstractScenarioParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractScenario();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getAbstractScenariosAbstractScenarioParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__AbstractScenariosAssignment_6"


    // $ANTLR start "rule__Background__TagsAssignment_0"
    // InternalSheepDog.g:3380:1: rule__Background__TagsAssignment_0 : ( ruleAbstractScenarioTags ) ;
    public final void rule__Background__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3384:1: ( ( ruleAbstractScenarioTags ) )
            // InternalSheepDog.g:3385:2: ( ruleAbstractScenarioTags )
            {
            // InternalSheepDog.g:3385:2: ( ruleAbstractScenarioTags )
            // InternalSheepDog.g:3386:3: ruleAbstractScenarioTags
            {
             before(grammarAccess.getBackgroundAccess().getTagsAbstractScenarioTagsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractScenarioTags();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getTagsAbstractScenarioTagsParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__TagsAssignment_0"


    // $ANTLR start "rule__Background__NameAssignment_3"
    // InternalSheepDog.g:3395:1: rule__Background__NameAssignment_3 : ( ruleTitle ) ;
    public final void rule__Background__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3399:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3400:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3400:2: ( ruleTitle )
            // InternalSheepDog.g:3401:3: ruleTitle
            {
             before(grammarAccess.getBackgroundAccess().getNameTitleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getNameTitleParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalSheepDog.g:3410:1: rule__Background__StatementsAssignment_5 : ( ruleStatement ) ;
    public final void rule__Background__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3414:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3415:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3415:2: ( ruleStatement )
            // InternalSheepDog.g:3416:3: ruleStatement
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
    // InternalSheepDog.g:3425:1: rule__Background__StepsAssignment_6 : ( ruleStep ) ;
    public final void rule__Background__StepsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3429:1: ( ( ruleStep ) )
            // InternalSheepDog.g:3430:2: ( ruleStep )
            {
            // InternalSheepDog.g:3430:2: ( ruleStep )
            // InternalSheepDog.g:3431:3: ruleStep
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
    // InternalSheepDog.g:3440:1: rule__Scenario__TagsAssignment_0 : ( ruleAbstractScenarioTags ) ;
    public final void rule__Scenario__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3444:1: ( ( ruleAbstractScenarioTags ) )
            // InternalSheepDog.g:3445:2: ( ruleAbstractScenarioTags )
            {
            // InternalSheepDog.g:3445:2: ( ruleAbstractScenarioTags )
            // InternalSheepDog.g:3446:3: ruleAbstractScenarioTags
            {
             before(grammarAccess.getScenarioAccess().getTagsAbstractScenarioTagsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractScenarioTags();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getTagsAbstractScenarioTagsParserRuleCall_0_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Scenario__NameAssignment_3"
    // InternalSheepDog.g:3455:1: rule__Scenario__NameAssignment_3 : ( ruleTitle ) ;
    public final void rule__Scenario__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3459:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3460:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3460:2: ( ruleTitle )
            // InternalSheepDog.g:3461:3: ruleTitle
            {
             before(grammarAccess.getScenarioAccess().getNameTitleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getNameTitleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__NameAssignment_3"


    // $ANTLR start "rule__Scenario__StatementsAssignment_5"
    // InternalSheepDog.g:3470:1: rule__Scenario__StatementsAssignment_5 : ( ruleStatement ) ;
    public final void rule__Scenario__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3474:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3475:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3475:2: ( ruleStatement )
            // InternalSheepDog.g:3476:3: ruleStatement
            {
             before(grammarAccess.getScenarioAccess().getStatementsStatementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getStatementsStatementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__StatementsAssignment_5"


    // $ANTLR start "rule__Scenario__StepsAssignment_6"
    // InternalSheepDog.g:3485:1: rule__Scenario__StepsAssignment_6 : ( ruleStep ) ;
    public final void rule__Scenario__StepsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3489:1: ( ( ruleStep ) )
            // InternalSheepDog.g:3490:2: ( ruleStep )
            {
            // InternalSheepDog.g:3490:2: ( ruleStep )
            // InternalSheepDog.g:3491:3: ruleStep
            {
             before(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__StepsAssignment_6"


    // $ANTLR start "rule__Scenario__ExamplesAssignment_7"
    // InternalSheepDog.g:3500:1: rule__Scenario__ExamplesAssignment_7 : ( ruleExamples ) ;
    public final void rule__Scenario__ExamplesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3504:1: ( ( ruleExamples ) )
            // InternalSheepDog.g:3505:2: ( ruleExamples )
            {
            // InternalSheepDog.g:3505:2: ( ruleExamples )
            // InternalSheepDog.g:3506:3: ruleExamples
            {
             before(grammarAccess.getScenarioAccess().getExamplesExamplesParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleExamples();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getExamplesExamplesParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__ExamplesAssignment_7"


    // $ANTLR start "rule__Examples__TagsAssignment_0"
    // InternalSheepDog.g:3515:1: rule__Examples__TagsAssignment_0 : ( ruleAbstractScenarioTags ) ;
    public final void rule__Examples__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3519:1: ( ( ruleAbstractScenarioTags ) )
            // InternalSheepDog.g:3520:2: ( ruleAbstractScenarioTags )
            {
            // InternalSheepDog.g:3520:2: ( ruleAbstractScenarioTags )
            // InternalSheepDog.g:3521:3: ruleAbstractScenarioTags
            {
             before(grammarAccess.getExamplesAccess().getTagsAbstractScenarioTagsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractScenarioTags();

            state._fsp--;

             after(grammarAccess.getExamplesAccess().getTagsAbstractScenarioTagsParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__TagsAssignment_0"


    // $ANTLR start "rule__Examples__NameAssignment_3"
    // InternalSheepDog.g:3530:1: rule__Examples__NameAssignment_3 : ( ruleTitle ) ;
    public final void rule__Examples__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3534:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3535:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3535:2: ( ruleTitle )
            // InternalSheepDog.g:3536:3: ruleTitle
            {
             before(grammarAccess.getExamplesAccess().getNameTitleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getExamplesAccess().getNameTitleParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalSheepDog.g:3545:1: rule__Examples__StatementsAssignment_5 : ( ruleStatement ) ;
    public final void rule__Examples__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3549:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3550:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3550:2: ( ruleStatement )
            // InternalSheepDog.g:3551:3: ruleStatement
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
    // InternalSheepDog.g:3560:1: rule__Examples__TheExamplesTableAssignment_6 : ( ruleTable ) ;
    public final void rule__Examples__TheExamplesTableAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3564:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3565:2: ( ruleTable )
            {
            // InternalSheepDog.g:3565:2: ( ruleTable )
            // InternalSheepDog.g:3566:3: ruleTable
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


    // $ANTLR start "rule__Given__NameAssignment_2"
    // InternalSheepDog.g:3575:1: rule__Given__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__Given__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3579:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3580:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3580:2: ( ruleTitle )
            // InternalSheepDog.g:3581:3: ruleTitle
            {
             before(grammarAccess.getGivenAccess().getNameTitleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getGivenAccess().getNameTitleParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalSheepDog.g:3590:1: rule__Given__TheStepTableAssignment_4_0 : ( ruleTable ) ;
    public final void rule__Given__TheStepTableAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3594:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3595:2: ( ruleTable )
            {
            // InternalSheepDog.g:3595:2: ( ruleTable )
            // InternalSheepDog.g:3596:3: ruleTable
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
    // InternalSheepDog.g:3605:1: rule__Given__TheDocStringAssignment_4_1 : ( ruleDocString ) ;
    public final void rule__Given__TheDocStringAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3609:1: ( ( ruleDocString ) )
            // InternalSheepDog.g:3610:2: ( ruleDocString )
            {
            // InternalSheepDog.g:3610:2: ( ruleDocString )
            // InternalSheepDog.g:3611:3: ruleDocString
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
    // InternalSheepDog.g:3620:1: rule__When__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__When__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3624:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3625:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3625:2: ( ruleTitle )
            // InternalSheepDog.g:3626:3: ruleTitle
            {
             before(grammarAccess.getWhenAccess().getNameTitleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getWhenAccess().getNameTitleParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalSheepDog.g:3635:1: rule__When__TheStepTableAssignment_4_0 : ( ruleTable ) ;
    public final void rule__When__TheStepTableAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3639:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3640:2: ( ruleTable )
            {
            // InternalSheepDog.g:3640:2: ( ruleTable )
            // InternalSheepDog.g:3641:3: ruleTable
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
    // InternalSheepDog.g:3650:1: rule__When__TheDocStringAssignment_4_1 : ( ruleDocString ) ;
    public final void rule__When__TheDocStringAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3654:1: ( ( ruleDocString ) )
            // InternalSheepDog.g:3655:2: ( ruleDocString )
            {
            // InternalSheepDog.g:3655:2: ( ruleDocString )
            // InternalSheepDog.g:3656:3: ruleDocString
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
    // InternalSheepDog.g:3665:1: rule__Then__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__Then__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3669:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3670:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3670:2: ( ruleTitle )
            // InternalSheepDog.g:3671:3: ruleTitle
            {
             before(grammarAccess.getThenAccess().getNameTitleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getThenAccess().getNameTitleParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalSheepDog.g:3680:1: rule__Then__TheStepTableAssignment_4_0 : ( ruleTable ) ;
    public final void rule__Then__TheStepTableAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3684:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3685:2: ( ruleTable )
            {
            // InternalSheepDog.g:3685:2: ( ruleTable )
            // InternalSheepDog.g:3686:3: ruleTable
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
    // InternalSheepDog.g:3695:1: rule__Then__TheDocStringAssignment_4_1 : ( ruleDocString ) ;
    public final void rule__Then__TheDocStringAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3699:1: ( ( ruleDocString ) )
            // InternalSheepDog.g:3700:2: ( ruleDocString )
            {
            // InternalSheepDog.g:3700:2: ( ruleDocString )
            // InternalSheepDog.g:3701:3: ruleDocString
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


    // $ANTLR start "rule__And__NameAssignment_2"
    // InternalSheepDog.g:3710:1: rule__And__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__And__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3714:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3715:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3715:2: ( ruleTitle )
            // InternalSheepDog.g:3716:3: ruleTitle
            {
             before(grammarAccess.getAndAccess().getNameTitleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getAndAccess().getNameTitleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__NameAssignment_2"


    // $ANTLR start "rule__And__TheStepTableAssignment_4_0"
    // InternalSheepDog.g:3725:1: rule__And__TheStepTableAssignment_4_0 : ( ruleTable ) ;
    public final void rule__And__TheStepTableAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3729:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3730:2: ( ruleTable )
            {
            // InternalSheepDog.g:3730:2: ( ruleTable )
            // InternalSheepDog.g:3731:3: ruleTable
            {
             before(grammarAccess.getAndAccess().getTheStepTableTableParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getAndAccess().getTheStepTableTableParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__TheStepTableAssignment_4_0"


    // $ANTLR start "rule__And__TheDocStringAssignment_4_1"
    // InternalSheepDog.g:3740:1: rule__And__TheDocStringAssignment_4_1 : ( ruleDocString ) ;
    public final void rule__And__TheDocStringAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3744:1: ( ( ruleDocString ) )
            // InternalSheepDog.g:3745:2: ( ruleDocString )
            {
            // InternalSheepDog.g:3745:2: ( ruleDocString )
            // InternalSheepDog.g:3746:3: ruleDocString
            {
             before(grammarAccess.getAndAccess().getTheDocStringDocStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDocString();

            state._fsp--;

             after(grammarAccess.getAndAccess().getTheDocStringDocStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__TheDocStringAssignment_4_1"


    // $ANTLR start "rule__DocString__NameAssignment_0"
    // InternalSheepDog.g:3755:1: rule__DocString__NameAssignment_0 : ( RULE_RAWTEXT ) ;
    public final void rule__DocString__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3759:1: ( ( RULE_RAWTEXT ) )
            // InternalSheepDog.g:3760:2: ( RULE_RAWTEXT )
            {
            // InternalSheepDog.g:3760:2: ( RULE_RAWTEXT )
            // InternalSheepDog.g:3761:3: RULE_RAWTEXT
            {
             before(grammarAccess.getDocStringAccess().getNameRAWTEXTTerminalRuleCall_0_0()); 
            match(input,RULE_RAWTEXT,FOLLOW_2); 
             after(grammarAccess.getDocStringAccess().getNameRAWTEXTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocString__NameAssignment_0"


    // $ANTLR start "rule__Table__RowsAssignment_4"
    // InternalSheepDog.g:3770:1: rule__Table__RowsAssignment_4 : ( ruleRow ) ;
    public final void rule__Table__RowsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3774:1: ( ( ruleRow ) )
            // InternalSheepDog.g:3775:2: ( ruleRow )
            {
            // InternalSheepDog.g:3775:2: ( ruleRow )
            // InternalSheepDog.g:3776:3: ruleRow
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
    // InternalSheepDog.g:3785:1: rule__Row__CellsAssignment_0 : ( ruleCell ) ;
    public final void rule__Row__CellsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3789:1: ( ( ruleCell ) )
            // InternalSheepDog.g:3790:2: ( ruleCell )
            {
            // InternalSheepDog.g:3790:2: ( ruleCell )
            // InternalSheepDog.g:3791:3: ruleCell
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


    // $ANTLR start "rule__FeatureTags__NameAssignment_1"
    // InternalSheepDog.g:3800:1: rule__FeatureTags__NameAssignment_1 : ( RULE_WORD ) ;
    public final void rule__FeatureTags__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3804:1: ( ( RULE_WORD ) )
            // InternalSheepDog.g:3805:2: ( RULE_WORD )
            {
            // InternalSheepDog.g:3805:2: ( RULE_WORD )
            // InternalSheepDog.g:3806:3: RULE_WORD
            {
             before(grammarAccess.getFeatureTagsAccess().getNameWORDTerminalRuleCall_1_0()); 
            match(input,RULE_WORD,FOLLOW_2); 
             after(grammarAccess.getFeatureTagsAccess().getNameWORDTerminalRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__AbstractScenarioTags__NameAssignment_1"
    // InternalSheepDog.g:3815:1: rule__AbstractScenarioTags__NameAssignment_1 : ( RULE_WORD ) ;
    public final void rule__AbstractScenarioTags__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3819:1: ( ( RULE_WORD ) )
            // InternalSheepDog.g:3820:2: ( RULE_WORD )
            {
            // InternalSheepDog.g:3820:2: ( RULE_WORD )
            // InternalSheepDog.g:3821:3: RULE_WORD
            {
             before(grammarAccess.getAbstractScenarioTagsAccess().getNameWORDTerminalRuleCall_1_0()); 
            match(input,RULE_WORD,FOLLOW_2); 
             after(grammarAccess.getAbstractScenarioTagsAccess().getNameWORDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractScenarioTags__NameAssignment_1"


    // $ANTLR start "rule__Cell__NameAssignment_1"
    // InternalSheepDog.g:3830:1: rule__Cell__NameAssignment_1 : ( ruleTitle ) ;
    public final void rule__Cell__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3834:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3835:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3835:2: ( ruleTitle )
            // InternalSheepDog.g:3836:3: ruleTitle
            {
             before(grammarAccess.getCellAccess().getNameTitleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getCellAccess().getNameTitleParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalSheepDog.g:3845:1: rule__Statement__NameAssignment_0 : ( ruleTitle ) ;
    public final void rule__Statement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3849:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3850:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3850:2: ( ruleTitle )
            // InternalSheepDog.g:3851:3: ruleTitle
            {
             before(grammarAccess.getStatementAccess().getNameTitleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getNameTitleParserRuleCall_0_0()); 

            }


            }

        }
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000810L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000802L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004002010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004002002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000800050L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000008000000L});

}
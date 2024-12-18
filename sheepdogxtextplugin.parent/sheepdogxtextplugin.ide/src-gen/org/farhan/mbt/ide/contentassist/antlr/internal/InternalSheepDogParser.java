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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WORD", "RULE_ID", "RULE_STRING", "RULE_EOL", "RULE_WS", "RULE_SL_COMMENT", "'='", "'Object:'", "'=='", "'Definition:'", "'==='", "'Parameters:'", "'Feature:'", "'Background:'", "'Scenario:'", "'Examples:'", "'Given'", "'When'", "'Then'", "'And'", "'----'", "'[options=\"header\"]'", "'|==='", "'[tags=\"'", "'\"]'", "'|'"
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
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
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


    // $ANTLR start "entryRuleTags"
    // InternalSheepDog.g:478:1: entryRuleTags : ruleTags EOF ;
    public final void entryRuleTags() throws RecognitionException {
        try {
            // InternalSheepDog.g:479:1: ( ruleTags EOF )
            // InternalSheepDog.g:480:1: ruleTags EOF
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
    // InternalSheepDog.g:487:1: ruleTags : ( ( rule__Tags__Group__0 ) ) ;
    public final void ruleTags() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:491:2: ( ( ( rule__Tags__Group__0 ) ) )
            // InternalSheepDog.g:492:2: ( ( rule__Tags__Group__0 ) )
            {
            // InternalSheepDog.g:492:2: ( ( rule__Tags__Group__0 ) )
            // InternalSheepDog.g:493:3: ( rule__Tags__Group__0 )
            {
             before(grammarAccess.getTagsAccess().getGroup()); 
            // InternalSheepDog.g:494:3: ( rule__Tags__Group__0 )
            // InternalSheepDog.g:494:4: rule__Tags__Group__0
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


    // $ANTLR start "entryRuleTitle"
    // InternalSheepDog.g:503:1: entryRuleTitle : ruleTitle EOF ;
    public final void entryRuleTitle() throws RecognitionException {
        try {
            // InternalSheepDog.g:504:1: ( ruleTitle EOF )
            // InternalSheepDog.g:505:1: ruleTitle EOF
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
    // InternalSheepDog.g:512:1: ruleTitle : ( ( rule__Title__Group__0 ) ) ;
    public final void ruleTitle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:516:2: ( ( ( rule__Title__Group__0 ) ) )
            // InternalSheepDog.g:517:2: ( ( rule__Title__Group__0 ) )
            {
            // InternalSheepDog.g:517:2: ( ( rule__Title__Group__0 ) )
            // InternalSheepDog.g:518:3: ( rule__Title__Group__0 )
            {
             before(grammarAccess.getTitleAccess().getGroup()); 
            // InternalSheepDog.g:519:3: ( rule__Title__Group__0 )
            // InternalSheepDog.g:519:4: rule__Title__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Title__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleStatement"
    // InternalSheepDog.g:528:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalSheepDog.g:529:1: ( ruleStatement EOF )
            // InternalSheepDog.g:530:1: ruleStatement EOF
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
    // InternalSheepDog.g:537:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:541:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalSheepDog.g:542:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalSheepDog.g:542:2: ( ( rule__Statement__Group__0 ) )
            // InternalSheepDog.g:543:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalSheepDog.g:544:3: ( rule__Statement__Group__0 )
            // InternalSheepDog.g:544:4: rule__Statement__Group__0
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


    // $ANTLR start "entryRuleLine"
    // InternalSheepDog.g:553:1: entryRuleLine : ruleLine EOF ;
    public final void entryRuleLine() throws RecognitionException {
        try {
            // InternalSheepDog.g:554:1: ( ruleLine EOF )
            // InternalSheepDog.g:555:1: ruleLine EOF
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
    // InternalSheepDog.g:562:1: ruleLine : ( ( rule__Line__Group__0 ) ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:566:2: ( ( ( rule__Line__Group__0 ) ) )
            // InternalSheepDog.g:567:2: ( ( rule__Line__Group__0 ) )
            {
            // InternalSheepDog.g:567:2: ( ( rule__Line__Group__0 ) )
            // InternalSheepDog.g:568:3: ( rule__Line__Group__0 )
            {
             before(grammarAccess.getLineAccess().getGroup()); 
            // InternalSheepDog.g:569:3: ( rule__Line__Group__0 )
            // InternalSheepDog.g:569:4: rule__Line__Group__0
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


    // $ANTLR start "entryRuleCell"
    // InternalSheepDog.g:578:1: entryRuleCell : ruleCell EOF ;
    public final void entryRuleCell() throws RecognitionException {
        try {
            // InternalSheepDog.g:579:1: ( ruleCell EOF )
            // InternalSheepDog.g:580:1: ruleCell EOF
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
    // InternalSheepDog.g:587:1: ruleCell : ( ( rule__Cell__Group__0 ) ) ;
    public final void ruleCell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:591:2: ( ( ( rule__Cell__Group__0 ) ) )
            // InternalSheepDog.g:592:2: ( ( rule__Cell__Group__0 ) )
            {
            // InternalSheepDog.g:592:2: ( ( rule__Cell__Group__0 ) )
            // InternalSheepDog.g:593:3: ( rule__Cell__Group__0 )
            {
             before(grammarAccess.getCellAccess().getGroup()); 
            // InternalSheepDog.g:594:3: ( rule__Cell__Group__0 )
            // InternalSheepDog.g:594:4: rule__Cell__Group__0
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


    // $ANTLR start "entryRuleTEXT_LITERAL"
    // InternalSheepDog.g:603:1: entryRuleTEXT_LITERAL : ruleTEXT_LITERAL EOF ;
    public final void entryRuleTEXT_LITERAL() throws RecognitionException {
        try {
            // InternalSheepDog.g:604:1: ( ruleTEXT_LITERAL EOF )
            // InternalSheepDog.g:605:1: ruleTEXT_LITERAL EOF
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
    // InternalSheepDog.g:612:1: ruleTEXT_LITERAL : ( ( rule__TEXT_LITERAL__Alternatives ) ) ;
    public final void ruleTEXT_LITERAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:616:2: ( ( ( rule__TEXT_LITERAL__Alternatives ) ) )
            // InternalSheepDog.g:617:2: ( ( rule__TEXT_LITERAL__Alternatives ) )
            {
            // InternalSheepDog.g:617:2: ( ( rule__TEXT_LITERAL__Alternatives ) )
            // InternalSheepDog.g:618:3: ( rule__TEXT_LITERAL__Alternatives )
            {
             before(grammarAccess.getTEXT_LITERALAccess().getAlternatives()); 
            // InternalSheepDog.g:619:3: ( rule__TEXT_LITERAL__Alternatives )
            // InternalSheepDog.g:619:4: rule__TEXT_LITERAL__Alternatives
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


    // $ANTLR start "rule__Model__Alternatives"
    // InternalSheepDog.g:627:1: rule__Model__Alternatives : ( ( ruleStepObject ) | ( ruleFeature ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:631:1: ( ( ruleStepObject ) | ( ruleFeature ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==10) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==11) ) {
                    alt1=1;
                }
                else if ( (LA1_1==16) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSheepDog.g:632:2: ( ruleStepObject )
                    {
                    // InternalSheepDog.g:632:2: ( ruleStepObject )
                    // InternalSheepDog.g:633:3: ruleStepObject
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
                    // InternalSheepDog.g:638:2: ( ruleFeature )
                    {
                    // InternalSheepDog.g:638:2: ( ruleFeature )
                    // InternalSheepDog.g:639:3: ruleFeature
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
    // InternalSheepDog.g:648:1: rule__AbstractScenario__Alternatives : ( ( ruleBackground ) | ( ruleScenario ) );
    public final void rule__AbstractScenario__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:652:1: ( ( ruleBackground ) | ( ruleScenario ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalSheepDog.g:653:2: ( ruleBackground )
                    {
                    // InternalSheepDog.g:653:2: ( ruleBackground )
                    // InternalSheepDog.g:654:3: ruleBackground
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
                    // InternalSheepDog.g:659:2: ( ruleScenario )
                    {
                    // InternalSheepDog.g:659:2: ( ruleScenario )
                    // InternalSheepDog.g:660:3: ruleScenario
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
    // InternalSheepDog.g:669:1: rule__Step__Alternatives : ( ( ruleGiven ) | ( ruleWhen ) | ( ruleThen ) | ( ruleAnd ) );
    public final void rule__Step__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:673:1: ( ( ruleGiven ) | ( ruleWhen ) | ( ruleThen ) | ( ruleAnd ) )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                switch ( input.LA(2) ) {
                case 23:
                    {
                    alt3=4;
                    }
                    break;
                case 21:
                    {
                    alt3=2;
                    }
                    break;
                case 22:
                    {
                    alt3=3;
                    }
                    break;
                case 20:
                    {
                    alt3=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

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
                    // InternalSheepDog.g:674:2: ( ruleGiven )
                    {
                    // InternalSheepDog.g:674:2: ( ruleGiven )
                    // InternalSheepDog.g:675:3: ruleGiven
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
                    // InternalSheepDog.g:680:2: ( ruleWhen )
                    {
                    // InternalSheepDog.g:680:2: ( ruleWhen )
                    // InternalSheepDog.g:681:3: ruleWhen
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
                    // InternalSheepDog.g:686:2: ( ruleThen )
                    {
                    // InternalSheepDog.g:686:2: ( ruleThen )
                    // InternalSheepDog.g:687:3: ruleThen
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
                    // InternalSheepDog.g:692:2: ( ruleAnd )
                    {
                    // InternalSheepDog.g:692:2: ( ruleAnd )
                    // InternalSheepDog.g:693:3: ruleAnd
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


    // $ANTLR start "rule__Given__Alternatives_3"
    // InternalSheepDog.g:702:1: rule__Given__Alternatives_3 : ( ( ( rule__Given__TheStepTableAssignment_3_0 ) ) | ( ( rule__Given__TheDocStringAssignment_3_1 ) ) );
    public final void rule__Given__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:706:1: ( ( ( rule__Given__TheStepTableAssignment_3_0 ) ) | ( ( rule__Given__TheDocStringAssignment_3_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            else if ( (LA4_0==24) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSheepDog.g:707:2: ( ( rule__Given__TheStepTableAssignment_3_0 ) )
                    {
                    // InternalSheepDog.g:707:2: ( ( rule__Given__TheStepTableAssignment_3_0 ) )
                    // InternalSheepDog.g:708:3: ( rule__Given__TheStepTableAssignment_3_0 )
                    {
                     before(grammarAccess.getGivenAccess().getTheStepTableAssignment_3_0()); 
                    // InternalSheepDog.g:709:3: ( rule__Given__TheStepTableAssignment_3_0 )
                    // InternalSheepDog.g:709:4: rule__Given__TheStepTableAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Given__TheStepTableAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGivenAccess().getTheStepTableAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSheepDog.g:713:2: ( ( rule__Given__TheDocStringAssignment_3_1 ) )
                    {
                    // InternalSheepDog.g:713:2: ( ( rule__Given__TheDocStringAssignment_3_1 ) )
                    // InternalSheepDog.g:714:3: ( rule__Given__TheDocStringAssignment_3_1 )
                    {
                     before(grammarAccess.getGivenAccess().getTheDocStringAssignment_3_1()); 
                    // InternalSheepDog.g:715:3: ( rule__Given__TheDocStringAssignment_3_1 )
                    // InternalSheepDog.g:715:4: rule__Given__TheDocStringAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Given__TheDocStringAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGivenAccess().getTheDocStringAssignment_3_1()); 

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
    // $ANTLR end "rule__Given__Alternatives_3"


    // $ANTLR start "rule__When__Alternatives_3"
    // InternalSheepDog.g:723:1: rule__When__Alternatives_3 : ( ( ( rule__When__TheStepTableAssignment_3_0 ) ) | ( ( rule__When__TheDocStringAssignment_3_1 ) ) );
    public final void rule__When__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:727:1: ( ( ( rule__When__TheStepTableAssignment_3_0 ) ) | ( ( rule__When__TheDocStringAssignment_3_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            else if ( (LA5_0==24) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSheepDog.g:728:2: ( ( rule__When__TheStepTableAssignment_3_0 ) )
                    {
                    // InternalSheepDog.g:728:2: ( ( rule__When__TheStepTableAssignment_3_0 ) )
                    // InternalSheepDog.g:729:3: ( rule__When__TheStepTableAssignment_3_0 )
                    {
                     before(grammarAccess.getWhenAccess().getTheStepTableAssignment_3_0()); 
                    // InternalSheepDog.g:730:3: ( rule__When__TheStepTableAssignment_3_0 )
                    // InternalSheepDog.g:730:4: rule__When__TheStepTableAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__When__TheStepTableAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWhenAccess().getTheStepTableAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSheepDog.g:734:2: ( ( rule__When__TheDocStringAssignment_3_1 ) )
                    {
                    // InternalSheepDog.g:734:2: ( ( rule__When__TheDocStringAssignment_3_1 ) )
                    // InternalSheepDog.g:735:3: ( rule__When__TheDocStringAssignment_3_1 )
                    {
                     before(grammarAccess.getWhenAccess().getTheDocStringAssignment_3_1()); 
                    // InternalSheepDog.g:736:3: ( rule__When__TheDocStringAssignment_3_1 )
                    // InternalSheepDog.g:736:4: rule__When__TheDocStringAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__When__TheDocStringAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getWhenAccess().getTheDocStringAssignment_3_1()); 

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
    // $ANTLR end "rule__When__Alternatives_3"


    // $ANTLR start "rule__Then__Alternatives_3"
    // InternalSheepDog.g:744:1: rule__Then__Alternatives_3 : ( ( ( rule__Then__TheStepTableAssignment_3_0 ) ) | ( ( rule__Then__TheDocStringAssignment_3_1 ) ) );
    public final void rule__Then__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:748:1: ( ( ( rule__Then__TheStepTableAssignment_3_0 ) ) | ( ( rule__Then__TheDocStringAssignment_3_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            else if ( (LA6_0==24) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSheepDog.g:749:2: ( ( rule__Then__TheStepTableAssignment_3_0 ) )
                    {
                    // InternalSheepDog.g:749:2: ( ( rule__Then__TheStepTableAssignment_3_0 ) )
                    // InternalSheepDog.g:750:3: ( rule__Then__TheStepTableAssignment_3_0 )
                    {
                     before(grammarAccess.getThenAccess().getTheStepTableAssignment_3_0()); 
                    // InternalSheepDog.g:751:3: ( rule__Then__TheStepTableAssignment_3_0 )
                    // InternalSheepDog.g:751:4: rule__Then__TheStepTableAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Then__TheStepTableAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getThenAccess().getTheStepTableAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSheepDog.g:755:2: ( ( rule__Then__TheDocStringAssignment_3_1 ) )
                    {
                    // InternalSheepDog.g:755:2: ( ( rule__Then__TheDocStringAssignment_3_1 ) )
                    // InternalSheepDog.g:756:3: ( rule__Then__TheDocStringAssignment_3_1 )
                    {
                     before(grammarAccess.getThenAccess().getTheDocStringAssignment_3_1()); 
                    // InternalSheepDog.g:757:3: ( rule__Then__TheDocStringAssignment_3_1 )
                    // InternalSheepDog.g:757:4: rule__Then__TheDocStringAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Then__TheDocStringAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getThenAccess().getTheDocStringAssignment_3_1()); 

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
    // $ANTLR end "rule__Then__Alternatives_3"


    // $ANTLR start "rule__And__Alternatives_3"
    // InternalSheepDog.g:765:1: rule__And__Alternatives_3 : ( ( ( rule__And__TheStepTableAssignment_3_0 ) ) | ( ( rule__And__TheDocStringAssignment_3_1 ) ) );
    public final void rule__And__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:769:1: ( ( ( rule__And__TheStepTableAssignment_3_0 ) ) | ( ( rule__And__TheDocStringAssignment_3_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            else if ( (LA7_0==24) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSheepDog.g:770:2: ( ( rule__And__TheStepTableAssignment_3_0 ) )
                    {
                    // InternalSheepDog.g:770:2: ( ( rule__And__TheStepTableAssignment_3_0 ) )
                    // InternalSheepDog.g:771:3: ( rule__And__TheStepTableAssignment_3_0 )
                    {
                     before(grammarAccess.getAndAccess().getTheStepTableAssignment_3_0()); 
                    // InternalSheepDog.g:772:3: ( rule__And__TheStepTableAssignment_3_0 )
                    // InternalSheepDog.g:772:4: rule__And__TheStepTableAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__And__TheStepTableAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAndAccess().getTheStepTableAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSheepDog.g:776:2: ( ( rule__And__TheDocStringAssignment_3_1 ) )
                    {
                    // InternalSheepDog.g:776:2: ( ( rule__And__TheDocStringAssignment_3_1 ) )
                    // InternalSheepDog.g:777:3: ( rule__And__TheDocStringAssignment_3_1 )
                    {
                     before(grammarAccess.getAndAccess().getTheDocStringAssignment_3_1()); 
                    // InternalSheepDog.g:778:3: ( rule__And__TheDocStringAssignment_3_1 )
                    // InternalSheepDog.g:778:4: rule__And__TheDocStringAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__And__TheDocStringAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAndAccess().getTheDocStringAssignment_3_1()); 

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
    // $ANTLR end "rule__And__Alternatives_3"


    // $ANTLR start "rule__TEXT_LITERAL__Alternatives"
    // InternalSheepDog.g:786:1: rule__TEXT_LITERAL__Alternatives : ( ( RULE_WORD ) | ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__TEXT_LITERAL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:790:1: ( ( RULE_WORD ) | ( RULE_ID ) | ( RULE_STRING ) )
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
                    // InternalSheepDog.g:791:2: ( RULE_WORD )
                    {
                    // InternalSheepDog.g:791:2: ( RULE_WORD )
                    // InternalSheepDog.g:792:3: RULE_WORD
                    {
                     before(grammarAccess.getTEXT_LITERALAccess().getWORDTerminalRuleCall_0()); 
                    match(input,RULE_WORD,FOLLOW_2); 
                     after(grammarAccess.getTEXT_LITERALAccess().getWORDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSheepDog.g:797:2: ( RULE_ID )
                    {
                    // InternalSheepDog.g:797:2: ( RULE_ID )
                    // InternalSheepDog.g:798:3: RULE_ID
                    {
                     before(grammarAccess.getTEXT_LITERALAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getTEXT_LITERALAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSheepDog.g:803:2: ( RULE_STRING )
                    {
                    // InternalSheepDog.g:803:2: ( RULE_STRING )
                    // InternalSheepDog.g:804:3: RULE_STRING
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


    // $ANTLR start "rule__StepObject__Group__0"
    // InternalSheepDog.g:813:1: rule__StepObject__Group__0 : rule__StepObject__Group__0__Impl rule__StepObject__Group__1 ;
    public final void rule__StepObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:817:1: ( rule__StepObject__Group__0__Impl rule__StepObject__Group__1 )
            // InternalSheepDog.g:818:2: rule__StepObject__Group__0__Impl rule__StepObject__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalSheepDog.g:825:1: rule__StepObject__Group__0__Impl : ( '=' ) ;
    public final void rule__StepObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:829:1: ( ( '=' ) )
            // InternalSheepDog.g:830:1: ( '=' )
            {
            // InternalSheepDog.g:830:1: ( '=' )
            // InternalSheepDog.g:831:2: '='
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
    // InternalSheepDog.g:840:1: rule__StepObject__Group__1 : rule__StepObject__Group__1__Impl rule__StepObject__Group__2 ;
    public final void rule__StepObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:844:1: ( rule__StepObject__Group__1__Impl rule__StepObject__Group__2 )
            // InternalSheepDog.g:845:2: rule__StepObject__Group__1__Impl rule__StepObject__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalSheepDog.g:852:1: rule__StepObject__Group__1__Impl : ( 'Object:' ) ;
    public final void rule__StepObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:856:1: ( ( 'Object:' ) )
            // InternalSheepDog.g:857:1: ( 'Object:' )
            {
            // InternalSheepDog.g:857:1: ( 'Object:' )
            // InternalSheepDog.g:858:2: 'Object:'
            {
             before(grammarAccess.getStepObjectAccess().getObjectKeyword_1()); 
            match(input,11,FOLLOW_2); 
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
    // InternalSheepDog.g:867:1: rule__StepObject__Group__2 : rule__StepObject__Group__2__Impl rule__StepObject__Group__3 ;
    public final void rule__StepObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:871:1: ( rule__StepObject__Group__2__Impl rule__StepObject__Group__3 )
            // InternalSheepDog.g:872:2: rule__StepObject__Group__2__Impl rule__StepObject__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalSheepDog.g:879:1: rule__StepObject__Group__2__Impl : ( ( rule__StepObject__NameAssignment_2 ) ) ;
    public final void rule__StepObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:883:1: ( ( ( rule__StepObject__NameAssignment_2 ) ) )
            // InternalSheepDog.g:884:1: ( ( rule__StepObject__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:884:1: ( ( rule__StepObject__NameAssignment_2 ) )
            // InternalSheepDog.g:885:2: ( rule__StepObject__NameAssignment_2 )
            {
             before(grammarAccess.getStepObjectAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:886:2: ( rule__StepObject__NameAssignment_2 )
            // InternalSheepDog.g:886:3: rule__StepObject__NameAssignment_2
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
    // InternalSheepDog.g:894:1: rule__StepObject__Group__3 : rule__StepObject__Group__3__Impl rule__StepObject__Group__4 ;
    public final void rule__StepObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:898:1: ( rule__StepObject__Group__3__Impl rule__StepObject__Group__4 )
            // InternalSheepDog.g:899:2: rule__StepObject__Group__3__Impl rule__StepObject__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalSheepDog.g:906:1: rule__StepObject__Group__3__Impl : ( ( rule__StepObject__StatementsAssignment_3 )* ) ;
    public final void rule__StepObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:910:1: ( ( ( rule__StepObject__StatementsAssignment_3 )* ) )
            // InternalSheepDog.g:911:1: ( ( rule__StepObject__StatementsAssignment_3 )* )
            {
            // InternalSheepDog.g:911:1: ( ( rule__StepObject__StatementsAssignment_3 )* )
            // InternalSheepDog.g:912:2: ( rule__StepObject__StatementsAssignment_3 )*
            {
             before(grammarAccess.getStepObjectAccess().getStatementsAssignment_3()); 
            // InternalSheepDog.g:913:2: ( rule__StepObject__StatementsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_WORD && LA9_0<=RULE_STRING)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSheepDog.g:913:3: rule__StepObject__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__StepObject__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalSheepDog.g:921:1: rule__StepObject__Group__4 : rule__StepObject__Group__4__Impl ;
    public final void rule__StepObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:925:1: ( rule__StepObject__Group__4__Impl )
            // InternalSheepDog.g:926:2: rule__StepObject__Group__4__Impl
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
    // InternalSheepDog.g:932:1: rule__StepObject__Group__4__Impl : ( ( rule__StepObject__StepDefinitionsAssignment_4 )* ) ;
    public final void rule__StepObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:936:1: ( ( ( rule__StepObject__StepDefinitionsAssignment_4 )* ) )
            // InternalSheepDog.g:937:1: ( ( rule__StepObject__StepDefinitionsAssignment_4 )* )
            {
            // InternalSheepDog.g:937:1: ( ( rule__StepObject__StepDefinitionsAssignment_4 )* )
            // InternalSheepDog.g:938:2: ( rule__StepObject__StepDefinitionsAssignment_4 )*
            {
             before(grammarAccess.getStepObjectAccess().getStepDefinitionsAssignment_4()); 
            // InternalSheepDog.g:939:2: ( rule__StepObject__StepDefinitionsAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==12) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSheepDog.g:939:3: rule__StepObject__StepDefinitionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__StepObject__StepDefinitionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalSheepDog.g:948:1: rule__StepDefinition__Group__0 : rule__StepDefinition__Group__0__Impl rule__StepDefinition__Group__1 ;
    public final void rule__StepDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:952:1: ( rule__StepDefinition__Group__0__Impl rule__StepDefinition__Group__1 )
            // InternalSheepDog.g:953:2: rule__StepDefinition__Group__0__Impl rule__StepDefinition__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSheepDog.g:960:1: rule__StepDefinition__Group__0__Impl : ( '==' ) ;
    public final void rule__StepDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:964:1: ( ( '==' ) )
            // InternalSheepDog.g:965:1: ( '==' )
            {
            // InternalSheepDog.g:965:1: ( '==' )
            // InternalSheepDog.g:966:2: '=='
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
    // InternalSheepDog.g:975:1: rule__StepDefinition__Group__1 : rule__StepDefinition__Group__1__Impl rule__StepDefinition__Group__2 ;
    public final void rule__StepDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:979:1: ( rule__StepDefinition__Group__1__Impl rule__StepDefinition__Group__2 )
            // InternalSheepDog.g:980:2: rule__StepDefinition__Group__1__Impl rule__StepDefinition__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalSheepDog.g:987:1: rule__StepDefinition__Group__1__Impl : ( 'Definition:' ) ;
    public final void rule__StepDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:991:1: ( ( 'Definition:' ) )
            // InternalSheepDog.g:992:1: ( 'Definition:' )
            {
            // InternalSheepDog.g:992:1: ( 'Definition:' )
            // InternalSheepDog.g:993:2: 'Definition:'
            {
             before(grammarAccess.getStepDefinitionAccess().getDefinitionKeyword_1()); 
            match(input,13,FOLLOW_2); 
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
    // InternalSheepDog.g:1002:1: rule__StepDefinition__Group__2 : rule__StepDefinition__Group__2__Impl rule__StepDefinition__Group__3 ;
    public final void rule__StepDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1006:1: ( rule__StepDefinition__Group__2__Impl rule__StepDefinition__Group__3 )
            // InternalSheepDog.g:1007:2: rule__StepDefinition__Group__2__Impl rule__StepDefinition__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalSheepDog.g:1014:1: rule__StepDefinition__Group__2__Impl : ( ( rule__StepDefinition__NameAssignment_2 ) ) ;
    public final void rule__StepDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1018:1: ( ( ( rule__StepDefinition__NameAssignment_2 ) ) )
            // InternalSheepDog.g:1019:1: ( ( rule__StepDefinition__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:1019:1: ( ( rule__StepDefinition__NameAssignment_2 ) )
            // InternalSheepDog.g:1020:2: ( rule__StepDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getStepDefinitionAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:1021:2: ( rule__StepDefinition__NameAssignment_2 )
            // InternalSheepDog.g:1021:3: rule__StepDefinition__NameAssignment_2
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
    // InternalSheepDog.g:1029:1: rule__StepDefinition__Group__3 : rule__StepDefinition__Group__3__Impl rule__StepDefinition__Group__4 ;
    public final void rule__StepDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1033:1: ( rule__StepDefinition__Group__3__Impl rule__StepDefinition__Group__4 )
            // InternalSheepDog.g:1034:2: rule__StepDefinition__Group__3__Impl rule__StepDefinition__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalSheepDog.g:1041:1: rule__StepDefinition__Group__3__Impl : ( ( rule__StepDefinition__StatementsAssignment_3 )* ) ;
    public final void rule__StepDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1045:1: ( ( ( rule__StepDefinition__StatementsAssignment_3 )* ) )
            // InternalSheepDog.g:1046:1: ( ( rule__StepDefinition__StatementsAssignment_3 )* )
            {
            // InternalSheepDog.g:1046:1: ( ( rule__StepDefinition__StatementsAssignment_3 )* )
            // InternalSheepDog.g:1047:2: ( rule__StepDefinition__StatementsAssignment_3 )*
            {
             before(grammarAccess.getStepDefinitionAccess().getStatementsAssignment_3()); 
            // InternalSheepDog.g:1048:2: ( rule__StepDefinition__StatementsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_WORD && LA11_0<=RULE_STRING)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSheepDog.g:1048:3: rule__StepDefinition__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__StepDefinition__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalSheepDog.g:1056:1: rule__StepDefinition__Group__4 : rule__StepDefinition__Group__4__Impl ;
    public final void rule__StepDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1060:1: ( rule__StepDefinition__Group__4__Impl )
            // InternalSheepDog.g:1061:2: rule__StepDefinition__Group__4__Impl
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
    // InternalSheepDog.g:1067:1: rule__StepDefinition__Group__4__Impl : ( ( rule__StepDefinition__StepParametersAssignment_4 )* ) ;
    public final void rule__StepDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1071:1: ( ( ( rule__StepDefinition__StepParametersAssignment_4 )* ) )
            // InternalSheepDog.g:1072:1: ( ( rule__StepDefinition__StepParametersAssignment_4 )* )
            {
            // InternalSheepDog.g:1072:1: ( ( rule__StepDefinition__StepParametersAssignment_4 )* )
            // InternalSheepDog.g:1073:2: ( rule__StepDefinition__StepParametersAssignment_4 )*
            {
             before(grammarAccess.getStepDefinitionAccess().getStepParametersAssignment_4()); 
            // InternalSheepDog.g:1074:2: ( rule__StepDefinition__StepParametersAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSheepDog.g:1074:3: rule__StepDefinition__StepParametersAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__StepDefinition__StepParametersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalSheepDog.g:1083:1: rule__StepParameters__Group__0 : rule__StepParameters__Group__0__Impl rule__StepParameters__Group__1 ;
    public final void rule__StepParameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1087:1: ( rule__StepParameters__Group__0__Impl rule__StepParameters__Group__1 )
            // InternalSheepDog.g:1088:2: rule__StepParameters__Group__0__Impl rule__StepParameters__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSheepDog.g:1095:1: rule__StepParameters__Group__0__Impl : ( '===' ) ;
    public final void rule__StepParameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1099:1: ( ( '===' ) )
            // InternalSheepDog.g:1100:1: ( '===' )
            {
            // InternalSheepDog.g:1100:1: ( '===' )
            // InternalSheepDog.g:1101:2: '==='
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
    // InternalSheepDog.g:1110:1: rule__StepParameters__Group__1 : rule__StepParameters__Group__1__Impl rule__StepParameters__Group__2 ;
    public final void rule__StepParameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1114:1: ( rule__StepParameters__Group__1__Impl rule__StepParameters__Group__2 )
            // InternalSheepDog.g:1115:2: rule__StepParameters__Group__1__Impl rule__StepParameters__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalSheepDog.g:1122:1: rule__StepParameters__Group__1__Impl : ( 'Parameters:' ) ;
    public final void rule__StepParameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1126:1: ( ( 'Parameters:' ) )
            // InternalSheepDog.g:1127:1: ( 'Parameters:' )
            {
            // InternalSheepDog.g:1127:1: ( 'Parameters:' )
            // InternalSheepDog.g:1128:2: 'Parameters:'
            {
             before(grammarAccess.getStepParametersAccess().getParametersKeyword_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalSheepDog.g:1137:1: rule__StepParameters__Group__2 : rule__StepParameters__Group__2__Impl rule__StepParameters__Group__3 ;
    public final void rule__StepParameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1141:1: ( rule__StepParameters__Group__2__Impl rule__StepParameters__Group__3 )
            // InternalSheepDog.g:1142:2: rule__StepParameters__Group__2__Impl rule__StepParameters__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalSheepDog.g:1149:1: rule__StepParameters__Group__2__Impl : ( ( rule__StepParameters__NameAssignment_2 ) ) ;
    public final void rule__StepParameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1153:1: ( ( ( rule__StepParameters__NameAssignment_2 ) ) )
            // InternalSheepDog.g:1154:1: ( ( rule__StepParameters__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:1154:1: ( ( rule__StepParameters__NameAssignment_2 ) )
            // InternalSheepDog.g:1155:2: ( rule__StepParameters__NameAssignment_2 )
            {
             before(grammarAccess.getStepParametersAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:1156:2: ( rule__StepParameters__NameAssignment_2 )
            // InternalSheepDog.g:1156:3: rule__StepParameters__NameAssignment_2
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
    // InternalSheepDog.g:1164:1: rule__StepParameters__Group__3 : rule__StepParameters__Group__3__Impl rule__StepParameters__Group__4 ;
    public final void rule__StepParameters__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1168:1: ( rule__StepParameters__Group__3__Impl rule__StepParameters__Group__4 )
            // InternalSheepDog.g:1169:2: rule__StepParameters__Group__3__Impl rule__StepParameters__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalSheepDog.g:1176:1: rule__StepParameters__Group__3__Impl : ( ( rule__StepParameters__StatementsAssignment_3 )* ) ;
    public final void rule__StepParameters__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1180:1: ( ( ( rule__StepParameters__StatementsAssignment_3 )* ) )
            // InternalSheepDog.g:1181:1: ( ( rule__StepParameters__StatementsAssignment_3 )* )
            {
            // InternalSheepDog.g:1181:1: ( ( rule__StepParameters__StatementsAssignment_3 )* )
            // InternalSheepDog.g:1182:2: ( rule__StepParameters__StatementsAssignment_3 )*
            {
             before(grammarAccess.getStepParametersAccess().getStatementsAssignment_3()); 
            // InternalSheepDog.g:1183:2: ( rule__StepParameters__StatementsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_WORD && LA13_0<=RULE_STRING)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSheepDog.g:1183:3: rule__StepParameters__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__StepParameters__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalSheepDog.g:1191:1: rule__StepParameters__Group__4 : rule__StepParameters__Group__4__Impl ;
    public final void rule__StepParameters__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1195:1: ( rule__StepParameters__Group__4__Impl )
            // InternalSheepDog.g:1196:2: rule__StepParameters__Group__4__Impl
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
    // InternalSheepDog.g:1202:1: rule__StepParameters__Group__4__Impl : ( ( rule__StepParameters__ParametersTableAssignment_4 ) ) ;
    public final void rule__StepParameters__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1206:1: ( ( ( rule__StepParameters__ParametersTableAssignment_4 ) ) )
            // InternalSheepDog.g:1207:1: ( ( rule__StepParameters__ParametersTableAssignment_4 ) )
            {
            // InternalSheepDog.g:1207:1: ( ( rule__StepParameters__ParametersTableAssignment_4 ) )
            // InternalSheepDog.g:1208:2: ( rule__StepParameters__ParametersTableAssignment_4 )
            {
             before(grammarAccess.getStepParametersAccess().getParametersTableAssignment_4()); 
            // InternalSheepDog.g:1209:2: ( rule__StepParameters__ParametersTableAssignment_4 )
            // InternalSheepDog.g:1209:3: rule__StepParameters__ParametersTableAssignment_4
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


    // $ANTLR start "rule__Feature__Group__0"
    // InternalSheepDog.g:1218:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1222:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalSheepDog.g:1223:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSheepDog.g:1230:1: rule__Feature__Group__0__Impl : ( '=' ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1234:1: ( ( '=' ) )
            // InternalSheepDog.g:1235:1: ( '=' )
            {
            // InternalSheepDog.g:1235:1: ( '=' )
            // InternalSheepDog.g:1236:2: '='
            {
             before(grammarAccess.getFeatureAccess().getEqualsSignKeyword_0()); 
            match(input,10,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getEqualsSignKeyword_0()); 

            }


            }

        }
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
    // InternalSheepDog.g:1245:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1249:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalSheepDog.g:1250:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
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
    // InternalSheepDog.g:1257:1: rule__Feature__Group__1__Impl : ( 'Feature:' ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1261:1: ( ( 'Feature:' ) )
            // InternalSheepDog.g:1262:1: ( 'Feature:' )
            {
            // InternalSheepDog.g:1262:1: ( 'Feature:' )
            // InternalSheepDog.g:1263:2: 'Feature:'
            {
             before(grammarAccess.getFeatureAccess().getFeatureKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalSheepDog.g:1272:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1276:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalSheepDog.g:1277:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalSheepDog.g:1284:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__NameAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1288:1: ( ( ( rule__Feature__NameAssignment_2 ) ) )
            // InternalSheepDog.g:1289:1: ( ( rule__Feature__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:1289:1: ( ( rule__Feature__NameAssignment_2 ) )
            // InternalSheepDog.g:1290:2: ( rule__Feature__NameAssignment_2 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:1291:2: ( rule__Feature__NameAssignment_2 )
            // InternalSheepDog.g:1291:3: rule__Feature__NameAssignment_2
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
    // InternalSheepDog.g:1299:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1303:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalSheepDog.g:1304:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalSheepDog.g:1311:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__StatementsAssignment_3 )* ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1315:1: ( ( ( rule__Feature__StatementsAssignment_3 )* ) )
            // InternalSheepDog.g:1316:1: ( ( rule__Feature__StatementsAssignment_3 )* )
            {
            // InternalSheepDog.g:1316:1: ( ( rule__Feature__StatementsAssignment_3 )* )
            // InternalSheepDog.g:1317:2: ( rule__Feature__StatementsAssignment_3 )*
            {
             before(grammarAccess.getFeatureAccess().getStatementsAssignment_3()); 
            // InternalSheepDog.g:1318:2: ( rule__Feature__StatementsAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_WORD && LA14_0<=RULE_STRING)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSheepDog.g:1318:3: rule__Feature__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Feature__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getStatementsAssignment_3()); 

            }


            }

        }
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
    // InternalSheepDog.g:1326:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1330:1: ( rule__Feature__Group__4__Impl )
            // InternalSheepDog.g:1331:2: rule__Feature__Group__4__Impl
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
    // InternalSheepDog.g:1337:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__AbstractScenariosAssignment_4 )* ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1341:1: ( ( ( rule__Feature__AbstractScenariosAssignment_4 )* ) )
            // InternalSheepDog.g:1342:1: ( ( rule__Feature__AbstractScenariosAssignment_4 )* )
            {
            // InternalSheepDog.g:1342:1: ( ( rule__Feature__AbstractScenariosAssignment_4 )* )
            // InternalSheepDog.g:1343:2: ( rule__Feature__AbstractScenariosAssignment_4 )*
            {
             before(grammarAccess.getFeatureAccess().getAbstractScenariosAssignment_4()); 
            // InternalSheepDog.g:1344:2: ( rule__Feature__AbstractScenariosAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==12||LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSheepDog.g:1344:3: rule__Feature__AbstractScenariosAssignment_4
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Feature__AbstractScenariosAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getAbstractScenariosAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Background__Group__0"
    // InternalSheepDog.g:1353:1: rule__Background__Group__0 : rule__Background__Group__0__Impl rule__Background__Group__1 ;
    public final void rule__Background__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1357:1: ( rule__Background__Group__0__Impl rule__Background__Group__1 )
            // InternalSheepDog.g:1358:2: rule__Background__Group__0__Impl rule__Background__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSheepDog.g:1365:1: rule__Background__Group__0__Impl : ( ( rule__Background__TagsAssignment_0 )? ) ;
    public final void rule__Background__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1369:1: ( ( ( rule__Background__TagsAssignment_0 )? ) )
            // InternalSheepDog.g:1370:1: ( ( rule__Background__TagsAssignment_0 )? )
            {
            // InternalSheepDog.g:1370:1: ( ( rule__Background__TagsAssignment_0 )? )
            // InternalSheepDog.g:1371:2: ( rule__Background__TagsAssignment_0 )?
            {
             before(grammarAccess.getBackgroundAccess().getTagsAssignment_0()); 
            // InternalSheepDog.g:1372:2: ( rule__Background__TagsAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSheepDog.g:1372:3: rule__Background__TagsAssignment_0
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
    // InternalSheepDog.g:1380:1: rule__Background__Group__1 : rule__Background__Group__1__Impl rule__Background__Group__2 ;
    public final void rule__Background__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1384:1: ( rule__Background__Group__1__Impl rule__Background__Group__2 )
            // InternalSheepDog.g:1385:2: rule__Background__Group__1__Impl rule__Background__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalSheepDog.g:1392:1: rule__Background__Group__1__Impl : ( '==' ) ;
    public final void rule__Background__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1396:1: ( ( '==' ) )
            // InternalSheepDog.g:1397:1: ( '==' )
            {
            // InternalSheepDog.g:1397:1: ( '==' )
            // InternalSheepDog.g:1398:2: '=='
            {
             before(grammarAccess.getBackgroundAccess().getEqualsSignEqualsSignKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalSheepDog.g:1407:1: rule__Background__Group__2 : rule__Background__Group__2__Impl rule__Background__Group__3 ;
    public final void rule__Background__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1411:1: ( rule__Background__Group__2__Impl rule__Background__Group__3 )
            // InternalSheepDog.g:1412:2: rule__Background__Group__2__Impl rule__Background__Group__3
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
    // InternalSheepDog.g:1419:1: rule__Background__Group__2__Impl : ( 'Background:' ) ;
    public final void rule__Background__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1423:1: ( ( 'Background:' ) )
            // InternalSheepDog.g:1424:1: ( 'Background:' )
            {
            // InternalSheepDog.g:1424:1: ( 'Background:' )
            // InternalSheepDog.g:1425:2: 'Background:'
            {
             before(grammarAccess.getBackgroundAccess().getBackgroundKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalSheepDog.g:1434:1: rule__Background__Group__3 : rule__Background__Group__3__Impl rule__Background__Group__4 ;
    public final void rule__Background__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1438:1: ( rule__Background__Group__3__Impl rule__Background__Group__4 )
            // InternalSheepDog.g:1439:2: rule__Background__Group__3__Impl rule__Background__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalSheepDog.g:1446:1: rule__Background__Group__3__Impl : ( ( rule__Background__NameAssignment_3 ) ) ;
    public final void rule__Background__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1450:1: ( ( ( rule__Background__NameAssignment_3 ) ) )
            // InternalSheepDog.g:1451:1: ( ( rule__Background__NameAssignment_3 ) )
            {
            // InternalSheepDog.g:1451:1: ( ( rule__Background__NameAssignment_3 ) )
            // InternalSheepDog.g:1452:2: ( rule__Background__NameAssignment_3 )
            {
             before(grammarAccess.getBackgroundAccess().getNameAssignment_3()); 
            // InternalSheepDog.g:1453:2: ( rule__Background__NameAssignment_3 )
            // InternalSheepDog.g:1453:3: rule__Background__NameAssignment_3
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
    // InternalSheepDog.g:1461:1: rule__Background__Group__4 : rule__Background__Group__4__Impl rule__Background__Group__5 ;
    public final void rule__Background__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1465:1: ( rule__Background__Group__4__Impl rule__Background__Group__5 )
            // InternalSheepDog.g:1466:2: rule__Background__Group__4__Impl rule__Background__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalSheepDog.g:1473:1: rule__Background__Group__4__Impl : ( ( rule__Background__StatementsAssignment_4 )* ) ;
    public final void rule__Background__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1477:1: ( ( ( rule__Background__StatementsAssignment_4 )* ) )
            // InternalSheepDog.g:1478:1: ( ( rule__Background__StatementsAssignment_4 )* )
            {
            // InternalSheepDog.g:1478:1: ( ( rule__Background__StatementsAssignment_4 )* )
            // InternalSheepDog.g:1479:2: ( rule__Background__StatementsAssignment_4 )*
            {
             before(grammarAccess.getBackgroundAccess().getStatementsAssignment_4()); 
            // InternalSheepDog.g:1480:2: ( rule__Background__StatementsAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_WORD && LA17_0<=RULE_STRING)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSheepDog.g:1480:3: rule__Background__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Background__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getBackgroundAccess().getStatementsAssignment_4()); 

            }


            }

        }
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
    // InternalSheepDog.g:1488:1: rule__Background__Group__5 : rule__Background__Group__5__Impl ;
    public final void rule__Background__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1492:1: ( rule__Background__Group__5__Impl )
            // InternalSheepDog.g:1493:2: rule__Background__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Background__Group__5__Impl();

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
    // InternalSheepDog.g:1499:1: rule__Background__Group__5__Impl : ( ( rule__Background__StepsAssignment_5 )* ) ;
    public final void rule__Background__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1503:1: ( ( ( rule__Background__StepsAssignment_5 )* ) )
            // InternalSheepDog.g:1504:1: ( ( rule__Background__StepsAssignment_5 )* )
            {
            // InternalSheepDog.g:1504:1: ( ( rule__Background__StepsAssignment_5 )* )
            // InternalSheepDog.g:1505:2: ( rule__Background__StepsAssignment_5 )*
            {
             before(grammarAccess.getBackgroundAccess().getStepsAssignment_5()); 
            // InternalSheepDog.g:1506:2: ( rule__Background__StepsAssignment_5 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==14) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSheepDog.g:1506:3: rule__Background__StepsAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Background__StepsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getBackgroundAccess().getStepsAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Scenario__Group__0"
    // InternalSheepDog.g:1515:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1519:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalSheepDog.g:1520:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSheepDog.g:1527:1: rule__Scenario__Group__0__Impl : ( ( rule__Scenario__TagsAssignment_0 )? ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1531:1: ( ( ( rule__Scenario__TagsAssignment_0 )? ) )
            // InternalSheepDog.g:1532:1: ( ( rule__Scenario__TagsAssignment_0 )? )
            {
            // InternalSheepDog.g:1532:1: ( ( rule__Scenario__TagsAssignment_0 )? )
            // InternalSheepDog.g:1533:2: ( rule__Scenario__TagsAssignment_0 )?
            {
             before(grammarAccess.getScenarioAccess().getTagsAssignment_0()); 
            // InternalSheepDog.g:1534:2: ( rule__Scenario__TagsAssignment_0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSheepDog.g:1534:3: rule__Scenario__TagsAssignment_0
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
    // InternalSheepDog.g:1542:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1546:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalSheepDog.g:1547:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalSheepDog.g:1554:1: rule__Scenario__Group__1__Impl : ( '==' ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1558:1: ( ( '==' ) )
            // InternalSheepDog.g:1559:1: ( '==' )
            {
            // InternalSheepDog.g:1559:1: ( '==' )
            // InternalSheepDog.g:1560:2: '=='
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
    // InternalSheepDog.g:1569:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1573:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // InternalSheepDog.g:1574:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
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
    // InternalSheepDog.g:1581:1: rule__Scenario__Group__2__Impl : ( 'Scenario:' ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1585:1: ( ( 'Scenario:' ) )
            // InternalSheepDog.g:1586:1: ( 'Scenario:' )
            {
            // InternalSheepDog.g:1586:1: ( 'Scenario:' )
            // InternalSheepDog.g:1587:2: 'Scenario:'
            {
             before(grammarAccess.getScenarioAccess().getScenarioKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalSheepDog.g:1596:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl rule__Scenario__Group__4 ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1600:1: ( rule__Scenario__Group__3__Impl rule__Scenario__Group__4 )
            // InternalSheepDog.g:1601:2: rule__Scenario__Group__3__Impl rule__Scenario__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalSheepDog.g:1608:1: rule__Scenario__Group__3__Impl : ( ( rule__Scenario__NameAssignment_3 ) ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1612:1: ( ( ( rule__Scenario__NameAssignment_3 ) ) )
            // InternalSheepDog.g:1613:1: ( ( rule__Scenario__NameAssignment_3 ) )
            {
            // InternalSheepDog.g:1613:1: ( ( rule__Scenario__NameAssignment_3 ) )
            // InternalSheepDog.g:1614:2: ( rule__Scenario__NameAssignment_3 )
            {
             before(grammarAccess.getScenarioAccess().getNameAssignment_3()); 
            // InternalSheepDog.g:1615:2: ( rule__Scenario__NameAssignment_3 )
            // InternalSheepDog.g:1615:3: rule__Scenario__NameAssignment_3
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
    // InternalSheepDog.g:1623:1: rule__Scenario__Group__4 : rule__Scenario__Group__4__Impl rule__Scenario__Group__5 ;
    public final void rule__Scenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1627:1: ( rule__Scenario__Group__4__Impl rule__Scenario__Group__5 )
            // InternalSheepDog.g:1628:2: rule__Scenario__Group__4__Impl rule__Scenario__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalSheepDog.g:1635:1: rule__Scenario__Group__4__Impl : ( ( rule__Scenario__StatementsAssignment_4 )* ) ;
    public final void rule__Scenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1639:1: ( ( ( rule__Scenario__StatementsAssignment_4 )* ) )
            // InternalSheepDog.g:1640:1: ( ( rule__Scenario__StatementsAssignment_4 )* )
            {
            // InternalSheepDog.g:1640:1: ( ( rule__Scenario__StatementsAssignment_4 )* )
            // InternalSheepDog.g:1641:2: ( rule__Scenario__StatementsAssignment_4 )*
            {
             before(grammarAccess.getScenarioAccess().getStatementsAssignment_4()); 
            // InternalSheepDog.g:1642:2: ( rule__Scenario__StatementsAssignment_4 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_WORD && LA20_0<=RULE_STRING)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSheepDog.g:1642:3: rule__Scenario__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Scenario__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalSheepDog.g:1650:1: rule__Scenario__Group__5 : rule__Scenario__Group__5__Impl rule__Scenario__Group__6 ;
    public final void rule__Scenario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1654:1: ( rule__Scenario__Group__5__Impl rule__Scenario__Group__6 )
            // InternalSheepDog.g:1655:2: rule__Scenario__Group__5__Impl rule__Scenario__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalSheepDog.g:1662:1: rule__Scenario__Group__5__Impl : ( ( rule__Scenario__StepsAssignment_5 )* ) ;
    public final void rule__Scenario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1666:1: ( ( ( rule__Scenario__StepsAssignment_5 )* ) )
            // InternalSheepDog.g:1667:1: ( ( rule__Scenario__StepsAssignment_5 )* )
            {
            // InternalSheepDog.g:1667:1: ( ( rule__Scenario__StepsAssignment_5 )* )
            // InternalSheepDog.g:1668:2: ( rule__Scenario__StepsAssignment_5 )*
            {
             before(grammarAccess.getScenarioAccess().getStepsAssignment_5()); 
            // InternalSheepDog.g:1669:2: ( rule__Scenario__StepsAssignment_5 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==14) ) {
                    int LA21_2 = input.LA(2);

                    if ( ((LA21_2>=20 && LA21_2<=23)) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // InternalSheepDog.g:1669:3: rule__Scenario__StepsAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Scenario__StepsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalSheepDog.g:1677:1: rule__Scenario__Group__6 : rule__Scenario__Group__6__Impl ;
    public final void rule__Scenario__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1681:1: ( rule__Scenario__Group__6__Impl )
            // InternalSheepDog.g:1682:2: rule__Scenario__Group__6__Impl
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
    // InternalSheepDog.g:1688:1: rule__Scenario__Group__6__Impl : ( ( rule__Scenario__ExamplesAssignment_6 )* ) ;
    public final void rule__Scenario__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1692:1: ( ( ( rule__Scenario__ExamplesAssignment_6 )* ) )
            // InternalSheepDog.g:1693:1: ( ( rule__Scenario__ExamplesAssignment_6 )* )
            {
            // InternalSheepDog.g:1693:1: ( ( rule__Scenario__ExamplesAssignment_6 )* )
            // InternalSheepDog.g:1694:2: ( rule__Scenario__ExamplesAssignment_6 )*
            {
             before(grammarAccess.getScenarioAccess().getExamplesAssignment_6()); 
            // InternalSheepDog.g:1695:2: ( rule__Scenario__ExamplesAssignment_6 )*
            loop22:
            do {
                int alt22=2;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // InternalSheepDog.g:1695:3: rule__Scenario__ExamplesAssignment_6
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Scenario__ExamplesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getExamplesAssignment_6()); 

            }


            }

        }
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
    // InternalSheepDog.g:1704:1: rule__Examples__Group__0 : rule__Examples__Group__0__Impl rule__Examples__Group__1 ;
    public final void rule__Examples__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1708:1: ( rule__Examples__Group__0__Impl rule__Examples__Group__1 )
            // InternalSheepDog.g:1709:2: rule__Examples__Group__0__Impl rule__Examples__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalSheepDog.g:1716:1: rule__Examples__Group__0__Impl : ( ( rule__Examples__TagsAssignment_0 )? ) ;
    public final void rule__Examples__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1720:1: ( ( ( rule__Examples__TagsAssignment_0 )? ) )
            // InternalSheepDog.g:1721:1: ( ( rule__Examples__TagsAssignment_0 )? )
            {
            // InternalSheepDog.g:1721:1: ( ( rule__Examples__TagsAssignment_0 )? )
            // InternalSheepDog.g:1722:2: ( rule__Examples__TagsAssignment_0 )?
            {
             before(grammarAccess.getExamplesAccess().getTagsAssignment_0()); 
            // InternalSheepDog.g:1723:2: ( rule__Examples__TagsAssignment_0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSheepDog.g:1723:3: rule__Examples__TagsAssignment_0
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
    // InternalSheepDog.g:1731:1: rule__Examples__Group__1 : rule__Examples__Group__1__Impl rule__Examples__Group__2 ;
    public final void rule__Examples__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1735:1: ( rule__Examples__Group__1__Impl rule__Examples__Group__2 )
            // InternalSheepDog.g:1736:2: rule__Examples__Group__1__Impl rule__Examples__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalSheepDog.g:1743:1: rule__Examples__Group__1__Impl : ( '===' ) ;
    public final void rule__Examples__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1747:1: ( ( '===' ) )
            // InternalSheepDog.g:1748:1: ( '===' )
            {
            // InternalSheepDog.g:1748:1: ( '===' )
            // InternalSheepDog.g:1749:2: '==='
            {
             before(grammarAccess.getExamplesAccess().getEqualsSignEqualsSignEqualsSignKeyword_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalSheepDog.g:1758:1: rule__Examples__Group__2 : rule__Examples__Group__2__Impl rule__Examples__Group__3 ;
    public final void rule__Examples__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1762:1: ( rule__Examples__Group__2__Impl rule__Examples__Group__3 )
            // InternalSheepDog.g:1763:2: rule__Examples__Group__2__Impl rule__Examples__Group__3
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
    // InternalSheepDog.g:1770:1: rule__Examples__Group__2__Impl : ( 'Examples:' ) ;
    public final void rule__Examples__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1774:1: ( ( 'Examples:' ) )
            // InternalSheepDog.g:1775:1: ( 'Examples:' )
            {
            // InternalSheepDog.g:1775:1: ( 'Examples:' )
            // InternalSheepDog.g:1776:2: 'Examples:'
            {
             before(grammarAccess.getExamplesAccess().getExamplesKeyword_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSheepDog.g:1785:1: rule__Examples__Group__3 : rule__Examples__Group__3__Impl rule__Examples__Group__4 ;
    public final void rule__Examples__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1789:1: ( rule__Examples__Group__3__Impl rule__Examples__Group__4 )
            // InternalSheepDog.g:1790:2: rule__Examples__Group__3__Impl rule__Examples__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalSheepDog.g:1797:1: rule__Examples__Group__3__Impl : ( ( rule__Examples__NameAssignment_3 ) ) ;
    public final void rule__Examples__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1801:1: ( ( ( rule__Examples__NameAssignment_3 ) ) )
            // InternalSheepDog.g:1802:1: ( ( rule__Examples__NameAssignment_3 ) )
            {
            // InternalSheepDog.g:1802:1: ( ( rule__Examples__NameAssignment_3 ) )
            // InternalSheepDog.g:1803:2: ( rule__Examples__NameAssignment_3 )
            {
             before(grammarAccess.getExamplesAccess().getNameAssignment_3()); 
            // InternalSheepDog.g:1804:2: ( rule__Examples__NameAssignment_3 )
            // InternalSheepDog.g:1804:3: rule__Examples__NameAssignment_3
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
    // InternalSheepDog.g:1812:1: rule__Examples__Group__4 : rule__Examples__Group__4__Impl rule__Examples__Group__5 ;
    public final void rule__Examples__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1816:1: ( rule__Examples__Group__4__Impl rule__Examples__Group__5 )
            // InternalSheepDog.g:1817:2: rule__Examples__Group__4__Impl rule__Examples__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalSheepDog.g:1824:1: rule__Examples__Group__4__Impl : ( ( rule__Examples__StatementsAssignment_4 )* ) ;
    public final void rule__Examples__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1828:1: ( ( ( rule__Examples__StatementsAssignment_4 )* ) )
            // InternalSheepDog.g:1829:1: ( ( rule__Examples__StatementsAssignment_4 )* )
            {
            // InternalSheepDog.g:1829:1: ( ( rule__Examples__StatementsAssignment_4 )* )
            // InternalSheepDog.g:1830:2: ( rule__Examples__StatementsAssignment_4 )*
            {
             before(grammarAccess.getExamplesAccess().getStatementsAssignment_4()); 
            // InternalSheepDog.g:1831:2: ( rule__Examples__StatementsAssignment_4 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_WORD && LA24_0<=RULE_STRING)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSheepDog.g:1831:3: rule__Examples__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Examples__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getExamplesAccess().getStatementsAssignment_4()); 

            }


            }

        }
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
    // InternalSheepDog.g:1839:1: rule__Examples__Group__5 : rule__Examples__Group__5__Impl ;
    public final void rule__Examples__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1843:1: ( rule__Examples__Group__5__Impl )
            // InternalSheepDog.g:1844:2: rule__Examples__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Examples__Group__5__Impl();

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
    // InternalSheepDog.g:1850:1: rule__Examples__Group__5__Impl : ( ( rule__Examples__TheExamplesTableAssignment_5 ) ) ;
    public final void rule__Examples__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1854:1: ( ( ( rule__Examples__TheExamplesTableAssignment_5 ) ) )
            // InternalSheepDog.g:1855:1: ( ( rule__Examples__TheExamplesTableAssignment_5 ) )
            {
            // InternalSheepDog.g:1855:1: ( ( rule__Examples__TheExamplesTableAssignment_5 ) )
            // InternalSheepDog.g:1856:2: ( rule__Examples__TheExamplesTableAssignment_5 )
            {
             before(grammarAccess.getExamplesAccess().getTheExamplesTableAssignment_5()); 
            // InternalSheepDog.g:1857:2: ( rule__Examples__TheExamplesTableAssignment_5 )
            // InternalSheepDog.g:1857:3: rule__Examples__TheExamplesTableAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Examples__TheExamplesTableAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getExamplesAccess().getTheExamplesTableAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Given__Group__0"
    // InternalSheepDog.g:1866:1: rule__Given__Group__0 : rule__Given__Group__0__Impl rule__Given__Group__1 ;
    public final void rule__Given__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1870:1: ( rule__Given__Group__0__Impl rule__Given__Group__1 )
            // InternalSheepDog.g:1871:2: rule__Given__Group__0__Impl rule__Given__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalSheepDog.g:1878:1: rule__Given__Group__0__Impl : ( '===' ) ;
    public final void rule__Given__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1882:1: ( ( '===' ) )
            // InternalSheepDog.g:1883:1: ( '===' )
            {
            // InternalSheepDog.g:1883:1: ( '===' )
            // InternalSheepDog.g:1884:2: '==='
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
    // InternalSheepDog.g:1893:1: rule__Given__Group__1 : rule__Given__Group__1__Impl rule__Given__Group__2 ;
    public final void rule__Given__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1897:1: ( rule__Given__Group__1__Impl rule__Given__Group__2 )
            // InternalSheepDog.g:1898:2: rule__Given__Group__1__Impl rule__Given__Group__2
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
    // InternalSheepDog.g:1905:1: rule__Given__Group__1__Impl : ( 'Given' ) ;
    public final void rule__Given__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1909:1: ( ( 'Given' ) )
            // InternalSheepDog.g:1910:1: ( 'Given' )
            {
            // InternalSheepDog.g:1910:1: ( 'Given' )
            // InternalSheepDog.g:1911:2: 'Given'
            {
             before(grammarAccess.getGivenAccess().getGivenKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSheepDog.g:1920:1: rule__Given__Group__2 : rule__Given__Group__2__Impl rule__Given__Group__3 ;
    public final void rule__Given__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1924:1: ( rule__Given__Group__2__Impl rule__Given__Group__3 )
            // InternalSheepDog.g:1925:2: rule__Given__Group__2__Impl rule__Given__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalSheepDog.g:1932:1: rule__Given__Group__2__Impl : ( ( rule__Given__NameAssignment_2 ) ) ;
    public final void rule__Given__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1936:1: ( ( ( rule__Given__NameAssignment_2 ) ) )
            // InternalSheepDog.g:1937:1: ( ( rule__Given__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:1937:1: ( ( rule__Given__NameAssignment_2 ) )
            // InternalSheepDog.g:1938:2: ( rule__Given__NameAssignment_2 )
            {
             before(grammarAccess.getGivenAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:1939:2: ( rule__Given__NameAssignment_2 )
            // InternalSheepDog.g:1939:3: rule__Given__NameAssignment_2
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
    // InternalSheepDog.g:1947:1: rule__Given__Group__3 : rule__Given__Group__3__Impl ;
    public final void rule__Given__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1951:1: ( rule__Given__Group__3__Impl )
            // InternalSheepDog.g:1952:2: rule__Given__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Given__Group__3__Impl();

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
    // InternalSheepDog.g:1958:1: rule__Given__Group__3__Impl : ( ( rule__Given__Alternatives_3 )? ) ;
    public final void rule__Given__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1962:1: ( ( ( rule__Given__Alternatives_3 )? ) )
            // InternalSheepDog.g:1963:1: ( ( rule__Given__Alternatives_3 )? )
            {
            // InternalSheepDog.g:1963:1: ( ( rule__Given__Alternatives_3 )? )
            // InternalSheepDog.g:1964:2: ( rule__Given__Alternatives_3 )?
            {
             before(grammarAccess.getGivenAccess().getAlternatives_3()); 
            // InternalSheepDog.g:1965:2: ( rule__Given__Alternatives_3 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=24 && LA25_0<=25)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSheepDog.g:1965:3: rule__Given__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Given__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGivenAccess().getAlternatives_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__When__Group__0"
    // InternalSheepDog.g:1974:1: rule__When__Group__0 : rule__When__Group__0__Impl rule__When__Group__1 ;
    public final void rule__When__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1978:1: ( rule__When__Group__0__Impl rule__When__Group__1 )
            // InternalSheepDog.g:1979:2: rule__When__Group__0__Impl rule__When__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalSheepDog.g:1986:1: rule__When__Group__0__Impl : ( '===' ) ;
    public final void rule__When__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1990:1: ( ( '===' ) )
            // InternalSheepDog.g:1991:1: ( '===' )
            {
            // InternalSheepDog.g:1991:1: ( '===' )
            // InternalSheepDog.g:1992:2: '==='
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
    // InternalSheepDog.g:2001:1: rule__When__Group__1 : rule__When__Group__1__Impl rule__When__Group__2 ;
    public final void rule__When__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2005:1: ( rule__When__Group__1__Impl rule__When__Group__2 )
            // InternalSheepDog.g:2006:2: rule__When__Group__1__Impl rule__When__Group__2
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
    // InternalSheepDog.g:2013:1: rule__When__Group__1__Impl : ( 'When' ) ;
    public final void rule__When__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2017:1: ( ( 'When' ) )
            // InternalSheepDog.g:2018:1: ( 'When' )
            {
            // InternalSheepDog.g:2018:1: ( 'When' )
            // InternalSheepDog.g:2019:2: 'When'
            {
             before(grammarAccess.getWhenAccess().getWhenKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSheepDog.g:2028:1: rule__When__Group__2 : rule__When__Group__2__Impl rule__When__Group__3 ;
    public final void rule__When__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2032:1: ( rule__When__Group__2__Impl rule__When__Group__3 )
            // InternalSheepDog.g:2033:2: rule__When__Group__2__Impl rule__When__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalSheepDog.g:2040:1: rule__When__Group__2__Impl : ( ( rule__When__NameAssignment_2 ) ) ;
    public final void rule__When__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2044:1: ( ( ( rule__When__NameAssignment_2 ) ) )
            // InternalSheepDog.g:2045:1: ( ( rule__When__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:2045:1: ( ( rule__When__NameAssignment_2 ) )
            // InternalSheepDog.g:2046:2: ( rule__When__NameAssignment_2 )
            {
             before(grammarAccess.getWhenAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:2047:2: ( rule__When__NameAssignment_2 )
            // InternalSheepDog.g:2047:3: rule__When__NameAssignment_2
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
    // InternalSheepDog.g:2055:1: rule__When__Group__3 : rule__When__Group__3__Impl ;
    public final void rule__When__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2059:1: ( rule__When__Group__3__Impl )
            // InternalSheepDog.g:2060:2: rule__When__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__When__Group__3__Impl();

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
    // InternalSheepDog.g:2066:1: rule__When__Group__3__Impl : ( ( rule__When__Alternatives_3 )? ) ;
    public final void rule__When__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2070:1: ( ( ( rule__When__Alternatives_3 )? ) )
            // InternalSheepDog.g:2071:1: ( ( rule__When__Alternatives_3 )? )
            {
            // InternalSheepDog.g:2071:1: ( ( rule__When__Alternatives_3 )? )
            // InternalSheepDog.g:2072:2: ( rule__When__Alternatives_3 )?
            {
             before(grammarAccess.getWhenAccess().getAlternatives_3()); 
            // InternalSheepDog.g:2073:2: ( rule__When__Alternatives_3 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=24 && LA26_0<=25)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSheepDog.g:2073:3: rule__When__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__When__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWhenAccess().getAlternatives_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Then__Group__0"
    // InternalSheepDog.g:2082:1: rule__Then__Group__0 : rule__Then__Group__0__Impl rule__Then__Group__1 ;
    public final void rule__Then__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2086:1: ( rule__Then__Group__0__Impl rule__Then__Group__1 )
            // InternalSheepDog.g:2087:2: rule__Then__Group__0__Impl rule__Then__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalSheepDog.g:2094:1: rule__Then__Group__0__Impl : ( '===' ) ;
    public final void rule__Then__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2098:1: ( ( '===' ) )
            // InternalSheepDog.g:2099:1: ( '===' )
            {
            // InternalSheepDog.g:2099:1: ( '===' )
            // InternalSheepDog.g:2100:2: '==='
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
    // InternalSheepDog.g:2109:1: rule__Then__Group__1 : rule__Then__Group__1__Impl rule__Then__Group__2 ;
    public final void rule__Then__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2113:1: ( rule__Then__Group__1__Impl rule__Then__Group__2 )
            // InternalSheepDog.g:2114:2: rule__Then__Group__1__Impl rule__Then__Group__2
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
    // InternalSheepDog.g:2121:1: rule__Then__Group__1__Impl : ( 'Then' ) ;
    public final void rule__Then__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2125:1: ( ( 'Then' ) )
            // InternalSheepDog.g:2126:1: ( 'Then' )
            {
            // InternalSheepDog.g:2126:1: ( 'Then' )
            // InternalSheepDog.g:2127:2: 'Then'
            {
             before(grammarAccess.getThenAccess().getThenKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSheepDog.g:2136:1: rule__Then__Group__2 : rule__Then__Group__2__Impl rule__Then__Group__3 ;
    public final void rule__Then__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2140:1: ( rule__Then__Group__2__Impl rule__Then__Group__3 )
            // InternalSheepDog.g:2141:2: rule__Then__Group__2__Impl rule__Then__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalSheepDog.g:2148:1: rule__Then__Group__2__Impl : ( ( rule__Then__NameAssignment_2 ) ) ;
    public final void rule__Then__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2152:1: ( ( ( rule__Then__NameAssignment_2 ) ) )
            // InternalSheepDog.g:2153:1: ( ( rule__Then__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:2153:1: ( ( rule__Then__NameAssignment_2 ) )
            // InternalSheepDog.g:2154:2: ( rule__Then__NameAssignment_2 )
            {
             before(grammarAccess.getThenAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:2155:2: ( rule__Then__NameAssignment_2 )
            // InternalSheepDog.g:2155:3: rule__Then__NameAssignment_2
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
    // InternalSheepDog.g:2163:1: rule__Then__Group__3 : rule__Then__Group__3__Impl ;
    public final void rule__Then__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2167:1: ( rule__Then__Group__3__Impl )
            // InternalSheepDog.g:2168:2: rule__Then__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Then__Group__3__Impl();

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
    // InternalSheepDog.g:2174:1: rule__Then__Group__3__Impl : ( ( rule__Then__Alternatives_3 )? ) ;
    public final void rule__Then__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2178:1: ( ( ( rule__Then__Alternatives_3 )? ) )
            // InternalSheepDog.g:2179:1: ( ( rule__Then__Alternatives_3 )? )
            {
            // InternalSheepDog.g:2179:1: ( ( rule__Then__Alternatives_3 )? )
            // InternalSheepDog.g:2180:2: ( rule__Then__Alternatives_3 )?
            {
             before(grammarAccess.getThenAccess().getAlternatives_3()); 
            // InternalSheepDog.g:2181:2: ( rule__Then__Alternatives_3 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=24 && LA27_0<=25)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSheepDog.g:2181:3: rule__Then__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Then__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getThenAccess().getAlternatives_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__And__Group__0"
    // InternalSheepDog.g:2190:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2194:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalSheepDog.g:2195:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSheepDog.g:2202:1: rule__And__Group__0__Impl : ( '===' ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2206:1: ( ( '===' ) )
            // InternalSheepDog.g:2207:1: ( '===' )
            {
            // InternalSheepDog.g:2207:1: ( '===' )
            // InternalSheepDog.g:2208:2: '==='
            {
             before(grammarAccess.getAndAccess().getEqualsSignEqualsSignEqualsSignKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalSheepDog.g:2217:1: rule__And__Group__1 : rule__And__Group__1__Impl rule__And__Group__2 ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2221:1: ( rule__And__Group__1__Impl rule__And__Group__2 )
            // InternalSheepDog.g:2222:2: rule__And__Group__1__Impl rule__And__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalSheepDog.g:2229:1: rule__And__Group__1__Impl : ( 'And' ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2233:1: ( ( 'And' ) )
            // InternalSheepDog.g:2234:1: ( 'And' )
            {
            // InternalSheepDog.g:2234:1: ( 'And' )
            // InternalSheepDog.g:2235:2: 'And'
            {
             before(grammarAccess.getAndAccess().getAndKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSheepDog.g:2244:1: rule__And__Group__2 : rule__And__Group__2__Impl rule__And__Group__3 ;
    public final void rule__And__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2248:1: ( rule__And__Group__2__Impl rule__And__Group__3 )
            // InternalSheepDog.g:2249:2: rule__And__Group__2__Impl rule__And__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalSheepDog.g:2256:1: rule__And__Group__2__Impl : ( ( rule__And__NameAssignment_2 ) ) ;
    public final void rule__And__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2260:1: ( ( ( rule__And__NameAssignment_2 ) ) )
            // InternalSheepDog.g:2261:1: ( ( rule__And__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:2261:1: ( ( rule__And__NameAssignment_2 ) )
            // InternalSheepDog.g:2262:2: ( rule__And__NameAssignment_2 )
            {
             before(grammarAccess.getAndAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:2263:2: ( rule__And__NameAssignment_2 )
            // InternalSheepDog.g:2263:3: rule__And__NameAssignment_2
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
    // InternalSheepDog.g:2271:1: rule__And__Group__3 : rule__And__Group__3__Impl ;
    public final void rule__And__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2275:1: ( rule__And__Group__3__Impl )
            // InternalSheepDog.g:2276:2: rule__And__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__3__Impl();

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
    // InternalSheepDog.g:2282:1: rule__And__Group__3__Impl : ( ( rule__And__Alternatives_3 )? ) ;
    public final void rule__And__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2286:1: ( ( ( rule__And__Alternatives_3 )? ) )
            // InternalSheepDog.g:2287:1: ( ( rule__And__Alternatives_3 )? )
            {
            // InternalSheepDog.g:2287:1: ( ( rule__And__Alternatives_3 )? )
            // InternalSheepDog.g:2288:2: ( rule__And__Alternatives_3 )?
            {
             before(grammarAccess.getAndAccess().getAlternatives_3()); 
            // InternalSheepDog.g:2289:2: ( rule__And__Alternatives_3 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=24 && LA28_0<=25)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSheepDog.g:2289:3: rule__And__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__And__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAndAccess().getAlternatives_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__DocString__Group__0"
    // InternalSheepDog.g:2298:1: rule__DocString__Group__0 : rule__DocString__Group__0__Impl rule__DocString__Group__1 ;
    public final void rule__DocString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2302:1: ( rule__DocString__Group__0__Impl rule__DocString__Group__1 )
            // InternalSheepDog.g:2303:2: rule__DocString__Group__0__Impl rule__DocString__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalSheepDog.g:2310:1: rule__DocString__Group__0__Impl : ( '----' ) ;
    public final void rule__DocString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2314:1: ( ( '----' ) )
            // InternalSheepDog.g:2315:1: ( '----' )
            {
            // InternalSheepDog.g:2315:1: ( '----' )
            // InternalSheepDog.g:2316:2: '----'
            {
             before(grammarAccess.getDocStringAccess().getHyphenMinusHyphenMinusHyphenMinusHyphenMinusKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSheepDog.g:2325:1: rule__DocString__Group__1 : rule__DocString__Group__1__Impl rule__DocString__Group__2 ;
    public final void rule__DocString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2329:1: ( rule__DocString__Group__1__Impl rule__DocString__Group__2 )
            // InternalSheepDog.g:2330:2: rule__DocString__Group__1__Impl rule__DocString__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalSheepDog.g:2337:1: rule__DocString__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__DocString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2341:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2342:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2342:1: ( RULE_EOL )
            // InternalSheepDog.g:2343:2: RULE_EOL
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
    // InternalSheepDog.g:2352:1: rule__DocString__Group__2 : rule__DocString__Group__2__Impl rule__DocString__Group__3 ;
    public final void rule__DocString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2356:1: ( rule__DocString__Group__2__Impl rule__DocString__Group__3 )
            // InternalSheepDog.g:2357:2: rule__DocString__Group__2__Impl rule__DocString__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalSheepDog.g:2364:1: rule__DocString__Group__2__Impl : ( ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* ) ) ;
    public final void rule__DocString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2368:1: ( ( ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* ) ) )
            // InternalSheepDog.g:2369:1: ( ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* ) )
            {
            // InternalSheepDog.g:2369:1: ( ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* ) )
            // InternalSheepDog.g:2370:2: ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* )
            {
            // InternalSheepDog.g:2370:2: ( ( rule__DocString__LinesAssignment_2 ) )
            // InternalSheepDog.g:2371:3: ( rule__DocString__LinesAssignment_2 )
            {
             before(grammarAccess.getDocStringAccess().getLinesAssignment_2()); 
            // InternalSheepDog.g:2372:3: ( rule__DocString__LinesAssignment_2 )
            // InternalSheepDog.g:2372:4: rule__DocString__LinesAssignment_2
            {
            pushFollow(FOLLOW_31);
            rule__DocString__LinesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDocStringAccess().getLinesAssignment_2()); 

            }

            // InternalSheepDog.g:2375:2: ( ( rule__DocString__LinesAssignment_2 )* )
            // InternalSheepDog.g:2376:3: ( rule__DocString__LinesAssignment_2 )*
            {
             before(grammarAccess.getDocStringAccess().getLinesAssignment_2()); 
            // InternalSheepDog.g:2377:3: ( rule__DocString__LinesAssignment_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_WORD && LA29_0<=RULE_EOL)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSheepDog.g:2377:4: rule__DocString__LinesAssignment_2
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__DocString__LinesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalSheepDog.g:2386:1: rule__DocString__Group__3 : rule__DocString__Group__3__Impl rule__DocString__Group__4 ;
    public final void rule__DocString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2390:1: ( rule__DocString__Group__3__Impl rule__DocString__Group__4 )
            // InternalSheepDog.g:2391:2: rule__DocString__Group__3__Impl rule__DocString__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalSheepDog.g:2398:1: rule__DocString__Group__3__Impl : ( '----' ) ;
    public final void rule__DocString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2402:1: ( ( '----' ) )
            // InternalSheepDog.g:2403:1: ( '----' )
            {
            // InternalSheepDog.g:2403:1: ( '----' )
            // InternalSheepDog.g:2404:2: '----'
            {
             before(grammarAccess.getDocStringAccess().getHyphenMinusHyphenMinusHyphenMinusHyphenMinusKeyword_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSheepDog.g:2413:1: rule__DocString__Group__4 : rule__DocString__Group__4__Impl ;
    public final void rule__DocString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2417:1: ( rule__DocString__Group__4__Impl )
            // InternalSheepDog.g:2418:2: rule__DocString__Group__4__Impl
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
    // InternalSheepDog.g:2424:1: rule__DocString__Group__4__Impl : ( RULE_EOL ) ;
    public final void rule__DocString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2428:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2429:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2429:1: ( RULE_EOL )
            // InternalSheepDog.g:2430:2: RULE_EOL
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


    // $ANTLR start "rule__Table__Group__0"
    // InternalSheepDog.g:2440:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2444:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalSheepDog.g:2445:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalSheepDog.g:2452:1: rule__Table__Group__0__Impl : ( '[options=\"header\"]' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2456:1: ( ( '[options=\"header\"]' ) )
            // InternalSheepDog.g:2457:1: ( '[options=\"header\"]' )
            {
            // InternalSheepDog.g:2457:1: ( '[options=\"header\"]' )
            // InternalSheepDog.g:2458:2: '[options=\"header\"]'
            {
             before(grammarAccess.getTableAccess().getOptionsHeaderKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSheepDog.g:2467:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2471:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalSheepDog.g:2472:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalSheepDog.g:2479:1: rule__Table__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2483:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2484:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2484:1: ( RULE_EOL )
            // InternalSheepDog.g:2485:2: RULE_EOL
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
    // InternalSheepDog.g:2494:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2498:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalSheepDog.g:2499:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalSheepDog.g:2506:1: rule__Table__Group__2__Impl : ( '|===' ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2510:1: ( ( '|===' ) )
            // InternalSheepDog.g:2511:1: ( '|===' )
            {
            // InternalSheepDog.g:2511:1: ( '|===' )
            // InternalSheepDog.g:2512:2: '|==='
            {
             before(grammarAccess.getTableAccess().getVerticalLineEqualsSignEqualsSignEqualsSignKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSheepDog.g:2521:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2525:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalSheepDog.g:2526:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalSheepDog.g:2533:1: rule__Table__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2537:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2538:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2538:1: ( RULE_EOL )
            // InternalSheepDog.g:2539:2: RULE_EOL
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
    // InternalSheepDog.g:2548:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2552:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalSheepDog.g:2553:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FOLLOW_32);
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
    // InternalSheepDog.g:2560:1: rule__Table__Group__4__Impl : ( ( ( rule__Table__RowsAssignment_4 ) ) ( ( rule__Table__RowsAssignment_4 )* ) ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2564:1: ( ( ( ( rule__Table__RowsAssignment_4 ) ) ( ( rule__Table__RowsAssignment_4 )* ) ) )
            // InternalSheepDog.g:2565:1: ( ( ( rule__Table__RowsAssignment_4 ) ) ( ( rule__Table__RowsAssignment_4 )* ) )
            {
            // InternalSheepDog.g:2565:1: ( ( ( rule__Table__RowsAssignment_4 ) ) ( ( rule__Table__RowsAssignment_4 )* ) )
            // InternalSheepDog.g:2566:2: ( ( rule__Table__RowsAssignment_4 ) ) ( ( rule__Table__RowsAssignment_4 )* )
            {
            // InternalSheepDog.g:2566:2: ( ( rule__Table__RowsAssignment_4 ) )
            // InternalSheepDog.g:2567:3: ( rule__Table__RowsAssignment_4 )
            {
             before(grammarAccess.getTableAccess().getRowsAssignment_4()); 
            // InternalSheepDog.g:2568:3: ( rule__Table__RowsAssignment_4 )
            // InternalSheepDog.g:2568:4: rule__Table__RowsAssignment_4
            {
            pushFollow(FOLLOW_34);
            rule__Table__RowsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getRowsAssignment_4()); 

            }

            // InternalSheepDog.g:2571:2: ( ( rule__Table__RowsAssignment_4 )* )
            // InternalSheepDog.g:2572:3: ( rule__Table__RowsAssignment_4 )*
            {
             before(grammarAccess.getTableAccess().getRowsAssignment_4()); 
            // InternalSheepDog.g:2573:3: ( rule__Table__RowsAssignment_4 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==29) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSheepDog.g:2573:4: rule__Table__RowsAssignment_4
            	    {
            	    pushFollow(FOLLOW_34);
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
    // InternalSheepDog.g:2582:1: rule__Table__Group__5 : rule__Table__Group__5__Impl rule__Table__Group__6 ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2586:1: ( rule__Table__Group__5__Impl rule__Table__Group__6 )
            // InternalSheepDog.g:2587:2: rule__Table__Group__5__Impl rule__Table__Group__6
            {
            pushFollow(FOLLOW_28);
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
    // InternalSheepDog.g:2594:1: rule__Table__Group__5__Impl : ( '|===' ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2598:1: ( ( '|===' ) )
            // InternalSheepDog.g:2599:1: ( '|===' )
            {
            // InternalSheepDog.g:2599:1: ( '|===' )
            // InternalSheepDog.g:2600:2: '|==='
            {
             before(grammarAccess.getTableAccess().getVerticalLineEqualsSignEqualsSignEqualsSignKeyword_5()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSheepDog.g:2609:1: rule__Table__Group__6 : rule__Table__Group__6__Impl ;
    public final void rule__Table__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2613:1: ( rule__Table__Group__6__Impl )
            // InternalSheepDog.g:2614:2: rule__Table__Group__6__Impl
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
    // InternalSheepDog.g:2620:1: rule__Table__Group__6__Impl : ( RULE_EOL ) ;
    public final void rule__Table__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2624:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2625:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2625:1: ( RULE_EOL )
            // InternalSheepDog.g:2626:2: RULE_EOL
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
    // InternalSheepDog.g:2636:1: rule__Row__Group__0 : rule__Row__Group__0__Impl rule__Row__Group__1 ;
    public final void rule__Row__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2640:1: ( rule__Row__Group__0__Impl rule__Row__Group__1 )
            // InternalSheepDog.g:2641:2: rule__Row__Group__0__Impl rule__Row__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalSheepDog.g:2648:1: rule__Row__Group__0__Impl : ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) ) ;
    public final void rule__Row__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2652:1: ( ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) ) )
            // InternalSheepDog.g:2653:1: ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) )
            {
            // InternalSheepDog.g:2653:1: ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) )
            // InternalSheepDog.g:2654:2: ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* )
            {
            // InternalSheepDog.g:2654:2: ( ( rule__Row__CellsAssignment_0 ) )
            // InternalSheepDog.g:2655:3: ( rule__Row__CellsAssignment_0 )
            {
             before(grammarAccess.getRowAccess().getCellsAssignment_0()); 
            // InternalSheepDog.g:2656:3: ( rule__Row__CellsAssignment_0 )
            // InternalSheepDog.g:2656:4: rule__Row__CellsAssignment_0
            {
            pushFollow(FOLLOW_34);
            rule__Row__CellsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getCellsAssignment_0()); 

            }

            // InternalSheepDog.g:2659:2: ( ( rule__Row__CellsAssignment_0 )* )
            // InternalSheepDog.g:2660:3: ( rule__Row__CellsAssignment_0 )*
            {
             before(grammarAccess.getRowAccess().getCellsAssignment_0()); 
            // InternalSheepDog.g:2661:3: ( rule__Row__CellsAssignment_0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==29) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalSheepDog.g:2661:4: rule__Row__CellsAssignment_0
            	    {
            	    pushFollow(FOLLOW_34);
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
    // InternalSheepDog.g:2670:1: rule__Row__Group__1 : rule__Row__Group__1__Impl ;
    public final void rule__Row__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2674:1: ( rule__Row__Group__1__Impl )
            // InternalSheepDog.g:2675:2: rule__Row__Group__1__Impl
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
    // InternalSheepDog.g:2681:1: rule__Row__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Row__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2685:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2686:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2686:1: ( RULE_EOL )
            // InternalSheepDog.g:2687:2: RULE_EOL
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


    // $ANTLR start "rule__Tags__Group__0"
    // InternalSheepDog.g:2697:1: rule__Tags__Group__0 : rule__Tags__Group__0__Impl rule__Tags__Group__1 ;
    public final void rule__Tags__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2701:1: ( rule__Tags__Group__0__Impl rule__Tags__Group__1 )
            // InternalSheepDog.g:2702:2: rule__Tags__Group__0__Impl rule__Tags__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSheepDog.g:2709:1: rule__Tags__Group__0__Impl : ( '[tags=\"' ) ;
    public final void rule__Tags__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2713:1: ( ( '[tags=\"' ) )
            // InternalSheepDog.g:2714:1: ( '[tags=\"' )
            {
            // InternalSheepDog.g:2714:1: ( '[tags=\"' )
            // InternalSheepDog.g:2715:2: '[tags=\"'
            {
             before(grammarAccess.getTagsAccess().getTagsKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTagsAccess().getTagsKeyword_0()); 

            }


            }

        }
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
    // InternalSheepDog.g:2724:1: rule__Tags__Group__1 : rule__Tags__Group__1__Impl rule__Tags__Group__2 ;
    public final void rule__Tags__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2728:1: ( rule__Tags__Group__1__Impl rule__Tags__Group__2 )
            // InternalSheepDog.g:2729:2: rule__Tags__Group__1__Impl rule__Tags__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__Tags__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tags__Group__2();

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
    // InternalSheepDog.g:2736:1: rule__Tags__Group__1__Impl : ( ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* ) ) ;
    public final void rule__Tags__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2740:1: ( ( ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* ) ) )
            // InternalSheepDog.g:2741:1: ( ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* ) )
            {
            // InternalSheepDog.g:2741:1: ( ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* ) )
            // InternalSheepDog.g:2742:2: ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* )
            {
            // InternalSheepDog.g:2742:2: ( ( ruleTEXT_LITERAL ) )
            // InternalSheepDog.g:2743:3: ( ruleTEXT_LITERAL )
            {
             before(grammarAccess.getTagsAccess().getTEXT_LITERALParserRuleCall_1()); 
            // InternalSheepDog.g:2744:3: ( ruleTEXT_LITERAL )
            // InternalSheepDog.g:2744:4: ruleTEXT_LITERAL
            {
            pushFollow(FOLLOW_6);
            ruleTEXT_LITERAL();

            state._fsp--;


            }

             after(grammarAccess.getTagsAccess().getTEXT_LITERALParserRuleCall_1()); 

            }

            // InternalSheepDog.g:2747:2: ( ( ruleTEXT_LITERAL )* )
            // InternalSheepDog.g:2748:3: ( ruleTEXT_LITERAL )*
            {
             before(grammarAccess.getTagsAccess().getTEXT_LITERALParserRuleCall_1()); 
            // InternalSheepDog.g:2749:3: ( ruleTEXT_LITERAL )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=RULE_WORD && LA32_0<=RULE_STRING)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSheepDog.g:2749:4: ruleTEXT_LITERAL
            	    {
            	    pushFollow(FOLLOW_6);
            	    ruleTEXT_LITERAL();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getTagsAccess().getTEXT_LITERALParserRuleCall_1()); 

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
    // $ANTLR end "rule__Tags__Group__1__Impl"


    // $ANTLR start "rule__Tags__Group__2"
    // InternalSheepDog.g:2758:1: rule__Tags__Group__2 : rule__Tags__Group__2__Impl rule__Tags__Group__3 ;
    public final void rule__Tags__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2762:1: ( rule__Tags__Group__2__Impl rule__Tags__Group__3 )
            // InternalSheepDog.g:2763:2: rule__Tags__Group__2__Impl rule__Tags__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Tags__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tags__Group__3();

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
    // $ANTLR end "rule__Tags__Group__2"


    // $ANTLR start "rule__Tags__Group__2__Impl"
    // InternalSheepDog.g:2770:1: rule__Tags__Group__2__Impl : ( '\"]' ) ;
    public final void rule__Tags__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2774:1: ( ( '\"]' ) )
            // InternalSheepDog.g:2775:1: ( '\"]' )
            {
            // InternalSheepDog.g:2775:1: ( '\"]' )
            // InternalSheepDog.g:2776:2: '\"]'
            {
             before(grammarAccess.getTagsAccess().getQuotationMarkRightSquareBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTagsAccess().getQuotationMarkRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tags__Group__2__Impl"


    // $ANTLR start "rule__Tags__Group__3"
    // InternalSheepDog.g:2785:1: rule__Tags__Group__3 : rule__Tags__Group__3__Impl ;
    public final void rule__Tags__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2789:1: ( rule__Tags__Group__3__Impl )
            // InternalSheepDog.g:2790:2: rule__Tags__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tags__Group__3__Impl();

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
    // $ANTLR end "rule__Tags__Group__3"


    // $ANTLR start "rule__Tags__Group__3__Impl"
    // InternalSheepDog.g:2796:1: rule__Tags__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Tags__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2800:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2801:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2801:1: ( RULE_EOL )
            // InternalSheepDog.g:2802:2: RULE_EOL
            {
             before(grammarAccess.getTagsAccess().getEOLTerminalRuleCall_3()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getTagsAccess().getEOLTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tags__Group__3__Impl"


    // $ANTLR start "rule__Title__Group__0"
    // InternalSheepDog.g:2812:1: rule__Title__Group__0 : rule__Title__Group__0__Impl rule__Title__Group__1 ;
    public final void rule__Title__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2816:1: ( rule__Title__Group__0__Impl rule__Title__Group__1 )
            // InternalSheepDog.g:2817:2: rule__Title__Group__0__Impl rule__Title__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Title__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Title__Group__1();

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
    // $ANTLR end "rule__Title__Group__0"


    // $ANTLR start "rule__Title__Group__0__Impl"
    // InternalSheepDog.g:2824:1: rule__Title__Group__0__Impl : ( ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* ) ) ;
    public final void rule__Title__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2828:1: ( ( ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* ) ) )
            // InternalSheepDog.g:2829:1: ( ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* ) )
            {
            // InternalSheepDog.g:2829:1: ( ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* ) )
            // InternalSheepDog.g:2830:2: ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* )
            {
            // InternalSheepDog.g:2830:2: ( ( ruleTEXT_LITERAL ) )
            // InternalSheepDog.g:2831:3: ( ruleTEXT_LITERAL )
            {
             before(grammarAccess.getTitleAccess().getTEXT_LITERALParserRuleCall_0()); 
            // InternalSheepDog.g:2832:3: ( ruleTEXT_LITERAL )
            // InternalSheepDog.g:2832:4: ruleTEXT_LITERAL
            {
            pushFollow(FOLLOW_6);
            ruleTEXT_LITERAL();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getTEXT_LITERALParserRuleCall_0()); 

            }

            // InternalSheepDog.g:2835:2: ( ( ruleTEXT_LITERAL )* )
            // InternalSheepDog.g:2836:3: ( ruleTEXT_LITERAL )*
            {
             before(grammarAccess.getTitleAccess().getTEXT_LITERALParserRuleCall_0()); 
            // InternalSheepDog.g:2837:3: ( ruleTEXT_LITERAL )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=RULE_WORD && LA33_0<=RULE_STRING)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSheepDog.g:2837:4: ruleTEXT_LITERAL
            	    {
            	    pushFollow(FOLLOW_6);
            	    ruleTEXT_LITERAL();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getTitleAccess().getTEXT_LITERALParserRuleCall_0()); 

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
    // $ANTLR end "rule__Title__Group__0__Impl"


    // $ANTLR start "rule__Title__Group__1"
    // InternalSheepDog.g:2846:1: rule__Title__Group__1 : rule__Title__Group__1__Impl ;
    public final void rule__Title__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2850:1: ( rule__Title__Group__1__Impl )
            // InternalSheepDog.g:2851:2: rule__Title__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Title__Group__1__Impl();

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
    // $ANTLR end "rule__Title__Group__1"


    // $ANTLR start "rule__Title__Group__1__Impl"
    // InternalSheepDog.g:2857:1: rule__Title__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Title__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2861:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2862:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2862:1: ( RULE_EOL )
            // InternalSheepDog.g:2863:2: RULE_EOL
            {
             before(grammarAccess.getTitleAccess().getEOLTerminalRuleCall_1()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getEOLTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__1__Impl"


    // $ANTLR start "rule__Statement__Group__0"
    // InternalSheepDog.g:2873:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2877:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalSheepDog.g:2878:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalSheepDog.g:2885:1: rule__Statement__Group__0__Impl : ( ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2889:1: ( ( ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* ) ) )
            // InternalSheepDog.g:2890:1: ( ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* ) )
            {
            // InternalSheepDog.g:2890:1: ( ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* ) )
            // InternalSheepDog.g:2891:2: ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* )
            {
            // InternalSheepDog.g:2891:2: ( ( ruleTEXT_LITERAL ) )
            // InternalSheepDog.g:2892:3: ( ruleTEXT_LITERAL )
            {
             before(grammarAccess.getStatementAccess().getTEXT_LITERALParserRuleCall_0()); 
            // InternalSheepDog.g:2893:3: ( ruleTEXT_LITERAL )
            // InternalSheepDog.g:2893:4: ruleTEXT_LITERAL
            {
            pushFollow(FOLLOW_6);
            ruleTEXT_LITERAL();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getTEXT_LITERALParserRuleCall_0()); 

            }

            // InternalSheepDog.g:2896:2: ( ( ruleTEXT_LITERAL )* )
            // InternalSheepDog.g:2897:3: ( ruleTEXT_LITERAL )*
            {
             before(grammarAccess.getStatementAccess().getTEXT_LITERALParserRuleCall_0()); 
            // InternalSheepDog.g:2898:3: ( ruleTEXT_LITERAL )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_WORD && LA34_0<=RULE_STRING)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalSheepDog.g:2898:4: ruleTEXT_LITERAL
            	    {
            	    pushFollow(FOLLOW_6);
            	    ruleTEXT_LITERAL();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getStatementAccess().getTEXT_LITERALParserRuleCall_0()); 

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
    // $ANTLR end "rule__Statement__Group__0__Impl"


    // $ANTLR start "rule__Statement__Group__1"
    // InternalSheepDog.g:2907:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2911:1: ( rule__Statement__Group__1__Impl )
            // InternalSheepDog.g:2912:2: rule__Statement__Group__1__Impl
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
    // InternalSheepDog.g:2918:1: rule__Statement__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2922:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2923:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2923:1: ( RULE_EOL )
            // InternalSheepDog.g:2924:2: RULE_EOL
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


    // $ANTLR start "rule__Line__Group__0"
    // InternalSheepDog.g:2934:1: rule__Line__Group__0 : rule__Line__Group__0__Impl rule__Line__Group__1 ;
    public final void rule__Line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2938:1: ( rule__Line__Group__0__Impl rule__Line__Group__1 )
            // InternalSheepDog.g:2939:2: rule__Line__Group__0__Impl rule__Line__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalSheepDog.g:2946:1: rule__Line__Group__0__Impl : ( ( ruleTEXT_LITERAL )* ) ;
    public final void rule__Line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2950:1: ( ( ( ruleTEXT_LITERAL )* ) )
            // InternalSheepDog.g:2951:1: ( ( ruleTEXT_LITERAL )* )
            {
            // InternalSheepDog.g:2951:1: ( ( ruleTEXT_LITERAL )* )
            // InternalSheepDog.g:2952:2: ( ruleTEXT_LITERAL )*
            {
             before(grammarAccess.getLineAccess().getTEXT_LITERALParserRuleCall_0()); 
            // InternalSheepDog.g:2953:2: ( ruleTEXT_LITERAL )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=RULE_WORD && LA35_0<=RULE_STRING)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalSheepDog.g:2953:3: ruleTEXT_LITERAL
            	    {
            	    pushFollow(FOLLOW_6);
            	    ruleTEXT_LITERAL();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getLineAccess().getTEXT_LITERALParserRuleCall_0()); 

            }


            }

        }
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
    // InternalSheepDog.g:2961:1: rule__Line__Group__1 : rule__Line__Group__1__Impl ;
    public final void rule__Line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2965:1: ( rule__Line__Group__1__Impl )
            // InternalSheepDog.g:2966:2: rule__Line__Group__1__Impl
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
    // InternalSheepDog.g:2972:1: rule__Line__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2976:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2977:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2977:1: ( RULE_EOL )
            // InternalSheepDog.g:2978:2: RULE_EOL
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


    // $ANTLR start "rule__Cell__Group__0"
    // InternalSheepDog.g:2988:1: rule__Cell__Group__0 : rule__Cell__Group__0__Impl rule__Cell__Group__1 ;
    public final void rule__Cell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2992:1: ( rule__Cell__Group__0__Impl rule__Cell__Group__1 )
            // InternalSheepDog.g:2993:2: rule__Cell__Group__0__Impl rule__Cell__Group__1
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
    // InternalSheepDog.g:3000:1: rule__Cell__Group__0__Impl : ( '|' ) ;
    public final void rule__Cell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3004:1: ( ( '|' ) )
            // InternalSheepDog.g:3005:1: ( '|' )
            {
            // InternalSheepDog.g:3005:1: ( '|' )
            // InternalSheepDog.g:3006:2: '|'
            {
             before(grammarAccess.getCellAccess().getVerticalLineKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSheepDog.g:3015:1: rule__Cell__Group__1 : rule__Cell__Group__1__Impl ;
    public final void rule__Cell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3019:1: ( rule__Cell__Group__1__Impl )
            // InternalSheepDog.g:3020:2: rule__Cell__Group__1__Impl
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
    // InternalSheepDog.g:3026:1: rule__Cell__Group__1__Impl : ( ( ruleTEXT_LITERAL )* ) ;
    public final void rule__Cell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3030:1: ( ( ( ruleTEXT_LITERAL )* ) )
            // InternalSheepDog.g:3031:1: ( ( ruleTEXT_LITERAL )* )
            {
            // InternalSheepDog.g:3031:1: ( ( ruleTEXT_LITERAL )* )
            // InternalSheepDog.g:3032:2: ( ruleTEXT_LITERAL )*
            {
             before(grammarAccess.getCellAccess().getTEXT_LITERALParserRuleCall_1()); 
            // InternalSheepDog.g:3033:2: ( ruleTEXT_LITERAL )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=RULE_WORD && LA36_0<=RULE_STRING)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalSheepDog.g:3033:3: ruleTEXT_LITERAL
            	    {
            	    pushFollow(FOLLOW_6);
            	    ruleTEXT_LITERAL();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getCellAccess().getTEXT_LITERALParserRuleCall_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__StepObject__NameAssignment_2"
    // InternalSheepDog.g:3042:1: rule__StepObject__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__StepObject__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3046:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3047:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3047:2: ( ruleTitle )
            // InternalSheepDog.g:3048:3: ruleTitle
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


    // $ANTLR start "rule__StepObject__StatementsAssignment_3"
    // InternalSheepDog.g:3057:1: rule__StepObject__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__StepObject__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3061:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3062:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3062:2: ( ruleStatement )
            // InternalSheepDog.g:3063:3: ruleStatement
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
    // InternalSheepDog.g:3072:1: rule__StepObject__StepDefinitionsAssignment_4 : ( ruleStepDefinition ) ;
    public final void rule__StepObject__StepDefinitionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3076:1: ( ( ruleStepDefinition ) )
            // InternalSheepDog.g:3077:2: ( ruleStepDefinition )
            {
            // InternalSheepDog.g:3077:2: ( ruleStepDefinition )
            // InternalSheepDog.g:3078:3: ruleStepDefinition
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


    // $ANTLR start "rule__StepDefinition__NameAssignment_2"
    // InternalSheepDog.g:3087:1: rule__StepDefinition__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__StepDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3091:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3092:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3092:2: ( ruleTitle )
            // InternalSheepDog.g:3093:3: ruleTitle
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


    // $ANTLR start "rule__StepDefinition__StatementsAssignment_3"
    // InternalSheepDog.g:3102:1: rule__StepDefinition__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__StepDefinition__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3106:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3107:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3107:2: ( ruleStatement )
            // InternalSheepDog.g:3108:3: ruleStatement
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
    // InternalSheepDog.g:3117:1: rule__StepDefinition__StepParametersAssignment_4 : ( ruleStepParameters ) ;
    public final void rule__StepDefinition__StepParametersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3121:1: ( ( ruleStepParameters ) )
            // InternalSheepDog.g:3122:2: ( ruleStepParameters )
            {
            // InternalSheepDog.g:3122:2: ( ruleStepParameters )
            // InternalSheepDog.g:3123:3: ruleStepParameters
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


    // $ANTLR start "rule__StepParameters__NameAssignment_2"
    // InternalSheepDog.g:3132:1: rule__StepParameters__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__StepParameters__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3136:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3137:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3137:2: ( ruleTitle )
            // InternalSheepDog.g:3138:3: ruleTitle
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


    // $ANTLR start "rule__StepParameters__StatementsAssignment_3"
    // InternalSheepDog.g:3147:1: rule__StepParameters__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__StepParameters__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3151:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3152:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3152:2: ( ruleStatement )
            // InternalSheepDog.g:3153:3: ruleStatement
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
    // InternalSheepDog.g:3162:1: rule__StepParameters__ParametersTableAssignment_4 : ( ruleTable ) ;
    public final void rule__StepParameters__ParametersTableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3166:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3167:2: ( ruleTable )
            {
            // InternalSheepDog.g:3167:2: ( ruleTable )
            // InternalSheepDog.g:3168:3: ruleTable
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


    // $ANTLR start "rule__Feature__NameAssignment_2"
    // InternalSheepDog.g:3177:1: rule__Feature__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__Feature__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3181:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3182:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3182:2: ( ruleTitle )
            // InternalSheepDog.g:3183:3: ruleTitle
            {
             before(grammarAccess.getFeatureAccess().getNameTitleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getNameTitleParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Feature__StatementsAssignment_3"
    // InternalSheepDog.g:3192:1: rule__Feature__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__Feature__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3196:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3197:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3197:2: ( ruleStatement )
            // InternalSheepDog.g:3198:3: ruleStatement
            {
             before(grammarAccess.getFeatureAccess().getStatementsStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getStatementsStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__StatementsAssignment_3"


    // $ANTLR start "rule__Feature__AbstractScenariosAssignment_4"
    // InternalSheepDog.g:3207:1: rule__Feature__AbstractScenariosAssignment_4 : ( ruleAbstractScenario ) ;
    public final void rule__Feature__AbstractScenariosAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3211:1: ( ( ruleAbstractScenario ) )
            // InternalSheepDog.g:3212:2: ( ruleAbstractScenario )
            {
            // InternalSheepDog.g:3212:2: ( ruleAbstractScenario )
            // InternalSheepDog.g:3213:3: ruleAbstractScenario
            {
             before(grammarAccess.getFeatureAccess().getAbstractScenariosAbstractScenarioParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractScenario();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getAbstractScenariosAbstractScenarioParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__AbstractScenariosAssignment_4"


    // $ANTLR start "rule__Background__TagsAssignment_0"
    // InternalSheepDog.g:3222:1: rule__Background__TagsAssignment_0 : ( ruleTags ) ;
    public final void rule__Background__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3226:1: ( ( ruleTags ) )
            // InternalSheepDog.g:3227:2: ( ruleTags )
            {
            // InternalSheepDog.g:3227:2: ( ruleTags )
            // InternalSheepDog.g:3228:3: ruleTags
            {
             before(grammarAccess.getBackgroundAccess().getTagsTagsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTags();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getTagsTagsParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalSheepDog.g:3237:1: rule__Background__NameAssignment_3 : ( ruleTitle ) ;
    public final void rule__Background__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3241:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3242:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3242:2: ( ruleTitle )
            // InternalSheepDog.g:3243:3: ruleTitle
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


    // $ANTLR start "rule__Background__StatementsAssignment_4"
    // InternalSheepDog.g:3252:1: rule__Background__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__Background__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3256:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3257:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3257:2: ( ruleStatement )
            // InternalSheepDog.g:3258:3: ruleStatement
            {
             before(grammarAccess.getBackgroundAccess().getStatementsStatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getStatementsStatementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__StatementsAssignment_4"


    // $ANTLR start "rule__Background__StepsAssignment_5"
    // InternalSheepDog.g:3267:1: rule__Background__StepsAssignment_5 : ( ruleStep ) ;
    public final void rule__Background__StepsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3271:1: ( ( ruleStep ) )
            // InternalSheepDog.g:3272:2: ( ruleStep )
            {
            // InternalSheepDog.g:3272:2: ( ruleStep )
            // InternalSheepDog.g:3273:3: ruleStep
            {
             before(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__StepsAssignment_5"


    // $ANTLR start "rule__Scenario__TagsAssignment_0"
    // InternalSheepDog.g:3282:1: rule__Scenario__TagsAssignment_0 : ( ruleTags ) ;
    public final void rule__Scenario__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3286:1: ( ( ruleTags ) )
            // InternalSheepDog.g:3287:2: ( ruleTags )
            {
            // InternalSheepDog.g:3287:2: ( ruleTags )
            // InternalSheepDog.g:3288:3: ruleTags
            {
             before(grammarAccess.getScenarioAccess().getTagsTagsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTags();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getTagsTagsParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalSheepDog.g:3297:1: rule__Scenario__NameAssignment_3 : ( ruleTitle ) ;
    public final void rule__Scenario__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3301:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3302:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3302:2: ( ruleTitle )
            // InternalSheepDog.g:3303:3: ruleTitle
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


    // $ANTLR start "rule__Scenario__StatementsAssignment_4"
    // InternalSheepDog.g:3312:1: rule__Scenario__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__Scenario__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3316:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3317:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3317:2: ( ruleStatement )
            // InternalSheepDog.g:3318:3: ruleStatement
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
    // InternalSheepDog.g:3327:1: rule__Scenario__StepsAssignment_5 : ( ruleStep ) ;
    public final void rule__Scenario__StepsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3331:1: ( ( ruleStep ) )
            // InternalSheepDog.g:3332:2: ( ruleStep )
            {
            // InternalSheepDog.g:3332:2: ( ruleStep )
            // InternalSheepDog.g:3333:3: ruleStep
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
    // InternalSheepDog.g:3342:1: rule__Scenario__ExamplesAssignment_6 : ( ruleExamples ) ;
    public final void rule__Scenario__ExamplesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3346:1: ( ( ruleExamples ) )
            // InternalSheepDog.g:3347:2: ( ruleExamples )
            {
            // InternalSheepDog.g:3347:2: ( ruleExamples )
            // InternalSheepDog.g:3348:3: ruleExamples
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


    // $ANTLR start "rule__Examples__TagsAssignment_0"
    // InternalSheepDog.g:3357:1: rule__Examples__TagsAssignment_0 : ( ruleTags ) ;
    public final void rule__Examples__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3361:1: ( ( ruleTags ) )
            // InternalSheepDog.g:3362:2: ( ruleTags )
            {
            // InternalSheepDog.g:3362:2: ( ruleTags )
            // InternalSheepDog.g:3363:3: ruleTags
            {
             before(grammarAccess.getExamplesAccess().getTagsTagsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTags();

            state._fsp--;

             after(grammarAccess.getExamplesAccess().getTagsTagsParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalSheepDog.g:3372:1: rule__Examples__NameAssignment_3 : ( ruleTitle ) ;
    public final void rule__Examples__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3376:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3377:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3377:2: ( ruleTitle )
            // InternalSheepDog.g:3378:3: ruleTitle
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


    // $ANTLR start "rule__Examples__StatementsAssignment_4"
    // InternalSheepDog.g:3387:1: rule__Examples__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__Examples__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3391:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3392:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3392:2: ( ruleStatement )
            // InternalSheepDog.g:3393:3: ruleStatement
            {
             before(grammarAccess.getExamplesAccess().getStatementsStatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getExamplesAccess().getStatementsStatementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__StatementsAssignment_4"


    // $ANTLR start "rule__Examples__TheExamplesTableAssignment_5"
    // InternalSheepDog.g:3402:1: rule__Examples__TheExamplesTableAssignment_5 : ( ruleTable ) ;
    public final void rule__Examples__TheExamplesTableAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3406:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3407:2: ( ruleTable )
            {
            // InternalSheepDog.g:3407:2: ( ruleTable )
            // InternalSheepDog.g:3408:3: ruleTable
            {
             before(grammarAccess.getExamplesAccess().getTheExamplesTableTableParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getExamplesAccess().getTheExamplesTableTableParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__TheExamplesTableAssignment_5"


    // $ANTLR start "rule__Given__NameAssignment_2"
    // InternalSheepDog.g:3417:1: rule__Given__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__Given__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3421:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3422:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3422:2: ( ruleTitle )
            // InternalSheepDog.g:3423:3: ruleTitle
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


    // $ANTLR start "rule__Given__TheStepTableAssignment_3_0"
    // InternalSheepDog.g:3432:1: rule__Given__TheStepTableAssignment_3_0 : ( ruleTable ) ;
    public final void rule__Given__TheStepTableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3436:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3437:2: ( ruleTable )
            {
            // InternalSheepDog.g:3437:2: ( ruleTable )
            // InternalSheepDog.g:3438:3: ruleTable
            {
             before(grammarAccess.getGivenAccess().getTheStepTableTableParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getGivenAccess().getTheStepTableTableParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Given__TheStepTableAssignment_3_0"


    // $ANTLR start "rule__Given__TheDocStringAssignment_3_1"
    // InternalSheepDog.g:3447:1: rule__Given__TheDocStringAssignment_3_1 : ( ruleDocString ) ;
    public final void rule__Given__TheDocStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3451:1: ( ( ruleDocString ) )
            // InternalSheepDog.g:3452:2: ( ruleDocString )
            {
            // InternalSheepDog.g:3452:2: ( ruleDocString )
            // InternalSheepDog.g:3453:3: ruleDocString
            {
             before(grammarAccess.getGivenAccess().getTheDocStringDocStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDocString();

            state._fsp--;

             after(grammarAccess.getGivenAccess().getTheDocStringDocStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Given__TheDocStringAssignment_3_1"


    // $ANTLR start "rule__When__NameAssignment_2"
    // InternalSheepDog.g:3462:1: rule__When__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__When__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3466:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3467:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3467:2: ( ruleTitle )
            // InternalSheepDog.g:3468:3: ruleTitle
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


    // $ANTLR start "rule__When__TheStepTableAssignment_3_0"
    // InternalSheepDog.g:3477:1: rule__When__TheStepTableAssignment_3_0 : ( ruleTable ) ;
    public final void rule__When__TheStepTableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3481:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3482:2: ( ruleTable )
            {
            // InternalSheepDog.g:3482:2: ( ruleTable )
            // InternalSheepDog.g:3483:3: ruleTable
            {
             before(grammarAccess.getWhenAccess().getTheStepTableTableParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getWhenAccess().getTheStepTableTableParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__TheStepTableAssignment_3_0"


    // $ANTLR start "rule__When__TheDocStringAssignment_3_1"
    // InternalSheepDog.g:3492:1: rule__When__TheDocStringAssignment_3_1 : ( ruleDocString ) ;
    public final void rule__When__TheDocStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3496:1: ( ( ruleDocString ) )
            // InternalSheepDog.g:3497:2: ( ruleDocString )
            {
            // InternalSheepDog.g:3497:2: ( ruleDocString )
            // InternalSheepDog.g:3498:3: ruleDocString
            {
             before(grammarAccess.getWhenAccess().getTheDocStringDocStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDocString();

            state._fsp--;

             after(grammarAccess.getWhenAccess().getTheDocStringDocStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__TheDocStringAssignment_3_1"


    // $ANTLR start "rule__Then__NameAssignment_2"
    // InternalSheepDog.g:3507:1: rule__Then__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__Then__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3511:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3512:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3512:2: ( ruleTitle )
            // InternalSheepDog.g:3513:3: ruleTitle
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


    // $ANTLR start "rule__Then__TheStepTableAssignment_3_0"
    // InternalSheepDog.g:3522:1: rule__Then__TheStepTableAssignment_3_0 : ( ruleTable ) ;
    public final void rule__Then__TheStepTableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3526:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3527:2: ( ruleTable )
            {
            // InternalSheepDog.g:3527:2: ( ruleTable )
            // InternalSheepDog.g:3528:3: ruleTable
            {
             before(grammarAccess.getThenAccess().getTheStepTableTableParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getThenAccess().getTheStepTableTableParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__TheStepTableAssignment_3_0"


    // $ANTLR start "rule__Then__TheDocStringAssignment_3_1"
    // InternalSheepDog.g:3537:1: rule__Then__TheDocStringAssignment_3_1 : ( ruleDocString ) ;
    public final void rule__Then__TheDocStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3541:1: ( ( ruleDocString ) )
            // InternalSheepDog.g:3542:2: ( ruleDocString )
            {
            // InternalSheepDog.g:3542:2: ( ruleDocString )
            // InternalSheepDog.g:3543:3: ruleDocString
            {
             before(grammarAccess.getThenAccess().getTheDocStringDocStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDocString();

            state._fsp--;

             after(grammarAccess.getThenAccess().getTheDocStringDocStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__TheDocStringAssignment_3_1"


    // $ANTLR start "rule__And__NameAssignment_2"
    // InternalSheepDog.g:3552:1: rule__And__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__And__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3556:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3557:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3557:2: ( ruleTitle )
            // InternalSheepDog.g:3558:3: ruleTitle
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


    // $ANTLR start "rule__And__TheStepTableAssignment_3_0"
    // InternalSheepDog.g:3567:1: rule__And__TheStepTableAssignment_3_0 : ( ruleTable ) ;
    public final void rule__And__TheStepTableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3571:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3572:2: ( ruleTable )
            {
            // InternalSheepDog.g:3572:2: ( ruleTable )
            // InternalSheepDog.g:3573:3: ruleTable
            {
             before(grammarAccess.getAndAccess().getTheStepTableTableParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getAndAccess().getTheStepTableTableParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__TheStepTableAssignment_3_0"


    // $ANTLR start "rule__And__TheDocStringAssignment_3_1"
    // InternalSheepDog.g:3582:1: rule__And__TheDocStringAssignment_3_1 : ( ruleDocString ) ;
    public final void rule__And__TheDocStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3586:1: ( ( ruleDocString ) )
            // InternalSheepDog.g:3587:2: ( ruleDocString )
            {
            // InternalSheepDog.g:3587:2: ( ruleDocString )
            // InternalSheepDog.g:3588:3: ruleDocString
            {
             before(grammarAccess.getAndAccess().getTheDocStringDocStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDocString();

            state._fsp--;

             after(grammarAccess.getAndAccess().getTheDocStringDocStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__TheDocStringAssignment_3_1"


    // $ANTLR start "rule__DocString__LinesAssignment_2"
    // InternalSheepDog.g:3597:1: rule__DocString__LinesAssignment_2 : ( ruleLine ) ;
    public final void rule__DocString__LinesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3601:1: ( ( ruleLine ) )
            // InternalSheepDog.g:3602:2: ( ruleLine )
            {
            // InternalSheepDog.g:3602:2: ( ruleLine )
            // InternalSheepDog.g:3603:3: ruleLine
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


    // $ANTLR start "rule__Table__RowsAssignment_4"
    // InternalSheepDog.g:3612:1: rule__Table__RowsAssignment_4 : ( ruleRow ) ;
    public final void rule__Table__RowsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3616:1: ( ( ruleRow ) )
            // InternalSheepDog.g:3617:2: ( ruleRow )
            {
            // InternalSheepDog.g:3617:2: ( ruleRow )
            // InternalSheepDog.g:3618:3: ruleRow
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
    // InternalSheepDog.g:3627:1: rule__Row__CellsAssignment_0 : ( ruleCell ) ;
    public final void rule__Row__CellsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3631:1: ( ( ruleCell ) )
            // InternalSheepDog.g:3632:2: ( ruleCell )
            {
            // InternalSheepDog.g:3632:2: ( ruleCell )
            // InternalSheepDog.g:3633:3: ruleCell
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

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\14\1\4\1\21\3\4\2\uffff\3\4\1\7\1\14";
    static final String dfa_3s = "\1\33\1\6\1\22\3\34\2\uffff\3\34\1\7\1\14";
    static final String dfa_4s = "\6\uffff\1\1\1\2\5\uffff";
    static final String dfa_5s = "\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\16\uffff\1\1",
            "\1\3\1\4\1\5",
            "\1\6\1\7",
            "\1\10\1\11\1\12\25\uffff\1\13",
            "\1\10\1\11\1\12\25\uffff\1\13",
            "\1\10\1\11\1\12\25\uffff\1\13",
            "",
            "",
            "\1\10\1\11\1\12\25\uffff\1\13",
            "\1\10\1\11\1\12\25\uffff\1\13",
            "\1\10\1\11\1\12\25\uffff\1\13",
            "\1\14",
            "\1\2"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "648:1: rule__AbstractScenario__Alternatives : ( ( ruleBackground ) | ( ruleScenario ) );";
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\1\13\uffff";
    static final String dfa_9s = "\1\14\1\uffff\1\4\1\uffff\6\4\1\7\1\14";
    static final String dfa_10s = "\1\33\1\uffff\1\6\1\uffff\6\34\1\7\1\16";
    static final String dfa_11s = "\1\uffff\1\2\1\uffff\1\1\10\uffff";
    static final String dfa_12s = "\14\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\1\uffff\1\3\14\uffff\1\2",
            "",
            "\1\4\1\5\1\6",
            "",
            "\1\7\1\10\1\11\25\uffff\1\12",
            "\1\7\1\10\1\11\25\uffff\1\12",
            "\1\7\1\10\1\11\25\uffff\1\12",
            "\1\7\1\10\1\11\25\uffff\1\12",
            "\1\7\1\10\1\11\25\uffff\1\12",
            "\1\7\1\10\1\11\25\uffff\1\12",
            "\1\13",
            "\1\1\1\uffff\1\3"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 1695:2: ( rule__Scenario__ExamplesAssignment_6 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004070L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000070L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008001070L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008001002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008001000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008004070L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008004002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000003000070L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000010000000L});

}
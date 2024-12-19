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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_TAGWORD", "RULE_WORD", "RULE_CELLWORD", "RULE_WS", "RULE_SL_COMMENT", "'='", "'Object:'", "'=='", "'Definition:'", "'==='", "'Parameters:'", "'Feature:'", "'Background:'", "'Scenario:'", "'Examples:'", "'Given'", "'When'", "'Then'", "'And'", "'----'", "'[options=\"header\"]'", "'|==='", "'[tags=\"'", "'\"]'", "'|'"
    };
    public static final int RULE_CELLWORD=7;
    public static final int RULE_WORD=6;
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
    public static final int RULE_EOL=4;
    public static final int RULE_WS=8;
    public static final int RULE_TAGWORD=5;
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


    // $ANTLR start "rule__Model__Alternatives"
    // InternalSheepDog.g:602:1: rule__Model__Alternatives : ( ( ruleStepObject ) | ( ruleFeature ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:606:1: ( ( ruleStepObject ) | ( ruleFeature ) )
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
                    // InternalSheepDog.g:607:2: ( ruleStepObject )
                    {
                    // InternalSheepDog.g:607:2: ( ruleStepObject )
                    // InternalSheepDog.g:608:3: ruleStepObject
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
                    // InternalSheepDog.g:613:2: ( ruleFeature )
                    {
                    // InternalSheepDog.g:613:2: ( ruleFeature )
                    // InternalSheepDog.g:614:3: ruleFeature
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
    // InternalSheepDog.g:623:1: rule__AbstractScenario__Alternatives : ( ( ruleBackground ) | ( ruleScenario ) );
    public final void rule__AbstractScenario__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:627:1: ( ( ruleBackground ) | ( ruleScenario ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalSheepDog.g:628:2: ( ruleBackground )
                    {
                    // InternalSheepDog.g:628:2: ( ruleBackground )
                    // InternalSheepDog.g:629:3: ruleBackground
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
                    // InternalSheepDog.g:634:2: ( ruleScenario )
                    {
                    // InternalSheepDog.g:634:2: ( ruleScenario )
                    // InternalSheepDog.g:635:3: ruleScenario
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
    // InternalSheepDog.g:644:1: rule__Step__Alternatives : ( ( ruleGiven ) | ( ruleWhen ) | ( ruleThen ) | ( ruleAnd ) );
    public final void rule__Step__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:648:1: ( ( ruleGiven ) | ( ruleWhen ) | ( ruleThen ) | ( ruleAnd ) )
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
                    // InternalSheepDog.g:649:2: ( ruleGiven )
                    {
                    // InternalSheepDog.g:649:2: ( ruleGiven )
                    // InternalSheepDog.g:650:3: ruleGiven
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
                    // InternalSheepDog.g:655:2: ( ruleWhen )
                    {
                    // InternalSheepDog.g:655:2: ( ruleWhen )
                    // InternalSheepDog.g:656:3: ruleWhen
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
                    // InternalSheepDog.g:661:2: ( ruleThen )
                    {
                    // InternalSheepDog.g:661:2: ( ruleThen )
                    // InternalSheepDog.g:662:3: ruleThen
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
                    // InternalSheepDog.g:667:2: ( ruleAnd )
                    {
                    // InternalSheepDog.g:667:2: ( ruleAnd )
                    // InternalSheepDog.g:668:3: ruleAnd
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
    // InternalSheepDog.g:677:1: rule__Given__Alternatives_3 : ( ( ( rule__Given__TheStepTableAssignment_3_0 ) ) | ( ( rule__Given__TheDocStringAssignment_3_1 ) ) );
    public final void rule__Given__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:681:1: ( ( ( rule__Given__TheStepTableAssignment_3_0 ) ) | ( ( rule__Given__TheDocStringAssignment_3_1 ) ) )
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
                    // InternalSheepDog.g:682:2: ( ( rule__Given__TheStepTableAssignment_3_0 ) )
                    {
                    // InternalSheepDog.g:682:2: ( ( rule__Given__TheStepTableAssignment_3_0 ) )
                    // InternalSheepDog.g:683:3: ( rule__Given__TheStepTableAssignment_3_0 )
                    {
                     before(grammarAccess.getGivenAccess().getTheStepTableAssignment_3_0()); 
                    // InternalSheepDog.g:684:3: ( rule__Given__TheStepTableAssignment_3_0 )
                    // InternalSheepDog.g:684:4: rule__Given__TheStepTableAssignment_3_0
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
                    // InternalSheepDog.g:688:2: ( ( rule__Given__TheDocStringAssignment_3_1 ) )
                    {
                    // InternalSheepDog.g:688:2: ( ( rule__Given__TheDocStringAssignment_3_1 ) )
                    // InternalSheepDog.g:689:3: ( rule__Given__TheDocStringAssignment_3_1 )
                    {
                     before(grammarAccess.getGivenAccess().getTheDocStringAssignment_3_1()); 
                    // InternalSheepDog.g:690:3: ( rule__Given__TheDocStringAssignment_3_1 )
                    // InternalSheepDog.g:690:4: rule__Given__TheDocStringAssignment_3_1
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
    // InternalSheepDog.g:698:1: rule__When__Alternatives_3 : ( ( ( rule__When__TheStepTableAssignment_3_0 ) ) | ( ( rule__When__TheDocStringAssignment_3_1 ) ) );
    public final void rule__When__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:702:1: ( ( ( rule__When__TheStepTableAssignment_3_0 ) ) | ( ( rule__When__TheDocStringAssignment_3_1 ) ) )
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
                    // InternalSheepDog.g:703:2: ( ( rule__When__TheStepTableAssignment_3_0 ) )
                    {
                    // InternalSheepDog.g:703:2: ( ( rule__When__TheStepTableAssignment_3_0 ) )
                    // InternalSheepDog.g:704:3: ( rule__When__TheStepTableAssignment_3_0 )
                    {
                     before(grammarAccess.getWhenAccess().getTheStepTableAssignment_3_0()); 
                    // InternalSheepDog.g:705:3: ( rule__When__TheStepTableAssignment_3_0 )
                    // InternalSheepDog.g:705:4: rule__When__TheStepTableAssignment_3_0
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
                    // InternalSheepDog.g:709:2: ( ( rule__When__TheDocStringAssignment_3_1 ) )
                    {
                    // InternalSheepDog.g:709:2: ( ( rule__When__TheDocStringAssignment_3_1 ) )
                    // InternalSheepDog.g:710:3: ( rule__When__TheDocStringAssignment_3_1 )
                    {
                     before(grammarAccess.getWhenAccess().getTheDocStringAssignment_3_1()); 
                    // InternalSheepDog.g:711:3: ( rule__When__TheDocStringAssignment_3_1 )
                    // InternalSheepDog.g:711:4: rule__When__TheDocStringAssignment_3_1
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
    // InternalSheepDog.g:719:1: rule__Then__Alternatives_3 : ( ( ( rule__Then__TheStepTableAssignment_3_0 ) ) | ( ( rule__Then__TheDocStringAssignment_3_1 ) ) );
    public final void rule__Then__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:723:1: ( ( ( rule__Then__TheStepTableAssignment_3_0 ) ) | ( ( rule__Then__TheDocStringAssignment_3_1 ) ) )
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
                    // InternalSheepDog.g:724:2: ( ( rule__Then__TheStepTableAssignment_3_0 ) )
                    {
                    // InternalSheepDog.g:724:2: ( ( rule__Then__TheStepTableAssignment_3_0 ) )
                    // InternalSheepDog.g:725:3: ( rule__Then__TheStepTableAssignment_3_0 )
                    {
                     before(grammarAccess.getThenAccess().getTheStepTableAssignment_3_0()); 
                    // InternalSheepDog.g:726:3: ( rule__Then__TheStepTableAssignment_3_0 )
                    // InternalSheepDog.g:726:4: rule__Then__TheStepTableAssignment_3_0
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
                    // InternalSheepDog.g:730:2: ( ( rule__Then__TheDocStringAssignment_3_1 ) )
                    {
                    // InternalSheepDog.g:730:2: ( ( rule__Then__TheDocStringAssignment_3_1 ) )
                    // InternalSheepDog.g:731:3: ( rule__Then__TheDocStringAssignment_3_1 )
                    {
                     before(grammarAccess.getThenAccess().getTheDocStringAssignment_3_1()); 
                    // InternalSheepDog.g:732:3: ( rule__Then__TheDocStringAssignment_3_1 )
                    // InternalSheepDog.g:732:4: rule__Then__TheDocStringAssignment_3_1
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
    // InternalSheepDog.g:740:1: rule__And__Alternatives_3 : ( ( ( rule__And__TheStepTableAssignment_3_0 ) ) | ( ( rule__And__TheDocStringAssignment_3_1 ) ) );
    public final void rule__And__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:744:1: ( ( ( rule__And__TheStepTableAssignment_3_0 ) ) | ( ( rule__And__TheDocStringAssignment_3_1 ) ) )
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
                    // InternalSheepDog.g:745:2: ( ( rule__And__TheStepTableAssignment_3_0 ) )
                    {
                    // InternalSheepDog.g:745:2: ( ( rule__And__TheStepTableAssignment_3_0 ) )
                    // InternalSheepDog.g:746:3: ( rule__And__TheStepTableAssignment_3_0 )
                    {
                     before(grammarAccess.getAndAccess().getTheStepTableAssignment_3_0()); 
                    // InternalSheepDog.g:747:3: ( rule__And__TheStepTableAssignment_3_0 )
                    // InternalSheepDog.g:747:4: rule__And__TheStepTableAssignment_3_0
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
                    // InternalSheepDog.g:751:2: ( ( rule__And__TheDocStringAssignment_3_1 ) )
                    {
                    // InternalSheepDog.g:751:2: ( ( rule__And__TheDocStringAssignment_3_1 ) )
                    // InternalSheepDog.g:752:3: ( rule__And__TheDocStringAssignment_3_1 )
                    {
                     before(grammarAccess.getAndAccess().getTheDocStringAssignment_3_1()); 
                    // InternalSheepDog.g:753:3: ( rule__And__TheDocStringAssignment_3_1 )
                    // InternalSheepDog.g:753:4: rule__And__TheDocStringAssignment_3_1
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


    // $ANTLR start "rule__StepObject__Group__0"
    // InternalSheepDog.g:761:1: rule__StepObject__Group__0 : rule__StepObject__Group__0__Impl rule__StepObject__Group__1 ;
    public final void rule__StepObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:765:1: ( rule__StepObject__Group__0__Impl rule__StepObject__Group__1 )
            // InternalSheepDog.g:766:2: rule__StepObject__Group__0__Impl rule__StepObject__Group__1
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
    // InternalSheepDog.g:773:1: rule__StepObject__Group__0__Impl : ( '=' ) ;
    public final void rule__StepObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:777:1: ( ( '=' ) )
            // InternalSheepDog.g:778:1: ( '=' )
            {
            // InternalSheepDog.g:778:1: ( '=' )
            // InternalSheepDog.g:779:2: '='
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
    // InternalSheepDog.g:788:1: rule__StepObject__Group__1 : rule__StepObject__Group__1__Impl rule__StepObject__Group__2 ;
    public final void rule__StepObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:792:1: ( rule__StepObject__Group__1__Impl rule__StepObject__Group__2 )
            // InternalSheepDog.g:793:2: rule__StepObject__Group__1__Impl rule__StepObject__Group__2
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
    // InternalSheepDog.g:800:1: rule__StepObject__Group__1__Impl : ( 'Object:' ) ;
    public final void rule__StepObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:804:1: ( ( 'Object:' ) )
            // InternalSheepDog.g:805:1: ( 'Object:' )
            {
            // InternalSheepDog.g:805:1: ( 'Object:' )
            // InternalSheepDog.g:806:2: 'Object:'
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
    // InternalSheepDog.g:815:1: rule__StepObject__Group__2 : rule__StepObject__Group__2__Impl rule__StepObject__Group__3 ;
    public final void rule__StepObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:819:1: ( rule__StepObject__Group__2__Impl rule__StepObject__Group__3 )
            // InternalSheepDog.g:820:2: rule__StepObject__Group__2__Impl rule__StepObject__Group__3
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
    // InternalSheepDog.g:827:1: rule__StepObject__Group__2__Impl : ( ( rule__StepObject__NameAssignment_2 ) ) ;
    public final void rule__StepObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:831:1: ( ( ( rule__StepObject__NameAssignment_2 ) ) )
            // InternalSheepDog.g:832:1: ( ( rule__StepObject__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:832:1: ( ( rule__StepObject__NameAssignment_2 ) )
            // InternalSheepDog.g:833:2: ( rule__StepObject__NameAssignment_2 )
            {
             before(grammarAccess.getStepObjectAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:834:2: ( rule__StepObject__NameAssignment_2 )
            // InternalSheepDog.g:834:3: rule__StepObject__NameAssignment_2
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
    // InternalSheepDog.g:842:1: rule__StepObject__Group__3 : rule__StepObject__Group__3__Impl rule__StepObject__Group__4 ;
    public final void rule__StepObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:846:1: ( rule__StepObject__Group__3__Impl rule__StepObject__Group__4 )
            // InternalSheepDog.g:847:2: rule__StepObject__Group__3__Impl rule__StepObject__Group__4
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
    // InternalSheepDog.g:854:1: rule__StepObject__Group__3__Impl : ( ( rule__StepObject__StatementsAssignment_3 )* ) ;
    public final void rule__StepObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:858:1: ( ( ( rule__StepObject__StatementsAssignment_3 )* ) )
            // InternalSheepDog.g:859:1: ( ( rule__StepObject__StatementsAssignment_3 )* )
            {
            // InternalSheepDog.g:859:1: ( ( rule__StepObject__StatementsAssignment_3 )* )
            // InternalSheepDog.g:860:2: ( rule__StepObject__StatementsAssignment_3 )*
            {
             before(grammarAccess.getStepObjectAccess().getStatementsAssignment_3()); 
            // InternalSheepDog.g:861:2: ( rule__StepObject__StatementsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_WORD) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSheepDog.g:861:3: rule__StepObject__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__StepObject__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalSheepDog.g:869:1: rule__StepObject__Group__4 : rule__StepObject__Group__4__Impl ;
    public final void rule__StepObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:873:1: ( rule__StepObject__Group__4__Impl )
            // InternalSheepDog.g:874:2: rule__StepObject__Group__4__Impl
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
    // InternalSheepDog.g:880:1: rule__StepObject__Group__4__Impl : ( ( rule__StepObject__StepDefinitionsAssignment_4 )* ) ;
    public final void rule__StepObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:884:1: ( ( ( rule__StepObject__StepDefinitionsAssignment_4 )* ) )
            // InternalSheepDog.g:885:1: ( ( rule__StepObject__StepDefinitionsAssignment_4 )* )
            {
            // InternalSheepDog.g:885:1: ( ( rule__StepObject__StepDefinitionsAssignment_4 )* )
            // InternalSheepDog.g:886:2: ( rule__StepObject__StepDefinitionsAssignment_4 )*
            {
             before(grammarAccess.getStepObjectAccess().getStepDefinitionsAssignment_4()); 
            // InternalSheepDog.g:887:2: ( rule__StepObject__StepDefinitionsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==12) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSheepDog.g:887:3: rule__StepObject__StepDefinitionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__StepObject__StepDefinitionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalSheepDog.g:896:1: rule__StepDefinition__Group__0 : rule__StepDefinition__Group__0__Impl rule__StepDefinition__Group__1 ;
    public final void rule__StepDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:900:1: ( rule__StepDefinition__Group__0__Impl rule__StepDefinition__Group__1 )
            // InternalSheepDog.g:901:2: rule__StepDefinition__Group__0__Impl rule__StepDefinition__Group__1
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
    // InternalSheepDog.g:908:1: rule__StepDefinition__Group__0__Impl : ( '==' ) ;
    public final void rule__StepDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:912:1: ( ( '==' ) )
            // InternalSheepDog.g:913:1: ( '==' )
            {
            // InternalSheepDog.g:913:1: ( '==' )
            // InternalSheepDog.g:914:2: '=='
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
    // InternalSheepDog.g:923:1: rule__StepDefinition__Group__1 : rule__StepDefinition__Group__1__Impl rule__StepDefinition__Group__2 ;
    public final void rule__StepDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:927:1: ( rule__StepDefinition__Group__1__Impl rule__StepDefinition__Group__2 )
            // InternalSheepDog.g:928:2: rule__StepDefinition__Group__1__Impl rule__StepDefinition__Group__2
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
    // InternalSheepDog.g:935:1: rule__StepDefinition__Group__1__Impl : ( 'Definition:' ) ;
    public final void rule__StepDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:939:1: ( ( 'Definition:' ) )
            // InternalSheepDog.g:940:1: ( 'Definition:' )
            {
            // InternalSheepDog.g:940:1: ( 'Definition:' )
            // InternalSheepDog.g:941:2: 'Definition:'
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
    // InternalSheepDog.g:950:1: rule__StepDefinition__Group__2 : rule__StepDefinition__Group__2__Impl rule__StepDefinition__Group__3 ;
    public final void rule__StepDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:954:1: ( rule__StepDefinition__Group__2__Impl rule__StepDefinition__Group__3 )
            // InternalSheepDog.g:955:2: rule__StepDefinition__Group__2__Impl rule__StepDefinition__Group__3
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
    // InternalSheepDog.g:962:1: rule__StepDefinition__Group__2__Impl : ( ( rule__StepDefinition__NameAssignment_2 ) ) ;
    public final void rule__StepDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:966:1: ( ( ( rule__StepDefinition__NameAssignment_2 ) ) )
            // InternalSheepDog.g:967:1: ( ( rule__StepDefinition__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:967:1: ( ( rule__StepDefinition__NameAssignment_2 ) )
            // InternalSheepDog.g:968:2: ( rule__StepDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getStepDefinitionAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:969:2: ( rule__StepDefinition__NameAssignment_2 )
            // InternalSheepDog.g:969:3: rule__StepDefinition__NameAssignment_2
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
    // InternalSheepDog.g:977:1: rule__StepDefinition__Group__3 : rule__StepDefinition__Group__3__Impl rule__StepDefinition__Group__4 ;
    public final void rule__StepDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:981:1: ( rule__StepDefinition__Group__3__Impl rule__StepDefinition__Group__4 )
            // InternalSheepDog.g:982:2: rule__StepDefinition__Group__3__Impl rule__StepDefinition__Group__4
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
    // InternalSheepDog.g:989:1: rule__StepDefinition__Group__3__Impl : ( ( rule__StepDefinition__StatementsAssignment_3 )* ) ;
    public final void rule__StepDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:993:1: ( ( ( rule__StepDefinition__StatementsAssignment_3 )* ) )
            // InternalSheepDog.g:994:1: ( ( rule__StepDefinition__StatementsAssignment_3 )* )
            {
            // InternalSheepDog.g:994:1: ( ( rule__StepDefinition__StatementsAssignment_3 )* )
            // InternalSheepDog.g:995:2: ( rule__StepDefinition__StatementsAssignment_3 )*
            {
             before(grammarAccess.getStepDefinitionAccess().getStatementsAssignment_3()); 
            // InternalSheepDog.g:996:2: ( rule__StepDefinition__StatementsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_WORD) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSheepDog.g:996:3: rule__StepDefinition__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__StepDefinition__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalSheepDog.g:1004:1: rule__StepDefinition__Group__4 : rule__StepDefinition__Group__4__Impl ;
    public final void rule__StepDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1008:1: ( rule__StepDefinition__Group__4__Impl )
            // InternalSheepDog.g:1009:2: rule__StepDefinition__Group__4__Impl
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
    // InternalSheepDog.g:1015:1: rule__StepDefinition__Group__4__Impl : ( ( rule__StepDefinition__StepParametersAssignment_4 )* ) ;
    public final void rule__StepDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1019:1: ( ( ( rule__StepDefinition__StepParametersAssignment_4 )* ) )
            // InternalSheepDog.g:1020:1: ( ( rule__StepDefinition__StepParametersAssignment_4 )* )
            {
            // InternalSheepDog.g:1020:1: ( ( rule__StepDefinition__StepParametersAssignment_4 )* )
            // InternalSheepDog.g:1021:2: ( rule__StepDefinition__StepParametersAssignment_4 )*
            {
             before(grammarAccess.getStepDefinitionAccess().getStepParametersAssignment_4()); 
            // InternalSheepDog.g:1022:2: ( rule__StepDefinition__StepParametersAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSheepDog.g:1022:3: rule__StepDefinition__StepParametersAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__StepDefinition__StepParametersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalSheepDog.g:1031:1: rule__StepParameters__Group__0 : rule__StepParameters__Group__0__Impl rule__StepParameters__Group__1 ;
    public final void rule__StepParameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1035:1: ( rule__StepParameters__Group__0__Impl rule__StepParameters__Group__1 )
            // InternalSheepDog.g:1036:2: rule__StepParameters__Group__0__Impl rule__StepParameters__Group__1
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
    // InternalSheepDog.g:1043:1: rule__StepParameters__Group__0__Impl : ( '===' ) ;
    public final void rule__StepParameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1047:1: ( ( '===' ) )
            // InternalSheepDog.g:1048:1: ( '===' )
            {
            // InternalSheepDog.g:1048:1: ( '===' )
            // InternalSheepDog.g:1049:2: '==='
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
    // InternalSheepDog.g:1058:1: rule__StepParameters__Group__1 : rule__StepParameters__Group__1__Impl rule__StepParameters__Group__2 ;
    public final void rule__StepParameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1062:1: ( rule__StepParameters__Group__1__Impl rule__StepParameters__Group__2 )
            // InternalSheepDog.g:1063:2: rule__StepParameters__Group__1__Impl rule__StepParameters__Group__2
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
    // InternalSheepDog.g:1070:1: rule__StepParameters__Group__1__Impl : ( 'Parameters:' ) ;
    public final void rule__StepParameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1074:1: ( ( 'Parameters:' ) )
            // InternalSheepDog.g:1075:1: ( 'Parameters:' )
            {
            // InternalSheepDog.g:1075:1: ( 'Parameters:' )
            // InternalSheepDog.g:1076:2: 'Parameters:'
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
    // InternalSheepDog.g:1085:1: rule__StepParameters__Group__2 : rule__StepParameters__Group__2__Impl rule__StepParameters__Group__3 ;
    public final void rule__StepParameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1089:1: ( rule__StepParameters__Group__2__Impl rule__StepParameters__Group__3 )
            // InternalSheepDog.g:1090:2: rule__StepParameters__Group__2__Impl rule__StepParameters__Group__3
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
    // InternalSheepDog.g:1097:1: rule__StepParameters__Group__2__Impl : ( ( rule__StepParameters__NameAssignment_2 ) ) ;
    public final void rule__StepParameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1101:1: ( ( ( rule__StepParameters__NameAssignment_2 ) ) )
            // InternalSheepDog.g:1102:1: ( ( rule__StepParameters__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:1102:1: ( ( rule__StepParameters__NameAssignment_2 ) )
            // InternalSheepDog.g:1103:2: ( rule__StepParameters__NameAssignment_2 )
            {
             before(grammarAccess.getStepParametersAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:1104:2: ( rule__StepParameters__NameAssignment_2 )
            // InternalSheepDog.g:1104:3: rule__StepParameters__NameAssignment_2
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
    // InternalSheepDog.g:1112:1: rule__StepParameters__Group__3 : rule__StepParameters__Group__3__Impl rule__StepParameters__Group__4 ;
    public final void rule__StepParameters__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1116:1: ( rule__StepParameters__Group__3__Impl rule__StepParameters__Group__4 )
            // InternalSheepDog.g:1117:2: rule__StepParameters__Group__3__Impl rule__StepParameters__Group__4
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
    // InternalSheepDog.g:1124:1: rule__StepParameters__Group__3__Impl : ( ( rule__StepParameters__StatementsAssignment_3 )* ) ;
    public final void rule__StepParameters__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1128:1: ( ( ( rule__StepParameters__StatementsAssignment_3 )* ) )
            // InternalSheepDog.g:1129:1: ( ( rule__StepParameters__StatementsAssignment_3 )* )
            {
            // InternalSheepDog.g:1129:1: ( ( rule__StepParameters__StatementsAssignment_3 )* )
            // InternalSheepDog.g:1130:2: ( rule__StepParameters__StatementsAssignment_3 )*
            {
             before(grammarAccess.getStepParametersAccess().getStatementsAssignment_3()); 
            // InternalSheepDog.g:1131:2: ( rule__StepParameters__StatementsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_WORD) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSheepDog.g:1131:3: rule__StepParameters__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__StepParameters__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalSheepDog.g:1139:1: rule__StepParameters__Group__4 : rule__StepParameters__Group__4__Impl ;
    public final void rule__StepParameters__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1143:1: ( rule__StepParameters__Group__4__Impl )
            // InternalSheepDog.g:1144:2: rule__StepParameters__Group__4__Impl
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
    // InternalSheepDog.g:1150:1: rule__StepParameters__Group__4__Impl : ( ( rule__StepParameters__ParametersTableAssignment_4 ) ) ;
    public final void rule__StepParameters__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1154:1: ( ( ( rule__StepParameters__ParametersTableAssignment_4 ) ) )
            // InternalSheepDog.g:1155:1: ( ( rule__StepParameters__ParametersTableAssignment_4 ) )
            {
            // InternalSheepDog.g:1155:1: ( ( rule__StepParameters__ParametersTableAssignment_4 ) )
            // InternalSheepDog.g:1156:2: ( rule__StepParameters__ParametersTableAssignment_4 )
            {
             before(grammarAccess.getStepParametersAccess().getParametersTableAssignment_4()); 
            // InternalSheepDog.g:1157:2: ( rule__StepParameters__ParametersTableAssignment_4 )
            // InternalSheepDog.g:1157:3: rule__StepParameters__ParametersTableAssignment_4
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
    // InternalSheepDog.g:1166:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1170:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalSheepDog.g:1171:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
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
    // InternalSheepDog.g:1178:1: rule__Feature__Group__0__Impl : ( '=' ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1182:1: ( ( '=' ) )
            // InternalSheepDog.g:1183:1: ( '=' )
            {
            // InternalSheepDog.g:1183:1: ( '=' )
            // InternalSheepDog.g:1184:2: '='
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
    // InternalSheepDog.g:1193:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1197:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalSheepDog.g:1198:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
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
    // InternalSheepDog.g:1205:1: rule__Feature__Group__1__Impl : ( 'Feature:' ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1209:1: ( ( 'Feature:' ) )
            // InternalSheepDog.g:1210:1: ( 'Feature:' )
            {
            // InternalSheepDog.g:1210:1: ( 'Feature:' )
            // InternalSheepDog.g:1211:2: 'Feature:'
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
    // InternalSheepDog.g:1220:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1224:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalSheepDog.g:1225:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
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
    // InternalSheepDog.g:1232:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__NameAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1236:1: ( ( ( rule__Feature__NameAssignment_2 ) ) )
            // InternalSheepDog.g:1237:1: ( ( rule__Feature__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:1237:1: ( ( rule__Feature__NameAssignment_2 ) )
            // InternalSheepDog.g:1238:2: ( rule__Feature__NameAssignment_2 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:1239:2: ( rule__Feature__NameAssignment_2 )
            // InternalSheepDog.g:1239:3: rule__Feature__NameAssignment_2
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
    // InternalSheepDog.g:1247:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1251:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalSheepDog.g:1252:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
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
    // InternalSheepDog.g:1259:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__StatementsAssignment_3 )* ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1263:1: ( ( ( rule__Feature__StatementsAssignment_3 )* ) )
            // InternalSheepDog.g:1264:1: ( ( rule__Feature__StatementsAssignment_3 )* )
            {
            // InternalSheepDog.g:1264:1: ( ( rule__Feature__StatementsAssignment_3 )* )
            // InternalSheepDog.g:1265:2: ( rule__Feature__StatementsAssignment_3 )*
            {
             before(grammarAccess.getFeatureAccess().getStatementsAssignment_3()); 
            // InternalSheepDog.g:1266:2: ( rule__Feature__StatementsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_WORD) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSheepDog.g:1266:3: rule__Feature__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Feature__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalSheepDog.g:1274:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1278:1: ( rule__Feature__Group__4__Impl )
            // InternalSheepDog.g:1279:2: rule__Feature__Group__4__Impl
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
    // InternalSheepDog.g:1285:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__AbstractScenariosAssignment_4 )* ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1289:1: ( ( ( rule__Feature__AbstractScenariosAssignment_4 )* ) )
            // InternalSheepDog.g:1290:1: ( ( rule__Feature__AbstractScenariosAssignment_4 )* )
            {
            // InternalSheepDog.g:1290:1: ( ( rule__Feature__AbstractScenariosAssignment_4 )* )
            // InternalSheepDog.g:1291:2: ( rule__Feature__AbstractScenariosAssignment_4 )*
            {
             before(grammarAccess.getFeatureAccess().getAbstractScenariosAssignment_4()); 
            // InternalSheepDog.g:1292:2: ( rule__Feature__AbstractScenariosAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==12||LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSheepDog.g:1292:3: rule__Feature__AbstractScenariosAssignment_4
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Feature__AbstractScenariosAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalSheepDog.g:1301:1: rule__Background__Group__0 : rule__Background__Group__0__Impl rule__Background__Group__1 ;
    public final void rule__Background__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1305:1: ( rule__Background__Group__0__Impl rule__Background__Group__1 )
            // InternalSheepDog.g:1306:2: rule__Background__Group__0__Impl rule__Background__Group__1
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
    // InternalSheepDog.g:1313:1: rule__Background__Group__0__Impl : ( ( rule__Background__TagsAssignment_0 )? ) ;
    public final void rule__Background__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1317:1: ( ( ( rule__Background__TagsAssignment_0 )? ) )
            // InternalSheepDog.g:1318:1: ( ( rule__Background__TagsAssignment_0 )? )
            {
            // InternalSheepDog.g:1318:1: ( ( rule__Background__TagsAssignment_0 )? )
            // InternalSheepDog.g:1319:2: ( rule__Background__TagsAssignment_0 )?
            {
             before(grammarAccess.getBackgroundAccess().getTagsAssignment_0()); 
            // InternalSheepDog.g:1320:2: ( rule__Background__TagsAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSheepDog.g:1320:3: rule__Background__TagsAssignment_0
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
    // InternalSheepDog.g:1328:1: rule__Background__Group__1 : rule__Background__Group__1__Impl rule__Background__Group__2 ;
    public final void rule__Background__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1332:1: ( rule__Background__Group__1__Impl rule__Background__Group__2 )
            // InternalSheepDog.g:1333:2: rule__Background__Group__1__Impl rule__Background__Group__2
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
    // InternalSheepDog.g:1340:1: rule__Background__Group__1__Impl : ( '==' ) ;
    public final void rule__Background__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1344:1: ( ( '==' ) )
            // InternalSheepDog.g:1345:1: ( '==' )
            {
            // InternalSheepDog.g:1345:1: ( '==' )
            // InternalSheepDog.g:1346:2: '=='
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
    // InternalSheepDog.g:1355:1: rule__Background__Group__2 : rule__Background__Group__2__Impl rule__Background__Group__3 ;
    public final void rule__Background__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1359:1: ( rule__Background__Group__2__Impl rule__Background__Group__3 )
            // InternalSheepDog.g:1360:2: rule__Background__Group__2__Impl rule__Background__Group__3
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
    // InternalSheepDog.g:1367:1: rule__Background__Group__2__Impl : ( 'Background:' ) ;
    public final void rule__Background__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1371:1: ( ( 'Background:' ) )
            // InternalSheepDog.g:1372:1: ( 'Background:' )
            {
            // InternalSheepDog.g:1372:1: ( 'Background:' )
            // InternalSheepDog.g:1373:2: 'Background:'
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
    // InternalSheepDog.g:1382:1: rule__Background__Group__3 : rule__Background__Group__3__Impl rule__Background__Group__4 ;
    public final void rule__Background__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1386:1: ( rule__Background__Group__3__Impl rule__Background__Group__4 )
            // InternalSheepDog.g:1387:2: rule__Background__Group__3__Impl rule__Background__Group__4
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
    // InternalSheepDog.g:1394:1: rule__Background__Group__3__Impl : ( ( rule__Background__NameAssignment_3 ) ) ;
    public final void rule__Background__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1398:1: ( ( ( rule__Background__NameAssignment_3 ) ) )
            // InternalSheepDog.g:1399:1: ( ( rule__Background__NameAssignment_3 ) )
            {
            // InternalSheepDog.g:1399:1: ( ( rule__Background__NameAssignment_3 ) )
            // InternalSheepDog.g:1400:2: ( rule__Background__NameAssignment_3 )
            {
             before(grammarAccess.getBackgroundAccess().getNameAssignment_3()); 
            // InternalSheepDog.g:1401:2: ( rule__Background__NameAssignment_3 )
            // InternalSheepDog.g:1401:3: rule__Background__NameAssignment_3
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
    // InternalSheepDog.g:1409:1: rule__Background__Group__4 : rule__Background__Group__4__Impl rule__Background__Group__5 ;
    public final void rule__Background__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1413:1: ( rule__Background__Group__4__Impl rule__Background__Group__5 )
            // InternalSheepDog.g:1414:2: rule__Background__Group__4__Impl rule__Background__Group__5
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
    // InternalSheepDog.g:1421:1: rule__Background__Group__4__Impl : ( ( rule__Background__StatementsAssignment_4 )* ) ;
    public final void rule__Background__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1425:1: ( ( ( rule__Background__StatementsAssignment_4 )* ) )
            // InternalSheepDog.g:1426:1: ( ( rule__Background__StatementsAssignment_4 )* )
            {
            // InternalSheepDog.g:1426:1: ( ( rule__Background__StatementsAssignment_4 )* )
            // InternalSheepDog.g:1427:2: ( rule__Background__StatementsAssignment_4 )*
            {
             before(grammarAccess.getBackgroundAccess().getStatementsAssignment_4()); 
            // InternalSheepDog.g:1428:2: ( rule__Background__StatementsAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_WORD) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSheepDog.g:1428:3: rule__Background__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Background__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalSheepDog.g:1436:1: rule__Background__Group__5 : rule__Background__Group__5__Impl ;
    public final void rule__Background__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1440:1: ( rule__Background__Group__5__Impl )
            // InternalSheepDog.g:1441:2: rule__Background__Group__5__Impl
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
    // InternalSheepDog.g:1447:1: rule__Background__Group__5__Impl : ( ( rule__Background__StepsAssignment_5 )* ) ;
    public final void rule__Background__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1451:1: ( ( ( rule__Background__StepsAssignment_5 )* ) )
            // InternalSheepDog.g:1452:1: ( ( rule__Background__StepsAssignment_5 )* )
            {
            // InternalSheepDog.g:1452:1: ( ( rule__Background__StepsAssignment_5 )* )
            // InternalSheepDog.g:1453:2: ( rule__Background__StepsAssignment_5 )*
            {
             before(grammarAccess.getBackgroundAccess().getStepsAssignment_5()); 
            // InternalSheepDog.g:1454:2: ( rule__Background__StepsAssignment_5 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==14) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSheepDog.g:1454:3: rule__Background__StepsAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Background__StepsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalSheepDog.g:1463:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1467:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalSheepDog.g:1468:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
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
    // InternalSheepDog.g:1475:1: rule__Scenario__Group__0__Impl : ( ( rule__Scenario__TagsAssignment_0 )? ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1479:1: ( ( ( rule__Scenario__TagsAssignment_0 )? ) )
            // InternalSheepDog.g:1480:1: ( ( rule__Scenario__TagsAssignment_0 )? )
            {
            // InternalSheepDog.g:1480:1: ( ( rule__Scenario__TagsAssignment_0 )? )
            // InternalSheepDog.g:1481:2: ( rule__Scenario__TagsAssignment_0 )?
            {
             before(grammarAccess.getScenarioAccess().getTagsAssignment_0()); 
            // InternalSheepDog.g:1482:2: ( rule__Scenario__TagsAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSheepDog.g:1482:3: rule__Scenario__TagsAssignment_0
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
    // InternalSheepDog.g:1490:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1494:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalSheepDog.g:1495:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
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
    // InternalSheepDog.g:1502:1: rule__Scenario__Group__1__Impl : ( '==' ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1506:1: ( ( '==' ) )
            // InternalSheepDog.g:1507:1: ( '==' )
            {
            // InternalSheepDog.g:1507:1: ( '==' )
            // InternalSheepDog.g:1508:2: '=='
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
    // InternalSheepDog.g:1517:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1521:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // InternalSheepDog.g:1522:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
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
    // InternalSheepDog.g:1529:1: rule__Scenario__Group__2__Impl : ( 'Scenario:' ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1533:1: ( ( 'Scenario:' ) )
            // InternalSheepDog.g:1534:1: ( 'Scenario:' )
            {
            // InternalSheepDog.g:1534:1: ( 'Scenario:' )
            // InternalSheepDog.g:1535:2: 'Scenario:'
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
    // InternalSheepDog.g:1544:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl rule__Scenario__Group__4 ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1548:1: ( rule__Scenario__Group__3__Impl rule__Scenario__Group__4 )
            // InternalSheepDog.g:1549:2: rule__Scenario__Group__3__Impl rule__Scenario__Group__4
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
    // InternalSheepDog.g:1556:1: rule__Scenario__Group__3__Impl : ( ( rule__Scenario__NameAssignment_3 ) ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1560:1: ( ( ( rule__Scenario__NameAssignment_3 ) ) )
            // InternalSheepDog.g:1561:1: ( ( rule__Scenario__NameAssignment_3 ) )
            {
            // InternalSheepDog.g:1561:1: ( ( rule__Scenario__NameAssignment_3 ) )
            // InternalSheepDog.g:1562:2: ( rule__Scenario__NameAssignment_3 )
            {
             before(grammarAccess.getScenarioAccess().getNameAssignment_3()); 
            // InternalSheepDog.g:1563:2: ( rule__Scenario__NameAssignment_3 )
            // InternalSheepDog.g:1563:3: rule__Scenario__NameAssignment_3
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
    // InternalSheepDog.g:1571:1: rule__Scenario__Group__4 : rule__Scenario__Group__4__Impl rule__Scenario__Group__5 ;
    public final void rule__Scenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1575:1: ( rule__Scenario__Group__4__Impl rule__Scenario__Group__5 )
            // InternalSheepDog.g:1576:2: rule__Scenario__Group__4__Impl rule__Scenario__Group__5
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
    // InternalSheepDog.g:1583:1: rule__Scenario__Group__4__Impl : ( ( rule__Scenario__StatementsAssignment_4 )* ) ;
    public final void rule__Scenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1587:1: ( ( ( rule__Scenario__StatementsAssignment_4 )* ) )
            // InternalSheepDog.g:1588:1: ( ( rule__Scenario__StatementsAssignment_4 )* )
            {
            // InternalSheepDog.g:1588:1: ( ( rule__Scenario__StatementsAssignment_4 )* )
            // InternalSheepDog.g:1589:2: ( rule__Scenario__StatementsAssignment_4 )*
            {
             before(grammarAccess.getScenarioAccess().getStatementsAssignment_4()); 
            // InternalSheepDog.g:1590:2: ( rule__Scenario__StatementsAssignment_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_WORD) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSheepDog.g:1590:3: rule__Scenario__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Scenario__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalSheepDog.g:1598:1: rule__Scenario__Group__5 : rule__Scenario__Group__5__Impl rule__Scenario__Group__6 ;
    public final void rule__Scenario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1602:1: ( rule__Scenario__Group__5__Impl rule__Scenario__Group__6 )
            // InternalSheepDog.g:1603:2: rule__Scenario__Group__5__Impl rule__Scenario__Group__6
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
    // InternalSheepDog.g:1610:1: rule__Scenario__Group__5__Impl : ( ( rule__Scenario__StepsAssignment_5 )* ) ;
    public final void rule__Scenario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1614:1: ( ( ( rule__Scenario__StepsAssignment_5 )* ) )
            // InternalSheepDog.g:1615:1: ( ( rule__Scenario__StepsAssignment_5 )* )
            {
            // InternalSheepDog.g:1615:1: ( ( rule__Scenario__StepsAssignment_5 )* )
            // InternalSheepDog.g:1616:2: ( rule__Scenario__StepsAssignment_5 )*
            {
             before(grammarAccess.getScenarioAccess().getStepsAssignment_5()); 
            // InternalSheepDog.g:1617:2: ( rule__Scenario__StepsAssignment_5 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==14) ) {
                    int LA20_2 = input.LA(2);

                    if ( ((LA20_2>=20 && LA20_2<=23)) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // InternalSheepDog.g:1617:3: rule__Scenario__StepsAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Scenario__StepsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalSheepDog.g:1625:1: rule__Scenario__Group__6 : rule__Scenario__Group__6__Impl ;
    public final void rule__Scenario__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1629:1: ( rule__Scenario__Group__6__Impl )
            // InternalSheepDog.g:1630:2: rule__Scenario__Group__6__Impl
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
    // InternalSheepDog.g:1636:1: rule__Scenario__Group__6__Impl : ( ( rule__Scenario__ExamplesAssignment_6 )* ) ;
    public final void rule__Scenario__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1640:1: ( ( ( rule__Scenario__ExamplesAssignment_6 )* ) )
            // InternalSheepDog.g:1641:1: ( ( rule__Scenario__ExamplesAssignment_6 )* )
            {
            // InternalSheepDog.g:1641:1: ( ( rule__Scenario__ExamplesAssignment_6 )* )
            // InternalSheepDog.g:1642:2: ( rule__Scenario__ExamplesAssignment_6 )*
            {
             before(grammarAccess.getScenarioAccess().getExamplesAssignment_6()); 
            // InternalSheepDog.g:1643:2: ( rule__Scenario__ExamplesAssignment_6 )*
            loop21:
            do {
                int alt21=2;
                alt21 = dfa21.predict(input);
                switch (alt21) {
            	case 1 :
            	    // InternalSheepDog.g:1643:3: rule__Scenario__ExamplesAssignment_6
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Scenario__ExamplesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalSheepDog.g:1652:1: rule__Examples__Group__0 : rule__Examples__Group__0__Impl rule__Examples__Group__1 ;
    public final void rule__Examples__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1656:1: ( rule__Examples__Group__0__Impl rule__Examples__Group__1 )
            // InternalSheepDog.g:1657:2: rule__Examples__Group__0__Impl rule__Examples__Group__1
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
    // InternalSheepDog.g:1664:1: rule__Examples__Group__0__Impl : ( ( rule__Examples__TagsAssignment_0 )? ) ;
    public final void rule__Examples__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1668:1: ( ( ( rule__Examples__TagsAssignment_0 )? ) )
            // InternalSheepDog.g:1669:1: ( ( rule__Examples__TagsAssignment_0 )? )
            {
            // InternalSheepDog.g:1669:1: ( ( rule__Examples__TagsAssignment_0 )? )
            // InternalSheepDog.g:1670:2: ( rule__Examples__TagsAssignment_0 )?
            {
             before(grammarAccess.getExamplesAccess().getTagsAssignment_0()); 
            // InternalSheepDog.g:1671:2: ( rule__Examples__TagsAssignment_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSheepDog.g:1671:3: rule__Examples__TagsAssignment_0
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
    // InternalSheepDog.g:1679:1: rule__Examples__Group__1 : rule__Examples__Group__1__Impl rule__Examples__Group__2 ;
    public final void rule__Examples__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1683:1: ( rule__Examples__Group__1__Impl rule__Examples__Group__2 )
            // InternalSheepDog.g:1684:2: rule__Examples__Group__1__Impl rule__Examples__Group__2
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
    // InternalSheepDog.g:1691:1: rule__Examples__Group__1__Impl : ( '===' ) ;
    public final void rule__Examples__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1695:1: ( ( '===' ) )
            // InternalSheepDog.g:1696:1: ( '===' )
            {
            // InternalSheepDog.g:1696:1: ( '===' )
            // InternalSheepDog.g:1697:2: '==='
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
    // InternalSheepDog.g:1706:1: rule__Examples__Group__2 : rule__Examples__Group__2__Impl rule__Examples__Group__3 ;
    public final void rule__Examples__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1710:1: ( rule__Examples__Group__2__Impl rule__Examples__Group__3 )
            // InternalSheepDog.g:1711:2: rule__Examples__Group__2__Impl rule__Examples__Group__3
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
    // InternalSheepDog.g:1718:1: rule__Examples__Group__2__Impl : ( 'Examples:' ) ;
    public final void rule__Examples__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1722:1: ( ( 'Examples:' ) )
            // InternalSheepDog.g:1723:1: ( 'Examples:' )
            {
            // InternalSheepDog.g:1723:1: ( 'Examples:' )
            // InternalSheepDog.g:1724:2: 'Examples:'
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
    // InternalSheepDog.g:1733:1: rule__Examples__Group__3 : rule__Examples__Group__3__Impl rule__Examples__Group__4 ;
    public final void rule__Examples__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1737:1: ( rule__Examples__Group__3__Impl rule__Examples__Group__4 )
            // InternalSheepDog.g:1738:2: rule__Examples__Group__3__Impl rule__Examples__Group__4
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
    // InternalSheepDog.g:1745:1: rule__Examples__Group__3__Impl : ( ( rule__Examples__NameAssignment_3 ) ) ;
    public final void rule__Examples__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1749:1: ( ( ( rule__Examples__NameAssignment_3 ) ) )
            // InternalSheepDog.g:1750:1: ( ( rule__Examples__NameAssignment_3 ) )
            {
            // InternalSheepDog.g:1750:1: ( ( rule__Examples__NameAssignment_3 ) )
            // InternalSheepDog.g:1751:2: ( rule__Examples__NameAssignment_3 )
            {
             before(grammarAccess.getExamplesAccess().getNameAssignment_3()); 
            // InternalSheepDog.g:1752:2: ( rule__Examples__NameAssignment_3 )
            // InternalSheepDog.g:1752:3: rule__Examples__NameAssignment_3
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
    // InternalSheepDog.g:1760:1: rule__Examples__Group__4 : rule__Examples__Group__4__Impl rule__Examples__Group__5 ;
    public final void rule__Examples__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1764:1: ( rule__Examples__Group__4__Impl rule__Examples__Group__5 )
            // InternalSheepDog.g:1765:2: rule__Examples__Group__4__Impl rule__Examples__Group__5
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
    // InternalSheepDog.g:1772:1: rule__Examples__Group__4__Impl : ( ( rule__Examples__StatementsAssignment_4 )* ) ;
    public final void rule__Examples__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1776:1: ( ( ( rule__Examples__StatementsAssignment_4 )* ) )
            // InternalSheepDog.g:1777:1: ( ( rule__Examples__StatementsAssignment_4 )* )
            {
            // InternalSheepDog.g:1777:1: ( ( rule__Examples__StatementsAssignment_4 )* )
            // InternalSheepDog.g:1778:2: ( rule__Examples__StatementsAssignment_4 )*
            {
             before(grammarAccess.getExamplesAccess().getStatementsAssignment_4()); 
            // InternalSheepDog.g:1779:2: ( rule__Examples__StatementsAssignment_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_WORD) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSheepDog.g:1779:3: rule__Examples__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Examples__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalSheepDog.g:1787:1: rule__Examples__Group__5 : rule__Examples__Group__5__Impl ;
    public final void rule__Examples__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1791:1: ( rule__Examples__Group__5__Impl )
            // InternalSheepDog.g:1792:2: rule__Examples__Group__5__Impl
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
    // InternalSheepDog.g:1798:1: rule__Examples__Group__5__Impl : ( ( rule__Examples__TheExamplesTableAssignment_5 ) ) ;
    public final void rule__Examples__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1802:1: ( ( ( rule__Examples__TheExamplesTableAssignment_5 ) ) )
            // InternalSheepDog.g:1803:1: ( ( rule__Examples__TheExamplesTableAssignment_5 ) )
            {
            // InternalSheepDog.g:1803:1: ( ( rule__Examples__TheExamplesTableAssignment_5 ) )
            // InternalSheepDog.g:1804:2: ( rule__Examples__TheExamplesTableAssignment_5 )
            {
             before(grammarAccess.getExamplesAccess().getTheExamplesTableAssignment_5()); 
            // InternalSheepDog.g:1805:2: ( rule__Examples__TheExamplesTableAssignment_5 )
            // InternalSheepDog.g:1805:3: rule__Examples__TheExamplesTableAssignment_5
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
    // InternalSheepDog.g:1814:1: rule__Given__Group__0 : rule__Given__Group__0__Impl rule__Given__Group__1 ;
    public final void rule__Given__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1818:1: ( rule__Given__Group__0__Impl rule__Given__Group__1 )
            // InternalSheepDog.g:1819:2: rule__Given__Group__0__Impl rule__Given__Group__1
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
    // InternalSheepDog.g:1826:1: rule__Given__Group__0__Impl : ( '===' ) ;
    public final void rule__Given__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1830:1: ( ( '===' ) )
            // InternalSheepDog.g:1831:1: ( '===' )
            {
            // InternalSheepDog.g:1831:1: ( '===' )
            // InternalSheepDog.g:1832:2: '==='
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
    // InternalSheepDog.g:1841:1: rule__Given__Group__1 : rule__Given__Group__1__Impl rule__Given__Group__2 ;
    public final void rule__Given__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1845:1: ( rule__Given__Group__1__Impl rule__Given__Group__2 )
            // InternalSheepDog.g:1846:2: rule__Given__Group__1__Impl rule__Given__Group__2
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
    // InternalSheepDog.g:1853:1: rule__Given__Group__1__Impl : ( 'Given' ) ;
    public final void rule__Given__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1857:1: ( ( 'Given' ) )
            // InternalSheepDog.g:1858:1: ( 'Given' )
            {
            // InternalSheepDog.g:1858:1: ( 'Given' )
            // InternalSheepDog.g:1859:2: 'Given'
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
    // InternalSheepDog.g:1868:1: rule__Given__Group__2 : rule__Given__Group__2__Impl rule__Given__Group__3 ;
    public final void rule__Given__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1872:1: ( rule__Given__Group__2__Impl rule__Given__Group__3 )
            // InternalSheepDog.g:1873:2: rule__Given__Group__2__Impl rule__Given__Group__3
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
    // InternalSheepDog.g:1880:1: rule__Given__Group__2__Impl : ( ( rule__Given__NameAssignment_2 ) ) ;
    public final void rule__Given__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1884:1: ( ( ( rule__Given__NameAssignment_2 ) ) )
            // InternalSheepDog.g:1885:1: ( ( rule__Given__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:1885:1: ( ( rule__Given__NameAssignment_2 ) )
            // InternalSheepDog.g:1886:2: ( rule__Given__NameAssignment_2 )
            {
             before(grammarAccess.getGivenAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:1887:2: ( rule__Given__NameAssignment_2 )
            // InternalSheepDog.g:1887:3: rule__Given__NameAssignment_2
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
    // InternalSheepDog.g:1895:1: rule__Given__Group__3 : rule__Given__Group__3__Impl ;
    public final void rule__Given__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1899:1: ( rule__Given__Group__3__Impl )
            // InternalSheepDog.g:1900:2: rule__Given__Group__3__Impl
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
    // InternalSheepDog.g:1906:1: rule__Given__Group__3__Impl : ( ( rule__Given__Alternatives_3 )? ) ;
    public final void rule__Given__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1910:1: ( ( ( rule__Given__Alternatives_3 )? ) )
            // InternalSheepDog.g:1911:1: ( ( rule__Given__Alternatives_3 )? )
            {
            // InternalSheepDog.g:1911:1: ( ( rule__Given__Alternatives_3 )? )
            // InternalSheepDog.g:1912:2: ( rule__Given__Alternatives_3 )?
            {
             before(grammarAccess.getGivenAccess().getAlternatives_3()); 
            // InternalSheepDog.g:1913:2: ( rule__Given__Alternatives_3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=24 && LA24_0<=25)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSheepDog.g:1913:3: rule__Given__Alternatives_3
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
    // InternalSheepDog.g:1922:1: rule__When__Group__0 : rule__When__Group__0__Impl rule__When__Group__1 ;
    public final void rule__When__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1926:1: ( rule__When__Group__0__Impl rule__When__Group__1 )
            // InternalSheepDog.g:1927:2: rule__When__Group__0__Impl rule__When__Group__1
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
    // InternalSheepDog.g:1934:1: rule__When__Group__0__Impl : ( '===' ) ;
    public final void rule__When__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1938:1: ( ( '===' ) )
            // InternalSheepDog.g:1939:1: ( '===' )
            {
            // InternalSheepDog.g:1939:1: ( '===' )
            // InternalSheepDog.g:1940:2: '==='
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
    // InternalSheepDog.g:1949:1: rule__When__Group__1 : rule__When__Group__1__Impl rule__When__Group__2 ;
    public final void rule__When__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1953:1: ( rule__When__Group__1__Impl rule__When__Group__2 )
            // InternalSheepDog.g:1954:2: rule__When__Group__1__Impl rule__When__Group__2
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
    // InternalSheepDog.g:1961:1: rule__When__Group__1__Impl : ( 'When' ) ;
    public final void rule__When__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1965:1: ( ( 'When' ) )
            // InternalSheepDog.g:1966:1: ( 'When' )
            {
            // InternalSheepDog.g:1966:1: ( 'When' )
            // InternalSheepDog.g:1967:2: 'When'
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
    // InternalSheepDog.g:1976:1: rule__When__Group__2 : rule__When__Group__2__Impl rule__When__Group__3 ;
    public final void rule__When__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1980:1: ( rule__When__Group__2__Impl rule__When__Group__3 )
            // InternalSheepDog.g:1981:2: rule__When__Group__2__Impl rule__When__Group__3
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
    // InternalSheepDog.g:1988:1: rule__When__Group__2__Impl : ( ( rule__When__NameAssignment_2 ) ) ;
    public final void rule__When__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1992:1: ( ( ( rule__When__NameAssignment_2 ) ) )
            // InternalSheepDog.g:1993:1: ( ( rule__When__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:1993:1: ( ( rule__When__NameAssignment_2 ) )
            // InternalSheepDog.g:1994:2: ( rule__When__NameAssignment_2 )
            {
             before(grammarAccess.getWhenAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:1995:2: ( rule__When__NameAssignment_2 )
            // InternalSheepDog.g:1995:3: rule__When__NameAssignment_2
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
    // InternalSheepDog.g:2003:1: rule__When__Group__3 : rule__When__Group__3__Impl ;
    public final void rule__When__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2007:1: ( rule__When__Group__3__Impl )
            // InternalSheepDog.g:2008:2: rule__When__Group__3__Impl
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
    // InternalSheepDog.g:2014:1: rule__When__Group__3__Impl : ( ( rule__When__Alternatives_3 )? ) ;
    public final void rule__When__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2018:1: ( ( ( rule__When__Alternatives_3 )? ) )
            // InternalSheepDog.g:2019:1: ( ( rule__When__Alternatives_3 )? )
            {
            // InternalSheepDog.g:2019:1: ( ( rule__When__Alternatives_3 )? )
            // InternalSheepDog.g:2020:2: ( rule__When__Alternatives_3 )?
            {
             before(grammarAccess.getWhenAccess().getAlternatives_3()); 
            // InternalSheepDog.g:2021:2: ( rule__When__Alternatives_3 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=24 && LA25_0<=25)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSheepDog.g:2021:3: rule__When__Alternatives_3
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
    // InternalSheepDog.g:2030:1: rule__Then__Group__0 : rule__Then__Group__0__Impl rule__Then__Group__1 ;
    public final void rule__Then__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2034:1: ( rule__Then__Group__0__Impl rule__Then__Group__1 )
            // InternalSheepDog.g:2035:2: rule__Then__Group__0__Impl rule__Then__Group__1
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
    // InternalSheepDog.g:2042:1: rule__Then__Group__0__Impl : ( '===' ) ;
    public final void rule__Then__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2046:1: ( ( '===' ) )
            // InternalSheepDog.g:2047:1: ( '===' )
            {
            // InternalSheepDog.g:2047:1: ( '===' )
            // InternalSheepDog.g:2048:2: '==='
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
    // InternalSheepDog.g:2057:1: rule__Then__Group__1 : rule__Then__Group__1__Impl rule__Then__Group__2 ;
    public final void rule__Then__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2061:1: ( rule__Then__Group__1__Impl rule__Then__Group__2 )
            // InternalSheepDog.g:2062:2: rule__Then__Group__1__Impl rule__Then__Group__2
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
    // InternalSheepDog.g:2069:1: rule__Then__Group__1__Impl : ( 'Then' ) ;
    public final void rule__Then__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2073:1: ( ( 'Then' ) )
            // InternalSheepDog.g:2074:1: ( 'Then' )
            {
            // InternalSheepDog.g:2074:1: ( 'Then' )
            // InternalSheepDog.g:2075:2: 'Then'
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
    // InternalSheepDog.g:2084:1: rule__Then__Group__2 : rule__Then__Group__2__Impl rule__Then__Group__3 ;
    public final void rule__Then__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2088:1: ( rule__Then__Group__2__Impl rule__Then__Group__3 )
            // InternalSheepDog.g:2089:2: rule__Then__Group__2__Impl rule__Then__Group__3
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
    // InternalSheepDog.g:2096:1: rule__Then__Group__2__Impl : ( ( rule__Then__NameAssignment_2 ) ) ;
    public final void rule__Then__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2100:1: ( ( ( rule__Then__NameAssignment_2 ) ) )
            // InternalSheepDog.g:2101:1: ( ( rule__Then__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:2101:1: ( ( rule__Then__NameAssignment_2 ) )
            // InternalSheepDog.g:2102:2: ( rule__Then__NameAssignment_2 )
            {
             before(grammarAccess.getThenAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:2103:2: ( rule__Then__NameAssignment_2 )
            // InternalSheepDog.g:2103:3: rule__Then__NameAssignment_2
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
    // InternalSheepDog.g:2111:1: rule__Then__Group__3 : rule__Then__Group__3__Impl ;
    public final void rule__Then__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2115:1: ( rule__Then__Group__3__Impl )
            // InternalSheepDog.g:2116:2: rule__Then__Group__3__Impl
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
    // InternalSheepDog.g:2122:1: rule__Then__Group__3__Impl : ( ( rule__Then__Alternatives_3 )? ) ;
    public final void rule__Then__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2126:1: ( ( ( rule__Then__Alternatives_3 )? ) )
            // InternalSheepDog.g:2127:1: ( ( rule__Then__Alternatives_3 )? )
            {
            // InternalSheepDog.g:2127:1: ( ( rule__Then__Alternatives_3 )? )
            // InternalSheepDog.g:2128:2: ( rule__Then__Alternatives_3 )?
            {
             before(grammarAccess.getThenAccess().getAlternatives_3()); 
            // InternalSheepDog.g:2129:2: ( rule__Then__Alternatives_3 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=24 && LA26_0<=25)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSheepDog.g:2129:3: rule__Then__Alternatives_3
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
    // InternalSheepDog.g:2138:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2142:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalSheepDog.g:2143:2: rule__And__Group__0__Impl rule__And__Group__1
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
    // InternalSheepDog.g:2150:1: rule__And__Group__0__Impl : ( '===' ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2154:1: ( ( '===' ) )
            // InternalSheepDog.g:2155:1: ( '===' )
            {
            // InternalSheepDog.g:2155:1: ( '===' )
            // InternalSheepDog.g:2156:2: '==='
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
    // InternalSheepDog.g:2165:1: rule__And__Group__1 : rule__And__Group__1__Impl rule__And__Group__2 ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2169:1: ( rule__And__Group__1__Impl rule__And__Group__2 )
            // InternalSheepDog.g:2170:2: rule__And__Group__1__Impl rule__And__Group__2
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
    // InternalSheepDog.g:2177:1: rule__And__Group__1__Impl : ( 'And' ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2181:1: ( ( 'And' ) )
            // InternalSheepDog.g:2182:1: ( 'And' )
            {
            // InternalSheepDog.g:2182:1: ( 'And' )
            // InternalSheepDog.g:2183:2: 'And'
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
    // InternalSheepDog.g:2192:1: rule__And__Group__2 : rule__And__Group__2__Impl rule__And__Group__3 ;
    public final void rule__And__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2196:1: ( rule__And__Group__2__Impl rule__And__Group__3 )
            // InternalSheepDog.g:2197:2: rule__And__Group__2__Impl rule__And__Group__3
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
    // InternalSheepDog.g:2204:1: rule__And__Group__2__Impl : ( ( rule__And__NameAssignment_2 ) ) ;
    public final void rule__And__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2208:1: ( ( ( rule__And__NameAssignment_2 ) ) )
            // InternalSheepDog.g:2209:1: ( ( rule__And__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:2209:1: ( ( rule__And__NameAssignment_2 ) )
            // InternalSheepDog.g:2210:2: ( rule__And__NameAssignment_2 )
            {
             before(grammarAccess.getAndAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:2211:2: ( rule__And__NameAssignment_2 )
            // InternalSheepDog.g:2211:3: rule__And__NameAssignment_2
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
    // InternalSheepDog.g:2219:1: rule__And__Group__3 : rule__And__Group__3__Impl ;
    public final void rule__And__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2223:1: ( rule__And__Group__3__Impl )
            // InternalSheepDog.g:2224:2: rule__And__Group__3__Impl
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
    // InternalSheepDog.g:2230:1: rule__And__Group__3__Impl : ( ( rule__And__Alternatives_3 )? ) ;
    public final void rule__And__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2234:1: ( ( ( rule__And__Alternatives_3 )? ) )
            // InternalSheepDog.g:2235:1: ( ( rule__And__Alternatives_3 )? )
            {
            // InternalSheepDog.g:2235:1: ( ( rule__And__Alternatives_3 )? )
            // InternalSheepDog.g:2236:2: ( rule__And__Alternatives_3 )?
            {
             before(grammarAccess.getAndAccess().getAlternatives_3()); 
            // InternalSheepDog.g:2237:2: ( rule__And__Alternatives_3 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=24 && LA27_0<=25)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSheepDog.g:2237:3: rule__And__Alternatives_3
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
    // InternalSheepDog.g:2246:1: rule__DocString__Group__0 : rule__DocString__Group__0__Impl rule__DocString__Group__1 ;
    public final void rule__DocString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2250:1: ( rule__DocString__Group__0__Impl rule__DocString__Group__1 )
            // InternalSheepDog.g:2251:2: rule__DocString__Group__0__Impl rule__DocString__Group__1
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
    // InternalSheepDog.g:2258:1: rule__DocString__Group__0__Impl : ( '----' ) ;
    public final void rule__DocString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2262:1: ( ( '----' ) )
            // InternalSheepDog.g:2263:1: ( '----' )
            {
            // InternalSheepDog.g:2263:1: ( '----' )
            // InternalSheepDog.g:2264:2: '----'
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
    // InternalSheepDog.g:2273:1: rule__DocString__Group__1 : rule__DocString__Group__1__Impl rule__DocString__Group__2 ;
    public final void rule__DocString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2277:1: ( rule__DocString__Group__1__Impl rule__DocString__Group__2 )
            // InternalSheepDog.g:2278:2: rule__DocString__Group__1__Impl rule__DocString__Group__2
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
    // InternalSheepDog.g:2285:1: rule__DocString__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__DocString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2289:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2290:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2290:1: ( RULE_EOL )
            // InternalSheepDog.g:2291:2: RULE_EOL
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
    // InternalSheepDog.g:2300:1: rule__DocString__Group__2 : rule__DocString__Group__2__Impl rule__DocString__Group__3 ;
    public final void rule__DocString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2304:1: ( rule__DocString__Group__2__Impl rule__DocString__Group__3 )
            // InternalSheepDog.g:2305:2: rule__DocString__Group__2__Impl rule__DocString__Group__3
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
    // InternalSheepDog.g:2312:1: rule__DocString__Group__2__Impl : ( ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* ) ) ;
    public final void rule__DocString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2316:1: ( ( ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* ) ) )
            // InternalSheepDog.g:2317:1: ( ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* ) )
            {
            // InternalSheepDog.g:2317:1: ( ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* ) )
            // InternalSheepDog.g:2318:2: ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* )
            {
            // InternalSheepDog.g:2318:2: ( ( rule__DocString__LinesAssignment_2 ) )
            // InternalSheepDog.g:2319:3: ( rule__DocString__LinesAssignment_2 )
            {
             before(grammarAccess.getDocStringAccess().getLinesAssignment_2()); 
            // InternalSheepDog.g:2320:3: ( rule__DocString__LinesAssignment_2 )
            // InternalSheepDog.g:2320:4: rule__DocString__LinesAssignment_2
            {
            pushFollow(FOLLOW_31);
            rule__DocString__LinesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDocStringAccess().getLinesAssignment_2()); 

            }

            // InternalSheepDog.g:2323:2: ( ( rule__DocString__LinesAssignment_2 )* )
            // InternalSheepDog.g:2324:3: ( rule__DocString__LinesAssignment_2 )*
            {
             before(grammarAccess.getDocStringAccess().getLinesAssignment_2()); 
            // InternalSheepDog.g:2325:3: ( rule__DocString__LinesAssignment_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_EOL||LA28_0==RULE_WORD) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSheepDog.g:2325:4: rule__DocString__LinesAssignment_2
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__DocString__LinesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalSheepDog.g:2334:1: rule__DocString__Group__3 : rule__DocString__Group__3__Impl rule__DocString__Group__4 ;
    public final void rule__DocString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2338:1: ( rule__DocString__Group__3__Impl rule__DocString__Group__4 )
            // InternalSheepDog.g:2339:2: rule__DocString__Group__3__Impl rule__DocString__Group__4
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
    // InternalSheepDog.g:2346:1: rule__DocString__Group__3__Impl : ( '----' ) ;
    public final void rule__DocString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2350:1: ( ( '----' ) )
            // InternalSheepDog.g:2351:1: ( '----' )
            {
            // InternalSheepDog.g:2351:1: ( '----' )
            // InternalSheepDog.g:2352:2: '----'
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
    // InternalSheepDog.g:2361:1: rule__DocString__Group__4 : rule__DocString__Group__4__Impl ;
    public final void rule__DocString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2365:1: ( rule__DocString__Group__4__Impl )
            // InternalSheepDog.g:2366:2: rule__DocString__Group__4__Impl
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
    // InternalSheepDog.g:2372:1: rule__DocString__Group__4__Impl : ( RULE_EOL ) ;
    public final void rule__DocString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2376:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2377:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2377:1: ( RULE_EOL )
            // InternalSheepDog.g:2378:2: RULE_EOL
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
    // InternalSheepDog.g:2388:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2392:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalSheepDog.g:2393:2: rule__Table__Group__0__Impl rule__Table__Group__1
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
    // InternalSheepDog.g:2400:1: rule__Table__Group__0__Impl : ( '[options=\"header\"]' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2404:1: ( ( '[options=\"header\"]' ) )
            // InternalSheepDog.g:2405:1: ( '[options=\"header\"]' )
            {
            // InternalSheepDog.g:2405:1: ( '[options=\"header\"]' )
            // InternalSheepDog.g:2406:2: '[options=\"header\"]'
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
    // InternalSheepDog.g:2415:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2419:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalSheepDog.g:2420:2: rule__Table__Group__1__Impl rule__Table__Group__2
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
    // InternalSheepDog.g:2427:1: rule__Table__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2431:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2432:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2432:1: ( RULE_EOL )
            // InternalSheepDog.g:2433:2: RULE_EOL
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
    // InternalSheepDog.g:2442:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2446:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalSheepDog.g:2447:2: rule__Table__Group__2__Impl rule__Table__Group__3
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
    // InternalSheepDog.g:2454:1: rule__Table__Group__2__Impl : ( '|===' ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2458:1: ( ( '|===' ) )
            // InternalSheepDog.g:2459:1: ( '|===' )
            {
            // InternalSheepDog.g:2459:1: ( '|===' )
            // InternalSheepDog.g:2460:2: '|==='
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
    // InternalSheepDog.g:2469:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2473:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalSheepDog.g:2474:2: rule__Table__Group__3__Impl rule__Table__Group__4
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
    // InternalSheepDog.g:2481:1: rule__Table__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2485:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2486:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2486:1: ( RULE_EOL )
            // InternalSheepDog.g:2487:2: RULE_EOL
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
    // InternalSheepDog.g:2496:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2500:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalSheepDog.g:2501:2: rule__Table__Group__4__Impl rule__Table__Group__5
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
    // InternalSheepDog.g:2508:1: rule__Table__Group__4__Impl : ( ( ( rule__Table__RowsAssignment_4 ) ) ( ( rule__Table__RowsAssignment_4 )* ) ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2512:1: ( ( ( ( rule__Table__RowsAssignment_4 ) ) ( ( rule__Table__RowsAssignment_4 )* ) ) )
            // InternalSheepDog.g:2513:1: ( ( ( rule__Table__RowsAssignment_4 ) ) ( ( rule__Table__RowsAssignment_4 )* ) )
            {
            // InternalSheepDog.g:2513:1: ( ( ( rule__Table__RowsAssignment_4 ) ) ( ( rule__Table__RowsAssignment_4 )* ) )
            // InternalSheepDog.g:2514:2: ( ( rule__Table__RowsAssignment_4 ) ) ( ( rule__Table__RowsAssignment_4 )* )
            {
            // InternalSheepDog.g:2514:2: ( ( rule__Table__RowsAssignment_4 ) )
            // InternalSheepDog.g:2515:3: ( rule__Table__RowsAssignment_4 )
            {
             before(grammarAccess.getTableAccess().getRowsAssignment_4()); 
            // InternalSheepDog.g:2516:3: ( rule__Table__RowsAssignment_4 )
            // InternalSheepDog.g:2516:4: rule__Table__RowsAssignment_4
            {
            pushFollow(FOLLOW_34);
            rule__Table__RowsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getRowsAssignment_4()); 

            }

            // InternalSheepDog.g:2519:2: ( ( rule__Table__RowsAssignment_4 )* )
            // InternalSheepDog.g:2520:3: ( rule__Table__RowsAssignment_4 )*
            {
             before(grammarAccess.getTableAccess().getRowsAssignment_4()); 
            // InternalSheepDog.g:2521:3: ( rule__Table__RowsAssignment_4 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==29) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSheepDog.g:2521:4: rule__Table__RowsAssignment_4
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Table__RowsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalSheepDog.g:2530:1: rule__Table__Group__5 : rule__Table__Group__5__Impl rule__Table__Group__6 ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2534:1: ( rule__Table__Group__5__Impl rule__Table__Group__6 )
            // InternalSheepDog.g:2535:2: rule__Table__Group__5__Impl rule__Table__Group__6
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
    // InternalSheepDog.g:2542:1: rule__Table__Group__5__Impl : ( '|===' ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2546:1: ( ( '|===' ) )
            // InternalSheepDog.g:2547:1: ( '|===' )
            {
            // InternalSheepDog.g:2547:1: ( '|===' )
            // InternalSheepDog.g:2548:2: '|==='
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
    // InternalSheepDog.g:2557:1: rule__Table__Group__6 : rule__Table__Group__6__Impl ;
    public final void rule__Table__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2561:1: ( rule__Table__Group__6__Impl )
            // InternalSheepDog.g:2562:2: rule__Table__Group__6__Impl
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
    // InternalSheepDog.g:2568:1: rule__Table__Group__6__Impl : ( RULE_EOL ) ;
    public final void rule__Table__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2572:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2573:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2573:1: ( RULE_EOL )
            // InternalSheepDog.g:2574:2: RULE_EOL
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
    // InternalSheepDog.g:2584:1: rule__Row__Group__0 : rule__Row__Group__0__Impl rule__Row__Group__1 ;
    public final void rule__Row__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2588:1: ( rule__Row__Group__0__Impl rule__Row__Group__1 )
            // InternalSheepDog.g:2589:2: rule__Row__Group__0__Impl rule__Row__Group__1
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
    // InternalSheepDog.g:2596:1: rule__Row__Group__0__Impl : ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) ) ;
    public final void rule__Row__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2600:1: ( ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) ) )
            // InternalSheepDog.g:2601:1: ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) )
            {
            // InternalSheepDog.g:2601:1: ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) )
            // InternalSheepDog.g:2602:2: ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* )
            {
            // InternalSheepDog.g:2602:2: ( ( rule__Row__CellsAssignment_0 ) )
            // InternalSheepDog.g:2603:3: ( rule__Row__CellsAssignment_0 )
            {
             before(grammarAccess.getRowAccess().getCellsAssignment_0()); 
            // InternalSheepDog.g:2604:3: ( rule__Row__CellsAssignment_0 )
            // InternalSheepDog.g:2604:4: rule__Row__CellsAssignment_0
            {
            pushFollow(FOLLOW_34);
            rule__Row__CellsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getCellsAssignment_0()); 

            }

            // InternalSheepDog.g:2607:2: ( ( rule__Row__CellsAssignment_0 )* )
            // InternalSheepDog.g:2608:3: ( rule__Row__CellsAssignment_0 )*
            {
             before(grammarAccess.getRowAccess().getCellsAssignment_0()); 
            // InternalSheepDog.g:2609:3: ( rule__Row__CellsAssignment_0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==29) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSheepDog.g:2609:4: rule__Row__CellsAssignment_0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Row__CellsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalSheepDog.g:2618:1: rule__Row__Group__1 : rule__Row__Group__1__Impl ;
    public final void rule__Row__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2622:1: ( rule__Row__Group__1__Impl )
            // InternalSheepDog.g:2623:2: rule__Row__Group__1__Impl
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
    // InternalSheepDog.g:2629:1: rule__Row__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Row__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2633:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2634:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2634:1: ( RULE_EOL )
            // InternalSheepDog.g:2635:2: RULE_EOL
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
    // InternalSheepDog.g:2645:1: rule__Tags__Group__0 : rule__Tags__Group__0__Impl rule__Tags__Group__1 ;
    public final void rule__Tags__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2649:1: ( rule__Tags__Group__0__Impl rule__Tags__Group__1 )
            // InternalSheepDog.g:2650:2: rule__Tags__Group__0__Impl rule__Tags__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalSheepDog.g:2657:1: rule__Tags__Group__0__Impl : ( '[tags=\"' ) ;
    public final void rule__Tags__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2661:1: ( ( '[tags=\"' ) )
            // InternalSheepDog.g:2662:1: ( '[tags=\"' )
            {
            // InternalSheepDog.g:2662:1: ( '[tags=\"' )
            // InternalSheepDog.g:2663:2: '[tags=\"'
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
    // InternalSheepDog.g:2672:1: rule__Tags__Group__1 : rule__Tags__Group__1__Impl rule__Tags__Group__2 ;
    public final void rule__Tags__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2676:1: ( rule__Tags__Group__1__Impl rule__Tags__Group__2 )
            // InternalSheepDog.g:2677:2: rule__Tags__Group__1__Impl rule__Tags__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalSheepDog.g:2684:1: rule__Tags__Group__1__Impl : ( ( ( RULE_TAGWORD ) ) ( ( RULE_TAGWORD )* ) ) ;
    public final void rule__Tags__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2688:1: ( ( ( ( RULE_TAGWORD ) ) ( ( RULE_TAGWORD )* ) ) )
            // InternalSheepDog.g:2689:1: ( ( ( RULE_TAGWORD ) ) ( ( RULE_TAGWORD )* ) )
            {
            // InternalSheepDog.g:2689:1: ( ( ( RULE_TAGWORD ) ) ( ( RULE_TAGWORD )* ) )
            // InternalSheepDog.g:2690:2: ( ( RULE_TAGWORD ) ) ( ( RULE_TAGWORD )* )
            {
            // InternalSheepDog.g:2690:2: ( ( RULE_TAGWORD ) )
            // InternalSheepDog.g:2691:3: ( RULE_TAGWORD )
            {
             before(grammarAccess.getTagsAccess().getTAGWORDTerminalRuleCall_1()); 
            // InternalSheepDog.g:2692:3: ( RULE_TAGWORD )
            // InternalSheepDog.g:2692:4: RULE_TAGWORD
            {
            match(input,RULE_TAGWORD,FOLLOW_37); 

            }

             after(grammarAccess.getTagsAccess().getTAGWORDTerminalRuleCall_1()); 

            }

            // InternalSheepDog.g:2695:2: ( ( RULE_TAGWORD )* )
            // InternalSheepDog.g:2696:3: ( RULE_TAGWORD )*
            {
             before(grammarAccess.getTagsAccess().getTAGWORDTerminalRuleCall_1()); 
            // InternalSheepDog.g:2697:3: ( RULE_TAGWORD )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_TAGWORD) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalSheepDog.g:2697:4: RULE_TAGWORD
            	    {
            	    match(input,RULE_TAGWORD,FOLLOW_37); 

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getTagsAccess().getTAGWORDTerminalRuleCall_1()); 

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
    // InternalSheepDog.g:2706:1: rule__Tags__Group__2 : rule__Tags__Group__2__Impl rule__Tags__Group__3 ;
    public final void rule__Tags__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2710:1: ( rule__Tags__Group__2__Impl rule__Tags__Group__3 )
            // InternalSheepDog.g:2711:2: rule__Tags__Group__2__Impl rule__Tags__Group__3
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
    // InternalSheepDog.g:2718:1: rule__Tags__Group__2__Impl : ( '\"]' ) ;
    public final void rule__Tags__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2722:1: ( ( '\"]' ) )
            // InternalSheepDog.g:2723:1: ( '\"]' )
            {
            // InternalSheepDog.g:2723:1: ( '\"]' )
            // InternalSheepDog.g:2724:2: '\"]'
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
    // InternalSheepDog.g:2733:1: rule__Tags__Group__3 : rule__Tags__Group__3__Impl ;
    public final void rule__Tags__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2737:1: ( rule__Tags__Group__3__Impl )
            // InternalSheepDog.g:2738:2: rule__Tags__Group__3__Impl
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
    // InternalSheepDog.g:2744:1: rule__Tags__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Tags__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2748:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2749:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2749:1: ( RULE_EOL )
            // InternalSheepDog.g:2750:2: RULE_EOL
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
    // InternalSheepDog.g:2760:1: rule__Title__Group__0 : rule__Title__Group__0__Impl rule__Title__Group__1 ;
    public final void rule__Title__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2764:1: ( rule__Title__Group__0__Impl rule__Title__Group__1 )
            // InternalSheepDog.g:2765:2: rule__Title__Group__0__Impl rule__Title__Group__1
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
    // InternalSheepDog.g:2772:1: rule__Title__Group__0__Impl : ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) ) ;
    public final void rule__Title__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2776:1: ( ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) ) )
            // InternalSheepDog.g:2777:1: ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) )
            {
            // InternalSheepDog.g:2777:1: ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) )
            // InternalSheepDog.g:2778:2: ( ( RULE_WORD ) ) ( ( RULE_WORD )* )
            {
            // InternalSheepDog.g:2778:2: ( ( RULE_WORD ) )
            // InternalSheepDog.g:2779:3: ( RULE_WORD )
            {
             before(grammarAccess.getTitleAccess().getWORDTerminalRuleCall_0()); 
            // InternalSheepDog.g:2780:3: ( RULE_WORD )
            // InternalSheepDog.g:2780:4: RULE_WORD
            {
            match(input,RULE_WORD,FOLLOW_6); 

            }

             after(grammarAccess.getTitleAccess().getWORDTerminalRuleCall_0()); 

            }

            // InternalSheepDog.g:2783:2: ( ( RULE_WORD )* )
            // InternalSheepDog.g:2784:3: ( RULE_WORD )*
            {
             before(grammarAccess.getTitleAccess().getWORDTerminalRuleCall_0()); 
            // InternalSheepDog.g:2785:3: ( RULE_WORD )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_WORD) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSheepDog.g:2785:4: RULE_WORD
            	    {
            	    match(input,RULE_WORD,FOLLOW_6); 

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getTitleAccess().getWORDTerminalRuleCall_0()); 

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
    // InternalSheepDog.g:2794:1: rule__Title__Group__1 : rule__Title__Group__1__Impl ;
    public final void rule__Title__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2798:1: ( rule__Title__Group__1__Impl )
            // InternalSheepDog.g:2799:2: rule__Title__Group__1__Impl
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
    // InternalSheepDog.g:2805:1: rule__Title__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Title__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2809:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2810:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2810:1: ( RULE_EOL )
            // InternalSheepDog.g:2811:2: RULE_EOL
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
    // InternalSheepDog.g:2821:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2825:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalSheepDog.g:2826:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
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
    // InternalSheepDog.g:2833:1: rule__Statement__Group__0__Impl : ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2837:1: ( ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) ) )
            // InternalSheepDog.g:2838:1: ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) )
            {
            // InternalSheepDog.g:2838:1: ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) )
            // InternalSheepDog.g:2839:2: ( ( RULE_WORD ) ) ( ( RULE_WORD )* )
            {
            // InternalSheepDog.g:2839:2: ( ( RULE_WORD ) )
            // InternalSheepDog.g:2840:3: ( RULE_WORD )
            {
             before(grammarAccess.getStatementAccess().getWORDTerminalRuleCall_0()); 
            // InternalSheepDog.g:2841:3: ( RULE_WORD )
            // InternalSheepDog.g:2841:4: RULE_WORD
            {
            match(input,RULE_WORD,FOLLOW_6); 

            }

             after(grammarAccess.getStatementAccess().getWORDTerminalRuleCall_0()); 

            }

            // InternalSheepDog.g:2844:2: ( ( RULE_WORD )* )
            // InternalSheepDog.g:2845:3: ( RULE_WORD )*
            {
             before(grammarAccess.getStatementAccess().getWORDTerminalRuleCall_0()); 
            // InternalSheepDog.g:2846:3: ( RULE_WORD )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_WORD) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSheepDog.g:2846:4: RULE_WORD
            	    {
            	    match(input,RULE_WORD,FOLLOW_6); 

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getStatementAccess().getWORDTerminalRuleCall_0()); 

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
    // InternalSheepDog.g:2855:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2859:1: ( rule__Statement__Group__1__Impl )
            // InternalSheepDog.g:2860:2: rule__Statement__Group__1__Impl
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
    // InternalSheepDog.g:2866:1: rule__Statement__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2870:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2871:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2871:1: ( RULE_EOL )
            // InternalSheepDog.g:2872:2: RULE_EOL
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
    // InternalSheepDog.g:2882:1: rule__Line__Group__0 : rule__Line__Group__0__Impl rule__Line__Group__1 ;
    public final void rule__Line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2886:1: ( rule__Line__Group__0__Impl rule__Line__Group__1 )
            // InternalSheepDog.g:2887:2: rule__Line__Group__0__Impl rule__Line__Group__1
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
    // InternalSheepDog.g:2894:1: rule__Line__Group__0__Impl : ( ( RULE_WORD )* ) ;
    public final void rule__Line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2898:1: ( ( ( RULE_WORD )* ) )
            // InternalSheepDog.g:2899:1: ( ( RULE_WORD )* )
            {
            // InternalSheepDog.g:2899:1: ( ( RULE_WORD )* )
            // InternalSheepDog.g:2900:2: ( RULE_WORD )*
            {
             before(grammarAccess.getLineAccess().getWORDTerminalRuleCall_0()); 
            // InternalSheepDog.g:2901:2: ( RULE_WORD )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_WORD) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalSheepDog.g:2901:3: RULE_WORD
            	    {
            	    match(input,RULE_WORD,FOLLOW_6); 

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getLineAccess().getWORDTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalSheepDog.g:2909:1: rule__Line__Group__1 : rule__Line__Group__1__Impl ;
    public final void rule__Line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2913:1: ( rule__Line__Group__1__Impl )
            // InternalSheepDog.g:2914:2: rule__Line__Group__1__Impl
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
    // InternalSheepDog.g:2920:1: rule__Line__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2924:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2925:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2925:1: ( RULE_EOL )
            // InternalSheepDog.g:2926:2: RULE_EOL
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
    // InternalSheepDog.g:2936:1: rule__Cell__Group__0 : rule__Cell__Group__0__Impl rule__Cell__Group__1 ;
    public final void rule__Cell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2940:1: ( rule__Cell__Group__0__Impl rule__Cell__Group__1 )
            // InternalSheepDog.g:2941:2: rule__Cell__Group__0__Impl rule__Cell__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalSheepDog.g:2948:1: rule__Cell__Group__0__Impl : ( '|' ) ;
    public final void rule__Cell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2952:1: ( ( '|' ) )
            // InternalSheepDog.g:2953:1: ( '|' )
            {
            // InternalSheepDog.g:2953:1: ( '|' )
            // InternalSheepDog.g:2954:2: '|'
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
    // InternalSheepDog.g:2963:1: rule__Cell__Group__1 : rule__Cell__Group__1__Impl ;
    public final void rule__Cell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2967:1: ( rule__Cell__Group__1__Impl )
            // InternalSheepDog.g:2968:2: rule__Cell__Group__1__Impl
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
    // InternalSheepDog.g:2974:1: rule__Cell__Group__1__Impl : ( ( RULE_CELLWORD )* ) ;
    public final void rule__Cell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2978:1: ( ( ( RULE_CELLWORD )* ) )
            // InternalSheepDog.g:2979:1: ( ( RULE_CELLWORD )* )
            {
            // InternalSheepDog.g:2979:1: ( ( RULE_CELLWORD )* )
            // InternalSheepDog.g:2980:2: ( RULE_CELLWORD )*
            {
             before(grammarAccess.getCellAccess().getCELLWORDTerminalRuleCall_1()); 
            // InternalSheepDog.g:2981:2: ( RULE_CELLWORD )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_CELLWORD) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalSheepDog.g:2981:3: RULE_CELLWORD
            	    {
            	    match(input,RULE_CELLWORD,FOLLOW_39); 

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getCellAccess().getCELLWORDTerminalRuleCall_1()); 

            }


            }

        }
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
    // InternalSheepDog.g:2990:1: rule__StepObject__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__StepObject__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2994:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:2995:2: ( ruleTitle )
            {
            // InternalSheepDog.g:2995:2: ( ruleTitle )
            // InternalSheepDog.g:2996:3: ruleTitle
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
    // InternalSheepDog.g:3005:1: rule__StepObject__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__StepObject__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3009:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3010:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3010:2: ( ruleStatement )
            // InternalSheepDog.g:3011:3: ruleStatement
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
    // InternalSheepDog.g:3020:1: rule__StepObject__StepDefinitionsAssignment_4 : ( ruleStepDefinition ) ;
    public final void rule__StepObject__StepDefinitionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3024:1: ( ( ruleStepDefinition ) )
            // InternalSheepDog.g:3025:2: ( ruleStepDefinition )
            {
            // InternalSheepDog.g:3025:2: ( ruleStepDefinition )
            // InternalSheepDog.g:3026:3: ruleStepDefinition
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
    // InternalSheepDog.g:3035:1: rule__StepDefinition__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__StepDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3039:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3040:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3040:2: ( ruleTitle )
            // InternalSheepDog.g:3041:3: ruleTitle
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
    // InternalSheepDog.g:3050:1: rule__StepDefinition__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__StepDefinition__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3054:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3055:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3055:2: ( ruleStatement )
            // InternalSheepDog.g:3056:3: ruleStatement
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
    // InternalSheepDog.g:3065:1: rule__StepDefinition__StepParametersAssignment_4 : ( ruleStepParameters ) ;
    public final void rule__StepDefinition__StepParametersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3069:1: ( ( ruleStepParameters ) )
            // InternalSheepDog.g:3070:2: ( ruleStepParameters )
            {
            // InternalSheepDog.g:3070:2: ( ruleStepParameters )
            // InternalSheepDog.g:3071:3: ruleStepParameters
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
    // InternalSheepDog.g:3080:1: rule__StepParameters__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__StepParameters__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3084:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3085:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3085:2: ( ruleTitle )
            // InternalSheepDog.g:3086:3: ruleTitle
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
    // InternalSheepDog.g:3095:1: rule__StepParameters__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__StepParameters__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3099:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3100:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3100:2: ( ruleStatement )
            // InternalSheepDog.g:3101:3: ruleStatement
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
    // InternalSheepDog.g:3110:1: rule__StepParameters__ParametersTableAssignment_4 : ( ruleTable ) ;
    public final void rule__StepParameters__ParametersTableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3114:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3115:2: ( ruleTable )
            {
            // InternalSheepDog.g:3115:2: ( ruleTable )
            // InternalSheepDog.g:3116:3: ruleTable
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
    // InternalSheepDog.g:3125:1: rule__Feature__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__Feature__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3129:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3130:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3130:2: ( ruleTitle )
            // InternalSheepDog.g:3131:3: ruleTitle
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
    // InternalSheepDog.g:3140:1: rule__Feature__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__Feature__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3144:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3145:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3145:2: ( ruleStatement )
            // InternalSheepDog.g:3146:3: ruleStatement
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
    // InternalSheepDog.g:3155:1: rule__Feature__AbstractScenariosAssignment_4 : ( ruleAbstractScenario ) ;
    public final void rule__Feature__AbstractScenariosAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3159:1: ( ( ruleAbstractScenario ) )
            // InternalSheepDog.g:3160:2: ( ruleAbstractScenario )
            {
            // InternalSheepDog.g:3160:2: ( ruleAbstractScenario )
            // InternalSheepDog.g:3161:3: ruleAbstractScenario
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
    // InternalSheepDog.g:3170:1: rule__Background__TagsAssignment_0 : ( ruleTags ) ;
    public final void rule__Background__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3174:1: ( ( ruleTags ) )
            // InternalSheepDog.g:3175:2: ( ruleTags )
            {
            // InternalSheepDog.g:3175:2: ( ruleTags )
            // InternalSheepDog.g:3176:3: ruleTags
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
    // InternalSheepDog.g:3185:1: rule__Background__NameAssignment_3 : ( ruleTitle ) ;
    public final void rule__Background__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3189:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3190:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3190:2: ( ruleTitle )
            // InternalSheepDog.g:3191:3: ruleTitle
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
    // InternalSheepDog.g:3200:1: rule__Background__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__Background__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3204:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3205:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3205:2: ( ruleStatement )
            // InternalSheepDog.g:3206:3: ruleStatement
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
    // InternalSheepDog.g:3215:1: rule__Background__StepsAssignment_5 : ( ruleStep ) ;
    public final void rule__Background__StepsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3219:1: ( ( ruleStep ) )
            // InternalSheepDog.g:3220:2: ( ruleStep )
            {
            // InternalSheepDog.g:3220:2: ( ruleStep )
            // InternalSheepDog.g:3221:3: ruleStep
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
    // InternalSheepDog.g:3230:1: rule__Scenario__TagsAssignment_0 : ( ruleTags ) ;
    public final void rule__Scenario__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3234:1: ( ( ruleTags ) )
            // InternalSheepDog.g:3235:2: ( ruleTags )
            {
            // InternalSheepDog.g:3235:2: ( ruleTags )
            // InternalSheepDog.g:3236:3: ruleTags
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
    // InternalSheepDog.g:3245:1: rule__Scenario__NameAssignment_3 : ( ruleTitle ) ;
    public final void rule__Scenario__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3249:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3250:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3250:2: ( ruleTitle )
            // InternalSheepDog.g:3251:3: ruleTitle
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
    // InternalSheepDog.g:3260:1: rule__Scenario__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__Scenario__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3264:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3265:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3265:2: ( ruleStatement )
            // InternalSheepDog.g:3266:3: ruleStatement
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
    // InternalSheepDog.g:3275:1: rule__Scenario__StepsAssignment_5 : ( ruleStep ) ;
    public final void rule__Scenario__StepsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3279:1: ( ( ruleStep ) )
            // InternalSheepDog.g:3280:2: ( ruleStep )
            {
            // InternalSheepDog.g:3280:2: ( ruleStep )
            // InternalSheepDog.g:3281:3: ruleStep
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
    // InternalSheepDog.g:3290:1: rule__Scenario__ExamplesAssignment_6 : ( ruleExamples ) ;
    public final void rule__Scenario__ExamplesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3294:1: ( ( ruleExamples ) )
            // InternalSheepDog.g:3295:2: ( ruleExamples )
            {
            // InternalSheepDog.g:3295:2: ( ruleExamples )
            // InternalSheepDog.g:3296:3: ruleExamples
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
    // InternalSheepDog.g:3305:1: rule__Examples__TagsAssignment_0 : ( ruleTags ) ;
    public final void rule__Examples__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3309:1: ( ( ruleTags ) )
            // InternalSheepDog.g:3310:2: ( ruleTags )
            {
            // InternalSheepDog.g:3310:2: ( ruleTags )
            // InternalSheepDog.g:3311:3: ruleTags
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
    // InternalSheepDog.g:3320:1: rule__Examples__NameAssignment_3 : ( ruleTitle ) ;
    public final void rule__Examples__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3324:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3325:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3325:2: ( ruleTitle )
            // InternalSheepDog.g:3326:3: ruleTitle
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
    // InternalSheepDog.g:3335:1: rule__Examples__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__Examples__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3339:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3340:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3340:2: ( ruleStatement )
            // InternalSheepDog.g:3341:3: ruleStatement
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
    // InternalSheepDog.g:3350:1: rule__Examples__TheExamplesTableAssignment_5 : ( ruleTable ) ;
    public final void rule__Examples__TheExamplesTableAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3354:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3355:2: ( ruleTable )
            {
            // InternalSheepDog.g:3355:2: ( ruleTable )
            // InternalSheepDog.g:3356:3: ruleTable
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
    // InternalSheepDog.g:3365:1: rule__Given__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__Given__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3369:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3370:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3370:2: ( ruleTitle )
            // InternalSheepDog.g:3371:3: ruleTitle
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
    // InternalSheepDog.g:3380:1: rule__Given__TheStepTableAssignment_3_0 : ( ruleTable ) ;
    public final void rule__Given__TheStepTableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3384:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3385:2: ( ruleTable )
            {
            // InternalSheepDog.g:3385:2: ( ruleTable )
            // InternalSheepDog.g:3386:3: ruleTable
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
    // InternalSheepDog.g:3395:1: rule__Given__TheDocStringAssignment_3_1 : ( ruleDocString ) ;
    public final void rule__Given__TheDocStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3399:1: ( ( ruleDocString ) )
            // InternalSheepDog.g:3400:2: ( ruleDocString )
            {
            // InternalSheepDog.g:3400:2: ( ruleDocString )
            // InternalSheepDog.g:3401:3: ruleDocString
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
    // InternalSheepDog.g:3410:1: rule__When__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__When__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3414:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3415:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3415:2: ( ruleTitle )
            // InternalSheepDog.g:3416:3: ruleTitle
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
    // InternalSheepDog.g:3425:1: rule__When__TheStepTableAssignment_3_0 : ( ruleTable ) ;
    public final void rule__When__TheStepTableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3429:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3430:2: ( ruleTable )
            {
            // InternalSheepDog.g:3430:2: ( ruleTable )
            // InternalSheepDog.g:3431:3: ruleTable
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
    // InternalSheepDog.g:3440:1: rule__When__TheDocStringAssignment_3_1 : ( ruleDocString ) ;
    public final void rule__When__TheDocStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3444:1: ( ( ruleDocString ) )
            // InternalSheepDog.g:3445:2: ( ruleDocString )
            {
            // InternalSheepDog.g:3445:2: ( ruleDocString )
            // InternalSheepDog.g:3446:3: ruleDocString
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
    // InternalSheepDog.g:3455:1: rule__Then__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__Then__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3459:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3460:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3460:2: ( ruleTitle )
            // InternalSheepDog.g:3461:3: ruleTitle
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
    // InternalSheepDog.g:3470:1: rule__Then__TheStepTableAssignment_3_0 : ( ruleTable ) ;
    public final void rule__Then__TheStepTableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3474:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3475:2: ( ruleTable )
            {
            // InternalSheepDog.g:3475:2: ( ruleTable )
            // InternalSheepDog.g:3476:3: ruleTable
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
    // InternalSheepDog.g:3485:1: rule__Then__TheDocStringAssignment_3_1 : ( ruleDocString ) ;
    public final void rule__Then__TheDocStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3489:1: ( ( ruleDocString ) )
            // InternalSheepDog.g:3490:2: ( ruleDocString )
            {
            // InternalSheepDog.g:3490:2: ( ruleDocString )
            // InternalSheepDog.g:3491:3: ruleDocString
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
    // InternalSheepDog.g:3500:1: rule__And__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__And__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3504:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3505:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3505:2: ( ruleTitle )
            // InternalSheepDog.g:3506:3: ruleTitle
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
    // InternalSheepDog.g:3515:1: rule__And__TheStepTableAssignment_3_0 : ( ruleTable ) ;
    public final void rule__And__TheStepTableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3519:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3520:2: ( ruleTable )
            {
            // InternalSheepDog.g:3520:2: ( ruleTable )
            // InternalSheepDog.g:3521:3: ruleTable
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
    // InternalSheepDog.g:3530:1: rule__And__TheDocStringAssignment_3_1 : ( ruleDocString ) ;
    public final void rule__And__TheDocStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3534:1: ( ( ruleDocString ) )
            // InternalSheepDog.g:3535:2: ( ruleDocString )
            {
            // InternalSheepDog.g:3535:2: ( ruleDocString )
            // InternalSheepDog.g:3536:3: ruleDocString
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
    // InternalSheepDog.g:3545:1: rule__DocString__LinesAssignment_2 : ( ruleLine ) ;
    public final void rule__DocString__LinesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3549:1: ( ( ruleLine ) )
            // InternalSheepDog.g:3550:2: ( ruleLine )
            {
            // InternalSheepDog.g:3550:2: ( ruleLine )
            // InternalSheepDog.g:3551:3: ruleLine
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
    // InternalSheepDog.g:3560:1: rule__Table__RowsAssignment_4 : ( ruleRow ) ;
    public final void rule__Table__RowsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3564:1: ( ( ruleRow ) )
            // InternalSheepDog.g:3565:2: ( ruleRow )
            {
            // InternalSheepDog.g:3565:2: ( ruleRow )
            // InternalSheepDog.g:3566:3: ruleRow
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
    // InternalSheepDog.g:3575:1: rule__Row__CellsAssignment_0 : ( ruleCell ) ;
    public final void rule__Row__CellsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3579:1: ( ( ruleCell ) )
            // InternalSheepDog.g:3580:2: ( ruleCell )
            {
            // InternalSheepDog.g:3580:2: ( ruleCell )
            // InternalSheepDog.g:3581:3: ruleCell
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
    protected DFA21 dfa21 = new DFA21(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\1\14\1\5\1\21\1\5\2\uffff\1\5\1\4\1\14";
    static final String dfa_3s = "\1\33\1\5\1\22\1\34\2\uffff\1\34\1\4\1\14";
    static final String dfa_4s = "\4\uffff\1\1\1\2\3\uffff";
    static final String dfa_5s = "\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\16\uffff\1\1",
            "\1\3",
            "\1\4\1\5",
            "\1\6\26\uffff\1\7",
            "",
            "",
            "\1\6\26\uffff\1\7",
            "\1\10",
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
            return "623:1: rule__AbstractScenario__Alternatives : ( ( ruleBackground ) | ( ruleScenario ) );";
        }
    }
    static final String dfa_7s = "\10\uffff";
    static final String dfa_8s = "\1\1\7\uffff";
    static final String dfa_9s = "\1\14\1\uffff\1\5\1\uffff\2\5\1\4\1\14";
    static final String dfa_10s = "\1\33\1\uffff\1\5\1\uffff\2\34\1\4\1\16";
    static final String dfa_11s = "\1\uffff\1\2\1\uffff\1\1\4\uffff";
    static final String dfa_12s = "\10\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\1\uffff\1\3\14\uffff\1\2",
            "",
            "\1\4",
            "",
            "\1\5\26\uffff\1\6",
            "\1\5\26\uffff\1\6",
            "\1\7",
            "\1\1\1\uffff\1\3"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 1643:2: ( rule__Scenario__ExamplesAssignment_6 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008001040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008001002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008001000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008004040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008004002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000003000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000082L});

}
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WORD", "RULE_EOL", "RULE_TAGWORD", "RULE_WS", "RULE_SL_COMMENT", "'='", "'Object:'", "'=='", "'Definition:'", "'==='", "'Parameters:'", "'Feature:'", "'Background:'", "'Scenario:'", "'Examples:'", "'Given'", "'When'", "'Then'", "'And'", "'----'", "'[options=\"header\"]'", "'|==='", "':tags:'", "'[tags=\"'", "'\"]'", "'|'"
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
    public static final int RULE_TAGWORD=6;
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


    // $ANTLR start "entryRuleTitle"
    // InternalSheepDog.g:553:1: entryRuleTitle : ruleTitle EOF ;
    public final void entryRuleTitle() throws RecognitionException {
        try {
            // InternalSheepDog.g:554:1: ( ruleTitle EOF )
            // InternalSheepDog.g:555:1: ruleTitle EOF
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
    // InternalSheepDog.g:562:1: ruleTitle : ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) ) ;
    public final void ruleTitle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:566:2: ( ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) ) )
            // InternalSheepDog.g:567:2: ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) )
            {
            // InternalSheepDog.g:567:2: ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) )
            // InternalSheepDog.g:568:3: ( ( RULE_WORD ) ) ( ( RULE_WORD )* )
            {
            // InternalSheepDog.g:568:3: ( ( RULE_WORD ) )
            // InternalSheepDog.g:569:4: ( RULE_WORD )
            {
             before(grammarAccess.getTitleAccess().getWORDTerminalRuleCall()); 
            // InternalSheepDog.g:570:4: ( RULE_WORD )
            // InternalSheepDog.g:570:5: RULE_WORD
            {
            match(input,RULE_WORD,FOLLOW_3); 

            }

             after(grammarAccess.getTitleAccess().getWORDTerminalRuleCall()); 

            }

            // InternalSheepDog.g:573:3: ( ( RULE_WORD )* )
            // InternalSheepDog.g:574:4: ( RULE_WORD )*
            {
             before(grammarAccess.getTitleAccess().getWORDTerminalRuleCall()); 
            // InternalSheepDog.g:575:4: ( RULE_WORD )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_WORD) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSheepDog.g:575:5: RULE_WORD
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


    // $ANTLR start "entryRuleStatement"
    // InternalSheepDog.g:585:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalSheepDog.g:586:1: ( ruleStatement EOF )
            // InternalSheepDog.g:587:1: ruleStatement EOF
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
    // InternalSheepDog.g:594:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:598:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalSheepDog.g:599:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalSheepDog.g:599:2: ( ( rule__Statement__Group__0 ) )
            // InternalSheepDog.g:600:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalSheepDog.g:601:3: ( rule__Statement__Group__0 )
            // InternalSheepDog.g:601:4: rule__Statement__Group__0
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
    // InternalSheepDog.g:610:1: entryRuleLine : ruleLine EOF ;
    public final void entryRuleLine() throws RecognitionException {
        try {
            // InternalSheepDog.g:611:1: ( ruleLine EOF )
            // InternalSheepDog.g:612:1: ruleLine EOF
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
    // InternalSheepDog.g:619:1: ruleLine : ( ( rule__Line__Group__0 ) ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:623:2: ( ( ( rule__Line__Group__0 ) ) )
            // InternalSheepDog.g:624:2: ( ( rule__Line__Group__0 ) )
            {
            // InternalSheepDog.g:624:2: ( ( rule__Line__Group__0 ) )
            // InternalSheepDog.g:625:3: ( rule__Line__Group__0 )
            {
             before(grammarAccess.getLineAccess().getGroup()); 
            // InternalSheepDog.g:626:3: ( rule__Line__Group__0 )
            // InternalSheepDog.g:626:4: rule__Line__Group__0
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


    // $ANTLR start "rule__Model__Alternatives"
    // InternalSheepDog.g:634:1: rule__Model__Alternatives : ( ( ruleStepObject ) | ( ruleFeature ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:638:1: ( ( ruleStepObject ) | ( ruleFeature ) )
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
            else if ( (LA2_0==26) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
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


    // $ANTLR start "rule__AbstractScenario__Alternatives"
    // InternalSheepDog.g:655:1: rule__AbstractScenario__Alternatives : ( ( ruleBackground ) | ( ruleScenario ) );
    public final void rule__AbstractScenario__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:659:1: ( ( ruleBackground ) | ( ruleScenario ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==27) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_WORD) ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==28) ) {
                        int LA3_6 = input.LA(4);

                        if ( (LA3_6==RULE_EOL) ) {
                            int LA3_7 = input.LA(5);

                            if ( (LA3_7==11) ) {
                                int LA3_2 = input.LA(6);

                                if ( (LA3_2==17) ) {
                                    alt3=2;
                                }
                                else if ( (LA3_2==16) ) {
                                    alt3=1;
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

                if ( (LA3_2==17) ) {
                    alt3=2;
                }
                else if ( (LA3_2==16) ) {
                    alt3=1;
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
                    // InternalSheepDog.g:660:2: ( ruleBackground )
                    {
                    // InternalSheepDog.g:660:2: ( ruleBackground )
                    // InternalSheepDog.g:661:3: ruleBackground
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
                    // InternalSheepDog.g:666:2: ( ruleScenario )
                    {
                    // InternalSheepDog.g:666:2: ( ruleScenario )
                    // InternalSheepDog.g:667:3: ruleScenario
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
    // InternalSheepDog.g:676:1: rule__Step__Alternatives : ( ( ruleGiven ) | ( ruleWhen ) | ( ruleThen ) | ( ruleAnd ) );
    public final void rule__Step__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:680:1: ( ( ruleGiven ) | ( ruleWhen ) | ( ruleThen ) | ( ruleAnd ) )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                switch ( input.LA(2) ) {
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
                    // InternalSheepDog.g:681:2: ( ruleGiven )
                    {
                    // InternalSheepDog.g:681:2: ( ruleGiven )
                    // InternalSheepDog.g:682:3: ruleGiven
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
                    // InternalSheepDog.g:687:2: ( ruleWhen )
                    {
                    // InternalSheepDog.g:687:2: ( ruleWhen )
                    // InternalSheepDog.g:688:3: ruleWhen
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
                    // InternalSheepDog.g:693:2: ( ruleThen )
                    {
                    // InternalSheepDog.g:693:2: ( ruleThen )
                    // InternalSheepDog.g:694:3: ruleThen
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
                    // InternalSheepDog.g:699:2: ( ruleAnd )
                    {
                    // InternalSheepDog.g:699:2: ( ruleAnd )
                    // InternalSheepDog.g:700:3: ruleAnd
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
    // InternalSheepDog.g:709:1: rule__Given__Alternatives_4 : ( ( ( rule__Given__TheStepTableAssignment_4_0 ) ) | ( ( rule__Given__TheDocStringAssignment_4_1 ) ) );
    public final void rule__Given__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:713:1: ( ( ( rule__Given__TheStepTableAssignment_4_0 ) ) | ( ( rule__Given__TheDocStringAssignment_4_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            else if ( (LA5_0==23) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSheepDog.g:714:2: ( ( rule__Given__TheStepTableAssignment_4_0 ) )
                    {
                    // InternalSheepDog.g:714:2: ( ( rule__Given__TheStepTableAssignment_4_0 ) )
                    // InternalSheepDog.g:715:3: ( rule__Given__TheStepTableAssignment_4_0 )
                    {
                     before(grammarAccess.getGivenAccess().getTheStepTableAssignment_4_0()); 
                    // InternalSheepDog.g:716:3: ( rule__Given__TheStepTableAssignment_4_0 )
                    // InternalSheepDog.g:716:4: rule__Given__TheStepTableAssignment_4_0
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
                    // InternalSheepDog.g:720:2: ( ( rule__Given__TheDocStringAssignment_4_1 ) )
                    {
                    // InternalSheepDog.g:720:2: ( ( rule__Given__TheDocStringAssignment_4_1 ) )
                    // InternalSheepDog.g:721:3: ( rule__Given__TheDocStringAssignment_4_1 )
                    {
                     before(grammarAccess.getGivenAccess().getTheDocStringAssignment_4_1()); 
                    // InternalSheepDog.g:722:3: ( rule__Given__TheDocStringAssignment_4_1 )
                    // InternalSheepDog.g:722:4: rule__Given__TheDocStringAssignment_4_1
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
    // InternalSheepDog.g:730:1: rule__When__Alternatives_4 : ( ( ( rule__When__TheStepTableAssignment_4_0 ) ) | ( ( rule__When__TheDocStringAssignment_4_1 ) ) );
    public final void rule__When__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:734:1: ( ( ( rule__When__TheStepTableAssignment_4_0 ) ) | ( ( rule__When__TheDocStringAssignment_4_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            else if ( (LA6_0==23) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSheepDog.g:735:2: ( ( rule__When__TheStepTableAssignment_4_0 ) )
                    {
                    // InternalSheepDog.g:735:2: ( ( rule__When__TheStepTableAssignment_4_0 ) )
                    // InternalSheepDog.g:736:3: ( rule__When__TheStepTableAssignment_4_0 )
                    {
                     before(grammarAccess.getWhenAccess().getTheStepTableAssignment_4_0()); 
                    // InternalSheepDog.g:737:3: ( rule__When__TheStepTableAssignment_4_0 )
                    // InternalSheepDog.g:737:4: rule__When__TheStepTableAssignment_4_0
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
                    // InternalSheepDog.g:741:2: ( ( rule__When__TheDocStringAssignment_4_1 ) )
                    {
                    // InternalSheepDog.g:741:2: ( ( rule__When__TheDocStringAssignment_4_1 ) )
                    // InternalSheepDog.g:742:3: ( rule__When__TheDocStringAssignment_4_1 )
                    {
                     before(grammarAccess.getWhenAccess().getTheDocStringAssignment_4_1()); 
                    // InternalSheepDog.g:743:3: ( rule__When__TheDocStringAssignment_4_1 )
                    // InternalSheepDog.g:743:4: rule__When__TheDocStringAssignment_4_1
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
    // InternalSheepDog.g:751:1: rule__Then__Alternatives_4 : ( ( ( rule__Then__TheStepTableAssignment_4_0 ) ) | ( ( rule__Then__TheDocStringAssignment_4_1 ) ) );
    public final void rule__Then__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:755:1: ( ( ( rule__Then__TheStepTableAssignment_4_0 ) ) | ( ( rule__Then__TheDocStringAssignment_4_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            else if ( (LA7_0==23) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSheepDog.g:756:2: ( ( rule__Then__TheStepTableAssignment_4_0 ) )
                    {
                    // InternalSheepDog.g:756:2: ( ( rule__Then__TheStepTableAssignment_4_0 ) )
                    // InternalSheepDog.g:757:3: ( rule__Then__TheStepTableAssignment_4_0 )
                    {
                     before(grammarAccess.getThenAccess().getTheStepTableAssignment_4_0()); 
                    // InternalSheepDog.g:758:3: ( rule__Then__TheStepTableAssignment_4_0 )
                    // InternalSheepDog.g:758:4: rule__Then__TheStepTableAssignment_4_0
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
                    // InternalSheepDog.g:762:2: ( ( rule__Then__TheDocStringAssignment_4_1 ) )
                    {
                    // InternalSheepDog.g:762:2: ( ( rule__Then__TheDocStringAssignment_4_1 ) )
                    // InternalSheepDog.g:763:3: ( rule__Then__TheDocStringAssignment_4_1 )
                    {
                     before(grammarAccess.getThenAccess().getTheDocStringAssignment_4_1()); 
                    // InternalSheepDog.g:764:3: ( rule__Then__TheDocStringAssignment_4_1 )
                    // InternalSheepDog.g:764:4: rule__Then__TheDocStringAssignment_4_1
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
    // InternalSheepDog.g:772:1: rule__And__Alternatives_4 : ( ( ( rule__And__TheStepTableAssignment_4_0 ) ) | ( ( rule__And__TheDocStringAssignment_4_1 ) ) );
    public final void rule__And__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:776:1: ( ( ( rule__And__TheStepTableAssignment_4_0 ) ) | ( ( rule__And__TheDocStringAssignment_4_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSheepDog.g:777:2: ( ( rule__And__TheStepTableAssignment_4_0 ) )
                    {
                    // InternalSheepDog.g:777:2: ( ( rule__And__TheStepTableAssignment_4_0 ) )
                    // InternalSheepDog.g:778:3: ( rule__And__TheStepTableAssignment_4_0 )
                    {
                     before(grammarAccess.getAndAccess().getTheStepTableAssignment_4_0()); 
                    // InternalSheepDog.g:779:3: ( rule__And__TheStepTableAssignment_4_0 )
                    // InternalSheepDog.g:779:4: rule__And__TheStepTableAssignment_4_0
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
                    // InternalSheepDog.g:783:2: ( ( rule__And__TheDocStringAssignment_4_1 ) )
                    {
                    // InternalSheepDog.g:783:2: ( ( rule__And__TheDocStringAssignment_4_1 ) )
                    // InternalSheepDog.g:784:3: ( rule__And__TheDocStringAssignment_4_1 )
                    {
                     before(grammarAccess.getAndAccess().getTheDocStringAssignment_4_1()); 
                    // InternalSheepDog.g:785:3: ( rule__And__TheDocStringAssignment_4_1 )
                    // InternalSheepDog.g:785:4: rule__And__TheDocStringAssignment_4_1
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
    // InternalSheepDog.g:793:1: rule__StepObject__Group__0 : rule__StepObject__Group__0__Impl rule__StepObject__Group__1 ;
    public final void rule__StepObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:797:1: ( rule__StepObject__Group__0__Impl rule__StepObject__Group__1 )
            // InternalSheepDog.g:798:2: rule__StepObject__Group__0__Impl rule__StepObject__Group__1
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
    // InternalSheepDog.g:805:1: rule__StepObject__Group__0__Impl : ( '=' ) ;
    public final void rule__StepObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:809:1: ( ( '=' ) )
            // InternalSheepDog.g:810:1: ( '=' )
            {
            // InternalSheepDog.g:810:1: ( '=' )
            // InternalSheepDog.g:811:2: '='
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
    // InternalSheepDog.g:820:1: rule__StepObject__Group__1 : rule__StepObject__Group__1__Impl rule__StepObject__Group__2 ;
    public final void rule__StepObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:824:1: ( rule__StepObject__Group__1__Impl rule__StepObject__Group__2 )
            // InternalSheepDog.g:825:2: rule__StepObject__Group__1__Impl rule__StepObject__Group__2
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
    // InternalSheepDog.g:832:1: rule__StepObject__Group__1__Impl : ( 'Object:' ) ;
    public final void rule__StepObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:836:1: ( ( 'Object:' ) )
            // InternalSheepDog.g:837:1: ( 'Object:' )
            {
            // InternalSheepDog.g:837:1: ( 'Object:' )
            // InternalSheepDog.g:838:2: 'Object:'
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
    // InternalSheepDog.g:847:1: rule__StepObject__Group__2 : rule__StepObject__Group__2__Impl rule__StepObject__Group__3 ;
    public final void rule__StepObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:851:1: ( rule__StepObject__Group__2__Impl rule__StepObject__Group__3 )
            // InternalSheepDog.g:852:2: rule__StepObject__Group__2__Impl rule__StepObject__Group__3
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
    // InternalSheepDog.g:859:1: rule__StepObject__Group__2__Impl : ( ( rule__StepObject__NameAssignment_2 ) ) ;
    public final void rule__StepObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:863:1: ( ( ( rule__StepObject__NameAssignment_2 ) ) )
            // InternalSheepDog.g:864:1: ( ( rule__StepObject__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:864:1: ( ( rule__StepObject__NameAssignment_2 ) )
            // InternalSheepDog.g:865:2: ( rule__StepObject__NameAssignment_2 )
            {
             before(grammarAccess.getStepObjectAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:866:2: ( rule__StepObject__NameAssignment_2 )
            // InternalSheepDog.g:866:3: rule__StepObject__NameAssignment_2
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
    // InternalSheepDog.g:874:1: rule__StepObject__Group__3 : rule__StepObject__Group__3__Impl rule__StepObject__Group__4 ;
    public final void rule__StepObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:878:1: ( rule__StepObject__Group__3__Impl rule__StepObject__Group__4 )
            // InternalSheepDog.g:879:2: rule__StepObject__Group__3__Impl rule__StepObject__Group__4
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
    // InternalSheepDog.g:886:1: rule__StepObject__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__StepObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:890:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:891:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:891:1: ( RULE_EOL )
            // InternalSheepDog.g:892:2: RULE_EOL
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
    // InternalSheepDog.g:901:1: rule__StepObject__Group__4 : rule__StepObject__Group__4__Impl rule__StepObject__Group__5 ;
    public final void rule__StepObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:905:1: ( rule__StepObject__Group__4__Impl rule__StepObject__Group__5 )
            // InternalSheepDog.g:906:2: rule__StepObject__Group__4__Impl rule__StepObject__Group__5
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
    // InternalSheepDog.g:913:1: rule__StepObject__Group__4__Impl : ( ( rule__StepObject__StatementsAssignment_4 )* ) ;
    public final void rule__StepObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:917:1: ( ( ( rule__StepObject__StatementsAssignment_4 )* ) )
            // InternalSheepDog.g:918:1: ( ( rule__StepObject__StatementsAssignment_4 )* )
            {
            // InternalSheepDog.g:918:1: ( ( rule__StepObject__StatementsAssignment_4 )* )
            // InternalSheepDog.g:919:2: ( rule__StepObject__StatementsAssignment_4 )*
            {
             before(grammarAccess.getStepObjectAccess().getStatementsAssignment_4()); 
            // InternalSheepDog.g:920:2: ( rule__StepObject__StatementsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_WORD && LA9_0<=RULE_EOL)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSheepDog.g:920:3: rule__StepObject__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
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
    // InternalSheepDog.g:928:1: rule__StepObject__Group__5 : rule__StepObject__Group__5__Impl ;
    public final void rule__StepObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:932:1: ( rule__StepObject__Group__5__Impl )
            // InternalSheepDog.g:933:2: rule__StepObject__Group__5__Impl
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
    // InternalSheepDog.g:939:1: rule__StepObject__Group__5__Impl : ( ( rule__StepObject__StepDefinitionsAssignment_5 )* ) ;
    public final void rule__StepObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:943:1: ( ( ( rule__StepObject__StepDefinitionsAssignment_5 )* ) )
            // InternalSheepDog.g:944:1: ( ( rule__StepObject__StepDefinitionsAssignment_5 )* )
            {
            // InternalSheepDog.g:944:1: ( ( rule__StepObject__StepDefinitionsAssignment_5 )* )
            // InternalSheepDog.g:945:2: ( rule__StepObject__StepDefinitionsAssignment_5 )*
            {
             before(grammarAccess.getStepObjectAccess().getStepDefinitionsAssignment_5()); 
            // InternalSheepDog.g:946:2: ( rule__StepObject__StepDefinitionsAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==11) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSheepDog.g:946:3: rule__StepObject__StepDefinitionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
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
    // InternalSheepDog.g:955:1: rule__StepDefinition__Group__0 : rule__StepDefinition__Group__0__Impl rule__StepDefinition__Group__1 ;
    public final void rule__StepDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:959:1: ( rule__StepDefinition__Group__0__Impl rule__StepDefinition__Group__1 )
            // InternalSheepDog.g:960:2: rule__StepDefinition__Group__0__Impl rule__StepDefinition__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSheepDog.g:967:1: rule__StepDefinition__Group__0__Impl : ( '==' ) ;
    public final void rule__StepDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:971:1: ( ( '==' ) )
            // InternalSheepDog.g:972:1: ( '==' )
            {
            // InternalSheepDog.g:972:1: ( '==' )
            // InternalSheepDog.g:973:2: '=='
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
    // InternalSheepDog.g:982:1: rule__StepDefinition__Group__1 : rule__StepDefinition__Group__1__Impl rule__StepDefinition__Group__2 ;
    public final void rule__StepDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:986:1: ( rule__StepDefinition__Group__1__Impl rule__StepDefinition__Group__2 )
            // InternalSheepDog.g:987:2: rule__StepDefinition__Group__1__Impl rule__StepDefinition__Group__2
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
    // InternalSheepDog.g:994:1: rule__StepDefinition__Group__1__Impl : ( 'Definition:' ) ;
    public final void rule__StepDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:998:1: ( ( 'Definition:' ) )
            // InternalSheepDog.g:999:1: ( 'Definition:' )
            {
            // InternalSheepDog.g:999:1: ( 'Definition:' )
            // InternalSheepDog.g:1000:2: 'Definition:'
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
    // InternalSheepDog.g:1009:1: rule__StepDefinition__Group__2 : rule__StepDefinition__Group__2__Impl rule__StepDefinition__Group__3 ;
    public final void rule__StepDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1013:1: ( rule__StepDefinition__Group__2__Impl rule__StepDefinition__Group__3 )
            // InternalSheepDog.g:1014:2: rule__StepDefinition__Group__2__Impl rule__StepDefinition__Group__3
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
    // InternalSheepDog.g:1021:1: rule__StepDefinition__Group__2__Impl : ( ( rule__StepDefinition__NameAssignment_2 ) ) ;
    public final void rule__StepDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1025:1: ( ( ( rule__StepDefinition__NameAssignment_2 ) ) )
            // InternalSheepDog.g:1026:1: ( ( rule__StepDefinition__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:1026:1: ( ( rule__StepDefinition__NameAssignment_2 ) )
            // InternalSheepDog.g:1027:2: ( rule__StepDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getStepDefinitionAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:1028:2: ( rule__StepDefinition__NameAssignment_2 )
            // InternalSheepDog.g:1028:3: rule__StepDefinition__NameAssignment_2
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
    // InternalSheepDog.g:1036:1: rule__StepDefinition__Group__3 : rule__StepDefinition__Group__3__Impl rule__StepDefinition__Group__4 ;
    public final void rule__StepDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1040:1: ( rule__StepDefinition__Group__3__Impl rule__StepDefinition__Group__4 )
            // InternalSheepDog.g:1041:2: rule__StepDefinition__Group__3__Impl rule__StepDefinition__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalSheepDog.g:1048:1: rule__StepDefinition__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__StepDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1052:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:1053:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:1053:1: ( RULE_EOL )
            // InternalSheepDog.g:1054:2: RULE_EOL
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
    // InternalSheepDog.g:1063:1: rule__StepDefinition__Group__4 : rule__StepDefinition__Group__4__Impl rule__StepDefinition__Group__5 ;
    public final void rule__StepDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1067:1: ( rule__StepDefinition__Group__4__Impl rule__StepDefinition__Group__5 )
            // InternalSheepDog.g:1068:2: rule__StepDefinition__Group__4__Impl rule__StepDefinition__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalSheepDog.g:1075:1: rule__StepDefinition__Group__4__Impl : ( ( rule__StepDefinition__StatementsAssignment_4 )* ) ;
    public final void rule__StepDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1079:1: ( ( ( rule__StepDefinition__StatementsAssignment_4 )* ) )
            // InternalSheepDog.g:1080:1: ( ( rule__StepDefinition__StatementsAssignment_4 )* )
            {
            // InternalSheepDog.g:1080:1: ( ( rule__StepDefinition__StatementsAssignment_4 )* )
            // InternalSheepDog.g:1081:2: ( rule__StepDefinition__StatementsAssignment_4 )*
            {
             before(grammarAccess.getStepDefinitionAccess().getStatementsAssignment_4()); 
            // InternalSheepDog.g:1082:2: ( rule__StepDefinition__StatementsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_WORD && LA11_0<=RULE_EOL)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSheepDog.g:1082:3: rule__StepDefinition__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
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
    // InternalSheepDog.g:1090:1: rule__StepDefinition__Group__5 : rule__StepDefinition__Group__5__Impl ;
    public final void rule__StepDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1094:1: ( rule__StepDefinition__Group__5__Impl )
            // InternalSheepDog.g:1095:2: rule__StepDefinition__Group__5__Impl
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
    // InternalSheepDog.g:1101:1: rule__StepDefinition__Group__5__Impl : ( ( rule__StepDefinition__StepParametersAssignment_5 )* ) ;
    public final void rule__StepDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1105:1: ( ( ( rule__StepDefinition__StepParametersAssignment_5 )* ) )
            // InternalSheepDog.g:1106:1: ( ( rule__StepDefinition__StepParametersAssignment_5 )* )
            {
            // InternalSheepDog.g:1106:1: ( ( rule__StepDefinition__StepParametersAssignment_5 )* )
            // InternalSheepDog.g:1107:2: ( rule__StepDefinition__StepParametersAssignment_5 )*
            {
             before(grammarAccess.getStepDefinitionAccess().getStepParametersAssignment_5()); 
            // InternalSheepDog.g:1108:2: ( rule__StepDefinition__StepParametersAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==13) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSheepDog.g:1108:3: rule__StepDefinition__StepParametersAssignment_5
            	    {
            	    pushFollow(FOLLOW_12);
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
    // InternalSheepDog.g:1117:1: rule__StepParameters__Group__0 : rule__StepParameters__Group__0__Impl rule__StepParameters__Group__1 ;
    public final void rule__StepParameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1121:1: ( rule__StepParameters__Group__0__Impl rule__StepParameters__Group__1 )
            // InternalSheepDog.g:1122:2: rule__StepParameters__Group__0__Impl rule__StepParameters__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSheepDog.g:1129:1: rule__StepParameters__Group__0__Impl : ( '===' ) ;
    public final void rule__StepParameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1133:1: ( ( '===' ) )
            // InternalSheepDog.g:1134:1: ( '===' )
            {
            // InternalSheepDog.g:1134:1: ( '===' )
            // InternalSheepDog.g:1135:2: '==='
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
    // InternalSheepDog.g:1144:1: rule__StepParameters__Group__1 : rule__StepParameters__Group__1__Impl rule__StepParameters__Group__2 ;
    public final void rule__StepParameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1148:1: ( rule__StepParameters__Group__1__Impl rule__StepParameters__Group__2 )
            // InternalSheepDog.g:1149:2: rule__StepParameters__Group__1__Impl rule__StepParameters__Group__2
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
    // InternalSheepDog.g:1156:1: rule__StepParameters__Group__1__Impl : ( 'Parameters:' ) ;
    public final void rule__StepParameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1160:1: ( ( 'Parameters:' ) )
            // InternalSheepDog.g:1161:1: ( 'Parameters:' )
            {
            // InternalSheepDog.g:1161:1: ( 'Parameters:' )
            // InternalSheepDog.g:1162:2: 'Parameters:'
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
    // InternalSheepDog.g:1171:1: rule__StepParameters__Group__2 : rule__StepParameters__Group__2__Impl rule__StepParameters__Group__3 ;
    public final void rule__StepParameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1175:1: ( rule__StepParameters__Group__2__Impl rule__StepParameters__Group__3 )
            // InternalSheepDog.g:1176:2: rule__StepParameters__Group__2__Impl rule__StepParameters__Group__3
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
    // InternalSheepDog.g:1183:1: rule__StepParameters__Group__2__Impl : ( ( rule__StepParameters__NameAssignment_2 ) ) ;
    public final void rule__StepParameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1187:1: ( ( ( rule__StepParameters__NameAssignment_2 ) ) )
            // InternalSheepDog.g:1188:1: ( ( rule__StepParameters__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:1188:1: ( ( rule__StepParameters__NameAssignment_2 ) )
            // InternalSheepDog.g:1189:2: ( rule__StepParameters__NameAssignment_2 )
            {
             before(grammarAccess.getStepParametersAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:1190:2: ( rule__StepParameters__NameAssignment_2 )
            // InternalSheepDog.g:1190:3: rule__StepParameters__NameAssignment_2
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
    // InternalSheepDog.g:1198:1: rule__StepParameters__Group__3 : rule__StepParameters__Group__3__Impl rule__StepParameters__Group__4 ;
    public final void rule__StepParameters__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1202:1: ( rule__StepParameters__Group__3__Impl rule__StepParameters__Group__4 )
            // InternalSheepDog.g:1203:2: rule__StepParameters__Group__3__Impl rule__StepParameters__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalSheepDog.g:1210:1: rule__StepParameters__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__StepParameters__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1214:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:1215:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:1215:1: ( RULE_EOL )
            // InternalSheepDog.g:1216:2: RULE_EOL
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
    // InternalSheepDog.g:1225:1: rule__StepParameters__Group__4 : rule__StepParameters__Group__4__Impl rule__StepParameters__Group__5 ;
    public final void rule__StepParameters__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1229:1: ( rule__StepParameters__Group__4__Impl rule__StepParameters__Group__5 )
            // InternalSheepDog.g:1230:2: rule__StepParameters__Group__4__Impl rule__StepParameters__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalSheepDog.g:1237:1: rule__StepParameters__Group__4__Impl : ( ( rule__StepParameters__StatementsAssignment_4 )* ) ;
    public final void rule__StepParameters__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1241:1: ( ( ( rule__StepParameters__StatementsAssignment_4 )* ) )
            // InternalSheepDog.g:1242:1: ( ( rule__StepParameters__StatementsAssignment_4 )* )
            {
            // InternalSheepDog.g:1242:1: ( ( rule__StepParameters__StatementsAssignment_4 )* )
            // InternalSheepDog.g:1243:2: ( rule__StepParameters__StatementsAssignment_4 )*
            {
             before(grammarAccess.getStepParametersAccess().getStatementsAssignment_4()); 
            // InternalSheepDog.g:1244:2: ( rule__StepParameters__StatementsAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_WORD && LA13_0<=RULE_EOL)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSheepDog.g:1244:3: rule__StepParameters__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
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
    // InternalSheepDog.g:1252:1: rule__StepParameters__Group__5 : rule__StepParameters__Group__5__Impl ;
    public final void rule__StepParameters__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1256:1: ( rule__StepParameters__Group__5__Impl )
            // InternalSheepDog.g:1257:2: rule__StepParameters__Group__5__Impl
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
    // InternalSheepDog.g:1263:1: rule__StepParameters__Group__5__Impl : ( ( rule__StepParameters__ParametersTableAssignment_5 ) ) ;
    public final void rule__StepParameters__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1267:1: ( ( ( rule__StepParameters__ParametersTableAssignment_5 ) ) )
            // InternalSheepDog.g:1268:1: ( ( rule__StepParameters__ParametersTableAssignment_5 ) )
            {
            // InternalSheepDog.g:1268:1: ( ( rule__StepParameters__ParametersTableAssignment_5 ) )
            // InternalSheepDog.g:1269:2: ( rule__StepParameters__ParametersTableAssignment_5 )
            {
             before(grammarAccess.getStepParametersAccess().getParametersTableAssignment_5()); 
            // InternalSheepDog.g:1270:2: ( rule__StepParameters__ParametersTableAssignment_5 )
            // InternalSheepDog.g:1270:3: rule__StepParameters__ParametersTableAssignment_5
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
    // InternalSheepDog.g:1279:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1283:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalSheepDog.g:1284:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSheepDog.g:1291:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__TagsAssignment_0 )? ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1295:1: ( ( ( rule__Feature__TagsAssignment_0 )? ) )
            // InternalSheepDog.g:1296:1: ( ( rule__Feature__TagsAssignment_0 )? )
            {
            // InternalSheepDog.g:1296:1: ( ( rule__Feature__TagsAssignment_0 )? )
            // InternalSheepDog.g:1297:2: ( rule__Feature__TagsAssignment_0 )?
            {
             before(grammarAccess.getFeatureAccess().getTagsAssignment_0()); 
            // InternalSheepDog.g:1298:2: ( rule__Feature__TagsAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSheepDog.g:1298:3: rule__Feature__TagsAssignment_0
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
    // InternalSheepDog.g:1306:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1310:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalSheepDog.g:1311:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalSheepDog.g:1318:1: rule__Feature__Group__1__Impl : ( '=' ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1322:1: ( ( '=' ) )
            // InternalSheepDog.g:1323:1: ( '=' )
            {
            // InternalSheepDog.g:1323:1: ( '=' )
            // InternalSheepDog.g:1324:2: '='
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
    // InternalSheepDog.g:1333:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1337:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalSheepDog.g:1338:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
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
    // InternalSheepDog.g:1345:1: rule__Feature__Group__2__Impl : ( 'Feature:' ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1349:1: ( ( 'Feature:' ) )
            // InternalSheepDog.g:1350:1: ( 'Feature:' )
            {
            // InternalSheepDog.g:1350:1: ( 'Feature:' )
            // InternalSheepDog.g:1351:2: 'Feature:'
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
    // InternalSheepDog.g:1360:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1364:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalSheepDog.g:1365:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
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
    // InternalSheepDog.g:1372:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__NameAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1376:1: ( ( ( rule__Feature__NameAssignment_3 ) ) )
            // InternalSheepDog.g:1377:1: ( ( rule__Feature__NameAssignment_3 ) )
            {
            // InternalSheepDog.g:1377:1: ( ( rule__Feature__NameAssignment_3 ) )
            // InternalSheepDog.g:1378:2: ( rule__Feature__NameAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_3()); 
            // InternalSheepDog.g:1379:2: ( rule__Feature__NameAssignment_3 )
            // InternalSheepDog.g:1379:3: rule__Feature__NameAssignment_3
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
    // InternalSheepDog.g:1387:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl rule__Feature__Group__5 ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1391:1: ( rule__Feature__Group__4__Impl rule__Feature__Group__5 )
            // InternalSheepDog.g:1392:2: rule__Feature__Group__4__Impl rule__Feature__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalSheepDog.g:1399:1: rule__Feature__Group__4__Impl : ( RULE_EOL ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1403:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:1404:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:1404:1: ( RULE_EOL )
            // InternalSheepDog.g:1405:2: RULE_EOL
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
    // InternalSheepDog.g:1414:1: rule__Feature__Group__5 : rule__Feature__Group__5__Impl rule__Feature__Group__6 ;
    public final void rule__Feature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1418:1: ( rule__Feature__Group__5__Impl rule__Feature__Group__6 )
            // InternalSheepDog.g:1419:2: rule__Feature__Group__5__Impl rule__Feature__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalSheepDog.g:1426:1: rule__Feature__Group__5__Impl : ( ( rule__Feature__StatementsAssignment_5 )* ) ;
    public final void rule__Feature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1430:1: ( ( ( rule__Feature__StatementsAssignment_5 )* ) )
            // InternalSheepDog.g:1431:1: ( ( rule__Feature__StatementsAssignment_5 )* )
            {
            // InternalSheepDog.g:1431:1: ( ( rule__Feature__StatementsAssignment_5 )* )
            // InternalSheepDog.g:1432:2: ( rule__Feature__StatementsAssignment_5 )*
            {
             before(grammarAccess.getFeatureAccess().getStatementsAssignment_5()); 
            // InternalSheepDog.g:1433:2: ( rule__Feature__StatementsAssignment_5 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_WORD && LA15_0<=RULE_EOL)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSheepDog.g:1433:3: rule__Feature__StatementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
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
    // InternalSheepDog.g:1441:1: rule__Feature__Group__6 : rule__Feature__Group__6__Impl ;
    public final void rule__Feature__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1445:1: ( rule__Feature__Group__6__Impl )
            // InternalSheepDog.g:1446:2: rule__Feature__Group__6__Impl
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
    // InternalSheepDog.g:1452:1: rule__Feature__Group__6__Impl : ( ( rule__Feature__AbstractScenariosAssignment_6 )* ) ;
    public final void rule__Feature__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1456:1: ( ( ( rule__Feature__AbstractScenariosAssignment_6 )* ) )
            // InternalSheepDog.g:1457:1: ( ( rule__Feature__AbstractScenariosAssignment_6 )* )
            {
            // InternalSheepDog.g:1457:1: ( ( rule__Feature__AbstractScenariosAssignment_6 )* )
            // InternalSheepDog.g:1458:2: ( rule__Feature__AbstractScenariosAssignment_6 )*
            {
             before(grammarAccess.getFeatureAccess().getAbstractScenariosAssignment_6()); 
            // InternalSheepDog.g:1459:2: ( rule__Feature__AbstractScenariosAssignment_6 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==11||LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSheepDog.g:1459:3: rule__Feature__AbstractScenariosAssignment_6
            	    {
            	    pushFollow(FOLLOW_18);
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
    // InternalSheepDog.g:1468:1: rule__Background__Group__0 : rule__Background__Group__0__Impl rule__Background__Group__1 ;
    public final void rule__Background__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1472:1: ( rule__Background__Group__0__Impl rule__Background__Group__1 )
            // InternalSheepDog.g:1473:2: rule__Background__Group__0__Impl rule__Background__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSheepDog.g:1480:1: rule__Background__Group__0__Impl : ( ( rule__Background__TagsAssignment_0 )? ) ;
    public final void rule__Background__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1484:1: ( ( ( rule__Background__TagsAssignment_0 )? ) )
            // InternalSheepDog.g:1485:1: ( ( rule__Background__TagsAssignment_0 )? )
            {
            // InternalSheepDog.g:1485:1: ( ( rule__Background__TagsAssignment_0 )? )
            // InternalSheepDog.g:1486:2: ( rule__Background__TagsAssignment_0 )?
            {
             before(grammarAccess.getBackgroundAccess().getTagsAssignment_0()); 
            // InternalSheepDog.g:1487:2: ( rule__Background__TagsAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSheepDog.g:1487:3: rule__Background__TagsAssignment_0
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
    // InternalSheepDog.g:1495:1: rule__Background__Group__1 : rule__Background__Group__1__Impl rule__Background__Group__2 ;
    public final void rule__Background__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1499:1: ( rule__Background__Group__1__Impl rule__Background__Group__2 )
            // InternalSheepDog.g:1500:2: rule__Background__Group__1__Impl rule__Background__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalSheepDog.g:1507:1: rule__Background__Group__1__Impl : ( '==' ) ;
    public final void rule__Background__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1511:1: ( ( '==' ) )
            // InternalSheepDog.g:1512:1: ( '==' )
            {
            // InternalSheepDog.g:1512:1: ( '==' )
            // InternalSheepDog.g:1513:2: '=='
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
    // InternalSheepDog.g:1522:1: rule__Background__Group__2 : rule__Background__Group__2__Impl rule__Background__Group__3 ;
    public final void rule__Background__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1526:1: ( rule__Background__Group__2__Impl rule__Background__Group__3 )
            // InternalSheepDog.g:1527:2: rule__Background__Group__2__Impl rule__Background__Group__3
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
    // InternalSheepDog.g:1534:1: rule__Background__Group__2__Impl : ( 'Background:' ) ;
    public final void rule__Background__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1538:1: ( ( 'Background:' ) )
            // InternalSheepDog.g:1539:1: ( 'Background:' )
            {
            // InternalSheepDog.g:1539:1: ( 'Background:' )
            // InternalSheepDog.g:1540:2: 'Background:'
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
    // InternalSheepDog.g:1549:1: rule__Background__Group__3 : rule__Background__Group__3__Impl rule__Background__Group__4 ;
    public final void rule__Background__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1553:1: ( rule__Background__Group__3__Impl rule__Background__Group__4 )
            // InternalSheepDog.g:1554:2: rule__Background__Group__3__Impl rule__Background__Group__4
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
    // InternalSheepDog.g:1561:1: rule__Background__Group__3__Impl : ( ( rule__Background__NameAssignment_3 ) ) ;
    public final void rule__Background__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1565:1: ( ( ( rule__Background__NameAssignment_3 ) ) )
            // InternalSheepDog.g:1566:1: ( ( rule__Background__NameAssignment_3 ) )
            {
            // InternalSheepDog.g:1566:1: ( ( rule__Background__NameAssignment_3 ) )
            // InternalSheepDog.g:1567:2: ( rule__Background__NameAssignment_3 )
            {
             before(grammarAccess.getBackgroundAccess().getNameAssignment_3()); 
            // InternalSheepDog.g:1568:2: ( rule__Background__NameAssignment_3 )
            // InternalSheepDog.g:1568:3: rule__Background__NameAssignment_3
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
    // InternalSheepDog.g:1576:1: rule__Background__Group__4 : rule__Background__Group__4__Impl rule__Background__Group__5 ;
    public final void rule__Background__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1580:1: ( rule__Background__Group__4__Impl rule__Background__Group__5 )
            // InternalSheepDog.g:1581:2: rule__Background__Group__4__Impl rule__Background__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalSheepDog.g:1588:1: rule__Background__Group__4__Impl : ( RULE_EOL ) ;
    public final void rule__Background__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1592:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:1593:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:1593:1: ( RULE_EOL )
            // InternalSheepDog.g:1594:2: RULE_EOL
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
    // InternalSheepDog.g:1603:1: rule__Background__Group__5 : rule__Background__Group__5__Impl rule__Background__Group__6 ;
    public final void rule__Background__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1607:1: ( rule__Background__Group__5__Impl rule__Background__Group__6 )
            // InternalSheepDog.g:1608:2: rule__Background__Group__5__Impl rule__Background__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalSheepDog.g:1615:1: rule__Background__Group__5__Impl : ( ( rule__Background__StatementsAssignment_5 )* ) ;
    public final void rule__Background__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1619:1: ( ( ( rule__Background__StatementsAssignment_5 )* ) )
            // InternalSheepDog.g:1620:1: ( ( rule__Background__StatementsAssignment_5 )* )
            {
            // InternalSheepDog.g:1620:1: ( ( rule__Background__StatementsAssignment_5 )* )
            // InternalSheepDog.g:1621:2: ( rule__Background__StatementsAssignment_5 )*
            {
             before(grammarAccess.getBackgroundAccess().getStatementsAssignment_5()); 
            // InternalSheepDog.g:1622:2: ( rule__Background__StatementsAssignment_5 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_WORD && LA18_0<=RULE_EOL)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSheepDog.g:1622:3: rule__Background__StatementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
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
    // InternalSheepDog.g:1630:1: rule__Background__Group__6 : rule__Background__Group__6__Impl ;
    public final void rule__Background__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1634:1: ( rule__Background__Group__6__Impl )
            // InternalSheepDog.g:1635:2: rule__Background__Group__6__Impl
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
    // InternalSheepDog.g:1641:1: rule__Background__Group__6__Impl : ( ( rule__Background__StepsAssignment_6 )* ) ;
    public final void rule__Background__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1645:1: ( ( ( rule__Background__StepsAssignment_6 )* ) )
            // InternalSheepDog.g:1646:1: ( ( rule__Background__StepsAssignment_6 )* )
            {
            // InternalSheepDog.g:1646:1: ( ( rule__Background__StepsAssignment_6 )* )
            // InternalSheepDog.g:1647:2: ( rule__Background__StepsAssignment_6 )*
            {
             before(grammarAccess.getBackgroundAccess().getStepsAssignment_6()); 
            // InternalSheepDog.g:1648:2: ( rule__Background__StepsAssignment_6 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==13) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSheepDog.g:1648:3: rule__Background__StepsAssignment_6
            	    {
            	    pushFollow(FOLLOW_12);
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
    // InternalSheepDog.g:1657:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1661:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalSheepDog.g:1662:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSheepDog.g:1669:1: rule__Scenario__Group__0__Impl : ( ( rule__Scenario__TagsAssignment_0 )? ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1673:1: ( ( ( rule__Scenario__TagsAssignment_0 )? ) )
            // InternalSheepDog.g:1674:1: ( ( rule__Scenario__TagsAssignment_0 )? )
            {
            // InternalSheepDog.g:1674:1: ( ( rule__Scenario__TagsAssignment_0 )? )
            // InternalSheepDog.g:1675:2: ( rule__Scenario__TagsAssignment_0 )?
            {
             before(grammarAccess.getScenarioAccess().getTagsAssignment_0()); 
            // InternalSheepDog.g:1676:2: ( rule__Scenario__TagsAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSheepDog.g:1676:3: rule__Scenario__TagsAssignment_0
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
    // InternalSheepDog.g:1684:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1688:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalSheepDog.g:1689:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalSheepDog.g:1696:1: rule__Scenario__Group__1__Impl : ( '==' ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1700:1: ( ( '==' ) )
            // InternalSheepDog.g:1701:1: ( '==' )
            {
            // InternalSheepDog.g:1701:1: ( '==' )
            // InternalSheepDog.g:1702:2: '=='
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
    // InternalSheepDog.g:1711:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1715:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // InternalSheepDog.g:1716:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
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
    // InternalSheepDog.g:1723:1: rule__Scenario__Group__2__Impl : ( 'Scenario:' ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1727:1: ( ( 'Scenario:' ) )
            // InternalSheepDog.g:1728:1: ( 'Scenario:' )
            {
            // InternalSheepDog.g:1728:1: ( 'Scenario:' )
            // InternalSheepDog.g:1729:2: 'Scenario:'
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
    // InternalSheepDog.g:1738:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl rule__Scenario__Group__4 ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1742:1: ( rule__Scenario__Group__3__Impl rule__Scenario__Group__4 )
            // InternalSheepDog.g:1743:2: rule__Scenario__Group__3__Impl rule__Scenario__Group__4
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
    // InternalSheepDog.g:1750:1: rule__Scenario__Group__3__Impl : ( ( rule__Scenario__NameAssignment_3 ) ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1754:1: ( ( ( rule__Scenario__NameAssignment_3 ) ) )
            // InternalSheepDog.g:1755:1: ( ( rule__Scenario__NameAssignment_3 ) )
            {
            // InternalSheepDog.g:1755:1: ( ( rule__Scenario__NameAssignment_3 ) )
            // InternalSheepDog.g:1756:2: ( rule__Scenario__NameAssignment_3 )
            {
             before(grammarAccess.getScenarioAccess().getNameAssignment_3()); 
            // InternalSheepDog.g:1757:2: ( rule__Scenario__NameAssignment_3 )
            // InternalSheepDog.g:1757:3: rule__Scenario__NameAssignment_3
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
    // InternalSheepDog.g:1765:1: rule__Scenario__Group__4 : rule__Scenario__Group__4__Impl rule__Scenario__Group__5 ;
    public final void rule__Scenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1769:1: ( rule__Scenario__Group__4__Impl rule__Scenario__Group__5 )
            // InternalSheepDog.g:1770:2: rule__Scenario__Group__4__Impl rule__Scenario__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalSheepDog.g:1777:1: rule__Scenario__Group__4__Impl : ( RULE_EOL ) ;
    public final void rule__Scenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1781:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:1782:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:1782:1: ( RULE_EOL )
            // InternalSheepDog.g:1783:2: RULE_EOL
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
    // InternalSheepDog.g:1792:1: rule__Scenario__Group__5 : rule__Scenario__Group__5__Impl rule__Scenario__Group__6 ;
    public final void rule__Scenario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1796:1: ( rule__Scenario__Group__5__Impl rule__Scenario__Group__6 )
            // InternalSheepDog.g:1797:2: rule__Scenario__Group__5__Impl rule__Scenario__Group__6
            {
            pushFollow(FOLLOW_22);
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
    // InternalSheepDog.g:1804:1: rule__Scenario__Group__5__Impl : ( ( rule__Scenario__StatementsAssignment_5 )* ) ;
    public final void rule__Scenario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1808:1: ( ( ( rule__Scenario__StatementsAssignment_5 )* ) )
            // InternalSheepDog.g:1809:1: ( ( rule__Scenario__StatementsAssignment_5 )* )
            {
            // InternalSheepDog.g:1809:1: ( ( rule__Scenario__StatementsAssignment_5 )* )
            // InternalSheepDog.g:1810:2: ( rule__Scenario__StatementsAssignment_5 )*
            {
             before(grammarAccess.getScenarioAccess().getStatementsAssignment_5()); 
            // InternalSheepDog.g:1811:2: ( rule__Scenario__StatementsAssignment_5 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_WORD && LA21_0<=RULE_EOL)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSheepDog.g:1811:3: rule__Scenario__StatementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
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
    // InternalSheepDog.g:1819:1: rule__Scenario__Group__6 : rule__Scenario__Group__6__Impl rule__Scenario__Group__7 ;
    public final void rule__Scenario__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1823:1: ( rule__Scenario__Group__6__Impl rule__Scenario__Group__7 )
            // InternalSheepDog.g:1824:2: rule__Scenario__Group__6__Impl rule__Scenario__Group__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalSheepDog.g:1831:1: rule__Scenario__Group__6__Impl : ( ( rule__Scenario__StepsAssignment_6 )* ) ;
    public final void rule__Scenario__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1835:1: ( ( ( rule__Scenario__StepsAssignment_6 )* ) )
            // InternalSheepDog.g:1836:1: ( ( rule__Scenario__StepsAssignment_6 )* )
            {
            // InternalSheepDog.g:1836:1: ( ( rule__Scenario__StepsAssignment_6 )* )
            // InternalSheepDog.g:1837:2: ( rule__Scenario__StepsAssignment_6 )*
            {
             before(grammarAccess.getScenarioAccess().getStepsAssignment_6()); 
            // InternalSheepDog.g:1838:2: ( rule__Scenario__StepsAssignment_6 )*
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
            	    // InternalSheepDog.g:1838:3: rule__Scenario__StepsAssignment_6
            	    {
            	    pushFollow(FOLLOW_12);
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
    // InternalSheepDog.g:1846:1: rule__Scenario__Group__7 : rule__Scenario__Group__7__Impl ;
    public final void rule__Scenario__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1850:1: ( rule__Scenario__Group__7__Impl )
            // InternalSheepDog.g:1851:2: rule__Scenario__Group__7__Impl
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
    // InternalSheepDog.g:1857:1: rule__Scenario__Group__7__Impl : ( ( rule__Scenario__ExamplesAssignment_7 )* ) ;
    public final void rule__Scenario__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1861:1: ( ( ( rule__Scenario__ExamplesAssignment_7 )* ) )
            // InternalSheepDog.g:1862:1: ( ( rule__Scenario__ExamplesAssignment_7 )* )
            {
            // InternalSheepDog.g:1862:1: ( ( rule__Scenario__ExamplesAssignment_7 )* )
            // InternalSheepDog.g:1863:2: ( rule__Scenario__ExamplesAssignment_7 )*
            {
             before(grammarAccess.getScenarioAccess().getExamplesAssignment_7()); 
            // InternalSheepDog.g:1864:2: ( rule__Scenario__ExamplesAssignment_7 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==27) ) {
                    int LA23_2 = input.LA(2);

                    if ( (LA23_2==RULE_WORD) ) {
                        int LA23_4 = input.LA(3);

                        if ( (LA23_4==28) ) {
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
            	    // InternalSheepDog.g:1864:3: rule__Scenario__ExamplesAssignment_7
            	    {
            	    pushFollow(FOLLOW_23);
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
    // InternalSheepDog.g:1873:1: rule__Examples__Group__0 : rule__Examples__Group__0__Impl rule__Examples__Group__1 ;
    public final void rule__Examples__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1877:1: ( rule__Examples__Group__0__Impl rule__Examples__Group__1 )
            // InternalSheepDog.g:1878:2: rule__Examples__Group__0__Impl rule__Examples__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalSheepDog.g:1885:1: rule__Examples__Group__0__Impl : ( ( rule__Examples__TagsAssignment_0 )? ) ;
    public final void rule__Examples__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1889:1: ( ( ( rule__Examples__TagsAssignment_0 )? ) )
            // InternalSheepDog.g:1890:1: ( ( rule__Examples__TagsAssignment_0 )? )
            {
            // InternalSheepDog.g:1890:1: ( ( rule__Examples__TagsAssignment_0 )? )
            // InternalSheepDog.g:1891:2: ( rule__Examples__TagsAssignment_0 )?
            {
             before(grammarAccess.getExamplesAccess().getTagsAssignment_0()); 
            // InternalSheepDog.g:1892:2: ( rule__Examples__TagsAssignment_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==27) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSheepDog.g:1892:3: rule__Examples__TagsAssignment_0
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
    // InternalSheepDog.g:1900:1: rule__Examples__Group__1 : rule__Examples__Group__1__Impl rule__Examples__Group__2 ;
    public final void rule__Examples__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1904:1: ( rule__Examples__Group__1__Impl rule__Examples__Group__2 )
            // InternalSheepDog.g:1905:2: rule__Examples__Group__1__Impl rule__Examples__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalSheepDog.g:1912:1: rule__Examples__Group__1__Impl : ( '===' ) ;
    public final void rule__Examples__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1916:1: ( ( '===' ) )
            // InternalSheepDog.g:1917:1: ( '===' )
            {
            // InternalSheepDog.g:1917:1: ( '===' )
            // InternalSheepDog.g:1918:2: '==='
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
    // InternalSheepDog.g:1927:1: rule__Examples__Group__2 : rule__Examples__Group__2__Impl rule__Examples__Group__3 ;
    public final void rule__Examples__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1931:1: ( rule__Examples__Group__2__Impl rule__Examples__Group__3 )
            // InternalSheepDog.g:1932:2: rule__Examples__Group__2__Impl rule__Examples__Group__3
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
    // InternalSheepDog.g:1939:1: rule__Examples__Group__2__Impl : ( 'Examples:' ) ;
    public final void rule__Examples__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1943:1: ( ( 'Examples:' ) )
            // InternalSheepDog.g:1944:1: ( 'Examples:' )
            {
            // InternalSheepDog.g:1944:1: ( 'Examples:' )
            // InternalSheepDog.g:1945:2: 'Examples:'
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
    // InternalSheepDog.g:1954:1: rule__Examples__Group__3 : rule__Examples__Group__3__Impl rule__Examples__Group__4 ;
    public final void rule__Examples__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1958:1: ( rule__Examples__Group__3__Impl rule__Examples__Group__4 )
            // InternalSheepDog.g:1959:2: rule__Examples__Group__3__Impl rule__Examples__Group__4
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
    // InternalSheepDog.g:1966:1: rule__Examples__Group__3__Impl : ( ( rule__Examples__NameAssignment_3 ) ) ;
    public final void rule__Examples__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1970:1: ( ( ( rule__Examples__NameAssignment_3 ) ) )
            // InternalSheepDog.g:1971:1: ( ( rule__Examples__NameAssignment_3 ) )
            {
            // InternalSheepDog.g:1971:1: ( ( rule__Examples__NameAssignment_3 ) )
            // InternalSheepDog.g:1972:2: ( rule__Examples__NameAssignment_3 )
            {
             before(grammarAccess.getExamplesAccess().getNameAssignment_3()); 
            // InternalSheepDog.g:1973:2: ( rule__Examples__NameAssignment_3 )
            // InternalSheepDog.g:1973:3: rule__Examples__NameAssignment_3
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
    // InternalSheepDog.g:1981:1: rule__Examples__Group__4 : rule__Examples__Group__4__Impl rule__Examples__Group__5 ;
    public final void rule__Examples__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1985:1: ( rule__Examples__Group__4__Impl rule__Examples__Group__5 )
            // InternalSheepDog.g:1986:2: rule__Examples__Group__4__Impl rule__Examples__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalSheepDog.g:1993:1: rule__Examples__Group__4__Impl : ( RULE_EOL ) ;
    public final void rule__Examples__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1997:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:1998:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:1998:1: ( RULE_EOL )
            // InternalSheepDog.g:1999:2: RULE_EOL
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
    // InternalSheepDog.g:2008:1: rule__Examples__Group__5 : rule__Examples__Group__5__Impl rule__Examples__Group__6 ;
    public final void rule__Examples__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2012:1: ( rule__Examples__Group__5__Impl rule__Examples__Group__6 )
            // InternalSheepDog.g:2013:2: rule__Examples__Group__5__Impl rule__Examples__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalSheepDog.g:2020:1: rule__Examples__Group__5__Impl : ( ( rule__Examples__StatementsAssignment_5 )* ) ;
    public final void rule__Examples__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2024:1: ( ( ( rule__Examples__StatementsAssignment_5 )* ) )
            // InternalSheepDog.g:2025:1: ( ( rule__Examples__StatementsAssignment_5 )* )
            {
            // InternalSheepDog.g:2025:1: ( ( rule__Examples__StatementsAssignment_5 )* )
            // InternalSheepDog.g:2026:2: ( rule__Examples__StatementsAssignment_5 )*
            {
             before(grammarAccess.getExamplesAccess().getStatementsAssignment_5()); 
            // InternalSheepDog.g:2027:2: ( rule__Examples__StatementsAssignment_5 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_WORD && LA25_0<=RULE_EOL)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSheepDog.g:2027:3: rule__Examples__StatementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
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
    // InternalSheepDog.g:2035:1: rule__Examples__Group__6 : rule__Examples__Group__6__Impl ;
    public final void rule__Examples__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2039:1: ( rule__Examples__Group__6__Impl )
            // InternalSheepDog.g:2040:2: rule__Examples__Group__6__Impl
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
    // InternalSheepDog.g:2046:1: rule__Examples__Group__6__Impl : ( ( rule__Examples__TheExamplesTableAssignment_6 ) ) ;
    public final void rule__Examples__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2050:1: ( ( ( rule__Examples__TheExamplesTableAssignment_6 ) ) )
            // InternalSheepDog.g:2051:1: ( ( rule__Examples__TheExamplesTableAssignment_6 ) )
            {
            // InternalSheepDog.g:2051:1: ( ( rule__Examples__TheExamplesTableAssignment_6 ) )
            // InternalSheepDog.g:2052:2: ( rule__Examples__TheExamplesTableAssignment_6 )
            {
             before(grammarAccess.getExamplesAccess().getTheExamplesTableAssignment_6()); 
            // InternalSheepDog.g:2053:2: ( rule__Examples__TheExamplesTableAssignment_6 )
            // InternalSheepDog.g:2053:3: rule__Examples__TheExamplesTableAssignment_6
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
    // InternalSheepDog.g:2062:1: rule__Given__Group__0 : rule__Given__Group__0__Impl rule__Given__Group__1 ;
    public final void rule__Given__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2066:1: ( rule__Given__Group__0__Impl rule__Given__Group__1 )
            // InternalSheepDog.g:2067:2: rule__Given__Group__0__Impl rule__Given__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalSheepDog.g:2074:1: rule__Given__Group__0__Impl : ( '===' ) ;
    public final void rule__Given__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2078:1: ( ( '===' ) )
            // InternalSheepDog.g:2079:1: ( '===' )
            {
            // InternalSheepDog.g:2079:1: ( '===' )
            // InternalSheepDog.g:2080:2: '==='
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
    // InternalSheepDog.g:2089:1: rule__Given__Group__1 : rule__Given__Group__1__Impl rule__Given__Group__2 ;
    public final void rule__Given__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2093:1: ( rule__Given__Group__1__Impl rule__Given__Group__2 )
            // InternalSheepDog.g:2094:2: rule__Given__Group__1__Impl rule__Given__Group__2
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
    // InternalSheepDog.g:2101:1: rule__Given__Group__1__Impl : ( 'Given' ) ;
    public final void rule__Given__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2105:1: ( ( 'Given' ) )
            // InternalSheepDog.g:2106:1: ( 'Given' )
            {
            // InternalSheepDog.g:2106:1: ( 'Given' )
            // InternalSheepDog.g:2107:2: 'Given'
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
    // InternalSheepDog.g:2116:1: rule__Given__Group__2 : rule__Given__Group__2__Impl rule__Given__Group__3 ;
    public final void rule__Given__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2120:1: ( rule__Given__Group__2__Impl rule__Given__Group__3 )
            // InternalSheepDog.g:2121:2: rule__Given__Group__2__Impl rule__Given__Group__3
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
    // InternalSheepDog.g:2128:1: rule__Given__Group__2__Impl : ( ( rule__Given__NameAssignment_2 ) ) ;
    public final void rule__Given__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2132:1: ( ( ( rule__Given__NameAssignment_2 ) ) )
            // InternalSheepDog.g:2133:1: ( ( rule__Given__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:2133:1: ( ( rule__Given__NameAssignment_2 ) )
            // InternalSheepDog.g:2134:2: ( rule__Given__NameAssignment_2 )
            {
             before(grammarAccess.getGivenAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:2135:2: ( rule__Given__NameAssignment_2 )
            // InternalSheepDog.g:2135:3: rule__Given__NameAssignment_2
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
    // InternalSheepDog.g:2143:1: rule__Given__Group__3 : rule__Given__Group__3__Impl rule__Given__Group__4 ;
    public final void rule__Given__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2147:1: ( rule__Given__Group__3__Impl rule__Given__Group__4 )
            // InternalSheepDog.g:2148:2: rule__Given__Group__3__Impl rule__Given__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalSheepDog.g:2155:1: rule__Given__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Given__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2159:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2160:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2160:1: ( RULE_EOL )
            // InternalSheepDog.g:2161:2: RULE_EOL
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
    // InternalSheepDog.g:2170:1: rule__Given__Group__4 : rule__Given__Group__4__Impl ;
    public final void rule__Given__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2174:1: ( rule__Given__Group__4__Impl )
            // InternalSheepDog.g:2175:2: rule__Given__Group__4__Impl
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
    // InternalSheepDog.g:2181:1: rule__Given__Group__4__Impl : ( ( rule__Given__Alternatives_4 )? ) ;
    public final void rule__Given__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2185:1: ( ( ( rule__Given__Alternatives_4 )? ) )
            // InternalSheepDog.g:2186:1: ( ( rule__Given__Alternatives_4 )? )
            {
            // InternalSheepDog.g:2186:1: ( ( rule__Given__Alternatives_4 )? )
            // InternalSheepDog.g:2187:2: ( rule__Given__Alternatives_4 )?
            {
             before(grammarAccess.getGivenAccess().getAlternatives_4()); 
            // InternalSheepDog.g:2188:2: ( rule__Given__Alternatives_4 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=23 && LA26_0<=24)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSheepDog.g:2188:3: rule__Given__Alternatives_4
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
    // InternalSheepDog.g:2197:1: rule__When__Group__0 : rule__When__Group__0__Impl rule__When__Group__1 ;
    public final void rule__When__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2201:1: ( rule__When__Group__0__Impl rule__When__Group__1 )
            // InternalSheepDog.g:2202:2: rule__When__Group__0__Impl rule__When__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalSheepDog.g:2209:1: rule__When__Group__0__Impl : ( '===' ) ;
    public final void rule__When__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2213:1: ( ( '===' ) )
            // InternalSheepDog.g:2214:1: ( '===' )
            {
            // InternalSheepDog.g:2214:1: ( '===' )
            // InternalSheepDog.g:2215:2: '==='
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
    // InternalSheepDog.g:2224:1: rule__When__Group__1 : rule__When__Group__1__Impl rule__When__Group__2 ;
    public final void rule__When__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2228:1: ( rule__When__Group__1__Impl rule__When__Group__2 )
            // InternalSheepDog.g:2229:2: rule__When__Group__1__Impl rule__When__Group__2
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
    // InternalSheepDog.g:2236:1: rule__When__Group__1__Impl : ( 'When' ) ;
    public final void rule__When__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2240:1: ( ( 'When' ) )
            // InternalSheepDog.g:2241:1: ( 'When' )
            {
            // InternalSheepDog.g:2241:1: ( 'When' )
            // InternalSheepDog.g:2242:2: 'When'
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
    // InternalSheepDog.g:2251:1: rule__When__Group__2 : rule__When__Group__2__Impl rule__When__Group__3 ;
    public final void rule__When__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2255:1: ( rule__When__Group__2__Impl rule__When__Group__3 )
            // InternalSheepDog.g:2256:2: rule__When__Group__2__Impl rule__When__Group__3
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
    // InternalSheepDog.g:2263:1: rule__When__Group__2__Impl : ( ( rule__When__NameAssignment_2 ) ) ;
    public final void rule__When__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2267:1: ( ( ( rule__When__NameAssignment_2 ) ) )
            // InternalSheepDog.g:2268:1: ( ( rule__When__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:2268:1: ( ( rule__When__NameAssignment_2 ) )
            // InternalSheepDog.g:2269:2: ( rule__When__NameAssignment_2 )
            {
             before(grammarAccess.getWhenAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:2270:2: ( rule__When__NameAssignment_2 )
            // InternalSheepDog.g:2270:3: rule__When__NameAssignment_2
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
    // InternalSheepDog.g:2278:1: rule__When__Group__3 : rule__When__Group__3__Impl rule__When__Group__4 ;
    public final void rule__When__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2282:1: ( rule__When__Group__3__Impl rule__When__Group__4 )
            // InternalSheepDog.g:2283:2: rule__When__Group__3__Impl rule__When__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalSheepDog.g:2290:1: rule__When__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__When__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2294:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2295:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2295:1: ( RULE_EOL )
            // InternalSheepDog.g:2296:2: RULE_EOL
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
    // InternalSheepDog.g:2305:1: rule__When__Group__4 : rule__When__Group__4__Impl ;
    public final void rule__When__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2309:1: ( rule__When__Group__4__Impl )
            // InternalSheepDog.g:2310:2: rule__When__Group__4__Impl
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
    // InternalSheepDog.g:2316:1: rule__When__Group__4__Impl : ( ( rule__When__Alternatives_4 )? ) ;
    public final void rule__When__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2320:1: ( ( ( rule__When__Alternatives_4 )? ) )
            // InternalSheepDog.g:2321:1: ( ( rule__When__Alternatives_4 )? )
            {
            // InternalSheepDog.g:2321:1: ( ( rule__When__Alternatives_4 )? )
            // InternalSheepDog.g:2322:2: ( rule__When__Alternatives_4 )?
            {
             before(grammarAccess.getWhenAccess().getAlternatives_4()); 
            // InternalSheepDog.g:2323:2: ( rule__When__Alternatives_4 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=23 && LA27_0<=24)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSheepDog.g:2323:3: rule__When__Alternatives_4
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
    // InternalSheepDog.g:2332:1: rule__Then__Group__0 : rule__Then__Group__0__Impl rule__Then__Group__1 ;
    public final void rule__Then__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2336:1: ( rule__Then__Group__0__Impl rule__Then__Group__1 )
            // InternalSheepDog.g:2337:2: rule__Then__Group__0__Impl rule__Then__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalSheepDog.g:2344:1: rule__Then__Group__0__Impl : ( '===' ) ;
    public final void rule__Then__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2348:1: ( ( '===' ) )
            // InternalSheepDog.g:2349:1: ( '===' )
            {
            // InternalSheepDog.g:2349:1: ( '===' )
            // InternalSheepDog.g:2350:2: '==='
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
    // InternalSheepDog.g:2359:1: rule__Then__Group__1 : rule__Then__Group__1__Impl rule__Then__Group__2 ;
    public final void rule__Then__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2363:1: ( rule__Then__Group__1__Impl rule__Then__Group__2 )
            // InternalSheepDog.g:2364:2: rule__Then__Group__1__Impl rule__Then__Group__2
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
    // InternalSheepDog.g:2371:1: rule__Then__Group__1__Impl : ( 'Then' ) ;
    public final void rule__Then__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2375:1: ( ( 'Then' ) )
            // InternalSheepDog.g:2376:1: ( 'Then' )
            {
            // InternalSheepDog.g:2376:1: ( 'Then' )
            // InternalSheepDog.g:2377:2: 'Then'
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
    // InternalSheepDog.g:2386:1: rule__Then__Group__2 : rule__Then__Group__2__Impl rule__Then__Group__3 ;
    public final void rule__Then__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2390:1: ( rule__Then__Group__2__Impl rule__Then__Group__3 )
            // InternalSheepDog.g:2391:2: rule__Then__Group__2__Impl rule__Then__Group__3
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
    // InternalSheepDog.g:2398:1: rule__Then__Group__2__Impl : ( ( rule__Then__NameAssignment_2 ) ) ;
    public final void rule__Then__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2402:1: ( ( ( rule__Then__NameAssignment_2 ) ) )
            // InternalSheepDog.g:2403:1: ( ( rule__Then__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:2403:1: ( ( rule__Then__NameAssignment_2 ) )
            // InternalSheepDog.g:2404:2: ( rule__Then__NameAssignment_2 )
            {
             before(grammarAccess.getThenAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:2405:2: ( rule__Then__NameAssignment_2 )
            // InternalSheepDog.g:2405:3: rule__Then__NameAssignment_2
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
    // InternalSheepDog.g:2413:1: rule__Then__Group__3 : rule__Then__Group__3__Impl rule__Then__Group__4 ;
    public final void rule__Then__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2417:1: ( rule__Then__Group__3__Impl rule__Then__Group__4 )
            // InternalSheepDog.g:2418:2: rule__Then__Group__3__Impl rule__Then__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalSheepDog.g:2425:1: rule__Then__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Then__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2429:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2430:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2430:1: ( RULE_EOL )
            // InternalSheepDog.g:2431:2: RULE_EOL
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
    // InternalSheepDog.g:2440:1: rule__Then__Group__4 : rule__Then__Group__4__Impl ;
    public final void rule__Then__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2444:1: ( rule__Then__Group__4__Impl )
            // InternalSheepDog.g:2445:2: rule__Then__Group__4__Impl
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
    // InternalSheepDog.g:2451:1: rule__Then__Group__4__Impl : ( ( rule__Then__Alternatives_4 )? ) ;
    public final void rule__Then__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2455:1: ( ( ( rule__Then__Alternatives_4 )? ) )
            // InternalSheepDog.g:2456:1: ( ( rule__Then__Alternatives_4 )? )
            {
            // InternalSheepDog.g:2456:1: ( ( rule__Then__Alternatives_4 )? )
            // InternalSheepDog.g:2457:2: ( rule__Then__Alternatives_4 )?
            {
             before(grammarAccess.getThenAccess().getAlternatives_4()); 
            // InternalSheepDog.g:2458:2: ( rule__Then__Alternatives_4 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=23 && LA28_0<=24)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSheepDog.g:2458:3: rule__Then__Alternatives_4
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
    // InternalSheepDog.g:2467:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2471:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalSheepDog.g:2472:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalSheepDog.g:2479:1: rule__And__Group__0__Impl : ( '===' ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2483:1: ( ( '===' ) )
            // InternalSheepDog.g:2484:1: ( '===' )
            {
            // InternalSheepDog.g:2484:1: ( '===' )
            // InternalSheepDog.g:2485:2: '==='
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
    // InternalSheepDog.g:2494:1: rule__And__Group__1 : rule__And__Group__1__Impl rule__And__Group__2 ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2498:1: ( rule__And__Group__1__Impl rule__And__Group__2 )
            // InternalSheepDog.g:2499:2: rule__And__Group__1__Impl rule__And__Group__2
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
    // InternalSheepDog.g:2506:1: rule__And__Group__1__Impl : ( 'And' ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2510:1: ( ( 'And' ) )
            // InternalSheepDog.g:2511:1: ( 'And' )
            {
            // InternalSheepDog.g:2511:1: ( 'And' )
            // InternalSheepDog.g:2512:2: 'And'
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
    // InternalSheepDog.g:2521:1: rule__And__Group__2 : rule__And__Group__2__Impl rule__And__Group__3 ;
    public final void rule__And__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2525:1: ( rule__And__Group__2__Impl rule__And__Group__3 )
            // InternalSheepDog.g:2526:2: rule__And__Group__2__Impl rule__And__Group__3
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
    // InternalSheepDog.g:2533:1: rule__And__Group__2__Impl : ( ( rule__And__NameAssignment_2 ) ) ;
    public final void rule__And__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2537:1: ( ( ( rule__And__NameAssignment_2 ) ) )
            // InternalSheepDog.g:2538:1: ( ( rule__And__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:2538:1: ( ( rule__And__NameAssignment_2 ) )
            // InternalSheepDog.g:2539:2: ( rule__And__NameAssignment_2 )
            {
             before(grammarAccess.getAndAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:2540:2: ( rule__And__NameAssignment_2 )
            // InternalSheepDog.g:2540:3: rule__And__NameAssignment_2
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
    // InternalSheepDog.g:2548:1: rule__And__Group__3 : rule__And__Group__3__Impl rule__And__Group__4 ;
    public final void rule__And__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2552:1: ( rule__And__Group__3__Impl rule__And__Group__4 )
            // InternalSheepDog.g:2553:2: rule__And__Group__3__Impl rule__And__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalSheepDog.g:2560:1: rule__And__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__And__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2564:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2565:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2565:1: ( RULE_EOL )
            // InternalSheepDog.g:2566:2: RULE_EOL
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
    // InternalSheepDog.g:2575:1: rule__And__Group__4 : rule__And__Group__4__Impl ;
    public final void rule__And__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2579:1: ( rule__And__Group__4__Impl )
            // InternalSheepDog.g:2580:2: rule__And__Group__4__Impl
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
    // InternalSheepDog.g:2586:1: rule__And__Group__4__Impl : ( ( rule__And__Alternatives_4 )? ) ;
    public final void rule__And__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2590:1: ( ( ( rule__And__Alternatives_4 )? ) )
            // InternalSheepDog.g:2591:1: ( ( rule__And__Alternatives_4 )? )
            {
            // InternalSheepDog.g:2591:1: ( ( rule__And__Alternatives_4 )? )
            // InternalSheepDog.g:2592:2: ( rule__And__Alternatives_4 )?
            {
             before(grammarAccess.getAndAccess().getAlternatives_4()); 
            // InternalSheepDog.g:2593:2: ( rule__And__Alternatives_4 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=23 && LA29_0<=24)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSheepDog.g:2593:3: rule__And__Alternatives_4
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
    // InternalSheepDog.g:2602:1: rule__DocString__Group__0 : rule__DocString__Group__0__Impl rule__DocString__Group__1 ;
    public final void rule__DocString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2606:1: ( rule__DocString__Group__0__Impl rule__DocString__Group__1 )
            // InternalSheepDog.g:2607:2: rule__DocString__Group__0__Impl rule__DocString__Group__1
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
    // InternalSheepDog.g:2614:1: rule__DocString__Group__0__Impl : ( '----' ) ;
    public final void rule__DocString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2618:1: ( ( '----' ) )
            // InternalSheepDog.g:2619:1: ( '----' )
            {
            // InternalSheepDog.g:2619:1: ( '----' )
            // InternalSheepDog.g:2620:2: '----'
            {
             before(grammarAccess.getDocStringAccess().getHyphenMinusHyphenMinusHyphenMinusHyphenMinusKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSheepDog.g:2629:1: rule__DocString__Group__1 : rule__DocString__Group__1__Impl rule__DocString__Group__2 ;
    public final void rule__DocString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2633:1: ( rule__DocString__Group__1__Impl rule__DocString__Group__2 )
            // InternalSheepDog.g:2634:2: rule__DocString__Group__1__Impl rule__DocString__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalSheepDog.g:2641:1: rule__DocString__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__DocString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2645:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2646:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2646:1: ( RULE_EOL )
            // InternalSheepDog.g:2647:2: RULE_EOL
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
    // InternalSheepDog.g:2656:1: rule__DocString__Group__2 : rule__DocString__Group__2__Impl rule__DocString__Group__3 ;
    public final void rule__DocString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2660:1: ( rule__DocString__Group__2__Impl rule__DocString__Group__3 )
            // InternalSheepDog.g:2661:2: rule__DocString__Group__2__Impl rule__DocString__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalSheepDog.g:2668:1: rule__DocString__Group__2__Impl : ( ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* ) ) ;
    public final void rule__DocString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2672:1: ( ( ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* ) ) )
            // InternalSheepDog.g:2673:1: ( ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* ) )
            {
            // InternalSheepDog.g:2673:1: ( ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* ) )
            // InternalSheepDog.g:2674:2: ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* )
            {
            // InternalSheepDog.g:2674:2: ( ( rule__DocString__LinesAssignment_2 ) )
            // InternalSheepDog.g:2675:3: ( rule__DocString__LinesAssignment_2 )
            {
             before(grammarAccess.getDocStringAccess().getLinesAssignment_2()); 
            // InternalSheepDog.g:2676:3: ( rule__DocString__LinesAssignment_2 )
            // InternalSheepDog.g:2676:4: rule__DocString__LinesAssignment_2
            {
            pushFollow(FOLLOW_8);
            rule__DocString__LinesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDocStringAccess().getLinesAssignment_2()); 

            }

            // InternalSheepDog.g:2679:2: ( ( rule__DocString__LinesAssignment_2 )* )
            // InternalSheepDog.g:2680:3: ( rule__DocString__LinesAssignment_2 )*
            {
             before(grammarAccess.getDocStringAccess().getLinesAssignment_2()); 
            // InternalSheepDog.g:2681:3: ( rule__DocString__LinesAssignment_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_WORD && LA30_0<=RULE_EOL)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSheepDog.g:2681:4: rule__DocString__LinesAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__DocString__LinesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalSheepDog.g:2690:1: rule__DocString__Group__3 : rule__DocString__Group__3__Impl rule__DocString__Group__4 ;
    public final void rule__DocString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2694:1: ( rule__DocString__Group__3__Impl rule__DocString__Group__4 )
            // InternalSheepDog.g:2695:2: rule__DocString__Group__3__Impl rule__DocString__Group__4
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
    // InternalSheepDog.g:2702:1: rule__DocString__Group__3__Impl : ( '----' ) ;
    public final void rule__DocString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2706:1: ( ( '----' ) )
            // InternalSheepDog.g:2707:1: ( '----' )
            {
            // InternalSheepDog.g:2707:1: ( '----' )
            // InternalSheepDog.g:2708:2: '----'
            {
             before(grammarAccess.getDocStringAccess().getHyphenMinusHyphenMinusHyphenMinusHyphenMinusKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSheepDog.g:2717:1: rule__DocString__Group__4 : rule__DocString__Group__4__Impl ;
    public final void rule__DocString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2721:1: ( rule__DocString__Group__4__Impl )
            // InternalSheepDog.g:2722:2: rule__DocString__Group__4__Impl
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
    // InternalSheepDog.g:2728:1: rule__DocString__Group__4__Impl : ( RULE_EOL ) ;
    public final void rule__DocString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2732:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2733:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2733:1: ( RULE_EOL )
            // InternalSheepDog.g:2734:2: RULE_EOL
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
    // InternalSheepDog.g:2744:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2748:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalSheepDog.g:2749:2: rule__Table__Group__0__Impl rule__Table__Group__1
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
    // InternalSheepDog.g:2756:1: rule__Table__Group__0__Impl : ( '[options=\"header\"]' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2760:1: ( ( '[options=\"header\"]' ) )
            // InternalSheepDog.g:2761:1: ( '[options=\"header\"]' )
            {
            // InternalSheepDog.g:2761:1: ( '[options=\"header\"]' )
            // InternalSheepDog.g:2762:2: '[options=\"header\"]'
            {
             before(grammarAccess.getTableAccess().getOptionsHeaderKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSheepDog.g:2771:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2775:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalSheepDog.g:2776:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalSheepDog.g:2783:1: rule__Table__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2787:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2788:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2788:1: ( RULE_EOL )
            // InternalSheepDog.g:2789:2: RULE_EOL
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
    // InternalSheepDog.g:2798:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2802:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalSheepDog.g:2803:2: rule__Table__Group__2__Impl rule__Table__Group__3
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
    // InternalSheepDog.g:2810:1: rule__Table__Group__2__Impl : ( '|===' ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2814:1: ( ( '|===' ) )
            // InternalSheepDog.g:2815:1: ( '|===' )
            {
            // InternalSheepDog.g:2815:1: ( '|===' )
            // InternalSheepDog.g:2816:2: '|==='
            {
             before(grammarAccess.getTableAccess().getVerticalLineEqualsSignEqualsSignEqualsSignKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSheepDog.g:2825:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2829:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalSheepDog.g:2830:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalSheepDog.g:2837:1: rule__Table__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2841:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2842:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2842:1: ( RULE_EOL )
            // InternalSheepDog.g:2843:2: RULE_EOL
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
    // InternalSheepDog.g:2852:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2856:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalSheepDog.g:2857:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FOLLOW_33);
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
    // InternalSheepDog.g:2864:1: rule__Table__Group__4__Impl : ( ( ( rule__Table__RowsAssignment_4 ) ) ( ( rule__Table__RowsAssignment_4 )* ) ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2868:1: ( ( ( ( rule__Table__RowsAssignment_4 ) ) ( ( rule__Table__RowsAssignment_4 )* ) ) )
            // InternalSheepDog.g:2869:1: ( ( ( rule__Table__RowsAssignment_4 ) ) ( ( rule__Table__RowsAssignment_4 )* ) )
            {
            // InternalSheepDog.g:2869:1: ( ( ( rule__Table__RowsAssignment_4 ) ) ( ( rule__Table__RowsAssignment_4 )* ) )
            // InternalSheepDog.g:2870:2: ( ( rule__Table__RowsAssignment_4 ) ) ( ( rule__Table__RowsAssignment_4 )* )
            {
            // InternalSheepDog.g:2870:2: ( ( rule__Table__RowsAssignment_4 ) )
            // InternalSheepDog.g:2871:3: ( rule__Table__RowsAssignment_4 )
            {
             before(grammarAccess.getTableAccess().getRowsAssignment_4()); 
            // InternalSheepDog.g:2872:3: ( rule__Table__RowsAssignment_4 )
            // InternalSheepDog.g:2872:4: rule__Table__RowsAssignment_4
            {
            pushFollow(FOLLOW_35);
            rule__Table__RowsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getRowsAssignment_4()); 

            }

            // InternalSheepDog.g:2875:2: ( ( rule__Table__RowsAssignment_4 )* )
            // InternalSheepDog.g:2876:3: ( rule__Table__RowsAssignment_4 )*
            {
             before(grammarAccess.getTableAccess().getRowsAssignment_4()); 
            // InternalSheepDog.g:2877:3: ( rule__Table__RowsAssignment_4 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==29) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalSheepDog.g:2877:4: rule__Table__RowsAssignment_4
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Table__RowsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalSheepDog.g:2886:1: rule__Table__Group__5 : rule__Table__Group__5__Impl rule__Table__Group__6 ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2890:1: ( rule__Table__Group__5__Impl rule__Table__Group__6 )
            // InternalSheepDog.g:2891:2: rule__Table__Group__5__Impl rule__Table__Group__6
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
    // InternalSheepDog.g:2898:1: rule__Table__Group__5__Impl : ( '|===' ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2902:1: ( ( '|===' ) )
            // InternalSheepDog.g:2903:1: ( '|===' )
            {
            // InternalSheepDog.g:2903:1: ( '|===' )
            // InternalSheepDog.g:2904:2: '|==='
            {
             before(grammarAccess.getTableAccess().getVerticalLineEqualsSignEqualsSignEqualsSignKeyword_5()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSheepDog.g:2913:1: rule__Table__Group__6 : rule__Table__Group__6__Impl ;
    public final void rule__Table__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2917:1: ( rule__Table__Group__6__Impl )
            // InternalSheepDog.g:2918:2: rule__Table__Group__6__Impl
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
    // InternalSheepDog.g:2924:1: rule__Table__Group__6__Impl : ( RULE_EOL ) ;
    public final void rule__Table__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2928:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2929:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2929:1: ( RULE_EOL )
            // InternalSheepDog.g:2930:2: RULE_EOL
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
    // InternalSheepDog.g:2940:1: rule__Row__Group__0 : rule__Row__Group__0__Impl rule__Row__Group__1 ;
    public final void rule__Row__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2944:1: ( rule__Row__Group__0__Impl rule__Row__Group__1 )
            // InternalSheepDog.g:2945:2: rule__Row__Group__0__Impl rule__Row__Group__1
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
    // InternalSheepDog.g:2952:1: rule__Row__Group__0__Impl : ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) ) ;
    public final void rule__Row__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2956:1: ( ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) ) )
            // InternalSheepDog.g:2957:1: ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) )
            {
            // InternalSheepDog.g:2957:1: ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) )
            // InternalSheepDog.g:2958:2: ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* )
            {
            // InternalSheepDog.g:2958:2: ( ( rule__Row__CellsAssignment_0 ) )
            // InternalSheepDog.g:2959:3: ( rule__Row__CellsAssignment_0 )
            {
             before(grammarAccess.getRowAccess().getCellsAssignment_0()); 
            // InternalSheepDog.g:2960:3: ( rule__Row__CellsAssignment_0 )
            // InternalSheepDog.g:2960:4: rule__Row__CellsAssignment_0
            {
            pushFollow(FOLLOW_35);
            rule__Row__CellsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getCellsAssignment_0()); 

            }

            // InternalSheepDog.g:2963:2: ( ( rule__Row__CellsAssignment_0 )* )
            // InternalSheepDog.g:2964:3: ( rule__Row__CellsAssignment_0 )*
            {
             before(grammarAccess.getRowAccess().getCellsAssignment_0()); 
            // InternalSheepDog.g:2965:3: ( rule__Row__CellsAssignment_0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==29) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSheepDog.g:2965:4: rule__Row__CellsAssignment_0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Row__CellsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalSheepDog.g:2974:1: rule__Row__Group__1 : rule__Row__Group__1__Impl ;
    public final void rule__Row__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2978:1: ( rule__Row__Group__1__Impl )
            // InternalSheepDog.g:2979:2: rule__Row__Group__1__Impl
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
    // InternalSheepDog.g:2985:1: rule__Row__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Row__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2989:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2990:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2990:1: ( RULE_EOL )
            // InternalSheepDog.g:2991:2: RULE_EOL
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
    // InternalSheepDog.g:3001:1: rule__FeatureTags__Group__0 : rule__FeatureTags__Group__0__Impl rule__FeatureTags__Group__1 ;
    public final void rule__FeatureTags__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3005:1: ( rule__FeatureTags__Group__0__Impl rule__FeatureTags__Group__1 )
            // InternalSheepDog.g:3006:2: rule__FeatureTags__Group__0__Impl rule__FeatureTags__Group__1
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
    // InternalSheepDog.g:3013:1: rule__FeatureTags__Group__0__Impl : ( ':tags:' ) ;
    public final void rule__FeatureTags__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3017:1: ( ( ':tags:' ) )
            // InternalSheepDog.g:3018:1: ( ':tags:' )
            {
            // InternalSheepDog.g:3018:1: ( ':tags:' )
            // InternalSheepDog.g:3019:2: ':tags:'
            {
             before(grammarAccess.getFeatureTagsAccess().getTagsKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSheepDog.g:3028:1: rule__FeatureTags__Group__1 : rule__FeatureTags__Group__1__Impl rule__FeatureTags__Group__2 ;
    public final void rule__FeatureTags__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3032:1: ( rule__FeatureTags__Group__1__Impl rule__FeatureTags__Group__2 )
            // InternalSheepDog.g:3033:2: rule__FeatureTags__Group__1__Impl rule__FeatureTags__Group__2
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
    // InternalSheepDog.g:3040:1: rule__FeatureTags__Group__1__Impl : ( ( rule__FeatureTags__NameAssignment_1 ) ) ;
    public final void rule__FeatureTags__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3044:1: ( ( ( rule__FeatureTags__NameAssignment_1 ) ) )
            // InternalSheepDog.g:3045:1: ( ( rule__FeatureTags__NameAssignment_1 ) )
            {
            // InternalSheepDog.g:3045:1: ( ( rule__FeatureTags__NameAssignment_1 ) )
            // InternalSheepDog.g:3046:2: ( rule__FeatureTags__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureTagsAccess().getNameAssignment_1()); 
            // InternalSheepDog.g:3047:2: ( rule__FeatureTags__NameAssignment_1 )
            // InternalSheepDog.g:3047:3: rule__FeatureTags__NameAssignment_1
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
    // InternalSheepDog.g:3055:1: rule__FeatureTags__Group__2 : rule__FeatureTags__Group__2__Impl ;
    public final void rule__FeatureTags__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3059:1: ( rule__FeatureTags__Group__2__Impl )
            // InternalSheepDog.g:3060:2: rule__FeatureTags__Group__2__Impl
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
    // InternalSheepDog.g:3066:1: rule__FeatureTags__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__FeatureTags__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3070:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:3071:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:3071:1: ( RULE_EOL )
            // InternalSheepDog.g:3072:2: RULE_EOL
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
    // InternalSheepDog.g:3082:1: rule__AbstractScenarioTags__Group__0 : rule__AbstractScenarioTags__Group__0__Impl rule__AbstractScenarioTags__Group__1 ;
    public final void rule__AbstractScenarioTags__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3086:1: ( rule__AbstractScenarioTags__Group__0__Impl rule__AbstractScenarioTags__Group__1 )
            // InternalSheepDog.g:3087:2: rule__AbstractScenarioTags__Group__0__Impl rule__AbstractScenarioTags__Group__1
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
    // InternalSheepDog.g:3094:1: rule__AbstractScenarioTags__Group__0__Impl : ( '[tags=\"' ) ;
    public final void rule__AbstractScenarioTags__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3098:1: ( ( '[tags=\"' ) )
            // InternalSheepDog.g:3099:1: ( '[tags=\"' )
            {
            // InternalSheepDog.g:3099:1: ( '[tags=\"' )
            // InternalSheepDog.g:3100:2: '[tags=\"'
            {
             before(grammarAccess.getAbstractScenarioTagsAccess().getTagsKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSheepDog.g:3109:1: rule__AbstractScenarioTags__Group__1 : rule__AbstractScenarioTags__Group__1__Impl rule__AbstractScenarioTags__Group__2 ;
    public final void rule__AbstractScenarioTags__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3113:1: ( rule__AbstractScenarioTags__Group__1__Impl rule__AbstractScenarioTags__Group__2 )
            // InternalSheepDog.g:3114:2: rule__AbstractScenarioTags__Group__1__Impl rule__AbstractScenarioTags__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalSheepDog.g:3121:1: rule__AbstractScenarioTags__Group__1__Impl : ( ( rule__AbstractScenarioTags__NameAssignment_1 ) ) ;
    public final void rule__AbstractScenarioTags__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3125:1: ( ( ( rule__AbstractScenarioTags__NameAssignment_1 ) ) )
            // InternalSheepDog.g:3126:1: ( ( rule__AbstractScenarioTags__NameAssignment_1 ) )
            {
            // InternalSheepDog.g:3126:1: ( ( rule__AbstractScenarioTags__NameAssignment_1 ) )
            // InternalSheepDog.g:3127:2: ( rule__AbstractScenarioTags__NameAssignment_1 )
            {
             before(grammarAccess.getAbstractScenarioTagsAccess().getNameAssignment_1()); 
            // InternalSheepDog.g:3128:2: ( rule__AbstractScenarioTags__NameAssignment_1 )
            // InternalSheepDog.g:3128:3: rule__AbstractScenarioTags__NameAssignment_1
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
    // InternalSheepDog.g:3136:1: rule__AbstractScenarioTags__Group__2 : rule__AbstractScenarioTags__Group__2__Impl rule__AbstractScenarioTags__Group__3 ;
    public final void rule__AbstractScenarioTags__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3140:1: ( rule__AbstractScenarioTags__Group__2__Impl rule__AbstractScenarioTags__Group__3 )
            // InternalSheepDog.g:3141:2: rule__AbstractScenarioTags__Group__2__Impl rule__AbstractScenarioTags__Group__3
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
    // InternalSheepDog.g:3148:1: rule__AbstractScenarioTags__Group__2__Impl : ( '\"]' ) ;
    public final void rule__AbstractScenarioTags__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3152:1: ( ( '\"]' ) )
            // InternalSheepDog.g:3153:1: ( '\"]' )
            {
            // InternalSheepDog.g:3153:1: ( '\"]' )
            // InternalSheepDog.g:3154:2: '\"]'
            {
             before(grammarAccess.getAbstractScenarioTagsAccess().getQuotationMarkRightSquareBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAbstractScenarioTagsAccess().getQuotationMarkRightSquareBracketKeyword_2()); 

            }


            }

        }
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
    // InternalSheepDog.g:3163:1: rule__AbstractScenarioTags__Group__3 : rule__AbstractScenarioTags__Group__3__Impl ;
    public final void rule__AbstractScenarioTags__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3167:1: ( rule__AbstractScenarioTags__Group__3__Impl )
            // InternalSheepDog.g:3168:2: rule__AbstractScenarioTags__Group__3__Impl
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
    // InternalSheepDog.g:3174:1: rule__AbstractScenarioTags__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__AbstractScenarioTags__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3178:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:3179:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:3179:1: ( RULE_EOL )
            // InternalSheepDog.g:3180:2: RULE_EOL
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
    // InternalSheepDog.g:3190:1: rule__Cell__Group__0 : rule__Cell__Group__0__Impl rule__Cell__Group__1 ;
    public final void rule__Cell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3194:1: ( rule__Cell__Group__0__Impl rule__Cell__Group__1 )
            // InternalSheepDog.g:3195:2: rule__Cell__Group__0__Impl rule__Cell__Group__1
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
    // InternalSheepDog.g:3202:1: rule__Cell__Group__0__Impl : ( '|' ) ;
    public final void rule__Cell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3206:1: ( ( '|' ) )
            // InternalSheepDog.g:3207:1: ( '|' )
            {
            // InternalSheepDog.g:3207:1: ( '|' )
            // InternalSheepDog.g:3208:2: '|'
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
    // InternalSheepDog.g:3217:1: rule__Cell__Group__1 : rule__Cell__Group__1__Impl ;
    public final void rule__Cell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3221:1: ( rule__Cell__Group__1__Impl )
            // InternalSheepDog.g:3222:2: rule__Cell__Group__1__Impl
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
    // InternalSheepDog.g:3228:1: rule__Cell__Group__1__Impl : ( ( rule__Cell__NameAssignment_1 ) ) ;
    public final void rule__Cell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3232:1: ( ( ( rule__Cell__NameAssignment_1 ) ) )
            // InternalSheepDog.g:3233:1: ( ( rule__Cell__NameAssignment_1 ) )
            {
            // InternalSheepDog.g:3233:1: ( ( rule__Cell__NameAssignment_1 ) )
            // InternalSheepDog.g:3234:2: ( rule__Cell__NameAssignment_1 )
            {
             before(grammarAccess.getCellAccess().getNameAssignment_1()); 
            // InternalSheepDog.g:3235:2: ( rule__Cell__NameAssignment_1 )
            // InternalSheepDog.g:3235:3: rule__Cell__NameAssignment_1
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
    // InternalSheepDog.g:3244:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3248:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalSheepDog.g:3249:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSheepDog.g:3256:1: rule__Statement__Group__0__Impl : ( ( RULE_WORD )* ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3260:1: ( ( ( RULE_WORD )* ) )
            // InternalSheepDog.g:3261:1: ( ( RULE_WORD )* )
            {
            // InternalSheepDog.g:3261:1: ( ( RULE_WORD )* )
            // InternalSheepDog.g:3262:2: ( RULE_WORD )*
            {
             before(grammarAccess.getStatementAccess().getWORDTerminalRuleCall_0()); 
            // InternalSheepDog.g:3263:2: ( RULE_WORD )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_WORD) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSheepDog.g:3263:3: RULE_WORD
            	    {
            	    match(input,RULE_WORD,FOLLOW_3); 

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
    // InternalSheepDog.g:3271:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3275:1: ( rule__Statement__Group__1__Impl )
            // InternalSheepDog.g:3276:2: rule__Statement__Group__1__Impl
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
    // InternalSheepDog.g:3282:1: rule__Statement__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3286:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:3287:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:3287:1: ( RULE_EOL )
            // InternalSheepDog.g:3288:2: RULE_EOL
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
    // InternalSheepDog.g:3298:1: rule__Line__Group__0 : rule__Line__Group__0__Impl rule__Line__Group__1 ;
    public final void rule__Line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3302:1: ( rule__Line__Group__0__Impl rule__Line__Group__1 )
            // InternalSheepDog.g:3303:2: rule__Line__Group__0__Impl rule__Line__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSheepDog.g:3310:1: rule__Line__Group__0__Impl : ( ( RULE_WORD )* ) ;
    public final void rule__Line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3314:1: ( ( ( RULE_WORD )* ) )
            // InternalSheepDog.g:3315:1: ( ( RULE_WORD )* )
            {
            // InternalSheepDog.g:3315:1: ( ( RULE_WORD )* )
            // InternalSheepDog.g:3316:2: ( RULE_WORD )*
            {
             before(grammarAccess.getLineAccess().getWORDTerminalRuleCall_0()); 
            // InternalSheepDog.g:3317:2: ( RULE_WORD )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_WORD) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalSheepDog.g:3317:3: RULE_WORD
            	    {
            	    match(input,RULE_WORD,FOLLOW_3); 

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
    // InternalSheepDog.g:3325:1: rule__Line__Group__1 : rule__Line__Group__1__Impl ;
    public final void rule__Line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3329:1: ( rule__Line__Group__1__Impl )
            // InternalSheepDog.g:3330:2: rule__Line__Group__1__Impl
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
    // InternalSheepDog.g:3336:1: rule__Line__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3340:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:3341:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:3341:1: ( RULE_EOL )
            // InternalSheepDog.g:3342:2: RULE_EOL
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


    // $ANTLR start "rule__StepObject__NameAssignment_2"
    // InternalSheepDog.g:3352:1: rule__StepObject__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__StepObject__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3356:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3357:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3357:2: ( ruleTitle )
            // InternalSheepDog.g:3358:3: ruleTitle
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
    // InternalSheepDog.g:3367:1: rule__StepObject__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__StepObject__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3371:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3372:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3372:2: ( ruleStatement )
            // InternalSheepDog.g:3373:3: ruleStatement
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
    // InternalSheepDog.g:3382:1: rule__StepObject__StepDefinitionsAssignment_5 : ( ruleStepDefinition ) ;
    public final void rule__StepObject__StepDefinitionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3386:1: ( ( ruleStepDefinition ) )
            // InternalSheepDog.g:3387:2: ( ruleStepDefinition )
            {
            // InternalSheepDog.g:3387:2: ( ruleStepDefinition )
            // InternalSheepDog.g:3388:3: ruleStepDefinition
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
    // InternalSheepDog.g:3397:1: rule__StepDefinition__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__StepDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3401:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3402:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3402:2: ( ruleTitle )
            // InternalSheepDog.g:3403:3: ruleTitle
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
    // InternalSheepDog.g:3412:1: rule__StepDefinition__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__StepDefinition__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3416:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3417:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3417:2: ( ruleStatement )
            // InternalSheepDog.g:3418:3: ruleStatement
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
    // InternalSheepDog.g:3427:1: rule__StepDefinition__StepParametersAssignment_5 : ( ruleStepParameters ) ;
    public final void rule__StepDefinition__StepParametersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3431:1: ( ( ruleStepParameters ) )
            // InternalSheepDog.g:3432:2: ( ruleStepParameters )
            {
            // InternalSheepDog.g:3432:2: ( ruleStepParameters )
            // InternalSheepDog.g:3433:3: ruleStepParameters
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
    // InternalSheepDog.g:3442:1: rule__StepParameters__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__StepParameters__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3446:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3447:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3447:2: ( ruleTitle )
            // InternalSheepDog.g:3448:3: ruleTitle
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
    // InternalSheepDog.g:3457:1: rule__StepParameters__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__StepParameters__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3461:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3462:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3462:2: ( ruleStatement )
            // InternalSheepDog.g:3463:3: ruleStatement
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
    // InternalSheepDog.g:3472:1: rule__StepParameters__ParametersTableAssignment_5 : ( ruleTable ) ;
    public final void rule__StepParameters__ParametersTableAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3476:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3477:2: ( ruleTable )
            {
            // InternalSheepDog.g:3477:2: ( ruleTable )
            // InternalSheepDog.g:3478:3: ruleTable
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
    // InternalSheepDog.g:3487:1: rule__Feature__TagsAssignment_0 : ( ruleFeatureTags ) ;
    public final void rule__Feature__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3491:1: ( ( ruleFeatureTags ) )
            // InternalSheepDog.g:3492:2: ( ruleFeatureTags )
            {
            // InternalSheepDog.g:3492:2: ( ruleFeatureTags )
            // InternalSheepDog.g:3493:3: ruleFeatureTags
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
    // InternalSheepDog.g:3502:1: rule__Feature__NameAssignment_3 : ( ruleTitle ) ;
    public final void rule__Feature__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3506:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3507:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3507:2: ( ruleTitle )
            // InternalSheepDog.g:3508:3: ruleTitle
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
    // InternalSheepDog.g:3517:1: rule__Feature__StatementsAssignment_5 : ( ruleStatement ) ;
    public final void rule__Feature__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3521:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3522:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3522:2: ( ruleStatement )
            // InternalSheepDog.g:3523:3: ruleStatement
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
    // InternalSheepDog.g:3532:1: rule__Feature__AbstractScenariosAssignment_6 : ( ruleAbstractScenario ) ;
    public final void rule__Feature__AbstractScenariosAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3536:1: ( ( ruleAbstractScenario ) )
            // InternalSheepDog.g:3537:2: ( ruleAbstractScenario )
            {
            // InternalSheepDog.g:3537:2: ( ruleAbstractScenario )
            // InternalSheepDog.g:3538:3: ruleAbstractScenario
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
    // InternalSheepDog.g:3547:1: rule__Background__TagsAssignment_0 : ( ruleAbstractScenarioTags ) ;
    public final void rule__Background__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3551:1: ( ( ruleAbstractScenarioTags ) )
            // InternalSheepDog.g:3552:2: ( ruleAbstractScenarioTags )
            {
            // InternalSheepDog.g:3552:2: ( ruleAbstractScenarioTags )
            // InternalSheepDog.g:3553:3: ruleAbstractScenarioTags
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
    // InternalSheepDog.g:3562:1: rule__Background__NameAssignment_3 : ( ruleTitle ) ;
    public final void rule__Background__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3566:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3567:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3567:2: ( ruleTitle )
            // InternalSheepDog.g:3568:3: ruleTitle
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
    // InternalSheepDog.g:3577:1: rule__Background__StatementsAssignment_5 : ( ruleStatement ) ;
    public final void rule__Background__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3581:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3582:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3582:2: ( ruleStatement )
            // InternalSheepDog.g:3583:3: ruleStatement
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
    // InternalSheepDog.g:3592:1: rule__Background__StepsAssignment_6 : ( ruleStep ) ;
    public final void rule__Background__StepsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3596:1: ( ( ruleStep ) )
            // InternalSheepDog.g:3597:2: ( ruleStep )
            {
            // InternalSheepDog.g:3597:2: ( ruleStep )
            // InternalSheepDog.g:3598:3: ruleStep
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
    // InternalSheepDog.g:3607:1: rule__Scenario__TagsAssignment_0 : ( ruleAbstractScenarioTags ) ;
    public final void rule__Scenario__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3611:1: ( ( ruleAbstractScenarioTags ) )
            // InternalSheepDog.g:3612:2: ( ruleAbstractScenarioTags )
            {
            // InternalSheepDog.g:3612:2: ( ruleAbstractScenarioTags )
            // InternalSheepDog.g:3613:3: ruleAbstractScenarioTags
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
    // InternalSheepDog.g:3622:1: rule__Scenario__NameAssignment_3 : ( ruleTitle ) ;
    public final void rule__Scenario__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3626:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3627:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3627:2: ( ruleTitle )
            // InternalSheepDog.g:3628:3: ruleTitle
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
    // InternalSheepDog.g:3637:1: rule__Scenario__StatementsAssignment_5 : ( ruleStatement ) ;
    public final void rule__Scenario__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3641:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3642:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3642:2: ( ruleStatement )
            // InternalSheepDog.g:3643:3: ruleStatement
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
    // InternalSheepDog.g:3652:1: rule__Scenario__StepsAssignment_6 : ( ruleStep ) ;
    public final void rule__Scenario__StepsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3656:1: ( ( ruleStep ) )
            // InternalSheepDog.g:3657:2: ( ruleStep )
            {
            // InternalSheepDog.g:3657:2: ( ruleStep )
            // InternalSheepDog.g:3658:3: ruleStep
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
    // InternalSheepDog.g:3667:1: rule__Scenario__ExamplesAssignment_7 : ( ruleExamples ) ;
    public final void rule__Scenario__ExamplesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3671:1: ( ( ruleExamples ) )
            // InternalSheepDog.g:3672:2: ( ruleExamples )
            {
            // InternalSheepDog.g:3672:2: ( ruleExamples )
            // InternalSheepDog.g:3673:3: ruleExamples
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
    // InternalSheepDog.g:3682:1: rule__Examples__TagsAssignment_0 : ( ruleAbstractScenarioTags ) ;
    public final void rule__Examples__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3686:1: ( ( ruleAbstractScenarioTags ) )
            // InternalSheepDog.g:3687:2: ( ruleAbstractScenarioTags )
            {
            // InternalSheepDog.g:3687:2: ( ruleAbstractScenarioTags )
            // InternalSheepDog.g:3688:3: ruleAbstractScenarioTags
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
    // InternalSheepDog.g:3697:1: rule__Examples__NameAssignment_3 : ( ruleTitle ) ;
    public final void rule__Examples__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3701:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3702:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3702:2: ( ruleTitle )
            // InternalSheepDog.g:3703:3: ruleTitle
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
    // InternalSheepDog.g:3712:1: rule__Examples__StatementsAssignment_5 : ( ruleStatement ) ;
    public final void rule__Examples__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3716:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3717:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3717:2: ( ruleStatement )
            // InternalSheepDog.g:3718:3: ruleStatement
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
    // InternalSheepDog.g:3727:1: rule__Examples__TheExamplesTableAssignment_6 : ( ruleTable ) ;
    public final void rule__Examples__TheExamplesTableAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3731:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3732:2: ( ruleTable )
            {
            // InternalSheepDog.g:3732:2: ( ruleTable )
            // InternalSheepDog.g:3733:3: ruleTable
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
    // InternalSheepDog.g:3742:1: rule__Given__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__Given__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3746:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3747:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3747:2: ( ruleTitle )
            // InternalSheepDog.g:3748:3: ruleTitle
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
    // InternalSheepDog.g:3757:1: rule__Given__TheStepTableAssignment_4_0 : ( ruleTable ) ;
    public final void rule__Given__TheStepTableAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3761:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3762:2: ( ruleTable )
            {
            // InternalSheepDog.g:3762:2: ( ruleTable )
            // InternalSheepDog.g:3763:3: ruleTable
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
    // InternalSheepDog.g:3772:1: rule__Given__TheDocStringAssignment_4_1 : ( ruleDocString ) ;
    public final void rule__Given__TheDocStringAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3776:1: ( ( ruleDocString ) )
            // InternalSheepDog.g:3777:2: ( ruleDocString )
            {
            // InternalSheepDog.g:3777:2: ( ruleDocString )
            // InternalSheepDog.g:3778:3: ruleDocString
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
    // InternalSheepDog.g:3787:1: rule__When__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__When__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3791:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3792:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3792:2: ( ruleTitle )
            // InternalSheepDog.g:3793:3: ruleTitle
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
    // InternalSheepDog.g:3802:1: rule__When__TheStepTableAssignment_4_0 : ( ruleTable ) ;
    public final void rule__When__TheStepTableAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3806:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3807:2: ( ruleTable )
            {
            // InternalSheepDog.g:3807:2: ( ruleTable )
            // InternalSheepDog.g:3808:3: ruleTable
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
    // InternalSheepDog.g:3817:1: rule__When__TheDocStringAssignment_4_1 : ( ruleDocString ) ;
    public final void rule__When__TheDocStringAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3821:1: ( ( ruleDocString ) )
            // InternalSheepDog.g:3822:2: ( ruleDocString )
            {
            // InternalSheepDog.g:3822:2: ( ruleDocString )
            // InternalSheepDog.g:3823:3: ruleDocString
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
    // InternalSheepDog.g:3832:1: rule__Then__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__Then__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3836:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3837:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3837:2: ( ruleTitle )
            // InternalSheepDog.g:3838:3: ruleTitle
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
    // InternalSheepDog.g:3847:1: rule__Then__TheStepTableAssignment_4_0 : ( ruleTable ) ;
    public final void rule__Then__TheStepTableAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3851:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3852:2: ( ruleTable )
            {
            // InternalSheepDog.g:3852:2: ( ruleTable )
            // InternalSheepDog.g:3853:3: ruleTable
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
    // InternalSheepDog.g:3862:1: rule__Then__TheDocStringAssignment_4_1 : ( ruleDocString ) ;
    public final void rule__Then__TheDocStringAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3866:1: ( ( ruleDocString ) )
            // InternalSheepDog.g:3867:2: ( ruleDocString )
            {
            // InternalSheepDog.g:3867:2: ( ruleDocString )
            // InternalSheepDog.g:3868:3: ruleDocString
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
    // InternalSheepDog.g:3877:1: rule__And__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__And__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3881:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3882:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3882:2: ( ruleTitle )
            // InternalSheepDog.g:3883:3: ruleTitle
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
    // InternalSheepDog.g:3892:1: rule__And__TheStepTableAssignment_4_0 : ( ruleTable ) ;
    public final void rule__And__TheStepTableAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3896:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3897:2: ( ruleTable )
            {
            // InternalSheepDog.g:3897:2: ( ruleTable )
            // InternalSheepDog.g:3898:3: ruleTable
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
    // InternalSheepDog.g:3907:1: rule__And__TheDocStringAssignment_4_1 : ( ruleDocString ) ;
    public final void rule__And__TheDocStringAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3911:1: ( ( ruleDocString ) )
            // InternalSheepDog.g:3912:2: ( ruleDocString )
            {
            // InternalSheepDog.g:3912:2: ( ruleDocString )
            // InternalSheepDog.g:3913:3: ruleDocString
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


    // $ANTLR start "rule__DocString__LinesAssignment_2"
    // InternalSheepDog.g:3922:1: rule__DocString__LinesAssignment_2 : ( ruleLine ) ;
    public final void rule__DocString__LinesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3926:1: ( ( ruleLine ) )
            // InternalSheepDog.g:3927:2: ( ruleLine )
            {
            // InternalSheepDog.g:3927:2: ( ruleLine )
            // InternalSheepDog.g:3928:3: ruleLine
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
    // InternalSheepDog.g:3937:1: rule__Table__RowsAssignment_4 : ( ruleRow ) ;
    public final void rule__Table__RowsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3941:1: ( ( ruleRow ) )
            // InternalSheepDog.g:3942:2: ( ruleRow )
            {
            // InternalSheepDog.g:3942:2: ( ruleRow )
            // InternalSheepDog.g:3943:3: ruleRow
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
    // InternalSheepDog.g:3952:1: rule__Row__CellsAssignment_0 : ( ruleCell ) ;
    public final void rule__Row__CellsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3956:1: ( ( ruleCell ) )
            // InternalSheepDog.g:3957:2: ( ruleCell )
            {
            // InternalSheepDog.g:3957:2: ( ruleCell )
            // InternalSheepDog.g:3958:3: ruleCell
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
    // InternalSheepDog.g:3967:1: rule__FeatureTags__NameAssignment_1 : ( RULE_WORD ) ;
    public final void rule__FeatureTags__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3971:1: ( ( RULE_WORD ) )
            // InternalSheepDog.g:3972:2: ( RULE_WORD )
            {
            // InternalSheepDog.g:3972:2: ( RULE_WORD )
            // InternalSheepDog.g:3973:3: RULE_WORD
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
    // InternalSheepDog.g:3982:1: rule__AbstractScenarioTags__NameAssignment_1 : ( RULE_WORD ) ;
    public final void rule__AbstractScenarioTags__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3986:1: ( ( RULE_WORD ) )
            // InternalSheepDog.g:3987:2: ( RULE_WORD )
            {
            // InternalSheepDog.g:3987:2: ( RULE_WORD )
            // InternalSheepDog.g:3988:3: RULE_WORD
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
    // InternalSheepDog.g:3997:1: rule__Cell__NameAssignment_1 : ( ruleTitle ) ;
    public final void rule__Cell__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:4001:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:4002:2: ( ruleTitle )
            {
            // InternalSheepDog.g:4002:2: ( ruleTitle )
            // InternalSheepDog.g:4003:3: ruleTitle
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000830L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000830L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000802L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008002030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008002002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001800030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000010000000L});

}
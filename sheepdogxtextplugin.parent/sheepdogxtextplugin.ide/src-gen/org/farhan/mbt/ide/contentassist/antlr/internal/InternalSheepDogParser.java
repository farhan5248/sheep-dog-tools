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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WORD", "RULE_EOL", "RULE_RAWTEXT", "RULE_WS", "RULE_SL_COMMENT", "'='", "'Object:'", "'=='", "'Definition:'", "'==='", "'Parameters:'", "'Feature:'", "'Background:'", "'Scenario:'", "'Examples:'", "'Given:'", "'When:'", "'Then:'", "'And:'", "'|==='", "'[tags='", "']'", "'|'"
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


    // $ANTLR start "entryRuleAbstractScenarioTags"
    // InternalSheepDog.g:478:1: entryRuleAbstractScenarioTags : ruleAbstractScenarioTags EOF ;
    public final void entryRuleAbstractScenarioTags() throws RecognitionException {
        try {
            // InternalSheepDog.g:479:1: ( ruleAbstractScenarioTags EOF )
            // InternalSheepDog.g:480:1: ruleAbstractScenarioTags EOF
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
    // InternalSheepDog.g:487:1: ruleAbstractScenarioTags : ( ( rule__AbstractScenarioTags__Group__0 ) ) ;
    public final void ruleAbstractScenarioTags() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:491:2: ( ( ( rule__AbstractScenarioTags__Group__0 ) ) )
            // InternalSheepDog.g:492:2: ( ( rule__AbstractScenarioTags__Group__0 ) )
            {
            // InternalSheepDog.g:492:2: ( ( rule__AbstractScenarioTags__Group__0 ) )
            // InternalSheepDog.g:493:3: ( rule__AbstractScenarioTags__Group__0 )
            {
             before(grammarAccess.getAbstractScenarioTagsAccess().getGroup()); 
            // InternalSheepDog.g:494:3: ( rule__AbstractScenarioTags__Group__0 )
            // InternalSheepDog.g:494:4: rule__AbstractScenarioTags__Group__0
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
    // InternalSheepDog.g:503:1: entryRuleCell : ruleCell EOF ;
    public final void entryRuleCell() throws RecognitionException {
        try {
            // InternalSheepDog.g:504:1: ( ruleCell EOF )
            // InternalSheepDog.g:505:1: ruleCell EOF
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
    // InternalSheepDog.g:512:1: ruleCell : ( ( rule__Cell__Group__0 ) ) ;
    public final void ruleCell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:516:2: ( ( ( rule__Cell__Group__0 ) ) )
            // InternalSheepDog.g:517:2: ( ( rule__Cell__Group__0 ) )
            {
            // InternalSheepDog.g:517:2: ( ( rule__Cell__Group__0 ) )
            // InternalSheepDog.g:518:3: ( rule__Cell__Group__0 )
            {
             before(grammarAccess.getCellAccess().getGroup()); 
            // InternalSheepDog.g:519:3: ( rule__Cell__Group__0 )
            // InternalSheepDog.g:519:4: rule__Cell__Group__0
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


    // $ANTLR start "rule__Model__Alternatives"
    // InternalSheepDog.g:584:1: rule__Model__Alternatives : ( ( ruleStepObject ) | ( ruleFeature ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:588:1: ( ( ruleStepObject ) | ( ruleFeature ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==9) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==10) ) {
                    alt2=1;
                }
                else if ( (LA2_1==15) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSheepDog.g:589:2: ( ruleStepObject )
                    {
                    // InternalSheepDog.g:589:2: ( ruleStepObject )
                    // InternalSheepDog.g:590:3: ruleStepObject
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
                    // InternalSheepDog.g:595:2: ( ruleFeature )
                    {
                    // InternalSheepDog.g:595:2: ( ruleFeature )
                    // InternalSheepDog.g:596:3: ruleFeature
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
    // InternalSheepDog.g:605:1: rule__AbstractScenario__Alternatives : ( ( ruleBackground ) | ( ruleScenario ) );
    public final void rule__AbstractScenario__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:609:1: ( ( ruleBackground ) | ( ruleScenario ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_WORD) ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==25) ) {
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
                    // InternalSheepDog.g:610:2: ( ruleBackground )
                    {
                    // InternalSheepDog.g:610:2: ( ruleBackground )
                    // InternalSheepDog.g:611:3: ruleBackground
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
                    // InternalSheepDog.g:616:2: ( ruleScenario )
                    {
                    // InternalSheepDog.g:616:2: ( ruleScenario )
                    // InternalSheepDog.g:617:3: ruleScenario
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
    // InternalSheepDog.g:626:1: rule__Step__Alternatives : ( ( ruleGiven ) | ( ruleWhen ) | ( ruleThen ) | ( ruleAnd ) );
    public final void rule__Step__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:630:1: ( ( ruleGiven ) | ( ruleWhen ) | ( ruleThen ) | ( ruleAnd ) )
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
                    // InternalSheepDog.g:631:2: ( ruleGiven )
                    {
                    // InternalSheepDog.g:631:2: ( ruleGiven )
                    // InternalSheepDog.g:632:3: ruleGiven
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
                    // InternalSheepDog.g:637:2: ( ruleWhen )
                    {
                    // InternalSheepDog.g:637:2: ( ruleWhen )
                    // InternalSheepDog.g:638:3: ruleWhen
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
                    // InternalSheepDog.g:643:2: ( ruleThen )
                    {
                    // InternalSheepDog.g:643:2: ( ruleThen )
                    // InternalSheepDog.g:644:3: ruleThen
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
                    // InternalSheepDog.g:649:2: ( ruleAnd )
                    {
                    // InternalSheepDog.g:649:2: ( ruleAnd )
                    // InternalSheepDog.g:650:3: ruleAnd
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
    // InternalSheepDog.g:659:1: rule__Given__Alternatives_4 : ( ( ( rule__Given__TheStepTableAssignment_4_0 ) ) | ( ( rule__Given__TheDocStringAssignment_4_1 ) ) );
    public final void rule__Given__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:663:1: ( ( ( rule__Given__TheStepTableAssignment_4_0 ) ) | ( ( rule__Given__TheDocStringAssignment_4_1 ) ) )
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
                    // InternalSheepDog.g:664:2: ( ( rule__Given__TheStepTableAssignment_4_0 ) )
                    {
                    // InternalSheepDog.g:664:2: ( ( rule__Given__TheStepTableAssignment_4_0 ) )
                    // InternalSheepDog.g:665:3: ( rule__Given__TheStepTableAssignment_4_0 )
                    {
                     before(grammarAccess.getGivenAccess().getTheStepTableAssignment_4_0()); 
                    // InternalSheepDog.g:666:3: ( rule__Given__TheStepTableAssignment_4_0 )
                    // InternalSheepDog.g:666:4: rule__Given__TheStepTableAssignment_4_0
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
                    // InternalSheepDog.g:670:2: ( ( rule__Given__TheDocStringAssignment_4_1 ) )
                    {
                    // InternalSheepDog.g:670:2: ( ( rule__Given__TheDocStringAssignment_4_1 ) )
                    // InternalSheepDog.g:671:3: ( rule__Given__TheDocStringAssignment_4_1 )
                    {
                     before(grammarAccess.getGivenAccess().getTheDocStringAssignment_4_1()); 
                    // InternalSheepDog.g:672:3: ( rule__Given__TheDocStringAssignment_4_1 )
                    // InternalSheepDog.g:672:4: rule__Given__TheDocStringAssignment_4_1
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
    // InternalSheepDog.g:680:1: rule__When__Alternatives_4 : ( ( ( rule__When__TheStepTableAssignment_4_0 ) ) | ( ( rule__When__TheDocStringAssignment_4_1 ) ) );
    public final void rule__When__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:684:1: ( ( ( rule__When__TheStepTableAssignment_4_0 ) ) | ( ( rule__When__TheDocStringAssignment_4_1 ) ) )
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
                    // InternalSheepDog.g:685:2: ( ( rule__When__TheStepTableAssignment_4_0 ) )
                    {
                    // InternalSheepDog.g:685:2: ( ( rule__When__TheStepTableAssignment_4_0 ) )
                    // InternalSheepDog.g:686:3: ( rule__When__TheStepTableAssignment_4_0 )
                    {
                     before(grammarAccess.getWhenAccess().getTheStepTableAssignment_4_0()); 
                    // InternalSheepDog.g:687:3: ( rule__When__TheStepTableAssignment_4_0 )
                    // InternalSheepDog.g:687:4: rule__When__TheStepTableAssignment_4_0
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
                    // InternalSheepDog.g:691:2: ( ( rule__When__TheDocStringAssignment_4_1 ) )
                    {
                    // InternalSheepDog.g:691:2: ( ( rule__When__TheDocStringAssignment_4_1 ) )
                    // InternalSheepDog.g:692:3: ( rule__When__TheDocStringAssignment_4_1 )
                    {
                     before(grammarAccess.getWhenAccess().getTheDocStringAssignment_4_1()); 
                    // InternalSheepDog.g:693:3: ( rule__When__TheDocStringAssignment_4_1 )
                    // InternalSheepDog.g:693:4: rule__When__TheDocStringAssignment_4_1
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
    // InternalSheepDog.g:701:1: rule__Then__Alternatives_4 : ( ( ( rule__Then__TheStepTableAssignment_4_0 ) ) | ( ( rule__Then__TheDocStringAssignment_4_1 ) ) );
    public final void rule__Then__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:705:1: ( ( ( rule__Then__TheStepTableAssignment_4_0 ) ) | ( ( rule__Then__TheDocStringAssignment_4_1 ) ) )
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
                    // InternalSheepDog.g:706:2: ( ( rule__Then__TheStepTableAssignment_4_0 ) )
                    {
                    // InternalSheepDog.g:706:2: ( ( rule__Then__TheStepTableAssignment_4_0 ) )
                    // InternalSheepDog.g:707:3: ( rule__Then__TheStepTableAssignment_4_0 )
                    {
                     before(grammarAccess.getThenAccess().getTheStepTableAssignment_4_0()); 
                    // InternalSheepDog.g:708:3: ( rule__Then__TheStepTableAssignment_4_0 )
                    // InternalSheepDog.g:708:4: rule__Then__TheStepTableAssignment_4_0
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
                    // InternalSheepDog.g:712:2: ( ( rule__Then__TheDocStringAssignment_4_1 ) )
                    {
                    // InternalSheepDog.g:712:2: ( ( rule__Then__TheDocStringAssignment_4_1 ) )
                    // InternalSheepDog.g:713:3: ( rule__Then__TheDocStringAssignment_4_1 )
                    {
                     before(grammarAccess.getThenAccess().getTheDocStringAssignment_4_1()); 
                    // InternalSheepDog.g:714:3: ( rule__Then__TheDocStringAssignment_4_1 )
                    // InternalSheepDog.g:714:4: rule__Then__TheDocStringAssignment_4_1
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
    // InternalSheepDog.g:722:1: rule__And__Alternatives_4 : ( ( ( rule__And__TheStepTableAssignment_4_0 ) ) | ( ( rule__And__TheDocStringAssignment_4_1 ) ) );
    public final void rule__And__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:726:1: ( ( ( rule__And__TheStepTableAssignment_4_0 ) ) | ( ( rule__And__TheDocStringAssignment_4_1 ) ) )
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
                    // InternalSheepDog.g:727:2: ( ( rule__And__TheStepTableAssignment_4_0 ) )
                    {
                    // InternalSheepDog.g:727:2: ( ( rule__And__TheStepTableAssignment_4_0 ) )
                    // InternalSheepDog.g:728:3: ( rule__And__TheStepTableAssignment_4_0 )
                    {
                     before(grammarAccess.getAndAccess().getTheStepTableAssignment_4_0()); 
                    // InternalSheepDog.g:729:3: ( rule__And__TheStepTableAssignment_4_0 )
                    // InternalSheepDog.g:729:4: rule__And__TheStepTableAssignment_4_0
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
                    // InternalSheepDog.g:733:2: ( ( rule__And__TheDocStringAssignment_4_1 ) )
                    {
                    // InternalSheepDog.g:733:2: ( ( rule__And__TheDocStringAssignment_4_1 ) )
                    // InternalSheepDog.g:734:3: ( rule__And__TheDocStringAssignment_4_1 )
                    {
                     before(grammarAccess.getAndAccess().getTheDocStringAssignment_4_1()); 
                    // InternalSheepDog.g:735:3: ( rule__And__TheDocStringAssignment_4_1 )
                    // InternalSheepDog.g:735:4: rule__And__TheDocStringAssignment_4_1
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
    // InternalSheepDog.g:743:1: rule__StepObject__Group__0 : rule__StepObject__Group__0__Impl rule__StepObject__Group__1 ;
    public final void rule__StepObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:747:1: ( rule__StepObject__Group__0__Impl rule__StepObject__Group__1 )
            // InternalSheepDog.g:748:2: rule__StepObject__Group__0__Impl rule__StepObject__Group__1
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
    // InternalSheepDog.g:755:1: rule__StepObject__Group__0__Impl : ( '=' ) ;
    public final void rule__StepObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:759:1: ( ( '=' ) )
            // InternalSheepDog.g:760:1: ( '=' )
            {
            // InternalSheepDog.g:760:1: ( '=' )
            // InternalSheepDog.g:761:2: '='
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
    // InternalSheepDog.g:770:1: rule__StepObject__Group__1 : rule__StepObject__Group__1__Impl rule__StepObject__Group__2 ;
    public final void rule__StepObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:774:1: ( rule__StepObject__Group__1__Impl rule__StepObject__Group__2 )
            // InternalSheepDog.g:775:2: rule__StepObject__Group__1__Impl rule__StepObject__Group__2
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
    // InternalSheepDog.g:782:1: rule__StepObject__Group__1__Impl : ( 'Object:' ) ;
    public final void rule__StepObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:786:1: ( ( 'Object:' ) )
            // InternalSheepDog.g:787:1: ( 'Object:' )
            {
            // InternalSheepDog.g:787:1: ( 'Object:' )
            // InternalSheepDog.g:788:2: 'Object:'
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
    // InternalSheepDog.g:797:1: rule__StepObject__Group__2 : rule__StepObject__Group__2__Impl rule__StepObject__Group__3 ;
    public final void rule__StepObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:801:1: ( rule__StepObject__Group__2__Impl rule__StepObject__Group__3 )
            // InternalSheepDog.g:802:2: rule__StepObject__Group__2__Impl rule__StepObject__Group__3
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
    // InternalSheepDog.g:809:1: rule__StepObject__Group__2__Impl : ( ( rule__StepObject__NameAssignment_2 ) ) ;
    public final void rule__StepObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:813:1: ( ( ( rule__StepObject__NameAssignment_2 ) ) )
            // InternalSheepDog.g:814:1: ( ( rule__StepObject__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:814:1: ( ( rule__StepObject__NameAssignment_2 ) )
            // InternalSheepDog.g:815:2: ( rule__StepObject__NameAssignment_2 )
            {
             before(grammarAccess.getStepObjectAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:816:2: ( rule__StepObject__NameAssignment_2 )
            // InternalSheepDog.g:816:3: rule__StepObject__NameAssignment_2
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
    // InternalSheepDog.g:824:1: rule__StepObject__Group__3 : rule__StepObject__Group__3__Impl rule__StepObject__Group__4 ;
    public final void rule__StepObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:828:1: ( rule__StepObject__Group__3__Impl rule__StepObject__Group__4 )
            // InternalSheepDog.g:829:2: rule__StepObject__Group__3__Impl rule__StepObject__Group__4
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
    // InternalSheepDog.g:836:1: rule__StepObject__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__StepObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:840:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:841:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:841:1: ( RULE_EOL )
            // InternalSheepDog.g:842:2: RULE_EOL
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
    // InternalSheepDog.g:851:1: rule__StepObject__Group__4 : rule__StepObject__Group__4__Impl rule__StepObject__Group__5 ;
    public final void rule__StepObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:855:1: ( rule__StepObject__Group__4__Impl rule__StepObject__Group__5 )
            // InternalSheepDog.g:856:2: rule__StepObject__Group__4__Impl rule__StepObject__Group__5
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
    // InternalSheepDog.g:863:1: rule__StepObject__Group__4__Impl : ( ( rule__StepObject__StatementsAssignment_4 )* ) ;
    public final void rule__StepObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:867:1: ( ( ( rule__StepObject__StatementsAssignment_4 )* ) )
            // InternalSheepDog.g:868:1: ( ( rule__StepObject__StatementsAssignment_4 )* )
            {
            // InternalSheepDog.g:868:1: ( ( rule__StepObject__StatementsAssignment_4 )* )
            // InternalSheepDog.g:869:2: ( rule__StepObject__StatementsAssignment_4 )*
            {
             before(grammarAccess.getStepObjectAccess().getStatementsAssignment_4()); 
            // InternalSheepDog.g:870:2: ( rule__StepObject__StatementsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_WORD) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSheepDog.g:870:3: rule__StepObject__StatementsAssignment_4
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
    // InternalSheepDog.g:878:1: rule__StepObject__Group__5 : rule__StepObject__Group__5__Impl ;
    public final void rule__StepObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:882:1: ( rule__StepObject__Group__5__Impl )
            // InternalSheepDog.g:883:2: rule__StepObject__Group__5__Impl
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
    // InternalSheepDog.g:889:1: rule__StepObject__Group__5__Impl : ( ( rule__StepObject__StepDefinitionsAssignment_5 )* ) ;
    public final void rule__StepObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:893:1: ( ( ( rule__StepObject__StepDefinitionsAssignment_5 )* ) )
            // InternalSheepDog.g:894:1: ( ( rule__StepObject__StepDefinitionsAssignment_5 )* )
            {
            // InternalSheepDog.g:894:1: ( ( rule__StepObject__StepDefinitionsAssignment_5 )* )
            // InternalSheepDog.g:895:2: ( rule__StepObject__StepDefinitionsAssignment_5 )*
            {
             before(grammarAccess.getStepObjectAccess().getStepDefinitionsAssignment_5()); 
            // InternalSheepDog.g:896:2: ( rule__StepObject__StepDefinitionsAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==11) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSheepDog.g:896:3: rule__StepObject__StepDefinitionsAssignment_5
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
    // InternalSheepDog.g:905:1: rule__StepDefinition__Group__0 : rule__StepDefinition__Group__0__Impl rule__StepDefinition__Group__1 ;
    public final void rule__StepDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:909:1: ( rule__StepDefinition__Group__0__Impl rule__StepDefinition__Group__1 )
            // InternalSheepDog.g:910:2: rule__StepDefinition__Group__0__Impl rule__StepDefinition__Group__1
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
    // InternalSheepDog.g:917:1: rule__StepDefinition__Group__0__Impl : ( '==' ) ;
    public final void rule__StepDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:921:1: ( ( '==' ) )
            // InternalSheepDog.g:922:1: ( '==' )
            {
            // InternalSheepDog.g:922:1: ( '==' )
            // InternalSheepDog.g:923:2: '=='
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
    // InternalSheepDog.g:932:1: rule__StepDefinition__Group__1 : rule__StepDefinition__Group__1__Impl rule__StepDefinition__Group__2 ;
    public final void rule__StepDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:936:1: ( rule__StepDefinition__Group__1__Impl rule__StepDefinition__Group__2 )
            // InternalSheepDog.g:937:2: rule__StepDefinition__Group__1__Impl rule__StepDefinition__Group__2
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
    // InternalSheepDog.g:944:1: rule__StepDefinition__Group__1__Impl : ( 'Definition:' ) ;
    public final void rule__StepDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:948:1: ( ( 'Definition:' ) )
            // InternalSheepDog.g:949:1: ( 'Definition:' )
            {
            // InternalSheepDog.g:949:1: ( 'Definition:' )
            // InternalSheepDog.g:950:2: 'Definition:'
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
    // InternalSheepDog.g:959:1: rule__StepDefinition__Group__2 : rule__StepDefinition__Group__2__Impl rule__StepDefinition__Group__3 ;
    public final void rule__StepDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:963:1: ( rule__StepDefinition__Group__2__Impl rule__StepDefinition__Group__3 )
            // InternalSheepDog.g:964:2: rule__StepDefinition__Group__2__Impl rule__StepDefinition__Group__3
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
    // InternalSheepDog.g:971:1: rule__StepDefinition__Group__2__Impl : ( ( rule__StepDefinition__NameAssignment_2 ) ) ;
    public final void rule__StepDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:975:1: ( ( ( rule__StepDefinition__NameAssignment_2 ) ) )
            // InternalSheepDog.g:976:1: ( ( rule__StepDefinition__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:976:1: ( ( rule__StepDefinition__NameAssignment_2 ) )
            // InternalSheepDog.g:977:2: ( rule__StepDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getStepDefinitionAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:978:2: ( rule__StepDefinition__NameAssignment_2 )
            // InternalSheepDog.g:978:3: rule__StepDefinition__NameAssignment_2
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
    // InternalSheepDog.g:986:1: rule__StepDefinition__Group__3 : rule__StepDefinition__Group__3__Impl rule__StepDefinition__Group__4 ;
    public final void rule__StepDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:990:1: ( rule__StepDefinition__Group__3__Impl rule__StepDefinition__Group__4 )
            // InternalSheepDog.g:991:2: rule__StepDefinition__Group__3__Impl rule__StepDefinition__Group__4
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
    // InternalSheepDog.g:998:1: rule__StepDefinition__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__StepDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1002:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:1003:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:1003:1: ( RULE_EOL )
            // InternalSheepDog.g:1004:2: RULE_EOL
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
    // InternalSheepDog.g:1013:1: rule__StepDefinition__Group__4 : rule__StepDefinition__Group__4__Impl rule__StepDefinition__Group__5 ;
    public final void rule__StepDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1017:1: ( rule__StepDefinition__Group__4__Impl rule__StepDefinition__Group__5 )
            // InternalSheepDog.g:1018:2: rule__StepDefinition__Group__4__Impl rule__StepDefinition__Group__5
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
    // InternalSheepDog.g:1025:1: rule__StepDefinition__Group__4__Impl : ( ( rule__StepDefinition__StatementsAssignment_4 )* ) ;
    public final void rule__StepDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1029:1: ( ( ( rule__StepDefinition__StatementsAssignment_4 )* ) )
            // InternalSheepDog.g:1030:1: ( ( rule__StepDefinition__StatementsAssignment_4 )* )
            {
            // InternalSheepDog.g:1030:1: ( ( rule__StepDefinition__StatementsAssignment_4 )* )
            // InternalSheepDog.g:1031:2: ( rule__StepDefinition__StatementsAssignment_4 )*
            {
             before(grammarAccess.getStepDefinitionAccess().getStatementsAssignment_4()); 
            // InternalSheepDog.g:1032:2: ( rule__StepDefinition__StatementsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_WORD) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSheepDog.g:1032:3: rule__StepDefinition__StatementsAssignment_4
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
    // InternalSheepDog.g:1040:1: rule__StepDefinition__Group__5 : rule__StepDefinition__Group__5__Impl ;
    public final void rule__StepDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1044:1: ( rule__StepDefinition__Group__5__Impl )
            // InternalSheepDog.g:1045:2: rule__StepDefinition__Group__5__Impl
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
    // InternalSheepDog.g:1051:1: rule__StepDefinition__Group__5__Impl : ( ( rule__StepDefinition__StepParametersAssignment_5 )* ) ;
    public final void rule__StepDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1055:1: ( ( ( rule__StepDefinition__StepParametersAssignment_5 )* ) )
            // InternalSheepDog.g:1056:1: ( ( rule__StepDefinition__StepParametersAssignment_5 )* )
            {
            // InternalSheepDog.g:1056:1: ( ( rule__StepDefinition__StepParametersAssignment_5 )* )
            // InternalSheepDog.g:1057:2: ( rule__StepDefinition__StepParametersAssignment_5 )*
            {
             before(grammarAccess.getStepDefinitionAccess().getStepParametersAssignment_5()); 
            // InternalSheepDog.g:1058:2: ( rule__StepDefinition__StepParametersAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==13) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSheepDog.g:1058:3: rule__StepDefinition__StepParametersAssignment_5
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
    // InternalSheepDog.g:1067:1: rule__StepParameters__Group__0 : rule__StepParameters__Group__0__Impl rule__StepParameters__Group__1 ;
    public final void rule__StepParameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1071:1: ( rule__StepParameters__Group__0__Impl rule__StepParameters__Group__1 )
            // InternalSheepDog.g:1072:2: rule__StepParameters__Group__0__Impl rule__StepParameters__Group__1
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
    // InternalSheepDog.g:1079:1: rule__StepParameters__Group__0__Impl : ( '===' ) ;
    public final void rule__StepParameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1083:1: ( ( '===' ) )
            // InternalSheepDog.g:1084:1: ( '===' )
            {
            // InternalSheepDog.g:1084:1: ( '===' )
            // InternalSheepDog.g:1085:2: '==='
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
    // InternalSheepDog.g:1094:1: rule__StepParameters__Group__1 : rule__StepParameters__Group__1__Impl rule__StepParameters__Group__2 ;
    public final void rule__StepParameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1098:1: ( rule__StepParameters__Group__1__Impl rule__StepParameters__Group__2 )
            // InternalSheepDog.g:1099:2: rule__StepParameters__Group__1__Impl rule__StepParameters__Group__2
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
    // InternalSheepDog.g:1106:1: rule__StepParameters__Group__1__Impl : ( 'Parameters:' ) ;
    public final void rule__StepParameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1110:1: ( ( 'Parameters:' ) )
            // InternalSheepDog.g:1111:1: ( 'Parameters:' )
            {
            // InternalSheepDog.g:1111:1: ( 'Parameters:' )
            // InternalSheepDog.g:1112:2: 'Parameters:'
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
    // InternalSheepDog.g:1121:1: rule__StepParameters__Group__2 : rule__StepParameters__Group__2__Impl rule__StepParameters__Group__3 ;
    public final void rule__StepParameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1125:1: ( rule__StepParameters__Group__2__Impl rule__StepParameters__Group__3 )
            // InternalSheepDog.g:1126:2: rule__StepParameters__Group__2__Impl rule__StepParameters__Group__3
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
    // InternalSheepDog.g:1133:1: rule__StepParameters__Group__2__Impl : ( ( rule__StepParameters__NameAssignment_2 ) ) ;
    public final void rule__StepParameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1137:1: ( ( ( rule__StepParameters__NameAssignment_2 ) ) )
            // InternalSheepDog.g:1138:1: ( ( rule__StepParameters__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:1138:1: ( ( rule__StepParameters__NameAssignment_2 ) )
            // InternalSheepDog.g:1139:2: ( rule__StepParameters__NameAssignment_2 )
            {
             before(grammarAccess.getStepParametersAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:1140:2: ( rule__StepParameters__NameAssignment_2 )
            // InternalSheepDog.g:1140:3: rule__StepParameters__NameAssignment_2
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
    // InternalSheepDog.g:1148:1: rule__StepParameters__Group__3 : rule__StepParameters__Group__3__Impl rule__StepParameters__Group__4 ;
    public final void rule__StepParameters__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1152:1: ( rule__StepParameters__Group__3__Impl rule__StepParameters__Group__4 )
            // InternalSheepDog.g:1153:2: rule__StepParameters__Group__3__Impl rule__StepParameters__Group__4
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
    // InternalSheepDog.g:1160:1: rule__StepParameters__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__StepParameters__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1164:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:1165:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:1165:1: ( RULE_EOL )
            // InternalSheepDog.g:1166:2: RULE_EOL
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
    // InternalSheepDog.g:1175:1: rule__StepParameters__Group__4 : rule__StepParameters__Group__4__Impl rule__StepParameters__Group__5 ;
    public final void rule__StepParameters__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1179:1: ( rule__StepParameters__Group__4__Impl rule__StepParameters__Group__5 )
            // InternalSheepDog.g:1180:2: rule__StepParameters__Group__4__Impl rule__StepParameters__Group__5
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
    // InternalSheepDog.g:1187:1: rule__StepParameters__Group__4__Impl : ( ( rule__StepParameters__StatementsAssignment_4 )* ) ;
    public final void rule__StepParameters__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1191:1: ( ( ( rule__StepParameters__StatementsAssignment_4 )* ) )
            // InternalSheepDog.g:1192:1: ( ( rule__StepParameters__StatementsAssignment_4 )* )
            {
            // InternalSheepDog.g:1192:1: ( ( rule__StepParameters__StatementsAssignment_4 )* )
            // InternalSheepDog.g:1193:2: ( rule__StepParameters__StatementsAssignment_4 )*
            {
             before(grammarAccess.getStepParametersAccess().getStatementsAssignment_4()); 
            // InternalSheepDog.g:1194:2: ( rule__StepParameters__StatementsAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_WORD) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSheepDog.g:1194:3: rule__StepParameters__StatementsAssignment_4
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
    // InternalSheepDog.g:1202:1: rule__StepParameters__Group__5 : rule__StepParameters__Group__5__Impl ;
    public final void rule__StepParameters__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1206:1: ( rule__StepParameters__Group__5__Impl )
            // InternalSheepDog.g:1207:2: rule__StepParameters__Group__5__Impl
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
    // InternalSheepDog.g:1213:1: rule__StepParameters__Group__5__Impl : ( ( rule__StepParameters__ParametersTableAssignment_5 ) ) ;
    public final void rule__StepParameters__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1217:1: ( ( ( rule__StepParameters__ParametersTableAssignment_5 ) ) )
            // InternalSheepDog.g:1218:1: ( ( rule__StepParameters__ParametersTableAssignment_5 ) )
            {
            // InternalSheepDog.g:1218:1: ( ( rule__StepParameters__ParametersTableAssignment_5 ) )
            // InternalSheepDog.g:1219:2: ( rule__StepParameters__ParametersTableAssignment_5 )
            {
             before(grammarAccess.getStepParametersAccess().getParametersTableAssignment_5()); 
            // InternalSheepDog.g:1220:2: ( rule__StepParameters__ParametersTableAssignment_5 )
            // InternalSheepDog.g:1220:3: rule__StepParameters__ParametersTableAssignment_5
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
    // InternalSheepDog.g:1229:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1233:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalSheepDog.g:1234:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
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
    // InternalSheepDog.g:1241:1: rule__Feature__Group__0__Impl : ( '=' ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1245:1: ( ( '=' ) )
            // InternalSheepDog.g:1246:1: ( '=' )
            {
            // InternalSheepDog.g:1246:1: ( '=' )
            // InternalSheepDog.g:1247:2: '='
            {
             before(grammarAccess.getFeatureAccess().getEqualsSignKeyword_0()); 
            match(input,9,FOLLOW_2); 
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
    // InternalSheepDog.g:1256:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1260:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalSheepDog.g:1261:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
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
    // InternalSheepDog.g:1268:1: rule__Feature__Group__1__Impl : ( 'Feature:' ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1272:1: ( ( 'Feature:' ) )
            // InternalSheepDog.g:1273:1: ( 'Feature:' )
            {
            // InternalSheepDog.g:1273:1: ( 'Feature:' )
            // InternalSheepDog.g:1274:2: 'Feature:'
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
    // InternalSheepDog.g:1283:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1287:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalSheepDog.g:1288:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
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
    // InternalSheepDog.g:1295:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__NameAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1299:1: ( ( ( rule__Feature__NameAssignment_2 ) ) )
            // InternalSheepDog.g:1300:1: ( ( rule__Feature__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:1300:1: ( ( rule__Feature__NameAssignment_2 ) )
            // InternalSheepDog.g:1301:2: ( rule__Feature__NameAssignment_2 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:1302:2: ( rule__Feature__NameAssignment_2 )
            // InternalSheepDog.g:1302:3: rule__Feature__NameAssignment_2
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
    // InternalSheepDog.g:1310:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1314:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalSheepDog.g:1315:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalSheepDog.g:1322:1: rule__Feature__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1326:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:1327:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:1327:1: ( RULE_EOL )
            // InternalSheepDog.g:1328:2: RULE_EOL
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
    // InternalSheepDog.g:1337:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl rule__Feature__Group__5 ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1341:1: ( rule__Feature__Group__4__Impl rule__Feature__Group__5 )
            // InternalSheepDog.g:1342:2: rule__Feature__Group__4__Impl rule__Feature__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalSheepDog.g:1349:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__StatementsAssignment_4 )* ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1353:1: ( ( ( rule__Feature__StatementsAssignment_4 )* ) )
            // InternalSheepDog.g:1354:1: ( ( rule__Feature__StatementsAssignment_4 )* )
            {
            // InternalSheepDog.g:1354:1: ( ( rule__Feature__StatementsAssignment_4 )* )
            // InternalSheepDog.g:1355:2: ( rule__Feature__StatementsAssignment_4 )*
            {
             before(grammarAccess.getFeatureAccess().getStatementsAssignment_4()); 
            // InternalSheepDog.g:1356:2: ( rule__Feature__StatementsAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_WORD) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSheepDog.g:1356:3: rule__Feature__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Feature__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalSheepDog.g:1364:1: rule__Feature__Group__5 : rule__Feature__Group__5__Impl ;
    public final void rule__Feature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1368:1: ( rule__Feature__Group__5__Impl )
            // InternalSheepDog.g:1369:2: rule__Feature__Group__5__Impl
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
    // InternalSheepDog.g:1375:1: rule__Feature__Group__5__Impl : ( ( rule__Feature__AbstractScenariosAssignment_5 )* ) ;
    public final void rule__Feature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1379:1: ( ( ( rule__Feature__AbstractScenariosAssignment_5 )* ) )
            // InternalSheepDog.g:1380:1: ( ( rule__Feature__AbstractScenariosAssignment_5 )* )
            {
            // InternalSheepDog.g:1380:1: ( ( rule__Feature__AbstractScenariosAssignment_5 )* )
            // InternalSheepDog.g:1381:2: ( rule__Feature__AbstractScenariosAssignment_5 )*
            {
             before(grammarAccess.getFeatureAccess().getAbstractScenariosAssignment_5()); 
            // InternalSheepDog.g:1382:2: ( rule__Feature__AbstractScenariosAssignment_5 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==11||LA15_0==24) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSheepDog.g:1382:3: rule__Feature__AbstractScenariosAssignment_5
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Feature__AbstractScenariosAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getAbstractScenariosAssignment_5()); 

            }


            }

        }
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
    // InternalSheepDog.g:1391:1: rule__Background__Group__0 : rule__Background__Group__0__Impl rule__Background__Group__1 ;
    public final void rule__Background__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1395:1: ( rule__Background__Group__0__Impl rule__Background__Group__1 )
            // InternalSheepDog.g:1396:2: rule__Background__Group__0__Impl rule__Background__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSheepDog.g:1403:1: rule__Background__Group__0__Impl : ( ( rule__Background__TagsAssignment_0 )? ) ;
    public final void rule__Background__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1407:1: ( ( ( rule__Background__TagsAssignment_0 )? ) )
            // InternalSheepDog.g:1408:1: ( ( rule__Background__TagsAssignment_0 )? )
            {
            // InternalSheepDog.g:1408:1: ( ( rule__Background__TagsAssignment_0 )? )
            // InternalSheepDog.g:1409:2: ( rule__Background__TagsAssignment_0 )?
            {
             before(grammarAccess.getBackgroundAccess().getTagsAssignment_0()); 
            // InternalSheepDog.g:1410:2: ( rule__Background__TagsAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSheepDog.g:1410:3: rule__Background__TagsAssignment_0
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
    // InternalSheepDog.g:1418:1: rule__Background__Group__1 : rule__Background__Group__1__Impl rule__Background__Group__2 ;
    public final void rule__Background__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1422:1: ( rule__Background__Group__1__Impl rule__Background__Group__2 )
            // InternalSheepDog.g:1423:2: rule__Background__Group__1__Impl rule__Background__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalSheepDog.g:1430:1: rule__Background__Group__1__Impl : ( '==' ) ;
    public final void rule__Background__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1434:1: ( ( '==' ) )
            // InternalSheepDog.g:1435:1: ( '==' )
            {
            // InternalSheepDog.g:1435:1: ( '==' )
            // InternalSheepDog.g:1436:2: '=='
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
    // InternalSheepDog.g:1445:1: rule__Background__Group__2 : rule__Background__Group__2__Impl rule__Background__Group__3 ;
    public final void rule__Background__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1449:1: ( rule__Background__Group__2__Impl rule__Background__Group__3 )
            // InternalSheepDog.g:1450:2: rule__Background__Group__2__Impl rule__Background__Group__3
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
    // InternalSheepDog.g:1457:1: rule__Background__Group__2__Impl : ( 'Background:' ) ;
    public final void rule__Background__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1461:1: ( ( 'Background:' ) )
            // InternalSheepDog.g:1462:1: ( 'Background:' )
            {
            // InternalSheepDog.g:1462:1: ( 'Background:' )
            // InternalSheepDog.g:1463:2: 'Background:'
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
    // InternalSheepDog.g:1472:1: rule__Background__Group__3 : rule__Background__Group__3__Impl rule__Background__Group__4 ;
    public final void rule__Background__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1476:1: ( rule__Background__Group__3__Impl rule__Background__Group__4 )
            // InternalSheepDog.g:1477:2: rule__Background__Group__3__Impl rule__Background__Group__4
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
    // InternalSheepDog.g:1484:1: rule__Background__Group__3__Impl : ( ( rule__Background__NameAssignment_3 ) ) ;
    public final void rule__Background__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1488:1: ( ( ( rule__Background__NameAssignment_3 ) ) )
            // InternalSheepDog.g:1489:1: ( ( rule__Background__NameAssignment_3 ) )
            {
            // InternalSheepDog.g:1489:1: ( ( rule__Background__NameAssignment_3 ) )
            // InternalSheepDog.g:1490:2: ( rule__Background__NameAssignment_3 )
            {
             before(grammarAccess.getBackgroundAccess().getNameAssignment_3()); 
            // InternalSheepDog.g:1491:2: ( rule__Background__NameAssignment_3 )
            // InternalSheepDog.g:1491:3: rule__Background__NameAssignment_3
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
    // InternalSheepDog.g:1499:1: rule__Background__Group__4 : rule__Background__Group__4__Impl rule__Background__Group__5 ;
    public final void rule__Background__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1503:1: ( rule__Background__Group__4__Impl rule__Background__Group__5 )
            // InternalSheepDog.g:1504:2: rule__Background__Group__4__Impl rule__Background__Group__5
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
    // InternalSheepDog.g:1511:1: rule__Background__Group__4__Impl : ( RULE_EOL ) ;
    public final void rule__Background__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1515:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:1516:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:1516:1: ( RULE_EOL )
            // InternalSheepDog.g:1517:2: RULE_EOL
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
    // InternalSheepDog.g:1526:1: rule__Background__Group__5 : rule__Background__Group__5__Impl rule__Background__Group__6 ;
    public final void rule__Background__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1530:1: ( rule__Background__Group__5__Impl rule__Background__Group__6 )
            // InternalSheepDog.g:1531:2: rule__Background__Group__5__Impl rule__Background__Group__6
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
    // InternalSheepDog.g:1538:1: rule__Background__Group__5__Impl : ( ( rule__Background__StatementsAssignment_5 )* ) ;
    public final void rule__Background__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1542:1: ( ( ( rule__Background__StatementsAssignment_5 )* ) )
            // InternalSheepDog.g:1543:1: ( ( rule__Background__StatementsAssignment_5 )* )
            {
            // InternalSheepDog.g:1543:1: ( ( rule__Background__StatementsAssignment_5 )* )
            // InternalSheepDog.g:1544:2: ( rule__Background__StatementsAssignment_5 )*
            {
             before(grammarAccess.getBackgroundAccess().getStatementsAssignment_5()); 
            // InternalSheepDog.g:1545:2: ( rule__Background__StatementsAssignment_5 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_WORD) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSheepDog.g:1545:3: rule__Background__StatementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Background__StatementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalSheepDog.g:1553:1: rule__Background__Group__6 : rule__Background__Group__6__Impl ;
    public final void rule__Background__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1557:1: ( rule__Background__Group__6__Impl )
            // InternalSheepDog.g:1558:2: rule__Background__Group__6__Impl
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
    // InternalSheepDog.g:1564:1: rule__Background__Group__6__Impl : ( ( rule__Background__StepsAssignment_6 )* ) ;
    public final void rule__Background__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1568:1: ( ( ( rule__Background__StepsAssignment_6 )* ) )
            // InternalSheepDog.g:1569:1: ( ( rule__Background__StepsAssignment_6 )* )
            {
            // InternalSheepDog.g:1569:1: ( ( rule__Background__StepsAssignment_6 )* )
            // InternalSheepDog.g:1570:2: ( rule__Background__StepsAssignment_6 )*
            {
             before(grammarAccess.getBackgroundAccess().getStepsAssignment_6()); 
            // InternalSheepDog.g:1571:2: ( rule__Background__StepsAssignment_6 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==13) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSheepDog.g:1571:3: rule__Background__StepsAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Background__StepsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalSheepDog.g:1580:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1584:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalSheepDog.g:1585:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSheepDog.g:1592:1: rule__Scenario__Group__0__Impl : ( ( rule__Scenario__TagsAssignment_0 )? ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1596:1: ( ( ( rule__Scenario__TagsAssignment_0 )? ) )
            // InternalSheepDog.g:1597:1: ( ( rule__Scenario__TagsAssignment_0 )? )
            {
            // InternalSheepDog.g:1597:1: ( ( rule__Scenario__TagsAssignment_0 )? )
            // InternalSheepDog.g:1598:2: ( rule__Scenario__TagsAssignment_0 )?
            {
             before(grammarAccess.getScenarioAccess().getTagsAssignment_0()); 
            // InternalSheepDog.g:1599:2: ( rule__Scenario__TagsAssignment_0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSheepDog.g:1599:3: rule__Scenario__TagsAssignment_0
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
    // InternalSheepDog.g:1607:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1611:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalSheepDog.g:1612:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalSheepDog.g:1619:1: rule__Scenario__Group__1__Impl : ( '==' ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1623:1: ( ( '==' ) )
            // InternalSheepDog.g:1624:1: ( '==' )
            {
            // InternalSheepDog.g:1624:1: ( '==' )
            // InternalSheepDog.g:1625:2: '=='
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
    // InternalSheepDog.g:1634:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1638:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // InternalSheepDog.g:1639:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
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
    // InternalSheepDog.g:1646:1: rule__Scenario__Group__2__Impl : ( 'Scenario:' ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1650:1: ( ( 'Scenario:' ) )
            // InternalSheepDog.g:1651:1: ( 'Scenario:' )
            {
            // InternalSheepDog.g:1651:1: ( 'Scenario:' )
            // InternalSheepDog.g:1652:2: 'Scenario:'
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
    // InternalSheepDog.g:1661:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl rule__Scenario__Group__4 ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1665:1: ( rule__Scenario__Group__3__Impl rule__Scenario__Group__4 )
            // InternalSheepDog.g:1666:2: rule__Scenario__Group__3__Impl rule__Scenario__Group__4
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
    // InternalSheepDog.g:1673:1: rule__Scenario__Group__3__Impl : ( ( rule__Scenario__NameAssignment_3 ) ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1677:1: ( ( ( rule__Scenario__NameAssignment_3 ) ) )
            // InternalSheepDog.g:1678:1: ( ( rule__Scenario__NameAssignment_3 ) )
            {
            // InternalSheepDog.g:1678:1: ( ( rule__Scenario__NameAssignment_3 ) )
            // InternalSheepDog.g:1679:2: ( rule__Scenario__NameAssignment_3 )
            {
             before(grammarAccess.getScenarioAccess().getNameAssignment_3()); 
            // InternalSheepDog.g:1680:2: ( rule__Scenario__NameAssignment_3 )
            // InternalSheepDog.g:1680:3: rule__Scenario__NameAssignment_3
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
    // InternalSheepDog.g:1688:1: rule__Scenario__Group__4 : rule__Scenario__Group__4__Impl rule__Scenario__Group__5 ;
    public final void rule__Scenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1692:1: ( rule__Scenario__Group__4__Impl rule__Scenario__Group__5 )
            // InternalSheepDog.g:1693:2: rule__Scenario__Group__4__Impl rule__Scenario__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalSheepDog.g:1700:1: rule__Scenario__Group__4__Impl : ( RULE_EOL ) ;
    public final void rule__Scenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1704:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:1705:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:1705:1: ( RULE_EOL )
            // InternalSheepDog.g:1706:2: RULE_EOL
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
    // InternalSheepDog.g:1715:1: rule__Scenario__Group__5 : rule__Scenario__Group__5__Impl rule__Scenario__Group__6 ;
    public final void rule__Scenario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1719:1: ( rule__Scenario__Group__5__Impl rule__Scenario__Group__6 )
            // InternalSheepDog.g:1720:2: rule__Scenario__Group__5__Impl rule__Scenario__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalSheepDog.g:1727:1: rule__Scenario__Group__5__Impl : ( ( rule__Scenario__StatementsAssignment_5 )* ) ;
    public final void rule__Scenario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1731:1: ( ( ( rule__Scenario__StatementsAssignment_5 )* ) )
            // InternalSheepDog.g:1732:1: ( ( rule__Scenario__StatementsAssignment_5 )* )
            {
            // InternalSheepDog.g:1732:1: ( ( rule__Scenario__StatementsAssignment_5 )* )
            // InternalSheepDog.g:1733:2: ( rule__Scenario__StatementsAssignment_5 )*
            {
             before(grammarAccess.getScenarioAccess().getStatementsAssignment_5()); 
            // InternalSheepDog.g:1734:2: ( rule__Scenario__StatementsAssignment_5 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_WORD) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSheepDog.g:1734:3: rule__Scenario__StatementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Scenario__StatementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalSheepDog.g:1742:1: rule__Scenario__Group__6 : rule__Scenario__Group__6__Impl rule__Scenario__Group__7 ;
    public final void rule__Scenario__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1746:1: ( rule__Scenario__Group__6__Impl rule__Scenario__Group__7 )
            // InternalSheepDog.g:1747:2: rule__Scenario__Group__6__Impl rule__Scenario__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalSheepDog.g:1754:1: rule__Scenario__Group__6__Impl : ( ( rule__Scenario__StepsAssignment_6 )* ) ;
    public final void rule__Scenario__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1758:1: ( ( ( rule__Scenario__StepsAssignment_6 )* ) )
            // InternalSheepDog.g:1759:1: ( ( rule__Scenario__StepsAssignment_6 )* )
            {
            // InternalSheepDog.g:1759:1: ( ( rule__Scenario__StepsAssignment_6 )* )
            // InternalSheepDog.g:1760:2: ( rule__Scenario__StepsAssignment_6 )*
            {
             before(grammarAccess.getScenarioAccess().getStepsAssignment_6()); 
            // InternalSheepDog.g:1761:2: ( rule__Scenario__StepsAssignment_6 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==13) ) {
                    int LA21_2 = input.LA(2);

                    if ( ((LA21_2>=19 && LA21_2<=22)) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // InternalSheepDog.g:1761:3: rule__Scenario__StepsAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Scenario__StepsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalSheepDog.g:1769:1: rule__Scenario__Group__7 : rule__Scenario__Group__7__Impl ;
    public final void rule__Scenario__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1773:1: ( rule__Scenario__Group__7__Impl )
            // InternalSheepDog.g:1774:2: rule__Scenario__Group__7__Impl
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
    // InternalSheepDog.g:1780:1: rule__Scenario__Group__7__Impl : ( ( rule__Scenario__ExamplesAssignment_7 )* ) ;
    public final void rule__Scenario__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1784:1: ( ( ( rule__Scenario__ExamplesAssignment_7 )* ) )
            // InternalSheepDog.g:1785:1: ( ( rule__Scenario__ExamplesAssignment_7 )* )
            {
            // InternalSheepDog.g:1785:1: ( ( rule__Scenario__ExamplesAssignment_7 )* )
            // InternalSheepDog.g:1786:2: ( rule__Scenario__ExamplesAssignment_7 )*
            {
             before(grammarAccess.getScenarioAccess().getExamplesAssignment_7()); 
            // InternalSheepDog.g:1787:2: ( rule__Scenario__ExamplesAssignment_7 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==24) ) {
                    int LA22_2 = input.LA(2);

                    if ( (LA22_2==RULE_WORD) ) {
                        int LA22_4 = input.LA(3);

                        if ( (LA22_4==25) ) {
                            int LA22_5 = input.LA(4);

                            if ( (LA22_5==RULE_EOL) ) {
                                int LA22_6 = input.LA(5);

                                if ( (LA22_6==13) ) {
                                    alt22=1;
                                }


                            }


                        }


                    }


                }
                else if ( (LA22_0==13) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSheepDog.g:1787:3: rule__Scenario__ExamplesAssignment_7
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Scenario__ExamplesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalSheepDog.g:1796:1: rule__Examples__Group__0 : rule__Examples__Group__0__Impl rule__Examples__Group__1 ;
    public final void rule__Examples__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1800:1: ( rule__Examples__Group__0__Impl rule__Examples__Group__1 )
            // InternalSheepDog.g:1801:2: rule__Examples__Group__0__Impl rule__Examples__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalSheepDog.g:1808:1: rule__Examples__Group__0__Impl : ( ( rule__Examples__TagsAssignment_0 )? ) ;
    public final void rule__Examples__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1812:1: ( ( ( rule__Examples__TagsAssignment_0 )? ) )
            // InternalSheepDog.g:1813:1: ( ( rule__Examples__TagsAssignment_0 )? )
            {
            // InternalSheepDog.g:1813:1: ( ( rule__Examples__TagsAssignment_0 )? )
            // InternalSheepDog.g:1814:2: ( rule__Examples__TagsAssignment_0 )?
            {
             before(grammarAccess.getExamplesAccess().getTagsAssignment_0()); 
            // InternalSheepDog.g:1815:2: ( rule__Examples__TagsAssignment_0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSheepDog.g:1815:3: rule__Examples__TagsAssignment_0
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
    // InternalSheepDog.g:1823:1: rule__Examples__Group__1 : rule__Examples__Group__1__Impl rule__Examples__Group__2 ;
    public final void rule__Examples__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1827:1: ( rule__Examples__Group__1__Impl rule__Examples__Group__2 )
            // InternalSheepDog.g:1828:2: rule__Examples__Group__1__Impl rule__Examples__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalSheepDog.g:1835:1: rule__Examples__Group__1__Impl : ( '===' ) ;
    public final void rule__Examples__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1839:1: ( ( '===' ) )
            // InternalSheepDog.g:1840:1: ( '===' )
            {
            // InternalSheepDog.g:1840:1: ( '===' )
            // InternalSheepDog.g:1841:2: '==='
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
    // InternalSheepDog.g:1850:1: rule__Examples__Group__2 : rule__Examples__Group__2__Impl rule__Examples__Group__3 ;
    public final void rule__Examples__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1854:1: ( rule__Examples__Group__2__Impl rule__Examples__Group__3 )
            // InternalSheepDog.g:1855:2: rule__Examples__Group__2__Impl rule__Examples__Group__3
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
    // InternalSheepDog.g:1862:1: rule__Examples__Group__2__Impl : ( 'Examples:' ) ;
    public final void rule__Examples__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1866:1: ( ( 'Examples:' ) )
            // InternalSheepDog.g:1867:1: ( 'Examples:' )
            {
            // InternalSheepDog.g:1867:1: ( 'Examples:' )
            // InternalSheepDog.g:1868:2: 'Examples:'
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
    // InternalSheepDog.g:1877:1: rule__Examples__Group__3 : rule__Examples__Group__3__Impl rule__Examples__Group__4 ;
    public final void rule__Examples__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1881:1: ( rule__Examples__Group__3__Impl rule__Examples__Group__4 )
            // InternalSheepDog.g:1882:2: rule__Examples__Group__3__Impl rule__Examples__Group__4
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
    // InternalSheepDog.g:1889:1: rule__Examples__Group__3__Impl : ( ( rule__Examples__NameAssignment_3 ) ) ;
    public final void rule__Examples__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1893:1: ( ( ( rule__Examples__NameAssignment_3 ) ) )
            // InternalSheepDog.g:1894:1: ( ( rule__Examples__NameAssignment_3 ) )
            {
            // InternalSheepDog.g:1894:1: ( ( rule__Examples__NameAssignment_3 ) )
            // InternalSheepDog.g:1895:2: ( rule__Examples__NameAssignment_3 )
            {
             before(grammarAccess.getExamplesAccess().getNameAssignment_3()); 
            // InternalSheepDog.g:1896:2: ( rule__Examples__NameAssignment_3 )
            // InternalSheepDog.g:1896:3: rule__Examples__NameAssignment_3
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
    // InternalSheepDog.g:1904:1: rule__Examples__Group__4 : rule__Examples__Group__4__Impl rule__Examples__Group__5 ;
    public final void rule__Examples__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1908:1: ( rule__Examples__Group__4__Impl rule__Examples__Group__5 )
            // InternalSheepDog.g:1909:2: rule__Examples__Group__4__Impl rule__Examples__Group__5
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
    // InternalSheepDog.g:1916:1: rule__Examples__Group__4__Impl : ( RULE_EOL ) ;
    public final void rule__Examples__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1920:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:1921:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:1921:1: ( RULE_EOL )
            // InternalSheepDog.g:1922:2: RULE_EOL
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
    // InternalSheepDog.g:1931:1: rule__Examples__Group__5 : rule__Examples__Group__5__Impl rule__Examples__Group__6 ;
    public final void rule__Examples__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1935:1: ( rule__Examples__Group__5__Impl rule__Examples__Group__6 )
            // InternalSheepDog.g:1936:2: rule__Examples__Group__5__Impl rule__Examples__Group__6
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
    // InternalSheepDog.g:1943:1: rule__Examples__Group__5__Impl : ( ( rule__Examples__StatementsAssignment_5 )* ) ;
    public final void rule__Examples__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1947:1: ( ( ( rule__Examples__StatementsAssignment_5 )* ) )
            // InternalSheepDog.g:1948:1: ( ( rule__Examples__StatementsAssignment_5 )* )
            {
            // InternalSheepDog.g:1948:1: ( ( rule__Examples__StatementsAssignment_5 )* )
            // InternalSheepDog.g:1949:2: ( rule__Examples__StatementsAssignment_5 )*
            {
             before(grammarAccess.getExamplesAccess().getStatementsAssignment_5()); 
            // InternalSheepDog.g:1950:2: ( rule__Examples__StatementsAssignment_5 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_WORD) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSheepDog.g:1950:3: rule__Examples__StatementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Examples__StatementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalSheepDog.g:1958:1: rule__Examples__Group__6 : rule__Examples__Group__6__Impl ;
    public final void rule__Examples__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1962:1: ( rule__Examples__Group__6__Impl )
            // InternalSheepDog.g:1963:2: rule__Examples__Group__6__Impl
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
    // InternalSheepDog.g:1969:1: rule__Examples__Group__6__Impl : ( ( rule__Examples__TheExamplesTableAssignment_6 ) ) ;
    public final void rule__Examples__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1973:1: ( ( ( rule__Examples__TheExamplesTableAssignment_6 ) ) )
            // InternalSheepDog.g:1974:1: ( ( rule__Examples__TheExamplesTableAssignment_6 ) )
            {
            // InternalSheepDog.g:1974:1: ( ( rule__Examples__TheExamplesTableAssignment_6 ) )
            // InternalSheepDog.g:1975:2: ( rule__Examples__TheExamplesTableAssignment_6 )
            {
             before(grammarAccess.getExamplesAccess().getTheExamplesTableAssignment_6()); 
            // InternalSheepDog.g:1976:2: ( rule__Examples__TheExamplesTableAssignment_6 )
            // InternalSheepDog.g:1976:3: rule__Examples__TheExamplesTableAssignment_6
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
    // InternalSheepDog.g:1985:1: rule__Given__Group__0 : rule__Given__Group__0__Impl rule__Given__Group__1 ;
    public final void rule__Given__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:1989:1: ( rule__Given__Group__0__Impl rule__Given__Group__1 )
            // InternalSheepDog.g:1990:2: rule__Given__Group__0__Impl rule__Given__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalSheepDog.g:1997:1: rule__Given__Group__0__Impl : ( '===' ) ;
    public final void rule__Given__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2001:1: ( ( '===' ) )
            // InternalSheepDog.g:2002:1: ( '===' )
            {
            // InternalSheepDog.g:2002:1: ( '===' )
            // InternalSheepDog.g:2003:2: '==='
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
    // InternalSheepDog.g:2012:1: rule__Given__Group__1 : rule__Given__Group__1__Impl rule__Given__Group__2 ;
    public final void rule__Given__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2016:1: ( rule__Given__Group__1__Impl rule__Given__Group__2 )
            // InternalSheepDog.g:2017:2: rule__Given__Group__1__Impl rule__Given__Group__2
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
    // InternalSheepDog.g:2024:1: rule__Given__Group__1__Impl : ( 'Given:' ) ;
    public final void rule__Given__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2028:1: ( ( 'Given:' ) )
            // InternalSheepDog.g:2029:1: ( 'Given:' )
            {
            // InternalSheepDog.g:2029:1: ( 'Given:' )
            // InternalSheepDog.g:2030:2: 'Given:'
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
    // InternalSheepDog.g:2039:1: rule__Given__Group__2 : rule__Given__Group__2__Impl rule__Given__Group__3 ;
    public final void rule__Given__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2043:1: ( rule__Given__Group__2__Impl rule__Given__Group__3 )
            // InternalSheepDog.g:2044:2: rule__Given__Group__2__Impl rule__Given__Group__3
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
    // InternalSheepDog.g:2051:1: rule__Given__Group__2__Impl : ( ( rule__Given__NameAssignment_2 ) ) ;
    public final void rule__Given__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2055:1: ( ( ( rule__Given__NameAssignment_2 ) ) )
            // InternalSheepDog.g:2056:1: ( ( rule__Given__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:2056:1: ( ( rule__Given__NameAssignment_2 ) )
            // InternalSheepDog.g:2057:2: ( rule__Given__NameAssignment_2 )
            {
             before(grammarAccess.getGivenAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:2058:2: ( rule__Given__NameAssignment_2 )
            // InternalSheepDog.g:2058:3: rule__Given__NameAssignment_2
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
    // InternalSheepDog.g:2066:1: rule__Given__Group__3 : rule__Given__Group__3__Impl rule__Given__Group__4 ;
    public final void rule__Given__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2070:1: ( rule__Given__Group__3__Impl rule__Given__Group__4 )
            // InternalSheepDog.g:2071:2: rule__Given__Group__3__Impl rule__Given__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalSheepDog.g:2078:1: rule__Given__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Given__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2082:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2083:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2083:1: ( RULE_EOL )
            // InternalSheepDog.g:2084:2: RULE_EOL
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
    // InternalSheepDog.g:2093:1: rule__Given__Group__4 : rule__Given__Group__4__Impl ;
    public final void rule__Given__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2097:1: ( rule__Given__Group__4__Impl )
            // InternalSheepDog.g:2098:2: rule__Given__Group__4__Impl
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
    // InternalSheepDog.g:2104:1: rule__Given__Group__4__Impl : ( ( rule__Given__Alternatives_4 )? ) ;
    public final void rule__Given__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2108:1: ( ( ( rule__Given__Alternatives_4 )? ) )
            // InternalSheepDog.g:2109:1: ( ( rule__Given__Alternatives_4 )? )
            {
            // InternalSheepDog.g:2109:1: ( ( rule__Given__Alternatives_4 )? )
            // InternalSheepDog.g:2110:2: ( rule__Given__Alternatives_4 )?
            {
             before(grammarAccess.getGivenAccess().getAlternatives_4()); 
            // InternalSheepDog.g:2111:2: ( rule__Given__Alternatives_4 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_RAWTEXT||LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSheepDog.g:2111:3: rule__Given__Alternatives_4
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
    // InternalSheepDog.g:2120:1: rule__When__Group__0 : rule__When__Group__0__Impl rule__When__Group__1 ;
    public final void rule__When__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2124:1: ( rule__When__Group__0__Impl rule__When__Group__1 )
            // InternalSheepDog.g:2125:2: rule__When__Group__0__Impl rule__When__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalSheepDog.g:2132:1: rule__When__Group__0__Impl : ( '===' ) ;
    public final void rule__When__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2136:1: ( ( '===' ) )
            // InternalSheepDog.g:2137:1: ( '===' )
            {
            // InternalSheepDog.g:2137:1: ( '===' )
            // InternalSheepDog.g:2138:2: '==='
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
    // InternalSheepDog.g:2147:1: rule__When__Group__1 : rule__When__Group__1__Impl rule__When__Group__2 ;
    public final void rule__When__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2151:1: ( rule__When__Group__1__Impl rule__When__Group__2 )
            // InternalSheepDog.g:2152:2: rule__When__Group__1__Impl rule__When__Group__2
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
    // InternalSheepDog.g:2159:1: rule__When__Group__1__Impl : ( 'When:' ) ;
    public final void rule__When__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2163:1: ( ( 'When:' ) )
            // InternalSheepDog.g:2164:1: ( 'When:' )
            {
            // InternalSheepDog.g:2164:1: ( 'When:' )
            // InternalSheepDog.g:2165:2: 'When:'
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
    // InternalSheepDog.g:2174:1: rule__When__Group__2 : rule__When__Group__2__Impl rule__When__Group__3 ;
    public final void rule__When__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2178:1: ( rule__When__Group__2__Impl rule__When__Group__3 )
            // InternalSheepDog.g:2179:2: rule__When__Group__2__Impl rule__When__Group__3
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
    // InternalSheepDog.g:2186:1: rule__When__Group__2__Impl : ( ( rule__When__NameAssignment_2 ) ) ;
    public final void rule__When__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2190:1: ( ( ( rule__When__NameAssignment_2 ) ) )
            // InternalSheepDog.g:2191:1: ( ( rule__When__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:2191:1: ( ( rule__When__NameAssignment_2 ) )
            // InternalSheepDog.g:2192:2: ( rule__When__NameAssignment_2 )
            {
             before(grammarAccess.getWhenAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:2193:2: ( rule__When__NameAssignment_2 )
            // InternalSheepDog.g:2193:3: rule__When__NameAssignment_2
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
    // InternalSheepDog.g:2201:1: rule__When__Group__3 : rule__When__Group__3__Impl rule__When__Group__4 ;
    public final void rule__When__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2205:1: ( rule__When__Group__3__Impl rule__When__Group__4 )
            // InternalSheepDog.g:2206:2: rule__When__Group__3__Impl rule__When__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalSheepDog.g:2213:1: rule__When__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__When__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2217:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2218:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2218:1: ( RULE_EOL )
            // InternalSheepDog.g:2219:2: RULE_EOL
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
    // InternalSheepDog.g:2228:1: rule__When__Group__4 : rule__When__Group__4__Impl ;
    public final void rule__When__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2232:1: ( rule__When__Group__4__Impl )
            // InternalSheepDog.g:2233:2: rule__When__Group__4__Impl
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
    // InternalSheepDog.g:2239:1: rule__When__Group__4__Impl : ( ( rule__When__Alternatives_4 )? ) ;
    public final void rule__When__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2243:1: ( ( ( rule__When__Alternatives_4 )? ) )
            // InternalSheepDog.g:2244:1: ( ( rule__When__Alternatives_4 )? )
            {
            // InternalSheepDog.g:2244:1: ( ( rule__When__Alternatives_4 )? )
            // InternalSheepDog.g:2245:2: ( rule__When__Alternatives_4 )?
            {
             before(grammarAccess.getWhenAccess().getAlternatives_4()); 
            // InternalSheepDog.g:2246:2: ( rule__When__Alternatives_4 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_RAWTEXT||LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSheepDog.g:2246:3: rule__When__Alternatives_4
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
    // InternalSheepDog.g:2255:1: rule__Then__Group__0 : rule__Then__Group__0__Impl rule__Then__Group__1 ;
    public final void rule__Then__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2259:1: ( rule__Then__Group__0__Impl rule__Then__Group__1 )
            // InternalSheepDog.g:2260:2: rule__Then__Group__0__Impl rule__Then__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSheepDog.g:2267:1: rule__Then__Group__0__Impl : ( '===' ) ;
    public final void rule__Then__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2271:1: ( ( '===' ) )
            // InternalSheepDog.g:2272:1: ( '===' )
            {
            // InternalSheepDog.g:2272:1: ( '===' )
            // InternalSheepDog.g:2273:2: '==='
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
    // InternalSheepDog.g:2282:1: rule__Then__Group__1 : rule__Then__Group__1__Impl rule__Then__Group__2 ;
    public final void rule__Then__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2286:1: ( rule__Then__Group__1__Impl rule__Then__Group__2 )
            // InternalSheepDog.g:2287:2: rule__Then__Group__1__Impl rule__Then__Group__2
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
    // InternalSheepDog.g:2294:1: rule__Then__Group__1__Impl : ( 'Then:' ) ;
    public final void rule__Then__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2298:1: ( ( 'Then:' ) )
            // InternalSheepDog.g:2299:1: ( 'Then:' )
            {
            // InternalSheepDog.g:2299:1: ( 'Then:' )
            // InternalSheepDog.g:2300:2: 'Then:'
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
    // InternalSheepDog.g:2309:1: rule__Then__Group__2 : rule__Then__Group__2__Impl rule__Then__Group__3 ;
    public final void rule__Then__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2313:1: ( rule__Then__Group__2__Impl rule__Then__Group__3 )
            // InternalSheepDog.g:2314:2: rule__Then__Group__2__Impl rule__Then__Group__3
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
    // InternalSheepDog.g:2321:1: rule__Then__Group__2__Impl : ( ( rule__Then__NameAssignment_2 ) ) ;
    public final void rule__Then__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2325:1: ( ( ( rule__Then__NameAssignment_2 ) ) )
            // InternalSheepDog.g:2326:1: ( ( rule__Then__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:2326:1: ( ( rule__Then__NameAssignment_2 ) )
            // InternalSheepDog.g:2327:2: ( rule__Then__NameAssignment_2 )
            {
             before(grammarAccess.getThenAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:2328:2: ( rule__Then__NameAssignment_2 )
            // InternalSheepDog.g:2328:3: rule__Then__NameAssignment_2
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
    // InternalSheepDog.g:2336:1: rule__Then__Group__3 : rule__Then__Group__3__Impl rule__Then__Group__4 ;
    public final void rule__Then__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2340:1: ( rule__Then__Group__3__Impl rule__Then__Group__4 )
            // InternalSheepDog.g:2341:2: rule__Then__Group__3__Impl rule__Then__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalSheepDog.g:2348:1: rule__Then__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Then__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2352:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2353:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2353:1: ( RULE_EOL )
            // InternalSheepDog.g:2354:2: RULE_EOL
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
    // InternalSheepDog.g:2363:1: rule__Then__Group__4 : rule__Then__Group__4__Impl ;
    public final void rule__Then__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2367:1: ( rule__Then__Group__4__Impl )
            // InternalSheepDog.g:2368:2: rule__Then__Group__4__Impl
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
    // InternalSheepDog.g:2374:1: rule__Then__Group__4__Impl : ( ( rule__Then__Alternatives_4 )? ) ;
    public final void rule__Then__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2378:1: ( ( ( rule__Then__Alternatives_4 )? ) )
            // InternalSheepDog.g:2379:1: ( ( rule__Then__Alternatives_4 )? )
            {
            // InternalSheepDog.g:2379:1: ( ( rule__Then__Alternatives_4 )? )
            // InternalSheepDog.g:2380:2: ( rule__Then__Alternatives_4 )?
            {
             before(grammarAccess.getThenAccess().getAlternatives_4()); 
            // InternalSheepDog.g:2381:2: ( rule__Then__Alternatives_4 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_RAWTEXT||LA27_0==23) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSheepDog.g:2381:3: rule__Then__Alternatives_4
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
    // InternalSheepDog.g:2390:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2394:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalSheepDog.g:2395:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalSheepDog.g:2402:1: rule__And__Group__0__Impl : ( '===' ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2406:1: ( ( '===' ) )
            // InternalSheepDog.g:2407:1: ( '===' )
            {
            // InternalSheepDog.g:2407:1: ( '===' )
            // InternalSheepDog.g:2408:2: '==='
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
    // InternalSheepDog.g:2417:1: rule__And__Group__1 : rule__And__Group__1__Impl rule__And__Group__2 ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2421:1: ( rule__And__Group__1__Impl rule__And__Group__2 )
            // InternalSheepDog.g:2422:2: rule__And__Group__1__Impl rule__And__Group__2
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
    // InternalSheepDog.g:2429:1: rule__And__Group__1__Impl : ( 'And:' ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2433:1: ( ( 'And:' ) )
            // InternalSheepDog.g:2434:1: ( 'And:' )
            {
            // InternalSheepDog.g:2434:1: ( 'And:' )
            // InternalSheepDog.g:2435:2: 'And:'
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
    // InternalSheepDog.g:2444:1: rule__And__Group__2 : rule__And__Group__2__Impl rule__And__Group__3 ;
    public final void rule__And__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2448:1: ( rule__And__Group__2__Impl rule__And__Group__3 )
            // InternalSheepDog.g:2449:2: rule__And__Group__2__Impl rule__And__Group__3
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
    // InternalSheepDog.g:2456:1: rule__And__Group__2__Impl : ( ( rule__And__NameAssignment_2 ) ) ;
    public final void rule__And__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2460:1: ( ( ( rule__And__NameAssignment_2 ) ) )
            // InternalSheepDog.g:2461:1: ( ( rule__And__NameAssignment_2 ) )
            {
            // InternalSheepDog.g:2461:1: ( ( rule__And__NameAssignment_2 ) )
            // InternalSheepDog.g:2462:2: ( rule__And__NameAssignment_2 )
            {
             before(grammarAccess.getAndAccess().getNameAssignment_2()); 
            // InternalSheepDog.g:2463:2: ( rule__And__NameAssignment_2 )
            // InternalSheepDog.g:2463:3: rule__And__NameAssignment_2
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
    // InternalSheepDog.g:2471:1: rule__And__Group__3 : rule__And__Group__3__Impl rule__And__Group__4 ;
    public final void rule__And__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2475:1: ( rule__And__Group__3__Impl rule__And__Group__4 )
            // InternalSheepDog.g:2476:2: rule__And__Group__3__Impl rule__And__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalSheepDog.g:2483:1: rule__And__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__And__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2487:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2488:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2488:1: ( RULE_EOL )
            // InternalSheepDog.g:2489:2: RULE_EOL
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
    // InternalSheepDog.g:2498:1: rule__And__Group__4 : rule__And__Group__4__Impl ;
    public final void rule__And__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2502:1: ( rule__And__Group__4__Impl )
            // InternalSheepDog.g:2503:2: rule__And__Group__4__Impl
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
    // InternalSheepDog.g:2509:1: rule__And__Group__4__Impl : ( ( rule__And__Alternatives_4 )? ) ;
    public final void rule__And__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2513:1: ( ( ( rule__And__Alternatives_4 )? ) )
            // InternalSheepDog.g:2514:1: ( ( rule__And__Alternatives_4 )? )
            {
            // InternalSheepDog.g:2514:1: ( ( rule__And__Alternatives_4 )? )
            // InternalSheepDog.g:2515:2: ( rule__And__Alternatives_4 )?
            {
             before(grammarAccess.getAndAccess().getAlternatives_4()); 
            // InternalSheepDog.g:2516:2: ( rule__And__Alternatives_4 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_RAWTEXT||LA28_0==23) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSheepDog.g:2516:3: rule__And__Alternatives_4
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
    // InternalSheepDog.g:2525:1: rule__DocString__Group__0 : rule__DocString__Group__0__Impl rule__DocString__Group__1 ;
    public final void rule__DocString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2529:1: ( rule__DocString__Group__0__Impl rule__DocString__Group__1 )
            // InternalSheepDog.g:2530:2: rule__DocString__Group__0__Impl rule__DocString__Group__1
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
    // InternalSheepDog.g:2537:1: rule__DocString__Group__0__Impl : ( ( rule__DocString__NameAssignment_0 ) ) ;
    public final void rule__DocString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2541:1: ( ( ( rule__DocString__NameAssignment_0 ) ) )
            // InternalSheepDog.g:2542:1: ( ( rule__DocString__NameAssignment_0 ) )
            {
            // InternalSheepDog.g:2542:1: ( ( rule__DocString__NameAssignment_0 ) )
            // InternalSheepDog.g:2543:2: ( rule__DocString__NameAssignment_0 )
            {
             before(grammarAccess.getDocStringAccess().getNameAssignment_0()); 
            // InternalSheepDog.g:2544:2: ( rule__DocString__NameAssignment_0 )
            // InternalSheepDog.g:2544:3: rule__DocString__NameAssignment_0
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
    // InternalSheepDog.g:2552:1: rule__DocString__Group__1 : rule__DocString__Group__1__Impl ;
    public final void rule__DocString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2556:1: ( rule__DocString__Group__1__Impl )
            // InternalSheepDog.g:2557:2: rule__DocString__Group__1__Impl
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
    // InternalSheepDog.g:2563:1: rule__DocString__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__DocString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2567:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2568:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2568:1: ( RULE_EOL )
            // InternalSheepDog.g:2569:2: RULE_EOL
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
    // InternalSheepDog.g:2579:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2583:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalSheepDog.g:2584:2: rule__Table__Group__0__Impl rule__Table__Group__1
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
    // InternalSheepDog.g:2591:1: rule__Table__Group__0__Impl : ( '|===' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2595:1: ( ( '|===' ) )
            // InternalSheepDog.g:2596:1: ( '|===' )
            {
            // InternalSheepDog.g:2596:1: ( '|===' )
            // InternalSheepDog.g:2597:2: '|==='
            {
             before(grammarAccess.getTableAccess().getVerticalLineEqualsSignEqualsSignEqualsSignKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getVerticalLineEqualsSignEqualsSignEqualsSignKeyword_0()); 

            }


            }

        }
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
    // InternalSheepDog.g:2606:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2610:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalSheepDog.g:2611:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalSheepDog.g:2618:1: rule__Table__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2622:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2623:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2623:1: ( RULE_EOL )
            // InternalSheepDog.g:2624:2: RULE_EOL
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
    // InternalSheepDog.g:2633:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2637:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalSheepDog.g:2638:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalSheepDog.g:2645:1: rule__Table__Group__2__Impl : ( ( ( rule__Table__RowsAssignment_2 ) ) ( ( rule__Table__RowsAssignment_2 )* ) ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2649:1: ( ( ( ( rule__Table__RowsAssignment_2 ) ) ( ( rule__Table__RowsAssignment_2 )* ) ) )
            // InternalSheepDog.g:2650:1: ( ( ( rule__Table__RowsAssignment_2 ) ) ( ( rule__Table__RowsAssignment_2 )* ) )
            {
            // InternalSheepDog.g:2650:1: ( ( ( rule__Table__RowsAssignment_2 ) ) ( ( rule__Table__RowsAssignment_2 )* ) )
            // InternalSheepDog.g:2651:2: ( ( rule__Table__RowsAssignment_2 ) ) ( ( rule__Table__RowsAssignment_2 )* )
            {
            // InternalSheepDog.g:2651:2: ( ( rule__Table__RowsAssignment_2 ) )
            // InternalSheepDog.g:2652:3: ( rule__Table__RowsAssignment_2 )
            {
             before(grammarAccess.getTableAccess().getRowsAssignment_2()); 
            // InternalSheepDog.g:2653:3: ( rule__Table__RowsAssignment_2 )
            // InternalSheepDog.g:2653:4: rule__Table__RowsAssignment_2
            {
            pushFollow(FOLLOW_31);
            rule__Table__RowsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getRowsAssignment_2()); 

            }

            // InternalSheepDog.g:2656:2: ( ( rule__Table__RowsAssignment_2 )* )
            // InternalSheepDog.g:2657:3: ( rule__Table__RowsAssignment_2 )*
            {
             before(grammarAccess.getTableAccess().getRowsAssignment_2()); 
            // InternalSheepDog.g:2658:3: ( rule__Table__RowsAssignment_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==26) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSheepDog.g:2658:4: rule__Table__RowsAssignment_2
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Table__RowsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getRowsAssignment_2()); 

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
    // $ANTLR end "rule__Table__Group__2__Impl"


    // $ANTLR start "rule__Table__Group__3"
    // InternalSheepDog.g:2667:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2671:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalSheepDog.g:2672:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalSheepDog.g:2679:1: rule__Table__Group__3__Impl : ( '|===' ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2683:1: ( ( '|===' ) )
            // InternalSheepDog.g:2684:1: ( '|===' )
            {
            // InternalSheepDog.g:2684:1: ( '|===' )
            // InternalSheepDog.g:2685:2: '|==='
            {
             before(grammarAccess.getTableAccess().getVerticalLineEqualsSignEqualsSignEqualsSignKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getVerticalLineEqualsSignEqualsSignEqualsSignKeyword_3()); 

            }


            }

        }
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
    // InternalSheepDog.g:2694:1: rule__Table__Group__4 : rule__Table__Group__4__Impl ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2698:1: ( rule__Table__Group__4__Impl )
            // InternalSheepDog.g:2699:2: rule__Table__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalSheepDog.g:2705:1: rule__Table__Group__4__Impl : ( RULE_EOL ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2709:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2710:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2710:1: ( RULE_EOL )
            // InternalSheepDog.g:2711:2: RULE_EOL
            {
             before(grammarAccess.getTableAccess().getEOLTerminalRuleCall_4()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getEOLTerminalRuleCall_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Row__Group__0"
    // InternalSheepDog.g:2721:1: rule__Row__Group__0 : rule__Row__Group__0__Impl rule__Row__Group__1 ;
    public final void rule__Row__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2725:1: ( rule__Row__Group__0__Impl rule__Row__Group__1 )
            // InternalSheepDog.g:2726:2: rule__Row__Group__0__Impl rule__Row__Group__1
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
    // InternalSheepDog.g:2733:1: rule__Row__Group__0__Impl : ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) ) ;
    public final void rule__Row__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2737:1: ( ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) ) )
            // InternalSheepDog.g:2738:1: ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) )
            {
            // InternalSheepDog.g:2738:1: ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) )
            // InternalSheepDog.g:2739:2: ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* )
            {
            // InternalSheepDog.g:2739:2: ( ( rule__Row__CellsAssignment_0 ) )
            // InternalSheepDog.g:2740:3: ( rule__Row__CellsAssignment_0 )
            {
             before(grammarAccess.getRowAccess().getCellsAssignment_0()); 
            // InternalSheepDog.g:2741:3: ( rule__Row__CellsAssignment_0 )
            // InternalSheepDog.g:2741:4: rule__Row__CellsAssignment_0
            {
            pushFollow(FOLLOW_31);
            rule__Row__CellsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getCellsAssignment_0()); 

            }

            // InternalSheepDog.g:2744:2: ( ( rule__Row__CellsAssignment_0 )* )
            // InternalSheepDog.g:2745:3: ( rule__Row__CellsAssignment_0 )*
            {
             before(grammarAccess.getRowAccess().getCellsAssignment_0()); 
            // InternalSheepDog.g:2746:3: ( rule__Row__CellsAssignment_0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==26) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSheepDog.g:2746:4: rule__Row__CellsAssignment_0
            	    {
            	    pushFollow(FOLLOW_31);
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
    // InternalSheepDog.g:2755:1: rule__Row__Group__1 : rule__Row__Group__1__Impl ;
    public final void rule__Row__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2759:1: ( rule__Row__Group__1__Impl )
            // InternalSheepDog.g:2760:2: rule__Row__Group__1__Impl
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
    // InternalSheepDog.g:2766:1: rule__Row__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Row__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2770:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2771:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2771:1: ( RULE_EOL )
            // InternalSheepDog.g:2772:2: RULE_EOL
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


    // $ANTLR start "rule__AbstractScenarioTags__Group__0"
    // InternalSheepDog.g:2782:1: rule__AbstractScenarioTags__Group__0 : rule__AbstractScenarioTags__Group__0__Impl rule__AbstractScenarioTags__Group__1 ;
    public final void rule__AbstractScenarioTags__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2786:1: ( rule__AbstractScenarioTags__Group__0__Impl rule__AbstractScenarioTags__Group__1 )
            // InternalSheepDog.g:2787:2: rule__AbstractScenarioTags__Group__0__Impl rule__AbstractScenarioTags__Group__1
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
    // InternalSheepDog.g:2794:1: rule__AbstractScenarioTags__Group__0__Impl : ( '[tags=' ) ;
    public final void rule__AbstractScenarioTags__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2798:1: ( ( '[tags=' ) )
            // InternalSheepDog.g:2799:1: ( '[tags=' )
            {
            // InternalSheepDog.g:2799:1: ( '[tags=' )
            // InternalSheepDog.g:2800:2: '[tags='
            {
             before(grammarAccess.getAbstractScenarioTagsAccess().getTagsKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSheepDog.g:2809:1: rule__AbstractScenarioTags__Group__1 : rule__AbstractScenarioTags__Group__1__Impl rule__AbstractScenarioTags__Group__2 ;
    public final void rule__AbstractScenarioTags__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2813:1: ( rule__AbstractScenarioTags__Group__1__Impl rule__AbstractScenarioTags__Group__2 )
            // InternalSheepDog.g:2814:2: rule__AbstractScenarioTags__Group__1__Impl rule__AbstractScenarioTags__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalSheepDog.g:2821:1: rule__AbstractScenarioTags__Group__1__Impl : ( ( rule__AbstractScenarioTags__NameAssignment_1 ) ) ;
    public final void rule__AbstractScenarioTags__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2825:1: ( ( ( rule__AbstractScenarioTags__NameAssignment_1 ) ) )
            // InternalSheepDog.g:2826:1: ( ( rule__AbstractScenarioTags__NameAssignment_1 ) )
            {
            // InternalSheepDog.g:2826:1: ( ( rule__AbstractScenarioTags__NameAssignment_1 ) )
            // InternalSheepDog.g:2827:2: ( rule__AbstractScenarioTags__NameAssignment_1 )
            {
             before(grammarAccess.getAbstractScenarioTagsAccess().getNameAssignment_1()); 
            // InternalSheepDog.g:2828:2: ( rule__AbstractScenarioTags__NameAssignment_1 )
            // InternalSheepDog.g:2828:3: rule__AbstractScenarioTags__NameAssignment_1
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
    // InternalSheepDog.g:2836:1: rule__AbstractScenarioTags__Group__2 : rule__AbstractScenarioTags__Group__2__Impl rule__AbstractScenarioTags__Group__3 ;
    public final void rule__AbstractScenarioTags__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2840:1: ( rule__AbstractScenarioTags__Group__2__Impl rule__AbstractScenarioTags__Group__3 )
            // InternalSheepDog.g:2841:2: rule__AbstractScenarioTags__Group__2__Impl rule__AbstractScenarioTags__Group__3
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
    // InternalSheepDog.g:2848:1: rule__AbstractScenarioTags__Group__2__Impl : ( ']' ) ;
    public final void rule__AbstractScenarioTags__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2852:1: ( ( ']' ) )
            // InternalSheepDog.g:2853:1: ( ']' )
            {
            // InternalSheepDog.g:2853:1: ( ']' )
            // InternalSheepDog.g:2854:2: ']'
            {
             before(grammarAccess.getAbstractScenarioTagsAccess().getRightSquareBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSheepDog.g:2863:1: rule__AbstractScenarioTags__Group__3 : rule__AbstractScenarioTags__Group__3__Impl ;
    public final void rule__AbstractScenarioTags__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2867:1: ( rule__AbstractScenarioTags__Group__3__Impl )
            // InternalSheepDog.g:2868:2: rule__AbstractScenarioTags__Group__3__Impl
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
    // InternalSheepDog.g:2874:1: rule__AbstractScenarioTags__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__AbstractScenarioTags__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2878:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2879:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2879:1: ( RULE_EOL )
            // InternalSheepDog.g:2880:2: RULE_EOL
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
    // InternalSheepDog.g:2890:1: rule__Cell__Group__0 : rule__Cell__Group__0__Impl rule__Cell__Group__1 ;
    public final void rule__Cell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2894:1: ( rule__Cell__Group__0__Impl rule__Cell__Group__1 )
            // InternalSheepDog.g:2895:2: rule__Cell__Group__0__Impl rule__Cell__Group__1
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
    // InternalSheepDog.g:2902:1: rule__Cell__Group__0__Impl : ( '|' ) ;
    public final void rule__Cell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2906:1: ( ( '|' ) )
            // InternalSheepDog.g:2907:1: ( '|' )
            {
            // InternalSheepDog.g:2907:1: ( '|' )
            // InternalSheepDog.g:2908:2: '|'
            {
             before(grammarAccess.getCellAccess().getVerticalLineKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSheepDog.g:2917:1: rule__Cell__Group__1 : rule__Cell__Group__1__Impl ;
    public final void rule__Cell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2921:1: ( rule__Cell__Group__1__Impl )
            // InternalSheepDog.g:2922:2: rule__Cell__Group__1__Impl
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
    // InternalSheepDog.g:2928:1: rule__Cell__Group__1__Impl : ( ( rule__Cell__NameAssignment_1 ) ) ;
    public final void rule__Cell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2932:1: ( ( ( rule__Cell__NameAssignment_1 ) ) )
            // InternalSheepDog.g:2933:1: ( ( rule__Cell__NameAssignment_1 ) )
            {
            // InternalSheepDog.g:2933:1: ( ( rule__Cell__NameAssignment_1 ) )
            // InternalSheepDog.g:2934:2: ( rule__Cell__NameAssignment_1 )
            {
             before(grammarAccess.getCellAccess().getNameAssignment_1()); 
            // InternalSheepDog.g:2935:2: ( rule__Cell__NameAssignment_1 )
            // InternalSheepDog.g:2935:3: rule__Cell__NameAssignment_1
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
    // InternalSheepDog.g:2944:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2948:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalSheepDog.g:2949:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
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
    // InternalSheepDog.g:2956:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__NameAssignment_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2960:1: ( ( ( rule__Statement__NameAssignment_0 ) ) )
            // InternalSheepDog.g:2961:1: ( ( rule__Statement__NameAssignment_0 ) )
            {
            // InternalSheepDog.g:2961:1: ( ( rule__Statement__NameAssignment_0 ) )
            // InternalSheepDog.g:2962:2: ( rule__Statement__NameAssignment_0 )
            {
             before(grammarAccess.getStatementAccess().getNameAssignment_0()); 
            // InternalSheepDog.g:2963:2: ( rule__Statement__NameAssignment_0 )
            // InternalSheepDog.g:2963:3: rule__Statement__NameAssignment_0
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
    // InternalSheepDog.g:2971:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2975:1: ( rule__Statement__Group__1__Impl )
            // InternalSheepDog.g:2976:2: rule__Statement__Group__1__Impl
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
    // InternalSheepDog.g:2982:1: rule__Statement__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:2986:1: ( ( RULE_EOL ) )
            // InternalSheepDog.g:2987:1: ( RULE_EOL )
            {
            // InternalSheepDog.g:2987:1: ( RULE_EOL )
            // InternalSheepDog.g:2988:2: RULE_EOL
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
    // InternalSheepDog.g:2998:1: rule__StepObject__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__StepObject__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3002:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3003:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3003:2: ( ruleTitle )
            // InternalSheepDog.g:3004:3: ruleTitle
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
    // InternalSheepDog.g:3013:1: rule__StepObject__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__StepObject__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3017:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3018:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3018:2: ( ruleStatement )
            // InternalSheepDog.g:3019:3: ruleStatement
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
    // InternalSheepDog.g:3028:1: rule__StepObject__StepDefinitionsAssignment_5 : ( ruleStepDefinition ) ;
    public final void rule__StepObject__StepDefinitionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3032:1: ( ( ruleStepDefinition ) )
            // InternalSheepDog.g:3033:2: ( ruleStepDefinition )
            {
            // InternalSheepDog.g:3033:2: ( ruleStepDefinition )
            // InternalSheepDog.g:3034:3: ruleStepDefinition
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
    // InternalSheepDog.g:3043:1: rule__StepDefinition__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__StepDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3047:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3048:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3048:2: ( ruleTitle )
            // InternalSheepDog.g:3049:3: ruleTitle
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
    // InternalSheepDog.g:3058:1: rule__StepDefinition__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__StepDefinition__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3062:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3063:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3063:2: ( ruleStatement )
            // InternalSheepDog.g:3064:3: ruleStatement
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
    // InternalSheepDog.g:3073:1: rule__StepDefinition__StepParametersAssignment_5 : ( ruleStepParameters ) ;
    public final void rule__StepDefinition__StepParametersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3077:1: ( ( ruleStepParameters ) )
            // InternalSheepDog.g:3078:2: ( ruleStepParameters )
            {
            // InternalSheepDog.g:3078:2: ( ruleStepParameters )
            // InternalSheepDog.g:3079:3: ruleStepParameters
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
    // InternalSheepDog.g:3088:1: rule__StepParameters__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__StepParameters__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3092:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3093:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3093:2: ( ruleTitle )
            // InternalSheepDog.g:3094:3: ruleTitle
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
    // InternalSheepDog.g:3103:1: rule__StepParameters__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__StepParameters__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3107:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3108:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3108:2: ( ruleStatement )
            // InternalSheepDog.g:3109:3: ruleStatement
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
    // InternalSheepDog.g:3118:1: rule__StepParameters__ParametersTableAssignment_5 : ( ruleTable ) ;
    public final void rule__StepParameters__ParametersTableAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3122:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3123:2: ( ruleTable )
            {
            // InternalSheepDog.g:3123:2: ( ruleTable )
            // InternalSheepDog.g:3124:3: ruleTable
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


    // $ANTLR start "rule__Feature__NameAssignment_2"
    // InternalSheepDog.g:3133:1: rule__Feature__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__Feature__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3137:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3138:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3138:2: ( ruleTitle )
            // InternalSheepDog.g:3139:3: ruleTitle
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


    // $ANTLR start "rule__Feature__StatementsAssignment_4"
    // InternalSheepDog.g:3148:1: rule__Feature__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__Feature__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3152:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3153:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3153:2: ( ruleStatement )
            // InternalSheepDog.g:3154:3: ruleStatement
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


    // $ANTLR start "rule__Feature__AbstractScenariosAssignment_5"
    // InternalSheepDog.g:3163:1: rule__Feature__AbstractScenariosAssignment_5 : ( ruleAbstractScenario ) ;
    public final void rule__Feature__AbstractScenariosAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3167:1: ( ( ruleAbstractScenario ) )
            // InternalSheepDog.g:3168:2: ( ruleAbstractScenario )
            {
            // InternalSheepDog.g:3168:2: ( ruleAbstractScenario )
            // InternalSheepDog.g:3169:3: ruleAbstractScenario
            {
             before(grammarAccess.getFeatureAccess().getAbstractScenariosAbstractScenarioParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractScenario();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getAbstractScenariosAbstractScenarioParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__AbstractScenariosAssignment_5"


    // $ANTLR start "rule__Background__TagsAssignment_0"
    // InternalSheepDog.g:3178:1: rule__Background__TagsAssignment_0 : ( ruleAbstractScenarioTags ) ;
    public final void rule__Background__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3182:1: ( ( ruleAbstractScenarioTags ) )
            // InternalSheepDog.g:3183:2: ( ruleAbstractScenarioTags )
            {
            // InternalSheepDog.g:3183:2: ( ruleAbstractScenarioTags )
            // InternalSheepDog.g:3184:3: ruleAbstractScenarioTags
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
    // InternalSheepDog.g:3193:1: rule__Background__NameAssignment_3 : ( ruleTitle ) ;
    public final void rule__Background__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3197:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3198:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3198:2: ( ruleTitle )
            // InternalSheepDog.g:3199:3: ruleTitle
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
    // InternalSheepDog.g:3208:1: rule__Background__StatementsAssignment_5 : ( ruleStatement ) ;
    public final void rule__Background__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3212:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3213:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3213:2: ( ruleStatement )
            // InternalSheepDog.g:3214:3: ruleStatement
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
    // InternalSheepDog.g:3223:1: rule__Background__StepsAssignment_6 : ( ruleStep ) ;
    public final void rule__Background__StepsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3227:1: ( ( ruleStep ) )
            // InternalSheepDog.g:3228:2: ( ruleStep )
            {
            // InternalSheepDog.g:3228:2: ( ruleStep )
            // InternalSheepDog.g:3229:3: ruleStep
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
    // InternalSheepDog.g:3238:1: rule__Scenario__TagsAssignment_0 : ( ruleAbstractScenarioTags ) ;
    public final void rule__Scenario__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3242:1: ( ( ruleAbstractScenarioTags ) )
            // InternalSheepDog.g:3243:2: ( ruleAbstractScenarioTags )
            {
            // InternalSheepDog.g:3243:2: ( ruleAbstractScenarioTags )
            // InternalSheepDog.g:3244:3: ruleAbstractScenarioTags
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
    // InternalSheepDog.g:3253:1: rule__Scenario__NameAssignment_3 : ( ruleTitle ) ;
    public final void rule__Scenario__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3257:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3258:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3258:2: ( ruleTitle )
            // InternalSheepDog.g:3259:3: ruleTitle
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
    // InternalSheepDog.g:3268:1: rule__Scenario__StatementsAssignment_5 : ( ruleStatement ) ;
    public final void rule__Scenario__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3272:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3273:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3273:2: ( ruleStatement )
            // InternalSheepDog.g:3274:3: ruleStatement
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
    // InternalSheepDog.g:3283:1: rule__Scenario__StepsAssignment_6 : ( ruleStep ) ;
    public final void rule__Scenario__StepsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3287:1: ( ( ruleStep ) )
            // InternalSheepDog.g:3288:2: ( ruleStep )
            {
            // InternalSheepDog.g:3288:2: ( ruleStep )
            // InternalSheepDog.g:3289:3: ruleStep
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
    // InternalSheepDog.g:3298:1: rule__Scenario__ExamplesAssignment_7 : ( ruleExamples ) ;
    public final void rule__Scenario__ExamplesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3302:1: ( ( ruleExamples ) )
            // InternalSheepDog.g:3303:2: ( ruleExamples )
            {
            // InternalSheepDog.g:3303:2: ( ruleExamples )
            // InternalSheepDog.g:3304:3: ruleExamples
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
    // InternalSheepDog.g:3313:1: rule__Examples__TagsAssignment_0 : ( ruleAbstractScenarioTags ) ;
    public final void rule__Examples__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3317:1: ( ( ruleAbstractScenarioTags ) )
            // InternalSheepDog.g:3318:2: ( ruleAbstractScenarioTags )
            {
            // InternalSheepDog.g:3318:2: ( ruleAbstractScenarioTags )
            // InternalSheepDog.g:3319:3: ruleAbstractScenarioTags
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
    // InternalSheepDog.g:3328:1: rule__Examples__NameAssignment_3 : ( ruleTitle ) ;
    public final void rule__Examples__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3332:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3333:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3333:2: ( ruleTitle )
            // InternalSheepDog.g:3334:3: ruleTitle
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
    // InternalSheepDog.g:3343:1: rule__Examples__StatementsAssignment_5 : ( ruleStatement ) ;
    public final void rule__Examples__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3347:1: ( ( ruleStatement ) )
            // InternalSheepDog.g:3348:2: ( ruleStatement )
            {
            // InternalSheepDog.g:3348:2: ( ruleStatement )
            // InternalSheepDog.g:3349:3: ruleStatement
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
    // InternalSheepDog.g:3358:1: rule__Examples__TheExamplesTableAssignment_6 : ( ruleTable ) ;
    public final void rule__Examples__TheExamplesTableAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3362:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3363:2: ( ruleTable )
            {
            // InternalSheepDog.g:3363:2: ( ruleTable )
            // InternalSheepDog.g:3364:3: ruleTable
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
    // InternalSheepDog.g:3373:1: rule__Given__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__Given__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3377:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3378:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3378:2: ( ruleTitle )
            // InternalSheepDog.g:3379:3: ruleTitle
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
    // InternalSheepDog.g:3388:1: rule__Given__TheStepTableAssignment_4_0 : ( ruleTable ) ;
    public final void rule__Given__TheStepTableAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3392:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3393:2: ( ruleTable )
            {
            // InternalSheepDog.g:3393:2: ( ruleTable )
            // InternalSheepDog.g:3394:3: ruleTable
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
    // InternalSheepDog.g:3403:1: rule__Given__TheDocStringAssignment_4_1 : ( ruleDocString ) ;
    public final void rule__Given__TheDocStringAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3407:1: ( ( ruleDocString ) )
            // InternalSheepDog.g:3408:2: ( ruleDocString )
            {
            // InternalSheepDog.g:3408:2: ( ruleDocString )
            // InternalSheepDog.g:3409:3: ruleDocString
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
    // InternalSheepDog.g:3418:1: rule__When__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__When__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3422:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3423:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3423:2: ( ruleTitle )
            // InternalSheepDog.g:3424:3: ruleTitle
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
    // InternalSheepDog.g:3433:1: rule__When__TheStepTableAssignment_4_0 : ( ruleTable ) ;
    public final void rule__When__TheStepTableAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3437:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3438:2: ( ruleTable )
            {
            // InternalSheepDog.g:3438:2: ( ruleTable )
            // InternalSheepDog.g:3439:3: ruleTable
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
    // InternalSheepDog.g:3448:1: rule__When__TheDocStringAssignment_4_1 : ( ruleDocString ) ;
    public final void rule__When__TheDocStringAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3452:1: ( ( ruleDocString ) )
            // InternalSheepDog.g:3453:2: ( ruleDocString )
            {
            // InternalSheepDog.g:3453:2: ( ruleDocString )
            // InternalSheepDog.g:3454:3: ruleDocString
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
    // InternalSheepDog.g:3463:1: rule__Then__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__Then__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3467:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3468:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3468:2: ( ruleTitle )
            // InternalSheepDog.g:3469:3: ruleTitle
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
    // InternalSheepDog.g:3478:1: rule__Then__TheStepTableAssignment_4_0 : ( ruleTable ) ;
    public final void rule__Then__TheStepTableAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3482:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3483:2: ( ruleTable )
            {
            // InternalSheepDog.g:3483:2: ( ruleTable )
            // InternalSheepDog.g:3484:3: ruleTable
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
    // InternalSheepDog.g:3493:1: rule__Then__TheDocStringAssignment_4_1 : ( ruleDocString ) ;
    public final void rule__Then__TheDocStringAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3497:1: ( ( ruleDocString ) )
            // InternalSheepDog.g:3498:2: ( ruleDocString )
            {
            // InternalSheepDog.g:3498:2: ( ruleDocString )
            // InternalSheepDog.g:3499:3: ruleDocString
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
    // InternalSheepDog.g:3508:1: rule__And__NameAssignment_2 : ( ruleTitle ) ;
    public final void rule__And__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3512:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3513:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3513:2: ( ruleTitle )
            // InternalSheepDog.g:3514:3: ruleTitle
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
    // InternalSheepDog.g:3523:1: rule__And__TheStepTableAssignment_4_0 : ( ruleTable ) ;
    public final void rule__And__TheStepTableAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3527:1: ( ( ruleTable ) )
            // InternalSheepDog.g:3528:2: ( ruleTable )
            {
            // InternalSheepDog.g:3528:2: ( ruleTable )
            // InternalSheepDog.g:3529:3: ruleTable
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
    // InternalSheepDog.g:3538:1: rule__And__TheDocStringAssignment_4_1 : ( ruleDocString ) ;
    public final void rule__And__TheDocStringAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3542:1: ( ( ruleDocString ) )
            // InternalSheepDog.g:3543:2: ( ruleDocString )
            {
            // InternalSheepDog.g:3543:2: ( ruleDocString )
            // InternalSheepDog.g:3544:3: ruleDocString
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
    // InternalSheepDog.g:3553:1: rule__DocString__NameAssignment_0 : ( RULE_RAWTEXT ) ;
    public final void rule__DocString__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3557:1: ( ( RULE_RAWTEXT ) )
            // InternalSheepDog.g:3558:2: ( RULE_RAWTEXT )
            {
            // InternalSheepDog.g:3558:2: ( RULE_RAWTEXT )
            // InternalSheepDog.g:3559:3: RULE_RAWTEXT
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


    // $ANTLR start "rule__Table__RowsAssignment_2"
    // InternalSheepDog.g:3568:1: rule__Table__RowsAssignment_2 : ( ruleRow ) ;
    public final void rule__Table__RowsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3572:1: ( ( ruleRow ) )
            // InternalSheepDog.g:3573:2: ( ruleRow )
            {
            // InternalSheepDog.g:3573:2: ( ruleRow )
            // InternalSheepDog.g:3574:3: ruleRow
            {
             before(grammarAccess.getTableAccess().getRowsRowParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getTableAccess().getRowsRowParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__RowsAssignment_2"


    // $ANTLR start "rule__Row__CellsAssignment_0"
    // InternalSheepDog.g:3583:1: rule__Row__CellsAssignment_0 : ( ruleCell ) ;
    public final void rule__Row__CellsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3587:1: ( ( ruleCell ) )
            // InternalSheepDog.g:3588:2: ( ruleCell )
            {
            // InternalSheepDog.g:3588:2: ( ruleCell )
            // InternalSheepDog.g:3589:3: ruleCell
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


    // $ANTLR start "rule__AbstractScenarioTags__NameAssignment_1"
    // InternalSheepDog.g:3598:1: rule__AbstractScenarioTags__NameAssignment_1 : ( RULE_WORD ) ;
    public final void rule__AbstractScenarioTags__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3602:1: ( ( RULE_WORD ) )
            // InternalSheepDog.g:3603:2: ( RULE_WORD )
            {
            // InternalSheepDog.g:3603:2: ( RULE_WORD )
            // InternalSheepDog.g:3604:3: RULE_WORD
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
    // InternalSheepDog.g:3613:1: rule__Cell__NameAssignment_1 : ( ruleTitle ) ;
    public final void rule__Cell__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3617:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3618:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3618:2: ( ruleTitle )
            // InternalSheepDog.g:3619:3: ruleTitle
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
    // InternalSheepDog.g:3628:1: rule__Statement__NameAssignment_0 : ( ruleTitle ) ;
    public final void rule__Statement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSheepDog.g:3632:1: ( ( ruleTitle ) )
            // InternalSheepDog.g:3633:2: ( ruleTitle )
            {
            // InternalSheepDog.g:3633:2: ( ruleTitle )
            // InternalSheepDog.g:3634:3: ruleTitle
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
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000810L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000802L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001002010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001002002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000800050L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000002000000L});

}
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_EOL", "RULE_WS", "RULE_SL_COMMENT", "'Feature:'", "'Background:'", "'Scenario:'", "'Scenario Outline:'", "'Examples:'", "'|'", "'Given'", "'When'", "'Then'", "'And'", "'But'", "'*'", "'@'"
    };
    public static final int RULE_SL_COMMENT=7;
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
    public static final int T__8=8;
    public static final int RULE_ID=4;
    public static final int RULE_EOL=5;
    public static final int RULE_WS=6;
    public static final int T__20=20;

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


    // $ANTLR start "entryRuleAbstractScenario"
    // InternalMyDsl.g:78:1: entryRuleAbstractScenario : ruleAbstractScenario EOF ;
    public final void entryRuleAbstractScenario() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleAbstractScenario EOF )
            // InternalMyDsl.g:80:1: ruleAbstractScenario EOF
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
    // InternalMyDsl.g:87:1: ruleAbstractScenario : ( ( rule__AbstractScenario__Alternatives ) ) ;
    public final void ruleAbstractScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__AbstractScenario__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__AbstractScenario__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__AbstractScenario__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__AbstractScenario__Alternatives )
            {
             before(grammarAccess.getAbstractScenarioAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__AbstractScenario__Alternatives )
            // InternalMyDsl.g:94:4: rule__AbstractScenario__Alternatives
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
    // InternalMyDsl.g:103:1: entryRuleBackground : ruleBackground EOF ;
    public final void entryRuleBackground() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleBackground EOF )
            // InternalMyDsl.g:105:1: ruleBackground EOF
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
    // InternalMyDsl.g:112:1: ruleBackground : ( ( rule__Background__Group__0 ) ) ;
    public final void ruleBackground() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Background__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Background__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Background__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Background__Group__0 )
            {
             before(grammarAccess.getBackgroundAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Background__Group__0 )
            // InternalMyDsl.g:119:4: rule__Background__Group__0
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
    // InternalMyDsl.g:128:1: entryRuleScenario : ruleScenario EOF ;
    public final void entryRuleScenario() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleScenario EOF )
            // InternalMyDsl.g:130:1: ruleScenario EOF
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
    // InternalMyDsl.g:137:1: ruleScenario : ( ( rule__Scenario__Group__0 ) ) ;
    public final void ruleScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Scenario__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Scenario__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Scenario__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Scenario__Group__0 )
            {
             before(grammarAccess.getScenarioAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Scenario__Group__0 )
            // InternalMyDsl.g:144:4: rule__Scenario__Group__0
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


    // $ANTLR start "entryRuleScenarioOutline"
    // InternalMyDsl.g:153:1: entryRuleScenarioOutline : ruleScenarioOutline EOF ;
    public final void entryRuleScenarioOutline() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleScenarioOutline EOF )
            // InternalMyDsl.g:155:1: ruleScenarioOutline EOF
            {
             before(grammarAccess.getScenarioOutlineRule()); 
            pushFollow(FOLLOW_1);
            ruleScenarioOutline();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineRule()); 
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
    // $ANTLR end "entryRuleScenarioOutline"


    // $ANTLR start "ruleScenarioOutline"
    // InternalMyDsl.g:162:1: ruleScenarioOutline : ( ( rule__ScenarioOutline__Group__0 ) ) ;
    public final void ruleScenarioOutline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__ScenarioOutline__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__ScenarioOutline__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__ScenarioOutline__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__ScenarioOutline__Group__0 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__ScenarioOutline__Group__0 )
            // InternalMyDsl.g:169:4: rule__ScenarioOutline__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScenarioOutline"


    // $ANTLR start "entryRuleExample"
    // InternalMyDsl.g:178:1: entryRuleExample : ruleExample EOF ;
    public final void entryRuleExample() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleExample EOF )
            // InternalMyDsl.g:180:1: ruleExample EOF
            {
             before(grammarAccess.getExampleRule()); 
            pushFollow(FOLLOW_1);
            ruleExample();

            state._fsp--;

             after(grammarAccess.getExampleRule()); 
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
    // $ANTLR end "entryRuleExample"


    // $ANTLR start "ruleExample"
    // InternalMyDsl.g:187:1: ruleExample : ( ( rule__Example__Group__0 ) ) ;
    public final void ruleExample() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Example__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Example__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Example__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Example__Group__0 )
            {
             before(grammarAccess.getExampleAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Example__Group__0 )
            // InternalMyDsl.g:194:4: rule__Example__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Example__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExample"


    // $ANTLR start "entryRuleRow"
    // InternalMyDsl.g:203:1: entryRuleRow : ruleRow EOF ;
    public final void entryRuleRow() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleRow EOF )
            // InternalMyDsl.g:205:1: ruleRow EOF
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
    // InternalMyDsl.g:212:1: ruleRow : ( ( rule__Row__Group__0 ) ) ;
    public final void ruleRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Row__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Row__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Row__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Row__Group__0 )
            {
             before(grammarAccess.getRowAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Row__Group__0 )
            // InternalMyDsl.g:219:4: rule__Row__Group__0
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
    // InternalMyDsl.g:228:1: entryRuleCell : ruleCell EOF ;
    public final void entryRuleCell() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleCell EOF )
            // InternalMyDsl.g:230:1: ruleCell EOF
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
    // InternalMyDsl.g:237:1: ruleCell : ( ( rule__Cell__Group__0 ) ) ;
    public final void ruleCell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Cell__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Cell__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Cell__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Cell__Group__0 )
            {
             before(grammarAccess.getCellAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Cell__Group__0 )
            // InternalMyDsl.g:244:4: rule__Cell__Group__0
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


    // $ANTLR start "entryRuleStep"
    // InternalMyDsl.g:253:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleStep EOF )
            // InternalMyDsl.g:255:1: ruleStep EOF
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
    // InternalMyDsl.g:262:1: ruleStep : ( ( rule__Step__Alternatives ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Step__Alternatives ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Step__Alternatives ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Step__Alternatives ) )
            // InternalMyDsl.g:268:3: ( rule__Step__Alternatives )
            {
             before(grammarAccess.getStepAccess().getAlternatives()); 
            // InternalMyDsl.g:269:3: ( rule__Step__Alternatives )
            // InternalMyDsl.g:269:4: rule__Step__Alternatives
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
    // InternalMyDsl.g:278:1: entryRuleGiven : ruleGiven EOF ;
    public final void entryRuleGiven() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleGiven EOF )
            // InternalMyDsl.g:280:1: ruleGiven EOF
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
    // InternalMyDsl.g:287:1: ruleGiven : ( ( rule__Given__Group__0 ) ) ;
    public final void ruleGiven() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Given__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Given__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Given__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Given__Group__0 )
            {
             before(grammarAccess.getGivenAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Given__Group__0 )
            // InternalMyDsl.g:294:4: rule__Given__Group__0
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
    // InternalMyDsl.g:303:1: entryRuleWhen : ruleWhen EOF ;
    public final void entryRuleWhen() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleWhen EOF )
            // InternalMyDsl.g:305:1: ruleWhen EOF
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
    // InternalMyDsl.g:312:1: ruleWhen : ( ( rule__When__Group__0 ) ) ;
    public final void ruleWhen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__When__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__When__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__When__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__When__Group__0 )
            {
             before(grammarAccess.getWhenAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__When__Group__0 )
            // InternalMyDsl.g:319:4: rule__When__Group__0
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
    // InternalMyDsl.g:328:1: entryRuleThen : ruleThen EOF ;
    public final void entryRuleThen() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleThen EOF )
            // InternalMyDsl.g:330:1: ruleThen EOF
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
    // InternalMyDsl.g:337:1: ruleThen : ( ( rule__Then__Group__0 ) ) ;
    public final void ruleThen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Then__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Then__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Then__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Then__Group__0 )
            {
             before(grammarAccess.getThenAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Then__Group__0 )
            // InternalMyDsl.g:344:4: rule__Then__Group__0
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
    // InternalMyDsl.g:353:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleAnd EOF )
            // InternalMyDsl.g:355:1: ruleAnd EOF
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
    // InternalMyDsl.g:362:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__And__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__And__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__And__Group__0 )
            // InternalMyDsl.g:369:4: rule__And__Group__0
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


    // $ANTLR start "entryRuleBut"
    // InternalMyDsl.g:378:1: entryRuleBut : ruleBut EOF ;
    public final void entryRuleBut() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleBut EOF )
            // InternalMyDsl.g:380:1: ruleBut EOF
            {
             before(grammarAccess.getButRule()); 
            pushFollow(FOLLOW_1);
            ruleBut();

            state._fsp--;

             after(grammarAccess.getButRule()); 
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
    // $ANTLR end "entryRuleBut"


    // $ANTLR start "ruleBut"
    // InternalMyDsl.g:387:1: ruleBut : ( ( rule__But__Group__0 ) ) ;
    public final void ruleBut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__But__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__But__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__But__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__But__Group__0 )
            {
             before(grammarAccess.getButAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__But__Group__0 )
            // InternalMyDsl.g:394:4: rule__But__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__But__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBut"


    // $ANTLR start "entryRuleAsterisk"
    // InternalMyDsl.g:403:1: entryRuleAsterisk : ruleAsterisk EOF ;
    public final void entryRuleAsterisk() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleAsterisk EOF )
            // InternalMyDsl.g:405:1: ruleAsterisk EOF
            {
             before(grammarAccess.getAsteriskRule()); 
            pushFollow(FOLLOW_1);
            ruleAsterisk();

            state._fsp--;

             after(grammarAccess.getAsteriskRule()); 
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
    // $ANTLR end "entryRuleAsterisk"


    // $ANTLR start "ruleAsterisk"
    // InternalMyDsl.g:412:1: ruleAsterisk : ( ( rule__Asterisk__Group__0 ) ) ;
    public final void ruleAsterisk() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__Asterisk__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__Asterisk__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__Asterisk__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__Asterisk__Group__0 )
            {
             before(grammarAccess.getAsteriskAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__Asterisk__Group__0 )
            // InternalMyDsl.g:419:4: rule__Asterisk__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Asterisk__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAsteriskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAsterisk"


    // $ANTLR start "entryRuleStatement"
    // InternalMyDsl.g:428:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleStatement EOF )
            // InternalMyDsl.g:430:1: ruleStatement EOF
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
    // InternalMyDsl.g:437:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__Statement__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__Statement__Group__0 )
            // InternalMyDsl.g:444:4: rule__Statement__Group__0
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
    // InternalMyDsl.g:453:1: entryRulePhrase : rulePhrase EOF ;
    public final void entryRulePhrase() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( rulePhrase EOF )
            // InternalMyDsl.g:455:1: rulePhrase EOF
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
    // InternalMyDsl.g:462:1: rulePhrase : ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) ) ;
    public final void rulePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) ) )
            // InternalMyDsl.g:467:2: ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) )
            {
            // InternalMyDsl.g:467:2: ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) )
            // InternalMyDsl.g:468:3: ( ( RULE_ID ) ) ( ( RULE_ID )* )
            {
            // InternalMyDsl.g:468:3: ( ( RULE_ID ) )
            // InternalMyDsl.g:469:4: ( RULE_ID )
            {
             before(grammarAccess.getPhraseAccess().getIDTerminalRuleCall()); 
            // InternalMyDsl.g:470:4: ( RULE_ID )
            // InternalMyDsl.g:470:5: RULE_ID
            {
            match(input,RULE_ID,FOLLOW_3); 

            }

             after(grammarAccess.getPhraseAccess().getIDTerminalRuleCall()); 

            }

            // InternalMyDsl.g:473:3: ( ( RULE_ID )* )
            // InternalMyDsl.g:474:4: ( RULE_ID )*
            {
             before(grammarAccess.getPhraseAccess().getIDTerminalRuleCall()); 
            // InternalMyDsl.g:475:4: ( RULE_ID )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:475:5: RULE_ID
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


    // $ANTLR start "entryRuleTag"
    // InternalMyDsl.g:485:1: entryRuleTag : ruleTag EOF ;
    public final void entryRuleTag() throws RecognitionException {
        try {
            // InternalMyDsl.g:486:1: ( ruleTag EOF )
            // InternalMyDsl.g:487:1: ruleTag EOF
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
    // InternalMyDsl.g:494:1: ruleTag : ( ( rule__Tag__Group__0 ) ) ;
    public final void ruleTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:498:2: ( ( ( rule__Tag__Group__0 ) ) )
            // InternalMyDsl.g:499:2: ( ( rule__Tag__Group__0 ) )
            {
            // InternalMyDsl.g:499:2: ( ( rule__Tag__Group__0 ) )
            // InternalMyDsl.g:500:3: ( rule__Tag__Group__0 )
            {
             before(grammarAccess.getTagAccess().getGroup()); 
            // InternalMyDsl.g:501:3: ( rule__Tag__Group__0 )
            // InternalMyDsl.g:501:4: rule__Tag__Group__0
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


    // $ANTLR start "rule__AbstractScenario__Alternatives"
    // InternalMyDsl.g:509:1: rule__AbstractScenario__Alternatives : ( ( ruleBackground ) | ( ruleScenario ) | ( ruleScenarioOutline ) );
    public final void rule__AbstractScenario__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:513:1: ( ( ruleBackground ) | ( ruleScenario ) | ( ruleScenarioOutline ) )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:514:2: ( ruleBackground )
                    {
                    // InternalMyDsl.g:514:2: ( ruleBackground )
                    // InternalMyDsl.g:515:3: ruleBackground
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
                    // InternalMyDsl.g:520:2: ( ruleScenario )
                    {
                    // InternalMyDsl.g:520:2: ( ruleScenario )
                    // InternalMyDsl.g:521:3: ruleScenario
                    {
                     before(grammarAccess.getAbstractScenarioAccess().getScenarioParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleScenario();

                    state._fsp--;

                     after(grammarAccess.getAbstractScenarioAccess().getScenarioParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:526:2: ( ruleScenarioOutline )
                    {
                    // InternalMyDsl.g:526:2: ( ruleScenarioOutline )
                    // InternalMyDsl.g:527:3: ruleScenarioOutline
                    {
                     before(grammarAccess.getAbstractScenarioAccess().getScenarioOutlineParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleScenarioOutline();

                    state._fsp--;

                     after(grammarAccess.getAbstractScenarioAccess().getScenarioOutlineParserRuleCall_2()); 

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
    // InternalMyDsl.g:536:1: rule__Step__Alternatives : ( ( ruleGiven ) | ( ruleWhen ) | ( ruleThen ) | ( ruleAnd ) | ( ruleBut ) | ( ruleAsterisk ) );
    public final void rule__Step__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:540:1: ( ( ruleGiven ) | ( ruleWhen ) | ( ruleThen ) | ( ruleAnd ) | ( ruleBut ) | ( ruleAsterisk ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            case 18:
                {
                alt3=5;
                }
                break;
            case 19:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:541:2: ( ruleGiven )
                    {
                    // InternalMyDsl.g:541:2: ( ruleGiven )
                    // InternalMyDsl.g:542:3: ruleGiven
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
                    // InternalMyDsl.g:547:2: ( ruleWhen )
                    {
                    // InternalMyDsl.g:547:2: ( ruleWhen )
                    // InternalMyDsl.g:548:3: ruleWhen
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
                    // InternalMyDsl.g:553:2: ( ruleThen )
                    {
                    // InternalMyDsl.g:553:2: ( ruleThen )
                    // InternalMyDsl.g:554:3: ruleThen
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
                    // InternalMyDsl.g:559:2: ( ruleAnd )
                    {
                    // InternalMyDsl.g:559:2: ( ruleAnd )
                    // InternalMyDsl.g:560:3: ruleAnd
                    {
                     before(grammarAccess.getStepAccess().getAndParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleAnd();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getAndParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:565:2: ( ruleBut )
                    {
                    // InternalMyDsl.g:565:2: ( ruleBut )
                    // InternalMyDsl.g:566:3: ruleBut
                    {
                     before(grammarAccess.getStepAccess().getButParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleBut();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getButParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:571:2: ( ruleAsterisk )
                    {
                    // InternalMyDsl.g:571:2: ( ruleAsterisk )
                    // InternalMyDsl.g:572:3: ruleAsterisk
                    {
                     before(grammarAccess.getStepAccess().getAsteriskParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleAsterisk();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getAsteriskParserRuleCall_5()); 

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


    // $ANTLR start "rule__Model__Group__0"
    // InternalMyDsl.g:581:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:585:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMyDsl.g:586:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalMyDsl.g:593:1: rule__Model__Group__0__Impl : ( ( rule__Model__Group_0__0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:597:1: ( ( ( rule__Model__Group_0__0 )? ) )
            // InternalMyDsl.g:598:1: ( ( rule__Model__Group_0__0 )? )
            {
            // InternalMyDsl.g:598:1: ( ( rule__Model__Group_0__0 )? )
            // InternalMyDsl.g:599:2: ( rule__Model__Group_0__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_0()); 
            // InternalMyDsl.g:600:2: ( rule__Model__Group_0__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:600:3: rule__Model__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:608:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:612:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalMyDsl.g:613:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalMyDsl.g:620:1: rule__Model__Group__1__Impl : ( 'Feature:' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:624:1: ( ( 'Feature:' ) )
            // InternalMyDsl.g:625:1: ( 'Feature:' )
            {
            // InternalMyDsl.g:625:1: ( 'Feature:' )
            // InternalMyDsl.g:626:2: 'Feature:'
            {
             before(grammarAccess.getModelAccess().getFeatureKeyword_1()); 
            match(input,8,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFeatureKeyword_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:635:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:639:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalMyDsl.g:640:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:647:1: rule__Model__Group__2__Impl : ( ( rule__Model__NameAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:651:1: ( ( ( rule__Model__NameAssignment_2 ) ) )
            // InternalMyDsl.g:652:1: ( ( rule__Model__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:652:1: ( ( rule__Model__NameAssignment_2 ) )
            // InternalMyDsl.g:653:2: ( rule__Model__NameAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:654:2: ( rule__Model__NameAssignment_2 )
            // InternalMyDsl.g:654:3: rule__Model__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:662:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalMyDsl.g:667:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:674:1: rule__Model__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:678:1: ( ( RULE_EOL ) )
            // InternalMyDsl.g:679:1: ( RULE_EOL )
            {
            // InternalMyDsl.g:679:1: ( RULE_EOL )
            // InternalMyDsl.g:680:2: RULE_EOL
            {
             before(grammarAccess.getModelAccess().getEOLTerminalRuleCall_3()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getEOLTerminalRuleCall_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Model__Group__4"
    // InternalMyDsl.g:689:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:693:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalMyDsl.g:694:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalMyDsl.g:701:1: rule__Model__Group__4__Impl : ( ( rule__Model__StatementsAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:705:1: ( ( ( rule__Model__StatementsAssignment_4 )* ) )
            // InternalMyDsl.g:706:1: ( ( rule__Model__StatementsAssignment_4 )* )
            {
            // InternalMyDsl.g:706:1: ( ( rule__Model__StatementsAssignment_4 )* )
            // InternalMyDsl.g:707:2: ( rule__Model__StatementsAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getStatementsAssignment_4()); 
            // InternalMyDsl.g:708:2: ( rule__Model__StatementsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:708:3: rule__Model__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getStatementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalMyDsl.g:716:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:720:1: ( rule__Model__Group__5__Impl )
            // InternalMyDsl.g:721:2: rule__Model__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalMyDsl.g:727:1: rule__Model__Group__5__Impl : ( ( rule__Model__AbstractScenariosAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:731:1: ( ( ( rule__Model__AbstractScenariosAssignment_5 )* ) )
            // InternalMyDsl.g:732:1: ( ( rule__Model__AbstractScenariosAssignment_5 )* )
            {
            // InternalMyDsl.g:732:1: ( ( rule__Model__AbstractScenariosAssignment_5 )* )
            // InternalMyDsl.g:733:2: ( rule__Model__AbstractScenariosAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getAbstractScenariosAssignment_5()); 
            // InternalMyDsl.g:734:2: ( rule__Model__AbstractScenariosAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=9 && LA6_0<=11)||LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:734:3: rule__Model__AbstractScenariosAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Model__AbstractScenariosAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAbstractScenariosAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group_0__0"
    // InternalMyDsl.g:743:1: rule__Model__Group_0__0 : rule__Model__Group_0__0__Impl rule__Model__Group_0__1 ;
    public final void rule__Model__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:747:1: ( rule__Model__Group_0__0__Impl rule__Model__Group_0__1 )
            // InternalMyDsl.g:748:2: rule__Model__Group_0__0__Impl rule__Model__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__0"


    // $ANTLR start "rule__Model__Group_0__0__Impl"
    // InternalMyDsl.g:755:1: rule__Model__Group_0__0__Impl : ( ( ( rule__Model__TagsAssignment_0_0 ) ) ( ( rule__Model__TagsAssignment_0_0 )* ) ) ;
    public final void rule__Model__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:759:1: ( ( ( ( rule__Model__TagsAssignment_0_0 ) ) ( ( rule__Model__TagsAssignment_0_0 )* ) ) )
            // InternalMyDsl.g:760:1: ( ( ( rule__Model__TagsAssignment_0_0 ) ) ( ( rule__Model__TagsAssignment_0_0 )* ) )
            {
            // InternalMyDsl.g:760:1: ( ( ( rule__Model__TagsAssignment_0_0 ) ) ( ( rule__Model__TagsAssignment_0_0 )* ) )
            // InternalMyDsl.g:761:2: ( ( rule__Model__TagsAssignment_0_0 ) ) ( ( rule__Model__TagsAssignment_0_0 )* )
            {
            // InternalMyDsl.g:761:2: ( ( rule__Model__TagsAssignment_0_0 ) )
            // InternalMyDsl.g:762:3: ( rule__Model__TagsAssignment_0_0 )
            {
             before(grammarAccess.getModelAccess().getTagsAssignment_0_0()); 
            // InternalMyDsl.g:763:3: ( rule__Model__TagsAssignment_0_0 )
            // InternalMyDsl.g:763:4: rule__Model__TagsAssignment_0_0
            {
            pushFollow(FOLLOW_9);
            rule__Model__TagsAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getTagsAssignment_0_0()); 

            }

            // InternalMyDsl.g:766:2: ( ( rule__Model__TagsAssignment_0_0 )* )
            // InternalMyDsl.g:767:3: ( rule__Model__TagsAssignment_0_0 )*
            {
             before(grammarAccess.getModelAccess().getTagsAssignment_0_0()); 
            // InternalMyDsl.g:768:3: ( rule__Model__TagsAssignment_0_0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:768:4: rule__Model__TagsAssignment_0_0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Model__TagsAssignment_0_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getTagsAssignment_0_0()); 

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
    // $ANTLR end "rule__Model__Group_0__0__Impl"


    // $ANTLR start "rule__Model__Group_0__1"
    // InternalMyDsl.g:777:1: rule__Model__Group_0__1 : rule__Model__Group_0__1__Impl ;
    public final void rule__Model__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:781:1: ( rule__Model__Group_0__1__Impl )
            // InternalMyDsl.g:782:2: rule__Model__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__1"


    // $ANTLR start "rule__Model__Group_0__1__Impl"
    // InternalMyDsl.g:788:1: rule__Model__Group_0__1__Impl : ( RULE_EOL ) ;
    public final void rule__Model__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:792:1: ( ( RULE_EOL ) )
            // InternalMyDsl.g:793:1: ( RULE_EOL )
            {
            // InternalMyDsl.g:793:1: ( RULE_EOL )
            // InternalMyDsl.g:794:2: RULE_EOL
            {
             before(grammarAccess.getModelAccess().getEOLTerminalRuleCall_0_1()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getEOLTerminalRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__1__Impl"


    // $ANTLR start "rule__Background__Group__0"
    // InternalMyDsl.g:804:1: rule__Background__Group__0 : rule__Background__Group__0__Impl rule__Background__Group__1 ;
    public final void rule__Background__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:808:1: ( rule__Background__Group__0__Impl rule__Background__Group__1 )
            // InternalMyDsl.g:809:2: rule__Background__Group__0__Impl rule__Background__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:816:1: rule__Background__Group__0__Impl : ( 'Background:' ) ;
    public final void rule__Background__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:820:1: ( ( 'Background:' ) )
            // InternalMyDsl.g:821:1: ( 'Background:' )
            {
            // InternalMyDsl.g:821:1: ( 'Background:' )
            // InternalMyDsl.g:822:2: 'Background:'
            {
             before(grammarAccess.getBackgroundAccess().getBackgroundKeyword_0()); 
            match(input,9,FOLLOW_2); 
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
    // InternalMyDsl.g:831:1: rule__Background__Group__1 : rule__Background__Group__1__Impl rule__Background__Group__2 ;
    public final void rule__Background__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:835:1: ( rule__Background__Group__1__Impl rule__Background__Group__2 )
            // InternalMyDsl.g:836:2: rule__Background__Group__1__Impl rule__Background__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:843:1: rule__Background__Group__1__Impl : ( ( rule__Background__NameAssignment_1 ) ) ;
    public final void rule__Background__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:847:1: ( ( ( rule__Background__NameAssignment_1 ) ) )
            // InternalMyDsl.g:848:1: ( ( rule__Background__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:848:1: ( ( rule__Background__NameAssignment_1 ) )
            // InternalMyDsl.g:849:2: ( rule__Background__NameAssignment_1 )
            {
             before(grammarAccess.getBackgroundAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:850:2: ( rule__Background__NameAssignment_1 )
            // InternalMyDsl.g:850:3: rule__Background__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Background__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBackgroundAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:858:1: rule__Background__Group__2 : rule__Background__Group__2__Impl rule__Background__Group__3 ;
    public final void rule__Background__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:862:1: ( rule__Background__Group__2__Impl rule__Background__Group__3 )
            // InternalMyDsl.g:863:2: rule__Background__Group__2__Impl rule__Background__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:870:1: rule__Background__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__Background__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:874:1: ( ( RULE_EOL ) )
            // InternalMyDsl.g:875:1: ( RULE_EOL )
            {
            // InternalMyDsl.g:875:1: ( RULE_EOL )
            // InternalMyDsl.g:876:2: RULE_EOL
            {
             before(grammarAccess.getBackgroundAccess().getEOLTerminalRuleCall_2()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getBackgroundAccess().getEOLTerminalRuleCall_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:885:1: rule__Background__Group__3 : rule__Background__Group__3__Impl rule__Background__Group__4 ;
    public final void rule__Background__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:889:1: ( rule__Background__Group__3__Impl rule__Background__Group__4 )
            // InternalMyDsl.g:890:2: rule__Background__Group__3__Impl rule__Background__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:897:1: rule__Background__Group__3__Impl : ( ( rule__Background__StatementsAssignment_3 )* ) ;
    public final void rule__Background__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:901:1: ( ( ( rule__Background__StatementsAssignment_3 )* ) )
            // InternalMyDsl.g:902:1: ( ( rule__Background__StatementsAssignment_3 )* )
            {
            // InternalMyDsl.g:902:1: ( ( rule__Background__StatementsAssignment_3 )* )
            // InternalMyDsl.g:903:2: ( rule__Background__StatementsAssignment_3 )*
            {
             before(grammarAccess.getBackgroundAccess().getStatementsAssignment_3()); 
            // InternalMyDsl.g:904:2: ( rule__Background__StatementsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:904:3: rule__Background__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Background__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getBackgroundAccess().getStatementsAssignment_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:912:1: rule__Background__Group__4 : rule__Background__Group__4__Impl ;
    public final void rule__Background__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:916:1: ( rule__Background__Group__4__Impl )
            // InternalMyDsl.g:917:2: rule__Background__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Background__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:923:1: rule__Background__Group__4__Impl : ( ( rule__Background__StepsAssignment_4 )* ) ;
    public final void rule__Background__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:927:1: ( ( ( rule__Background__StepsAssignment_4 )* ) )
            // InternalMyDsl.g:928:1: ( ( rule__Background__StepsAssignment_4 )* )
            {
            // InternalMyDsl.g:928:1: ( ( rule__Background__StepsAssignment_4 )* )
            // InternalMyDsl.g:929:2: ( rule__Background__StepsAssignment_4 )*
            {
             before(grammarAccess.getBackgroundAccess().getStepsAssignment_4()); 
            // InternalMyDsl.g:930:2: ( rule__Background__StepsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=14 && LA9_0<=19)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:930:3: rule__Background__StepsAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Background__StepsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getBackgroundAccess().getStepsAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Scenario__Group__0"
    // InternalMyDsl.g:939:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:943:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalMyDsl.g:944:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
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
    // InternalMyDsl.g:951:1: rule__Scenario__Group__0__Impl : ( ( rule__Scenario__Group_0__0 )? ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:955:1: ( ( ( rule__Scenario__Group_0__0 )? ) )
            // InternalMyDsl.g:956:1: ( ( rule__Scenario__Group_0__0 )? )
            {
            // InternalMyDsl.g:956:1: ( ( rule__Scenario__Group_0__0 )? )
            // InternalMyDsl.g:957:2: ( rule__Scenario__Group_0__0 )?
            {
             before(grammarAccess.getScenarioAccess().getGroup_0()); 
            // InternalMyDsl.g:958:2: ( rule__Scenario__Group_0__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:958:3: rule__Scenario__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scenario__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScenarioAccess().getGroup_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:966:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:970:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalMyDsl.g:971:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:978:1: rule__Scenario__Group__1__Impl : ( 'Scenario:' ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:982:1: ( ( 'Scenario:' ) )
            // InternalMyDsl.g:983:1: ( 'Scenario:' )
            {
            // InternalMyDsl.g:983:1: ( 'Scenario:' )
            // InternalMyDsl.g:984:2: 'Scenario:'
            {
             before(grammarAccess.getScenarioAccess().getScenarioKeyword_1()); 
            match(input,10,FOLLOW_2); 
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
    // InternalMyDsl.g:993:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:997:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // InternalMyDsl.g:998:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
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
    // InternalMyDsl.g:1005:1: rule__Scenario__Group__2__Impl : ( ( rule__Scenario__NameAssignment_2 ) ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1009:1: ( ( ( rule__Scenario__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1010:1: ( ( rule__Scenario__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1010:1: ( ( rule__Scenario__NameAssignment_2 ) )
            // InternalMyDsl.g:1011:2: ( rule__Scenario__NameAssignment_2 )
            {
             before(grammarAccess.getScenarioAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1012:2: ( rule__Scenario__NameAssignment_2 )
            // InternalMyDsl.g:1012:3: rule__Scenario__NameAssignment_2
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
    // InternalMyDsl.g:1020:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl rule__Scenario__Group__4 ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1024:1: ( rule__Scenario__Group__3__Impl rule__Scenario__Group__4 )
            // InternalMyDsl.g:1025:2: rule__Scenario__Group__3__Impl rule__Scenario__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1032:1: rule__Scenario__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1036:1: ( ( RULE_EOL ) )
            // InternalMyDsl.g:1037:1: ( RULE_EOL )
            {
            // InternalMyDsl.g:1037:1: ( RULE_EOL )
            // InternalMyDsl.g:1038:2: RULE_EOL
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
    // InternalMyDsl.g:1047:1: rule__Scenario__Group__4 : rule__Scenario__Group__4__Impl rule__Scenario__Group__5 ;
    public final void rule__Scenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1051:1: ( rule__Scenario__Group__4__Impl rule__Scenario__Group__5 )
            // InternalMyDsl.g:1052:2: rule__Scenario__Group__4__Impl rule__Scenario__Group__5
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
    // InternalMyDsl.g:1059:1: rule__Scenario__Group__4__Impl : ( ( rule__Scenario__StatementsAssignment_4 )* ) ;
    public final void rule__Scenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1063:1: ( ( ( rule__Scenario__StatementsAssignment_4 )* ) )
            // InternalMyDsl.g:1064:1: ( ( rule__Scenario__StatementsAssignment_4 )* )
            {
            // InternalMyDsl.g:1064:1: ( ( rule__Scenario__StatementsAssignment_4 )* )
            // InternalMyDsl.g:1065:2: ( rule__Scenario__StatementsAssignment_4 )*
            {
             before(grammarAccess.getScenarioAccess().getStatementsAssignment_4()); 
            // InternalMyDsl.g:1066:2: ( rule__Scenario__StatementsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1066:3: rule__Scenario__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Scenario__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalMyDsl.g:1074:1: rule__Scenario__Group__5 : rule__Scenario__Group__5__Impl ;
    public final void rule__Scenario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1078:1: ( rule__Scenario__Group__5__Impl )
            // InternalMyDsl.g:1079:2: rule__Scenario__Group__5__Impl
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
    // InternalMyDsl.g:1085:1: rule__Scenario__Group__5__Impl : ( ( rule__Scenario__StepsAssignment_5 )* ) ;
    public final void rule__Scenario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1089:1: ( ( ( rule__Scenario__StepsAssignment_5 )* ) )
            // InternalMyDsl.g:1090:1: ( ( rule__Scenario__StepsAssignment_5 )* )
            {
            // InternalMyDsl.g:1090:1: ( ( rule__Scenario__StepsAssignment_5 )* )
            // InternalMyDsl.g:1091:2: ( rule__Scenario__StepsAssignment_5 )*
            {
             before(grammarAccess.getScenarioAccess().getStepsAssignment_5()); 
            // InternalMyDsl.g:1092:2: ( rule__Scenario__StepsAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=14 && LA12_0<=19)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1092:3: rule__Scenario__StepsAssignment_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Scenario__StepsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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


    // $ANTLR start "rule__Scenario__Group_0__0"
    // InternalMyDsl.g:1101:1: rule__Scenario__Group_0__0 : rule__Scenario__Group_0__0__Impl rule__Scenario__Group_0__1 ;
    public final void rule__Scenario__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1105:1: ( rule__Scenario__Group_0__0__Impl rule__Scenario__Group_0__1 )
            // InternalMyDsl.g:1106:2: rule__Scenario__Group_0__0__Impl rule__Scenario__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Scenario__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_0__0"


    // $ANTLR start "rule__Scenario__Group_0__0__Impl"
    // InternalMyDsl.g:1113:1: rule__Scenario__Group_0__0__Impl : ( ( ( rule__Scenario__TagsAssignment_0_0 ) ) ( ( rule__Scenario__TagsAssignment_0_0 )* ) ) ;
    public final void rule__Scenario__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1117:1: ( ( ( ( rule__Scenario__TagsAssignment_0_0 ) ) ( ( rule__Scenario__TagsAssignment_0_0 )* ) ) )
            // InternalMyDsl.g:1118:1: ( ( ( rule__Scenario__TagsAssignment_0_0 ) ) ( ( rule__Scenario__TagsAssignment_0_0 )* ) )
            {
            // InternalMyDsl.g:1118:1: ( ( ( rule__Scenario__TagsAssignment_0_0 ) ) ( ( rule__Scenario__TagsAssignment_0_0 )* ) )
            // InternalMyDsl.g:1119:2: ( ( rule__Scenario__TagsAssignment_0_0 ) ) ( ( rule__Scenario__TagsAssignment_0_0 )* )
            {
            // InternalMyDsl.g:1119:2: ( ( rule__Scenario__TagsAssignment_0_0 ) )
            // InternalMyDsl.g:1120:3: ( rule__Scenario__TagsAssignment_0_0 )
            {
             before(grammarAccess.getScenarioAccess().getTagsAssignment_0_0()); 
            // InternalMyDsl.g:1121:3: ( rule__Scenario__TagsAssignment_0_0 )
            // InternalMyDsl.g:1121:4: rule__Scenario__TagsAssignment_0_0
            {
            pushFollow(FOLLOW_9);
            rule__Scenario__TagsAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getTagsAssignment_0_0()); 

            }

            // InternalMyDsl.g:1124:2: ( ( rule__Scenario__TagsAssignment_0_0 )* )
            // InternalMyDsl.g:1125:3: ( rule__Scenario__TagsAssignment_0_0 )*
            {
             before(grammarAccess.getScenarioAccess().getTagsAssignment_0_0()); 
            // InternalMyDsl.g:1126:3: ( rule__Scenario__TagsAssignment_0_0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1126:4: rule__Scenario__TagsAssignment_0_0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Scenario__TagsAssignment_0_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getTagsAssignment_0_0()); 

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
    // $ANTLR end "rule__Scenario__Group_0__0__Impl"


    // $ANTLR start "rule__Scenario__Group_0__1"
    // InternalMyDsl.g:1135:1: rule__Scenario__Group_0__1 : rule__Scenario__Group_0__1__Impl ;
    public final void rule__Scenario__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1139:1: ( rule__Scenario__Group_0__1__Impl )
            // InternalMyDsl.g:1140:2: rule__Scenario__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_0__1"


    // $ANTLR start "rule__Scenario__Group_0__1__Impl"
    // InternalMyDsl.g:1146:1: rule__Scenario__Group_0__1__Impl : ( RULE_EOL ) ;
    public final void rule__Scenario__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1150:1: ( ( RULE_EOL ) )
            // InternalMyDsl.g:1151:1: ( RULE_EOL )
            {
            // InternalMyDsl.g:1151:1: ( RULE_EOL )
            // InternalMyDsl.g:1152:2: RULE_EOL
            {
             before(grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_0_1()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_0__1__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__0"
    // InternalMyDsl.g:1162:1: rule__ScenarioOutline__Group__0 : rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1 ;
    public final void rule__ScenarioOutline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1166:1: ( rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1 )
            // InternalMyDsl.g:1167:2: rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ScenarioOutline__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__0"


    // $ANTLR start "rule__ScenarioOutline__Group__0__Impl"
    // InternalMyDsl.g:1174:1: rule__ScenarioOutline__Group__0__Impl : ( ( rule__ScenarioOutline__Group_0__0 )? ) ;
    public final void rule__ScenarioOutline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1178:1: ( ( ( rule__ScenarioOutline__Group_0__0 )? ) )
            // InternalMyDsl.g:1179:1: ( ( rule__ScenarioOutline__Group_0__0 )? )
            {
            // InternalMyDsl.g:1179:1: ( ( rule__ScenarioOutline__Group_0__0 )? )
            // InternalMyDsl.g:1180:2: ( rule__ScenarioOutline__Group_0__0 )?
            {
             before(grammarAccess.getScenarioOutlineAccess().getGroup_0()); 
            // InternalMyDsl.g:1181:2: ( rule__ScenarioOutline__Group_0__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1181:3: rule__ScenarioOutline__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScenarioOutline__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScenarioOutlineAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__0__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__1"
    // InternalMyDsl.g:1189:1: rule__ScenarioOutline__Group__1 : rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2 ;
    public final void rule__ScenarioOutline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1193:1: ( rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2 )
            // InternalMyDsl.g:1194:2: rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ScenarioOutline__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__1"


    // $ANTLR start "rule__ScenarioOutline__Group__1__Impl"
    // InternalMyDsl.g:1201:1: rule__ScenarioOutline__Group__1__Impl : ( 'Scenario Outline:' ) ;
    public final void rule__ScenarioOutline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1205:1: ( ( 'Scenario Outline:' ) )
            // InternalMyDsl.g:1206:1: ( 'Scenario Outline:' )
            {
            // InternalMyDsl.g:1206:1: ( 'Scenario Outline:' )
            // InternalMyDsl.g:1207:2: 'Scenario Outline:'
            {
             before(grammarAccess.getScenarioOutlineAccess().getScenarioOutlineKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getScenarioOutlineAccess().getScenarioOutlineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__1__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__2"
    // InternalMyDsl.g:1216:1: rule__ScenarioOutline__Group__2 : rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3 ;
    public final void rule__ScenarioOutline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1220:1: ( rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3 )
            // InternalMyDsl.g:1221:2: rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ScenarioOutline__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__2"


    // $ANTLR start "rule__ScenarioOutline__Group__2__Impl"
    // InternalMyDsl.g:1228:1: rule__ScenarioOutline__Group__2__Impl : ( ( rule__ScenarioOutline__NameAssignment_2 ) ) ;
    public final void rule__ScenarioOutline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1232:1: ( ( ( rule__ScenarioOutline__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1233:1: ( ( rule__ScenarioOutline__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1233:1: ( ( rule__ScenarioOutline__NameAssignment_2 ) )
            // InternalMyDsl.g:1234:2: ( rule__ScenarioOutline__NameAssignment_2 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1235:2: ( rule__ScenarioOutline__NameAssignment_2 )
            // InternalMyDsl.g:1235:3: rule__ScenarioOutline__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__2__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__3"
    // InternalMyDsl.g:1243:1: rule__ScenarioOutline__Group__3 : rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4 ;
    public final void rule__ScenarioOutline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1247:1: ( rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4 )
            // InternalMyDsl.g:1248:2: rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__ScenarioOutline__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__3"


    // $ANTLR start "rule__ScenarioOutline__Group__3__Impl"
    // InternalMyDsl.g:1255:1: rule__ScenarioOutline__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__ScenarioOutline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1259:1: ( ( RULE_EOL ) )
            // InternalMyDsl.g:1260:1: ( RULE_EOL )
            {
            // InternalMyDsl.g:1260:1: ( RULE_EOL )
            // InternalMyDsl.g:1261:2: RULE_EOL
            {
             before(grammarAccess.getScenarioOutlineAccess().getEOLTerminalRuleCall_3()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getScenarioOutlineAccess().getEOLTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__3__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__4"
    // InternalMyDsl.g:1270:1: rule__ScenarioOutline__Group__4 : rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5 ;
    public final void rule__ScenarioOutline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1274:1: ( rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5 )
            // InternalMyDsl.g:1275:2: rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__ScenarioOutline__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__4"


    // $ANTLR start "rule__ScenarioOutline__Group__4__Impl"
    // InternalMyDsl.g:1282:1: rule__ScenarioOutline__Group__4__Impl : ( ( rule__ScenarioOutline__StatementsAssignment_4 )* ) ;
    public final void rule__ScenarioOutline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1286:1: ( ( ( rule__ScenarioOutline__StatementsAssignment_4 )* ) )
            // InternalMyDsl.g:1287:1: ( ( rule__ScenarioOutline__StatementsAssignment_4 )* )
            {
            // InternalMyDsl.g:1287:1: ( ( rule__ScenarioOutline__StatementsAssignment_4 )* )
            // InternalMyDsl.g:1288:2: ( rule__ScenarioOutline__StatementsAssignment_4 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getStatementsAssignment_4()); 
            // InternalMyDsl.g:1289:2: ( rule__ScenarioOutline__StatementsAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1289:3: rule__ScenarioOutline__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ScenarioOutline__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getScenarioOutlineAccess().getStatementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__4__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__5"
    // InternalMyDsl.g:1297:1: rule__ScenarioOutline__Group__5 : rule__ScenarioOutline__Group__5__Impl rule__ScenarioOutline__Group__6 ;
    public final void rule__ScenarioOutline__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1301:1: ( rule__ScenarioOutline__Group__5__Impl rule__ScenarioOutline__Group__6 )
            // InternalMyDsl.g:1302:2: rule__ScenarioOutline__Group__5__Impl rule__ScenarioOutline__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__ScenarioOutline__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__5"


    // $ANTLR start "rule__ScenarioOutline__Group__5__Impl"
    // InternalMyDsl.g:1309:1: rule__ScenarioOutline__Group__5__Impl : ( ( rule__ScenarioOutline__StepsAssignment_5 )* ) ;
    public final void rule__ScenarioOutline__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1313:1: ( ( ( rule__ScenarioOutline__StepsAssignment_5 )* ) )
            // InternalMyDsl.g:1314:1: ( ( rule__ScenarioOutline__StepsAssignment_5 )* )
            {
            // InternalMyDsl.g:1314:1: ( ( rule__ScenarioOutline__StepsAssignment_5 )* )
            // InternalMyDsl.g:1315:2: ( rule__ScenarioOutline__StepsAssignment_5 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getStepsAssignment_5()); 
            // InternalMyDsl.g:1316:2: ( rule__ScenarioOutline__StepsAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=14 && LA16_0<=19)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:1316:3: rule__ScenarioOutline__StepsAssignment_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ScenarioOutline__StepsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getScenarioOutlineAccess().getStepsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__5__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__6"
    // InternalMyDsl.g:1324:1: rule__ScenarioOutline__Group__6 : rule__ScenarioOutline__Group__6__Impl ;
    public final void rule__ScenarioOutline__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1328:1: ( rule__ScenarioOutline__Group__6__Impl )
            // InternalMyDsl.g:1329:2: rule__ScenarioOutline__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__6"


    // $ANTLR start "rule__ScenarioOutline__Group__6__Impl"
    // InternalMyDsl.g:1335:1: rule__ScenarioOutline__Group__6__Impl : ( ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* ) ) ;
    public final void rule__ScenarioOutline__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1339:1: ( ( ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* ) ) )
            // InternalMyDsl.g:1340:1: ( ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* ) )
            {
            // InternalMyDsl.g:1340:1: ( ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* ) )
            // InternalMyDsl.g:1341:2: ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* )
            {
            // InternalMyDsl.g:1341:2: ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) )
            // InternalMyDsl.g:1342:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_6()); 
            // InternalMyDsl.g:1343:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )
            // InternalMyDsl.g:1343:4: rule__ScenarioOutline__ExamplesAssignment_6
            {
            pushFollow(FOLLOW_15);
            rule__ScenarioOutline__ExamplesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_6()); 

            }

            // InternalMyDsl.g:1346:2: ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* )
            // InternalMyDsl.g:1347:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_6()); 
            // InternalMyDsl.g:1348:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )*
            loop17:
            do {
                int alt17=2;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:1348:4: rule__ScenarioOutline__ExamplesAssignment_6
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ScenarioOutline__ExamplesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_6()); 

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
    // $ANTLR end "rule__ScenarioOutline__Group__6__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group_0__0"
    // InternalMyDsl.g:1358:1: rule__ScenarioOutline__Group_0__0 : rule__ScenarioOutline__Group_0__0__Impl rule__ScenarioOutline__Group_0__1 ;
    public final void rule__ScenarioOutline__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1362:1: ( rule__ScenarioOutline__Group_0__0__Impl rule__ScenarioOutline__Group_0__1 )
            // InternalMyDsl.g:1363:2: rule__ScenarioOutline__Group_0__0__Impl rule__ScenarioOutline__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__ScenarioOutline__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group_0__0"


    // $ANTLR start "rule__ScenarioOutline__Group_0__0__Impl"
    // InternalMyDsl.g:1370:1: rule__ScenarioOutline__Group_0__0__Impl : ( ( ( rule__ScenarioOutline__TagsAssignment_0_0 ) ) ( ( rule__ScenarioOutline__TagsAssignment_0_0 )* ) ) ;
    public final void rule__ScenarioOutline__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1374:1: ( ( ( ( rule__ScenarioOutline__TagsAssignment_0_0 ) ) ( ( rule__ScenarioOutline__TagsAssignment_0_0 )* ) ) )
            // InternalMyDsl.g:1375:1: ( ( ( rule__ScenarioOutline__TagsAssignment_0_0 ) ) ( ( rule__ScenarioOutline__TagsAssignment_0_0 )* ) )
            {
            // InternalMyDsl.g:1375:1: ( ( ( rule__ScenarioOutline__TagsAssignment_0_0 ) ) ( ( rule__ScenarioOutline__TagsAssignment_0_0 )* ) )
            // InternalMyDsl.g:1376:2: ( ( rule__ScenarioOutline__TagsAssignment_0_0 ) ) ( ( rule__ScenarioOutline__TagsAssignment_0_0 )* )
            {
            // InternalMyDsl.g:1376:2: ( ( rule__ScenarioOutline__TagsAssignment_0_0 ) )
            // InternalMyDsl.g:1377:3: ( rule__ScenarioOutline__TagsAssignment_0_0 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getTagsAssignment_0_0()); 
            // InternalMyDsl.g:1378:3: ( rule__ScenarioOutline__TagsAssignment_0_0 )
            // InternalMyDsl.g:1378:4: rule__ScenarioOutline__TagsAssignment_0_0
            {
            pushFollow(FOLLOW_9);
            rule__ScenarioOutline__TagsAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getTagsAssignment_0_0()); 

            }

            // InternalMyDsl.g:1381:2: ( ( rule__ScenarioOutline__TagsAssignment_0_0 )* )
            // InternalMyDsl.g:1382:3: ( rule__ScenarioOutline__TagsAssignment_0_0 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getTagsAssignment_0_0()); 
            // InternalMyDsl.g:1383:3: ( rule__ScenarioOutline__TagsAssignment_0_0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==20) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1383:4: rule__ScenarioOutline__TagsAssignment_0_0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ScenarioOutline__TagsAssignment_0_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getScenarioOutlineAccess().getTagsAssignment_0_0()); 

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
    // $ANTLR end "rule__ScenarioOutline__Group_0__0__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group_0__1"
    // InternalMyDsl.g:1392:1: rule__ScenarioOutline__Group_0__1 : rule__ScenarioOutline__Group_0__1__Impl ;
    public final void rule__ScenarioOutline__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1396:1: ( rule__ScenarioOutline__Group_0__1__Impl )
            // InternalMyDsl.g:1397:2: rule__ScenarioOutline__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group_0__1"


    // $ANTLR start "rule__ScenarioOutline__Group_0__1__Impl"
    // InternalMyDsl.g:1403:1: rule__ScenarioOutline__Group_0__1__Impl : ( RULE_EOL ) ;
    public final void rule__ScenarioOutline__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1407:1: ( ( RULE_EOL ) )
            // InternalMyDsl.g:1408:1: ( RULE_EOL )
            {
            // InternalMyDsl.g:1408:1: ( RULE_EOL )
            // InternalMyDsl.g:1409:2: RULE_EOL
            {
             before(grammarAccess.getScenarioOutlineAccess().getEOLTerminalRuleCall_0_1()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getScenarioOutlineAccess().getEOLTerminalRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group_0__1__Impl"


    // $ANTLR start "rule__Example__Group__0"
    // InternalMyDsl.g:1419:1: rule__Example__Group__0 : rule__Example__Group__0__Impl rule__Example__Group__1 ;
    public final void rule__Example__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1423:1: ( rule__Example__Group__0__Impl rule__Example__Group__1 )
            // InternalMyDsl.g:1424:2: rule__Example__Group__0__Impl rule__Example__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Example__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__0"


    // $ANTLR start "rule__Example__Group__0__Impl"
    // InternalMyDsl.g:1431:1: rule__Example__Group__0__Impl : ( ( rule__Example__Group_0__0 )? ) ;
    public final void rule__Example__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1435:1: ( ( ( rule__Example__Group_0__0 )? ) )
            // InternalMyDsl.g:1436:1: ( ( rule__Example__Group_0__0 )? )
            {
            // InternalMyDsl.g:1436:1: ( ( rule__Example__Group_0__0 )? )
            // InternalMyDsl.g:1437:2: ( rule__Example__Group_0__0 )?
            {
             before(grammarAccess.getExampleAccess().getGroup_0()); 
            // InternalMyDsl.g:1438:2: ( rule__Example__Group_0__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1438:3: rule__Example__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Example__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExampleAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__0__Impl"


    // $ANTLR start "rule__Example__Group__1"
    // InternalMyDsl.g:1446:1: rule__Example__Group__1 : rule__Example__Group__1__Impl rule__Example__Group__2 ;
    public final void rule__Example__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1450:1: ( rule__Example__Group__1__Impl rule__Example__Group__2 )
            // InternalMyDsl.g:1451:2: rule__Example__Group__1__Impl rule__Example__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Example__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__1"


    // $ANTLR start "rule__Example__Group__1__Impl"
    // InternalMyDsl.g:1458:1: rule__Example__Group__1__Impl : ( 'Examples:' ) ;
    public final void rule__Example__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1462:1: ( ( 'Examples:' ) )
            // InternalMyDsl.g:1463:1: ( 'Examples:' )
            {
            // InternalMyDsl.g:1463:1: ( 'Examples:' )
            // InternalMyDsl.g:1464:2: 'Examples:'
            {
             before(grammarAccess.getExampleAccess().getExamplesKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getExampleAccess().getExamplesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__1__Impl"


    // $ANTLR start "rule__Example__Group__2"
    // InternalMyDsl.g:1473:1: rule__Example__Group__2 : rule__Example__Group__2__Impl rule__Example__Group__3 ;
    public final void rule__Example__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1477:1: ( rule__Example__Group__2__Impl rule__Example__Group__3 )
            // InternalMyDsl.g:1478:2: rule__Example__Group__2__Impl rule__Example__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Example__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__2"


    // $ANTLR start "rule__Example__Group__2__Impl"
    // InternalMyDsl.g:1485:1: rule__Example__Group__2__Impl : ( ( rule__Example__NameAssignment_2 ) ) ;
    public final void rule__Example__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1489:1: ( ( ( rule__Example__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1490:1: ( ( rule__Example__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1490:1: ( ( rule__Example__NameAssignment_2 ) )
            // InternalMyDsl.g:1491:2: ( rule__Example__NameAssignment_2 )
            {
             before(grammarAccess.getExampleAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1492:2: ( rule__Example__NameAssignment_2 )
            // InternalMyDsl.g:1492:3: rule__Example__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Example__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__2__Impl"


    // $ANTLR start "rule__Example__Group__3"
    // InternalMyDsl.g:1500:1: rule__Example__Group__3 : rule__Example__Group__3__Impl rule__Example__Group__4 ;
    public final void rule__Example__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1504:1: ( rule__Example__Group__3__Impl rule__Example__Group__4 )
            // InternalMyDsl.g:1505:2: rule__Example__Group__3__Impl rule__Example__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Example__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__3"


    // $ANTLR start "rule__Example__Group__3__Impl"
    // InternalMyDsl.g:1512:1: rule__Example__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Example__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1516:1: ( ( RULE_EOL ) )
            // InternalMyDsl.g:1517:1: ( RULE_EOL )
            {
            // InternalMyDsl.g:1517:1: ( RULE_EOL )
            // InternalMyDsl.g:1518:2: RULE_EOL
            {
             before(grammarAccess.getExampleAccess().getEOLTerminalRuleCall_3()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getExampleAccess().getEOLTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__3__Impl"


    // $ANTLR start "rule__Example__Group__4"
    // InternalMyDsl.g:1527:1: rule__Example__Group__4 : rule__Example__Group__4__Impl rule__Example__Group__5 ;
    public final void rule__Example__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1531:1: ( rule__Example__Group__4__Impl rule__Example__Group__5 )
            // InternalMyDsl.g:1532:2: rule__Example__Group__4__Impl rule__Example__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Example__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__4"


    // $ANTLR start "rule__Example__Group__4__Impl"
    // InternalMyDsl.g:1539:1: rule__Example__Group__4__Impl : ( ( rule__Example__StatementsAssignment_4 )* ) ;
    public final void rule__Example__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1543:1: ( ( ( rule__Example__StatementsAssignment_4 )* ) )
            // InternalMyDsl.g:1544:1: ( ( rule__Example__StatementsAssignment_4 )* )
            {
            // InternalMyDsl.g:1544:1: ( ( rule__Example__StatementsAssignment_4 )* )
            // InternalMyDsl.g:1545:2: ( rule__Example__StatementsAssignment_4 )*
            {
             before(grammarAccess.getExampleAccess().getStatementsAssignment_4()); 
            // InternalMyDsl.g:1546:2: ( rule__Example__StatementsAssignment_4 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:1546:3: rule__Example__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Example__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getExampleAccess().getStatementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__4__Impl"


    // $ANTLR start "rule__Example__Group__5"
    // InternalMyDsl.g:1554:1: rule__Example__Group__5 : rule__Example__Group__5__Impl ;
    public final void rule__Example__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1558:1: ( rule__Example__Group__5__Impl )
            // InternalMyDsl.g:1559:2: rule__Example__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Example__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__5"


    // $ANTLR start "rule__Example__Group__5__Impl"
    // InternalMyDsl.g:1565:1: rule__Example__Group__5__Impl : ( ( ( rule__Example__RowsAssignment_5 ) ) ( ( rule__Example__RowsAssignment_5 )* ) ) ;
    public final void rule__Example__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1569:1: ( ( ( ( rule__Example__RowsAssignment_5 ) ) ( ( rule__Example__RowsAssignment_5 )* ) ) )
            // InternalMyDsl.g:1570:1: ( ( ( rule__Example__RowsAssignment_5 ) ) ( ( rule__Example__RowsAssignment_5 )* ) )
            {
            // InternalMyDsl.g:1570:1: ( ( ( rule__Example__RowsAssignment_5 ) ) ( ( rule__Example__RowsAssignment_5 )* ) )
            // InternalMyDsl.g:1571:2: ( ( rule__Example__RowsAssignment_5 ) ) ( ( rule__Example__RowsAssignment_5 )* )
            {
            // InternalMyDsl.g:1571:2: ( ( rule__Example__RowsAssignment_5 ) )
            // InternalMyDsl.g:1572:3: ( rule__Example__RowsAssignment_5 )
            {
             before(grammarAccess.getExampleAccess().getRowsAssignment_5()); 
            // InternalMyDsl.g:1573:3: ( rule__Example__RowsAssignment_5 )
            // InternalMyDsl.g:1573:4: rule__Example__RowsAssignment_5
            {
            pushFollow(FOLLOW_17);
            rule__Example__RowsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getRowsAssignment_5()); 

            }

            // InternalMyDsl.g:1576:2: ( ( rule__Example__RowsAssignment_5 )* )
            // InternalMyDsl.g:1577:3: ( rule__Example__RowsAssignment_5 )*
            {
             before(grammarAccess.getExampleAccess().getRowsAssignment_5()); 
            // InternalMyDsl.g:1578:3: ( rule__Example__RowsAssignment_5 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==13) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:1578:4: rule__Example__RowsAssignment_5
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Example__RowsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getExampleAccess().getRowsAssignment_5()); 

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
    // $ANTLR end "rule__Example__Group__5__Impl"


    // $ANTLR start "rule__Example__Group_0__0"
    // InternalMyDsl.g:1588:1: rule__Example__Group_0__0 : rule__Example__Group_0__0__Impl rule__Example__Group_0__1 ;
    public final void rule__Example__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1592:1: ( rule__Example__Group_0__0__Impl rule__Example__Group_0__1 )
            // InternalMyDsl.g:1593:2: rule__Example__Group_0__0__Impl rule__Example__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Example__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group_0__0"


    // $ANTLR start "rule__Example__Group_0__0__Impl"
    // InternalMyDsl.g:1600:1: rule__Example__Group_0__0__Impl : ( ( ( rule__Example__TagsAssignment_0_0 ) ) ( ( rule__Example__TagsAssignment_0_0 )* ) ) ;
    public final void rule__Example__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1604:1: ( ( ( ( rule__Example__TagsAssignment_0_0 ) ) ( ( rule__Example__TagsAssignment_0_0 )* ) ) )
            // InternalMyDsl.g:1605:1: ( ( ( rule__Example__TagsAssignment_0_0 ) ) ( ( rule__Example__TagsAssignment_0_0 )* ) )
            {
            // InternalMyDsl.g:1605:1: ( ( ( rule__Example__TagsAssignment_0_0 ) ) ( ( rule__Example__TagsAssignment_0_0 )* ) )
            // InternalMyDsl.g:1606:2: ( ( rule__Example__TagsAssignment_0_0 ) ) ( ( rule__Example__TagsAssignment_0_0 )* )
            {
            // InternalMyDsl.g:1606:2: ( ( rule__Example__TagsAssignment_0_0 ) )
            // InternalMyDsl.g:1607:3: ( rule__Example__TagsAssignment_0_0 )
            {
             before(grammarAccess.getExampleAccess().getTagsAssignment_0_0()); 
            // InternalMyDsl.g:1608:3: ( rule__Example__TagsAssignment_0_0 )
            // InternalMyDsl.g:1608:4: rule__Example__TagsAssignment_0_0
            {
            pushFollow(FOLLOW_9);
            rule__Example__TagsAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getTagsAssignment_0_0()); 

            }

            // InternalMyDsl.g:1611:2: ( ( rule__Example__TagsAssignment_0_0 )* )
            // InternalMyDsl.g:1612:3: ( rule__Example__TagsAssignment_0_0 )*
            {
             before(grammarAccess.getExampleAccess().getTagsAssignment_0_0()); 
            // InternalMyDsl.g:1613:3: ( rule__Example__TagsAssignment_0_0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==20) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:1613:4: rule__Example__TagsAssignment_0_0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Example__TagsAssignment_0_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getExampleAccess().getTagsAssignment_0_0()); 

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
    // $ANTLR end "rule__Example__Group_0__0__Impl"


    // $ANTLR start "rule__Example__Group_0__1"
    // InternalMyDsl.g:1622:1: rule__Example__Group_0__1 : rule__Example__Group_0__1__Impl ;
    public final void rule__Example__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1626:1: ( rule__Example__Group_0__1__Impl )
            // InternalMyDsl.g:1627:2: rule__Example__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Example__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group_0__1"


    // $ANTLR start "rule__Example__Group_0__1__Impl"
    // InternalMyDsl.g:1633:1: rule__Example__Group_0__1__Impl : ( RULE_EOL ) ;
    public final void rule__Example__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1637:1: ( ( RULE_EOL ) )
            // InternalMyDsl.g:1638:1: ( RULE_EOL )
            {
            // InternalMyDsl.g:1638:1: ( RULE_EOL )
            // InternalMyDsl.g:1639:2: RULE_EOL
            {
             before(grammarAccess.getExampleAccess().getEOLTerminalRuleCall_0_1()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getExampleAccess().getEOLTerminalRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group_0__1__Impl"


    // $ANTLR start "rule__Row__Group__0"
    // InternalMyDsl.g:1649:1: rule__Row__Group__0 : rule__Row__Group__0__Impl rule__Row__Group__1 ;
    public final void rule__Row__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1653:1: ( rule__Row__Group__0__Impl rule__Row__Group__1 )
            // InternalMyDsl.g:1654:2: rule__Row__Group__0__Impl rule__Row__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1661:1: rule__Row__Group__0__Impl : ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) ) ;
    public final void rule__Row__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1665:1: ( ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) ) )
            // InternalMyDsl.g:1666:1: ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) )
            {
            // InternalMyDsl.g:1666:1: ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) )
            // InternalMyDsl.g:1667:2: ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* )
            {
            // InternalMyDsl.g:1667:2: ( ( rule__Row__CellsAssignment_0 ) )
            // InternalMyDsl.g:1668:3: ( rule__Row__CellsAssignment_0 )
            {
             before(grammarAccess.getRowAccess().getCellsAssignment_0()); 
            // InternalMyDsl.g:1669:3: ( rule__Row__CellsAssignment_0 )
            // InternalMyDsl.g:1669:4: rule__Row__CellsAssignment_0
            {
            pushFollow(FOLLOW_17);
            rule__Row__CellsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getCellsAssignment_0()); 

            }

            // InternalMyDsl.g:1672:2: ( ( rule__Row__CellsAssignment_0 )* )
            // InternalMyDsl.g:1673:3: ( rule__Row__CellsAssignment_0 )*
            {
             before(grammarAccess.getRowAccess().getCellsAssignment_0()); 
            // InternalMyDsl.g:1674:3: ( rule__Row__CellsAssignment_0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==13) ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1==RULE_ID) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:1674:4: rule__Row__CellsAssignment_0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Row__CellsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalMyDsl.g:1683:1: rule__Row__Group__1 : rule__Row__Group__1__Impl rule__Row__Group__2 ;
    public final void rule__Row__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1687:1: ( rule__Row__Group__1__Impl rule__Row__Group__2 )
            // InternalMyDsl.g:1688:2: rule__Row__Group__1__Impl rule__Row__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Row__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:1695:1: rule__Row__Group__1__Impl : ( '|' ) ;
    public final void rule__Row__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1699:1: ( ( '|' ) )
            // InternalMyDsl.g:1700:1: ( '|' )
            {
            // InternalMyDsl.g:1700:1: ( '|' )
            // InternalMyDsl.g:1701:2: '|'
            {
             before(grammarAccess.getRowAccess().getVerticalLineKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getVerticalLineKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Row__Group__2"
    // InternalMyDsl.g:1710:1: rule__Row__Group__2 : rule__Row__Group__2__Impl ;
    public final void rule__Row__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1714:1: ( rule__Row__Group__2__Impl )
            // InternalMyDsl.g:1715:2: rule__Row__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__2"


    // $ANTLR start "rule__Row__Group__2__Impl"
    // InternalMyDsl.g:1721:1: rule__Row__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__Row__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1725:1: ( ( RULE_EOL ) )
            // InternalMyDsl.g:1726:1: ( RULE_EOL )
            {
            // InternalMyDsl.g:1726:1: ( RULE_EOL )
            // InternalMyDsl.g:1727:2: RULE_EOL
            {
             before(grammarAccess.getRowAccess().getEOLTerminalRuleCall_2()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getEOLTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__2__Impl"


    // $ANTLR start "rule__Cell__Group__0"
    // InternalMyDsl.g:1737:1: rule__Cell__Group__0 : rule__Cell__Group__0__Impl rule__Cell__Group__1 ;
    public final void rule__Cell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1741:1: ( rule__Cell__Group__0__Impl rule__Cell__Group__1 )
            // InternalMyDsl.g:1742:2: rule__Cell__Group__0__Impl rule__Cell__Group__1
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
    // InternalMyDsl.g:1749:1: rule__Cell__Group__0__Impl : ( ( rule__Cell__CellAssignment_0 ) ) ;
    public final void rule__Cell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1753:1: ( ( ( rule__Cell__CellAssignment_0 ) ) )
            // InternalMyDsl.g:1754:1: ( ( rule__Cell__CellAssignment_0 ) )
            {
            // InternalMyDsl.g:1754:1: ( ( rule__Cell__CellAssignment_0 ) )
            // InternalMyDsl.g:1755:2: ( rule__Cell__CellAssignment_0 )
            {
             before(grammarAccess.getCellAccess().getCellAssignment_0()); 
            // InternalMyDsl.g:1756:2: ( rule__Cell__CellAssignment_0 )
            // InternalMyDsl.g:1756:3: rule__Cell__CellAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Cell__CellAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getCellAssignment_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:1764:1: rule__Cell__Group__1 : rule__Cell__Group__1__Impl ;
    public final void rule__Cell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1768:1: ( rule__Cell__Group__1__Impl )
            // InternalMyDsl.g:1769:2: rule__Cell__Group__1__Impl
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
    // InternalMyDsl.g:1775:1: rule__Cell__Group__1__Impl : ( ( rule__Cell__NameAssignment_1 ) ) ;
    public final void rule__Cell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1779:1: ( ( ( rule__Cell__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1780:1: ( ( rule__Cell__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1780:1: ( ( rule__Cell__NameAssignment_1 ) )
            // InternalMyDsl.g:1781:2: ( rule__Cell__NameAssignment_1 )
            {
             before(grammarAccess.getCellAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1782:2: ( rule__Cell__NameAssignment_1 )
            // InternalMyDsl.g:1782:3: rule__Cell__NameAssignment_1
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


    // $ANTLR start "rule__Given__Group__0"
    // InternalMyDsl.g:1791:1: rule__Given__Group__0 : rule__Given__Group__0__Impl rule__Given__Group__1 ;
    public final void rule__Given__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1795:1: ( rule__Given__Group__0__Impl rule__Given__Group__1 )
            // InternalMyDsl.g:1796:2: rule__Given__Group__0__Impl rule__Given__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:1803:1: rule__Given__Group__0__Impl : ( 'Given' ) ;
    public final void rule__Given__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1807:1: ( ( 'Given' ) )
            // InternalMyDsl.g:1808:1: ( 'Given' )
            {
            // InternalMyDsl.g:1808:1: ( 'Given' )
            // InternalMyDsl.g:1809:2: 'Given'
            {
             before(grammarAccess.getGivenAccess().getGivenKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getGivenAccess().getGivenKeyword_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:1818:1: rule__Given__Group__1 : rule__Given__Group__1__Impl rule__Given__Group__2 ;
    public final void rule__Given__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1822:1: ( rule__Given__Group__1__Impl rule__Given__Group__2 )
            // InternalMyDsl.g:1823:2: rule__Given__Group__1__Impl rule__Given__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:1830:1: rule__Given__Group__1__Impl : ( ( rule__Given__NameAssignment_1 ) ) ;
    public final void rule__Given__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1834:1: ( ( ( rule__Given__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1835:1: ( ( rule__Given__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1835:1: ( ( rule__Given__NameAssignment_1 ) )
            // InternalMyDsl.g:1836:2: ( rule__Given__NameAssignment_1 )
            {
             before(grammarAccess.getGivenAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1837:2: ( rule__Given__NameAssignment_1 )
            // InternalMyDsl.g:1837:3: rule__Given__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Given__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGivenAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:1845:1: rule__Given__Group__2 : rule__Given__Group__2__Impl ;
    public final void rule__Given__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1849:1: ( rule__Given__Group__2__Impl )
            // InternalMyDsl.g:1850:2: rule__Given__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Given__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:1856:1: rule__Given__Group__2__Impl : ( ( RULE_EOL )? ) ;
    public final void rule__Given__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1860:1: ( ( ( RULE_EOL )? ) )
            // InternalMyDsl.g:1861:1: ( ( RULE_EOL )? )
            {
            // InternalMyDsl.g:1861:1: ( ( RULE_EOL )? )
            // InternalMyDsl.g:1862:2: ( RULE_EOL )?
            {
             before(grammarAccess.getGivenAccess().getEOLTerminalRuleCall_2()); 
            // InternalMyDsl.g:1863:2: ( RULE_EOL )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_EOL) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1863:3: RULE_EOL
                    {
                    match(input,RULE_EOL,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getGivenAccess().getEOLTerminalRuleCall_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__When__Group__0"
    // InternalMyDsl.g:1872:1: rule__When__Group__0 : rule__When__Group__0__Impl rule__When__Group__1 ;
    public final void rule__When__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1876:1: ( rule__When__Group__0__Impl rule__When__Group__1 )
            // InternalMyDsl.g:1877:2: rule__When__Group__0__Impl rule__When__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:1884:1: rule__When__Group__0__Impl : ( 'When' ) ;
    public final void rule__When__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1888:1: ( ( 'When' ) )
            // InternalMyDsl.g:1889:1: ( 'When' )
            {
            // InternalMyDsl.g:1889:1: ( 'When' )
            // InternalMyDsl.g:1890:2: 'When'
            {
             before(grammarAccess.getWhenAccess().getWhenKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getWhenAccess().getWhenKeyword_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:1899:1: rule__When__Group__1 : rule__When__Group__1__Impl rule__When__Group__2 ;
    public final void rule__When__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1903:1: ( rule__When__Group__1__Impl rule__When__Group__2 )
            // InternalMyDsl.g:1904:2: rule__When__Group__1__Impl rule__When__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:1911:1: rule__When__Group__1__Impl : ( ( rule__When__NameAssignment_1 ) ) ;
    public final void rule__When__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1915:1: ( ( ( rule__When__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1916:1: ( ( rule__When__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1916:1: ( ( rule__When__NameAssignment_1 ) )
            // InternalMyDsl.g:1917:2: ( rule__When__NameAssignment_1 )
            {
             before(grammarAccess.getWhenAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1918:2: ( rule__When__NameAssignment_1 )
            // InternalMyDsl.g:1918:3: rule__When__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__When__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhenAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:1926:1: rule__When__Group__2 : rule__When__Group__2__Impl ;
    public final void rule__When__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1930:1: ( rule__When__Group__2__Impl )
            // InternalMyDsl.g:1931:2: rule__When__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__When__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:1937:1: rule__When__Group__2__Impl : ( ( RULE_EOL )? ) ;
    public final void rule__When__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1941:1: ( ( ( RULE_EOL )? ) )
            // InternalMyDsl.g:1942:1: ( ( RULE_EOL )? )
            {
            // InternalMyDsl.g:1942:1: ( ( RULE_EOL )? )
            // InternalMyDsl.g:1943:2: ( RULE_EOL )?
            {
             before(grammarAccess.getWhenAccess().getEOLTerminalRuleCall_2()); 
            // InternalMyDsl.g:1944:2: ( RULE_EOL )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_EOL) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1944:3: RULE_EOL
                    {
                    match(input,RULE_EOL,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getWhenAccess().getEOLTerminalRuleCall_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Then__Group__0"
    // InternalMyDsl.g:1953:1: rule__Then__Group__0 : rule__Then__Group__0__Impl rule__Then__Group__1 ;
    public final void rule__Then__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1957:1: ( rule__Then__Group__0__Impl rule__Then__Group__1 )
            // InternalMyDsl.g:1958:2: rule__Then__Group__0__Impl rule__Then__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:1965:1: rule__Then__Group__0__Impl : ( 'Then' ) ;
    public final void rule__Then__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1969:1: ( ( 'Then' ) )
            // InternalMyDsl.g:1970:1: ( 'Then' )
            {
            // InternalMyDsl.g:1970:1: ( 'Then' )
            // InternalMyDsl.g:1971:2: 'Then'
            {
             before(grammarAccess.getThenAccess().getThenKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getThenAccess().getThenKeyword_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:1980:1: rule__Then__Group__1 : rule__Then__Group__1__Impl rule__Then__Group__2 ;
    public final void rule__Then__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1984:1: ( rule__Then__Group__1__Impl rule__Then__Group__2 )
            // InternalMyDsl.g:1985:2: rule__Then__Group__1__Impl rule__Then__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:1992:1: rule__Then__Group__1__Impl : ( ( rule__Then__NameAssignment_1 ) ) ;
    public final void rule__Then__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1996:1: ( ( ( rule__Then__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1997:1: ( ( rule__Then__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1997:1: ( ( rule__Then__NameAssignment_1 ) )
            // InternalMyDsl.g:1998:2: ( rule__Then__NameAssignment_1 )
            {
             before(grammarAccess.getThenAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1999:2: ( rule__Then__NameAssignment_1 )
            // InternalMyDsl.g:1999:3: rule__Then__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Then__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getThenAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:2007:1: rule__Then__Group__2 : rule__Then__Group__2__Impl ;
    public final void rule__Then__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2011:1: ( rule__Then__Group__2__Impl )
            // InternalMyDsl.g:2012:2: rule__Then__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Then__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:2018:1: rule__Then__Group__2__Impl : ( ( RULE_EOL )? ) ;
    public final void rule__Then__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2022:1: ( ( ( RULE_EOL )? ) )
            // InternalMyDsl.g:2023:1: ( ( RULE_EOL )? )
            {
            // InternalMyDsl.g:2023:1: ( ( RULE_EOL )? )
            // InternalMyDsl.g:2024:2: ( RULE_EOL )?
            {
             before(grammarAccess.getThenAccess().getEOLTerminalRuleCall_2()); 
            // InternalMyDsl.g:2025:2: ( RULE_EOL )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_EOL) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:2025:3: RULE_EOL
                    {
                    match(input,RULE_EOL,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getThenAccess().getEOLTerminalRuleCall_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__And__Group__0"
    // InternalMyDsl.g:2034:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2038:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalMyDsl.g:2039:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:2046:1: rule__And__Group__0__Impl : ( 'And' ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2050:1: ( ( 'And' ) )
            // InternalMyDsl.g:2051:1: ( 'And' )
            {
            // InternalMyDsl.g:2051:1: ( 'And' )
            // InternalMyDsl.g:2052:2: 'And'
            {
             before(grammarAccess.getAndAccess().getAndKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAndAccess().getAndKeyword_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:2061:1: rule__And__Group__1 : rule__And__Group__1__Impl rule__And__Group__2 ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2065:1: ( rule__And__Group__1__Impl rule__And__Group__2 )
            // InternalMyDsl.g:2066:2: rule__And__Group__1__Impl rule__And__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:2073:1: rule__And__Group__1__Impl : ( ( rule__And__NameAssignment_1 ) ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2077:1: ( ( ( rule__And__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2078:1: ( ( rule__And__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2078:1: ( ( rule__And__NameAssignment_1 ) )
            // InternalMyDsl.g:2079:2: ( rule__And__NameAssignment_1 )
            {
             before(grammarAccess.getAndAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2080:2: ( rule__And__NameAssignment_1 )
            // InternalMyDsl.g:2080:3: rule__And__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__And__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:2088:1: rule__And__Group__2 : rule__And__Group__2__Impl ;
    public final void rule__And__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2092:1: ( rule__And__Group__2__Impl )
            // InternalMyDsl.g:2093:2: rule__And__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:2099:1: rule__And__Group__2__Impl : ( ( RULE_EOL )? ) ;
    public final void rule__And__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2103:1: ( ( ( RULE_EOL )? ) )
            // InternalMyDsl.g:2104:1: ( ( RULE_EOL )? )
            {
            // InternalMyDsl.g:2104:1: ( ( RULE_EOL )? )
            // InternalMyDsl.g:2105:2: ( RULE_EOL )?
            {
             before(grammarAccess.getAndAccess().getEOLTerminalRuleCall_2()); 
            // InternalMyDsl.g:2106:2: ( RULE_EOL )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_EOL) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:2106:3: RULE_EOL
                    {
                    match(input,RULE_EOL,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getAndAccess().getEOLTerminalRuleCall_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__But__Group__0"
    // InternalMyDsl.g:2115:1: rule__But__Group__0 : rule__But__Group__0__Impl rule__But__Group__1 ;
    public final void rule__But__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2119:1: ( rule__But__Group__0__Impl rule__But__Group__1 )
            // InternalMyDsl.g:2120:2: rule__But__Group__0__Impl rule__But__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__But__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__But__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__But__Group__0"


    // $ANTLR start "rule__But__Group__0__Impl"
    // InternalMyDsl.g:2127:1: rule__But__Group__0__Impl : ( 'But' ) ;
    public final void rule__But__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2131:1: ( ( 'But' ) )
            // InternalMyDsl.g:2132:1: ( 'But' )
            {
            // InternalMyDsl.g:2132:1: ( 'But' )
            // InternalMyDsl.g:2133:2: 'But'
            {
             before(grammarAccess.getButAccess().getButKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getButAccess().getButKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__But__Group__0__Impl"


    // $ANTLR start "rule__But__Group__1"
    // InternalMyDsl.g:2142:1: rule__But__Group__1 : rule__But__Group__1__Impl rule__But__Group__2 ;
    public final void rule__But__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2146:1: ( rule__But__Group__1__Impl rule__But__Group__2 )
            // InternalMyDsl.g:2147:2: rule__But__Group__1__Impl rule__But__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__But__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__But__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__But__Group__1"


    // $ANTLR start "rule__But__Group__1__Impl"
    // InternalMyDsl.g:2154:1: rule__But__Group__1__Impl : ( ( rule__But__NameAssignment_1 ) ) ;
    public final void rule__But__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2158:1: ( ( ( rule__But__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2159:1: ( ( rule__But__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2159:1: ( ( rule__But__NameAssignment_1 ) )
            // InternalMyDsl.g:2160:2: ( rule__But__NameAssignment_1 )
            {
             before(grammarAccess.getButAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2161:2: ( rule__But__NameAssignment_1 )
            // InternalMyDsl.g:2161:3: rule__But__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__But__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getButAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__But__Group__1__Impl"


    // $ANTLR start "rule__But__Group__2"
    // InternalMyDsl.g:2169:1: rule__But__Group__2 : rule__But__Group__2__Impl ;
    public final void rule__But__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2173:1: ( rule__But__Group__2__Impl )
            // InternalMyDsl.g:2174:2: rule__But__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__But__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__But__Group__2"


    // $ANTLR start "rule__But__Group__2__Impl"
    // InternalMyDsl.g:2180:1: rule__But__Group__2__Impl : ( ( RULE_EOL )? ) ;
    public final void rule__But__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2184:1: ( ( ( RULE_EOL )? ) )
            // InternalMyDsl.g:2185:1: ( ( RULE_EOL )? )
            {
            // InternalMyDsl.g:2185:1: ( ( RULE_EOL )? )
            // InternalMyDsl.g:2186:2: ( RULE_EOL )?
            {
             before(grammarAccess.getButAccess().getEOLTerminalRuleCall_2()); 
            // InternalMyDsl.g:2187:2: ( RULE_EOL )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_EOL) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:2187:3: RULE_EOL
                    {
                    match(input,RULE_EOL,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getButAccess().getEOLTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__But__Group__2__Impl"


    // $ANTLR start "rule__Asterisk__Group__0"
    // InternalMyDsl.g:2196:1: rule__Asterisk__Group__0 : rule__Asterisk__Group__0__Impl rule__Asterisk__Group__1 ;
    public final void rule__Asterisk__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2200:1: ( rule__Asterisk__Group__0__Impl rule__Asterisk__Group__1 )
            // InternalMyDsl.g:2201:2: rule__Asterisk__Group__0__Impl rule__Asterisk__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Asterisk__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Asterisk__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asterisk__Group__0"


    // $ANTLR start "rule__Asterisk__Group__0__Impl"
    // InternalMyDsl.g:2208:1: rule__Asterisk__Group__0__Impl : ( '*' ) ;
    public final void rule__Asterisk__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2212:1: ( ( '*' ) )
            // InternalMyDsl.g:2213:1: ( '*' )
            {
            // InternalMyDsl.g:2213:1: ( '*' )
            // InternalMyDsl.g:2214:2: '*'
            {
             before(grammarAccess.getAsteriskAccess().getAsteriskKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAsteriskAccess().getAsteriskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asterisk__Group__0__Impl"


    // $ANTLR start "rule__Asterisk__Group__1"
    // InternalMyDsl.g:2223:1: rule__Asterisk__Group__1 : rule__Asterisk__Group__1__Impl rule__Asterisk__Group__2 ;
    public final void rule__Asterisk__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2227:1: ( rule__Asterisk__Group__1__Impl rule__Asterisk__Group__2 )
            // InternalMyDsl.g:2228:2: rule__Asterisk__Group__1__Impl rule__Asterisk__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Asterisk__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Asterisk__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asterisk__Group__1"


    // $ANTLR start "rule__Asterisk__Group__1__Impl"
    // InternalMyDsl.g:2235:1: rule__Asterisk__Group__1__Impl : ( ( rule__Asterisk__NameAssignment_1 ) ) ;
    public final void rule__Asterisk__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2239:1: ( ( ( rule__Asterisk__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2240:1: ( ( rule__Asterisk__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2240:1: ( ( rule__Asterisk__NameAssignment_1 ) )
            // InternalMyDsl.g:2241:2: ( rule__Asterisk__NameAssignment_1 )
            {
             before(grammarAccess.getAsteriskAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2242:2: ( rule__Asterisk__NameAssignment_1 )
            // InternalMyDsl.g:2242:3: rule__Asterisk__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Asterisk__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAsteriskAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asterisk__Group__1__Impl"


    // $ANTLR start "rule__Asterisk__Group__2"
    // InternalMyDsl.g:2250:1: rule__Asterisk__Group__2 : rule__Asterisk__Group__2__Impl ;
    public final void rule__Asterisk__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2254:1: ( rule__Asterisk__Group__2__Impl )
            // InternalMyDsl.g:2255:2: rule__Asterisk__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Asterisk__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asterisk__Group__2"


    // $ANTLR start "rule__Asterisk__Group__2__Impl"
    // InternalMyDsl.g:2261:1: rule__Asterisk__Group__2__Impl : ( ( RULE_EOL )? ) ;
    public final void rule__Asterisk__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2265:1: ( ( ( RULE_EOL )? ) )
            // InternalMyDsl.g:2266:1: ( ( RULE_EOL )? )
            {
            // InternalMyDsl.g:2266:1: ( ( RULE_EOL )? )
            // InternalMyDsl.g:2267:2: ( RULE_EOL )?
            {
             before(grammarAccess.getAsteriskAccess().getEOLTerminalRuleCall_2()); 
            // InternalMyDsl.g:2268:2: ( RULE_EOL )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_EOL) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:2268:3: RULE_EOL
                    {
                    match(input,RULE_EOL,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getAsteriskAccess().getEOLTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asterisk__Group__2__Impl"


    // $ANTLR start "rule__Statement__Group__0"
    // InternalMyDsl.g:2277:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2281:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalMyDsl.g:2282:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
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
    // InternalMyDsl.g:2289:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__NameAssignment_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2293:1: ( ( ( rule__Statement__NameAssignment_0 ) ) )
            // InternalMyDsl.g:2294:1: ( ( rule__Statement__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:2294:1: ( ( rule__Statement__NameAssignment_0 ) )
            // InternalMyDsl.g:2295:2: ( rule__Statement__NameAssignment_0 )
            {
             before(grammarAccess.getStatementAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:2296:2: ( rule__Statement__NameAssignment_0 )
            // InternalMyDsl.g:2296:3: rule__Statement__NameAssignment_0
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
    // InternalMyDsl.g:2304:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2308:1: ( rule__Statement__Group__1__Impl )
            // InternalMyDsl.g:2309:2: rule__Statement__Group__1__Impl
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
    // InternalMyDsl.g:2315:1: rule__Statement__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2319:1: ( ( RULE_EOL ) )
            // InternalMyDsl.g:2320:1: ( RULE_EOL )
            {
            // InternalMyDsl.g:2320:1: ( RULE_EOL )
            // InternalMyDsl.g:2321:2: RULE_EOL
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


    // $ANTLR start "rule__Tag__Group__0"
    // InternalMyDsl.g:2331:1: rule__Tag__Group__0 : rule__Tag__Group__0__Impl rule__Tag__Group__1 ;
    public final void rule__Tag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2335:1: ( rule__Tag__Group__0__Impl rule__Tag__Group__1 )
            // InternalMyDsl.g:2336:2: rule__Tag__Group__0__Impl rule__Tag__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:2343:1: rule__Tag__Group__0__Impl : ( '@' ) ;
    public final void rule__Tag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2347:1: ( ( '@' ) )
            // InternalMyDsl.g:2348:1: ( '@' )
            {
            // InternalMyDsl.g:2348:1: ( '@' )
            // InternalMyDsl.g:2349:2: '@'
            {
             before(grammarAccess.getTagAccess().getCommercialAtKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTagAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:2358:1: rule__Tag__Group__1 : rule__Tag__Group__1__Impl ;
    public final void rule__Tag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2362:1: ( rule__Tag__Group__1__Impl )
            // InternalMyDsl.g:2363:2: rule__Tag__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tag__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:2369:1: rule__Tag__Group__1__Impl : ( ( rule__Tag__NameAssignment_1 ) ) ;
    public final void rule__Tag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2373:1: ( ( ( rule__Tag__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2374:1: ( ( rule__Tag__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2374:1: ( ( rule__Tag__NameAssignment_1 ) )
            // InternalMyDsl.g:2375:2: ( rule__Tag__NameAssignment_1 )
            {
             before(grammarAccess.getTagAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2376:2: ( rule__Tag__NameAssignment_1 )
            // InternalMyDsl.g:2376:3: rule__Tag__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tag__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTagAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Model__TagsAssignment_0_0"
    // InternalMyDsl.g:2385:1: rule__Model__TagsAssignment_0_0 : ( ruleTag ) ;
    public final void rule__Model__TagsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2389:1: ( ( ruleTag ) )
            // InternalMyDsl.g:2390:2: ( ruleTag )
            {
            // InternalMyDsl.g:2390:2: ( ruleTag )
            // InternalMyDsl.g:2391:3: ruleTag
            {
             before(grammarAccess.getModelAccess().getTagsTagParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTagsTagParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TagsAssignment_0_0"


    // $ANTLR start "rule__Model__NameAssignment_2"
    // InternalMyDsl.g:2400:1: rule__Model__NameAssignment_2 : ( rulePhrase ) ;
    public final void rule__Model__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2404:1: ( ( rulePhrase ) )
            // InternalMyDsl.g:2405:2: ( rulePhrase )
            {
            // InternalMyDsl.g:2405:2: ( rulePhrase )
            // InternalMyDsl.g:2406:3: rulePhrase
            {
             before(grammarAccess.getModelAccess().getNamePhraseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNamePhraseParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_2"


    // $ANTLR start "rule__Model__StatementsAssignment_4"
    // InternalMyDsl.g:2415:1: rule__Model__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2419:1: ( ( ruleStatement ) )
            // InternalMyDsl.g:2420:2: ( ruleStatement )
            {
            // InternalMyDsl.g:2420:2: ( ruleStatement )
            // InternalMyDsl.g:2421:3: ruleStatement
            {
             before(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StatementsAssignment_4"


    // $ANTLR start "rule__Model__AbstractScenariosAssignment_5"
    // InternalMyDsl.g:2430:1: rule__Model__AbstractScenariosAssignment_5 : ( ruleAbstractScenario ) ;
    public final void rule__Model__AbstractScenariosAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2434:1: ( ( ruleAbstractScenario ) )
            // InternalMyDsl.g:2435:2: ( ruleAbstractScenario )
            {
            // InternalMyDsl.g:2435:2: ( ruleAbstractScenario )
            // InternalMyDsl.g:2436:3: ruleAbstractScenario
            {
             before(grammarAccess.getModelAccess().getAbstractScenariosAbstractScenarioParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractScenario();

            state._fsp--;

             after(grammarAccess.getModelAccess().getAbstractScenariosAbstractScenarioParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__AbstractScenariosAssignment_5"


    // $ANTLR start "rule__Background__NameAssignment_1"
    // InternalMyDsl.g:2445:1: rule__Background__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__Background__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2449:1: ( ( rulePhrase ) )
            // InternalMyDsl.g:2450:2: ( rulePhrase )
            {
            // InternalMyDsl.g:2450:2: ( rulePhrase )
            // InternalMyDsl.g:2451:3: rulePhrase
            {
             before(grammarAccess.getBackgroundAccess().getNamePhraseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getNamePhraseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__NameAssignment_1"


    // $ANTLR start "rule__Background__StatementsAssignment_3"
    // InternalMyDsl.g:2460:1: rule__Background__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__Background__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2464:1: ( ( ruleStatement ) )
            // InternalMyDsl.g:2465:2: ( ruleStatement )
            {
            // InternalMyDsl.g:2465:2: ( ruleStatement )
            // InternalMyDsl.g:2466:3: ruleStatement
            {
             before(grammarAccess.getBackgroundAccess().getStatementsStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getStatementsStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__StatementsAssignment_3"


    // $ANTLR start "rule__Background__StepsAssignment_4"
    // InternalMyDsl.g:2475:1: rule__Background__StepsAssignment_4 : ( ruleStep ) ;
    public final void rule__Background__StepsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2479:1: ( ( ruleStep ) )
            // InternalMyDsl.g:2480:2: ( ruleStep )
            {
            // InternalMyDsl.g:2480:2: ( ruleStep )
            // InternalMyDsl.g:2481:3: ruleStep
            {
             before(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__StepsAssignment_4"


    // $ANTLR start "rule__Scenario__TagsAssignment_0_0"
    // InternalMyDsl.g:2490:1: rule__Scenario__TagsAssignment_0_0 : ( ruleTag ) ;
    public final void rule__Scenario__TagsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2494:1: ( ( ruleTag ) )
            // InternalMyDsl.g:2495:2: ( ruleTag )
            {
            // InternalMyDsl.g:2495:2: ( ruleTag )
            // InternalMyDsl.g:2496:3: ruleTag
            {
             before(grammarAccess.getScenarioAccess().getTagsTagParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getTagsTagParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__TagsAssignment_0_0"


    // $ANTLR start "rule__Scenario__NameAssignment_2"
    // InternalMyDsl.g:2505:1: rule__Scenario__NameAssignment_2 : ( rulePhrase ) ;
    public final void rule__Scenario__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2509:1: ( ( rulePhrase ) )
            // InternalMyDsl.g:2510:2: ( rulePhrase )
            {
            // InternalMyDsl.g:2510:2: ( rulePhrase )
            // InternalMyDsl.g:2511:3: rulePhrase
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
    // InternalMyDsl.g:2520:1: rule__Scenario__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__Scenario__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2524:1: ( ( ruleStatement ) )
            // InternalMyDsl.g:2525:2: ( ruleStatement )
            {
            // InternalMyDsl.g:2525:2: ( ruleStatement )
            // InternalMyDsl.g:2526:3: ruleStatement
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
    // InternalMyDsl.g:2535:1: rule__Scenario__StepsAssignment_5 : ( ruleStep ) ;
    public final void rule__Scenario__StepsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2539:1: ( ( ruleStep ) )
            // InternalMyDsl.g:2540:2: ( ruleStep )
            {
            // InternalMyDsl.g:2540:2: ( ruleStep )
            // InternalMyDsl.g:2541:3: ruleStep
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


    // $ANTLR start "rule__ScenarioOutline__TagsAssignment_0_0"
    // InternalMyDsl.g:2550:1: rule__ScenarioOutline__TagsAssignment_0_0 : ( ruleTag ) ;
    public final void rule__ScenarioOutline__TagsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2554:1: ( ( ruleTag ) )
            // InternalMyDsl.g:2555:2: ( ruleTag )
            {
            // InternalMyDsl.g:2555:2: ( ruleTag )
            // InternalMyDsl.g:2556:3: ruleTag
            {
             before(grammarAccess.getScenarioOutlineAccess().getTagsTagParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getTagsTagParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__TagsAssignment_0_0"


    // $ANTLR start "rule__ScenarioOutline__NameAssignment_2"
    // InternalMyDsl.g:2565:1: rule__ScenarioOutline__NameAssignment_2 : ( rulePhrase ) ;
    public final void rule__ScenarioOutline__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2569:1: ( ( rulePhrase ) )
            // InternalMyDsl.g:2570:2: ( rulePhrase )
            {
            // InternalMyDsl.g:2570:2: ( rulePhrase )
            // InternalMyDsl.g:2571:3: rulePhrase
            {
             before(grammarAccess.getScenarioOutlineAccess().getNamePhraseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getNamePhraseParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__NameAssignment_2"


    // $ANTLR start "rule__ScenarioOutline__StatementsAssignment_4"
    // InternalMyDsl.g:2580:1: rule__ScenarioOutline__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__ScenarioOutline__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2584:1: ( ( ruleStatement ) )
            // InternalMyDsl.g:2585:2: ( ruleStatement )
            {
            // InternalMyDsl.g:2585:2: ( ruleStatement )
            // InternalMyDsl.g:2586:3: ruleStatement
            {
             before(grammarAccess.getScenarioOutlineAccess().getStatementsStatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getStatementsStatementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__StatementsAssignment_4"


    // $ANTLR start "rule__ScenarioOutline__StepsAssignment_5"
    // InternalMyDsl.g:2595:1: rule__ScenarioOutline__StepsAssignment_5 : ( ruleStep ) ;
    public final void rule__ScenarioOutline__StepsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2599:1: ( ( ruleStep ) )
            // InternalMyDsl.g:2600:2: ( ruleStep )
            {
            // InternalMyDsl.g:2600:2: ( ruleStep )
            // InternalMyDsl.g:2601:3: ruleStep
            {
             before(grammarAccess.getScenarioOutlineAccess().getStepsStepParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getStepsStepParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__StepsAssignment_5"


    // $ANTLR start "rule__ScenarioOutline__ExamplesAssignment_6"
    // InternalMyDsl.g:2610:1: rule__ScenarioOutline__ExamplesAssignment_6 : ( ruleExample ) ;
    public final void rule__ScenarioOutline__ExamplesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2614:1: ( ( ruleExample ) )
            // InternalMyDsl.g:2615:2: ( ruleExample )
            {
            // InternalMyDsl.g:2615:2: ( ruleExample )
            // InternalMyDsl.g:2616:3: ruleExample
            {
             before(grammarAccess.getScenarioOutlineAccess().getExamplesExampleParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExample();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getExamplesExampleParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__ExamplesAssignment_6"


    // $ANTLR start "rule__Example__TagsAssignment_0_0"
    // InternalMyDsl.g:2625:1: rule__Example__TagsAssignment_0_0 : ( ruleTag ) ;
    public final void rule__Example__TagsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2629:1: ( ( ruleTag ) )
            // InternalMyDsl.g:2630:2: ( ruleTag )
            {
            // InternalMyDsl.g:2630:2: ( ruleTag )
            // InternalMyDsl.g:2631:3: ruleTag
            {
             before(grammarAccess.getExampleAccess().getTagsTagParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getTagsTagParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__TagsAssignment_0_0"


    // $ANTLR start "rule__Example__NameAssignment_2"
    // InternalMyDsl.g:2640:1: rule__Example__NameAssignment_2 : ( rulePhrase ) ;
    public final void rule__Example__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2644:1: ( ( rulePhrase ) )
            // InternalMyDsl.g:2645:2: ( rulePhrase )
            {
            // InternalMyDsl.g:2645:2: ( rulePhrase )
            // InternalMyDsl.g:2646:3: rulePhrase
            {
             before(grammarAccess.getExampleAccess().getNamePhraseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getNamePhraseParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__NameAssignment_2"


    // $ANTLR start "rule__Example__StatementsAssignment_4"
    // InternalMyDsl.g:2655:1: rule__Example__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__Example__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2659:1: ( ( ruleStatement ) )
            // InternalMyDsl.g:2660:2: ( ruleStatement )
            {
            // InternalMyDsl.g:2660:2: ( ruleStatement )
            // InternalMyDsl.g:2661:3: ruleStatement
            {
             before(grammarAccess.getExampleAccess().getStatementsStatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getStatementsStatementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__StatementsAssignment_4"


    // $ANTLR start "rule__Example__RowsAssignment_5"
    // InternalMyDsl.g:2670:1: rule__Example__RowsAssignment_5 : ( ruleRow ) ;
    public final void rule__Example__RowsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2674:1: ( ( ruleRow ) )
            // InternalMyDsl.g:2675:2: ( ruleRow )
            {
            // InternalMyDsl.g:2675:2: ( ruleRow )
            // InternalMyDsl.g:2676:3: ruleRow
            {
             before(grammarAccess.getExampleAccess().getRowsRowParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getRowsRowParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__RowsAssignment_5"


    // $ANTLR start "rule__Row__CellsAssignment_0"
    // InternalMyDsl.g:2685:1: rule__Row__CellsAssignment_0 : ( ruleCell ) ;
    public final void rule__Row__CellsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2689:1: ( ( ruleCell ) )
            // InternalMyDsl.g:2690:2: ( ruleCell )
            {
            // InternalMyDsl.g:2690:2: ( ruleCell )
            // InternalMyDsl.g:2691:3: ruleCell
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


    // $ANTLR start "rule__Cell__CellAssignment_0"
    // InternalMyDsl.g:2700:1: rule__Cell__CellAssignment_0 : ( ( '|' ) ) ;
    public final void rule__Cell__CellAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2704:1: ( ( ( '|' ) ) )
            // InternalMyDsl.g:2705:2: ( ( '|' ) )
            {
            // InternalMyDsl.g:2705:2: ( ( '|' ) )
            // InternalMyDsl.g:2706:3: ( '|' )
            {
             before(grammarAccess.getCellAccess().getCellVerticalLineKeyword_0_0()); 
            // InternalMyDsl.g:2707:3: ( '|' )
            // InternalMyDsl.g:2708:4: '|'
            {
             before(grammarAccess.getCellAccess().getCellVerticalLineKeyword_0_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getCellVerticalLineKeyword_0_0()); 

            }

             after(grammarAccess.getCellAccess().getCellVerticalLineKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__CellAssignment_0"


    // $ANTLR start "rule__Cell__NameAssignment_1"
    // InternalMyDsl.g:2719:1: rule__Cell__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__Cell__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2723:1: ( ( rulePhrase ) )
            // InternalMyDsl.g:2724:2: ( rulePhrase )
            {
            // InternalMyDsl.g:2724:2: ( rulePhrase )
            // InternalMyDsl.g:2725:3: rulePhrase
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


    // $ANTLR start "rule__Given__NameAssignment_1"
    // InternalMyDsl.g:2734:1: rule__Given__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__Given__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2738:1: ( ( rulePhrase ) )
            // InternalMyDsl.g:2739:2: ( rulePhrase )
            {
            // InternalMyDsl.g:2739:2: ( rulePhrase )
            // InternalMyDsl.g:2740:3: rulePhrase
            {
             before(grammarAccess.getGivenAccess().getNamePhraseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getGivenAccess().getNamePhraseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Given__NameAssignment_1"


    // $ANTLR start "rule__When__NameAssignment_1"
    // InternalMyDsl.g:2749:1: rule__When__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__When__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2753:1: ( ( rulePhrase ) )
            // InternalMyDsl.g:2754:2: ( rulePhrase )
            {
            // InternalMyDsl.g:2754:2: ( rulePhrase )
            // InternalMyDsl.g:2755:3: rulePhrase
            {
             before(grammarAccess.getWhenAccess().getNamePhraseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getWhenAccess().getNamePhraseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__NameAssignment_1"


    // $ANTLR start "rule__Then__NameAssignment_1"
    // InternalMyDsl.g:2764:1: rule__Then__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__Then__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2768:1: ( ( rulePhrase ) )
            // InternalMyDsl.g:2769:2: ( rulePhrase )
            {
            // InternalMyDsl.g:2769:2: ( rulePhrase )
            // InternalMyDsl.g:2770:3: rulePhrase
            {
             before(grammarAccess.getThenAccess().getNamePhraseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getThenAccess().getNamePhraseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__NameAssignment_1"


    // $ANTLR start "rule__And__NameAssignment_1"
    // InternalMyDsl.g:2779:1: rule__And__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__And__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2783:1: ( ( rulePhrase ) )
            // InternalMyDsl.g:2784:2: ( rulePhrase )
            {
            // InternalMyDsl.g:2784:2: ( rulePhrase )
            // InternalMyDsl.g:2785:3: rulePhrase
            {
             before(grammarAccess.getAndAccess().getNamePhraseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getAndAccess().getNamePhraseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__NameAssignment_1"


    // $ANTLR start "rule__But__NameAssignment_1"
    // InternalMyDsl.g:2794:1: rule__But__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__But__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2798:1: ( ( rulePhrase ) )
            // InternalMyDsl.g:2799:2: ( rulePhrase )
            {
            // InternalMyDsl.g:2799:2: ( rulePhrase )
            // InternalMyDsl.g:2800:3: rulePhrase
            {
             before(grammarAccess.getButAccess().getNamePhraseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getButAccess().getNamePhraseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__But__NameAssignment_1"


    // $ANTLR start "rule__Asterisk__NameAssignment_1"
    // InternalMyDsl.g:2809:1: rule__Asterisk__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__Asterisk__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2813:1: ( ( rulePhrase ) )
            // InternalMyDsl.g:2814:2: ( rulePhrase )
            {
            // InternalMyDsl.g:2814:2: ( rulePhrase )
            // InternalMyDsl.g:2815:3: rulePhrase
            {
             before(grammarAccess.getAsteriskAccess().getNamePhraseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getAsteriskAccess().getNamePhraseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asterisk__NameAssignment_1"


    // $ANTLR start "rule__Statement__NameAssignment_0"
    // InternalMyDsl.g:2824:1: rule__Statement__NameAssignment_0 : ( rulePhrase ) ;
    public final void rule__Statement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2828:1: ( ( rulePhrase ) )
            // InternalMyDsl.g:2829:2: ( rulePhrase )
            {
            // InternalMyDsl.g:2829:2: ( rulePhrase )
            // InternalMyDsl.g:2830:3: rulePhrase
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


    // $ANTLR start "rule__Tag__NameAssignment_1"
    // InternalMyDsl.g:2839:1: rule__Tag__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Tag__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2843:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2844:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2844:2: ( RULE_ID )
            // InternalMyDsl.g:2845:3: RULE_ID
            {
             before(grammarAccess.getTagAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTagAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__NameAssignment_1"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\1\11\1\uffff\1\4\2\uffff\1\5\1\4\1\12\1\5";
    static final String dfa_3s = "\1\24\1\uffff\1\4\2\uffff\1\24\1\4\1\13\1\24";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\2\1\3\4\uffff";
    static final String dfa_5s = "\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\3\1\4\10\uffff\1\2",
            "",
            "\1\5",
            "",
            "",
            "\1\7\16\uffff\1\6",
            "\1\10",
            "\1\3\1\4",
            "\1\7\16\uffff\1\6"
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
            return "509:1: rule__AbstractScenario__Alternatives : ( ( ruleBackground ) | ( ruleScenario ) | ( ruleScenarioOutline ) );";
        }
    }
    static final String dfa_7s = "\10\uffff";
    static final String dfa_8s = "\1\1\7\uffff";
    static final String dfa_9s = "\1\11\1\uffff\1\4\1\uffff\1\5\1\4\1\12\1\5";
    static final String dfa_10s = "\1\24\1\uffff\1\4\1\uffff\1\24\1\4\1\14\1\24";
    static final String dfa_11s = "\1\uffff\1\2\1\uffff\1\1\4\uffff";
    static final String dfa_12s = "\10\uffff}>";
    static final String[] dfa_13s = {
            "\3\1\1\3\7\uffff\1\2",
            "",
            "\1\4",
            "",
            "\1\6\16\uffff\1\5",
            "\1\7",
            "\2\1\1\3",
            "\1\6\16\uffff\1\5"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 1348:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100E10L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100E02L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000FC010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000FC002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100400L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100E00L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000001FD010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000001FD012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000002000L});

}
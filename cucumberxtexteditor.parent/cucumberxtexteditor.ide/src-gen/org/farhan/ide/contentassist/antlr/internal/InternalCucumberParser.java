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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WORD", "RULE_ID", "RULE_STRING", "RULE_EOL", "RULE_WS", "RULE_SL_COMMENT", "'Given'", "'When'", "'Then'", "'And'", "'*'", "'Feature:'", "'Background:'", "'Scenario:'", "'Scenario Outline:'", "'Examples:'", "'|'", "'\"\"\"'", "'@'"
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
    public static final int T__20=20;
    public static final int T__21=21;

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


    // $ANTLR start "entryRuleAbstractScenario"
    // InternalCucumber.g:78:1: entryRuleAbstractScenario : ruleAbstractScenario EOF ;
    public final void entryRuleAbstractScenario() throws RecognitionException {
        try {
            // InternalCucumber.g:79:1: ( ruleAbstractScenario EOF )
            // InternalCucumber.g:80:1: ruleAbstractScenario EOF
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
    // InternalCucumber.g:87:1: ruleAbstractScenario : ( ( rule__AbstractScenario__Alternatives ) ) ;
    public final void ruleAbstractScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:91:2: ( ( ( rule__AbstractScenario__Alternatives ) ) )
            // InternalCucumber.g:92:2: ( ( rule__AbstractScenario__Alternatives ) )
            {
            // InternalCucumber.g:92:2: ( ( rule__AbstractScenario__Alternatives ) )
            // InternalCucumber.g:93:3: ( rule__AbstractScenario__Alternatives )
            {
             before(grammarAccess.getAbstractScenarioAccess().getAlternatives()); 
            // InternalCucumber.g:94:3: ( rule__AbstractScenario__Alternatives )
            // InternalCucumber.g:94:4: rule__AbstractScenario__Alternatives
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
    // InternalCucumber.g:103:1: entryRuleBackground : ruleBackground EOF ;
    public final void entryRuleBackground() throws RecognitionException {
        try {
            // InternalCucumber.g:104:1: ( ruleBackground EOF )
            // InternalCucumber.g:105:1: ruleBackground EOF
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
    // InternalCucumber.g:112:1: ruleBackground : ( ( rule__Background__Group__0 ) ) ;
    public final void ruleBackground() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:116:2: ( ( ( rule__Background__Group__0 ) ) )
            // InternalCucumber.g:117:2: ( ( rule__Background__Group__0 ) )
            {
            // InternalCucumber.g:117:2: ( ( rule__Background__Group__0 ) )
            // InternalCucumber.g:118:3: ( rule__Background__Group__0 )
            {
             before(grammarAccess.getBackgroundAccess().getGroup()); 
            // InternalCucumber.g:119:3: ( rule__Background__Group__0 )
            // InternalCucumber.g:119:4: rule__Background__Group__0
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
    // InternalCucumber.g:128:1: entryRuleScenario : ruleScenario EOF ;
    public final void entryRuleScenario() throws RecognitionException {
        try {
            // InternalCucumber.g:129:1: ( ruleScenario EOF )
            // InternalCucumber.g:130:1: ruleScenario EOF
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
    // InternalCucumber.g:137:1: ruleScenario : ( ( rule__Scenario__Group__0 ) ) ;
    public final void ruleScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:141:2: ( ( ( rule__Scenario__Group__0 ) ) )
            // InternalCucumber.g:142:2: ( ( rule__Scenario__Group__0 ) )
            {
            // InternalCucumber.g:142:2: ( ( rule__Scenario__Group__0 ) )
            // InternalCucumber.g:143:3: ( rule__Scenario__Group__0 )
            {
             before(grammarAccess.getScenarioAccess().getGroup()); 
            // InternalCucumber.g:144:3: ( rule__Scenario__Group__0 )
            // InternalCucumber.g:144:4: rule__Scenario__Group__0
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
    // InternalCucumber.g:153:1: entryRuleScenarioOutline : ruleScenarioOutline EOF ;
    public final void entryRuleScenarioOutline() throws RecognitionException {
        try {
            // InternalCucumber.g:154:1: ( ruleScenarioOutline EOF )
            // InternalCucumber.g:155:1: ruleScenarioOutline EOF
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
    // InternalCucumber.g:162:1: ruleScenarioOutline : ( ( rule__ScenarioOutline__Group__0 ) ) ;
    public final void ruleScenarioOutline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:166:2: ( ( ( rule__ScenarioOutline__Group__0 ) ) )
            // InternalCucumber.g:167:2: ( ( rule__ScenarioOutline__Group__0 ) )
            {
            // InternalCucumber.g:167:2: ( ( rule__ScenarioOutline__Group__0 ) )
            // InternalCucumber.g:168:3: ( rule__ScenarioOutline__Group__0 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getGroup()); 
            // InternalCucumber.g:169:3: ( rule__ScenarioOutline__Group__0 )
            // InternalCucumber.g:169:4: rule__ScenarioOutline__Group__0
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


    // $ANTLR start "entryRuleExamples"
    // InternalCucumber.g:178:1: entryRuleExamples : ruleExamples EOF ;
    public final void entryRuleExamples() throws RecognitionException {
        try {
            // InternalCucumber.g:179:1: ( ruleExamples EOF )
            // InternalCucumber.g:180:1: ruleExamples EOF
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
    // InternalCucumber.g:187:1: ruleExamples : ( ( rule__Examples__Group__0 ) ) ;
    public final void ruleExamples() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:191:2: ( ( ( rule__Examples__Group__0 ) ) )
            // InternalCucumber.g:192:2: ( ( rule__Examples__Group__0 ) )
            {
            // InternalCucumber.g:192:2: ( ( rule__Examples__Group__0 ) )
            // InternalCucumber.g:193:3: ( rule__Examples__Group__0 )
            {
             before(grammarAccess.getExamplesAccess().getGroup()); 
            // InternalCucumber.g:194:3: ( rule__Examples__Group__0 )
            // InternalCucumber.g:194:4: rule__Examples__Group__0
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


    // $ANTLR start "entryRuleExamplesTable"
    // InternalCucumber.g:203:1: entryRuleExamplesTable : ruleExamplesTable EOF ;
    public final void entryRuleExamplesTable() throws RecognitionException {
        try {
            // InternalCucumber.g:204:1: ( ruleExamplesTable EOF )
            // InternalCucumber.g:205:1: ruleExamplesTable EOF
            {
             before(grammarAccess.getExamplesTableRule()); 
            pushFollow(FOLLOW_1);
            ruleExamplesTable();

            state._fsp--;

             after(grammarAccess.getExamplesTableRule()); 
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
    // $ANTLR end "entryRuleExamplesTable"


    // $ANTLR start "ruleExamplesTable"
    // InternalCucumber.g:212:1: ruleExamplesTable : ( ( ( rule__ExamplesTable__RowsAssignment ) ) ( ( rule__ExamplesTable__RowsAssignment )* ) ) ;
    public final void ruleExamplesTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:216:2: ( ( ( ( rule__ExamplesTable__RowsAssignment ) ) ( ( rule__ExamplesTable__RowsAssignment )* ) ) )
            // InternalCucumber.g:217:2: ( ( ( rule__ExamplesTable__RowsAssignment ) ) ( ( rule__ExamplesTable__RowsAssignment )* ) )
            {
            // InternalCucumber.g:217:2: ( ( ( rule__ExamplesTable__RowsAssignment ) ) ( ( rule__ExamplesTable__RowsAssignment )* ) )
            // InternalCucumber.g:218:3: ( ( rule__ExamplesTable__RowsAssignment ) ) ( ( rule__ExamplesTable__RowsAssignment )* )
            {
            // InternalCucumber.g:218:3: ( ( rule__ExamplesTable__RowsAssignment ) )
            // InternalCucumber.g:219:4: ( rule__ExamplesTable__RowsAssignment )
            {
             before(grammarAccess.getExamplesTableAccess().getRowsAssignment()); 
            // InternalCucumber.g:220:4: ( rule__ExamplesTable__RowsAssignment )
            // InternalCucumber.g:220:5: rule__ExamplesTable__RowsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__ExamplesTable__RowsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExamplesTableAccess().getRowsAssignment()); 

            }

            // InternalCucumber.g:223:3: ( ( rule__ExamplesTable__RowsAssignment )* )
            // InternalCucumber.g:224:4: ( rule__ExamplesTable__RowsAssignment )*
            {
             before(grammarAccess.getExamplesTableAccess().getRowsAssignment()); 
            // InternalCucumber.g:225:4: ( rule__ExamplesTable__RowsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCucumber.g:225:5: rule__ExamplesTable__RowsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ExamplesTable__RowsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getExamplesTableAccess().getRowsAssignment()); 

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
    // $ANTLR end "ruleExamplesTable"


    // $ANTLR start "entryRuleStepTable"
    // InternalCucumber.g:235:1: entryRuleStepTable : ruleStepTable EOF ;
    public final void entryRuleStepTable() throws RecognitionException {
        try {
            // InternalCucumber.g:236:1: ( ruleStepTable EOF )
            // InternalCucumber.g:237:1: ruleStepTable EOF
            {
             before(grammarAccess.getStepTableRule()); 
            pushFollow(FOLLOW_1);
            ruleStepTable();

            state._fsp--;

             after(grammarAccess.getStepTableRule()); 
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
    // $ANTLR end "entryRuleStepTable"


    // $ANTLR start "ruleStepTable"
    // InternalCucumber.g:244:1: ruleStepTable : ( ( ( rule__StepTable__RowsAssignment ) ) ( ( rule__StepTable__RowsAssignment )* ) ) ;
    public final void ruleStepTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:248:2: ( ( ( ( rule__StepTable__RowsAssignment ) ) ( ( rule__StepTable__RowsAssignment )* ) ) )
            // InternalCucumber.g:249:2: ( ( ( rule__StepTable__RowsAssignment ) ) ( ( rule__StepTable__RowsAssignment )* ) )
            {
            // InternalCucumber.g:249:2: ( ( ( rule__StepTable__RowsAssignment ) ) ( ( rule__StepTable__RowsAssignment )* ) )
            // InternalCucumber.g:250:3: ( ( rule__StepTable__RowsAssignment ) ) ( ( rule__StepTable__RowsAssignment )* )
            {
            // InternalCucumber.g:250:3: ( ( rule__StepTable__RowsAssignment ) )
            // InternalCucumber.g:251:4: ( rule__StepTable__RowsAssignment )
            {
             before(grammarAccess.getStepTableAccess().getRowsAssignment()); 
            // InternalCucumber.g:252:4: ( rule__StepTable__RowsAssignment )
            // InternalCucumber.g:252:5: rule__StepTable__RowsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__StepTable__RowsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStepTableAccess().getRowsAssignment()); 

            }

            // InternalCucumber.g:255:3: ( ( rule__StepTable__RowsAssignment )* )
            // InternalCucumber.g:256:4: ( rule__StepTable__RowsAssignment )*
            {
             before(grammarAccess.getStepTableAccess().getRowsAssignment()); 
            // InternalCucumber.g:257:4: ( rule__StepTable__RowsAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCucumber.g:257:5: rule__StepTable__RowsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__StepTable__RowsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getStepTableAccess().getRowsAssignment()); 

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
    // $ANTLR end "ruleStepTable"


    // $ANTLR start "entryRuleRow"
    // InternalCucumber.g:267:1: entryRuleRow : ruleRow EOF ;
    public final void entryRuleRow() throws RecognitionException {
        try {
            // InternalCucumber.g:268:1: ( ruleRow EOF )
            // InternalCucumber.g:269:1: ruleRow EOF
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
    // InternalCucumber.g:276:1: ruleRow : ( ( rule__Row__Group__0 ) ) ;
    public final void ruleRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:280:2: ( ( ( rule__Row__Group__0 ) ) )
            // InternalCucumber.g:281:2: ( ( rule__Row__Group__0 ) )
            {
            // InternalCucumber.g:281:2: ( ( rule__Row__Group__0 ) )
            // InternalCucumber.g:282:3: ( rule__Row__Group__0 )
            {
             before(grammarAccess.getRowAccess().getGroup()); 
            // InternalCucumber.g:283:3: ( rule__Row__Group__0 )
            // InternalCucumber.g:283:4: rule__Row__Group__0
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
    // InternalCucumber.g:292:1: entryRuleCell : ruleCell EOF ;
    public final void entryRuleCell() throws RecognitionException {
        try {
            // InternalCucumber.g:293:1: ( ruleCell EOF )
            // InternalCucumber.g:294:1: ruleCell EOF
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
    // InternalCucumber.g:301:1: ruleCell : ( ( rule__Cell__Group__0 ) ) ;
    public final void ruleCell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:305:2: ( ( ( rule__Cell__Group__0 ) ) )
            // InternalCucumber.g:306:2: ( ( rule__Cell__Group__0 ) )
            {
            // InternalCucumber.g:306:2: ( ( rule__Cell__Group__0 ) )
            // InternalCucumber.g:307:3: ( rule__Cell__Group__0 )
            {
             before(grammarAccess.getCellAccess().getGroup()); 
            // InternalCucumber.g:308:3: ( rule__Cell__Group__0 )
            // InternalCucumber.g:308:4: rule__Cell__Group__0
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
    // InternalCucumber.g:317:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalCucumber.g:318:1: ( ruleStep EOF )
            // InternalCucumber.g:319:1: ruleStep EOF
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
    // InternalCucumber.g:326:1: ruleStep : ( ( rule__Step__Group__0 ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:330:2: ( ( ( rule__Step__Group__0 ) ) )
            // InternalCucumber.g:331:2: ( ( rule__Step__Group__0 ) )
            {
            // InternalCucumber.g:331:2: ( ( rule__Step__Group__0 ) )
            // InternalCucumber.g:332:3: ( rule__Step__Group__0 )
            {
             before(grammarAccess.getStepAccess().getGroup()); 
            // InternalCucumber.g:333:3: ( rule__Step__Group__0 )
            // InternalCucumber.g:333:4: rule__Step__Group__0
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


    // $ANTLR start "entryRuleDocString"
    // InternalCucumber.g:342:1: entryRuleDocString : ruleDocString EOF ;
    public final void entryRuleDocString() throws RecognitionException {
        try {
            // InternalCucumber.g:343:1: ( ruleDocString EOF )
            // InternalCucumber.g:344:1: ruleDocString EOF
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
    // InternalCucumber.g:351:1: ruleDocString : ( ( rule__DocString__Group__0 ) ) ;
    public final void ruleDocString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:355:2: ( ( ( rule__DocString__Group__0 ) ) )
            // InternalCucumber.g:356:2: ( ( rule__DocString__Group__0 ) )
            {
            // InternalCucumber.g:356:2: ( ( rule__DocString__Group__0 ) )
            // InternalCucumber.g:357:3: ( rule__DocString__Group__0 )
            {
             before(grammarAccess.getDocStringAccess().getGroup()); 
            // InternalCucumber.g:358:3: ( rule__DocString__Group__0 )
            // InternalCucumber.g:358:4: rule__DocString__Group__0
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


    // $ANTLR start "entryRuleStatement"
    // InternalCucumber.g:367:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalCucumber.g:368:1: ( ruleStatement EOF )
            // InternalCucumber.g:369:1: ruleStatement EOF
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
    // InternalCucumber.g:376:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:380:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalCucumber.g:381:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalCucumber.g:381:2: ( ( rule__Statement__Group__0 ) )
            // InternalCucumber.g:382:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalCucumber.g:383:3: ( rule__Statement__Group__0 )
            // InternalCucumber.g:383:4: rule__Statement__Group__0
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
    // InternalCucumber.g:392:1: entryRulePhrase : rulePhrase EOF ;
    public final void entryRulePhrase() throws RecognitionException {
        try {
            // InternalCucumber.g:393:1: ( rulePhrase EOF )
            // InternalCucumber.g:394:1: rulePhrase EOF
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
    // InternalCucumber.g:401:1: rulePhrase : ( ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* ) ) ;
    public final void rulePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:405:2: ( ( ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* ) ) )
            // InternalCucumber.g:406:2: ( ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* ) )
            {
            // InternalCucumber.g:406:2: ( ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* ) )
            // InternalCucumber.g:407:3: ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* )
            {
            // InternalCucumber.g:407:3: ( ( ruleTEXT_LITERAL ) )
            // InternalCucumber.g:408:4: ( ruleTEXT_LITERAL )
            {
             before(grammarAccess.getPhraseAccess().getTEXT_LITERALParserRuleCall()); 
            // InternalCucumber.g:409:4: ( ruleTEXT_LITERAL )
            // InternalCucumber.g:409:5: ruleTEXT_LITERAL
            {
            pushFollow(FOLLOW_4);
            ruleTEXT_LITERAL();

            state._fsp--;


            }

             after(grammarAccess.getPhraseAccess().getTEXT_LITERALParserRuleCall()); 

            }

            // InternalCucumber.g:412:3: ( ( ruleTEXT_LITERAL )* )
            // InternalCucumber.g:413:4: ( ruleTEXT_LITERAL )*
            {
             before(grammarAccess.getPhraseAccess().getTEXT_LITERALParserRuleCall()); 
            // InternalCucumber.g:414:4: ( ruleTEXT_LITERAL )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_WORD && LA3_0<=RULE_STRING)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCucumber.g:414:5: ruleTEXT_LITERAL
            	    {
            	    pushFollow(FOLLOW_4);
            	    ruleTEXT_LITERAL();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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


    // $ANTLR start "entryRuleTag"
    // InternalCucumber.g:424:1: entryRuleTag : ruleTag EOF ;
    public final void entryRuleTag() throws RecognitionException {
        try {
            // InternalCucumber.g:425:1: ( ruleTag EOF )
            // InternalCucumber.g:426:1: ruleTag EOF
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
    // InternalCucumber.g:433:1: ruleTag : ( ( rule__Tag__Group__0 ) ) ;
    public final void ruleTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:437:2: ( ( ( rule__Tag__Group__0 ) ) )
            // InternalCucumber.g:438:2: ( ( rule__Tag__Group__0 ) )
            {
            // InternalCucumber.g:438:2: ( ( rule__Tag__Group__0 ) )
            // InternalCucumber.g:439:3: ( rule__Tag__Group__0 )
            {
             before(grammarAccess.getTagAccess().getGroup()); 
            // InternalCucumber.g:440:3: ( rule__Tag__Group__0 )
            // InternalCucumber.g:440:4: rule__Tag__Group__0
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


    // $ANTLR start "entryRuleLine"
    // InternalCucumber.g:449:1: entryRuleLine : ruleLine EOF ;
    public final void entryRuleLine() throws RecognitionException {
        try {
            // InternalCucumber.g:450:1: ( ruleLine EOF )
            // InternalCucumber.g:451:1: ruleLine EOF
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
    // InternalCucumber.g:458:1: ruleLine : ( ( rule__Line__Group__0 ) ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:462:2: ( ( ( rule__Line__Group__0 ) ) )
            // InternalCucumber.g:463:2: ( ( rule__Line__Group__0 ) )
            {
            // InternalCucumber.g:463:2: ( ( rule__Line__Group__0 ) )
            // InternalCucumber.g:464:3: ( rule__Line__Group__0 )
            {
             before(grammarAccess.getLineAccess().getGroup()); 
            // InternalCucumber.g:465:3: ( rule__Line__Group__0 )
            // InternalCucumber.g:465:4: rule__Line__Group__0
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
    // InternalCucumber.g:474:1: entryRuleLineBits : ruleLineBits EOF ;
    public final void entryRuleLineBits() throws RecognitionException {
        try {
            // InternalCucumber.g:475:1: ( ruleLineBits EOF )
            // InternalCucumber.g:476:1: ruleLineBits EOF
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
    // InternalCucumber.g:483:1: ruleLineBits : ( ( ruleTEXT_LITERAL )* ) ;
    public final void ruleLineBits() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:487:2: ( ( ( ruleTEXT_LITERAL )* ) )
            // InternalCucumber.g:488:2: ( ( ruleTEXT_LITERAL )* )
            {
            // InternalCucumber.g:488:2: ( ( ruleTEXT_LITERAL )* )
            // InternalCucumber.g:489:3: ( ruleTEXT_LITERAL )*
            {
             before(grammarAccess.getLineBitsAccess().getTEXT_LITERALParserRuleCall()); 
            // InternalCucumber.g:490:3: ( ruleTEXT_LITERAL )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_WORD && LA4_0<=RULE_STRING)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCucumber.g:490:4: ruleTEXT_LITERAL
            	    {
            	    pushFollow(FOLLOW_4);
            	    ruleTEXT_LITERAL();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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


    // $ANTLR start "entryRuleTEXT_LITERAL"
    // InternalCucumber.g:499:1: entryRuleTEXT_LITERAL : ruleTEXT_LITERAL EOF ;
    public final void entryRuleTEXT_LITERAL() throws RecognitionException {
        try {
            // InternalCucumber.g:500:1: ( ruleTEXT_LITERAL EOF )
            // InternalCucumber.g:501:1: ruleTEXT_LITERAL EOF
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
    // InternalCucumber.g:508:1: ruleTEXT_LITERAL : ( ( rule__TEXT_LITERAL__Alternatives ) ) ;
    public final void ruleTEXT_LITERAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:512:2: ( ( ( rule__TEXT_LITERAL__Alternatives ) ) )
            // InternalCucumber.g:513:2: ( ( rule__TEXT_LITERAL__Alternatives ) )
            {
            // InternalCucumber.g:513:2: ( ( rule__TEXT_LITERAL__Alternatives ) )
            // InternalCucumber.g:514:3: ( rule__TEXT_LITERAL__Alternatives )
            {
             before(grammarAccess.getTEXT_LITERALAccess().getAlternatives()); 
            // InternalCucumber.g:515:3: ( rule__TEXT_LITERAL__Alternatives )
            // InternalCucumber.g:515:4: rule__TEXT_LITERAL__Alternatives
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


    // $ANTLR start "rule__AbstractScenario__Alternatives"
    // InternalCucumber.g:523:1: rule__AbstractScenario__Alternatives : ( ( ruleBackground ) | ( ruleScenario ) | ( ruleScenarioOutline ) );
    public final void rule__AbstractScenario__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:527:1: ( ( ruleBackground ) | ( ruleScenario ) | ( ruleScenarioOutline ) )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalCucumber.g:528:2: ( ruleBackground )
                    {
                    // InternalCucumber.g:528:2: ( ruleBackground )
                    // InternalCucumber.g:529:3: ruleBackground
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
                    // InternalCucumber.g:534:2: ( ruleScenario )
                    {
                    // InternalCucumber.g:534:2: ( ruleScenario )
                    // InternalCucumber.g:535:3: ruleScenario
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
                    // InternalCucumber.g:540:2: ( ruleScenarioOutline )
                    {
                    // InternalCucumber.g:540:2: ( ruleScenarioOutline )
                    // InternalCucumber.g:541:3: ruleScenarioOutline
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


    // $ANTLR start "rule__Step__Alternatives_0"
    // InternalCucumber.g:550:1: rule__Step__Alternatives_0 : ( ( 'Given' ) | ( 'When' ) | ( 'Then' ) | ( 'And' ) | ( '*' ) );
    public final void rule__Step__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:554:1: ( ( 'Given' ) | ( 'When' ) | ( 'Then' ) | ( 'And' ) | ( '*' ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 10:
                {
                alt6=1;
                }
                break;
            case 11:
                {
                alt6=2;
                }
                break;
            case 12:
                {
                alt6=3;
                }
                break;
            case 13:
                {
                alt6=4;
                }
                break;
            case 14:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalCucumber.g:555:2: ( 'Given' )
                    {
                    // InternalCucumber.g:555:2: ( 'Given' )
                    // InternalCucumber.g:556:3: 'Given'
                    {
                     before(grammarAccess.getStepAccess().getGivenKeyword_0_0()); 
                    match(input,10,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getGivenKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:561:2: ( 'When' )
                    {
                    // InternalCucumber.g:561:2: ( 'When' )
                    // InternalCucumber.g:562:3: 'When'
                    {
                     before(grammarAccess.getStepAccess().getWhenKeyword_0_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getWhenKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCucumber.g:567:2: ( 'Then' )
                    {
                    // InternalCucumber.g:567:2: ( 'Then' )
                    // InternalCucumber.g:568:3: 'Then'
                    {
                     before(grammarAccess.getStepAccess().getThenKeyword_0_2()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getThenKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCucumber.g:573:2: ( 'And' )
                    {
                    // InternalCucumber.g:573:2: ( 'And' )
                    // InternalCucumber.g:574:3: 'And'
                    {
                     before(grammarAccess.getStepAccess().getAndKeyword_0_3()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getAndKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCucumber.g:579:2: ( '*' )
                    {
                    // InternalCucumber.g:579:2: ( '*' )
                    // InternalCucumber.g:580:3: '*'
                    {
                     before(grammarAccess.getStepAccess().getAsteriskKeyword_0_4()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getAsteriskKeyword_0_4()); 

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
    // $ANTLR end "rule__Step__Alternatives_0"


    // $ANTLR start "rule__Step__Alternatives_3"
    // InternalCucumber.g:589:1: rule__Step__Alternatives_3 : ( ( ( rule__Step__TheStepTableAssignment_3_0 ) ) | ( ( rule__Step__TheDocStringAssignment_3_1 ) ) );
    public final void rule__Step__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:593:1: ( ( ( rule__Step__TheStepTableAssignment_3_0 ) ) | ( ( rule__Step__TheDocStringAssignment_3_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
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
                    // InternalCucumber.g:594:2: ( ( rule__Step__TheStepTableAssignment_3_0 ) )
                    {
                    // InternalCucumber.g:594:2: ( ( rule__Step__TheStepTableAssignment_3_0 ) )
                    // InternalCucumber.g:595:3: ( rule__Step__TheStepTableAssignment_3_0 )
                    {
                     before(grammarAccess.getStepAccess().getTheStepTableAssignment_3_0()); 
                    // InternalCucumber.g:596:3: ( rule__Step__TheStepTableAssignment_3_0 )
                    // InternalCucumber.g:596:4: rule__Step__TheStepTableAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Step__TheStepTableAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStepAccess().getTheStepTableAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:600:2: ( ( rule__Step__TheDocStringAssignment_3_1 ) )
                    {
                    // InternalCucumber.g:600:2: ( ( rule__Step__TheDocStringAssignment_3_1 ) )
                    // InternalCucumber.g:601:3: ( rule__Step__TheDocStringAssignment_3_1 )
                    {
                     before(grammarAccess.getStepAccess().getTheDocStringAssignment_3_1()); 
                    // InternalCucumber.g:602:3: ( rule__Step__TheDocStringAssignment_3_1 )
                    // InternalCucumber.g:602:4: rule__Step__TheDocStringAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Step__TheDocStringAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStepAccess().getTheDocStringAssignment_3_1()); 

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
    // $ANTLR end "rule__Step__Alternatives_3"


    // $ANTLR start "rule__TEXT_LITERAL__Alternatives"
    // InternalCucumber.g:610:1: rule__TEXT_LITERAL__Alternatives : ( ( RULE_WORD ) | ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__TEXT_LITERAL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:614:1: ( ( RULE_WORD ) | ( RULE_ID ) | ( RULE_STRING ) )
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
                    // InternalCucumber.g:615:2: ( RULE_WORD )
                    {
                    // InternalCucumber.g:615:2: ( RULE_WORD )
                    // InternalCucumber.g:616:3: RULE_WORD
                    {
                     before(grammarAccess.getTEXT_LITERALAccess().getWORDTerminalRuleCall_0()); 
                    match(input,RULE_WORD,FOLLOW_2); 
                     after(grammarAccess.getTEXT_LITERALAccess().getWORDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:621:2: ( RULE_ID )
                    {
                    // InternalCucumber.g:621:2: ( RULE_ID )
                    // InternalCucumber.g:622:3: RULE_ID
                    {
                     before(grammarAccess.getTEXT_LITERALAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getTEXT_LITERALAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCucumber.g:627:2: ( RULE_STRING )
                    {
                    // InternalCucumber.g:627:2: ( RULE_STRING )
                    // InternalCucumber.g:628:3: RULE_STRING
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
    // InternalCucumber.g:637:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:641:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalCucumber.g:642:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
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
    // InternalCucumber.g:649:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__Group_0__0 )? ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:653:1: ( ( ( rule__Feature__Group_0__0 )? ) )
            // InternalCucumber.g:654:1: ( ( rule__Feature__Group_0__0 )? )
            {
            // InternalCucumber.g:654:1: ( ( rule__Feature__Group_0__0 )? )
            // InternalCucumber.g:655:2: ( rule__Feature__Group_0__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_0()); 
            // InternalCucumber.g:656:2: ( rule__Feature__Group_0__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCucumber.g:656:3: rule__Feature__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getGroup_0()); 

            }


            }

        }
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
    // InternalCucumber.g:664:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:668:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalCucumber.g:669:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
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
    // InternalCucumber.g:676:1: rule__Feature__Group__1__Impl : ( 'Feature:' ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:680:1: ( ( 'Feature:' ) )
            // InternalCucumber.g:681:1: ( 'Feature:' )
            {
            // InternalCucumber.g:681:1: ( 'Feature:' )
            // InternalCucumber.g:682:2: 'Feature:'
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
    // InternalCucumber.g:691:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:695:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalCucumber.g:696:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
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
    // InternalCucumber.g:703:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__NameAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:707:1: ( ( ( rule__Feature__NameAssignment_2 ) ) )
            // InternalCucumber.g:708:1: ( ( rule__Feature__NameAssignment_2 ) )
            {
            // InternalCucumber.g:708:1: ( ( rule__Feature__NameAssignment_2 ) )
            // InternalCucumber.g:709:2: ( rule__Feature__NameAssignment_2 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_2()); 
            // InternalCucumber.g:710:2: ( rule__Feature__NameAssignment_2 )
            // InternalCucumber.g:710:3: rule__Feature__NameAssignment_2
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
    // InternalCucumber.g:718:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:722:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalCucumber.g:723:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
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
    // InternalCucumber.g:730:1: rule__Feature__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:734:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:735:1: ( RULE_EOL )
            {
            // InternalCucumber.g:735:1: ( RULE_EOL )
            // InternalCucumber.g:736:2: RULE_EOL
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
    // InternalCucumber.g:745:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl rule__Feature__Group__5 ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:749:1: ( rule__Feature__Group__4__Impl rule__Feature__Group__5 )
            // InternalCucumber.g:750:2: rule__Feature__Group__4__Impl rule__Feature__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalCucumber.g:757:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__StatementsAssignment_4 )* ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:761:1: ( ( ( rule__Feature__StatementsAssignment_4 )* ) )
            // InternalCucumber.g:762:1: ( ( rule__Feature__StatementsAssignment_4 )* )
            {
            // InternalCucumber.g:762:1: ( ( rule__Feature__StatementsAssignment_4 )* )
            // InternalCucumber.g:763:2: ( rule__Feature__StatementsAssignment_4 )*
            {
             before(grammarAccess.getFeatureAccess().getStatementsAssignment_4()); 
            // InternalCucumber.g:764:2: ( rule__Feature__StatementsAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_WORD && LA10_0<=RULE_STRING)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCucumber.g:764:3: rule__Feature__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_4);
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
    // InternalCucumber.g:772:1: rule__Feature__Group__5 : rule__Feature__Group__5__Impl ;
    public final void rule__Feature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:776:1: ( rule__Feature__Group__5__Impl )
            // InternalCucumber.g:777:2: rule__Feature__Group__5__Impl
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
    // InternalCucumber.g:783:1: rule__Feature__Group__5__Impl : ( ( rule__Feature__AbstractScenariosAssignment_5 )* ) ;
    public final void rule__Feature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:787:1: ( ( ( rule__Feature__AbstractScenariosAssignment_5 )* ) )
            // InternalCucumber.g:788:1: ( ( rule__Feature__AbstractScenariosAssignment_5 )* )
            {
            // InternalCucumber.g:788:1: ( ( rule__Feature__AbstractScenariosAssignment_5 )* )
            // InternalCucumber.g:789:2: ( rule__Feature__AbstractScenariosAssignment_5 )*
            {
             before(grammarAccess.getFeatureAccess().getAbstractScenariosAssignment_5()); 
            // InternalCucumber.g:790:2: ( rule__Feature__AbstractScenariosAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=16 && LA11_0<=18)||LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCucumber.g:790:3: rule__Feature__AbstractScenariosAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Feature__AbstractScenariosAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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


    // $ANTLR start "rule__Feature__Group_0__0"
    // InternalCucumber.g:799:1: rule__Feature__Group_0__0 : rule__Feature__Group_0__0__Impl rule__Feature__Group_0__1 ;
    public final void rule__Feature__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:803:1: ( rule__Feature__Group_0__0__Impl rule__Feature__Group_0__1 )
            // InternalCucumber.g:804:2: rule__Feature__Group_0__0__Impl rule__Feature__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Feature__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_0__0"


    // $ANTLR start "rule__Feature__Group_0__0__Impl"
    // InternalCucumber.g:811:1: rule__Feature__Group_0__0__Impl : ( ( ( rule__Feature__TagsAssignment_0_0 ) ) ( ( rule__Feature__TagsAssignment_0_0 )* ) ) ;
    public final void rule__Feature__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:815:1: ( ( ( ( rule__Feature__TagsAssignment_0_0 ) ) ( ( rule__Feature__TagsAssignment_0_0 )* ) ) )
            // InternalCucumber.g:816:1: ( ( ( rule__Feature__TagsAssignment_0_0 ) ) ( ( rule__Feature__TagsAssignment_0_0 )* ) )
            {
            // InternalCucumber.g:816:1: ( ( ( rule__Feature__TagsAssignment_0_0 ) ) ( ( rule__Feature__TagsAssignment_0_0 )* ) )
            // InternalCucumber.g:817:2: ( ( rule__Feature__TagsAssignment_0_0 ) ) ( ( rule__Feature__TagsAssignment_0_0 )* )
            {
            // InternalCucumber.g:817:2: ( ( rule__Feature__TagsAssignment_0_0 ) )
            // InternalCucumber.g:818:3: ( rule__Feature__TagsAssignment_0_0 )
            {
             before(grammarAccess.getFeatureAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:819:3: ( rule__Feature__TagsAssignment_0_0 )
            // InternalCucumber.g:819:4: rule__Feature__TagsAssignment_0_0
            {
            pushFollow(FOLLOW_10);
            rule__Feature__TagsAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTagsAssignment_0_0()); 

            }

            // InternalCucumber.g:822:2: ( ( rule__Feature__TagsAssignment_0_0 )* )
            // InternalCucumber.g:823:3: ( rule__Feature__TagsAssignment_0_0 )*
            {
             before(grammarAccess.getFeatureAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:824:3: ( rule__Feature__TagsAssignment_0_0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCucumber.g:824:4: rule__Feature__TagsAssignment_0_0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Feature__TagsAssignment_0_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getTagsAssignment_0_0()); 

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
    // $ANTLR end "rule__Feature__Group_0__0__Impl"


    // $ANTLR start "rule__Feature__Group_0__1"
    // InternalCucumber.g:833:1: rule__Feature__Group_0__1 : rule__Feature__Group_0__1__Impl ;
    public final void rule__Feature__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:837:1: ( rule__Feature__Group_0__1__Impl )
            // InternalCucumber.g:838:2: rule__Feature__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_0__1"


    // $ANTLR start "rule__Feature__Group_0__1__Impl"
    // InternalCucumber.g:844:1: rule__Feature__Group_0__1__Impl : ( RULE_EOL ) ;
    public final void rule__Feature__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:848:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:849:1: ( RULE_EOL )
            {
            // InternalCucumber.g:849:1: ( RULE_EOL )
            // InternalCucumber.g:850:2: RULE_EOL
            {
             before(grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_0_1()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_0__1__Impl"


    // $ANTLR start "rule__Background__Group__0"
    // InternalCucumber.g:860:1: rule__Background__Group__0 : rule__Background__Group__0__Impl rule__Background__Group__1 ;
    public final void rule__Background__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:864:1: ( rule__Background__Group__0__Impl rule__Background__Group__1 )
            // InternalCucumber.g:865:2: rule__Background__Group__0__Impl rule__Background__Group__1
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
    // InternalCucumber.g:872:1: rule__Background__Group__0__Impl : ( 'Background:' ) ;
    public final void rule__Background__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:876:1: ( ( 'Background:' ) )
            // InternalCucumber.g:877:1: ( 'Background:' )
            {
            // InternalCucumber.g:877:1: ( 'Background:' )
            // InternalCucumber.g:878:2: 'Background:'
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
    // InternalCucumber.g:887:1: rule__Background__Group__1 : rule__Background__Group__1__Impl rule__Background__Group__2 ;
    public final void rule__Background__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:891:1: ( rule__Background__Group__1__Impl rule__Background__Group__2 )
            // InternalCucumber.g:892:2: rule__Background__Group__1__Impl rule__Background__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalCucumber.g:899:1: rule__Background__Group__1__Impl : ( ( rule__Background__NameAssignment_1 ) ) ;
    public final void rule__Background__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:903:1: ( ( ( rule__Background__NameAssignment_1 ) ) )
            // InternalCucumber.g:904:1: ( ( rule__Background__NameAssignment_1 ) )
            {
            // InternalCucumber.g:904:1: ( ( rule__Background__NameAssignment_1 ) )
            // InternalCucumber.g:905:2: ( rule__Background__NameAssignment_1 )
            {
             before(grammarAccess.getBackgroundAccess().getNameAssignment_1()); 
            // InternalCucumber.g:906:2: ( rule__Background__NameAssignment_1 )
            // InternalCucumber.g:906:3: rule__Background__NameAssignment_1
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
    // InternalCucumber.g:914:1: rule__Background__Group__2 : rule__Background__Group__2__Impl rule__Background__Group__3 ;
    public final void rule__Background__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:918:1: ( rule__Background__Group__2__Impl rule__Background__Group__3 )
            // InternalCucumber.g:919:2: rule__Background__Group__2__Impl rule__Background__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalCucumber.g:926:1: rule__Background__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__Background__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:930:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:931:1: ( RULE_EOL )
            {
            // InternalCucumber.g:931:1: ( RULE_EOL )
            // InternalCucumber.g:932:2: RULE_EOL
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
    // InternalCucumber.g:941:1: rule__Background__Group__3 : rule__Background__Group__3__Impl rule__Background__Group__4 ;
    public final void rule__Background__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:945:1: ( rule__Background__Group__3__Impl rule__Background__Group__4 )
            // InternalCucumber.g:946:2: rule__Background__Group__3__Impl rule__Background__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalCucumber.g:953:1: rule__Background__Group__3__Impl : ( ( rule__Background__StatementsAssignment_3 )* ) ;
    public final void rule__Background__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:957:1: ( ( ( rule__Background__StatementsAssignment_3 )* ) )
            // InternalCucumber.g:958:1: ( ( rule__Background__StatementsAssignment_3 )* )
            {
            // InternalCucumber.g:958:1: ( ( rule__Background__StatementsAssignment_3 )* )
            // InternalCucumber.g:959:2: ( rule__Background__StatementsAssignment_3 )*
            {
             before(grammarAccess.getBackgroundAccess().getStatementsAssignment_3()); 
            // InternalCucumber.g:960:2: ( rule__Background__StatementsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_WORD && LA13_0<=RULE_STRING)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCucumber.g:960:3: rule__Background__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Background__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalCucumber.g:968:1: rule__Background__Group__4 : rule__Background__Group__4__Impl ;
    public final void rule__Background__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:972:1: ( rule__Background__Group__4__Impl )
            // InternalCucumber.g:973:2: rule__Background__Group__4__Impl
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
    // InternalCucumber.g:979:1: rule__Background__Group__4__Impl : ( ( rule__Background__StepsAssignment_4 )* ) ;
    public final void rule__Background__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:983:1: ( ( ( rule__Background__StepsAssignment_4 )* ) )
            // InternalCucumber.g:984:1: ( ( rule__Background__StepsAssignment_4 )* )
            {
            // InternalCucumber.g:984:1: ( ( rule__Background__StepsAssignment_4 )* )
            // InternalCucumber.g:985:2: ( rule__Background__StepsAssignment_4 )*
            {
             before(grammarAccess.getBackgroundAccess().getStepsAssignment_4()); 
            // InternalCucumber.g:986:2: ( rule__Background__StepsAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=10 && LA14_0<=14)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCucumber.g:986:3: rule__Background__StepsAssignment_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Background__StepsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalCucumber.g:995:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:999:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalCucumber.g:1000:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalCucumber.g:1007:1: rule__Scenario__Group__0__Impl : ( ( rule__Scenario__Group_0__0 )? ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1011:1: ( ( ( rule__Scenario__Group_0__0 )? ) )
            // InternalCucumber.g:1012:1: ( ( rule__Scenario__Group_0__0 )? )
            {
            // InternalCucumber.g:1012:1: ( ( rule__Scenario__Group_0__0 )? )
            // InternalCucumber.g:1013:2: ( rule__Scenario__Group_0__0 )?
            {
             before(grammarAccess.getScenarioAccess().getGroup_0()); 
            // InternalCucumber.g:1014:2: ( rule__Scenario__Group_0__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCucumber.g:1014:3: rule__Scenario__Group_0__0
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
    // InternalCucumber.g:1022:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1026:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalCucumber.g:1027:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalCucumber.g:1034:1: rule__Scenario__Group__1__Impl : ( 'Scenario:' ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1038:1: ( ( 'Scenario:' ) )
            // InternalCucumber.g:1039:1: ( 'Scenario:' )
            {
            // InternalCucumber.g:1039:1: ( 'Scenario:' )
            // InternalCucumber.g:1040:2: 'Scenario:'
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
    // InternalCucumber.g:1049:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1053:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // InternalCucumber.g:1054:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalCucumber.g:1061:1: rule__Scenario__Group__2__Impl : ( ( rule__Scenario__NameAssignment_2 ) ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1065:1: ( ( ( rule__Scenario__NameAssignment_2 ) ) )
            // InternalCucumber.g:1066:1: ( ( rule__Scenario__NameAssignment_2 ) )
            {
            // InternalCucumber.g:1066:1: ( ( rule__Scenario__NameAssignment_2 ) )
            // InternalCucumber.g:1067:2: ( rule__Scenario__NameAssignment_2 )
            {
             before(grammarAccess.getScenarioAccess().getNameAssignment_2()); 
            // InternalCucumber.g:1068:2: ( rule__Scenario__NameAssignment_2 )
            // InternalCucumber.g:1068:3: rule__Scenario__NameAssignment_2
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
    // InternalCucumber.g:1076:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl rule__Scenario__Group__4 ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1080:1: ( rule__Scenario__Group__3__Impl rule__Scenario__Group__4 )
            // InternalCucumber.g:1081:2: rule__Scenario__Group__3__Impl rule__Scenario__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalCucumber.g:1088:1: rule__Scenario__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1092:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1093:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1093:1: ( RULE_EOL )
            // InternalCucumber.g:1094:2: RULE_EOL
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
    // InternalCucumber.g:1103:1: rule__Scenario__Group__4 : rule__Scenario__Group__4__Impl rule__Scenario__Group__5 ;
    public final void rule__Scenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1107:1: ( rule__Scenario__Group__4__Impl rule__Scenario__Group__5 )
            // InternalCucumber.g:1108:2: rule__Scenario__Group__4__Impl rule__Scenario__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalCucumber.g:1115:1: rule__Scenario__Group__4__Impl : ( ( rule__Scenario__StatementsAssignment_4 )* ) ;
    public final void rule__Scenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1119:1: ( ( ( rule__Scenario__StatementsAssignment_4 )* ) )
            // InternalCucumber.g:1120:1: ( ( rule__Scenario__StatementsAssignment_4 )* )
            {
            // InternalCucumber.g:1120:1: ( ( rule__Scenario__StatementsAssignment_4 )* )
            // InternalCucumber.g:1121:2: ( rule__Scenario__StatementsAssignment_4 )*
            {
             before(grammarAccess.getScenarioAccess().getStatementsAssignment_4()); 
            // InternalCucumber.g:1122:2: ( rule__Scenario__StatementsAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_WORD && LA16_0<=RULE_STRING)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCucumber.g:1122:3: rule__Scenario__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_4);
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
    // InternalCucumber.g:1130:1: rule__Scenario__Group__5 : rule__Scenario__Group__5__Impl ;
    public final void rule__Scenario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1134:1: ( rule__Scenario__Group__5__Impl )
            // InternalCucumber.g:1135:2: rule__Scenario__Group__5__Impl
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
    // InternalCucumber.g:1141:1: rule__Scenario__Group__5__Impl : ( ( rule__Scenario__StepsAssignment_5 )* ) ;
    public final void rule__Scenario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1145:1: ( ( ( rule__Scenario__StepsAssignment_5 )* ) )
            // InternalCucumber.g:1146:1: ( ( rule__Scenario__StepsAssignment_5 )* )
            {
            // InternalCucumber.g:1146:1: ( ( rule__Scenario__StepsAssignment_5 )* )
            // InternalCucumber.g:1147:2: ( rule__Scenario__StepsAssignment_5 )*
            {
             before(grammarAccess.getScenarioAccess().getStepsAssignment_5()); 
            // InternalCucumber.g:1148:2: ( rule__Scenario__StepsAssignment_5 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=10 && LA17_0<=14)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCucumber.g:1148:3: rule__Scenario__StepsAssignment_5
            	    {
            	    pushFollow(FOLLOW_12);
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


    // $ANTLR start "rule__Scenario__Group_0__0"
    // InternalCucumber.g:1157:1: rule__Scenario__Group_0__0 : rule__Scenario__Group_0__0__Impl rule__Scenario__Group_0__1 ;
    public final void rule__Scenario__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1161:1: ( rule__Scenario__Group_0__0__Impl rule__Scenario__Group_0__1 )
            // InternalCucumber.g:1162:2: rule__Scenario__Group_0__0__Impl rule__Scenario__Group_0__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCucumber.g:1169:1: rule__Scenario__Group_0__0__Impl : ( ( ( rule__Scenario__TagsAssignment_0_0 ) ) ( ( rule__Scenario__TagsAssignment_0_0 )* ) ) ;
    public final void rule__Scenario__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1173:1: ( ( ( ( rule__Scenario__TagsAssignment_0_0 ) ) ( ( rule__Scenario__TagsAssignment_0_0 )* ) ) )
            // InternalCucumber.g:1174:1: ( ( ( rule__Scenario__TagsAssignment_0_0 ) ) ( ( rule__Scenario__TagsAssignment_0_0 )* ) )
            {
            // InternalCucumber.g:1174:1: ( ( ( rule__Scenario__TagsAssignment_0_0 ) ) ( ( rule__Scenario__TagsAssignment_0_0 )* ) )
            // InternalCucumber.g:1175:2: ( ( rule__Scenario__TagsAssignment_0_0 ) ) ( ( rule__Scenario__TagsAssignment_0_0 )* )
            {
            // InternalCucumber.g:1175:2: ( ( rule__Scenario__TagsAssignment_0_0 ) )
            // InternalCucumber.g:1176:3: ( rule__Scenario__TagsAssignment_0_0 )
            {
             before(grammarAccess.getScenarioAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:1177:3: ( rule__Scenario__TagsAssignment_0_0 )
            // InternalCucumber.g:1177:4: rule__Scenario__TagsAssignment_0_0
            {
            pushFollow(FOLLOW_10);
            rule__Scenario__TagsAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getTagsAssignment_0_0()); 

            }

            // InternalCucumber.g:1180:2: ( ( rule__Scenario__TagsAssignment_0_0 )* )
            // InternalCucumber.g:1181:3: ( rule__Scenario__TagsAssignment_0_0 )*
            {
             before(grammarAccess.getScenarioAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:1182:3: ( rule__Scenario__TagsAssignment_0_0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==22) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCucumber.g:1182:4: rule__Scenario__TagsAssignment_0_0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Scenario__TagsAssignment_0_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalCucumber.g:1191:1: rule__Scenario__Group_0__1 : rule__Scenario__Group_0__1__Impl ;
    public final void rule__Scenario__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1195:1: ( rule__Scenario__Group_0__1__Impl )
            // InternalCucumber.g:1196:2: rule__Scenario__Group_0__1__Impl
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
    // InternalCucumber.g:1202:1: rule__Scenario__Group_0__1__Impl : ( RULE_EOL ) ;
    public final void rule__Scenario__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1206:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1207:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1207:1: ( RULE_EOL )
            // InternalCucumber.g:1208:2: RULE_EOL
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
    // InternalCucumber.g:1218:1: rule__ScenarioOutline__Group__0 : rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1 ;
    public final void rule__ScenarioOutline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1222:1: ( rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1 )
            // InternalCucumber.g:1223:2: rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalCucumber.g:1230:1: rule__ScenarioOutline__Group__0__Impl : ( ( rule__ScenarioOutline__Group_0__0 )? ) ;
    public final void rule__ScenarioOutline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1234:1: ( ( ( rule__ScenarioOutline__Group_0__0 )? ) )
            // InternalCucumber.g:1235:1: ( ( rule__ScenarioOutline__Group_0__0 )? )
            {
            // InternalCucumber.g:1235:1: ( ( rule__ScenarioOutline__Group_0__0 )? )
            // InternalCucumber.g:1236:2: ( rule__ScenarioOutline__Group_0__0 )?
            {
             before(grammarAccess.getScenarioOutlineAccess().getGroup_0()); 
            // InternalCucumber.g:1237:2: ( rule__ScenarioOutline__Group_0__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCucumber.g:1237:3: rule__ScenarioOutline__Group_0__0
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
    // InternalCucumber.g:1245:1: rule__ScenarioOutline__Group__1 : rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2 ;
    public final void rule__ScenarioOutline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1249:1: ( rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2 )
            // InternalCucumber.g:1250:2: rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalCucumber.g:1257:1: rule__ScenarioOutline__Group__1__Impl : ( 'Scenario Outline:' ) ;
    public final void rule__ScenarioOutline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1261:1: ( ( 'Scenario Outline:' ) )
            // InternalCucumber.g:1262:1: ( 'Scenario Outline:' )
            {
            // InternalCucumber.g:1262:1: ( 'Scenario Outline:' )
            // InternalCucumber.g:1263:2: 'Scenario Outline:'
            {
             before(grammarAccess.getScenarioOutlineAccess().getScenarioOutlineKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalCucumber.g:1272:1: rule__ScenarioOutline__Group__2 : rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3 ;
    public final void rule__ScenarioOutline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1276:1: ( rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3 )
            // InternalCucumber.g:1277:2: rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalCucumber.g:1284:1: rule__ScenarioOutline__Group__2__Impl : ( ( rule__ScenarioOutline__NameAssignment_2 ) ) ;
    public final void rule__ScenarioOutline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1288:1: ( ( ( rule__ScenarioOutline__NameAssignment_2 ) ) )
            // InternalCucumber.g:1289:1: ( ( rule__ScenarioOutline__NameAssignment_2 ) )
            {
            // InternalCucumber.g:1289:1: ( ( rule__ScenarioOutline__NameAssignment_2 ) )
            // InternalCucumber.g:1290:2: ( rule__ScenarioOutline__NameAssignment_2 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getNameAssignment_2()); 
            // InternalCucumber.g:1291:2: ( rule__ScenarioOutline__NameAssignment_2 )
            // InternalCucumber.g:1291:3: rule__ScenarioOutline__NameAssignment_2
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
    // InternalCucumber.g:1299:1: rule__ScenarioOutline__Group__3 : rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4 ;
    public final void rule__ScenarioOutline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1303:1: ( rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4 )
            // InternalCucumber.g:1304:2: rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalCucumber.g:1311:1: rule__ScenarioOutline__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__ScenarioOutline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1315:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1316:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1316:1: ( RULE_EOL )
            // InternalCucumber.g:1317:2: RULE_EOL
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
    // InternalCucumber.g:1326:1: rule__ScenarioOutline__Group__4 : rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5 ;
    public final void rule__ScenarioOutline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1330:1: ( rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5 )
            // InternalCucumber.g:1331:2: rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalCucumber.g:1338:1: rule__ScenarioOutline__Group__4__Impl : ( ( rule__ScenarioOutline__StatementsAssignment_4 )* ) ;
    public final void rule__ScenarioOutline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1342:1: ( ( ( rule__ScenarioOutline__StatementsAssignment_4 )* ) )
            // InternalCucumber.g:1343:1: ( ( rule__ScenarioOutline__StatementsAssignment_4 )* )
            {
            // InternalCucumber.g:1343:1: ( ( rule__ScenarioOutline__StatementsAssignment_4 )* )
            // InternalCucumber.g:1344:2: ( rule__ScenarioOutline__StatementsAssignment_4 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getStatementsAssignment_4()); 
            // InternalCucumber.g:1345:2: ( rule__ScenarioOutline__StatementsAssignment_4 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_WORD && LA20_0<=RULE_STRING)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCucumber.g:1345:3: rule__ScenarioOutline__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ScenarioOutline__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalCucumber.g:1353:1: rule__ScenarioOutline__Group__5 : rule__ScenarioOutline__Group__5__Impl rule__ScenarioOutline__Group__6 ;
    public final void rule__ScenarioOutline__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1357:1: ( rule__ScenarioOutline__Group__5__Impl rule__ScenarioOutline__Group__6 )
            // InternalCucumber.g:1358:2: rule__ScenarioOutline__Group__5__Impl rule__ScenarioOutline__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalCucumber.g:1365:1: rule__ScenarioOutline__Group__5__Impl : ( ( rule__ScenarioOutline__StepsAssignment_5 )* ) ;
    public final void rule__ScenarioOutline__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1369:1: ( ( ( rule__ScenarioOutline__StepsAssignment_5 )* ) )
            // InternalCucumber.g:1370:1: ( ( rule__ScenarioOutline__StepsAssignment_5 )* )
            {
            // InternalCucumber.g:1370:1: ( ( rule__ScenarioOutline__StepsAssignment_5 )* )
            // InternalCucumber.g:1371:2: ( rule__ScenarioOutline__StepsAssignment_5 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getStepsAssignment_5()); 
            // InternalCucumber.g:1372:2: ( rule__ScenarioOutline__StepsAssignment_5 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=10 && LA21_0<=14)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCucumber.g:1372:3: rule__ScenarioOutline__StepsAssignment_5
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ScenarioOutline__StepsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalCucumber.g:1380:1: rule__ScenarioOutline__Group__6 : rule__ScenarioOutline__Group__6__Impl ;
    public final void rule__ScenarioOutline__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1384:1: ( rule__ScenarioOutline__Group__6__Impl )
            // InternalCucumber.g:1385:2: rule__ScenarioOutline__Group__6__Impl
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
    // InternalCucumber.g:1391:1: rule__ScenarioOutline__Group__6__Impl : ( ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* ) ) ;
    public final void rule__ScenarioOutline__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1395:1: ( ( ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* ) ) )
            // InternalCucumber.g:1396:1: ( ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* ) )
            {
            // InternalCucumber.g:1396:1: ( ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* ) )
            // InternalCucumber.g:1397:2: ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* )
            {
            // InternalCucumber.g:1397:2: ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) )
            // InternalCucumber.g:1398:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_6()); 
            // InternalCucumber.g:1399:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )
            // InternalCucumber.g:1399:4: rule__ScenarioOutline__ExamplesAssignment_6
            {
            pushFollow(FOLLOW_16);
            rule__ScenarioOutline__ExamplesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_6()); 

            }

            // InternalCucumber.g:1402:2: ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* )
            // InternalCucumber.g:1403:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_6()); 
            // InternalCucumber.g:1404:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )*
            loop22:
            do {
                int alt22=2;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // InternalCucumber.g:1404:4: rule__ScenarioOutline__ExamplesAssignment_6
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__ScenarioOutline__ExamplesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalCucumber.g:1414:1: rule__ScenarioOutline__Group_0__0 : rule__ScenarioOutline__Group_0__0__Impl rule__ScenarioOutline__Group_0__1 ;
    public final void rule__ScenarioOutline__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1418:1: ( rule__ScenarioOutline__Group_0__0__Impl rule__ScenarioOutline__Group_0__1 )
            // InternalCucumber.g:1419:2: rule__ScenarioOutline__Group_0__0__Impl rule__ScenarioOutline__Group_0__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCucumber.g:1426:1: rule__ScenarioOutline__Group_0__0__Impl : ( ( ( rule__ScenarioOutline__TagsAssignment_0_0 ) ) ( ( rule__ScenarioOutline__TagsAssignment_0_0 )* ) ) ;
    public final void rule__ScenarioOutline__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1430:1: ( ( ( ( rule__ScenarioOutline__TagsAssignment_0_0 ) ) ( ( rule__ScenarioOutline__TagsAssignment_0_0 )* ) ) )
            // InternalCucumber.g:1431:1: ( ( ( rule__ScenarioOutline__TagsAssignment_0_0 ) ) ( ( rule__ScenarioOutline__TagsAssignment_0_0 )* ) )
            {
            // InternalCucumber.g:1431:1: ( ( ( rule__ScenarioOutline__TagsAssignment_0_0 ) ) ( ( rule__ScenarioOutline__TagsAssignment_0_0 )* ) )
            // InternalCucumber.g:1432:2: ( ( rule__ScenarioOutline__TagsAssignment_0_0 ) ) ( ( rule__ScenarioOutline__TagsAssignment_0_0 )* )
            {
            // InternalCucumber.g:1432:2: ( ( rule__ScenarioOutline__TagsAssignment_0_0 ) )
            // InternalCucumber.g:1433:3: ( rule__ScenarioOutline__TagsAssignment_0_0 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:1434:3: ( rule__ScenarioOutline__TagsAssignment_0_0 )
            // InternalCucumber.g:1434:4: rule__ScenarioOutline__TagsAssignment_0_0
            {
            pushFollow(FOLLOW_10);
            rule__ScenarioOutline__TagsAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getTagsAssignment_0_0()); 

            }

            // InternalCucumber.g:1437:2: ( ( rule__ScenarioOutline__TagsAssignment_0_0 )* )
            // InternalCucumber.g:1438:3: ( rule__ScenarioOutline__TagsAssignment_0_0 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:1439:3: ( rule__ScenarioOutline__TagsAssignment_0_0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==22) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalCucumber.g:1439:4: rule__ScenarioOutline__TagsAssignment_0_0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ScenarioOutline__TagsAssignment_0_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalCucumber.g:1448:1: rule__ScenarioOutline__Group_0__1 : rule__ScenarioOutline__Group_0__1__Impl ;
    public final void rule__ScenarioOutline__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1452:1: ( rule__ScenarioOutline__Group_0__1__Impl )
            // InternalCucumber.g:1453:2: rule__ScenarioOutline__Group_0__1__Impl
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
    // InternalCucumber.g:1459:1: rule__ScenarioOutline__Group_0__1__Impl : ( RULE_EOL ) ;
    public final void rule__ScenarioOutline__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1463:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1464:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1464:1: ( RULE_EOL )
            // InternalCucumber.g:1465:2: RULE_EOL
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


    // $ANTLR start "rule__Examples__Group__0"
    // InternalCucumber.g:1475:1: rule__Examples__Group__0 : rule__Examples__Group__0__Impl rule__Examples__Group__1 ;
    public final void rule__Examples__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1479:1: ( rule__Examples__Group__0__Impl rule__Examples__Group__1 )
            // InternalCucumber.g:1480:2: rule__Examples__Group__0__Impl rule__Examples__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalCucumber.g:1487:1: rule__Examples__Group__0__Impl : ( ( rule__Examples__Group_0__0 )? ) ;
    public final void rule__Examples__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1491:1: ( ( ( rule__Examples__Group_0__0 )? ) )
            // InternalCucumber.g:1492:1: ( ( rule__Examples__Group_0__0 )? )
            {
            // InternalCucumber.g:1492:1: ( ( rule__Examples__Group_0__0 )? )
            // InternalCucumber.g:1493:2: ( rule__Examples__Group_0__0 )?
            {
             before(grammarAccess.getExamplesAccess().getGroup_0()); 
            // InternalCucumber.g:1494:2: ( rule__Examples__Group_0__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==22) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCucumber.g:1494:3: rule__Examples__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Examples__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExamplesAccess().getGroup_0()); 

            }


            }

        }
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
    // InternalCucumber.g:1502:1: rule__Examples__Group__1 : rule__Examples__Group__1__Impl rule__Examples__Group__2 ;
    public final void rule__Examples__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1506:1: ( rule__Examples__Group__1__Impl rule__Examples__Group__2 )
            // InternalCucumber.g:1507:2: rule__Examples__Group__1__Impl rule__Examples__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalCucumber.g:1514:1: rule__Examples__Group__1__Impl : ( 'Examples:' ) ;
    public final void rule__Examples__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1518:1: ( ( 'Examples:' ) )
            // InternalCucumber.g:1519:1: ( 'Examples:' )
            {
            // InternalCucumber.g:1519:1: ( 'Examples:' )
            // InternalCucumber.g:1520:2: 'Examples:'
            {
             before(grammarAccess.getExamplesAccess().getExamplesKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getExamplesAccess().getExamplesKeyword_1()); 

            }


            }

        }
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
    // InternalCucumber.g:1529:1: rule__Examples__Group__2 : rule__Examples__Group__2__Impl rule__Examples__Group__3 ;
    public final void rule__Examples__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1533:1: ( rule__Examples__Group__2__Impl rule__Examples__Group__3 )
            // InternalCucumber.g:1534:2: rule__Examples__Group__2__Impl rule__Examples__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalCucumber.g:1541:1: rule__Examples__Group__2__Impl : ( ( rule__Examples__NameAssignment_2 ) ) ;
    public final void rule__Examples__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1545:1: ( ( ( rule__Examples__NameAssignment_2 ) ) )
            // InternalCucumber.g:1546:1: ( ( rule__Examples__NameAssignment_2 ) )
            {
            // InternalCucumber.g:1546:1: ( ( rule__Examples__NameAssignment_2 ) )
            // InternalCucumber.g:1547:2: ( rule__Examples__NameAssignment_2 )
            {
             before(grammarAccess.getExamplesAccess().getNameAssignment_2()); 
            // InternalCucumber.g:1548:2: ( rule__Examples__NameAssignment_2 )
            // InternalCucumber.g:1548:3: rule__Examples__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Examples__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExamplesAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalCucumber.g:1556:1: rule__Examples__Group__3 : rule__Examples__Group__3__Impl rule__Examples__Group__4 ;
    public final void rule__Examples__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1560:1: ( rule__Examples__Group__3__Impl rule__Examples__Group__4 )
            // InternalCucumber.g:1561:2: rule__Examples__Group__3__Impl rule__Examples__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalCucumber.g:1568:1: rule__Examples__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Examples__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1572:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1573:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1573:1: ( RULE_EOL )
            // InternalCucumber.g:1574:2: RULE_EOL
            {
             before(grammarAccess.getExamplesAccess().getEOLTerminalRuleCall_3()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getExamplesAccess().getEOLTerminalRuleCall_3()); 

            }


            }

        }
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
    // InternalCucumber.g:1583:1: rule__Examples__Group__4 : rule__Examples__Group__4__Impl rule__Examples__Group__5 ;
    public final void rule__Examples__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1587:1: ( rule__Examples__Group__4__Impl rule__Examples__Group__5 )
            // InternalCucumber.g:1588:2: rule__Examples__Group__4__Impl rule__Examples__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalCucumber.g:1595:1: rule__Examples__Group__4__Impl : ( ( rule__Examples__StatementsAssignment_4 )* ) ;
    public final void rule__Examples__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1599:1: ( ( ( rule__Examples__StatementsAssignment_4 )* ) )
            // InternalCucumber.g:1600:1: ( ( rule__Examples__StatementsAssignment_4 )* )
            {
            // InternalCucumber.g:1600:1: ( ( rule__Examples__StatementsAssignment_4 )* )
            // InternalCucumber.g:1601:2: ( rule__Examples__StatementsAssignment_4 )*
            {
             before(grammarAccess.getExamplesAccess().getStatementsAssignment_4()); 
            // InternalCucumber.g:1602:2: ( rule__Examples__StatementsAssignment_4 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_WORD && LA25_0<=RULE_STRING)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalCucumber.g:1602:3: rule__Examples__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Examples__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalCucumber.g:1610:1: rule__Examples__Group__5 : rule__Examples__Group__5__Impl ;
    public final void rule__Examples__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1614:1: ( rule__Examples__Group__5__Impl )
            // InternalCucumber.g:1615:2: rule__Examples__Group__5__Impl
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
    // InternalCucumber.g:1621:1: rule__Examples__Group__5__Impl : ( ( rule__Examples__TheExamplesTableAssignment_5 ) ) ;
    public final void rule__Examples__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1625:1: ( ( ( rule__Examples__TheExamplesTableAssignment_5 ) ) )
            // InternalCucumber.g:1626:1: ( ( rule__Examples__TheExamplesTableAssignment_5 ) )
            {
            // InternalCucumber.g:1626:1: ( ( rule__Examples__TheExamplesTableAssignment_5 ) )
            // InternalCucumber.g:1627:2: ( rule__Examples__TheExamplesTableAssignment_5 )
            {
             before(grammarAccess.getExamplesAccess().getTheExamplesTableAssignment_5()); 
            // InternalCucumber.g:1628:2: ( rule__Examples__TheExamplesTableAssignment_5 )
            // InternalCucumber.g:1628:3: rule__Examples__TheExamplesTableAssignment_5
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


    // $ANTLR start "rule__Examples__Group_0__0"
    // InternalCucumber.g:1637:1: rule__Examples__Group_0__0 : rule__Examples__Group_0__0__Impl rule__Examples__Group_0__1 ;
    public final void rule__Examples__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1641:1: ( rule__Examples__Group_0__0__Impl rule__Examples__Group_0__1 )
            // InternalCucumber.g:1642:2: rule__Examples__Group_0__0__Impl rule__Examples__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Examples__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Examples__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group_0__0"


    // $ANTLR start "rule__Examples__Group_0__0__Impl"
    // InternalCucumber.g:1649:1: rule__Examples__Group_0__0__Impl : ( ( ( rule__Examples__TagsAssignment_0_0 ) ) ( ( rule__Examples__TagsAssignment_0_0 )* ) ) ;
    public final void rule__Examples__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1653:1: ( ( ( ( rule__Examples__TagsAssignment_0_0 ) ) ( ( rule__Examples__TagsAssignment_0_0 )* ) ) )
            // InternalCucumber.g:1654:1: ( ( ( rule__Examples__TagsAssignment_0_0 ) ) ( ( rule__Examples__TagsAssignment_0_0 )* ) )
            {
            // InternalCucumber.g:1654:1: ( ( ( rule__Examples__TagsAssignment_0_0 ) ) ( ( rule__Examples__TagsAssignment_0_0 )* ) )
            // InternalCucumber.g:1655:2: ( ( rule__Examples__TagsAssignment_0_0 ) ) ( ( rule__Examples__TagsAssignment_0_0 )* )
            {
            // InternalCucumber.g:1655:2: ( ( rule__Examples__TagsAssignment_0_0 ) )
            // InternalCucumber.g:1656:3: ( rule__Examples__TagsAssignment_0_0 )
            {
             before(grammarAccess.getExamplesAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:1657:3: ( rule__Examples__TagsAssignment_0_0 )
            // InternalCucumber.g:1657:4: rule__Examples__TagsAssignment_0_0
            {
            pushFollow(FOLLOW_10);
            rule__Examples__TagsAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getExamplesAccess().getTagsAssignment_0_0()); 

            }

            // InternalCucumber.g:1660:2: ( ( rule__Examples__TagsAssignment_0_0 )* )
            // InternalCucumber.g:1661:3: ( rule__Examples__TagsAssignment_0_0 )*
            {
             before(grammarAccess.getExamplesAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:1662:3: ( rule__Examples__TagsAssignment_0_0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==22) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalCucumber.g:1662:4: rule__Examples__TagsAssignment_0_0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Examples__TagsAssignment_0_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getExamplesAccess().getTagsAssignment_0_0()); 

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
    // $ANTLR end "rule__Examples__Group_0__0__Impl"


    // $ANTLR start "rule__Examples__Group_0__1"
    // InternalCucumber.g:1671:1: rule__Examples__Group_0__1 : rule__Examples__Group_0__1__Impl ;
    public final void rule__Examples__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1675:1: ( rule__Examples__Group_0__1__Impl )
            // InternalCucumber.g:1676:2: rule__Examples__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Examples__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group_0__1"


    // $ANTLR start "rule__Examples__Group_0__1__Impl"
    // InternalCucumber.g:1682:1: rule__Examples__Group_0__1__Impl : ( RULE_EOL ) ;
    public final void rule__Examples__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1686:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1687:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1687:1: ( RULE_EOL )
            // InternalCucumber.g:1688:2: RULE_EOL
            {
             before(grammarAccess.getExamplesAccess().getEOLTerminalRuleCall_0_1()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getExamplesAccess().getEOLTerminalRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group_0__1__Impl"


    // $ANTLR start "rule__Row__Group__0"
    // InternalCucumber.g:1698:1: rule__Row__Group__0 : rule__Row__Group__0__Impl rule__Row__Group__1 ;
    public final void rule__Row__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1702:1: ( rule__Row__Group__0__Impl rule__Row__Group__1 )
            // InternalCucumber.g:1703:2: rule__Row__Group__0__Impl rule__Row__Group__1
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
    // InternalCucumber.g:1710:1: rule__Row__Group__0__Impl : ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) ) ;
    public final void rule__Row__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1714:1: ( ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) ) )
            // InternalCucumber.g:1715:1: ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) )
            {
            // InternalCucumber.g:1715:1: ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) )
            // InternalCucumber.g:1716:2: ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* )
            {
            // InternalCucumber.g:1716:2: ( ( rule__Row__CellsAssignment_0 ) )
            // InternalCucumber.g:1717:3: ( rule__Row__CellsAssignment_0 )
            {
             before(grammarAccess.getRowAccess().getCellsAssignment_0()); 
            // InternalCucumber.g:1718:3: ( rule__Row__CellsAssignment_0 )
            // InternalCucumber.g:1718:4: rule__Row__CellsAssignment_0
            {
            pushFollow(FOLLOW_3);
            rule__Row__CellsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getCellsAssignment_0()); 

            }

            // InternalCucumber.g:1721:2: ( ( rule__Row__CellsAssignment_0 )* )
            // InternalCucumber.g:1722:3: ( rule__Row__CellsAssignment_0 )*
            {
             before(grammarAccess.getRowAccess().getCellsAssignment_0()); 
            // InternalCucumber.g:1723:3: ( rule__Row__CellsAssignment_0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==20) ) {
                    int LA27_1 = input.LA(2);

                    if ( ((LA27_1>=RULE_WORD && LA27_1<=RULE_STRING)) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // InternalCucumber.g:1723:4: rule__Row__CellsAssignment_0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Row__CellsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalCucumber.g:1732:1: rule__Row__Group__1 : rule__Row__Group__1__Impl rule__Row__Group__2 ;
    public final void rule__Row__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1736:1: ( rule__Row__Group__1__Impl rule__Row__Group__2 )
            // InternalCucumber.g:1737:2: rule__Row__Group__1__Impl rule__Row__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalCucumber.g:1744:1: rule__Row__Group__1__Impl : ( '|' ) ;
    public final void rule__Row__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1748:1: ( ( '|' ) )
            // InternalCucumber.g:1749:1: ( '|' )
            {
            // InternalCucumber.g:1749:1: ( '|' )
            // InternalCucumber.g:1750:2: '|'
            {
             before(grammarAccess.getRowAccess().getVerticalLineKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalCucumber.g:1759:1: rule__Row__Group__2 : rule__Row__Group__2__Impl ;
    public final void rule__Row__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1763:1: ( rule__Row__Group__2__Impl )
            // InternalCucumber.g:1764:2: rule__Row__Group__2__Impl
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
    // InternalCucumber.g:1770:1: rule__Row__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__Row__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1774:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1775:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1775:1: ( RULE_EOL )
            // InternalCucumber.g:1776:2: RULE_EOL
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
    // InternalCucumber.g:1786:1: rule__Cell__Group__0 : rule__Cell__Group__0__Impl rule__Cell__Group__1 ;
    public final void rule__Cell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1790:1: ( rule__Cell__Group__0__Impl rule__Cell__Group__1 )
            // InternalCucumber.g:1791:2: rule__Cell__Group__0__Impl rule__Cell__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalCucumber.g:1798:1: rule__Cell__Group__0__Impl : ( '|' ) ;
    public final void rule__Cell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1802:1: ( ( '|' ) )
            // InternalCucumber.g:1803:1: ( '|' )
            {
            // InternalCucumber.g:1803:1: ( '|' )
            // InternalCucumber.g:1804:2: '|'
            {
             before(grammarAccess.getCellAccess().getVerticalLineKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalCucumber.g:1813:1: rule__Cell__Group__1 : rule__Cell__Group__1__Impl ;
    public final void rule__Cell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1817:1: ( rule__Cell__Group__1__Impl )
            // InternalCucumber.g:1818:2: rule__Cell__Group__1__Impl
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
    // InternalCucumber.g:1824:1: rule__Cell__Group__1__Impl : ( ( rule__Cell__NameAssignment_1 ) ) ;
    public final void rule__Cell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1828:1: ( ( ( rule__Cell__NameAssignment_1 ) ) )
            // InternalCucumber.g:1829:1: ( ( rule__Cell__NameAssignment_1 ) )
            {
            // InternalCucumber.g:1829:1: ( ( rule__Cell__NameAssignment_1 ) )
            // InternalCucumber.g:1830:2: ( rule__Cell__NameAssignment_1 )
            {
             before(grammarAccess.getCellAccess().getNameAssignment_1()); 
            // InternalCucumber.g:1831:2: ( rule__Cell__NameAssignment_1 )
            // InternalCucumber.g:1831:3: rule__Cell__NameAssignment_1
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


    // $ANTLR start "rule__Step__Group__0"
    // InternalCucumber.g:1840:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1844:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // InternalCucumber.g:1845:2: rule__Step__Group__0__Impl rule__Step__Group__1
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
    // InternalCucumber.g:1852:1: rule__Step__Group__0__Impl : ( ( rule__Step__Alternatives_0 ) ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1856:1: ( ( ( rule__Step__Alternatives_0 ) ) )
            // InternalCucumber.g:1857:1: ( ( rule__Step__Alternatives_0 ) )
            {
            // InternalCucumber.g:1857:1: ( ( rule__Step__Alternatives_0 ) )
            // InternalCucumber.g:1858:2: ( rule__Step__Alternatives_0 )
            {
             before(grammarAccess.getStepAccess().getAlternatives_0()); 
            // InternalCucumber.g:1859:2: ( rule__Step__Alternatives_0 )
            // InternalCucumber.g:1859:3: rule__Step__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Step__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getAlternatives_0()); 

            }


            }

        }
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
    // InternalCucumber.g:1867:1: rule__Step__Group__1 : rule__Step__Group__1__Impl rule__Step__Group__2 ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1871:1: ( rule__Step__Group__1__Impl rule__Step__Group__2 )
            // InternalCucumber.g:1872:2: rule__Step__Group__1__Impl rule__Step__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Step__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__2();

            state._fsp--;


            }

        }
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
    // InternalCucumber.g:1879:1: rule__Step__Group__1__Impl : ( ( rule__Step__NameAssignment_1 ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1883:1: ( ( ( rule__Step__NameAssignment_1 ) ) )
            // InternalCucumber.g:1884:1: ( ( rule__Step__NameAssignment_1 ) )
            {
            // InternalCucumber.g:1884:1: ( ( rule__Step__NameAssignment_1 ) )
            // InternalCucumber.g:1885:2: ( rule__Step__NameAssignment_1 )
            {
             before(grammarAccess.getStepAccess().getNameAssignment_1()); 
            // InternalCucumber.g:1886:2: ( rule__Step__NameAssignment_1 )
            // InternalCucumber.g:1886:3: rule__Step__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Step__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Step__Group__2"
    // InternalCucumber.g:1894:1: rule__Step__Group__2 : rule__Step__Group__2__Impl rule__Step__Group__3 ;
    public final void rule__Step__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1898:1: ( rule__Step__Group__2__Impl rule__Step__Group__3 )
            // InternalCucumber.g:1899:2: rule__Step__Group__2__Impl rule__Step__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Step__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__2"


    // $ANTLR start "rule__Step__Group__2__Impl"
    // InternalCucumber.g:1906:1: rule__Step__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__Step__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1910:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1911:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1911:1: ( RULE_EOL )
            // InternalCucumber.g:1912:2: RULE_EOL
            {
             before(grammarAccess.getStepAccess().getEOLTerminalRuleCall_2()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getEOLTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__2__Impl"


    // $ANTLR start "rule__Step__Group__3"
    // InternalCucumber.g:1921:1: rule__Step__Group__3 : rule__Step__Group__3__Impl ;
    public final void rule__Step__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1925:1: ( rule__Step__Group__3__Impl )
            // InternalCucumber.g:1926:2: rule__Step__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__3"


    // $ANTLR start "rule__Step__Group__3__Impl"
    // InternalCucumber.g:1932:1: rule__Step__Group__3__Impl : ( ( rule__Step__Alternatives_3 )? ) ;
    public final void rule__Step__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1936:1: ( ( ( rule__Step__Alternatives_3 )? ) )
            // InternalCucumber.g:1937:1: ( ( rule__Step__Alternatives_3 )? )
            {
            // InternalCucumber.g:1937:1: ( ( rule__Step__Alternatives_3 )? )
            // InternalCucumber.g:1938:2: ( rule__Step__Alternatives_3 )?
            {
             before(grammarAccess.getStepAccess().getAlternatives_3()); 
            // InternalCucumber.g:1939:2: ( rule__Step__Alternatives_3 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=20 && LA28_0<=21)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCucumber.g:1939:3: rule__Step__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Step__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStepAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__3__Impl"


    // $ANTLR start "rule__DocString__Group__0"
    // InternalCucumber.g:1948:1: rule__DocString__Group__0 : rule__DocString__Group__0__Impl rule__DocString__Group__1 ;
    public final void rule__DocString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1952:1: ( rule__DocString__Group__0__Impl rule__DocString__Group__1 )
            // InternalCucumber.g:1953:2: rule__DocString__Group__0__Impl rule__DocString__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCucumber.g:1960:1: rule__DocString__Group__0__Impl : ( '\"\"\"' ) ;
    public final void rule__DocString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1964:1: ( ( '\"\"\"' ) )
            // InternalCucumber.g:1965:1: ( '\"\"\"' )
            {
            // InternalCucumber.g:1965:1: ( '\"\"\"' )
            // InternalCucumber.g:1966:2: '\"\"\"'
            {
             before(grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_0()); 

            }


            }

        }
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
    // InternalCucumber.g:1975:1: rule__DocString__Group__1 : rule__DocString__Group__1__Impl rule__DocString__Group__2 ;
    public final void rule__DocString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1979:1: ( rule__DocString__Group__1__Impl rule__DocString__Group__2 )
            // InternalCucumber.g:1980:2: rule__DocString__Group__1__Impl rule__DocString__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalCucumber.g:1987:1: rule__DocString__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__DocString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1991:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1992:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1992:1: ( RULE_EOL )
            // InternalCucumber.g:1993:2: RULE_EOL
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
    // InternalCucumber.g:2002:1: rule__DocString__Group__2 : rule__DocString__Group__2__Impl rule__DocString__Group__3 ;
    public final void rule__DocString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2006:1: ( rule__DocString__Group__2__Impl rule__DocString__Group__3 )
            // InternalCucumber.g:2007:2: rule__DocString__Group__2__Impl rule__DocString__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalCucumber.g:2014:1: rule__DocString__Group__2__Impl : ( ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* ) ) ;
    public final void rule__DocString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2018:1: ( ( ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* ) ) )
            // InternalCucumber.g:2019:1: ( ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* ) )
            {
            // InternalCucumber.g:2019:1: ( ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* ) )
            // InternalCucumber.g:2020:2: ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* )
            {
            // InternalCucumber.g:2020:2: ( ( rule__DocString__LinesAssignment_2 ) )
            // InternalCucumber.g:2021:3: ( rule__DocString__LinesAssignment_2 )
            {
             before(grammarAccess.getDocStringAccess().getLinesAssignment_2()); 
            // InternalCucumber.g:2022:3: ( rule__DocString__LinesAssignment_2 )
            // InternalCucumber.g:2022:4: rule__DocString__LinesAssignment_2
            {
            pushFollow(FOLLOW_4);
            rule__DocString__LinesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDocStringAccess().getLinesAssignment_2()); 

            }

            // InternalCucumber.g:2025:2: ( ( rule__DocString__LinesAssignment_2 )* )
            // InternalCucumber.g:2026:3: ( rule__DocString__LinesAssignment_2 )*
            {
             before(grammarAccess.getDocStringAccess().getLinesAssignment_2()); 
            // InternalCucumber.g:2027:3: ( rule__DocString__LinesAssignment_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==EOF||(LA29_0>=RULE_WORD && LA29_0<=RULE_EOL)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalCucumber.g:2027:4: rule__DocString__LinesAssignment_2
            	    {
            	    pushFollow(FOLLOW_4);
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
    // InternalCucumber.g:2036:1: rule__DocString__Group__3 : rule__DocString__Group__3__Impl rule__DocString__Group__4 ;
    public final void rule__DocString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2040:1: ( rule__DocString__Group__3__Impl rule__DocString__Group__4 )
            // InternalCucumber.g:2041:2: rule__DocString__Group__3__Impl rule__DocString__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalCucumber.g:2048:1: rule__DocString__Group__3__Impl : ( '\"\"\"' ) ;
    public final void rule__DocString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2052:1: ( ( '\"\"\"' ) )
            // InternalCucumber.g:2053:1: ( '\"\"\"' )
            {
            // InternalCucumber.g:2053:1: ( '\"\"\"' )
            // InternalCucumber.g:2054:2: '\"\"\"'
            {
             before(grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_3()); 

            }


            }

        }
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
    // InternalCucumber.g:2063:1: rule__DocString__Group__4 : rule__DocString__Group__4__Impl ;
    public final void rule__DocString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2067:1: ( rule__DocString__Group__4__Impl )
            // InternalCucumber.g:2068:2: rule__DocString__Group__4__Impl
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
    // InternalCucumber.g:2074:1: rule__DocString__Group__4__Impl : ( RULE_EOL ) ;
    public final void rule__DocString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2078:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2079:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2079:1: ( RULE_EOL )
            // InternalCucumber.g:2080:2: RULE_EOL
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


    // $ANTLR start "rule__Statement__Group__0"
    // InternalCucumber.g:2090:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2094:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalCucumber.g:2095:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCucumber.g:2102:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__NameAssignment_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2106:1: ( ( ( rule__Statement__NameAssignment_0 ) ) )
            // InternalCucumber.g:2107:1: ( ( rule__Statement__NameAssignment_0 ) )
            {
            // InternalCucumber.g:2107:1: ( ( rule__Statement__NameAssignment_0 ) )
            // InternalCucumber.g:2108:2: ( rule__Statement__NameAssignment_0 )
            {
             before(grammarAccess.getStatementAccess().getNameAssignment_0()); 
            // InternalCucumber.g:2109:2: ( rule__Statement__NameAssignment_0 )
            // InternalCucumber.g:2109:3: rule__Statement__NameAssignment_0
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
    // InternalCucumber.g:2117:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2121:1: ( rule__Statement__Group__1__Impl )
            // InternalCucumber.g:2122:2: rule__Statement__Group__1__Impl
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
    // InternalCucumber.g:2128:1: rule__Statement__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2132:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2133:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2133:1: ( RULE_EOL )
            // InternalCucumber.g:2134:2: RULE_EOL
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
    // InternalCucumber.g:2144:1: rule__Tag__Group__0 : rule__Tag__Group__0__Impl rule__Tag__Group__1 ;
    public final void rule__Tag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2148:1: ( rule__Tag__Group__0__Impl rule__Tag__Group__1 )
            // InternalCucumber.g:2149:2: rule__Tag__Group__0__Impl rule__Tag__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalCucumber.g:2156:1: rule__Tag__Group__0__Impl : ( '@' ) ;
    public final void rule__Tag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2160:1: ( ( '@' ) )
            // InternalCucumber.g:2161:1: ( '@' )
            {
            // InternalCucumber.g:2161:1: ( '@' )
            // InternalCucumber.g:2162:2: '@'
            {
             before(grammarAccess.getTagAccess().getCommercialAtKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCucumber.g:2171:1: rule__Tag__Group__1 : rule__Tag__Group__1__Impl ;
    public final void rule__Tag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2175:1: ( rule__Tag__Group__1__Impl )
            // InternalCucumber.g:2176:2: rule__Tag__Group__1__Impl
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
    // InternalCucumber.g:2182:1: rule__Tag__Group__1__Impl : ( ( rule__Tag__NameAssignment_1 ) ) ;
    public final void rule__Tag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2186:1: ( ( ( rule__Tag__NameAssignment_1 ) ) )
            // InternalCucumber.g:2187:1: ( ( rule__Tag__NameAssignment_1 ) )
            {
            // InternalCucumber.g:2187:1: ( ( rule__Tag__NameAssignment_1 ) )
            // InternalCucumber.g:2188:2: ( rule__Tag__NameAssignment_1 )
            {
             before(grammarAccess.getTagAccess().getNameAssignment_1()); 
            // InternalCucumber.g:2189:2: ( rule__Tag__NameAssignment_1 )
            // InternalCucumber.g:2189:3: rule__Tag__NameAssignment_1
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


    // $ANTLR start "rule__Line__Group__0"
    // InternalCucumber.g:2198:1: rule__Line__Group__0 : rule__Line__Group__0__Impl rule__Line__Group__1 ;
    public final void rule__Line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2202:1: ( rule__Line__Group__0__Impl rule__Line__Group__1 )
            // InternalCucumber.g:2203:2: rule__Line__Group__0__Impl rule__Line__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCucumber.g:2210:1: rule__Line__Group__0__Impl : ( ( rule__Line__NameAssignment_0 ) ) ;
    public final void rule__Line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2214:1: ( ( ( rule__Line__NameAssignment_0 ) ) )
            // InternalCucumber.g:2215:1: ( ( rule__Line__NameAssignment_0 ) )
            {
            // InternalCucumber.g:2215:1: ( ( rule__Line__NameAssignment_0 ) )
            // InternalCucumber.g:2216:2: ( rule__Line__NameAssignment_0 )
            {
             before(grammarAccess.getLineAccess().getNameAssignment_0()); 
            // InternalCucumber.g:2217:2: ( rule__Line__NameAssignment_0 )
            // InternalCucumber.g:2217:3: rule__Line__NameAssignment_0
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
    // InternalCucumber.g:2225:1: rule__Line__Group__1 : rule__Line__Group__1__Impl ;
    public final void rule__Line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2229:1: ( rule__Line__Group__1__Impl )
            // InternalCucumber.g:2230:2: rule__Line__Group__1__Impl
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
    // InternalCucumber.g:2236:1: rule__Line__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2240:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2241:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2241:1: ( RULE_EOL )
            // InternalCucumber.g:2242:2: RULE_EOL
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


    // $ANTLR start "rule__Feature__TagsAssignment_0_0"
    // InternalCucumber.g:2252:1: rule__Feature__TagsAssignment_0_0 : ( ruleTag ) ;
    public final void rule__Feature__TagsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2256:1: ( ( ruleTag ) )
            // InternalCucumber.g:2257:2: ( ruleTag )
            {
            // InternalCucumber.g:2257:2: ( ruleTag )
            // InternalCucumber.g:2258:3: ruleTag
            {
             before(grammarAccess.getFeatureAccess().getTagsTagParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getTagsTagParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__TagsAssignment_0_0"


    // $ANTLR start "rule__Feature__NameAssignment_2"
    // InternalCucumber.g:2267:1: rule__Feature__NameAssignment_2 : ( rulePhrase ) ;
    public final void rule__Feature__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2271:1: ( ( rulePhrase ) )
            // InternalCucumber.g:2272:2: ( rulePhrase )
            {
            // InternalCucumber.g:2272:2: ( rulePhrase )
            // InternalCucumber.g:2273:3: rulePhrase
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
    // InternalCucumber.g:2282:1: rule__Feature__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__Feature__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2286:1: ( ( ruleStatement ) )
            // InternalCucumber.g:2287:2: ( ruleStatement )
            {
            // InternalCucumber.g:2287:2: ( ruleStatement )
            // InternalCucumber.g:2288:3: ruleStatement
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
    // InternalCucumber.g:2297:1: rule__Feature__AbstractScenariosAssignment_5 : ( ruleAbstractScenario ) ;
    public final void rule__Feature__AbstractScenariosAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2301:1: ( ( ruleAbstractScenario ) )
            // InternalCucumber.g:2302:2: ( ruleAbstractScenario )
            {
            // InternalCucumber.g:2302:2: ( ruleAbstractScenario )
            // InternalCucumber.g:2303:3: ruleAbstractScenario
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


    // $ANTLR start "rule__Background__NameAssignment_1"
    // InternalCucumber.g:2312:1: rule__Background__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__Background__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2316:1: ( ( rulePhrase ) )
            // InternalCucumber.g:2317:2: ( rulePhrase )
            {
            // InternalCucumber.g:2317:2: ( rulePhrase )
            // InternalCucumber.g:2318:3: rulePhrase
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
    // InternalCucumber.g:2327:1: rule__Background__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__Background__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2331:1: ( ( ruleStatement ) )
            // InternalCucumber.g:2332:2: ( ruleStatement )
            {
            // InternalCucumber.g:2332:2: ( ruleStatement )
            // InternalCucumber.g:2333:3: ruleStatement
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
    // InternalCucumber.g:2342:1: rule__Background__StepsAssignment_4 : ( ruleStep ) ;
    public final void rule__Background__StepsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2346:1: ( ( ruleStep ) )
            // InternalCucumber.g:2347:2: ( ruleStep )
            {
            // InternalCucumber.g:2347:2: ( ruleStep )
            // InternalCucumber.g:2348:3: ruleStep
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
    // InternalCucumber.g:2357:1: rule__Scenario__TagsAssignment_0_0 : ( ruleTag ) ;
    public final void rule__Scenario__TagsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2361:1: ( ( ruleTag ) )
            // InternalCucumber.g:2362:2: ( ruleTag )
            {
            // InternalCucumber.g:2362:2: ( ruleTag )
            // InternalCucumber.g:2363:3: ruleTag
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
    // InternalCucumber.g:2372:1: rule__Scenario__NameAssignment_2 : ( rulePhrase ) ;
    public final void rule__Scenario__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2376:1: ( ( rulePhrase ) )
            // InternalCucumber.g:2377:2: ( rulePhrase )
            {
            // InternalCucumber.g:2377:2: ( rulePhrase )
            // InternalCucumber.g:2378:3: rulePhrase
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
    // InternalCucumber.g:2387:1: rule__Scenario__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__Scenario__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2391:1: ( ( ruleStatement ) )
            // InternalCucumber.g:2392:2: ( ruleStatement )
            {
            // InternalCucumber.g:2392:2: ( ruleStatement )
            // InternalCucumber.g:2393:3: ruleStatement
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
    // InternalCucumber.g:2402:1: rule__Scenario__StepsAssignment_5 : ( ruleStep ) ;
    public final void rule__Scenario__StepsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2406:1: ( ( ruleStep ) )
            // InternalCucumber.g:2407:2: ( ruleStep )
            {
            // InternalCucumber.g:2407:2: ( ruleStep )
            // InternalCucumber.g:2408:3: ruleStep
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
    // InternalCucumber.g:2417:1: rule__ScenarioOutline__TagsAssignment_0_0 : ( ruleTag ) ;
    public final void rule__ScenarioOutline__TagsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2421:1: ( ( ruleTag ) )
            // InternalCucumber.g:2422:2: ( ruleTag )
            {
            // InternalCucumber.g:2422:2: ( ruleTag )
            // InternalCucumber.g:2423:3: ruleTag
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
    // InternalCucumber.g:2432:1: rule__ScenarioOutline__NameAssignment_2 : ( rulePhrase ) ;
    public final void rule__ScenarioOutline__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2436:1: ( ( rulePhrase ) )
            // InternalCucumber.g:2437:2: ( rulePhrase )
            {
            // InternalCucumber.g:2437:2: ( rulePhrase )
            // InternalCucumber.g:2438:3: rulePhrase
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
    // InternalCucumber.g:2447:1: rule__ScenarioOutline__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__ScenarioOutline__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2451:1: ( ( ruleStatement ) )
            // InternalCucumber.g:2452:2: ( ruleStatement )
            {
            // InternalCucumber.g:2452:2: ( ruleStatement )
            // InternalCucumber.g:2453:3: ruleStatement
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
    // InternalCucumber.g:2462:1: rule__ScenarioOutline__StepsAssignment_5 : ( ruleStep ) ;
    public final void rule__ScenarioOutline__StepsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2466:1: ( ( ruleStep ) )
            // InternalCucumber.g:2467:2: ( ruleStep )
            {
            // InternalCucumber.g:2467:2: ( ruleStep )
            // InternalCucumber.g:2468:3: ruleStep
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
    // InternalCucumber.g:2477:1: rule__ScenarioOutline__ExamplesAssignment_6 : ( ruleExamples ) ;
    public final void rule__ScenarioOutline__ExamplesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2481:1: ( ( ruleExamples ) )
            // InternalCucumber.g:2482:2: ( ruleExamples )
            {
            // InternalCucumber.g:2482:2: ( ruleExamples )
            // InternalCucumber.g:2483:3: ruleExamples
            {
             before(grammarAccess.getScenarioOutlineAccess().getExamplesExamplesParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExamples();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getExamplesExamplesParserRuleCall_6_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Examples__TagsAssignment_0_0"
    // InternalCucumber.g:2492:1: rule__Examples__TagsAssignment_0_0 : ( ruleTag ) ;
    public final void rule__Examples__TagsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2496:1: ( ( ruleTag ) )
            // InternalCucumber.g:2497:2: ( ruleTag )
            {
            // InternalCucumber.g:2497:2: ( ruleTag )
            // InternalCucumber.g:2498:3: ruleTag
            {
             before(grammarAccess.getExamplesAccess().getTagsTagParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getExamplesAccess().getTagsTagParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__TagsAssignment_0_0"


    // $ANTLR start "rule__Examples__NameAssignment_2"
    // InternalCucumber.g:2507:1: rule__Examples__NameAssignment_2 : ( rulePhrase ) ;
    public final void rule__Examples__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2511:1: ( ( rulePhrase ) )
            // InternalCucumber.g:2512:2: ( rulePhrase )
            {
            // InternalCucumber.g:2512:2: ( rulePhrase )
            // InternalCucumber.g:2513:3: rulePhrase
            {
             before(grammarAccess.getExamplesAccess().getNamePhraseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getExamplesAccess().getNamePhraseParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__NameAssignment_2"


    // $ANTLR start "rule__Examples__StatementsAssignment_4"
    // InternalCucumber.g:2522:1: rule__Examples__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__Examples__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2526:1: ( ( ruleStatement ) )
            // InternalCucumber.g:2527:2: ( ruleStatement )
            {
            // InternalCucumber.g:2527:2: ( ruleStatement )
            // InternalCucumber.g:2528:3: ruleStatement
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
    // InternalCucumber.g:2537:1: rule__Examples__TheExamplesTableAssignment_5 : ( ruleExamplesTable ) ;
    public final void rule__Examples__TheExamplesTableAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2541:1: ( ( ruleExamplesTable ) )
            // InternalCucumber.g:2542:2: ( ruleExamplesTable )
            {
            // InternalCucumber.g:2542:2: ( ruleExamplesTable )
            // InternalCucumber.g:2543:3: ruleExamplesTable
            {
             before(grammarAccess.getExamplesAccess().getTheExamplesTableExamplesTableParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExamplesTable();

            state._fsp--;

             after(grammarAccess.getExamplesAccess().getTheExamplesTableExamplesTableParserRuleCall_5_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__ExamplesTable__RowsAssignment"
    // InternalCucumber.g:2552:1: rule__ExamplesTable__RowsAssignment : ( ruleRow ) ;
    public final void rule__ExamplesTable__RowsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2556:1: ( ( ruleRow ) )
            // InternalCucumber.g:2557:2: ( ruleRow )
            {
            // InternalCucumber.g:2557:2: ( ruleRow )
            // InternalCucumber.g:2558:3: ruleRow
            {
             before(grammarAccess.getExamplesTableAccess().getRowsRowParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getExamplesTableAccess().getRowsRowParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamplesTable__RowsAssignment"


    // $ANTLR start "rule__StepTable__RowsAssignment"
    // InternalCucumber.g:2567:1: rule__StepTable__RowsAssignment : ( ruleRow ) ;
    public final void rule__StepTable__RowsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2571:1: ( ( ruleRow ) )
            // InternalCucumber.g:2572:2: ( ruleRow )
            {
            // InternalCucumber.g:2572:2: ( ruleRow )
            // InternalCucumber.g:2573:3: ruleRow
            {
             before(grammarAccess.getStepTableAccess().getRowsRowParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getStepTableAccess().getRowsRowParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepTable__RowsAssignment"


    // $ANTLR start "rule__Row__CellsAssignment_0"
    // InternalCucumber.g:2582:1: rule__Row__CellsAssignment_0 : ( ruleCell ) ;
    public final void rule__Row__CellsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2586:1: ( ( ruleCell ) )
            // InternalCucumber.g:2587:2: ( ruleCell )
            {
            // InternalCucumber.g:2587:2: ( ruleCell )
            // InternalCucumber.g:2588:3: ruleCell
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
    // InternalCucumber.g:2597:1: rule__Cell__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__Cell__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2601:1: ( ( rulePhrase ) )
            // InternalCucumber.g:2602:2: ( rulePhrase )
            {
            // InternalCucumber.g:2602:2: ( rulePhrase )
            // InternalCucumber.g:2603:3: rulePhrase
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


    // $ANTLR start "rule__Step__NameAssignment_1"
    // InternalCucumber.g:2612:1: rule__Step__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__Step__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2616:1: ( ( rulePhrase ) )
            // InternalCucumber.g:2617:2: ( rulePhrase )
            {
            // InternalCucumber.g:2617:2: ( rulePhrase )
            // InternalCucumber.g:2618:3: rulePhrase
            {
             before(grammarAccess.getStepAccess().getNamePhraseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getStepAccess().getNamePhraseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__NameAssignment_1"


    // $ANTLR start "rule__Step__TheStepTableAssignment_3_0"
    // InternalCucumber.g:2627:1: rule__Step__TheStepTableAssignment_3_0 : ( ruleStepTable ) ;
    public final void rule__Step__TheStepTableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2631:1: ( ( ruleStepTable ) )
            // InternalCucumber.g:2632:2: ( ruleStepTable )
            {
            // InternalCucumber.g:2632:2: ( ruleStepTable )
            // InternalCucumber.g:2633:3: ruleStepTable
            {
             before(grammarAccess.getStepAccess().getTheStepTableStepTableParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStepTable();

            state._fsp--;

             after(grammarAccess.getStepAccess().getTheStepTableStepTableParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__TheStepTableAssignment_3_0"


    // $ANTLR start "rule__Step__TheDocStringAssignment_3_1"
    // InternalCucumber.g:2642:1: rule__Step__TheDocStringAssignment_3_1 : ( ruleDocString ) ;
    public final void rule__Step__TheDocStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2646:1: ( ( ruleDocString ) )
            // InternalCucumber.g:2647:2: ( ruleDocString )
            {
            // InternalCucumber.g:2647:2: ( ruleDocString )
            // InternalCucumber.g:2648:3: ruleDocString
            {
             before(grammarAccess.getStepAccess().getTheDocStringDocStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDocString();

            state._fsp--;

             after(grammarAccess.getStepAccess().getTheDocStringDocStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__TheDocStringAssignment_3_1"


    // $ANTLR start "rule__DocString__LinesAssignment_2"
    // InternalCucumber.g:2657:1: rule__DocString__LinesAssignment_2 : ( ruleLine ) ;
    public final void rule__DocString__LinesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2661:1: ( ( ruleLine ) )
            // InternalCucumber.g:2662:2: ( ruleLine )
            {
            // InternalCucumber.g:2662:2: ( ruleLine )
            // InternalCucumber.g:2663:3: ruleLine
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


    // $ANTLR start "rule__Statement__NameAssignment_0"
    // InternalCucumber.g:2672:1: rule__Statement__NameAssignment_0 : ( rulePhrase ) ;
    public final void rule__Statement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2676:1: ( ( rulePhrase ) )
            // InternalCucumber.g:2677:2: ( rulePhrase )
            {
            // InternalCucumber.g:2677:2: ( rulePhrase )
            // InternalCucumber.g:2678:3: rulePhrase
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
    // InternalCucumber.g:2687:1: rule__Tag__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Tag__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2691:1: ( ( RULE_ID ) )
            // InternalCucumber.g:2692:2: ( RULE_ID )
            {
            // InternalCucumber.g:2692:2: ( RULE_ID )
            // InternalCucumber.g:2693:3: RULE_ID
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


    // $ANTLR start "rule__Line__NameAssignment_0"
    // InternalCucumber.g:2702:1: rule__Line__NameAssignment_0 : ( ruleLineBits ) ;
    public final void rule__Line__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2706:1: ( ( ruleLineBits ) )
            // InternalCucumber.g:2707:2: ( ruleLineBits )
            {
            // InternalCucumber.g:2707:2: ( ruleLineBits )
            // InternalCucumber.g:2708:3: ruleLineBits
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

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\1\20\1\uffff\1\5\2\uffff\1\7\1\5\1\21\1\7";
    static final String dfa_3s = "\1\26\1\uffff\1\5\2\uffff\1\26\1\5\1\22\1\26";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\2\1\3\4\uffff";
    static final String dfa_5s = "\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\3\1\4\3\uffff\1\2",
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

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "523:1: rule__AbstractScenario__Alternatives : ( ( ruleBackground ) | ( ruleScenario ) | ( ruleScenarioOutline ) );";
        }
    }
    static final String dfa_7s = "\10\uffff";
    static final String dfa_8s = "\1\1\7\uffff";
    static final String dfa_9s = "\1\20\1\uffff\1\5\1\uffff\1\7\1\5\1\21\1\7";
    static final String dfa_10s = "\1\26\1\uffff\1\5\1\uffff\1\26\1\5\1\23\1\26";
    static final String dfa_11s = "\1\uffff\1\2\1\uffff\1\1\4\uffff";
    static final String dfa_12s = "\10\uffff}>";
    static final String[] dfa_13s = {
            "\3\1\1\3\2\uffff\1\2",
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
            return "()* loopback of 1404:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000470070L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000470002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000007C70L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000007C02L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000470000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000487C70L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000487C72L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100070L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});

}
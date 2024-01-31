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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WORD", "RULE_ID", "RULE_STRING", "RULE_EOL", "RULE_WS", "RULE_SL_COMMENT", "'Feature:'", "'Background:'", "'Scenario:'", "'Scenario Outline:'", "'Examples:'", "'|'", "'\"\"\"'", "'Given'", "'When'", "'Then'", "'And'", "'But'", "'*'", "'@'"
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

                if ( (LA1_0==15) ) {
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

                if ( (LA2_0==15) ) {
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
    // InternalCucumber.g:326:1: ruleStep : ( ( rule__Step__Alternatives ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:330:2: ( ( ( rule__Step__Alternatives ) ) )
            // InternalCucumber.g:331:2: ( ( rule__Step__Alternatives ) )
            {
            // InternalCucumber.g:331:2: ( ( rule__Step__Alternatives ) )
            // InternalCucumber.g:332:3: ( rule__Step__Alternatives )
            {
             before(grammarAccess.getStepAccess().getAlternatives()); 
            // InternalCucumber.g:333:3: ( rule__Step__Alternatives )
            // InternalCucumber.g:333:4: rule__Step__Alternatives
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


    // $ANTLR start "entryRuleGiven"
    // InternalCucumber.g:367:1: entryRuleGiven : ruleGiven EOF ;
    public final void entryRuleGiven() throws RecognitionException {
        try {
            // InternalCucumber.g:368:1: ( ruleGiven EOF )
            // InternalCucumber.g:369:1: ruleGiven EOF
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
    // InternalCucumber.g:376:1: ruleGiven : ( ( rule__Given__Group__0 ) ) ;
    public final void ruleGiven() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:380:2: ( ( ( rule__Given__Group__0 ) ) )
            // InternalCucumber.g:381:2: ( ( rule__Given__Group__0 ) )
            {
            // InternalCucumber.g:381:2: ( ( rule__Given__Group__0 ) )
            // InternalCucumber.g:382:3: ( rule__Given__Group__0 )
            {
             before(grammarAccess.getGivenAccess().getGroup()); 
            // InternalCucumber.g:383:3: ( rule__Given__Group__0 )
            // InternalCucumber.g:383:4: rule__Given__Group__0
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
    // InternalCucumber.g:392:1: entryRuleWhen : ruleWhen EOF ;
    public final void entryRuleWhen() throws RecognitionException {
        try {
            // InternalCucumber.g:393:1: ( ruleWhen EOF )
            // InternalCucumber.g:394:1: ruleWhen EOF
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
    // InternalCucumber.g:401:1: ruleWhen : ( ( rule__When__Group__0 ) ) ;
    public final void ruleWhen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:405:2: ( ( ( rule__When__Group__0 ) ) )
            // InternalCucumber.g:406:2: ( ( rule__When__Group__0 ) )
            {
            // InternalCucumber.g:406:2: ( ( rule__When__Group__0 ) )
            // InternalCucumber.g:407:3: ( rule__When__Group__0 )
            {
             before(grammarAccess.getWhenAccess().getGroup()); 
            // InternalCucumber.g:408:3: ( rule__When__Group__0 )
            // InternalCucumber.g:408:4: rule__When__Group__0
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
    // InternalCucumber.g:417:1: entryRuleThen : ruleThen EOF ;
    public final void entryRuleThen() throws RecognitionException {
        try {
            // InternalCucumber.g:418:1: ( ruleThen EOF )
            // InternalCucumber.g:419:1: ruleThen EOF
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
    // InternalCucumber.g:426:1: ruleThen : ( ( rule__Then__Group__0 ) ) ;
    public final void ruleThen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:430:2: ( ( ( rule__Then__Group__0 ) ) )
            // InternalCucumber.g:431:2: ( ( rule__Then__Group__0 ) )
            {
            // InternalCucumber.g:431:2: ( ( rule__Then__Group__0 ) )
            // InternalCucumber.g:432:3: ( rule__Then__Group__0 )
            {
             before(grammarAccess.getThenAccess().getGroup()); 
            // InternalCucumber.g:433:3: ( rule__Then__Group__0 )
            // InternalCucumber.g:433:4: rule__Then__Group__0
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
    // InternalCucumber.g:442:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalCucumber.g:443:1: ( ruleAnd EOF )
            // InternalCucumber.g:444:1: ruleAnd EOF
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
    // InternalCucumber.g:451:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:455:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalCucumber.g:456:2: ( ( rule__And__Group__0 ) )
            {
            // InternalCucumber.g:456:2: ( ( rule__And__Group__0 ) )
            // InternalCucumber.g:457:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalCucumber.g:458:3: ( rule__And__Group__0 )
            // InternalCucumber.g:458:4: rule__And__Group__0
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
    // InternalCucumber.g:467:1: entryRuleBut : ruleBut EOF ;
    public final void entryRuleBut() throws RecognitionException {
        try {
            // InternalCucumber.g:468:1: ( ruleBut EOF )
            // InternalCucumber.g:469:1: ruleBut EOF
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
    // InternalCucumber.g:476:1: ruleBut : ( ( rule__But__Group__0 ) ) ;
    public final void ruleBut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:480:2: ( ( ( rule__But__Group__0 ) ) )
            // InternalCucumber.g:481:2: ( ( rule__But__Group__0 ) )
            {
            // InternalCucumber.g:481:2: ( ( rule__But__Group__0 ) )
            // InternalCucumber.g:482:3: ( rule__But__Group__0 )
            {
             before(grammarAccess.getButAccess().getGroup()); 
            // InternalCucumber.g:483:3: ( rule__But__Group__0 )
            // InternalCucumber.g:483:4: rule__But__Group__0
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
    // InternalCucumber.g:492:1: entryRuleAsterisk : ruleAsterisk EOF ;
    public final void entryRuleAsterisk() throws RecognitionException {
        try {
            // InternalCucumber.g:493:1: ( ruleAsterisk EOF )
            // InternalCucumber.g:494:1: ruleAsterisk EOF
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
    // InternalCucumber.g:501:1: ruleAsterisk : ( ( rule__Asterisk__Group__0 ) ) ;
    public final void ruleAsterisk() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:505:2: ( ( ( rule__Asterisk__Group__0 ) ) )
            // InternalCucumber.g:506:2: ( ( rule__Asterisk__Group__0 ) )
            {
            // InternalCucumber.g:506:2: ( ( rule__Asterisk__Group__0 ) )
            // InternalCucumber.g:507:3: ( rule__Asterisk__Group__0 )
            {
             before(grammarAccess.getAsteriskAccess().getGroup()); 
            // InternalCucumber.g:508:3: ( rule__Asterisk__Group__0 )
            // InternalCucumber.g:508:4: rule__Asterisk__Group__0
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
    // InternalCucumber.g:517:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalCucumber.g:518:1: ( ruleStatement EOF )
            // InternalCucumber.g:519:1: ruleStatement EOF
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
    // InternalCucumber.g:526:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:530:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalCucumber.g:531:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalCucumber.g:531:2: ( ( rule__Statement__Group__0 ) )
            // InternalCucumber.g:532:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalCucumber.g:533:3: ( rule__Statement__Group__0 )
            // InternalCucumber.g:533:4: rule__Statement__Group__0
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
    // InternalCucumber.g:542:1: entryRulePhrase : rulePhrase EOF ;
    public final void entryRulePhrase() throws RecognitionException {
        try {
            // InternalCucumber.g:543:1: ( rulePhrase EOF )
            // InternalCucumber.g:544:1: rulePhrase EOF
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
    // InternalCucumber.g:551:1: rulePhrase : ( ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* ) ) ;
    public final void rulePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:555:2: ( ( ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* ) ) )
            // InternalCucumber.g:556:2: ( ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* ) )
            {
            // InternalCucumber.g:556:2: ( ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* ) )
            // InternalCucumber.g:557:3: ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* )
            {
            // InternalCucumber.g:557:3: ( ( ruleTEXT_LITERAL ) )
            // InternalCucumber.g:558:4: ( ruleTEXT_LITERAL )
            {
             before(grammarAccess.getPhraseAccess().getTEXT_LITERALParserRuleCall()); 
            // InternalCucumber.g:559:4: ( ruleTEXT_LITERAL )
            // InternalCucumber.g:559:5: ruleTEXT_LITERAL
            {
            pushFollow(FOLLOW_4);
            ruleTEXT_LITERAL();

            state._fsp--;


            }

             after(grammarAccess.getPhraseAccess().getTEXT_LITERALParserRuleCall()); 

            }

            // InternalCucumber.g:562:3: ( ( ruleTEXT_LITERAL )* )
            // InternalCucumber.g:563:4: ( ruleTEXT_LITERAL )*
            {
             before(grammarAccess.getPhraseAccess().getTEXT_LITERALParserRuleCall()); 
            // InternalCucumber.g:564:4: ( ruleTEXT_LITERAL )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_WORD && LA3_0<=RULE_STRING)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCucumber.g:564:5: ruleTEXT_LITERAL
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
    // InternalCucumber.g:574:1: entryRuleTag : ruleTag EOF ;
    public final void entryRuleTag() throws RecognitionException {
        try {
            // InternalCucumber.g:575:1: ( ruleTag EOF )
            // InternalCucumber.g:576:1: ruleTag EOF
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
    // InternalCucumber.g:583:1: ruleTag : ( ( rule__Tag__Group__0 ) ) ;
    public final void ruleTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:587:2: ( ( ( rule__Tag__Group__0 ) ) )
            // InternalCucumber.g:588:2: ( ( rule__Tag__Group__0 ) )
            {
            // InternalCucumber.g:588:2: ( ( rule__Tag__Group__0 ) )
            // InternalCucumber.g:589:3: ( rule__Tag__Group__0 )
            {
             before(grammarAccess.getTagAccess().getGroup()); 
            // InternalCucumber.g:590:3: ( rule__Tag__Group__0 )
            // InternalCucumber.g:590:4: rule__Tag__Group__0
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


    // $ANTLR start "entryRuleTEXT_LITERAL"
    // InternalCucumber.g:599:1: entryRuleTEXT_LITERAL : ruleTEXT_LITERAL EOF ;
    public final void entryRuleTEXT_LITERAL() throws RecognitionException {
        try {
            // InternalCucumber.g:600:1: ( ruleTEXT_LITERAL EOF )
            // InternalCucumber.g:601:1: ruleTEXT_LITERAL EOF
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
    // InternalCucumber.g:608:1: ruleTEXT_LITERAL : ( ( rule__TEXT_LITERAL__Alternatives ) ) ;
    public final void ruleTEXT_LITERAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:612:2: ( ( ( rule__TEXT_LITERAL__Alternatives ) ) )
            // InternalCucumber.g:613:2: ( ( rule__TEXT_LITERAL__Alternatives ) )
            {
            // InternalCucumber.g:613:2: ( ( rule__TEXT_LITERAL__Alternatives ) )
            // InternalCucumber.g:614:3: ( rule__TEXT_LITERAL__Alternatives )
            {
             before(grammarAccess.getTEXT_LITERALAccess().getAlternatives()); 
            // InternalCucumber.g:615:3: ( rule__TEXT_LITERAL__Alternatives )
            // InternalCucumber.g:615:4: rule__TEXT_LITERAL__Alternatives
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
    // InternalCucumber.g:623:1: rule__AbstractScenario__Alternatives : ( ( ruleBackground ) | ( ruleScenario ) | ( ruleScenarioOutline ) );
    public final void rule__AbstractScenario__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:627:1: ( ( ruleBackground ) | ( ruleScenario ) | ( ruleScenarioOutline ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalCucumber.g:628:2: ( ruleBackground )
                    {
                    // InternalCucumber.g:628:2: ( ruleBackground )
                    // InternalCucumber.g:629:3: ruleBackground
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
                    // InternalCucumber.g:634:2: ( ruleScenario )
                    {
                    // InternalCucumber.g:634:2: ( ruleScenario )
                    // InternalCucumber.g:635:3: ruleScenario
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
                    // InternalCucumber.g:640:2: ( ruleScenarioOutline )
                    {
                    // InternalCucumber.g:640:2: ( ruleScenarioOutline )
                    // InternalCucumber.g:641:3: ruleScenarioOutline
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
    // InternalCucumber.g:650:1: rule__Step__Alternatives : ( ( ruleGiven ) | ( ruleWhen ) | ( ruleThen ) | ( ruleAnd ) | ( ruleBut ) | ( ruleAsterisk ) );
    public final void rule__Step__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:654:1: ( ( ruleGiven ) | ( ruleWhen ) | ( ruleThen ) | ( ruleAnd ) | ( ruleBut ) | ( ruleAsterisk ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case 19:
                {
                alt5=3;
                }
                break;
            case 20:
                {
                alt5=4;
                }
                break;
            case 21:
                {
                alt5=5;
                }
                break;
            case 22:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalCucumber.g:655:2: ( ruleGiven )
                    {
                    // InternalCucumber.g:655:2: ( ruleGiven )
                    // InternalCucumber.g:656:3: ruleGiven
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
                    // InternalCucumber.g:661:2: ( ruleWhen )
                    {
                    // InternalCucumber.g:661:2: ( ruleWhen )
                    // InternalCucumber.g:662:3: ruleWhen
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
                    // InternalCucumber.g:667:2: ( ruleThen )
                    {
                    // InternalCucumber.g:667:2: ( ruleThen )
                    // InternalCucumber.g:668:3: ruleThen
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
                    // InternalCucumber.g:673:2: ( ruleAnd )
                    {
                    // InternalCucumber.g:673:2: ( ruleAnd )
                    // InternalCucumber.g:674:3: ruleAnd
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
                    // InternalCucumber.g:679:2: ( ruleBut )
                    {
                    // InternalCucumber.g:679:2: ( ruleBut )
                    // InternalCucumber.g:680:3: ruleBut
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
                    // InternalCucumber.g:685:2: ( ruleAsterisk )
                    {
                    // InternalCucumber.g:685:2: ( ruleAsterisk )
                    // InternalCucumber.g:686:3: ruleAsterisk
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


    // $ANTLR start "rule__Given__Alternatives_3"
    // InternalCucumber.g:695:1: rule__Given__Alternatives_3 : ( ( ( rule__Given__TheStepTableAssignment_3_0 ) ) | ( ( rule__Given__TheDocStringAssignment_3_1 ) ) );
    public final void rule__Given__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:699:1: ( ( ( rule__Given__TheStepTableAssignment_3_0 ) ) | ( ( rule__Given__TheDocStringAssignment_3_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCucumber.g:700:2: ( ( rule__Given__TheStepTableAssignment_3_0 ) )
                    {
                    // InternalCucumber.g:700:2: ( ( rule__Given__TheStepTableAssignment_3_0 ) )
                    // InternalCucumber.g:701:3: ( rule__Given__TheStepTableAssignment_3_0 )
                    {
                     before(grammarAccess.getGivenAccess().getTheStepTableAssignment_3_0()); 
                    // InternalCucumber.g:702:3: ( rule__Given__TheStepTableAssignment_3_0 )
                    // InternalCucumber.g:702:4: rule__Given__TheStepTableAssignment_3_0
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
                    // InternalCucumber.g:706:2: ( ( rule__Given__TheDocStringAssignment_3_1 ) )
                    {
                    // InternalCucumber.g:706:2: ( ( rule__Given__TheDocStringAssignment_3_1 ) )
                    // InternalCucumber.g:707:3: ( rule__Given__TheDocStringAssignment_3_1 )
                    {
                     before(grammarAccess.getGivenAccess().getTheDocStringAssignment_3_1()); 
                    // InternalCucumber.g:708:3: ( rule__Given__TheDocStringAssignment_3_1 )
                    // InternalCucumber.g:708:4: rule__Given__TheDocStringAssignment_3_1
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
    // InternalCucumber.g:716:1: rule__When__Alternatives_3 : ( ( ( rule__When__TheStepTableAssignment_3_0 ) ) | ( ( rule__When__TheDocStringAssignment_3_1 ) ) );
    public final void rule__When__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:720:1: ( ( ( rule__When__TheStepTableAssignment_3_0 ) ) | ( ( rule__When__TheDocStringAssignment_3_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCucumber.g:721:2: ( ( rule__When__TheStepTableAssignment_3_0 ) )
                    {
                    // InternalCucumber.g:721:2: ( ( rule__When__TheStepTableAssignment_3_0 ) )
                    // InternalCucumber.g:722:3: ( rule__When__TheStepTableAssignment_3_0 )
                    {
                     before(grammarAccess.getWhenAccess().getTheStepTableAssignment_3_0()); 
                    // InternalCucumber.g:723:3: ( rule__When__TheStepTableAssignment_3_0 )
                    // InternalCucumber.g:723:4: rule__When__TheStepTableAssignment_3_0
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
                    // InternalCucumber.g:727:2: ( ( rule__When__TheDocStringAssignment_3_1 ) )
                    {
                    // InternalCucumber.g:727:2: ( ( rule__When__TheDocStringAssignment_3_1 ) )
                    // InternalCucumber.g:728:3: ( rule__When__TheDocStringAssignment_3_1 )
                    {
                     before(grammarAccess.getWhenAccess().getTheDocStringAssignment_3_1()); 
                    // InternalCucumber.g:729:3: ( rule__When__TheDocStringAssignment_3_1 )
                    // InternalCucumber.g:729:4: rule__When__TheDocStringAssignment_3_1
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
    // InternalCucumber.g:737:1: rule__Then__Alternatives_3 : ( ( ( rule__Then__TheStepTableAssignment_3_0 ) ) | ( ( rule__Then__TheDocStringAssignment_3_1 ) ) );
    public final void rule__Then__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:741:1: ( ( ( rule__Then__TheStepTableAssignment_3_0 ) ) | ( ( rule__Then__TheDocStringAssignment_3_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            else if ( (LA8_0==16) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCucumber.g:742:2: ( ( rule__Then__TheStepTableAssignment_3_0 ) )
                    {
                    // InternalCucumber.g:742:2: ( ( rule__Then__TheStepTableAssignment_3_0 ) )
                    // InternalCucumber.g:743:3: ( rule__Then__TheStepTableAssignment_3_0 )
                    {
                     before(grammarAccess.getThenAccess().getTheStepTableAssignment_3_0()); 
                    // InternalCucumber.g:744:3: ( rule__Then__TheStepTableAssignment_3_0 )
                    // InternalCucumber.g:744:4: rule__Then__TheStepTableAssignment_3_0
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
                    // InternalCucumber.g:748:2: ( ( rule__Then__TheDocStringAssignment_3_1 ) )
                    {
                    // InternalCucumber.g:748:2: ( ( rule__Then__TheDocStringAssignment_3_1 ) )
                    // InternalCucumber.g:749:3: ( rule__Then__TheDocStringAssignment_3_1 )
                    {
                     before(grammarAccess.getThenAccess().getTheDocStringAssignment_3_1()); 
                    // InternalCucumber.g:750:3: ( rule__Then__TheDocStringAssignment_3_1 )
                    // InternalCucumber.g:750:4: rule__Then__TheDocStringAssignment_3_1
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
    // InternalCucumber.g:758:1: rule__And__Alternatives_3 : ( ( ( rule__And__TheStepTableAssignment_3_0 ) ) | ( ( rule__And__TheDocStringAssignment_3_1 ) ) );
    public final void rule__And__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:762:1: ( ( ( rule__And__TheStepTableAssignment_3_0 ) ) | ( ( rule__And__TheDocStringAssignment_3_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            else if ( (LA9_0==16) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalCucumber.g:763:2: ( ( rule__And__TheStepTableAssignment_3_0 ) )
                    {
                    // InternalCucumber.g:763:2: ( ( rule__And__TheStepTableAssignment_3_0 ) )
                    // InternalCucumber.g:764:3: ( rule__And__TheStepTableAssignment_3_0 )
                    {
                     before(grammarAccess.getAndAccess().getTheStepTableAssignment_3_0()); 
                    // InternalCucumber.g:765:3: ( rule__And__TheStepTableAssignment_3_0 )
                    // InternalCucumber.g:765:4: rule__And__TheStepTableAssignment_3_0
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
                    // InternalCucumber.g:769:2: ( ( rule__And__TheDocStringAssignment_3_1 ) )
                    {
                    // InternalCucumber.g:769:2: ( ( rule__And__TheDocStringAssignment_3_1 ) )
                    // InternalCucumber.g:770:3: ( rule__And__TheDocStringAssignment_3_1 )
                    {
                     before(grammarAccess.getAndAccess().getTheDocStringAssignment_3_1()); 
                    // InternalCucumber.g:771:3: ( rule__And__TheDocStringAssignment_3_1 )
                    // InternalCucumber.g:771:4: rule__And__TheDocStringAssignment_3_1
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


    // $ANTLR start "rule__But__Alternatives_3"
    // InternalCucumber.g:779:1: rule__But__Alternatives_3 : ( ( ( rule__But__TheStepTableAssignment_3_0 ) ) | ( ( rule__But__TheDocStringAssignment_3_1 ) ) );
    public final void rule__But__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:783:1: ( ( ( rule__But__TheStepTableAssignment_3_0 ) ) | ( ( rule__But__TheDocStringAssignment_3_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            else if ( (LA10_0==16) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalCucumber.g:784:2: ( ( rule__But__TheStepTableAssignment_3_0 ) )
                    {
                    // InternalCucumber.g:784:2: ( ( rule__But__TheStepTableAssignment_3_0 ) )
                    // InternalCucumber.g:785:3: ( rule__But__TheStepTableAssignment_3_0 )
                    {
                     before(grammarAccess.getButAccess().getTheStepTableAssignment_3_0()); 
                    // InternalCucumber.g:786:3: ( rule__But__TheStepTableAssignment_3_0 )
                    // InternalCucumber.g:786:4: rule__But__TheStepTableAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__But__TheStepTableAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getButAccess().getTheStepTableAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:790:2: ( ( rule__But__TheDocStringAssignment_3_1 ) )
                    {
                    // InternalCucumber.g:790:2: ( ( rule__But__TheDocStringAssignment_3_1 ) )
                    // InternalCucumber.g:791:3: ( rule__But__TheDocStringAssignment_3_1 )
                    {
                     before(grammarAccess.getButAccess().getTheDocStringAssignment_3_1()); 
                    // InternalCucumber.g:792:3: ( rule__But__TheDocStringAssignment_3_1 )
                    // InternalCucumber.g:792:4: rule__But__TheDocStringAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__But__TheDocStringAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getButAccess().getTheDocStringAssignment_3_1()); 

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
    // $ANTLR end "rule__But__Alternatives_3"


    // $ANTLR start "rule__Asterisk__Alternatives_3"
    // InternalCucumber.g:800:1: rule__Asterisk__Alternatives_3 : ( ( ( rule__Asterisk__TheStepTableAssignment_3_0 ) ) | ( ( rule__Asterisk__TheDocStringAssignment_3_1 ) ) );
    public final void rule__Asterisk__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:804:1: ( ( ( rule__Asterisk__TheStepTableAssignment_3_0 ) ) | ( ( rule__Asterisk__TheDocStringAssignment_3_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            else if ( (LA11_0==16) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalCucumber.g:805:2: ( ( rule__Asterisk__TheStepTableAssignment_3_0 ) )
                    {
                    // InternalCucumber.g:805:2: ( ( rule__Asterisk__TheStepTableAssignment_3_0 ) )
                    // InternalCucumber.g:806:3: ( rule__Asterisk__TheStepTableAssignment_3_0 )
                    {
                     before(grammarAccess.getAsteriskAccess().getTheStepTableAssignment_3_0()); 
                    // InternalCucumber.g:807:3: ( rule__Asterisk__TheStepTableAssignment_3_0 )
                    // InternalCucumber.g:807:4: rule__Asterisk__TheStepTableAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Asterisk__TheStepTableAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAsteriskAccess().getTheStepTableAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:811:2: ( ( rule__Asterisk__TheDocStringAssignment_3_1 ) )
                    {
                    // InternalCucumber.g:811:2: ( ( rule__Asterisk__TheDocStringAssignment_3_1 ) )
                    // InternalCucumber.g:812:3: ( rule__Asterisk__TheDocStringAssignment_3_1 )
                    {
                     before(grammarAccess.getAsteriskAccess().getTheDocStringAssignment_3_1()); 
                    // InternalCucumber.g:813:3: ( rule__Asterisk__TheDocStringAssignment_3_1 )
                    // InternalCucumber.g:813:4: rule__Asterisk__TheDocStringAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Asterisk__TheDocStringAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAsteriskAccess().getTheDocStringAssignment_3_1()); 

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
    // $ANTLR end "rule__Asterisk__Alternatives_3"


    // $ANTLR start "rule__TEXT_LITERAL__Alternatives"
    // InternalCucumber.g:821:1: rule__TEXT_LITERAL__Alternatives : ( ( RULE_WORD ) | ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__TEXT_LITERAL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:825:1: ( ( RULE_WORD ) | ( RULE_ID ) | ( RULE_STRING ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                alt12=1;
                }
                break;
            case RULE_ID:
                {
                alt12=2;
                }
                break;
            case RULE_STRING:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalCucumber.g:826:2: ( RULE_WORD )
                    {
                    // InternalCucumber.g:826:2: ( RULE_WORD )
                    // InternalCucumber.g:827:3: RULE_WORD
                    {
                     before(grammarAccess.getTEXT_LITERALAccess().getWORDTerminalRuleCall_0()); 
                    match(input,RULE_WORD,FOLLOW_2); 
                     after(grammarAccess.getTEXT_LITERALAccess().getWORDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:832:2: ( RULE_ID )
                    {
                    // InternalCucumber.g:832:2: ( RULE_ID )
                    // InternalCucumber.g:833:3: RULE_ID
                    {
                     before(grammarAccess.getTEXT_LITERALAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getTEXT_LITERALAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCucumber.g:838:2: ( RULE_STRING )
                    {
                    // InternalCucumber.g:838:2: ( RULE_STRING )
                    // InternalCucumber.g:839:3: RULE_STRING
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
    // InternalCucumber.g:848:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:852:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalCucumber.g:853:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
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
    // InternalCucumber.g:860:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__Group_0__0 )? ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:864:1: ( ( ( rule__Feature__Group_0__0 )? ) )
            // InternalCucumber.g:865:1: ( ( rule__Feature__Group_0__0 )? )
            {
            // InternalCucumber.g:865:1: ( ( rule__Feature__Group_0__0 )? )
            // InternalCucumber.g:866:2: ( rule__Feature__Group_0__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_0()); 
            // InternalCucumber.g:867:2: ( rule__Feature__Group_0__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCucumber.g:867:3: rule__Feature__Group_0__0
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
    // InternalCucumber.g:875:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:879:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalCucumber.g:880:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
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
    // InternalCucumber.g:887:1: rule__Feature__Group__1__Impl : ( 'Feature:' ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:891:1: ( ( 'Feature:' ) )
            // InternalCucumber.g:892:1: ( 'Feature:' )
            {
            // InternalCucumber.g:892:1: ( 'Feature:' )
            // InternalCucumber.g:893:2: 'Feature:'
            {
             before(grammarAccess.getFeatureAccess().getFeatureKeyword_1()); 
            match(input,10,FOLLOW_2); 
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
    // InternalCucumber.g:902:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:906:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalCucumber.g:907:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
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
    // InternalCucumber.g:914:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__NameAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:918:1: ( ( ( rule__Feature__NameAssignment_2 ) ) )
            // InternalCucumber.g:919:1: ( ( rule__Feature__NameAssignment_2 ) )
            {
            // InternalCucumber.g:919:1: ( ( rule__Feature__NameAssignment_2 ) )
            // InternalCucumber.g:920:2: ( rule__Feature__NameAssignment_2 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_2()); 
            // InternalCucumber.g:921:2: ( rule__Feature__NameAssignment_2 )
            // InternalCucumber.g:921:3: rule__Feature__NameAssignment_2
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
    // InternalCucumber.g:929:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:933:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalCucumber.g:934:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
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
    // InternalCucumber.g:941:1: rule__Feature__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:945:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:946:1: ( RULE_EOL )
            {
            // InternalCucumber.g:946:1: ( RULE_EOL )
            // InternalCucumber.g:947:2: RULE_EOL
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
    // InternalCucumber.g:956:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl rule__Feature__Group__5 ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:960:1: ( rule__Feature__Group__4__Impl rule__Feature__Group__5 )
            // InternalCucumber.g:961:2: rule__Feature__Group__4__Impl rule__Feature__Group__5
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
    // InternalCucumber.g:968:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__StatementsAssignment_4 )* ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:972:1: ( ( ( rule__Feature__StatementsAssignment_4 )* ) )
            // InternalCucumber.g:973:1: ( ( rule__Feature__StatementsAssignment_4 )* )
            {
            // InternalCucumber.g:973:1: ( ( rule__Feature__StatementsAssignment_4 )* )
            // InternalCucumber.g:974:2: ( rule__Feature__StatementsAssignment_4 )*
            {
             before(grammarAccess.getFeatureAccess().getStatementsAssignment_4()); 
            // InternalCucumber.g:975:2: ( rule__Feature__StatementsAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_WORD && LA14_0<=RULE_STRING)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCucumber.g:975:3: rule__Feature__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_4);
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
    // InternalCucumber.g:983:1: rule__Feature__Group__5 : rule__Feature__Group__5__Impl ;
    public final void rule__Feature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:987:1: ( rule__Feature__Group__5__Impl )
            // InternalCucumber.g:988:2: rule__Feature__Group__5__Impl
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
    // InternalCucumber.g:994:1: rule__Feature__Group__5__Impl : ( ( rule__Feature__AbstractScenariosAssignment_5 )* ) ;
    public final void rule__Feature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:998:1: ( ( ( rule__Feature__AbstractScenariosAssignment_5 )* ) )
            // InternalCucumber.g:999:1: ( ( rule__Feature__AbstractScenariosAssignment_5 )* )
            {
            // InternalCucumber.g:999:1: ( ( rule__Feature__AbstractScenariosAssignment_5 )* )
            // InternalCucumber.g:1000:2: ( rule__Feature__AbstractScenariosAssignment_5 )*
            {
             before(grammarAccess.getFeatureAccess().getAbstractScenariosAssignment_5()); 
            // InternalCucumber.g:1001:2: ( rule__Feature__AbstractScenariosAssignment_5 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=11 && LA15_0<=13)||LA15_0==23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCucumber.g:1001:3: rule__Feature__AbstractScenariosAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
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


    // $ANTLR start "rule__Feature__Group_0__0"
    // InternalCucumber.g:1010:1: rule__Feature__Group_0__0 : rule__Feature__Group_0__0__Impl rule__Feature__Group_0__1 ;
    public final void rule__Feature__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1014:1: ( rule__Feature__Group_0__0__Impl rule__Feature__Group_0__1 )
            // InternalCucumber.g:1015:2: rule__Feature__Group_0__0__Impl rule__Feature__Group_0__1
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
    // InternalCucumber.g:1022:1: rule__Feature__Group_0__0__Impl : ( ( ( rule__Feature__TagsAssignment_0_0 ) ) ( ( rule__Feature__TagsAssignment_0_0 )* ) ) ;
    public final void rule__Feature__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1026:1: ( ( ( ( rule__Feature__TagsAssignment_0_0 ) ) ( ( rule__Feature__TagsAssignment_0_0 )* ) ) )
            // InternalCucumber.g:1027:1: ( ( ( rule__Feature__TagsAssignment_0_0 ) ) ( ( rule__Feature__TagsAssignment_0_0 )* ) )
            {
            // InternalCucumber.g:1027:1: ( ( ( rule__Feature__TagsAssignment_0_0 ) ) ( ( rule__Feature__TagsAssignment_0_0 )* ) )
            // InternalCucumber.g:1028:2: ( ( rule__Feature__TagsAssignment_0_0 ) ) ( ( rule__Feature__TagsAssignment_0_0 )* )
            {
            // InternalCucumber.g:1028:2: ( ( rule__Feature__TagsAssignment_0_0 ) )
            // InternalCucumber.g:1029:3: ( rule__Feature__TagsAssignment_0_0 )
            {
             before(grammarAccess.getFeatureAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:1030:3: ( rule__Feature__TagsAssignment_0_0 )
            // InternalCucumber.g:1030:4: rule__Feature__TagsAssignment_0_0
            {
            pushFollow(FOLLOW_10);
            rule__Feature__TagsAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTagsAssignment_0_0()); 

            }

            // InternalCucumber.g:1033:2: ( ( rule__Feature__TagsAssignment_0_0 )* )
            // InternalCucumber.g:1034:3: ( rule__Feature__TagsAssignment_0_0 )*
            {
             before(grammarAccess.getFeatureAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:1035:3: ( rule__Feature__TagsAssignment_0_0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCucumber.g:1035:4: rule__Feature__TagsAssignment_0_0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Feature__TagsAssignment_0_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalCucumber.g:1044:1: rule__Feature__Group_0__1 : rule__Feature__Group_0__1__Impl ;
    public final void rule__Feature__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1048:1: ( rule__Feature__Group_0__1__Impl )
            // InternalCucumber.g:1049:2: rule__Feature__Group_0__1__Impl
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
    // InternalCucumber.g:1055:1: rule__Feature__Group_0__1__Impl : ( RULE_EOL ) ;
    public final void rule__Feature__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1059:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1060:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1060:1: ( RULE_EOL )
            // InternalCucumber.g:1061:2: RULE_EOL
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
    // InternalCucumber.g:1071:1: rule__Background__Group__0 : rule__Background__Group__0__Impl rule__Background__Group__1 ;
    public final void rule__Background__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1075:1: ( rule__Background__Group__0__Impl rule__Background__Group__1 )
            // InternalCucumber.g:1076:2: rule__Background__Group__0__Impl rule__Background__Group__1
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
    // InternalCucumber.g:1083:1: rule__Background__Group__0__Impl : ( 'Background:' ) ;
    public final void rule__Background__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1087:1: ( ( 'Background:' ) )
            // InternalCucumber.g:1088:1: ( 'Background:' )
            {
            // InternalCucumber.g:1088:1: ( 'Background:' )
            // InternalCucumber.g:1089:2: 'Background:'
            {
             before(grammarAccess.getBackgroundAccess().getBackgroundKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalCucumber.g:1098:1: rule__Background__Group__1 : rule__Background__Group__1__Impl rule__Background__Group__2 ;
    public final void rule__Background__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1102:1: ( rule__Background__Group__1__Impl rule__Background__Group__2 )
            // InternalCucumber.g:1103:2: rule__Background__Group__1__Impl rule__Background__Group__2
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
    // InternalCucumber.g:1110:1: rule__Background__Group__1__Impl : ( ( rule__Background__NameAssignment_1 ) ) ;
    public final void rule__Background__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1114:1: ( ( ( rule__Background__NameAssignment_1 ) ) )
            // InternalCucumber.g:1115:1: ( ( rule__Background__NameAssignment_1 ) )
            {
            // InternalCucumber.g:1115:1: ( ( rule__Background__NameAssignment_1 ) )
            // InternalCucumber.g:1116:2: ( rule__Background__NameAssignment_1 )
            {
             before(grammarAccess.getBackgroundAccess().getNameAssignment_1()); 
            // InternalCucumber.g:1117:2: ( rule__Background__NameAssignment_1 )
            // InternalCucumber.g:1117:3: rule__Background__NameAssignment_1
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
    // InternalCucumber.g:1125:1: rule__Background__Group__2 : rule__Background__Group__2__Impl rule__Background__Group__3 ;
    public final void rule__Background__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1129:1: ( rule__Background__Group__2__Impl rule__Background__Group__3 )
            // InternalCucumber.g:1130:2: rule__Background__Group__2__Impl rule__Background__Group__3
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
    // InternalCucumber.g:1137:1: rule__Background__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__Background__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1141:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1142:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1142:1: ( RULE_EOL )
            // InternalCucumber.g:1143:2: RULE_EOL
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
    // InternalCucumber.g:1152:1: rule__Background__Group__3 : rule__Background__Group__3__Impl rule__Background__Group__4 ;
    public final void rule__Background__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1156:1: ( rule__Background__Group__3__Impl rule__Background__Group__4 )
            // InternalCucumber.g:1157:2: rule__Background__Group__3__Impl rule__Background__Group__4
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
    // InternalCucumber.g:1164:1: rule__Background__Group__3__Impl : ( ( rule__Background__StatementsAssignment_3 )* ) ;
    public final void rule__Background__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1168:1: ( ( ( rule__Background__StatementsAssignment_3 )* ) )
            // InternalCucumber.g:1169:1: ( ( rule__Background__StatementsAssignment_3 )* )
            {
            // InternalCucumber.g:1169:1: ( ( rule__Background__StatementsAssignment_3 )* )
            // InternalCucumber.g:1170:2: ( rule__Background__StatementsAssignment_3 )*
            {
             before(grammarAccess.getBackgroundAccess().getStatementsAssignment_3()); 
            // InternalCucumber.g:1171:2: ( rule__Background__StatementsAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_WORD && LA17_0<=RULE_STRING)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCucumber.g:1171:3: rule__Background__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Background__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalCucumber.g:1179:1: rule__Background__Group__4 : rule__Background__Group__4__Impl ;
    public final void rule__Background__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1183:1: ( rule__Background__Group__4__Impl )
            // InternalCucumber.g:1184:2: rule__Background__Group__4__Impl
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
    // InternalCucumber.g:1190:1: rule__Background__Group__4__Impl : ( ( rule__Background__StepsAssignment_4 )* ) ;
    public final void rule__Background__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1194:1: ( ( ( rule__Background__StepsAssignment_4 )* ) )
            // InternalCucumber.g:1195:1: ( ( rule__Background__StepsAssignment_4 )* )
            {
            // InternalCucumber.g:1195:1: ( ( rule__Background__StepsAssignment_4 )* )
            // InternalCucumber.g:1196:2: ( rule__Background__StepsAssignment_4 )*
            {
             before(grammarAccess.getBackgroundAccess().getStepsAssignment_4()); 
            // InternalCucumber.g:1197:2: ( rule__Background__StepsAssignment_4 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=17 && LA18_0<=22)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCucumber.g:1197:3: rule__Background__StepsAssignment_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Background__StepsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalCucumber.g:1206:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1210:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalCucumber.g:1211:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
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
    // InternalCucumber.g:1218:1: rule__Scenario__Group__0__Impl : ( ( rule__Scenario__Group_0__0 )? ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1222:1: ( ( ( rule__Scenario__Group_0__0 )? ) )
            // InternalCucumber.g:1223:1: ( ( rule__Scenario__Group_0__0 )? )
            {
            // InternalCucumber.g:1223:1: ( ( rule__Scenario__Group_0__0 )? )
            // InternalCucumber.g:1224:2: ( rule__Scenario__Group_0__0 )?
            {
             before(grammarAccess.getScenarioAccess().getGroup_0()); 
            // InternalCucumber.g:1225:2: ( rule__Scenario__Group_0__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCucumber.g:1225:3: rule__Scenario__Group_0__0
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
    // InternalCucumber.g:1233:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1237:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalCucumber.g:1238:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
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
    // InternalCucumber.g:1245:1: rule__Scenario__Group__1__Impl : ( 'Scenario:' ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1249:1: ( ( 'Scenario:' ) )
            // InternalCucumber.g:1250:1: ( 'Scenario:' )
            {
            // InternalCucumber.g:1250:1: ( 'Scenario:' )
            // InternalCucumber.g:1251:2: 'Scenario:'
            {
             before(grammarAccess.getScenarioAccess().getScenarioKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalCucumber.g:1260:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1264:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // InternalCucumber.g:1265:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
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
    // InternalCucumber.g:1272:1: rule__Scenario__Group__2__Impl : ( ( rule__Scenario__NameAssignment_2 ) ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1276:1: ( ( ( rule__Scenario__NameAssignment_2 ) ) )
            // InternalCucumber.g:1277:1: ( ( rule__Scenario__NameAssignment_2 ) )
            {
            // InternalCucumber.g:1277:1: ( ( rule__Scenario__NameAssignment_2 ) )
            // InternalCucumber.g:1278:2: ( rule__Scenario__NameAssignment_2 )
            {
             before(grammarAccess.getScenarioAccess().getNameAssignment_2()); 
            // InternalCucumber.g:1279:2: ( rule__Scenario__NameAssignment_2 )
            // InternalCucumber.g:1279:3: rule__Scenario__NameAssignment_2
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
    // InternalCucumber.g:1287:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl rule__Scenario__Group__4 ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1291:1: ( rule__Scenario__Group__3__Impl rule__Scenario__Group__4 )
            // InternalCucumber.g:1292:2: rule__Scenario__Group__3__Impl rule__Scenario__Group__4
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
    // InternalCucumber.g:1299:1: rule__Scenario__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1303:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1304:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1304:1: ( RULE_EOL )
            // InternalCucumber.g:1305:2: RULE_EOL
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
    // InternalCucumber.g:1314:1: rule__Scenario__Group__4 : rule__Scenario__Group__4__Impl rule__Scenario__Group__5 ;
    public final void rule__Scenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1318:1: ( rule__Scenario__Group__4__Impl rule__Scenario__Group__5 )
            // InternalCucumber.g:1319:2: rule__Scenario__Group__4__Impl rule__Scenario__Group__5
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
    // InternalCucumber.g:1326:1: rule__Scenario__Group__4__Impl : ( ( rule__Scenario__StatementsAssignment_4 )* ) ;
    public final void rule__Scenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1330:1: ( ( ( rule__Scenario__StatementsAssignment_4 )* ) )
            // InternalCucumber.g:1331:1: ( ( rule__Scenario__StatementsAssignment_4 )* )
            {
            // InternalCucumber.g:1331:1: ( ( rule__Scenario__StatementsAssignment_4 )* )
            // InternalCucumber.g:1332:2: ( rule__Scenario__StatementsAssignment_4 )*
            {
             before(grammarAccess.getScenarioAccess().getStatementsAssignment_4()); 
            // InternalCucumber.g:1333:2: ( rule__Scenario__StatementsAssignment_4 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_WORD && LA20_0<=RULE_STRING)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCucumber.g:1333:3: rule__Scenario__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_4);
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
    // InternalCucumber.g:1341:1: rule__Scenario__Group__5 : rule__Scenario__Group__5__Impl ;
    public final void rule__Scenario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1345:1: ( rule__Scenario__Group__5__Impl )
            // InternalCucumber.g:1346:2: rule__Scenario__Group__5__Impl
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
    // InternalCucumber.g:1352:1: rule__Scenario__Group__5__Impl : ( ( rule__Scenario__StepsAssignment_5 )* ) ;
    public final void rule__Scenario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1356:1: ( ( ( rule__Scenario__StepsAssignment_5 )* ) )
            // InternalCucumber.g:1357:1: ( ( rule__Scenario__StepsAssignment_5 )* )
            {
            // InternalCucumber.g:1357:1: ( ( rule__Scenario__StepsAssignment_5 )* )
            // InternalCucumber.g:1358:2: ( rule__Scenario__StepsAssignment_5 )*
            {
             before(grammarAccess.getScenarioAccess().getStepsAssignment_5()); 
            // InternalCucumber.g:1359:2: ( rule__Scenario__StepsAssignment_5 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=17 && LA21_0<=22)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCucumber.g:1359:3: rule__Scenario__StepsAssignment_5
            	    {
            	    pushFollow(FOLLOW_12);
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


    // $ANTLR start "rule__Scenario__Group_0__0"
    // InternalCucumber.g:1368:1: rule__Scenario__Group_0__0 : rule__Scenario__Group_0__0__Impl rule__Scenario__Group_0__1 ;
    public final void rule__Scenario__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1372:1: ( rule__Scenario__Group_0__0__Impl rule__Scenario__Group_0__1 )
            // InternalCucumber.g:1373:2: rule__Scenario__Group_0__0__Impl rule__Scenario__Group_0__1
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
    // InternalCucumber.g:1380:1: rule__Scenario__Group_0__0__Impl : ( ( ( rule__Scenario__TagsAssignment_0_0 ) ) ( ( rule__Scenario__TagsAssignment_0_0 )* ) ) ;
    public final void rule__Scenario__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1384:1: ( ( ( ( rule__Scenario__TagsAssignment_0_0 ) ) ( ( rule__Scenario__TagsAssignment_0_0 )* ) ) )
            // InternalCucumber.g:1385:1: ( ( ( rule__Scenario__TagsAssignment_0_0 ) ) ( ( rule__Scenario__TagsAssignment_0_0 )* ) )
            {
            // InternalCucumber.g:1385:1: ( ( ( rule__Scenario__TagsAssignment_0_0 ) ) ( ( rule__Scenario__TagsAssignment_0_0 )* ) )
            // InternalCucumber.g:1386:2: ( ( rule__Scenario__TagsAssignment_0_0 ) ) ( ( rule__Scenario__TagsAssignment_0_0 )* )
            {
            // InternalCucumber.g:1386:2: ( ( rule__Scenario__TagsAssignment_0_0 ) )
            // InternalCucumber.g:1387:3: ( rule__Scenario__TagsAssignment_0_0 )
            {
             before(grammarAccess.getScenarioAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:1388:3: ( rule__Scenario__TagsAssignment_0_0 )
            // InternalCucumber.g:1388:4: rule__Scenario__TagsAssignment_0_0
            {
            pushFollow(FOLLOW_10);
            rule__Scenario__TagsAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getTagsAssignment_0_0()); 

            }

            // InternalCucumber.g:1391:2: ( ( rule__Scenario__TagsAssignment_0_0 )* )
            // InternalCucumber.g:1392:3: ( rule__Scenario__TagsAssignment_0_0 )*
            {
             before(grammarAccess.getScenarioAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:1393:3: ( rule__Scenario__TagsAssignment_0_0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==23) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCucumber.g:1393:4: rule__Scenario__TagsAssignment_0_0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Scenario__TagsAssignment_0_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalCucumber.g:1402:1: rule__Scenario__Group_0__1 : rule__Scenario__Group_0__1__Impl ;
    public final void rule__Scenario__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1406:1: ( rule__Scenario__Group_0__1__Impl )
            // InternalCucumber.g:1407:2: rule__Scenario__Group_0__1__Impl
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
    // InternalCucumber.g:1413:1: rule__Scenario__Group_0__1__Impl : ( RULE_EOL ) ;
    public final void rule__Scenario__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1417:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1418:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1418:1: ( RULE_EOL )
            // InternalCucumber.g:1419:2: RULE_EOL
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
    // InternalCucumber.g:1429:1: rule__ScenarioOutline__Group__0 : rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1 ;
    public final void rule__ScenarioOutline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1433:1: ( rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1 )
            // InternalCucumber.g:1434:2: rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1
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
    // InternalCucumber.g:1441:1: rule__ScenarioOutline__Group__0__Impl : ( ( rule__ScenarioOutline__Group_0__0 )? ) ;
    public final void rule__ScenarioOutline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1445:1: ( ( ( rule__ScenarioOutline__Group_0__0 )? ) )
            // InternalCucumber.g:1446:1: ( ( rule__ScenarioOutline__Group_0__0 )? )
            {
            // InternalCucumber.g:1446:1: ( ( rule__ScenarioOutline__Group_0__0 )? )
            // InternalCucumber.g:1447:2: ( rule__ScenarioOutline__Group_0__0 )?
            {
             before(grammarAccess.getScenarioOutlineAccess().getGroup_0()); 
            // InternalCucumber.g:1448:2: ( rule__ScenarioOutline__Group_0__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCucumber.g:1448:3: rule__ScenarioOutline__Group_0__0
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
    // InternalCucumber.g:1456:1: rule__ScenarioOutline__Group__1 : rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2 ;
    public final void rule__ScenarioOutline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1460:1: ( rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2 )
            // InternalCucumber.g:1461:2: rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2
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
    // InternalCucumber.g:1468:1: rule__ScenarioOutline__Group__1__Impl : ( 'Scenario Outline:' ) ;
    public final void rule__ScenarioOutline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1472:1: ( ( 'Scenario Outline:' ) )
            // InternalCucumber.g:1473:1: ( 'Scenario Outline:' )
            {
            // InternalCucumber.g:1473:1: ( 'Scenario Outline:' )
            // InternalCucumber.g:1474:2: 'Scenario Outline:'
            {
             before(grammarAccess.getScenarioOutlineAccess().getScenarioOutlineKeyword_1()); 
            match(input,13,FOLLOW_2); 
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
    // InternalCucumber.g:1483:1: rule__ScenarioOutline__Group__2 : rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3 ;
    public final void rule__ScenarioOutline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1487:1: ( rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3 )
            // InternalCucumber.g:1488:2: rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3
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
    // InternalCucumber.g:1495:1: rule__ScenarioOutline__Group__2__Impl : ( ( rule__ScenarioOutline__NameAssignment_2 ) ) ;
    public final void rule__ScenarioOutline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1499:1: ( ( ( rule__ScenarioOutline__NameAssignment_2 ) ) )
            // InternalCucumber.g:1500:1: ( ( rule__ScenarioOutline__NameAssignment_2 ) )
            {
            // InternalCucumber.g:1500:1: ( ( rule__ScenarioOutline__NameAssignment_2 ) )
            // InternalCucumber.g:1501:2: ( rule__ScenarioOutline__NameAssignment_2 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getNameAssignment_2()); 
            // InternalCucumber.g:1502:2: ( rule__ScenarioOutline__NameAssignment_2 )
            // InternalCucumber.g:1502:3: rule__ScenarioOutline__NameAssignment_2
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
    // InternalCucumber.g:1510:1: rule__ScenarioOutline__Group__3 : rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4 ;
    public final void rule__ScenarioOutline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1514:1: ( rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4 )
            // InternalCucumber.g:1515:2: rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4
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
    // InternalCucumber.g:1522:1: rule__ScenarioOutline__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__ScenarioOutline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1526:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1527:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1527:1: ( RULE_EOL )
            // InternalCucumber.g:1528:2: RULE_EOL
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
    // InternalCucumber.g:1537:1: rule__ScenarioOutline__Group__4 : rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5 ;
    public final void rule__ScenarioOutline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1541:1: ( rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5 )
            // InternalCucumber.g:1542:2: rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5
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
    // InternalCucumber.g:1549:1: rule__ScenarioOutline__Group__4__Impl : ( ( rule__ScenarioOutline__StatementsAssignment_4 )* ) ;
    public final void rule__ScenarioOutline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1553:1: ( ( ( rule__ScenarioOutline__StatementsAssignment_4 )* ) )
            // InternalCucumber.g:1554:1: ( ( rule__ScenarioOutline__StatementsAssignment_4 )* )
            {
            // InternalCucumber.g:1554:1: ( ( rule__ScenarioOutline__StatementsAssignment_4 )* )
            // InternalCucumber.g:1555:2: ( rule__ScenarioOutline__StatementsAssignment_4 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getStatementsAssignment_4()); 
            // InternalCucumber.g:1556:2: ( rule__ScenarioOutline__StatementsAssignment_4 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_WORD && LA24_0<=RULE_STRING)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalCucumber.g:1556:3: rule__ScenarioOutline__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ScenarioOutline__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalCucumber.g:1564:1: rule__ScenarioOutline__Group__5 : rule__ScenarioOutline__Group__5__Impl rule__ScenarioOutline__Group__6 ;
    public final void rule__ScenarioOutline__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1568:1: ( rule__ScenarioOutline__Group__5__Impl rule__ScenarioOutline__Group__6 )
            // InternalCucumber.g:1569:2: rule__ScenarioOutline__Group__5__Impl rule__ScenarioOutline__Group__6
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
    // InternalCucumber.g:1576:1: rule__ScenarioOutline__Group__5__Impl : ( ( rule__ScenarioOutline__StepsAssignment_5 )* ) ;
    public final void rule__ScenarioOutline__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1580:1: ( ( ( rule__ScenarioOutline__StepsAssignment_5 )* ) )
            // InternalCucumber.g:1581:1: ( ( rule__ScenarioOutline__StepsAssignment_5 )* )
            {
            // InternalCucumber.g:1581:1: ( ( rule__ScenarioOutline__StepsAssignment_5 )* )
            // InternalCucumber.g:1582:2: ( rule__ScenarioOutline__StepsAssignment_5 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getStepsAssignment_5()); 
            // InternalCucumber.g:1583:2: ( rule__ScenarioOutline__StepsAssignment_5 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=17 && LA25_0<=22)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalCucumber.g:1583:3: rule__ScenarioOutline__StepsAssignment_5
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ScenarioOutline__StepsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalCucumber.g:1591:1: rule__ScenarioOutline__Group__6 : rule__ScenarioOutline__Group__6__Impl ;
    public final void rule__ScenarioOutline__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1595:1: ( rule__ScenarioOutline__Group__6__Impl )
            // InternalCucumber.g:1596:2: rule__ScenarioOutline__Group__6__Impl
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
    // InternalCucumber.g:1602:1: rule__ScenarioOutline__Group__6__Impl : ( ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* ) ) ;
    public final void rule__ScenarioOutline__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1606:1: ( ( ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* ) ) )
            // InternalCucumber.g:1607:1: ( ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* ) )
            {
            // InternalCucumber.g:1607:1: ( ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* ) )
            // InternalCucumber.g:1608:2: ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* )
            {
            // InternalCucumber.g:1608:2: ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) )
            // InternalCucumber.g:1609:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_6()); 
            // InternalCucumber.g:1610:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )
            // InternalCucumber.g:1610:4: rule__ScenarioOutline__ExamplesAssignment_6
            {
            pushFollow(FOLLOW_16);
            rule__ScenarioOutline__ExamplesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_6()); 

            }

            // InternalCucumber.g:1613:2: ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* )
            // InternalCucumber.g:1614:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_6()); 
            // InternalCucumber.g:1615:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )*
            loop26:
            do {
                int alt26=2;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // InternalCucumber.g:1615:4: rule__ScenarioOutline__ExamplesAssignment_6
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__ScenarioOutline__ExamplesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalCucumber.g:1625:1: rule__ScenarioOutline__Group_0__0 : rule__ScenarioOutline__Group_0__0__Impl rule__ScenarioOutline__Group_0__1 ;
    public final void rule__ScenarioOutline__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1629:1: ( rule__ScenarioOutline__Group_0__0__Impl rule__ScenarioOutline__Group_0__1 )
            // InternalCucumber.g:1630:2: rule__ScenarioOutline__Group_0__0__Impl rule__ScenarioOutline__Group_0__1
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
    // InternalCucumber.g:1637:1: rule__ScenarioOutline__Group_0__0__Impl : ( ( ( rule__ScenarioOutline__TagsAssignment_0_0 ) ) ( ( rule__ScenarioOutline__TagsAssignment_0_0 )* ) ) ;
    public final void rule__ScenarioOutline__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1641:1: ( ( ( ( rule__ScenarioOutline__TagsAssignment_0_0 ) ) ( ( rule__ScenarioOutline__TagsAssignment_0_0 )* ) ) )
            // InternalCucumber.g:1642:1: ( ( ( rule__ScenarioOutline__TagsAssignment_0_0 ) ) ( ( rule__ScenarioOutline__TagsAssignment_0_0 )* ) )
            {
            // InternalCucumber.g:1642:1: ( ( ( rule__ScenarioOutline__TagsAssignment_0_0 ) ) ( ( rule__ScenarioOutline__TagsAssignment_0_0 )* ) )
            // InternalCucumber.g:1643:2: ( ( rule__ScenarioOutline__TagsAssignment_0_0 ) ) ( ( rule__ScenarioOutline__TagsAssignment_0_0 )* )
            {
            // InternalCucumber.g:1643:2: ( ( rule__ScenarioOutline__TagsAssignment_0_0 ) )
            // InternalCucumber.g:1644:3: ( rule__ScenarioOutline__TagsAssignment_0_0 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:1645:3: ( rule__ScenarioOutline__TagsAssignment_0_0 )
            // InternalCucumber.g:1645:4: rule__ScenarioOutline__TagsAssignment_0_0
            {
            pushFollow(FOLLOW_10);
            rule__ScenarioOutline__TagsAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getTagsAssignment_0_0()); 

            }

            // InternalCucumber.g:1648:2: ( ( rule__ScenarioOutline__TagsAssignment_0_0 )* )
            // InternalCucumber.g:1649:3: ( rule__ScenarioOutline__TagsAssignment_0_0 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:1650:3: ( rule__ScenarioOutline__TagsAssignment_0_0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==23) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalCucumber.g:1650:4: rule__ScenarioOutline__TagsAssignment_0_0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ScenarioOutline__TagsAssignment_0_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalCucumber.g:1659:1: rule__ScenarioOutline__Group_0__1 : rule__ScenarioOutline__Group_0__1__Impl ;
    public final void rule__ScenarioOutline__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1663:1: ( rule__ScenarioOutline__Group_0__1__Impl )
            // InternalCucumber.g:1664:2: rule__ScenarioOutline__Group_0__1__Impl
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
    // InternalCucumber.g:1670:1: rule__ScenarioOutline__Group_0__1__Impl : ( RULE_EOL ) ;
    public final void rule__ScenarioOutline__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1674:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1675:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1675:1: ( RULE_EOL )
            // InternalCucumber.g:1676:2: RULE_EOL
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
    // InternalCucumber.g:1686:1: rule__Examples__Group__0 : rule__Examples__Group__0__Impl rule__Examples__Group__1 ;
    public final void rule__Examples__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1690:1: ( rule__Examples__Group__0__Impl rule__Examples__Group__1 )
            // InternalCucumber.g:1691:2: rule__Examples__Group__0__Impl rule__Examples__Group__1
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
    // InternalCucumber.g:1698:1: rule__Examples__Group__0__Impl : ( ( rule__Examples__Group_0__0 )? ) ;
    public final void rule__Examples__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1702:1: ( ( ( rule__Examples__Group_0__0 )? ) )
            // InternalCucumber.g:1703:1: ( ( rule__Examples__Group_0__0 )? )
            {
            // InternalCucumber.g:1703:1: ( ( rule__Examples__Group_0__0 )? )
            // InternalCucumber.g:1704:2: ( rule__Examples__Group_0__0 )?
            {
             before(grammarAccess.getExamplesAccess().getGroup_0()); 
            // InternalCucumber.g:1705:2: ( rule__Examples__Group_0__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==23) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCucumber.g:1705:3: rule__Examples__Group_0__0
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
    // InternalCucumber.g:1713:1: rule__Examples__Group__1 : rule__Examples__Group__1__Impl rule__Examples__Group__2 ;
    public final void rule__Examples__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1717:1: ( rule__Examples__Group__1__Impl rule__Examples__Group__2 )
            // InternalCucumber.g:1718:2: rule__Examples__Group__1__Impl rule__Examples__Group__2
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
    // InternalCucumber.g:1725:1: rule__Examples__Group__1__Impl : ( 'Examples:' ) ;
    public final void rule__Examples__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1729:1: ( ( 'Examples:' ) )
            // InternalCucumber.g:1730:1: ( 'Examples:' )
            {
            // InternalCucumber.g:1730:1: ( 'Examples:' )
            // InternalCucumber.g:1731:2: 'Examples:'
            {
             before(grammarAccess.getExamplesAccess().getExamplesKeyword_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalCucumber.g:1740:1: rule__Examples__Group__2 : rule__Examples__Group__2__Impl rule__Examples__Group__3 ;
    public final void rule__Examples__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1744:1: ( rule__Examples__Group__2__Impl rule__Examples__Group__3 )
            // InternalCucumber.g:1745:2: rule__Examples__Group__2__Impl rule__Examples__Group__3
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
    // InternalCucumber.g:1752:1: rule__Examples__Group__2__Impl : ( ( rule__Examples__NameAssignment_2 ) ) ;
    public final void rule__Examples__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1756:1: ( ( ( rule__Examples__NameAssignment_2 ) ) )
            // InternalCucumber.g:1757:1: ( ( rule__Examples__NameAssignment_2 ) )
            {
            // InternalCucumber.g:1757:1: ( ( rule__Examples__NameAssignment_2 ) )
            // InternalCucumber.g:1758:2: ( rule__Examples__NameAssignment_2 )
            {
             before(grammarAccess.getExamplesAccess().getNameAssignment_2()); 
            // InternalCucumber.g:1759:2: ( rule__Examples__NameAssignment_2 )
            // InternalCucumber.g:1759:3: rule__Examples__NameAssignment_2
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
    // InternalCucumber.g:1767:1: rule__Examples__Group__3 : rule__Examples__Group__3__Impl rule__Examples__Group__4 ;
    public final void rule__Examples__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1771:1: ( rule__Examples__Group__3__Impl rule__Examples__Group__4 )
            // InternalCucumber.g:1772:2: rule__Examples__Group__3__Impl rule__Examples__Group__4
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
    // InternalCucumber.g:1779:1: rule__Examples__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Examples__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1783:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1784:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1784:1: ( RULE_EOL )
            // InternalCucumber.g:1785:2: RULE_EOL
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
    // InternalCucumber.g:1794:1: rule__Examples__Group__4 : rule__Examples__Group__4__Impl rule__Examples__Group__5 ;
    public final void rule__Examples__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1798:1: ( rule__Examples__Group__4__Impl rule__Examples__Group__5 )
            // InternalCucumber.g:1799:2: rule__Examples__Group__4__Impl rule__Examples__Group__5
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
    // InternalCucumber.g:1806:1: rule__Examples__Group__4__Impl : ( ( rule__Examples__StatementsAssignment_4 )* ) ;
    public final void rule__Examples__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1810:1: ( ( ( rule__Examples__StatementsAssignment_4 )* ) )
            // InternalCucumber.g:1811:1: ( ( rule__Examples__StatementsAssignment_4 )* )
            {
            // InternalCucumber.g:1811:1: ( ( rule__Examples__StatementsAssignment_4 )* )
            // InternalCucumber.g:1812:2: ( rule__Examples__StatementsAssignment_4 )*
            {
             before(grammarAccess.getExamplesAccess().getStatementsAssignment_4()); 
            // InternalCucumber.g:1813:2: ( rule__Examples__StatementsAssignment_4 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_WORD && LA29_0<=RULE_STRING)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalCucumber.g:1813:3: rule__Examples__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Examples__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalCucumber.g:1821:1: rule__Examples__Group__5 : rule__Examples__Group__5__Impl ;
    public final void rule__Examples__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1825:1: ( rule__Examples__Group__5__Impl )
            // InternalCucumber.g:1826:2: rule__Examples__Group__5__Impl
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
    // InternalCucumber.g:1832:1: rule__Examples__Group__5__Impl : ( ( rule__Examples__TheExamplesTableAssignment_5 ) ) ;
    public final void rule__Examples__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1836:1: ( ( ( rule__Examples__TheExamplesTableAssignment_5 ) ) )
            // InternalCucumber.g:1837:1: ( ( rule__Examples__TheExamplesTableAssignment_5 ) )
            {
            // InternalCucumber.g:1837:1: ( ( rule__Examples__TheExamplesTableAssignment_5 ) )
            // InternalCucumber.g:1838:2: ( rule__Examples__TheExamplesTableAssignment_5 )
            {
             before(grammarAccess.getExamplesAccess().getTheExamplesTableAssignment_5()); 
            // InternalCucumber.g:1839:2: ( rule__Examples__TheExamplesTableAssignment_5 )
            // InternalCucumber.g:1839:3: rule__Examples__TheExamplesTableAssignment_5
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
    // InternalCucumber.g:1848:1: rule__Examples__Group_0__0 : rule__Examples__Group_0__0__Impl rule__Examples__Group_0__1 ;
    public final void rule__Examples__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1852:1: ( rule__Examples__Group_0__0__Impl rule__Examples__Group_0__1 )
            // InternalCucumber.g:1853:2: rule__Examples__Group_0__0__Impl rule__Examples__Group_0__1
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
    // InternalCucumber.g:1860:1: rule__Examples__Group_0__0__Impl : ( ( ( rule__Examples__TagsAssignment_0_0 ) ) ( ( rule__Examples__TagsAssignment_0_0 )* ) ) ;
    public final void rule__Examples__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1864:1: ( ( ( ( rule__Examples__TagsAssignment_0_0 ) ) ( ( rule__Examples__TagsAssignment_0_0 )* ) ) )
            // InternalCucumber.g:1865:1: ( ( ( rule__Examples__TagsAssignment_0_0 ) ) ( ( rule__Examples__TagsAssignment_0_0 )* ) )
            {
            // InternalCucumber.g:1865:1: ( ( ( rule__Examples__TagsAssignment_0_0 ) ) ( ( rule__Examples__TagsAssignment_0_0 )* ) )
            // InternalCucumber.g:1866:2: ( ( rule__Examples__TagsAssignment_0_0 ) ) ( ( rule__Examples__TagsAssignment_0_0 )* )
            {
            // InternalCucumber.g:1866:2: ( ( rule__Examples__TagsAssignment_0_0 ) )
            // InternalCucumber.g:1867:3: ( rule__Examples__TagsAssignment_0_0 )
            {
             before(grammarAccess.getExamplesAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:1868:3: ( rule__Examples__TagsAssignment_0_0 )
            // InternalCucumber.g:1868:4: rule__Examples__TagsAssignment_0_0
            {
            pushFollow(FOLLOW_10);
            rule__Examples__TagsAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getExamplesAccess().getTagsAssignment_0_0()); 

            }

            // InternalCucumber.g:1871:2: ( ( rule__Examples__TagsAssignment_0_0 )* )
            // InternalCucumber.g:1872:3: ( rule__Examples__TagsAssignment_0_0 )*
            {
             before(grammarAccess.getExamplesAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:1873:3: ( rule__Examples__TagsAssignment_0_0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==23) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalCucumber.g:1873:4: rule__Examples__TagsAssignment_0_0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Examples__TagsAssignment_0_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalCucumber.g:1882:1: rule__Examples__Group_0__1 : rule__Examples__Group_0__1__Impl ;
    public final void rule__Examples__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1886:1: ( rule__Examples__Group_0__1__Impl )
            // InternalCucumber.g:1887:2: rule__Examples__Group_0__1__Impl
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
    // InternalCucumber.g:1893:1: rule__Examples__Group_0__1__Impl : ( RULE_EOL ) ;
    public final void rule__Examples__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1897:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1898:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1898:1: ( RULE_EOL )
            // InternalCucumber.g:1899:2: RULE_EOL
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
    // InternalCucumber.g:1909:1: rule__Row__Group__0 : rule__Row__Group__0__Impl rule__Row__Group__1 ;
    public final void rule__Row__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1913:1: ( rule__Row__Group__0__Impl rule__Row__Group__1 )
            // InternalCucumber.g:1914:2: rule__Row__Group__0__Impl rule__Row__Group__1
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
    // InternalCucumber.g:1921:1: rule__Row__Group__0__Impl : ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) ) ;
    public final void rule__Row__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1925:1: ( ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) ) )
            // InternalCucumber.g:1926:1: ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) )
            {
            // InternalCucumber.g:1926:1: ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) )
            // InternalCucumber.g:1927:2: ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* )
            {
            // InternalCucumber.g:1927:2: ( ( rule__Row__CellsAssignment_0 ) )
            // InternalCucumber.g:1928:3: ( rule__Row__CellsAssignment_0 )
            {
             before(grammarAccess.getRowAccess().getCellsAssignment_0()); 
            // InternalCucumber.g:1929:3: ( rule__Row__CellsAssignment_0 )
            // InternalCucumber.g:1929:4: rule__Row__CellsAssignment_0
            {
            pushFollow(FOLLOW_3);
            rule__Row__CellsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getCellsAssignment_0()); 

            }

            // InternalCucumber.g:1932:2: ( ( rule__Row__CellsAssignment_0 )* )
            // InternalCucumber.g:1933:3: ( rule__Row__CellsAssignment_0 )*
            {
             before(grammarAccess.getRowAccess().getCellsAssignment_0()); 
            // InternalCucumber.g:1934:3: ( rule__Row__CellsAssignment_0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==15) ) {
                    int LA31_1 = input.LA(2);

                    if ( ((LA31_1>=RULE_WORD && LA31_1<=RULE_STRING)) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // InternalCucumber.g:1934:4: rule__Row__CellsAssignment_0
            	    {
            	    pushFollow(FOLLOW_3);
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
    // InternalCucumber.g:1943:1: rule__Row__Group__1 : rule__Row__Group__1__Impl rule__Row__Group__2 ;
    public final void rule__Row__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1947:1: ( rule__Row__Group__1__Impl rule__Row__Group__2 )
            // InternalCucumber.g:1948:2: rule__Row__Group__1__Impl rule__Row__Group__2
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
    // InternalCucumber.g:1955:1: rule__Row__Group__1__Impl : ( '|' ) ;
    public final void rule__Row__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1959:1: ( ( '|' ) )
            // InternalCucumber.g:1960:1: ( '|' )
            {
            // InternalCucumber.g:1960:1: ( '|' )
            // InternalCucumber.g:1961:2: '|'
            {
             before(grammarAccess.getRowAccess().getVerticalLineKeyword_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalCucumber.g:1970:1: rule__Row__Group__2 : rule__Row__Group__2__Impl ;
    public final void rule__Row__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1974:1: ( rule__Row__Group__2__Impl )
            // InternalCucumber.g:1975:2: rule__Row__Group__2__Impl
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
    // InternalCucumber.g:1981:1: rule__Row__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__Row__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1985:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1986:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1986:1: ( RULE_EOL )
            // InternalCucumber.g:1987:2: RULE_EOL
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
    // InternalCucumber.g:1997:1: rule__Cell__Group__0 : rule__Cell__Group__0__Impl rule__Cell__Group__1 ;
    public final void rule__Cell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2001:1: ( rule__Cell__Group__0__Impl rule__Cell__Group__1 )
            // InternalCucumber.g:2002:2: rule__Cell__Group__0__Impl rule__Cell__Group__1
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
    // InternalCucumber.g:2009:1: rule__Cell__Group__0__Impl : ( '|' ) ;
    public final void rule__Cell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2013:1: ( ( '|' ) )
            // InternalCucumber.g:2014:1: ( '|' )
            {
            // InternalCucumber.g:2014:1: ( '|' )
            // InternalCucumber.g:2015:2: '|'
            {
             before(grammarAccess.getCellAccess().getVerticalLineKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalCucumber.g:2024:1: rule__Cell__Group__1 : rule__Cell__Group__1__Impl ;
    public final void rule__Cell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2028:1: ( rule__Cell__Group__1__Impl )
            // InternalCucumber.g:2029:2: rule__Cell__Group__1__Impl
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
    // InternalCucumber.g:2035:1: rule__Cell__Group__1__Impl : ( ( rule__Cell__NameAssignment_1 ) ) ;
    public final void rule__Cell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2039:1: ( ( ( rule__Cell__NameAssignment_1 ) ) )
            // InternalCucumber.g:2040:1: ( ( rule__Cell__NameAssignment_1 ) )
            {
            // InternalCucumber.g:2040:1: ( ( rule__Cell__NameAssignment_1 ) )
            // InternalCucumber.g:2041:2: ( rule__Cell__NameAssignment_1 )
            {
             before(grammarAccess.getCellAccess().getNameAssignment_1()); 
            // InternalCucumber.g:2042:2: ( rule__Cell__NameAssignment_1 )
            // InternalCucumber.g:2042:3: rule__Cell__NameAssignment_1
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


    // $ANTLR start "rule__DocString__Group__0"
    // InternalCucumber.g:2051:1: rule__DocString__Group__0 : rule__DocString__Group__0__Impl rule__DocString__Group__1 ;
    public final void rule__DocString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2055:1: ( rule__DocString__Group__0__Impl rule__DocString__Group__1 )
            // InternalCucumber.g:2056:2: rule__DocString__Group__0__Impl rule__DocString__Group__1
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
    // InternalCucumber.g:2063:1: rule__DocString__Group__0__Impl : ( '\"\"\"' ) ;
    public final void rule__DocString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2067:1: ( ( '\"\"\"' ) )
            // InternalCucumber.g:2068:1: ( '\"\"\"' )
            {
            // InternalCucumber.g:2068:1: ( '\"\"\"' )
            // InternalCucumber.g:2069:2: '\"\"\"'
            {
             before(grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalCucumber.g:2078:1: rule__DocString__Group__1 : rule__DocString__Group__1__Impl rule__DocString__Group__2 ;
    public final void rule__DocString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2082:1: ( rule__DocString__Group__1__Impl rule__DocString__Group__2 )
            // InternalCucumber.g:2083:2: rule__DocString__Group__1__Impl rule__DocString__Group__2
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
    // InternalCucumber.g:2090:1: rule__DocString__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__DocString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2094:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2095:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2095:1: ( RULE_EOL )
            // InternalCucumber.g:2096:2: RULE_EOL
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
    // InternalCucumber.g:2105:1: rule__DocString__Group__2 : rule__DocString__Group__2__Impl rule__DocString__Group__3 ;
    public final void rule__DocString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2109:1: ( rule__DocString__Group__2__Impl rule__DocString__Group__3 )
            // InternalCucumber.g:2110:2: rule__DocString__Group__2__Impl rule__DocString__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalCucumber.g:2117:1: rule__DocString__Group__2__Impl : ( ( ( rule__DocString__StatementsAssignment_2 ) ) ( ( rule__DocString__StatementsAssignment_2 )* ) ) ;
    public final void rule__DocString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2121:1: ( ( ( ( rule__DocString__StatementsAssignment_2 ) ) ( ( rule__DocString__StatementsAssignment_2 )* ) ) )
            // InternalCucumber.g:2122:1: ( ( ( rule__DocString__StatementsAssignment_2 ) ) ( ( rule__DocString__StatementsAssignment_2 )* ) )
            {
            // InternalCucumber.g:2122:1: ( ( ( rule__DocString__StatementsAssignment_2 ) ) ( ( rule__DocString__StatementsAssignment_2 )* ) )
            // InternalCucumber.g:2123:2: ( ( rule__DocString__StatementsAssignment_2 ) ) ( ( rule__DocString__StatementsAssignment_2 )* )
            {
            // InternalCucumber.g:2123:2: ( ( rule__DocString__StatementsAssignment_2 ) )
            // InternalCucumber.g:2124:3: ( rule__DocString__StatementsAssignment_2 )
            {
             before(grammarAccess.getDocStringAccess().getStatementsAssignment_2()); 
            // InternalCucumber.g:2125:3: ( rule__DocString__StatementsAssignment_2 )
            // InternalCucumber.g:2125:4: rule__DocString__StatementsAssignment_2
            {
            pushFollow(FOLLOW_4);
            rule__DocString__StatementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDocStringAccess().getStatementsAssignment_2()); 

            }

            // InternalCucumber.g:2128:2: ( ( rule__DocString__StatementsAssignment_2 )* )
            // InternalCucumber.g:2129:3: ( rule__DocString__StatementsAssignment_2 )*
            {
             before(grammarAccess.getDocStringAccess().getStatementsAssignment_2()); 
            // InternalCucumber.g:2130:3: ( rule__DocString__StatementsAssignment_2 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=RULE_WORD && LA32_0<=RULE_STRING)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalCucumber.g:2130:4: rule__DocString__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__DocString__StatementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getDocStringAccess().getStatementsAssignment_2()); 

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
    // InternalCucumber.g:2139:1: rule__DocString__Group__3 : rule__DocString__Group__3__Impl rule__DocString__Group__4 ;
    public final void rule__DocString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2143:1: ( rule__DocString__Group__3__Impl rule__DocString__Group__4 )
            // InternalCucumber.g:2144:2: rule__DocString__Group__3__Impl rule__DocString__Group__4
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
    // InternalCucumber.g:2151:1: rule__DocString__Group__3__Impl : ( '\"\"\"' ) ;
    public final void rule__DocString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2155:1: ( ( '\"\"\"' ) )
            // InternalCucumber.g:2156:1: ( '\"\"\"' )
            {
            // InternalCucumber.g:2156:1: ( '\"\"\"' )
            // InternalCucumber.g:2157:2: '\"\"\"'
            {
             before(grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalCucumber.g:2166:1: rule__DocString__Group__4 : rule__DocString__Group__4__Impl ;
    public final void rule__DocString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2170:1: ( rule__DocString__Group__4__Impl )
            // InternalCucumber.g:2171:2: rule__DocString__Group__4__Impl
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
    // InternalCucumber.g:2177:1: rule__DocString__Group__4__Impl : ( RULE_EOL ) ;
    public final void rule__DocString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2181:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2182:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2182:1: ( RULE_EOL )
            // InternalCucumber.g:2183:2: RULE_EOL
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


    // $ANTLR start "rule__Given__Group__0"
    // InternalCucumber.g:2193:1: rule__Given__Group__0 : rule__Given__Group__0__Impl rule__Given__Group__1 ;
    public final void rule__Given__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2197:1: ( rule__Given__Group__0__Impl rule__Given__Group__1 )
            // InternalCucumber.g:2198:2: rule__Given__Group__0__Impl rule__Given__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalCucumber.g:2205:1: rule__Given__Group__0__Impl : ( 'Given' ) ;
    public final void rule__Given__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2209:1: ( ( 'Given' ) )
            // InternalCucumber.g:2210:1: ( 'Given' )
            {
            // InternalCucumber.g:2210:1: ( 'Given' )
            // InternalCucumber.g:2211:2: 'Given'
            {
             before(grammarAccess.getGivenAccess().getGivenKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalCucumber.g:2220:1: rule__Given__Group__1 : rule__Given__Group__1__Impl rule__Given__Group__2 ;
    public final void rule__Given__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2224:1: ( rule__Given__Group__1__Impl rule__Given__Group__2 )
            // InternalCucumber.g:2225:2: rule__Given__Group__1__Impl rule__Given__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalCucumber.g:2232:1: rule__Given__Group__1__Impl : ( ( rule__Given__NameAssignment_1 ) ) ;
    public final void rule__Given__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2236:1: ( ( ( rule__Given__NameAssignment_1 ) ) )
            // InternalCucumber.g:2237:1: ( ( rule__Given__NameAssignment_1 ) )
            {
            // InternalCucumber.g:2237:1: ( ( rule__Given__NameAssignment_1 ) )
            // InternalCucumber.g:2238:2: ( rule__Given__NameAssignment_1 )
            {
             before(grammarAccess.getGivenAccess().getNameAssignment_1()); 
            // InternalCucumber.g:2239:2: ( rule__Given__NameAssignment_1 )
            // InternalCucumber.g:2239:3: rule__Given__NameAssignment_1
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
    // InternalCucumber.g:2247:1: rule__Given__Group__2 : rule__Given__Group__2__Impl rule__Given__Group__3 ;
    public final void rule__Given__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2251:1: ( rule__Given__Group__2__Impl rule__Given__Group__3 )
            // InternalCucumber.g:2252:2: rule__Given__Group__2__Impl rule__Given__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalCucumber.g:2259:1: rule__Given__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__Given__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2263:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2264:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2264:1: ( RULE_EOL )
            // InternalCucumber.g:2265:2: RULE_EOL
            {
             before(grammarAccess.getGivenAccess().getEOLTerminalRuleCall_2()); 
            match(input,RULE_EOL,FOLLOW_2); 
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


    // $ANTLR start "rule__Given__Group__3"
    // InternalCucumber.g:2274:1: rule__Given__Group__3 : rule__Given__Group__3__Impl ;
    public final void rule__Given__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2278:1: ( rule__Given__Group__3__Impl )
            // InternalCucumber.g:2279:2: rule__Given__Group__3__Impl
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
    // InternalCucumber.g:2285:1: rule__Given__Group__3__Impl : ( ( rule__Given__Alternatives_3 )? ) ;
    public final void rule__Given__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2289:1: ( ( ( rule__Given__Alternatives_3 )? ) )
            // InternalCucumber.g:2290:1: ( ( rule__Given__Alternatives_3 )? )
            {
            // InternalCucumber.g:2290:1: ( ( rule__Given__Alternatives_3 )? )
            // InternalCucumber.g:2291:2: ( rule__Given__Alternatives_3 )?
            {
             before(grammarAccess.getGivenAccess().getAlternatives_3()); 
            // InternalCucumber.g:2292:2: ( rule__Given__Alternatives_3 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=15 && LA33_0<=16)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCucumber.g:2292:3: rule__Given__Alternatives_3
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
    // InternalCucumber.g:2301:1: rule__When__Group__0 : rule__When__Group__0__Impl rule__When__Group__1 ;
    public final void rule__When__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2305:1: ( rule__When__Group__0__Impl rule__When__Group__1 )
            // InternalCucumber.g:2306:2: rule__When__Group__0__Impl rule__When__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalCucumber.g:2313:1: rule__When__Group__0__Impl : ( 'When' ) ;
    public final void rule__When__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2317:1: ( ( 'When' ) )
            // InternalCucumber.g:2318:1: ( 'When' )
            {
            // InternalCucumber.g:2318:1: ( 'When' )
            // InternalCucumber.g:2319:2: 'When'
            {
             before(grammarAccess.getWhenAccess().getWhenKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalCucumber.g:2328:1: rule__When__Group__1 : rule__When__Group__1__Impl rule__When__Group__2 ;
    public final void rule__When__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2332:1: ( rule__When__Group__1__Impl rule__When__Group__2 )
            // InternalCucumber.g:2333:2: rule__When__Group__1__Impl rule__When__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalCucumber.g:2340:1: rule__When__Group__1__Impl : ( ( rule__When__NameAssignment_1 ) ) ;
    public final void rule__When__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2344:1: ( ( ( rule__When__NameAssignment_1 ) ) )
            // InternalCucumber.g:2345:1: ( ( rule__When__NameAssignment_1 ) )
            {
            // InternalCucumber.g:2345:1: ( ( rule__When__NameAssignment_1 ) )
            // InternalCucumber.g:2346:2: ( rule__When__NameAssignment_1 )
            {
             before(grammarAccess.getWhenAccess().getNameAssignment_1()); 
            // InternalCucumber.g:2347:2: ( rule__When__NameAssignment_1 )
            // InternalCucumber.g:2347:3: rule__When__NameAssignment_1
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
    // InternalCucumber.g:2355:1: rule__When__Group__2 : rule__When__Group__2__Impl rule__When__Group__3 ;
    public final void rule__When__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2359:1: ( rule__When__Group__2__Impl rule__When__Group__3 )
            // InternalCucumber.g:2360:2: rule__When__Group__2__Impl rule__When__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalCucumber.g:2367:1: rule__When__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__When__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2371:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2372:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2372:1: ( RULE_EOL )
            // InternalCucumber.g:2373:2: RULE_EOL
            {
             before(grammarAccess.getWhenAccess().getEOLTerminalRuleCall_2()); 
            match(input,RULE_EOL,FOLLOW_2); 
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


    // $ANTLR start "rule__When__Group__3"
    // InternalCucumber.g:2382:1: rule__When__Group__3 : rule__When__Group__3__Impl ;
    public final void rule__When__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2386:1: ( rule__When__Group__3__Impl )
            // InternalCucumber.g:2387:2: rule__When__Group__3__Impl
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
    // InternalCucumber.g:2393:1: rule__When__Group__3__Impl : ( ( rule__When__Alternatives_3 )? ) ;
    public final void rule__When__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2397:1: ( ( ( rule__When__Alternatives_3 )? ) )
            // InternalCucumber.g:2398:1: ( ( rule__When__Alternatives_3 )? )
            {
            // InternalCucumber.g:2398:1: ( ( rule__When__Alternatives_3 )? )
            // InternalCucumber.g:2399:2: ( rule__When__Alternatives_3 )?
            {
             before(grammarAccess.getWhenAccess().getAlternatives_3()); 
            // InternalCucumber.g:2400:2: ( rule__When__Alternatives_3 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=15 && LA34_0<=16)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCucumber.g:2400:3: rule__When__Alternatives_3
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
    // InternalCucumber.g:2409:1: rule__Then__Group__0 : rule__Then__Group__0__Impl rule__Then__Group__1 ;
    public final void rule__Then__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2413:1: ( rule__Then__Group__0__Impl rule__Then__Group__1 )
            // InternalCucumber.g:2414:2: rule__Then__Group__0__Impl rule__Then__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalCucumber.g:2421:1: rule__Then__Group__0__Impl : ( 'Then' ) ;
    public final void rule__Then__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2425:1: ( ( 'Then' ) )
            // InternalCucumber.g:2426:1: ( 'Then' )
            {
            // InternalCucumber.g:2426:1: ( 'Then' )
            // InternalCucumber.g:2427:2: 'Then'
            {
             before(grammarAccess.getThenAccess().getThenKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalCucumber.g:2436:1: rule__Then__Group__1 : rule__Then__Group__1__Impl rule__Then__Group__2 ;
    public final void rule__Then__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2440:1: ( rule__Then__Group__1__Impl rule__Then__Group__2 )
            // InternalCucumber.g:2441:2: rule__Then__Group__1__Impl rule__Then__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalCucumber.g:2448:1: rule__Then__Group__1__Impl : ( ( rule__Then__NameAssignment_1 ) ) ;
    public final void rule__Then__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2452:1: ( ( ( rule__Then__NameAssignment_1 ) ) )
            // InternalCucumber.g:2453:1: ( ( rule__Then__NameAssignment_1 ) )
            {
            // InternalCucumber.g:2453:1: ( ( rule__Then__NameAssignment_1 ) )
            // InternalCucumber.g:2454:2: ( rule__Then__NameAssignment_1 )
            {
             before(grammarAccess.getThenAccess().getNameAssignment_1()); 
            // InternalCucumber.g:2455:2: ( rule__Then__NameAssignment_1 )
            // InternalCucumber.g:2455:3: rule__Then__NameAssignment_1
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
    // InternalCucumber.g:2463:1: rule__Then__Group__2 : rule__Then__Group__2__Impl rule__Then__Group__3 ;
    public final void rule__Then__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2467:1: ( rule__Then__Group__2__Impl rule__Then__Group__3 )
            // InternalCucumber.g:2468:2: rule__Then__Group__2__Impl rule__Then__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalCucumber.g:2475:1: rule__Then__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__Then__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2479:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2480:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2480:1: ( RULE_EOL )
            // InternalCucumber.g:2481:2: RULE_EOL
            {
             before(grammarAccess.getThenAccess().getEOLTerminalRuleCall_2()); 
            match(input,RULE_EOL,FOLLOW_2); 
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


    // $ANTLR start "rule__Then__Group__3"
    // InternalCucumber.g:2490:1: rule__Then__Group__3 : rule__Then__Group__3__Impl ;
    public final void rule__Then__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2494:1: ( rule__Then__Group__3__Impl )
            // InternalCucumber.g:2495:2: rule__Then__Group__3__Impl
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
    // InternalCucumber.g:2501:1: rule__Then__Group__3__Impl : ( ( rule__Then__Alternatives_3 )? ) ;
    public final void rule__Then__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2505:1: ( ( ( rule__Then__Alternatives_3 )? ) )
            // InternalCucumber.g:2506:1: ( ( rule__Then__Alternatives_3 )? )
            {
            // InternalCucumber.g:2506:1: ( ( rule__Then__Alternatives_3 )? )
            // InternalCucumber.g:2507:2: ( rule__Then__Alternatives_3 )?
            {
             before(grammarAccess.getThenAccess().getAlternatives_3()); 
            // InternalCucumber.g:2508:2: ( rule__Then__Alternatives_3 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=15 && LA35_0<=16)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCucumber.g:2508:3: rule__Then__Alternatives_3
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
    // InternalCucumber.g:2517:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2521:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalCucumber.g:2522:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalCucumber.g:2529:1: rule__And__Group__0__Impl : ( 'And' ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2533:1: ( ( 'And' ) )
            // InternalCucumber.g:2534:1: ( 'And' )
            {
            // InternalCucumber.g:2534:1: ( 'And' )
            // InternalCucumber.g:2535:2: 'And'
            {
             before(grammarAccess.getAndAccess().getAndKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalCucumber.g:2544:1: rule__And__Group__1 : rule__And__Group__1__Impl rule__And__Group__2 ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2548:1: ( rule__And__Group__1__Impl rule__And__Group__2 )
            // InternalCucumber.g:2549:2: rule__And__Group__1__Impl rule__And__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalCucumber.g:2556:1: rule__And__Group__1__Impl : ( ( rule__And__NameAssignment_1 ) ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2560:1: ( ( ( rule__And__NameAssignment_1 ) ) )
            // InternalCucumber.g:2561:1: ( ( rule__And__NameAssignment_1 ) )
            {
            // InternalCucumber.g:2561:1: ( ( rule__And__NameAssignment_1 ) )
            // InternalCucumber.g:2562:2: ( rule__And__NameAssignment_1 )
            {
             before(grammarAccess.getAndAccess().getNameAssignment_1()); 
            // InternalCucumber.g:2563:2: ( rule__And__NameAssignment_1 )
            // InternalCucumber.g:2563:3: rule__And__NameAssignment_1
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
    // InternalCucumber.g:2571:1: rule__And__Group__2 : rule__And__Group__2__Impl rule__And__Group__3 ;
    public final void rule__And__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2575:1: ( rule__And__Group__2__Impl rule__And__Group__3 )
            // InternalCucumber.g:2576:2: rule__And__Group__2__Impl rule__And__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalCucumber.g:2583:1: rule__And__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__And__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2587:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2588:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2588:1: ( RULE_EOL )
            // InternalCucumber.g:2589:2: RULE_EOL
            {
             before(grammarAccess.getAndAccess().getEOLTerminalRuleCall_2()); 
            match(input,RULE_EOL,FOLLOW_2); 
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


    // $ANTLR start "rule__And__Group__3"
    // InternalCucumber.g:2598:1: rule__And__Group__3 : rule__And__Group__3__Impl ;
    public final void rule__And__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2602:1: ( rule__And__Group__3__Impl )
            // InternalCucumber.g:2603:2: rule__And__Group__3__Impl
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
    // InternalCucumber.g:2609:1: rule__And__Group__3__Impl : ( ( rule__And__Alternatives_3 )? ) ;
    public final void rule__And__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2613:1: ( ( ( rule__And__Alternatives_3 )? ) )
            // InternalCucumber.g:2614:1: ( ( rule__And__Alternatives_3 )? )
            {
            // InternalCucumber.g:2614:1: ( ( rule__And__Alternatives_3 )? )
            // InternalCucumber.g:2615:2: ( rule__And__Alternatives_3 )?
            {
             before(grammarAccess.getAndAccess().getAlternatives_3()); 
            // InternalCucumber.g:2616:2: ( rule__And__Alternatives_3 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=15 && LA36_0<=16)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCucumber.g:2616:3: rule__And__Alternatives_3
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


    // $ANTLR start "rule__But__Group__0"
    // InternalCucumber.g:2625:1: rule__But__Group__0 : rule__But__Group__0__Impl rule__But__Group__1 ;
    public final void rule__But__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2629:1: ( rule__But__Group__0__Impl rule__But__Group__1 )
            // InternalCucumber.g:2630:2: rule__But__Group__0__Impl rule__But__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalCucumber.g:2637:1: rule__But__Group__0__Impl : ( 'But' ) ;
    public final void rule__But__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2641:1: ( ( 'But' ) )
            // InternalCucumber.g:2642:1: ( 'But' )
            {
            // InternalCucumber.g:2642:1: ( 'But' )
            // InternalCucumber.g:2643:2: 'But'
            {
             before(grammarAccess.getButAccess().getButKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalCucumber.g:2652:1: rule__But__Group__1 : rule__But__Group__1__Impl rule__But__Group__2 ;
    public final void rule__But__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2656:1: ( rule__But__Group__1__Impl rule__But__Group__2 )
            // InternalCucumber.g:2657:2: rule__But__Group__1__Impl rule__But__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalCucumber.g:2664:1: rule__But__Group__1__Impl : ( ( rule__But__NameAssignment_1 ) ) ;
    public final void rule__But__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2668:1: ( ( ( rule__But__NameAssignment_1 ) ) )
            // InternalCucumber.g:2669:1: ( ( rule__But__NameAssignment_1 ) )
            {
            // InternalCucumber.g:2669:1: ( ( rule__But__NameAssignment_1 ) )
            // InternalCucumber.g:2670:2: ( rule__But__NameAssignment_1 )
            {
             before(grammarAccess.getButAccess().getNameAssignment_1()); 
            // InternalCucumber.g:2671:2: ( rule__But__NameAssignment_1 )
            // InternalCucumber.g:2671:3: rule__But__NameAssignment_1
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
    // InternalCucumber.g:2679:1: rule__But__Group__2 : rule__But__Group__2__Impl rule__But__Group__3 ;
    public final void rule__But__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2683:1: ( rule__But__Group__2__Impl rule__But__Group__3 )
            // InternalCucumber.g:2684:2: rule__But__Group__2__Impl rule__But__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__But__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__But__Group__3();

            state._fsp--;


            }

        }
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
    // InternalCucumber.g:2691:1: rule__But__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__But__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2695:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2696:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2696:1: ( RULE_EOL )
            // InternalCucumber.g:2697:2: RULE_EOL
            {
             before(grammarAccess.getButAccess().getEOLTerminalRuleCall_2()); 
            match(input,RULE_EOL,FOLLOW_2); 
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


    // $ANTLR start "rule__But__Group__3"
    // InternalCucumber.g:2706:1: rule__But__Group__3 : rule__But__Group__3__Impl ;
    public final void rule__But__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2710:1: ( rule__But__Group__3__Impl )
            // InternalCucumber.g:2711:2: rule__But__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__But__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__But__Group__3"


    // $ANTLR start "rule__But__Group__3__Impl"
    // InternalCucumber.g:2717:1: rule__But__Group__3__Impl : ( ( rule__But__Alternatives_3 )? ) ;
    public final void rule__But__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2721:1: ( ( ( rule__But__Alternatives_3 )? ) )
            // InternalCucumber.g:2722:1: ( ( rule__But__Alternatives_3 )? )
            {
            // InternalCucumber.g:2722:1: ( ( rule__But__Alternatives_3 )? )
            // InternalCucumber.g:2723:2: ( rule__But__Alternatives_3 )?
            {
             before(grammarAccess.getButAccess().getAlternatives_3()); 
            // InternalCucumber.g:2724:2: ( rule__But__Alternatives_3 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=15 && LA37_0<=16)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCucumber.g:2724:3: rule__But__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__But__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getButAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__But__Group__3__Impl"


    // $ANTLR start "rule__Asterisk__Group__0"
    // InternalCucumber.g:2733:1: rule__Asterisk__Group__0 : rule__Asterisk__Group__0__Impl rule__Asterisk__Group__1 ;
    public final void rule__Asterisk__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2737:1: ( rule__Asterisk__Group__0__Impl rule__Asterisk__Group__1 )
            // InternalCucumber.g:2738:2: rule__Asterisk__Group__0__Impl rule__Asterisk__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalCucumber.g:2745:1: rule__Asterisk__Group__0__Impl : ( '*' ) ;
    public final void rule__Asterisk__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2749:1: ( ( '*' ) )
            // InternalCucumber.g:2750:1: ( '*' )
            {
            // InternalCucumber.g:2750:1: ( '*' )
            // InternalCucumber.g:2751:2: '*'
            {
             before(grammarAccess.getAsteriskAccess().getAsteriskKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCucumber.g:2760:1: rule__Asterisk__Group__1 : rule__Asterisk__Group__1__Impl rule__Asterisk__Group__2 ;
    public final void rule__Asterisk__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2764:1: ( rule__Asterisk__Group__1__Impl rule__Asterisk__Group__2 )
            // InternalCucumber.g:2765:2: rule__Asterisk__Group__1__Impl rule__Asterisk__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalCucumber.g:2772:1: rule__Asterisk__Group__1__Impl : ( ( rule__Asterisk__NameAssignment_1 ) ) ;
    public final void rule__Asterisk__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2776:1: ( ( ( rule__Asterisk__NameAssignment_1 ) ) )
            // InternalCucumber.g:2777:1: ( ( rule__Asterisk__NameAssignment_1 ) )
            {
            // InternalCucumber.g:2777:1: ( ( rule__Asterisk__NameAssignment_1 ) )
            // InternalCucumber.g:2778:2: ( rule__Asterisk__NameAssignment_1 )
            {
             before(grammarAccess.getAsteriskAccess().getNameAssignment_1()); 
            // InternalCucumber.g:2779:2: ( rule__Asterisk__NameAssignment_1 )
            // InternalCucumber.g:2779:3: rule__Asterisk__NameAssignment_1
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
    // InternalCucumber.g:2787:1: rule__Asterisk__Group__2 : rule__Asterisk__Group__2__Impl rule__Asterisk__Group__3 ;
    public final void rule__Asterisk__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2791:1: ( rule__Asterisk__Group__2__Impl rule__Asterisk__Group__3 )
            // InternalCucumber.g:2792:2: rule__Asterisk__Group__2__Impl rule__Asterisk__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Asterisk__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Asterisk__Group__3();

            state._fsp--;


            }

        }
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
    // InternalCucumber.g:2799:1: rule__Asterisk__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__Asterisk__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2803:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2804:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2804:1: ( RULE_EOL )
            // InternalCucumber.g:2805:2: RULE_EOL
            {
             before(grammarAccess.getAsteriskAccess().getEOLTerminalRuleCall_2()); 
            match(input,RULE_EOL,FOLLOW_2); 
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


    // $ANTLR start "rule__Asterisk__Group__3"
    // InternalCucumber.g:2814:1: rule__Asterisk__Group__3 : rule__Asterisk__Group__3__Impl ;
    public final void rule__Asterisk__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2818:1: ( rule__Asterisk__Group__3__Impl )
            // InternalCucumber.g:2819:2: rule__Asterisk__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Asterisk__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asterisk__Group__3"


    // $ANTLR start "rule__Asterisk__Group__3__Impl"
    // InternalCucumber.g:2825:1: rule__Asterisk__Group__3__Impl : ( ( rule__Asterisk__Alternatives_3 )? ) ;
    public final void rule__Asterisk__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2829:1: ( ( ( rule__Asterisk__Alternatives_3 )? ) )
            // InternalCucumber.g:2830:1: ( ( rule__Asterisk__Alternatives_3 )? )
            {
            // InternalCucumber.g:2830:1: ( ( rule__Asterisk__Alternatives_3 )? )
            // InternalCucumber.g:2831:2: ( rule__Asterisk__Alternatives_3 )?
            {
             before(grammarAccess.getAsteriskAccess().getAlternatives_3()); 
            // InternalCucumber.g:2832:2: ( rule__Asterisk__Alternatives_3 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=15 && LA38_0<=16)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCucumber.g:2832:3: rule__Asterisk__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Asterisk__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAsteriskAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asterisk__Group__3__Impl"


    // $ANTLR start "rule__Statement__Group__0"
    // InternalCucumber.g:2841:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2845:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalCucumber.g:2846:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
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
    // InternalCucumber.g:2853:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__NameAssignment_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2857:1: ( ( ( rule__Statement__NameAssignment_0 ) ) )
            // InternalCucumber.g:2858:1: ( ( rule__Statement__NameAssignment_0 ) )
            {
            // InternalCucumber.g:2858:1: ( ( rule__Statement__NameAssignment_0 ) )
            // InternalCucumber.g:2859:2: ( rule__Statement__NameAssignment_0 )
            {
             before(grammarAccess.getStatementAccess().getNameAssignment_0()); 
            // InternalCucumber.g:2860:2: ( rule__Statement__NameAssignment_0 )
            // InternalCucumber.g:2860:3: rule__Statement__NameAssignment_0
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
    // InternalCucumber.g:2868:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2872:1: ( rule__Statement__Group__1__Impl )
            // InternalCucumber.g:2873:2: rule__Statement__Group__1__Impl
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
    // InternalCucumber.g:2879:1: rule__Statement__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2883:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2884:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2884:1: ( RULE_EOL )
            // InternalCucumber.g:2885:2: RULE_EOL
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
    // InternalCucumber.g:2895:1: rule__Tag__Group__0 : rule__Tag__Group__0__Impl rule__Tag__Group__1 ;
    public final void rule__Tag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2899:1: ( rule__Tag__Group__0__Impl rule__Tag__Group__1 )
            // InternalCucumber.g:2900:2: rule__Tag__Group__0__Impl rule__Tag__Group__1
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
    // InternalCucumber.g:2907:1: rule__Tag__Group__0__Impl : ( '@' ) ;
    public final void rule__Tag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2911:1: ( ( '@' ) )
            // InternalCucumber.g:2912:1: ( '@' )
            {
            // InternalCucumber.g:2912:1: ( '@' )
            // InternalCucumber.g:2913:2: '@'
            {
             before(grammarAccess.getTagAccess().getCommercialAtKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalCucumber.g:2922:1: rule__Tag__Group__1 : rule__Tag__Group__1__Impl ;
    public final void rule__Tag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2926:1: ( rule__Tag__Group__1__Impl )
            // InternalCucumber.g:2927:2: rule__Tag__Group__1__Impl
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
    // InternalCucumber.g:2933:1: rule__Tag__Group__1__Impl : ( ( rule__Tag__NameAssignment_1 ) ) ;
    public final void rule__Tag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2937:1: ( ( ( rule__Tag__NameAssignment_1 ) ) )
            // InternalCucumber.g:2938:1: ( ( rule__Tag__NameAssignment_1 ) )
            {
            // InternalCucumber.g:2938:1: ( ( rule__Tag__NameAssignment_1 ) )
            // InternalCucumber.g:2939:2: ( rule__Tag__NameAssignment_1 )
            {
             before(grammarAccess.getTagAccess().getNameAssignment_1()); 
            // InternalCucumber.g:2940:2: ( rule__Tag__NameAssignment_1 )
            // InternalCucumber.g:2940:3: rule__Tag__NameAssignment_1
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


    // $ANTLR start "rule__Feature__TagsAssignment_0_0"
    // InternalCucumber.g:2949:1: rule__Feature__TagsAssignment_0_0 : ( ruleTag ) ;
    public final void rule__Feature__TagsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2953:1: ( ( ruleTag ) )
            // InternalCucumber.g:2954:2: ( ruleTag )
            {
            // InternalCucumber.g:2954:2: ( ruleTag )
            // InternalCucumber.g:2955:3: ruleTag
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
    // InternalCucumber.g:2964:1: rule__Feature__NameAssignment_2 : ( rulePhrase ) ;
    public final void rule__Feature__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2968:1: ( ( rulePhrase ) )
            // InternalCucumber.g:2969:2: ( rulePhrase )
            {
            // InternalCucumber.g:2969:2: ( rulePhrase )
            // InternalCucumber.g:2970:3: rulePhrase
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
    // InternalCucumber.g:2979:1: rule__Feature__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__Feature__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2983:1: ( ( ruleStatement ) )
            // InternalCucumber.g:2984:2: ( ruleStatement )
            {
            // InternalCucumber.g:2984:2: ( ruleStatement )
            // InternalCucumber.g:2985:3: ruleStatement
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
    // InternalCucumber.g:2994:1: rule__Feature__AbstractScenariosAssignment_5 : ( ruleAbstractScenario ) ;
    public final void rule__Feature__AbstractScenariosAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2998:1: ( ( ruleAbstractScenario ) )
            // InternalCucumber.g:2999:2: ( ruleAbstractScenario )
            {
            // InternalCucumber.g:2999:2: ( ruleAbstractScenario )
            // InternalCucumber.g:3000:3: ruleAbstractScenario
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
    // InternalCucumber.g:3009:1: rule__Background__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__Background__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3013:1: ( ( rulePhrase ) )
            // InternalCucumber.g:3014:2: ( rulePhrase )
            {
            // InternalCucumber.g:3014:2: ( rulePhrase )
            // InternalCucumber.g:3015:3: rulePhrase
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
    // InternalCucumber.g:3024:1: rule__Background__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__Background__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3028:1: ( ( ruleStatement ) )
            // InternalCucumber.g:3029:2: ( ruleStatement )
            {
            // InternalCucumber.g:3029:2: ( ruleStatement )
            // InternalCucumber.g:3030:3: ruleStatement
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
    // InternalCucumber.g:3039:1: rule__Background__StepsAssignment_4 : ( ruleStep ) ;
    public final void rule__Background__StepsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3043:1: ( ( ruleStep ) )
            // InternalCucumber.g:3044:2: ( ruleStep )
            {
            // InternalCucumber.g:3044:2: ( ruleStep )
            // InternalCucumber.g:3045:3: ruleStep
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
    // InternalCucumber.g:3054:1: rule__Scenario__TagsAssignment_0_0 : ( ruleTag ) ;
    public final void rule__Scenario__TagsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3058:1: ( ( ruleTag ) )
            // InternalCucumber.g:3059:2: ( ruleTag )
            {
            // InternalCucumber.g:3059:2: ( ruleTag )
            // InternalCucumber.g:3060:3: ruleTag
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
    // InternalCucumber.g:3069:1: rule__Scenario__NameAssignment_2 : ( rulePhrase ) ;
    public final void rule__Scenario__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3073:1: ( ( rulePhrase ) )
            // InternalCucumber.g:3074:2: ( rulePhrase )
            {
            // InternalCucumber.g:3074:2: ( rulePhrase )
            // InternalCucumber.g:3075:3: rulePhrase
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
    // InternalCucumber.g:3084:1: rule__Scenario__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__Scenario__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3088:1: ( ( ruleStatement ) )
            // InternalCucumber.g:3089:2: ( ruleStatement )
            {
            // InternalCucumber.g:3089:2: ( ruleStatement )
            // InternalCucumber.g:3090:3: ruleStatement
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
    // InternalCucumber.g:3099:1: rule__Scenario__StepsAssignment_5 : ( ruleStep ) ;
    public final void rule__Scenario__StepsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3103:1: ( ( ruleStep ) )
            // InternalCucumber.g:3104:2: ( ruleStep )
            {
            // InternalCucumber.g:3104:2: ( ruleStep )
            // InternalCucumber.g:3105:3: ruleStep
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
    // InternalCucumber.g:3114:1: rule__ScenarioOutline__TagsAssignment_0_0 : ( ruleTag ) ;
    public final void rule__ScenarioOutline__TagsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3118:1: ( ( ruleTag ) )
            // InternalCucumber.g:3119:2: ( ruleTag )
            {
            // InternalCucumber.g:3119:2: ( ruleTag )
            // InternalCucumber.g:3120:3: ruleTag
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
    // InternalCucumber.g:3129:1: rule__ScenarioOutline__NameAssignment_2 : ( rulePhrase ) ;
    public final void rule__ScenarioOutline__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3133:1: ( ( rulePhrase ) )
            // InternalCucumber.g:3134:2: ( rulePhrase )
            {
            // InternalCucumber.g:3134:2: ( rulePhrase )
            // InternalCucumber.g:3135:3: rulePhrase
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
    // InternalCucumber.g:3144:1: rule__ScenarioOutline__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__ScenarioOutline__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3148:1: ( ( ruleStatement ) )
            // InternalCucumber.g:3149:2: ( ruleStatement )
            {
            // InternalCucumber.g:3149:2: ( ruleStatement )
            // InternalCucumber.g:3150:3: ruleStatement
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
    // InternalCucumber.g:3159:1: rule__ScenarioOutline__StepsAssignment_5 : ( ruleStep ) ;
    public final void rule__ScenarioOutline__StepsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3163:1: ( ( ruleStep ) )
            // InternalCucumber.g:3164:2: ( ruleStep )
            {
            // InternalCucumber.g:3164:2: ( ruleStep )
            // InternalCucumber.g:3165:3: ruleStep
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
    // InternalCucumber.g:3174:1: rule__ScenarioOutline__ExamplesAssignment_6 : ( ruleExamples ) ;
    public final void rule__ScenarioOutline__ExamplesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3178:1: ( ( ruleExamples ) )
            // InternalCucumber.g:3179:2: ( ruleExamples )
            {
            // InternalCucumber.g:3179:2: ( ruleExamples )
            // InternalCucumber.g:3180:3: ruleExamples
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
    // InternalCucumber.g:3189:1: rule__Examples__TagsAssignment_0_0 : ( ruleTag ) ;
    public final void rule__Examples__TagsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3193:1: ( ( ruleTag ) )
            // InternalCucumber.g:3194:2: ( ruleTag )
            {
            // InternalCucumber.g:3194:2: ( ruleTag )
            // InternalCucumber.g:3195:3: ruleTag
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
    // InternalCucumber.g:3204:1: rule__Examples__NameAssignment_2 : ( rulePhrase ) ;
    public final void rule__Examples__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3208:1: ( ( rulePhrase ) )
            // InternalCucumber.g:3209:2: ( rulePhrase )
            {
            // InternalCucumber.g:3209:2: ( rulePhrase )
            // InternalCucumber.g:3210:3: rulePhrase
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
    // InternalCucumber.g:3219:1: rule__Examples__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__Examples__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3223:1: ( ( ruleStatement ) )
            // InternalCucumber.g:3224:2: ( ruleStatement )
            {
            // InternalCucumber.g:3224:2: ( ruleStatement )
            // InternalCucumber.g:3225:3: ruleStatement
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
    // InternalCucumber.g:3234:1: rule__Examples__TheExamplesTableAssignment_5 : ( ruleExamplesTable ) ;
    public final void rule__Examples__TheExamplesTableAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3238:1: ( ( ruleExamplesTable ) )
            // InternalCucumber.g:3239:2: ( ruleExamplesTable )
            {
            // InternalCucumber.g:3239:2: ( ruleExamplesTable )
            // InternalCucumber.g:3240:3: ruleExamplesTable
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
    // InternalCucumber.g:3249:1: rule__ExamplesTable__RowsAssignment : ( ruleRow ) ;
    public final void rule__ExamplesTable__RowsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3253:1: ( ( ruleRow ) )
            // InternalCucumber.g:3254:2: ( ruleRow )
            {
            // InternalCucumber.g:3254:2: ( ruleRow )
            // InternalCucumber.g:3255:3: ruleRow
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
    // InternalCucumber.g:3264:1: rule__StepTable__RowsAssignment : ( ruleRow ) ;
    public final void rule__StepTable__RowsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3268:1: ( ( ruleRow ) )
            // InternalCucumber.g:3269:2: ( ruleRow )
            {
            // InternalCucumber.g:3269:2: ( ruleRow )
            // InternalCucumber.g:3270:3: ruleRow
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
    // InternalCucumber.g:3279:1: rule__Row__CellsAssignment_0 : ( ruleCell ) ;
    public final void rule__Row__CellsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3283:1: ( ( ruleCell ) )
            // InternalCucumber.g:3284:2: ( ruleCell )
            {
            // InternalCucumber.g:3284:2: ( ruleCell )
            // InternalCucumber.g:3285:3: ruleCell
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
    // InternalCucumber.g:3294:1: rule__Cell__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__Cell__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3298:1: ( ( rulePhrase ) )
            // InternalCucumber.g:3299:2: ( rulePhrase )
            {
            // InternalCucumber.g:3299:2: ( rulePhrase )
            // InternalCucumber.g:3300:3: rulePhrase
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


    // $ANTLR start "rule__DocString__StatementsAssignment_2"
    // InternalCucumber.g:3309:1: rule__DocString__StatementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__DocString__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3313:1: ( ( ruleStatement ) )
            // InternalCucumber.g:3314:2: ( ruleStatement )
            {
            // InternalCucumber.g:3314:2: ( ruleStatement )
            // InternalCucumber.g:3315:3: ruleStatement
            {
             before(grammarAccess.getDocStringAccess().getStatementsStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getDocStringAccess().getStatementsStatementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocString__StatementsAssignment_2"


    // $ANTLR start "rule__Given__NameAssignment_1"
    // InternalCucumber.g:3324:1: rule__Given__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__Given__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3328:1: ( ( rulePhrase ) )
            // InternalCucumber.g:3329:2: ( rulePhrase )
            {
            // InternalCucumber.g:3329:2: ( rulePhrase )
            // InternalCucumber.g:3330:3: rulePhrase
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


    // $ANTLR start "rule__Given__TheStepTableAssignment_3_0"
    // InternalCucumber.g:3339:1: rule__Given__TheStepTableAssignment_3_0 : ( ruleStepTable ) ;
    public final void rule__Given__TheStepTableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3343:1: ( ( ruleStepTable ) )
            // InternalCucumber.g:3344:2: ( ruleStepTable )
            {
            // InternalCucumber.g:3344:2: ( ruleStepTable )
            // InternalCucumber.g:3345:3: ruleStepTable
            {
             before(grammarAccess.getGivenAccess().getTheStepTableStepTableParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStepTable();

            state._fsp--;

             after(grammarAccess.getGivenAccess().getTheStepTableStepTableParserRuleCall_3_0_0()); 

            }


            }

        }
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
    // InternalCucumber.g:3354:1: rule__Given__TheDocStringAssignment_3_1 : ( ruleDocString ) ;
    public final void rule__Given__TheDocStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3358:1: ( ( ruleDocString ) )
            // InternalCucumber.g:3359:2: ( ruleDocString )
            {
            // InternalCucumber.g:3359:2: ( ruleDocString )
            // InternalCucumber.g:3360:3: ruleDocString
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


    // $ANTLR start "rule__When__NameAssignment_1"
    // InternalCucumber.g:3369:1: rule__When__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__When__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3373:1: ( ( rulePhrase ) )
            // InternalCucumber.g:3374:2: ( rulePhrase )
            {
            // InternalCucumber.g:3374:2: ( rulePhrase )
            // InternalCucumber.g:3375:3: rulePhrase
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


    // $ANTLR start "rule__When__TheStepTableAssignment_3_0"
    // InternalCucumber.g:3384:1: rule__When__TheStepTableAssignment_3_0 : ( ruleStepTable ) ;
    public final void rule__When__TheStepTableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3388:1: ( ( ruleStepTable ) )
            // InternalCucumber.g:3389:2: ( ruleStepTable )
            {
            // InternalCucumber.g:3389:2: ( ruleStepTable )
            // InternalCucumber.g:3390:3: ruleStepTable
            {
             before(grammarAccess.getWhenAccess().getTheStepTableStepTableParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStepTable();

            state._fsp--;

             after(grammarAccess.getWhenAccess().getTheStepTableStepTableParserRuleCall_3_0_0()); 

            }


            }

        }
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
    // InternalCucumber.g:3399:1: rule__When__TheDocStringAssignment_3_1 : ( ruleDocString ) ;
    public final void rule__When__TheDocStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3403:1: ( ( ruleDocString ) )
            // InternalCucumber.g:3404:2: ( ruleDocString )
            {
            // InternalCucumber.g:3404:2: ( ruleDocString )
            // InternalCucumber.g:3405:3: ruleDocString
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


    // $ANTLR start "rule__Then__NameAssignment_1"
    // InternalCucumber.g:3414:1: rule__Then__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__Then__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3418:1: ( ( rulePhrase ) )
            // InternalCucumber.g:3419:2: ( rulePhrase )
            {
            // InternalCucumber.g:3419:2: ( rulePhrase )
            // InternalCucumber.g:3420:3: rulePhrase
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


    // $ANTLR start "rule__Then__TheStepTableAssignment_3_0"
    // InternalCucumber.g:3429:1: rule__Then__TheStepTableAssignment_3_0 : ( ruleStepTable ) ;
    public final void rule__Then__TheStepTableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3433:1: ( ( ruleStepTable ) )
            // InternalCucumber.g:3434:2: ( ruleStepTable )
            {
            // InternalCucumber.g:3434:2: ( ruleStepTable )
            // InternalCucumber.g:3435:3: ruleStepTable
            {
             before(grammarAccess.getThenAccess().getTheStepTableStepTableParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStepTable();

            state._fsp--;

             after(grammarAccess.getThenAccess().getTheStepTableStepTableParserRuleCall_3_0_0()); 

            }


            }

        }
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
    // InternalCucumber.g:3444:1: rule__Then__TheDocStringAssignment_3_1 : ( ruleDocString ) ;
    public final void rule__Then__TheDocStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3448:1: ( ( ruleDocString ) )
            // InternalCucumber.g:3449:2: ( ruleDocString )
            {
            // InternalCucumber.g:3449:2: ( ruleDocString )
            // InternalCucumber.g:3450:3: ruleDocString
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


    // $ANTLR start "rule__And__NameAssignment_1"
    // InternalCucumber.g:3459:1: rule__And__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__And__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3463:1: ( ( rulePhrase ) )
            // InternalCucumber.g:3464:2: ( rulePhrase )
            {
            // InternalCucumber.g:3464:2: ( rulePhrase )
            // InternalCucumber.g:3465:3: rulePhrase
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


    // $ANTLR start "rule__And__TheStepTableAssignment_3_0"
    // InternalCucumber.g:3474:1: rule__And__TheStepTableAssignment_3_0 : ( ruleStepTable ) ;
    public final void rule__And__TheStepTableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3478:1: ( ( ruleStepTable ) )
            // InternalCucumber.g:3479:2: ( ruleStepTable )
            {
            // InternalCucumber.g:3479:2: ( ruleStepTable )
            // InternalCucumber.g:3480:3: ruleStepTable
            {
             before(grammarAccess.getAndAccess().getTheStepTableStepTableParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStepTable();

            state._fsp--;

             after(grammarAccess.getAndAccess().getTheStepTableStepTableParserRuleCall_3_0_0()); 

            }


            }

        }
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
    // InternalCucumber.g:3489:1: rule__And__TheDocStringAssignment_3_1 : ( ruleDocString ) ;
    public final void rule__And__TheDocStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3493:1: ( ( ruleDocString ) )
            // InternalCucumber.g:3494:2: ( ruleDocString )
            {
            // InternalCucumber.g:3494:2: ( ruleDocString )
            // InternalCucumber.g:3495:3: ruleDocString
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


    // $ANTLR start "rule__But__NameAssignment_1"
    // InternalCucumber.g:3504:1: rule__But__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__But__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3508:1: ( ( rulePhrase ) )
            // InternalCucumber.g:3509:2: ( rulePhrase )
            {
            // InternalCucumber.g:3509:2: ( rulePhrase )
            // InternalCucumber.g:3510:3: rulePhrase
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


    // $ANTLR start "rule__But__TheStepTableAssignment_3_0"
    // InternalCucumber.g:3519:1: rule__But__TheStepTableAssignment_3_0 : ( ruleStepTable ) ;
    public final void rule__But__TheStepTableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3523:1: ( ( ruleStepTable ) )
            // InternalCucumber.g:3524:2: ( ruleStepTable )
            {
            // InternalCucumber.g:3524:2: ( ruleStepTable )
            // InternalCucumber.g:3525:3: ruleStepTable
            {
             before(grammarAccess.getButAccess().getTheStepTableStepTableParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStepTable();

            state._fsp--;

             after(grammarAccess.getButAccess().getTheStepTableStepTableParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__But__TheStepTableAssignment_3_0"


    // $ANTLR start "rule__But__TheDocStringAssignment_3_1"
    // InternalCucumber.g:3534:1: rule__But__TheDocStringAssignment_3_1 : ( ruleDocString ) ;
    public final void rule__But__TheDocStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3538:1: ( ( ruleDocString ) )
            // InternalCucumber.g:3539:2: ( ruleDocString )
            {
            // InternalCucumber.g:3539:2: ( ruleDocString )
            // InternalCucumber.g:3540:3: ruleDocString
            {
             before(grammarAccess.getButAccess().getTheDocStringDocStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDocString();

            state._fsp--;

             after(grammarAccess.getButAccess().getTheDocStringDocStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__But__TheDocStringAssignment_3_1"


    // $ANTLR start "rule__Asterisk__NameAssignment_1"
    // InternalCucumber.g:3549:1: rule__Asterisk__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__Asterisk__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3553:1: ( ( rulePhrase ) )
            // InternalCucumber.g:3554:2: ( rulePhrase )
            {
            // InternalCucumber.g:3554:2: ( rulePhrase )
            // InternalCucumber.g:3555:3: rulePhrase
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


    // $ANTLR start "rule__Asterisk__TheStepTableAssignment_3_0"
    // InternalCucumber.g:3564:1: rule__Asterisk__TheStepTableAssignment_3_0 : ( ruleStepTable ) ;
    public final void rule__Asterisk__TheStepTableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3568:1: ( ( ruleStepTable ) )
            // InternalCucumber.g:3569:2: ( ruleStepTable )
            {
            // InternalCucumber.g:3569:2: ( ruleStepTable )
            // InternalCucumber.g:3570:3: ruleStepTable
            {
             before(grammarAccess.getAsteriskAccess().getTheStepTableStepTableParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStepTable();

            state._fsp--;

             after(grammarAccess.getAsteriskAccess().getTheStepTableStepTableParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asterisk__TheStepTableAssignment_3_0"


    // $ANTLR start "rule__Asterisk__TheDocStringAssignment_3_1"
    // InternalCucumber.g:3579:1: rule__Asterisk__TheDocStringAssignment_3_1 : ( ruleDocString ) ;
    public final void rule__Asterisk__TheDocStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3583:1: ( ( ruleDocString ) )
            // InternalCucumber.g:3584:2: ( ruleDocString )
            {
            // InternalCucumber.g:3584:2: ( ruleDocString )
            // InternalCucumber.g:3585:3: ruleDocString
            {
             before(grammarAccess.getAsteriskAccess().getTheDocStringDocStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDocString();

            state._fsp--;

             after(grammarAccess.getAsteriskAccess().getTheDocStringDocStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asterisk__TheDocStringAssignment_3_1"


    // $ANTLR start "rule__Statement__NameAssignment_0"
    // InternalCucumber.g:3594:1: rule__Statement__NameAssignment_0 : ( rulePhrase ) ;
    public final void rule__Statement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3598:1: ( ( rulePhrase ) )
            // InternalCucumber.g:3599:2: ( rulePhrase )
            {
            // InternalCucumber.g:3599:2: ( rulePhrase )
            // InternalCucumber.g:3600:3: rulePhrase
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
    // InternalCucumber.g:3609:1: rule__Tag__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Tag__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3613:1: ( ( RULE_ID ) )
            // InternalCucumber.g:3614:2: ( RULE_ID )
            {
            // InternalCucumber.g:3614:2: ( RULE_ID )
            // InternalCucumber.g:3615:3: RULE_ID
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


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\1\13\1\uffff\1\5\2\uffff\1\7\1\5\1\14\1\7";
    static final String dfa_3s = "\1\27\1\uffff\1\5\2\uffff\1\27\1\5\1\15\1\27";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\2\1\3\4\uffff";
    static final String dfa_5s = "\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\3\1\4\11\uffff\1\2",
            "",
            "\1\5",
            "",
            "",
            "\1\7\17\uffff\1\6",
            "\1\10",
            "\1\3\1\4",
            "\1\7\17\uffff\1\6"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "623:1: rule__AbstractScenario__Alternatives : ( ( ruleBackground ) | ( ruleScenario ) | ( ruleScenarioOutline ) );";
        }
    }
    static final String dfa_7s = "\10\uffff";
    static final String dfa_8s = "\1\1\7\uffff";
    static final String dfa_9s = "\1\13\1\uffff\1\5\1\uffff\1\7\1\5\1\14\1\7";
    static final String dfa_10s = "\1\27\1\uffff\1\5\1\uffff\1\27\1\5\1\16\1\27";
    static final String dfa_11s = "\1\uffff\1\2\1\uffff\1\1\4\uffff";
    static final String dfa_12s = "\10\uffff}>";
    static final String[] dfa_13s = {
            "\3\1\1\3\10\uffff\1\2",
            "",
            "\1\4",
            "",
            "\1\6\17\uffff\1\5",
            "\1\7",
            "\2\1\1\3",
            "\1\6\17\uffff\1\5"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 1615:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000803870L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000803802L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000007E0070L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000007E0002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000803800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000FE4070L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000FE4072L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});

}
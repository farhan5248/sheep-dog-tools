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


    // $ANTLR start "entryRuleLine"
    // InternalCucumber.g:599:1: entryRuleLine : ruleLine EOF ;
    public final void entryRuleLine() throws RecognitionException {
        try {
            // InternalCucumber.g:600:1: ( ruleLine EOF )
            // InternalCucumber.g:601:1: ruleLine EOF
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
    // InternalCucumber.g:608:1: ruleLine : ( ( rule__Line__Group__0 ) ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:612:2: ( ( ( rule__Line__Group__0 ) ) )
            // InternalCucumber.g:613:2: ( ( rule__Line__Group__0 ) )
            {
            // InternalCucumber.g:613:2: ( ( rule__Line__Group__0 ) )
            // InternalCucumber.g:614:3: ( rule__Line__Group__0 )
            {
             before(grammarAccess.getLineAccess().getGroup()); 
            // InternalCucumber.g:615:3: ( rule__Line__Group__0 )
            // InternalCucumber.g:615:4: rule__Line__Group__0
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
    // InternalCucumber.g:624:1: entryRuleLineBits : ruleLineBits EOF ;
    public final void entryRuleLineBits() throws RecognitionException {
        try {
            // InternalCucumber.g:625:1: ( ruleLineBits EOF )
            // InternalCucumber.g:626:1: ruleLineBits EOF
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
    // InternalCucumber.g:633:1: ruleLineBits : ( ( ruleTEXT_LITERAL )* ) ;
    public final void ruleLineBits() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:637:2: ( ( ( ruleTEXT_LITERAL )* ) )
            // InternalCucumber.g:638:2: ( ( ruleTEXT_LITERAL )* )
            {
            // InternalCucumber.g:638:2: ( ( ruleTEXT_LITERAL )* )
            // InternalCucumber.g:639:3: ( ruleTEXT_LITERAL )*
            {
             before(grammarAccess.getLineBitsAccess().getTEXT_LITERALParserRuleCall()); 
            // InternalCucumber.g:640:3: ( ruleTEXT_LITERAL )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_WORD && LA4_0<=RULE_STRING)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCucumber.g:640:4: ruleTEXT_LITERAL
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
    // InternalCucumber.g:649:1: entryRuleTEXT_LITERAL : ruleTEXT_LITERAL EOF ;
    public final void entryRuleTEXT_LITERAL() throws RecognitionException {
        try {
            // InternalCucumber.g:650:1: ( ruleTEXT_LITERAL EOF )
            // InternalCucumber.g:651:1: ruleTEXT_LITERAL EOF
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
    // InternalCucumber.g:658:1: ruleTEXT_LITERAL : ( ( rule__TEXT_LITERAL__Alternatives ) ) ;
    public final void ruleTEXT_LITERAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:662:2: ( ( ( rule__TEXT_LITERAL__Alternatives ) ) )
            // InternalCucumber.g:663:2: ( ( rule__TEXT_LITERAL__Alternatives ) )
            {
            // InternalCucumber.g:663:2: ( ( rule__TEXT_LITERAL__Alternatives ) )
            // InternalCucumber.g:664:3: ( rule__TEXT_LITERAL__Alternatives )
            {
             before(grammarAccess.getTEXT_LITERALAccess().getAlternatives()); 
            // InternalCucumber.g:665:3: ( rule__TEXT_LITERAL__Alternatives )
            // InternalCucumber.g:665:4: rule__TEXT_LITERAL__Alternatives
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
    // InternalCucumber.g:673:1: rule__AbstractScenario__Alternatives : ( ( ruleBackground ) | ( ruleScenario ) | ( ruleScenarioOutline ) );
    public final void rule__AbstractScenario__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:677:1: ( ( ruleBackground ) | ( ruleScenario ) | ( ruleScenarioOutline ) )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalCucumber.g:678:2: ( ruleBackground )
                    {
                    // InternalCucumber.g:678:2: ( ruleBackground )
                    // InternalCucumber.g:679:3: ruleBackground
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
                    // InternalCucumber.g:684:2: ( ruleScenario )
                    {
                    // InternalCucumber.g:684:2: ( ruleScenario )
                    // InternalCucumber.g:685:3: ruleScenario
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
                    // InternalCucumber.g:690:2: ( ruleScenarioOutline )
                    {
                    // InternalCucumber.g:690:2: ( ruleScenarioOutline )
                    // InternalCucumber.g:691:3: ruleScenarioOutline
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
    // InternalCucumber.g:700:1: rule__Step__Alternatives : ( ( ruleGiven ) | ( ruleWhen ) | ( ruleThen ) | ( ruleAnd ) | ( ruleBut ) | ( ruleAsterisk ) );
    public final void rule__Step__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:704:1: ( ( ruleGiven ) | ( ruleWhen ) | ( ruleThen ) | ( ruleAnd ) | ( ruleBut ) | ( ruleAsterisk ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case 19:
                {
                alt6=3;
                }
                break;
            case 20:
                {
                alt6=4;
                }
                break;
            case 21:
                {
                alt6=5;
                }
                break;
            case 22:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalCucumber.g:705:2: ( ruleGiven )
                    {
                    // InternalCucumber.g:705:2: ( ruleGiven )
                    // InternalCucumber.g:706:3: ruleGiven
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
                    // InternalCucumber.g:711:2: ( ruleWhen )
                    {
                    // InternalCucumber.g:711:2: ( ruleWhen )
                    // InternalCucumber.g:712:3: ruleWhen
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
                    // InternalCucumber.g:717:2: ( ruleThen )
                    {
                    // InternalCucumber.g:717:2: ( ruleThen )
                    // InternalCucumber.g:718:3: ruleThen
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
                    // InternalCucumber.g:723:2: ( ruleAnd )
                    {
                    // InternalCucumber.g:723:2: ( ruleAnd )
                    // InternalCucumber.g:724:3: ruleAnd
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
                    // InternalCucumber.g:729:2: ( ruleBut )
                    {
                    // InternalCucumber.g:729:2: ( ruleBut )
                    // InternalCucumber.g:730:3: ruleBut
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
                    // InternalCucumber.g:735:2: ( ruleAsterisk )
                    {
                    // InternalCucumber.g:735:2: ( ruleAsterisk )
                    // InternalCucumber.g:736:3: ruleAsterisk
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
    // InternalCucumber.g:745:1: rule__Given__Alternatives_3 : ( ( ( rule__Given__TheStepTableAssignment_3_0 ) ) | ( ( rule__Given__TheDocStringAssignment_3_1 ) ) );
    public final void rule__Given__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:749:1: ( ( ( rule__Given__TheStepTableAssignment_3_0 ) ) | ( ( rule__Given__TheDocStringAssignment_3_1 ) ) )
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
                    // InternalCucumber.g:750:2: ( ( rule__Given__TheStepTableAssignment_3_0 ) )
                    {
                    // InternalCucumber.g:750:2: ( ( rule__Given__TheStepTableAssignment_3_0 ) )
                    // InternalCucumber.g:751:3: ( rule__Given__TheStepTableAssignment_3_0 )
                    {
                     before(grammarAccess.getGivenAccess().getTheStepTableAssignment_3_0()); 
                    // InternalCucumber.g:752:3: ( rule__Given__TheStepTableAssignment_3_0 )
                    // InternalCucumber.g:752:4: rule__Given__TheStepTableAssignment_3_0
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
                    // InternalCucumber.g:756:2: ( ( rule__Given__TheDocStringAssignment_3_1 ) )
                    {
                    // InternalCucumber.g:756:2: ( ( rule__Given__TheDocStringAssignment_3_1 ) )
                    // InternalCucumber.g:757:3: ( rule__Given__TheDocStringAssignment_3_1 )
                    {
                     before(grammarAccess.getGivenAccess().getTheDocStringAssignment_3_1()); 
                    // InternalCucumber.g:758:3: ( rule__Given__TheDocStringAssignment_3_1 )
                    // InternalCucumber.g:758:4: rule__Given__TheDocStringAssignment_3_1
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
    // InternalCucumber.g:766:1: rule__When__Alternatives_3 : ( ( ( rule__When__TheStepTableAssignment_3_0 ) ) | ( ( rule__When__TheDocStringAssignment_3_1 ) ) );
    public final void rule__When__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:770:1: ( ( ( rule__When__TheStepTableAssignment_3_0 ) ) | ( ( rule__When__TheDocStringAssignment_3_1 ) ) )
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
                    // InternalCucumber.g:771:2: ( ( rule__When__TheStepTableAssignment_3_0 ) )
                    {
                    // InternalCucumber.g:771:2: ( ( rule__When__TheStepTableAssignment_3_0 ) )
                    // InternalCucumber.g:772:3: ( rule__When__TheStepTableAssignment_3_0 )
                    {
                     before(grammarAccess.getWhenAccess().getTheStepTableAssignment_3_0()); 
                    // InternalCucumber.g:773:3: ( rule__When__TheStepTableAssignment_3_0 )
                    // InternalCucumber.g:773:4: rule__When__TheStepTableAssignment_3_0
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
                    // InternalCucumber.g:777:2: ( ( rule__When__TheDocStringAssignment_3_1 ) )
                    {
                    // InternalCucumber.g:777:2: ( ( rule__When__TheDocStringAssignment_3_1 ) )
                    // InternalCucumber.g:778:3: ( rule__When__TheDocStringAssignment_3_1 )
                    {
                     before(grammarAccess.getWhenAccess().getTheDocStringAssignment_3_1()); 
                    // InternalCucumber.g:779:3: ( rule__When__TheDocStringAssignment_3_1 )
                    // InternalCucumber.g:779:4: rule__When__TheDocStringAssignment_3_1
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
    // InternalCucumber.g:787:1: rule__Then__Alternatives_3 : ( ( ( rule__Then__TheStepTableAssignment_3_0 ) ) | ( ( rule__Then__TheDocStringAssignment_3_1 ) ) );
    public final void rule__Then__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:791:1: ( ( ( rule__Then__TheStepTableAssignment_3_0 ) ) | ( ( rule__Then__TheDocStringAssignment_3_1 ) ) )
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
                    // InternalCucumber.g:792:2: ( ( rule__Then__TheStepTableAssignment_3_0 ) )
                    {
                    // InternalCucumber.g:792:2: ( ( rule__Then__TheStepTableAssignment_3_0 ) )
                    // InternalCucumber.g:793:3: ( rule__Then__TheStepTableAssignment_3_0 )
                    {
                     before(grammarAccess.getThenAccess().getTheStepTableAssignment_3_0()); 
                    // InternalCucumber.g:794:3: ( rule__Then__TheStepTableAssignment_3_0 )
                    // InternalCucumber.g:794:4: rule__Then__TheStepTableAssignment_3_0
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
                    // InternalCucumber.g:798:2: ( ( rule__Then__TheDocStringAssignment_3_1 ) )
                    {
                    // InternalCucumber.g:798:2: ( ( rule__Then__TheDocStringAssignment_3_1 ) )
                    // InternalCucumber.g:799:3: ( rule__Then__TheDocStringAssignment_3_1 )
                    {
                     before(grammarAccess.getThenAccess().getTheDocStringAssignment_3_1()); 
                    // InternalCucumber.g:800:3: ( rule__Then__TheDocStringAssignment_3_1 )
                    // InternalCucumber.g:800:4: rule__Then__TheDocStringAssignment_3_1
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
    // InternalCucumber.g:808:1: rule__And__Alternatives_3 : ( ( ( rule__And__TheStepTableAssignment_3_0 ) ) | ( ( rule__And__TheDocStringAssignment_3_1 ) ) );
    public final void rule__And__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:812:1: ( ( ( rule__And__TheStepTableAssignment_3_0 ) ) | ( ( rule__And__TheDocStringAssignment_3_1 ) ) )
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
                    // InternalCucumber.g:813:2: ( ( rule__And__TheStepTableAssignment_3_0 ) )
                    {
                    // InternalCucumber.g:813:2: ( ( rule__And__TheStepTableAssignment_3_0 ) )
                    // InternalCucumber.g:814:3: ( rule__And__TheStepTableAssignment_3_0 )
                    {
                     before(grammarAccess.getAndAccess().getTheStepTableAssignment_3_0()); 
                    // InternalCucumber.g:815:3: ( rule__And__TheStepTableAssignment_3_0 )
                    // InternalCucumber.g:815:4: rule__And__TheStepTableAssignment_3_0
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
                    // InternalCucumber.g:819:2: ( ( rule__And__TheDocStringAssignment_3_1 ) )
                    {
                    // InternalCucumber.g:819:2: ( ( rule__And__TheDocStringAssignment_3_1 ) )
                    // InternalCucumber.g:820:3: ( rule__And__TheDocStringAssignment_3_1 )
                    {
                     before(grammarAccess.getAndAccess().getTheDocStringAssignment_3_1()); 
                    // InternalCucumber.g:821:3: ( rule__And__TheDocStringAssignment_3_1 )
                    // InternalCucumber.g:821:4: rule__And__TheDocStringAssignment_3_1
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
    // InternalCucumber.g:829:1: rule__But__Alternatives_3 : ( ( ( rule__But__TheStepTableAssignment_3_0 ) ) | ( ( rule__But__TheDocStringAssignment_3_1 ) ) );
    public final void rule__But__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:833:1: ( ( ( rule__But__TheStepTableAssignment_3_0 ) ) | ( ( rule__But__TheDocStringAssignment_3_1 ) ) )
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
                    // InternalCucumber.g:834:2: ( ( rule__But__TheStepTableAssignment_3_0 ) )
                    {
                    // InternalCucumber.g:834:2: ( ( rule__But__TheStepTableAssignment_3_0 ) )
                    // InternalCucumber.g:835:3: ( rule__But__TheStepTableAssignment_3_0 )
                    {
                     before(grammarAccess.getButAccess().getTheStepTableAssignment_3_0()); 
                    // InternalCucumber.g:836:3: ( rule__But__TheStepTableAssignment_3_0 )
                    // InternalCucumber.g:836:4: rule__But__TheStepTableAssignment_3_0
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
                    // InternalCucumber.g:840:2: ( ( rule__But__TheDocStringAssignment_3_1 ) )
                    {
                    // InternalCucumber.g:840:2: ( ( rule__But__TheDocStringAssignment_3_1 ) )
                    // InternalCucumber.g:841:3: ( rule__But__TheDocStringAssignment_3_1 )
                    {
                     before(grammarAccess.getButAccess().getTheDocStringAssignment_3_1()); 
                    // InternalCucumber.g:842:3: ( rule__But__TheDocStringAssignment_3_1 )
                    // InternalCucumber.g:842:4: rule__But__TheDocStringAssignment_3_1
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
    // InternalCucumber.g:850:1: rule__Asterisk__Alternatives_3 : ( ( ( rule__Asterisk__TheStepTableAssignment_3_0 ) ) | ( ( rule__Asterisk__TheDocStringAssignment_3_1 ) ) );
    public final void rule__Asterisk__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:854:1: ( ( ( rule__Asterisk__TheStepTableAssignment_3_0 ) ) | ( ( rule__Asterisk__TheDocStringAssignment_3_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            else if ( (LA12_0==16) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalCucumber.g:855:2: ( ( rule__Asterisk__TheStepTableAssignment_3_0 ) )
                    {
                    // InternalCucumber.g:855:2: ( ( rule__Asterisk__TheStepTableAssignment_3_0 ) )
                    // InternalCucumber.g:856:3: ( rule__Asterisk__TheStepTableAssignment_3_0 )
                    {
                     before(grammarAccess.getAsteriskAccess().getTheStepTableAssignment_3_0()); 
                    // InternalCucumber.g:857:3: ( rule__Asterisk__TheStepTableAssignment_3_0 )
                    // InternalCucumber.g:857:4: rule__Asterisk__TheStepTableAssignment_3_0
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
                    // InternalCucumber.g:861:2: ( ( rule__Asterisk__TheDocStringAssignment_3_1 ) )
                    {
                    // InternalCucumber.g:861:2: ( ( rule__Asterisk__TheDocStringAssignment_3_1 ) )
                    // InternalCucumber.g:862:3: ( rule__Asterisk__TheDocStringAssignment_3_1 )
                    {
                     before(grammarAccess.getAsteriskAccess().getTheDocStringAssignment_3_1()); 
                    // InternalCucumber.g:863:3: ( rule__Asterisk__TheDocStringAssignment_3_1 )
                    // InternalCucumber.g:863:4: rule__Asterisk__TheDocStringAssignment_3_1
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
    // InternalCucumber.g:871:1: rule__TEXT_LITERAL__Alternatives : ( ( RULE_WORD ) | ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__TEXT_LITERAL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:875:1: ( ( RULE_WORD ) | ( RULE_ID ) | ( RULE_STRING ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                alt13=1;
                }
                break;
            case RULE_ID:
                {
                alt13=2;
                }
                break;
            case RULE_STRING:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalCucumber.g:876:2: ( RULE_WORD )
                    {
                    // InternalCucumber.g:876:2: ( RULE_WORD )
                    // InternalCucumber.g:877:3: RULE_WORD
                    {
                     before(grammarAccess.getTEXT_LITERALAccess().getWORDTerminalRuleCall_0()); 
                    match(input,RULE_WORD,FOLLOW_2); 
                     after(grammarAccess.getTEXT_LITERALAccess().getWORDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:882:2: ( RULE_ID )
                    {
                    // InternalCucumber.g:882:2: ( RULE_ID )
                    // InternalCucumber.g:883:3: RULE_ID
                    {
                     before(grammarAccess.getTEXT_LITERALAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getTEXT_LITERALAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCucumber.g:888:2: ( RULE_STRING )
                    {
                    // InternalCucumber.g:888:2: ( RULE_STRING )
                    // InternalCucumber.g:889:3: RULE_STRING
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
    // InternalCucumber.g:898:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:902:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalCucumber.g:903:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
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
    // InternalCucumber.g:910:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__Group_0__0 )? ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:914:1: ( ( ( rule__Feature__Group_0__0 )? ) )
            // InternalCucumber.g:915:1: ( ( rule__Feature__Group_0__0 )? )
            {
            // InternalCucumber.g:915:1: ( ( rule__Feature__Group_0__0 )? )
            // InternalCucumber.g:916:2: ( rule__Feature__Group_0__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_0()); 
            // InternalCucumber.g:917:2: ( rule__Feature__Group_0__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCucumber.g:917:3: rule__Feature__Group_0__0
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
    // InternalCucumber.g:925:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:929:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalCucumber.g:930:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
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
    // InternalCucumber.g:937:1: rule__Feature__Group__1__Impl : ( 'Feature:' ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:941:1: ( ( 'Feature:' ) )
            // InternalCucumber.g:942:1: ( 'Feature:' )
            {
            // InternalCucumber.g:942:1: ( 'Feature:' )
            // InternalCucumber.g:943:2: 'Feature:'
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
    // InternalCucumber.g:952:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:956:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalCucumber.g:957:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
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
    // InternalCucumber.g:964:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__NameAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:968:1: ( ( ( rule__Feature__NameAssignment_2 ) ) )
            // InternalCucumber.g:969:1: ( ( rule__Feature__NameAssignment_2 ) )
            {
            // InternalCucumber.g:969:1: ( ( rule__Feature__NameAssignment_2 ) )
            // InternalCucumber.g:970:2: ( rule__Feature__NameAssignment_2 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_2()); 
            // InternalCucumber.g:971:2: ( rule__Feature__NameAssignment_2 )
            // InternalCucumber.g:971:3: rule__Feature__NameAssignment_2
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
    // InternalCucumber.g:979:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:983:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalCucumber.g:984:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
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
    // InternalCucumber.g:991:1: rule__Feature__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:995:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:996:1: ( RULE_EOL )
            {
            // InternalCucumber.g:996:1: ( RULE_EOL )
            // InternalCucumber.g:997:2: RULE_EOL
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
    // InternalCucumber.g:1006:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl rule__Feature__Group__5 ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1010:1: ( rule__Feature__Group__4__Impl rule__Feature__Group__5 )
            // InternalCucumber.g:1011:2: rule__Feature__Group__4__Impl rule__Feature__Group__5
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
    // InternalCucumber.g:1018:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__StatementsAssignment_4 )* ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1022:1: ( ( ( rule__Feature__StatementsAssignment_4 )* ) )
            // InternalCucumber.g:1023:1: ( ( rule__Feature__StatementsAssignment_4 )* )
            {
            // InternalCucumber.g:1023:1: ( ( rule__Feature__StatementsAssignment_4 )* )
            // InternalCucumber.g:1024:2: ( rule__Feature__StatementsAssignment_4 )*
            {
             before(grammarAccess.getFeatureAccess().getStatementsAssignment_4()); 
            // InternalCucumber.g:1025:2: ( rule__Feature__StatementsAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_WORD && LA15_0<=RULE_STRING)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCucumber.g:1025:3: rule__Feature__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Feature__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalCucumber.g:1033:1: rule__Feature__Group__5 : rule__Feature__Group__5__Impl ;
    public final void rule__Feature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1037:1: ( rule__Feature__Group__5__Impl )
            // InternalCucumber.g:1038:2: rule__Feature__Group__5__Impl
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
    // InternalCucumber.g:1044:1: rule__Feature__Group__5__Impl : ( ( rule__Feature__AbstractScenariosAssignment_5 )* ) ;
    public final void rule__Feature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1048:1: ( ( ( rule__Feature__AbstractScenariosAssignment_5 )* ) )
            // InternalCucumber.g:1049:1: ( ( rule__Feature__AbstractScenariosAssignment_5 )* )
            {
            // InternalCucumber.g:1049:1: ( ( rule__Feature__AbstractScenariosAssignment_5 )* )
            // InternalCucumber.g:1050:2: ( rule__Feature__AbstractScenariosAssignment_5 )*
            {
             before(grammarAccess.getFeatureAccess().getAbstractScenariosAssignment_5()); 
            // InternalCucumber.g:1051:2: ( rule__Feature__AbstractScenariosAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=11 && LA16_0<=13)||LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCucumber.g:1051:3: rule__Feature__AbstractScenariosAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Feature__AbstractScenariosAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalCucumber.g:1060:1: rule__Feature__Group_0__0 : rule__Feature__Group_0__0__Impl rule__Feature__Group_0__1 ;
    public final void rule__Feature__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1064:1: ( rule__Feature__Group_0__0__Impl rule__Feature__Group_0__1 )
            // InternalCucumber.g:1065:2: rule__Feature__Group_0__0__Impl rule__Feature__Group_0__1
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
    // InternalCucumber.g:1072:1: rule__Feature__Group_0__0__Impl : ( ( ( rule__Feature__TagsAssignment_0_0 ) ) ( ( rule__Feature__TagsAssignment_0_0 )* ) ) ;
    public final void rule__Feature__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1076:1: ( ( ( ( rule__Feature__TagsAssignment_0_0 ) ) ( ( rule__Feature__TagsAssignment_0_0 )* ) ) )
            // InternalCucumber.g:1077:1: ( ( ( rule__Feature__TagsAssignment_0_0 ) ) ( ( rule__Feature__TagsAssignment_0_0 )* ) )
            {
            // InternalCucumber.g:1077:1: ( ( ( rule__Feature__TagsAssignment_0_0 ) ) ( ( rule__Feature__TagsAssignment_0_0 )* ) )
            // InternalCucumber.g:1078:2: ( ( rule__Feature__TagsAssignment_0_0 ) ) ( ( rule__Feature__TagsAssignment_0_0 )* )
            {
            // InternalCucumber.g:1078:2: ( ( rule__Feature__TagsAssignment_0_0 ) )
            // InternalCucumber.g:1079:3: ( rule__Feature__TagsAssignment_0_0 )
            {
             before(grammarAccess.getFeatureAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:1080:3: ( rule__Feature__TagsAssignment_0_0 )
            // InternalCucumber.g:1080:4: rule__Feature__TagsAssignment_0_0
            {
            pushFollow(FOLLOW_10);
            rule__Feature__TagsAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTagsAssignment_0_0()); 

            }

            // InternalCucumber.g:1083:2: ( ( rule__Feature__TagsAssignment_0_0 )* )
            // InternalCucumber.g:1084:3: ( rule__Feature__TagsAssignment_0_0 )*
            {
             before(grammarAccess.getFeatureAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:1085:3: ( rule__Feature__TagsAssignment_0_0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==23) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCucumber.g:1085:4: rule__Feature__TagsAssignment_0_0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Feature__TagsAssignment_0_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalCucumber.g:1094:1: rule__Feature__Group_0__1 : rule__Feature__Group_0__1__Impl ;
    public final void rule__Feature__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1098:1: ( rule__Feature__Group_0__1__Impl )
            // InternalCucumber.g:1099:2: rule__Feature__Group_0__1__Impl
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
    // InternalCucumber.g:1105:1: rule__Feature__Group_0__1__Impl : ( RULE_EOL ) ;
    public final void rule__Feature__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1109:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1110:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1110:1: ( RULE_EOL )
            // InternalCucumber.g:1111:2: RULE_EOL
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
    // InternalCucumber.g:1121:1: rule__Background__Group__0 : rule__Background__Group__0__Impl rule__Background__Group__1 ;
    public final void rule__Background__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1125:1: ( rule__Background__Group__0__Impl rule__Background__Group__1 )
            // InternalCucumber.g:1126:2: rule__Background__Group__0__Impl rule__Background__Group__1
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
    // InternalCucumber.g:1133:1: rule__Background__Group__0__Impl : ( 'Background:' ) ;
    public final void rule__Background__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1137:1: ( ( 'Background:' ) )
            // InternalCucumber.g:1138:1: ( 'Background:' )
            {
            // InternalCucumber.g:1138:1: ( 'Background:' )
            // InternalCucumber.g:1139:2: 'Background:'
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
    // InternalCucumber.g:1148:1: rule__Background__Group__1 : rule__Background__Group__1__Impl rule__Background__Group__2 ;
    public final void rule__Background__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1152:1: ( rule__Background__Group__1__Impl rule__Background__Group__2 )
            // InternalCucumber.g:1153:2: rule__Background__Group__1__Impl rule__Background__Group__2
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
    // InternalCucumber.g:1160:1: rule__Background__Group__1__Impl : ( ( rule__Background__NameAssignment_1 ) ) ;
    public final void rule__Background__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1164:1: ( ( ( rule__Background__NameAssignment_1 ) ) )
            // InternalCucumber.g:1165:1: ( ( rule__Background__NameAssignment_1 ) )
            {
            // InternalCucumber.g:1165:1: ( ( rule__Background__NameAssignment_1 ) )
            // InternalCucumber.g:1166:2: ( rule__Background__NameAssignment_1 )
            {
             before(grammarAccess.getBackgroundAccess().getNameAssignment_1()); 
            // InternalCucumber.g:1167:2: ( rule__Background__NameAssignment_1 )
            // InternalCucumber.g:1167:3: rule__Background__NameAssignment_1
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
    // InternalCucumber.g:1175:1: rule__Background__Group__2 : rule__Background__Group__2__Impl rule__Background__Group__3 ;
    public final void rule__Background__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1179:1: ( rule__Background__Group__2__Impl rule__Background__Group__3 )
            // InternalCucumber.g:1180:2: rule__Background__Group__2__Impl rule__Background__Group__3
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
    // InternalCucumber.g:1187:1: rule__Background__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__Background__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1191:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1192:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1192:1: ( RULE_EOL )
            // InternalCucumber.g:1193:2: RULE_EOL
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
    // InternalCucumber.g:1202:1: rule__Background__Group__3 : rule__Background__Group__3__Impl rule__Background__Group__4 ;
    public final void rule__Background__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1206:1: ( rule__Background__Group__3__Impl rule__Background__Group__4 )
            // InternalCucumber.g:1207:2: rule__Background__Group__3__Impl rule__Background__Group__4
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
    // InternalCucumber.g:1214:1: rule__Background__Group__3__Impl : ( ( rule__Background__StatementsAssignment_3 )* ) ;
    public final void rule__Background__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1218:1: ( ( ( rule__Background__StatementsAssignment_3 )* ) )
            // InternalCucumber.g:1219:1: ( ( rule__Background__StatementsAssignment_3 )* )
            {
            // InternalCucumber.g:1219:1: ( ( rule__Background__StatementsAssignment_3 )* )
            // InternalCucumber.g:1220:2: ( rule__Background__StatementsAssignment_3 )*
            {
             before(grammarAccess.getBackgroundAccess().getStatementsAssignment_3()); 
            // InternalCucumber.g:1221:2: ( rule__Background__StatementsAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_WORD && LA18_0<=RULE_STRING)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCucumber.g:1221:3: rule__Background__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Background__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalCucumber.g:1229:1: rule__Background__Group__4 : rule__Background__Group__4__Impl ;
    public final void rule__Background__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1233:1: ( rule__Background__Group__4__Impl )
            // InternalCucumber.g:1234:2: rule__Background__Group__4__Impl
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
    // InternalCucumber.g:1240:1: rule__Background__Group__4__Impl : ( ( rule__Background__StepsAssignment_4 )* ) ;
    public final void rule__Background__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1244:1: ( ( ( rule__Background__StepsAssignment_4 )* ) )
            // InternalCucumber.g:1245:1: ( ( rule__Background__StepsAssignment_4 )* )
            {
            // InternalCucumber.g:1245:1: ( ( rule__Background__StepsAssignment_4 )* )
            // InternalCucumber.g:1246:2: ( rule__Background__StepsAssignment_4 )*
            {
             before(grammarAccess.getBackgroundAccess().getStepsAssignment_4()); 
            // InternalCucumber.g:1247:2: ( rule__Background__StepsAssignment_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=17 && LA19_0<=22)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCucumber.g:1247:3: rule__Background__StepsAssignment_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Background__StepsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalCucumber.g:1256:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1260:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalCucumber.g:1261:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
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
    // InternalCucumber.g:1268:1: rule__Scenario__Group__0__Impl : ( ( rule__Scenario__Group_0__0 )? ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1272:1: ( ( ( rule__Scenario__Group_0__0 )? ) )
            // InternalCucumber.g:1273:1: ( ( rule__Scenario__Group_0__0 )? )
            {
            // InternalCucumber.g:1273:1: ( ( rule__Scenario__Group_0__0 )? )
            // InternalCucumber.g:1274:2: ( rule__Scenario__Group_0__0 )?
            {
             before(grammarAccess.getScenarioAccess().getGroup_0()); 
            // InternalCucumber.g:1275:2: ( rule__Scenario__Group_0__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCucumber.g:1275:3: rule__Scenario__Group_0__0
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
    // InternalCucumber.g:1283:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1287:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalCucumber.g:1288:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
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
    // InternalCucumber.g:1295:1: rule__Scenario__Group__1__Impl : ( 'Scenario:' ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1299:1: ( ( 'Scenario:' ) )
            // InternalCucumber.g:1300:1: ( 'Scenario:' )
            {
            // InternalCucumber.g:1300:1: ( 'Scenario:' )
            // InternalCucumber.g:1301:2: 'Scenario:'
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
    // InternalCucumber.g:1310:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1314:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // InternalCucumber.g:1315:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
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
    // InternalCucumber.g:1322:1: rule__Scenario__Group__2__Impl : ( ( rule__Scenario__NameAssignment_2 ) ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1326:1: ( ( ( rule__Scenario__NameAssignment_2 ) ) )
            // InternalCucumber.g:1327:1: ( ( rule__Scenario__NameAssignment_2 ) )
            {
            // InternalCucumber.g:1327:1: ( ( rule__Scenario__NameAssignment_2 ) )
            // InternalCucumber.g:1328:2: ( rule__Scenario__NameAssignment_2 )
            {
             before(grammarAccess.getScenarioAccess().getNameAssignment_2()); 
            // InternalCucumber.g:1329:2: ( rule__Scenario__NameAssignment_2 )
            // InternalCucumber.g:1329:3: rule__Scenario__NameAssignment_2
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
    // InternalCucumber.g:1337:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl rule__Scenario__Group__4 ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1341:1: ( rule__Scenario__Group__3__Impl rule__Scenario__Group__4 )
            // InternalCucumber.g:1342:2: rule__Scenario__Group__3__Impl rule__Scenario__Group__4
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
    // InternalCucumber.g:1349:1: rule__Scenario__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1353:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1354:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1354:1: ( RULE_EOL )
            // InternalCucumber.g:1355:2: RULE_EOL
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
    // InternalCucumber.g:1364:1: rule__Scenario__Group__4 : rule__Scenario__Group__4__Impl rule__Scenario__Group__5 ;
    public final void rule__Scenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1368:1: ( rule__Scenario__Group__4__Impl rule__Scenario__Group__5 )
            // InternalCucumber.g:1369:2: rule__Scenario__Group__4__Impl rule__Scenario__Group__5
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
    // InternalCucumber.g:1376:1: rule__Scenario__Group__4__Impl : ( ( rule__Scenario__StatementsAssignment_4 )* ) ;
    public final void rule__Scenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1380:1: ( ( ( rule__Scenario__StatementsAssignment_4 )* ) )
            // InternalCucumber.g:1381:1: ( ( rule__Scenario__StatementsAssignment_4 )* )
            {
            // InternalCucumber.g:1381:1: ( ( rule__Scenario__StatementsAssignment_4 )* )
            // InternalCucumber.g:1382:2: ( rule__Scenario__StatementsAssignment_4 )*
            {
             before(grammarAccess.getScenarioAccess().getStatementsAssignment_4()); 
            // InternalCucumber.g:1383:2: ( rule__Scenario__StatementsAssignment_4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_WORD && LA21_0<=RULE_STRING)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCucumber.g:1383:3: rule__Scenario__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Scenario__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalCucumber.g:1391:1: rule__Scenario__Group__5 : rule__Scenario__Group__5__Impl ;
    public final void rule__Scenario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1395:1: ( rule__Scenario__Group__5__Impl )
            // InternalCucumber.g:1396:2: rule__Scenario__Group__5__Impl
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
    // InternalCucumber.g:1402:1: rule__Scenario__Group__5__Impl : ( ( rule__Scenario__StepsAssignment_5 )* ) ;
    public final void rule__Scenario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1406:1: ( ( ( rule__Scenario__StepsAssignment_5 )* ) )
            // InternalCucumber.g:1407:1: ( ( rule__Scenario__StepsAssignment_5 )* )
            {
            // InternalCucumber.g:1407:1: ( ( rule__Scenario__StepsAssignment_5 )* )
            // InternalCucumber.g:1408:2: ( rule__Scenario__StepsAssignment_5 )*
            {
             before(grammarAccess.getScenarioAccess().getStepsAssignment_5()); 
            // InternalCucumber.g:1409:2: ( rule__Scenario__StepsAssignment_5 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=17 && LA22_0<=22)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCucumber.g:1409:3: rule__Scenario__StepsAssignment_5
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Scenario__StepsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalCucumber.g:1418:1: rule__Scenario__Group_0__0 : rule__Scenario__Group_0__0__Impl rule__Scenario__Group_0__1 ;
    public final void rule__Scenario__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1422:1: ( rule__Scenario__Group_0__0__Impl rule__Scenario__Group_0__1 )
            // InternalCucumber.g:1423:2: rule__Scenario__Group_0__0__Impl rule__Scenario__Group_0__1
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
    // InternalCucumber.g:1430:1: rule__Scenario__Group_0__0__Impl : ( ( ( rule__Scenario__TagsAssignment_0_0 ) ) ( ( rule__Scenario__TagsAssignment_0_0 )* ) ) ;
    public final void rule__Scenario__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1434:1: ( ( ( ( rule__Scenario__TagsAssignment_0_0 ) ) ( ( rule__Scenario__TagsAssignment_0_0 )* ) ) )
            // InternalCucumber.g:1435:1: ( ( ( rule__Scenario__TagsAssignment_0_0 ) ) ( ( rule__Scenario__TagsAssignment_0_0 )* ) )
            {
            // InternalCucumber.g:1435:1: ( ( ( rule__Scenario__TagsAssignment_0_0 ) ) ( ( rule__Scenario__TagsAssignment_0_0 )* ) )
            // InternalCucumber.g:1436:2: ( ( rule__Scenario__TagsAssignment_0_0 ) ) ( ( rule__Scenario__TagsAssignment_0_0 )* )
            {
            // InternalCucumber.g:1436:2: ( ( rule__Scenario__TagsAssignment_0_0 ) )
            // InternalCucumber.g:1437:3: ( rule__Scenario__TagsAssignment_0_0 )
            {
             before(grammarAccess.getScenarioAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:1438:3: ( rule__Scenario__TagsAssignment_0_0 )
            // InternalCucumber.g:1438:4: rule__Scenario__TagsAssignment_0_0
            {
            pushFollow(FOLLOW_10);
            rule__Scenario__TagsAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getTagsAssignment_0_0()); 

            }

            // InternalCucumber.g:1441:2: ( ( rule__Scenario__TagsAssignment_0_0 )* )
            // InternalCucumber.g:1442:3: ( rule__Scenario__TagsAssignment_0_0 )*
            {
             before(grammarAccess.getScenarioAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:1443:3: ( rule__Scenario__TagsAssignment_0_0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==23) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalCucumber.g:1443:4: rule__Scenario__TagsAssignment_0_0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Scenario__TagsAssignment_0_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalCucumber.g:1452:1: rule__Scenario__Group_0__1 : rule__Scenario__Group_0__1__Impl ;
    public final void rule__Scenario__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1456:1: ( rule__Scenario__Group_0__1__Impl )
            // InternalCucumber.g:1457:2: rule__Scenario__Group_0__1__Impl
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
    // InternalCucumber.g:1463:1: rule__Scenario__Group_0__1__Impl : ( RULE_EOL ) ;
    public final void rule__Scenario__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1467:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1468:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1468:1: ( RULE_EOL )
            // InternalCucumber.g:1469:2: RULE_EOL
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
    // InternalCucumber.g:1479:1: rule__ScenarioOutline__Group__0 : rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1 ;
    public final void rule__ScenarioOutline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1483:1: ( rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1 )
            // InternalCucumber.g:1484:2: rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1
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
    // InternalCucumber.g:1491:1: rule__ScenarioOutline__Group__0__Impl : ( ( rule__ScenarioOutline__Group_0__0 )? ) ;
    public final void rule__ScenarioOutline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1495:1: ( ( ( rule__ScenarioOutline__Group_0__0 )? ) )
            // InternalCucumber.g:1496:1: ( ( rule__ScenarioOutline__Group_0__0 )? )
            {
            // InternalCucumber.g:1496:1: ( ( rule__ScenarioOutline__Group_0__0 )? )
            // InternalCucumber.g:1497:2: ( rule__ScenarioOutline__Group_0__0 )?
            {
             before(grammarAccess.getScenarioOutlineAccess().getGroup_0()); 
            // InternalCucumber.g:1498:2: ( rule__ScenarioOutline__Group_0__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCucumber.g:1498:3: rule__ScenarioOutline__Group_0__0
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
    // InternalCucumber.g:1506:1: rule__ScenarioOutline__Group__1 : rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2 ;
    public final void rule__ScenarioOutline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1510:1: ( rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2 )
            // InternalCucumber.g:1511:2: rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2
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
    // InternalCucumber.g:1518:1: rule__ScenarioOutline__Group__1__Impl : ( 'Scenario Outline:' ) ;
    public final void rule__ScenarioOutline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1522:1: ( ( 'Scenario Outline:' ) )
            // InternalCucumber.g:1523:1: ( 'Scenario Outline:' )
            {
            // InternalCucumber.g:1523:1: ( 'Scenario Outline:' )
            // InternalCucumber.g:1524:2: 'Scenario Outline:'
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
    // InternalCucumber.g:1533:1: rule__ScenarioOutline__Group__2 : rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3 ;
    public final void rule__ScenarioOutline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1537:1: ( rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3 )
            // InternalCucumber.g:1538:2: rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3
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
    // InternalCucumber.g:1545:1: rule__ScenarioOutline__Group__2__Impl : ( ( rule__ScenarioOutline__NameAssignment_2 ) ) ;
    public final void rule__ScenarioOutline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1549:1: ( ( ( rule__ScenarioOutline__NameAssignment_2 ) ) )
            // InternalCucumber.g:1550:1: ( ( rule__ScenarioOutline__NameAssignment_2 ) )
            {
            // InternalCucumber.g:1550:1: ( ( rule__ScenarioOutline__NameAssignment_2 ) )
            // InternalCucumber.g:1551:2: ( rule__ScenarioOutline__NameAssignment_2 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getNameAssignment_2()); 
            // InternalCucumber.g:1552:2: ( rule__ScenarioOutline__NameAssignment_2 )
            // InternalCucumber.g:1552:3: rule__ScenarioOutline__NameAssignment_2
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
    // InternalCucumber.g:1560:1: rule__ScenarioOutline__Group__3 : rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4 ;
    public final void rule__ScenarioOutline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1564:1: ( rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4 )
            // InternalCucumber.g:1565:2: rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4
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
    // InternalCucumber.g:1572:1: rule__ScenarioOutline__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__ScenarioOutline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1576:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1577:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1577:1: ( RULE_EOL )
            // InternalCucumber.g:1578:2: RULE_EOL
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
    // InternalCucumber.g:1587:1: rule__ScenarioOutline__Group__4 : rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5 ;
    public final void rule__ScenarioOutline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1591:1: ( rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5 )
            // InternalCucumber.g:1592:2: rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5
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
    // InternalCucumber.g:1599:1: rule__ScenarioOutline__Group__4__Impl : ( ( rule__ScenarioOutline__StatementsAssignment_4 )* ) ;
    public final void rule__ScenarioOutline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1603:1: ( ( ( rule__ScenarioOutline__StatementsAssignment_4 )* ) )
            // InternalCucumber.g:1604:1: ( ( rule__ScenarioOutline__StatementsAssignment_4 )* )
            {
            // InternalCucumber.g:1604:1: ( ( rule__ScenarioOutline__StatementsAssignment_4 )* )
            // InternalCucumber.g:1605:2: ( rule__ScenarioOutline__StatementsAssignment_4 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getStatementsAssignment_4()); 
            // InternalCucumber.g:1606:2: ( rule__ScenarioOutline__StatementsAssignment_4 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_WORD && LA25_0<=RULE_STRING)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalCucumber.g:1606:3: rule__ScenarioOutline__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ScenarioOutline__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalCucumber.g:1614:1: rule__ScenarioOutline__Group__5 : rule__ScenarioOutline__Group__5__Impl rule__ScenarioOutline__Group__6 ;
    public final void rule__ScenarioOutline__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1618:1: ( rule__ScenarioOutline__Group__5__Impl rule__ScenarioOutline__Group__6 )
            // InternalCucumber.g:1619:2: rule__ScenarioOutline__Group__5__Impl rule__ScenarioOutline__Group__6
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
    // InternalCucumber.g:1626:1: rule__ScenarioOutline__Group__5__Impl : ( ( rule__ScenarioOutline__StepsAssignment_5 )* ) ;
    public final void rule__ScenarioOutline__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1630:1: ( ( ( rule__ScenarioOutline__StepsAssignment_5 )* ) )
            // InternalCucumber.g:1631:1: ( ( rule__ScenarioOutline__StepsAssignment_5 )* )
            {
            // InternalCucumber.g:1631:1: ( ( rule__ScenarioOutline__StepsAssignment_5 )* )
            // InternalCucumber.g:1632:2: ( rule__ScenarioOutline__StepsAssignment_5 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getStepsAssignment_5()); 
            // InternalCucumber.g:1633:2: ( rule__ScenarioOutline__StepsAssignment_5 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=17 && LA26_0<=22)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalCucumber.g:1633:3: rule__ScenarioOutline__StepsAssignment_5
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ScenarioOutline__StepsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalCucumber.g:1641:1: rule__ScenarioOutline__Group__6 : rule__ScenarioOutline__Group__6__Impl ;
    public final void rule__ScenarioOutline__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1645:1: ( rule__ScenarioOutline__Group__6__Impl )
            // InternalCucumber.g:1646:2: rule__ScenarioOutline__Group__6__Impl
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
    // InternalCucumber.g:1652:1: rule__ScenarioOutline__Group__6__Impl : ( ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* ) ) ;
    public final void rule__ScenarioOutline__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1656:1: ( ( ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* ) ) )
            // InternalCucumber.g:1657:1: ( ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* ) )
            {
            // InternalCucumber.g:1657:1: ( ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* ) )
            // InternalCucumber.g:1658:2: ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* )
            {
            // InternalCucumber.g:1658:2: ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) )
            // InternalCucumber.g:1659:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_6()); 
            // InternalCucumber.g:1660:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )
            // InternalCucumber.g:1660:4: rule__ScenarioOutline__ExamplesAssignment_6
            {
            pushFollow(FOLLOW_16);
            rule__ScenarioOutline__ExamplesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_6()); 

            }

            // InternalCucumber.g:1663:2: ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* )
            // InternalCucumber.g:1664:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_6()); 
            // InternalCucumber.g:1665:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )*
            loop27:
            do {
                int alt27=2;
                alt27 = dfa27.predict(input);
                switch (alt27) {
            	case 1 :
            	    // InternalCucumber.g:1665:4: rule__ScenarioOutline__ExamplesAssignment_6
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__ScenarioOutline__ExamplesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalCucumber.g:1675:1: rule__ScenarioOutline__Group_0__0 : rule__ScenarioOutline__Group_0__0__Impl rule__ScenarioOutline__Group_0__1 ;
    public final void rule__ScenarioOutline__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1679:1: ( rule__ScenarioOutline__Group_0__0__Impl rule__ScenarioOutline__Group_0__1 )
            // InternalCucumber.g:1680:2: rule__ScenarioOutline__Group_0__0__Impl rule__ScenarioOutline__Group_0__1
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
    // InternalCucumber.g:1687:1: rule__ScenarioOutline__Group_0__0__Impl : ( ( ( rule__ScenarioOutline__TagsAssignment_0_0 ) ) ( ( rule__ScenarioOutline__TagsAssignment_0_0 )* ) ) ;
    public final void rule__ScenarioOutline__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1691:1: ( ( ( ( rule__ScenarioOutline__TagsAssignment_0_0 ) ) ( ( rule__ScenarioOutline__TagsAssignment_0_0 )* ) ) )
            // InternalCucumber.g:1692:1: ( ( ( rule__ScenarioOutline__TagsAssignment_0_0 ) ) ( ( rule__ScenarioOutline__TagsAssignment_0_0 )* ) )
            {
            // InternalCucumber.g:1692:1: ( ( ( rule__ScenarioOutline__TagsAssignment_0_0 ) ) ( ( rule__ScenarioOutline__TagsAssignment_0_0 )* ) )
            // InternalCucumber.g:1693:2: ( ( rule__ScenarioOutline__TagsAssignment_0_0 ) ) ( ( rule__ScenarioOutline__TagsAssignment_0_0 )* )
            {
            // InternalCucumber.g:1693:2: ( ( rule__ScenarioOutline__TagsAssignment_0_0 ) )
            // InternalCucumber.g:1694:3: ( rule__ScenarioOutline__TagsAssignment_0_0 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:1695:3: ( rule__ScenarioOutline__TagsAssignment_0_0 )
            // InternalCucumber.g:1695:4: rule__ScenarioOutline__TagsAssignment_0_0
            {
            pushFollow(FOLLOW_10);
            rule__ScenarioOutline__TagsAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getTagsAssignment_0_0()); 

            }

            // InternalCucumber.g:1698:2: ( ( rule__ScenarioOutline__TagsAssignment_0_0 )* )
            // InternalCucumber.g:1699:3: ( rule__ScenarioOutline__TagsAssignment_0_0 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:1700:3: ( rule__ScenarioOutline__TagsAssignment_0_0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==23) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCucumber.g:1700:4: rule__ScenarioOutline__TagsAssignment_0_0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ScenarioOutline__TagsAssignment_0_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalCucumber.g:1709:1: rule__ScenarioOutline__Group_0__1 : rule__ScenarioOutline__Group_0__1__Impl ;
    public final void rule__ScenarioOutline__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1713:1: ( rule__ScenarioOutline__Group_0__1__Impl )
            // InternalCucumber.g:1714:2: rule__ScenarioOutline__Group_0__1__Impl
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
    // InternalCucumber.g:1720:1: rule__ScenarioOutline__Group_0__1__Impl : ( RULE_EOL ) ;
    public final void rule__ScenarioOutline__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1724:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1725:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1725:1: ( RULE_EOL )
            // InternalCucumber.g:1726:2: RULE_EOL
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
    // InternalCucumber.g:1736:1: rule__Examples__Group__0 : rule__Examples__Group__0__Impl rule__Examples__Group__1 ;
    public final void rule__Examples__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1740:1: ( rule__Examples__Group__0__Impl rule__Examples__Group__1 )
            // InternalCucumber.g:1741:2: rule__Examples__Group__0__Impl rule__Examples__Group__1
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
    // InternalCucumber.g:1748:1: rule__Examples__Group__0__Impl : ( ( rule__Examples__Group_0__0 )? ) ;
    public final void rule__Examples__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1752:1: ( ( ( rule__Examples__Group_0__0 )? ) )
            // InternalCucumber.g:1753:1: ( ( rule__Examples__Group_0__0 )? )
            {
            // InternalCucumber.g:1753:1: ( ( rule__Examples__Group_0__0 )? )
            // InternalCucumber.g:1754:2: ( rule__Examples__Group_0__0 )?
            {
             before(grammarAccess.getExamplesAccess().getGroup_0()); 
            // InternalCucumber.g:1755:2: ( rule__Examples__Group_0__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCucumber.g:1755:3: rule__Examples__Group_0__0
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
    // InternalCucumber.g:1763:1: rule__Examples__Group__1 : rule__Examples__Group__1__Impl rule__Examples__Group__2 ;
    public final void rule__Examples__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1767:1: ( rule__Examples__Group__1__Impl rule__Examples__Group__2 )
            // InternalCucumber.g:1768:2: rule__Examples__Group__1__Impl rule__Examples__Group__2
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
    // InternalCucumber.g:1775:1: rule__Examples__Group__1__Impl : ( 'Examples:' ) ;
    public final void rule__Examples__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1779:1: ( ( 'Examples:' ) )
            // InternalCucumber.g:1780:1: ( 'Examples:' )
            {
            // InternalCucumber.g:1780:1: ( 'Examples:' )
            // InternalCucumber.g:1781:2: 'Examples:'
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
    // InternalCucumber.g:1790:1: rule__Examples__Group__2 : rule__Examples__Group__2__Impl rule__Examples__Group__3 ;
    public final void rule__Examples__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1794:1: ( rule__Examples__Group__2__Impl rule__Examples__Group__3 )
            // InternalCucumber.g:1795:2: rule__Examples__Group__2__Impl rule__Examples__Group__3
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
    // InternalCucumber.g:1802:1: rule__Examples__Group__2__Impl : ( ( rule__Examples__NameAssignment_2 ) ) ;
    public final void rule__Examples__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1806:1: ( ( ( rule__Examples__NameAssignment_2 ) ) )
            // InternalCucumber.g:1807:1: ( ( rule__Examples__NameAssignment_2 ) )
            {
            // InternalCucumber.g:1807:1: ( ( rule__Examples__NameAssignment_2 ) )
            // InternalCucumber.g:1808:2: ( rule__Examples__NameAssignment_2 )
            {
             before(grammarAccess.getExamplesAccess().getNameAssignment_2()); 
            // InternalCucumber.g:1809:2: ( rule__Examples__NameAssignment_2 )
            // InternalCucumber.g:1809:3: rule__Examples__NameAssignment_2
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
    // InternalCucumber.g:1817:1: rule__Examples__Group__3 : rule__Examples__Group__3__Impl rule__Examples__Group__4 ;
    public final void rule__Examples__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1821:1: ( rule__Examples__Group__3__Impl rule__Examples__Group__4 )
            // InternalCucumber.g:1822:2: rule__Examples__Group__3__Impl rule__Examples__Group__4
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
    // InternalCucumber.g:1829:1: rule__Examples__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Examples__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1833:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1834:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1834:1: ( RULE_EOL )
            // InternalCucumber.g:1835:2: RULE_EOL
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
    // InternalCucumber.g:1844:1: rule__Examples__Group__4 : rule__Examples__Group__4__Impl rule__Examples__Group__5 ;
    public final void rule__Examples__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1848:1: ( rule__Examples__Group__4__Impl rule__Examples__Group__5 )
            // InternalCucumber.g:1849:2: rule__Examples__Group__4__Impl rule__Examples__Group__5
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
    // InternalCucumber.g:1856:1: rule__Examples__Group__4__Impl : ( ( rule__Examples__StatementsAssignment_4 )* ) ;
    public final void rule__Examples__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1860:1: ( ( ( rule__Examples__StatementsAssignment_4 )* ) )
            // InternalCucumber.g:1861:1: ( ( rule__Examples__StatementsAssignment_4 )* )
            {
            // InternalCucumber.g:1861:1: ( ( rule__Examples__StatementsAssignment_4 )* )
            // InternalCucumber.g:1862:2: ( rule__Examples__StatementsAssignment_4 )*
            {
             before(grammarAccess.getExamplesAccess().getStatementsAssignment_4()); 
            // InternalCucumber.g:1863:2: ( rule__Examples__StatementsAssignment_4 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_WORD && LA30_0<=RULE_STRING)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalCucumber.g:1863:3: rule__Examples__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Examples__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalCucumber.g:1871:1: rule__Examples__Group__5 : rule__Examples__Group__5__Impl ;
    public final void rule__Examples__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1875:1: ( rule__Examples__Group__5__Impl )
            // InternalCucumber.g:1876:2: rule__Examples__Group__5__Impl
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
    // InternalCucumber.g:1882:1: rule__Examples__Group__5__Impl : ( ( rule__Examples__TheExamplesTableAssignment_5 ) ) ;
    public final void rule__Examples__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1886:1: ( ( ( rule__Examples__TheExamplesTableAssignment_5 ) ) )
            // InternalCucumber.g:1887:1: ( ( rule__Examples__TheExamplesTableAssignment_5 ) )
            {
            // InternalCucumber.g:1887:1: ( ( rule__Examples__TheExamplesTableAssignment_5 ) )
            // InternalCucumber.g:1888:2: ( rule__Examples__TheExamplesTableAssignment_5 )
            {
             before(grammarAccess.getExamplesAccess().getTheExamplesTableAssignment_5()); 
            // InternalCucumber.g:1889:2: ( rule__Examples__TheExamplesTableAssignment_5 )
            // InternalCucumber.g:1889:3: rule__Examples__TheExamplesTableAssignment_5
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
    // InternalCucumber.g:1898:1: rule__Examples__Group_0__0 : rule__Examples__Group_0__0__Impl rule__Examples__Group_0__1 ;
    public final void rule__Examples__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1902:1: ( rule__Examples__Group_0__0__Impl rule__Examples__Group_0__1 )
            // InternalCucumber.g:1903:2: rule__Examples__Group_0__0__Impl rule__Examples__Group_0__1
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
    // InternalCucumber.g:1910:1: rule__Examples__Group_0__0__Impl : ( ( ( rule__Examples__TagsAssignment_0_0 ) ) ( ( rule__Examples__TagsAssignment_0_0 )* ) ) ;
    public final void rule__Examples__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1914:1: ( ( ( ( rule__Examples__TagsAssignment_0_0 ) ) ( ( rule__Examples__TagsAssignment_0_0 )* ) ) )
            // InternalCucumber.g:1915:1: ( ( ( rule__Examples__TagsAssignment_0_0 ) ) ( ( rule__Examples__TagsAssignment_0_0 )* ) )
            {
            // InternalCucumber.g:1915:1: ( ( ( rule__Examples__TagsAssignment_0_0 ) ) ( ( rule__Examples__TagsAssignment_0_0 )* ) )
            // InternalCucumber.g:1916:2: ( ( rule__Examples__TagsAssignment_0_0 ) ) ( ( rule__Examples__TagsAssignment_0_0 )* )
            {
            // InternalCucumber.g:1916:2: ( ( rule__Examples__TagsAssignment_0_0 ) )
            // InternalCucumber.g:1917:3: ( rule__Examples__TagsAssignment_0_0 )
            {
             before(grammarAccess.getExamplesAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:1918:3: ( rule__Examples__TagsAssignment_0_0 )
            // InternalCucumber.g:1918:4: rule__Examples__TagsAssignment_0_0
            {
            pushFollow(FOLLOW_10);
            rule__Examples__TagsAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getExamplesAccess().getTagsAssignment_0_0()); 

            }

            // InternalCucumber.g:1921:2: ( ( rule__Examples__TagsAssignment_0_0 )* )
            // InternalCucumber.g:1922:3: ( rule__Examples__TagsAssignment_0_0 )*
            {
             before(grammarAccess.getExamplesAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:1923:3: ( rule__Examples__TagsAssignment_0_0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==23) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalCucumber.g:1923:4: rule__Examples__TagsAssignment_0_0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Examples__TagsAssignment_0_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalCucumber.g:1932:1: rule__Examples__Group_0__1 : rule__Examples__Group_0__1__Impl ;
    public final void rule__Examples__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1936:1: ( rule__Examples__Group_0__1__Impl )
            // InternalCucumber.g:1937:2: rule__Examples__Group_0__1__Impl
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
    // InternalCucumber.g:1943:1: rule__Examples__Group_0__1__Impl : ( RULE_EOL ) ;
    public final void rule__Examples__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1947:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1948:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1948:1: ( RULE_EOL )
            // InternalCucumber.g:1949:2: RULE_EOL
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
    // InternalCucumber.g:1959:1: rule__Row__Group__0 : rule__Row__Group__0__Impl rule__Row__Group__1 ;
    public final void rule__Row__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1963:1: ( rule__Row__Group__0__Impl rule__Row__Group__1 )
            // InternalCucumber.g:1964:2: rule__Row__Group__0__Impl rule__Row__Group__1
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
    // InternalCucumber.g:1971:1: rule__Row__Group__0__Impl : ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) ) ;
    public final void rule__Row__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1975:1: ( ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) ) )
            // InternalCucumber.g:1976:1: ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) )
            {
            // InternalCucumber.g:1976:1: ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) )
            // InternalCucumber.g:1977:2: ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* )
            {
            // InternalCucumber.g:1977:2: ( ( rule__Row__CellsAssignment_0 ) )
            // InternalCucumber.g:1978:3: ( rule__Row__CellsAssignment_0 )
            {
             before(grammarAccess.getRowAccess().getCellsAssignment_0()); 
            // InternalCucumber.g:1979:3: ( rule__Row__CellsAssignment_0 )
            // InternalCucumber.g:1979:4: rule__Row__CellsAssignment_0
            {
            pushFollow(FOLLOW_3);
            rule__Row__CellsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getCellsAssignment_0()); 

            }

            // InternalCucumber.g:1982:2: ( ( rule__Row__CellsAssignment_0 )* )
            // InternalCucumber.g:1983:3: ( rule__Row__CellsAssignment_0 )*
            {
             before(grammarAccess.getRowAccess().getCellsAssignment_0()); 
            // InternalCucumber.g:1984:3: ( rule__Row__CellsAssignment_0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==15) ) {
                    int LA32_1 = input.LA(2);

                    if ( ((LA32_1>=RULE_WORD && LA32_1<=RULE_STRING)) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // InternalCucumber.g:1984:4: rule__Row__CellsAssignment_0
            	    {
            	    pushFollow(FOLLOW_3);
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
    // InternalCucumber.g:1993:1: rule__Row__Group__1 : rule__Row__Group__1__Impl rule__Row__Group__2 ;
    public final void rule__Row__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1997:1: ( rule__Row__Group__1__Impl rule__Row__Group__2 )
            // InternalCucumber.g:1998:2: rule__Row__Group__1__Impl rule__Row__Group__2
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
    // InternalCucumber.g:2005:1: rule__Row__Group__1__Impl : ( '|' ) ;
    public final void rule__Row__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2009:1: ( ( '|' ) )
            // InternalCucumber.g:2010:1: ( '|' )
            {
            // InternalCucumber.g:2010:1: ( '|' )
            // InternalCucumber.g:2011:2: '|'
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
    // InternalCucumber.g:2020:1: rule__Row__Group__2 : rule__Row__Group__2__Impl ;
    public final void rule__Row__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2024:1: ( rule__Row__Group__2__Impl )
            // InternalCucumber.g:2025:2: rule__Row__Group__2__Impl
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
    // InternalCucumber.g:2031:1: rule__Row__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__Row__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2035:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2036:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2036:1: ( RULE_EOL )
            // InternalCucumber.g:2037:2: RULE_EOL
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
    // InternalCucumber.g:2047:1: rule__Cell__Group__0 : rule__Cell__Group__0__Impl rule__Cell__Group__1 ;
    public final void rule__Cell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2051:1: ( rule__Cell__Group__0__Impl rule__Cell__Group__1 )
            // InternalCucumber.g:2052:2: rule__Cell__Group__0__Impl rule__Cell__Group__1
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
    // InternalCucumber.g:2059:1: rule__Cell__Group__0__Impl : ( '|' ) ;
    public final void rule__Cell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2063:1: ( ( '|' ) )
            // InternalCucumber.g:2064:1: ( '|' )
            {
            // InternalCucumber.g:2064:1: ( '|' )
            // InternalCucumber.g:2065:2: '|'
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
    // InternalCucumber.g:2074:1: rule__Cell__Group__1 : rule__Cell__Group__1__Impl ;
    public final void rule__Cell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2078:1: ( rule__Cell__Group__1__Impl )
            // InternalCucumber.g:2079:2: rule__Cell__Group__1__Impl
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
    // InternalCucumber.g:2085:1: rule__Cell__Group__1__Impl : ( ( rule__Cell__NameAssignment_1 ) ) ;
    public final void rule__Cell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2089:1: ( ( ( rule__Cell__NameAssignment_1 ) ) )
            // InternalCucumber.g:2090:1: ( ( rule__Cell__NameAssignment_1 ) )
            {
            // InternalCucumber.g:2090:1: ( ( rule__Cell__NameAssignment_1 ) )
            // InternalCucumber.g:2091:2: ( rule__Cell__NameAssignment_1 )
            {
             before(grammarAccess.getCellAccess().getNameAssignment_1()); 
            // InternalCucumber.g:2092:2: ( rule__Cell__NameAssignment_1 )
            // InternalCucumber.g:2092:3: rule__Cell__NameAssignment_1
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
    // InternalCucumber.g:2101:1: rule__DocString__Group__0 : rule__DocString__Group__0__Impl rule__DocString__Group__1 ;
    public final void rule__DocString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2105:1: ( rule__DocString__Group__0__Impl rule__DocString__Group__1 )
            // InternalCucumber.g:2106:2: rule__DocString__Group__0__Impl rule__DocString__Group__1
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
    // InternalCucumber.g:2113:1: rule__DocString__Group__0__Impl : ( '\"\"\"' ) ;
    public final void rule__DocString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2117:1: ( ( '\"\"\"' ) )
            // InternalCucumber.g:2118:1: ( '\"\"\"' )
            {
            // InternalCucumber.g:2118:1: ( '\"\"\"' )
            // InternalCucumber.g:2119:2: '\"\"\"'
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
    // InternalCucumber.g:2128:1: rule__DocString__Group__1 : rule__DocString__Group__1__Impl rule__DocString__Group__2 ;
    public final void rule__DocString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2132:1: ( rule__DocString__Group__1__Impl rule__DocString__Group__2 )
            // InternalCucumber.g:2133:2: rule__DocString__Group__1__Impl rule__DocString__Group__2
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
    // InternalCucumber.g:2140:1: rule__DocString__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__DocString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2144:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2145:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2145:1: ( RULE_EOL )
            // InternalCucumber.g:2146:2: RULE_EOL
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
    // InternalCucumber.g:2155:1: rule__DocString__Group__2 : rule__DocString__Group__2__Impl rule__DocString__Group__3 ;
    public final void rule__DocString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2159:1: ( rule__DocString__Group__2__Impl rule__DocString__Group__3 )
            // InternalCucumber.g:2160:2: rule__DocString__Group__2__Impl rule__DocString__Group__3
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
    // InternalCucumber.g:2167:1: rule__DocString__Group__2__Impl : ( ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* ) ) ;
    public final void rule__DocString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2171:1: ( ( ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* ) ) )
            // InternalCucumber.g:2172:1: ( ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* ) )
            {
            // InternalCucumber.g:2172:1: ( ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* ) )
            // InternalCucumber.g:2173:2: ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* )
            {
            // InternalCucumber.g:2173:2: ( ( rule__DocString__LinesAssignment_2 ) )
            // InternalCucumber.g:2174:3: ( rule__DocString__LinesAssignment_2 )
            {
             before(grammarAccess.getDocStringAccess().getLinesAssignment_2()); 
            // InternalCucumber.g:2175:3: ( rule__DocString__LinesAssignment_2 )
            // InternalCucumber.g:2175:4: rule__DocString__LinesAssignment_2
            {
            pushFollow(FOLLOW_4);
            rule__DocString__LinesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDocStringAccess().getLinesAssignment_2()); 

            }

            // InternalCucumber.g:2178:2: ( ( rule__DocString__LinesAssignment_2 )* )
            // InternalCucumber.g:2179:3: ( rule__DocString__LinesAssignment_2 )*
            {
             before(grammarAccess.getDocStringAccess().getLinesAssignment_2()); 
            // InternalCucumber.g:2180:3: ( rule__DocString__LinesAssignment_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==EOF||(LA33_0>=RULE_WORD && LA33_0<=RULE_EOL)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalCucumber.g:2180:4: rule__DocString__LinesAssignment_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__DocString__LinesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalCucumber.g:2189:1: rule__DocString__Group__3 : rule__DocString__Group__3__Impl rule__DocString__Group__4 ;
    public final void rule__DocString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2193:1: ( rule__DocString__Group__3__Impl rule__DocString__Group__4 )
            // InternalCucumber.g:2194:2: rule__DocString__Group__3__Impl rule__DocString__Group__4
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
    // InternalCucumber.g:2201:1: rule__DocString__Group__3__Impl : ( '\"\"\"' ) ;
    public final void rule__DocString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2205:1: ( ( '\"\"\"' ) )
            // InternalCucumber.g:2206:1: ( '\"\"\"' )
            {
            // InternalCucumber.g:2206:1: ( '\"\"\"' )
            // InternalCucumber.g:2207:2: '\"\"\"'
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
    // InternalCucumber.g:2216:1: rule__DocString__Group__4 : rule__DocString__Group__4__Impl ;
    public final void rule__DocString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2220:1: ( rule__DocString__Group__4__Impl )
            // InternalCucumber.g:2221:2: rule__DocString__Group__4__Impl
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
    // InternalCucumber.g:2227:1: rule__DocString__Group__4__Impl : ( RULE_EOL ) ;
    public final void rule__DocString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2231:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2232:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2232:1: ( RULE_EOL )
            // InternalCucumber.g:2233:2: RULE_EOL
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
    // InternalCucumber.g:2243:1: rule__Given__Group__0 : rule__Given__Group__0__Impl rule__Given__Group__1 ;
    public final void rule__Given__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2247:1: ( rule__Given__Group__0__Impl rule__Given__Group__1 )
            // InternalCucumber.g:2248:2: rule__Given__Group__0__Impl rule__Given__Group__1
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
    // InternalCucumber.g:2255:1: rule__Given__Group__0__Impl : ( 'Given' ) ;
    public final void rule__Given__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2259:1: ( ( 'Given' ) )
            // InternalCucumber.g:2260:1: ( 'Given' )
            {
            // InternalCucumber.g:2260:1: ( 'Given' )
            // InternalCucumber.g:2261:2: 'Given'
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
    // InternalCucumber.g:2270:1: rule__Given__Group__1 : rule__Given__Group__1__Impl rule__Given__Group__2 ;
    public final void rule__Given__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2274:1: ( rule__Given__Group__1__Impl rule__Given__Group__2 )
            // InternalCucumber.g:2275:2: rule__Given__Group__1__Impl rule__Given__Group__2
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
    // InternalCucumber.g:2282:1: rule__Given__Group__1__Impl : ( ( rule__Given__NameAssignment_1 ) ) ;
    public final void rule__Given__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2286:1: ( ( ( rule__Given__NameAssignment_1 ) ) )
            // InternalCucumber.g:2287:1: ( ( rule__Given__NameAssignment_1 ) )
            {
            // InternalCucumber.g:2287:1: ( ( rule__Given__NameAssignment_1 ) )
            // InternalCucumber.g:2288:2: ( rule__Given__NameAssignment_1 )
            {
             before(grammarAccess.getGivenAccess().getNameAssignment_1()); 
            // InternalCucumber.g:2289:2: ( rule__Given__NameAssignment_1 )
            // InternalCucumber.g:2289:3: rule__Given__NameAssignment_1
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
    // InternalCucumber.g:2297:1: rule__Given__Group__2 : rule__Given__Group__2__Impl rule__Given__Group__3 ;
    public final void rule__Given__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2301:1: ( rule__Given__Group__2__Impl rule__Given__Group__3 )
            // InternalCucumber.g:2302:2: rule__Given__Group__2__Impl rule__Given__Group__3
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
    // InternalCucumber.g:2309:1: rule__Given__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__Given__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2313:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2314:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2314:1: ( RULE_EOL )
            // InternalCucumber.g:2315:2: RULE_EOL
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
    // InternalCucumber.g:2324:1: rule__Given__Group__3 : rule__Given__Group__3__Impl ;
    public final void rule__Given__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2328:1: ( rule__Given__Group__3__Impl )
            // InternalCucumber.g:2329:2: rule__Given__Group__3__Impl
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
    // InternalCucumber.g:2335:1: rule__Given__Group__3__Impl : ( ( rule__Given__Alternatives_3 )? ) ;
    public final void rule__Given__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2339:1: ( ( ( rule__Given__Alternatives_3 )? ) )
            // InternalCucumber.g:2340:1: ( ( rule__Given__Alternatives_3 )? )
            {
            // InternalCucumber.g:2340:1: ( ( rule__Given__Alternatives_3 )? )
            // InternalCucumber.g:2341:2: ( rule__Given__Alternatives_3 )?
            {
             before(grammarAccess.getGivenAccess().getAlternatives_3()); 
            // InternalCucumber.g:2342:2: ( rule__Given__Alternatives_3 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=15 && LA34_0<=16)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCucumber.g:2342:3: rule__Given__Alternatives_3
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
    // InternalCucumber.g:2351:1: rule__When__Group__0 : rule__When__Group__0__Impl rule__When__Group__1 ;
    public final void rule__When__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2355:1: ( rule__When__Group__0__Impl rule__When__Group__1 )
            // InternalCucumber.g:2356:2: rule__When__Group__0__Impl rule__When__Group__1
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
    // InternalCucumber.g:2363:1: rule__When__Group__0__Impl : ( 'When' ) ;
    public final void rule__When__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2367:1: ( ( 'When' ) )
            // InternalCucumber.g:2368:1: ( 'When' )
            {
            // InternalCucumber.g:2368:1: ( 'When' )
            // InternalCucumber.g:2369:2: 'When'
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
    // InternalCucumber.g:2378:1: rule__When__Group__1 : rule__When__Group__1__Impl rule__When__Group__2 ;
    public final void rule__When__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2382:1: ( rule__When__Group__1__Impl rule__When__Group__2 )
            // InternalCucumber.g:2383:2: rule__When__Group__1__Impl rule__When__Group__2
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
    // InternalCucumber.g:2390:1: rule__When__Group__1__Impl : ( ( rule__When__NameAssignment_1 ) ) ;
    public final void rule__When__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2394:1: ( ( ( rule__When__NameAssignment_1 ) ) )
            // InternalCucumber.g:2395:1: ( ( rule__When__NameAssignment_1 ) )
            {
            // InternalCucumber.g:2395:1: ( ( rule__When__NameAssignment_1 ) )
            // InternalCucumber.g:2396:2: ( rule__When__NameAssignment_1 )
            {
             before(grammarAccess.getWhenAccess().getNameAssignment_1()); 
            // InternalCucumber.g:2397:2: ( rule__When__NameAssignment_1 )
            // InternalCucumber.g:2397:3: rule__When__NameAssignment_1
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
    // InternalCucumber.g:2405:1: rule__When__Group__2 : rule__When__Group__2__Impl rule__When__Group__3 ;
    public final void rule__When__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2409:1: ( rule__When__Group__2__Impl rule__When__Group__3 )
            // InternalCucumber.g:2410:2: rule__When__Group__2__Impl rule__When__Group__3
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
    // InternalCucumber.g:2417:1: rule__When__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__When__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2421:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2422:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2422:1: ( RULE_EOL )
            // InternalCucumber.g:2423:2: RULE_EOL
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
    // InternalCucumber.g:2432:1: rule__When__Group__3 : rule__When__Group__3__Impl ;
    public final void rule__When__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2436:1: ( rule__When__Group__3__Impl )
            // InternalCucumber.g:2437:2: rule__When__Group__3__Impl
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
    // InternalCucumber.g:2443:1: rule__When__Group__3__Impl : ( ( rule__When__Alternatives_3 )? ) ;
    public final void rule__When__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2447:1: ( ( ( rule__When__Alternatives_3 )? ) )
            // InternalCucumber.g:2448:1: ( ( rule__When__Alternatives_3 )? )
            {
            // InternalCucumber.g:2448:1: ( ( rule__When__Alternatives_3 )? )
            // InternalCucumber.g:2449:2: ( rule__When__Alternatives_3 )?
            {
             before(grammarAccess.getWhenAccess().getAlternatives_3()); 
            // InternalCucumber.g:2450:2: ( rule__When__Alternatives_3 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=15 && LA35_0<=16)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCucumber.g:2450:3: rule__When__Alternatives_3
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
    // InternalCucumber.g:2459:1: rule__Then__Group__0 : rule__Then__Group__0__Impl rule__Then__Group__1 ;
    public final void rule__Then__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2463:1: ( rule__Then__Group__0__Impl rule__Then__Group__1 )
            // InternalCucumber.g:2464:2: rule__Then__Group__0__Impl rule__Then__Group__1
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
    // InternalCucumber.g:2471:1: rule__Then__Group__0__Impl : ( 'Then' ) ;
    public final void rule__Then__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2475:1: ( ( 'Then' ) )
            // InternalCucumber.g:2476:1: ( 'Then' )
            {
            // InternalCucumber.g:2476:1: ( 'Then' )
            // InternalCucumber.g:2477:2: 'Then'
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
    // InternalCucumber.g:2486:1: rule__Then__Group__1 : rule__Then__Group__1__Impl rule__Then__Group__2 ;
    public final void rule__Then__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2490:1: ( rule__Then__Group__1__Impl rule__Then__Group__2 )
            // InternalCucumber.g:2491:2: rule__Then__Group__1__Impl rule__Then__Group__2
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
    // InternalCucumber.g:2498:1: rule__Then__Group__1__Impl : ( ( rule__Then__NameAssignment_1 ) ) ;
    public final void rule__Then__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2502:1: ( ( ( rule__Then__NameAssignment_1 ) ) )
            // InternalCucumber.g:2503:1: ( ( rule__Then__NameAssignment_1 ) )
            {
            // InternalCucumber.g:2503:1: ( ( rule__Then__NameAssignment_1 ) )
            // InternalCucumber.g:2504:2: ( rule__Then__NameAssignment_1 )
            {
             before(grammarAccess.getThenAccess().getNameAssignment_1()); 
            // InternalCucumber.g:2505:2: ( rule__Then__NameAssignment_1 )
            // InternalCucumber.g:2505:3: rule__Then__NameAssignment_1
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
    // InternalCucumber.g:2513:1: rule__Then__Group__2 : rule__Then__Group__2__Impl rule__Then__Group__3 ;
    public final void rule__Then__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2517:1: ( rule__Then__Group__2__Impl rule__Then__Group__3 )
            // InternalCucumber.g:2518:2: rule__Then__Group__2__Impl rule__Then__Group__3
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
    // InternalCucumber.g:2525:1: rule__Then__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__Then__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2529:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2530:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2530:1: ( RULE_EOL )
            // InternalCucumber.g:2531:2: RULE_EOL
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
    // InternalCucumber.g:2540:1: rule__Then__Group__3 : rule__Then__Group__3__Impl ;
    public final void rule__Then__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2544:1: ( rule__Then__Group__3__Impl )
            // InternalCucumber.g:2545:2: rule__Then__Group__3__Impl
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
    // InternalCucumber.g:2551:1: rule__Then__Group__3__Impl : ( ( rule__Then__Alternatives_3 )? ) ;
    public final void rule__Then__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2555:1: ( ( ( rule__Then__Alternatives_3 )? ) )
            // InternalCucumber.g:2556:1: ( ( rule__Then__Alternatives_3 )? )
            {
            // InternalCucumber.g:2556:1: ( ( rule__Then__Alternatives_3 )? )
            // InternalCucumber.g:2557:2: ( rule__Then__Alternatives_3 )?
            {
             before(grammarAccess.getThenAccess().getAlternatives_3()); 
            // InternalCucumber.g:2558:2: ( rule__Then__Alternatives_3 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=15 && LA36_0<=16)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCucumber.g:2558:3: rule__Then__Alternatives_3
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
    // InternalCucumber.g:2567:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2571:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalCucumber.g:2572:2: rule__And__Group__0__Impl rule__And__Group__1
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
    // InternalCucumber.g:2579:1: rule__And__Group__0__Impl : ( 'And' ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2583:1: ( ( 'And' ) )
            // InternalCucumber.g:2584:1: ( 'And' )
            {
            // InternalCucumber.g:2584:1: ( 'And' )
            // InternalCucumber.g:2585:2: 'And'
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
    // InternalCucumber.g:2594:1: rule__And__Group__1 : rule__And__Group__1__Impl rule__And__Group__2 ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2598:1: ( rule__And__Group__1__Impl rule__And__Group__2 )
            // InternalCucumber.g:2599:2: rule__And__Group__1__Impl rule__And__Group__2
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
    // InternalCucumber.g:2606:1: rule__And__Group__1__Impl : ( ( rule__And__NameAssignment_1 ) ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2610:1: ( ( ( rule__And__NameAssignment_1 ) ) )
            // InternalCucumber.g:2611:1: ( ( rule__And__NameAssignment_1 ) )
            {
            // InternalCucumber.g:2611:1: ( ( rule__And__NameAssignment_1 ) )
            // InternalCucumber.g:2612:2: ( rule__And__NameAssignment_1 )
            {
             before(grammarAccess.getAndAccess().getNameAssignment_1()); 
            // InternalCucumber.g:2613:2: ( rule__And__NameAssignment_1 )
            // InternalCucumber.g:2613:3: rule__And__NameAssignment_1
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
    // InternalCucumber.g:2621:1: rule__And__Group__2 : rule__And__Group__2__Impl rule__And__Group__3 ;
    public final void rule__And__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2625:1: ( rule__And__Group__2__Impl rule__And__Group__3 )
            // InternalCucumber.g:2626:2: rule__And__Group__2__Impl rule__And__Group__3
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
    // InternalCucumber.g:2633:1: rule__And__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__And__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2637:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2638:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2638:1: ( RULE_EOL )
            // InternalCucumber.g:2639:2: RULE_EOL
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
    // InternalCucumber.g:2648:1: rule__And__Group__3 : rule__And__Group__3__Impl ;
    public final void rule__And__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2652:1: ( rule__And__Group__3__Impl )
            // InternalCucumber.g:2653:2: rule__And__Group__3__Impl
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
    // InternalCucumber.g:2659:1: rule__And__Group__3__Impl : ( ( rule__And__Alternatives_3 )? ) ;
    public final void rule__And__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2663:1: ( ( ( rule__And__Alternatives_3 )? ) )
            // InternalCucumber.g:2664:1: ( ( rule__And__Alternatives_3 )? )
            {
            // InternalCucumber.g:2664:1: ( ( rule__And__Alternatives_3 )? )
            // InternalCucumber.g:2665:2: ( rule__And__Alternatives_3 )?
            {
             before(grammarAccess.getAndAccess().getAlternatives_3()); 
            // InternalCucumber.g:2666:2: ( rule__And__Alternatives_3 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=15 && LA37_0<=16)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCucumber.g:2666:3: rule__And__Alternatives_3
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
    // InternalCucumber.g:2675:1: rule__But__Group__0 : rule__But__Group__0__Impl rule__But__Group__1 ;
    public final void rule__But__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2679:1: ( rule__But__Group__0__Impl rule__But__Group__1 )
            // InternalCucumber.g:2680:2: rule__But__Group__0__Impl rule__But__Group__1
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
    // InternalCucumber.g:2687:1: rule__But__Group__0__Impl : ( 'But' ) ;
    public final void rule__But__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2691:1: ( ( 'But' ) )
            // InternalCucumber.g:2692:1: ( 'But' )
            {
            // InternalCucumber.g:2692:1: ( 'But' )
            // InternalCucumber.g:2693:2: 'But'
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
    // InternalCucumber.g:2702:1: rule__But__Group__1 : rule__But__Group__1__Impl rule__But__Group__2 ;
    public final void rule__But__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2706:1: ( rule__But__Group__1__Impl rule__But__Group__2 )
            // InternalCucumber.g:2707:2: rule__But__Group__1__Impl rule__But__Group__2
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
    // InternalCucumber.g:2714:1: rule__But__Group__1__Impl : ( ( rule__But__NameAssignment_1 ) ) ;
    public final void rule__But__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2718:1: ( ( ( rule__But__NameAssignment_1 ) ) )
            // InternalCucumber.g:2719:1: ( ( rule__But__NameAssignment_1 ) )
            {
            // InternalCucumber.g:2719:1: ( ( rule__But__NameAssignment_1 ) )
            // InternalCucumber.g:2720:2: ( rule__But__NameAssignment_1 )
            {
             before(grammarAccess.getButAccess().getNameAssignment_1()); 
            // InternalCucumber.g:2721:2: ( rule__But__NameAssignment_1 )
            // InternalCucumber.g:2721:3: rule__But__NameAssignment_1
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
    // InternalCucumber.g:2729:1: rule__But__Group__2 : rule__But__Group__2__Impl rule__But__Group__3 ;
    public final void rule__But__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2733:1: ( rule__But__Group__2__Impl rule__But__Group__3 )
            // InternalCucumber.g:2734:2: rule__But__Group__2__Impl rule__But__Group__3
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
    // InternalCucumber.g:2741:1: rule__But__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__But__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2745:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2746:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2746:1: ( RULE_EOL )
            // InternalCucumber.g:2747:2: RULE_EOL
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
    // InternalCucumber.g:2756:1: rule__But__Group__3 : rule__But__Group__3__Impl ;
    public final void rule__But__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2760:1: ( rule__But__Group__3__Impl )
            // InternalCucumber.g:2761:2: rule__But__Group__3__Impl
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
    // InternalCucumber.g:2767:1: rule__But__Group__3__Impl : ( ( rule__But__Alternatives_3 )? ) ;
    public final void rule__But__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2771:1: ( ( ( rule__But__Alternatives_3 )? ) )
            // InternalCucumber.g:2772:1: ( ( rule__But__Alternatives_3 )? )
            {
            // InternalCucumber.g:2772:1: ( ( rule__But__Alternatives_3 )? )
            // InternalCucumber.g:2773:2: ( rule__But__Alternatives_3 )?
            {
             before(grammarAccess.getButAccess().getAlternatives_3()); 
            // InternalCucumber.g:2774:2: ( rule__But__Alternatives_3 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=15 && LA38_0<=16)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCucumber.g:2774:3: rule__But__Alternatives_3
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
    // InternalCucumber.g:2783:1: rule__Asterisk__Group__0 : rule__Asterisk__Group__0__Impl rule__Asterisk__Group__1 ;
    public final void rule__Asterisk__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2787:1: ( rule__Asterisk__Group__0__Impl rule__Asterisk__Group__1 )
            // InternalCucumber.g:2788:2: rule__Asterisk__Group__0__Impl rule__Asterisk__Group__1
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
    // InternalCucumber.g:2795:1: rule__Asterisk__Group__0__Impl : ( '*' ) ;
    public final void rule__Asterisk__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2799:1: ( ( '*' ) )
            // InternalCucumber.g:2800:1: ( '*' )
            {
            // InternalCucumber.g:2800:1: ( '*' )
            // InternalCucumber.g:2801:2: '*'
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
    // InternalCucumber.g:2810:1: rule__Asterisk__Group__1 : rule__Asterisk__Group__1__Impl rule__Asterisk__Group__2 ;
    public final void rule__Asterisk__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2814:1: ( rule__Asterisk__Group__1__Impl rule__Asterisk__Group__2 )
            // InternalCucumber.g:2815:2: rule__Asterisk__Group__1__Impl rule__Asterisk__Group__2
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
    // InternalCucumber.g:2822:1: rule__Asterisk__Group__1__Impl : ( ( rule__Asterisk__NameAssignment_1 ) ) ;
    public final void rule__Asterisk__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2826:1: ( ( ( rule__Asterisk__NameAssignment_1 ) ) )
            // InternalCucumber.g:2827:1: ( ( rule__Asterisk__NameAssignment_1 ) )
            {
            // InternalCucumber.g:2827:1: ( ( rule__Asterisk__NameAssignment_1 ) )
            // InternalCucumber.g:2828:2: ( rule__Asterisk__NameAssignment_1 )
            {
             before(grammarAccess.getAsteriskAccess().getNameAssignment_1()); 
            // InternalCucumber.g:2829:2: ( rule__Asterisk__NameAssignment_1 )
            // InternalCucumber.g:2829:3: rule__Asterisk__NameAssignment_1
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
    // InternalCucumber.g:2837:1: rule__Asterisk__Group__2 : rule__Asterisk__Group__2__Impl rule__Asterisk__Group__3 ;
    public final void rule__Asterisk__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2841:1: ( rule__Asterisk__Group__2__Impl rule__Asterisk__Group__3 )
            // InternalCucumber.g:2842:2: rule__Asterisk__Group__2__Impl rule__Asterisk__Group__3
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
    // InternalCucumber.g:2849:1: rule__Asterisk__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__Asterisk__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2853:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2854:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2854:1: ( RULE_EOL )
            // InternalCucumber.g:2855:2: RULE_EOL
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
    // InternalCucumber.g:2864:1: rule__Asterisk__Group__3 : rule__Asterisk__Group__3__Impl ;
    public final void rule__Asterisk__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2868:1: ( rule__Asterisk__Group__3__Impl )
            // InternalCucumber.g:2869:2: rule__Asterisk__Group__3__Impl
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
    // InternalCucumber.g:2875:1: rule__Asterisk__Group__3__Impl : ( ( rule__Asterisk__Alternatives_3 )? ) ;
    public final void rule__Asterisk__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2879:1: ( ( ( rule__Asterisk__Alternatives_3 )? ) )
            // InternalCucumber.g:2880:1: ( ( rule__Asterisk__Alternatives_3 )? )
            {
            // InternalCucumber.g:2880:1: ( ( rule__Asterisk__Alternatives_3 )? )
            // InternalCucumber.g:2881:2: ( rule__Asterisk__Alternatives_3 )?
            {
             before(grammarAccess.getAsteriskAccess().getAlternatives_3()); 
            // InternalCucumber.g:2882:2: ( rule__Asterisk__Alternatives_3 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=15 && LA39_0<=16)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCucumber.g:2882:3: rule__Asterisk__Alternatives_3
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
    // InternalCucumber.g:2891:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2895:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalCucumber.g:2896:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
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
    // InternalCucumber.g:2903:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__NameAssignment_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2907:1: ( ( ( rule__Statement__NameAssignment_0 ) ) )
            // InternalCucumber.g:2908:1: ( ( rule__Statement__NameAssignment_0 ) )
            {
            // InternalCucumber.g:2908:1: ( ( rule__Statement__NameAssignment_0 ) )
            // InternalCucumber.g:2909:2: ( rule__Statement__NameAssignment_0 )
            {
             before(grammarAccess.getStatementAccess().getNameAssignment_0()); 
            // InternalCucumber.g:2910:2: ( rule__Statement__NameAssignment_0 )
            // InternalCucumber.g:2910:3: rule__Statement__NameAssignment_0
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
    // InternalCucumber.g:2918:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2922:1: ( rule__Statement__Group__1__Impl )
            // InternalCucumber.g:2923:2: rule__Statement__Group__1__Impl
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
    // InternalCucumber.g:2929:1: rule__Statement__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2933:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2934:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2934:1: ( RULE_EOL )
            // InternalCucumber.g:2935:2: RULE_EOL
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
    // InternalCucumber.g:2945:1: rule__Tag__Group__0 : rule__Tag__Group__0__Impl rule__Tag__Group__1 ;
    public final void rule__Tag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2949:1: ( rule__Tag__Group__0__Impl rule__Tag__Group__1 )
            // InternalCucumber.g:2950:2: rule__Tag__Group__0__Impl rule__Tag__Group__1
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
    // InternalCucumber.g:2957:1: rule__Tag__Group__0__Impl : ( '@' ) ;
    public final void rule__Tag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2961:1: ( ( '@' ) )
            // InternalCucumber.g:2962:1: ( '@' )
            {
            // InternalCucumber.g:2962:1: ( '@' )
            // InternalCucumber.g:2963:2: '@'
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
    // InternalCucumber.g:2972:1: rule__Tag__Group__1 : rule__Tag__Group__1__Impl ;
    public final void rule__Tag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2976:1: ( rule__Tag__Group__1__Impl )
            // InternalCucumber.g:2977:2: rule__Tag__Group__1__Impl
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
    // InternalCucumber.g:2983:1: rule__Tag__Group__1__Impl : ( ( rule__Tag__NameAssignment_1 ) ) ;
    public final void rule__Tag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2987:1: ( ( ( rule__Tag__NameAssignment_1 ) ) )
            // InternalCucumber.g:2988:1: ( ( rule__Tag__NameAssignment_1 ) )
            {
            // InternalCucumber.g:2988:1: ( ( rule__Tag__NameAssignment_1 ) )
            // InternalCucumber.g:2989:2: ( rule__Tag__NameAssignment_1 )
            {
             before(grammarAccess.getTagAccess().getNameAssignment_1()); 
            // InternalCucumber.g:2990:2: ( rule__Tag__NameAssignment_1 )
            // InternalCucumber.g:2990:3: rule__Tag__NameAssignment_1
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
    // InternalCucumber.g:2999:1: rule__Line__Group__0 : rule__Line__Group__0__Impl rule__Line__Group__1 ;
    public final void rule__Line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3003:1: ( rule__Line__Group__0__Impl rule__Line__Group__1 )
            // InternalCucumber.g:3004:2: rule__Line__Group__0__Impl rule__Line__Group__1
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
    // InternalCucumber.g:3011:1: rule__Line__Group__0__Impl : ( ( rule__Line__NameAssignment_0 ) ) ;
    public final void rule__Line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3015:1: ( ( ( rule__Line__NameAssignment_0 ) ) )
            // InternalCucumber.g:3016:1: ( ( rule__Line__NameAssignment_0 ) )
            {
            // InternalCucumber.g:3016:1: ( ( rule__Line__NameAssignment_0 ) )
            // InternalCucumber.g:3017:2: ( rule__Line__NameAssignment_0 )
            {
             before(grammarAccess.getLineAccess().getNameAssignment_0()); 
            // InternalCucumber.g:3018:2: ( rule__Line__NameAssignment_0 )
            // InternalCucumber.g:3018:3: rule__Line__NameAssignment_0
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
    // InternalCucumber.g:3026:1: rule__Line__Group__1 : rule__Line__Group__1__Impl ;
    public final void rule__Line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3030:1: ( rule__Line__Group__1__Impl )
            // InternalCucumber.g:3031:2: rule__Line__Group__1__Impl
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
    // InternalCucumber.g:3037:1: rule__Line__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3041:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:3042:1: ( RULE_EOL )
            {
            // InternalCucumber.g:3042:1: ( RULE_EOL )
            // InternalCucumber.g:3043:2: RULE_EOL
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
    // InternalCucumber.g:3053:1: rule__Feature__TagsAssignment_0_0 : ( ruleTag ) ;
    public final void rule__Feature__TagsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3057:1: ( ( ruleTag ) )
            // InternalCucumber.g:3058:2: ( ruleTag )
            {
            // InternalCucumber.g:3058:2: ( ruleTag )
            // InternalCucumber.g:3059:3: ruleTag
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
    // InternalCucumber.g:3068:1: rule__Feature__NameAssignment_2 : ( rulePhrase ) ;
    public final void rule__Feature__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3072:1: ( ( rulePhrase ) )
            // InternalCucumber.g:3073:2: ( rulePhrase )
            {
            // InternalCucumber.g:3073:2: ( rulePhrase )
            // InternalCucumber.g:3074:3: rulePhrase
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
    // InternalCucumber.g:3083:1: rule__Feature__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__Feature__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3087:1: ( ( ruleStatement ) )
            // InternalCucumber.g:3088:2: ( ruleStatement )
            {
            // InternalCucumber.g:3088:2: ( ruleStatement )
            // InternalCucumber.g:3089:3: ruleStatement
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
    // InternalCucumber.g:3098:1: rule__Feature__AbstractScenariosAssignment_5 : ( ruleAbstractScenario ) ;
    public final void rule__Feature__AbstractScenariosAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3102:1: ( ( ruleAbstractScenario ) )
            // InternalCucumber.g:3103:2: ( ruleAbstractScenario )
            {
            // InternalCucumber.g:3103:2: ( ruleAbstractScenario )
            // InternalCucumber.g:3104:3: ruleAbstractScenario
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
    // InternalCucumber.g:3113:1: rule__Background__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__Background__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3117:1: ( ( rulePhrase ) )
            // InternalCucumber.g:3118:2: ( rulePhrase )
            {
            // InternalCucumber.g:3118:2: ( rulePhrase )
            // InternalCucumber.g:3119:3: rulePhrase
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
    // InternalCucumber.g:3128:1: rule__Background__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__Background__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3132:1: ( ( ruleStatement ) )
            // InternalCucumber.g:3133:2: ( ruleStatement )
            {
            // InternalCucumber.g:3133:2: ( ruleStatement )
            // InternalCucumber.g:3134:3: ruleStatement
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
    // InternalCucumber.g:3143:1: rule__Background__StepsAssignment_4 : ( ruleStep ) ;
    public final void rule__Background__StepsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3147:1: ( ( ruleStep ) )
            // InternalCucumber.g:3148:2: ( ruleStep )
            {
            // InternalCucumber.g:3148:2: ( ruleStep )
            // InternalCucumber.g:3149:3: ruleStep
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
    // InternalCucumber.g:3158:1: rule__Scenario__TagsAssignment_0_0 : ( ruleTag ) ;
    public final void rule__Scenario__TagsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3162:1: ( ( ruleTag ) )
            // InternalCucumber.g:3163:2: ( ruleTag )
            {
            // InternalCucumber.g:3163:2: ( ruleTag )
            // InternalCucumber.g:3164:3: ruleTag
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
    // InternalCucumber.g:3173:1: rule__Scenario__NameAssignment_2 : ( rulePhrase ) ;
    public final void rule__Scenario__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3177:1: ( ( rulePhrase ) )
            // InternalCucumber.g:3178:2: ( rulePhrase )
            {
            // InternalCucumber.g:3178:2: ( rulePhrase )
            // InternalCucumber.g:3179:3: rulePhrase
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
    // InternalCucumber.g:3188:1: rule__Scenario__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__Scenario__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3192:1: ( ( ruleStatement ) )
            // InternalCucumber.g:3193:2: ( ruleStatement )
            {
            // InternalCucumber.g:3193:2: ( ruleStatement )
            // InternalCucumber.g:3194:3: ruleStatement
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
    // InternalCucumber.g:3203:1: rule__Scenario__StepsAssignment_5 : ( ruleStep ) ;
    public final void rule__Scenario__StepsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3207:1: ( ( ruleStep ) )
            // InternalCucumber.g:3208:2: ( ruleStep )
            {
            // InternalCucumber.g:3208:2: ( ruleStep )
            // InternalCucumber.g:3209:3: ruleStep
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
    // InternalCucumber.g:3218:1: rule__ScenarioOutline__TagsAssignment_0_0 : ( ruleTag ) ;
    public final void rule__ScenarioOutline__TagsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3222:1: ( ( ruleTag ) )
            // InternalCucumber.g:3223:2: ( ruleTag )
            {
            // InternalCucumber.g:3223:2: ( ruleTag )
            // InternalCucumber.g:3224:3: ruleTag
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
    // InternalCucumber.g:3233:1: rule__ScenarioOutline__NameAssignment_2 : ( rulePhrase ) ;
    public final void rule__ScenarioOutline__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3237:1: ( ( rulePhrase ) )
            // InternalCucumber.g:3238:2: ( rulePhrase )
            {
            // InternalCucumber.g:3238:2: ( rulePhrase )
            // InternalCucumber.g:3239:3: rulePhrase
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
    // InternalCucumber.g:3248:1: rule__ScenarioOutline__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__ScenarioOutline__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3252:1: ( ( ruleStatement ) )
            // InternalCucumber.g:3253:2: ( ruleStatement )
            {
            // InternalCucumber.g:3253:2: ( ruleStatement )
            // InternalCucumber.g:3254:3: ruleStatement
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
    // InternalCucumber.g:3263:1: rule__ScenarioOutline__StepsAssignment_5 : ( ruleStep ) ;
    public final void rule__ScenarioOutline__StepsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3267:1: ( ( ruleStep ) )
            // InternalCucumber.g:3268:2: ( ruleStep )
            {
            // InternalCucumber.g:3268:2: ( ruleStep )
            // InternalCucumber.g:3269:3: ruleStep
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
    // InternalCucumber.g:3278:1: rule__ScenarioOutline__ExamplesAssignment_6 : ( ruleExamples ) ;
    public final void rule__ScenarioOutline__ExamplesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3282:1: ( ( ruleExamples ) )
            // InternalCucumber.g:3283:2: ( ruleExamples )
            {
            // InternalCucumber.g:3283:2: ( ruleExamples )
            // InternalCucumber.g:3284:3: ruleExamples
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
    // InternalCucumber.g:3293:1: rule__Examples__TagsAssignment_0_0 : ( ruleTag ) ;
    public final void rule__Examples__TagsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3297:1: ( ( ruleTag ) )
            // InternalCucumber.g:3298:2: ( ruleTag )
            {
            // InternalCucumber.g:3298:2: ( ruleTag )
            // InternalCucumber.g:3299:3: ruleTag
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
    // InternalCucumber.g:3308:1: rule__Examples__NameAssignment_2 : ( rulePhrase ) ;
    public final void rule__Examples__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3312:1: ( ( rulePhrase ) )
            // InternalCucumber.g:3313:2: ( rulePhrase )
            {
            // InternalCucumber.g:3313:2: ( rulePhrase )
            // InternalCucumber.g:3314:3: rulePhrase
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
    // InternalCucumber.g:3323:1: rule__Examples__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__Examples__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3327:1: ( ( ruleStatement ) )
            // InternalCucumber.g:3328:2: ( ruleStatement )
            {
            // InternalCucumber.g:3328:2: ( ruleStatement )
            // InternalCucumber.g:3329:3: ruleStatement
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
    // InternalCucumber.g:3338:1: rule__Examples__TheExamplesTableAssignment_5 : ( ruleExamplesTable ) ;
    public final void rule__Examples__TheExamplesTableAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3342:1: ( ( ruleExamplesTable ) )
            // InternalCucumber.g:3343:2: ( ruleExamplesTable )
            {
            // InternalCucumber.g:3343:2: ( ruleExamplesTable )
            // InternalCucumber.g:3344:3: ruleExamplesTable
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
    // InternalCucumber.g:3353:1: rule__ExamplesTable__RowsAssignment : ( ruleRow ) ;
    public final void rule__ExamplesTable__RowsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3357:1: ( ( ruleRow ) )
            // InternalCucumber.g:3358:2: ( ruleRow )
            {
            // InternalCucumber.g:3358:2: ( ruleRow )
            // InternalCucumber.g:3359:3: ruleRow
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
    // InternalCucumber.g:3368:1: rule__StepTable__RowsAssignment : ( ruleRow ) ;
    public final void rule__StepTable__RowsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3372:1: ( ( ruleRow ) )
            // InternalCucumber.g:3373:2: ( ruleRow )
            {
            // InternalCucumber.g:3373:2: ( ruleRow )
            // InternalCucumber.g:3374:3: ruleRow
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
    // InternalCucumber.g:3383:1: rule__Row__CellsAssignment_0 : ( ruleCell ) ;
    public final void rule__Row__CellsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3387:1: ( ( ruleCell ) )
            // InternalCucumber.g:3388:2: ( ruleCell )
            {
            // InternalCucumber.g:3388:2: ( ruleCell )
            // InternalCucumber.g:3389:3: ruleCell
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
    // InternalCucumber.g:3398:1: rule__Cell__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__Cell__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3402:1: ( ( rulePhrase ) )
            // InternalCucumber.g:3403:2: ( rulePhrase )
            {
            // InternalCucumber.g:3403:2: ( rulePhrase )
            // InternalCucumber.g:3404:3: rulePhrase
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


    // $ANTLR start "rule__DocString__LinesAssignment_2"
    // InternalCucumber.g:3413:1: rule__DocString__LinesAssignment_2 : ( ruleLine ) ;
    public final void rule__DocString__LinesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3417:1: ( ( ruleLine ) )
            // InternalCucumber.g:3418:2: ( ruleLine )
            {
            // InternalCucumber.g:3418:2: ( ruleLine )
            // InternalCucumber.g:3419:3: ruleLine
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


    // $ANTLR start "rule__Given__NameAssignment_1"
    // InternalCucumber.g:3428:1: rule__Given__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__Given__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3432:1: ( ( rulePhrase ) )
            // InternalCucumber.g:3433:2: ( rulePhrase )
            {
            // InternalCucumber.g:3433:2: ( rulePhrase )
            // InternalCucumber.g:3434:3: rulePhrase
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
    // InternalCucumber.g:3443:1: rule__Given__TheStepTableAssignment_3_0 : ( ruleStepTable ) ;
    public final void rule__Given__TheStepTableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3447:1: ( ( ruleStepTable ) )
            // InternalCucumber.g:3448:2: ( ruleStepTable )
            {
            // InternalCucumber.g:3448:2: ( ruleStepTable )
            // InternalCucumber.g:3449:3: ruleStepTable
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
    // InternalCucumber.g:3458:1: rule__Given__TheDocStringAssignment_3_1 : ( ruleDocString ) ;
    public final void rule__Given__TheDocStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3462:1: ( ( ruleDocString ) )
            // InternalCucumber.g:3463:2: ( ruleDocString )
            {
            // InternalCucumber.g:3463:2: ( ruleDocString )
            // InternalCucumber.g:3464:3: ruleDocString
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
    // InternalCucumber.g:3473:1: rule__When__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__When__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3477:1: ( ( rulePhrase ) )
            // InternalCucumber.g:3478:2: ( rulePhrase )
            {
            // InternalCucumber.g:3478:2: ( rulePhrase )
            // InternalCucumber.g:3479:3: rulePhrase
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
    // InternalCucumber.g:3488:1: rule__When__TheStepTableAssignment_3_0 : ( ruleStepTable ) ;
    public final void rule__When__TheStepTableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3492:1: ( ( ruleStepTable ) )
            // InternalCucumber.g:3493:2: ( ruleStepTable )
            {
            // InternalCucumber.g:3493:2: ( ruleStepTable )
            // InternalCucumber.g:3494:3: ruleStepTable
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
    // InternalCucumber.g:3503:1: rule__When__TheDocStringAssignment_3_1 : ( ruleDocString ) ;
    public final void rule__When__TheDocStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3507:1: ( ( ruleDocString ) )
            // InternalCucumber.g:3508:2: ( ruleDocString )
            {
            // InternalCucumber.g:3508:2: ( ruleDocString )
            // InternalCucumber.g:3509:3: ruleDocString
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
    // InternalCucumber.g:3518:1: rule__Then__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__Then__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3522:1: ( ( rulePhrase ) )
            // InternalCucumber.g:3523:2: ( rulePhrase )
            {
            // InternalCucumber.g:3523:2: ( rulePhrase )
            // InternalCucumber.g:3524:3: rulePhrase
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
    // InternalCucumber.g:3533:1: rule__Then__TheStepTableAssignment_3_0 : ( ruleStepTable ) ;
    public final void rule__Then__TheStepTableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3537:1: ( ( ruleStepTable ) )
            // InternalCucumber.g:3538:2: ( ruleStepTable )
            {
            // InternalCucumber.g:3538:2: ( ruleStepTable )
            // InternalCucumber.g:3539:3: ruleStepTable
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
    // InternalCucumber.g:3548:1: rule__Then__TheDocStringAssignment_3_1 : ( ruleDocString ) ;
    public final void rule__Then__TheDocStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3552:1: ( ( ruleDocString ) )
            // InternalCucumber.g:3553:2: ( ruleDocString )
            {
            // InternalCucumber.g:3553:2: ( ruleDocString )
            // InternalCucumber.g:3554:3: ruleDocString
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
    // InternalCucumber.g:3563:1: rule__And__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__And__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3567:1: ( ( rulePhrase ) )
            // InternalCucumber.g:3568:2: ( rulePhrase )
            {
            // InternalCucumber.g:3568:2: ( rulePhrase )
            // InternalCucumber.g:3569:3: rulePhrase
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
    // InternalCucumber.g:3578:1: rule__And__TheStepTableAssignment_3_0 : ( ruleStepTable ) ;
    public final void rule__And__TheStepTableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3582:1: ( ( ruleStepTable ) )
            // InternalCucumber.g:3583:2: ( ruleStepTable )
            {
            // InternalCucumber.g:3583:2: ( ruleStepTable )
            // InternalCucumber.g:3584:3: ruleStepTable
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
    // InternalCucumber.g:3593:1: rule__And__TheDocStringAssignment_3_1 : ( ruleDocString ) ;
    public final void rule__And__TheDocStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3597:1: ( ( ruleDocString ) )
            // InternalCucumber.g:3598:2: ( ruleDocString )
            {
            // InternalCucumber.g:3598:2: ( ruleDocString )
            // InternalCucumber.g:3599:3: ruleDocString
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
    // InternalCucumber.g:3608:1: rule__But__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__But__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3612:1: ( ( rulePhrase ) )
            // InternalCucumber.g:3613:2: ( rulePhrase )
            {
            // InternalCucumber.g:3613:2: ( rulePhrase )
            // InternalCucumber.g:3614:3: rulePhrase
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
    // InternalCucumber.g:3623:1: rule__But__TheStepTableAssignment_3_0 : ( ruleStepTable ) ;
    public final void rule__But__TheStepTableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3627:1: ( ( ruleStepTable ) )
            // InternalCucumber.g:3628:2: ( ruleStepTable )
            {
            // InternalCucumber.g:3628:2: ( ruleStepTable )
            // InternalCucumber.g:3629:3: ruleStepTable
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
    // InternalCucumber.g:3638:1: rule__But__TheDocStringAssignment_3_1 : ( ruleDocString ) ;
    public final void rule__But__TheDocStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3642:1: ( ( ruleDocString ) )
            // InternalCucumber.g:3643:2: ( ruleDocString )
            {
            // InternalCucumber.g:3643:2: ( ruleDocString )
            // InternalCucumber.g:3644:3: ruleDocString
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
    // InternalCucumber.g:3653:1: rule__Asterisk__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__Asterisk__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3657:1: ( ( rulePhrase ) )
            // InternalCucumber.g:3658:2: ( rulePhrase )
            {
            // InternalCucumber.g:3658:2: ( rulePhrase )
            // InternalCucumber.g:3659:3: rulePhrase
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
    // InternalCucumber.g:3668:1: rule__Asterisk__TheStepTableAssignment_3_0 : ( ruleStepTable ) ;
    public final void rule__Asterisk__TheStepTableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3672:1: ( ( ruleStepTable ) )
            // InternalCucumber.g:3673:2: ( ruleStepTable )
            {
            // InternalCucumber.g:3673:2: ( ruleStepTable )
            // InternalCucumber.g:3674:3: ruleStepTable
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
    // InternalCucumber.g:3683:1: rule__Asterisk__TheDocStringAssignment_3_1 : ( ruleDocString ) ;
    public final void rule__Asterisk__TheDocStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3687:1: ( ( ruleDocString ) )
            // InternalCucumber.g:3688:2: ( ruleDocString )
            {
            // InternalCucumber.g:3688:2: ( ruleDocString )
            // InternalCucumber.g:3689:3: ruleDocString
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
    // InternalCucumber.g:3698:1: rule__Statement__NameAssignment_0 : ( rulePhrase ) ;
    public final void rule__Statement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3702:1: ( ( rulePhrase ) )
            // InternalCucumber.g:3703:2: ( rulePhrase )
            {
            // InternalCucumber.g:3703:2: ( rulePhrase )
            // InternalCucumber.g:3704:3: rulePhrase
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
    // InternalCucumber.g:3713:1: rule__Tag__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Tag__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3717:1: ( ( RULE_ID ) )
            // InternalCucumber.g:3718:2: ( RULE_ID )
            {
            // InternalCucumber.g:3718:2: ( RULE_ID )
            // InternalCucumber.g:3719:3: RULE_ID
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
    // InternalCucumber.g:3728:1: rule__Line__NameAssignment_0 : ( ruleLineBits ) ;
    public final void rule__Line__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3732:1: ( ( ruleLineBits ) )
            // InternalCucumber.g:3733:2: ( ruleLineBits )
            {
            // InternalCucumber.g:3733:2: ( ruleLineBits )
            // InternalCucumber.g:3734:3: ruleLineBits
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
    protected DFA27 dfa27 = new DFA27(this);
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
            return "673:1: rule__AbstractScenario__Alternatives : ( ( ruleBackground ) | ( ruleScenario ) | ( ruleScenarioOutline ) );";
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

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 1665:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )*";
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
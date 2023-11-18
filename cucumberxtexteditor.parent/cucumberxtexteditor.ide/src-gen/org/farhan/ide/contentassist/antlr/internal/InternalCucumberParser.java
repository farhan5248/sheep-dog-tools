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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WORD", "RULE_EOL", "RULE_TAG", "RULE_WS", "RULE_COMMENT", "'Given'", "'When'", "'Then'", "'And'", "'But'", "'*'", "'Feature:'", "'Background:'", "'Scenario:'", "'Scenario Outline:'", "'Examples:'", "'|'", "'\"\"\"'"
    };
    public static final int RULE_WORD=4;
    public static final int RULE_TAG=6;
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
    public static final int RULE_COMMENT=8;
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


    // $ANTLR start "entryRuleBackground"
    // InternalCucumber.g:78:1: entryRuleBackground : ruleBackground EOF ;
    public final void entryRuleBackground() throws RecognitionException {
        try {
            // InternalCucumber.g:79:1: ( ruleBackground EOF )
            // InternalCucumber.g:80:1: ruleBackground EOF
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
    // InternalCucumber.g:87:1: ruleBackground : ( ( rule__Background__Group__0 ) ) ;
    public final void ruleBackground() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:91:2: ( ( ( rule__Background__Group__0 ) ) )
            // InternalCucumber.g:92:2: ( ( rule__Background__Group__0 ) )
            {
            // InternalCucumber.g:92:2: ( ( rule__Background__Group__0 ) )
            // InternalCucumber.g:93:3: ( rule__Background__Group__0 )
            {
             before(grammarAccess.getBackgroundAccess().getGroup()); 
            // InternalCucumber.g:94:3: ( rule__Background__Group__0 )
            // InternalCucumber.g:94:4: rule__Background__Group__0
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


    // $ANTLR start "entryRuleAbstractScenario"
    // InternalCucumber.g:103:1: entryRuleAbstractScenario : ruleAbstractScenario EOF ;
    public final void entryRuleAbstractScenario() throws RecognitionException {
        try {
            // InternalCucumber.g:104:1: ( ruleAbstractScenario EOF )
            // InternalCucumber.g:105:1: ruleAbstractScenario EOF
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
    // InternalCucumber.g:112:1: ruleAbstractScenario : ( ( rule__AbstractScenario__Alternatives ) ) ;
    public final void ruleAbstractScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:116:2: ( ( ( rule__AbstractScenario__Alternatives ) ) )
            // InternalCucumber.g:117:2: ( ( rule__AbstractScenario__Alternatives ) )
            {
            // InternalCucumber.g:117:2: ( ( rule__AbstractScenario__Alternatives ) )
            // InternalCucumber.g:118:3: ( rule__AbstractScenario__Alternatives )
            {
             before(grammarAccess.getAbstractScenarioAccess().getAlternatives()); 
            // InternalCucumber.g:119:3: ( rule__AbstractScenario__Alternatives )
            // InternalCucumber.g:119:4: rule__AbstractScenario__Alternatives
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


    // $ANTLR start "entryRuleExample"
    // InternalCucumber.g:178:1: entryRuleExample : ruleExample EOF ;
    public final void entryRuleExample() throws RecognitionException {
        try {
            // InternalCucumber.g:179:1: ( ruleExample EOF )
            // InternalCucumber.g:180:1: ruleExample EOF
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
    // InternalCucumber.g:187:1: ruleExample : ( ( rule__Example__Group__0 ) ) ;
    public final void ruleExample() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:191:2: ( ( ( rule__Example__Group__0 ) ) )
            // InternalCucumber.g:192:2: ( ( rule__Example__Group__0 ) )
            {
            // InternalCucumber.g:192:2: ( ( rule__Example__Group__0 ) )
            // InternalCucumber.g:193:3: ( rule__Example__Group__0 )
            {
             before(grammarAccess.getExampleAccess().getGroup()); 
            // InternalCucumber.g:194:3: ( rule__Example__Group__0 )
            // InternalCucumber.g:194:4: rule__Example__Group__0
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


    // $ANTLR start "entryRuleStep"
    // InternalCucumber.g:203:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalCucumber.g:204:1: ( ruleStep EOF )
            // InternalCucumber.g:205:1: ruleStep EOF
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
    // InternalCucumber.g:212:1: ruleStep : ( ( rule__Step__Group__0 ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:216:2: ( ( ( rule__Step__Group__0 ) ) )
            // InternalCucumber.g:217:2: ( ( rule__Step__Group__0 ) )
            {
            // InternalCucumber.g:217:2: ( ( rule__Step__Group__0 ) )
            // InternalCucumber.g:218:3: ( rule__Step__Group__0 )
            {
             before(grammarAccess.getStepAccess().getGroup()); 
            // InternalCucumber.g:219:3: ( rule__Step__Group__0 )
            // InternalCucumber.g:219:4: rule__Step__Group__0
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


    // $ANTLR start "entryRuleTable"
    // InternalCucumber.g:228:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalCucumber.g:229:1: ( ruleTable EOF )
            // InternalCucumber.g:230:1: ruleTable EOF
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
    // InternalCucumber.g:237:1: ruleTable : ( ( ( rule__Table__RowsAssignment ) ) ( ( rule__Table__RowsAssignment )* ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:241:2: ( ( ( ( rule__Table__RowsAssignment ) ) ( ( rule__Table__RowsAssignment )* ) ) )
            // InternalCucumber.g:242:2: ( ( ( rule__Table__RowsAssignment ) ) ( ( rule__Table__RowsAssignment )* ) )
            {
            // InternalCucumber.g:242:2: ( ( ( rule__Table__RowsAssignment ) ) ( ( rule__Table__RowsAssignment )* ) )
            // InternalCucumber.g:243:3: ( ( rule__Table__RowsAssignment ) ) ( ( rule__Table__RowsAssignment )* )
            {
            // InternalCucumber.g:243:3: ( ( rule__Table__RowsAssignment ) )
            // InternalCucumber.g:244:4: ( rule__Table__RowsAssignment )
            {
             before(grammarAccess.getTableAccess().getRowsAssignment()); 
            // InternalCucumber.g:245:4: ( rule__Table__RowsAssignment )
            // InternalCucumber.g:245:5: rule__Table__RowsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Table__RowsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getRowsAssignment()); 

            }

            // InternalCucumber.g:248:3: ( ( rule__Table__RowsAssignment )* )
            // InternalCucumber.g:249:4: ( rule__Table__RowsAssignment )*
            {
             before(grammarAccess.getTableAccess().getRowsAssignment()); 
            // InternalCucumber.g:250:4: ( rule__Table__RowsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCucumber.g:250:5: rule__Table__RowsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Table__RowsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getRowsAssignment()); 

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
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleTableRow"
    // InternalCucumber.g:260:1: entryRuleTableRow : ruleTableRow EOF ;
    public final void entryRuleTableRow() throws RecognitionException {
        try {
            // InternalCucumber.g:261:1: ( ruleTableRow EOF )
            // InternalCucumber.g:262:1: ruleTableRow EOF
            {
             before(grammarAccess.getTableRowRule()); 
            pushFollow(FOLLOW_1);
            ruleTableRow();

            state._fsp--;

             after(grammarAccess.getTableRowRule()); 
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
    // $ANTLR end "entryRuleTableRow"


    // $ANTLR start "ruleTableRow"
    // InternalCucumber.g:269:1: ruleTableRow : ( ( rule__TableRow__Group__0 ) ) ;
    public final void ruleTableRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:273:2: ( ( ( rule__TableRow__Group__0 ) ) )
            // InternalCucumber.g:274:2: ( ( rule__TableRow__Group__0 ) )
            {
            // InternalCucumber.g:274:2: ( ( rule__TableRow__Group__0 ) )
            // InternalCucumber.g:275:3: ( rule__TableRow__Group__0 )
            {
             before(grammarAccess.getTableRowAccess().getGroup()); 
            // InternalCucumber.g:276:3: ( rule__TableRow__Group__0 )
            // InternalCucumber.g:276:4: rule__TableRow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TableRow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableRowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTableRow"


    // $ANTLR start "entryRuleRowCell"
    // InternalCucumber.g:285:1: entryRuleRowCell : ruleRowCell EOF ;
    public final void entryRuleRowCell() throws RecognitionException {
        try {
            // InternalCucumber.g:286:1: ( ruleRowCell EOF )
            // InternalCucumber.g:287:1: ruleRowCell EOF
            {
             before(grammarAccess.getRowCellRule()); 
            pushFollow(FOLLOW_1);
            ruleRowCell();

            state._fsp--;

             after(grammarAccess.getRowCellRule()); 
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
    // $ANTLR end "entryRuleRowCell"


    // $ANTLR start "ruleRowCell"
    // InternalCucumber.g:294:1: ruleRowCell : ( ( rule__RowCell__Group__0 ) ) ;
    public final void ruleRowCell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:298:2: ( ( ( rule__RowCell__Group__0 ) ) )
            // InternalCucumber.g:299:2: ( ( rule__RowCell__Group__0 ) )
            {
            // InternalCucumber.g:299:2: ( ( rule__RowCell__Group__0 ) )
            // InternalCucumber.g:300:3: ( rule__RowCell__Group__0 )
            {
             before(grammarAccess.getRowCellAccess().getGroup()); 
            // InternalCucumber.g:301:3: ( rule__RowCell__Group__0 )
            // InternalCucumber.g:301:4: rule__RowCell__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RowCell__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRowCellAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRowCell"


    // $ANTLR start "entryRuleDocString"
    // InternalCucumber.g:310:1: entryRuleDocString : ruleDocString EOF ;
    public final void entryRuleDocString() throws RecognitionException {
        try {
            // InternalCucumber.g:311:1: ( ruleDocString EOF )
            // InternalCucumber.g:312:1: ruleDocString EOF
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
    // InternalCucumber.g:319:1: ruleDocString : ( ( rule__DocString__Group__0 ) ) ;
    public final void ruleDocString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:323:2: ( ( ( rule__DocString__Group__0 ) ) )
            // InternalCucumber.g:324:2: ( ( rule__DocString__Group__0 ) )
            {
            // InternalCucumber.g:324:2: ( ( rule__DocString__Group__0 ) )
            // InternalCucumber.g:325:3: ( rule__DocString__Group__0 )
            {
             before(grammarAccess.getDocStringAccess().getGroup()); 
            // InternalCucumber.g:326:3: ( rule__DocString__Group__0 )
            // InternalCucumber.g:326:4: rule__DocString__Group__0
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


    // $ANTLR start "entryRuleDescription"
    // InternalCucumber.g:335:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalCucumber.g:336:1: ( ruleDescription EOF )
            // InternalCucumber.g:337:1: ruleDescription EOF
            {
             before(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getDescriptionRule()); 
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
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalCucumber.g:344:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:348:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalCucumber.g:349:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalCucumber.g:349:2: ( ( rule__Description__Group__0 ) )
            // InternalCucumber.g:350:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalCucumber.g:351:3: ( rule__Description__Group__0 )
            // InternalCucumber.g:351:4: rule__Description__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleTags"
    // InternalCucumber.g:360:1: entryRuleTags : ruleTags EOF ;
    public final void entryRuleTags() throws RecognitionException {
        try {
            // InternalCucumber.g:361:1: ( ruleTags EOF )
            // InternalCucumber.g:362:1: ruleTags EOF
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
    // InternalCucumber.g:369:1: ruleTags : ( ( rule__Tags__Group__0 ) ) ;
    public final void ruleTags() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:373:2: ( ( ( rule__Tags__Group__0 ) ) )
            // InternalCucumber.g:374:2: ( ( rule__Tags__Group__0 ) )
            {
            // InternalCucumber.g:374:2: ( ( rule__Tags__Group__0 ) )
            // InternalCucumber.g:375:3: ( rule__Tags__Group__0 )
            {
             before(grammarAccess.getTagsAccess().getGroup()); 
            // InternalCucumber.g:376:3: ( rule__Tags__Group__0 )
            // InternalCucumber.g:376:4: rule__Tags__Group__0
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


    // $ANTLR start "entryRuleSentence"
    // InternalCucumber.g:385:1: entryRuleSentence : ruleSentence EOF ;
    public final void entryRuleSentence() throws RecognitionException {
        try {
            // InternalCucumber.g:386:1: ( ruleSentence EOF )
            // InternalCucumber.g:387:1: ruleSentence EOF
            {
             before(grammarAccess.getSentenceRule()); 
            pushFollow(FOLLOW_1);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getSentenceRule()); 
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
    // $ANTLR end "entryRuleSentence"


    // $ANTLR start "ruleSentence"
    // InternalCucumber.g:394:1: ruleSentence : ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) ) ;
    public final void ruleSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:398:2: ( ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) ) )
            // InternalCucumber.g:399:2: ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) )
            {
            // InternalCucumber.g:399:2: ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) )
            // InternalCucumber.g:400:3: ( ( RULE_WORD ) ) ( ( RULE_WORD )* )
            {
            // InternalCucumber.g:400:3: ( ( RULE_WORD ) )
            // InternalCucumber.g:401:4: ( RULE_WORD )
            {
             before(grammarAccess.getSentenceAccess().getWORDTerminalRuleCall()); 
            // InternalCucumber.g:402:4: ( RULE_WORD )
            // InternalCucumber.g:402:5: RULE_WORD
            {
            match(input,RULE_WORD,FOLLOW_4); 

            }

             after(grammarAccess.getSentenceAccess().getWORDTerminalRuleCall()); 

            }

            // InternalCucumber.g:405:3: ( ( RULE_WORD )* )
            // InternalCucumber.g:406:4: ( RULE_WORD )*
            {
             before(grammarAccess.getSentenceAccess().getWORDTerminalRuleCall()); 
            // InternalCucumber.g:407:4: ( RULE_WORD )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_WORD) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCucumber.g:407:5: RULE_WORD
            	    {
            	    match(input,RULE_WORD,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getSentenceAccess().getWORDTerminalRuleCall()); 

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
    // $ANTLR end "ruleSentence"


    // $ANTLR start "rule__AbstractScenario__Alternatives"
    // InternalCucumber.g:416:1: rule__AbstractScenario__Alternatives : ( ( ruleScenarioOutline ) | ( ruleScenario ) );
    public final void rule__AbstractScenario__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:420:1: ( ( ruleScenarioOutline ) | ( ruleScenario ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalCucumber.g:421:2: ( ruleScenarioOutline )
                    {
                    // InternalCucumber.g:421:2: ( ruleScenarioOutline )
                    // InternalCucumber.g:422:3: ruleScenarioOutline
                    {
                     before(grammarAccess.getAbstractScenarioAccess().getScenarioOutlineParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleScenarioOutline();

                    state._fsp--;

                     after(grammarAccess.getAbstractScenarioAccess().getScenarioOutlineParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:427:2: ( ruleScenario )
                    {
                    // InternalCucumber.g:427:2: ( ruleScenario )
                    // InternalCucumber.g:428:3: ruleScenario
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


    // $ANTLR start "rule__Step__Alternatives_0"
    // InternalCucumber.g:437:1: rule__Step__Alternatives_0 : ( ( 'Given' ) | ( 'When' ) | ( 'Then' ) | ( 'And' ) | ( 'But' ) | ( '*' ) );
    public final void rule__Step__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:441:1: ( ( 'Given' ) | ( 'When' ) | ( 'Then' ) | ( 'And' ) | ( 'But' ) | ( '*' ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 9:
                {
                alt4=1;
                }
                break;
            case 10:
                {
                alt4=2;
                }
                break;
            case 11:
                {
                alt4=3;
                }
                break;
            case 12:
                {
                alt4=4;
                }
                break;
            case 13:
                {
                alt4=5;
                }
                break;
            case 14:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalCucumber.g:442:2: ( 'Given' )
                    {
                    // InternalCucumber.g:442:2: ( 'Given' )
                    // InternalCucumber.g:443:3: 'Given'
                    {
                     before(grammarAccess.getStepAccess().getGivenKeyword_0_0()); 
                    match(input,9,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getGivenKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:448:2: ( 'When' )
                    {
                    // InternalCucumber.g:448:2: ( 'When' )
                    // InternalCucumber.g:449:3: 'When'
                    {
                     before(grammarAccess.getStepAccess().getWhenKeyword_0_1()); 
                    match(input,10,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getWhenKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCucumber.g:454:2: ( 'Then' )
                    {
                    // InternalCucumber.g:454:2: ( 'Then' )
                    // InternalCucumber.g:455:3: 'Then'
                    {
                     before(grammarAccess.getStepAccess().getThenKeyword_0_2()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getThenKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCucumber.g:460:2: ( 'And' )
                    {
                    // InternalCucumber.g:460:2: ( 'And' )
                    // InternalCucumber.g:461:3: 'And'
                    {
                     before(grammarAccess.getStepAccess().getAndKeyword_0_3()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getAndKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCucumber.g:466:2: ( 'But' )
                    {
                    // InternalCucumber.g:466:2: ( 'But' )
                    // InternalCucumber.g:467:3: 'But'
                    {
                     before(grammarAccess.getStepAccess().getButKeyword_0_4()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getButKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCucumber.g:472:2: ( '*' )
                    {
                    // InternalCucumber.g:472:2: ( '*' )
                    // InternalCucumber.g:473:3: '*'
                    {
                     before(grammarAccess.getStepAccess().getAsteriskKeyword_0_5()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getAsteriskKeyword_0_5()); 

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
    // InternalCucumber.g:482:1: rule__Step__Alternatives_3 : ( ( ( rule__Step__TableAssignment_3_0 ) ) | ( ( rule__Step__TextAssignment_3_1 ) ) );
    public final void rule__Step__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:486:1: ( ( ( rule__Step__TableAssignment_3_0 ) ) | ( ( rule__Step__TextAssignment_3_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
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
                    // InternalCucumber.g:487:2: ( ( rule__Step__TableAssignment_3_0 ) )
                    {
                    // InternalCucumber.g:487:2: ( ( rule__Step__TableAssignment_3_0 ) )
                    // InternalCucumber.g:488:3: ( rule__Step__TableAssignment_3_0 )
                    {
                     before(grammarAccess.getStepAccess().getTableAssignment_3_0()); 
                    // InternalCucumber.g:489:3: ( rule__Step__TableAssignment_3_0 )
                    // InternalCucumber.g:489:4: rule__Step__TableAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Step__TableAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStepAccess().getTableAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:493:2: ( ( rule__Step__TextAssignment_3_1 ) )
                    {
                    // InternalCucumber.g:493:2: ( ( rule__Step__TextAssignment_3_1 ) )
                    // InternalCucumber.g:494:3: ( rule__Step__TextAssignment_3_1 )
                    {
                     before(grammarAccess.getStepAccess().getTextAssignment_3_1()); 
                    // InternalCucumber.g:495:3: ( rule__Step__TextAssignment_3_1 )
                    // InternalCucumber.g:495:4: rule__Step__TextAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Step__TextAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStepAccess().getTextAssignment_3_1()); 

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


    // $ANTLR start "rule__DocString__Alternatives_2"
    // InternalCucumber.g:503:1: rule__DocString__Alternatives_2 : ( ( ruleSentence ) | ( RULE_EOL ) );
    public final void rule__DocString__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:507:1: ( ( ruleSentence ) | ( RULE_EOL ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_WORD) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_EOL) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCucumber.g:508:2: ( ruleSentence )
                    {
                    // InternalCucumber.g:508:2: ( ruleSentence )
                    // InternalCucumber.g:509:3: ruleSentence
                    {
                     before(grammarAccess.getDocStringAccess().getSentenceParserRuleCall_2_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSentence();

                    state._fsp--;

                     after(grammarAccess.getDocStringAccess().getSentenceParserRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:514:2: ( RULE_EOL )
                    {
                    // InternalCucumber.g:514:2: ( RULE_EOL )
                    // InternalCucumber.g:515:3: RULE_EOL
                    {
                     before(grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_2_1()); 
                    match(input,RULE_EOL,FOLLOW_2); 
                     after(grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_2_1()); 

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
    // $ANTLR end "rule__DocString__Alternatives_2"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalCucumber.g:524:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:528:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalCucumber.g:529:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
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
    // InternalCucumber.g:536:1: rule__Feature__Group__0__Impl : ( ruleTags ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:540:1: ( ( ruleTags ) )
            // InternalCucumber.g:541:1: ( ruleTags )
            {
            // InternalCucumber.g:541:1: ( ruleTags )
            // InternalCucumber.g:542:2: ruleTags
            {
             before(grammarAccess.getFeatureAccess().getTagsParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTags();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getTagsParserRuleCall_0()); 

            }


            }

        }
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
    // InternalCucumber.g:551:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:555:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalCucumber.g:556:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
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
    // InternalCucumber.g:563:1: rule__Feature__Group__1__Impl : ( 'Feature:' ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:567:1: ( ( 'Feature:' ) )
            // InternalCucumber.g:568:1: ( 'Feature:' )
            {
            // InternalCucumber.g:568:1: ( 'Feature:' )
            // InternalCucumber.g:569:2: 'Feature:'
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
    // InternalCucumber.g:578:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:582:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalCucumber.g:583:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
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
    // InternalCucumber.g:590:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__TitleAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:594:1: ( ( ( rule__Feature__TitleAssignment_2 ) ) )
            // InternalCucumber.g:595:1: ( ( rule__Feature__TitleAssignment_2 ) )
            {
            // InternalCucumber.g:595:1: ( ( rule__Feature__TitleAssignment_2 ) )
            // InternalCucumber.g:596:2: ( rule__Feature__TitleAssignment_2 )
            {
             before(grammarAccess.getFeatureAccess().getTitleAssignment_2()); 
            // InternalCucumber.g:597:2: ( rule__Feature__TitleAssignment_2 )
            // InternalCucumber.g:597:3: rule__Feature__TitleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Feature__TitleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTitleAssignment_2()); 

            }


            }

        }
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
    // InternalCucumber.g:605:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:609:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalCucumber.g:610:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
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
    // InternalCucumber.g:617:1: rule__Feature__Group__3__Impl : ( ( RULE_EOL )? ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:621:1: ( ( ( RULE_EOL )? ) )
            // InternalCucumber.g:622:1: ( ( RULE_EOL )? )
            {
            // InternalCucumber.g:622:1: ( ( RULE_EOL )? )
            // InternalCucumber.g:623:2: ( RULE_EOL )?
            {
             before(grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_3()); 
            // InternalCucumber.g:624:2: ( RULE_EOL )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_EOL) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCucumber.g:624:3: RULE_EOL
                    {
                    match(input,RULE_EOL,FOLLOW_2); 

                    }
                    break;

            }

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
    // InternalCucumber.g:632:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl rule__Feature__Group__5 ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:636:1: ( rule__Feature__Group__4__Impl rule__Feature__Group__5 )
            // InternalCucumber.g:637:2: rule__Feature__Group__4__Impl rule__Feature__Group__5
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
    // InternalCucumber.g:644:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__DescriptionAssignment_4 ) ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:648:1: ( ( ( rule__Feature__DescriptionAssignment_4 ) ) )
            // InternalCucumber.g:649:1: ( ( rule__Feature__DescriptionAssignment_4 ) )
            {
            // InternalCucumber.g:649:1: ( ( rule__Feature__DescriptionAssignment_4 ) )
            // InternalCucumber.g:650:2: ( rule__Feature__DescriptionAssignment_4 )
            {
             before(grammarAccess.getFeatureAccess().getDescriptionAssignment_4()); 
            // InternalCucumber.g:651:2: ( rule__Feature__DescriptionAssignment_4 )
            // InternalCucumber.g:651:3: rule__Feature__DescriptionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Feature__DescriptionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getDescriptionAssignment_4()); 

            }


            }

        }
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
    // InternalCucumber.g:659:1: rule__Feature__Group__5 : rule__Feature__Group__5__Impl rule__Feature__Group__6 ;
    public final void rule__Feature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:663:1: ( rule__Feature__Group__5__Impl rule__Feature__Group__6 )
            // InternalCucumber.g:664:2: rule__Feature__Group__5__Impl rule__Feature__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalCucumber.g:671:1: rule__Feature__Group__5__Impl : ( ( rule__Feature__BackgroundAssignment_5 )? ) ;
    public final void rule__Feature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:675:1: ( ( ( rule__Feature__BackgroundAssignment_5 )? ) )
            // InternalCucumber.g:676:1: ( ( rule__Feature__BackgroundAssignment_5 )? )
            {
            // InternalCucumber.g:676:1: ( ( rule__Feature__BackgroundAssignment_5 )? )
            // InternalCucumber.g:677:2: ( rule__Feature__BackgroundAssignment_5 )?
            {
             before(grammarAccess.getFeatureAccess().getBackgroundAssignment_5()); 
            // InternalCucumber.g:678:2: ( rule__Feature__BackgroundAssignment_5 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCucumber.g:678:3: rule__Feature__BackgroundAssignment_5
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
    // InternalCucumber.g:686:1: rule__Feature__Group__6 : rule__Feature__Group__6__Impl ;
    public final void rule__Feature__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:690:1: ( rule__Feature__Group__6__Impl )
            // InternalCucumber.g:691:2: rule__Feature__Group__6__Impl
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
    // InternalCucumber.g:697:1: rule__Feature__Group__6__Impl : ( ( rule__Feature__ScenariosAssignment_6 )* ) ;
    public final void rule__Feature__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:701:1: ( ( ( rule__Feature__ScenariosAssignment_6 )* ) )
            // InternalCucumber.g:702:1: ( ( rule__Feature__ScenariosAssignment_6 )* )
            {
            // InternalCucumber.g:702:1: ( ( rule__Feature__ScenariosAssignment_6 )* )
            // InternalCucumber.g:703:2: ( rule__Feature__ScenariosAssignment_6 )*
            {
             before(grammarAccess.getFeatureAccess().getScenariosAssignment_6()); 
            // InternalCucumber.g:704:2: ( rule__Feature__ScenariosAssignment_6 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_EOL && LA9_0<=RULE_TAG)||(LA9_0>=17 && LA9_0<=18)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCucumber.g:704:3: rule__Feature__ScenariosAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Feature__ScenariosAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalCucumber.g:713:1: rule__Background__Group__0 : rule__Background__Group__0__Impl rule__Background__Group__1 ;
    public final void rule__Background__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:717:1: ( rule__Background__Group__0__Impl rule__Background__Group__1 )
            // InternalCucumber.g:718:2: rule__Background__Group__0__Impl rule__Background__Group__1
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
    // InternalCucumber.g:725:1: rule__Background__Group__0__Impl : ( 'Background:' ) ;
    public final void rule__Background__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:729:1: ( ( 'Background:' ) )
            // InternalCucumber.g:730:1: ( 'Background:' )
            {
            // InternalCucumber.g:730:1: ( 'Background:' )
            // InternalCucumber.g:731:2: 'Background:'
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
    // InternalCucumber.g:740:1: rule__Background__Group__1 : rule__Background__Group__1__Impl rule__Background__Group__2 ;
    public final void rule__Background__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:744:1: ( rule__Background__Group__1__Impl rule__Background__Group__2 )
            // InternalCucumber.g:745:2: rule__Background__Group__1__Impl rule__Background__Group__2
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
    // InternalCucumber.g:752:1: rule__Background__Group__1__Impl : ( ( rule__Background__TitleAssignment_1 ) ) ;
    public final void rule__Background__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:756:1: ( ( ( rule__Background__TitleAssignment_1 ) ) )
            // InternalCucumber.g:757:1: ( ( rule__Background__TitleAssignment_1 ) )
            {
            // InternalCucumber.g:757:1: ( ( rule__Background__TitleAssignment_1 ) )
            // InternalCucumber.g:758:2: ( rule__Background__TitleAssignment_1 )
            {
             before(grammarAccess.getBackgroundAccess().getTitleAssignment_1()); 
            // InternalCucumber.g:759:2: ( rule__Background__TitleAssignment_1 )
            // InternalCucumber.g:759:3: rule__Background__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Background__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBackgroundAccess().getTitleAssignment_1()); 

            }


            }

        }
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
    // InternalCucumber.g:767:1: rule__Background__Group__2 : rule__Background__Group__2__Impl rule__Background__Group__3 ;
    public final void rule__Background__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:771:1: ( rule__Background__Group__2__Impl rule__Background__Group__3 )
            // InternalCucumber.g:772:2: rule__Background__Group__2__Impl rule__Background__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalCucumber.g:779:1: rule__Background__Group__2__Impl : ( ( RULE_EOL )? ) ;
    public final void rule__Background__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:783:1: ( ( ( RULE_EOL )? ) )
            // InternalCucumber.g:784:1: ( ( RULE_EOL )? )
            {
            // InternalCucumber.g:784:1: ( ( RULE_EOL )? )
            // InternalCucumber.g:785:2: ( RULE_EOL )?
            {
             before(grammarAccess.getBackgroundAccess().getEOLTerminalRuleCall_2()); 
            // InternalCucumber.g:786:2: ( RULE_EOL )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_EOL) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCucumber.g:786:3: RULE_EOL
                    {
                    match(input,RULE_EOL,FOLLOW_2); 

                    }
                    break;

            }

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
    // InternalCucumber.g:794:1: rule__Background__Group__3 : rule__Background__Group__3__Impl rule__Background__Group__4 ;
    public final void rule__Background__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:798:1: ( rule__Background__Group__3__Impl rule__Background__Group__4 )
            // InternalCucumber.g:799:2: rule__Background__Group__3__Impl rule__Background__Group__4
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
    // InternalCucumber.g:806:1: rule__Background__Group__3__Impl : ( ( rule__Background__DescriptionAssignment_3 ) ) ;
    public final void rule__Background__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:810:1: ( ( ( rule__Background__DescriptionAssignment_3 ) ) )
            // InternalCucumber.g:811:1: ( ( rule__Background__DescriptionAssignment_3 ) )
            {
            // InternalCucumber.g:811:1: ( ( rule__Background__DescriptionAssignment_3 ) )
            // InternalCucumber.g:812:2: ( rule__Background__DescriptionAssignment_3 )
            {
             before(grammarAccess.getBackgroundAccess().getDescriptionAssignment_3()); 
            // InternalCucumber.g:813:2: ( rule__Background__DescriptionAssignment_3 )
            // InternalCucumber.g:813:3: rule__Background__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Background__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBackgroundAccess().getDescriptionAssignment_3()); 

            }


            }

        }
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
    // InternalCucumber.g:821:1: rule__Background__Group__4 : rule__Background__Group__4__Impl ;
    public final void rule__Background__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:825:1: ( rule__Background__Group__4__Impl )
            // InternalCucumber.g:826:2: rule__Background__Group__4__Impl
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
    // InternalCucumber.g:832:1: rule__Background__Group__4__Impl : ( ( rule__Background__StepsAssignment_4 )* ) ;
    public final void rule__Background__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:836:1: ( ( ( rule__Background__StepsAssignment_4 )* ) )
            // InternalCucumber.g:837:1: ( ( rule__Background__StepsAssignment_4 )* )
            {
            // InternalCucumber.g:837:1: ( ( rule__Background__StepsAssignment_4 )* )
            // InternalCucumber.g:838:2: ( rule__Background__StepsAssignment_4 )*
            {
             before(grammarAccess.getBackgroundAccess().getStepsAssignment_4()); 
            // InternalCucumber.g:839:2: ( rule__Background__StepsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=9 && LA11_0<=14)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCucumber.g:839:3: rule__Background__StepsAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Background__StepsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalCucumber.g:848:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:852:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalCucumber.g:853:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
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
    // InternalCucumber.g:860:1: rule__Scenario__Group__0__Impl : ( ruleTags ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:864:1: ( ( ruleTags ) )
            // InternalCucumber.g:865:1: ( ruleTags )
            {
            // InternalCucumber.g:865:1: ( ruleTags )
            // InternalCucumber.g:866:2: ruleTags
            {
             before(grammarAccess.getScenarioAccess().getTagsParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTags();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getTagsParserRuleCall_0()); 

            }


            }

        }
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
    // InternalCucumber.g:875:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:879:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalCucumber.g:880:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
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
    // InternalCucumber.g:887:1: rule__Scenario__Group__1__Impl : ( 'Scenario:' ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:891:1: ( ( 'Scenario:' ) )
            // InternalCucumber.g:892:1: ( 'Scenario:' )
            {
            // InternalCucumber.g:892:1: ( 'Scenario:' )
            // InternalCucumber.g:893:2: 'Scenario:'
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
    // InternalCucumber.g:902:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:906:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // InternalCucumber.g:907:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
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
    // InternalCucumber.g:914:1: rule__Scenario__Group__2__Impl : ( ( rule__Scenario__TitleAssignment_2 ) ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:918:1: ( ( ( rule__Scenario__TitleAssignment_2 ) ) )
            // InternalCucumber.g:919:1: ( ( rule__Scenario__TitleAssignment_2 ) )
            {
            // InternalCucumber.g:919:1: ( ( rule__Scenario__TitleAssignment_2 ) )
            // InternalCucumber.g:920:2: ( rule__Scenario__TitleAssignment_2 )
            {
             before(grammarAccess.getScenarioAccess().getTitleAssignment_2()); 
            // InternalCucumber.g:921:2: ( rule__Scenario__TitleAssignment_2 )
            // InternalCucumber.g:921:3: rule__Scenario__TitleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__TitleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getTitleAssignment_2()); 

            }


            }

        }
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
    // InternalCucumber.g:929:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl rule__Scenario__Group__4 ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:933:1: ( rule__Scenario__Group__3__Impl rule__Scenario__Group__4 )
            // InternalCucumber.g:934:2: rule__Scenario__Group__3__Impl rule__Scenario__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalCucumber.g:941:1: rule__Scenario__Group__3__Impl : ( ( RULE_EOL )? ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:945:1: ( ( ( RULE_EOL )? ) )
            // InternalCucumber.g:946:1: ( ( RULE_EOL )? )
            {
            // InternalCucumber.g:946:1: ( ( RULE_EOL )? )
            // InternalCucumber.g:947:2: ( RULE_EOL )?
            {
             before(grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_3()); 
            // InternalCucumber.g:948:2: ( RULE_EOL )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_EOL) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCucumber.g:948:3: RULE_EOL
                    {
                    match(input,RULE_EOL,FOLLOW_2); 

                    }
                    break;

            }

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
    // InternalCucumber.g:956:1: rule__Scenario__Group__4 : rule__Scenario__Group__4__Impl rule__Scenario__Group__5 ;
    public final void rule__Scenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:960:1: ( rule__Scenario__Group__4__Impl rule__Scenario__Group__5 )
            // InternalCucumber.g:961:2: rule__Scenario__Group__4__Impl rule__Scenario__Group__5
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
    // InternalCucumber.g:968:1: rule__Scenario__Group__4__Impl : ( ( rule__Scenario__DescriptionAssignment_4 ) ) ;
    public final void rule__Scenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:972:1: ( ( ( rule__Scenario__DescriptionAssignment_4 ) ) )
            // InternalCucumber.g:973:1: ( ( rule__Scenario__DescriptionAssignment_4 ) )
            {
            // InternalCucumber.g:973:1: ( ( rule__Scenario__DescriptionAssignment_4 ) )
            // InternalCucumber.g:974:2: ( rule__Scenario__DescriptionAssignment_4 )
            {
             before(grammarAccess.getScenarioAccess().getDescriptionAssignment_4()); 
            // InternalCucumber.g:975:2: ( rule__Scenario__DescriptionAssignment_4 )
            // InternalCucumber.g:975:3: rule__Scenario__DescriptionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__DescriptionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getDescriptionAssignment_4()); 

            }


            }

        }
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
    // InternalCucumber.g:983:1: rule__Scenario__Group__5 : rule__Scenario__Group__5__Impl ;
    public final void rule__Scenario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:987:1: ( rule__Scenario__Group__5__Impl )
            // InternalCucumber.g:988:2: rule__Scenario__Group__5__Impl
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
    // InternalCucumber.g:994:1: rule__Scenario__Group__5__Impl : ( ( rule__Scenario__StepsAssignment_5 )* ) ;
    public final void rule__Scenario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:998:1: ( ( ( rule__Scenario__StepsAssignment_5 )* ) )
            // InternalCucumber.g:999:1: ( ( rule__Scenario__StepsAssignment_5 )* )
            {
            // InternalCucumber.g:999:1: ( ( rule__Scenario__StepsAssignment_5 )* )
            // InternalCucumber.g:1000:2: ( rule__Scenario__StepsAssignment_5 )*
            {
             before(grammarAccess.getScenarioAccess().getStepsAssignment_5()); 
            // InternalCucumber.g:1001:2: ( rule__Scenario__StepsAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=9 && LA13_0<=14)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCucumber.g:1001:3: rule__Scenario__StepsAssignment_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Scenario__StepsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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


    // $ANTLR start "rule__ScenarioOutline__Group__0"
    // InternalCucumber.g:1010:1: rule__ScenarioOutline__Group__0 : rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1 ;
    public final void rule__ScenarioOutline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1014:1: ( rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1 )
            // InternalCucumber.g:1015:2: rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1
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
    // InternalCucumber.g:1022:1: rule__ScenarioOutline__Group__0__Impl : ( ruleTags ) ;
    public final void rule__ScenarioOutline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1026:1: ( ( ruleTags ) )
            // InternalCucumber.g:1027:1: ( ruleTags )
            {
            // InternalCucumber.g:1027:1: ( ruleTags )
            // InternalCucumber.g:1028:2: ruleTags
            {
             before(grammarAccess.getScenarioOutlineAccess().getTagsParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTags();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getTagsParserRuleCall_0()); 

            }


            }

        }
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
    // InternalCucumber.g:1037:1: rule__ScenarioOutline__Group__1 : rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2 ;
    public final void rule__ScenarioOutline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1041:1: ( rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2 )
            // InternalCucumber.g:1042:2: rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2
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
    // InternalCucumber.g:1049:1: rule__ScenarioOutline__Group__1__Impl : ( 'Scenario Outline:' ) ;
    public final void rule__ScenarioOutline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1053:1: ( ( 'Scenario Outline:' ) )
            // InternalCucumber.g:1054:1: ( 'Scenario Outline:' )
            {
            // InternalCucumber.g:1054:1: ( 'Scenario Outline:' )
            // InternalCucumber.g:1055:2: 'Scenario Outline:'
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
    // InternalCucumber.g:1064:1: rule__ScenarioOutline__Group__2 : rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3 ;
    public final void rule__ScenarioOutline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1068:1: ( rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3 )
            // InternalCucumber.g:1069:2: rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3
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
    // InternalCucumber.g:1076:1: rule__ScenarioOutline__Group__2__Impl : ( ( rule__ScenarioOutline__TitleAssignment_2 ) ) ;
    public final void rule__ScenarioOutline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1080:1: ( ( ( rule__ScenarioOutline__TitleAssignment_2 ) ) )
            // InternalCucumber.g:1081:1: ( ( rule__ScenarioOutline__TitleAssignment_2 ) )
            {
            // InternalCucumber.g:1081:1: ( ( rule__ScenarioOutline__TitleAssignment_2 ) )
            // InternalCucumber.g:1082:2: ( rule__ScenarioOutline__TitleAssignment_2 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getTitleAssignment_2()); 
            // InternalCucumber.g:1083:2: ( rule__ScenarioOutline__TitleAssignment_2 )
            // InternalCucumber.g:1083:3: rule__ScenarioOutline__TitleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__TitleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getTitleAssignment_2()); 

            }


            }

        }
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
    // InternalCucumber.g:1091:1: rule__ScenarioOutline__Group__3 : rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4 ;
    public final void rule__ScenarioOutline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1095:1: ( rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4 )
            // InternalCucumber.g:1096:2: rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalCucumber.g:1103:1: rule__ScenarioOutline__Group__3__Impl : ( ( RULE_EOL )? ) ;
    public final void rule__ScenarioOutline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1107:1: ( ( ( RULE_EOL )? ) )
            // InternalCucumber.g:1108:1: ( ( RULE_EOL )? )
            {
            // InternalCucumber.g:1108:1: ( ( RULE_EOL )? )
            // InternalCucumber.g:1109:2: ( RULE_EOL )?
            {
             before(grammarAccess.getScenarioOutlineAccess().getEOLTerminalRuleCall_3()); 
            // InternalCucumber.g:1110:2: ( RULE_EOL )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_EOL) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCucumber.g:1110:3: RULE_EOL
                    {
                    match(input,RULE_EOL,FOLLOW_2); 

                    }
                    break;

            }

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
    // InternalCucumber.g:1118:1: rule__ScenarioOutline__Group__4 : rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5 ;
    public final void rule__ScenarioOutline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1122:1: ( rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5 )
            // InternalCucumber.g:1123:2: rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5
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
    // InternalCucumber.g:1130:1: rule__ScenarioOutline__Group__4__Impl : ( ( rule__ScenarioOutline__DescriptionAssignment_4 ) ) ;
    public final void rule__ScenarioOutline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1134:1: ( ( ( rule__ScenarioOutline__DescriptionAssignment_4 ) ) )
            // InternalCucumber.g:1135:1: ( ( rule__ScenarioOutline__DescriptionAssignment_4 ) )
            {
            // InternalCucumber.g:1135:1: ( ( rule__ScenarioOutline__DescriptionAssignment_4 ) )
            // InternalCucumber.g:1136:2: ( rule__ScenarioOutline__DescriptionAssignment_4 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getDescriptionAssignment_4()); 
            // InternalCucumber.g:1137:2: ( rule__ScenarioOutline__DescriptionAssignment_4 )
            // InternalCucumber.g:1137:3: rule__ScenarioOutline__DescriptionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__DescriptionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getDescriptionAssignment_4()); 

            }


            }

        }
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
    // InternalCucumber.g:1145:1: rule__ScenarioOutline__Group__5 : rule__ScenarioOutline__Group__5__Impl rule__ScenarioOutline__Group__6 ;
    public final void rule__ScenarioOutline__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1149:1: ( rule__ScenarioOutline__Group__5__Impl rule__ScenarioOutline__Group__6 )
            // InternalCucumber.g:1150:2: rule__ScenarioOutline__Group__5__Impl rule__ScenarioOutline__Group__6
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
    // InternalCucumber.g:1157:1: rule__ScenarioOutline__Group__5__Impl : ( ( rule__ScenarioOutline__StepsAssignment_5 )* ) ;
    public final void rule__ScenarioOutline__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1161:1: ( ( ( rule__ScenarioOutline__StepsAssignment_5 )* ) )
            // InternalCucumber.g:1162:1: ( ( rule__ScenarioOutline__StepsAssignment_5 )* )
            {
            // InternalCucumber.g:1162:1: ( ( rule__ScenarioOutline__StepsAssignment_5 )* )
            // InternalCucumber.g:1163:2: ( rule__ScenarioOutline__StepsAssignment_5 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getStepsAssignment_5()); 
            // InternalCucumber.g:1164:2: ( rule__ScenarioOutline__StepsAssignment_5 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=9 && LA15_0<=14)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCucumber.g:1164:3: rule__ScenarioOutline__StepsAssignment_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ScenarioOutline__StepsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalCucumber.g:1172:1: rule__ScenarioOutline__Group__6 : rule__ScenarioOutline__Group__6__Impl ;
    public final void rule__ScenarioOutline__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1176:1: ( rule__ScenarioOutline__Group__6__Impl )
            // InternalCucumber.g:1177:2: rule__ScenarioOutline__Group__6__Impl
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
    // InternalCucumber.g:1183:1: rule__ScenarioOutline__Group__6__Impl : ( ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* ) ) ;
    public final void rule__ScenarioOutline__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1187:1: ( ( ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* ) ) )
            // InternalCucumber.g:1188:1: ( ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* ) )
            {
            // InternalCucumber.g:1188:1: ( ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* ) )
            // InternalCucumber.g:1189:2: ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* )
            {
            // InternalCucumber.g:1189:2: ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) )
            // InternalCucumber.g:1190:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_6()); 
            // InternalCucumber.g:1191:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )
            // InternalCucumber.g:1191:4: rule__ScenarioOutline__ExamplesAssignment_6
            {
            pushFollow(FOLLOW_15);
            rule__ScenarioOutline__ExamplesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_6()); 

            }

            // InternalCucumber.g:1194:2: ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* )
            // InternalCucumber.g:1195:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_6()); 
            // InternalCucumber.g:1196:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )*
            loop16:
            do {
                int alt16=2;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // InternalCucumber.g:1196:4: rule__ScenarioOutline__ExamplesAssignment_6
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ScenarioOutline__ExamplesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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


    // $ANTLR start "rule__Example__Group__0"
    // InternalCucumber.g:1206:1: rule__Example__Group__0 : rule__Example__Group__0__Impl rule__Example__Group__1 ;
    public final void rule__Example__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1210:1: ( rule__Example__Group__0__Impl rule__Example__Group__1 )
            // InternalCucumber.g:1211:2: rule__Example__Group__0__Impl rule__Example__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalCucumber.g:1218:1: rule__Example__Group__0__Impl : ( ruleTags ) ;
    public final void rule__Example__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1222:1: ( ( ruleTags ) )
            // InternalCucumber.g:1223:1: ( ruleTags )
            {
            // InternalCucumber.g:1223:1: ( ruleTags )
            // InternalCucumber.g:1224:2: ruleTags
            {
             before(grammarAccess.getExampleAccess().getTagsParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTags();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getTagsParserRuleCall_0()); 

            }


            }

        }
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
    // InternalCucumber.g:1233:1: rule__Example__Group__1 : rule__Example__Group__1__Impl rule__Example__Group__2 ;
    public final void rule__Example__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1237:1: ( rule__Example__Group__1__Impl rule__Example__Group__2 )
            // InternalCucumber.g:1238:2: rule__Example__Group__1__Impl rule__Example__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalCucumber.g:1245:1: rule__Example__Group__1__Impl : ( 'Examples:' ) ;
    public final void rule__Example__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1249:1: ( ( 'Examples:' ) )
            // InternalCucumber.g:1250:1: ( 'Examples:' )
            {
            // InternalCucumber.g:1250:1: ( 'Examples:' )
            // InternalCucumber.g:1251:2: 'Examples:'
            {
             before(grammarAccess.getExampleAccess().getExamplesKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalCucumber.g:1260:1: rule__Example__Group__2 : rule__Example__Group__2__Impl rule__Example__Group__3 ;
    public final void rule__Example__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1264:1: ( rule__Example__Group__2__Impl rule__Example__Group__3 )
            // InternalCucumber.g:1265:2: rule__Example__Group__2__Impl rule__Example__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalCucumber.g:1272:1: rule__Example__Group__2__Impl : ( ( rule__Example__TitleAssignment_2 ) ) ;
    public final void rule__Example__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1276:1: ( ( ( rule__Example__TitleAssignment_2 ) ) )
            // InternalCucumber.g:1277:1: ( ( rule__Example__TitleAssignment_2 ) )
            {
            // InternalCucumber.g:1277:1: ( ( rule__Example__TitleAssignment_2 ) )
            // InternalCucumber.g:1278:2: ( rule__Example__TitleAssignment_2 )
            {
             before(grammarAccess.getExampleAccess().getTitleAssignment_2()); 
            // InternalCucumber.g:1279:2: ( rule__Example__TitleAssignment_2 )
            // InternalCucumber.g:1279:3: rule__Example__TitleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Example__TitleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getTitleAssignment_2()); 

            }


            }

        }
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
    // InternalCucumber.g:1287:1: rule__Example__Group__3 : rule__Example__Group__3__Impl rule__Example__Group__4 ;
    public final void rule__Example__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1291:1: ( rule__Example__Group__3__Impl rule__Example__Group__4 )
            // InternalCucumber.g:1292:2: rule__Example__Group__3__Impl rule__Example__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalCucumber.g:1299:1: rule__Example__Group__3__Impl : ( ( RULE_EOL )? ) ;
    public final void rule__Example__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1303:1: ( ( ( RULE_EOL )? ) )
            // InternalCucumber.g:1304:1: ( ( RULE_EOL )? )
            {
            // InternalCucumber.g:1304:1: ( ( RULE_EOL )? )
            // InternalCucumber.g:1305:2: ( RULE_EOL )?
            {
             before(grammarAccess.getExampleAccess().getEOLTerminalRuleCall_3()); 
            // InternalCucumber.g:1306:2: ( RULE_EOL )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_EOL) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCucumber.g:1306:3: RULE_EOL
                    {
                    match(input,RULE_EOL,FOLLOW_2); 

                    }
                    break;

            }

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
    // InternalCucumber.g:1314:1: rule__Example__Group__4 : rule__Example__Group__4__Impl rule__Example__Group__5 ;
    public final void rule__Example__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1318:1: ( rule__Example__Group__4__Impl rule__Example__Group__5 )
            // InternalCucumber.g:1319:2: rule__Example__Group__4__Impl rule__Example__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalCucumber.g:1326:1: rule__Example__Group__4__Impl : ( ( rule__Example__DescriptionAssignment_4 ) ) ;
    public final void rule__Example__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1330:1: ( ( ( rule__Example__DescriptionAssignment_4 ) ) )
            // InternalCucumber.g:1331:1: ( ( rule__Example__DescriptionAssignment_4 ) )
            {
            // InternalCucumber.g:1331:1: ( ( rule__Example__DescriptionAssignment_4 ) )
            // InternalCucumber.g:1332:2: ( rule__Example__DescriptionAssignment_4 )
            {
             before(grammarAccess.getExampleAccess().getDescriptionAssignment_4()); 
            // InternalCucumber.g:1333:2: ( rule__Example__DescriptionAssignment_4 )
            // InternalCucumber.g:1333:3: rule__Example__DescriptionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Example__DescriptionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getDescriptionAssignment_4()); 

            }


            }

        }
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
    // InternalCucumber.g:1341:1: rule__Example__Group__5 : rule__Example__Group__5__Impl ;
    public final void rule__Example__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1345:1: ( rule__Example__Group__5__Impl )
            // InternalCucumber.g:1346:2: rule__Example__Group__5__Impl
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
    // InternalCucumber.g:1352:1: rule__Example__Group__5__Impl : ( ( rule__Example__TableAssignment_5 ) ) ;
    public final void rule__Example__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1356:1: ( ( ( rule__Example__TableAssignment_5 ) ) )
            // InternalCucumber.g:1357:1: ( ( rule__Example__TableAssignment_5 ) )
            {
            // InternalCucumber.g:1357:1: ( ( rule__Example__TableAssignment_5 ) )
            // InternalCucumber.g:1358:2: ( rule__Example__TableAssignment_5 )
            {
             before(grammarAccess.getExampleAccess().getTableAssignment_5()); 
            // InternalCucumber.g:1359:2: ( rule__Example__TableAssignment_5 )
            // InternalCucumber.g:1359:3: rule__Example__TableAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Example__TableAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getTableAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Step__Group__0"
    // InternalCucumber.g:1368:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1372:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // InternalCucumber.g:1373:2: rule__Step__Group__0__Impl rule__Step__Group__1
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
    // InternalCucumber.g:1380:1: rule__Step__Group__0__Impl : ( ( rule__Step__Alternatives_0 ) ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1384:1: ( ( ( rule__Step__Alternatives_0 ) ) )
            // InternalCucumber.g:1385:1: ( ( rule__Step__Alternatives_0 ) )
            {
            // InternalCucumber.g:1385:1: ( ( rule__Step__Alternatives_0 ) )
            // InternalCucumber.g:1386:2: ( rule__Step__Alternatives_0 )
            {
             before(grammarAccess.getStepAccess().getAlternatives_0()); 
            // InternalCucumber.g:1387:2: ( rule__Step__Alternatives_0 )
            // InternalCucumber.g:1387:3: rule__Step__Alternatives_0
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
    // InternalCucumber.g:1395:1: rule__Step__Group__1 : rule__Step__Group__1__Impl rule__Step__Group__2 ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1399:1: ( rule__Step__Group__1__Impl rule__Step__Group__2 )
            // InternalCucumber.g:1400:2: rule__Step__Group__1__Impl rule__Step__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalCucumber.g:1407:1: rule__Step__Group__1__Impl : ( ( rule__Step__TitleAssignment_1 ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1411:1: ( ( ( rule__Step__TitleAssignment_1 ) ) )
            // InternalCucumber.g:1412:1: ( ( rule__Step__TitleAssignment_1 ) )
            {
            // InternalCucumber.g:1412:1: ( ( rule__Step__TitleAssignment_1 ) )
            // InternalCucumber.g:1413:2: ( rule__Step__TitleAssignment_1 )
            {
             before(grammarAccess.getStepAccess().getTitleAssignment_1()); 
            // InternalCucumber.g:1414:2: ( rule__Step__TitleAssignment_1 )
            // InternalCucumber.g:1414:3: rule__Step__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Step__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getTitleAssignment_1()); 

            }


            }

        }
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
    // InternalCucumber.g:1422:1: rule__Step__Group__2 : rule__Step__Group__2__Impl rule__Step__Group__3 ;
    public final void rule__Step__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1426:1: ( rule__Step__Group__2__Impl rule__Step__Group__3 )
            // InternalCucumber.g:1427:2: rule__Step__Group__2__Impl rule__Step__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalCucumber.g:1434:1: rule__Step__Group__2__Impl : ( ( RULE_EOL )? ) ;
    public final void rule__Step__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1438:1: ( ( ( RULE_EOL )? ) )
            // InternalCucumber.g:1439:1: ( ( RULE_EOL )? )
            {
            // InternalCucumber.g:1439:1: ( ( RULE_EOL )? )
            // InternalCucumber.g:1440:2: ( RULE_EOL )?
            {
             before(grammarAccess.getStepAccess().getEOLTerminalRuleCall_2()); 
            // InternalCucumber.g:1441:2: ( RULE_EOL )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_EOL) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCucumber.g:1441:3: RULE_EOL
                    {
                    match(input,RULE_EOL,FOLLOW_2); 

                    }
                    break;

            }

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
    // InternalCucumber.g:1449:1: rule__Step__Group__3 : rule__Step__Group__3__Impl ;
    public final void rule__Step__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1453:1: ( rule__Step__Group__3__Impl )
            // InternalCucumber.g:1454:2: rule__Step__Group__3__Impl
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
    // InternalCucumber.g:1460:1: rule__Step__Group__3__Impl : ( ( rule__Step__Alternatives_3 )? ) ;
    public final void rule__Step__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1464:1: ( ( ( rule__Step__Alternatives_3 )? ) )
            // InternalCucumber.g:1465:1: ( ( rule__Step__Alternatives_3 )? )
            {
            // InternalCucumber.g:1465:1: ( ( rule__Step__Alternatives_3 )? )
            // InternalCucumber.g:1466:2: ( rule__Step__Alternatives_3 )?
            {
             before(grammarAccess.getStepAccess().getAlternatives_3()); 
            // InternalCucumber.g:1467:2: ( rule__Step__Alternatives_3 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=20 && LA19_0<=21)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCucumber.g:1467:3: rule__Step__Alternatives_3
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


    // $ANTLR start "rule__TableRow__Group__0"
    // InternalCucumber.g:1476:1: rule__TableRow__Group__0 : rule__TableRow__Group__0__Impl rule__TableRow__Group__1 ;
    public final void rule__TableRow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1480:1: ( rule__TableRow__Group__0__Impl rule__TableRow__Group__1 )
            // InternalCucumber.g:1481:2: rule__TableRow__Group__0__Impl rule__TableRow__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__TableRow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableRow__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRow__Group__0"


    // $ANTLR start "rule__TableRow__Group__0__Impl"
    // InternalCucumber.g:1488:1: rule__TableRow__Group__0__Impl : ( ( ( rule__TableRow__CellsAssignment_0 ) ) ( ( rule__TableRow__CellsAssignment_0 )* ) ) ;
    public final void rule__TableRow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1492:1: ( ( ( ( rule__TableRow__CellsAssignment_0 ) ) ( ( rule__TableRow__CellsAssignment_0 )* ) ) )
            // InternalCucumber.g:1493:1: ( ( ( rule__TableRow__CellsAssignment_0 ) ) ( ( rule__TableRow__CellsAssignment_0 )* ) )
            {
            // InternalCucumber.g:1493:1: ( ( ( rule__TableRow__CellsAssignment_0 ) ) ( ( rule__TableRow__CellsAssignment_0 )* ) )
            // InternalCucumber.g:1494:2: ( ( rule__TableRow__CellsAssignment_0 ) ) ( ( rule__TableRow__CellsAssignment_0 )* )
            {
            // InternalCucumber.g:1494:2: ( ( rule__TableRow__CellsAssignment_0 ) )
            // InternalCucumber.g:1495:3: ( rule__TableRow__CellsAssignment_0 )
            {
             before(grammarAccess.getTableRowAccess().getCellsAssignment_0()); 
            // InternalCucumber.g:1496:3: ( rule__TableRow__CellsAssignment_0 )
            // InternalCucumber.g:1496:4: rule__TableRow__CellsAssignment_0
            {
            pushFollow(FOLLOW_3);
            rule__TableRow__CellsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTableRowAccess().getCellsAssignment_0()); 

            }

            // InternalCucumber.g:1499:2: ( ( rule__TableRow__CellsAssignment_0 )* )
            // InternalCucumber.g:1500:3: ( rule__TableRow__CellsAssignment_0 )*
            {
             before(grammarAccess.getTableRowAccess().getCellsAssignment_0()); 
            // InternalCucumber.g:1501:3: ( rule__TableRow__CellsAssignment_0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==20) ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1==RULE_WORD) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // InternalCucumber.g:1501:4: rule__TableRow__CellsAssignment_0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__TableRow__CellsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getTableRowAccess().getCellsAssignment_0()); 

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
    // $ANTLR end "rule__TableRow__Group__0__Impl"


    // $ANTLR start "rule__TableRow__Group__1"
    // InternalCucumber.g:1510:1: rule__TableRow__Group__1 : rule__TableRow__Group__1__Impl rule__TableRow__Group__2 ;
    public final void rule__TableRow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1514:1: ( rule__TableRow__Group__1__Impl rule__TableRow__Group__2 )
            // InternalCucumber.g:1515:2: rule__TableRow__Group__1__Impl rule__TableRow__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__TableRow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableRow__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRow__Group__1"


    // $ANTLR start "rule__TableRow__Group__1__Impl"
    // InternalCucumber.g:1522:1: rule__TableRow__Group__1__Impl : ( '|' ) ;
    public final void rule__TableRow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1526:1: ( ( '|' ) )
            // InternalCucumber.g:1527:1: ( '|' )
            {
            // InternalCucumber.g:1527:1: ( '|' )
            // InternalCucumber.g:1528:2: '|'
            {
             before(grammarAccess.getTableRowAccess().getVerticalLineKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTableRowAccess().getVerticalLineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRow__Group__1__Impl"


    // $ANTLR start "rule__TableRow__Group__2"
    // InternalCucumber.g:1537:1: rule__TableRow__Group__2 : rule__TableRow__Group__2__Impl ;
    public final void rule__TableRow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1541:1: ( rule__TableRow__Group__2__Impl )
            // InternalCucumber.g:1542:2: rule__TableRow__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableRow__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRow__Group__2"


    // $ANTLR start "rule__TableRow__Group__2__Impl"
    // InternalCucumber.g:1548:1: rule__TableRow__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__TableRow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1552:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1553:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1553:1: ( RULE_EOL )
            // InternalCucumber.g:1554:2: RULE_EOL
            {
             before(grammarAccess.getTableRowAccess().getEOLTerminalRuleCall_2()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getTableRowAccess().getEOLTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRow__Group__2__Impl"


    // $ANTLR start "rule__RowCell__Group__0"
    // InternalCucumber.g:1564:1: rule__RowCell__Group__0 : rule__RowCell__Group__0__Impl rule__RowCell__Group__1 ;
    public final void rule__RowCell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1568:1: ( rule__RowCell__Group__0__Impl rule__RowCell__Group__1 )
            // InternalCucumber.g:1569:2: rule__RowCell__Group__0__Impl rule__RowCell__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__RowCell__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RowCell__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowCell__Group__0"


    // $ANTLR start "rule__RowCell__Group__0__Impl"
    // InternalCucumber.g:1576:1: rule__RowCell__Group__0__Impl : ( ( rule__RowCell__CellAssignment_0 ) ) ;
    public final void rule__RowCell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1580:1: ( ( ( rule__RowCell__CellAssignment_0 ) ) )
            // InternalCucumber.g:1581:1: ( ( rule__RowCell__CellAssignment_0 ) )
            {
            // InternalCucumber.g:1581:1: ( ( rule__RowCell__CellAssignment_0 ) )
            // InternalCucumber.g:1582:2: ( rule__RowCell__CellAssignment_0 )
            {
             before(grammarAccess.getRowCellAccess().getCellAssignment_0()); 
            // InternalCucumber.g:1583:2: ( rule__RowCell__CellAssignment_0 )
            // InternalCucumber.g:1583:3: rule__RowCell__CellAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RowCell__CellAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRowCellAccess().getCellAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowCell__Group__0__Impl"


    // $ANTLR start "rule__RowCell__Group__1"
    // InternalCucumber.g:1591:1: rule__RowCell__Group__1 : rule__RowCell__Group__1__Impl ;
    public final void rule__RowCell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1595:1: ( rule__RowCell__Group__1__Impl )
            // InternalCucumber.g:1596:2: rule__RowCell__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RowCell__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowCell__Group__1"


    // $ANTLR start "rule__RowCell__Group__1__Impl"
    // InternalCucumber.g:1602:1: rule__RowCell__Group__1__Impl : ( ruleSentence ) ;
    public final void rule__RowCell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1606:1: ( ( ruleSentence ) )
            // InternalCucumber.g:1607:1: ( ruleSentence )
            {
            // InternalCucumber.g:1607:1: ( ruleSentence )
            // InternalCucumber.g:1608:2: ruleSentence
            {
             before(grammarAccess.getRowCellAccess().getSentenceParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getRowCellAccess().getSentenceParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowCell__Group__1__Impl"


    // $ANTLR start "rule__DocString__Group__0"
    // InternalCucumber.g:1618:1: rule__DocString__Group__0 : rule__DocString__Group__0__Impl rule__DocString__Group__1 ;
    public final void rule__DocString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1622:1: ( rule__DocString__Group__0__Impl rule__DocString__Group__1 )
            // InternalCucumber.g:1623:2: rule__DocString__Group__0__Impl rule__DocString__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalCucumber.g:1630:1: rule__DocString__Group__0__Impl : ( () ) ;
    public final void rule__DocString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1634:1: ( ( () ) )
            // InternalCucumber.g:1635:1: ( () )
            {
            // InternalCucumber.g:1635:1: ( () )
            // InternalCucumber.g:1636:2: ()
            {
             before(grammarAccess.getDocStringAccess().getDocStringAction_0()); 
            // InternalCucumber.g:1637:2: ()
            // InternalCucumber.g:1637:3: 
            {
            }

             after(grammarAccess.getDocStringAccess().getDocStringAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocString__Group__0__Impl"


    // $ANTLR start "rule__DocString__Group__1"
    // InternalCucumber.g:1645:1: rule__DocString__Group__1 : rule__DocString__Group__1__Impl rule__DocString__Group__2 ;
    public final void rule__DocString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1649:1: ( rule__DocString__Group__1__Impl rule__DocString__Group__2 )
            // InternalCucumber.g:1650:2: rule__DocString__Group__1__Impl rule__DocString__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalCucumber.g:1657:1: rule__DocString__Group__1__Impl : ( '\"\"\"' ) ;
    public final void rule__DocString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1661:1: ( ( '\"\"\"' ) )
            // InternalCucumber.g:1662:1: ( '\"\"\"' )
            {
            // InternalCucumber.g:1662:1: ( '\"\"\"' )
            // InternalCucumber.g:1663:2: '\"\"\"'
            {
             before(grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_1()); 

            }


            }

        }
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
    // InternalCucumber.g:1672:1: rule__DocString__Group__2 : rule__DocString__Group__2__Impl rule__DocString__Group__3 ;
    public final void rule__DocString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1676:1: ( rule__DocString__Group__2__Impl rule__DocString__Group__3 )
            // InternalCucumber.g:1677:2: rule__DocString__Group__2__Impl rule__DocString__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalCucumber.g:1684:1: rule__DocString__Group__2__Impl : ( ( rule__DocString__Alternatives_2 )* ) ;
    public final void rule__DocString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1688:1: ( ( ( rule__DocString__Alternatives_2 )* ) )
            // InternalCucumber.g:1689:1: ( ( rule__DocString__Alternatives_2 )* )
            {
            // InternalCucumber.g:1689:1: ( ( rule__DocString__Alternatives_2 )* )
            // InternalCucumber.g:1690:2: ( rule__DocString__Alternatives_2 )*
            {
             before(grammarAccess.getDocStringAccess().getAlternatives_2()); 
            // InternalCucumber.g:1691:2: ( rule__DocString__Alternatives_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_WORD && LA21_0<=RULE_EOL)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCucumber.g:1691:3: rule__DocString__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__DocString__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getDocStringAccess().getAlternatives_2()); 

            }


            }

        }
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
    // InternalCucumber.g:1699:1: rule__DocString__Group__3 : rule__DocString__Group__3__Impl rule__DocString__Group__4 ;
    public final void rule__DocString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1703:1: ( rule__DocString__Group__3__Impl rule__DocString__Group__4 )
            // InternalCucumber.g:1704:2: rule__DocString__Group__3__Impl rule__DocString__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalCucumber.g:1711:1: rule__DocString__Group__3__Impl : ( '\"\"\"' ) ;
    public final void rule__DocString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1715:1: ( ( '\"\"\"' ) )
            // InternalCucumber.g:1716:1: ( '\"\"\"' )
            {
            // InternalCucumber.g:1716:1: ( '\"\"\"' )
            // InternalCucumber.g:1717:2: '\"\"\"'
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
    // InternalCucumber.g:1726:1: rule__DocString__Group__4 : rule__DocString__Group__4__Impl ;
    public final void rule__DocString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1730:1: ( rule__DocString__Group__4__Impl )
            // InternalCucumber.g:1731:2: rule__DocString__Group__4__Impl
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
    // InternalCucumber.g:1737:1: rule__DocString__Group__4__Impl : ( RULE_EOL ) ;
    public final void rule__DocString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1741:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1742:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1742:1: ( RULE_EOL )
            // InternalCucumber.g:1743:2: RULE_EOL
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


    // $ANTLR start "rule__Description__Group__0"
    // InternalCucumber.g:1753:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1757:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalCucumber.g:1758:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Description__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__0"


    // $ANTLR start "rule__Description__Group__0__Impl"
    // InternalCucumber.g:1765:1: rule__Description__Group__0__Impl : ( () ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1769:1: ( ( () ) )
            // InternalCucumber.g:1770:1: ( () )
            {
            // InternalCucumber.g:1770:1: ( () )
            // InternalCucumber.g:1771:2: ()
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionAction_0()); 
            // InternalCucumber.g:1772:2: ()
            // InternalCucumber.g:1772:3: 
            {
            }

             after(grammarAccess.getDescriptionAccess().getDescriptionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__0__Impl"


    // $ANTLR start "rule__Description__Group__1"
    // InternalCucumber.g:1780:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1784:1: ( rule__Description__Group__1__Impl )
            // InternalCucumber.g:1785:2: rule__Description__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__1"


    // $ANTLR start "rule__Description__Group__1__Impl"
    // InternalCucumber.g:1791:1: rule__Description__Group__1__Impl : ( ( rule__Description__Group_1__0 )* ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1795:1: ( ( ( rule__Description__Group_1__0 )* ) )
            // InternalCucumber.g:1796:1: ( ( rule__Description__Group_1__0 )* )
            {
            // InternalCucumber.g:1796:1: ( ( rule__Description__Group_1__0 )* )
            // InternalCucumber.g:1797:2: ( rule__Description__Group_1__0 )*
            {
             before(grammarAccess.getDescriptionAccess().getGroup_1()); 
            // InternalCucumber.g:1798:2: ( rule__Description__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_WORD) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCucumber.g:1798:3: rule__Description__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Description__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getDescriptionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__1__Impl"


    // $ANTLR start "rule__Description__Group_1__0"
    // InternalCucumber.g:1807:1: rule__Description__Group_1__0 : rule__Description__Group_1__0__Impl rule__Description__Group_1__1 ;
    public final void rule__Description__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1811:1: ( rule__Description__Group_1__0__Impl rule__Description__Group_1__1 )
            // InternalCucumber.g:1812:2: rule__Description__Group_1__0__Impl rule__Description__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__Description__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group_1__0"


    // $ANTLR start "rule__Description__Group_1__0__Impl"
    // InternalCucumber.g:1819:1: rule__Description__Group_1__0__Impl : ( ( rule__Description__SentencesAssignment_1_0 ) ) ;
    public final void rule__Description__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1823:1: ( ( ( rule__Description__SentencesAssignment_1_0 ) ) )
            // InternalCucumber.g:1824:1: ( ( rule__Description__SentencesAssignment_1_0 ) )
            {
            // InternalCucumber.g:1824:1: ( ( rule__Description__SentencesAssignment_1_0 ) )
            // InternalCucumber.g:1825:2: ( rule__Description__SentencesAssignment_1_0 )
            {
             before(grammarAccess.getDescriptionAccess().getSentencesAssignment_1_0()); 
            // InternalCucumber.g:1826:2: ( rule__Description__SentencesAssignment_1_0 )
            // InternalCucumber.g:1826:3: rule__Description__SentencesAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Description__SentencesAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getSentencesAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group_1__0__Impl"


    // $ANTLR start "rule__Description__Group_1__1"
    // InternalCucumber.g:1834:1: rule__Description__Group_1__1 : rule__Description__Group_1__1__Impl ;
    public final void rule__Description__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1838:1: ( rule__Description__Group_1__1__Impl )
            // InternalCucumber.g:1839:2: rule__Description__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group_1__1"


    // $ANTLR start "rule__Description__Group_1__1__Impl"
    // InternalCucumber.g:1845:1: rule__Description__Group_1__1__Impl : ( ( RULE_EOL )? ) ;
    public final void rule__Description__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1849:1: ( ( ( RULE_EOL )? ) )
            // InternalCucumber.g:1850:1: ( ( RULE_EOL )? )
            {
            // InternalCucumber.g:1850:1: ( ( RULE_EOL )? )
            // InternalCucumber.g:1851:2: ( RULE_EOL )?
            {
             before(grammarAccess.getDescriptionAccess().getEOLTerminalRuleCall_1_1()); 
            // InternalCucumber.g:1852:2: ( RULE_EOL )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_EOL) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCucumber.g:1852:3: RULE_EOL
                    {
                    match(input,RULE_EOL,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDescriptionAccess().getEOLTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group_1__1__Impl"


    // $ANTLR start "rule__Tags__Group__0"
    // InternalCucumber.g:1861:1: rule__Tags__Group__0 : rule__Tags__Group__0__Impl rule__Tags__Group__1 ;
    public final void rule__Tags__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1865:1: ( rule__Tags__Group__0__Impl rule__Tags__Group__1 )
            // InternalCucumber.g:1866:2: rule__Tags__Group__0__Impl rule__Tags__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalCucumber.g:1873:1: rule__Tags__Group__0__Impl : ( ( RULE_TAG )* ) ;
    public final void rule__Tags__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1877:1: ( ( ( RULE_TAG )* ) )
            // InternalCucumber.g:1878:1: ( ( RULE_TAG )* )
            {
            // InternalCucumber.g:1878:1: ( ( RULE_TAG )* )
            // InternalCucumber.g:1879:2: ( RULE_TAG )*
            {
             before(grammarAccess.getTagsAccess().getTAGTerminalRuleCall_0()); 
            // InternalCucumber.g:1880:2: ( RULE_TAG )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_TAG) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalCucumber.g:1880:3: RULE_TAG
            	    {
            	    match(input,RULE_TAG,FOLLOW_24); 

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getTagsAccess().getTAGTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalCucumber.g:1888:1: rule__Tags__Group__1 : rule__Tags__Group__1__Impl ;
    public final void rule__Tags__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1892:1: ( rule__Tags__Group__1__Impl )
            // InternalCucumber.g:1893:2: rule__Tags__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tags__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCucumber.g:1899:1: rule__Tags__Group__1__Impl : ( ( RULE_EOL )? ) ;
    public final void rule__Tags__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1903:1: ( ( ( RULE_EOL )? ) )
            // InternalCucumber.g:1904:1: ( ( RULE_EOL )? )
            {
            // InternalCucumber.g:1904:1: ( ( RULE_EOL )? )
            // InternalCucumber.g:1905:2: ( RULE_EOL )?
            {
             before(grammarAccess.getTagsAccess().getEOLTerminalRuleCall_1()); 
            // InternalCucumber.g:1906:2: ( RULE_EOL )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_EOL) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCucumber.g:1906:3: RULE_EOL
                    {
                    match(input,RULE_EOL,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getTagsAccess().getEOLTerminalRuleCall_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Feature__TitleAssignment_2"
    // InternalCucumber.g:1915:1: rule__Feature__TitleAssignment_2 : ( ruleSentence ) ;
    public final void rule__Feature__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1919:1: ( ( ruleSentence ) )
            // InternalCucumber.g:1920:2: ( ruleSentence )
            {
            // InternalCucumber.g:1920:2: ( ruleSentence )
            // InternalCucumber.g:1921:3: ruleSentence
            {
             before(grammarAccess.getFeatureAccess().getTitleSentenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getTitleSentenceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__TitleAssignment_2"


    // $ANTLR start "rule__Feature__DescriptionAssignment_4"
    // InternalCucumber.g:1930:1: rule__Feature__DescriptionAssignment_4 : ( ruleDescription ) ;
    public final void rule__Feature__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1934:1: ( ( ruleDescription ) )
            // InternalCucumber.g:1935:2: ( ruleDescription )
            {
            // InternalCucumber.g:1935:2: ( ruleDescription )
            // InternalCucumber.g:1936:3: ruleDescription
            {
             before(grammarAccess.getFeatureAccess().getDescriptionDescriptionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getDescriptionDescriptionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__DescriptionAssignment_4"


    // $ANTLR start "rule__Feature__BackgroundAssignment_5"
    // InternalCucumber.g:1945:1: rule__Feature__BackgroundAssignment_5 : ( ruleBackground ) ;
    public final void rule__Feature__BackgroundAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1949:1: ( ( ruleBackground ) )
            // InternalCucumber.g:1950:2: ( ruleBackground )
            {
            // InternalCucumber.g:1950:2: ( ruleBackground )
            // InternalCucumber.g:1951:3: ruleBackground
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
    // InternalCucumber.g:1960:1: rule__Feature__ScenariosAssignment_6 : ( ruleAbstractScenario ) ;
    public final void rule__Feature__ScenariosAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1964:1: ( ( ruleAbstractScenario ) )
            // InternalCucumber.g:1965:2: ( ruleAbstractScenario )
            {
            // InternalCucumber.g:1965:2: ( ruleAbstractScenario )
            // InternalCucumber.g:1966:3: ruleAbstractScenario
            {
             before(grammarAccess.getFeatureAccess().getScenariosAbstractScenarioParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractScenario();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getScenariosAbstractScenarioParserRuleCall_6_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Background__TitleAssignment_1"
    // InternalCucumber.g:1975:1: rule__Background__TitleAssignment_1 : ( ruleSentence ) ;
    public final void rule__Background__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1979:1: ( ( ruleSentence ) )
            // InternalCucumber.g:1980:2: ( ruleSentence )
            {
            // InternalCucumber.g:1980:2: ( ruleSentence )
            // InternalCucumber.g:1981:3: ruleSentence
            {
             before(grammarAccess.getBackgroundAccess().getTitleSentenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getTitleSentenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__TitleAssignment_1"


    // $ANTLR start "rule__Background__DescriptionAssignment_3"
    // InternalCucumber.g:1990:1: rule__Background__DescriptionAssignment_3 : ( ruleDescription ) ;
    public final void rule__Background__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1994:1: ( ( ruleDescription ) )
            // InternalCucumber.g:1995:2: ( ruleDescription )
            {
            // InternalCucumber.g:1995:2: ( ruleDescription )
            // InternalCucumber.g:1996:3: ruleDescription
            {
             before(grammarAccess.getBackgroundAccess().getDescriptionDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getDescriptionDescriptionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__DescriptionAssignment_3"


    // $ANTLR start "rule__Background__StepsAssignment_4"
    // InternalCucumber.g:2005:1: rule__Background__StepsAssignment_4 : ( ruleStep ) ;
    public final void rule__Background__StepsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2009:1: ( ( ruleStep ) )
            // InternalCucumber.g:2010:2: ( ruleStep )
            {
            // InternalCucumber.g:2010:2: ( ruleStep )
            // InternalCucumber.g:2011:3: ruleStep
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


    // $ANTLR start "rule__Scenario__TitleAssignment_2"
    // InternalCucumber.g:2020:1: rule__Scenario__TitleAssignment_2 : ( ruleSentence ) ;
    public final void rule__Scenario__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2024:1: ( ( ruleSentence ) )
            // InternalCucumber.g:2025:2: ( ruleSentence )
            {
            // InternalCucumber.g:2025:2: ( ruleSentence )
            // InternalCucumber.g:2026:3: ruleSentence
            {
             before(grammarAccess.getScenarioAccess().getTitleSentenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getTitleSentenceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__TitleAssignment_2"


    // $ANTLR start "rule__Scenario__DescriptionAssignment_4"
    // InternalCucumber.g:2035:1: rule__Scenario__DescriptionAssignment_4 : ( ruleDescription ) ;
    public final void rule__Scenario__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2039:1: ( ( ruleDescription ) )
            // InternalCucumber.g:2040:2: ( ruleDescription )
            {
            // InternalCucumber.g:2040:2: ( ruleDescription )
            // InternalCucumber.g:2041:3: ruleDescription
            {
             before(grammarAccess.getScenarioAccess().getDescriptionDescriptionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getDescriptionDescriptionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__DescriptionAssignment_4"


    // $ANTLR start "rule__Scenario__StepsAssignment_5"
    // InternalCucumber.g:2050:1: rule__Scenario__StepsAssignment_5 : ( ruleStep ) ;
    public final void rule__Scenario__StepsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2054:1: ( ( ruleStep ) )
            // InternalCucumber.g:2055:2: ( ruleStep )
            {
            // InternalCucumber.g:2055:2: ( ruleStep )
            // InternalCucumber.g:2056:3: ruleStep
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


    // $ANTLR start "rule__ScenarioOutline__TitleAssignment_2"
    // InternalCucumber.g:2065:1: rule__ScenarioOutline__TitleAssignment_2 : ( ruleSentence ) ;
    public final void rule__ScenarioOutline__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2069:1: ( ( ruleSentence ) )
            // InternalCucumber.g:2070:2: ( ruleSentence )
            {
            // InternalCucumber.g:2070:2: ( ruleSentence )
            // InternalCucumber.g:2071:3: ruleSentence
            {
             before(grammarAccess.getScenarioOutlineAccess().getTitleSentenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getTitleSentenceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__TitleAssignment_2"


    // $ANTLR start "rule__ScenarioOutline__DescriptionAssignment_4"
    // InternalCucumber.g:2080:1: rule__ScenarioOutline__DescriptionAssignment_4 : ( ruleDescription ) ;
    public final void rule__ScenarioOutline__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2084:1: ( ( ruleDescription ) )
            // InternalCucumber.g:2085:2: ( ruleDescription )
            {
            // InternalCucumber.g:2085:2: ( ruleDescription )
            // InternalCucumber.g:2086:3: ruleDescription
            {
             before(grammarAccess.getScenarioOutlineAccess().getDescriptionDescriptionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getDescriptionDescriptionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__DescriptionAssignment_4"


    // $ANTLR start "rule__ScenarioOutline__StepsAssignment_5"
    // InternalCucumber.g:2095:1: rule__ScenarioOutline__StepsAssignment_5 : ( ruleStep ) ;
    public final void rule__ScenarioOutline__StepsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2099:1: ( ( ruleStep ) )
            // InternalCucumber.g:2100:2: ( ruleStep )
            {
            // InternalCucumber.g:2100:2: ( ruleStep )
            // InternalCucumber.g:2101:3: ruleStep
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
    // InternalCucumber.g:2110:1: rule__ScenarioOutline__ExamplesAssignment_6 : ( ruleExample ) ;
    public final void rule__ScenarioOutline__ExamplesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2114:1: ( ( ruleExample ) )
            // InternalCucumber.g:2115:2: ( ruleExample )
            {
            // InternalCucumber.g:2115:2: ( ruleExample )
            // InternalCucumber.g:2116:3: ruleExample
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


    // $ANTLR start "rule__Example__TitleAssignment_2"
    // InternalCucumber.g:2125:1: rule__Example__TitleAssignment_2 : ( ruleSentence ) ;
    public final void rule__Example__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2129:1: ( ( ruleSentence ) )
            // InternalCucumber.g:2130:2: ( ruleSentence )
            {
            // InternalCucumber.g:2130:2: ( ruleSentence )
            // InternalCucumber.g:2131:3: ruleSentence
            {
             before(grammarAccess.getExampleAccess().getTitleSentenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getTitleSentenceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__TitleAssignment_2"


    // $ANTLR start "rule__Example__DescriptionAssignment_4"
    // InternalCucumber.g:2140:1: rule__Example__DescriptionAssignment_4 : ( ruleDescription ) ;
    public final void rule__Example__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2144:1: ( ( ruleDescription ) )
            // InternalCucumber.g:2145:2: ( ruleDescription )
            {
            // InternalCucumber.g:2145:2: ( ruleDescription )
            // InternalCucumber.g:2146:3: ruleDescription
            {
             before(grammarAccess.getExampleAccess().getDescriptionDescriptionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getDescriptionDescriptionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__DescriptionAssignment_4"


    // $ANTLR start "rule__Example__TableAssignment_5"
    // InternalCucumber.g:2155:1: rule__Example__TableAssignment_5 : ( ruleTable ) ;
    public final void rule__Example__TableAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2159:1: ( ( ruleTable ) )
            // InternalCucumber.g:2160:2: ( ruleTable )
            {
            // InternalCucumber.g:2160:2: ( ruleTable )
            // InternalCucumber.g:2161:3: ruleTable
            {
             before(grammarAccess.getExampleAccess().getTableTableParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getTableTableParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__TableAssignment_5"


    // $ANTLR start "rule__Step__TitleAssignment_1"
    // InternalCucumber.g:2170:1: rule__Step__TitleAssignment_1 : ( ruleSentence ) ;
    public final void rule__Step__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2174:1: ( ( ruleSentence ) )
            // InternalCucumber.g:2175:2: ( ruleSentence )
            {
            // InternalCucumber.g:2175:2: ( ruleSentence )
            // InternalCucumber.g:2176:3: ruleSentence
            {
             before(grammarAccess.getStepAccess().getTitleSentenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getStepAccess().getTitleSentenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__TitleAssignment_1"


    // $ANTLR start "rule__Step__TableAssignment_3_0"
    // InternalCucumber.g:2185:1: rule__Step__TableAssignment_3_0 : ( ruleTable ) ;
    public final void rule__Step__TableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2189:1: ( ( ruleTable ) )
            // InternalCucumber.g:2190:2: ( ruleTable )
            {
            // InternalCucumber.g:2190:2: ( ruleTable )
            // InternalCucumber.g:2191:3: ruleTable
            {
             before(grammarAccess.getStepAccess().getTableTableParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getStepAccess().getTableTableParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__TableAssignment_3_0"


    // $ANTLR start "rule__Step__TextAssignment_3_1"
    // InternalCucumber.g:2200:1: rule__Step__TextAssignment_3_1 : ( ruleDocString ) ;
    public final void rule__Step__TextAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2204:1: ( ( ruleDocString ) )
            // InternalCucumber.g:2205:2: ( ruleDocString )
            {
            // InternalCucumber.g:2205:2: ( ruleDocString )
            // InternalCucumber.g:2206:3: ruleDocString
            {
             before(grammarAccess.getStepAccess().getTextDocStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDocString();

            state._fsp--;

             after(grammarAccess.getStepAccess().getTextDocStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__TextAssignment_3_1"


    // $ANTLR start "rule__Table__RowsAssignment"
    // InternalCucumber.g:2215:1: rule__Table__RowsAssignment : ( ruleTableRow ) ;
    public final void rule__Table__RowsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2219:1: ( ( ruleTableRow ) )
            // InternalCucumber.g:2220:2: ( ruleTableRow )
            {
            // InternalCucumber.g:2220:2: ( ruleTableRow )
            // InternalCucumber.g:2221:3: ruleTableRow
            {
             before(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTableRow();

            state._fsp--;

             after(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__RowsAssignment"


    // $ANTLR start "rule__TableRow__CellsAssignment_0"
    // InternalCucumber.g:2230:1: rule__TableRow__CellsAssignment_0 : ( ruleRowCell ) ;
    public final void rule__TableRow__CellsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2234:1: ( ( ruleRowCell ) )
            // InternalCucumber.g:2235:2: ( ruleRowCell )
            {
            // InternalCucumber.g:2235:2: ( ruleRowCell )
            // InternalCucumber.g:2236:3: ruleRowCell
            {
             before(grammarAccess.getTableRowAccess().getCellsRowCellParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRowCell();

            state._fsp--;

             after(grammarAccess.getTableRowAccess().getCellsRowCellParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRow__CellsAssignment_0"


    // $ANTLR start "rule__RowCell__CellAssignment_0"
    // InternalCucumber.g:2245:1: rule__RowCell__CellAssignment_0 : ( ( '|' ) ) ;
    public final void rule__RowCell__CellAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2249:1: ( ( ( '|' ) ) )
            // InternalCucumber.g:2250:2: ( ( '|' ) )
            {
            // InternalCucumber.g:2250:2: ( ( '|' ) )
            // InternalCucumber.g:2251:3: ( '|' )
            {
             before(grammarAccess.getRowCellAccess().getCellVerticalLineKeyword_0_0()); 
            // InternalCucumber.g:2252:3: ( '|' )
            // InternalCucumber.g:2253:4: '|'
            {
             before(grammarAccess.getRowCellAccess().getCellVerticalLineKeyword_0_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRowCellAccess().getCellVerticalLineKeyword_0_0()); 

            }

             after(grammarAccess.getRowCellAccess().getCellVerticalLineKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowCell__CellAssignment_0"


    // $ANTLR start "rule__Description__SentencesAssignment_1_0"
    // InternalCucumber.g:2264:1: rule__Description__SentencesAssignment_1_0 : ( ruleSentence ) ;
    public final void rule__Description__SentencesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2268:1: ( ( ruleSentence ) )
            // InternalCucumber.g:2269:2: ( ruleSentence )
            {
            // InternalCucumber.g:2269:2: ( ruleSentence )
            // InternalCucumber.g:2270:3: ruleSentence
            {
             before(grammarAccess.getDescriptionAccess().getSentencesSentenceParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getDescriptionAccess().getSentencesSentenceParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__SentencesAssignment_1_0"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\5\uffff";
    static final String dfa_2s = "\2\5\1\21\2\uffff";
    static final String dfa_3s = "\3\22\2\uffff";
    static final String dfa_4s = "\3\uffff\1\1\1\2";
    static final String dfa_5s = "\5\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\1\12\uffff\1\4\1\3",
            "\1\2\1\1\12\uffff\1\4\1\3",
            "\1\4\1\3",
            "",
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
            return "416:1: rule__AbstractScenario__Alternatives : ( ( ruleScenarioOutline ) | ( ruleScenario ) );";
        }
    }
    static final String dfa_7s = "\1\1\4\uffff";
    static final String dfa_8s = "\1\5\1\uffff\1\5\1\21\1\uffff";
    static final String dfa_9s = "\1\23\1\uffff\2\23\1\uffff";
    static final String dfa_10s = "\1\uffff\1\2\2\uffff\1\1";
    static final String[] dfa_11s = {
            "\1\3\1\2\12\uffff\2\1\1\4",
            "",
            "\1\3\1\2\12\uffff\2\1\1\4",
            "\2\1\1\4",
            ""
    };
    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[][] dfa_11 = unpackEncodedStringArray(dfa_11s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_5;
            this.transition = dfa_11;
        }
        public String getDescription() {
            return "()* loopback of 1196:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010060L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000007E00L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000007E02L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000007E60L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000007E62L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000300020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000042L});

}
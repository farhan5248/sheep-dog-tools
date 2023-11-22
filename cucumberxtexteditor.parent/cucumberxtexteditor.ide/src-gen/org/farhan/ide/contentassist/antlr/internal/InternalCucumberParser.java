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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WORD", "RULE_EOL", "RULE_TAG_ID", "RULE_WS", "RULE_SL_COMMENT", "'Given'", "'When'", "'Then'", "'And'", "'But'", "'*'", "'Feature:'", "'Background:'", "'Scenario:'", "'Scenario Outline:'", "'Examples:'", "'|'", "'\"\"\"'"
    };
    public static final int RULE_TAG_ID=6;
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


    // $ANTLR start "entryRuleDescription"
    // InternalCucumber.g:203:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalCucumber.g:204:1: ( ruleDescription EOF )
            // InternalCucumber.g:205:1: ruleDescription EOF
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
    // InternalCucumber.g:212:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:216:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalCucumber.g:217:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalCucumber.g:217:2: ( ( rule__Description__Group__0 ) )
            // InternalCucumber.g:218:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalCucumber.g:219:3: ( rule__Description__Group__0 )
            // InternalCucumber.g:219:4: rule__Description__Group__0
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


    // $ANTLR start "entryRuleStep"
    // InternalCucumber.g:228:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalCucumber.g:229:1: ( ruleStep EOF )
            // InternalCucumber.g:230:1: ruleStep EOF
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
    // InternalCucumber.g:237:1: ruleStep : ( ( rule__Step__Group__0 ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:241:2: ( ( ( rule__Step__Group__0 ) ) )
            // InternalCucumber.g:242:2: ( ( rule__Step__Group__0 ) )
            {
            // InternalCucumber.g:242:2: ( ( rule__Step__Group__0 ) )
            // InternalCucumber.g:243:3: ( rule__Step__Group__0 )
            {
             before(grammarAccess.getStepAccess().getGroup()); 
            // InternalCucumber.g:244:3: ( rule__Step__Group__0 )
            // InternalCucumber.g:244:4: rule__Step__Group__0
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
    // InternalCucumber.g:253:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalCucumber.g:254:1: ( ruleTable EOF )
            // InternalCucumber.g:255:1: ruleTable EOF
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
    // InternalCucumber.g:262:1: ruleTable : ( ( ( rule__Table__RowsAssignment ) ) ( ( rule__Table__RowsAssignment )* ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:266:2: ( ( ( ( rule__Table__RowsAssignment ) ) ( ( rule__Table__RowsAssignment )* ) ) )
            // InternalCucumber.g:267:2: ( ( ( rule__Table__RowsAssignment ) ) ( ( rule__Table__RowsAssignment )* ) )
            {
            // InternalCucumber.g:267:2: ( ( ( rule__Table__RowsAssignment ) ) ( ( rule__Table__RowsAssignment )* ) )
            // InternalCucumber.g:268:3: ( ( rule__Table__RowsAssignment ) ) ( ( rule__Table__RowsAssignment )* )
            {
            // InternalCucumber.g:268:3: ( ( rule__Table__RowsAssignment ) )
            // InternalCucumber.g:269:4: ( rule__Table__RowsAssignment )
            {
             before(grammarAccess.getTableAccess().getRowsAssignment()); 
            // InternalCucumber.g:270:4: ( rule__Table__RowsAssignment )
            // InternalCucumber.g:270:5: rule__Table__RowsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Table__RowsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getRowsAssignment()); 

            }

            // InternalCucumber.g:273:3: ( ( rule__Table__RowsAssignment )* )
            // InternalCucumber.g:274:4: ( rule__Table__RowsAssignment )*
            {
             before(grammarAccess.getTableAccess().getRowsAssignment()); 
            // InternalCucumber.g:275:4: ( rule__Table__RowsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCucumber.g:275:5: rule__Table__RowsAssignment
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
    // InternalCucumber.g:285:1: entryRuleTableRow : ruleTableRow EOF ;
    public final void entryRuleTableRow() throws RecognitionException {
        try {
            // InternalCucumber.g:286:1: ( ruleTableRow EOF )
            // InternalCucumber.g:287:1: ruleTableRow EOF
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
    // InternalCucumber.g:294:1: ruleTableRow : ( ( rule__TableRow__Group__0 ) ) ;
    public final void ruleTableRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:298:2: ( ( ( rule__TableRow__Group__0 ) ) )
            // InternalCucumber.g:299:2: ( ( rule__TableRow__Group__0 ) )
            {
            // InternalCucumber.g:299:2: ( ( rule__TableRow__Group__0 ) )
            // InternalCucumber.g:300:3: ( rule__TableRow__Group__0 )
            {
             before(grammarAccess.getTableRowAccess().getGroup()); 
            // InternalCucumber.g:301:3: ( rule__TableRow__Group__0 )
            // InternalCucumber.g:301:4: rule__TableRow__Group__0
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
    // InternalCucumber.g:310:1: entryRuleRowCell : ruleRowCell EOF ;
    public final void entryRuleRowCell() throws RecognitionException {
        try {
            // InternalCucumber.g:311:1: ( ruleRowCell EOF )
            // InternalCucumber.g:312:1: ruleRowCell EOF
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
    // InternalCucumber.g:319:1: ruleRowCell : ( ( rule__RowCell__Group__0 ) ) ;
    public final void ruleRowCell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:323:2: ( ( ( rule__RowCell__Group__0 ) ) )
            // InternalCucumber.g:324:2: ( ( rule__RowCell__Group__0 ) )
            {
            // InternalCucumber.g:324:2: ( ( rule__RowCell__Group__0 ) )
            // InternalCucumber.g:325:3: ( rule__RowCell__Group__0 )
            {
             before(grammarAccess.getRowCellAccess().getGroup()); 
            // InternalCucumber.g:326:3: ( rule__RowCell__Group__0 )
            // InternalCucumber.g:326:4: rule__RowCell__Group__0
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
    // InternalCucumber.g:335:1: entryRuleDocString : ruleDocString EOF ;
    public final void entryRuleDocString() throws RecognitionException {
        try {
            // InternalCucumber.g:336:1: ( ruleDocString EOF )
            // InternalCucumber.g:337:1: ruleDocString EOF
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
    // InternalCucumber.g:344:1: ruleDocString : ( ( rule__DocString__Group__0 ) ) ;
    public final void ruleDocString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:348:2: ( ( ( rule__DocString__Group__0 ) ) )
            // InternalCucumber.g:349:2: ( ( rule__DocString__Group__0 ) )
            {
            // InternalCucumber.g:349:2: ( ( rule__DocString__Group__0 ) )
            // InternalCucumber.g:350:3: ( rule__DocString__Group__0 )
            {
             before(grammarAccess.getDocStringAccess().getGroup()); 
            // InternalCucumber.g:351:3: ( rule__DocString__Group__0 )
            // InternalCucumber.g:351:4: rule__DocString__Group__0
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


    // $ANTLR start "entryRuleTag"
    // InternalCucumber.g:360:1: entryRuleTag : ruleTag EOF ;
    public final void entryRuleTag() throws RecognitionException {
        try {
            // InternalCucumber.g:361:1: ( ruleTag EOF )
            // InternalCucumber.g:362:1: ruleTag EOF
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
    // InternalCucumber.g:369:1: ruleTag : ( ( rule__Tag__TagAssignment ) ) ;
    public final void ruleTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:373:2: ( ( ( rule__Tag__TagAssignment ) ) )
            // InternalCucumber.g:374:2: ( ( rule__Tag__TagAssignment ) )
            {
            // InternalCucumber.g:374:2: ( ( rule__Tag__TagAssignment ) )
            // InternalCucumber.g:375:3: ( rule__Tag__TagAssignment )
            {
             before(grammarAccess.getTagAccess().getTagAssignment()); 
            // InternalCucumber.g:376:3: ( rule__Tag__TagAssignment )
            // InternalCucumber.g:376:4: rule__Tag__TagAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Tag__TagAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTagAccess().getTagAssignment()); 

            }


            }

        }
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
            switch ( input.LA(1) ) {
            case RULE_TAG_ID:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_EOL) ) {
                    int LA3_4 = input.LA(3);

                    if ( (LA3_4==17) ) {
                        alt3=2;
                    }
                    else if ( (LA3_4==18) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

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
    // InternalCucumber.g:536:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__Group_0__0 )? ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:540:1: ( ( ( rule__Feature__Group_0__0 )? ) )
            // InternalCucumber.g:541:1: ( ( rule__Feature__Group_0__0 )? )
            {
            // InternalCucumber.g:541:1: ( ( rule__Feature__Group_0__0 )? )
            // InternalCucumber.g:542:2: ( rule__Feature__Group_0__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_0()); 
            // InternalCucumber.g:543:2: ( rule__Feature__Group_0__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_TAG_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCucumber.g:543:3: rule__Feature__Group_0__0
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
    // InternalCucumber.g:617:1: rule__Feature__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:621:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:622:1: ( RULE_EOL )
            {
            // InternalCucumber.g:622:1: ( RULE_EOL )
            // InternalCucumber.g:623:2: RULE_EOL
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
    // InternalCucumber.g:644:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__DescriptionsAssignment_4 )* ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:648:1: ( ( ( rule__Feature__DescriptionsAssignment_4 )* ) )
            // InternalCucumber.g:649:1: ( ( rule__Feature__DescriptionsAssignment_4 )* )
            {
            // InternalCucumber.g:649:1: ( ( rule__Feature__DescriptionsAssignment_4 )* )
            // InternalCucumber.g:650:2: ( rule__Feature__DescriptionsAssignment_4 )*
            {
             before(grammarAccess.getFeatureAccess().getDescriptionsAssignment_4()); 
            // InternalCucumber.g:651:2: ( rule__Feature__DescriptionsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_WORD) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCucumber.g:651:3: rule__Feature__DescriptionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Feature__DescriptionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getDescriptionsAssignment_4()); 

            }


            }

        }
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
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
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
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_TAG_ID||(LA10_0>=17 && LA10_0<=18)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCucumber.g:704:3: rule__Feature__ScenariosAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Feature__ScenariosAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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


    // $ANTLR start "rule__Feature__Group_0__0"
    // InternalCucumber.g:713:1: rule__Feature__Group_0__0 : rule__Feature__Group_0__0__Impl rule__Feature__Group_0__1 ;
    public final void rule__Feature__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:717:1: ( rule__Feature__Group_0__0__Impl rule__Feature__Group_0__1 )
            // InternalCucumber.g:718:2: rule__Feature__Group_0__0__Impl rule__Feature__Group_0__1
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
    // InternalCucumber.g:725:1: rule__Feature__Group_0__0__Impl : ( ( ( rule__Feature__TagsAssignment_0_0 ) ) ( ( rule__Feature__TagsAssignment_0_0 )* ) ) ;
    public final void rule__Feature__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:729:1: ( ( ( ( rule__Feature__TagsAssignment_0_0 ) ) ( ( rule__Feature__TagsAssignment_0_0 )* ) ) )
            // InternalCucumber.g:730:1: ( ( ( rule__Feature__TagsAssignment_0_0 ) ) ( ( rule__Feature__TagsAssignment_0_0 )* ) )
            {
            // InternalCucumber.g:730:1: ( ( ( rule__Feature__TagsAssignment_0_0 ) ) ( ( rule__Feature__TagsAssignment_0_0 )* ) )
            // InternalCucumber.g:731:2: ( ( rule__Feature__TagsAssignment_0_0 ) ) ( ( rule__Feature__TagsAssignment_0_0 )* )
            {
            // InternalCucumber.g:731:2: ( ( rule__Feature__TagsAssignment_0_0 ) )
            // InternalCucumber.g:732:3: ( rule__Feature__TagsAssignment_0_0 )
            {
             before(grammarAccess.getFeatureAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:733:3: ( rule__Feature__TagsAssignment_0_0 )
            // InternalCucumber.g:733:4: rule__Feature__TagsAssignment_0_0
            {
            pushFollow(FOLLOW_10);
            rule__Feature__TagsAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTagsAssignment_0_0()); 

            }

            // InternalCucumber.g:736:2: ( ( rule__Feature__TagsAssignment_0_0 )* )
            // InternalCucumber.g:737:3: ( rule__Feature__TagsAssignment_0_0 )*
            {
             before(grammarAccess.getFeatureAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:738:3: ( rule__Feature__TagsAssignment_0_0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_TAG_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCucumber.g:738:4: rule__Feature__TagsAssignment_0_0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Feature__TagsAssignment_0_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalCucumber.g:747:1: rule__Feature__Group_0__1 : rule__Feature__Group_0__1__Impl ;
    public final void rule__Feature__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:751:1: ( rule__Feature__Group_0__1__Impl )
            // InternalCucumber.g:752:2: rule__Feature__Group_0__1__Impl
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
    // InternalCucumber.g:758:1: rule__Feature__Group_0__1__Impl : ( RULE_EOL ) ;
    public final void rule__Feature__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:762:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:763:1: ( RULE_EOL )
            {
            // InternalCucumber.g:763:1: ( RULE_EOL )
            // InternalCucumber.g:764:2: RULE_EOL
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
    // InternalCucumber.g:774:1: rule__Background__Group__0 : rule__Background__Group__0__Impl rule__Background__Group__1 ;
    public final void rule__Background__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:778:1: ( rule__Background__Group__0__Impl rule__Background__Group__1 )
            // InternalCucumber.g:779:2: rule__Background__Group__0__Impl rule__Background__Group__1
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
    // InternalCucumber.g:786:1: rule__Background__Group__0__Impl : ( 'Background:' ) ;
    public final void rule__Background__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:790:1: ( ( 'Background:' ) )
            // InternalCucumber.g:791:1: ( 'Background:' )
            {
            // InternalCucumber.g:791:1: ( 'Background:' )
            // InternalCucumber.g:792:2: 'Background:'
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
    // InternalCucumber.g:801:1: rule__Background__Group__1 : rule__Background__Group__1__Impl rule__Background__Group__2 ;
    public final void rule__Background__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:805:1: ( rule__Background__Group__1__Impl rule__Background__Group__2 )
            // InternalCucumber.g:806:2: rule__Background__Group__1__Impl rule__Background__Group__2
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
    // InternalCucumber.g:813:1: rule__Background__Group__1__Impl : ( ( rule__Background__TitleAssignment_1 ) ) ;
    public final void rule__Background__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:817:1: ( ( ( rule__Background__TitleAssignment_1 ) ) )
            // InternalCucumber.g:818:1: ( ( rule__Background__TitleAssignment_1 ) )
            {
            // InternalCucumber.g:818:1: ( ( rule__Background__TitleAssignment_1 ) )
            // InternalCucumber.g:819:2: ( rule__Background__TitleAssignment_1 )
            {
             before(grammarAccess.getBackgroundAccess().getTitleAssignment_1()); 
            // InternalCucumber.g:820:2: ( rule__Background__TitleAssignment_1 )
            // InternalCucumber.g:820:3: rule__Background__TitleAssignment_1
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
    // InternalCucumber.g:828:1: rule__Background__Group__2 : rule__Background__Group__2__Impl rule__Background__Group__3 ;
    public final void rule__Background__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:832:1: ( rule__Background__Group__2__Impl rule__Background__Group__3 )
            // InternalCucumber.g:833:2: rule__Background__Group__2__Impl rule__Background__Group__3
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
    // InternalCucumber.g:840:1: rule__Background__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__Background__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:844:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:845:1: ( RULE_EOL )
            {
            // InternalCucumber.g:845:1: ( RULE_EOL )
            // InternalCucumber.g:846:2: RULE_EOL
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
    // InternalCucumber.g:855:1: rule__Background__Group__3 : rule__Background__Group__3__Impl rule__Background__Group__4 ;
    public final void rule__Background__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:859:1: ( rule__Background__Group__3__Impl rule__Background__Group__4 )
            // InternalCucumber.g:860:2: rule__Background__Group__3__Impl rule__Background__Group__4
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
    // InternalCucumber.g:867:1: rule__Background__Group__3__Impl : ( ( rule__Background__DescriptionsAssignment_3 )* ) ;
    public final void rule__Background__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:871:1: ( ( ( rule__Background__DescriptionsAssignment_3 )* ) )
            // InternalCucumber.g:872:1: ( ( rule__Background__DescriptionsAssignment_3 )* )
            {
            // InternalCucumber.g:872:1: ( ( rule__Background__DescriptionsAssignment_3 )* )
            // InternalCucumber.g:873:2: ( rule__Background__DescriptionsAssignment_3 )*
            {
             before(grammarAccess.getBackgroundAccess().getDescriptionsAssignment_3()); 
            // InternalCucumber.g:874:2: ( rule__Background__DescriptionsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_WORD) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCucumber.g:874:3: rule__Background__DescriptionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Background__DescriptionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getBackgroundAccess().getDescriptionsAssignment_3()); 

            }


            }

        }
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
    // InternalCucumber.g:882:1: rule__Background__Group__4 : rule__Background__Group__4__Impl ;
    public final void rule__Background__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:886:1: ( rule__Background__Group__4__Impl )
            // InternalCucumber.g:887:2: rule__Background__Group__4__Impl
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
    // InternalCucumber.g:893:1: rule__Background__Group__4__Impl : ( ( rule__Background__StepsAssignment_4 )* ) ;
    public final void rule__Background__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:897:1: ( ( ( rule__Background__StepsAssignment_4 )* ) )
            // InternalCucumber.g:898:1: ( ( rule__Background__StepsAssignment_4 )* )
            {
            // InternalCucumber.g:898:1: ( ( rule__Background__StepsAssignment_4 )* )
            // InternalCucumber.g:899:2: ( rule__Background__StepsAssignment_4 )*
            {
             before(grammarAccess.getBackgroundAccess().getStepsAssignment_4()); 
            // InternalCucumber.g:900:2: ( rule__Background__StepsAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=9 && LA13_0<=14)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCucumber.g:900:3: rule__Background__StepsAssignment_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Background__StepsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalCucumber.g:909:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:913:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalCucumber.g:914:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
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
    // InternalCucumber.g:921:1: rule__Scenario__Group__0__Impl : ( ( rule__Scenario__Group_0__0 )? ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:925:1: ( ( ( rule__Scenario__Group_0__0 )? ) )
            // InternalCucumber.g:926:1: ( ( rule__Scenario__Group_0__0 )? )
            {
            // InternalCucumber.g:926:1: ( ( rule__Scenario__Group_0__0 )? )
            // InternalCucumber.g:927:2: ( rule__Scenario__Group_0__0 )?
            {
             before(grammarAccess.getScenarioAccess().getGroup_0()); 
            // InternalCucumber.g:928:2: ( rule__Scenario__Group_0__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_TAG_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCucumber.g:928:3: rule__Scenario__Group_0__0
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
    // InternalCucumber.g:936:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:940:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalCucumber.g:941:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
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
    // InternalCucumber.g:948:1: rule__Scenario__Group__1__Impl : ( 'Scenario:' ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:952:1: ( ( 'Scenario:' ) )
            // InternalCucumber.g:953:1: ( 'Scenario:' )
            {
            // InternalCucumber.g:953:1: ( 'Scenario:' )
            // InternalCucumber.g:954:2: 'Scenario:'
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
    // InternalCucumber.g:963:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:967:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // InternalCucumber.g:968:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
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
    // InternalCucumber.g:975:1: rule__Scenario__Group__2__Impl : ( ( rule__Scenario__TitleAssignment_2 ) ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:979:1: ( ( ( rule__Scenario__TitleAssignment_2 ) ) )
            // InternalCucumber.g:980:1: ( ( rule__Scenario__TitleAssignment_2 ) )
            {
            // InternalCucumber.g:980:1: ( ( rule__Scenario__TitleAssignment_2 ) )
            // InternalCucumber.g:981:2: ( rule__Scenario__TitleAssignment_2 )
            {
             before(grammarAccess.getScenarioAccess().getTitleAssignment_2()); 
            // InternalCucumber.g:982:2: ( rule__Scenario__TitleAssignment_2 )
            // InternalCucumber.g:982:3: rule__Scenario__TitleAssignment_2
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
    // InternalCucumber.g:990:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl rule__Scenario__Group__4 ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:994:1: ( rule__Scenario__Group__3__Impl rule__Scenario__Group__4 )
            // InternalCucumber.g:995:2: rule__Scenario__Group__3__Impl rule__Scenario__Group__4
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
    // InternalCucumber.g:1002:1: rule__Scenario__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1006:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1007:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1007:1: ( RULE_EOL )
            // InternalCucumber.g:1008:2: RULE_EOL
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
    // InternalCucumber.g:1017:1: rule__Scenario__Group__4 : rule__Scenario__Group__4__Impl rule__Scenario__Group__5 ;
    public final void rule__Scenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1021:1: ( rule__Scenario__Group__4__Impl rule__Scenario__Group__5 )
            // InternalCucumber.g:1022:2: rule__Scenario__Group__4__Impl rule__Scenario__Group__5
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
    // InternalCucumber.g:1029:1: rule__Scenario__Group__4__Impl : ( ( rule__Scenario__DescriptionsAssignment_4 )* ) ;
    public final void rule__Scenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1033:1: ( ( ( rule__Scenario__DescriptionsAssignment_4 )* ) )
            // InternalCucumber.g:1034:1: ( ( rule__Scenario__DescriptionsAssignment_4 )* )
            {
            // InternalCucumber.g:1034:1: ( ( rule__Scenario__DescriptionsAssignment_4 )* )
            // InternalCucumber.g:1035:2: ( rule__Scenario__DescriptionsAssignment_4 )*
            {
             before(grammarAccess.getScenarioAccess().getDescriptionsAssignment_4()); 
            // InternalCucumber.g:1036:2: ( rule__Scenario__DescriptionsAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_WORD) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCucumber.g:1036:3: rule__Scenario__DescriptionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Scenario__DescriptionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getDescriptionsAssignment_4()); 

            }


            }

        }
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
    // InternalCucumber.g:1044:1: rule__Scenario__Group__5 : rule__Scenario__Group__5__Impl ;
    public final void rule__Scenario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1048:1: ( rule__Scenario__Group__5__Impl )
            // InternalCucumber.g:1049:2: rule__Scenario__Group__5__Impl
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
    // InternalCucumber.g:1055:1: rule__Scenario__Group__5__Impl : ( ( rule__Scenario__StepsAssignment_5 )* ) ;
    public final void rule__Scenario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1059:1: ( ( ( rule__Scenario__StepsAssignment_5 )* ) )
            // InternalCucumber.g:1060:1: ( ( rule__Scenario__StepsAssignment_5 )* )
            {
            // InternalCucumber.g:1060:1: ( ( rule__Scenario__StepsAssignment_5 )* )
            // InternalCucumber.g:1061:2: ( rule__Scenario__StepsAssignment_5 )*
            {
             before(grammarAccess.getScenarioAccess().getStepsAssignment_5()); 
            // InternalCucumber.g:1062:2: ( rule__Scenario__StepsAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=9 && LA16_0<=14)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCucumber.g:1062:3: rule__Scenario__StepsAssignment_5
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Scenario__StepsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalCucumber.g:1071:1: rule__Scenario__Group_0__0 : rule__Scenario__Group_0__0__Impl rule__Scenario__Group_0__1 ;
    public final void rule__Scenario__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1075:1: ( rule__Scenario__Group_0__0__Impl rule__Scenario__Group_0__1 )
            // InternalCucumber.g:1076:2: rule__Scenario__Group_0__0__Impl rule__Scenario__Group_0__1
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
    // InternalCucumber.g:1083:1: rule__Scenario__Group_0__0__Impl : ( ( rule__Scenario__TagAssignment_0_0 ) ) ;
    public final void rule__Scenario__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1087:1: ( ( ( rule__Scenario__TagAssignment_0_0 ) ) )
            // InternalCucumber.g:1088:1: ( ( rule__Scenario__TagAssignment_0_0 ) )
            {
            // InternalCucumber.g:1088:1: ( ( rule__Scenario__TagAssignment_0_0 ) )
            // InternalCucumber.g:1089:2: ( rule__Scenario__TagAssignment_0_0 )
            {
             before(grammarAccess.getScenarioAccess().getTagAssignment_0_0()); 
            // InternalCucumber.g:1090:2: ( rule__Scenario__TagAssignment_0_0 )
            // InternalCucumber.g:1090:3: rule__Scenario__TagAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__TagAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getTagAssignment_0_0()); 

            }


            }

        }
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
    // InternalCucumber.g:1098:1: rule__Scenario__Group_0__1 : rule__Scenario__Group_0__1__Impl ;
    public final void rule__Scenario__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1102:1: ( rule__Scenario__Group_0__1__Impl )
            // InternalCucumber.g:1103:2: rule__Scenario__Group_0__1__Impl
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
    // InternalCucumber.g:1109:1: rule__Scenario__Group_0__1__Impl : ( RULE_EOL ) ;
    public final void rule__Scenario__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1113:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1114:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1114:1: ( RULE_EOL )
            // InternalCucumber.g:1115:2: RULE_EOL
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
    // InternalCucumber.g:1125:1: rule__ScenarioOutline__Group__0 : rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1 ;
    public final void rule__ScenarioOutline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1129:1: ( rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1 )
            // InternalCucumber.g:1130:2: rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1
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
    // InternalCucumber.g:1137:1: rule__ScenarioOutline__Group__0__Impl : ( ( rule__ScenarioOutline__Group_0__0 )? ) ;
    public final void rule__ScenarioOutline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1141:1: ( ( ( rule__ScenarioOutline__Group_0__0 )? ) )
            // InternalCucumber.g:1142:1: ( ( rule__ScenarioOutline__Group_0__0 )? )
            {
            // InternalCucumber.g:1142:1: ( ( rule__ScenarioOutline__Group_0__0 )? )
            // InternalCucumber.g:1143:2: ( rule__ScenarioOutline__Group_0__0 )?
            {
             before(grammarAccess.getScenarioOutlineAccess().getGroup_0()); 
            // InternalCucumber.g:1144:2: ( rule__ScenarioOutline__Group_0__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_TAG_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCucumber.g:1144:3: rule__ScenarioOutline__Group_0__0
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
    // InternalCucumber.g:1152:1: rule__ScenarioOutline__Group__1 : rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2 ;
    public final void rule__ScenarioOutline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1156:1: ( rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2 )
            // InternalCucumber.g:1157:2: rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2
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
    // InternalCucumber.g:1164:1: rule__ScenarioOutline__Group__1__Impl : ( 'Scenario Outline:' ) ;
    public final void rule__ScenarioOutline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1168:1: ( ( 'Scenario Outline:' ) )
            // InternalCucumber.g:1169:1: ( 'Scenario Outline:' )
            {
            // InternalCucumber.g:1169:1: ( 'Scenario Outline:' )
            // InternalCucumber.g:1170:2: 'Scenario Outline:'
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
    // InternalCucumber.g:1179:1: rule__ScenarioOutline__Group__2 : rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3 ;
    public final void rule__ScenarioOutline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1183:1: ( rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3 )
            // InternalCucumber.g:1184:2: rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3
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
    // InternalCucumber.g:1191:1: rule__ScenarioOutline__Group__2__Impl : ( ( rule__ScenarioOutline__TitleAssignment_2 ) ) ;
    public final void rule__ScenarioOutline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1195:1: ( ( ( rule__ScenarioOutline__TitleAssignment_2 ) ) )
            // InternalCucumber.g:1196:1: ( ( rule__ScenarioOutline__TitleAssignment_2 ) )
            {
            // InternalCucumber.g:1196:1: ( ( rule__ScenarioOutline__TitleAssignment_2 ) )
            // InternalCucumber.g:1197:2: ( rule__ScenarioOutline__TitleAssignment_2 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getTitleAssignment_2()); 
            // InternalCucumber.g:1198:2: ( rule__ScenarioOutline__TitleAssignment_2 )
            // InternalCucumber.g:1198:3: rule__ScenarioOutline__TitleAssignment_2
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
    // InternalCucumber.g:1206:1: rule__ScenarioOutline__Group__3 : rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4 ;
    public final void rule__ScenarioOutline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1210:1: ( rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4 )
            // InternalCucumber.g:1211:2: rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4
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
    // InternalCucumber.g:1218:1: rule__ScenarioOutline__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__ScenarioOutline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1222:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1223:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1223:1: ( RULE_EOL )
            // InternalCucumber.g:1224:2: RULE_EOL
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
    // InternalCucumber.g:1233:1: rule__ScenarioOutline__Group__4 : rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5 ;
    public final void rule__ScenarioOutline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1237:1: ( rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5 )
            // InternalCucumber.g:1238:2: rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5
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
    // InternalCucumber.g:1245:1: rule__ScenarioOutline__Group__4__Impl : ( ( rule__ScenarioOutline__DescriptionsAssignment_4 )* ) ;
    public final void rule__ScenarioOutline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1249:1: ( ( ( rule__ScenarioOutline__DescriptionsAssignment_4 )* ) )
            // InternalCucumber.g:1250:1: ( ( rule__ScenarioOutline__DescriptionsAssignment_4 )* )
            {
            // InternalCucumber.g:1250:1: ( ( rule__ScenarioOutline__DescriptionsAssignment_4 )* )
            // InternalCucumber.g:1251:2: ( rule__ScenarioOutline__DescriptionsAssignment_4 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getDescriptionsAssignment_4()); 
            // InternalCucumber.g:1252:2: ( rule__ScenarioOutline__DescriptionsAssignment_4 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_WORD) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCucumber.g:1252:3: rule__ScenarioOutline__DescriptionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ScenarioOutline__DescriptionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getScenarioOutlineAccess().getDescriptionsAssignment_4()); 

            }


            }

        }
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
    // InternalCucumber.g:1260:1: rule__ScenarioOutline__Group__5 : rule__ScenarioOutline__Group__5__Impl rule__ScenarioOutline__Group__6 ;
    public final void rule__ScenarioOutline__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1264:1: ( rule__ScenarioOutline__Group__5__Impl rule__ScenarioOutline__Group__6 )
            // InternalCucumber.g:1265:2: rule__ScenarioOutline__Group__5__Impl rule__ScenarioOutline__Group__6
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
    // InternalCucumber.g:1272:1: rule__ScenarioOutline__Group__5__Impl : ( ( rule__ScenarioOutline__StepsAssignment_5 )* ) ;
    public final void rule__ScenarioOutline__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1276:1: ( ( ( rule__ScenarioOutline__StepsAssignment_5 )* ) )
            // InternalCucumber.g:1277:1: ( ( rule__ScenarioOutline__StepsAssignment_5 )* )
            {
            // InternalCucumber.g:1277:1: ( ( rule__ScenarioOutline__StepsAssignment_5 )* )
            // InternalCucumber.g:1278:2: ( rule__ScenarioOutline__StepsAssignment_5 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getStepsAssignment_5()); 
            // InternalCucumber.g:1279:2: ( rule__ScenarioOutline__StepsAssignment_5 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=9 && LA19_0<=14)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCucumber.g:1279:3: rule__ScenarioOutline__StepsAssignment_5
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ScenarioOutline__StepsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalCucumber.g:1287:1: rule__ScenarioOutline__Group__6 : rule__ScenarioOutline__Group__6__Impl ;
    public final void rule__ScenarioOutline__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1291:1: ( rule__ScenarioOutline__Group__6__Impl )
            // InternalCucumber.g:1292:2: rule__ScenarioOutline__Group__6__Impl
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
    // InternalCucumber.g:1298:1: rule__ScenarioOutline__Group__6__Impl : ( ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* ) ) ;
    public final void rule__ScenarioOutline__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1302:1: ( ( ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* ) ) )
            // InternalCucumber.g:1303:1: ( ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* ) )
            {
            // InternalCucumber.g:1303:1: ( ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* ) )
            // InternalCucumber.g:1304:2: ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* )
            {
            // InternalCucumber.g:1304:2: ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) )
            // InternalCucumber.g:1305:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_6()); 
            // InternalCucumber.g:1306:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )
            // InternalCucumber.g:1306:4: rule__ScenarioOutline__ExamplesAssignment_6
            {
            pushFollow(FOLLOW_16);
            rule__ScenarioOutline__ExamplesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_6()); 

            }

            // InternalCucumber.g:1309:2: ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* )
            // InternalCucumber.g:1310:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_6()); 
            // InternalCucumber.g:1311:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_TAG_ID) ) {
                    int LA20_2 = input.LA(2);

                    if ( (LA20_2==RULE_EOL) ) {
                        int LA20_4 = input.LA(3);

                        if ( (LA20_4==19) ) {
                            alt20=1;
                        }


                    }


                }
                else if ( (LA20_0==19) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCucumber.g:1311:4: rule__ScenarioOutline__ExamplesAssignment_6
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__ScenarioOutline__ExamplesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalCucumber.g:1321:1: rule__ScenarioOutline__Group_0__0 : rule__ScenarioOutline__Group_0__0__Impl rule__ScenarioOutline__Group_0__1 ;
    public final void rule__ScenarioOutline__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1325:1: ( rule__ScenarioOutline__Group_0__0__Impl rule__ScenarioOutline__Group_0__1 )
            // InternalCucumber.g:1326:2: rule__ScenarioOutline__Group_0__0__Impl rule__ScenarioOutline__Group_0__1
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
    // InternalCucumber.g:1333:1: rule__ScenarioOutline__Group_0__0__Impl : ( ( rule__ScenarioOutline__TagAssignment_0_0 ) ) ;
    public final void rule__ScenarioOutline__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1337:1: ( ( ( rule__ScenarioOutline__TagAssignment_0_0 ) ) )
            // InternalCucumber.g:1338:1: ( ( rule__ScenarioOutline__TagAssignment_0_0 ) )
            {
            // InternalCucumber.g:1338:1: ( ( rule__ScenarioOutline__TagAssignment_0_0 ) )
            // InternalCucumber.g:1339:2: ( rule__ScenarioOutline__TagAssignment_0_0 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getTagAssignment_0_0()); 
            // InternalCucumber.g:1340:2: ( rule__ScenarioOutline__TagAssignment_0_0 )
            // InternalCucumber.g:1340:3: rule__ScenarioOutline__TagAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__TagAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getTagAssignment_0_0()); 

            }


            }

        }
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
    // InternalCucumber.g:1348:1: rule__ScenarioOutline__Group_0__1 : rule__ScenarioOutline__Group_0__1__Impl ;
    public final void rule__ScenarioOutline__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1352:1: ( rule__ScenarioOutline__Group_0__1__Impl )
            // InternalCucumber.g:1353:2: rule__ScenarioOutline__Group_0__1__Impl
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
    // InternalCucumber.g:1359:1: rule__ScenarioOutline__Group_0__1__Impl : ( RULE_EOL ) ;
    public final void rule__ScenarioOutline__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1363:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1364:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1364:1: ( RULE_EOL )
            // InternalCucumber.g:1365:2: RULE_EOL
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
    // InternalCucumber.g:1375:1: rule__Example__Group__0 : rule__Example__Group__0__Impl rule__Example__Group__1 ;
    public final void rule__Example__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1379:1: ( rule__Example__Group__0__Impl rule__Example__Group__1 )
            // InternalCucumber.g:1380:2: rule__Example__Group__0__Impl rule__Example__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalCucumber.g:1387:1: rule__Example__Group__0__Impl : ( ( rule__Example__Group_0__0 )? ) ;
    public final void rule__Example__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1391:1: ( ( ( rule__Example__Group_0__0 )? ) )
            // InternalCucumber.g:1392:1: ( ( rule__Example__Group_0__0 )? )
            {
            // InternalCucumber.g:1392:1: ( ( rule__Example__Group_0__0 )? )
            // InternalCucumber.g:1393:2: ( rule__Example__Group_0__0 )?
            {
             before(grammarAccess.getExampleAccess().getGroup_0()); 
            // InternalCucumber.g:1394:2: ( rule__Example__Group_0__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_TAG_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCucumber.g:1394:3: rule__Example__Group_0__0
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
    // InternalCucumber.g:1402:1: rule__Example__Group__1 : rule__Example__Group__1__Impl rule__Example__Group__2 ;
    public final void rule__Example__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1406:1: ( rule__Example__Group__1__Impl rule__Example__Group__2 )
            // InternalCucumber.g:1407:2: rule__Example__Group__1__Impl rule__Example__Group__2
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
    // InternalCucumber.g:1414:1: rule__Example__Group__1__Impl : ( 'Examples:' ) ;
    public final void rule__Example__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1418:1: ( ( 'Examples:' ) )
            // InternalCucumber.g:1419:1: ( 'Examples:' )
            {
            // InternalCucumber.g:1419:1: ( 'Examples:' )
            // InternalCucumber.g:1420:2: 'Examples:'
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
    // InternalCucumber.g:1429:1: rule__Example__Group__2 : rule__Example__Group__2__Impl rule__Example__Group__3 ;
    public final void rule__Example__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1433:1: ( rule__Example__Group__2__Impl rule__Example__Group__3 )
            // InternalCucumber.g:1434:2: rule__Example__Group__2__Impl rule__Example__Group__3
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
    // InternalCucumber.g:1441:1: rule__Example__Group__2__Impl : ( ( rule__Example__TitleAssignment_2 ) ) ;
    public final void rule__Example__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1445:1: ( ( ( rule__Example__TitleAssignment_2 ) ) )
            // InternalCucumber.g:1446:1: ( ( rule__Example__TitleAssignment_2 ) )
            {
            // InternalCucumber.g:1446:1: ( ( rule__Example__TitleAssignment_2 ) )
            // InternalCucumber.g:1447:2: ( rule__Example__TitleAssignment_2 )
            {
             before(grammarAccess.getExampleAccess().getTitleAssignment_2()); 
            // InternalCucumber.g:1448:2: ( rule__Example__TitleAssignment_2 )
            // InternalCucumber.g:1448:3: rule__Example__TitleAssignment_2
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
    // InternalCucumber.g:1456:1: rule__Example__Group__3 : rule__Example__Group__3__Impl rule__Example__Group__4 ;
    public final void rule__Example__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1460:1: ( rule__Example__Group__3__Impl rule__Example__Group__4 )
            // InternalCucumber.g:1461:2: rule__Example__Group__3__Impl rule__Example__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalCucumber.g:1468:1: rule__Example__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Example__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1472:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1473:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1473:1: ( RULE_EOL )
            // InternalCucumber.g:1474:2: RULE_EOL
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
    // InternalCucumber.g:1483:1: rule__Example__Group__4 : rule__Example__Group__4__Impl rule__Example__Group__5 ;
    public final void rule__Example__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1487:1: ( rule__Example__Group__4__Impl rule__Example__Group__5 )
            // InternalCucumber.g:1488:2: rule__Example__Group__4__Impl rule__Example__Group__5
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
    // InternalCucumber.g:1495:1: rule__Example__Group__4__Impl : ( ( rule__Example__DescriptionsAssignment_4 )* ) ;
    public final void rule__Example__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1499:1: ( ( ( rule__Example__DescriptionsAssignment_4 )* ) )
            // InternalCucumber.g:1500:1: ( ( rule__Example__DescriptionsAssignment_4 )* )
            {
            // InternalCucumber.g:1500:1: ( ( rule__Example__DescriptionsAssignment_4 )* )
            // InternalCucumber.g:1501:2: ( rule__Example__DescriptionsAssignment_4 )*
            {
             before(grammarAccess.getExampleAccess().getDescriptionsAssignment_4()); 
            // InternalCucumber.g:1502:2: ( rule__Example__DescriptionsAssignment_4 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_WORD) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCucumber.g:1502:3: rule__Example__DescriptionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Example__DescriptionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getExampleAccess().getDescriptionsAssignment_4()); 

            }


            }

        }
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
    // InternalCucumber.g:1510:1: rule__Example__Group__5 : rule__Example__Group__5__Impl ;
    public final void rule__Example__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1514:1: ( rule__Example__Group__5__Impl )
            // InternalCucumber.g:1515:2: rule__Example__Group__5__Impl
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
    // InternalCucumber.g:1521:1: rule__Example__Group__5__Impl : ( ( rule__Example__TableAssignment_5 ) ) ;
    public final void rule__Example__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1525:1: ( ( ( rule__Example__TableAssignment_5 ) ) )
            // InternalCucumber.g:1526:1: ( ( rule__Example__TableAssignment_5 ) )
            {
            // InternalCucumber.g:1526:1: ( ( rule__Example__TableAssignment_5 ) )
            // InternalCucumber.g:1527:2: ( rule__Example__TableAssignment_5 )
            {
             before(grammarAccess.getExampleAccess().getTableAssignment_5()); 
            // InternalCucumber.g:1528:2: ( rule__Example__TableAssignment_5 )
            // InternalCucumber.g:1528:3: rule__Example__TableAssignment_5
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


    // $ANTLR start "rule__Example__Group_0__0"
    // InternalCucumber.g:1537:1: rule__Example__Group_0__0 : rule__Example__Group_0__0__Impl rule__Example__Group_0__1 ;
    public final void rule__Example__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1541:1: ( rule__Example__Group_0__0__Impl rule__Example__Group_0__1 )
            // InternalCucumber.g:1542:2: rule__Example__Group_0__0__Impl rule__Example__Group_0__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCucumber.g:1549:1: rule__Example__Group_0__0__Impl : ( ( rule__Example__TagAssignment_0_0 ) ) ;
    public final void rule__Example__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1553:1: ( ( ( rule__Example__TagAssignment_0_0 ) ) )
            // InternalCucumber.g:1554:1: ( ( rule__Example__TagAssignment_0_0 ) )
            {
            // InternalCucumber.g:1554:1: ( ( rule__Example__TagAssignment_0_0 ) )
            // InternalCucumber.g:1555:2: ( rule__Example__TagAssignment_0_0 )
            {
             before(grammarAccess.getExampleAccess().getTagAssignment_0_0()); 
            // InternalCucumber.g:1556:2: ( rule__Example__TagAssignment_0_0 )
            // InternalCucumber.g:1556:3: rule__Example__TagAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Example__TagAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getTagAssignment_0_0()); 

            }


            }

        }
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
    // InternalCucumber.g:1564:1: rule__Example__Group_0__1 : rule__Example__Group_0__1__Impl ;
    public final void rule__Example__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1568:1: ( rule__Example__Group_0__1__Impl )
            // InternalCucumber.g:1569:2: rule__Example__Group_0__1__Impl
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
    // InternalCucumber.g:1575:1: rule__Example__Group_0__1__Impl : ( RULE_EOL ) ;
    public final void rule__Example__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1579:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1580:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1580:1: ( RULE_EOL )
            // InternalCucumber.g:1581:2: RULE_EOL
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


    // $ANTLR start "rule__Description__Group__0"
    // InternalCucumber.g:1591:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1595:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalCucumber.g:1596:2: rule__Description__Group__0__Impl rule__Description__Group__1
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
    // InternalCucumber.g:1603:1: rule__Description__Group__0__Impl : ( ( rule__Description__LineAssignment_0 ) ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1607:1: ( ( ( rule__Description__LineAssignment_0 ) ) )
            // InternalCucumber.g:1608:1: ( ( rule__Description__LineAssignment_0 ) )
            {
            // InternalCucumber.g:1608:1: ( ( rule__Description__LineAssignment_0 ) )
            // InternalCucumber.g:1609:2: ( rule__Description__LineAssignment_0 )
            {
             before(grammarAccess.getDescriptionAccess().getLineAssignment_0()); 
            // InternalCucumber.g:1610:2: ( rule__Description__LineAssignment_0 )
            // InternalCucumber.g:1610:3: rule__Description__LineAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Description__LineAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getLineAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__0__Impl"


    // $ANTLR start "rule__Description__Group__1"
    // InternalCucumber.g:1618:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1622:1: ( rule__Description__Group__1__Impl )
            // InternalCucumber.g:1623:2: rule__Description__Group__1__Impl
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
    // InternalCucumber.g:1629:1: rule__Description__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1633:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1634:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1634:1: ( RULE_EOL )
            // InternalCucumber.g:1635:2: RULE_EOL
            {
             before(grammarAccess.getDescriptionAccess().getEOLTerminalRuleCall_1()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getEOLTerminalRuleCall_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Step__Group__0"
    // InternalCucumber.g:1645:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1649:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // InternalCucumber.g:1650:2: rule__Step__Group__0__Impl rule__Step__Group__1
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
    // InternalCucumber.g:1657:1: rule__Step__Group__0__Impl : ( ( rule__Step__Alternatives_0 ) ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1661:1: ( ( ( rule__Step__Alternatives_0 ) ) )
            // InternalCucumber.g:1662:1: ( ( rule__Step__Alternatives_0 ) )
            {
            // InternalCucumber.g:1662:1: ( ( rule__Step__Alternatives_0 ) )
            // InternalCucumber.g:1663:2: ( rule__Step__Alternatives_0 )
            {
             before(grammarAccess.getStepAccess().getAlternatives_0()); 
            // InternalCucumber.g:1664:2: ( rule__Step__Alternatives_0 )
            // InternalCucumber.g:1664:3: rule__Step__Alternatives_0
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
    // InternalCucumber.g:1672:1: rule__Step__Group__1 : rule__Step__Group__1__Impl rule__Step__Group__2 ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1676:1: ( rule__Step__Group__1__Impl rule__Step__Group__2 )
            // InternalCucumber.g:1677:2: rule__Step__Group__1__Impl rule__Step__Group__2
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
    // InternalCucumber.g:1684:1: rule__Step__Group__1__Impl : ( ( rule__Step__TitleAssignment_1 ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1688:1: ( ( ( rule__Step__TitleAssignment_1 ) ) )
            // InternalCucumber.g:1689:1: ( ( rule__Step__TitleAssignment_1 ) )
            {
            // InternalCucumber.g:1689:1: ( ( rule__Step__TitleAssignment_1 ) )
            // InternalCucumber.g:1690:2: ( rule__Step__TitleAssignment_1 )
            {
             before(grammarAccess.getStepAccess().getTitleAssignment_1()); 
            // InternalCucumber.g:1691:2: ( rule__Step__TitleAssignment_1 )
            // InternalCucumber.g:1691:3: rule__Step__TitleAssignment_1
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
    // InternalCucumber.g:1699:1: rule__Step__Group__2 : rule__Step__Group__2__Impl rule__Step__Group__3 ;
    public final void rule__Step__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1703:1: ( rule__Step__Group__2__Impl rule__Step__Group__3 )
            // InternalCucumber.g:1704:2: rule__Step__Group__2__Impl rule__Step__Group__3
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
    // InternalCucumber.g:1711:1: rule__Step__Group__2__Impl : ( ( RULE_EOL )? ) ;
    public final void rule__Step__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1715:1: ( ( ( RULE_EOL )? ) )
            // InternalCucumber.g:1716:1: ( ( RULE_EOL )? )
            {
            // InternalCucumber.g:1716:1: ( ( RULE_EOL )? )
            // InternalCucumber.g:1717:2: ( RULE_EOL )?
            {
             before(grammarAccess.getStepAccess().getEOLTerminalRuleCall_2()); 
            // InternalCucumber.g:1718:2: ( RULE_EOL )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_EOL) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCucumber.g:1718:3: RULE_EOL
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
    // InternalCucumber.g:1726:1: rule__Step__Group__3 : rule__Step__Group__3__Impl ;
    public final void rule__Step__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1730:1: ( rule__Step__Group__3__Impl )
            // InternalCucumber.g:1731:2: rule__Step__Group__3__Impl
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
    // InternalCucumber.g:1737:1: rule__Step__Group__3__Impl : ( ( rule__Step__Alternatives_3 )? ) ;
    public final void rule__Step__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1741:1: ( ( ( rule__Step__Alternatives_3 )? ) )
            // InternalCucumber.g:1742:1: ( ( rule__Step__Alternatives_3 )? )
            {
            // InternalCucumber.g:1742:1: ( ( rule__Step__Alternatives_3 )? )
            // InternalCucumber.g:1743:2: ( rule__Step__Alternatives_3 )?
            {
             before(grammarAccess.getStepAccess().getAlternatives_3()); 
            // InternalCucumber.g:1744:2: ( rule__Step__Alternatives_3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=20 && LA24_0<=21)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCucumber.g:1744:3: rule__Step__Alternatives_3
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
    // InternalCucumber.g:1753:1: rule__TableRow__Group__0 : rule__TableRow__Group__0__Impl rule__TableRow__Group__1 ;
    public final void rule__TableRow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1757:1: ( rule__TableRow__Group__0__Impl rule__TableRow__Group__1 )
            // InternalCucumber.g:1758:2: rule__TableRow__Group__0__Impl rule__TableRow__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalCucumber.g:1765:1: rule__TableRow__Group__0__Impl : ( ( ( rule__TableRow__CellsAssignment_0 ) ) ( ( rule__TableRow__CellsAssignment_0 )* ) ) ;
    public final void rule__TableRow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1769:1: ( ( ( ( rule__TableRow__CellsAssignment_0 ) ) ( ( rule__TableRow__CellsAssignment_0 )* ) ) )
            // InternalCucumber.g:1770:1: ( ( ( rule__TableRow__CellsAssignment_0 ) ) ( ( rule__TableRow__CellsAssignment_0 )* ) )
            {
            // InternalCucumber.g:1770:1: ( ( ( rule__TableRow__CellsAssignment_0 ) ) ( ( rule__TableRow__CellsAssignment_0 )* ) )
            // InternalCucumber.g:1771:2: ( ( rule__TableRow__CellsAssignment_0 ) ) ( ( rule__TableRow__CellsAssignment_0 )* )
            {
            // InternalCucumber.g:1771:2: ( ( rule__TableRow__CellsAssignment_0 ) )
            // InternalCucumber.g:1772:3: ( rule__TableRow__CellsAssignment_0 )
            {
             before(grammarAccess.getTableRowAccess().getCellsAssignment_0()); 
            // InternalCucumber.g:1773:3: ( rule__TableRow__CellsAssignment_0 )
            // InternalCucumber.g:1773:4: rule__TableRow__CellsAssignment_0
            {
            pushFollow(FOLLOW_3);
            rule__TableRow__CellsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTableRowAccess().getCellsAssignment_0()); 

            }

            // InternalCucumber.g:1776:2: ( ( rule__TableRow__CellsAssignment_0 )* )
            // InternalCucumber.g:1777:3: ( rule__TableRow__CellsAssignment_0 )*
            {
             before(grammarAccess.getTableRowAccess().getCellsAssignment_0()); 
            // InternalCucumber.g:1778:3: ( rule__TableRow__CellsAssignment_0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==20) ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==RULE_WORD) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // InternalCucumber.g:1778:4: rule__TableRow__CellsAssignment_0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__TableRow__CellsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalCucumber.g:1787:1: rule__TableRow__Group__1 : rule__TableRow__Group__1__Impl rule__TableRow__Group__2 ;
    public final void rule__TableRow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1791:1: ( rule__TableRow__Group__1__Impl rule__TableRow__Group__2 )
            // InternalCucumber.g:1792:2: rule__TableRow__Group__1__Impl rule__TableRow__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalCucumber.g:1799:1: rule__TableRow__Group__1__Impl : ( '|' ) ;
    public final void rule__TableRow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1803:1: ( ( '|' ) )
            // InternalCucumber.g:1804:1: ( '|' )
            {
            // InternalCucumber.g:1804:1: ( '|' )
            // InternalCucumber.g:1805:2: '|'
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
    // InternalCucumber.g:1814:1: rule__TableRow__Group__2 : rule__TableRow__Group__2__Impl ;
    public final void rule__TableRow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1818:1: ( rule__TableRow__Group__2__Impl )
            // InternalCucumber.g:1819:2: rule__TableRow__Group__2__Impl
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
    // InternalCucumber.g:1825:1: rule__TableRow__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__TableRow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1829:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1830:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1830:1: ( RULE_EOL )
            // InternalCucumber.g:1831:2: RULE_EOL
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
    // InternalCucumber.g:1841:1: rule__RowCell__Group__0 : rule__RowCell__Group__0__Impl rule__RowCell__Group__1 ;
    public final void rule__RowCell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1845:1: ( rule__RowCell__Group__0__Impl rule__RowCell__Group__1 )
            // InternalCucumber.g:1846:2: rule__RowCell__Group__0__Impl rule__RowCell__Group__1
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
    // InternalCucumber.g:1853:1: rule__RowCell__Group__0__Impl : ( ( rule__RowCell__CellAssignment_0 ) ) ;
    public final void rule__RowCell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1857:1: ( ( ( rule__RowCell__CellAssignment_0 ) ) )
            // InternalCucumber.g:1858:1: ( ( rule__RowCell__CellAssignment_0 ) )
            {
            // InternalCucumber.g:1858:1: ( ( rule__RowCell__CellAssignment_0 ) )
            // InternalCucumber.g:1859:2: ( rule__RowCell__CellAssignment_0 )
            {
             before(grammarAccess.getRowCellAccess().getCellAssignment_0()); 
            // InternalCucumber.g:1860:2: ( rule__RowCell__CellAssignment_0 )
            // InternalCucumber.g:1860:3: rule__RowCell__CellAssignment_0
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
    // InternalCucumber.g:1868:1: rule__RowCell__Group__1 : rule__RowCell__Group__1__Impl ;
    public final void rule__RowCell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1872:1: ( rule__RowCell__Group__1__Impl )
            // InternalCucumber.g:1873:2: rule__RowCell__Group__1__Impl
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
    // InternalCucumber.g:1879:1: rule__RowCell__Group__1__Impl : ( ruleSentence ) ;
    public final void rule__RowCell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1883:1: ( ( ruleSentence ) )
            // InternalCucumber.g:1884:1: ( ruleSentence )
            {
            // InternalCucumber.g:1884:1: ( ruleSentence )
            // InternalCucumber.g:1885:2: ruleSentence
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
    // InternalCucumber.g:1895:1: rule__DocString__Group__0 : rule__DocString__Group__0__Impl rule__DocString__Group__1 ;
    public final void rule__DocString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1899:1: ( rule__DocString__Group__0__Impl rule__DocString__Group__1 )
            // InternalCucumber.g:1900:2: rule__DocString__Group__0__Impl rule__DocString__Group__1
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
    // InternalCucumber.g:1907:1: rule__DocString__Group__0__Impl : ( () ) ;
    public final void rule__DocString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1911:1: ( ( () ) )
            // InternalCucumber.g:1912:1: ( () )
            {
            // InternalCucumber.g:1912:1: ( () )
            // InternalCucumber.g:1913:2: ()
            {
             before(grammarAccess.getDocStringAccess().getDocStringAction_0()); 
            // InternalCucumber.g:1914:2: ()
            // InternalCucumber.g:1914:3: 
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
    // InternalCucumber.g:1922:1: rule__DocString__Group__1 : rule__DocString__Group__1__Impl rule__DocString__Group__2 ;
    public final void rule__DocString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1926:1: ( rule__DocString__Group__1__Impl rule__DocString__Group__2 )
            // InternalCucumber.g:1927:2: rule__DocString__Group__1__Impl rule__DocString__Group__2
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
    // InternalCucumber.g:1934:1: rule__DocString__Group__1__Impl : ( '\"\"\"' ) ;
    public final void rule__DocString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1938:1: ( ( '\"\"\"' ) )
            // InternalCucumber.g:1939:1: ( '\"\"\"' )
            {
            // InternalCucumber.g:1939:1: ( '\"\"\"' )
            // InternalCucumber.g:1940:2: '\"\"\"'
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
    // InternalCucumber.g:1949:1: rule__DocString__Group__2 : rule__DocString__Group__2__Impl rule__DocString__Group__3 ;
    public final void rule__DocString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1953:1: ( rule__DocString__Group__2__Impl rule__DocString__Group__3 )
            // InternalCucumber.g:1954:2: rule__DocString__Group__2__Impl rule__DocString__Group__3
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
    // InternalCucumber.g:1961:1: rule__DocString__Group__2__Impl : ( ( rule__DocString__Alternatives_2 )* ) ;
    public final void rule__DocString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1965:1: ( ( ( rule__DocString__Alternatives_2 )* ) )
            // InternalCucumber.g:1966:1: ( ( rule__DocString__Alternatives_2 )* )
            {
            // InternalCucumber.g:1966:1: ( ( rule__DocString__Alternatives_2 )* )
            // InternalCucumber.g:1967:2: ( rule__DocString__Alternatives_2 )*
            {
             before(grammarAccess.getDocStringAccess().getAlternatives_2()); 
            // InternalCucumber.g:1968:2: ( rule__DocString__Alternatives_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_WORD && LA26_0<=RULE_EOL)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalCucumber.g:1968:3: rule__DocString__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__DocString__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalCucumber.g:1976:1: rule__DocString__Group__3 : rule__DocString__Group__3__Impl rule__DocString__Group__4 ;
    public final void rule__DocString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1980:1: ( rule__DocString__Group__3__Impl rule__DocString__Group__4 )
            // InternalCucumber.g:1981:2: rule__DocString__Group__3__Impl rule__DocString__Group__4
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
    // InternalCucumber.g:1988:1: rule__DocString__Group__3__Impl : ( '\"\"\"' ) ;
    public final void rule__DocString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1992:1: ( ( '\"\"\"' ) )
            // InternalCucumber.g:1993:1: ( '\"\"\"' )
            {
            // InternalCucumber.g:1993:1: ( '\"\"\"' )
            // InternalCucumber.g:1994:2: '\"\"\"'
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
    // InternalCucumber.g:2003:1: rule__DocString__Group__4 : rule__DocString__Group__4__Impl ;
    public final void rule__DocString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2007:1: ( rule__DocString__Group__4__Impl )
            // InternalCucumber.g:2008:2: rule__DocString__Group__4__Impl
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
    // InternalCucumber.g:2014:1: rule__DocString__Group__4__Impl : ( RULE_EOL ) ;
    public final void rule__DocString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2018:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2019:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2019:1: ( RULE_EOL )
            // InternalCucumber.g:2020:2: RULE_EOL
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


    // $ANTLR start "rule__Feature__TagsAssignment_0_0"
    // InternalCucumber.g:2030:1: rule__Feature__TagsAssignment_0_0 : ( ruleTag ) ;
    public final void rule__Feature__TagsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2034:1: ( ( ruleTag ) )
            // InternalCucumber.g:2035:2: ( ruleTag )
            {
            // InternalCucumber.g:2035:2: ( ruleTag )
            // InternalCucumber.g:2036:3: ruleTag
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


    // $ANTLR start "rule__Feature__TitleAssignment_2"
    // InternalCucumber.g:2045:1: rule__Feature__TitleAssignment_2 : ( ruleSentence ) ;
    public final void rule__Feature__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2049:1: ( ( ruleSentence ) )
            // InternalCucumber.g:2050:2: ( ruleSentence )
            {
            // InternalCucumber.g:2050:2: ( ruleSentence )
            // InternalCucumber.g:2051:3: ruleSentence
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


    // $ANTLR start "rule__Feature__DescriptionsAssignment_4"
    // InternalCucumber.g:2060:1: rule__Feature__DescriptionsAssignment_4 : ( ruleDescription ) ;
    public final void rule__Feature__DescriptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2064:1: ( ( ruleDescription ) )
            // InternalCucumber.g:2065:2: ( ruleDescription )
            {
            // InternalCucumber.g:2065:2: ( ruleDescription )
            // InternalCucumber.g:2066:3: ruleDescription
            {
             before(grammarAccess.getFeatureAccess().getDescriptionsDescriptionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getDescriptionsDescriptionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__DescriptionsAssignment_4"


    // $ANTLR start "rule__Feature__BackgroundAssignment_5"
    // InternalCucumber.g:2075:1: rule__Feature__BackgroundAssignment_5 : ( ruleBackground ) ;
    public final void rule__Feature__BackgroundAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2079:1: ( ( ruleBackground ) )
            // InternalCucumber.g:2080:2: ( ruleBackground )
            {
            // InternalCucumber.g:2080:2: ( ruleBackground )
            // InternalCucumber.g:2081:3: ruleBackground
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
    // InternalCucumber.g:2090:1: rule__Feature__ScenariosAssignment_6 : ( ruleAbstractScenario ) ;
    public final void rule__Feature__ScenariosAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2094:1: ( ( ruleAbstractScenario ) )
            // InternalCucumber.g:2095:2: ( ruleAbstractScenario )
            {
            // InternalCucumber.g:2095:2: ( ruleAbstractScenario )
            // InternalCucumber.g:2096:3: ruleAbstractScenario
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
    // InternalCucumber.g:2105:1: rule__Background__TitleAssignment_1 : ( ruleSentence ) ;
    public final void rule__Background__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2109:1: ( ( ruleSentence ) )
            // InternalCucumber.g:2110:2: ( ruleSentence )
            {
            // InternalCucumber.g:2110:2: ( ruleSentence )
            // InternalCucumber.g:2111:3: ruleSentence
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


    // $ANTLR start "rule__Background__DescriptionsAssignment_3"
    // InternalCucumber.g:2120:1: rule__Background__DescriptionsAssignment_3 : ( ruleDescription ) ;
    public final void rule__Background__DescriptionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2124:1: ( ( ruleDescription ) )
            // InternalCucumber.g:2125:2: ( ruleDescription )
            {
            // InternalCucumber.g:2125:2: ( ruleDescription )
            // InternalCucumber.g:2126:3: ruleDescription
            {
             before(grammarAccess.getBackgroundAccess().getDescriptionsDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getDescriptionsDescriptionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__DescriptionsAssignment_3"


    // $ANTLR start "rule__Background__StepsAssignment_4"
    // InternalCucumber.g:2135:1: rule__Background__StepsAssignment_4 : ( ruleStep ) ;
    public final void rule__Background__StepsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2139:1: ( ( ruleStep ) )
            // InternalCucumber.g:2140:2: ( ruleStep )
            {
            // InternalCucumber.g:2140:2: ( ruleStep )
            // InternalCucumber.g:2141:3: ruleStep
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


    // $ANTLR start "rule__Scenario__TagAssignment_0_0"
    // InternalCucumber.g:2150:1: rule__Scenario__TagAssignment_0_0 : ( ruleTag ) ;
    public final void rule__Scenario__TagAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2154:1: ( ( ruleTag ) )
            // InternalCucumber.g:2155:2: ( ruleTag )
            {
            // InternalCucumber.g:2155:2: ( ruleTag )
            // InternalCucumber.g:2156:3: ruleTag
            {
             before(grammarAccess.getScenarioAccess().getTagTagParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getTagTagParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__TagAssignment_0_0"


    // $ANTLR start "rule__Scenario__TitleAssignment_2"
    // InternalCucumber.g:2165:1: rule__Scenario__TitleAssignment_2 : ( ruleSentence ) ;
    public final void rule__Scenario__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2169:1: ( ( ruleSentence ) )
            // InternalCucumber.g:2170:2: ( ruleSentence )
            {
            // InternalCucumber.g:2170:2: ( ruleSentence )
            // InternalCucumber.g:2171:3: ruleSentence
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


    // $ANTLR start "rule__Scenario__DescriptionsAssignment_4"
    // InternalCucumber.g:2180:1: rule__Scenario__DescriptionsAssignment_4 : ( ruleDescription ) ;
    public final void rule__Scenario__DescriptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2184:1: ( ( ruleDescription ) )
            // InternalCucumber.g:2185:2: ( ruleDescription )
            {
            // InternalCucumber.g:2185:2: ( ruleDescription )
            // InternalCucumber.g:2186:3: ruleDescription
            {
             before(grammarAccess.getScenarioAccess().getDescriptionsDescriptionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getDescriptionsDescriptionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__DescriptionsAssignment_4"


    // $ANTLR start "rule__Scenario__StepsAssignment_5"
    // InternalCucumber.g:2195:1: rule__Scenario__StepsAssignment_5 : ( ruleStep ) ;
    public final void rule__Scenario__StepsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2199:1: ( ( ruleStep ) )
            // InternalCucumber.g:2200:2: ( ruleStep )
            {
            // InternalCucumber.g:2200:2: ( ruleStep )
            // InternalCucumber.g:2201:3: ruleStep
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


    // $ANTLR start "rule__ScenarioOutline__TagAssignment_0_0"
    // InternalCucumber.g:2210:1: rule__ScenarioOutline__TagAssignment_0_0 : ( ruleTag ) ;
    public final void rule__ScenarioOutline__TagAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2214:1: ( ( ruleTag ) )
            // InternalCucumber.g:2215:2: ( ruleTag )
            {
            // InternalCucumber.g:2215:2: ( ruleTag )
            // InternalCucumber.g:2216:3: ruleTag
            {
             before(grammarAccess.getScenarioOutlineAccess().getTagTagParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getTagTagParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__TagAssignment_0_0"


    // $ANTLR start "rule__ScenarioOutline__TitleAssignment_2"
    // InternalCucumber.g:2225:1: rule__ScenarioOutline__TitleAssignment_2 : ( ruleSentence ) ;
    public final void rule__ScenarioOutline__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2229:1: ( ( ruleSentence ) )
            // InternalCucumber.g:2230:2: ( ruleSentence )
            {
            // InternalCucumber.g:2230:2: ( ruleSentence )
            // InternalCucumber.g:2231:3: ruleSentence
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


    // $ANTLR start "rule__ScenarioOutline__DescriptionsAssignment_4"
    // InternalCucumber.g:2240:1: rule__ScenarioOutline__DescriptionsAssignment_4 : ( ruleDescription ) ;
    public final void rule__ScenarioOutline__DescriptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2244:1: ( ( ruleDescription ) )
            // InternalCucumber.g:2245:2: ( ruleDescription )
            {
            // InternalCucumber.g:2245:2: ( ruleDescription )
            // InternalCucumber.g:2246:3: ruleDescription
            {
             before(grammarAccess.getScenarioOutlineAccess().getDescriptionsDescriptionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getDescriptionsDescriptionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__DescriptionsAssignment_4"


    // $ANTLR start "rule__ScenarioOutline__StepsAssignment_5"
    // InternalCucumber.g:2255:1: rule__ScenarioOutline__StepsAssignment_5 : ( ruleStep ) ;
    public final void rule__ScenarioOutline__StepsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2259:1: ( ( ruleStep ) )
            // InternalCucumber.g:2260:2: ( ruleStep )
            {
            // InternalCucumber.g:2260:2: ( ruleStep )
            // InternalCucumber.g:2261:3: ruleStep
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
    // InternalCucumber.g:2270:1: rule__ScenarioOutline__ExamplesAssignment_6 : ( ruleExample ) ;
    public final void rule__ScenarioOutline__ExamplesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2274:1: ( ( ruleExample ) )
            // InternalCucumber.g:2275:2: ( ruleExample )
            {
            // InternalCucumber.g:2275:2: ( ruleExample )
            // InternalCucumber.g:2276:3: ruleExample
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


    // $ANTLR start "rule__Example__TagAssignment_0_0"
    // InternalCucumber.g:2285:1: rule__Example__TagAssignment_0_0 : ( ruleTag ) ;
    public final void rule__Example__TagAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2289:1: ( ( ruleTag ) )
            // InternalCucumber.g:2290:2: ( ruleTag )
            {
            // InternalCucumber.g:2290:2: ( ruleTag )
            // InternalCucumber.g:2291:3: ruleTag
            {
             before(grammarAccess.getExampleAccess().getTagTagParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getTagTagParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__TagAssignment_0_0"


    // $ANTLR start "rule__Example__TitleAssignment_2"
    // InternalCucumber.g:2300:1: rule__Example__TitleAssignment_2 : ( ruleSentence ) ;
    public final void rule__Example__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2304:1: ( ( ruleSentence ) )
            // InternalCucumber.g:2305:2: ( ruleSentence )
            {
            // InternalCucumber.g:2305:2: ( ruleSentence )
            // InternalCucumber.g:2306:3: ruleSentence
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


    // $ANTLR start "rule__Example__DescriptionsAssignment_4"
    // InternalCucumber.g:2315:1: rule__Example__DescriptionsAssignment_4 : ( ruleDescription ) ;
    public final void rule__Example__DescriptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2319:1: ( ( ruleDescription ) )
            // InternalCucumber.g:2320:2: ( ruleDescription )
            {
            // InternalCucumber.g:2320:2: ( ruleDescription )
            // InternalCucumber.g:2321:3: ruleDescription
            {
             before(grammarAccess.getExampleAccess().getDescriptionsDescriptionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getDescriptionsDescriptionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__DescriptionsAssignment_4"


    // $ANTLR start "rule__Example__TableAssignment_5"
    // InternalCucumber.g:2330:1: rule__Example__TableAssignment_5 : ( ruleTable ) ;
    public final void rule__Example__TableAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2334:1: ( ( ruleTable ) )
            // InternalCucumber.g:2335:2: ( ruleTable )
            {
            // InternalCucumber.g:2335:2: ( ruleTable )
            // InternalCucumber.g:2336:3: ruleTable
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


    // $ANTLR start "rule__Description__LineAssignment_0"
    // InternalCucumber.g:2345:1: rule__Description__LineAssignment_0 : ( ruleSentence ) ;
    public final void rule__Description__LineAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2349:1: ( ( ruleSentence ) )
            // InternalCucumber.g:2350:2: ( ruleSentence )
            {
            // InternalCucumber.g:2350:2: ( ruleSentence )
            // InternalCucumber.g:2351:3: ruleSentence
            {
             before(grammarAccess.getDescriptionAccess().getLineSentenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getDescriptionAccess().getLineSentenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__LineAssignment_0"


    // $ANTLR start "rule__Step__TitleAssignment_1"
    // InternalCucumber.g:2360:1: rule__Step__TitleAssignment_1 : ( ruleSentence ) ;
    public final void rule__Step__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2364:1: ( ( ruleSentence ) )
            // InternalCucumber.g:2365:2: ( ruleSentence )
            {
            // InternalCucumber.g:2365:2: ( ruleSentence )
            // InternalCucumber.g:2366:3: ruleSentence
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
    // InternalCucumber.g:2375:1: rule__Step__TableAssignment_3_0 : ( ruleTable ) ;
    public final void rule__Step__TableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2379:1: ( ( ruleTable ) )
            // InternalCucumber.g:2380:2: ( ruleTable )
            {
            // InternalCucumber.g:2380:2: ( ruleTable )
            // InternalCucumber.g:2381:3: ruleTable
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
    // InternalCucumber.g:2390:1: rule__Step__TextAssignment_3_1 : ( ruleDocString ) ;
    public final void rule__Step__TextAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2394:1: ( ( ruleDocString ) )
            // InternalCucumber.g:2395:2: ( ruleDocString )
            {
            // InternalCucumber.g:2395:2: ( ruleDocString )
            // InternalCucumber.g:2396:3: ruleDocString
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
    // InternalCucumber.g:2405:1: rule__Table__RowsAssignment : ( ruleTableRow ) ;
    public final void rule__Table__RowsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2409:1: ( ( ruleTableRow ) )
            // InternalCucumber.g:2410:2: ( ruleTableRow )
            {
            // InternalCucumber.g:2410:2: ( ruleTableRow )
            // InternalCucumber.g:2411:3: ruleTableRow
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
    // InternalCucumber.g:2420:1: rule__TableRow__CellsAssignment_0 : ( ruleRowCell ) ;
    public final void rule__TableRow__CellsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2424:1: ( ( ruleRowCell ) )
            // InternalCucumber.g:2425:2: ( ruleRowCell )
            {
            // InternalCucumber.g:2425:2: ( ruleRowCell )
            // InternalCucumber.g:2426:3: ruleRowCell
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
    // InternalCucumber.g:2435:1: rule__RowCell__CellAssignment_0 : ( ( '|' ) ) ;
    public final void rule__RowCell__CellAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2439:1: ( ( ( '|' ) ) )
            // InternalCucumber.g:2440:2: ( ( '|' ) )
            {
            // InternalCucumber.g:2440:2: ( ( '|' ) )
            // InternalCucumber.g:2441:3: ( '|' )
            {
             before(grammarAccess.getRowCellAccess().getCellVerticalLineKeyword_0_0()); 
            // InternalCucumber.g:2442:3: ( '|' )
            // InternalCucumber.g:2443:4: '|'
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


    // $ANTLR start "rule__Tag__TagAssignment"
    // InternalCucumber.g:2454:1: rule__Tag__TagAssignment : ( RULE_TAG_ID ) ;
    public final void rule__Tag__TagAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2458:1: ( ( RULE_TAG_ID ) )
            // InternalCucumber.g:2459:2: ( RULE_TAG_ID )
            {
            // InternalCucumber.g:2459:2: ( RULE_TAG_ID )
            // InternalCucumber.g:2460:3: RULE_TAG_ID
            {
             before(grammarAccess.getTagAccess().getTagTAG_IDTerminalRuleCall_0()); 
            match(input,RULE_TAG_ID,FOLLOW_2); 
             after(grammarAccess.getTagAccess().getTagTAG_IDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__TagAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000070050L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060042L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000007E10L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000007E02L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000060040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000087E50L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000087E52L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000300030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000300010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000032L});

}
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_TAG", "RULE_WORD", "RULE_WS", "RULE_COMMENT", "'Given'", "'When'", "'Then'", "'And'", "'But'", "'*'", "'Feature:'", "'Background:'", "'Scenario:'", "'Scenario Outline:'", "'Examples:'", "'|'", "'\"\"\"'"
    };
    public static final int RULE_WORD=6;
    public static final int RULE_TAG=5;
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
    public static final int RULE_EOL=4;
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


    // $ANTLR start "entryRuleScenario"
    // InternalCucumber.g:103:1: entryRuleScenario : ruleScenario EOF ;
    public final void entryRuleScenario() throws RecognitionException {
        try {
            // InternalCucumber.g:104:1: ( ruleScenario EOF )
            // InternalCucumber.g:105:1: ruleScenario EOF
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
    // InternalCucumber.g:112:1: ruleScenario : ( ( rule__Scenario__Group__0 ) ) ;
    public final void ruleScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:116:2: ( ( ( rule__Scenario__Group__0 ) ) )
            // InternalCucumber.g:117:2: ( ( rule__Scenario__Group__0 ) )
            {
            // InternalCucumber.g:117:2: ( ( rule__Scenario__Group__0 ) )
            // InternalCucumber.g:118:3: ( rule__Scenario__Group__0 )
            {
             before(grammarAccess.getScenarioAccess().getGroup()); 
            // InternalCucumber.g:119:3: ( rule__Scenario__Group__0 )
            // InternalCucumber.g:119:4: rule__Scenario__Group__0
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
    // InternalCucumber.g:128:1: entryRuleScenarioOutline : ruleScenarioOutline EOF ;
    public final void entryRuleScenarioOutline() throws RecognitionException {
        try {
            // InternalCucumber.g:129:1: ( ruleScenarioOutline EOF )
            // InternalCucumber.g:130:1: ruleScenarioOutline EOF
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
    // InternalCucumber.g:137:1: ruleScenarioOutline : ( ( rule__ScenarioOutline__Group__0 ) ) ;
    public final void ruleScenarioOutline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:141:2: ( ( ( rule__ScenarioOutline__Group__0 ) ) )
            // InternalCucumber.g:142:2: ( ( rule__ScenarioOutline__Group__0 ) )
            {
            // InternalCucumber.g:142:2: ( ( rule__ScenarioOutline__Group__0 ) )
            // InternalCucumber.g:143:3: ( rule__ScenarioOutline__Group__0 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getGroup()); 
            // InternalCucumber.g:144:3: ( rule__ScenarioOutline__Group__0 )
            // InternalCucumber.g:144:4: rule__ScenarioOutline__Group__0
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
    // InternalCucumber.g:153:1: entryRuleExample : ruleExample EOF ;
    public final void entryRuleExample() throws RecognitionException {
        try {
            // InternalCucumber.g:154:1: ( ruleExample EOF )
            // InternalCucumber.g:155:1: ruleExample EOF
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
    // InternalCucumber.g:162:1: ruleExample : ( ( rule__Example__Group__0 ) ) ;
    public final void ruleExample() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:166:2: ( ( ( rule__Example__Group__0 ) ) )
            // InternalCucumber.g:167:2: ( ( rule__Example__Group__0 ) )
            {
            // InternalCucumber.g:167:2: ( ( rule__Example__Group__0 ) )
            // InternalCucumber.g:168:3: ( rule__Example__Group__0 )
            {
             before(grammarAccess.getExampleAccess().getGroup()); 
            // InternalCucumber.g:169:3: ( rule__Example__Group__0 )
            // InternalCucumber.g:169:4: rule__Example__Group__0
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
    // InternalCucumber.g:178:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalCucumber.g:179:1: ( ruleStep EOF )
            // InternalCucumber.g:180:1: ruleStep EOF
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
    // InternalCucumber.g:187:1: ruleStep : ( ( rule__Step__Group__0 ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:191:2: ( ( ( rule__Step__Group__0 ) ) )
            // InternalCucumber.g:192:2: ( ( rule__Step__Group__0 ) )
            {
            // InternalCucumber.g:192:2: ( ( rule__Step__Group__0 ) )
            // InternalCucumber.g:193:3: ( rule__Step__Group__0 )
            {
             before(grammarAccess.getStepAccess().getGroup()); 
            // InternalCucumber.g:194:3: ( rule__Step__Group__0 )
            // InternalCucumber.g:194:4: rule__Step__Group__0
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
    // InternalCucumber.g:203:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalCucumber.g:204:1: ( ruleTable EOF )
            // InternalCucumber.g:205:1: ruleTable EOF
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
    // InternalCucumber.g:212:1: ruleTable : ( ( ( rule__Table__RowsAssignment ) ) ( ( rule__Table__RowsAssignment )* ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:216:2: ( ( ( ( rule__Table__RowsAssignment ) ) ( ( rule__Table__RowsAssignment )* ) ) )
            // InternalCucumber.g:217:2: ( ( ( rule__Table__RowsAssignment ) ) ( ( rule__Table__RowsAssignment )* ) )
            {
            // InternalCucumber.g:217:2: ( ( ( rule__Table__RowsAssignment ) ) ( ( rule__Table__RowsAssignment )* ) )
            // InternalCucumber.g:218:3: ( ( rule__Table__RowsAssignment ) ) ( ( rule__Table__RowsAssignment )* )
            {
            // InternalCucumber.g:218:3: ( ( rule__Table__RowsAssignment ) )
            // InternalCucumber.g:219:4: ( rule__Table__RowsAssignment )
            {
             before(grammarAccess.getTableAccess().getRowsAssignment()); 
            // InternalCucumber.g:220:4: ( rule__Table__RowsAssignment )
            // InternalCucumber.g:220:5: rule__Table__RowsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Table__RowsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getRowsAssignment()); 

            }

            // InternalCucumber.g:223:3: ( ( rule__Table__RowsAssignment )* )
            // InternalCucumber.g:224:4: ( rule__Table__RowsAssignment )*
            {
             before(grammarAccess.getTableAccess().getRowsAssignment()); 
            // InternalCucumber.g:225:4: ( rule__Table__RowsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCucumber.g:225:5: rule__Table__RowsAssignment
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
    // InternalCucumber.g:235:1: entryRuleTableRow : ruleTableRow EOF ;
    public final void entryRuleTableRow() throws RecognitionException {
        try {
            // InternalCucumber.g:236:1: ( ruleTableRow EOF )
            // InternalCucumber.g:237:1: ruleTableRow EOF
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
    // InternalCucumber.g:244:1: ruleTableRow : ( ( rule__TableRow__Group__0 ) ) ;
    public final void ruleTableRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:248:2: ( ( ( rule__TableRow__Group__0 ) ) )
            // InternalCucumber.g:249:2: ( ( rule__TableRow__Group__0 ) )
            {
            // InternalCucumber.g:249:2: ( ( rule__TableRow__Group__0 ) )
            // InternalCucumber.g:250:3: ( rule__TableRow__Group__0 )
            {
             before(grammarAccess.getTableRowAccess().getGroup()); 
            // InternalCucumber.g:251:3: ( rule__TableRow__Group__0 )
            // InternalCucumber.g:251:4: rule__TableRow__Group__0
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
    // InternalCucumber.g:260:1: entryRuleRowCell : ruleRowCell EOF ;
    public final void entryRuleRowCell() throws RecognitionException {
        try {
            // InternalCucumber.g:261:1: ( ruleRowCell EOF )
            // InternalCucumber.g:262:1: ruleRowCell EOF
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
    // InternalCucumber.g:269:1: ruleRowCell : ( ( rule__RowCell__Group__0 ) ) ;
    public final void ruleRowCell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:273:2: ( ( ( rule__RowCell__Group__0 ) ) )
            // InternalCucumber.g:274:2: ( ( rule__RowCell__Group__0 ) )
            {
            // InternalCucumber.g:274:2: ( ( rule__RowCell__Group__0 ) )
            // InternalCucumber.g:275:3: ( rule__RowCell__Group__0 )
            {
             before(grammarAccess.getRowCellAccess().getGroup()); 
            // InternalCucumber.g:276:3: ( rule__RowCell__Group__0 )
            // InternalCucumber.g:276:4: rule__RowCell__Group__0
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
    // InternalCucumber.g:285:1: entryRuleDocString : ruleDocString EOF ;
    public final void entryRuleDocString() throws RecognitionException {
        try {
            // InternalCucumber.g:286:1: ( ruleDocString EOF )
            // InternalCucumber.g:287:1: ruleDocString EOF
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
    // InternalCucumber.g:294:1: ruleDocString : ( ( rule__DocString__Group__0 ) ) ;
    public final void ruleDocString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:298:2: ( ( ( rule__DocString__Group__0 ) ) )
            // InternalCucumber.g:299:2: ( ( rule__DocString__Group__0 ) )
            {
            // InternalCucumber.g:299:2: ( ( rule__DocString__Group__0 ) )
            // InternalCucumber.g:300:3: ( rule__DocString__Group__0 )
            {
             before(grammarAccess.getDocStringAccess().getGroup()); 
            // InternalCucumber.g:301:3: ( rule__DocString__Group__0 )
            // InternalCucumber.g:301:4: rule__DocString__Group__0
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
    // InternalCucumber.g:310:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalCucumber.g:311:1: ( ruleDescription EOF )
            // InternalCucumber.g:312:1: ruleDescription EOF
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
    // InternalCucumber.g:319:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:323:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalCucumber.g:324:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalCucumber.g:324:2: ( ( rule__Description__Group__0 ) )
            // InternalCucumber.g:325:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalCucumber.g:326:3: ( rule__Description__Group__0 )
            // InternalCucumber.g:326:4: rule__Description__Group__0
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
    // InternalCucumber.g:335:1: entryRuleTags : ruleTags EOF ;
    public final void entryRuleTags() throws RecognitionException {
        try {
            // InternalCucumber.g:336:1: ( ruleTags EOF )
            // InternalCucumber.g:337:1: ruleTags EOF
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
    // InternalCucumber.g:344:1: ruleTags : ( ( rule__Tags__Group__0 ) ) ;
    public final void ruleTags() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:348:2: ( ( ( rule__Tags__Group__0 ) ) )
            // InternalCucumber.g:349:2: ( ( rule__Tags__Group__0 ) )
            {
            // InternalCucumber.g:349:2: ( ( rule__Tags__Group__0 ) )
            // InternalCucumber.g:350:3: ( rule__Tags__Group__0 )
            {
             before(grammarAccess.getTagsAccess().getGroup()); 
            // InternalCucumber.g:351:3: ( rule__Tags__Group__0 )
            // InternalCucumber.g:351:4: rule__Tags__Group__0
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
    // InternalCucumber.g:360:1: entryRuleSentence : ruleSentence EOF ;
    public final void entryRuleSentence() throws RecognitionException {
        try {
            // InternalCucumber.g:361:1: ( ruleSentence EOF )
            // InternalCucumber.g:362:1: ruleSentence EOF
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
    // InternalCucumber.g:369:1: ruleSentence : ( ( rule__Sentence__Group__0 ) ) ;
    public final void ruleSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:373:2: ( ( ( rule__Sentence__Group__0 ) ) )
            // InternalCucumber.g:374:2: ( ( rule__Sentence__Group__0 ) )
            {
            // InternalCucumber.g:374:2: ( ( rule__Sentence__Group__0 ) )
            // InternalCucumber.g:375:3: ( rule__Sentence__Group__0 )
            {
             before(grammarAccess.getSentenceAccess().getGroup()); 
            // InternalCucumber.g:376:3: ( rule__Sentence__Group__0 )
            // InternalCucumber.g:376:4: rule__Sentence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sentence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "rule__Feature__ScenariosAlternatives_5_0"
    // InternalCucumber.g:384:1: rule__Feature__ScenariosAlternatives_5_0 : ( ( ruleScenario ) | ( ruleScenarioOutline ) );
    public final void rule__Feature__ScenariosAlternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:388:1: ( ( ruleScenario ) | ( ruleScenarioOutline ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalCucumber.g:389:2: ( ruleScenario )
                    {
                    // InternalCucumber.g:389:2: ( ruleScenario )
                    // InternalCucumber.g:390:3: ruleScenario
                    {
                     before(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_5_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleScenario();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:395:2: ( ruleScenarioOutline )
                    {
                    // InternalCucumber.g:395:2: ( ruleScenarioOutline )
                    // InternalCucumber.g:396:3: ruleScenarioOutline
                    {
                     before(grammarAccess.getFeatureAccess().getScenariosScenarioOutlineParserRuleCall_5_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleScenarioOutline();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getScenariosScenarioOutlineParserRuleCall_5_0_1()); 

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
    // $ANTLR end "rule__Feature__ScenariosAlternatives_5_0"


    // $ANTLR start "rule__Step__KeywordAlternatives_0_0"
    // InternalCucumber.g:405:1: rule__Step__KeywordAlternatives_0_0 : ( ( 'Given' ) | ( 'When' ) | ( 'Then' ) | ( 'And' ) | ( 'But' ) | ( '*' ) );
    public final void rule__Step__KeywordAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:409:1: ( ( 'Given' ) | ( 'When' ) | ( 'Then' ) | ( 'And' ) | ( 'But' ) | ( '*' ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 9:
                {
                alt3=1;
                }
                break;
            case 10:
                {
                alt3=2;
                }
                break;
            case 11:
                {
                alt3=3;
                }
                break;
            case 12:
                {
                alt3=4;
                }
                break;
            case 13:
                {
                alt3=5;
                }
                break;
            case 14:
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
                    // InternalCucumber.g:410:2: ( 'Given' )
                    {
                    // InternalCucumber.g:410:2: ( 'Given' )
                    // InternalCucumber.g:411:3: 'Given'
                    {
                     before(grammarAccess.getStepAccess().getKeywordGivenKeyword_0_0_0()); 
                    match(input,9,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getKeywordGivenKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:416:2: ( 'When' )
                    {
                    // InternalCucumber.g:416:2: ( 'When' )
                    // InternalCucumber.g:417:3: 'When'
                    {
                     before(grammarAccess.getStepAccess().getKeywordWhenKeyword_0_0_1()); 
                    match(input,10,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getKeywordWhenKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCucumber.g:422:2: ( 'Then' )
                    {
                    // InternalCucumber.g:422:2: ( 'Then' )
                    // InternalCucumber.g:423:3: 'Then'
                    {
                     before(grammarAccess.getStepAccess().getKeywordThenKeyword_0_0_2()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getKeywordThenKeyword_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCucumber.g:428:2: ( 'And' )
                    {
                    // InternalCucumber.g:428:2: ( 'And' )
                    // InternalCucumber.g:429:3: 'And'
                    {
                     before(grammarAccess.getStepAccess().getKeywordAndKeyword_0_0_3()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getKeywordAndKeyword_0_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCucumber.g:434:2: ( 'But' )
                    {
                    // InternalCucumber.g:434:2: ( 'But' )
                    // InternalCucumber.g:435:3: 'But'
                    {
                     before(grammarAccess.getStepAccess().getKeywordButKeyword_0_0_4()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getKeywordButKeyword_0_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCucumber.g:440:2: ( '*' )
                    {
                    // InternalCucumber.g:440:2: ( '*' )
                    // InternalCucumber.g:441:3: '*'
                    {
                     before(grammarAccess.getStepAccess().getKeywordAsteriskKeyword_0_0_5()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getKeywordAsteriskKeyword_0_0_5()); 

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
    // $ANTLR end "rule__Step__KeywordAlternatives_0_0"


    // $ANTLR start "rule__Step__Alternatives_2"
    // InternalCucumber.g:450:1: rule__Step__Alternatives_2 : ( ( ( rule__Step__TableAssignment_2_0 ) ) | ( ( rule__Step__TextAssignment_2_1 ) ) );
    public final void rule__Step__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:454:1: ( ( ( rule__Step__TableAssignment_2_0 ) ) | ( ( rule__Step__TextAssignment_2_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCucumber.g:455:2: ( ( rule__Step__TableAssignment_2_0 ) )
                    {
                    // InternalCucumber.g:455:2: ( ( rule__Step__TableAssignment_2_0 ) )
                    // InternalCucumber.g:456:3: ( rule__Step__TableAssignment_2_0 )
                    {
                     before(grammarAccess.getStepAccess().getTableAssignment_2_0()); 
                    // InternalCucumber.g:457:3: ( rule__Step__TableAssignment_2_0 )
                    // InternalCucumber.g:457:4: rule__Step__TableAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Step__TableAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStepAccess().getTableAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:461:2: ( ( rule__Step__TextAssignment_2_1 ) )
                    {
                    // InternalCucumber.g:461:2: ( ( rule__Step__TextAssignment_2_1 ) )
                    // InternalCucumber.g:462:3: ( rule__Step__TextAssignment_2_1 )
                    {
                     before(grammarAccess.getStepAccess().getTextAssignment_2_1()); 
                    // InternalCucumber.g:463:3: ( rule__Step__TextAssignment_2_1 )
                    // InternalCucumber.g:463:4: rule__Step__TextAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Step__TextAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStepAccess().getTextAssignment_2_1()); 

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
    // $ANTLR end "rule__Step__Alternatives_2"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalCucumber.g:471:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:475:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalCucumber.g:476:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalCucumber.g:483:1: rule__Feature__Group__0__Impl : ( ruleTags ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:487:1: ( ( ruleTags ) )
            // InternalCucumber.g:488:1: ( ruleTags )
            {
            // InternalCucumber.g:488:1: ( ruleTags )
            // InternalCucumber.g:489:2: ruleTags
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
    // InternalCucumber.g:498:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:502:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalCucumber.g:503:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
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
    // InternalCucumber.g:510:1: rule__Feature__Group__1__Impl : ( 'Feature:' ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:514:1: ( ( 'Feature:' ) )
            // InternalCucumber.g:515:1: ( 'Feature:' )
            {
            // InternalCucumber.g:515:1: ( 'Feature:' )
            // InternalCucumber.g:516:2: 'Feature:'
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
    // InternalCucumber.g:525:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:529:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalCucumber.g:530:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
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
    // InternalCucumber.g:537:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__TitleAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:541:1: ( ( ( rule__Feature__TitleAssignment_2 ) ) )
            // InternalCucumber.g:542:1: ( ( rule__Feature__TitleAssignment_2 ) )
            {
            // InternalCucumber.g:542:1: ( ( rule__Feature__TitleAssignment_2 ) )
            // InternalCucumber.g:543:2: ( rule__Feature__TitleAssignment_2 )
            {
             before(grammarAccess.getFeatureAccess().getTitleAssignment_2()); 
            // InternalCucumber.g:544:2: ( rule__Feature__TitleAssignment_2 )
            // InternalCucumber.g:544:3: rule__Feature__TitleAssignment_2
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
    // InternalCucumber.g:552:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:556:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalCucumber.g:557:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
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
    // InternalCucumber.g:564:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__DescriptionAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:568:1: ( ( ( rule__Feature__DescriptionAssignment_3 ) ) )
            // InternalCucumber.g:569:1: ( ( rule__Feature__DescriptionAssignment_3 ) )
            {
            // InternalCucumber.g:569:1: ( ( rule__Feature__DescriptionAssignment_3 ) )
            // InternalCucumber.g:570:2: ( rule__Feature__DescriptionAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getDescriptionAssignment_3()); 
            // InternalCucumber.g:571:2: ( rule__Feature__DescriptionAssignment_3 )
            // InternalCucumber.g:571:3: rule__Feature__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Feature__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getDescriptionAssignment_3()); 

            }


            }

        }
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
    // InternalCucumber.g:579:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl rule__Feature__Group__5 ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:583:1: ( rule__Feature__Group__4__Impl rule__Feature__Group__5 )
            // InternalCucumber.g:584:2: rule__Feature__Group__4__Impl rule__Feature__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalCucumber.g:591:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__BackgroundAssignment_4 )? ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:595:1: ( ( ( rule__Feature__BackgroundAssignment_4 )? ) )
            // InternalCucumber.g:596:1: ( ( rule__Feature__BackgroundAssignment_4 )? )
            {
            // InternalCucumber.g:596:1: ( ( rule__Feature__BackgroundAssignment_4 )? )
            // InternalCucumber.g:597:2: ( rule__Feature__BackgroundAssignment_4 )?
            {
             before(grammarAccess.getFeatureAccess().getBackgroundAssignment_4()); 
            // InternalCucumber.g:598:2: ( rule__Feature__BackgroundAssignment_4 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCucumber.g:598:3: rule__Feature__BackgroundAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__BackgroundAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getBackgroundAssignment_4()); 

            }


            }

        }
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
    // InternalCucumber.g:606:1: rule__Feature__Group__5 : rule__Feature__Group__5__Impl ;
    public final void rule__Feature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:610:1: ( rule__Feature__Group__5__Impl )
            // InternalCucumber.g:611:2: rule__Feature__Group__5__Impl
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
    // InternalCucumber.g:617:1: rule__Feature__Group__5__Impl : ( ( rule__Feature__ScenariosAssignment_5 )* ) ;
    public final void rule__Feature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:621:1: ( ( ( rule__Feature__ScenariosAssignment_5 )* ) )
            // InternalCucumber.g:622:1: ( ( rule__Feature__ScenariosAssignment_5 )* )
            {
            // InternalCucumber.g:622:1: ( ( rule__Feature__ScenariosAssignment_5 )* )
            // InternalCucumber.g:623:2: ( rule__Feature__ScenariosAssignment_5 )*
            {
             before(grammarAccess.getFeatureAccess().getScenariosAssignment_5()); 
            // InternalCucumber.g:624:2: ( rule__Feature__ScenariosAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_EOL && LA6_0<=RULE_TAG)||(LA6_0>=17 && LA6_0<=18)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCucumber.g:624:3: rule__Feature__ScenariosAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Feature__ScenariosAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getScenariosAssignment_5()); 

            }


            }

        }
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
    // InternalCucumber.g:633:1: rule__Background__Group__0 : rule__Background__Group__0__Impl rule__Background__Group__1 ;
    public final void rule__Background__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:637:1: ( rule__Background__Group__0__Impl rule__Background__Group__1 )
            // InternalCucumber.g:638:2: rule__Background__Group__0__Impl rule__Background__Group__1
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
    // InternalCucumber.g:645:1: rule__Background__Group__0__Impl : ( 'Background:' ) ;
    public final void rule__Background__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:649:1: ( ( 'Background:' ) )
            // InternalCucumber.g:650:1: ( 'Background:' )
            {
            // InternalCucumber.g:650:1: ( 'Background:' )
            // InternalCucumber.g:651:2: 'Background:'
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
    // InternalCucumber.g:660:1: rule__Background__Group__1 : rule__Background__Group__1__Impl rule__Background__Group__2 ;
    public final void rule__Background__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:664:1: ( rule__Background__Group__1__Impl rule__Background__Group__2 )
            // InternalCucumber.g:665:2: rule__Background__Group__1__Impl rule__Background__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalCucumber.g:672:1: rule__Background__Group__1__Impl : ( ( rule__Background__TitleAssignment_1 ) ) ;
    public final void rule__Background__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:676:1: ( ( ( rule__Background__TitleAssignment_1 ) ) )
            // InternalCucumber.g:677:1: ( ( rule__Background__TitleAssignment_1 ) )
            {
            // InternalCucumber.g:677:1: ( ( rule__Background__TitleAssignment_1 ) )
            // InternalCucumber.g:678:2: ( rule__Background__TitleAssignment_1 )
            {
             before(grammarAccess.getBackgroundAccess().getTitleAssignment_1()); 
            // InternalCucumber.g:679:2: ( rule__Background__TitleAssignment_1 )
            // InternalCucumber.g:679:3: rule__Background__TitleAssignment_1
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
    // InternalCucumber.g:687:1: rule__Background__Group__2 : rule__Background__Group__2__Impl rule__Background__Group__3 ;
    public final void rule__Background__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:691:1: ( rule__Background__Group__2__Impl rule__Background__Group__3 )
            // InternalCucumber.g:692:2: rule__Background__Group__2__Impl rule__Background__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalCucumber.g:699:1: rule__Background__Group__2__Impl : ( ( rule__Background__DescriptionAssignment_2 ) ) ;
    public final void rule__Background__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:703:1: ( ( ( rule__Background__DescriptionAssignment_2 ) ) )
            // InternalCucumber.g:704:1: ( ( rule__Background__DescriptionAssignment_2 ) )
            {
            // InternalCucumber.g:704:1: ( ( rule__Background__DescriptionAssignment_2 ) )
            // InternalCucumber.g:705:2: ( rule__Background__DescriptionAssignment_2 )
            {
             before(grammarAccess.getBackgroundAccess().getDescriptionAssignment_2()); 
            // InternalCucumber.g:706:2: ( rule__Background__DescriptionAssignment_2 )
            // InternalCucumber.g:706:3: rule__Background__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Background__DescriptionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBackgroundAccess().getDescriptionAssignment_2()); 

            }


            }

        }
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
    // InternalCucumber.g:714:1: rule__Background__Group__3 : rule__Background__Group__3__Impl ;
    public final void rule__Background__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:718:1: ( rule__Background__Group__3__Impl )
            // InternalCucumber.g:719:2: rule__Background__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Background__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalCucumber.g:725:1: rule__Background__Group__3__Impl : ( ( rule__Background__StepsAssignment_3 )* ) ;
    public final void rule__Background__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:729:1: ( ( ( rule__Background__StepsAssignment_3 )* ) )
            // InternalCucumber.g:730:1: ( ( rule__Background__StepsAssignment_3 )* )
            {
            // InternalCucumber.g:730:1: ( ( rule__Background__StepsAssignment_3 )* )
            // InternalCucumber.g:731:2: ( rule__Background__StepsAssignment_3 )*
            {
             before(grammarAccess.getBackgroundAccess().getStepsAssignment_3()); 
            // InternalCucumber.g:732:2: ( rule__Background__StepsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=9 && LA7_0<=14)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCucumber.g:732:3: rule__Background__StepsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Background__StepsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getBackgroundAccess().getStepsAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Scenario__Group__0"
    // InternalCucumber.g:741:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:745:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalCucumber.g:746:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalCucumber.g:753:1: rule__Scenario__Group__0__Impl : ( ruleTags ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:757:1: ( ( ruleTags ) )
            // InternalCucumber.g:758:1: ( ruleTags )
            {
            // InternalCucumber.g:758:1: ( ruleTags )
            // InternalCucumber.g:759:2: ruleTags
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
    // InternalCucumber.g:768:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:772:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalCucumber.g:773:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
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
    // InternalCucumber.g:780:1: rule__Scenario__Group__1__Impl : ( 'Scenario:' ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:784:1: ( ( 'Scenario:' ) )
            // InternalCucumber.g:785:1: ( 'Scenario:' )
            {
            // InternalCucumber.g:785:1: ( 'Scenario:' )
            // InternalCucumber.g:786:2: 'Scenario:'
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
    // InternalCucumber.g:795:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:799:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // InternalCucumber.g:800:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
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
    // InternalCucumber.g:807:1: rule__Scenario__Group__2__Impl : ( ( rule__Scenario__TitleAssignment_2 ) ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:811:1: ( ( ( rule__Scenario__TitleAssignment_2 ) ) )
            // InternalCucumber.g:812:1: ( ( rule__Scenario__TitleAssignment_2 ) )
            {
            // InternalCucumber.g:812:1: ( ( rule__Scenario__TitleAssignment_2 ) )
            // InternalCucumber.g:813:2: ( rule__Scenario__TitleAssignment_2 )
            {
             before(grammarAccess.getScenarioAccess().getTitleAssignment_2()); 
            // InternalCucumber.g:814:2: ( rule__Scenario__TitleAssignment_2 )
            // InternalCucumber.g:814:3: rule__Scenario__TitleAssignment_2
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
    // InternalCucumber.g:822:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl rule__Scenario__Group__4 ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:826:1: ( rule__Scenario__Group__3__Impl rule__Scenario__Group__4 )
            // InternalCucumber.g:827:2: rule__Scenario__Group__3__Impl rule__Scenario__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalCucumber.g:834:1: rule__Scenario__Group__3__Impl : ( ( rule__Scenario__DescriptionAssignment_3 ) ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:838:1: ( ( ( rule__Scenario__DescriptionAssignment_3 ) ) )
            // InternalCucumber.g:839:1: ( ( rule__Scenario__DescriptionAssignment_3 ) )
            {
            // InternalCucumber.g:839:1: ( ( rule__Scenario__DescriptionAssignment_3 ) )
            // InternalCucumber.g:840:2: ( rule__Scenario__DescriptionAssignment_3 )
            {
             before(grammarAccess.getScenarioAccess().getDescriptionAssignment_3()); 
            // InternalCucumber.g:841:2: ( rule__Scenario__DescriptionAssignment_3 )
            // InternalCucumber.g:841:3: rule__Scenario__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getDescriptionAssignment_3()); 

            }


            }

        }
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
    // InternalCucumber.g:849:1: rule__Scenario__Group__4 : rule__Scenario__Group__4__Impl ;
    public final void rule__Scenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:853:1: ( rule__Scenario__Group__4__Impl )
            // InternalCucumber.g:854:2: rule__Scenario__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalCucumber.g:860:1: rule__Scenario__Group__4__Impl : ( ( rule__Scenario__StepsAssignment_4 )* ) ;
    public final void rule__Scenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:864:1: ( ( ( rule__Scenario__StepsAssignment_4 )* ) )
            // InternalCucumber.g:865:1: ( ( rule__Scenario__StepsAssignment_4 )* )
            {
            // InternalCucumber.g:865:1: ( ( rule__Scenario__StepsAssignment_4 )* )
            // InternalCucumber.g:866:2: ( rule__Scenario__StepsAssignment_4 )*
            {
             before(grammarAccess.getScenarioAccess().getStepsAssignment_4()); 
            // InternalCucumber.g:867:2: ( rule__Scenario__StepsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=9 && LA8_0<=14)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCucumber.g:867:3: rule__Scenario__StepsAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Scenario__StepsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getStepsAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__ScenarioOutline__Group__0"
    // InternalCucumber.g:876:1: rule__ScenarioOutline__Group__0 : rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1 ;
    public final void rule__ScenarioOutline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:880:1: ( rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1 )
            // InternalCucumber.g:881:2: rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalCucumber.g:888:1: rule__ScenarioOutline__Group__0__Impl : ( ruleTags ) ;
    public final void rule__ScenarioOutline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:892:1: ( ( ruleTags ) )
            // InternalCucumber.g:893:1: ( ruleTags )
            {
            // InternalCucumber.g:893:1: ( ruleTags )
            // InternalCucumber.g:894:2: ruleTags
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
    // InternalCucumber.g:903:1: rule__ScenarioOutline__Group__1 : rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2 ;
    public final void rule__ScenarioOutline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:907:1: ( rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2 )
            // InternalCucumber.g:908:2: rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2
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
    // InternalCucumber.g:915:1: rule__ScenarioOutline__Group__1__Impl : ( 'Scenario Outline:' ) ;
    public final void rule__ScenarioOutline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:919:1: ( ( 'Scenario Outline:' ) )
            // InternalCucumber.g:920:1: ( 'Scenario Outline:' )
            {
            // InternalCucumber.g:920:1: ( 'Scenario Outline:' )
            // InternalCucumber.g:921:2: 'Scenario Outline:'
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
    // InternalCucumber.g:930:1: rule__ScenarioOutline__Group__2 : rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3 ;
    public final void rule__ScenarioOutline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:934:1: ( rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3 )
            // InternalCucumber.g:935:2: rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalCucumber.g:942:1: rule__ScenarioOutline__Group__2__Impl : ( ( rule__ScenarioOutline__TitleAssignment_2 ) ) ;
    public final void rule__ScenarioOutline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:946:1: ( ( ( rule__ScenarioOutline__TitleAssignment_2 ) ) )
            // InternalCucumber.g:947:1: ( ( rule__ScenarioOutline__TitleAssignment_2 ) )
            {
            // InternalCucumber.g:947:1: ( ( rule__ScenarioOutline__TitleAssignment_2 ) )
            // InternalCucumber.g:948:2: ( rule__ScenarioOutline__TitleAssignment_2 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getTitleAssignment_2()); 
            // InternalCucumber.g:949:2: ( rule__ScenarioOutline__TitleAssignment_2 )
            // InternalCucumber.g:949:3: rule__ScenarioOutline__TitleAssignment_2
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
    // InternalCucumber.g:957:1: rule__ScenarioOutline__Group__3 : rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4 ;
    public final void rule__ScenarioOutline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:961:1: ( rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4 )
            // InternalCucumber.g:962:2: rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalCucumber.g:969:1: rule__ScenarioOutline__Group__3__Impl : ( ( rule__ScenarioOutline__DescriptionAssignment_3 ) ) ;
    public final void rule__ScenarioOutline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:973:1: ( ( ( rule__ScenarioOutline__DescriptionAssignment_3 ) ) )
            // InternalCucumber.g:974:1: ( ( rule__ScenarioOutline__DescriptionAssignment_3 ) )
            {
            // InternalCucumber.g:974:1: ( ( rule__ScenarioOutline__DescriptionAssignment_3 ) )
            // InternalCucumber.g:975:2: ( rule__ScenarioOutline__DescriptionAssignment_3 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getDescriptionAssignment_3()); 
            // InternalCucumber.g:976:2: ( rule__ScenarioOutline__DescriptionAssignment_3 )
            // InternalCucumber.g:976:3: rule__ScenarioOutline__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getDescriptionAssignment_3()); 

            }


            }

        }
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
    // InternalCucumber.g:984:1: rule__ScenarioOutline__Group__4 : rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5 ;
    public final void rule__ScenarioOutline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:988:1: ( rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5 )
            // InternalCucumber.g:989:2: rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalCucumber.g:996:1: rule__ScenarioOutline__Group__4__Impl : ( ( rule__ScenarioOutline__StepsAssignment_4 )* ) ;
    public final void rule__ScenarioOutline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1000:1: ( ( ( rule__ScenarioOutline__StepsAssignment_4 )* ) )
            // InternalCucumber.g:1001:1: ( ( rule__ScenarioOutline__StepsAssignment_4 )* )
            {
            // InternalCucumber.g:1001:1: ( ( rule__ScenarioOutline__StepsAssignment_4 )* )
            // InternalCucumber.g:1002:2: ( rule__ScenarioOutline__StepsAssignment_4 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getStepsAssignment_4()); 
            // InternalCucumber.g:1003:2: ( rule__ScenarioOutline__StepsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=9 && LA9_0<=14)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCucumber.g:1003:3: rule__ScenarioOutline__StepsAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ScenarioOutline__StepsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getScenarioOutlineAccess().getStepsAssignment_4()); 

            }


            }

        }
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
    // InternalCucumber.g:1011:1: rule__ScenarioOutline__Group__5 : rule__ScenarioOutline__Group__5__Impl ;
    public final void rule__ScenarioOutline__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1015:1: ( rule__ScenarioOutline__Group__5__Impl )
            // InternalCucumber.g:1016:2: rule__ScenarioOutline__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalCucumber.g:1022:1: rule__ScenarioOutline__Group__5__Impl : ( ( ( rule__ScenarioOutline__ExamplesAssignment_5 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_5 )* ) ) ;
    public final void rule__ScenarioOutline__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1026:1: ( ( ( ( rule__ScenarioOutline__ExamplesAssignment_5 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_5 )* ) ) )
            // InternalCucumber.g:1027:1: ( ( ( rule__ScenarioOutline__ExamplesAssignment_5 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_5 )* ) )
            {
            // InternalCucumber.g:1027:1: ( ( ( rule__ScenarioOutline__ExamplesAssignment_5 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_5 )* ) )
            // InternalCucumber.g:1028:2: ( ( rule__ScenarioOutline__ExamplesAssignment_5 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_5 )* )
            {
            // InternalCucumber.g:1028:2: ( ( rule__ScenarioOutline__ExamplesAssignment_5 ) )
            // InternalCucumber.g:1029:3: ( rule__ScenarioOutline__ExamplesAssignment_5 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_5()); 
            // InternalCucumber.g:1030:3: ( rule__ScenarioOutline__ExamplesAssignment_5 )
            // InternalCucumber.g:1030:4: rule__ScenarioOutline__ExamplesAssignment_5
            {
            pushFollow(FOLLOW_13);
            rule__ScenarioOutline__ExamplesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_5()); 

            }

            // InternalCucumber.g:1033:2: ( ( rule__ScenarioOutline__ExamplesAssignment_5 )* )
            // InternalCucumber.g:1034:3: ( rule__ScenarioOutline__ExamplesAssignment_5 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_5()); 
            // InternalCucumber.g:1035:3: ( rule__ScenarioOutline__ExamplesAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // InternalCucumber.g:1035:4: rule__ScenarioOutline__ExamplesAssignment_5
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ScenarioOutline__ExamplesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_5()); 

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
    // $ANTLR end "rule__ScenarioOutline__Group__5__Impl"


    // $ANTLR start "rule__Example__Group__0"
    // InternalCucumber.g:1045:1: rule__Example__Group__0 : rule__Example__Group__0__Impl rule__Example__Group__1 ;
    public final void rule__Example__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1049:1: ( rule__Example__Group__0__Impl rule__Example__Group__1 )
            // InternalCucumber.g:1050:2: rule__Example__Group__0__Impl rule__Example__Group__1
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
    // InternalCucumber.g:1057:1: rule__Example__Group__0__Impl : ( ruleTags ) ;
    public final void rule__Example__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1061:1: ( ( ruleTags ) )
            // InternalCucumber.g:1062:1: ( ruleTags )
            {
            // InternalCucumber.g:1062:1: ( ruleTags )
            // InternalCucumber.g:1063:2: ruleTags
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
    // InternalCucumber.g:1072:1: rule__Example__Group__1 : rule__Example__Group__1__Impl rule__Example__Group__2 ;
    public final void rule__Example__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1076:1: ( rule__Example__Group__1__Impl rule__Example__Group__2 )
            // InternalCucumber.g:1077:2: rule__Example__Group__1__Impl rule__Example__Group__2
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
    // InternalCucumber.g:1084:1: rule__Example__Group__1__Impl : ( 'Examples:' ) ;
    public final void rule__Example__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1088:1: ( ( 'Examples:' ) )
            // InternalCucumber.g:1089:1: ( 'Examples:' )
            {
            // InternalCucumber.g:1089:1: ( 'Examples:' )
            // InternalCucumber.g:1090:2: 'Examples:'
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
    // InternalCucumber.g:1099:1: rule__Example__Group__2 : rule__Example__Group__2__Impl rule__Example__Group__3 ;
    public final void rule__Example__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1103:1: ( rule__Example__Group__2__Impl rule__Example__Group__3 )
            // InternalCucumber.g:1104:2: rule__Example__Group__2__Impl rule__Example__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalCucumber.g:1111:1: rule__Example__Group__2__Impl : ( ( rule__Example__TitleAssignment_2 ) ) ;
    public final void rule__Example__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1115:1: ( ( ( rule__Example__TitleAssignment_2 ) ) )
            // InternalCucumber.g:1116:1: ( ( rule__Example__TitleAssignment_2 ) )
            {
            // InternalCucumber.g:1116:1: ( ( rule__Example__TitleAssignment_2 ) )
            // InternalCucumber.g:1117:2: ( rule__Example__TitleAssignment_2 )
            {
             before(grammarAccess.getExampleAccess().getTitleAssignment_2()); 
            // InternalCucumber.g:1118:2: ( rule__Example__TitleAssignment_2 )
            // InternalCucumber.g:1118:3: rule__Example__TitleAssignment_2
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
    // InternalCucumber.g:1126:1: rule__Example__Group__3 : rule__Example__Group__3__Impl rule__Example__Group__4 ;
    public final void rule__Example__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1130:1: ( rule__Example__Group__3__Impl rule__Example__Group__4 )
            // InternalCucumber.g:1131:2: rule__Example__Group__3__Impl rule__Example__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalCucumber.g:1138:1: rule__Example__Group__3__Impl : ( ( rule__Example__DescriptionAssignment_3 ) ) ;
    public final void rule__Example__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1142:1: ( ( ( rule__Example__DescriptionAssignment_3 ) ) )
            // InternalCucumber.g:1143:1: ( ( rule__Example__DescriptionAssignment_3 ) )
            {
            // InternalCucumber.g:1143:1: ( ( rule__Example__DescriptionAssignment_3 ) )
            // InternalCucumber.g:1144:2: ( rule__Example__DescriptionAssignment_3 )
            {
             before(grammarAccess.getExampleAccess().getDescriptionAssignment_3()); 
            // InternalCucumber.g:1145:2: ( rule__Example__DescriptionAssignment_3 )
            // InternalCucumber.g:1145:3: rule__Example__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Example__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getDescriptionAssignment_3()); 

            }


            }

        }
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
    // InternalCucumber.g:1153:1: rule__Example__Group__4 : rule__Example__Group__4__Impl ;
    public final void rule__Example__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1157:1: ( rule__Example__Group__4__Impl )
            // InternalCucumber.g:1158:2: rule__Example__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Example__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalCucumber.g:1164:1: rule__Example__Group__4__Impl : ( ( rule__Example__TableAssignment_4 ) ) ;
    public final void rule__Example__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1168:1: ( ( ( rule__Example__TableAssignment_4 ) ) )
            // InternalCucumber.g:1169:1: ( ( rule__Example__TableAssignment_4 ) )
            {
            // InternalCucumber.g:1169:1: ( ( rule__Example__TableAssignment_4 ) )
            // InternalCucumber.g:1170:2: ( rule__Example__TableAssignment_4 )
            {
             before(grammarAccess.getExampleAccess().getTableAssignment_4()); 
            // InternalCucumber.g:1171:2: ( rule__Example__TableAssignment_4 )
            // InternalCucumber.g:1171:3: rule__Example__TableAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Example__TableAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getTableAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Step__Group__0"
    // InternalCucumber.g:1180:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1184:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // InternalCucumber.g:1185:2: rule__Step__Group__0__Impl rule__Step__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalCucumber.g:1192:1: rule__Step__Group__0__Impl : ( ( rule__Step__KeywordAssignment_0 ) ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1196:1: ( ( ( rule__Step__KeywordAssignment_0 ) ) )
            // InternalCucumber.g:1197:1: ( ( rule__Step__KeywordAssignment_0 ) )
            {
            // InternalCucumber.g:1197:1: ( ( rule__Step__KeywordAssignment_0 ) )
            // InternalCucumber.g:1198:2: ( rule__Step__KeywordAssignment_0 )
            {
             before(grammarAccess.getStepAccess().getKeywordAssignment_0()); 
            // InternalCucumber.g:1199:2: ( rule__Step__KeywordAssignment_0 )
            // InternalCucumber.g:1199:3: rule__Step__KeywordAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Step__KeywordAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getKeywordAssignment_0()); 

            }


            }

        }
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
    // InternalCucumber.g:1207:1: rule__Step__Group__1 : rule__Step__Group__1__Impl rule__Step__Group__2 ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1211:1: ( rule__Step__Group__1__Impl rule__Step__Group__2 )
            // InternalCucumber.g:1212:2: rule__Step__Group__1__Impl rule__Step__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalCucumber.g:1219:1: rule__Step__Group__1__Impl : ( ( rule__Step__TitleAssignment_1 ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1223:1: ( ( ( rule__Step__TitleAssignment_1 ) ) )
            // InternalCucumber.g:1224:1: ( ( rule__Step__TitleAssignment_1 ) )
            {
            // InternalCucumber.g:1224:1: ( ( rule__Step__TitleAssignment_1 ) )
            // InternalCucumber.g:1225:2: ( rule__Step__TitleAssignment_1 )
            {
             before(grammarAccess.getStepAccess().getTitleAssignment_1()); 
            // InternalCucumber.g:1226:2: ( rule__Step__TitleAssignment_1 )
            // InternalCucumber.g:1226:3: rule__Step__TitleAssignment_1
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
    // InternalCucumber.g:1234:1: rule__Step__Group__2 : rule__Step__Group__2__Impl ;
    public final void rule__Step__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1238:1: ( rule__Step__Group__2__Impl )
            // InternalCucumber.g:1239:2: rule__Step__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalCucumber.g:1245:1: rule__Step__Group__2__Impl : ( ( rule__Step__Alternatives_2 )? ) ;
    public final void rule__Step__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1249:1: ( ( ( rule__Step__Alternatives_2 )? ) )
            // InternalCucumber.g:1250:1: ( ( rule__Step__Alternatives_2 )? )
            {
            // InternalCucumber.g:1250:1: ( ( rule__Step__Alternatives_2 )? )
            // InternalCucumber.g:1251:2: ( rule__Step__Alternatives_2 )?
            {
             before(grammarAccess.getStepAccess().getAlternatives_2()); 
            // InternalCucumber.g:1252:2: ( rule__Step__Alternatives_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=20 && LA11_0<=21)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCucumber.g:1252:3: rule__Step__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Step__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStepAccess().getAlternatives_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__TableRow__Group__0"
    // InternalCucumber.g:1261:1: rule__TableRow__Group__0 : rule__TableRow__Group__0__Impl rule__TableRow__Group__1 ;
    public final void rule__TableRow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1265:1: ( rule__TableRow__Group__0__Impl rule__TableRow__Group__1 )
            // InternalCucumber.g:1266:2: rule__TableRow__Group__0__Impl rule__TableRow__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalCucumber.g:1273:1: rule__TableRow__Group__0__Impl : ( ( ( rule__TableRow__CellsAssignment_0 ) ) ( ( rule__TableRow__CellsAssignment_0 )* ) ) ;
    public final void rule__TableRow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1277:1: ( ( ( ( rule__TableRow__CellsAssignment_0 ) ) ( ( rule__TableRow__CellsAssignment_0 )* ) ) )
            // InternalCucumber.g:1278:1: ( ( ( rule__TableRow__CellsAssignment_0 ) ) ( ( rule__TableRow__CellsAssignment_0 )* ) )
            {
            // InternalCucumber.g:1278:1: ( ( ( rule__TableRow__CellsAssignment_0 ) ) ( ( rule__TableRow__CellsAssignment_0 )* ) )
            // InternalCucumber.g:1279:2: ( ( rule__TableRow__CellsAssignment_0 ) ) ( ( rule__TableRow__CellsAssignment_0 )* )
            {
            // InternalCucumber.g:1279:2: ( ( rule__TableRow__CellsAssignment_0 ) )
            // InternalCucumber.g:1280:3: ( rule__TableRow__CellsAssignment_0 )
            {
             before(grammarAccess.getTableRowAccess().getCellsAssignment_0()); 
            // InternalCucumber.g:1281:3: ( rule__TableRow__CellsAssignment_0 )
            // InternalCucumber.g:1281:4: rule__TableRow__CellsAssignment_0
            {
            pushFollow(FOLLOW_3);
            rule__TableRow__CellsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTableRowAccess().getCellsAssignment_0()); 

            }

            // InternalCucumber.g:1284:2: ( ( rule__TableRow__CellsAssignment_0 )* )
            // InternalCucumber.g:1285:3: ( rule__TableRow__CellsAssignment_0 )*
            {
             before(grammarAccess.getTableRowAccess().getCellsAssignment_0()); 
            // InternalCucumber.g:1286:3: ( rule__TableRow__CellsAssignment_0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==RULE_WORD) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalCucumber.g:1286:4: rule__TableRow__CellsAssignment_0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__TableRow__CellsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalCucumber.g:1295:1: rule__TableRow__Group__1 : rule__TableRow__Group__1__Impl rule__TableRow__Group__2 ;
    public final void rule__TableRow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1299:1: ( rule__TableRow__Group__1__Impl rule__TableRow__Group__2 )
            // InternalCucumber.g:1300:2: rule__TableRow__Group__1__Impl rule__TableRow__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalCucumber.g:1307:1: rule__TableRow__Group__1__Impl : ( '|' ) ;
    public final void rule__TableRow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1311:1: ( ( '|' ) )
            // InternalCucumber.g:1312:1: ( '|' )
            {
            // InternalCucumber.g:1312:1: ( '|' )
            // InternalCucumber.g:1313:2: '|'
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
    // InternalCucumber.g:1322:1: rule__TableRow__Group__2 : rule__TableRow__Group__2__Impl ;
    public final void rule__TableRow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1326:1: ( rule__TableRow__Group__2__Impl )
            // InternalCucumber.g:1327:2: rule__TableRow__Group__2__Impl
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
    // InternalCucumber.g:1333:1: rule__TableRow__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__TableRow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1337:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1338:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1338:1: ( RULE_EOL )
            // InternalCucumber.g:1339:2: RULE_EOL
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
    // InternalCucumber.g:1349:1: rule__RowCell__Group__0 : rule__RowCell__Group__0__Impl rule__RowCell__Group__1 ;
    public final void rule__RowCell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1353:1: ( rule__RowCell__Group__0__Impl rule__RowCell__Group__1 )
            // InternalCucumber.g:1354:2: rule__RowCell__Group__0__Impl rule__RowCell__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalCucumber.g:1361:1: rule__RowCell__Group__0__Impl : ( ( rule__RowCell__CellAssignment_0 ) ) ;
    public final void rule__RowCell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1365:1: ( ( ( rule__RowCell__CellAssignment_0 ) ) )
            // InternalCucumber.g:1366:1: ( ( rule__RowCell__CellAssignment_0 ) )
            {
            // InternalCucumber.g:1366:1: ( ( rule__RowCell__CellAssignment_0 ) )
            // InternalCucumber.g:1367:2: ( rule__RowCell__CellAssignment_0 )
            {
             before(grammarAccess.getRowCellAccess().getCellAssignment_0()); 
            // InternalCucumber.g:1368:2: ( rule__RowCell__CellAssignment_0 )
            // InternalCucumber.g:1368:3: rule__RowCell__CellAssignment_0
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
    // InternalCucumber.g:1376:1: rule__RowCell__Group__1 : rule__RowCell__Group__1__Impl ;
    public final void rule__RowCell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1380:1: ( rule__RowCell__Group__1__Impl )
            // InternalCucumber.g:1381:2: rule__RowCell__Group__1__Impl
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
    // InternalCucumber.g:1387:1: rule__RowCell__Group__1__Impl : ( ruleSentence ) ;
    public final void rule__RowCell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1391:1: ( ( ruleSentence ) )
            // InternalCucumber.g:1392:1: ( ruleSentence )
            {
            // InternalCucumber.g:1392:1: ( ruleSentence )
            // InternalCucumber.g:1393:2: ruleSentence
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
    // InternalCucumber.g:1403:1: rule__DocString__Group__0 : rule__DocString__Group__0__Impl rule__DocString__Group__1 ;
    public final void rule__DocString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1407:1: ( rule__DocString__Group__0__Impl rule__DocString__Group__1 )
            // InternalCucumber.g:1408:2: rule__DocString__Group__0__Impl rule__DocString__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalCucumber.g:1415:1: rule__DocString__Group__0__Impl : ( () ) ;
    public final void rule__DocString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1419:1: ( ( () ) )
            // InternalCucumber.g:1420:1: ( () )
            {
            // InternalCucumber.g:1420:1: ( () )
            // InternalCucumber.g:1421:2: ()
            {
             before(grammarAccess.getDocStringAccess().getDocStringAction_0()); 
            // InternalCucumber.g:1422:2: ()
            // InternalCucumber.g:1422:3: 
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
    // InternalCucumber.g:1430:1: rule__DocString__Group__1 : rule__DocString__Group__1__Impl rule__DocString__Group__2 ;
    public final void rule__DocString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1434:1: ( rule__DocString__Group__1__Impl rule__DocString__Group__2 )
            // InternalCucumber.g:1435:2: rule__DocString__Group__1__Impl rule__DocString__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalCucumber.g:1442:1: rule__DocString__Group__1__Impl : ( '\"\"\"' ) ;
    public final void rule__DocString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1446:1: ( ( '\"\"\"' ) )
            // InternalCucumber.g:1447:1: ( '\"\"\"' )
            {
            // InternalCucumber.g:1447:1: ( '\"\"\"' )
            // InternalCucumber.g:1448:2: '\"\"\"'
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
    // InternalCucumber.g:1457:1: rule__DocString__Group__2 : rule__DocString__Group__2__Impl rule__DocString__Group__3 ;
    public final void rule__DocString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1461:1: ( rule__DocString__Group__2__Impl rule__DocString__Group__3 )
            // InternalCucumber.g:1462:2: rule__DocString__Group__2__Impl rule__DocString__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalCucumber.g:1469:1: rule__DocString__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__DocString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1473:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1474:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1474:1: ( RULE_EOL )
            // InternalCucumber.g:1475:2: RULE_EOL
            {
             before(grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_2()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_2()); 

            }


            }

        }
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
    // InternalCucumber.g:1484:1: rule__DocString__Group__3 : rule__DocString__Group__3__Impl rule__DocString__Group__4 ;
    public final void rule__DocString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1488:1: ( rule__DocString__Group__3__Impl rule__DocString__Group__4 )
            // InternalCucumber.g:1489:2: rule__DocString__Group__3__Impl rule__DocString__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalCucumber.g:1496:1: rule__DocString__Group__3__Impl : ( ( ruleSentence )* ) ;
    public final void rule__DocString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1500:1: ( ( ( ruleSentence )* ) )
            // InternalCucumber.g:1501:1: ( ( ruleSentence )* )
            {
            // InternalCucumber.g:1501:1: ( ( ruleSentence )* )
            // InternalCucumber.g:1502:2: ( ruleSentence )*
            {
             before(grammarAccess.getDocStringAccess().getSentenceParserRuleCall_3()); 
            // InternalCucumber.g:1503:2: ( ruleSentence )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_WORD) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCucumber.g:1503:3: ruleSentence
            	    {
            	    pushFollow(FOLLOW_19);
            	    ruleSentence();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getDocStringAccess().getSentenceParserRuleCall_3()); 

            }


            }

        }
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
    // InternalCucumber.g:1511:1: rule__DocString__Group__4 : rule__DocString__Group__4__Impl rule__DocString__Group__5 ;
    public final void rule__DocString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1515:1: ( rule__DocString__Group__4__Impl rule__DocString__Group__5 )
            // InternalCucumber.g:1516:2: rule__DocString__Group__4__Impl rule__DocString__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__DocString__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocString__Group__5();

            state._fsp--;


            }

        }
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
    // InternalCucumber.g:1523:1: rule__DocString__Group__4__Impl : ( '\"\"\"' ) ;
    public final void rule__DocString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1527:1: ( ( '\"\"\"' ) )
            // InternalCucumber.g:1528:1: ( '\"\"\"' )
            {
            // InternalCucumber.g:1528:1: ( '\"\"\"' )
            // InternalCucumber.g:1529:2: '\"\"\"'
            {
             before(grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__DocString__Group__5"
    // InternalCucumber.g:1538:1: rule__DocString__Group__5 : rule__DocString__Group__5__Impl ;
    public final void rule__DocString__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1542:1: ( rule__DocString__Group__5__Impl )
            // InternalCucumber.g:1543:2: rule__DocString__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DocString__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocString__Group__5"


    // $ANTLR start "rule__DocString__Group__5__Impl"
    // InternalCucumber.g:1549:1: rule__DocString__Group__5__Impl : ( RULE_EOL ) ;
    public final void rule__DocString__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1553:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1554:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1554:1: ( RULE_EOL )
            // InternalCucumber.g:1555:2: RULE_EOL
            {
             before(grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_5()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocString__Group__5__Impl"


    // $ANTLR start "rule__Description__Group__0"
    // InternalCucumber.g:1565:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1569:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalCucumber.g:1570:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalCucumber.g:1577:1: rule__Description__Group__0__Impl : ( () ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1581:1: ( ( () ) )
            // InternalCucumber.g:1582:1: ( () )
            {
            // InternalCucumber.g:1582:1: ( () )
            // InternalCucumber.g:1583:2: ()
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionAction_0()); 
            // InternalCucumber.g:1584:2: ()
            // InternalCucumber.g:1584:3: 
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
    // InternalCucumber.g:1592:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1596:1: ( rule__Description__Group__1__Impl )
            // InternalCucumber.g:1597:2: rule__Description__Group__1__Impl
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
    // InternalCucumber.g:1603:1: rule__Description__Group__1__Impl : ( ( rule__Description__SentencesAssignment_1 )* ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1607:1: ( ( ( rule__Description__SentencesAssignment_1 )* ) )
            // InternalCucumber.g:1608:1: ( ( rule__Description__SentencesAssignment_1 )* )
            {
            // InternalCucumber.g:1608:1: ( ( rule__Description__SentencesAssignment_1 )* )
            // InternalCucumber.g:1609:2: ( rule__Description__SentencesAssignment_1 )*
            {
             before(grammarAccess.getDescriptionAccess().getSentencesAssignment_1()); 
            // InternalCucumber.g:1610:2: ( rule__Description__SentencesAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_WORD) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCucumber.g:1610:3: rule__Description__SentencesAssignment_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Description__SentencesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getDescriptionAccess().getSentencesAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Tags__Group__0"
    // InternalCucumber.g:1619:1: rule__Tags__Group__0 : rule__Tags__Group__0__Impl rule__Tags__Group__1 ;
    public final void rule__Tags__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1623:1: ( rule__Tags__Group__0__Impl rule__Tags__Group__1 )
            // InternalCucumber.g:1624:2: rule__Tags__Group__0__Impl rule__Tags__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalCucumber.g:1631:1: rule__Tags__Group__0__Impl : ( ( RULE_TAG )* ) ;
    public final void rule__Tags__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1635:1: ( ( ( RULE_TAG )* ) )
            // InternalCucumber.g:1636:1: ( ( RULE_TAG )* )
            {
            // InternalCucumber.g:1636:1: ( ( RULE_TAG )* )
            // InternalCucumber.g:1637:2: ( RULE_TAG )*
            {
             before(grammarAccess.getTagsAccess().getTAGTerminalRuleCall_0()); 
            // InternalCucumber.g:1638:2: ( RULE_TAG )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_TAG) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCucumber.g:1638:3: RULE_TAG
            	    {
            	    match(input,RULE_TAG,FOLLOW_21); 

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalCucumber.g:1646:1: rule__Tags__Group__1 : rule__Tags__Group__1__Impl ;
    public final void rule__Tags__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1650:1: ( rule__Tags__Group__1__Impl )
            // InternalCucumber.g:1651:2: rule__Tags__Group__1__Impl
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
    // InternalCucumber.g:1657:1: rule__Tags__Group__1__Impl : ( ( RULE_EOL )? ) ;
    public final void rule__Tags__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1661:1: ( ( ( RULE_EOL )? ) )
            // InternalCucumber.g:1662:1: ( ( RULE_EOL )? )
            {
            // InternalCucumber.g:1662:1: ( ( RULE_EOL )? )
            // InternalCucumber.g:1663:2: ( RULE_EOL )?
            {
             before(grammarAccess.getTagsAccess().getEOLTerminalRuleCall_1()); 
            // InternalCucumber.g:1664:2: ( RULE_EOL )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_EOL) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCucumber.g:1664:3: RULE_EOL
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


    // $ANTLR start "rule__Sentence__Group__0"
    // InternalCucumber.g:1673:1: rule__Sentence__Group__0 : rule__Sentence__Group__0__Impl rule__Sentence__Group__1 ;
    public final void rule__Sentence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1677:1: ( rule__Sentence__Group__0__Impl rule__Sentence__Group__1 )
            // InternalCucumber.g:1678:2: rule__Sentence__Group__0__Impl rule__Sentence__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Sentence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sentence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group__0"


    // $ANTLR start "rule__Sentence__Group__0__Impl"
    // InternalCucumber.g:1685:1: rule__Sentence__Group__0__Impl : ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) ) ;
    public final void rule__Sentence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1689:1: ( ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) ) )
            // InternalCucumber.g:1690:1: ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) )
            {
            // InternalCucumber.g:1690:1: ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) )
            // InternalCucumber.g:1691:2: ( ( RULE_WORD ) ) ( ( RULE_WORD )* )
            {
            // InternalCucumber.g:1691:2: ( ( RULE_WORD ) )
            // InternalCucumber.g:1692:3: ( RULE_WORD )
            {
             before(grammarAccess.getSentenceAccess().getWORDTerminalRuleCall_0()); 
            // InternalCucumber.g:1693:3: ( RULE_WORD )
            // InternalCucumber.g:1693:4: RULE_WORD
            {
            match(input,RULE_WORD,FOLLOW_19); 

            }

             after(grammarAccess.getSentenceAccess().getWORDTerminalRuleCall_0()); 

            }

            // InternalCucumber.g:1696:2: ( ( RULE_WORD )* )
            // InternalCucumber.g:1697:3: ( RULE_WORD )*
            {
             before(grammarAccess.getSentenceAccess().getWORDTerminalRuleCall_0()); 
            // InternalCucumber.g:1698:3: ( RULE_WORD )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_WORD) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCucumber.g:1698:4: RULE_WORD
            	    {
            	    match(input,RULE_WORD,FOLLOW_19); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getSentenceAccess().getWORDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Sentence__Group__0__Impl"


    // $ANTLR start "rule__Sentence__Group__1"
    // InternalCucumber.g:1707:1: rule__Sentence__Group__1 : rule__Sentence__Group__1__Impl ;
    public final void rule__Sentence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1711:1: ( rule__Sentence__Group__1__Impl )
            // InternalCucumber.g:1712:2: rule__Sentence__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sentence__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group__1"


    // $ANTLR start "rule__Sentence__Group__1__Impl"
    // InternalCucumber.g:1718:1: rule__Sentence__Group__1__Impl : ( ( RULE_EOL )? ) ;
    public final void rule__Sentence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1722:1: ( ( ( RULE_EOL )? ) )
            // InternalCucumber.g:1723:1: ( ( RULE_EOL )? )
            {
            // InternalCucumber.g:1723:1: ( ( RULE_EOL )? )
            // InternalCucumber.g:1724:2: ( RULE_EOL )?
            {
             before(grammarAccess.getSentenceAccess().getEOLTerminalRuleCall_1()); 
            // InternalCucumber.g:1725:2: ( RULE_EOL )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_EOL) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCucumber.g:1725:3: RULE_EOL
                    {
                    match(input,RULE_EOL,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSentenceAccess().getEOLTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group__1__Impl"


    // $ANTLR start "rule__Feature__TitleAssignment_2"
    // InternalCucumber.g:1734:1: rule__Feature__TitleAssignment_2 : ( ruleSentence ) ;
    public final void rule__Feature__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1738:1: ( ( ruleSentence ) )
            // InternalCucumber.g:1739:2: ( ruleSentence )
            {
            // InternalCucumber.g:1739:2: ( ruleSentence )
            // InternalCucumber.g:1740:3: ruleSentence
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


    // $ANTLR start "rule__Feature__DescriptionAssignment_3"
    // InternalCucumber.g:1749:1: rule__Feature__DescriptionAssignment_3 : ( ruleDescription ) ;
    public final void rule__Feature__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1753:1: ( ( ruleDescription ) )
            // InternalCucumber.g:1754:2: ( ruleDescription )
            {
            // InternalCucumber.g:1754:2: ( ruleDescription )
            // InternalCucumber.g:1755:3: ruleDescription
            {
             before(grammarAccess.getFeatureAccess().getDescriptionDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getDescriptionDescriptionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__DescriptionAssignment_3"


    // $ANTLR start "rule__Feature__BackgroundAssignment_4"
    // InternalCucumber.g:1764:1: rule__Feature__BackgroundAssignment_4 : ( ruleBackground ) ;
    public final void rule__Feature__BackgroundAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1768:1: ( ( ruleBackground ) )
            // InternalCucumber.g:1769:2: ( ruleBackground )
            {
            // InternalCucumber.g:1769:2: ( ruleBackground )
            // InternalCucumber.g:1770:3: ruleBackground
            {
             before(grammarAccess.getFeatureAccess().getBackgroundBackgroundParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBackground();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getBackgroundBackgroundParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__BackgroundAssignment_4"


    // $ANTLR start "rule__Feature__ScenariosAssignment_5"
    // InternalCucumber.g:1779:1: rule__Feature__ScenariosAssignment_5 : ( ( rule__Feature__ScenariosAlternatives_5_0 ) ) ;
    public final void rule__Feature__ScenariosAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1783:1: ( ( ( rule__Feature__ScenariosAlternatives_5_0 ) ) )
            // InternalCucumber.g:1784:2: ( ( rule__Feature__ScenariosAlternatives_5_0 ) )
            {
            // InternalCucumber.g:1784:2: ( ( rule__Feature__ScenariosAlternatives_5_0 ) )
            // InternalCucumber.g:1785:3: ( rule__Feature__ScenariosAlternatives_5_0 )
            {
             before(grammarAccess.getFeatureAccess().getScenariosAlternatives_5_0()); 
            // InternalCucumber.g:1786:3: ( rule__Feature__ScenariosAlternatives_5_0 )
            // InternalCucumber.g:1786:4: rule__Feature__ScenariosAlternatives_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__ScenariosAlternatives_5_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getScenariosAlternatives_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__ScenariosAssignment_5"


    // $ANTLR start "rule__Background__TitleAssignment_1"
    // InternalCucumber.g:1794:1: rule__Background__TitleAssignment_1 : ( ruleSentence ) ;
    public final void rule__Background__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1798:1: ( ( ruleSentence ) )
            // InternalCucumber.g:1799:2: ( ruleSentence )
            {
            // InternalCucumber.g:1799:2: ( ruleSentence )
            // InternalCucumber.g:1800:3: ruleSentence
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


    // $ANTLR start "rule__Background__DescriptionAssignment_2"
    // InternalCucumber.g:1809:1: rule__Background__DescriptionAssignment_2 : ( ruleDescription ) ;
    public final void rule__Background__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1813:1: ( ( ruleDescription ) )
            // InternalCucumber.g:1814:2: ( ruleDescription )
            {
            // InternalCucumber.g:1814:2: ( ruleDescription )
            // InternalCucumber.g:1815:3: ruleDescription
            {
             before(grammarAccess.getBackgroundAccess().getDescriptionDescriptionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getDescriptionDescriptionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__DescriptionAssignment_2"


    // $ANTLR start "rule__Background__StepsAssignment_3"
    // InternalCucumber.g:1824:1: rule__Background__StepsAssignment_3 : ( ruleStep ) ;
    public final void rule__Background__StepsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1828:1: ( ( ruleStep ) )
            // InternalCucumber.g:1829:2: ( ruleStep )
            {
            // InternalCucumber.g:1829:2: ( ruleStep )
            // InternalCucumber.g:1830:3: ruleStep
            {
             before(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__StepsAssignment_3"


    // $ANTLR start "rule__Scenario__TitleAssignment_2"
    // InternalCucumber.g:1839:1: rule__Scenario__TitleAssignment_2 : ( ruleSentence ) ;
    public final void rule__Scenario__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1843:1: ( ( ruleSentence ) )
            // InternalCucumber.g:1844:2: ( ruleSentence )
            {
            // InternalCucumber.g:1844:2: ( ruleSentence )
            // InternalCucumber.g:1845:3: ruleSentence
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


    // $ANTLR start "rule__Scenario__DescriptionAssignment_3"
    // InternalCucumber.g:1854:1: rule__Scenario__DescriptionAssignment_3 : ( ruleDescription ) ;
    public final void rule__Scenario__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1858:1: ( ( ruleDescription ) )
            // InternalCucumber.g:1859:2: ( ruleDescription )
            {
            // InternalCucumber.g:1859:2: ( ruleDescription )
            // InternalCucumber.g:1860:3: ruleDescription
            {
             before(grammarAccess.getScenarioAccess().getDescriptionDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getDescriptionDescriptionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__DescriptionAssignment_3"


    // $ANTLR start "rule__Scenario__StepsAssignment_4"
    // InternalCucumber.g:1869:1: rule__Scenario__StepsAssignment_4 : ( ruleStep ) ;
    public final void rule__Scenario__StepsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1873:1: ( ( ruleStep ) )
            // InternalCucumber.g:1874:2: ( ruleStep )
            {
            // InternalCucumber.g:1874:2: ( ruleStep )
            // InternalCucumber.g:1875:3: ruleStep
            {
             before(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__StepsAssignment_4"


    // $ANTLR start "rule__ScenarioOutline__TitleAssignment_2"
    // InternalCucumber.g:1884:1: rule__ScenarioOutline__TitleAssignment_2 : ( ruleSentence ) ;
    public final void rule__ScenarioOutline__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1888:1: ( ( ruleSentence ) )
            // InternalCucumber.g:1889:2: ( ruleSentence )
            {
            // InternalCucumber.g:1889:2: ( ruleSentence )
            // InternalCucumber.g:1890:3: ruleSentence
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


    // $ANTLR start "rule__ScenarioOutline__DescriptionAssignment_3"
    // InternalCucumber.g:1899:1: rule__ScenarioOutline__DescriptionAssignment_3 : ( ruleDescription ) ;
    public final void rule__ScenarioOutline__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1903:1: ( ( ruleDescription ) )
            // InternalCucumber.g:1904:2: ( ruleDescription )
            {
            // InternalCucumber.g:1904:2: ( ruleDescription )
            // InternalCucumber.g:1905:3: ruleDescription
            {
             before(grammarAccess.getScenarioOutlineAccess().getDescriptionDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getDescriptionDescriptionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__DescriptionAssignment_3"


    // $ANTLR start "rule__ScenarioOutline__StepsAssignment_4"
    // InternalCucumber.g:1914:1: rule__ScenarioOutline__StepsAssignment_4 : ( ruleStep ) ;
    public final void rule__ScenarioOutline__StepsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1918:1: ( ( ruleStep ) )
            // InternalCucumber.g:1919:2: ( ruleStep )
            {
            // InternalCucumber.g:1919:2: ( ruleStep )
            // InternalCucumber.g:1920:3: ruleStep
            {
             before(grammarAccess.getScenarioOutlineAccess().getStepsStepParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getStepsStepParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__StepsAssignment_4"


    // $ANTLR start "rule__ScenarioOutline__ExamplesAssignment_5"
    // InternalCucumber.g:1929:1: rule__ScenarioOutline__ExamplesAssignment_5 : ( ruleExample ) ;
    public final void rule__ScenarioOutline__ExamplesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1933:1: ( ( ruleExample ) )
            // InternalCucumber.g:1934:2: ( ruleExample )
            {
            // InternalCucumber.g:1934:2: ( ruleExample )
            // InternalCucumber.g:1935:3: ruleExample
            {
             before(grammarAccess.getScenarioOutlineAccess().getExamplesExampleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExample();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getExamplesExampleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__ExamplesAssignment_5"


    // $ANTLR start "rule__Example__TitleAssignment_2"
    // InternalCucumber.g:1944:1: rule__Example__TitleAssignment_2 : ( ruleSentence ) ;
    public final void rule__Example__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1948:1: ( ( ruleSentence ) )
            // InternalCucumber.g:1949:2: ( ruleSentence )
            {
            // InternalCucumber.g:1949:2: ( ruleSentence )
            // InternalCucumber.g:1950:3: ruleSentence
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


    // $ANTLR start "rule__Example__DescriptionAssignment_3"
    // InternalCucumber.g:1959:1: rule__Example__DescriptionAssignment_3 : ( ruleDescription ) ;
    public final void rule__Example__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1963:1: ( ( ruleDescription ) )
            // InternalCucumber.g:1964:2: ( ruleDescription )
            {
            // InternalCucumber.g:1964:2: ( ruleDescription )
            // InternalCucumber.g:1965:3: ruleDescription
            {
             before(grammarAccess.getExampleAccess().getDescriptionDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getDescriptionDescriptionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__DescriptionAssignment_3"


    // $ANTLR start "rule__Example__TableAssignment_4"
    // InternalCucumber.g:1974:1: rule__Example__TableAssignment_4 : ( ruleTable ) ;
    public final void rule__Example__TableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1978:1: ( ( ruleTable ) )
            // InternalCucumber.g:1979:2: ( ruleTable )
            {
            // InternalCucumber.g:1979:2: ( ruleTable )
            // InternalCucumber.g:1980:3: ruleTable
            {
             before(grammarAccess.getExampleAccess().getTableTableParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getTableTableParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__TableAssignment_4"


    // $ANTLR start "rule__Step__KeywordAssignment_0"
    // InternalCucumber.g:1989:1: rule__Step__KeywordAssignment_0 : ( ( rule__Step__KeywordAlternatives_0_0 ) ) ;
    public final void rule__Step__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1993:1: ( ( ( rule__Step__KeywordAlternatives_0_0 ) ) )
            // InternalCucumber.g:1994:2: ( ( rule__Step__KeywordAlternatives_0_0 ) )
            {
            // InternalCucumber.g:1994:2: ( ( rule__Step__KeywordAlternatives_0_0 ) )
            // InternalCucumber.g:1995:3: ( rule__Step__KeywordAlternatives_0_0 )
            {
             before(grammarAccess.getStepAccess().getKeywordAlternatives_0_0()); 
            // InternalCucumber.g:1996:3: ( rule__Step__KeywordAlternatives_0_0 )
            // InternalCucumber.g:1996:4: rule__Step__KeywordAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Step__KeywordAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getKeywordAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__KeywordAssignment_0"


    // $ANTLR start "rule__Step__TitleAssignment_1"
    // InternalCucumber.g:2004:1: rule__Step__TitleAssignment_1 : ( ruleSentence ) ;
    public final void rule__Step__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2008:1: ( ( ruleSentence ) )
            // InternalCucumber.g:2009:2: ( ruleSentence )
            {
            // InternalCucumber.g:2009:2: ( ruleSentence )
            // InternalCucumber.g:2010:3: ruleSentence
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


    // $ANTLR start "rule__Step__TableAssignment_2_0"
    // InternalCucumber.g:2019:1: rule__Step__TableAssignment_2_0 : ( ruleTable ) ;
    public final void rule__Step__TableAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2023:1: ( ( ruleTable ) )
            // InternalCucumber.g:2024:2: ( ruleTable )
            {
            // InternalCucumber.g:2024:2: ( ruleTable )
            // InternalCucumber.g:2025:3: ruleTable
            {
             before(grammarAccess.getStepAccess().getTableTableParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getStepAccess().getTableTableParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__TableAssignment_2_0"


    // $ANTLR start "rule__Step__TextAssignment_2_1"
    // InternalCucumber.g:2034:1: rule__Step__TextAssignment_2_1 : ( ruleDocString ) ;
    public final void rule__Step__TextAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2038:1: ( ( ruleDocString ) )
            // InternalCucumber.g:2039:2: ( ruleDocString )
            {
            // InternalCucumber.g:2039:2: ( ruleDocString )
            // InternalCucumber.g:2040:3: ruleDocString
            {
             before(grammarAccess.getStepAccess().getTextDocStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDocString();

            state._fsp--;

             after(grammarAccess.getStepAccess().getTextDocStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__TextAssignment_2_1"


    // $ANTLR start "rule__Table__RowsAssignment"
    // InternalCucumber.g:2049:1: rule__Table__RowsAssignment : ( ruleTableRow ) ;
    public final void rule__Table__RowsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2053:1: ( ( ruleTableRow ) )
            // InternalCucumber.g:2054:2: ( ruleTableRow )
            {
            // InternalCucumber.g:2054:2: ( ruleTableRow )
            // InternalCucumber.g:2055:3: ruleTableRow
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
    // InternalCucumber.g:2064:1: rule__TableRow__CellsAssignment_0 : ( ruleRowCell ) ;
    public final void rule__TableRow__CellsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2068:1: ( ( ruleRowCell ) )
            // InternalCucumber.g:2069:2: ( ruleRowCell )
            {
            // InternalCucumber.g:2069:2: ( ruleRowCell )
            // InternalCucumber.g:2070:3: ruleRowCell
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
    // InternalCucumber.g:2079:1: rule__RowCell__CellAssignment_0 : ( ( '|' ) ) ;
    public final void rule__RowCell__CellAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2083:1: ( ( ( '|' ) ) )
            // InternalCucumber.g:2084:2: ( ( '|' ) )
            {
            // InternalCucumber.g:2084:2: ( ( '|' ) )
            // InternalCucumber.g:2085:3: ( '|' )
            {
             before(grammarAccess.getRowCellAccess().getCellVerticalLineKeyword_0_0()); 
            // InternalCucumber.g:2086:3: ( '|' )
            // InternalCucumber.g:2087:4: '|'
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


    // $ANTLR start "rule__Description__SentencesAssignment_1"
    // InternalCucumber.g:2098:1: rule__Description__SentencesAssignment_1 : ( ruleSentence ) ;
    public final void rule__Description__SentencesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2102:1: ( ( ruleSentence ) )
            // InternalCucumber.g:2103:2: ( ruleSentence )
            {
            // InternalCucumber.g:2103:2: ( ruleSentence )
            // InternalCucumber.g:2104:3: ruleSentence
            {
             before(grammarAccess.getDescriptionAccess().getSentencesSentenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getDescriptionAccess().getSentencesSentenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__SentencesAssignment_1"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\5\uffff";
    static final String dfa_2s = "\2\4\1\21\2\uffff";
    static final String dfa_3s = "\3\22\2\uffff";
    static final String dfa_4s = "\3\uffff\1\1\1\2";
    static final String dfa_5s = "\5\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\1\13\uffff\1\3\1\4",
            "\1\2\1\1\13\uffff\1\3\1\4",
            "\1\3\1\4",
            "",
            ""
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
            return "384:1: rule__Feature__ScenariosAlternatives_5_0 : ( ( ruleScenario ) | ( ruleScenarioOutline ) );";
        }
    }
    static final String dfa_7s = "\1\1\4\uffff";
    static final String dfa_8s = "\1\4\1\uffff\1\4\1\21\1\uffff";
    static final String dfa_9s = "\1\23\1\uffff\2\23\1\uffff";
    static final String dfa_10s = "\1\uffff\1\2\2\uffff\1\1";
    static final String[] dfa_11s = {
            "\1\3\1\2\13\uffff\2\1\1\4",
            "",
            "\1\3\1\2\13\uffff\2\1\1\4",
            "\2\1\1\4",
            ""
    };
    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[][] dfa_11 = unpackEncodedStringArray(dfa_11s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_5;
            this.transition = dfa_11;
        }
        public String getDescription() {
            return "()* loopback of 1035:3: ( rule__ScenarioOutline__ExamplesAssignment_5 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000007E00L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000007E02L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000007E30L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000007E32L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000022L});

}
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_TAG", "RULE_WORD", "RULE_WS", "RULE_COMMENT", "'Given'", "'When'", "'Then'", "'And'", "'But'", "'*'", "'Feature:'", "'Background:'", "'Scenario:'", "'|'", "'\"\"\"'"
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


    // $ANTLR start "entryRuleStep"
    // InternalCucumber.g:128:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalCucumber.g:129:1: ( ruleStep EOF )
            // InternalCucumber.g:130:1: ruleStep EOF
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
    // InternalCucumber.g:137:1: ruleStep : ( ( rule__Step__Group__0 ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:141:2: ( ( ( rule__Step__Group__0 ) ) )
            // InternalCucumber.g:142:2: ( ( rule__Step__Group__0 ) )
            {
            // InternalCucumber.g:142:2: ( ( rule__Step__Group__0 ) )
            // InternalCucumber.g:143:3: ( rule__Step__Group__0 )
            {
             before(grammarAccess.getStepAccess().getGroup()); 
            // InternalCucumber.g:144:3: ( rule__Step__Group__0 )
            // InternalCucumber.g:144:4: rule__Step__Group__0
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
    // InternalCucumber.g:153:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalCucumber.g:154:1: ( ruleTable EOF )
            // InternalCucumber.g:155:1: ruleTable EOF
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
    // InternalCucumber.g:162:1: ruleTable : ( ( ( rule__Table__RowsAssignment ) ) ( ( rule__Table__RowsAssignment )* ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:166:2: ( ( ( ( rule__Table__RowsAssignment ) ) ( ( rule__Table__RowsAssignment )* ) ) )
            // InternalCucumber.g:167:2: ( ( ( rule__Table__RowsAssignment ) ) ( ( rule__Table__RowsAssignment )* ) )
            {
            // InternalCucumber.g:167:2: ( ( ( rule__Table__RowsAssignment ) ) ( ( rule__Table__RowsAssignment )* ) )
            // InternalCucumber.g:168:3: ( ( rule__Table__RowsAssignment ) ) ( ( rule__Table__RowsAssignment )* )
            {
            // InternalCucumber.g:168:3: ( ( rule__Table__RowsAssignment ) )
            // InternalCucumber.g:169:4: ( rule__Table__RowsAssignment )
            {
             before(grammarAccess.getTableAccess().getRowsAssignment()); 
            // InternalCucumber.g:170:4: ( rule__Table__RowsAssignment )
            // InternalCucumber.g:170:5: rule__Table__RowsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Table__RowsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getRowsAssignment()); 

            }

            // InternalCucumber.g:173:3: ( ( rule__Table__RowsAssignment )* )
            // InternalCucumber.g:174:4: ( rule__Table__RowsAssignment )*
            {
             before(grammarAccess.getTableAccess().getRowsAssignment()); 
            // InternalCucumber.g:175:4: ( rule__Table__RowsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCucumber.g:175:5: rule__Table__RowsAssignment
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
    // InternalCucumber.g:185:1: entryRuleTableRow : ruleTableRow EOF ;
    public final void entryRuleTableRow() throws RecognitionException {
        try {
            // InternalCucumber.g:186:1: ( ruleTableRow EOF )
            // InternalCucumber.g:187:1: ruleTableRow EOF
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
    // InternalCucumber.g:194:1: ruleTableRow : ( ( rule__TableRow__Group__0 ) ) ;
    public final void ruleTableRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:198:2: ( ( ( rule__TableRow__Group__0 ) ) )
            // InternalCucumber.g:199:2: ( ( rule__TableRow__Group__0 ) )
            {
            // InternalCucumber.g:199:2: ( ( rule__TableRow__Group__0 ) )
            // InternalCucumber.g:200:3: ( rule__TableRow__Group__0 )
            {
             before(grammarAccess.getTableRowAccess().getGroup()); 
            // InternalCucumber.g:201:3: ( rule__TableRow__Group__0 )
            // InternalCucumber.g:201:4: rule__TableRow__Group__0
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
    // InternalCucumber.g:210:1: entryRuleRowCell : ruleRowCell EOF ;
    public final void entryRuleRowCell() throws RecognitionException {
        try {
            // InternalCucumber.g:211:1: ( ruleRowCell EOF )
            // InternalCucumber.g:212:1: ruleRowCell EOF
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
    // InternalCucumber.g:219:1: ruleRowCell : ( ( rule__RowCell__Group__0 ) ) ;
    public final void ruleRowCell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:223:2: ( ( ( rule__RowCell__Group__0 ) ) )
            // InternalCucumber.g:224:2: ( ( rule__RowCell__Group__0 ) )
            {
            // InternalCucumber.g:224:2: ( ( rule__RowCell__Group__0 ) )
            // InternalCucumber.g:225:3: ( rule__RowCell__Group__0 )
            {
             before(grammarAccess.getRowCellAccess().getGroup()); 
            // InternalCucumber.g:226:3: ( rule__RowCell__Group__0 )
            // InternalCucumber.g:226:4: rule__RowCell__Group__0
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
    // InternalCucumber.g:235:1: entryRuleDocString : ruleDocString EOF ;
    public final void entryRuleDocString() throws RecognitionException {
        try {
            // InternalCucumber.g:236:1: ( ruleDocString EOF )
            // InternalCucumber.g:237:1: ruleDocString EOF
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
    // InternalCucumber.g:244:1: ruleDocString : ( ( rule__DocString__Group__0 ) ) ;
    public final void ruleDocString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:248:2: ( ( ( rule__DocString__Group__0 ) ) )
            // InternalCucumber.g:249:2: ( ( rule__DocString__Group__0 ) )
            {
            // InternalCucumber.g:249:2: ( ( rule__DocString__Group__0 ) )
            // InternalCucumber.g:250:3: ( rule__DocString__Group__0 )
            {
             before(grammarAccess.getDocStringAccess().getGroup()); 
            // InternalCucumber.g:251:3: ( rule__DocString__Group__0 )
            // InternalCucumber.g:251:4: rule__DocString__Group__0
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
    // InternalCucumber.g:260:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalCucumber.g:261:1: ( ruleDescription EOF )
            // InternalCucumber.g:262:1: ruleDescription EOF
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
    // InternalCucumber.g:269:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:273:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalCucumber.g:274:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalCucumber.g:274:2: ( ( rule__Description__Group__0 ) )
            // InternalCucumber.g:275:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalCucumber.g:276:3: ( rule__Description__Group__0 )
            // InternalCucumber.g:276:4: rule__Description__Group__0
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
    // InternalCucumber.g:285:1: entryRuleTags : ruleTags EOF ;
    public final void entryRuleTags() throws RecognitionException {
        try {
            // InternalCucumber.g:286:1: ( ruleTags EOF )
            // InternalCucumber.g:287:1: ruleTags EOF
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
    // InternalCucumber.g:294:1: ruleTags : ( ( rule__Tags__Group__0 ) ) ;
    public final void ruleTags() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:298:2: ( ( ( rule__Tags__Group__0 ) ) )
            // InternalCucumber.g:299:2: ( ( rule__Tags__Group__0 ) )
            {
            // InternalCucumber.g:299:2: ( ( rule__Tags__Group__0 ) )
            // InternalCucumber.g:300:3: ( rule__Tags__Group__0 )
            {
             before(grammarAccess.getTagsAccess().getGroup()); 
            // InternalCucumber.g:301:3: ( rule__Tags__Group__0 )
            // InternalCucumber.g:301:4: rule__Tags__Group__0
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
    // InternalCucumber.g:310:1: entryRuleSentence : ruleSentence EOF ;
    public final void entryRuleSentence() throws RecognitionException {
        try {
            // InternalCucumber.g:311:1: ( ruleSentence EOF )
            // InternalCucumber.g:312:1: ruleSentence EOF
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
    // InternalCucumber.g:319:1: ruleSentence : ( ( rule__Sentence__Group__0 ) ) ;
    public final void ruleSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:323:2: ( ( ( rule__Sentence__Group__0 ) ) )
            // InternalCucumber.g:324:2: ( ( rule__Sentence__Group__0 ) )
            {
            // InternalCucumber.g:324:2: ( ( rule__Sentence__Group__0 ) )
            // InternalCucumber.g:325:3: ( rule__Sentence__Group__0 )
            {
             before(grammarAccess.getSentenceAccess().getGroup()); 
            // InternalCucumber.g:326:3: ( rule__Sentence__Group__0 )
            // InternalCucumber.g:326:4: rule__Sentence__Group__0
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


    // $ANTLR start "rule__Step__KeywordAlternatives_0_0"
    // InternalCucumber.g:334:1: rule__Step__KeywordAlternatives_0_0 : ( ( 'Given' ) | ( 'When' ) | ( 'Then' ) | ( 'And' ) | ( 'But' ) | ( '*' ) );
    public final void rule__Step__KeywordAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:338:1: ( ( 'Given' ) | ( 'When' ) | ( 'Then' ) | ( 'And' ) | ( 'But' ) | ( '*' ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 9:
                {
                alt2=1;
                }
                break;
            case 10:
                {
                alt2=2;
                }
                break;
            case 11:
                {
                alt2=3;
                }
                break;
            case 12:
                {
                alt2=4;
                }
                break;
            case 13:
                {
                alt2=5;
                }
                break;
            case 14:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCucumber.g:339:2: ( 'Given' )
                    {
                    // InternalCucumber.g:339:2: ( 'Given' )
                    // InternalCucumber.g:340:3: 'Given'
                    {
                     before(grammarAccess.getStepAccess().getKeywordGivenKeyword_0_0_0()); 
                    match(input,9,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getKeywordGivenKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:345:2: ( 'When' )
                    {
                    // InternalCucumber.g:345:2: ( 'When' )
                    // InternalCucumber.g:346:3: 'When'
                    {
                     before(grammarAccess.getStepAccess().getKeywordWhenKeyword_0_0_1()); 
                    match(input,10,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getKeywordWhenKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCucumber.g:351:2: ( 'Then' )
                    {
                    // InternalCucumber.g:351:2: ( 'Then' )
                    // InternalCucumber.g:352:3: 'Then'
                    {
                     before(grammarAccess.getStepAccess().getKeywordThenKeyword_0_0_2()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getKeywordThenKeyword_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCucumber.g:357:2: ( 'And' )
                    {
                    // InternalCucumber.g:357:2: ( 'And' )
                    // InternalCucumber.g:358:3: 'And'
                    {
                     before(grammarAccess.getStepAccess().getKeywordAndKeyword_0_0_3()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getKeywordAndKeyword_0_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCucumber.g:363:2: ( 'But' )
                    {
                    // InternalCucumber.g:363:2: ( 'But' )
                    // InternalCucumber.g:364:3: 'But'
                    {
                     before(grammarAccess.getStepAccess().getKeywordButKeyword_0_0_4()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getStepAccess().getKeywordButKeyword_0_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCucumber.g:369:2: ( '*' )
                    {
                    // InternalCucumber.g:369:2: ( '*' )
                    // InternalCucumber.g:370:3: '*'
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
    // InternalCucumber.g:379:1: rule__Step__Alternatives_2 : ( ( ( rule__Step__TableAssignment_2_0 ) ) | ( ( rule__Step__TextAssignment_2_1 ) ) );
    public final void rule__Step__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:383:1: ( ( ( rule__Step__TableAssignment_2_0 ) ) | ( ( rule__Step__TextAssignment_2_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCucumber.g:384:2: ( ( rule__Step__TableAssignment_2_0 ) )
                    {
                    // InternalCucumber.g:384:2: ( ( rule__Step__TableAssignment_2_0 ) )
                    // InternalCucumber.g:385:3: ( rule__Step__TableAssignment_2_0 )
                    {
                     before(grammarAccess.getStepAccess().getTableAssignment_2_0()); 
                    // InternalCucumber.g:386:3: ( rule__Step__TableAssignment_2_0 )
                    // InternalCucumber.g:386:4: rule__Step__TableAssignment_2_0
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
                    // InternalCucumber.g:390:2: ( ( rule__Step__TextAssignment_2_1 ) )
                    {
                    // InternalCucumber.g:390:2: ( ( rule__Step__TextAssignment_2_1 ) )
                    // InternalCucumber.g:391:3: ( rule__Step__TextAssignment_2_1 )
                    {
                     before(grammarAccess.getStepAccess().getTextAssignment_2_1()); 
                    // InternalCucumber.g:392:3: ( rule__Step__TextAssignment_2_1 )
                    // InternalCucumber.g:392:4: rule__Step__TextAssignment_2_1
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
    // InternalCucumber.g:400:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:404:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalCucumber.g:405:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
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
    // InternalCucumber.g:412:1: rule__Feature__Group__0__Impl : ( ruleTags ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:416:1: ( ( ruleTags ) )
            // InternalCucumber.g:417:1: ( ruleTags )
            {
            // InternalCucumber.g:417:1: ( ruleTags )
            // InternalCucumber.g:418:2: ruleTags
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
    // InternalCucumber.g:427:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:431:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalCucumber.g:432:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
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
    // InternalCucumber.g:439:1: rule__Feature__Group__1__Impl : ( 'Feature:' ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:443:1: ( ( 'Feature:' ) )
            // InternalCucumber.g:444:1: ( 'Feature:' )
            {
            // InternalCucumber.g:444:1: ( 'Feature:' )
            // InternalCucumber.g:445:2: 'Feature:'
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
    // InternalCucumber.g:454:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:458:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalCucumber.g:459:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
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
    // InternalCucumber.g:466:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__TitleAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:470:1: ( ( ( rule__Feature__TitleAssignment_2 ) ) )
            // InternalCucumber.g:471:1: ( ( rule__Feature__TitleAssignment_2 ) )
            {
            // InternalCucumber.g:471:1: ( ( rule__Feature__TitleAssignment_2 ) )
            // InternalCucumber.g:472:2: ( rule__Feature__TitleAssignment_2 )
            {
             before(grammarAccess.getFeatureAccess().getTitleAssignment_2()); 
            // InternalCucumber.g:473:2: ( rule__Feature__TitleAssignment_2 )
            // InternalCucumber.g:473:3: rule__Feature__TitleAssignment_2
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
    // InternalCucumber.g:481:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:485:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalCucumber.g:486:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
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
    // InternalCucumber.g:493:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__DescriptionAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:497:1: ( ( ( rule__Feature__DescriptionAssignment_3 ) ) )
            // InternalCucumber.g:498:1: ( ( rule__Feature__DescriptionAssignment_3 ) )
            {
            // InternalCucumber.g:498:1: ( ( rule__Feature__DescriptionAssignment_3 ) )
            // InternalCucumber.g:499:2: ( rule__Feature__DescriptionAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getDescriptionAssignment_3()); 
            // InternalCucumber.g:500:2: ( rule__Feature__DescriptionAssignment_3 )
            // InternalCucumber.g:500:3: rule__Feature__DescriptionAssignment_3
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
    // InternalCucumber.g:508:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl rule__Feature__Group__5 ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:512:1: ( rule__Feature__Group__4__Impl rule__Feature__Group__5 )
            // InternalCucumber.g:513:2: rule__Feature__Group__4__Impl rule__Feature__Group__5
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
    // InternalCucumber.g:520:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__BackgroundAssignment_4 )? ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:524:1: ( ( ( rule__Feature__BackgroundAssignment_4 )? ) )
            // InternalCucumber.g:525:1: ( ( rule__Feature__BackgroundAssignment_4 )? )
            {
            // InternalCucumber.g:525:1: ( ( rule__Feature__BackgroundAssignment_4 )? )
            // InternalCucumber.g:526:2: ( rule__Feature__BackgroundAssignment_4 )?
            {
             before(grammarAccess.getFeatureAccess().getBackgroundAssignment_4()); 
            // InternalCucumber.g:527:2: ( rule__Feature__BackgroundAssignment_4 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCucumber.g:527:3: rule__Feature__BackgroundAssignment_4
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
    // InternalCucumber.g:535:1: rule__Feature__Group__5 : rule__Feature__Group__5__Impl ;
    public final void rule__Feature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:539:1: ( rule__Feature__Group__5__Impl )
            // InternalCucumber.g:540:2: rule__Feature__Group__5__Impl
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
    // InternalCucumber.g:546:1: rule__Feature__Group__5__Impl : ( ( rule__Feature__ScenariosAssignment_5 )* ) ;
    public final void rule__Feature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:550:1: ( ( ( rule__Feature__ScenariosAssignment_5 )* ) )
            // InternalCucumber.g:551:1: ( ( rule__Feature__ScenariosAssignment_5 )* )
            {
            // InternalCucumber.g:551:1: ( ( rule__Feature__ScenariosAssignment_5 )* )
            // InternalCucumber.g:552:2: ( rule__Feature__ScenariosAssignment_5 )*
            {
             before(grammarAccess.getFeatureAccess().getScenariosAssignment_5()); 
            // InternalCucumber.g:553:2: ( rule__Feature__ScenariosAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_EOL && LA5_0<=RULE_TAG)||LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCucumber.g:553:3: rule__Feature__ScenariosAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Feature__ScenariosAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalCucumber.g:562:1: rule__Background__Group__0 : rule__Background__Group__0__Impl rule__Background__Group__1 ;
    public final void rule__Background__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:566:1: ( rule__Background__Group__0__Impl rule__Background__Group__1 )
            // InternalCucumber.g:567:2: rule__Background__Group__0__Impl rule__Background__Group__1
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
    // InternalCucumber.g:574:1: rule__Background__Group__0__Impl : ( 'Background:' ) ;
    public final void rule__Background__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:578:1: ( ( 'Background:' ) )
            // InternalCucumber.g:579:1: ( 'Background:' )
            {
            // InternalCucumber.g:579:1: ( 'Background:' )
            // InternalCucumber.g:580:2: 'Background:'
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
    // InternalCucumber.g:589:1: rule__Background__Group__1 : rule__Background__Group__1__Impl rule__Background__Group__2 ;
    public final void rule__Background__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:593:1: ( rule__Background__Group__1__Impl rule__Background__Group__2 )
            // InternalCucumber.g:594:2: rule__Background__Group__1__Impl rule__Background__Group__2
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
    // InternalCucumber.g:601:1: rule__Background__Group__1__Impl : ( ( rule__Background__TitleAssignment_1 ) ) ;
    public final void rule__Background__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:605:1: ( ( ( rule__Background__TitleAssignment_1 ) ) )
            // InternalCucumber.g:606:1: ( ( rule__Background__TitleAssignment_1 ) )
            {
            // InternalCucumber.g:606:1: ( ( rule__Background__TitleAssignment_1 ) )
            // InternalCucumber.g:607:2: ( rule__Background__TitleAssignment_1 )
            {
             before(grammarAccess.getBackgroundAccess().getTitleAssignment_1()); 
            // InternalCucumber.g:608:2: ( rule__Background__TitleAssignment_1 )
            // InternalCucumber.g:608:3: rule__Background__TitleAssignment_1
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
    // InternalCucumber.g:616:1: rule__Background__Group__2 : rule__Background__Group__2__Impl rule__Background__Group__3 ;
    public final void rule__Background__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:620:1: ( rule__Background__Group__2__Impl rule__Background__Group__3 )
            // InternalCucumber.g:621:2: rule__Background__Group__2__Impl rule__Background__Group__3
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
    // InternalCucumber.g:628:1: rule__Background__Group__2__Impl : ( ( rule__Background__DescriptionAssignment_2 ) ) ;
    public final void rule__Background__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:632:1: ( ( ( rule__Background__DescriptionAssignment_2 ) ) )
            // InternalCucumber.g:633:1: ( ( rule__Background__DescriptionAssignment_2 ) )
            {
            // InternalCucumber.g:633:1: ( ( rule__Background__DescriptionAssignment_2 ) )
            // InternalCucumber.g:634:2: ( rule__Background__DescriptionAssignment_2 )
            {
             before(grammarAccess.getBackgroundAccess().getDescriptionAssignment_2()); 
            // InternalCucumber.g:635:2: ( rule__Background__DescriptionAssignment_2 )
            // InternalCucumber.g:635:3: rule__Background__DescriptionAssignment_2
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
    // InternalCucumber.g:643:1: rule__Background__Group__3 : rule__Background__Group__3__Impl ;
    public final void rule__Background__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:647:1: ( rule__Background__Group__3__Impl )
            // InternalCucumber.g:648:2: rule__Background__Group__3__Impl
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
    // InternalCucumber.g:654:1: rule__Background__Group__3__Impl : ( ( rule__Background__StepsAssignment_3 )* ) ;
    public final void rule__Background__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:658:1: ( ( ( rule__Background__StepsAssignment_3 )* ) )
            // InternalCucumber.g:659:1: ( ( rule__Background__StepsAssignment_3 )* )
            {
            // InternalCucumber.g:659:1: ( ( rule__Background__StepsAssignment_3 )* )
            // InternalCucumber.g:660:2: ( rule__Background__StepsAssignment_3 )*
            {
             before(grammarAccess.getBackgroundAccess().getStepsAssignment_3()); 
            // InternalCucumber.g:661:2: ( rule__Background__StepsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=9 && LA6_0<=14)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCucumber.g:661:3: rule__Background__StepsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Background__StepsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalCucumber.g:670:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:674:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalCucumber.g:675:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
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
    // InternalCucumber.g:682:1: rule__Scenario__Group__0__Impl : ( ruleTags ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:686:1: ( ( ruleTags ) )
            // InternalCucumber.g:687:1: ( ruleTags )
            {
            // InternalCucumber.g:687:1: ( ruleTags )
            // InternalCucumber.g:688:2: ruleTags
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
    // InternalCucumber.g:697:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:701:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalCucumber.g:702:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
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
    // InternalCucumber.g:709:1: rule__Scenario__Group__1__Impl : ( 'Scenario:' ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:713:1: ( ( 'Scenario:' ) )
            // InternalCucumber.g:714:1: ( 'Scenario:' )
            {
            // InternalCucumber.g:714:1: ( 'Scenario:' )
            // InternalCucumber.g:715:2: 'Scenario:'
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
    // InternalCucumber.g:724:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:728:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // InternalCucumber.g:729:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
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
    // InternalCucumber.g:736:1: rule__Scenario__Group__2__Impl : ( ( rule__Scenario__TitleAssignment_2 ) ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:740:1: ( ( ( rule__Scenario__TitleAssignment_2 ) ) )
            // InternalCucumber.g:741:1: ( ( rule__Scenario__TitleAssignment_2 ) )
            {
            // InternalCucumber.g:741:1: ( ( rule__Scenario__TitleAssignment_2 ) )
            // InternalCucumber.g:742:2: ( rule__Scenario__TitleAssignment_2 )
            {
             before(grammarAccess.getScenarioAccess().getTitleAssignment_2()); 
            // InternalCucumber.g:743:2: ( rule__Scenario__TitleAssignment_2 )
            // InternalCucumber.g:743:3: rule__Scenario__TitleAssignment_2
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
    // InternalCucumber.g:751:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl rule__Scenario__Group__4 ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:755:1: ( rule__Scenario__Group__3__Impl rule__Scenario__Group__4 )
            // InternalCucumber.g:756:2: rule__Scenario__Group__3__Impl rule__Scenario__Group__4
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
    // InternalCucumber.g:763:1: rule__Scenario__Group__3__Impl : ( ( rule__Scenario__DescriptionAssignment_3 ) ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:767:1: ( ( ( rule__Scenario__DescriptionAssignment_3 ) ) )
            // InternalCucumber.g:768:1: ( ( rule__Scenario__DescriptionAssignment_3 ) )
            {
            // InternalCucumber.g:768:1: ( ( rule__Scenario__DescriptionAssignment_3 ) )
            // InternalCucumber.g:769:2: ( rule__Scenario__DescriptionAssignment_3 )
            {
             before(grammarAccess.getScenarioAccess().getDescriptionAssignment_3()); 
            // InternalCucumber.g:770:2: ( rule__Scenario__DescriptionAssignment_3 )
            // InternalCucumber.g:770:3: rule__Scenario__DescriptionAssignment_3
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
    // InternalCucumber.g:778:1: rule__Scenario__Group__4 : rule__Scenario__Group__4__Impl ;
    public final void rule__Scenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:782:1: ( rule__Scenario__Group__4__Impl )
            // InternalCucumber.g:783:2: rule__Scenario__Group__4__Impl
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
    // InternalCucumber.g:789:1: rule__Scenario__Group__4__Impl : ( ( rule__Scenario__StepsAssignment_4 )* ) ;
    public final void rule__Scenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:793:1: ( ( ( rule__Scenario__StepsAssignment_4 )* ) )
            // InternalCucumber.g:794:1: ( ( rule__Scenario__StepsAssignment_4 )* )
            {
            // InternalCucumber.g:794:1: ( ( rule__Scenario__StepsAssignment_4 )* )
            // InternalCucumber.g:795:2: ( rule__Scenario__StepsAssignment_4 )*
            {
             before(grammarAccess.getScenarioAccess().getStepsAssignment_4()); 
            // InternalCucumber.g:796:2: ( rule__Scenario__StepsAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=9 && LA7_0<=14)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCucumber.g:796:3: rule__Scenario__StepsAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Scenario__StepsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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


    // $ANTLR start "rule__Step__Group__0"
    // InternalCucumber.g:805:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:809:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // InternalCucumber.g:810:2: rule__Step__Group__0__Impl rule__Step__Group__1
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
    // InternalCucumber.g:817:1: rule__Step__Group__0__Impl : ( ( rule__Step__KeywordAssignment_0 ) ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:821:1: ( ( ( rule__Step__KeywordAssignment_0 ) ) )
            // InternalCucumber.g:822:1: ( ( rule__Step__KeywordAssignment_0 ) )
            {
            // InternalCucumber.g:822:1: ( ( rule__Step__KeywordAssignment_0 ) )
            // InternalCucumber.g:823:2: ( rule__Step__KeywordAssignment_0 )
            {
             before(grammarAccess.getStepAccess().getKeywordAssignment_0()); 
            // InternalCucumber.g:824:2: ( rule__Step__KeywordAssignment_0 )
            // InternalCucumber.g:824:3: rule__Step__KeywordAssignment_0
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
    // InternalCucumber.g:832:1: rule__Step__Group__1 : rule__Step__Group__1__Impl rule__Step__Group__2 ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:836:1: ( rule__Step__Group__1__Impl rule__Step__Group__2 )
            // InternalCucumber.g:837:2: rule__Step__Group__1__Impl rule__Step__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalCucumber.g:844:1: rule__Step__Group__1__Impl : ( ( rule__Step__TitleAssignment_1 ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:848:1: ( ( ( rule__Step__TitleAssignment_1 ) ) )
            // InternalCucumber.g:849:1: ( ( rule__Step__TitleAssignment_1 ) )
            {
            // InternalCucumber.g:849:1: ( ( rule__Step__TitleAssignment_1 ) )
            // InternalCucumber.g:850:2: ( rule__Step__TitleAssignment_1 )
            {
             before(grammarAccess.getStepAccess().getTitleAssignment_1()); 
            // InternalCucumber.g:851:2: ( rule__Step__TitleAssignment_1 )
            // InternalCucumber.g:851:3: rule__Step__TitleAssignment_1
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
    // InternalCucumber.g:859:1: rule__Step__Group__2 : rule__Step__Group__2__Impl ;
    public final void rule__Step__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:863:1: ( rule__Step__Group__2__Impl )
            // InternalCucumber.g:864:2: rule__Step__Group__2__Impl
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
    // InternalCucumber.g:870:1: rule__Step__Group__2__Impl : ( ( rule__Step__Alternatives_2 )? ) ;
    public final void rule__Step__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:874:1: ( ( ( rule__Step__Alternatives_2 )? ) )
            // InternalCucumber.g:875:1: ( ( rule__Step__Alternatives_2 )? )
            {
            // InternalCucumber.g:875:1: ( ( rule__Step__Alternatives_2 )? )
            // InternalCucumber.g:876:2: ( rule__Step__Alternatives_2 )?
            {
             before(grammarAccess.getStepAccess().getAlternatives_2()); 
            // InternalCucumber.g:877:2: ( rule__Step__Alternatives_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=18 && LA8_0<=19)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCucumber.g:877:3: rule__Step__Alternatives_2
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
    // InternalCucumber.g:886:1: rule__TableRow__Group__0 : rule__TableRow__Group__0__Impl rule__TableRow__Group__1 ;
    public final void rule__TableRow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:890:1: ( rule__TableRow__Group__0__Impl rule__TableRow__Group__1 )
            // InternalCucumber.g:891:2: rule__TableRow__Group__0__Impl rule__TableRow__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalCucumber.g:898:1: rule__TableRow__Group__0__Impl : ( ( ( rule__TableRow__CellsAssignment_0 ) ) ( ( rule__TableRow__CellsAssignment_0 )* ) ) ;
    public final void rule__TableRow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:902:1: ( ( ( ( rule__TableRow__CellsAssignment_0 ) ) ( ( rule__TableRow__CellsAssignment_0 )* ) ) )
            // InternalCucumber.g:903:1: ( ( ( rule__TableRow__CellsAssignment_0 ) ) ( ( rule__TableRow__CellsAssignment_0 )* ) )
            {
            // InternalCucumber.g:903:1: ( ( ( rule__TableRow__CellsAssignment_0 ) ) ( ( rule__TableRow__CellsAssignment_0 )* ) )
            // InternalCucumber.g:904:2: ( ( rule__TableRow__CellsAssignment_0 ) ) ( ( rule__TableRow__CellsAssignment_0 )* )
            {
            // InternalCucumber.g:904:2: ( ( rule__TableRow__CellsAssignment_0 ) )
            // InternalCucumber.g:905:3: ( rule__TableRow__CellsAssignment_0 )
            {
             before(grammarAccess.getTableRowAccess().getCellsAssignment_0()); 
            // InternalCucumber.g:906:3: ( rule__TableRow__CellsAssignment_0 )
            // InternalCucumber.g:906:4: rule__TableRow__CellsAssignment_0
            {
            pushFollow(FOLLOW_3);
            rule__TableRow__CellsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTableRowAccess().getCellsAssignment_0()); 

            }

            // InternalCucumber.g:909:2: ( ( rule__TableRow__CellsAssignment_0 )* )
            // InternalCucumber.g:910:3: ( rule__TableRow__CellsAssignment_0 )*
            {
             before(grammarAccess.getTableRowAccess().getCellsAssignment_0()); 
            // InternalCucumber.g:911:3: ( rule__TableRow__CellsAssignment_0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==RULE_WORD) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalCucumber.g:911:4: rule__TableRow__CellsAssignment_0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__TableRow__CellsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalCucumber.g:920:1: rule__TableRow__Group__1 : rule__TableRow__Group__1__Impl rule__TableRow__Group__2 ;
    public final void rule__TableRow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:924:1: ( rule__TableRow__Group__1__Impl rule__TableRow__Group__2 )
            // InternalCucumber.g:925:2: rule__TableRow__Group__1__Impl rule__TableRow__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalCucumber.g:932:1: rule__TableRow__Group__1__Impl : ( '|' ) ;
    public final void rule__TableRow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:936:1: ( ( '|' ) )
            // InternalCucumber.g:937:1: ( '|' )
            {
            // InternalCucumber.g:937:1: ( '|' )
            // InternalCucumber.g:938:2: '|'
            {
             before(grammarAccess.getTableRowAccess().getVerticalLineKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalCucumber.g:947:1: rule__TableRow__Group__2 : rule__TableRow__Group__2__Impl ;
    public final void rule__TableRow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:951:1: ( rule__TableRow__Group__2__Impl )
            // InternalCucumber.g:952:2: rule__TableRow__Group__2__Impl
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
    // InternalCucumber.g:958:1: rule__TableRow__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__TableRow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:962:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:963:1: ( RULE_EOL )
            {
            // InternalCucumber.g:963:1: ( RULE_EOL )
            // InternalCucumber.g:964:2: RULE_EOL
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
    // InternalCucumber.g:974:1: rule__RowCell__Group__0 : rule__RowCell__Group__0__Impl rule__RowCell__Group__1 ;
    public final void rule__RowCell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:978:1: ( rule__RowCell__Group__0__Impl rule__RowCell__Group__1 )
            // InternalCucumber.g:979:2: rule__RowCell__Group__0__Impl rule__RowCell__Group__1
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
    // InternalCucumber.g:986:1: rule__RowCell__Group__0__Impl : ( ( rule__RowCell__CellAssignment_0 ) ) ;
    public final void rule__RowCell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:990:1: ( ( ( rule__RowCell__CellAssignment_0 ) ) )
            // InternalCucumber.g:991:1: ( ( rule__RowCell__CellAssignment_0 ) )
            {
            // InternalCucumber.g:991:1: ( ( rule__RowCell__CellAssignment_0 ) )
            // InternalCucumber.g:992:2: ( rule__RowCell__CellAssignment_0 )
            {
             before(grammarAccess.getRowCellAccess().getCellAssignment_0()); 
            // InternalCucumber.g:993:2: ( rule__RowCell__CellAssignment_0 )
            // InternalCucumber.g:993:3: rule__RowCell__CellAssignment_0
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
    // InternalCucumber.g:1001:1: rule__RowCell__Group__1 : rule__RowCell__Group__1__Impl ;
    public final void rule__RowCell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1005:1: ( rule__RowCell__Group__1__Impl )
            // InternalCucumber.g:1006:2: rule__RowCell__Group__1__Impl
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
    // InternalCucumber.g:1012:1: rule__RowCell__Group__1__Impl : ( ruleSentence ) ;
    public final void rule__RowCell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1016:1: ( ( ruleSentence ) )
            // InternalCucumber.g:1017:1: ( ruleSentence )
            {
            // InternalCucumber.g:1017:1: ( ruleSentence )
            // InternalCucumber.g:1018:2: ruleSentence
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
    // InternalCucumber.g:1028:1: rule__DocString__Group__0 : rule__DocString__Group__0__Impl rule__DocString__Group__1 ;
    public final void rule__DocString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1032:1: ( rule__DocString__Group__0__Impl rule__DocString__Group__1 )
            // InternalCucumber.g:1033:2: rule__DocString__Group__0__Impl rule__DocString__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalCucumber.g:1040:1: rule__DocString__Group__0__Impl : ( () ) ;
    public final void rule__DocString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1044:1: ( ( () ) )
            // InternalCucumber.g:1045:1: ( () )
            {
            // InternalCucumber.g:1045:1: ( () )
            // InternalCucumber.g:1046:2: ()
            {
             before(grammarAccess.getDocStringAccess().getDocStringAction_0()); 
            // InternalCucumber.g:1047:2: ()
            // InternalCucumber.g:1047:3: 
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
    // InternalCucumber.g:1055:1: rule__DocString__Group__1 : rule__DocString__Group__1__Impl rule__DocString__Group__2 ;
    public final void rule__DocString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1059:1: ( rule__DocString__Group__1__Impl rule__DocString__Group__2 )
            // InternalCucumber.g:1060:2: rule__DocString__Group__1__Impl rule__DocString__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalCucumber.g:1067:1: rule__DocString__Group__1__Impl : ( '\"\"\"' ) ;
    public final void rule__DocString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1071:1: ( ( '\"\"\"' ) )
            // InternalCucumber.g:1072:1: ( '\"\"\"' )
            {
            // InternalCucumber.g:1072:1: ( '\"\"\"' )
            // InternalCucumber.g:1073:2: '\"\"\"'
            {
             before(grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalCucumber.g:1082:1: rule__DocString__Group__2 : rule__DocString__Group__2__Impl rule__DocString__Group__3 ;
    public final void rule__DocString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1086:1: ( rule__DocString__Group__2__Impl rule__DocString__Group__3 )
            // InternalCucumber.g:1087:2: rule__DocString__Group__2__Impl rule__DocString__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalCucumber.g:1094:1: rule__DocString__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__DocString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1098:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1099:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1099:1: ( RULE_EOL )
            // InternalCucumber.g:1100:2: RULE_EOL
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
    // InternalCucumber.g:1109:1: rule__DocString__Group__3 : rule__DocString__Group__3__Impl rule__DocString__Group__4 ;
    public final void rule__DocString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1113:1: ( rule__DocString__Group__3__Impl rule__DocString__Group__4 )
            // InternalCucumber.g:1114:2: rule__DocString__Group__3__Impl rule__DocString__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalCucumber.g:1121:1: rule__DocString__Group__3__Impl : ( ( ruleSentence )* ) ;
    public final void rule__DocString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1125:1: ( ( ( ruleSentence )* ) )
            // InternalCucumber.g:1126:1: ( ( ruleSentence )* )
            {
            // InternalCucumber.g:1126:1: ( ( ruleSentence )* )
            // InternalCucumber.g:1127:2: ( ruleSentence )*
            {
             before(grammarAccess.getDocStringAccess().getSentenceParserRuleCall_3()); 
            // InternalCucumber.g:1128:2: ( ruleSentence )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_WORD) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCucumber.g:1128:3: ruleSentence
            	    {
            	    pushFollow(FOLLOW_15);
            	    ruleSentence();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalCucumber.g:1136:1: rule__DocString__Group__4 : rule__DocString__Group__4__Impl rule__DocString__Group__5 ;
    public final void rule__DocString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1140:1: ( rule__DocString__Group__4__Impl rule__DocString__Group__5 )
            // InternalCucumber.g:1141:2: rule__DocString__Group__4__Impl rule__DocString__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalCucumber.g:1148:1: rule__DocString__Group__4__Impl : ( '\"\"\"' ) ;
    public final void rule__DocString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1152:1: ( ( '\"\"\"' ) )
            // InternalCucumber.g:1153:1: ( '\"\"\"' )
            {
            // InternalCucumber.g:1153:1: ( '\"\"\"' )
            // InternalCucumber.g:1154:2: '\"\"\"'
            {
             before(grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_4()); 
            match(input,19,FOLLOW_2); 
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
    // InternalCucumber.g:1163:1: rule__DocString__Group__5 : rule__DocString__Group__5__Impl ;
    public final void rule__DocString__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1167:1: ( rule__DocString__Group__5__Impl )
            // InternalCucumber.g:1168:2: rule__DocString__Group__5__Impl
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
    // InternalCucumber.g:1174:1: rule__DocString__Group__5__Impl : ( RULE_EOL ) ;
    public final void rule__DocString__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1178:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1179:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1179:1: ( RULE_EOL )
            // InternalCucumber.g:1180:2: RULE_EOL
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
    // InternalCucumber.g:1190:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1194:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalCucumber.g:1195:2: rule__Description__Group__0__Impl rule__Description__Group__1
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
    // InternalCucumber.g:1202:1: rule__Description__Group__0__Impl : ( () ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1206:1: ( ( () ) )
            // InternalCucumber.g:1207:1: ( () )
            {
            // InternalCucumber.g:1207:1: ( () )
            // InternalCucumber.g:1208:2: ()
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionAction_0()); 
            // InternalCucumber.g:1209:2: ()
            // InternalCucumber.g:1209:3: 
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
    // InternalCucumber.g:1217:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1221:1: ( rule__Description__Group__1__Impl )
            // InternalCucumber.g:1222:2: rule__Description__Group__1__Impl
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
    // InternalCucumber.g:1228:1: rule__Description__Group__1__Impl : ( ( rule__Description__SentencesAssignment_1 )* ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1232:1: ( ( ( rule__Description__SentencesAssignment_1 )* ) )
            // InternalCucumber.g:1233:1: ( ( rule__Description__SentencesAssignment_1 )* )
            {
            // InternalCucumber.g:1233:1: ( ( rule__Description__SentencesAssignment_1 )* )
            // InternalCucumber.g:1234:2: ( rule__Description__SentencesAssignment_1 )*
            {
             before(grammarAccess.getDescriptionAccess().getSentencesAssignment_1()); 
            // InternalCucumber.g:1235:2: ( rule__Description__SentencesAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_WORD) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCucumber.g:1235:3: rule__Description__SentencesAssignment_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Description__SentencesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalCucumber.g:1244:1: rule__Tags__Group__0 : rule__Tags__Group__0__Impl rule__Tags__Group__1 ;
    public final void rule__Tags__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1248:1: ( rule__Tags__Group__0__Impl rule__Tags__Group__1 )
            // InternalCucumber.g:1249:2: rule__Tags__Group__0__Impl rule__Tags__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalCucumber.g:1256:1: rule__Tags__Group__0__Impl : ( ( RULE_TAG )* ) ;
    public final void rule__Tags__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1260:1: ( ( ( RULE_TAG )* ) )
            // InternalCucumber.g:1261:1: ( ( RULE_TAG )* )
            {
            // InternalCucumber.g:1261:1: ( ( RULE_TAG )* )
            // InternalCucumber.g:1262:2: ( RULE_TAG )*
            {
             before(grammarAccess.getTagsAccess().getTAGTerminalRuleCall_0()); 
            // InternalCucumber.g:1263:2: ( RULE_TAG )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_TAG) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCucumber.g:1263:3: RULE_TAG
            	    {
            	    match(input,RULE_TAG,FOLLOW_17); 

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalCucumber.g:1271:1: rule__Tags__Group__1 : rule__Tags__Group__1__Impl ;
    public final void rule__Tags__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1275:1: ( rule__Tags__Group__1__Impl )
            // InternalCucumber.g:1276:2: rule__Tags__Group__1__Impl
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
    // InternalCucumber.g:1282:1: rule__Tags__Group__1__Impl : ( ( RULE_EOL )? ) ;
    public final void rule__Tags__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1286:1: ( ( ( RULE_EOL )? ) )
            // InternalCucumber.g:1287:1: ( ( RULE_EOL )? )
            {
            // InternalCucumber.g:1287:1: ( ( RULE_EOL )? )
            // InternalCucumber.g:1288:2: ( RULE_EOL )?
            {
             before(grammarAccess.getTagsAccess().getEOLTerminalRuleCall_1()); 
            // InternalCucumber.g:1289:2: ( RULE_EOL )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_EOL) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCucumber.g:1289:3: RULE_EOL
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
    // InternalCucumber.g:1298:1: rule__Sentence__Group__0 : rule__Sentence__Group__0__Impl rule__Sentence__Group__1 ;
    public final void rule__Sentence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1302:1: ( rule__Sentence__Group__0__Impl rule__Sentence__Group__1 )
            // InternalCucumber.g:1303:2: rule__Sentence__Group__0__Impl rule__Sentence__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalCucumber.g:1310:1: rule__Sentence__Group__0__Impl : ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) ) ;
    public final void rule__Sentence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1314:1: ( ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) ) )
            // InternalCucumber.g:1315:1: ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) )
            {
            // InternalCucumber.g:1315:1: ( ( ( RULE_WORD ) ) ( ( RULE_WORD )* ) )
            // InternalCucumber.g:1316:2: ( ( RULE_WORD ) ) ( ( RULE_WORD )* )
            {
            // InternalCucumber.g:1316:2: ( ( RULE_WORD ) )
            // InternalCucumber.g:1317:3: ( RULE_WORD )
            {
             before(grammarAccess.getSentenceAccess().getWORDTerminalRuleCall_0()); 
            // InternalCucumber.g:1318:3: ( RULE_WORD )
            // InternalCucumber.g:1318:4: RULE_WORD
            {
            match(input,RULE_WORD,FOLLOW_15); 

            }

             after(grammarAccess.getSentenceAccess().getWORDTerminalRuleCall_0()); 

            }

            // InternalCucumber.g:1321:2: ( ( RULE_WORD )* )
            // InternalCucumber.g:1322:3: ( RULE_WORD )*
            {
             before(grammarAccess.getSentenceAccess().getWORDTerminalRuleCall_0()); 
            // InternalCucumber.g:1323:3: ( RULE_WORD )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_WORD) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCucumber.g:1323:4: RULE_WORD
            	    {
            	    match(input,RULE_WORD,FOLLOW_15); 

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalCucumber.g:1332:1: rule__Sentence__Group__1 : rule__Sentence__Group__1__Impl ;
    public final void rule__Sentence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1336:1: ( rule__Sentence__Group__1__Impl )
            // InternalCucumber.g:1337:2: rule__Sentence__Group__1__Impl
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
    // InternalCucumber.g:1343:1: rule__Sentence__Group__1__Impl : ( ( RULE_EOL )? ) ;
    public final void rule__Sentence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1347:1: ( ( ( RULE_EOL )? ) )
            // InternalCucumber.g:1348:1: ( ( RULE_EOL )? )
            {
            // InternalCucumber.g:1348:1: ( ( RULE_EOL )? )
            // InternalCucumber.g:1349:2: ( RULE_EOL )?
            {
             before(grammarAccess.getSentenceAccess().getEOLTerminalRuleCall_1()); 
            // InternalCucumber.g:1350:2: ( RULE_EOL )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_EOL) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCucumber.g:1350:3: RULE_EOL
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
    // InternalCucumber.g:1359:1: rule__Feature__TitleAssignment_2 : ( ruleSentence ) ;
    public final void rule__Feature__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1363:1: ( ( ruleSentence ) )
            // InternalCucumber.g:1364:2: ( ruleSentence )
            {
            // InternalCucumber.g:1364:2: ( ruleSentence )
            // InternalCucumber.g:1365:3: ruleSentence
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
    // InternalCucumber.g:1374:1: rule__Feature__DescriptionAssignment_3 : ( ruleDescription ) ;
    public final void rule__Feature__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1378:1: ( ( ruleDescription ) )
            // InternalCucumber.g:1379:2: ( ruleDescription )
            {
            // InternalCucumber.g:1379:2: ( ruleDescription )
            // InternalCucumber.g:1380:3: ruleDescription
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
    // InternalCucumber.g:1389:1: rule__Feature__BackgroundAssignment_4 : ( ruleBackground ) ;
    public final void rule__Feature__BackgroundAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1393:1: ( ( ruleBackground ) )
            // InternalCucumber.g:1394:2: ( ruleBackground )
            {
            // InternalCucumber.g:1394:2: ( ruleBackground )
            // InternalCucumber.g:1395:3: ruleBackground
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
    // InternalCucumber.g:1404:1: rule__Feature__ScenariosAssignment_5 : ( ruleScenario ) ;
    public final void rule__Feature__ScenariosAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1408:1: ( ( ruleScenario ) )
            // InternalCucumber.g:1409:2: ( ruleScenario )
            {
            // InternalCucumber.g:1409:2: ( ruleScenario )
            // InternalCucumber.g:1410:3: ruleScenario
            {
             before(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_5_0()); 

            }


            }

        }
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
    // InternalCucumber.g:1419:1: rule__Background__TitleAssignment_1 : ( ruleSentence ) ;
    public final void rule__Background__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1423:1: ( ( ruleSentence ) )
            // InternalCucumber.g:1424:2: ( ruleSentence )
            {
            // InternalCucumber.g:1424:2: ( ruleSentence )
            // InternalCucumber.g:1425:3: ruleSentence
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
    // InternalCucumber.g:1434:1: rule__Background__DescriptionAssignment_2 : ( ruleDescription ) ;
    public final void rule__Background__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1438:1: ( ( ruleDescription ) )
            // InternalCucumber.g:1439:2: ( ruleDescription )
            {
            // InternalCucumber.g:1439:2: ( ruleDescription )
            // InternalCucumber.g:1440:3: ruleDescription
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
    // InternalCucumber.g:1449:1: rule__Background__StepsAssignment_3 : ( ruleStep ) ;
    public final void rule__Background__StepsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1453:1: ( ( ruleStep ) )
            // InternalCucumber.g:1454:2: ( ruleStep )
            {
            // InternalCucumber.g:1454:2: ( ruleStep )
            // InternalCucumber.g:1455:3: ruleStep
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
    // InternalCucumber.g:1464:1: rule__Scenario__TitleAssignment_2 : ( ruleSentence ) ;
    public final void rule__Scenario__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1468:1: ( ( ruleSentence ) )
            // InternalCucumber.g:1469:2: ( ruleSentence )
            {
            // InternalCucumber.g:1469:2: ( ruleSentence )
            // InternalCucumber.g:1470:3: ruleSentence
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
    // InternalCucumber.g:1479:1: rule__Scenario__DescriptionAssignment_3 : ( ruleDescription ) ;
    public final void rule__Scenario__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1483:1: ( ( ruleDescription ) )
            // InternalCucumber.g:1484:2: ( ruleDescription )
            {
            // InternalCucumber.g:1484:2: ( ruleDescription )
            // InternalCucumber.g:1485:3: ruleDescription
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
    // InternalCucumber.g:1494:1: rule__Scenario__StepsAssignment_4 : ( ruleStep ) ;
    public final void rule__Scenario__StepsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1498:1: ( ( ruleStep ) )
            // InternalCucumber.g:1499:2: ( ruleStep )
            {
            // InternalCucumber.g:1499:2: ( ruleStep )
            // InternalCucumber.g:1500:3: ruleStep
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


    // $ANTLR start "rule__Step__KeywordAssignment_0"
    // InternalCucumber.g:1509:1: rule__Step__KeywordAssignment_0 : ( ( rule__Step__KeywordAlternatives_0_0 ) ) ;
    public final void rule__Step__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1513:1: ( ( ( rule__Step__KeywordAlternatives_0_0 ) ) )
            // InternalCucumber.g:1514:2: ( ( rule__Step__KeywordAlternatives_0_0 ) )
            {
            // InternalCucumber.g:1514:2: ( ( rule__Step__KeywordAlternatives_0_0 ) )
            // InternalCucumber.g:1515:3: ( rule__Step__KeywordAlternatives_0_0 )
            {
             before(grammarAccess.getStepAccess().getKeywordAlternatives_0_0()); 
            // InternalCucumber.g:1516:3: ( rule__Step__KeywordAlternatives_0_0 )
            // InternalCucumber.g:1516:4: rule__Step__KeywordAlternatives_0_0
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
    // InternalCucumber.g:1524:1: rule__Step__TitleAssignment_1 : ( ruleSentence ) ;
    public final void rule__Step__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1528:1: ( ( ruleSentence ) )
            // InternalCucumber.g:1529:2: ( ruleSentence )
            {
            // InternalCucumber.g:1529:2: ( ruleSentence )
            // InternalCucumber.g:1530:3: ruleSentence
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
    // InternalCucumber.g:1539:1: rule__Step__TableAssignment_2_0 : ( ruleTable ) ;
    public final void rule__Step__TableAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1543:1: ( ( ruleTable ) )
            // InternalCucumber.g:1544:2: ( ruleTable )
            {
            // InternalCucumber.g:1544:2: ( ruleTable )
            // InternalCucumber.g:1545:3: ruleTable
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
    // InternalCucumber.g:1554:1: rule__Step__TextAssignment_2_1 : ( ruleDocString ) ;
    public final void rule__Step__TextAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1558:1: ( ( ruleDocString ) )
            // InternalCucumber.g:1559:2: ( ruleDocString )
            {
            // InternalCucumber.g:1559:2: ( ruleDocString )
            // InternalCucumber.g:1560:3: ruleDocString
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
    // InternalCucumber.g:1569:1: rule__Table__RowsAssignment : ( ruleTableRow ) ;
    public final void rule__Table__RowsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1573:1: ( ( ruleTableRow ) )
            // InternalCucumber.g:1574:2: ( ruleTableRow )
            {
            // InternalCucumber.g:1574:2: ( ruleTableRow )
            // InternalCucumber.g:1575:3: ruleTableRow
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
    // InternalCucumber.g:1584:1: rule__TableRow__CellsAssignment_0 : ( ruleRowCell ) ;
    public final void rule__TableRow__CellsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1588:1: ( ( ruleRowCell ) )
            // InternalCucumber.g:1589:2: ( ruleRowCell )
            {
            // InternalCucumber.g:1589:2: ( ruleRowCell )
            // InternalCucumber.g:1590:3: ruleRowCell
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
    // InternalCucumber.g:1599:1: rule__RowCell__CellAssignment_0 : ( ( '|' ) ) ;
    public final void rule__RowCell__CellAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1603:1: ( ( ( '|' ) ) )
            // InternalCucumber.g:1604:2: ( ( '|' ) )
            {
            // InternalCucumber.g:1604:2: ( ( '|' ) )
            // InternalCucumber.g:1605:3: ( '|' )
            {
             before(grammarAccess.getRowCellAccess().getCellVerticalLineKeyword_0_0()); 
            // InternalCucumber.g:1606:3: ( '|' )
            // InternalCucumber.g:1607:4: '|'
            {
             before(grammarAccess.getRowCellAccess().getCellVerticalLineKeyword_0_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalCucumber.g:1618:1: rule__Description__SentencesAssignment_1 : ( ruleSentence ) ;
    public final void rule__Description__SentencesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1622:1: ( ( ruleSentence ) )
            // InternalCucumber.g:1623:2: ( ruleSentence )
            {
            // InternalCucumber.g:1623:2: ( ruleSentence )
            // InternalCucumber.g:1624:3: ruleSentence
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000007E00L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000007E02L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000022L});

}
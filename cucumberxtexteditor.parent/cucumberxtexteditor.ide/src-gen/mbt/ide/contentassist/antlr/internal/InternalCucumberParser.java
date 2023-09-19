package mbt.ide.contentassist.antlr.internal;

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
import mbt.services.CucumberGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCucumberParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WORD", "RULE_INT", "RULE_STRING", "RULE_PLACEHOLDER", "RULE_STEP_KEYWORD", "RULE_TAGNAME", "RULE_ANY_OTHER", "RULE_EOL", "RULE_TABLE_CELL", "RULE_NL", "RULE_SL_COMMENT", "RULE_WS", "RULE_ASCII_DIGIT", "RULE_DIGIT", "RULE_LATIN_ALPHABET", "RULE_LETTER", "RULE_ASCII_SPACE", "RULE_ASCII_SYMBOLS", "'Feature:'", "'Background:'", "'Scenario:'", "'Scenario'", "'Outline:'", "'Examples:'", "'|'", "'\"\"\"'"
    };
    public static final int RULE_WORD=4;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_ASCII_SYMBOLS=21;
    public static final int EOF=-1;
    public static final int RULE_LATIN_ALPHABET=18;
    public static final int RULE_EOL=11;
    public static final int RULE_WS=15;
    public static final int RULE_DIGIT=17;
    public static final int RULE_TAGNAME=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_ASCII_DIGIT=16;
    public static final int RULE_LETTER=19;
    public static final int T__26=26;
    public static final int RULE_PLACEHOLDER=7;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int RULE_ASCII_SPACE=20;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int RULE_STEP_KEYWORD=8;
    public static final int T__25=25;
    public static final int RULE_NL=13;
    public static final int RULE_TABLE_CELL=12;

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
    // InternalCucumber.g:54:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalCucumber.g:55:1: ( ruleFeature EOF )
            // InternalCucumber.g:56:1: ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalCucumber.g:63:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:67:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalCucumber.g:68:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalCucumber.g:68:2: ( ( rule__Feature__Group__0 ) )
            // InternalCucumber.g:69:3: ( rule__Feature__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getGroup()); 
            }
            // InternalCucumber.g:70:3: ( rule__Feature__Group__0 )
            // InternalCucumber.g:70:4: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getGroup()); 
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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleAbstractScenario"
    // InternalCucumber.g:79:1: entryRuleAbstractScenario : ruleAbstractScenario EOF ;
    public final void entryRuleAbstractScenario() throws RecognitionException {
        try {
            // InternalCucumber.g:80:1: ( ruleAbstractScenario EOF )
            // InternalCucumber.g:81:1: ruleAbstractScenario EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractScenarioRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAbstractScenario();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractScenarioRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalCucumber.g:88:1: ruleAbstractScenario : ( ( rule__AbstractScenario__Alternatives ) ) ;
    public final void ruleAbstractScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:92:2: ( ( ( rule__AbstractScenario__Alternatives ) ) )
            // InternalCucumber.g:93:2: ( ( rule__AbstractScenario__Alternatives ) )
            {
            // InternalCucumber.g:93:2: ( ( rule__AbstractScenario__Alternatives ) )
            // InternalCucumber.g:94:3: ( rule__AbstractScenario__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractScenarioAccess().getAlternatives()); 
            }
            // InternalCucumber.g:95:3: ( rule__AbstractScenario__Alternatives )
            // InternalCucumber.g:95:4: rule__AbstractScenario__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractScenario__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractScenarioAccess().getAlternatives()); 
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
    // $ANTLR end "ruleAbstractScenario"


    // $ANTLR start "entryRuleBackground"
    // InternalCucumber.g:104:1: entryRuleBackground : ruleBackground EOF ;
    public final void entryRuleBackground() throws RecognitionException {
        try {
            // InternalCucumber.g:105:1: ( ruleBackground EOF )
            // InternalCucumber.g:106:1: ruleBackground EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBackgroundRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBackground();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBackgroundRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalCucumber.g:113:1: ruleBackground : ( ( rule__Background__Group__0 ) ) ;
    public final void ruleBackground() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:117:2: ( ( ( rule__Background__Group__0 ) ) )
            // InternalCucumber.g:118:2: ( ( rule__Background__Group__0 ) )
            {
            // InternalCucumber.g:118:2: ( ( rule__Background__Group__0 ) )
            // InternalCucumber.g:119:3: ( rule__Background__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBackgroundAccess().getGroup()); 
            }
            // InternalCucumber.g:120:3: ( rule__Background__Group__0 )
            // InternalCucumber.g:120:4: rule__Background__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Background__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBackgroundAccess().getGroup()); 
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
    // $ANTLR end "ruleBackground"


    // $ANTLR start "entryRuleScenario"
    // InternalCucumber.g:129:1: entryRuleScenario : ruleScenario EOF ;
    public final void entryRuleScenario() throws RecognitionException {
        try {
            // InternalCucumber.g:130:1: ( ruleScenario EOF )
            // InternalCucumber.g:131:1: ruleScenario EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScenarioRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleScenario();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScenarioRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalCucumber.g:138:1: ruleScenario : ( ( rule__Scenario__Group__0 ) ) ;
    public final void ruleScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:142:2: ( ( ( rule__Scenario__Group__0 ) ) )
            // InternalCucumber.g:143:2: ( ( rule__Scenario__Group__0 ) )
            {
            // InternalCucumber.g:143:2: ( ( rule__Scenario__Group__0 ) )
            // InternalCucumber.g:144:3: ( rule__Scenario__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScenarioAccess().getGroup()); 
            }
            // InternalCucumber.g:145:3: ( rule__Scenario__Group__0 )
            // InternalCucumber.g:145:4: rule__Scenario__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScenarioAccess().getGroup()); 
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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleScenarioOutline"
    // InternalCucumber.g:154:1: entryRuleScenarioOutline : ruleScenarioOutline EOF ;
    public final void entryRuleScenarioOutline() throws RecognitionException {
        try {
            // InternalCucumber.g:155:1: ( ruleScenarioOutline EOF )
            // InternalCucumber.g:156:1: ruleScenarioOutline EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScenarioOutlineRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleScenarioOutline();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScenarioOutlineRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalCucumber.g:163:1: ruleScenarioOutline : ( ( rule__ScenarioOutline__Group__0 ) ) ;
    public final void ruleScenarioOutline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:167:2: ( ( ( rule__ScenarioOutline__Group__0 ) ) )
            // InternalCucumber.g:168:2: ( ( rule__ScenarioOutline__Group__0 ) )
            {
            // InternalCucumber.g:168:2: ( ( rule__ScenarioOutline__Group__0 ) )
            // InternalCucumber.g:169:3: ( rule__ScenarioOutline__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScenarioOutlineAccess().getGroup()); 
            }
            // InternalCucumber.g:170:3: ( rule__ScenarioOutline__Group__0 )
            // InternalCucumber.g:170:4: rule__ScenarioOutline__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScenarioOutlineAccess().getGroup()); 
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
    // $ANTLR end "ruleScenarioOutline"


    // $ANTLR start "entryRuleStep"
    // InternalCucumber.g:179:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalCucumber.g:180:1: ( ruleStep EOF )
            // InternalCucumber.g:181:1: ruleStep EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStep();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalCucumber.g:188:1: ruleStep : ( ( rule__Step__Group__0 ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:192:2: ( ( ( rule__Step__Group__0 ) ) )
            // InternalCucumber.g:193:2: ( ( rule__Step__Group__0 ) )
            {
            // InternalCucumber.g:193:2: ( ( rule__Step__Group__0 ) )
            // InternalCucumber.g:194:3: ( rule__Step__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getGroup()); 
            }
            // InternalCucumber.g:195:3: ( rule__Step__Group__0 )
            // InternalCucumber.g:195:4: rule__Step__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getGroup()); 
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
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleExample"
    // InternalCucumber.g:204:1: entryRuleExample : ruleExample EOF ;
    public final void entryRuleExample() throws RecognitionException {
        try {
            // InternalCucumber.g:205:1: ( ruleExample EOF )
            // InternalCucumber.g:206:1: ruleExample EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExampleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExample();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExampleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalCucumber.g:213:1: ruleExample : ( ( rule__Example__Group__0 ) ) ;
    public final void ruleExample() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:217:2: ( ( ( rule__Example__Group__0 ) ) )
            // InternalCucumber.g:218:2: ( ( rule__Example__Group__0 ) )
            {
            // InternalCucumber.g:218:2: ( ( rule__Example__Group__0 ) )
            // InternalCucumber.g:219:3: ( rule__Example__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExampleAccess().getGroup()); 
            }
            // InternalCucumber.g:220:3: ( rule__Example__Group__0 )
            // InternalCucumber.g:220:4: rule__Example__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Example__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExampleAccess().getGroup()); 
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
    // $ANTLR end "ruleExample"


    // $ANTLR start "entryRuleTable"
    // InternalCucumber.g:229:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalCucumber.g:230:1: ( ruleTable EOF )
            // InternalCucumber.g:231:1: ruleTable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalCucumber.g:238:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:242:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalCucumber.g:243:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalCucumber.g:243:2: ( ( rule__Table__Group__0 ) )
            // InternalCucumber.g:244:3: ( rule__Table__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getGroup()); 
            }
            // InternalCucumber.g:245:3: ( rule__Table__Group__0 )
            // InternalCucumber.g:245:4: rule__Table__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getGroup()); 
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
    // InternalCucumber.g:254:1: entryRuleTableRow : ruleTableRow EOF ;
    public final void entryRuleTableRow() throws RecognitionException {
        try {
            // InternalCucumber.g:255:1: ( ruleTableRow EOF )
            // InternalCucumber.g:256:1: ruleTableRow EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableRowRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTableRow();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableRowRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalCucumber.g:263:1: ruleTableRow : ( ( rule__TableRow__Group__0 ) ) ;
    public final void ruleTableRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:267:2: ( ( ( rule__TableRow__Group__0 ) ) )
            // InternalCucumber.g:268:2: ( ( rule__TableRow__Group__0 ) )
            {
            // InternalCucumber.g:268:2: ( ( rule__TableRow__Group__0 ) )
            // InternalCucumber.g:269:3: ( rule__TableRow__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableRowAccess().getGroup()); 
            }
            // InternalCucumber.g:270:3: ( rule__TableRow__Group__0 )
            // InternalCucumber.g:270:4: rule__TableRow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TableRow__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableRowAccess().getGroup()); 
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
    // $ANTLR end "ruleTableRow"


    // $ANTLR start "entryRuleTableCol"
    // InternalCucumber.g:279:1: entryRuleTableCol : ruleTableCol EOF ;
    public final void entryRuleTableCol() throws RecognitionException {
        try {
            // InternalCucumber.g:280:1: ( ruleTableCol EOF )
            // InternalCucumber.g:281:1: ruleTableCol EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableColRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTableCol();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableColRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTableCol"


    // $ANTLR start "ruleTableCol"
    // InternalCucumber.g:288:1: ruleTableCol : ( ( rule__TableCol__Group__0 ) ) ;
    public final void ruleTableCol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:292:2: ( ( ( rule__TableCol__Group__0 ) ) )
            // InternalCucumber.g:293:2: ( ( rule__TableCol__Group__0 ) )
            {
            // InternalCucumber.g:293:2: ( ( rule__TableCol__Group__0 ) )
            // InternalCucumber.g:294:3: ( rule__TableCol__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableColAccess().getGroup()); 
            }
            // InternalCucumber.g:295:3: ( rule__TableCol__Group__0 )
            // InternalCucumber.g:295:4: rule__TableCol__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TableCol__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableColAccess().getGroup()); 
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
    // $ANTLR end "ruleTableCol"


    // $ANTLR start "entryRuleDocString"
    // InternalCucumber.g:304:1: entryRuleDocString : ruleDocString EOF ;
    public final void entryRuleDocString() throws RecognitionException {
        try {
            // InternalCucumber.g:305:1: ( ruleDocString EOF )
            // InternalCucumber.g:306:1: ruleDocString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocStringRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDocString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocStringRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalCucumber.g:313:1: ruleDocString : ( ( rule__DocString__Group__0 ) ) ;
    public final void ruleDocString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:317:2: ( ( ( rule__DocString__Group__0 ) ) )
            // InternalCucumber.g:318:2: ( ( rule__DocString__Group__0 ) )
            {
            // InternalCucumber.g:318:2: ( ( rule__DocString__Group__0 ) )
            // InternalCucumber.g:319:3: ( rule__DocString__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocStringAccess().getGroup()); 
            }
            // InternalCucumber.g:320:3: ( rule__DocString__Group__0 )
            // InternalCucumber.g:320:4: rule__DocString__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DocString__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocStringAccess().getGroup()); 
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
    // $ANTLR end "ruleDocString"


    // $ANTLR start "entryRuleTitle"
    // InternalCucumber.g:329:1: entryRuleTitle : ruleTitle EOF ;
    public final void entryRuleTitle() throws RecognitionException {
        try {
            // InternalCucumber.g:330:1: ( ruleTitle EOF )
            // InternalCucumber.g:331:1: ruleTitle EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTitleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTitle();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTitleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalCucumber.g:338:1: ruleTitle : ( ( rule__Title__Group__0 ) ) ;
    public final void ruleTitle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:342:2: ( ( ( rule__Title__Group__0 ) ) )
            // InternalCucumber.g:343:2: ( ( rule__Title__Group__0 ) )
            {
            // InternalCucumber.g:343:2: ( ( rule__Title__Group__0 ) )
            // InternalCucumber.g:344:3: ( rule__Title__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTitleAccess().getGroup()); 
            }
            // InternalCucumber.g:345:3: ( rule__Title__Group__0 )
            // InternalCucumber.g:345:4: rule__Title__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Title__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTitleAccess().getGroup()); 
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


    // $ANTLR start "entryRuleNarrative"
    // InternalCucumber.g:354:1: entryRuleNarrative : ruleNarrative EOF ;
    public final void entryRuleNarrative() throws RecognitionException {
        try {
            // InternalCucumber.g:355:1: ( ruleNarrative EOF )
            // InternalCucumber.g:356:1: ruleNarrative EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNarrativeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNarrative();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNarrativeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNarrative"


    // $ANTLR start "ruleNarrative"
    // InternalCucumber.g:363:1: ruleNarrative : ( ( ( rule__Narrative__Group__0 ) ) ( ( rule__Narrative__Group__0 )* ) ) ;
    public final void ruleNarrative() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:367:2: ( ( ( ( rule__Narrative__Group__0 ) ) ( ( rule__Narrative__Group__0 )* ) ) )
            // InternalCucumber.g:368:2: ( ( ( rule__Narrative__Group__0 ) ) ( ( rule__Narrative__Group__0 )* ) )
            {
            // InternalCucumber.g:368:2: ( ( ( rule__Narrative__Group__0 ) ) ( ( rule__Narrative__Group__0 )* ) )
            // InternalCucumber.g:369:3: ( ( rule__Narrative__Group__0 ) ) ( ( rule__Narrative__Group__0 )* )
            {
            // InternalCucumber.g:369:3: ( ( rule__Narrative__Group__0 ) )
            // InternalCucumber.g:370:4: ( rule__Narrative__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNarrativeAccess().getGroup()); 
            }
            // InternalCucumber.g:371:4: ( rule__Narrative__Group__0 )
            // InternalCucumber.g:371:5: rule__Narrative__Group__0
            {
            pushFollow(FOLLOW_3);
            rule__Narrative__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNarrativeAccess().getGroup()); 
            }

            }

            // InternalCucumber.g:374:3: ( ( rule__Narrative__Group__0 )* )
            // InternalCucumber.g:375:4: ( rule__Narrative__Group__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNarrativeAccess().getGroup()); 
            }
            // InternalCucumber.g:376:4: ( rule__Narrative__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_WORD && LA1_0<=RULE_PLACEHOLDER)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCucumber.g:376:5: rule__Narrative__Group__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Narrative__Group__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNarrativeAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleNarrative"


    // $ANTLR start "entryRuleStepDescription"
    // InternalCucumber.g:386:1: entryRuleStepDescription : ruleStepDescription EOF ;
    public final void entryRuleStepDescription() throws RecognitionException {
        try {
            // InternalCucumber.g:387:1: ( ruleStepDescription EOF )
            // InternalCucumber.g:388:1: ruleStepDescription EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepDescriptionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStepDescription();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepDescriptionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStepDescription"


    // $ANTLR start "ruleStepDescription"
    // InternalCucumber.g:395:1: ruleStepDescription : ( ( ( rule__StepDescription__Alternatives ) ) ( ( rule__StepDescription__Alternatives )* ) ) ;
    public final void ruleStepDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:399:2: ( ( ( ( rule__StepDescription__Alternatives ) ) ( ( rule__StepDescription__Alternatives )* ) ) )
            // InternalCucumber.g:400:2: ( ( ( rule__StepDescription__Alternatives ) ) ( ( rule__StepDescription__Alternatives )* ) )
            {
            // InternalCucumber.g:400:2: ( ( ( rule__StepDescription__Alternatives ) ) ( ( rule__StepDescription__Alternatives )* ) )
            // InternalCucumber.g:401:3: ( ( rule__StepDescription__Alternatives ) ) ( ( rule__StepDescription__Alternatives )* )
            {
            // InternalCucumber.g:401:3: ( ( rule__StepDescription__Alternatives ) )
            // InternalCucumber.g:402:4: ( rule__StepDescription__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepDescriptionAccess().getAlternatives()); 
            }
            // InternalCucumber.g:403:4: ( rule__StepDescription__Alternatives )
            // InternalCucumber.g:403:5: rule__StepDescription__Alternatives
            {
            pushFollow(FOLLOW_4);
            rule__StepDescription__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepDescriptionAccess().getAlternatives()); 
            }

            }

            // InternalCucumber.g:406:3: ( ( rule__StepDescription__Alternatives )* )
            // InternalCucumber.g:407:4: ( rule__StepDescription__Alternatives )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepDescriptionAccess().getAlternatives()); 
            }
            // InternalCucumber.g:408:4: ( rule__StepDescription__Alternatives )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // InternalCucumber.g:408:5: rule__StepDescription__Alternatives
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__StepDescription__Alternatives();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepDescriptionAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleStepDescription"


    // $ANTLR start "entryRuleTag"
    // InternalCucumber.g:418:1: entryRuleTag : ruleTag EOF ;
    public final void entryRuleTag() throws RecognitionException {
        try {
            // InternalCucumber.g:419:1: ( ruleTag EOF )
            // InternalCucumber.g:420:1: ruleTag EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTag();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalCucumber.g:427:1: ruleTag : ( ( rule__Tag__Group__0 ) ) ;
    public final void ruleTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:431:2: ( ( ( rule__Tag__Group__0 ) ) )
            // InternalCucumber.g:432:2: ( ( rule__Tag__Group__0 ) )
            {
            // InternalCucumber.g:432:2: ( ( rule__Tag__Group__0 ) )
            // InternalCucumber.g:433:3: ( rule__Tag__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAccess().getGroup()); 
            }
            // InternalCucumber.g:434:3: ( rule__Tag__Group__0 )
            // InternalCucumber.g:434:4: rule__Tag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tag__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAccess().getGroup()); 
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
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleText"
    // InternalCucumber.g:443:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalCucumber.g:444:1: ( ruleText EOF )
            // InternalCucumber.g:445:1: ruleText EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleText();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalCucumber.g:452:1: ruleText : ( ( rule__Text__Group__0 ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:456:2: ( ( ( rule__Text__Group__0 ) ) )
            // InternalCucumber.g:457:2: ( ( rule__Text__Group__0 ) )
            {
            // InternalCucumber.g:457:2: ( ( rule__Text__Group__0 ) )
            // InternalCucumber.g:458:3: ( rule__Text__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAccess().getGroup()); 
            }
            // InternalCucumber.g:459:3: ( rule__Text__Group__0 )
            // InternalCucumber.g:459:4: rule__Text__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAccess().getGroup()); 
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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleTextLine"
    // InternalCucumber.g:468:1: entryRuleTextLine : ruleTextLine EOF ;
    public final void entryRuleTextLine() throws RecognitionException {
        try {
            // InternalCucumber.g:469:1: ( ruleTextLine EOF )
            // InternalCucumber.g:470:1: ruleTextLine EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextLineRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTextLine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextLineRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTextLine"


    // $ANTLR start "ruleTextLine"
    // InternalCucumber.g:477:1: ruleTextLine : ( ( rule__TextLine__Group__0 ) ) ;
    public final void ruleTextLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:481:2: ( ( ( rule__TextLine__Group__0 ) ) )
            // InternalCucumber.g:482:2: ( ( rule__TextLine__Group__0 ) )
            {
            // InternalCucumber.g:482:2: ( ( rule__TextLine__Group__0 ) )
            // InternalCucumber.g:483:3: ( rule__TextLine__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextLineAccess().getGroup()); 
            }
            // InternalCucumber.g:484:3: ( rule__TextLine__Group__0 )
            // InternalCucumber.g:484:4: rule__TextLine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TextLine__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextLineAccess().getGroup()); 
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
    // $ANTLR end "ruleTextLine"


    // $ANTLR start "entryRuleTEXT_VALUE"
    // InternalCucumber.g:493:1: entryRuleTEXT_VALUE : ruleTEXT_VALUE EOF ;
    public final void entryRuleTEXT_VALUE() throws RecognitionException {
        try {
            // InternalCucumber.g:494:1: ( ruleTEXT_VALUE EOF )
            // InternalCucumber.g:495:1: ruleTEXT_VALUE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTEXT_VALUERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTEXT_VALUE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTEXT_VALUERule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTEXT_VALUE"


    // $ANTLR start "ruleTEXT_VALUE"
    // InternalCucumber.g:502:1: ruleTEXT_VALUE : ( ( rule__TEXT_VALUE__Group__0 ) ) ;
    public final void ruleTEXT_VALUE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:506:2: ( ( ( rule__TEXT_VALUE__Group__0 ) ) )
            // InternalCucumber.g:507:2: ( ( rule__TEXT_VALUE__Group__0 ) )
            {
            // InternalCucumber.g:507:2: ( ( rule__TEXT_VALUE__Group__0 ) )
            // InternalCucumber.g:508:3: ( rule__TEXT_VALUE__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTEXT_VALUEAccess().getGroup()); 
            }
            // InternalCucumber.g:509:3: ( rule__TEXT_VALUE__Group__0 )
            // InternalCucumber.g:509:4: rule__TEXT_VALUE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TEXT_VALUE__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTEXT_VALUEAccess().getGroup()); 
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
    // $ANTLR end "ruleTEXT_VALUE"


    // $ANTLR start "entryRuleTEXT_LITERAL"
    // InternalCucumber.g:518:1: entryRuleTEXT_LITERAL : ruleTEXT_LITERAL EOF ;
    public final void entryRuleTEXT_LITERAL() throws RecognitionException {
        try {
            // InternalCucumber.g:519:1: ( ruleTEXT_LITERAL EOF )
            // InternalCucumber.g:520:1: ruleTEXT_LITERAL EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTEXT_LITERALRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTEXT_LITERAL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTEXT_LITERALRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalCucumber.g:527:1: ruleTEXT_LITERAL : ( ( rule__TEXT_LITERAL__Alternatives ) ) ;
    public final void ruleTEXT_LITERAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:531:2: ( ( ( rule__TEXT_LITERAL__Alternatives ) ) )
            // InternalCucumber.g:532:2: ( ( rule__TEXT_LITERAL__Alternatives ) )
            {
            // InternalCucumber.g:532:2: ( ( rule__TEXT_LITERAL__Alternatives ) )
            // InternalCucumber.g:533:3: ( rule__TEXT_LITERAL__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTEXT_LITERALAccess().getAlternatives()); 
            }
            // InternalCucumber.g:534:3: ( rule__TEXT_LITERAL__Alternatives )
            // InternalCucumber.g:534:4: rule__TEXT_LITERAL__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TEXT_LITERAL__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTEXT_LITERALAccess().getAlternatives()); 
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
    // $ANTLR end "ruleTEXT_LITERAL"


    // $ANTLR start "rule__AbstractScenario__Alternatives"
    // InternalCucumber.g:542:1: rule__AbstractScenario__Alternatives : ( ( ruleScenario ) | ( ruleScenarioOutline ) | ( ruleBackground ) );
    public final void rule__AbstractScenario__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:546:1: ( ( ruleScenario ) | ( ruleScenarioOutline ) | ( ruleBackground ) )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalCucumber.g:547:2: ( ruleScenario )
                    {
                    // InternalCucumber.g:547:2: ( ruleScenario )
                    // InternalCucumber.g:548:3: ruleScenario
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractScenarioAccess().getScenarioParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleScenario();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractScenarioAccess().getScenarioParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:553:2: ( ruleScenarioOutline )
                    {
                    // InternalCucumber.g:553:2: ( ruleScenarioOutline )
                    // InternalCucumber.g:554:3: ruleScenarioOutline
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractScenarioAccess().getScenarioOutlineParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleScenarioOutline();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractScenarioAccess().getScenarioOutlineParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCucumber.g:559:2: ( ruleBackground )
                    {
                    // InternalCucumber.g:559:2: ( ruleBackground )
                    // InternalCucumber.g:560:3: ruleBackground
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractScenarioAccess().getBackgroundParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBackground();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractScenarioAccess().getBackgroundParserRuleCall_2()); 
                    }

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


    // $ANTLR start "rule__Step__Alternatives_3"
    // InternalCucumber.g:569:1: rule__Step__Alternatives_3 : ( ( ( rule__Step__TableAssignment_3_0 ) ) | ( ( rule__Step__CodeAssignment_3_1 ) ) );
    public final void rule__Step__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:573:1: ( ( ( rule__Step__TableAssignment_3_0 ) ) | ( ( rule__Step__CodeAssignment_3_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_TABLE_CELL) ) {
                alt4=1;
            }
            else if ( (LA4_0==29) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCucumber.g:574:2: ( ( rule__Step__TableAssignment_3_0 ) )
                    {
                    // InternalCucumber.g:574:2: ( ( rule__Step__TableAssignment_3_0 ) )
                    // InternalCucumber.g:575:3: ( rule__Step__TableAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStepAccess().getTableAssignment_3_0()); 
                    }
                    // InternalCucumber.g:576:3: ( rule__Step__TableAssignment_3_0 )
                    // InternalCucumber.g:576:4: rule__Step__TableAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Step__TableAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStepAccess().getTableAssignment_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:580:2: ( ( rule__Step__CodeAssignment_3_1 ) )
                    {
                    // InternalCucumber.g:580:2: ( ( rule__Step__CodeAssignment_3_1 ) )
                    // InternalCucumber.g:581:3: ( rule__Step__CodeAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStepAccess().getCodeAssignment_3_1()); 
                    }
                    // InternalCucumber.g:582:3: ( rule__Step__CodeAssignment_3_1 )
                    // InternalCucumber.g:582:4: rule__Step__CodeAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Step__CodeAssignment_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStepAccess().getCodeAssignment_3_1()); 
                    }

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


    // $ANTLR start "rule__Title__Alternatives_0"
    // InternalCucumber.g:590:1: rule__Title__Alternatives_0 : ( ( RULE_WORD ) | ( RULE_INT ) | ( RULE_STRING ) | ( RULE_PLACEHOLDER ) );
    public final void rule__Title__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:594:1: ( ( RULE_WORD ) | ( RULE_INT ) | ( RULE_STRING ) | ( RULE_PLACEHOLDER ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                alt5=1;
                }
                break;
            case RULE_INT:
                {
                alt5=2;
                }
                break;
            case RULE_STRING:
                {
                alt5=3;
                }
                break;
            case RULE_PLACEHOLDER:
                {
                alt5=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalCucumber.g:595:2: ( RULE_WORD )
                    {
                    // InternalCucumber.g:595:2: ( RULE_WORD )
                    // InternalCucumber.g:596:3: RULE_WORD
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTitleAccess().getWORDTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_WORD,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTitleAccess().getWORDTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:601:2: ( RULE_INT )
                    {
                    // InternalCucumber.g:601:2: ( RULE_INT )
                    // InternalCucumber.g:602:3: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTitleAccess().getINTTerminalRuleCall_0_1()); 
                    }
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTitleAccess().getINTTerminalRuleCall_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCucumber.g:607:2: ( RULE_STRING )
                    {
                    // InternalCucumber.g:607:2: ( RULE_STRING )
                    // InternalCucumber.g:608:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTitleAccess().getSTRINGTerminalRuleCall_0_2()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTitleAccess().getSTRINGTerminalRuleCall_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCucumber.g:613:2: ( RULE_PLACEHOLDER )
                    {
                    // InternalCucumber.g:613:2: ( RULE_PLACEHOLDER )
                    // InternalCucumber.g:614:3: RULE_PLACEHOLDER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTitleAccess().getPLACEHOLDERTerminalRuleCall_0_3()); 
                    }
                    match(input,RULE_PLACEHOLDER,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTitleAccess().getPLACEHOLDERTerminalRuleCall_0_3()); 
                    }

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
    // $ANTLR end "rule__Title__Alternatives_0"


    // $ANTLR start "rule__Title__Alternatives_1"
    // InternalCucumber.g:623:1: rule__Title__Alternatives_1 : ( ( RULE_WORD ) | ( RULE_INT ) | ( RULE_STRING ) | ( RULE_PLACEHOLDER ) | ( RULE_STEP_KEYWORD ) | ( RULE_TAGNAME ) );
    public final void rule__Title__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:627:1: ( ( RULE_WORD ) | ( RULE_INT ) | ( RULE_STRING ) | ( RULE_PLACEHOLDER ) | ( RULE_STEP_KEYWORD ) | ( RULE_TAGNAME ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
                {
                alt6=2;
                }
                break;
            case RULE_STRING:
                {
                alt6=3;
                }
                break;
            case RULE_PLACEHOLDER:
                {
                alt6=4;
                }
                break;
            case RULE_STEP_KEYWORD:
                {
                alt6=5;
                }
                break;
            case RULE_TAGNAME:
                {
                alt6=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalCucumber.g:628:2: ( RULE_WORD )
                    {
                    // InternalCucumber.g:628:2: ( RULE_WORD )
                    // InternalCucumber.g:629:3: RULE_WORD
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTitleAccess().getWORDTerminalRuleCall_1_0()); 
                    }
                    match(input,RULE_WORD,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTitleAccess().getWORDTerminalRuleCall_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:634:2: ( RULE_INT )
                    {
                    // InternalCucumber.g:634:2: ( RULE_INT )
                    // InternalCucumber.g:635:3: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTitleAccess().getINTTerminalRuleCall_1_1()); 
                    }
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTitleAccess().getINTTerminalRuleCall_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCucumber.g:640:2: ( RULE_STRING )
                    {
                    // InternalCucumber.g:640:2: ( RULE_STRING )
                    // InternalCucumber.g:641:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTitleAccess().getSTRINGTerminalRuleCall_1_2()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTitleAccess().getSTRINGTerminalRuleCall_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCucumber.g:646:2: ( RULE_PLACEHOLDER )
                    {
                    // InternalCucumber.g:646:2: ( RULE_PLACEHOLDER )
                    // InternalCucumber.g:647:3: RULE_PLACEHOLDER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTitleAccess().getPLACEHOLDERTerminalRuleCall_1_3()); 
                    }
                    match(input,RULE_PLACEHOLDER,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTitleAccess().getPLACEHOLDERTerminalRuleCall_1_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalCucumber.g:652:2: ( RULE_STEP_KEYWORD )
                    {
                    // InternalCucumber.g:652:2: ( RULE_STEP_KEYWORD )
                    // InternalCucumber.g:653:3: RULE_STEP_KEYWORD
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTitleAccess().getSTEP_KEYWORDTerminalRuleCall_1_4()); 
                    }
                    match(input,RULE_STEP_KEYWORD,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTitleAccess().getSTEP_KEYWORDTerminalRuleCall_1_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalCucumber.g:658:2: ( RULE_TAGNAME )
                    {
                    // InternalCucumber.g:658:2: ( RULE_TAGNAME )
                    // InternalCucumber.g:659:3: RULE_TAGNAME
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTitleAccess().getTAGNAMETerminalRuleCall_1_5()); 
                    }
                    match(input,RULE_TAGNAME,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTitleAccess().getTAGNAMETerminalRuleCall_1_5()); 
                    }

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
    // $ANTLR end "rule__Title__Alternatives_1"


    // $ANTLR start "rule__Narrative__Alternatives_0"
    // InternalCucumber.g:668:1: rule__Narrative__Alternatives_0 : ( ( RULE_WORD ) | ( RULE_INT ) | ( RULE_STRING ) | ( RULE_PLACEHOLDER ) );
    public final void rule__Narrative__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:672:1: ( ( RULE_WORD ) | ( RULE_INT ) | ( RULE_STRING ) | ( RULE_PLACEHOLDER ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
                {
                alt7=2;
                }
                break;
            case RULE_STRING:
                {
                alt7=3;
                }
                break;
            case RULE_PLACEHOLDER:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalCucumber.g:673:2: ( RULE_WORD )
                    {
                    // InternalCucumber.g:673:2: ( RULE_WORD )
                    // InternalCucumber.g:674:3: RULE_WORD
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNarrativeAccess().getWORDTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_WORD,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNarrativeAccess().getWORDTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:679:2: ( RULE_INT )
                    {
                    // InternalCucumber.g:679:2: ( RULE_INT )
                    // InternalCucumber.g:680:3: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNarrativeAccess().getINTTerminalRuleCall_0_1()); 
                    }
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNarrativeAccess().getINTTerminalRuleCall_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCucumber.g:685:2: ( RULE_STRING )
                    {
                    // InternalCucumber.g:685:2: ( RULE_STRING )
                    // InternalCucumber.g:686:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNarrativeAccess().getSTRINGTerminalRuleCall_0_2()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNarrativeAccess().getSTRINGTerminalRuleCall_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCucumber.g:691:2: ( RULE_PLACEHOLDER )
                    {
                    // InternalCucumber.g:691:2: ( RULE_PLACEHOLDER )
                    // InternalCucumber.g:692:3: RULE_PLACEHOLDER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNarrativeAccess().getPLACEHOLDERTerminalRuleCall_0_3()); 
                    }
                    match(input,RULE_PLACEHOLDER,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNarrativeAccess().getPLACEHOLDERTerminalRuleCall_0_3()); 
                    }

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
    // $ANTLR end "rule__Narrative__Alternatives_0"


    // $ANTLR start "rule__Narrative__Alternatives_1"
    // InternalCucumber.g:701:1: rule__Narrative__Alternatives_1 : ( ( RULE_WORD ) | ( RULE_INT ) | ( RULE_STRING ) | ( RULE_PLACEHOLDER ) | ( RULE_STEP_KEYWORD ) | ( RULE_TAGNAME ) );
    public final void rule__Narrative__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:705:1: ( ( RULE_WORD ) | ( RULE_INT ) | ( RULE_STRING ) | ( RULE_PLACEHOLDER ) | ( RULE_STEP_KEYWORD ) | ( RULE_TAGNAME ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                alt8=1;
                }
                break;
            case RULE_INT:
                {
                alt8=2;
                }
                break;
            case RULE_STRING:
                {
                alt8=3;
                }
                break;
            case RULE_PLACEHOLDER:
                {
                alt8=4;
                }
                break;
            case RULE_STEP_KEYWORD:
                {
                alt8=5;
                }
                break;
            case RULE_TAGNAME:
                {
                alt8=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalCucumber.g:706:2: ( RULE_WORD )
                    {
                    // InternalCucumber.g:706:2: ( RULE_WORD )
                    // InternalCucumber.g:707:3: RULE_WORD
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNarrativeAccess().getWORDTerminalRuleCall_1_0()); 
                    }
                    match(input,RULE_WORD,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNarrativeAccess().getWORDTerminalRuleCall_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:712:2: ( RULE_INT )
                    {
                    // InternalCucumber.g:712:2: ( RULE_INT )
                    // InternalCucumber.g:713:3: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNarrativeAccess().getINTTerminalRuleCall_1_1()); 
                    }
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNarrativeAccess().getINTTerminalRuleCall_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCucumber.g:718:2: ( RULE_STRING )
                    {
                    // InternalCucumber.g:718:2: ( RULE_STRING )
                    // InternalCucumber.g:719:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNarrativeAccess().getSTRINGTerminalRuleCall_1_2()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNarrativeAccess().getSTRINGTerminalRuleCall_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCucumber.g:724:2: ( RULE_PLACEHOLDER )
                    {
                    // InternalCucumber.g:724:2: ( RULE_PLACEHOLDER )
                    // InternalCucumber.g:725:3: RULE_PLACEHOLDER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNarrativeAccess().getPLACEHOLDERTerminalRuleCall_1_3()); 
                    }
                    match(input,RULE_PLACEHOLDER,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNarrativeAccess().getPLACEHOLDERTerminalRuleCall_1_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalCucumber.g:730:2: ( RULE_STEP_KEYWORD )
                    {
                    // InternalCucumber.g:730:2: ( RULE_STEP_KEYWORD )
                    // InternalCucumber.g:731:3: RULE_STEP_KEYWORD
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNarrativeAccess().getSTEP_KEYWORDTerminalRuleCall_1_4()); 
                    }
                    match(input,RULE_STEP_KEYWORD,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNarrativeAccess().getSTEP_KEYWORDTerminalRuleCall_1_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalCucumber.g:736:2: ( RULE_TAGNAME )
                    {
                    // InternalCucumber.g:736:2: ( RULE_TAGNAME )
                    // InternalCucumber.g:737:3: RULE_TAGNAME
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNarrativeAccess().getTAGNAMETerminalRuleCall_1_5()); 
                    }
                    match(input,RULE_TAGNAME,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNarrativeAccess().getTAGNAMETerminalRuleCall_1_5()); 
                    }

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
    // $ANTLR end "rule__Narrative__Alternatives_1"


    // $ANTLR start "rule__StepDescription__Alternatives"
    // InternalCucumber.g:746:1: rule__StepDescription__Alternatives : ( ( RULE_WORD ) | ( RULE_INT ) | ( RULE_STRING ) | ( RULE_PLACEHOLDER ) | ( RULE_STEP_KEYWORD ) | ( RULE_TAGNAME ) );
    public final void rule__StepDescription__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:750:1: ( ( RULE_WORD ) | ( RULE_INT ) | ( RULE_STRING ) | ( RULE_PLACEHOLDER ) | ( RULE_STEP_KEYWORD ) | ( RULE_TAGNAME ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                alt9=1;
                }
                break;
            case RULE_INT:
                {
                alt9=2;
                }
                break;
            case RULE_STRING:
                {
                alt9=3;
                }
                break;
            case RULE_PLACEHOLDER:
                {
                alt9=4;
                }
                break;
            case RULE_STEP_KEYWORD:
                {
                alt9=5;
                }
                break;
            case RULE_TAGNAME:
                {
                alt9=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalCucumber.g:751:2: ( RULE_WORD )
                    {
                    // InternalCucumber.g:751:2: ( RULE_WORD )
                    // InternalCucumber.g:752:3: RULE_WORD
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStepDescriptionAccess().getWORDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_WORD,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStepDescriptionAccess().getWORDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:757:2: ( RULE_INT )
                    {
                    // InternalCucumber.g:757:2: ( RULE_INT )
                    // InternalCucumber.g:758:3: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStepDescriptionAccess().getINTTerminalRuleCall_1()); 
                    }
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStepDescriptionAccess().getINTTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCucumber.g:763:2: ( RULE_STRING )
                    {
                    // InternalCucumber.g:763:2: ( RULE_STRING )
                    // InternalCucumber.g:764:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStepDescriptionAccess().getSTRINGTerminalRuleCall_2()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStepDescriptionAccess().getSTRINGTerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCucumber.g:769:2: ( RULE_PLACEHOLDER )
                    {
                    // InternalCucumber.g:769:2: ( RULE_PLACEHOLDER )
                    // InternalCucumber.g:770:3: RULE_PLACEHOLDER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStepDescriptionAccess().getPLACEHOLDERTerminalRuleCall_3()); 
                    }
                    match(input,RULE_PLACEHOLDER,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStepDescriptionAccess().getPLACEHOLDERTerminalRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalCucumber.g:775:2: ( RULE_STEP_KEYWORD )
                    {
                    // InternalCucumber.g:775:2: ( RULE_STEP_KEYWORD )
                    // InternalCucumber.g:776:3: RULE_STEP_KEYWORD
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStepDescriptionAccess().getSTEP_KEYWORDTerminalRuleCall_4()); 
                    }
                    match(input,RULE_STEP_KEYWORD,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStepDescriptionAccess().getSTEP_KEYWORDTerminalRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalCucumber.g:781:2: ( RULE_TAGNAME )
                    {
                    // InternalCucumber.g:781:2: ( RULE_TAGNAME )
                    // InternalCucumber.g:782:3: RULE_TAGNAME
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStepDescriptionAccess().getTAGNAMETerminalRuleCall_5()); 
                    }
                    match(input,RULE_TAGNAME,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStepDescriptionAccess().getTAGNAMETerminalRuleCall_5()); 
                    }

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
    // $ANTLR end "rule__StepDescription__Alternatives"


    // $ANTLR start "rule__TEXT_LITERAL__Alternatives"
    // InternalCucumber.g:791:1: rule__TEXT_LITERAL__Alternatives : ( ( RULE_WORD ) | ( RULE_INT ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) );
    public final void rule__TEXT_LITERAL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:795:1: ( ( RULE_WORD ) | ( RULE_INT ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                alt10=1;
                }
                break;
            case RULE_INT:
                {
                alt10=2;
                }
                break;
            case RULE_STRING:
                {
                alt10=3;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt10=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalCucumber.g:796:2: ( RULE_WORD )
                    {
                    // InternalCucumber.g:796:2: ( RULE_WORD )
                    // InternalCucumber.g:797:3: RULE_WORD
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTEXT_LITERALAccess().getWORDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_WORD,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTEXT_LITERALAccess().getWORDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:802:2: ( RULE_INT )
                    {
                    // InternalCucumber.g:802:2: ( RULE_INT )
                    // InternalCucumber.g:803:3: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTEXT_LITERALAccess().getINTTerminalRuleCall_1()); 
                    }
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTEXT_LITERALAccess().getINTTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCucumber.g:808:2: ( RULE_STRING )
                    {
                    // InternalCucumber.g:808:2: ( RULE_STRING )
                    // InternalCucumber.g:809:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTEXT_LITERALAccess().getSTRINGTerminalRuleCall_2()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTEXT_LITERALAccess().getSTRINGTerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCucumber.g:814:2: ( RULE_ANY_OTHER )
                    {
                    // InternalCucumber.g:814:2: ( RULE_ANY_OTHER )
                    // InternalCucumber.g:815:3: RULE_ANY_OTHER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTEXT_LITERALAccess().getANY_OTHERTerminalRuleCall_3()); 
                    }
                    match(input,RULE_ANY_OTHER,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTEXT_LITERALAccess().getANY_OTHERTerminalRuleCall_3()); 
                    }

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
    // InternalCucumber.g:824:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:828:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalCucumber.g:829:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Feature__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Feature__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:836:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__TagsAssignment_0 )* ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:840:1: ( ( ( rule__Feature__TagsAssignment_0 )* ) )
            // InternalCucumber.g:841:1: ( ( rule__Feature__TagsAssignment_0 )* )
            {
            // InternalCucumber.g:841:1: ( ( rule__Feature__TagsAssignment_0 )* )
            // InternalCucumber.g:842:2: ( rule__Feature__TagsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getTagsAssignment_0()); 
            }
            // InternalCucumber.g:843:2: ( rule__Feature__TagsAssignment_0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_TAGNAME) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCucumber.g:843:3: rule__Feature__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Feature__TagsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getTagsAssignment_0()); 
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
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // InternalCucumber.g:851:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:855:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalCucumber.g:856:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Feature__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Feature__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:863:1: rule__Feature__Group__1__Impl : ( 'Feature:' ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:867:1: ( ( 'Feature:' ) )
            // InternalCucumber.g:868:1: ( 'Feature:' )
            {
            // InternalCucumber.g:868:1: ( 'Feature:' )
            // InternalCucumber.g:869:2: 'Feature:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getFeatureKeyword_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getFeatureKeyword_1()); 
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
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // InternalCucumber.g:878:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:882:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalCucumber.g:883:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Feature__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Feature__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:890:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__TitleAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:894:1: ( ( ( rule__Feature__TitleAssignment_2 ) ) )
            // InternalCucumber.g:895:1: ( ( rule__Feature__TitleAssignment_2 ) )
            {
            // InternalCucumber.g:895:1: ( ( rule__Feature__TitleAssignment_2 ) )
            // InternalCucumber.g:896:2: ( rule__Feature__TitleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getTitleAssignment_2()); 
            }
            // InternalCucumber.g:897:2: ( rule__Feature__TitleAssignment_2 )
            // InternalCucumber.g:897:3: rule__Feature__TitleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Feature__TitleAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getTitleAssignment_2()); 
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
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group__3"
    // InternalCucumber.g:905:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:909:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalCucumber.g:910:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Feature__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Feature__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:917:1: rule__Feature__Group__3__Impl : ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:921:1: ( ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) ) )
            // InternalCucumber.g:922:1: ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) )
            {
            // InternalCucumber.g:922:1: ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) )
            // InternalCucumber.g:923:2: ( ( RULE_EOL ) ) ( ( RULE_EOL )* )
            {
            // InternalCucumber.g:923:2: ( ( RULE_EOL ) )
            // InternalCucumber.g:924:3: ( RULE_EOL )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_3()); 
            }
            // InternalCucumber.g:925:3: ( RULE_EOL )
            // InternalCucumber.g:925:4: RULE_EOL
            {
            match(input,RULE_EOL,FOLLOW_10); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_3()); 
            }

            }

            // InternalCucumber.g:928:2: ( ( RULE_EOL )* )
            // InternalCucumber.g:929:3: ( RULE_EOL )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_3()); 
            }
            // InternalCucumber.g:930:3: ( RULE_EOL )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_EOL) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCucumber.g:930:4: RULE_EOL
            	    {
            	    match(input,RULE_EOL,FOLLOW_10); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_3()); 
            }

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
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__Feature__Group__4"
    // InternalCucumber.g:939:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl rule__Feature__Group__5 ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:943:1: ( rule__Feature__Group__4__Impl rule__Feature__Group__5 )
            // InternalCucumber.g:944:2: rule__Feature__Group__4__Impl rule__Feature__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Feature__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Feature__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:951:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__NarrativeAssignment_4 )? ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:955:1: ( ( ( rule__Feature__NarrativeAssignment_4 )? ) )
            // InternalCucumber.g:956:1: ( ( rule__Feature__NarrativeAssignment_4 )? )
            {
            // InternalCucumber.g:956:1: ( ( rule__Feature__NarrativeAssignment_4 )? )
            // InternalCucumber.g:957:2: ( rule__Feature__NarrativeAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getNarrativeAssignment_4()); 
            }
            // InternalCucumber.g:958:2: ( rule__Feature__NarrativeAssignment_4 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_WORD && LA13_0<=RULE_PLACEHOLDER)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCucumber.g:958:3: rule__Feature__NarrativeAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__NarrativeAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getNarrativeAssignment_4()); 
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
    // $ANTLR end "rule__Feature__Group__4__Impl"


    // $ANTLR start "rule__Feature__Group__5"
    // InternalCucumber.g:966:1: rule__Feature__Group__5 : rule__Feature__Group__5__Impl rule__Feature__Group__6 ;
    public final void rule__Feature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:970:1: ( rule__Feature__Group__5__Impl rule__Feature__Group__6 )
            // InternalCucumber.g:971:2: rule__Feature__Group__5__Impl rule__Feature__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Feature__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Feature__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:978:1: rule__Feature__Group__5__Impl : ( ( rule__Feature__BackgroundAssignment_5 )? ) ;
    public final void rule__Feature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:982:1: ( ( ( rule__Feature__BackgroundAssignment_5 )? ) )
            // InternalCucumber.g:983:1: ( ( rule__Feature__BackgroundAssignment_5 )? )
            {
            // InternalCucumber.g:983:1: ( ( rule__Feature__BackgroundAssignment_5 )? )
            // InternalCucumber.g:984:2: ( rule__Feature__BackgroundAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getBackgroundAssignment_5()); 
            }
            // InternalCucumber.g:985:2: ( rule__Feature__BackgroundAssignment_5 )?
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalCucumber.g:985:3: rule__Feature__BackgroundAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__BackgroundAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getBackgroundAssignment_5()); 
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
    // $ANTLR end "rule__Feature__Group__5__Impl"


    // $ANTLR start "rule__Feature__Group__6"
    // InternalCucumber.g:993:1: rule__Feature__Group__6 : rule__Feature__Group__6__Impl ;
    public final void rule__Feature__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:997:1: ( rule__Feature__Group__6__Impl )
            // InternalCucumber.g:998:2: rule__Feature__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1004:1: rule__Feature__Group__6__Impl : ( ( ( rule__Feature__ScenariosAssignment_6 ) ) ( ( rule__Feature__ScenariosAssignment_6 )* ) ) ;
    public final void rule__Feature__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1008:1: ( ( ( ( rule__Feature__ScenariosAssignment_6 ) ) ( ( rule__Feature__ScenariosAssignment_6 )* ) ) )
            // InternalCucumber.g:1009:1: ( ( ( rule__Feature__ScenariosAssignment_6 ) ) ( ( rule__Feature__ScenariosAssignment_6 )* ) )
            {
            // InternalCucumber.g:1009:1: ( ( ( rule__Feature__ScenariosAssignment_6 ) ) ( ( rule__Feature__ScenariosAssignment_6 )* ) )
            // InternalCucumber.g:1010:2: ( ( rule__Feature__ScenariosAssignment_6 ) ) ( ( rule__Feature__ScenariosAssignment_6 )* )
            {
            // InternalCucumber.g:1010:2: ( ( rule__Feature__ScenariosAssignment_6 ) )
            // InternalCucumber.g:1011:3: ( rule__Feature__ScenariosAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getScenariosAssignment_6()); 
            }
            // InternalCucumber.g:1012:3: ( rule__Feature__ScenariosAssignment_6 )
            // InternalCucumber.g:1012:4: rule__Feature__ScenariosAssignment_6
            {
            pushFollow(FOLLOW_11);
            rule__Feature__ScenariosAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getScenariosAssignment_6()); 
            }

            }

            // InternalCucumber.g:1015:2: ( ( rule__Feature__ScenariosAssignment_6 )* )
            // InternalCucumber.g:1016:3: ( rule__Feature__ScenariosAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getScenariosAssignment_6()); 
            }
            // InternalCucumber.g:1017:3: ( rule__Feature__ScenariosAssignment_6 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_TAGNAME||(LA15_0>=23 && LA15_0<=25)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCucumber.g:1017:4: rule__Feature__ScenariosAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Feature__ScenariosAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getScenariosAssignment_6()); 
            }

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
    // $ANTLR end "rule__Feature__Group__6__Impl"


    // $ANTLR start "rule__Background__Group__0"
    // InternalCucumber.g:1027:1: rule__Background__Group__0 : rule__Background__Group__0__Impl rule__Background__Group__1 ;
    public final void rule__Background__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1031:1: ( rule__Background__Group__0__Impl rule__Background__Group__1 )
            // InternalCucumber.g:1032:2: rule__Background__Group__0__Impl rule__Background__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Background__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Background__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1039:1: rule__Background__Group__0__Impl : ( ( rule__Background__TagsAssignment_0 )* ) ;
    public final void rule__Background__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1043:1: ( ( ( rule__Background__TagsAssignment_0 )* ) )
            // InternalCucumber.g:1044:1: ( ( rule__Background__TagsAssignment_0 )* )
            {
            // InternalCucumber.g:1044:1: ( ( rule__Background__TagsAssignment_0 )* )
            // InternalCucumber.g:1045:2: ( rule__Background__TagsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBackgroundAccess().getTagsAssignment_0()); 
            }
            // InternalCucumber.g:1046:2: ( rule__Background__TagsAssignment_0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_TAGNAME) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCucumber.g:1046:3: rule__Background__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Background__TagsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBackgroundAccess().getTagsAssignment_0()); 
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
    // $ANTLR end "rule__Background__Group__0__Impl"


    // $ANTLR start "rule__Background__Group__1"
    // InternalCucumber.g:1054:1: rule__Background__Group__1 : rule__Background__Group__1__Impl rule__Background__Group__2 ;
    public final void rule__Background__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1058:1: ( rule__Background__Group__1__Impl rule__Background__Group__2 )
            // InternalCucumber.g:1059:2: rule__Background__Group__1__Impl rule__Background__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Background__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Background__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1066:1: rule__Background__Group__1__Impl : ( 'Background:' ) ;
    public final void rule__Background__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1070:1: ( ( 'Background:' ) )
            // InternalCucumber.g:1071:1: ( 'Background:' )
            {
            // InternalCucumber.g:1071:1: ( 'Background:' )
            // InternalCucumber.g:1072:2: 'Background:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBackgroundAccess().getBackgroundKeyword_1()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBackgroundAccess().getBackgroundKeyword_1()); 
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
    // $ANTLR end "rule__Background__Group__1__Impl"


    // $ANTLR start "rule__Background__Group__2"
    // InternalCucumber.g:1081:1: rule__Background__Group__2 : rule__Background__Group__2__Impl rule__Background__Group__3 ;
    public final void rule__Background__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1085:1: ( rule__Background__Group__2__Impl rule__Background__Group__3 )
            // InternalCucumber.g:1086:2: rule__Background__Group__2__Impl rule__Background__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Background__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Background__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1093:1: rule__Background__Group__2__Impl : ( ( rule__Background__TitleAssignment_2 )? ) ;
    public final void rule__Background__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1097:1: ( ( ( rule__Background__TitleAssignment_2 )? ) )
            // InternalCucumber.g:1098:1: ( ( rule__Background__TitleAssignment_2 )? )
            {
            // InternalCucumber.g:1098:1: ( ( rule__Background__TitleAssignment_2 )? )
            // InternalCucumber.g:1099:2: ( rule__Background__TitleAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBackgroundAccess().getTitleAssignment_2()); 
            }
            // InternalCucumber.g:1100:2: ( rule__Background__TitleAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_WORD && LA17_0<=RULE_PLACEHOLDER)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCucumber.g:1100:3: rule__Background__TitleAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Background__TitleAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBackgroundAccess().getTitleAssignment_2()); 
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
    // $ANTLR end "rule__Background__Group__2__Impl"


    // $ANTLR start "rule__Background__Group__3"
    // InternalCucumber.g:1108:1: rule__Background__Group__3 : rule__Background__Group__3__Impl rule__Background__Group__4 ;
    public final void rule__Background__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1112:1: ( rule__Background__Group__3__Impl rule__Background__Group__4 )
            // InternalCucumber.g:1113:2: rule__Background__Group__3__Impl rule__Background__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Background__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Background__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1120:1: rule__Background__Group__3__Impl : ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) ) ;
    public final void rule__Background__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1124:1: ( ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) ) )
            // InternalCucumber.g:1125:1: ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) )
            {
            // InternalCucumber.g:1125:1: ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) )
            // InternalCucumber.g:1126:2: ( ( RULE_EOL ) ) ( ( RULE_EOL )* )
            {
            // InternalCucumber.g:1126:2: ( ( RULE_EOL ) )
            // InternalCucumber.g:1127:3: ( RULE_EOL )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBackgroundAccess().getEOLTerminalRuleCall_3()); 
            }
            // InternalCucumber.g:1128:3: ( RULE_EOL )
            // InternalCucumber.g:1128:4: RULE_EOL
            {
            match(input,RULE_EOL,FOLLOW_10); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBackgroundAccess().getEOLTerminalRuleCall_3()); 
            }

            }

            // InternalCucumber.g:1131:2: ( ( RULE_EOL )* )
            // InternalCucumber.g:1132:3: ( RULE_EOL )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBackgroundAccess().getEOLTerminalRuleCall_3()); 
            }
            // InternalCucumber.g:1133:3: ( RULE_EOL )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_EOL) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCucumber.g:1133:4: RULE_EOL
            	    {
            	    match(input,RULE_EOL,FOLLOW_10); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBackgroundAccess().getEOLTerminalRuleCall_3()); 
            }

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
    // $ANTLR end "rule__Background__Group__3__Impl"


    // $ANTLR start "rule__Background__Group__4"
    // InternalCucumber.g:1142:1: rule__Background__Group__4 : rule__Background__Group__4__Impl rule__Background__Group__5 ;
    public final void rule__Background__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1146:1: ( rule__Background__Group__4__Impl rule__Background__Group__5 )
            // InternalCucumber.g:1147:2: rule__Background__Group__4__Impl rule__Background__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Background__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Background__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1154:1: rule__Background__Group__4__Impl : ( ( rule__Background__NarrativeAssignment_4 )? ) ;
    public final void rule__Background__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1158:1: ( ( ( rule__Background__NarrativeAssignment_4 )? ) )
            // InternalCucumber.g:1159:1: ( ( rule__Background__NarrativeAssignment_4 )? )
            {
            // InternalCucumber.g:1159:1: ( ( rule__Background__NarrativeAssignment_4 )? )
            // InternalCucumber.g:1160:2: ( rule__Background__NarrativeAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBackgroundAccess().getNarrativeAssignment_4()); 
            }
            // InternalCucumber.g:1161:2: ( rule__Background__NarrativeAssignment_4 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_WORD && LA19_0<=RULE_PLACEHOLDER)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCucumber.g:1161:3: rule__Background__NarrativeAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Background__NarrativeAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBackgroundAccess().getNarrativeAssignment_4()); 
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
    // $ANTLR end "rule__Background__Group__4__Impl"


    // $ANTLR start "rule__Background__Group__5"
    // InternalCucumber.g:1169:1: rule__Background__Group__5 : rule__Background__Group__5__Impl ;
    public final void rule__Background__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1173:1: ( rule__Background__Group__5__Impl )
            // InternalCucumber.g:1174:2: rule__Background__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Background__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1180:1: rule__Background__Group__5__Impl : ( ( ( rule__Background__StepsAssignment_5 ) ) ( ( rule__Background__StepsAssignment_5 )* ) ) ;
    public final void rule__Background__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1184:1: ( ( ( ( rule__Background__StepsAssignment_5 ) ) ( ( rule__Background__StepsAssignment_5 )* ) ) )
            // InternalCucumber.g:1185:1: ( ( ( rule__Background__StepsAssignment_5 ) ) ( ( rule__Background__StepsAssignment_5 )* ) )
            {
            // InternalCucumber.g:1185:1: ( ( ( rule__Background__StepsAssignment_5 ) ) ( ( rule__Background__StepsAssignment_5 )* ) )
            // InternalCucumber.g:1186:2: ( ( rule__Background__StepsAssignment_5 ) ) ( ( rule__Background__StepsAssignment_5 )* )
            {
            // InternalCucumber.g:1186:2: ( ( rule__Background__StepsAssignment_5 ) )
            // InternalCucumber.g:1187:3: ( rule__Background__StepsAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBackgroundAccess().getStepsAssignment_5()); 
            }
            // InternalCucumber.g:1188:3: ( rule__Background__StepsAssignment_5 )
            // InternalCucumber.g:1188:4: rule__Background__StepsAssignment_5
            {
            pushFollow(FOLLOW_15);
            rule__Background__StepsAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBackgroundAccess().getStepsAssignment_5()); 
            }

            }

            // InternalCucumber.g:1191:2: ( ( rule__Background__StepsAssignment_5 )* )
            // InternalCucumber.g:1192:3: ( rule__Background__StepsAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBackgroundAccess().getStepsAssignment_5()); 
            }
            // InternalCucumber.g:1193:3: ( rule__Background__StepsAssignment_5 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_STEP_KEYWORD) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCucumber.g:1193:4: rule__Background__StepsAssignment_5
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Background__StepsAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBackgroundAccess().getStepsAssignment_5()); 
            }

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
    // $ANTLR end "rule__Background__Group__5__Impl"


    // $ANTLR start "rule__Scenario__Group__0"
    // InternalCucumber.g:1203:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1207:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalCucumber.g:1208:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Scenario__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scenario__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1215:1: rule__Scenario__Group__0__Impl : ( ( rule__Scenario__TagsAssignment_0 )* ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1219:1: ( ( ( rule__Scenario__TagsAssignment_0 )* ) )
            // InternalCucumber.g:1220:1: ( ( rule__Scenario__TagsAssignment_0 )* )
            {
            // InternalCucumber.g:1220:1: ( ( rule__Scenario__TagsAssignment_0 )* )
            // InternalCucumber.g:1221:2: ( rule__Scenario__TagsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScenarioAccess().getTagsAssignment_0()); 
            }
            // InternalCucumber.g:1222:2: ( rule__Scenario__TagsAssignment_0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_TAGNAME) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCucumber.g:1222:3: rule__Scenario__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Scenario__TagsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScenarioAccess().getTagsAssignment_0()); 
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
    // $ANTLR end "rule__Scenario__Group__0__Impl"


    // $ANTLR start "rule__Scenario__Group__1"
    // InternalCucumber.g:1230:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1234:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalCucumber.g:1235:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Scenario__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scenario__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1242:1: rule__Scenario__Group__1__Impl : ( 'Scenario:' ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1246:1: ( ( 'Scenario:' ) )
            // InternalCucumber.g:1247:1: ( 'Scenario:' )
            {
            // InternalCucumber.g:1247:1: ( 'Scenario:' )
            // InternalCucumber.g:1248:2: 'Scenario:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScenarioAccess().getScenarioKeyword_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScenarioAccess().getScenarioKeyword_1()); 
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
    // $ANTLR end "rule__Scenario__Group__1__Impl"


    // $ANTLR start "rule__Scenario__Group__2"
    // InternalCucumber.g:1257:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1261:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // InternalCucumber.g:1262:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Scenario__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scenario__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1269:1: rule__Scenario__Group__2__Impl : ( ( rule__Scenario__TitleAssignment_2 )? ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1273:1: ( ( ( rule__Scenario__TitleAssignment_2 )? ) )
            // InternalCucumber.g:1274:1: ( ( rule__Scenario__TitleAssignment_2 )? )
            {
            // InternalCucumber.g:1274:1: ( ( rule__Scenario__TitleAssignment_2 )? )
            // InternalCucumber.g:1275:2: ( rule__Scenario__TitleAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScenarioAccess().getTitleAssignment_2()); 
            }
            // InternalCucumber.g:1276:2: ( rule__Scenario__TitleAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_WORD && LA22_0<=RULE_PLACEHOLDER)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCucumber.g:1276:3: rule__Scenario__TitleAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scenario__TitleAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScenarioAccess().getTitleAssignment_2()); 
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
    // $ANTLR end "rule__Scenario__Group__2__Impl"


    // $ANTLR start "rule__Scenario__Group__3"
    // InternalCucumber.g:1284:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl rule__Scenario__Group__4 ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1288:1: ( rule__Scenario__Group__3__Impl rule__Scenario__Group__4 )
            // InternalCucumber.g:1289:2: rule__Scenario__Group__3__Impl rule__Scenario__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Scenario__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scenario__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1296:1: rule__Scenario__Group__3__Impl : ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1300:1: ( ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) ) )
            // InternalCucumber.g:1301:1: ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) )
            {
            // InternalCucumber.g:1301:1: ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) )
            // InternalCucumber.g:1302:2: ( ( RULE_EOL ) ) ( ( RULE_EOL )* )
            {
            // InternalCucumber.g:1302:2: ( ( RULE_EOL ) )
            // InternalCucumber.g:1303:3: ( RULE_EOL )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_3()); 
            }
            // InternalCucumber.g:1304:3: ( RULE_EOL )
            // InternalCucumber.g:1304:4: RULE_EOL
            {
            match(input,RULE_EOL,FOLLOW_10); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_3()); 
            }

            }

            // InternalCucumber.g:1307:2: ( ( RULE_EOL )* )
            // InternalCucumber.g:1308:3: ( RULE_EOL )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_3()); 
            }
            // InternalCucumber.g:1309:3: ( RULE_EOL )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_EOL) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalCucumber.g:1309:4: RULE_EOL
            	    {
            	    match(input,RULE_EOL,FOLLOW_10); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_3()); 
            }

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
    // $ANTLR end "rule__Scenario__Group__3__Impl"


    // $ANTLR start "rule__Scenario__Group__4"
    // InternalCucumber.g:1318:1: rule__Scenario__Group__4 : rule__Scenario__Group__4__Impl rule__Scenario__Group__5 ;
    public final void rule__Scenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1322:1: ( rule__Scenario__Group__4__Impl rule__Scenario__Group__5 )
            // InternalCucumber.g:1323:2: rule__Scenario__Group__4__Impl rule__Scenario__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Scenario__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scenario__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1330:1: rule__Scenario__Group__4__Impl : ( ( rule__Scenario__NarrativeAssignment_4 )? ) ;
    public final void rule__Scenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1334:1: ( ( ( rule__Scenario__NarrativeAssignment_4 )? ) )
            // InternalCucumber.g:1335:1: ( ( rule__Scenario__NarrativeAssignment_4 )? )
            {
            // InternalCucumber.g:1335:1: ( ( rule__Scenario__NarrativeAssignment_4 )? )
            // InternalCucumber.g:1336:2: ( rule__Scenario__NarrativeAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScenarioAccess().getNarrativeAssignment_4()); 
            }
            // InternalCucumber.g:1337:2: ( rule__Scenario__NarrativeAssignment_4 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_WORD && LA24_0<=RULE_PLACEHOLDER)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCucumber.g:1337:3: rule__Scenario__NarrativeAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scenario__NarrativeAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScenarioAccess().getNarrativeAssignment_4()); 
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
    // $ANTLR end "rule__Scenario__Group__4__Impl"


    // $ANTLR start "rule__Scenario__Group__5"
    // InternalCucumber.g:1345:1: rule__Scenario__Group__5 : rule__Scenario__Group__5__Impl ;
    public final void rule__Scenario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1349:1: ( rule__Scenario__Group__5__Impl )
            // InternalCucumber.g:1350:2: rule__Scenario__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1356:1: rule__Scenario__Group__5__Impl : ( ( ( rule__Scenario__StepsAssignment_5 ) ) ( ( rule__Scenario__StepsAssignment_5 )* ) ) ;
    public final void rule__Scenario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1360:1: ( ( ( ( rule__Scenario__StepsAssignment_5 ) ) ( ( rule__Scenario__StepsAssignment_5 )* ) ) )
            // InternalCucumber.g:1361:1: ( ( ( rule__Scenario__StepsAssignment_5 ) ) ( ( rule__Scenario__StepsAssignment_5 )* ) )
            {
            // InternalCucumber.g:1361:1: ( ( ( rule__Scenario__StepsAssignment_5 ) ) ( ( rule__Scenario__StepsAssignment_5 )* ) )
            // InternalCucumber.g:1362:2: ( ( rule__Scenario__StepsAssignment_5 ) ) ( ( rule__Scenario__StepsAssignment_5 )* )
            {
            // InternalCucumber.g:1362:2: ( ( rule__Scenario__StepsAssignment_5 ) )
            // InternalCucumber.g:1363:3: ( rule__Scenario__StepsAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScenarioAccess().getStepsAssignment_5()); 
            }
            // InternalCucumber.g:1364:3: ( rule__Scenario__StepsAssignment_5 )
            // InternalCucumber.g:1364:4: rule__Scenario__StepsAssignment_5
            {
            pushFollow(FOLLOW_15);
            rule__Scenario__StepsAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScenarioAccess().getStepsAssignment_5()); 
            }

            }

            // InternalCucumber.g:1367:2: ( ( rule__Scenario__StepsAssignment_5 )* )
            // InternalCucumber.g:1368:3: ( rule__Scenario__StepsAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScenarioAccess().getStepsAssignment_5()); 
            }
            // InternalCucumber.g:1369:3: ( rule__Scenario__StepsAssignment_5 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_STEP_KEYWORD) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalCucumber.g:1369:4: rule__Scenario__StepsAssignment_5
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Scenario__StepsAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScenarioAccess().getStepsAssignment_5()); 
            }

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
    // $ANTLR end "rule__Scenario__Group__5__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__0"
    // InternalCucumber.g:1379:1: rule__ScenarioOutline__Group__0 : rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1 ;
    public final void rule__ScenarioOutline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1383:1: ( rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1 )
            // InternalCucumber.g:1384:2: rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__ScenarioOutline__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1391:1: rule__ScenarioOutline__Group__0__Impl : ( ( rule__ScenarioOutline__TagsAssignment_0 )* ) ;
    public final void rule__ScenarioOutline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1395:1: ( ( ( rule__ScenarioOutline__TagsAssignment_0 )* ) )
            // InternalCucumber.g:1396:1: ( ( rule__ScenarioOutline__TagsAssignment_0 )* )
            {
            // InternalCucumber.g:1396:1: ( ( rule__ScenarioOutline__TagsAssignment_0 )* )
            // InternalCucumber.g:1397:2: ( rule__ScenarioOutline__TagsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScenarioOutlineAccess().getTagsAssignment_0()); 
            }
            // InternalCucumber.g:1398:2: ( rule__ScenarioOutline__TagsAssignment_0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_TAGNAME) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalCucumber.g:1398:3: rule__ScenarioOutline__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ScenarioOutline__TagsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScenarioOutlineAccess().getTagsAssignment_0()); 
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
    // $ANTLR end "rule__ScenarioOutline__Group__0__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__1"
    // InternalCucumber.g:1406:1: rule__ScenarioOutline__Group__1 : rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2 ;
    public final void rule__ScenarioOutline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1410:1: ( rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2 )
            // InternalCucumber.g:1411:2: rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ScenarioOutline__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1418:1: rule__ScenarioOutline__Group__1__Impl : ( 'Scenario' ) ;
    public final void rule__ScenarioOutline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1422:1: ( ( 'Scenario' ) )
            // InternalCucumber.g:1423:1: ( 'Scenario' )
            {
            // InternalCucumber.g:1423:1: ( 'Scenario' )
            // InternalCucumber.g:1424:2: 'Scenario'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScenarioOutlineAccess().getScenarioKeyword_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScenarioOutlineAccess().getScenarioKeyword_1()); 
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
    // $ANTLR end "rule__ScenarioOutline__Group__1__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__2"
    // InternalCucumber.g:1433:1: rule__ScenarioOutline__Group__2 : rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3 ;
    public final void rule__ScenarioOutline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1437:1: ( rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3 )
            // InternalCucumber.g:1438:2: rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ScenarioOutline__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1445:1: rule__ScenarioOutline__Group__2__Impl : ( 'Outline:' ) ;
    public final void rule__ScenarioOutline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1449:1: ( ( 'Outline:' ) )
            // InternalCucumber.g:1450:1: ( 'Outline:' )
            {
            // InternalCucumber.g:1450:1: ( 'Outline:' )
            // InternalCucumber.g:1451:2: 'Outline:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScenarioOutlineAccess().getOutlineKeyword_2()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScenarioOutlineAccess().getOutlineKeyword_2()); 
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
    // $ANTLR end "rule__ScenarioOutline__Group__2__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__3"
    // InternalCucumber.g:1460:1: rule__ScenarioOutline__Group__3 : rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4 ;
    public final void rule__ScenarioOutline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1464:1: ( rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4 )
            // InternalCucumber.g:1465:2: rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__ScenarioOutline__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1472:1: rule__ScenarioOutline__Group__3__Impl : ( ( rule__ScenarioOutline__TitleAssignment_3 )? ) ;
    public final void rule__ScenarioOutline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1476:1: ( ( ( rule__ScenarioOutline__TitleAssignment_3 )? ) )
            // InternalCucumber.g:1477:1: ( ( rule__ScenarioOutline__TitleAssignment_3 )? )
            {
            // InternalCucumber.g:1477:1: ( ( rule__ScenarioOutline__TitleAssignment_3 )? )
            // InternalCucumber.g:1478:2: ( rule__ScenarioOutline__TitleAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScenarioOutlineAccess().getTitleAssignment_3()); 
            }
            // InternalCucumber.g:1479:2: ( rule__ScenarioOutline__TitleAssignment_3 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_WORD && LA27_0<=RULE_PLACEHOLDER)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCucumber.g:1479:3: rule__ScenarioOutline__TitleAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScenarioOutline__TitleAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScenarioOutlineAccess().getTitleAssignment_3()); 
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
    // $ANTLR end "rule__ScenarioOutline__Group__3__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__4"
    // InternalCucumber.g:1487:1: rule__ScenarioOutline__Group__4 : rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5 ;
    public final void rule__ScenarioOutline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1491:1: ( rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5 )
            // InternalCucumber.g:1492:2: rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__ScenarioOutline__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1499:1: rule__ScenarioOutline__Group__4__Impl : ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) ) ;
    public final void rule__ScenarioOutline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1503:1: ( ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) ) )
            // InternalCucumber.g:1504:1: ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) )
            {
            // InternalCucumber.g:1504:1: ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) )
            // InternalCucumber.g:1505:2: ( ( RULE_EOL ) ) ( ( RULE_EOL )* )
            {
            // InternalCucumber.g:1505:2: ( ( RULE_EOL ) )
            // InternalCucumber.g:1506:3: ( RULE_EOL )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScenarioOutlineAccess().getEOLTerminalRuleCall_4()); 
            }
            // InternalCucumber.g:1507:3: ( RULE_EOL )
            // InternalCucumber.g:1507:4: RULE_EOL
            {
            match(input,RULE_EOL,FOLLOW_10); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScenarioOutlineAccess().getEOLTerminalRuleCall_4()); 
            }

            }

            // InternalCucumber.g:1510:2: ( ( RULE_EOL )* )
            // InternalCucumber.g:1511:3: ( RULE_EOL )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScenarioOutlineAccess().getEOLTerminalRuleCall_4()); 
            }
            // InternalCucumber.g:1512:3: ( RULE_EOL )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_EOL) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCucumber.g:1512:4: RULE_EOL
            	    {
            	    match(input,RULE_EOL,FOLLOW_10); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScenarioOutlineAccess().getEOLTerminalRuleCall_4()); 
            }

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
    // $ANTLR end "rule__ScenarioOutline__Group__4__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__5"
    // InternalCucumber.g:1521:1: rule__ScenarioOutline__Group__5 : rule__ScenarioOutline__Group__5__Impl rule__ScenarioOutline__Group__6 ;
    public final void rule__ScenarioOutline__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1525:1: ( rule__ScenarioOutline__Group__5__Impl rule__ScenarioOutline__Group__6 )
            // InternalCucumber.g:1526:2: rule__ScenarioOutline__Group__5__Impl rule__ScenarioOutline__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__ScenarioOutline__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1533:1: rule__ScenarioOutline__Group__5__Impl : ( ( rule__ScenarioOutline__NarrativeAssignment_5 )? ) ;
    public final void rule__ScenarioOutline__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1537:1: ( ( ( rule__ScenarioOutline__NarrativeAssignment_5 )? ) )
            // InternalCucumber.g:1538:1: ( ( rule__ScenarioOutline__NarrativeAssignment_5 )? )
            {
            // InternalCucumber.g:1538:1: ( ( rule__ScenarioOutline__NarrativeAssignment_5 )? )
            // InternalCucumber.g:1539:2: ( rule__ScenarioOutline__NarrativeAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScenarioOutlineAccess().getNarrativeAssignment_5()); 
            }
            // InternalCucumber.g:1540:2: ( rule__ScenarioOutline__NarrativeAssignment_5 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_WORD && LA29_0<=RULE_PLACEHOLDER)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCucumber.g:1540:3: rule__ScenarioOutline__NarrativeAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScenarioOutline__NarrativeAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScenarioOutlineAccess().getNarrativeAssignment_5()); 
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


    // $ANTLR start "rule__ScenarioOutline__Group__6"
    // InternalCucumber.g:1548:1: rule__ScenarioOutline__Group__6 : rule__ScenarioOutline__Group__6__Impl rule__ScenarioOutline__Group__7 ;
    public final void rule__ScenarioOutline__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1552:1: ( rule__ScenarioOutline__Group__6__Impl rule__ScenarioOutline__Group__7 )
            // InternalCucumber.g:1553:2: rule__ScenarioOutline__Group__6__Impl rule__ScenarioOutline__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__ScenarioOutline__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1560:1: rule__ScenarioOutline__Group__6__Impl : ( ( ( rule__ScenarioOutline__StepsAssignment_6 ) ) ( ( rule__ScenarioOutline__StepsAssignment_6 )* ) ) ;
    public final void rule__ScenarioOutline__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1564:1: ( ( ( ( rule__ScenarioOutline__StepsAssignment_6 ) ) ( ( rule__ScenarioOutline__StepsAssignment_6 )* ) ) )
            // InternalCucumber.g:1565:1: ( ( ( rule__ScenarioOutline__StepsAssignment_6 ) ) ( ( rule__ScenarioOutline__StepsAssignment_6 )* ) )
            {
            // InternalCucumber.g:1565:1: ( ( ( rule__ScenarioOutline__StepsAssignment_6 ) ) ( ( rule__ScenarioOutline__StepsAssignment_6 )* ) )
            // InternalCucumber.g:1566:2: ( ( rule__ScenarioOutline__StepsAssignment_6 ) ) ( ( rule__ScenarioOutline__StepsAssignment_6 )* )
            {
            // InternalCucumber.g:1566:2: ( ( rule__ScenarioOutline__StepsAssignment_6 ) )
            // InternalCucumber.g:1567:3: ( rule__ScenarioOutline__StepsAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScenarioOutlineAccess().getStepsAssignment_6()); 
            }
            // InternalCucumber.g:1568:3: ( rule__ScenarioOutline__StepsAssignment_6 )
            // InternalCucumber.g:1568:4: rule__ScenarioOutline__StepsAssignment_6
            {
            pushFollow(FOLLOW_15);
            rule__ScenarioOutline__StepsAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScenarioOutlineAccess().getStepsAssignment_6()); 
            }

            }

            // InternalCucumber.g:1571:2: ( ( rule__ScenarioOutline__StepsAssignment_6 )* )
            // InternalCucumber.g:1572:3: ( rule__ScenarioOutline__StepsAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScenarioOutlineAccess().getStepsAssignment_6()); 
            }
            // InternalCucumber.g:1573:3: ( rule__ScenarioOutline__StepsAssignment_6 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_STEP_KEYWORD) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalCucumber.g:1573:4: rule__ScenarioOutline__StepsAssignment_6
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ScenarioOutline__StepsAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScenarioOutlineAccess().getStepsAssignment_6()); 
            }

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


    // $ANTLR start "rule__ScenarioOutline__Group__7"
    // InternalCucumber.g:1582:1: rule__ScenarioOutline__Group__7 : rule__ScenarioOutline__Group__7__Impl ;
    public final void rule__ScenarioOutline__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1586:1: ( rule__ScenarioOutline__Group__7__Impl )
            // InternalCucumber.g:1587:2: rule__ScenarioOutline__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__7"


    // $ANTLR start "rule__ScenarioOutline__Group__7__Impl"
    // InternalCucumber.g:1593:1: rule__ScenarioOutline__Group__7__Impl : ( ( ( rule__ScenarioOutline__ExamplesAssignment_7 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_7 )* ) ) ;
    public final void rule__ScenarioOutline__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1597:1: ( ( ( ( rule__ScenarioOutline__ExamplesAssignment_7 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_7 )* ) ) )
            // InternalCucumber.g:1598:1: ( ( ( rule__ScenarioOutline__ExamplesAssignment_7 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_7 )* ) )
            {
            // InternalCucumber.g:1598:1: ( ( ( rule__ScenarioOutline__ExamplesAssignment_7 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_7 )* ) )
            // InternalCucumber.g:1599:2: ( ( rule__ScenarioOutline__ExamplesAssignment_7 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_7 )* )
            {
            // InternalCucumber.g:1599:2: ( ( rule__ScenarioOutline__ExamplesAssignment_7 ) )
            // InternalCucumber.g:1600:3: ( rule__ScenarioOutline__ExamplesAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_7()); 
            }
            // InternalCucumber.g:1601:3: ( rule__ScenarioOutline__ExamplesAssignment_7 )
            // InternalCucumber.g:1601:4: rule__ScenarioOutline__ExamplesAssignment_7
            {
            pushFollow(FOLLOW_20);
            rule__ScenarioOutline__ExamplesAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_7()); 
            }

            }

            // InternalCucumber.g:1604:2: ( ( rule__ScenarioOutline__ExamplesAssignment_7 )* )
            // InternalCucumber.g:1605:3: ( rule__ScenarioOutline__ExamplesAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_7()); 
            }
            // InternalCucumber.g:1606:3: ( rule__ScenarioOutline__ExamplesAssignment_7 )*
            loop31:
            do {
                int alt31=2;
                alt31 = dfa31.predict(input);
                switch (alt31) {
            	case 1 :
            	    // InternalCucumber.g:1606:4: rule__ScenarioOutline__ExamplesAssignment_7
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__ScenarioOutline__ExamplesAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_7()); 
            }

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
    // $ANTLR end "rule__ScenarioOutline__Group__7__Impl"


    // $ANTLR start "rule__Step__Group__0"
    // InternalCucumber.g:1616:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1620:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // InternalCucumber.g:1621:2: rule__Step__Group__0__Impl rule__Step__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Step__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Step__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1628:1: rule__Step__Group__0__Impl : ( ( rule__Step__KeywordAssignment_0 ) ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1632:1: ( ( ( rule__Step__KeywordAssignment_0 ) ) )
            // InternalCucumber.g:1633:1: ( ( rule__Step__KeywordAssignment_0 ) )
            {
            // InternalCucumber.g:1633:1: ( ( rule__Step__KeywordAssignment_0 ) )
            // InternalCucumber.g:1634:2: ( rule__Step__KeywordAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getKeywordAssignment_0()); 
            }
            // InternalCucumber.g:1635:2: ( rule__Step__KeywordAssignment_0 )
            // InternalCucumber.g:1635:3: rule__Step__KeywordAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Step__KeywordAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getKeywordAssignment_0()); 
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
    // $ANTLR end "rule__Step__Group__0__Impl"


    // $ANTLR start "rule__Step__Group__1"
    // InternalCucumber.g:1643:1: rule__Step__Group__1 : rule__Step__Group__1__Impl rule__Step__Group__2 ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1647:1: ( rule__Step__Group__1__Impl rule__Step__Group__2 )
            // InternalCucumber.g:1648:2: rule__Step__Group__1__Impl rule__Step__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Step__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Step__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1655:1: rule__Step__Group__1__Impl : ( ( rule__Step__DescriptionAssignment_1 ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1659:1: ( ( ( rule__Step__DescriptionAssignment_1 ) ) )
            // InternalCucumber.g:1660:1: ( ( rule__Step__DescriptionAssignment_1 ) )
            {
            // InternalCucumber.g:1660:1: ( ( rule__Step__DescriptionAssignment_1 ) )
            // InternalCucumber.g:1661:2: ( rule__Step__DescriptionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getDescriptionAssignment_1()); 
            }
            // InternalCucumber.g:1662:2: ( rule__Step__DescriptionAssignment_1 )
            // InternalCucumber.g:1662:3: rule__Step__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Step__DescriptionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getDescriptionAssignment_1()); 
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
    // $ANTLR end "rule__Step__Group__1__Impl"


    // $ANTLR start "rule__Step__Group__2"
    // InternalCucumber.g:1670:1: rule__Step__Group__2 : rule__Step__Group__2__Impl rule__Step__Group__3 ;
    public final void rule__Step__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1674:1: ( rule__Step__Group__2__Impl rule__Step__Group__3 )
            // InternalCucumber.g:1675:2: rule__Step__Group__2__Impl rule__Step__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Step__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Step__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1682:1: rule__Step__Group__2__Impl : ( ( RULE_EOL )* ) ;
    public final void rule__Step__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1686:1: ( ( ( RULE_EOL )* ) )
            // InternalCucumber.g:1687:1: ( ( RULE_EOL )* )
            {
            // InternalCucumber.g:1687:1: ( ( RULE_EOL )* )
            // InternalCucumber.g:1688:2: ( RULE_EOL )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getEOLTerminalRuleCall_2()); 
            }
            // InternalCucumber.g:1689:2: ( RULE_EOL )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_EOL) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalCucumber.g:1689:3: RULE_EOL
            	    {
            	    match(input,RULE_EOL,FOLLOW_10); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getEOLTerminalRuleCall_2()); 
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
    // $ANTLR end "rule__Step__Group__2__Impl"


    // $ANTLR start "rule__Step__Group__3"
    // InternalCucumber.g:1697:1: rule__Step__Group__3 : rule__Step__Group__3__Impl ;
    public final void rule__Step__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1701:1: ( rule__Step__Group__3__Impl )
            // InternalCucumber.g:1702:2: rule__Step__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1708:1: rule__Step__Group__3__Impl : ( ( rule__Step__Alternatives_3 )? ) ;
    public final void rule__Step__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1712:1: ( ( ( rule__Step__Alternatives_3 )? ) )
            // InternalCucumber.g:1713:1: ( ( rule__Step__Alternatives_3 )? )
            {
            // InternalCucumber.g:1713:1: ( ( rule__Step__Alternatives_3 )? )
            // InternalCucumber.g:1714:2: ( rule__Step__Alternatives_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getAlternatives_3()); 
            }
            // InternalCucumber.g:1715:2: ( rule__Step__Alternatives_3 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_TABLE_CELL||LA33_0==29) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCucumber.g:1715:3: rule__Step__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Step__Alternatives_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getAlternatives_3()); 
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
    // $ANTLR end "rule__Step__Group__3__Impl"


    // $ANTLR start "rule__Example__Group__0"
    // InternalCucumber.g:1724:1: rule__Example__Group__0 : rule__Example__Group__0__Impl rule__Example__Group__1 ;
    public final void rule__Example__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1728:1: ( rule__Example__Group__0__Impl rule__Example__Group__1 )
            // InternalCucumber.g:1729:2: rule__Example__Group__0__Impl rule__Example__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Example__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Example__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1736:1: rule__Example__Group__0__Impl : ( ( rule__Example__TagsAssignment_0 )* ) ;
    public final void rule__Example__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1740:1: ( ( ( rule__Example__TagsAssignment_0 )* ) )
            // InternalCucumber.g:1741:1: ( ( rule__Example__TagsAssignment_0 )* )
            {
            // InternalCucumber.g:1741:1: ( ( rule__Example__TagsAssignment_0 )* )
            // InternalCucumber.g:1742:2: ( rule__Example__TagsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExampleAccess().getTagsAssignment_0()); 
            }
            // InternalCucumber.g:1743:2: ( rule__Example__TagsAssignment_0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_TAGNAME) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalCucumber.g:1743:3: rule__Example__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Example__TagsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExampleAccess().getTagsAssignment_0()); 
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
    // $ANTLR end "rule__Example__Group__0__Impl"


    // $ANTLR start "rule__Example__Group__1"
    // InternalCucumber.g:1751:1: rule__Example__Group__1 : rule__Example__Group__1__Impl rule__Example__Group__2 ;
    public final void rule__Example__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1755:1: ( rule__Example__Group__1__Impl rule__Example__Group__2 )
            // InternalCucumber.g:1756:2: rule__Example__Group__1__Impl rule__Example__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Example__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Example__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1763:1: rule__Example__Group__1__Impl : ( 'Examples:' ) ;
    public final void rule__Example__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1767:1: ( ( 'Examples:' ) )
            // InternalCucumber.g:1768:1: ( 'Examples:' )
            {
            // InternalCucumber.g:1768:1: ( 'Examples:' )
            // InternalCucumber.g:1769:2: 'Examples:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExampleAccess().getExamplesKeyword_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExampleAccess().getExamplesKeyword_1()); 
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
    // $ANTLR end "rule__Example__Group__1__Impl"


    // $ANTLR start "rule__Example__Group__2"
    // InternalCucumber.g:1778:1: rule__Example__Group__2 : rule__Example__Group__2__Impl rule__Example__Group__3 ;
    public final void rule__Example__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1782:1: ( rule__Example__Group__2__Impl rule__Example__Group__3 )
            // InternalCucumber.g:1783:2: rule__Example__Group__2__Impl rule__Example__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Example__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Example__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1790:1: rule__Example__Group__2__Impl : ( ( rule__Example__TitleAssignment_2 )? ) ;
    public final void rule__Example__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1794:1: ( ( ( rule__Example__TitleAssignment_2 )? ) )
            // InternalCucumber.g:1795:1: ( ( rule__Example__TitleAssignment_2 )? )
            {
            // InternalCucumber.g:1795:1: ( ( rule__Example__TitleAssignment_2 )? )
            // InternalCucumber.g:1796:2: ( rule__Example__TitleAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExampleAccess().getTitleAssignment_2()); 
            }
            // InternalCucumber.g:1797:2: ( rule__Example__TitleAssignment_2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_WORD && LA35_0<=RULE_PLACEHOLDER)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCucumber.g:1797:3: rule__Example__TitleAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Example__TitleAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExampleAccess().getTitleAssignment_2()); 
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
    // $ANTLR end "rule__Example__Group__2__Impl"


    // $ANTLR start "rule__Example__Group__3"
    // InternalCucumber.g:1805:1: rule__Example__Group__3 : rule__Example__Group__3__Impl rule__Example__Group__4 ;
    public final void rule__Example__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1809:1: ( rule__Example__Group__3__Impl rule__Example__Group__4 )
            // InternalCucumber.g:1810:2: rule__Example__Group__3__Impl rule__Example__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Example__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Example__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1817:1: rule__Example__Group__3__Impl : ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) ) ;
    public final void rule__Example__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1821:1: ( ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) ) )
            // InternalCucumber.g:1822:1: ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) )
            {
            // InternalCucumber.g:1822:1: ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) )
            // InternalCucumber.g:1823:2: ( ( RULE_EOL ) ) ( ( RULE_EOL )* )
            {
            // InternalCucumber.g:1823:2: ( ( RULE_EOL ) )
            // InternalCucumber.g:1824:3: ( RULE_EOL )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExampleAccess().getEOLTerminalRuleCall_3()); 
            }
            // InternalCucumber.g:1825:3: ( RULE_EOL )
            // InternalCucumber.g:1825:4: RULE_EOL
            {
            match(input,RULE_EOL,FOLLOW_10); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExampleAccess().getEOLTerminalRuleCall_3()); 
            }

            }

            // InternalCucumber.g:1828:2: ( ( RULE_EOL )* )
            // InternalCucumber.g:1829:3: ( RULE_EOL )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExampleAccess().getEOLTerminalRuleCall_3()); 
            }
            // InternalCucumber.g:1830:3: ( RULE_EOL )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_EOL) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalCucumber.g:1830:4: RULE_EOL
            	    {
            	    match(input,RULE_EOL,FOLLOW_10); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExampleAccess().getEOLTerminalRuleCall_3()); 
            }

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
    // $ANTLR end "rule__Example__Group__3__Impl"


    // $ANTLR start "rule__Example__Group__4"
    // InternalCucumber.g:1839:1: rule__Example__Group__4 : rule__Example__Group__4__Impl rule__Example__Group__5 ;
    public final void rule__Example__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1843:1: ( rule__Example__Group__4__Impl rule__Example__Group__5 )
            // InternalCucumber.g:1844:2: rule__Example__Group__4__Impl rule__Example__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Example__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Example__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1851:1: rule__Example__Group__4__Impl : ( ( rule__Example__NarrativeAssignment_4 )? ) ;
    public final void rule__Example__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1855:1: ( ( ( rule__Example__NarrativeAssignment_4 )? ) )
            // InternalCucumber.g:1856:1: ( ( rule__Example__NarrativeAssignment_4 )? )
            {
            // InternalCucumber.g:1856:1: ( ( rule__Example__NarrativeAssignment_4 )? )
            // InternalCucumber.g:1857:2: ( rule__Example__NarrativeAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExampleAccess().getNarrativeAssignment_4()); 
            }
            // InternalCucumber.g:1858:2: ( rule__Example__NarrativeAssignment_4 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_WORD && LA37_0<=RULE_PLACEHOLDER)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCucumber.g:1858:3: rule__Example__NarrativeAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Example__NarrativeAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExampleAccess().getNarrativeAssignment_4()); 
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
    // $ANTLR end "rule__Example__Group__4__Impl"


    // $ANTLR start "rule__Example__Group__5"
    // InternalCucumber.g:1866:1: rule__Example__Group__5 : rule__Example__Group__5__Impl ;
    public final void rule__Example__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1870:1: ( rule__Example__Group__5__Impl )
            // InternalCucumber.g:1871:2: rule__Example__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Example__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1877:1: rule__Example__Group__5__Impl : ( ( rule__Example__TableAssignment_5 ) ) ;
    public final void rule__Example__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1881:1: ( ( ( rule__Example__TableAssignment_5 ) ) )
            // InternalCucumber.g:1882:1: ( ( rule__Example__TableAssignment_5 ) )
            {
            // InternalCucumber.g:1882:1: ( ( rule__Example__TableAssignment_5 ) )
            // InternalCucumber.g:1883:2: ( rule__Example__TableAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExampleAccess().getTableAssignment_5()); 
            }
            // InternalCucumber.g:1884:2: ( rule__Example__TableAssignment_5 )
            // InternalCucumber.g:1884:3: rule__Example__TableAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Example__TableAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExampleAccess().getTableAssignment_5()); 
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


    // $ANTLR start "rule__Table__Group__0"
    // InternalCucumber.g:1893:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1897:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalCucumber.g:1898:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Table__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Table__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1905:1: rule__Table__Group__0__Impl : ( () ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1909:1: ( ( () ) )
            // InternalCucumber.g:1910:1: ( () )
            {
            // InternalCucumber.g:1910:1: ( () )
            // InternalCucumber.g:1911:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getTableAction_0()); 
            }
            // InternalCucumber.g:1912:2: ()
            // InternalCucumber.g:1912:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getTableAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0__Impl"


    // $ANTLR start "rule__Table__Group__1"
    // InternalCucumber.g:1920:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1924:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalCucumber.g:1925:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Table__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Table__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1932:1: rule__Table__Group__1__Impl : ( ( ( rule__Table__RowsAssignment_1 ) ) ( ( rule__Table__RowsAssignment_1 )* ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1936:1: ( ( ( ( rule__Table__RowsAssignment_1 ) ) ( ( rule__Table__RowsAssignment_1 )* ) ) )
            // InternalCucumber.g:1937:1: ( ( ( rule__Table__RowsAssignment_1 ) ) ( ( rule__Table__RowsAssignment_1 )* ) )
            {
            // InternalCucumber.g:1937:1: ( ( ( rule__Table__RowsAssignment_1 ) ) ( ( rule__Table__RowsAssignment_1 )* ) )
            // InternalCucumber.g:1938:2: ( ( rule__Table__RowsAssignment_1 ) ) ( ( rule__Table__RowsAssignment_1 )* )
            {
            // InternalCucumber.g:1938:2: ( ( rule__Table__RowsAssignment_1 ) )
            // InternalCucumber.g:1939:3: ( rule__Table__RowsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getRowsAssignment_1()); 
            }
            // InternalCucumber.g:1940:3: ( rule__Table__RowsAssignment_1 )
            // InternalCucumber.g:1940:4: rule__Table__RowsAssignment_1
            {
            pushFollow(FOLLOW_25);
            rule__Table__RowsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getRowsAssignment_1()); 
            }

            }

            // InternalCucumber.g:1943:2: ( ( rule__Table__RowsAssignment_1 )* )
            // InternalCucumber.g:1944:3: ( rule__Table__RowsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getRowsAssignment_1()); 
            }
            // InternalCucumber.g:1945:3: ( rule__Table__RowsAssignment_1 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_TABLE_CELL) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalCucumber.g:1945:4: rule__Table__RowsAssignment_1
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Table__RowsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getRowsAssignment_1()); 
            }

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
    // $ANTLR end "rule__Table__Group__1__Impl"


    // $ANTLR start "rule__Table__Group__2"
    // InternalCucumber.g:1954:1: rule__Table__Group__2 : rule__Table__Group__2__Impl ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1958:1: ( rule__Table__Group__2__Impl )
            // InternalCucumber.g:1959:2: rule__Table__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1965:1: rule__Table__Group__2__Impl : ( ( RULE_EOL )* ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1969:1: ( ( ( RULE_EOL )* ) )
            // InternalCucumber.g:1970:1: ( ( RULE_EOL )* )
            {
            // InternalCucumber.g:1970:1: ( ( RULE_EOL )* )
            // InternalCucumber.g:1971:2: ( RULE_EOL )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getEOLTerminalRuleCall_2()); 
            }
            // InternalCucumber.g:1972:2: ( RULE_EOL )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_EOL) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalCucumber.g:1972:3: RULE_EOL
            	    {
            	    match(input,RULE_EOL,FOLLOW_10); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getEOLTerminalRuleCall_2()); 
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


    // $ANTLR start "rule__TableRow__Group__0"
    // InternalCucumber.g:1981:1: rule__TableRow__Group__0 : rule__TableRow__Group__0__Impl rule__TableRow__Group__1 ;
    public final void rule__TableRow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1985:1: ( rule__TableRow__Group__0__Impl rule__TableRow__Group__1 )
            // InternalCucumber.g:1986:2: rule__TableRow__Group__0__Impl rule__TableRow__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__TableRow__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TableRow__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:1993:1: rule__TableRow__Group__0__Impl : ( () ) ;
    public final void rule__TableRow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1997:1: ( ( () ) )
            // InternalCucumber.g:1998:1: ( () )
            {
            // InternalCucumber.g:1998:1: ( () )
            // InternalCucumber.g:1999:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableRowAccess().getTableRowAction_0()); 
            }
            // InternalCucumber.g:2000:2: ()
            // InternalCucumber.g:2000:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableRowAccess().getTableRowAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRow__Group__0__Impl"


    // $ANTLR start "rule__TableRow__Group__1"
    // InternalCucumber.g:2008:1: rule__TableRow__Group__1 : rule__TableRow__Group__1__Impl rule__TableRow__Group__2 ;
    public final void rule__TableRow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2012:1: ( rule__TableRow__Group__1__Impl rule__TableRow__Group__2 )
            // InternalCucumber.g:2013:2: rule__TableRow__Group__1__Impl rule__TableRow__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__TableRow__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TableRow__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:2020:1: rule__TableRow__Group__1__Impl : ( ( ( rule__TableRow__ColsAssignment_1 ) ) ( ( rule__TableRow__ColsAssignment_1 )* ) ) ;
    public final void rule__TableRow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2024:1: ( ( ( ( rule__TableRow__ColsAssignment_1 ) ) ( ( rule__TableRow__ColsAssignment_1 )* ) ) )
            // InternalCucumber.g:2025:1: ( ( ( rule__TableRow__ColsAssignment_1 ) ) ( ( rule__TableRow__ColsAssignment_1 )* ) )
            {
            // InternalCucumber.g:2025:1: ( ( ( rule__TableRow__ColsAssignment_1 ) ) ( ( rule__TableRow__ColsAssignment_1 )* ) )
            // InternalCucumber.g:2026:2: ( ( rule__TableRow__ColsAssignment_1 ) ) ( ( rule__TableRow__ColsAssignment_1 )* )
            {
            // InternalCucumber.g:2026:2: ( ( rule__TableRow__ColsAssignment_1 ) )
            // InternalCucumber.g:2027:3: ( rule__TableRow__ColsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableRowAccess().getColsAssignment_1()); 
            }
            // InternalCucumber.g:2028:3: ( rule__TableRow__ColsAssignment_1 )
            // InternalCucumber.g:2028:4: rule__TableRow__ColsAssignment_1
            {
            pushFollow(FOLLOW_25);
            rule__TableRow__ColsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableRowAccess().getColsAssignment_1()); 
            }

            }

            // InternalCucumber.g:2031:2: ( ( rule__TableRow__ColsAssignment_1 )* )
            // InternalCucumber.g:2032:3: ( rule__TableRow__ColsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableRowAccess().getColsAssignment_1()); 
            }
            // InternalCucumber.g:2033:3: ( rule__TableRow__ColsAssignment_1 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_TABLE_CELL) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalCucumber.g:2033:4: rule__TableRow__ColsAssignment_1
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__TableRow__ColsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableRowAccess().getColsAssignment_1()); 
            }

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
    // $ANTLR end "rule__TableRow__Group__1__Impl"


    // $ANTLR start "rule__TableRow__Group__2"
    // InternalCucumber.g:2042:1: rule__TableRow__Group__2 : rule__TableRow__Group__2__Impl rule__TableRow__Group__3 ;
    public final void rule__TableRow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2046:1: ( rule__TableRow__Group__2__Impl rule__TableRow__Group__3 )
            // InternalCucumber.g:2047:2: rule__TableRow__Group__2__Impl rule__TableRow__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__TableRow__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TableRow__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:2054:1: rule__TableRow__Group__2__Impl : ( '|' ) ;
    public final void rule__TableRow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2058:1: ( ( '|' ) )
            // InternalCucumber.g:2059:1: ( '|' )
            {
            // InternalCucumber.g:2059:1: ( '|' )
            // InternalCucumber.g:2060:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableRowAccess().getVerticalLineKeyword_2()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableRowAccess().getVerticalLineKeyword_2()); 
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
    // $ANTLR end "rule__TableRow__Group__2__Impl"


    // $ANTLR start "rule__TableRow__Group__3"
    // InternalCucumber.g:2069:1: rule__TableRow__Group__3 : rule__TableRow__Group__3__Impl ;
    public final void rule__TableRow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2073:1: ( rule__TableRow__Group__3__Impl )
            // InternalCucumber.g:2074:2: rule__TableRow__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableRow__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRow__Group__3"


    // $ANTLR start "rule__TableRow__Group__3__Impl"
    // InternalCucumber.g:2080:1: rule__TableRow__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__TableRow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2084:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2085:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2085:1: ( RULE_EOL )
            // InternalCucumber.g:2086:2: RULE_EOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableRowAccess().getEOLTerminalRuleCall_3()); 
            }
            match(input,RULE_EOL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableRowAccess().getEOLTerminalRuleCall_3()); 
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
    // $ANTLR end "rule__TableRow__Group__3__Impl"


    // $ANTLR start "rule__TableCol__Group__0"
    // InternalCucumber.g:2096:1: rule__TableCol__Group__0 : rule__TableCol__Group__0__Impl rule__TableCol__Group__1 ;
    public final void rule__TableCol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2100:1: ( rule__TableCol__Group__0__Impl rule__TableCol__Group__1 )
            // InternalCucumber.g:2101:2: rule__TableCol__Group__0__Impl rule__TableCol__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__TableCol__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TableCol__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableCol__Group__0"


    // $ANTLR start "rule__TableCol__Group__0__Impl"
    // InternalCucumber.g:2108:1: rule__TableCol__Group__0__Impl : ( () ) ;
    public final void rule__TableCol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2112:1: ( ( () ) )
            // InternalCucumber.g:2113:1: ( () )
            {
            // InternalCucumber.g:2113:1: ( () )
            // InternalCucumber.g:2114:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableColAccess().getTableColAction_0()); 
            }
            // InternalCucumber.g:2115:2: ()
            // InternalCucumber.g:2115:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableColAccess().getTableColAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableCol__Group__0__Impl"


    // $ANTLR start "rule__TableCol__Group__1"
    // InternalCucumber.g:2123:1: rule__TableCol__Group__1 : rule__TableCol__Group__1__Impl ;
    public final void rule__TableCol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2127:1: ( rule__TableCol__Group__1__Impl )
            // InternalCucumber.g:2128:2: rule__TableCol__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableCol__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableCol__Group__1"


    // $ANTLR start "rule__TableCol__Group__1__Impl"
    // InternalCucumber.g:2134:1: rule__TableCol__Group__1__Impl : ( ( rule__TableCol__CellAssignment_1 ) ) ;
    public final void rule__TableCol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2138:1: ( ( ( rule__TableCol__CellAssignment_1 ) ) )
            // InternalCucumber.g:2139:1: ( ( rule__TableCol__CellAssignment_1 ) )
            {
            // InternalCucumber.g:2139:1: ( ( rule__TableCol__CellAssignment_1 ) )
            // InternalCucumber.g:2140:2: ( rule__TableCol__CellAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableColAccess().getCellAssignment_1()); 
            }
            // InternalCucumber.g:2141:2: ( rule__TableCol__CellAssignment_1 )
            // InternalCucumber.g:2141:3: rule__TableCol__CellAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TableCol__CellAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableColAccess().getCellAssignment_1()); 
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
    // $ANTLR end "rule__TableCol__Group__1__Impl"


    // $ANTLR start "rule__DocString__Group__0"
    // InternalCucumber.g:2150:1: rule__DocString__Group__0 : rule__DocString__Group__0__Impl rule__DocString__Group__1 ;
    public final void rule__DocString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2154:1: ( rule__DocString__Group__0__Impl rule__DocString__Group__1 )
            // InternalCucumber.g:2155:2: rule__DocString__Group__0__Impl rule__DocString__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__DocString__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DocString__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:2162:1: rule__DocString__Group__0__Impl : ( () ) ;
    public final void rule__DocString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2166:1: ( ( () ) )
            // InternalCucumber.g:2167:1: ( () )
            {
            // InternalCucumber.g:2167:1: ( () )
            // InternalCucumber.g:2168:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocStringAccess().getDocStringAction_0()); 
            }
            // InternalCucumber.g:2169:2: ()
            // InternalCucumber.g:2169:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocStringAccess().getDocStringAction_0()); 
            }

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
    // InternalCucumber.g:2177:1: rule__DocString__Group__1 : rule__DocString__Group__1__Impl rule__DocString__Group__2 ;
    public final void rule__DocString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2181:1: ( rule__DocString__Group__1__Impl rule__DocString__Group__2 )
            // InternalCucumber.g:2182:2: rule__DocString__Group__1__Impl rule__DocString__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__DocString__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DocString__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:2189:1: rule__DocString__Group__1__Impl : ( ( rule__DocString__Group_1__0 ) ) ;
    public final void rule__DocString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2193:1: ( ( ( rule__DocString__Group_1__0 ) ) )
            // InternalCucumber.g:2194:1: ( ( rule__DocString__Group_1__0 ) )
            {
            // InternalCucumber.g:2194:1: ( ( rule__DocString__Group_1__0 ) )
            // InternalCucumber.g:2195:2: ( rule__DocString__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocStringAccess().getGroup_1()); 
            }
            // InternalCucumber.g:2196:2: ( rule__DocString__Group_1__0 )
            // InternalCucumber.g:2196:3: rule__DocString__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__DocString__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocStringAccess().getGroup_1()); 
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
    // $ANTLR end "rule__DocString__Group__1__Impl"


    // $ANTLR start "rule__DocString__Group__2"
    // InternalCucumber.g:2204:1: rule__DocString__Group__2 : rule__DocString__Group__2__Impl ;
    public final void rule__DocString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2208:1: ( rule__DocString__Group__2__Impl )
            // InternalCucumber.g:2209:2: rule__DocString__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DocString__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:2215:1: rule__DocString__Group__2__Impl : ( ( RULE_EOL )* ) ;
    public final void rule__DocString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2219:1: ( ( ( RULE_EOL )* ) )
            // InternalCucumber.g:2220:1: ( ( RULE_EOL )* )
            {
            // InternalCucumber.g:2220:1: ( ( RULE_EOL )* )
            // InternalCucumber.g:2221:2: ( RULE_EOL )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_2()); 
            }
            // InternalCucumber.g:2222:2: ( RULE_EOL )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_EOL) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalCucumber.g:2222:3: RULE_EOL
            	    {
            	    match(input,RULE_EOL,FOLLOW_10); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_2()); 
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


    // $ANTLR start "rule__DocString__Group_1__0"
    // InternalCucumber.g:2231:1: rule__DocString__Group_1__0 : rule__DocString__Group_1__0__Impl rule__DocString__Group_1__1 ;
    public final void rule__DocString__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2235:1: ( rule__DocString__Group_1__0__Impl rule__DocString__Group_1__1 )
            // InternalCucumber.g:2236:2: rule__DocString__Group_1__0__Impl rule__DocString__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__DocString__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DocString__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocString__Group_1__0"


    // $ANTLR start "rule__DocString__Group_1__0__Impl"
    // InternalCucumber.g:2243:1: rule__DocString__Group_1__0__Impl : ( '\"\"\"' ) ;
    public final void rule__DocString__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2247:1: ( ( '\"\"\"' ) )
            // InternalCucumber.g:2248:1: ( '\"\"\"' )
            {
            // InternalCucumber.g:2248:1: ( '\"\"\"' )
            // InternalCucumber.g:2249:2: '\"\"\"'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_1_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_1_0()); 
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
    // $ANTLR end "rule__DocString__Group_1__0__Impl"


    // $ANTLR start "rule__DocString__Group_1__1"
    // InternalCucumber.g:2258:1: rule__DocString__Group_1__1 : rule__DocString__Group_1__1__Impl rule__DocString__Group_1__2 ;
    public final void rule__DocString__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2262:1: ( rule__DocString__Group_1__1__Impl rule__DocString__Group_1__2 )
            // InternalCucumber.g:2263:2: rule__DocString__Group_1__1__Impl rule__DocString__Group_1__2
            {
            pushFollow(FOLLOW_28);
            rule__DocString__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DocString__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocString__Group_1__1"


    // $ANTLR start "rule__DocString__Group_1__1__Impl"
    // InternalCucumber.g:2270:1: rule__DocString__Group_1__1__Impl : ( RULE_EOL ) ;
    public final void rule__DocString__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2274:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2275:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2275:1: ( RULE_EOL )
            // InternalCucumber.g:2276:2: RULE_EOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_1_1()); 
            }
            match(input,RULE_EOL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__DocString__Group_1__1__Impl"


    // $ANTLR start "rule__DocString__Group_1__2"
    // InternalCucumber.g:2285:1: rule__DocString__Group_1__2 : rule__DocString__Group_1__2__Impl rule__DocString__Group_1__3 ;
    public final void rule__DocString__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2289:1: ( rule__DocString__Group_1__2__Impl rule__DocString__Group_1__3 )
            // InternalCucumber.g:2290:2: rule__DocString__Group_1__2__Impl rule__DocString__Group_1__3
            {
            pushFollow(FOLLOW_29);
            rule__DocString__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DocString__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocString__Group_1__2"


    // $ANTLR start "rule__DocString__Group_1__2__Impl"
    // InternalCucumber.g:2297:1: rule__DocString__Group_1__2__Impl : ( ( rule__DocString__TextAssignment_1_2 ) ) ;
    public final void rule__DocString__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2301:1: ( ( ( rule__DocString__TextAssignment_1_2 ) ) )
            // InternalCucumber.g:2302:1: ( ( rule__DocString__TextAssignment_1_2 ) )
            {
            // InternalCucumber.g:2302:1: ( ( rule__DocString__TextAssignment_1_2 ) )
            // InternalCucumber.g:2303:2: ( rule__DocString__TextAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocStringAccess().getTextAssignment_1_2()); 
            }
            // InternalCucumber.g:2304:2: ( rule__DocString__TextAssignment_1_2 )
            // InternalCucumber.g:2304:3: rule__DocString__TextAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__DocString__TextAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocStringAccess().getTextAssignment_1_2()); 
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
    // $ANTLR end "rule__DocString__Group_1__2__Impl"


    // $ANTLR start "rule__DocString__Group_1__3"
    // InternalCucumber.g:2312:1: rule__DocString__Group_1__3 : rule__DocString__Group_1__3__Impl ;
    public final void rule__DocString__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2316:1: ( rule__DocString__Group_1__3__Impl )
            // InternalCucumber.g:2317:2: rule__DocString__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DocString__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocString__Group_1__3"


    // $ANTLR start "rule__DocString__Group_1__3__Impl"
    // InternalCucumber.g:2323:1: rule__DocString__Group_1__3__Impl : ( '\"\"\"' ) ;
    public final void rule__DocString__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2327:1: ( ( '\"\"\"' ) )
            // InternalCucumber.g:2328:1: ( '\"\"\"' )
            {
            // InternalCucumber.g:2328:1: ( '\"\"\"' )
            // InternalCucumber.g:2329:2: '\"\"\"'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_1_3()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_1_3()); 
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
    // $ANTLR end "rule__DocString__Group_1__3__Impl"


    // $ANTLR start "rule__Title__Group__0"
    // InternalCucumber.g:2339:1: rule__Title__Group__0 : rule__Title__Group__0__Impl rule__Title__Group__1 ;
    public final void rule__Title__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2343:1: ( rule__Title__Group__0__Impl rule__Title__Group__1 )
            // InternalCucumber.g:2344:2: rule__Title__Group__0__Impl rule__Title__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Title__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Title__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__0"


    // $ANTLR start "rule__Title__Group__0__Impl"
    // InternalCucumber.g:2351:1: rule__Title__Group__0__Impl : ( ( rule__Title__Alternatives_0 ) ) ;
    public final void rule__Title__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2355:1: ( ( ( rule__Title__Alternatives_0 ) ) )
            // InternalCucumber.g:2356:1: ( ( rule__Title__Alternatives_0 ) )
            {
            // InternalCucumber.g:2356:1: ( ( rule__Title__Alternatives_0 ) )
            // InternalCucumber.g:2357:2: ( rule__Title__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTitleAccess().getAlternatives_0()); 
            }
            // InternalCucumber.g:2358:2: ( rule__Title__Alternatives_0 )
            // InternalCucumber.g:2358:3: rule__Title__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Title__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTitleAccess().getAlternatives_0()); 
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
    // $ANTLR end "rule__Title__Group__0__Impl"


    // $ANTLR start "rule__Title__Group__1"
    // InternalCucumber.g:2366:1: rule__Title__Group__1 : rule__Title__Group__1__Impl ;
    public final void rule__Title__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2370:1: ( rule__Title__Group__1__Impl )
            // InternalCucumber.g:2371:2: rule__Title__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Title__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__1"


    // $ANTLR start "rule__Title__Group__1__Impl"
    // InternalCucumber.g:2377:1: rule__Title__Group__1__Impl : ( ( rule__Title__Alternatives_1 )* ) ;
    public final void rule__Title__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2381:1: ( ( ( rule__Title__Alternatives_1 )* ) )
            // InternalCucumber.g:2382:1: ( ( rule__Title__Alternatives_1 )* )
            {
            // InternalCucumber.g:2382:1: ( ( rule__Title__Alternatives_1 )* )
            // InternalCucumber.g:2383:2: ( rule__Title__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTitleAccess().getAlternatives_1()); 
            }
            // InternalCucumber.g:2384:2: ( rule__Title__Alternatives_1 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_WORD && LA42_0<=RULE_TAGNAME)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalCucumber.g:2384:3: rule__Title__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Title__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTitleAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__Title__Group__1__Impl"


    // $ANTLR start "rule__Narrative__Group__0"
    // InternalCucumber.g:2393:1: rule__Narrative__Group__0 : rule__Narrative__Group__0__Impl rule__Narrative__Group__1 ;
    public final void rule__Narrative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2397:1: ( rule__Narrative__Group__0__Impl rule__Narrative__Group__1 )
            // InternalCucumber.g:2398:2: rule__Narrative__Group__0__Impl rule__Narrative__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Narrative__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Narrative__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Narrative__Group__0"


    // $ANTLR start "rule__Narrative__Group__0__Impl"
    // InternalCucumber.g:2405:1: rule__Narrative__Group__0__Impl : ( ( rule__Narrative__Alternatives_0 ) ) ;
    public final void rule__Narrative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2409:1: ( ( ( rule__Narrative__Alternatives_0 ) ) )
            // InternalCucumber.g:2410:1: ( ( rule__Narrative__Alternatives_0 ) )
            {
            // InternalCucumber.g:2410:1: ( ( rule__Narrative__Alternatives_0 ) )
            // InternalCucumber.g:2411:2: ( rule__Narrative__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNarrativeAccess().getAlternatives_0()); 
            }
            // InternalCucumber.g:2412:2: ( rule__Narrative__Alternatives_0 )
            // InternalCucumber.g:2412:3: rule__Narrative__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Narrative__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNarrativeAccess().getAlternatives_0()); 
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
    // $ANTLR end "rule__Narrative__Group__0__Impl"


    // $ANTLR start "rule__Narrative__Group__1"
    // InternalCucumber.g:2420:1: rule__Narrative__Group__1 : rule__Narrative__Group__1__Impl rule__Narrative__Group__2 ;
    public final void rule__Narrative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2424:1: ( rule__Narrative__Group__1__Impl rule__Narrative__Group__2 )
            // InternalCucumber.g:2425:2: rule__Narrative__Group__1__Impl rule__Narrative__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__Narrative__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Narrative__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Narrative__Group__1"


    // $ANTLR start "rule__Narrative__Group__1__Impl"
    // InternalCucumber.g:2432:1: rule__Narrative__Group__1__Impl : ( ( rule__Narrative__Alternatives_1 )* ) ;
    public final void rule__Narrative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2436:1: ( ( ( rule__Narrative__Alternatives_1 )* ) )
            // InternalCucumber.g:2437:1: ( ( rule__Narrative__Alternatives_1 )* )
            {
            // InternalCucumber.g:2437:1: ( ( rule__Narrative__Alternatives_1 )* )
            // InternalCucumber.g:2438:2: ( rule__Narrative__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNarrativeAccess().getAlternatives_1()); 
            }
            // InternalCucumber.g:2439:2: ( rule__Narrative__Alternatives_1 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=RULE_WORD && LA43_0<=RULE_TAGNAME)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalCucumber.g:2439:3: rule__Narrative__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Narrative__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNarrativeAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__Narrative__Group__1__Impl"


    // $ANTLR start "rule__Narrative__Group__2"
    // InternalCucumber.g:2447:1: rule__Narrative__Group__2 : rule__Narrative__Group__2__Impl ;
    public final void rule__Narrative__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2451:1: ( rule__Narrative__Group__2__Impl )
            // InternalCucumber.g:2452:2: rule__Narrative__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Narrative__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Narrative__Group__2"


    // $ANTLR start "rule__Narrative__Group__2__Impl"
    // InternalCucumber.g:2458:1: rule__Narrative__Group__2__Impl : ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) ) ;
    public final void rule__Narrative__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2462:1: ( ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) ) )
            // InternalCucumber.g:2463:1: ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) )
            {
            // InternalCucumber.g:2463:1: ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) )
            // InternalCucumber.g:2464:2: ( ( RULE_EOL ) ) ( ( RULE_EOL )* )
            {
            // InternalCucumber.g:2464:2: ( ( RULE_EOL ) )
            // InternalCucumber.g:2465:3: ( RULE_EOL )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNarrativeAccess().getEOLTerminalRuleCall_2()); 
            }
            // InternalCucumber.g:2466:3: ( RULE_EOL )
            // InternalCucumber.g:2466:4: RULE_EOL
            {
            match(input,RULE_EOL,FOLLOW_10); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNarrativeAccess().getEOLTerminalRuleCall_2()); 
            }

            }

            // InternalCucumber.g:2469:2: ( ( RULE_EOL )* )
            // InternalCucumber.g:2470:3: ( RULE_EOL )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNarrativeAccess().getEOLTerminalRuleCall_2()); 
            }
            // InternalCucumber.g:2471:3: ( RULE_EOL )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_EOL) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalCucumber.g:2471:4: RULE_EOL
            	    {
            	    match(input,RULE_EOL,FOLLOW_10); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNarrativeAccess().getEOLTerminalRuleCall_2()); 
            }

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
    // $ANTLR end "rule__Narrative__Group__2__Impl"


    // $ANTLR start "rule__Tag__Group__0"
    // InternalCucumber.g:2481:1: rule__Tag__Group__0 : rule__Tag__Group__0__Impl rule__Tag__Group__1 ;
    public final void rule__Tag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2485:1: ( rule__Tag__Group__0__Impl rule__Tag__Group__1 )
            // InternalCucumber.g:2486:2: rule__Tag__Group__0__Impl rule__Tag__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Tag__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Tag__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:2493:1: rule__Tag__Group__0__Impl : ( ( rule__Tag__IdAssignment_0 ) ) ;
    public final void rule__Tag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2497:1: ( ( ( rule__Tag__IdAssignment_0 ) ) )
            // InternalCucumber.g:2498:1: ( ( rule__Tag__IdAssignment_0 ) )
            {
            // InternalCucumber.g:2498:1: ( ( rule__Tag__IdAssignment_0 ) )
            // InternalCucumber.g:2499:2: ( rule__Tag__IdAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAccess().getIdAssignment_0()); 
            }
            // InternalCucumber.g:2500:2: ( rule__Tag__IdAssignment_0 )
            // InternalCucumber.g:2500:3: rule__Tag__IdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Tag__IdAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAccess().getIdAssignment_0()); 
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
    // $ANTLR end "rule__Tag__Group__0__Impl"


    // $ANTLR start "rule__Tag__Group__1"
    // InternalCucumber.g:2508:1: rule__Tag__Group__1 : rule__Tag__Group__1__Impl ;
    public final void rule__Tag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2512:1: ( rule__Tag__Group__1__Impl )
            // InternalCucumber.g:2513:2: rule__Tag__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tag__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalCucumber.g:2519:1: rule__Tag__Group__1__Impl : ( ( RULE_EOL )? ) ;
    public final void rule__Tag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2523:1: ( ( ( RULE_EOL )? ) )
            // InternalCucumber.g:2524:1: ( ( RULE_EOL )? )
            {
            // InternalCucumber.g:2524:1: ( ( RULE_EOL )? )
            // InternalCucumber.g:2525:2: ( RULE_EOL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAccess().getEOLTerminalRuleCall_1()); 
            }
            // InternalCucumber.g:2526:2: ( RULE_EOL )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_EOL) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalCucumber.g:2526:3: RULE_EOL
                    {
                    match(input,RULE_EOL,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAccess().getEOLTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__Tag__Group__1__Impl"


    // $ANTLR start "rule__Text__Group__0"
    // InternalCucumber.g:2535:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2539:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // InternalCucumber.g:2540:2: rule__Text__Group__0__Impl rule__Text__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Text__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Text__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__0"


    // $ANTLR start "rule__Text__Group__0__Impl"
    // InternalCucumber.g:2547:1: rule__Text__Group__0__Impl : ( () ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2551:1: ( ( () ) )
            // InternalCucumber.g:2552:1: ( () )
            {
            // InternalCucumber.g:2552:1: ( () )
            // InternalCucumber.g:2553:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAccess().getTextAction_0()); 
            }
            // InternalCucumber.g:2554:2: ()
            // InternalCucumber.g:2554:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAccess().getTextAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__0__Impl"


    // $ANTLR start "rule__Text__Group__1"
    // InternalCucumber.g:2562:1: rule__Text__Group__1 : rule__Text__Group__1__Impl ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2566:1: ( rule__Text__Group__1__Impl )
            // InternalCucumber.g:2567:2: rule__Text__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__1"


    // $ANTLR start "rule__Text__Group__1__Impl"
    // InternalCucumber.g:2573:1: rule__Text__Group__1__Impl : ( ( rule__Text__LinesAssignment_1 )* ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2577:1: ( ( ( rule__Text__LinesAssignment_1 )* ) )
            // InternalCucumber.g:2578:1: ( ( rule__Text__LinesAssignment_1 )* )
            {
            // InternalCucumber.g:2578:1: ( ( rule__Text__LinesAssignment_1 )* )
            // InternalCucumber.g:2579:2: ( rule__Text__LinesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAccess().getLinesAssignment_1()); 
            }
            // InternalCucumber.g:2580:2: ( rule__Text__LinesAssignment_1 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=RULE_WORD && LA46_0<=RULE_STRING)||LA46_0==RULE_ANY_OTHER) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalCucumber.g:2580:3: rule__Text__LinesAssignment_1
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Text__LinesAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAccess().getLinesAssignment_1()); 
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
    // $ANTLR end "rule__Text__Group__1__Impl"


    // $ANTLR start "rule__TextLine__Group__0"
    // InternalCucumber.g:2589:1: rule__TextLine__Group__0 : rule__TextLine__Group__0__Impl rule__TextLine__Group__1 ;
    public final void rule__TextLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2593:1: ( rule__TextLine__Group__0__Impl rule__TextLine__Group__1 )
            // InternalCucumber.g:2594:2: rule__TextLine__Group__0__Impl rule__TextLine__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__TextLine__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TextLine__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextLine__Group__0"


    // $ANTLR start "rule__TextLine__Group__0__Impl"
    // InternalCucumber.g:2601:1: rule__TextLine__Group__0__Impl : ( () ) ;
    public final void rule__TextLine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2605:1: ( ( () ) )
            // InternalCucumber.g:2606:1: ( () )
            {
            // InternalCucumber.g:2606:1: ( () )
            // InternalCucumber.g:2607:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextLineAccess().getTextLineAction_0()); 
            }
            // InternalCucumber.g:2608:2: ()
            // InternalCucumber.g:2608:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextLineAccess().getTextLineAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextLine__Group__0__Impl"


    // $ANTLR start "rule__TextLine__Group__1"
    // InternalCucumber.g:2616:1: rule__TextLine__Group__1 : rule__TextLine__Group__1__Impl rule__TextLine__Group__2 ;
    public final void rule__TextLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2620:1: ( rule__TextLine__Group__1__Impl rule__TextLine__Group__2 )
            // InternalCucumber.g:2621:2: rule__TextLine__Group__1__Impl rule__TextLine__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__TextLine__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TextLine__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextLine__Group__1"


    // $ANTLR start "rule__TextLine__Group__1__Impl"
    // InternalCucumber.g:2628:1: rule__TextLine__Group__1__Impl : ( ( rule__TextLine__ValueAssignment_1 ) ) ;
    public final void rule__TextLine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2632:1: ( ( ( rule__TextLine__ValueAssignment_1 ) ) )
            // InternalCucumber.g:2633:1: ( ( rule__TextLine__ValueAssignment_1 ) )
            {
            // InternalCucumber.g:2633:1: ( ( rule__TextLine__ValueAssignment_1 ) )
            // InternalCucumber.g:2634:2: ( rule__TextLine__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextLineAccess().getValueAssignment_1()); 
            }
            // InternalCucumber.g:2635:2: ( rule__TextLine__ValueAssignment_1 )
            // InternalCucumber.g:2635:3: rule__TextLine__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TextLine__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextLineAccess().getValueAssignment_1()); 
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
    // $ANTLR end "rule__TextLine__Group__1__Impl"


    // $ANTLR start "rule__TextLine__Group__2"
    // InternalCucumber.g:2643:1: rule__TextLine__Group__2 : rule__TextLine__Group__2__Impl ;
    public final void rule__TextLine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2647:1: ( rule__TextLine__Group__2__Impl )
            // InternalCucumber.g:2648:2: rule__TextLine__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextLine__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextLine__Group__2"


    // $ANTLR start "rule__TextLine__Group__2__Impl"
    // InternalCucumber.g:2654:1: rule__TextLine__Group__2__Impl : ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) ) ;
    public final void rule__TextLine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2658:1: ( ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) ) )
            // InternalCucumber.g:2659:1: ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) )
            {
            // InternalCucumber.g:2659:1: ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) )
            // InternalCucumber.g:2660:2: ( ( RULE_EOL ) ) ( ( RULE_EOL )* )
            {
            // InternalCucumber.g:2660:2: ( ( RULE_EOL ) )
            // InternalCucumber.g:2661:3: ( RULE_EOL )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextLineAccess().getEOLTerminalRuleCall_2()); 
            }
            // InternalCucumber.g:2662:3: ( RULE_EOL )
            // InternalCucumber.g:2662:4: RULE_EOL
            {
            match(input,RULE_EOL,FOLLOW_10); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextLineAccess().getEOLTerminalRuleCall_2()); 
            }

            }

            // InternalCucumber.g:2665:2: ( ( RULE_EOL )* )
            // InternalCucumber.g:2666:3: ( RULE_EOL )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextLineAccess().getEOLTerminalRuleCall_2()); 
            }
            // InternalCucumber.g:2667:3: ( RULE_EOL )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_EOL) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalCucumber.g:2667:4: RULE_EOL
            	    {
            	    match(input,RULE_EOL,FOLLOW_10); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextLineAccess().getEOLTerminalRuleCall_2()); 
            }

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
    // $ANTLR end "rule__TextLine__Group__2__Impl"


    // $ANTLR start "rule__TEXT_VALUE__Group__0"
    // InternalCucumber.g:2677:1: rule__TEXT_VALUE__Group__0 : rule__TEXT_VALUE__Group__0__Impl rule__TEXT_VALUE__Group__1 ;
    public final void rule__TEXT_VALUE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2681:1: ( rule__TEXT_VALUE__Group__0__Impl rule__TEXT_VALUE__Group__1 )
            // InternalCucumber.g:2682:2: rule__TEXT_VALUE__Group__0__Impl rule__TEXT_VALUE__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__TEXT_VALUE__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TEXT_VALUE__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TEXT_VALUE__Group__0"


    // $ANTLR start "rule__TEXT_VALUE__Group__0__Impl"
    // InternalCucumber.g:2689:1: rule__TEXT_VALUE__Group__0__Impl : ( ruleTEXT_LITERAL ) ;
    public final void rule__TEXT_VALUE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2693:1: ( ( ruleTEXT_LITERAL ) )
            // InternalCucumber.g:2694:1: ( ruleTEXT_LITERAL )
            {
            // InternalCucumber.g:2694:1: ( ruleTEXT_LITERAL )
            // InternalCucumber.g:2695:2: ruleTEXT_LITERAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTEXT_VALUEAccess().getTEXT_LITERALParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTEXT_LITERAL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTEXT_VALUEAccess().getTEXT_LITERALParserRuleCall_0()); 
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
    // $ANTLR end "rule__TEXT_VALUE__Group__0__Impl"


    // $ANTLR start "rule__TEXT_VALUE__Group__1"
    // InternalCucumber.g:2704:1: rule__TEXT_VALUE__Group__1 : rule__TEXT_VALUE__Group__1__Impl ;
    public final void rule__TEXT_VALUE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2708:1: ( rule__TEXT_VALUE__Group__1__Impl )
            // InternalCucumber.g:2709:2: rule__TEXT_VALUE__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TEXT_VALUE__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TEXT_VALUE__Group__1"


    // $ANTLR start "rule__TEXT_VALUE__Group__1__Impl"
    // InternalCucumber.g:2715:1: rule__TEXT_VALUE__Group__1__Impl : ( ( ruleTEXT_LITERAL )* ) ;
    public final void rule__TEXT_VALUE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2719:1: ( ( ( ruleTEXT_LITERAL )* ) )
            // InternalCucumber.g:2720:1: ( ( ruleTEXT_LITERAL )* )
            {
            // InternalCucumber.g:2720:1: ( ( ruleTEXT_LITERAL )* )
            // InternalCucumber.g:2721:2: ( ruleTEXT_LITERAL )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTEXT_VALUEAccess().getTEXT_LITERALParserRuleCall_1()); 
            }
            // InternalCucumber.g:2722:2: ( ruleTEXT_LITERAL )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=RULE_WORD && LA48_0<=RULE_STRING)||LA48_0==RULE_ANY_OTHER) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalCucumber.g:2722:3: ruleTEXT_LITERAL
            	    {
            	    pushFollow(FOLLOW_31);
            	    ruleTEXT_LITERAL();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTEXT_VALUEAccess().getTEXT_LITERALParserRuleCall_1()); 
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
    // $ANTLR end "rule__TEXT_VALUE__Group__1__Impl"


    // $ANTLR start "rule__Feature__TagsAssignment_0"
    // InternalCucumber.g:2731:1: rule__Feature__TagsAssignment_0 : ( ruleTag ) ;
    public final void rule__Feature__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2735:1: ( ( ruleTag ) )
            // InternalCucumber.g:2736:2: ( ruleTag )
            {
            // InternalCucumber.g:2736:2: ( ruleTag )
            // InternalCucumber.g:2737:3: ruleTag
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getTagsTagParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getTagsTagParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Feature__TagsAssignment_0"


    // $ANTLR start "rule__Feature__TitleAssignment_2"
    // InternalCucumber.g:2746:1: rule__Feature__TitleAssignment_2 : ( ruleTitle ) ;
    public final void rule__Feature__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2750:1: ( ( ruleTitle ) )
            // InternalCucumber.g:2751:2: ( ruleTitle )
            {
            // InternalCucumber.g:2751:2: ( ruleTitle )
            // InternalCucumber.g:2752:3: ruleTitle
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getTitleTitleParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTitle();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getTitleTitleParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Feature__TitleAssignment_2"


    // $ANTLR start "rule__Feature__NarrativeAssignment_4"
    // InternalCucumber.g:2761:1: rule__Feature__NarrativeAssignment_4 : ( ruleNarrative ) ;
    public final void rule__Feature__NarrativeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2765:1: ( ( ruleNarrative ) )
            // InternalCucumber.g:2766:2: ( ruleNarrative )
            {
            // InternalCucumber.g:2766:2: ( ruleNarrative )
            // InternalCucumber.g:2767:3: ruleNarrative
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getNarrativeNarrativeParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNarrative();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getNarrativeNarrativeParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Feature__NarrativeAssignment_4"


    // $ANTLR start "rule__Feature__BackgroundAssignment_5"
    // InternalCucumber.g:2776:1: rule__Feature__BackgroundAssignment_5 : ( ruleBackground ) ;
    public final void rule__Feature__BackgroundAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2780:1: ( ( ruleBackground ) )
            // InternalCucumber.g:2781:2: ( ruleBackground )
            {
            // InternalCucumber.g:2781:2: ( ruleBackground )
            // InternalCucumber.g:2782:3: ruleBackground
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getBackgroundBackgroundParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBackground();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getBackgroundBackgroundParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Feature__BackgroundAssignment_5"


    // $ANTLR start "rule__Feature__ScenariosAssignment_6"
    // InternalCucumber.g:2791:1: rule__Feature__ScenariosAssignment_6 : ( ruleAbstractScenario ) ;
    public final void rule__Feature__ScenariosAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2795:1: ( ( ruleAbstractScenario ) )
            // InternalCucumber.g:2796:2: ( ruleAbstractScenario )
            {
            // InternalCucumber.g:2796:2: ( ruleAbstractScenario )
            // InternalCucumber.g:2797:3: ruleAbstractScenario
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getScenariosAbstractScenarioParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAbstractScenario();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getScenariosAbstractScenarioParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__Feature__ScenariosAssignment_6"


    // $ANTLR start "rule__Background__TagsAssignment_0"
    // InternalCucumber.g:2806:1: rule__Background__TagsAssignment_0 : ( ruleTag ) ;
    public final void rule__Background__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2810:1: ( ( ruleTag ) )
            // InternalCucumber.g:2811:2: ( ruleTag )
            {
            // InternalCucumber.g:2811:2: ( ruleTag )
            // InternalCucumber.g:2812:3: ruleTag
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBackgroundAccess().getTagsTagParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBackgroundAccess().getTagsTagParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Background__TagsAssignment_0"


    // $ANTLR start "rule__Background__TitleAssignment_2"
    // InternalCucumber.g:2821:1: rule__Background__TitleAssignment_2 : ( ruleTitle ) ;
    public final void rule__Background__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2825:1: ( ( ruleTitle ) )
            // InternalCucumber.g:2826:2: ( ruleTitle )
            {
            // InternalCucumber.g:2826:2: ( ruleTitle )
            // InternalCucumber.g:2827:3: ruleTitle
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBackgroundAccess().getTitleTitleParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTitle();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBackgroundAccess().getTitleTitleParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Background__TitleAssignment_2"


    // $ANTLR start "rule__Background__NarrativeAssignment_4"
    // InternalCucumber.g:2836:1: rule__Background__NarrativeAssignment_4 : ( ruleNarrative ) ;
    public final void rule__Background__NarrativeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2840:1: ( ( ruleNarrative ) )
            // InternalCucumber.g:2841:2: ( ruleNarrative )
            {
            // InternalCucumber.g:2841:2: ( ruleNarrative )
            // InternalCucumber.g:2842:3: ruleNarrative
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBackgroundAccess().getNarrativeNarrativeParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNarrative();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBackgroundAccess().getNarrativeNarrativeParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Background__NarrativeAssignment_4"


    // $ANTLR start "rule__Background__StepsAssignment_5"
    // InternalCucumber.g:2851:1: rule__Background__StepsAssignment_5 : ( ruleStep ) ;
    public final void rule__Background__StepsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2855:1: ( ( ruleStep ) )
            // InternalCucumber.g:2856:2: ( ruleStep )
            {
            // InternalCucumber.g:2856:2: ( ruleStep )
            // InternalCucumber.g:2857:3: ruleStep
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Background__StepsAssignment_5"


    // $ANTLR start "rule__Scenario__TagsAssignment_0"
    // InternalCucumber.g:2866:1: rule__Scenario__TagsAssignment_0 : ( ruleTag ) ;
    public final void rule__Scenario__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2870:1: ( ( ruleTag ) )
            // InternalCucumber.g:2871:2: ( ruleTag )
            {
            // InternalCucumber.g:2871:2: ( ruleTag )
            // InternalCucumber.g:2872:3: ruleTag
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScenarioAccess().getTagsTagParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScenarioAccess().getTagsTagParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Scenario__TagsAssignment_0"


    // $ANTLR start "rule__Scenario__TitleAssignment_2"
    // InternalCucumber.g:2881:1: rule__Scenario__TitleAssignment_2 : ( ruleTitle ) ;
    public final void rule__Scenario__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2885:1: ( ( ruleTitle ) )
            // InternalCucumber.g:2886:2: ( ruleTitle )
            {
            // InternalCucumber.g:2886:2: ( ruleTitle )
            // InternalCucumber.g:2887:3: ruleTitle
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScenarioAccess().getTitleTitleParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTitle();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScenarioAccess().getTitleTitleParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Scenario__TitleAssignment_2"


    // $ANTLR start "rule__Scenario__NarrativeAssignment_4"
    // InternalCucumber.g:2896:1: rule__Scenario__NarrativeAssignment_4 : ( ruleNarrative ) ;
    public final void rule__Scenario__NarrativeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2900:1: ( ( ruleNarrative ) )
            // InternalCucumber.g:2901:2: ( ruleNarrative )
            {
            // InternalCucumber.g:2901:2: ( ruleNarrative )
            // InternalCucumber.g:2902:3: ruleNarrative
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScenarioAccess().getNarrativeNarrativeParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNarrative();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScenarioAccess().getNarrativeNarrativeParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Scenario__NarrativeAssignment_4"


    // $ANTLR start "rule__Scenario__StepsAssignment_5"
    // InternalCucumber.g:2911:1: rule__Scenario__StepsAssignment_5 : ( ruleStep ) ;
    public final void rule__Scenario__StepsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2915:1: ( ( ruleStep ) )
            // InternalCucumber.g:2916:2: ( ruleStep )
            {
            // InternalCucumber.g:2916:2: ( ruleStep )
            // InternalCucumber.g:2917:3: ruleStep
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Scenario__StepsAssignment_5"


    // $ANTLR start "rule__ScenarioOutline__TagsAssignment_0"
    // InternalCucumber.g:2926:1: rule__ScenarioOutline__TagsAssignment_0 : ( ruleTag ) ;
    public final void rule__ScenarioOutline__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2930:1: ( ( ruleTag ) )
            // InternalCucumber.g:2931:2: ( ruleTag )
            {
            // InternalCucumber.g:2931:2: ( ruleTag )
            // InternalCucumber.g:2932:3: ruleTag
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScenarioOutlineAccess().getTagsTagParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScenarioOutlineAccess().getTagsTagParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__ScenarioOutline__TagsAssignment_0"


    // $ANTLR start "rule__ScenarioOutline__TitleAssignment_3"
    // InternalCucumber.g:2941:1: rule__ScenarioOutline__TitleAssignment_3 : ( ruleTitle ) ;
    public final void rule__ScenarioOutline__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2945:1: ( ( ruleTitle ) )
            // InternalCucumber.g:2946:2: ( ruleTitle )
            {
            // InternalCucumber.g:2946:2: ( ruleTitle )
            // InternalCucumber.g:2947:3: ruleTitle
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScenarioOutlineAccess().getTitleTitleParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTitle();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScenarioOutlineAccess().getTitleTitleParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__ScenarioOutline__TitleAssignment_3"


    // $ANTLR start "rule__ScenarioOutline__NarrativeAssignment_5"
    // InternalCucumber.g:2956:1: rule__ScenarioOutline__NarrativeAssignment_5 : ( ruleNarrative ) ;
    public final void rule__ScenarioOutline__NarrativeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2960:1: ( ( ruleNarrative ) )
            // InternalCucumber.g:2961:2: ( ruleNarrative )
            {
            // InternalCucumber.g:2961:2: ( ruleNarrative )
            // InternalCucumber.g:2962:3: ruleNarrative
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScenarioOutlineAccess().getNarrativeNarrativeParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNarrative();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScenarioOutlineAccess().getNarrativeNarrativeParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__ScenarioOutline__NarrativeAssignment_5"


    // $ANTLR start "rule__ScenarioOutline__StepsAssignment_6"
    // InternalCucumber.g:2971:1: rule__ScenarioOutline__StepsAssignment_6 : ( ruleStep ) ;
    public final void rule__ScenarioOutline__StepsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2975:1: ( ( ruleStep ) )
            // InternalCucumber.g:2976:2: ( ruleStep )
            {
            // InternalCucumber.g:2976:2: ( ruleStep )
            // InternalCucumber.g:2977:3: ruleStep
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScenarioOutlineAccess().getStepsStepParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScenarioOutlineAccess().getStepsStepParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__ScenarioOutline__StepsAssignment_6"


    // $ANTLR start "rule__ScenarioOutline__ExamplesAssignment_7"
    // InternalCucumber.g:2986:1: rule__ScenarioOutline__ExamplesAssignment_7 : ( ruleExample ) ;
    public final void rule__ScenarioOutline__ExamplesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2990:1: ( ( ruleExample ) )
            // InternalCucumber.g:2991:2: ( ruleExample )
            {
            // InternalCucumber.g:2991:2: ( ruleExample )
            // InternalCucumber.g:2992:3: ruleExample
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScenarioOutlineAccess().getExamplesExampleParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExample();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScenarioOutlineAccess().getExamplesExampleParserRuleCall_7_0()); 
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
    // $ANTLR end "rule__ScenarioOutline__ExamplesAssignment_7"


    // $ANTLR start "rule__Step__KeywordAssignment_0"
    // InternalCucumber.g:3001:1: rule__Step__KeywordAssignment_0 : ( RULE_STEP_KEYWORD ) ;
    public final void rule__Step__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3005:1: ( ( RULE_STEP_KEYWORD ) )
            // InternalCucumber.g:3006:2: ( RULE_STEP_KEYWORD )
            {
            // InternalCucumber.g:3006:2: ( RULE_STEP_KEYWORD )
            // InternalCucumber.g:3007:3: RULE_STEP_KEYWORD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getKeywordSTEP_KEYWORDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STEP_KEYWORD,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getKeywordSTEP_KEYWORDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Step__KeywordAssignment_0"


    // $ANTLR start "rule__Step__DescriptionAssignment_1"
    // InternalCucumber.g:3016:1: rule__Step__DescriptionAssignment_1 : ( ruleStepDescription ) ;
    public final void rule__Step__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3020:1: ( ( ruleStepDescription ) )
            // InternalCucumber.g:3021:2: ( ruleStepDescription )
            {
            // InternalCucumber.g:3021:2: ( ruleStepDescription )
            // InternalCucumber.g:3022:3: ruleStepDescription
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getDescriptionStepDescriptionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStepDescription();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getDescriptionStepDescriptionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Step__DescriptionAssignment_1"


    // $ANTLR start "rule__Step__TableAssignment_3_0"
    // InternalCucumber.g:3031:1: rule__Step__TableAssignment_3_0 : ( ruleTable ) ;
    public final void rule__Step__TableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3035:1: ( ( ruleTable ) )
            // InternalCucumber.g:3036:2: ( ruleTable )
            {
            // InternalCucumber.g:3036:2: ( ruleTable )
            // InternalCucumber.g:3037:3: ruleTable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getTableTableParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getTableTableParserRuleCall_3_0_0()); 
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
    // $ANTLR end "rule__Step__TableAssignment_3_0"


    // $ANTLR start "rule__Step__CodeAssignment_3_1"
    // InternalCucumber.g:3046:1: rule__Step__CodeAssignment_3_1 : ( ruleDocString ) ;
    public final void rule__Step__CodeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3050:1: ( ( ruleDocString ) )
            // InternalCucumber.g:3051:2: ( ruleDocString )
            {
            // InternalCucumber.g:3051:2: ( ruleDocString )
            // InternalCucumber.g:3052:3: ruleDocString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getCodeDocStringParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDocString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getCodeDocStringParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__Step__CodeAssignment_3_1"


    // $ANTLR start "rule__Example__TagsAssignment_0"
    // InternalCucumber.g:3061:1: rule__Example__TagsAssignment_0 : ( ruleTag ) ;
    public final void rule__Example__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3065:1: ( ( ruleTag ) )
            // InternalCucumber.g:3066:2: ( ruleTag )
            {
            // InternalCucumber.g:3066:2: ( ruleTag )
            // InternalCucumber.g:3067:3: ruleTag
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExampleAccess().getTagsTagParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExampleAccess().getTagsTagParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Example__TagsAssignment_0"


    // $ANTLR start "rule__Example__TitleAssignment_2"
    // InternalCucumber.g:3076:1: rule__Example__TitleAssignment_2 : ( ruleTitle ) ;
    public final void rule__Example__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3080:1: ( ( ruleTitle ) )
            // InternalCucumber.g:3081:2: ( ruleTitle )
            {
            // InternalCucumber.g:3081:2: ( ruleTitle )
            // InternalCucumber.g:3082:3: ruleTitle
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExampleAccess().getTitleTitleParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTitle();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExampleAccess().getTitleTitleParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Example__TitleAssignment_2"


    // $ANTLR start "rule__Example__NarrativeAssignment_4"
    // InternalCucumber.g:3091:1: rule__Example__NarrativeAssignment_4 : ( ruleNarrative ) ;
    public final void rule__Example__NarrativeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3095:1: ( ( ruleNarrative ) )
            // InternalCucumber.g:3096:2: ( ruleNarrative )
            {
            // InternalCucumber.g:3096:2: ( ruleNarrative )
            // InternalCucumber.g:3097:3: ruleNarrative
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExampleAccess().getNarrativeNarrativeParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNarrative();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExampleAccess().getNarrativeNarrativeParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Example__NarrativeAssignment_4"


    // $ANTLR start "rule__Example__TableAssignment_5"
    // InternalCucumber.g:3106:1: rule__Example__TableAssignment_5 : ( ruleTable ) ;
    public final void rule__Example__TableAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3110:1: ( ( ruleTable ) )
            // InternalCucumber.g:3111:2: ( ruleTable )
            {
            // InternalCucumber.g:3111:2: ( ruleTable )
            // InternalCucumber.g:3112:3: ruleTable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExampleAccess().getTableTableParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExampleAccess().getTableTableParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Example__TableAssignment_5"


    // $ANTLR start "rule__Table__RowsAssignment_1"
    // InternalCucumber.g:3121:1: rule__Table__RowsAssignment_1 : ( ruleTableRow ) ;
    public final void rule__Table__RowsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3125:1: ( ( ruleTableRow ) )
            // InternalCucumber.g:3126:2: ( ruleTableRow )
            {
            // InternalCucumber.g:3126:2: ( ruleTableRow )
            // InternalCucumber.g:3127:3: ruleTableRow
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTableRow();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Table__RowsAssignment_1"


    // $ANTLR start "rule__TableRow__ColsAssignment_1"
    // InternalCucumber.g:3136:1: rule__TableRow__ColsAssignment_1 : ( ruleTableCol ) ;
    public final void rule__TableRow__ColsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3140:1: ( ( ruleTableCol ) )
            // InternalCucumber.g:3141:2: ( ruleTableCol )
            {
            // InternalCucumber.g:3141:2: ( ruleTableCol )
            // InternalCucumber.g:3142:3: ruleTableCol
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableRowAccess().getColsTableColParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTableCol();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableRowAccess().getColsTableColParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__TableRow__ColsAssignment_1"


    // $ANTLR start "rule__TableCol__CellAssignment_1"
    // InternalCucumber.g:3151:1: rule__TableCol__CellAssignment_1 : ( RULE_TABLE_CELL ) ;
    public final void rule__TableCol__CellAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3155:1: ( ( RULE_TABLE_CELL ) )
            // InternalCucumber.g:3156:2: ( RULE_TABLE_CELL )
            {
            // InternalCucumber.g:3156:2: ( RULE_TABLE_CELL )
            // InternalCucumber.g:3157:3: RULE_TABLE_CELL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableColAccess().getCellTABLE_CELLTerminalRuleCall_1_0()); 
            }
            match(input,RULE_TABLE_CELL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableColAccess().getCellTABLE_CELLTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__TableCol__CellAssignment_1"


    // $ANTLR start "rule__DocString__TextAssignment_1_2"
    // InternalCucumber.g:3166:1: rule__DocString__TextAssignment_1_2 : ( ruleText ) ;
    public final void rule__DocString__TextAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3170:1: ( ( ruleText ) )
            // InternalCucumber.g:3171:2: ( ruleText )
            {
            // InternalCucumber.g:3171:2: ( ruleText )
            // InternalCucumber.g:3172:3: ruleText
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocStringAccess().getTextTextParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocStringAccess().getTextTextParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__DocString__TextAssignment_1_2"


    // $ANTLR start "rule__Tag__IdAssignment_0"
    // InternalCucumber.g:3181:1: rule__Tag__IdAssignment_0 : ( RULE_TAGNAME ) ;
    public final void rule__Tag__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3185:1: ( ( RULE_TAGNAME ) )
            // InternalCucumber.g:3186:2: ( RULE_TAGNAME )
            {
            // InternalCucumber.g:3186:2: ( RULE_TAGNAME )
            // InternalCucumber.g:3187:3: RULE_TAGNAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAccess().getIdTAGNAMETerminalRuleCall_0_0()); 
            }
            match(input,RULE_TAGNAME,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAccess().getIdTAGNAMETerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Tag__IdAssignment_0"


    // $ANTLR start "rule__Text__LinesAssignment_1"
    // InternalCucumber.g:3196:1: rule__Text__LinesAssignment_1 : ( ruleTextLine ) ;
    public final void rule__Text__LinesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3200:1: ( ( ruleTextLine ) )
            // InternalCucumber.g:3201:2: ( ruleTextLine )
            {
            // InternalCucumber.g:3201:2: ( ruleTextLine )
            // InternalCucumber.g:3202:3: ruleTextLine
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAccess().getLinesTextLineParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTextLine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAccess().getLinesTextLineParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Text__LinesAssignment_1"


    // $ANTLR start "rule__TextLine__ValueAssignment_1"
    // InternalCucumber.g:3211:1: rule__TextLine__ValueAssignment_1 : ( ruleTEXT_VALUE ) ;
    public final void rule__TextLine__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3215:1: ( ( ruleTEXT_VALUE ) )
            // InternalCucumber.g:3216:2: ( ruleTEXT_VALUE )
            {
            // InternalCucumber.g:3216:2: ( ruleTEXT_VALUE )
            // InternalCucumber.g:3217:3: ruleTEXT_VALUE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextLineAccess().getValueTEXT_VALUEParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTEXT_VALUE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextLineAccess().getValueTEXT_VALUEParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__TextLine__ValueAssignment_1"

    // $ANTLR start synpred2_InternalCucumber
    public final void synpred2_InternalCucumber_fragment() throws RecognitionException {   
        // InternalCucumber.g:408:5: ( rule__StepDescription__Alternatives )
        // InternalCucumber.g:408:5: rule__StepDescription__Alternatives
        {
        pushFollow(FOLLOW_2);
        rule__StepDescription__Alternatives();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalCucumber

    // $ANTLR start synpred33_InternalCucumber
    public final void synpred33_InternalCucumber_fragment() throws RecognitionException {   
        // InternalCucumber.g:985:3: ( rule__Feature__BackgroundAssignment_5 )
        // InternalCucumber.g:985:3: rule__Feature__BackgroundAssignment_5
        {
        pushFollow(FOLLOW_2);
        rule__Feature__BackgroundAssignment_5();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalCucumber

    // Delegated rules

    public final boolean synpred33_InternalCucumber() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalCucumber_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalCucumber() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalCucumber_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA31 dfa31 = new DFA31(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\1\1\uffff\1\4\10\uffff";
    static final String dfa_3s = "\1\4\1\uffff\1\4\1\0\1\uffff\6\0";
    static final String dfa_4s = "\1\35\1\uffff\1\35\1\0\1\uffff\6\0";
    static final String dfa_5s = "\1\uffff\1\2\2\uffff\1\1\6\uffff";
    static final String dfa_6s = "\3\uffff\1\4\1\uffff\1\0\1\1\1\5\1\2\1\6\1\3}>";
    static final String[] dfa_7s = {
            "\4\4\1\2\1\3\1\uffff\2\1\12\uffff\3\1\1\uffff\1\1\1\uffff\1\1",
            "",
            "\1\7\1\10\1\11\1\12\1\5\1\6\1\uffff\2\4\12\uffff\3\4\1\uffff\1\4\1\uffff\1\4",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 408:4: ( rule__StepDescription__Alternatives )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_5 = input.LA(1);

                         
                        int index2_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalCucumber()) ) {s = 4;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_6 = input.LA(1);

                         
                        int index2_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalCucumber()) ) {s = 4;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_8 = input.LA(1);

                         
                        int index2_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalCucumber()) ) {s = 4;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_10 = input.LA(1);

                         
                        int index2_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalCucumber()) ) {s = 4;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_10);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_3 = input.LA(1);

                         
                        int index2_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalCucumber()) ) {s = 4;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_3);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_7 = input.LA(1);

                         
                        int index2_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalCucumber()) ) {s = 4;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA2_9 = input.LA(1);

                         
                        int index2_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalCucumber()) ) {s = 4;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\6\uffff";
    static final String dfa_9s = "\2\11\3\uffff\1\11";
    static final String dfa_10s = "\2\31\3\uffff\1\31";
    static final String dfa_11s = "\2\uffff\1\1\1\2\1\3\1\uffff";
    static final String dfa_12s = "\6\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\15\uffff\1\4\1\2\1\3",
            "\1\1\1\uffff\1\5\13\uffff\1\4\1\2\1\3",
            "",
            "",
            "",
            "\1\1\15\uffff\1\4\1\2\1\3"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "542:1: rule__AbstractScenario__Alternatives : ( ( ruleScenario ) | ( ruleScenarioOutline ) | ( ruleBackground ) );";
        }
    }
    static final String dfa_14s = "\u01cf\uffff";
    static final String dfa_15s = "\35\uffff\6\3\5\uffff\7\3\14\uffff\7\3\21\uffff\1\3\2\uffff\23\3\1\uffff\1\3\4\uffff\1\3\40\uffff\7\3\3\uffff\1\3\5\uffff\1\3\46\uffff\1\3\4\uffff\10\3\37\uffff\1\3\5\uffff\2\3\4\uffff\2\3\41\uffff\1\3\5\uffff\1\3\32\uffff\1\3\55\uffff\1\3\135\uffff";
    static final String dfa_16s = "\2\11\1\4\1\uffff\1\11\51\4\1\10\1\14\1\13\1\4\1\32\16\4\1\10\1\4\1\11\1\14\1\13\15\4\1\10\1\14\1\13\6\4\1\10\14\4\1\11\1\10\4\4\1\10\35\4\1\14\1\13\7\4\1\10\1\14\1\13\1\14\1\10\5\4\1\10\7\4\6\0\23\4\6\0\1\10\4\4\1\10\6\4\1\10\1\14\1\13\1\4\1\14\1\13\6\4\1\uffff\22\4\1\14\1\10\5\4\2\10\4\4\2\10\22\4\1\10\1\14\1\13\10\4\1\14\1\13\1\4\1\14\1\10\5\4\1\10\16\4\1\10\1\4\1\11\1\14\1\13\7\4\1\10\1\14\1\13\2\4\1\10\1\14\1\13\6\4\1\10\14\4\1\11\1\10\4\4\1\10\13\4\1\14\1\10\1\14\1\13\7\4\1\10\1\14\1\13\1\14\1\10\5\4\1\10\7\4\1\14\1\13\1\10\4\4\1\10\6\4\1\10\1\14\1\13\1\4\1\14\1\13\6\4\1\0\1\14\1\10\5\4\2\10\4\4\2\10\7\4\1\14\1\13\1\4\1\14\1\10\5\4\1\10\1\4\1\10\1\14\1\13\1\4\1\10";
    static final String dfa_17s = "\2\31\1\13\1\uffff\1\31\20\13\1\11\7\13\6\35\5\13\7\35\1\34\2\13\1\32\10\13\7\35\1\11\1\31\1\34\1\13\1\35\14\13\1\35\1\34\1\13\23\35\2\31\4\13\1\31\13\13\1\11\20\13\1\11\1\34\1\13\10\35\1\34\1\13\1\34\1\31\4\13\1\35\1\31\7\13\6\0\13\13\1\11\7\13\6\0\1\31\4\13\1\31\7\35\1\34\1\13\1\35\1\34\1\13\1\35\5\13\1\uffff\7\13\6\35\5\13\1\34\1\31\4\13\1\35\2\31\4\13\2\31\14\13\7\35\1\34\11\13\1\34\1\13\1\35\1\34\1\31\4\13\1\35\1\31\10\13\7\35\1\11\1\33\1\34\1\13\1\35\4\13\1\14\1\13\1\31\1\34\1\13\1\35\1\13\1\35\1\34\1\13\23\35\2\33\4\13\1\33\6\13\1\14\4\13\1\34\1\31\1\34\1\13\10\35\1\34\1\13\1\34\1\33\4\13\1\35\1\33\6\13\1\14\1\34\1\13\1\33\4\13\1\33\7\35\1\34\1\13\1\35\1\34\1\13\1\35\1\14\4\13\1\0\1\34\1\33\4\13\1\35\2\33\4\13\2\33\6\13\1\14\1\34\1\13\1\35\1\34\1\33\4\13\1\35\1\33\1\14\1\33\1\34\1\13\1\35\1\33";
    static final String dfa_18s = "\3\uffff\1\2\u00db\uffff\1\1\u00ef\uffff";
    static final String dfa_19s = "\u00a8\uffff\1\0\1\2\1\3\1\4\1\5\1\6\23\uffff\1\7\1\10\1\11\1\12\1\13\1\14\u00e0\uffff\1\1\47\uffff}>";
    static final String[] dfa_20s = {
            "\1\1\15\uffff\1\2\2\3",
            "\1\1\1\uffff\1\4\13\uffff\1\2\2\3",
            "\1\5\1\6\1\7\1\10\3\uffff\1\11",
            "",
            "\1\1\15\uffff\1\2\2\3",
            "\1\12\1\13\1\14\1\15\1\16\1\17\1\uffff\1\11",
            "\1\12\1\13\1\14\1\15\1\16\1\17\1\uffff\1\11",
            "\1\12\1\13\1\14\1\15\1\16\1\17\1\uffff\1\11",
            "\1\12\1\13\1\14\1\15\1\16\1\17\1\uffff\1\11",
            "\1\21\1\22\1\23\1\24\1\25\2\uffff\1\20",
            "\1\12\1\13\1\14\1\15\1\16\1\17\1\uffff\1\11",
            "\1\12\1\13\1\14\1\15\1\16\1\17\1\uffff\1\11",
            "\1\12\1\13\1\14\1\15\1\16\1\17\1\uffff\1\11",
            "\1\12\1\13\1\14\1\15\1\16\1\17\1\uffff\1\11",
            "\1\12\1\13\1\14\1\15\1\16\1\17\1\uffff\1\11",
            "\1\12\1\13\1\14\1\15\1\16\1\17\1\uffff\1\11",
            "\1\21\1\22\1\23\1\24\1\25\2\uffff\1\20",
            "\1\26\1\27\1\30\1\31\1\32\1\33\1\uffff\1\34",
            "\1\26\1\27\1\30\1\31\1\32\1\33\1\uffff\1\34",
            "\1\26\1\27\1\30\1\31\1\32\1\33\1\uffff\1\34",
            "\1\26\1\27\1\30\1\31\1\32\1\33\1\uffff\1\34",
            "\1\35\1\36\1\37\1\40\1\41\1\42",
            "\1\26\1\27\1\30\1\31\1\32\1\33\1\uffff\1\34",
            "\1\26\1\27\1\30\1\31\1\32\1\33\1\uffff\1\34",
            "\1\26\1\27\1\30\1\31\1\32\1\33\1\uffff\1\34",
            "\1\26\1\27\1\30\1\31\1\32\1\33\1\uffff\1\34",
            "\1\26\1\27\1\30\1\31\1\32\1\33\1\uffff\1\34",
            "\1\26\1\27\1\30\1\31\1\32\1\33\1\uffff\1\34",
            "\1\44\1\45\1\46\1\47\1\25\2\uffff\1\43",
            "\1\50\1\51\1\52\1\53\1\54\1\55\1\uffff\1\56\1\57\12\uffff\1\63\1\61\1\62\3\uffff\1\60",
            "\1\50\1\51\1\52\1\53\1\54\1\55\1\uffff\1\56\1\57\12\uffff\1\63\1\61\1\62\3\uffff\1\60",
            "\1\50\1\51\1\52\1\53\1\54\1\55\1\uffff\1\56\1\57\12\uffff\1\63\1\61\1\62\3\uffff\1\60",
            "\1\50\1\51\1\52\1\53\1\54\1\55\1\uffff\1\56\1\57\12\uffff\1\63\1\61\1\62\3\uffff\1\60",
            "\1\50\1\51\1\52\1\53\1\54\1\55\1\uffff\1\56\1\57\12\uffff\1\63\1\61\1\62\3\uffff\1\60",
            "\1\50\1\51\1\52\1\53\1\54\1\55\1\uffff\1\56\1\57\12\uffff\1\63\1\61\1\62\3\uffff\1\60",
            "\1\44\1\45\1\46\1\47\1\25\2\uffff\1\43",
            "\1\64\1\65\1\66\1\67\1\70\1\71\1\uffff\1\72",
            "\1\64\1\65\1\66\1\67\1\70\1\71\1\uffff\1\72",
            "\1\64\1\65\1\66\1\67\1\70\1\71\1\uffff\1\72",
            "\1\64\1\65\1\66\1\67\1\70\1\71\1\uffff\1\72",
            "\1\50\1\51\1\52\1\53\1\54\1\55\1\uffff\1\56\1\57\12\uffff\1\63\1\61\1\62\3\uffff\1\60",
            "\1\50\1\51\1\52\1\53\1\54\1\55\1\uffff\1\56\1\57\12\uffff\1\63\1\61\1\62\3\uffff\1\60",
            "\1\50\1\51\1\52\1\53\1\54\1\55\1\uffff\1\56\1\57\12\uffff\1\63\1\61\1\62\3\uffff\1\60",
            "\1\50\1\51\1\52\1\53\1\54\1\55\1\uffff\1\56\1\57\12\uffff\1\63\1\61\1\62\3\uffff\1\60",
            "\1\75\1\76\1\77\1\100\1\73\1\74\1\uffff\1\56\1\57\12\uffff\1\63\1\61\1\62\3\uffff\1\60",
            "\1\50\1\51\1\52\1\53\1\54\1\55\1\uffff\1\101\1\57\12\uffff\1\63\1\61\1\62\3\uffff\1\60",
            "\1\102\1\103\1\uffff\1\56\1\57\12\uffff\1\63\1\61\1\62\3\uffff\1\60",
            "\1\104\17\uffff\1\105",
            "\1\106",
            "\1\107\1\110\1\111\1\112\3\uffff\1\113",
            "\1\114",
            "\1\115\1\116\1\117\1\120\3\uffff\1\121",
            "\1\64\1\65\1\66\1\67\1\70\1\71\1\uffff\1\72",
            "\1\64\1\65\1\66\1\67\1\70\1\71\1\uffff\1\72",
            "\1\64\1\65\1\66\1\67\1\70\1\71\1\uffff\1\72",
            "\1\64\1\65\1\66\1\67\1\70\1\71\1\uffff\1\72",
            "\1\64\1\65\1\66\1\67\1\70\1\71\1\uffff\1\72",
            "\1\64\1\65\1\66\1\67\1\70\1\71\1\uffff\1\72",
            "\1\44\1\45\1\46\1\47\1\25\2\uffff\1\122",
            "\1\130\1\131\1\132\1\133\1\126\1\127\1\uffff\1\123\1\124\12\uffff\1\63\1\61\1\62\3\uffff\1\125",
            "\1\137\1\140\1\141\1\142\1\136\1\135\1\uffff\1\134\1\124\12\uffff\1\63\1\61\1\62\3\uffff\1\125",
            "\1\137\1\140\1\141\1\142\1\136\1\135\1\uffff\1\123\1\124\12\uffff\1\63\1\61\1\62\3\uffff\1\125",
            "\1\137\1\140\1\141\1\142\1\136\1\135\1\uffff\1\123\1\124\12\uffff\1\63\1\61\1\62\3\uffff\1\125",
            "\1\137\1\140\1\141\1\142\1\136\1\135\1\uffff\1\123\1\124\12\uffff\1\63\1\61\1\62\3\uffff\1\125",
            "\1\137\1\140\1\141\1\142\1\136\1\135\1\uffff\1\123\1\124\12\uffff\1\63\1\61\1\62\3\uffff\1\125",
            "\1\102\1\103\1\uffff\1\56\1\57\12\uffff\1\63\1\61\1\62\3\uffff\1\60",
            "\1\143\1\144\1\145\1\146\1\147\1\150",
            "\1\103\1\uffff\1\151\13\uffff\1\63\1\61\1\62",
            "\1\104\17\uffff\1\105",
            "\1\152",
            "\1\153\1\154\1\155\3\uffff\1\156\22\uffff\1\157",
            "\1\160\1\161\1\162\1\163\1\164\1\165\1\uffff\1\113",
            "\1\160\1\161\1\162\1\163\1\164\1\165\1\uffff\1\113",
            "\1\160\1\161\1\162\1\163\1\164\1\165\1\uffff\1\113",
            "\1\160\1\161\1\162\1\163\1\164\1\165\1\uffff\1\113",
            "\1\167\1\170\1\171\1\172\1\173\2\uffff\1\166",
            "\1\174\1\175\1\176\1\177\3\uffff\1\u0080",
            "\1\u0081\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\uffff\1\121",
            "\1\u0081\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\uffff\1\121",
            "\1\u0081\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\uffff\1\121",
            "\1\u0081\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\uffff\1\121",
            "\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\2\uffff\1\u0087",
            "\1\44\1\45\1\46\1\47\1\25\2\uffff\1\122",
            "\1\102\1\103\1\uffff\1\123\1\124\12\uffff\1\63\1\61\1\62\3\uffff\1\125",
            "\1\u008d\17\uffff\1\u008e",
            "\1\u008f",
            "\1\130\1\131\1\132\1\133\1\126\1\127\1\uffff\1\123\1\124\12\uffff\1\63\1\61\1\62\3\uffff\1\125",
            "\1\137\1\140\1\141\1\142\1\136\1\135\1\uffff\1\134\1\124\12\uffff\1\63\1\61\1\62\3\uffff\1\125",
            "\1\137\1\140\1\141\1\142\1\136\1\135\1\uffff\1\123\1\124\12\uffff\1\63\1\61\1\62\3\uffff\1\125",
            "\1\137\1\140\1\141\1\142\1\136\1\135\1\uffff\1\123\1\124\12\uffff\1\63\1\61\1\62\3\uffff\1\125",
            "\1\137\1\140\1\141\1\142\1\136\1\135\1\uffff\1\123\1\124\12\uffff\1\63\1\61\1\62\3\uffff\1\125",
            "\1\137\1\140\1\141\1\142\1\136\1\135\1\uffff\1\123\1\124\12\uffff\1\63\1\61\1\62\3\uffff\1\125",
            "\1\102\1\103\1\uffff\1\123\1\124\12\uffff\1\63\1\61\1\62\3\uffff\1\125",
            "\1\137\1\140\1\141\1\142\1\136\1\135\1\uffff\1\134\1\124\12\uffff\1\63\1\61\1\62\3\uffff\1\125",
            "\1\130\1\131\1\132\1\133\1\126\1\127\1\uffff\1\123\1\124\12\uffff\1\63\1\61\1\62\3\uffff\1\125",
            "\1\137\1\140\1\141\1\142\1\136\1\135\1\uffff\1\123\1\124\12\uffff\1\63\1\61\1\62\3\uffff\1\125",
            "\1\137\1\140\1\141\1\142\1\136\1\135\1\uffff\1\123\1\124\12\uffff\1\63\1\61\1\62\3\uffff\1\125",
            "\1\137\1\140\1\141\1\142\1\136\1\135\1\uffff\1\123\1\124\12\uffff\1\63\1\61\1\62\3\uffff\1\125",
            "\1\137\1\140\1\141\1\142\1\136\1\135\1\uffff\1\123\1\124\12\uffff\1\63\1\61\1\62\3\uffff\1\125",
            "\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\uffff\1\u0096\1\u0097\12\uffff\1\63\1\61\1\62\3\uffff\1\u0098",
            "\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\uffff\1\u0096\1\u0097\12\uffff\1\63\1\61\1\62\3\uffff\1\u0098",
            "\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\uffff\1\u0096\1\u0097\12\uffff\1\63\1\61\1\62\3\uffff\1\u0098",
            "\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\uffff\1\u0096\1\u0097\12\uffff\1\63\1\61\1\62\3\uffff\1\u0098",
            "\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\uffff\1\u0096\1\u0097\12\uffff\1\63\1\61\1\62\3\uffff\1\u0098",
            "\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\uffff\1\u0096\1\u0097\12\uffff\1\63\1\61\1\62\3\uffff\1\u0098",
            "\1\103\15\uffff\1\63\1\61\1\62",
            "\1\102\1\103\1\uffff\1\u009a\1\u0099\12\uffff\1\63\1\61\1\62",
            "\1\u009b\1\u009c\1\u009d\3\uffff\1\u009e\1\u009f",
            "\1\u009b\1\u009c\1\u009d\3\uffff\1\u009e\1\u009f",
            "\1\u009b\1\u009c\1\u009d\3\uffff\1\u009e\1\u009f",
            "\1\u009b\1\u009c\1\u009d\3\uffff\1\u009e\1\u009f",
            "\1\102\1\103\1\uffff\1\u00a0\13\uffff\1\63\1\61\1\62",
            "\1\160\1\161\1\162\1\163\1\164\1\165\1\uffff\1\113",
            "\1\160\1\161\1\162\1\163\1\164\1\165\1\uffff\1\113",
            "\1\160\1\161\1\162\1\163\1\164\1\165\1\uffff\1\113",
            "\1\160\1\161\1\162\1\163\1\164\1\165\1\uffff\1\113",
            "\1\160\1\161\1\162\1\163\1\164\1\165\1\uffff\1\113",
            "\1\160\1\161\1\162\1\163\1\164\1\165\1\uffff\1\113",
            "\1\167\1\170\1\171\1\172\1\173\2\uffff\1\166",
            "\1\u00a1\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\u00a6\1\uffff\1\u00a7",
            "\1\u00a1\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\u00a6\1\uffff\1\u00a7",
            "\1\u00a1\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\u00a6\1\uffff\1\u00a7",
            "\1\u00a1\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\u00a6\1\uffff\1\u00a7",
            "\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad",
            "\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\uffff\1\u0080",
            "\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\uffff\1\u0080",
            "\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\uffff\1\u0080",
            "\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\uffff\1\u0080",
            "\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\2\uffff\1\u00b4",
            "\1\u0081\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\uffff\1\121",
            "\1\u0081\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\uffff\1\121",
            "\1\u0081\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\uffff\1\121",
            "\1\u0081\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\uffff\1\121",
            "\1\u0081\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\uffff\1\121",
            "\1\u0081\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\uffff\1\121",
            "\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\2\uffff\1\u0087",
            "\1\u00ba\1\u00bb\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\uffff\1\u00c0",
            "\1\u00ba\1\u00bb\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\uffff\1\u00c0",
            "\1\u00ba\1\u00bb\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\uffff\1\u00c0",
            "\1\u00ba\1\u00bb\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\uffff\1\u00c0",
            "\1\u00c1\1\u00c2\1\u00c3\1\u00c4\1\u00c5\1\u00c6",
            "\1\u008d\17\uffff\1\u008e",
            "\1\u00c7",
            "\1\u00c8\1\u00c9\1\u00ca\3\uffff\1\u00cb\22\uffff\1\u00cc",
            "\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\uffff\1\u0096\1\u0097\12\uffff\1\63\1\61\1\62\3\uffff\1\u0098",
            "\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\uffff\1\u0096\1\u0097\12\uffff\1\63\1\61\1\62\3\uffff\1\u0098",
            "\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\uffff\1\u0096\1\u0097\12\uffff\1\63\1\61\1\62\3\uffff\1\u0098",
            "\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\uffff\1\u0096\1\u0097\12\uffff\1\63\1\61\1\62\3\uffff\1\u0098",
            "\1\u00cf\1\u00d0\1\u00d1\1\u00d2\1\u00ce\1\u00cd\1\uffff\1\u0096\1\u0097\12\uffff\1\63\1\61\1\62\3\uffff\1\u0098",
            "\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\uffff\1\u00d3\1\u0097\12\uffff\1\63\1\61\1\62\3\uffff\1\u0098",
            "\1\102\1\103\1\uffff\1\u0096\1\u0097\12\uffff\1\63\1\61\1\62\3\uffff\1\u0098",
            "\1\u00d4\17\uffff\1\u00d5",
            "\1\u00d6",
            "\1\u00d7\17\uffff\1\u00d8",
            "\1\102\1\103\1\uffff\1\u009a\13\uffff\1\63\1\61\1\62",
            "\1\u009b\1\u009c\1\u009d\3\uffff\1\u009e\1\u009f",
            "\1\u009b\1\u009c\1\u009d\3\uffff\1\u009e\1\u009f",
            "\1\u009b\1\u009c\1\u009d\3\uffff\1\u009e\1\u009f",
            "\1\u009b\1\u009c\1\u009d\3\uffff\1\u009e\1\u009f",
            "\1\153\1\154\1\155\3\uffff\1\156\1\u00d9\21\uffff\1\157",
            "\1\102\1\103\1\uffff\1\u00a0\13\uffff\1\63\1\61\1\62",
            "\1\u00a1\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\u00a6\1\uffff\1\u00a7",
            "\1\u00a1\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\u00a6\1\uffff\1\u00a7",
            "\1\u00a1\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\u00a6\1\uffff\1\u00a7",
            "\1\u00a1\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\u00a6\1\uffff\1\u00a7",
            "\1\u00a1\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\u00a6\1\uffff\1\u00a7",
            "\1\u00a1\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\u00a6\1\uffff\1\u00a7",
            "\1\u00db\1\u00dc\1\u00dd\1\u00de\1\173\2\uffff\1\u00da",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\uffff\1\u0080",
            "\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\uffff\1\u0080",
            "\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\uffff\1\u0080",
            "\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\uffff\1\u0080",
            "\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\uffff\1\u0080",
            "\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\uffff\1\u0080",
            "\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\2\uffff\1\u00b4",
            "\1\u00e0\1\u00e1\1\u00e2\1\u00e3\1\u00e4\1\u00e5\1\uffff\1\u00e6",
            "\1\u00e0\1\u00e1\1\u00e2\1\u00e3\1\u00e4\1\u00e5\1\uffff\1\u00e6",
            "\1\u00e0\1\u00e1\1\u00e2\1\u00e3\1\u00e4\1\u00e5\1\uffff\1\u00e6",
            "\1\u00e0\1\u00e1\1\u00e2\1\u00e3\1\u00e4\1\u00e5\1\uffff\1\u00e6",
            "\1\u00e7\1\u00e8\1\u00e9\1\u00ea\1\u00eb\1\u00ec",
            "\1\u00ba\1\u00bb\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\uffff\1\u00c0",
            "\1\u00ba\1\u00bb\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\uffff\1\u00c0",
            "\1\u00ba\1\u00bb\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\uffff\1\u00c0",
            "\1\u00ba\1\u00bb\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\uffff\1\u00c0",
            "\1\u00ba\1\u00bb\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\uffff\1\u00c0",
            "\1\u00ba\1\u00bb\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\uffff\1\u00c0",
            "\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u008c\2\uffff\1\u00ed",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\102\1\103\1\uffff\1\u00f3\1\u00f2\12\uffff\1\63\1\61\1\62",
            "\1\u00f4\1\u00f5\1\u00f6\3\uffff\1\u00f7\1\u00f8",
            "\1\u00f4\1\u00f5\1\u00f6\3\uffff\1\u00f7\1\u00f8",
            "\1\u00f4\1\u00f5\1\u00f6\3\uffff\1\u00f7\1\u00f8",
            "\1\u00f4\1\u00f5\1\u00f6\3\uffff\1\u00f7\1\u00f8",
            "\1\102\1\103\1\uffff\1\u00f9\13\uffff\1\63\1\61\1\62",
            "\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\uffff\1\u00d3\1\u0097\12\uffff\1\63\1\61\1\62\3\uffff\1\u0098",
            "\1\u00cf\1\u00d0\1\u00d1\1\u00d2\1\u00ce\1\u00cd\1\uffff\1\u0096\1\u0097\12\uffff\1\63\1\61\1\62\3\uffff\1\u0098",
            "\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\uffff\1\u0096\1\u0097\12\uffff\1\63\1\61\1\62\3\uffff\1\u0098",
            "\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\uffff\1\u0096\1\u0097\12\uffff\1\63\1\61\1\62\3\uffff\1\u0098",
            "\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\uffff\1\u0096\1\u0097\12\uffff\1\63\1\61\1\62\3\uffff\1\u0098",
            "\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\uffff\1\u0096\1\u0097\12\uffff\1\63\1\61\1\62\3\uffff\1\u0098",
            "\1\102\1\103\1\uffff\1\u0096\1\u0097\12\uffff\1\63\1\61\1\62\3\uffff\1\u0098",
            "\1\u00d4\17\uffff\1\u00d5",
            "\1\u00fa",
            "\1\u00fb\1\u00fc\1\u00fd\3\uffff\1\u00fe\22\uffff\1\u00ff",
            "\1\u00d7\17\uffff\1\u00d8",
            "\1\u0100",
            "\1\153\1\154\1\155\3\uffff\1\156\1\u00d9\21\uffff\1\157",
            "\1\u00db\1\u00dc\1\u00dd\1\u00de\1\173\2\uffff\1\u00da",
            "\1\u0101\1\u0102\1\u0103\1\u0104\1\u0105\1\u0106\1\uffff\1\u0107",
            "\1\u0101\1\u0102\1\u0103\1\u0104\1\u0105\1\u0106\1\uffff\1\u0107",
            "\1\u0101\1\u0102\1\u0103\1\u0104\1\u0105\1\u0106\1\uffff\1\u0107",
            "\1\u0101\1\u0102\1\u0103\1\u0104\1\u0105\1\u0106\1\uffff\1\u0107",
            "",
            "\1\u00e0\1\u00e1\1\u00e2\1\u00e3\1\u00e4\1\u00e5\1\uffff\1\u00e6",
            "\1\u00e0\1\u00e1\1\u00e2\1\u00e3\1\u00e4\1\u00e5\1\uffff\1\u00e6",
            "\1\u00e0\1\u00e1\1\u00e2\1\u00e3\1\u00e4\1\u00e5\1\uffff\1\u00e6",
            "\1\u00e0\1\u00e1\1\u00e2\1\u00e3\1\u00e4\1\u00e5\1\uffff\1\u00e6",
            "\1\u00e0\1\u00e1\1\u00e2\1\u00e3\1\u00e4\1\u00e5\1\uffff\1\u00e6",
            "\1\u00e0\1\u00e1\1\u00e2\1\u00e3\1\u00e4\1\u00e5\1\uffff\1\u00e6",
            "\1\u0109\1\u010a\1\u010b\1\u010c\1\u00b9\2\uffff\1\u0108",
            "\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112\1\uffff\1\u0113\1\u0114\16\uffff\1\u0116\1\uffff\1\u0115",
            "\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112\1\uffff\1\u0113\1\u0114\16\uffff\1\u0116\1\uffff\1\u0115",
            "\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112\1\uffff\1\u0113\1\u0114\16\uffff\1\u0116\1\uffff\1\u0115",
            "\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112\1\uffff\1\u0113\1\u0114\16\uffff\1\u0116\1\uffff\1\u0115",
            "\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112\1\uffff\1\u0113\1\u0114\16\uffff\1\u0116\1\uffff\1\u0115",
            "\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112\1\uffff\1\u0113\1\u0114\16\uffff\1\u0116\1\uffff\1\u0115",
            "\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u008c\2\uffff\1\u00ed",
            "\1\u0117\1\u0118\1\u0119\1\u011a\1\u011b\1\u011c\1\uffff\1\u011d",
            "\1\u0117\1\u0118\1\u0119\1\u011a\1\u011b\1\u011c\1\uffff\1\u011d",
            "\1\u0117\1\u0118\1\u0119\1\u011a\1\u011b\1\u011c\1\uffff\1\u011d",
            "\1\u0117\1\u0118\1\u0119\1\u011a\1\u011b\1\u011c\1\uffff\1\u011d",
            "\1\u011e\17\uffff\1\u011f",
            "\1\102\1\103\1\uffff\1\u00f3\13\uffff\1\63\1\61\1\62",
            "\1\u00f4\1\u00f5\1\u00f6\3\uffff\1\u00f7\1\u00f8",
            "\1\u00f4\1\u00f5\1\u00f6\3\uffff\1\u00f7\1\u00f8",
            "\1\u00f4\1\u00f5\1\u00f6\3\uffff\1\u00f7\1\u00f8",
            "\1\u00f4\1\u00f5\1\u00f6\3\uffff\1\u00f7\1\u00f8",
            "\1\u00c8\1\u00c9\1\u00ca\3\uffff\1\u00cb\1\u0120\21\uffff\1\u00cc",
            "\1\102\1\103\1\uffff\1\u00f9\13\uffff\1\63\1\61\1\62",
            "\1\102\1\103\1\uffff\1\u0122\1\u0121\12\uffff\1\63\1\61\1\62",
            "\1\u0123\1\u0124\1\u0125\3\uffff\1\u0126\1\u0127",
            "\1\u0123\1\u0124\1\u0125\3\uffff\1\u0126\1\u0127",
            "\1\u0123\1\u0124\1\u0125\3\uffff\1\u0126\1\u0127",
            "\1\u0123\1\u0124\1\u0125\3\uffff\1\u0126\1\u0127",
            "\1\102\1\103\1\uffff\1\u0128\13\uffff\1\63\1\61\1\62",
            "\1\102\1\103\1\uffff\1\u009a\1\u0099\12\uffff\1\63\1\61\1\62",
            "\1\u0101\1\u0102\1\u0103\1\u0104\1\u0105\1\u0106\1\uffff\1\u0107",
            "\1\u0101\1\u0102\1\u0103\1\u0104\1\u0105\1\u0106\1\uffff\1\u0107",
            "\1\u0101\1\u0102\1\u0103\1\u0104\1\u0105\1\u0106\1\uffff\1\u0107",
            "\1\u0101\1\u0102\1\u0103\1\u0104\1\u0105\1\u0106\1\uffff\1\u0107",
            "\1\u0101\1\u0102\1\u0103\1\u0104\1\u0105\1\u0106\1\uffff\1\u0107",
            "\1\u0101\1\u0102\1\u0103\1\u0104\1\u0105\1\u0106\1\uffff\1\u0107",
            "\1\u00db\1\u00dc\1\u00dd\1\u00de\1\173\2\uffff\1\u0129",
            "\1\u0109\1\u010a\1\u010b\1\u010c\1\u00b9\2\uffff\1\u0108",
            "\1\u012a\1\u012b\1\u012c\1\u012d\1\u012e\1\u012f\1\uffff\1\u0130",
            "\1\u012a\1\u012b\1\u012c\1\u012d\1\u012e\1\u012f\1\uffff\1\u0130",
            "\1\u012a\1\u012b\1\u012c\1\u012d\1\u012e\1\u012f\1\uffff\1\u0130",
            "\1\u012a\1\u012b\1\u012c\1\u012d\1\u012e\1\u012f\1\uffff\1\u0130",
            "\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112\1\uffff\1\u0113\1\u0114\16\uffff\1\u0116\1\uffff\1\u0115",
            "\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112\1\uffff\1\u0113\1\u0114\16\uffff\1\u0116\1\uffff\1\u0115",
            "\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112\1\uffff\1\u0113\1\u0114\16\uffff\1\u0116\1\uffff\1\u0115",
            "\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112\1\uffff\1\u0113\1\u0114\16\uffff\1\u0116\1\uffff\1\u0115",
            "\1\u0133\1\u0134\1\u0135\1\u0136\1\u0131\1\u0132\1\uffff\1\u0113\1\u0114\16\uffff\1\u0116\1\uffff\1\u0115",
            "\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112\1\uffff\1\u0137\1\u0114\16\uffff\1\u0116\1\uffff\1\u0115",
            "\1\u0138\1\u0139\1\uffff\1\u0113\1\u0114\16\uffff\1\u0116\1\uffff\1\u0115",
            "\1\u013a\17\uffff\1\u013b",
            "\1\u013c",
            "\1\u013d\1\u013e\1\u013f\1\u0140\3\uffff\1\u0141",
            "\1\u0117\1\u0118\1\u0119\1\u011a\1\u011b\1\u011c\1\uffff\1\u011d",
            "\1\u0117\1\u0118\1\u0119\1\u011a\1\u011b\1\u011c\1\uffff\1\u011d",
            "\1\u0117\1\u0118\1\u0119\1\u011a\1\u011b\1\u011c\1\uffff\1\u011d",
            "\1\u0117\1\u0118\1\u0119\1\u011a\1\u011b\1\u011c\1\uffff\1\u011d",
            "\1\u0117\1\u0118\1\u0119\1\u011a\1\u011b\1\u011c\1\uffff\1\u011d",
            "\1\u0117\1\u0118\1\u0119\1\u011a\1\u011b\1\u011c\1\uffff\1\u011d",
            "\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u008c\2\uffff\1\u0142",
            "\1\u011e\17\uffff\1\u011f",
            "\1\u0143",
            "\1\u00c8\1\u00c9\1\u00ca\3\uffff\1\u00cb\1\u0120\21\uffff\1\u00cc",
            "\1\u0144\17\uffff\1\u0145",
            "\1\102\1\103\1\uffff\1\u0122\13\uffff\1\63\1\61\1\62",
            "\1\u0123\1\u0124\1\u0125\3\uffff\1\u0126\1\u0127",
            "\1\u0123\1\u0124\1\u0125\3\uffff\1\u0126\1\u0127",
            "\1\u0123\1\u0124\1\u0125\3\uffff\1\u0126\1\u0127",
            "\1\u0123\1\u0124\1\u0125\3\uffff\1\u0126\1\u0127",
            "\1\u00fb\1\u00fc\1\u00fd\3\uffff\1\u00fe\1\u0146\21\uffff\1\u00ff",
            "\1\102\1\103\1\uffff\1\u0128\13\uffff\1\63\1\61\1\62",
            "\1\u00db\1\u00dc\1\u00dd\1\u00de\1\173\2\uffff\1\u0129",
            "\1\u012a\1\u012b\1\u012c\1\u012d\1\u012e\1\u012f\1\uffff\1\u0130",
            "\1\u012a\1\u012b\1\u012c\1\u012d\1\u012e\1\u012f\1\uffff\1\u0130",
            "\1\u012a\1\u012b\1\u012c\1\u012d\1\u012e\1\u012f\1\uffff\1\u0130",
            "\1\u012a\1\u012b\1\u012c\1\u012d\1\u012e\1\u012f\1\uffff\1\u0130",
            "\1\u012a\1\u012b\1\u012c\1\u012d\1\u012e\1\u012f\1\uffff\1\u0130",
            "\1\u012a\1\u012b\1\u012c\1\u012d\1\u012e\1\u012f\1\uffff\1\u0130",
            "\1\u0109\1\u010a\1\u010b\1\u010c\1\u00b9\2\uffff\1\u0147",
            "\1\u014d\1\u014e\1\u014f\1\u0150\1\u014b\1\u014c\1\uffff\1\u0148\1\u0149\16\uffff\1\u0116\1\uffff\1\u014a",
            "\1\u0154\1\u0155\1\u0156\1\u0157\1\u0153\1\u0152\1\uffff\1\u0151\1\u0149\16\uffff\1\u0116\1\uffff\1\u014a",
            "\1\u0154\1\u0155\1\u0156\1\u0157\1\u0153\1\u0152\1\uffff\1\u0148\1\u0149\16\uffff\1\u0116\1\uffff\1\u014a",
            "\1\u0154\1\u0155\1\u0156\1\u0157\1\u0153\1\u0152\1\uffff\1\u0148\1\u0149\16\uffff\1\u0116\1\uffff\1\u014a",
            "\1\u0154\1\u0155\1\u0156\1\u0157\1\u0153\1\u0152\1\uffff\1\u0148\1\u0149\16\uffff\1\u0116\1\uffff\1\u014a",
            "\1\u0154\1\u0155\1\u0156\1\u0157\1\u0153\1\u0152\1\uffff\1\u0148\1\u0149\16\uffff\1\u0116\1\uffff\1\u014a",
            "\1\u0138\1\u0139\1\uffff\1\u0113\1\u0114\16\uffff\1\u0116\1\uffff\1\u0115",
            "\1\u0158\1\u0159\1\u015a\1\u015b\1\u015c\1\u015d",
            "\1\u0139\1\uffff\1\u015e\17\uffff\1\u0116",
            "\1\u013a\17\uffff\1\u013b",
            "\1\u015f",
            "\1\u0160\1\u0161\1\u0162\3\uffff\1\u0163\22\uffff\1\u0164",
            "\1\u0165\1\u0166\1\u0167\1\u0168\1\u0169\1\u016a\1\uffff\1\u0141",
            "\1\u0165\1\u0166\1\u0167\1\u0168\1\u0169\1\u016a\1\uffff\1\u0141",
            "\1\u0165\1\u0166\1\u0167\1\u0168\1\u0169\1\u016a\1\uffff\1\u0141",
            "\1\u0165\1\u0166\1\u0167\1\u0168\1\u0169\1\u016a\1\uffff\1\u0141",
            "\1\u016c\1\u016d\1\u016e\1\u016f\3\uffff\1\u016b\1\u0170",
            "\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u008c\2\uffff\1\u0142",
            "\1\102\1\103\1\uffff\1\u00f3\1\u00f2\12\uffff\1\63\1\61\1\62",
            "\1\u0144\17\uffff\1\u0145",
            "\1\u0171",
            "\1\u00fb\1\u00fc\1\u00fd\3\uffff\1\u00fe\1\u0146\21\uffff\1\u00ff",
            "\1\u0109\1\u010a\1\u010b\1\u010c\1\u00b9\2\uffff\1\u0147",
            "\1\u0138\1\u0139\1\uffff\1\u0148\1\u0149\16\uffff\1\u0116\1\uffff\1\u014a",
            "\1\u0172\17\uffff\1\u0173",
            "\1\u0174",
            "\1\u014d\1\u014e\1\u014f\1\u0150\1\u014b\1\u014c\1\uffff\1\u0148\1\u0149\16\uffff\1\u0116\1\uffff\1\u014a",
            "\1\u0154\1\u0155\1\u0156\1\u0157\1\u0153\1\u0152\1\uffff\1\u0151\1\u0149\16\uffff\1\u0116\1\uffff\1\u014a",
            "\1\u0154\1\u0155\1\u0156\1\u0157\1\u0153\1\u0152\1\uffff\1\u0148\1\u0149\16\uffff\1\u0116\1\uffff\1\u014a",
            "\1\u0154\1\u0155\1\u0156\1\u0157\1\u0153\1\u0152\1\uffff\1\u0148\1\u0149\16\uffff\1\u0116\1\uffff\1\u014a",
            "\1\u0154\1\u0155\1\u0156\1\u0157\1\u0153\1\u0152\1\uffff\1\u0148\1\u0149\16\uffff\1\u0116\1\uffff\1\u014a",
            "\1\u0154\1\u0155\1\u0156\1\u0157\1\u0153\1\u0152\1\uffff\1\u0148\1\u0149\16\uffff\1\u0116\1\uffff\1\u014a",
            "\1\u0138\1\u0139\1\uffff\1\u0148\1\u0149\16\uffff\1\u0116\1\uffff\1\u014a",
            "\1\u0154\1\u0155\1\u0156\1\u0157\1\u0153\1\u0152\1\uffff\1\u0151\1\u0149\16\uffff\1\u0116\1\uffff\1\u014a",
            "\1\u014d\1\u014e\1\u014f\1\u0150\1\u014b\1\u014c\1\uffff\1\u0148\1\u0149\16\uffff\1\u0116\1\uffff\1\u014a",
            "\1\u0154\1\u0155\1\u0156\1\u0157\1\u0153\1\u0152\1\uffff\1\u0148\1\u0149\16\uffff\1\u0116\1\uffff\1\u014a",
            "\1\u0154\1\u0155\1\u0156\1\u0157\1\u0153\1\u0152\1\uffff\1\u0148\1\u0149\16\uffff\1\u0116\1\uffff\1\u014a",
            "\1\u0154\1\u0155\1\u0156\1\u0157\1\u0153\1\u0152\1\uffff\1\u0148\1\u0149\16\uffff\1\u0116\1\uffff\1\u014a",
            "\1\u0154\1\u0155\1\u0156\1\u0157\1\u0153\1\u0152\1\uffff\1\u0148\1\u0149\16\uffff\1\u0116\1\uffff\1\u014a",
            "\1\u0175\1\u0176\1\u0177\1\u0178\1\u0179\1\u017a\1\uffff\1\u017b\1\u017c\16\uffff\1\u0116\1\uffff\1\u017d",
            "\1\u0175\1\u0176\1\u0177\1\u0178\1\u0179\1\u017a\1\uffff\1\u017b\1\u017c\16\uffff\1\u0116\1\uffff\1\u017d",
            "\1\u0175\1\u0176\1\u0177\1\u0178\1\u0179\1\u017a\1\uffff\1\u017b\1\u017c\16\uffff\1\u0116\1\uffff\1\u017d",
            "\1\u0175\1\u0176\1\u0177\1\u0178\1\u0179\1\u017a\1\uffff\1\u017b\1\u017c\16\uffff\1\u0116\1\uffff\1\u017d",
            "\1\u0175\1\u0176\1\u0177\1\u0178\1\u0179\1\u017a\1\uffff\1\u017b\1\u017c\16\uffff\1\u0116\1\uffff\1\u017d",
            "\1\u0175\1\u0176\1\u0177\1\u0178\1\u0179\1\u017a\1\uffff\1\u017b\1\u017c\16\uffff\1\u0116\1\uffff\1\u017d",
            "\1\u0139\21\uffff\1\u0116",
            "\1\u0138\1\u0139\1\uffff\1\u017f\1\u017e\16\uffff\1\u0116",
            "\1\u0180\1\u0181\1\u0182\3\uffff\1\u0183\1\u0184",
            "\1\u0180\1\u0181\1\u0182\3\uffff\1\u0183\1\u0184",
            "\1\u0180\1\u0181\1\u0182\3\uffff\1\u0183\1\u0184",
            "\1\u0180\1\u0181\1\u0182\3\uffff\1\u0183\1\u0184",
            "\1\u0138\1\u0139\1\uffff\1\u0185\17\uffff\1\u0116",
            "\1\u0165\1\u0166\1\u0167\1\u0168\1\u0169\1\u016a\1\uffff\1\u0141",
            "\1\u0165\1\u0166\1\u0167\1\u0168\1\u0169\1\u016a\1\uffff\1\u0141",
            "\1\u0165\1\u0166\1\u0167\1\u0168\1\u0169\1\u016a\1\uffff\1\u0141",
            "\1\u0165\1\u0166\1\u0167\1\u0168\1\u0169\1\u016a\1\uffff\1\u0141",
            "\1\u0165\1\u0166\1\u0167\1\u0168\1\u0169\1\u016a\1\uffff\1\u0141",
            "\1\u0165\1\u0166\1\u0167\1\u0168\1\u0169\1\u016a\1\uffff\1\u0141",
            "\1\u016c\1\u016d\1\u016e\1\u016f\3\uffff\1\u016b\1\u0170",
            "\1\u0186\1\u0187\1\u0188\1\u0189\1\u018a\1\u018b\1\uffff\1\u018c",
            "\1\u0186\1\u0187\1\u0188\1\u0189\1\u018a\1\u018b\1\uffff\1\u018c",
            "\1\u0186\1\u0187\1\u0188\1\u0189\1\u018a\1\u018b\1\uffff\1\u018c",
            "\1\u0186\1\u0187\1\u0188\1\u0189\1\u018a\1\u018b\1\uffff\1\u018c",
            "\1\u018d\17\uffff\1\u018e",
            "\1\102\1\103\1\uffff\1\u0122\1\u0121\12\uffff\1\63\1\61\1\62",
            "\1\u0172\17\uffff\1\u0173",
            "\1\u018f",
            "\1\u0190\1\u0191\1\u0192\3\uffff\1\u0193\22\uffff\1\u0194",
            "\1\u0175\1\u0176\1\u0177\1\u0178\1\u0179\1\u017a\1\uffff\1\u017b\1\u017c\16\uffff\1\u0116\1\uffff\1\u017d",
            "\1\u0175\1\u0176\1\u0177\1\u0178\1\u0179\1\u017a\1\uffff\1\u017b\1\u017c\16\uffff\1\u0116\1\uffff\1\u017d",
            "\1\u0175\1\u0176\1\u0177\1\u0178\1\u0179\1\u017a\1\uffff\1\u017b\1\u017c\16\uffff\1\u0116\1\uffff\1\u017d",
            "\1\u0175\1\u0176\1\u0177\1\u0178\1\u0179\1\u017a\1\uffff\1\u017b\1\u017c\16\uffff\1\u0116\1\uffff\1\u017d",
            "\1\u0197\1\u0198\1\u0199\1\u019a\1\u0196\1\u0195\1\uffff\1\u017b\1\u017c\16\uffff\1\u0116\1\uffff\1\u017d",
            "\1\u0175\1\u0176\1\u0177\1\u0178\1\u0179\1\u017a\1\uffff\1\u019b\1\u017c\16\uffff\1\u0116\1\uffff\1\u017d",
            "\1\u0138\1\u0139\1\uffff\1\u017b\1\u017c\16\uffff\1\u0116\1\uffff\1\u017d",
            "\1\u019c\17\uffff\1\u019d",
            "\1\u019e",
            "\1\u019f\17\uffff\1\u01a0",
            "\1\u0138\1\u0139\1\uffff\1\u017f\17\uffff\1\u0116",
            "\1\u0180\1\u0181\1\u0182\3\uffff\1\u0183\1\u0184",
            "\1\u0180\1\u0181\1\u0182\3\uffff\1\u0183\1\u0184",
            "\1\u0180\1\u0181\1\u0182\3\uffff\1\u0183\1\u0184",
            "\1\u0180\1\u0181\1\u0182\3\uffff\1\u0183\1\u0184",
            "\1\u0160\1\u0161\1\u0162\3\uffff\1\u0163\1\u01a1\21\uffff\1\u0164",
            "\1\u0138\1\u0139\1\uffff\1\u0185\17\uffff\1\u0116",
            "\1\u0186\1\u0187\1\u0188\1\u0189\1\u018a\1\u018b\1\uffff\1\u018c",
            "\1\u0186\1\u0187\1\u0188\1\u0189\1\u018a\1\u018b\1\uffff\1\u018c",
            "\1\u0186\1\u0187\1\u0188\1\u0189\1\u018a\1\u018b\1\uffff\1\u018c",
            "\1\u0186\1\u0187\1\u0188\1\u0189\1\u018a\1\u018b\1\uffff\1\u018c",
            "\1\u0186\1\u0187\1\u0188\1\u0189\1\u018a\1\u018b\1\uffff\1\u018c",
            "\1\u0186\1\u0187\1\u0188\1\u0189\1\u018a\1\u018b\1\uffff\1\u018c",
            "\1\u01a3\1\u01a4\1\u01a5\1\u01a6\3\uffff\1\u01a2\1\u0170",
            "\1\u018d\17\uffff\1\u018e",
            "\1\u01a7",
            "\1\u0138\1\u0139\1\uffff\1\u01a9\1\u01a8\16\uffff\1\u0116",
            "\1\u01aa\1\u01ab\1\u01ac\3\uffff\1\u01ad\1\u01ae",
            "\1\u01aa\1\u01ab\1\u01ac\3\uffff\1\u01ad\1\u01ae",
            "\1\u01aa\1\u01ab\1\u01ac\3\uffff\1\u01ad\1\u01ae",
            "\1\u01aa\1\u01ab\1\u01ac\3\uffff\1\u01ad\1\u01ae",
            "\1\u0138\1\u0139\1\uffff\1\u01af\17\uffff\1\u0116",
            "\1\u0175\1\u0176\1\u0177\1\u0178\1\u0179\1\u017a\1\uffff\1\u019b\1\u017c\16\uffff\1\u0116\1\uffff\1\u017d",
            "\1\u0197\1\u0198\1\u0199\1\u019a\1\u0196\1\u0195\1\uffff\1\u017b\1\u017c\16\uffff\1\u0116\1\uffff\1\u017d",
            "\1\u0175\1\u0176\1\u0177\1\u0178\1\u0179\1\u017a\1\uffff\1\u017b\1\u017c\16\uffff\1\u0116\1\uffff\1\u017d",
            "\1\u0175\1\u0176\1\u0177\1\u0178\1\u0179\1\u017a\1\uffff\1\u017b\1\u017c\16\uffff\1\u0116\1\uffff\1\u017d",
            "\1\u0175\1\u0176\1\u0177\1\u0178\1\u0179\1\u017a\1\uffff\1\u017b\1\u017c\16\uffff\1\u0116\1\uffff\1\u017d",
            "\1\u0175\1\u0176\1\u0177\1\u0178\1\u0179\1\u017a\1\uffff\1\u017b\1\u017c\16\uffff\1\u0116\1\uffff\1\u017d",
            "\1\u0138\1\u0139\1\uffff\1\u017b\1\u017c\16\uffff\1\u0116\1\uffff\1\u017d",
            "\1\u019c\17\uffff\1\u019d",
            "\1\u01b0",
            "\1\u01b1\1\u01b2\1\u01b3\3\uffff\1\u01b4\22\uffff\1\u01b5",
            "\1\u019f\17\uffff\1\u01a0",
            "\1\u01b6",
            "\1\u0160\1\u0161\1\u0162\3\uffff\1\u0163\1\u01a1\21\uffff\1\u0164",
            "\1\u01a3\1\u01a4\1\u01a5\1\u01a6\3\uffff\1\u01a2\1\u0170",
            "\1\u01b7\1\u01b8\1\u01b9\1\u01ba\1\u01bb\1\u01bc\1\uffff\1\u01bd",
            "\1\u01b7\1\u01b8\1\u01b9\1\u01ba\1\u01bb\1\u01bc\1\uffff\1\u01bd",
            "\1\u01b7\1\u01b8\1\u01b9\1\u01ba\1\u01bb\1\u01bc\1\uffff\1\u01bd",
            "\1\u01b7\1\u01b8\1\u01b9\1\u01ba\1\u01bb\1\u01bc\1\uffff\1\u01bd",
            "\1\uffff",
            "\1\u01be\17\uffff\1\u01bf",
            "\1\u0138\1\u0139\1\uffff\1\u01a9\17\uffff\1\u0116",
            "\1\u01aa\1\u01ab\1\u01ac\3\uffff\1\u01ad\1\u01ae",
            "\1\u01aa\1\u01ab\1\u01ac\3\uffff\1\u01ad\1\u01ae",
            "\1\u01aa\1\u01ab\1\u01ac\3\uffff\1\u01ad\1\u01ae",
            "\1\u01aa\1\u01ab\1\u01ac\3\uffff\1\u01ad\1\u01ae",
            "\1\u0190\1\u0191\1\u0192\3\uffff\1\u0193\1\u01c0\21\uffff\1\u0194",
            "\1\u0138\1\u0139\1\uffff\1\u01af\17\uffff\1\u0116",
            "\1\u0138\1\u0139\1\uffff\1\u01c2\1\u01c1\16\uffff\1\u0116",
            "\1\u01c3\1\u01c4\1\u01c5\3\uffff\1\u01c6\1\u01c7",
            "\1\u01c3\1\u01c4\1\u01c5\3\uffff\1\u01c6\1\u01c7",
            "\1\u01c3\1\u01c4\1\u01c5\3\uffff\1\u01c6\1\u01c7",
            "\1\u01c3\1\u01c4\1\u01c5\3\uffff\1\u01c6\1\u01c7",
            "\1\u0138\1\u0139\1\uffff\1\u01c8\17\uffff\1\u0116",
            "\1\u0138\1\u0139\1\uffff\1\u017f\1\u017e\16\uffff\1\u0116",
            "\1\u01b7\1\u01b8\1\u01b9\1\u01ba\1\u01bb\1\u01bc\1\uffff\1\u01bd",
            "\1\u01b7\1\u01b8\1\u01b9\1\u01ba\1\u01bb\1\u01bc\1\uffff\1\u01bd",
            "\1\u01b7\1\u01b8\1\u01b9\1\u01ba\1\u01bb\1\u01bc\1\uffff\1\u01bd",
            "\1\u01b7\1\u01b8\1\u01b9\1\u01ba\1\u01bb\1\u01bc\1\uffff\1\u01bd",
            "\1\u01b7\1\u01b8\1\u01b9\1\u01ba\1\u01bb\1\u01bc\1\uffff\1\u01bd",
            "\1\u01b7\1\u01b8\1\u01b9\1\u01ba\1\u01bb\1\u01bc\1\uffff\1\u01bd",
            "\1\u01a3\1\u01a4\1\u01a5\1\u01a6\3\uffff\1\u01c9\1\u0170",
            "\1\u01be\17\uffff\1\u01bf",
            "\1\u01ca",
            "\1\u0190\1\u0191\1\u0192\3\uffff\1\u0193\1\u01c0\21\uffff\1\u0194",
            "\1\u01cb\17\uffff\1\u01cc",
            "\1\u0138\1\u0139\1\uffff\1\u01c2\17\uffff\1\u0116",
            "\1\u01c3\1\u01c4\1\u01c5\3\uffff\1\u01c6\1\u01c7",
            "\1\u01c3\1\u01c4\1\u01c5\3\uffff\1\u01c6\1\u01c7",
            "\1\u01c3\1\u01c4\1\u01c5\3\uffff\1\u01c6\1\u01c7",
            "\1\u01c3\1\u01c4\1\u01c5\3\uffff\1\u01c6\1\u01c7",
            "\1\u01b1\1\u01b2\1\u01b3\3\uffff\1\u01b4\1\u01cd\21\uffff\1\u01b5",
            "\1\u0138\1\u0139\1\uffff\1\u01c8\17\uffff\1\u0116",
            "\1\u01a3\1\u01a4\1\u01a5\1\u01a6\3\uffff\1\u01c9\1\u0170",
            "\1\u0138\1\u0139\1\uffff\1\u01a9\1\u01a8\16\uffff\1\u0116",
            "\1\u01cb\17\uffff\1\u01cc",
            "\1\u01ce",
            "\1\u01b1\1\u01b2\1\u01b3\3\uffff\1\u01b4\1\u01cd\21\uffff\1\u01b5",
            "\1\u0138\1\u0139\1\uffff\1\u01c2\1\u01c1\16\uffff\1\u0116"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "985:2: ( rule__Feature__BackgroundAssignment_5 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_168 = input.LA(1);

                         
                        int index14_168 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCucumber()) ) {s = 223;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index14_168);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_423 = input.LA(1);

                         
                        int index14_423 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCucumber()) ) {s = 223;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index14_423);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_169 = input.LA(1);

                         
                        int index14_169 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCucumber()) ) {s = 223;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index14_169);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_170 = input.LA(1);

                         
                        int index14_170 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCucumber()) ) {s = 223;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index14_170);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_171 = input.LA(1);

                         
                        int index14_171 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCucumber()) ) {s = 223;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index14_171);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_172 = input.LA(1);

                         
                        int index14_172 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCucumber()) ) {s = 223;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index14_172);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_173 = input.LA(1);

                         
                        int index14_173 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCucumber()) ) {s = 223;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index14_173);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA14_193 = input.LA(1);

                         
                        int index14_193 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCucumber()) ) {s = 223;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index14_193);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA14_194 = input.LA(1);

                         
                        int index14_194 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCucumber()) ) {s = 223;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index14_194);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA14_195 = input.LA(1);

                         
                        int index14_195 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCucumber()) ) {s = 223;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index14_195);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA14_196 = input.LA(1);

                         
                        int index14_196 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCucumber()) ) {s = 223;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index14_196);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA14_197 = input.LA(1);

                         
                        int index14_197 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCucumber()) ) {s = 223;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index14_197);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA14_198 = input.LA(1);

                         
                        int index14_198 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCucumber()) ) {s = 223;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index14_198);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_21s = "\5\uffff";
    static final String dfa_22s = "\1\1\4\uffff";
    static final String dfa_23s = "\1\11\1\uffff\1\11\1\uffff\1\11";
    static final String dfa_24s = "\1\33\1\uffff\1\33\1\uffff\1\33";
    static final String dfa_25s = "\1\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String dfa_26s = "\5\uffff}>";
    static final String[] dfa_27s = {
            "\1\2\15\uffff\3\1\1\uffff\1\3",
            "",
            "\1\2\1\uffff\1\4\13\uffff\3\1\1\uffff\1\3",
            "",
            "\1\2\15\uffff\3\1\1\uffff\1\3"
    };

    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[][] dfa_27 = unpackEncodedStringArray(dfa_27s);

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_21;
            this.eof = dfa_22;
            this.min = dfa_23;
            this.max = dfa_24;
            this.accept = dfa_25;
            this.special = dfa_26;
            this.transition = dfa_27;
        }
        public String getDescription() {
            return "()* loopback of 1606:3: ( rule__ScenarioOutline__ExamplesAssignment_7 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000003F2L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000038002F0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000038002F2L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800200L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000008F0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000001F2L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000200L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000200L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000200L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000202L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000000003F0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020001800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000000010F0L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020001000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000470L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000BF0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000472L});

}
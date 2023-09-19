package mbt.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import mbt.services.CucumberGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCucumberParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_STEP_KEYWORD", "RULE_TABLE_CELL", "RULE_WORD", "RULE_INT", "RULE_STRING", "RULE_PLACEHOLDER", "RULE_TAGNAME", "RULE_ANY_OTHER", "RULE_NL", "RULE_SL_COMMENT", "RULE_WS", "RULE_ASCII_DIGIT", "RULE_DIGIT", "RULE_LATIN_ALPHABET", "RULE_LETTER", "RULE_ASCII_SPACE", "RULE_ASCII_SYMBOLS", "'Feature:'", "'Background:'", "'Scenario:'", "'Scenario'", "'Outline:'", "'Examples:'", "'|'", "'\"\"\"'"
    };
    public static final int RULE_WORD=7;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_ASCII_SYMBOLS=21;
    public static final int EOF=-1;
    public static final int RULE_LATIN_ALPHABET=18;
    public static final int RULE_EOL=4;
    public static final int RULE_WS=15;
    public static final int RULE_DIGIT=17;
    public static final int RULE_TAGNAME=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_ASCII_DIGIT=16;
    public static final int RULE_LETTER=19;
    public static final int T__26=26;
    public static final int RULE_PLACEHOLDER=10;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int RULE_ASCII_SPACE=20;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int RULE_STEP_KEYWORD=5;
    public static final int T__25=25;
    public static final int RULE_NL=13;
    public static final int RULE_TABLE_CELL=6;

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

        public InternalCucumberParser(TokenStream input, CucumberGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Feature";
       	}

       	@Override
       	protected CucumberGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFeature"
    // InternalCucumber.g:64:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalCucumber.g:64:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalCucumber.g:65:2: iv_ruleFeature= ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeature; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalCucumber.g:71:1: ruleFeature returns [EObject current=null] : ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Feature:' ( (lv_title_2_0= ruleTitle ) ) (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_background_5_0= ruleBackground ) )? ( (lv_scenarios_6_0= ruleAbstractScenario ) )+ ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_EOL_3=null;
        EObject lv_tags_0_0 = null;

        AntlrDatatypeRuleToken lv_title_2_0 = null;

        AntlrDatatypeRuleToken lv_narrative_4_0 = null;

        EObject lv_background_5_0 = null;

        EObject lv_scenarios_6_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:77:2: ( ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Feature:' ( (lv_title_2_0= ruleTitle ) ) (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_background_5_0= ruleBackground ) )? ( (lv_scenarios_6_0= ruleAbstractScenario ) )+ ) )
            // InternalCucumber.g:78:2: ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Feature:' ( (lv_title_2_0= ruleTitle ) ) (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_background_5_0= ruleBackground ) )? ( (lv_scenarios_6_0= ruleAbstractScenario ) )+ )
            {
            // InternalCucumber.g:78:2: ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Feature:' ( (lv_title_2_0= ruleTitle ) ) (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_background_5_0= ruleBackground ) )? ( (lv_scenarios_6_0= ruleAbstractScenario ) )+ )
            // InternalCucumber.g:79:3: ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Feature:' ( (lv_title_2_0= ruleTitle ) ) (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_background_5_0= ruleBackground ) )? ( (lv_scenarios_6_0= ruleAbstractScenario ) )+
            {
            // InternalCucumber.g:79:3: ( (lv_tags_0_0= ruleTag ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_TAGNAME) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCucumber.g:80:4: (lv_tags_0_0= ruleTag )
            	    {
            	    // InternalCucumber.g:80:4: (lv_tags_0_0= ruleTag )
            	    // InternalCucumber.g:81:5: lv_tags_0_0= ruleTag
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFeatureAccess().getTagsTagParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_tags_0_0=ruleTag();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getFeatureRule());
            	      					}
            	      					add(
            	      						current,
            	      						"tags",
            	      						lv_tags_0_0,
            	      						"mbt.Cucumber.Tag");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_1=(Token)match(input,22,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getFeatureKeyword_1());
              		
            }
            // InternalCucumber.g:102:3: ( (lv_title_2_0= ruleTitle ) )
            // InternalCucumber.g:103:4: (lv_title_2_0= ruleTitle )
            {
            // InternalCucumber.g:103:4: (lv_title_2_0= ruleTitle )
            // InternalCucumber.g:104:5: lv_title_2_0= ruleTitle
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFeatureAccess().getTitleTitleParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_title_2_0=ruleTitle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFeatureRule());
              					}
              					set(
              						current,
              						"title",
              						lv_title_2_0,
              						"mbt.Cucumber.Title");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCucumber.g:121:3: (this_EOL_3= RULE_EOL )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_EOL) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCucumber.g:122:4: this_EOL_3= RULE_EOL
            	    {
            	    this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_EOL_3, grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_3());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // InternalCucumber.g:127:3: ( (lv_narrative_4_0= ruleNarrative ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_WORD && LA3_0<=RULE_PLACEHOLDER)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCucumber.g:128:4: (lv_narrative_4_0= ruleNarrative )
                    {
                    // InternalCucumber.g:128:4: (lv_narrative_4_0= ruleNarrative )
                    // InternalCucumber.g:129:5: lv_narrative_4_0= ruleNarrative
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFeatureAccess().getNarrativeNarrativeParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_7);
                    lv_narrative_4_0=ruleNarrative();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFeatureRule());
                      					}
                      					set(
                      						current,
                      						"narrative",
                      						lv_narrative_4_0,
                      						"mbt.Cucumber.Narrative");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCucumber.g:146:3: ( (lv_background_5_0= ruleBackground ) )?
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalCucumber.g:147:4: (lv_background_5_0= ruleBackground )
                    {
                    // InternalCucumber.g:147:4: (lv_background_5_0= ruleBackground )
                    // InternalCucumber.g:148:5: lv_background_5_0= ruleBackground
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFeatureAccess().getBackgroundBackgroundParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_7);
                    lv_background_5_0=ruleBackground();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFeatureRule());
                      					}
                      					set(
                      						current,
                      						"background",
                      						lv_background_5_0,
                      						"mbt.Cucumber.Background");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCucumber.g:165:3: ( (lv_scenarios_6_0= ruleAbstractScenario ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_TAGNAME||(LA5_0>=23 && LA5_0<=25)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCucumber.g:166:4: (lv_scenarios_6_0= ruleAbstractScenario )
            	    {
            	    // InternalCucumber.g:166:4: (lv_scenarios_6_0= ruleAbstractScenario )
            	    // InternalCucumber.g:167:5: lv_scenarios_6_0= ruleAbstractScenario
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFeatureAccess().getScenariosAbstractScenarioParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_scenarios_6_0=ruleAbstractScenario();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getFeatureRule());
            	      					}
            	      					add(
            	      						current,
            	      						"scenarios",
            	      						lv_scenarios_6_0,
            	      						"mbt.Cucumber.AbstractScenario");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleAbstractScenario"
    // InternalCucumber.g:188:1: entryRuleAbstractScenario returns [EObject current=null] : iv_ruleAbstractScenario= ruleAbstractScenario EOF ;
    public final EObject entryRuleAbstractScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractScenario = null;


        try {
            // InternalCucumber.g:188:57: (iv_ruleAbstractScenario= ruleAbstractScenario EOF )
            // InternalCucumber.g:189:2: iv_ruleAbstractScenario= ruleAbstractScenario EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractScenarioRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAbstractScenario=ruleAbstractScenario();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractScenario; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractScenario"


    // $ANTLR start "ruleAbstractScenario"
    // InternalCucumber.g:195:1: ruleAbstractScenario returns [EObject current=null] : (this_Scenario_0= ruleScenario | this_ScenarioOutline_1= ruleScenarioOutline | this_Background_2= ruleBackground ) ;
    public final EObject ruleAbstractScenario() throws RecognitionException {
        EObject current = null;

        EObject this_Scenario_0 = null;

        EObject this_ScenarioOutline_1 = null;

        EObject this_Background_2 = null;



        	enterRule();

        try {
            // InternalCucumber.g:201:2: ( (this_Scenario_0= ruleScenario | this_ScenarioOutline_1= ruleScenarioOutline | this_Background_2= ruleBackground ) )
            // InternalCucumber.g:202:2: (this_Scenario_0= ruleScenario | this_ScenarioOutline_1= ruleScenarioOutline | this_Background_2= ruleBackground )
            {
            // InternalCucumber.g:202:2: (this_Scenario_0= ruleScenario | this_ScenarioOutline_1= ruleScenarioOutline | this_Background_2= ruleBackground )
            int alt6=3;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalCucumber.g:203:3: this_Scenario_0= ruleScenario
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractScenarioAccess().getScenarioParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Scenario_0=ruleScenario();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Scenario_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCucumber.g:212:3: this_ScenarioOutline_1= ruleScenarioOutline
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractScenarioAccess().getScenarioOutlineParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ScenarioOutline_1=ruleScenarioOutline();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ScenarioOutline_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCucumber.g:221:3: this_Background_2= ruleBackground
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractScenarioAccess().getBackgroundParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Background_2=ruleBackground();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Background_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractScenario"


    // $ANTLR start "entryRuleBackground"
    // InternalCucumber.g:233:1: entryRuleBackground returns [EObject current=null] : iv_ruleBackground= ruleBackground EOF ;
    public final EObject entryRuleBackground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackground = null;


        try {
            // InternalCucumber.g:233:51: (iv_ruleBackground= ruleBackground EOF )
            // InternalCucumber.g:234:2: iv_ruleBackground= ruleBackground EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBackgroundRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBackground=ruleBackground();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBackground; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBackground"


    // $ANTLR start "ruleBackground"
    // InternalCucumber.g:240:1: ruleBackground returns [EObject current=null] : ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Background:' ( (lv_title_2_0= ruleTitle ) )? (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_steps_5_0= ruleStep ) )+ ) ;
    public final EObject ruleBackground() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_EOL_3=null;
        EObject lv_tags_0_0 = null;

        AntlrDatatypeRuleToken lv_title_2_0 = null;

        AntlrDatatypeRuleToken lv_narrative_4_0 = null;

        EObject lv_steps_5_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:246:2: ( ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Background:' ( (lv_title_2_0= ruleTitle ) )? (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_steps_5_0= ruleStep ) )+ ) )
            // InternalCucumber.g:247:2: ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Background:' ( (lv_title_2_0= ruleTitle ) )? (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_steps_5_0= ruleStep ) )+ )
            {
            // InternalCucumber.g:247:2: ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Background:' ( (lv_title_2_0= ruleTitle ) )? (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_steps_5_0= ruleStep ) )+ )
            // InternalCucumber.g:248:3: ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Background:' ( (lv_title_2_0= ruleTitle ) )? (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_steps_5_0= ruleStep ) )+
            {
            // InternalCucumber.g:248:3: ( (lv_tags_0_0= ruleTag ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_TAGNAME) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCucumber.g:249:4: (lv_tags_0_0= ruleTag )
            	    {
            	    // InternalCucumber.g:249:4: (lv_tags_0_0= ruleTag )
            	    // InternalCucumber.g:250:5: lv_tags_0_0= ruleTag
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBackgroundAccess().getTagsTagParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_tags_0_0=ruleTag();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBackgroundRule());
            	      					}
            	      					add(
            	      						current,
            	      						"tags",
            	      						lv_tags_0_0,
            	      						"mbt.Cucumber.Tag");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_1=(Token)match(input,23,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBackgroundAccess().getBackgroundKeyword_1());
              		
            }
            // InternalCucumber.g:271:3: ( (lv_title_2_0= ruleTitle ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_WORD && LA8_0<=RULE_PLACEHOLDER)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCucumber.g:272:4: (lv_title_2_0= ruleTitle )
                    {
                    // InternalCucumber.g:272:4: (lv_title_2_0= ruleTitle )
                    // InternalCucumber.g:273:5: lv_title_2_0= ruleTitle
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBackgroundAccess().getTitleTitleParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_5);
                    lv_title_2_0=ruleTitle();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBackgroundRule());
                      					}
                      					set(
                      						current,
                      						"title",
                      						lv_title_2_0,
                      						"mbt.Cucumber.Title");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCucumber.g:290:3: (this_EOL_3= RULE_EOL )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_EOL) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCucumber.g:291:4: this_EOL_3= RULE_EOL
            	    {
            	    this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_EOL_3, grammarAccess.getBackgroundAccess().getEOLTerminalRuleCall_3());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            // InternalCucumber.g:296:3: ( (lv_narrative_4_0= ruleNarrative ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_WORD && LA10_0<=RULE_PLACEHOLDER)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCucumber.g:297:4: (lv_narrative_4_0= ruleNarrative )
                    {
                    // InternalCucumber.g:297:4: (lv_narrative_4_0= ruleNarrative )
                    // InternalCucumber.g:298:5: lv_narrative_4_0= ruleNarrative
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBackgroundAccess().getNarrativeNarrativeParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_narrative_4_0=ruleNarrative();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBackgroundRule());
                      					}
                      					set(
                      						current,
                      						"narrative",
                      						lv_narrative_4_0,
                      						"mbt.Cucumber.Narrative");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCucumber.g:315:3: ( (lv_steps_5_0= ruleStep ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STEP_KEYWORD) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCucumber.g:316:4: (lv_steps_5_0= ruleStep )
            	    {
            	    // InternalCucumber.g:316:4: (lv_steps_5_0= ruleStep )
            	    // InternalCucumber.g:317:5: lv_steps_5_0= ruleStep
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_steps_5_0=ruleStep();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBackgroundRule());
            	      					}
            	      					add(
            	      						current,
            	      						"steps",
            	      						lv_steps_5_0,
            	      						"mbt.Cucumber.Step");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBackground"


    // $ANTLR start "entryRuleScenario"
    // InternalCucumber.g:338:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalCucumber.g:338:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalCucumber.g:339:2: iv_ruleScenario= ruleScenario EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScenarioRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScenario=ruleScenario();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScenario; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // InternalCucumber.g:345:1: ruleScenario returns [EObject current=null] : ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Scenario:' ( (lv_title_2_0= ruleTitle ) )? (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_steps_5_0= ruleStep ) )+ ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_EOL_3=null;
        EObject lv_tags_0_0 = null;

        AntlrDatatypeRuleToken lv_title_2_0 = null;

        AntlrDatatypeRuleToken lv_narrative_4_0 = null;

        EObject lv_steps_5_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:351:2: ( ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Scenario:' ( (lv_title_2_0= ruleTitle ) )? (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_steps_5_0= ruleStep ) )+ ) )
            // InternalCucumber.g:352:2: ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Scenario:' ( (lv_title_2_0= ruleTitle ) )? (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_steps_5_0= ruleStep ) )+ )
            {
            // InternalCucumber.g:352:2: ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Scenario:' ( (lv_title_2_0= ruleTitle ) )? (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_steps_5_0= ruleStep ) )+ )
            // InternalCucumber.g:353:3: ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Scenario:' ( (lv_title_2_0= ruleTitle ) )? (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_steps_5_0= ruleStep ) )+
            {
            // InternalCucumber.g:353:3: ( (lv_tags_0_0= ruleTag ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_TAGNAME) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCucumber.g:354:4: (lv_tags_0_0= ruleTag )
            	    {
            	    // InternalCucumber.g:354:4: (lv_tags_0_0= ruleTag )
            	    // InternalCucumber.g:355:5: lv_tags_0_0= ruleTag
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getScenarioAccess().getTagsTagParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_tags_0_0=ruleTag();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getScenarioRule());
            	      					}
            	      					add(
            	      						current,
            	      						"tags",
            	      						lv_tags_0_0,
            	      						"mbt.Cucumber.Tag");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_1=(Token)match(input,24,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getScenarioAccess().getScenarioKeyword_1());
              		
            }
            // InternalCucumber.g:376:3: ( (lv_title_2_0= ruleTitle ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_WORD && LA13_0<=RULE_PLACEHOLDER)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCucumber.g:377:4: (lv_title_2_0= ruleTitle )
                    {
                    // InternalCucumber.g:377:4: (lv_title_2_0= ruleTitle )
                    // InternalCucumber.g:378:5: lv_title_2_0= ruleTitle
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getScenarioAccess().getTitleTitleParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_5);
                    lv_title_2_0=ruleTitle();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getScenarioRule());
                      					}
                      					set(
                      						current,
                      						"title",
                      						lv_title_2_0,
                      						"mbt.Cucumber.Title");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCucumber.g:395:3: (this_EOL_3= RULE_EOL )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_EOL) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCucumber.g:396:4: this_EOL_3= RULE_EOL
            	    {
            	    this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_EOL_3, grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_3());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            // InternalCucumber.g:401:3: ( (lv_narrative_4_0= ruleNarrative ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_WORD && LA15_0<=RULE_PLACEHOLDER)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCucumber.g:402:4: (lv_narrative_4_0= ruleNarrative )
                    {
                    // InternalCucumber.g:402:4: (lv_narrative_4_0= ruleNarrative )
                    // InternalCucumber.g:403:5: lv_narrative_4_0= ruleNarrative
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getScenarioAccess().getNarrativeNarrativeParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_narrative_4_0=ruleNarrative();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getScenarioRule());
                      					}
                      					set(
                      						current,
                      						"narrative",
                      						lv_narrative_4_0,
                      						"mbt.Cucumber.Narrative");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCucumber.g:420:3: ( (lv_steps_5_0= ruleStep ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_STEP_KEYWORD) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCucumber.g:421:4: (lv_steps_5_0= ruleStep )
            	    {
            	    // InternalCucumber.g:421:4: (lv_steps_5_0= ruleStep )
            	    // InternalCucumber.g:422:5: lv_steps_5_0= ruleStep
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_steps_5_0=ruleStep();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getScenarioRule());
            	      					}
            	      					add(
            	      						current,
            	      						"steps",
            	      						lv_steps_5_0,
            	      						"mbt.Cucumber.Step");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleScenarioOutline"
    // InternalCucumber.g:443:1: entryRuleScenarioOutline returns [EObject current=null] : iv_ruleScenarioOutline= ruleScenarioOutline EOF ;
    public final EObject entryRuleScenarioOutline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenarioOutline = null;


        try {
            // InternalCucumber.g:443:56: (iv_ruleScenarioOutline= ruleScenarioOutline EOF )
            // InternalCucumber.g:444:2: iv_ruleScenarioOutline= ruleScenarioOutline EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScenarioOutlineRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScenarioOutline=ruleScenarioOutline();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScenarioOutline; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScenarioOutline"


    // $ANTLR start "ruleScenarioOutline"
    // InternalCucumber.g:450:1: ruleScenarioOutline returns [EObject current=null] : ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Scenario' otherlv_2= 'Outline:' ( (lv_title_3_0= ruleTitle ) )? (this_EOL_4= RULE_EOL )+ ( (lv_narrative_5_0= ruleNarrative ) )? ( (lv_steps_6_0= ruleStep ) )+ ( (lv_examples_7_0= ruleExample ) )+ ) ;
    public final EObject ruleScenarioOutline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_EOL_4=null;
        EObject lv_tags_0_0 = null;

        AntlrDatatypeRuleToken lv_title_3_0 = null;

        AntlrDatatypeRuleToken lv_narrative_5_0 = null;

        EObject lv_steps_6_0 = null;

        EObject lv_examples_7_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:456:2: ( ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Scenario' otherlv_2= 'Outline:' ( (lv_title_3_0= ruleTitle ) )? (this_EOL_4= RULE_EOL )+ ( (lv_narrative_5_0= ruleNarrative ) )? ( (lv_steps_6_0= ruleStep ) )+ ( (lv_examples_7_0= ruleExample ) )+ ) )
            // InternalCucumber.g:457:2: ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Scenario' otherlv_2= 'Outline:' ( (lv_title_3_0= ruleTitle ) )? (this_EOL_4= RULE_EOL )+ ( (lv_narrative_5_0= ruleNarrative ) )? ( (lv_steps_6_0= ruleStep ) )+ ( (lv_examples_7_0= ruleExample ) )+ )
            {
            // InternalCucumber.g:457:2: ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Scenario' otherlv_2= 'Outline:' ( (lv_title_3_0= ruleTitle ) )? (this_EOL_4= RULE_EOL )+ ( (lv_narrative_5_0= ruleNarrative ) )? ( (lv_steps_6_0= ruleStep ) )+ ( (lv_examples_7_0= ruleExample ) )+ )
            // InternalCucumber.g:458:3: ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Scenario' otherlv_2= 'Outline:' ( (lv_title_3_0= ruleTitle ) )? (this_EOL_4= RULE_EOL )+ ( (lv_narrative_5_0= ruleNarrative ) )? ( (lv_steps_6_0= ruleStep ) )+ ( (lv_examples_7_0= ruleExample ) )+
            {
            // InternalCucumber.g:458:3: ( (lv_tags_0_0= ruleTag ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_TAGNAME) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCucumber.g:459:4: (lv_tags_0_0= ruleTag )
            	    {
            	    // InternalCucumber.g:459:4: (lv_tags_0_0= ruleTag )
            	    // InternalCucumber.g:460:5: lv_tags_0_0= ruleTag
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getTagsTagParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_tags_0_0=ruleTag();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
            	      					}
            	      					add(
            	      						current,
            	      						"tags",
            	      						lv_tags_0_0,
            	      						"mbt.Cucumber.Tag");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_1=(Token)match(input,25,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getScenarioOutlineAccess().getScenarioKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,26,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getScenarioOutlineAccess().getOutlineKeyword_2());
              		
            }
            // InternalCucumber.g:485:3: ( (lv_title_3_0= ruleTitle ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_WORD && LA18_0<=RULE_PLACEHOLDER)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCucumber.g:486:4: (lv_title_3_0= ruleTitle )
                    {
                    // InternalCucumber.g:486:4: (lv_title_3_0= ruleTitle )
                    // InternalCucumber.g:487:5: lv_title_3_0= ruleTitle
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getTitleTitleParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_5);
                    lv_title_3_0=ruleTitle();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
                      					}
                      					set(
                      						current,
                      						"title",
                      						lv_title_3_0,
                      						"mbt.Cucumber.Title");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCucumber.g:504:3: (this_EOL_4= RULE_EOL )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_EOL) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCucumber.g:505:4: this_EOL_4= RULE_EOL
            	    {
            	    this_EOL_4=(Token)match(input,RULE_EOL,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_EOL_4, grammarAccess.getScenarioOutlineAccess().getEOLTerminalRuleCall_4());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            // InternalCucumber.g:510:3: ( (lv_narrative_5_0= ruleNarrative ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_WORD && LA20_0<=RULE_PLACEHOLDER)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCucumber.g:511:4: (lv_narrative_5_0= ruleNarrative )
                    {
                    // InternalCucumber.g:511:4: (lv_narrative_5_0= ruleNarrative )
                    // InternalCucumber.g:512:5: lv_narrative_5_0= ruleNarrative
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getNarrativeNarrativeParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_narrative_5_0=ruleNarrative();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
                      					}
                      					set(
                      						current,
                      						"narrative",
                      						lv_narrative_5_0,
                      						"mbt.Cucumber.Narrative");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCucumber.g:529:3: ( (lv_steps_6_0= ruleStep ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STEP_KEYWORD) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCucumber.g:530:4: (lv_steps_6_0= ruleStep )
            	    {
            	    // InternalCucumber.g:530:4: (lv_steps_6_0= ruleStep )
            	    // InternalCucumber.g:531:5: lv_steps_6_0= ruleStep
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getStepsStepParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_steps_6_0=ruleStep();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
            	      					}
            	      					add(
            	      						current,
            	      						"steps",
            	      						lv_steps_6_0,
            	      						"mbt.Cucumber.Step");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            // InternalCucumber.g:548:3: ( (lv_examples_7_0= ruleExample ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // InternalCucumber.g:549:4: (lv_examples_7_0= ruleExample )
            	    {
            	    // InternalCucumber.g:549:4: (lv_examples_7_0= ruleExample )
            	    // InternalCucumber.g:550:5: lv_examples_7_0= ruleExample
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getExamplesExampleParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_examples_7_0=ruleExample();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
            	      					}
            	      					add(
            	      						current,
            	      						"examples",
            	      						lv_examples_7_0,
            	      						"mbt.Cucumber.Example");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScenarioOutline"


    // $ANTLR start "entryRuleStep"
    // InternalCucumber.g:571:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalCucumber.g:571:45: (iv_ruleStep= ruleStep EOF )
            // InternalCucumber.g:572:2: iv_ruleStep= ruleStep EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStepRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStep=ruleStep();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStep; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalCucumber.g:578:1: ruleStep returns [EObject current=null] : ( ( (lv_keyword_0_0= RULE_STEP_KEYWORD ) ) ( (lv_description_1_0= ruleStepDescription ) ) (this_EOL_2= RULE_EOL )* ( ( (lv_table_3_0= ruleTable ) ) | ( (lv_code_4_0= ruleDocString ) ) )? ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;
        Token this_EOL_2=null;
        AntlrDatatypeRuleToken lv_description_1_0 = null;

        EObject lv_table_3_0 = null;

        EObject lv_code_4_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:584:2: ( ( ( (lv_keyword_0_0= RULE_STEP_KEYWORD ) ) ( (lv_description_1_0= ruleStepDescription ) ) (this_EOL_2= RULE_EOL )* ( ( (lv_table_3_0= ruleTable ) ) | ( (lv_code_4_0= ruleDocString ) ) )? ) )
            // InternalCucumber.g:585:2: ( ( (lv_keyword_0_0= RULE_STEP_KEYWORD ) ) ( (lv_description_1_0= ruleStepDescription ) ) (this_EOL_2= RULE_EOL )* ( ( (lv_table_3_0= ruleTable ) ) | ( (lv_code_4_0= ruleDocString ) ) )? )
            {
            // InternalCucumber.g:585:2: ( ( (lv_keyword_0_0= RULE_STEP_KEYWORD ) ) ( (lv_description_1_0= ruleStepDescription ) ) (this_EOL_2= RULE_EOL )* ( ( (lv_table_3_0= ruleTable ) ) | ( (lv_code_4_0= ruleDocString ) ) )? )
            // InternalCucumber.g:586:3: ( (lv_keyword_0_0= RULE_STEP_KEYWORD ) ) ( (lv_description_1_0= ruleStepDescription ) ) (this_EOL_2= RULE_EOL )* ( ( (lv_table_3_0= ruleTable ) ) | ( (lv_code_4_0= ruleDocString ) ) )?
            {
            // InternalCucumber.g:586:3: ( (lv_keyword_0_0= RULE_STEP_KEYWORD ) )
            // InternalCucumber.g:587:4: (lv_keyword_0_0= RULE_STEP_KEYWORD )
            {
            // InternalCucumber.g:587:4: (lv_keyword_0_0= RULE_STEP_KEYWORD )
            // InternalCucumber.g:588:5: lv_keyword_0_0= RULE_STEP_KEYWORD
            {
            lv_keyword_0_0=(Token)match(input,RULE_STEP_KEYWORD,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_keyword_0_0, grammarAccess.getStepAccess().getKeywordSTEP_KEYWORDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStepRule());
              					}
              					setWithLastConsumed(
              						current,
              						"keyword",
              						lv_keyword_0_0,
              						"mbt.Cucumber.STEP_KEYWORD");
              				
            }

            }


            }

            // InternalCucumber.g:604:3: ( (lv_description_1_0= ruleStepDescription ) )
            // InternalCucumber.g:605:4: (lv_description_1_0= ruleStepDescription )
            {
            // InternalCucumber.g:605:4: (lv_description_1_0= ruleStepDescription )
            // InternalCucumber.g:606:5: lv_description_1_0= ruleStepDescription
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStepAccess().getDescriptionStepDescriptionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_description_1_0=ruleStepDescription();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStepRule());
              					}
              					set(
              						current,
              						"description",
              						lv_description_1_0,
              						"mbt.Cucumber.StepDescription");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCucumber.g:623:3: (this_EOL_2= RULE_EOL )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_EOL) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalCucumber.g:624:4: this_EOL_2= RULE_EOL
            	    {
            	    this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_EOL_2, grammarAccess.getStepAccess().getEOLTerminalRuleCall_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // InternalCucumber.g:629:3: ( ( (lv_table_3_0= ruleTable ) ) | ( (lv_code_4_0= ruleDocString ) ) )?
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_TABLE_CELL) ) {
                alt24=1;
            }
            else if ( (LA24_0==29) ) {
                alt24=2;
            }
            switch (alt24) {
                case 1 :
                    // InternalCucumber.g:630:4: ( (lv_table_3_0= ruleTable ) )
                    {
                    // InternalCucumber.g:630:4: ( (lv_table_3_0= ruleTable ) )
                    // InternalCucumber.g:631:5: (lv_table_3_0= ruleTable )
                    {
                    // InternalCucumber.g:631:5: (lv_table_3_0= ruleTable )
                    // InternalCucumber.g:632:6: lv_table_3_0= ruleTable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStepAccess().getTableTableParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_table_3_0=ruleTable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStepRule());
                      						}
                      						set(
                      							current,
                      							"table",
                      							lv_table_3_0,
                      							"mbt.Cucumber.Table");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:650:4: ( (lv_code_4_0= ruleDocString ) )
                    {
                    // InternalCucumber.g:650:4: ( (lv_code_4_0= ruleDocString ) )
                    // InternalCucumber.g:651:5: (lv_code_4_0= ruleDocString )
                    {
                    // InternalCucumber.g:651:5: (lv_code_4_0= ruleDocString )
                    // InternalCucumber.g:652:6: lv_code_4_0= ruleDocString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStepAccess().getCodeDocStringParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_code_4_0=ruleDocString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStepRule());
                      						}
                      						set(
                      							current,
                      							"code",
                      							lv_code_4_0,
                      							"mbt.Cucumber.DocString");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleExample"
    // InternalCucumber.g:674:1: entryRuleExample returns [EObject current=null] : iv_ruleExample= ruleExample EOF ;
    public final EObject entryRuleExample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExample = null;


        try {
            // InternalCucumber.g:674:48: (iv_ruleExample= ruleExample EOF )
            // InternalCucumber.g:675:2: iv_ruleExample= ruleExample EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExampleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExample=ruleExample();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExample; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExample"


    // $ANTLR start "ruleExample"
    // InternalCucumber.g:681:1: ruleExample returns [EObject current=null] : ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Examples:' ( (lv_title_2_0= ruleTitle ) )? (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_table_5_0= ruleTable ) ) ) ;
    public final EObject ruleExample() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_EOL_3=null;
        EObject lv_tags_0_0 = null;

        AntlrDatatypeRuleToken lv_title_2_0 = null;

        AntlrDatatypeRuleToken lv_narrative_4_0 = null;

        EObject lv_table_5_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:687:2: ( ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Examples:' ( (lv_title_2_0= ruleTitle ) )? (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_table_5_0= ruleTable ) ) ) )
            // InternalCucumber.g:688:2: ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Examples:' ( (lv_title_2_0= ruleTitle ) )? (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_table_5_0= ruleTable ) ) )
            {
            // InternalCucumber.g:688:2: ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Examples:' ( (lv_title_2_0= ruleTitle ) )? (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_table_5_0= ruleTable ) ) )
            // InternalCucumber.g:689:3: ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Examples:' ( (lv_title_2_0= ruleTitle ) )? (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_table_5_0= ruleTable ) )
            {
            // InternalCucumber.g:689:3: ( (lv_tags_0_0= ruleTag ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_TAGNAME) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalCucumber.g:690:4: (lv_tags_0_0= ruleTag )
            	    {
            	    // InternalCucumber.g:690:4: (lv_tags_0_0= ruleTag )
            	    // InternalCucumber.g:691:5: lv_tags_0_0= ruleTag
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getExampleAccess().getTagsTagParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_tags_0_0=ruleTag();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getExampleRule());
            	      					}
            	      					add(
            	      						current,
            	      						"tags",
            	      						lv_tags_0_0,
            	      						"mbt.Cucumber.Tag");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_1=(Token)match(input,27,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExampleAccess().getExamplesKeyword_1());
              		
            }
            // InternalCucumber.g:712:3: ( (lv_title_2_0= ruleTitle ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_WORD && LA26_0<=RULE_PLACEHOLDER)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCucumber.g:713:4: (lv_title_2_0= ruleTitle )
                    {
                    // InternalCucumber.g:713:4: (lv_title_2_0= ruleTitle )
                    // InternalCucumber.g:714:5: lv_title_2_0= ruleTitle
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExampleAccess().getTitleTitleParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_5);
                    lv_title_2_0=ruleTitle();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExampleRule());
                      					}
                      					set(
                      						current,
                      						"title",
                      						lv_title_2_0,
                      						"mbt.Cucumber.Title");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCucumber.g:731:3: (this_EOL_3= RULE_EOL )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_EOL) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalCucumber.g:732:4: this_EOL_3= RULE_EOL
            	    {
            	    this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_EOL_3, grammarAccess.getExampleAccess().getEOLTerminalRuleCall_3());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);

            // InternalCucumber.g:737:3: ( (lv_narrative_4_0= ruleNarrative ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_WORD && LA28_0<=RULE_PLACEHOLDER)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCucumber.g:738:4: (lv_narrative_4_0= ruleNarrative )
                    {
                    // InternalCucumber.g:738:4: (lv_narrative_4_0= ruleNarrative )
                    // InternalCucumber.g:739:5: lv_narrative_4_0= ruleNarrative
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExampleAccess().getNarrativeNarrativeParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_23);
                    lv_narrative_4_0=ruleNarrative();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExampleRule());
                      					}
                      					set(
                      						current,
                      						"narrative",
                      						lv_narrative_4_0,
                      						"mbt.Cucumber.Narrative");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCucumber.g:756:3: ( (lv_table_5_0= ruleTable ) )
            // InternalCucumber.g:757:4: (lv_table_5_0= ruleTable )
            {
            // InternalCucumber.g:757:4: (lv_table_5_0= ruleTable )
            // InternalCucumber.g:758:5: lv_table_5_0= ruleTable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExampleAccess().getTableTableParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_table_5_0=ruleTable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExampleRule());
              					}
              					set(
              						current,
              						"table",
              						lv_table_5_0,
              						"mbt.Cucumber.Table");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExample"


    // $ANTLR start "entryRuleTable"
    // InternalCucumber.g:779:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalCucumber.g:779:46: (iv_ruleTable= ruleTable EOF )
            // InternalCucumber.g:780:2: iv_ruleTable= ruleTable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTable=ruleTable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalCucumber.g:786:1: ruleTable returns [EObject current=null] : ( () ( (lv_rows_1_0= ruleTableRow ) )+ (this_EOL_2= RULE_EOL )* ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token this_EOL_2=null;
        EObject lv_rows_1_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:792:2: ( ( () ( (lv_rows_1_0= ruleTableRow ) )+ (this_EOL_2= RULE_EOL )* ) )
            // InternalCucumber.g:793:2: ( () ( (lv_rows_1_0= ruleTableRow ) )+ (this_EOL_2= RULE_EOL )* )
            {
            // InternalCucumber.g:793:2: ( () ( (lv_rows_1_0= ruleTableRow ) )+ (this_EOL_2= RULE_EOL )* )
            // InternalCucumber.g:794:3: () ( (lv_rows_1_0= ruleTableRow ) )+ (this_EOL_2= RULE_EOL )*
            {
            // InternalCucumber.g:794:3: ()
            // InternalCucumber.g:795:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTableAccess().getTableAction_0(),
              					current);
              			
            }

            }

            // InternalCucumber.g:801:3: ( (lv_rows_1_0= ruleTableRow ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_TABLE_CELL) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalCucumber.g:802:4: (lv_rows_1_0= ruleTableRow )
            	    {
            	    // InternalCucumber.g:802:4: (lv_rows_1_0= ruleTableRow )
            	    // InternalCucumber.g:803:5: lv_rows_1_0= ruleTableRow
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_rows_1_0=ruleTableRow();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTableRule());
            	      					}
            	      					add(
            	      						current,
            	      						"rows",
            	      						lv_rows_1_0,
            	      						"mbt.Cucumber.TableRow");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);

            // InternalCucumber.g:820:3: (this_EOL_2= RULE_EOL )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_EOL) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalCucumber.g:821:4: this_EOL_2= RULE_EOL
            	    {
            	    this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_EOL_2, grammarAccess.getTableAccess().getEOLTerminalRuleCall_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleTableRow"
    // InternalCucumber.g:830:1: entryRuleTableRow returns [EObject current=null] : iv_ruleTableRow= ruleTableRow EOF ;
    public final EObject entryRuleTableRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableRow = null;


        try {
            // InternalCucumber.g:830:49: (iv_ruleTableRow= ruleTableRow EOF )
            // InternalCucumber.g:831:2: iv_ruleTableRow= ruleTableRow EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTableRowRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTableRow=ruleTableRow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTableRow; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTableRow"


    // $ANTLR start "ruleTableRow"
    // InternalCucumber.g:837:1: ruleTableRow returns [EObject current=null] : ( () ( (lv_cols_1_0= ruleTableCol ) )+ otherlv_2= '|' this_EOL_3= RULE_EOL ) ;
    public final EObject ruleTableRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_EOL_3=null;
        EObject lv_cols_1_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:843:2: ( ( () ( (lv_cols_1_0= ruleTableCol ) )+ otherlv_2= '|' this_EOL_3= RULE_EOL ) )
            // InternalCucumber.g:844:2: ( () ( (lv_cols_1_0= ruleTableCol ) )+ otherlv_2= '|' this_EOL_3= RULE_EOL )
            {
            // InternalCucumber.g:844:2: ( () ( (lv_cols_1_0= ruleTableCol ) )+ otherlv_2= '|' this_EOL_3= RULE_EOL )
            // InternalCucumber.g:845:3: () ( (lv_cols_1_0= ruleTableCol ) )+ otherlv_2= '|' this_EOL_3= RULE_EOL
            {
            // InternalCucumber.g:845:3: ()
            // InternalCucumber.g:846:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTableRowAccess().getTableRowAction_0(),
              					current);
              			
            }

            }

            // InternalCucumber.g:852:3: ( (lv_cols_1_0= ruleTableCol ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_TABLE_CELL) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalCucumber.g:853:4: (lv_cols_1_0= ruleTableCol )
            	    {
            	    // InternalCucumber.g:853:4: (lv_cols_1_0= ruleTableCol )
            	    // InternalCucumber.g:854:5: lv_cols_1_0= ruleTableCol
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTableRowAccess().getColsTableColParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_cols_1_0=ruleTableCol();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTableRowRule());
            	      					}
            	      					add(
            	      						current,
            	      						"cols",
            	      						lv_cols_1_0,
            	      						"mbt.Cucumber.TableCol");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);

            otherlv_2=(Token)match(input,28,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTableRowAccess().getVerticalLineKeyword_2());
              		
            }
            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EOL_3, grammarAccess.getTableRowAccess().getEOLTerminalRuleCall_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTableRow"


    // $ANTLR start "entryRuleTableCol"
    // InternalCucumber.g:883:1: entryRuleTableCol returns [EObject current=null] : iv_ruleTableCol= ruleTableCol EOF ;
    public final EObject entryRuleTableCol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableCol = null;


        try {
            // InternalCucumber.g:883:49: (iv_ruleTableCol= ruleTableCol EOF )
            // InternalCucumber.g:884:2: iv_ruleTableCol= ruleTableCol EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTableColRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTableCol=ruleTableCol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTableCol; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTableCol"


    // $ANTLR start "ruleTableCol"
    // InternalCucumber.g:890:1: ruleTableCol returns [EObject current=null] : ( () ( (lv_cell_1_0= RULE_TABLE_CELL ) ) ) ;
    public final EObject ruleTableCol() throws RecognitionException {
        EObject current = null;

        Token lv_cell_1_0=null;


        	enterRule();

        try {
            // InternalCucumber.g:896:2: ( ( () ( (lv_cell_1_0= RULE_TABLE_CELL ) ) ) )
            // InternalCucumber.g:897:2: ( () ( (lv_cell_1_0= RULE_TABLE_CELL ) ) )
            {
            // InternalCucumber.g:897:2: ( () ( (lv_cell_1_0= RULE_TABLE_CELL ) ) )
            // InternalCucumber.g:898:3: () ( (lv_cell_1_0= RULE_TABLE_CELL ) )
            {
            // InternalCucumber.g:898:3: ()
            // InternalCucumber.g:899:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTableColAccess().getTableColAction_0(),
              					current);
              			
            }

            }

            // InternalCucumber.g:905:3: ( (lv_cell_1_0= RULE_TABLE_CELL ) )
            // InternalCucumber.g:906:4: (lv_cell_1_0= RULE_TABLE_CELL )
            {
            // InternalCucumber.g:906:4: (lv_cell_1_0= RULE_TABLE_CELL )
            // InternalCucumber.g:907:5: lv_cell_1_0= RULE_TABLE_CELL
            {
            lv_cell_1_0=(Token)match(input,RULE_TABLE_CELL,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_cell_1_0, grammarAccess.getTableColAccess().getCellTABLE_CELLTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTableColRule());
              					}
              					setWithLastConsumed(
              						current,
              						"cell",
              						lv_cell_1_0,
              						"mbt.Cucumber.TABLE_CELL");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTableCol"


    // $ANTLR start "entryRuleDocString"
    // InternalCucumber.g:927:1: entryRuleDocString returns [EObject current=null] : iv_ruleDocString= ruleDocString EOF ;
    public final EObject entryRuleDocString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocString = null;


        try {
            // InternalCucumber.g:927:50: (iv_ruleDocString= ruleDocString EOF )
            // InternalCucumber.g:928:2: iv_ruleDocString= ruleDocString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDocStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDocString=ruleDocString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDocString; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDocString"


    // $ANTLR start "ruleDocString"
    // InternalCucumber.g:934:1: ruleDocString returns [EObject current=null] : ( () (otherlv_1= '\"\"\"' this_EOL_2= RULE_EOL ( ( RULE_WORD | RULE_INT | RULE_STRING | RULE_ANY_OTHER )=> (lv_text_3_0= ruleText ) ) otherlv_4= '\"\"\"' ) (this_EOL_5= RULE_EOL )* ) ;
    public final EObject ruleDocString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_EOL_2=null;
        Token otherlv_4=null;
        Token this_EOL_5=null;
        EObject lv_text_3_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:940:2: ( ( () (otherlv_1= '\"\"\"' this_EOL_2= RULE_EOL ( ( RULE_WORD | RULE_INT | RULE_STRING | RULE_ANY_OTHER )=> (lv_text_3_0= ruleText ) ) otherlv_4= '\"\"\"' ) (this_EOL_5= RULE_EOL )* ) )
            // InternalCucumber.g:941:2: ( () (otherlv_1= '\"\"\"' this_EOL_2= RULE_EOL ( ( RULE_WORD | RULE_INT | RULE_STRING | RULE_ANY_OTHER )=> (lv_text_3_0= ruleText ) ) otherlv_4= '\"\"\"' ) (this_EOL_5= RULE_EOL )* )
            {
            // InternalCucumber.g:941:2: ( () (otherlv_1= '\"\"\"' this_EOL_2= RULE_EOL ( ( RULE_WORD | RULE_INT | RULE_STRING | RULE_ANY_OTHER )=> (lv_text_3_0= ruleText ) ) otherlv_4= '\"\"\"' ) (this_EOL_5= RULE_EOL )* )
            // InternalCucumber.g:942:3: () (otherlv_1= '\"\"\"' this_EOL_2= RULE_EOL ( ( RULE_WORD | RULE_INT | RULE_STRING | RULE_ANY_OTHER )=> (lv_text_3_0= ruleText ) ) otherlv_4= '\"\"\"' ) (this_EOL_5= RULE_EOL )*
            {
            // InternalCucumber.g:942:3: ()
            // InternalCucumber.g:943:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDocStringAccess().getDocStringAction_0(),
              					current);
              			
            }

            }

            // InternalCucumber.g:949:3: (otherlv_1= '\"\"\"' this_EOL_2= RULE_EOL ( ( RULE_WORD | RULE_INT | RULE_STRING | RULE_ANY_OTHER )=> (lv_text_3_0= ruleText ) ) otherlv_4= '\"\"\"' )
            // InternalCucumber.g:950:4: otherlv_1= '\"\"\"' this_EOL_2= RULE_EOL ( ( RULE_WORD | RULE_INT | RULE_STRING | RULE_ANY_OTHER )=> (lv_text_3_0= ruleText ) ) otherlv_4= '\"\"\"'
            {
            otherlv_1=(Token)match(input,29,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_1_0());
              			
            }
            this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(this_EOL_2, grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_1_1());
              			
            }
            // InternalCucumber.g:958:4: ( ( RULE_WORD | RULE_INT | RULE_STRING | RULE_ANY_OTHER )=> (lv_text_3_0= ruleText ) )
            // InternalCucumber.g:959:5: ( RULE_WORD | RULE_INT | RULE_STRING | RULE_ANY_OTHER )=> (lv_text_3_0= ruleText )
            {
            // InternalCucumber.g:960:5: (lv_text_3_0= ruleText )
            // InternalCucumber.g:961:6: lv_text_3_0= ruleText
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getDocStringAccess().getTextTextParserRuleCall_1_2_0());
              					
            }
            pushFollow(FOLLOW_28);
            lv_text_3_0=ruleText();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getDocStringRule());
              						}
              						set(
              							current,
              							"text",
              							lv_text_3_0,
              							"mbt.Cucumber.Text");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_4, grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_1_3());
              			
            }

            }

            // InternalCucumber.g:983:3: (this_EOL_5= RULE_EOL )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_EOL) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalCucumber.g:984:4: this_EOL_5= RULE_EOL
            	    {
            	    this_EOL_5=(Token)match(input,RULE_EOL,FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_EOL_5, grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDocString"


    // $ANTLR start "entryRuleTitle"
    // InternalCucumber.g:993:1: entryRuleTitle returns [String current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final String entryRuleTitle() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTitle = null;


        try {
            // InternalCucumber.g:993:45: (iv_ruleTitle= ruleTitle EOF )
            // InternalCucumber.g:994:2: iv_ruleTitle= ruleTitle EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTitleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTitle=ruleTitle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTitle.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalCucumber.g:1000:1: ruleTitle returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_WORD_0= RULE_WORD | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_PLACEHOLDER_3= RULE_PLACEHOLDER ) (this_WORD_4= RULE_WORD | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | this_PLACEHOLDER_7= RULE_PLACEHOLDER | this_STEP_KEYWORD_8= RULE_STEP_KEYWORD | this_TAGNAME_9= RULE_TAGNAME )* ) ;
    public final AntlrDatatypeRuleToken ruleTitle() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;
        Token this_PLACEHOLDER_3=null;
        Token this_WORD_4=null;
        Token this_INT_5=null;
        Token this_STRING_6=null;
        Token this_PLACEHOLDER_7=null;
        Token this_STEP_KEYWORD_8=null;
        Token this_TAGNAME_9=null;


        	enterRule();

        try {
            // InternalCucumber.g:1006:2: ( ( (this_WORD_0= RULE_WORD | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_PLACEHOLDER_3= RULE_PLACEHOLDER ) (this_WORD_4= RULE_WORD | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | this_PLACEHOLDER_7= RULE_PLACEHOLDER | this_STEP_KEYWORD_8= RULE_STEP_KEYWORD | this_TAGNAME_9= RULE_TAGNAME )* ) )
            // InternalCucumber.g:1007:2: ( (this_WORD_0= RULE_WORD | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_PLACEHOLDER_3= RULE_PLACEHOLDER ) (this_WORD_4= RULE_WORD | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | this_PLACEHOLDER_7= RULE_PLACEHOLDER | this_STEP_KEYWORD_8= RULE_STEP_KEYWORD | this_TAGNAME_9= RULE_TAGNAME )* )
            {
            // InternalCucumber.g:1007:2: ( (this_WORD_0= RULE_WORD | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_PLACEHOLDER_3= RULE_PLACEHOLDER ) (this_WORD_4= RULE_WORD | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | this_PLACEHOLDER_7= RULE_PLACEHOLDER | this_STEP_KEYWORD_8= RULE_STEP_KEYWORD | this_TAGNAME_9= RULE_TAGNAME )* )
            // InternalCucumber.g:1008:3: (this_WORD_0= RULE_WORD | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_PLACEHOLDER_3= RULE_PLACEHOLDER ) (this_WORD_4= RULE_WORD | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | this_PLACEHOLDER_7= RULE_PLACEHOLDER | this_STEP_KEYWORD_8= RULE_STEP_KEYWORD | this_TAGNAME_9= RULE_TAGNAME )*
            {
            // InternalCucumber.g:1008:3: (this_WORD_0= RULE_WORD | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_PLACEHOLDER_3= RULE_PLACEHOLDER )
            int alt33=4;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                alt33=1;
                }
                break;
            case RULE_INT:
                {
                alt33=2;
                }
                break;
            case RULE_STRING:
                {
                alt33=3;
                }
                break;
            case RULE_PLACEHOLDER:
                {
                alt33=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalCucumber.g:1009:4: this_WORD_0= RULE_WORD
                    {
                    this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_WORD_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_WORD_0, grammarAccess.getTitleAccess().getWORDTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalCucumber.g:1017:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_1, grammarAccess.getTitleAccess().getINTTerminalRuleCall_0_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalCucumber.g:1025:4: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_STRING_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_STRING_2, grammarAccess.getTitleAccess().getSTRINGTerminalRuleCall_0_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalCucumber.g:1033:4: this_PLACEHOLDER_3= RULE_PLACEHOLDER
                    {
                    this_PLACEHOLDER_3=(Token)match(input,RULE_PLACEHOLDER,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PLACEHOLDER_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_PLACEHOLDER_3, grammarAccess.getTitleAccess().getPLACEHOLDERTerminalRuleCall_0_3());
                      			
                    }

                    }
                    break;

            }

            // InternalCucumber.g:1041:3: (this_WORD_4= RULE_WORD | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | this_PLACEHOLDER_7= RULE_PLACEHOLDER | this_STEP_KEYWORD_8= RULE_STEP_KEYWORD | this_TAGNAME_9= RULE_TAGNAME )*
            loop34:
            do {
                int alt34=7;
                switch ( input.LA(1) ) {
                case RULE_WORD:
                    {
                    alt34=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt34=2;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt34=3;
                    }
                    break;
                case RULE_PLACEHOLDER:
                    {
                    alt34=4;
                    }
                    break;
                case RULE_STEP_KEYWORD:
                    {
                    alt34=5;
                    }
                    break;
                case RULE_TAGNAME:
                    {
                    alt34=6;
                    }
                    break;

                }

                switch (alt34) {
            	case 1 :
            	    // InternalCucumber.g:1042:4: this_WORD_4= RULE_WORD
            	    {
            	    this_WORD_4=(Token)match(input,RULE_WORD,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_WORD_4);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_WORD_4, grammarAccess.getTitleAccess().getWORDTerminalRuleCall_1_0());
            	      			
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalCucumber.g:1050:4: this_INT_5= RULE_INT
            	    {
            	    this_INT_5=(Token)match(input,RULE_INT,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_INT_5);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_INT_5, grammarAccess.getTitleAccess().getINTTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;
            	case 3 :
            	    // InternalCucumber.g:1058:4: this_STRING_6= RULE_STRING
            	    {
            	    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_STRING_6);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_STRING_6, grammarAccess.getTitleAccess().getSTRINGTerminalRuleCall_1_2());
            	      			
            	    }

            	    }
            	    break;
            	case 4 :
            	    // InternalCucumber.g:1066:4: this_PLACEHOLDER_7= RULE_PLACEHOLDER
            	    {
            	    this_PLACEHOLDER_7=(Token)match(input,RULE_PLACEHOLDER,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_PLACEHOLDER_7);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_PLACEHOLDER_7, grammarAccess.getTitleAccess().getPLACEHOLDERTerminalRuleCall_1_3());
            	      			
            	    }

            	    }
            	    break;
            	case 5 :
            	    // InternalCucumber.g:1074:4: this_STEP_KEYWORD_8= RULE_STEP_KEYWORD
            	    {
            	    this_STEP_KEYWORD_8=(Token)match(input,RULE_STEP_KEYWORD,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_STEP_KEYWORD_8);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_STEP_KEYWORD_8, grammarAccess.getTitleAccess().getSTEP_KEYWORDTerminalRuleCall_1_4());
            	      			
            	    }

            	    }
            	    break;
            	case 6 :
            	    // InternalCucumber.g:1082:4: this_TAGNAME_9= RULE_TAGNAME
            	    {
            	    this_TAGNAME_9=(Token)match(input,RULE_TAGNAME,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_TAGNAME_9);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_TAGNAME_9, grammarAccess.getTitleAccess().getTAGNAMETerminalRuleCall_1_5());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleNarrative"
    // InternalCucumber.g:1094:1: entryRuleNarrative returns [String current=null] : iv_ruleNarrative= ruleNarrative EOF ;
    public final String entryRuleNarrative() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNarrative = null;


        try {
            // InternalCucumber.g:1094:49: (iv_ruleNarrative= ruleNarrative EOF )
            // InternalCucumber.g:1095:2: iv_ruleNarrative= ruleNarrative EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNarrativeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNarrative=ruleNarrative();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNarrative.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNarrative"


    // $ANTLR start "ruleNarrative"
    // InternalCucumber.g:1101:1: ruleNarrative returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_WORD_0= RULE_WORD | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_PLACEHOLDER_3= RULE_PLACEHOLDER ) (this_WORD_4= RULE_WORD | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | this_PLACEHOLDER_7= RULE_PLACEHOLDER | this_STEP_KEYWORD_8= RULE_STEP_KEYWORD | this_TAGNAME_9= RULE_TAGNAME )* (this_EOL_10= RULE_EOL )+ )+ ;
    public final AntlrDatatypeRuleToken ruleNarrative() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;
        Token this_PLACEHOLDER_3=null;
        Token this_WORD_4=null;
        Token this_INT_5=null;
        Token this_STRING_6=null;
        Token this_PLACEHOLDER_7=null;
        Token this_STEP_KEYWORD_8=null;
        Token this_TAGNAME_9=null;
        Token this_EOL_10=null;


        	enterRule();

        try {
            // InternalCucumber.g:1107:2: ( ( (this_WORD_0= RULE_WORD | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_PLACEHOLDER_3= RULE_PLACEHOLDER ) (this_WORD_4= RULE_WORD | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | this_PLACEHOLDER_7= RULE_PLACEHOLDER | this_STEP_KEYWORD_8= RULE_STEP_KEYWORD | this_TAGNAME_9= RULE_TAGNAME )* (this_EOL_10= RULE_EOL )+ )+ )
            // InternalCucumber.g:1108:2: ( (this_WORD_0= RULE_WORD | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_PLACEHOLDER_3= RULE_PLACEHOLDER ) (this_WORD_4= RULE_WORD | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | this_PLACEHOLDER_7= RULE_PLACEHOLDER | this_STEP_KEYWORD_8= RULE_STEP_KEYWORD | this_TAGNAME_9= RULE_TAGNAME )* (this_EOL_10= RULE_EOL )+ )+
            {
            // InternalCucumber.g:1108:2: ( (this_WORD_0= RULE_WORD | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_PLACEHOLDER_3= RULE_PLACEHOLDER ) (this_WORD_4= RULE_WORD | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | this_PLACEHOLDER_7= RULE_PLACEHOLDER | this_STEP_KEYWORD_8= RULE_STEP_KEYWORD | this_TAGNAME_9= RULE_TAGNAME )* (this_EOL_10= RULE_EOL )+ )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_WORD && LA38_0<=RULE_PLACEHOLDER)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalCucumber.g:1109:3: (this_WORD_0= RULE_WORD | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_PLACEHOLDER_3= RULE_PLACEHOLDER ) (this_WORD_4= RULE_WORD | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | this_PLACEHOLDER_7= RULE_PLACEHOLDER | this_STEP_KEYWORD_8= RULE_STEP_KEYWORD | this_TAGNAME_9= RULE_TAGNAME )* (this_EOL_10= RULE_EOL )+
            	    {
            	    // InternalCucumber.g:1109:3: (this_WORD_0= RULE_WORD | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_PLACEHOLDER_3= RULE_PLACEHOLDER )
            	    int alt35=4;
            	    switch ( input.LA(1) ) {
            	    case RULE_WORD:
            	        {
            	        alt35=1;
            	        }
            	        break;
            	    case RULE_INT:
            	        {
            	        alt35=2;
            	        }
            	        break;
            	    case RULE_STRING:
            	        {
            	        alt35=3;
            	        }
            	        break;
            	    case RULE_PLACEHOLDER:
            	        {
            	        alt35=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt35) {
            	        case 1 :
            	            // InternalCucumber.g:1110:4: this_WORD_0= RULE_WORD
            	            {
            	            this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_30); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              				current.merge(this_WORD_0);
            	              			
            	            }
            	            if ( state.backtracking==0 ) {

            	              				newLeafNode(this_WORD_0, grammarAccess.getNarrativeAccess().getWORDTerminalRuleCall_0_0());
            	              			
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalCucumber.g:1118:4: this_INT_1= RULE_INT
            	            {
            	            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_30); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              				current.merge(this_INT_1);
            	              			
            	            }
            	            if ( state.backtracking==0 ) {

            	              				newLeafNode(this_INT_1, grammarAccess.getNarrativeAccess().getINTTerminalRuleCall_0_1());
            	              			
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalCucumber.g:1126:4: this_STRING_2= RULE_STRING
            	            {
            	            this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_30); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              				current.merge(this_STRING_2);
            	              			
            	            }
            	            if ( state.backtracking==0 ) {

            	              				newLeafNode(this_STRING_2, grammarAccess.getNarrativeAccess().getSTRINGTerminalRuleCall_0_2());
            	              			
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalCucumber.g:1134:4: this_PLACEHOLDER_3= RULE_PLACEHOLDER
            	            {
            	            this_PLACEHOLDER_3=(Token)match(input,RULE_PLACEHOLDER,FOLLOW_30); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              				current.merge(this_PLACEHOLDER_3);
            	              			
            	            }
            	            if ( state.backtracking==0 ) {

            	              				newLeafNode(this_PLACEHOLDER_3, grammarAccess.getNarrativeAccess().getPLACEHOLDERTerminalRuleCall_0_3());
            	              			
            	            }

            	            }
            	            break;

            	    }

            	    // InternalCucumber.g:1142:3: (this_WORD_4= RULE_WORD | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | this_PLACEHOLDER_7= RULE_PLACEHOLDER | this_STEP_KEYWORD_8= RULE_STEP_KEYWORD | this_TAGNAME_9= RULE_TAGNAME )*
            	    loop36:
            	    do {
            	        int alt36=7;
            	        switch ( input.LA(1) ) {
            	        case RULE_WORD:
            	            {
            	            alt36=1;
            	            }
            	            break;
            	        case RULE_INT:
            	            {
            	            alt36=2;
            	            }
            	            break;
            	        case RULE_STRING:
            	            {
            	            alt36=3;
            	            }
            	            break;
            	        case RULE_PLACEHOLDER:
            	            {
            	            alt36=4;
            	            }
            	            break;
            	        case RULE_STEP_KEYWORD:
            	            {
            	            alt36=5;
            	            }
            	            break;
            	        case RULE_TAGNAME:
            	            {
            	            alt36=6;
            	            }
            	            break;

            	        }

            	        switch (alt36) {
            	    	case 1 :
            	    	    // InternalCucumber.g:1143:4: this_WORD_4= RULE_WORD
            	    	    {
            	    	    this_WORD_4=(Token)match(input,RULE_WORD,FOLLOW_30); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      				current.merge(this_WORD_4);
            	    	      			
            	    	    }
            	    	    if ( state.backtracking==0 ) {

            	    	      				newLeafNode(this_WORD_4, grammarAccess.getNarrativeAccess().getWORDTerminalRuleCall_1_0());
            	    	      			
            	    	    }

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalCucumber.g:1151:4: this_INT_5= RULE_INT
            	    	    {
            	    	    this_INT_5=(Token)match(input,RULE_INT,FOLLOW_30); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      				current.merge(this_INT_5);
            	    	      			
            	    	    }
            	    	    if ( state.backtracking==0 ) {

            	    	      				newLeafNode(this_INT_5, grammarAccess.getNarrativeAccess().getINTTerminalRuleCall_1_1());
            	    	      			
            	    	    }

            	    	    }
            	    	    break;
            	    	case 3 :
            	    	    // InternalCucumber.g:1159:4: this_STRING_6= RULE_STRING
            	    	    {
            	    	    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_30); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      				current.merge(this_STRING_6);
            	    	      			
            	    	    }
            	    	    if ( state.backtracking==0 ) {

            	    	      				newLeafNode(this_STRING_6, grammarAccess.getNarrativeAccess().getSTRINGTerminalRuleCall_1_2());
            	    	      			
            	    	    }

            	    	    }
            	    	    break;
            	    	case 4 :
            	    	    // InternalCucumber.g:1167:4: this_PLACEHOLDER_7= RULE_PLACEHOLDER
            	    	    {
            	    	    this_PLACEHOLDER_7=(Token)match(input,RULE_PLACEHOLDER,FOLLOW_30); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      				current.merge(this_PLACEHOLDER_7);
            	    	      			
            	    	    }
            	    	    if ( state.backtracking==0 ) {

            	    	      				newLeafNode(this_PLACEHOLDER_7, grammarAccess.getNarrativeAccess().getPLACEHOLDERTerminalRuleCall_1_3());
            	    	      			
            	    	    }

            	    	    }
            	    	    break;
            	    	case 5 :
            	    	    // InternalCucumber.g:1175:4: this_STEP_KEYWORD_8= RULE_STEP_KEYWORD
            	    	    {
            	    	    this_STEP_KEYWORD_8=(Token)match(input,RULE_STEP_KEYWORD,FOLLOW_30); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      				current.merge(this_STEP_KEYWORD_8);
            	    	      			
            	    	    }
            	    	    if ( state.backtracking==0 ) {

            	    	      				newLeafNode(this_STEP_KEYWORD_8, grammarAccess.getNarrativeAccess().getSTEP_KEYWORDTerminalRuleCall_1_4());
            	    	      			
            	    	    }

            	    	    }
            	    	    break;
            	    	case 6 :
            	    	    // InternalCucumber.g:1183:4: this_TAGNAME_9= RULE_TAGNAME
            	    	    {
            	    	    this_TAGNAME_9=(Token)match(input,RULE_TAGNAME,FOLLOW_30); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      				current.merge(this_TAGNAME_9);
            	    	      			
            	    	    }
            	    	    if ( state.backtracking==0 ) {

            	    	      				newLeafNode(this_TAGNAME_9, grammarAccess.getNarrativeAccess().getTAGNAMETerminalRuleCall_1_5());
            	    	      			
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop36;
            	        }
            	    } while (true);

            	    // InternalCucumber.g:1191:3: (this_EOL_10= RULE_EOL )+
            	    int cnt37=0;
            	    loop37:
            	    do {
            	        int alt37=2;
            	        int LA37_0 = input.LA(1);

            	        if ( (LA37_0==RULE_EOL) ) {
            	            alt37=1;
            	        }


            	        switch (alt37) {
            	    	case 1 :
            	    	    // InternalCucumber.g:1192:4: this_EOL_10= RULE_EOL
            	    	    {
            	    	    this_EOL_10=(Token)match(input,RULE_EOL,FOLLOW_31); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      				current.merge(this_EOL_10);
            	    	      			
            	    	    }
            	    	    if ( state.backtracking==0 ) {

            	    	      				newLeafNode(this_EOL_10, grammarAccess.getNarrativeAccess().getEOLTerminalRuleCall_2());
            	    	      			
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt37 >= 1 ) break loop37;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(37, input);
            	                throw eee;
            	        }
            	        cnt37++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNarrative"


    // $ANTLR start "entryRuleStepDescription"
    // InternalCucumber.g:1204:1: entryRuleStepDescription returns [String current=null] : iv_ruleStepDescription= ruleStepDescription EOF ;
    public final String entryRuleStepDescription() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStepDescription = null;


        try {
            // InternalCucumber.g:1204:55: (iv_ruleStepDescription= ruleStepDescription EOF )
            // InternalCucumber.g:1205:2: iv_ruleStepDescription= ruleStepDescription EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStepDescriptionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStepDescription=ruleStepDescription();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStepDescription.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStepDescription"


    // $ANTLR start "ruleStepDescription"
    // InternalCucumber.g:1211:1: ruleStepDescription returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WORD_0= RULE_WORD | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_PLACEHOLDER_3= RULE_PLACEHOLDER | this_STEP_KEYWORD_4= RULE_STEP_KEYWORD | this_TAGNAME_5= RULE_TAGNAME )+ ;
    public final AntlrDatatypeRuleToken ruleStepDescription() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;
        Token this_PLACEHOLDER_3=null;
        Token this_STEP_KEYWORD_4=null;
        Token this_TAGNAME_5=null;


        	enterRule();

        try {
            // InternalCucumber.g:1217:2: ( (this_WORD_0= RULE_WORD | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_PLACEHOLDER_3= RULE_PLACEHOLDER | this_STEP_KEYWORD_4= RULE_STEP_KEYWORD | this_TAGNAME_5= RULE_TAGNAME )+ )
            // InternalCucumber.g:1218:2: (this_WORD_0= RULE_WORD | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_PLACEHOLDER_3= RULE_PLACEHOLDER | this_STEP_KEYWORD_4= RULE_STEP_KEYWORD | this_TAGNAME_5= RULE_TAGNAME )+
            {
            // InternalCucumber.g:1218:2: (this_WORD_0= RULE_WORD | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_PLACEHOLDER_3= RULE_PLACEHOLDER | this_STEP_KEYWORD_4= RULE_STEP_KEYWORD | this_TAGNAME_5= RULE_TAGNAME )+
            int cnt39=0;
            loop39:
            do {
                int alt39=7;
                switch ( input.LA(1) ) {
                case RULE_TAGNAME:
                    {
                    alt39=6;
                    }
                    break;
                case RULE_STEP_KEYWORD:
                    {
                    alt39=5;
                    }
                    break;
                case RULE_WORD:
                    {
                    alt39=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt39=2;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt39=3;
                    }
                    break;
                case RULE_PLACEHOLDER:
                    {
                    alt39=4;
                    }
                    break;

                }

                switch (alt39) {
            	case 1 :
            	    // InternalCucumber.g:1219:3: this_WORD_0= RULE_WORD
            	    {
            	    this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_WORD_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_WORD_0, grammarAccess.getStepDescriptionAccess().getWORDTerminalRuleCall_0());
            	      		
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalCucumber.g:1227:3: this_INT_1= RULE_INT
            	    {
            	    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_INT_1);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_INT_1, grammarAccess.getStepDescriptionAccess().getINTTerminalRuleCall_1());
            	      		
            	    }

            	    }
            	    break;
            	case 3 :
            	    // InternalCucumber.g:1235:3: this_STRING_2= RULE_STRING
            	    {
            	    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_STRING_2);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_STRING_2, grammarAccess.getStepDescriptionAccess().getSTRINGTerminalRuleCall_2());
            	      		
            	    }

            	    }
            	    break;
            	case 4 :
            	    // InternalCucumber.g:1243:3: this_PLACEHOLDER_3= RULE_PLACEHOLDER
            	    {
            	    this_PLACEHOLDER_3=(Token)match(input,RULE_PLACEHOLDER,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_PLACEHOLDER_3);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_PLACEHOLDER_3, grammarAccess.getStepDescriptionAccess().getPLACEHOLDERTerminalRuleCall_3());
            	      		
            	    }

            	    }
            	    break;
            	case 5 :
            	    // InternalCucumber.g:1251:3: this_STEP_KEYWORD_4= RULE_STEP_KEYWORD
            	    {
            	    this_STEP_KEYWORD_4=(Token)match(input,RULE_STEP_KEYWORD,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_STEP_KEYWORD_4);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_STEP_KEYWORD_4, grammarAccess.getStepDescriptionAccess().getSTEP_KEYWORDTerminalRuleCall_4());
            	      		
            	    }

            	    }
            	    break;
            	case 6 :
            	    // InternalCucumber.g:1259:3: this_TAGNAME_5= RULE_TAGNAME
            	    {
            	    this_TAGNAME_5=(Token)match(input,RULE_TAGNAME,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_TAGNAME_5);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_TAGNAME_5, grammarAccess.getStepDescriptionAccess().getTAGNAMETerminalRuleCall_5());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStepDescription"


    // $ANTLR start "entryRuleTag"
    // InternalCucumber.g:1270:1: entryRuleTag returns [EObject current=null] : iv_ruleTag= ruleTag EOF ;
    public final EObject entryRuleTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTag = null;


        try {
            // InternalCucumber.g:1270:44: (iv_ruleTag= ruleTag EOF )
            // InternalCucumber.g:1271:2: iv_ruleTag= ruleTag EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTag=ruleTag();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTag; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // InternalCucumber.g:1277:1: ruleTag returns [EObject current=null] : ( ( (lv_id_0_0= RULE_TAGNAME ) ) (this_EOL_1= RULE_EOL )? ) ;
    public final EObject ruleTag() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token this_EOL_1=null;


        	enterRule();

        try {
            // InternalCucumber.g:1283:2: ( ( ( (lv_id_0_0= RULE_TAGNAME ) ) (this_EOL_1= RULE_EOL )? ) )
            // InternalCucumber.g:1284:2: ( ( (lv_id_0_0= RULE_TAGNAME ) ) (this_EOL_1= RULE_EOL )? )
            {
            // InternalCucumber.g:1284:2: ( ( (lv_id_0_0= RULE_TAGNAME ) ) (this_EOL_1= RULE_EOL )? )
            // InternalCucumber.g:1285:3: ( (lv_id_0_0= RULE_TAGNAME ) ) (this_EOL_1= RULE_EOL )?
            {
            // InternalCucumber.g:1285:3: ( (lv_id_0_0= RULE_TAGNAME ) )
            // InternalCucumber.g:1286:4: (lv_id_0_0= RULE_TAGNAME )
            {
            // InternalCucumber.g:1286:4: (lv_id_0_0= RULE_TAGNAME )
            // InternalCucumber.g:1287:5: lv_id_0_0= RULE_TAGNAME
            {
            lv_id_0_0=(Token)match(input,RULE_TAGNAME,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_id_0_0, grammarAccess.getTagAccess().getIdTAGNAMETerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTagRule());
              					}
              					setWithLastConsumed(
              						current,
              						"id",
              						lv_id_0_0,
              						"mbt.Cucumber.TAGNAME");
              				
            }

            }


            }

            // InternalCucumber.g:1303:3: (this_EOL_1= RULE_EOL )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_EOL) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCucumber.g:1304:4: this_EOL_1= RULE_EOL
                    {
                    this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_EOL_1, grammarAccess.getTagAccess().getEOLTerminalRuleCall_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleText"
    // InternalCucumber.g:1313:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalCucumber.g:1313:45: (iv_ruleText= ruleText EOF )
            // InternalCucumber.g:1314:2: iv_ruleText= ruleText EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleText; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalCucumber.g:1320:1: ruleText returns [EObject current=null] : ( () ( (lv_lines_1_0= ruleTextLine ) )* ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        EObject lv_lines_1_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:1326:2: ( ( () ( (lv_lines_1_0= ruleTextLine ) )* ) )
            // InternalCucumber.g:1327:2: ( () ( (lv_lines_1_0= ruleTextLine ) )* )
            {
            // InternalCucumber.g:1327:2: ( () ( (lv_lines_1_0= ruleTextLine ) )* )
            // InternalCucumber.g:1328:3: () ( (lv_lines_1_0= ruleTextLine ) )*
            {
            // InternalCucumber.g:1328:3: ()
            // InternalCucumber.g:1329:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTextAccess().getTextAction_0(),
              					current);
              			
            }

            }

            // InternalCucumber.g:1335:3: ( (lv_lines_1_0= ruleTextLine ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=RULE_WORD && LA41_0<=RULE_STRING)||LA41_0==RULE_ANY_OTHER) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalCucumber.g:1336:4: (lv_lines_1_0= ruleTextLine )
            	    {
            	    // InternalCucumber.g:1336:4: (lv_lines_1_0= ruleTextLine )
            	    // InternalCucumber.g:1337:5: lv_lines_1_0= ruleTextLine
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTextAccess().getLinesTextLineParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_32);
            	    lv_lines_1_0=ruleTextLine();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTextRule());
            	      					}
            	      					add(
            	      						current,
            	      						"lines",
            	      						lv_lines_1_0,
            	      						"mbt.Cucumber.TextLine");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleTextLine"
    // InternalCucumber.g:1358:1: entryRuleTextLine returns [EObject current=null] : iv_ruleTextLine= ruleTextLine EOF ;
    public final EObject entryRuleTextLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextLine = null;


        try {
            // InternalCucumber.g:1358:49: (iv_ruleTextLine= ruleTextLine EOF )
            // InternalCucumber.g:1359:2: iv_ruleTextLine= ruleTextLine EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextLineRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTextLine=ruleTextLine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextLine; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextLine"


    // $ANTLR start "ruleTextLine"
    // InternalCucumber.g:1365:1: ruleTextLine returns [EObject current=null] : ( () ( (lv_value_1_0= ruleTEXT_VALUE ) ) (this_EOL_2= RULE_EOL )+ ) ;
    public final EObject ruleTextLine() throws RecognitionException {
        EObject current = null;

        Token this_EOL_2=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:1371:2: ( ( () ( (lv_value_1_0= ruleTEXT_VALUE ) ) (this_EOL_2= RULE_EOL )+ ) )
            // InternalCucumber.g:1372:2: ( () ( (lv_value_1_0= ruleTEXT_VALUE ) ) (this_EOL_2= RULE_EOL )+ )
            {
            // InternalCucumber.g:1372:2: ( () ( (lv_value_1_0= ruleTEXT_VALUE ) ) (this_EOL_2= RULE_EOL )+ )
            // InternalCucumber.g:1373:3: () ( (lv_value_1_0= ruleTEXT_VALUE ) ) (this_EOL_2= RULE_EOL )+
            {
            // InternalCucumber.g:1373:3: ()
            // InternalCucumber.g:1374:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTextLineAccess().getTextLineAction_0(),
              					current);
              			
            }

            }

            // InternalCucumber.g:1380:3: ( (lv_value_1_0= ruleTEXT_VALUE ) )
            // InternalCucumber.g:1381:4: (lv_value_1_0= ruleTEXT_VALUE )
            {
            // InternalCucumber.g:1381:4: (lv_value_1_0= ruleTEXT_VALUE )
            // InternalCucumber.g:1382:5: lv_value_1_0= ruleTEXT_VALUE
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTextLineAccess().getValueTEXT_VALUEParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_value_1_0=ruleTEXT_VALUE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTextLineRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
              						"mbt.Cucumber.TEXT_VALUE");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCucumber.g:1399:3: (this_EOL_2= RULE_EOL )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_EOL) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalCucumber.g:1400:4: this_EOL_2= RULE_EOL
            	    {
            	    this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_EOL_2, grammarAccess.getTextLineAccess().getEOLTerminalRuleCall_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextLine"


    // $ANTLR start "entryRuleTEXT_VALUE"
    // InternalCucumber.g:1409:1: entryRuleTEXT_VALUE returns [String current=null] : iv_ruleTEXT_VALUE= ruleTEXT_VALUE EOF ;
    public final String entryRuleTEXT_VALUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTEXT_VALUE = null;


        try {
            // InternalCucumber.g:1409:50: (iv_ruleTEXT_VALUE= ruleTEXT_VALUE EOF )
            // InternalCucumber.g:1410:2: iv_ruleTEXT_VALUE= ruleTEXT_VALUE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTEXT_VALUERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTEXT_VALUE=ruleTEXT_VALUE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTEXT_VALUE.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTEXT_VALUE"


    // $ANTLR start "ruleTEXT_VALUE"
    // InternalCucumber.g:1416:1: ruleTEXT_VALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TEXT_LITERAL_0= ruleTEXT_LITERAL (this_TEXT_LITERAL_1= ruleTEXT_LITERAL )* ) ;
    public final AntlrDatatypeRuleToken ruleTEXT_VALUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TEXT_LITERAL_0 = null;

        AntlrDatatypeRuleToken this_TEXT_LITERAL_1 = null;



        	enterRule();

        try {
            // InternalCucumber.g:1422:2: ( (this_TEXT_LITERAL_0= ruleTEXT_LITERAL (this_TEXT_LITERAL_1= ruleTEXT_LITERAL )* ) )
            // InternalCucumber.g:1423:2: (this_TEXT_LITERAL_0= ruleTEXT_LITERAL (this_TEXT_LITERAL_1= ruleTEXT_LITERAL )* )
            {
            // InternalCucumber.g:1423:2: (this_TEXT_LITERAL_0= ruleTEXT_LITERAL (this_TEXT_LITERAL_1= ruleTEXT_LITERAL )* )
            // InternalCucumber.g:1424:3: this_TEXT_LITERAL_0= ruleTEXT_LITERAL (this_TEXT_LITERAL_1= ruleTEXT_LITERAL )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTEXT_VALUEAccess().getTEXT_LITERALParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_32);
            this_TEXT_LITERAL_0=ruleTEXT_LITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_TEXT_LITERAL_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCucumber.g:1434:3: (this_TEXT_LITERAL_1= ruleTEXT_LITERAL )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=RULE_WORD && LA43_0<=RULE_STRING)||LA43_0==RULE_ANY_OTHER) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalCucumber.g:1435:4: this_TEXT_LITERAL_1= ruleTEXT_LITERAL
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getTEXT_VALUEAccess().getTEXT_LITERALParserRuleCall_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_32);
            	    this_TEXT_LITERAL_1=ruleTEXT_LITERAL();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_TEXT_LITERAL_1);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTEXT_VALUE"


    // $ANTLR start "entryRuleTEXT_LITERAL"
    // InternalCucumber.g:1450:1: entryRuleTEXT_LITERAL returns [String current=null] : iv_ruleTEXT_LITERAL= ruleTEXT_LITERAL EOF ;
    public final String entryRuleTEXT_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTEXT_LITERAL = null;


        try {
            // InternalCucumber.g:1450:52: (iv_ruleTEXT_LITERAL= ruleTEXT_LITERAL EOF )
            // InternalCucumber.g:1451:2: iv_ruleTEXT_LITERAL= ruleTEXT_LITERAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTEXT_LITERALRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTEXT_LITERAL=ruleTEXT_LITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTEXT_LITERAL.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTEXT_LITERAL"


    // $ANTLR start "ruleTEXT_LITERAL"
    // InternalCucumber.g:1457:1: ruleTEXT_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WORD_0= RULE_WORD | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_ANY_OTHER_3= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken ruleTEXT_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;
        Token this_ANY_OTHER_3=null;


        	enterRule();

        try {
            // InternalCucumber.g:1463:2: ( (this_WORD_0= RULE_WORD | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_ANY_OTHER_3= RULE_ANY_OTHER ) )
            // InternalCucumber.g:1464:2: (this_WORD_0= RULE_WORD | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_ANY_OTHER_3= RULE_ANY_OTHER )
            {
            // InternalCucumber.g:1464:2: (this_WORD_0= RULE_WORD | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_ANY_OTHER_3= RULE_ANY_OTHER )
            int alt44=4;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                alt44=1;
                }
                break;
            case RULE_INT:
                {
                alt44=2;
                }
                break;
            case RULE_STRING:
                {
                alt44=3;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt44=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalCucumber.g:1465:3: this_WORD_0= RULE_WORD
                    {
                    this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_WORD_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_WORD_0, grammarAccess.getTEXT_LITERALAccess().getWORDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCucumber.g:1473:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_1, grammarAccess.getTEXT_LITERALAccess().getINTTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCucumber.g:1481:3: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_2, grammarAccess.getTEXT_LITERALAccess().getSTRINGTerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalCucumber.g:1489:3: this_ANY_OTHER_3= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_3=(Token)match(input,RULE_ANY_OTHER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ANY_OTHER_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ANY_OTHER_3, grammarAccess.getTEXT_LITERALAccess().getANY_OTHERTerminalRuleCall_3());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTEXT_LITERAL"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String dfa_1s = "\42\uffff";
    static final String dfa_2s = "\1\13\2\4\1\uffff\1\13\17\4\1\5\7\4\6\uffff";
    static final String dfa_3s = "\2\31\1\12\1\uffff\1\31\4\13\1\12\21\13\1\12\6\uffff";
    static final String dfa_4s = "\3\uffff\1\2\30\uffff\6\1";
    static final String dfa_5s = "\42\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\13\uffff\1\2\2\3",
            "\1\4\6\uffff\1\1\13\uffff\1\2\2\3",
            "\1\11\2\uffff\1\5\1\6\1\7\1\10",
            "",
            "\1\1\13\uffff\1\2\2\3",
            "\1\11\1\16\1\uffff\1\12\1\13\1\14\1\15\1\17",
            "\1\11\1\16\1\uffff\1\12\1\13\1\14\1\15\1\17",
            "\1\11\1\16\1\uffff\1\12\1\13\1\14\1\15\1\17",
            "\1\11\1\16\1\uffff\1\12\1\13\1\14\1\15\1\17",
            "\1\11\1\24\1\uffff\1\20\1\21\1\22\1\23",
            "\1\11\1\16\1\uffff\1\12\1\13\1\14\1\15\1\17",
            "\1\11\1\16\1\uffff\1\12\1\13\1\14\1\15\1\17",
            "\1\11\1\16\1\uffff\1\12\1\13\1\14\1\15\1\17",
            "\1\11\1\16\1\uffff\1\12\1\13\1\14\1\15\1\17",
            "\1\11\1\16\1\uffff\1\12\1\13\1\14\1\15\1\17",
            "\1\11\1\16\1\uffff\1\12\1\13\1\14\1\15\1\17",
            "\1\33\1\31\1\uffff\1\25\1\26\1\27\1\30\1\32",
            "\1\33\1\31\1\uffff\1\25\1\26\1\27\1\30\1\32",
            "\1\33\1\31\1\uffff\1\25\1\26\1\27\1\30\1\32",
            "\1\33\1\31\1\uffff\1\25\1\26\1\27\1\30\1\32",
            "\1\40\1\uffff\1\34\1\35\1\36\1\37\1\41",
            "\1\33\1\31\1\uffff\1\25\1\26\1\27\1\30\1\32",
            "\1\33\1\31\1\uffff\1\25\1\26\1\27\1\30\1\32",
            "\1\33\1\31\1\uffff\1\25\1\26\1\27\1\30\1\32",
            "\1\33\1\31\1\uffff\1\25\1\26\1\27\1\30\1\32",
            "\1\33\1\31\1\uffff\1\25\1\26\1\27\1\30\1\32",
            "\1\33\1\31\1\uffff\1\25\1\26\1\27\1\30\1\32",
            "\1\33\1\24\1\uffff\1\20\1\21\1\22\1\23",
            "",
            "",
            "",
            "",
            "",
            ""
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
            return "146:3: ( (lv_background_5_0= ruleBackground ) )?";
        }
    }
    static final String dfa_7s = "\6\uffff";
    static final String dfa_8s = "\1\13\1\4\3\uffff\1\13";
    static final String dfa_9s = "\2\31\3\uffff\1\31";
    static final String dfa_10s = "\2\uffff\1\1\1\2\1\3\1\uffff";
    static final String dfa_11s = "\6\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\13\uffff\1\4\1\2\1\3",
            "\1\5\6\uffff\1\1\13\uffff\1\4\1\2\1\3",
            "",
            "",
            "",
            "\1\1\13\uffff\1\4\1\2\1\3"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "202:2: (this_Scenario_0= ruleScenario | this_ScenarioOutline_1= ruleScenarioOutline | this_Background_2= ruleBackground )";
        }
    }
    static final String dfa_13s = "\5\uffff";
    static final String dfa_14s = "\1\1\4\uffff";
    static final String dfa_15s = "\1\13\1\uffff\1\4\1\uffff\1\13";
    static final String dfa_16s = "\1\33\1\uffff\1\33\1\uffff\1\33";
    static final String dfa_17s = "\1\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String dfa_18s = "\5\uffff}>";
    static final String[] dfa_19s = {
            "\1\2\13\uffff\3\1\1\uffff\1\3",
            "",
            "\1\4\6\uffff\1\2\13\uffff\3\1\1\uffff\1\3",
            "",
            "\1\2\13\uffff\3\1\1\uffff\1\3"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "()+ loopback of 548:3: ( (lv_examples_7_0= ruleExample ) )+";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000780L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000003C00F90L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000003C00F80L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000003C00F82L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000C00800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000790L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000007B0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000007A0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000007A2L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001400800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002400800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008400FA0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008400802L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000FA0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000052L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008400800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000000007D0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020001380L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000FA2L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000FB0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000792L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000001382L});

}
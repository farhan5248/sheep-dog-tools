package org.farhan.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.farhan.services.CucumberGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCucumberParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_TAG", "RULE_WORD", "RULE_WS", "RULE_COMMENT", "'Feature:'", "'Background:'", "'Scenario:'", "'Scenario Outline:'", "'Examples:'", "'Given'", "'When'", "'Then'", "'And'", "'But'", "'*'", "'|'", "'\"\"\"'"
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
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCucumber.g:71:1: ruleFeature returns [EObject current=null] : ( ruleTags otherlv_1= 'Feature:' ( (lv_title_2_0= ruleSentence ) ) (this_EOL_3= RULE_EOL )? ( (lv_description_4_0= ruleDescription ) ) ( (lv_background_5_0= ruleBackground ) )? ( (lv_scenarios_6_0= ruleAbstractScenario ) )* ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_EOL_3=null;
        AntlrDatatypeRuleToken lv_title_2_0 = null;

        EObject lv_description_4_0 = null;

        EObject lv_background_5_0 = null;

        EObject lv_scenarios_6_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:77:2: ( ( ruleTags otherlv_1= 'Feature:' ( (lv_title_2_0= ruleSentence ) ) (this_EOL_3= RULE_EOL )? ( (lv_description_4_0= ruleDescription ) ) ( (lv_background_5_0= ruleBackground ) )? ( (lv_scenarios_6_0= ruleAbstractScenario ) )* ) )
            // InternalCucumber.g:78:2: ( ruleTags otherlv_1= 'Feature:' ( (lv_title_2_0= ruleSentence ) ) (this_EOL_3= RULE_EOL )? ( (lv_description_4_0= ruleDescription ) ) ( (lv_background_5_0= ruleBackground ) )? ( (lv_scenarios_6_0= ruleAbstractScenario ) )* )
            {
            // InternalCucumber.g:78:2: ( ruleTags otherlv_1= 'Feature:' ( (lv_title_2_0= ruleSentence ) ) (this_EOL_3= RULE_EOL )? ( (lv_description_4_0= ruleDescription ) ) ( (lv_background_5_0= ruleBackground ) )? ( (lv_scenarios_6_0= ruleAbstractScenario ) )* )
            // InternalCucumber.g:79:3: ruleTags otherlv_1= 'Feature:' ( (lv_title_2_0= ruleSentence ) ) (this_EOL_3= RULE_EOL )? ( (lv_description_4_0= ruleDescription ) ) ( (lv_background_5_0= ruleBackground ) )? ( (lv_scenarios_6_0= ruleAbstractScenario ) )*
            {

            			newCompositeNode(grammarAccess.getFeatureAccess().getTagsParserRuleCall_0());
            		
            pushFollow(FOLLOW_3);
            ruleTags();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,9,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getFeatureKeyword_1());
            		
            // InternalCucumber.g:90:3: ( (lv_title_2_0= ruleSentence ) )
            // InternalCucumber.g:91:4: (lv_title_2_0= ruleSentence )
            {
            // InternalCucumber.g:91:4: (lv_title_2_0= ruleSentence )
            // InternalCucumber.g:92:5: lv_title_2_0= ruleSentence
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getTitleSentenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_title_2_0=ruleSentence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureRule());
            					}
            					set(
            						current,
            						"title",
            						lv_title_2_0,
            						"org.farhan.Cucumber.Sentence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCucumber.g:109:3: (this_EOL_3= RULE_EOL )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_EOL) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCucumber.g:110:4: this_EOL_3= RULE_EOL
                    {
                    this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_5); 

                    				newLeafNode(this_EOL_3, grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_3());
                    			

                    }
                    break;

            }

            // InternalCucumber.g:115:3: ( (lv_description_4_0= ruleDescription ) )
            // InternalCucumber.g:116:4: (lv_description_4_0= ruleDescription )
            {
            // InternalCucumber.g:116:4: (lv_description_4_0= ruleDescription )
            // InternalCucumber.g:117:5: lv_description_4_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getDescriptionDescriptionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_description_4_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_4_0,
            						"org.farhan.Cucumber.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCucumber.g:134:3: ( (lv_background_5_0= ruleBackground ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==10) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCucumber.g:135:4: (lv_background_5_0= ruleBackground )
                    {
                    // InternalCucumber.g:135:4: (lv_background_5_0= ruleBackground )
                    // InternalCucumber.g:136:5: lv_background_5_0= ruleBackground
                    {

                    					newCompositeNode(grammarAccess.getFeatureAccess().getBackgroundBackgroundParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_background_5_0=ruleBackground();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFeatureRule());
                    					}
                    					set(
                    						current,
                    						"background",
                    						lv_background_5_0,
                    						"org.farhan.Cucumber.Background");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCucumber.g:153:3: ( (lv_scenarios_6_0= ruleAbstractScenario ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_EOL && LA3_0<=RULE_TAG)||(LA3_0>=11 && LA3_0<=12)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCucumber.g:154:4: (lv_scenarios_6_0= ruleAbstractScenario )
            	    {
            	    // InternalCucumber.g:154:4: (lv_scenarios_6_0= ruleAbstractScenario )
            	    // InternalCucumber.g:155:5: lv_scenarios_6_0= ruleAbstractScenario
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureAccess().getScenariosAbstractScenarioParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_scenarios_6_0=ruleAbstractScenario();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"scenarios",
            	    						lv_scenarios_6_0,
            	    						"org.farhan.Cucumber.AbstractScenario");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleBackground"
    // InternalCucumber.g:176:1: entryRuleBackground returns [EObject current=null] : iv_ruleBackground= ruleBackground EOF ;
    public final EObject entryRuleBackground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackground = null;


        try {
            // InternalCucumber.g:176:51: (iv_ruleBackground= ruleBackground EOF )
            // InternalCucumber.g:177:2: iv_ruleBackground= ruleBackground EOF
            {
             newCompositeNode(grammarAccess.getBackgroundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBackground=ruleBackground();

            state._fsp--;

             current =iv_ruleBackground; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCucumber.g:183:1: ruleBackground returns [EObject current=null] : (otherlv_0= 'Background:' ( (lv_title_1_0= ruleSentence ) ) (this_EOL_2= RULE_EOL )? ( (lv_description_3_0= ruleDescription ) ) ( (lv_steps_4_0= ruleStep ) )* ) ;
    public final EObject ruleBackground() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EOL_2=null;
        AntlrDatatypeRuleToken lv_title_1_0 = null;

        EObject lv_description_3_0 = null;

        EObject lv_steps_4_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:189:2: ( (otherlv_0= 'Background:' ( (lv_title_1_0= ruleSentence ) ) (this_EOL_2= RULE_EOL )? ( (lv_description_3_0= ruleDescription ) ) ( (lv_steps_4_0= ruleStep ) )* ) )
            // InternalCucumber.g:190:2: (otherlv_0= 'Background:' ( (lv_title_1_0= ruleSentence ) ) (this_EOL_2= RULE_EOL )? ( (lv_description_3_0= ruleDescription ) ) ( (lv_steps_4_0= ruleStep ) )* )
            {
            // InternalCucumber.g:190:2: (otherlv_0= 'Background:' ( (lv_title_1_0= ruleSentence ) ) (this_EOL_2= RULE_EOL )? ( (lv_description_3_0= ruleDescription ) ) ( (lv_steps_4_0= ruleStep ) )* )
            // InternalCucumber.g:191:3: otherlv_0= 'Background:' ( (lv_title_1_0= ruleSentence ) ) (this_EOL_2= RULE_EOL )? ( (lv_description_3_0= ruleDescription ) ) ( (lv_steps_4_0= ruleStep ) )*
            {
            otherlv_0=(Token)match(input,10,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBackgroundAccess().getBackgroundKeyword_0());
            		
            // InternalCucumber.g:195:3: ( (lv_title_1_0= ruleSentence ) )
            // InternalCucumber.g:196:4: (lv_title_1_0= ruleSentence )
            {
            // InternalCucumber.g:196:4: (lv_title_1_0= ruleSentence )
            // InternalCucumber.g:197:5: lv_title_1_0= ruleSentence
            {

            					newCompositeNode(grammarAccess.getBackgroundAccess().getTitleSentenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_title_1_0=ruleSentence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBackgroundRule());
            					}
            					set(
            						current,
            						"title",
            						lv_title_1_0,
            						"org.farhan.Cucumber.Sentence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCucumber.g:214:3: (this_EOL_2= RULE_EOL )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_EOL) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCucumber.g:215:4: this_EOL_2= RULE_EOL
                    {
                    this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_9); 

                    				newLeafNode(this_EOL_2, grammarAccess.getBackgroundAccess().getEOLTerminalRuleCall_2());
                    			

                    }
                    break;

            }

            // InternalCucumber.g:220:3: ( (lv_description_3_0= ruleDescription ) )
            // InternalCucumber.g:221:4: (lv_description_3_0= ruleDescription )
            {
            // InternalCucumber.g:221:4: (lv_description_3_0= ruleDescription )
            // InternalCucumber.g:222:5: lv_description_3_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getBackgroundAccess().getDescriptionDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_description_3_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBackgroundRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.farhan.Cucumber.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCucumber.g:239:3: ( (lv_steps_4_0= ruleStep ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=14 && LA5_0<=19)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCucumber.g:240:4: (lv_steps_4_0= ruleStep )
            	    {
            	    // InternalCucumber.g:240:4: (lv_steps_4_0= ruleStep )
            	    // InternalCucumber.g:241:5: lv_steps_4_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_steps_4_0=ruleStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBackgroundRule());
            	    					}
            	    					add(
            	    						current,
            	    						"steps",
            	    						lv_steps_4_0,
            	    						"org.farhan.Cucumber.Step");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleAbstractScenario"
    // InternalCucumber.g:262:1: entryRuleAbstractScenario returns [EObject current=null] : iv_ruleAbstractScenario= ruleAbstractScenario EOF ;
    public final EObject entryRuleAbstractScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractScenario = null;


        try {
            // InternalCucumber.g:262:57: (iv_ruleAbstractScenario= ruleAbstractScenario EOF )
            // InternalCucumber.g:263:2: iv_ruleAbstractScenario= ruleAbstractScenario EOF
            {
             newCompositeNode(grammarAccess.getAbstractScenarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractScenario=ruleAbstractScenario();

            state._fsp--;

             current =iv_ruleAbstractScenario; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCucumber.g:269:1: ruleAbstractScenario returns [EObject current=null] : (this_ScenarioOutline_0= ruleScenarioOutline | this_Scenario_1= ruleScenario ) ;
    public final EObject ruleAbstractScenario() throws RecognitionException {
        EObject current = null;

        EObject this_ScenarioOutline_0 = null;

        EObject this_Scenario_1 = null;



        	enterRule();

        try {
            // InternalCucumber.g:275:2: ( (this_ScenarioOutline_0= ruleScenarioOutline | this_Scenario_1= ruleScenario ) )
            // InternalCucumber.g:276:2: (this_ScenarioOutline_0= ruleScenarioOutline | this_Scenario_1= ruleScenario )
            {
            // InternalCucumber.g:276:2: (this_ScenarioOutline_0= ruleScenarioOutline | this_Scenario_1= ruleScenario )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalCucumber.g:277:3: this_ScenarioOutline_0= ruleScenarioOutline
                    {

                    			newCompositeNode(grammarAccess.getAbstractScenarioAccess().getScenarioOutlineParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScenarioOutline_0=ruleScenarioOutline();

                    state._fsp--;


                    			current = this_ScenarioOutline_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCucumber.g:286:3: this_Scenario_1= ruleScenario
                    {

                    			newCompositeNode(grammarAccess.getAbstractScenarioAccess().getScenarioParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Scenario_1=ruleScenario();

                    state._fsp--;


                    			current = this_Scenario_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleScenario"
    // InternalCucumber.g:298:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalCucumber.g:298:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalCucumber.g:299:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCucumber.g:305:1: ruleScenario returns [EObject current=null] : ( ruleTags otherlv_1= 'Scenario:' ( (lv_title_2_0= ruleSentence ) ) (this_EOL_3= RULE_EOL )? ( (lv_description_4_0= ruleDescription ) ) ( (lv_steps_5_0= ruleStep ) )* ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_EOL_3=null;
        AntlrDatatypeRuleToken lv_title_2_0 = null;

        EObject lv_description_4_0 = null;

        EObject lv_steps_5_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:311:2: ( ( ruleTags otherlv_1= 'Scenario:' ( (lv_title_2_0= ruleSentence ) ) (this_EOL_3= RULE_EOL )? ( (lv_description_4_0= ruleDescription ) ) ( (lv_steps_5_0= ruleStep ) )* ) )
            // InternalCucumber.g:312:2: ( ruleTags otherlv_1= 'Scenario:' ( (lv_title_2_0= ruleSentence ) ) (this_EOL_3= RULE_EOL )? ( (lv_description_4_0= ruleDescription ) ) ( (lv_steps_5_0= ruleStep ) )* )
            {
            // InternalCucumber.g:312:2: ( ruleTags otherlv_1= 'Scenario:' ( (lv_title_2_0= ruleSentence ) ) (this_EOL_3= RULE_EOL )? ( (lv_description_4_0= ruleDescription ) ) ( (lv_steps_5_0= ruleStep ) )* )
            // InternalCucumber.g:313:3: ruleTags otherlv_1= 'Scenario:' ( (lv_title_2_0= ruleSentence ) ) (this_EOL_3= RULE_EOL )? ( (lv_description_4_0= ruleDescription ) ) ( (lv_steps_5_0= ruleStep ) )*
            {

            			newCompositeNode(grammarAccess.getScenarioAccess().getTagsParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            ruleTags();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getScenarioAccess().getScenarioKeyword_1());
            		
            // InternalCucumber.g:324:3: ( (lv_title_2_0= ruleSentence ) )
            // InternalCucumber.g:325:4: (lv_title_2_0= ruleSentence )
            {
            // InternalCucumber.g:325:4: (lv_title_2_0= ruleSentence )
            // InternalCucumber.g:326:5: lv_title_2_0= ruleSentence
            {

            					newCompositeNode(grammarAccess.getScenarioAccess().getTitleSentenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_title_2_0=ruleSentence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioRule());
            					}
            					set(
            						current,
            						"title",
            						lv_title_2_0,
            						"org.farhan.Cucumber.Sentence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCucumber.g:343:3: (this_EOL_3= RULE_EOL )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_EOL) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCucumber.g:344:4: this_EOL_3= RULE_EOL
                    {
                    this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_9); 

                    				newLeafNode(this_EOL_3, grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_3());
                    			

                    }
                    break;

            }

            // InternalCucumber.g:349:3: ( (lv_description_4_0= ruleDescription ) )
            // InternalCucumber.g:350:4: (lv_description_4_0= ruleDescription )
            {
            // InternalCucumber.g:350:4: (lv_description_4_0= ruleDescription )
            // InternalCucumber.g:351:5: lv_description_4_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getScenarioAccess().getDescriptionDescriptionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_description_4_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_4_0,
            						"org.farhan.Cucumber.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCucumber.g:368:3: ( (lv_steps_5_0= ruleStep ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=14 && LA8_0<=19)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCucumber.g:369:4: (lv_steps_5_0= ruleStep )
            	    {
            	    // InternalCucumber.g:369:4: (lv_steps_5_0= ruleStep )
            	    // InternalCucumber.g:370:5: lv_steps_5_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_steps_5_0=ruleStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"steps",
            	    						lv_steps_5_0,
            	    						"org.farhan.Cucumber.Step");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalCucumber.g:391:1: entryRuleScenarioOutline returns [EObject current=null] : iv_ruleScenarioOutline= ruleScenarioOutline EOF ;
    public final EObject entryRuleScenarioOutline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenarioOutline = null;


        try {
            // InternalCucumber.g:391:56: (iv_ruleScenarioOutline= ruleScenarioOutline EOF )
            // InternalCucumber.g:392:2: iv_ruleScenarioOutline= ruleScenarioOutline EOF
            {
             newCompositeNode(grammarAccess.getScenarioOutlineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenarioOutline=ruleScenarioOutline();

            state._fsp--;

             current =iv_ruleScenarioOutline; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCucumber.g:398:1: ruleScenarioOutline returns [EObject current=null] : ( ruleTags otherlv_1= 'Scenario Outline:' ( (lv_title_2_0= ruleSentence ) ) (this_EOL_3= RULE_EOL )? ( (lv_description_4_0= ruleDescription ) ) ( (lv_steps_5_0= ruleStep ) )* ( (lv_examples_6_0= ruleExample ) )+ ) ;
    public final EObject ruleScenarioOutline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_EOL_3=null;
        AntlrDatatypeRuleToken lv_title_2_0 = null;

        EObject lv_description_4_0 = null;

        EObject lv_steps_5_0 = null;

        EObject lv_examples_6_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:404:2: ( ( ruleTags otherlv_1= 'Scenario Outline:' ( (lv_title_2_0= ruleSentence ) ) (this_EOL_3= RULE_EOL )? ( (lv_description_4_0= ruleDescription ) ) ( (lv_steps_5_0= ruleStep ) )* ( (lv_examples_6_0= ruleExample ) )+ ) )
            // InternalCucumber.g:405:2: ( ruleTags otherlv_1= 'Scenario Outline:' ( (lv_title_2_0= ruleSentence ) ) (this_EOL_3= RULE_EOL )? ( (lv_description_4_0= ruleDescription ) ) ( (lv_steps_5_0= ruleStep ) )* ( (lv_examples_6_0= ruleExample ) )+ )
            {
            // InternalCucumber.g:405:2: ( ruleTags otherlv_1= 'Scenario Outline:' ( (lv_title_2_0= ruleSentence ) ) (this_EOL_3= RULE_EOL )? ( (lv_description_4_0= ruleDescription ) ) ( (lv_steps_5_0= ruleStep ) )* ( (lv_examples_6_0= ruleExample ) )+ )
            // InternalCucumber.g:406:3: ruleTags otherlv_1= 'Scenario Outline:' ( (lv_title_2_0= ruleSentence ) ) (this_EOL_3= RULE_EOL )? ( (lv_description_4_0= ruleDescription ) ) ( (lv_steps_5_0= ruleStep ) )* ( (lv_examples_6_0= ruleExample ) )+
            {

            			newCompositeNode(grammarAccess.getScenarioOutlineAccess().getTagsParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            ruleTags();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getScenarioOutlineAccess().getScenarioOutlineKeyword_1());
            		
            // InternalCucumber.g:417:3: ( (lv_title_2_0= ruleSentence ) )
            // InternalCucumber.g:418:4: (lv_title_2_0= ruleSentence )
            {
            // InternalCucumber.g:418:4: (lv_title_2_0= ruleSentence )
            // InternalCucumber.g:419:5: lv_title_2_0= ruleSentence
            {

            					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getTitleSentenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_title_2_0=ruleSentence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
            					}
            					set(
            						current,
            						"title",
            						lv_title_2_0,
            						"org.farhan.Cucumber.Sentence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCucumber.g:436:3: (this_EOL_3= RULE_EOL )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_EOL) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCucumber.g:437:4: this_EOL_3= RULE_EOL
                    {
                    this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_13); 

                    				newLeafNode(this_EOL_3, grammarAccess.getScenarioOutlineAccess().getEOLTerminalRuleCall_3());
                    			

                    }
                    break;

            }

            // InternalCucumber.g:442:3: ( (lv_description_4_0= ruleDescription ) )
            // InternalCucumber.g:443:4: (lv_description_4_0= ruleDescription )
            {
            // InternalCucumber.g:443:4: (lv_description_4_0= ruleDescription )
            // InternalCucumber.g:444:5: lv_description_4_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getDescriptionDescriptionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_description_4_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_4_0,
            						"org.farhan.Cucumber.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCucumber.g:461:3: ( (lv_steps_5_0= ruleStep ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=14 && LA10_0<=19)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCucumber.g:462:4: (lv_steps_5_0= ruleStep )
            	    {
            	    // InternalCucumber.g:462:4: (lv_steps_5_0= ruleStep )
            	    // InternalCucumber.g:463:5: lv_steps_5_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getStepsStepParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_steps_5_0=ruleStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"steps",
            	    						lv_steps_5_0,
            	    						"org.farhan.Cucumber.Step");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalCucumber.g:480:3: ( (lv_examples_6_0= ruleExample ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // InternalCucumber.g:481:4: (lv_examples_6_0= ruleExample )
            	    {
            	    // InternalCucumber.g:481:4: (lv_examples_6_0= ruleExample )
            	    // InternalCucumber.g:482:5: lv_examples_6_0= ruleExample
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getExamplesExampleParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_examples_6_0=ruleExample();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"examples",
            	    						lv_examples_6_0,
            	    						"org.farhan.Cucumber.Example");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleExample"
    // InternalCucumber.g:503:1: entryRuleExample returns [EObject current=null] : iv_ruleExample= ruleExample EOF ;
    public final EObject entryRuleExample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExample = null;


        try {
            // InternalCucumber.g:503:48: (iv_ruleExample= ruleExample EOF )
            // InternalCucumber.g:504:2: iv_ruleExample= ruleExample EOF
            {
             newCompositeNode(grammarAccess.getExampleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExample=ruleExample();

            state._fsp--;

             current =iv_ruleExample; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCucumber.g:510:1: ruleExample returns [EObject current=null] : ( ruleTags otherlv_1= 'Examples:' ( (lv_title_2_0= ruleSentence ) ) (this_EOL_3= RULE_EOL )? ( (lv_description_4_0= ruleDescription ) ) ( (lv_table_5_0= ruleTable ) ) ) ;
    public final EObject ruleExample() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_EOL_3=null;
        AntlrDatatypeRuleToken lv_title_2_0 = null;

        EObject lv_description_4_0 = null;

        EObject lv_table_5_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:516:2: ( ( ruleTags otherlv_1= 'Examples:' ( (lv_title_2_0= ruleSentence ) ) (this_EOL_3= RULE_EOL )? ( (lv_description_4_0= ruleDescription ) ) ( (lv_table_5_0= ruleTable ) ) ) )
            // InternalCucumber.g:517:2: ( ruleTags otherlv_1= 'Examples:' ( (lv_title_2_0= ruleSentence ) ) (this_EOL_3= RULE_EOL )? ( (lv_description_4_0= ruleDescription ) ) ( (lv_table_5_0= ruleTable ) ) )
            {
            // InternalCucumber.g:517:2: ( ruleTags otherlv_1= 'Examples:' ( (lv_title_2_0= ruleSentence ) ) (this_EOL_3= RULE_EOL )? ( (lv_description_4_0= ruleDescription ) ) ( (lv_table_5_0= ruleTable ) ) )
            // InternalCucumber.g:518:3: ruleTags otherlv_1= 'Examples:' ( (lv_title_2_0= ruleSentence ) ) (this_EOL_3= RULE_EOL )? ( (lv_description_4_0= ruleDescription ) ) ( (lv_table_5_0= ruleTable ) )
            {

            			newCompositeNode(grammarAccess.getExampleAccess().getTagsParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            ruleTags();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getExampleAccess().getExamplesKeyword_1());
            		
            // InternalCucumber.g:529:3: ( (lv_title_2_0= ruleSentence ) )
            // InternalCucumber.g:530:4: (lv_title_2_0= ruleSentence )
            {
            // InternalCucumber.g:530:4: (lv_title_2_0= ruleSentence )
            // InternalCucumber.g:531:5: lv_title_2_0= ruleSentence
            {

            					newCompositeNode(grammarAccess.getExampleAccess().getTitleSentenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_title_2_0=ruleSentence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExampleRule());
            					}
            					set(
            						current,
            						"title",
            						lv_title_2_0,
            						"org.farhan.Cucumber.Sentence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCucumber.g:548:3: (this_EOL_3= RULE_EOL )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_EOL) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCucumber.g:549:4: this_EOL_3= RULE_EOL
                    {
                    this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_16); 

                    				newLeafNode(this_EOL_3, grammarAccess.getExampleAccess().getEOLTerminalRuleCall_3());
                    			

                    }
                    break;

            }

            // InternalCucumber.g:554:3: ( (lv_description_4_0= ruleDescription ) )
            // InternalCucumber.g:555:4: (lv_description_4_0= ruleDescription )
            {
            // InternalCucumber.g:555:4: (lv_description_4_0= ruleDescription )
            // InternalCucumber.g:556:5: lv_description_4_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getExampleAccess().getDescriptionDescriptionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_16);
            lv_description_4_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExampleRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_4_0,
            						"org.farhan.Cucumber.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCucumber.g:573:3: ( (lv_table_5_0= ruleTable ) )
            // InternalCucumber.g:574:4: (lv_table_5_0= ruleTable )
            {
            // InternalCucumber.g:574:4: (lv_table_5_0= ruleTable )
            // InternalCucumber.g:575:5: lv_table_5_0= ruleTable
            {

            					newCompositeNode(grammarAccess.getExampleAccess().getTableTableParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_table_5_0=ruleTable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExampleRule());
            					}
            					set(
            						current,
            						"table",
            						lv_table_5_0,
            						"org.farhan.Cucumber.Table");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleStep"
    // InternalCucumber.g:596:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalCucumber.g:596:45: (iv_ruleStep= ruleStep EOF )
            // InternalCucumber.g:597:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCucumber.g:603:1: ruleStep returns [EObject current=null] : ( (otherlv_0= 'Given' | otherlv_1= 'When' | otherlv_2= 'Then' | otherlv_3= 'And' | otherlv_4= 'But' | otherlv_5= '*' ) ( (lv_title_6_0= ruleSentence ) ) (this_EOL_7= RULE_EOL )? ( ( (lv_table_8_0= ruleTable ) ) | ( (lv_text_9_0= ruleDocString ) ) )? ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token this_EOL_7=null;
        AntlrDatatypeRuleToken lv_title_6_0 = null;

        EObject lv_table_8_0 = null;

        EObject lv_text_9_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:609:2: ( ( (otherlv_0= 'Given' | otherlv_1= 'When' | otherlv_2= 'Then' | otherlv_3= 'And' | otherlv_4= 'But' | otherlv_5= '*' ) ( (lv_title_6_0= ruleSentence ) ) (this_EOL_7= RULE_EOL )? ( ( (lv_table_8_0= ruleTable ) ) | ( (lv_text_9_0= ruleDocString ) ) )? ) )
            // InternalCucumber.g:610:2: ( (otherlv_0= 'Given' | otherlv_1= 'When' | otherlv_2= 'Then' | otherlv_3= 'And' | otherlv_4= 'But' | otherlv_5= '*' ) ( (lv_title_6_0= ruleSentence ) ) (this_EOL_7= RULE_EOL )? ( ( (lv_table_8_0= ruleTable ) ) | ( (lv_text_9_0= ruleDocString ) ) )? )
            {
            // InternalCucumber.g:610:2: ( (otherlv_0= 'Given' | otherlv_1= 'When' | otherlv_2= 'Then' | otherlv_3= 'And' | otherlv_4= 'But' | otherlv_5= '*' ) ( (lv_title_6_0= ruleSentence ) ) (this_EOL_7= RULE_EOL )? ( ( (lv_table_8_0= ruleTable ) ) | ( (lv_text_9_0= ruleDocString ) ) )? )
            // InternalCucumber.g:611:3: (otherlv_0= 'Given' | otherlv_1= 'When' | otherlv_2= 'Then' | otherlv_3= 'And' | otherlv_4= 'But' | otherlv_5= '*' ) ( (lv_title_6_0= ruleSentence ) ) (this_EOL_7= RULE_EOL )? ( ( (lv_table_8_0= ruleTable ) ) | ( (lv_text_9_0= ruleDocString ) ) )?
            {
            // InternalCucumber.g:611:3: (otherlv_0= 'Given' | otherlv_1= 'When' | otherlv_2= 'Then' | otherlv_3= 'And' | otherlv_4= 'But' | otherlv_5= '*' )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt13=1;
                }
                break;
            case 15:
                {
                alt13=2;
                }
                break;
            case 16:
                {
                alt13=3;
                }
                break;
            case 17:
                {
                alt13=4;
                }
                break;
            case 18:
                {
                alt13=5;
                }
                break;
            case 19:
                {
                alt13=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalCucumber.g:612:4: otherlv_0= 'Given'
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getStepAccess().getGivenKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCucumber.g:617:4: otherlv_1= 'When'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getStepAccess().getWhenKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalCucumber.g:622:4: otherlv_2= 'Then'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getStepAccess().getThenKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalCucumber.g:627:4: otherlv_3= 'And'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getStepAccess().getAndKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalCucumber.g:632:4: otherlv_4= 'But'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getStepAccess().getButKeyword_0_4());
                    			

                    }
                    break;
                case 6 :
                    // InternalCucumber.g:637:4: otherlv_5= '*'
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getStepAccess().getAsteriskKeyword_0_5());
                    			

                    }
                    break;

            }

            // InternalCucumber.g:642:3: ( (lv_title_6_0= ruleSentence ) )
            // InternalCucumber.g:643:4: (lv_title_6_0= ruleSentence )
            {
            // InternalCucumber.g:643:4: (lv_title_6_0= ruleSentence )
            // InternalCucumber.g:644:5: lv_title_6_0= ruleSentence
            {

            					newCompositeNode(grammarAccess.getStepAccess().getTitleSentenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_title_6_0=ruleSentence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStepRule());
            					}
            					set(
            						current,
            						"title",
            						lv_title_6_0,
            						"org.farhan.Cucumber.Sentence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCucumber.g:661:3: (this_EOL_7= RULE_EOL )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_EOL) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCucumber.g:662:4: this_EOL_7= RULE_EOL
                    {
                    this_EOL_7=(Token)match(input,RULE_EOL,FOLLOW_17); 

                    				newLeafNode(this_EOL_7, grammarAccess.getStepAccess().getEOLTerminalRuleCall_2());
                    			

                    }
                    break;

            }

            // InternalCucumber.g:667:3: ( ( (lv_table_8_0= ruleTable ) ) | ( (lv_text_9_0= ruleDocString ) ) )?
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            else if ( (LA15_0==21) ) {
                alt15=2;
            }
            switch (alt15) {
                case 1 :
                    // InternalCucumber.g:668:4: ( (lv_table_8_0= ruleTable ) )
                    {
                    // InternalCucumber.g:668:4: ( (lv_table_8_0= ruleTable ) )
                    // InternalCucumber.g:669:5: (lv_table_8_0= ruleTable )
                    {
                    // InternalCucumber.g:669:5: (lv_table_8_0= ruleTable )
                    // InternalCucumber.g:670:6: lv_table_8_0= ruleTable
                    {

                    						newCompositeNode(grammarAccess.getStepAccess().getTableTableParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_table_8_0=ruleTable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStepRule());
                    						}
                    						set(
                    							current,
                    							"table",
                    							lv_table_8_0,
                    							"org.farhan.Cucumber.Table");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:688:4: ( (lv_text_9_0= ruleDocString ) )
                    {
                    // InternalCucumber.g:688:4: ( (lv_text_9_0= ruleDocString ) )
                    // InternalCucumber.g:689:5: (lv_text_9_0= ruleDocString )
                    {
                    // InternalCucumber.g:689:5: (lv_text_9_0= ruleDocString )
                    // InternalCucumber.g:690:6: lv_text_9_0= ruleDocString
                    {

                    						newCompositeNode(grammarAccess.getStepAccess().getTextDocStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_text_9_0=ruleDocString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStepRule());
                    						}
                    						set(
                    							current,
                    							"text",
                    							lv_text_9_0,
                    							"org.farhan.Cucumber.DocString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleTable"
    // InternalCucumber.g:712:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalCucumber.g:712:46: (iv_ruleTable= ruleTable EOF )
            // InternalCucumber.g:713:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCucumber.g:719:1: ruleTable returns [EObject current=null] : ( (lv_rows_0_0= ruleTableRow ) )+ ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        EObject lv_rows_0_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:725:2: ( ( (lv_rows_0_0= ruleTableRow ) )+ )
            // InternalCucumber.g:726:2: ( (lv_rows_0_0= ruleTableRow ) )+
            {
            // InternalCucumber.g:726:2: ( (lv_rows_0_0= ruleTableRow ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==20) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCucumber.g:727:3: (lv_rows_0_0= ruleTableRow )
            	    {
            	    // InternalCucumber.g:727:3: (lv_rows_0_0= ruleTableRow )
            	    // InternalCucumber.g:728:4: lv_rows_0_0= ruleTableRow
            	    {

            	    				newCompositeNode(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_18);
            	    lv_rows_0_0=ruleTableRow();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getTableRule());
            	    				}
            	    				add(
            	    					current,
            	    					"rows",
            	    					lv_rows_0_0,
            	    					"org.farhan.Cucumber.TableRow");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }


            	leaveRule();

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
    // InternalCucumber.g:748:1: entryRuleTableRow returns [EObject current=null] : iv_ruleTableRow= ruleTableRow EOF ;
    public final EObject entryRuleTableRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableRow = null;


        try {
            // InternalCucumber.g:748:49: (iv_ruleTableRow= ruleTableRow EOF )
            // InternalCucumber.g:749:2: iv_ruleTableRow= ruleTableRow EOF
            {
             newCompositeNode(grammarAccess.getTableRowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTableRow=ruleTableRow();

            state._fsp--;

             current =iv_ruleTableRow; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCucumber.g:755:1: ruleTableRow returns [EObject current=null] : ( ( (lv_cells_0_0= ruleRowCell ) )+ otherlv_1= '|' this_EOL_2= RULE_EOL ) ;
    public final EObject ruleTableRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_EOL_2=null;
        EObject lv_cells_0_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:761:2: ( ( ( (lv_cells_0_0= ruleRowCell ) )+ otherlv_1= '|' this_EOL_2= RULE_EOL ) )
            // InternalCucumber.g:762:2: ( ( (lv_cells_0_0= ruleRowCell ) )+ otherlv_1= '|' this_EOL_2= RULE_EOL )
            {
            // InternalCucumber.g:762:2: ( ( (lv_cells_0_0= ruleRowCell ) )+ otherlv_1= '|' this_EOL_2= RULE_EOL )
            // InternalCucumber.g:763:3: ( (lv_cells_0_0= ruleRowCell ) )+ otherlv_1= '|' this_EOL_2= RULE_EOL
            {
            // InternalCucumber.g:763:3: ( (lv_cells_0_0= ruleRowCell ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==20) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==RULE_WORD) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // InternalCucumber.g:764:4: (lv_cells_0_0= ruleRowCell )
            	    {
            	    // InternalCucumber.g:764:4: (lv_cells_0_0= ruleRowCell )
            	    // InternalCucumber.g:765:5: lv_cells_0_0= ruleRowCell
            	    {

            	    					newCompositeNode(grammarAccess.getTableRowAccess().getCellsRowCellParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_cells_0_0=ruleRowCell();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTableRowRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cells",
            	    						lv_cells_0_0,
            	    						"org.farhan.Cucumber.RowCell");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            otherlv_1=(Token)match(input,20,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getTableRowAccess().getVerticalLineKeyword_1());
            		
            this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_2); 

            			newLeafNode(this_EOL_2, grammarAccess.getTableRowAccess().getEOLTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleRowCell"
    // InternalCucumber.g:794:1: entryRuleRowCell returns [EObject current=null] : iv_ruleRowCell= ruleRowCell EOF ;
    public final EObject entryRuleRowCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowCell = null;


        try {
            // InternalCucumber.g:794:48: (iv_ruleRowCell= ruleRowCell EOF )
            // InternalCucumber.g:795:2: iv_ruleRowCell= ruleRowCell EOF
            {
             newCompositeNode(grammarAccess.getRowCellRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRowCell=ruleRowCell();

            state._fsp--;

             current =iv_ruleRowCell; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRowCell"


    // $ANTLR start "ruleRowCell"
    // InternalCucumber.g:801:1: ruleRowCell returns [EObject current=null] : ( ( (lv_cell_0_0= '|' ) ) ruleSentence ) ;
    public final EObject ruleRowCell() throws RecognitionException {
        EObject current = null;

        Token lv_cell_0_0=null;


        	enterRule();

        try {
            // InternalCucumber.g:807:2: ( ( ( (lv_cell_0_0= '|' ) ) ruleSentence ) )
            // InternalCucumber.g:808:2: ( ( (lv_cell_0_0= '|' ) ) ruleSentence )
            {
            // InternalCucumber.g:808:2: ( ( (lv_cell_0_0= '|' ) ) ruleSentence )
            // InternalCucumber.g:809:3: ( (lv_cell_0_0= '|' ) ) ruleSentence
            {
            // InternalCucumber.g:809:3: ( (lv_cell_0_0= '|' ) )
            // InternalCucumber.g:810:4: (lv_cell_0_0= '|' )
            {
            // InternalCucumber.g:810:4: (lv_cell_0_0= '|' )
            // InternalCucumber.g:811:5: lv_cell_0_0= '|'
            {
            lv_cell_0_0=(Token)match(input,20,FOLLOW_4); 

            					newLeafNode(lv_cell_0_0, grammarAccess.getRowCellAccess().getCellVerticalLineKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRowCellRule());
            					}
            					setWithLastConsumed(current, "cell", lv_cell_0_0, "|");
            				

            }


            }


            			newCompositeNode(grammarAccess.getRowCellAccess().getSentenceParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRowCell"


    // $ANTLR start "entryRuleDocString"
    // InternalCucumber.g:834:1: entryRuleDocString returns [EObject current=null] : iv_ruleDocString= ruleDocString EOF ;
    public final EObject entryRuleDocString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocString = null;


        try {
            // InternalCucumber.g:834:50: (iv_ruleDocString= ruleDocString EOF )
            // InternalCucumber.g:835:2: iv_ruleDocString= ruleDocString EOF
            {
             newCompositeNode(grammarAccess.getDocStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocString=ruleDocString();

            state._fsp--;

             current =iv_ruleDocString; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCucumber.g:841:1: ruleDocString returns [EObject current=null] : ( () otherlv_1= '\"\"\"' ( ruleSentence | this_EOL_3= RULE_EOL )* otherlv_4= '\"\"\"' this_EOL_5= RULE_EOL ) ;
    public final EObject ruleDocString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_EOL_3=null;
        Token otherlv_4=null;
        Token this_EOL_5=null;


        	enterRule();

        try {
            // InternalCucumber.g:847:2: ( ( () otherlv_1= '\"\"\"' ( ruleSentence | this_EOL_3= RULE_EOL )* otherlv_4= '\"\"\"' this_EOL_5= RULE_EOL ) )
            // InternalCucumber.g:848:2: ( () otherlv_1= '\"\"\"' ( ruleSentence | this_EOL_3= RULE_EOL )* otherlv_4= '\"\"\"' this_EOL_5= RULE_EOL )
            {
            // InternalCucumber.g:848:2: ( () otherlv_1= '\"\"\"' ( ruleSentence | this_EOL_3= RULE_EOL )* otherlv_4= '\"\"\"' this_EOL_5= RULE_EOL )
            // InternalCucumber.g:849:3: () otherlv_1= '\"\"\"' ( ruleSentence | this_EOL_3= RULE_EOL )* otherlv_4= '\"\"\"' this_EOL_5= RULE_EOL
            {
            // InternalCucumber.g:849:3: ()
            // InternalCucumber.g:850:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDocStringAccess().getDocStringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_1());
            		
            // InternalCucumber.g:860:3: ( ruleSentence | this_EOL_3= RULE_EOL )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_WORD) ) {
                    alt18=1;
                }
                else if ( (LA18_0==RULE_EOL) ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCucumber.g:861:4: ruleSentence
            	    {

            	    				newCompositeNode(grammarAccess.getDocStringAccess().getSentenceParserRuleCall_2_0());
            	    			
            	    pushFollow(FOLLOW_20);
            	    ruleSentence();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalCucumber.g:869:4: this_EOL_3= RULE_EOL
            	    {
            	    this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_20); 

            	    				newLeafNode(this_EOL_3, grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_3());
            		
            this_EOL_5=(Token)match(input,RULE_EOL,FOLLOW_2); 

            			newLeafNode(this_EOL_5, grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleDescription"
    // InternalCucumber.g:886:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalCucumber.g:886:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalCucumber.g:887:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalCucumber.g:893:1: ruleDescription returns [EObject current=null] : ( () ( ( (lv_sentences_1_0= ruleSentence ) ) (this_EOL_2= RULE_EOL )? )* ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token this_EOL_2=null;
        AntlrDatatypeRuleToken lv_sentences_1_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:899:2: ( ( () ( ( (lv_sentences_1_0= ruleSentence ) ) (this_EOL_2= RULE_EOL )? )* ) )
            // InternalCucumber.g:900:2: ( () ( ( (lv_sentences_1_0= ruleSentence ) ) (this_EOL_2= RULE_EOL )? )* )
            {
            // InternalCucumber.g:900:2: ( () ( ( (lv_sentences_1_0= ruleSentence ) ) (this_EOL_2= RULE_EOL )? )* )
            // InternalCucumber.g:901:3: () ( ( (lv_sentences_1_0= ruleSentence ) ) (this_EOL_2= RULE_EOL )? )*
            {
            // InternalCucumber.g:901:3: ()
            // InternalCucumber.g:902:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDescriptionAccess().getDescriptionAction_0(),
            					current);
            			

            }

            // InternalCucumber.g:908:3: ( ( (lv_sentences_1_0= ruleSentence ) ) (this_EOL_2= RULE_EOL )? )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_WORD) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCucumber.g:909:4: ( (lv_sentences_1_0= ruleSentence ) ) (this_EOL_2= RULE_EOL )?
            	    {
            	    // InternalCucumber.g:909:4: ( (lv_sentences_1_0= ruleSentence ) )
            	    // InternalCucumber.g:910:5: (lv_sentences_1_0= ruleSentence )
            	    {
            	    // InternalCucumber.g:910:5: (lv_sentences_1_0= ruleSentence )
            	    // InternalCucumber.g:911:6: lv_sentences_1_0= ruleSentence
            	    {

            	    						newCompositeNode(grammarAccess.getDescriptionAccess().getSentencesSentenceParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_sentences_1_0=ruleSentence();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDescriptionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sentences",
            	    							lv_sentences_1_0,
            	    							"org.farhan.Cucumber.Sentence");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalCucumber.g:928:4: (this_EOL_2= RULE_EOL )?
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==RULE_EOL) ) {
            	        alt19=1;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalCucumber.g:929:5: this_EOL_2= RULE_EOL
            	            {
            	            this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_22); 

            	            					newLeafNode(this_EOL_2, grammarAccess.getDescriptionAccess().getEOLTerminalRuleCall_1_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleTags"
    // InternalCucumber.g:939:1: entryRuleTags returns [String current=null] : iv_ruleTags= ruleTags EOF ;
    public final String entryRuleTags() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTags = null;


        try {
            // InternalCucumber.g:939:44: (iv_ruleTags= ruleTags EOF )
            // InternalCucumber.g:940:2: iv_ruleTags= ruleTags EOF
            {
             newCompositeNode(grammarAccess.getTagsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTags=ruleTags();

            state._fsp--;

             current =iv_ruleTags.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTags"


    // $ANTLR start "ruleTags"
    // InternalCucumber.g:946:1: ruleTags returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_TAG_0= RULE_TAG )* (this_EOL_1= RULE_EOL )? ) ;
    public final AntlrDatatypeRuleToken ruleTags() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TAG_0=null;
        Token this_EOL_1=null;


        	enterRule();

        try {
            // InternalCucumber.g:952:2: ( ( (this_TAG_0= RULE_TAG )* (this_EOL_1= RULE_EOL )? ) )
            // InternalCucumber.g:953:2: ( (this_TAG_0= RULE_TAG )* (this_EOL_1= RULE_EOL )? )
            {
            // InternalCucumber.g:953:2: ( (this_TAG_0= RULE_TAG )* (this_EOL_1= RULE_EOL )? )
            // InternalCucumber.g:954:3: (this_TAG_0= RULE_TAG )* (this_EOL_1= RULE_EOL )?
            {
            // InternalCucumber.g:954:3: (this_TAG_0= RULE_TAG )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_TAG) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCucumber.g:955:4: this_TAG_0= RULE_TAG
            	    {
            	    this_TAG_0=(Token)match(input,RULE_TAG,FOLLOW_23); 

            	    				current.merge(this_TAG_0);
            	    			

            	    				newLeafNode(this_TAG_0, grammarAccess.getTagsAccess().getTAGTerminalRuleCall_0());
            	    			

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // InternalCucumber.g:963:3: (this_EOL_1= RULE_EOL )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_EOL) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCucumber.g:964:4: this_EOL_1= RULE_EOL
                    {
                    this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_2); 

                    				current.merge(this_EOL_1);
                    			

                    				newLeafNode(this_EOL_1, grammarAccess.getTagsAccess().getEOLTerminalRuleCall_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTags"


    // $ANTLR start "entryRuleSentence"
    // InternalCucumber.g:976:1: entryRuleSentence returns [String current=null] : iv_ruleSentence= ruleSentence EOF ;
    public final String entryRuleSentence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSentence = null;


        try {
            // InternalCucumber.g:976:48: (iv_ruleSentence= ruleSentence EOF )
            // InternalCucumber.g:977:2: iv_ruleSentence= ruleSentence EOF
            {
             newCompositeNode(grammarAccess.getSentenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSentence=ruleSentence();

            state._fsp--;

             current =iv_ruleSentence.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSentence"


    // $ANTLR start "ruleSentence"
    // InternalCucumber.g:983:1: ruleSentence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WORD_0= RULE_WORD )+ ;
    public final AntlrDatatypeRuleToken ruleSentence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;


        	enterRule();

        try {
            // InternalCucumber.g:989:2: ( (this_WORD_0= RULE_WORD )+ )
            // InternalCucumber.g:990:2: (this_WORD_0= RULE_WORD )+
            {
            // InternalCucumber.g:990:2: (this_WORD_0= RULE_WORD )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_WORD) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalCucumber.g:991:3: this_WORD_0= RULE_WORD
            	    {
            	    this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_22); 

            	    			current.merge(this_WORD_0);
            	    		

            	    			newLeafNode(this_WORD_0, grammarAccess.getSentenceAccess().getWORDTerminalRuleCall());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSentence"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\5\uffff";
    static final String dfa_2s = "\2\4\1\13\2\uffff";
    static final String dfa_3s = "\3\14\2\uffff";
    static final String dfa_4s = "\3\uffff\1\1\1\2";
    static final String dfa_5s = "\5\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\1\5\uffff\1\4\1\3",
            "\1\2\1\1\5\uffff\1\4\1\3",
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

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "276:2: (this_ScenarioOutline_0= ruleScenarioOutline | this_Scenario_1= ruleScenario )";
        }
    }
    static final String dfa_7s = "\1\1\4\uffff";
    static final String dfa_8s = "\1\4\1\uffff\1\4\1\13\1\uffff";
    static final String dfa_9s = "\1\15\1\uffff\2\15\1\uffff";
    static final String dfa_10s = "\1\uffff\1\2\2\uffff\1\1";
    static final String[] dfa_11s = {
            "\1\3\1\2\5\uffff\2\1\1\4",
            "",
            "\1\3\1\2\5\uffff\2\1\1\4",
            "\2\1\1\4",
            ""
    };
    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[][] dfa_11 = unpackEncodedStringArray(dfa_11s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_5;
            this.transition = dfa_11;
        }
        public String getDescription() {
            return "()+ loopback of 480:3: ( (lv_examples_6_0= ruleExample ) )+";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001C70L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001C32L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001832L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000FC050L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000FC040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000FC002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000FE070L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000FE072L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100050L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000300052L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100052L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000032L});

}
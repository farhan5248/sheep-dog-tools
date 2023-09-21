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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_TAG", "RULE_WORD", "RULE_WS", "RULE_COMMENT", "'Feature:'", "'Background:'", "'Scenario:'", "'Given'", "'When'", "'Then'", "'And'", "'But'", "'*'", "'|'", "'\"\"\"'"
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
    // InternalCucumber.g:71:1: ruleFeature returns [EObject current=null] : ( ruleTags otherlv_1= 'Feature:' ( (lv_title_2_0= ruleSentence ) ) ( (lv_description_3_0= ruleDescription ) ) ( (lv_background_4_0= ruleBackground ) )? ( (lv_scenarios_5_0= ruleScenario ) )* ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_title_2_0 = null;

        EObject lv_description_3_0 = null;

        EObject lv_background_4_0 = null;

        EObject lv_scenarios_5_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:77:2: ( ( ruleTags otherlv_1= 'Feature:' ( (lv_title_2_0= ruleSentence ) ) ( (lv_description_3_0= ruleDescription ) ) ( (lv_background_4_0= ruleBackground ) )? ( (lv_scenarios_5_0= ruleScenario ) )* ) )
            // InternalCucumber.g:78:2: ( ruleTags otherlv_1= 'Feature:' ( (lv_title_2_0= ruleSentence ) ) ( (lv_description_3_0= ruleDescription ) ) ( (lv_background_4_0= ruleBackground ) )? ( (lv_scenarios_5_0= ruleScenario ) )* )
            {
            // InternalCucumber.g:78:2: ( ruleTags otherlv_1= 'Feature:' ( (lv_title_2_0= ruleSentence ) ) ( (lv_description_3_0= ruleDescription ) ) ( (lv_background_4_0= ruleBackground ) )? ( (lv_scenarios_5_0= ruleScenario ) )* )
            // InternalCucumber.g:79:3: ruleTags otherlv_1= 'Feature:' ( (lv_title_2_0= ruleSentence ) ) ( (lv_description_3_0= ruleDescription ) ) ( (lv_background_4_0= ruleBackground ) )? ( (lv_scenarios_5_0= ruleScenario ) )*
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

            // InternalCucumber.g:109:3: ( (lv_description_3_0= ruleDescription ) )
            // InternalCucumber.g:110:4: (lv_description_3_0= ruleDescription )
            {
            // InternalCucumber.g:110:4: (lv_description_3_0= ruleDescription )
            // InternalCucumber.g:111:5: lv_description_3_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getDescriptionDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_description_3_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.farhan.Cucumber.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCucumber.g:128:3: ( (lv_background_4_0= ruleBackground ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==10) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCucumber.g:129:4: (lv_background_4_0= ruleBackground )
                    {
                    // InternalCucumber.g:129:4: (lv_background_4_0= ruleBackground )
                    // InternalCucumber.g:130:5: lv_background_4_0= ruleBackground
                    {

                    					newCompositeNode(grammarAccess.getFeatureAccess().getBackgroundBackgroundParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_background_4_0=ruleBackground();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFeatureRule());
                    					}
                    					set(
                    						current,
                    						"background",
                    						lv_background_4_0,
                    						"org.farhan.Cucumber.Background");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCucumber.g:147:3: ( (lv_scenarios_5_0= ruleScenario ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_EOL && LA2_0<=RULE_TAG)||LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCucumber.g:148:4: (lv_scenarios_5_0= ruleScenario )
            	    {
            	    // InternalCucumber.g:148:4: (lv_scenarios_5_0= ruleScenario )
            	    // InternalCucumber.g:149:5: lv_scenarios_5_0= ruleScenario
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_scenarios_5_0=ruleScenario();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"scenarios",
            	    						lv_scenarios_5_0,
            	    						"org.farhan.Cucumber.Scenario");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // InternalCucumber.g:170:1: entryRuleBackground returns [EObject current=null] : iv_ruleBackground= ruleBackground EOF ;
    public final EObject entryRuleBackground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackground = null;


        try {
            // InternalCucumber.g:170:51: (iv_ruleBackground= ruleBackground EOF )
            // InternalCucumber.g:171:2: iv_ruleBackground= ruleBackground EOF
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
    // InternalCucumber.g:177:1: ruleBackground returns [EObject current=null] : (otherlv_0= 'Background:' ( (lv_title_1_0= ruleSentence ) ) ( (lv_description_2_0= ruleDescription ) ) ( (lv_steps_3_0= ruleStep ) )* ) ;
    public final EObject ruleBackground() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_title_1_0 = null;

        EObject lv_description_2_0 = null;

        EObject lv_steps_3_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:183:2: ( (otherlv_0= 'Background:' ( (lv_title_1_0= ruleSentence ) ) ( (lv_description_2_0= ruleDescription ) ) ( (lv_steps_3_0= ruleStep ) )* ) )
            // InternalCucumber.g:184:2: (otherlv_0= 'Background:' ( (lv_title_1_0= ruleSentence ) ) ( (lv_description_2_0= ruleDescription ) ) ( (lv_steps_3_0= ruleStep ) )* )
            {
            // InternalCucumber.g:184:2: (otherlv_0= 'Background:' ( (lv_title_1_0= ruleSentence ) ) ( (lv_description_2_0= ruleDescription ) ) ( (lv_steps_3_0= ruleStep ) )* )
            // InternalCucumber.g:185:3: otherlv_0= 'Background:' ( (lv_title_1_0= ruleSentence ) ) ( (lv_description_2_0= ruleDescription ) ) ( (lv_steps_3_0= ruleStep ) )*
            {
            otherlv_0=(Token)match(input,10,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBackgroundAccess().getBackgroundKeyword_0());
            		
            // InternalCucumber.g:189:3: ( (lv_title_1_0= ruleSentence ) )
            // InternalCucumber.g:190:4: (lv_title_1_0= ruleSentence )
            {
            // InternalCucumber.g:190:4: (lv_title_1_0= ruleSentence )
            // InternalCucumber.g:191:5: lv_title_1_0= ruleSentence
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

            // InternalCucumber.g:208:3: ( (lv_description_2_0= ruleDescription ) )
            // InternalCucumber.g:209:4: (lv_description_2_0= ruleDescription )
            {
            // InternalCucumber.g:209:4: (lv_description_2_0= ruleDescription )
            // InternalCucumber.g:210:5: lv_description_2_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getBackgroundAccess().getDescriptionDescriptionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_description_2_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBackgroundRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_2_0,
            						"org.farhan.Cucumber.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCucumber.g:227:3: ( (lv_steps_3_0= ruleStep ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=12 && LA3_0<=17)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCucumber.g:228:4: (lv_steps_3_0= ruleStep )
            	    {
            	    // InternalCucumber.g:228:4: (lv_steps_3_0= ruleStep )
            	    // InternalCucumber.g:229:5: lv_steps_3_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_steps_3_0=ruleStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBackgroundRule());
            	    					}
            	    					add(
            	    						current,
            	    						"steps",
            	    						lv_steps_3_0,
            	    						"org.farhan.Cucumber.Step");
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
    // $ANTLR end "ruleBackground"


    // $ANTLR start "entryRuleScenario"
    // InternalCucumber.g:250:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalCucumber.g:250:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalCucumber.g:251:2: iv_ruleScenario= ruleScenario EOF
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
    // InternalCucumber.g:257:1: ruleScenario returns [EObject current=null] : ( ruleTags otherlv_1= 'Scenario:' ( (lv_title_2_0= ruleSentence ) ) ( (lv_description_3_0= ruleDescription ) ) ( (lv_steps_4_0= ruleStep ) )* ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_title_2_0 = null;

        EObject lv_description_3_0 = null;

        EObject lv_steps_4_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:263:2: ( ( ruleTags otherlv_1= 'Scenario:' ( (lv_title_2_0= ruleSentence ) ) ( (lv_description_3_0= ruleDescription ) ) ( (lv_steps_4_0= ruleStep ) )* ) )
            // InternalCucumber.g:264:2: ( ruleTags otherlv_1= 'Scenario:' ( (lv_title_2_0= ruleSentence ) ) ( (lv_description_3_0= ruleDescription ) ) ( (lv_steps_4_0= ruleStep ) )* )
            {
            // InternalCucumber.g:264:2: ( ruleTags otherlv_1= 'Scenario:' ( (lv_title_2_0= ruleSentence ) ) ( (lv_description_3_0= ruleDescription ) ) ( (lv_steps_4_0= ruleStep ) )* )
            // InternalCucumber.g:265:3: ruleTags otherlv_1= 'Scenario:' ( (lv_title_2_0= ruleSentence ) ) ( (lv_description_3_0= ruleDescription ) ) ( (lv_steps_4_0= ruleStep ) )*
            {

            			newCompositeNode(grammarAccess.getScenarioAccess().getTagsParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            ruleTags();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getScenarioAccess().getScenarioKeyword_1());
            		
            // InternalCucumber.g:276:3: ( (lv_title_2_0= ruleSentence ) )
            // InternalCucumber.g:277:4: (lv_title_2_0= ruleSentence )
            {
            // InternalCucumber.g:277:4: (lv_title_2_0= ruleSentence )
            // InternalCucumber.g:278:5: lv_title_2_0= ruleSentence
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

            // InternalCucumber.g:295:3: ( (lv_description_3_0= ruleDescription ) )
            // InternalCucumber.g:296:4: (lv_description_3_0= ruleDescription )
            {
            // InternalCucumber.g:296:4: (lv_description_3_0= ruleDescription )
            // InternalCucumber.g:297:5: lv_description_3_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getScenarioAccess().getDescriptionDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_description_3_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.farhan.Cucumber.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCucumber.g:314:3: ( (lv_steps_4_0= ruleStep ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=12 && LA4_0<=17)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCucumber.g:315:4: (lv_steps_4_0= ruleStep )
            	    {
            	    // InternalCucumber.g:315:4: (lv_steps_4_0= ruleStep )
            	    // InternalCucumber.g:316:5: lv_steps_4_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_steps_4_0=ruleStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioRule());
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
            	    break loop4;
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


    // $ANTLR start "entryRuleStep"
    // InternalCucumber.g:337:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalCucumber.g:337:45: (iv_ruleStep= ruleStep EOF )
            // InternalCucumber.g:338:2: iv_ruleStep= ruleStep EOF
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
    // InternalCucumber.g:344:1: ruleStep returns [EObject current=null] : ( ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) ) ( (lv_title_1_0= ruleSentence ) ) ( ( (lv_table_2_0= ruleTable ) ) | ( (lv_text_3_0= ruleDocString ) ) )? ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_1=null;
        Token lv_keyword_0_2=null;
        Token lv_keyword_0_3=null;
        Token lv_keyword_0_4=null;
        Token lv_keyword_0_5=null;
        Token lv_keyword_0_6=null;
        AntlrDatatypeRuleToken lv_title_1_0 = null;

        EObject lv_table_2_0 = null;

        EObject lv_text_3_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:350:2: ( ( ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) ) ( (lv_title_1_0= ruleSentence ) ) ( ( (lv_table_2_0= ruleTable ) ) | ( (lv_text_3_0= ruleDocString ) ) )? ) )
            // InternalCucumber.g:351:2: ( ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) ) ( (lv_title_1_0= ruleSentence ) ) ( ( (lv_table_2_0= ruleTable ) ) | ( (lv_text_3_0= ruleDocString ) ) )? )
            {
            // InternalCucumber.g:351:2: ( ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) ) ( (lv_title_1_0= ruleSentence ) ) ( ( (lv_table_2_0= ruleTable ) ) | ( (lv_text_3_0= ruleDocString ) ) )? )
            // InternalCucumber.g:352:3: ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) ) ( (lv_title_1_0= ruleSentence ) ) ( ( (lv_table_2_0= ruleTable ) ) | ( (lv_text_3_0= ruleDocString ) ) )?
            {
            // InternalCucumber.g:352:3: ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) )
            // InternalCucumber.g:353:4: ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) )
            {
            // InternalCucumber.g:353:4: ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) )
            // InternalCucumber.g:354:5: (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' )
            {
            // InternalCucumber.g:354:5: (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt5=1;
                }
                break;
            case 13:
                {
                alt5=2;
                }
                break;
            case 14:
                {
                alt5=3;
                }
                break;
            case 15:
                {
                alt5=4;
                }
                break;
            case 16:
                {
                alt5=5;
                }
                break;
            case 17:
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
                    // InternalCucumber.g:355:6: lv_keyword_0_1= 'Given'
                    {
                    lv_keyword_0_1=(Token)match(input,12,FOLLOW_4); 

                    						newLeafNode(lv_keyword_0_1, grammarAccess.getStepAccess().getKeywordGivenKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStepRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalCucumber.g:366:6: lv_keyword_0_2= 'When'
                    {
                    lv_keyword_0_2=(Token)match(input,13,FOLLOW_4); 

                    						newLeafNode(lv_keyword_0_2, grammarAccess.getStepAccess().getKeywordWhenKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStepRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalCucumber.g:377:6: lv_keyword_0_3= 'Then'
                    {
                    lv_keyword_0_3=(Token)match(input,14,FOLLOW_4); 

                    						newLeafNode(lv_keyword_0_3, grammarAccess.getStepAccess().getKeywordThenKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStepRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalCucumber.g:388:6: lv_keyword_0_4= 'And'
                    {
                    lv_keyword_0_4=(Token)match(input,15,FOLLOW_4); 

                    						newLeafNode(lv_keyword_0_4, grammarAccess.getStepAccess().getKeywordAndKeyword_0_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStepRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_0_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalCucumber.g:399:6: lv_keyword_0_5= 'But'
                    {
                    lv_keyword_0_5=(Token)match(input,16,FOLLOW_4); 

                    						newLeafNode(lv_keyword_0_5, grammarAccess.getStepAccess().getKeywordButKeyword_0_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStepRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_0_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalCucumber.g:410:6: lv_keyword_0_6= '*'
                    {
                    lv_keyword_0_6=(Token)match(input,17,FOLLOW_4); 

                    						newLeafNode(lv_keyword_0_6, grammarAccess.getStepAccess().getKeywordAsteriskKeyword_0_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStepRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_0_6, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalCucumber.g:423:3: ( (lv_title_1_0= ruleSentence ) )
            // InternalCucumber.g:424:4: (lv_title_1_0= ruleSentence )
            {
            // InternalCucumber.g:424:4: (lv_title_1_0= ruleSentence )
            // InternalCucumber.g:425:5: lv_title_1_0= ruleSentence
            {

            					newCompositeNode(grammarAccess.getStepAccess().getTitleSentenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_title_1_0=ruleSentence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStepRule());
            					}
            					set(
            						current,
            						"title",
            						lv_title_1_0,
            						"org.farhan.Cucumber.Sentence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCucumber.g:442:3: ( ( (lv_table_2_0= ruleTable ) ) | ( (lv_text_3_0= ruleDocString ) ) )?
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            switch (alt6) {
                case 1 :
                    // InternalCucumber.g:443:4: ( (lv_table_2_0= ruleTable ) )
                    {
                    // InternalCucumber.g:443:4: ( (lv_table_2_0= ruleTable ) )
                    // InternalCucumber.g:444:5: (lv_table_2_0= ruleTable )
                    {
                    // InternalCucumber.g:444:5: (lv_table_2_0= ruleTable )
                    // InternalCucumber.g:445:6: lv_table_2_0= ruleTable
                    {

                    						newCompositeNode(grammarAccess.getStepAccess().getTableTableParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_table_2_0=ruleTable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStepRule());
                    						}
                    						set(
                    							current,
                    							"table",
                    							lv_table_2_0,
                    							"org.farhan.Cucumber.Table");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:463:4: ( (lv_text_3_0= ruleDocString ) )
                    {
                    // InternalCucumber.g:463:4: ( (lv_text_3_0= ruleDocString ) )
                    // InternalCucumber.g:464:5: (lv_text_3_0= ruleDocString )
                    {
                    // InternalCucumber.g:464:5: (lv_text_3_0= ruleDocString )
                    // InternalCucumber.g:465:6: lv_text_3_0= ruleDocString
                    {

                    						newCompositeNode(grammarAccess.getStepAccess().getTextDocStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_text_3_0=ruleDocString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStepRule());
                    						}
                    						set(
                    							current,
                    							"text",
                    							lv_text_3_0,
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
    // InternalCucumber.g:487:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalCucumber.g:487:46: (iv_ruleTable= ruleTable EOF )
            // InternalCucumber.g:488:2: iv_ruleTable= ruleTable EOF
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
    // InternalCucumber.g:494:1: ruleTable returns [EObject current=null] : ( (lv_rows_0_0= ruleTableRow ) )+ ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        EObject lv_rows_0_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:500:2: ( ( (lv_rows_0_0= ruleTableRow ) )+ )
            // InternalCucumber.g:501:2: ( (lv_rows_0_0= ruleTableRow ) )+
            {
            // InternalCucumber.g:501:2: ( (lv_rows_0_0= ruleTableRow ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCucumber.g:502:3: (lv_rows_0_0= ruleTableRow )
            	    {
            	    // InternalCucumber.g:502:3: (lv_rows_0_0= ruleTableRow )
            	    // InternalCucumber.g:503:4: lv_rows_0_0= ruleTableRow
            	    {

            	    				newCompositeNode(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_12);
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
    // InternalCucumber.g:523:1: entryRuleTableRow returns [EObject current=null] : iv_ruleTableRow= ruleTableRow EOF ;
    public final EObject entryRuleTableRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableRow = null;


        try {
            // InternalCucumber.g:523:49: (iv_ruleTableRow= ruleTableRow EOF )
            // InternalCucumber.g:524:2: iv_ruleTableRow= ruleTableRow EOF
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
    // InternalCucumber.g:530:1: ruleTableRow returns [EObject current=null] : ( ( (lv_cells_0_0= ruleRowCell ) )+ otherlv_1= '|' this_EOL_2= RULE_EOL ) ;
    public final EObject ruleTableRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_EOL_2=null;
        EObject lv_cells_0_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:536:2: ( ( ( (lv_cells_0_0= ruleRowCell ) )+ otherlv_1= '|' this_EOL_2= RULE_EOL ) )
            // InternalCucumber.g:537:2: ( ( (lv_cells_0_0= ruleRowCell ) )+ otherlv_1= '|' this_EOL_2= RULE_EOL )
            {
            // InternalCucumber.g:537:2: ( ( (lv_cells_0_0= ruleRowCell ) )+ otherlv_1= '|' this_EOL_2= RULE_EOL )
            // InternalCucumber.g:538:3: ( (lv_cells_0_0= ruleRowCell ) )+ otherlv_1= '|' this_EOL_2= RULE_EOL
            {
            // InternalCucumber.g:538:3: ( (lv_cells_0_0= ruleRowCell ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==RULE_WORD) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalCucumber.g:539:4: (lv_cells_0_0= ruleRowCell )
            	    {
            	    // InternalCucumber.g:539:4: (lv_cells_0_0= ruleRowCell )
            	    // InternalCucumber.g:540:5: lv_cells_0_0= ruleRowCell
            	    {

            	    					newCompositeNode(grammarAccess.getTableRowAccess().getCellsRowCellParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_13);
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_1=(Token)match(input,18,FOLLOW_14); 

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
    // InternalCucumber.g:569:1: entryRuleRowCell returns [EObject current=null] : iv_ruleRowCell= ruleRowCell EOF ;
    public final EObject entryRuleRowCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowCell = null;


        try {
            // InternalCucumber.g:569:48: (iv_ruleRowCell= ruleRowCell EOF )
            // InternalCucumber.g:570:2: iv_ruleRowCell= ruleRowCell EOF
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
    // InternalCucumber.g:576:1: ruleRowCell returns [EObject current=null] : ( ( (lv_cell_0_0= '|' ) ) ruleSentence ) ;
    public final EObject ruleRowCell() throws RecognitionException {
        EObject current = null;

        Token lv_cell_0_0=null;


        	enterRule();

        try {
            // InternalCucumber.g:582:2: ( ( ( (lv_cell_0_0= '|' ) ) ruleSentence ) )
            // InternalCucumber.g:583:2: ( ( (lv_cell_0_0= '|' ) ) ruleSentence )
            {
            // InternalCucumber.g:583:2: ( ( (lv_cell_0_0= '|' ) ) ruleSentence )
            // InternalCucumber.g:584:3: ( (lv_cell_0_0= '|' ) ) ruleSentence
            {
            // InternalCucumber.g:584:3: ( (lv_cell_0_0= '|' ) )
            // InternalCucumber.g:585:4: (lv_cell_0_0= '|' )
            {
            // InternalCucumber.g:585:4: (lv_cell_0_0= '|' )
            // InternalCucumber.g:586:5: lv_cell_0_0= '|'
            {
            lv_cell_0_0=(Token)match(input,18,FOLLOW_4); 

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
    // InternalCucumber.g:609:1: entryRuleDocString returns [EObject current=null] : iv_ruleDocString= ruleDocString EOF ;
    public final EObject entryRuleDocString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocString = null;


        try {
            // InternalCucumber.g:609:50: (iv_ruleDocString= ruleDocString EOF )
            // InternalCucumber.g:610:2: iv_ruleDocString= ruleDocString EOF
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
    // InternalCucumber.g:616:1: ruleDocString returns [EObject current=null] : ( () otherlv_1= '\"\"\"' this_EOL_2= RULE_EOL ( ruleSentence )* otherlv_4= '\"\"\"' this_EOL_5= RULE_EOL ) ;
    public final EObject ruleDocString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_EOL_2=null;
        Token otherlv_4=null;
        Token this_EOL_5=null;


        	enterRule();

        try {
            // InternalCucumber.g:622:2: ( ( () otherlv_1= '\"\"\"' this_EOL_2= RULE_EOL ( ruleSentence )* otherlv_4= '\"\"\"' this_EOL_5= RULE_EOL ) )
            // InternalCucumber.g:623:2: ( () otherlv_1= '\"\"\"' this_EOL_2= RULE_EOL ( ruleSentence )* otherlv_4= '\"\"\"' this_EOL_5= RULE_EOL )
            {
            // InternalCucumber.g:623:2: ( () otherlv_1= '\"\"\"' this_EOL_2= RULE_EOL ( ruleSentence )* otherlv_4= '\"\"\"' this_EOL_5= RULE_EOL )
            // InternalCucumber.g:624:3: () otherlv_1= '\"\"\"' this_EOL_2= RULE_EOL ( ruleSentence )* otherlv_4= '\"\"\"' this_EOL_5= RULE_EOL
            {
            // InternalCucumber.g:624:3: ()
            // InternalCucumber.g:625:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDocStringAccess().getDocStringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_1());
            		
            this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_15); 

            			newLeafNode(this_EOL_2, grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_2());
            		
            // InternalCucumber.g:639:3: ( ruleSentence )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_WORD) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCucumber.g:640:4: ruleSentence
            	    {

            	    				newCompositeNode(grammarAccess.getDocStringAccess().getSentenceParserRuleCall_3());
            	    			
            	    pushFollow(FOLLOW_15);
            	    ruleSentence();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_4());
            		
            this_EOL_5=(Token)match(input,RULE_EOL,FOLLOW_2); 

            			newLeafNode(this_EOL_5, grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_5());
            		

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
    // InternalCucumber.g:660:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalCucumber.g:660:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalCucumber.g:661:2: iv_ruleDescription= ruleDescription EOF
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
    // InternalCucumber.g:667:1: ruleDescription returns [EObject current=null] : ( () ( (lv_sentences_1_0= ruleSentence ) )* ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_sentences_1_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:673:2: ( ( () ( (lv_sentences_1_0= ruleSentence ) )* ) )
            // InternalCucumber.g:674:2: ( () ( (lv_sentences_1_0= ruleSentence ) )* )
            {
            // InternalCucumber.g:674:2: ( () ( (lv_sentences_1_0= ruleSentence ) )* )
            // InternalCucumber.g:675:3: () ( (lv_sentences_1_0= ruleSentence ) )*
            {
            // InternalCucumber.g:675:3: ()
            // InternalCucumber.g:676:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDescriptionAccess().getDescriptionAction_0(),
            					current);
            			

            }

            // InternalCucumber.g:682:3: ( (lv_sentences_1_0= ruleSentence ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_WORD) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCucumber.g:683:4: (lv_sentences_1_0= ruleSentence )
            	    {
            	    // InternalCucumber.g:683:4: (lv_sentences_1_0= ruleSentence )
            	    // InternalCucumber.g:684:5: lv_sentences_1_0= ruleSentence
            	    {

            	    					newCompositeNode(grammarAccess.getDescriptionAccess().getSentencesSentenceParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_16);
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
            	    break;

            	default :
            	    break loop10;
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
    // InternalCucumber.g:705:1: entryRuleTags returns [String current=null] : iv_ruleTags= ruleTags EOF ;
    public final String entryRuleTags() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTags = null;


        try {
            // InternalCucumber.g:705:44: (iv_ruleTags= ruleTags EOF )
            // InternalCucumber.g:706:2: iv_ruleTags= ruleTags EOF
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
    // InternalCucumber.g:712:1: ruleTags returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_TAG_0= RULE_TAG )* (this_EOL_1= RULE_EOL )? ) ;
    public final AntlrDatatypeRuleToken ruleTags() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TAG_0=null;
        Token this_EOL_1=null;


        	enterRule();

        try {
            // InternalCucumber.g:718:2: ( ( (this_TAG_0= RULE_TAG )* (this_EOL_1= RULE_EOL )? ) )
            // InternalCucumber.g:719:2: ( (this_TAG_0= RULE_TAG )* (this_EOL_1= RULE_EOL )? )
            {
            // InternalCucumber.g:719:2: ( (this_TAG_0= RULE_TAG )* (this_EOL_1= RULE_EOL )? )
            // InternalCucumber.g:720:3: (this_TAG_0= RULE_TAG )* (this_EOL_1= RULE_EOL )?
            {
            // InternalCucumber.g:720:3: (this_TAG_0= RULE_TAG )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_TAG) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCucumber.g:721:4: this_TAG_0= RULE_TAG
            	    {
            	    this_TAG_0=(Token)match(input,RULE_TAG,FOLLOW_17); 

            	    				current.merge(this_TAG_0);
            	    			

            	    				newLeafNode(this_TAG_0, grammarAccess.getTagsAccess().getTAGTerminalRuleCall_0());
            	    			

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalCucumber.g:729:3: (this_EOL_1= RULE_EOL )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_EOL) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCucumber.g:730:4: this_EOL_1= RULE_EOL
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
    // InternalCucumber.g:742:1: entryRuleSentence returns [String current=null] : iv_ruleSentence= ruleSentence EOF ;
    public final String entryRuleSentence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSentence = null;


        try {
            // InternalCucumber.g:742:48: (iv_ruleSentence= ruleSentence EOF )
            // InternalCucumber.g:743:2: iv_ruleSentence= ruleSentence EOF
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
    // InternalCucumber.g:749:1: ruleSentence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_WORD_0= RULE_WORD )+ (this_EOL_1= RULE_EOL )? ) ;
    public final AntlrDatatypeRuleToken ruleSentence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;
        Token this_EOL_1=null;


        	enterRule();

        try {
            // InternalCucumber.g:755:2: ( ( (this_WORD_0= RULE_WORD )+ (this_EOL_1= RULE_EOL )? ) )
            // InternalCucumber.g:756:2: ( (this_WORD_0= RULE_WORD )+ (this_EOL_1= RULE_EOL )? )
            {
            // InternalCucumber.g:756:2: ( (this_WORD_0= RULE_WORD )+ (this_EOL_1= RULE_EOL )? )
            // InternalCucumber.g:757:3: (this_WORD_0= RULE_WORD )+ (this_EOL_1= RULE_EOL )?
            {
            // InternalCucumber.g:757:3: (this_WORD_0= RULE_WORD )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_WORD) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCucumber.g:758:4: this_WORD_0= RULE_WORD
            	    {
            	    this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_18); 

            	    				current.merge(this_WORD_0);
            	    			

            	    				newLeafNode(this_WORD_0, grammarAccess.getSentenceAccess().getWORDTerminalRuleCall_0());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            // InternalCucumber.g:766:3: (this_EOL_1= RULE_EOL )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_EOL) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCucumber.g:767:4: this_EOL_1= RULE_EOL
                    {
                    this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_2); 

                    				current.merge(this_EOL_1);
                    			

                    				newLeafNode(this_EOL_1, grammarAccess.getSentenceAccess().getEOLTerminalRuleCall_1());
                    			

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
    // $ANTLR end "ruleSentence"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000C70L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000C32L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000832L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000003F040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000003F002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000052L});

}
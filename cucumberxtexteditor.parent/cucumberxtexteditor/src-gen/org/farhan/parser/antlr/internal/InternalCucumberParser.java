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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TAG", "RULE_EOL", "RULE_WORD", "RULE_WS", "RULE_COMMENT", "'Feature:'", "'Background:'", "'Scenario:'", "'Given'", "'When'", "'Then'", "'And'", "'But'", "'*'"
    };
    public static final int T__9=9;
    public static final int RULE_EOL=5;
    public static final int RULE_WS=7;
    public static final int RULE_WORD=6;
    public static final int RULE_COMMENT=8;
    public static final int RULE_TAG=4;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__10=10;

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

                if ( ((LA2_0>=RULE_TAG && LA2_0<=RULE_EOL)||LA2_0==11) ) {
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
    // InternalCucumber.g:344:1: ruleStep returns [EObject current=null] : ( ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) ) ( (lv_title_1_0= ruleSentence ) ) ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_1=null;
        Token lv_keyword_0_2=null;
        Token lv_keyword_0_3=null;
        Token lv_keyword_0_4=null;
        Token lv_keyword_0_5=null;
        Token lv_keyword_0_6=null;
        AntlrDatatypeRuleToken lv_title_1_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:350:2: ( ( ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) ) ( (lv_title_1_0= ruleSentence ) ) ) )
            // InternalCucumber.g:351:2: ( ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) ) ( (lv_title_1_0= ruleSentence ) ) )
            {
            // InternalCucumber.g:351:2: ( ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) ) ( (lv_title_1_0= ruleSentence ) ) )
            // InternalCucumber.g:352:3: ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) ) ( (lv_title_1_0= ruleSentence ) )
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
            				
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleDescription"
    // InternalCucumber.g:446:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalCucumber.g:446:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalCucumber.g:447:2: iv_ruleDescription= ruleDescription EOF
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
    // InternalCucumber.g:453:1: ruleDescription returns [EObject current=null] : ( () ( (lv_sentences_1_0= ruleSentence ) )* ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_sentences_1_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:459:2: ( ( () ( (lv_sentences_1_0= ruleSentence ) )* ) )
            // InternalCucumber.g:460:2: ( () ( (lv_sentences_1_0= ruleSentence ) )* )
            {
            // InternalCucumber.g:460:2: ( () ( (lv_sentences_1_0= ruleSentence ) )* )
            // InternalCucumber.g:461:3: () ( (lv_sentences_1_0= ruleSentence ) )*
            {
            // InternalCucumber.g:461:3: ()
            // InternalCucumber.g:462:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDescriptionAccess().getDescriptionAction_0(),
            					current);
            			

            }

            // InternalCucumber.g:468:3: ( (lv_sentences_1_0= ruleSentence ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_WORD) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCucumber.g:469:4: (lv_sentences_1_0= ruleSentence )
            	    {
            	    // InternalCucumber.g:469:4: (lv_sentences_1_0= ruleSentence )
            	    // InternalCucumber.g:470:5: lv_sentences_1_0= ruleSentence
            	    {

            	    					newCompositeNode(grammarAccess.getDescriptionAccess().getSentencesSentenceParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_11);
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
            	    break loop6;
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
    // InternalCucumber.g:491:1: entryRuleTags returns [String current=null] : iv_ruleTags= ruleTags EOF ;
    public final String entryRuleTags() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTags = null;


        try {
            // InternalCucumber.g:491:44: (iv_ruleTags= ruleTags EOF )
            // InternalCucumber.g:492:2: iv_ruleTags= ruleTags EOF
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
    // InternalCucumber.g:498:1: ruleTags returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_TAG_0= RULE_TAG )* (this_EOL_1= RULE_EOL )? ) ;
    public final AntlrDatatypeRuleToken ruleTags() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TAG_0=null;
        Token this_EOL_1=null;


        	enterRule();

        try {
            // InternalCucumber.g:504:2: ( ( (this_TAG_0= RULE_TAG )* (this_EOL_1= RULE_EOL )? ) )
            // InternalCucumber.g:505:2: ( (this_TAG_0= RULE_TAG )* (this_EOL_1= RULE_EOL )? )
            {
            // InternalCucumber.g:505:2: ( (this_TAG_0= RULE_TAG )* (this_EOL_1= RULE_EOL )? )
            // InternalCucumber.g:506:3: (this_TAG_0= RULE_TAG )* (this_EOL_1= RULE_EOL )?
            {
            // InternalCucumber.g:506:3: (this_TAG_0= RULE_TAG )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_TAG) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCucumber.g:507:4: this_TAG_0= RULE_TAG
            	    {
            	    this_TAG_0=(Token)match(input,RULE_TAG,FOLLOW_12); 

            	    				current.merge(this_TAG_0);
            	    			

            	    				newLeafNode(this_TAG_0, grammarAccess.getTagsAccess().getTAGTerminalRuleCall_0());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalCucumber.g:515:3: (this_EOL_1= RULE_EOL )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_EOL) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCucumber.g:516:4: this_EOL_1= RULE_EOL
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
    // InternalCucumber.g:528:1: entryRuleSentence returns [String current=null] : iv_ruleSentence= ruleSentence EOF ;
    public final String entryRuleSentence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSentence = null;


        try {
            // InternalCucumber.g:528:48: (iv_ruleSentence= ruleSentence EOF )
            // InternalCucumber.g:529:2: iv_ruleSentence= ruleSentence EOF
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
    // InternalCucumber.g:535:1: ruleSentence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_WORD_0= RULE_WORD )+ (this_EOL_1= RULE_EOL )? ) ;
    public final AntlrDatatypeRuleToken ruleSentence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;
        Token this_EOL_1=null;


        	enterRule();

        try {
            // InternalCucumber.g:541:2: ( ( (this_WORD_0= RULE_WORD )+ (this_EOL_1= RULE_EOL )? ) )
            // InternalCucumber.g:542:2: ( (this_WORD_0= RULE_WORD )+ (this_EOL_1= RULE_EOL )? )
            {
            // InternalCucumber.g:542:2: ( (this_WORD_0= RULE_WORD )+ (this_EOL_1= RULE_EOL )? )
            // InternalCucumber.g:543:3: (this_WORD_0= RULE_WORD )+ (this_EOL_1= RULE_EOL )?
            {
            // InternalCucumber.g:543:3: (this_WORD_0= RULE_WORD )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_WORD) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCucumber.g:544:4: this_WORD_0= RULE_WORD
            	    {
            	    this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_13); 

            	    				current.merge(this_WORD_0);
            	    			

            	    				newLeafNode(this_WORD_0, grammarAccess.getSentenceAccess().getWORDTerminalRuleCall_0());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            // InternalCucumber.g:552:3: (this_EOL_1= RULE_EOL )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_EOL) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCucumber.g:553:4: this_EOL_1= RULE_EOL
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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000062L});

}
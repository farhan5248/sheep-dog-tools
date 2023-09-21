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
    // InternalCucumber.g:71:1: ruleFeature returns [EObject current=null] : ( ruleTags otherlv_1= 'Feature:' ( (lv_title_2_0= ruleSentence ) ) ( (lv_description_3_0= ruleDescription ) ) ( (lv_background_4_0= ruleBackground ) )? ( ( (lv_scenarios_5_1= ruleScenario | lv_scenarios_5_2= ruleScenarioOutline ) ) )* ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_title_2_0 = null;

        EObject lv_description_3_0 = null;

        EObject lv_background_4_0 = null;

        EObject lv_scenarios_5_1 = null;

        EObject lv_scenarios_5_2 = null;



        	enterRule();

        try {
            // InternalCucumber.g:77:2: ( ( ruleTags otherlv_1= 'Feature:' ( (lv_title_2_0= ruleSentence ) ) ( (lv_description_3_0= ruleDescription ) ) ( (lv_background_4_0= ruleBackground ) )? ( ( (lv_scenarios_5_1= ruleScenario | lv_scenarios_5_2= ruleScenarioOutline ) ) )* ) )
            // InternalCucumber.g:78:2: ( ruleTags otherlv_1= 'Feature:' ( (lv_title_2_0= ruleSentence ) ) ( (lv_description_3_0= ruleDescription ) ) ( (lv_background_4_0= ruleBackground ) )? ( ( (lv_scenarios_5_1= ruleScenario | lv_scenarios_5_2= ruleScenarioOutline ) ) )* )
            {
            // InternalCucumber.g:78:2: ( ruleTags otherlv_1= 'Feature:' ( (lv_title_2_0= ruleSentence ) ) ( (lv_description_3_0= ruleDescription ) ) ( (lv_background_4_0= ruleBackground ) )? ( ( (lv_scenarios_5_1= ruleScenario | lv_scenarios_5_2= ruleScenarioOutline ) ) )* )
            // InternalCucumber.g:79:3: ruleTags otherlv_1= 'Feature:' ( (lv_title_2_0= ruleSentence ) ) ( (lv_description_3_0= ruleDescription ) ) ( (lv_background_4_0= ruleBackground ) )? ( ( (lv_scenarios_5_1= ruleScenario | lv_scenarios_5_2= ruleScenarioOutline ) ) )*
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

            // InternalCucumber.g:147:3: ( ( (lv_scenarios_5_1= ruleScenario | lv_scenarios_5_2= ruleScenarioOutline ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_EOL && LA3_0<=RULE_TAG)||(LA3_0>=11 && LA3_0<=12)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCucumber.g:148:4: ( (lv_scenarios_5_1= ruleScenario | lv_scenarios_5_2= ruleScenarioOutline ) )
            	    {
            	    // InternalCucumber.g:148:4: ( (lv_scenarios_5_1= ruleScenario | lv_scenarios_5_2= ruleScenarioOutline ) )
            	    // InternalCucumber.g:149:5: (lv_scenarios_5_1= ruleScenario | lv_scenarios_5_2= ruleScenarioOutline )
            	    {
            	    // InternalCucumber.g:149:5: (lv_scenarios_5_1= ruleScenario | lv_scenarios_5_2= ruleScenarioOutline )
            	    int alt2=2;
            	    alt2 = dfa2.predict(input);
            	    switch (alt2) {
            	        case 1 :
            	            // InternalCucumber.g:150:6: lv_scenarios_5_1= ruleScenario
            	            {

            	            						newCompositeNode(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_5_0_0());
            	            					
            	            pushFollow(FOLLOW_7);
            	            lv_scenarios_5_1=ruleScenario();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getFeatureRule());
            	            						}
            	            						add(
            	            							current,
            	            							"scenarios",
            	            							lv_scenarios_5_1,
            	            							"org.farhan.Cucumber.Scenario");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalCucumber.g:166:6: lv_scenarios_5_2= ruleScenarioOutline
            	            {

            	            						newCompositeNode(grammarAccess.getFeatureAccess().getScenariosScenarioOutlineParserRuleCall_5_0_1());
            	            					
            	            pushFollow(FOLLOW_7);
            	            lv_scenarios_5_2=ruleScenarioOutline();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getFeatureRule());
            	            						}
            	            						add(
            	            							current,
            	            							"scenarios",
            	            							lv_scenarios_5_2,
            	            							"org.farhan.Cucumber.ScenarioOutline");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


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
    // InternalCucumber.g:188:1: entryRuleBackground returns [EObject current=null] : iv_ruleBackground= ruleBackground EOF ;
    public final EObject entryRuleBackground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackground = null;


        try {
            // InternalCucumber.g:188:51: (iv_ruleBackground= ruleBackground EOF )
            // InternalCucumber.g:189:2: iv_ruleBackground= ruleBackground EOF
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
    // InternalCucumber.g:195:1: ruleBackground returns [EObject current=null] : (otherlv_0= 'Background:' ( (lv_title_1_0= ruleSentence ) ) ( (lv_description_2_0= ruleDescription ) ) ( (lv_steps_3_0= ruleStep ) )* ) ;
    public final EObject ruleBackground() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_title_1_0 = null;

        EObject lv_description_2_0 = null;

        EObject lv_steps_3_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:201:2: ( (otherlv_0= 'Background:' ( (lv_title_1_0= ruleSentence ) ) ( (lv_description_2_0= ruleDescription ) ) ( (lv_steps_3_0= ruleStep ) )* ) )
            // InternalCucumber.g:202:2: (otherlv_0= 'Background:' ( (lv_title_1_0= ruleSentence ) ) ( (lv_description_2_0= ruleDescription ) ) ( (lv_steps_3_0= ruleStep ) )* )
            {
            // InternalCucumber.g:202:2: (otherlv_0= 'Background:' ( (lv_title_1_0= ruleSentence ) ) ( (lv_description_2_0= ruleDescription ) ) ( (lv_steps_3_0= ruleStep ) )* )
            // InternalCucumber.g:203:3: otherlv_0= 'Background:' ( (lv_title_1_0= ruleSentence ) ) ( (lv_description_2_0= ruleDescription ) ) ( (lv_steps_3_0= ruleStep ) )*
            {
            otherlv_0=(Token)match(input,10,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBackgroundAccess().getBackgroundKeyword_0());
            		
            // InternalCucumber.g:207:3: ( (lv_title_1_0= ruleSentence ) )
            // InternalCucumber.g:208:4: (lv_title_1_0= ruleSentence )
            {
            // InternalCucumber.g:208:4: (lv_title_1_0= ruleSentence )
            // InternalCucumber.g:209:5: lv_title_1_0= ruleSentence
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

            // InternalCucumber.g:226:3: ( (lv_description_2_0= ruleDescription ) )
            // InternalCucumber.g:227:4: (lv_description_2_0= ruleDescription )
            {
            // InternalCucumber.g:227:4: (lv_description_2_0= ruleDescription )
            // InternalCucumber.g:228:5: lv_description_2_0= ruleDescription
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

            // InternalCucumber.g:245:3: ( (lv_steps_3_0= ruleStep ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=14 && LA4_0<=19)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCucumber.g:246:4: (lv_steps_3_0= ruleStep )
            	    {
            	    // InternalCucumber.g:246:4: (lv_steps_3_0= ruleStep )
            	    // InternalCucumber.g:247:5: lv_steps_3_0= ruleStep
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
    // $ANTLR end "ruleBackground"


    // $ANTLR start "entryRuleScenario"
    // InternalCucumber.g:268:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalCucumber.g:268:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalCucumber.g:269:2: iv_ruleScenario= ruleScenario EOF
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
    // InternalCucumber.g:275:1: ruleScenario returns [EObject current=null] : ( ruleTags otherlv_1= 'Scenario:' ( (lv_title_2_0= ruleSentence ) ) ( (lv_description_3_0= ruleDescription ) ) ( (lv_steps_4_0= ruleStep ) )* ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_title_2_0 = null;

        EObject lv_description_3_0 = null;

        EObject lv_steps_4_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:281:2: ( ( ruleTags otherlv_1= 'Scenario:' ( (lv_title_2_0= ruleSentence ) ) ( (lv_description_3_0= ruleDescription ) ) ( (lv_steps_4_0= ruleStep ) )* ) )
            // InternalCucumber.g:282:2: ( ruleTags otherlv_1= 'Scenario:' ( (lv_title_2_0= ruleSentence ) ) ( (lv_description_3_0= ruleDescription ) ) ( (lv_steps_4_0= ruleStep ) )* )
            {
            // InternalCucumber.g:282:2: ( ruleTags otherlv_1= 'Scenario:' ( (lv_title_2_0= ruleSentence ) ) ( (lv_description_3_0= ruleDescription ) ) ( (lv_steps_4_0= ruleStep ) )* )
            // InternalCucumber.g:283:3: ruleTags otherlv_1= 'Scenario:' ( (lv_title_2_0= ruleSentence ) ) ( (lv_description_3_0= ruleDescription ) ) ( (lv_steps_4_0= ruleStep ) )*
            {

            			newCompositeNode(grammarAccess.getScenarioAccess().getTagsParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            ruleTags();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getScenarioAccess().getScenarioKeyword_1());
            		
            // InternalCucumber.g:294:3: ( (lv_title_2_0= ruleSentence ) )
            // InternalCucumber.g:295:4: (lv_title_2_0= ruleSentence )
            {
            // InternalCucumber.g:295:4: (lv_title_2_0= ruleSentence )
            // InternalCucumber.g:296:5: lv_title_2_0= ruleSentence
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

            // InternalCucumber.g:313:3: ( (lv_description_3_0= ruleDescription ) )
            // InternalCucumber.g:314:4: (lv_description_3_0= ruleDescription )
            {
            // InternalCucumber.g:314:4: (lv_description_3_0= ruleDescription )
            // InternalCucumber.g:315:5: lv_description_3_0= ruleDescription
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

            // InternalCucumber.g:332:3: ( (lv_steps_4_0= ruleStep ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=14 && LA5_0<=19)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCucumber.g:333:4: (lv_steps_4_0= ruleStep )
            	    {
            	    // InternalCucumber.g:333:4: (lv_steps_4_0= ruleStep )
            	    // InternalCucumber.g:334:5: lv_steps_4_0= ruleStep
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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleScenarioOutline"
    // InternalCucumber.g:355:1: entryRuleScenarioOutline returns [EObject current=null] : iv_ruleScenarioOutline= ruleScenarioOutline EOF ;
    public final EObject entryRuleScenarioOutline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenarioOutline = null;


        try {
            // InternalCucumber.g:355:56: (iv_ruleScenarioOutline= ruleScenarioOutline EOF )
            // InternalCucumber.g:356:2: iv_ruleScenarioOutline= ruleScenarioOutline EOF
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
    // InternalCucumber.g:362:1: ruleScenarioOutline returns [EObject current=null] : ( ruleTags otherlv_1= 'Scenario Outline:' ( (lv_title_2_0= ruleSentence ) ) ( (lv_description_3_0= ruleDescription ) ) ( (lv_steps_4_0= ruleStep ) )* ( (lv_examples_5_0= ruleExample ) )+ ) ;
    public final EObject ruleScenarioOutline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_title_2_0 = null;

        EObject lv_description_3_0 = null;

        EObject lv_steps_4_0 = null;

        EObject lv_examples_5_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:368:2: ( ( ruleTags otherlv_1= 'Scenario Outline:' ( (lv_title_2_0= ruleSentence ) ) ( (lv_description_3_0= ruleDescription ) ) ( (lv_steps_4_0= ruleStep ) )* ( (lv_examples_5_0= ruleExample ) )+ ) )
            // InternalCucumber.g:369:2: ( ruleTags otherlv_1= 'Scenario Outline:' ( (lv_title_2_0= ruleSentence ) ) ( (lv_description_3_0= ruleDescription ) ) ( (lv_steps_4_0= ruleStep ) )* ( (lv_examples_5_0= ruleExample ) )+ )
            {
            // InternalCucumber.g:369:2: ( ruleTags otherlv_1= 'Scenario Outline:' ( (lv_title_2_0= ruleSentence ) ) ( (lv_description_3_0= ruleDescription ) ) ( (lv_steps_4_0= ruleStep ) )* ( (lv_examples_5_0= ruleExample ) )+ )
            // InternalCucumber.g:370:3: ruleTags otherlv_1= 'Scenario Outline:' ( (lv_title_2_0= ruleSentence ) ) ( (lv_description_3_0= ruleDescription ) ) ( (lv_steps_4_0= ruleStep ) )* ( (lv_examples_5_0= ruleExample ) )+
            {

            			newCompositeNode(grammarAccess.getScenarioOutlineAccess().getTagsParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            ruleTags();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getScenarioOutlineAccess().getScenarioOutlineKeyword_1());
            		
            // InternalCucumber.g:381:3: ( (lv_title_2_0= ruleSentence ) )
            // InternalCucumber.g:382:4: (lv_title_2_0= ruleSentence )
            {
            // InternalCucumber.g:382:4: (lv_title_2_0= ruleSentence )
            // InternalCucumber.g:383:5: lv_title_2_0= ruleSentence
            {

            					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getTitleSentenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalCucumber.g:400:3: ( (lv_description_3_0= ruleDescription ) )
            // InternalCucumber.g:401:4: (lv_description_3_0= ruleDescription )
            {
            // InternalCucumber.g:401:4: (lv_description_3_0= ruleDescription )
            // InternalCucumber.g:402:5: lv_description_3_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getDescriptionDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_description_3_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.farhan.Cucumber.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCucumber.g:419:3: ( (lv_steps_4_0= ruleStep ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=14 && LA6_0<=19)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCucumber.g:420:4: (lv_steps_4_0= ruleStep )
            	    {
            	    // InternalCucumber.g:420:4: (lv_steps_4_0= ruleStep )
            	    // InternalCucumber.g:421:5: lv_steps_4_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getStepsStepParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_steps_4_0=ruleStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
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
            	    break loop6;
                }
            } while (true);

            // InternalCucumber.g:438:3: ( (lv_examples_5_0= ruleExample ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // InternalCucumber.g:439:4: (lv_examples_5_0= ruleExample )
            	    {
            	    // InternalCucumber.g:439:4: (lv_examples_5_0= ruleExample )
            	    // InternalCucumber.g:440:5: lv_examples_5_0= ruleExample
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getExamplesExampleParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_examples_5_0=ruleExample();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"examples",
            	    						lv_examples_5_0,
            	    						"org.farhan.Cucumber.Example");
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
    // InternalCucumber.g:461:1: entryRuleExample returns [EObject current=null] : iv_ruleExample= ruleExample EOF ;
    public final EObject entryRuleExample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExample = null;


        try {
            // InternalCucumber.g:461:48: (iv_ruleExample= ruleExample EOF )
            // InternalCucumber.g:462:2: iv_ruleExample= ruleExample EOF
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
    // InternalCucumber.g:468:1: ruleExample returns [EObject current=null] : ( ruleTags otherlv_1= 'Examples:' ( (lv_title_2_0= ruleSentence ) ) ( (lv_description_3_0= ruleDescription ) ) ( (lv_table_4_0= ruleTable ) ) ) ;
    public final EObject ruleExample() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_title_2_0 = null;

        EObject lv_description_3_0 = null;

        EObject lv_table_4_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:474:2: ( ( ruleTags otherlv_1= 'Examples:' ( (lv_title_2_0= ruleSentence ) ) ( (lv_description_3_0= ruleDescription ) ) ( (lv_table_4_0= ruleTable ) ) ) )
            // InternalCucumber.g:475:2: ( ruleTags otherlv_1= 'Examples:' ( (lv_title_2_0= ruleSentence ) ) ( (lv_description_3_0= ruleDescription ) ) ( (lv_table_4_0= ruleTable ) ) )
            {
            // InternalCucumber.g:475:2: ( ruleTags otherlv_1= 'Examples:' ( (lv_title_2_0= ruleSentence ) ) ( (lv_description_3_0= ruleDescription ) ) ( (lv_table_4_0= ruleTable ) ) )
            // InternalCucumber.g:476:3: ruleTags otherlv_1= 'Examples:' ( (lv_title_2_0= ruleSentence ) ) ( (lv_description_3_0= ruleDescription ) ) ( (lv_table_4_0= ruleTable ) )
            {

            			newCompositeNode(grammarAccess.getExampleAccess().getTagsParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            ruleTags();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getExampleAccess().getExamplesKeyword_1());
            		
            // InternalCucumber.g:487:3: ( (lv_title_2_0= ruleSentence ) )
            // InternalCucumber.g:488:4: (lv_title_2_0= ruleSentence )
            {
            // InternalCucumber.g:488:4: (lv_title_2_0= ruleSentence )
            // InternalCucumber.g:489:5: lv_title_2_0= ruleSentence
            {

            					newCompositeNode(grammarAccess.getExampleAccess().getTitleSentenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
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

            // InternalCucumber.g:506:3: ( (lv_description_3_0= ruleDescription ) )
            // InternalCucumber.g:507:4: (lv_description_3_0= ruleDescription )
            {
            // InternalCucumber.g:507:4: (lv_description_3_0= ruleDescription )
            // InternalCucumber.g:508:5: lv_description_3_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getExampleAccess().getDescriptionDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_description_3_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExampleRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.farhan.Cucumber.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCucumber.g:525:3: ( (lv_table_4_0= ruleTable ) )
            // InternalCucumber.g:526:4: (lv_table_4_0= ruleTable )
            {
            // InternalCucumber.g:526:4: (lv_table_4_0= ruleTable )
            // InternalCucumber.g:527:5: lv_table_4_0= ruleTable
            {

            					newCompositeNode(grammarAccess.getExampleAccess().getTableTableParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_table_4_0=ruleTable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExampleRule());
            					}
            					set(
            						current,
            						"table",
            						lv_table_4_0,
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
    // InternalCucumber.g:548:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalCucumber.g:548:45: (iv_ruleStep= ruleStep EOF )
            // InternalCucumber.g:549:2: iv_ruleStep= ruleStep EOF
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
    // InternalCucumber.g:555:1: ruleStep returns [EObject current=null] : ( ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) ) ( (lv_title_1_0= ruleSentence ) ) ( ( (lv_table_2_0= ruleTable ) ) | ( (lv_text_3_0= ruleDocString ) ) )? ) ;
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
            // InternalCucumber.g:561:2: ( ( ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) ) ( (lv_title_1_0= ruleSentence ) ) ( ( (lv_table_2_0= ruleTable ) ) | ( (lv_text_3_0= ruleDocString ) ) )? ) )
            // InternalCucumber.g:562:2: ( ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) ) ( (lv_title_1_0= ruleSentence ) ) ( ( (lv_table_2_0= ruleTable ) ) | ( (lv_text_3_0= ruleDocString ) ) )? )
            {
            // InternalCucumber.g:562:2: ( ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) ) ( (lv_title_1_0= ruleSentence ) ) ( ( (lv_table_2_0= ruleTable ) ) | ( (lv_text_3_0= ruleDocString ) ) )? )
            // InternalCucumber.g:563:3: ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) ) ( (lv_title_1_0= ruleSentence ) ) ( ( (lv_table_2_0= ruleTable ) ) | ( (lv_text_3_0= ruleDocString ) ) )?
            {
            // InternalCucumber.g:563:3: ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) )
            // InternalCucumber.g:564:4: ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) )
            {
            // InternalCucumber.g:564:4: ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) )
            // InternalCucumber.g:565:5: (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' )
            {
            // InternalCucumber.g:565:5: (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt8=1;
                }
                break;
            case 15:
                {
                alt8=2;
                }
                break;
            case 16:
                {
                alt8=3;
                }
                break;
            case 17:
                {
                alt8=4;
                }
                break;
            case 18:
                {
                alt8=5;
                }
                break;
            case 19:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalCucumber.g:566:6: lv_keyword_0_1= 'Given'
                    {
                    lv_keyword_0_1=(Token)match(input,14,FOLLOW_4); 

                    						newLeafNode(lv_keyword_0_1, grammarAccess.getStepAccess().getKeywordGivenKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStepRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalCucumber.g:577:6: lv_keyword_0_2= 'When'
                    {
                    lv_keyword_0_2=(Token)match(input,15,FOLLOW_4); 

                    						newLeafNode(lv_keyword_0_2, grammarAccess.getStepAccess().getKeywordWhenKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStepRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalCucumber.g:588:6: lv_keyword_0_3= 'Then'
                    {
                    lv_keyword_0_3=(Token)match(input,16,FOLLOW_4); 

                    						newLeafNode(lv_keyword_0_3, grammarAccess.getStepAccess().getKeywordThenKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStepRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalCucumber.g:599:6: lv_keyword_0_4= 'And'
                    {
                    lv_keyword_0_4=(Token)match(input,17,FOLLOW_4); 

                    						newLeafNode(lv_keyword_0_4, grammarAccess.getStepAccess().getKeywordAndKeyword_0_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStepRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_0_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalCucumber.g:610:6: lv_keyword_0_5= 'But'
                    {
                    lv_keyword_0_5=(Token)match(input,18,FOLLOW_4); 

                    						newLeafNode(lv_keyword_0_5, grammarAccess.getStepAccess().getKeywordButKeyword_0_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStepRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_0_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalCucumber.g:621:6: lv_keyword_0_6= '*'
                    {
                    lv_keyword_0_6=(Token)match(input,19,FOLLOW_4); 

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

            // InternalCucumber.g:634:3: ( (lv_title_1_0= ruleSentence ) )
            // InternalCucumber.g:635:4: (lv_title_1_0= ruleSentence )
            {
            // InternalCucumber.g:635:4: (lv_title_1_0= ruleSentence )
            // InternalCucumber.g:636:5: lv_title_1_0= ruleSentence
            {

            					newCompositeNode(grammarAccess.getStepAccess().getTitleSentenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
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

            // InternalCucumber.g:653:3: ( ( (lv_table_2_0= ruleTable ) ) | ( (lv_text_3_0= ruleDocString ) ) )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // InternalCucumber.g:654:4: ( (lv_table_2_0= ruleTable ) )
                    {
                    // InternalCucumber.g:654:4: ( (lv_table_2_0= ruleTable ) )
                    // InternalCucumber.g:655:5: (lv_table_2_0= ruleTable )
                    {
                    // InternalCucumber.g:655:5: (lv_table_2_0= ruleTable )
                    // InternalCucumber.g:656:6: lv_table_2_0= ruleTable
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
                    // InternalCucumber.g:674:4: ( (lv_text_3_0= ruleDocString ) )
                    {
                    // InternalCucumber.g:674:4: ( (lv_text_3_0= ruleDocString ) )
                    // InternalCucumber.g:675:5: (lv_text_3_0= ruleDocString )
                    {
                    // InternalCucumber.g:675:5: (lv_text_3_0= ruleDocString )
                    // InternalCucumber.g:676:6: lv_text_3_0= ruleDocString
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
    // InternalCucumber.g:698:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalCucumber.g:698:46: (iv_ruleTable= ruleTable EOF )
            // InternalCucumber.g:699:2: iv_ruleTable= ruleTable EOF
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
    // InternalCucumber.g:705:1: ruleTable returns [EObject current=null] : ( (lv_rows_0_0= ruleTableRow ) )+ ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        EObject lv_rows_0_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:711:2: ( ( (lv_rows_0_0= ruleTableRow ) )+ )
            // InternalCucumber.g:712:2: ( (lv_rows_0_0= ruleTableRow ) )+
            {
            // InternalCucumber.g:712:2: ( (lv_rows_0_0= ruleTableRow ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCucumber.g:713:3: (lv_rows_0_0= ruleTableRow )
            	    {
            	    // InternalCucumber.g:713:3: (lv_rows_0_0= ruleTableRow )
            	    // InternalCucumber.g:714:4: lv_rows_0_0= ruleTableRow
            	    {

            	    				newCompositeNode(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_17);
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
    // InternalCucumber.g:734:1: entryRuleTableRow returns [EObject current=null] : iv_ruleTableRow= ruleTableRow EOF ;
    public final EObject entryRuleTableRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableRow = null;


        try {
            // InternalCucumber.g:734:49: (iv_ruleTableRow= ruleTableRow EOF )
            // InternalCucumber.g:735:2: iv_ruleTableRow= ruleTableRow EOF
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
    // InternalCucumber.g:741:1: ruleTableRow returns [EObject current=null] : ( ( (lv_cells_0_0= ruleRowCell ) )+ otherlv_1= '|' this_EOL_2= RULE_EOL ) ;
    public final EObject ruleTableRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_EOL_2=null;
        EObject lv_cells_0_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:747:2: ( ( ( (lv_cells_0_0= ruleRowCell ) )+ otherlv_1= '|' this_EOL_2= RULE_EOL ) )
            // InternalCucumber.g:748:2: ( ( (lv_cells_0_0= ruleRowCell ) )+ otherlv_1= '|' this_EOL_2= RULE_EOL )
            {
            // InternalCucumber.g:748:2: ( ( (lv_cells_0_0= ruleRowCell ) )+ otherlv_1= '|' this_EOL_2= RULE_EOL )
            // InternalCucumber.g:749:3: ( (lv_cells_0_0= ruleRowCell ) )+ otherlv_1= '|' this_EOL_2= RULE_EOL
            {
            // InternalCucumber.g:749:3: ( (lv_cells_0_0= ruleRowCell ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==RULE_WORD) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalCucumber.g:750:4: (lv_cells_0_0= ruleRowCell )
            	    {
            	    // InternalCucumber.g:750:4: (lv_cells_0_0= ruleRowCell )
            	    // InternalCucumber.g:751:5: lv_cells_0_0= ruleRowCell
            	    {

            	    					newCompositeNode(grammarAccess.getTableRowAccess().getCellsRowCellParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_15);
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_1=(Token)match(input,20,FOLLOW_18); 

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
    // InternalCucumber.g:780:1: entryRuleRowCell returns [EObject current=null] : iv_ruleRowCell= ruleRowCell EOF ;
    public final EObject entryRuleRowCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowCell = null;


        try {
            // InternalCucumber.g:780:48: (iv_ruleRowCell= ruleRowCell EOF )
            // InternalCucumber.g:781:2: iv_ruleRowCell= ruleRowCell EOF
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
    // InternalCucumber.g:787:1: ruleRowCell returns [EObject current=null] : ( ( (lv_cell_0_0= '|' ) ) ruleSentence ) ;
    public final EObject ruleRowCell() throws RecognitionException {
        EObject current = null;

        Token lv_cell_0_0=null;


        	enterRule();

        try {
            // InternalCucumber.g:793:2: ( ( ( (lv_cell_0_0= '|' ) ) ruleSentence ) )
            // InternalCucumber.g:794:2: ( ( (lv_cell_0_0= '|' ) ) ruleSentence )
            {
            // InternalCucumber.g:794:2: ( ( (lv_cell_0_0= '|' ) ) ruleSentence )
            // InternalCucumber.g:795:3: ( (lv_cell_0_0= '|' ) ) ruleSentence
            {
            // InternalCucumber.g:795:3: ( (lv_cell_0_0= '|' ) )
            // InternalCucumber.g:796:4: (lv_cell_0_0= '|' )
            {
            // InternalCucumber.g:796:4: (lv_cell_0_0= '|' )
            // InternalCucumber.g:797:5: lv_cell_0_0= '|'
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
    // InternalCucumber.g:820:1: entryRuleDocString returns [EObject current=null] : iv_ruleDocString= ruleDocString EOF ;
    public final EObject entryRuleDocString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocString = null;


        try {
            // InternalCucumber.g:820:50: (iv_ruleDocString= ruleDocString EOF )
            // InternalCucumber.g:821:2: iv_ruleDocString= ruleDocString EOF
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
    // InternalCucumber.g:827:1: ruleDocString returns [EObject current=null] : ( () otherlv_1= '\"\"\"' this_EOL_2= RULE_EOL ( ruleSentence )* otherlv_4= '\"\"\"' this_EOL_5= RULE_EOL ) ;
    public final EObject ruleDocString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_EOL_2=null;
        Token otherlv_4=null;
        Token this_EOL_5=null;


        	enterRule();

        try {
            // InternalCucumber.g:833:2: ( ( () otherlv_1= '\"\"\"' this_EOL_2= RULE_EOL ( ruleSentence )* otherlv_4= '\"\"\"' this_EOL_5= RULE_EOL ) )
            // InternalCucumber.g:834:2: ( () otherlv_1= '\"\"\"' this_EOL_2= RULE_EOL ( ruleSentence )* otherlv_4= '\"\"\"' this_EOL_5= RULE_EOL )
            {
            // InternalCucumber.g:834:2: ( () otherlv_1= '\"\"\"' this_EOL_2= RULE_EOL ( ruleSentence )* otherlv_4= '\"\"\"' this_EOL_5= RULE_EOL )
            // InternalCucumber.g:835:3: () otherlv_1= '\"\"\"' this_EOL_2= RULE_EOL ( ruleSentence )* otherlv_4= '\"\"\"' this_EOL_5= RULE_EOL
            {
            // InternalCucumber.g:835:3: ()
            // InternalCucumber.g:836:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDocStringAccess().getDocStringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_1());
            		
            this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_19); 

            			newLeafNode(this_EOL_2, grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_2());
            		
            // InternalCucumber.g:850:3: ( ruleSentence )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_WORD) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCucumber.g:851:4: ruleSentence
            	    {

            	    				newCompositeNode(grammarAccess.getDocStringAccess().getSentenceParserRuleCall_3());
            	    			
            	    pushFollow(FOLLOW_19);
            	    ruleSentence();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_18); 

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
    // InternalCucumber.g:871:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalCucumber.g:871:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalCucumber.g:872:2: iv_ruleDescription= ruleDescription EOF
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
    // InternalCucumber.g:878:1: ruleDescription returns [EObject current=null] : ( () ( (lv_sentences_1_0= ruleSentence ) )* ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_sentences_1_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:884:2: ( ( () ( (lv_sentences_1_0= ruleSentence ) )* ) )
            // InternalCucumber.g:885:2: ( () ( (lv_sentences_1_0= ruleSentence ) )* )
            {
            // InternalCucumber.g:885:2: ( () ( (lv_sentences_1_0= ruleSentence ) )* )
            // InternalCucumber.g:886:3: () ( (lv_sentences_1_0= ruleSentence ) )*
            {
            // InternalCucumber.g:886:3: ()
            // InternalCucumber.g:887:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDescriptionAccess().getDescriptionAction_0(),
            					current);
            			

            }

            // InternalCucumber.g:893:3: ( (lv_sentences_1_0= ruleSentence ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_WORD) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCucumber.g:894:4: (lv_sentences_1_0= ruleSentence )
            	    {
            	    // InternalCucumber.g:894:4: (lv_sentences_1_0= ruleSentence )
            	    // InternalCucumber.g:895:5: lv_sentences_1_0= ruleSentence
            	    {

            	    					newCompositeNode(grammarAccess.getDescriptionAccess().getSentencesSentenceParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    break loop13;
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
    // InternalCucumber.g:916:1: entryRuleTags returns [String current=null] : iv_ruleTags= ruleTags EOF ;
    public final String entryRuleTags() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTags = null;


        try {
            // InternalCucumber.g:916:44: (iv_ruleTags= ruleTags EOF )
            // InternalCucumber.g:917:2: iv_ruleTags= ruleTags EOF
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
    // InternalCucumber.g:923:1: ruleTags returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_TAG_0= RULE_TAG )* (this_EOL_1= RULE_EOL )? ) ;
    public final AntlrDatatypeRuleToken ruleTags() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TAG_0=null;
        Token this_EOL_1=null;


        	enterRule();

        try {
            // InternalCucumber.g:929:2: ( ( (this_TAG_0= RULE_TAG )* (this_EOL_1= RULE_EOL )? ) )
            // InternalCucumber.g:930:2: ( (this_TAG_0= RULE_TAG )* (this_EOL_1= RULE_EOL )? )
            {
            // InternalCucumber.g:930:2: ( (this_TAG_0= RULE_TAG )* (this_EOL_1= RULE_EOL )? )
            // InternalCucumber.g:931:3: (this_TAG_0= RULE_TAG )* (this_EOL_1= RULE_EOL )?
            {
            // InternalCucumber.g:931:3: (this_TAG_0= RULE_TAG )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_TAG) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCucumber.g:932:4: this_TAG_0= RULE_TAG
            	    {
            	    this_TAG_0=(Token)match(input,RULE_TAG,FOLLOW_21); 

            	    				current.merge(this_TAG_0);
            	    			

            	    				newLeafNode(this_TAG_0, grammarAccess.getTagsAccess().getTAGTerminalRuleCall_0());
            	    			

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalCucumber.g:940:3: (this_EOL_1= RULE_EOL )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_EOL) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCucumber.g:941:4: this_EOL_1= RULE_EOL
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
    // InternalCucumber.g:953:1: entryRuleSentence returns [String current=null] : iv_ruleSentence= ruleSentence EOF ;
    public final String entryRuleSentence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSentence = null;


        try {
            // InternalCucumber.g:953:48: (iv_ruleSentence= ruleSentence EOF )
            // InternalCucumber.g:954:2: iv_ruleSentence= ruleSentence EOF
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
    // InternalCucumber.g:960:1: ruleSentence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_WORD_0= RULE_WORD )+ (this_EOL_1= RULE_EOL )? ) ;
    public final AntlrDatatypeRuleToken ruleSentence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;
        Token this_EOL_1=null;


        	enterRule();

        try {
            // InternalCucumber.g:966:2: ( ( (this_WORD_0= RULE_WORD )+ (this_EOL_1= RULE_EOL )? ) )
            // InternalCucumber.g:967:2: ( (this_WORD_0= RULE_WORD )+ (this_EOL_1= RULE_EOL )? )
            {
            // InternalCucumber.g:967:2: ( (this_WORD_0= RULE_WORD )+ (this_EOL_1= RULE_EOL )? )
            // InternalCucumber.g:968:3: (this_WORD_0= RULE_WORD )+ (this_EOL_1= RULE_EOL )?
            {
            // InternalCucumber.g:968:3: (this_WORD_0= RULE_WORD )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_WORD) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCucumber.g:969:4: this_WORD_0= RULE_WORD
            	    {
            	    this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_22); 

            	    				current.merge(this_WORD_0);
            	    			

            	    				newLeafNode(this_WORD_0, grammarAccess.getSentenceAccess().getWORDTerminalRuleCall_0());
            	    			

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

            // InternalCucumber.g:977:3: (this_EOL_1= RULE_EOL )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_EOL) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCucumber.g:978:4: this_EOL_1= RULE_EOL
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


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\5\uffff";
    static final String dfa_2s = "\2\4\1\13\2\uffff";
    static final String dfa_3s = "\3\14\2\uffff";
    static final String dfa_4s = "\3\uffff\1\1\1\2";
    static final String dfa_5s = "\5\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\1\5\uffff\1\3\1\4",
            "\1\2\1\1\5\uffff\1\3\1\4",
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
            return "149:5: (lv_scenarios_5_1= ruleScenario | lv_scenarios_5_2= ruleScenarioOutline )";
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

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_5;
            this.transition = dfa_11;
        }
        public String getDescription() {
            return "()+ loopback of 438:3: ( (lv_examples_5_0= ruleExample ) )+";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001C70L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001C32L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001832L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000FC040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000FC002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000FE070L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000FE072L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000300042L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000052L});

}
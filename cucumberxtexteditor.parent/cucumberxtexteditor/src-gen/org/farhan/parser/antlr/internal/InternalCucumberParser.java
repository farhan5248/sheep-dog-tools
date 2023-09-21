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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_ID", "RULE_WS", "RULE_WORD", "RULE_COMMENT", "'Feature:'", "'Background:'", "'Scenario:'", "'Given'", "'When'", "'Then'", "'And'", "'But'", "'*'", "'@'"
    };
    public static final int T__9=9;
    public static final int RULE_ID=5;
    public static final int RULE_EOL=4;
    public static final int RULE_WS=6;
    public static final int RULE_WORD=7;
    public static final int RULE_COMMENT=8;
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
    // InternalCucumber.g:71:1: ruleFeature returns [EObject current=null] : ( ( (lv_tags_0_0= ruleTag ) )* this_EOL_1= RULE_EOL otherlv_2= 'Feature:' ( (lv_title_3_0= ruleSentence ) ) ( (lv_description_4_0= ruleDescription ) ) ( (lv_background_5_0= ruleBackground ) )? ( (lv_scenarios_6_0= ruleScenario ) )* ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token this_EOL_1=null;
        Token otherlv_2=null;
        EObject lv_tags_0_0 = null;

        AntlrDatatypeRuleToken lv_title_3_0 = null;

        EObject lv_description_4_0 = null;

        EObject lv_background_5_0 = null;

        EObject lv_scenarios_6_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:77:2: ( ( ( (lv_tags_0_0= ruleTag ) )* this_EOL_1= RULE_EOL otherlv_2= 'Feature:' ( (lv_title_3_0= ruleSentence ) ) ( (lv_description_4_0= ruleDescription ) ) ( (lv_background_5_0= ruleBackground ) )? ( (lv_scenarios_6_0= ruleScenario ) )* ) )
            // InternalCucumber.g:78:2: ( ( (lv_tags_0_0= ruleTag ) )* this_EOL_1= RULE_EOL otherlv_2= 'Feature:' ( (lv_title_3_0= ruleSentence ) ) ( (lv_description_4_0= ruleDescription ) ) ( (lv_background_5_0= ruleBackground ) )? ( (lv_scenarios_6_0= ruleScenario ) )* )
            {
            // InternalCucumber.g:78:2: ( ( (lv_tags_0_0= ruleTag ) )* this_EOL_1= RULE_EOL otherlv_2= 'Feature:' ( (lv_title_3_0= ruleSentence ) ) ( (lv_description_4_0= ruleDescription ) ) ( (lv_background_5_0= ruleBackground ) )? ( (lv_scenarios_6_0= ruleScenario ) )* )
            // InternalCucumber.g:79:3: ( (lv_tags_0_0= ruleTag ) )* this_EOL_1= RULE_EOL otherlv_2= 'Feature:' ( (lv_title_3_0= ruleSentence ) ) ( (lv_description_4_0= ruleDescription ) ) ( (lv_background_5_0= ruleBackground ) )? ( (lv_scenarios_6_0= ruleScenario ) )*
            {
            // InternalCucumber.g:79:3: ( (lv_tags_0_0= ruleTag ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCucumber.g:80:4: (lv_tags_0_0= ruleTag )
            	    {
            	    // InternalCucumber.g:80:4: (lv_tags_0_0= ruleTag )
            	    // InternalCucumber.g:81:5: lv_tags_0_0= ruleTag
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureAccess().getTagsTagParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_tags_0_0=ruleTag();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tags",
            	    						lv_tags_0_0,
            	    						"org.farhan.Cucumber.Tag");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_4); 

            			newLeafNode(this_EOL_1, grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,9,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getFeatureKeyword_2());
            		
            // InternalCucumber.g:106:3: ( (lv_title_3_0= ruleSentence ) )
            // InternalCucumber.g:107:4: (lv_title_3_0= ruleSentence )
            {
            // InternalCucumber.g:107:4: (lv_title_3_0= ruleSentence )
            // InternalCucumber.g:108:5: lv_title_3_0= ruleSentence
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getTitleSentenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_title_3_0=ruleSentence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureRule());
            					}
            					set(
            						current,
            						"title",
            						lv_title_3_0,
            						"org.farhan.Cucumber.Sentence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCucumber.g:125:3: ( (lv_description_4_0= ruleDescription ) )
            // InternalCucumber.g:126:4: (lv_description_4_0= ruleDescription )
            {
            // InternalCucumber.g:126:4: (lv_description_4_0= ruleDescription )
            // InternalCucumber.g:127:5: lv_description_4_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getDescriptionDescriptionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
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

            // InternalCucumber.g:144:3: ( (lv_background_5_0= ruleBackground ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==10) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCucumber.g:145:4: (lv_background_5_0= ruleBackground )
                    {
                    // InternalCucumber.g:145:4: (lv_background_5_0= ruleBackground )
                    // InternalCucumber.g:146:5: lv_background_5_0= ruleBackground
                    {

                    					newCompositeNode(grammarAccess.getFeatureAccess().getBackgroundBackgroundParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_8);
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

            // InternalCucumber.g:163:3: ( (lv_scenarios_6_0= ruleScenario ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_EOL||LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCucumber.g:164:4: (lv_scenarios_6_0= ruleScenario )
            	    {
            	    // InternalCucumber.g:164:4: (lv_scenarios_6_0= ruleScenario )
            	    // InternalCucumber.g:165:5: lv_scenarios_6_0= ruleScenario
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_scenarios_6_0=ruleScenario();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"scenarios",
            	    						lv_scenarios_6_0,
            	    						"org.farhan.Cucumber.Scenario");
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
    // InternalCucumber.g:186:1: entryRuleBackground returns [EObject current=null] : iv_ruleBackground= ruleBackground EOF ;
    public final EObject entryRuleBackground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackground = null;


        try {
            // InternalCucumber.g:186:51: (iv_ruleBackground= ruleBackground EOF )
            // InternalCucumber.g:187:2: iv_ruleBackground= ruleBackground EOF
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
    // InternalCucumber.g:193:1: ruleBackground returns [EObject current=null] : (otherlv_0= 'Background:' ( (lv_title_1_0= ruleSentence ) ) ( (lv_description_2_0= ruleDescription ) ) ( (lv_steps_3_0= ruleStep ) )* ) ;
    public final EObject ruleBackground() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_title_1_0 = null;

        EObject lv_description_2_0 = null;

        EObject lv_steps_3_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:199:2: ( (otherlv_0= 'Background:' ( (lv_title_1_0= ruleSentence ) ) ( (lv_description_2_0= ruleDescription ) ) ( (lv_steps_3_0= ruleStep ) )* ) )
            // InternalCucumber.g:200:2: (otherlv_0= 'Background:' ( (lv_title_1_0= ruleSentence ) ) ( (lv_description_2_0= ruleDescription ) ) ( (lv_steps_3_0= ruleStep ) )* )
            {
            // InternalCucumber.g:200:2: (otherlv_0= 'Background:' ( (lv_title_1_0= ruleSentence ) ) ( (lv_description_2_0= ruleDescription ) ) ( (lv_steps_3_0= ruleStep ) )* )
            // InternalCucumber.g:201:3: otherlv_0= 'Background:' ( (lv_title_1_0= ruleSentence ) ) ( (lv_description_2_0= ruleDescription ) ) ( (lv_steps_3_0= ruleStep ) )*
            {
            otherlv_0=(Token)match(input,10,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBackgroundAccess().getBackgroundKeyword_0());
            		
            // InternalCucumber.g:205:3: ( (lv_title_1_0= ruleSentence ) )
            // InternalCucumber.g:206:4: (lv_title_1_0= ruleSentence )
            {
            // InternalCucumber.g:206:4: (lv_title_1_0= ruleSentence )
            // InternalCucumber.g:207:5: lv_title_1_0= ruleSentence
            {

            					newCompositeNode(grammarAccess.getBackgroundAccess().getTitleSentenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalCucumber.g:224:3: ( (lv_description_2_0= ruleDescription ) )
            // InternalCucumber.g:225:4: (lv_description_2_0= ruleDescription )
            {
            // InternalCucumber.g:225:4: (lv_description_2_0= ruleDescription )
            // InternalCucumber.g:226:5: lv_description_2_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getBackgroundAccess().getDescriptionDescriptionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalCucumber.g:243:3: ( (lv_steps_3_0= ruleStep ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=12 && LA4_0<=17)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCucumber.g:244:4: (lv_steps_3_0= ruleStep )
            	    {
            	    // InternalCucumber.g:244:4: (lv_steps_3_0= ruleStep )
            	    // InternalCucumber.g:245:5: lv_steps_3_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
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
    // InternalCucumber.g:266:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalCucumber.g:266:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalCucumber.g:267:2: iv_ruleScenario= ruleScenario EOF
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
    // InternalCucumber.g:273:1: ruleScenario returns [EObject current=null] : ( ( (lv_tags_0_0= ruleTag ) )* this_EOL_1= RULE_EOL otherlv_2= 'Scenario:' ( (lv_title_3_0= ruleSentence ) ) ( (lv_description_4_0= ruleDescription ) ) ( (lv_steps_5_0= ruleStep ) )* ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token this_EOL_1=null;
        Token otherlv_2=null;
        EObject lv_tags_0_0 = null;

        AntlrDatatypeRuleToken lv_title_3_0 = null;

        EObject lv_description_4_0 = null;

        EObject lv_steps_5_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:279:2: ( ( ( (lv_tags_0_0= ruleTag ) )* this_EOL_1= RULE_EOL otherlv_2= 'Scenario:' ( (lv_title_3_0= ruleSentence ) ) ( (lv_description_4_0= ruleDescription ) ) ( (lv_steps_5_0= ruleStep ) )* ) )
            // InternalCucumber.g:280:2: ( ( (lv_tags_0_0= ruleTag ) )* this_EOL_1= RULE_EOL otherlv_2= 'Scenario:' ( (lv_title_3_0= ruleSentence ) ) ( (lv_description_4_0= ruleDescription ) ) ( (lv_steps_5_0= ruleStep ) )* )
            {
            // InternalCucumber.g:280:2: ( ( (lv_tags_0_0= ruleTag ) )* this_EOL_1= RULE_EOL otherlv_2= 'Scenario:' ( (lv_title_3_0= ruleSentence ) ) ( (lv_description_4_0= ruleDescription ) ) ( (lv_steps_5_0= ruleStep ) )* )
            // InternalCucumber.g:281:3: ( (lv_tags_0_0= ruleTag ) )* this_EOL_1= RULE_EOL otherlv_2= 'Scenario:' ( (lv_title_3_0= ruleSentence ) ) ( (lv_description_4_0= ruleDescription ) ) ( (lv_steps_5_0= ruleStep ) )*
            {
            // InternalCucumber.g:281:3: ( (lv_tags_0_0= ruleTag ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCucumber.g:282:4: (lv_tags_0_0= ruleTag )
            	    {
            	    // InternalCucumber.g:282:4: (lv_tags_0_0= ruleTag )
            	    // InternalCucumber.g:283:5: lv_tags_0_0= ruleTag
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getTagsTagParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_tags_0_0=ruleTag();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tags",
            	    						lv_tags_0_0,
            	    						"org.farhan.Cucumber.Tag");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_11); 

            			newLeafNode(this_EOL_1, grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getScenarioKeyword_2());
            		
            // InternalCucumber.g:308:3: ( (lv_title_3_0= ruleSentence ) )
            // InternalCucumber.g:309:4: (lv_title_3_0= ruleSentence )
            {
            // InternalCucumber.g:309:4: (lv_title_3_0= ruleSentence )
            // InternalCucumber.g:310:5: lv_title_3_0= ruleSentence
            {

            					newCompositeNode(grammarAccess.getScenarioAccess().getTitleSentenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_title_3_0=ruleSentence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioRule());
            					}
            					set(
            						current,
            						"title",
            						lv_title_3_0,
            						"org.farhan.Cucumber.Sentence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCucumber.g:327:3: ( (lv_description_4_0= ruleDescription ) )
            // InternalCucumber.g:328:4: (lv_description_4_0= ruleDescription )
            {
            // InternalCucumber.g:328:4: (lv_description_4_0= ruleDescription )
            // InternalCucumber.g:329:5: lv_description_4_0= ruleDescription
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

            // InternalCucumber.g:346:3: ( (lv_steps_5_0= ruleStep ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=12 && LA6_0<=17)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCucumber.g:347:4: (lv_steps_5_0= ruleStep )
            	    {
            	    // InternalCucumber.g:347:4: (lv_steps_5_0= ruleStep )
            	    // InternalCucumber.g:348:5: lv_steps_5_0= ruleStep
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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleStep"
    // InternalCucumber.g:369:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalCucumber.g:369:45: (iv_ruleStep= ruleStep EOF )
            // InternalCucumber.g:370:2: iv_ruleStep= ruleStep EOF
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
    // InternalCucumber.g:376:1: ruleStep returns [EObject current=null] : ( ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) ) ( (lv_title_1_0= ruleSentence ) ) ) ;
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
            // InternalCucumber.g:382:2: ( ( ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) ) ( (lv_title_1_0= ruleSentence ) ) ) )
            // InternalCucumber.g:383:2: ( ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) ) ( (lv_title_1_0= ruleSentence ) ) )
            {
            // InternalCucumber.g:383:2: ( ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) ) ( (lv_title_1_0= ruleSentence ) ) )
            // InternalCucumber.g:384:3: ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) ) ( (lv_title_1_0= ruleSentence ) )
            {
            // InternalCucumber.g:384:3: ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) )
            // InternalCucumber.g:385:4: ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) )
            {
            // InternalCucumber.g:385:4: ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) )
            // InternalCucumber.g:386:5: (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' )
            {
            // InternalCucumber.g:386:5: (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt7=1;
                }
                break;
            case 13:
                {
                alt7=2;
                }
                break;
            case 14:
                {
                alt7=3;
                }
                break;
            case 15:
                {
                alt7=4;
                }
                break;
            case 16:
                {
                alt7=5;
                }
                break;
            case 17:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalCucumber.g:387:6: lv_keyword_0_1= 'Given'
                    {
                    lv_keyword_0_1=(Token)match(input,12,FOLLOW_5); 

                    						newLeafNode(lv_keyword_0_1, grammarAccess.getStepAccess().getKeywordGivenKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStepRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalCucumber.g:398:6: lv_keyword_0_2= 'When'
                    {
                    lv_keyword_0_2=(Token)match(input,13,FOLLOW_5); 

                    						newLeafNode(lv_keyword_0_2, grammarAccess.getStepAccess().getKeywordWhenKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStepRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalCucumber.g:409:6: lv_keyword_0_3= 'Then'
                    {
                    lv_keyword_0_3=(Token)match(input,14,FOLLOW_5); 

                    						newLeafNode(lv_keyword_0_3, grammarAccess.getStepAccess().getKeywordThenKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStepRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalCucumber.g:420:6: lv_keyword_0_4= 'And'
                    {
                    lv_keyword_0_4=(Token)match(input,15,FOLLOW_5); 

                    						newLeafNode(lv_keyword_0_4, grammarAccess.getStepAccess().getKeywordAndKeyword_0_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStepRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_0_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalCucumber.g:431:6: lv_keyword_0_5= 'But'
                    {
                    lv_keyword_0_5=(Token)match(input,16,FOLLOW_5); 

                    						newLeafNode(lv_keyword_0_5, grammarAccess.getStepAccess().getKeywordButKeyword_0_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStepRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_0_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalCucumber.g:442:6: lv_keyword_0_6= '*'
                    {
                    lv_keyword_0_6=(Token)match(input,17,FOLLOW_5); 

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

            // InternalCucumber.g:455:3: ( (lv_title_1_0= ruleSentence ) )
            // InternalCucumber.g:456:4: (lv_title_1_0= ruleSentence )
            {
            // InternalCucumber.g:456:4: (lv_title_1_0= ruleSentence )
            // InternalCucumber.g:457:5: lv_title_1_0= ruleSentence
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
    // InternalCucumber.g:478:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalCucumber.g:478:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalCucumber.g:479:2: iv_ruleDescription= ruleDescription EOF
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
    // InternalCucumber.g:485:1: ruleDescription returns [EObject current=null] : ( () ( (lv_sentences_1_0= ruleSentence ) )* ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_sentences_1_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:491:2: ( ( () ( (lv_sentences_1_0= ruleSentence ) )* ) )
            // InternalCucumber.g:492:2: ( () ( (lv_sentences_1_0= ruleSentence ) )* )
            {
            // InternalCucumber.g:492:2: ( () ( (lv_sentences_1_0= ruleSentence ) )* )
            // InternalCucumber.g:493:3: () ( (lv_sentences_1_0= ruleSentence ) )*
            {
            // InternalCucumber.g:493:3: ()
            // InternalCucumber.g:494:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDescriptionAccess().getDescriptionAction_0(),
            					current);
            			

            }

            // InternalCucumber.g:500:3: ( (lv_sentences_1_0= ruleSentence ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_WORD) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCucumber.g:501:4: (lv_sentences_1_0= ruleSentence )
            	    {
            	    // InternalCucumber.g:501:4: (lv_sentences_1_0= ruleSentence )
            	    // InternalCucumber.g:502:5: lv_sentences_1_0= ruleSentence
            	    {

            	    					newCompositeNode(grammarAccess.getDescriptionAccess().getSentencesSentenceParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_12);
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
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleTag"
    // InternalCucumber.g:523:1: entryRuleTag returns [EObject current=null] : iv_ruleTag= ruleTag EOF ;
    public final EObject entryRuleTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTag = null;


        try {
            // InternalCucumber.g:523:44: (iv_ruleTag= ruleTag EOF )
            // InternalCucumber.g:524:2: iv_ruleTag= ruleTag EOF
            {
             newCompositeNode(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTag=ruleTag();

            state._fsp--;

             current =iv_ruleTag; 
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
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // InternalCucumber.g:530:1: ruleTag returns [EObject current=null] : ( ( (lv_title_0_0= '@' ) ) this_ID_1= RULE_ID (this_WS_2= RULE_WS )? ) ;
    public final EObject ruleTag() throws RecognitionException {
        EObject current = null;

        Token lv_title_0_0=null;
        Token this_ID_1=null;
        Token this_WS_2=null;


        	enterRule();

        try {
            // InternalCucumber.g:536:2: ( ( ( (lv_title_0_0= '@' ) ) this_ID_1= RULE_ID (this_WS_2= RULE_WS )? ) )
            // InternalCucumber.g:537:2: ( ( (lv_title_0_0= '@' ) ) this_ID_1= RULE_ID (this_WS_2= RULE_WS )? )
            {
            // InternalCucumber.g:537:2: ( ( (lv_title_0_0= '@' ) ) this_ID_1= RULE_ID (this_WS_2= RULE_WS )? )
            // InternalCucumber.g:538:3: ( (lv_title_0_0= '@' ) ) this_ID_1= RULE_ID (this_WS_2= RULE_WS )?
            {
            // InternalCucumber.g:538:3: ( (lv_title_0_0= '@' ) )
            // InternalCucumber.g:539:4: (lv_title_0_0= '@' )
            {
            // InternalCucumber.g:539:4: (lv_title_0_0= '@' )
            // InternalCucumber.g:540:5: lv_title_0_0= '@'
            {
            lv_title_0_0=(Token)match(input,18,FOLLOW_13); 

            					newLeafNode(lv_title_0_0, grammarAccess.getTagAccess().getTitleCommercialAtKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTagRule());
            					}
            					setWithLastConsumed(current, "title", lv_title_0_0, "@");
            				

            }


            }

            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_14); 

            			newLeafNode(this_ID_1, grammarAccess.getTagAccess().getIDTerminalRuleCall_1());
            		
            // InternalCucumber.g:556:3: (this_WS_2= RULE_WS )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_WS) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCucumber.g:557:4: this_WS_2= RULE_WS
                    {
                    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_2); 

                    				newLeafNode(this_WS_2, grammarAccess.getTagAccess().getWSTerminalRuleCall_2());
                    			

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
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleSentence"
    // InternalCucumber.g:566:1: entryRuleSentence returns [String current=null] : iv_ruleSentence= ruleSentence EOF ;
    public final String entryRuleSentence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSentence = null;


        try {
            // InternalCucumber.g:566:48: (iv_ruleSentence= ruleSentence EOF )
            // InternalCucumber.g:567:2: iv_ruleSentence= ruleSentence EOF
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
    // InternalCucumber.g:573:1: ruleSentence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_WORD_0= RULE_WORD )+ this_EOL_1= RULE_EOL ) ;
    public final AntlrDatatypeRuleToken ruleSentence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;
        Token this_EOL_1=null;


        	enterRule();

        try {
            // InternalCucumber.g:579:2: ( ( (this_WORD_0= RULE_WORD )+ this_EOL_1= RULE_EOL ) )
            // InternalCucumber.g:580:2: ( (this_WORD_0= RULE_WORD )+ this_EOL_1= RULE_EOL )
            {
            // InternalCucumber.g:580:2: ( (this_WORD_0= RULE_WORD )+ this_EOL_1= RULE_EOL )
            // InternalCucumber.g:581:3: (this_WORD_0= RULE_WORD )+ this_EOL_1= RULE_EOL
            {
            // InternalCucumber.g:581:3: (this_WORD_0= RULE_WORD )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_WORD) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCucumber.g:582:4: this_WORD_0= RULE_WORD
            	    {
            	    this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_15); 

            	    				current.merge(this_WORD_0);
            	    			

            	    				newLeafNode(this_WORD_0, grammarAccess.getSentenceAccess().getWORDTerminalRuleCall_0());
            	    			

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

            this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_2); 

            			current.merge(this_EOL_1);
            		

            			newLeafNode(this_EOL_1, grammarAccess.getSentenceAccess().getEOLTerminalRuleCall_1());
            		

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040490L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040412L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000003F080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000003F002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000090L});

}
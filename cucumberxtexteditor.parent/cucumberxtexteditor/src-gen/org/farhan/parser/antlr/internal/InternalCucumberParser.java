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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_ID", "RULE_WS", "RULE_WORD", "'Feature:'", "'Scenario:'", "'Given'", "'When'", "'Then'", "'And'", "'But'", "'*'", "'@'"
    };
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int RULE_ID=5;
    public static final int RULE_EOL=4;
    public static final int RULE_WS=6;
    public static final int RULE_WORD=7;
    public static final int T__15=15;
    public static final int T__16=16;
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
    // InternalCucumber.g:71:1: ruleFeature returns [EObject current=null] : ( ( (lv_tags_0_0= ruleTag ) )* this_EOL_1= RULE_EOL otherlv_2= 'Feature:' ( (lv_title_3_0= ruleSentence ) ) ( (lv_description_4_0= ruleDescription ) ) ( (lv_scenarios_5_0= ruleScenario ) )* ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token this_EOL_1=null;
        Token otherlv_2=null;
        EObject lv_tags_0_0 = null;

        AntlrDatatypeRuleToken lv_title_3_0 = null;

        EObject lv_description_4_0 = null;

        EObject lv_scenarios_5_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:77:2: ( ( ( (lv_tags_0_0= ruleTag ) )* this_EOL_1= RULE_EOL otherlv_2= 'Feature:' ( (lv_title_3_0= ruleSentence ) ) ( (lv_description_4_0= ruleDescription ) ) ( (lv_scenarios_5_0= ruleScenario ) )* ) )
            // InternalCucumber.g:78:2: ( ( (lv_tags_0_0= ruleTag ) )* this_EOL_1= RULE_EOL otherlv_2= 'Feature:' ( (lv_title_3_0= ruleSentence ) ) ( (lv_description_4_0= ruleDescription ) ) ( (lv_scenarios_5_0= ruleScenario ) )* )
            {
            // InternalCucumber.g:78:2: ( ( (lv_tags_0_0= ruleTag ) )* this_EOL_1= RULE_EOL otherlv_2= 'Feature:' ( (lv_title_3_0= ruleSentence ) ) ( (lv_description_4_0= ruleDescription ) ) ( (lv_scenarios_5_0= ruleScenario ) )* )
            // InternalCucumber.g:79:3: ( (lv_tags_0_0= ruleTag ) )* this_EOL_1= RULE_EOL otherlv_2= 'Feature:' ( (lv_title_3_0= ruleSentence ) ) ( (lv_description_4_0= ruleDescription ) ) ( (lv_scenarios_5_0= ruleScenario ) )*
            {
            // InternalCucumber.g:79:3: ( (lv_tags_0_0= ruleTag ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
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
            		
            otherlv_2=(Token)match(input,8,FOLLOW_5); 

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

            // InternalCucumber.g:144:3: ( (lv_scenarios_5_0= ruleScenario ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_EOL||LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCucumber.g:145:4: (lv_scenarios_5_0= ruleScenario )
            	    {
            	    // InternalCucumber.g:145:4: (lv_scenarios_5_0= ruleScenario )
            	    // InternalCucumber.g:146:5: lv_scenarios_5_0= ruleScenario
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


    // $ANTLR start "entryRuleScenario"
    // InternalCucumber.g:167:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalCucumber.g:167:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalCucumber.g:168:2: iv_ruleScenario= ruleScenario EOF
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
    // InternalCucumber.g:174:1: ruleScenario returns [EObject current=null] : ( ( (lv_tags_0_0= ruleTag ) )* this_EOL_1= RULE_EOL otherlv_2= 'Scenario:' ( (lv_title_3_0= ruleSentence ) ) ( (lv_description_4_0= ruleDescription ) ) ( (lv_steps_5_0= ruleStep ) )* ) ;
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
            // InternalCucumber.g:180:2: ( ( ( (lv_tags_0_0= ruleTag ) )* this_EOL_1= RULE_EOL otherlv_2= 'Scenario:' ( (lv_title_3_0= ruleSentence ) ) ( (lv_description_4_0= ruleDescription ) ) ( (lv_steps_5_0= ruleStep ) )* ) )
            // InternalCucumber.g:181:2: ( ( (lv_tags_0_0= ruleTag ) )* this_EOL_1= RULE_EOL otherlv_2= 'Scenario:' ( (lv_title_3_0= ruleSentence ) ) ( (lv_description_4_0= ruleDescription ) ) ( (lv_steps_5_0= ruleStep ) )* )
            {
            // InternalCucumber.g:181:2: ( ( (lv_tags_0_0= ruleTag ) )* this_EOL_1= RULE_EOL otherlv_2= 'Scenario:' ( (lv_title_3_0= ruleSentence ) ) ( (lv_description_4_0= ruleDescription ) ) ( (lv_steps_5_0= ruleStep ) )* )
            // InternalCucumber.g:182:3: ( (lv_tags_0_0= ruleTag ) )* this_EOL_1= RULE_EOL otherlv_2= 'Scenario:' ( (lv_title_3_0= ruleSentence ) ) ( (lv_description_4_0= ruleDescription ) ) ( (lv_steps_5_0= ruleStep ) )*
            {
            // InternalCucumber.g:182:3: ( (lv_tags_0_0= ruleTag ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCucumber.g:183:4: (lv_tags_0_0= ruleTag )
            	    {
            	    // InternalCucumber.g:183:4: (lv_tags_0_0= ruleTag )
            	    // InternalCucumber.g:184:5: lv_tags_0_0= ruleTag
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
            	    break loop3;
                }
            } while (true);

            this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_8); 

            			newLeafNode(this_EOL_1, grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,9,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getScenarioKeyword_2());
            		
            // InternalCucumber.g:209:3: ( (lv_title_3_0= ruleSentence ) )
            // InternalCucumber.g:210:4: (lv_title_3_0= ruleSentence )
            {
            // InternalCucumber.g:210:4: (lv_title_3_0= ruleSentence )
            // InternalCucumber.g:211:5: lv_title_3_0= ruleSentence
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

            // InternalCucumber.g:228:3: ( (lv_description_4_0= ruleDescription ) )
            // InternalCucumber.g:229:4: (lv_description_4_0= ruleDescription )
            {
            // InternalCucumber.g:229:4: (lv_description_4_0= ruleDescription )
            // InternalCucumber.g:230:5: lv_description_4_0= ruleDescription
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

            // InternalCucumber.g:247:3: ( (lv_steps_5_0= ruleStep ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=10 && LA4_0<=15)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCucumber.g:248:4: (lv_steps_5_0= ruleStep )
            	    {
            	    // InternalCucumber.g:248:4: (lv_steps_5_0= ruleStep )
            	    // InternalCucumber.g:249:5: lv_steps_5_0= ruleStep
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
    // InternalCucumber.g:270:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalCucumber.g:270:45: (iv_ruleStep= ruleStep EOF )
            // InternalCucumber.g:271:2: iv_ruleStep= ruleStep EOF
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
    // InternalCucumber.g:277:1: ruleStep returns [EObject current=null] : ( ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) ) ( (lv_title_1_0= ruleSentence ) ) ) ;
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
            // InternalCucumber.g:283:2: ( ( ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) ) ( (lv_title_1_0= ruleSentence ) ) ) )
            // InternalCucumber.g:284:2: ( ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) ) ( (lv_title_1_0= ruleSentence ) ) )
            {
            // InternalCucumber.g:284:2: ( ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) ) ( (lv_title_1_0= ruleSentence ) ) )
            // InternalCucumber.g:285:3: ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) ) ( (lv_title_1_0= ruleSentence ) )
            {
            // InternalCucumber.g:285:3: ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) )
            // InternalCucumber.g:286:4: ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) )
            {
            // InternalCucumber.g:286:4: ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) )
            // InternalCucumber.g:287:5: (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' )
            {
            // InternalCucumber.g:287:5: (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 10:
                {
                alt5=1;
                }
                break;
            case 11:
                {
                alt5=2;
                }
                break;
            case 12:
                {
                alt5=3;
                }
                break;
            case 13:
                {
                alt5=4;
                }
                break;
            case 14:
                {
                alt5=5;
                }
                break;
            case 15:
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
                    // InternalCucumber.g:288:6: lv_keyword_0_1= 'Given'
                    {
                    lv_keyword_0_1=(Token)match(input,10,FOLLOW_5); 

                    						newLeafNode(lv_keyword_0_1, grammarAccess.getStepAccess().getKeywordGivenKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStepRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalCucumber.g:299:6: lv_keyword_0_2= 'When'
                    {
                    lv_keyword_0_2=(Token)match(input,11,FOLLOW_5); 

                    						newLeafNode(lv_keyword_0_2, grammarAccess.getStepAccess().getKeywordWhenKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStepRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalCucumber.g:310:6: lv_keyword_0_3= 'Then'
                    {
                    lv_keyword_0_3=(Token)match(input,12,FOLLOW_5); 

                    						newLeafNode(lv_keyword_0_3, grammarAccess.getStepAccess().getKeywordThenKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStepRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalCucumber.g:321:6: lv_keyword_0_4= 'And'
                    {
                    lv_keyword_0_4=(Token)match(input,13,FOLLOW_5); 

                    						newLeafNode(lv_keyword_0_4, grammarAccess.getStepAccess().getKeywordAndKeyword_0_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStepRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_0_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalCucumber.g:332:6: lv_keyword_0_5= 'But'
                    {
                    lv_keyword_0_5=(Token)match(input,14,FOLLOW_5); 

                    						newLeafNode(lv_keyword_0_5, grammarAccess.getStepAccess().getKeywordButKeyword_0_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStepRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_0_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalCucumber.g:343:6: lv_keyword_0_6= '*'
                    {
                    lv_keyword_0_6=(Token)match(input,15,FOLLOW_5); 

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

            // InternalCucumber.g:356:3: ( (lv_title_1_0= ruleSentence ) )
            // InternalCucumber.g:357:4: (lv_title_1_0= ruleSentence )
            {
            // InternalCucumber.g:357:4: (lv_title_1_0= ruleSentence )
            // InternalCucumber.g:358:5: lv_title_1_0= ruleSentence
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
    // InternalCucumber.g:379:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalCucumber.g:379:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalCucumber.g:380:2: iv_ruleDescription= ruleDescription EOF
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
    // InternalCucumber.g:386:1: ruleDescription returns [EObject current=null] : ( () ( (lv_sentences_1_0= ruleSentence ) )* ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_sentences_1_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:392:2: ( ( () ( (lv_sentences_1_0= ruleSentence ) )* ) )
            // InternalCucumber.g:393:2: ( () ( (lv_sentences_1_0= ruleSentence ) )* )
            {
            // InternalCucumber.g:393:2: ( () ( (lv_sentences_1_0= ruleSentence ) )* )
            // InternalCucumber.g:394:3: () ( (lv_sentences_1_0= ruleSentence ) )*
            {
            // InternalCucumber.g:394:3: ()
            // InternalCucumber.g:395:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDescriptionAccess().getDescriptionAction_0(),
            					current);
            			

            }

            // InternalCucumber.g:401:3: ( (lv_sentences_1_0= ruleSentence ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_WORD) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCucumber.g:402:4: (lv_sentences_1_0= ruleSentence )
            	    {
            	    // InternalCucumber.g:402:4: (lv_sentences_1_0= ruleSentence )
            	    // InternalCucumber.g:403:5: lv_sentences_1_0= ruleSentence
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


    // $ANTLR start "entryRuleTag"
    // InternalCucumber.g:424:1: entryRuleTag returns [EObject current=null] : iv_ruleTag= ruleTag EOF ;
    public final EObject entryRuleTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTag = null;


        try {
            // InternalCucumber.g:424:44: (iv_ruleTag= ruleTag EOF )
            // InternalCucumber.g:425:2: iv_ruleTag= ruleTag EOF
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
    // InternalCucumber.g:431:1: ruleTag returns [EObject current=null] : ( ( (lv_title_0_0= '@' ) ) this_ID_1= RULE_ID (this_WS_2= RULE_WS )? ) ;
    public final EObject ruleTag() throws RecognitionException {
        EObject current = null;

        Token lv_title_0_0=null;
        Token this_ID_1=null;
        Token this_WS_2=null;


        	enterRule();

        try {
            // InternalCucumber.g:437:2: ( ( ( (lv_title_0_0= '@' ) ) this_ID_1= RULE_ID (this_WS_2= RULE_WS )? ) )
            // InternalCucumber.g:438:2: ( ( (lv_title_0_0= '@' ) ) this_ID_1= RULE_ID (this_WS_2= RULE_WS )? )
            {
            // InternalCucumber.g:438:2: ( ( (lv_title_0_0= '@' ) ) this_ID_1= RULE_ID (this_WS_2= RULE_WS )? )
            // InternalCucumber.g:439:3: ( (lv_title_0_0= '@' ) ) this_ID_1= RULE_ID (this_WS_2= RULE_WS )?
            {
            // InternalCucumber.g:439:3: ( (lv_title_0_0= '@' ) )
            // InternalCucumber.g:440:4: (lv_title_0_0= '@' )
            {
            // InternalCucumber.g:440:4: (lv_title_0_0= '@' )
            // InternalCucumber.g:441:5: lv_title_0_0= '@'
            {
            lv_title_0_0=(Token)match(input,16,FOLLOW_12); 

            					newLeafNode(lv_title_0_0, grammarAccess.getTagAccess().getTitleCommercialAtKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTagRule());
            					}
            					setWithLastConsumed(current, "title", lv_title_0_0, "@");
            				

            }


            }

            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_13); 

            			newLeafNode(this_ID_1, grammarAccess.getTagAccess().getIDTerminalRuleCall_1());
            		
            // InternalCucumber.g:457:3: (this_WS_2= RULE_WS )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_WS) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCucumber.g:458:4: this_WS_2= RULE_WS
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
    // InternalCucumber.g:467:1: entryRuleSentence returns [String current=null] : iv_ruleSentence= ruleSentence EOF ;
    public final String entryRuleSentence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSentence = null;


        try {
            // InternalCucumber.g:467:48: (iv_ruleSentence= ruleSentence EOF )
            // InternalCucumber.g:468:2: iv_ruleSentence= ruleSentence EOF
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
    // InternalCucumber.g:474:1: ruleSentence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_WORD_0= RULE_WORD )+ this_EOL_1= RULE_EOL ) ;
    public final AntlrDatatypeRuleToken ruleSentence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;
        Token this_EOL_1=null;


        	enterRule();

        try {
            // InternalCucumber.g:480:2: ( ( (this_WORD_0= RULE_WORD )+ this_EOL_1= RULE_EOL ) )
            // InternalCucumber.g:481:2: ( (this_WORD_0= RULE_WORD )+ this_EOL_1= RULE_EOL )
            {
            // InternalCucumber.g:481:2: ( (this_WORD_0= RULE_WORD )+ this_EOL_1= RULE_EOL )
            // InternalCucumber.g:482:3: (this_WORD_0= RULE_WORD )+ this_EOL_1= RULE_EOL
            {
            // InternalCucumber.g:482:3: (this_WORD_0= RULE_WORD )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_WORD) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCucumber.g:483:4: this_WORD_0= RULE_WORD
            	    {
            	    this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_14); 

            	    				current.merge(this_WORD_0);
            	    			

            	    				newLeafNode(this_WORD_0, grammarAccess.getSentenceAccess().getWORDTerminalRuleCall_0());
            	    			

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010090L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000FC80L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000FC02L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000090L});

}
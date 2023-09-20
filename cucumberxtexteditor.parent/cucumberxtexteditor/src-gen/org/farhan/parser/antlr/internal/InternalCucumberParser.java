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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WORD", "'Feature:'", "'Scenario:'", "'Given'", "'When'", "'Then'", "'And'", "'But'", "'*'"
    };
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int T__7=7;
    public static final int T__6=6;
    public static final int T__5=5;
    public static final int RULE_WORD=4;
    public static final int T__11=11;
    public static final int T__12=12;
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
    // InternalCucumber.g:71:1: ruleFeature returns [EObject current=null] : (otherlv_0= 'Feature:' ( (lv_title_1_0= ruleDescription ) ) ( (lv_scenarios_2_0= ruleScenario ) )* ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_title_1_0 = null;

        EObject lv_scenarios_2_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:77:2: ( (otherlv_0= 'Feature:' ( (lv_title_1_0= ruleDescription ) ) ( (lv_scenarios_2_0= ruleScenario ) )* ) )
            // InternalCucumber.g:78:2: (otherlv_0= 'Feature:' ( (lv_title_1_0= ruleDescription ) ) ( (lv_scenarios_2_0= ruleScenario ) )* )
            {
            // InternalCucumber.g:78:2: (otherlv_0= 'Feature:' ( (lv_title_1_0= ruleDescription ) ) ( (lv_scenarios_2_0= ruleScenario ) )* )
            // InternalCucumber.g:79:3: otherlv_0= 'Feature:' ( (lv_title_1_0= ruleDescription ) ) ( (lv_scenarios_2_0= ruleScenario ) )*
            {
            otherlv_0=(Token)match(input,5,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureAccess().getFeatureKeyword_0());
            		
            // InternalCucumber.g:83:3: ( (lv_title_1_0= ruleDescription ) )
            // InternalCucumber.g:84:4: (lv_title_1_0= ruleDescription )
            {
            // InternalCucumber.g:84:4: (lv_title_1_0= ruleDescription )
            // InternalCucumber.g:85:5: lv_title_1_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getTitleDescriptionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_title_1_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureRule());
            					}
            					set(
            						current,
            						"title",
            						lv_title_1_0,
            						"org.farhan.Cucumber.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCucumber.g:102:3: ( (lv_scenarios_2_0= ruleScenario ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==6) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCucumber.g:103:4: (lv_scenarios_2_0= ruleScenario )
            	    {
            	    // InternalCucumber.g:103:4: (lv_scenarios_2_0= ruleScenario )
            	    // InternalCucumber.g:104:5: lv_scenarios_2_0= ruleScenario
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_scenarios_2_0=ruleScenario();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"scenarios",
            	    						lv_scenarios_2_0,
            	    						"org.farhan.Cucumber.Scenario");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // InternalCucumber.g:125:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalCucumber.g:125:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalCucumber.g:126:2: iv_ruleScenario= ruleScenario EOF
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
    // InternalCucumber.g:132:1: ruleScenario returns [EObject current=null] : (otherlv_0= 'Scenario:' ( (lv_title_1_0= ruleDescription ) ) ( (lv_steps_2_0= ruleStep ) )* ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_title_1_0 = null;

        EObject lv_steps_2_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:138:2: ( (otherlv_0= 'Scenario:' ( (lv_title_1_0= ruleDescription ) ) ( (lv_steps_2_0= ruleStep ) )* ) )
            // InternalCucumber.g:139:2: (otherlv_0= 'Scenario:' ( (lv_title_1_0= ruleDescription ) ) ( (lv_steps_2_0= ruleStep ) )* )
            {
            // InternalCucumber.g:139:2: (otherlv_0= 'Scenario:' ( (lv_title_1_0= ruleDescription ) ) ( (lv_steps_2_0= ruleStep ) )* )
            // InternalCucumber.g:140:3: otherlv_0= 'Scenario:' ( (lv_title_1_0= ruleDescription ) ) ( (lv_steps_2_0= ruleStep ) )*
            {
            otherlv_0=(Token)match(input,6,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getScenarioKeyword_0());
            		
            // InternalCucumber.g:144:3: ( (lv_title_1_0= ruleDescription ) )
            // InternalCucumber.g:145:4: (lv_title_1_0= ruleDescription )
            {
            // InternalCucumber.g:145:4: (lv_title_1_0= ruleDescription )
            // InternalCucumber.g:146:5: lv_title_1_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getScenarioAccess().getTitleDescriptionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_title_1_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioRule());
            					}
            					set(
            						current,
            						"title",
            						lv_title_1_0,
            						"org.farhan.Cucumber.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCucumber.g:163:3: ( (lv_steps_2_0= ruleStep ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=7 && LA2_0<=12)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCucumber.g:164:4: (lv_steps_2_0= ruleStep )
            	    {
            	    // InternalCucumber.g:164:4: (lv_steps_2_0= ruleStep )
            	    // InternalCucumber.g:165:5: lv_steps_2_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_steps_2_0=ruleStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"steps",
            	    						lv_steps_2_0,
            	    						"org.farhan.Cucumber.Step");
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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleStep"
    // InternalCucumber.g:186:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalCucumber.g:186:45: (iv_ruleStep= ruleStep EOF )
            // InternalCucumber.g:187:2: iv_ruleStep= ruleStep EOF
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
    // InternalCucumber.g:193:1: ruleStep returns [EObject current=null] : ( ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) ) ( (lv_description_1_0= ruleDescription ) ) ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_1=null;
        Token lv_keyword_0_2=null;
        Token lv_keyword_0_3=null;
        Token lv_keyword_0_4=null;
        Token lv_keyword_0_5=null;
        Token lv_keyword_0_6=null;
        AntlrDatatypeRuleToken lv_description_1_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:199:2: ( ( ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) ) ( (lv_description_1_0= ruleDescription ) ) ) )
            // InternalCucumber.g:200:2: ( ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) ) ( (lv_description_1_0= ruleDescription ) ) )
            {
            // InternalCucumber.g:200:2: ( ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) ) ( (lv_description_1_0= ruleDescription ) ) )
            // InternalCucumber.g:201:3: ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) ) ( (lv_description_1_0= ruleDescription ) )
            {
            // InternalCucumber.g:201:3: ( ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) ) )
            // InternalCucumber.g:202:4: ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) )
            {
            // InternalCucumber.g:202:4: ( (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' ) )
            // InternalCucumber.g:203:5: (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' )
            {
            // InternalCucumber.g:203:5: (lv_keyword_0_1= 'Given' | lv_keyword_0_2= 'When' | lv_keyword_0_3= 'Then' | lv_keyword_0_4= 'And' | lv_keyword_0_5= 'But' | lv_keyword_0_6= '*' )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 7:
                {
                alt3=1;
                }
                break;
            case 8:
                {
                alt3=2;
                }
                break;
            case 9:
                {
                alt3=3;
                }
                break;
            case 10:
                {
                alt3=4;
                }
                break;
            case 11:
                {
                alt3=5;
                }
                break;
            case 12:
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
                    // InternalCucumber.g:204:6: lv_keyword_0_1= 'Given'
                    {
                    lv_keyword_0_1=(Token)match(input,7,FOLLOW_3); 

                    						newLeafNode(lv_keyword_0_1, grammarAccess.getStepAccess().getKeywordGivenKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStepRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalCucumber.g:215:6: lv_keyword_0_2= 'When'
                    {
                    lv_keyword_0_2=(Token)match(input,8,FOLLOW_3); 

                    						newLeafNode(lv_keyword_0_2, grammarAccess.getStepAccess().getKeywordWhenKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStepRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalCucumber.g:226:6: lv_keyword_0_3= 'Then'
                    {
                    lv_keyword_0_3=(Token)match(input,9,FOLLOW_3); 

                    						newLeafNode(lv_keyword_0_3, grammarAccess.getStepAccess().getKeywordThenKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStepRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalCucumber.g:237:6: lv_keyword_0_4= 'And'
                    {
                    lv_keyword_0_4=(Token)match(input,10,FOLLOW_3); 

                    						newLeafNode(lv_keyword_0_4, grammarAccess.getStepAccess().getKeywordAndKeyword_0_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStepRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_0_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalCucumber.g:248:6: lv_keyword_0_5= 'But'
                    {
                    lv_keyword_0_5=(Token)match(input,11,FOLLOW_3); 

                    						newLeafNode(lv_keyword_0_5, grammarAccess.getStepAccess().getKeywordButKeyword_0_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStepRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_0_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalCucumber.g:259:6: lv_keyword_0_6= '*'
                    {
                    lv_keyword_0_6=(Token)match(input,12,FOLLOW_3); 

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

            // InternalCucumber.g:272:3: ( (lv_description_1_0= ruleDescription ) )
            // InternalCucumber.g:273:4: (lv_description_1_0= ruleDescription )
            {
            // InternalCucumber.g:273:4: (lv_description_1_0= ruleDescription )
            // InternalCucumber.g:274:5: lv_description_1_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getStepAccess().getDescriptionDescriptionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_description_1_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStepRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_1_0,
            						"org.farhan.Cucumber.Description");
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
    // InternalCucumber.g:295:1: entryRuleDescription returns [String current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final String entryRuleDescription() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDescription = null;


        try {
            // InternalCucumber.g:295:51: (iv_ruleDescription= ruleDescription EOF )
            // InternalCucumber.g:296:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription.getText(); 
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
    // InternalCucumber.g:302:1: ruleDescription returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WORD_0= RULE_WORD (this_WORD_1= RULE_WORD )* ) ;
    public final AntlrDatatypeRuleToken ruleDescription() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;
        Token this_WORD_1=null;


        	enterRule();

        try {
            // InternalCucumber.g:308:2: ( (this_WORD_0= RULE_WORD (this_WORD_1= RULE_WORD )* ) )
            // InternalCucumber.g:309:2: (this_WORD_0= RULE_WORD (this_WORD_1= RULE_WORD )* )
            {
            // InternalCucumber.g:309:2: (this_WORD_0= RULE_WORD (this_WORD_1= RULE_WORD )* )
            // InternalCucumber.g:310:3: this_WORD_0= RULE_WORD (this_WORD_1= RULE_WORD )*
            {
            this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_6); 

            			current.merge(this_WORD_0);
            		

            			newLeafNode(this_WORD_0, grammarAccess.getDescriptionAccess().getWORDTerminalRuleCall_0());
            		
            // InternalCucumber.g:317:3: (this_WORD_1= RULE_WORD )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_WORD) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCucumber.g:318:4: this_WORD_1= RULE_WORD
            	    {
            	    this_WORD_1=(Token)match(input,RULE_WORD,FOLLOW_6); 

            	    				current.merge(this_WORD_1);
            	    			

            	    				newLeafNode(this_WORD_1, grammarAccess.getDescriptionAccess().getWORDTerminalRuleCall_1());
            	    			

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
    // $ANTLR end "ruleDescription"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001F82L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});

}
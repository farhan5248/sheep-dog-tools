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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_TAG_ID", "RULE_WORD", "RULE_WS", "RULE_SL_COMMENT", "'Feature:'", "'Background:'", "'Scenario:'", "'Scenario Outline:'", "'Examples:'", "'Given'", "'When'", "'Then'", "'And'", "'But'", "'*'", "'|'", "'\"\"\"'"
    };
    public static final int RULE_TAG_ID=5;
    public static final int RULE_WORD=6;
    public static final int RULE_SL_COMMENT=8;
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
    // InternalCucumber.g:71:1: ruleFeature returns [EObject current=null] : ( ( ( (lv_tag_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Feature:' ( (lv_title_3_0= ruleSentence ) ) this_EOL_4= RULE_EOL ( (lv_descriptions_5_0= ruleDescription ) )* ( (lv_background_6_0= ruleBackground ) )? ( (lv_scenarios_7_0= ruleAbstractScenario ) )* ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token this_EOL_1=null;
        Token otherlv_2=null;
        Token this_EOL_4=null;
        EObject lv_tag_0_0 = null;

        AntlrDatatypeRuleToken lv_title_3_0 = null;

        EObject lv_descriptions_5_0 = null;

        EObject lv_background_6_0 = null;

        EObject lv_scenarios_7_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:77:2: ( ( ( ( (lv_tag_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Feature:' ( (lv_title_3_0= ruleSentence ) ) this_EOL_4= RULE_EOL ( (lv_descriptions_5_0= ruleDescription ) )* ( (lv_background_6_0= ruleBackground ) )? ( (lv_scenarios_7_0= ruleAbstractScenario ) )* ) )
            // InternalCucumber.g:78:2: ( ( ( (lv_tag_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Feature:' ( (lv_title_3_0= ruleSentence ) ) this_EOL_4= RULE_EOL ( (lv_descriptions_5_0= ruleDescription ) )* ( (lv_background_6_0= ruleBackground ) )? ( (lv_scenarios_7_0= ruleAbstractScenario ) )* )
            {
            // InternalCucumber.g:78:2: ( ( ( (lv_tag_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Feature:' ( (lv_title_3_0= ruleSentence ) ) this_EOL_4= RULE_EOL ( (lv_descriptions_5_0= ruleDescription ) )* ( (lv_background_6_0= ruleBackground ) )? ( (lv_scenarios_7_0= ruleAbstractScenario ) )* )
            // InternalCucumber.g:79:3: ( ( (lv_tag_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Feature:' ( (lv_title_3_0= ruleSentence ) ) this_EOL_4= RULE_EOL ( (lv_descriptions_5_0= ruleDescription ) )* ( (lv_background_6_0= ruleBackground ) )? ( (lv_scenarios_7_0= ruleAbstractScenario ) )*
            {
            // InternalCucumber.g:79:3: ( ( (lv_tag_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_TAG_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCucumber.g:80:4: ( (lv_tag_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL
                    {
                    // InternalCucumber.g:80:4: ( (lv_tag_0_0= ruleTag ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_TAG_ID) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalCucumber.g:81:5: (lv_tag_0_0= ruleTag )
                    	    {
                    	    // InternalCucumber.g:81:5: (lv_tag_0_0= ruleTag )
                    	    // InternalCucumber.g:82:6: lv_tag_0_0= ruleTag
                    	    {

                    	    						newCompositeNode(grammarAccess.getFeatureAccess().getTagTagParserRuleCall_0_0_0());
                    	    					
                    	    pushFollow(FOLLOW_3);
                    	    lv_tag_0_0=ruleTag();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getFeatureRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"tag",
                    	    							lv_tag_0_0,
                    	    							"org.farhan.Cucumber.Tag");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);

                    this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_4); 

                    				newLeafNode(this_EOL_1, grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,9,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getFeatureKeyword_1());
            		
            // InternalCucumber.g:108:3: ( (lv_title_3_0= ruleSentence ) )
            // InternalCucumber.g:109:4: (lv_title_3_0= ruleSentence )
            {
            // InternalCucumber.g:109:4: (lv_title_3_0= ruleSentence )
            // InternalCucumber.g:110:5: lv_title_3_0= ruleSentence
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getTitleSentenceParserRuleCall_2_0());
            				
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

            this_EOL_4=(Token)match(input,RULE_EOL,FOLLOW_7); 

            			newLeafNode(this_EOL_4, grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_3());
            		
            // InternalCucumber.g:131:3: ( (lv_descriptions_5_0= ruleDescription ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_WORD) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCucumber.g:132:4: (lv_descriptions_5_0= ruleDescription )
            	    {
            	    // InternalCucumber.g:132:4: (lv_descriptions_5_0= ruleDescription )
            	    // InternalCucumber.g:133:5: lv_descriptions_5_0= ruleDescription
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureAccess().getDescriptionsDescriptionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_descriptions_5_0=ruleDescription();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"descriptions",
            	    						lv_descriptions_5_0,
            	    						"org.farhan.Cucumber.Description");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalCucumber.g:150:3: ( (lv_background_6_0= ruleBackground ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==10) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCucumber.g:151:4: (lv_background_6_0= ruleBackground )
                    {
                    // InternalCucumber.g:151:4: (lv_background_6_0= ruleBackground )
                    // InternalCucumber.g:152:5: lv_background_6_0= ruleBackground
                    {

                    					newCompositeNode(grammarAccess.getFeatureAccess().getBackgroundBackgroundParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_background_6_0=ruleBackground();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFeatureRule());
                    					}
                    					set(
                    						current,
                    						"background",
                    						lv_background_6_0,
                    						"org.farhan.Cucumber.Background");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCucumber.g:169:3: ( (lv_scenarios_7_0= ruleAbstractScenario ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_TAG_ID||(LA5_0>=11 && LA5_0<=12)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCucumber.g:170:4: (lv_scenarios_7_0= ruleAbstractScenario )
            	    {
            	    // InternalCucumber.g:170:4: (lv_scenarios_7_0= ruleAbstractScenario )
            	    // InternalCucumber.g:171:5: lv_scenarios_7_0= ruleAbstractScenario
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureAccess().getScenariosAbstractScenarioParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_scenarios_7_0=ruleAbstractScenario();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"scenarios",
            	    						lv_scenarios_7_0,
            	    						"org.farhan.Cucumber.AbstractScenario");
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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleBackground"
    // InternalCucumber.g:192:1: entryRuleBackground returns [EObject current=null] : iv_ruleBackground= ruleBackground EOF ;
    public final EObject entryRuleBackground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackground = null;


        try {
            // InternalCucumber.g:192:51: (iv_ruleBackground= ruleBackground EOF )
            // InternalCucumber.g:193:2: iv_ruleBackground= ruleBackground EOF
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
    // InternalCucumber.g:199:1: ruleBackground returns [EObject current=null] : (otherlv_0= 'Background:' ( (lv_title_1_0= ruleSentence ) ) this_EOL_2= RULE_EOL ( (lv_description_3_0= ruleDescription ) ) ( (lv_steps_4_0= ruleStep ) )* ) ;
    public final EObject ruleBackground() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EOL_2=null;
        AntlrDatatypeRuleToken lv_title_1_0 = null;

        EObject lv_description_3_0 = null;

        EObject lv_steps_4_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:205:2: ( (otherlv_0= 'Background:' ( (lv_title_1_0= ruleSentence ) ) this_EOL_2= RULE_EOL ( (lv_description_3_0= ruleDescription ) ) ( (lv_steps_4_0= ruleStep ) )* ) )
            // InternalCucumber.g:206:2: (otherlv_0= 'Background:' ( (lv_title_1_0= ruleSentence ) ) this_EOL_2= RULE_EOL ( (lv_description_3_0= ruleDescription ) ) ( (lv_steps_4_0= ruleStep ) )* )
            {
            // InternalCucumber.g:206:2: (otherlv_0= 'Background:' ( (lv_title_1_0= ruleSentence ) ) this_EOL_2= RULE_EOL ( (lv_description_3_0= ruleDescription ) ) ( (lv_steps_4_0= ruleStep ) )* )
            // InternalCucumber.g:207:3: otherlv_0= 'Background:' ( (lv_title_1_0= ruleSentence ) ) this_EOL_2= RULE_EOL ( (lv_description_3_0= ruleDescription ) ) ( (lv_steps_4_0= ruleStep ) )*
            {
            otherlv_0=(Token)match(input,10,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBackgroundAccess().getBackgroundKeyword_0());
            		
            // InternalCucumber.g:211:3: ( (lv_title_1_0= ruleSentence ) )
            // InternalCucumber.g:212:4: (lv_title_1_0= ruleSentence )
            {
            // InternalCucumber.g:212:4: (lv_title_1_0= ruleSentence )
            // InternalCucumber.g:213:5: lv_title_1_0= ruleSentence
            {

            					newCompositeNode(grammarAccess.getBackgroundAccess().getTitleSentenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
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

            this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_5); 

            			newLeafNode(this_EOL_2, grammarAccess.getBackgroundAccess().getEOLTerminalRuleCall_2());
            		
            // InternalCucumber.g:234:3: ( (lv_description_3_0= ruleDescription ) )
            // InternalCucumber.g:235:4: (lv_description_3_0= ruleDescription )
            {
            // InternalCucumber.g:235:4: (lv_description_3_0= ruleDescription )
            // InternalCucumber.g:236:5: lv_description_3_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getBackgroundAccess().getDescriptionDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalCucumber.g:253:3: ( (lv_steps_4_0= ruleStep ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=14 && LA6_0<=19)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCucumber.g:254:4: (lv_steps_4_0= ruleStep )
            	    {
            	    // InternalCucumber.g:254:4: (lv_steps_4_0= ruleStep )
            	    // InternalCucumber.g:255:5: lv_steps_4_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
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
    // $ANTLR end "ruleBackground"


    // $ANTLR start "entryRuleAbstractScenario"
    // InternalCucumber.g:276:1: entryRuleAbstractScenario returns [EObject current=null] : iv_ruleAbstractScenario= ruleAbstractScenario EOF ;
    public final EObject entryRuleAbstractScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractScenario = null;


        try {
            // InternalCucumber.g:276:57: (iv_ruleAbstractScenario= ruleAbstractScenario EOF )
            // InternalCucumber.g:277:2: iv_ruleAbstractScenario= ruleAbstractScenario EOF
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
    // InternalCucumber.g:283:1: ruleAbstractScenario returns [EObject current=null] : (this_ScenarioOutline_0= ruleScenarioOutline | this_Scenario_1= ruleScenario ) ;
    public final EObject ruleAbstractScenario() throws RecognitionException {
        EObject current = null;

        EObject this_ScenarioOutline_0 = null;

        EObject this_Scenario_1 = null;



        	enterRule();

        try {
            // InternalCucumber.g:289:2: ( (this_ScenarioOutline_0= ruleScenarioOutline | this_Scenario_1= ruleScenario ) )
            // InternalCucumber.g:290:2: (this_ScenarioOutline_0= ruleScenarioOutline | this_Scenario_1= ruleScenario )
            {
            // InternalCucumber.g:290:2: (this_ScenarioOutline_0= ruleScenarioOutline | this_Scenario_1= ruleScenario )
            int alt7=2;
            switch ( input.LA(1) ) {
            case RULE_TAG_ID:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_EOL) ) {
                    int LA7_4 = input.LA(3);

                    if ( (LA7_4==12) ) {
                        alt7=1;
                    }
                    else if ( (LA7_4==11) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case 12:
                {
                alt7=1;
                }
                break;
            case 11:
                {
                alt7=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalCucumber.g:291:3: this_ScenarioOutline_0= ruleScenarioOutline
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
                    // InternalCucumber.g:300:3: this_Scenario_1= ruleScenario
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
    // InternalCucumber.g:312:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalCucumber.g:312:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalCucumber.g:313:2: iv_ruleScenario= ruleScenario EOF
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
    // InternalCucumber.g:319:1: ruleScenario returns [EObject current=null] : ( ( ( (lv_tag_0_0= ruleTag ) ) this_EOL_1= RULE_EOL )? otherlv_2= 'Scenario:' ( (lv_title_3_0= ruleSentence ) ) this_EOL_4= RULE_EOL ( (lv_description_5_0= ruleDescription ) ) ( (lv_steps_6_0= ruleStep ) )* ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token this_EOL_1=null;
        Token otherlv_2=null;
        Token this_EOL_4=null;
        EObject lv_tag_0_0 = null;

        AntlrDatatypeRuleToken lv_title_3_0 = null;

        EObject lv_description_5_0 = null;

        EObject lv_steps_6_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:325:2: ( ( ( ( (lv_tag_0_0= ruleTag ) ) this_EOL_1= RULE_EOL )? otherlv_2= 'Scenario:' ( (lv_title_3_0= ruleSentence ) ) this_EOL_4= RULE_EOL ( (lv_description_5_0= ruleDescription ) ) ( (lv_steps_6_0= ruleStep ) )* ) )
            // InternalCucumber.g:326:2: ( ( ( (lv_tag_0_0= ruleTag ) ) this_EOL_1= RULE_EOL )? otherlv_2= 'Scenario:' ( (lv_title_3_0= ruleSentence ) ) this_EOL_4= RULE_EOL ( (lv_description_5_0= ruleDescription ) ) ( (lv_steps_6_0= ruleStep ) )* )
            {
            // InternalCucumber.g:326:2: ( ( ( (lv_tag_0_0= ruleTag ) ) this_EOL_1= RULE_EOL )? otherlv_2= 'Scenario:' ( (lv_title_3_0= ruleSentence ) ) this_EOL_4= RULE_EOL ( (lv_description_5_0= ruleDescription ) ) ( (lv_steps_6_0= ruleStep ) )* )
            // InternalCucumber.g:327:3: ( ( (lv_tag_0_0= ruleTag ) ) this_EOL_1= RULE_EOL )? otherlv_2= 'Scenario:' ( (lv_title_3_0= ruleSentence ) ) this_EOL_4= RULE_EOL ( (lv_description_5_0= ruleDescription ) ) ( (lv_steps_6_0= ruleStep ) )*
            {
            // InternalCucumber.g:327:3: ( ( (lv_tag_0_0= ruleTag ) ) this_EOL_1= RULE_EOL )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_TAG_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCucumber.g:328:4: ( (lv_tag_0_0= ruleTag ) ) this_EOL_1= RULE_EOL
                    {
                    // InternalCucumber.g:328:4: ( (lv_tag_0_0= ruleTag ) )
                    // InternalCucumber.g:329:5: (lv_tag_0_0= ruleTag )
                    {
                    // InternalCucumber.g:329:5: (lv_tag_0_0= ruleTag )
                    // InternalCucumber.g:330:6: lv_tag_0_0= ruleTag
                    {

                    						newCompositeNode(grammarAccess.getScenarioAccess().getTagTagParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_tag_0_0=ruleTag();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenarioRule());
                    						}
                    						add(
                    							current,
                    							"tag",
                    							lv_tag_0_0,
                    							"org.farhan.Cucumber.Tag");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_10); 

                    				newLeafNode(this_EOL_1, grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getScenarioKeyword_1());
            		
            // InternalCucumber.g:356:3: ( (lv_title_3_0= ruleSentence ) )
            // InternalCucumber.g:357:4: (lv_title_3_0= ruleSentence )
            {
            // InternalCucumber.g:357:4: (lv_title_3_0= ruleSentence )
            // InternalCucumber.g:358:5: lv_title_3_0= ruleSentence
            {

            					newCompositeNode(grammarAccess.getScenarioAccess().getTitleSentenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
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

            this_EOL_4=(Token)match(input,RULE_EOL,FOLLOW_5); 

            			newLeafNode(this_EOL_4, grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_3());
            		
            // InternalCucumber.g:379:3: ( (lv_description_5_0= ruleDescription ) )
            // InternalCucumber.g:380:4: (lv_description_5_0= ruleDescription )
            {
            // InternalCucumber.g:380:4: (lv_description_5_0= ruleDescription )
            // InternalCucumber.g:381:5: lv_description_5_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getScenarioAccess().getDescriptionDescriptionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_description_5_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_5_0,
            						"org.farhan.Cucumber.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCucumber.g:398:3: ( (lv_steps_6_0= ruleStep ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=14 && LA9_0<=19)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCucumber.g:399:4: (lv_steps_6_0= ruleStep )
            	    {
            	    // InternalCucumber.g:399:4: (lv_steps_6_0= ruleStep )
            	    // InternalCucumber.g:400:5: lv_steps_6_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_steps_6_0=ruleStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"steps",
            	    						lv_steps_6_0,
            	    						"org.farhan.Cucumber.Step");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalCucumber.g:421:1: entryRuleScenarioOutline returns [EObject current=null] : iv_ruleScenarioOutline= ruleScenarioOutline EOF ;
    public final EObject entryRuleScenarioOutline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenarioOutline = null;


        try {
            // InternalCucumber.g:421:56: (iv_ruleScenarioOutline= ruleScenarioOutline EOF )
            // InternalCucumber.g:422:2: iv_ruleScenarioOutline= ruleScenarioOutline EOF
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
    // InternalCucumber.g:428:1: ruleScenarioOutline returns [EObject current=null] : ( ( ( (lv_tag_0_0= ruleTag ) ) this_EOL_1= RULE_EOL )? otherlv_2= 'Scenario Outline:' ( (lv_title_3_0= ruleSentence ) ) this_EOL_4= RULE_EOL ( (lv_description_5_0= ruleDescription ) ) ( (lv_steps_6_0= ruleStep ) )* ( (lv_examples_7_0= ruleExample ) )+ ) ;
    public final EObject ruleScenarioOutline() throws RecognitionException {
        EObject current = null;

        Token this_EOL_1=null;
        Token otherlv_2=null;
        Token this_EOL_4=null;
        EObject lv_tag_0_0 = null;

        AntlrDatatypeRuleToken lv_title_3_0 = null;

        EObject lv_description_5_0 = null;

        EObject lv_steps_6_0 = null;

        EObject lv_examples_7_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:434:2: ( ( ( ( (lv_tag_0_0= ruleTag ) ) this_EOL_1= RULE_EOL )? otherlv_2= 'Scenario Outline:' ( (lv_title_3_0= ruleSentence ) ) this_EOL_4= RULE_EOL ( (lv_description_5_0= ruleDescription ) ) ( (lv_steps_6_0= ruleStep ) )* ( (lv_examples_7_0= ruleExample ) )+ ) )
            // InternalCucumber.g:435:2: ( ( ( (lv_tag_0_0= ruleTag ) ) this_EOL_1= RULE_EOL )? otherlv_2= 'Scenario Outline:' ( (lv_title_3_0= ruleSentence ) ) this_EOL_4= RULE_EOL ( (lv_description_5_0= ruleDescription ) ) ( (lv_steps_6_0= ruleStep ) )* ( (lv_examples_7_0= ruleExample ) )+ )
            {
            // InternalCucumber.g:435:2: ( ( ( (lv_tag_0_0= ruleTag ) ) this_EOL_1= RULE_EOL )? otherlv_2= 'Scenario Outline:' ( (lv_title_3_0= ruleSentence ) ) this_EOL_4= RULE_EOL ( (lv_description_5_0= ruleDescription ) ) ( (lv_steps_6_0= ruleStep ) )* ( (lv_examples_7_0= ruleExample ) )+ )
            // InternalCucumber.g:436:3: ( ( (lv_tag_0_0= ruleTag ) ) this_EOL_1= RULE_EOL )? otherlv_2= 'Scenario Outline:' ( (lv_title_3_0= ruleSentence ) ) this_EOL_4= RULE_EOL ( (lv_description_5_0= ruleDescription ) ) ( (lv_steps_6_0= ruleStep ) )* ( (lv_examples_7_0= ruleExample ) )+
            {
            // InternalCucumber.g:436:3: ( ( (lv_tag_0_0= ruleTag ) ) this_EOL_1= RULE_EOL )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_TAG_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCucumber.g:437:4: ( (lv_tag_0_0= ruleTag ) ) this_EOL_1= RULE_EOL
                    {
                    // InternalCucumber.g:437:4: ( (lv_tag_0_0= ruleTag ) )
                    // InternalCucumber.g:438:5: (lv_tag_0_0= ruleTag )
                    {
                    // InternalCucumber.g:438:5: (lv_tag_0_0= ruleTag )
                    // InternalCucumber.g:439:6: lv_tag_0_0= ruleTag
                    {

                    						newCompositeNode(grammarAccess.getScenarioOutlineAccess().getTagTagParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_tag_0_0=ruleTag();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
                    						}
                    						add(
                    							current,
                    							"tag",
                    							lv_tag_0_0,
                    							"org.farhan.Cucumber.Tag");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_11); 

                    				newLeafNode(this_EOL_1, grammarAccess.getScenarioOutlineAccess().getEOLTerminalRuleCall_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getScenarioOutlineAccess().getScenarioOutlineKeyword_1());
            		
            // InternalCucumber.g:465:3: ( (lv_title_3_0= ruleSentence ) )
            // InternalCucumber.g:466:4: (lv_title_3_0= ruleSentence )
            {
            // InternalCucumber.g:466:4: (lv_title_3_0= ruleSentence )
            // InternalCucumber.g:467:5: lv_title_3_0= ruleSentence
            {

            					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getTitleSentenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_title_3_0=ruleSentence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
            					}
            					set(
            						current,
            						"title",
            						lv_title_3_0,
            						"org.farhan.Cucumber.Sentence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_4=(Token)match(input,RULE_EOL,FOLLOW_5); 

            			newLeafNode(this_EOL_4, grammarAccess.getScenarioOutlineAccess().getEOLTerminalRuleCall_3());
            		
            // InternalCucumber.g:488:3: ( (lv_description_5_0= ruleDescription ) )
            // InternalCucumber.g:489:4: (lv_description_5_0= ruleDescription )
            {
            // InternalCucumber.g:489:4: (lv_description_5_0= ruleDescription )
            // InternalCucumber.g:490:5: lv_description_5_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getDescriptionDescriptionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_description_5_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_5_0,
            						"org.farhan.Cucumber.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCucumber.g:507:3: ( (lv_steps_6_0= ruleStep ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=14 && LA11_0<=19)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCucumber.g:508:4: (lv_steps_6_0= ruleStep )
            	    {
            	    // InternalCucumber.g:508:4: (lv_steps_6_0= ruleStep )
            	    // InternalCucumber.g:509:5: lv_steps_6_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getStepsStepParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_steps_6_0=ruleStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"steps",
            	    						lv_steps_6_0,
            	    						"org.farhan.Cucumber.Step");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalCucumber.g:526:3: ( (lv_examples_7_0= ruleExample ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_TAG_ID) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==RULE_EOL) ) {
                        int LA12_4 = input.LA(3);

                        if ( (LA12_4==13) ) {
                            alt12=1;
                        }


                    }


                }
                else if ( (LA12_0==13) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCucumber.g:527:4: (lv_examples_7_0= ruleExample )
            	    {
            	    // InternalCucumber.g:527:4: (lv_examples_7_0= ruleExample )
            	    // InternalCucumber.g:528:5: lv_examples_7_0= ruleExample
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getExamplesExampleParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_examples_7_0=ruleExample();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"examples",
            	    						lv_examples_7_0,
            	    						"org.farhan.Cucumber.Example");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // InternalCucumber.g:549:1: entryRuleExample returns [EObject current=null] : iv_ruleExample= ruleExample EOF ;
    public final EObject entryRuleExample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExample = null;


        try {
            // InternalCucumber.g:549:48: (iv_ruleExample= ruleExample EOF )
            // InternalCucumber.g:550:2: iv_ruleExample= ruleExample EOF
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
    // InternalCucumber.g:556:1: ruleExample returns [EObject current=null] : ( ( ( (lv_tag_0_0= ruleTag ) ) this_EOL_1= RULE_EOL )? otherlv_2= 'Examples:' ( (lv_title_3_0= ruleSentence ) ) this_EOL_4= RULE_EOL ( (lv_description_5_0= ruleDescription ) ) ( (lv_table_6_0= ruleTable ) ) ) ;
    public final EObject ruleExample() throws RecognitionException {
        EObject current = null;

        Token this_EOL_1=null;
        Token otherlv_2=null;
        Token this_EOL_4=null;
        EObject lv_tag_0_0 = null;

        AntlrDatatypeRuleToken lv_title_3_0 = null;

        EObject lv_description_5_0 = null;

        EObject lv_table_6_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:562:2: ( ( ( ( (lv_tag_0_0= ruleTag ) ) this_EOL_1= RULE_EOL )? otherlv_2= 'Examples:' ( (lv_title_3_0= ruleSentence ) ) this_EOL_4= RULE_EOL ( (lv_description_5_0= ruleDescription ) ) ( (lv_table_6_0= ruleTable ) ) ) )
            // InternalCucumber.g:563:2: ( ( ( (lv_tag_0_0= ruleTag ) ) this_EOL_1= RULE_EOL )? otherlv_2= 'Examples:' ( (lv_title_3_0= ruleSentence ) ) this_EOL_4= RULE_EOL ( (lv_description_5_0= ruleDescription ) ) ( (lv_table_6_0= ruleTable ) ) )
            {
            // InternalCucumber.g:563:2: ( ( ( (lv_tag_0_0= ruleTag ) ) this_EOL_1= RULE_EOL )? otherlv_2= 'Examples:' ( (lv_title_3_0= ruleSentence ) ) this_EOL_4= RULE_EOL ( (lv_description_5_0= ruleDescription ) ) ( (lv_table_6_0= ruleTable ) ) )
            // InternalCucumber.g:564:3: ( ( (lv_tag_0_0= ruleTag ) ) this_EOL_1= RULE_EOL )? otherlv_2= 'Examples:' ( (lv_title_3_0= ruleSentence ) ) this_EOL_4= RULE_EOL ( (lv_description_5_0= ruleDescription ) ) ( (lv_table_6_0= ruleTable ) )
            {
            // InternalCucumber.g:564:3: ( ( (lv_tag_0_0= ruleTag ) ) this_EOL_1= RULE_EOL )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_TAG_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCucumber.g:565:4: ( (lv_tag_0_0= ruleTag ) ) this_EOL_1= RULE_EOL
                    {
                    // InternalCucumber.g:565:4: ( (lv_tag_0_0= ruleTag ) )
                    // InternalCucumber.g:566:5: (lv_tag_0_0= ruleTag )
                    {
                    // InternalCucumber.g:566:5: (lv_tag_0_0= ruleTag )
                    // InternalCucumber.g:567:6: lv_tag_0_0= ruleTag
                    {

                    						newCompositeNode(grammarAccess.getExampleAccess().getTagTagParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_tag_0_0=ruleTag();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExampleRule());
                    						}
                    						add(
                    							current,
                    							"tag",
                    							lv_tag_0_0,
                    							"org.farhan.Cucumber.Tag");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_14); 

                    				newLeafNode(this_EOL_1, grammarAccess.getExampleAccess().getEOLTerminalRuleCall_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getExampleAccess().getExamplesKeyword_1());
            		
            // InternalCucumber.g:593:3: ( (lv_title_3_0= ruleSentence ) )
            // InternalCucumber.g:594:4: (lv_title_3_0= ruleSentence )
            {
            // InternalCucumber.g:594:4: (lv_title_3_0= ruleSentence )
            // InternalCucumber.g:595:5: lv_title_3_0= ruleSentence
            {

            					newCompositeNode(grammarAccess.getExampleAccess().getTitleSentenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_title_3_0=ruleSentence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExampleRule());
            					}
            					set(
            						current,
            						"title",
            						lv_title_3_0,
            						"org.farhan.Cucumber.Sentence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_4=(Token)match(input,RULE_EOL,FOLLOW_5); 

            			newLeafNode(this_EOL_4, grammarAccess.getExampleAccess().getEOLTerminalRuleCall_3());
            		
            // InternalCucumber.g:616:3: ( (lv_description_5_0= ruleDescription ) )
            // InternalCucumber.g:617:4: (lv_description_5_0= ruleDescription )
            {
            // InternalCucumber.g:617:4: (lv_description_5_0= ruleDescription )
            // InternalCucumber.g:618:5: lv_description_5_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getExampleAccess().getDescriptionDescriptionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_description_5_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExampleRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_5_0,
            						"org.farhan.Cucumber.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCucumber.g:635:3: ( (lv_table_6_0= ruleTable ) )
            // InternalCucumber.g:636:4: (lv_table_6_0= ruleTable )
            {
            // InternalCucumber.g:636:4: (lv_table_6_0= ruleTable )
            // InternalCucumber.g:637:5: lv_table_6_0= ruleTable
            {

            					newCompositeNode(grammarAccess.getExampleAccess().getTableTableParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_table_6_0=ruleTable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExampleRule());
            					}
            					set(
            						current,
            						"table",
            						lv_table_6_0,
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


    // $ANTLR start "entryRuleDescription"
    // InternalCucumber.g:658:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalCucumber.g:658:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalCucumber.g:659:2: iv_ruleDescription= ruleDescription EOF
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
    // InternalCucumber.g:665:1: ruleDescription returns [EObject current=null] : ( ( (lv_line_0_0= ruleSentence ) ) this_EOL_1= RULE_EOL ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token this_EOL_1=null;
        AntlrDatatypeRuleToken lv_line_0_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:671:2: ( ( ( (lv_line_0_0= ruleSentence ) ) this_EOL_1= RULE_EOL ) )
            // InternalCucumber.g:672:2: ( ( (lv_line_0_0= ruleSentence ) ) this_EOL_1= RULE_EOL )
            {
            // InternalCucumber.g:672:2: ( ( (lv_line_0_0= ruleSentence ) ) this_EOL_1= RULE_EOL )
            // InternalCucumber.g:673:3: ( (lv_line_0_0= ruleSentence ) ) this_EOL_1= RULE_EOL
            {
            // InternalCucumber.g:673:3: ( (lv_line_0_0= ruleSentence ) )
            // InternalCucumber.g:674:4: (lv_line_0_0= ruleSentence )
            {
            // InternalCucumber.g:674:4: (lv_line_0_0= ruleSentence )
            // InternalCucumber.g:675:5: lv_line_0_0= ruleSentence
            {

            					newCompositeNode(grammarAccess.getDescriptionAccess().getLineSentenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_line_0_0=ruleSentence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDescriptionRule());
            					}
            					set(
            						current,
            						"line",
            						lv_line_0_0,
            						"org.farhan.Cucumber.Sentence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_2); 

            			newLeafNode(this_EOL_1, grammarAccess.getDescriptionAccess().getEOLTerminalRuleCall_1());
            		

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


    // $ANTLR start "entryRuleStep"
    // InternalCucumber.g:700:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalCucumber.g:700:45: (iv_ruleStep= ruleStep EOF )
            // InternalCucumber.g:701:2: iv_ruleStep= ruleStep EOF
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
    // InternalCucumber.g:707:1: ruleStep returns [EObject current=null] : ( (otherlv_0= 'Given' | otherlv_1= 'When' | otherlv_2= 'Then' | otherlv_3= 'And' | otherlv_4= 'But' | otherlv_5= '*' ) ( (lv_title_6_0= ruleSentence ) ) (this_EOL_7= RULE_EOL )? ( ( (lv_table_8_0= ruleTable ) ) | ( (lv_text_9_0= ruleDocString ) ) )? ) ;
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
            // InternalCucumber.g:713:2: ( ( (otherlv_0= 'Given' | otherlv_1= 'When' | otherlv_2= 'Then' | otherlv_3= 'And' | otherlv_4= 'But' | otherlv_5= '*' ) ( (lv_title_6_0= ruleSentence ) ) (this_EOL_7= RULE_EOL )? ( ( (lv_table_8_0= ruleTable ) ) | ( (lv_text_9_0= ruleDocString ) ) )? ) )
            // InternalCucumber.g:714:2: ( (otherlv_0= 'Given' | otherlv_1= 'When' | otherlv_2= 'Then' | otherlv_3= 'And' | otherlv_4= 'But' | otherlv_5= '*' ) ( (lv_title_6_0= ruleSentence ) ) (this_EOL_7= RULE_EOL )? ( ( (lv_table_8_0= ruleTable ) ) | ( (lv_text_9_0= ruleDocString ) ) )? )
            {
            // InternalCucumber.g:714:2: ( (otherlv_0= 'Given' | otherlv_1= 'When' | otherlv_2= 'Then' | otherlv_3= 'And' | otherlv_4= 'But' | otherlv_5= '*' ) ( (lv_title_6_0= ruleSentence ) ) (this_EOL_7= RULE_EOL )? ( ( (lv_table_8_0= ruleTable ) ) | ( (lv_text_9_0= ruleDocString ) ) )? )
            // InternalCucumber.g:715:3: (otherlv_0= 'Given' | otherlv_1= 'When' | otherlv_2= 'Then' | otherlv_3= 'And' | otherlv_4= 'But' | otherlv_5= '*' ) ( (lv_title_6_0= ruleSentence ) ) (this_EOL_7= RULE_EOL )? ( ( (lv_table_8_0= ruleTable ) ) | ( (lv_text_9_0= ruleDocString ) ) )?
            {
            // InternalCucumber.g:715:3: (otherlv_0= 'Given' | otherlv_1= 'When' | otherlv_2= 'Then' | otherlv_3= 'And' | otherlv_4= 'But' | otherlv_5= '*' )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt14=1;
                }
                break;
            case 15:
                {
                alt14=2;
                }
                break;
            case 16:
                {
                alt14=3;
                }
                break;
            case 17:
                {
                alt14=4;
                }
                break;
            case 18:
                {
                alt14=5;
                }
                break;
            case 19:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalCucumber.g:716:4: otherlv_0= 'Given'
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getStepAccess().getGivenKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCucumber.g:721:4: otherlv_1= 'When'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getStepAccess().getWhenKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalCucumber.g:726:4: otherlv_2= 'Then'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getStepAccess().getThenKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalCucumber.g:731:4: otherlv_3= 'And'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getStepAccess().getAndKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalCucumber.g:736:4: otherlv_4= 'But'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getStepAccess().getButKeyword_0_4());
                    			

                    }
                    break;
                case 6 :
                    // InternalCucumber.g:741:4: otherlv_5= '*'
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getStepAccess().getAsteriskKeyword_0_5());
                    			

                    }
                    break;

            }

            // InternalCucumber.g:746:3: ( (lv_title_6_0= ruleSentence ) )
            // InternalCucumber.g:747:4: (lv_title_6_0= ruleSentence )
            {
            // InternalCucumber.g:747:4: (lv_title_6_0= ruleSentence )
            // InternalCucumber.g:748:5: lv_title_6_0= ruleSentence
            {

            					newCompositeNode(grammarAccess.getStepAccess().getTitleSentenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
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

            // InternalCucumber.g:765:3: (this_EOL_7= RULE_EOL )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_EOL) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCucumber.g:766:4: this_EOL_7= RULE_EOL
                    {
                    this_EOL_7=(Token)match(input,RULE_EOL,FOLLOW_17); 

                    				newLeafNode(this_EOL_7, grammarAccess.getStepAccess().getEOLTerminalRuleCall_2());
                    			

                    }
                    break;

            }

            // InternalCucumber.g:771:3: ( ( (lv_table_8_0= ruleTable ) ) | ( (lv_text_9_0= ruleDocString ) ) )?
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            else if ( (LA16_0==21) ) {
                alt16=2;
            }
            switch (alt16) {
                case 1 :
                    // InternalCucumber.g:772:4: ( (lv_table_8_0= ruleTable ) )
                    {
                    // InternalCucumber.g:772:4: ( (lv_table_8_0= ruleTable ) )
                    // InternalCucumber.g:773:5: (lv_table_8_0= ruleTable )
                    {
                    // InternalCucumber.g:773:5: (lv_table_8_0= ruleTable )
                    // InternalCucumber.g:774:6: lv_table_8_0= ruleTable
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
                    // InternalCucumber.g:792:4: ( (lv_text_9_0= ruleDocString ) )
                    {
                    // InternalCucumber.g:792:4: ( (lv_text_9_0= ruleDocString ) )
                    // InternalCucumber.g:793:5: (lv_text_9_0= ruleDocString )
                    {
                    // InternalCucumber.g:793:5: (lv_text_9_0= ruleDocString )
                    // InternalCucumber.g:794:6: lv_text_9_0= ruleDocString
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
    // InternalCucumber.g:816:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalCucumber.g:816:46: (iv_ruleTable= ruleTable EOF )
            // InternalCucumber.g:817:2: iv_ruleTable= ruleTable EOF
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
    // InternalCucumber.g:823:1: ruleTable returns [EObject current=null] : ( (lv_rows_0_0= ruleTableRow ) )+ ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        EObject lv_rows_0_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:829:2: ( ( (lv_rows_0_0= ruleTableRow ) )+ )
            // InternalCucumber.g:830:2: ( (lv_rows_0_0= ruleTableRow ) )+
            {
            // InternalCucumber.g:830:2: ( (lv_rows_0_0= ruleTableRow ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==20) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCucumber.g:831:3: (lv_rows_0_0= ruleTableRow )
            	    {
            	    // InternalCucumber.g:831:3: (lv_rows_0_0= ruleTableRow )
            	    // InternalCucumber.g:832:4: lv_rows_0_0= ruleTableRow
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
    // InternalCucumber.g:852:1: entryRuleTableRow returns [EObject current=null] : iv_ruleTableRow= ruleTableRow EOF ;
    public final EObject entryRuleTableRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableRow = null;


        try {
            // InternalCucumber.g:852:49: (iv_ruleTableRow= ruleTableRow EOF )
            // InternalCucumber.g:853:2: iv_ruleTableRow= ruleTableRow EOF
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
    // InternalCucumber.g:859:1: ruleTableRow returns [EObject current=null] : ( ( (lv_cells_0_0= ruleRowCell ) )+ otherlv_1= '|' this_EOL_2= RULE_EOL ) ;
    public final EObject ruleTableRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_EOL_2=null;
        EObject lv_cells_0_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:865:2: ( ( ( (lv_cells_0_0= ruleRowCell ) )+ otherlv_1= '|' this_EOL_2= RULE_EOL ) )
            // InternalCucumber.g:866:2: ( ( (lv_cells_0_0= ruleRowCell ) )+ otherlv_1= '|' this_EOL_2= RULE_EOL )
            {
            // InternalCucumber.g:866:2: ( ( (lv_cells_0_0= ruleRowCell ) )+ otherlv_1= '|' this_EOL_2= RULE_EOL )
            // InternalCucumber.g:867:3: ( (lv_cells_0_0= ruleRowCell ) )+ otherlv_1= '|' this_EOL_2= RULE_EOL
            {
            // InternalCucumber.g:867:3: ( (lv_cells_0_0= ruleRowCell ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==20) ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1==RULE_WORD) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // InternalCucumber.g:868:4: (lv_cells_0_0= ruleRowCell )
            	    {
            	    // InternalCucumber.g:868:4: (lv_cells_0_0= ruleRowCell )
            	    // InternalCucumber.g:869:5: lv_cells_0_0= ruleRowCell
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            otherlv_1=(Token)match(input,20,FOLLOW_6); 

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
    // InternalCucumber.g:898:1: entryRuleRowCell returns [EObject current=null] : iv_ruleRowCell= ruleRowCell EOF ;
    public final EObject entryRuleRowCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowCell = null;


        try {
            // InternalCucumber.g:898:48: (iv_ruleRowCell= ruleRowCell EOF )
            // InternalCucumber.g:899:2: iv_ruleRowCell= ruleRowCell EOF
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
    // InternalCucumber.g:905:1: ruleRowCell returns [EObject current=null] : ( ( (lv_cell_0_0= '|' ) ) ruleSentence ) ;
    public final EObject ruleRowCell() throws RecognitionException {
        EObject current = null;

        Token lv_cell_0_0=null;


        	enterRule();

        try {
            // InternalCucumber.g:911:2: ( ( ( (lv_cell_0_0= '|' ) ) ruleSentence ) )
            // InternalCucumber.g:912:2: ( ( (lv_cell_0_0= '|' ) ) ruleSentence )
            {
            // InternalCucumber.g:912:2: ( ( (lv_cell_0_0= '|' ) ) ruleSentence )
            // InternalCucumber.g:913:3: ( (lv_cell_0_0= '|' ) ) ruleSentence
            {
            // InternalCucumber.g:913:3: ( (lv_cell_0_0= '|' ) )
            // InternalCucumber.g:914:4: (lv_cell_0_0= '|' )
            {
            // InternalCucumber.g:914:4: (lv_cell_0_0= '|' )
            // InternalCucumber.g:915:5: lv_cell_0_0= '|'
            {
            lv_cell_0_0=(Token)match(input,20,FOLLOW_5); 

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
    // InternalCucumber.g:938:1: entryRuleDocString returns [EObject current=null] : iv_ruleDocString= ruleDocString EOF ;
    public final EObject entryRuleDocString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocString = null;


        try {
            // InternalCucumber.g:938:50: (iv_ruleDocString= ruleDocString EOF )
            // InternalCucumber.g:939:2: iv_ruleDocString= ruleDocString EOF
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
    // InternalCucumber.g:945:1: ruleDocString returns [EObject current=null] : ( () otherlv_1= '\"\"\"' ( ruleSentence | this_EOL_3= RULE_EOL )* otherlv_4= '\"\"\"' this_EOL_5= RULE_EOL ) ;
    public final EObject ruleDocString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_EOL_3=null;
        Token otherlv_4=null;
        Token this_EOL_5=null;


        	enterRule();

        try {
            // InternalCucumber.g:951:2: ( ( () otherlv_1= '\"\"\"' ( ruleSentence | this_EOL_3= RULE_EOL )* otherlv_4= '\"\"\"' this_EOL_5= RULE_EOL ) )
            // InternalCucumber.g:952:2: ( () otherlv_1= '\"\"\"' ( ruleSentence | this_EOL_3= RULE_EOL )* otherlv_4= '\"\"\"' this_EOL_5= RULE_EOL )
            {
            // InternalCucumber.g:952:2: ( () otherlv_1= '\"\"\"' ( ruleSentence | this_EOL_3= RULE_EOL )* otherlv_4= '\"\"\"' this_EOL_5= RULE_EOL )
            // InternalCucumber.g:953:3: () otherlv_1= '\"\"\"' ( ruleSentence | this_EOL_3= RULE_EOL )* otherlv_4= '\"\"\"' this_EOL_5= RULE_EOL
            {
            // InternalCucumber.g:953:3: ()
            // InternalCucumber.g:954:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDocStringAccess().getDocStringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_1());
            		
            // InternalCucumber.g:964:3: ( ruleSentence | this_EOL_3= RULE_EOL )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_WORD) ) {
                    alt19=1;
                }
                else if ( (LA19_0==RULE_EOL) ) {
                    alt19=2;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCucumber.g:965:4: ruleSentence
            	    {

            	    				newCompositeNode(grammarAccess.getDocStringAccess().getSentenceParserRuleCall_2_0());
            	    			
            	    pushFollow(FOLLOW_19);
            	    ruleSentence();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalCucumber.g:973:4: this_EOL_3= RULE_EOL
            	    {
            	    this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_19); 

            	    				newLeafNode(this_EOL_3, grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_6); 

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


    // $ANTLR start "entryRuleTag"
    // InternalCucumber.g:990:1: entryRuleTag returns [EObject current=null] : iv_ruleTag= ruleTag EOF ;
    public final EObject entryRuleTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTag = null;


        try {
            // InternalCucumber.g:990:44: (iv_ruleTag= ruleTag EOF )
            // InternalCucumber.g:991:2: iv_ruleTag= ruleTag EOF
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
    // InternalCucumber.g:997:1: ruleTag returns [EObject current=null] : ( (lv_tag_0_0= RULE_TAG_ID ) ) ;
    public final EObject ruleTag() throws RecognitionException {
        EObject current = null;

        Token lv_tag_0_0=null;


        	enterRule();

        try {
            // InternalCucumber.g:1003:2: ( ( (lv_tag_0_0= RULE_TAG_ID ) ) )
            // InternalCucumber.g:1004:2: ( (lv_tag_0_0= RULE_TAG_ID ) )
            {
            // InternalCucumber.g:1004:2: ( (lv_tag_0_0= RULE_TAG_ID ) )
            // InternalCucumber.g:1005:3: (lv_tag_0_0= RULE_TAG_ID )
            {
            // InternalCucumber.g:1005:3: (lv_tag_0_0= RULE_TAG_ID )
            // InternalCucumber.g:1006:4: lv_tag_0_0= RULE_TAG_ID
            {
            lv_tag_0_0=(Token)match(input,RULE_TAG_ID,FOLLOW_2); 

            				newLeafNode(lv_tag_0_0, grammarAccess.getTagAccess().getTagTAG_IDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTagRule());
            				}
            				setWithLastConsumed(
            					current,
            					"tag",
            					lv_tag_0_0,
            					"org.farhan.Cucumber.TAG_ID");
            			

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
    // InternalCucumber.g:1025:1: entryRuleSentence returns [String current=null] : iv_ruleSentence= ruleSentence EOF ;
    public final String entryRuleSentence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSentence = null;


        try {
            // InternalCucumber.g:1025:48: (iv_ruleSentence= ruleSentence EOF )
            // InternalCucumber.g:1026:2: iv_ruleSentence= ruleSentence EOF
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
    // InternalCucumber.g:1032:1: ruleSentence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WORD_0= RULE_WORD )+ ;
    public final AntlrDatatypeRuleToken ruleSentence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;


        	enterRule();

        try {
            // InternalCucumber.g:1038:2: ( (this_WORD_0= RULE_WORD )+ )
            // InternalCucumber.g:1039:2: (this_WORD_0= RULE_WORD )+
            {
            // InternalCucumber.g:1039:2: (this_WORD_0= RULE_WORD )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_WORD) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCucumber.g:1040:3: this_WORD_0= RULE_WORD
            	    {
            	    this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_20); 

            	    			current.merge(this_WORD_0);
            	    		

            	    			newLeafNode(this_WORD_0, grammarAccess.getSentenceAccess().getWORDTerminalRuleCall());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001C72L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001832L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000FC002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000FE030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000FE032L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000300012L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000042L});

}
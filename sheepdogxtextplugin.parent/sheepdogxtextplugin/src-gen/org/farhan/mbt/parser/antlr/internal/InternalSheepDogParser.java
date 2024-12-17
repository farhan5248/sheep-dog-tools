package org.farhan.mbt.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.farhan.mbt.services.SheepDogGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSheepDogParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_WORD", "RULE_ID", "RULE_STRING", "RULE_WS", "RULE_SL_COMMENT", "'='", "'[background=\"true\"]'", "'=='", "'[examples=\"true\"]'", "'==='", "'[tags=\"'", "'\"]'", "':tags:'", "'Given'", "'When'", "'Then'", "'----'", "'[options=\"header\"]'", "'|==='", "'|'"
    };
    public static final int RULE_WORD=5;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_ID=6;
    public static final int RULE_EOL=4;
    public static final int RULE_WS=8;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSheepDogParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSheepDogParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSheepDogParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSheepDog.g"; }



     	private SheepDogGrammarAccess grammarAccess;

        public InternalSheepDogParser(TokenStream input, SheepDogGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected SheepDogGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalSheepDog.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSheepDog.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalSheepDog.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSheepDog.g:71:1: ruleModel returns [EObject current=null] : (this_StepObject_0= ruleStepObject | this_Feature_1= ruleFeature ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_StepObject_0 = null;

        EObject this_Feature_1 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:77:2: ( (this_StepObject_0= ruleStepObject | this_Feature_1= ruleFeature ) )
            // InternalSheepDog.g:78:2: (this_StepObject_0= ruleStepObject | this_Feature_1= ruleFeature )
            {
            // InternalSheepDog.g:78:2: (this_StepObject_0= ruleStepObject | this_Feature_1= ruleFeature )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalSheepDog.g:79:3: this_StepObject_0= ruleStepObject
                    {

                    			newCompositeNode(grammarAccess.getModelAccess().getStepObjectParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StepObject_0=ruleStepObject();

                    state._fsp--;


                    			current = this_StepObject_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSheepDog.g:88:3: this_Feature_1= ruleFeature
                    {

                    			newCompositeNode(grammarAccess.getModelAccess().getFeatureParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Feature_1=ruleFeature();

                    state._fsp--;


                    			current = this_Feature_1;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFeature"
    // InternalSheepDog.g:100:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalSheepDog.g:100:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalSheepDog.g:101:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalSheepDog.g:107:1: ruleFeature returns [EObject current=null] : ( ( (lv_tags_0_0= ruleFeatureTags ) )? otherlv_1= '=' ( (lv_name_2_0= rulePhrase ) ) this_EOL_3= RULE_EOL ( (lv_statements_4_0= ruleStatement ) )* ( (lv_background_5_0= ruleBackground ) )? ( (lv_scenarios_6_0= ruleScenario ) )* ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_EOL_3=null;
        EObject lv_tags_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_statements_4_0 = null;

        EObject lv_background_5_0 = null;

        EObject lv_scenarios_6_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:113:2: ( ( ( (lv_tags_0_0= ruleFeatureTags ) )? otherlv_1= '=' ( (lv_name_2_0= rulePhrase ) ) this_EOL_3= RULE_EOL ( (lv_statements_4_0= ruleStatement ) )* ( (lv_background_5_0= ruleBackground ) )? ( (lv_scenarios_6_0= ruleScenario ) )* ) )
            // InternalSheepDog.g:114:2: ( ( (lv_tags_0_0= ruleFeatureTags ) )? otherlv_1= '=' ( (lv_name_2_0= rulePhrase ) ) this_EOL_3= RULE_EOL ( (lv_statements_4_0= ruleStatement ) )* ( (lv_background_5_0= ruleBackground ) )? ( (lv_scenarios_6_0= ruleScenario ) )* )
            {
            // InternalSheepDog.g:114:2: ( ( (lv_tags_0_0= ruleFeatureTags ) )? otherlv_1= '=' ( (lv_name_2_0= rulePhrase ) ) this_EOL_3= RULE_EOL ( (lv_statements_4_0= ruleStatement ) )* ( (lv_background_5_0= ruleBackground ) )? ( (lv_scenarios_6_0= ruleScenario ) )* )
            // InternalSheepDog.g:115:3: ( (lv_tags_0_0= ruleFeatureTags ) )? otherlv_1= '=' ( (lv_name_2_0= rulePhrase ) ) this_EOL_3= RULE_EOL ( (lv_statements_4_0= ruleStatement ) )* ( (lv_background_5_0= ruleBackground ) )? ( (lv_scenarios_6_0= ruleScenario ) )*
            {
            // InternalSheepDog.g:115:3: ( (lv_tags_0_0= ruleFeatureTags ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSheepDog.g:116:4: (lv_tags_0_0= ruleFeatureTags )
                    {
                    // InternalSheepDog.g:116:4: (lv_tags_0_0= ruleFeatureTags )
                    // InternalSheepDog.g:117:5: lv_tags_0_0= ruleFeatureTags
                    {

                    					newCompositeNode(grammarAccess.getFeatureAccess().getTagsFeatureTagsParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_tags_0_0=ruleFeatureTags();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFeatureRule());
                    					}
                    					set(
                    						current,
                    						"tags",
                    						lv_tags_0_0,
                    						"org.farhan.mbt.SheepDog.FeatureTags");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,10,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getEqualsSignKeyword_1());
            		
            // InternalSheepDog.g:138:3: ( (lv_name_2_0= rulePhrase ) )
            // InternalSheepDog.g:139:4: (lv_name_2_0= rulePhrase )
            {
            // InternalSheepDog.g:139:4: (lv_name_2_0= rulePhrase )
            // InternalSheepDog.g:140:5: lv_name_2_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getNamePhraseParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.farhan.mbt.SheepDog.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_6); 

            			newLeafNode(this_EOL_3, grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_3());
            		
            // InternalSheepDog.g:161:3: ( (lv_statements_4_0= ruleStatement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_WORD && LA3_0<=RULE_STRING)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSheepDog.g:162:4: (lv_statements_4_0= ruleStatement )
            	    {
            	    // InternalSheepDog.g:162:4: (lv_statements_4_0= ruleStatement )
            	    // InternalSheepDog.g:163:5: lv_statements_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureAccess().getStatementsStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_statements_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_4_0,
            	    						"org.farhan.mbt.SheepDog.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalSheepDog.g:180:3: ( (lv_background_5_0= ruleBackground ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSheepDog.g:181:4: (lv_background_5_0= ruleBackground )
                    {
                    // InternalSheepDog.g:181:4: (lv_background_5_0= ruleBackground )
                    // InternalSheepDog.g:182:5: lv_background_5_0= ruleBackground
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
                    						"org.farhan.mbt.SheepDog.Background");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSheepDog.g:199:3: ( (lv_scenarios_6_0= ruleScenario ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==12||LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSheepDog.g:200:4: (lv_scenarios_6_0= ruleScenario )
            	    {
            	    // InternalSheepDog.g:200:4: (lv_scenarios_6_0= ruleScenario )
            	    // InternalSheepDog.g:201:5: lv_scenarios_6_0= ruleScenario
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_scenarios_6_0=ruleScenario();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"scenarios",
            	    						lv_scenarios_6_0,
            	    						"org.farhan.mbt.SheepDog.Scenario");
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
    // InternalSheepDog.g:222:1: entryRuleBackground returns [EObject current=null] : iv_ruleBackground= ruleBackground EOF ;
    public final EObject entryRuleBackground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackground = null;


        try {
            // InternalSheepDog.g:222:51: (iv_ruleBackground= ruleBackground EOF )
            // InternalSheepDog.g:223:2: iv_ruleBackground= ruleBackground EOF
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
    // InternalSheepDog.g:229:1: ruleBackground returns [EObject current=null] : (otherlv_0= '[background=\"true\"]' this_EOL_1= RULE_EOL otherlv_2= '==' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* ) ;
    public final EObject ruleBackground() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EOL_1=null;
        Token otherlv_2=null;
        Token this_EOL_4=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_statements_5_0 = null;

        EObject lv_steps_6_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:235:2: ( (otherlv_0= '[background=\"true\"]' this_EOL_1= RULE_EOL otherlv_2= '==' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* ) )
            // InternalSheepDog.g:236:2: (otherlv_0= '[background=\"true\"]' this_EOL_1= RULE_EOL otherlv_2= '==' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* )
            {
            // InternalSheepDog.g:236:2: (otherlv_0= '[background=\"true\"]' this_EOL_1= RULE_EOL otherlv_2= '==' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* )
            // InternalSheepDog.g:237:3: otherlv_0= '[background=\"true\"]' this_EOL_1= RULE_EOL otherlv_2= '==' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBackgroundAccess().getBackgroundTrueKeyword_0());
            		
            this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_8); 

            			newLeafNode(this_EOL_1, grammarAccess.getBackgroundAccess().getEOLTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getBackgroundAccess().getEqualsSignEqualsSignKeyword_2());
            		
            // InternalSheepDog.g:249:3: ( (lv_name_3_0= rulePhrase ) )
            // InternalSheepDog.g:250:4: (lv_name_3_0= rulePhrase )
            {
            // InternalSheepDog.g:250:4: (lv_name_3_0= rulePhrase )
            // InternalSheepDog.g:251:5: lv_name_3_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getBackgroundAccess().getNamePhraseParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_3_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBackgroundRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.farhan.mbt.SheepDog.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_4=(Token)match(input,RULE_EOL,FOLLOW_9); 

            			newLeafNode(this_EOL_4, grammarAccess.getBackgroundAccess().getEOLTerminalRuleCall_4());
            		
            // InternalSheepDog.g:272:3: ( (lv_statements_5_0= ruleStatement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_WORD && LA6_0<=RULE_STRING)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSheepDog.g:273:4: (lv_statements_5_0= ruleStatement )
            	    {
            	    // InternalSheepDog.g:273:4: (lv_statements_5_0= ruleStatement )
            	    // InternalSheepDog.g:274:5: lv_statements_5_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getBackgroundAccess().getStatementsStatementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_statements_5_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBackgroundRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_5_0,
            	    						"org.farhan.mbt.SheepDog.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalSheepDog.g:291:3: ( (lv_steps_6_0= ruleStep ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSheepDog.g:292:4: (lv_steps_6_0= ruleStep )
            	    {
            	    // InternalSheepDog.g:292:4: (lv_steps_6_0= ruleStep )
            	    // InternalSheepDog.g:293:5: lv_steps_6_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_steps_6_0=ruleStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBackgroundRule());
            	    					}
            	    					add(
            	    						current,
            	    						"steps",
            	    						lv_steps_6_0,
            	    						"org.farhan.mbt.SheepDog.Step");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalSheepDog.g:314:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalSheepDog.g:314:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalSheepDog.g:315:2: iv_ruleScenario= ruleScenario EOF
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
    // InternalSheepDog.g:321:1: ruleScenario returns [EObject current=null] : ( ( (lv_tags_0_0= ruleScenarioTags ) )? otherlv_1= '==' ( (lv_name_2_0= rulePhrase ) ) this_EOL_3= RULE_EOL ( (lv_statements_4_0= ruleStatement ) )* ( (lv_steps_5_0= ruleStep ) )* ( (lv_examples_6_0= ruleExamples ) )+ ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_EOL_3=null;
        EObject lv_tags_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_statements_4_0 = null;

        EObject lv_steps_5_0 = null;

        EObject lv_examples_6_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:327:2: ( ( ( (lv_tags_0_0= ruleScenarioTags ) )? otherlv_1= '==' ( (lv_name_2_0= rulePhrase ) ) this_EOL_3= RULE_EOL ( (lv_statements_4_0= ruleStatement ) )* ( (lv_steps_5_0= ruleStep ) )* ( (lv_examples_6_0= ruleExamples ) )+ ) )
            // InternalSheepDog.g:328:2: ( ( (lv_tags_0_0= ruleScenarioTags ) )? otherlv_1= '==' ( (lv_name_2_0= rulePhrase ) ) this_EOL_3= RULE_EOL ( (lv_statements_4_0= ruleStatement ) )* ( (lv_steps_5_0= ruleStep ) )* ( (lv_examples_6_0= ruleExamples ) )+ )
            {
            // InternalSheepDog.g:328:2: ( ( (lv_tags_0_0= ruleScenarioTags ) )? otherlv_1= '==' ( (lv_name_2_0= rulePhrase ) ) this_EOL_3= RULE_EOL ( (lv_statements_4_0= ruleStatement ) )* ( (lv_steps_5_0= ruleStep ) )* ( (lv_examples_6_0= ruleExamples ) )+ )
            // InternalSheepDog.g:329:3: ( (lv_tags_0_0= ruleScenarioTags ) )? otherlv_1= '==' ( (lv_name_2_0= rulePhrase ) ) this_EOL_3= RULE_EOL ( (lv_statements_4_0= ruleStatement ) )* ( (lv_steps_5_0= ruleStep ) )* ( (lv_examples_6_0= ruleExamples ) )+
            {
            // InternalSheepDog.g:329:3: ( (lv_tags_0_0= ruleScenarioTags ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSheepDog.g:330:4: (lv_tags_0_0= ruleScenarioTags )
                    {
                    // InternalSheepDog.g:330:4: (lv_tags_0_0= ruleScenarioTags )
                    // InternalSheepDog.g:331:5: lv_tags_0_0= ruleScenarioTags
                    {

                    					newCompositeNode(grammarAccess.getScenarioAccess().getTagsScenarioTagsParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_tags_0_0=ruleScenarioTags();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getScenarioRule());
                    					}
                    					set(
                    						current,
                    						"tags",
                    						lv_tags_0_0,
                    						"org.farhan.mbt.SheepDog.ScenarioTags");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getScenarioAccess().getEqualsSignEqualsSignKeyword_1());
            		
            // InternalSheepDog.g:352:3: ( (lv_name_2_0= rulePhrase ) )
            // InternalSheepDog.g:353:4: (lv_name_2_0= rulePhrase )
            {
            // InternalSheepDog.g:353:4: (lv_name_2_0= rulePhrase )
            // InternalSheepDog.g:354:5: lv_name_2_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getScenarioAccess().getNamePhraseParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.farhan.mbt.SheepDog.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_11); 

            			newLeafNode(this_EOL_3, grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_3());
            		
            // InternalSheepDog.g:375:3: ( (lv_statements_4_0= ruleStatement ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_WORD && LA9_0<=RULE_STRING)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSheepDog.g:376:4: (lv_statements_4_0= ruleStatement )
            	    {
            	    // InternalSheepDog.g:376:4: (lv_statements_4_0= ruleStatement )
            	    // InternalSheepDog.g:377:5: lv_statements_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getStatementsStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_statements_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_4_0,
            	    						"org.farhan.mbt.SheepDog.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalSheepDog.g:394:3: ( (lv_steps_5_0= ruleStep ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==14) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSheepDog.g:395:4: (lv_steps_5_0= ruleStep )
            	    {
            	    // InternalSheepDog.g:395:4: (lv_steps_5_0= ruleStep )
            	    // InternalSheepDog.g:396:5: lv_steps_5_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_steps_5_0=ruleStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"steps",
            	    						lv_steps_5_0,
            	    						"org.farhan.mbt.SheepDog.Step");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalSheepDog.g:413:3: ( (lv_examples_6_0= ruleExamples ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==13) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSheepDog.g:414:4: (lv_examples_6_0= ruleExamples )
            	    {
            	    // InternalSheepDog.g:414:4: (lv_examples_6_0= ruleExamples )
            	    // InternalSheepDog.g:415:5: lv_examples_6_0= ruleExamples
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getExamplesExamplesParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_examples_6_0=ruleExamples();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"examples",
            	    						lv_examples_6_0,
            	    						"org.farhan.mbt.SheepDog.Examples");
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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleExamples"
    // InternalSheepDog.g:436:1: entryRuleExamples returns [EObject current=null] : iv_ruleExamples= ruleExamples EOF ;
    public final EObject entryRuleExamples() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExamples = null;


        try {
            // InternalSheepDog.g:436:49: (iv_ruleExamples= ruleExamples EOF )
            // InternalSheepDog.g:437:2: iv_ruleExamples= ruleExamples EOF
            {
             newCompositeNode(grammarAccess.getExamplesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExamples=ruleExamples();

            state._fsp--;

             current =iv_ruleExamples; 
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
    // $ANTLR end "entryRuleExamples"


    // $ANTLR start "ruleExamples"
    // InternalSheepDog.g:443:1: ruleExamples returns [EObject current=null] : (otherlv_0= '[examples=\"true\"]' this_EOL_1= RULE_EOL otherlv_2= '===' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_theExamplesTable_6_0= ruleTable ) ) ) ;
    public final EObject ruleExamples() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EOL_1=null;
        Token otherlv_2=null;
        Token this_EOL_4=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_statements_5_0 = null;

        EObject lv_theExamplesTable_6_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:449:2: ( (otherlv_0= '[examples=\"true\"]' this_EOL_1= RULE_EOL otherlv_2= '===' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_theExamplesTable_6_0= ruleTable ) ) ) )
            // InternalSheepDog.g:450:2: (otherlv_0= '[examples=\"true\"]' this_EOL_1= RULE_EOL otherlv_2= '===' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_theExamplesTable_6_0= ruleTable ) ) )
            {
            // InternalSheepDog.g:450:2: (otherlv_0= '[examples=\"true\"]' this_EOL_1= RULE_EOL otherlv_2= '===' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_theExamplesTable_6_0= ruleTable ) ) )
            // InternalSheepDog.g:451:3: otherlv_0= '[examples=\"true\"]' this_EOL_1= RULE_EOL otherlv_2= '===' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_theExamplesTable_6_0= ruleTable ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getExamplesAccess().getExamplesTrueKeyword_0());
            		
            this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_13); 

            			newLeafNode(this_EOL_1, grammarAccess.getExamplesAccess().getEOLTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getExamplesAccess().getEqualsSignEqualsSignEqualsSignKeyword_2());
            		
            // InternalSheepDog.g:463:3: ( (lv_name_3_0= rulePhrase ) )
            // InternalSheepDog.g:464:4: (lv_name_3_0= rulePhrase )
            {
            // InternalSheepDog.g:464:4: (lv_name_3_0= rulePhrase )
            // InternalSheepDog.g:465:5: lv_name_3_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getExamplesAccess().getNamePhraseParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_3_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExamplesRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.farhan.mbt.SheepDog.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_4=(Token)match(input,RULE_EOL,FOLLOW_14); 

            			newLeafNode(this_EOL_4, grammarAccess.getExamplesAccess().getEOLTerminalRuleCall_4());
            		
            // InternalSheepDog.g:486:3: ( (lv_statements_5_0= ruleStatement ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_WORD && LA12_0<=RULE_STRING)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSheepDog.g:487:4: (lv_statements_5_0= ruleStatement )
            	    {
            	    // InternalSheepDog.g:487:4: (lv_statements_5_0= ruleStatement )
            	    // InternalSheepDog.g:488:5: lv_statements_5_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getExamplesAccess().getStatementsStatementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_statements_5_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExamplesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_5_0,
            	    						"org.farhan.mbt.SheepDog.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalSheepDog.g:505:3: ( (lv_theExamplesTable_6_0= ruleTable ) )
            // InternalSheepDog.g:506:4: (lv_theExamplesTable_6_0= ruleTable )
            {
            // InternalSheepDog.g:506:4: (lv_theExamplesTable_6_0= ruleTable )
            // InternalSheepDog.g:507:5: lv_theExamplesTable_6_0= ruleTable
            {

            					newCompositeNode(grammarAccess.getExamplesAccess().getTheExamplesTableTableParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_theExamplesTable_6_0=ruleTable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExamplesRule());
            					}
            					set(
            						current,
            						"theExamplesTable",
            						lv_theExamplesTable_6_0,
            						"org.farhan.mbt.SheepDog.Table");
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
    // $ANTLR end "ruleExamples"


    // $ANTLR start "entryRuleScenarioTags"
    // InternalSheepDog.g:528:1: entryRuleScenarioTags returns [EObject current=null] : iv_ruleScenarioTags= ruleScenarioTags EOF ;
    public final EObject entryRuleScenarioTags() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenarioTags = null;


        try {
            // InternalSheepDog.g:528:53: (iv_ruleScenarioTags= ruleScenarioTags EOF )
            // InternalSheepDog.g:529:2: iv_ruleScenarioTags= ruleScenarioTags EOF
            {
             newCompositeNode(grammarAccess.getScenarioTagsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenarioTags=ruleScenarioTags();

            state._fsp--;

             current =iv_ruleScenarioTags; 
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
    // $ANTLR end "entryRuleScenarioTags"


    // $ANTLR start "ruleScenarioTags"
    // InternalSheepDog.g:535:1: ruleScenarioTags returns [EObject current=null] : (otherlv_0= '[tags=\"' ( (lv_name_1_0= rulePhrase ) ) otherlv_2= '\"]' this_EOL_3= RULE_EOL ) ;
    public final EObject ruleScenarioTags() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_EOL_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:541:2: ( (otherlv_0= '[tags=\"' ( (lv_name_1_0= rulePhrase ) ) otherlv_2= '\"]' this_EOL_3= RULE_EOL ) )
            // InternalSheepDog.g:542:2: (otherlv_0= '[tags=\"' ( (lv_name_1_0= rulePhrase ) ) otherlv_2= '\"]' this_EOL_3= RULE_EOL )
            {
            // InternalSheepDog.g:542:2: (otherlv_0= '[tags=\"' ( (lv_name_1_0= rulePhrase ) ) otherlv_2= '\"]' this_EOL_3= RULE_EOL )
            // InternalSheepDog.g:543:3: otherlv_0= '[tags=\"' ( (lv_name_1_0= rulePhrase ) ) otherlv_2= '\"]' this_EOL_3= RULE_EOL
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getScenarioTagsAccess().getTagsKeyword_0());
            		
            // InternalSheepDog.g:547:3: ( (lv_name_1_0= rulePhrase ) )
            // InternalSheepDog.g:548:4: (lv_name_1_0= rulePhrase )
            {
            // InternalSheepDog.g:548:4: (lv_name_1_0= rulePhrase )
            // InternalSheepDog.g:549:5: lv_name_1_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getScenarioTagsAccess().getNamePhraseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_1_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioTagsRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.farhan.mbt.SheepDog.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getScenarioTagsAccess().getQuotationMarkRightSquareBracketKeyword_2());
            		
            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_2); 

            			newLeafNode(this_EOL_3, grammarAccess.getScenarioTagsAccess().getEOLTerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleScenarioTags"


    // $ANTLR start "entryRuleFeatureTags"
    // InternalSheepDog.g:578:1: entryRuleFeatureTags returns [EObject current=null] : iv_ruleFeatureTags= ruleFeatureTags EOF ;
    public final EObject entryRuleFeatureTags() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureTags = null;


        try {
            // InternalSheepDog.g:578:52: (iv_ruleFeatureTags= ruleFeatureTags EOF )
            // InternalSheepDog.g:579:2: iv_ruleFeatureTags= ruleFeatureTags EOF
            {
             newCompositeNode(grammarAccess.getFeatureTagsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureTags=ruleFeatureTags();

            state._fsp--;

             current =iv_ruleFeatureTags; 
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
    // $ANTLR end "entryRuleFeatureTags"


    // $ANTLR start "ruleFeatureTags"
    // InternalSheepDog.g:585:1: ruleFeatureTags returns [EObject current=null] : (otherlv_0= ':tags:' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ) ;
    public final EObject ruleFeatureTags() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EOL_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:591:2: ( (otherlv_0= ':tags:' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ) )
            // InternalSheepDog.g:592:2: (otherlv_0= ':tags:' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL )
            {
            // InternalSheepDog.g:592:2: (otherlv_0= ':tags:' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL )
            // InternalSheepDog.g:593:3: otherlv_0= ':tags:' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureTagsAccess().getTagsKeyword_0());
            		
            // InternalSheepDog.g:597:3: ( (lv_name_1_0= rulePhrase ) )
            // InternalSheepDog.g:598:4: (lv_name_1_0= rulePhrase )
            {
            // InternalSheepDog.g:598:4: (lv_name_1_0= rulePhrase )
            // InternalSheepDog.g:599:5: lv_name_1_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getFeatureTagsAccess().getNamePhraseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureTagsRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.farhan.mbt.SheepDog.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_2); 

            			newLeafNode(this_EOL_2, grammarAccess.getFeatureTagsAccess().getEOLTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleFeatureTags"


    // $ANTLR start "entryRuleStep"
    // InternalSheepDog.g:624:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalSheepDog.g:624:45: (iv_ruleStep= ruleStep EOF )
            // InternalSheepDog.g:625:2: iv_ruleStep= ruleStep EOF
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
    // InternalSheepDog.g:631:1: ruleStep returns [EObject current=null] : (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        EObject this_Given_0 = null;

        EObject this_When_1 = null;

        EObject this_Then_2 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:637:2: ( (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen ) )
            // InternalSheepDog.g:638:2: (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen )
            {
            // InternalSheepDog.g:638:2: (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==14) ) {
                switch ( input.LA(2) ) {
                case 20:
                    {
                    alt13=3;
                    }
                    break;
                case 19:
                    {
                    alt13=2;
                    }
                    break;
                case 18:
                    {
                    alt13=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSheepDog.g:639:3: this_Given_0= ruleGiven
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getGivenParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Given_0=ruleGiven();

                    state._fsp--;


                    			current = this_Given_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSheepDog.g:648:3: this_When_1= ruleWhen
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getWhenParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_When_1=ruleWhen();

                    state._fsp--;


                    			current = this_When_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSheepDog.g:657:3: this_Then_2= ruleThen
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getThenParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Then_2=ruleThen();

                    state._fsp--;


                    			current = this_Then_2;
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
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleGiven"
    // InternalSheepDog.g:669:1: entryRuleGiven returns [EObject current=null] : iv_ruleGiven= ruleGiven EOF ;
    public final EObject entryRuleGiven() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGiven = null;


        try {
            // InternalSheepDog.g:669:46: (iv_ruleGiven= ruleGiven EOF )
            // InternalSheepDog.g:670:2: iv_ruleGiven= ruleGiven EOF
            {
             newCompositeNode(grammarAccess.getGivenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGiven=ruleGiven();

            state._fsp--;

             current =iv_ruleGiven; 
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
    // $ANTLR end "entryRuleGiven"


    // $ANTLR start "ruleGiven"
    // InternalSheepDog.g:676:1: ruleGiven returns [EObject current=null] : (otherlv_0= '===' otherlv_1= 'Given' ( (lv_name_2_0= rulePhrase ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? ) ;
    public final EObject ruleGiven() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_EOL_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_theStepTable_4_0 = null;

        EObject lv_theDocString_5_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:682:2: ( (otherlv_0= '===' otherlv_1= 'Given' ( (lv_name_2_0= rulePhrase ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? ) )
            // InternalSheepDog.g:683:2: (otherlv_0= '===' otherlv_1= 'Given' ( (lv_name_2_0= rulePhrase ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? )
            {
            // InternalSheepDog.g:683:2: (otherlv_0= '===' otherlv_1= 'Given' ( (lv_name_2_0= rulePhrase ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? )
            // InternalSheepDog.g:684:3: otherlv_0= '===' otherlv_1= 'Given' ( (lv_name_2_0= rulePhrase ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getGivenAccess().getEqualsSignEqualsSignEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGivenAccess().getGivenKeyword_1());
            		
            // InternalSheepDog.g:692:3: ( (lv_name_2_0= rulePhrase ) )
            // InternalSheepDog.g:693:4: (lv_name_2_0= rulePhrase )
            {
            // InternalSheepDog.g:693:4: (lv_name_2_0= rulePhrase )
            // InternalSheepDog.g:694:5: lv_name_2_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getGivenAccess().getNamePhraseParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGivenRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.farhan.mbt.SheepDog.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_17); 

            			newLeafNode(this_EOL_3, grammarAccess.getGivenAccess().getEOLTerminalRuleCall_3());
            		
            // InternalSheepDog.g:715:3: ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )?
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            else if ( (LA14_0==21) ) {
                alt14=2;
            }
            switch (alt14) {
                case 1 :
                    // InternalSheepDog.g:716:4: ( (lv_theStepTable_4_0= ruleTable ) )
                    {
                    // InternalSheepDog.g:716:4: ( (lv_theStepTable_4_0= ruleTable ) )
                    // InternalSheepDog.g:717:5: (lv_theStepTable_4_0= ruleTable )
                    {
                    // InternalSheepDog.g:717:5: (lv_theStepTable_4_0= ruleTable )
                    // InternalSheepDog.g:718:6: lv_theStepTable_4_0= ruleTable
                    {

                    						newCompositeNode(grammarAccess.getGivenAccess().getTheStepTableTableParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_theStepTable_4_0=ruleTable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGivenRule());
                    						}
                    						set(
                    							current,
                    							"theStepTable",
                    							lv_theStepTable_4_0,
                    							"org.farhan.mbt.SheepDog.Table");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSheepDog.g:736:4: ( (lv_theDocString_5_0= ruleDocString ) )
                    {
                    // InternalSheepDog.g:736:4: ( (lv_theDocString_5_0= ruleDocString ) )
                    // InternalSheepDog.g:737:5: (lv_theDocString_5_0= ruleDocString )
                    {
                    // InternalSheepDog.g:737:5: (lv_theDocString_5_0= ruleDocString )
                    // InternalSheepDog.g:738:6: lv_theDocString_5_0= ruleDocString
                    {

                    						newCompositeNode(grammarAccess.getGivenAccess().getTheDocStringDocStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_theDocString_5_0=ruleDocString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGivenRule());
                    						}
                    						set(
                    							current,
                    							"theDocString",
                    							lv_theDocString_5_0,
                    							"org.farhan.mbt.SheepDog.DocString");
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
    // $ANTLR end "ruleGiven"


    // $ANTLR start "entryRuleWhen"
    // InternalSheepDog.g:760:1: entryRuleWhen returns [EObject current=null] : iv_ruleWhen= ruleWhen EOF ;
    public final EObject entryRuleWhen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhen = null;


        try {
            // InternalSheepDog.g:760:45: (iv_ruleWhen= ruleWhen EOF )
            // InternalSheepDog.g:761:2: iv_ruleWhen= ruleWhen EOF
            {
             newCompositeNode(grammarAccess.getWhenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhen=ruleWhen();

            state._fsp--;

             current =iv_ruleWhen; 
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
    // $ANTLR end "entryRuleWhen"


    // $ANTLR start "ruleWhen"
    // InternalSheepDog.g:767:1: ruleWhen returns [EObject current=null] : (otherlv_0= '===' otherlv_1= 'When' ( (lv_name_2_0= rulePhrase ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? ) ;
    public final EObject ruleWhen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_EOL_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_theStepTable_4_0 = null;

        EObject lv_theDocString_5_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:773:2: ( (otherlv_0= '===' otherlv_1= 'When' ( (lv_name_2_0= rulePhrase ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? ) )
            // InternalSheepDog.g:774:2: (otherlv_0= '===' otherlv_1= 'When' ( (lv_name_2_0= rulePhrase ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? )
            {
            // InternalSheepDog.g:774:2: (otherlv_0= '===' otherlv_1= 'When' ( (lv_name_2_0= rulePhrase ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? )
            // InternalSheepDog.g:775:3: otherlv_0= '===' otherlv_1= 'When' ( (lv_name_2_0= rulePhrase ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getWhenAccess().getEqualsSignEqualsSignEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getWhenAccess().getWhenKeyword_1());
            		
            // InternalSheepDog.g:783:3: ( (lv_name_2_0= rulePhrase ) )
            // InternalSheepDog.g:784:4: (lv_name_2_0= rulePhrase )
            {
            // InternalSheepDog.g:784:4: (lv_name_2_0= rulePhrase )
            // InternalSheepDog.g:785:5: lv_name_2_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getWhenAccess().getNamePhraseParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhenRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.farhan.mbt.SheepDog.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_17); 

            			newLeafNode(this_EOL_3, grammarAccess.getWhenAccess().getEOLTerminalRuleCall_3());
            		
            // InternalSheepDog.g:806:3: ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )?
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            else if ( (LA15_0==21) ) {
                alt15=2;
            }
            switch (alt15) {
                case 1 :
                    // InternalSheepDog.g:807:4: ( (lv_theStepTable_4_0= ruleTable ) )
                    {
                    // InternalSheepDog.g:807:4: ( (lv_theStepTable_4_0= ruleTable ) )
                    // InternalSheepDog.g:808:5: (lv_theStepTable_4_0= ruleTable )
                    {
                    // InternalSheepDog.g:808:5: (lv_theStepTable_4_0= ruleTable )
                    // InternalSheepDog.g:809:6: lv_theStepTable_4_0= ruleTable
                    {

                    						newCompositeNode(grammarAccess.getWhenAccess().getTheStepTableTableParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_theStepTable_4_0=ruleTable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWhenRule());
                    						}
                    						set(
                    							current,
                    							"theStepTable",
                    							lv_theStepTable_4_0,
                    							"org.farhan.mbt.SheepDog.Table");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSheepDog.g:827:4: ( (lv_theDocString_5_0= ruleDocString ) )
                    {
                    // InternalSheepDog.g:827:4: ( (lv_theDocString_5_0= ruleDocString ) )
                    // InternalSheepDog.g:828:5: (lv_theDocString_5_0= ruleDocString )
                    {
                    // InternalSheepDog.g:828:5: (lv_theDocString_5_0= ruleDocString )
                    // InternalSheepDog.g:829:6: lv_theDocString_5_0= ruleDocString
                    {

                    						newCompositeNode(grammarAccess.getWhenAccess().getTheDocStringDocStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_theDocString_5_0=ruleDocString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWhenRule());
                    						}
                    						set(
                    							current,
                    							"theDocString",
                    							lv_theDocString_5_0,
                    							"org.farhan.mbt.SheepDog.DocString");
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
    // $ANTLR end "ruleWhen"


    // $ANTLR start "entryRuleThen"
    // InternalSheepDog.g:851:1: entryRuleThen returns [EObject current=null] : iv_ruleThen= ruleThen EOF ;
    public final EObject entryRuleThen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThen = null;


        try {
            // InternalSheepDog.g:851:45: (iv_ruleThen= ruleThen EOF )
            // InternalSheepDog.g:852:2: iv_ruleThen= ruleThen EOF
            {
             newCompositeNode(grammarAccess.getThenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThen=ruleThen();

            state._fsp--;

             current =iv_ruleThen; 
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
    // $ANTLR end "entryRuleThen"


    // $ANTLR start "ruleThen"
    // InternalSheepDog.g:858:1: ruleThen returns [EObject current=null] : (otherlv_0= '===' otherlv_1= 'Then' ( (lv_name_2_0= rulePhrase ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? ) ;
    public final EObject ruleThen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_EOL_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_theStepTable_4_0 = null;

        EObject lv_theDocString_5_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:864:2: ( (otherlv_0= '===' otherlv_1= 'Then' ( (lv_name_2_0= rulePhrase ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? ) )
            // InternalSheepDog.g:865:2: (otherlv_0= '===' otherlv_1= 'Then' ( (lv_name_2_0= rulePhrase ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? )
            {
            // InternalSheepDog.g:865:2: (otherlv_0= '===' otherlv_1= 'Then' ( (lv_name_2_0= rulePhrase ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? )
            // InternalSheepDog.g:866:3: otherlv_0= '===' otherlv_1= 'Then' ( (lv_name_2_0= rulePhrase ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getThenAccess().getEqualsSignEqualsSignEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getThenAccess().getThenKeyword_1());
            		
            // InternalSheepDog.g:874:3: ( (lv_name_2_0= rulePhrase ) )
            // InternalSheepDog.g:875:4: (lv_name_2_0= rulePhrase )
            {
            // InternalSheepDog.g:875:4: (lv_name_2_0= rulePhrase )
            // InternalSheepDog.g:876:5: lv_name_2_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getThenAccess().getNamePhraseParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThenRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.farhan.mbt.SheepDog.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_17); 

            			newLeafNode(this_EOL_3, grammarAccess.getThenAccess().getEOLTerminalRuleCall_3());
            		
            // InternalSheepDog.g:897:3: ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )?
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            else if ( (LA16_0==21) ) {
                alt16=2;
            }
            switch (alt16) {
                case 1 :
                    // InternalSheepDog.g:898:4: ( (lv_theStepTable_4_0= ruleTable ) )
                    {
                    // InternalSheepDog.g:898:4: ( (lv_theStepTable_4_0= ruleTable ) )
                    // InternalSheepDog.g:899:5: (lv_theStepTable_4_0= ruleTable )
                    {
                    // InternalSheepDog.g:899:5: (lv_theStepTable_4_0= ruleTable )
                    // InternalSheepDog.g:900:6: lv_theStepTable_4_0= ruleTable
                    {

                    						newCompositeNode(grammarAccess.getThenAccess().getTheStepTableTableParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_theStepTable_4_0=ruleTable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getThenRule());
                    						}
                    						set(
                    							current,
                    							"theStepTable",
                    							lv_theStepTable_4_0,
                    							"org.farhan.mbt.SheepDog.Table");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSheepDog.g:918:4: ( (lv_theDocString_5_0= ruleDocString ) )
                    {
                    // InternalSheepDog.g:918:4: ( (lv_theDocString_5_0= ruleDocString ) )
                    // InternalSheepDog.g:919:5: (lv_theDocString_5_0= ruleDocString )
                    {
                    // InternalSheepDog.g:919:5: (lv_theDocString_5_0= ruleDocString )
                    // InternalSheepDog.g:920:6: lv_theDocString_5_0= ruleDocString
                    {

                    						newCompositeNode(grammarAccess.getThenAccess().getTheDocStringDocStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_theDocString_5_0=ruleDocString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getThenRule());
                    						}
                    						set(
                    							current,
                    							"theDocString",
                    							lv_theDocString_5_0,
                    							"org.farhan.mbt.SheepDog.DocString");
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
    // $ANTLR end "ruleThen"


    // $ANTLR start "entryRuleDocString"
    // InternalSheepDog.g:942:1: entryRuleDocString returns [EObject current=null] : iv_ruleDocString= ruleDocString EOF ;
    public final EObject entryRuleDocString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocString = null;


        try {
            // InternalSheepDog.g:942:50: (iv_ruleDocString= ruleDocString EOF )
            // InternalSheepDog.g:943:2: iv_ruleDocString= ruleDocString EOF
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
    // InternalSheepDog.g:949:1: ruleDocString returns [EObject current=null] : (otherlv_0= '----' this_EOL_1= RULE_EOL ( (lv_lines_2_0= ruleLine ) )+ otherlv_3= '----' this_EOL_4= RULE_EOL ) ;
    public final EObject ruleDocString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EOL_1=null;
        Token otherlv_3=null;
        Token this_EOL_4=null;
        EObject lv_lines_2_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:955:2: ( (otherlv_0= '----' this_EOL_1= RULE_EOL ( (lv_lines_2_0= ruleLine ) )+ otherlv_3= '----' this_EOL_4= RULE_EOL ) )
            // InternalSheepDog.g:956:2: (otherlv_0= '----' this_EOL_1= RULE_EOL ( (lv_lines_2_0= ruleLine ) )+ otherlv_3= '----' this_EOL_4= RULE_EOL )
            {
            // InternalSheepDog.g:956:2: (otherlv_0= '----' this_EOL_1= RULE_EOL ( (lv_lines_2_0= ruleLine ) )+ otherlv_3= '----' this_EOL_4= RULE_EOL )
            // InternalSheepDog.g:957:3: otherlv_0= '----' this_EOL_1= RULE_EOL ( (lv_lines_2_0= ruleLine ) )+ otherlv_3= '----' this_EOL_4= RULE_EOL
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDocStringAccess().getHyphenMinusHyphenMinusHyphenMinusHyphenMinusKeyword_0());
            		
            this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_20); 

            			newLeafNode(this_EOL_1, grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_1());
            		
            // InternalSheepDog.g:965:3: ( (lv_lines_2_0= ruleLine ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==EOF||(LA17_0>=RULE_EOL && LA17_0<=RULE_STRING)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSheepDog.g:966:4: (lv_lines_2_0= ruleLine )
            	    {
            	    // InternalSheepDog.g:966:4: (lv_lines_2_0= ruleLine )
            	    // InternalSheepDog.g:967:5: lv_lines_2_0= ruleLine
            	    {

            	    					newCompositeNode(grammarAccess.getDocStringAccess().getLinesLineParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_lines_2_0=ruleLine();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDocStringRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lines",
            	    						lv_lines_2_0,
            	    						"org.farhan.mbt.SheepDog.Line");
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

            otherlv_3=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getDocStringAccess().getHyphenMinusHyphenMinusHyphenMinusHyphenMinusKeyword_3());
            		
            this_EOL_4=(Token)match(input,RULE_EOL,FOLLOW_2); 

            			newLeafNode(this_EOL_4, grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_4());
            		

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


    // $ANTLR start "entryRuleLine"
    // InternalSheepDog.g:996:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // InternalSheepDog.g:996:45: (iv_ruleLine= ruleLine EOF )
            // InternalSheepDog.g:997:2: iv_ruleLine= ruleLine EOF
            {
             newCompositeNode(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLine=ruleLine();

            state._fsp--;

             current =iv_ruleLine; 
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
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // InternalSheepDog.g:1003:1: ruleLine returns [EObject current=null] : ( ( (lv_name_0_0= ruleLineBits ) ) this_EOL_1= RULE_EOL ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        Token this_EOL_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1009:2: ( ( ( (lv_name_0_0= ruleLineBits ) ) this_EOL_1= RULE_EOL ) )
            // InternalSheepDog.g:1010:2: ( ( (lv_name_0_0= ruleLineBits ) ) this_EOL_1= RULE_EOL )
            {
            // InternalSheepDog.g:1010:2: ( ( (lv_name_0_0= ruleLineBits ) ) this_EOL_1= RULE_EOL )
            // InternalSheepDog.g:1011:3: ( (lv_name_0_0= ruleLineBits ) ) this_EOL_1= RULE_EOL
            {
            // InternalSheepDog.g:1011:3: ( (lv_name_0_0= ruleLineBits ) )
            // InternalSheepDog.g:1012:4: (lv_name_0_0= ruleLineBits )
            {
            // InternalSheepDog.g:1012:4: (lv_name_0_0= ruleLineBits )
            // InternalSheepDog.g:1013:5: lv_name_0_0= ruleLineBits
            {

            					newCompositeNode(grammarAccess.getLineAccess().getNameLineBitsParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_0_0=ruleLineBits();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLineRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.farhan.mbt.SheepDog.LineBits");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_2); 

            			newLeafNode(this_EOL_1, grammarAccess.getLineAccess().getEOLTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleLine"


    // $ANTLR start "entryRuleLineBits"
    // InternalSheepDog.g:1038:1: entryRuleLineBits returns [String current=null] : iv_ruleLineBits= ruleLineBits EOF ;
    public final String entryRuleLineBits() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLineBits = null;


        try {
            // InternalSheepDog.g:1038:48: (iv_ruleLineBits= ruleLineBits EOF )
            // InternalSheepDog.g:1039:2: iv_ruleLineBits= ruleLineBits EOF
            {
             newCompositeNode(grammarAccess.getLineBitsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLineBits=ruleLineBits();

            state._fsp--;

             current =iv_ruleLineBits.getText(); 
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
    // $ANTLR end "entryRuleLineBits"


    // $ANTLR start "ruleLineBits"
    // InternalSheepDog.g:1045:1: ruleLineBits returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )* ;
    public final AntlrDatatypeRuleToken ruleLineBits() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TEXT_LITERAL_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1051:2: ( (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )* )
            // InternalSheepDog.g:1052:2: (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )*
            {
            // InternalSheepDog.g:1052:2: (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_WORD && LA18_0<=RULE_STRING)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSheepDog.g:1053:3: this_TEXT_LITERAL_0= ruleTEXT_LITERAL
            	    {

            	    			newCompositeNode(grammarAccess.getLineBitsAccess().getTEXT_LITERALParserRuleCall());
            	    		
            	    pushFollow(FOLLOW_22);
            	    this_TEXT_LITERAL_0=ruleTEXT_LITERAL();

            	    state._fsp--;


            	    			current.merge(this_TEXT_LITERAL_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;

            	default :
            	    break loop18;
                }
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
    // $ANTLR end "ruleLineBits"


    // $ANTLR start "entryRuleTable"
    // InternalSheepDog.g:1067:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalSheepDog.g:1067:46: (iv_ruleTable= ruleTable EOF )
            // InternalSheepDog.g:1068:2: iv_ruleTable= ruleTable EOF
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
    // InternalSheepDog.g:1074:1: ruleTable returns [EObject current=null] : (otherlv_0= '[options=\"header\"]' this_EOL_1= RULE_EOL otherlv_2= '|===' this_EOL_3= RULE_EOL ( (lv_rows_4_0= ruleRow ) )+ otherlv_5= '|===' this_EOL_6= RULE_EOL ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EOL_1=null;
        Token otherlv_2=null;
        Token this_EOL_3=null;
        Token otherlv_5=null;
        Token this_EOL_6=null;
        EObject lv_rows_4_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1080:2: ( (otherlv_0= '[options=\"header\"]' this_EOL_1= RULE_EOL otherlv_2= '|===' this_EOL_3= RULE_EOL ( (lv_rows_4_0= ruleRow ) )+ otherlv_5= '|===' this_EOL_6= RULE_EOL ) )
            // InternalSheepDog.g:1081:2: (otherlv_0= '[options=\"header\"]' this_EOL_1= RULE_EOL otherlv_2= '|===' this_EOL_3= RULE_EOL ( (lv_rows_4_0= ruleRow ) )+ otherlv_5= '|===' this_EOL_6= RULE_EOL )
            {
            // InternalSheepDog.g:1081:2: (otherlv_0= '[options=\"header\"]' this_EOL_1= RULE_EOL otherlv_2= '|===' this_EOL_3= RULE_EOL ( (lv_rows_4_0= ruleRow ) )+ otherlv_5= '|===' this_EOL_6= RULE_EOL )
            // InternalSheepDog.g:1082:3: otherlv_0= '[options=\"header\"]' this_EOL_1= RULE_EOL otherlv_2= '|===' this_EOL_3= RULE_EOL ( (lv_rows_4_0= ruleRow ) )+ otherlv_5= '|===' this_EOL_6= RULE_EOL
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getOptionsHeaderKeyword_0());
            		
            this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_23); 

            			newLeafNode(this_EOL_1, grammarAccess.getTableAccess().getEOLTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTableAccess().getVerticalLineEqualsSignEqualsSignEqualsSignKeyword_2());
            		
            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_24); 

            			newLeafNode(this_EOL_3, grammarAccess.getTableAccess().getEOLTerminalRuleCall_3());
            		
            // InternalSheepDog.g:1098:3: ( (lv_rows_4_0= ruleRow ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==24) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSheepDog.g:1099:4: (lv_rows_4_0= ruleRow )
            	    {
            	    // InternalSheepDog.g:1099:4: (lv_rows_4_0= ruleRow )
            	    // InternalSheepDog.g:1100:5: lv_rows_4_0= ruleRow
            	    {

            	    					newCompositeNode(grammarAccess.getTableAccess().getRowsRowParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_rows_4_0=ruleRow();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTableRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rows",
            	    						lv_rows_4_0,
            	    						"org.farhan.mbt.SheepDog.Row");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            otherlv_5=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getTableAccess().getVerticalLineEqualsSignEqualsSignEqualsSignKeyword_5());
            		
            this_EOL_6=(Token)match(input,RULE_EOL,FOLLOW_2); 

            			newLeafNode(this_EOL_6, grammarAccess.getTableAccess().getEOLTerminalRuleCall_6());
            		

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
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleRow"
    // InternalSheepDog.g:1129:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // InternalSheepDog.g:1129:44: (iv_ruleRow= ruleRow EOF )
            // InternalSheepDog.g:1130:2: iv_ruleRow= ruleRow EOF
            {
             newCompositeNode(grammarAccess.getRowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRow=ruleRow();

            state._fsp--;

             current =iv_ruleRow; 
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
    // $ANTLR end "entryRuleRow"


    // $ANTLR start "ruleRow"
    // InternalSheepDog.g:1136:1: ruleRow returns [EObject current=null] : ( ( (lv_cells_0_0= ruleCell ) )+ this_EOL_1= RULE_EOL ) ;
    public final EObject ruleRow() throws RecognitionException {
        EObject current = null;

        Token this_EOL_1=null;
        EObject lv_cells_0_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1142:2: ( ( ( (lv_cells_0_0= ruleCell ) )+ this_EOL_1= RULE_EOL ) )
            // InternalSheepDog.g:1143:2: ( ( (lv_cells_0_0= ruleCell ) )+ this_EOL_1= RULE_EOL )
            {
            // InternalSheepDog.g:1143:2: ( ( (lv_cells_0_0= ruleCell ) )+ this_EOL_1= RULE_EOL )
            // InternalSheepDog.g:1144:3: ( (lv_cells_0_0= ruleCell ) )+ this_EOL_1= RULE_EOL
            {
            // InternalSheepDog.g:1144:3: ( (lv_cells_0_0= ruleCell ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==24) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSheepDog.g:1145:4: (lv_cells_0_0= ruleCell )
            	    {
            	    // InternalSheepDog.g:1145:4: (lv_cells_0_0= ruleCell )
            	    // InternalSheepDog.g:1146:5: lv_cells_0_0= ruleCell
            	    {

            	    					newCompositeNode(grammarAccess.getRowAccess().getCellsCellParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_cells_0_0=ruleCell();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRowRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cells",
            	    						lv_cells_0_0,
            	    						"org.farhan.mbt.SheepDog.Cell");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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

            this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_2); 

            			newLeafNode(this_EOL_1, grammarAccess.getRowAccess().getEOLTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleRow"


    // $ANTLR start "entryRuleCell"
    // InternalSheepDog.g:1171:1: entryRuleCell returns [EObject current=null] : iv_ruleCell= ruleCell EOF ;
    public final EObject entryRuleCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCell = null;


        try {
            // InternalSheepDog.g:1171:45: (iv_ruleCell= ruleCell EOF )
            // InternalSheepDog.g:1172:2: iv_ruleCell= ruleCell EOF
            {
             newCompositeNode(grammarAccess.getCellRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCell=ruleCell();

            state._fsp--;

             current =iv_ruleCell; 
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
    // $ANTLR end "entryRuleCell"


    // $ANTLR start "ruleCell"
    // InternalSheepDog.g:1178:1: ruleCell returns [EObject current=null] : (otherlv_0= '|' ( (lv_name_1_0= rulePhrase ) ) ) ;
    public final EObject ruleCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1184:2: ( (otherlv_0= '|' ( (lv_name_1_0= rulePhrase ) ) ) )
            // InternalSheepDog.g:1185:2: (otherlv_0= '|' ( (lv_name_1_0= rulePhrase ) ) )
            {
            // InternalSheepDog.g:1185:2: (otherlv_0= '|' ( (lv_name_1_0= rulePhrase ) ) )
            // InternalSheepDog.g:1186:3: otherlv_0= '|' ( (lv_name_1_0= rulePhrase ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCellAccess().getVerticalLineKeyword_0());
            		
            // InternalSheepDog.g:1190:3: ( (lv_name_1_0= rulePhrase ) )
            // InternalSheepDog.g:1191:4: (lv_name_1_0= rulePhrase )
            {
            // InternalSheepDog.g:1191:4: (lv_name_1_0= rulePhrase )
            // InternalSheepDog.g:1192:5: lv_name_1_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getCellAccess().getNamePhraseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCellRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.farhan.mbt.SheepDog.Phrase");
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
    // $ANTLR end "ruleCell"


    // $ANTLR start "entryRuleStatement"
    // InternalSheepDog.g:1213:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalSheepDog.g:1213:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalSheepDog.g:1214:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalSheepDog.g:1220:1: ruleStatement returns [EObject current=null] : ( ( (lv_name_0_0= rulePhrase ) ) this_EOL_1= RULE_EOL ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token this_EOL_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1226:2: ( ( ( (lv_name_0_0= rulePhrase ) ) this_EOL_1= RULE_EOL ) )
            // InternalSheepDog.g:1227:2: ( ( (lv_name_0_0= rulePhrase ) ) this_EOL_1= RULE_EOL )
            {
            // InternalSheepDog.g:1227:2: ( ( (lv_name_0_0= rulePhrase ) ) this_EOL_1= RULE_EOL )
            // InternalSheepDog.g:1228:3: ( (lv_name_0_0= rulePhrase ) ) this_EOL_1= RULE_EOL
            {
            // InternalSheepDog.g:1228:3: ( (lv_name_0_0= rulePhrase ) )
            // InternalSheepDog.g:1229:4: (lv_name_0_0= rulePhrase )
            {
            // InternalSheepDog.g:1229:4: (lv_name_0_0= rulePhrase )
            // InternalSheepDog.g:1230:5: lv_name_0_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getStatementAccess().getNamePhraseParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_0_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.farhan.mbt.SheepDog.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_2); 

            			newLeafNode(this_EOL_1, grammarAccess.getStatementAccess().getEOLTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRulePhrase"
    // InternalSheepDog.g:1255:1: entryRulePhrase returns [String current=null] : iv_rulePhrase= rulePhrase EOF ;
    public final String entryRulePhrase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePhrase = null;


        try {
            // InternalSheepDog.g:1255:46: (iv_rulePhrase= rulePhrase EOF )
            // InternalSheepDog.g:1256:2: iv_rulePhrase= rulePhrase EOF
            {
             newCompositeNode(grammarAccess.getPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhrase=rulePhrase();

            state._fsp--;

             current =iv_rulePhrase.getText(); 
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
    // $ANTLR end "entryRulePhrase"


    // $ANTLR start "rulePhrase"
    // InternalSheepDog.g:1262:1: rulePhrase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )+ ;
    public final AntlrDatatypeRuleToken rulePhrase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TEXT_LITERAL_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1268:2: ( (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )+ )
            // InternalSheepDog.g:1269:2: (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )+
            {
            // InternalSheepDog.g:1269:2: (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_WORD && LA21_0<=RULE_STRING)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSheepDog.g:1270:3: this_TEXT_LITERAL_0= ruleTEXT_LITERAL
            	    {

            	    			newCompositeNode(grammarAccess.getPhraseAccess().getTEXT_LITERALParserRuleCall());
            	    		
            	    pushFollow(FOLLOW_22);
            	    this_TEXT_LITERAL_0=ruleTEXT_LITERAL();

            	    state._fsp--;


            	    			current.merge(this_TEXT_LITERAL_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
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
    // $ANTLR end "rulePhrase"


    // $ANTLR start "entryRuleTEXT_LITERAL"
    // InternalSheepDog.g:1284:1: entryRuleTEXT_LITERAL returns [String current=null] : iv_ruleTEXT_LITERAL= ruleTEXT_LITERAL EOF ;
    public final String entryRuleTEXT_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTEXT_LITERAL = null;


        try {
            // InternalSheepDog.g:1284:52: (iv_ruleTEXT_LITERAL= ruleTEXT_LITERAL EOF )
            // InternalSheepDog.g:1285:2: iv_ruleTEXT_LITERAL= ruleTEXT_LITERAL EOF
            {
             newCompositeNode(grammarAccess.getTEXT_LITERALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTEXT_LITERAL=ruleTEXT_LITERAL();

            state._fsp--;

             current =iv_ruleTEXT_LITERAL.getText(); 
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
    // $ANTLR end "entryRuleTEXT_LITERAL"


    // $ANTLR start "ruleTEXT_LITERAL"
    // InternalSheepDog.g:1291:1: ruleTEXT_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WORD_0= RULE_WORD | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleTEXT_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;
        Token this_ID_1=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            // InternalSheepDog.g:1297:2: ( (this_WORD_0= RULE_WORD | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING ) )
            // InternalSheepDog.g:1298:2: (this_WORD_0= RULE_WORD | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING )
            {
            // InternalSheepDog.g:1298:2: (this_WORD_0= RULE_WORD | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING )
            int alt22=3;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                alt22=1;
                }
                break;
            case RULE_ID:
                {
                alt22=2;
                }
                break;
            case RULE_STRING:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalSheepDog.g:1299:3: this_WORD_0= RULE_WORD
                    {
                    this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_2); 

                    			current.merge(this_WORD_0);
                    		

                    			newLeafNode(this_WORD_0, grammarAccess.getTEXT_LITERALAccess().getWORDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSheepDog.g:1307:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getTEXT_LITERALAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSheepDog.g:1315:3: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_2);
                    		

                    			newLeafNode(this_STRING_2, grammarAccess.getTEXT_LITERALAccess().getSTRINGTerminalRuleCall_2());
                    		

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
    // $ANTLR end "ruleTEXT_LITERAL"


    // $ANTLR start "entryRuleStepObject"
    // InternalSheepDog.g:1326:1: entryRuleStepObject returns [EObject current=null] : iv_ruleStepObject= ruleStepObject EOF ;
    public final EObject entryRuleStepObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStepObject = null;


        try {
            // InternalSheepDog.g:1326:51: (iv_ruleStepObject= ruleStepObject EOF )
            // InternalSheepDog.g:1327:2: iv_ruleStepObject= ruleStepObject EOF
            {
             newCompositeNode(grammarAccess.getStepObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStepObject=ruleStepObject();

            state._fsp--;

             current =iv_ruleStepObject; 
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
    // $ANTLR end "entryRuleStepObject"


    // $ANTLR start "ruleStepObject"
    // InternalSheepDog.g:1333:1: ruleStepObject returns [EObject current=null] : (otherlv_0= '=' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_stepDefinitions_4_0= ruleStepDefinition ) )* ) ;
    public final EObject ruleStepObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EOL_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_statements_3_0 = null;

        EObject lv_stepDefinitions_4_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1339:2: ( (otherlv_0= '=' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_stepDefinitions_4_0= ruleStepDefinition ) )* ) )
            // InternalSheepDog.g:1340:2: (otherlv_0= '=' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_stepDefinitions_4_0= ruleStepDefinition ) )* )
            {
            // InternalSheepDog.g:1340:2: (otherlv_0= '=' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_stepDefinitions_4_0= ruleStepDefinition ) )* )
            // InternalSheepDog.g:1341:3: otherlv_0= '=' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_stepDefinitions_4_0= ruleStepDefinition ) )*
            {
            otherlv_0=(Token)match(input,10,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStepObjectAccess().getEqualsSignKeyword_0());
            		
            // InternalSheepDog.g:1345:3: ( (lv_name_1_0= rulePhrase ) )
            // InternalSheepDog.g:1346:4: (lv_name_1_0= rulePhrase )
            {
            // InternalSheepDog.g:1346:4: (lv_name_1_0= rulePhrase )
            // InternalSheepDog.g:1347:5: lv_name_1_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getStepObjectAccess().getNamePhraseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStepObjectRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.farhan.mbt.SheepDog.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_27); 

            			newLeafNode(this_EOL_2, grammarAccess.getStepObjectAccess().getEOLTerminalRuleCall_2());
            		
            // InternalSheepDog.g:1368:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_WORD && LA23_0<=RULE_STRING)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSheepDog.g:1369:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalSheepDog.g:1369:4: (lv_statements_3_0= ruleStatement )
            	    // InternalSheepDog.g:1370:5: lv_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getStepObjectAccess().getStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStepObjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_3_0,
            	    						"org.farhan.mbt.SheepDog.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // InternalSheepDog.g:1387:3: ( (lv_stepDefinitions_4_0= ruleStepDefinition ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==12) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSheepDog.g:1388:4: (lv_stepDefinitions_4_0= ruleStepDefinition )
            	    {
            	    // InternalSheepDog.g:1388:4: (lv_stepDefinitions_4_0= ruleStepDefinition )
            	    // InternalSheepDog.g:1389:5: lv_stepDefinitions_4_0= ruleStepDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getStepObjectAccess().getStepDefinitionsStepDefinitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_stepDefinitions_4_0=ruleStepDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStepObjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"stepDefinitions",
            	    						lv_stepDefinitions_4_0,
            	    						"org.farhan.mbt.SheepDog.StepDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // $ANTLR end "ruleStepObject"


    // $ANTLR start "entryRuleStepDefinition"
    // InternalSheepDog.g:1410:1: entryRuleStepDefinition returns [EObject current=null] : iv_ruleStepDefinition= ruleStepDefinition EOF ;
    public final EObject entryRuleStepDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStepDefinition = null;


        try {
            // InternalSheepDog.g:1410:55: (iv_ruleStepDefinition= ruleStepDefinition EOF )
            // InternalSheepDog.g:1411:2: iv_ruleStepDefinition= ruleStepDefinition EOF
            {
             newCompositeNode(grammarAccess.getStepDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStepDefinition=ruleStepDefinition();

            state._fsp--;

             current =iv_ruleStepDefinition; 
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
    // $ANTLR end "entryRuleStepDefinition"


    // $ANTLR start "ruleStepDefinition"
    // InternalSheepDog.g:1417:1: ruleStepDefinition returns [EObject current=null] : (otherlv_0= '==' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_stepParameters_4_0= ruleStepParameters ) )* ) ;
    public final EObject ruleStepDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EOL_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_statements_3_0 = null;

        EObject lv_stepParameters_4_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1423:2: ( (otherlv_0= '==' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_stepParameters_4_0= ruleStepParameters ) )* ) )
            // InternalSheepDog.g:1424:2: (otherlv_0= '==' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_stepParameters_4_0= ruleStepParameters ) )* )
            {
            // InternalSheepDog.g:1424:2: (otherlv_0= '==' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_stepParameters_4_0= ruleStepParameters ) )* )
            // InternalSheepDog.g:1425:3: otherlv_0= '==' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_stepParameters_4_0= ruleStepParameters ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStepDefinitionAccess().getEqualsSignEqualsSignKeyword_0());
            		
            // InternalSheepDog.g:1429:3: ( (lv_name_1_0= rulePhrase ) )
            // InternalSheepDog.g:1430:4: (lv_name_1_0= rulePhrase )
            {
            // InternalSheepDog.g:1430:4: (lv_name_1_0= rulePhrase )
            // InternalSheepDog.g:1431:5: lv_name_1_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getStepDefinitionAccess().getNamePhraseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStepDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.farhan.mbt.SheepDog.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_9); 

            			newLeafNode(this_EOL_2, grammarAccess.getStepDefinitionAccess().getEOLTerminalRuleCall_2());
            		
            // InternalSheepDog.g:1452:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_WORD && LA25_0<=RULE_STRING)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSheepDog.g:1453:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalSheepDog.g:1453:4: (lv_statements_3_0= ruleStatement )
            	    // InternalSheepDog.g:1454:5: lv_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getStepDefinitionAccess().getStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStepDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_3_0,
            	    						"org.farhan.mbt.SheepDog.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // InternalSheepDog.g:1471:3: ( (lv_stepParameters_4_0= ruleStepParameters ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==14) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSheepDog.g:1472:4: (lv_stepParameters_4_0= ruleStepParameters )
            	    {
            	    // InternalSheepDog.g:1472:4: (lv_stepParameters_4_0= ruleStepParameters )
            	    // InternalSheepDog.g:1473:5: lv_stepParameters_4_0= ruleStepParameters
            	    {

            	    					newCompositeNode(grammarAccess.getStepDefinitionAccess().getStepParametersStepParametersParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_stepParameters_4_0=ruleStepParameters();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStepDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"stepParameters",
            	    						lv_stepParameters_4_0,
            	    						"org.farhan.mbt.SheepDog.StepParameters");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // $ANTLR end "ruleStepDefinition"


    // $ANTLR start "entryRuleStepParameters"
    // InternalSheepDog.g:1494:1: entryRuleStepParameters returns [EObject current=null] : iv_ruleStepParameters= ruleStepParameters EOF ;
    public final EObject entryRuleStepParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStepParameters = null;


        try {
            // InternalSheepDog.g:1494:55: (iv_ruleStepParameters= ruleStepParameters EOF )
            // InternalSheepDog.g:1495:2: iv_ruleStepParameters= ruleStepParameters EOF
            {
             newCompositeNode(grammarAccess.getStepParametersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStepParameters=ruleStepParameters();

            state._fsp--;

             current =iv_ruleStepParameters; 
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
    // $ANTLR end "entryRuleStepParameters"


    // $ANTLR start "ruleStepParameters"
    // InternalSheepDog.g:1501:1: ruleStepParameters returns [EObject current=null] : (otherlv_0= '===' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_parametersTable_4_0= ruleTable ) ) ) ;
    public final EObject ruleStepParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EOL_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_statements_3_0 = null;

        EObject lv_parametersTable_4_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1507:2: ( (otherlv_0= '===' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_parametersTable_4_0= ruleTable ) ) ) )
            // InternalSheepDog.g:1508:2: (otherlv_0= '===' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_parametersTable_4_0= ruleTable ) ) )
            {
            // InternalSheepDog.g:1508:2: (otherlv_0= '===' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_parametersTable_4_0= ruleTable ) ) )
            // InternalSheepDog.g:1509:3: otherlv_0= '===' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_parametersTable_4_0= ruleTable ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStepParametersAccess().getEqualsSignEqualsSignEqualsSignKeyword_0());
            		
            // InternalSheepDog.g:1513:3: ( (lv_name_1_0= rulePhrase ) )
            // InternalSheepDog.g:1514:4: (lv_name_1_0= rulePhrase )
            {
            // InternalSheepDog.g:1514:4: (lv_name_1_0= rulePhrase )
            // InternalSheepDog.g:1515:5: lv_name_1_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getStepParametersAccess().getNamePhraseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStepParametersRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.farhan.mbt.SheepDog.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_14); 

            			newLeafNode(this_EOL_2, grammarAccess.getStepParametersAccess().getEOLTerminalRuleCall_2());
            		
            // InternalSheepDog.g:1536:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_WORD && LA27_0<=RULE_STRING)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSheepDog.g:1537:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalSheepDog.g:1537:4: (lv_statements_3_0= ruleStatement )
            	    // InternalSheepDog.g:1538:5: lv_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getStepParametersAccess().getStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStepParametersRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_3_0,
            	    						"org.farhan.mbt.SheepDog.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // InternalSheepDog.g:1555:3: ( (lv_parametersTable_4_0= ruleTable ) )
            // InternalSheepDog.g:1556:4: (lv_parametersTable_4_0= ruleTable )
            {
            // InternalSheepDog.g:1556:4: (lv_parametersTable_4_0= ruleTable )
            // InternalSheepDog.g:1557:5: lv_parametersTable_4_0= ruleTable
            {

            					newCompositeNode(grammarAccess.getStepParametersAccess().getParametersTableTableParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_parametersTable_4_0=ruleTable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStepParametersRule());
            					}
            					set(
            						current,
            						"parametersTable",
            						lv_parametersTable_4_0,
            						"org.farhan.mbt.SheepDog.Table");
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
    // $ANTLR end "ruleStepParameters"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\1\12\1\5\1\uffff\3\4\1\uffff";
    static final String dfa_3s = "\1\21\1\7\1\uffff\3\7\1\uffff";
    static final String dfa_4s = "\2\uffff\1\2\3\uffff\1\1";
    static final String dfa_5s = "\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\6\uffff\1\2",
            "\1\3\1\4\1\5",
            "",
            "\1\6\1\3\1\4\1\5",
            "\1\6\1\3\1\4\1\5",
            "\1\6\1\3\1\4\1\5",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "78:2: (this_StepObject_0= ruleStepObject | this_Feature_1= ruleFeature )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000098E2L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000009002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000040E2L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000060E0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000060E2L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000004000E0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000006000E2L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000002000F0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000000010E2L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000001002L});

}
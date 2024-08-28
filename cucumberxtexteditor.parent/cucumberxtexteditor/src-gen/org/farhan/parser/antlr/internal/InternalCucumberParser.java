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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_ID", "RULE_WORD", "RULE_STRING", "RULE_WS", "RULE_SL_COMMENT", "'Feature:'", "'Background:'", "'Scenario:'", "'Scenario Outline:'", "'Examples:'", "'|'", "'Given'", "'When'", "'Then'", "'And'", "'*'", "'\"\"\"'", "'@'"
    };
    public static final int RULE_WORD=6;
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
    public static final int RULE_ID=5;
    public static final int RULE_EOL=4;
    public static final int RULE_WS=8;
    public static final int T__22=22;
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
    // InternalCucumber.g:71:1: ruleFeature returns [EObject current=null] : ( ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Feature:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_abstractScenarios_6_0= ruleAbstractScenario ) )* ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token this_EOL_1=null;
        Token otherlv_2=null;
        Token this_EOL_4=null;
        EObject lv_tags_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_statements_5_0 = null;

        EObject lv_abstractScenarios_6_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:77:2: ( ( ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Feature:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_abstractScenarios_6_0= ruleAbstractScenario ) )* ) )
            // InternalCucumber.g:78:2: ( ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Feature:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_abstractScenarios_6_0= ruleAbstractScenario ) )* )
            {
            // InternalCucumber.g:78:2: ( ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Feature:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_abstractScenarios_6_0= ruleAbstractScenario ) )* )
            // InternalCucumber.g:79:3: ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Feature:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_abstractScenarios_6_0= ruleAbstractScenario ) )*
            {
            // InternalCucumber.g:79:3: ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCucumber.g:80:4: ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL
                    {
                    // InternalCucumber.g:80:4: ( (lv_tags_0_0= ruleTag ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==22) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalCucumber.g:81:5: (lv_tags_0_0= ruleTag )
                    	    {
                    	    // InternalCucumber.g:81:5: (lv_tags_0_0= ruleTag )
                    	    // InternalCucumber.g:82:6: lv_tags_0_0= ruleTag
                    	    {

                    	    						newCompositeNode(grammarAccess.getFeatureAccess().getTagsTagParserRuleCall_0_0_0());
                    	    					
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

            otherlv_2=(Token)match(input,10,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getFeatureKeyword_1());
            		
            // InternalCucumber.g:108:3: ( (lv_name_3_0= rulePhrase ) )
            // InternalCucumber.g:109:4: (lv_name_3_0= rulePhrase )
            {
            // InternalCucumber.g:109:4: (lv_name_3_0= rulePhrase )
            // InternalCucumber.g:110:5: lv_name_3_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getNamePhraseParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_3_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.farhan.Cucumber.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_4=(Token)match(input,RULE_EOL,FOLLOW_7); 

            			newLeafNode(this_EOL_4, grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_3());
            		
            // InternalCucumber.g:131:3: ( (lv_statements_5_0= ruleStatement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_STRING)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCucumber.g:132:4: (lv_statements_5_0= ruleStatement )
            	    {
            	    // InternalCucumber.g:132:4: (lv_statements_5_0= ruleStatement )
            	    // InternalCucumber.g:133:5: lv_statements_5_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureAccess().getStatementsStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_statements_5_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_5_0,
            	    						"org.farhan.Cucumber.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalCucumber.g:150:3: ( (lv_abstractScenarios_6_0= ruleAbstractScenario ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=11 && LA4_0<=13)||LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCucumber.g:151:4: (lv_abstractScenarios_6_0= ruleAbstractScenario )
            	    {
            	    // InternalCucumber.g:151:4: (lv_abstractScenarios_6_0= ruleAbstractScenario )
            	    // InternalCucumber.g:152:5: lv_abstractScenarios_6_0= ruleAbstractScenario
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureAccess().getAbstractScenariosAbstractScenarioParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_abstractScenarios_6_0=ruleAbstractScenario();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"abstractScenarios",
            	    						lv_abstractScenarios_6_0,
            	    						"org.farhan.Cucumber.AbstractScenario");
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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleAbstractScenario"
    // InternalCucumber.g:173:1: entryRuleAbstractScenario returns [EObject current=null] : iv_ruleAbstractScenario= ruleAbstractScenario EOF ;
    public final EObject entryRuleAbstractScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractScenario = null;


        try {
            // InternalCucumber.g:173:57: (iv_ruleAbstractScenario= ruleAbstractScenario EOF )
            // InternalCucumber.g:174:2: iv_ruleAbstractScenario= ruleAbstractScenario EOF
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
    // InternalCucumber.g:180:1: ruleAbstractScenario returns [EObject current=null] : (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario | this_ScenarioOutline_2= ruleScenarioOutline ) ;
    public final EObject ruleAbstractScenario() throws RecognitionException {
        EObject current = null;

        EObject this_Background_0 = null;

        EObject this_Scenario_1 = null;

        EObject this_ScenarioOutline_2 = null;



        	enterRule();

        try {
            // InternalCucumber.g:186:2: ( (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario | this_ScenarioOutline_2= ruleScenarioOutline ) )
            // InternalCucumber.g:187:2: (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario | this_ScenarioOutline_2= ruleScenarioOutline )
            {
            // InternalCucumber.g:187:2: (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario | this_ScenarioOutline_2= ruleScenarioOutline )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalCucumber.g:188:3: this_Background_0= ruleBackground
                    {

                    			newCompositeNode(grammarAccess.getAbstractScenarioAccess().getBackgroundParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Background_0=ruleBackground();

                    state._fsp--;


                    			current = this_Background_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCucumber.g:197:3: this_Scenario_1= ruleScenario
                    {

                    			newCompositeNode(grammarAccess.getAbstractScenarioAccess().getScenarioParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Scenario_1=ruleScenario();

                    state._fsp--;


                    			current = this_Scenario_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCucumber.g:206:3: this_ScenarioOutline_2= ruleScenarioOutline
                    {

                    			newCompositeNode(grammarAccess.getAbstractScenarioAccess().getScenarioOutlineParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScenarioOutline_2=ruleScenarioOutline();

                    state._fsp--;


                    			current = this_ScenarioOutline_2;
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


    // $ANTLR start "entryRuleBackground"
    // InternalCucumber.g:218:1: entryRuleBackground returns [EObject current=null] : iv_ruleBackground= ruleBackground EOF ;
    public final EObject entryRuleBackground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackground = null;


        try {
            // InternalCucumber.g:218:51: (iv_ruleBackground= ruleBackground EOF )
            // InternalCucumber.g:219:2: iv_ruleBackground= ruleBackground EOF
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
    // InternalCucumber.g:225:1: ruleBackground returns [EObject current=null] : (otherlv_0= 'Background:' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_steps_4_0= ruleStep ) )* ) ;
    public final EObject ruleBackground() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EOL_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_statements_3_0 = null;

        EObject lv_steps_4_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:231:2: ( (otherlv_0= 'Background:' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_steps_4_0= ruleStep ) )* ) )
            // InternalCucumber.g:232:2: (otherlv_0= 'Background:' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_steps_4_0= ruleStep ) )* )
            {
            // InternalCucumber.g:232:2: (otherlv_0= 'Background:' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_steps_4_0= ruleStep ) )* )
            // InternalCucumber.g:233:3: otherlv_0= 'Background:' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_steps_4_0= ruleStep ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBackgroundAccess().getBackgroundKeyword_0());
            		
            // InternalCucumber.g:237:3: ( (lv_name_1_0= rulePhrase ) )
            // InternalCucumber.g:238:4: (lv_name_1_0= rulePhrase )
            {
            // InternalCucumber.g:238:4: (lv_name_1_0= rulePhrase )
            // InternalCucumber.g:239:5: lv_name_1_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getBackgroundAccess().getNamePhraseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBackgroundRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.farhan.Cucumber.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_9); 

            			newLeafNode(this_EOL_2, grammarAccess.getBackgroundAccess().getEOLTerminalRuleCall_2());
            		
            // InternalCucumber.g:260:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_STRING)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCucumber.g:261:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalCucumber.g:261:4: (lv_statements_3_0= ruleStatement )
            	    // InternalCucumber.g:262:5: lv_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getBackgroundAccess().getStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBackgroundRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_3_0,
            	    						"org.farhan.Cucumber.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalCucumber.g:279:3: ( (lv_steps_4_0= ruleStep ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=16 && LA7_0<=20)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCucumber.g:280:4: (lv_steps_4_0= ruleStep )
            	    {
            	    // InternalCucumber.g:280:4: (lv_steps_4_0= ruleStep )
            	    // InternalCucumber.g:281:5: lv_steps_4_0= ruleStep
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
    // InternalCucumber.g:302:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalCucumber.g:302:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalCucumber.g:303:2: iv_ruleScenario= ruleScenario EOF
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
    // InternalCucumber.g:309:1: ruleScenario returns [EObject current=null] : ( ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Scenario:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token this_EOL_1=null;
        Token otherlv_2=null;
        Token this_EOL_4=null;
        EObject lv_tags_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_statements_5_0 = null;

        EObject lv_steps_6_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:315:2: ( ( ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Scenario:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* ) )
            // InternalCucumber.g:316:2: ( ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Scenario:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* )
            {
            // InternalCucumber.g:316:2: ( ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Scenario:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* )
            // InternalCucumber.g:317:3: ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Scenario:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )*
            {
            // InternalCucumber.g:317:3: ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCucumber.g:318:4: ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL
                    {
                    // InternalCucumber.g:318:4: ( (lv_tags_0_0= ruleTag ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==22) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalCucumber.g:319:5: (lv_tags_0_0= ruleTag )
                    	    {
                    	    // InternalCucumber.g:319:5: (lv_tags_0_0= ruleTag )
                    	    // InternalCucumber.g:320:6: lv_tags_0_0= ruleTag
                    	    {

                    	    						newCompositeNode(grammarAccess.getScenarioAccess().getTagsTagParserRuleCall_0_0_0());
                    	    					
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
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_11); 

                    				newLeafNode(this_EOL_1, grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getScenarioKeyword_1());
            		
            // InternalCucumber.g:346:3: ( (lv_name_3_0= rulePhrase ) )
            // InternalCucumber.g:347:4: (lv_name_3_0= rulePhrase )
            {
            // InternalCucumber.g:347:4: (lv_name_3_0= rulePhrase )
            // InternalCucumber.g:348:5: lv_name_3_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getScenarioAccess().getNamePhraseParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_3_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.farhan.Cucumber.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_4=(Token)match(input,RULE_EOL,FOLLOW_9); 

            			newLeafNode(this_EOL_4, grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_3());
            		
            // InternalCucumber.g:369:3: ( (lv_statements_5_0= ruleStatement ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCucumber.g:370:4: (lv_statements_5_0= ruleStatement )
            	    {
            	    // InternalCucumber.g:370:4: (lv_statements_5_0= ruleStatement )
            	    // InternalCucumber.g:371:5: lv_statements_5_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getStatementsStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_statements_5_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_5_0,
            	    						"org.farhan.Cucumber.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalCucumber.g:388:3: ( (lv_steps_6_0= ruleStep ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=16 && LA11_0<=20)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCucumber.g:389:4: (lv_steps_6_0= ruleStep )
            	    {
            	    // InternalCucumber.g:389:4: (lv_steps_6_0= ruleStep )
            	    // InternalCucumber.g:390:5: lv_steps_6_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_10);
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
            	    break loop11;
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
    // InternalCucumber.g:411:1: entryRuleScenarioOutline returns [EObject current=null] : iv_ruleScenarioOutline= ruleScenarioOutline EOF ;
    public final EObject entryRuleScenarioOutline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenarioOutline = null;


        try {
            // InternalCucumber.g:411:56: (iv_ruleScenarioOutline= ruleScenarioOutline EOF )
            // InternalCucumber.g:412:2: iv_ruleScenarioOutline= ruleScenarioOutline EOF
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
    // InternalCucumber.g:418:1: ruleScenarioOutline returns [EObject current=null] : ( ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Scenario Outline:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* ( (lv_examples_7_0= ruleExamples ) )+ ) ;
    public final EObject ruleScenarioOutline() throws RecognitionException {
        EObject current = null;

        Token this_EOL_1=null;
        Token otherlv_2=null;
        Token this_EOL_4=null;
        EObject lv_tags_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_statements_5_0 = null;

        EObject lv_steps_6_0 = null;

        EObject lv_examples_7_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:424:2: ( ( ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Scenario Outline:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* ( (lv_examples_7_0= ruleExamples ) )+ ) )
            // InternalCucumber.g:425:2: ( ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Scenario Outline:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* ( (lv_examples_7_0= ruleExamples ) )+ )
            {
            // InternalCucumber.g:425:2: ( ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Scenario Outline:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* ( (lv_examples_7_0= ruleExamples ) )+ )
            // InternalCucumber.g:426:3: ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Scenario Outline:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* ( (lv_examples_7_0= ruleExamples ) )+
            {
            // InternalCucumber.g:426:3: ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCucumber.g:427:4: ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL
                    {
                    // InternalCucumber.g:427:4: ( (lv_tags_0_0= ruleTag ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==22) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalCucumber.g:428:5: (lv_tags_0_0= ruleTag )
                    	    {
                    	    // InternalCucumber.g:428:5: (lv_tags_0_0= ruleTag )
                    	    // InternalCucumber.g:429:6: lv_tags_0_0= ruleTag
                    	    {

                    	    						newCompositeNode(grammarAccess.getScenarioOutlineAccess().getTagsTagParserRuleCall_0_0_0());
                    	    					
                    	    pushFollow(FOLLOW_3);
                    	    lv_tags_0_0=ruleTag();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
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
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_12); 

                    				newLeafNode(this_EOL_1, grammarAccess.getScenarioOutlineAccess().getEOLTerminalRuleCall_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getScenarioOutlineAccess().getScenarioOutlineKeyword_1());
            		
            // InternalCucumber.g:455:3: ( (lv_name_3_0= rulePhrase ) )
            // InternalCucumber.g:456:4: (lv_name_3_0= rulePhrase )
            {
            // InternalCucumber.g:456:4: (lv_name_3_0= rulePhrase )
            // InternalCucumber.g:457:5: lv_name_3_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getNamePhraseParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_3_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.farhan.Cucumber.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_4=(Token)match(input,RULE_EOL,FOLLOW_13); 

            			newLeafNode(this_EOL_4, grammarAccess.getScenarioOutlineAccess().getEOLTerminalRuleCall_3());
            		
            // InternalCucumber.g:478:3: ( (lv_statements_5_0= ruleStatement ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_STRING)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCucumber.g:479:4: (lv_statements_5_0= ruleStatement )
            	    {
            	    // InternalCucumber.g:479:4: (lv_statements_5_0= ruleStatement )
            	    // InternalCucumber.g:480:5: lv_statements_5_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getStatementsStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_statements_5_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_5_0,
            	    						"org.farhan.Cucumber.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalCucumber.g:497:3: ( (lv_steps_6_0= ruleStep ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=16 && LA15_0<=20)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCucumber.g:498:4: (lv_steps_6_0= ruleStep )
            	    {
            	    // InternalCucumber.g:498:4: (lv_steps_6_0= ruleStep )
            	    // InternalCucumber.g:499:5: lv_steps_6_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getStepsStepParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_13);
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
            	    break loop15;
                }
            } while (true);

            // InternalCucumber.g:516:3: ( (lv_examples_7_0= ruleExamples ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // InternalCucumber.g:517:4: (lv_examples_7_0= ruleExamples )
            	    {
            	    // InternalCucumber.g:517:4: (lv_examples_7_0= ruleExamples )
            	    // InternalCucumber.g:518:5: lv_examples_7_0= ruleExamples
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getExamplesExamplesParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_examples_7_0=ruleExamples();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"examples",
            	    						lv_examples_7_0,
            	    						"org.farhan.Cucumber.Examples");
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


    // $ANTLR start "entryRuleExamples"
    // InternalCucumber.g:539:1: entryRuleExamples returns [EObject current=null] : iv_ruleExamples= ruleExamples EOF ;
    public final EObject entryRuleExamples() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExamples = null;


        try {
            // InternalCucumber.g:539:49: (iv_ruleExamples= ruleExamples EOF )
            // InternalCucumber.g:540:2: iv_ruleExamples= ruleExamples EOF
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
    // InternalCucumber.g:546:1: ruleExamples returns [EObject current=null] : ( ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Examples:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_theExamplesTable_6_0= ruleExamplesTable ) ) ) ;
    public final EObject ruleExamples() throws RecognitionException {
        EObject current = null;

        Token this_EOL_1=null;
        Token otherlv_2=null;
        Token this_EOL_4=null;
        EObject lv_tags_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_statements_5_0 = null;

        EObject lv_theExamplesTable_6_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:552:2: ( ( ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Examples:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_theExamplesTable_6_0= ruleExamplesTable ) ) ) )
            // InternalCucumber.g:553:2: ( ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Examples:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_theExamplesTable_6_0= ruleExamplesTable ) ) )
            {
            // InternalCucumber.g:553:2: ( ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Examples:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_theExamplesTable_6_0= ruleExamplesTable ) ) )
            // InternalCucumber.g:554:3: ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Examples:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_theExamplesTable_6_0= ruleExamplesTable ) )
            {
            // InternalCucumber.g:554:3: ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCucumber.g:555:4: ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL
                    {
                    // InternalCucumber.g:555:4: ( (lv_tags_0_0= ruleTag ) )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==22) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalCucumber.g:556:5: (lv_tags_0_0= ruleTag )
                    	    {
                    	    // InternalCucumber.g:556:5: (lv_tags_0_0= ruleTag )
                    	    // InternalCucumber.g:557:6: lv_tags_0_0= ruleTag
                    	    {

                    	    						newCompositeNode(grammarAccess.getExamplesAccess().getTagsTagParserRuleCall_0_0_0());
                    	    					
                    	    pushFollow(FOLLOW_3);
                    	    lv_tags_0_0=ruleTag();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getExamplesRule());
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
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_15); 

                    				newLeafNode(this_EOL_1, grammarAccess.getExamplesAccess().getEOLTerminalRuleCall_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getExamplesAccess().getExamplesKeyword_1());
            		
            // InternalCucumber.g:583:3: ( (lv_name_3_0= rulePhrase ) )
            // InternalCucumber.g:584:4: (lv_name_3_0= rulePhrase )
            {
            // InternalCucumber.g:584:4: (lv_name_3_0= rulePhrase )
            // InternalCucumber.g:585:5: lv_name_3_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getExamplesAccess().getNamePhraseParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_3_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExamplesRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.farhan.Cucumber.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_4=(Token)match(input,RULE_EOL,FOLLOW_16); 

            			newLeafNode(this_EOL_4, grammarAccess.getExamplesAccess().getEOLTerminalRuleCall_3());
            		
            // InternalCucumber.g:606:3: ( (lv_statements_5_0= ruleStatement ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_STRING)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCucumber.g:607:4: (lv_statements_5_0= ruleStatement )
            	    {
            	    // InternalCucumber.g:607:4: (lv_statements_5_0= ruleStatement )
            	    // InternalCucumber.g:608:5: lv_statements_5_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getExamplesAccess().getStatementsStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_statements_5_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExamplesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_5_0,
            	    						"org.farhan.Cucumber.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalCucumber.g:625:3: ( (lv_theExamplesTable_6_0= ruleExamplesTable ) )
            // InternalCucumber.g:626:4: (lv_theExamplesTable_6_0= ruleExamplesTable )
            {
            // InternalCucumber.g:626:4: (lv_theExamplesTable_6_0= ruleExamplesTable )
            // InternalCucumber.g:627:5: lv_theExamplesTable_6_0= ruleExamplesTable
            {

            					newCompositeNode(grammarAccess.getExamplesAccess().getTheExamplesTableExamplesTableParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_theExamplesTable_6_0=ruleExamplesTable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExamplesRule());
            					}
            					set(
            						current,
            						"theExamplesTable",
            						lv_theExamplesTable_6_0,
            						"org.farhan.Cucumber.ExamplesTable");
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


    // $ANTLR start "entryRuleExamplesTable"
    // InternalCucumber.g:648:1: entryRuleExamplesTable returns [EObject current=null] : iv_ruleExamplesTable= ruleExamplesTable EOF ;
    public final EObject entryRuleExamplesTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExamplesTable = null;


        try {
            // InternalCucumber.g:648:54: (iv_ruleExamplesTable= ruleExamplesTable EOF )
            // InternalCucumber.g:649:2: iv_ruleExamplesTable= ruleExamplesTable EOF
            {
             newCompositeNode(grammarAccess.getExamplesTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExamplesTable=ruleExamplesTable();

            state._fsp--;

             current =iv_ruleExamplesTable; 
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
    // $ANTLR end "entryRuleExamplesTable"


    // $ANTLR start "ruleExamplesTable"
    // InternalCucumber.g:655:1: ruleExamplesTable returns [EObject current=null] : ( (lv_rows_0_0= ruleRow ) )+ ;
    public final EObject ruleExamplesTable() throws RecognitionException {
        EObject current = null;

        EObject lv_rows_0_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:661:2: ( ( (lv_rows_0_0= ruleRow ) )+ )
            // InternalCucumber.g:662:2: ( (lv_rows_0_0= ruleRow ) )+
            {
            // InternalCucumber.g:662:2: ( (lv_rows_0_0= ruleRow ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==15) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCucumber.g:663:3: (lv_rows_0_0= ruleRow )
            	    {
            	    // InternalCucumber.g:663:3: (lv_rows_0_0= ruleRow )
            	    // InternalCucumber.g:664:4: lv_rows_0_0= ruleRow
            	    {

            	    				newCompositeNode(grammarAccess.getExamplesTableAccess().getRowsRowParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_17);
            	    lv_rows_0_0=ruleRow();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getExamplesTableRule());
            	    				}
            	    				add(
            	    					current,
            	    					"rows",
            	    					lv_rows_0_0,
            	    					"org.farhan.Cucumber.Row");
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
    // $ANTLR end "ruleExamplesTable"


    // $ANTLR start "entryRuleStepTable"
    // InternalCucumber.g:684:1: entryRuleStepTable returns [EObject current=null] : iv_ruleStepTable= ruleStepTable EOF ;
    public final EObject entryRuleStepTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStepTable = null;


        try {
            // InternalCucumber.g:684:50: (iv_ruleStepTable= ruleStepTable EOF )
            // InternalCucumber.g:685:2: iv_ruleStepTable= ruleStepTable EOF
            {
             newCompositeNode(grammarAccess.getStepTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStepTable=ruleStepTable();

            state._fsp--;

             current =iv_ruleStepTable; 
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
    // $ANTLR end "entryRuleStepTable"


    // $ANTLR start "ruleStepTable"
    // InternalCucumber.g:691:1: ruleStepTable returns [EObject current=null] : ( (lv_rows_0_0= ruleRow ) )+ ;
    public final EObject ruleStepTable() throws RecognitionException {
        EObject current = null;

        EObject lv_rows_0_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:697:2: ( ( (lv_rows_0_0= ruleRow ) )+ )
            // InternalCucumber.g:698:2: ( (lv_rows_0_0= ruleRow ) )+
            {
            // InternalCucumber.g:698:2: ( (lv_rows_0_0= ruleRow ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==15) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCucumber.g:699:3: (lv_rows_0_0= ruleRow )
            	    {
            	    // InternalCucumber.g:699:3: (lv_rows_0_0= ruleRow )
            	    // InternalCucumber.g:700:4: lv_rows_0_0= ruleRow
            	    {

            	    				newCompositeNode(grammarAccess.getStepTableAccess().getRowsRowParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_17);
            	    lv_rows_0_0=ruleRow();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getStepTableRule());
            	    				}
            	    				add(
            	    					current,
            	    					"rows",
            	    					lv_rows_0_0,
            	    					"org.farhan.Cucumber.Row");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


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
    // $ANTLR end "ruleStepTable"


    // $ANTLR start "entryRuleRow"
    // InternalCucumber.g:720:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // InternalCucumber.g:720:44: (iv_ruleRow= ruleRow EOF )
            // InternalCucumber.g:721:2: iv_ruleRow= ruleRow EOF
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
    // InternalCucumber.g:727:1: ruleRow returns [EObject current=null] : ( ( (lv_cells_0_0= ruleCell ) )+ otherlv_1= '|' this_EOL_2= RULE_EOL ) ;
    public final EObject ruleRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_EOL_2=null;
        EObject lv_cells_0_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:733:2: ( ( ( (lv_cells_0_0= ruleCell ) )+ otherlv_1= '|' this_EOL_2= RULE_EOL ) )
            // InternalCucumber.g:734:2: ( ( (lv_cells_0_0= ruleCell ) )+ otherlv_1= '|' this_EOL_2= RULE_EOL )
            {
            // InternalCucumber.g:734:2: ( ( (lv_cells_0_0= ruleCell ) )+ otherlv_1= '|' this_EOL_2= RULE_EOL )
            // InternalCucumber.g:735:3: ( (lv_cells_0_0= ruleCell ) )+ otherlv_1= '|' this_EOL_2= RULE_EOL
            {
            // InternalCucumber.g:735:3: ( (lv_cells_0_0= ruleCell ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==15) ) {
                    int LA22_1 = input.LA(2);

                    if ( ((LA22_1>=RULE_ID && LA22_1<=RULE_STRING)) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // InternalCucumber.g:736:4: (lv_cells_0_0= ruleCell )
            	    {
            	    // InternalCucumber.g:736:4: (lv_cells_0_0= ruleCell )
            	    // InternalCucumber.g:737:5: lv_cells_0_0= ruleCell
            	    {

            	    					newCompositeNode(grammarAccess.getRowAccess().getCellsCellParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_cells_0_0=ruleCell();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRowRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cells",
            	    						lv_cells_0_0,
            	    						"org.farhan.Cucumber.Cell");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            otherlv_1=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getRowAccess().getVerticalLineKeyword_1());
            		
            this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_2); 

            			newLeafNode(this_EOL_2, grammarAccess.getRowAccess().getEOLTerminalRuleCall_2());
            		

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
    // InternalCucumber.g:766:1: entryRuleCell returns [EObject current=null] : iv_ruleCell= ruleCell EOF ;
    public final EObject entryRuleCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCell = null;


        try {
            // InternalCucumber.g:766:45: (iv_ruleCell= ruleCell EOF )
            // InternalCucumber.g:767:2: iv_ruleCell= ruleCell EOF
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
    // InternalCucumber.g:773:1: ruleCell returns [EObject current=null] : (otherlv_0= '|' ( (lv_name_1_0= rulePhrase ) ) ) ;
    public final EObject ruleCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:779:2: ( (otherlv_0= '|' ( (lv_name_1_0= rulePhrase ) ) ) )
            // InternalCucumber.g:780:2: (otherlv_0= '|' ( (lv_name_1_0= rulePhrase ) ) )
            {
            // InternalCucumber.g:780:2: (otherlv_0= '|' ( (lv_name_1_0= rulePhrase ) ) )
            // InternalCucumber.g:781:3: otherlv_0= '|' ( (lv_name_1_0= rulePhrase ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCellAccess().getVerticalLineKeyword_0());
            		
            // InternalCucumber.g:785:3: ( (lv_name_1_0= rulePhrase ) )
            // InternalCucumber.g:786:4: (lv_name_1_0= rulePhrase )
            {
            // InternalCucumber.g:786:4: (lv_name_1_0= rulePhrase )
            // InternalCucumber.g:787:5: lv_name_1_0= rulePhrase
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
            						"org.farhan.Cucumber.Phrase");
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


    // $ANTLR start "entryRuleStep"
    // InternalCucumber.g:808:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalCucumber.g:808:45: (iv_ruleStep= ruleStep EOF )
            // InternalCucumber.g:809:2: iv_ruleStep= ruleStep EOF
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
    // InternalCucumber.g:815:1: ruleStep returns [EObject current=null] : ( (otherlv_0= 'Given' | otherlv_1= 'When' | otherlv_2= 'Then' | otherlv_3= 'And' | otherlv_4= '*' ) ( (lv_name_5_0= rulePhrase ) ) this_EOL_6= RULE_EOL ( ( (lv_theStepTable_7_0= ruleStepTable ) ) | ( (lv_theDocString_8_0= ruleDocString ) ) )? ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_EOL_6=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_theStepTable_7_0 = null;

        EObject lv_theDocString_8_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:821:2: ( ( (otherlv_0= 'Given' | otherlv_1= 'When' | otherlv_2= 'Then' | otherlv_3= 'And' | otherlv_4= '*' ) ( (lv_name_5_0= rulePhrase ) ) this_EOL_6= RULE_EOL ( ( (lv_theStepTable_7_0= ruleStepTable ) ) | ( (lv_theDocString_8_0= ruleDocString ) ) )? ) )
            // InternalCucumber.g:822:2: ( (otherlv_0= 'Given' | otherlv_1= 'When' | otherlv_2= 'Then' | otherlv_3= 'And' | otherlv_4= '*' ) ( (lv_name_5_0= rulePhrase ) ) this_EOL_6= RULE_EOL ( ( (lv_theStepTable_7_0= ruleStepTable ) ) | ( (lv_theDocString_8_0= ruleDocString ) ) )? )
            {
            // InternalCucumber.g:822:2: ( (otherlv_0= 'Given' | otherlv_1= 'When' | otherlv_2= 'Then' | otherlv_3= 'And' | otherlv_4= '*' ) ( (lv_name_5_0= rulePhrase ) ) this_EOL_6= RULE_EOL ( ( (lv_theStepTable_7_0= ruleStepTable ) ) | ( (lv_theDocString_8_0= ruleDocString ) ) )? )
            // InternalCucumber.g:823:3: (otherlv_0= 'Given' | otherlv_1= 'When' | otherlv_2= 'Then' | otherlv_3= 'And' | otherlv_4= '*' ) ( (lv_name_5_0= rulePhrase ) ) this_EOL_6= RULE_EOL ( ( (lv_theStepTable_7_0= ruleStepTable ) ) | ( (lv_theDocString_8_0= ruleDocString ) ) )?
            {
            // InternalCucumber.g:823:3: (otherlv_0= 'Given' | otherlv_1= 'When' | otherlv_2= 'Then' | otherlv_3= 'And' | otherlv_4= '*' )
            int alt23=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt23=1;
                }
                break;
            case 17:
                {
                alt23=2;
                }
                break;
            case 18:
                {
                alt23=3;
                }
                break;
            case 19:
                {
                alt23=4;
                }
                break;
            case 20:
                {
                alt23=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalCucumber.g:824:4: otherlv_0= 'Given'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getStepAccess().getGivenKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCucumber.g:829:4: otherlv_1= 'When'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getStepAccess().getWhenKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalCucumber.g:834:4: otherlv_2= 'Then'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getStepAccess().getThenKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalCucumber.g:839:4: otherlv_3= 'And'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getStepAccess().getAndKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalCucumber.g:844:4: otherlv_4= '*'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getStepAccess().getAsteriskKeyword_0_4());
                    			

                    }
                    break;

            }

            // InternalCucumber.g:849:3: ( (lv_name_5_0= rulePhrase ) )
            // InternalCucumber.g:850:4: (lv_name_5_0= rulePhrase )
            {
            // InternalCucumber.g:850:4: (lv_name_5_0= rulePhrase )
            // InternalCucumber.g:851:5: lv_name_5_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getStepAccess().getNamePhraseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_5_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStepRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.farhan.Cucumber.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_6=(Token)match(input,RULE_EOL,FOLLOW_18); 

            			newLeafNode(this_EOL_6, grammarAccess.getStepAccess().getEOLTerminalRuleCall_2());
            		
            // InternalCucumber.g:872:3: ( ( (lv_theStepTable_7_0= ruleStepTable ) ) | ( (lv_theDocString_8_0= ruleDocString ) ) )?
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==15) ) {
                alt24=1;
            }
            else if ( (LA24_0==21) ) {
                alt24=2;
            }
            switch (alt24) {
                case 1 :
                    // InternalCucumber.g:873:4: ( (lv_theStepTable_7_0= ruleStepTable ) )
                    {
                    // InternalCucumber.g:873:4: ( (lv_theStepTable_7_0= ruleStepTable ) )
                    // InternalCucumber.g:874:5: (lv_theStepTable_7_0= ruleStepTable )
                    {
                    // InternalCucumber.g:874:5: (lv_theStepTable_7_0= ruleStepTable )
                    // InternalCucumber.g:875:6: lv_theStepTable_7_0= ruleStepTable
                    {

                    						newCompositeNode(grammarAccess.getStepAccess().getTheStepTableStepTableParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_theStepTable_7_0=ruleStepTable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStepRule());
                    						}
                    						set(
                    							current,
                    							"theStepTable",
                    							lv_theStepTable_7_0,
                    							"org.farhan.Cucumber.StepTable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:893:4: ( (lv_theDocString_8_0= ruleDocString ) )
                    {
                    // InternalCucumber.g:893:4: ( (lv_theDocString_8_0= ruleDocString ) )
                    // InternalCucumber.g:894:5: (lv_theDocString_8_0= ruleDocString )
                    {
                    // InternalCucumber.g:894:5: (lv_theDocString_8_0= ruleDocString )
                    // InternalCucumber.g:895:6: lv_theDocString_8_0= ruleDocString
                    {

                    						newCompositeNode(grammarAccess.getStepAccess().getTheDocStringDocStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_theDocString_8_0=ruleDocString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStepRule());
                    						}
                    						set(
                    							current,
                    							"theDocString",
                    							lv_theDocString_8_0,
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


    // $ANTLR start "entryRuleDocString"
    // InternalCucumber.g:917:1: entryRuleDocString returns [EObject current=null] : iv_ruleDocString= ruleDocString EOF ;
    public final EObject entryRuleDocString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocString = null;


        try {
            // InternalCucumber.g:917:50: (iv_ruleDocString= ruleDocString EOF )
            // InternalCucumber.g:918:2: iv_ruleDocString= ruleDocString EOF
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
    // InternalCucumber.g:924:1: ruleDocString returns [EObject current=null] : (otherlv_0= '\"\"\"' this_EOL_1= RULE_EOL ( (lv_lines_2_0= ruleLine ) )+ otherlv_3= '\"\"\"' this_EOL_4= RULE_EOL ) ;
    public final EObject ruleDocString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EOL_1=null;
        Token otherlv_3=null;
        Token this_EOL_4=null;
        EObject lv_lines_2_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:930:2: ( (otherlv_0= '\"\"\"' this_EOL_1= RULE_EOL ( (lv_lines_2_0= ruleLine ) )+ otherlv_3= '\"\"\"' this_EOL_4= RULE_EOL ) )
            // InternalCucumber.g:931:2: (otherlv_0= '\"\"\"' this_EOL_1= RULE_EOL ( (lv_lines_2_0= ruleLine ) )+ otherlv_3= '\"\"\"' this_EOL_4= RULE_EOL )
            {
            // InternalCucumber.g:931:2: (otherlv_0= '\"\"\"' this_EOL_1= RULE_EOL ( (lv_lines_2_0= ruleLine ) )+ otherlv_3= '\"\"\"' this_EOL_4= RULE_EOL )
            // InternalCucumber.g:932:3: otherlv_0= '\"\"\"' this_EOL_1= RULE_EOL ( (lv_lines_2_0= ruleLine ) )+ otherlv_3= '\"\"\"' this_EOL_4= RULE_EOL
            {
            otherlv_0=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_0());
            		
            this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_19); 

            			newLeafNode(this_EOL_1, grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_1());
            		
            // InternalCucumber.g:940:3: ( (lv_lines_2_0= ruleLine ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==EOF||(LA25_0>=RULE_EOL && LA25_0<=RULE_STRING)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalCucumber.g:941:4: (lv_lines_2_0= ruleLine )
            	    {
            	    // InternalCucumber.g:941:4: (lv_lines_2_0= ruleLine )
            	    // InternalCucumber.g:942:5: lv_lines_2_0= ruleLine
            	    {

            	    					newCompositeNode(grammarAccess.getDocStringAccess().getLinesLineParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_lines_2_0=ruleLine();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDocStringRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lines",
            	    						lv_lines_2_0,
            	    						"org.farhan.Cucumber.Line");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_3());
            		
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


    // $ANTLR start "entryRuleStatement"
    // InternalCucumber.g:971:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalCucumber.g:971:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalCucumber.g:972:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalCucumber.g:978:1: ruleStatement returns [EObject current=null] : ( ( (lv_name_0_0= rulePhrase ) ) this_EOL_1= RULE_EOL ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token this_EOL_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:984:2: ( ( ( (lv_name_0_0= rulePhrase ) ) this_EOL_1= RULE_EOL ) )
            // InternalCucumber.g:985:2: ( ( (lv_name_0_0= rulePhrase ) ) this_EOL_1= RULE_EOL )
            {
            // InternalCucumber.g:985:2: ( ( (lv_name_0_0= rulePhrase ) ) this_EOL_1= RULE_EOL )
            // InternalCucumber.g:986:3: ( (lv_name_0_0= rulePhrase ) ) this_EOL_1= RULE_EOL
            {
            // InternalCucumber.g:986:3: ( (lv_name_0_0= rulePhrase ) )
            // InternalCucumber.g:987:4: (lv_name_0_0= rulePhrase )
            {
            // InternalCucumber.g:987:4: (lv_name_0_0= rulePhrase )
            // InternalCucumber.g:988:5: lv_name_0_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getStatementAccess().getNamePhraseParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_0_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.farhan.Cucumber.Phrase");
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
    // InternalCucumber.g:1013:1: entryRulePhrase returns [String current=null] : iv_rulePhrase= rulePhrase EOF ;
    public final String entryRulePhrase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePhrase = null;


        try {
            // InternalCucumber.g:1013:46: (iv_rulePhrase= rulePhrase EOF )
            // InternalCucumber.g:1014:2: iv_rulePhrase= rulePhrase EOF
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
    // InternalCucumber.g:1020:1: rulePhrase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )+ ;
    public final AntlrDatatypeRuleToken rulePhrase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TEXT_LITERAL_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:1026:2: ( (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )+ )
            // InternalCucumber.g:1027:2: (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )+
            {
            // InternalCucumber.g:1027:2: (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_STRING)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalCucumber.g:1028:3: this_TEXT_LITERAL_0= ruleTEXT_LITERAL
            	    {

            	    			newCompositeNode(grammarAccess.getPhraseAccess().getTEXT_LITERALParserRuleCall());
            	    		
            	    pushFollow(FOLLOW_21);
            	    this_TEXT_LITERAL_0=ruleTEXT_LITERAL();

            	    state._fsp--;


            	    			current.merge(this_TEXT_LITERAL_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
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


    // $ANTLR start "entryRuleTag"
    // InternalCucumber.g:1042:1: entryRuleTag returns [EObject current=null] : iv_ruleTag= ruleTag EOF ;
    public final EObject entryRuleTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTag = null;


        try {
            // InternalCucumber.g:1042:44: (iv_ruleTag= ruleTag EOF )
            // InternalCucumber.g:1043:2: iv_ruleTag= ruleTag EOF
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
    // InternalCucumber.g:1049:1: ruleTag returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalCucumber.g:1055:2: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalCucumber.g:1056:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalCucumber.g:1056:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalCucumber.g:1057:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getTagAccess().getCommercialAtKeyword_0());
            		
            // InternalCucumber.g:1061:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCucumber.g:1062:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCucumber.g:1062:4: (lv_name_1_0= RULE_ID )
            // InternalCucumber.g:1063:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTagAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.farhan.Cucumber.ID");
            				

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
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleLine"
    // InternalCucumber.g:1083:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // InternalCucumber.g:1083:45: (iv_ruleLine= ruleLine EOF )
            // InternalCucumber.g:1084:2: iv_ruleLine= ruleLine EOF
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
    // InternalCucumber.g:1090:1: ruleLine returns [EObject current=null] : ( ( (lv_name_0_0= ruleLineBits ) ) this_EOL_1= RULE_EOL ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        Token this_EOL_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:1096:2: ( ( ( (lv_name_0_0= ruleLineBits ) ) this_EOL_1= RULE_EOL ) )
            // InternalCucumber.g:1097:2: ( ( (lv_name_0_0= ruleLineBits ) ) this_EOL_1= RULE_EOL )
            {
            // InternalCucumber.g:1097:2: ( ( (lv_name_0_0= ruleLineBits ) ) this_EOL_1= RULE_EOL )
            // InternalCucumber.g:1098:3: ( (lv_name_0_0= ruleLineBits ) ) this_EOL_1= RULE_EOL
            {
            // InternalCucumber.g:1098:3: ( (lv_name_0_0= ruleLineBits ) )
            // InternalCucumber.g:1099:4: (lv_name_0_0= ruleLineBits )
            {
            // InternalCucumber.g:1099:4: (lv_name_0_0= ruleLineBits )
            // InternalCucumber.g:1100:5: lv_name_0_0= ruleLineBits
            {

            					newCompositeNode(grammarAccess.getLineAccess().getNameLineBitsParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_0_0=ruleLineBits();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLineRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.farhan.Cucumber.LineBits");
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
    // InternalCucumber.g:1125:1: entryRuleLineBits returns [String current=null] : iv_ruleLineBits= ruleLineBits EOF ;
    public final String entryRuleLineBits() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLineBits = null;


        try {
            // InternalCucumber.g:1125:48: (iv_ruleLineBits= ruleLineBits EOF )
            // InternalCucumber.g:1126:2: iv_ruleLineBits= ruleLineBits EOF
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
    // InternalCucumber.g:1132:1: ruleLineBits returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )* ;
    public final AntlrDatatypeRuleToken ruleLineBits() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TEXT_LITERAL_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:1138:2: ( (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )* )
            // InternalCucumber.g:1139:2: (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )*
            {
            // InternalCucumber.g:1139:2: (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_STRING)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalCucumber.g:1140:3: this_TEXT_LITERAL_0= ruleTEXT_LITERAL
            	    {

            	    			newCompositeNode(grammarAccess.getLineBitsAccess().getTEXT_LITERALParserRuleCall());
            	    		
            	    pushFollow(FOLLOW_21);
            	    this_TEXT_LITERAL_0=ruleTEXT_LITERAL();

            	    state._fsp--;


            	    			current.merge(this_TEXT_LITERAL_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;

            	default :
            	    break loop27;
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


    // $ANTLR start "entryRuleTEXT_LITERAL"
    // InternalCucumber.g:1154:1: entryRuleTEXT_LITERAL returns [String current=null] : iv_ruleTEXT_LITERAL= ruleTEXT_LITERAL EOF ;
    public final String entryRuleTEXT_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTEXT_LITERAL = null;


        try {
            // InternalCucumber.g:1154:52: (iv_ruleTEXT_LITERAL= ruleTEXT_LITERAL EOF )
            // InternalCucumber.g:1155:2: iv_ruleTEXT_LITERAL= ruleTEXT_LITERAL EOF
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
    // InternalCucumber.g:1161:1: ruleTEXT_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WORD_0= RULE_WORD | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleTEXT_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;
        Token this_ID_1=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            // InternalCucumber.g:1167:2: ( (this_WORD_0= RULE_WORD | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING ) )
            // InternalCucumber.g:1168:2: (this_WORD_0= RULE_WORD | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING )
            {
            // InternalCucumber.g:1168:2: (this_WORD_0= RULE_WORD | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING )
            int alt28=3;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                alt28=1;
                }
                break;
            case RULE_ID:
                {
                alt28=2;
                }
                break;
            case RULE_STRING:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalCucumber.g:1169:3: this_WORD_0= RULE_WORD
                    {
                    this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_2); 

                    			current.merge(this_WORD_0);
                    		

                    			newLeafNode(this_WORD_0, grammarAccess.getTEXT_LITERALAccess().getWORDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCucumber.g:1177:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getTEXT_LITERALAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalCucumber.g:1185:3: this_STRING_2= RULE_STRING
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

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\1\13\1\uffff\1\5\2\uffff\1\4\1\14";
    static final String dfa_3s = "\1\26\1\uffff\1\5\2\uffff\1\26\1\15";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\2\1\3\2\uffff";
    static final String dfa_5s = "\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\3\1\4\10\uffff\1\2",
            "",
            "\1\5",
            "",
            "",
            "\1\6\21\uffff\1\2",
            "\1\3\1\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "187:2: (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario | this_ScenarioOutline_2= ruleScenarioOutline )";
        }
    }
    static final String dfa_7s = "\6\uffff";
    static final String dfa_8s = "\1\1\5\uffff";
    static final String dfa_9s = "\1\13\1\uffff\1\5\1\uffff\1\4\1\14";
    static final String dfa_10s = "\1\26\1\uffff\1\5\1\uffff\1\26\1\16";
    static final String dfa_11s = "\1\uffff\1\2\1\uffff\1\1\2\uffff";
    static final String dfa_12s = "\6\uffff}>";
    static final String[] dfa_13s = {
            "\3\1\1\3\7\uffff\1\2",
            "",
            "\1\4",
            "",
            "\1\5\21\uffff\1\2",
            "\2\1\1\3"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()+ loopback of 516:3: ( (lv_examples_7_0= ruleExamples ) )+";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000004038F2L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000403812L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001F00E2L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001F0002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000005F40F0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000005F40F2L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000080E0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000000080E2L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000002080E2L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000002000F0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});

}
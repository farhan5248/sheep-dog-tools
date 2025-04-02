package org.farhan.dsl.sheepdog.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.farhan.dsl.sheepdog.services.SheepDogGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSheepDogParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_RAWTEXT", "RULE_WORD", "RULE_WS", "RULE_SL_COMMENT", "'='", "'Step-Object:'", "'=='", "'Step-Definition:'", "'==='", "'Step-Parameters:'", "'Test-Suite:'", "'Test-Setup:'", "'Test-Case:'", "'Test-Data:'", "'Given:'", "'When:'", "'Then:'", "'And:'", "'|==='", "'|'"
    };
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
    public static final int RULE_RAWTEXT=5;
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
    // InternalSheepDog.g:71:1: ruleModel returns [EObject current=null] : (this_StepObject_0= ruleStepObject | this_TestSuite_1= ruleTestSuite ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_StepObject_0 = null;

        EObject this_TestSuite_1 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:77:2: ( (this_StepObject_0= ruleStepObject | this_TestSuite_1= ruleTestSuite ) )
            // InternalSheepDog.g:78:2: (this_StepObject_0= ruleStepObject | this_TestSuite_1= ruleTestSuite )
            {
            // InternalSheepDog.g:78:2: (this_StepObject_0= ruleStepObject | this_TestSuite_1= ruleTestSuite )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==9) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==15) ) {
                    alt1=2;
                }
                else if ( (LA1_1==10) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
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
                    // InternalSheepDog.g:88:3: this_TestSuite_1= ruleTestSuite
                    {

                    			newCompositeNode(grammarAccess.getModelAccess().getTestSuiteParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TestSuite_1=ruleTestSuite();

                    state._fsp--;


                    			current = this_TestSuite_1;
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


    // $ANTLR start "entryRuleStepObject"
    // InternalSheepDog.g:100:1: entryRuleStepObject returns [EObject current=null] : iv_ruleStepObject= ruleStepObject EOF ;
    public final EObject entryRuleStepObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStepObject = null;


        try {
            // InternalSheepDog.g:100:51: (iv_ruleStepObject= ruleStepObject EOF )
            // InternalSheepDog.g:101:2: iv_ruleStepObject= ruleStepObject EOF
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
    // InternalSheepDog.g:107:1: ruleStepObject returns [EObject current=null] : (otherlv_0= '=' otherlv_1= 'Step-Object:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_stepDefinitionList_5_0= ruleStepDefinition ) )* ) ;
    public final EObject ruleStepObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_EOL_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_statementList_4_0 = null;

        EObject lv_stepDefinitionList_5_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:113:2: ( (otherlv_0= '=' otherlv_1= 'Step-Object:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_stepDefinitionList_5_0= ruleStepDefinition ) )* ) )
            // InternalSheepDog.g:114:2: (otherlv_0= '=' otherlv_1= 'Step-Object:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_stepDefinitionList_5_0= ruleStepDefinition ) )* )
            {
            // InternalSheepDog.g:114:2: (otherlv_0= '=' otherlv_1= 'Step-Object:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_stepDefinitionList_5_0= ruleStepDefinition ) )* )
            // InternalSheepDog.g:115:3: otherlv_0= '=' otherlv_1= 'Step-Object:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_stepDefinitionList_5_0= ruleStepDefinition ) )*
            {
            otherlv_0=(Token)match(input,9,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStepObjectAccess().getEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,10,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStepObjectAccess().getStepObjectKeyword_1());
            		
            // InternalSheepDog.g:123:3: ( (lv_name_2_0= ruleTitle ) )
            // InternalSheepDog.g:124:4: (lv_name_2_0= ruleTitle )
            {
            // InternalSheepDog.g:124:4: (lv_name_2_0= ruleTitle )
            // InternalSheepDog.g:125:5: lv_name_2_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getStepObjectAccess().getNameTitleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleTitle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStepObjectRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.farhan.dsl.sheepdog.SheepDog.Title");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_6); 

            			newLeafNode(this_EOL_3, grammarAccess.getStepObjectAccess().getEOLTerminalRuleCall_3());
            		
            // InternalSheepDog.g:146:3: ( (lv_statementList_4_0= ruleStatement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_WORD) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSheepDog.g:147:4: (lv_statementList_4_0= ruleStatement )
            	    {
            	    // InternalSheepDog.g:147:4: (lv_statementList_4_0= ruleStatement )
            	    // InternalSheepDog.g:148:5: lv_statementList_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getStepObjectAccess().getStatementListStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_statementList_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStepObjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statementList",
            	    						lv_statementList_4_0,
            	    						"org.farhan.dsl.sheepdog.SheepDog.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalSheepDog.g:165:3: ( (lv_stepDefinitionList_5_0= ruleStepDefinition ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSheepDog.g:166:4: (lv_stepDefinitionList_5_0= ruleStepDefinition )
            	    {
            	    // InternalSheepDog.g:166:4: (lv_stepDefinitionList_5_0= ruleStepDefinition )
            	    // InternalSheepDog.g:167:5: lv_stepDefinitionList_5_0= ruleStepDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getStepObjectAccess().getStepDefinitionListStepDefinitionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_stepDefinitionList_5_0=ruleStepDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStepObjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"stepDefinitionList",
            	    						lv_stepDefinitionList_5_0,
            	    						"org.farhan.dsl.sheepdog.SheepDog.StepDefinition");
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
    // $ANTLR end "ruleStepObject"


    // $ANTLR start "entryRuleStepDefinition"
    // InternalSheepDog.g:188:1: entryRuleStepDefinition returns [EObject current=null] : iv_ruleStepDefinition= ruleStepDefinition EOF ;
    public final EObject entryRuleStepDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStepDefinition = null;


        try {
            // InternalSheepDog.g:188:55: (iv_ruleStepDefinition= ruleStepDefinition EOF )
            // InternalSheepDog.g:189:2: iv_ruleStepDefinition= ruleStepDefinition EOF
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
    // InternalSheepDog.g:195:1: ruleStepDefinition returns [EObject current=null] : (otherlv_0= '==' otherlv_1= 'Step-Definition:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_stepParameterList_5_0= ruleStepParameters ) )* ) ;
    public final EObject ruleStepDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_EOL_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_statementList_4_0 = null;

        EObject lv_stepParameterList_5_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:201:2: ( (otherlv_0= '==' otherlv_1= 'Step-Definition:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_stepParameterList_5_0= ruleStepParameters ) )* ) )
            // InternalSheepDog.g:202:2: (otherlv_0= '==' otherlv_1= 'Step-Definition:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_stepParameterList_5_0= ruleStepParameters ) )* )
            {
            // InternalSheepDog.g:202:2: (otherlv_0= '==' otherlv_1= 'Step-Definition:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_stepParameterList_5_0= ruleStepParameters ) )* )
            // InternalSheepDog.g:203:3: otherlv_0= '==' otherlv_1= 'Step-Definition:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_stepParameterList_5_0= ruleStepParameters ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getStepDefinitionAccess().getEqualsSignEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStepDefinitionAccess().getStepDefinitionKeyword_1());
            		
            // InternalSheepDog.g:211:3: ( (lv_name_2_0= ruleTitle ) )
            // InternalSheepDog.g:212:4: (lv_name_2_0= ruleTitle )
            {
            // InternalSheepDog.g:212:4: (lv_name_2_0= ruleTitle )
            // InternalSheepDog.g:213:5: lv_name_2_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getStepDefinitionAccess().getNameTitleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleTitle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStepDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.farhan.dsl.sheepdog.SheepDog.Title");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_9); 

            			newLeafNode(this_EOL_3, grammarAccess.getStepDefinitionAccess().getEOLTerminalRuleCall_3());
            		
            // InternalSheepDog.g:234:3: ( (lv_statementList_4_0= ruleStatement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_WORD) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSheepDog.g:235:4: (lv_statementList_4_0= ruleStatement )
            	    {
            	    // InternalSheepDog.g:235:4: (lv_statementList_4_0= ruleStatement )
            	    // InternalSheepDog.g:236:5: lv_statementList_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getStepDefinitionAccess().getStatementListStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_statementList_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStepDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statementList",
            	    						lv_statementList_4_0,
            	    						"org.farhan.dsl.sheepdog.SheepDog.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalSheepDog.g:253:3: ( (lv_stepParameterList_5_0= ruleStepParameters ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSheepDog.g:254:4: (lv_stepParameterList_5_0= ruleStepParameters )
            	    {
            	    // InternalSheepDog.g:254:4: (lv_stepParameterList_5_0= ruleStepParameters )
            	    // InternalSheepDog.g:255:5: lv_stepParameterList_5_0= ruleStepParameters
            	    {

            	    					newCompositeNode(grammarAccess.getStepDefinitionAccess().getStepParameterListStepParametersParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_stepParameterList_5_0=ruleStepParameters();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStepDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"stepParameterList",
            	    						lv_stepParameterList_5_0,
            	    						"org.farhan.dsl.sheepdog.SheepDog.StepParameters");
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
    // $ANTLR end "ruleStepDefinition"


    // $ANTLR start "entryRuleStepParameters"
    // InternalSheepDog.g:276:1: entryRuleStepParameters returns [EObject current=null] : iv_ruleStepParameters= ruleStepParameters EOF ;
    public final EObject entryRuleStepParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStepParameters = null;


        try {
            // InternalSheepDog.g:276:55: (iv_ruleStepParameters= ruleStepParameters EOF )
            // InternalSheepDog.g:277:2: iv_ruleStepParameters= ruleStepParameters EOF
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
    // InternalSheepDog.g:283:1: ruleStepParameters returns [EObject current=null] : (otherlv_0= '===' otherlv_1= 'Step-Parameters:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_table_5_0= ruleTable ) ) ) ;
    public final EObject ruleStepParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_EOL_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_statementList_4_0 = null;

        EObject lv_table_5_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:289:2: ( (otherlv_0= '===' otherlv_1= 'Step-Parameters:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_table_5_0= ruleTable ) ) ) )
            // InternalSheepDog.g:290:2: (otherlv_0= '===' otherlv_1= 'Step-Parameters:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_table_5_0= ruleTable ) ) )
            {
            // InternalSheepDog.g:290:2: (otherlv_0= '===' otherlv_1= 'Step-Parameters:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_table_5_0= ruleTable ) ) )
            // InternalSheepDog.g:291:3: otherlv_0= '===' otherlv_1= 'Step-Parameters:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_table_5_0= ruleTable ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getStepParametersAccess().getEqualsSignEqualsSignEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStepParametersAccess().getStepParametersKeyword_1());
            		
            // InternalSheepDog.g:299:3: ( (lv_name_2_0= ruleTitle ) )
            // InternalSheepDog.g:300:4: (lv_name_2_0= ruleTitle )
            {
            // InternalSheepDog.g:300:4: (lv_name_2_0= ruleTitle )
            // InternalSheepDog.g:301:5: lv_name_2_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getStepParametersAccess().getNameTitleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleTitle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStepParametersRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.farhan.dsl.sheepdog.SheepDog.Title");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_12); 

            			newLeafNode(this_EOL_3, grammarAccess.getStepParametersAccess().getEOLTerminalRuleCall_3());
            		
            // InternalSheepDog.g:322:3: ( (lv_statementList_4_0= ruleStatement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_WORD) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSheepDog.g:323:4: (lv_statementList_4_0= ruleStatement )
            	    {
            	    // InternalSheepDog.g:323:4: (lv_statementList_4_0= ruleStatement )
            	    // InternalSheepDog.g:324:5: lv_statementList_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getStepParametersAccess().getStatementListStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_statementList_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStepParametersRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statementList",
            	    						lv_statementList_4_0,
            	    						"org.farhan.dsl.sheepdog.SheepDog.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalSheepDog.g:341:3: ( (lv_table_5_0= ruleTable ) )
            // InternalSheepDog.g:342:4: (lv_table_5_0= ruleTable )
            {
            // InternalSheepDog.g:342:4: (lv_table_5_0= ruleTable )
            // InternalSheepDog.g:343:5: lv_table_5_0= ruleTable
            {

            					newCompositeNode(grammarAccess.getStepParametersAccess().getTableTableParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_table_5_0=ruleTable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStepParametersRule());
            					}
            					set(
            						current,
            						"table",
            						lv_table_5_0,
            						"org.farhan.dsl.sheepdog.SheepDog.Table");
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


    // $ANTLR start "entryRuleTestSuite"
    // InternalSheepDog.g:364:1: entryRuleTestSuite returns [EObject current=null] : iv_ruleTestSuite= ruleTestSuite EOF ;
    public final EObject entryRuleTestSuite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestSuite = null;


        try {
            // InternalSheepDog.g:364:50: (iv_ruleTestSuite= ruleTestSuite EOF )
            // InternalSheepDog.g:365:2: iv_ruleTestSuite= ruleTestSuite EOF
            {
             newCompositeNode(grammarAccess.getTestSuiteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestSuite=ruleTestSuite();

            state._fsp--;

             current =iv_ruleTestSuite; 
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
    // $ANTLR end "entryRuleTestSuite"


    // $ANTLR start "ruleTestSuite"
    // InternalSheepDog.g:371:1: ruleTestSuite returns [EObject current=null] : (otherlv_0= '=' otherlv_1= 'Test-Suite:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_testStepContainerList_5_0= ruleTestStepContainer ) )* ) ;
    public final EObject ruleTestSuite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_EOL_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_statementList_4_0 = null;

        EObject lv_testStepContainerList_5_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:377:2: ( (otherlv_0= '=' otherlv_1= 'Test-Suite:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_testStepContainerList_5_0= ruleTestStepContainer ) )* ) )
            // InternalSheepDog.g:378:2: (otherlv_0= '=' otherlv_1= 'Test-Suite:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_testStepContainerList_5_0= ruleTestStepContainer ) )* )
            {
            // InternalSheepDog.g:378:2: (otherlv_0= '=' otherlv_1= 'Test-Suite:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_testStepContainerList_5_0= ruleTestStepContainer ) )* )
            // InternalSheepDog.g:379:3: otherlv_0= '=' otherlv_1= 'Test-Suite:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_testStepContainerList_5_0= ruleTestStepContainer ) )*
            {
            otherlv_0=(Token)match(input,9,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getTestSuiteAccess().getEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTestSuiteAccess().getTestSuiteKeyword_1());
            		
            // InternalSheepDog.g:387:3: ( (lv_name_2_0= ruleTitle ) )
            // InternalSheepDog.g:388:4: (lv_name_2_0= ruleTitle )
            {
            // InternalSheepDog.g:388:4: (lv_name_2_0= ruleTitle )
            // InternalSheepDog.g:389:5: lv_name_2_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getTestSuiteAccess().getNameTitleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleTitle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestSuiteRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.farhan.dsl.sheepdog.SheepDog.Title");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_6); 

            			newLeafNode(this_EOL_3, grammarAccess.getTestSuiteAccess().getEOLTerminalRuleCall_3());
            		
            // InternalSheepDog.g:410:3: ( (lv_statementList_4_0= ruleStatement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_WORD) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSheepDog.g:411:4: (lv_statementList_4_0= ruleStatement )
            	    {
            	    // InternalSheepDog.g:411:4: (lv_statementList_4_0= ruleStatement )
            	    // InternalSheepDog.g:412:5: lv_statementList_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getTestSuiteAccess().getStatementListStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_statementList_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestSuiteRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statementList",
            	    						lv_statementList_4_0,
            	    						"org.farhan.dsl.sheepdog.SheepDog.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalSheepDog.g:429:3: ( (lv_testStepContainerList_5_0= ruleTestStepContainer ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==11) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSheepDog.g:430:4: (lv_testStepContainerList_5_0= ruleTestStepContainer )
            	    {
            	    // InternalSheepDog.g:430:4: (lv_testStepContainerList_5_0= ruleTestStepContainer )
            	    // InternalSheepDog.g:431:5: lv_testStepContainerList_5_0= ruleTestStepContainer
            	    {

            	    					newCompositeNode(grammarAccess.getTestSuiteAccess().getTestStepContainerListTestStepContainerParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_testStepContainerList_5_0=ruleTestStepContainer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestSuiteRule());
            	    					}
            	    					add(
            	    						current,
            	    						"testStepContainerList",
            	    						lv_testStepContainerList_5_0,
            	    						"org.farhan.dsl.sheepdog.SheepDog.TestStepContainer");
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
    // $ANTLR end "ruleTestSuite"


    // $ANTLR start "entryRuleTestStepContainer"
    // InternalSheepDog.g:452:1: entryRuleTestStepContainer returns [EObject current=null] : iv_ruleTestStepContainer= ruleTestStepContainer EOF ;
    public final EObject entryRuleTestStepContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestStepContainer = null;


        try {
            // InternalSheepDog.g:452:58: (iv_ruleTestStepContainer= ruleTestStepContainer EOF )
            // InternalSheepDog.g:453:2: iv_ruleTestStepContainer= ruleTestStepContainer EOF
            {
             newCompositeNode(grammarAccess.getTestStepContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestStepContainer=ruleTestStepContainer();

            state._fsp--;

             current =iv_ruleTestStepContainer; 
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
    // $ANTLR end "entryRuleTestStepContainer"


    // $ANTLR start "ruleTestStepContainer"
    // InternalSheepDog.g:459:1: ruleTestStepContainer returns [EObject current=null] : (this_TestSetup_0= ruleTestSetup | this_TestCase_1= ruleTestCase ) ;
    public final EObject ruleTestStepContainer() throws RecognitionException {
        EObject current = null;

        EObject this_TestSetup_0 = null;

        EObject this_TestCase_1 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:465:2: ( (this_TestSetup_0= ruleTestSetup | this_TestCase_1= ruleTestCase ) )
            // InternalSheepDog.g:466:2: (this_TestSetup_0= ruleTestSetup | this_TestCase_1= ruleTestCase )
            {
            // InternalSheepDog.g:466:2: (this_TestSetup_0= ruleTestSetup | this_TestCase_1= ruleTestCase )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==11) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==17) ) {
                    alt9=2;
                }
                else if ( (LA9_1==16) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSheepDog.g:467:3: this_TestSetup_0= ruleTestSetup
                    {

                    			newCompositeNode(grammarAccess.getTestStepContainerAccess().getTestSetupParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TestSetup_0=ruleTestSetup();

                    state._fsp--;


                    			current = this_TestSetup_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSheepDog.g:476:3: this_TestCase_1= ruleTestCase
                    {

                    			newCompositeNode(grammarAccess.getTestStepContainerAccess().getTestCaseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TestCase_1=ruleTestCase();

                    state._fsp--;


                    			current = this_TestCase_1;
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
    // $ANTLR end "ruleTestStepContainer"


    // $ANTLR start "entryRuleTestSetup"
    // InternalSheepDog.g:488:1: entryRuleTestSetup returns [EObject current=null] : iv_ruleTestSetup= ruleTestSetup EOF ;
    public final EObject entryRuleTestSetup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestSetup = null;


        try {
            // InternalSheepDog.g:488:50: (iv_ruleTestSetup= ruleTestSetup EOF )
            // InternalSheepDog.g:489:2: iv_ruleTestSetup= ruleTestSetup EOF
            {
             newCompositeNode(grammarAccess.getTestSetupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestSetup=ruleTestSetup();

            state._fsp--;

             current =iv_ruleTestSetup; 
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
    // $ANTLR end "entryRuleTestSetup"


    // $ANTLR start "ruleTestSetup"
    // InternalSheepDog.g:495:1: ruleTestSetup returns [EObject current=null] : (otherlv_0= '==' otherlv_1= 'Test-Setup:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_testStepList_5_0= ruleTestStep ) )* ) ;
    public final EObject ruleTestSetup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_EOL_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_statementList_4_0 = null;

        EObject lv_testStepList_5_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:501:2: ( (otherlv_0= '==' otherlv_1= 'Test-Setup:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_testStepList_5_0= ruleTestStep ) )* ) )
            // InternalSheepDog.g:502:2: (otherlv_0= '==' otherlv_1= 'Test-Setup:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_testStepList_5_0= ruleTestStep ) )* )
            {
            // InternalSheepDog.g:502:2: (otherlv_0= '==' otherlv_1= 'Test-Setup:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_testStepList_5_0= ruleTestStep ) )* )
            // InternalSheepDog.g:503:3: otherlv_0= '==' otherlv_1= 'Test-Setup:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_testStepList_5_0= ruleTestStep ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getTestSetupAccess().getEqualsSignEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTestSetupAccess().getTestSetupKeyword_1());
            		
            // InternalSheepDog.g:511:3: ( (lv_name_2_0= ruleTitle ) )
            // InternalSheepDog.g:512:4: (lv_name_2_0= ruleTitle )
            {
            // InternalSheepDog.g:512:4: (lv_name_2_0= ruleTitle )
            // InternalSheepDog.g:513:5: lv_name_2_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getTestSetupAccess().getNameTitleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleTitle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestSetupRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.farhan.dsl.sheepdog.SheepDog.Title");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_9); 

            			newLeafNode(this_EOL_3, grammarAccess.getTestSetupAccess().getEOLTerminalRuleCall_3());
            		
            // InternalSheepDog.g:534:3: ( (lv_statementList_4_0= ruleStatement ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_WORD) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSheepDog.g:535:4: (lv_statementList_4_0= ruleStatement )
            	    {
            	    // InternalSheepDog.g:535:4: (lv_statementList_4_0= ruleStatement )
            	    // InternalSheepDog.g:536:5: lv_statementList_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getTestSetupAccess().getStatementListStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_statementList_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestSetupRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statementList",
            	    						lv_statementList_4_0,
            	    						"org.farhan.dsl.sheepdog.SheepDog.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalSheepDog.g:553:3: ( (lv_testStepList_5_0= ruleTestStep ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==13) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSheepDog.g:554:4: (lv_testStepList_5_0= ruleTestStep )
            	    {
            	    // InternalSheepDog.g:554:4: (lv_testStepList_5_0= ruleTestStep )
            	    // InternalSheepDog.g:555:5: lv_testStepList_5_0= ruleTestStep
            	    {

            	    					newCompositeNode(grammarAccess.getTestSetupAccess().getTestStepListTestStepParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_testStepList_5_0=ruleTestStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestSetupRule());
            	    					}
            	    					add(
            	    						current,
            	    						"testStepList",
            	    						lv_testStepList_5_0,
            	    						"org.farhan.dsl.sheepdog.SheepDog.TestStep");
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
    // $ANTLR end "ruleTestSetup"


    // $ANTLR start "entryRuleTestCase"
    // InternalSheepDog.g:576:1: entryRuleTestCase returns [EObject current=null] : iv_ruleTestCase= ruleTestCase EOF ;
    public final EObject entryRuleTestCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestCase = null;


        try {
            // InternalSheepDog.g:576:49: (iv_ruleTestCase= ruleTestCase EOF )
            // InternalSheepDog.g:577:2: iv_ruleTestCase= ruleTestCase EOF
            {
             newCompositeNode(grammarAccess.getTestCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestCase=ruleTestCase();

            state._fsp--;

             current =iv_ruleTestCase; 
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
    // $ANTLR end "entryRuleTestCase"


    // $ANTLR start "ruleTestCase"
    // InternalSheepDog.g:583:1: ruleTestCase returns [EObject current=null] : (otherlv_0= '==' otherlv_1= 'Test-Case:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_testStepList_5_0= ruleTestStep ) )* ( (lv_testDataList_6_0= ruleTestData ) )* ) ;
    public final EObject ruleTestCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_EOL_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_statementList_4_0 = null;

        EObject lv_testStepList_5_0 = null;

        EObject lv_testDataList_6_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:589:2: ( (otherlv_0= '==' otherlv_1= 'Test-Case:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_testStepList_5_0= ruleTestStep ) )* ( (lv_testDataList_6_0= ruleTestData ) )* ) )
            // InternalSheepDog.g:590:2: (otherlv_0= '==' otherlv_1= 'Test-Case:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_testStepList_5_0= ruleTestStep ) )* ( (lv_testDataList_6_0= ruleTestData ) )* )
            {
            // InternalSheepDog.g:590:2: (otherlv_0= '==' otherlv_1= 'Test-Case:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_testStepList_5_0= ruleTestStep ) )* ( (lv_testDataList_6_0= ruleTestData ) )* )
            // InternalSheepDog.g:591:3: otherlv_0= '==' otherlv_1= 'Test-Case:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_testStepList_5_0= ruleTestStep ) )* ( (lv_testDataList_6_0= ruleTestData ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getTestCaseAccess().getEqualsSignEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTestCaseAccess().getTestCaseKeyword_1());
            		
            // InternalSheepDog.g:599:3: ( (lv_name_2_0= ruleTitle ) )
            // InternalSheepDog.g:600:4: (lv_name_2_0= ruleTitle )
            {
            // InternalSheepDog.g:600:4: (lv_name_2_0= ruleTitle )
            // InternalSheepDog.g:601:5: lv_name_2_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getTestCaseAccess().getNameTitleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleTitle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestCaseRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.farhan.dsl.sheepdog.SheepDog.Title");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_9); 

            			newLeafNode(this_EOL_3, grammarAccess.getTestCaseAccess().getEOLTerminalRuleCall_3());
            		
            // InternalSheepDog.g:622:3: ( (lv_statementList_4_0= ruleStatement ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_WORD) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSheepDog.g:623:4: (lv_statementList_4_0= ruleStatement )
            	    {
            	    // InternalSheepDog.g:623:4: (lv_statementList_4_0= ruleStatement )
            	    // InternalSheepDog.g:624:5: lv_statementList_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getTestCaseAccess().getStatementListStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_statementList_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestCaseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statementList",
            	    						lv_statementList_4_0,
            	    						"org.farhan.dsl.sheepdog.SheepDog.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalSheepDog.g:641:3: ( (lv_testStepList_5_0= ruleTestStep ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==13) ) {
                    int LA13_1 = input.LA(2);

                    if ( ((LA13_1>=19 && LA13_1<=22)) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalSheepDog.g:642:4: (lv_testStepList_5_0= ruleTestStep )
            	    {
            	    // InternalSheepDog.g:642:4: (lv_testStepList_5_0= ruleTestStep )
            	    // InternalSheepDog.g:643:5: lv_testStepList_5_0= ruleTestStep
            	    {

            	    					newCompositeNode(grammarAccess.getTestCaseAccess().getTestStepListTestStepParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_testStepList_5_0=ruleTestStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestCaseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"testStepList",
            	    						lv_testStepList_5_0,
            	    						"org.farhan.dsl.sheepdog.SheepDog.TestStep");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalSheepDog.g:660:3: ( (lv_testDataList_6_0= ruleTestData ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==13) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSheepDog.g:661:4: (lv_testDataList_6_0= ruleTestData )
            	    {
            	    // InternalSheepDog.g:661:4: (lv_testDataList_6_0= ruleTestData )
            	    // InternalSheepDog.g:662:5: lv_testDataList_6_0= ruleTestData
            	    {

            	    					newCompositeNode(grammarAccess.getTestCaseAccess().getTestDataListTestDataParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_testDataList_6_0=ruleTestData();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestCaseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"testDataList",
            	    						lv_testDataList_6_0,
            	    						"org.farhan.dsl.sheepdog.SheepDog.TestData");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "ruleTestCase"


    // $ANTLR start "entryRuleTestData"
    // InternalSheepDog.g:683:1: entryRuleTestData returns [EObject current=null] : iv_ruleTestData= ruleTestData EOF ;
    public final EObject entryRuleTestData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestData = null;


        try {
            // InternalSheepDog.g:683:49: (iv_ruleTestData= ruleTestData EOF )
            // InternalSheepDog.g:684:2: iv_ruleTestData= ruleTestData EOF
            {
             newCompositeNode(grammarAccess.getTestDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestData=ruleTestData();

            state._fsp--;

             current =iv_ruleTestData; 
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
    // $ANTLR end "entryRuleTestData"


    // $ANTLR start "ruleTestData"
    // InternalSheepDog.g:690:1: ruleTestData returns [EObject current=null] : (otherlv_0= '===' otherlv_1= 'Test-Data:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_table_5_0= ruleTable ) ) ) ;
    public final EObject ruleTestData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_EOL_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_statementList_4_0 = null;

        EObject lv_table_5_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:696:2: ( (otherlv_0= '===' otherlv_1= 'Test-Data:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_table_5_0= ruleTable ) ) ) )
            // InternalSheepDog.g:697:2: (otherlv_0= '===' otherlv_1= 'Test-Data:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_table_5_0= ruleTable ) ) )
            {
            // InternalSheepDog.g:697:2: (otherlv_0= '===' otherlv_1= 'Test-Data:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_table_5_0= ruleTable ) ) )
            // InternalSheepDog.g:698:3: otherlv_0= '===' otherlv_1= 'Test-Data:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statementList_4_0= ruleStatement ) )* ( (lv_table_5_0= ruleTable ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getTestDataAccess().getEqualsSignEqualsSignEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTestDataAccess().getTestDataKeyword_1());
            		
            // InternalSheepDog.g:706:3: ( (lv_name_2_0= ruleTitle ) )
            // InternalSheepDog.g:707:4: (lv_name_2_0= ruleTitle )
            {
            // InternalSheepDog.g:707:4: (lv_name_2_0= ruleTitle )
            // InternalSheepDog.g:708:5: lv_name_2_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getTestDataAccess().getNameTitleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleTitle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestDataRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.farhan.dsl.sheepdog.SheepDog.Title");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_12); 

            			newLeafNode(this_EOL_3, grammarAccess.getTestDataAccess().getEOLTerminalRuleCall_3());
            		
            // InternalSheepDog.g:729:3: ( (lv_statementList_4_0= ruleStatement ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_WORD) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSheepDog.g:730:4: (lv_statementList_4_0= ruleStatement )
            	    {
            	    // InternalSheepDog.g:730:4: (lv_statementList_4_0= ruleStatement )
            	    // InternalSheepDog.g:731:5: lv_statementList_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getTestDataAccess().getStatementListStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_statementList_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestDataRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statementList",
            	    						lv_statementList_4_0,
            	    						"org.farhan.dsl.sheepdog.SheepDog.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalSheepDog.g:748:3: ( (lv_table_5_0= ruleTable ) )
            // InternalSheepDog.g:749:4: (lv_table_5_0= ruleTable )
            {
            // InternalSheepDog.g:749:4: (lv_table_5_0= ruleTable )
            // InternalSheepDog.g:750:5: lv_table_5_0= ruleTable
            {

            					newCompositeNode(grammarAccess.getTestDataAccess().getTableTableParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_table_5_0=ruleTable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestDataRule());
            					}
            					set(
            						current,
            						"table",
            						lv_table_5_0,
            						"org.farhan.dsl.sheepdog.SheepDog.Table");
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
    // $ANTLR end "ruleTestData"


    // $ANTLR start "entryRuleTestStep"
    // InternalSheepDog.g:771:1: entryRuleTestStep returns [EObject current=null] : iv_ruleTestStep= ruleTestStep EOF ;
    public final EObject entryRuleTestStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestStep = null;


        try {
            // InternalSheepDog.g:771:49: (iv_ruleTestStep= ruleTestStep EOF )
            // InternalSheepDog.g:772:2: iv_ruleTestStep= ruleTestStep EOF
            {
             newCompositeNode(grammarAccess.getTestStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestStep=ruleTestStep();

            state._fsp--;

             current =iv_ruleTestStep; 
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
    // $ANTLR end "entryRuleTestStep"


    // $ANTLR start "ruleTestStep"
    // InternalSheepDog.g:778:1: ruleTestStep returns [EObject current=null] : (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen | this_And_3= ruleAnd ) ;
    public final EObject ruleTestStep() throws RecognitionException {
        EObject current = null;

        EObject this_Given_0 = null;

        EObject this_When_1 = null;

        EObject this_Then_2 = null;

        EObject this_And_3 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:784:2: ( (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen | this_And_3= ruleAnd ) )
            // InternalSheepDog.g:785:2: (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen | this_And_3= ruleAnd )
            {
            // InternalSheepDog.g:785:2: (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen | this_And_3= ruleAnd )
            int alt16=4;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==13) ) {
                switch ( input.LA(2) ) {
                case 22:
                    {
                    alt16=4;
                    }
                    break;
                case 21:
                    {
                    alt16=3;
                    }
                    break;
                case 20:
                    {
                    alt16=2;
                    }
                    break;
                case 19:
                    {
                    alt16=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalSheepDog.g:786:3: this_Given_0= ruleGiven
                    {

                    			newCompositeNode(grammarAccess.getTestStepAccess().getGivenParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Given_0=ruleGiven();

                    state._fsp--;


                    			current = this_Given_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSheepDog.g:795:3: this_When_1= ruleWhen
                    {

                    			newCompositeNode(grammarAccess.getTestStepAccess().getWhenParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_When_1=ruleWhen();

                    state._fsp--;


                    			current = this_When_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSheepDog.g:804:3: this_Then_2= ruleThen
                    {

                    			newCompositeNode(grammarAccess.getTestStepAccess().getThenParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Then_2=ruleThen();

                    state._fsp--;


                    			current = this_Then_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSheepDog.g:813:3: this_And_3= ruleAnd
                    {

                    			newCompositeNode(grammarAccess.getTestStepAccess().getAndParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_And_3=ruleAnd();

                    state._fsp--;


                    			current = this_And_3;
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
    // $ANTLR end "ruleTestStep"


    // $ANTLR start "entryRuleGiven"
    // InternalSheepDog.g:825:1: entryRuleGiven returns [EObject current=null] : iv_ruleGiven= ruleGiven EOF ;
    public final EObject entryRuleGiven() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGiven = null;


        try {
            // InternalSheepDog.g:825:46: (iv_ruleGiven= ruleGiven EOF )
            // InternalSheepDog.g:826:2: iv_ruleGiven= ruleGiven EOF
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
    // InternalSheepDog.g:832:1: ruleGiven returns [EObject current=null] : (otherlv_0= '===' otherlv_1= 'Given:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_table_4_0= ruleTable ) ) | ( (lv_text_5_0= ruleText ) ) )? ) ;
    public final EObject ruleGiven() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_EOL_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_table_4_0 = null;

        EObject lv_text_5_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:838:2: ( (otherlv_0= '===' otherlv_1= 'Given:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_table_4_0= ruleTable ) ) | ( (lv_text_5_0= ruleText ) ) )? ) )
            // InternalSheepDog.g:839:2: (otherlv_0= '===' otherlv_1= 'Given:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_table_4_0= ruleTable ) ) | ( (lv_text_5_0= ruleText ) ) )? )
            {
            // InternalSheepDog.g:839:2: (otherlv_0= '===' otherlv_1= 'Given:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_table_4_0= ruleTable ) ) | ( (lv_text_5_0= ruleText ) ) )? )
            // InternalSheepDog.g:840:3: otherlv_0= '===' otherlv_1= 'Given:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_table_4_0= ruleTable ) ) | ( (lv_text_5_0= ruleText ) ) )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getGivenAccess().getEqualsSignEqualsSignEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGivenAccess().getGivenKeyword_1());
            		
            // InternalSheepDog.g:848:3: ( (lv_name_2_0= ruleTitle ) )
            // InternalSheepDog.g:849:4: (lv_name_2_0= ruleTitle )
            {
            // InternalSheepDog.g:849:4: (lv_name_2_0= ruleTitle )
            // InternalSheepDog.g:850:5: lv_name_2_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getGivenAccess().getNameTitleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleTitle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGivenRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.farhan.dsl.sheepdog.SheepDog.Title");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_18); 

            			newLeafNode(this_EOL_3, grammarAccess.getGivenAccess().getEOLTerminalRuleCall_3());
            		
            // InternalSheepDog.g:871:3: ( ( (lv_table_4_0= ruleTable ) ) | ( (lv_text_5_0= ruleText ) ) )?
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_RAWTEXT) ) {
                alt17=2;
            }
            switch (alt17) {
                case 1 :
                    // InternalSheepDog.g:872:4: ( (lv_table_4_0= ruleTable ) )
                    {
                    // InternalSheepDog.g:872:4: ( (lv_table_4_0= ruleTable ) )
                    // InternalSheepDog.g:873:5: (lv_table_4_0= ruleTable )
                    {
                    // InternalSheepDog.g:873:5: (lv_table_4_0= ruleTable )
                    // InternalSheepDog.g:874:6: lv_table_4_0= ruleTable
                    {

                    						newCompositeNode(grammarAccess.getGivenAccess().getTableTableParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_table_4_0=ruleTable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGivenRule());
                    						}
                    						set(
                    							current,
                    							"table",
                    							lv_table_4_0,
                    							"org.farhan.dsl.sheepdog.SheepDog.Table");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSheepDog.g:892:4: ( (lv_text_5_0= ruleText ) )
                    {
                    // InternalSheepDog.g:892:4: ( (lv_text_5_0= ruleText ) )
                    // InternalSheepDog.g:893:5: (lv_text_5_0= ruleText )
                    {
                    // InternalSheepDog.g:893:5: (lv_text_5_0= ruleText )
                    // InternalSheepDog.g:894:6: lv_text_5_0= ruleText
                    {

                    						newCompositeNode(grammarAccess.getGivenAccess().getTextTextParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_text_5_0=ruleText();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGivenRule());
                    						}
                    						set(
                    							current,
                    							"text",
                    							lv_text_5_0,
                    							"org.farhan.dsl.sheepdog.SheepDog.Text");
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
    // InternalSheepDog.g:916:1: entryRuleWhen returns [EObject current=null] : iv_ruleWhen= ruleWhen EOF ;
    public final EObject entryRuleWhen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhen = null;


        try {
            // InternalSheepDog.g:916:45: (iv_ruleWhen= ruleWhen EOF )
            // InternalSheepDog.g:917:2: iv_ruleWhen= ruleWhen EOF
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
    // InternalSheepDog.g:923:1: ruleWhen returns [EObject current=null] : (otherlv_0= '===' otherlv_1= 'When:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_table_4_0= ruleTable ) ) | ( (lv_text_5_0= ruleText ) ) )? ) ;
    public final EObject ruleWhen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_EOL_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_table_4_0 = null;

        EObject lv_text_5_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:929:2: ( (otherlv_0= '===' otherlv_1= 'When:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_table_4_0= ruleTable ) ) | ( (lv_text_5_0= ruleText ) ) )? ) )
            // InternalSheepDog.g:930:2: (otherlv_0= '===' otherlv_1= 'When:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_table_4_0= ruleTable ) ) | ( (lv_text_5_0= ruleText ) ) )? )
            {
            // InternalSheepDog.g:930:2: (otherlv_0= '===' otherlv_1= 'When:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_table_4_0= ruleTable ) ) | ( (lv_text_5_0= ruleText ) ) )? )
            // InternalSheepDog.g:931:3: otherlv_0= '===' otherlv_1= 'When:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_table_4_0= ruleTable ) ) | ( (lv_text_5_0= ruleText ) ) )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getWhenAccess().getEqualsSignEqualsSignEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getWhenAccess().getWhenKeyword_1());
            		
            // InternalSheepDog.g:939:3: ( (lv_name_2_0= ruleTitle ) )
            // InternalSheepDog.g:940:4: (lv_name_2_0= ruleTitle )
            {
            // InternalSheepDog.g:940:4: (lv_name_2_0= ruleTitle )
            // InternalSheepDog.g:941:5: lv_name_2_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getWhenAccess().getNameTitleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleTitle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhenRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.farhan.dsl.sheepdog.SheepDog.Title");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_18); 

            			newLeafNode(this_EOL_3, grammarAccess.getWhenAccess().getEOLTerminalRuleCall_3());
            		
            // InternalSheepDog.g:962:3: ( ( (lv_table_4_0= ruleTable ) ) | ( (lv_text_5_0= ruleText ) ) )?
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_RAWTEXT) ) {
                alt18=2;
            }
            switch (alt18) {
                case 1 :
                    // InternalSheepDog.g:963:4: ( (lv_table_4_0= ruleTable ) )
                    {
                    // InternalSheepDog.g:963:4: ( (lv_table_4_0= ruleTable ) )
                    // InternalSheepDog.g:964:5: (lv_table_4_0= ruleTable )
                    {
                    // InternalSheepDog.g:964:5: (lv_table_4_0= ruleTable )
                    // InternalSheepDog.g:965:6: lv_table_4_0= ruleTable
                    {

                    						newCompositeNode(grammarAccess.getWhenAccess().getTableTableParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_table_4_0=ruleTable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWhenRule());
                    						}
                    						set(
                    							current,
                    							"table",
                    							lv_table_4_0,
                    							"org.farhan.dsl.sheepdog.SheepDog.Table");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSheepDog.g:983:4: ( (lv_text_5_0= ruleText ) )
                    {
                    // InternalSheepDog.g:983:4: ( (lv_text_5_0= ruleText ) )
                    // InternalSheepDog.g:984:5: (lv_text_5_0= ruleText )
                    {
                    // InternalSheepDog.g:984:5: (lv_text_5_0= ruleText )
                    // InternalSheepDog.g:985:6: lv_text_5_0= ruleText
                    {

                    						newCompositeNode(grammarAccess.getWhenAccess().getTextTextParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_text_5_0=ruleText();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWhenRule());
                    						}
                    						set(
                    							current,
                    							"text",
                    							lv_text_5_0,
                    							"org.farhan.dsl.sheepdog.SheepDog.Text");
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
    // InternalSheepDog.g:1007:1: entryRuleThen returns [EObject current=null] : iv_ruleThen= ruleThen EOF ;
    public final EObject entryRuleThen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThen = null;


        try {
            // InternalSheepDog.g:1007:45: (iv_ruleThen= ruleThen EOF )
            // InternalSheepDog.g:1008:2: iv_ruleThen= ruleThen EOF
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
    // InternalSheepDog.g:1014:1: ruleThen returns [EObject current=null] : (otherlv_0= '===' otherlv_1= 'Then:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_table_4_0= ruleTable ) ) | ( (lv_text_5_0= ruleText ) ) )? ) ;
    public final EObject ruleThen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_EOL_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_table_4_0 = null;

        EObject lv_text_5_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1020:2: ( (otherlv_0= '===' otherlv_1= 'Then:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_table_4_0= ruleTable ) ) | ( (lv_text_5_0= ruleText ) ) )? ) )
            // InternalSheepDog.g:1021:2: (otherlv_0= '===' otherlv_1= 'Then:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_table_4_0= ruleTable ) ) | ( (lv_text_5_0= ruleText ) ) )? )
            {
            // InternalSheepDog.g:1021:2: (otherlv_0= '===' otherlv_1= 'Then:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_table_4_0= ruleTable ) ) | ( (lv_text_5_0= ruleText ) ) )? )
            // InternalSheepDog.g:1022:3: otherlv_0= '===' otherlv_1= 'Then:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_table_4_0= ruleTable ) ) | ( (lv_text_5_0= ruleText ) ) )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getThenAccess().getEqualsSignEqualsSignEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getThenAccess().getThenKeyword_1());
            		
            // InternalSheepDog.g:1030:3: ( (lv_name_2_0= ruleTitle ) )
            // InternalSheepDog.g:1031:4: (lv_name_2_0= ruleTitle )
            {
            // InternalSheepDog.g:1031:4: (lv_name_2_0= ruleTitle )
            // InternalSheepDog.g:1032:5: lv_name_2_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getThenAccess().getNameTitleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleTitle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThenRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.farhan.dsl.sheepdog.SheepDog.Title");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_18); 

            			newLeafNode(this_EOL_3, grammarAccess.getThenAccess().getEOLTerminalRuleCall_3());
            		
            // InternalSheepDog.g:1053:3: ( ( (lv_table_4_0= ruleTable ) ) | ( (lv_text_5_0= ruleText ) ) )?
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_RAWTEXT) ) {
                alt19=2;
            }
            switch (alt19) {
                case 1 :
                    // InternalSheepDog.g:1054:4: ( (lv_table_4_0= ruleTable ) )
                    {
                    // InternalSheepDog.g:1054:4: ( (lv_table_4_0= ruleTable ) )
                    // InternalSheepDog.g:1055:5: (lv_table_4_0= ruleTable )
                    {
                    // InternalSheepDog.g:1055:5: (lv_table_4_0= ruleTable )
                    // InternalSheepDog.g:1056:6: lv_table_4_0= ruleTable
                    {

                    						newCompositeNode(grammarAccess.getThenAccess().getTableTableParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_table_4_0=ruleTable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getThenRule());
                    						}
                    						set(
                    							current,
                    							"table",
                    							lv_table_4_0,
                    							"org.farhan.dsl.sheepdog.SheepDog.Table");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSheepDog.g:1074:4: ( (lv_text_5_0= ruleText ) )
                    {
                    // InternalSheepDog.g:1074:4: ( (lv_text_5_0= ruleText ) )
                    // InternalSheepDog.g:1075:5: (lv_text_5_0= ruleText )
                    {
                    // InternalSheepDog.g:1075:5: (lv_text_5_0= ruleText )
                    // InternalSheepDog.g:1076:6: lv_text_5_0= ruleText
                    {

                    						newCompositeNode(grammarAccess.getThenAccess().getTextTextParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_text_5_0=ruleText();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getThenRule());
                    						}
                    						set(
                    							current,
                    							"text",
                    							lv_text_5_0,
                    							"org.farhan.dsl.sheepdog.SheepDog.Text");
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


    // $ANTLR start "entryRuleAnd"
    // InternalSheepDog.g:1098:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalSheepDog.g:1098:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalSheepDog.g:1099:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalSheepDog.g:1105:1: ruleAnd returns [EObject current=null] : (otherlv_0= '===' otherlv_1= 'And:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_table_4_0= ruleTable ) ) | ( (lv_text_5_0= ruleText ) ) )? ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_EOL_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_table_4_0 = null;

        EObject lv_text_5_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1111:2: ( (otherlv_0= '===' otherlv_1= 'And:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_table_4_0= ruleTable ) ) | ( (lv_text_5_0= ruleText ) ) )? ) )
            // InternalSheepDog.g:1112:2: (otherlv_0= '===' otherlv_1= 'And:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_table_4_0= ruleTable ) ) | ( (lv_text_5_0= ruleText ) ) )? )
            {
            // InternalSheepDog.g:1112:2: (otherlv_0= '===' otherlv_1= 'And:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_table_4_0= ruleTable ) ) | ( (lv_text_5_0= ruleText ) ) )? )
            // InternalSheepDog.g:1113:3: otherlv_0= '===' otherlv_1= 'And:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_table_4_0= ruleTable ) ) | ( (lv_text_5_0= ruleText ) ) )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getAndAccess().getEqualsSignEqualsSignEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAndAccess().getAndKeyword_1());
            		
            // InternalSheepDog.g:1121:3: ( (lv_name_2_0= ruleTitle ) )
            // InternalSheepDog.g:1122:4: (lv_name_2_0= ruleTitle )
            {
            // InternalSheepDog.g:1122:4: (lv_name_2_0= ruleTitle )
            // InternalSheepDog.g:1123:5: lv_name_2_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getAndAccess().getNameTitleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleTitle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.farhan.dsl.sheepdog.SheepDog.Title");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_18); 

            			newLeafNode(this_EOL_3, grammarAccess.getAndAccess().getEOLTerminalRuleCall_3());
            		
            // InternalSheepDog.g:1144:3: ( ( (lv_table_4_0= ruleTable ) ) | ( (lv_text_5_0= ruleText ) ) )?
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_RAWTEXT) ) {
                alt20=2;
            }
            switch (alt20) {
                case 1 :
                    // InternalSheepDog.g:1145:4: ( (lv_table_4_0= ruleTable ) )
                    {
                    // InternalSheepDog.g:1145:4: ( (lv_table_4_0= ruleTable ) )
                    // InternalSheepDog.g:1146:5: (lv_table_4_0= ruleTable )
                    {
                    // InternalSheepDog.g:1146:5: (lv_table_4_0= ruleTable )
                    // InternalSheepDog.g:1147:6: lv_table_4_0= ruleTable
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getTableTableParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_table_4_0=ruleTable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						set(
                    							current,
                    							"table",
                    							lv_table_4_0,
                    							"org.farhan.dsl.sheepdog.SheepDog.Table");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSheepDog.g:1165:4: ( (lv_text_5_0= ruleText ) )
                    {
                    // InternalSheepDog.g:1165:4: ( (lv_text_5_0= ruleText ) )
                    // InternalSheepDog.g:1166:5: (lv_text_5_0= ruleText )
                    {
                    // InternalSheepDog.g:1166:5: (lv_text_5_0= ruleText )
                    // InternalSheepDog.g:1167:6: lv_text_5_0= ruleText
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getTextTextParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_text_5_0=ruleText();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						set(
                    							current,
                    							"text",
                    							lv_text_5_0,
                    							"org.farhan.dsl.sheepdog.SheepDog.Text");
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleText"
    // InternalSheepDog.g:1189:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalSheepDog.g:1189:45: (iv_ruleText= ruleText EOF )
            // InternalSheepDog.g:1190:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalSheepDog.g:1196:1: ruleText returns [EObject current=null] : ( ( (lv_name_0_0= RULE_RAWTEXT ) ) this_EOL_1= RULE_EOL ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_EOL_1=null;


        	enterRule();

        try {
            // InternalSheepDog.g:1202:2: ( ( ( (lv_name_0_0= RULE_RAWTEXT ) ) this_EOL_1= RULE_EOL ) )
            // InternalSheepDog.g:1203:2: ( ( (lv_name_0_0= RULE_RAWTEXT ) ) this_EOL_1= RULE_EOL )
            {
            // InternalSheepDog.g:1203:2: ( ( (lv_name_0_0= RULE_RAWTEXT ) ) this_EOL_1= RULE_EOL )
            // InternalSheepDog.g:1204:3: ( (lv_name_0_0= RULE_RAWTEXT ) ) this_EOL_1= RULE_EOL
            {
            // InternalSheepDog.g:1204:3: ( (lv_name_0_0= RULE_RAWTEXT ) )
            // InternalSheepDog.g:1205:4: (lv_name_0_0= RULE_RAWTEXT )
            {
            // InternalSheepDog.g:1205:4: (lv_name_0_0= RULE_RAWTEXT )
            // InternalSheepDog.g:1206:5: lv_name_0_0= RULE_RAWTEXT
            {
            lv_name_0_0=(Token)match(input,RULE_RAWTEXT,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTextAccess().getNameRAWTEXTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.farhan.dsl.sheepdog.SheepDog.RAWTEXT");
            				

            }


            }

            this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_2); 

            			newLeafNode(this_EOL_1, grammarAccess.getTextAccess().getEOLTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleTable"
    // InternalSheepDog.g:1230:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalSheepDog.g:1230:46: (iv_ruleTable= ruleTable EOF )
            // InternalSheepDog.g:1231:2: iv_ruleTable= ruleTable EOF
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
    // InternalSheepDog.g:1237:1: ruleTable returns [EObject current=null] : (otherlv_0= '|===' this_EOL_1= RULE_EOL ( (lv_rowList_2_0= ruleRow ) )+ otherlv_3= '|===' this_EOL_4= RULE_EOL ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EOL_1=null;
        Token otherlv_3=null;
        Token this_EOL_4=null;
        EObject lv_rowList_2_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1243:2: ( (otherlv_0= '|===' this_EOL_1= RULE_EOL ( (lv_rowList_2_0= ruleRow ) )+ otherlv_3= '|===' this_EOL_4= RULE_EOL ) )
            // InternalSheepDog.g:1244:2: (otherlv_0= '|===' this_EOL_1= RULE_EOL ( (lv_rowList_2_0= ruleRow ) )+ otherlv_3= '|===' this_EOL_4= RULE_EOL )
            {
            // InternalSheepDog.g:1244:2: (otherlv_0= '|===' this_EOL_1= RULE_EOL ( (lv_rowList_2_0= ruleRow ) )+ otherlv_3= '|===' this_EOL_4= RULE_EOL )
            // InternalSheepDog.g:1245:3: otherlv_0= '|===' this_EOL_1= RULE_EOL ( (lv_rowList_2_0= ruleRow ) )+ otherlv_3= '|===' this_EOL_4= RULE_EOL
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getVerticalLineEqualsSignEqualsSignEqualsSignKeyword_0());
            		
            this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_22); 

            			newLeafNode(this_EOL_1, grammarAccess.getTableAccess().getEOLTerminalRuleCall_1());
            		
            // InternalSheepDog.g:1253:3: ( (lv_rowList_2_0= ruleRow ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==24) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSheepDog.g:1254:4: (lv_rowList_2_0= ruleRow )
            	    {
            	    // InternalSheepDog.g:1254:4: (lv_rowList_2_0= ruleRow )
            	    // InternalSheepDog.g:1255:5: lv_rowList_2_0= ruleRow
            	    {

            	    					newCompositeNode(grammarAccess.getTableAccess().getRowListRowParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_rowList_2_0=ruleRow();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTableRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rowList",
            	    						lv_rowList_2_0,
            	    						"org.farhan.dsl.sheepdog.SheepDog.Row");
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

            otherlv_3=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getTableAccess().getVerticalLineEqualsSignEqualsSignEqualsSignKeyword_3());
            		
            this_EOL_4=(Token)match(input,RULE_EOL,FOLLOW_2); 

            			newLeafNode(this_EOL_4, grammarAccess.getTableAccess().getEOLTerminalRuleCall_4());
            		

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
    // InternalSheepDog.g:1284:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // InternalSheepDog.g:1284:44: (iv_ruleRow= ruleRow EOF )
            // InternalSheepDog.g:1285:2: iv_ruleRow= ruleRow EOF
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
    // InternalSheepDog.g:1291:1: ruleRow returns [EObject current=null] : ( ( (lv_cellList_0_0= ruleCell ) )+ this_EOL_1= RULE_EOL ) ;
    public final EObject ruleRow() throws RecognitionException {
        EObject current = null;

        Token this_EOL_1=null;
        EObject lv_cellList_0_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1297:2: ( ( ( (lv_cellList_0_0= ruleCell ) )+ this_EOL_1= RULE_EOL ) )
            // InternalSheepDog.g:1298:2: ( ( (lv_cellList_0_0= ruleCell ) )+ this_EOL_1= RULE_EOL )
            {
            // InternalSheepDog.g:1298:2: ( ( (lv_cellList_0_0= ruleCell ) )+ this_EOL_1= RULE_EOL )
            // InternalSheepDog.g:1299:3: ( (lv_cellList_0_0= ruleCell ) )+ this_EOL_1= RULE_EOL
            {
            // InternalSheepDog.g:1299:3: ( (lv_cellList_0_0= ruleCell ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==24) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSheepDog.g:1300:4: (lv_cellList_0_0= ruleCell )
            	    {
            	    // InternalSheepDog.g:1300:4: (lv_cellList_0_0= ruleCell )
            	    // InternalSheepDog.g:1301:5: lv_cellList_0_0= ruleCell
            	    {

            	    					newCompositeNode(grammarAccess.getRowAccess().getCellListCellParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_cellList_0_0=ruleCell();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRowRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cellList",
            	    						lv_cellList_0_0,
            	    						"org.farhan.dsl.sheepdog.SheepDog.Cell");
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
    // InternalSheepDog.g:1326:1: entryRuleCell returns [EObject current=null] : iv_ruleCell= ruleCell EOF ;
    public final EObject entryRuleCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCell = null;


        try {
            // InternalSheepDog.g:1326:45: (iv_ruleCell= ruleCell EOF )
            // InternalSheepDog.g:1327:2: iv_ruleCell= ruleCell EOF
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
    // InternalSheepDog.g:1333:1: ruleCell returns [EObject current=null] : (otherlv_0= '|' ( (lv_name_1_0= ruleTitle ) ) ) ;
    public final EObject ruleCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1339:2: ( (otherlv_0= '|' ( (lv_name_1_0= ruleTitle ) ) ) )
            // InternalSheepDog.g:1340:2: (otherlv_0= '|' ( (lv_name_1_0= ruleTitle ) ) )
            {
            // InternalSheepDog.g:1340:2: (otherlv_0= '|' ( (lv_name_1_0= ruleTitle ) ) )
            // InternalSheepDog.g:1341:3: otherlv_0= '|' ( (lv_name_1_0= ruleTitle ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCellAccess().getVerticalLineKeyword_0());
            		
            // InternalSheepDog.g:1345:3: ( (lv_name_1_0= ruleTitle ) )
            // InternalSheepDog.g:1346:4: (lv_name_1_0= ruleTitle )
            {
            // InternalSheepDog.g:1346:4: (lv_name_1_0= ruleTitle )
            // InternalSheepDog.g:1347:5: lv_name_1_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getCellAccess().getNameTitleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleTitle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCellRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.farhan.dsl.sheepdog.SheepDog.Title");
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
    // InternalSheepDog.g:1368:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalSheepDog.g:1368:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalSheepDog.g:1369:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalSheepDog.g:1375:1: ruleStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleTitle ) ) this_EOL_1= RULE_EOL ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token this_EOL_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1381:2: ( ( ( (lv_name_0_0= ruleTitle ) ) this_EOL_1= RULE_EOL ) )
            // InternalSheepDog.g:1382:2: ( ( (lv_name_0_0= ruleTitle ) ) this_EOL_1= RULE_EOL )
            {
            // InternalSheepDog.g:1382:2: ( ( (lv_name_0_0= ruleTitle ) ) this_EOL_1= RULE_EOL )
            // InternalSheepDog.g:1383:3: ( (lv_name_0_0= ruleTitle ) ) this_EOL_1= RULE_EOL
            {
            // InternalSheepDog.g:1383:3: ( (lv_name_0_0= ruleTitle ) )
            // InternalSheepDog.g:1384:4: (lv_name_0_0= ruleTitle )
            {
            // InternalSheepDog.g:1384:4: (lv_name_0_0= ruleTitle )
            // InternalSheepDog.g:1385:5: lv_name_0_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getStatementAccess().getNameTitleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_0_0=ruleTitle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.farhan.dsl.sheepdog.SheepDog.Title");
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


    // $ANTLR start "entryRuleTitle"
    // InternalSheepDog.g:1410:1: entryRuleTitle returns [String current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final String entryRuleTitle() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTitle = null;


        try {
            // InternalSheepDog.g:1410:45: (iv_ruleTitle= ruleTitle EOF )
            // InternalSheepDog.g:1411:2: iv_ruleTitle= ruleTitle EOF
            {
             newCompositeNode(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTitle=ruleTitle();

            state._fsp--;

             current =iv_ruleTitle.getText(); 
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
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalSheepDog.g:1417:1: ruleTitle returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WORD_0= RULE_WORD )+ ;
    public final AntlrDatatypeRuleToken ruleTitle() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;


        	enterRule();

        try {
            // InternalSheepDog.g:1423:2: ( (this_WORD_0= RULE_WORD )+ )
            // InternalSheepDog.g:1424:2: (this_WORD_0= RULE_WORD )+
            {
            // InternalSheepDog.g:1424:2: (this_WORD_0= RULE_WORD )+
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
            	    // InternalSheepDog.g:1425:3: this_WORD_0= RULE_WORD
            	    {
            	    this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_25); 

            	    			current.merge(this_WORD_0);
            	    		

            	    			newLeafNode(this_WORD_0, grammarAccess.getTitleAccess().getWORDTerminalRuleCall());
            	    		

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
    // $ANTLR end "ruleTitle"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000842L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002042L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800062L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000042L});

}
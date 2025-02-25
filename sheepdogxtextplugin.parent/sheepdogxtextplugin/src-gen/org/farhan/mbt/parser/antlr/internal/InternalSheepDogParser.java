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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_RAWTEXT", "RULE_WORD", "RULE_WS", "RULE_SL_COMMENT", "'='", "'Object:'", "'=='", "'Definition:'", "'==='", "'Parameters:'", "'Feature:'", "'Background:'", "'Scenario:'", "'Examples:'", "'Given:'", "'When:'", "'Then:'", "'And:'", "'|==='", "'[tags='", "']'", "'|'"
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
    public static final int T__26=26;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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
    // InternalSheepDog.g:107:1: ruleStepObject returns [EObject current=null] : (otherlv_0= '=' otherlv_1= 'Object:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statements_4_0= ruleStatement ) )* ( (lv_stepDefinitions_5_0= ruleStepDefinition ) )* ) ;
    public final EObject ruleStepObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_EOL_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_statements_4_0 = null;

        EObject lv_stepDefinitions_5_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:113:2: ( (otherlv_0= '=' otherlv_1= 'Object:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statements_4_0= ruleStatement ) )* ( (lv_stepDefinitions_5_0= ruleStepDefinition ) )* ) )
            // InternalSheepDog.g:114:2: (otherlv_0= '=' otherlv_1= 'Object:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statements_4_0= ruleStatement ) )* ( (lv_stepDefinitions_5_0= ruleStepDefinition ) )* )
            {
            // InternalSheepDog.g:114:2: (otherlv_0= '=' otherlv_1= 'Object:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statements_4_0= ruleStatement ) )* ( (lv_stepDefinitions_5_0= ruleStepDefinition ) )* )
            // InternalSheepDog.g:115:3: otherlv_0= '=' otherlv_1= 'Object:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statements_4_0= ruleStatement ) )* ( (lv_stepDefinitions_5_0= ruleStepDefinition ) )*
            {
            otherlv_0=(Token)match(input,9,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStepObjectAccess().getEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,10,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStepObjectAccess().getObjectKeyword_1());
            		
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
            						"org.farhan.mbt.SheepDog.Title");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_6); 

            			newLeafNode(this_EOL_3, grammarAccess.getStepObjectAccess().getEOLTerminalRuleCall_3());
            		
            // InternalSheepDog.g:146:3: ( (lv_statements_4_0= ruleStatement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_WORD) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSheepDog.g:147:4: (lv_statements_4_0= ruleStatement )
            	    {
            	    // InternalSheepDog.g:147:4: (lv_statements_4_0= ruleStatement )
            	    // InternalSheepDog.g:148:5: lv_statements_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getStepObjectAccess().getStatementsStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_statements_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStepObjectRule());
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
            	    break loop2;
                }
            } while (true);

            // InternalSheepDog.g:165:3: ( (lv_stepDefinitions_5_0= ruleStepDefinition ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSheepDog.g:166:4: (lv_stepDefinitions_5_0= ruleStepDefinition )
            	    {
            	    // InternalSheepDog.g:166:4: (lv_stepDefinitions_5_0= ruleStepDefinition )
            	    // InternalSheepDog.g:167:5: lv_stepDefinitions_5_0= ruleStepDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getStepObjectAccess().getStepDefinitionsStepDefinitionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_stepDefinitions_5_0=ruleStepDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStepObjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"stepDefinitions",
            	    						lv_stepDefinitions_5_0,
            	    						"org.farhan.mbt.SheepDog.StepDefinition");
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
    // InternalSheepDog.g:195:1: ruleStepDefinition returns [EObject current=null] : (otherlv_0= '==' otherlv_1= 'Definition:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statements_4_0= ruleStatement ) )* ( (lv_stepParameters_5_0= ruleStepParameters ) )* ) ;
    public final EObject ruleStepDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_EOL_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_statements_4_0 = null;

        EObject lv_stepParameters_5_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:201:2: ( (otherlv_0= '==' otherlv_1= 'Definition:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statements_4_0= ruleStatement ) )* ( (lv_stepParameters_5_0= ruleStepParameters ) )* ) )
            // InternalSheepDog.g:202:2: (otherlv_0= '==' otherlv_1= 'Definition:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statements_4_0= ruleStatement ) )* ( (lv_stepParameters_5_0= ruleStepParameters ) )* )
            {
            // InternalSheepDog.g:202:2: (otherlv_0= '==' otherlv_1= 'Definition:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statements_4_0= ruleStatement ) )* ( (lv_stepParameters_5_0= ruleStepParameters ) )* )
            // InternalSheepDog.g:203:3: otherlv_0= '==' otherlv_1= 'Definition:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statements_4_0= ruleStatement ) )* ( (lv_stepParameters_5_0= ruleStepParameters ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getStepDefinitionAccess().getEqualsSignEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStepDefinitionAccess().getDefinitionKeyword_1());
            		
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
            						"org.farhan.mbt.SheepDog.Title");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_9); 

            			newLeafNode(this_EOL_3, grammarAccess.getStepDefinitionAccess().getEOLTerminalRuleCall_3());
            		
            // InternalSheepDog.g:234:3: ( (lv_statements_4_0= ruleStatement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_WORD) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSheepDog.g:235:4: (lv_statements_4_0= ruleStatement )
            	    {
            	    // InternalSheepDog.g:235:4: (lv_statements_4_0= ruleStatement )
            	    // InternalSheepDog.g:236:5: lv_statements_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getStepDefinitionAccess().getStatementsStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_statements_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStepDefinitionRule());
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
            	    break loop4;
                }
            } while (true);

            // InternalSheepDog.g:253:3: ( (lv_stepParameters_5_0= ruleStepParameters ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSheepDog.g:254:4: (lv_stepParameters_5_0= ruleStepParameters )
            	    {
            	    // InternalSheepDog.g:254:4: (lv_stepParameters_5_0= ruleStepParameters )
            	    // InternalSheepDog.g:255:5: lv_stepParameters_5_0= ruleStepParameters
            	    {

            	    					newCompositeNode(grammarAccess.getStepDefinitionAccess().getStepParametersStepParametersParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_stepParameters_5_0=ruleStepParameters();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStepDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"stepParameters",
            	    						lv_stepParameters_5_0,
            	    						"org.farhan.mbt.SheepDog.StepParameters");
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
    // InternalSheepDog.g:283:1: ruleStepParameters returns [EObject current=null] : (otherlv_0= '===' otherlv_1= 'Parameters:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statements_4_0= ruleStatement ) )* ( (lv_parametersTable_5_0= ruleTable ) ) ) ;
    public final EObject ruleStepParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_EOL_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_statements_4_0 = null;

        EObject lv_parametersTable_5_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:289:2: ( (otherlv_0= '===' otherlv_1= 'Parameters:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statements_4_0= ruleStatement ) )* ( (lv_parametersTable_5_0= ruleTable ) ) ) )
            // InternalSheepDog.g:290:2: (otherlv_0= '===' otherlv_1= 'Parameters:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statements_4_0= ruleStatement ) )* ( (lv_parametersTable_5_0= ruleTable ) ) )
            {
            // InternalSheepDog.g:290:2: (otherlv_0= '===' otherlv_1= 'Parameters:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statements_4_0= ruleStatement ) )* ( (lv_parametersTable_5_0= ruleTable ) ) )
            // InternalSheepDog.g:291:3: otherlv_0= '===' otherlv_1= 'Parameters:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statements_4_0= ruleStatement ) )* ( (lv_parametersTable_5_0= ruleTable ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getStepParametersAccess().getEqualsSignEqualsSignEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStepParametersAccess().getParametersKeyword_1());
            		
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
            						"org.farhan.mbt.SheepDog.Title");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_12); 

            			newLeafNode(this_EOL_3, grammarAccess.getStepParametersAccess().getEOLTerminalRuleCall_3());
            		
            // InternalSheepDog.g:322:3: ( (lv_statements_4_0= ruleStatement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_WORD) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSheepDog.g:323:4: (lv_statements_4_0= ruleStatement )
            	    {
            	    // InternalSheepDog.g:323:4: (lv_statements_4_0= ruleStatement )
            	    // InternalSheepDog.g:324:5: lv_statements_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getStepParametersAccess().getStatementsStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_statements_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStepParametersRule());
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
            	    break loop6;
                }
            } while (true);

            // InternalSheepDog.g:341:3: ( (lv_parametersTable_5_0= ruleTable ) )
            // InternalSheepDog.g:342:4: (lv_parametersTable_5_0= ruleTable )
            {
            // InternalSheepDog.g:342:4: (lv_parametersTable_5_0= ruleTable )
            // InternalSheepDog.g:343:5: lv_parametersTable_5_0= ruleTable
            {

            					newCompositeNode(grammarAccess.getStepParametersAccess().getParametersTableTableParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_parametersTable_5_0=ruleTable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStepParametersRule());
            					}
            					set(
            						current,
            						"parametersTable",
            						lv_parametersTable_5_0,
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


    // $ANTLR start "entryRuleFeature"
    // InternalSheepDog.g:364:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalSheepDog.g:364:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalSheepDog.g:365:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalSheepDog.g:371:1: ruleFeature returns [EObject current=null] : (otherlv_0= '=' otherlv_1= 'Feature:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statements_4_0= ruleStatement ) )* ( (lv_abstractScenarios_5_0= ruleAbstractScenario ) )* ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_EOL_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_statements_4_0 = null;

        EObject lv_abstractScenarios_5_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:377:2: ( (otherlv_0= '=' otherlv_1= 'Feature:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statements_4_0= ruleStatement ) )* ( (lv_abstractScenarios_5_0= ruleAbstractScenario ) )* ) )
            // InternalSheepDog.g:378:2: (otherlv_0= '=' otherlv_1= 'Feature:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statements_4_0= ruleStatement ) )* ( (lv_abstractScenarios_5_0= ruleAbstractScenario ) )* )
            {
            // InternalSheepDog.g:378:2: (otherlv_0= '=' otherlv_1= 'Feature:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statements_4_0= ruleStatement ) )* ( (lv_abstractScenarios_5_0= ruleAbstractScenario ) )* )
            // InternalSheepDog.g:379:3: otherlv_0= '=' otherlv_1= 'Feature:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( (lv_statements_4_0= ruleStatement ) )* ( (lv_abstractScenarios_5_0= ruleAbstractScenario ) )*
            {
            otherlv_0=(Token)match(input,9,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureAccess().getEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getFeatureKeyword_1());
            		
            // InternalSheepDog.g:387:3: ( (lv_name_2_0= ruleTitle ) )
            // InternalSheepDog.g:388:4: (lv_name_2_0= ruleTitle )
            {
            // InternalSheepDog.g:388:4: (lv_name_2_0= ruleTitle )
            // InternalSheepDog.g:389:5: lv_name_2_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getNameTitleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleTitle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.farhan.mbt.SheepDog.Title");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_14); 

            			newLeafNode(this_EOL_3, grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_3());
            		
            // InternalSheepDog.g:410:3: ( (lv_statements_4_0= ruleStatement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_WORD) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSheepDog.g:411:4: (lv_statements_4_0= ruleStatement )
            	    {
            	    // InternalSheepDog.g:411:4: (lv_statements_4_0= ruleStatement )
            	    // InternalSheepDog.g:412:5: lv_statements_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureAccess().getStatementsStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_14);
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
            	    break loop7;
                }
            } while (true);

            // InternalSheepDog.g:429:3: ( (lv_abstractScenarios_5_0= ruleAbstractScenario ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==11||LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSheepDog.g:430:4: (lv_abstractScenarios_5_0= ruleAbstractScenario )
            	    {
            	    // InternalSheepDog.g:430:4: (lv_abstractScenarios_5_0= ruleAbstractScenario )
            	    // InternalSheepDog.g:431:5: lv_abstractScenarios_5_0= ruleAbstractScenario
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureAccess().getAbstractScenariosAbstractScenarioParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_abstractScenarios_5_0=ruleAbstractScenario();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"abstractScenarios",
            	    						lv_abstractScenarios_5_0,
            	    						"org.farhan.mbt.SheepDog.AbstractScenario");
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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleAbstractScenario"
    // InternalSheepDog.g:452:1: entryRuleAbstractScenario returns [EObject current=null] : iv_ruleAbstractScenario= ruleAbstractScenario EOF ;
    public final EObject entryRuleAbstractScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractScenario = null;


        try {
            // InternalSheepDog.g:452:57: (iv_ruleAbstractScenario= ruleAbstractScenario EOF )
            // InternalSheepDog.g:453:2: iv_ruleAbstractScenario= ruleAbstractScenario EOF
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
    // InternalSheepDog.g:459:1: ruleAbstractScenario returns [EObject current=null] : (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario ) ;
    public final EObject ruleAbstractScenario() throws RecognitionException {
        EObject current = null;

        EObject this_Background_0 = null;

        EObject this_Scenario_1 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:465:2: ( (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario ) )
            // InternalSheepDog.g:466:2: (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario )
            {
            // InternalSheepDog.g:466:2: (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==RULE_WORD) ) {
                    int LA9_3 = input.LA(3);

                    if ( (LA9_3==25) ) {
                        int LA9_6 = input.LA(4);

                        if ( (LA9_6==RULE_EOL) ) {
                            int LA9_7 = input.LA(5);

                            if ( (LA9_7==11) ) {
                                int LA9_2 = input.LA(6);

                                if ( (LA9_2==17) ) {
                                    alt9=2;
                                }
                                else if ( (LA9_2==16) ) {
                                    alt9=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 9, 2, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 9, 7, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0==11) ) {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==17) ) {
                    alt9=2;
                }
                else if ( (LA9_2==16) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

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
                    // InternalSheepDog.g:467:3: this_Background_0= ruleBackground
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
                    // InternalSheepDog.g:476:3: this_Scenario_1= ruleScenario
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


    // $ANTLR start "entryRuleBackground"
    // InternalSheepDog.g:488:1: entryRuleBackground returns [EObject current=null] : iv_ruleBackground= ruleBackground EOF ;
    public final EObject entryRuleBackground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackground = null;


        try {
            // InternalSheepDog.g:488:51: (iv_ruleBackground= ruleBackground EOF )
            // InternalSheepDog.g:489:2: iv_ruleBackground= ruleBackground EOF
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
    // InternalSheepDog.g:495:1: ruleBackground returns [EObject current=null] : ( ( (lv_tags_0_0= ruleAbstractScenarioTags ) )? otherlv_1= '==' otherlv_2= 'Background:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* ) ;
    public final EObject ruleBackground() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_EOL_4=null;
        EObject lv_tags_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_statements_5_0 = null;

        EObject lv_steps_6_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:501:2: ( ( ( (lv_tags_0_0= ruleAbstractScenarioTags ) )? otherlv_1= '==' otherlv_2= 'Background:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* ) )
            // InternalSheepDog.g:502:2: ( ( (lv_tags_0_0= ruleAbstractScenarioTags ) )? otherlv_1= '==' otherlv_2= 'Background:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* )
            {
            // InternalSheepDog.g:502:2: ( ( (lv_tags_0_0= ruleAbstractScenarioTags ) )? otherlv_1= '==' otherlv_2= 'Background:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* )
            // InternalSheepDog.g:503:3: ( (lv_tags_0_0= ruleAbstractScenarioTags ) )? otherlv_1= '==' otherlv_2= 'Background:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )*
            {
            // InternalSheepDog.g:503:3: ( (lv_tags_0_0= ruleAbstractScenarioTags ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSheepDog.g:504:4: (lv_tags_0_0= ruleAbstractScenarioTags )
                    {
                    // InternalSheepDog.g:504:4: (lv_tags_0_0= ruleAbstractScenarioTags )
                    // InternalSheepDog.g:505:5: lv_tags_0_0= ruleAbstractScenarioTags
                    {

                    					newCompositeNode(grammarAccess.getBackgroundAccess().getTagsAbstractScenarioTagsParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_tags_0_0=ruleAbstractScenarioTags();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBackgroundRule());
                    					}
                    					set(
                    						current,
                    						"tags",
                    						lv_tags_0_0,
                    						"org.farhan.mbt.SheepDog.AbstractScenarioTags");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,11,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getBackgroundAccess().getEqualsSignEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getBackgroundAccess().getBackgroundKeyword_2());
            		
            // InternalSheepDog.g:530:3: ( (lv_name_3_0= ruleTitle ) )
            // InternalSheepDog.g:531:4: (lv_name_3_0= ruleTitle )
            {
            // InternalSheepDog.g:531:4: (lv_name_3_0= ruleTitle )
            // InternalSheepDog.g:532:5: lv_name_3_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getBackgroundAccess().getNameTitleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_3_0=ruleTitle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBackgroundRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.farhan.mbt.SheepDog.Title");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_4=(Token)match(input,RULE_EOL,FOLLOW_9); 

            			newLeafNode(this_EOL_4, grammarAccess.getBackgroundAccess().getEOLTerminalRuleCall_4());
            		
            // InternalSheepDog.g:553:3: ( (lv_statements_5_0= ruleStatement ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_WORD) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSheepDog.g:554:4: (lv_statements_5_0= ruleStatement )
            	    {
            	    // InternalSheepDog.g:554:4: (lv_statements_5_0= ruleStatement )
            	    // InternalSheepDog.g:555:5: lv_statements_5_0= ruleStatement
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
            	    break loop11;
                }
            } while (true);

            // InternalSheepDog.g:572:3: ( (lv_steps_6_0= ruleStep ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==13) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSheepDog.g:573:4: (lv_steps_6_0= ruleStep )
            	    {
            	    // InternalSheepDog.g:573:4: (lv_steps_6_0= ruleStep )
            	    // InternalSheepDog.g:574:5: lv_steps_6_0= ruleStep
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
            	    break loop12;
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
    // InternalSheepDog.g:595:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalSheepDog.g:595:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalSheepDog.g:596:2: iv_ruleScenario= ruleScenario EOF
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
    // InternalSheepDog.g:602:1: ruleScenario returns [EObject current=null] : ( ( (lv_tags_0_0= ruleAbstractScenarioTags ) )? otherlv_1= '==' otherlv_2= 'Scenario:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* ( (lv_examples_7_0= ruleExamples ) )* ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_EOL_4=null;
        EObject lv_tags_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_statements_5_0 = null;

        EObject lv_steps_6_0 = null;

        EObject lv_examples_7_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:608:2: ( ( ( (lv_tags_0_0= ruleAbstractScenarioTags ) )? otherlv_1= '==' otherlv_2= 'Scenario:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* ( (lv_examples_7_0= ruleExamples ) )* ) )
            // InternalSheepDog.g:609:2: ( ( (lv_tags_0_0= ruleAbstractScenarioTags ) )? otherlv_1= '==' otherlv_2= 'Scenario:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* ( (lv_examples_7_0= ruleExamples ) )* )
            {
            // InternalSheepDog.g:609:2: ( ( (lv_tags_0_0= ruleAbstractScenarioTags ) )? otherlv_1= '==' otherlv_2= 'Scenario:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* ( (lv_examples_7_0= ruleExamples ) )* )
            // InternalSheepDog.g:610:3: ( (lv_tags_0_0= ruleAbstractScenarioTags ) )? otherlv_1= '==' otherlv_2= 'Scenario:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* ( (lv_examples_7_0= ruleExamples ) )*
            {
            // InternalSheepDog.g:610:3: ( (lv_tags_0_0= ruleAbstractScenarioTags ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSheepDog.g:611:4: (lv_tags_0_0= ruleAbstractScenarioTags )
                    {
                    // InternalSheepDog.g:611:4: (lv_tags_0_0= ruleAbstractScenarioTags )
                    // InternalSheepDog.g:612:5: lv_tags_0_0= ruleAbstractScenarioTags
                    {

                    					newCompositeNode(grammarAccess.getScenarioAccess().getTagsAbstractScenarioTagsParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_tags_0_0=ruleAbstractScenarioTags();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getScenarioRule());
                    					}
                    					set(
                    						current,
                    						"tags",
                    						lv_tags_0_0,
                    						"org.farhan.mbt.SheepDog.AbstractScenarioTags");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,11,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getScenarioAccess().getEqualsSignEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getScenarioKeyword_2());
            		
            // InternalSheepDog.g:637:3: ( (lv_name_3_0= ruleTitle ) )
            // InternalSheepDog.g:638:4: (lv_name_3_0= ruleTitle )
            {
            // InternalSheepDog.g:638:4: (lv_name_3_0= ruleTitle )
            // InternalSheepDog.g:639:5: lv_name_3_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getScenarioAccess().getNameTitleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_3_0=ruleTitle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.farhan.mbt.SheepDog.Title");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_4=(Token)match(input,RULE_EOL,FOLLOW_19); 

            			newLeafNode(this_EOL_4, grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_4());
            		
            // InternalSheepDog.g:660:3: ( (lv_statements_5_0= ruleStatement ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_WORD) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSheepDog.g:661:4: (lv_statements_5_0= ruleStatement )
            	    {
            	    // InternalSheepDog.g:661:4: (lv_statements_5_0= ruleStatement )
            	    // InternalSheepDog.g:662:5: lv_statements_5_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getStatementsStatementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_statements_5_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioRule());
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
            	    break loop14;
                }
            } while (true);

            // InternalSheepDog.g:679:3: ( (lv_steps_6_0= ruleStep ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==13) ) {
                    int LA15_2 = input.LA(2);

                    if ( ((LA15_2>=19 && LA15_2<=22)) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalSheepDog.g:680:4: (lv_steps_6_0= ruleStep )
            	    {
            	    // InternalSheepDog.g:680:4: (lv_steps_6_0= ruleStep )
            	    // InternalSheepDog.g:681:5: lv_steps_6_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_steps_6_0=ruleStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioRule());
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
            	    break loop15;
                }
            } while (true);

            // InternalSheepDog.g:698:3: ( (lv_examples_7_0= ruleExamples ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    int LA16_2 = input.LA(2);

                    if ( (LA16_2==RULE_WORD) ) {
                        int LA16_4 = input.LA(3);

                        if ( (LA16_4==25) ) {
                            int LA16_5 = input.LA(4);

                            if ( (LA16_5==RULE_EOL) ) {
                                int LA16_6 = input.LA(5);

                                if ( (LA16_6==13) ) {
                                    alt16=1;
                                }


                            }


                        }


                    }


                }
                else if ( (LA16_0==13) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSheepDog.g:699:4: (lv_examples_7_0= ruleExamples )
            	    {
            	    // InternalSheepDog.g:699:4: (lv_examples_7_0= ruleExamples )
            	    // InternalSheepDog.g:700:5: lv_examples_7_0= ruleExamples
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getExamplesExamplesParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_examples_7_0=ruleExamples();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"examples",
            	    						lv_examples_7_0,
            	    						"org.farhan.mbt.SheepDog.Examples");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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


    // $ANTLR start "entryRuleExamples"
    // InternalSheepDog.g:721:1: entryRuleExamples returns [EObject current=null] : iv_ruleExamples= ruleExamples EOF ;
    public final EObject entryRuleExamples() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExamples = null;


        try {
            // InternalSheepDog.g:721:49: (iv_ruleExamples= ruleExamples EOF )
            // InternalSheepDog.g:722:2: iv_ruleExamples= ruleExamples EOF
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
    // InternalSheepDog.g:728:1: ruleExamples returns [EObject current=null] : ( ( (lv_tags_0_0= ruleAbstractScenarioTags ) )? otherlv_1= '===' otherlv_2= 'Examples:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_theExamplesTable_6_0= ruleTable ) ) ) ;
    public final EObject ruleExamples() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_EOL_4=null;
        EObject lv_tags_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_statements_5_0 = null;

        EObject lv_theExamplesTable_6_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:734:2: ( ( ( (lv_tags_0_0= ruleAbstractScenarioTags ) )? otherlv_1= '===' otherlv_2= 'Examples:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_theExamplesTable_6_0= ruleTable ) ) ) )
            // InternalSheepDog.g:735:2: ( ( (lv_tags_0_0= ruleAbstractScenarioTags ) )? otherlv_1= '===' otherlv_2= 'Examples:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_theExamplesTable_6_0= ruleTable ) ) )
            {
            // InternalSheepDog.g:735:2: ( ( (lv_tags_0_0= ruleAbstractScenarioTags ) )? otherlv_1= '===' otherlv_2= 'Examples:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_theExamplesTable_6_0= ruleTable ) ) )
            // InternalSheepDog.g:736:3: ( (lv_tags_0_0= ruleAbstractScenarioTags ) )? otherlv_1= '===' otherlv_2= 'Examples:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_theExamplesTable_6_0= ruleTable ) )
            {
            // InternalSheepDog.g:736:3: ( (lv_tags_0_0= ruleAbstractScenarioTags ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSheepDog.g:737:4: (lv_tags_0_0= ruleAbstractScenarioTags )
                    {
                    // InternalSheepDog.g:737:4: (lv_tags_0_0= ruleAbstractScenarioTags )
                    // InternalSheepDog.g:738:5: lv_tags_0_0= ruleAbstractScenarioTags
                    {

                    					newCompositeNode(grammarAccess.getExamplesAccess().getTagsAbstractScenarioTagsParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_tags_0_0=ruleAbstractScenarioTags();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExamplesRule());
                    					}
                    					set(
                    						current,
                    						"tags",
                    						lv_tags_0_0,
                    						"org.farhan.mbt.SheepDog.AbstractScenarioTags");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,13,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getExamplesAccess().getEqualsSignEqualsSignEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getExamplesAccess().getExamplesKeyword_2());
            		
            // InternalSheepDog.g:763:3: ( (lv_name_3_0= ruleTitle ) )
            // InternalSheepDog.g:764:4: (lv_name_3_0= ruleTitle )
            {
            // InternalSheepDog.g:764:4: (lv_name_3_0= ruleTitle )
            // InternalSheepDog.g:765:5: lv_name_3_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getExamplesAccess().getNameTitleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_3_0=ruleTitle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExamplesRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.farhan.mbt.SheepDog.Title");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_4=(Token)match(input,RULE_EOL,FOLLOW_12); 

            			newLeafNode(this_EOL_4, grammarAccess.getExamplesAccess().getEOLTerminalRuleCall_4());
            		
            // InternalSheepDog.g:786:3: ( (lv_statements_5_0= ruleStatement ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_WORD) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSheepDog.g:787:4: (lv_statements_5_0= ruleStatement )
            	    {
            	    // InternalSheepDog.g:787:4: (lv_statements_5_0= ruleStatement )
            	    // InternalSheepDog.g:788:5: lv_statements_5_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getExamplesAccess().getStatementsStatementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_12);
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
            	    break loop18;
                }
            } while (true);

            // InternalSheepDog.g:805:3: ( (lv_theExamplesTable_6_0= ruleTable ) )
            // InternalSheepDog.g:806:4: (lv_theExamplesTable_6_0= ruleTable )
            {
            // InternalSheepDog.g:806:4: (lv_theExamplesTable_6_0= ruleTable )
            // InternalSheepDog.g:807:5: lv_theExamplesTable_6_0= ruleTable
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


    // $ANTLR start "entryRuleStep"
    // InternalSheepDog.g:828:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalSheepDog.g:828:45: (iv_ruleStep= ruleStep EOF )
            // InternalSheepDog.g:829:2: iv_ruleStep= ruleStep EOF
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
    // InternalSheepDog.g:835:1: ruleStep returns [EObject current=null] : (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen | this_And_3= ruleAnd ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        EObject this_Given_0 = null;

        EObject this_When_1 = null;

        EObject this_Then_2 = null;

        EObject this_And_3 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:841:2: ( (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen | this_And_3= ruleAnd ) )
            // InternalSheepDog.g:842:2: (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen | this_And_3= ruleAnd )
            {
            // InternalSheepDog.g:842:2: (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen | this_And_3= ruleAnd )
            int alt19=4;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==13) ) {
                switch ( input.LA(2) ) {
                case 22:
                    {
                    alt19=4;
                    }
                    break;
                case 21:
                    {
                    alt19=3;
                    }
                    break;
                case 20:
                    {
                    alt19=2;
                    }
                    break;
                case 19:
                    {
                    alt19=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalSheepDog.g:843:3: this_Given_0= ruleGiven
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
                    // InternalSheepDog.g:852:3: this_When_1= ruleWhen
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
                    // InternalSheepDog.g:861:3: this_Then_2= ruleThen
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getThenParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Then_2=ruleThen();

                    state._fsp--;


                    			current = this_Then_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSheepDog.g:870:3: this_And_3= ruleAnd
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getAndParserRuleCall_3());
                    		
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
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleGiven"
    // InternalSheepDog.g:882:1: entryRuleGiven returns [EObject current=null] : iv_ruleGiven= ruleGiven EOF ;
    public final EObject entryRuleGiven() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGiven = null;


        try {
            // InternalSheepDog.g:882:46: (iv_ruleGiven= ruleGiven EOF )
            // InternalSheepDog.g:883:2: iv_ruleGiven= ruleGiven EOF
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
    // InternalSheepDog.g:889:1: ruleGiven returns [EObject current=null] : (otherlv_0= '===' otherlv_1= 'Given:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? ) ;
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
            // InternalSheepDog.g:895:2: ( (otherlv_0= '===' otherlv_1= 'Given:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? ) )
            // InternalSheepDog.g:896:2: (otherlv_0= '===' otherlv_1= 'Given:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? )
            {
            // InternalSheepDog.g:896:2: (otherlv_0= '===' otherlv_1= 'Given:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? )
            // InternalSheepDog.g:897:3: otherlv_0= '===' otherlv_1= 'Given:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getGivenAccess().getEqualsSignEqualsSignEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGivenAccess().getGivenKeyword_1());
            		
            // InternalSheepDog.g:905:3: ( (lv_name_2_0= ruleTitle ) )
            // InternalSheepDog.g:906:4: (lv_name_2_0= ruleTitle )
            {
            // InternalSheepDog.g:906:4: (lv_name_2_0= ruleTitle )
            // InternalSheepDog.g:907:5: lv_name_2_0= ruleTitle
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
            						"org.farhan.mbt.SheepDog.Title");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_24); 

            			newLeafNode(this_EOL_3, grammarAccess.getGivenAccess().getEOLTerminalRuleCall_3());
            		
            // InternalSheepDog.g:928:3: ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )?
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
                    // InternalSheepDog.g:929:4: ( (lv_theStepTable_4_0= ruleTable ) )
                    {
                    // InternalSheepDog.g:929:4: ( (lv_theStepTable_4_0= ruleTable ) )
                    // InternalSheepDog.g:930:5: (lv_theStepTable_4_0= ruleTable )
                    {
                    // InternalSheepDog.g:930:5: (lv_theStepTable_4_0= ruleTable )
                    // InternalSheepDog.g:931:6: lv_theStepTable_4_0= ruleTable
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
                    // InternalSheepDog.g:949:4: ( (lv_theDocString_5_0= ruleDocString ) )
                    {
                    // InternalSheepDog.g:949:4: ( (lv_theDocString_5_0= ruleDocString ) )
                    // InternalSheepDog.g:950:5: (lv_theDocString_5_0= ruleDocString )
                    {
                    // InternalSheepDog.g:950:5: (lv_theDocString_5_0= ruleDocString )
                    // InternalSheepDog.g:951:6: lv_theDocString_5_0= ruleDocString
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
    // InternalSheepDog.g:973:1: entryRuleWhen returns [EObject current=null] : iv_ruleWhen= ruleWhen EOF ;
    public final EObject entryRuleWhen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhen = null;


        try {
            // InternalSheepDog.g:973:45: (iv_ruleWhen= ruleWhen EOF )
            // InternalSheepDog.g:974:2: iv_ruleWhen= ruleWhen EOF
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
    // InternalSheepDog.g:980:1: ruleWhen returns [EObject current=null] : (otherlv_0= '===' otherlv_1= 'When:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? ) ;
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
            // InternalSheepDog.g:986:2: ( (otherlv_0= '===' otherlv_1= 'When:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? ) )
            // InternalSheepDog.g:987:2: (otherlv_0= '===' otherlv_1= 'When:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? )
            {
            // InternalSheepDog.g:987:2: (otherlv_0= '===' otherlv_1= 'When:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? )
            // InternalSheepDog.g:988:3: otherlv_0= '===' otherlv_1= 'When:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getWhenAccess().getEqualsSignEqualsSignEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getWhenAccess().getWhenKeyword_1());
            		
            // InternalSheepDog.g:996:3: ( (lv_name_2_0= ruleTitle ) )
            // InternalSheepDog.g:997:4: (lv_name_2_0= ruleTitle )
            {
            // InternalSheepDog.g:997:4: (lv_name_2_0= ruleTitle )
            // InternalSheepDog.g:998:5: lv_name_2_0= ruleTitle
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
            						"org.farhan.mbt.SheepDog.Title");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_24); 

            			newLeafNode(this_EOL_3, grammarAccess.getWhenAccess().getEOLTerminalRuleCall_3());
            		
            // InternalSheepDog.g:1019:3: ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )?
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_RAWTEXT) ) {
                alt21=2;
            }
            switch (alt21) {
                case 1 :
                    // InternalSheepDog.g:1020:4: ( (lv_theStepTable_4_0= ruleTable ) )
                    {
                    // InternalSheepDog.g:1020:4: ( (lv_theStepTable_4_0= ruleTable ) )
                    // InternalSheepDog.g:1021:5: (lv_theStepTable_4_0= ruleTable )
                    {
                    // InternalSheepDog.g:1021:5: (lv_theStepTable_4_0= ruleTable )
                    // InternalSheepDog.g:1022:6: lv_theStepTable_4_0= ruleTable
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
                    // InternalSheepDog.g:1040:4: ( (lv_theDocString_5_0= ruleDocString ) )
                    {
                    // InternalSheepDog.g:1040:4: ( (lv_theDocString_5_0= ruleDocString ) )
                    // InternalSheepDog.g:1041:5: (lv_theDocString_5_0= ruleDocString )
                    {
                    // InternalSheepDog.g:1041:5: (lv_theDocString_5_0= ruleDocString )
                    // InternalSheepDog.g:1042:6: lv_theDocString_5_0= ruleDocString
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
    // InternalSheepDog.g:1064:1: entryRuleThen returns [EObject current=null] : iv_ruleThen= ruleThen EOF ;
    public final EObject entryRuleThen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThen = null;


        try {
            // InternalSheepDog.g:1064:45: (iv_ruleThen= ruleThen EOF )
            // InternalSheepDog.g:1065:2: iv_ruleThen= ruleThen EOF
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
    // InternalSheepDog.g:1071:1: ruleThen returns [EObject current=null] : (otherlv_0= '===' otherlv_1= 'Then:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? ) ;
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
            // InternalSheepDog.g:1077:2: ( (otherlv_0= '===' otherlv_1= 'Then:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? ) )
            // InternalSheepDog.g:1078:2: (otherlv_0= '===' otherlv_1= 'Then:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? )
            {
            // InternalSheepDog.g:1078:2: (otherlv_0= '===' otherlv_1= 'Then:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? )
            // InternalSheepDog.g:1079:3: otherlv_0= '===' otherlv_1= 'Then:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getThenAccess().getEqualsSignEqualsSignEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getThenAccess().getThenKeyword_1());
            		
            // InternalSheepDog.g:1087:3: ( (lv_name_2_0= ruleTitle ) )
            // InternalSheepDog.g:1088:4: (lv_name_2_0= ruleTitle )
            {
            // InternalSheepDog.g:1088:4: (lv_name_2_0= ruleTitle )
            // InternalSheepDog.g:1089:5: lv_name_2_0= ruleTitle
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
            						"org.farhan.mbt.SheepDog.Title");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_24); 

            			newLeafNode(this_EOL_3, grammarAccess.getThenAccess().getEOLTerminalRuleCall_3());
            		
            // InternalSheepDog.g:1110:3: ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )?
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_RAWTEXT) ) {
                alt22=2;
            }
            switch (alt22) {
                case 1 :
                    // InternalSheepDog.g:1111:4: ( (lv_theStepTable_4_0= ruleTable ) )
                    {
                    // InternalSheepDog.g:1111:4: ( (lv_theStepTable_4_0= ruleTable ) )
                    // InternalSheepDog.g:1112:5: (lv_theStepTable_4_0= ruleTable )
                    {
                    // InternalSheepDog.g:1112:5: (lv_theStepTable_4_0= ruleTable )
                    // InternalSheepDog.g:1113:6: lv_theStepTable_4_0= ruleTable
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
                    // InternalSheepDog.g:1131:4: ( (lv_theDocString_5_0= ruleDocString ) )
                    {
                    // InternalSheepDog.g:1131:4: ( (lv_theDocString_5_0= ruleDocString ) )
                    // InternalSheepDog.g:1132:5: (lv_theDocString_5_0= ruleDocString )
                    {
                    // InternalSheepDog.g:1132:5: (lv_theDocString_5_0= ruleDocString )
                    // InternalSheepDog.g:1133:6: lv_theDocString_5_0= ruleDocString
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


    // $ANTLR start "entryRuleAnd"
    // InternalSheepDog.g:1155:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalSheepDog.g:1155:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalSheepDog.g:1156:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalSheepDog.g:1162:1: ruleAnd returns [EObject current=null] : (otherlv_0= '===' otherlv_1= 'And:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_EOL_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_theStepTable_4_0 = null;

        EObject lv_theDocString_5_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1168:2: ( (otherlv_0= '===' otherlv_1= 'And:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? ) )
            // InternalSheepDog.g:1169:2: (otherlv_0= '===' otherlv_1= 'And:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? )
            {
            // InternalSheepDog.g:1169:2: (otherlv_0= '===' otherlv_1= 'And:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? )
            // InternalSheepDog.g:1170:3: otherlv_0= '===' otherlv_1= 'And:' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getAndAccess().getEqualsSignEqualsSignEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAndAccess().getAndKeyword_1());
            		
            // InternalSheepDog.g:1178:3: ( (lv_name_2_0= ruleTitle ) )
            // InternalSheepDog.g:1179:4: (lv_name_2_0= ruleTitle )
            {
            // InternalSheepDog.g:1179:4: (lv_name_2_0= ruleTitle )
            // InternalSheepDog.g:1180:5: lv_name_2_0= ruleTitle
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
            						"org.farhan.mbt.SheepDog.Title");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_24); 

            			newLeafNode(this_EOL_3, grammarAccess.getAndAccess().getEOLTerminalRuleCall_3());
            		
            // InternalSheepDog.g:1201:3: ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )?
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_RAWTEXT) ) {
                alt23=2;
            }
            switch (alt23) {
                case 1 :
                    // InternalSheepDog.g:1202:4: ( (lv_theStepTable_4_0= ruleTable ) )
                    {
                    // InternalSheepDog.g:1202:4: ( (lv_theStepTable_4_0= ruleTable ) )
                    // InternalSheepDog.g:1203:5: (lv_theStepTable_4_0= ruleTable )
                    {
                    // InternalSheepDog.g:1203:5: (lv_theStepTable_4_0= ruleTable )
                    // InternalSheepDog.g:1204:6: lv_theStepTable_4_0= ruleTable
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getTheStepTableTableParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_theStepTable_4_0=ruleTable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
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
                    // InternalSheepDog.g:1222:4: ( (lv_theDocString_5_0= ruleDocString ) )
                    {
                    // InternalSheepDog.g:1222:4: ( (lv_theDocString_5_0= ruleDocString ) )
                    // InternalSheepDog.g:1223:5: (lv_theDocString_5_0= ruleDocString )
                    {
                    // InternalSheepDog.g:1223:5: (lv_theDocString_5_0= ruleDocString )
                    // InternalSheepDog.g:1224:6: lv_theDocString_5_0= ruleDocString
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getTheDocStringDocStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_theDocString_5_0=ruleDocString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleDocString"
    // InternalSheepDog.g:1246:1: entryRuleDocString returns [EObject current=null] : iv_ruleDocString= ruleDocString EOF ;
    public final EObject entryRuleDocString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocString = null;


        try {
            // InternalSheepDog.g:1246:50: (iv_ruleDocString= ruleDocString EOF )
            // InternalSheepDog.g:1247:2: iv_ruleDocString= ruleDocString EOF
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
    // InternalSheepDog.g:1253:1: ruleDocString returns [EObject current=null] : ( ( (lv_name_0_0= RULE_RAWTEXT ) ) this_EOL_1= RULE_EOL ) ;
    public final EObject ruleDocString() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_EOL_1=null;


        	enterRule();

        try {
            // InternalSheepDog.g:1259:2: ( ( ( (lv_name_0_0= RULE_RAWTEXT ) ) this_EOL_1= RULE_EOL ) )
            // InternalSheepDog.g:1260:2: ( ( (lv_name_0_0= RULE_RAWTEXT ) ) this_EOL_1= RULE_EOL )
            {
            // InternalSheepDog.g:1260:2: ( ( (lv_name_0_0= RULE_RAWTEXT ) ) this_EOL_1= RULE_EOL )
            // InternalSheepDog.g:1261:3: ( (lv_name_0_0= RULE_RAWTEXT ) ) this_EOL_1= RULE_EOL
            {
            // InternalSheepDog.g:1261:3: ( (lv_name_0_0= RULE_RAWTEXT ) )
            // InternalSheepDog.g:1262:4: (lv_name_0_0= RULE_RAWTEXT )
            {
            // InternalSheepDog.g:1262:4: (lv_name_0_0= RULE_RAWTEXT )
            // InternalSheepDog.g:1263:5: lv_name_0_0= RULE_RAWTEXT
            {
            lv_name_0_0=(Token)match(input,RULE_RAWTEXT,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDocStringAccess().getNameRAWTEXTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDocStringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.farhan.mbt.SheepDog.RAWTEXT");
            				

            }


            }

            this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_2); 

            			newLeafNode(this_EOL_1, grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_1());
            		

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


    // $ANTLR start "entryRuleTable"
    // InternalSheepDog.g:1287:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalSheepDog.g:1287:46: (iv_ruleTable= ruleTable EOF )
            // InternalSheepDog.g:1288:2: iv_ruleTable= ruleTable EOF
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
    // InternalSheepDog.g:1294:1: ruleTable returns [EObject current=null] : (otherlv_0= '|===' this_EOL_1= RULE_EOL ( (lv_rows_2_0= ruleRow ) )+ otherlv_3= '|===' this_EOL_4= RULE_EOL ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EOL_1=null;
        Token otherlv_3=null;
        Token this_EOL_4=null;
        EObject lv_rows_2_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1300:2: ( (otherlv_0= '|===' this_EOL_1= RULE_EOL ( (lv_rows_2_0= ruleRow ) )+ otherlv_3= '|===' this_EOL_4= RULE_EOL ) )
            // InternalSheepDog.g:1301:2: (otherlv_0= '|===' this_EOL_1= RULE_EOL ( (lv_rows_2_0= ruleRow ) )+ otherlv_3= '|===' this_EOL_4= RULE_EOL )
            {
            // InternalSheepDog.g:1301:2: (otherlv_0= '|===' this_EOL_1= RULE_EOL ( (lv_rows_2_0= ruleRow ) )+ otherlv_3= '|===' this_EOL_4= RULE_EOL )
            // InternalSheepDog.g:1302:3: otherlv_0= '|===' this_EOL_1= RULE_EOL ( (lv_rows_2_0= ruleRow ) )+ otherlv_3= '|===' this_EOL_4= RULE_EOL
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getVerticalLineEqualsSignEqualsSignEqualsSignKeyword_0());
            		
            this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_28); 

            			newLeafNode(this_EOL_1, grammarAccess.getTableAccess().getEOLTerminalRuleCall_1());
            		
            // InternalSheepDog.g:1310:3: ( (lv_rows_2_0= ruleRow ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==26) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSheepDog.g:1311:4: (lv_rows_2_0= ruleRow )
            	    {
            	    // InternalSheepDog.g:1311:4: (lv_rows_2_0= ruleRow )
            	    // InternalSheepDog.g:1312:5: lv_rows_2_0= ruleRow
            	    {

            	    					newCompositeNode(grammarAccess.getTableAccess().getRowsRowParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_rows_2_0=ruleRow();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTableRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rows",
            	    						lv_rows_2_0,
            	    						"org.farhan.mbt.SheepDog.Row");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
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
    // InternalSheepDog.g:1341:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // InternalSheepDog.g:1341:44: (iv_ruleRow= ruleRow EOF )
            // InternalSheepDog.g:1342:2: iv_ruleRow= ruleRow EOF
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
    // InternalSheepDog.g:1348:1: ruleRow returns [EObject current=null] : ( ( (lv_cells_0_0= ruleCell ) )+ this_EOL_1= RULE_EOL ) ;
    public final EObject ruleRow() throws RecognitionException {
        EObject current = null;

        Token this_EOL_1=null;
        EObject lv_cells_0_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1354:2: ( ( ( (lv_cells_0_0= ruleCell ) )+ this_EOL_1= RULE_EOL ) )
            // InternalSheepDog.g:1355:2: ( ( (lv_cells_0_0= ruleCell ) )+ this_EOL_1= RULE_EOL )
            {
            // InternalSheepDog.g:1355:2: ( ( (lv_cells_0_0= ruleCell ) )+ this_EOL_1= RULE_EOL )
            // InternalSheepDog.g:1356:3: ( (lv_cells_0_0= ruleCell ) )+ this_EOL_1= RULE_EOL
            {
            // InternalSheepDog.g:1356:3: ( (lv_cells_0_0= ruleCell ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==26) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSheepDog.g:1357:4: (lv_cells_0_0= ruleCell )
            	    {
            	    // InternalSheepDog.g:1357:4: (lv_cells_0_0= ruleCell )
            	    // InternalSheepDog.g:1358:5: lv_cells_0_0= ruleCell
            	    {

            	    					newCompositeNode(grammarAccess.getRowAccess().getCellsCellParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_30);
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
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
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


    // $ANTLR start "entryRuleAbstractScenarioTags"
    // InternalSheepDog.g:1383:1: entryRuleAbstractScenarioTags returns [EObject current=null] : iv_ruleAbstractScenarioTags= ruleAbstractScenarioTags EOF ;
    public final EObject entryRuleAbstractScenarioTags() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractScenarioTags = null;


        try {
            // InternalSheepDog.g:1383:61: (iv_ruleAbstractScenarioTags= ruleAbstractScenarioTags EOF )
            // InternalSheepDog.g:1384:2: iv_ruleAbstractScenarioTags= ruleAbstractScenarioTags EOF
            {
             newCompositeNode(grammarAccess.getAbstractScenarioTagsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractScenarioTags=ruleAbstractScenarioTags();

            state._fsp--;

             current =iv_ruleAbstractScenarioTags; 
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
    // $ANTLR end "entryRuleAbstractScenarioTags"


    // $ANTLR start "ruleAbstractScenarioTags"
    // InternalSheepDog.g:1390:1: ruleAbstractScenarioTags returns [EObject current=null] : (otherlv_0= '[tags=' ( (lv_name_1_0= RULE_WORD ) ) otherlv_2= ']' this_EOL_3= RULE_EOL ) ;
    public final EObject ruleAbstractScenarioTags() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_EOL_3=null;


        	enterRule();

        try {
            // InternalSheepDog.g:1396:2: ( (otherlv_0= '[tags=' ( (lv_name_1_0= RULE_WORD ) ) otherlv_2= ']' this_EOL_3= RULE_EOL ) )
            // InternalSheepDog.g:1397:2: (otherlv_0= '[tags=' ( (lv_name_1_0= RULE_WORD ) ) otherlv_2= ']' this_EOL_3= RULE_EOL )
            {
            // InternalSheepDog.g:1397:2: (otherlv_0= '[tags=' ( (lv_name_1_0= RULE_WORD ) ) otherlv_2= ']' this_EOL_3= RULE_EOL )
            // InternalSheepDog.g:1398:3: otherlv_0= '[tags=' ( (lv_name_1_0= RULE_WORD ) ) otherlv_2= ']' this_EOL_3= RULE_EOL
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAbstractScenarioTagsAccess().getTagsKeyword_0());
            		
            // InternalSheepDog.g:1402:3: ( (lv_name_1_0= RULE_WORD ) )
            // InternalSheepDog.g:1403:4: (lv_name_1_0= RULE_WORD )
            {
            // InternalSheepDog.g:1403:4: (lv_name_1_0= RULE_WORD )
            // InternalSheepDog.g:1404:5: lv_name_1_0= RULE_WORD
            {
            lv_name_1_0=(Token)match(input,RULE_WORD,FOLLOW_31); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAbstractScenarioTagsAccess().getNameWORDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAbstractScenarioTagsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.farhan.mbt.SheepDog.WORD");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getAbstractScenarioTagsAccess().getRightSquareBracketKeyword_2());
            		
            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_2); 

            			newLeafNode(this_EOL_3, grammarAccess.getAbstractScenarioTagsAccess().getEOLTerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleAbstractScenarioTags"


    // $ANTLR start "entryRuleCell"
    // InternalSheepDog.g:1432:1: entryRuleCell returns [EObject current=null] : iv_ruleCell= ruleCell EOF ;
    public final EObject entryRuleCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCell = null;


        try {
            // InternalSheepDog.g:1432:45: (iv_ruleCell= ruleCell EOF )
            // InternalSheepDog.g:1433:2: iv_ruleCell= ruleCell EOF
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
    // InternalSheepDog.g:1439:1: ruleCell returns [EObject current=null] : (otherlv_0= '|' ( (lv_name_1_0= ruleTitle ) ) ) ;
    public final EObject ruleCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1445:2: ( (otherlv_0= '|' ( (lv_name_1_0= ruleTitle ) ) ) )
            // InternalSheepDog.g:1446:2: (otherlv_0= '|' ( (lv_name_1_0= ruleTitle ) ) )
            {
            // InternalSheepDog.g:1446:2: (otherlv_0= '|' ( (lv_name_1_0= ruleTitle ) ) )
            // InternalSheepDog.g:1447:3: otherlv_0= '|' ( (lv_name_1_0= ruleTitle ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCellAccess().getVerticalLineKeyword_0());
            		
            // InternalSheepDog.g:1451:3: ( (lv_name_1_0= ruleTitle ) )
            // InternalSheepDog.g:1452:4: (lv_name_1_0= ruleTitle )
            {
            // InternalSheepDog.g:1452:4: (lv_name_1_0= ruleTitle )
            // InternalSheepDog.g:1453:5: lv_name_1_0= ruleTitle
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
            						"org.farhan.mbt.SheepDog.Title");
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
    // InternalSheepDog.g:1474:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalSheepDog.g:1474:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalSheepDog.g:1475:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalSheepDog.g:1481:1: ruleStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleTitle ) ) this_EOL_1= RULE_EOL ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token this_EOL_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1487:2: ( ( ( (lv_name_0_0= ruleTitle ) ) this_EOL_1= RULE_EOL ) )
            // InternalSheepDog.g:1488:2: ( ( (lv_name_0_0= ruleTitle ) ) this_EOL_1= RULE_EOL )
            {
            // InternalSheepDog.g:1488:2: ( ( (lv_name_0_0= ruleTitle ) ) this_EOL_1= RULE_EOL )
            // InternalSheepDog.g:1489:3: ( (lv_name_0_0= ruleTitle ) ) this_EOL_1= RULE_EOL
            {
            // InternalSheepDog.g:1489:3: ( (lv_name_0_0= ruleTitle ) )
            // InternalSheepDog.g:1490:4: (lv_name_0_0= ruleTitle )
            {
            // InternalSheepDog.g:1490:4: (lv_name_0_0= ruleTitle )
            // InternalSheepDog.g:1491:5: lv_name_0_0= ruleTitle
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
            						"org.farhan.mbt.SheepDog.Title");
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
    // InternalSheepDog.g:1516:1: entryRuleTitle returns [String current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final String entryRuleTitle() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTitle = null;


        try {
            // InternalSheepDog.g:1516:45: (iv_ruleTitle= ruleTitle EOF )
            // InternalSheepDog.g:1517:2: iv_ruleTitle= ruleTitle EOF
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
    // InternalSheepDog.g:1523:1: ruleTitle returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WORD_0= RULE_WORD )+ ;
    public final AntlrDatatypeRuleToken ruleTitle() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;


        	enterRule();

        try {
            // InternalSheepDog.g:1529:2: ( (this_WORD_0= RULE_WORD )+ )
            // InternalSheepDog.g:1530:2: (this_WORD_0= RULE_WORD )+
            {
            // InternalSheepDog.g:1530:2: (this_WORD_0= RULE_WORD )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_WORD) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSheepDog.g:1531:3: this_WORD_0= RULE_WORD
            	    {
            	    this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_32); 

            	    			current.merge(this_WORD_0);
            	    		

            	    			newLeafNode(this_WORD_0, grammarAccess.getTitleAccess().getWORDTerminalRuleCall());
            	    		

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
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000842L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000802L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001002042L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001002002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000800062L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000042L});

}
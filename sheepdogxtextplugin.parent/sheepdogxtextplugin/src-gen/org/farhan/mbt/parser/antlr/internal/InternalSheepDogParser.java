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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_WORD", "RULE_TAGWORD", "RULE_WS", "RULE_SL_COMMENT", "'='", "'Object:'", "'=='", "'Definition:'", "'==='", "'Parameters:'", "'Feature:'", "'Background:'", "'Scenario:'", "'Examples:'", "'Given'", "'When'", "'Then'", "'And'", "'----'", "'[options=\"header\"]'", "'|==='", "':tags:'", "'[tags=\"'", "'\"]'", "'|'"
    };
    public static final int RULE_WORD=5;
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
    public static final int RULE_TAGWORD=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
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

                if ( (LA1_1==10) ) {
                    alt1=1;
                }
                else if ( (LA1_1==15) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0==26) ) {
                alt1=2;
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
    // InternalSheepDog.g:371:1: ruleFeature returns [EObject current=null] : ( ( (lv_tags_0_0= ruleFeatureTags ) )? otherlv_1= '=' otherlv_2= 'Feature:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_abstractScenarios_6_0= ruleAbstractScenario ) )* ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_EOL_4=null;
        EObject lv_tags_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_statements_5_0 = null;

        EObject lv_abstractScenarios_6_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:377:2: ( ( ( (lv_tags_0_0= ruleFeatureTags ) )? otherlv_1= '=' otherlv_2= 'Feature:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_abstractScenarios_6_0= ruleAbstractScenario ) )* ) )
            // InternalSheepDog.g:378:2: ( ( (lv_tags_0_0= ruleFeatureTags ) )? otherlv_1= '=' otherlv_2= 'Feature:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_abstractScenarios_6_0= ruleAbstractScenario ) )* )
            {
            // InternalSheepDog.g:378:2: ( ( (lv_tags_0_0= ruleFeatureTags ) )? otherlv_1= '=' otherlv_2= 'Feature:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_abstractScenarios_6_0= ruleAbstractScenario ) )* )
            // InternalSheepDog.g:379:3: ( (lv_tags_0_0= ruleFeatureTags ) )? otherlv_1= '=' otherlv_2= 'Feature:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_abstractScenarios_6_0= ruleAbstractScenario ) )*
            {
            // InternalSheepDog.g:379:3: ( (lv_tags_0_0= ruleFeatureTags ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSheepDog.g:380:4: (lv_tags_0_0= ruleFeatureTags )
                    {
                    // InternalSheepDog.g:380:4: (lv_tags_0_0= ruleFeatureTags )
                    // InternalSheepDog.g:381:5: lv_tags_0_0= ruleFeatureTags
                    {

                    					newCompositeNode(grammarAccess.getFeatureAccess().getTagsFeatureTagsParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_13);
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

            otherlv_1=(Token)match(input,9,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getFeatureKeyword_2());
            		
            // InternalSheepDog.g:406:3: ( (lv_name_3_0= ruleTitle ) )
            // InternalSheepDog.g:407:4: (lv_name_3_0= ruleTitle )
            {
            // InternalSheepDog.g:407:4: (lv_name_3_0= ruleTitle )
            // InternalSheepDog.g:408:5: lv_name_3_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getNameTitleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_3_0=ruleTitle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.farhan.mbt.SheepDog.Title");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_4=(Token)match(input,RULE_EOL,FOLLOW_15); 

            			newLeafNode(this_EOL_4, grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_4());
            		
            // InternalSheepDog.g:429:3: ( (lv_statements_5_0= ruleStatement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_WORD) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSheepDog.g:430:4: (lv_statements_5_0= ruleStatement )
            	    {
            	    // InternalSheepDog.g:430:4: (lv_statements_5_0= ruleStatement )
            	    // InternalSheepDog.g:431:5: lv_statements_5_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureAccess().getStatementsStatementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_statements_5_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureRule());
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
            	    break loop8;
                }
            } while (true);

            // InternalSheepDog.g:448:3: ( (lv_abstractScenarios_6_0= ruleAbstractScenario ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==11||LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSheepDog.g:449:4: (lv_abstractScenarios_6_0= ruleAbstractScenario )
            	    {
            	    // InternalSheepDog.g:449:4: (lv_abstractScenarios_6_0= ruleAbstractScenario )
            	    // InternalSheepDog.g:450:5: lv_abstractScenarios_6_0= ruleAbstractScenario
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureAccess().getAbstractScenariosAbstractScenarioParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_abstractScenarios_6_0=ruleAbstractScenario();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"abstractScenarios",
            	    						lv_abstractScenarios_6_0,
            	    						"org.farhan.mbt.SheepDog.AbstractScenario");
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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleAbstractScenario"
    // InternalSheepDog.g:471:1: entryRuleAbstractScenario returns [EObject current=null] : iv_ruleAbstractScenario= ruleAbstractScenario EOF ;
    public final EObject entryRuleAbstractScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractScenario = null;


        try {
            // InternalSheepDog.g:471:57: (iv_ruleAbstractScenario= ruleAbstractScenario EOF )
            // InternalSheepDog.g:472:2: iv_ruleAbstractScenario= ruleAbstractScenario EOF
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
    // InternalSheepDog.g:478:1: ruleAbstractScenario returns [EObject current=null] : (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario ) ;
    public final EObject ruleAbstractScenario() throws RecognitionException {
        EObject current = null;

        EObject this_Background_0 = null;

        EObject this_Scenario_1 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:484:2: ( (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario ) )
            // InternalSheepDog.g:485:2: (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario )
            {
            // InternalSheepDog.g:485:2: (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==RULE_WORD) ) {
                    int LA10_3 = input.LA(3);

                    if ( (LA10_3==28) ) {
                        int LA10_6 = input.LA(4);

                        if ( (LA10_6==RULE_EOL) ) {
                            int LA10_7 = input.LA(5);

                            if ( (LA10_7==11) ) {
                                int LA10_2 = input.LA(6);

                                if ( (LA10_2==17) ) {
                                    alt10=2;
                                }
                                else if ( (LA10_2==16) ) {
                                    alt10=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 10, 2, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 10, 7, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA10_0==11) ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==17) ) {
                    alt10=2;
                }
                else if ( (LA10_2==16) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSheepDog.g:486:3: this_Background_0= ruleBackground
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
                    // InternalSheepDog.g:495:3: this_Scenario_1= ruleScenario
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
    // InternalSheepDog.g:507:1: entryRuleBackground returns [EObject current=null] : iv_ruleBackground= ruleBackground EOF ;
    public final EObject entryRuleBackground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackground = null;


        try {
            // InternalSheepDog.g:507:51: (iv_ruleBackground= ruleBackground EOF )
            // InternalSheepDog.g:508:2: iv_ruleBackground= ruleBackground EOF
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
    // InternalSheepDog.g:514:1: ruleBackground returns [EObject current=null] : ( ( (lv_tags_0_0= ruleAbstractScenarioTags ) )? otherlv_1= '==' otherlv_2= 'Background:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* ) ;
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
            // InternalSheepDog.g:520:2: ( ( ( (lv_tags_0_0= ruleAbstractScenarioTags ) )? otherlv_1= '==' otherlv_2= 'Background:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* ) )
            // InternalSheepDog.g:521:2: ( ( (lv_tags_0_0= ruleAbstractScenarioTags ) )? otherlv_1= '==' otherlv_2= 'Background:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* )
            {
            // InternalSheepDog.g:521:2: ( ( (lv_tags_0_0= ruleAbstractScenarioTags ) )? otherlv_1= '==' otherlv_2= 'Background:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* )
            // InternalSheepDog.g:522:3: ( (lv_tags_0_0= ruleAbstractScenarioTags ) )? otherlv_1= '==' otherlv_2= 'Background:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )*
            {
            // InternalSheepDog.g:522:3: ( (lv_tags_0_0= ruleAbstractScenarioTags ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSheepDog.g:523:4: (lv_tags_0_0= ruleAbstractScenarioTags )
                    {
                    // InternalSheepDog.g:523:4: (lv_tags_0_0= ruleAbstractScenarioTags )
                    // InternalSheepDog.g:524:5: lv_tags_0_0= ruleAbstractScenarioTags
                    {

                    					newCompositeNode(grammarAccess.getBackgroundAccess().getTagsAbstractScenarioTagsParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_17);
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

            otherlv_1=(Token)match(input,11,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getBackgroundAccess().getEqualsSignEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getBackgroundAccess().getBackgroundKeyword_2());
            		
            // InternalSheepDog.g:549:3: ( (lv_name_3_0= ruleTitle ) )
            // InternalSheepDog.g:550:4: (lv_name_3_0= ruleTitle )
            {
            // InternalSheepDog.g:550:4: (lv_name_3_0= ruleTitle )
            // InternalSheepDog.g:551:5: lv_name_3_0= ruleTitle
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
            		
            // InternalSheepDog.g:572:3: ( (lv_statements_5_0= ruleStatement ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_WORD) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSheepDog.g:573:4: (lv_statements_5_0= ruleStatement )
            	    {
            	    // InternalSheepDog.g:573:4: (lv_statements_5_0= ruleStatement )
            	    // InternalSheepDog.g:574:5: lv_statements_5_0= ruleStatement
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
            	    break loop12;
                }
            } while (true);

            // InternalSheepDog.g:591:3: ( (lv_steps_6_0= ruleStep ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==13) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSheepDog.g:592:4: (lv_steps_6_0= ruleStep )
            	    {
            	    // InternalSheepDog.g:592:4: (lv_steps_6_0= ruleStep )
            	    // InternalSheepDog.g:593:5: lv_steps_6_0= ruleStep
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
    // $ANTLR end "ruleBackground"


    // $ANTLR start "entryRuleScenario"
    // InternalSheepDog.g:614:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalSheepDog.g:614:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalSheepDog.g:615:2: iv_ruleScenario= ruleScenario EOF
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
    // InternalSheepDog.g:621:1: ruleScenario returns [EObject current=null] : ( ( (lv_tags_0_0= ruleAbstractScenarioTags ) )? otherlv_1= '==' otherlv_2= 'Scenario:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* ( (lv_examples_7_0= ruleExamples ) )* ) ;
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
            // InternalSheepDog.g:627:2: ( ( ( (lv_tags_0_0= ruleAbstractScenarioTags ) )? otherlv_1= '==' otherlv_2= 'Scenario:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* ( (lv_examples_7_0= ruleExamples ) )* ) )
            // InternalSheepDog.g:628:2: ( ( (lv_tags_0_0= ruleAbstractScenarioTags ) )? otherlv_1= '==' otherlv_2= 'Scenario:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* ( (lv_examples_7_0= ruleExamples ) )* )
            {
            // InternalSheepDog.g:628:2: ( ( (lv_tags_0_0= ruleAbstractScenarioTags ) )? otherlv_1= '==' otherlv_2= 'Scenario:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* ( (lv_examples_7_0= ruleExamples ) )* )
            // InternalSheepDog.g:629:3: ( (lv_tags_0_0= ruleAbstractScenarioTags ) )? otherlv_1= '==' otherlv_2= 'Scenario:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* ( (lv_examples_7_0= ruleExamples ) )*
            {
            // InternalSheepDog.g:629:3: ( (lv_tags_0_0= ruleAbstractScenarioTags ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSheepDog.g:630:4: (lv_tags_0_0= ruleAbstractScenarioTags )
                    {
                    // InternalSheepDog.g:630:4: (lv_tags_0_0= ruleAbstractScenarioTags )
                    // InternalSheepDog.g:631:5: lv_tags_0_0= ruleAbstractScenarioTags
                    {

                    					newCompositeNode(grammarAccess.getScenarioAccess().getTagsAbstractScenarioTagsParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_17);
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

            otherlv_1=(Token)match(input,11,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getScenarioAccess().getEqualsSignEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getScenarioKeyword_2());
            		
            // InternalSheepDog.g:656:3: ( (lv_name_3_0= ruleTitle ) )
            // InternalSheepDog.g:657:4: (lv_name_3_0= ruleTitle )
            {
            // InternalSheepDog.g:657:4: (lv_name_3_0= ruleTitle )
            // InternalSheepDog.g:658:5: lv_name_3_0= ruleTitle
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

            this_EOL_4=(Token)match(input,RULE_EOL,FOLLOW_20); 

            			newLeafNode(this_EOL_4, grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_4());
            		
            // InternalSheepDog.g:679:3: ( (lv_statements_5_0= ruleStatement ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_WORD) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSheepDog.g:680:4: (lv_statements_5_0= ruleStatement )
            	    {
            	    // InternalSheepDog.g:680:4: (lv_statements_5_0= ruleStatement )
            	    // InternalSheepDog.g:681:5: lv_statements_5_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getStatementsStatementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    break loop15;
                }
            } while (true);

            // InternalSheepDog.g:698:3: ( (lv_steps_6_0= ruleStep ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==13) ) {
                    int LA16_2 = input.LA(2);

                    if ( ((LA16_2>=19 && LA16_2<=22)) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // InternalSheepDog.g:699:4: (lv_steps_6_0= ruleStep )
            	    {
            	    // InternalSheepDog.g:699:4: (lv_steps_6_0= ruleStep )
            	    // InternalSheepDog.g:700:5: lv_steps_6_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_21);
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
            	    break loop16;
                }
            } while (true);

            // InternalSheepDog.g:717:3: ( (lv_examples_7_0= ruleExamples ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    int LA17_2 = input.LA(2);

                    if ( (LA17_2==RULE_WORD) ) {
                        int LA17_4 = input.LA(3);

                        if ( (LA17_4==28) ) {
                            int LA17_5 = input.LA(4);

                            if ( (LA17_5==RULE_EOL) ) {
                                int LA17_6 = input.LA(5);

                                if ( (LA17_6==13) ) {
                                    alt17=1;
                                }


                            }


                        }


                    }


                }
                else if ( (LA17_0==13) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSheepDog.g:718:4: (lv_examples_7_0= ruleExamples )
            	    {
            	    // InternalSheepDog.g:718:4: (lv_examples_7_0= ruleExamples )
            	    // InternalSheepDog.g:719:5: lv_examples_7_0= ruleExamples
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getExamplesExamplesParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_21);
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
            	    break loop17;
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
    // InternalSheepDog.g:740:1: entryRuleExamples returns [EObject current=null] : iv_ruleExamples= ruleExamples EOF ;
    public final EObject entryRuleExamples() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExamples = null;


        try {
            // InternalSheepDog.g:740:49: (iv_ruleExamples= ruleExamples EOF )
            // InternalSheepDog.g:741:2: iv_ruleExamples= ruleExamples EOF
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
    // InternalSheepDog.g:747:1: ruleExamples returns [EObject current=null] : ( ( (lv_tags_0_0= ruleAbstractScenarioTags ) )? otherlv_1= '===' otherlv_2= 'Examples:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_theExamplesTable_6_0= ruleTable ) ) ) ;
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
            // InternalSheepDog.g:753:2: ( ( ( (lv_tags_0_0= ruleAbstractScenarioTags ) )? otherlv_1= '===' otherlv_2= 'Examples:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_theExamplesTable_6_0= ruleTable ) ) ) )
            // InternalSheepDog.g:754:2: ( ( (lv_tags_0_0= ruleAbstractScenarioTags ) )? otherlv_1= '===' otherlv_2= 'Examples:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_theExamplesTable_6_0= ruleTable ) ) )
            {
            // InternalSheepDog.g:754:2: ( ( (lv_tags_0_0= ruleAbstractScenarioTags ) )? otherlv_1= '===' otherlv_2= 'Examples:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_theExamplesTable_6_0= ruleTable ) ) )
            // InternalSheepDog.g:755:3: ( (lv_tags_0_0= ruleAbstractScenarioTags ) )? otherlv_1= '===' otherlv_2= 'Examples:' ( (lv_name_3_0= ruleTitle ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_theExamplesTable_6_0= ruleTable ) )
            {
            // InternalSheepDog.g:755:3: ( (lv_tags_0_0= ruleAbstractScenarioTags ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSheepDog.g:756:4: (lv_tags_0_0= ruleAbstractScenarioTags )
                    {
                    // InternalSheepDog.g:756:4: (lv_tags_0_0= ruleAbstractScenarioTags )
                    // InternalSheepDog.g:757:5: lv_tags_0_0= ruleAbstractScenarioTags
                    {

                    					newCompositeNode(grammarAccess.getExamplesAccess().getTagsAbstractScenarioTagsParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_22);
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

            otherlv_1=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getExamplesAccess().getEqualsSignEqualsSignEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getExamplesAccess().getExamplesKeyword_2());
            		
            // InternalSheepDog.g:782:3: ( (lv_name_3_0= ruleTitle ) )
            // InternalSheepDog.g:783:4: (lv_name_3_0= ruleTitle )
            {
            // InternalSheepDog.g:783:4: (lv_name_3_0= ruleTitle )
            // InternalSheepDog.g:784:5: lv_name_3_0= ruleTitle
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
            		
            // InternalSheepDog.g:805:3: ( (lv_statements_5_0= ruleStatement ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_WORD) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSheepDog.g:806:4: (lv_statements_5_0= ruleStatement )
            	    {
            	    // InternalSheepDog.g:806:4: (lv_statements_5_0= ruleStatement )
            	    // InternalSheepDog.g:807:5: lv_statements_5_0= ruleStatement
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
            	    break loop19;
                }
            } while (true);

            // InternalSheepDog.g:824:3: ( (lv_theExamplesTable_6_0= ruleTable ) )
            // InternalSheepDog.g:825:4: (lv_theExamplesTable_6_0= ruleTable )
            {
            // InternalSheepDog.g:825:4: (lv_theExamplesTable_6_0= ruleTable )
            // InternalSheepDog.g:826:5: lv_theExamplesTable_6_0= ruleTable
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
    // InternalSheepDog.g:847:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalSheepDog.g:847:45: (iv_ruleStep= ruleStep EOF )
            // InternalSheepDog.g:848:2: iv_ruleStep= ruleStep EOF
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
    // InternalSheepDog.g:854:1: ruleStep returns [EObject current=null] : (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen | this_And_3= ruleAnd ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        EObject this_Given_0 = null;

        EObject this_When_1 = null;

        EObject this_Then_2 = null;

        EObject this_And_3 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:860:2: ( (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen | this_And_3= ruleAnd ) )
            // InternalSheepDog.g:861:2: (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen | this_And_3= ruleAnd )
            {
            // InternalSheepDog.g:861:2: (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen | this_And_3= ruleAnd )
            int alt20=4;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==13) ) {
                switch ( input.LA(2) ) {
                case 22:
                    {
                    alt20=4;
                    }
                    break;
                case 21:
                    {
                    alt20=3;
                    }
                    break;
                case 20:
                    {
                    alt20=2;
                    }
                    break;
                case 19:
                    {
                    alt20=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalSheepDog.g:862:3: this_Given_0= ruleGiven
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
                    // InternalSheepDog.g:871:3: this_When_1= ruleWhen
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
                    // InternalSheepDog.g:880:3: this_Then_2= ruleThen
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
                    // InternalSheepDog.g:889:3: this_And_3= ruleAnd
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
    // InternalSheepDog.g:901:1: entryRuleGiven returns [EObject current=null] : iv_ruleGiven= ruleGiven EOF ;
    public final EObject entryRuleGiven() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGiven = null;


        try {
            // InternalSheepDog.g:901:46: (iv_ruleGiven= ruleGiven EOF )
            // InternalSheepDog.g:902:2: iv_ruleGiven= ruleGiven EOF
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
    // InternalSheepDog.g:908:1: ruleGiven returns [EObject current=null] : (otherlv_0= '===' otherlv_1= 'Given' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? ) ;
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
            // InternalSheepDog.g:914:2: ( (otherlv_0= '===' otherlv_1= 'Given' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? ) )
            // InternalSheepDog.g:915:2: (otherlv_0= '===' otherlv_1= 'Given' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? )
            {
            // InternalSheepDog.g:915:2: (otherlv_0= '===' otherlv_1= 'Given' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? )
            // InternalSheepDog.g:916:3: otherlv_0= '===' otherlv_1= 'Given' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getGivenAccess().getEqualsSignEqualsSignEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGivenAccess().getGivenKeyword_1());
            		
            // InternalSheepDog.g:924:3: ( (lv_name_2_0= ruleTitle ) )
            // InternalSheepDog.g:925:4: (lv_name_2_0= ruleTitle )
            {
            // InternalSheepDog.g:925:4: (lv_name_2_0= ruleTitle )
            // InternalSheepDog.g:926:5: lv_name_2_0= ruleTitle
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

            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_25); 

            			newLeafNode(this_EOL_3, grammarAccess.getGivenAccess().getEOLTerminalRuleCall_3());
            		
            // InternalSheepDog.g:947:3: ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )?
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            else if ( (LA21_0==23) ) {
                alt21=2;
            }
            switch (alt21) {
                case 1 :
                    // InternalSheepDog.g:948:4: ( (lv_theStepTable_4_0= ruleTable ) )
                    {
                    // InternalSheepDog.g:948:4: ( (lv_theStepTable_4_0= ruleTable ) )
                    // InternalSheepDog.g:949:5: (lv_theStepTable_4_0= ruleTable )
                    {
                    // InternalSheepDog.g:949:5: (lv_theStepTable_4_0= ruleTable )
                    // InternalSheepDog.g:950:6: lv_theStepTable_4_0= ruleTable
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
                    // InternalSheepDog.g:968:4: ( (lv_theDocString_5_0= ruleDocString ) )
                    {
                    // InternalSheepDog.g:968:4: ( (lv_theDocString_5_0= ruleDocString ) )
                    // InternalSheepDog.g:969:5: (lv_theDocString_5_0= ruleDocString )
                    {
                    // InternalSheepDog.g:969:5: (lv_theDocString_5_0= ruleDocString )
                    // InternalSheepDog.g:970:6: lv_theDocString_5_0= ruleDocString
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
    // InternalSheepDog.g:992:1: entryRuleWhen returns [EObject current=null] : iv_ruleWhen= ruleWhen EOF ;
    public final EObject entryRuleWhen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhen = null;


        try {
            // InternalSheepDog.g:992:45: (iv_ruleWhen= ruleWhen EOF )
            // InternalSheepDog.g:993:2: iv_ruleWhen= ruleWhen EOF
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
    // InternalSheepDog.g:999:1: ruleWhen returns [EObject current=null] : (otherlv_0= '===' otherlv_1= 'When' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? ) ;
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
            // InternalSheepDog.g:1005:2: ( (otherlv_0= '===' otherlv_1= 'When' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? ) )
            // InternalSheepDog.g:1006:2: (otherlv_0= '===' otherlv_1= 'When' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? )
            {
            // InternalSheepDog.g:1006:2: (otherlv_0= '===' otherlv_1= 'When' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? )
            // InternalSheepDog.g:1007:3: otherlv_0= '===' otherlv_1= 'When' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getWhenAccess().getEqualsSignEqualsSignEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getWhenAccess().getWhenKeyword_1());
            		
            // InternalSheepDog.g:1015:3: ( (lv_name_2_0= ruleTitle ) )
            // InternalSheepDog.g:1016:4: (lv_name_2_0= ruleTitle )
            {
            // InternalSheepDog.g:1016:4: (lv_name_2_0= ruleTitle )
            // InternalSheepDog.g:1017:5: lv_name_2_0= ruleTitle
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

            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_25); 

            			newLeafNode(this_EOL_3, grammarAccess.getWhenAccess().getEOLTerminalRuleCall_3());
            		
            // InternalSheepDog.g:1038:3: ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )?
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==24) ) {
                alt22=1;
            }
            else if ( (LA22_0==23) ) {
                alt22=2;
            }
            switch (alt22) {
                case 1 :
                    // InternalSheepDog.g:1039:4: ( (lv_theStepTable_4_0= ruleTable ) )
                    {
                    // InternalSheepDog.g:1039:4: ( (lv_theStepTable_4_0= ruleTable ) )
                    // InternalSheepDog.g:1040:5: (lv_theStepTable_4_0= ruleTable )
                    {
                    // InternalSheepDog.g:1040:5: (lv_theStepTable_4_0= ruleTable )
                    // InternalSheepDog.g:1041:6: lv_theStepTable_4_0= ruleTable
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
                    // InternalSheepDog.g:1059:4: ( (lv_theDocString_5_0= ruleDocString ) )
                    {
                    // InternalSheepDog.g:1059:4: ( (lv_theDocString_5_0= ruleDocString ) )
                    // InternalSheepDog.g:1060:5: (lv_theDocString_5_0= ruleDocString )
                    {
                    // InternalSheepDog.g:1060:5: (lv_theDocString_5_0= ruleDocString )
                    // InternalSheepDog.g:1061:6: lv_theDocString_5_0= ruleDocString
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
    // InternalSheepDog.g:1083:1: entryRuleThen returns [EObject current=null] : iv_ruleThen= ruleThen EOF ;
    public final EObject entryRuleThen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThen = null;


        try {
            // InternalSheepDog.g:1083:45: (iv_ruleThen= ruleThen EOF )
            // InternalSheepDog.g:1084:2: iv_ruleThen= ruleThen EOF
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
    // InternalSheepDog.g:1090:1: ruleThen returns [EObject current=null] : (otherlv_0= '===' otherlv_1= 'Then' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? ) ;
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
            // InternalSheepDog.g:1096:2: ( (otherlv_0= '===' otherlv_1= 'Then' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? ) )
            // InternalSheepDog.g:1097:2: (otherlv_0= '===' otherlv_1= 'Then' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? )
            {
            // InternalSheepDog.g:1097:2: (otherlv_0= '===' otherlv_1= 'Then' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? )
            // InternalSheepDog.g:1098:3: otherlv_0= '===' otherlv_1= 'Then' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getThenAccess().getEqualsSignEqualsSignEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getThenAccess().getThenKeyword_1());
            		
            // InternalSheepDog.g:1106:3: ( (lv_name_2_0= ruleTitle ) )
            // InternalSheepDog.g:1107:4: (lv_name_2_0= ruleTitle )
            {
            // InternalSheepDog.g:1107:4: (lv_name_2_0= ruleTitle )
            // InternalSheepDog.g:1108:5: lv_name_2_0= ruleTitle
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

            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_25); 

            			newLeafNode(this_EOL_3, grammarAccess.getThenAccess().getEOLTerminalRuleCall_3());
            		
            // InternalSheepDog.g:1129:3: ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )?
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                alt23=1;
            }
            else if ( (LA23_0==23) ) {
                alt23=2;
            }
            switch (alt23) {
                case 1 :
                    // InternalSheepDog.g:1130:4: ( (lv_theStepTable_4_0= ruleTable ) )
                    {
                    // InternalSheepDog.g:1130:4: ( (lv_theStepTable_4_0= ruleTable ) )
                    // InternalSheepDog.g:1131:5: (lv_theStepTable_4_0= ruleTable )
                    {
                    // InternalSheepDog.g:1131:5: (lv_theStepTable_4_0= ruleTable )
                    // InternalSheepDog.g:1132:6: lv_theStepTable_4_0= ruleTable
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
                    // InternalSheepDog.g:1150:4: ( (lv_theDocString_5_0= ruleDocString ) )
                    {
                    // InternalSheepDog.g:1150:4: ( (lv_theDocString_5_0= ruleDocString ) )
                    // InternalSheepDog.g:1151:5: (lv_theDocString_5_0= ruleDocString )
                    {
                    // InternalSheepDog.g:1151:5: (lv_theDocString_5_0= ruleDocString )
                    // InternalSheepDog.g:1152:6: lv_theDocString_5_0= ruleDocString
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
    // InternalSheepDog.g:1174:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalSheepDog.g:1174:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalSheepDog.g:1175:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalSheepDog.g:1181:1: ruleAnd returns [EObject current=null] : (otherlv_0= '===' otherlv_1= 'And' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? ) ;
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
            // InternalSheepDog.g:1187:2: ( (otherlv_0= '===' otherlv_1= 'And' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? ) )
            // InternalSheepDog.g:1188:2: (otherlv_0= '===' otherlv_1= 'And' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? )
            {
            // InternalSheepDog.g:1188:2: (otherlv_0= '===' otherlv_1= 'And' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )? )
            // InternalSheepDog.g:1189:3: otherlv_0= '===' otherlv_1= 'And' ( (lv_name_2_0= ruleTitle ) ) this_EOL_3= RULE_EOL ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getAndAccess().getEqualsSignEqualsSignEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAndAccess().getAndKeyword_1());
            		
            // InternalSheepDog.g:1197:3: ( (lv_name_2_0= ruleTitle ) )
            // InternalSheepDog.g:1198:4: (lv_name_2_0= ruleTitle )
            {
            // InternalSheepDog.g:1198:4: (lv_name_2_0= ruleTitle )
            // InternalSheepDog.g:1199:5: lv_name_2_0= ruleTitle
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

            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_25); 

            			newLeafNode(this_EOL_3, grammarAccess.getAndAccess().getEOLTerminalRuleCall_3());
            		
            // InternalSheepDog.g:1220:3: ( ( (lv_theStepTable_4_0= ruleTable ) ) | ( (lv_theDocString_5_0= ruleDocString ) ) )?
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==24) ) {
                alt24=1;
            }
            else if ( (LA24_0==23) ) {
                alt24=2;
            }
            switch (alt24) {
                case 1 :
                    // InternalSheepDog.g:1221:4: ( (lv_theStepTable_4_0= ruleTable ) )
                    {
                    // InternalSheepDog.g:1221:4: ( (lv_theStepTable_4_0= ruleTable ) )
                    // InternalSheepDog.g:1222:5: (lv_theStepTable_4_0= ruleTable )
                    {
                    // InternalSheepDog.g:1222:5: (lv_theStepTable_4_0= ruleTable )
                    // InternalSheepDog.g:1223:6: lv_theStepTable_4_0= ruleTable
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
                    // InternalSheepDog.g:1241:4: ( (lv_theDocString_5_0= ruleDocString ) )
                    {
                    // InternalSheepDog.g:1241:4: ( (lv_theDocString_5_0= ruleDocString ) )
                    // InternalSheepDog.g:1242:5: (lv_theDocString_5_0= ruleDocString )
                    {
                    // InternalSheepDog.g:1242:5: (lv_theDocString_5_0= ruleDocString )
                    // InternalSheepDog.g:1243:6: lv_theDocString_5_0= ruleDocString
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
    // InternalSheepDog.g:1265:1: entryRuleDocString returns [EObject current=null] : iv_ruleDocString= ruleDocString EOF ;
    public final EObject entryRuleDocString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocString = null;


        try {
            // InternalSheepDog.g:1265:50: (iv_ruleDocString= ruleDocString EOF )
            // InternalSheepDog.g:1266:2: iv_ruleDocString= ruleDocString EOF
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
    // InternalSheepDog.g:1272:1: ruleDocString returns [EObject current=null] : (otherlv_0= '----' this_EOL_1= RULE_EOL ( (lv_lines_2_0= ruleLine ) )+ otherlv_3= '----' this_EOL_4= RULE_EOL ) ;
    public final EObject ruleDocString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EOL_1=null;
        Token otherlv_3=null;
        Token this_EOL_4=null;
        EObject lv_lines_2_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1278:2: ( (otherlv_0= '----' this_EOL_1= RULE_EOL ( (lv_lines_2_0= ruleLine ) )+ otherlv_3= '----' this_EOL_4= RULE_EOL ) )
            // InternalSheepDog.g:1279:2: (otherlv_0= '----' this_EOL_1= RULE_EOL ( (lv_lines_2_0= ruleLine ) )+ otherlv_3= '----' this_EOL_4= RULE_EOL )
            {
            // InternalSheepDog.g:1279:2: (otherlv_0= '----' this_EOL_1= RULE_EOL ( (lv_lines_2_0= ruleLine ) )+ otherlv_3= '----' this_EOL_4= RULE_EOL )
            // InternalSheepDog.g:1280:3: otherlv_0= '----' this_EOL_1= RULE_EOL ( (lv_lines_2_0= ruleLine ) )+ otherlv_3= '----' this_EOL_4= RULE_EOL
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDocStringAccess().getHyphenMinusHyphenMinusHyphenMinusHyphenMinusKeyword_0());
            		
            this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_4); 

            			newLeafNode(this_EOL_1, grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_1());
            		
            // InternalSheepDog.g:1288:3: ( (lv_lines_2_0= ruleLine ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_WORD) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSheepDog.g:1289:4: (lv_lines_2_0= ruleLine )
            	    {
            	    // InternalSheepDog.g:1289:4: (lv_lines_2_0= ruleLine )
            	    // InternalSheepDog.g:1290:5: lv_lines_2_0= ruleLine
            	    {

            	    					newCompositeNode(grammarAccess.getDocStringAccess().getLinesLineParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_29);
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
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            otherlv_3=(Token)match(input,23,FOLLOW_5); 

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


    // $ANTLR start "entryRuleTable"
    // InternalSheepDog.g:1319:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalSheepDog.g:1319:46: (iv_ruleTable= ruleTable EOF )
            // InternalSheepDog.g:1320:2: iv_ruleTable= ruleTable EOF
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
    // InternalSheepDog.g:1326:1: ruleTable returns [EObject current=null] : (otherlv_0= '[options=\"header\"]' this_EOL_1= RULE_EOL otherlv_2= '|===' this_EOL_3= RULE_EOL ( (lv_rows_4_0= ruleRow ) )+ otherlv_5= '|===' this_EOL_6= RULE_EOL ) ;
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
            // InternalSheepDog.g:1332:2: ( (otherlv_0= '[options=\"header\"]' this_EOL_1= RULE_EOL otherlv_2= '|===' this_EOL_3= RULE_EOL ( (lv_rows_4_0= ruleRow ) )+ otherlv_5= '|===' this_EOL_6= RULE_EOL ) )
            // InternalSheepDog.g:1333:2: (otherlv_0= '[options=\"header\"]' this_EOL_1= RULE_EOL otherlv_2= '|===' this_EOL_3= RULE_EOL ( (lv_rows_4_0= ruleRow ) )+ otherlv_5= '|===' this_EOL_6= RULE_EOL )
            {
            // InternalSheepDog.g:1333:2: (otherlv_0= '[options=\"header\"]' this_EOL_1= RULE_EOL otherlv_2= '|===' this_EOL_3= RULE_EOL ( (lv_rows_4_0= ruleRow ) )+ otherlv_5= '|===' this_EOL_6= RULE_EOL )
            // InternalSheepDog.g:1334:3: otherlv_0= '[options=\"header\"]' this_EOL_1= RULE_EOL otherlv_2= '|===' this_EOL_3= RULE_EOL ( (lv_rows_4_0= ruleRow ) )+ otherlv_5= '|===' this_EOL_6= RULE_EOL
            {
            otherlv_0=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getOptionsHeaderKeyword_0());
            		
            this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_30); 

            			newLeafNode(this_EOL_1, grammarAccess.getTableAccess().getEOLTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTableAccess().getVerticalLineEqualsSignEqualsSignEqualsSignKeyword_2());
            		
            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_31); 

            			newLeafNode(this_EOL_3, grammarAccess.getTableAccess().getEOLTerminalRuleCall_3());
            		
            // InternalSheepDog.g:1350:3: ( (lv_rows_4_0= ruleRow ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==29) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSheepDog.g:1351:4: (lv_rows_4_0= ruleRow )
            	    {
            	    // InternalSheepDog.g:1351:4: (lv_rows_4_0= ruleRow )
            	    // InternalSheepDog.g:1352:5: lv_rows_4_0= ruleRow
            	    {

            	    					newCompositeNode(grammarAccess.getTableAccess().getRowsRowParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_32);
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
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            otherlv_5=(Token)match(input,25,FOLLOW_5); 

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
    // InternalSheepDog.g:1381:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // InternalSheepDog.g:1381:44: (iv_ruleRow= ruleRow EOF )
            // InternalSheepDog.g:1382:2: iv_ruleRow= ruleRow EOF
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
    // InternalSheepDog.g:1388:1: ruleRow returns [EObject current=null] : ( ( (lv_cells_0_0= ruleCell ) )+ this_EOL_1= RULE_EOL ) ;
    public final EObject ruleRow() throws RecognitionException {
        EObject current = null;

        Token this_EOL_1=null;
        EObject lv_cells_0_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1394:2: ( ( ( (lv_cells_0_0= ruleCell ) )+ this_EOL_1= RULE_EOL ) )
            // InternalSheepDog.g:1395:2: ( ( (lv_cells_0_0= ruleCell ) )+ this_EOL_1= RULE_EOL )
            {
            // InternalSheepDog.g:1395:2: ( ( (lv_cells_0_0= ruleCell ) )+ this_EOL_1= RULE_EOL )
            // InternalSheepDog.g:1396:3: ( (lv_cells_0_0= ruleCell ) )+ this_EOL_1= RULE_EOL
            {
            // InternalSheepDog.g:1396:3: ( (lv_cells_0_0= ruleCell ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==29) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSheepDog.g:1397:4: (lv_cells_0_0= ruleCell )
            	    {
            	    // InternalSheepDog.g:1397:4: (lv_cells_0_0= ruleCell )
            	    // InternalSheepDog.g:1398:5: lv_cells_0_0= ruleCell
            	    {

            	    					newCompositeNode(grammarAccess.getRowAccess().getCellsCellParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_33);
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
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
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


    // $ANTLR start "entryRuleFeatureTags"
    // InternalSheepDog.g:1423:1: entryRuleFeatureTags returns [EObject current=null] : iv_ruleFeatureTags= ruleFeatureTags EOF ;
    public final EObject entryRuleFeatureTags() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureTags = null;


        try {
            // InternalSheepDog.g:1423:52: (iv_ruleFeatureTags= ruleFeatureTags EOF )
            // InternalSheepDog.g:1424:2: iv_ruleFeatureTags= ruleFeatureTags EOF
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
    // InternalSheepDog.g:1430:1: ruleFeatureTags returns [EObject current=null] : (otherlv_0= ':tags:' ( (lv_name_1_0= RULE_WORD ) ) this_EOL_2= RULE_EOL ) ;
    public final EObject ruleFeatureTags() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_EOL_2=null;


        	enterRule();

        try {
            // InternalSheepDog.g:1436:2: ( (otherlv_0= ':tags:' ( (lv_name_1_0= RULE_WORD ) ) this_EOL_2= RULE_EOL ) )
            // InternalSheepDog.g:1437:2: (otherlv_0= ':tags:' ( (lv_name_1_0= RULE_WORD ) ) this_EOL_2= RULE_EOL )
            {
            // InternalSheepDog.g:1437:2: (otherlv_0= ':tags:' ( (lv_name_1_0= RULE_WORD ) ) this_EOL_2= RULE_EOL )
            // InternalSheepDog.g:1438:3: otherlv_0= ':tags:' ( (lv_name_1_0= RULE_WORD ) ) this_EOL_2= RULE_EOL
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureTagsAccess().getTagsKeyword_0());
            		
            // InternalSheepDog.g:1442:3: ( (lv_name_1_0= RULE_WORD ) )
            // InternalSheepDog.g:1443:4: (lv_name_1_0= RULE_WORD )
            {
            // InternalSheepDog.g:1443:4: (lv_name_1_0= RULE_WORD )
            // InternalSheepDog.g:1444:5: lv_name_1_0= RULE_WORD
            {
            lv_name_1_0=(Token)match(input,RULE_WORD,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFeatureTagsAccess().getNameWORDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureTagsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.farhan.mbt.SheepDog.WORD");
            				

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


    // $ANTLR start "entryRuleAbstractScenarioTags"
    // InternalSheepDog.g:1468:1: entryRuleAbstractScenarioTags returns [EObject current=null] : iv_ruleAbstractScenarioTags= ruleAbstractScenarioTags EOF ;
    public final EObject entryRuleAbstractScenarioTags() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractScenarioTags = null;


        try {
            // InternalSheepDog.g:1468:61: (iv_ruleAbstractScenarioTags= ruleAbstractScenarioTags EOF )
            // InternalSheepDog.g:1469:2: iv_ruleAbstractScenarioTags= ruleAbstractScenarioTags EOF
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
    // InternalSheepDog.g:1475:1: ruleAbstractScenarioTags returns [EObject current=null] : (otherlv_0= '[tags=\"' ( (lv_name_1_0= RULE_WORD ) ) otherlv_2= '\"]' this_EOL_3= RULE_EOL ) ;
    public final EObject ruleAbstractScenarioTags() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_EOL_3=null;


        	enterRule();

        try {
            // InternalSheepDog.g:1481:2: ( (otherlv_0= '[tags=\"' ( (lv_name_1_0= RULE_WORD ) ) otherlv_2= '\"]' this_EOL_3= RULE_EOL ) )
            // InternalSheepDog.g:1482:2: (otherlv_0= '[tags=\"' ( (lv_name_1_0= RULE_WORD ) ) otherlv_2= '\"]' this_EOL_3= RULE_EOL )
            {
            // InternalSheepDog.g:1482:2: (otherlv_0= '[tags=\"' ( (lv_name_1_0= RULE_WORD ) ) otherlv_2= '\"]' this_EOL_3= RULE_EOL )
            // InternalSheepDog.g:1483:3: otherlv_0= '[tags=\"' ( (lv_name_1_0= RULE_WORD ) ) otherlv_2= '\"]' this_EOL_3= RULE_EOL
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAbstractScenarioTagsAccess().getTagsKeyword_0());
            		
            // InternalSheepDog.g:1487:3: ( (lv_name_1_0= RULE_WORD ) )
            // InternalSheepDog.g:1488:4: (lv_name_1_0= RULE_WORD )
            {
            // InternalSheepDog.g:1488:4: (lv_name_1_0= RULE_WORD )
            // InternalSheepDog.g:1489:5: lv_name_1_0= RULE_WORD
            {
            lv_name_1_0=(Token)match(input,RULE_WORD,FOLLOW_34); 

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

            otherlv_2=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getAbstractScenarioTagsAccess().getQuotationMarkRightSquareBracketKeyword_2());
            		
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
    // InternalSheepDog.g:1517:1: entryRuleCell returns [EObject current=null] : iv_ruleCell= ruleCell EOF ;
    public final EObject entryRuleCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCell = null;


        try {
            // InternalSheepDog.g:1517:45: (iv_ruleCell= ruleCell EOF )
            // InternalSheepDog.g:1518:2: iv_ruleCell= ruleCell EOF
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
    // InternalSheepDog.g:1524:1: ruleCell returns [EObject current=null] : (otherlv_0= '|' ( (lv_name_1_0= ruleTitle ) ) ) ;
    public final EObject ruleCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1530:2: ( (otherlv_0= '|' ( (lv_name_1_0= ruleTitle ) ) ) )
            // InternalSheepDog.g:1531:2: (otherlv_0= '|' ( (lv_name_1_0= ruleTitle ) ) )
            {
            // InternalSheepDog.g:1531:2: (otherlv_0= '|' ( (lv_name_1_0= ruleTitle ) ) )
            // InternalSheepDog.g:1532:3: otherlv_0= '|' ( (lv_name_1_0= ruleTitle ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCellAccess().getVerticalLineKeyword_0());
            		
            // InternalSheepDog.g:1536:3: ( (lv_name_1_0= ruleTitle ) )
            // InternalSheepDog.g:1537:4: (lv_name_1_0= ruleTitle )
            {
            // InternalSheepDog.g:1537:4: (lv_name_1_0= ruleTitle )
            // InternalSheepDog.g:1538:5: lv_name_1_0= ruleTitle
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
    // InternalSheepDog.g:1559:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalSheepDog.g:1559:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalSheepDog.g:1560:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalSheepDog.g:1566:1: ruleStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleTitle ) ) this_EOL_1= RULE_EOL ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token this_EOL_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1572:2: ( ( ( (lv_name_0_0= ruleTitle ) ) this_EOL_1= RULE_EOL ) )
            // InternalSheepDog.g:1573:2: ( ( (lv_name_0_0= ruleTitle ) ) this_EOL_1= RULE_EOL )
            {
            // InternalSheepDog.g:1573:2: ( ( (lv_name_0_0= ruleTitle ) ) this_EOL_1= RULE_EOL )
            // InternalSheepDog.g:1574:3: ( (lv_name_0_0= ruleTitle ) ) this_EOL_1= RULE_EOL
            {
            // InternalSheepDog.g:1574:3: ( (lv_name_0_0= ruleTitle ) )
            // InternalSheepDog.g:1575:4: (lv_name_0_0= ruleTitle )
            {
            // InternalSheepDog.g:1575:4: (lv_name_0_0= ruleTitle )
            // InternalSheepDog.g:1576:5: lv_name_0_0= ruleTitle
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


    // $ANTLR start "entryRuleLine"
    // InternalSheepDog.g:1601:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // InternalSheepDog.g:1601:45: (iv_ruleLine= ruleLine EOF )
            // InternalSheepDog.g:1602:2: iv_ruleLine= ruleLine EOF
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
    // InternalSheepDog.g:1608:1: ruleLine returns [EObject current=null] : ( ( (lv_name_0_0= ruleTitle ) ) this_EOL_1= RULE_EOL ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        Token this_EOL_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1614:2: ( ( ( (lv_name_0_0= ruleTitle ) ) this_EOL_1= RULE_EOL ) )
            // InternalSheepDog.g:1615:2: ( ( (lv_name_0_0= ruleTitle ) ) this_EOL_1= RULE_EOL )
            {
            // InternalSheepDog.g:1615:2: ( ( (lv_name_0_0= ruleTitle ) ) this_EOL_1= RULE_EOL )
            // InternalSheepDog.g:1616:3: ( (lv_name_0_0= ruleTitle ) ) this_EOL_1= RULE_EOL
            {
            // InternalSheepDog.g:1616:3: ( (lv_name_0_0= ruleTitle ) )
            // InternalSheepDog.g:1617:4: (lv_name_0_0= ruleTitle )
            {
            // InternalSheepDog.g:1617:4: (lv_name_0_0= ruleTitle )
            // InternalSheepDog.g:1618:5: lv_name_0_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getLineAccess().getNameTitleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_0_0=ruleTitle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLineRule());
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


    // $ANTLR start "entryRuleTitle"
    // InternalSheepDog.g:1643:1: entryRuleTitle returns [String current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final String entryRuleTitle() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTitle = null;


        try {
            // InternalSheepDog.g:1643:45: (iv_ruleTitle= ruleTitle EOF )
            // InternalSheepDog.g:1644:2: iv_ruleTitle= ruleTitle EOF
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
    // InternalSheepDog.g:1650:1: ruleTitle returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WORD_0= RULE_WORD )+ ;
    public final AntlrDatatypeRuleToken ruleTitle() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;


        	enterRule();

        try {
            // InternalSheepDog.g:1656:2: ( (this_WORD_0= RULE_WORD )+ )
            // InternalSheepDog.g:1657:2: (this_WORD_0= RULE_WORD )+
            {
            // InternalSheepDog.g:1657:2: (this_WORD_0= RULE_WORD )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_WORD) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSheepDog.g:1658:3: this_WORD_0= RULE_WORD
            	    {
            	    this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_35); 

            	    			current.merge(this_WORD_0);
            	    		

            	    			newLeafNode(this_WORD_0, grammarAccess.getTitleAccess().getWORDTerminalRuleCall());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000822L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000822L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000802L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008002022L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008002002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001800022L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000022000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000022L});

}
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_WORD", "RULE_ID", "RULE_STRING", "RULE_WS", "RULE_SL_COMMENT", "'='", "'Object:'", "'=='", "'Definition:'", "'==='", "'Parameters:'", "'Feature:'", "'Background:'", "'Scenario:'", "'Examples:'", "'Given'", "'When'", "'Then'", "'And'", "'----'", "'[options=\"header\"]'", "'|==='", "'[tags=\"'", "'\"]'", "'|'"
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

            if ( (LA1_0==10) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==16) ) {
                    alt1=2;
                }
                else if ( (LA1_1==11) ) {
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
    // InternalSheepDog.g:107:1: ruleStepObject returns [EObject current=null] : (otherlv_0= '=' otherlv_1= 'Object:' ( (lv_name_2_0= ruleTitle ) ) ( (lv_statements_3_0= ruleStatement ) )* ( (lv_stepDefinitions_4_0= ruleStepDefinition ) )* ) ;
    public final EObject ruleStepObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_statements_3_0 = null;

        EObject lv_stepDefinitions_4_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:113:2: ( (otherlv_0= '=' otherlv_1= 'Object:' ( (lv_name_2_0= ruleTitle ) ) ( (lv_statements_3_0= ruleStatement ) )* ( (lv_stepDefinitions_4_0= ruleStepDefinition ) )* ) )
            // InternalSheepDog.g:114:2: (otherlv_0= '=' otherlv_1= 'Object:' ( (lv_name_2_0= ruleTitle ) ) ( (lv_statements_3_0= ruleStatement ) )* ( (lv_stepDefinitions_4_0= ruleStepDefinition ) )* )
            {
            // InternalSheepDog.g:114:2: (otherlv_0= '=' otherlv_1= 'Object:' ( (lv_name_2_0= ruleTitle ) ) ( (lv_statements_3_0= ruleStatement ) )* ( (lv_stepDefinitions_4_0= ruleStepDefinition ) )* )
            // InternalSheepDog.g:115:3: otherlv_0= '=' otherlv_1= 'Object:' ( (lv_name_2_0= ruleTitle ) ) ( (lv_statements_3_0= ruleStatement ) )* ( (lv_stepDefinitions_4_0= ruleStepDefinition ) )*
            {
            otherlv_0=(Token)match(input,10,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStepObjectAccess().getEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,11,FOLLOW_4); 

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

            // InternalSheepDog.g:142:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_WORD && LA2_0<=RULE_STRING)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSheepDog.g:143:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalSheepDog.g:143:4: (lv_statements_3_0= ruleStatement )
            	    // InternalSheepDog.g:144:5: lv_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getStepObjectAccess().getStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
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
            	    break loop2;
                }
            } while (true);

            // InternalSheepDog.g:161:3: ( (lv_stepDefinitions_4_0= ruleStepDefinition ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSheepDog.g:162:4: (lv_stepDefinitions_4_0= ruleStepDefinition )
            	    {
            	    // InternalSheepDog.g:162:4: (lv_stepDefinitions_4_0= ruleStepDefinition )
            	    // InternalSheepDog.g:163:5: lv_stepDefinitions_4_0= ruleStepDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getStepObjectAccess().getStepDefinitionsStepDefinitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
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
    // InternalSheepDog.g:184:1: entryRuleStepDefinition returns [EObject current=null] : iv_ruleStepDefinition= ruleStepDefinition EOF ;
    public final EObject entryRuleStepDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStepDefinition = null;


        try {
            // InternalSheepDog.g:184:55: (iv_ruleStepDefinition= ruleStepDefinition EOF )
            // InternalSheepDog.g:185:2: iv_ruleStepDefinition= ruleStepDefinition EOF
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
    // InternalSheepDog.g:191:1: ruleStepDefinition returns [EObject current=null] : (otherlv_0= '==' otherlv_1= 'Definition:' ( (lv_name_2_0= ruleTitle ) ) ( (lv_statements_3_0= ruleStatement ) )* ( (lv_stepParameters_4_0= ruleStepParameters ) )* ) ;
    public final EObject ruleStepDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_statements_3_0 = null;

        EObject lv_stepParameters_4_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:197:2: ( (otherlv_0= '==' otherlv_1= 'Definition:' ( (lv_name_2_0= ruleTitle ) ) ( (lv_statements_3_0= ruleStatement ) )* ( (lv_stepParameters_4_0= ruleStepParameters ) )* ) )
            // InternalSheepDog.g:198:2: (otherlv_0= '==' otherlv_1= 'Definition:' ( (lv_name_2_0= ruleTitle ) ) ( (lv_statements_3_0= ruleStatement ) )* ( (lv_stepParameters_4_0= ruleStepParameters ) )* )
            {
            // InternalSheepDog.g:198:2: (otherlv_0= '==' otherlv_1= 'Definition:' ( (lv_name_2_0= ruleTitle ) ) ( (lv_statements_3_0= ruleStatement ) )* ( (lv_stepParameters_4_0= ruleStepParameters ) )* )
            // InternalSheepDog.g:199:3: otherlv_0= '==' otherlv_1= 'Definition:' ( (lv_name_2_0= ruleTitle ) ) ( (lv_statements_3_0= ruleStatement ) )* ( (lv_stepParameters_4_0= ruleStepParameters ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getStepDefinitionAccess().getEqualsSignEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStepDefinitionAccess().getDefinitionKeyword_1());
            		
            // InternalSheepDog.g:207:3: ( (lv_name_2_0= ruleTitle ) )
            // InternalSheepDog.g:208:4: (lv_name_2_0= ruleTitle )
            {
            // InternalSheepDog.g:208:4: (lv_name_2_0= ruleTitle )
            // InternalSheepDog.g:209:5: lv_name_2_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getStepDefinitionAccess().getNameTitleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalSheepDog.g:226:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_WORD && LA4_0<=RULE_STRING)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSheepDog.g:227:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalSheepDog.g:227:4: (lv_statements_3_0= ruleStatement )
            	    // InternalSheepDog.g:228:5: lv_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getStepDefinitionAccess().getStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
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
            	    break loop4;
                }
            } while (true);

            // InternalSheepDog.g:245:3: ( (lv_stepParameters_4_0= ruleStepParameters ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSheepDog.g:246:4: (lv_stepParameters_4_0= ruleStepParameters )
            	    {
            	    // InternalSheepDog.g:246:4: (lv_stepParameters_4_0= ruleStepParameters )
            	    // InternalSheepDog.g:247:5: lv_stepParameters_4_0= ruleStepParameters
            	    {

            	    					newCompositeNode(grammarAccess.getStepDefinitionAccess().getStepParametersStepParametersParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
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
    // InternalSheepDog.g:268:1: entryRuleStepParameters returns [EObject current=null] : iv_ruleStepParameters= ruleStepParameters EOF ;
    public final EObject entryRuleStepParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStepParameters = null;


        try {
            // InternalSheepDog.g:268:55: (iv_ruleStepParameters= ruleStepParameters EOF )
            // InternalSheepDog.g:269:2: iv_ruleStepParameters= ruleStepParameters EOF
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
    // InternalSheepDog.g:275:1: ruleStepParameters returns [EObject current=null] : (otherlv_0= '===' otherlv_1= 'Parameters:' ( (lv_name_2_0= ruleTitle ) ) ( (lv_statements_3_0= ruleStatement ) )* ( (lv_parametersTable_4_0= ruleTable ) ) ) ;
    public final EObject ruleStepParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_statements_3_0 = null;

        EObject lv_parametersTable_4_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:281:2: ( (otherlv_0= '===' otherlv_1= 'Parameters:' ( (lv_name_2_0= ruleTitle ) ) ( (lv_statements_3_0= ruleStatement ) )* ( (lv_parametersTable_4_0= ruleTable ) ) ) )
            // InternalSheepDog.g:282:2: (otherlv_0= '===' otherlv_1= 'Parameters:' ( (lv_name_2_0= ruleTitle ) ) ( (lv_statements_3_0= ruleStatement ) )* ( (lv_parametersTable_4_0= ruleTable ) ) )
            {
            // InternalSheepDog.g:282:2: (otherlv_0= '===' otherlv_1= 'Parameters:' ( (lv_name_2_0= ruleTitle ) ) ( (lv_statements_3_0= ruleStatement ) )* ( (lv_parametersTable_4_0= ruleTable ) ) )
            // InternalSheepDog.g:283:3: otherlv_0= '===' otherlv_1= 'Parameters:' ( (lv_name_2_0= ruleTitle ) ) ( (lv_statements_3_0= ruleStatement ) )* ( (lv_parametersTable_4_0= ruleTable ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getStepParametersAccess().getEqualsSignEqualsSignEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStepParametersAccess().getParametersKeyword_1());
            		
            // InternalSheepDog.g:291:3: ( (lv_name_2_0= ruleTitle ) )
            // InternalSheepDog.g:292:4: (lv_name_2_0= ruleTitle )
            {
            // InternalSheepDog.g:292:4: (lv_name_2_0= ruleTitle )
            // InternalSheepDog.g:293:5: lv_name_2_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getStepParametersAccess().getNameTitleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalSheepDog.g:310:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_WORD && LA6_0<=RULE_STRING)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSheepDog.g:311:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalSheepDog.g:311:4: (lv_statements_3_0= ruleStatement )
            	    // InternalSheepDog.g:312:5: lv_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getStepParametersAccess().getStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
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
            	    break loop6;
                }
            } while (true);

            // InternalSheepDog.g:329:3: ( (lv_parametersTable_4_0= ruleTable ) )
            // InternalSheepDog.g:330:4: (lv_parametersTable_4_0= ruleTable )
            {
            // InternalSheepDog.g:330:4: (lv_parametersTable_4_0= ruleTable )
            // InternalSheepDog.g:331:5: lv_parametersTable_4_0= ruleTable
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


    // $ANTLR start "entryRuleFeature"
    // InternalSheepDog.g:352:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalSheepDog.g:352:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalSheepDog.g:353:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalSheepDog.g:359:1: ruleFeature returns [EObject current=null] : (otherlv_0= '=' otherlv_1= 'Feature:' ( (lv_name_2_0= ruleTitle ) ) ( (lv_statements_3_0= ruleStatement ) )* ( (lv_abstractScenarios_4_0= ruleAbstractScenario ) )* ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_statements_3_0 = null;

        EObject lv_abstractScenarios_4_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:365:2: ( (otherlv_0= '=' otherlv_1= 'Feature:' ( (lv_name_2_0= ruleTitle ) ) ( (lv_statements_3_0= ruleStatement ) )* ( (lv_abstractScenarios_4_0= ruleAbstractScenario ) )* ) )
            // InternalSheepDog.g:366:2: (otherlv_0= '=' otherlv_1= 'Feature:' ( (lv_name_2_0= ruleTitle ) ) ( (lv_statements_3_0= ruleStatement ) )* ( (lv_abstractScenarios_4_0= ruleAbstractScenario ) )* )
            {
            // InternalSheepDog.g:366:2: (otherlv_0= '=' otherlv_1= 'Feature:' ( (lv_name_2_0= ruleTitle ) ) ( (lv_statements_3_0= ruleStatement ) )* ( (lv_abstractScenarios_4_0= ruleAbstractScenario ) )* )
            // InternalSheepDog.g:367:3: otherlv_0= '=' otherlv_1= 'Feature:' ( (lv_name_2_0= ruleTitle ) ) ( (lv_statements_3_0= ruleStatement ) )* ( (lv_abstractScenarios_4_0= ruleAbstractScenario ) )*
            {
            otherlv_0=(Token)match(input,10,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureAccess().getEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getFeatureKeyword_1());
            		
            // InternalSheepDog.g:375:3: ( (lv_name_2_0= ruleTitle ) )
            // InternalSheepDog.g:376:4: (lv_name_2_0= ruleTitle )
            {
            // InternalSheepDog.g:376:4: (lv_name_2_0= ruleTitle )
            // InternalSheepDog.g:377:5: lv_name_2_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getNameTitleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalSheepDog.g:394:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_WORD && LA7_0<=RULE_STRING)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSheepDog.g:395:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalSheepDog.g:395:4: (lv_statements_3_0= ruleStatement )
            	    // InternalSheepDog.g:396:5: lv_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureAccess().getStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureRule());
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
            	    break loop7;
                }
            } while (true);

            // InternalSheepDog.g:413:3: ( (lv_abstractScenarios_4_0= ruleAbstractScenario ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==12||LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSheepDog.g:414:4: (lv_abstractScenarios_4_0= ruleAbstractScenario )
            	    {
            	    // InternalSheepDog.g:414:4: (lv_abstractScenarios_4_0= ruleAbstractScenario )
            	    // InternalSheepDog.g:415:5: lv_abstractScenarios_4_0= ruleAbstractScenario
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureAccess().getAbstractScenariosAbstractScenarioParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_abstractScenarios_4_0=ruleAbstractScenario();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"abstractScenarios",
            	    						lv_abstractScenarios_4_0,
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
    // InternalSheepDog.g:436:1: entryRuleAbstractScenario returns [EObject current=null] : iv_ruleAbstractScenario= ruleAbstractScenario EOF ;
    public final EObject entryRuleAbstractScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractScenario = null;


        try {
            // InternalSheepDog.g:436:57: (iv_ruleAbstractScenario= ruleAbstractScenario EOF )
            // InternalSheepDog.g:437:2: iv_ruleAbstractScenario= ruleAbstractScenario EOF
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
    // InternalSheepDog.g:443:1: ruleAbstractScenario returns [EObject current=null] : (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario ) ;
    public final EObject ruleAbstractScenario() throws RecognitionException {
        EObject current = null;

        EObject this_Background_0 = null;

        EObject this_Scenario_1 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:449:2: ( (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario ) )
            // InternalSheepDog.g:450:2: (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario )
            {
            // InternalSheepDog.g:450:2: (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalSheepDog.g:451:3: this_Background_0= ruleBackground
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
                    // InternalSheepDog.g:460:3: this_Scenario_1= ruleScenario
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
    // InternalSheepDog.g:472:1: entryRuleBackground returns [EObject current=null] : iv_ruleBackground= ruleBackground EOF ;
    public final EObject entryRuleBackground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackground = null;


        try {
            // InternalSheepDog.g:472:51: (iv_ruleBackground= ruleBackground EOF )
            // InternalSheepDog.g:473:2: iv_ruleBackground= ruleBackground EOF
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
    // InternalSheepDog.g:479:1: ruleBackground returns [EObject current=null] : ( ( (lv_tags_0_0= ruleTags ) )? otherlv_1= '==' otherlv_2= 'Background:' ( (lv_name_3_0= ruleTitle ) ) ( (lv_statements_4_0= ruleStatement ) )* ( (lv_steps_5_0= ruleStep ) )* ) ;
    public final EObject ruleBackground() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_tags_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_statements_4_0 = null;

        EObject lv_steps_5_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:485:2: ( ( ( (lv_tags_0_0= ruleTags ) )? otherlv_1= '==' otherlv_2= 'Background:' ( (lv_name_3_0= ruleTitle ) ) ( (lv_statements_4_0= ruleStatement ) )* ( (lv_steps_5_0= ruleStep ) )* ) )
            // InternalSheepDog.g:486:2: ( ( (lv_tags_0_0= ruleTags ) )? otherlv_1= '==' otherlv_2= 'Background:' ( (lv_name_3_0= ruleTitle ) ) ( (lv_statements_4_0= ruleStatement ) )* ( (lv_steps_5_0= ruleStep ) )* )
            {
            // InternalSheepDog.g:486:2: ( ( (lv_tags_0_0= ruleTags ) )? otherlv_1= '==' otherlv_2= 'Background:' ( (lv_name_3_0= ruleTitle ) ) ( (lv_statements_4_0= ruleStatement ) )* ( (lv_steps_5_0= ruleStep ) )* )
            // InternalSheepDog.g:487:3: ( (lv_tags_0_0= ruleTags ) )? otherlv_1= '==' otherlv_2= 'Background:' ( (lv_name_3_0= ruleTitle ) ) ( (lv_statements_4_0= ruleStatement ) )* ( (lv_steps_5_0= ruleStep ) )*
            {
            // InternalSheepDog.g:487:3: ( (lv_tags_0_0= ruleTags ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSheepDog.g:488:4: (lv_tags_0_0= ruleTags )
                    {
                    // InternalSheepDog.g:488:4: (lv_tags_0_0= ruleTags )
                    // InternalSheepDog.g:489:5: lv_tags_0_0= ruleTags
                    {

                    					newCompositeNode(grammarAccess.getBackgroundAccess().getTagsTagsParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_tags_0_0=ruleTags();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBackgroundRule());
                    					}
                    					set(
                    						current,
                    						"tags",
                    						lv_tags_0_0,
                    						"org.farhan.mbt.SheepDog.Tags");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getBackgroundAccess().getEqualsSignEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getBackgroundAccess().getBackgroundKeyword_2());
            		
            // InternalSheepDog.g:514:3: ( (lv_name_3_0= ruleTitle ) )
            // InternalSheepDog.g:515:4: (lv_name_3_0= ruleTitle )
            {
            // InternalSheepDog.g:515:4: (lv_name_3_0= ruleTitle )
            // InternalSheepDog.g:516:5: lv_name_3_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getBackgroundAccess().getNameTitleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalSheepDog.g:533:3: ( (lv_statements_4_0= ruleStatement ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_WORD && LA11_0<=RULE_STRING)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSheepDog.g:534:4: (lv_statements_4_0= ruleStatement )
            	    {
            	    // InternalSheepDog.g:534:4: (lv_statements_4_0= ruleStatement )
            	    // InternalSheepDog.g:535:5: lv_statements_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getBackgroundAccess().getStatementsStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_statements_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBackgroundRule());
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
            	    break loop11;
                }
            } while (true);

            // InternalSheepDog.g:552:3: ( (lv_steps_5_0= ruleStep ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSheepDog.g:553:4: (lv_steps_5_0= ruleStep )
            	    {
            	    // InternalSheepDog.g:553:4: (lv_steps_5_0= ruleStep )
            	    // InternalSheepDog.g:554:5: lv_steps_5_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_steps_5_0=ruleStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBackgroundRule());
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
    // InternalSheepDog.g:575:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalSheepDog.g:575:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalSheepDog.g:576:2: iv_ruleScenario= ruleScenario EOF
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
    // InternalSheepDog.g:582:1: ruleScenario returns [EObject current=null] : ( ( (lv_tags_0_0= ruleTags ) )? otherlv_1= '==' otherlv_2= 'Scenario:' ( (lv_name_3_0= ruleTitle ) ) ( (lv_statements_4_0= ruleStatement ) )* ( (lv_steps_5_0= ruleStep ) )* ( (lv_examples_6_0= ruleExamples ) )* ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_tags_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_statements_4_0 = null;

        EObject lv_steps_5_0 = null;

        EObject lv_examples_6_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:588:2: ( ( ( (lv_tags_0_0= ruleTags ) )? otherlv_1= '==' otherlv_2= 'Scenario:' ( (lv_name_3_0= ruleTitle ) ) ( (lv_statements_4_0= ruleStatement ) )* ( (lv_steps_5_0= ruleStep ) )* ( (lv_examples_6_0= ruleExamples ) )* ) )
            // InternalSheepDog.g:589:2: ( ( (lv_tags_0_0= ruleTags ) )? otherlv_1= '==' otherlv_2= 'Scenario:' ( (lv_name_3_0= ruleTitle ) ) ( (lv_statements_4_0= ruleStatement ) )* ( (lv_steps_5_0= ruleStep ) )* ( (lv_examples_6_0= ruleExamples ) )* )
            {
            // InternalSheepDog.g:589:2: ( ( (lv_tags_0_0= ruleTags ) )? otherlv_1= '==' otherlv_2= 'Scenario:' ( (lv_name_3_0= ruleTitle ) ) ( (lv_statements_4_0= ruleStatement ) )* ( (lv_steps_5_0= ruleStep ) )* ( (lv_examples_6_0= ruleExamples ) )* )
            // InternalSheepDog.g:590:3: ( (lv_tags_0_0= ruleTags ) )? otherlv_1= '==' otherlv_2= 'Scenario:' ( (lv_name_3_0= ruleTitle ) ) ( (lv_statements_4_0= ruleStatement ) )* ( (lv_steps_5_0= ruleStep ) )* ( (lv_examples_6_0= ruleExamples ) )*
            {
            // InternalSheepDog.g:590:3: ( (lv_tags_0_0= ruleTags ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSheepDog.g:591:4: (lv_tags_0_0= ruleTags )
                    {
                    // InternalSheepDog.g:591:4: (lv_tags_0_0= ruleTags )
                    // InternalSheepDog.g:592:5: lv_tags_0_0= ruleTags
                    {

                    					newCompositeNode(grammarAccess.getScenarioAccess().getTagsTagsParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_tags_0_0=ruleTags();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getScenarioRule());
                    					}
                    					set(
                    						current,
                    						"tags",
                    						lv_tags_0_0,
                    						"org.farhan.mbt.SheepDog.Tags");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getScenarioAccess().getEqualsSignEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getScenarioKeyword_2());
            		
            // InternalSheepDog.g:617:3: ( (lv_name_3_0= ruleTitle ) )
            // InternalSheepDog.g:618:4: (lv_name_3_0= ruleTitle )
            {
            // InternalSheepDog.g:618:4: (lv_name_3_0= ruleTitle )
            // InternalSheepDog.g:619:5: lv_name_3_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getScenarioAccess().getNameTitleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalSheepDog.g:636:3: ( (lv_statements_4_0= ruleStatement ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_WORD && LA14_0<=RULE_STRING)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSheepDog.g:637:4: (lv_statements_4_0= ruleStatement )
            	    {
            	    // InternalSheepDog.g:637:4: (lv_statements_4_0= ruleStatement )
            	    // InternalSheepDog.g:638:5: lv_statements_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getStatementsStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_18);
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
            	    break loop14;
                }
            } while (true);

            // InternalSheepDog.g:655:3: ( (lv_steps_5_0= ruleStep ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==14) ) {
                    int LA15_2 = input.LA(2);

                    if ( ((LA15_2>=20 && LA15_2<=23)) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalSheepDog.g:656:4: (lv_steps_5_0= ruleStep )
            	    {
            	    // InternalSheepDog.g:656:4: (lv_steps_5_0= ruleStep )
            	    // InternalSheepDog.g:657:5: lv_steps_5_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_19);
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
            	    break loop15;
                }
            } while (true);

            // InternalSheepDog.g:674:3: ( (lv_examples_6_0= ruleExamples ) )*
            loop16:
            do {
                int alt16=2;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // InternalSheepDog.g:675:4: (lv_examples_6_0= ruleExamples )
            	    {
            	    // InternalSheepDog.g:675:4: (lv_examples_6_0= ruleExamples )
            	    // InternalSheepDog.g:676:5: lv_examples_6_0= ruleExamples
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getExamplesExamplesParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_19);
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
    // InternalSheepDog.g:697:1: entryRuleExamples returns [EObject current=null] : iv_ruleExamples= ruleExamples EOF ;
    public final EObject entryRuleExamples() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExamples = null;


        try {
            // InternalSheepDog.g:697:49: (iv_ruleExamples= ruleExamples EOF )
            // InternalSheepDog.g:698:2: iv_ruleExamples= ruleExamples EOF
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
    // InternalSheepDog.g:704:1: ruleExamples returns [EObject current=null] : ( ( (lv_tags_0_0= ruleTags ) )? otherlv_1= '===' otherlv_2= 'Examples:' ( (lv_name_3_0= ruleTitle ) ) ( (lv_statements_4_0= ruleStatement ) )* ( (lv_theExamplesTable_5_0= ruleTable ) ) ) ;
    public final EObject ruleExamples() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_tags_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_statements_4_0 = null;

        EObject lv_theExamplesTable_5_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:710:2: ( ( ( (lv_tags_0_0= ruleTags ) )? otherlv_1= '===' otherlv_2= 'Examples:' ( (lv_name_3_0= ruleTitle ) ) ( (lv_statements_4_0= ruleStatement ) )* ( (lv_theExamplesTable_5_0= ruleTable ) ) ) )
            // InternalSheepDog.g:711:2: ( ( (lv_tags_0_0= ruleTags ) )? otherlv_1= '===' otherlv_2= 'Examples:' ( (lv_name_3_0= ruleTitle ) ) ( (lv_statements_4_0= ruleStatement ) )* ( (lv_theExamplesTable_5_0= ruleTable ) ) )
            {
            // InternalSheepDog.g:711:2: ( ( (lv_tags_0_0= ruleTags ) )? otherlv_1= '===' otherlv_2= 'Examples:' ( (lv_name_3_0= ruleTitle ) ) ( (lv_statements_4_0= ruleStatement ) )* ( (lv_theExamplesTable_5_0= ruleTable ) ) )
            // InternalSheepDog.g:712:3: ( (lv_tags_0_0= ruleTags ) )? otherlv_1= '===' otherlv_2= 'Examples:' ( (lv_name_3_0= ruleTitle ) ) ( (lv_statements_4_0= ruleStatement ) )* ( (lv_theExamplesTable_5_0= ruleTable ) )
            {
            // InternalSheepDog.g:712:3: ( (lv_tags_0_0= ruleTags ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSheepDog.g:713:4: (lv_tags_0_0= ruleTags )
                    {
                    // InternalSheepDog.g:713:4: (lv_tags_0_0= ruleTags )
                    // InternalSheepDog.g:714:5: lv_tags_0_0= ruleTags
                    {

                    					newCompositeNode(grammarAccess.getExamplesAccess().getTagsTagsParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_tags_0_0=ruleTags();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExamplesRule());
                    					}
                    					set(
                    						current,
                    						"tags",
                    						lv_tags_0_0,
                    						"org.farhan.mbt.SheepDog.Tags");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,14,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getExamplesAccess().getEqualsSignEqualsSignEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getExamplesAccess().getExamplesKeyword_2());
            		
            // InternalSheepDog.g:739:3: ( (lv_name_3_0= ruleTitle ) )
            // InternalSheepDog.g:740:4: (lv_name_3_0= ruleTitle )
            {
            // InternalSheepDog.g:740:4: (lv_name_3_0= ruleTitle )
            // InternalSheepDog.g:741:5: lv_name_3_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getExamplesAccess().getNameTitleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalSheepDog.g:758:3: ( (lv_statements_4_0= ruleStatement ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_WORD && LA18_0<=RULE_STRING)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSheepDog.g:759:4: (lv_statements_4_0= ruleStatement )
            	    {
            	    // InternalSheepDog.g:759:4: (lv_statements_4_0= ruleStatement )
            	    // InternalSheepDog.g:760:5: lv_statements_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getExamplesAccess().getStatementsStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_statements_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExamplesRule());
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
            	    break loop18;
                }
            } while (true);

            // InternalSheepDog.g:777:3: ( (lv_theExamplesTable_5_0= ruleTable ) )
            // InternalSheepDog.g:778:4: (lv_theExamplesTable_5_0= ruleTable )
            {
            // InternalSheepDog.g:778:4: (lv_theExamplesTable_5_0= ruleTable )
            // InternalSheepDog.g:779:5: lv_theExamplesTable_5_0= ruleTable
            {

            					newCompositeNode(grammarAccess.getExamplesAccess().getTheExamplesTableTableParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_theExamplesTable_5_0=ruleTable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExamplesRule());
            					}
            					set(
            						current,
            						"theExamplesTable",
            						lv_theExamplesTable_5_0,
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
    // InternalSheepDog.g:800:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalSheepDog.g:800:45: (iv_ruleStep= ruleStep EOF )
            // InternalSheepDog.g:801:2: iv_ruleStep= ruleStep EOF
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
    // InternalSheepDog.g:807:1: ruleStep returns [EObject current=null] : (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen | this_And_3= ruleAnd ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        EObject this_Given_0 = null;

        EObject this_When_1 = null;

        EObject this_Then_2 = null;

        EObject this_And_3 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:813:2: ( (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen | this_And_3= ruleAnd ) )
            // InternalSheepDog.g:814:2: (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen | this_And_3= ruleAnd )
            {
            // InternalSheepDog.g:814:2: (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen | this_And_3= ruleAnd )
            int alt19=4;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==14) ) {
                switch ( input.LA(2) ) {
                case 22:
                    {
                    alt19=3;
                    }
                    break;
                case 21:
                    {
                    alt19=2;
                    }
                    break;
                case 23:
                    {
                    alt19=4;
                    }
                    break;
                case 20:
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
                    // InternalSheepDog.g:815:3: this_Given_0= ruleGiven
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
                    // InternalSheepDog.g:824:3: this_When_1= ruleWhen
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
                    // InternalSheepDog.g:833:3: this_Then_2= ruleThen
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
                    // InternalSheepDog.g:842:3: this_And_3= ruleAnd
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
    // InternalSheepDog.g:854:1: entryRuleGiven returns [EObject current=null] : iv_ruleGiven= ruleGiven EOF ;
    public final EObject entryRuleGiven() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGiven = null;


        try {
            // InternalSheepDog.g:854:46: (iv_ruleGiven= ruleGiven EOF )
            // InternalSheepDog.g:855:2: iv_ruleGiven= ruleGiven EOF
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
    // InternalSheepDog.g:861:1: ruleGiven returns [EObject current=null] : (otherlv_0= '===' otherlv_1= 'Given' ( (lv_name_2_0= ruleTitle ) ) ( ( (lv_theStepTable_3_0= ruleTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? ) ;
    public final EObject ruleGiven() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_theStepTable_3_0 = null;

        EObject lv_theDocString_4_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:867:2: ( (otherlv_0= '===' otherlv_1= 'Given' ( (lv_name_2_0= ruleTitle ) ) ( ( (lv_theStepTable_3_0= ruleTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? ) )
            // InternalSheepDog.g:868:2: (otherlv_0= '===' otherlv_1= 'Given' ( (lv_name_2_0= ruleTitle ) ) ( ( (lv_theStepTable_3_0= ruleTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? )
            {
            // InternalSheepDog.g:868:2: (otherlv_0= '===' otherlv_1= 'Given' ( (lv_name_2_0= ruleTitle ) ) ( ( (lv_theStepTable_3_0= ruleTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? )
            // InternalSheepDog.g:869:3: otherlv_0= '===' otherlv_1= 'Given' ( (lv_name_2_0= ruleTitle ) ) ( ( (lv_theStepTable_3_0= ruleTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getGivenAccess().getEqualsSignEqualsSignEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGivenAccess().getGivenKeyword_1());
            		
            // InternalSheepDog.g:877:3: ( (lv_name_2_0= ruleTitle ) )
            // InternalSheepDog.g:878:4: (lv_name_2_0= ruleTitle )
            {
            // InternalSheepDog.g:878:4: (lv_name_2_0= ruleTitle )
            // InternalSheepDog.g:879:5: lv_name_2_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getGivenAccess().getNameTitleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
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

            // InternalSheepDog.g:896:3: ( ( (lv_theStepTable_3_0= ruleTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )?
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            else if ( (LA20_0==24) ) {
                alt20=2;
            }
            switch (alt20) {
                case 1 :
                    // InternalSheepDog.g:897:4: ( (lv_theStepTable_3_0= ruleTable ) )
                    {
                    // InternalSheepDog.g:897:4: ( (lv_theStepTable_3_0= ruleTable ) )
                    // InternalSheepDog.g:898:5: (lv_theStepTable_3_0= ruleTable )
                    {
                    // InternalSheepDog.g:898:5: (lv_theStepTable_3_0= ruleTable )
                    // InternalSheepDog.g:899:6: lv_theStepTable_3_0= ruleTable
                    {

                    						newCompositeNode(grammarAccess.getGivenAccess().getTheStepTableTableParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_theStepTable_3_0=ruleTable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGivenRule());
                    						}
                    						set(
                    							current,
                    							"theStepTable",
                    							lv_theStepTable_3_0,
                    							"org.farhan.mbt.SheepDog.Table");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSheepDog.g:917:4: ( (lv_theDocString_4_0= ruleDocString ) )
                    {
                    // InternalSheepDog.g:917:4: ( (lv_theDocString_4_0= ruleDocString ) )
                    // InternalSheepDog.g:918:5: (lv_theDocString_4_0= ruleDocString )
                    {
                    // InternalSheepDog.g:918:5: (lv_theDocString_4_0= ruleDocString )
                    // InternalSheepDog.g:919:6: lv_theDocString_4_0= ruleDocString
                    {

                    						newCompositeNode(grammarAccess.getGivenAccess().getTheDocStringDocStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_theDocString_4_0=ruleDocString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGivenRule());
                    						}
                    						set(
                    							current,
                    							"theDocString",
                    							lv_theDocString_4_0,
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
    // InternalSheepDog.g:941:1: entryRuleWhen returns [EObject current=null] : iv_ruleWhen= ruleWhen EOF ;
    public final EObject entryRuleWhen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhen = null;


        try {
            // InternalSheepDog.g:941:45: (iv_ruleWhen= ruleWhen EOF )
            // InternalSheepDog.g:942:2: iv_ruleWhen= ruleWhen EOF
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
    // InternalSheepDog.g:948:1: ruleWhen returns [EObject current=null] : (otherlv_0= '===' otherlv_1= 'When' ( (lv_name_2_0= ruleTitle ) ) ( ( (lv_theStepTable_3_0= ruleTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? ) ;
    public final EObject ruleWhen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_theStepTable_3_0 = null;

        EObject lv_theDocString_4_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:954:2: ( (otherlv_0= '===' otherlv_1= 'When' ( (lv_name_2_0= ruleTitle ) ) ( ( (lv_theStepTable_3_0= ruleTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? ) )
            // InternalSheepDog.g:955:2: (otherlv_0= '===' otherlv_1= 'When' ( (lv_name_2_0= ruleTitle ) ) ( ( (lv_theStepTable_3_0= ruleTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? )
            {
            // InternalSheepDog.g:955:2: (otherlv_0= '===' otherlv_1= 'When' ( (lv_name_2_0= ruleTitle ) ) ( ( (lv_theStepTable_3_0= ruleTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? )
            // InternalSheepDog.g:956:3: otherlv_0= '===' otherlv_1= 'When' ( (lv_name_2_0= ruleTitle ) ) ( ( (lv_theStepTable_3_0= ruleTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getWhenAccess().getEqualsSignEqualsSignEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getWhenAccess().getWhenKeyword_1());
            		
            // InternalSheepDog.g:964:3: ( (lv_name_2_0= ruleTitle ) )
            // InternalSheepDog.g:965:4: (lv_name_2_0= ruleTitle )
            {
            // InternalSheepDog.g:965:4: (lv_name_2_0= ruleTitle )
            // InternalSheepDog.g:966:5: lv_name_2_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getWhenAccess().getNameTitleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
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

            // InternalSheepDog.g:983:3: ( ( (lv_theStepTable_3_0= ruleTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )?
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            else if ( (LA21_0==24) ) {
                alt21=2;
            }
            switch (alt21) {
                case 1 :
                    // InternalSheepDog.g:984:4: ( (lv_theStepTable_3_0= ruleTable ) )
                    {
                    // InternalSheepDog.g:984:4: ( (lv_theStepTable_3_0= ruleTable ) )
                    // InternalSheepDog.g:985:5: (lv_theStepTable_3_0= ruleTable )
                    {
                    // InternalSheepDog.g:985:5: (lv_theStepTable_3_0= ruleTable )
                    // InternalSheepDog.g:986:6: lv_theStepTable_3_0= ruleTable
                    {

                    						newCompositeNode(grammarAccess.getWhenAccess().getTheStepTableTableParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_theStepTable_3_0=ruleTable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWhenRule());
                    						}
                    						set(
                    							current,
                    							"theStepTable",
                    							lv_theStepTable_3_0,
                    							"org.farhan.mbt.SheepDog.Table");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSheepDog.g:1004:4: ( (lv_theDocString_4_0= ruleDocString ) )
                    {
                    // InternalSheepDog.g:1004:4: ( (lv_theDocString_4_0= ruleDocString ) )
                    // InternalSheepDog.g:1005:5: (lv_theDocString_4_0= ruleDocString )
                    {
                    // InternalSheepDog.g:1005:5: (lv_theDocString_4_0= ruleDocString )
                    // InternalSheepDog.g:1006:6: lv_theDocString_4_0= ruleDocString
                    {

                    						newCompositeNode(grammarAccess.getWhenAccess().getTheDocStringDocStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_theDocString_4_0=ruleDocString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWhenRule());
                    						}
                    						set(
                    							current,
                    							"theDocString",
                    							lv_theDocString_4_0,
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
    // InternalSheepDog.g:1028:1: entryRuleThen returns [EObject current=null] : iv_ruleThen= ruleThen EOF ;
    public final EObject entryRuleThen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThen = null;


        try {
            // InternalSheepDog.g:1028:45: (iv_ruleThen= ruleThen EOF )
            // InternalSheepDog.g:1029:2: iv_ruleThen= ruleThen EOF
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
    // InternalSheepDog.g:1035:1: ruleThen returns [EObject current=null] : (otherlv_0= '===' otherlv_1= 'Then' ( (lv_name_2_0= ruleTitle ) ) ( ( (lv_theStepTable_3_0= ruleTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? ) ;
    public final EObject ruleThen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_theStepTable_3_0 = null;

        EObject lv_theDocString_4_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1041:2: ( (otherlv_0= '===' otherlv_1= 'Then' ( (lv_name_2_0= ruleTitle ) ) ( ( (lv_theStepTable_3_0= ruleTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? ) )
            // InternalSheepDog.g:1042:2: (otherlv_0= '===' otherlv_1= 'Then' ( (lv_name_2_0= ruleTitle ) ) ( ( (lv_theStepTable_3_0= ruleTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? )
            {
            // InternalSheepDog.g:1042:2: (otherlv_0= '===' otherlv_1= 'Then' ( (lv_name_2_0= ruleTitle ) ) ( ( (lv_theStepTable_3_0= ruleTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? )
            // InternalSheepDog.g:1043:3: otherlv_0= '===' otherlv_1= 'Then' ( (lv_name_2_0= ruleTitle ) ) ( ( (lv_theStepTable_3_0= ruleTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getThenAccess().getEqualsSignEqualsSignEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getThenAccess().getThenKeyword_1());
            		
            // InternalSheepDog.g:1051:3: ( (lv_name_2_0= ruleTitle ) )
            // InternalSheepDog.g:1052:4: (lv_name_2_0= ruleTitle )
            {
            // InternalSheepDog.g:1052:4: (lv_name_2_0= ruleTitle )
            // InternalSheepDog.g:1053:5: lv_name_2_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getThenAccess().getNameTitleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
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

            // InternalSheepDog.g:1070:3: ( ( (lv_theStepTable_3_0= ruleTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )?
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            else if ( (LA22_0==24) ) {
                alt22=2;
            }
            switch (alt22) {
                case 1 :
                    // InternalSheepDog.g:1071:4: ( (lv_theStepTable_3_0= ruleTable ) )
                    {
                    // InternalSheepDog.g:1071:4: ( (lv_theStepTable_3_0= ruleTable ) )
                    // InternalSheepDog.g:1072:5: (lv_theStepTable_3_0= ruleTable )
                    {
                    // InternalSheepDog.g:1072:5: (lv_theStepTable_3_0= ruleTable )
                    // InternalSheepDog.g:1073:6: lv_theStepTable_3_0= ruleTable
                    {

                    						newCompositeNode(grammarAccess.getThenAccess().getTheStepTableTableParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_theStepTable_3_0=ruleTable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getThenRule());
                    						}
                    						set(
                    							current,
                    							"theStepTable",
                    							lv_theStepTable_3_0,
                    							"org.farhan.mbt.SheepDog.Table");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSheepDog.g:1091:4: ( (lv_theDocString_4_0= ruleDocString ) )
                    {
                    // InternalSheepDog.g:1091:4: ( (lv_theDocString_4_0= ruleDocString ) )
                    // InternalSheepDog.g:1092:5: (lv_theDocString_4_0= ruleDocString )
                    {
                    // InternalSheepDog.g:1092:5: (lv_theDocString_4_0= ruleDocString )
                    // InternalSheepDog.g:1093:6: lv_theDocString_4_0= ruleDocString
                    {

                    						newCompositeNode(grammarAccess.getThenAccess().getTheDocStringDocStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_theDocString_4_0=ruleDocString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getThenRule());
                    						}
                    						set(
                    							current,
                    							"theDocString",
                    							lv_theDocString_4_0,
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
    // InternalSheepDog.g:1115:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalSheepDog.g:1115:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalSheepDog.g:1116:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalSheepDog.g:1122:1: ruleAnd returns [EObject current=null] : (otherlv_0= '===' otherlv_1= 'And' ( (lv_name_2_0= ruleTitle ) ) ( ( (lv_theStepTable_3_0= ruleTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_theStepTable_3_0 = null;

        EObject lv_theDocString_4_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1128:2: ( (otherlv_0= '===' otherlv_1= 'And' ( (lv_name_2_0= ruleTitle ) ) ( ( (lv_theStepTable_3_0= ruleTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? ) )
            // InternalSheepDog.g:1129:2: (otherlv_0= '===' otherlv_1= 'And' ( (lv_name_2_0= ruleTitle ) ) ( ( (lv_theStepTable_3_0= ruleTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? )
            {
            // InternalSheepDog.g:1129:2: (otherlv_0= '===' otherlv_1= 'And' ( (lv_name_2_0= ruleTitle ) ) ( ( (lv_theStepTable_3_0= ruleTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? )
            // InternalSheepDog.g:1130:3: otherlv_0= '===' otherlv_1= 'And' ( (lv_name_2_0= ruleTitle ) ) ( ( (lv_theStepTable_3_0= ruleTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getAndAccess().getEqualsSignEqualsSignEqualsSignKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAndAccess().getAndKeyword_1());
            		
            // InternalSheepDog.g:1138:3: ( (lv_name_2_0= ruleTitle ) )
            // InternalSheepDog.g:1139:4: (lv_name_2_0= ruleTitle )
            {
            // InternalSheepDog.g:1139:4: (lv_name_2_0= ruleTitle )
            // InternalSheepDog.g:1140:5: lv_name_2_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getAndAccess().getNameTitleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
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

            // InternalSheepDog.g:1157:3: ( ( (lv_theStepTable_3_0= ruleTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )?
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            else if ( (LA23_0==24) ) {
                alt23=2;
            }
            switch (alt23) {
                case 1 :
                    // InternalSheepDog.g:1158:4: ( (lv_theStepTable_3_0= ruleTable ) )
                    {
                    // InternalSheepDog.g:1158:4: ( (lv_theStepTable_3_0= ruleTable ) )
                    // InternalSheepDog.g:1159:5: (lv_theStepTable_3_0= ruleTable )
                    {
                    // InternalSheepDog.g:1159:5: (lv_theStepTable_3_0= ruleTable )
                    // InternalSheepDog.g:1160:6: lv_theStepTable_3_0= ruleTable
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getTheStepTableTableParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_theStepTable_3_0=ruleTable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						set(
                    							current,
                    							"theStepTable",
                    							lv_theStepTable_3_0,
                    							"org.farhan.mbt.SheepDog.Table");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSheepDog.g:1178:4: ( (lv_theDocString_4_0= ruleDocString ) )
                    {
                    // InternalSheepDog.g:1178:4: ( (lv_theDocString_4_0= ruleDocString ) )
                    // InternalSheepDog.g:1179:5: (lv_theDocString_4_0= ruleDocString )
                    {
                    // InternalSheepDog.g:1179:5: (lv_theDocString_4_0= ruleDocString )
                    // InternalSheepDog.g:1180:6: lv_theDocString_4_0= ruleDocString
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getTheDocStringDocStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_theDocString_4_0=ruleDocString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						set(
                    							current,
                    							"theDocString",
                    							lv_theDocString_4_0,
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
    // InternalSheepDog.g:1202:1: entryRuleDocString returns [EObject current=null] : iv_ruleDocString= ruleDocString EOF ;
    public final EObject entryRuleDocString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocString = null;


        try {
            // InternalSheepDog.g:1202:50: (iv_ruleDocString= ruleDocString EOF )
            // InternalSheepDog.g:1203:2: iv_ruleDocString= ruleDocString EOF
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
    // InternalSheepDog.g:1209:1: ruleDocString returns [EObject current=null] : (otherlv_0= '----' this_EOL_1= RULE_EOL ( (lv_lines_2_0= ruleLine ) )+ otherlv_3= '----' this_EOL_4= RULE_EOL ) ;
    public final EObject ruleDocString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EOL_1=null;
        Token otherlv_3=null;
        Token this_EOL_4=null;
        AntlrDatatypeRuleToken lv_lines_2_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1215:2: ( (otherlv_0= '----' this_EOL_1= RULE_EOL ( (lv_lines_2_0= ruleLine ) )+ otherlv_3= '----' this_EOL_4= RULE_EOL ) )
            // InternalSheepDog.g:1216:2: (otherlv_0= '----' this_EOL_1= RULE_EOL ( (lv_lines_2_0= ruleLine ) )+ otherlv_3= '----' this_EOL_4= RULE_EOL )
            {
            // InternalSheepDog.g:1216:2: (otherlv_0= '----' this_EOL_1= RULE_EOL ( (lv_lines_2_0= ruleLine ) )+ otherlv_3= '----' this_EOL_4= RULE_EOL )
            // InternalSheepDog.g:1217:3: otherlv_0= '----' this_EOL_1= RULE_EOL ( (lv_lines_2_0= ruleLine ) )+ otherlv_3= '----' this_EOL_4= RULE_EOL
            {
            otherlv_0=(Token)match(input,24,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getDocStringAccess().getHyphenMinusHyphenMinusHyphenMinusHyphenMinusKeyword_0());
            		
            this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_28); 

            			newLeafNode(this_EOL_1, grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_1());
            		
            // InternalSheepDog.g:1225:3: ( (lv_lines_2_0= ruleLine ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_EOL && LA24_0<=RULE_STRING)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSheepDog.g:1226:4: (lv_lines_2_0= ruleLine )
            	    {
            	    // InternalSheepDog.g:1226:4: (lv_lines_2_0= ruleLine )
            	    // InternalSheepDog.g:1227:5: lv_lines_2_0= ruleLine
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
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_27); 

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
    // InternalSheepDog.g:1256:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalSheepDog.g:1256:46: (iv_ruleTable= ruleTable EOF )
            // InternalSheepDog.g:1257:2: iv_ruleTable= ruleTable EOF
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
    // InternalSheepDog.g:1263:1: ruleTable returns [EObject current=null] : (otherlv_0= '[options=\"header\"]' this_EOL_1= RULE_EOL otherlv_2= '|===' this_EOL_3= RULE_EOL ( (lv_rows_4_0= ruleRow ) )+ otherlv_5= '|===' this_EOL_6= RULE_EOL ) ;
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
            // InternalSheepDog.g:1269:2: ( (otherlv_0= '[options=\"header\"]' this_EOL_1= RULE_EOL otherlv_2= '|===' this_EOL_3= RULE_EOL ( (lv_rows_4_0= ruleRow ) )+ otherlv_5= '|===' this_EOL_6= RULE_EOL ) )
            // InternalSheepDog.g:1270:2: (otherlv_0= '[options=\"header\"]' this_EOL_1= RULE_EOL otherlv_2= '|===' this_EOL_3= RULE_EOL ( (lv_rows_4_0= ruleRow ) )+ otherlv_5= '|===' this_EOL_6= RULE_EOL )
            {
            // InternalSheepDog.g:1270:2: (otherlv_0= '[options=\"header\"]' this_EOL_1= RULE_EOL otherlv_2= '|===' this_EOL_3= RULE_EOL ( (lv_rows_4_0= ruleRow ) )+ otherlv_5= '|===' this_EOL_6= RULE_EOL )
            // InternalSheepDog.g:1271:3: otherlv_0= '[options=\"header\"]' this_EOL_1= RULE_EOL otherlv_2= '|===' this_EOL_3= RULE_EOL ( (lv_rows_4_0= ruleRow ) )+ otherlv_5= '|===' this_EOL_6= RULE_EOL
            {
            otherlv_0=(Token)match(input,25,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getOptionsHeaderKeyword_0());
            		
            this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_30); 

            			newLeafNode(this_EOL_1, grammarAccess.getTableAccess().getEOLTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getTableAccess().getVerticalLineEqualsSignEqualsSignEqualsSignKeyword_2());
            		
            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_31); 

            			newLeafNode(this_EOL_3, grammarAccess.getTableAccess().getEOLTerminalRuleCall_3());
            		
            // InternalSheepDog.g:1287:3: ( (lv_rows_4_0= ruleRow ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==29) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSheepDog.g:1288:4: (lv_rows_4_0= ruleRow )
            	    {
            	    // InternalSheepDog.g:1288:4: (lv_rows_4_0= ruleRow )
            	    // InternalSheepDog.g:1289:5: lv_rows_4_0= ruleRow
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
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            otherlv_5=(Token)match(input,26,FOLLOW_27); 

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
    // InternalSheepDog.g:1318:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // InternalSheepDog.g:1318:44: (iv_ruleRow= ruleRow EOF )
            // InternalSheepDog.g:1319:2: iv_ruleRow= ruleRow EOF
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
    // InternalSheepDog.g:1325:1: ruleRow returns [EObject current=null] : ( ( (lv_cells_0_0= ruleCell ) )+ this_EOL_1= RULE_EOL ) ;
    public final EObject ruleRow() throws RecognitionException {
        EObject current = null;

        Token this_EOL_1=null;
        AntlrDatatypeRuleToken lv_cells_0_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1331:2: ( ( ( (lv_cells_0_0= ruleCell ) )+ this_EOL_1= RULE_EOL ) )
            // InternalSheepDog.g:1332:2: ( ( (lv_cells_0_0= ruleCell ) )+ this_EOL_1= RULE_EOL )
            {
            // InternalSheepDog.g:1332:2: ( ( (lv_cells_0_0= ruleCell ) )+ this_EOL_1= RULE_EOL )
            // InternalSheepDog.g:1333:3: ( (lv_cells_0_0= ruleCell ) )+ this_EOL_1= RULE_EOL
            {
            // InternalSheepDog.g:1333:3: ( (lv_cells_0_0= ruleCell ) )+
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
            	    // InternalSheepDog.g:1334:4: (lv_cells_0_0= ruleCell )
            	    {
            	    // InternalSheepDog.g:1334:4: (lv_cells_0_0= ruleCell )
            	    // InternalSheepDog.g:1335:5: lv_cells_0_0= ruleCell
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
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
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


    // $ANTLR start "entryRuleTags"
    // InternalSheepDog.g:1360:1: entryRuleTags returns [String current=null] : iv_ruleTags= ruleTags EOF ;
    public final String entryRuleTags() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTags = null;


        try {
            // InternalSheepDog.g:1360:44: (iv_ruleTags= ruleTags EOF )
            // InternalSheepDog.g:1361:2: iv_ruleTags= ruleTags EOF
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
    // InternalSheepDog.g:1367:1: ruleTags returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[tags=\"' (this_TEXT_LITERAL_1= ruleTEXT_LITERAL )+ kw= '\"]' this_EOL_3= RULE_EOL ) ;
    public final AntlrDatatypeRuleToken ruleTags() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_EOL_3=null;
        AntlrDatatypeRuleToken this_TEXT_LITERAL_1 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1373:2: ( (kw= '[tags=\"' (this_TEXT_LITERAL_1= ruleTEXT_LITERAL )+ kw= '\"]' this_EOL_3= RULE_EOL ) )
            // InternalSheepDog.g:1374:2: (kw= '[tags=\"' (this_TEXT_LITERAL_1= ruleTEXT_LITERAL )+ kw= '\"]' this_EOL_3= RULE_EOL )
            {
            // InternalSheepDog.g:1374:2: (kw= '[tags=\"' (this_TEXT_LITERAL_1= ruleTEXT_LITERAL )+ kw= '\"]' this_EOL_3= RULE_EOL )
            // InternalSheepDog.g:1375:3: kw= '[tags=\"' (this_TEXT_LITERAL_1= ruleTEXT_LITERAL )+ kw= '\"]' this_EOL_3= RULE_EOL
            {
            kw=(Token)match(input,27,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTagsAccess().getTagsKeyword_0());
            		
            // InternalSheepDog.g:1380:3: (this_TEXT_LITERAL_1= ruleTEXT_LITERAL )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_WORD && LA27_0<=RULE_STRING)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSheepDog.g:1381:4: this_TEXT_LITERAL_1= ruleTEXT_LITERAL
            	    {

            	    				newCompositeNode(grammarAccess.getTagsAccess().getTEXT_LITERALParserRuleCall_1());
            	    			
            	    pushFollow(FOLLOW_34);
            	    this_TEXT_LITERAL_1=ruleTEXT_LITERAL();

            	    state._fsp--;


            	    				current.merge(this_TEXT_LITERAL_1);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

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

            kw=(Token)match(input,28,FOLLOW_27); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTagsAccess().getQuotationMarkRightSquareBracketKeyword_2());
            		
            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_2); 

            			current.merge(this_EOL_3);
            		

            			newLeafNode(this_EOL_3, grammarAccess.getTagsAccess().getEOLTerminalRuleCall_3());
            		

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


    // $ANTLR start "entryRuleTitle"
    // InternalSheepDog.g:1408:1: entryRuleTitle returns [String current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final String entryRuleTitle() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTitle = null;


        try {
            // InternalSheepDog.g:1408:45: (iv_ruleTitle= ruleTitle EOF )
            // InternalSheepDog.g:1409:2: iv_ruleTitle= ruleTitle EOF
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
    // InternalSheepDog.g:1415:1: ruleTitle returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )+ this_EOL_1= RULE_EOL ) ;
    public final AntlrDatatypeRuleToken ruleTitle() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_EOL_1=null;
        AntlrDatatypeRuleToken this_TEXT_LITERAL_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1421:2: ( ( (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )+ this_EOL_1= RULE_EOL ) )
            // InternalSheepDog.g:1422:2: ( (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )+ this_EOL_1= RULE_EOL )
            {
            // InternalSheepDog.g:1422:2: ( (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )+ this_EOL_1= RULE_EOL )
            // InternalSheepDog.g:1423:3: (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )+ this_EOL_1= RULE_EOL
            {
            // InternalSheepDog.g:1423:3: (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_WORD && LA28_0<=RULE_STRING)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSheepDog.g:1424:4: this_TEXT_LITERAL_0= ruleTEXT_LITERAL
            	    {

            	    				newCompositeNode(grammarAccess.getTitleAccess().getTEXT_LITERALParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_28);
            	    this_TEXT_LITERAL_0=ruleTEXT_LITERAL();

            	    state._fsp--;


            	    				current.merge(this_TEXT_LITERAL_0);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

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

            this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_2); 

            			current.merge(this_EOL_1);
            		

            			newLeafNode(this_EOL_1, grammarAccess.getTitleAccess().getEOLTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleStatement"
    // InternalSheepDog.g:1446:1: entryRuleStatement returns [String current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final String entryRuleStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStatement = null;


        try {
            // InternalSheepDog.g:1446:49: (iv_ruleStatement= ruleStatement EOF )
            // InternalSheepDog.g:1447:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement.getText(); 
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
    // InternalSheepDog.g:1453:1: ruleStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )+ this_EOL_1= RULE_EOL ) ;
    public final AntlrDatatypeRuleToken ruleStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_EOL_1=null;
        AntlrDatatypeRuleToken this_TEXT_LITERAL_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1459:2: ( ( (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )+ this_EOL_1= RULE_EOL ) )
            // InternalSheepDog.g:1460:2: ( (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )+ this_EOL_1= RULE_EOL )
            {
            // InternalSheepDog.g:1460:2: ( (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )+ this_EOL_1= RULE_EOL )
            // InternalSheepDog.g:1461:3: (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )+ this_EOL_1= RULE_EOL
            {
            // InternalSheepDog.g:1461:3: (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_WORD && LA29_0<=RULE_STRING)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSheepDog.g:1462:4: this_TEXT_LITERAL_0= ruleTEXT_LITERAL
            	    {

            	    				newCompositeNode(grammarAccess.getStatementAccess().getTEXT_LITERALParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_28);
            	    this_TEXT_LITERAL_0=ruleTEXT_LITERAL();

            	    state._fsp--;


            	    				current.merge(this_TEXT_LITERAL_0);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);

            this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_2); 

            			current.merge(this_EOL_1);
            		

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
    // InternalSheepDog.g:1484:1: entryRuleLine returns [String current=null] : iv_ruleLine= ruleLine EOF ;
    public final String entryRuleLine() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLine = null;


        try {
            // InternalSheepDog.g:1484:44: (iv_ruleLine= ruleLine EOF )
            // InternalSheepDog.g:1485:2: iv_ruleLine= ruleLine EOF
            {
             newCompositeNode(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLine=ruleLine();

            state._fsp--;

             current =iv_ruleLine.getText(); 
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
    // InternalSheepDog.g:1491:1: ruleLine returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )* this_EOL_1= RULE_EOL ) ;
    public final AntlrDatatypeRuleToken ruleLine() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_EOL_1=null;
        AntlrDatatypeRuleToken this_TEXT_LITERAL_0 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1497:2: ( ( (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )* this_EOL_1= RULE_EOL ) )
            // InternalSheepDog.g:1498:2: ( (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )* this_EOL_1= RULE_EOL )
            {
            // InternalSheepDog.g:1498:2: ( (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )* this_EOL_1= RULE_EOL )
            // InternalSheepDog.g:1499:3: (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )* this_EOL_1= RULE_EOL
            {
            // InternalSheepDog.g:1499:3: (this_TEXT_LITERAL_0= ruleTEXT_LITERAL )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_WORD && LA30_0<=RULE_STRING)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSheepDog.g:1500:4: this_TEXT_LITERAL_0= ruleTEXT_LITERAL
            	    {

            	    				newCompositeNode(grammarAccess.getLineAccess().getTEXT_LITERALParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_28);
            	    this_TEXT_LITERAL_0=ruleTEXT_LITERAL();

            	    state._fsp--;


            	    				current.merge(this_TEXT_LITERAL_0);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_2); 

            			current.merge(this_EOL_1);
            		

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


    // $ANTLR start "entryRuleCell"
    // InternalSheepDog.g:1522:1: entryRuleCell returns [String current=null] : iv_ruleCell= ruleCell EOF ;
    public final String entryRuleCell() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCell = null;


        try {
            // InternalSheepDog.g:1522:44: (iv_ruleCell= ruleCell EOF )
            // InternalSheepDog.g:1523:2: iv_ruleCell= ruleCell EOF
            {
             newCompositeNode(grammarAccess.getCellRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCell=ruleCell();

            state._fsp--;

             current =iv_ruleCell.getText(); 
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
    // InternalSheepDog.g:1529:1: ruleCell returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '|' (this_TEXT_LITERAL_1= ruleTEXT_LITERAL )* ) ;
    public final AntlrDatatypeRuleToken ruleCell() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TEXT_LITERAL_1 = null;



        	enterRule();

        try {
            // InternalSheepDog.g:1535:2: ( (kw= '|' (this_TEXT_LITERAL_1= ruleTEXT_LITERAL )* ) )
            // InternalSheepDog.g:1536:2: (kw= '|' (this_TEXT_LITERAL_1= ruleTEXT_LITERAL )* )
            {
            // InternalSheepDog.g:1536:2: (kw= '|' (this_TEXT_LITERAL_1= ruleTEXT_LITERAL )* )
            // InternalSheepDog.g:1537:3: kw= '|' (this_TEXT_LITERAL_1= ruleTEXT_LITERAL )*
            {
            kw=(Token)match(input,29,FOLLOW_35); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getCellAccess().getVerticalLineKeyword_0());
            		
            // InternalSheepDog.g:1542:3: (this_TEXT_LITERAL_1= ruleTEXT_LITERAL )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_WORD && LA31_0<=RULE_STRING)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalSheepDog.g:1543:4: this_TEXT_LITERAL_1= ruleTEXT_LITERAL
            	    {

            	    				newCompositeNode(grammarAccess.getCellAccess().getTEXT_LITERALParserRuleCall_1());
            	    			
            	    pushFollow(FOLLOW_35);
            	    this_TEXT_LITERAL_1=ruleTEXT_LITERAL();

            	    state._fsp--;


            	    				current.merge(this_TEXT_LITERAL_1);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // $ANTLR end "ruleCell"


    // $ANTLR start "entryRuleTEXT_LITERAL"
    // InternalSheepDog.g:1558:1: entryRuleTEXT_LITERAL returns [String current=null] : iv_ruleTEXT_LITERAL= ruleTEXT_LITERAL EOF ;
    public final String entryRuleTEXT_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTEXT_LITERAL = null;


        try {
            // InternalSheepDog.g:1558:52: (iv_ruleTEXT_LITERAL= ruleTEXT_LITERAL EOF )
            // InternalSheepDog.g:1559:2: iv_ruleTEXT_LITERAL= ruleTEXT_LITERAL EOF
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
    // InternalSheepDog.g:1565:1: ruleTEXT_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WORD_0= RULE_WORD | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleTEXT_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;
        Token this_ID_1=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            // InternalSheepDog.g:1571:2: ( (this_WORD_0= RULE_WORD | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING ) )
            // InternalSheepDog.g:1572:2: (this_WORD_0= RULE_WORD | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING )
            {
            // InternalSheepDog.g:1572:2: (this_WORD_0= RULE_WORD | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING )
            int alt32=3;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                alt32=1;
                }
                break;
            case RULE_ID:
                {
                alt32=2;
                }
                break;
            case RULE_STRING:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalSheepDog.g:1573:3: this_WORD_0= RULE_WORD
                    {
                    this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_2); 

                    			current.merge(this_WORD_0);
                    		

                    			newLeafNode(this_WORD_0, grammarAccess.getTEXT_LITERALAccess().getWORDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSheepDog.g:1581:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getTEXT_LITERALAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSheepDog.g:1589:3: this_STRING_2= RULE_STRING
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


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\14\1\5\1\21\3\5\2\uffff\1\4\1\14";
    static final String dfa_3s = "\1\33\1\7\1\22\3\34\2\uffff\1\4\1\14";
    static final String dfa_4s = "\6\uffff\1\2\1\1\2\uffff";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\16\uffff\1\1",
            "\1\3\1\4\1\5",
            "\1\7\1\6",
            "\1\3\1\4\1\5\24\uffff\1\10",
            "\1\3\1\4\1\5\24\uffff\1\10",
            "\1\3\1\4\1\5\24\uffff\1\10",
            "",
            "",
            "\1\11",
            "\1\2"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "450:2: (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario )";
        }
    }
    static final String dfa_7s = "\11\uffff";
    static final String dfa_8s = "\1\1\10\uffff";
    static final String dfa_9s = "\1\14\1\uffff\1\5\1\uffff\3\5\1\4\1\14";
    static final String dfa_10s = "\1\33\1\uffff\1\7\1\uffff\3\34\1\4\1\16";
    static final String dfa_11s = "\1\uffff\1\2\1\uffff\1\1\5\uffff";
    static final String dfa_12s = "\11\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\1\uffff\1\3\14\uffff\1\2",
            "",
            "\1\4\1\5\1\6",
            "",
            "\1\4\1\5\1\6\24\uffff\1\7",
            "\1\4\1\5\1\6\24\uffff\1\7",
            "\1\4\1\5\1\6\24\uffff\1\7",
            "\1\10",
            "\1\1\1\uffff\1\3"
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
            return "()* loopback of 674:3: ( (lv_examples_6_0= ruleExamples ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000010E2L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000040E2L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000020000E0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000080010E2L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008001002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000080040E2L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008004002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000030000E2L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000000010000F0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000100000E0L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000000000000E2L});

}
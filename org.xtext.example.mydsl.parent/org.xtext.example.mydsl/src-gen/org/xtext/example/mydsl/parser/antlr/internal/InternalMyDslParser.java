package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_ID", "RULE_WS", "RULE_SL_COMMENT", "'Feature:'", "'Background:'", "'Given'", "'When'", "'Then'", "'And'", "'But'", "'*'"
    };
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int RULE_ID=5;
    public static final int RULE_EOL=4;
    public static final int RULE_WS=6;
    public static final int RULE_SL_COMMENT=7;
    public static final int T__15=15;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__10=10;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'Feature:' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_stepSets_4_0= rulestepSet ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EOL_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_statements_3_0 = null;

        EObject lv_stepSets_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'Feature:' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_stepSets_4_0= rulestepSet ) )* ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'Feature:' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_stepSets_4_0= rulestepSet ) )* )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'Feature:' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_stepSets_4_0= rulestepSet ) )* )
            // InternalMyDsl.g:79:3: otherlv_0= 'Feature:' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_stepSets_4_0= rulestepSet ) )*
            {
            otherlv_0=(Token)match(input,8,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getFeatureKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_name_1_0= rulePhrase ) )
            // InternalMyDsl.g:84:4: (lv_name_1_0= rulePhrase )
            {
            // InternalMyDsl.g:84:4: (lv_name_1_0= rulePhrase )
            // InternalMyDsl.g:85:5: lv_name_1_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getModelAccess().getNamePhraseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_5); 

            			newLeafNode(this_EOL_2, grammarAccess.getModelAccess().getEOLTerminalRuleCall_2());
            		
            // InternalMyDsl.g:106:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:107:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalMyDsl.g:107:4: (lv_statements_3_0= ruleStatement )
            	    // InternalMyDsl.g:108:5: lv_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:125:3: ( (lv_stepSets_4_0= rulestepSet ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==9) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:126:4: (lv_stepSets_4_0= rulestepSet )
            	    {
            	    // InternalMyDsl.g:126:4: (lv_stepSets_4_0= rulestepSet )
            	    // InternalMyDsl.g:127:5: lv_stepSets_4_0= rulestepSet
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getStepSetsStepSetParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_stepSets_4_0=rulestepSet();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"stepSets",
            	    						lv_stepSets_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.stepSet");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulestepSet"
    // InternalMyDsl.g:148:1: entryRulestepSet returns [EObject current=null] : iv_rulestepSet= rulestepSet EOF ;
    public final EObject entryRulestepSet() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestepSet = null;


        try {
            // InternalMyDsl.g:148:48: (iv_rulestepSet= rulestepSet EOF )
            // InternalMyDsl.g:149:2: iv_rulestepSet= rulestepSet EOF
            {
             newCompositeNode(grammarAccess.getStepSetRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestepSet=rulestepSet();

            state._fsp--;

             current =iv_rulestepSet; 
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
    // $ANTLR end "entryRulestepSet"


    // $ANTLR start "rulestepSet"
    // InternalMyDsl.g:155:1: rulestepSet returns [EObject current=null] : this_Background_0= ruleBackground ;
    public final EObject rulestepSet() throws RecognitionException {
        EObject current = null;

        EObject this_Background_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:161:2: (this_Background_0= ruleBackground )
            // InternalMyDsl.g:162:2: this_Background_0= ruleBackground
            {

            		newCompositeNode(grammarAccess.getStepSetAccess().getBackgroundParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Background_0=ruleBackground();

            state._fsp--;


            		current = this_Background_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "rulestepSet"


    // $ANTLR start "entryRuleBackground"
    // InternalMyDsl.g:173:1: entryRuleBackground returns [EObject current=null] : iv_ruleBackground= ruleBackground EOF ;
    public final EObject entryRuleBackground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackground = null;


        try {
            // InternalMyDsl.g:173:51: (iv_ruleBackground= ruleBackground EOF )
            // InternalMyDsl.g:174:2: iv_ruleBackground= ruleBackground EOF
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
    // InternalMyDsl.g:180:1: ruleBackground returns [EObject current=null] : (otherlv_0= 'Background:' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_steps_4_0= ruleStep ) )* ) ;
    public final EObject ruleBackground() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EOL_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_statements_3_0 = null;

        EObject lv_steps_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:186:2: ( (otherlv_0= 'Background:' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_steps_4_0= ruleStep ) )* ) )
            // InternalMyDsl.g:187:2: (otherlv_0= 'Background:' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_steps_4_0= ruleStep ) )* )
            {
            // InternalMyDsl.g:187:2: (otherlv_0= 'Background:' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_steps_4_0= ruleStep ) )* )
            // InternalMyDsl.g:188:3: otherlv_0= 'Background:' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_steps_4_0= ruleStep ) )*
            {
            otherlv_0=(Token)match(input,9,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBackgroundAccess().getBackgroundKeyword_0());
            		
            // InternalMyDsl.g:192:3: ( (lv_name_1_0= rulePhrase ) )
            // InternalMyDsl.g:193:4: (lv_name_1_0= rulePhrase )
            {
            // InternalMyDsl.g:193:4: (lv_name_1_0= rulePhrase )
            // InternalMyDsl.g:194:5: lv_name_1_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getBackgroundAccess().getNamePhraseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBackgroundRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_7); 

            			newLeafNode(this_EOL_2, grammarAccess.getBackgroundAccess().getEOLTerminalRuleCall_2());
            		
            // InternalMyDsl.g:215:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:216:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalMyDsl.g:216:4: (lv_statements_3_0= ruleStatement )
            	    // InternalMyDsl.g:217:5: lv_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getBackgroundAccess().getStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBackgroundRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalMyDsl.g:234:3: ( (lv_steps_4_0= ruleStep ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=10 && LA4_0<=15)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:235:4: (lv_steps_4_0= ruleStep )
            	    {
            	    // InternalMyDsl.g:235:4: (lv_steps_4_0= ruleStep )
            	    // InternalMyDsl.g:236:5: lv_steps_4_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_steps_4_0=ruleStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBackgroundRule());
            	    					}
            	    					add(
            	    						current,
            	    						"steps",
            	    						lv_steps_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.Step");
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


    // $ANTLR start "entryRuleStep"
    // InternalMyDsl.g:257:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalMyDsl.g:257:45: (iv_ruleStep= ruleStep EOF )
            // InternalMyDsl.g:258:2: iv_ruleStep= ruleStep EOF
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
    // InternalMyDsl.g:264:1: ruleStep returns [EObject current=null] : ( (otherlv_0= 'Given' | otherlv_1= 'When' | otherlv_2= 'Then' | otherlv_3= 'And' | otherlv_4= 'But' | otherlv_5= '*' ) ( (lv_name_6_0= rulePhrase ) ) (this_EOL_7= RULE_EOL )? ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token this_EOL_7=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:270:2: ( ( (otherlv_0= 'Given' | otherlv_1= 'When' | otherlv_2= 'Then' | otherlv_3= 'And' | otherlv_4= 'But' | otherlv_5= '*' ) ( (lv_name_6_0= rulePhrase ) ) (this_EOL_7= RULE_EOL )? ) )
            // InternalMyDsl.g:271:2: ( (otherlv_0= 'Given' | otherlv_1= 'When' | otherlv_2= 'Then' | otherlv_3= 'And' | otherlv_4= 'But' | otherlv_5= '*' ) ( (lv_name_6_0= rulePhrase ) ) (this_EOL_7= RULE_EOL )? )
            {
            // InternalMyDsl.g:271:2: ( (otherlv_0= 'Given' | otherlv_1= 'When' | otherlv_2= 'Then' | otherlv_3= 'And' | otherlv_4= 'But' | otherlv_5= '*' ) ( (lv_name_6_0= rulePhrase ) ) (this_EOL_7= RULE_EOL )? )
            // InternalMyDsl.g:272:3: (otherlv_0= 'Given' | otherlv_1= 'When' | otherlv_2= 'Then' | otherlv_3= 'And' | otherlv_4= 'But' | otherlv_5= '*' ) ( (lv_name_6_0= rulePhrase ) ) (this_EOL_7= RULE_EOL )?
            {
            // InternalMyDsl.g:272:3: (otherlv_0= 'Given' | otherlv_1= 'When' | otherlv_2= 'Then' | otherlv_3= 'And' | otherlv_4= 'But' | otherlv_5= '*' )
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
                    // InternalMyDsl.g:273:4: otherlv_0= 'Given'
                    {
                    otherlv_0=(Token)match(input,10,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getStepAccess().getGivenKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:278:4: otherlv_1= 'When'
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getStepAccess().getWhenKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:283:4: otherlv_2= 'Then'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getStepAccess().getThenKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:288:4: otherlv_3= 'And'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getStepAccess().getAndKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:293:4: otherlv_4= 'But'
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getStepAccess().getButKeyword_0_4());
                    			

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:298:4: otherlv_5= '*'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getStepAccess().getAsteriskKeyword_0_5());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:303:3: ( (lv_name_6_0= rulePhrase ) )
            // InternalMyDsl.g:304:4: (lv_name_6_0= rulePhrase )
            {
            // InternalMyDsl.g:304:4: (lv_name_6_0= rulePhrase )
            // InternalMyDsl.g:305:5: lv_name_6_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getStepAccess().getNamePhraseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_6_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStepRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.xtext.example.mydsl.MyDsl.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:322:3: (this_EOL_7= RULE_EOL )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_EOL) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:323:4: this_EOL_7= RULE_EOL
                    {
                    this_EOL_7=(Token)match(input,RULE_EOL,FOLLOW_2); 

                    				newLeafNode(this_EOL_7, grammarAccess.getStepAccess().getEOLTerminalRuleCall_2());
                    			

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


    // $ANTLR start "entryRuleStatement"
    // InternalMyDsl.g:332:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMyDsl.g:332:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMyDsl.g:333:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalMyDsl.g:339:1: ruleStatement returns [EObject current=null] : ( ( (lv_name_0_0= rulePhrase ) ) this_EOL_1= RULE_EOL ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token this_EOL_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:345:2: ( ( ( (lv_name_0_0= rulePhrase ) ) this_EOL_1= RULE_EOL ) )
            // InternalMyDsl.g:346:2: ( ( (lv_name_0_0= rulePhrase ) ) this_EOL_1= RULE_EOL )
            {
            // InternalMyDsl.g:346:2: ( ( (lv_name_0_0= rulePhrase ) ) this_EOL_1= RULE_EOL )
            // InternalMyDsl.g:347:3: ( (lv_name_0_0= rulePhrase ) ) this_EOL_1= RULE_EOL
            {
            // InternalMyDsl.g:347:3: ( (lv_name_0_0= rulePhrase ) )
            // InternalMyDsl.g:348:4: (lv_name_0_0= rulePhrase )
            {
            // InternalMyDsl.g:348:4: (lv_name_0_0= rulePhrase )
            // InternalMyDsl.g:349:5: lv_name_0_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getStatementAccess().getNamePhraseParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_0_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyDsl.Phrase");
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
    // InternalMyDsl.g:374:1: entryRulePhrase returns [String current=null] : iv_rulePhrase= rulePhrase EOF ;
    public final String entryRulePhrase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePhrase = null;


        try {
            // InternalMyDsl.g:374:46: (iv_rulePhrase= rulePhrase EOF )
            // InternalMyDsl.g:375:2: iv_rulePhrase= rulePhrase EOF
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
    // InternalMyDsl.g:381:1: rulePhrase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID )+ ;
    public final AntlrDatatypeRuleToken rulePhrase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:387:2: ( (this_ID_0= RULE_ID )+ )
            // InternalMyDsl.g:388:2: (this_ID_0= RULE_ID )+
            {
            // InternalMyDsl.g:388:2: (this_ID_0= RULE_ID )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:389:3: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    			current.merge(this_ID_0);
            	    		

            	    			newLeafNode(this_ID_0, grammarAccess.getPhraseAccess().getIDTerminalRuleCall());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000222L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000FC22L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000FC02L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000022L});

}
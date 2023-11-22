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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_ID", "RULE_WS", "RULE_SL_COMMENT", "'Feature:'"
    };
    public static final int T__8=8;
    public static final int RULE_ID=5;
    public static final int RULE_EOL=4;
    public static final int RULE_WS=6;
    public static final int RULE_SL_COMMENT=7;
    public static final int EOF=-1;

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
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'Feature:' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EOL_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'Feature:' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'Feature:' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'Feature:' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* )
            // InternalMyDsl.g:79:3: otherlv_0= 'Feature:' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )*
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


    // $ANTLR start "entryRuleStatement"
    // InternalMyDsl.g:129:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMyDsl.g:129:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMyDsl.g:130:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalMyDsl.g:136:1: ruleStatement returns [EObject current=null] : ( ( (lv_name_0_0= rulePhrase ) ) this_EOL_1= RULE_EOL ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token this_EOL_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:142:2: ( ( ( (lv_name_0_0= rulePhrase ) ) this_EOL_1= RULE_EOL ) )
            // InternalMyDsl.g:143:2: ( ( (lv_name_0_0= rulePhrase ) ) this_EOL_1= RULE_EOL )
            {
            // InternalMyDsl.g:143:2: ( ( (lv_name_0_0= rulePhrase ) ) this_EOL_1= RULE_EOL )
            // InternalMyDsl.g:144:3: ( (lv_name_0_0= rulePhrase ) ) this_EOL_1= RULE_EOL
            {
            // InternalMyDsl.g:144:3: ( (lv_name_0_0= rulePhrase ) )
            // InternalMyDsl.g:145:4: (lv_name_0_0= rulePhrase )
            {
            // InternalMyDsl.g:145:4: (lv_name_0_0= rulePhrase )
            // InternalMyDsl.g:146:5: lv_name_0_0= rulePhrase
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
    // InternalMyDsl.g:171:1: entryRulePhrase returns [String current=null] : iv_rulePhrase= rulePhrase EOF ;
    public final String entryRulePhrase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePhrase = null;


        try {
            // InternalMyDsl.g:171:46: (iv_rulePhrase= rulePhrase EOF )
            // InternalMyDsl.g:172:2: iv_rulePhrase= rulePhrase EOF
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
    // InternalMyDsl.g:178:1: rulePhrase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID )+ ;
    public final AntlrDatatypeRuleToken rulePhrase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:184:2: ( (this_ID_0= RULE_ID )+ )
            // InternalMyDsl.g:185:2: (this_ID_0= RULE_ID )+
            {
            // InternalMyDsl.g:185:2: (this_ID_0= RULE_ID )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:186:3: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    			current.merge(this_ID_0);
            	    		

            	    			newLeafNode(this_ID_0, grammarAccess.getPhraseAccess().getIDTerminalRuleCall());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000022L});

}
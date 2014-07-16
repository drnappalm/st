package at.bachmann.plc.st.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.bachmann.plc.st.services.STLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalSTLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TIME_OF_DAY", "RULE_DATE", "RULE_DATE_AND_TIME", "RULE_TIME_TYPE_NAME", "RULE_DAYS", "RULE_HOURS", "RULE_MINUTES", "RULE_SECONDS", "RULE_MILLISECONDS", "RULE_MICROSECONDS", "RULE_NANOSECONDS", "RULE_DOT", "RULE_IDENTIFIER", "RULE_UNDERSCORE", "RULE_LETTER", "RULE_DIGIT", "RULE_BIT", "RULE_OCTAL_DIGIT", "RULE_HEX_DIGIT", "RULE_SL_COMMENT", "RULE_ML_COMMENT_1", "RULE_ML_COMMENT_2", "RULE_COMMENT", "RULE_WS", "RULE_EOL", "RULE_PRAGMA", "RULE_INT_LITERAL", "RULE_REAL_LITERAL", "RULE_NUMERIC_LITERAL", "RULE_INT_TYPE_NAME", "RULE_SIGNED_INT", "RULE_BINARY_INT", "RULE_OCTAL_INT", "RULE_HEX_INT", "RULE_UNSIGNED_INT", "RULE_REAL_TYPE_NAME", "RULE_MULTIBITS_TYPE_NAME", "RULE_BIT_STR_LITERAL", "RULE_BOOL_TYPE_NAME", "RULE_BOOL_LITERAL", "RULE_CHAR_STR", "RULE_CHAR_LITERAL", "RULE_S_BYTE_CHAR_STR", "RULE_D_BYTE_CHAR_STR", "RULE_S_BYTE_CHAR_VALUE", "RULE_D_BYTE_CHAR_VALUE", "RULE_COMMON_CHAR_VALUE", "RULE_ASSIGNMENT", "RULE_FIX_POINT", "RULE_DAY_UNSIGNED", "RULE_DAY_FLOAT", "RULE_HOUR_UNSIGNED", "RULE_HOUR_FLOAT", "RULE_MINUTE_UNSIGNED", "RULE_MINUTE_FLOAT", "RULE_SECOND_UNSIGNED", "RULE_SECOND_FLOAT", "RULE_MILLISECOND_UNSIGNED", "RULE_MILLISECOND_FLOAT", "RULE_MICROSECOND_UNSIGNED", "RULE_MICROSECOND_FLOAT", "RULE_TOD_TYPE_NAME", "RULE_DAYTIME", "RULE_DAY_HOUR", "RULE_DAY_MINUTE", "RULE_DAY_SECOND", "RULE_DATE_TYPE_NAME", "RULE_DATE_LITERAL", "RULE_YEAR", "RULE_MONTH", "RULE_DAY", "RULE_DT_TYPE_NAME", "RULE_NUMERIC_TYPE_NAME", "RULE_BIT_STR_TYPE_NAME", "RULE_STRING_TYPE_NAME", "RULE_ELEM_TYPE_NAME", "RULE_SIGN_INT_TYPE_NAME", "RULE_UNSIGN_INT_TYPE_NAME", "'s'", "'T'", "'LT'", "'#'", "'+'", "'-'"
    };
    public static final int RULE_PRAGMA=29;
    public static final int RULE_MILLISECOND_FLOAT=62;
    public static final int RULE_DATE=5;
    public static final int RULE_BINARY_INT=35;
    public static final int RULE_UNSIGN_INT_TYPE_NAME=81;
    public static final int RULE_DAY_SECOND=69;
    public static final int RULE_TOD_TYPE_NAME=65;
    public static final int RULE_TIME_TYPE_NAME=7;
    public static final int RULE_DAY=74;
    public static final int RULE_MONTH=73;
    public static final int RULE_EOL=28;
    public static final int RULE_DT_TYPE_NAME=75;
    public static final int EOF=-1;
    public static final int RULE_MULTIBITS_TYPE_NAME=40;
    public static final int RULE_ASSIGNMENT=51;
    public static final int RULE_SECONDS=11;
    public static final int RULE_OCTAL_DIGIT=21;
    public static final int RULE_S_BYTE_CHAR_VALUE=48;
    public static final int RULE_DAYS=8;
    public static final int RULE_SIGN_INT_TYPE_NAME=80;
    public static final int RULE_DOT=15;
    public static final int RULE_MINUTE_FLOAT=58;
    public static final int RULE_MINUTES=10;
    public static final int RULE_REAL_LITERAL=31;
    public static final int RULE_D_BYTE_CHAR_STR=47;
    public static final int RULE_INT_LITERAL=30;
    public static final int RULE_HOUR_UNSIGNED=55;
    public static final int RULE_SECOND_UNSIGNED=59;
    public static final int RULE_COMMON_CHAR_VALUE=50;
    public static final int RULE_MINUTE_UNSIGNED=57;
    public static final int RULE_DAY_UNSIGNED=53;
    public static final int RULE_SIGNED_INT=34;
    public static final int RULE_DATE_LITERAL=71;
    public static final int RULE_MILLISECONDS=12;
    public static final int RULE_MICROSECONDS=13;
    public static final int RULE_HOURS=9;
    public static final int RULE_TIME_OF_DAY=4;
    public static final int T__82=82;
    public static final int RULE_UNSIGNED_INT=38;
    public static final int T__83=83;
    public static final int RULE_UNDERSCORE=17;
    public static final int RULE_DAY_MINUTE=68;
    public static final int RULE_FIX_POINT=52;
    public static final int RULE_BIT_STR_LITERAL=41;
    public static final int RULE_DAYTIME=66;
    public static final int RULE_OCTAL_INT=36;
    public static final int RULE_DAY_HOUR=67;
    public static final int RULE_BOOL_TYPE_NAME=42;
    public static final int RULE_HEX_DIGIT=22;
    public static final int RULE_IDENTIFIER=16;
    public static final int RULE_HEX_INT=37;
    public static final int RULE_ML_COMMENT_2=25;
    public static final int RULE_ML_COMMENT_1=24;
    public static final int RULE_COMMENT=26;
    public static final int RULE_S_BYTE_CHAR_STR=46;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int RULE_SL_COMMENT=23;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int RULE_BIT_STR_TYPE_NAME=77;
    public static final int RULE_LETTER=18;
    public static final int RULE_DAY_FLOAT=54;
    public static final int RULE_DATE_AND_TIME=6;
    public static final int RULE_SECOND_FLOAT=60;
    public static final int RULE_ELEM_TYPE_NAME=79;
    public static final int RULE_NUMERIC_TYPE_NAME=76;
    public static final int RULE_STRING_TYPE_NAME=78;
    public static final int RULE_MICROSECOND_FLOAT=64;
    public static final int RULE_NANOSECONDS=14;
    public static final int RULE_D_BYTE_CHAR_VALUE=49;
    public static final int RULE_INT_TYPE_NAME=33;
    public static final int RULE_REAL_TYPE_NAME=39;
    public static final int RULE_MICROSECOND_UNSIGNED=63;
    public static final int RULE_DATE_TYPE_NAME=70;
    public static final int RULE_BOOL_LITERAL=43;
    public static final int RULE_MILLISECOND_UNSIGNED=61;
    public static final int RULE_CHAR_LITERAL=45;
    public static final int RULE_WS=27;
    public static final int RULE_HOUR_FLOAT=56;
    public static final int RULE_DIGIT=19;
    public static final int RULE_YEAR=72;
    public static final int RULE_BIT=20;
    public static final int RULE_NUMERIC_LITERAL=32;
    public static final int RULE_CHAR_STR=44;

    // delegates
    // delegators


        public InternalSTLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSTLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSTLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g"; }



     	private STLanguageGrammarAccess grammarAccess;
     	
        public InternalSTLanguageParser(TokenStream input, STLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "test";	
       	}
       	
       	@Override
       	protected STLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuletest"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:67:1: entryRuletest returns [EObject current=null] : iv_ruletest= ruletest EOF ;
    public final EObject entryRuletest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletest = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:68:2: (iv_ruletest= ruletest EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:69:2: iv_ruletest= ruletest EOF
            {
             newCompositeNode(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_ruletest_in_entryRuletest75);
            iv_ruletest=ruletest();

            state._fsp--;

             current =iv_ruletest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuletest85); 

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
    // $ANTLR end "entryRuletest"


    // $ANTLR start "ruletest"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:76:1: ruletest returns [EObject current=null] : ( (lv_test_0_0= 's' ) ) ;
    public final EObject ruletest() throws RecognitionException {
        EObject current = null;

        Token lv_test_0_0=null;

         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:79:28: ( ( (lv_test_0_0= 's' ) ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:80:1: ( (lv_test_0_0= 's' ) )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:80:1: ( (lv_test_0_0= 's' ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:81:1: (lv_test_0_0= 's' )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:81:1: (lv_test_0_0= 's' )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:82:3: lv_test_0_0= 's'
            {
            lv_test_0_0=(Token)match(input,82,FOLLOW_82_in_ruletest127); 

                    newLeafNode(lv_test_0_0, grammarAccess.getTestAccess().getTestSKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTestRule());
            	        }
                   		setWithLastConsumed(current, "test", lv_test_0_0, "s");
            	    

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
    // $ANTLR end "ruletest"


    // $ANTLR start "entryRuleTIME_LITERAL"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:105:1: entryRuleTIME_LITERAL returns [String current=null] : iv_ruleTIME_LITERAL= ruleTIME_LITERAL EOF ;
    public final String entryRuleTIME_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTIME_LITERAL = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:106:2: (iv_ruleTIME_LITERAL= ruleTIME_LITERAL EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:107:2: iv_ruleTIME_LITERAL= ruleTIME_LITERAL EOF
            {
             newCompositeNode(grammarAccess.getTIME_LITERALRule()); 
            pushFollow(FOLLOW_ruleTIME_LITERAL_in_entryRuleTIME_LITERAL178);
            iv_ruleTIME_LITERAL=ruleTIME_LITERAL();

            state._fsp--;

             current =iv_ruleTIME_LITERAL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTIME_LITERAL189); 

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
    // $ANTLR end "entryRuleTIME_LITERAL"


    // $ANTLR start "ruleTIME_LITERAL"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:114:1: ruleTIME_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DURATION_0= ruleDURATION | this_TIME_OF_DAY_1= RULE_TIME_OF_DAY | this_DATE_2= RULE_DATE | this_DATE_AND_TIME_3= RULE_DATE_AND_TIME ) ;
    public final AntlrDatatypeRuleToken ruleTIME_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TIME_OF_DAY_1=null;
        Token this_DATE_2=null;
        Token this_DATE_AND_TIME_3=null;
        AntlrDatatypeRuleToken this_DURATION_0 = null;


         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:117:28: ( (this_DURATION_0= ruleDURATION | this_TIME_OF_DAY_1= RULE_TIME_OF_DAY | this_DATE_2= RULE_DATE | this_DATE_AND_TIME_3= RULE_DATE_AND_TIME ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:118:1: (this_DURATION_0= ruleDURATION | this_TIME_OF_DAY_1= RULE_TIME_OF_DAY | this_DATE_2= RULE_DATE | this_DATE_AND_TIME_3= RULE_DATE_AND_TIME )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:118:1: (this_DURATION_0= ruleDURATION | this_TIME_OF_DAY_1= RULE_TIME_OF_DAY | this_DATE_2= RULE_DATE | this_DATE_AND_TIME_3= RULE_DATE_AND_TIME )
            int alt1=4;
            switch ( input.LA(1) ) {
            case RULE_TIME_TYPE_NAME:
            case 83:
            case 84:
                {
                alt1=1;
                }
                break;
            case RULE_TIME_OF_DAY:
                {
                alt1=2;
                }
                break;
            case RULE_DATE:
                {
                alt1=3;
                }
                break;
            case RULE_DATE_AND_TIME:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:119:5: this_DURATION_0= ruleDURATION
                    {
                     
                            newCompositeNode(grammarAccess.getTIME_LITERALAccess().getDURATIONParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDURATION_in_ruleTIME_LITERAL236);
                    this_DURATION_0=ruleDURATION();

                    state._fsp--;


                    		current.merge(this_DURATION_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:130:10: this_TIME_OF_DAY_1= RULE_TIME_OF_DAY
                    {
                    this_TIME_OF_DAY_1=(Token)match(input,RULE_TIME_OF_DAY,FOLLOW_RULE_TIME_OF_DAY_in_ruleTIME_LITERAL262); 

                    		current.merge(this_TIME_OF_DAY_1);
                        
                     
                        newLeafNode(this_TIME_OF_DAY_1, grammarAccess.getTIME_LITERALAccess().getTIME_OF_DAYTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:138:10: this_DATE_2= RULE_DATE
                    {
                    this_DATE_2=(Token)match(input,RULE_DATE,FOLLOW_RULE_DATE_in_ruleTIME_LITERAL288); 

                    		current.merge(this_DATE_2);
                        
                     
                        newLeafNode(this_DATE_2, grammarAccess.getTIME_LITERALAccess().getDATETerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:146:10: this_DATE_AND_TIME_3= RULE_DATE_AND_TIME
                    {
                    this_DATE_AND_TIME_3=(Token)match(input,RULE_DATE_AND_TIME,FOLLOW_RULE_DATE_AND_TIME_in_ruleTIME_LITERAL314); 

                    		current.merge(this_DATE_AND_TIME_3);
                        
                     
                        newLeafNode(this_DATE_AND_TIME_3, grammarAccess.getTIME_LITERALAccess().getDATE_AND_TIMETerminalRuleCall_3()); 
                        

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
    // $ANTLR end "ruleTIME_LITERAL"


    // $ANTLR start "entryRuleDURATION"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:161:1: entryRuleDURATION returns [String current=null] : iv_ruleDURATION= ruleDURATION EOF ;
    public final String entryRuleDURATION() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDURATION = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:162:2: (iv_ruleDURATION= ruleDURATION EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:163:2: iv_ruleDURATION= ruleDURATION EOF
            {
             newCompositeNode(grammarAccess.getDURATIONRule()); 
            pushFollow(FOLLOW_ruleDURATION_in_entryRuleDURATION360);
            iv_ruleDURATION=ruleDURATION();

            state._fsp--;

             current =iv_ruleDURATION.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDURATION371); 

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
    // $ANTLR end "entryRuleDURATION"


    // $ANTLR start "ruleDURATION"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:170:1: ruleDURATION returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_TIME_TYPE_NAME_0= RULE_TIME_TYPE_NAME | kw= 'T' | kw= 'LT' ) kw= '#' (kw= '+' | kw= '-' )? this_INTERVAL_6= ruleINTERVAL ) ;
    public final AntlrDatatypeRuleToken ruleDURATION() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TIME_TYPE_NAME_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_INTERVAL_6 = null;


         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:173:28: ( ( (this_TIME_TYPE_NAME_0= RULE_TIME_TYPE_NAME | kw= 'T' | kw= 'LT' ) kw= '#' (kw= '+' | kw= '-' )? this_INTERVAL_6= ruleINTERVAL ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:174:1: ( (this_TIME_TYPE_NAME_0= RULE_TIME_TYPE_NAME | kw= 'T' | kw= 'LT' ) kw= '#' (kw= '+' | kw= '-' )? this_INTERVAL_6= ruleINTERVAL )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:174:1: ( (this_TIME_TYPE_NAME_0= RULE_TIME_TYPE_NAME | kw= 'T' | kw= 'LT' ) kw= '#' (kw= '+' | kw= '-' )? this_INTERVAL_6= ruleINTERVAL )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:174:2: (this_TIME_TYPE_NAME_0= RULE_TIME_TYPE_NAME | kw= 'T' | kw= 'LT' ) kw= '#' (kw= '+' | kw= '-' )? this_INTERVAL_6= ruleINTERVAL
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:174:2: (this_TIME_TYPE_NAME_0= RULE_TIME_TYPE_NAME | kw= 'T' | kw= 'LT' )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_TIME_TYPE_NAME:
                {
                alt2=1;
                }
                break;
            case 83:
                {
                alt2=2;
                }
                break;
            case 84:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:174:7: this_TIME_TYPE_NAME_0= RULE_TIME_TYPE_NAME
                    {
                    this_TIME_TYPE_NAME_0=(Token)match(input,RULE_TIME_TYPE_NAME,FOLLOW_RULE_TIME_TYPE_NAME_in_ruleDURATION412); 

                    		current.merge(this_TIME_TYPE_NAME_0);
                        
                     
                        newLeafNode(this_TIME_TYPE_NAME_0, grammarAccess.getDURATIONAccess().getTIME_TYPE_NAMETerminalRuleCall_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:183:2: kw= 'T'
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruleDURATION436); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDURATIONAccess().getTKeyword_0_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:190:2: kw= 'LT'
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleDURATION455); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDURATIONAccess().getLTKeyword_0_2()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,85,FOLLOW_85_in_ruleDURATION469); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDURATIONAccess().getNumberSignKeyword_1()); 
                
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:201:1: (kw= '+' | kw= '-' )?
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==86) ) {
                alt3=1;
            }
            else if ( (LA3_0==87) ) {
                alt3=2;
            }
            switch (alt3) {
                case 1 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:202:2: kw= '+'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleDURATION483); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDURATIONAccess().getPlusSignKeyword_2_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:209:2: kw= '-'
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleDURATION502); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDURATIONAccess().getHyphenMinusKeyword_2_1()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getDURATIONAccess().getINTERVALParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleINTERVAL_in_ruleDURATION526);
            this_INTERVAL_6=ruleINTERVAL();

            state._fsp--;


            		current.merge(this_INTERVAL_6);
                
             
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
    // $ANTLR end "ruleDURATION"


    // $ANTLR start "entryRuleINTERVAL"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:233:1: entryRuleINTERVAL returns [String current=null] : iv_ruleINTERVAL= ruleINTERVAL EOF ;
    public final String entryRuleINTERVAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTERVAL = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:234:2: (iv_ruleINTERVAL= ruleINTERVAL EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:235:2: iv_ruleINTERVAL= ruleINTERVAL EOF
            {
             newCompositeNode(grammarAccess.getINTERVALRule()); 
            pushFollow(FOLLOW_ruleINTERVAL_in_entryRuleINTERVAL572);
            iv_ruleINTERVAL=ruleINTERVAL();

            state._fsp--;

             current =iv_ruleINTERVAL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleINTERVAL583); 

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
    // $ANTLR end "entryRuleINTERVAL"


    // $ANTLR start "ruleINTERVAL"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:242:1: ruleINTERVAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DAYS_0= RULE_DAYS | this_HOURS_1= RULE_HOURS | this_MINUTES_2= RULE_MINUTES | this_SECONDS_3= RULE_SECONDS | this_MILLISECONDS_4= RULE_MILLISECONDS | this_MICROSECONDS_5= RULE_MICROSECONDS | this_NANOSECONDS_6= RULE_NANOSECONDS ) ;
    public final AntlrDatatypeRuleToken ruleINTERVAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DAYS_0=null;
        Token this_HOURS_1=null;
        Token this_MINUTES_2=null;
        Token this_SECONDS_3=null;
        Token this_MILLISECONDS_4=null;
        Token this_MICROSECONDS_5=null;
        Token this_NANOSECONDS_6=null;

         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:245:28: ( (this_DAYS_0= RULE_DAYS | this_HOURS_1= RULE_HOURS | this_MINUTES_2= RULE_MINUTES | this_SECONDS_3= RULE_SECONDS | this_MILLISECONDS_4= RULE_MILLISECONDS | this_MICROSECONDS_5= RULE_MICROSECONDS | this_NANOSECONDS_6= RULE_NANOSECONDS ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:246:1: (this_DAYS_0= RULE_DAYS | this_HOURS_1= RULE_HOURS | this_MINUTES_2= RULE_MINUTES | this_SECONDS_3= RULE_SECONDS | this_MILLISECONDS_4= RULE_MILLISECONDS | this_MICROSECONDS_5= RULE_MICROSECONDS | this_NANOSECONDS_6= RULE_NANOSECONDS )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:246:1: (this_DAYS_0= RULE_DAYS | this_HOURS_1= RULE_HOURS | this_MINUTES_2= RULE_MINUTES | this_SECONDS_3= RULE_SECONDS | this_MILLISECONDS_4= RULE_MILLISECONDS | this_MICROSECONDS_5= RULE_MICROSECONDS | this_NANOSECONDS_6= RULE_NANOSECONDS )
            int alt4=7;
            switch ( input.LA(1) ) {
            case RULE_DAYS:
                {
                alt4=1;
                }
                break;
            case RULE_HOURS:
                {
                alt4=2;
                }
                break;
            case RULE_MINUTES:
                {
                alt4=3;
                }
                break;
            case RULE_SECONDS:
                {
                alt4=4;
                }
                break;
            case RULE_MILLISECONDS:
                {
                alt4=5;
                }
                break;
            case RULE_MICROSECONDS:
                {
                alt4=6;
                }
                break;
            case RULE_NANOSECONDS:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:246:6: this_DAYS_0= RULE_DAYS
                    {
                    this_DAYS_0=(Token)match(input,RULE_DAYS,FOLLOW_RULE_DAYS_in_ruleINTERVAL623); 

                    		current.merge(this_DAYS_0);
                        
                     
                        newLeafNode(this_DAYS_0, grammarAccess.getINTERVALAccess().getDAYSTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:254:10: this_HOURS_1= RULE_HOURS
                    {
                    this_HOURS_1=(Token)match(input,RULE_HOURS,FOLLOW_RULE_HOURS_in_ruleINTERVAL649); 

                    		current.merge(this_HOURS_1);
                        
                     
                        newLeafNode(this_HOURS_1, grammarAccess.getINTERVALAccess().getHOURSTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:262:10: this_MINUTES_2= RULE_MINUTES
                    {
                    this_MINUTES_2=(Token)match(input,RULE_MINUTES,FOLLOW_RULE_MINUTES_in_ruleINTERVAL675); 

                    		current.merge(this_MINUTES_2);
                        
                     
                        newLeafNode(this_MINUTES_2, grammarAccess.getINTERVALAccess().getMINUTESTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:270:10: this_SECONDS_3= RULE_SECONDS
                    {
                    this_SECONDS_3=(Token)match(input,RULE_SECONDS,FOLLOW_RULE_SECONDS_in_ruleINTERVAL701); 

                    		current.merge(this_SECONDS_3);
                        
                     
                        newLeafNode(this_SECONDS_3, grammarAccess.getINTERVALAccess().getSECONDSTerminalRuleCall_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:278:10: this_MILLISECONDS_4= RULE_MILLISECONDS
                    {
                    this_MILLISECONDS_4=(Token)match(input,RULE_MILLISECONDS,FOLLOW_RULE_MILLISECONDS_in_ruleINTERVAL727); 

                    		current.merge(this_MILLISECONDS_4);
                        
                     
                        newLeafNode(this_MILLISECONDS_4, grammarAccess.getINTERVALAccess().getMILLISECONDSTerminalRuleCall_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:286:10: this_MICROSECONDS_5= RULE_MICROSECONDS
                    {
                    this_MICROSECONDS_5=(Token)match(input,RULE_MICROSECONDS,FOLLOW_RULE_MICROSECONDS_in_ruleINTERVAL753); 

                    		current.merge(this_MICROSECONDS_5);
                        
                     
                        newLeafNode(this_MICROSECONDS_5, grammarAccess.getINTERVALAccess().getMICROSECONDSTerminalRuleCall_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:294:10: this_NANOSECONDS_6= RULE_NANOSECONDS
                    {
                    this_NANOSECONDS_6=(Token)match(input,RULE_NANOSECONDS,FOLLOW_RULE_NANOSECONDS_in_ruleINTERVAL779); 

                    		current.merge(this_NANOSECONDS_6);
                        
                     
                        newLeafNode(this_NANOSECONDS_6, grammarAccess.getINTERVALAccess().getNANOSECONDSTerminalRuleCall_6()); 
                        

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
    // $ANTLR end "ruleINTERVAL"


    // $ANTLR start "entryRuleSimple_Type_Access"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:313:1: entryRuleSimple_Type_Access returns [String current=null] : iv_ruleSimple_Type_Access= ruleSimple_Type_Access EOF ;
    public final String entryRuleSimple_Type_Access() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimple_Type_Access = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:314:2: (iv_ruleSimple_Type_Access= ruleSimple_Type_Access EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:315:2: iv_ruleSimple_Type_Access= ruleSimple_Type_Access EOF
            {
             newCompositeNode(grammarAccess.getSimple_Type_AccessRule()); 
            pushFollow(FOLLOW_ruleSimple_Type_Access_in_entryRuleSimple_Type_Access829);
            iv_ruleSimple_Type_Access=ruleSimple_Type_Access();

            state._fsp--;

             current =iv_ruleSimple_Type_Access.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimple_Type_Access840); 

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
    // $ANTLR end "entryRuleSimple_Type_Access"


    // $ANTLR start "ruleSimple_Type_Access"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:322:1: ruleSimple_Type_Access returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Namespace_Name_0= ruleNamespace_Name this_DOT_1= RULE_DOT )* this_Simple_Type_Name_2= ruleSimple_Type_Name ) ;
    public final AntlrDatatypeRuleToken ruleSimple_Type_Access() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOT_1=null;
        AntlrDatatypeRuleToken this_Namespace_Name_0 = null;

        AntlrDatatypeRuleToken this_Simple_Type_Name_2 = null;


         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:325:28: ( ( (this_Namespace_Name_0= ruleNamespace_Name this_DOT_1= RULE_DOT )* this_Simple_Type_Name_2= ruleSimple_Type_Name ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:326:1: ( (this_Namespace_Name_0= ruleNamespace_Name this_DOT_1= RULE_DOT )* this_Simple_Type_Name_2= ruleSimple_Type_Name )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:326:1: ( (this_Namespace_Name_0= ruleNamespace_Name this_DOT_1= RULE_DOT )* this_Simple_Type_Name_2= ruleSimple_Type_Name )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:326:2: (this_Namespace_Name_0= ruleNamespace_Name this_DOT_1= RULE_DOT )* this_Simple_Type_Name_2= ruleSimple_Type_Name
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:326:2: (this_Namespace_Name_0= ruleNamespace_Name this_DOT_1= RULE_DOT )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_IDENTIFIER) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==RULE_DOT) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:327:5: this_Namespace_Name_0= ruleNamespace_Name this_DOT_1= RULE_DOT
            	    {
            	     
            	            newCompositeNode(grammarAccess.getSimple_Type_AccessAccess().getNamespace_NameParserRuleCall_0_0()); 
            	        
            	    pushFollow(FOLLOW_ruleNamespace_Name_in_ruleSimple_Type_Access888);
            	    this_Namespace_Name_0=ruleNamespace_Name();

            	    state._fsp--;


            	    		current.merge(this_Namespace_Name_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    this_DOT_1=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleSimple_Type_Access908); 

            	    		current.merge(this_DOT_1);
            	        
            	     
            	        newLeafNode(this_DOT_1, grammarAccess.getSimple_Type_AccessAccess().getDOTTerminalRuleCall_0_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             
                    newCompositeNode(grammarAccess.getSimple_Type_AccessAccess().getSimple_Type_NameParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleSimple_Type_Name_in_ruleSimple_Type_Access937);
            this_Simple_Type_Name_2=ruleSimple_Type_Name();

            state._fsp--;


            		current.merge(this_Simple_Type_Name_2);
                
             
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
    // $ANTLR end "ruleSimple_Type_Access"


    // $ANTLR start "entryRuleSubrange_Type_Access"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:363:1: entryRuleSubrange_Type_Access returns [String current=null] : iv_ruleSubrange_Type_Access= ruleSubrange_Type_Access EOF ;
    public final String entryRuleSubrange_Type_Access() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSubrange_Type_Access = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:364:2: (iv_ruleSubrange_Type_Access= ruleSubrange_Type_Access EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:365:2: iv_ruleSubrange_Type_Access= ruleSubrange_Type_Access EOF
            {
             newCompositeNode(grammarAccess.getSubrange_Type_AccessRule()); 
            pushFollow(FOLLOW_ruleSubrange_Type_Access_in_entryRuleSubrange_Type_Access983);
            iv_ruleSubrange_Type_Access=ruleSubrange_Type_Access();

            state._fsp--;

             current =iv_ruleSubrange_Type_Access.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubrange_Type_Access994); 

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
    // $ANTLR end "entryRuleSubrange_Type_Access"


    // $ANTLR start "ruleSubrange_Type_Access"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:372:1: ruleSubrange_Type_Access returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Namespace_Name_0= ruleNamespace_Name this_DOT_1= RULE_DOT )* this_Subrange_Type_Name_2= ruleSubrange_Type_Name ) ;
    public final AntlrDatatypeRuleToken ruleSubrange_Type_Access() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOT_1=null;
        AntlrDatatypeRuleToken this_Namespace_Name_0 = null;

        AntlrDatatypeRuleToken this_Subrange_Type_Name_2 = null;


         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:375:28: ( ( (this_Namespace_Name_0= ruleNamespace_Name this_DOT_1= RULE_DOT )* this_Subrange_Type_Name_2= ruleSubrange_Type_Name ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:376:1: ( (this_Namespace_Name_0= ruleNamespace_Name this_DOT_1= RULE_DOT )* this_Subrange_Type_Name_2= ruleSubrange_Type_Name )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:376:1: ( (this_Namespace_Name_0= ruleNamespace_Name this_DOT_1= RULE_DOT )* this_Subrange_Type_Name_2= ruleSubrange_Type_Name )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:376:2: (this_Namespace_Name_0= ruleNamespace_Name this_DOT_1= RULE_DOT )* this_Subrange_Type_Name_2= ruleSubrange_Type_Name
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:376:2: (this_Namespace_Name_0= ruleNamespace_Name this_DOT_1= RULE_DOT )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_IDENTIFIER) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==RULE_DOT) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:377:5: this_Namespace_Name_0= ruleNamespace_Name this_DOT_1= RULE_DOT
            	    {
            	     
            	            newCompositeNode(grammarAccess.getSubrange_Type_AccessAccess().getNamespace_NameParserRuleCall_0_0()); 
            	        
            	    pushFollow(FOLLOW_ruleNamespace_Name_in_ruleSubrange_Type_Access1042);
            	    this_Namespace_Name_0=ruleNamespace_Name();

            	    state._fsp--;


            	    		current.merge(this_Namespace_Name_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    this_DOT_1=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleSubrange_Type_Access1062); 

            	    		current.merge(this_DOT_1);
            	        
            	     
            	        newLeafNode(this_DOT_1, grammarAccess.getSubrange_Type_AccessAccess().getDOTTerminalRuleCall_0_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             
                    newCompositeNode(grammarAccess.getSubrange_Type_AccessAccess().getSubrange_Type_NameParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleSubrange_Type_Name_in_ruleSubrange_Type_Access1091);
            this_Subrange_Type_Name_2=ruleSubrange_Type_Name();

            state._fsp--;


            		current.merge(this_Subrange_Type_Name_2);
                
             
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
    // $ANTLR end "ruleSubrange_Type_Access"


    // $ANTLR start "entryRuleEnum_Type_Access"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:413:1: entryRuleEnum_Type_Access returns [String current=null] : iv_ruleEnum_Type_Access= ruleEnum_Type_Access EOF ;
    public final String entryRuleEnum_Type_Access() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnum_Type_Access = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:414:2: (iv_ruleEnum_Type_Access= ruleEnum_Type_Access EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:415:2: iv_ruleEnum_Type_Access= ruleEnum_Type_Access EOF
            {
             newCompositeNode(grammarAccess.getEnum_Type_AccessRule()); 
            pushFollow(FOLLOW_ruleEnum_Type_Access_in_entryRuleEnum_Type_Access1137);
            iv_ruleEnum_Type_Access=ruleEnum_Type_Access();

            state._fsp--;

             current =iv_ruleEnum_Type_Access.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum_Type_Access1148); 

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
    // $ANTLR end "entryRuleEnum_Type_Access"


    // $ANTLR start "ruleEnum_Type_Access"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:422:1: ruleEnum_Type_Access returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Namespace_Name_0= ruleNamespace_Name this_DOT_1= RULE_DOT )* this_Enum_Type_Name_2= ruleEnum_Type_Name ) ;
    public final AntlrDatatypeRuleToken ruleEnum_Type_Access() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOT_1=null;
        AntlrDatatypeRuleToken this_Namespace_Name_0 = null;

        AntlrDatatypeRuleToken this_Enum_Type_Name_2 = null;


         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:425:28: ( ( (this_Namespace_Name_0= ruleNamespace_Name this_DOT_1= RULE_DOT )* this_Enum_Type_Name_2= ruleEnum_Type_Name ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:426:1: ( (this_Namespace_Name_0= ruleNamespace_Name this_DOT_1= RULE_DOT )* this_Enum_Type_Name_2= ruleEnum_Type_Name )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:426:1: ( (this_Namespace_Name_0= ruleNamespace_Name this_DOT_1= RULE_DOT )* this_Enum_Type_Name_2= ruleEnum_Type_Name )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:426:2: (this_Namespace_Name_0= ruleNamespace_Name this_DOT_1= RULE_DOT )* this_Enum_Type_Name_2= ruleEnum_Type_Name
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:426:2: (this_Namespace_Name_0= ruleNamespace_Name this_DOT_1= RULE_DOT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_IDENTIFIER) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==RULE_DOT) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:427:5: this_Namespace_Name_0= ruleNamespace_Name this_DOT_1= RULE_DOT
            	    {
            	     
            	            newCompositeNode(grammarAccess.getEnum_Type_AccessAccess().getNamespace_NameParserRuleCall_0_0()); 
            	        
            	    pushFollow(FOLLOW_ruleNamespace_Name_in_ruleEnum_Type_Access1196);
            	    this_Namespace_Name_0=ruleNamespace_Name();

            	    state._fsp--;


            	    		current.merge(this_Namespace_Name_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    this_DOT_1=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleEnum_Type_Access1216); 

            	    		current.merge(this_DOT_1);
            	        
            	     
            	        newLeafNode(this_DOT_1, grammarAccess.getEnum_Type_AccessAccess().getDOTTerminalRuleCall_0_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             
                    newCompositeNode(grammarAccess.getEnum_Type_AccessAccess().getEnum_Type_NameParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleEnum_Type_Name_in_ruleEnum_Type_Access1245);
            this_Enum_Type_Name_2=ruleEnum_Type_Name();

            state._fsp--;


            		current.merge(this_Enum_Type_Name_2);
                
             
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
    // $ANTLR end "ruleEnum_Type_Access"


    // $ANTLR start "entryRuleSimple_Type_Name"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:467:1: entryRuleSimple_Type_Name returns [String current=null] : iv_ruleSimple_Type_Name= ruleSimple_Type_Name EOF ;
    public final String entryRuleSimple_Type_Name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimple_Type_Name = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:468:2: (iv_ruleSimple_Type_Name= ruleSimple_Type_Name EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:469:2: iv_ruleSimple_Type_Name= ruleSimple_Type_Name EOF
            {
             newCompositeNode(grammarAccess.getSimple_Type_NameRule()); 
            pushFollow(FOLLOW_ruleSimple_Type_Name_in_entryRuleSimple_Type_Name1295);
            iv_ruleSimple_Type_Name=ruleSimple_Type_Name();

            state._fsp--;

             current =iv_ruleSimple_Type_Name.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimple_Type_Name1306); 

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
    // $ANTLR end "entryRuleSimple_Type_Name"


    // $ANTLR start "ruleSimple_Type_Name"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:476:1: ruleSimple_Type_Name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruleSimple_Type_Name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;

         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:479:28: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:480:5: this_IDENTIFIER_0= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleSimple_Type_Name1345); 

            		current.merge(this_IDENTIFIER_0);
                
             
                newLeafNode(this_IDENTIFIER_0, grammarAccess.getSimple_Type_NameAccess().getIDENTIFIERTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleSimple_Type_Name"


    // $ANTLR start "entryRuleSubrange_Type_Name"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:495:1: entryRuleSubrange_Type_Name returns [String current=null] : iv_ruleSubrange_Type_Name= ruleSubrange_Type_Name EOF ;
    public final String entryRuleSubrange_Type_Name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSubrange_Type_Name = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:496:2: (iv_ruleSubrange_Type_Name= ruleSubrange_Type_Name EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:497:2: iv_ruleSubrange_Type_Name= ruleSubrange_Type_Name EOF
            {
             newCompositeNode(grammarAccess.getSubrange_Type_NameRule()); 
            pushFollow(FOLLOW_ruleSubrange_Type_Name_in_entryRuleSubrange_Type_Name1390);
            iv_ruleSubrange_Type_Name=ruleSubrange_Type_Name();

            state._fsp--;

             current =iv_ruleSubrange_Type_Name.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubrange_Type_Name1401); 

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
    // $ANTLR end "entryRuleSubrange_Type_Name"


    // $ANTLR start "ruleSubrange_Type_Name"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:504:1: ruleSubrange_Type_Name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruleSubrange_Type_Name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;

         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:507:28: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:508:5: this_IDENTIFIER_0= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleSubrange_Type_Name1440); 

            		current.merge(this_IDENTIFIER_0);
                
             
                newLeafNode(this_IDENTIFIER_0, grammarAccess.getSubrange_Type_NameAccess().getIDENTIFIERTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleSubrange_Type_Name"


    // $ANTLR start "entryRuleEnum_Type_Name"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:523:1: entryRuleEnum_Type_Name returns [String current=null] : iv_ruleEnum_Type_Name= ruleEnum_Type_Name EOF ;
    public final String entryRuleEnum_Type_Name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnum_Type_Name = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:524:2: (iv_ruleEnum_Type_Name= ruleEnum_Type_Name EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:525:2: iv_ruleEnum_Type_Name= ruleEnum_Type_Name EOF
            {
             newCompositeNode(grammarAccess.getEnum_Type_NameRule()); 
            pushFollow(FOLLOW_ruleEnum_Type_Name_in_entryRuleEnum_Type_Name1485);
            iv_ruleEnum_Type_Name=ruleEnum_Type_Name();

            state._fsp--;

             current =iv_ruleEnum_Type_Name.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum_Type_Name1496); 

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
    // $ANTLR end "entryRuleEnum_Type_Name"


    // $ANTLR start "ruleEnum_Type_Name"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:532:1: ruleEnum_Type_Name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruleEnum_Type_Name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;

         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:535:28: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:536:5: this_IDENTIFIER_0= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleEnum_Type_Name1535); 

            		current.merge(this_IDENTIFIER_0);
                
             
                newLeafNode(this_IDENTIFIER_0, grammarAccess.getEnum_Type_NameAccess().getIDENTIFIERTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleEnum_Type_Name"


    // $ANTLR start "entryRuleArray_Type_Name"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:551:1: entryRuleArray_Type_Name returns [String current=null] : iv_ruleArray_Type_Name= ruleArray_Type_Name EOF ;
    public final String entryRuleArray_Type_Name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArray_Type_Name = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:552:2: (iv_ruleArray_Type_Name= ruleArray_Type_Name EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:553:2: iv_ruleArray_Type_Name= ruleArray_Type_Name EOF
            {
             newCompositeNode(grammarAccess.getArray_Type_NameRule()); 
            pushFollow(FOLLOW_ruleArray_Type_Name_in_entryRuleArray_Type_Name1580);
            iv_ruleArray_Type_Name=ruleArray_Type_Name();

            state._fsp--;

             current =iv_ruleArray_Type_Name.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray_Type_Name1591); 

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
    // $ANTLR end "entryRuleArray_Type_Name"


    // $ANTLR start "ruleArray_Type_Name"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:560:1: ruleArray_Type_Name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruleArray_Type_Name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;

         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:563:28: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:564:5: this_IDENTIFIER_0= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleArray_Type_Name1630); 

            		current.merge(this_IDENTIFIER_0);
                
             
                newLeafNode(this_IDENTIFIER_0, grammarAccess.getArray_Type_NameAccess().getIDENTIFIERTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleArray_Type_Name"


    // $ANTLR start "entryRuleStruct_Type_Name"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:579:1: entryRuleStruct_Type_Name returns [String current=null] : iv_ruleStruct_Type_Name= ruleStruct_Type_Name EOF ;
    public final String entryRuleStruct_Type_Name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStruct_Type_Name = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:580:2: (iv_ruleStruct_Type_Name= ruleStruct_Type_Name EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:581:2: iv_ruleStruct_Type_Name= ruleStruct_Type_Name EOF
            {
             newCompositeNode(grammarAccess.getStruct_Type_NameRule()); 
            pushFollow(FOLLOW_ruleStruct_Type_Name_in_entryRuleStruct_Type_Name1675);
            iv_ruleStruct_Type_Name=ruleStruct_Type_Name();

            state._fsp--;

             current =iv_ruleStruct_Type_Name.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStruct_Type_Name1686); 

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
    // $ANTLR end "entryRuleStruct_Type_Name"


    // $ANTLR start "ruleStruct_Type_Name"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:588:1: ruleStruct_Type_Name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruleStruct_Type_Name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;

         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:591:28: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:592:5: this_IDENTIFIER_0= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleStruct_Type_Name1725); 

            		current.merge(this_IDENTIFIER_0);
                
             
                newLeafNode(this_IDENTIFIER_0, grammarAccess.getStruct_Type_NameAccess().getIDENTIFIERTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleStruct_Type_Name"


    // $ANTLR start "entryRuleNamespace_Name"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:607:1: entryRuleNamespace_Name returns [String current=null] : iv_ruleNamespace_Name= ruleNamespace_Name EOF ;
    public final String entryRuleNamespace_Name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNamespace_Name = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:608:2: (iv_ruleNamespace_Name= ruleNamespace_Name EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:609:2: iv_ruleNamespace_Name= ruleNamespace_Name EOF
            {
             newCompositeNode(grammarAccess.getNamespace_NameRule()); 
            pushFollow(FOLLOW_ruleNamespace_Name_in_entryRuleNamespace_Name1770);
            iv_ruleNamespace_Name=ruleNamespace_Name();

            state._fsp--;

             current =iv_ruleNamespace_Name.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespace_Name1781); 

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
    // $ANTLR end "entryRuleNamespace_Name"


    // $ANTLR start "ruleNamespace_Name"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:616:1: ruleNamespace_Name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruleNamespace_Name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;

         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:619:28: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:620:5: this_IDENTIFIER_0= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleNamespace_Name1820); 

            		current.merge(this_IDENTIFIER_0);
                
             
                newLeafNode(this_IDENTIFIER_0, grammarAccess.getNamespace_NameAccess().getIDENTIFIERTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleNamespace_Name"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruletest_in_entryRuletest75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletest85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruletest127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTIME_LITERAL_in_entryRuleTIME_LITERAL178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTIME_LITERAL189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDURATION_in_ruleTIME_LITERAL236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TIME_OF_DAY_in_ruleTIME_LITERAL262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DATE_in_ruleTIME_LITERAL288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DATE_AND_TIME_in_ruleTIME_LITERAL314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDURATION_in_entryRuleDURATION360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDURATION371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TIME_TYPE_NAME_in_ruleDURATION412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_83_in_ruleDURATION436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_84_in_ruleDURATION455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_ruleDURATION469 = new BitSet(new long[]{0x0000000000007F00L,0x0000000000C00000L});
    public static final BitSet FOLLOW_86_in_ruleDURATION483 = new BitSet(new long[]{0x0000000000007F00L,0x0000000000C00000L});
    public static final BitSet FOLLOW_87_in_ruleDURATION502 = new BitSet(new long[]{0x0000000000007F00L,0x0000000000C00000L});
    public static final BitSet FOLLOW_ruleINTERVAL_in_ruleDURATION526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTERVAL_in_entryRuleINTERVAL572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleINTERVAL583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DAYS_in_ruleINTERVAL623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HOURS_in_ruleINTERVAL649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MINUTES_in_ruleINTERVAL675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SECONDS_in_ruleINTERVAL701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MILLISECONDS_in_ruleINTERVAL727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MICROSECONDS_in_ruleINTERVAL753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NANOSECONDS_in_ruleINTERVAL779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimple_Type_Access_in_entryRuleSimple_Type_Access829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimple_Type_Access840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_Name_in_ruleSimple_Type_Access888 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleSimple_Type_Access908 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleSimple_Type_Name_in_ruleSimple_Type_Access937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubrange_Type_Access_in_entryRuleSubrange_Type_Access983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubrange_Type_Access994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_Name_in_ruleSubrange_Type_Access1042 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleSubrange_Type_Access1062 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleSubrange_Type_Name_in_ruleSubrange_Type_Access1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_Type_Access_in_entryRuleEnum_Type_Access1137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum_Type_Access1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_Name_in_ruleEnum_Type_Access1196 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleEnum_Type_Access1216 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleEnum_Type_Name_in_ruleEnum_Type_Access1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimple_Type_Name_in_entryRuleSimple_Type_Name1295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimple_Type_Name1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleSimple_Type_Name1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubrange_Type_Name_in_entryRuleSubrange_Type_Name1390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubrange_Type_Name1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleSubrange_Type_Name1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_Type_Name_in_entryRuleEnum_Type_Name1485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum_Type_Name1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleEnum_Type_Name1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_Type_Name_in_entryRuleArray_Type_Name1580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray_Type_Name1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleArray_Type_Name1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStruct_Type_Name_in_entryRuleStruct_Type_Name1675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStruct_Type_Name1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleStruct_Type_Name1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_Name_in_entryRuleNamespace_Name1770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespace_Name1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleNamespace_Name1820 = new BitSet(new long[]{0x0000000000000002L});

}
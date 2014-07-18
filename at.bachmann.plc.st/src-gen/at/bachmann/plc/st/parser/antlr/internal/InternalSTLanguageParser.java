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

@SuppressWarnings("all")
public class InternalSTLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BIN_VALUE", "RULE_OCT_VALUE", "RULE_DEC_VALUE", "RULE_HEX_VALUE", "RULE_FLOAT_VALUE", "RULE_S_BYTE_CHAR_VALUE", "RULE_D_BYTE_CHAR_VALUE", "RULE_INTERVAL", "RULE_DAYTIME_VALUE", "RULE_DATE_VALUE", "RULE_DATE_LITERAL", "RULE_LETTER", "RULE_BIT", "RULE_OCTAL_DIGIT", "RULE_DIGIT", "RULE_HEX_DIGIT", "RULE_IDENTIFIER", "RULE_SL_COMMENT", "RULE_ML_COMMENT_1", "RULE_ML_COMMENT_2", "RULE_WS", "RULE_EOL", "RULE_PRAGMA", "RULE_FIX_POINT", "RULE_COMMON_CHAR_VALUE", "RULE_DAYS", "RULE_HOURS", "RULE_MINUTES", "RULE_SECONDS", "RULE_MILLISECONDS", "RULE_MICROSECONDS", "RULE_NANOSECONDS", "'t'", "'USINT'", "'UINT'", "'UDINT'", "'ULINT'", "'SINT'", "'INT'", "'DINT'", "'LINT'", "'+'", "'-'", "'LREAL'", "'REAL'", "'BYTE'", "'WORD'", "'DWORD'", "'LWORD'", "'#'", "'0'", "'1'", "'FALSE'", "'TRUE'", "'BOOL'", "'STRING#'", "'\\''", "'\"'", "'TIME'", "'LTIME'", "'TIME_OF_DAY'", "'TOD'", "'LTOD'", "'T'", "'LT'", "'LTIME_OF_DAY'", "'DATE_AND_TIME'", "'LDATE_AND_TIME'", "'DT'", "'LDT'"
    };
    public static final int T__68=68;
    public static final int RULE_PRAGMA=26;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_DAYTIME_VALUE=12;
    public static final int RULE_EOL=25;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int RULE_DEC_VALUE=6;
    public static final int RULE_BIN_VALUE=4;
    public static final int RULE_SECONDS=32;
    public static final int T__55=55;
    public static final int RULE_OCTAL_DIGIT=17;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int RULE_DAYS=29;
    public static final int RULE_S_BYTE_CHAR_VALUE=9;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_MINUTES=31;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_COMMON_CHAR_VALUE=28;
    public static final int RULE_HEX_VALUE=7;
    public static final int T__50=50;
    public static final int RULE_DATE_LITERAL=14;
    public static final int RULE_MILLISECONDS=33;
    public static final int T__42=42;
    public static final int RULE_MICROSECONDS=34;
    public static final int RULE_INTERVAL=11;
    public static final int T__43=43;
    public static final int RULE_HOURS=30;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_FIX_POINT=27;
    public static final int RULE_HEX_DIGIT=19;
    public static final int RULE_IDENTIFIER=20;
    public static final int RULE_ML_COMMENT_2=23;
    public static final int RULE_ML_COMMENT_1=22;
    public static final int RULE_SL_COMMENT=21;
    public static final int RULE_LETTER=15;
    public static final int RULE_DATE_VALUE=13;
    public static final int RULE_OCT_VALUE=5;
    public static final int RULE_FLOAT_VALUE=8;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__36=36;
    public static final int T__70=70;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_NANOSECONDS=35;
    public static final int T__39=39;
    public static final int RULE_D_BYTE_CHAR_VALUE=10;
    public static final int RULE_WS=24;
    public static final int RULE_DIGIT=18;
    public static final int T__73=73;
    public static final int RULE_BIT=16;

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
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:76:1: ruletest returns [EObject current=null] : ( (lv_test_0_0= 't' ) ) ;
    public final EObject ruletest() throws RecognitionException {
        EObject current = null;

        Token lv_test_0_0=null;

         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:79:28: ( ( (lv_test_0_0= 't' ) ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:80:1: ( (lv_test_0_0= 't' ) )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:80:1: ( (lv_test_0_0= 't' ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:81:1: (lv_test_0_0= 't' )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:81:1: (lv_test_0_0= 't' )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:82:3: lv_test_0_0= 't'
            {
            lv_test_0_0=(Token)match(input,36,FOLLOW_36_in_ruletest127); 

                    newLeafNode(lv_test_0_0, grammarAccess.getTestAccess().getTestTKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTestRule());
            	        }
                   		setWithLastConsumed(current, "test", lv_test_0_0, "t");
            	    

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


    // $ANTLR start "entryRuleNumeric_Literal"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:105:1: entryRuleNumeric_Literal returns [EObject current=null] : iv_ruleNumeric_Literal= ruleNumeric_Literal EOF ;
    public final EObject entryRuleNumeric_Literal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumeric_Literal = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:106:2: (iv_ruleNumeric_Literal= ruleNumeric_Literal EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:107:2: iv_ruleNumeric_Literal= ruleNumeric_Literal EOF
            {
             newCompositeNode(grammarAccess.getNumeric_LiteralRule()); 
            pushFollow(FOLLOW_ruleNumeric_Literal_in_entryRuleNumeric_Literal177);
            iv_ruleNumeric_Literal=ruleNumeric_Literal();

            state._fsp--;

             current =iv_ruleNumeric_Literal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumeric_Literal187); 

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
    // $ANTLR end "entryRuleNumeric_Literal"


    // $ANTLR start "ruleNumeric_Literal"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:114:1: ruleNumeric_Literal returns [EObject current=null] : (this_Int_Literal_0= ruleInt_Literal | this_Real_Literal_1= ruleReal_Literal ) ;
    public final EObject ruleNumeric_Literal() throws RecognitionException {
        EObject current = null;

        EObject this_Int_Literal_0 = null;

        EObject this_Real_Literal_1 = null;


         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:117:28: ( (this_Int_Literal_0= ruleInt_Literal | this_Real_Literal_1= ruleReal_Literal ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:118:1: (this_Int_Literal_0= ruleInt_Literal | this_Real_Literal_1= ruleReal_Literal )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:118:1: (this_Int_Literal_0= ruleInt_Literal | this_Real_Literal_1= ruleReal_Literal )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=37 && LA1_0<=44)) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=47 && LA1_0<=48)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:119:5: this_Int_Literal_0= ruleInt_Literal
                    {
                     
                            newCompositeNode(grammarAccess.getNumeric_LiteralAccess().getInt_LiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInt_Literal_in_ruleNumeric_Literal234);
                    this_Int_Literal_0=ruleInt_Literal();

                    state._fsp--;

                     
                            current = this_Int_Literal_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:129:5: this_Real_Literal_1= ruleReal_Literal
                    {
                     
                            newCompositeNode(grammarAccess.getNumeric_LiteralAccess().getReal_LiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleReal_Literal_in_ruleNumeric_Literal261);
                    this_Real_Literal_1=ruleReal_Literal();

                    state._fsp--;

                     
                            current = this_Real_Literal_1; 
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
    // $ANTLR end "ruleNumeric_Literal"


    // $ANTLR start "entryRuleInt_Literal"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:145:1: entryRuleInt_Literal returns [EObject current=null] : iv_ruleInt_Literal= ruleInt_Literal EOF ;
    public final EObject entryRuleInt_Literal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInt_Literal = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:146:2: (iv_ruleInt_Literal= ruleInt_Literal EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:147:2: iv_ruleInt_Literal= ruleInt_Literal EOF
            {
             newCompositeNode(grammarAccess.getInt_LiteralRule()); 
            pushFollow(FOLLOW_ruleInt_Literal_in_entryRuleInt_Literal296);
            iv_ruleInt_Literal=ruleInt_Literal();

            state._fsp--;

             current =iv_ruleInt_Literal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInt_Literal306); 

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
    // $ANTLR end "entryRuleInt_Literal"


    // $ANTLR start "ruleInt_Literal"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:154:1: ruleInt_Literal returns [EObject current=null] : (this_Signed_Int_0= ruleSigned_Int | this_Unsigned_Int_1= ruleUnsigned_Int ) ;
    public final EObject ruleInt_Literal() throws RecognitionException {
        EObject current = null;

        EObject this_Signed_Int_0 = null;

        EObject this_Unsigned_Int_1 = null;


         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:157:28: ( (this_Signed_Int_0= ruleSigned_Int | this_Unsigned_Int_1= ruleUnsigned_Int ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:158:1: (this_Signed_Int_0= ruleSigned_Int | this_Unsigned_Int_1= ruleUnsigned_Int )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:158:1: (this_Signed_Int_0= ruleSigned_Int | this_Unsigned_Int_1= ruleUnsigned_Int )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=41 && LA2_0<=44)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=37 && LA2_0<=40)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:159:5: this_Signed_Int_0= ruleSigned_Int
                    {
                     
                            newCompositeNode(grammarAccess.getInt_LiteralAccess().getSigned_IntParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSigned_Int_in_ruleInt_Literal353);
                    this_Signed_Int_0=ruleSigned_Int();

                    state._fsp--;

                     
                            current = this_Signed_Int_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:169:5: this_Unsigned_Int_1= ruleUnsigned_Int
                    {
                     
                            newCompositeNode(grammarAccess.getInt_LiteralAccess().getUnsigned_IntParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUnsigned_Int_in_ruleInt_Literal380);
                    this_Unsigned_Int_1=ruleUnsigned_Int();

                    state._fsp--;

                     
                            current = this_Unsigned_Int_1; 
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
    // $ANTLR end "ruleInt_Literal"


    // $ANTLR start "entryRuleUnsigned_Int_Type_Name"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:187:1: entryRuleUnsigned_Int_Type_Name returns [String current=null] : iv_ruleUnsigned_Int_Type_Name= ruleUnsigned_Int_Type_Name EOF ;
    public final String entryRuleUnsigned_Int_Type_Name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnsigned_Int_Type_Name = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:188:2: (iv_ruleUnsigned_Int_Type_Name= ruleUnsigned_Int_Type_Name EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:189:2: iv_ruleUnsigned_Int_Type_Name= ruleUnsigned_Int_Type_Name EOF
            {
             newCompositeNode(grammarAccess.getUnsigned_Int_Type_NameRule()); 
            pushFollow(FOLLOW_ruleUnsigned_Int_Type_Name_in_entryRuleUnsigned_Int_Type_Name418);
            iv_ruleUnsigned_Int_Type_Name=ruleUnsigned_Int_Type_Name();

            state._fsp--;

             current =iv_ruleUnsigned_Int_Type_Name.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnsigned_Int_Type_Name429); 

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
    // $ANTLR end "entryRuleUnsigned_Int_Type_Name"


    // $ANTLR start "ruleUnsigned_Int_Type_Name"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:196:1: ruleUnsigned_Int_Type_Name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'USINT' | kw= 'UINT' | kw= 'UDINT' | kw= 'ULINT' ) ;
    public final AntlrDatatypeRuleToken ruleUnsigned_Int_Type_Name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:199:28: ( (kw= 'USINT' | kw= 'UINT' | kw= 'UDINT' | kw= 'ULINT' ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:200:1: (kw= 'USINT' | kw= 'UINT' | kw= 'UDINT' | kw= 'ULINT' )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:200:1: (kw= 'USINT' | kw= 'UINT' | kw= 'UDINT' | kw= 'ULINT' )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt3=1;
                }
                break;
            case 38:
                {
                alt3=2;
                }
                break;
            case 39:
                {
                alt3=3;
                }
                break;
            case 40:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:201:2: kw= 'USINT'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleUnsigned_Int_Type_Name467); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnsigned_Int_Type_NameAccess().getUSINTKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:208:2: kw= 'UINT'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleUnsigned_Int_Type_Name486); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnsigned_Int_Type_NameAccess().getUINTKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:215:2: kw= 'UDINT'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleUnsigned_Int_Type_Name505); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnsigned_Int_Type_NameAccess().getUDINTKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:222:2: kw= 'ULINT'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleUnsigned_Int_Type_Name524); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnsigned_Int_Type_NameAccess().getULINTKeyword_3()); 
                        

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
    // $ANTLR end "ruleUnsigned_Int_Type_Name"


    // $ANTLR start "entryRuleSigned_Int_Type_Name"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:235:1: entryRuleSigned_Int_Type_Name returns [String current=null] : iv_ruleSigned_Int_Type_Name= ruleSigned_Int_Type_Name EOF ;
    public final String entryRuleSigned_Int_Type_Name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSigned_Int_Type_Name = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:236:2: (iv_ruleSigned_Int_Type_Name= ruleSigned_Int_Type_Name EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:237:2: iv_ruleSigned_Int_Type_Name= ruleSigned_Int_Type_Name EOF
            {
             newCompositeNode(grammarAccess.getSigned_Int_Type_NameRule()); 
            pushFollow(FOLLOW_ruleSigned_Int_Type_Name_in_entryRuleSigned_Int_Type_Name565);
            iv_ruleSigned_Int_Type_Name=ruleSigned_Int_Type_Name();

            state._fsp--;

             current =iv_ruleSigned_Int_Type_Name.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSigned_Int_Type_Name576); 

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
    // $ANTLR end "entryRuleSigned_Int_Type_Name"


    // $ANTLR start "ruleSigned_Int_Type_Name"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:244:1: ruleSigned_Int_Type_Name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'SINT' | kw= 'INT' | kw= 'DINT' | kw= 'LINT' ) ;
    public final AntlrDatatypeRuleToken ruleSigned_Int_Type_Name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:247:28: ( (kw= 'SINT' | kw= 'INT' | kw= 'DINT' | kw= 'LINT' ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:248:1: (kw= 'SINT' | kw= 'INT' | kw= 'DINT' | kw= 'LINT' )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:248:1: (kw= 'SINT' | kw= 'INT' | kw= 'DINT' | kw= 'LINT' )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt4=1;
                }
                break;
            case 42:
                {
                alt4=2;
                }
                break;
            case 43:
                {
                alt4=3;
                }
                break;
            case 44:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:249:2: kw= 'SINT'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleSigned_Int_Type_Name614); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSigned_Int_Type_NameAccess().getSINTKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:256:2: kw= 'INT'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleSigned_Int_Type_Name633); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSigned_Int_Type_NameAccess().getINTKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:263:2: kw= 'DINT'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleSigned_Int_Type_Name652); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSigned_Int_Type_NameAccess().getDINTKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:270:2: kw= 'LINT'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleSigned_Int_Type_Name671); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSigned_Int_Type_NameAccess().getLINTKeyword_3()); 
                        

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
    // $ANTLR end "ruleSigned_Int_Type_Name"


    // $ANTLR start "entryRuleUnsigned_Int"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:283:1: entryRuleUnsigned_Int returns [EObject current=null] : iv_ruleUnsigned_Int= ruleUnsigned_Int EOF ;
    public final EObject entryRuleUnsigned_Int() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnsigned_Int = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:284:2: (iv_ruleUnsigned_Int= ruleUnsigned_Int EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:285:2: iv_ruleUnsigned_Int= ruleUnsigned_Int EOF
            {
             newCompositeNode(grammarAccess.getUnsigned_IntRule()); 
            pushFollow(FOLLOW_ruleUnsigned_Int_in_entryRuleUnsigned_Int711);
            iv_ruleUnsigned_Int=ruleUnsigned_Int();

            state._fsp--;

             current =iv_ruleUnsigned_Int; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnsigned_Int721); 

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
    // $ANTLR end "entryRuleUnsigned_Int"


    // $ANTLR start "ruleUnsigned_Int"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:292:1: ruleUnsigned_Int returns [EObject current=null] : ( (lv_value_0_0= ruleUnsigned_Int_Value ) ) ;
    public final EObject ruleUnsigned_Int() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:295:28: ( ( (lv_value_0_0= ruleUnsigned_Int_Value ) ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:296:1: ( (lv_value_0_0= ruleUnsigned_Int_Value ) )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:296:1: ( (lv_value_0_0= ruleUnsigned_Int_Value ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:297:1: (lv_value_0_0= ruleUnsigned_Int_Value )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:297:1: (lv_value_0_0= ruleUnsigned_Int_Value )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:298:3: lv_value_0_0= ruleUnsigned_Int_Value
            {
             
            	        newCompositeNode(grammarAccess.getUnsigned_IntAccess().getValueUnsigned_Int_ValueParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleUnsigned_Int_Value_in_ruleUnsigned_Int766);
            lv_value_0_0=ruleUnsigned_Int_Value();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnsigned_IntRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"Unsigned_Int_Value");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleUnsigned_Int"


    // $ANTLR start "entryRuleUnsigned_Int_Value"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:322:1: entryRuleUnsigned_Int_Value returns [String current=null] : iv_ruleUnsigned_Int_Value= ruleUnsigned_Int_Value EOF ;
    public final String entryRuleUnsigned_Int_Value() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnsigned_Int_Value = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:323:2: (iv_ruleUnsigned_Int_Value= ruleUnsigned_Int_Value EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:324:2: iv_ruleUnsigned_Int_Value= ruleUnsigned_Int_Value EOF
            {
             newCompositeNode(grammarAccess.getUnsigned_Int_ValueRule()); 
            pushFollow(FOLLOW_ruleUnsigned_Int_Value_in_entryRuleUnsigned_Int_Value802);
            iv_ruleUnsigned_Int_Value=ruleUnsigned_Int_Value();

            state._fsp--;

             current =iv_ruleUnsigned_Int_Value.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnsigned_Int_Value813); 

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
    // $ANTLR end "entryRuleUnsigned_Int_Value"


    // $ANTLR start "ruleUnsigned_Int_Value"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:331:1: ruleUnsigned_Int_Value returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Unsigned_Int_Type_Name_0= ruleUnsigned_Int_Type_Name (this_BIN_VALUE_1= RULE_BIN_VALUE | this_OCT_VALUE_2= RULE_OCT_VALUE | this_DEC_VALUE_3= RULE_DEC_VALUE | this_HEX_VALUE_4= RULE_HEX_VALUE ) ) ;
    public final AntlrDatatypeRuleToken ruleUnsigned_Int_Value() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BIN_VALUE_1=null;
        Token this_OCT_VALUE_2=null;
        Token this_DEC_VALUE_3=null;
        Token this_HEX_VALUE_4=null;
        AntlrDatatypeRuleToken this_Unsigned_Int_Type_Name_0 = null;


         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:334:28: ( (this_Unsigned_Int_Type_Name_0= ruleUnsigned_Int_Type_Name (this_BIN_VALUE_1= RULE_BIN_VALUE | this_OCT_VALUE_2= RULE_OCT_VALUE | this_DEC_VALUE_3= RULE_DEC_VALUE | this_HEX_VALUE_4= RULE_HEX_VALUE ) ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:335:1: (this_Unsigned_Int_Type_Name_0= ruleUnsigned_Int_Type_Name (this_BIN_VALUE_1= RULE_BIN_VALUE | this_OCT_VALUE_2= RULE_OCT_VALUE | this_DEC_VALUE_3= RULE_DEC_VALUE | this_HEX_VALUE_4= RULE_HEX_VALUE ) )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:335:1: (this_Unsigned_Int_Type_Name_0= ruleUnsigned_Int_Type_Name (this_BIN_VALUE_1= RULE_BIN_VALUE | this_OCT_VALUE_2= RULE_OCT_VALUE | this_DEC_VALUE_3= RULE_DEC_VALUE | this_HEX_VALUE_4= RULE_HEX_VALUE ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:336:5: this_Unsigned_Int_Type_Name_0= ruleUnsigned_Int_Type_Name (this_BIN_VALUE_1= RULE_BIN_VALUE | this_OCT_VALUE_2= RULE_OCT_VALUE | this_DEC_VALUE_3= RULE_DEC_VALUE | this_HEX_VALUE_4= RULE_HEX_VALUE )
            {
             
                    newCompositeNode(grammarAccess.getUnsigned_Int_ValueAccess().getUnsigned_Int_Type_NameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUnsigned_Int_Type_Name_in_ruleUnsigned_Int_Value860);
            this_Unsigned_Int_Type_Name_0=ruleUnsigned_Int_Type_Name();

            state._fsp--;


            		current.merge(this_Unsigned_Int_Type_Name_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:346:1: (this_BIN_VALUE_1= RULE_BIN_VALUE | this_OCT_VALUE_2= RULE_OCT_VALUE | this_DEC_VALUE_3= RULE_DEC_VALUE | this_HEX_VALUE_4= RULE_HEX_VALUE )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_BIN_VALUE:
                {
                alt5=1;
                }
                break;
            case RULE_OCT_VALUE:
                {
                alt5=2;
                }
                break;
            case RULE_DEC_VALUE:
                {
                alt5=3;
                }
                break;
            case RULE_HEX_VALUE:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:346:6: this_BIN_VALUE_1= RULE_BIN_VALUE
                    {
                    this_BIN_VALUE_1=(Token)match(input,RULE_BIN_VALUE,FOLLOW_RULE_BIN_VALUE_in_ruleUnsigned_Int_Value881); 

                    		current.merge(this_BIN_VALUE_1);
                        
                     
                        newLeafNode(this_BIN_VALUE_1, grammarAccess.getUnsigned_Int_ValueAccess().getBIN_VALUETerminalRuleCall_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:354:10: this_OCT_VALUE_2= RULE_OCT_VALUE
                    {
                    this_OCT_VALUE_2=(Token)match(input,RULE_OCT_VALUE,FOLLOW_RULE_OCT_VALUE_in_ruleUnsigned_Int_Value907); 

                    		current.merge(this_OCT_VALUE_2);
                        
                     
                        newLeafNode(this_OCT_VALUE_2, grammarAccess.getUnsigned_Int_ValueAccess().getOCT_VALUETerminalRuleCall_1_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:362:10: this_DEC_VALUE_3= RULE_DEC_VALUE
                    {
                    this_DEC_VALUE_3=(Token)match(input,RULE_DEC_VALUE,FOLLOW_RULE_DEC_VALUE_in_ruleUnsigned_Int_Value933); 

                    		current.merge(this_DEC_VALUE_3);
                        
                     
                        newLeafNode(this_DEC_VALUE_3, grammarAccess.getUnsigned_Int_ValueAccess().getDEC_VALUETerminalRuleCall_1_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:370:10: this_HEX_VALUE_4= RULE_HEX_VALUE
                    {
                    this_HEX_VALUE_4=(Token)match(input,RULE_HEX_VALUE,FOLLOW_RULE_HEX_VALUE_in_ruleUnsigned_Int_Value959); 

                    		current.merge(this_HEX_VALUE_4);
                        
                     
                        newLeafNode(this_HEX_VALUE_4, grammarAccess.getUnsigned_Int_ValueAccess().getHEX_VALUETerminalRuleCall_1_3()); 
                        

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
    // $ANTLR end "ruleUnsigned_Int_Value"


    // $ANTLR start "entryRuleSigned_Int"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:385:1: entryRuleSigned_Int returns [EObject current=null] : iv_ruleSigned_Int= ruleSigned_Int EOF ;
    public final EObject entryRuleSigned_Int() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSigned_Int = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:386:2: (iv_ruleSigned_Int= ruleSigned_Int EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:387:2: iv_ruleSigned_Int= ruleSigned_Int EOF
            {
             newCompositeNode(grammarAccess.getSigned_IntRule()); 
            pushFollow(FOLLOW_ruleSigned_Int_in_entryRuleSigned_Int1005);
            iv_ruleSigned_Int=ruleSigned_Int();

            state._fsp--;

             current =iv_ruleSigned_Int; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSigned_Int1015); 

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
    // $ANTLR end "entryRuleSigned_Int"


    // $ANTLR start "ruleSigned_Int"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:394:1: ruleSigned_Int returns [EObject current=null] : ( (lv_value_0_0= ruleSigned_Int_Value ) ) ;
    public final EObject ruleSigned_Int() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:397:28: ( ( (lv_value_0_0= ruleSigned_Int_Value ) ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:398:1: ( (lv_value_0_0= ruleSigned_Int_Value ) )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:398:1: ( (lv_value_0_0= ruleSigned_Int_Value ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:399:1: (lv_value_0_0= ruleSigned_Int_Value )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:399:1: (lv_value_0_0= ruleSigned_Int_Value )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:400:3: lv_value_0_0= ruleSigned_Int_Value
            {
             
            	        newCompositeNode(grammarAccess.getSigned_IntAccess().getValueSigned_Int_ValueParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleSigned_Int_Value_in_ruleSigned_Int1060);
            lv_value_0_0=ruleSigned_Int_Value();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSigned_IntRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"Signed_Int_Value");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleSigned_Int"


    // $ANTLR start "entryRuleSigned_Int_Value"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:424:1: entryRuleSigned_Int_Value returns [String current=null] : iv_ruleSigned_Int_Value= ruleSigned_Int_Value EOF ;
    public final String entryRuleSigned_Int_Value() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSigned_Int_Value = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:425:2: (iv_ruleSigned_Int_Value= ruleSigned_Int_Value EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:426:2: iv_ruleSigned_Int_Value= ruleSigned_Int_Value EOF
            {
             newCompositeNode(grammarAccess.getSigned_Int_ValueRule()); 
            pushFollow(FOLLOW_ruleSigned_Int_Value_in_entryRuleSigned_Int_Value1096);
            iv_ruleSigned_Int_Value=ruleSigned_Int_Value();

            state._fsp--;

             current =iv_ruleSigned_Int_Value.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSigned_Int_Value1107); 

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
    // $ANTLR end "entryRuleSigned_Int_Value"


    // $ANTLR start "ruleSigned_Int_Value"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:433:1: ruleSigned_Int_Value returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Signed_Int_Type_Name_0= ruleSigned_Int_Type_Name (this_BIN_VALUE_1= RULE_BIN_VALUE | this_OCT_VALUE_2= RULE_OCT_VALUE | ( (kw= '+' | kw= '-' )? this_DEC_VALUE_5= RULE_DEC_VALUE ) | this_HEX_VALUE_6= RULE_HEX_VALUE ) ) ;
    public final AntlrDatatypeRuleToken ruleSigned_Int_Value() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BIN_VALUE_1=null;
        Token this_OCT_VALUE_2=null;
        Token kw=null;
        Token this_DEC_VALUE_5=null;
        Token this_HEX_VALUE_6=null;
        AntlrDatatypeRuleToken this_Signed_Int_Type_Name_0 = null;


         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:436:28: ( (this_Signed_Int_Type_Name_0= ruleSigned_Int_Type_Name (this_BIN_VALUE_1= RULE_BIN_VALUE | this_OCT_VALUE_2= RULE_OCT_VALUE | ( (kw= '+' | kw= '-' )? this_DEC_VALUE_5= RULE_DEC_VALUE ) | this_HEX_VALUE_6= RULE_HEX_VALUE ) ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:437:1: (this_Signed_Int_Type_Name_0= ruleSigned_Int_Type_Name (this_BIN_VALUE_1= RULE_BIN_VALUE | this_OCT_VALUE_2= RULE_OCT_VALUE | ( (kw= '+' | kw= '-' )? this_DEC_VALUE_5= RULE_DEC_VALUE ) | this_HEX_VALUE_6= RULE_HEX_VALUE ) )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:437:1: (this_Signed_Int_Type_Name_0= ruleSigned_Int_Type_Name (this_BIN_VALUE_1= RULE_BIN_VALUE | this_OCT_VALUE_2= RULE_OCT_VALUE | ( (kw= '+' | kw= '-' )? this_DEC_VALUE_5= RULE_DEC_VALUE ) | this_HEX_VALUE_6= RULE_HEX_VALUE ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:438:5: this_Signed_Int_Type_Name_0= ruleSigned_Int_Type_Name (this_BIN_VALUE_1= RULE_BIN_VALUE | this_OCT_VALUE_2= RULE_OCT_VALUE | ( (kw= '+' | kw= '-' )? this_DEC_VALUE_5= RULE_DEC_VALUE ) | this_HEX_VALUE_6= RULE_HEX_VALUE )
            {
             
                    newCompositeNode(grammarAccess.getSigned_Int_ValueAccess().getSigned_Int_Type_NameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleSigned_Int_Type_Name_in_ruleSigned_Int_Value1154);
            this_Signed_Int_Type_Name_0=ruleSigned_Int_Type_Name();

            state._fsp--;


            		current.merge(this_Signed_Int_Type_Name_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:448:1: (this_BIN_VALUE_1= RULE_BIN_VALUE | this_OCT_VALUE_2= RULE_OCT_VALUE | ( (kw= '+' | kw= '-' )? this_DEC_VALUE_5= RULE_DEC_VALUE ) | this_HEX_VALUE_6= RULE_HEX_VALUE )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_BIN_VALUE:
                {
                alt7=1;
                }
                break;
            case RULE_OCT_VALUE:
                {
                alt7=2;
                }
                break;
            case RULE_DEC_VALUE:
            case 45:
            case 46:
                {
                alt7=3;
                }
                break;
            case RULE_HEX_VALUE:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:448:6: this_BIN_VALUE_1= RULE_BIN_VALUE
                    {
                    this_BIN_VALUE_1=(Token)match(input,RULE_BIN_VALUE,FOLLOW_RULE_BIN_VALUE_in_ruleSigned_Int_Value1175); 

                    		current.merge(this_BIN_VALUE_1);
                        
                     
                        newLeafNode(this_BIN_VALUE_1, grammarAccess.getSigned_Int_ValueAccess().getBIN_VALUETerminalRuleCall_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:456:10: this_OCT_VALUE_2= RULE_OCT_VALUE
                    {
                    this_OCT_VALUE_2=(Token)match(input,RULE_OCT_VALUE,FOLLOW_RULE_OCT_VALUE_in_ruleSigned_Int_Value1201); 

                    		current.merge(this_OCT_VALUE_2);
                        
                     
                        newLeafNode(this_OCT_VALUE_2, grammarAccess.getSigned_Int_ValueAccess().getOCT_VALUETerminalRuleCall_1_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:464:6: ( (kw= '+' | kw= '-' )? this_DEC_VALUE_5= RULE_DEC_VALUE )
                    {
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:464:6: ( (kw= '+' | kw= '-' )? this_DEC_VALUE_5= RULE_DEC_VALUE )
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:464:7: (kw= '+' | kw= '-' )? this_DEC_VALUE_5= RULE_DEC_VALUE
                    {
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:464:7: (kw= '+' | kw= '-' )?
                    int alt6=3;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==45) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==46) ) {
                        alt6=2;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:465:2: kw= '+'
                            {
                            kw=(Token)match(input,45,FOLLOW_45_in_ruleSigned_Int_Value1227); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getSigned_Int_ValueAccess().getPlusSignKeyword_1_2_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:472:2: kw= '-'
                            {
                            kw=(Token)match(input,46,FOLLOW_46_in_ruleSigned_Int_Value1246); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getSigned_Int_ValueAccess().getHyphenMinusKeyword_1_2_0_1()); 
                                

                            }
                            break;

                    }

                    this_DEC_VALUE_5=(Token)match(input,RULE_DEC_VALUE,FOLLOW_RULE_DEC_VALUE_in_ruleSigned_Int_Value1263); 

                    		current.merge(this_DEC_VALUE_5);
                        
                     
                        newLeafNode(this_DEC_VALUE_5, grammarAccess.getSigned_Int_ValueAccess().getDEC_VALUETerminalRuleCall_1_2_1()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:485:10: this_HEX_VALUE_6= RULE_HEX_VALUE
                    {
                    this_HEX_VALUE_6=(Token)match(input,RULE_HEX_VALUE,FOLLOW_RULE_HEX_VALUE_in_ruleSigned_Int_Value1290); 

                    		current.merge(this_HEX_VALUE_6);
                        
                     
                        newLeafNode(this_HEX_VALUE_6, grammarAccess.getSigned_Int_ValueAccess().getHEX_VALUETerminalRuleCall_1_3()); 
                        

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
    // $ANTLR end "ruleSigned_Int_Value"


    // $ANTLR start "entryRuleReal_Literal"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:500:1: entryRuleReal_Literal returns [EObject current=null] : iv_ruleReal_Literal= ruleReal_Literal EOF ;
    public final EObject entryRuleReal_Literal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReal_Literal = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:501:2: (iv_ruleReal_Literal= ruleReal_Literal EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:502:2: iv_ruleReal_Literal= ruleReal_Literal EOF
            {
             newCompositeNode(grammarAccess.getReal_LiteralRule()); 
            pushFollow(FOLLOW_ruleReal_Literal_in_entryRuleReal_Literal1336);
            iv_ruleReal_Literal=ruleReal_Literal();

            state._fsp--;

             current =iv_ruleReal_Literal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReal_Literal1346); 

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
    // $ANTLR end "entryRuleReal_Literal"


    // $ANTLR start "ruleReal_Literal"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:509:1: ruleReal_Literal returns [EObject current=null] : ( (lv_value_0_0= ruleReal_Value ) ) ;
    public final EObject ruleReal_Literal() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:512:28: ( ( (lv_value_0_0= ruleReal_Value ) ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:513:1: ( (lv_value_0_0= ruleReal_Value ) )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:513:1: ( (lv_value_0_0= ruleReal_Value ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:514:1: (lv_value_0_0= ruleReal_Value )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:514:1: (lv_value_0_0= ruleReal_Value )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:515:3: lv_value_0_0= ruleReal_Value
            {
             
            	        newCompositeNode(grammarAccess.getReal_LiteralAccess().getValueReal_ValueParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleReal_Value_in_ruleReal_Literal1391);
            lv_value_0_0=ruleReal_Value();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReal_LiteralRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"Real_Value");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleReal_Literal"


    // $ANTLR start "entryRuleReal_Type_Name"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:539:1: entryRuleReal_Type_Name returns [String current=null] : iv_ruleReal_Type_Name= ruleReal_Type_Name EOF ;
    public final String entryRuleReal_Type_Name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReal_Type_Name = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:540:2: (iv_ruleReal_Type_Name= ruleReal_Type_Name EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:541:2: iv_ruleReal_Type_Name= ruleReal_Type_Name EOF
            {
             newCompositeNode(grammarAccess.getReal_Type_NameRule()); 
            pushFollow(FOLLOW_ruleReal_Type_Name_in_entryRuleReal_Type_Name1427);
            iv_ruleReal_Type_Name=ruleReal_Type_Name();

            state._fsp--;

             current =iv_ruleReal_Type_Name.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReal_Type_Name1438); 

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
    // $ANTLR end "entryRuleReal_Type_Name"


    // $ANTLR start "ruleReal_Type_Name"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:548:1: ruleReal_Type_Name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'LREAL' | kw= 'REAL' ) ;
    public final AntlrDatatypeRuleToken ruleReal_Type_Name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:551:28: ( (kw= 'LREAL' | kw= 'REAL' ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:552:1: (kw= 'LREAL' | kw= 'REAL' )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:552:1: (kw= 'LREAL' | kw= 'REAL' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==47) ) {
                alt8=1;
            }
            else if ( (LA8_0==48) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:553:2: kw= 'LREAL'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleReal_Type_Name1476); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReal_Type_NameAccess().getLREALKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:560:2: kw= 'REAL'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleReal_Type_Name1495); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReal_Type_NameAccess().getREALKeyword_1()); 
                        

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
    // $ANTLR end "ruleReal_Type_Name"


    // $ANTLR start "entryRuleReal_Value"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:573:1: entryRuleReal_Value returns [String current=null] : iv_ruleReal_Value= ruleReal_Value EOF ;
    public final String entryRuleReal_Value() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReal_Value = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:574:2: (iv_ruleReal_Value= ruleReal_Value EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:575:2: iv_ruleReal_Value= ruleReal_Value EOF
            {
             newCompositeNode(grammarAccess.getReal_ValueRule()); 
            pushFollow(FOLLOW_ruleReal_Value_in_entryRuleReal_Value1536);
            iv_ruleReal_Value=ruleReal_Value();

            state._fsp--;

             current =iv_ruleReal_Value.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReal_Value1547); 

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
    // $ANTLR end "entryRuleReal_Value"


    // $ANTLR start "ruleReal_Value"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:582:1: ruleReal_Value returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Real_Type_Name_0= ruleReal_Type_Name (kw= '+' | kw= '-' )? this_FLOAT_VALUE_3= RULE_FLOAT_VALUE ) ;
    public final AntlrDatatypeRuleToken ruleReal_Value() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_FLOAT_VALUE_3=null;
        AntlrDatatypeRuleToken this_Real_Type_Name_0 = null;


         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:585:28: ( (this_Real_Type_Name_0= ruleReal_Type_Name (kw= '+' | kw= '-' )? this_FLOAT_VALUE_3= RULE_FLOAT_VALUE ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:586:1: (this_Real_Type_Name_0= ruleReal_Type_Name (kw= '+' | kw= '-' )? this_FLOAT_VALUE_3= RULE_FLOAT_VALUE )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:586:1: (this_Real_Type_Name_0= ruleReal_Type_Name (kw= '+' | kw= '-' )? this_FLOAT_VALUE_3= RULE_FLOAT_VALUE )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:587:5: this_Real_Type_Name_0= ruleReal_Type_Name (kw= '+' | kw= '-' )? this_FLOAT_VALUE_3= RULE_FLOAT_VALUE
            {
             
                    newCompositeNode(grammarAccess.getReal_ValueAccess().getReal_Type_NameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleReal_Type_Name_in_ruleReal_Value1594);
            this_Real_Type_Name_0=ruleReal_Type_Name();

            state._fsp--;


            		current.merge(this_Real_Type_Name_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:597:1: (kw= '+' | kw= '-' )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==45) ) {
                alt9=1;
            }
            else if ( (LA9_0==46) ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:598:2: kw= '+'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleReal_Value1613); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReal_ValueAccess().getPlusSignKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:605:2: kw= '-'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleReal_Value1632); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReal_ValueAccess().getHyphenMinusKeyword_1_1()); 
                        

                    }
                    break;

            }

            this_FLOAT_VALUE_3=(Token)match(input,RULE_FLOAT_VALUE,FOLLOW_RULE_FLOAT_VALUE_in_ruleReal_Value1649); 

            		current.merge(this_FLOAT_VALUE_3);
                
             
                newLeafNode(this_FLOAT_VALUE_3, grammarAccess.getReal_ValueAccess().getFLOAT_VALUETerminalRuleCall_2()); 
                

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
    // $ANTLR end "ruleReal_Value"


    // $ANTLR start "entryRuleBit_Str_Literal"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:625:1: entryRuleBit_Str_Literal returns [EObject current=null] : iv_ruleBit_Str_Literal= ruleBit_Str_Literal EOF ;
    public final EObject entryRuleBit_Str_Literal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBit_Str_Literal = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:626:2: (iv_ruleBit_Str_Literal= ruleBit_Str_Literal EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:627:2: iv_ruleBit_Str_Literal= ruleBit_Str_Literal EOF
            {
             newCompositeNode(grammarAccess.getBit_Str_LiteralRule()); 
            pushFollow(FOLLOW_ruleBit_Str_Literal_in_entryRuleBit_Str_Literal1694);
            iv_ruleBit_Str_Literal=ruleBit_Str_Literal();

            state._fsp--;

             current =iv_ruleBit_Str_Literal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBit_Str_Literal1704); 

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
    // $ANTLR end "entryRuleBit_Str_Literal"


    // $ANTLR start "ruleBit_Str_Literal"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:634:1: ruleBit_Str_Literal returns [EObject current=null] : ( (lv_value_0_0= ruleBit_Str_Value ) ) ;
    public final EObject ruleBit_Str_Literal() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:637:28: ( ( (lv_value_0_0= ruleBit_Str_Value ) ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:638:1: ( (lv_value_0_0= ruleBit_Str_Value ) )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:638:1: ( (lv_value_0_0= ruleBit_Str_Value ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:639:1: (lv_value_0_0= ruleBit_Str_Value )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:639:1: (lv_value_0_0= ruleBit_Str_Value )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:640:3: lv_value_0_0= ruleBit_Str_Value
            {
             
            	        newCompositeNode(grammarAccess.getBit_Str_LiteralAccess().getValueBit_Str_ValueParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleBit_Str_Value_in_ruleBit_Str_Literal1749);
            lv_value_0_0=ruleBit_Str_Value();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBit_Str_LiteralRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"Bit_Str_Value");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleBit_Str_Literal"


    // $ANTLR start "entryRuleMultibits_Type_Name"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:664:1: entryRuleMultibits_Type_Name returns [String current=null] : iv_ruleMultibits_Type_Name= ruleMultibits_Type_Name EOF ;
    public final String entryRuleMultibits_Type_Name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultibits_Type_Name = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:665:2: (iv_ruleMultibits_Type_Name= ruleMultibits_Type_Name EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:666:2: iv_ruleMultibits_Type_Name= ruleMultibits_Type_Name EOF
            {
             newCompositeNode(grammarAccess.getMultibits_Type_NameRule()); 
            pushFollow(FOLLOW_ruleMultibits_Type_Name_in_entryRuleMultibits_Type_Name1785);
            iv_ruleMultibits_Type_Name=ruleMultibits_Type_Name();

            state._fsp--;

             current =iv_ruleMultibits_Type_Name.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultibits_Type_Name1796); 

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
    // $ANTLR end "entryRuleMultibits_Type_Name"


    // $ANTLR start "ruleMultibits_Type_Name"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:673:1: ruleMultibits_Type_Name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'BYTE' | kw= 'WORD' | kw= 'DWORD' | kw= 'LWORD' ) ;
    public final AntlrDatatypeRuleToken ruleMultibits_Type_Name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:676:28: ( (kw= 'BYTE' | kw= 'WORD' | kw= 'DWORD' | kw= 'LWORD' ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:677:1: (kw= 'BYTE' | kw= 'WORD' | kw= 'DWORD' | kw= 'LWORD' )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:677:1: (kw= 'BYTE' | kw= 'WORD' | kw= 'DWORD' | kw= 'LWORD' )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt10=1;
                }
                break;
            case 50:
                {
                alt10=2;
                }
                break;
            case 51:
                {
                alt10=3;
                }
                break;
            case 52:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:678:2: kw= 'BYTE'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleMultibits_Type_Name1834); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMultibits_Type_NameAccess().getBYTEKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:685:2: kw= 'WORD'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleMultibits_Type_Name1853); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMultibits_Type_NameAccess().getWORDKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:692:2: kw= 'DWORD'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleMultibits_Type_Name1872); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMultibits_Type_NameAccess().getDWORDKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:699:2: kw= 'LWORD'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleMultibits_Type_Name1891); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMultibits_Type_NameAccess().getLWORDKeyword_3()); 
                        

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
    // $ANTLR end "ruleMultibits_Type_Name"


    // $ANTLR start "entryRuleBit_Str_Value"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:712:1: entryRuleBit_Str_Value returns [String current=null] : iv_ruleBit_Str_Value= ruleBit_Str_Value EOF ;
    public final String entryRuleBit_Str_Value() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBit_Str_Value = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:713:2: (iv_ruleBit_Str_Value= ruleBit_Str_Value EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:714:2: iv_ruleBit_Str_Value= ruleBit_Str_Value EOF
            {
             newCompositeNode(grammarAccess.getBit_Str_ValueRule()); 
            pushFollow(FOLLOW_ruleBit_Str_Value_in_entryRuleBit_Str_Value1932);
            iv_ruleBit_Str_Value=ruleBit_Str_Value();

            state._fsp--;

             current =iv_ruleBit_Str_Value.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBit_Str_Value1943); 

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
    // $ANTLR end "entryRuleBit_Str_Value"


    // $ANTLR start "ruleBit_Str_Value"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:721:1: ruleBit_Str_Value returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Multibits_Type_Name_0= ruleMultibits_Type_Name kw= '#' (this_BIN_VALUE_2= RULE_BIN_VALUE | this_OCT_VALUE_3= RULE_OCT_VALUE | this_DEC_VALUE_4= RULE_DEC_VALUE | this_HEX_VALUE_5= RULE_HEX_VALUE ) ) ;
    public final AntlrDatatypeRuleToken ruleBit_Str_Value() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_BIN_VALUE_2=null;
        Token this_OCT_VALUE_3=null;
        Token this_DEC_VALUE_4=null;
        Token this_HEX_VALUE_5=null;
        AntlrDatatypeRuleToken this_Multibits_Type_Name_0 = null;


         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:724:28: ( (this_Multibits_Type_Name_0= ruleMultibits_Type_Name kw= '#' (this_BIN_VALUE_2= RULE_BIN_VALUE | this_OCT_VALUE_3= RULE_OCT_VALUE | this_DEC_VALUE_4= RULE_DEC_VALUE | this_HEX_VALUE_5= RULE_HEX_VALUE ) ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:725:1: (this_Multibits_Type_Name_0= ruleMultibits_Type_Name kw= '#' (this_BIN_VALUE_2= RULE_BIN_VALUE | this_OCT_VALUE_3= RULE_OCT_VALUE | this_DEC_VALUE_4= RULE_DEC_VALUE | this_HEX_VALUE_5= RULE_HEX_VALUE ) )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:725:1: (this_Multibits_Type_Name_0= ruleMultibits_Type_Name kw= '#' (this_BIN_VALUE_2= RULE_BIN_VALUE | this_OCT_VALUE_3= RULE_OCT_VALUE | this_DEC_VALUE_4= RULE_DEC_VALUE | this_HEX_VALUE_5= RULE_HEX_VALUE ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:726:5: this_Multibits_Type_Name_0= ruleMultibits_Type_Name kw= '#' (this_BIN_VALUE_2= RULE_BIN_VALUE | this_OCT_VALUE_3= RULE_OCT_VALUE | this_DEC_VALUE_4= RULE_DEC_VALUE | this_HEX_VALUE_5= RULE_HEX_VALUE )
            {
             
                    newCompositeNode(grammarAccess.getBit_Str_ValueAccess().getMultibits_Type_NameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMultibits_Type_Name_in_ruleBit_Str_Value1990);
            this_Multibits_Type_Name_0=ruleMultibits_Type_Name();

            state._fsp--;


            		current.merge(this_Multibits_Type_Name_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,53,FOLLOW_53_in_ruleBit_Str_Value2008); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getBit_Str_ValueAccess().getNumberSignKeyword_1()); 
                
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:742:1: (this_BIN_VALUE_2= RULE_BIN_VALUE | this_OCT_VALUE_3= RULE_OCT_VALUE | this_DEC_VALUE_4= RULE_DEC_VALUE | this_HEX_VALUE_5= RULE_HEX_VALUE )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_BIN_VALUE:
                {
                alt11=1;
                }
                break;
            case RULE_OCT_VALUE:
                {
                alt11=2;
                }
                break;
            case RULE_DEC_VALUE:
                {
                alt11=3;
                }
                break;
            case RULE_HEX_VALUE:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:742:6: this_BIN_VALUE_2= RULE_BIN_VALUE
                    {
                    this_BIN_VALUE_2=(Token)match(input,RULE_BIN_VALUE,FOLLOW_RULE_BIN_VALUE_in_ruleBit_Str_Value2024); 

                    		current.merge(this_BIN_VALUE_2);
                        
                     
                        newLeafNode(this_BIN_VALUE_2, grammarAccess.getBit_Str_ValueAccess().getBIN_VALUETerminalRuleCall_2_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:750:10: this_OCT_VALUE_3= RULE_OCT_VALUE
                    {
                    this_OCT_VALUE_3=(Token)match(input,RULE_OCT_VALUE,FOLLOW_RULE_OCT_VALUE_in_ruleBit_Str_Value2050); 

                    		current.merge(this_OCT_VALUE_3);
                        
                     
                        newLeafNode(this_OCT_VALUE_3, grammarAccess.getBit_Str_ValueAccess().getOCT_VALUETerminalRuleCall_2_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:758:10: this_DEC_VALUE_4= RULE_DEC_VALUE
                    {
                    this_DEC_VALUE_4=(Token)match(input,RULE_DEC_VALUE,FOLLOW_RULE_DEC_VALUE_in_ruleBit_Str_Value2076); 

                    		current.merge(this_DEC_VALUE_4);
                        
                     
                        newLeafNode(this_DEC_VALUE_4, grammarAccess.getBit_Str_ValueAccess().getDEC_VALUETerminalRuleCall_2_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:766:10: this_HEX_VALUE_5= RULE_HEX_VALUE
                    {
                    this_HEX_VALUE_5=(Token)match(input,RULE_HEX_VALUE,FOLLOW_RULE_HEX_VALUE_in_ruleBit_Str_Value2102); 

                    		current.merge(this_HEX_VALUE_5);
                        
                     
                        newLeafNode(this_HEX_VALUE_5, grammarAccess.getBit_Str_ValueAccess().getHEX_VALUETerminalRuleCall_2_3()); 
                        

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
    // $ANTLR end "ruleBit_Str_Value"


    // $ANTLR start "entryRuleBool_Literal"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:781:1: entryRuleBool_Literal returns [EObject current=null] : iv_ruleBool_Literal= ruleBool_Literal EOF ;
    public final EObject entryRuleBool_Literal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBool_Literal = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:782:2: (iv_ruleBool_Literal= ruleBool_Literal EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:783:2: iv_ruleBool_Literal= ruleBool_Literal EOF
            {
             newCompositeNode(grammarAccess.getBool_LiteralRule()); 
            pushFollow(FOLLOW_ruleBool_Literal_in_entryRuleBool_Literal2148);
            iv_ruleBool_Literal=ruleBool_Literal();

            state._fsp--;

             current =iv_ruleBool_Literal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBool_Literal2158); 

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
    // $ANTLR end "entryRuleBool_Literal"


    // $ANTLR start "ruleBool_Literal"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:790:1: ruleBool_Literal returns [EObject current=null] : ( (lv_value_0_0= ruleBool_Value ) ) ;
    public final EObject ruleBool_Literal() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:793:28: ( ( (lv_value_0_0= ruleBool_Value ) ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:794:1: ( (lv_value_0_0= ruleBool_Value ) )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:794:1: ( (lv_value_0_0= ruleBool_Value ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:795:1: (lv_value_0_0= ruleBool_Value )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:795:1: (lv_value_0_0= ruleBool_Value )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:796:3: lv_value_0_0= ruleBool_Value
            {
             
            	        newCompositeNode(grammarAccess.getBool_LiteralAccess().getValueBool_ValueParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleBool_Value_in_ruleBool_Literal2203);
            lv_value_0_0=ruleBool_Value();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBool_LiteralRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"Bool_Value");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleBool_Literal"


    // $ANTLR start "entryRuleBool_Value"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:820:1: entryRuleBool_Value returns [String current=null] : iv_ruleBool_Value= ruleBool_Value EOF ;
    public final String entryRuleBool_Value() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBool_Value = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:821:2: (iv_ruleBool_Value= ruleBool_Value EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:822:2: iv_ruleBool_Value= ruleBool_Value EOF
            {
             newCompositeNode(grammarAccess.getBool_ValueRule()); 
            pushFollow(FOLLOW_ruleBool_Value_in_entryRuleBool_Value2239);
            iv_ruleBool_Value=ruleBool_Value();

            state._fsp--;

             current =iv_ruleBool_Value.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBool_Value2250); 

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
    // $ANTLR end "entryRuleBool_Value"


    // $ANTLR start "ruleBool_Value"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:829:1: ruleBool_Value returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Bool_Type_Name_0= ruleBool_Type_Name kw= '#' )? (kw= '0' | kw= '1' | kw= 'FALSE' | kw= 'TRUE' ) ) ;
    public final AntlrDatatypeRuleToken ruleBool_Value() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Bool_Type_Name_0 = null;


         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:832:28: ( ( (this_Bool_Type_Name_0= ruleBool_Type_Name kw= '#' )? (kw= '0' | kw= '1' | kw= 'FALSE' | kw= 'TRUE' ) ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:833:1: ( (this_Bool_Type_Name_0= ruleBool_Type_Name kw= '#' )? (kw= '0' | kw= '1' | kw= 'FALSE' | kw= 'TRUE' ) )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:833:1: ( (this_Bool_Type_Name_0= ruleBool_Type_Name kw= '#' )? (kw= '0' | kw= '1' | kw= 'FALSE' | kw= 'TRUE' ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:833:2: (this_Bool_Type_Name_0= ruleBool_Type_Name kw= '#' )? (kw= '0' | kw= '1' | kw= 'FALSE' | kw= 'TRUE' )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:833:2: (this_Bool_Type_Name_0= ruleBool_Type_Name kw= '#' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==58) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:834:5: this_Bool_Type_Name_0= ruleBool_Type_Name kw= '#'
                    {
                     
                            newCompositeNode(grammarAccess.getBool_ValueAccess().getBool_Type_NameParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleBool_Type_Name_in_ruleBool_Value2298);
                    this_Bool_Type_Name_0=ruleBool_Type_Name();

                    state._fsp--;


                    		current.merge(this_Bool_Type_Name_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleBool_Value2316); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBool_ValueAccess().getNumberSignKeyword_0_1()); 
                        

                    }
                    break;

            }

            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:850:3: (kw= '0' | kw= '1' | kw= 'FALSE' | kw= 'TRUE' )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt13=1;
                }
                break;
            case 55:
                {
                alt13=2;
                }
                break;
            case 56:
                {
                alt13=3;
                }
                break;
            case 57:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:851:2: kw= '0'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleBool_Value2332); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBool_ValueAccess().getDigitZeroKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:858:2: kw= '1'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleBool_Value2351); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBool_ValueAccess().getDigitOneKeyword_1_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:865:2: kw= 'FALSE'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleBool_Value2370); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBool_ValueAccess().getFALSEKeyword_1_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:872:2: kw= 'TRUE'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleBool_Value2389); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBool_ValueAccess().getTRUEKeyword_1_3()); 
                        

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
    // $ANTLR end "ruleBool_Value"


    // $ANTLR start "entryRuleBool_Type_Name"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:885:1: entryRuleBool_Type_Name returns [String current=null] : iv_ruleBool_Type_Name= ruleBool_Type_Name EOF ;
    public final String entryRuleBool_Type_Name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBool_Type_Name = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:886:2: (iv_ruleBool_Type_Name= ruleBool_Type_Name EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:887:2: iv_ruleBool_Type_Name= ruleBool_Type_Name EOF
            {
             newCompositeNode(grammarAccess.getBool_Type_NameRule()); 
            pushFollow(FOLLOW_ruleBool_Type_Name_in_entryRuleBool_Type_Name2431);
            iv_ruleBool_Type_Name=ruleBool_Type_Name();

            state._fsp--;

             current =iv_ruleBool_Type_Name.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBool_Type_Name2442); 

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
    // $ANTLR end "entryRuleBool_Type_Name"


    // $ANTLR start "ruleBool_Type_Name"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:894:1: ruleBool_Type_Name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'BOOL' ;
    public final AntlrDatatypeRuleToken ruleBool_Type_Name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:897:28: (kw= 'BOOL' )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:899:2: kw= 'BOOL'
            {
            kw=(Token)match(input,58,FOLLOW_58_in_ruleBool_Type_Name2479); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getBool_Type_NameAccess().getBOOLKeyword()); 
                

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
    // $ANTLR end "ruleBool_Type_Name"


    // $ANTLR start "entryRuleChar_Literal"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:912:1: entryRuleChar_Literal returns [EObject current=null] : iv_ruleChar_Literal= ruleChar_Literal EOF ;
    public final EObject entryRuleChar_Literal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChar_Literal = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:913:2: (iv_ruleChar_Literal= ruleChar_Literal EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:914:2: iv_ruleChar_Literal= ruleChar_Literal EOF
            {
             newCompositeNode(grammarAccess.getChar_LiteralRule()); 
            pushFollow(FOLLOW_ruleChar_Literal_in_entryRuleChar_Literal2518);
            iv_ruleChar_Literal=ruleChar_Literal();

            state._fsp--;

             current =iv_ruleChar_Literal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChar_Literal2528); 

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
    // $ANTLR end "entryRuleChar_Literal"


    // $ANTLR start "ruleChar_Literal"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:921:1: ruleChar_Literal returns [EObject current=null] : ( (lv_value_0_0= ruleChar_Value ) ) ;
    public final EObject ruleChar_Literal() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:924:28: ( ( (lv_value_0_0= ruleChar_Value ) ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:925:1: ( (lv_value_0_0= ruleChar_Value ) )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:925:1: ( (lv_value_0_0= ruleChar_Value ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:926:1: (lv_value_0_0= ruleChar_Value )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:926:1: (lv_value_0_0= ruleChar_Value )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:927:3: lv_value_0_0= ruleChar_Value
            {
             
            	        newCompositeNode(grammarAccess.getChar_LiteralAccess().getValueChar_ValueParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleChar_Value_in_ruleChar_Literal2573);
            lv_value_0_0=ruleChar_Value();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChar_LiteralRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"Char_Value");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleChar_Literal"


    // $ANTLR start "entryRuleChar_Value"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:951:1: entryRuleChar_Value returns [String current=null] : iv_ruleChar_Value= ruleChar_Value EOF ;
    public final String entryRuleChar_Value() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleChar_Value = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:952:2: (iv_ruleChar_Value= ruleChar_Value EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:953:2: iv_ruleChar_Value= ruleChar_Value EOF
            {
             newCompositeNode(grammarAccess.getChar_ValueRule()); 
            pushFollow(FOLLOW_ruleChar_Value_in_entryRuleChar_Value2609);
            iv_ruleChar_Value=ruleChar_Value();

            state._fsp--;

             current =iv_ruleChar_Value.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChar_Value2620); 

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
    // $ANTLR end "entryRuleChar_Value"


    // $ANTLR start "ruleChar_Value"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:960:1: ruleChar_Value returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'STRING#' )? this_Char_Str_1= ruleChar_Str ) ;
    public final AntlrDatatypeRuleToken ruleChar_Value() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Char_Str_1 = null;


         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:963:28: ( ( (kw= 'STRING#' )? this_Char_Str_1= ruleChar_Str ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:964:1: ( (kw= 'STRING#' )? this_Char_Str_1= ruleChar_Str )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:964:1: ( (kw= 'STRING#' )? this_Char_Str_1= ruleChar_Str )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:964:2: (kw= 'STRING#' )? this_Char_Str_1= ruleChar_Str
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:964:2: (kw= 'STRING#' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==59) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:965:2: kw= 'STRING#'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleChar_Value2659); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getChar_ValueAccess().getSTRINGKeyword_0()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getChar_ValueAccess().getChar_StrParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleChar_Str_in_ruleChar_Value2683);
            this_Char_Str_1=ruleChar_Str();

            state._fsp--;


            		current.merge(this_Char_Str_1);
                
             
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
    // $ANTLR end "ruleChar_Value"


    // $ANTLR start "entryRuleChar_Str"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:989:1: entryRuleChar_Str returns [String current=null] : iv_ruleChar_Str= ruleChar_Str EOF ;
    public final String entryRuleChar_Str() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleChar_Str = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:990:2: (iv_ruleChar_Str= ruleChar_Str EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:991:2: iv_ruleChar_Str= ruleChar_Str EOF
            {
             newCompositeNode(grammarAccess.getChar_StrRule()); 
            pushFollow(FOLLOW_ruleChar_Str_in_entryRuleChar_Str2729);
            iv_ruleChar_Str=ruleChar_Str();

            state._fsp--;

             current =iv_ruleChar_Str.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChar_Str2740); 

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
    // $ANTLR end "entryRuleChar_Str"


    // $ANTLR start "ruleChar_Str"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:998:1: ruleChar_Str returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_S_Byte_Char_Str_0= ruleS_Byte_Char_Str | this_D_Byte_Char_Str_1= ruleD_Byte_Char_Str ) ;
    public final AntlrDatatypeRuleToken ruleChar_Str() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_S_Byte_Char_Str_0 = null;

        AntlrDatatypeRuleToken this_D_Byte_Char_Str_1 = null;


         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1001:28: ( (this_S_Byte_Char_Str_0= ruleS_Byte_Char_Str | this_D_Byte_Char_Str_1= ruleD_Byte_Char_Str ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1002:1: (this_S_Byte_Char_Str_0= ruleS_Byte_Char_Str | this_D_Byte_Char_Str_1= ruleD_Byte_Char_Str )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1002:1: (this_S_Byte_Char_Str_0= ruleS_Byte_Char_Str | this_D_Byte_Char_Str_1= ruleD_Byte_Char_Str )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==60) ) {
                alt15=1;
            }
            else if ( (LA15_0==61) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1003:5: this_S_Byte_Char_Str_0= ruleS_Byte_Char_Str
                    {
                     
                            newCompositeNode(grammarAccess.getChar_StrAccess().getS_Byte_Char_StrParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleS_Byte_Char_Str_in_ruleChar_Str2787);
                    this_S_Byte_Char_Str_0=ruleS_Byte_Char_Str();

                    state._fsp--;


                    		current.merge(this_S_Byte_Char_Str_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1015:5: this_D_Byte_Char_Str_1= ruleD_Byte_Char_Str
                    {
                     
                            newCompositeNode(grammarAccess.getChar_StrAccess().getD_Byte_Char_StrParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleD_Byte_Char_Str_in_ruleChar_Str2820);
                    this_D_Byte_Char_Str_1=ruleD_Byte_Char_Str();

                    state._fsp--;


                    		current.merge(this_D_Byte_Char_Str_1);
                        
                     
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
    // $ANTLR end "ruleChar_Str"


    // $ANTLR start "entryRuleS_Byte_Char_Str"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1033:1: entryRuleS_Byte_Char_Str returns [String current=null] : iv_ruleS_Byte_Char_Str= ruleS_Byte_Char_Str EOF ;
    public final String entryRuleS_Byte_Char_Str() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleS_Byte_Char_Str = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1034:2: (iv_ruleS_Byte_Char_Str= ruleS_Byte_Char_Str EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1035:2: iv_ruleS_Byte_Char_Str= ruleS_Byte_Char_Str EOF
            {
             newCompositeNode(grammarAccess.getS_Byte_Char_StrRule()); 
            pushFollow(FOLLOW_ruleS_Byte_Char_Str_in_entryRuleS_Byte_Char_Str2866);
            iv_ruleS_Byte_Char_Str=ruleS_Byte_Char_Str();

            state._fsp--;

             current =iv_ruleS_Byte_Char_Str.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleS_Byte_Char_Str2877); 

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
    // $ANTLR end "entryRuleS_Byte_Char_Str"


    // $ANTLR start "ruleS_Byte_Char_Str"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1042:1: ruleS_Byte_Char_Str returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\'' (this_S_BYTE_CHAR_VALUE_1= RULE_S_BYTE_CHAR_VALUE )+ kw= '\\'' ) ;
    public final AntlrDatatypeRuleToken ruleS_Byte_Char_Str() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_S_BYTE_CHAR_VALUE_1=null;

         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1045:28: ( (kw= '\\'' (this_S_BYTE_CHAR_VALUE_1= RULE_S_BYTE_CHAR_VALUE )+ kw= '\\'' ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1046:1: (kw= '\\'' (this_S_BYTE_CHAR_VALUE_1= RULE_S_BYTE_CHAR_VALUE )+ kw= '\\'' )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1046:1: (kw= '\\'' (this_S_BYTE_CHAR_VALUE_1= RULE_S_BYTE_CHAR_VALUE )+ kw= '\\'' )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1047:2: kw= '\\'' (this_S_BYTE_CHAR_VALUE_1= RULE_S_BYTE_CHAR_VALUE )+ kw= '\\''
            {
            kw=(Token)match(input,60,FOLLOW_60_in_ruleS_Byte_Char_Str2915); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getS_Byte_Char_StrAccess().getApostropheKeyword_0()); 
                
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1052:1: (this_S_BYTE_CHAR_VALUE_1= RULE_S_BYTE_CHAR_VALUE )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_S_BYTE_CHAR_VALUE) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1052:6: this_S_BYTE_CHAR_VALUE_1= RULE_S_BYTE_CHAR_VALUE
            	    {
            	    this_S_BYTE_CHAR_VALUE_1=(Token)match(input,RULE_S_BYTE_CHAR_VALUE,FOLLOW_RULE_S_BYTE_CHAR_VALUE_in_ruleS_Byte_Char_Str2931); 

            	    		current.merge(this_S_BYTE_CHAR_VALUE_1);
            	        
            	     
            	        newLeafNode(this_S_BYTE_CHAR_VALUE_1, grammarAccess.getS_Byte_Char_StrAccess().getS_BYTE_CHAR_VALUETerminalRuleCall_1()); 
            	        

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

            kw=(Token)match(input,60,FOLLOW_60_in_ruleS_Byte_Char_Str2951); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getS_Byte_Char_StrAccess().getApostropheKeyword_2()); 
                

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
    // $ANTLR end "ruleS_Byte_Char_Str"


    // $ANTLR start "entryRuleD_Byte_Char_Str"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1073:1: entryRuleD_Byte_Char_Str returns [String current=null] : iv_ruleD_Byte_Char_Str= ruleD_Byte_Char_Str EOF ;
    public final String entryRuleD_Byte_Char_Str() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleD_Byte_Char_Str = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1074:2: (iv_ruleD_Byte_Char_Str= ruleD_Byte_Char_Str EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1075:2: iv_ruleD_Byte_Char_Str= ruleD_Byte_Char_Str EOF
            {
             newCompositeNode(grammarAccess.getD_Byte_Char_StrRule()); 
            pushFollow(FOLLOW_ruleD_Byte_Char_Str_in_entryRuleD_Byte_Char_Str2992);
            iv_ruleD_Byte_Char_Str=ruleD_Byte_Char_Str();

            state._fsp--;

             current =iv_ruleD_Byte_Char_Str.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleD_Byte_Char_Str3003); 

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
    // $ANTLR end "entryRuleD_Byte_Char_Str"


    // $ANTLR start "ruleD_Byte_Char_Str"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1082:1: ruleD_Byte_Char_Str returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\"' (this_D_BYTE_CHAR_VALUE_1= RULE_D_BYTE_CHAR_VALUE )+ kw= '\"' ) ;
    public final AntlrDatatypeRuleToken ruleD_Byte_Char_Str() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_D_BYTE_CHAR_VALUE_1=null;

         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1085:28: ( (kw= '\"' (this_D_BYTE_CHAR_VALUE_1= RULE_D_BYTE_CHAR_VALUE )+ kw= '\"' ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1086:1: (kw= '\"' (this_D_BYTE_CHAR_VALUE_1= RULE_D_BYTE_CHAR_VALUE )+ kw= '\"' )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1086:1: (kw= '\"' (this_D_BYTE_CHAR_VALUE_1= RULE_D_BYTE_CHAR_VALUE )+ kw= '\"' )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1087:2: kw= '\"' (this_D_BYTE_CHAR_VALUE_1= RULE_D_BYTE_CHAR_VALUE )+ kw= '\"'
            {
            kw=(Token)match(input,61,FOLLOW_61_in_ruleD_Byte_Char_Str3041); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getD_Byte_Char_StrAccess().getQuotationMarkKeyword_0()); 
                
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1092:1: (this_D_BYTE_CHAR_VALUE_1= RULE_D_BYTE_CHAR_VALUE )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_D_BYTE_CHAR_VALUE) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1092:6: this_D_BYTE_CHAR_VALUE_1= RULE_D_BYTE_CHAR_VALUE
            	    {
            	    this_D_BYTE_CHAR_VALUE_1=(Token)match(input,RULE_D_BYTE_CHAR_VALUE,FOLLOW_RULE_D_BYTE_CHAR_VALUE_in_ruleD_Byte_Char_Str3057); 

            	    		current.merge(this_D_BYTE_CHAR_VALUE_1);
            	        
            	     
            	        newLeafNode(this_D_BYTE_CHAR_VALUE_1, grammarAccess.getD_Byte_Char_StrAccess().getD_BYTE_CHAR_VALUETerminalRuleCall_1()); 
            	        

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

            kw=(Token)match(input,61,FOLLOW_61_in_ruleD_Byte_Char_Str3077); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getD_Byte_Char_StrAccess().getQuotationMarkKeyword_2()); 
                

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
    // $ANTLR end "ruleD_Byte_Char_Str"


    // $ANTLR start "entryRuleTime_Type_Name"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1113:1: entryRuleTime_Type_Name returns [String current=null] : iv_ruleTime_Type_Name= ruleTime_Type_Name EOF ;
    public final String entryRuleTime_Type_Name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTime_Type_Name = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1114:2: (iv_ruleTime_Type_Name= ruleTime_Type_Name EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1115:2: iv_ruleTime_Type_Name= ruleTime_Type_Name EOF
            {
             newCompositeNode(grammarAccess.getTime_Type_NameRule()); 
            pushFollow(FOLLOW_ruleTime_Type_Name_in_entryRuleTime_Type_Name3118);
            iv_ruleTime_Type_Name=ruleTime_Type_Name();

            state._fsp--;

             current =iv_ruleTime_Type_Name.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTime_Type_Name3129); 

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
    // $ANTLR end "entryRuleTime_Type_Name"


    // $ANTLR start "ruleTime_Type_Name"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1122:1: ruleTime_Type_Name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'TIME' | kw= 'LTIME' ) ;
    public final AntlrDatatypeRuleToken ruleTime_Type_Name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1125:28: ( (kw= 'TIME' | kw= 'LTIME' ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1126:1: (kw= 'TIME' | kw= 'LTIME' )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1126:1: (kw= 'TIME' | kw= 'LTIME' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==62) ) {
                alt18=1;
            }
            else if ( (LA18_0==63) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1127:2: kw= 'TIME'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleTime_Type_Name3167); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTime_Type_NameAccess().getTIMEKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1134:2: kw= 'LTIME'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleTime_Type_Name3186); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTime_Type_NameAccess().getLTIMEKeyword_1()); 
                        

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
    // $ANTLR end "ruleTime_Type_Name"


    // $ANTLR start "entryRuleTod_Type_Name"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1147:1: entryRuleTod_Type_Name returns [String current=null] : iv_ruleTod_Type_Name= ruleTod_Type_Name EOF ;
    public final String entryRuleTod_Type_Name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTod_Type_Name = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1148:2: (iv_ruleTod_Type_Name= ruleTod_Type_Name EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1149:2: iv_ruleTod_Type_Name= ruleTod_Type_Name EOF
            {
             newCompositeNode(grammarAccess.getTod_Type_NameRule()); 
            pushFollow(FOLLOW_ruleTod_Type_Name_in_entryRuleTod_Type_Name3227);
            iv_ruleTod_Type_Name=ruleTod_Type_Name();

            state._fsp--;

             current =iv_ruleTod_Type_Name.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTod_Type_Name3238); 

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
    // $ANTLR end "entryRuleTod_Type_Name"


    // $ANTLR start "ruleTod_Type_Name"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1156:1: ruleTod_Type_Name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'TIME_OF_DAY' | kw= 'TOD' | kw= 'LTOD' ) ;
    public final AntlrDatatypeRuleToken ruleTod_Type_Name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1159:28: ( (kw= 'TIME_OF_DAY' | kw= 'TOD' | kw= 'LTOD' ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1160:1: (kw= 'TIME_OF_DAY' | kw= 'TOD' | kw= 'LTOD' )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1160:1: (kw= 'TIME_OF_DAY' | kw= 'TOD' | kw= 'LTOD' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt19=1;
                }
                break;
            case 65:
                {
                alt19=2;
                }
                break;
            case 66:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1161:2: kw= 'TIME_OF_DAY'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleTod_Type_Name3276); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTod_Type_NameAccess().getTIME_OF_DAYKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1168:2: kw= 'TOD'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleTod_Type_Name3295); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTod_Type_NameAccess().getTODKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1175:2: kw= 'LTOD'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleTod_Type_Name3314); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTod_Type_NameAccess().getLTODKeyword_2()); 
                        

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
    // $ANTLR end "ruleTod_Type_Name"


    // $ANTLR start "entryRuleTime_Literal"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1192:1: entryRuleTime_Literal returns [EObject current=null] : iv_ruleTime_Literal= ruleTime_Literal EOF ;
    public final EObject entryRuleTime_Literal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime_Literal = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1193:2: (iv_ruleTime_Literal= ruleTime_Literal EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1194:2: iv_ruleTime_Literal= ruleTime_Literal EOF
            {
             newCompositeNode(grammarAccess.getTime_LiteralRule()); 
            pushFollow(FOLLOW_ruleTime_Literal_in_entryRuleTime_Literal3358);
            iv_ruleTime_Literal=ruleTime_Literal();

            state._fsp--;

             current =iv_ruleTime_Literal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTime_Literal3368); 

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
    // $ANTLR end "entryRuleTime_Literal"


    // $ANTLR start "ruleTime_Literal"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1201:1: ruleTime_Literal returns [EObject current=null] : (this_Duration_0= ruleDuration | this_Time_Of_Day_1= ruleTime_Of_Day | this_Date_2= ruleDate | this_Date_And_Time_3= ruleDate_And_Time ) ;
    public final EObject ruleTime_Literal() throws RecognitionException {
        EObject current = null;

        EObject this_Duration_0 = null;

        EObject this_Time_Of_Day_1 = null;

        EObject this_Date_2 = null;

        EObject this_Date_And_Time_3 = null;


         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1204:28: ( (this_Duration_0= ruleDuration | this_Time_Of_Day_1= ruleTime_Of_Day | this_Date_2= ruleDate | this_Date_And_Time_3= ruleDate_And_Time ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1205:1: (this_Duration_0= ruleDuration | this_Time_Of_Day_1= ruleTime_Of_Day | this_Date_2= ruleDate | this_Date_And_Time_3= ruleDate_And_Time )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1205:1: (this_Duration_0= ruleDuration | this_Time_Of_Day_1= ruleTime_Of_Day | this_Date_2= ruleDate | this_Date_And_Time_3= ruleDate_And_Time )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 62:
            case 63:
            case 67:
            case 68:
                {
                alt20=1;
                }
                break;
            case 64:
            case 65:
            case 66:
            case 69:
                {
                alt20=2;
                }
                break;
            case RULE_DATE_VALUE:
                {
                alt20=3;
                }
                break;
            case 70:
            case 71:
            case 72:
            case 73:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1206:5: this_Duration_0= ruleDuration
                    {
                     
                            newCompositeNode(grammarAccess.getTime_LiteralAccess().getDurationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDuration_in_ruleTime_Literal3415);
                    this_Duration_0=ruleDuration();

                    state._fsp--;

                     
                            current = this_Duration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1216:5: this_Time_Of_Day_1= ruleTime_Of_Day
                    {
                     
                            newCompositeNode(grammarAccess.getTime_LiteralAccess().getTime_Of_DayParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTime_Of_Day_in_ruleTime_Literal3442);
                    this_Time_Of_Day_1=ruleTime_Of_Day();

                    state._fsp--;

                     
                            current = this_Time_Of_Day_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1226:5: this_Date_2= ruleDate
                    {
                     
                            newCompositeNode(grammarAccess.getTime_LiteralAccess().getDateParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDate_in_ruleTime_Literal3469);
                    this_Date_2=ruleDate();

                    state._fsp--;

                     
                            current = this_Date_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1236:5: this_Date_And_Time_3= ruleDate_And_Time
                    {
                     
                            newCompositeNode(grammarAccess.getTime_LiteralAccess().getDate_And_TimeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDate_And_Time_in_ruleTime_Literal3496);
                    this_Date_And_Time_3=ruleDate_And_Time();

                    state._fsp--;

                     
                            current = this_Date_And_Time_3; 
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
    // $ANTLR end "ruleTime_Literal"


    // $ANTLR start "entryRuleDuration"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1252:1: entryRuleDuration returns [EObject current=null] : iv_ruleDuration= ruleDuration EOF ;
    public final EObject entryRuleDuration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDuration = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1253:2: (iv_ruleDuration= ruleDuration EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1254:2: iv_ruleDuration= ruleDuration EOF
            {
             newCompositeNode(grammarAccess.getDurationRule()); 
            pushFollow(FOLLOW_ruleDuration_in_entryRuleDuration3531);
            iv_ruleDuration=ruleDuration();

            state._fsp--;

             current =iv_ruleDuration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDuration3541); 

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
    // $ANTLR end "entryRuleDuration"


    // $ANTLR start "ruleDuration"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1261:1: ruleDuration returns [EObject current=null] : ( (lv_value_0_0= ruleDuration_Value ) ) ;
    public final EObject ruleDuration() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1264:28: ( ( (lv_value_0_0= ruleDuration_Value ) ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1265:1: ( (lv_value_0_0= ruleDuration_Value ) )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1265:1: ( (lv_value_0_0= ruleDuration_Value ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1266:1: (lv_value_0_0= ruleDuration_Value )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1266:1: (lv_value_0_0= ruleDuration_Value )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1267:3: lv_value_0_0= ruleDuration_Value
            {
             
            	        newCompositeNode(grammarAccess.getDurationAccess().getValueDuration_ValueParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleDuration_Value_in_ruleDuration3586);
            lv_value_0_0=ruleDuration_Value();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDurationRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"Duration_Value");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleDuration"


    // $ANTLR start "entryRuleDuration_Value"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1291:1: entryRuleDuration_Value returns [String current=null] : iv_ruleDuration_Value= ruleDuration_Value EOF ;
    public final String entryRuleDuration_Value() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDuration_Value = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1292:2: (iv_ruleDuration_Value= ruleDuration_Value EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1293:2: iv_ruleDuration_Value= ruleDuration_Value EOF
            {
             newCompositeNode(grammarAccess.getDuration_ValueRule()); 
            pushFollow(FOLLOW_ruleDuration_Value_in_entryRuleDuration_Value3622);
            iv_ruleDuration_Value=ruleDuration_Value();

            state._fsp--;

             current =iv_ruleDuration_Value.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDuration_Value3633); 

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
    // $ANTLR end "entryRuleDuration_Value"


    // $ANTLR start "ruleDuration_Value"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1300:1: ruleDuration_Value returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Time_Type_Name_0= ruleTime_Type_Name | kw= 'T' | kw= 'LT' ) kw= '#' (kw= '+' | kw= '-' )? this_INTERVAL_6= RULE_INTERVAL ) ;
    public final AntlrDatatypeRuleToken ruleDuration_Value() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INTERVAL_6=null;
        AntlrDatatypeRuleToken this_Time_Type_Name_0 = null;


         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1303:28: ( ( (this_Time_Type_Name_0= ruleTime_Type_Name | kw= 'T' | kw= 'LT' ) kw= '#' (kw= '+' | kw= '-' )? this_INTERVAL_6= RULE_INTERVAL ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1304:1: ( (this_Time_Type_Name_0= ruleTime_Type_Name | kw= 'T' | kw= 'LT' ) kw= '#' (kw= '+' | kw= '-' )? this_INTERVAL_6= RULE_INTERVAL )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1304:1: ( (this_Time_Type_Name_0= ruleTime_Type_Name | kw= 'T' | kw= 'LT' ) kw= '#' (kw= '+' | kw= '-' )? this_INTERVAL_6= RULE_INTERVAL )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1304:2: (this_Time_Type_Name_0= ruleTime_Type_Name | kw= 'T' | kw= 'LT' ) kw= '#' (kw= '+' | kw= '-' )? this_INTERVAL_6= RULE_INTERVAL
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1304:2: (this_Time_Type_Name_0= ruleTime_Type_Name | kw= 'T' | kw= 'LT' )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 62:
            case 63:
                {
                alt21=1;
                }
                break;
            case 67:
                {
                alt21=2;
                }
                break;
            case 68:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1305:5: this_Time_Type_Name_0= ruleTime_Type_Name
                    {
                     
                            newCompositeNode(grammarAccess.getDuration_ValueAccess().getTime_Type_NameParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleTime_Type_Name_in_ruleDuration_Value3681);
                    this_Time_Type_Name_0=ruleTime_Type_Name();

                    state._fsp--;


                    		current.merge(this_Time_Type_Name_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1317:2: kw= 'T'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleDuration_Value3705); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDuration_ValueAccess().getTKeyword_0_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1324:2: kw= 'LT'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleDuration_Value3724); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDuration_ValueAccess().getLTKeyword_0_2()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,53,FOLLOW_53_in_ruleDuration_Value3738); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDuration_ValueAccess().getNumberSignKeyword_1()); 
                
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1335:1: (kw= '+' | kw= '-' )?
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==45) ) {
                alt22=1;
            }
            else if ( (LA22_0==46) ) {
                alt22=2;
            }
            switch (alt22) {
                case 1 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1336:2: kw= '+'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleDuration_Value3752); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDuration_ValueAccess().getPlusSignKeyword_2_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1343:2: kw= '-'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleDuration_Value3771); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDuration_ValueAccess().getHyphenMinusKeyword_2_1()); 
                        

                    }
                    break;

            }

            this_INTERVAL_6=(Token)match(input,RULE_INTERVAL,FOLLOW_RULE_INTERVAL_in_ruleDuration_Value3788); 

            		current.merge(this_INTERVAL_6);
                
             
                newLeafNode(this_INTERVAL_6, grammarAccess.getDuration_ValueAccess().getINTERVALTerminalRuleCall_3()); 
                

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
    // $ANTLR end "ruleDuration_Value"


    // $ANTLR start "entryRuleTime_Of_Day"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1363:1: entryRuleTime_Of_Day returns [EObject current=null] : iv_ruleTime_Of_Day= ruleTime_Of_Day EOF ;
    public final EObject entryRuleTime_Of_Day() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime_Of_Day = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1364:2: (iv_ruleTime_Of_Day= ruleTime_Of_Day EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1365:2: iv_ruleTime_Of_Day= ruleTime_Of_Day EOF
            {
             newCompositeNode(grammarAccess.getTime_Of_DayRule()); 
            pushFollow(FOLLOW_ruleTime_Of_Day_in_entryRuleTime_Of_Day3833);
            iv_ruleTime_Of_Day=ruleTime_Of_Day();

            state._fsp--;

             current =iv_ruleTime_Of_Day; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTime_Of_Day3843); 

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
    // $ANTLR end "entryRuleTime_Of_Day"


    // $ANTLR start "ruleTime_Of_Day"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1372:1: ruleTime_Of_Day returns [EObject current=null] : ( (lv_value_0_0= ruleTime_Of_Day_Value ) ) ;
    public final EObject ruleTime_Of_Day() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1375:28: ( ( (lv_value_0_0= ruleTime_Of_Day_Value ) ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1376:1: ( (lv_value_0_0= ruleTime_Of_Day_Value ) )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1376:1: ( (lv_value_0_0= ruleTime_Of_Day_Value ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1377:1: (lv_value_0_0= ruleTime_Of_Day_Value )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1377:1: (lv_value_0_0= ruleTime_Of_Day_Value )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1378:3: lv_value_0_0= ruleTime_Of_Day_Value
            {
             
            	        newCompositeNode(grammarAccess.getTime_Of_DayAccess().getValueTime_Of_Day_ValueParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleTime_Of_Day_Value_in_ruleTime_Of_Day3888);
            lv_value_0_0=ruleTime_Of_Day_Value();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTime_Of_DayRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"Time_Of_Day_Value");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleTime_Of_Day"


    // $ANTLR start "entryRuleTime_Of_Day_Value"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1402:1: entryRuleTime_Of_Day_Value returns [String current=null] : iv_ruleTime_Of_Day_Value= ruleTime_Of_Day_Value EOF ;
    public final String entryRuleTime_Of_Day_Value() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTime_Of_Day_Value = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1403:2: (iv_ruleTime_Of_Day_Value= ruleTime_Of_Day_Value EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1404:2: iv_ruleTime_Of_Day_Value= ruleTime_Of_Day_Value EOF
            {
             newCompositeNode(grammarAccess.getTime_Of_Day_ValueRule()); 
            pushFollow(FOLLOW_ruleTime_Of_Day_Value_in_entryRuleTime_Of_Day_Value3924);
            iv_ruleTime_Of_Day_Value=ruleTime_Of_Day_Value();

            state._fsp--;

             current =iv_ruleTime_Of_Day_Value.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTime_Of_Day_Value3935); 

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
    // $ANTLR end "entryRuleTime_Of_Day_Value"


    // $ANTLR start "ruleTime_Of_Day_Value"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1411:1: ruleTime_Of_Day_Value returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Tod_Type_Name_0= ruleTod_Type_Name | kw= 'LTIME_OF_DAY' ) kw= '#' this_DAYTIME_VALUE_3= RULE_DAYTIME_VALUE ) ;
    public final AntlrDatatypeRuleToken ruleTime_Of_Day_Value() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_DAYTIME_VALUE_3=null;
        AntlrDatatypeRuleToken this_Tod_Type_Name_0 = null;


         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1414:28: ( ( (this_Tod_Type_Name_0= ruleTod_Type_Name | kw= 'LTIME_OF_DAY' ) kw= '#' this_DAYTIME_VALUE_3= RULE_DAYTIME_VALUE ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1415:1: ( (this_Tod_Type_Name_0= ruleTod_Type_Name | kw= 'LTIME_OF_DAY' ) kw= '#' this_DAYTIME_VALUE_3= RULE_DAYTIME_VALUE )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1415:1: ( (this_Tod_Type_Name_0= ruleTod_Type_Name | kw= 'LTIME_OF_DAY' ) kw= '#' this_DAYTIME_VALUE_3= RULE_DAYTIME_VALUE )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1415:2: (this_Tod_Type_Name_0= ruleTod_Type_Name | kw= 'LTIME_OF_DAY' ) kw= '#' this_DAYTIME_VALUE_3= RULE_DAYTIME_VALUE
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1415:2: (this_Tod_Type_Name_0= ruleTod_Type_Name | kw= 'LTIME_OF_DAY' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=64 && LA23_0<=66)) ) {
                alt23=1;
            }
            else if ( (LA23_0==69) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1416:5: this_Tod_Type_Name_0= ruleTod_Type_Name
                    {
                     
                            newCompositeNode(grammarAccess.getTime_Of_Day_ValueAccess().getTod_Type_NameParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleTod_Type_Name_in_ruleTime_Of_Day_Value3983);
                    this_Tod_Type_Name_0=ruleTod_Type_Name();

                    state._fsp--;


                    		current.merge(this_Tod_Type_Name_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1428:2: kw= 'LTIME_OF_DAY'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleTime_Of_Day_Value4007); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTime_Of_Day_ValueAccess().getLTIME_OF_DAYKeyword_0_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,53,FOLLOW_53_in_ruleTime_Of_Day_Value4021); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTime_Of_Day_ValueAccess().getNumberSignKeyword_1()); 
                
            this_DAYTIME_VALUE_3=(Token)match(input,RULE_DAYTIME_VALUE,FOLLOW_RULE_DAYTIME_VALUE_in_ruleTime_Of_Day_Value4036); 

            		current.merge(this_DAYTIME_VALUE_3);
                
             
                newLeafNode(this_DAYTIME_VALUE_3, grammarAccess.getTime_Of_Day_ValueAccess().getDAYTIME_VALUETerminalRuleCall_2()); 
                

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
    // $ANTLR end "ruleTime_Of_Day_Value"


    // $ANTLR start "entryRuleDate"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1456:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1457:2: (iv_ruleDate= ruleDate EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1458:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_ruleDate_in_entryRuleDate4083);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDate4093); 

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
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1465:1: ruleDate returns [EObject current=null] : ( (lv_value_0_0= RULE_DATE_VALUE ) ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1468:28: ( ( (lv_value_0_0= RULE_DATE_VALUE ) ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1469:1: ( (lv_value_0_0= RULE_DATE_VALUE ) )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1469:1: ( (lv_value_0_0= RULE_DATE_VALUE ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1470:1: (lv_value_0_0= RULE_DATE_VALUE )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1470:1: (lv_value_0_0= RULE_DATE_VALUE )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1471:3: lv_value_0_0= RULE_DATE_VALUE
            {
            lv_value_0_0=(Token)match(input,RULE_DATE_VALUE,FOLLOW_RULE_DATE_VALUE_in_ruleDate4134); 

            			newLeafNode(lv_value_0_0, grammarAccess.getDateAccess().getValueDATE_VALUETerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"DATE_VALUE");
            	    

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
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleDate_And_Time"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1495:1: entryRuleDate_And_Time returns [EObject current=null] : iv_ruleDate_And_Time= ruleDate_And_Time EOF ;
    public final EObject entryRuleDate_And_Time() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate_And_Time = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1496:2: (iv_ruleDate_And_Time= ruleDate_And_Time EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1497:2: iv_ruleDate_And_Time= ruleDate_And_Time EOF
            {
             newCompositeNode(grammarAccess.getDate_And_TimeRule()); 
            pushFollow(FOLLOW_ruleDate_And_Time_in_entryRuleDate_And_Time4174);
            iv_ruleDate_And_Time=ruleDate_And_Time();

            state._fsp--;

             current =iv_ruleDate_And_Time; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDate_And_Time4184); 

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
    // $ANTLR end "entryRuleDate_And_Time"


    // $ANTLR start "ruleDate_And_Time"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1504:1: ruleDate_And_Time returns [EObject current=null] : ( (lv_value_0_0= ruleDate_And_Time_Value ) ) ;
    public final EObject ruleDate_And_Time() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1507:28: ( ( (lv_value_0_0= ruleDate_And_Time_Value ) ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1508:1: ( (lv_value_0_0= ruleDate_And_Time_Value ) )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1508:1: ( (lv_value_0_0= ruleDate_And_Time_Value ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1509:1: (lv_value_0_0= ruleDate_And_Time_Value )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1509:1: (lv_value_0_0= ruleDate_And_Time_Value )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1510:3: lv_value_0_0= ruleDate_And_Time_Value
            {
             
            	        newCompositeNode(grammarAccess.getDate_And_TimeAccess().getValueDate_And_Time_ValueParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleDate_And_Time_Value_in_ruleDate_And_Time4229);
            lv_value_0_0=ruleDate_And_Time_Value();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDate_And_TimeRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"Date_And_Time_Value");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleDate_And_Time"


    // $ANTLR start "entryRuleDate_And_Time_Value"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1534:1: entryRuleDate_And_Time_Value returns [String current=null] : iv_ruleDate_And_Time_Value= ruleDate_And_Time_Value EOF ;
    public final String entryRuleDate_And_Time_Value() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDate_And_Time_Value = null;


        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1535:2: (iv_ruleDate_And_Time_Value= ruleDate_And_Time_Value EOF )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1536:2: iv_ruleDate_And_Time_Value= ruleDate_And_Time_Value EOF
            {
             newCompositeNode(grammarAccess.getDate_And_Time_ValueRule()); 
            pushFollow(FOLLOW_ruleDate_And_Time_Value_in_entryRuleDate_And_Time_Value4265);
            iv_ruleDate_And_Time_Value=ruleDate_And_Time_Value();

            state._fsp--;

             current =iv_ruleDate_And_Time_Value.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDate_And_Time_Value4276); 

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
    // $ANTLR end "entryRuleDate_And_Time_Value"


    // $ANTLR start "ruleDate_And_Time_Value"
    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1543:1: ruleDate_And_Time_Value returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'DATE_AND_TIME' | kw= 'LDATE_AND_TIME' | kw= 'DT' | kw= 'LDT' ) kw= '#' this_DATE_LITERAL_5= RULE_DATE_LITERAL kw= '-' this_DAYTIME_VALUE_7= RULE_DAYTIME_VALUE ) ;
    public final AntlrDatatypeRuleToken ruleDate_And_Time_Value() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_DATE_LITERAL_5=null;
        Token this_DAYTIME_VALUE_7=null;

         enterRule(); 
            
        try {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1546:28: ( ( (kw= 'DATE_AND_TIME' | kw= 'LDATE_AND_TIME' | kw= 'DT' | kw= 'LDT' ) kw= '#' this_DATE_LITERAL_5= RULE_DATE_LITERAL kw= '-' this_DAYTIME_VALUE_7= RULE_DAYTIME_VALUE ) )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1547:1: ( (kw= 'DATE_AND_TIME' | kw= 'LDATE_AND_TIME' | kw= 'DT' | kw= 'LDT' ) kw= '#' this_DATE_LITERAL_5= RULE_DATE_LITERAL kw= '-' this_DAYTIME_VALUE_7= RULE_DAYTIME_VALUE )
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1547:1: ( (kw= 'DATE_AND_TIME' | kw= 'LDATE_AND_TIME' | kw= 'DT' | kw= 'LDT' ) kw= '#' this_DATE_LITERAL_5= RULE_DATE_LITERAL kw= '-' this_DAYTIME_VALUE_7= RULE_DAYTIME_VALUE )
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1547:2: (kw= 'DATE_AND_TIME' | kw= 'LDATE_AND_TIME' | kw= 'DT' | kw= 'LDT' ) kw= '#' this_DATE_LITERAL_5= RULE_DATE_LITERAL kw= '-' this_DAYTIME_VALUE_7= RULE_DAYTIME_VALUE
            {
            // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1547:2: (kw= 'DATE_AND_TIME' | kw= 'LDATE_AND_TIME' | kw= 'DT' | kw= 'LDT' )
            int alt24=4;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt24=1;
                }
                break;
            case 71:
                {
                alt24=2;
                }
                break;
            case 72:
                {
                alt24=3;
                }
                break;
            case 73:
                {
                alt24=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1548:2: kw= 'DATE_AND_TIME'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleDate_And_Time_Value4315); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDate_And_Time_ValueAccess().getDATE_AND_TIMEKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1555:2: kw= 'LDATE_AND_TIME'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleDate_And_Time_Value4334); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDate_And_Time_ValueAccess().getLDATE_AND_TIMEKeyword_0_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1562:2: kw= 'DT'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleDate_And_Time_Value4353); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDate_And_Time_ValueAccess().getDTKeyword_0_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../at.bachmann.plc.st/src-gen/at/bachmann/plc/st/parser/antlr/internal/InternalSTLanguage.g:1569:2: kw= 'LDT'
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleDate_And_Time_Value4372); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDate_And_Time_ValueAccess().getLDTKeyword_0_3()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,53,FOLLOW_53_in_ruleDate_And_Time_Value4386); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDate_And_Time_ValueAccess().getNumberSignKeyword_1()); 
                
            this_DATE_LITERAL_5=(Token)match(input,RULE_DATE_LITERAL,FOLLOW_RULE_DATE_LITERAL_in_ruleDate_And_Time_Value4401); 

            		current.merge(this_DATE_LITERAL_5);
                
             
                newLeafNode(this_DATE_LITERAL_5, grammarAccess.getDate_And_Time_ValueAccess().getDATE_LITERALTerminalRuleCall_2()); 
                
            kw=(Token)match(input,46,FOLLOW_46_in_ruleDate_And_Time_Value4419); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDate_And_Time_ValueAccess().getHyphenMinusKeyword_3()); 
                
            this_DAYTIME_VALUE_7=(Token)match(input,RULE_DAYTIME_VALUE,FOLLOW_RULE_DAYTIME_VALUE_in_ruleDate_And_Time_Value4434); 

            		current.merge(this_DAYTIME_VALUE_7);
                
             
                newLeafNode(this_DAYTIME_VALUE_7, grammarAccess.getDate_And_Time_ValueAccess().getDAYTIME_VALUETerminalRuleCall_4()); 
                

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
    // $ANTLR end "ruleDate_And_Time_Value"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruletest_in_entryRuletest75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletest85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruletest127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeric_Literal_in_entryRuleNumeric_Literal177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumeric_Literal187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInt_Literal_in_ruleNumeric_Literal234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_Literal_in_ruleNumeric_Literal261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInt_Literal_in_entryRuleInt_Literal296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInt_Literal306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigned_Int_in_ruleInt_Literal353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnsigned_Int_in_ruleInt_Literal380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnsigned_Int_Type_Name_in_entryRuleUnsigned_Int_Type_Name418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnsigned_Int_Type_Name429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleUnsigned_Int_Type_Name467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleUnsigned_Int_Type_Name486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleUnsigned_Int_Type_Name505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleUnsigned_Int_Type_Name524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigned_Int_Type_Name_in_entryRuleSigned_Int_Type_Name565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSigned_Int_Type_Name576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleSigned_Int_Type_Name614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleSigned_Int_Type_Name633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleSigned_Int_Type_Name652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleSigned_Int_Type_Name671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnsigned_Int_in_entryRuleUnsigned_Int711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnsigned_Int721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnsigned_Int_Value_in_ruleUnsigned_Int766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnsigned_Int_Value_in_entryRuleUnsigned_Int_Value802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnsigned_Int_Value813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnsigned_Int_Type_Name_in_ruleUnsigned_Int_Value860 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_RULE_BIN_VALUE_in_ruleUnsigned_Int_Value881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OCT_VALUE_in_ruleUnsigned_Int_Value907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEC_VALUE_in_ruleUnsigned_Int_Value933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_VALUE_in_ruleUnsigned_Int_Value959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigned_Int_in_entryRuleSigned_Int1005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSigned_Int1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigned_Int_Value_in_ruleSigned_Int1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigned_Int_Value_in_entryRuleSigned_Int_Value1096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSigned_Int_Value1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigned_Int_Type_Name_in_ruleSigned_Int_Value1154 = new BitSet(new long[]{0x00006000000000F0L});
    public static final BitSet FOLLOW_RULE_BIN_VALUE_in_ruleSigned_Int_Value1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OCT_VALUE_in_ruleSigned_Int_Value1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleSigned_Int_Value1227 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_46_in_ruleSigned_Int_Value1246 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_DEC_VALUE_in_ruleSigned_Int_Value1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_VALUE_in_ruleSigned_Int_Value1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_Literal_in_entryRuleReal_Literal1336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReal_Literal1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_Value_in_ruleReal_Literal1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_Type_Name_in_entryRuleReal_Type_Name1427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReal_Type_Name1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleReal_Type_Name1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleReal_Type_Name1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_Value_in_entryRuleReal_Value1536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReal_Value1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_Type_Name_in_ruleReal_Value1594 = new BitSet(new long[]{0x0000600000000100L});
    public static final BitSet FOLLOW_45_in_ruleReal_Value1613 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_46_in_ruleReal_Value1632 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_FLOAT_VALUE_in_ruleReal_Value1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBit_Str_Literal_in_entryRuleBit_Str_Literal1694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBit_Str_Literal1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBit_Str_Value_in_ruleBit_Str_Literal1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultibits_Type_Name_in_entryRuleMultibits_Type_Name1785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultibits_Type_Name1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleMultibits_Type_Name1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleMultibits_Type_Name1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleMultibits_Type_Name1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleMultibits_Type_Name1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBit_Str_Value_in_entryRuleBit_Str_Value1932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBit_Str_Value1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultibits_Type_Name_in_ruleBit_Str_Value1990 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleBit_Str_Value2008 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_RULE_BIN_VALUE_in_ruleBit_Str_Value2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OCT_VALUE_in_ruleBit_Str_Value2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEC_VALUE_in_ruleBit_Str_Value2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_VALUE_in_ruleBit_Str_Value2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_Literal_in_entryRuleBool_Literal2148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBool_Literal2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_Value_in_ruleBool_Literal2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_Value_in_entryRuleBool_Value2239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBool_Value2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_Type_Name_in_ruleBool_Value2298 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleBool_Value2316 = new BitSet(new long[]{0x03C0000000000000L});
    public static final BitSet FOLLOW_54_in_ruleBool_Value2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleBool_Value2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleBool_Value2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleBool_Value2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_Type_Name_in_entryRuleBool_Type_Name2431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBool_Type_Name2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleBool_Type_Name2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChar_Literal_in_entryRuleChar_Literal2518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChar_Literal2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChar_Value_in_ruleChar_Literal2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChar_Value_in_entryRuleChar_Value2609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChar_Value2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleChar_Value2659 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_ruleChar_Str_in_ruleChar_Value2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChar_Str_in_entryRuleChar_Str2729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChar_Str2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleS_Byte_Char_Str_in_ruleChar_Str2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleD_Byte_Char_Str_in_ruleChar_Str2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleS_Byte_Char_Str_in_entryRuleS_Byte_Char_Str2866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleS_Byte_Char_Str2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleS_Byte_Char_Str2915 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_S_BYTE_CHAR_VALUE_in_ruleS_Byte_Char_Str2931 = new BitSet(new long[]{0x1000000000000200L});
    public static final BitSet FOLLOW_60_in_ruleS_Byte_Char_Str2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleD_Byte_Char_Str_in_entryRuleD_Byte_Char_Str2992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleD_Byte_Char_Str3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleD_Byte_Char_Str3041 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_D_BYTE_CHAR_VALUE_in_ruleD_Byte_Char_Str3057 = new BitSet(new long[]{0x2000000000000400L});
    public static final BitSet FOLLOW_61_in_ruleD_Byte_Char_Str3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTime_Type_Name_in_entryRuleTime_Type_Name3118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTime_Type_Name3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleTime_Type_Name3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleTime_Type_Name3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTod_Type_Name_in_entryRuleTod_Type_Name3227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTod_Type_Name3238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleTod_Type_Name3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleTod_Type_Name3295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleTod_Type_Name3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTime_Literal_in_entryRuleTime_Literal3358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTime_Literal3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDuration_in_ruleTime_Literal3415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTime_Of_Day_in_ruleTime_Literal3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_ruleTime_Literal3469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_And_Time_in_ruleTime_Literal3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDuration_in_entryRuleDuration3531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDuration3541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDuration_Value_in_ruleDuration3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDuration_Value_in_entryRuleDuration_Value3622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDuration_Value3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTime_Type_Name_in_ruleDuration_Value3681 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_67_in_ruleDuration_Value3705 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_68_in_ruleDuration_Value3724 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleDuration_Value3738 = new BitSet(new long[]{0x0000600000000800L});
    public static final BitSet FOLLOW_45_in_ruleDuration_Value3752 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_46_in_ruleDuration_Value3771 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_INTERVAL_in_ruleDuration_Value3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTime_Of_Day_in_entryRuleTime_Of_Day3833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTime_Of_Day3843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTime_Of_Day_Value_in_ruleTime_Of_Day3888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTime_Of_Day_Value_in_entryRuleTime_Of_Day_Value3924 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTime_Of_Day_Value3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTod_Type_Name_in_ruleTime_Of_Day_Value3983 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_69_in_ruleTime_Of_Day_Value4007 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleTime_Of_Day_Value4021 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_DAYTIME_VALUE_in_ruleTime_Of_Day_Value4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_entryRuleDate4083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDate4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DATE_VALUE_in_ruleDate4134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_And_Time_in_entryRuleDate_And_Time4174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDate_And_Time4184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_And_Time_Value_in_ruleDate_And_Time4229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_And_Time_Value_in_entryRuleDate_And_Time_Value4265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDate_And_Time_Value4276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleDate_And_Time_Value4315 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_71_in_ruleDate_And_Time_Value4334 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_72_in_ruleDate_And_Time_Value4353 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_73_in_ruleDate_And_Time_Value4372 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleDate_And_Time_Value4386 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_DATE_LITERAL_in_ruleDate_And_Time_Value4401 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleDate_And_Time_Value4419 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_DAYTIME_VALUE_in_ruleDate_And_Time_Value4434 = new BitSet(new long[]{0x0000000000000002L});

}
package at.bachmann.plc.st.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import at.bachmann.plc.st.services.STLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSTLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BIN_VALUE", "RULE_OCT_VALUE", "RULE_DEC_VALUE", "RULE_HEX_VALUE", "RULE_FLOAT_VALUE", "RULE_S_BYTE_CHAR_VALUE", "RULE_D_BYTE_CHAR_VALUE", "RULE_INTERVAL", "RULE_DAYTIME_VALUE", "RULE_DATE_LITERAL", "RULE_DATE_VALUE", "RULE_LETTER", "RULE_BIT", "RULE_OCTAL_DIGIT", "RULE_DIGIT", "RULE_HEX_DIGIT", "RULE_IDENTIFIER", "RULE_SL_COMMENT", "RULE_ML_COMMENT_1", "RULE_ML_COMMENT_2", "RULE_WS", "RULE_EOL", "RULE_PRAGMA", "RULE_FIX_POINT", "RULE_COMMON_CHAR_VALUE", "RULE_DAYS", "RULE_HOURS", "RULE_MINUTES", "RULE_SECONDS", "RULE_MILLISECONDS", "RULE_MICROSECONDS", "RULE_NANOSECONDS", "'BOOL'", "'USINT'", "'UINT'", "'UDINT'", "'ULINT'", "'SINT'", "'INT'", "'DINT'", "'LINT'", "'+'", "'-'", "'LREAL'", "'REAL'", "'BYTE'", "'WORD'", "'DWORD'", "'LWORD'", "'0'", "'1'", "'FALSE'", "'TRUE'", "'TIME'", "'LTIME'", "'TIME_OF_DAY'", "'TOD'", "'LTOD'", "'T'", "'LT'", "'LTIME_OF_DAY'", "'DATE_AND_TIME'", "'LDATE_AND_TIME'", "'DT'", "'LDT'", "'#'", "'STRING#'", "'\\''", "'\"'", "'t'"
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
    public static final int RULE_DATE_LITERAL=13;
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
    public static final int RULE_DATE_VALUE=14;
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
    public String getGrammarFileName() { return "../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g"; }


     
     	private STLanguageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(STLanguageGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuletest"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:60:1: entryRuletest : ruletest EOF ;
    public final void entryRuletest() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:61:1: ( ruletest EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:62:1: ruletest EOF
            {
             before(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_ruletest_in_entryRuletest61);
            ruletest();

            state._fsp--;

             after(grammarAccess.getTestRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletest68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletest"


    // $ANTLR start "ruletest"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:69:1: ruletest : ( ( rule__Test__TestAssignment ) ) ;
    public final void ruletest() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:73:2: ( ( ( rule__Test__TestAssignment ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:74:1: ( ( rule__Test__TestAssignment ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:74:1: ( ( rule__Test__TestAssignment ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:75:1: ( rule__Test__TestAssignment )
            {
             before(grammarAccess.getTestAccess().getTestAssignment()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:76:1: ( rule__Test__TestAssignment )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:76:2: rule__Test__TestAssignment
            {
            pushFollow(FOLLOW_rule__Test__TestAssignment_in_ruletest94);
            rule__Test__TestAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getTestAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletest"


    // $ANTLR start "entryRuleNumeric_Literal"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:90:1: entryRuleNumeric_Literal : ruleNumeric_Literal EOF ;
    public final void entryRuleNumeric_Literal() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:91:1: ( ruleNumeric_Literal EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:92:1: ruleNumeric_Literal EOF
            {
             before(grammarAccess.getNumeric_LiteralRule()); 
            pushFollow(FOLLOW_ruleNumeric_Literal_in_entryRuleNumeric_Literal123);
            ruleNumeric_Literal();

            state._fsp--;

             after(grammarAccess.getNumeric_LiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumeric_Literal130); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumeric_Literal"


    // $ANTLR start "ruleNumeric_Literal"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:99:1: ruleNumeric_Literal : ( ( rule__Numeric_Literal__Alternatives ) ) ;
    public final void ruleNumeric_Literal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:103:2: ( ( ( rule__Numeric_Literal__Alternatives ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:104:1: ( ( rule__Numeric_Literal__Alternatives ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:104:1: ( ( rule__Numeric_Literal__Alternatives ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:105:1: ( rule__Numeric_Literal__Alternatives )
            {
             before(grammarAccess.getNumeric_LiteralAccess().getAlternatives()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:106:1: ( rule__Numeric_Literal__Alternatives )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:106:2: rule__Numeric_Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Numeric_Literal__Alternatives_in_ruleNumeric_Literal156);
            rule__Numeric_Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumeric_LiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumeric_Literal"


    // $ANTLR start "entryRuleInt_Literal"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:118:1: entryRuleInt_Literal : ruleInt_Literal EOF ;
    public final void entryRuleInt_Literal() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:119:1: ( ruleInt_Literal EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:120:1: ruleInt_Literal EOF
            {
             before(grammarAccess.getInt_LiteralRule()); 
            pushFollow(FOLLOW_ruleInt_Literal_in_entryRuleInt_Literal183);
            ruleInt_Literal();

            state._fsp--;

             after(grammarAccess.getInt_LiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInt_Literal190); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInt_Literal"


    // $ANTLR start "ruleInt_Literal"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:127:1: ruleInt_Literal : ( ( rule__Int_Literal__Alternatives ) ) ;
    public final void ruleInt_Literal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:131:2: ( ( ( rule__Int_Literal__Alternatives ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:132:1: ( ( rule__Int_Literal__Alternatives ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:132:1: ( ( rule__Int_Literal__Alternatives ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:133:1: ( rule__Int_Literal__Alternatives )
            {
             before(grammarAccess.getInt_LiteralAccess().getAlternatives()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:134:1: ( rule__Int_Literal__Alternatives )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:134:2: rule__Int_Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Int_Literal__Alternatives_in_ruleInt_Literal216);
            rule__Int_Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInt_LiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInt_Literal"


    // $ANTLR start "entryRuleUnsigned_Int_Type_Name"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:148:1: entryRuleUnsigned_Int_Type_Name : ruleUnsigned_Int_Type_Name EOF ;
    public final void entryRuleUnsigned_Int_Type_Name() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:149:1: ( ruleUnsigned_Int_Type_Name EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:150:1: ruleUnsigned_Int_Type_Name EOF
            {
             before(grammarAccess.getUnsigned_Int_Type_NameRule()); 
            pushFollow(FOLLOW_ruleUnsigned_Int_Type_Name_in_entryRuleUnsigned_Int_Type_Name245);
            ruleUnsigned_Int_Type_Name();

            state._fsp--;

             after(grammarAccess.getUnsigned_Int_Type_NameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnsigned_Int_Type_Name252); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnsigned_Int_Type_Name"


    // $ANTLR start "ruleUnsigned_Int_Type_Name"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:157:1: ruleUnsigned_Int_Type_Name : ( ( rule__Unsigned_Int_Type_Name__Alternatives ) ) ;
    public final void ruleUnsigned_Int_Type_Name() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:161:2: ( ( ( rule__Unsigned_Int_Type_Name__Alternatives ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:162:1: ( ( rule__Unsigned_Int_Type_Name__Alternatives ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:162:1: ( ( rule__Unsigned_Int_Type_Name__Alternatives ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:163:1: ( rule__Unsigned_Int_Type_Name__Alternatives )
            {
             before(grammarAccess.getUnsigned_Int_Type_NameAccess().getAlternatives()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:164:1: ( rule__Unsigned_Int_Type_Name__Alternatives )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:164:2: rule__Unsigned_Int_Type_Name__Alternatives
            {
            pushFollow(FOLLOW_rule__Unsigned_Int_Type_Name__Alternatives_in_ruleUnsigned_Int_Type_Name278);
            rule__Unsigned_Int_Type_Name__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnsigned_Int_Type_NameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnsigned_Int_Type_Name"


    // $ANTLR start "entryRuleSigned_Int_Type_Name"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:176:1: entryRuleSigned_Int_Type_Name : ruleSigned_Int_Type_Name EOF ;
    public final void entryRuleSigned_Int_Type_Name() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:177:1: ( ruleSigned_Int_Type_Name EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:178:1: ruleSigned_Int_Type_Name EOF
            {
             before(grammarAccess.getSigned_Int_Type_NameRule()); 
            pushFollow(FOLLOW_ruleSigned_Int_Type_Name_in_entryRuleSigned_Int_Type_Name305);
            ruleSigned_Int_Type_Name();

            state._fsp--;

             after(grammarAccess.getSigned_Int_Type_NameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSigned_Int_Type_Name312); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSigned_Int_Type_Name"


    // $ANTLR start "ruleSigned_Int_Type_Name"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:185:1: ruleSigned_Int_Type_Name : ( ( rule__Signed_Int_Type_Name__Alternatives ) ) ;
    public final void ruleSigned_Int_Type_Name() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:189:2: ( ( ( rule__Signed_Int_Type_Name__Alternatives ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:190:1: ( ( rule__Signed_Int_Type_Name__Alternatives ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:190:1: ( ( rule__Signed_Int_Type_Name__Alternatives ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:191:1: ( rule__Signed_Int_Type_Name__Alternatives )
            {
             before(grammarAccess.getSigned_Int_Type_NameAccess().getAlternatives()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:192:1: ( rule__Signed_Int_Type_Name__Alternatives )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:192:2: rule__Signed_Int_Type_Name__Alternatives
            {
            pushFollow(FOLLOW_rule__Signed_Int_Type_Name__Alternatives_in_ruleSigned_Int_Type_Name338);
            rule__Signed_Int_Type_Name__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSigned_Int_Type_NameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSigned_Int_Type_Name"


    // $ANTLR start "entryRuleUnsigned_Int"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:204:1: entryRuleUnsigned_Int : ruleUnsigned_Int EOF ;
    public final void entryRuleUnsigned_Int() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:205:1: ( ruleUnsigned_Int EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:206:1: ruleUnsigned_Int EOF
            {
             before(grammarAccess.getUnsigned_IntRule()); 
            pushFollow(FOLLOW_ruleUnsigned_Int_in_entryRuleUnsigned_Int365);
            ruleUnsigned_Int();

            state._fsp--;

             after(grammarAccess.getUnsigned_IntRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnsigned_Int372); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnsigned_Int"


    // $ANTLR start "ruleUnsigned_Int"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:213:1: ruleUnsigned_Int : ( ( rule__Unsigned_Int__ValueAssignment ) ) ;
    public final void ruleUnsigned_Int() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:217:2: ( ( ( rule__Unsigned_Int__ValueAssignment ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:218:1: ( ( rule__Unsigned_Int__ValueAssignment ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:218:1: ( ( rule__Unsigned_Int__ValueAssignment ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:219:1: ( rule__Unsigned_Int__ValueAssignment )
            {
             before(grammarAccess.getUnsigned_IntAccess().getValueAssignment()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:220:1: ( rule__Unsigned_Int__ValueAssignment )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:220:2: rule__Unsigned_Int__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Unsigned_Int__ValueAssignment_in_ruleUnsigned_Int398);
            rule__Unsigned_Int__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUnsigned_IntAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnsigned_Int"


    // $ANTLR start "entryRuleUnsigned_Int_Value"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:232:1: entryRuleUnsigned_Int_Value : ruleUnsigned_Int_Value EOF ;
    public final void entryRuleUnsigned_Int_Value() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:233:1: ( ruleUnsigned_Int_Value EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:234:1: ruleUnsigned_Int_Value EOF
            {
             before(grammarAccess.getUnsigned_Int_ValueRule()); 
            pushFollow(FOLLOW_ruleUnsigned_Int_Value_in_entryRuleUnsigned_Int_Value425);
            ruleUnsigned_Int_Value();

            state._fsp--;

             after(grammarAccess.getUnsigned_Int_ValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnsigned_Int_Value432); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnsigned_Int_Value"


    // $ANTLR start "ruleUnsigned_Int_Value"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:241:1: ruleUnsigned_Int_Value : ( ( rule__Unsigned_Int_Value__Group__0 ) ) ;
    public final void ruleUnsigned_Int_Value() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:245:2: ( ( ( rule__Unsigned_Int_Value__Group__0 ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:246:1: ( ( rule__Unsigned_Int_Value__Group__0 ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:246:1: ( ( rule__Unsigned_Int_Value__Group__0 ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:247:1: ( rule__Unsigned_Int_Value__Group__0 )
            {
             before(grammarAccess.getUnsigned_Int_ValueAccess().getGroup()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:248:1: ( rule__Unsigned_Int_Value__Group__0 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:248:2: rule__Unsigned_Int_Value__Group__0
            {
            pushFollow(FOLLOW_rule__Unsigned_Int_Value__Group__0_in_ruleUnsigned_Int_Value458);
            rule__Unsigned_Int_Value__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnsigned_Int_ValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnsigned_Int_Value"


    // $ANTLR start "entryRuleSigned_Int"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:260:1: entryRuleSigned_Int : ruleSigned_Int EOF ;
    public final void entryRuleSigned_Int() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:261:1: ( ruleSigned_Int EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:262:1: ruleSigned_Int EOF
            {
             before(grammarAccess.getSigned_IntRule()); 
            pushFollow(FOLLOW_ruleSigned_Int_in_entryRuleSigned_Int485);
            ruleSigned_Int();

            state._fsp--;

             after(grammarAccess.getSigned_IntRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSigned_Int492); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSigned_Int"


    // $ANTLR start "ruleSigned_Int"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:269:1: ruleSigned_Int : ( ( rule__Signed_Int__ValueAssignment ) ) ;
    public final void ruleSigned_Int() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:273:2: ( ( ( rule__Signed_Int__ValueAssignment ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:274:1: ( ( rule__Signed_Int__ValueAssignment ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:274:1: ( ( rule__Signed_Int__ValueAssignment ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:275:1: ( rule__Signed_Int__ValueAssignment )
            {
             before(grammarAccess.getSigned_IntAccess().getValueAssignment()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:276:1: ( rule__Signed_Int__ValueAssignment )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:276:2: rule__Signed_Int__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Signed_Int__ValueAssignment_in_ruleSigned_Int518);
            rule__Signed_Int__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSigned_IntAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSigned_Int"


    // $ANTLR start "entryRuleSigned_Int_Value"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:288:1: entryRuleSigned_Int_Value : ruleSigned_Int_Value EOF ;
    public final void entryRuleSigned_Int_Value() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:289:1: ( ruleSigned_Int_Value EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:290:1: ruleSigned_Int_Value EOF
            {
             before(grammarAccess.getSigned_Int_ValueRule()); 
            pushFollow(FOLLOW_ruleSigned_Int_Value_in_entryRuleSigned_Int_Value545);
            ruleSigned_Int_Value();

            state._fsp--;

             after(grammarAccess.getSigned_Int_ValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSigned_Int_Value552); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSigned_Int_Value"


    // $ANTLR start "ruleSigned_Int_Value"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:297:1: ruleSigned_Int_Value : ( ( rule__Signed_Int_Value__Group__0 ) ) ;
    public final void ruleSigned_Int_Value() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:301:2: ( ( ( rule__Signed_Int_Value__Group__0 ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:302:1: ( ( rule__Signed_Int_Value__Group__0 ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:302:1: ( ( rule__Signed_Int_Value__Group__0 ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:303:1: ( rule__Signed_Int_Value__Group__0 )
            {
             before(grammarAccess.getSigned_Int_ValueAccess().getGroup()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:304:1: ( rule__Signed_Int_Value__Group__0 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:304:2: rule__Signed_Int_Value__Group__0
            {
            pushFollow(FOLLOW_rule__Signed_Int_Value__Group__0_in_ruleSigned_Int_Value578);
            rule__Signed_Int_Value__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSigned_Int_ValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSigned_Int_Value"


    // $ANTLR start "entryRuleReal_Literal"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:316:1: entryRuleReal_Literal : ruleReal_Literal EOF ;
    public final void entryRuleReal_Literal() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:317:1: ( ruleReal_Literal EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:318:1: ruleReal_Literal EOF
            {
             before(grammarAccess.getReal_LiteralRule()); 
            pushFollow(FOLLOW_ruleReal_Literal_in_entryRuleReal_Literal605);
            ruleReal_Literal();

            state._fsp--;

             after(grammarAccess.getReal_LiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReal_Literal612); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReal_Literal"


    // $ANTLR start "ruleReal_Literal"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:325:1: ruleReal_Literal : ( ( rule__Real_Literal__ValueAssignment ) ) ;
    public final void ruleReal_Literal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:329:2: ( ( ( rule__Real_Literal__ValueAssignment ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:330:1: ( ( rule__Real_Literal__ValueAssignment ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:330:1: ( ( rule__Real_Literal__ValueAssignment ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:331:1: ( rule__Real_Literal__ValueAssignment )
            {
             before(grammarAccess.getReal_LiteralAccess().getValueAssignment()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:332:1: ( rule__Real_Literal__ValueAssignment )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:332:2: rule__Real_Literal__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Real_Literal__ValueAssignment_in_ruleReal_Literal638);
            rule__Real_Literal__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getReal_LiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReal_Literal"


    // $ANTLR start "entryRuleReal_Type_Name"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:344:1: entryRuleReal_Type_Name : ruleReal_Type_Name EOF ;
    public final void entryRuleReal_Type_Name() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:345:1: ( ruleReal_Type_Name EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:346:1: ruleReal_Type_Name EOF
            {
             before(grammarAccess.getReal_Type_NameRule()); 
            pushFollow(FOLLOW_ruleReal_Type_Name_in_entryRuleReal_Type_Name665);
            ruleReal_Type_Name();

            state._fsp--;

             after(grammarAccess.getReal_Type_NameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReal_Type_Name672); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReal_Type_Name"


    // $ANTLR start "ruleReal_Type_Name"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:353:1: ruleReal_Type_Name : ( ( rule__Real_Type_Name__Alternatives ) ) ;
    public final void ruleReal_Type_Name() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:357:2: ( ( ( rule__Real_Type_Name__Alternatives ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:358:1: ( ( rule__Real_Type_Name__Alternatives ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:358:1: ( ( rule__Real_Type_Name__Alternatives ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:359:1: ( rule__Real_Type_Name__Alternatives )
            {
             before(grammarAccess.getReal_Type_NameAccess().getAlternatives()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:360:1: ( rule__Real_Type_Name__Alternatives )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:360:2: rule__Real_Type_Name__Alternatives
            {
            pushFollow(FOLLOW_rule__Real_Type_Name__Alternatives_in_ruleReal_Type_Name698);
            rule__Real_Type_Name__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReal_Type_NameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReal_Type_Name"


    // $ANTLR start "entryRuleReal_Value"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:372:1: entryRuleReal_Value : ruleReal_Value EOF ;
    public final void entryRuleReal_Value() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:373:1: ( ruleReal_Value EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:374:1: ruleReal_Value EOF
            {
             before(grammarAccess.getReal_ValueRule()); 
            pushFollow(FOLLOW_ruleReal_Value_in_entryRuleReal_Value725);
            ruleReal_Value();

            state._fsp--;

             after(grammarAccess.getReal_ValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReal_Value732); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReal_Value"


    // $ANTLR start "ruleReal_Value"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:381:1: ruleReal_Value : ( ( rule__Real_Value__Group__0 ) ) ;
    public final void ruleReal_Value() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:385:2: ( ( ( rule__Real_Value__Group__0 ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:386:1: ( ( rule__Real_Value__Group__0 ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:386:1: ( ( rule__Real_Value__Group__0 ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:387:1: ( rule__Real_Value__Group__0 )
            {
             before(grammarAccess.getReal_ValueAccess().getGroup()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:388:1: ( rule__Real_Value__Group__0 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:388:2: rule__Real_Value__Group__0
            {
            pushFollow(FOLLOW_rule__Real_Value__Group__0_in_ruleReal_Value758);
            rule__Real_Value__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReal_ValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReal_Value"


    // $ANTLR start "entryRuleBit_Str_Literal"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:400:1: entryRuleBit_Str_Literal : ruleBit_Str_Literal EOF ;
    public final void entryRuleBit_Str_Literal() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:401:1: ( ruleBit_Str_Literal EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:402:1: ruleBit_Str_Literal EOF
            {
             before(grammarAccess.getBit_Str_LiteralRule()); 
            pushFollow(FOLLOW_ruleBit_Str_Literal_in_entryRuleBit_Str_Literal785);
            ruleBit_Str_Literal();

            state._fsp--;

             after(grammarAccess.getBit_Str_LiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBit_Str_Literal792); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBit_Str_Literal"


    // $ANTLR start "ruleBit_Str_Literal"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:409:1: ruleBit_Str_Literal : ( ( rule__Bit_Str_Literal__ValueAssignment ) ) ;
    public final void ruleBit_Str_Literal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:413:2: ( ( ( rule__Bit_Str_Literal__ValueAssignment ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:414:1: ( ( rule__Bit_Str_Literal__ValueAssignment ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:414:1: ( ( rule__Bit_Str_Literal__ValueAssignment ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:415:1: ( rule__Bit_Str_Literal__ValueAssignment )
            {
             before(grammarAccess.getBit_Str_LiteralAccess().getValueAssignment()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:416:1: ( rule__Bit_Str_Literal__ValueAssignment )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:416:2: rule__Bit_Str_Literal__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Bit_Str_Literal__ValueAssignment_in_ruleBit_Str_Literal818);
            rule__Bit_Str_Literal__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBit_Str_LiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBit_Str_Literal"


    // $ANTLR start "entryRuleMultibits_Type_Name"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:428:1: entryRuleMultibits_Type_Name : ruleMultibits_Type_Name EOF ;
    public final void entryRuleMultibits_Type_Name() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:429:1: ( ruleMultibits_Type_Name EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:430:1: ruleMultibits_Type_Name EOF
            {
             before(grammarAccess.getMultibits_Type_NameRule()); 
            pushFollow(FOLLOW_ruleMultibits_Type_Name_in_entryRuleMultibits_Type_Name845);
            ruleMultibits_Type_Name();

            state._fsp--;

             after(grammarAccess.getMultibits_Type_NameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultibits_Type_Name852); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultibits_Type_Name"


    // $ANTLR start "ruleMultibits_Type_Name"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:437:1: ruleMultibits_Type_Name : ( ( rule__Multibits_Type_Name__Alternatives ) ) ;
    public final void ruleMultibits_Type_Name() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:441:2: ( ( ( rule__Multibits_Type_Name__Alternatives ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:442:1: ( ( rule__Multibits_Type_Name__Alternatives ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:442:1: ( ( rule__Multibits_Type_Name__Alternatives ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:443:1: ( rule__Multibits_Type_Name__Alternatives )
            {
             before(grammarAccess.getMultibits_Type_NameAccess().getAlternatives()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:444:1: ( rule__Multibits_Type_Name__Alternatives )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:444:2: rule__Multibits_Type_Name__Alternatives
            {
            pushFollow(FOLLOW_rule__Multibits_Type_Name__Alternatives_in_ruleMultibits_Type_Name878);
            rule__Multibits_Type_Name__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultibits_Type_NameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultibits_Type_Name"


    // $ANTLR start "entryRuleBit_Str_Value"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:456:1: entryRuleBit_Str_Value : ruleBit_Str_Value EOF ;
    public final void entryRuleBit_Str_Value() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:457:1: ( ruleBit_Str_Value EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:458:1: ruleBit_Str_Value EOF
            {
             before(grammarAccess.getBit_Str_ValueRule()); 
            pushFollow(FOLLOW_ruleBit_Str_Value_in_entryRuleBit_Str_Value905);
            ruleBit_Str_Value();

            state._fsp--;

             after(grammarAccess.getBit_Str_ValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBit_Str_Value912); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBit_Str_Value"


    // $ANTLR start "ruleBit_Str_Value"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:465:1: ruleBit_Str_Value : ( ( rule__Bit_Str_Value__Group__0 ) ) ;
    public final void ruleBit_Str_Value() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:469:2: ( ( ( rule__Bit_Str_Value__Group__0 ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:470:1: ( ( rule__Bit_Str_Value__Group__0 ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:470:1: ( ( rule__Bit_Str_Value__Group__0 ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:471:1: ( rule__Bit_Str_Value__Group__0 )
            {
             before(grammarAccess.getBit_Str_ValueAccess().getGroup()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:472:1: ( rule__Bit_Str_Value__Group__0 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:472:2: rule__Bit_Str_Value__Group__0
            {
            pushFollow(FOLLOW_rule__Bit_Str_Value__Group__0_in_ruleBit_Str_Value938);
            rule__Bit_Str_Value__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBit_Str_ValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBit_Str_Value"


    // $ANTLR start "entryRuleBool_Literal"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:484:1: entryRuleBool_Literal : ruleBool_Literal EOF ;
    public final void entryRuleBool_Literal() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:485:1: ( ruleBool_Literal EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:486:1: ruleBool_Literal EOF
            {
             before(grammarAccess.getBool_LiteralRule()); 
            pushFollow(FOLLOW_ruleBool_Literal_in_entryRuleBool_Literal965);
            ruleBool_Literal();

            state._fsp--;

             after(grammarAccess.getBool_LiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBool_Literal972); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBool_Literal"


    // $ANTLR start "ruleBool_Literal"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:493:1: ruleBool_Literal : ( ( rule__Bool_Literal__ValueAssignment ) ) ;
    public final void ruleBool_Literal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:497:2: ( ( ( rule__Bool_Literal__ValueAssignment ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:498:1: ( ( rule__Bool_Literal__ValueAssignment ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:498:1: ( ( rule__Bool_Literal__ValueAssignment ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:499:1: ( rule__Bool_Literal__ValueAssignment )
            {
             before(grammarAccess.getBool_LiteralAccess().getValueAssignment()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:500:1: ( rule__Bool_Literal__ValueAssignment )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:500:2: rule__Bool_Literal__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Bool_Literal__ValueAssignment_in_ruleBool_Literal998);
            rule__Bool_Literal__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBool_LiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBool_Literal"


    // $ANTLR start "entryRuleBool_Value"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:512:1: entryRuleBool_Value : ruleBool_Value EOF ;
    public final void entryRuleBool_Value() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:513:1: ( ruleBool_Value EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:514:1: ruleBool_Value EOF
            {
             before(grammarAccess.getBool_ValueRule()); 
            pushFollow(FOLLOW_ruleBool_Value_in_entryRuleBool_Value1025);
            ruleBool_Value();

            state._fsp--;

             after(grammarAccess.getBool_ValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBool_Value1032); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBool_Value"


    // $ANTLR start "ruleBool_Value"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:521:1: ruleBool_Value : ( ( rule__Bool_Value__Group__0 ) ) ;
    public final void ruleBool_Value() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:525:2: ( ( ( rule__Bool_Value__Group__0 ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:526:1: ( ( rule__Bool_Value__Group__0 ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:526:1: ( ( rule__Bool_Value__Group__0 ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:527:1: ( rule__Bool_Value__Group__0 )
            {
             before(grammarAccess.getBool_ValueAccess().getGroup()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:528:1: ( rule__Bool_Value__Group__0 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:528:2: rule__Bool_Value__Group__0
            {
            pushFollow(FOLLOW_rule__Bool_Value__Group__0_in_ruleBool_Value1058);
            rule__Bool_Value__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBool_ValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBool_Value"


    // $ANTLR start "entryRuleBool_Type_Name"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:540:1: entryRuleBool_Type_Name : ruleBool_Type_Name EOF ;
    public final void entryRuleBool_Type_Name() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:541:1: ( ruleBool_Type_Name EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:542:1: ruleBool_Type_Name EOF
            {
             before(grammarAccess.getBool_Type_NameRule()); 
            pushFollow(FOLLOW_ruleBool_Type_Name_in_entryRuleBool_Type_Name1085);
            ruleBool_Type_Name();

            state._fsp--;

             after(grammarAccess.getBool_Type_NameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBool_Type_Name1092); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBool_Type_Name"


    // $ANTLR start "ruleBool_Type_Name"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:549:1: ruleBool_Type_Name : ( 'BOOL' ) ;
    public final void ruleBool_Type_Name() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:553:2: ( ( 'BOOL' ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:554:1: ( 'BOOL' )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:554:1: ( 'BOOL' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:555:1: 'BOOL'
            {
             before(grammarAccess.getBool_Type_NameAccess().getBOOLKeyword()); 
            match(input,36,FOLLOW_36_in_ruleBool_Type_Name1119); 
             after(grammarAccess.getBool_Type_NameAccess().getBOOLKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBool_Type_Name"


    // $ANTLR start "entryRuleChar_Literal"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:570:1: entryRuleChar_Literal : ruleChar_Literal EOF ;
    public final void entryRuleChar_Literal() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:571:1: ( ruleChar_Literal EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:572:1: ruleChar_Literal EOF
            {
             before(grammarAccess.getChar_LiteralRule()); 
            pushFollow(FOLLOW_ruleChar_Literal_in_entryRuleChar_Literal1147);
            ruleChar_Literal();

            state._fsp--;

             after(grammarAccess.getChar_LiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChar_Literal1154); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChar_Literal"


    // $ANTLR start "ruleChar_Literal"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:579:1: ruleChar_Literal : ( ( rule__Char_Literal__ValueAssignment ) ) ;
    public final void ruleChar_Literal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:583:2: ( ( ( rule__Char_Literal__ValueAssignment ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:584:1: ( ( rule__Char_Literal__ValueAssignment ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:584:1: ( ( rule__Char_Literal__ValueAssignment ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:585:1: ( rule__Char_Literal__ValueAssignment )
            {
             before(grammarAccess.getChar_LiteralAccess().getValueAssignment()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:586:1: ( rule__Char_Literal__ValueAssignment )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:586:2: rule__Char_Literal__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Char_Literal__ValueAssignment_in_ruleChar_Literal1180);
            rule__Char_Literal__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getChar_LiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChar_Literal"


    // $ANTLR start "entryRuleChar_Value"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:598:1: entryRuleChar_Value : ruleChar_Value EOF ;
    public final void entryRuleChar_Value() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:599:1: ( ruleChar_Value EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:600:1: ruleChar_Value EOF
            {
             before(grammarAccess.getChar_ValueRule()); 
            pushFollow(FOLLOW_ruleChar_Value_in_entryRuleChar_Value1207);
            ruleChar_Value();

            state._fsp--;

             after(grammarAccess.getChar_ValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChar_Value1214); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChar_Value"


    // $ANTLR start "ruleChar_Value"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:607:1: ruleChar_Value : ( ( rule__Char_Value__Group__0 ) ) ;
    public final void ruleChar_Value() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:611:2: ( ( ( rule__Char_Value__Group__0 ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:612:1: ( ( rule__Char_Value__Group__0 ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:612:1: ( ( rule__Char_Value__Group__0 ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:613:1: ( rule__Char_Value__Group__0 )
            {
             before(grammarAccess.getChar_ValueAccess().getGroup()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:614:1: ( rule__Char_Value__Group__0 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:614:2: rule__Char_Value__Group__0
            {
            pushFollow(FOLLOW_rule__Char_Value__Group__0_in_ruleChar_Value1240);
            rule__Char_Value__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChar_ValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChar_Value"


    // $ANTLR start "entryRuleChar_Str"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:626:1: entryRuleChar_Str : ruleChar_Str EOF ;
    public final void entryRuleChar_Str() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:627:1: ( ruleChar_Str EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:628:1: ruleChar_Str EOF
            {
             before(grammarAccess.getChar_StrRule()); 
            pushFollow(FOLLOW_ruleChar_Str_in_entryRuleChar_Str1267);
            ruleChar_Str();

            state._fsp--;

             after(grammarAccess.getChar_StrRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChar_Str1274); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChar_Str"


    // $ANTLR start "ruleChar_Str"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:635:1: ruleChar_Str : ( ( rule__Char_Str__Alternatives ) ) ;
    public final void ruleChar_Str() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:639:2: ( ( ( rule__Char_Str__Alternatives ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:640:1: ( ( rule__Char_Str__Alternatives ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:640:1: ( ( rule__Char_Str__Alternatives ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:641:1: ( rule__Char_Str__Alternatives )
            {
             before(grammarAccess.getChar_StrAccess().getAlternatives()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:642:1: ( rule__Char_Str__Alternatives )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:642:2: rule__Char_Str__Alternatives
            {
            pushFollow(FOLLOW_rule__Char_Str__Alternatives_in_ruleChar_Str1300);
            rule__Char_Str__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getChar_StrAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChar_Str"


    // $ANTLR start "entryRuleS_Byte_Char_Str"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:654:1: entryRuleS_Byte_Char_Str : ruleS_Byte_Char_Str EOF ;
    public final void entryRuleS_Byte_Char_Str() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:655:1: ( ruleS_Byte_Char_Str EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:656:1: ruleS_Byte_Char_Str EOF
            {
             before(grammarAccess.getS_Byte_Char_StrRule()); 
            pushFollow(FOLLOW_ruleS_Byte_Char_Str_in_entryRuleS_Byte_Char_Str1327);
            ruleS_Byte_Char_Str();

            state._fsp--;

             after(grammarAccess.getS_Byte_Char_StrRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleS_Byte_Char_Str1334); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleS_Byte_Char_Str"


    // $ANTLR start "ruleS_Byte_Char_Str"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:663:1: ruleS_Byte_Char_Str : ( ( rule__S_Byte_Char_Str__Group__0 ) ) ;
    public final void ruleS_Byte_Char_Str() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:667:2: ( ( ( rule__S_Byte_Char_Str__Group__0 ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:668:1: ( ( rule__S_Byte_Char_Str__Group__0 ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:668:1: ( ( rule__S_Byte_Char_Str__Group__0 ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:669:1: ( rule__S_Byte_Char_Str__Group__0 )
            {
             before(grammarAccess.getS_Byte_Char_StrAccess().getGroup()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:670:1: ( rule__S_Byte_Char_Str__Group__0 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:670:2: rule__S_Byte_Char_Str__Group__0
            {
            pushFollow(FOLLOW_rule__S_Byte_Char_Str__Group__0_in_ruleS_Byte_Char_Str1360);
            rule__S_Byte_Char_Str__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getS_Byte_Char_StrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleS_Byte_Char_Str"


    // $ANTLR start "entryRuleD_Byte_Char_Str"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:682:1: entryRuleD_Byte_Char_Str : ruleD_Byte_Char_Str EOF ;
    public final void entryRuleD_Byte_Char_Str() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:683:1: ( ruleD_Byte_Char_Str EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:684:1: ruleD_Byte_Char_Str EOF
            {
             before(grammarAccess.getD_Byte_Char_StrRule()); 
            pushFollow(FOLLOW_ruleD_Byte_Char_Str_in_entryRuleD_Byte_Char_Str1387);
            ruleD_Byte_Char_Str();

            state._fsp--;

             after(grammarAccess.getD_Byte_Char_StrRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleD_Byte_Char_Str1394); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleD_Byte_Char_Str"


    // $ANTLR start "ruleD_Byte_Char_Str"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:691:1: ruleD_Byte_Char_Str : ( ( rule__D_Byte_Char_Str__Group__0 ) ) ;
    public final void ruleD_Byte_Char_Str() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:695:2: ( ( ( rule__D_Byte_Char_Str__Group__0 ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:696:1: ( ( rule__D_Byte_Char_Str__Group__0 ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:696:1: ( ( rule__D_Byte_Char_Str__Group__0 ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:697:1: ( rule__D_Byte_Char_Str__Group__0 )
            {
             before(grammarAccess.getD_Byte_Char_StrAccess().getGroup()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:698:1: ( rule__D_Byte_Char_Str__Group__0 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:698:2: rule__D_Byte_Char_Str__Group__0
            {
            pushFollow(FOLLOW_rule__D_Byte_Char_Str__Group__0_in_ruleD_Byte_Char_Str1420);
            rule__D_Byte_Char_Str__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getD_Byte_Char_StrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleD_Byte_Char_Str"


    // $ANTLR start "entryRuleTime_Type_Name"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:710:1: entryRuleTime_Type_Name : ruleTime_Type_Name EOF ;
    public final void entryRuleTime_Type_Name() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:711:1: ( ruleTime_Type_Name EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:712:1: ruleTime_Type_Name EOF
            {
             before(grammarAccess.getTime_Type_NameRule()); 
            pushFollow(FOLLOW_ruleTime_Type_Name_in_entryRuleTime_Type_Name1447);
            ruleTime_Type_Name();

            state._fsp--;

             after(grammarAccess.getTime_Type_NameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTime_Type_Name1454); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTime_Type_Name"


    // $ANTLR start "ruleTime_Type_Name"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:719:1: ruleTime_Type_Name : ( ( rule__Time_Type_Name__Alternatives ) ) ;
    public final void ruleTime_Type_Name() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:723:2: ( ( ( rule__Time_Type_Name__Alternatives ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:724:1: ( ( rule__Time_Type_Name__Alternatives ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:724:1: ( ( rule__Time_Type_Name__Alternatives ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:725:1: ( rule__Time_Type_Name__Alternatives )
            {
             before(grammarAccess.getTime_Type_NameAccess().getAlternatives()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:726:1: ( rule__Time_Type_Name__Alternatives )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:726:2: rule__Time_Type_Name__Alternatives
            {
            pushFollow(FOLLOW_rule__Time_Type_Name__Alternatives_in_ruleTime_Type_Name1480);
            rule__Time_Type_Name__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTime_Type_NameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTime_Type_Name"


    // $ANTLR start "entryRuleTod_Type_Name"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:738:1: entryRuleTod_Type_Name : ruleTod_Type_Name EOF ;
    public final void entryRuleTod_Type_Name() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:739:1: ( ruleTod_Type_Name EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:740:1: ruleTod_Type_Name EOF
            {
             before(grammarAccess.getTod_Type_NameRule()); 
            pushFollow(FOLLOW_ruleTod_Type_Name_in_entryRuleTod_Type_Name1507);
            ruleTod_Type_Name();

            state._fsp--;

             after(grammarAccess.getTod_Type_NameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTod_Type_Name1514); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTod_Type_Name"


    // $ANTLR start "ruleTod_Type_Name"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:747:1: ruleTod_Type_Name : ( ( rule__Tod_Type_Name__Alternatives ) ) ;
    public final void ruleTod_Type_Name() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:751:2: ( ( ( rule__Tod_Type_Name__Alternatives ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:752:1: ( ( rule__Tod_Type_Name__Alternatives ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:752:1: ( ( rule__Tod_Type_Name__Alternatives ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:753:1: ( rule__Tod_Type_Name__Alternatives )
            {
             before(grammarAccess.getTod_Type_NameAccess().getAlternatives()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:754:1: ( rule__Tod_Type_Name__Alternatives )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:754:2: rule__Tod_Type_Name__Alternatives
            {
            pushFollow(FOLLOW_rule__Tod_Type_Name__Alternatives_in_ruleTod_Type_Name1540);
            rule__Tod_Type_Name__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTod_Type_NameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTod_Type_Name"


    // $ANTLR start "entryRuleTime_Literal"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:770:1: entryRuleTime_Literal : ruleTime_Literal EOF ;
    public final void entryRuleTime_Literal() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:771:1: ( ruleTime_Literal EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:772:1: ruleTime_Literal EOF
            {
             before(grammarAccess.getTime_LiteralRule()); 
            pushFollow(FOLLOW_ruleTime_Literal_in_entryRuleTime_Literal1571);
            ruleTime_Literal();

            state._fsp--;

             after(grammarAccess.getTime_LiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTime_Literal1578); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTime_Literal"


    // $ANTLR start "ruleTime_Literal"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:779:1: ruleTime_Literal : ( ( rule__Time_Literal__Alternatives ) ) ;
    public final void ruleTime_Literal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:783:2: ( ( ( rule__Time_Literal__Alternatives ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:784:1: ( ( rule__Time_Literal__Alternatives ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:784:1: ( ( rule__Time_Literal__Alternatives ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:785:1: ( rule__Time_Literal__Alternatives )
            {
             before(grammarAccess.getTime_LiteralAccess().getAlternatives()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:786:1: ( rule__Time_Literal__Alternatives )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:786:2: rule__Time_Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Time_Literal__Alternatives_in_ruleTime_Literal1604);
            rule__Time_Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTime_LiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTime_Literal"


    // $ANTLR start "entryRuleDuration"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:798:1: entryRuleDuration : ruleDuration EOF ;
    public final void entryRuleDuration() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:799:1: ( ruleDuration EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:800:1: ruleDuration EOF
            {
             before(grammarAccess.getDurationRule()); 
            pushFollow(FOLLOW_ruleDuration_in_entryRuleDuration1631);
            ruleDuration();

            state._fsp--;

             after(grammarAccess.getDurationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDuration1638); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDuration"


    // $ANTLR start "ruleDuration"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:807:1: ruleDuration : ( ( rule__Duration__ValueAssignment ) ) ;
    public final void ruleDuration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:811:2: ( ( ( rule__Duration__ValueAssignment ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:812:1: ( ( rule__Duration__ValueAssignment ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:812:1: ( ( rule__Duration__ValueAssignment ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:813:1: ( rule__Duration__ValueAssignment )
            {
             before(grammarAccess.getDurationAccess().getValueAssignment()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:814:1: ( rule__Duration__ValueAssignment )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:814:2: rule__Duration__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Duration__ValueAssignment_in_ruleDuration1664);
            rule__Duration__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDurationAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDuration"


    // $ANTLR start "entryRuleDuration_Value"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:826:1: entryRuleDuration_Value : ruleDuration_Value EOF ;
    public final void entryRuleDuration_Value() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:827:1: ( ruleDuration_Value EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:828:1: ruleDuration_Value EOF
            {
             before(grammarAccess.getDuration_ValueRule()); 
            pushFollow(FOLLOW_ruleDuration_Value_in_entryRuleDuration_Value1691);
            ruleDuration_Value();

            state._fsp--;

             after(grammarAccess.getDuration_ValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDuration_Value1698); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDuration_Value"


    // $ANTLR start "ruleDuration_Value"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:835:1: ruleDuration_Value : ( ( rule__Duration_Value__Group__0 ) ) ;
    public final void ruleDuration_Value() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:839:2: ( ( ( rule__Duration_Value__Group__0 ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:840:1: ( ( rule__Duration_Value__Group__0 ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:840:1: ( ( rule__Duration_Value__Group__0 ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:841:1: ( rule__Duration_Value__Group__0 )
            {
             before(grammarAccess.getDuration_ValueAccess().getGroup()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:842:1: ( rule__Duration_Value__Group__0 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:842:2: rule__Duration_Value__Group__0
            {
            pushFollow(FOLLOW_rule__Duration_Value__Group__0_in_ruleDuration_Value1724);
            rule__Duration_Value__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDuration_ValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDuration_Value"


    // $ANTLR start "entryRuleTime_Of_Day"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:854:1: entryRuleTime_Of_Day : ruleTime_Of_Day EOF ;
    public final void entryRuleTime_Of_Day() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:855:1: ( ruleTime_Of_Day EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:856:1: ruleTime_Of_Day EOF
            {
             before(grammarAccess.getTime_Of_DayRule()); 
            pushFollow(FOLLOW_ruleTime_Of_Day_in_entryRuleTime_Of_Day1751);
            ruleTime_Of_Day();

            state._fsp--;

             after(grammarAccess.getTime_Of_DayRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTime_Of_Day1758); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTime_Of_Day"


    // $ANTLR start "ruleTime_Of_Day"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:863:1: ruleTime_Of_Day : ( ( rule__Time_Of_Day__ValueAssignment ) ) ;
    public final void ruleTime_Of_Day() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:867:2: ( ( ( rule__Time_Of_Day__ValueAssignment ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:868:1: ( ( rule__Time_Of_Day__ValueAssignment ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:868:1: ( ( rule__Time_Of_Day__ValueAssignment ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:869:1: ( rule__Time_Of_Day__ValueAssignment )
            {
             before(grammarAccess.getTime_Of_DayAccess().getValueAssignment()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:870:1: ( rule__Time_Of_Day__ValueAssignment )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:870:2: rule__Time_Of_Day__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Time_Of_Day__ValueAssignment_in_ruleTime_Of_Day1784);
            rule__Time_Of_Day__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTime_Of_DayAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTime_Of_Day"


    // $ANTLR start "entryRuleTime_Of_Day_Value"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:882:1: entryRuleTime_Of_Day_Value : ruleTime_Of_Day_Value EOF ;
    public final void entryRuleTime_Of_Day_Value() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:883:1: ( ruleTime_Of_Day_Value EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:884:1: ruleTime_Of_Day_Value EOF
            {
             before(grammarAccess.getTime_Of_Day_ValueRule()); 
            pushFollow(FOLLOW_ruleTime_Of_Day_Value_in_entryRuleTime_Of_Day_Value1811);
            ruleTime_Of_Day_Value();

            state._fsp--;

             after(grammarAccess.getTime_Of_Day_ValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTime_Of_Day_Value1818); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTime_Of_Day_Value"


    // $ANTLR start "ruleTime_Of_Day_Value"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:891:1: ruleTime_Of_Day_Value : ( ( rule__Time_Of_Day_Value__Group__0 ) ) ;
    public final void ruleTime_Of_Day_Value() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:895:2: ( ( ( rule__Time_Of_Day_Value__Group__0 ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:896:1: ( ( rule__Time_Of_Day_Value__Group__0 ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:896:1: ( ( rule__Time_Of_Day_Value__Group__0 ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:897:1: ( rule__Time_Of_Day_Value__Group__0 )
            {
             before(grammarAccess.getTime_Of_Day_ValueAccess().getGroup()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:898:1: ( rule__Time_Of_Day_Value__Group__0 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:898:2: rule__Time_Of_Day_Value__Group__0
            {
            pushFollow(FOLLOW_rule__Time_Of_Day_Value__Group__0_in_ruleTime_Of_Day_Value1844);
            rule__Time_Of_Day_Value__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTime_Of_Day_ValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTime_Of_Day_Value"


    // $ANTLR start "entryRuleDate"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:912:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:913:1: ( ruleDate EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:914:1: ruleDate EOF
            {
             before(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_ruleDate_in_entryRuleDate1873);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDate1880); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:921:1: ruleDate : ( ( rule__Date__ValueAssignment ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:925:2: ( ( ( rule__Date__ValueAssignment ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:926:1: ( ( rule__Date__ValueAssignment ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:926:1: ( ( rule__Date__ValueAssignment ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:927:1: ( rule__Date__ValueAssignment )
            {
             before(grammarAccess.getDateAccess().getValueAssignment()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:928:1: ( rule__Date__ValueAssignment )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:928:2: rule__Date__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Date__ValueAssignment_in_ruleDate1906);
            rule__Date__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleDate_And_Time"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:940:1: entryRuleDate_And_Time : ruleDate_And_Time EOF ;
    public final void entryRuleDate_And_Time() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:941:1: ( ruleDate_And_Time EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:942:1: ruleDate_And_Time EOF
            {
             before(grammarAccess.getDate_And_TimeRule()); 
            pushFollow(FOLLOW_ruleDate_And_Time_in_entryRuleDate_And_Time1933);
            ruleDate_And_Time();

            state._fsp--;

             after(grammarAccess.getDate_And_TimeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDate_And_Time1940); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDate_And_Time"


    // $ANTLR start "ruleDate_And_Time"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:949:1: ruleDate_And_Time : ( ( rule__Date_And_Time__ValueAssignment ) ) ;
    public final void ruleDate_And_Time() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:953:2: ( ( ( rule__Date_And_Time__ValueAssignment ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:954:1: ( ( rule__Date_And_Time__ValueAssignment ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:954:1: ( ( rule__Date_And_Time__ValueAssignment ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:955:1: ( rule__Date_And_Time__ValueAssignment )
            {
             before(grammarAccess.getDate_And_TimeAccess().getValueAssignment()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:956:1: ( rule__Date_And_Time__ValueAssignment )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:956:2: rule__Date_And_Time__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Date_And_Time__ValueAssignment_in_ruleDate_And_Time1966);
            rule__Date_And_Time__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDate_And_TimeAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDate_And_Time"


    // $ANTLR start "entryRuleDate_And_Time_Value"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:968:1: entryRuleDate_And_Time_Value : ruleDate_And_Time_Value EOF ;
    public final void entryRuleDate_And_Time_Value() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:969:1: ( ruleDate_And_Time_Value EOF )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:970:1: ruleDate_And_Time_Value EOF
            {
             before(grammarAccess.getDate_And_Time_ValueRule()); 
            pushFollow(FOLLOW_ruleDate_And_Time_Value_in_entryRuleDate_And_Time_Value1993);
            ruleDate_And_Time_Value();

            state._fsp--;

             after(grammarAccess.getDate_And_Time_ValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDate_And_Time_Value2000); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDate_And_Time_Value"


    // $ANTLR start "ruleDate_And_Time_Value"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:977:1: ruleDate_And_Time_Value : ( ( rule__Date_And_Time_Value__Group__0 ) ) ;
    public final void ruleDate_And_Time_Value() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:981:2: ( ( ( rule__Date_And_Time_Value__Group__0 ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:982:1: ( ( rule__Date_And_Time_Value__Group__0 ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:982:1: ( ( rule__Date_And_Time_Value__Group__0 ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:983:1: ( rule__Date_And_Time_Value__Group__0 )
            {
             before(grammarAccess.getDate_And_Time_ValueAccess().getGroup()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:984:1: ( rule__Date_And_Time_Value__Group__0 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:984:2: rule__Date_And_Time_Value__Group__0
            {
            pushFollow(FOLLOW_rule__Date_And_Time_Value__Group__0_in_ruleDate_And_Time_Value2026);
            rule__Date_And_Time_Value__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDate_And_Time_ValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDate_And_Time_Value"


    // $ANTLR start "rule__Numeric_Literal__Alternatives"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:997:1: rule__Numeric_Literal__Alternatives : ( ( ruleInt_Literal ) | ( ruleReal_Literal ) );
    public final void rule__Numeric_Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1001:1: ( ( ruleInt_Literal ) | ( ruleReal_Literal ) )
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
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1002:1: ( ruleInt_Literal )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1002:1: ( ruleInt_Literal )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1003:1: ruleInt_Literal
                    {
                     before(grammarAccess.getNumeric_LiteralAccess().getInt_LiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInt_Literal_in_rule__Numeric_Literal__Alternatives2063);
                    ruleInt_Literal();

                    state._fsp--;

                     after(grammarAccess.getNumeric_LiteralAccess().getInt_LiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1008:6: ( ruleReal_Literal )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1008:6: ( ruleReal_Literal )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1009:1: ruleReal_Literal
                    {
                     before(grammarAccess.getNumeric_LiteralAccess().getReal_LiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleReal_Literal_in_rule__Numeric_Literal__Alternatives2080);
                    ruleReal_Literal();

                    state._fsp--;

                     after(grammarAccess.getNumeric_LiteralAccess().getReal_LiteralParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numeric_Literal__Alternatives"


    // $ANTLR start "rule__Int_Literal__Alternatives"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1019:1: rule__Int_Literal__Alternatives : ( ( ruleSigned_Int ) | ( ruleUnsigned_Int ) );
    public final void rule__Int_Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1023:1: ( ( ruleSigned_Int ) | ( ruleUnsigned_Int ) )
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
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1024:1: ( ruleSigned_Int )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1024:1: ( ruleSigned_Int )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1025:1: ruleSigned_Int
                    {
                     before(grammarAccess.getInt_LiteralAccess().getSigned_IntParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSigned_Int_in_rule__Int_Literal__Alternatives2112);
                    ruleSigned_Int();

                    state._fsp--;

                     after(grammarAccess.getInt_LiteralAccess().getSigned_IntParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1030:6: ( ruleUnsigned_Int )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1030:6: ( ruleUnsigned_Int )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1031:1: ruleUnsigned_Int
                    {
                     before(grammarAccess.getInt_LiteralAccess().getUnsigned_IntParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleUnsigned_Int_in_rule__Int_Literal__Alternatives2129);
                    ruleUnsigned_Int();

                    state._fsp--;

                     after(grammarAccess.getInt_LiteralAccess().getUnsigned_IntParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int_Literal__Alternatives"


    // $ANTLR start "rule__Unsigned_Int_Type_Name__Alternatives"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1042:1: rule__Unsigned_Int_Type_Name__Alternatives : ( ( 'USINT' ) | ( 'UINT' ) | ( 'UDINT' ) | ( 'ULINT' ) );
    public final void rule__Unsigned_Int_Type_Name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1046:1: ( ( 'USINT' ) | ( 'UINT' ) | ( 'UDINT' ) | ( 'ULINT' ) )
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
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1047:1: ( 'USINT' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1047:1: ( 'USINT' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1048:1: 'USINT'
                    {
                     before(grammarAccess.getUnsigned_Int_Type_NameAccess().getUSINTKeyword_0()); 
                    match(input,37,FOLLOW_37_in_rule__Unsigned_Int_Type_Name__Alternatives2163); 
                     after(grammarAccess.getUnsigned_Int_Type_NameAccess().getUSINTKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1055:6: ( 'UINT' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1055:6: ( 'UINT' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1056:1: 'UINT'
                    {
                     before(grammarAccess.getUnsigned_Int_Type_NameAccess().getUINTKeyword_1()); 
                    match(input,38,FOLLOW_38_in_rule__Unsigned_Int_Type_Name__Alternatives2183); 
                     after(grammarAccess.getUnsigned_Int_Type_NameAccess().getUINTKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1063:6: ( 'UDINT' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1063:6: ( 'UDINT' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1064:1: 'UDINT'
                    {
                     before(grammarAccess.getUnsigned_Int_Type_NameAccess().getUDINTKeyword_2()); 
                    match(input,39,FOLLOW_39_in_rule__Unsigned_Int_Type_Name__Alternatives2203); 
                     after(grammarAccess.getUnsigned_Int_Type_NameAccess().getUDINTKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1071:6: ( 'ULINT' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1071:6: ( 'ULINT' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1072:1: 'ULINT'
                    {
                     before(grammarAccess.getUnsigned_Int_Type_NameAccess().getULINTKeyword_3()); 
                    match(input,40,FOLLOW_40_in_rule__Unsigned_Int_Type_Name__Alternatives2223); 
                     after(grammarAccess.getUnsigned_Int_Type_NameAccess().getULINTKeyword_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unsigned_Int_Type_Name__Alternatives"


    // $ANTLR start "rule__Signed_Int_Type_Name__Alternatives"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1084:1: rule__Signed_Int_Type_Name__Alternatives : ( ( 'SINT' ) | ( 'INT' ) | ( 'DINT' ) | ( 'LINT' ) );
    public final void rule__Signed_Int_Type_Name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1088:1: ( ( 'SINT' ) | ( 'INT' ) | ( 'DINT' ) | ( 'LINT' ) )
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
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1089:1: ( 'SINT' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1089:1: ( 'SINT' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1090:1: 'SINT'
                    {
                     before(grammarAccess.getSigned_Int_Type_NameAccess().getSINTKeyword_0()); 
                    match(input,41,FOLLOW_41_in_rule__Signed_Int_Type_Name__Alternatives2258); 
                     after(grammarAccess.getSigned_Int_Type_NameAccess().getSINTKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1097:6: ( 'INT' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1097:6: ( 'INT' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1098:1: 'INT'
                    {
                     before(grammarAccess.getSigned_Int_Type_NameAccess().getINTKeyword_1()); 
                    match(input,42,FOLLOW_42_in_rule__Signed_Int_Type_Name__Alternatives2278); 
                     after(grammarAccess.getSigned_Int_Type_NameAccess().getINTKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1105:6: ( 'DINT' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1105:6: ( 'DINT' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1106:1: 'DINT'
                    {
                     before(grammarAccess.getSigned_Int_Type_NameAccess().getDINTKeyword_2()); 
                    match(input,43,FOLLOW_43_in_rule__Signed_Int_Type_Name__Alternatives2298); 
                     after(grammarAccess.getSigned_Int_Type_NameAccess().getDINTKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1113:6: ( 'LINT' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1113:6: ( 'LINT' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1114:1: 'LINT'
                    {
                     before(grammarAccess.getSigned_Int_Type_NameAccess().getLINTKeyword_3()); 
                    match(input,44,FOLLOW_44_in_rule__Signed_Int_Type_Name__Alternatives2318); 
                     after(grammarAccess.getSigned_Int_Type_NameAccess().getLINTKeyword_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signed_Int_Type_Name__Alternatives"


    // $ANTLR start "rule__Unsigned_Int_Value__Alternatives_1"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1126:1: rule__Unsigned_Int_Value__Alternatives_1 : ( ( RULE_BIN_VALUE ) | ( RULE_OCT_VALUE ) | ( RULE_DEC_VALUE ) | ( RULE_HEX_VALUE ) );
    public final void rule__Unsigned_Int_Value__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1130:1: ( ( RULE_BIN_VALUE ) | ( RULE_OCT_VALUE ) | ( RULE_DEC_VALUE ) | ( RULE_HEX_VALUE ) )
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
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1131:1: ( RULE_BIN_VALUE )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1131:1: ( RULE_BIN_VALUE )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1132:1: RULE_BIN_VALUE
                    {
                     before(grammarAccess.getUnsigned_Int_ValueAccess().getBIN_VALUETerminalRuleCall_1_0()); 
                    match(input,RULE_BIN_VALUE,FOLLOW_RULE_BIN_VALUE_in_rule__Unsigned_Int_Value__Alternatives_12352); 
                     after(grammarAccess.getUnsigned_Int_ValueAccess().getBIN_VALUETerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1137:6: ( RULE_OCT_VALUE )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1137:6: ( RULE_OCT_VALUE )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1138:1: RULE_OCT_VALUE
                    {
                     before(grammarAccess.getUnsigned_Int_ValueAccess().getOCT_VALUETerminalRuleCall_1_1()); 
                    match(input,RULE_OCT_VALUE,FOLLOW_RULE_OCT_VALUE_in_rule__Unsigned_Int_Value__Alternatives_12369); 
                     after(grammarAccess.getUnsigned_Int_ValueAccess().getOCT_VALUETerminalRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1143:6: ( RULE_DEC_VALUE )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1143:6: ( RULE_DEC_VALUE )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1144:1: RULE_DEC_VALUE
                    {
                     before(grammarAccess.getUnsigned_Int_ValueAccess().getDEC_VALUETerminalRuleCall_1_2()); 
                    match(input,RULE_DEC_VALUE,FOLLOW_RULE_DEC_VALUE_in_rule__Unsigned_Int_Value__Alternatives_12386); 
                     after(grammarAccess.getUnsigned_Int_ValueAccess().getDEC_VALUETerminalRuleCall_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1149:6: ( RULE_HEX_VALUE )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1149:6: ( RULE_HEX_VALUE )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1150:1: RULE_HEX_VALUE
                    {
                     before(grammarAccess.getUnsigned_Int_ValueAccess().getHEX_VALUETerminalRuleCall_1_3()); 
                    match(input,RULE_HEX_VALUE,FOLLOW_RULE_HEX_VALUE_in_rule__Unsigned_Int_Value__Alternatives_12403); 
                     after(grammarAccess.getUnsigned_Int_ValueAccess().getHEX_VALUETerminalRuleCall_1_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unsigned_Int_Value__Alternatives_1"


    // $ANTLR start "rule__Signed_Int_Value__Alternatives_1"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1160:1: rule__Signed_Int_Value__Alternatives_1 : ( ( RULE_BIN_VALUE ) | ( RULE_OCT_VALUE ) | ( ( rule__Signed_Int_Value__Group_1_2__0 ) ) | ( RULE_HEX_VALUE ) );
    public final void rule__Signed_Int_Value__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1164:1: ( ( RULE_BIN_VALUE ) | ( RULE_OCT_VALUE ) | ( ( rule__Signed_Int_Value__Group_1_2__0 ) ) | ( RULE_HEX_VALUE ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_BIN_VALUE:
                {
                alt6=1;
                }
                break;
            case RULE_OCT_VALUE:
                {
                alt6=2;
                }
                break;
            case RULE_DEC_VALUE:
            case 45:
            case 46:
                {
                alt6=3;
                }
                break;
            case RULE_HEX_VALUE:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1165:1: ( RULE_BIN_VALUE )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1165:1: ( RULE_BIN_VALUE )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1166:1: RULE_BIN_VALUE
                    {
                     before(grammarAccess.getSigned_Int_ValueAccess().getBIN_VALUETerminalRuleCall_1_0()); 
                    match(input,RULE_BIN_VALUE,FOLLOW_RULE_BIN_VALUE_in_rule__Signed_Int_Value__Alternatives_12435); 
                     after(grammarAccess.getSigned_Int_ValueAccess().getBIN_VALUETerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1171:6: ( RULE_OCT_VALUE )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1171:6: ( RULE_OCT_VALUE )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1172:1: RULE_OCT_VALUE
                    {
                     before(grammarAccess.getSigned_Int_ValueAccess().getOCT_VALUETerminalRuleCall_1_1()); 
                    match(input,RULE_OCT_VALUE,FOLLOW_RULE_OCT_VALUE_in_rule__Signed_Int_Value__Alternatives_12452); 
                     after(grammarAccess.getSigned_Int_ValueAccess().getOCT_VALUETerminalRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1177:6: ( ( rule__Signed_Int_Value__Group_1_2__0 ) )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1177:6: ( ( rule__Signed_Int_Value__Group_1_2__0 ) )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1178:1: ( rule__Signed_Int_Value__Group_1_2__0 )
                    {
                     before(grammarAccess.getSigned_Int_ValueAccess().getGroup_1_2()); 
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1179:1: ( rule__Signed_Int_Value__Group_1_2__0 )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1179:2: rule__Signed_Int_Value__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__Signed_Int_Value__Group_1_2__0_in_rule__Signed_Int_Value__Alternatives_12469);
                    rule__Signed_Int_Value__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSigned_Int_ValueAccess().getGroup_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1183:6: ( RULE_HEX_VALUE )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1183:6: ( RULE_HEX_VALUE )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1184:1: RULE_HEX_VALUE
                    {
                     before(grammarAccess.getSigned_Int_ValueAccess().getHEX_VALUETerminalRuleCall_1_3()); 
                    match(input,RULE_HEX_VALUE,FOLLOW_RULE_HEX_VALUE_in_rule__Signed_Int_Value__Alternatives_12487); 
                     after(grammarAccess.getSigned_Int_ValueAccess().getHEX_VALUETerminalRuleCall_1_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signed_Int_Value__Alternatives_1"


    // $ANTLR start "rule__Signed_Int_Value__Alternatives_1_2_0"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1194:1: rule__Signed_Int_Value__Alternatives_1_2_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Signed_Int_Value__Alternatives_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1198:1: ( ( '+' ) | ( '-' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==45) ) {
                alt7=1;
            }
            else if ( (LA7_0==46) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1199:1: ( '+' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1199:1: ( '+' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1200:1: '+'
                    {
                     before(grammarAccess.getSigned_Int_ValueAccess().getPlusSignKeyword_1_2_0_0()); 
                    match(input,45,FOLLOW_45_in_rule__Signed_Int_Value__Alternatives_1_2_02520); 
                     after(grammarAccess.getSigned_Int_ValueAccess().getPlusSignKeyword_1_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1207:6: ( '-' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1207:6: ( '-' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1208:1: '-'
                    {
                     before(grammarAccess.getSigned_Int_ValueAccess().getHyphenMinusKeyword_1_2_0_1()); 
                    match(input,46,FOLLOW_46_in_rule__Signed_Int_Value__Alternatives_1_2_02540); 
                     after(grammarAccess.getSigned_Int_ValueAccess().getHyphenMinusKeyword_1_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signed_Int_Value__Alternatives_1_2_0"


    // $ANTLR start "rule__Real_Type_Name__Alternatives"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1220:1: rule__Real_Type_Name__Alternatives : ( ( 'LREAL' ) | ( 'REAL' ) );
    public final void rule__Real_Type_Name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1224:1: ( ( 'LREAL' ) | ( 'REAL' ) )
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
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1225:1: ( 'LREAL' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1225:1: ( 'LREAL' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1226:1: 'LREAL'
                    {
                     before(grammarAccess.getReal_Type_NameAccess().getLREALKeyword_0()); 
                    match(input,47,FOLLOW_47_in_rule__Real_Type_Name__Alternatives2575); 
                     after(grammarAccess.getReal_Type_NameAccess().getLREALKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1233:6: ( 'REAL' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1233:6: ( 'REAL' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1234:1: 'REAL'
                    {
                     before(grammarAccess.getReal_Type_NameAccess().getREALKeyword_1()); 
                    match(input,48,FOLLOW_48_in_rule__Real_Type_Name__Alternatives2595); 
                     after(grammarAccess.getReal_Type_NameAccess().getREALKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_Type_Name__Alternatives"


    // $ANTLR start "rule__Real_Value__Alternatives_1"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1246:1: rule__Real_Value__Alternatives_1 : ( ( '+' ) | ( '-' ) );
    public final void rule__Real_Value__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1250:1: ( ( '+' ) | ( '-' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==45) ) {
                alt9=1;
            }
            else if ( (LA9_0==46) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1251:1: ( '+' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1251:1: ( '+' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1252:1: '+'
                    {
                     before(grammarAccess.getReal_ValueAccess().getPlusSignKeyword_1_0()); 
                    match(input,45,FOLLOW_45_in_rule__Real_Value__Alternatives_12630); 
                     after(grammarAccess.getReal_ValueAccess().getPlusSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1259:6: ( '-' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1259:6: ( '-' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1260:1: '-'
                    {
                     before(grammarAccess.getReal_ValueAccess().getHyphenMinusKeyword_1_1()); 
                    match(input,46,FOLLOW_46_in_rule__Real_Value__Alternatives_12650); 
                     after(grammarAccess.getReal_ValueAccess().getHyphenMinusKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_Value__Alternatives_1"


    // $ANTLR start "rule__Multibits_Type_Name__Alternatives"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1272:1: rule__Multibits_Type_Name__Alternatives : ( ( 'BYTE' ) | ( 'WORD' ) | ( 'DWORD' ) | ( 'LWORD' ) );
    public final void rule__Multibits_Type_Name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1276:1: ( ( 'BYTE' ) | ( 'WORD' ) | ( 'DWORD' ) | ( 'LWORD' ) )
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
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1277:1: ( 'BYTE' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1277:1: ( 'BYTE' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1278:1: 'BYTE'
                    {
                     before(grammarAccess.getMultibits_Type_NameAccess().getBYTEKeyword_0()); 
                    match(input,49,FOLLOW_49_in_rule__Multibits_Type_Name__Alternatives2685); 
                     after(grammarAccess.getMultibits_Type_NameAccess().getBYTEKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1285:6: ( 'WORD' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1285:6: ( 'WORD' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1286:1: 'WORD'
                    {
                     before(grammarAccess.getMultibits_Type_NameAccess().getWORDKeyword_1()); 
                    match(input,50,FOLLOW_50_in_rule__Multibits_Type_Name__Alternatives2705); 
                     after(grammarAccess.getMultibits_Type_NameAccess().getWORDKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1293:6: ( 'DWORD' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1293:6: ( 'DWORD' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1294:1: 'DWORD'
                    {
                     before(grammarAccess.getMultibits_Type_NameAccess().getDWORDKeyword_2()); 
                    match(input,51,FOLLOW_51_in_rule__Multibits_Type_Name__Alternatives2725); 
                     after(grammarAccess.getMultibits_Type_NameAccess().getDWORDKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1301:6: ( 'LWORD' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1301:6: ( 'LWORD' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1302:1: 'LWORD'
                    {
                     before(grammarAccess.getMultibits_Type_NameAccess().getLWORDKeyword_3()); 
                    match(input,52,FOLLOW_52_in_rule__Multibits_Type_Name__Alternatives2745); 
                     after(grammarAccess.getMultibits_Type_NameAccess().getLWORDKeyword_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multibits_Type_Name__Alternatives"


    // $ANTLR start "rule__Bit_Str_Value__Alternatives_2"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1314:1: rule__Bit_Str_Value__Alternatives_2 : ( ( RULE_BIN_VALUE ) | ( RULE_OCT_VALUE ) | ( RULE_DEC_VALUE ) | ( RULE_HEX_VALUE ) );
    public final void rule__Bit_Str_Value__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1318:1: ( ( RULE_BIN_VALUE ) | ( RULE_OCT_VALUE ) | ( RULE_DEC_VALUE ) | ( RULE_HEX_VALUE ) )
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
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1319:1: ( RULE_BIN_VALUE )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1319:1: ( RULE_BIN_VALUE )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1320:1: RULE_BIN_VALUE
                    {
                     before(grammarAccess.getBit_Str_ValueAccess().getBIN_VALUETerminalRuleCall_2_0()); 
                    match(input,RULE_BIN_VALUE,FOLLOW_RULE_BIN_VALUE_in_rule__Bit_Str_Value__Alternatives_22779); 
                     after(grammarAccess.getBit_Str_ValueAccess().getBIN_VALUETerminalRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1325:6: ( RULE_OCT_VALUE )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1325:6: ( RULE_OCT_VALUE )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1326:1: RULE_OCT_VALUE
                    {
                     before(grammarAccess.getBit_Str_ValueAccess().getOCT_VALUETerminalRuleCall_2_1()); 
                    match(input,RULE_OCT_VALUE,FOLLOW_RULE_OCT_VALUE_in_rule__Bit_Str_Value__Alternatives_22796); 
                     after(grammarAccess.getBit_Str_ValueAccess().getOCT_VALUETerminalRuleCall_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1331:6: ( RULE_DEC_VALUE )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1331:6: ( RULE_DEC_VALUE )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1332:1: RULE_DEC_VALUE
                    {
                     before(grammarAccess.getBit_Str_ValueAccess().getDEC_VALUETerminalRuleCall_2_2()); 
                    match(input,RULE_DEC_VALUE,FOLLOW_RULE_DEC_VALUE_in_rule__Bit_Str_Value__Alternatives_22813); 
                     after(grammarAccess.getBit_Str_ValueAccess().getDEC_VALUETerminalRuleCall_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1337:6: ( RULE_HEX_VALUE )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1337:6: ( RULE_HEX_VALUE )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1338:1: RULE_HEX_VALUE
                    {
                     before(grammarAccess.getBit_Str_ValueAccess().getHEX_VALUETerminalRuleCall_2_3()); 
                    match(input,RULE_HEX_VALUE,FOLLOW_RULE_HEX_VALUE_in_rule__Bit_Str_Value__Alternatives_22830); 
                     after(grammarAccess.getBit_Str_ValueAccess().getHEX_VALUETerminalRuleCall_2_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bit_Str_Value__Alternatives_2"


    // $ANTLR start "rule__Bool_Value__Alternatives_1"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1348:1: rule__Bool_Value__Alternatives_1 : ( ( '0' ) | ( '1' ) | ( 'FALSE' ) | ( 'TRUE' ) );
    public final void rule__Bool_Value__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1352:1: ( ( '0' ) | ( '1' ) | ( 'FALSE' ) | ( 'TRUE' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt12=1;
                }
                break;
            case 54:
                {
                alt12=2;
                }
                break;
            case 55:
                {
                alt12=3;
                }
                break;
            case 56:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1353:1: ( '0' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1353:1: ( '0' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1354:1: '0'
                    {
                     before(grammarAccess.getBool_ValueAccess().getDigitZeroKeyword_1_0()); 
                    match(input,53,FOLLOW_53_in_rule__Bool_Value__Alternatives_12863); 
                     after(grammarAccess.getBool_ValueAccess().getDigitZeroKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1361:6: ( '1' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1361:6: ( '1' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1362:1: '1'
                    {
                     before(grammarAccess.getBool_ValueAccess().getDigitOneKeyword_1_1()); 
                    match(input,54,FOLLOW_54_in_rule__Bool_Value__Alternatives_12883); 
                     after(grammarAccess.getBool_ValueAccess().getDigitOneKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1369:6: ( 'FALSE' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1369:6: ( 'FALSE' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1370:1: 'FALSE'
                    {
                     before(grammarAccess.getBool_ValueAccess().getFALSEKeyword_1_2()); 
                    match(input,55,FOLLOW_55_in_rule__Bool_Value__Alternatives_12903); 
                     after(grammarAccess.getBool_ValueAccess().getFALSEKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1377:6: ( 'TRUE' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1377:6: ( 'TRUE' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1378:1: 'TRUE'
                    {
                     before(grammarAccess.getBool_ValueAccess().getTRUEKeyword_1_3()); 
                    match(input,56,FOLLOW_56_in_rule__Bool_Value__Alternatives_12923); 
                     after(grammarAccess.getBool_ValueAccess().getTRUEKeyword_1_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool_Value__Alternatives_1"


    // $ANTLR start "rule__Char_Str__Alternatives"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1390:1: rule__Char_Str__Alternatives : ( ( ruleS_Byte_Char_Str ) | ( ruleD_Byte_Char_Str ) );
    public final void rule__Char_Str__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1394:1: ( ( ruleS_Byte_Char_Str ) | ( ruleD_Byte_Char_Str ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==71) ) {
                alt13=1;
            }
            else if ( (LA13_0==72) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1395:1: ( ruleS_Byte_Char_Str )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1395:1: ( ruleS_Byte_Char_Str )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1396:1: ruleS_Byte_Char_Str
                    {
                     before(grammarAccess.getChar_StrAccess().getS_Byte_Char_StrParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleS_Byte_Char_Str_in_rule__Char_Str__Alternatives2957);
                    ruleS_Byte_Char_Str();

                    state._fsp--;

                     after(grammarAccess.getChar_StrAccess().getS_Byte_Char_StrParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1401:6: ( ruleD_Byte_Char_Str )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1401:6: ( ruleD_Byte_Char_Str )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1402:1: ruleD_Byte_Char_Str
                    {
                     before(grammarAccess.getChar_StrAccess().getD_Byte_Char_StrParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleD_Byte_Char_Str_in_rule__Char_Str__Alternatives2974);
                    ruleD_Byte_Char_Str();

                    state._fsp--;

                     after(grammarAccess.getChar_StrAccess().getD_Byte_Char_StrParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Char_Str__Alternatives"


    // $ANTLR start "rule__Time_Type_Name__Alternatives"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1412:1: rule__Time_Type_Name__Alternatives : ( ( 'TIME' ) | ( 'LTIME' ) );
    public final void rule__Time_Type_Name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1416:1: ( ( 'TIME' ) | ( 'LTIME' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==57) ) {
                alt14=1;
            }
            else if ( (LA14_0==58) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1417:1: ( 'TIME' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1417:1: ( 'TIME' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1418:1: 'TIME'
                    {
                     before(grammarAccess.getTime_Type_NameAccess().getTIMEKeyword_0()); 
                    match(input,57,FOLLOW_57_in_rule__Time_Type_Name__Alternatives3007); 
                     after(grammarAccess.getTime_Type_NameAccess().getTIMEKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1425:6: ( 'LTIME' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1425:6: ( 'LTIME' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1426:1: 'LTIME'
                    {
                     before(grammarAccess.getTime_Type_NameAccess().getLTIMEKeyword_1()); 
                    match(input,58,FOLLOW_58_in_rule__Time_Type_Name__Alternatives3027); 
                     after(grammarAccess.getTime_Type_NameAccess().getLTIMEKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time_Type_Name__Alternatives"


    // $ANTLR start "rule__Tod_Type_Name__Alternatives"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1438:1: rule__Tod_Type_Name__Alternatives : ( ( 'TIME_OF_DAY' ) | ( 'TOD' ) | ( 'LTOD' ) );
    public final void rule__Tod_Type_Name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1442:1: ( ( 'TIME_OF_DAY' ) | ( 'TOD' ) | ( 'LTOD' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt15=1;
                }
                break;
            case 60:
                {
                alt15=2;
                }
                break;
            case 61:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1443:1: ( 'TIME_OF_DAY' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1443:1: ( 'TIME_OF_DAY' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1444:1: 'TIME_OF_DAY'
                    {
                     before(grammarAccess.getTod_Type_NameAccess().getTIME_OF_DAYKeyword_0()); 
                    match(input,59,FOLLOW_59_in_rule__Tod_Type_Name__Alternatives3062); 
                     after(grammarAccess.getTod_Type_NameAccess().getTIME_OF_DAYKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1451:6: ( 'TOD' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1451:6: ( 'TOD' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1452:1: 'TOD'
                    {
                     before(grammarAccess.getTod_Type_NameAccess().getTODKeyword_1()); 
                    match(input,60,FOLLOW_60_in_rule__Tod_Type_Name__Alternatives3082); 
                     after(grammarAccess.getTod_Type_NameAccess().getTODKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1459:6: ( 'LTOD' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1459:6: ( 'LTOD' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1460:1: 'LTOD'
                    {
                     before(grammarAccess.getTod_Type_NameAccess().getLTODKeyword_2()); 
                    match(input,61,FOLLOW_61_in_rule__Tod_Type_Name__Alternatives3102); 
                     after(grammarAccess.getTod_Type_NameAccess().getLTODKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tod_Type_Name__Alternatives"


    // $ANTLR start "rule__Time_Literal__Alternatives"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1474:1: rule__Time_Literal__Alternatives : ( ( ruleDuration ) | ( ruleTime_Of_Day ) | ( ruleDate ) | ( ruleDate_And_Time ) );
    public final void rule__Time_Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1478:1: ( ( ruleDuration ) | ( ruleTime_Of_Day ) | ( ruleDate ) | ( ruleDate_And_Time ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 57:
            case 58:
            case 62:
            case 63:
                {
                alt16=1;
                }
                break;
            case 59:
            case 60:
            case 61:
            case 64:
                {
                alt16=2;
                }
                break;
            case RULE_DATE_VALUE:
                {
                alt16=3;
                }
                break;
            case 65:
            case 66:
            case 67:
            case 68:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1479:1: ( ruleDuration )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1479:1: ( ruleDuration )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1480:1: ruleDuration
                    {
                     before(grammarAccess.getTime_LiteralAccess().getDurationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDuration_in_rule__Time_Literal__Alternatives3138);
                    ruleDuration();

                    state._fsp--;

                     after(grammarAccess.getTime_LiteralAccess().getDurationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1485:6: ( ruleTime_Of_Day )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1485:6: ( ruleTime_Of_Day )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1486:1: ruleTime_Of_Day
                    {
                     before(grammarAccess.getTime_LiteralAccess().getTime_Of_DayParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTime_Of_Day_in_rule__Time_Literal__Alternatives3155);
                    ruleTime_Of_Day();

                    state._fsp--;

                     after(grammarAccess.getTime_LiteralAccess().getTime_Of_DayParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1491:6: ( ruleDate )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1491:6: ( ruleDate )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1492:1: ruleDate
                    {
                     before(grammarAccess.getTime_LiteralAccess().getDateParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDate_in_rule__Time_Literal__Alternatives3172);
                    ruleDate();

                    state._fsp--;

                     after(grammarAccess.getTime_LiteralAccess().getDateParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1497:6: ( ruleDate_And_Time )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1497:6: ( ruleDate_And_Time )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1498:1: ruleDate_And_Time
                    {
                     before(grammarAccess.getTime_LiteralAccess().getDate_And_TimeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleDate_And_Time_in_rule__Time_Literal__Alternatives3189);
                    ruleDate_And_Time();

                    state._fsp--;

                     after(grammarAccess.getTime_LiteralAccess().getDate_And_TimeParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time_Literal__Alternatives"


    // $ANTLR start "rule__Duration_Value__Alternatives_0"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1508:1: rule__Duration_Value__Alternatives_0 : ( ( ruleTime_Type_Name ) | ( 'T' ) | ( 'LT' ) );
    public final void rule__Duration_Value__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1512:1: ( ( ruleTime_Type_Name ) | ( 'T' ) | ( 'LT' ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 57:
            case 58:
                {
                alt17=1;
                }
                break;
            case 62:
                {
                alt17=2;
                }
                break;
            case 63:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1513:1: ( ruleTime_Type_Name )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1513:1: ( ruleTime_Type_Name )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1514:1: ruleTime_Type_Name
                    {
                     before(grammarAccess.getDuration_ValueAccess().getTime_Type_NameParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleTime_Type_Name_in_rule__Duration_Value__Alternatives_03221);
                    ruleTime_Type_Name();

                    state._fsp--;

                     after(grammarAccess.getDuration_ValueAccess().getTime_Type_NameParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1519:6: ( 'T' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1519:6: ( 'T' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1520:1: 'T'
                    {
                     before(grammarAccess.getDuration_ValueAccess().getTKeyword_0_1()); 
                    match(input,62,FOLLOW_62_in_rule__Duration_Value__Alternatives_03239); 
                     after(grammarAccess.getDuration_ValueAccess().getTKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1527:6: ( 'LT' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1527:6: ( 'LT' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1528:1: 'LT'
                    {
                     before(grammarAccess.getDuration_ValueAccess().getLTKeyword_0_2()); 
                    match(input,63,FOLLOW_63_in_rule__Duration_Value__Alternatives_03259); 
                     after(grammarAccess.getDuration_ValueAccess().getLTKeyword_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration_Value__Alternatives_0"


    // $ANTLR start "rule__Duration_Value__Alternatives_2"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1540:1: rule__Duration_Value__Alternatives_2 : ( ( '+' ) | ( '-' ) );
    public final void rule__Duration_Value__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1544:1: ( ( '+' ) | ( '-' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==45) ) {
                alt18=1;
            }
            else if ( (LA18_0==46) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1545:1: ( '+' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1545:1: ( '+' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1546:1: '+'
                    {
                     before(grammarAccess.getDuration_ValueAccess().getPlusSignKeyword_2_0()); 
                    match(input,45,FOLLOW_45_in_rule__Duration_Value__Alternatives_23294); 
                     after(grammarAccess.getDuration_ValueAccess().getPlusSignKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1553:6: ( '-' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1553:6: ( '-' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1554:1: '-'
                    {
                     before(grammarAccess.getDuration_ValueAccess().getHyphenMinusKeyword_2_1()); 
                    match(input,46,FOLLOW_46_in_rule__Duration_Value__Alternatives_23314); 
                     after(grammarAccess.getDuration_ValueAccess().getHyphenMinusKeyword_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration_Value__Alternatives_2"


    // $ANTLR start "rule__Time_Of_Day_Value__Alternatives_0"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1566:1: rule__Time_Of_Day_Value__Alternatives_0 : ( ( ruleTod_Type_Name ) | ( 'LTIME_OF_DAY' ) );
    public final void rule__Time_Of_Day_Value__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1570:1: ( ( ruleTod_Type_Name ) | ( 'LTIME_OF_DAY' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=59 && LA19_0<=61)) ) {
                alt19=1;
            }
            else if ( (LA19_0==64) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1571:1: ( ruleTod_Type_Name )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1571:1: ( ruleTod_Type_Name )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1572:1: ruleTod_Type_Name
                    {
                     before(grammarAccess.getTime_Of_Day_ValueAccess().getTod_Type_NameParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleTod_Type_Name_in_rule__Time_Of_Day_Value__Alternatives_03348);
                    ruleTod_Type_Name();

                    state._fsp--;

                     after(grammarAccess.getTime_Of_Day_ValueAccess().getTod_Type_NameParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1577:6: ( 'LTIME_OF_DAY' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1577:6: ( 'LTIME_OF_DAY' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1578:1: 'LTIME_OF_DAY'
                    {
                     before(grammarAccess.getTime_Of_Day_ValueAccess().getLTIME_OF_DAYKeyword_0_1()); 
                    match(input,64,FOLLOW_64_in_rule__Time_Of_Day_Value__Alternatives_03366); 
                     after(grammarAccess.getTime_Of_Day_ValueAccess().getLTIME_OF_DAYKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time_Of_Day_Value__Alternatives_0"


    // $ANTLR start "rule__Date_And_Time_Value__Alternatives_0"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1590:1: rule__Date_And_Time_Value__Alternatives_0 : ( ( 'DATE_AND_TIME' ) | ( 'LDATE_AND_TIME' ) | ( 'DT' ) | ( 'LDT' ) );
    public final void rule__Date_And_Time_Value__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1594:1: ( ( 'DATE_AND_TIME' ) | ( 'LDATE_AND_TIME' ) | ( 'DT' ) | ( 'LDT' ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt20=1;
                }
                break;
            case 66:
                {
                alt20=2;
                }
                break;
            case 67:
                {
                alt20=3;
                }
                break;
            case 68:
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
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1595:1: ( 'DATE_AND_TIME' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1595:1: ( 'DATE_AND_TIME' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1596:1: 'DATE_AND_TIME'
                    {
                     before(grammarAccess.getDate_And_Time_ValueAccess().getDATE_AND_TIMEKeyword_0_0()); 
                    match(input,65,FOLLOW_65_in_rule__Date_And_Time_Value__Alternatives_03401); 
                     after(grammarAccess.getDate_And_Time_ValueAccess().getDATE_AND_TIMEKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1603:6: ( 'LDATE_AND_TIME' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1603:6: ( 'LDATE_AND_TIME' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1604:1: 'LDATE_AND_TIME'
                    {
                     before(grammarAccess.getDate_And_Time_ValueAccess().getLDATE_AND_TIMEKeyword_0_1()); 
                    match(input,66,FOLLOW_66_in_rule__Date_And_Time_Value__Alternatives_03421); 
                     after(grammarAccess.getDate_And_Time_ValueAccess().getLDATE_AND_TIMEKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1611:6: ( 'DT' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1611:6: ( 'DT' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1612:1: 'DT'
                    {
                     before(grammarAccess.getDate_And_Time_ValueAccess().getDTKeyword_0_2()); 
                    match(input,67,FOLLOW_67_in_rule__Date_And_Time_Value__Alternatives_03441); 
                     after(grammarAccess.getDate_And_Time_ValueAccess().getDTKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1619:6: ( 'LDT' )
                    {
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1619:6: ( 'LDT' )
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1620:1: 'LDT'
                    {
                     before(grammarAccess.getDate_And_Time_ValueAccess().getLDTKeyword_0_3()); 
                    match(input,68,FOLLOW_68_in_rule__Date_And_Time_Value__Alternatives_03461); 
                     after(grammarAccess.getDate_And_Time_ValueAccess().getLDTKeyword_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date_And_Time_Value__Alternatives_0"


    // $ANTLR start "rule__Unsigned_Int_Value__Group__0"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1634:1: rule__Unsigned_Int_Value__Group__0 : rule__Unsigned_Int_Value__Group__0__Impl rule__Unsigned_Int_Value__Group__1 ;
    public final void rule__Unsigned_Int_Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1638:1: ( rule__Unsigned_Int_Value__Group__0__Impl rule__Unsigned_Int_Value__Group__1 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1639:2: rule__Unsigned_Int_Value__Group__0__Impl rule__Unsigned_Int_Value__Group__1
            {
            pushFollow(FOLLOW_rule__Unsigned_Int_Value__Group__0__Impl_in_rule__Unsigned_Int_Value__Group__03493);
            rule__Unsigned_Int_Value__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Unsigned_Int_Value__Group__1_in_rule__Unsigned_Int_Value__Group__03496);
            rule__Unsigned_Int_Value__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unsigned_Int_Value__Group__0"


    // $ANTLR start "rule__Unsigned_Int_Value__Group__0__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1646:1: rule__Unsigned_Int_Value__Group__0__Impl : ( ruleUnsigned_Int_Type_Name ) ;
    public final void rule__Unsigned_Int_Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1650:1: ( ( ruleUnsigned_Int_Type_Name ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1651:1: ( ruleUnsigned_Int_Type_Name )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1651:1: ( ruleUnsigned_Int_Type_Name )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1652:1: ruleUnsigned_Int_Type_Name
            {
             before(grammarAccess.getUnsigned_Int_ValueAccess().getUnsigned_Int_Type_NameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleUnsigned_Int_Type_Name_in_rule__Unsigned_Int_Value__Group__0__Impl3523);
            ruleUnsigned_Int_Type_Name();

            state._fsp--;

             after(grammarAccess.getUnsigned_Int_ValueAccess().getUnsigned_Int_Type_NameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unsigned_Int_Value__Group__0__Impl"


    // $ANTLR start "rule__Unsigned_Int_Value__Group__1"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1663:1: rule__Unsigned_Int_Value__Group__1 : rule__Unsigned_Int_Value__Group__1__Impl ;
    public final void rule__Unsigned_Int_Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1667:1: ( rule__Unsigned_Int_Value__Group__1__Impl )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1668:2: rule__Unsigned_Int_Value__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Unsigned_Int_Value__Group__1__Impl_in_rule__Unsigned_Int_Value__Group__13552);
            rule__Unsigned_Int_Value__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unsigned_Int_Value__Group__1"


    // $ANTLR start "rule__Unsigned_Int_Value__Group__1__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1674:1: rule__Unsigned_Int_Value__Group__1__Impl : ( ( rule__Unsigned_Int_Value__Alternatives_1 ) ) ;
    public final void rule__Unsigned_Int_Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1678:1: ( ( ( rule__Unsigned_Int_Value__Alternatives_1 ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1679:1: ( ( rule__Unsigned_Int_Value__Alternatives_1 ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1679:1: ( ( rule__Unsigned_Int_Value__Alternatives_1 ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1680:1: ( rule__Unsigned_Int_Value__Alternatives_1 )
            {
             before(grammarAccess.getUnsigned_Int_ValueAccess().getAlternatives_1()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1681:1: ( rule__Unsigned_Int_Value__Alternatives_1 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1681:2: rule__Unsigned_Int_Value__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Unsigned_Int_Value__Alternatives_1_in_rule__Unsigned_Int_Value__Group__1__Impl3579);
            rule__Unsigned_Int_Value__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getUnsigned_Int_ValueAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unsigned_Int_Value__Group__1__Impl"


    // $ANTLR start "rule__Signed_Int_Value__Group__0"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1695:1: rule__Signed_Int_Value__Group__0 : rule__Signed_Int_Value__Group__0__Impl rule__Signed_Int_Value__Group__1 ;
    public final void rule__Signed_Int_Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1699:1: ( rule__Signed_Int_Value__Group__0__Impl rule__Signed_Int_Value__Group__1 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1700:2: rule__Signed_Int_Value__Group__0__Impl rule__Signed_Int_Value__Group__1
            {
            pushFollow(FOLLOW_rule__Signed_Int_Value__Group__0__Impl_in_rule__Signed_Int_Value__Group__03613);
            rule__Signed_Int_Value__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Signed_Int_Value__Group__1_in_rule__Signed_Int_Value__Group__03616);
            rule__Signed_Int_Value__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signed_Int_Value__Group__0"


    // $ANTLR start "rule__Signed_Int_Value__Group__0__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1707:1: rule__Signed_Int_Value__Group__0__Impl : ( ruleSigned_Int_Type_Name ) ;
    public final void rule__Signed_Int_Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1711:1: ( ( ruleSigned_Int_Type_Name ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1712:1: ( ruleSigned_Int_Type_Name )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1712:1: ( ruleSigned_Int_Type_Name )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1713:1: ruleSigned_Int_Type_Name
            {
             before(grammarAccess.getSigned_Int_ValueAccess().getSigned_Int_Type_NameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSigned_Int_Type_Name_in_rule__Signed_Int_Value__Group__0__Impl3643);
            ruleSigned_Int_Type_Name();

            state._fsp--;

             after(grammarAccess.getSigned_Int_ValueAccess().getSigned_Int_Type_NameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signed_Int_Value__Group__0__Impl"


    // $ANTLR start "rule__Signed_Int_Value__Group__1"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1724:1: rule__Signed_Int_Value__Group__1 : rule__Signed_Int_Value__Group__1__Impl ;
    public final void rule__Signed_Int_Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1728:1: ( rule__Signed_Int_Value__Group__1__Impl )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1729:2: rule__Signed_Int_Value__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Signed_Int_Value__Group__1__Impl_in_rule__Signed_Int_Value__Group__13672);
            rule__Signed_Int_Value__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signed_Int_Value__Group__1"


    // $ANTLR start "rule__Signed_Int_Value__Group__1__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1735:1: rule__Signed_Int_Value__Group__1__Impl : ( ( rule__Signed_Int_Value__Alternatives_1 ) ) ;
    public final void rule__Signed_Int_Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1739:1: ( ( ( rule__Signed_Int_Value__Alternatives_1 ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1740:1: ( ( rule__Signed_Int_Value__Alternatives_1 ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1740:1: ( ( rule__Signed_Int_Value__Alternatives_1 ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1741:1: ( rule__Signed_Int_Value__Alternatives_1 )
            {
             before(grammarAccess.getSigned_Int_ValueAccess().getAlternatives_1()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1742:1: ( rule__Signed_Int_Value__Alternatives_1 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1742:2: rule__Signed_Int_Value__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Signed_Int_Value__Alternatives_1_in_rule__Signed_Int_Value__Group__1__Impl3699);
            rule__Signed_Int_Value__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getSigned_Int_ValueAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signed_Int_Value__Group__1__Impl"


    // $ANTLR start "rule__Signed_Int_Value__Group_1_2__0"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1756:1: rule__Signed_Int_Value__Group_1_2__0 : rule__Signed_Int_Value__Group_1_2__0__Impl rule__Signed_Int_Value__Group_1_2__1 ;
    public final void rule__Signed_Int_Value__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1760:1: ( rule__Signed_Int_Value__Group_1_2__0__Impl rule__Signed_Int_Value__Group_1_2__1 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1761:2: rule__Signed_Int_Value__Group_1_2__0__Impl rule__Signed_Int_Value__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Signed_Int_Value__Group_1_2__0__Impl_in_rule__Signed_Int_Value__Group_1_2__03733);
            rule__Signed_Int_Value__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Signed_Int_Value__Group_1_2__1_in_rule__Signed_Int_Value__Group_1_2__03736);
            rule__Signed_Int_Value__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signed_Int_Value__Group_1_2__0"


    // $ANTLR start "rule__Signed_Int_Value__Group_1_2__0__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1768:1: rule__Signed_Int_Value__Group_1_2__0__Impl : ( ( rule__Signed_Int_Value__Alternatives_1_2_0 )? ) ;
    public final void rule__Signed_Int_Value__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1772:1: ( ( ( rule__Signed_Int_Value__Alternatives_1_2_0 )? ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1773:1: ( ( rule__Signed_Int_Value__Alternatives_1_2_0 )? )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1773:1: ( ( rule__Signed_Int_Value__Alternatives_1_2_0 )? )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1774:1: ( rule__Signed_Int_Value__Alternatives_1_2_0 )?
            {
             before(grammarAccess.getSigned_Int_ValueAccess().getAlternatives_1_2_0()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1775:1: ( rule__Signed_Int_Value__Alternatives_1_2_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=45 && LA21_0<=46)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1775:2: rule__Signed_Int_Value__Alternatives_1_2_0
                    {
                    pushFollow(FOLLOW_rule__Signed_Int_Value__Alternatives_1_2_0_in_rule__Signed_Int_Value__Group_1_2__0__Impl3763);
                    rule__Signed_Int_Value__Alternatives_1_2_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSigned_Int_ValueAccess().getAlternatives_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signed_Int_Value__Group_1_2__0__Impl"


    // $ANTLR start "rule__Signed_Int_Value__Group_1_2__1"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1785:1: rule__Signed_Int_Value__Group_1_2__1 : rule__Signed_Int_Value__Group_1_2__1__Impl ;
    public final void rule__Signed_Int_Value__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1789:1: ( rule__Signed_Int_Value__Group_1_2__1__Impl )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1790:2: rule__Signed_Int_Value__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Signed_Int_Value__Group_1_2__1__Impl_in_rule__Signed_Int_Value__Group_1_2__13794);
            rule__Signed_Int_Value__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signed_Int_Value__Group_1_2__1"


    // $ANTLR start "rule__Signed_Int_Value__Group_1_2__1__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1796:1: rule__Signed_Int_Value__Group_1_2__1__Impl : ( RULE_DEC_VALUE ) ;
    public final void rule__Signed_Int_Value__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1800:1: ( ( RULE_DEC_VALUE ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1801:1: ( RULE_DEC_VALUE )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1801:1: ( RULE_DEC_VALUE )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1802:1: RULE_DEC_VALUE
            {
             before(grammarAccess.getSigned_Int_ValueAccess().getDEC_VALUETerminalRuleCall_1_2_1()); 
            match(input,RULE_DEC_VALUE,FOLLOW_RULE_DEC_VALUE_in_rule__Signed_Int_Value__Group_1_2__1__Impl3821); 
             after(grammarAccess.getSigned_Int_ValueAccess().getDEC_VALUETerminalRuleCall_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signed_Int_Value__Group_1_2__1__Impl"


    // $ANTLR start "rule__Real_Value__Group__0"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1817:1: rule__Real_Value__Group__0 : rule__Real_Value__Group__0__Impl rule__Real_Value__Group__1 ;
    public final void rule__Real_Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1821:1: ( rule__Real_Value__Group__0__Impl rule__Real_Value__Group__1 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1822:2: rule__Real_Value__Group__0__Impl rule__Real_Value__Group__1
            {
            pushFollow(FOLLOW_rule__Real_Value__Group__0__Impl_in_rule__Real_Value__Group__03854);
            rule__Real_Value__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Real_Value__Group__1_in_rule__Real_Value__Group__03857);
            rule__Real_Value__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_Value__Group__0"


    // $ANTLR start "rule__Real_Value__Group__0__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1829:1: rule__Real_Value__Group__0__Impl : ( ruleReal_Type_Name ) ;
    public final void rule__Real_Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1833:1: ( ( ruleReal_Type_Name ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1834:1: ( ruleReal_Type_Name )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1834:1: ( ruleReal_Type_Name )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1835:1: ruleReal_Type_Name
            {
             before(grammarAccess.getReal_ValueAccess().getReal_Type_NameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleReal_Type_Name_in_rule__Real_Value__Group__0__Impl3884);
            ruleReal_Type_Name();

            state._fsp--;

             after(grammarAccess.getReal_ValueAccess().getReal_Type_NameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_Value__Group__0__Impl"


    // $ANTLR start "rule__Real_Value__Group__1"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1846:1: rule__Real_Value__Group__1 : rule__Real_Value__Group__1__Impl rule__Real_Value__Group__2 ;
    public final void rule__Real_Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1850:1: ( rule__Real_Value__Group__1__Impl rule__Real_Value__Group__2 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1851:2: rule__Real_Value__Group__1__Impl rule__Real_Value__Group__2
            {
            pushFollow(FOLLOW_rule__Real_Value__Group__1__Impl_in_rule__Real_Value__Group__13913);
            rule__Real_Value__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Real_Value__Group__2_in_rule__Real_Value__Group__13916);
            rule__Real_Value__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_Value__Group__1"


    // $ANTLR start "rule__Real_Value__Group__1__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1858:1: rule__Real_Value__Group__1__Impl : ( ( rule__Real_Value__Alternatives_1 )? ) ;
    public final void rule__Real_Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1862:1: ( ( ( rule__Real_Value__Alternatives_1 )? ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1863:1: ( ( rule__Real_Value__Alternatives_1 )? )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1863:1: ( ( rule__Real_Value__Alternatives_1 )? )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1864:1: ( rule__Real_Value__Alternatives_1 )?
            {
             before(grammarAccess.getReal_ValueAccess().getAlternatives_1()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1865:1: ( rule__Real_Value__Alternatives_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=45 && LA22_0<=46)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1865:2: rule__Real_Value__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__Real_Value__Alternatives_1_in_rule__Real_Value__Group__1__Impl3943);
                    rule__Real_Value__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReal_ValueAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_Value__Group__1__Impl"


    // $ANTLR start "rule__Real_Value__Group__2"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1875:1: rule__Real_Value__Group__2 : rule__Real_Value__Group__2__Impl ;
    public final void rule__Real_Value__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1879:1: ( rule__Real_Value__Group__2__Impl )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1880:2: rule__Real_Value__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Real_Value__Group__2__Impl_in_rule__Real_Value__Group__23974);
            rule__Real_Value__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_Value__Group__2"


    // $ANTLR start "rule__Real_Value__Group__2__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1886:1: rule__Real_Value__Group__2__Impl : ( RULE_FLOAT_VALUE ) ;
    public final void rule__Real_Value__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1890:1: ( ( RULE_FLOAT_VALUE ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1891:1: ( RULE_FLOAT_VALUE )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1891:1: ( RULE_FLOAT_VALUE )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1892:1: RULE_FLOAT_VALUE
            {
             before(grammarAccess.getReal_ValueAccess().getFLOAT_VALUETerminalRuleCall_2()); 
            match(input,RULE_FLOAT_VALUE,FOLLOW_RULE_FLOAT_VALUE_in_rule__Real_Value__Group__2__Impl4001); 
             after(grammarAccess.getReal_ValueAccess().getFLOAT_VALUETerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_Value__Group__2__Impl"


    // $ANTLR start "rule__Bit_Str_Value__Group__0"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1909:1: rule__Bit_Str_Value__Group__0 : rule__Bit_Str_Value__Group__0__Impl rule__Bit_Str_Value__Group__1 ;
    public final void rule__Bit_Str_Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1913:1: ( rule__Bit_Str_Value__Group__0__Impl rule__Bit_Str_Value__Group__1 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1914:2: rule__Bit_Str_Value__Group__0__Impl rule__Bit_Str_Value__Group__1
            {
            pushFollow(FOLLOW_rule__Bit_Str_Value__Group__0__Impl_in_rule__Bit_Str_Value__Group__04036);
            rule__Bit_Str_Value__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bit_Str_Value__Group__1_in_rule__Bit_Str_Value__Group__04039);
            rule__Bit_Str_Value__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bit_Str_Value__Group__0"


    // $ANTLR start "rule__Bit_Str_Value__Group__0__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1921:1: rule__Bit_Str_Value__Group__0__Impl : ( ruleMultibits_Type_Name ) ;
    public final void rule__Bit_Str_Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1925:1: ( ( ruleMultibits_Type_Name ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1926:1: ( ruleMultibits_Type_Name )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1926:1: ( ruleMultibits_Type_Name )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1927:1: ruleMultibits_Type_Name
            {
             before(grammarAccess.getBit_Str_ValueAccess().getMultibits_Type_NameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMultibits_Type_Name_in_rule__Bit_Str_Value__Group__0__Impl4066);
            ruleMultibits_Type_Name();

            state._fsp--;

             after(grammarAccess.getBit_Str_ValueAccess().getMultibits_Type_NameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bit_Str_Value__Group__0__Impl"


    // $ANTLR start "rule__Bit_Str_Value__Group__1"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1938:1: rule__Bit_Str_Value__Group__1 : rule__Bit_Str_Value__Group__1__Impl rule__Bit_Str_Value__Group__2 ;
    public final void rule__Bit_Str_Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1942:1: ( rule__Bit_Str_Value__Group__1__Impl rule__Bit_Str_Value__Group__2 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1943:2: rule__Bit_Str_Value__Group__1__Impl rule__Bit_Str_Value__Group__2
            {
            pushFollow(FOLLOW_rule__Bit_Str_Value__Group__1__Impl_in_rule__Bit_Str_Value__Group__14095);
            rule__Bit_Str_Value__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bit_Str_Value__Group__2_in_rule__Bit_Str_Value__Group__14098);
            rule__Bit_Str_Value__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bit_Str_Value__Group__1"


    // $ANTLR start "rule__Bit_Str_Value__Group__1__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1950:1: rule__Bit_Str_Value__Group__1__Impl : ( '#' ) ;
    public final void rule__Bit_Str_Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1954:1: ( ( '#' ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1955:1: ( '#' )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1955:1: ( '#' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1956:1: '#'
            {
             before(grammarAccess.getBit_Str_ValueAccess().getNumberSignKeyword_1()); 
            match(input,69,FOLLOW_69_in_rule__Bit_Str_Value__Group__1__Impl4126); 
             after(grammarAccess.getBit_Str_ValueAccess().getNumberSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bit_Str_Value__Group__1__Impl"


    // $ANTLR start "rule__Bit_Str_Value__Group__2"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1969:1: rule__Bit_Str_Value__Group__2 : rule__Bit_Str_Value__Group__2__Impl ;
    public final void rule__Bit_Str_Value__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1973:1: ( rule__Bit_Str_Value__Group__2__Impl )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1974:2: rule__Bit_Str_Value__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Bit_Str_Value__Group__2__Impl_in_rule__Bit_Str_Value__Group__24157);
            rule__Bit_Str_Value__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bit_Str_Value__Group__2"


    // $ANTLR start "rule__Bit_Str_Value__Group__2__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1980:1: rule__Bit_Str_Value__Group__2__Impl : ( ( rule__Bit_Str_Value__Alternatives_2 ) ) ;
    public final void rule__Bit_Str_Value__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1984:1: ( ( ( rule__Bit_Str_Value__Alternatives_2 ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1985:1: ( ( rule__Bit_Str_Value__Alternatives_2 ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1985:1: ( ( rule__Bit_Str_Value__Alternatives_2 ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1986:1: ( rule__Bit_Str_Value__Alternatives_2 )
            {
             before(grammarAccess.getBit_Str_ValueAccess().getAlternatives_2()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1987:1: ( rule__Bit_Str_Value__Alternatives_2 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1987:2: rule__Bit_Str_Value__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Bit_Str_Value__Alternatives_2_in_rule__Bit_Str_Value__Group__2__Impl4184);
            rule__Bit_Str_Value__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getBit_Str_ValueAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bit_Str_Value__Group__2__Impl"


    // $ANTLR start "rule__Bool_Value__Group__0"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2003:1: rule__Bool_Value__Group__0 : rule__Bool_Value__Group__0__Impl rule__Bool_Value__Group__1 ;
    public final void rule__Bool_Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2007:1: ( rule__Bool_Value__Group__0__Impl rule__Bool_Value__Group__1 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2008:2: rule__Bool_Value__Group__0__Impl rule__Bool_Value__Group__1
            {
            pushFollow(FOLLOW_rule__Bool_Value__Group__0__Impl_in_rule__Bool_Value__Group__04220);
            rule__Bool_Value__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bool_Value__Group__1_in_rule__Bool_Value__Group__04223);
            rule__Bool_Value__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool_Value__Group__0"


    // $ANTLR start "rule__Bool_Value__Group__0__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2015:1: rule__Bool_Value__Group__0__Impl : ( ( rule__Bool_Value__Group_0__0 )? ) ;
    public final void rule__Bool_Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2019:1: ( ( ( rule__Bool_Value__Group_0__0 )? ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2020:1: ( ( rule__Bool_Value__Group_0__0 )? )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2020:1: ( ( rule__Bool_Value__Group_0__0 )? )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2021:1: ( rule__Bool_Value__Group_0__0 )?
            {
             before(grammarAccess.getBool_ValueAccess().getGroup_0()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2022:1: ( rule__Bool_Value__Group_0__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2022:2: rule__Bool_Value__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Bool_Value__Group_0__0_in_rule__Bool_Value__Group__0__Impl4250);
                    rule__Bool_Value__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBool_ValueAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool_Value__Group__0__Impl"


    // $ANTLR start "rule__Bool_Value__Group__1"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2032:1: rule__Bool_Value__Group__1 : rule__Bool_Value__Group__1__Impl ;
    public final void rule__Bool_Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2036:1: ( rule__Bool_Value__Group__1__Impl )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2037:2: rule__Bool_Value__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Bool_Value__Group__1__Impl_in_rule__Bool_Value__Group__14281);
            rule__Bool_Value__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool_Value__Group__1"


    // $ANTLR start "rule__Bool_Value__Group__1__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2043:1: rule__Bool_Value__Group__1__Impl : ( ( rule__Bool_Value__Alternatives_1 ) ) ;
    public final void rule__Bool_Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2047:1: ( ( ( rule__Bool_Value__Alternatives_1 ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2048:1: ( ( rule__Bool_Value__Alternatives_1 ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2048:1: ( ( rule__Bool_Value__Alternatives_1 ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2049:1: ( rule__Bool_Value__Alternatives_1 )
            {
             before(grammarAccess.getBool_ValueAccess().getAlternatives_1()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2050:1: ( rule__Bool_Value__Alternatives_1 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2050:2: rule__Bool_Value__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Bool_Value__Alternatives_1_in_rule__Bool_Value__Group__1__Impl4308);
            rule__Bool_Value__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getBool_ValueAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool_Value__Group__1__Impl"


    // $ANTLR start "rule__Bool_Value__Group_0__0"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2064:1: rule__Bool_Value__Group_0__0 : rule__Bool_Value__Group_0__0__Impl rule__Bool_Value__Group_0__1 ;
    public final void rule__Bool_Value__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2068:1: ( rule__Bool_Value__Group_0__0__Impl rule__Bool_Value__Group_0__1 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2069:2: rule__Bool_Value__Group_0__0__Impl rule__Bool_Value__Group_0__1
            {
            pushFollow(FOLLOW_rule__Bool_Value__Group_0__0__Impl_in_rule__Bool_Value__Group_0__04342);
            rule__Bool_Value__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bool_Value__Group_0__1_in_rule__Bool_Value__Group_0__04345);
            rule__Bool_Value__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool_Value__Group_0__0"


    // $ANTLR start "rule__Bool_Value__Group_0__0__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2076:1: rule__Bool_Value__Group_0__0__Impl : ( ruleBool_Type_Name ) ;
    public final void rule__Bool_Value__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2080:1: ( ( ruleBool_Type_Name ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2081:1: ( ruleBool_Type_Name )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2081:1: ( ruleBool_Type_Name )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2082:1: ruleBool_Type_Name
            {
             before(grammarAccess.getBool_ValueAccess().getBool_Type_NameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBool_Type_Name_in_rule__Bool_Value__Group_0__0__Impl4372);
            ruleBool_Type_Name();

            state._fsp--;

             after(grammarAccess.getBool_ValueAccess().getBool_Type_NameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool_Value__Group_0__0__Impl"


    // $ANTLR start "rule__Bool_Value__Group_0__1"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2093:1: rule__Bool_Value__Group_0__1 : rule__Bool_Value__Group_0__1__Impl ;
    public final void rule__Bool_Value__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2097:1: ( rule__Bool_Value__Group_0__1__Impl )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2098:2: rule__Bool_Value__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Bool_Value__Group_0__1__Impl_in_rule__Bool_Value__Group_0__14401);
            rule__Bool_Value__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool_Value__Group_0__1"


    // $ANTLR start "rule__Bool_Value__Group_0__1__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2104:1: rule__Bool_Value__Group_0__1__Impl : ( '#' ) ;
    public final void rule__Bool_Value__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2108:1: ( ( '#' ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2109:1: ( '#' )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2109:1: ( '#' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2110:1: '#'
            {
             before(grammarAccess.getBool_ValueAccess().getNumberSignKeyword_0_1()); 
            match(input,69,FOLLOW_69_in_rule__Bool_Value__Group_0__1__Impl4429); 
             after(grammarAccess.getBool_ValueAccess().getNumberSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool_Value__Group_0__1__Impl"


    // $ANTLR start "rule__Char_Value__Group__0"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2127:1: rule__Char_Value__Group__0 : rule__Char_Value__Group__0__Impl rule__Char_Value__Group__1 ;
    public final void rule__Char_Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2131:1: ( rule__Char_Value__Group__0__Impl rule__Char_Value__Group__1 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2132:2: rule__Char_Value__Group__0__Impl rule__Char_Value__Group__1
            {
            pushFollow(FOLLOW_rule__Char_Value__Group__0__Impl_in_rule__Char_Value__Group__04464);
            rule__Char_Value__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Char_Value__Group__1_in_rule__Char_Value__Group__04467);
            rule__Char_Value__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Char_Value__Group__0"


    // $ANTLR start "rule__Char_Value__Group__0__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2139:1: rule__Char_Value__Group__0__Impl : ( ( 'STRING#' )? ) ;
    public final void rule__Char_Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2143:1: ( ( ( 'STRING#' )? ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2144:1: ( ( 'STRING#' )? )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2144:1: ( ( 'STRING#' )? )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2145:1: ( 'STRING#' )?
            {
             before(grammarAccess.getChar_ValueAccess().getSTRINGKeyword_0()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2146:1: ( 'STRING#' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==70) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2147:2: 'STRING#'
                    {
                    match(input,70,FOLLOW_70_in_rule__Char_Value__Group__0__Impl4496); 

                    }
                    break;

            }

             after(grammarAccess.getChar_ValueAccess().getSTRINGKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Char_Value__Group__0__Impl"


    // $ANTLR start "rule__Char_Value__Group__1"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2158:1: rule__Char_Value__Group__1 : rule__Char_Value__Group__1__Impl ;
    public final void rule__Char_Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2162:1: ( rule__Char_Value__Group__1__Impl )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2163:2: rule__Char_Value__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Char_Value__Group__1__Impl_in_rule__Char_Value__Group__14529);
            rule__Char_Value__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Char_Value__Group__1"


    // $ANTLR start "rule__Char_Value__Group__1__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2169:1: rule__Char_Value__Group__1__Impl : ( ruleChar_Str ) ;
    public final void rule__Char_Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2173:1: ( ( ruleChar_Str ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2174:1: ( ruleChar_Str )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2174:1: ( ruleChar_Str )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2175:1: ruleChar_Str
            {
             before(grammarAccess.getChar_ValueAccess().getChar_StrParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleChar_Str_in_rule__Char_Value__Group__1__Impl4556);
            ruleChar_Str();

            state._fsp--;

             after(grammarAccess.getChar_ValueAccess().getChar_StrParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Char_Value__Group__1__Impl"


    // $ANTLR start "rule__S_Byte_Char_Str__Group__0"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2190:1: rule__S_Byte_Char_Str__Group__0 : rule__S_Byte_Char_Str__Group__0__Impl rule__S_Byte_Char_Str__Group__1 ;
    public final void rule__S_Byte_Char_Str__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2194:1: ( rule__S_Byte_Char_Str__Group__0__Impl rule__S_Byte_Char_Str__Group__1 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2195:2: rule__S_Byte_Char_Str__Group__0__Impl rule__S_Byte_Char_Str__Group__1
            {
            pushFollow(FOLLOW_rule__S_Byte_Char_Str__Group__0__Impl_in_rule__S_Byte_Char_Str__Group__04589);
            rule__S_Byte_Char_Str__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__S_Byte_Char_Str__Group__1_in_rule__S_Byte_Char_Str__Group__04592);
            rule__S_Byte_Char_Str__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S_Byte_Char_Str__Group__0"


    // $ANTLR start "rule__S_Byte_Char_Str__Group__0__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2202:1: rule__S_Byte_Char_Str__Group__0__Impl : ( '\\'' ) ;
    public final void rule__S_Byte_Char_Str__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2206:1: ( ( '\\'' ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2207:1: ( '\\'' )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2207:1: ( '\\'' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2208:1: '\\''
            {
             before(grammarAccess.getS_Byte_Char_StrAccess().getApostropheKeyword_0()); 
            match(input,71,FOLLOW_71_in_rule__S_Byte_Char_Str__Group__0__Impl4620); 
             after(grammarAccess.getS_Byte_Char_StrAccess().getApostropheKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S_Byte_Char_Str__Group__0__Impl"


    // $ANTLR start "rule__S_Byte_Char_Str__Group__1"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2221:1: rule__S_Byte_Char_Str__Group__1 : rule__S_Byte_Char_Str__Group__1__Impl rule__S_Byte_Char_Str__Group__2 ;
    public final void rule__S_Byte_Char_Str__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2225:1: ( rule__S_Byte_Char_Str__Group__1__Impl rule__S_Byte_Char_Str__Group__2 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2226:2: rule__S_Byte_Char_Str__Group__1__Impl rule__S_Byte_Char_Str__Group__2
            {
            pushFollow(FOLLOW_rule__S_Byte_Char_Str__Group__1__Impl_in_rule__S_Byte_Char_Str__Group__14651);
            rule__S_Byte_Char_Str__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__S_Byte_Char_Str__Group__2_in_rule__S_Byte_Char_Str__Group__14654);
            rule__S_Byte_Char_Str__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S_Byte_Char_Str__Group__1"


    // $ANTLR start "rule__S_Byte_Char_Str__Group__1__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2233:1: rule__S_Byte_Char_Str__Group__1__Impl : ( ( ( RULE_S_BYTE_CHAR_VALUE ) ) ( ( RULE_S_BYTE_CHAR_VALUE )* ) ) ;
    public final void rule__S_Byte_Char_Str__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2237:1: ( ( ( ( RULE_S_BYTE_CHAR_VALUE ) ) ( ( RULE_S_BYTE_CHAR_VALUE )* ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2238:1: ( ( ( RULE_S_BYTE_CHAR_VALUE ) ) ( ( RULE_S_BYTE_CHAR_VALUE )* ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2238:1: ( ( ( RULE_S_BYTE_CHAR_VALUE ) ) ( ( RULE_S_BYTE_CHAR_VALUE )* ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2239:1: ( ( RULE_S_BYTE_CHAR_VALUE ) ) ( ( RULE_S_BYTE_CHAR_VALUE )* )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2239:1: ( ( RULE_S_BYTE_CHAR_VALUE ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2240:1: ( RULE_S_BYTE_CHAR_VALUE )
            {
             before(grammarAccess.getS_Byte_Char_StrAccess().getS_BYTE_CHAR_VALUETerminalRuleCall_1()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2241:1: ( RULE_S_BYTE_CHAR_VALUE )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2241:3: RULE_S_BYTE_CHAR_VALUE
            {
            match(input,RULE_S_BYTE_CHAR_VALUE,FOLLOW_RULE_S_BYTE_CHAR_VALUE_in_rule__S_Byte_Char_Str__Group__1__Impl4684); 

            }

             after(grammarAccess.getS_Byte_Char_StrAccess().getS_BYTE_CHAR_VALUETerminalRuleCall_1()); 

            }

            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2244:1: ( ( RULE_S_BYTE_CHAR_VALUE )* )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2245:1: ( RULE_S_BYTE_CHAR_VALUE )*
            {
             before(grammarAccess.getS_Byte_Char_StrAccess().getS_BYTE_CHAR_VALUETerminalRuleCall_1()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2246:1: ( RULE_S_BYTE_CHAR_VALUE )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_S_BYTE_CHAR_VALUE) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2246:3: RULE_S_BYTE_CHAR_VALUE
            	    {
            	    match(input,RULE_S_BYTE_CHAR_VALUE,FOLLOW_RULE_S_BYTE_CHAR_VALUE_in_rule__S_Byte_Char_Str__Group__1__Impl4697); 

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getS_Byte_Char_StrAccess().getS_BYTE_CHAR_VALUETerminalRuleCall_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S_Byte_Char_Str__Group__1__Impl"


    // $ANTLR start "rule__S_Byte_Char_Str__Group__2"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2257:1: rule__S_Byte_Char_Str__Group__2 : rule__S_Byte_Char_Str__Group__2__Impl ;
    public final void rule__S_Byte_Char_Str__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2261:1: ( rule__S_Byte_Char_Str__Group__2__Impl )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2262:2: rule__S_Byte_Char_Str__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__S_Byte_Char_Str__Group__2__Impl_in_rule__S_Byte_Char_Str__Group__24730);
            rule__S_Byte_Char_Str__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S_Byte_Char_Str__Group__2"


    // $ANTLR start "rule__S_Byte_Char_Str__Group__2__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2268:1: rule__S_Byte_Char_Str__Group__2__Impl : ( '\\'' ) ;
    public final void rule__S_Byte_Char_Str__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2272:1: ( ( '\\'' ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2273:1: ( '\\'' )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2273:1: ( '\\'' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2274:1: '\\''
            {
             before(grammarAccess.getS_Byte_Char_StrAccess().getApostropheKeyword_2()); 
            match(input,71,FOLLOW_71_in_rule__S_Byte_Char_Str__Group__2__Impl4758); 
             after(grammarAccess.getS_Byte_Char_StrAccess().getApostropheKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S_Byte_Char_Str__Group__2__Impl"


    // $ANTLR start "rule__D_Byte_Char_Str__Group__0"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2293:1: rule__D_Byte_Char_Str__Group__0 : rule__D_Byte_Char_Str__Group__0__Impl rule__D_Byte_Char_Str__Group__1 ;
    public final void rule__D_Byte_Char_Str__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2297:1: ( rule__D_Byte_Char_Str__Group__0__Impl rule__D_Byte_Char_Str__Group__1 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2298:2: rule__D_Byte_Char_Str__Group__0__Impl rule__D_Byte_Char_Str__Group__1
            {
            pushFollow(FOLLOW_rule__D_Byte_Char_Str__Group__0__Impl_in_rule__D_Byte_Char_Str__Group__04795);
            rule__D_Byte_Char_Str__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__D_Byte_Char_Str__Group__1_in_rule__D_Byte_Char_Str__Group__04798);
            rule__D_Byte_Char_Str__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__D_Byte_Char_Str__Group__0"


    // $ANTLR start "rule__D_Byte_Char_Str__Group__0__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2305:1: rule__D_Byte_Char_Str__Group__0__Impl : ( '\"' ) ;
    public final void rule__D_Byte_Char_Str__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2309:1: ( ( '\"' ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2310:1: ( '\"' )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2310:1: ( '\"' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2311:1: '\"'
            {
             before(grammarAccess.getD_Byte_Char_StrAccess().getQuotationMarkKeyword_0()); 
            match(input,72,FOLLOW_72_in_rule__D_Byte_Char_Str__Group__0__Impl4826); 
             after(grammarAccess.getD_Byte_Char_StrAccess().getQuotationMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__D_Byte_Char_Str__Group__0__Impl"


    // $ANTLR start "rule__D_Byte_Char_Str__Group__1"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2324:1: rule__D_Byte_Char_Str__Group__1 : rule__D_Byte_Char_Str__Group__1__Impl rule__D_Byte_Char_Str__Group__2 ;
    public final void rule__D_Byte_Char_Str__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2328:1: ( rule__D_Byte_Char_Str__Group__1__Impl rule__D_Byte_Char_Str__Group__2 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2329:2: rule__D_Byte_Char_Str__Group__1__Impl rule__D_Byte_Char_Str__Group__2
            {
            pushFollow(FOLLOW_rule__D_Byte_Char_Str__Group__1__Impl_in_rule__D_Byte_Char_Str__Group__14857);
            rule__D_Byte_Char_Str__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__D_Byte_Char_Str__Group__2_in_rule__D_Byte_Char_Str__Group__14860);
            rule__D_Byte_Char_Str__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__D_Byte_Char_Str__Group__1"


    // $ANTLR start "rule__D_Byte_Char_Str__Group__1__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2336:1: rule__D_Byte_Char_Str__Group__1__Impl : ( ( ( RULE_D_BYTE_CHAR_VALUE ) ) ( ( RULE_D_BYTE_CHAR_VALUE )* ) ) ;
    public final void rule__D_Byte_Char_Str__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2340:1: ( ( ( ( RULE_D_BYTE_CHAR_VALUE ) ) ( ( RULE_D_BYTE_CHAR_VALUE )* ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2341:1: ( ( ( RULE_D_BYTE_CHAR_VALUE ) ) ( ( RULE_D_BYTE_CHAR_VALUE )* ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2341:1: ( ( ( RULE_D_BYTE_CHAR_VALUE ) ) ( ( RULE_D_BYTE_CHAR_VALUE )* ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2342:1: ( ( RULE_D_BYTE_CHAR_VALUE ) ) ( ( RULE_D_BYTE_CHAR_VALUE )* )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2342:1: ( ( RULE_D_BYTE_CHAR_VALUE ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2343:1: ( RULE_D_BYTE_CHAR_VALUE )
            {
             before(grammarAccess.getD_Byte_Char_StrAccess().getD_BYTE_CHAR_VALUETerminalRuleCall_1()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2344:1: ( RULE_D_BYTE_CHAR_VALUE )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2344:3: RULE_D_BYTE_CHAR_VALUE
            {
            match(input,RULE_D_BYTE_CHAR_VALUE,FOLLOW_RULE_D_BYTE_CHAR_VALUE_in_rule__D_Byte_Char_Str__Group__1__Impl4890); 

            }

             after(grammarAccess.getD_Byte_Char_StrAccess().getD_BYTE_CHAR_VALUETerminalRuleCall_1()); 

            }

            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2347:1: ( ( RULE_D_BYTE_CHAR_VALUE )* )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2348:1: ( RULE_D_BYTE_CHAR_VALUE )*
            {
             before(grammarAccess.getD_Byte_Char_StrAccess().getD_BYTE_CHAR_VALUETerminalRuleCall_1()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2349:1: ( RULE_D_BYTE_CHAR_VALUE )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_D_BYTE_CHAR_VALUE) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2349:3: RULE_D_BYTE_CHAR_VALUE
            	    {
            	    match(input,RULE_D_BYTE_CHAR_VALUE,FOLLOW_RULE_D_BYTE_CHAR_VALUE_in_rule__D_Byte_Char_Str__Group__1__Impl4903); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getD_Byte_Char_StrAccess().getD_BYTE_CHAR_VALUETerminalRuleCall_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__D_Byte_Char_Str__Group__1__Impl"


    // $ANTLR start "rule__D_Byte_Char_Str__Group__2"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2360:1: rule__D_Byte_Char_Str__Group__2 : rule__D_Byte_Char_Str__Group__2__Impl ;
    public final void rule__D_Byte_Char_Str__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2364:1: ( rule__D_Byte_Char_Str__Group__2__Impl )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2365:2: rule__D_Byte_Char_Str__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__D_Byte_Char_Str__Group__2__Impl_in_rule__D_Byte_Char_Str__Group__24936);
            rule__D_Byte_Char_Str__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__D_Byte_Char_Str__Group__2"


    // $ANTLR start "rule__D_Byte_Char_Str__Group__2__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2371:1: rule__D_Byte_Char_Str__Group__2__Impl : ( '\"' ) ;
    public final void rule__D_Byte_Char_Str__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2375:1: ( ( '\"' ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2376:1: ( '\"' )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2376:1: ( '\"' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2377:1: '\"'
            {
             before(grammarAccess.getD_Byte_Char_StrAccess().getQuotationMarkKeyword_2()); 
            match(input,72,FOLLOW_72_in_rule__D_Byte_Char_Str__Group__2__Impl4964); 
             after(grammarAccess.getD_Byte_Char_StrAccess().getQuotationMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__D_Byte_Char_Str__Group__2__Impl"


    // $ANTLR start "rule__Duration_Value__Group__0"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2396:1: rule__Duration_Value__Group__0 : rule__Duration_Value__Group__0__Impl rule__Duration_Value__Group__1 ;
    public final void rule__Duration_Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2400:1: ( rule__Duration_Value__Group__0__Impl rule__Duration_Value__Group__1 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2401:2: rule__Duration_Value__Group__0__Impl rule__Duration_Value__Group__1
            {
            pushFollow(FOLLOW_rule__Duration_Value__Group__0__Impl_in_rule__Duration_Value__Group__05001);
            rule__Duration_Value__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Duration_Value__Group__1_in_rule__Duration_Value__Group__05004);
            rule__Duration_Value__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration_Value__Group__0"


    // $ANTLR start "rule__Duration_Value__Group__0__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2408:1: rule__Duration_Value__Group__0__Impl : ( ( rule__Duration_Value__Alternatives_0 ) ) ;
    public final void rule__Duration_Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2412:1: ( ( ( rule__Duration_Value__Alternatives_0 ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2413:1: ( ( rule__Duration_Value__Alternatives_0 ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2413:1: ( ( rule__Duration_Value__Alternatives_0 ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2414:1: ( rule__Duration_Value__Alternatives_0 )
            {
             before(grammarAccess.getDuration_ValueAccess().getAlternatives_0()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2415:1: ( rule__Duration_Value__Alternatives_0 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2415:2: rule__Duration_Value__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Duration_Value__Alternatives_0_in_rule__Duration_Value__Group__0__Impl5031);
            rule__Duration_Value__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getDuration_ValueAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration_Value__Group__0__Impl"


    // $ANTLR start "rule__Duration_Value__Group__1"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2425:1: rule__Duration_Value__Group__1 : rule__Duration_Value__Group__1__Impl rule__Duration_Value__Group__2 ;
    public final void rule__Duration_Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2429:1: ( rule__Duration_Value__Group__1__Impl rule__Duration_Value__Group__2 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2430:2: rule__Duration_Value__Group__1__Impl rule__Duration_Value__Group__2
            {
            pushFollow(FOLLOW_rule__Duration_Value__Group__1__Impl_in_rule__Duration_Value__Group__15061);
            rule__Duration_Value__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Duration_Value__Group__2_in_rule__Duration_Value__Group__15064);
            rule__Duration_Value__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration_Value__Group__1"


    // $ANTLR start "rule__Duration_Value__Group__1__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2437:1: rule__Duration_Value__Group__1__Impl : ( '#' ) ;
    public final void rule__Duration_Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2441:1: ( ( '#' ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2442:1: ( '#' )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2442:1: ( '#' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2443:1: '#'
            {
             before(grammarAccess.getDuration_ValueAccess().getNumberSignKeyword_1()); 
            match(input,69,FOLLOW_69_in_rule__Duration_Value__Group__1__Impl5092); 
             after(grammarAccess.getDuration_ValueAccess().getNumberSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration_Value__Group__1__Impl"


    // $ANTLR start "rule__Duration_Value__Group__2"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2456:1: rule__Duration_Value__Group__2 : rule__Duration_Value__Group__2__Impl rule__Duration_Value__Group__3 ;
    public final void rule__Duration_Value__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2460:1: ( rule__Duration_Value__Group__2__Impl rule__Duration_Value__Group__3 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2461:2: rule__Duration_Value__Group__2__Impl rule__Duration_Value__Group__3
            {
            pushFollow(FOLLOW_rule__Duration_Value__Group__2__Impl_in_rule__Duration_Value__Group__25123);
            rule__Duration_Value__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Duration_Value__Group__3_in_rule__Duration_Value__Group__25126);
            rule__Duration_Value__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration_Value__Group__2"


    // $ANTLR start "rule__Duration_Value__Group__2__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2468:1: rule__Duration_Value__Group__2__Impl : ( ( rule__Duration_Value__Alternatives_2 )? ) ;
    public final void rule__Duration_Value__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2472:1: ( ( ( rule__Duration_Value__Alternatives_2 )? ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2473:1: ( ( rule__Duration_Value__Alternatives_2 )? )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2473:1: ( ( rule__Duration_Value__Alternatives_2 )? )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2474:1: ( rule__Duration_Value__Alternatives_2 )?
            {
             before(grammarAccess.getDuration_ValueAccess().getAlternatives_2()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2475:1: ( rule__Duration_Value__Alternatives_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=45 && LA27_0<=46)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2475:2: rule__Duration_Value__Alternatives_2
                    {
                    pushFollow(FOLLOW_rule__Duration_Value__Alternatives_2_in_rule__Duration_Value__Group__2__Impl5153);
                    rule__Duration_Value__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDuration_ValueAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration_Value__Group__2__Impl"


    // $ANTLR start "rule__Duration_Value__Group__3"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2485:1: rule__Duration_Value__Group__3 : rule__Duration_Value__Group__3__Impl ;
    public final void rule__Duration_Value__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2489:1: ( rule__Duration_Value__Group__3__Impl )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2490:2: rule__Duration_Value__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Duration_Value__Group__3__Impl_in_rule__Duration_Value__Group__35184);
            rule__Duration_Value__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration_Value__Group__3"


    // $ANTLR start "rule__Duration_Value__Group__3__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2496:1: rule__Duration_Value__Group__3__Impl : ( RULE_INTERVAL ) ;
    public final void rule__Duration_Value__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2500:1: ( ( RULE_INTERVAL ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2501:1: ( RULE_INTERVAL )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2501:1: ( RULE_INTERVAL )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2502:1: RULE_INTERVAL
            {
             before(grammarAccess.getDuration_ValueAccess().getINTERVALTerminalRuleCall_3()); 
            match(input,RULE_INTERVAL,FOLLOW_RULE_INTERVAL_in_rule__Duration_Value__Group__3__Impl5211); 
             after(grammarAccess.getDuration_ValueAccess().getINTERVALTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration_Value__Group__3__Impl"


    // $ANTLR start "rule__Time_Of_Day_Value__Group__0"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2521:1: rule__Time_Of_Day_Value__Group__0 : rule__Time_Of_Day_Value__Group__0__Impl rule__Time_Of_Day_Value__Group__1 ;
    public final void rule__Time_Of_Day_Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2525:1: ( rule__Time_Of_Day_Value__Group__0__Impl rule__Time_Of_Day_Value__Group__1 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2526:2: rule__Time_Of_Day_Value__Group__0__Impl rule__Time_Of_Day_Value__Group__1
            {
            pushFollow(FOLLOW_rule__Time_Of_Day_Value__Group__0__Impl_in_rule__Time_Of_Day_Value__Group__05248);
            rule__Time_Of_Day_Value__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Time_Of_Day_Value__Group__1_in_rule__Time_Of_Day_Value__Group__05251);
            rule__Time_Of_Day_Value__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time_Of_Day_Value__Group__0"


    // $ANTLR start "rule__Time_Of_Day_Value__Group__0__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2533:1: rule__Time_Of_Day_Value__Group__0__Impl : ( ( rule__Time_Of_Day_Value__Alternatives_0 ) ) ;
    public final void rule__Time_Of_Day_Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2537:1: ( ( ( rule__Time_Of_Day_Value__Alternatives_0 ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2538:1: ( ( rule__Time_Of_Day_Value__Alternatives_0 ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2538:1: ( ( rule__Time_Of_Day_Value__Alternatives_0 ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2539:1: ( rule__Time_Of_Day_Value__Alternatives_0 )
            {
             before(grammarAccess.getTime_Of_Day_ValueAccess().getAlternatives_0()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2540:1: ( rule__Time_Of_Day_Value__Alternatives_0 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2540:2: rule__Time_Of_Day_Value__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Time_Of_Day_Value__Alternatives_0_in_rule__Time_Of_Day_Value__Group__0__Impl5278);
            rule__Time_Of_Day_Value__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTime_Of_Day_ValueAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time_Of_Day_Value__Group__0__Impl"


    // $ANTLR start "rule__Time_Of_Day_Value__Group__1"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2550:1: rule__Time_Of_Day_Value__Group__1 : rule__Time_Of_Day_Value__Group__1__Impl rule__Time_Of_Day_Value__Group__2 ;
    public final void rule__Time_Of_Day_Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2554:1: ( rule__Time_Of_Day_Value__Group__1__Impl rule__Time_Of_Day_Value__Group__2 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2555:2: rule__Time_Of_Day_Value__Group__1__Impl rule__Time_Of_Day_Value__Group__2
            {
            pushFollow(FOLLOW_rule__Time_Of_Day_Value__Group__1__Impl_in_rule__Time_Of_Day_Value__Group__15308);
            rule__Time_Of_Day_Value__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Time_Of_Day_Value__Group__2_in_rule__Time_Of_Day_Value__Group__15311);
            rule__Time_Of_Day_Value__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time_Of_Day_Value__Group__1"


    // $ANTLR start "rule__Time_Of_Day_Value__Group__1__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2562:1: rule__Time_Of_Day_Value__Group__1__Impl : ( '#' ) ;
    public final void rule__Time_Of_Day_Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2566:1: ( ( '#' ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2567:1: ( '#' )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2567:1: ( '#' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2568:1: '#'
            {
             before(grammarAccess.getTime_Of_Day_ValueAccess().getNumberSignKeyword_1()); 
            match(input,69,FOLLOW_69_in_rule__Time_Of_Day_Value__Group__1__Impl5339); 
             after(grammarAccess.getTime_Of_Day_ValueAccess().getNumberSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time_Of_Day_Value__Group__1__Impl"


    // $ANTLR start "rule__Time_Of_Day_Value__Group__2"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2581:1: rule__Time_Of_Day_Value__Group__2 : rule__Time_Of_Day_Value__Group__2__Impl ;
    public final void rule__Time_Of_Day_Value__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2585:1: ( rule__Time_Of_Day_Value__Group__2__Impl )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2586:2: rule__Time_Of_Day_Value__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Time_Of_Day_Value__Group__2__Impl_in_rule__Time_Of_Day_Value__Group__25370);
            rule__Time_Of_Day_Value__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time_Of_Day_Value__Group__2"


    // $ANTLR start "rule__Time_Of_Day_Value__Group__2__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2592:1: rule__Time_Of_Day_Value__Group__2__Impl : ( RULE_DAYTIME_VALUE ) ;
    public final void rule__Time_Of_Day_Value__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2596:1: ( ( RULE_DAYTIME_VALUE ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2597:1: ( RULE_DAYTIME_VALUE )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2597:1: ( RULE_DAYTIME_VALUE )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2598:1: RULE_DAYTIME_VALUE
            {
             before(grammarAccess.getTime_Of_Day_ValueAccess().getDAYTIME_VALUETerminalRuleCall_2()); 
            match(input,RULE_DAYTIME_VALUE,FOLLOW_RULE_DAYTIME_VALUE_in_rule__Time_Of_Day_Value__Group__2__Impl5397); 
             after(grammarAccess.getTime_Of_Day_ValueAccess().getDAYTIME_VALUETerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time_Of_Day_Value__Group__2__Impl"


    // $ANTLR start "rule__Date_And_Time_Value__Group__0"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2615:1: rule__Date_And_Time_Value__Group__0 : rule__Date_And_Time_Value__Group__0__Impl rule__Date_And_Time_Value__Group__1 ;
    public final void rule__Date_And_Time_Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2619:1: ( rule__Date_And_Time_Value__Group__0__Impl rule__Date_And_Time_Value__Group__1 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2620:2: rule__Date_And_Time_Value__Group__0__Impl rule__Date_And_Time_Value__Group__1
            {
            pushFollow(FOLLOW_rule__Date_And_Time_Value__Group__0__Impl_in_rule__Date_And_Time_Value__Group__05432);
            rule__Date_And_Time_Value__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Date_And_Time_Value__Group__1_in_rule__Date_And_Time_Value__Group__05435);
            rule__Date_And_Time_Value__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date_And_Time_Value__Group__0"


    // $ANTLR start "rule__Date_And_Time_Value__Group__0__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2627:1: rule__Date_And_Time_Value__Group__0__Impl : ( ( rule__Date_And_Time_Value__Alternatives_0 ) ) ;
    public final void rule__Date_And_Time_Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2631:1: ( ( ( rule__Date_And_Time_Value__Alternatives_0 ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2632:1: ( ( rule__Date_And_Time_Value__Alternatives_0 ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2632:1: ( ( rule__Date_And_Time_Value__Alternatives_0 ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2633:1: ( rule__Date_And_Time_Value__Alternatives_0 )
            {
             before(grammarAccess.getDate_And_Time_ValueAccess().getAlternatives_0()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2634:1: ( rule__Date_And_Time_Value__Alternatives_0 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2634:2: rule__Date_And_Time_Value__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Date_And_Time_Value__Alternatives_0_in_rule__Date_And_Time_Value__Group__0__Impl5462);
            rule__Date_And_Time_Value__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getDate_And_Time_ValueAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date_And_Time_Value__Group__0__Impl"


    // $ANTLR start "rule__Date_And_Time_Value__Group__1"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2644:1: rule__Date_And_Time_Value__Group__1 : rule__Date_And_Time_Value__Group__1__Impl rule__Date_And_Time_Value__Group__2 ;
    public final void rule__Date_And_Time_Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2648:1: ( rule__Date_And_Time_Value__Group__1__Impl rule__Date_And_Time_Value__Group__2 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2649:2: rule__Date_And_Time_Value__Group__1__Impl rule__Date_And_Time_Value__Group__2
            {
            pushFollow(FOLLOW_rule__Date_And_Time_Value__Group__1__Impl_in_rule__Date_And_Time_Value__Group__15492);
            rule__Date_And_Time_Value__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Date_And_Time_Value__Group__2_in_rule__Date_And_Time_Value__Group__15495);
            rule__Date_And_Time_Value__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date_And_Time_Value__Group__1"


    // $ANTLR start "rule__Date_And_Time_Value__Group__1__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2656:1: rule__Date_And_Time_Value__Group__1__Impl : ( '#' ) ;
    public final void rule__Date_And_Time_Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2660:1: ( ( '#' ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2661:1: ( '#' )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2661:1: ( '#' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2662:1: '#'
            {
             before(grammarAccess.getDate_And_Time_ValueAccess().getNumberSignKeyword_1()); 
            match(input,69,FOLLOW_69_in_rule__Date_And_Time_Value__Group__1__Impl5523); 
             after(grammarAccess.getDate_And_Time_ValueAccess().getNumberSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date_And_Time_Value__Group__1__Impl"


    // $ANTLR start "rule__Date_And_Time_Value__Group__2"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2675:1: rule__Date_And_Time_Value__Group__2 : rule__Date_And_Time_Value__Group__2__Impl rule__Date_And_Time_Value__Group__3 ;
    public final void rule__Date_And_Time_Value__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2679:1: ( rule__Date_And_Time_Value__Group__2__Impl rule__Date_And_Time_Value__Group__3 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2680:2: rule__Date_And_Time_Value__Group__2__Impl rule__Date_And_Time_Value__Group__3
            {
            pushFollow(FOLLOW_rule__Date_And_Time_Value__Group__2__Impl_in_rule__Date_And_Time_Value__Group__25554);
            rule__Date_And_Time_Value__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Date_And_Time_Value__Group__3_in_rule__Date_And_Time_Value__Group__25557);
            rule__Date_And_Time_Value__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date_And_Time_Value__Group__2"


    // $ANTLR start "rule__Date_And_Time_Value__Group__2__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2687:1: rule__Date_And_Time_Value__Group__2__Impl : ( RULE_DATE_LITERAL ) ;
    public final void rule__Date_And_Time_Value__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2691:1: ( ( RULE_DATE_LITERAL ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2692:1: ( RULE_DATE_LITERAL )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2692:1: ( RULE_DATE_LITERAL )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2693:1: RULE_DATE_LITERAL
            {
             before(grammarAccess.getDate_And_Time_ValueAccess().getDATE_LITERALTerminalRuleCall_2()); 
            match(input,RULE_DATE_LITERAL,FOLLOW_RULE_DATE_LITERAL_in_rule__Date_And_Time_Value__Group__2__Impl5584); 
             after(grammarAccess.getDate_And_Time_ValueAccess().getDATE_LITERALTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date_And_Time_Value__Group__2__Impl"


    // $ANTLR start "rule__Date_And_Time_Value__Group__3"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2704:1: rule__Date_And_Time_Value__Group__3 : rule__Date_And_Time_Value__Group__3__Impl rule__Date_And_Time_Value__Group__4 ;
    public final void rule__Date_And_Time_Value__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2708:1: ( rule__Date_And_Time_Value__Group__3__Impl rule__Date_And_Time_Value__Group__4 )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2709:2: rule__Date_And_Time_Value__Group__3__Impl rule__Date_And_Time_Value__Group__4
            {
            pushFollow(FOLLOW_rule__Date_And_Time_Value__Group__3__Impl_in_rule__Date_And_Time_Value__Group__35613);
            rule__Date_And_Time_Value__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Date_And_Time_Value__Group__4_in_rule__Date_And_Time_Value__Group__35616);
            rule__Date_And_Time_Value__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date_And_Time_Value__Group__3"


    // $ANTLR start "rule__Date_And_Time_Value__Group__3__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2716:1: rule__Date_And_Time_Value__Group__3__Impl : ( '-' ) ;
    public final void rule__Date_And_Time_Value__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2720:1: ( ( '-' ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2721:1: ( '-' )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2721:1: ( '-' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2722:1: '-'
            {
             before(grammarAccess.getDate_And_Time_ValueAccess().getHyphenMinusKeyword_3()); 
            match(input,46,FOLLOW_46_in_rule__Date_And_Time_Value__Group__3__Impl5644); 
             after(grammarAccess.getDate_And_Time_ValueAccess().getHyphenMinusKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date_And_Time_Value__Group__3__Impl"


    // $ANTLR start "rule__Date_And_Time_Value__Group__4"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2735:1: rule__Date_And_Time_Value__Group__4 : rule__Date_And_Time_Value__Group__4__Impl ;
    public final void rule__Date_And_Time_Value__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2739:1: ( rule__Date_And_Time_Value__Group__4__Impl )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2740:2: rule__Date_And_Time_Value__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Date_And_Time_Value__Group__4__Impl_in_rule__Date_And_Time_Value__Group__45675);
            rule__Date_And_Time_Value__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date_And_Time_Value__Group__4"


    // $ANTLR start "rule__Date_And_Time_Value__Group__4__Impl"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2746:1: rule__Date_And_Time_Value__Group__4__Impl : ( RULE_DAYTIME_VALUE ) ;
    public final void rule__Date_And_Time_Value__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2750:1: ( ( RULE_DAYTIME_VALUE ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2751:1: ( RULE_DAYTIME_VALUE )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2751:1: ( RULE_DAYTIME_VALUE )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2752:1: RULE_DAYTIME_VALUE
            {
             before(grammarAccess.getDate_And_Time_ValueAccess().getDAYTIME_VALUETerminalRuleCall_4()); 
            match(input,RULE_DAYTIME_VALUE,FOLLOW_RULE_DAYTIME_VALUE_in_rule__Date_And_Time_Value__Group__4__Impl5702); 
             after(grammarAccess.getDate_And_Time_ValueAccess().getDAYTIME_VALUETerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date_And_Time_Value__Group__4__Impl"


    // $ANTLR start "rule__Test__TestAssignment"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2774:1: rule__Test__TestAssignment : ( ( 't' ) ) ;
    public final void rule__Test__TestAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2778:1: ( ( ( 't' ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2779:1: ( ( 't' ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2779:1: ( ( 't' ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2780:1: ( 't' )
            {
             before(grammarAccess.getTestAccess().getTestTKeyword_0()); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2781:1: ( 't' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2782:1: 't'
            {
             before(grammarAccess.getTestAccess().getTestTKeyword_0()); 
            match(input,73,FOLLOW_73_in_rule__Test__TestAssignment5751); 
             after(grammarAccess.getTestAccess().getTestTKeyword_0()); 

            }

             after(grammarAccess.getTestAccess().getTestTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__TestAssignment"


    // $ANTLR start "rule__Unsigned_Int__ValueAssignment"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2797:1: rule__Unsigned_Int__ValueAssignment : ( ruleUnsigned_Int_Value ) ;
    public final void rule__Unsigned_Int__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2801:1: ( ( ruleUnsigned_Int_Value ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2802:1: ( ruleUnsigned_Int_Value )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2802:1: ( ruleUnsigned_Int_Value )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2803:1: ruleUnsigned_Int_Value
            {
             before(grammarAccess.getUnsigned_IntAccess().getValueUnsigned_Int_ValueParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleUnsigned_Int_Value_in_rule__Unsigned_Int__ValueAssignment5790);
            ruleUnsigned_Int_Value();

            state._fsp--;

             after(grammarAccess.getUnsigned_IntAccess().getValueUnsigned_Int_ValueParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unsigned_Int__ValueAssignment"


    // $ANTLR start "rule__Signed_Int__ValueAssignment"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2812:1: rule__Signed_Int__ValueAssignment : ( ruleSigned_Int_Value ) ;
    public final void rule__Signed_Int__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2816:1: ( ( ruleSigned_Int_Value ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2817:1: ( ruleSigned_Int_Value )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2817:1: ( ruleSigned_Int_Value )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2818:1: ruleSigned_Int_Value
            {
             before(grammarAccess.getSigned_IntAccess().getValueSigned_Int_ValueParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSigned_Int_Value_in_rule__Signed_Int__ValueAssignment5821);
            ruleSigned_Int_Value();

            state._fsp--;

             after(grammarAccess.getSigned_IntAccess().getValueSigned_Int_ValueParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signed_Int__ValueAssignment"


    // $ANTLR start "rule__Real_Literal__ValueAssignment"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2827:1: rule__Real_Literal__ValueAssignment : ( ruleReal_Value ) ;
    public final void rule__Real_Literal__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2831:1: ( ( ruleReal_Value ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2832:1: ( ruleReal_Value )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2832:1: ( ruleReal_Value )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2833:1: ruleReal_Value
            {
             before(grammarAccess.getReal_LiteralAccess().getValueReal_ValueParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleReal_Value_in_rule__Real_Literal__ValueAssignment5852);
            ruleReal_Value();

            state._fsp--;

             after(grammarAccess.getReal_LiteralAccess().getValueReal_ValueParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_Literal__ValueAssignment"


    // $ANTLR start "rule__Bit_Str_Literal__ValueAssignment"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2842:1: rule__Bit_Str_Literal__ValueAssignment : ( ruleBit_Str_Value ) ;
    public final void rule__Bit_Str_Literal__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2846:1: ( ( ruleBit_Str_Value ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2847:1: ( ruleBit_Str_Value )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2847:1: ( ruleBit_Str_Value )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2848:1: ruleBit_Str_Value
            {
             before(grammarAccess.getBit_Str_LiteralAccess().getValueBit_Str_ValueParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBit_Str_Value_in_rule__Bit_Str_Literal__ValueAssignment5883);
            ruleBit_Str_Value();

            state._fsp--;

             after(grammarAccess.getBit_Str_LiteralAccess().getValueBit_Str_ValueParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bit_Str_Literal__ValueAssignment"


    // $ANTLR start "rule__Bool_Literal__ValueAssignment"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2857:1: rule__Bool_Literal__ValueAssignment : ( ruleBool_Value ) ;
    public final void rule__Bool_Literal__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2861:1: ( ( ruleBool_Value ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2862:1: ( ruleBool_Value )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2862:1: ( ruleBool_Value )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2863:1: ruleBool_Value
            {
             before(grammarAccess.getBool_LiteralAccess().getValueBool_ValueParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBool_Value_in_rule__Bool_Literal__ValueAssignment5914);
            ruleBool_Value();

            state._fsp--;

             after(grammarAccess.getBool_LiteralAccess().getValueBool_ValueParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool_Literal__ValueAssignment"


    // $ANTLR start "rule__Char_Literal__ValueAssignment"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2872:1: rule__Char_Literal__ValueAssignment : ( ruleChar_Value ) ;
    public final void rule__Char_Literal__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2876:1: ( ( ruleChar_Value ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2877:1: ( ruleChar_Value )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2877:1: ( ruleChar_Value )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2878:1: ruleChar_Value
            {
             before(grammarAccess.getChar_LiteralAccess().getValueChar_ValueParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleChar_Value_in_rule__Char_Literal__ValueAssignment5945);
            ruleChar_Value();

            state._fsp--;

             after(grammarAccess.getChar_LiteralAccess().getValueChar_ValueParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Char_Literal__ValueAssignment"


    // $ANTLR start "rule__Duration__ValueAssignment"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2887:1: rule__Duration__ValueAssignment : ( ruleDuration_Value ) ;
    public final void rule__Duration__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2891:1: ( ( ruleDuration_Value ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2892:1: ( ruleDuration_Value )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2892:1: ( ruleDuration_Value )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2893:1: ruleDuration_Value
            {
             before(grammarAccess.getDurationAccess().getValueDuration_ValueParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleDuration_Value_in_rule__Duration__ValueAssignment5976);
            ruleDuration_Value();

            state._fsp--;

             after(grammarAccess.getDurationAccess().getValueDuration_ValueParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__ValueAssignment"


    // $ANTLR start "rule__Time_Of_Day__ValueAssignment"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2902:1: rule__Time_Of_Day__ValueAssignment : ( ruleTime_Of_Day_Value ) ;
    public final void rule__Time_Of_Day__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2906:1: ( ( ruleTime_Of_Day_Value ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2907:1: ( ruleTime_Of_Day_Value )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2907:1: ( ruleTime_Of_Day_Value )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2908:1: ruleTime_Of_Day_Value
            {
             before(grammarAccess.getTime_Of_DayAccess().getValueTime_Of_Day_ValueParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTime_Of_Day_Value_in_rule__Time_Of_Day__ValueAssignment6007);
            ruleTime_Of_Day_Value();

            state._fsp--;

             after(grammarAccess.getTime_Of_DayAccess().getValueTime_Of_Day_ValueParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time_Of_Day__ValueAssignment"


    // $ANTLR start "rule__Date__ValueAssignment"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2918:1: rule__Date__ValueAssignment : ( RULE_DATE_VALUE ) ;
    public final void rule__Date__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2922:1: ( ( RULE_DATE_VALUE ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2923:1: ( RULE_DATE_VALUE )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2923:1: ( RULE_DATE_VALUE )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2924:1: RULE_DATE_VALUE
            {
             before(grammarAccess.getDateAccess().getValueDATE_VALUETerminalRuleCall_0()); 
            match(input,RULE_DATE_VALUE,FOLLOW_RULE_DATE_VALUE_in_rule__Date__ValueAssignment6039); 
             after(grammarAccess.getDateAccess().getValueDATE_VALUETerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__ValueAssignment"


    // $ANTLR start "rule__Date_And_Time__ValueAssignment"
    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2933:1: rule__Date_And_Time__ValueAssignment : ( ruleDate_And_Time_Value ) ;
    public final void rule__Date_And_Time__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2937:1: ( ( ruleDate_And_Time_Value ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2938:1: ( ruleDate_And_Time_Value )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2938:1: ( ruleDate_And_Time_Value )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2939:1: ruleDate_And_Time_Value
            {
             before(grammarAccess.getDate_And_TimeAccess().getValueDate_And_Time_ValueParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleDate_And_Time_Value_in_rule__Date_And_Time__ValueAssignment6070);
            ruleDate_And_Time_Value();

            state._fsp--;

             after(grammarAccess.getDate_And_TimeAccess().getValueDate_And_Time_ValueParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date_And_Time__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruletest_in_entryRuletest61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletest68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__TestAssignment_in_ruletest94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeric_Literal_in_entryRuleNumeric_Literal123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumeric_Literal130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Numeric_Literal__Alternatives_in_ruleNumeric_Literal156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInt_Literal_in_entryRuleInt_Literal183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInt_Literal190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Int_Literal__Alternatives_in_ruleInt_Literal216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnsigned_Int_Type_Name_in_entryRuleUnsigned_Int_Type_Name245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnsigned_Int_Type_Name252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unsigned_Int_Type_Name__Alternatives_in_ruleUnsigned_Int_Type_Name278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigned_Int_Type_Name_in_entryRuleSigned_Int_Type_Name305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSigned_Int_Type_Name312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signed_Int_Type_Name__Alternatives_in_ruleSigned_Int_Type_Name338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnsigned_Int_in_entryRuleUnsigned_Int365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnsigned_Int372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unsigned_Int__ValueAssignment_in_ruleUnsigned_Int398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnsigned_Int_Value_in_entryRuleUnsigned_Int_Value425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnsigned_Int_Value432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unsigned_Int_Value__Group__0_in_ruleUnsigned_Int_Value458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigned_Int_in_entryRuleSigned_Int485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSigned_Int492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signed_Int__ValueAssignment_in_ruleSigned_Int518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigned_Int_Value_in_entryRuleSigned_Int_Value545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSigned_Int_Value552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signed_Int_Value__Group__0_in_ruleSigned_Int_Value578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_Literal_in_entryRuleReal_Literal605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReal_Literal612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real_Literal__ValueAssignment_in_ruleReal_Literal638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_Type_Name_in_entryRuleReal_Type_Name665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReal_Type_Name672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real_Type_Name__Alternatives_in_ruleReal_Type_Name698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_Value_in_entryRuleReal_Value725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReal_Value732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real_Value__Group__0_in_ruleReal_Value758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBit_Str_Literal_in_entryRuleBit_Str_Literal785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBit_Str_Literal792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bit_Str_Literal__ValueAssignment_in_ruleBit_Str_Literal818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultibits_Type_Name_in_entryRuleMultibits_Type_Name845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultibits_Type_Name852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multibits_Type_Name__Alternatives_in_ruleMultibits_Type_Name878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBit_Str_Value_in_entryRuleBit_Str_Value905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBit_Str_Value912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bit_Str_Value__Group__0_in_ruleBit_Str_Value938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_Literal_in_entryRuleBool_Literal965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBool_Literal972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bool_Literal__ValueAssignment_in_ruleBool_Literal998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_Value_in_entryRuleBool_Value1025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBool_Value1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bool_Value__Group__0_in_ruleBool_Value1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_Type_Name_in_entryRuleBool_Type_Name1085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBool_Type_Name1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleBool_Type_Name1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChar_Literal_in_entryRuleChar_Literal1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChar_Literal1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Char_Literal__ValueAssignment_in_ruleChar_Literal1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChar_Value_in_entryRuleChar_Value1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChar_Value1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Char_Value__Group__0_in_ruleChar_Value1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChar_Str_in_entryRuleChar_Str1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChar_Str1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Char_Str__Alternatives_in_ruleChar_Str1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleS_Byte_Char_Str_in_entryRuleS_Byte_Char_Str1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleS_Byte_Char_Str1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__S_Byte_Char_Str__Group__0_in_ruleS_Byte_Char_Str1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleD_Byte_Char_Str_in_entryRuleD_Byte_Char_Str1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleD_Byte_Char_Str1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__D_Byte_Char_Str__Group__0_in_ruleD_Byte_Char_Str1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTime_Type_Name_in_entryRuleTime_Type_Name1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTime_Type_Name1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Time_Type_Name__Alternatives_in_ruleTime_Type_Name1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTod_Type_Name_in_entryRuleTod_Type_Name1507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTod_Type_Name1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tod_Type_Name__Alternatives_in_ruleTod_Type_Name1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTime_Literal_in_entryRuleTime_Literal1571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTime_Literal1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Time_Literal__Alternatives_in_ruleTime_Literal1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDuration_in_entryRuleDuration1631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDuration1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Duration__ValueAssignment_in_ruleDuration1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDuration_Value_in_entryRuleDuration_Value1691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDuration_Value1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Duration_Value__Group__0_in_ruleDuration_Value1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTime_Of_Day_in_entryRuleTime_Of_Day1751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTime_Of_Day1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Time_Of_Day__ValueAssignment_in_ruleTime_Of_Day1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTime_Of_Day_Value_in_entryRuleTime_Of_Day_Value1811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTime_Of_Day_Value1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Time_Of_Day_Value__Group__0_in_ruleTime_Of_Day_Value1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_entryRuleDate1873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDate1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__ValueAssignment_in_ruleDate1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_And_Time_in_entryRuleDate_And_Time1933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDate_And_Time1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date_And_Time__ValueAssignment_in_ruleDate_And_Time1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_And_Time_Value_in_entryRuleDate_And_Time_Value1993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDate_And_Time_Value2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date_And_Time_Value__Group__0_in_ruleDate_And_Time_Value2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInt_Literal_in_rule__Numeric_Literal__Alternatives2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_Literal_in_rule__Numeric_Literal__Alternatives2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigned_Int_in_rule__Int_Literal__Alternatives2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnsigned_Int_in_rule__Int_Literal__Alternatives2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Unsigned_Int_Type_Name__Alternatives2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Unsigned_Int_Type_Name__Alternatives2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Unsigned_Int_Type_Name__Alternatives2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Unsigned_Int_Type_Name__Alternatives2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Signed_Int_Type_Name__Alternatives2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Signed_Int_Type_Name__Alternatives2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Signed_Int_Type_Name__Alternatives2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Signed_Int_Type_Name__Alternatives2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BIN_VALUE_in_rule__Unsigned_Int_Value__Alternatives_12352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OCT_VALUE_in_rule__Unsigned_Int_Value__Alternatives_12369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEC_VALUE_in_rule__Unsigned_Int_Value__Alternatives_12386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_VALUE_in_rule__Unsigned_Int_Value__Alternatives_12403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BIN_VALUE_in_rule__Signed_Int_Value__Alternatives_12435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OCT_VALUE_in_rule__Signed_Int_Value__Alternatives_12452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signed_Int_Value__Group_1_2__0_in_rule__Signed_Int_Value__Alternatives_12469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_VALUE_in_rule__Signed_Int_Value__Alternatives_12487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Signed_Int_Value__Alternatives_1_2_02520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Signed_Int_Value__Alternatives_1_2_02540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Real_Type_Name__Alternatives2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Real_Type_Name__Alternatives2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Real_Value__Alternatives_12630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Real_Value__Alternatives_12650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Multibits_Type_Name__Alternatives2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Multibits_Type_Name__Alternatives2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Multibits_Type_Name__Alternatives2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Multibits_Type_Name__Alternatives2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BIN_VALUE_in_rule__Bit_Str_Value__Alternatives_22779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OCT_VALUE_in_rule__Bit_Str_Value__Alternatives_22796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEC_VALUE_in_rule__Bit_Str_Value__Alternatives_22813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_VALUE_in_rule__Bit_Str_Value__Alternatives_22830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Bool_Value__Alternatives_12863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Bool_Value__Alternatives_12883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Bool_Value__Alternatives_12903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Bool_Value__Alternatives_12923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleS_Byte_Char_Str_in_rule__Char_Str__Alternatives2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleD_Byte_Char_Str_in_rule__Char_Str__Alternatives2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Time_Type_Name__Alternatives3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Time_Type_Name__Alternatives3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__Tod_Type_Name__Alternatives3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Tod_Type_Name__Alternatives3082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Tod_Type_Name__Alternatives3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDuration_in_rule__Time_Literal__Alternatives3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTime_Of_Day_in_rule__Time_Literal__Alternatives3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_rule__Time_Literal__Alternatives3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_And_Time_in_rule__Time_Literal__Alternatives3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTime_Type_Name_in_rule__Duration_Value__Alternatives_03221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__Duration_Value__Alternatives_03239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__Duration_Value__Alternatives_03259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Duration_Value__Alternatives_23294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Duration_Value__Alternatives_23314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTod_Type_Name_in_rule__Time_Of_Day_Value__Alternatives_03348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__Time_Of_Day_Value__Alternatives_03366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__Date_And_Time_Value__Alternatives_03401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__Date_And_Time_Value__Alternatives_03421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__Date_And_Time_Value__Alternatives_03441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__Date_And_Time_Value__Alternatives_03461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unsigned_Int_Value__Group__0__Impl_in_rule__Unsigned_Int_Value__Group__03493 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Unsigned_Int_Value__Group__1_in_rule__Unsigned_Int_Value__Group__03496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnsigned_Int_Type_Name_in_rule__Unsigned_Int_Value__Group__0__Impl3523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unsigned_Int_Value__Group__1__Impl_in_rule__Unsigned_Int_Value__Group__13552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unsigned_Int_Value__Alternatives_1_in_rule__Unsigned_Int_Value__Group__1__Impl3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signed_Int_Value__Group__0__Impl_in_rule__Signed_Int_Value__Group__03613 = new BitSet(new long[]{0x00006000000000F0L});
    public static final BitSet FOLLOW_rule__Signed_Int_Value__Group__1_in_rule__Signed_Int_Value__Group__03616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigned_Int_Type_Name_in_rule__Signed_Int_Value__Group__0__Impl3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signed_Int_Value__Group__1__Impl_in_rule__Signed_Int_Value__Group__13672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signed_Int_Value__Alternatives_1_in_rule__Signed_Int_Value__Group__1__Impl3699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signed_Int_Value__Group_1_2__0__Impl_in_rule__Signed_Int_Value__Group_1_2__03733 = new BitSet(new long[]{0x0000600000000040L});
    public static final BitSet FOLLOW_rule__Signed_Int_Value__Group_1_2__1_in_rule__Signed_Int_Value__Group_1_2__03736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signed_Int_Value__Alternatives_1_2_0_in_rule__Signed_Int_Value__Group_1_2__0__Impl3763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signed_Int_Value__Group_1_2__1__Impl_in_rule__Signed_Int_Value__Group_1_2__13794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEC_VALUE_in_rule__Signed_Int_Value__Group_1_2__1__Impl3821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real_Value__Group__0__Impl_in_rule__Real_Value__Group__03854 = new BitSet(new long[]{0x0000600000000100L});
    public static final BitSet FOLLOW_rule__Real_Value__Group__1_in_rule__Real_Value__Group__03857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_Type_Name_in_rule__Real_Value__Group__0__Impl3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real_Value__Group__1__Impl_in_rule__Real_Value__Group__13913 = new BitSet(new long[]{0x0000600000000100L});
    public static final BitSet FOLLOW_rule__Real_Value__Group__2_in_rule__Real_Value__Group__13916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real_Value__Alternatives_1_in_rule__Real_Value__Group__1__Impl3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real_Value__Group__2__Impl_in_rule__Real_Value__Group__23974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_VALUE_in_rule__Real_Value__Group__2__Impl4001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bit_Str_Value__Group__0__Impl_in_rule__Bit_Str_Value__Group__04036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Bit_Str_Value__Group__1_in_rule__Bit_Str_Value__Group__04039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultibits_Type_Name_in_rule__Bit_Str_Value__Group__0__Impl4066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bit_Str_Value__Group__1__Impl_in_rule__Bit_Str_Value__Group__14095 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Bit_Str_Value__Group__2_in_rule__Bit_Str_Value__Group__14098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__Bit_Str_Value__Group__1__Impl4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bit_Str_Value__Group__2__Impl_in_rule__Bit_Str_Value__Group__24157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bit_Str_Value__Alternatives_2_in_rule__Bit_Str_Value__Group__2__Impl4184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bool_Value__Group__0__Impl_in_rule__Bool_Value__Group__04220 = new BitSet(new long[]{0x01E0000000000000L});
    public static final BitSet FOLLOW_rule__Bool_Value__Group__1_in_rule__Bool_Value__Group__04223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bool_Value__Group_0__0_in_rule__Bool_Value__Group__0__Impl4250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bool_Value__Group__1__Impl_in_rule__Bool_Value__Group__14281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bool_Value__Alternatives_1_in_rule__Bool_Value__Group__1__Impl4308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bool_Value__Group_0__0__Impl_in_rule__Bool_Value__Group_0__04342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Bool_Value__Group_0__1_in_rule__Bool_Value__Group_0__04345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_Type_Name_in_rule__Bool_Value__Group_0__0__Impl4372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bool_Value__Group_0__1__Impl_in_rule__Bool_Value__Group_0__14401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__Bool_Value__Group_0__1__Impl4429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Char_Value__Group__0__Impl_in_rule__Char_Value__Group__04464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_rule__Char_Value__Group__1_in_rule__Char_Value__Group__04467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__Char_Value__Group__0__Impl4496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Char_Value__Group__1__Impl_in_rule__Char_Value__Group__14529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChar_Str_in_rule__Char_Value__Group__1__Impl4556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__S_Byte_Char_Str__Group__0__Impl_in_rule__S_Byte_Char_Str__Group__04589 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__S_Byte_Char_Str__Group__1_in_rule__S_Byte_Char_Str__Group__04592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__S_Byte_Char_Str__Group__0__Impl4620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__S_Byte_Char_Str__Group__1__Impl_in_rule__S_Byte_Char_Str__Group__14651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_rule__S_Byte_Char_Str__Group__2_in_rule__S_Byte_Char_Str__Group__14654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_S_BYTE_CHAR_VALUE_in_rule__S_Byte_Char_Str__Group__1__Impl4684 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_RULE_S_BYTE_CHAR_VALUE_in_rule__S_Byte_Char_Str__Group__1__Impl4697 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_rule__S_Byte_Char_Str__Group__2__Impl_in_rule__S_Byte_Char_Str__Group__24730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__S_Byte_Char_Str__Group__2__Impl4758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__D_Byte_Char_Str__Group__0__Impl_in_rule__D_Byte_Char_Str__Group__04795 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__D_Byte_Char_Str__Group__1_in_rule__D_Byte_Char_Str__Group__04798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__D_Byte_Char_Str__Group__0__Impl4826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__D_Byte_Char_Str__Group__1__Impl_in_rule__D_Byte_Char_Str__Group__14857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__D_Byte_Char_Str__Group__2_in_rule__D_Byte_Char_Str__Group__14860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_D_BYTE_CHAR_VALUE_in_rule__D_Byte_Char_Str__Group__1__Impl4890 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_RULE_D_BYTE_CHAR_VALUE_in_rule__D_Byte_Char_Str__Group__1__Impl4903 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rule__D_Byte_Char_Str__Group__2__Impl_in_rule__D_Byte_Char_Str__Group__24936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__D_Byte_Char_Str__Group__2__Impl4964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Duration_Value__Group__0__Impl_in_rule__Duration_Value__Group__05001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Duration_Value__Group__1_in_rule__Duration_Value__Group__05004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Duration_Value__Alternatives_0_in_rule__Duration_Value__Group__0__Impl5031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Duration_Value__Group__1__Impl_in_rule__Duration_Value__Group__15061 = new BitSet(new long[]{0x0000600000000800L});
    public static final BitSet FOLLOW_rule__Duration_Value__Group__2_in_rule__Duration_Value__Group__15064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__Duration_Value__Group__1__Impl5092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Duration_Value__Group__2__Impl_in_rule__Duration_Value__Group__25123 = new BitSet(new long[]{0x0000600000000800L});
    public static final BitSet FOLLOW_rule__Duration_Value__Group__3_in_rule__Duration_Value__Group__25126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Duration_Value__Alternatives_2_in_rule__Duration_Value__Group__2__Impl5153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Duration_Value__Group__3__Impl_in_rule__Duration_Value__Group__35184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTERVAL_in_rule__Duration_Value__Group__3__Impl5211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Time_Of_Day_Value__Group__0__Impl_in_rule__Time_Of_Day_Value__Group__05248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Time_Of_Day_Value__Group__1_in_rule__Time_Of_Day_Value__Group__05251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Time_Of_Day_Value__Alternatives_0_in_rule__Time_Of_Day_Value__Group__0__Impl5278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Time_Of_Day_Value__Group__1__Impl_in_rule__Time_Of_Day_Value__Group__15308 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Time_Of_Day_Value__Group__2_in_rule__Time_Of_Day_Value__Group__15311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__Time_Of_Day_Value__Group__1__Impl5339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Time_Of_Day_Value__Group__2__Impl_in_rule__Time_Of_Day_Value__Group__25370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DAYTIME_VALUE_in_rule__Time_Of_Day_Value__Group__2__Impl5397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date_And_Time_Value__Group__0__Impl_in_rule__Date_And_Time_Value__Group__05432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Date_And_Time_Value__Group__1_in_rule__Date_And_Time_Value__Group__05435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date_And_Time_Value__Alternatives_0_in_rule__Date_And_Time_Value__Group__0__Impl5462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date_And_Time_Value__Group__1__Impl_in_rule__Date_And_Time_Value__Group__15492 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Date_And_Time_Value__Group__2_in_rule__Date_And_Time_Value__Group__15495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__Date_And_Time_Value__Group__1__Impl5523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date_And_Time_Value__Group__2__Impl_in_rule__Date_And_Time_Value__Group__25554 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Date_And_Time_Value__Group__3_in_rule__Date_And_Time_Value__Group__25557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DATE_LITERAL_in_rule__Date_And_Time_Value__Group__2__Impl5584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date_And_Time_Value__Group__3__Impl_in_rule__Date_And_Time_Value__Group__35613 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Date_And_Time_Value__Group__4_in_rule__Date_And_Time_Value__Group__35616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Date_And_Time_Value__Group__3__Impl5644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date_And_Time_Value__Group__4__Impl_in_rule__Date_And_Time_Value__Group__45675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DAYTIME_VALUE_in_rule__Date_And_Time_Value__Group__4__Impl5702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__Test__TestAssignment5751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnsigned_Int_Value_in_rule__Unsigned_Int__ValueAssignment5790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigned_Int_Value_in_rule__Signed_Int__ValueAssignment5821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_Value_in_rule__Real_Literal__ValueAssignment5852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBit_Str_Value_in_rule__Bit_Str_Literal__ValueAssignment5883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_Value_in_rule__Bool_Literal__ValueAssignment5914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChar_Value_in_rule__Char_Literal__ValueAssignment5945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDuration_Value_in_rule__Duration__ValueAssignment5976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTime_Of_Day_Value_in_rule__Time_Of_Day__ValueAssignment6007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DATE_VALUE_in_rule__Date__ValueAssignment6039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_And_Time_Value_in_rule__Date_And_Time__ValueAssignment6070 = new BitSet(new long[]{0x0000000000000002L});

}
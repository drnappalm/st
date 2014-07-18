package at.bachmann.plc.st.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSTLanguageLexer extends Lexer {
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
    public static final int T__60=60;
    public static final int EOF=-1;
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
    public static final int RULE_OCT_VALUE=5;
    public static final int RULE_DATE_VALUE=14;
    public static final int RULE_LETTER=15;
    public static final int RULE_FLOAT_VALUE=8;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_NANOSECONDS=35;
    public static final int RULE_D_BYTE_CHAR_VALUE=10;
    public static final int RULE_WS=24;
    public static final int RULE_DIGIT=18;
    public static final int T__73=73;
    public static final int RULE_BIT=16;

    // delegates
    // delegators

    public InternalSTLanguageLexer() {;} 
    public InternalSTLanguageLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSTLanguageLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g"; }

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:11:7: ( 'BOOL' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:11:9: 'BOOL'
            {
            match("BOOL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:12:7: ( 'USINT' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:12:9: 'USINT'
            {
            match("USINT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:13:7: ( 'UINT' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:13:9: 'UINT'
            {
            match("UINT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:14:7: ( 'UDINT' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:14:9: 'UDINT'
            {
            match("UDINT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:15:7: ( 'ULINT' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:15:9: 'ULINT'
            {
            match("ULINT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:16:7: ( 'SINT' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:16:9: 'SINT'
            {
            match("SINT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:17:7: ( 'INT' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:17:9: 'INT'
            {
            match("INT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:18:7: ( 'DINT' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:18:9: 'DINT'
            {
            match("DINT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:19:7: ( 'LINT' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:19:9: 'LINT'
            {
            match("LINT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:20:7: ( '+' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:20:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:21:7: ( '-' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:21:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:22:7: ( 'LREAL' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:22:9: 'LREAL'
            {
            match("LREAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:23:7: ( 'REAL' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:23:9: 'REAL'
            {
            match("REAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:24:7: ( 'BYTE' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:24:9: 'BYTE'
            {
            match("BYTE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:25:7: ( 'WORD' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:25:9: 'WORD'
            {
            match("WORD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:26:7: ( 'DWORD' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:26:9: 'DWORD'
            {
            match("DWORD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:27:7: ( 'LWORD' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:27:9: 'LWORD'
            {
            match("LWORD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:28:7: ( '0' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:28:9: '0'
            {
            match('0'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:29:7: ( '1' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:29:9: '1'
            {
            match('1'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:30:7: ( 'FALSE' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:30:9: 'FALSE'
            {
            match("FALSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:31:7: ( 'TRUE' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:31:9: 'TRUE'
            {
            match("TRUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:32:7: ( 'TIME' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:32:9: 'TIME'
            {
            match("TIME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:33:7: ( 'LTIME' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:33:9: 'LTIME'
            {
            match("LTIME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:34:7: ( 'TIME_OF_DAY' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:34:9: 'TIME_OF_DAY'
            {
            match("TIME_OF_DAY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:35:7: ( 'TOD' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:35:9: 'TOD'
            {
            match("TOD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:36:7: ( 'LTOD' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:36:9: 'LTOD'
            {
            match("LTOD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:37:7: ( 'T' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:37:9: 'T'
            {
            match('T'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:38:7: ( 'LT' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:38:9: 'LT'
            {
            match("LT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:39:7: ( 'LTIME_OF_DAY' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:39:9: 'LTIME_OF_DAY'
            {
            match("LTIME_OF_DAY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:40:7: ( 'DATE_AND_TIME' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:40:9: 'DATE_AND_TIME'
            {
            match("DATE_AND_TIME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:41:7: ( 'LDATE_AND_TIME' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:41:9: 'LDATE_AND_TIME'
            {
            match("LDATE_AND_TIME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:42:7: ( 'DT' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:42:9: 'DT'
            {
            match("DT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:43:7: ( 'LDT' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:43:9: 'LDT'
            {
            match("LDT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:44:7: ( '#' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:44:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:45:7: ( 'STRING#' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:45:9: 'STRING#'
            {
            match("STRING#"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:46:7: ( '\\'' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:46:9: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:47:7: ( '\"' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:47:9: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:48:7: ( 't' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:48:9: 't'
            {
            match('t'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2949:22: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2949:24: ( 'A' .. 'Z' | 'a' .. 'z' | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_BIT"
    public final void mRULE_BIT() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2951:19: ( '0' .. '1' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2951:21: '0' .. '1'
            {
            matchRange('0','1'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BIT"

    // $ANTLR start "RULE_OCTAL_DIGIT"
    public final void mRULE_OCTAL_DIGIT() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2953:27: ( '0' .. '7' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2953:29: '0' .. '7'
            {
            matchRange('0','7'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAL_DIGIT"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2955:21: ( '0' .. '9' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2955:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_HEX_DIGIT"
    public final void mRULE_HEX_DIGIT() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2957:25: ( ( '0' .. '9' | 'A' .. 'F' ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2957:27: ( '0' .. '9' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_DIGIT"

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2959:17: ( RULE_LETTER ( RULE_LETTER | RULE_DIGIT )* )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2959:19: RULE_LETTER ( RULE_LETTER | RULE_DIGIT )*
            {
            mRULE_LETTER(); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2959:31: ( RULE_LETTER | RULE_DIGIT )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENTIFIER"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2961:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( '\\r' )? '\\n' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2961:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2961:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2961:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2961:40: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2961:40: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ML_COMMENT_1"
    public final void mRULE_ML_COMMENT_1() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2963:19: ( '(*' ( options {greedy=false; } : . )* '*)' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2963:21: '(*' ( options {greedy=false; } : . )* '*)'
            {
            match("(*"); 

            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2963:26: ( options {greedy=false; } : . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='*') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==')') ) {
                        alt4=2;
                    }
                    else if ( ((LA4_1>='\u0000' && LA4_1<='(')||(LA4_1>='*' && LA4_1<='\uFFFF')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<=')')||(LA4_0>='+' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2963:54: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match("*)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT_1"

    // $ANTLR start "RULE_ML_COMMENT_2"
    public final void mRULE_ML_COMMENT_2() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT_2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2965:19: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2965:21: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2965:26: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='/') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='.')||(LA5_1>='0' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2965:54: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT_2"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2967:18: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2967:20: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_EOL"
    public final void mRULE_EOL() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2969:19: ( '\\n' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2969:21: '\\n'
            {
            match('\n'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EOL"

    // $ANTLR start "RULE_PRAGMA"
    public final void mRULE_PRAGMA() throws RecognitionException {
        try {
            int _type = RULE_PRAGMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2971:13: ( '{' ( options {greedy=false; } : . )* '}' )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2971:15: '{' ( options {greedy=false; } : . )* '}'
            {
            match('{'); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2971:19: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='}') ) {
                    alt6=2;
                }
                else if ( ((LA6_0>='\u0000' && LA6_0<='|')||(LA6_0>='~' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2971:47: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PRAGMA"

    // $ANTLR start "RULE_BIN_VALUE"
    public final void mRULE_BIN_VALUE() throws RecognitionException {
        try {
            int _type = RULE_BIN_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2973:16: ( '2#' ( ( '_' )? RULE_BIT )+ )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2973:18: '2#' ( ( '_' )? RULE_BIT )+
            {
            match("2#"); 

            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2973:23: ( ( '_' )? RULE_BIT )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='1')||LA8_0=='_') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2973:24: ( '_' )? RULE_BIT
            	    {
            	    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2973:24: ( '_' )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0=='_') ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2973:24: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    mRULE_BIT(); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BIN_VALUE"

    // $ANTLR start "RULE_OCT_VALUE"
    public final void mRULE_OCT_VALUE() throws RecognitionException {
        try {
            int _type = RULE_OCT_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2975:16: ( '8#' ( ( '_' )? RULE_OCTAL_DIGIT )+ )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2975:18: '8#' ( ( '_' )? RULE_OCTAL_DIGIT )+
            {
            match("8#"); 

            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2975:23: ( ( '_' )? RULE_OCTAL_DIGIT )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='7')||LA10_0=='_') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2975:24: ( '_' )? RULE_OCTAL_DIGIT
            	    {
            	    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2975:24: ( '_' )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0=='_') ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2975:24: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    mRULE_OCTAL_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCT_VALUE"

    // $ANTLR start "RULE_HEX_VALUE"
    public final void mRULE_HEX_VALUE() throws RecognitionException {
        try {
            int _type = RULE_HEX_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2977:16: ( '16#' ( ( '_' )? RULE_HEX_DIGIT )+ )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2977:18: '16#' ( ( '_' )? RULE_HEX_DIGIT )+
            {
            match("16#"); 

            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2977:24: ( ( '_' )? RULE_HEX_DIGIT )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='F')||LA12_0=='_') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2977:25: ( '_' )? RULE_HEX_DIGIT
            	    {
            	    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2977:25: ( '_' )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0=='_') ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2977:25: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    mRULE_HEX_DIGIT(); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_VALUE"

    // $ANTLR start "RULE_DEC_VALUE"
    public final void mRULE_DEC_VALUE() throws RecognitionException {
        try {
            int _type = RULE_DEC_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2979:16: ( RULE_DIGIT ( RULE_DIGIT | '_' RULE_DIGIT )* )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2979:18: RULE_DIGIT ( RULE_DIGIT | '_' RULE_DIGIT )*
            {
            mRULE_DIGIT(); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2979:29: ( RULE_DIGIT | '_' RULE_DIGIT )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }
                else if ( (LA13_0=='_') ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2979:30: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;
            	case 2 :
            	    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2979:41: '_' RULE_DIGIT
            	    {
            	    match('_'); 
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEC_VALUE"

    // $ANTLR start "RULE_FIX_POINT"
    public final void mRULE_FIX_POINT() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2981:25: ( RULE_DEC_VALUE '.' RULE_DEC_VALUE )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2981:27: RULE_DEC_VALUE '.' RULE_DEC_VALUE
            {
            mRULE_DEC_VALUE(); 
            match('.'); 
            mRULE_DEC_VALUE(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_FIX_POINT"

    // $ANTLR start "RULE_FLOAT_VALUE"
    public final void mRULE_FLOAT_VALUE() throws RecognitionException {
        try {
            int _type = RULE_FLOAT_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2983:18: ( RULE_FIX_POINT ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_DEC_VALUE )? )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2983:20: RULE_FIX_POINT ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_DEC_VALUE )?
            {
            mRULE_FIX_POINT(); 
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2983:35: ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_DEC_VALUE )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='E'||LA15_0=='e') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2983:36: ( 'E' | 'e' ) ( '+' | '-' )? RULE_DEC_VALUE
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2983:46: ( '+' | '-' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='+'||LA14_0=='-') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_DEC_VALUE(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT_VALUE"

    // $ANTLR start "RULE_S_BYTE_CHAR_VALUE"
    public final void mRULE_S_BYTE_CHAR_VALUE() throws RecognitionException {
        try {
            int _type = RULE_S_BYTE_CHAR_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2985:24: ( ( RULE_COMMON_CHAR_VALUE | '$\\'' | '\"' | '$' RULE_HEX_DIGIT RULE_HEX_DIGIT ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2985:26: ( RULE_COMMON_CHAR_VALUE | '$\\'' | '\"' | '$' RULE_HEX_DIGIT RULE_HEX_DIGIT )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2985:26: ( RULE_COMMON_CHAR_VALUE | '$\\'' | '\"' | '$' RULE_HEX_DIGIT RULE_HEX_DIGIT )
            int alt16=4;
            switch ( input.LA(1) ) {
            case ' ':
            case '!':
            case '#':
            case '%':
            case '&':
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
            case '-':
            case '.':
            case '/':
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case ':':
            case ';':
            case '<':
            case '=':
            case '>':
            case '?':
            case '@':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '[':
            case '\\':
            case ']':
            case '^':
            case '_':
            case '`':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
            case '{':
            case '|':
            case '}':
            case '~':
                {
                alt16=1;
                }
                break;
            case '$':
                {
                switch ( input.LA(2) ) {
                case '$':
                case 'L':
                case 'N':
                case 'P':
                case 'R':
                case 'T':
                    {
                    alt16=1;
                    }
                    break;
                case '\'':
                    {
                    alt16=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                    {
                    alt16=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }

                }
                break;
            case '\"':
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2985:27: RULE_COMMON_CHAR_VALUE
                    {
                    mRULE_COMMON_CHAR_VALUE(); 

                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2985:50: '$\\''
                    {
                    match("$'"); 


                    }
                    break;
                case 3 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2985:56: '\"'
                    {
                    match('\"'); 

                    }
                    break;
                case 4 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2985:60: '$' RULE_HEX_DIGIT RULE_HEX_DIGIT
                    {
                    match('$'); 
                    mRULE_HEX_DIGIT(); 
                    mRULE_HEX_DIGIT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_S_BYTE_CHAR_VALUE"

    // $ANTLR start "RULE_D_BYTE_CHAR_VALUE"
    public final void mRULE_D_BYTE_CHAR_VALUE() throws RecognitionException {
        try {
            int _type = RULE_D_BYTE_CHAR_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2987:24: ( ( RULE_COMMON_CHAR_VALUE | '\\'' | '$\"' | '$' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2987:26: ( RULE_COMMON_CHAR_VALUE | '\\'' | '$\"' | '$' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2987:26: ( RULE_COMMON_CHAR_VALUE | '\\'' | '$\"' | '$' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            int alt17=4;
            switch ( input.LA(1) ) {
            case ' ':
            case '!':
            case '#':
            case '%':
            case '&':
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
            case '-':
            case '.':
            case '/':
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case ':':
            case ';':
            case '<':
            case '=':
            case '>':
            case '?':
            case '@':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '[':
            case '\\':
            case ']':
            case '^':
            case '_':
            case '`':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
            case '{':
            case '|':
            case '}':
            case '~':
                {
                alt17=1;
                }
                break;
            case '$':
                {
                switch ( input.LA(2) ) {
                case '$':
                case 'L':
                case 'N':
                case 'P':
                case 'R':
                case 'T':
                    {
                    alt17=1;
                    }
                    break;
                case '\"':
                    {
                    alt17=3;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                    {
                    alt17=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }

                }
                break;
            case '\'':
                {
                alt17=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2987:27: RULE_COMMON_CHAR_VALUE
                    {
                    mRULE_COMMON_CHAR_VALUE(); 

                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2987:50: '\\''
                    {
                    match('\''); 

                    }
                    break;
                case 3 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2987:55: '$\"'
                    {
                    match("$\""); 


                    }
                    break;
                case 4 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2987:60: '$' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
                    {
                    match('$'); 
                    mRULE_HEX_DIGIT(); 
                    mRULE_HEX_DIGIT(); 
                    mRULE_HEX_DIGIT(); 
                    mRULE_HEX_DIGIT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_D_BYTE_CHAR_VALUE"

    // $ANTLR start "RULE_COMMON_CHAR_VALUE"
    public final void mRULE_COMMON_CHAR_VALUE() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2989:33: ( ( ' ' | '!' | '#' | '%' | '&' | '(' .. '/' | '0' .. '9' | ':' .. '@' | 'A' .. 'Z' | '[' .. '`' | 'a' .. 'z' | '{' .. '~' | '$$' | '$L' | '$N' | '$P' | '$R' | '$T' ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2989:35: ( ' ' | '!' | '#' | '%' | '&' | '(' .. '/' | '0' .. '9' | ':' .. '@' | 'A' .. 'Z' | '[' .. '`' | 'a' .. 'z' | '{' .. '~' | '$$' | '$L' | '$N' | '$P' | '$R' | '$T' )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2989:35: ( ' ' | '!' | '#' | '%' | '&' | '(' .. '/' | '0' .. '9' | ':' .. '@' | 'A' .. 'Z' | '[' .. '`' | 'a' .. 'z' | '{' .. '~' | '$$' | '$L' | '$N' | '$P' | '$R' | '$T' )
            int alt18=18;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2989:36: ' '
                    {
                    match(' '); 

                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2989:40: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 3 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2989:44: '#'
                    {
                    match('#'); 

                    }
                    break;
                case 4 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2989:48: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 5 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2989:52: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 6 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2989:56: '(' .. '/'
                    {
                    matchRange('(','/'); 

                    }
                    break;
                case 7 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2989:65: '0' .. '9'
                    {
                    matchRange('0','9'); 

                    }
                    break;
                case 8 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2989:74: ':' .. '@'
                    {
                    matchRange(':','@'); 

                    }
                    break;
                case 9 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2989:83: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }
                    break;
                case 10 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2989:92: '[' .. '`'
                    {
                    matchRange('[','`'); 

                    }
                    break;
                case 11 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2989:101: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }
                    break;
                case 12 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2989:110: '{' .. '~'
                    {
                    matchRange('{','~'); 

                    }
                    break;
                case 13 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2989:119: '$$'
                    {
                    match("$$"); 


                    }
                    break;
                case 14 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2989:124: '$L'
                    {
                    match("$L"); 


                    }
                    break;
                case 15 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2989:129: '$N'
                    {
                    match("$N"); 


                    }
                    break;
                case 16 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2989:134: '$P'
                    {
                    match("$P"); 


                    }
                    break;
                case 17 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2989:139: '$R'
                    {
                    match("$R"); 


                    }
                    break;
                case 18 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2989:144: '$T'
                    {
                    match("$T"); 


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMON_CHAR_VALUE"

    // $ANTLR start "RULE_INTERVAL"
    public final void mRULE_INTERVAL() throws RecognitionException {
        try {
            int _type = RULE_INTERVAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2991:15: ( ( RULE_DAYS )? ( RULE_HOURS )? ( RULE_MINUTES )? ( RULE_SECONDS )? ( RULE_MILLISECONDS )? ( RULE_MICROSECONDS )? ( RULE_NANOSECONDS )? )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2991:17: ( RULE_DAYS )? ( RULE_HOURS )? ( RULE_MINUTES )? ( RULE_SECONDS )? ( RULE_MILLISECONDS )? ( RULE_MICROSECONDS )? ( RULE_NANOSECONDS )?
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2991:17: ( RULE_DAYS )?
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2991:17: RULE_DAYS
                    {
                    mRULE_DAYS(); 

                    }
                    break;

            }

            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2991:28: ( RULE_HOURS )?
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2991:28: RULE_HOURS
                    {
                    mRULE_HOURS(); 

                    }
                    break;

            }

            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2991:40: ( RULE_MINUTES )?
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2991:40: RULE_MINUTES
                    {
                    mRULE_MINUTES(); 

                    }
                    break;

            }

            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2991:54: ( RULE_SECONDS )?
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2991:54: RULE_SECONDS
                    {
                    mRULE_SECONDS(); 

                    }
                    break;

            }

            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2991:68: ( RULE_MILLISECONDS )?
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2991:68: RULE_MILLISECONDS
                    {
                    mRULE_MILLISECONDS(); 

                    }
                    break;

            }

            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2991:87: ( RULE_MICROSECONDS )?
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2991:87: RULE_MICROSECONDS
                    {
                    mRULE_MICROSECONDS(); 

                    }
                    break;

            }

            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2991:106: ( RULE_NANOSECONDS )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>='0' && LA25_0<='9')) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2991:106: RULE_NANOSECONDS
                    {
                    mRULE_NANOSECONDS(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTERVAL"

    // $ANTLR start "RULE_DAYS"
    public final void mRULE_DAYS() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2993:20: ( ( RULE_FIX_POINT ( 'd' | 'D' ) | RULE_DEC_VALUE ( 'd' | 'D' ) ( '_' )? ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2993:22: ( RULE_FIX_POINT ( 'd' | 'D' ) | RULE_DEC_VALUE ( 'd' | 'D' ) ( '_' )? )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2993:22: ( RULE_FIX_POINT ( 'd' | 'D' ) | RULE_DEC_VALUE ( 'd' | 'D' ) ( '_' )? )
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2993:23: RULE_FIX_POINT ( 'd' | 'D' )
                    {
                    mRULE_FIX_POINT(); 
                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2993:48: RULE_DEC_VALUE ( 'd' | 'D' ) ( '_' )?
                    {
                    mRULE_DEC_VALUE(); 
                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2993:73: ( '_' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0=='_') ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2993:73: '_'
                            {
                            match('_'); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DAYS"

    // $ANTLR start "RULE_HOURS"
    public final void mRULE_HOURS() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2995:21: ( ( RULE_FIX_POINT ( 'h' | 'H' ) | RULE_DEC_VALUE ( 'h' | 'H' ) ( '_' )? ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2995:23: ( RULE_FIX_POINT ( 'h' | 'H' ) | RULE_DEC_VALUE ( 'h' | 'H' ) ( '_' )? )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2995:23: ( RULE_FIX_POINT ( 'h' | 'H' ) | RULE_DEC_VALUE ( 'h' | 'H' ) ( '_' )? )
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2995:24: RULE_FIX_POINT ( 'h' | 'H' )
                    {
                    mRULE_FIX_POINT(); 
                    if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2995:49: RULE_DEC_VALUE ( 'h' | 'H' ) ( '_' )?
                    {
                    mRULE_DEC_VALUE(); 
                    if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2995:74: ( '_' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0=='_') ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2995:74: '_'
                            {
                            match('_'); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HOURS"

    // $ANTLR start "RULE_MINUTES"
    public final void mRULE_MINUTES() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2997:23: ( ( RULE_FIX_POINT ( 'm' | 'M' ) | RULE_DEC_VALUE ( 'm' | 'M' ) ( '_' )? ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2997:25: ( RULE_FIX_POINT ( 'm' | 'M' ) | RULE_DEC_VALUE ( 'm' | 'M' ) ( '_' )? )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2997:25: ( RULE_FIX_POINT ( 'm' | 'M' ) | RULE_DEC_VALUE ( 'm' | 'M' ) ( '_' )? )
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2997:26: RULE_FIX_POINT ( 'm' | 'M' )
                    {
                    mRULE_FIX_POINT(); 
                    if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2997:51: RULE_DEC_VALUE ( 'm' | 'M' ) ( '_' )?
                    {
                    mRULE_DEC_VALUE(); 
                    if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2997:76: ( '_' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0=='_') ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2997:76: '_'
                            {
                            match('_'); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUTES"

    // $ANTLR start "RULE_SECONDS"
    public final void mRULE_SECONDS() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2999:23: ( ( RULE_FIX_POINT ( 's' | 'S' ) | RULE_DEC_VALUE ( 's' | 'S' ) ( '_' )? ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2999:25: ( RULE_FIX_POINT ( 's' | 'S' ) | RULE_DEC_VALUE ( 's' | 'S' ) ( '_' )? )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2999:25: ( RULE_FIX_POINT ( 's' | 'S' ) | RULE_DEC_VALUE ( 's' | 'S' ) ( '_' )? )
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2999:26: RULE_FIX_POINT ( 's' | 'S' )
                    {
                    mRULE_FIX_POINT(); 
                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2999:51: RULE_DEC_VALUE ( 's' | 'S' ) ( '_' )?
                    {
                    mRULE_DEC_VALUE(); 
                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2999:76: ( '_' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0=='_') ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:2999:76: '_'
                            {
                            match('_'); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SECONDS"

    // $ANTLR start "RULE_MILLISECONDS"
    public final void mRULE_MILLISECONDS() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3001:28: ( ( RULE_FIX_POINT ( 'ms' | 'Ms' | 'mS' | 'MS' ) | RULE_DEC_VALUE ( 'ms' | 'Ms' | 'mS' | 'MS' ) ( '_' )? ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3001:30: ( RULE_FIX_POINT ( 'ms' | 'Ms' | 'mS' | 'MS' ) | RULE_DEC_VALUE ( 'ms' | 'Ms' | 'mS' | 'MS' ) ( '_' )? )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3001:30: ( RULE_FIX_POINT ( 'ms' | 'Ms' | 'mS' | 'MS' ) | RULE_DEC_VALUE ( 'ms' | 'Ms' | 'mS' | 'MS' ) ( '_' )? )
            int alt37=2;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3001:31: RULE_FIX_POINT ( 'ms' | 'Ms' | 'mS' | 'MS' )
                    {
                    mRULE_FIX_POINT(); 
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3001:46: ( 'ms' | 'Ms' | 'mS' | 'MS' )
                    int alt34=4;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0=='m') ) {
                        int LA34_1 = input.LA(2);

                        if ( (LA34_1=='s') ) {
                            alt34=1;
                        }
                        else if ( (LA34_1=='S') ) {
                            alt34=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 34, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA34_0=='M') ) {
                        int LA34_2 = input.LA(2);

                        if ( (LA34_2=='s') ) {
                            alt34=2;
                        }
                        else if ( (LA34_2=='S') ) {
                            alt34=4;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 34, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3001:47: 'ms'
                            {
                            match("ms"); 


                            }
                            break;
                        case 2 :
                            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3001:52: 'Ms'
                            {
                            match("Ms"); 


                            }
                            break;
                        case 3 :
                            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3001:57: 'mS'
                            {
                            match("mS"); 


                            }
                            break;
                        case 4 :
                            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3001:62: 'MS'
                            {
                            match("MS"); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3001:68: RULE_DEC_VALUE ( 'ms' | 'Ms' | 'mS' | 'MS' ) ( '_' )?
                    {
                    mRULE_DEC_VALUE(); 
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3001:83: ( 'ms' | 'Ms' | 'mS' | 'MS' )
                    int alt35=4;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0=='m') ) {
                        int LA35_1 = input.LA(2);

                        if ( (LA35_1=='s') ) {
                            alt35=1;
                        }
                        else if ( (LA35_1=='S') ) {
                            alt35=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 35, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA35_0=='M') ) {
                        int LA35_2 = input.LA(2);

                        if ( (LA35_2=='s') ) {
                            alt35=2;
                        }
                        else if ( (LA35_2=='S') ) {
                            alt35=4;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 35, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3001:84: 'ms'
                            {
                            match("ms"); 


                            }
                            break;
                        case 2 :
                            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3001:89: 'Ms'
                            {
                            match("Ms"); 


                            }
                            break;
                        case 3 :
                            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3001:94: 'mS'
                            {
                            match("mS"); 


                            }
                            break;
                        case 4 :
                            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3001:99: 'MS'
                            {
                            match("MS"); 


                            }
                            break;

                    }

                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3001:105: ( '_' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0=='_') ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3001:105: '_'
                            {
                            match('_'); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_MILLISECONDS"

    // $ANTLR start "RULE_MICROSECONDS"
    public final void mRULE_MICROSECONDS() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3003:28: ( ( RULE_FIX_POINT ( 'u' | 'U' ) ( 's' | 'S' ) | RULE_DEC_VALUE ( 'u' | 'U' ) ( 's' | 'S' ) ( '_' )? ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3003:30: ( RULE_FIX_POINT ( 'u' | 'U' ) ( 's' | 'S' ) | RULE_DEC_VALUE ( 'u' | 'U' ) ( 's' | 'S' ) ( '_' )? )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3003:30: ( RULE_FIX_POINT ( 'u' | 'U' ) ( 's' | 'S' ) | RULE_DEC_VALUE ( 'u' | 'U' ) ( 's' | 'S' ) ( '_' )? )
            int alt39=2;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3003:31: RULE_FIX_POINT ( 'u' | 'U' ) ( 's' | 'S' )
                    {
                    mRULE_FIX_POINT(); 
                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3003:66: RULE_DEC_VALUE ( 'u' | 'U' ) ( 's' | 'S' ) ( '_' )?
                    {
                    mRULE_DEC_VALUE(); 
                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3003:101: ( '_' )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0=='_') ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3003:101: '_'
                            {
                            match('_'); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_MICROSECONDS"

    // $ANTLR start "RULE_NANOSECONDS"
    public final void mRULE_NANOSECONDS() throws RecognitionException {
        try {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3005:27: ( ( RULE_FIX_POINT ( 'n' | 'N' ) ( 's' | 'S' ) | RULE_DEC_VALUE ( 'n' | 'N' ) ( 's' | 'S' ) ) )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3005:29: ( RULE_FIX_POINT ( 'n' | 'N' ) ( 's' | 'S' ) | RULE_DEC_VALUE ( 'n' | 'N' ) ( 's' | 'S' ) )
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3005:29: ( RULE_FIX_POINT ( 'n' | 'N' ) ( 's' | 'S' ) | RULE_DEC_VALUE ( 'n' | 'N' ) ( 's' | 'S' ) )
            int alt40=2;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3005:30: RULE_FIX_POINT ( 'n' | 'N' ) ( 's' | 'S' )
                    {
                    mRULE_FIX_POINT(); 
                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3005:65: RULE_DEC_VALUE ( 'n' | 'N' ) ( 's' | 'S' )
                    {
                    mRULE_DEC_VALUE(); 
                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NANOSECONDS"

    // $ANTLR start "RULE_DAYTIME_VALUE"
    public final void mRULE_DAYTIME_VALUE() throws RecognitionException {
        try {
            int _type = RULE_DAYTIME_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3007:20: ( RULE_DEC_VALUE ':' RULE_DEC_VALUE ':' RULE_FIX_POINT )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3007:22: RULE_DEC_VALUE ':' RULE_DEC_VALUE ':' RULE_FIX_POINT
            {
            mRULE_DEC_VALUE(); 
            match(':'); 
            mRULE_DEC_VALUE(); 
            match(':'); 
            mRULE_FIX_POINT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DAYTIME_VALUE"

    // $ANTLR start "RULE_DATE_VALUE"
    public final void mRULE_DATE_VALUE() throws RecognitionException {
        try {
            int _type = RULE_DATE_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3009:17: ( ( 'DATE' | 'LDATE' | 'D' | 'LD' ) '#' RULE_DATE_LITERAL )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3009:19: ( 'DATE' | 'LDATE' | 'D' | 'LD' ) '#' RULE_DATE_LITERAL
            {
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3009:19: ( 'DATE' | 'LDATE' | 'D' | 'LD' )
            int alt41=4;
            int LA41_0 = input.LA(1);

            if ( (LA41_0=='D') ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1=='A') ) {
                    alt41=1;
                }
                else if ( (LA41_1=='#') ) {
                    alt41=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA41_0=='L') ) {
                int LA41_2 = input.LA(2);

                if ( (LA41_2=='D') ) {
                    int LA41_5 = input.LA(3);

                    if ( (LA41_5=='A') ) {
                        alt41=2;
                    }
                    else if ( (LA41_5=='#') ) {
                        alt41=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3009:20: 'DATE'
                    {
                    match("DATE"); 


                    }
                    break;
                case 2 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3009:27: 'LDATE'
                    {
                    match("LDATE"); 


                    }
                    break;
                case 3 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3009:35: 'D'
                    {
                    match('D'); 

                    }
                    break;
                case 4 :
                    // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3009:39: 'LD'
                    {
                    match("LD"); 


                    }
                    break;

            }

            match('#'); 
            mRULE_DATE_LITERAL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DATE_VALUE"

    // $ANTLR start "RULE_DATE_LITERAL"
    public final void mRULE_DATE_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_DATE_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3011:19: ( RULE_DEC_VALUE '-' RULE_DEC_VALUE '-' RULE_DEC_VALUE )
            // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:3011:21: RULE_DEC_VALUE '-' RULE_DEC_VALUE '-' RULE_DEC_VALUE
            {
            mRULE_DEC_VALUE(); 
            match('-'); 
            mRULE_DEC_VALUE(); 
            match('-'); 
            mRULE_DEC_VALUE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DATE_LITERAL"

    public void mTokens() throws RecognitionException {
        // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:8: ( T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | RULE_IDENTIFIER | RULE_SL_COMMENT | RULE_ML_COMMENT_1 | RULE_ML_COMMENT_2 | RULE_PRAGMA | RULE_BIN_VALUE | RULE_OCT_VALUE | RULE_HEX_VALUE | RULE_DEC_VALUE | RULE_FLOAT_VALUE | RULE_S_BYTE_CHAR_VALUE | RULE_D_BYTE_CHAR_VALUE | RULE_INTERVAL | RULE_DAYTIME_VALUE | RULE_DATE_VALUE | RULE_DATE_LITERAL )
        int alt42=54;
        alt42 = dfa42.predict(input);
        switch (alt42) {
            case 1 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:10: T__36
                {
                mT__36(); 

                }
                break;
            case 2 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:16: T__37
                {
                mT__37(); 

                }
                break;
            case 3 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:22: T__38
                {
                mT__38(); 

                }
                break;
            case 4 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:28: T__39
                {
                mT__39(); 

                }
                break;
            case 5 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:34: T__40
                {
                mT__40(); 

                }
                break;
            case 6 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:40: T__41
                {
                mT__41(); 

                }
                break;
            case 7 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:46: T__42
                {
                mT__42(); 

                }
                break;
            case 8 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:52: T__43
                {
                mT__43(); 

                }
                break;
            case 9 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:58: T__44
                {
                mT__44(); 

                }
                break;
            case 10 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:64: T__45
                {
                mT__45(); 

                }
                break;
            case 11 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:70: T__46
                {
                mT__46(); 

                }
                break;
            case 12 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:76: T__47
                {
                mT__47(); 

                }
                break;
            case 13 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:82: T__48
                {
                mT__48(); 

                }
                break;
            case 14 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:88: T__49
                {
                mT__49(); 

                }
                break;
            case 15 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:94: T__50
                {
                mT__50(); 

                }
                break;
            case 16 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:100: T__51
                {
                mT__51(); 

                }
                break;
            case 17 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:106: T__52
                {
                mT__52(); 

                }
                break;
            case 18 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:112: T__53
                {
                mT__53(); 

                }
                break;
            case 19 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:118: T__54
                {
                mT__54(); 

                }
                break;
            case 20 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:124: T__55
                {
                mT__55(); 

                }
                break;
            case 21 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:130: T__56
                {
                mT__56(); 

                }
                break;
            case 22 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:136: T__57
                {
                mT__57(); 

                }
                break;
            case 23 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:142: T__58
                {
                mT__58(); 

                }
                break;
            case 24 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:148: T__59
                {
                mT__59(); 

                }
                break;
            case 25 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:154: T__60
                {
                mT__60(); 

                }
                break;
            case 26 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:160: T__61
                {
                mT__61(); 

                }
                break;
            case 27 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:166: T__62
                {
                mT__62(); 

                }
                break;
            case 28 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:172: T__63
                {
                mT__63(); 

                }
                break;
            case 29 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:178: T__64
                {
                mT__64(); 

                }
                break;
            case 30 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:184: T__65
                {
                mT__65(); 

                }
                break;
            case 31 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:190: T__66
                {
                mT__66(); 

                }
                break;
            case 32 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:196: T__67
                {
                mT__67(); 

                }
                break;
            case 33 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:202: T__68
                {
                mT__68(); 

                }
                break;
            case 34 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:208: T__69
                {
                mT__69(); 

                }
                break;
            case 35 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:214: T__70
                {
                mT__70(); 

                }
                break;
            case 36 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:220: T__71
                {
                mT__71(); 

                }
                break;
            case 37 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:226: T__72
                {
                mT__72(); 

                }
                break;
            case 38 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:232: T__73
                {
                mT__73(); 

                }
                break;
            case 39 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:238: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 40 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:254: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 41 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:270: RULE_ML_COMMENT_1
                {
                mRULE_ML_COMMENT_1(); 

                }
                break;
            case 42 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:288: RULE_ML_COMMENT_2
                {
                mRULE_ML_COMMENT_2(); 

                }
                break;
            case 43 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:306: RULE_PRAGMA
                {
                mRULE_PRAGMA(); 

                }
                break;
            case 44 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:318: RULE_BIN_VALUE
                {
                mRULE_BIN_VALUE(); 

                }
                break;
            case 45 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:333: RULE_OCT_VALUE
                {
                mRULE_OCT_VALUE(); 

                }
                break;
            case 46 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:348: RULE_HEX_VALUE
                {
                mRULE_HEX_VALUE(); 

                }
                break;
            case 47 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:363: RULE_DEC_VALUE
                {
                mRULE_DEC_VALUE(); 

                }
                break;
            case 48 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:378: RULE_FLOAT_VALUE
                {
                mRULE_FLOAT_VALUE(); 

                }
                break;
            case 49 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:395: RULE_S_BYTE_CHAR_VALUE
                {
                mRULE_S_BYTE_CHAR_VALUE(); 

                }
                break;
            case 50 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:418: RULE_D_BYTE_CHAR_VALUE
                {
                mRULE_D_BYTE_CHAR_VALUE(); 

                }
                break;
            case 51 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:441: RULE_INTERVAL
                {
                mRULE_INTERVAL(); 

                }
                break;
            case 52 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:455: RULE_DAYTIME_VALUE
                {
                mRULE_DAYTIME_VALUE(); 

                }
                break;
            case 53 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:474: RULE_DATE_VALUE
                {
                mRULE_DATE_VALUE(); 

                }
                break;
            case 54 :
                // ../at.bachmann.plc.st.ui/src-gen/at/bachmann/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:490: RULE_DATE_LITERAL
                {
                mRULE_DATE_LITERAL(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA42 dfa42 = new DFA42(this);
    static final String DFA18_eotS =
        "\24\uffff";
    static final String DFA18_eofS =
        "\24\uffff";
    static final String DFA18_minS =
        "\1\40\14\uffff\1\44\6\uffff";
    static final String DFA18_maxS =
        "\1\176\14\uffff\1\124\6\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\uffff\1\15\1\16\1\17\1\20\1\21\1\22";
    static final String DFA18_specialS =
        "\24\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1\1\2\1\uffff\1\3\1\15\1\4\1\5\1\uffff\10\6\12\7\7\10\32"+
            "\11\6\12\32\13\4\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\16\47\uffff\1\17\1\uffff\1\20\1\uffff\1\21\1\uffff\1\22"+
            "\1\uffff\1\23",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "2989:35: ( ' ' | '!' | '#' | '%' | '&' | '(' .. '/' | '0' .. '9' | ':' .. '@' | 'A' .. 'Z' | '[' .. '`' | 'a' .. 'z' | '{' .. '~' | '$$' | '$L' | '$N' | '$P' | '$R' | '$T' )";
        }
    }
    static final String DFA19_eotS =
        "\1\2\13\uffff";
    static final String DFA19_eofS =
        "\14\uffff";
    static final String DFA19_minS =
        "\1\60\1\56\1\uffff\1\56\2\60\1\uffff\1\56\4\60";
    static final String DFA19_maxS =
        "\1\71\1\165\1\uffff\1\165\2\71\1\uffff\3\165\1\71\1\165";
    static final String DFA19_acceptS =
        "\2\uffff\1\2\3\uffff\1\1\5\uffff";
    static final String DFA19_specialS =
        "\14\uffff}>";
    static final String[] DFA19_transitionS = {
            "\12\1",
            "\1\5\1\uffff\12\3\12\uffff\1\6\3\uffff\1\2\4\uffff\2\2\4\uffff"+
            "\1\2\1\uffff\1\2\11\uffff\1\4\4\uffff\1\6\3\uffff\1\2\4\uffff"+
            "\2\2\4\uffff\1\2\1\uffff\1\2",
            "",
            "\1\5\1\uffff\12\3\12\uffff\1\6\3\uffff\1\2\4\uffff\2\2\4\uffff"+
            "\1\2\1\uffff\1\2\11\uffff\1\4\4\uffff\1\6\3\uffff\1\2\4\uffff"+
            "\2\2\4\uffff\1\2\1\uffff\1\2",
            "\12\7",
            "\12\10",
            "",
            "\1\5\1\uffff\12\3\12\uffff\1\6\3\uffff\1\2\4\uffff\2\2\4\uffff"+
            "\1\2\1\uffff\1\2\11\uffff\1\4\4\uffff\1\6\3\uffff\1\2\4\uffff"+
            "\2\2\4\uffff\1\2\1\uffff\1\2",
            "\12\11\12\uffff\1\6\3\uffff\1\2\4\uffff\2\2\4\uffff\1\2\1"+
            "\uffff\1\2\11\uffff\1\12\4\uffff\1\6\3\uffff\1\2\4\uffff\2\2"+
            "\4\uffff\1\2\1\uffff\1\2",
            "\12\11\12\uffff\1\6\3\uffff\1\2\4\uffff\2\2\4\uffff\1\2\1"+
            "\uffff\1\2\11\uffff\1\12\4\uffff\1\6\3\uffff\1\2\4\uffff\2\2"+
            "\4\uffff\1\2\1\uffff\1\2",
            "\12\13",
            "\12\11\12\uffff\1\6\3\uffff\1\2\4\uffff\2\2\4\uffff\1\2\1"+
            "\uffff\1\2\11\uffff\1\12\4\uffff\1\6\3\uffff\1\2\4\uffff\2\2"+
            "\4\uffff\1\2\1\uffff\1\2"
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "2991:17: ( RULE_DAYS )?";
        }
    }
    static final String DFA20_eotS =
        "\1\2\13\uffff";
    static final String DFA20_eofS =
        "\14\uffff";
    static final String DFA20_minS =
        "\1\60\1\56\1\uffff\1\56\2\60\1\uffff\1\56\4\60";
    static final String DFA20_maxS =
        "\1\71\1\165\1\uffff\1\165\2\71\1\uffff\3\165\1\71\1\165";
    static final String DFA20_acceptS =
        "\2\uffff\1\2\3\uffff\1\1\5\uffff";
    static final String DFA20_specialS =
        "\14\uffff}>";
    static final String[] DFA20_transitionS = {
            "\12\1",
            "\1\5\1\uffff\12\3\16\uffff\1\6\4\uffff\2\2\4\uffff\1\2\1\uffff"+
            "\1\2\11\uffff\1\4\10\uffff\1\6\4\uffff\2\2\4\uffff\1\2\1\uffff"+
            "\1\2",
            "",
            "\1\5\1\uffff\12\3\16\uffff\1\6\4\uffff\2\2\4\uffff\1\2\1\uffff"+
            "\1\2\11\uffff\1\4\10\uffff\1\6\4\uffff\2\2\4\uffff\1\2\1\uffff"+
            "\1\2",
            "\12\7",
            "\12\10",
            "",
            "\1\5\1\uffff\12\3\16\uffff\1\6\4\uffff\2\2\4\uffff\1\2\1\uffff"+
            "\1\2\11\uffff\1\4\10\uffff\1\6\4\uffff\2\2\4\uffff\1\2\1\uffff"+
            "\1\2",
            "\12\11\16\uffff\1\6\4\uffff\2\2\4\uffff\1\2\1\uffff\1\2\11"+
            "\uffff\1\12\10\uffff\1\6\4\uffff\2\2\4\uffff\1\2\1\uffff\1\2",
            "\12\11\16\uffff\1\6\4\uffff\2\2\4\uffff\1\2\1\uffff\1\2\11"+
            "\uffff\1\12\10\uffff\1\6\4\uffff\2\2\4\uffff\1\2\1\uffff\1\2",
            "\12\13",
            "\12\11\16\uffff\1\6\4\uffff\2\2\4\uffff\1\2\1\uffff\1\2\11"+
            "\uffff\1\12\10\uffff\1\6\4\uffff\2\2\4\uffff\1\2\1\uffff\1\2"
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "2991:28: ( RULE_HOURS )?";
        }
    }
    static final String DFA21_eotS =
        "\1\2\4\uffff\1\11\1\uffff\1\11\5\uffff\2\11\1\uffff";
    static final String DFA21_eofS =
        "\20\uffff";
    static final String DFA21_minS =
        "\1\60\1\56\1\uffff\1\56\1\60\1\123\1\60\1\123\1\56\1\uffff\3\60"+
        "\2\123\1\60";
    static final String DFA21_maxS =
        "\1\71\1\165\1\uffff\1\165\1\71\1\163\1\71\1\163\1\165\1\uffff\2"+
        "\165\1\71\2\163\1\165";
    static final String DFA21_acceptS =
        "\2\uffff\1\2\6\uffff\1\1\6\uffff";
    static final String DFA21_specialS =
        "\20\uffff}>";
    static final String[] DFA21_transitionS = {
            "\12\1",
            "\1\6\1\uffff\12\3\23\uffff\1\7\1\2\4\uffff\1\2\1\uffff\1\2"+
            "\11\uffff\1\4\15\uffff\1\5\1\2\4\uffff\1\2\1\uffff\1\2",
            "",
            "\1\6\1\uffff\12\3\23\uffff\1\7\1\2\4\uffff\1\2\1\uffff\1\2"+
            "\11\uffff\1\4\15\uffff\1\5\1\2\4\uffff\1\2\1\uffff\1\2",
            "\12\10",
            "\1\2\37\uffff\1\2",
            "\12\12",
            "\1\2\37\uffff\1\2",
            "\1\6\1\uffff\12\3\23\uffff\1\7\1\2\4\uffff\1\2\1\uffff\1\2"+
            "\11\uffff\1\4\15\uffff\1\5\1\2\4\uffff\1\2\1\uffff\1\2",
            "",
            "\12\13\23\uffff\1\16\1\2\4\uffff\1\2\1\uffff\1\2\11\uffff"+
            "\1\14\15\uffff\1\15\1\2\4\uffff\1\2\1\uffff\1\2",
            "\12\13\23\uffff\1\16\1\2\4\uffff\1\2\1\uffff\1\2\11\uffff"+
            "\1\14\15\uffff\1\15\1\2\4\uffff\1\2\1\uffff\1\2",
            "\12\17",
            "\1\2\37\uffff\1\2",
            "\1\2\37\uffff\1\2",
            "\12\13\23\uffff\1\16\1\2\4\uffff\1\2\1\uffff\1\2\11\uffff"+
            "\1\14\15\uffff\1\15\1\2\4\uffff\1\2\1\uffff\1\2"
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "2991:40: ( RULE_MINUTES )?";
        }
    }
    static final String DFA22_eotS =
        "\1\2\13\uffff";
    static final String DFA22_eofS =
        "\14\uffff";
    static final String DFA22_minS =
        "\1\60\1\56\1\uffff\1\56\1\60\1\uffff\1\60\1\56\4\60";
    static final String DFA22_maxS =
        "\1\71\1\165\1\uffff\1\165\1\71\1\uffff\1\71\3\165\1\71\1\165";
    static final String DFA22_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\6\uffff";
    static final String DFA22_specialS =
        "\14\uffff}>";
    static final String[] DFA22_transitionS = {
            "\12\1",
            "\1\6\1\uffff\12\3\23\uffff\2\2\4\uffff\1\5\1\uffff\1\2\11"+
            "\uffff\1\4\15\uffff\2\2\4\uffff\1\5\1\uffff\1\2",
            "",
            "\1\6\1\uffff\12\3\23\uffff\2\2\4\uffff\1\5\1\uffff\1\2\11"+
            "\uffff\1\4\15\uffff\2\2\4\uffff\1\5\1\uffff\1\2",
            "\12\7",
            "",
            "\12\10",
            "\1\6\1\uffff\12\3\23\uffff\2\2\4\uffff\1\5\1\uffff\1\2\11"+
            "\uffff\1\4\15\uffff\2\2\4\uffff\1\5\1\uffff\1\2",
            "\12\11\23\uffff\2\2\4\uffff\1\5\1\uffff\1\2\11\uffff\1\12"+
            "\15\uffff\2\2\4\uffff\1\5\1\uffff\1\2",
            "\12\11\23\uffff\2\2\4\uffff\1\5\1\uffff\1\2\11\uffff\1\12"+
            "\15\uffff\2\2\4\uffff\1\5\1\uffff\1\2",
            "\12\13",
            "\12\11\23\uffff\2\2\4\uffff\1\5\1\uffff\1\2\11\uffff\1\12"+
            "\15\uffff\2\2\4\uffff\1\5\1\uffff\1\2"
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "2991:54: ( RULE_SECONDS )?";
        }
    }
    static final String DFA23_eotS =
        "\1\2\13\uffff";
    static final String DFA23_eofS =
        "\14\uffff";
    static final String DFA23_minS =
        "\1\60\1\56\1\uffff\1\56\2\60\1\uffff\1\56\4\60";
    static final String DFA23_maxS =
        "\1\71\1\165\1\uffff\1\165\2\71\1\uffff\3\165\1\71\1\165";
    static final String DFA23_acceptS =
        "\2\uffff\1\2\3\uffff\1\1\5\uffff";
    static final String DFA23_specialS =
        "\14\uffff}>";
    static final String[] DFA23_transitionS = {
            "\12\1",
            "\1\5\1\uffff\12\3\23\uffff\1\6\1\2\6\uffff\1\2\11\uffff\1"+
            "\4\15\uffff\1\6\1\2\6\uffff\1\2",
            "",
            "\1\5\1\uffff\12\3\23\uffff\1\6\1\2\6\uffff\1\2\11\uffff\1"+
            "\4\15\uffff\1\6\1\2\6\uffff\1\2",
            "\12\7",
            "\12\10",
            "",
            "\1\5\1\uffff\12\3\23\uffff\1\6\1\2\6\uffff\1\2\11\uffff\1"+
            "\4\15\uffff\1\6\1\2\6\uffff\1\2",
            "\12\11\23\uffff\1\6\1\2\6\uffff\1\2\11\uffff\1\12\15\uffff"+
            "\1\6\1\2\6\uffff\1\2",
            "\12\11\23\uffff\1\6\1\2\6\uffff\1\2\11\uffff\1\12\15\uffff"+
            "\1\6\1\2\6\uffff\1\2",
            "\12\13",
            "\12\11\23\uffff\1\6\1\2\6\uffff\1\2\11\uffff\1\12\15\uffff"+
            "\1\6\1\2\6\uffff\1\2"
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "2991:68: ( RULE_MILLISECONDS )?";
        }
    }
    static final String DFA24_eotS =
        "\1\2\13\uffff";
    static final String DFA24_eofS =
        "\14\uffff";
    static final String DFA24_minS =
        "\1\60\1\56\1\uffff\1\56\1\60\1\uffff\1\60\1\56\4\60";
    static final String DFA24_maxS =
        "\1\71\1\165\1\uffff\1\165\1\71\1\uffff\1\71\3\165\1\71\1\165";
    static final String DFA24_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\6\uffff";
    static final String DFA24_specialS =
        "\14\uffff}>";
    static final String[] DFA24_transitionS = {
            "\12\1",
            "\1\6\1\uffff\12\3\24\uffff\1\2\6\uffff\1\5\11\uffff\1\4\16"+
            "\uffff\1\2\6\uffff\1\5",
            "",
            "\1\6\1\uffff\12\3\24\uffff\1\2\6\uffff\1\5\11\uffff\1\4\16"+
            "\uffff\1\2\6\uffff\1\5",
            "\12\7",
            "",
            "\12\10",
            "\1\6\1\uffff\12\3\24\uffff\1\2\6\uffff\1\5\11\uffff\1\4\16"+
            "\uffff\1\2\6\uffff\1\5",
            "\12\11\24\uffff\1\2\6\uffff\1\5\11\uffff\1\12\16\uffff\1\2"+
            "\6\uffff\1\5",
            "\12\11\24\uffff\1\2\6\uffff\1\5\11\uffff\1\12\16\uffff\1\2"+
            "\6\uffff\1\5",
            "\12\13",
            "\12\11\24\uffff\1\2\6\uffff\1\5\11\uffff\1\12\16\uffff\1\2"+
            "\6\uffff\1\5"
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "2991:87: ( RULE_MICROSECONDS )?";
        }
    }
    static final String DFA27_eotS =
        "\7\uffff";
    static final String DFA27_eofS =
        "\7\uffff";
    static final String DFA27_minS =
        "\1\60\2\56\1\60\2\uffff\1\56";
    static final String DFA27_maxS =
        "\1\71\2\144\1\71\2\uffff\1\144";
    static final String DFA27_acceptS =
        "\4\uffff\1\2\1\1\1\uffff";
    static final String DFA27_specialS =
        "\7\uffff}>";
    static final String[] DFA27_transitionS = {
            "\12\1",
            "\1\5\1\uffff\12\2\12\uffff\1\4\32\uffff\1\3\4\uffff\1\4",
            "\1\5\1\uffff\12\2\12\uffff\1\4\32\uffff\1\3\4\uffff\1\4",
            "\12\6",
            "",
            "",
            "\1\5\1\uffff\12\2\12\uffff\1\4\32\uffff\1\3\4\uffff\1\4"
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "2993:22: ( RULE_FIX_POINT ( 'd' | 'D' ) | RULE_DEC_VALUE ( 'd' | 'D' ) ( '_' )? )";
        }
    }
    static final String DFA29_eotS =
        "\7\uffff";
    static final String DFA29_eofS =
        "\7\uffff";
    static final String DFA29_minS =
        "\1\60\2\56\1\60\2\uffff\1\56";
    static final String DFA29_maxS =
        "\1\71\2\150\1\71\2\uffff\1\150";
    static final String DFA29_acceptS =
        "\4\uffff\1\2\1\1\1\uffff";
    static final String DFA29_specialS =
        "\7\uffff}>";
    static final String[] DFA29_transitionS = {
            "\12\1",
            "\1\5\1\uffff\12\2\16\uffff\1\4\26\uffff\1\3\10\uffff\1\4",
            "\1\5\1\uffff\12\2\16\uffff\1\4\26\uffff\1\3\10\uffff\1\4",
            "\12\6",
            "",
            "",
            "\1\5\1\uffff\12\2\16\uffff\1\4\26\uffff\1\3\10\uffff\1\4"
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "2995:23: ( RULE_FIX_POINT ( 'h' | 'H' ) | RULE_DEC_VALUE ( 'h' | 'H' ) ( '_' )? )";
        }
    }
    static final String DFA31_eotS =
        "\7\uffff";
    static final String DFA31_eofS =
        "\7\uffff";
    static final String DFA31_minS =
        "\1\60\2\56\1\60\2\uffff\1\56";
    static final String DFA31_maxS =
        "\1\71\2\155\1\71\2\uffff\1\155";
    static final String DFA31_acceptS =
        "\4\uffff\1\1\1\2\1\uffff";
    static final String DFA31_specialS =
        "\7\uffff}>";
    static final String[] DFA31_transitionS = {
            "\12\1",
            "\1\4\1\uffff\12\2\23\uffff\1\5\21\uffff\1\3\15\uffff\1\5",
            "\1\4\1\uffff\12\2\23\uffff\1\5\21\uffff\1\3\15\uffff\1\5",
            "\12\6",
            "",
            "",
            "\1\4\1\uffff\12\2\23\uffff\1\5\21\uffff\1\3\15\uffff\1\5"
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "2997:25: ( RULE_FIX_POINT ( 'm' | 'M' ) | RULE_DEC_VALUE ( 'm' | 'M' ) ( '_' )? )";
        }
    }
    static final String DFA33_eotS =
        "\7\uffff";
    static final String DFA33_eofS =
        "\7\uffff";
    static final String DFA33_minS =
        "\1\60\2\56\1\60\2\uffff\1\56";
    static final String DFA33_maxS =
        "\1\71\2\163\1\71\2\uffff\1\163";
    static final String DFA33_acceptS =
        "\4\uffff\1\1\1\2\1\uffff";
    static final String DFA33_specialS =
        "\7\uffff}>";
    static final String[] DFA33_transitionS = {
            "\12\1",
            "\1\4\1\uffff\12\2\31\uffff\1\5\13\uffff\1\3\23\uffff\1\5",
            "\1\4\1\uffff\12\2\31\uffff\1\5\13\uffff\1\3\23\uffff\1\5",
            "\12\6",
            "",
            "",
            "\1\4\1\uffff\12\2\31\uffff\1\5\13\uffff\1\3\23\uffff\1\5"
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "2999:25: ( RULE_FIX_POINT ( 's' | 'S' ) | RULE_DEC_VALUE ( 's' | 'S' ) ( '_' )? )";
        }
    }
    static final String DFA37_eotS =
        "\7\uffff";
    static final String DFA37_eofS =
        "\7\uffff";
    static final String DFA37_minS =
        "\1\60\2\56\1\60\2\uffff\1\56";
    static final String DFA37_maxS =
        "\1\71\2\155\1\71\2\uffff\1\155";
    static final String DFA37_acceptS =
        "\4\uffff\1\2\1\1\1\uffff";
    static final String DFA37_specialS =
        "\7\uffff}>";
    static final String[] DFA37_transitionS = {
            "\12\1",
            "\1\5\1\uffff\12\2\23\uffff\1\4\21\uffff\1\3\15\uffff\1\4",
            "\1\5\1\uffff\12\2\23\uffff\1\4\21\uffff\1\3\15\uffff\1\4",
            "\12\6",
            "",
            "",
            "\1\5\1\uffff\12\2\23\uffff\1\4\21\uffff\1\3\15\uffff\1\4"
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "3001:30: ( RULE_FIX_POINT ( 'ms' | 'Ms' | 'mS' | 'MS' ) | RULE_DEC_VALUE ( 'ms' | 'Ms' | 'mS' | 'MS' ) ( '_' )? )";
        }
    }
    static final String DFA39_eotS =
        "\7\uffff";
    static final String DFA39_eofS =
        "\7\uffff";
    static final String DFA39_minS =
        "\1\60\2\56\1\60\2\uffff\1\56";
    static final String DFA39_maxS =
        "\1\71\2\165\1\71\2\uffff\1\165";
    static final String DFA39_acceptS =
        "\4\uffff\1\2\1\1\1\uffff";
    static final String DFA39_specialS =
        "\7\uffff}>";
    static final String[] DFA39_transitionS = {
            "\12\1",
            "\1\5\1\uffff\12\2\33\uffff\1\4\11\uffff\1\3\25\uffff\1\4",
            "\1\5\1\uffff\12\2\33\uffff\1\4\11\uffff\1\3\25\uffff\1\4",
            "\12\6",
            "",
            "",
            "\1\5\1\uffff\12\2\33\uffff\1\4\11\uffff\1\3\25\uffff\1\4"
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "3003:30: ( RULE_FIX_POINT ( 'u' | 'U' ) ( 's' | 'S' ) | RULE_DEC_VALUE ( 'u' | 'U' ) ( 's' | 'S' ) ( '_' )? )";
        }
    }
    static final String DFA40_eotS =
        "\7\uffff";
    static final String DFA40_eofS =
        "\7\uffff";
    static final String DFA40_minS =
        "\1\60\2\56\1\60\2\uffff\1\56";
    static final String DFA40_maxS =
        "\1\71\2\156\1\71\2\uffff\1\156";
    static final String DFA40_acceptS =
        "\4\uffff\1\1\1\2\1\uffff";
    static final String DFA40_specialS =
        "\7\uffff}>";
    static final String[] DFA40_transitionS = {
            "\12\1",
            "\1\4\1\uffff\12\2\24\uffff\1\5\20\uffff\1\3\16\uffff\1\5",
            "\1\4\1\uffff\12\2\24\uffff\1\5\20\uffff\1\3\16\uffff\1\5",
            "\12\6",
            "",
            "",
            "\1\4\1\uffff\12\2\24\uffff\1\5\20\uffff\1\3\16\uffff\1\5"
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "3005:29: ( RULE_FIX_POINT ( 'n' | 'N' ) ( 's' | 'S' ) | RULE_DEC_VALUE ( 'n' | 'N' ) ( 's' | 'S' ) )";
        }
    }
    static final String DFA42_eotS =
        "\1\45\6\50\2\uffff\2\50\1\76\1\105\1\50\1\112\3\uffff\1\116\1\uffff"+
        "\3\121\3\125\14\uffff\2\50\1\uffff\12\50\1\153\1\uffff\3\50\1\161"+
        "\1\50\2\uffff\2\50\1\uffff\1\125\4\uffff\1\125\1\uffff\4\50\25\uffff"+
        "\10\50\1\u0086\3\50\1\uffff\5\50\1\uffff\1\50\1\u0090\2\50\1\125"+
        "\1\u0093\1\uffff\3\50\1\u0099\1\121\1\u009a\1\u009b\1\50\1\u009d"+
        "\2\50\1\u00a0\1\50\1\uffff\1\u00a2\2\50\1\u00a5\3\50\1\u00a9\1\50"+
        "\1\uffff\1\u00ab\1\u00ac\1\uffff\1\u0093\1\uffff\1\50\1\u00af\1"+
        "\u00b1\3\uffff\1\u00b2\1\uffff\1\u00b3\1\u00b4\1\uffff\1\50\1\uffff"+
        "\1\u00b6\1\50\1\uffff\1\u00b8\1\u00b9\1\u00bb\1\uffff\1\50\2\uffff"+
        "\1\u0093\1\u00bd\1\uffff\1\50\4\uffff\1\50\1\uffff\1\50\2\uffff"+
        "\1\50\1\uffff\1\50\1\uffff\1\50\1\uffff\23\50\1\u00d7\1\50\1\u00d9"+
        "\1\50\1\uffff\1\u00db\1\uffff\1\50\1\uffff\1\u00dd\1\uffff";
    static final String DFA42_eofS =
        "\u00de\uffff";
    static final String DFA42_minS =
        "\1\40\1\117\1\104\1\111\1\116\1\43\1\104\2\uffff\1\105\1\117\2"+
        "\55\1\101\1\60\3\uffff\1\60\1\uffff\2\52\1\0\2\43\1\55\12\uffff"+
        "\1\42\1\uffff\1\117\1\124\1\uffff\1\111\1\116\2\111\1\116\1\122"+
        "\1\124\1\116\1\117\1\124\1\60\1\uffff\1\116\1\105\1\117\1\60\1\43"+
        "\2\uffff\1\101\1\122\1\uffff\1\55\2\60\2\uffff\1\43\1\uffff\1\114"+
        "\1\125\1\115\1\104\24\uffff\1\60\1\114\1\105\1\116\1\124\2\116\1"+
        "\124\1\111\1\60\1\124\1\122\1\105\1\uffff\1\124\1\101\1\122\1\115"+
        "\1\104\1\uffff\1\124\1\60\1\114\1\104\1\55\1\60\1\uffff\1\123\2"+
        "\105\4\60\1\124\1\60\2\124\1\60\1\116\1\uffff\1\60\1\104\1\43\1"+
        "\60\1\114\1\104\1\105\1\60\1\105\1\uffff\2\60\1\uffff\2\60\1\105"+
        "\2\60\3\uffff\1\60\1\uffff\2\60\1\uffff\1\107\1\uffff\1\60\1\101"+
        "\1\uffff\3\60\1\uffff\1\43\2\uffff\2\60\1\uffff\1\117\4\uffff\1"+
        "\43\1\uffff\1\116\2\uffff\1\117\1\uffff\1\101\1\uffff\1\106\1\uffff"+
        "\1\104\1\106\1\116\3\137\2\104\1\124\1\104\1\137\1\101\1\111\1\101"+
        "\1\124\1\131\1\115\1\131\1\111\1\60\1\105\1\60\1\115\1\uffff\1\60"+
        "\1\uffff\1\105\1\uffff\1\60\1\uffff";
    static final String DFA42_maxS =
        "\1\176\1\131\1\123\1\124\1\116\2\127\2\uffff\1\105\1\117\2\165"+
        "\1\101\1\172\3\uffff\1\172\1\uffff\1\57\1\52\1\uffff\3\165\12\uffff"+
        "\1\124\1\uffff\1\117\1\124\1\uffff\1\111\1\116\2\111\1\116\1\122"+
        "\1\124\1\116\1\117\1\124\1\172\1\uffff\1\116\1\105\1\117\1\172\1"+
        "\124\2\uffff\1\101\1\122\1\uffff\1\165\2\71\2\uffff\1\165\1\uffff"+
        "\1\114\1\125\1\115\1\104\24\uffff\1\106\1\114\1\105\1\116\1\124"+
        "\2\116\1\124\1\111\1\172\1\124\1\122\1\105\1\uffff\1\124\1\101\1"+
        "\122\1\115\1\104\1\uffff\1\124\1\172\1\114\1\104\2\165\1\uffff\1"+
        "\123\2\105\1\172\1\106\2\172\1\124\1\172\2\124\1\172\1\116\1\uffff"+
        "\1\172\1\104\1\137\1\172\1\114\1\104\1\105\1\172\1\105\1\uffff\2"+
        "\172\1\uffff\1\165\1\71\1\105\2\172\3\uffff\1\172\1\uffff\2\172"+
        "\1\uffff\1\107\1\uffff\1\172\1\101\1\uffff\3\172\1\uffff\1\137\2"+
        "\uffff\1\165\1\172\1\uffff\1\117\4\uffff\1\43\1\uffff\1\116\2\uffff"+
        "\1\117\1\uffff\1\101\1\uffff\1\106\1\uffff\1\104\1\106\1\116\3\137"+
        "\2\104\1\124\1\104\1\137\1\101\1\111\1\101\1\124\1\131\1\115\1\131"+
        "\1\111\1\172\1\105\1\172\1\115\1\uffff\1\172\1\uffff\1\105\1\uffff"+
        "\1\172\1\uffff";
    static final String DFA42_acceptS =
        "\7\uffff\1\12\1\13\6\uffff\1\42\1\44\1\45\1\uffff\1\47\6\uffff"+
        "\6\61\2\47\2\61\1\uffff\1\63\2\uffff\1\47\13\uffff\1\65\5\uffff"+
        "\1\12\1\13\2\uffff\1\22\3\uffff\1\64\1\66\1\uffff\1\23\4\uffff\1"+
        "\33\1\42\1\44\1\45\1\46\1\50\1\52\1\61\1\51\1\53\1\54\1\57\1\55"+
        "\6\61\1\62\15\uffff\1\40\5\uffff\1\34\6\uffff\1\56\15\uffff\1\7"+
        "\11\uffff\1\41\2\uffff\1\60\5\uffff\1\31\1\1\1\16\1\uffff\1\3\2"+
        "\uffff\1\6\1\uffff\1\10\2\uffff\1\11\3\uffff\1\32\1\uffff\1\15\1"+
        "\17\2\uffff\1\25\1\uffff\1\26\1\2\1\4\1\5\1\uffff\1\20\1\uffff\1"+
        "\14\1\21\1\uffff\1\27\1\uffff\1\24\1\uffff\1\43\27\uffff\1\30\1"+
        "\uffff\1\35\1\uffff\1\36\1\uffff\1\37";
    static final String DFA42_specialS =
        "\26\uffff\1\0\u00c7\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\32\1\33\1\21\1\17\1\44\1\34\1\35\1\20\1\25\2\36\1\7\1\36"+
            "\1\10\1\36\1\24\1\13\1\14\1\27\5\31\1\30\1\31\7\37\1\23\1\1"+
            "\1\23\1\5\1\23\1\15\2\23\1\4\2\23\1\6\5\23\1\11\1\3\1\16\1\2"+
            "\1\23\1\12\3\23\4\42\1\40\1\42\23\41\1\22\6\41\1\26\3\43",
            "\1\46\11\uffff\1\47",
            "\1\53\4\uffff\1\52\2\uffff\1\54\6\uffff\1\51",
            "\1\55\12\uffff\1\56",
            "\1\57",
            "\1\64\35\uffff\1\62\7\uffff\1\60\12\uffff\1\63\2\uffff\1\61",
            "\1\71\4\uffff\1\65\10\uffff\1\66\1\uffff\1\70\2\uffff\1\67",
            "",
            "",
            "\1\74",
            "\1\75",
            "\1\103\1\101\1\uffff\12\77\1\102\11\uffff\1\45\3\uffff\1\45"+
            "\4\uffff\2\45\4\uffff\1\45\1\uffff\1\45\11\uffff\1\100\4\uffff"+
            "\1\45\3\uffff\1\45\4\uffff\2\45\4\uffff\1\45\1\uffff\1\45",
            "\1\103\1\101\1\uffff\6\77\1\104\3\77\1\102\11\uffff\1\45\3"+
            "\uffff\1\45\4\uffff\2\45\4\uffff\1\45\1\uffff\1\45\11\uffff"+
            "\1\100\4\uffff\1\45\3\uffff\1\45\4\uffff\2\45\4\uffff\1\45\1"+
            "\uffff\1\45",
            "\1\106",
            "\12\50\7\uffff\10\50\1\110\5\50\1\111\2\50\1\107\10\50\4\uffff"+
            "\1\50\1\uffff\32\50",
            "",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\120\4\uffff\1\117",
            "\1\122",
            "\0\123",
            "\1\124\11\uffff\1\103\1\101\1\uffff\12\77\1\102\11\uffff\1"+
            "\45\3\uffff\1\45\4\uffff\2\45\4\uffff\1\45\1\uffff\1\45\11\uffff"+
            "\1\100\4\uffff\1\45\3\uffff\1\45\4\uffff\2\45\4\uffff\1\45\1"+
            "\uffff\1\45",
            "\1\126\11\uffff\1\103\1\101\1\uffff\12\77\1\102\11\uffff\1"+
            "\45\3\uffff\1\45\4\uffff\2\45\4\uffff\1\45\1\uffff\1\45\11\uffff"+
            "\1\100\4\uffff\1\45\3\uffff\1\45\4\uffff\2\45\4\uffff\1\45\1"+
            "\uffff\1\45",
            "\1\103\1\101\1\uffff\12\77\1\102\11\uffff\1\45\3\uffff\1\45"+
            "\4\uffff\2\45\4\uffff\1\45\1\uffff\1\45\11\uffff\1\100\4\uffff"+
            "\1\45\3\uffff\1\45\4\uffff\2\45\4\uffff\1\45\1\uffff\1\45",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\135\1\uffff\1\127\2\uffff\1\121\10\uffff\12\136\7\uffff"+
            "\6\136\5\uffff\1\130\1\uffff\1\131\1\uffff\1\132\1\uffff\1\133"+
            "\1\uffff\1\134",
            "",
            "\1\137",
            "\1\140",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\154",
            "\1\155",
            "\1\156",
            "\12\50\7\uffff\10\50\1\157\5\50\1\160\13\50\4\uffff\1\50\1"+
            "\uffff\32\50",
            "\1\64\35\uffff\1\162\22\uffff\1\163",
            "",
            "",
            "\1\164",
            "\1\165",
            "",
            "\1\103\1\101\1\uffff\12\77\1\102\11\uffff\1\45\3\uffff\1\45"+
            "\4\uffff\2\45\4\uffff\1\45\1\uffff\1\45\11\uffff\1\100\4\uffff"+
            "\1\45\3\uffff\1\45\4\uffff\2\45\4\uffff\1\45\1\uffff\1\45",
            "\12\166",
            "\12\167",
            "",
            "",
            "\1\170\11\uffff\1\103\1\101\1\uffff\12\77\1\102\11\uffff\1"+
            "\45\3\uffff\1\45\4\uffff\2\45\4\uffff\1\45\1\uffff\1\45\11\uffff"+
            "\1\100\4\uffff\1\45\3\uffff\1\45\4\uffff\2\45\4\uffff\1\45\1"+
            "\uffff\1\45",
            "",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\175\7\uffff\6\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "",
            "\1\u008f",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0091",
            "\1\u0092",
            "\1\103\1\101\1\uffff\12\77\1\102\11\uffff\1\45\3\uffff\1\45"+
            "\4\uffff\2\45\4\uffff\1\45\1\uffff\1\45\11\uffff\1\100\4\uffff"+
            "\1\45\3\uffff\1\45\4\uffff\2\45\4\uffff\1\45\1\uffff\1\45",
            "\12\u0094\12\uffff\1\45\3\uffff\1\45\4\uffff\2\45\4\uffff"+
            "\1\45\1\uffff\1\45\11\uffff\1\u0095\4\uffff\1\45\3\uffff\1\45"+
            "\4\uffff\2\45\4\uffff\1\45\1\uffff\1\45",
            "",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\135\7\uffff\6\135",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u009c",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u009e",
            "\1\u009f",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00a1",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00a3",
            "\1\64\73\uffff\1\u00a4",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00aa",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\u0094\12\uffff\1\45\3\uffff\1\45\4\uffff\2\45\4\uffff"+
            "\1\45\1\uffff\1\45\11\uffff\1\u0095\4\uffff\1\45\3\uffff\1\45"+
            "\4\uffff\2\45\4\uffff\1\45\1\uffff\1\45",
            "\12\u00ad",
            "\1\u00ae",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\u00b0\1\uffff\32\50",
            "",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00b5",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00b7",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\u00ba\1\uffff\32\50",
            "",
            "\1\64\73\uffff\1\u00bc",
            "",
            "",
            "\12\u0094\12\uffff\1\45\3\uffff\1\45\4\uffff\2\45\4\uffff"+
            "\1\45\1\uffff\1\45\11\uffff\1\u0095\4\uffff\1\45\3\uffff\1\45"+
            "\4\uffff\2\45\4\uffff\1\45\1\uffff\1\45",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00be",
            "",
            "",
            "",
            "",
            "\1\u00bf",
            "",
            "\1\u00c0",
            "",
            "",
            "\1\u00c1",
            "",
            "\1\u00c2",
            "",
            "\1\u00c3",
            "",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00d8",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00da",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00dc",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            ""
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | RULE_IDENTIFIER | RULE_SL_COMMENT | RULE_ML_COMMENT_1 | RULE_ML_COMMENT_2 | RULE_PRAGMA | RULE_BIN_VALUE | RULE_OCT_VALUE | RULE_HEX_VALUE | RULE_DEC_VALUE | RULE_FLOAT_VALUE | RULE_S_BYTE_CHAR_VALUE | RULE_D_BYTE_CHAR_VALUE | RULE_INTERVAL | RULE_DAYTIME_VALUE | RULE_DATE_VALUE | RULE_DATE_LITERAL );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_22 = input.LA(1);

                        s = -1;
                        if ( ((LA42_22>='\u0000' && LA42_22<='\uFFFF')) ) {s = 83;}

                        else s = 81;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
// Generated from MountC.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MountCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LBRACE=1, RBRACE=2, LPAREN=3, RPAREN=4, COMMA=5, QUEST=6, COLON=7, SCOLON=8, 
		GETS=9, PLUS=10, MINUS=11, RETURN=12, NUM=13, ID=14, C=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LBRACE", "RBRACE", "LPAREN", "RPAREN", "COMMA", "QUEST", "COLON", "SCOLON", 
		"GETS", "PLUS", "MINUS", "RETURN", "NUM", "ID", "C", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'('", "')'", "','", "'?'", "':'", "';'", "'='", "'+'", 
		"'-'", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LBRACE", "RBRACE", "LPAREN", "RPAREN", "COMMA", "QUEST", "COLON", 
		"SCOLON", "GETS", "PLUS", "MINUS", "RETURN", "NUM", "ID", "C", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public MountCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MountC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22`\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\6\16B\n\16\r\16\16\16C\3"+
		"\17\3\17\7\17H\n\17\f\17\16\17K\13\17\3\20\3\20\3\20\3\20\7\20Q\n\20\f"+
		"\20\16\20T\13\20\3\20\3\20\3\20\3\20\3\21\6\21[\n\21\r\21\16\21\\\3\21"+
		"\3\21\3R\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22\3\2\6\3\2\62;\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f"+
		"\17\17\"\"\2c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\3#\3\2\2\2\5%\3\2\2\2\7\'\3\2\2\2\t)\3\2\2\2\13+\3\2\2\2\r-\3\2\2"+
		"\2\17/\3\2\2\2\21\61\3\2\2\2\23\63\3\2\2\2\25\65\3\2\2\2\27\67\3\2\2\2"+
		"\319\3\2\2\2\33A\3\2\2\2\35E\3\2\2\2\37L\3\2\2\2!Z\3\2\2\2#$\7}\2\2$\4"+
		"\3\2\2\2%&\7\177\2\2&\6\3\2\2\2\'(\7*\2\2(\b\3\2\2\2)*\7+\2\2*\n\3\2\2"+
		"\2+,\7.\2\2,\f\3\2\2\2-.\7A\2\2.\16\3\2\2\2/\60\7<\2\2\60\20\3\2\2\2\61"+
		"\62\7=\2\2\62\22\3\2\2\2\63\64\7?\2\2\64\24\3\2\2\2\65\66\7-\2\2\66\26"+
		"\3\2\2\2\678\7/\2\28\30\3\2\2\29:\7t\2\2:;\7g\2\2;<\7v\2\2<=\7w\2\2=>"+
		"\7t\2\2>?\7p\2\2?\32\3\2\2\2@B\t\2\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2C"+
		"D\3\2\2\2D\34\3\2\2\2EI\t\3\2\2FH\t\4\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2"+
		"\2IJ\3\2\2\2J\36\3\2\2\2KI\3\2\2\2LM\7\61\2\2MN\7\61\2\2NR\3\2\2\2OQ\13"+
		"\2\2\2PO\3\2\2\2QT\3\2\2\2RS\3\2\2\2RP\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7"+
		"\f\2\2VW\3\2\2\2WX\b\20\2\2X \3\2\2\2Y[\t\5\2\2ZY\3\2\2\2[\\\3\2\2\2\\"+
		"Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\b\21\2\2_\"\3\2\2\2\7\2CIR\\\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from java-escape by ANTLR 4.11.0-SNAPSHOT
package br.ufscar.dc.compiladores.t6;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MovUnityLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.0-SNAPSHOT", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GAMEOBJECT=1, SIDESCROLLING=2, TOPDOWN=3, VELOCIDADE=4, NUM=5, GRAVIDADE=6, 
		CONTROLES=7, TECLADO=8, MOUSE=9, TEMPLATE=10, MODO=11, WASD=12, FLECHAS=13, 
		CLIQUE=14, SEGUIR=15, BOTAO=16, DIREITO=17, ESQUERDO=18, W=19, ESPACO=20, 
		FLECHA=21, PULO=22, DIAGONAL=23, VERDADEIRO=24, FALSO=25, NOME=26, DOISPONTOS=27, 
		ABREPAR=28, FECHAPAR=29, ABRECHAVE=30, FECHACHAVE=31, COMENTARIO=32, COMENTARIO_NAO_FECHADO=33, 
		ERRO=34, IGNORE=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"GAMEOBJECT", "SIDESCROLLING", "TOPDOWN", "VELOCIDADE", "NUM", "GRAVIDADE", 
			"CONTROLES", "TECLADO", "MOUSE", "TEMPLATE", "MODO", "WASD", "FLECHAS", 
			"CLIQUE", "SEGUIR", "BOTAO", "DIREITO", "ESQUERDO", "W", "ESPACO", "FLECHA", 
			"PULO", "DIAGONAL", "VERDADEIRO", "FALSO", "NOME", "DOISPONTOS", "ABREPAR", 
			"FECHAPAR", "ABRECHAVE", "FECHACHAVE", "COMENTARIO", "COMENTARIO_NAO_FECHADO", 
			"ERRO", "IGNORE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'GameObject'", "'SIDE-SCROLLING'", "'TOP-DOWN'", "'velocidade'", 
			null, "'gravidade'", "'controles'", "'teclado'", "'mouse'", "'template'", 
			"'modo'", "'WASD'", "'FLECHAS'", "'CLIQUE'", "'SEGUIR'", "'botao'", "'DIREITO'", 
			"'ESQUERDO'", "'W'", "'ESPACO'", "'FLECHA'", "'pulo'", "'diagonal'", 
			"'VERDADEIRO'", "'FALSO'", null, "':'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GAMEOBJECT", "SIDESCROLLING", "TOPDOWN", "VELOCIDADE", "NUM", 
			"GRAVIDADE", "CONTROLES", "TECLADO", "MOUSE", "TEMPLATE", "MODO", "WASD", 
			"FLECHAS", "CLIQUE", "SEGUIR", "BOTAO", "DIREITO", "ESQUERDO", "W", "ESPACO", 
			"FLECHA", "PULO", "DIAGONAL", "VERDADEIRO", "FALSO", "NOME", "DOISPONTOS", 
			"ABREPAR", "FECHAPAR", "ABRECHAVE", "FECHACHAVE", "COMENTARIO", "COMENTARIO_NAO_FECHADO", 
			"ERRO", "IGNORE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public MovUnityLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MovUnity.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 31:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 34:
			IGNORE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void IGNORE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000#\u0149\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0004\u0004w\b\u0004\u000b\u0004\f\u0004x\u0001\u0004\u0001\u0004"+
		"\u0004\u0004}\b\u0004\u000b\u0004\f\u0004~\u0003\u0004\u0081\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0005\u0019\u0116\b\u0019\n\u0019"+
		"\f\u0019\u0119\t\u0019\u0001\u0019\u0005\u0019\u011c\b\u0019\n\u0019\f"+
		"\u0019\u011f\t\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0123\b\u0019"+
		"\n\u0019\f\u0019\u0126\t\u0019\u0003\u0019\u0128\b\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0005\u001f\u0136"+
		"\b\u001f\n\u001f\f\u001f\u0139\t\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0005 \u0140\b \n \f \u0143\t \u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0000\u0000#\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		";\u001e=\u001f? A!C\"E#\u0001\u0000\u0006\u0002\u0000AZaz\u0003\u0000"+
		"09AZaz\u0004\u0000\t\n\r\r{{}}\u0004\u0000\t\n\r\r[[]]\u0006\u0000!!$"+
		"$@@]]||~~\u0003\u0000\t\n\r\r  \u0151\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000"+
		"\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000"+
		";\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001"+
		"\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000"+
		"\u0000\u0000E\u0001\u0000\u0000\u0000\u0001G\u0001\u0000\u0000\u0000\u0003"+
		"R\u0001\u0000\u0000\u0000\u0005a\u0001\u0000\u0000\u0000\u0007j\u0001"+
		"\u0000\u0000\u0000\tv\u0001\u0000\u0000\u0000\u000b\u0082\u0001\u0000"+
		"\u0000\u0000\r\u008c\u0001\u0000\u0000\u0000\u000f\u0096\u0001\u0000\u0000"+
		"\u0000\u0011\u009e\u0001\u0000\u0000\u0000\u0013\u00a4\u0001\u0000\u0000"+
		"\u0000\u0015\u00ad\u0001\u0000\u0000\u0000\u0017\u00b2\u0001\u0000\u0000"+
		"\u0000\u0019\u00b7\u0001\u0000\u0000\u0000\u001b\u00bf\u0001\u0000\u0000"+
		"\u0000\u001d\u00c6\u0001\u0000\u0000\u0000\u001f\u00cd\u0001\u0000\u0000"+
		"\u0000!\u00d3\u0001\u0000\u0000\u0000#\u00db\u0001\u0000\u0000\u0000%"+
		"\u00e4\u0001\u0000\u0000\u0000\'\u00e6\u0001\u0000\u0000\u0000)\u00ed"+
		"\u0001\u0000\u0000\u0000+\u00f4\u0001\u0000\u0000\u0000-\u00f9\u0001\u0000"+
		"\u0000\u0000/\u0102\u0001\u0000\u0000\u00001\u010d\u0001\u0000\u0000\u0000"+
		"3\u0113\u0001\u0000\u0000\u00005\u0129\u0001\u0000\u0000\u00007\u012b"+
		"\u0001\u0000\u0000\u00009\u012d\u0001\u0000\u0000\u0000;\u012f\u0001\u0000"+
		"\u0000\u0000=\u0131\u0001\u0000\u0000\u0000?\u0133\u0001\u0000\u0000\u0000"+
		"A\u013d\u0001\u0000\u0000\u0000C\u0144\u0001\u0000\u0000\u0000E\u0146"+
		"\u0001\u0000\u0000\u0000GH\u0005G\u0000\u0000HI\u0005a\u0000\u0000IJ\u0005"+
		"m\u0000\u0000JK\u0005e\u0000\u0000KL\u0005O\u0000\u0000LM\u0005b\u0000"+
		"\u0000MN\u0005j\u0000\u0000NO\u0005e\u0000\u0000OP\u0005c\u0000\u0000"+
		"PQ\u0005t\u0000\u0000Q\u0002\u0001\u0000\u0000\u0000RS\u0005S\u0000\u0000"+
		"ST\u0005I\u0000\u0000TU\u0005D\u0000\u0000UV\u0005E\u0000\u0000VW\u0005"+
		"-\u0000\u0000WX\u0005S\u0000\u0000XY\u0005C\u0000\u0000YZ\u0005R\u0000"+
		"\u0000Z[\u0005O\u0000\u0000[\\\u0005L\u0000\u0000\\]\u0005L\u0000\u0000"+
		"]^\u0005I\u0000\u0000^_\u0005N\u0000\u0000_`\u0005G\u0000\u0000`\u0004"+
		"\u0001\u0000\u0000\u0000ab\u0005T\u0000\u0000bc\u0005O\u0000\u0000cd\u0005"+
		"P\u0000\u0000de\u0005-\u0000\u0000ef\u0005D\u0000\u0000fg\u0005O\u0000"+
		"\u0000gh\u0005W\u0000\u0000hi\u0005N\u0000\u0000i\u0006\u0001\u0000\u0000"+
		"\u0000jk\u0005v\u0000\u0000kl\u0005e\u0000\u0000lm\u0005l\u0000\u0000"+
		"mn\u0005o\u0000\u0000no\u0005c\u0000\u0000op\u0005i\u0000\u0000pq\u0005"+
		"d\u0000\u0000qr\u0005a\u0000\u0000rs\u0005d\u0000\u0000st\u0005e\u0000"+
		"\u0000t\b\u0001\u0000\u0000\u0000uw\u000209\u0000vu\u0001\u0000\u0000"+
		"\u0000wx\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000y\u0080\u0001\u0000\u0000\u0000z|\u0005.\u0000\u0000{}\u0002"+
		"09\u0000|{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~|\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0081\u0001\u0000\u0000"+
		"\u0000\u0080z\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000"+
		"\u0081\n\u0001\u0000\u0000\u0000\u0082\u0083\u0005g\u0000\u0000\u0083"+
		"\u0084\u0005r\u0000\u0000\u0084\u0085\u0005a\u0000\u0000\u0085\u0086\u0005"+
		"v\u0000\u0000\u0086\u0087\u0005i\u0000\u0000\u0087\u0088\u0005d\u0000"+
		"\u0000\u0088\u0089\u0005a\u0000\u0000\u0089\u008a\u0005d\u0000\u0000\u008a"+
		"\u008b\u0005e\u0000\u0000\u008b\f\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0005c\u0000\u0000\u008d\u008e\u0005o\u0000\u0000\u008e\u008f\u0005n"+
		"\u0000\u0000\u008f\u0090\u0005t\u0000\u0000\u0090\u0091\u0005r\u0000\u0000"+
		"\u0091\u0092\u0005o\u0000\u0000\u0092\u0093\u0005l\u0000\u0000\u0093\u0094"+
		"\u0005e\u0000\u0000\u0094\u0095\u0005s\u0000\u0000\u0095\u000e\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0005t\u0000\u0000\u0097\u0098\u0005e\u0000\u0000"+
		"\u0098\u0099\u0005c\u0000\u0000\u0099\u009a\u0005l\u0000\u0000\u009a\u009b"+
		"\u0005a\u0000\u0000\u009b\u009c\u0005d\u0000\u0000\u009c\u009d\u0005o"+
		"\u0000\u0000\u009d\u0010\u0001\u0000\u0000\u0000\u009e\u009f\u0005m\u0000"+
		"\u0000\u009f\u00a0\u0005o\u0000\u0000\u00a0\u00a1\u0005u\u0000\u0000\u00a1"+
		"\u00a2\u0005s\u0000\u0000\u00a2\u00a3\u0005e\u0000\u0000\u00a3\u0012\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0005t\u0000\u0000\u00a5\u00a6\u0005e\u0000"+
		"\u0000\u00a6\u00a7\u0005m\u0000\u0000\u00a7\u00a8\u0005p\u0000\u0000\u00a8"+
		"\u00a9\u0005l\u0000\u0000\u00a9\u00aa\u0005a\u0000\u0000\u00aa\u00ab\u0005"+
		"t\u0000\u0000\u00ab\u00ac\u0005e\u0000\u0000\u00ac\u0014\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0005m\u0000\u0000\u00ae\u00af\u0005o\u0000\u0000\u00af"+
		"\u00b0\u0005d\u0000\u0000\u00b0\u00b1\u0005o\u0000\u0000\u00b1\u0016\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0005W\u0000\u0000\u00b3\u00b4\u0005A\u0000"+
		"\u0000\u00b4\u00b5\u0005S\u0000\u0000\u00b5\u00b6\u0005D\u0000\u0000\u00b6"+
		"\u0018\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005F\u0000\u0000\u00b8\u00b9"+
		"\u0005L\u0000\u0000\u00b9\u00ba\u0005E\u0000\u0000\u00ba\u00bb\u0005C"+
		"\u0000\u0000\u00bb\u00bc\u0005H\u0000\u0000\u00bc\u00bd\u0005A\u0000\u0000"+
		"\u00bd\u00be\u0005S\u0000\u0000\u00be\u001a\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c0\u0005C\u0000\u0000\u00c0\u00c1\u0005L\u0000\u0000\u00c1\u00c2\u0005"+
		"I\u0000\u0000\u00c2\u00c3\u0005Q\u0000\u0000\u00c3\u00c4\u0005U\u0000"+
		"\u0000\u00c4\u00c5\u0005E\u0000\u0000\u00c5\u001c\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c7\u0005S\u0000\u0000\u00c7\u00c8\u0005E\u0000\u0000\u00c8\u00c9"+
		"\u0005G\u0000\u0000\u00c9\u00ca\u0005U\u0000\u0000\u00ca\u00cb\u0005I"+
		"\u0000\u0000\u00cb\u00cc\u0005R\u0000\u0000\u00cc\u001e\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ce\u0005b\u0000\u0000\u00ce\u00cf\u0005o\u0000\u0000\u00cf"+
		"\u00d0\u0005t\u0000\u0000\u00d0\u00d1\u0005a\u0000\u0000\u00d1\u00d2\u0005"+
		"o\u0000\u0000\u00d2 \u0001\u0000\u0000\u0000\u00d3\u00d4\u0005D\u0000"+
		"\u0000\u00d4\u00d5\u0005I\u0000\u0000\u00d5\u00d6\u0005R\u0000\u0000\u00d6"+
		"\u00d7\u0005E\u0000\u0000\u00d7\u00d8\u0005I\u0000\u0000\u00d8\u00d9\u0005"+
		"T\u0000\u0000\u00d9\u00da\u0005O\u0000\u0000\u00da\"\u0001\u0000\u0000"+
		"\u0000\u00db\u00dc\u0005E\u0000\u0000\u00dc\u00dd\u0005S\u0000\u0000\u00dd"+
		"\u00de\u0005Q\u0000\u0000\u00de\u00df\u0005U\u0000\u0000\u00df\u00e0\u0005"+
		"E\u0000\u0000\u00e0\u00e1\u0005R\u0000\u0000\u00e1\u00e2\u0005D\u0000"+
		"\u0000\u00e2\u00e3\u0005O\u0000\u0000\u00e3$\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0005W\u0000\u0000\u00e5&\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005"+
		"E\u0000\u0000\u00e7\u00e8\u0005S\u0000\u0000\u00e8\u00e9\u0005P\u0000"+
		"\u0000\u00e9\u00ea\u0005A\u0000\u0000\u00ea\u00eb\u0005C\u0000\u0000\u00eb"+
		"\u00ec\u0005O\u0000\u0000\u00ec(\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005"+
		"F\u0000\u0000\u00ee\u00ef\u0005L\u0000\u0000\u00ef\u00f0\u0005E\u0000"+
		"\u0000\u00f0\u00f1\u0005C\u0000\u0000\u00f1\u00f2\u0005H\u0000\u0000\u00f2"+
		"\u00f3\u0005A\u0000\u0000\u00f3*\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005"+
		"p\u0000\u0000\u00f5\u00f6\u0005u\u0000\u0000\u00f6\u00f7\u0005l\u0000"+
		"\u0000\u00f7\u00f8\u0005o\u0000\u0000\u00f8,\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fa\u0005d\u0000\u0000\u00fa\u00fb\u0005i\u0000\u0000\u00fb\u00fc\u0005"+
		"a\u0000\u0000\u00fc\u00fd\u0005g\u0000\u0000\u00fd\u00fe\u0005o\u0000"+
		"\u0000\u00fe\u00ff\u0005n\u0000\u0000\u00ff\u0100\u0005a\u0000\u0000\u0100"+
		"\u0101\u0005l\u0000\u0000\u0101.\u0001\u0000\u0000\u0000\u0102\u0103\u0005"+
		"V\u0000\u0000\u0103\u0104\u0005E\u0000\u0000\u0104\u0105\u0005R\u0000"+
		"\u0000\u0105\u0106\u0005D\u0000\u0000\u0106\u0107\u0005A\u0000\u0000\u0107"+
		"\u0108\u0005D\u0000\u0000\u0108\u0109\u0005E\u0000\u0000\u0109\u010a\u0005"+
		"I\u0000\u0000\u010a\u010b\u0005R\u0000\u0000\u010b\u010c\u0005O\u0000"+
		"\u0000\u010c0\u0001\u0000\u0000\u0000\u010d\u010e\u0005F\u0000\u0000\u010e"+
		"\u010f\u0005A\u0000\u0000\u010f\u0110\u0005L\u0000\u0000\u0110\u0111\u0005"+
		"S\u0000\u0000\u0111\u0112\u0005O\u0000\u0000\u01122\u0001\u0000\u0000"+
		"\u0000\u0113\u0127\u0007\u0000\u0000\u0000\u0114\u0116\u0007\u0001\u0000"+
		"\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0116\u0119\u0001\u0000\u0000"+
		"\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000"+
		"\u0000\u0118\u0128\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000"+
		"\u0000\u011a\u011c\u0007\u0001\u0000\u0000\u011b\u011a\u0001\u0000\u0000"+
		"\u0000\u011c\u011f\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u0120\u0001\u0000\u0000"+
		"\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u0120\u0124\u0005_\u0000\u0000"+
		"\u0121\u0123\u0007\u0001\u0000\u0000\u0122\u0121\u0001\u0000\u0000\u0000"+
		"\u0123\u0126\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000"+
		"\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0128\u0001\u0000\u0000\u0000"+
		"\u0126\u0124\u0001\u0000\u0000\u0000\u0127\u0117\u0001\u0000\u0000\u0000"+
		"\u0127\u011d\u0001\u0000\u0000\u0000\u01284\u0001\u0000\u0000\u0000\u0129"+
		"\u012a\u0005:\u0000\u0000\u012a6\u0001\u0000\u0000\u0000\u012b\u012c\u0005"+
		"(\u0000\u0000\u012c8\u0001\u0000\u0000\u0000\u012d\u012e\u0005)\u0000"+
		"\u0000\u012e:\u0001\u0000\u0000\u0000\u012f\u0130\u0005{\u0000\u0000\u0130"+
		"<\u0001\u0000\u0000\u0000\u0131\u0132\u0005}\u0000\u0000\u0132>\u0001"+
		"\u0000\u0000\u0000\u0133\u0137\u0005[\u0000\u0000\u0134\u0136\b\u0002"+
		"\u0000\u0000\u0135\u0134\u0001\u0000\u0000\u0000\u0136\u0139\u0001\u0000"+
		"\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000"+
		"\u0000\u0000\u0138\u013a\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000"+
		"\u0000\u0000\u013a\u013b\u0005]\u0000\u0000\u013b\u013c\u0006\u001f\u0000"+
		"\u0000\u013c@\u0001\u0000\u0000\u0000\u013d\u0141\u0005[\u0000\u0000\u013e"+
		"\u0140\b\u0003\u0000\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u0140\u0143"+
		"\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0142"+
		"\u0001\u0000\u0000\u0000\u0142B\u0001\u0000\u0000\u0000\u0143\u0141\u0001"+
		"\u0000\u0000\u0000\u0144\u0145\u0007\u0004\u0000\u0000\u0145D\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\u0007\u0005\u0000\u0000\u0147\u0148\u0006\"\u0001"+
		"\u0000\u0148F\u0001\u0000\u0000\u0000\n\u0000x~\u0080\u0117\u011d\u0124"+
		"\u0127\u0137\u0141\u0002\u0001\u001f\u0000\u0001\"\u0001";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
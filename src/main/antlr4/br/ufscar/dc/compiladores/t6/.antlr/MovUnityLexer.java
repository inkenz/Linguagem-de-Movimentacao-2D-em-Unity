// Generated from /home/julio/java/T6-Compiladores/src/main/antlr4/br/ufscar/dc/compiladores/t6/MovUnity.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MovUnityLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, GAMEOBJECT=2, TEMPLATE=3, SIDESCROLLING=4, TOPDOWN=5, GRAVIDADE=6, 
		ACELERACAO=7, DESACELERACAO=8, VELOCIDADE=9, CONTROLE=10, PULOIMPULSO=11, 
		CORRIDAVEL=12, ESQUIVAVEL=13, ESQUIVADUR=14, ESQUIVAESP=15, MODO=16, TECLADO=17, 
		MOUSE=18, BOTAO=19, PULOCONTROLE=20, DIAGONAL=21, CORRIDACON=22, ESQUIVACON=23, 
		WASD=24, CUSTOM=25, FLECHAS=26, CLIQUE=27, SEGUIR=28, DIREITO=29, ESQUERDO=30, 
		ESQUERDA=31, DIREITA=32, CIMA=33, BAIXO=34, LETRA=35, FLECHA=36, VERDADEIRO=37, 
		FALSO=38, TECLA=39, NUM=40, NOME=41, DOISPONTOS=42, ABREPAR=43, FECHAPAR=44, 
		ABRECHAVE=45, FECHACHAVE=46, COMENTARIO=47, COMENTARIO_NAO_FECHADO=48, 
		CHAVE_NAO_FECHADA=49, ERRO=50, NEGATIVO=51, IGNORE=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "GAMEOBJECT", "TEMPLATE", "SIDESCROLLING", "TOPDOWN", "GRAVIDADE", 
			"ACELERACAO", "DESACELERACAO", "VELOCIDADE", "CONTROLE", "PULOIMPULSO", 
			"CORRIDAVEL", "ESQUIVAVEL", "ESQUIVADUR", "ESQUIVAESP", "MODO", "TECLADO", 
			"MOUSE", "BOTAO", "PULOCONTROLE", "DIAGONAL", "CORRIDACON", "ESQUIVACON", 
			"WASD", "CUSTOM", "FLECHAS", "CLIQUE", "SEGUIR", "DIREITO", "ESQUERDO", 
			"ESQUERDA", "DIREITA", "CIMA", "BAIXO", "LETRA", "FLECHA", "VERDADEIRO", 
			"FALSO", "TECLA", "NUM", "NOME", "DOISPONTOS", "ABREPAR", "FECHAPAR", 
			"ABRECHAVE", "FECHACHAVE", "COMENTARIO", "COMENTARIO_NAO_FECHADO", "CHAVE_NAO_FECHADA", 
			"ERRO", "NEGATIVO", "IGNORE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'GameObject'", "'template'", "'SIDE-SCROLLING'", "'TOP-DOWN'", 
			"'gravidade'", "'aceleracao'", "'desaceleracao'", "'velocidade'", "'controle'", 
			"'puloImpulso'", "'corridaVelocidade'", "'esquivaVelocidade'", "'esquivaDuracao'", 
			"'esquivaEspera'", "'modo'", "'teclado'", "'mouse'", "'botao'", "'puloControle'", 
			"'diagonal'", "'corridaControle'", "'esquivaControle'", "'WASD'", "'CUSTOM'", 
			"'FLECHAS'", "'CLIQUE'", "'SEGUIR'", "'DIREITO'", "'ESQUERDO'", "'esquerda'", 
			"'direita'", "'cima'", "'baixo'", null, "'FLECHA'", "'VERDADEIRO'", "'FALSO'", 
			null, null, null, "':'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "GAMEOBJECT", "TEMPLATE", "SIDESCROLLING", "TOPDOWN", "GRAVIDADE", 
			"ACELERACAO", "DESACELERACAO", "VELOCIDADE", "CONTROLE", "PULOIMPULSO", 
			"CORRIDAVEL", "ESQUIVAVEL", "ESQUIVADUR", "ESQUIVAESP", "MODO", "TECLADO", 
			"MOUSE", "BOTAO", "PULOCONTROLE", "DIAGONAL", "CORRIDACON", "ESQUIVACON", 
			"WASD", "CUSTOM", "FLECHAS", "CLIQUE", "SEGUIR", "DIREITO", "ESQUERDO", 
			"ESQUERDA", "DIREITA", "CIMA", "BAIXO", "LETRA", "FLECHA", "VERDADEIRO", 
			"FALSO", "TECLA", "NUM", "NOME", "DOISPONTOS", "ABREPAR", "FECHAPAR", 
			"ABRECHAVE", "FECHACHAVE", "COMENTARIO", "COMENTARIO_NAO_FECHADO", "CHAVE_NAO_FECHADA", 
			"ERRO", "NEGATIVO", "IGNORE"
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
		case 46:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 51:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u025f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3%\3%\3%"+
		"\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0211\n(\3)\6)\u0214\n)\r)"+
		"\16)\u0215\3)\3)\6)\u021a\n)\r)\16)\u021b\5)\u021e\n)\3*\3*\7*\u0222\n"+
		"*\f*\16*\u0225\13*\3*\7*\u0228\n*\f*\16*\u022b\13*\3*\3*\7*\u022f\n*\f"+
		"*\16*\u0232\13*\5*\u0234\n*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\7"+
		"\60\u0242\n\60\f\60\16\60\u0245\13\60\3\60\3\60\3\60\3\61\3\61\7\61\u024c"+
		"\n\61\f\61\16\61\u024f\13\61\3\62\3\62\7\62\u0253\n\62\f\62\16\62\u0256"+
		"\13\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\2\2\66\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66\3\2\t\3\2C\\\4\2C\\c|\5"+
		"\2\62;C\\c|\6\2\13\f\17\17}}\177\177\6\2\13\f\17\17]]__\t\2##&&--BB__"+
		"~~\u0080\u0080\5\2\13\f\17\17\"\"\2\u0271\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2"+
		"\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2"+
		"\2g\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5m\3\2\2\2\7x\3\2\2\2\t\u0081\3\2\2"+
		"\2\13\u0090\3\2\2\2\r\u0099\3\2\2\2\17\u00a3\3\2\2\2\21\u00ae\3\2\2\2"+
		"\23\u00bc\3\2\2\2\25\u00c7\3\2\2\2\27\u00d0\3\2\2\2\31\u00dc\3\2\2\2\33"+
		"\u00ee\3\2\2\2\35\u0100\3\2\2\2\37\u010f\3\2\2\2!\u011d\3\2\2\2#\u0122"+
		"\3\2\2\2%\u012a\3\2\2\2\'\u0130\3\2\2\2)\u0136\3\2\2\2+\u0143\3\2\2\2"+
		"-\u014c\3\2\2\2/\u015c\3\2\2\2\61\u016c\3\2\2\2\63\u0171\3\2\2\2\65\u0178"+
		"\3\2\2\2\67\u0180\3\2\2\29\u0187\3\2\2\2;\u018e\3\2\2\2=\u0196\3\2\2\2"+
		"?\u019f\3\2\2\2A\u01a8\3\2\2\2C\u01b0\3\2\2\2E\u01b5\3\2\2\2G\u01bb\3"+
		"\2\2\2I\u01bd\3\2\2\2K\u01c4\3\2\2\2M\u01cf\3\2\2\2O\u0210\3\2\2\2Q\u0213"+
		"\3\2\2\2S\u021f\3\2\2\2U\u0235\3\2\2\2W\u0237\3\2\2\2Y\u0239\3\2\2\2["+
		"\u023b\3\2\2\2]\u023d\3\2\2\2_\u023f\3\2\2\2a\u0249\3\2\2\2c\u0250\3\2"+
		"\2\2e\u0257\3\2\2\2g\u0259\3\2\2\2i\u025c\3\2\2\2kl\7.\2\2l\4\3\2\2\2"+
		"mn\7I\2\2no\7c\2\2op\7o\2\2pq\7g\2\2qr\7Q\2\2rs\7d\2\2st\7l\2\2tu\7g\2"+
		"\2uv\7e\2\2vw\7v\2\2w\6\3\2\2\2xy\7v\2\2yz\7g\2\2z{\7o\2\2{|\7r\2\2|}"+
		"\7n\2\2}~\7c\2\2~\177\7v\2\2\177\u0080\7g\2\2\u0080\b\3\2\2\2\u0081\u0082"+
		"\7U\2\2\u0082\u0083\7K\2\2\u0083\u0084\7F\2\2\u0084\u0085\7G\2\2\u0085"+
		"\u0086\7/\2\2\u0086\u0087\7U\2\2\u0087\u0088\7E\2\2\u0088\u0089\7T\2\2"+
		"\u0089\u008a\7Q\2\2\u008a\u008b\7N\2\2\u008b\u008c\7N\2\2\u008c\u008d"+
		"\7K\2\2\u008d\u008e\7P\2\2\u008e\u008f\7I\2\2\u008f\n\3\2\2\2\u0090\u0091"+
		"\7V\2\2\u0091\u0092\7Q\2\2\u0092\u0093\7R\2\2\u0093\u0094\7/\2\2\u0094"+
		"\u0095\7F\2\2\u0095\u0096\7Q\2\2\u0096\u0097\7Y\2\2\u0097\u0098\7P\2\2"+
		"\u0098\f\3\2\2\2\u0099\u009a\7i\2\2\u009a\u009b\7t\2\2\u009b\u009c\7c"+
		"\2\2\u009c\u009d\7x\2\2\u009d\u009e\7k\2\2\u009e\u009f\7f\2\2\u009f\u00a0"+
		"\7c\2\2\u00a0\u00a1\7f\2\2\u00a1\u00a2\7g\2\2\u00a2\16\3\2\2\2\u00a3\u00a4"+
		"\7c\2\2\u00a4\u00a5\7e\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7n\2\2\u00a7"+
		"\u00a8\7g\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7e\2\2"+
		"\u00ab\u00ac\7c\2\2\u00ac\u00ad\7q\2\2\u00ad\20\3\2\2\2\u00ae\u00af\7"+
		"f\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3"+
		"\7e\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7g\2\2\u00b6"+
		"\u00b7\7t\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7e\2\2\u00b9\u00ba\7c\2\2"+
		"\u00ba\u00bb\7q\2\2\u00bb\22\3\2\2\2\u00bc\u00bd\7x\2\2\u00bd\u00be\7"+
		"g\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7e\2\2\u00c1\u00c2"+
		"\7k\2\2\u00c2\u00c3\7f\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7f\2\2\u00c5"+
		"\u00c6\7g\2\2\u00c6\24\3\2\2\2\u00c7\u00c8\7e\2\2\u00c8\u00c9\7q\2\2\u00c9"+
		"\u00ca\7p\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7q\2\2"+
		"\u00cd\u00ce\7n\2\2\u00ce\u00cf\7g\2\2\u00cf\26\3\2\2\2\u00d0\u00d1\7"+
		"r\2\2\u00d1\u00d2\7w\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5"+
		"\7K\2\2\u00d5\u00d6\7o\2\2\u00d6\u00d7\7r\2\2\u00d7\u00d8\7w\2\2\u00d8"+
		"\u00d9\7n\2\2\u00d9\u00da\7u\2\2\u00da\u00db\7q\2\2\u00db\30\3\2\2\2\u00dc"+
		"\u00dd\7e\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7t\2\2"+
		"\u00e0\u00e1\7k\2\2\u00e1\u00e2\7f\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4"+
		"\7X\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7\7q\2\2\u00e7"+
		"\u00e8\7e\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7f\2\2\u00ea\u00eb\7c\2\2"+
		"\u00eb\u00ec\7f\2\2\u00ec\u00ed\7g\2\2\u00ed\32\3\2\2\2\u00ee\u00ef\7"+
		"g\2\2\u00ef\u00f0\7u\2\2\u00f0\u00f1\7s\2\2\u00f1\u00f2\7w\2\2\u00f2\u00f3"+
		"\7k\2\2\u00f3\u00f4\7x\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7X\2\2\u00f6"+
		"\u00f7\7g\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa\7e\2\2"+
		"\u00fa\u00fb\7k\2\2\u00fb\u00fc\7f\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe"+
		"\7f\2\2\u00fe\u00ff\7g\2\2\u00ff\34\3\2\2\2\u0100\u0101\7g\2\2\u0101\u0102"+
		"\7u\2\2\u0102\u0103\7s\2\2\u0103\u0104\7w\2\2\u0104\u0105\7k\2\2\u0105"+
		"\u0106\7x\2\2\u0106\u0107\7c\2\2\u0107\u0108\7F\2\2\u0108\u0109\7w\2\2"+
		"\u0109\u010a\7t\2\2\u010a\u010b\7c\2\2\u010b\u010c\7e\2\2\u010c\u010d"+
		"\7c\2\2\u010d\u010e\7q\2\2\u010e\36\3\2\2\2\u010f\u0110\7g\2\2\u0110\u0111"+
		"\7u\2\2\u0111\u0112\7s\2\2\u0112\u0113\7w\2\2\u0113\u0114\7k\2\2\u0114"+
		"\u0115\7x\2\2\u0115\u0116\7c\2\2\u0116\u0117\7G\2\2\u0117\u0118\7u\2\2"+
		"\u0118\u0119\7r\2\2\u0119\u011a\7g\2\2\u011a\u011b\7t\2\2\u011b\u011c"+
		"\7c\2\2\u011c \3\2\2\2\u011d\u011e\7o\2\2\u011e\u011f\7q\2\2\u011f\u0120"+
		"\7f\2\2\u0120\u0121\7q\2\2\u0121\"\3\2\2\2\u0122\u0123\7v\2\2\u0123\u0124"+
		"\7g\2\2\u0124\u0125\7e\2\2\u0125\u0126\7n\2\2\u0126\u0127\7c\2\2\u0127"+
		"\u0128\7f\2\2\u0128\u0129\7q\2\2\u0129$\3\2\2\2\u012a\u012b\7o\2\2\u012b"+
		"\u012c\7q\2\2\u012c\u012d\7w\2\2\u012d\u012e\7u\2\2\u012e\u012f\7g\2\2"+
		"\u012f&\3\2\2\2\u0130\u0131\7d\2\2\u0131\u0132\7q\2\2\u0132\u0133\7v\2"+
		"\2\u0133\u0134\7c\2\2\u0134\u0135\7q\2\2\u0135(\3\2\2\2\u0136\u0137\7"+
		"r\2\2\u0137\u0138\7w\2\2\u0138\u0139\7n\2\2\u0139\u013a\7q\2\2\u013a\u013b"+
		"\7E\2\2\u013b\u013c\7q\2\2\u013c\u013d\7p\2\2\u013d\u013e\7v\2\2\u013e"+
		"\u013f\7t\2\2\u013f\u0140\7q\2\2\u0140\u0141\7n\2\2\u0141\u0142\7g\2\2"+
		"\u0142*\3\2\2\2\u0143\u0144\7f\2\2\u0144\u0145\7k\2\2\u0145\u0146\7c\2"+
		"\2\u0146\u0147\7i\2\2\u0147\u0148\7q\2\2\u0148\u0149\7p\2\2\u0149\u014a"+
		"\7c\2\2\u014a\u014b\7n\2\2\u014b,\3\2\2\2\u014c\u014d\7e\2\2\u014d\u014e"+
		"\7q\2\2\u014e\u014f\7t\2\2\u014f\u0150\7t\2\2\u0150\u0151\7k\2\2\u0151"+
		"\u0152\7f\2\2\u0152\u0153\7c\2\2\u0153\u0154\7E\2\2\u0154\u0155\7q\2\2"+
		"\u0155\u0156\7p\2\2\u0156\u0157\7v\2\2\u0157\u0158\7t\2\2\u0158\u0159"+
		"\7q\2\2\u0159\u015a\7n\2\2\u015a\u015b\7g\2\2\u015b.\3\2\2\2\u015c\u015d"+
		"\7g\2\2\u015d\u015e\7u\2\2\u015e\u015f\7s\2\2\u015f\u0160\7w\2\2\u0160"+
		"\u0161\7k\2\2\u0161\u0162\7x\2\2\u0162\u0163\7c\2\2\u0163\u0164\7E\2\2"+
		"\u0164\u0165\7q\2\2\u0165\u0166\7p\2\2\u0166\u0167\7v\2\2\u0167\u0168"+
		"\7t\2\2\u0168\u0169\7q\2\2\u0169\u016a\7n\2\2\u016a\u016b\7g\2\2\u016b"+
		"\60\3\2\2\2\u016c\u016d\7Y\2\2\u016d\u016e\7C\2\2\u016e\u016f\7U\2\2\u016f"+
		"\u0170\7F\2\2\u0170\62\3\2\2\2\u0171\u0172\7E\2\2\u0172\u0173\7W\2\2\u0173"+
		"\u0174\7U\2\2\u0174\u0175\7V\2\2\u0175\u0176\7Q\2\2\u0176\u0177\7O\2\2"+
		"\u0177\64\3\2\2\2\u0178\u0179\7H\2\2\u0179\u017a\7N\2\2\u017a\u017b\7"+
		"G\2\2\u017b\u017c\7E\2\2\u017c\u017d\7J\2\2\u017d\u017e\7C\2\2\u017e\u017f"+
		"\7U\2\2\u017f\66\3\2\2\2\u0180\u0181\7E\2\2\u0181\u0182\7N\2\2\u0182\u0183"+
		"\7K\2\2\u0183\u0184\7S\2\2\u0184\u0185\7W\2\2\u0185\u0186\7G\2\2\u0186"+
		"8\3\2\2\2\u0187\u0188\7U\2\2\u0188\u0189\7G\2\2\u0189\u018a\7I\2\2\u018a"+
		"\u018b\7W\2\2\u018b\u018c\7K\2\2\u018c\u018d\7T\2\2\u018d:\3\2\2\2\u018e"+
		"\u018f\7F\2\2\u018f\u0190\7K\2\2\u0190\u0191\7T\2\2\u0191\u0192\7G\2\2"+
		"\u0192\u0193\7K\2\2\u0193\u0194\7V\2\2\u0194\u0195\7Q\2\2\u0195<\3\2\2"+
		"\2\u0196\u0197\7G\2\2\u0197\u0198\7U\2\2\u0198\u0199\7S\2\2\u0199\u019a"+
		"\7W\2\2\u019a\u019b\7G\2\2\u019b\u019c\7T\2\2\u019c\u019d\7F\2\2\u019d"+
		"\u019e\7Q\2\2\u019e>\3\2\2\2\u019f\u01a0\7g\2\2\u01a0\u01a1\7u\2\2\u01a1"+
		"\u01a2\7s\2\2\u01a2\u01a3\7w\2\2\u01a3\u01a4\7g\2\2\u01a4\u01a5\7t\2\2"+
		"\u01a5\u01a6\7f\2\2\u01a6\u01a7\7c\2\2\u01a7@\3\2\2\2\u01a8\u01a9\7f\2"+
		"\2\u01a9\u01aa\7k\2\2\u01aa\u01ab\7t\2\2\u01ab\u01ac\7g\2\2\u01ac\u01ad"+
		"\7k\2\2\u01ad\u01ae\7v\2\2\u01ae\u01af\7c\2\2\u01afB\3\2\2\2\u01b0\u01b1"+
		"\7e\2\2\u01b1\u01b2\7k\2\2\u01b2\u01b3\7o\2\2\u01b3\u01b4\7c\2\2\u01b4"+
		"D\3\2\2\2\u01b5\u01b6\7d\2\2\u01b6\u01b7\7c\2\2\u01b7\u01b8\7k\2\2\u01b8"+
		"\u01b9\7z\2\2\u01b9\u01ba\7q\2\2\u01baF\3\2\2\2\u01bb\u01bc\t\2\2\2\u01bc"+
		"H\3\2\2\2\u01bd\u01be\7H\2\2\u01be\u01bf\7N\2\2\u01bf\u01c0\7G\2\2\u01c0"+
		"\u01c1\7E\2\2\u01c1\u01c2\7J\2\2\u01c2\u01c3\7C\2\2\u01c3J\3\2\2\2\u01c4"+
		"\u01c5\7X\2\2\u01c5\u01c6\7G\2\2\u01c6\u01c7\7T\2\2\u01c7\u01c8\7F\2\2"+
		"\u01c8\u01c9\7C\2\2\u01c9\u01ca\7F\2\2\u01ca\u01cb\7G\2\2\u01cb\u01cc"+
		"\7K\2\2\u01cc\u01cd\7T\2\2\u01cd\u01ce\7Q\2\2\u01ceL\3\2\2\2\u01cf\u01d0"+
		"\7H\2\2\u01d0\u01d1\7C\2\2\u01d1\u01d2\7N\2\2\u01d2\u01d3\7U\2\2\u01d3"+
		"\u01d4\7Q\2\2\u01d4N\3\2\2\2\u01d5\u01d6\7U\2\2\u01d6\u01d7\7J\2\2\u01d7"+
		"\u01d8\7K\2\2\u01d8\u01d9\7H\2\2\u01d9\u01da\7V\2\2\u01da\u01db\7G\2\2"+
		"\u01db\u01dc\7U\2\2\u01dc\u0211\7S\2\2\u01dd\u01de\7G\2\2\u01de\u01df"+
		"\7U\2\2\u01df\u01e0\7R\2\2\u01e0\u01e1\7C\2\2\u01e1\u01e2\7E\2\2\u01e2"+
		"\u0211\7Q\2\2\u01e3\u01e4\7V\2\2\u01e4\u01e5\7C\2\2\u01e5\u0211\7D\2\2"+
		"\u01e6\u01e7\7G\2\2\u01e7\u01e8\7P\2\2\u01e8\u01e9\7V\2\2\u01e9\u01ea"+
		"\7G\2\2\u01ea\u0211\7T\2\2\u01eb\u01ec\7E\2\2\u01ec\u01ed\7V\2\2\u01ed"+
		"\u01ee\7T\2\2\u01ee\u01ef\7N\2\2\u01ef\u01f0\7G\2\2\u01f0\u01f1\7U\2\2"+
		"\u01f1\u0211\7S\2\2\u01f2\u01f3\7C\2\2\u01f3\u01f4\7N\2\2\u01f4\u01f5"+
		"\7V\2\2\u01f5\u01f6\7G\2\2\u01f6\u01f7\7U\2\2\u01f7\u0211\7S\2\2\u01f8"+
		"\u01f9\7C\2\2\u01f9\u01fa\7N\2\2\u01fa\u01fb\7V\2\2\u01fb\u01fc\7F\2\2"+
		"\u01fc\u01fd\7K\2\2\u01fd\u0211\7T\2\2\u01fe\u01ff\7U\2\2\u01ff\u0200"+
		"\7J\2\2\u0200\u0201\7K\2\2\u0201\u0202\7H\2\2\u0202\u0203\7V\2\2\u0203"+
		"\u0204\7F\2\2\u0204\u0205\7K\2\2\u0205\u0211\7T\2\2\u0206\u0207\7E\2\2"+
		"\u0207\u0208\7V\2\2\u0208\u0209\7T\2\2\u0209\u020a\7N\2\2\u020a\u020b"+
		"\7F\2\2\u020b\u020c\7K\2\2\u020c\u0211\7T\2\2\u020d\u020e\7G\2\2\u020e"+
		"\u020f\7U\2\2\u020f\u0211\7E\2\2\u0210\u01d5\3\2\2\2\u0210\u01dd\3\2\2"+
		"\2\u0210\u01e3\3\2\2\2\u0210\u01e6\3\2\2\2\u0210\u01eb\3\2\2\2\u0210\u01f2"+
		"\3\2\2\2\u0210\u01f8\3\2\2\2\u0210\u01fe\3\2\2\2\u0210\u0206\3\2\2\2\u0210"+
		"\u020d\3\2\2\2\u0211P\3\2\2\2\u0212\u0214\4\62;\2\u0213\u0212\3\2\2\2"+
		"\u0214\u0215\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u021d"+
		"\3\2\2\2\u0217\u0219\7\60\2\2\u0218\u021a\4\62;\2\u0219\u0218\3\2\2\2"+
		"\u021a\u021b\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021e"+
		"\3\2\2\2\u021d\u0217\3\2\2\2\u021d\u021e\3\2\2\2\u021eR\3\2\2\2\u021f"+
		"\u0233\t\3\2\2\u0220\u0222\t\4\2\2\u0221\u0220\3\2\2\2\u0222\u0225\3\2"+
		"\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0234\3\2\2\2\u0225"+
		"\u0223\3\2\2\2\u0226\u0228\t\4\2\2\u0227\u0226\3\2\2\2\u0228\u022b\3\2"+
		"\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022c\3\2\2\2\u022b"+
		"\u0229\3\2\2\2\u022c\u0230\7a\2\2\u022d\u022f\t\4\2\2\u022e\u022d\3\2"+
		"\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231"+
		"\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0233\u0223\3\2\2\2\u0233\u0229\3\2"+
		"\2\2\u0234T\3\2\2\2\u0235\u0236\7<\2\2\u0236V\3\2\2\2\u0237\u0238\7*\2"+
		"\2\u0238X\3\2\2\2\u0239\u023a\7+\2\2\u023aZ\3\2\2\2\u023b\u023c\7}\2\2"+
		"\u023c\\\3\2\2\2\u023d\u023e\7\177\2\2\u023e^\3\2\2\2\u023f\u0243\7]\2"+
		"\2\u0240\u0242\n\5\2\2\u0241\u0240\3\2\2\2\u0242\u0245\3\2\2\2\u0243\u0241"+
		"\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0246\3\2\2\2\u0245\u0243\3\2\2\2\u0246"+
		"\u0247\7_\2\2\u0247\u0248\b\60\2\2\u0248`\3\2\2\2\u0249\u024d\7]\2\2\u024a"+
		"\u024c\n\6\2\2\u024b\u024a\3\2\2\2\u024c\u024f\3\2\2\2\u024d\u024b\3\2"+
		"\2\2\u024d\u024e\3\2\2\2\u024eb\3\2\2\2\u024f\u024d\3\2\2\2\u0250\u0254"+
		"\7}\2\2\u0251\u0253\n\6\2\2\u0252\u0251\3\2\2\2\u0253\u0256\3\2\2\2\u0254"+
		"\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255d\3\2\2\2\u0256\u0254\3\2\2\2"+
		"\u0257\u0258\t\7\2\2\u0258f\3\2\2\2\u0259\u025a\7/\2\2\u025a\u025b\5Q"+
		")\2\u025bh\3\2\2\2\u025c\u025d\t\b\2\2\u025d\u025e\b\65\3\2\u025ej\3\2"+
		"\2\2\16\2\u0210\u0215\u021b\u021d\u0223\u0229\u0230\u0233\u0243\u024d"+
		"\u0254\4\3\60\2\3\65\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
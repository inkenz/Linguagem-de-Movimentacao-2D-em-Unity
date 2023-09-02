// Generated from /home/julio/java/T6-Compiladores/src/main/antlr4/br/ufscar/dc/compiladores/t6/MovUnity.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MovUnityParser extends Parser {
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
	public static final int
		RULE_gameobject = 0, RULE_def_atributos = 1, RULE_controle = 2, RULE_teclado = 3, 
		RULE_attr_teclado = 4, RULE_options_teclado = 5, RULE_custom = 6, RULE_teclas_custom = 7, 
		RULE_mouse = 8, RULE_attr_mouse = 9, RULE_templates = 10, RULE_parcela_logica = 11, 
		RULE_modos_teclado = 12, RULE_modos_mouse = 13, RULE_botoes_mouse = 14, 
		RULE_botoes_teclado = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"gameobject", "def_atributos", "controle", "teclado", "attr_teclado", 
			"options_teclado", "custom", "teclas_custom", "mouse", "attr_mouse", 
			"templates", "parcela_logica", "modos_teclado", "modos_mouse", "botoes_mouse", 
			"botoes_teclado"
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

	@Override
	public String getGrammarFileName() { return "MovUnity.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MovUnityParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class GameobjectContext extends ParserRuleContext {
		public TerminalNode GAMEOBJECT() { return getToken(MovUnityParser.GAMEOBJECT, 0); }
		public TerminalNode ABREPAR() { return getToken(MovUnityParser.ABREPAR, 0); }
		public TemplatesContext templates() {
			return getRuleContext(TemplatesContext.class,0);
		}
		public TerminalNode FECHAPAR() { return getToken(MovUnityParser.FECHAPAR, 0); }
		public TerminalNode ABRECHAVE() { return getToken(MovUnityParser.ABRECHAVE, 0); }
		public Def_atributosContext def_atributos() {
			return getRuleContext(Def_atributosContext.class,0);
		}
		public TerminalNode FECHACHAVE() { return getToken(MovUnityParser.FECHACHAVE, 0); }
		public TerminalNode EOF() { return getToken(MovUnityParser.EOF, 0); }
		public TerminalNode NOME() { return getToken(MovUnityParser.NOME, 0); }
		public TerminalNode LETRA() { return getToken(MovUnityParser.LETRA, 0); }
		public GameobjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gameobject; }
	}

	public final GameobjectContext gameobject() throws RecognitionException {
		GameobjectContext _localctx = new GameobjectContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_gameobject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(GAMEOBJECT);
			setState(33);
			match(ABREPAR);
			setState(34);
			_la = _input.LA(1);
			if ( !(_la==LETRA || _la==NOME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(35);
			match(T__0);
			setState(36);
			templates();
			setState(37);
			match(FECHAPAR);
			setState(38);
			match(ABRECHAVE);
			setState(39);
			def_atributos();
			setState(40);
			match(FECHACHAVE);
			setState(41);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Def_atributosContext extends ParserRuleContext {
		public Token grav;
		public Token ac;
		public Token desac;
		public Token puloIm;
		public Token corrvel;
		public Token esqvel;
		public Token esqdur;
		public Token esqesp;
		public Token vel;
		public ControleContext controle() {
			return getRuleContext(ControleContext.class,0);
		}
		public TerminalNode VELOCIDADE() { return getToken(MovUnityParser.VELOCIDADE, 0); }
		public List<TerminalNode> DOISPONTOS() { return getTokens(MovUnityParser.DOISPONTOS); }
		public TerminalNode DOISPONTOS(int i) {
			return getToken(MovUnityParser.DOISPONTOS, i);
		}
		public List<TerminalNode> NUM() { return getTokens(MovUnityParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(MovUnityParser.NUM, i);
		}
		public List<TerminalNode> GRAVIDADE() { return getTokens(MovUnityParser.GRAVIDADE); }
		public TerminalNode GRAVIDADE(int i) {
			return getToken(MovUnityParser.GRAVIDADE, i);
		}
		public List<TerminalNode> ACELERACAO() { return getTokens(MovUnityParser.ACELERACAO); }
		public TerminalNode ACELERACAO(int i) {
			return getToken(MovUnityParser.ACELERACAO, i);
		}
		public List<TerminalNode> DESACELERACAO() { return getTokens(MovUnityParser.DESACELERACAO); }
		public TerminalNode DESACELERACAO(int i) {
			return getToken(MovUnityParser.DESACELERACAO, i);
		}
		public List<TerminalNode> PULOIMPULSO() { return getTokens(MovUnityParser.PULOIMPULSO); }
		public TerminalNode PULOIMPULSO(int i) {
			return getToken(MovUnityParser.PULOIMPULSO, i);
		}
		public List<TerminalNode> CORRIDAVEL() { return getTokens(MovUnityParser.CORRIDAVEL); }
		public TerminalNode CORRIDAVEL(int i) {
			return getToken(MovUnityParser.CORRIDAVEL, i);
		}
		public List<TerminalNode> ESQUIVAVEL() { return getTokens(MovUnityParser.ESQUIVAVEL); }
		public TerminalNode ESQUIVAVEL(int i) {
			return getToken(MovUnityParser.ESQUIVAVEL, i);
		}
		public List<TerminalNode> ESQUIVADUR() { return getTokens(MovUnityParser.ESQUIVADUR); }
		public TerminalNode ESQUIVADUR(int i) {
			return getToken(MovUnityParser.ESQUIVADUR, i);
		}
		public List<TerminalNode> ESQUIVAESP() { return getTokens(MovUnityParser.ESQUIVAESP); }
		public TerminalNode ESQUIVAESP(int i) {
			return getToken(MovUnityParser.ESQUIVAESP, i);
		}
		public Def_atributosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_atributos; }
	}

	public final Def_atributosContext def_atributos() throws RecognitionException {
		Def_atributosContext _localctx = new Def_atributosContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_def_atributos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GRAVIDADE) | (1L << ACELERACAO) | (1L << DESACELERACAO) | (1L << PULOIMPULSO) | (1L << CORRIDAVEL) | (1L << ESQUIVAVEL) | (1L << ESQUIVADUR) | (1L << ESQUIVAESP))) != 0)) {
				{
				setState(67);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GRAVIDADE:
					{
					{
					setState(43);
					match(GRAVIDADE);
					setState(44);
					match(DOISPONTOS);
					setState(45);
					((Def_atributosContext)_localctx).grav = match(NUM);
					}
					}
					break;
				case ACELERACAO:
					{
					{
					setState(46);
					match(ACELERACAO);
					setState(47);
					match(DOISPONTOS);
					setState(48);
					((Def_atributosContext)_localctx).ac = match(NUM);
					}
					}
					break;
				case DESACELERACAO:
					{
					{
					setState(49);
					match(DESACELERACAO);
					setState(50);
					match(DOISPONTOS);
					setState(51);
					((Def_atributosContext)_localctx).desac = match(NUM);
					}
					}
					break;
				case PULOIMPULSO:
					{
					{
					setState(52);
					match(PULOIMPULSO);
					setState(53);
					match(DOISPONTOS);
					setState(54);
					((Def_atributosContext)_localctx).puloIm = match(NUM);
					}
					}
					break;
				case CORRIDAVEL:
					{
					{
					setState(55);
					match(CORRIDAVEL);
					setState(56);
					match(DOISPONTOS);
					setState(57);
					((Def_atributosContext)_localctx).corrvel = match(NUM);
					}
					}
					break;
				case ESQUIVAVEL:
					{
					{
					setState(58);
					match(ESQUIVAVEL);
					setState(59);
					match(DOISPONTOS);
					setState(60);
					((Def_atributosContext)_localctx).esqvel = match(NUM);
					}
					}
					break;
				case ESQUIVADUR:
					{
					{
					setState(61);
					match(ESQUIVADUR);
					setState(62);
					match(DOISPONTOS);
					setState(63);
					((Def_atributosContext)_localctx).esqdur = match(NUM);
					}
					}
					break;
				case ESQUIVAESP:
					{
					{
					setState(64);
					match(ESQUIVAESP);
					setState(65);
					match(DOISPONTOS);
					setState(66);
					((Def_atributosContext)_localctx).esqesp = match(NUM);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(72);
			match(VELOCIDADE);
			setState(73);
			match(DOISPONTOS);
			setState(74);
			((Def_atributosContext)_localctx).vel = match(NUM);
			}
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GRAVIDADE) | (1L << ACELERACAO) | (1L << DESACELERACAO) | (1L << PULOIMPULSO) | (1L << CORRIDAVEL) | (1L << ESQUIVAVEL) | (1L << ESQUIVADUR) | (1L << ESQUIVAESP))) != 0)) {
				{
				setState(100);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GRAVIDADE:
					{
					{
					setState(76);
					match(GRAVIDADE);
					setState(77);
					match(DOISPONTOS);
					setState(78);
					((Def_atributosContext)_localctx).grav = match(NUM);
					}
					}
					break;
				case ACELERACAO:
					{
					{
					setState(79);
					match(ACELERACAO);
					setState(80);
					match(DOISPONTOS);
					setState(81);
					((Def_atributosContext)_localctx).ac = match(NUM);
					}
					}
					break;
				case DESACELERACAO:
					{
					{
					setState(82);
					match(DESACELERACAO);
					setState(83);
					match(DOISPONTOS);
					setState(84);
					((Def_atributosContext)_localctx).desac = match(NUM);
					}
					}
					break;
				case PULOIMPULSO:
					{
					{
					setState(85);
					match(PULOIMPULSO);
					setState(86);
					match(DOISPONTOS);
					setState(87);
					((Def_atributosContext)_localctx).puloIm = match(NUM);
					}
					}
					break;
				case CORRIDAVEL:
					{
					{
					setState(88);
					match(CORRIDAVEL);
					setState(89);
					match(DOISPONTOS);
					setState(90);
					((Def_atributosContext)_localctx).corrvel = match(NUM);
					}
					}
					break;
				case ESQUIVAVEL:
					{
					{
					setState(91);
					match(ESQUIVAVEL);
					setState(92);
					match(DOISPONTOS);
					setState(93);
					((Def_atributosContext)_localctx).esqvel = match(NUM);
					}
					}
					break;
				case ESQUIVADUR:
					{
					{
					setState(94);
					match(ESQUIVADUR);
					setState(95);
					match(DOISPONTOS);
					setState(96);
					((Def_atributosContext)_localctx).esqdur = match(NUM);
					}
					}
					break;
				case ESQUIVAESP:
					{
					{
					setState(97);
					match(ESQUIVAESP);
					setState(98);
					match(DOISPONTOS);
					setState(99);
					((Def_atributosContext)_localctx).esqesp = match(NUM);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			controle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ControleContext extends ParserRuleContext {
		public TerminalNode CONTROLE() { return getToken(MovUnityParser.CONTROLE, 0); }
		public TerminalNode DOISPONTOS() { return getToken(MovUnityParser.DOISPONTOS, 0); }
		public TecladoContext teclado() {
			return getRuleContext(TecladoContext.class,0);
		}
		public MouseContext mouse() {
			return getRuleContext(MouseContext.class,0);
		}
		public ControleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controle; }
	}

	public final ControleContext controle() throws RecognitionException {
		ControleContext _localctx = new ControleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_controle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(CONTROLE);
			setState(108);
			match(DOISPONTOS);
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TECLADO:
				{
				setState(109);
				teclado();
				}
				break;
			case MOUSE:
				{
				setState(110);
				mouse();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TecladoContext extends ParserRuleContext {
		public TerminalNode TECLADO() { return getToken(MovUnityParser.TECLADO, 0); }
		public TerminalNode ABRECHAVE() { return getToken(MovUnityParser.ABRECHAVE, 0); }
		public Attr_tecladoContext attr_teclado() {
			return getRuleContext(Attr_tecladoContext.class,0);
		}
		public TerminalNode FECHACHAVE() { return getToken(MovUnityParser.FECHACHAVE, 0); }
		public TecladoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_teclado; }
	}

	public final TecladoContext teclado() throws RecognitionException {
		TecladoContext _localctx = new TecladoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_teclado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(TECLADO);
			setState(114);
			match(ABRECHAVE);
			setState(115);
			attr_teclado();
			setState(116);
			match(FECHACHAVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attr_tecladoContext extends ParserRuleContext {
		public TerminalNode MODO() { return getToken(MovUnityParser.MODO, 0); }
		public TerminalNode DOISPONTOS() { return getToken(MovUnityParser.DOISPONTOS, 0); }
		public Modos_tecladoContext modos_teclado() {
			return getRuleContext(Modos_tecladoContext.class,0);
		}
		public Options_tecladoContext options_teclado() {
			return getRuleContext(Options_tecladoContext.class,0);
		}
		public Attr_tecladoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_teclado; }
	}

	public final Attr_tecladoContext attr_teclado() throws RecognitionException {
		Attr_tecladoContext _localctx = new Attr_tecladoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attr_teclado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(MODO);
			setState(119);
			match(DOISPONTOS);
			setState(120);
			modos_teclado();
			setState(121);
			options_teclado();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Options_tecladoContext extends ParserRuleContext {
		public Botoes_tecladoContext pulo;
		public Botoes_tecladoContext corrida;
		public Botoes_tecladoContext esquiva;
		public List<TerminalNode> PULOCONTROLE() { return getTokens(MovUnityParser.PULOCONTROLE); }
		public TerminalNode PULOCONTROLE(int i) {
			return getToken(MovUnityParser.PULOCONTROLE, i);
		}
		public List<TerminalNode> DOISPONTOS() { return getTokens(MovUnityParser.DOISPONTOS); }
		public TerminalNode DOISPONTOS(int i) {
			return getToken(MovUnityParser.DOISPONTOS, i);
		}
		public List<TerminalNode> DIAGONAL() { return getTokens(MovUnityParser.DIAGONAL); }
		public TerminalNode DIAGONAL(int i) {
			return getToken(MovUnityParser.DIAGONAL, i);
		}
		public List<Parcela_logicaContext> parcela_logica() {
			return getRuleContexts(Parcela_logicaContext.class);
		}
		public Parcela_logicaContext parcela_logica(int i) {
			return getRuleContext(Parcela_logicaContext.class,i);
		}
		public List<TerminalNode> CORRIDACON() { return getTokens(MovUnityParser.CORRIDACON); }
		public TerminalNode CORRIDACON(int i) {
			return getToken(MovUnityParser.CORRIDACON, i);
		}
		public List<TerminalNode> ESQUIVACON() { return getTokens(MovUnityParser.ESQUIVACON); }
		public TerminalNode ESQUIVACON(int i) {
			return getToken(MovUnityParser.ESQUIVACON, i);
		}
		public List<Botoes_tecladoContext> botoes_teclado() {
			return getRuleContexts(Botoes_tecladoContext.class);
		}
		public Botoes_tecladoContext botoes_teclado(int i) {
			return getRuleContext(Botoes_tecladoContext.class,i);
		}
		public Options_tecladoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_options_teclado; }
	}

	public final Options_tecladoContext options_teclado() throws RecognitionException {
		Options_tecladoContext _localctx = new Options_tecladoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_options_teclado);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PULOCONTROLE) | (1L << DIAGONAL) | (1L << CORRIDACON) | (1L << ESQUIVACON))) != 0)) {
				{
				setState(135);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PULOCONTROLE:
					{
					{
					setState(123);
					match(PULOCONTROLE);
					setState(124);
					match(DOISPONTOS);
					setState(125);
					((Options_tecladoContext)_localctx).pulo = botoes_teclado();
					}
					}
					break;
				case DIAGONAL:
					{
					{
					setState(126);
					match(DIAGONAL);
					setState(127);
					match(DOISPONTOS);
					setState(128);
					parcela_logica();
					}
					}
					break;
				case CORRIDACON:
					{
					{
					setState(129);
					match(CORRIDACON);
					setState(130);
					match(DOISPONTOS);
					setState(131);
					((Options_tecladoContext)_localctx).corrida = botoes_teclado();
					}
					}
					break;
				case ESQUIVACON:
					{
					{
					setState(132);
					match(ESQUIVACON);
					setState(133);
					match(DOISPONTOS);
					setState(134);
					((Options_tecladoContext)_localctx).esquiva = botoes_teclado();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CustomContext extends ParserRuleContext {
		public TerminalNode CUSTOM() { return getToken(MovUnityParser.CUSTOM, 0); }
		public TerminalNode ABRECHAVE() { return getToken(MovUnityParser.ABRECHAVE, 0); }
		public Teclas_customContext teclas_custom() {
			return getRuleContext(Teclas_customContext.class,0);
		}
		public TerminalNode FECHACHAVE() { return getToken(MovUnityParser.FECHACHAVE, 0); }
		public CustomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_custom; }
	}

	public final CustomContext custom() throws RecognitionException {
		CustomContext _localctx = new CustomContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_custom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(CUSTOM);
			setState(141);
			match(ABRECHAVE);
			setState(142);
			teclas_custom();
			setState(143);
			match(FECHACHAVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Teclas_customContext extends ParserRuleContext {
		public Token esquerda;
		public Token direita;
		public Token cima;
		public Token baixo;
		public TerminalNode ESQUERDA() { return getToken(MovUnityParser.ESQUERDA, 0); }
		public List<TerminalNode> DOISPONTOS() { return getTokens(MovUnityParser.DOISPONTOS); }
		public TerminalNode DOISPONTOS(int i) {
			return getToken(MovUnityParser.DOISPONTOS, i);
		}
		public TerminalNode DIREITA() { return getToken(MovUnityParser.DIREITA, 0); }
		public List<TerminalNode> LETRA() { return getTokens(MovUnityParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(MovUnityParser.LETRA, i);
		}
		public TerminalNode CIMA() { return getToken(MovUnityParser.CIMA, 0); }
		public TerminalNode BAIXO() { return getToken(MovUnityParser.BAIXO, 0); }
		public Teclas_customContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_teclas_custom; }
	}

	public final Teclas_customContext teclas_custom() throws RecognitionException {
		Teclas_customContext _localctx = new Teclas_customContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_teclas_custom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(ESQUERDA);
			setState(146);
			match(DOISPONTOS);
			setState(147);
			((Teclas_customContext)_localctx).esquerda = match(LETRA);
			setState(148);
			match(DIREITA);
			setState(149);
			match(DOISPONTOS);
			setState(150);
			((Teclas_customContext)_localctx).direita = match(LETRA);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CIMA) {
				{
				setState(151);
				match(CIMA);
				setState(152);
				match(DOISPONTOS);
				setState(153);
				((Teclas_customContext)_localctx).cima = match(LETRA);
				setState(154);
				match(BAIXO);
				setState(155);
				match(DOISPONTOS);
				setState(156);
				((Teclas_customContext)_localctx).baixo = match(LETRA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MouseContext extends ParserRuleContext {
		public TerminalNode MOUSE() { return getToken(MovUnityParser.MOUSE, 0); }
		public TerminalNode ABRECHAVE() { return getToken(MovUnityParser.ABRECHAVE, 0); }
		public Attr_mouseContext attr_mouse() {
			return getRuleContext(Attr_mouseContext.class,0);
		}
		public TerminalNode FECHACHAVE() { return getToken(MovUnityParser.FECHACHAVE, 0); }
		public MouseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mouse; }
	}

	public final MouseContext mouse() throws RecognitionException {
		MouseContext _localctx = new MouseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mouse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(MOUSE);
			setState(160);
			match(ABRECHAVE);
			setState(161);
			attr_mouse();
			setState(162);
			match(FECHACHAVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attr_mouseContext extends ParserRuleContext {
		public TerminalNode MODO() { return getToken(MovUnityParser.MODO, 0); }
		public List<TerminalNode> DOISPONTOS() { return getTokens(MovUnityParser.DOISPONTOS); }
		public TerminalNode DOISPONTOS(int i) {
			return getToken(MovUnityParser.DOISPONTOS, i);
		}
		public Modos_mouseContext modos_mouse() {
			return getRuleContext(Modos_mouseContext.class,0);
		}
		public TerminalNode BOTAO() { return getToken(MovUnityParser.BOTAO, 0); }
		public Botoes_mouseContext botoes_mouse() {
			return getRuleContext(Botoes_mouseContext.class,0);
		}
		public Attr_mouseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_mouse; }
	}

	public final Attr_mouseContext attr_mouse() throws RecognitionException {
		Attr_mouseContext _localctx = new Attr_mouseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attr_mouse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(MODO);
			setState(165);
			match(DOISPONTOS);
			setState(166);
			modos_mouse();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOTAO) {
				{
				setState(167);
				match(BOTAO);
				setState(168);
				match(DOISPONTOS);
				setState(169);
				botoes_mouse();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplatesContext extends ParserRuleContext {
		public TerminalNode SIDESCROLLING() { return getToken(MovUnityParser.SIDESCROLLING, 0); }
		public TerminalNode TOPDOWN() { return getToken(MovUnityParser.TOPDOWN, 0); }
		public TemplatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templates; }
	}

	public final TemplatesContext templates() throws RecognitionException {
		TemplatesContext _localctx = new TemplatesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_templates);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_la = _input.LA(1);
			if ( !(_la==SIDESCROLLING || _la==TOPDOWN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parcela_logicaContext extends ParserRuleContext {
		public TerminalNode VERDADEIRO() { return getToken(MovUnityParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(MovUnityParser.FALSO, 0); }
		public Parcela_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_logica; }
	}

	public final Parcela_logicaContext parcela_logica() throws RecognitionException {
		Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parcela_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !(_la==VERDADEIRO || _la==FALSO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Modos_tecladoContext extends ParserRuleContext {
		public TerminalNode WASD() { return getToken(MovUnityParser.WASD, 0); }
		public TerminalNode FLECHAS() { return getToken(MovUnityParser.FLECHAS, 0); }
		public CustomContext custom() {
			return getRuleContext(CustomContext.class,0);
		}
		public Modos_tecladoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modos_teclado; }
	}

	public final Modos_tecladoContext modos_teclado() throws RecognitionException {
		Modos_tecladoContext _localctx = new Modos_tecladoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_modos_teclado);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WASD:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(WASD);
				}
				break;
			case FLECHAS:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(FLECHAS);
				}
				break;
			case CUSTOM:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				custom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Modos_mouseContext extends ParserRuleContext {
		public TerminalNode CLIQUE() { return getToken(MovUnityParser.CLIQUE, 0); }
		public TerminalNode SEGUIR() { return getToken(MovUnityParser.SEGUIR, 0); }
		public Modos_mouseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modos_mouse; }
	}

	public final Modos_mouseContext modos_mouse() throws RecognitionException {
		Modos_mouseContext _localctx = new Modos_mouseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_modos_mouse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_la = _input.LA(1);
			if ( !(_la==CLIQUE || _la==SEGUIR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Botoes_mouseContext extends ParserRuleContext {
		public TerminalNode DIREITO() { return getToken(MovUnityParser.DIREITO, 0); }
		public TerminalNode ESQUERDO() { return getToken(MovUnityParser.ESQUERDO, 0); }
		public Botoes_mouseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_botoes_mouse; }
	}

	public final Botoes_mouseContext botoes_mouse() throws RecognitionException {
		Botoes_mouseContext _localctx = new Botoes_mouseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_botoes_mouse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_la = _input.LA(1);
			if ( !(_la==DIREITO || _la==ESQUERDO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Botoes_tecladoContext extends ParserRuleContext {
		public TerminalNode LETRA() { return getToken(MovUnityParser.LETRA, 0); }
		public TerminalNode TECLA() { return getToken(MovUnityParser.TECLA, 0); }
		public Botoes_tecladoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_botoes_teclado; }
	}

	public final Botoes_tecladoContext botoes_teclado() throws RecognitionException {
		Botoes_tecladoContext _localctx = new Botoes_tecladoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_botoes_teclado);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_la = _input.LA(1);
			if ( !(_la==LETRA || _la==TECLA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u00be\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3F\n"+
		"\3\f\3\16\3I\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3g\n\3"+
		"\f\3\16\3j\13\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4r\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7"+
		"\u008a\n\7\f\7\16\7\u008d\13\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a0\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u00ad\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\5\16\u00b6\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \2\b\4\2%%++\3\2\6\7\3\2\'(\3\2\35\36\3\2"+
		"\37 \4\2%%))\2\u00c6\2\"\3\2\2\2\4G\3\2\2\2\6m\3\2\2\2\bs\3\2\2\2\nx\3"+
		"\2\2\2\f\u008b\3\2\2\2\16\u008e\3\2\2\2\20\u0093\3\2\2\2\22\u00a1\3\2"+
		"\2\2\24\u00a6\3\2\2\2\26\u00ae\3\2\2\2\30\u00b0\3\2\2\2\32\u00b5\3\2\2"+
		"\2\34\u00b7\3\2\2\2\36\u00b9\3\2\2\2 \u00bb\3\2\2\2\"#\7\4\2\2#$\7-\2"+
		"\2$%\t\2\2\2%&\7\3\2\2&\'\5\26\f\2\'(\7.\2\2()\7/\2\2)*\5\4\3\2*+\7\60"+
		"\2\2+,\7\2\2\3,\3\3\2\2\2-.\7\b\2\2./\7,\2\2/F\7*\2\2\60\61\7\t\2\2\61"+
		"\62\7,\2\2\62F\7*\2\2\63\64\7\n\2\2\64\65\7,\2\2\65F\7*\2\2\66\67\7\r"+
		"\2\2\678\7,\2\28F\7*\2\29:\7\16\2\2:;\7,\2\2;F\7*\2\2<=\7\17\2\2=>\7,"+
		"\2\2>F\7*\2\2?@\7\20\2\2@A\7,\2\2AF\7*\2\2BC\7\21\2\2CD\7,\2\2DF\7*\2"+
		"\2E-\3\2\2\2E\60\3\2\2\2E\63\3\2\2\2E\66\3\2\2\2E9\3\2\2\2E<\3\2\2\2E"+
		"?\3\2\2\2EB\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2"+
		"JK\7\13\2\2KL\7,\2\2LM\7*\2\2Mh\3\2\2\2NO\7\b\2\2OP\7,\2\2Pg\7*\2\2QR"+
		"\7\t\2\2RS\7,\2\2Sg\7*\2\2TU\7\n\2\2UV\7,\2\2Vg\7*\2\2WX\7\r\2\2XY\7,"+
		"\2\2Yg\7*\2\2Z[\7\16\2\2[\\\7,\2\2\\g\7*\2\2]^\7\17\2\2^_\7,\2\2_g\7*"+
		"\2\2`a\7\20\2\2ab\7,\2\2bg\7*\2\2cd\7\21\2\2de\7,\2\2eg\7*\2\2fN\3\2\2"+
		"\2fQ\3\2\2\2fT\3\2\2\2fW\3\2\2\2fZ\3\2\2\2f]\3\2\2\2f`\3\2\2\2fc\3\2\2"+
		"\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\5\6\4\2l\5\3\2"+
		"\2\2mn\7\f\2\2nq\7,\2\2or\5\b\5\2pr\5\22\n\2qo\3\2\2\2qp\3\2\2\2r\7\3"+
		"\2\2\2st\7\23\2\2tu\7/\2\2uv\5\n\6\2vw\7\60\2\2w\t\3\2\2\2xy\7\22\2\2"+
		"yz\7,\2\2z{\5\32\16\2{|\5\f\7\2|\13\3\2\2\2}~\7\26\2\2~\177\7,\2\2\177"+
		"\u008a\5 \21\2\u0080\u0081\7\27\2\2\u0081\u0082\7,\2\2\u0082\u008a\5\30"+
		"\r\2\u0083\u0084\7\30\2\2\u0084\u0085\7,\2\2\u0085\u008a\5 \21\2\u0086"+
		"\u0087\7\31\2\2\u0087\u0088\7,\2\2\u0088\u008a\5 \21\2\u0089}\3\2\2\2"+
		"\u0089\u0080\3\2\2\2\u0089\u0083\3\2\2\2\u0089\u0086\3\2\2\2\u008a\u008d"+
		"\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\r\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\u008f\7\33\2\2\u008f\u0090\7/\2\2\u0090\u0091\5\20"+
		"\t\2\u0091\u0092\7\60\2\2\u0092\17\3\2\2\2\u0093\u0094\7!\2\2\u0094\u0095"+
		"\7,\2\2\u0095\u0096\7%\2\2\u0096\u0097\7\"\2\2\u0097\u0098\7,\2\2\u0098"+
		"\u009f\7%\2\2\u0099\u009a\7#\2\2\u009a\u009b\7,\2\2\u009b\u009c\7%\2\2"+
		"\u009c\u009d\7$\2\2\u009d\u009e\7,\2\2\u009e\u00a0\7%\2\2\u009f\u0099"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\21\3\2\2\2\u00a1\u00a2\7\24\2\2\u00a2"+
		"\u00a3\7/\2\2\u00a3\u00a4\5\24\13\2\u00a4\u00a5\7\60\2\2\u00a5\23\3\2"+
		"\2\2\u00a6\u00a7\7\22\2\2\u00a7\u00a8\7,\2\2\u00a8\u00ac\5\34\17\2\u00a9"+
		"\u00aa\7\25\2\2\u00aa\u00ab\7,\2\2\u00ab\u00ad\5\36\20\2\u00ac\u00a9\3"+
		"\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\25\3\2\2\2\u00ae\u00af\t\3\2\2\u00af"+
		"\27\3\2\2\2\u00b0\u00b1\t\4\2\2\u00b1\31\3\2\2\2\u00b2\u00b6\7\32\2\2"+
		"\u00b3\u00b6\7\34\2\2\u00b4\u00b6\5\16\b\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\33\3\2\2\2\u00b7\u00b8\t\5\2\2\u00b8"+
		"\35\3\2\2\2\u00b9\u00ba\t\6\2\2\u00ba\37\3\2\2\2\u00bb\u00bc\t\7\2\2\u00bc"+
		"!\3\2\2\2\fEGfhq\u0089\u008b\u009f\u00ac\u00b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
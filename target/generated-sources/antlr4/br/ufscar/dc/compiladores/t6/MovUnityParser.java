// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.t6;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MovUnityParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

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
		RULE_attr_teclado = 4, RULE_mouse = 5, RULE_attr_mouse = 6, RULE_templates = 7, 
		RULE_parcela_logica = 8, RULE_modos_teclado = 9, RULE_modos_mouse = 10, 
		RULE_botoes_mouse = 11, RULE_botoes_teclado = 12, RULE_custom = 13, RULE_teclas_custom = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"gameobject", "def_atributos", "controle", "teclado", "attr_teclado", 
			"mouse", "attr_mouse", "templates", "parcela_logica", "modos_teclado", 
			"modos_mouse", "botoes_mouse", "botoes_teclado", "custom", "teclas_custom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'GameObject'", "'template'", "'SIDE-SCROLLING'", "'TOP-DOWN'", 
			"'gravidade'", "'aceleracao'", "'desaceleracao'", "'velocidade'", "'controle'", 
			"'puloImpulso'", "'corridaVelocidade'", "'esquivaVelocidade'", "'esquivaDuracao'", 
			"'esquivaEspera'", "'modo'", "'teclado'", "'mouse'", "'botao'", "'puloControle'", 
			"'diagonal'", "'corridaControle'", "'esquivaControle'", "'WASD'", "'custom'", 
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
	public String getGrammarFileName() { return "java-escape"; }

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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).enterGameobject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).exitGameobject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MovUnityVisitor ) return ((MovUnityVisitor<? extends T>)visitor).visitGameobject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GameobjectContext gameobject() throws RecognitionException {
		GameobjectContext _localctx = new GameobjectContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_gameobject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(GAMEOBJECT);
			setState(31);
			match(ABREPAR);
			setState(32);
			_la = _input.LA(1);
			if ( !(_la==LETRA || _la==NOME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(33);
			match(T__0);
			setState(34);
			templates();
			setState(35);
			match(FECHAPAR);
			setState(36);
			match(ABRECHAVE);
			setState(37);
			def_atributos();
			setState(38);
			match(FECHACHAVE);
			setState(39);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).enterDef_atributos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).exitDef_atributos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MovUnityVisitor ) return ((MovUnityVisitor<? extends T>)visitor).visitDef_atributos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_atributosContext def_atributos() throws RecognitionException {
		Def_atributosContext _localctx = new Def_atributosContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_def_atributos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 63936L) != 0) {
				{
				setState(65);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GRAVIDADE:
					{
					{
					setState(41);
					match(GRAVIDADE);
					setState(42);
					match(DOISPONTOS);
					setState(43);
					((Def_atributosContext)_localctx).grav = match(NUM);
					}
					}
					break;
				case ACELERACAO:
					{
					{
					setState(44);
					match(ACELERACAO);
					setState(45);
					match(DOISPONTOS);
					setState(46);
					((Def_atributosContext)_localctx).ac = match(NUM);
					}
					}
					break;
				case DESACELERACAO:
					{
					{
					setState(47);
					match(DESACELERACAO);
					setState(48);
					match(DOISPONTOS);
					setState(49);
					((Def_atributosContext)_localctx).desac = match(NUM);
					}
					}
					break;
				case PULOIMPULSO:
					{
					{
					setState(50);
					match(PULOIMPULSO);
					setState(51);
					match(DOISPONTOS);
					setState(52);
					((Def_atributosContext)_localctx).puloIm = match(NUM);
					}
					}
					break;
				case CORRIDAVEL:
					{
					{
					setState(53);
					match(CORRIDAVEL);
					setState(54);
					match(DOISPONTOS);
					setState(55);
					((Def_atributosContext)_localctx).corrvel = match(NUM);
					}
					}
					break;
				case ESQUIVAVEL:
					{
					{
					setState(56);
					match(ESQUIVAVEL);
					setState(57);
					match(DOISPONTOS);
					setState(58);
					((Def_atributosContext)_localctx).esqvel = match(NUM);
					}
					}
					break;
				case ESQUIVADUR:
					{
					{
					setState(59);
					match(ESQUIVADUR);
					setState(60);
					match(DOISPONTOS);
					setState(61);
					((Def_atributosContext)_localctx).esqdur = match(NUM);
					}
					}
					break;
				case ESQUIVAESP:
					{
					{
					setState(62);
					match(ESQUIVAESP);
					setState(63);
					match(DOISPONTOS);
					setState(64);
					((Def_atributosContext)_localctx).esqesp = match(NUM);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(70);
			match(VELOCIDADE);
			setState(71);
			match(DOISPONTOS);
			setState(72);
			((Def_atributosContext)_localctx).vel = match(NUM);
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 63936L) != 0) {
				{
				setState(98);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GRAVIDADE:
					{
					{
					setState(74);
					match(GRAVIDADE);
					setState(75);
					match(DOISPONTOS);
					setState(76);
					((Def_atributosContext)_localctx).grav = match(NUM);
					}
					}
					break;
				case ACELERACAO:
					{
					{
					setState(77);
					match(ACELERACAO);
					setState(78);
					match(DOISPONTOS);
					setState(79);
					((Def_atributosContext)_localctx).ac = match(NUM);
					}
					}
					break;
				case DESACELERACAO:
					{
					{
					setState(80);
					match(DESACELERACAO);
					setState(81);
					match(DOISPONTOS);
					setState(82);
					((Def_atributosContext)_localctx).desac = match(NUM);
					}
					}
					break;
				case PULOIMPULSO:
					{
					{
					setState(83);
					match(PULOIMPULSO);
					setState(84);
					match(DOISPONTOS);
					setState(85);
					((Def_atributosContext)_localctx).puloIm = match(NUM);
					}
					}
					break;
				case CORRIDAVEL:
					{
					{
					setState(86);
					match(CORRIDAVEL);
					setState(87);
					match(DOISPONTOS);
					setState(88);
					((Def_atributosContext)_localctx).corrvel = match(NUM);
					}
					}
					break;
				case ESQUIVAVEL:
					{
					{
					setState(89);
					match(ESQUIVAVEL);
					setState(90);
					match(DOISPONTOS);
					setState(91);
					((Def_atributosContext)_localctx).esqvel = match(NUM);
					}
					}
					break;
				case ESQUIVADUR:
					{
					{
					setState(92);
					match(ESQUIVADUR);
					setState(93);
					match(DOISPONTOS);
					setState(94);
					((Def_atributosContext)_localctx).esqdur = match(NUM);
					}
					}
					break;
				case ESQUIVAESP:
					{
					{
					setState(95);
					match(ESQUIVAESP);
					setState(96);
					match(DOISPONTOS);
					setState(97);
					((Def_atributosContext)_localctx).esqesp = match(NUM);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).enterControle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).exitControle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MovUnityVisitor ) return ((MovUnityVisitor<? extends T>)visitor).visitControle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControleContext controle() throws RecognitionException {
		ControleContext _localctx = new ControleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_controle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(CONTROLE);
			setState(106);
			match(DOISPONTOS);
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TECLADO:
				{
				setState(107);
				teclado();
				}
				break;
			case MOUSE:
				{
				setState(108);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).enterTeclado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).exitTeclado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MovUnityVisitor ) return ((MovUnityVisitor<? extends T>)visitor).visitTeclado(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TecladoContext teclado() throws RecognitionException {
		TecladoContext _localctx = new TecladoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_teclado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(TECLADO);
			setState(112);
			match(ABRECHAVE);
			setState(113);
			attr_teclado();
			setState(114);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Attr_tecladoContext extends ParserRuleContext {
		public Botoes_tecladoContext pulo;
		public Botoes_tecladoContext corrida;
		public Botoes_tecladoContext esquiva;
		public TerminalNode MODO() { return getToken(MovUnityParser.MODO, 0); }
		public List<TerminalNode> DOISPONTOS() { return getTokens(MovUnityParser.DOISPONTOS); }
		public TerminalNode DOISPONTOS(int i) {
			return getToken(MovUnityParser.DOISPONTOS, i);
		}
		public Modos_tecladoContext modos_teclado() {
			return getRuleContext(Modos_tecladoContext.class,0);
		}
		public List<TerminalNode> PULOCONTROLE() { return getTokens(MovUnityParser.PULOCONTROLE); }
		public TerminalNode PULOCONTROLE(int i) {
			return getToken(MovUnityParser.PULOCONTROLE, i);
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
		public Attr_tecladoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_teclado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).enterAttr_teclado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).exitAttr_teclado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MovUnityVisitor ) return ((MovUnityVisitor<? extends T>)visitor).visitAttr_teclado(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attr_tecladoContext attr_teclado() throws RecognitionException {
		Attr_tecladoContext _localctx = new Attr_tecladoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attr_teclado);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(MODO);
			setState(117);
			match(DOISPONTOS);
			setState(118);
			modos_teclado();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 15728640L) != 0) {
				{
				setState(131);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PULOCONTROLE:
					{
					{
					setState(119);
					match(PULOCONTROLE);
					setState(120);
					match(DOISPONTOS);
					setState(121);
					((Attr_tecladoContext)_localctx).pulo = botoes_teclado();
					}
					}
					break;
				case DIAGONAL:
					{
					{
					setState(122);
					match(DIAGONAL);
					setState(123);
					match(DOISPONTOS);
					setState(124);
					parcela_logica();
					}
					}
					break;
				case CORRIDACON:
					{
					{
					setState(125);
					match(CORRIDACON);
					setState(126);
					match(DOISPONTOS);
					setState(127);
					((Attr_tecladoContext)_localctx).corrida = botoes_teclado();
					}
					}
					break;
				case ESQUIVACON:
					{
					{
					setState(128);
					match(ESQUIVACON);
					setState(129);
					match(DOISPONTOS);
					setState(130);
					((Attr_tecladoContext)_localctx).esquiva = botoes_teclado();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(135);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).enterMouse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).exitMouse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MovUnityVisitor ) return ((MovUnityVisitor<? extends T>)visitor).visitMouse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MouseContext mouse() throws RecognitionException {
		MouseContext _localctx = new MouseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mouse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(MOUSE);
			setState(137);
			match(ABRECHAVE);
			setState(138);
			attr_mouse();
			setState(139);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).enterAttr_mouse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).exitAttr_mouse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MovUnityVisitor ) return ((MovUnityVisitor<? extends T>)visitor).visitAttr_mouse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attr_mouseContext attr_mouse() throws RecognitionException {
		Attr_mouseContext _localctx = new Attr_mouseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attr_mouse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(MODO);
			setState(142);
			match(DOISPONTOS);
			setState(143);
			modos_mouse();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOTAO) {
				{
				setState(144);
				match(BOTAO);
				setState(145);
				match(DOISPONTOS);
				setState(146);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TemplatesContext extends ParserRuleContext {
		public TerminalNode SIDESCROLLING() { return getToken(MovUnityParser.SIDESCROLLING, 0); }
		public TerminalNode TOPDOWN() { return getToken(MovUnityParser.TOPDOWN, 0); }
		public TemplatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).enterTemplates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).exitTemplates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MovUnityVisitor ) return ((MovUnityVisitor<? extends T>)visitor).visitTemplates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplatesContext templates() throws RecognitionException {
		TemplatesContext _localctx = new TemplatesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_templates);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Parcela_logicaContext extends ParserRuleContext {
		public TerminalNode VERDADEIRO() { return getToken(MovUnityParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(MovUnityParser.FALSO, 0); }
		public Parcela_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).enterParcela_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).exitParcela_logica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MovUnityVisitor ) return ((MovUnityVisitor<? extends T>)visitor).visitParcela_logica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_logicaContext parcela_logica() throws RecognitionException {
		Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parcela_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).enterModos_teclado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).exitModos_teclado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MovUnityVisitor ) return ((MovUnityVisitor<? extends T>)visitor).visitModos_teclado(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Modos_tecladoContext modos_teclado() throws RecognitionException {
		Modos_tecladoContext _localctx = new Modos_tecladoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_modos_teclado);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WASD:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(WASD);
				}
				break;
			case FLECHAS:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(FLECHAS);
				}
				break;
			case CUSTOM:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Modos_mouseContext extends ParserRuleContext {
		public TerminalNode CLIQUE() { return getToken(MovUnityParser.CLIQUE, 0); }
		public TerminalNode SEGUIR() { return getToken(MovUnityParser.SEGUIR, 0); }
		public Modos_mouseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modos_mouse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).enterModos_mouse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).exitModos_mouse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MovUnityVisitor ) return ((MovUnityVisitor<? extends T>)visitor).visitModos_mouse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Modos_mouseContext modos_mouse() throws RecognitionException {
		Modos_mouseContext _localctx = new Modos_mouseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_modos_mouse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Botoes_mouseContext extends ParserRuleContext {
		public TerminalNode DIREITO() { return getToken(MovUnityParser.DIREITO, 0); }
		public TerminalNode ESQUERDO() { return getToken(MovUnityParser.ESQUERDO, 0); }
		public Botoes_mouseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_botoes_mouse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).enterBotoes_mouse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).exitBotoes_mouse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MovUnityVisitor ) return ((MovUnityVisitor<? extends T>)visitor).visitBotoes_mouse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Botoes_mouseContext botoes_mouse() throws RecognitionException {
		Botoes_mouseContext _localctx = new Botoes_mouseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_botoes_mouse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Botoes_tecladoContext extends ParserRuleContext {
		public TerminalNode LETRA() { return getToken(MovUnityParser.LETRA, 0); }
		public TerminalNode TECLA() { return getToken(MovUnityParser.TECLA, 0); }
		public Botoes_tecladoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_botoes_teclado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).enterBotoes_teclado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).exitBotoes_teclado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MovUnityVisitor ) return ((MovUnityVisitor<? extends T>)visitor).visitBotoes_teclado(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Botoes_tecladoContext botoes_teclado() throws RecognitionException {
		Botoes_tecladoContext _localctx = new Botoes_tecladoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_botoes_teclado);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).enterCustom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).exitCustom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MovUnityVisitor ) return ((MovUnityVisitor<? extends T>)visitor).visitCustom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomContext custom() throws RecognitionException {
		CustomContext _localctx = new CustomContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_custom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(CUSTOM);
			setState(165);
			match(ABRECHAVE);
			setState(166);
			teclas_custom();
			setState(167);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Teclas_customContext extends ParserRuleContext {
		public Token esquerda;
		public Token direita;
		public Token cima;
		public Token baixo;
		public List<TerminalNode> ESQUERDA() { return getTokens(MovUnityParser.ESQUERDA); }
		public TerminalNode ESQUERDA(int i) {
			return getToken(MovUnityParser.ESQUERDA, i);
		}
		public List<TerminalNode> DOISPONTOS() { return getTokens(MovUnityParser.DOISPONTOS); }
		public TerminalNode DOISPONTOS(int i) {
			return getToken(MovUnityParser.DOISPONTOS, i);
		}
		public List<TerminalNode> DIREITA() { return getTokens(MovUnityParser.DIREITA); }
		public TerminalNode DIREITA(int i) {
			return getToken(MovUnityParser.DIREITA, i);
		}
		public List<TerminalNode> CIMA() { return getTokens(MovUnityParser.CIMA); }
		public TerminalNode CIMA(int i) {
			return getToken(MovUnityParser.CIMA, i);
		}
		public List<TerminalNode> BAIXO() { return getTokens(MovUnityParser.BAIXO); }
		public TerminalNode BAIXO(int i) {
			return getToken(MovUnityParser.BAIXO, i);
		}
		public List<TerminalNode> LETRA() { return getTokens(MovUnityParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(MovUnityParser.LETRA, i);
		}
		public Teclas_customContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_teclas_custom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).enterTeclas_custom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).exitTeclas_custom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MovUnityVisitor ) return ((MovUnityVisitor<? extends T>)visitor).visitTeclas_custom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Teclas_customContext teclas_custom() throws RecognitionException {
		Teclas_customContext _localctx = new Teclas_customContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_teclas_custom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 32212254720L) != 0) {
				{
				setState(181);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ESQUERDA:
					{
					{
					setState(169);
					match(ESQUERDA);
					setState(170);
					match(DOISPONTOS);
					setState(171);
					((Teclas_customContext)_localctx).esquerda = match(LETRA);
					}
					}
					break;
				case DIREITA:
					{
					{
					setState(172);
					match(DIREITA);
					setState(173);
					match(DOISPONTOS);
					setState(174);
					((Teclas_customContext)_localctx).direita = match(LETRA);
					}
					}
					break;
				case CIMA:
					{
					{
					setState(175);
					match(CIMA);
					setState(176);
					match(DOISPONTOS);
					setState(177);
					((Teclas_customContext)_localctx).cima = match(LETRA);
					}
					}
					break;
				case BAIXO:
					{
					{
					setState(178);
					match(BAIXO);
					setState(179);
					match(DOISPONTOS);
					setState(180);
					((Teclas_customContext)_localctx).baixo = match(LETRA);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(185);
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

	public static final String _serializedATN =
		"\u0004\u00014\u00bb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001B\b\u0001\n\u0001\f\u0001"+
		"E\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"c\b\u0001\n\u0001\f\u0001f\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002n\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u0084\b\u0004\n\u0004\f\u0004\u0087\t\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0094"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u009d\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00b6\b\u000e\n"+
		"\u000e\f\u000e\u00b9\t\u000e\u0001\u000e\u0000\u0000\u000f\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000"+
		"\u0006\u0002\u0000##))\u0001\u0000\u0004\u0005\u0001\u0000%&\u0001\u0000"+
		"\u001b\u001c\u0001\u0000\u001d\u001e\u0002\u0000##\'\'\u00c7\u0000\u001e"+
		"\u0001\u0000\u0000\u0000\u0002C\u0001\u0000\u0000\u0000\u0004i\u0001\u0000"+
		"\u0000\u0000\u0006o\u0001\u0000\u0000\u0000\bt\u0001\u0000\u0000\u0000"+
		"\n\u0088\u0001\u0000\u0000\u0000\f\u008d\u0001\u0000\u0000\u0000\u000e"+
		"\u0095\u0001\u0000\u0000\u0000\u0010\u0097\u0001\u0000\u0000\u0000\u0012"+
		"\u009c\u0001\u0000\u0000\u0000\u0014\u009e\u0001\u0000\u0000\u0000\u0016"+
		"\u00a0\u0001\u0000\u0000\u0000\u0018\u00a2\u0001\u0000\u0000\u0000\u001a"+
		"\u00a4\u0001\u0000\u0000\u0000\u001c\u00b7\u0001\u0000\u0000\u0000\u001e"+
		"\u001f\u0005\u0002\u0000\u0000\u001f \u0005+\u0000\u0000 !\u0007\u0000"+
		"\u0000\u0000!\"\u0005\u0001\u0000\u0000\"#\u0003\u000e\u0007\u0000#$\u0005"+
		",\u0000\u0000$%\u0005-\u0000\u0000%&\u0003\u0002\u0001\u0000&\'\u0005"+
		".\u0000\u0000\'(\u0005\u0000\u0000\u0001(\u0001\u0001\u0000\u0000\u0000"+
		")*\u0005\u0006\u0000\u0000*+\u0005*\u0000\u0000+B\u0005(\u0000\u0000,"+
		"-\u0005\u0007\u0000\u0000-.\u0005*\u0000\u0000.B\u0005(\u0000\u0000/0"+
		"\u0005\b\u0000\u000001\u0005*\u0000\u00001B\u0005(\u0000\u000023\u0005"+
		"\u000b\u0000\u000034\u0005*\u0000\u00004B\u0005(\u0000\u000056\u0005\f"+
		"\u0000\u000067\u0005*\u0000\u00007B\u0005(\u0000\u000089\u0005\r\u0000"+
		"\u00009:\u0005*\u0000\u0000:B\u0005(\u0000\u0000;<\u0005\u000e\u0000\u0000"+
		"<=\u0005*\u0000\u0000=B\u0005(\u0000\u0000>?\u0005\u000f\u0000\u0000?"+
		"@\u0005*\u0000\u0000@B\u0005(\u0000\u0000A)\u0001\u0000\u0000\u0000A,"+
		"\u0001\u0000\u0000\u0000A/\u0001\u0000\u0000\u0000A2\u0001\u0000\u0000"+
		"\u0000A5\u0001\u0000\u0000\u0000A8\u0001\u0000\u0000\u0000A;\u0001\u0000"+
		"\u0000\u0000A>\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001"+
		"\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DF\u0001\u0000\u0000\u0000"+
		"EC\u0001\u0000\u0000\u0000FG\u0005\t\u0000\u0000GH\u0005*\u0000\u0000"+
		"HI\u0005(\u0000\u0000Id\u0001\u0000\u0000\u0000JK\u0005\u0006\u0000\u0000"+
		"KL\u0005*\u0000\u0000Lc\u0005(\u0000\u0000MN\u0005\u0007\u0000\u0000N"+
		"O\u0005*\u0000\u0000Oc\u0005(\u0000\u0000PQ\u0005\b\u0000\u0000QR\u0005"+
		"*\u0000\u0000Rc\u0005(\u0000\u0000ST\u0005\u000b\u0000\u0000TU\u0005*"+
		"\u0000\u0000Uc\u0005(\u0000\u0000VW\u0005\f\u0000\u0000WX\u0005*\u0000"+
		"\u0000Xc\u0005(\u0000\u0000YZ\u0005\r\u0000\u0000Z[\u0005*\u0000\u0000"+
		"[c\u0005(\u0000\u0000\\]\u0005\u000e\u0000\u0000]^\u0005*\u0000\u0000"+
		"^c\u0005(\u0000\u0000_`\u0005\u000f\u0000\u0000`a\u0005*\u0000\u0000a"+
		"c\u0005(\u0000\u0000bJ\u0001\u0000\u0000\u0000bM\u0001\u0000\u0000\u0000"+
		"bP\u0001\u0000\u0000\u0000bS\u0001\u0000\u0000\u0000bV\u0001\u0000\u0000"+
		"\u0000bY\u0001\u0000\u0000\u0000b\\\u0001\u0000\u0000\u0000b_\u0001\u0000"+
		"\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001"+
		"\u0000\u0000\u0000eg\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000"+
		"gh\u0003\u0004\u0002\u0000h\u0003\u0001\u0000\u0000\u0000ij\u0005\n\u0000"+
		"\u0000jm\u0005*\u0000\u0000kn\u0003\u0006\u0003\u0000ln\u0003\n\u0005"+
		"\u0000mk\u0001\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000n\u0005\u0001"+
		"\u0000\u0000\u0000op\u0005\u0011\u0000\u0000pq\u0005-\u0000\u0000qr\u0003"+
		"\b\u0004\u0000rs\u0005.\u0000\u0000s\u0007\u0001\u0000\u0000\u0000tu\u0005"+
		"\u0010\u0000\u0000uv\u0005*\u0000\u0000v\u0085\u0003\u0012\t\u0000wx\u0005"+
		"\u0014\u0000\u0000xy\u0005*\u0000\u0000y\u0084\u0003\u0018\f\u0000z{\u0005"+
		"\u0015\u0000\u0000{|\u0005*\u0000\u0000|\u0084\u0003\u0010\b\u0000}~\u0005"+
		"\u0016\u0000\u0000~\u007f\u0005*\u0000\u0000\u007f\u0084\u0003\u0018\f"+
		"\u0000\u0080\u0081\u0005\u0017\u0000\u0000\u0081\u0082\u0005*\u0000\u0000"+
		"\u0082\u0084\u0003\u0018\f\u0000\u0083w\u0001\u0000\u0000\u0000\u0083"+
		"z\u0001\u0000\u0000\u0000\u0083}\u0001\u0000\u0000\u0000\u0083\u0080\u0001"+
		"\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\t\u0001\u0000"+
		"\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0012"+
		"\u0000\u0000\u0089\u008a\u0005-\u0000\u0000\u008a\u008b\u0003\f\u0006"+
		"\u0000\u008b\u008c\u0005.\u0000\u0000\u008c\u000b\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0005\u0010\u0000\u0000\u008e\u008f\u0005*\u0000\u0000\u008f"+
		"\u0093\u0003\u0014\n\u0000\u0090\u0091\u0005\u0013\u0000\u0000\u0091\u0092"+
		"\u0005*\u0000\u0000\u0092\u0094\u0003\u0016\u000b\u0000\u0093\u0090\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\r\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0007\u0001\u0000\u0000\u0096\u000f\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0007\u0002\u0000\u0000\u0098\u0011\u0001\u0000"+
		"\u0000\u0000\u0099\u009d\u0005\u0018\u0000\u0000\u009a\u009d\u0005\u001a"+
		"\u0000\u0000\u009b\u009d\u0003\u001a\r\u0000\u009c\u0099\u0001\u0000\u0000"+
		"\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009b\u0001\u0000\u0000"+
		"\u0000\u009d\u0013\u0001\u0000\u0000\u0000\u009e\u009f\u0007\u0003\u0000"+
		"\u0000\u009f\u0015\u0001\u0000\u0000\u0000\u00a0\u00a1\u0007\u0004\u0000"+
		"\u0000\u00a1\u0017\u0001\u0000\u0000\u0000\u00a2\u00a3\u0007\u0005\u0000"+
		"\u0000\u00a3\u0019\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u0019\u0000"+
		"\u0000\u00a5\u00a6\u0005-\u0000\u0000\u00a6\u00a7\u0003\u001c\u000e\u0000"+
		"\u00a7\u00a8\u0005.\u0000\u0000\u00a8\u001b\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0005\u001f\u0000\u0000\u00aa\u00ab\u0005*\u0000\u0000\u00ab\u00b6"+
		"\u0005#\u0000\u0000\u00ac\u00ad\u0005 \u0000\u0000\u00ad\u00ae\u0005*"+
		"\u0000\u0000\u00ae\u00b6\u0005#\u0000\u0000\u00af\u00b0\u0005!\u0000\u0000"+
		"\u00b0\u00b1\u0005*\u0000\u0000\u00b1\u00b6\u0005#\u0000\u0000\u00b2\u00b3"+
		"\u0005\"\u0000\u0000\u00b3\u00b4\u0005*\u0000\u0000\u00b4\u00b6\u0005"+
		"#\u0000\u0000\u00b5\u00a9\u0001\u0000\u0000\u0000\u00b5\u00ac\u0001\u0000"+
		"\u0000\u0000\u00b5\u00af\u0001\u0000\u0000\u0000\u00b5\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u001d\u0001\u0000"+
		"\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u000bACbdm\u0083\u0085"+
		"\u0093\u009c\u00b5\u00b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
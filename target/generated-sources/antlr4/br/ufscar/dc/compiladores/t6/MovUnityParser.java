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
		T__0=1, GAMEOBJECT=2, SIDESCROLLING=3, TOPDOWN=4, VELOCIDADE=5, NUM=6, 
		GRAVIDADE=7, ACELERACAO=8, DESACELERACAO=9, CONTROLES=10, TECLADO=11, 
		MOUSE=12, TEMPLATE=13, MODO=14, WASD=15, FLECHAS=16, CLIQUE=17, SEGUIR=18, 
		BOTAO=19, DIREITO=20, ESQUERDO=21, W=22, ESPACO=23, FLECHA=24, PULOCONTROLE=25, 
		PULOIMPULSO=26, DIAGONAL=27, VERDADEIRO=28, FALSO=29, NOME=30, DOISPONTOS=31, 
		ABREPAR=32, FECHAPAR=33, ABRECHAVE=34, FECHACHAVE=35, COMENTARIO=36, COMENTARIO_NAO_FECHADO=37, 
		ERRO=38, IGNORE=39;
	public static final int
		RULE_gameobject = 0, RULE_def_atributos = 1, RULE_controles = 2, RULE_teclado = 3, 
		RULE_attr_teclado = 4, RULE_mouse = 5, RULE_attr_mouse = 6, RULE_templates = 7, 
		RULE_parcela_logica = 8, RULE_modos_teclado = 9, RULE_modos_mouse = 10, 
		RULE_botoes_mouse = 11, RULE_botoes_teclado = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"gameobject", "def_atributos", "controles", "teclado", "attr_teclado", 
			"mouse", "attr_mouse", "templates", "parcela_logica", "modos_teclado", 
			"modos_mouse", "botoes_mouse", "botoes_teclado"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'GameObject'", "'SIDE-SCROLLING'", "'TOP-DOWN'", "'velocidade'", 
			null, "'gravidade'", "'aceleracao'", "'desaceleracao'", "'controles'", 
			"'teclado'", "'mouse'", "'template'", "'modo'", "'WASD'", "'FLECHAS'", 
			"'CLIQUE'", "'SEGUIR'", "'botao'", "'DIREITO'", "'ESQUERDO'", "'W'", 
			"'ESPACO'", "'FLECHA'", "'puloControle'", "'puloImpulso'", "'diagonal'", 
			"'VERDADEIRO'", "'FALSO'", null, "':'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "GAMEOBJECT", "SIDESCROLLING", "TOPDOWN", "VELOCIDADE", "NUM", 
			"GRAVIDADE", "ACELERACAO", "DESACELERACAO", "CONTROLES", "TECLADO", "MOUSE", 
			"TEMPLATE", "MODO", "WASD", "FLECHAS", "CLIQUE", "SEGUIR", "BOTAO", "DIREITO", 
			"ESQUERDO", "W", "ESPACO", "FLECHA", "PULOCONTROLE", "PULOIMPULSO", "DIAGONAL", 
			"VERDADEIRO", "FALSO", "NOME", "DOISPONTOS", "ABREPAR", "FECHAPAR", "ABRECHAVE", 
			"FECHACHAVE", "COMENTARIO", "COMENTARIO_NAO_FECHADO", "ERRO", "IGNORE"
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
		public TerminalNode NOME() { return getToken(MovUnityParser.NOME, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(GAMEOBJECT);
			setState(27);
			match(ABREPAR);
			setState(28);
			match(NOME);
			setState(29);
			match(T__0);
			setState(30);
			templates();
			setState(31);
			match(FECHAPAR);
			setState(32);
			match(ABRECHAVE);
			setState(33);
			def_atributos();
			setState(34);
			match(FECHACHAVE);
			setState(35);
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
		public Token vel;
		public ControlesContext controles() {
			return getRuleContext(ControlesContext.class,0);
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
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 67109760L) != 0) {
				{
				setState(49);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GRAVIDADE:
					{
					{
					setState(37);
					match(GRAVIDADE);
					setState(38);
					match(DOISPONTOS);
					setState(39);
					((Def_atributosContext)_localctx).grav = match(NUM);
					}
					}
					break;
				case ACELERACAO:
					{
					{
					setState(40);
					match(ACELERACAO);
					setState(41);
					match(DOISPONTOS);
					setState(42);
					((Def_atributosContext)_localctx).ac = match(NUM);
					}
					}
					break;
				case DESACELERACAO:
					{
					{
					setState(43);
					match(DESACELERACAO);
					setState(44);
					match(DOISPONTOS);
					setState(45);
					((Def_atributosContext)_localctx).desac = match(NUM);
					}
					}
					break;
				case PULOIMPULSO:
					{
					{
					setState(46);
					match(PULOIMPULSO);
					setState(47);
					match(DOISPONTOS);
					setState(48);
					((Def_atributosContext)_localctx).puloIm = match(NUM);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(54);
			match(VELOCIDADE);
			setState(55);
			match(DOISPONTOS);
			setState(56);
			((Def_atributosContext)_localctx).vel = match(NUM);
			}
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 67109760L) != 0) {
				{
				setState(70);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GRAVIDADE:
					{
					{
					setState(58);
					match(GRAVIDADE);
					setState(59);
					match(DOISPONTOS);
					setState(60);
					((Def_atributosContext)_localctx).grav = match(NUM);
					}
					}
					break;
				case ACELERACAO:
					{
					{
					setState(61);
					match(ACELERACAO);
					setState(62);
					match(DOISPONTOS);
					setState(63);
					((Def_atributosContext)_localctx).ac = match(NUM);
					}
					}
					break;
				case DESACELERACAO:
					{
					{
					setState(64);
					match(DESACELERACAO);
					setState(65);
					match(DOISPONTOS);
					setState(66);
					((Def_atributosContext)_localctx).desac = match(NUM);
					}
					}
					break;
				case PULOIMPULSO:
					{
					{
					setState(67);
					match(PULOIMPULSO);
					setState(68);
					match(DOISPONTOS);
					setState(69);
					((Def_atributosContext)_localctx).puloIm = match(NUM);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			controles();
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
	public static class ControlesContext extends ParserRuleContext {
		public TerminalNode CONTROLES() { return getToken(MovUnityParser.CONTROLES, 0); }
		public TerminalNode DOISPONTOS() { return getToken(MovUnityParser.DOISPONTOS, 0); }
		public TecladoContext teclado() {
			return getRuleContext(TecladoContext.class,0);
		}
		public MouseContext mouse() {
			return getRuleContext(MouseContext.class,0);
		}
		public ControlesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).enterControles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).exitControles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MovUnityVisitor ) return ((MovUnityVisitor<? extends T>)visitor).visitControles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlesContext controles() throws RecognitionException {
		ControlesContext _localctx = new ControlesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_controles);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(CONTROLES);
			setState(78);
			match(DOISPONTOS);
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TECLADO:
				{
				setState(79);
				teclado();
				}
				break;
			case MOUSE:
				{
				setState(80);
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
			setState(83);
			match(TECLADO);
			setState(84);
			match(ABRECHAVE);
			setState(85);
			attr_teclado();
			setState(86);
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
		public TerminalNode MODO() { return getToken(MovUnityParser.MODO, 0); }
		public List<TerminalNode> DOISPONTOS() { return getTokens(MovUnityParser.DOISPONTOS); }
		public TerminalNode DOISPONTOS(int i) {
			return getToken(MovUnityParser.DOISPONTOS, i);
		}
		public Modos_tecladoContext modos_teclado() {
			return getRuleContext(Modos_tecladoContext.class,0);
		}
		public TerminalNode PULOCONTROLE() { return getToken(MovUnityParser.PULOCONTROLE, 0); }
		public Botoes_tecladoContext botoes_teclado() {
			return getRuleContext(Botoes_tecladoContext.class,0);
		}
		public TerminalNode DIAGONAL() { return getToken(MovUnityParser.DIAGONAL, 0); }
		public Parcela_logicaContext parcela_logica() {
			return getRuleContext(Parcela_logicaContext.class,0);
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
			setState(88);
			match(MODO);
			setState(89);
			match(DOISPONTOS);
			setState(90);
			modos_teclado();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PULOCONTROLE) {
				{
				setState(91);
				match(PULOCONTROLE);
				setState(92);
				match(DOISPONTOS);
				setState(93);
				botoes_teclado();
				}
			}

			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIAGONAL) {
				{
				setState(96);
				match(DIAGONAL);
				setState(97);
				match(DOISPONTOS);
				setState(98);
				parcela_logica();
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
			setState(101);
			match(MOUSE);
			setState(102);
			match(ABRECHAVE);
			setState(103);
			attr_mouse();
			setState(104);
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
			setState(106);
			match(MODO);
			setState(107);
			match(DOISPONTOS);
			setState(108);
			modos_mouse();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOTAO) {
				{
				setState(109);
				match(BOTAO);
				setState(110);
				match(DOISPONTOS);
				setState(111);
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
			setState(114);
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
			setState(116);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !(_la==WASD || _la==FLECHAS) ) {
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
			setState(120);
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
			setState(122);
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
		public TerminalNode W() { return getToken(MovUnityParser.W, 0); }
		public TerminalNode ESPACO() { return getToken(MovUnityParser.ESPACO, 0); }
		public TerminalNode FLECHA() { return getToken(MovUnityParser.FLECHA, 0); }
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
			setState(124);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0) ) {
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
		"\u0004\u0001\'\u007f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u00012\b\u0001\n\u0001\f\u00015\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001G\b\u0001\n\u0001\f\u0001J\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002R\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004_\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004d\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006q\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u0000\u0006\u0001\u0000\u0003\u0004\u0001\u0000\u001c"+
		"\u001d\u0001\u0000\u000f\u0010\u0001\u0000\u0011\u0012\u0001\u0000\u0014"+
		"\u0015\u0001\u0000\u0016\u0018}\u0000\u001a\u0001\u0000\u0000\u0000\u0002"+
		"3\u0001\u0000\u0000\u0000\u0004M\u0001\u0000\u0000\u0000\u0006S\u0001"+
		"\u0000\u0000\u0000\bX\u0001\u0000\u0000\u0000\ne\u0001\u0000\u0000\u0000"+
		"\fj\u0001\u0000\u0000\u0000\u000er\u0001\u0000\u0000\u0000\u0010t\u0001"+
		"\u0000\u0000\u0000\u0012v\u0001\u0000\u0000\u0000\u0014x\u0001\u0000\u0000"+
		"\u0000\u0016z\u0001\u0000\u0000\u0000\u0018|\u0001\u0000\u0000\u0000\u001a"+
		"\u001b\u0005\u0002\u0000\u0000\u001b\u001c\u0005 \u0000\u0000\u001c\u001d"+
		"\u0005\u001e\u0000\u0000\u001d\u001e\u0005\u0001\u0000\u0000\u001e\u001f"+
		"\u0003\u000e\u0007\u0000\u001f \u0005!\u0000\u0000 !\u0005\"\u0000\u0000"+
		"!\"\u0003\u0002\u0001\u0000\"#\u0005#\u0000\u0000#$\u0005\u0000\u0000"+
		"\u0001$\u0001\u0001\u0000\u0000\u0000%&\u0005\u0007\u0000\u0000&\'\u0005"+
		"\u001f\u0000\u0000\'2\u0005\u0006\u0000\u0000()\u0005\b\u0000\u0000)*"+
		"\u0005\u001f\u0000\u0000*2\u0005\u0006\u0000\u0000+,\u0005\t\u0000\u0000"+
		",-\u0005\u001f\u0000\u0000-2\u0005\u0006\u0000\u0000./\u0005\u001a\u0000"+
		"\u0000/0\u0005\u001f\u0000\u000002\u0005\u0006\u0000\u00001%\u0001\u0000"+
		"\u0000\u00001(\u0001\u0000\u0000\u00001+\u0001\u0000\u0000\u00001.\u0001"+
		"\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u0000"+
		"34\u0001\u0000\u0000\u000046\u0001\u0000\u0000\u000053\u0001\u0000\u0000"+
		"\u000067\u0005\u0005\u0000\u000078\u0005\u001f\u0000\u000089\u0005\u0006"+
		"\u0000\u00009H\u0001\u0000\u0000\u0000:;\u0005\u0007\u0000\u0000;<\u0005"+
		"\u001f\u0000\u0000<G\u0005\u0006\u0000\u0000=>\u0005\b\u0000\u0000>?\u0005"+
		"\u001f\u0000\u0000?G\u0005\u0006\u0000\u0000@A\u0005\t\u0000\u0000AB\u0005"+
		"\u001f\u0000\u0000BG\u0005\u0006\u0000\u0000CD\u0005\u001a\u0000\u0000"+
		"DE\u0005\u001f\u0000\u0000EG\u0005\u0006\u0000\u0000F:\u0001\u0000\u0000"+
		"\u0000F=\u0001\u0000\u0000\u0000F@\u0001\u0000\u0000\u0000FC\u0001\u0000"+
		"\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000IK\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000"+
		"KL\u0003\u0004\u0002\u0000L\u0003\u0001\u0000\u0000\u0000MN\u0005\n\u0000"+
		"\u0000NQ\u0005\u001f\u0000\u0000OR\u0003\u0006\u0003\u0000PR\u0003\n\u0005"+
		"\u0000QO\u0001\u0000\u0000\u0000QP\u0001\u0000\u0000\u0000R\u0005\u0001"+
		"\u0000\u0000\u0000ST\u0005\u000b\u0000\u0000TU\u0005\"\u0000\u0000UV\u0003"+
		"\b\u0004\u0000VW\u0005#\u0000\u0000W\u0007\u0001\u0000\u0000\u0000XY\u0005"+
		"\u000e\u0000\u0000YZ\u0005\u001f\u0000\u0000Z^\u0003\u0012\t\u0000[\\"+
		"\u0005\u0019\u0000\u0000\\]\u0005\u001f\u0000\u0000]_\u0003\u0018\f\u0000"+
		"^[\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_c\u0001\u0000\u0000"+
		"\u0000`a\u0005\u001b\u0000\u0000ab\u0005\u001f\u0000\u0000bd\u0003\u0010"+
		"\b\u0000c`\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000d\t\u0001"+
		"\u0000\u0000\u0000ef\u0005\f\u0000\u0000fg\u0005\"\u0000\u0000gh\u0003"+
		"\f\u0006\u0000hi\u0005#\u0000\u0000i\u000b\u0001\u0000\u0000\u0000jk\u0005"+
		"\u000e\u0000\u0000kl\u0005\u001f\u0000\u0000lp\u0003\u0014\n\u0000mn\u0005"+
		"\u0013\u0000\u0000no\u0005\u001f\u0000\u0000oq\u0003\u0016\u000b\u0000"+
		"pm\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000q\r\u0001\u0000\u0000"+
		"\u0000rs\u0007\u0000\u0000\u0000s\u000f\u0001\u0000\u0000\u0000tu\u0007"+
		"\u0001\u0000\u0000u\u0011\u0001\u0000\u0000\u0000vw\u0007\u0002\u0000"+
		"\u0000w\u0013\u0001\u0000\u0000\u0000xy\u0007\u0003\u0000\u0000y\u0015"+
		"\u0001\u0000\u0000\u0000z{\u0007\u0004\u0000\u0000{\u0017\u0001\u0000"+
		"\u0000\u0000|}\u0007\u0005\u0000\u0000}\u0019\u0001\u0000\u0000\u0000"+
		"\b13FHQ^cp";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
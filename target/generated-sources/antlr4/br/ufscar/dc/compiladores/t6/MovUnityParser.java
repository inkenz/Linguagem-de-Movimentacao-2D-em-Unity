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
		GRAVIDADE=7, CONTROLES=8, TECLADO=9, MOUSE=10, TEMPLATE=11, MODO=12, WASD=13, 
		FLECHAS=14, CLIQUE=15, SEGUIR=16, BOTAO=17, DIREITO=18, ESQUERDO=19, W=20, 
		ESPACO=21, FLECHA=22, PULO=23, DIAGONAL=24, VERDADEIRO=25, FALSO=26, NOME=27, 
		DOISPONTOS=28, ABREPAR=29, FECHAPAR=30, ABRECHAVE=31, FECHACHAVE=32, COMENTARIO=33, 
		COMENTARIO_NAO_FECHADO=34, ERRO=35, IGNORE=36;
	public static final int
		RULE_gameobject = 0, RULE_definicoes = 1, RULE_def_topdown = 2, RULE_def_sidescrolling = 3, 
		RULE_controles = 4, RULE_teclado = 5, RULE_attr_teclado = 6, RULE_mouse = 7, 
		RULE_attr_mouse = 8, RULE_templates = 9, RULE_parcela_logica = 10, RULE_modos_teclado = 11, 
		RULE_modos_mouse = 12, RULE_botoes_mouse = 13, RULE_botoes_teclado = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"gameobject", "definicoes", "def_topdown", "def_sidescrolling", "controles", 
			"teclado", "attr_teclado", "mouse", "attr_mouse", "templates", "parcela_logica", 
			"modos_teclado", "modos_mouse", "botoes_mouse", "botoes_teclado"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'GameObject'", "'SIDE-SCROLLING'", "'TOP-DOWN'", "'velocidade'", 
			null, "'gravidade'", "'controles'", "'teclado'", "'mouse'", "'template'", 
			"'modo'", "'WASD'", "'FLECHAS'", "'CLIQUE'", "'SEGUIR'", "'botao'", "'DIREITO'", 
			"'ESQUERDO'", "'W'", "'ESPACO'", "'FLECHA'", "'pulo'", "'diagonal'", 
			"'VERDADEIRO'", "'FALSO'", null, "':'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "GAMEOBJECT", "SIDESCROLLING", "TOPDOWN", "VELOCIDADE", "NUM", 
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
		public DefinicoesContext definicoes() {
			return getRuleContext(DefinicoesContext.class,0);
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
			setState(30);
			match(GAMEOBJECT);
			setState(31);
			match(ABREPAR);
			setState(32);
			match(NOME);
			setState(33);
			match(T__0);
			setState(34);
			templates();
			setState(35);
			match(FECHAPAR);
			setState(36);
			match(ABRECHAVE);
			setState(37);
			definicoes();
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
	public static class DefinicoesContext extends ParserRuleContext {
		public Def_topdownContext def_topdown() {
			return getRuleContext(Def_topdownContext.class,0);
		}
		public Def_sidescrollingContext def_sidescrolling() {
			return getRuleContext(Def_sidescrollingContext.class,0);
		}
		public DefinicoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).enterDefinicoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).exitDefinicoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MovUnityVisitor ) return ((MovUnityVisitor<? extends T>)visitor).visitDefinicoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinicoesContext definicoes() throws RecognitionException {
		DefinicoesContext _localctx = new DefinicoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definicoes);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				def_topdown();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				def_sidescrolling();
				}
				break;
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
	public static class Def_topdownContext extends ParserRuleContext {
		public TerminalNode VELOCIDADE() { return getToken(MovUnityParser.VELOCIDADE, 0); }
		public TerminalNode DOISPONTOS() { return getToken(MovUnityParser.DOISPONTOS, 0); }
		public TerminalNode NUM() { return getToken(MovUnityParser.NUM, 0); }
		public ControlesContext controles() {
			return getRuleContext(ControlesContext.class,0);
		}
		public Def_topdownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_topdown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).enterDef_topdown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).exitDef_topdown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MovUnityVisitor ) return ((MovUnityVisitor<? extends T>)visitor).visitDef_topdown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_topdownContext def_topdown() throws RecognitionException {
		Def_topdownContext _localctx = new Def_topdownContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_def_topdown);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(VELOCIDADE);
			setState(46);
			match(DOISPONTOS);
			setState(47);
			match(NUM);
			setState(48);
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
	public static class Def_sidescrollingContext extends ParserRuleContext {
		public Token vel;
		public Token grav;
		public ControlesContext controles() {
			return getRuleContext(ControlesContext.class,0);
		}
		public TerminalNode VELOCIDADE() { return getToken(MovUnityParser.VELOCIDADE, 0); }
		public List<TerminalNode> DOISPONTOS() { return getTokens(MovUnityParser.DOISPONTOS); }
		public TerminalNode DOISPONTOS(int i) {
			return getToken(MovUnityParser.DOISPONTOS, i);
		}
		public TerminalNode GRAVIDADE() { return getToken(MovUnityParser.GRAVIDADE, 0); }
		public List<TerminalNode> NUM() { return getTokens(MovUnityParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(MovUnityParser.NUM, i);
		}
		public Def_sidescrollingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_sidescrolling; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).enterDef_sidescrolling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MovUnityListener ) ((MovUnityListener)listener).exitDef_sidescrolling(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MovUnityVisitor ) return ((MovUnityVisitor<? extends T>)visitor).visitDef_sidescrolling(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_sidescrollingContext def_sidescrolling() throws RecognitionException {
		Def_sidescrollingContext _localctx = new Def_sidescrollingContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_def_sidescrolling);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VELOCIDADE:
				{
				{
				setState(50);
				match(VELOCIDADE);
				setState(51);
				match(DOISPONTOS);
				setState(52);
				((Def_sidescrollingContext)_localctx).vel = match(NUM);
				setState(53);
				match(GRAVIDADE);
				setState(54);
				match(DOISPONTOS);
				setState(55);
				((Def_sidescrollingContext)_localctx).grav = match(NUM);
				}
				}
				break;
			case GRAVIDADE:
				{
				{
				setState(56);
				match(GRAVIDADE);
				setState(57);
				match(DOISPONTOS);
				setState(58);
				((Def_sidescrollingContext)_localctx).grav = match(NUM);
				setState(59);
				match(VELOCIDADE);
				setState(60);
				match(DOISPONTOS);
				setState(61);
				((Def_sidescrollingContext)_localctx).vel = match(NUM);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(64);
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
		enterRule(_localctx, 8, RULE_controles);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(CONTROLES);
			setState(67);
			match(DOISPONTOS);
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TECLADO:
				{
				setState(68);
				teclado();
				}
				break;
			case MOUSE:
				{
				setState(69);
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
		enterRule(_localctx, 10, RULE_teclado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(TECLADO);
			setState(73);
			match(ABRECHAVE);
			setState(74);
			attr_teclado();
			setState(75);
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
		public TerminalNode PULO() { return getToken(MovUnityParser.PULO, 0); }
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
		enterRule(_localctx, 12, RULE_attr_teclado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(MODO);
			setState(78);
			match(DOISPONTOS);
			setState(79);
			modos_teclado();
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PULO:
				{
				{
				setState(80);
				match(PULO);
				setState(81);
				match(DOISPONTOS);
				setState(82);
				botoes_teclado();
				}
				}
				break;
			case DIAGONAL:
				{
				{
				setState(83);
				match(DIAGONAL);
				setState(84);
				match(DOISPONTOS);
				setState(85);
				parcela_logica();
				}
				}
				break;
			case FECHACHAVE:
				break;
			default:
				break;
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
		enterRule(_localctx, 14, RULE_mouse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(MOUSE);
			setState(89);
			match(ABRECHAVE);
			setState(90);
			attr_mouse();
			setState(91);
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
		enterRule(_localctx, 16, RULE_attr_mouse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(MODO);
			setState(94);
			match(DOISPONTOS);
			setState(95);
			modos_mouse();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOTAO) {
				{
				setState(96);
				match(BOTAO);
				setState(97);
				match(DOISPONTOS);
				setState(98);
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
		enterRule(_localctx, 18, RULE_templates);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
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
		enterRule(_localctx, 20, RULE_parcela_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
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
		enterRule(_localctx, 22, RULE_modos_teclado);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
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
		enterRule(_localctx, 24, RULE_modos_mouse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
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
		enterRule(_localctx, 26, RULE_botoes_mouse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
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
		enterRule(_localctx, 28, RULE_botoes_teclado);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0) ) {
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
		"\u0004\u0001$r\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007"+
		"\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001,\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003?\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004G\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006W\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bd\b\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0000\u0000\u000f\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u0000\u0006\u0001\u0000\u0003\u0004\u0001\u0000\u0019\u001a\u0001\u0000"+
		"\r\u000e\u0001\u0000\u000f\u0010\u0001\u0000\u0012\u0013\u0001\u0000\u0014"+
		"\u0016h\u0000\u001e\u0001\u0000\u0000\u0000\u0002+\u0001\u0000\u0000\u0000"+
		"\u0004-\u0001\u0000\u0000\u0000\u0006>\u0001\u0000\u0000\u0000\bB\u0001"+
		"\u0000\u0000\u0000\nH\u0001\u0000\u0000\u0000\fM\u0001\u0000\u0000\u0000"+
		"\u000eX\u0001\u0000\u0000\u0000\u0010]\u0001\u0000\u0000\u0000\u0012e"+
		"\u0001\u0000\u0000\u0000\u0014g\u0001\u0000\u0000\u0000\u0016i\u0001\u0000"+
		"\u0000\u0000\u0018k\u0001\u0000\u0000\u0000\u001am\u0001\u0000\u0000\u0000"+
		"\u001co\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u0002\u0000\u0000\u001f"+
		" \u0005\u001d\u0000\u0000 !\u0005\u001b\u0000\u0000!\"\u0005\u0001\u0000"+
		"\u0000\"#\u0003\u0012\t\u0000#$\u0005\u001e\u0000\u0000$%\u0005\u001f"+
		"\u0000\u0000%&\u0003\u0002\u0001\u0000&\'\u0005 \u0000\u0000\'(\u0005"+
		"\u0000\u0000\u0001(\u0001\u0001\u0000\u0000\u0000),\u0003\u0004\u0002"+
		"\u0000*,\u0003\u0006\u0003\u0000+)\u0001\u0000\u0000\u0000+*\u0001\u0000"+
		"\u0000\u0000,\u0003\u0001\u0000\u0000\u0000-.\u0005\u0005\u0000\u0000"+
		"./\u0005\u001c\u0000\u0000/0\u0005\u0006\u0000\u000001\u0003\b\u0004\u0000"+
		"1\u0005\u0001\u0000\u0000\u000023\u0005\u0005\u0000\u000034\u0005\u001c"+
		"\u0000\u000045\u0005\u0006\u0000\u000056\u0005\u0007\u0000\u000067\u0005"+
		"\u001c\u0000\u00007?\u0005\u0006\u0000\u000089\u0005\u0007\u0000\u0000"+
		"9:\u0005\u001c\u0000\u0000:;\u0005\u0006\u0000\u0000;<\u0005\u0005\u0000"+
		"\u0000<=\u0005\u001c\u0000\u0000=?\u0005\u0006\u0000\u0000>2\u0001\u0000"+
		"\u0000\u0000>8\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@A\u0003"+
		"\b\u0004\u0000A\u0007\u0001\u0000\u0000\u0000BC\u0005\b\u0000\u0000CF"+
		"\u0005\u001c\u0000\u0000DG\u0003\n\u0005\u0000EG\u0003\u000e\u0007\u0000"+
		"FD\u0001\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000G\t\u0001\u0000\u0000"+
		"\u0000HI\u0005\t\u0000\u0000IJ\u0005\u001f\u0000\u0000JK\u0003\f\u0006"+
		"\u0000KL\u0005 \u0000\u0000L\u000b\u0001\u0000\u0000\u0000MN\u0005\f\u0000"+
		"\u0000NO\u0005\u001c\u0000\u0000OV\u0003\u0016\u000b\u0000PQ\u0005\u0017"+
		"\u0000\u0000QR\u0005\u001c\u0000\u0000RW\u0003\u001c\u000e\u0000ST\u0005"+
		"\u0018\u0000\u0000TU\u0005\u001c\u0000\u0000UW\u0003\u0014\n\u0000VP\u0001"+
		"\u0000\u0000\u0000VS\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"W\r\u0001\u0000\u0000\u0000XY\u0005\n\u0000\u0000YZ\u0005\u001f\u0000"+
		"\u0000Z[\u0003\u0010\b\u0000[\\\u0005 \u0000\u0000\\\u000f\u0001\u0000"+
		"\u0000\u0000]^\u0005\f\u0000\u0000^_\u0005\u001c\u0000\u0000_c\u0003\u0018"+
		"\f\u0000`a\u0005\u0011\u0000\u0000ab\u0005\u001c\u0000\u0000bd\u0003\u001a"+
		"\r\u0000c`\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000d\u0011\u0001"+
		"\u0000\u0000\u0000ef\u0007\u0000\u0000\u0000f\u0013\u0001\u0000\u0000"+
		"\u0000gh\u0007\u0001\u0000\u0000h\u0015\u0001\u0000\u0000\u0000ij\u0007"+
		"\u0002\u0000\u0000j\u0017\u0001\u0000\u0000\u0000kl\u0007\u0003\u0000"+
		"\u0000l\u0019\u0001\u0000\u0000\u0000mn\u0007\u0004\u0000\u0000n\u001b"+
		"\u0001\u0000\u0000\u0000op\u0007\u0005\u0000\u0000p\u001d\u0001\u0000"+
		"\u0000\u0000\u0005+>FVc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
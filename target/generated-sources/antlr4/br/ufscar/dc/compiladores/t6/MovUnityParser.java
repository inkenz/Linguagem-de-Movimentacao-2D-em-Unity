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
		WASD=24, FLECHAS=25, CLIQUE=26, SEGUIR=27, DIREITO=28, ESQUERDO=29, LETRA=30, 
		FLECHA=31, VERDADEIRO=32, FALSO=33, TECLA=34, NUM=35, NOME=36, DOISPONTOS=37, 
		ABREPAR=38, FECHAPAR=39, ABRECHAVE=40, FECHACHAVE=41, COMENTARIO=42, COMENTARIO_NAO_FECHADO=43, 
		CHAVE_NAO_FECHADA=44, ERRO=45, NEGATIVO=46, IGNORE=47;
	public static final int
		RULE_gameobject = 0, RULE_def_atributos = 1, RULE_controle = 2, RULE_teclado = 3, 
		RULE_attr_teclado = 4, RULE_mouse = 5, RULE_attr_mouse = 6, RULE_templates = 7, 
		RULE_parcela_logica = 8, RULE_modos_teclado = 9, RULE_modos_mouse = 10, 
		RULE_botoes_mouse = 11, RULE_botoes_teclado = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"gameobject", "def_atributos", "controle", "teclado", "attr_teclado", 
			"mouse", "attr_mouse", "templates", "parcela_logica", "modos_teclado", 
			"modos_mouse", "botoes_mouse", "botoes_teclado"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'GameObject'", "'template'", "'SIDE-SCROLLING'", "'TOP-DOWN'", 
			"'gravidade'", "'aceleracao'", "'desaceleracao'", "'velocidade'", "'controle'", 
			"'puloImpulso'", "'corridaVelocidade'", "'esquivaVelocidade'", "'esquivaDuracao'", 
			"'esquivaEspera'", "'modo'", "'teclado'", "'mouse'", "'botao'", "'puloControle'", 
			"'diagonal'", "'corridaControle'", "'esquivaControle'", "'WASD'", "'FLECHAS'", 
			"'CLIQUE'", "'SEGUIR'", "'DIREITO'", "'ESQUERDO'", null, "'FLECHA'", 
			"'VERDADEIRO'", "'FALSO'", null, null, null, "':'", "'('", "')'", "'{'", 
			"'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "GAMEOBJECT", "TEMPLATE", "SIDESCROLLING", "TOPDOWN", "GRAVIDADE", 
			"ACELERACAO", "DESACELERACAO", "VELOCIDADE", "CONTROLE", "PULOIMPULSO", 
			"CORRIDAVEL", "ESQUIVAVEL", "ESQUIVADUR", "ESQUIVAESP", "MODO", "TECLADO", 
			"MOUSE", "BOTAO", "PULOCONTROLE", "DIAGONAL", "CORRIDACON", "ESQUIVACON", 
			"WASD", "FLECHAS", "CLIQUE", "SEGUIR", "DIREITO", "ESQUERDO", "LETRA", 
			"FLECHA", "VERDADEIRO", "FALSO", "TECLA", "NUM", "NOME", "DOISPONTOS", 
			"ABREPAR", "FECHAPAR", "ABRECHAVE", "FECHACHAVE", "COMENTARIO", "COMENTARIO_NAO_FECHADO", 
			"CHAVE_NAO_FECHADA", "ERRO", "NEGATIVO", "IGNORE"
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
			setState(26);
			match(GAMEOBJECT);
			setState(27);
			match(ABREPAR);
			setState(28);
			_la = _input.LA(1);
			if ( !(_la==LETRA || _la==NOME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 63936L) != 0) {
				{
				setState(61);
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
				case CORRIDAVEL:
					{
					{
					setState(49);
					match(CORRIDAVEL);
					setState(50);
					match(DOISPONTOS);
					setState(51);
					((Def_atributosContext)_localctx).corrvel = match(NUM);
					}
					}
					break;
				case ESQUIVAVEL:
					{
					{
					setState(52);
					match(ESQUIVAVEL);
					setState(53);
					match(DOISPONTOS);
					setState(54);
					((Def_atributosContext)_localctx).esqvel = match(NUM);
					}
					}
					break;
				case ESQUIVADUR:
					{
					{
					setState(55);
					match(ESQUIVADUR);
					setState(56);
					match(DOISPONTOS);
					setState(57);
					((Def_atributosContext)_localctx).esqdur = match(NUM);
					}
					}
					break;
				case ESQUIVAESP:
					{
					{
					setState(58);
					match(ESQUIVAESP);
					setState(59);
					match(DOISPONTOS);
					setState(60);
					((Def_atributosContext)_localctx).esqesp = match(NUM);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(66);
			match(VELOCIDADE);
			setState(67);
			match(DOISPONTOS);
			setState(68);
			((Def_atributosContext)_localctx).vel = match(NUM);
			}
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 63936L) != 0) {
				{
				setState(94);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GRAVIDADE:
					{
					{
					setState(70);
					match(GRAVIDADE);
					setState(71);
					match(DOISPONTOS);
					setState(72);
					((Def_atributosContext)_localctx).grav = match(NUM);
					}
					}
					break;
				case ACELERACAO:
					{
					{
					setState(73);
					match(ACELERACAO);
					setState(74);
					match(DOISPONTOS);
					setState(75);
					((Def_atributosContext)_localctx).ac = match(NUM);
					}
					}
					break;
				case DESACELERACAO:
					{
					{
					setState(76);
					match(DESACELERACAO);
					setState(77);
					match(DOISPONTOS);
					setState(78);
					((Def_atributosContext)_localctx).desac = match(NUM);
					}
					}
					break;
				case PULOIMPULSO:
					{
					{
					setState(79);
					match(PULOIMPULSO);
					setState(80);
					match(DOISPONTOS);
					setState(81);
					((Def_atributosContext)_localctx).puloIm = match(NUM);
					}
					}
					break;
				case CORRIDAVEL:
					{
					{
					setState(82);
					match(CORRIDAVEL);
					setState(83);
					match(DOISPONTOS);
					setState(84);
					((Def_atributosContext)_localctx).corrvel = match(NUM);
					}
					}
					break;
				case ESQUIVAVEL:
					{
					{
					setState(85);
					match(ESQUIVAVEL);
					setState(86);
					match(DOISPONTOS);
					setState(87);
					((Def_atributosContext)_localctx).esqvel = match(NUM);
					}
					}
					break;
				case ESQUIVADUR:
					{
					{
					setState(88);
					match(ESQUIVADUR);
					setState(89);
					match(DOISPONTOS);
					setState(90);
					((Def_atributosContext)_localctx).esqdur = match(NUM);
					}
					}
					break;
				case ESQUIVAESP:
					{
					{
					setState(91);
					match(ESQUIVAESP);
					setState(92);
					match(DOISPONTOS);
					setState(93);
					((Def_atributosContext)_localctx).esqesp = match(NUM);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
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
			setState(101);
			match(CONTROLE);
			setState(102);
			match(DOISPONTOS);
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TECLADO:
				{
				setState(103);
				teclado();
				}
				break;
			case MOUSE:
				{
				setState(104);
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
			setState(107);
			match(TECLADO);
			setState(108);
			match(ABRECHAVE);
			setState(109);
			attr_teclado();
			setState(110);
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
			setState(112);
			match(MODO);
			setState(113);
			match(DOISPONTOS);
			setState(114);
			modos_teclado();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 15728640L) != 0) {
				{
				setState(127);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PULOCONTROLE:
					{
					{
					setState(115);
					match(PULOCONTROLE);
					setState(116);
					match(DOISPONTOS);
					setState(117);
					((Attr_tecladoContext)_localctx).pulo = botoes_teclado();
					}
					}
					break;
				case DIAGONAL:
					{
					{
					setState(118);
					match(DIAGONAL);
					setState(119);
					match(DOISPONTOS);
					setState(120);
					parcela_logica();
					}
					}
					break;
				case CORRIDACON:
					{
					{
					setState(121);
					match(CORRIDACON);
					setState(122);
					match(DOISPONTOS);
					setState(123);
					((Attr_tecladoContext)_localctx).corrida = botoes_teclado();
					}
					}
					break;
				case ESQUIVACON:
					{
					{
					setState(124);
					match(ESQUIVACON);
					setState(125);
					match(DOISPONTOS);
					setState(126);
					((Attr_tecladoContext)_localctx).esquiva = botoes_teclado();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(131);
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
			setState(132);
			match(MOUSE);
			setState(133);
			match(ABRECHAVE);
			setState(134);
			attr_mouse();
			setState(135);
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
			setState(137);
			match(MODO);
			setState(138);
			match(DOISPONTOS);
			setState(139);
			modos_mouse();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOTAO) {
				{
				setState(140);
				match(BOTAO);
				setState(141);
				match(DOISPONTOS);
				setState(142);
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
			setState(145);
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
			setState(147);
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
			setState(149);
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
			setState(151);
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
			setState(153);
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
			setState(155);
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
		"\u0004\u0001/\u009e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001>\b\u0001\n\u0001\f\u0001A\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001_\b\u0001\n\u0001\f\u0001b\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002j\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0080\b\u0004"+
		"\n\u0004\f\u0004\u0083\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u0090\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u0000\u0007\u0002\u0000\u001e\u001e$$\u0001\u0000"+
		"\u0004\u0005\u0001\u0000 !\u0001\u0000\u0018\u0019\u0001\u0000\u001a\u001b"+
		"\u0001\u0000\u001c\u001d\u0002\u0000\u001e\u001e\"\"\u00a6\u0000\u001a"+
		"\u0001\u0000\u0000\u0000\u0002?\u0001\u0000\u0000\u0000\u0004e\u0001\u0000"+
		"\u0000\u0000\u0006k\u0001\u0000\u0000\u0000\bp\u0001\u0000\u0000\u0000"+
		"\n\u0084\u0001\u0000\u0000\u0000\f\u0089\u0001\u0000\u0000\u0000\u000e"+
		"\u0091\u0001\u0000\u0000\u0000\u0010\u0093\u0001\u0000\u0000\u0000\u0012"+
		"\u0095\u0001\u0000\u0000\u0000\u0014\u0097\u0001\u0000\u0000\u0000\u0016"+
		"\u0099\u0001\u0000\u0000\u0000\u0018\u009b\u0001\u0000\u0000\u0000\u001a"+
		"\u001b\u0005\u0002\u0000\u0000\u001b\u001c\u0005&\u0000\u0000\u001c\u001d"+
		"\u0007\u0000\u0000\u0000\u001d\u001e\u0005\u0001\u0000\u0000\u001e\u001f"+
		"\u0003\u000e\u0007\u0000\u001f \u0005\'\u0000\u0000 !\u0005(\u0000\u0000"+
		"!\"\u0003\u0002\u0001\u0000\"#\u0005)\u0000\u0000#$\u0005\u0000\u0000"+
		"\u0001$\u0001\u0001\u0000\u0000\u0000%&\u0005\u0006\u0000\u0000&\'\u0005"+
		"%\u0000\u0000\'>\u0005#\u0000\u0000()\u0005\u0007\u0000\u0000)*\u0005"+
		"%\u0000\u0000*>\u0005#\u0000\u0000+,\u0005\b\u0000\u0000,-\u0005%\u0000"+
		"\u0000->\u0005#\u0000\u0000./\u0005\u000b\u0000\u0000/0\u0005%\u0000\u0000"+
		"0>\u0005#\u0000\u000012\u0005\f\u0000\u000023\u0005%\u0000\u00003>\u0005"+
		"#\u0000\u000045\u0005\r\u0000\u000056\u0005%\u0000\u00006>\u0005#\u0000"+
		"\u000078\u0005\u000e\u0000\u000089\u0005%\u0000\u00009>\u0005#\u0000\u0000"+
		":;\u0005\u000f\u0000\u0000;<\u0005%\u0000\u0000<>\u0005#\u0000\u0000="+
		"%\u0001\u0000\u0000\u0000=(\u0001\u0000\u0000\u0000=+\u0001\u0000\u0000"+
		"\u0000=.\u0001\u0000\u0000\u0000=1\u0001\u0000\u0000\u0000=4\u0001\u0000"+
		"\u0000\u0000=7\u0001\u0000\u0000\u0000=:\u0001\u0000\u0000\u0000>A\u0001"+
		"\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000"+
		"@B\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BC\u0005\t\u0000\u0000"+
		"CD\u0005%\u0000\u0000DE\u0005#\u0000\u0000E`\u0001\u0000\u0000\u0000F"+
		"G\u0005\u0006\u0000\u0000GH\u0005%\u0000\u0000H_\u0005#\u0000\u0000IJ"+
		"\u0005\u0007\u0000\u0000JK\u0005%\u0000\u0000K_\u0005#\u0000\u0000LM\u0005"+
		"\b\u0000\u0000MN\u0005%\u0000\u0000N_\u0005#\u0000\u0000OP\u0005\u000b"+
		"\u0000\u0000PQ\u0005%\u0000\u0000Q_\u0005#\u0000\u0000RS\u0005\f\u0000"+
		"\u0000ST\u0005%\u0000\u0000T_\u0005#\u0000\u0000UV\u0005\r\u0000\u0000"+
		"VW\u0005%\u0000\u0000W_\u0005#\u0000\u0000XY\u0005\u000e\u0000\u0000Y"+
		"Z\u0005%\u0000\u0000Z_\u0005#\u0000\u0000[\\\u0005\u000f\u0000\u0000\\"+
		"]\u0005%\u0000\u0000]_\u0005#\u0000\u0000^F\u0001\u0000\u0000\u0000^I"+
		"\u0001\u0000\u0000\u0000^L\u0001\u0000\u0000\u0000^O\u0001\u0000\u0000"+
		"\u0000^R\u0001\u0000\u0000\u0000^U\u0001\u0000\u0000\u0000^X\u0001\u0000"+
		"\u0000\u0000^[\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000"+
		"b`\u0001\u0000\u0000\u0000cd\u0003\u0004\u0002\u0000d\u0003\u0001\u0000"+
		"\u0000\u0000ef\u0005\n\u0000\u0000fi\u0005%\u0000\u0000gj\u0003\u0006"+
		"\u0003\u0000hj\u0003\n\u0005\u0000ig\u0001\u0000\u0000\u0000ih\u0001\u0000"+
		"\u0000\u0000j\u0005\u0001\u0000\u0000\u0000kl\u0005\u0011\u0000\u0000"+
		"lm\u0005(\u0000\u0000mn\u0003\b\u0004\u0000no\u0005)\u0000\u0000o\u0007"+
		"\u0001\u0000\u0000\u0000pq\u0005\u0010\u0000\u0000qr\u0005%\u0000\u0000"+
		"r\u0081\u0003\u0012\t\u0000st\u0005\u0014\u0000\u0000tu\u0005%\u0000\u0000"+
		"u\u0080\u0003\u0018\f\u0000vw\u0005\u0015\u0000\u0000wx\u0005%\u0000\u0000"+
		"x\u0080\u0003\u0010\b\u0000yz\u0005\u0016\u0000\u0000z{\u0005%\u0000\u0000"+
		"{\u0080\u0003\u0018\f\u0000|}\u0005\u0017\u0000\u0000}~\u0005%\u0000\u0000"+
		"~\u0080\u0003\u0018\f\u0000\u007fs\u0001\u0000\u0000\u0000\u007fv\u0001"+
		"\u0000\u0000\u0000\u007fy\u0001\u0000\u0000\u0000\u007f|\u0001\u0000\u0000"+
		"\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\t\u0001\u0000\u0000\u0000"+
		"\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0012\u0000\u0000"+
		"\u0085\u0086\u0005(\u0000\u0000\u0086\u0087\u0003\f\u0006\u0000\u0087"+
		"\u0088\u0005)\u0000\u0000\u0088\u000b\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0005\u0010\u0000\u0000\u008a\u008b\u0005%\u0000\u0000\u008b\u008f\u0003"+
		"\u0014\n\u0000\u008c\u008d\u0005\u0013\u0000\u0000\u008d\u008e\u0005%"+
		"\u0000\u0000\u008e\u0090\u0003\u0016\u000b\u0000\u008f\u008c\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\r\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0007\u0001\u0000\u0000\u0092\u000f\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0007\u0002\u0000\u0000\u0094\u0011\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0007\u0003\u0000\u0000\u0096\u0013\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0007\u0004\u0000\u0000\u0098\u0015\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0007\u0005\u0000\u0000\u009a\u0017\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0007\u0006\u0000\u0000\u009c\u0019\u0001\u0000\u0000"+
		"\u0000\b=?^`i\u007f\u0081\u008f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
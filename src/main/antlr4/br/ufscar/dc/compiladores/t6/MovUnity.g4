grammar MovUnity;

// LÉXICO
GAMEOBJECT: 'GameObject';
SIDESCROLLING: 'SIDE-SCROLLING';
TOPDOWN: 'TOP-DOWN';
VELOCIDADE: 'velocidade';
NUM: ('0'..'9')+ ('.' ('0'..'9')+)?;
GRAVIDADE: 'gravidade';
CONTROLES: 'controles';
TECLADO: 'teclado';
MOUSE: 'mouse';
TEMPLATE: 'template';
MODO: 'modo';
WASD: 'WASD';
FLECHAS: 'FLECHAS';
CLIQUE: 'CLIQUE';
SEGUIR: 'SEGUIR';
BOTAO: 'botao';
DIREITO: 'DIREITO';
ESQUERDO: 'ESQUERDO';
W: 'W';
ESPACO: 'ESPACO';
FLECHA: 'FLECHA';
PULO: 'pulo';
DIAGONAL: 'diagonal';
VERDADEIRO: 'VERDADEIRO';
FALSO: 'FALSO';
NOME: [a-zA-Z]([a-zA-Z0-9]* | [a-zA-Z0-9]*'_'[a-zA-Z0-9]* );

DOISPONTOS: ':';
ABREPAR: '(';
FECHAPAR: ')';
ABRECHAVE: '{';
FECHACHAVE: '}';

COMENTARIO:
    '[' ~('{'|'}'|'\n'|'\r'|'\t')* ']' {skip();};
COMENTARIO_NAO_FECHADO:
    '[' ~('['|']'|'\n'|'\r'|'\t')*;

ERRO:
    ( '!' | '|' | '@' |'$' | '~' | ']');
IGNORE:
    ( ' ' | '\t' | '\r' | '\n' ) {skip();};


//SINTÁTICO

//Formato do programa
gameobject: GAMEOBJECT ABREPAR NOME FECHAPAR ABRECHAVE definicoes FECHACHAVE;

//Definições
definicoes: TEMPLATE DOISPONTOS TOPDOWN def_topdown | 
            TEMPLATE DOISPONTOS SIDESCROLLING def_sidescrolling;
def_topdown: VELOCIDADE DOISPONTOS NUM controles; 
def_sidescrolling: VELOCIDADE DOISPONTOS NUM GRAVIDADE DOISPONTOS NUM controles;

//Controles
controles: CONTROLES DOISPONTOS teclado | mouse;
teclado: TECLADO ABRECHAVE attr_teclado FECHACHAVE;
attr_teclado: MODO DOISPONTOS modos_teclado 
((PULO DOISPONTOS botoes_teclado) | (DIAGONAL DOISPONTOS parcela_logica))?
;
mouse: MOUSE ABRECHAVE attr_mouse FECHACHAVE;
attr_mouse: MODO DOISPONTOS modos_mouse (BOTAO DOISPONTOS botoes_mouse)?;

//Valores
parcela_logica:
    VERDADEIRO | FALSO
;
modos_teclado: WASD | FLECHAS;
modos_mouse: CLIQUE | SEGUIR;
botoes_mouse: DIREITO | ESQUERDO;
botoes_teclado: W | ESPACO | FLECHA; 
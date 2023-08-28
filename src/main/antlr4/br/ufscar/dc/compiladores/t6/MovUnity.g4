grammar MovUnity;

// LÉXICO
GAMEOBJECT: 'GameObject';
//Templates 
TEMPLATE: 'template';
SIDESCROLLING: 'SIDE-SCROLLING';
TOPDOWN: 'TOP-DOWN';

// Atributos gerais
GRAVIDADE: 'gravidade';
ACELERACAO: 'aceleracao';
DESACELERACAO: 'desaceleracao';
VELOCIDADE: 'velocidade';
CONTROLE: 'controle';
PULOIMPULSO: 'puloImpulso';
CORRIDAVEL: 'corridaVelocidade';
ESQUIVAVEL: 'esquivaVelocidade';
ESQUIVADUR: 'esquivaDuracao';
ESQUIVAESP: 'esquivaEspera';


// Atributos de controle
MODO: 'modo';
TECLADO: 'teclado';
MOUSE: 'mouse';
BOTAO: 'botao';
PULOCONTROLE: 'puloControle';
DIAGONAL: 'diagonal';
CORRIDACON: 'corridaControle';
ESQUIVACON: 'esquivaControle';

// Valores de controle
WASD: 'WASD';
FLECHAS: 'FLECHAS';
CLIQUE: 'CLIQUE';
SEGUIR: 'SEGUIR';
DIREITO: 'DIREITO';
ESQUERDO: 'ESQUERDO';
LETRA: [A-Z];
FLECHA: 'FLECHA';
VERDADEIRO: 'VERDADEIRO';
FALSO: 'FALSO';
TECLA: 'SHIFTESQ' | 'ESPACO' | 'TAB' |
       'ENTER' | 'CTRLESQ' | 'ALTESQ' |
       'ALTDIR' | 'SHIFTDIR' | 'CTRLDIR' | 'ESC';
// Valores gerais
NUM: ('0'..'9')+ ('.' ('0'..'9')+)?;
NOME: [a-zA-Z]([a-zA-Z0-9]* | [a-zA-Z0-9]*'_'[a-zA-Z0-9]* );

// Outros
DOISPONTOS: ':';
ABREPAR: '(';
FECHAPAR: ')';
ABRECHAVE: '{';
FECHACHAVE: '}';

COMENTARIO:
    '[' ~('{'|'}'|'\n'|'\r'|'\t')* ']' {skip();};
COMENTARIO_NAO_FECHADO:
    '[' ~('['|']'|'\n'|'\r'|'\t')*;

CHAVE_NAO_FECHADA:
    '{' ~('['|']'|'\n'|'\r'|'\t')*;

ERRO:
    ( '!' | '|' | '@' |'$' | '~' | ']' | '+');
NEGATIVO: '-'NUM;
IGNORE:
    ( ' ' | '\t' | '\r' | '\n' ) {skip();};


//SINTÁTICO

//Formato do programa
gameobject: GAMEOBJECT ABREPAR (NOME | LETRA) ',' templates FECHAPAR ABRECHAVE def_atributos FECHACHAVE EOF;


def_atributos: ((GRAVIDADE DOISPONTOS grav=NUM) |
                (ACELERACAO DOISPONTOS ac=NUM) |
                (DESACELERACAO DOISPONTOS desac=NUM) |
                (PULOIMPULSO DOISPONTOS puloIm=NUM) |
                (CORRIDAVEL DOISPONTOS corrvel=NUM) |
                (ESQUIVAVEL DOISPONTOS esqvel=NUM) |
                (ESQUIVADUR DOISPONTOS esqdur = NUM) |
                (ESQUIVAESP DOISPONTOS esqesp=NUM)
                )*
                (VELOCIDADE DOISPONTOS vel=NUM) 
               ((GRAVIDADE DOISPONTOS grav=NUM) |
                (ACELERACAO DOISPONTOS ac=NUM) |
                (DESACELERACAO DOISPONTOS desac=NUM) |
                (PULOIMPULSO DOISPONTOS puloIm=NUM) |
                (CORRIDAVEL DOISPONTOS corrvel=NUM)|
                (ESQUIVAVEL DOISPONTOS esqvel=NUM) |
                (ESQUIVADUR DOISPONTOS esqdur = NUM) |
                (ESQUIVAESP DOISPONTOS esqesp=NUM)
                )*
               controle
;

//Controles
controle: CONTROLE DOISPONTOS (teclado | mouse);
teclado: TECLADO ABRECHAVE attr_teclado FECHACHAVE;
attr_teclado: MODO DOISPONTOS modos_teclado 
            ((PULOCONTROLE DOISPONTOS pulo=botoes_teclado) |
            (DIAGONAL DOISPONTOS parcela_logica) |
            (CORRIDACON DOISPONTOS corrida=botoes_teclado) |
            (ESQUIVACON DOISPONTOS esquiva=botoes_teclado)
            )*
;
mouse: MOUSE ABRECHAVE attr_mouse FECHACHAVE;
attr_mouse: MODO DOISPONTOS modos_mouse (BOTAO DOISPONTOS botoes_mouse)?;

templates: SIDESCROLLING | TOPDOWN;
//Valores
parcela_logica:
    VERDADEIRO | FALSO
;
modos_teclado: WASD | FLECHAS;
modos_mouse: CLIQUE | SEGUIR;
botoes_mouse: DIREITO | ESQUERDO;
botoes_teclado: LETRA | TECLA; 
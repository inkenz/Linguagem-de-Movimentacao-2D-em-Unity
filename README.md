
# Linguagem de Movimentação 2D em Unity

Trabalho 6 da Disciplina de Construção de Compiladores 2023/01 UFSCar, criado usando o gerador de gramática ANTLR4 e programado em Java usando o NetBeans.

## Índice
* [Descrição](#Descrição)
* [Feito por](#Feito-por)
* [Estrutura da Linguagem](#Estrutura-da-Linguagem)
* [Compilação do Projeto](#Compilação-do-Projeto)
* [Execução](#Execução)
## Descrição
Vídeo: [Youtube](https://youtu.be/1leQPrerZ_s)

O trabalho consiste em um compilador para a Linguagem de Movimentação 2D em Unity,  que permite a criação de scripts de movimentação para GameObjects em Unity, utilizando uma linguagem de fácil escrita. Ele foi desenvolvido com o objetivo de simplificar o processo de criação de scripts de movimentação para jogos 2D em Unity, eliminando a necessidade de escrever diretamente em C# para tarefas comuns de movimentação.

Na pasta casos-de-teste é possível ver exemplos de códigos escritos nessa linguagem e a saída que elas geram ao passar pelo compilador.

## Feito por:

  + Guilherme Calça - 790759
  + Kenzo Inanami de Faria - 790778
  + Julio Cesar dos Santos Oliveira Filho - 779800


## Estrutura da Linguagem
```
GameObject([nome], [template]){
    [atributos]
    controle: [tipo_de_controle]{
        [atributos_do_controle]
    }
}
```
| [] | Descrição |
| ------------- | ------------- |
| [nome]  | Nome da classe em C#, deve ser o mesmo nome que o arquivo para ser executado pelo motor Unity |
| [template]  | Um de dois templates de movimentação implementados, TOP-DOWN ou SIDE-SCROLLING |
| [atributos] | Atributos a serem definidos, dependem do template e do controle escolhidos |
| [tipo_de_controle] | Existem dois tipos de controle possíveis de serem escritos que determinam como o GameObject vai se movimentar, 'mouse' ou 'teclado'|
| [atributos_do_controle] | Atributos que determinam que botões do controle vão movimentar o GameObject |

### Lista de [atributos]

| Nome | Descrição |
| ------------- | ------------- |
|velocidade| Se refere a velocidade com que o personagem vai se mover, único atributo que sempre vai ser declarado, independente de [template] ou [tipo_de_controle] |
|gravidade| Valor da força da gravidade que vai agir sobre o personagem, deve apenas ser declarada quando o [template] for SIDE-SCROLLING|
|aceleracao| Valor de aceleração do personagem, para o [tipo_de_controle] teclado apenas |
|desaceleracao| Valor de desaceleração do personagem, para o [tipo_de_controle] teclado apenas |
|corridaVelocidade| Se refere a velocidade com que o personagem vai se mover após pressionar o botão declarado como corridaControle |
|esquivaVelocidade|Valor da velocidade de esquiva com que o personagem vai se mover em uma direção por um determinado periodo de tempo após pressionar o botão declarado como esquivaControle|
|esquivaDuracao| Valor do tempo, em segundos, que o personagem vai se mover durante a esquiva|
|esquivaEspera| Valor do tempo, em segundos, que o personagem vai precisar esperar antes de usar a esquiva novamente|

### Lista de [atributos do controle]

|Nome|Descrição| [tipo_de_controle]|
| ------------- | ------------- | ------------- |
|modo|Primeiro atributo a ser declarado dentro de [tipo_de_controle] |todos|
|puloControle| Tecla utilizada para pular, é obrigatório apenas se o template declarado for SIDE-SCROLLING, caso o contrário, resultará em erro|teclado|
|diagonal| Pode receber os valores VERDADEIRO ou FALSO, funciona apenas no [template] TOP-DOWN e determina se o personagem pode se movimentar na diagonal, não é obrigatório e o valor padrão é VERDADEIRO|teclado|
|corridaControle| Tecla utilizada para correr |teclado|
|esquivaControle| Tecla utilizada para esquivar|teclado|
|botao| Determina o botão do  mouse utilizada para o personagem se movimentar|mouse|

### Lista de valores para o [atributos do controle] modo

|Nome|Descrição| [tipo_de_controle]|
| ------------- | ------------- | ------------- |
|WASD|O personagem se movimenta utilizando as teclas WASD|teclado|
|FLECHAS|O personagem se movimenta utilizando as flechas do teclado|teclado|
|custom|Deve-se abrir e fechar chaves depois e declarar os valores de esquerda, direita, cima e baixo, atribuindo uma tecla para cada um |teclado|
|SEGUIR| O personagem segue o cursor do mouse|mouse|
|CLIQUE|O personagem se movimenta para o local onde foi clicado, deve-se declarar o atributo botao e determinar se o clique deve ser feito com o botao DIREITO ou ESQUERDO| mouse|

### Lista de teclas para [tipo_do_controle] teclado

|Nome|Descrição|
| ------------- | ------------- |
|ESPACO| Tecla espaço|
|SHIFTESQ| Shift esquerdo|
|SHIFTDIR|Shift direito|
|CTRLESQ| Ctrl esquerdo|
|CTRLDIR| Ctrl direito|
|ESC| Tecla esc, ou escape|
|ALTESQ| Alt esquerdo|
|ALTDIR| Alt direito|
|ENTER|Tecla enter|
|TAB| Tecla tab|

## Erros semânticos
* Algum atributo obrigatório faltando.
* Algum atributo não-obrigatório faltando. Ex: definir o valor de corridaVelocidade porém não definir o valor de corridaControle.
* Algum atributo declarado mais de uma vez.
* Declarar um atributo não compatível com o tipo de [template] ou [controle]. Ex: Utilizar o [tipo_do_controle] mouse para o template SIDE-SCROLLING, declarar atributos de esquiva ou corrida para [tipo_do_controle] mouse.
* Utilizar o [tipo_do_controle] mouse para o template SIDE-SCROLLING.
* No modo custom, utilizar a mesma tecla para se mover em direções diferentes.


## Compilação do Projeto

O projeto foi compilado usando a versão Java 20.0.1 e a ferramenta Maven. Para compilar em sua máquina, em alguns casos, será necessário mudar o arquivo pom.xml para aceitar outras versões. Para fazer isso, abra o arquivo pom.xml e nas linhas 58 e 59 alterar o número da versão.

```
<maven.compiler.source>20</maven.compiler.source>
<maven.compiler.target>20</maven.compiler.target>
```

Na pasta do projeto basta realizar a compilação do projeto com o comandos:

```
mvn package
```
## Execução

Para execução digite o comando:
```
java -jar  target\movimento-unity-1.0-SNAPSHOT-jar-with-dependencies.jar  [arquivo de entrada] [arquivo de saída]
```

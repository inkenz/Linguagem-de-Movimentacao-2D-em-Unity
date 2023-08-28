# T6-Compiladores - Linguagem de Movimentação 2D em Unity

Trabalho 6 da Disciplina de Construção de Compiladores 2023/01 UFSCar, criado usando o gerador de gramática ANTLR4 e programado em Java usando o NetBeans.


## Índice
* [Descrição](#Descrição)
* [Feito por](#Feito-por)
* [Estrutura da Linguagem](#Estrutura-da-Linguagem)
* [Compilação do Projeto](#Compilação-do-Projeto)
* [Execução](#Execução)
## Descrição
Vídeo: [inserir link]

O trabalho consiste em um compilador para a Linguagem de Movimentação 2D em Unity,  que permite a criação de scripts de movimentação para GameObjects em Unity, utilizando uma linguagem de fácil escrita. Ele foi desenvolvido com o objetivo de simplificar o processo de criação de scripts de movimentação para jogos 2D em Unity, eliminando a necessidade de escrever diretamente em C# para tarefas comuns de movimentação.
## Feito por:

  + Guilherme Calça - 790759
  + Kenzo Inanami de Faria - 790778
  + Julio Cesar dos Santos Oliveira Filho - 779800



## Estrutura da Linguagem
```
GameObject([nome], [template]){
    [atributos]
    controle: [tipo de controle]{
        [atributos do controle]
    }
}
```
| [] | Descrição |
| ------------- | ------------- |
| [nome]  | Nome da classe em C#, deve ser o mesmo nome que o arquivo para ser executado pelo motor Unity |
| [template]  | Um de dois templates de movimentação implementados, TOP-DOWN ou SIDE-SCROLLING |
| [atributos] | Atributos a serem definidos, dependem do template e do controle escolhidos |
| [tipo de controle] | Existem dois tipos de controle possíveis de serem escritos que determinam como o GameObject vai se movimentar, 'mouse' ou 'teclado'|
| [atributos do controle] | Atributos que determinam que botões do controle vão movimentar o GameObject |

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
java -jar  target\linguagem-la-1.0-SNAPSHOT-jar-with-dependencies.jar [arquivo de entrada] [arquivo de saída]
```

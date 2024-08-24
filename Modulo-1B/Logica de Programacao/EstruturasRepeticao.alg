Algoritmo "Multiplicação de Números Digitados A"

Var
// Seção de Declarações das variáveis
inicioLaco: inteiro
limiteLaco: inteiro
resultado: inteiro
numeroDigitado: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
inicioLaco <- 1
limiteLaco <- 10
resultado <- 1

enquanto (inicioLaco <= limiteLaco) faca
  escreval (inicioLaco + "/10", "Digite um número para multiplicar: ")
  leia(numeroDigitado)
  resultado <- resultado * numeroDigitado
  escreval ("Resultado parcial da multiplicação: ", resultado)
  inicioLaco <- inicioLaco + 1
fimenquanto

escreval ("Resultado final da multiplicação: ", resultado)

Fimalgoritmo

Algoritmo "Multiplicação de Números Digitados B"

Var
// Seção de Declarações das variáveis
index: inteiro
inicioLaco: inteiro
limiteLaco: inteiro
resultado: inteiro
numeroDigitado: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
inicioLaco <- 1
limiteLaco <- 10
resultado <- 1

para index de inicioLaco ate limiteLaco faca
  escreval (index + "/10", "Digite um número para multiplicar: ")
  leia(numeroDigitado)
  resultado <- resultado * numeroDigitado
  escreval ("Resultado parcial da multiplicação: ", resultado)
  // inicioLaco <- inicioLaco + 1
fimpara

escreval ("Resultado final da multiplicação: ", resultado)

Fimalgoritmo
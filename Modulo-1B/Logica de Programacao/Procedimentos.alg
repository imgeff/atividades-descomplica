Algoritmo "Multiplicação como uso de Procedimento (Parâmetro)"

Procedimento calcularProduto(x,y: real)

Var
resultado: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc..

resultado <- x * y
escreval("O resultado da multiplicação dos dois números é: ", resultado)

Fimprocedimento

Var
// Seção de Declarações das variáveis
primeiroNumero,segundoNumero: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc..

escreval("Digite o primeiro número: ")
leia(primeiroNumero)
escreval("Digite o segundo número: ")
leia(segundoNumero)
calcularProduto(primeiroNumero, segundoNumero)

Fimalgoritmo
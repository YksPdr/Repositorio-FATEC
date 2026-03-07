// 1 - O que e um Tipo Abstrato de Dados (TAD) e qual a caracterıstica fundamental na sua utilização?
// R: Um Tipo Abstrato de Dados (TAD) é um modelo que define um conjunto de dados e as operações que podem ser realizadas sobre eles, sem especificar como essas operações são implementadas internamente.

// 2 - Quais as vantagens de se programar com TADs?
/* R: Encapsulamento (Oculta os detalhes da implementação.);
      Reutilização de código (O mesmo TAD pode ser usado em vários programas.);
      Facilidade de manutenção (Se a implementação mudar, o programa principal não precisa mudar.);
      Organização do código (O programa fica mais modular e estruturado.);
      Redução de erros (Evita que o usuário manipule diretamente os dados internos.).*/ 

// 3 - Crie um TAD que implemente o controle de uma conta bancaria, implemente funções para inicializar, depositar, sacar e imprimir o saldo.

#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int numero;
    float saldo;
} Conta;

void inicializar(Conta *c, int numero) {
    c -> numero = numero;
    c -> saldo = 0;
}

void depositar(Conta *c, float valor) {
    c -> saldo += valor;
}

void sacar(Conta *c, float valor) {
    if(valor <= c->saldo) {
        c -> saldo -= valor;
    } else {
        printf("Saldo insuficiente\n");
    }
}

void imprimirSaldo(Conta *c) {
    printf("Saldo da conta: %.2f\n", c -> saldo);
}

// 4 - Utilizando a alocação dinamica de memória, crie uma função para criar uma nova conta bancária.

Conta* criarConta(int numero) {

    Conta *c;

    c = (Conta*) malloc(sizeof(Conta));

    if(c != NULL) {
        c->numero = numero;
        c->saldo = 0;
    }

    return c;
}

int main() {

    Conta *c1;

    c1 = criarConta(1);

    depositar(c1, 1000);
    sacar(c1, 300);
    imprimirSaldo(c1);

    return 0;
}

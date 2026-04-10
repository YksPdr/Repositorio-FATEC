// 1- Qual o valor de y no final do programa?
#include <stdio.h>

void main() { 
    int y, *p, x; 
    y = 0; 
    p = &y; 
    x = *p; // x = 0
    x = 4; // x = 4
    ++(*p); // y = 1
    x–; // x = 3
    (*p) += x++; // y = y + 3 = 4; x = 4 
    
    printf (“y = %d\n”, y); // y = 4
}

// 2 - Teste e explique a diferença, caso exista, entre:
// b) O que quer dizer *(p + 10)?
// R: Significa acessar 10 posições à frente do ponteiro

/* p++; incrementa o ponteiro
(*p)++; o valor da variável apontada é incrementado
*(++p); incrementa primeiro, depois acessa o valor apontado */

// 3 - Quais serão os valores de x, y e p ao final do trecho de código abaixo?
int x, y, *p;
y = 0; 
p = &y; 
x = *p; // x = 0
x = 4; // x = 4
(*p)++; // y = 1
–x; // x = 3
(*p) += x; // y = 1 + 3 = 4
// x = 3; y = 4; p = &y

// 4 - Os programas (trechos de código) abaixo possuem erros. Qual(is)? Como deveriam ser?
// a)
void main() {
    int x, *p;
    x = 100;
    p = x; // erro aqui tinha que ser p = &x;
    printf("Valor de p: %d.\n", *p);
}
// b)
void troca (int *i, int *j) { 
    int *temp; // erro aqui o ponteiro não foi inicializado corretamente, o certo seria int temp;
    *temp = *i; 
    *i = *j; 
    *j = *temp;
}
// c)
char *a, *b; 
a = “abacate”; 
b = “uva”; 
if (a < b) // erro aqui, está comparando com endereços de memória e não strings
    printf (“%s vem antes de %s no dicionário”, a, b); 
else 
    printf (“%s vem depois de %s no dicionário”, a, b);
/* o certo seria:
if (strcmp(a, b) < 0)
    printf("%s vem antes de %s no dicionário", a, b);
else
    printf("%s vem depois de %s no dicionário", a, b);*/

// 5 - Escreva uma função chamada troca que troca os valores dos parâmetros recebidos. Sua assinatura deve ser: void troca(float *a, float *b);

void troca(float *a, float *b) {
    float temp;
    temp = *a;
    *a = *b;
    *b = temp;
}

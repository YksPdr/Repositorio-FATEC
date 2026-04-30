#include <stdio.h>

int potencia(int x, int y) {
    if (y == 0)
        return 1;

    if (y > 0)
        return x * potencia(x, y - 1);

    return 1 / potencia(x, -y);
}

int main() {
    int base;
    int expoente;
    int resultado;

    printf("Digite a base: ");
    scanf("%lf", &base);

    printf("Digite o expoente: ");
    scanf("%d", &expoente);

    resultado = potencia(base, expoente);

    printf("%d elevado a %d = %d\n", base, expoente, resultado);

    return 0;
}

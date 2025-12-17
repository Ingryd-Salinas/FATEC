/*
 * Programa: Área de um retângulo
 * Autor: Ingryd Salinas
 * Data: Criado em 2 de março de 2025
 * Descrição: Calcular a área de um retângulo e 
              mostrar o resultado no final
 */
 
#include<stdio.h>

//abrir função
main ()
{ //declarar e zerar variáveis
	float b = 0.0;
	float h = 0.0;
	float A = 0.0;
	
	printf("Digite a base e a altura do retangulo: ");
	scanf("%f%f", &b, &h);
	
	A = b * h;
	
	printf("A area do retangulo eh %.1f cm\n", A);
	
}//fim do programa


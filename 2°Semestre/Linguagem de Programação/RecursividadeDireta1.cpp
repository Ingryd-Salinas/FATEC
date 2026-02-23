/*
	Name: RecursividadeDireta1.cpp
	Author: Ingryd Salinas
	Date: 12/05/25 10:04
	Description: Programa para demonstrar o uso de
	             funções recursivas diretas
*/

#include<stdio.h>

//sessão de prototipação
void contagemRegressiva(int);

main()
{
	int num = 0;
	printf("Digite um numero para iniciar a contagem  regressiva: ");
	scanf("%d", &num); //função do espaço em branco é zerar o buffer do teclado, é útil para caracter %c
	contagemRegressiva(num); //1° invoke - dispara a função
	
}//fim do programa

void contagemRegressiva(int x)
{
	
	if(x <= 0)
	{
		printf("%d\n", x);
		puts("FOGO!!!\n");
		return;
	}
	
	printf("%d\n", x);
	//x--;
	contagemRegressiva(--x); //invoke recursivo
	printf("%d\n", x);
}

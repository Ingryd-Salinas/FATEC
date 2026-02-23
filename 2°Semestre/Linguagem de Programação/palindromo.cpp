/*
	Name: Palíndromo.cpp
	Author: Ingryd Salinas
	Date: 31/03/25 10:50
	Description: Programa para identificar se uma sequência de caracteres é palíndromo
*/

#include <stdio.h>
#include <conio.h>
#include <string.h>
#include <locale.h>

main ()
{
	setlocale (LC_ALL, "Portuguese");
	char letra = ' ';
	char palavra[60]; //vetor de caracteres para armazenar uma string
	
	printf("Digite uma palavra: ");
	gets(palavra);
	
	puts("\nPressione qualquer tecla para continuar...");
	letra = getchar(); //para a execução e captura o valor da tecla pressionada
	
	//printf("A tecla digitada foi %c que eh igual a %d na tabela ASCII\n", letra, letra); //para mostrar com nº
	printf("\nA palavra digitada foi %s\n\n", palavra); //para a PALAVRA
	
	//laço de repetição para mostrar o conteúdo do vetor
	for(int i = 0; i < strlen(palavra); i++)
	{
		printf ("%c|", palavra[i]);
	}
	
	//Laço para retirar os espaços em branco
	int posR = 0;
	int posW = 0;
	char fimX = strlen(palavra);
	for(posR = 0; posR < fimX; posR++)
	{
	//printf("A palavra digitada sem espaços em branco: %s\n\n", palavra);	//mostra o passo a passo
		if(palavra[posR]==' ')
		{
			fimX++;
			continue;
		}
	
	palavra[posW] = palavra[posR];
	posW++;
	}
	printf("\n\nA palavra digitada sem espaços em branco: %s\n\n", palavra); //mostra só a palavra final
	
	//Laço para verificar se é um palíndromo 
	int inicio = 0;
	int fim = strlen(palavra) - 1;
	int i = 0;
	while(i < strlen(palavra))
	{
		if(palavra[inicio] == palavra[fim])
		{
			inicio++;
			fim--;
		}
		else
			break;
			
	printf("\ninicio: %d ", inicio);
	printf("fim: %d", fim);
	i++;
	} //fim do while
	
	if(fim <= inicio)
		
			printf("\n\nE um palindromo!");
			
		else
		
			printf("\nNao e um palindromo!");
} //fim do programa

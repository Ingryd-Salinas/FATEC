/*
	Name: Matriz.cpp
	Author: Ingryd Salinas
	Date: 17/03/25 09:57
	Description: Programa para manipular dados em matrizes
*/

#include<stdio.h> //Standar Input Output

main()
{
	int i, j;
	int mat[3][3]; // matriz quadrada de ordem 3
	i = j = 0;
	int ordem = 3;
	
	//Mostrando por linha
	puts("Digite os elementos para carregar na matriz: ");
	puts("Em ordem por linha: ");
	
	do
	{
		do
		{
			printf("[%d][%d]", i, j);
			scanf("%d", &mat[i][j]);
			j++;
			
		}while(j < 3);
	
	
	j = 0;
	i++;	
	}while(i < 3);
	
	//Mostrando por coluna
	/*
	i = 0;
	j = 0;
	puts("Digite os elementos para carregar na matriz: ");
	puts("Em ordem por coluna: ");
	
	do
	{
		do
		{
			printf("[%d][%d]", i, j);
			scanf("%d", &mat[i][j]);
			i++;
			
		}while(i < 3);
	
		i = 0;
		j++;
			
	}while(j < 3);*/
	
	//Mostrando DP
	i = 0;
	j = 0;
	puts("\n\n===> Elementos da Diagonal Principal (DP): ");
	while(i < 3)
	{
		while(j < 3)
		{
			if(i == j)
				printf("|%d", mat[i][j]);
				
			j = j + 1;
		}
	j = 0;
	i = i + 1;
	}
	
	//Mostrando DS
	i = j = 0;
	puts("\n\n===> Elementos da Diagonal Secundaria (DS): ");
	for(i = 0; i < 3; i++)
		for(j = 0; j < 3; j++)
			if(i+j == ordem-1)
				printf("|%d", mat[i][j]);
	
	//Mostrando acima da dp
	i = j = 0;
	puts("\n\n===> Elementos Acima da Diagonal Principal (DP): ");
	do
	{
		while(j < 3)
		{
			if(i < j)
				printf("|%d", mat[i][j]);
			j = j + 1;
		}
	j = 0;
	i = i + 1;
	} while(i < 3);
	
} //fim do programa


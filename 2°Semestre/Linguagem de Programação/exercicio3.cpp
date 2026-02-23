/*
	Name:Exercicio3_.cpp
	Author: Ingryd
	Date: 05/05/25 09:46
	Description: Resolução do 3°exercício da P1
*/

#include<stdio.h>

main()
{
	int i, j, v;
	i = j = v = 0;
	int ordem = 0;
	
	printf("Digite a ordem da matriz quadrada: ");
	scanf("%d", &ordem);
	
	float mat[ordem][ordem];
	float vet[ordem * ordem];
	
	printf("Digite os elementos da matriz: \n");
	do
	{
		do
		{
			printf("\nMat[%d][%d]: ", i, j);
			scanf("%f", &mat[i][j]);
			j++;
			
		}while(j < ordem);
		
		j = 0;
		i++;
		
	}while(i < ordem);
	puts("\n=======> Matriz carregada!!!");
	
	for(i = 0; i < ordem; i++)
	{
		for(j = 0; j < ordem; j++)
		{
			vet[v] = mat[i][j];
			v++;
		}
	}
	puts("\n=======> Vetor carregado!!!");
	
	i = j = ordem - 1;
	puts("\nMatriz de ordem inversa: ");
	while(i >= 0)
	{
		while(j >= 0)
		{
			printf("\nmat[%d][%d] = %.2f", i, j, mat[i][j]);
			j--;
		}
	
	j = ordem - 1;
	i--;
	
	}
	
	puts("\Vetor de ordem inversa: ");
	v = (ordem * ordem) - 1;
	while(v >= 0)
	{
		printf("\nvet[%d] = %.2f", v, vet[v]);
		v--;
	}

}


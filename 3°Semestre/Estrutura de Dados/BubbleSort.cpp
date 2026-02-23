/*
	Name: BubbleSort.cpp
	Author: Ingryd Salinas
	Date: 17/09/25 11:26
	Description: Implementação do método de ordenação 
				 Bubble Sort - Método da Bolha
*/

#include<stdio.h>
#include<stdlib.h>
#include<time.h>

//Sessão de prototipaçao
void bubbleSort(int *, int);

//Variáveis Globais
int troca, comp;

main()
{
	//int vet[] = {17, 23, 8, 96, 43, 13, 2, 25, -5, 29};
	int vet[500000];
	int tam, i;
	tam = sizeof(vet)/sizeof(int); //tamanho do vetor
	srand(time(NULL)); //Planta a semente aleatória de acordo com o tempo (influencia na geração randomica)
	
	for(i = 0; i < tam; i++)
		vet[i] = rand()%500000; //geração randomica, o porcentagem serve para delimitar, mostra números de 1 a 100
	
	puts("Vetor Original: ");
	for(i = 0; i < tam; i++)
		printf(" %d |", vet[i]);
	
	bubbleSort(vet, tam); //invoke da função Bubble Sort 
	
	puts("\n\nVetor Ordenado pelo Bubble Sort: ");
	for(i = 0; i < tam; i++)
		printf(" %d |", vet[i]);
		
	printf("\n\nQuantidade de trocas: %d", troca);
	
	printf("\n\nQuantidade de comparacoes: %d", comp);
	
}//fim do programa

//Função para ordenação do Buubble Sort
void bubbleSort(int *vet, int tam)
{
	int i, aux;
	
	while(tam > 0)
	{
		for(i = 0; i < tam-1; i++)
		{
			comp++;
			if(vet[i] > vet[i+1])
			{
				aux = vet[i];
				vet[i] = vet[i+1];
				vet[i+1] = aux;
				troca++;
			}
		}
		
		tam--;
	}
}


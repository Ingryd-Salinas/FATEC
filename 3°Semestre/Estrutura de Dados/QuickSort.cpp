/*
	Name: QuickSort.cpp
	Author: Ingryd Salinas
	Date: 05/11/25 11:23
	Description: Implementação do método de ordenação 
				 Quick Sort
*/

#include<stdio.h>
#include<stdlib.h>
#include<time.h>

//Sessão de prototipação
int partition(int *, int, int); //Realiza as partições
void quickSort(int *, int, int); //
void swap(int *, int *); //Realiza trocas

main()
{
	//Para calcular o tempo decorrido da função
	clock_t inicio, fim;
	double tempo_decorrido;
	
	int vet[] = {17, 23, 8, 96, 43, 13, 2, 25, -5, 29};
	//int vet[100000];
	int i;
	int tam = sizeof(vet)/sizeof(int);//tamanho do vetor
	//srand(time(NULL)); //Planta a semente
	
	/*for(i = 0; i < tam; i++)
		vet[i] = rand()%500000;*/ //geração randomica
	
	puts("Vetor Original: ");
	for(i = 0; i < tam; i++)
		printf("%d|", vet[i]);
	
	//Captura o tempo inicial
	inicio = clock();
	
	quickSort(vet, 0, tam-1); //invoke da função
	
	fim = clock();
	tempo_decorrido = ((double)fim - inicio) / CLOCKS_PER_SEC;
	printf("\n\nTempo decorrido: %f", tempo_decorrido);
	
	puts("\n\nVetor Ordenado pelo Quick Sort: ");
	for(i = 0; i < tam; i++)
		printf(" %d |", vet[i]);
} //fim do main

//Função que realiza as partições
int partition(int vet[], int inicio, int fim)
{
	int pivot = vet[inicio];
	int i = (fim+1);
	
	for(int j = fim; j >= inicio+1; j--)
	{
		if(vet[j] >= pivot)
		{
			i--;
			swap(&vet[i], &vet[j]);
		}
	}
	
	swap(&vet[i-1], &vet[inicio]);
	return (i-1);
}

//Função principal do Quick Sort
void quickSort(int vet[], int inicio, int fim)
{
	if(inicio < fim)
	{
		int pivot = partition(vet, inicio, fim);
		quickSort(vet, inicio, pivot-1); //partição Lado Esquerdo
		quickSort(vet, pivot+1, fim); //partição Lado Direito
	}
}

//Função que realiza o swap (troca de posições entre os elementos)
void swap(int *a, int *b)
{
	int aux = *a;
	*a = *b;
	*b = aux;
}



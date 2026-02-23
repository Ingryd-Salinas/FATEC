/*
	Name: SelectionSort.cpp
	Author: Ingryd Salinas
	Date: 24/09/25 10:34
	Description: Implementação do método de ordenação 
				 Selection Sort - Ordenação por seleção
*/

#include<stdio.h>
#include<stdlib.h>
#include<time.h>

//Sessão de prototipação
void selectionSort(int *, int);
int troca, comp;

main()
{
	//int vet[] = {17, 23, 8, 96, 43, 13, 2, 25, -5, 29};
	int vet[500000];
	int tam, i;
	troca = comp = 0;
	tam = sizeof(vet)/sizeof(int);//tamanho do vetor
	srand(time(NULL)); //Planta a semente
	
	for(i = 0; i < tam; i++)
		vet[i] = rand()%500000; //geração randomica
	
	puts("Vetor Original: ");
	for(i = 0; i < tam; i++)
		printf("%d|", vet[i]);
	
	selectionSort(vet, tam);
	
	puts("\n\nVetor Ordenado pelo Selection Sort: ");
	for(i = 0; i < tam; i++)
		printf(" %d |", vet[i]);
		
	printf("\n\nQuantidade de trocas: %d", troca);
	printf("\n\nQuantidade de comparacoes: %d", comp);
	
}//fim do main

//Função com o algoritmo do Selection Sort
void selectionSort(int *vet, int tam)
{
	int i, j, menor, aux, chave;
	
	//Laço externo que itera do início ao fim do vetor
	for(i = 0; i < tam-1; i++)
	{
		//Assume que o menor elemento está na primeira posição
		menor = i;
		
		//Laço interno para buscar o menor elemento do sub-conjunto
		for(j = i + 1; j < tam; j++)
		{
			comp++;
			if(vet[j] < vet[menor])
				menor = j; //Guarda o índice do menor elemento
		}
		
		//Troca o menor elemento encontrado com o elemento da posição inicial (chave)
		if(menor != chave)
		{
			aux = vet[i];
			vet[i] = vet[menor];
			vet[menor] = aux;
			troca++;
		}	
	}//Loop externo
	
}//fim da função















/*
	Name: MergeSort.cpp
	Author: Ingryd Salinas
	Date: 22/10/25 11:11
	Description: Implementação do método de ordenação 
				 Merge Sort
*/

#include<stdio.h>
#include<stdlib.h>

//Sessão de prototipação
void mergeSort(int *, int, int); //Quebra tudo em uma única sub-unidade
void merge(int *, int, int, int); //Mescla todos os sub-vetores

main()
{
	int vet[] = {17, 23, 8, 96, 43, 13, 2, 25, -5, 29};
	int tam, i;
	tam = sizeof(vet)/sizeof(int);//tamanho do vetor
	
	puts("Vetor Original: ");
	for(i = 0; i < tam; i++)
		printf("%d|", vet[i]);
	
	mergeSort(vet, 0, tam-1); //invoke da função
	
	puts("\n\nVetor Ordenado pelo Merge Sort: ");
	for(i = 0; i < tam; i++)
		printf(" %d |", vet[i]);
} //fim do main

/*Função recursiva para "quebrar" todo o conjunto de dados 
em diversos vetores de um único elemento.*/
void mergeSort(int *vet, int inicio, int fim)
{
	if(inicio < fim)
	{
		int meio = (inicio + fim) / 2; //Calcula o meio do conjunto
		mergeSort(vet, inicio, meio); //Divide o lado Esquerdo
		mergeSort(vet, meio+1, fim); //Divide o lado Direito
		merge(vet, inicio, meio, fim); //Junta os vetores
	}
} //fim função mergeSort

//Função que junta os sub-vetores divididos por Merge Sort
void merge(int *vet, int inicio, int meio, int fim)
{
	int i, j, k;
	int n1, n2; //tamanho para os vetores temporários
	
	n1 = meio - inicio + 1;
	n2 = fim - meio;
	
	//Cria os vetores auxiliares - temporários
	int esquerda[n1], direita[n2];
	
	//Copia os dados para os arrays temporários esquerda[] e direita[]
	for(i = 0; i < n1; i++)
		esquerda[i] = vet[inicio+i];
	
	for(j = 0; j < n2; j++)
		direita[j] = vet[meio + 1 + j];
	
	//Mescla os arrays temporários de volta para o vetor original (vet)
	i = 0; //índice inicial do primeiro subarray (esquerdo)
	j = 0; //índice inicial do segundo subarray (direito)
	k = inicio; //índice inicial do subarray mesclado
	
	while(i < n1 && j < n2)
	{
		if(esquerda[i] < direita[j])
		{
			vet[k] = esquerda[i];
			i++;
		}
		else
		{
			vet[k] = direita[j];
			j++;
		}
		
		k++;
	}
	
	//Copia os elementos restantes de esquerda[] se houver
	while(i < n1)
	{
		vet[k] = esquerda[i];
		i++;
		k++;
	}
	
	//Copia os elementos restantes de direita[] se houver
	while(j < n2)
	{
		vet[k] = direita[j];
		j++;
		k++;
	}
} //fim função merge









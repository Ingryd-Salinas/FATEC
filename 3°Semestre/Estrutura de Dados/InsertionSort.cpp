/*
	Name: InsertionSort.cpp 
	Author: Ingryd Salinas
	Date: 01/10/25 11:03
	Description: Implementação do método de ordenação
				 Insertion Sort - Inserção por Seleção
*/

//Importação de bibliotecas
#include<stdio.h>
#include<stdlib.h>
#include<time.h>

//Prototipação
void insertionSort(int *, int);

//variáveis globais
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
	
	insertionSort(vet, tam);
	
	puts("\n\nVetor Ordenado pelo Insertion Sort: ");
	for(i = 0; i < tam; i++)
		printf(" %d |", vet[i]);
	
	printf("\n\nQuantidade de trocas: %d", troca);
	printf("\n\nQuantidade de comparacoes: %d", comp);
	
}//fim do programa

//Função para o algoritmo do Insertion Sort
void insertionSort(int *vet, int tam)
{
	//Para calcular o tempo decorrido da função
	clock_t inicio, fim;
	double tempo_decorrido;
	
	//Captura o tempo inicial
	inicio = clock();
	
	int i, j, chave;
	for(i = 1; i< tam; i++)
	{
		//escolhe a nova chave
		chave = vet[i];
		j = i - 1;
		comp++;
		//verifica se a chave é menor e realiza trocas se necessário
		while(j >= 0 && chave < vet[j])
		{
			comp++;
			vet[j+1] = vet[j];
			j--;
			troca++;
		}
		//troca a chave como o próximo número
		vet[j+1] = chave;
	}
	fim = clock();
	tempo_decorrido = ((double)fim - inicio) / CLOCKS_PER_SEC;
	printf("\n\nTempo decorrido: %f", tempo_decorrido);
}//fim da função













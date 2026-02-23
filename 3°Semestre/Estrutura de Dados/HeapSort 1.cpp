/*
	Name:HeapSort.cpp 
	Author: Ingryd Salinas
	Date: 29/10/25 11:32
	Description: Implementação do método de ordenação 
				 Heap Sort
*/

#include<stdio.h>
#include<stdlib.h>
#include<time.h>
//Sessão de prototipação
void heapfy(int *, int, int);
void heapSort(int *, int);
void swap(int *, int *);
void imprimir(int *);
int tam;

main()
{
	//Para calcular o tempo decorrido da função
	clock_t inicio, fim;
	double tempo_decorrido;
	int vet[] = {17, 23, 8, 96, 43, 13, 2, 25, -5, 29};
	//int vet[100000];
	int i;
	tam = sizeof(vet)/sizeof(int);//tamanho do vetor
	//srand(time(NULL)); //Planta a semente
	
	//for(i = 0; i < tam; i++)
	//	vet[i] = rand()%500000; //geração randomica
	
	puts("Vetor Original: ");
	imprimir(vet);
	
	//Captura o tempo inicial
	inicio = clock();
	
	heapSort(vet, tam); //invoke da função
	
	fim = clock();
	tempo_decorrido = ((double)fim - inicio) / CLOCKS_PER_SEC;
	printf("\n\nTempo decorrido: %f", tempo_decorrido);
	
	puts("\n\nVetor Ordenado pelo Heap Sort: ");
	imprimir(vet);
}

//Função que realiza o swap (troca de posições entre os elementos)
void swap(int *a, int *b)
{
	int aux = *a;
	*a = *b;
	*b = aux;
}

/*Função que faz heapfy, ou seja, testa se o Pai é maior que os filhos (MAX HEAP), 
ou se o pai é menor que os filhos (MIN HEAP), 
e invoka o swap para fazer a troca (pais e filhos)*/ 
void heapfy(int vet[], int n, int i)
{
	imprimir(vet);
	int maior = i; //Inicializa o maior como raiz
	int esquerda = 2 * i + 1; //Índice do filho da esquerda
	int direita = 2 * i + 2; //Índice do filho da direita
	
	//Se o filho da esquerda é maior que o pai
	if(esquerda < n && vet[esquerda] > vet[maior])
		maior = esquerda;
		
	//Se o filho da direita é maior que o maior até agora
	if(direita < n && vet[direita] > vet[maior])
		maior = direita;
	
	if(maior != i)
	{
		swap(&vet[i], &vet[maior]); //passa somente um elemento desse vetor, precisa do &
		//Invoka recursivamente heapfy na sub-ávore afetada
		heapfy(vet, n, maior); //passa a estrutura do vet, não precisa do &
	}
}

/*Função principal que monta a árvore e submete à função recursiva Heapfy
para verificar as regras de Max Heap ou Min Heap*/ 
void heapSort(int vet[], int n)
{
	//1. constrói o MAX HEAP
	for(int i = n/2 - 1; i >= 0; i--)
		heapfy(vet, n, i);
	
	//2. troca a raiz com o último elemento e reduz a árvore (heap)
	for(int i = n - 1; i > 0; i--)
	{
		//Move o elemento atual (o maior) para o fim do array
		swap(&vet[0], &vet[i]);
		//Invoka a função heapfy para restaurar a propriedade do heap
		heapfy(vet, i, 0);
	}
}

void imprimir(int vet[])
{
	for(int i = 0; i < tam; i++)
	{
		printf("|%d ", vet[i]);
	}
	puts("");
}





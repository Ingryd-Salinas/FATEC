/*
	Name: BuscaLinear.cpp
	Author: Ingryd Salinas
	Date: 19/11/25 10:30
	Description: Implmentação do algoritmo da Busca Sequencial ou linear
*/
 
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
 
//Sessao de prototipação
void bubbleSort(int *, int);//referencia para o vetor e tamanho do vetor (tamvet)
 
main()
{
	int vet[] = {17, 23, 8, 96, 43, 13, 2, 25, -5, 29};
	int i, tamvet, achou;//variavel bolean
	int elem, comp;
	elem = 0;
	achou = 0; //Assume o valor booleano falso
	
	tamvet = sizeof(vet)/sizeof(int); //tamanho do vetor
	
	puts("Conteudo do vetor: ");
	for(i = 0; i < tamvet; i++)
		printf("%d|", vet[i]);
	
	printf("\n\nElemento a localizar: ");
	scanf("%d", &elem);
	
	//LÓGICA PARA LOCALZAR UM ELEMENTO DENTRO DO VETOR
	i = 0;
	while(i < tamvet)
	{
		comp++;
		
		if(elem == vet[i])
		{
			achou = 1;
			break;
		}			
		
		i++;
	}
	
	if(achou == 1)
		printf("\nElemento encontrado no indice %d: ", i);
	else
		printf("\nElemento não encontrado!! ");
	
	printf("Quantidade de comparações: %d", comp);
	
}//fim do main

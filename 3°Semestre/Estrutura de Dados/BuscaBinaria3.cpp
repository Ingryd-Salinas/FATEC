/*
	Name: BuscaBinaria3.cpp
	Author: Ingryd Salinas
	Date: 19/11/25 10:31
	Description: Programa para demonstrar o método 
				 de localização de elementos chamado
				 Busca Binária ou Logarítima, mostrando 
				 quando há elementos iguais (Alexandre)
*/

#include<stdio.h>

main()
{
	int vet[] = {-5, 2, 8, 13, 17, 23, 23, 23, 23, 25, 29, 43, 96};
	int i, tam, achou, comp, elem, inicio, fim, meio;
	comp = 0;
	elem = 0;
	achou = 0; //Inicia valendo falso
	
	tam = sizeof(vet)/sizeof(int);
	inicio = 0;
	fim = tam - 1;
	meio = 0;
	
	puts("Conteudo do vetor: ");
	for(i = 0; i < tam; i++)
		printf("%d|", vet[i]);
	
	printf("\n\nElemento a localizar: ");
	scanf("%d", &elem);
	
	while(inicio <= fim)
	{
		comp++;
		meio = (inicio + fim)/2;
		if (vet[meio] == elem)
		{
			achou++; //torna verdadeiro
			
			//varre para esquerda
			int esquerda = meio;
			int direita = meio;
			while(vet[--esquerda] == elem)
				printf("\nIndice Esquerda: %d", esquerda);
			printf("\nIndice Meio: %d", meio);
			while(vet[++direita] == elem)
				printf("\nIndice Direita: %d", direita);
				
			break; //sai do laço
		}
		else if(elem < vet[meio])
			fim = meio - 1;
		else
			inicio = meio + 1;
	}
	
	if(achou == 0)
		printf("\nElemento não encontrado!! ");
	
	printf("\nQuantidade de comparacoes: %d", comp);
	
}

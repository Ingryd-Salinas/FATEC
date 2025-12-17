/*
 * Programa: Tomada de Decisão
 * Autor: Ingryd Salinas
 * Data: Criado em 24 de fevereiro de 2025
 * Descrição: Programa criiado para demonstrar a implementaçao de todos os
 *            Loop Infinito com "While"
 */
 
#include <stdio.h>

main()
{
	float nota, soma = 0;
	
	printf("Digite as notas dos 5 alunos: ");
	
	for (int i = 1; i <= 5; i++) 
	{
		scanf("%f", &nota);
		soma += nota;
	}
	printf("Média: %.2f", soma / 5);
}

 /*main()
 {
 	int num = 0;
 	
	 while(1)
 	{
 		printf("\nDigite um numero: ");
 		scanf("%d", &num);
 		
 			if(num == 0)
 				break;
	}
	puts("\n\n====> Fim do programa!!!");
 }//fim do programa*/

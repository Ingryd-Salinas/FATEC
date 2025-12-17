/*
 * Programa: Tomada de Decisão
 * Autor: Ingryd Salinas
 * Data: Criado em 24 de fevereiro de 2025
 * Descrição: Programa criiado para demonstrar a implementaçao de todos os
 *            Laços de Repetição juntamente com Tomada de Decisão
 */
 
 #include <stdio.h>
 
 main()
 {
 	int num, cont, soma;
 	float media;
 	
 	num = 0; cont = 0; soma = 0;
 	media = 0.0;
 	
 	puts("Digite 10 numeros inteiros: ");
 	
 	do
	 {
 		
 		scanf("%d", &num);
 		soma = soma + num;
 		cont = cont + 1;   //ou cont++
 		
	 }while(cont < 10);
	 
	 media = (float) soma/cont; //casting
	 printf("A media dos numeros eh: %.2f", media);
	 
	 
 	
 }//fim do programa

/*
 * Programa: Tomada de Decis�o
 * Autor: Ingryd Salinas
 * Data: Criado em 24 de fevereiro de 2025
 * Descri��o: Programa criiado para demonstrar a implementa�ao de todos os
 *            La�os de Repeti��o juntamente com Tomada de Decis�o
 */
 
 #include<stdio.h>
 
 main()
{
	int num, i;
	num = 0;
	
	printf("Digite um numero para calcular a tabuada: ");
	scanf("%d", &num);
	
	//for(inicializa��o; teste condicional; itera��o/incremento)
	for(i= 0; i <= 10; i++)
		printf("%d x %d = %d\n", num, i, num*i);
		
	
}//fim do programa

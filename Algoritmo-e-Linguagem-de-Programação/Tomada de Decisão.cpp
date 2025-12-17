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
	int peso = 0;
	float altura = 0.0;
	float imc = 0.0;
	int cont = 0;
	
	puts("Calculo do IMC para as pessoas");
	
	while(cont < 3)
	{
		printf("%d Pessoa:\n", cont+1);
		printf("Peso: ");
		scanf("%d", &peso);
		printf("Altura: ");
		scanf("%f", &altura);
		imc = peso / (altura * altura);
		printf("Seu IMC eh: %.4f\n\n", imc);
		
		if(imc < 16)
			puts("Magreza grave!");
			else if(imc < 17)
				puts("Magreza moderada!");
				else if(imc < 18.5)
					puts("Magreza leve");
					else if(imc < 25)
						puts("Peso saudavel - Normal");
						else if(imc < 30)
							puts("Sobrepeso");
							else if(imc <35)
								puts("Obesidade grau I - Leve");
								else if(imc < 40)
									puts("Obesidade grau II - Severa");
								else
									puts("Obesidade grau III - Morbida");
		cont++;
	}
	
}//fim do programa

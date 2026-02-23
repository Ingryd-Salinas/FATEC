/*
	Name: TabelaASCII.cpp
	Author: Ingryd Salinas
	Date: 07/04/25 10:52
	Description: Programa para exibir a Tabela ASCII
*/

#include <stdio.h>

main()
{
	for(int i = 0; i < 128; i++)
		printf("\n%d - %c", i, i);	

} //fim do programa

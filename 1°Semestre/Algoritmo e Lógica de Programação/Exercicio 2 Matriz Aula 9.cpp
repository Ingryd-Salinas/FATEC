#include<stdio.h>
#include<string.h>
int main()
{
	int dados [5][4], l, c;
	
	for(l=0; l<5; l++)
	{
		c=0;
		printf("Entre com o codigo do funcionario: ", l+1);
		scanf("%d", &dados[l][c])
			
		printf("Entre com os dias trabalhados: ");
		scanf("%d", &dados[l][c+1]);
			
		printf("Entre com as faltas: ");
		scanf("%d", &dados[l][c+2]);
			
		dados [l][3] = dados[l][1]-dados[l][2];
	}
	//saída
	for(l=0; l<5; l++)
	{
		printf("\nFuncionario %d dos %d dias trabalhou %d dias.", dados[l][0], dados[l][1], dados[l][3]);
	}
}

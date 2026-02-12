#include <stdio.h>

int main()
{
	int tabini, tabfim, i;
	
	printf("Entre com a tabuada inicial: ");
	scanf("%d", &tabini);
	
	printf("Entre com a tabuada final: ");
	scanf("%d", &tabfim);
	
	for(; tabini <= tabfim; tabini++)
	{
		for(i=1; i<=10; i++)
		{
			printf("%d X %d = %d\n", tabini, i, tabini*i);
		}
		printf("\n");
	}
}


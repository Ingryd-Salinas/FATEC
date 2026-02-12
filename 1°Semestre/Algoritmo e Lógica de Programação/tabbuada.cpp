#include <stdio.h>

int main()
{
	int valor, i;
	printf("Digite o numero da tabuada: ");
	scanf("%d", &valor);
	
	for(i=1; i<=10;i++)
	{
		printf("%d X %d = %d \r\n", i, valor, i*valor);
	}
	return 0;
}


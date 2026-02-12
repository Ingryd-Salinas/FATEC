#include<stdio.h>

int main()
{
	float divisao[10][3];
	int x;
	
	for (x=1; x<=10; x++)
	{
		divisao [x-1][0] = x/(float)3;
		divisao [x-1][1] = x/(float)5;
		divisao [x-1][2] = x/(float)7;
	}
	
	for (x=0; x<=10; x++)
	{
		printf("%d divisao 3 = %f dividido por 5 = %f dividido por 7 = %f\n",
				x+1, divisao[x][0], divisao[x][1], divisao[x][2]);
	}
}

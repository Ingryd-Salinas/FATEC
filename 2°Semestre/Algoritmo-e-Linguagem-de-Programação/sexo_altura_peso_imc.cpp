#include<stdio.h>
#include<string.h>

main()
{
	int sexo = 0;
	float altura, peso, imc;
	altura = peso = imc = 0.0;
	
	printf("Digite seu peso (kg) e altura (metros): ");
	scanf("%f", &peso); scanf("%f", &altura);
	
	printf("Digite 1 se voce for homem, ou 2 se voce for mulher: ");
	scanf("%d", &sexo);
	
	if(sexo == 2)
	{
		if(altura < 1.50)
		
			printf("Você e uma mulher de baixa estatura!");
		
		else if(altura == 1.50 || altura < 1.66)
		
			printf("Você e uma mulher de media estatura!");
		else
			printf("Você e uma mulher alta!");
	}
	
	if(sexo == 1)
	{
		if(altura < 1.60)
		
			printf("Você e um homem de baixa estatura!");
	
		else if(altura == 1.60 || altura < 1.76)
		
			printf("Você e um homem de media estatura!");
		else
			printf("Você e um homem alto!");
	}
	
	imc = peso/(altura * altura);
	printf("\nO seu IMC e: %.2f", imc);
}//fim do programa

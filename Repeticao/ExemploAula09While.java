package Repeticao;

import java.util.Scanner;

public class ExemploAula09While {

	public static void main(String[] args) {
	int idade;
	Scanner entrada = new Scanner(System.in);
	
	System.out.printf("Entre com a sua idade: ");
	idade = entrada.nextInt();
	
	while(idade>=1)
	{
		System.out.printf("Sua idade: %d", idade);
		
		if(idade>=18)
		{
			System.out.printf("\nVoc� � de maior");
		}
		else 
		{
			System.out.printf("\nVoc� � de menor");
		}
		System.out.printf("\nEntre com a sua idade: ");
		idade = entrada.nextInt();
	}

	}

}

/*
 6-	Escrever um programa que receba vários números inteiros no teclado. 
 E no final imprimir a média dos números múltiplos de 3.
 Para sair digitar 0(zero).(DO...WHILE)
 */


package Repeticao;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		double num, media=0, mult=0, soma=0;
		Scanner ler = new Scanner(System.in);
		
		do
		{
			System.out.println("Digite um número:");
			num = ler.nextDouble();
			
			if(num%3==0)
			{
				mult++;
				
				soma = num+soma;
								
			}
			media = soma/(mult-1);
		}while(num!=0);
		System.out.println("A média dos números digitados que são múltiplos de 3 é de: "+media);

	}

}

/*
 6-	Escrever um programa que receba v�rios n�meros inteiros no teclado. 
 E no final imprimir a m�dia dos n�meros m�ltiplos de 3.
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
			System.out.println("Digite um n�mero:");
			num = ler.nextDouble();
			
			if(num%3==0)
			{
				mult++;
				
				soma = num+soma;
								
			}
			media = soma/(mult-1);
		}while(num!=0);
		System.out.println("A m�dia dos n�meros digitados que s�o m�ltiplos de 3 � de: "+media);

	}

}

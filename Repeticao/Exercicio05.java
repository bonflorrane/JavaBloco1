/*
 *5-	Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
 * No final, mostre a soma dos n�meros digitados.(DO...WHILE)
 */



package Repeticao;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		double num, soma=0;
		Scanner ler = new Scanner(System.in);
		
		
		do 
		{
			System.out.println("Digite um n�mero:");
			num = ler.nextDouble();
			soma = num + soma;
			
		}while(num!=0);
		
		System.out.println("A soma dos n�meros digitados � de: "+soma);
	}
	

}

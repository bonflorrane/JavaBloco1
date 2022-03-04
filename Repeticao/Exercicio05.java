/*
 *5-	Crie um programa que leia um número do teclado até que encontre um número igual a zero.
 * No final, mostre a soma dos números digitados.(DO...WHILE)
 */



package Repeticao;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		double num, soma=0;
		Scanner ler = new Scanner(System.in);
		
		
		do 
		{
			System.out.println("Digite um número:");
			num = ler.nextDouble();
			soma = num + soma;
			
		}while(num!=0);
		
		System.out.println("A soma dos números digitados é de: "+soma);
	}
	

}

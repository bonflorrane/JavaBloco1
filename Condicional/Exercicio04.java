/*
 4-	Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
 Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
 */

package Condicional;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double num, raiz;
		
		System.out.print("Digite um número: ");
		num = ler.nextDouble();
		
		if(num%2==0)
		{
			System.out.print("O número digitado é par.");
			raiz = Math.sqrt(num);
			System.out.print("E sua raiz quadrada é de: "+raiz);
			
		}
		else
		{
			System.out.print("O número digitado é ímpar.");
			raiz = Math.pow(num, 2);
			System.out.print("E este número ao quadrado é de: "+raiz);
		}
		
		

	}

}

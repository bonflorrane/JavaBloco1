/*
 4-	Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. 
 Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
 */

package Condicional;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double num, raiz;
		
		System.out.print("Digite um n�mero: ");
		num = ler.nextDouble();
		
		if(num%2==0)
		{
			System.out.print("O n�mero digitado � par.");
			raiz = Math.sqrt(num);
			System.out.print("E sua raiz quadrada � de: "+raiz);
			
		}
		else
		{
			System.out.print("O n�mero digitado � �mpar.");
			raiz = Math.pow(num, 2);
			System.out.print("E este n�mero ao quadrado � de: "+raiz);
		}
		
		

	}

}

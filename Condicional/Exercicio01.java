//1-	Faça um programa que receba três inteiros e diga qual deles é o maior.

package Condicional;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int x, y, z, num;
		
		System.out.print("\nDigite o primeiro número inteiro: ");
		x = ler.nextInt();
		System.out.print("\nDigite o segundo número inteiro: ");
		y = ler.nextInt();
		System.out.print("\nDigite o terceiro número inteiro: ");
		z = ler.nextInt();
		
		if(x>=y && x>=z)
		{
			System.out.print("\nO maior número digitado é: "+ x);
		}
		else if(y>=x && y>=z)
		{
			System.out.print("\nO maior número digitado é: "+ y);
		}
		else
		{
			System.out.print("\nO maior número digitado é: "+ z);
		}

	}

}

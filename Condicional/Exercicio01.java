//1-	Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

package Condicional;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int x, y, z, num;
		
		System.out.print("\nDigite o primeiro n�mero inteiro: ");
		x = ler.nextInt();
		System.out.print("\nDigite o segundo n�mero inteiro: ");
		y = ler.nextInt();
		System.out.print("\nDigite o terceiro n�mero inteiro: ");
		z = ler.nextInt();
		
		if(x>=y && x>=z)
		{
			System.out.print("\nO maior n�mero digitado �: "+ x);
		}
		else if(y>=x && y>=z)
		{
			System.out.print("\nO maior n�mero digitado �: "+ y);
		}
		else
		{
			System.out.print("\nO maior n�mero digitado �: "+ z);
		}

	}

}

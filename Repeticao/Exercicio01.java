/*
 1-	Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
 */
package Repeticao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args)
	{
		double c;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Este programa mostra todos os números de 1000 a 1999 que divididos por 11 o resto é igual a 5");
		
		for(c=1000; c<=1999; c++)
		{
			if(c%11==5)
			{
				System.out.println(" \n"+c);
			}
		}
	}

}

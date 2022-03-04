/*
 2-	Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */


package Repeticao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		double num = 0;
		int par = 0, impar = 0, c;
		Scanner ler = new Scanner(System.in);
		
		for(c=1; c<=10; c++)
		{
			System.out.print(c);
			System.out.print("Digite um número: ");
			num = ler.nextDouble();
		
			
			if(num%2==0)
			{
				par++;
							
			}
			else if(num%2!=0)
			{
				impar++;
			}
	
		}
		System.out.print("São "+par+" números pares");
		System.out.print("São "+impar+" números ímpares");		
	}

}



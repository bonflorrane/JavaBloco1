/*
 2-	Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
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
			System.out.print("Digite um n�mero: ");
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
		System.out.print("S�o "+par+" n�meros pares");
		System.out.print("S�o "+impar+" n�meros �mpares");		
	}

}



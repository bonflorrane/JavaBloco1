/*2.	Um dado � lan�ado 10 vezes e o valor correspondente � anotado.
Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor.
A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize
e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.
*/


package VetorMatriz;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		int lancamento[] = new int[10];
		int vetor[] = new int[10];
		int somatotal=0, maior=0, igual=1, outroContador=1;
		double mediatotal;
		
		Scanner ler= new Scanner(System.in);
		
		for(int c=0; c<10; c++)
		{
			System.out.print(outroContador++);
			System.out.println("Digite o valor do lan�amento do dado: ");
			lancamento[c] = ler.nextInt();
			somatotal = lancamento[c]+somatotal;
			
		}
		for(int c=0; c<10; c++)
		{
			System.out.print("["+lancamento[c]+ "]");		
			
			if(lancamento[c]>maior)
			{
				maior = lancamento[c];
			}
			else if (maior==lancamento[c])
			{
				igual++;
			}
				
		}
		mediatotal = somatotal/10;
		System.out.println("\nA m�dia de lan�amento � de: "+mediatotal);
		System.out.println("O maior valor do lan�amento � de: "+maior);
		System.out.println("O maior valor de lan�amento � repetido: "+igual+" vezes");
		
		
	}

}

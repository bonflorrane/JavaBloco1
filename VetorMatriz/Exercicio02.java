/*2.	Um dado é lançado 10 vezes e o valor correspondente é anotado.
Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
A seguir determine e imprima a média aritmética dos lançamentos, contabilize
e apresente também quantas foram as ocorrências da maior pontuação.
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
			System.out.println("Digite o valor do lançamento do dado: ");
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
		System.out.println("\nA média de lançamento é de: "+mediatotal);
		System.out.println("O maior valor do lançamento é de: "+maior);
		System.out.println("O maior valor de lançamento é repetido: "+igual+" vezes");
		
		
	}

}

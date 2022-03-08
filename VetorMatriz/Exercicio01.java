/*1.	Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade
e o escreva em seguida. Encontre após a maior pontuação e a apresente. 
*/


package VetorMatriz;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		double[] pontuacao = new double[5];
		double maior=0.0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int c=0; c<5; c++)
		{
			System.out.println("Digite o valor da pontuação da atividade");
			pontuacao[c] = ler.nextDouble();
			
			
		}
		for(int c=0; c<5; c++)
		{
			System.out.print("["+pontuacao[c]+ "]");		
			
			if(pontuacao[c]>maior)
			{
				maior = pontuacao[c];
			}
			
		}
		System.out.println("\nO maior valor é: ["+maior+ "]");
	
		
		

	}

}


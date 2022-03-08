/*4.	Crie um programa que receba valores do usuário para preencher uma matriz 3X3,
e em seguida, exiba a soma dos valores dela e
a soma dos valores da primeira diagonal, ou seja, diagonal principal.
*/

package VetorMatriz;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		int[][] M1 = new int[3][3];
		int somaMtotal=0, somaMD=0;
		
		Scanner entrada = new Scanner(System.in);
		
		for(int linha=0; linha<3; linha++)
		{
			for(int coluna=0; coluna<3; coluna++)
			{
				
				System.out.printf("Digite a Matriz M1[%d][%d]",linha+1,coluna+1);
				M1[linha][coluna]=entrada.nextInt();
				somaMtotal = M1[linha][coluna] + somaMtotal;
				
				if(linha==coluna)
				{
					somaMD = M1[linha][coluna] + somaMD;
				}
			}
		}
		for(int linha=0; linha<3; linha++)
		{
			for(int coluna=0; coluna<3; coluna++)
			{
				System.out.print("["+M1[linha][coluna]+ "]");
			}
			System.out.println();
		}
		
		System.out.println("\nA soma total dos valores da matriz é de: "+somaMtotal);
		System.out.println("\nA soma dos valores da diagonal principal é de: " + somaMD);

	}

}





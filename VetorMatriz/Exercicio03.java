/*
 3.	Escreve um programa que l� duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos ser�o as somas dos elementos de mesma posi��o das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos ser�o as diferen�as dos elementos de mesma posi��o das matrizes N1 e N2.

 */

package VetorMatriz;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		int[][] N1 = new int[4][6];
		int[][] N2 = new int[4][6];
		int[][] M1 = new int[4][6];
		int[][] M2 = new int[4][6];
		int outroContador=0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Matriz N1[4][6]\n");
		for(int linha=0; linha<4; linha++)
		{
			for(int coluna=0; coluna<6; coluna++)
			{
				
				System.out.printf("Digite a Matriz N1[%d][%d]",linha+1,coluna+1);
				N1[linha][coluna]=entrada.nextInt();
			}
		}
		
		for(int linha=0; linha<4; linha++)
		{
			for(int coluna=0; coluna<6; coluna++)
			{
				System.out.print("["+N1[linha][coluna]+ "]");
			}
			System.out.println();
		}
		
		System.out.println("Matriz N2[4][6]\n");
		for(int linha=0; linha<4; linha++)
		{
			for(int coluna=0; coluna<6; coluna++)
			{
				
				System.out.printf("Digite a Matriz N2[%d][%d]",linha+1,coluna+1);
				N2[linha][coluna]=entrada.nextInt();
			}
		}
		
		for(int linha=0; linha<4; linha++)
		{
			for(int coluna=0; coluna<6; coluna++)
			{
				System.out.print("["+N2[linha][coluna]+ "]");
			}
			System.out.println();
		}
		
		
		for(int linha=0; linha<4; linha++)
		{
			for(int coluna=0; coluna<6; coluna++)
			{
				M1[linha][coluna]= N1[linha][coluna]+N2[linha][coluna];
				M2[linha][coluna]= N1[linha][coluna]-N2[linha][coluna];
				
			}
		}
		System.out.println("\nA soma das Matrizes: ");
		for(int linha=0; linha<4; linha++)
		{
			for(int coluna=0; coluna<6; coluna++)
			{
				System.out.print("["+M1[linha][coluna]+ "]");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("\nA subtra��o das Matrizes: ");
		for(int linha=0; linha<4; linha++)
		{
			for(int coluna=0; coluna<6; coluna++)
			{
				System.out.print("["+M2[linha][coluna]+ "]");
			}
			System.out.println();
		}
		

	}

}







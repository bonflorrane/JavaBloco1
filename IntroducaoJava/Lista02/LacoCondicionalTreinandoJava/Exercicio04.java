package LacoCondicionalTreinandoJava;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		int N;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um n�mero inteiro: ");
		N = ler.nextInt();
		
		if(N%2==0 && N>=0)
		{
			System.out.print("O n�mero inserido � par e positivo.");
		}
		else if (N%2==0 && N<0)
		{
			System.out.print("O n�mero inserido � par e negativo.");
		}
		else if (N%2!=0 && N>0)
		{
			System.out.print("O n�mero inserido � �mpar e positivo.");
		}
		else
		{
			System.out.print("O n�mero inserido � �mpar e negativo.");
		}

	}

}

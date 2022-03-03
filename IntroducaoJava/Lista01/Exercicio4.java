package IntroducaoJava;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args)
	{
		int A, B, C;
		double D, R, S, valorAB, valorBC;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um valor inteiro e positivo para A: ");
		A = ler.nextInt();
		System.out.print("Digite um valor inteiro e positivo para B: ");
		B = ler.nextInt();
		System.out.print("Digite um valor inteiro e positivo para C: ");
		C = ler.nextInt();
		
		valorAB = A + B;
		R = Math.pow(valorAB, 2);
		valorBC = B + C;
		S = Math.pow(valorBC, 2);
		D = (R+S)/2;
		
		System.out.print("\nO resultado de R é igual a: "+R);
		System.out.print("\nO resultado de S é igual a: "+S);
		System.out.print("\nO resultado de D é igual a: "+D);

	}

}

package LacoCondicionalTreinandoJava;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
	double N;
	Scanner ler = new Scanner(System.in);
	
	System.out.print("Digite um n�mero: ");
	N = ler.nextDouble();
	
	if(N>100)
	{
		System.out.print("O n�mero digitado �: "+N);
	}
	else
	{
		System.out.print("O valor atribu�do ao n�mero � zero, N = 0");
	}
	

	}

}

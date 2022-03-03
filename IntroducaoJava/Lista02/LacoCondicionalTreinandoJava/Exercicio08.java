package LacoCondicionalTreinandoJava;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
	double N;
	Scanner ler = new Scanner(System.in);
	
	System.out.print("Digite um número: ");
	N = ler.nextDouble();
	
	if(N>100)
	{
		System.out.print("O número digitado é: "+N);
	}
	else
	{
		System.out.print("O valor atribuído ao número é zero, N = 0");
	}
	

	}

}

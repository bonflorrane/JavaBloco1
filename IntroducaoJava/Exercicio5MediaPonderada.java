package IntroducaoJava;

import java.util.Scanner;

public class Exercicio5MediaPonderada {

	public static void main(String[] args) 
	{
		double nota1, nota2, nota3, mediaFinal;
		Scanner ler = new Scanner (System.in);
		
		System.out.print("Digite sua primeira nota: ");
		nota1 = ler.nextDouble();
		System.out.print("Digite sua segunda nota: ");
		nota2 = ler.nextDouble();
		System.out.print("Digite sua terceita nota: ");
		nota3 = ler.nextDouble();
		
		mediaFinal = ((nota1*2) + (nota2*3) + (nota3*5))/(2+3+5);
		
		System.out.println("Sua média ponderada final é igual a: "+mediaFinal);

	}

}

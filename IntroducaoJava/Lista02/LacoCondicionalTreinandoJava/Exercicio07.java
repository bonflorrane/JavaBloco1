package LacoCondicionalTreinandoJava;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		double b, h, area;
		Scanner ler = new Scanner(System.in);
		
		
		System.out.print("Digite o valor da base do triângulo: ");
		b = ler.nextDouble();
		System.out.print("Digite o valor da altura do triângulo: ");
		h = ler.nextDouble();
		
		if(b>0 && h>0)
		{
			area = (b*h)/2;
			System.out.print("\nA área do triângulo é: "+area);
		}
		else
		{
			System.out.print("\nValores digitados inválidos");
		}
		

	}

}

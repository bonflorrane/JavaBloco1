package IntroducaoJava;

import java.util.Scanner;

public class Exercicio6Distancia {

	public static void main(String[] args)
	{
		double x1, x2, y1, y2, valorx2x1, valory2y1, A, B, soma, d;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Definindo o valor de P1(x1,y1)");
		System.out.print("Digite o valor de x1: ");
		x1 = ler.nextDouble();
		System.out.print("Digite o valor de y1: ");
		y1 = ler.nextDouble();
		
		System.out.println("Definindo o valor de P2(x2,y2)");
		System.out.print("Digite o valor de x2: ");
		x2 = ler.nextDouble();
		System.out.print("Digite o valor de y2: ");
		y2 = ler.nextDouble();
		
		valorx2x1 = x2 - x1;
		A = Math.pow(valorx2x1, 2);
		valory2y1 = y2 - y1;
		B = Math.pow(valory2y1, 2);
		soma = A + B;
		d = Math.pow(soma, 2);
		
		System.out.print("A distância entre os pontos é de: "+d);
		
		
		
		

	}

}

package LacoCondicionalTreinandoJava;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		double x, y, z, w, x2, y2, z2,w2;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		x = ler.nextDouble();
		System.out.print("Digite o segundo número: ");
		y = ler.nextDouble();
		System.out.print("Digite o terceiro número: ");
		z = ler.nextDouble();
		System.out.print("Digite o quarto número: ");
		w = ler.nextDouble();
		
		x2 = Math.pow(x, 2);
		y2 = Math.pow(y, 2);
		z2 = Math.pow(z, 2);
		w2 = Math.pow(w, 2);
		
		if(z2>=1000)
		{
			System.out.println("O valor do terceito número ao quadrado é: "+z2);
		}
		else
		{
			System.out.print("Os valores digitados são: \n"+x+"\n"+y+"\n"+z+"\n"+w);
			System.out.print("\nO quadrado de cada valor está representado por: \n"+x2+" \n"+y2+" \n"+z2+" \n"+w2);
		}

	}

}

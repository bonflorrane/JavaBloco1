package LacoCondicionalTreinandoJava;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		double x, y, z, w, x2, y2, z2,w2;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		x = ler.nextDouble();
		System.out.print("Digite o segundo n�mero: ");
		y = ler.nextDouble();
		System.out.print("Digite o terceiro n�mero: ");
		z = ler.nextDouble();
		System.out.print("Digite o quarto n�mero: ");
		w = ler.nextDouble();
		
		x2 = Math.pow(x, 2);
		y2 = Math.pow(y, 2);
		z2 = Math.pow(z, 2);
		w2 = Math.pow(w, 2);
		
		if(z2>=1000)
		{
			System.out.println("O valor do terceito n�mero ao quadrado �: "+z2);
		}
		else
		{
			System.out.print("Os valores digitados s�o: \n"+x+"\n"+y+"\n"+z+"\n"+w);
			System.out.print("\nO quadrado de cada valor est� representado por: \n"+x2+" \n"+y2+" \n"+z2+" \n"+w2);
		}

	}

}

package LacoCondicionalTreinandoJava;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) 
	{
		double P, E, M;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Entre com o valor do peso de tomate em kg: ");
		P = ler.nextDouble();
		
		if(P>50)
		{
			E = P - 50;
			M = 4*E;
			System.out.print("\nO valor excedente do peso de tomate � de: "+E+ " Kg");
			System.out.print("\nPortanto, a multa que voc� dever� pagar � de: "+M);
		}
		else
		{
			E = 0;
			M = 0;
			System.out.print("\nO valor excedente do peso de tomate � de: "+E);
			System.out.print("\nPortanto, a multa que voc� dever� pagar � de: "+M);
		}

	}

}

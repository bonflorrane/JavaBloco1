package IntroducaoJava;

import java.util.Scanner;

public class Exercicio2Idade {

	public static void main(String[] args) 
	{
		double dias, meses, anos, var1, var2;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Expresse quantos anos você tem em dias: ");
		dias = ler.nextDouble();
		
		anos = dias/365;
		var1=dias%365;
		meses = var1/30;
		var2=var1%30;
		
		System.out.print("\nA sua idade expressa em anos é: \n"+anos+"anos\n"+meses+"meses\n"+dias+"dias\n");
		
		

	}

}

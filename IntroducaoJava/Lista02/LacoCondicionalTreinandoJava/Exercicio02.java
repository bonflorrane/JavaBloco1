package LacoCondicionalTreinandoJava;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		double C, N, E, Stotal, Sexc, Hexc;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o c�digo de identifica��o do(a) funcion�rio(a): ");
		C = ler.nextDouble();
		System.out.print("Digite o total de horas trabalhadas pelo(a) funcion�rio(a): ");
		N = ler.nextDouble();
		
		if(N>50)
		{
			E = N-50;
			Sexc = E*20;
			Stotal = 50*10 + Sexc;
			System.out.print("O sal�rio total � de:  "+Stotal+" e o sal�rio excedente � de: "+Sexc);
			
		}
		else
		{
			E = 0;
			Sexc = 0;
			Stotal = 0;
			System.out.print("O sal�rio total � de:  "+Stotal+" e o sal�rio excedente � de: "+Sexc);
			
		}
		

	}

}

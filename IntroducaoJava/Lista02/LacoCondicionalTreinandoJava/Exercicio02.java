package LacoCondicionalTreinandoJava;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		double C, N, E, Stotal, Sexc, Hexc;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o código de identificação do(a) funcionário(a): ");
		C = ler.nextDouble();
		System.out.print("Digite o total de horas trabalhadas pelo(a) funcionário(a): ");
		N = ler.nextDouble();
		
		if(N>50)
		{
			E = N-50;
			Sexc = E*20;
			Stotal = 50*10 + Sexc;
			System.out.print("O salário total é de:  "+Stotal+" e o salário excedente é de: "+Sexc);
			
		}
		else
		{
			E = 0;
			Sexc = 0;
			Stotal = 0;
			System.out.print("O salário total é de:  "+Stotal+" e o salário excedente é de: "+Sexc);
			
		}
		

	}

}

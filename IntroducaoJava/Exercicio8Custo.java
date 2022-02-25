package IntroducaoJava;

import java.util.Scanner;

public class Exercicio8Custo {

	public static void main(String[] args)
	{
		double custoFabrica, custoDistribuidor, custoImpostos, custoConsumidor;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o custo de fábrica do carro novo: ");
		custoFabrica = ler.nextDouble();
		
		custoDistribuidor = custoFabrica * 0.28;
		custoImpostos = custoFabrica * 0.45;
		custoConsumidor = custoFabrica + custoDistribuidor + custoImpostos;
		
		System.out.println("O custo do carro novo repassado ao consumidor é de: "+custoConsumidor);
		
		

	}

}

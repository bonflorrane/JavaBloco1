package IntroducaoJava;

import java.util.Scanner;

public class Exemplo2EntradaSaida {

	public static void main(String[] args)
	{
		int a, b, soma;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		a = ler.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		b = ler.nextInt();
		
		soma = a + b;
		
		System.out.println("A soma resultante dos n�mero � de: " +soma);
	}

}

package IntroducaoJava;

import java.util.Scanner;

public class Exercicio3Tempo {

	public static void main(String[] args) 
	{
		int eventoFabrica, horas, minutos, segundos, resto;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Escreva o tempo de duração do evento da fábrica em segundos: ");
		eventoFabrica = ler.nextInt();
		
		horas = eventoFabrica/3600;
		resto = eventoFabrica%3600;
		minutos = resto/60;
		segundos = resto%60;
		
		System.out.print("\nO tempo de duração do ecento da fábrica é de:\n"+horas+" horas\n"+minutos+" minutos\n"+segundos+" segundos\n");
		
		
		
	}

}

package IntroducaoJava;

import java.util.Scanner;

public class Exercicio3Tempo {

	public static void main(String[] args) 
	{
		int eventoFabrica, horas, minutos, segundos, resto;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Escreva o tempo de dura��o do evento da f�brica em segundos: ");
		eventoFabrica = ler.nextInt();
		
		horas = eventoFabrica/3600;
		resto = eventoFabrica%3600;
		minutos = resto/60;
		segundos = resto%60;
		
		System.out.print("\nO tempo de dura��o do ecento da f�brica � de:\n"+horas+" horas\n"+minutos+" minutos\n"+segundos+" segundos\n");
		
		
		
	}

}

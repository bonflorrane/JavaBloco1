package VetorMatriz;

import java.util.Scanner;

public class ExemploAula11Vetor {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int[] arrayUm= {12,3,5,68,9,6,73,44,456,65,321};
		int[] arrayDois= {43,42,4,8,55,21,2,45};
		
		System.out.println("\nTamanho do ArrayUm = "+arrayUm.length);
		System.out.println("\nTamanho do ArrayDois = "+arrayDois.length);
		
	//utilização do for-each
		
		String[] cars = {"Volvo", " ", "Ford", "Mazda"};
		for(String i : cars) //percorre o array do início ao final
		{
			System.out.println(i);
		}
		
		
		//populando um array
		
		float[] nota = new float[5];
		for(int i =0; i<5;i++)
		{
			System.out.println("Entre com uma nota: ");
			nota[i] = entrada.nextFloat();
		}
		
		//apresentando um array
		for(int i=0; i<5;i++)
		{
			System.out.println("Nota "+nota[i]);
		}

	}

}

package LacoCondicionalTreinandoJava;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		double ind;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o índice de poluição: ");
		ind = ler.nextDouble();
		
		if(ind>=0.3 && ind<0.4)
		{
			System.out.print("\nIndústrias do grupo 1 devem suspender suas atividades");
				
				
		}
		else if(ind>=0.4 && ind<0.5)
		{
			System.out.print("\nIndústrias do grupo 1 e 2 devem suspender suas atividades");
		}
		else if (ind>=0.5)
		{
			System.out.print("\nTodos os grupos devem suspender suas atividades");
		}
		else
		{
			System.out.print("\n Nenhuma ocorrência registrada no momento todos os grupos podem atuar normalmente");
							
		}
	}

}


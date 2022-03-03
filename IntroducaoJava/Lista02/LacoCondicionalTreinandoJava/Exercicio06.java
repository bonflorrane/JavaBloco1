package LacoCondicionalTreinandoJava;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		int idade;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a idade do nadador: ");
		idade = ler.nextInt();
		
		if(idade>=5 && idade<=7)
		{
			System.out.print("O nadador pertence a categoria: Infantil A ");
		}
		else if(idade>=8 && idade<=11)
		{
			System.out.print("O nadador pertence a categoria: Infantil B ");
		}
		else if(idade>=12 && idade<=13)
		{
			System.out.print("O nadador pertence a categoria: Juvenil A ");
		}
		else if(idade>=14 && idade<=17)
		{
			System.out.print("O nadador pertence a categoria: Juvenil B ");
		}
		else if(idade>=18)
		{
			System.out.print("O nadador pertence a categoria: Adultos ");
		}
		else
		{
			System.out.print("Não há categoria para a idade deste nadador");
		}

	}

}

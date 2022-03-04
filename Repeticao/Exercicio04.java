/*
 4-	Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos
 de uma região. 
   Para tanto, a cada uma das pessoas era perguntado:
  idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções (1, se a pessoa era calma; 2, 
  se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema que permita
  ler os dados de 150 pessoas, calcule e mostre: (WHILE)
•	o número de pessoas calmas; 
•	o número de mulheres nervosas; 
•	o número de homens agressivos; 
•	o número de outros calmos;
•	o número de pessoas nervosas com mais de 40 anos; 
•	o número de pessoas calmas com menos de 18 anos.

 */

package Repeticao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		int idade = 0, sexo, opcao, p = 1,n=0, f=0, m=0, o=0, c=0, q=0, d=0;
		Scanner ler = new Scanner(System.in);
		
		
		while(n<150)
		{
			
			for(p=1;p<=150; p++)
			{
				System.out.print(p);
				System.out.print("Digite sua idade: ");
				idade = ler.nextInt();
				n++;
			    
				System.out.println("Qual gênero você se identifica: \nDigite 1 - feminino \nDigite 2 - masculino \nDigite 3 - outros");
			    sexo = ler.nextInt();
			    System.out.println("Qual das opções você se identifica: \nDigite 1 - calmo \nDigite 2 - nervoso \nDigite 3 - agressivo");
			    opcao = ler.nextInt();
				
				if(opcao==1)
				{
					c++;
				}
				else if(sexo==1 && opcao == 2)
				{
					f++;
				}
				else if(sexo==2 && opcao ==3)
				{
					m++;
					
				}
				else if(sexo==3 && opcao==1)
				{
					o++;
				}
				else if(sexo==1 || sexo == 2 || sexo == 3 && opcao ==2 && idade>40)
				{
					q++;
				}
				else if(sexo==1 || sexo == 2 || sexo == 3 && opcao ==1 && idade<18)
				{
					d++;
				}
		   }
			System.out.print("\nO número de pessoas calmas é de:"+c);
			System.out.print("\nO número de mulheres nervosas é de:"+f);
			System.out.print("\nO número de homens agressivos é de:"+m);
			System.out.print("\nO número de outros calmos é de:"+o);
			System.out.print("\nO número de pessoas nervosas com mais de 40 anos é de:"+q);
			System.out.print("\nO número de pessoas calmas com menos de 18 anos é de:"+d);
		
	 }
}
}

	


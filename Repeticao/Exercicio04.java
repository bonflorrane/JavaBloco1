/*
 4-	Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos
 de uma regi�o. 
   Para tanto, a cada uma das pessoas era perguntado:
  idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es (1, se a pessoa era calma; 2, 
  se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema que permita
  ler os dados de 150 pessoas, calcule e mostre: (WHILE)
�	o n�mero de pessoas calmas; 
�	o n�mero de mulheres nervosas; 
�	o n�mero de homens agressivos; 
�	o n�mero de outros calmos;
�	o n�mero de pessoas nervosas com mais de 40 anos; 
�	o n�mero de pessoas calmas com menos de 18 anos.

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
			    
				System.out.println("Qual g�nero voc� se identifica: \nDigite 1 - feminino \nDigite 2 - masculino \nDigite 3 - outros");
			    sexo = ler.nextInt();
			    System.out.println("Qual das op��es voc� se identifica: \nDigite 1 - calmo \nDigite 2 - nervoso \nDigite 3 - agressivo");
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
			System.out.print("\nO n�mero de pessoas calmas � de:"+c);
			System.out.print("\nO n�mero de mulheres nervosas � de:"+f);
			System.out.print("\nO n�mero de homens agressivos � de:"+m);
			System.out.print("\nO n�mero de outros calmos � de:"+o);
			System.out.print("\nO n�mero de pessoas nervosas com mais de 40 anos � de:"+q);
			System.out.print("\nO n�mero de pessoas calmas com menos de 18 anos � de:"+d);
		
	 }
}
}

	


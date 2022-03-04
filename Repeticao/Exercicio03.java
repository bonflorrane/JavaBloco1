/*
 3-	Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
 Total de pessoas com mais de 50 anos. 
 O programa termina quando idade for =-99. (WHILE)
 */

package Repeticao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		int idade = 0, c=0, v=0, p=0;
		Scanner ler = new Scanner(System.in);
		
		
		while(idade!=-99)
		{
			    System.out.println("Digite uma idade: ");
				idade = ler.nextInt();
				
				if(idade<21 && idade>0)
				{
					v++;
					
				}
					
				else if (idade>50)
				{
					c++;
					
				}
				
		   }
		   System.out.println("Pessoas com menos de 21 anos: "+v);
		   System.out.println("Pessoas com mais de 50 anos: "+c);
		}
		
}



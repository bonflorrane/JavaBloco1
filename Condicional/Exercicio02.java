//2-	Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.

package Condicional;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double x, y, z;
		
		System.out.print("Digite tr�s n�meros diferentes \n");
		System.out.print("Digite o primeiro n�mero:");
		x = ler.nextDouble();
		System.out.print("Digite o segundo n�mero:");
		y = ler.nextDouble();
		System.out.print("Digite o terceiro n�mero:");
		z = ler.nextDouble();
		
		if(x<=y && x<=z && y<=z)
		{
			System.out.print("Ordem crescente: "+x+ " "+y+" "+z);
		}
		else if(x<=y && x<=z && z>=y)
		{
			System.out.print("Ordem crescente: "+x+ " "+z+" "+y);
		}
		else if(y<=x && y<=z && z<=x)
		{
			System.out.print("Ordem crescente: "+y+ " "+z+" "+y);
		}
		else if(y<=x && y<=z && z>=x)
		{
			System.out.print("Ordem crescente: "+y+ " "+x+" "+z);
		}
		else if(z<=x && z<=y && y<=x)
		{
			System.out.print("Ordem crescente: "+z+ " "+y+" "+x);
		}
		else if(z<=x && z<=y && x<=y)
		{
			System.out.print("Ordem crescente: "+z+ " "+x+" "+y);
		}
		
	}

}

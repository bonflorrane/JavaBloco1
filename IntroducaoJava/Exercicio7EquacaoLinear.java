package IntroducaoJava;

import java.util.Scanner;

public class Exercicio7EquacaoLinear {

	public static void main(String[] args)
	{
		double a, b, c, d, e, f, x, y;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Equação linear do tipo ax + by = c ");
		System.out.print("Defina o valor de a: ");
		a = ler.nextDouble();
		System.out.print("Defina o valor de b: ");
		b = ler.nextDouble();
		System.out.print("Defina o valor de c: ");
		c = ler.nextDouble();

		System.out.print("Equação linear do tipo dx + ey = f ");
		System.out.print("Defina o valor de d: ");
		d = ler.nextDouble();
		System.out.print("Defina o valor de e: ");
		e = ler.nextDouble();
		System.out.print("Defina o valor de f: ");
		f = ler.nextDouble();
		
		x = (((c*e) - (b*f))/((a*e) - (b*d)));
		y = (((a*f) - (c*d))/ ((a*e) -(b*d)));
		
		System.out.print("Os valores obtidos de x e y são: \nx: "+x+"\ny:"+y);
		
	}

}

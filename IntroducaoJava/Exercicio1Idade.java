package IntroducaoJava;

import java.util.Scanner;

public class Exercicio1Idade {

	public static void main(String[] args) 
	{
		int anos, meses, dias, var1, var2, var3;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Quantos anos você tem: ");
		anos = ler.nextInt();
		System.out.print("Insira a quantidade de meses: ");
		meses = ler.nextInt();
		System.out.print("Insira a quantidade de dias: ");
		dias = ler.nextInt();
		
		var1 = anos*365;
		var2 = meses*30;
		var3 = var1+var2+dias;
		
		System.out.print("Sua idade em dias é: "+var3);

	}

}

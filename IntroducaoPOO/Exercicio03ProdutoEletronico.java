package IntroducaoPOO;

import java.util.Scanner;

public class Exercicio03ProdutoEletronico {

	public static void main(String[] args) {
		
		double valor;//testando para pedir que o usu�rio entre com um valor.
		Scanner ler = new Scanner(System.in);
		
	ProdutoEletronico celular = new ProdutoEletronico("Roxa", "GEN", 3, 1500);
	
	System.out.println("Digite o pre�o que est� disposto a pagar pelo celular: ");
	valor = ler.nextDouble();
	celular.preco = valor;
	
	celular.estado();
	
	celular.faixa();
	

	}

}


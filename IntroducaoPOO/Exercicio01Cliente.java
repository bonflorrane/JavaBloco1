package IntroducaoPOO;

public class Exercicio01Cliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("L�o", "masculino", 25, "Amoreiras", 300.20);
		
				
		System.out.println("Nome: "+cliente1.nome);
		System.out.println("G�nero: "+cliente1.genero);
		System.out.println("Idade: "+cliente1.idade);
		System.out.println("Endere�o: "+cliente1.endereco);
		System.out.println("Valor de resgate do pr�mio: "+cliente1.valorResgate);
	

	}

}

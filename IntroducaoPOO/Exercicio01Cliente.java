package IntroducaoPOO;

public class Exercicio01Cliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Léo", "masculino", 25, "Amoreiras", 300.20);
		
				
		System.out.println("Nome: "+cliente1.nome);
		System.out.println("Gênero: "+cliente1.genero);
		System.out.println("Idade: "+cliente1.idade);
		System.out.println("Endereço: "+cliente1.endereco);
		System.out.println("Valor de resgate do prêmio: "+cliente1.valorResgate);
	

	}

}

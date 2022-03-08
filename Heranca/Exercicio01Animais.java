package Heranca;

public class Exercicio01Animais {

	public static void main(String[] args) {
		Animais a1 = new Animais();
		Cachorro dog1 = new Cachorro();
		Cavalo horse1 = new Cavalo();
		Preguica sloth1 = new Preguica();
		
		dog1.setNome("Mel");
		dog1.setIdade(10);
		dog1.setCorrer(true);
		dog1.acao();
		dog1.setSom("Au Au");
		dog1.estado();
		
		System.out.println();
		
		horse1.setNome("Alípio");
		horse1.setIdade(20);
		horse1.setCorrer(true);
		horse1.acao();
		horse1.setSom("Irim");
		horse1.estado();
		
		System.out.println();
		
		sloth1.setNome("Sid");
		sloth1.setIdade(12);
		sloth1.setSubir(true);
		sloth1.acao();
		sloth1.setSom("AaAaA");
		sloth1.estado();
				
		

	}

}

package Heranca;

public class Exercicio01Animais {

	public static void main(String[] args) {
		Animais a1 = new Animais();
		Cachorro dog1 = new Cachorro();
		Cavalo horse1 = new Cavalo();
		Preguica sloth1 = new Preguica();
		
		dog1.setNome("Mel");
		dog1.setIdade(10);
		dog1.setCorrer("Cachorro correndo");
		System.out.println(dog1.getCorrer());
		dog1.setSom("Au Au");
		dog1.estado();
		
		System.out.println();
		
		horse1.setNome("Alípio");
		horse1.setIdade(20);
		horse1.setCorrer("Cavalo correndo");
		System.out.println(horse1.getCorrer());
		horse1.setSom("Irim");
		horse1.estado();
		
		System.out.println();
		
		sloth1.setNome("Sid");
		sloth1.setIdade(12);
		sloth1.setSubir("Subindo em árvore");
		System.out.println(sloth1.getSubir());
		sloth1.setSom("AaAaA");
		sloth1.estado();
				
		

	}

}

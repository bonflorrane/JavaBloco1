package Heranca;

public class Exercicio01Animais {

	public static void main(String[] args) {
		
		Animais a1 = new Animais();
		Cachorro dog1 = new Cachorro();
		Cavalo horse1 = new Cavalo();
		Preguica sloth1 = new Preguica();
		
		
		a1.EmitirSom();
		dog1.setNome("Mel");
		dog1.setIdade(10);
		dog1.setCorrer("Cachorro correndo");
		//System.out.println(dog1.getCorrer());
		dog1.EmitirSom();
		//dog1.estado();
		
		System.out.println();
		
		horse1.setNome("Al�pio");
		horse1.setIdade(20);
		//horse1.setCorrer("Cavalo correndo");
		System.out.println(horse1.getCorrer());
		horse1.EmitirSom();
		//horse1.estado();
		
		System.out.println();
		
		sloth1.setNome("Sid");
		sloth1.setIdade(12);
		sloth1.setSubir("Subindo em �rvore");
		//System.out.println(sloth1.getSubir());
		sloth1.EmitirSom();
		//sloth1.estado();
				
		

	}

}

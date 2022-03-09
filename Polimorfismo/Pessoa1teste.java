package Polimorfismo;

public class Pessoa1teste {

	public static void main(String[] args) {
		
		Pessoa1Fisica fisica = new Pessoa1Fisica();
		fisica.setNome("Julia");
		fisica.setCPF(1112223334455L);
		Pessoa1Juridica juridica = new Pessoa1Juridica();
		juridica.setNome("João");
		juridica.setCNPJ(10001000010001002L);
		
		Pessoa1[] pessoas = new Pessoa1[2];
		pessoas[0]=fisica;
		pessoas[1]=juridica;
		
		for(Pessoa1 pessoa:pessoas)
		{
			System.out.println(pessoa.getNome());
		}
		
		
		
		

	}

}

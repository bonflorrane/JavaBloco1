/*
 1-	Crie uma hierarquia de classes conforme abaixo com os seguintes atributos
  e comportamentos (observe a tabela), utilize os seus conhecimentos e distribua
  as caracter�sticas de forma que tudo o que for comum a todos os animais fique na classe Animal: 
 */


package Heranca;

public class Animais {

	private String nome;
	private String som;
	private int idade;
	
	void estado()
	{
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
		System.out.println("Som emitido: "+this.som);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
	

	
/*
 1-	Crie uma hierarquia de classes conforme abaixo com os seguintes atributos 
  e comportamentos (observe a tabela), utilize os seus conhecimentos e distribua
  as caracter�sticas de forma que tudo o que for comum a todos os animais fique na classe Animal: 
  
  2- Atualiza��o:	Implemente um programa que crie os 3 tipos de animais definidos no exerc�cio anterior e
   invoque o m�todo que emite o som de cada um de forma polim�rfica, isto �, independente do tipo de animal.
 */


package Heranca;

public class Animais {

	private String nome;
	private String EmitirSom;
	private int idade;
	
	void estado()
	{
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
		System.out.println("Som emitido: "+this.EmitirSom);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void EmitirSom()
	{
		System.out.println("Som de Animais");
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
	

	
/*
 1-	Crie uma hierarquia de classes conforme abaixo com os seguintes atributos 
  e comportamentos (observe a tabela), utilize os seus conhecimentos e distribua
  as características de forma que tudo o que for comum a todos os animais fique na classe Animal: 
  
  2- Atualização:	Implemente um programa que crie os 3 tipos de animais definidos no exercício anterior e
   invoque o método que emite o som de cada um de forma polimórfica, isto é, independente do tipo de animal.
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
	

	
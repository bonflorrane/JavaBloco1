package Collections;

public class EstoqueExercicio03 {

	private String cor;
	private int quantidade;
	private String tamanho;
	
	public EstoqueExercicio03(String cor, int quantidade, String tamanho)
	{
	
		this.cor=cor;
		this.quantidade=quantidade;
		this.tamanho=tamanho;
	}
	

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public String toString()//para retornar os valores dos atributos
	{
		return "Cor: "+this.cor+" Tamanho: "+this.tamanho+" Quantidade: "+this.quantidade;
	}

	
	
}

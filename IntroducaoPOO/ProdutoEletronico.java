package IntroducaoPOO;

public class ProdutoEletronico {

	String cor;
	String marca;
	int duracaoBateria;
	double preco;
	
	public ProdutoEletronico (String c, String m, int diasBateria, double valor)
	
	{
		this.cor=c;
		this.marca=m;
		this.duracaoBateria=diasBateria;
		this.preco=valor;
		
		
	}
	
	void faixa()
	{
		if(this.preco<=1000)
		{
			System.out.println("Nesta faixa de preço você poderá comprar um aparelho da mesma qualidade "
					+ "que um Samsung Galaxy A12 ou Motorola Moto E7");
		}
		if(this.preco>1000 && this.preco<=2000)
		{
			System.out.println("Nesta faixa de preço você poderá comprar um aparelho da mesma qualidade "
					+ "que um Samsung Galaxy A21s ou Motorola Moto G60");
		}
		if(this.preco>2000 && this.preco<=5000)
		{
			System.out.println("Nesta faixa de preço você poderá comprar um aparelho da mesma qualidade "
					+ "que um ASUS ROG ou Xiomi Mi11");
		}
			
	}
	
	void estado()
	{
		System.out.println("Cor: "+this.cor);
		System.out.println("Marca: "+this.marca);
		System.out.println("Duração da bateria em dias: "+this.duracaoBateria);
		System.out.println("Preço: "+this.preco);
	
	}
}

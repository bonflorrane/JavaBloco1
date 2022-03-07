/*
 Crie uma classe patinete e apresente os atributos e métodos referentes esta classe,
 em seguida crie um objeto patinete, 
 defina as instancias deste objeto e apresente as informações deste objeto no console.
 */

package IntroducaoPOO;

public class Patinete {

	String cor;
	double larguraPlataforma, comprimentoPlataforma, diametroRodas, alturaGuiador;
	
	public Patinete(String color, double lP, double cP, double dR, double aG)
	{
		this.cor=color;
		this.larguraPlataforma=lP;
		this.comprimentoPlataforma=cP;
		this.diametroRodas=dR;
		this.alturaGuiador=aG;
		
		
	}
	
	void estado()
	{
		System.out.println("Cor: "+this.cor);
		System.out.println("Largura da Plataforma em cm: "+this.larguraPlataforma);
		System.out.println("Comprimento da Plataforma em cm: "+this.comprimentoPlataforma);
		System.out.println("Diâmtro das rodas em mm: "+this.diametroRodas);
		System.out.println("Altura adequada do usuário em cm: "+this.alturaGuiador);
		
	}
	
	
	
	
}

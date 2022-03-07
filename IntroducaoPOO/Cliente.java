/*1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, 
 em seguida crie um objeto cliente, defina as instancias deste objeto
 e apresente as informações deste objeto no console.
 */


package IntroducaoPOO;

public class Cliente 
{
	
	//atributo
	String nome;
	String genero;
	int idade;
	String endereco;
	double valorResgate;
	
	//metodo construtor
	public Cliente (String primeiroNome, String sexo, int anos, String rua, double premio)
	{
		this.nome = primeiroNome;
		this.genero=sexo;
		this.idade=anos;
		this.endereco=rua;
		this.valorResgate=premio;
	
	}
	
	
}

/*
 Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe,
 em seguida crie um objeto avi�o, defina as instancias deste objeto 
 e apresente as informa��es deste objeto no console.
 */


package IntroducaoPOO;

public class Aviao {
	
	String modelo;
	String cor;
	int velocidadeMax;
	double combustivelCapacidade;
	
	
	public Aviao (String M, String C, int vel, double combust)
	{
		
		this.modelo = M;
		this.cor = C;
		this.velocidadeMax=vel;
		this.combustivelCapacidade = combust;
		
	}
	

}
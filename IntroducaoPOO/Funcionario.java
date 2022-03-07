package IntroducaoPOO;

public class Funcionario {
	
	String nome;
	int idade;
	int codigoIdentificador;
	String turno;
	
	
	public Funcionario(String name, int age, int identifier, String shift)
	{
		this.nome=name;
		this.idade=age;
		this.codigoIdentificador=identifier;
		this.turno=shift;
		
	}
	
	void estado()
	{
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
		System.out.println("Código Identificador: "+this.codigoIdentificador);
		System.out.println("Turno: "+this.turno);
	
	}

}

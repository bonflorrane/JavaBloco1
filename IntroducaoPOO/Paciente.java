package IntroducaoPOO;

public class Paciente {
	
	String nomePaciente, nomeMedico;
	int idade, codigoDoenca;
	
	public Paciente(String paciente, String medico, int age, int identifier)
	{
		this.nomePaciente=paciente;
		this.nomeMedico=medico;
		this.idade=age;
		this.codigoDoenca=identifier;
	}
	void estado()
	{
		System.out.println("Nome do Paciente: "+this.nomePaciente);
		System.out.println("Idade do Paciente: "+this.idade);
		System.out.println("C�digo Identificador da Doen�a: "+this.codigoDoenca);
		System.out.println("Nome do m�dico(a) respond�vel: "+this.nomeMedico);
	}

}

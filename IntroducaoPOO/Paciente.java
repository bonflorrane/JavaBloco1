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
		System.out.println("Código Identificador da Doença: "+this.codigoDoenca);
		System.out.println("Nome do médico(a) respondável: "+this.nomeMedico);
	}

}

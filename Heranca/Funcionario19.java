package Heranca;

public class Funcionario19 extends PessoaExemploAula19 {
	
	private String departamento;
	
	public Funcionario19(String nome, int matricula, String departamento)
	{
		super(nome,matricula);
		this.departamento=departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	

}

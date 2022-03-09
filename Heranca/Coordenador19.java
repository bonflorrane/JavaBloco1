package Heranca;

public class Coordenador19 extends PessoaExemploAula19 {
	private String curso;
	
	public Coordenador19(String nome, int matricula, String curso)
	{
		super(nome,matricula);
		this.curso=curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	

}

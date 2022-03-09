package Heranca;

public class Teste19 {

	public static void main(String[] args) {
		PessoaExemploAula19 jessica = new PessoaExemploAula19("Jéssica", 555);
		Funcionario19 pedro = new Funcionario19("Pedro", 222, "TI");
		PessoaExemploAula19 maria = new Funcionario19("Maria", 333, "Informática -- Desenvolvimento");
		PessoaExemploAula19 jose = new Coordenador19("José",444,"CC");
		
		System.out.println(jessica.getMatricula());
		System.out.println(pedro.getDepartamento());
		System.out.println(maria.getMatricula());
		System.out.println(jose.getNome());

	}

}

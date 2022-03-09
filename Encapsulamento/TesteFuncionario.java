package Encapsulamento;

public class TesteFuncionario {

	public static void main(String[] args) {
		FuncionarioAula18 func = new FuncionarioAula18();
		func.setNome("Antônia");
		func.setSalario(2500);
		
		System.out.println(func.getNome());
		System.out.println(func.getSalario());
	}

}

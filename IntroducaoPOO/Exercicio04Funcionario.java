package IntroducaoPOO;

import java.util.Scanner;

public class Exercicio04Funcionario {

	public static void main(String[] args) {
		
		String name, horario;
		int idade, codigo;
		
		
		Scanner ler = new Scanner(System.in);
		
		Funcionario colaborador = new Funcionario("name", 0, 000000, "horario");
		
		System.out.println("Digite o nome do funcion�rio: ");
		name = ler.next();
		colaborador.nome=name;
		
		System.out.println("Digite  a idade do funcion�rio: ");
		idade = ler.nextInt();
		colaborador.idade=idade;
		
		System.out.println("Digite  o c�digo identificador do funcion�rio: ");
		codigo = ler.nextInt();
		colaborador.codigoIdentificador=idade;
		
		System.out.println("Digite o turno de trabalho do funcion�rio: ");
		horario = ler.next();
		colaborador.turno=horario;
			
		colaborador.estado();
		
		
		

	}

}



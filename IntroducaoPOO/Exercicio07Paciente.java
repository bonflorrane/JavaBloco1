package IntroducaoPOO;

import java.util.Scanner;

public class Exercicio07Paciente {

	public static void main(String[] args) {
		
		String nomePaciente, nomeMedico;
		int idade, codigoDoen�a;
		
		Paciente usuario = new Paciente(" ", " ", 0,0);
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o nome do(a) paciente: ");
		nomePaciente = ler.next();
		usuario.nomePaciente=nomePaciente;
		
		System.out.println("Digite o nome do(a) m�dico(a) respons�vel: ");
		nomeMedico = ler.next();
		usuario.nomePaciente=nomeMedico;
		
		System.out.println("Digite a idade do(a) paciente: ");
		idade= ler.nextInt();
		usuario.idade=idade;
		
		System.out.println("Digite o c�digo identificador da emfermidade do(a) paciente: ");
		codigoDoen�a=ler.nextInt();
		usuario.codigoDoenca=codigoDoen�a;
		
		usuario.estado();
		
		
		
		
	}

}

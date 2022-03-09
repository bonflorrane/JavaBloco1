package Interface;

public class TestaInterface {

	public static void main(String[] args) {
		
		ParticipanteForum participante = new ParticipanteForum();//cria o objeto
		Leitor leitor = participante;// instancia leitor
		System.out.println("O participante está lendo: "+leitor.lendo());
		Programador programador = participante;
		String java = "JAVA";
		programador.pensando(java.toCharArray());
		System.out.println(" E programando "+programador.digitando());
		

	}

}

package IntroducaoPOO;

public class ExemploAula16TesteCarro {

	public static void main(String[] args) {
		
		Carro meuCarro = new Carro();
		meuCarro.cor="Vermelho";
		meuCarro.modelo="Passat";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima=80;
		
		meuCarro.liga();
		
		meuCarro.acelera(20);
		
		System.out.println(meuCarro.velocidadeAtual);
		
		meuCarro.pegaMarcha();
		System.out.println(meuCarro.pegaMarcha());
		
	}

}
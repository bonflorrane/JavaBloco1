package IntroducaoPOO;

public class Pessoa {
	
	//atributos
	
	private String primeiroNome;
	private String ultimoNome;
	private String nomesDoMeio;
	
	//metodo construtor pessoa
	
	public Pessoa(String primeiro, String meio, String ultimo)
	{
		primeiroNome = primeiro;
		ultimoNome = ultimo;
		nomesDoMeio = meio;
	}
	
	// metodo nome completo
	
	public String getNomeCompleto()
	{
		String nomeCompleto = primeiroNome+" "+nomesDoMeio+" "+ultimoNome;
		return nomeCompleto;
	}

}

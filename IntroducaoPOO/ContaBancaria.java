package IntroducaoPOO;

public class ContaBancaria {
	
	String banco, nome, tipoConta;
	int agencia, conta;
	
	
	public ContaBancaria(String bank, String name, String type, int ag, int cont )
	{
		this.banco=bank;
		this.nome=name;
		this.tipoConta=type;
		this.agencia=ag;
		this.conta=cont;
	}
	
	void estado()
	{
		System.out.println("Nome do cliente: "+this.nome);
		System.out.println("Banco de prefer�ncia: "+this.banco);
		System.out.println("N�mero da conta: "+this.conta);
		System.out.println("N�mero da ag�ncia: "+this.agencia);
		System.out.println("Tipo da conta banc�ria: "+this.tipoConta);
	}
	
	
}


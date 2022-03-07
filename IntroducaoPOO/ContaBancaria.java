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
		System.out.println("Banco de preferência: "+this.banco);
		System.out.println("Número da conta: "+this.conta);
		System.out.println("Número da agência: "+this.agencia);
		System.out.println("Tipo da conta bancária: "+this.tipoConta);
	}
	
	
}


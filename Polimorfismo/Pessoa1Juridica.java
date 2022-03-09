package Polimorfismo;

public class Pessoa1Juridica extends Pessoa1 {
	private long CNPJ;

	public long getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(long cNPJ) {
		CNPJ = cNPJ;
	}
	public String getNome()
	{
		return "Pessoa Jurídica: "+super.getNome()+" - CPF: "+this.CNPJ;
	}

}

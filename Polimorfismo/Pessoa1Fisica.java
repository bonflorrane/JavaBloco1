package Polimorfismo;

public class Pessoa1Fisica extends Pessoa1 {
	
	private long CPF;

	public long getCPF() {
		return CPF;
	}

	public void setCPF(long cPF) {
		CPF = cPF;
	}
	public String getNome()
	{
		return "Pessoa f�sica: "+super.getNome()+" - CPF: "+this.getCPF();
	}
	

}

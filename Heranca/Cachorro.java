package Heranca;

public class Cachorro extends Animais {
	
	private String correr;
	


	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	@Override
	public void EmitirSom()
	{
		System.out.println("Latindo");
	}
	
	
	
}
	



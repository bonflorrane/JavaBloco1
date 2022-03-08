package Heranca;

public class Cachorro extends Animais {
	
	private boolean correr=true;
	
	void acao()	
	{
		System.out.println("Cachorro correndo");
	}

	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	

}

package Heranca;

public class Cavalo extends Animais {
	
	private boolean correr = true;
	void acao()	
	{
		System.out.println("Cavalo correndo");
	}
	public boolean isCorrer() {
		return correr;
	}
	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	


}

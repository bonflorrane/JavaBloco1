package Heranca;

public class Preguica extends Animais {
	
	private boolean subir=true;
	
	void acao()	
	{
		System.out.println("Preguiça subindo em árvore");
	}

	public boolean isSubir() {
		return subir;
	}

	public void setSubir(boolean subir) {
		this.subir = subir;
	}
	

}

//Polimorfismo de sobrecarga : mesmo método com assinaturas diferentes dentro da mesma classe

package Polimorfismo;

public class TesteSobrecargaAula {
	
	public void soma(int x, int y)
	{
		System.out.println(x+y);
	}
	public void soma(int x, int y, int z)
	{
		System.out.println(x+y+z);
	}
	public void soma(double x, double y)
	{
		System.out.println(x+y);
	}

}

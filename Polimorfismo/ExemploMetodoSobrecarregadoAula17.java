package Polimorfismo;

public class ExemploMetodoSobrecarregadoAula17
{
	
	public void estado()
	{
		System.out.printf("Sal�rio em n�mero inteiro: %d \n",salario(1000));
		System.out.printf("Sal�rio em n�mero double: %f  \n",salario(7.500));
	}
	
	public int salario(int valorInt)
	{
		System.out.printf("Sal�rio com argumentos inteiros: %d \n",valorInt);
		return valorInt *valorInt;
	}
	public double salario(double valorDouble)
	{
		System.out.printf("Sal�rio com argumentos inteiros: %f \n",valorDouble);
		return valorDouble *valorDouble;
	}


}

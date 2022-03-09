package Polimorfismo;

public class ExemploMetodoSobrecarregadoAula17
{
	
	public void estado()
	{
		System.out.printf("Salário em número inteiro: %d \n",salario(1000));
		System.out.printf("Salário em número double: %f  \n",salario(7.500));
	}
	
	public int salario(int valorInt)
	{
		System.out.printf("Salário com argumentos inteiros: %d \n",valorInt);
		return valorInt *valorInt;
	}
	public double salario(double valorDouble)
	{
		System.out.printf("Salário com argumentos inteiros: %f \n",valorDouble);
		return valorDouble *valorDouble;
	}


}

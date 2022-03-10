package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecoes {

	public static void main(String[] args) {
		
		Collection<String> nomes = new ArrayList();
		
		nomes.add("Mário");
		nomes.add("Maria");
		nomes.add("Juliana");
		nomes.add("Rafa");
		
		for(String name: nomes)//percorrendo a lista de nomes
		{
			System.out.println("Lista de nomes: "+name);
		}
		
		/*Collection<String> nomes2 = Arrays.asList("João", "Joana");// add um array em outro
		nomes.addAll(nomes2);
		System.out.println("Lista de nomes: "+nomes);*/
		
		
		/*System.out.println("Contém o nome Maria?:"+nomes.contains("Maria"));//verificação dos dados.
		System.out.println("Lista de nomes: "+nomes);*/
		
		
		
		/*System.out.println("Lista de nomes: "+nomes);
		nomes.clear();//limpando todas as posições.
		System.out.println("Lista de nomes: "+nomes);*/
		
		
		/*System.out.println("Lista de nomes: "+nomes);
		nomes.remove("Mário");//removendo uma posição em nomes
		System.out.println("Lista de nomes: "+nomes);*/
		
		
		
		/*if(nomes.isEmpty())// para verificar se a lista está vazia.
		{
			System.out.println("Lista vazia");
		}
		else 
		{
			System.out.println("Lista de nomes: "+nomes);
		}*/
		
		
		

	}

}

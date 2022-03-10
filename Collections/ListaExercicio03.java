/*
3-	Crie uma um programa para trabalhar com estoque de uma loja,
o programa deverá trabalhar com Collection do tipo List do Java 
para manipular os dados desse estoque, o programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.

 */

package Collections;

import java.util.ArrayList;
import java.util.List;


public class ListaExercicio03 {

	public static void main(String[] args) {
		
		
		
		EstoqueExercicio03 s1 = new EstoqueExercicio03("vermelha", 40, "P");
		EstoqueExercicio03 s2 = new EstoqueExercicio03("preta", 10, "G");
		EstoqueExercicio03 s3 = new EstoqueExercicio03("branca", 60, "M");
		ArrayList<EstoqueExercicio03>estoque = new ArrayList<>();
		
		System.out.println("Estoque de camisas");
		
		//Armazenar dados da List
		estoque.add(s1);
		estoque.add(s2);
		estoque.add(s3);
		
		System.out.println(estoque);
		
		//Removendo dados da List, posição 0.
		estoque.remove(0);
		System.out.println(estoque);
		
		//Atualizar dados da list
		estoque.set(1, s1);//atualizando a posição 1
		System.out.println(estoque);
		
		
		
	
	
		

		
		
		
		

	}

}

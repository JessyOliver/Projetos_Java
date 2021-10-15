package br.com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestaColletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declarando variavel 
		String aula1 = "BATMAN", aula2 = " SUPERMAN ", aula3 = "AQUAMAN";

		//declarando um array de lista
		ArrayList<String> aulas = new ArrayList<>();
		
		//adicionando variaveis ao array  list
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		//exibindo na tela
		System.out.println("=============EXIBINDO AULAS=================\\n");
		System.out.println(aulas);
		System.out.println();

		//removendo o objeto da posição 0
		aulas.remove(0);
		
		//exibindo na tela
		System.out.println("==============EXIBINDO COM UMA REMOVIDA================\\n");
		System.out.println(aulas);
		System.out.println();

		System.out.println("=============EXIBINDO DENTRO DO FOR=================\\n");
		//for each --> for evoluido
		for (String i: aulas) {
			
			System.out.println("Aulas: " + i);
			
		}
		System.out.println();

		//você pode usar uma variavel para receber o getcom a poção desejada
		String bloco3 = aulas.get(2);
		System.out.println("================EXIBINDO DE UMA VARIAVEL QUE RECEBEU GET==============\\n");
		System.out.println("A 3° aula é: " + bloco3);
		System.out.println();

		//ou não
		System.out.println("=============EXIBINDO DIRETO DO GET=================\\n");
		System.out.println("A 3° aula é: " + aulas.get(2));
		System.out.println();
		
		System.out.println("==============EXIBINDO POSIÇÃO DO ARRAY LIST ================\\n");
		for (int i = 0; i < aulas.size(); i++) {
			
			//exibindo o for da posição 0 ate o tamanho do array
			System.out.println("Aulas: " + aulas.get(i));
			
		}
		System.out.println();

		
		//EXIBINDO O TAMANHO DO ARRAY
		System.out.println("==============EXIBINDO O TAMANHO DO ARRAY LIST ================\\n");
		System.out.println("Aulas " + aulas.size());
		System.out.println();
		
		System.out.println("==============EXIBINDO POR ORDEM ALFABETICA DECRESCENTE================\\n");
		Collections.sort(aulas);
		System.out.println(aulas);
		System.out.println();
		
		System.out.println("==============EXIBINDO O ARRAY LIST EM ORDEM DE SORTEIO ================\\n");
		Collections.shuffle(aulas);
		System.out.println("Sorteio " + aulas);
		
		
		
		//fim void main
	}

}

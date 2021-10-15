package br.com.colletion2;

import java.util.ArrayList;

public class TestaAula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//criando objeto da classe aula
								//CONSTRUTOR DA CLASSE COMPLEO RECEBE OS VALORES
		Aula exibirAula1 = new Aula("Revisão Array", 60);

		Aula exibirAula2 = new Aula("Lista Objetos", 80);

		Aula exibirAula3 = new Aula("Relacionamento de Array", 190);
		
		//array de objetos
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(exibirAula1);
		aulas.add(exibirAula2);
		aulas.add(exibirAula3);

		System.out.println("===========EXIBINO ARRAY LIST DA CLASS AULA==============");
		System.out.println("Aula: " + aulas);
		
		

		
		
	}

}

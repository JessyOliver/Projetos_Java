package br.com.solletions3;

import java.util.ArrayList;
import java.util.Scanner;

public class ExibirAlunoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ativando scanner teclado
		Scanner leiaTeclado = new Scanner(System.in);
		
	//	AlunoFor auloPega = new AlunoFor(leiaTeclado.nextInt(), leiaTeclado.next());
		
		//iniciando o array
		ArrayList<AlunoFor> alunos = new ArrayList<>();
		
		//declarando variaveis para receber os dados digitados pelo usuario
		int numQuantAlunos, idadeAluno;
		String nomeAluno;
		
		System.out.println("Quantos alunos você quer adicionar: ");
		numQuantAlunos = leiaTeclado.nextInt();
		
		System.out.println();
		System.out.println("===========CADASTRANDO ALUNOS=========");
		System.out.println();
		
		for (int i = 0; i < numQuantAlunos; i++) {
			
			System.out.println("Idade:");
			idadeAluno = leiaTeclado.nextInt();

			//pulando linha
			leiaTeclado.nextLine();
			
			System.out.println("Nome:");
			nomeAluno = leiaTeclado.nextLine();
			
			//criando os objetos de acordo com o preenchimetno do usuario
			//e preenchendo o array
			alunos.add( new AlunoFor(idadeAluno, nomeAluno));
			
			
		}//fim for
		
		System.out.println();
		System.out.println("===========EXIBINDO ALUNOS CADASTRADOS=========");
		System.out.println();
		
		//exibindo o array preenchido
		for (AlunoFor i: alunos) {
			
			System.out.println(i);
			
		}
		
		//fexando o array
		leiaTeclado.close();
		
		
	}//fim void main

}//fim class

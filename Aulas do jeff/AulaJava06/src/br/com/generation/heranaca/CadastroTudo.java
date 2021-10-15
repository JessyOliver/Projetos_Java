package br.com.generation.heranaca;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class CadastroTudo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ATIVANDO SCANNER TECLADO		
		Scanner leiaTeclado = new Scanner(System.in);
		
		//importando class Professor
		Professor cadprofessor = new Professor();
		
		//importando class FuncionarioAdm
		FuncionarioAdm cadFuncionarioAdm = new FuncionarioAdm();
		
		//importando class Aluno
		Aluno cadAluno = new Aluno();


		
		System.out.println();
		System.out.println("------------------");
		System.out.println("CADASTRO PROFESSOR");
		System.out.println("------------------");
		
		System.out.println("Nome: ");
		cadprofessor.setNome(leiaTeclado.next());
		
		System.out.println("Idade:");
		cadprofessor.setIdade(leiaTeclado.nextInt());
		
		System.out.println("Endereço: ");
		cadprofessor.setEndereco(leiaTeclado.next());
		
		System.out.println("Salário: ");
		cadprofessor.setSalario(leiaTeclado.nextDouble());
		
		System.out.println("Disciplina: ");
		cadprofessor.setDisciplina(leiaTeclado.next());
				
		System.out.println();

		System.out.println("-----------------------------------");
		System.out.println("CADASTRO FUNCIONÁRIO ADMINISTRATIVO");
		System.out.println("-----------------------------------");
		
		System.out.println("Nome: ");
		cadFuncionarioAdm.setNome(leiaTeclado.next());
		
		System.out.println("Idade:");
		cadFuncionarioAdm.setIdade(leiaTeclado.nextInt());

		System.out.println("Endereço: ");
		cadFuncionarioAdm.setEndereco(leiaTeclado.next());
		
		System.out.println("Setor: ");
		cadFuncionarioAdm.setSetor(leiaTeclado.next());
		
		System.out.println("Função: ");
		cadFuncionarioAdm.setFuncao(leiaTeclado.next());
		
		System.out.println();

		System.out.println("--------------");
		System.out.println("CADASTRO ALUNO");
		System.out.println("--------------");
		
		System.out.println("Nome: ");
		cadAluno.setNome(leiaTeclado.next());
		
		System.out.println("Idade:");
		cadAluno.setIdade(leiaTeclado.nextInt());
		
		System.out.println("Endereço: ");
		cadAluno.setEndereco(leiaTeclado.next());
		
		System.out.println("Semestre:");
		cadAluno.setSemestre(leiaTeclado.next());
		
		System.out.println("Curso: ");
		cadAluno.setCurso(leiaTeclado.next());
		
		System.out.println();
		//exibindo dadados coletados
		System.out.println("------------------");
		System.out.println("EXIBINDO PROFESSOR");
		System.out.println("------------------");
		
		System.out.println("Nome: " + cadprofessor.getNome());
		
		System.out.println("Idade:" + cadprofessor.getIdade());
		
		System.out.println("Endereço: " + cadprofessor.getEndereco());
		
		System.out.println("Salário: " + cadprofessor.getSalario());
		
		System.out.println("Disciplina: " + cadprofessor.getDisciplina());
		
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println("EXIBINDO FUNCIONÁRIO ADMINISTRATIVO");
		System.out.println("-----------------------------------");
		
		System.out.println("Nome: " + cadFuncionarioAdm.getNome());
		
		System.out.println("Idade:" + cadFuncionarioAdm.getIdade());
		
		System.out.println("Endereço: " + cadFuncionarioAdm.getEndereco());
		
		System.out.println("Setor: " + cadFuncionarioAdm.getSetor());
		
		System.out.println("Função: " + cadFuncionarioAdm.getFuncao());
		
		System.out.println();	
		System.out.println("--------------");
		System.out.println("EXIBINDO ALUNO");
		System.out.println("--------------");
		
		System.out.println("Nome: " + cadAluno.getNome());
		
		System.out.println("Idade:" + cadAluno.getIdade());
		
		System.out.println("Endereço: " + cadAluno.getEndereco());
		
		System.out.println("Semestre:" + cadAluno.getSemestre());
		
		System.out.println("Curso: " + cadAluno.getCurso());
		
		
	//fim programa	
	}

}

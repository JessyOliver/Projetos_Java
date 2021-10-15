package br.com.generation.classes;

public class TesteAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instancia -- Criação do objeto
		
		Aluno aluno1 = new Aluno();
		
		//adicionando valores aos atributos da class Aluno
		aluno1.nome = "João";
		aluno1.curso = "Curso Java";
		aluno1.idade = 34;
		
		//chamando metodos da class Aluno
		aluno1.assistirAula();
		aluno1.fazerAtividade();
		aluno1.fazerProva();

		System.out.println();
		//exibindo os dados coletados
		System.out.println("Nome: " + aluno1.nome);
		System.out.println("Idade: " + aluno1.idade);
		System.out.println("Curso: " + aluno1.curso);

		
		
	//fim public static void main
	}

}

package br.com.generation.heranaca;

public class Professor extends Funcionario { //professor esta herdando os dados da class Funcionario
	
	private String disciplina;
	
	
	///construtor vazio
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	//construtor completo
	public Professor(String disciplina) {
		super();
		this.disciplina = disciplina;
	}

	
	//gets e sets
	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	

}

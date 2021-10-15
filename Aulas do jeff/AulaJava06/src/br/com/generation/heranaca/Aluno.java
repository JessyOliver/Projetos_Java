package br.com.generation.heranaca;

public class Aluno extends Pessoa{ //aluno esta herdando os dados da class pessoa
	
	private String semestre, curso;
	
	
	

	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aluno(String semestre, String curso) {
		super();
		this.semestre = semestre;
		this.curso = curso;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	

}

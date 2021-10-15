package br.com.generation.heranaca;

public class FuncionarioAdm extends Funcionario{ //FuncionarioAdm esta herdando os dados da class Funcionario

	private String setor, funcao;
	

	//CONSTRUTOR VAZIO
	public FuncionarioAdm() {
		super();
		// TODO Auto-generated constructor stub
	}

	//CONTRUTOR COMPLETO
	public FuncionarioAdm(String setor, String funcao) {
		super();
		this.setor = setor;
		this.funcao = funcao;
	}

	//GETS SETS
	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	
	
	
	
}

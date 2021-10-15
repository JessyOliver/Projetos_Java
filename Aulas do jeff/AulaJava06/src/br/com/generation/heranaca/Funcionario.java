package br.com.generation.heranaca;

public class Funcionario extends Pessoa {
	//funcionario esta herdando os dados da class pessoa	
	private double salario;

	//construtor vazio
	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}

	//construtor completo
	public Funcionario(double salario) {
		super();
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}

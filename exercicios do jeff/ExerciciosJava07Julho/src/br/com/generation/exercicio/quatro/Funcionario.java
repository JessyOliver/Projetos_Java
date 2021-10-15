package br.com.generation.exercicio.quatro;

public class Funcionario {
	
	
	/*4) Crie uma classe funcionário e apresente os atributos e métodos referentes esta 
	 * classe, em seguida crie um objeto funcionário, defina as instancias deste objeto
	 *  e apresente as informações deste objeto no console.*/
	
	//atributo
	String nomeCompleto, dataNascimento,  rua, bairro, cidade, estado, cep, cargo;
	
	int cpf, rg;
	double salario;
	
	
	
	//construtor vazio
	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}


	///construtor completo
	public Funcionario(String nomeCompleto, String dataNascimento, String rua, String bairro, String cidade,
			String estado, String cep, String cargo, int cpf, int rg, double salario) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.cargo = cargo;
		this.cpf = cpf;
		this.rg = rg;
		this.salario = salario;
	}



	//metodos gets e sets
	public String getNomeCompleto() {
		return nomeCompleto;
	}



	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}



	public String getDataNascimento() {
		return dataNascimento;
	}



	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}



	public String getRua() {
		return rua;
	}



	public void setRua(String rua) {
		this.rua = rua;
	}



	public String getBairro() {
		return bairro;
	}



	public void setBairro(String bairro) {
		this.bairro = bairro;
	}



	public String getCidade() {
		return cidade;
	}



	public void setCidade(String cidade) {
		this.cidade = cidade;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public String getCep() {
		return cep;
	}



	public void setCep(String cep) {
		this.cep = cep;
	}



	public String getCargo() {
		return cargo;
	}



	public void setCargo(String cargo) {
		this.cargo = cargo;
	}



	public int getCpf() {
		return cpf;
	}



	public void setCpf(int cpf) {
		this.cpf = cpf;
	}



	public int getRg() {
		return rg;
	}



	public void setRg(int rg) {
		this.rg = rg;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}



	
	
	
	
	

}

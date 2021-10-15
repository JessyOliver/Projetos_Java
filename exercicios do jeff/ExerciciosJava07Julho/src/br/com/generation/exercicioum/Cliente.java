package br.com.generation.exercicioum;

public class Cliente {
	
	/*
		1) Crie uma classe cliente e apresente os atributos e m�todos referentes esta classe,
		 em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as
		  informa��es deste objeto no console.
	 */
	
	String nome, dataNascimento, endere�o, cidade, estado, telefone, email;
	
	int idade;

	//construtor vazio
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	//contrutor completo
	public Cliente(String nome, String dataNascimento, String endere�o, String cidade, String estado, String telefone,
			String email, int idade) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endere�o = endere�o;
		this.cidade = cidade;
		this.estado = estado;
		this.telefone = telefone;
		this.email = email;
		this.idade = idade;
	}

	//criando get e set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	

}

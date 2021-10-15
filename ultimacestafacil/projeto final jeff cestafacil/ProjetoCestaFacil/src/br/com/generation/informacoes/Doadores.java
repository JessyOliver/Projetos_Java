package br.com.generation.informacoes;

public class Doadores extends Pessoa {
	
	//atributos da class
	private String  nomeEmpresa, endereco, numLocal,  bairro, cidade, estado, cep, email, senha, senhaConfrim, celular, telefone;

	


	//construtores
	public Doadores() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doadores(String nomeEmpresa, String endereco, String numLocal, String bairro, String cidade, String estado,
			String cep, String email, String senha, String senhaConfrim, String celular, String telefone) {
		super();
		this.nomeEmpresa = nomeEmpresa;
		this.endereco = endereco;
		this.numLocal = numLocal;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.email = email;
		this.senha = senha;
		this.senhaConfrim = senhaConfrim;
		this.celular = celular;
		this.telefone = telefone;
	}


	//gets e sets
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumLocal() {
		return numLocal;
	}

	public void setNumLocal(String numLocal) {
		this.numLocal = numLocal;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	public String getSenhaConfrim() {
		return senhaConfrim;
	}

	public void setSenhaConfrim(String senhaConfrim) {
		this.senhaConfrim = senhaConfrim;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	
	

}

package br.com.generation.heranaca;

public class Pessoa {
	
	private String nome, endereco;
	private int idade;
	
	
	//construtor Vazio
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//construtor completo
	public Pessoa(String nome, String endereco, int idade) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
	}
	
	//gets e sets
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
}

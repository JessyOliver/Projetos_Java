package br.com.generation.exerciciojava.herança;

public class Animal {
	
	private String nome, emitirSom;
	private int idade;
	
	//construtor completo
	public Animal(String nome, String emitirSom, int idade) {
		super();
		this.nome = nome;
		this.emitirSom = emitirSom;
		this.idade = idade;
	}
	
	//construtor vazio
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	//get set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmitirSom() {
		return emitirSom;
	}
	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}

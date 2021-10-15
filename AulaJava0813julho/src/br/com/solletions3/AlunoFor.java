package br.com.solletions3;

public class AlunoFor {

	//declarando atributos
	private int idade;
	private String nome;
	
	
	///construtor completo
	public AlunoFor(int idade, String nome) {
		super();
		this.idade = idade;
		this.nome = nome;
	}
	
	//vazio
	public AlunoFor() {
		super();
		// TODO Auto-generated constructor stub
	}


	//gets e sets
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		
		return "Nome: " + this.nome + "\t Idade: " + this.idade + "\n";
		
	}
	
	
}

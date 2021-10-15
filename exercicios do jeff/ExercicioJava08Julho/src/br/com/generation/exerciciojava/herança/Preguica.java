package br.com.generation.exerciciojava.herança;

public class Preguica extends Animal{
	
	private String sobeArvore;
	
	void SubArvore() {
		
		System.out.println("Subindo na arvore.....");
	}
	
	//get set
	
	public String getSobeArvore() {
		return sobeArvore;
	}

	public void setSobeArvore(String sobeArvore) {
		this.sobeArvore = sobeArvore;
	}
	
	//construtores
	public Preguica(String sobeArvore) {
		super();
		this.sobeArvore = sobeArvore;
	}

	public Preguica() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}

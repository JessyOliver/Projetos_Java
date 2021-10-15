package br.com.generation.exerciciojava.herança;

public class Cachorro extends Animal {
	
	private String corre, caca;

	//metodos
	void dogCorre() {
		
		System.out.println("Cachorro correndo....");
	}
	
	void dogCacando() {
		
		System.out.println("Cachorro caçando....e farejando...");
	}
	
	//get e set
	public String getCorre() {
		return corre;
	}

	public void setCorre(String corre) {
		this.corre = corre;
	}

	public String getCaca() {
		return caca;
	}

	public void setCaca(String caca) {
		this.caca = caca;
	}

	///construtores
	public Cachorro(String corre, String caca) {
		super();
		this.corre = corre;
		this.caca = caca;
	}

	public Cachorro() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

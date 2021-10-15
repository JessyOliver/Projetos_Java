package br.com.generation.exerciciojava.herança;


public class Cavalo extends Animal {

	String corre,  trotar, galopar;
	
	
	//metodos 
	void cavCorre() {
		
		System.out.println("Cavalo correndo...");
	}
	
	void cavTrota() {
		
		System.out.println("Cavalo trotando...");
	}
	
	void cavGalopa() {
		
		System.out.println("Cavalo Galopando...");
	}
	
	//construtores
	public Cavalo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cavalo(String corre,  String trotar, String galopar) {
		super();
		this.corre = corre;
		this.trotar = trotar;
		this.galopar = galopar;
	}

	
	//get set
	public String getCorre() {
		return corre;
	}

	public void setCorre(String corre) {
		this.corre = corre;
	}

	public String getTrotar() {
		return trotar;
	}

	public void setTrotar(String trotar) {
		this.trotar = trotar;
	}

	public String getGalopar() {
		return galopar;
	}

	public void setGalopar(String galopar) {
		this.galopar = galopar;
	}
	
	
}

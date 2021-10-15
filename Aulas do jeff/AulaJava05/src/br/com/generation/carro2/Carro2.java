package br.com.generation.carro2;

public class Carro2 {
	
	//atributo privado
	private String marca;
	private String modelo;
	private int numeroPassageiro;
	private double capacidadeCombustivel;
	
	//griando construtores preenchido
	//passando parametros
	public Carro2(String marca, String modelo, int numeroPassageiro, double capacidadeCombustivel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numeroPassageiro = numeroPassageiro;
		this.capacidadeCombustivel = capacidadeCombustivel;
	}
	//construtor vazio
	public Carro2() {
		// TODO Auto-generated constructor stub
	}



	//metodos get e set
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumeroPassageiro() {
		return numeroPassageiro;
	}
	public void setNumeroPassageiro(int numeroPassageiro) {
		this.numeroPassageiro = numeroPassageiro;
	}
	public double getCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}
	public void setCapacidadeCombustivel(double capacidadeCombustivel) {
		this.capacidadeCombustivel = capacidadeCombustivel;
	}
	
	//fim get e set
	

}

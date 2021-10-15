package br.com.generation.carro;

public class Carro {
	
	String nome, marca;
	int ano, placa, velocidade;
	
	void liga(){
		
		System.out.println("Ligando carro");
	}
	
	void acelera(int aceleracao){
		
		velocidade += aceleracao;
		
		System.out.println("Acelerando carro " + velocidade);
	}
	
	void frear(int reduzir) {
		
		velocidade -= reduzir;
		
		System.out.println("Freando carro " + reduzir);
	}
	
	

}

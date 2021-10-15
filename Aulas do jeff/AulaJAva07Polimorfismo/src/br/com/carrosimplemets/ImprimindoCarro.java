package br.com.carrosimplemets;

public class ImprimindoCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//pode criar atravez da classe Carro
		
		//pois o objeto car vem da class Carro
		Carro car = new Ferrari();
		
		car.acelerar();
		
		System.out.println();
		
		car = new Fusca();
		
		car.acelerar();

	}

}

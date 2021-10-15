package br.com.generation.carro2;

public class TestaCarro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//estanciando carro
		Carro2 carroObj = new Carro2();
		
		//modificando os daods da classe Carro2
		carroObj.setMarca("Fiat");
		carroObj.setModelo(" Tipo ");
		carroObj.setNumeroPassageiro(5);
		carroObj.setCapacidadeCombustivel(50);
		
		
		//imprimindo os dados que estão no get
		System.out.println("Marca: " + carroObj.getMarca());
		System.out.println("Modelo: " + carroObj.getModelo());
		System.out.println("Numero passageiros: " + carroObj.getNumeroPassageiro());
		System.out.println("Combustivel limite: " + carroObj.getCapacidadeCombustivel());


		
		
	//fim programa	
	}

}

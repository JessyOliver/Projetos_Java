package br.com.interfaces;

public class TestaInterfaceAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorro dog = new Cachorro();
		dog.somAnimal();
		dog.dormirAnimal();
		
		System.out.println();
		
		Gato cat = new Gato();
		cat.somAnimal();
		cat.dormirAnimal();
	}

}

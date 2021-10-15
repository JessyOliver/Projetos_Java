package br.com.polimorfismo2;

public class ImprimirAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestaAnimal testAni = new TestaAnimal();
		
		testAni.fazerAnimalComer(new Tigre());		
		
		//System.out.println("Digite idade:");
		
		testAni.fazerAnimalComer(new Cachorro());
		
		//por ser uma class abstrata ela não pode ser acessada
		//testAni.fazerAnimalComer(new Animal());

	}

}

package br.com.generation.exerciciojava.heran�a;

import java.util.Scanner;

public class ExibindoAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//teclado
		Scanner leiaTeclado = new Scanner(System.in);
		
		//Class Cachorro
		Cachorro cadDog = new Cachorro();
		
		//class Cavalo
		Cavalo cadCavalo = new Cavalo();
		
		//class Pregui�a
		Preguica cadPreguica = new Preguica();
		
		System.out.println("----------------");
		System.out.println("CADASTRA CACHORRO");
		System.out.println("----------------");

		//cadastro cachorro
		System.out.println("Nome: ");
		cadDog.setNome(leiaTeclado.next());
						
		System.out.println("Idade: ");
		cadDog.setIdade(leiaTeclado.nextInt());		
		
		System.out.println();
		System.out.println("----------------");
		System.out.println("CADASTRA CAVALO");
		System.out.println("----------------");
		
		//cadastro cavalo
		System.out.println("Nome: ");
		cadCavalo.setNome(leiaTeclado.next());
		
		System.out.println("Idade: ");
		cadCavalo.setIdade(leiaTeclado.nextInt());
		
		System.out.println();
		System.out.println("-----------------");
		System.out.println("CADASTRA PREGUI�A");
		System.out.println("-----------------");
		
		//cadastro pregui�a
		System.out.println("Nome: ");
		cadPreguica.setNome(leiaTeclado.next());
		
		System.out.println("Idade: ");
		cadPreguica.setIdade(leiaTeclado.nextInt());
		
		System.out.println("----------------");
		System.out.println("EXIBE CACHORRO");
		System.out.println("----------------");

		//cadastro cachorro
		System.out.println("Nome: " + cadDog.getNome());
		System.out.println("Idade: " + cadDog.getIdade());
		cadDog.dogCorre();
		cadDog.dogCacando();
		
		
		System.out.println("----------------");
		System.out.println("EXIBE CAVALO");
		System.out.println("----------------");
		
		//cadastro cavalo
		System.out.println("Nome: " + cadCavalo.getNome());
		System.out.println("Idade: " + cadCavalo.getIdade());
		cadCavalo.cavCorre();
		cadCavalo.cavGalopa();
		cadCavalo.cavTrota();
		
		System.out.println("-----------------");
		System.out.println("EXIBE PREGUI�A");
		System.out.println("-----------------");
		
		//cadastro pregui�a
		System.out.println("Nome: " + cadPreguica.getNome());
		System.out.println("Idade: " + cadPreguica.getIdade());
		cadPreguica.SubArvore();

		
	}

}

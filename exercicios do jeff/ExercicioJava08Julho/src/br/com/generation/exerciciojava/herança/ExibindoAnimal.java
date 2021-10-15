package br.com.generation.exerciciojava.herança;

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
		
		//class Preguiça
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
		System.out.println("CADASTRA PREGUIÇA");
		System.out.println("-----------------");
		
		//cadastro preguiça
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
		System.out.println("EXIBE PREGUIÇA");
		System.out.println("-----------------");
		
		//cadastro preguiça
		System.out.println("Nome: " + cadPreguica.getNome());
		System.out.println("Idade: " + cadPreguica.getIdade());
		cadPreguica.SubArvore();

		
	}

}

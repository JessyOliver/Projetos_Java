package br.com.polimorinterface;

import java.util.Scanner;

public class Cavalo implements Animal{

	@Override
	public void cadAni() {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nome;
		int idade;
		
		System.out.println("Nome: ");
		nome = teclado.next();
		
		
		System.out.println("Idade: ");
		idade = teclado.nextInt();
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		
		
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Som:   Hiin in in " );
		
		
	}

	@Override
	public void correr() {
		// TODO Auto-generated method stub
		
		System.out.println("Cavalo correndo........" );

		
	}

	@Override
	public void subirArvore() {
		// TODO Auto-generated method stub
		System.out.println("Cavalo não sobe em árvores........" );
		
	}
	
	
}

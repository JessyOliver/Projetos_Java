package br.com.polimorinterface;

import java.util.Scanner;

public class Preguica implements Animal{

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
		System.out.println("Som:   somente se estiver em perigo " );
		
		
	}

	@Override
	public void correr() {
		// TODO Auto-generated method stub
		
		System.out.println("Preguiça não corre.....ela dorme..." );

		
	}

	@Override
	public void subirArvore() {
		// TODO Auto-generated method stub
		System.out.println("Preguiça sobe em árvores....dorme..se pendura.." );
		
	}
}

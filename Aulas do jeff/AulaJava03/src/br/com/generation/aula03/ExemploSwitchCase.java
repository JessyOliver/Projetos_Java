package br.com.generation.aula03;

import java.util.Scanner;

public class ExemploSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ativando o teclado scanner
		Scanner leiaTeclado = new Scanner(System.in);
		
		//declarando variavel
		String letra;
		
		//mensagem ao usuario e recebendo dado
		System.out.println("Escreva uma letra, entre a e b: ");
		letra = leiaTeclado.nextLine();
		
		switch (letra) {
		//caso digite a o case exibirá essa frase
		case "a":
			
			System.out.println("Abacate");	
			
			break;
			
			//caso digite b o case exibirá essa frase
		case "b":
			
			System.out.println("Banana");
			
			break;

			
		default:
			
			System.out.println("Letra Inválida");
			
			break;
		}
		
		
		
		
	//fim public static void main	
	}

}

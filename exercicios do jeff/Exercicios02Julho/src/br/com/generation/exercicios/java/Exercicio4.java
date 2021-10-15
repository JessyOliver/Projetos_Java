package br.com.generation.exercicios.java;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 	4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
				número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
				ímpar exiba o número elevado ao quadrado.
		 */
		
		//ativando scanner teclado
		Scanner leiaTeclado = new Scanner(System.in);
		
		//declarando variavel
		double numero;
		
		//recebendo o valor do teclado
		System.out.println("Digite um valor: ");
		numero = leiaTeclado.nextDouble();
		
		//verificando se o valor é par 
		if (numero % 2 == 0) {
			
			System.out.println("\n " + numero + " PAR ");
			
			//calculando a raiz quadrada do valor
			System.out.println("Raiz quadrada = " + Math.sqrt(numero) );
			
		}
		//se for impar
		else {
			
			System.out.println("\n " + numero + " IMPAR ");
			
			//elevando ao quadrado
			System.out.println("("+ numero + ")² = " + Math.pow(numero, 2));

		}
		
		
	//fim programa
	}

}
